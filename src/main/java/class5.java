import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class19 {

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    private int field103 = -1;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    private int field100 = 0;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Lsd;")
    public static class166 field94 = class135.method935("Fertigkeit)2", 0);

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field104 = Calendar.getInstance();

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "Lb;")
    public static class11 field106 = new class11(100);

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lsc;")
    public static class165 field107 = new class165();

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lsd;")
    private static class166 field109 = class135.method935("RuneScape is loading )2 please wait)3)3)3", 0);

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lsd;")
    public static class166 field112 = class135.method935("Bitte warten Sie eine Minute", 0);

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "Lsd;")
    public static class166 field111 = class135.method935("Keine Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
    public static volatile int field117 = -1;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "Lsd;")
    public static class166 field115 = field109;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "Lsd;")
    private static class166 field118 = class135.method935(" ", 0);

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "Lsd;")
    public static class166 field116 = field118;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Ljava/awt/Font;")
    public static Font field114;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "[Lre;")
    public static class158[] field93;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "[[S")
    public static short[][] field113;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "[[[I")
    public static int[][][] field98;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
    public final void method29(int arg0) {
        field97++;
        this.method31(this.field100, 255);
        if (arg0 > 112) {
            class121.method869(this.field91 * 256 / this.field90, this.field102, this.field99, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lff;IB)V")
    public final void method30(class53 arg0, int arg1, byte arg2) {
        field95++;
        if (arg2 != -53) {
            field117 = -39;
        }
        while (true) {
            int var4 = arg0.method400(255);
            if (var4 == 0) {
                return;
            }
            this.method33(var4, arg0, arg1, 5964);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
    private final void method31(int arg0, int arg1) {
        double var3 = (double) (arg1 & arg0 >> 16) / 256.0D;
        field105++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        double var9 = var3;
        double var11 = (double) (arg0 & 0xFF) / 256.0D;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var11 > var9) {
            var9 = var11;
        }
        if (var7 > var11) {
            var7 = var11;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var7 + var9) / 2.0D;
        this.field102 = (int) (var17 * 256.0D);
        if (var7 != var9) {
            if (var3 == var9) {
                var13 = (var5 - var11) / (-var7 + var9);
            } else if (var5 == var9) {
                var13 = (var11 - var3) / (-var7 + var9) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (-var7 + var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var7) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        this.field99 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field99 < 0) {
            this.field99 = 0;
        } else if (this.field99 > 255) {
            this.field99 = 255;
        }
        if (var17 > 0.5D) {
            this.field90 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field90 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field90 < 1) {
            this.field90 = 1;
        }
        if (this.field102 < 0) {
            this.field102 = 0;
        } else if (this.field102 > 255) {
            this.field102 = 255;
        }
        this.field91 = (int) ((double) this.field90 * var19);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method32(int arg0, Throwable arg1) throws IOException {
        field101++;
        String var2;
        if (arg1 instanceof class48) {
            class48 var3 = (class48) arg1;
            var2 = var3.field890 + " | ";
            arg1 = var3.field889;
        } else {
            var2 = "";
        }
        if (arg0 != 12659) {
            field116 = null;
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
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILff;II)V")
    private final void method33(int arg0, class53 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field100 = arg1.method422((byte) 30);
        } else if (arg0 == 2) {
            this.field103 = arg1.method405(2);
            if (this.field103 == 65535) {
                this.field103 = -1;
            }
        } else if (arg0 == 3) {
            arg1.method405(2);
        }
        field92++;
        if (arg3 != 5964) {
            this.method31(110, -70);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method34(byte arg0) {
        field106 = null;
        field93 = null;
        field116 = null;
        int var1 = -104 % ((arg0 - 46) / 35);
        field113 = null;
        field114 = null;
        field111 = null;
        field112 = null;
        field118 = null;
        field98 = null;
        field115 = null;
        field109 = null;
        field107 = null;
        field94 = null;
        field104 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZI)Lre;")
    public static final class158 method35(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        long var6 = ((long) arg0 << 40) + ((long) arg3 << 38) + ((long) arg5 << 16) + (long) arg2;
        field96++;
        if (!arg4) {
            class158 var8 = (class158) class142.field2765.method64((byte) 28, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class57 var9 = class3.method19(arg2, true);
        if (arg5 > 1 && var9.field1138 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg5 >= var9.field1160[var11] && var9.field1160[var11] != 0) {
                    var10 = var9.field1138[var11];
                }
            }
            if (var10 != -1) {
                var9 = class3.method19(var10, true);
            }
        }
        class118 var12 = var9.method492(true);
        if (var12 == null) {
            return null;
        }
        class158 var13 = null;
        if (var9.field1121 != -1) {
            var13 = method35(0, 106, var9.field1147, 1, true, 10);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class17.field284;
        if (arg1 <= 77) {
            field115 = null;
        }
        int[] var15 = new int[4];
        int var16 = class17.field282;
        int var17 = class17.field280;
        class17.method103(var15);
        class158 var18 = new class158(36, 32);
        class17.method89(var18.field3014, 36, 32);
        class17.method99();
        class40.method279();
        class40.method269(16, 16);
        class40.field704 = false;
        int var19 = var9.field1175;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class40.field719[var9.field1156] * var19 >> 16;
        int var21 = class40.field717[var9.field1156] * var19 >> 16;
        var12.method896();
        var12.method848(0, var9.field1140, var9.field1117, var9.field1156, var9.field1159, var9.field1139 + var21 - var12.field756 / 2, var20 - -var9.field1139);
        if (arg3 >= 1) {
            var18.method1070(1);
        }
        if (arg3 >= 2) {
            var18.method1070(16777215);
        }
        if (arg0 != 0) {
            var18.method1068(arg0);
        }
        class17.method89(var18.field3014, 36, 32);
        if (var9.field1121 != -1) {
            var13.method1055(0, 0);
        }
        if (!arg4 && (var9.field1137 == 1 || arg5 != 1) && arg5 != -1) {
            class131.field2555.method178(class62.method514(-13450, arg5), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            class142.field2765.method67(var18, 15266, var6);
        }
        class17.method89(var14, var16, var17);
        class17.method93(var15);
        class40.method279();
        class40.field704 = true;
        return var18;
    }
}
