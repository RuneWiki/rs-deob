package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cj")
public class class103 {

    @ObfuscatedName("cj.b")
    public static final String[][] field1851 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cj.e")
    public static final String[] field1849 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cj.a")
    public static Calendar field1846;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1846 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.b(J)Ljava/lang/String;")
    public static String method2582(long arg0) {
        field1846.setTime(new Date(arg0));
        int var2 = field1846.get(7);
        int var3 = field1846.get(5);
        int var4 = field1846.get(2);
        int var5 = field1846.get(1);
        int var6 = field1846.get(11);
        int var7 = field1846.get(12);
        int var8 = field1846.get(13);
        return field1849[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1851[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
