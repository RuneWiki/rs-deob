import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class248 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    private int[] field3830;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
    private int[] field3827;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lqi;")
    private class303 field3826;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lqi;")
    private class303 field3829;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[Lqi;")
    private class303[] field3839;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3828 = 0;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field3838 = -1;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3833 = 0;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Z")
    public static boolean field3834 = false;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[Lfk;")
    public static class45[] field3840;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIZLha;Lja;ID)[B", line = 6)
    public final byte[] method1759(byte arg0, int arg1, boolean arg2, class304 arg3, class64 arg4, int arg5, double arg6) {
        field3831++;
        class60.method443(arg6, true);
        class92.field1518 = arg3;
        byte[] var9 = new byte[arg1 * arg5 * 4];
        class255.field3953 = arg4;
        class121.method923(false, arg5, arg1);
        for (int var10 = 0; var10 < this.field3839.length; var10++) {
            this.field3839[var10].method2105(arg5, (byte) 81, arg1);
        }
        int var11 = 0;
        if (arg0 <= 88) {
            method1764(true);
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg2) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3826.field4773) {
                int[] var17 = this.field3826.method67(-3, var12);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field3826.method74(var12, 82);
                var14 = var13[1];
                var15 = var13[2];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field3829.field4773) {
                var18 = this.field3829.method67(-3, var12);
            } else {
                var18 = this.field3829.method74(var12, 82)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class312.field4902[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var24 = class312.field4902[var22];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class312.field4902[var21];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var26;
                if (arg2) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3839.length; var27++) {
            this.field3839[var27].method72((byte) -27);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(DZZZLha;Lja;II)[I", line = 151)
    public final int[] method1760(double arg0, boolean arg1, boolean arg2, boolean arg3, class304 arg4, class64 arg5, int arg6, int arg7) {
        class60.method443(arg0, arg2);
        class92.field1518 = arg4;
        if (!arg2) {
            return (int[]) null;
        }
        field3837++;
        int[] var10 = new int[arg6 * arg7];
        class255.field3953 = arg5;
        class121.method923(false, arg6, arg7);
        for (int var11 = 0; var11 < this.field3839.length; var11++) {
            this.field3839[var11].method2105(arg6, (byte) 91, arg7);
        }
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = arg6 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = arg6;
            var12 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3826.field4773) {
                int[] var21 = this.field3826.method67(-3, var16);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field3826.method74(var16, 82);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var19[var22] >> 4;
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = var18[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class312.field4902[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                int var27 = class312.field4902[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class312.field4902[var24];
                var10[var15++] = (var26 << 16) + (var28 << 8) + var27;
                if (arg3) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3839.length; var29++) {
            this.field3839[var29].method72((byte) -27);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILja;Lha;)Z", line = 282)
    public final boolean method1761(int arg0, class64 arg1, class304 arg2) {
        field3832++;
        if (class282.field4356 > 0) {
            for (int var4 = 0; var4 < this.field3830.length; var4++) {
                if (!arg1.method464((byte) 28, class282.field4356, this.field3830[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3830.length; var5++) {
                if (!arg1.method489(this.field3830[var5], arg0)) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field3827.length; var6++) {
            if (!arg2.method1485((byte) 121, this.field3827[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 330)
    public static final void method1762(int arg0) {
        field3841++;
        if (class22.field394 == 10 && class265.field4126) {
            class320.method2196(28, 0);
        }
        if (class22.field394 == 30) {
            class320.method2196(25, 0);
        }
        int var1 = 89 / ((arg0 - 62) / 53);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V", line = 364)
    public static final void method1763(byte arg0, int arg1) {
        field3835++;
        if (arg0 < 71) {
            method1764(false);
        }
        class181.field2897.method1828(arg1, (byte) -27);
        class215.field3431.method1828(arg1, (byte) -37);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 384)
    public class248() {
        this.field3830 = new int[0];
        this.field3827 = new int[0];
        this.field3826 = new class288();
        this.field3826.field4771 = 1;
        this.field3829 = new class288();
        this.field3829.field4771 = 1;
        this.field3839 = new class303[] { this.field3826, this.field3829 };
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 399)
    public static void method1764(boolean arg0) {
        field3840 = null;
        if (arg0) {
            method1763((byte) 69, -107);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lpe;)V", line = 412)
    public class248(class101 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method741(92);
        this.field3839 = new class303[var4];
        int[][] var5 = new int[var4][];
        for (int var6 = 0; var6 < var4; var6++) {
            class303 var7 = class242.method1722(arg0, 37);
            if (var7.method73((byte) 2) >= 0) {
                var2++;
            }
            if (var7.method1994((byte) -4) >= 0) {
                var3++;
            }
            int var8 = var7.field4762.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method741(54);
            }
            this.field3839[var6] = var7;
        }
        this.field3827 = new int[var3];
        int var10 = 0;
        this.field3830 = new int[var2];
        int var11 = 0;
        for (int var12 = 0; var12 < var4; var12++) {
            class303 var13 = this.field3839[var12];
            int var14 = var13.field4762.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4762[var15] = this.field3839[var5[var12][var15]];
            }
            int var16 = var13.method73((byte) 2);
            int var17 = var13.method1994((byte) -4);
            if (var16 > 0) {
                this.field3830[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3827[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field3826 = this.field3839[arg0.method741(68)];
        this.field3829 = this.field3839[arg0.method741(46)];
        int[][] var18 = (int[][]) null;
    }
}
