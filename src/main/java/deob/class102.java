package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cj")
public class class102 {

    @ObfuscatedName("cj.b")
    public static final String[][] field1815 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cj.e")
    public static final String[] field1814 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cj.i")
    public static Calendar field1820;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1820 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class102() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.b(J)Ljava/lang/String;")
    public static String method2716(long arg0) {
        field1820.setTime(new Date(arg0));
        int var2 = field1820.get(7);
        int var3 = field1820.get(5);
        int var4 = field1820.get(2);
        int var5 = field1820.get(1);
        int var6 = field1820.get(11);
        int var7 = field1820.get(12);
        int var8 = field1820.get(13);
        return field1814[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1815[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
