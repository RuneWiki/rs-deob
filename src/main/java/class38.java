import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class38 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[[I")
    private int[][] field574;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lsc;")
    public static class181 field579 = class149.method967(255, ")4l=");

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lsc;")
    private static class181 field583 = class149.method967(255, "Choose Option");

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
    public static boolean field588 = false;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field584 = 20;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "B")
    public static byte field591 = 0;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
    public static int[] field577 = new int[2];

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Lsc;")
    public static class181 field594 = field583;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Z")
    public static boolean field596 = false;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Ljb;")
    public static class11 field586;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lmb;")
    public static class232 field593;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static final void method274(boolean arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class61.field943[var1] = true;
        }
        if (arg0) {
            field593 = null;
        }
        field580++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    public final int method275(int arg0, int arg1) {
        field589++;
        if (arg0 == 0) {
            if (this.field574 != null) {
                arg1 = (int) ((long) this.field576 * (long) arg1 / (long) this.field578);
            }
            return arg1;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIIII)V")
    public static final void method276(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class220 var6 = class221.field3820[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class102 var7 = var6.field3809;
        if (var7 != null) {
            int var8 = var7.field1706;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class15 var10 = var6.field3799;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field287;
        int var12 = var10.field273;
        int var13 = var10.field276;
        int var14 = var10.field269;
        int[] var15 = class160.field2740[var11];
        int[] var16 = class165.field2798[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V")
    public class38(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class111.method742(0, arg0, arg1);
            int var4 = arg0 / var3;
            this.field578 = var4;
            int var5 = arg1 / var3;
            this.field574 = new int[var4][14];
            this.field576 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field574[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B[B)[B")
    public final byte[] method277(byte arg0, byte[] arg1) {
        field587++;
        if (arg0 != -25) {
            method274(false);
        }
        if (this.field574 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field576 / (long) this.field578) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field574[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field576 + var6;
                int var14 = var13 / this.field578;
                var3 += var14;
                var6 = var13 - this.field578 * var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILjb;I)[Lka;")
    public static final class134[] method278(boolean arg0, int arg1, class11 arg2, int arg3) {
        if (!arg0) {
            field579 = null;
        }
        field595++;
        return class242.method1646(arg3, (byte) -64, arg2, arg1) ? class61.method437((byte) 125) : null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method279(byte arg0) {
        field594 = null;
        field586 = null;
        field579 = null;
        field577 = null;
        if (arg0 != 69) {
            method281((class230) null, (byte) 50);
        }
        field593 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
    public final int method280(int arg0, int arg1) {
        if (arg0 != 20952) {
            return -112;
        }
        field592++;
        if (this.field574 != null) {
            arg1 = (int) ((long) this.field576 * (long) arg1 / (long) this.field578) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lvf;B)Lma;")
    public static final class35 method281(class230 arg0, byte arg1) {
        field590++;
        class35 var2 = new class35();
        var2.field555 = arg0.method1535(2);
        var2.field547 = class188.method1301(var2.field555, (byte) 79);
        if (arg1 != -11) {
            field588 = false;
        }
        return var2;
    }
}
