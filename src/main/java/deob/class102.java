package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("cu")
public class class102 {

    @ObfuscatedName("cu.a")
    public static final String[][] field1809 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cu.v")
    public static final String[] field1812 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cu.i")
    public static Calendar field1811;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1811 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class102() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.a(J)Ljava/lang/String;")
    public static String method662(long arg0) {
        field1811.setTime(new Date(arg0));
        int var2 = field1811.get(7);
        int var3 = field1811.get(5);
        int var4 = field1811.get(2);
        int var5 = field1811.get(1);
        int var6 = field1811.get(11);
        int var7 = field1811.get(12);
        int var8 = field1811.get(13);
        return field1812[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1809[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
