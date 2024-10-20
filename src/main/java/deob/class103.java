package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cv")
public class class103 {

    @ObfuscatedName("cv.n")
    public static final String[][] field1857 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cv.g")
    public static final String[] field1851 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cv.a")
    public static Calendar field1853;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1853 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.n(J)Ljava/lang/String;")
    public static String method318(long arg0) {
        field1853.setTime(new Date(arg0));
        int var2 = field1853.get(7);
        int var3 = field1853.get(5);
        int var4 = field1853.get(2);
        int var5 = field1853.get(1);
        int var6 = field1853.get(11);
        int var7 = field1853.get(12);
        int var8 = field1853.get(13);
        return field1851[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1857[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
