package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dv")
public class class115 {

    @ObfuscatedName("dv.s")
    public static final String[][] field1988 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dv.z")
    public static final String[] field1992 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dv.t")
    public static Calendar field1990;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1990 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hw.s(J)Ljava/lang/String;")
    public static String method3753(long arg0) {
        field1990.setTime(new Date(arg0));
        int var2 = field1990.get(7);
        int var3 = field1990.get(5);
        int var4 = field1990.get(2);
        int var5 = field1990.get(1);
        int var6 = field1990.get(11);
        int var7 = field1990.get(12);
        int var8 = field1990.get(13);
        return field1992[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1988[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
