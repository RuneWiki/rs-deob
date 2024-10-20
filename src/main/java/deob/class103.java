package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cz")
public class class103 {

    @ObfuscatedName("cz.e")
    public static final String[][] field1793 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cz.a")
    public static final String[] field1790 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cz.l")
    public static Calendar field1794;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1794 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.e(J)Ljava/lang/String;")
    public static String method166(long arg0) {
        field1794.setTime(new Date(arg0));
        int var2 = field1794.get(7);
        int var3 = field1794.get(5);
        int var4 = field1794.get(2);
        int var5 = field1794.get(1);
        int var6 = field1794.get(11);
        int var7 = field1794.get(12);
        int var8 = field1794.get(13);
        return field1790[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1793[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
