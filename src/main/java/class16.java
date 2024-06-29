import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 extends class67 {

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Led;")
    private static class43 field235 = class191.method1219("You have only just left another world)3", false);

    @OriginalMember(owner = "client!be", name = "L", descriptor = "Led;")
    public static class43 field250 = class191.method1219(":tradereq:", false);

    @OriginalMember(owner = "client!be", name = "N", descriptor = "Led;")
    public static class43 field252 = class191.method1219("Ihr Charakter)2Profil wird in:", false);

    @OriginalMember(owner = "client!be", name = "R", descriptor = "Led;")
    public static class43 field255 = class191.method1219("<col=ffb000>", false);

    @OriginalMember(owner = "client!be", name = "V", descriptor = "Led;")
    public static class43 field258 = field235;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "Led;")
    private static class43 field248 = class191.method1219("Error connecting to server)3", false);

    @OriginalMember(owner = "client!be", name = "T", descriptor = "Led;")
    private static class43 field256 = class191.method1219("cyan:", false);

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Led;")
    public static class43 field241 = field248;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Led;")
    public static class43 field253 = class191.method1219(" weitere Optionen", false);

    @OriginalMember(owner = "client!be", name = "X", descriptor = "Led;")
    public static class43 field260 = field256;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "Led;")
    public static class43 field268 = class191.method1219("Clientscript error in: ", false);

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "J")
    public static volatile long field264 = 0L;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "Led;")
    public static class43 field257 = field256;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "Lve;")
    public class195 field259;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "Lve;")
    public class195 field265;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Lcb;")
    public class23 field239;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "[I")
    public int[] field262;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[Z")
    public static boolean[] field240;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        field246++;
        int var2 = this.field245;
        class23 var3 = this.field239.method111(-42);
        if (arg0) {
            return;
        }
        if (var3 == null) {
            this.field263 = 0;
            this.field249 = 0;
            this.field267 = 0;
            this.field245 = -1;
            this.field262 = null;
        } else {
            this.field267 = var3.field388;
            this.field262 = var3.field413;
            this.field245 = var3.field455;
            this.field263 = var3.field434 * 128;
            this.field249 = var3.field428;
        }
        if (this.field245 != var2 && this.field259 != null) {
            class185.field3638.method1181(this.field259);
            this.field259 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method69(byte arg0) {
        field248 = null;
        if (arg0 != -62) {
            field253 = null;
        }
        field255 = null;
        field256 = null;
        field253 = null;
        field250 = null;
        field257 = null;
        field260 = null;
        field268 = null;
        field235 = null;
        field240 = null;
        field258 = null;
        field241 = null;
        field252 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lvd;")
    public static final class194 method70(int arg0, int arg1) {
        field236++;
        class194 var2 = (class194) class126.field2510.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field2445.method367(13, arg1, (byte) -34);
        if (arg0 != -1) {
            field241 = null;
        }
        class194 var4 = new class194();
        var4.field3796 = arg1;
        if (var3 != null) {
            var4.method1239(new class89(var3), true);
        }
        class126.field2510.method1107((long) arg1, var4, -114);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method71(byte arg0, Throwable arg1) throws IOException {
        field244++;
        String var3;
        if (arg1 instanceof class184) {
            class184 var2 = (class184) arg1;
            arg1 = var2.field3616;
            var3 = var2.field3621 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 >= -116) {
            field235 = null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLqd;)V")
    public static final void method72(byte arg0, class149 arg1) {
        if (arg0 == 27) {
            class143.field2946 = arg1;
            field270++;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
    public static final int method73(int arg0, byte arg1, int arg2) {
        if (arg1 < 123) {
            return 85;
        }
        field261++;
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }
}
