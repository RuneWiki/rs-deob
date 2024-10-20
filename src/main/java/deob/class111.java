package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("de")
public class class111 {

    @ObfuscatedName("de.o")
    public static final String[][] field1928 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("de.e")
    public static final String[] field1925 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("de.u")
    public static Calendar field1931;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1931 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.o(J)Ljava/lang/String;")
    public static String method2019(long arg0) {
        field1931.setTime(new Date(arg0));
        int var2 = field1931.get(7);
        int var3 = field1931.get(5);
        int var4 = field1931.get(2);
        int var5 = field1931.get(1);
        int var6 = field1931.get(11);
        int var7 = field1931.get(12);
        int var8 = field1931.get(13);
        return field1925[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1928[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
