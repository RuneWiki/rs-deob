package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cl")
public class class103 {

    @ObfuscatedName("cl.n")
    public static final String[][] field1849 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cl.d")
    public static final String[] field1848 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cl.z")
    public static Calendar field1850;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1850 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.n(J)Ljava/lang/String;")
    public static String method160(long arg0) {
        field1850.setTime(new Date(arg0));
        int var2 = field1850.get(7);
        int var3 = field1850.get(5);
        int var4 = field1850.get(2);
        int var5 = field1850.get(1);
        int var6 = field1850.get(11);
        int var7 = field1850.get(12);
        int var8 = field1850.get(13);
        return field1848[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1849[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
