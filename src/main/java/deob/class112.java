package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dl")
public class class112 {

    @ObfuscatedName("dl.b")
    public static final String[][] field1942 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dl.g")
    public static final String[] field1940 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dl.j")
    public static Calendar field1941;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1941 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.b(J)Ljava/lang/String;")
    public static String method1776(long arg0) {
        field1941.setTime(new Date(arg0));
        int var2 = field1941.get(7);
        int var3 = field1941.get(5);
        int var4 = field1941.get(2);
        int var5 = field1941.get(1);
        int var6 = field1941.get(11);
        int var7 = field1941.get(12);
        int var8 = field1941.get(13);
        return field1940[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1942[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
