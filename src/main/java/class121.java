import java.awt.FontMetrics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class121 extends class99 {

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    private int field3016 = 0;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Lpd;")
    private static class94 field3015 = class28.method249(-120, "cyan:");

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "Lpd;")
    public static class94 field3027 = field3015;

    @OriginalMember(owner = "client!ub", name = "ub", descriptor = "Z")
    public static boolean field3033 = false;

    @OriginalMember(owner = "client!ub", name = "rb", descriptor = "Lpd;")
    public static class94 field3030 = class28.method249(-68, "Empf-=nger:");

    @OriginalMember(owner = "client!ub", name = "sb", descriptor = "Lpd;")
    public static class94 field3031 = class28.method249(-120, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lpd;")
    public static class94 field3021 = class28.method249(-64, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ub", name = "qb", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ub", name = "tb", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ub", name = "vb", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!ub", name = "wb", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ub", name = "xb", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ub", name = "yb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3023;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
    public static int[] field3024;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "[[[B")
    public static byte[][][] field3018;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V", line = 6)
    private final void method909(int arg0, boolean arg1) {
        field3037++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1) {
            method912((byte) -15);
        }
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var9 = var5;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        if (var3 > var5) {
            var11 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field3034 = (int) (var17 * 256.0D);
        if (this.field3034 < 0) {
            this.field3034 = 0;
        } else if (this.field3034 > 255) {
            this.field3034 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (-var11 + var9) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        this.field3026 = (int) (var15 * 256.0D);
        if (this.field3026 < 0) {
            this.field3026 = 0;
        } else if (this.field3026 > 255) {
            this.field3026 = 255;
        }
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field3017 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3017 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3017 < 1) {
            this.field3017 = 1;
        }
        this.field3022 = (int) ((double) this.field3017 * var19);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 105)
    public final void method910(int arg0) {
        this.method909(this.field3016, false);
        if (arg0 >= -106) {
            method912((byte) -20);
        }
        field3025++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 121)
    public static final String method911(Throwable arg0, byte arg1) throws IOException {
        if (arg1 != 80) {
            return null;
        }
        String var3;
        if (arg0 instanceof class40) {
            class40 var2 = (class40) arg0;
            var3 = var2.field1030 + " | ";
            arg0 = var2.field1029;
        } else {
            var3 = "";
        }
        field3020++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
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

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V", line = 197)
    public static void method912(byte arg0) {
        field3015 = null;
        field3023 = null;
        field3030 = null;
        field3027 = null;
        field3021 = null;
        field3031 = null;
        field3018 = null;
        if (arg0 != -12) {
            method912((byte) -12);
        }
        field3024 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILuc;)V", line = 231)
    public final void method913(int arg0, int arg1, class122 arg2) {
        field3032++;
        while (true) {
            int var4 = arg2.method943(-1025);
            if (var4 == 0) {
                if (arg0 == -29532) {
                    return;
                } else {
                    this.method914(80, (byte) -93, null, -91);
                    return;
                }
            }
            this.method914(arg1, (byte) -108, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBLuc;I)V", line = 267)
    private final void method914(int arg0, byte arg1, class122 arg2, int arg3) {
        if (arg1 > -104) {
            field3023 = null;
        }
        field3035++;
        if (arg3 == 1) {
            this.field3016 = arg2.method935((byte) -128);
        }
    }
}
