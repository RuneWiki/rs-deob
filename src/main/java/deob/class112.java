package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dn")
public class class112 {

    @ObfuscatedName("dn.a")
    public static final String[][] field1953 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dn.w")
    public static final String[] field1951 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dn.d")
    public static Calendar field1954;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1954 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.a(J)Ljava/lang/String;")
    public static String method2406(long arg0) {
        field1954.setTime(new Date(arg0));
        int var2 = field1954.get(7);
        int var3 = field1954.get(5);
        int var4 = field1954.get(2);
        int var5 = field1954.get(1);
        int var6 = field1954.get(11);
        int var7 = field1954.get(12);
        int var8 = field1954.get(13);
        return field1951[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1953[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
