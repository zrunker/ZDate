package cc.ibooker.zdate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Calendar;
import java.util.Date;

import cc.ibooker.zdatelib.DateUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取当前时间戳
        long ctimeMillis = DateUtil.getCurrentTimeMillis();
        Log.d("Log111", ctimeMillis + "");

        // 获取当前日期yyyy-MM-dd
        String cDate = DateUtil.getCurrentDate();
        Log.d("Log1112", cDate);

        // 获取day天前的日期yyyy-MM-dd
        String dayBeforeDate = DateUtil.getDayBeforeDate(10);
        Log.d("Log1113", dayBeforeDate);

        // 获取day天前的日期时间yyyyMMddHHmmss
        String dayBeforeDateTimeMillis = DateUtil.getDayBeforeDateTimeMillis(10);
        Log.d("Log1114", dayBeforeDateTimeMillis);

        // 获取格式化day天前的日期时间
        String dayBeforeFormatDateTime = DateUtil.getDayBeforeFormatDateTime(10, DateUtil.Format_DateTime);
        Log.d("Log1115", dayBeforeFormatDateTime);

        // 格式化当前日期
        String cFormatDate = DateUtil.getCurrentFormatDate(DateUtil.Format_DateTime);
        Log.d("Log1116", cFormatDate);

        // 获取当前时间HH:mm:ss
        String cTime = DateUtil.getCurrentTime();
        Log.d("Log1117", cTime);

        // 格式化当前日期时间
        String cFormatTime = DateUtil.getFormatCurrentDateTime("mm:dd");
        Log.d("Log1118", cFormatTime);

        // 格式化日期
        String formatDate = DateUtil.formatDate(new Date(1499829920804L), DateUtil.Format_DateTime);
        Log.d("Log1119", formatDate);

        // 获取当前日期时间
        String cDateTime = DateUtil.getCurrentDateTime();
        Log.d("Log11110", cDateTime);

        // 格式化字符串为日期格式yyyy-MM-dd HH:mm:ss
        Date dateTime = DateUtil.parseDateTime("2017-07-12 11:34:57");
        Log.d("Log11111", dateTime != null ? dateTime.toString() : null);

        // 自定义字符串转换日期格式
        Date formatDate1 = DateUtil.parseFormatDate("2017-07-12 11:34:57", DateUtil.Format_Date);
        Log.d("Log11112", formatDate1 != null ? formatDate1.toString() : null);

        // 将字符串转化成日期格式yyyy-MM-dd
        Date date = DateUtil.parseDate("2017-07-12 11:34:57");
        Log.d("Log11113", date != null ? date.toString() : null);

        // 获取当前中文日期时间
        String cDateTimeCN = DateUtil.getCurrentDateTimeCN();
        Log.d("Log11114", cDateTimeCN);

        // 获取当前中文日期
        String cDateCN = DateUtil.getCurrentDateCN();
        Log.d("Log11115", cDateCN);

        // 获取当前中文时间
        String cTimeCN = DateUtil.getCurrentTimeCN();
        Log.d("Log11116", cTimeCN);

        // 获取当前年份
        int year = DateUtil.getCurrentYear();
        Log.d("Log11117", year + "");

        // 获取当前月份
        int month = DateUtil.getCurrentMonth();
        Log.d("Log11118", month + "");

        // 获取当前日
        int day = DateUtil.getCurrentDay();
        Log.d("Log11119", day + "");

        // 字符串日期格式转换成日期格式
        String dateTime2 = DateUtil.getStrToDateTime("2017-07-12 12:52:49");
        Log.d("Log11120", dateTime2);

        // 字符串转换成中文日期时间
        String formatDateTimeCN = DateUtil.getFormatDateTimeCN("19740306020100");
        Log.d("Log11121", formatDateTimeCN);

        // 将字符串转换成日期时间
        String formatDateTime = DateUtil.getFormatDateTime("19740306020100");
        Log.d("Log11122", formatDateTime);

        // 将字符串转换成中文日期
        String formatDate3 = DateUtil.getFormatDateCN("19740306");
        Log.d("Log11123", formatDate3);

        // 将字符串转换成中文日期
        String formatDate4 = DateUtil.getFormatDate("19740306");
        Log.d("Log11124", formatDate4);

        // 两个时间之间相差距离多少天
        long days = DateUtil.getDistanceDays("1974-03-06 02:01:00", "2017-07-02");
        Log.d("Log11125", days + "");

        // 两个时间相差距离多少天多少小时多少分多少秒
        long[] dateTimeLong = DateUtil.getDistanceDateTimeLong("1974-03-06 02:01:00", "2017-07-02 00:30:21");
        Log.d("Log11126", dateTimeLong[0] + "-" + dateTimeLong[1] + "-" + dateTimeLong[2] + "-" + dateTimeLong[3]);

        // 两个时间相差距离多少天多少小时多少分多少秒
        String dateTimeCN1 = DateUtil.getDistanceDateTimeCN("1974-03-06 02:01:00", "2017-07-02 00:30:21");
        Log.d("Log11127", dateTimeCN1);

        // 将字符串格式化成日历
        Calendar calendar = DateUtil.strToCalendar("1974-03-06", DateUtil.Format_Date);
        Log.d("Log11128", calendar != null ? calendar.toString() : null);

        // 格式化日期字符串，yyyy-MM-dd格式为MM-dd
        String DateStr = DateUtil.formatDateStrBySplit("1974-03-06");
        Log.d("Log11129", DateStr);

        // 格式化时间字符串，HH:mm:ss格式为HH:mm
        String TimeStr = DateUtil.formatTimeStrBySplit("02:01:00");
        Log.d("Log11130", TimeStr);

        // 整数(秒数)转换为时分秒格式(xx时xx分xx秒)
        String secToTime = DateUtil.secToTime(523165);
        Log.d("Log11131", secToTime);
    }
}
