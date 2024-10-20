package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dc")
public class class115 {

    @ObfuscatedName("dc.a")
    public static final String[][] field2036 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dc.d")
    public static final String[] field2033 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dc.v")
    public static Calendar field2034;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2034 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.a(J)Ljava/lang/String;")
    public static String method910(long arg0) {
        field2034.setTime(new Date(arg0));
        int var2 = field2034.get(7);
        int var3 = field2034.get(5);
        int var4 = field2034.get(2);
        int var5 = field2034.get(1);
        int var6 = field2034.get(11);
        int var7 = field2034.get(12);
        int var8 = field2034.get(13);
        return field2033[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2036[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
