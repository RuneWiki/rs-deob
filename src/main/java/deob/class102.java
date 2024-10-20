package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cl")
public class class102 {

    @ObfuscatedName("cl.p")
    public static final String[][] field1806 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cl.y")
    public static final String[] field1802 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cl.d")
    public static Calendar field1801;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1801 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class102() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.p(J)Ljava/lang/String;")
    public static String method2851(long arg0) {
        field1801.setTime(new Date(arg0));
        int var2 = field1801.get(7);
        int var3 = field1801.get(5);
        int var4 = field1801.get(2);
        int var5 = field1801.get(1);
        int var6 = field1801.get(11);
        int var7 = field1801.get(12);
        int var8 = field1801.get(13);
        return field1802[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1806[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
