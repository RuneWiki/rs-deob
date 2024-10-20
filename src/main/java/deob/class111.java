package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dd")
public class class111 {

    @ObfuscatedName("dd.n")
    public static final String[][] field1934 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dd.d")
    public static final String[] field1928 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dd.s")
    public static Calendar field1930;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1930 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.n(J)Ljava/lang/String;")
    public static String method909(long arg0) {
        field1930.setTime(new Date(arg0));
        int var2 = field1930.get(7);
        int var3 = field1930.get(5);
        int var4 = field1930.get(2);
        int var5 = field1930.get(1);
        int var6 = field1930.get(11);
        int var7 = field1930.get(12);
        int var8 = field1930.get(13);
        return field1928[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1934[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
