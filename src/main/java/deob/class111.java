package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dn")
public class class111 {

    @ObfuscatedName("dn.c")
    public static final String[][] field1915 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dn.h")
    public static final String[] field1919 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dn.k")
    public static Calendar field1914;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1914 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.c(J)Ljava/lang/String;")
    public static String method1048(long arg0) {
        field1914.setTime(new Date(arg0));
        int var2 = field1914.get(7);
        int var3 = field1914.get(5);
        int var4 = field1914.get(2);
        int var5 = field1914.get(1);
        int var6 = field1914.get(11);
        int var7 = field1914.get(12);
        int var8 = field1914.get(13);
        return field1919[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1915[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
