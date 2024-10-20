package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cw")
public class class103 {

    @ObfuscatedName("cw.q")
    public static final String[][] field1804 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cw.s")
    public static final String[] field1811 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cw.h")
    public static Calendar field1803;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1803 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.q(J)Ljava/lang/String;")
    public static String method1988(long arg0) {
        field1803.setTime(new Date(arg0));
        int var2 = field1803.get(7);
        int var3 = field1803.get(5);
        int var4 = field1803.get(2);
        int var5 = field1803.get(1);
        int var6 = field1803.get(11);
        int var7 = field1803.get(12);
        int var8 = field1803.get(13);
        return field1811[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1804[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
