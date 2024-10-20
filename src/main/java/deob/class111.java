package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dt")
public class class111 {

    @ObfuscatedName("dt.d")
    public static final String[][] field1933 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dt.p")
    public static final String[] field1932 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dt.v")
    public static Calendar field1930;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1930 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.d(J)Ljava/lang/String;")
    public static String method2696(long arg0) {
        field1930.setTime(new Date(arg0));
        int var2 = field1930.get(7);
        int var3 = field1930.get(5);
        int var4 = field1930.get(2);
        int var5 = field1930.get(1);
        int var6 = field1930.get(11);
        int var7 = field1930.get(12);
        int var8 = field1930.get(13);
        return field1932[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1933[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
