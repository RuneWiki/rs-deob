package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cv")
public class class103 {

    @ObfuscatedName("cv.y")
    public static final String[][] field1850 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cv.k")
    public static final String[] field1849 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cv.g")
    public static Calendar field1848;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1848 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.y(J)Ljava/lang/String;")
    public static String method2603(long arg0) {
        field1848.setTime(new Date(arg0));
        int var2 = field1848.get(7);
        int var3 = field1848.get(5);
        int var4 = field1848.get(2);
        int var5 = field1848.get(1);
        int var6 = field1848.get(11);
        int var7 = field1848.get(12);
        int var8 = field1848.get(13);
        return field1849[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1850[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
