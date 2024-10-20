package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("df")
public class class111 {

    @ObfuscatedName("df.h")
    public static final String[][] field1937 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("df.m")
    public static final String[] field1938 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("df.i")
    public static Calendar field1939;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1939 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.h(J)Ljava/lang/String;")
    public static String method2011(long arg0) {
        field1939.setTime(new Date(arg0));
        int var2 = field1939.get(7);
        int var3 = field1939.get(5);
        int var4 = field1939.get(2);
        int var5 = field1939.get(1);
        int var6 = field1939.get(11);
        int var7 = field1939.get(12);
        int var8 = field1939.get(13);
        return field1938[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1937[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
