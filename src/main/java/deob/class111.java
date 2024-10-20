package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("di")
public class class111 {

    @ObfuscatedName("di.j")
    public static final String[][] field1959 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("di.l")
    public static final String[] field1957 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("di.a")
    public static Calendar field1958;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1958 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.j(J)Ljava/lang/String;")
    public static String method2999(long arg0) {
        field1958.setTime(new Date(arg0));
        int var2 = field1958.get(7);
        int var3 = field1958.get(5);
        int var4 = field1958.get(2);
        int var5 = field1958.get(1);
        int var6 = field1958.get(11);
        int var7 = field1958.get(12);
        int var8 = field1958.get(13);
        return field1957[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field1959[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
