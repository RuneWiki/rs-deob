package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("db")
public class class115 {

    @ObfuscatedName("db.l")
    public static final String[][] field2018 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("db.g")
    public static final String[] field2016 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("db.r")
    public static Calendar field2015;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2015 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.l(J)Ljava/lang/String;")
    public static String method769(long arg0) {
        field2015.setTime(new Date(arg0));
        int var2 = field2015.get(7);
        int var3 = field2015.get(5);
        int var4 = field2015.get(2);
        int var5 = field2015.get(1);
        int var6 = field2015.get(11);
        int var7 = field2015.get(12);
        int var8 = field2015.get(13);
        return field2016[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2018[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
