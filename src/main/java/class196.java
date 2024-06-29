import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class196 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[[I")
    private int[][] field3647;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static volatile int field3635 = 0;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3640 = -1;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lqe;")
    private static class179 field3638 = class206.method1380("To play on this world move to a free area first)3", (byte) 23);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3645 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lqe;")
    public static class179 field3642 = class206.method1380("Benutzen Sie die (WPasswort -=ndern(W Option", (byte) -126);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lqe;")
    public static class179 field3637 = field3638;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lqe;")
    private static class179 field3651 = class206.method1380("OFF", (byte) -127);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lqe;")
    public static class179 field3639 = field3651;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[Lfc;")
    public static class58[] field3648;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1312(boolean arg0) {
        field3637 = null;
        field3638 = null;
        field3648 = null;
        field3651 = null;
        field3642 = null;
        field3639 = null;
        if (arg0) {
            method1312(false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1313(Throwable arg0, byte arg1) throws IOException {
        field3649++;
        String var3;
        if (arg0 instanceof class149) {
            class149 var2 = (class149) arg0;
            var3 = var2.field2677 + " | ";
            arg0 = var2.field2678;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 0) {
            field3642 = null;
        }
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

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public final int method1314(int arg0, int arg1) {
        field3641++;
        if (arg0 == -24981) {
            if (this.field3647 != null) {
                arg1 = (int) ((long) this.field3646 * (long) arg1 / (long) this.field3643);
            }
            return arg1;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)I")
    public final int method1315(int arg0, int arg1) {
        field3650++;
        if (arg1 <= 58) {
            this.method1314(43, -81);
        }
        if (this.field3647 != null) {
            arg0 = (int) ((long) this.field3646 * (long) arg0 / (long) this.field3643) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BI)[B")
    public final byte[] method1316(byte[] arg0, int arg1) {
        if (arg1 != 14) {
            return null;
        }
        if (this.field3647 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3646 / (long) this.field3643) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3647[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3646 + var6;
                int var14 = var13 / this.field3643;
                var6 = var13 - this.field3643 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field3636++;
        return arg0;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
    public class196(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class214.method1409(arg1, arg0, true);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3646 = var4;
            this.field3643 = var5;
            this.field3647 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3647[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
