package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dq")
public class class112 {

    @ObfuscatedName("dq.w")
    public static final String[][] field1967 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dq.x")
    public static final String[] field1964 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dq.t")
    public static Calendar field1966;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1966 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class112() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.w(J)Ljava/lang/String;")
    public static String method796(long arg0) {
        field1966.setTime(new Date(arg0));
        int var2 = field1966.get(7);
        int var3 = field1966.get(5);
        int var4 = field1966.get(2);
        int var5 = field1966.get(1);
        int var6 = field1966.get(11);
        int var7 = field1966.get(12);
        int var8 = field1966.get(13);
        return field1964[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1967[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
