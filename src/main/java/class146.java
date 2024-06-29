import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class146 extends class68 {

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    private int field2033 = 1;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    private int field2036 = 1;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "[[I")
    public static int[][] field2030 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Lwl;")
    public static class172 field2037;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
    public static int[] field2034;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "[[B")
    public static byte[][] field2029;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lhc;ZBLhc;)V")
    public static final void method979(class235 arg0, boolean arg1, byte arg2, class235 arg3) {
        class27.field340 = arg1;
        if (arg2 != 53) {
            method980(-122, -126, -82, -16, 90, false);
        }
        ++field2031;
        class176.field2477 = arg3;
        class216.field3261 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2028;
        class226.field3432[0].method452(arg0, arg2);
        int var6 = (arg4 + -32) * arg4 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        class226.field3432[1].method452(arg0, arg2 + arg4 + -16);
        int var7 = (arg4 + -32 + -var6) * arg3 / (-arg4 + arg1);
        class64.method401(arg0, arg2 - -16, 16, arg4 + -32, class175.field2461);
        class64.method401(arg0, arg2 + var7 + 16, 16, var6, class158.field2205);
        class64.method388(arg0, arg2 + 16 - -var7, var6, class131.field1845);
        class64.method388(arg0 + 1, arg2 + 16 + var7, var6, class131.field1845);
        class64.method396(arg0, arg2 - -16 - -var7, 16, class131.field1845);
        if (!arg5) {
            field2029 = null;
        }
        class64.method396(arg0, arg2 + var7 + 17, 16, class131.field1845);
        class64.method388(arg0 + 15, arg2 + var7 + 16, var6, class292.field4590);
        class64.method388(arg0 + 14, var7 + 17 + arg2, var6 + -1, class292.field4590);
        class64.method396(arg0, arg2 + var7 - -15 + var6, 16, class292.field4590);
        class64.method396(arg0 + 1, arg2 + 14 + var6 + var7, 15, class292.field4590);
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)I")
    public static final int method981(int arg0) {
        if (arg0 != -24191) {
            method981(49);
        }
        ++field2035;
        if (class129.field1822) {
            return 0;
        } else if (!class34.method231(118)) {
            return 1;
        } else {
            return !class148.field2048 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field2038;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field926 = ~arg0.method1453((byte) -128) == -2;
                }
            } else {
                this.field2036 = arg0.method1453((byte) -128);
            }
        } else {
            this.field2033 = arg0.method1453((byte) -128);
        }
        if (!arg2) {
            method982(125, 55, -25, -92, 126, 107, -100, 43, 2, 83, -3, -81, -36, 40, 74, -98, 76, 0, -27, 15);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class66 var20 = new class66(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class194.field2682[var21][arg1][arg2] == null) {
                    class194.field2682[var21][arg1][arg2] = new class89(var21, arg1, arg2);
                }
            }
            class194.field2682[arg0][arg1][arg2].field1243 = var20;
        } else if (arg3 != 1) {
            class106 var24 = new class106(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class194.field2682[var25][arg1][arg2] == null) {
                    class194.field2682[var25][arg1][arg2] = new class89(var25, arg1, arg2);
                }
            }
            class194.field2682[arg0][arg1][arg2].field1225 = var24;
        } else {
            class66 var22 = new class66(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class194.field2682[var23][arg1][arg2] == null) {
                    class194.field2682[var23][arg1][arg2] = new class89(var23, arg1, arg2);
                }
            }
            class194.field2682[arg0][arg1][arg2].field1243 = var22;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int var4 = this.field2036 + 1 + this.field2036;
            int var5 = 65536 / var4;
            int var6 = this.field2033 + this.field2033 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2036 + arg0; ~(this.field2036 + arg0) <= ~var9; ++var9) {
                int var19 = 0;
                int[][] var20 = this.method429(0, var9 & class17.field184, 2);
                int var21 = 0;
                int[][] var22 = new int[3][class89.field1248];
                int var23 = 0;
                int[] var24 = var20[0];
                int[] var25 = var20[2];
                int[] var26 = var20[1];
                for (int var27 = -this.field2033; this.field2033 >= var27; ++var27) {
                    int var37 = class173.field2411 & var27;
                    var21 += var26[var37];
                    var19 += var24[var37];
                    var23 += var25[var37];
                }
                int[] var28 = var22[1];
                int[] var29 = var22[0];
                int[] var30 = var22[2];
                int var31 = 0;
                while (class89.field1248 > var31) {
                    var29[var31] = var7 * var19 >> 16;
                    var28[var31] = var7 * var21 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field2033 + var31 & class173.field2411;
                    ++var31;
                    int var33 = var21 - var26[var32];
                    int var34 = var19 - var24[var32];
                    int var35 = var23 - var25[var32];
                    int var36 = class173.field2411 & var31 - -this.field2033;
                    var21 = var26[var36] + var33;
                    var23 = var25[var36] + var35;
                    var19 = var24[var36] + var34;
                }
                var8[-arg0 + this.field2036 + var9] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            for (int var13 = 0; var13 < class89.field1248; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[2][var13];
                    var14 += var18[0][var13];
                    var16 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var12[var13] = var5 * var16 >> 16;
                var11[var13] = var5 * var15 >> 16;
            }
        }
        ++field2027;
        int var38 = 22 % ((63 - arg1) / 61);
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
    public static void method983(int arg0) {
        field2030 = null;
        field2034 = null;
        if (arg0 == 1) {
            field2037 = null;
            field2029 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            return null;
        } else {
            ++field2032;
            int[] var3 = super.field917.method1920(arg0, true);
            if (super.field917.field4474) {
                int var4 = this.field2036 + 1 + this.field2036;
                int var5 = 65536 / var4;
                int[][] var6 = new int[var4][];
                int var7 = this.field2033 + this.field2033 + 1;
                int var8 = 65536 / var7;
                for (int var9 = arg0 - this.field2036; var9 <= this.field2036 + arg0; ++var9) {
                    int[] var13 = this.method423(0, (byte) -54, class17.field184 & var9);
                    int[] var14 = new int[class89.field1248];
                    int var15 = 0;
                    for (int var16 = -this.field2033; ~this.field2033 <= ~var16; ++var16) {
                        var15 += var13[class173.field2411 & var16];
                    }
                    int var17 = 0;
                    while (~class89.field1248 < ~var17) {
                        var14[var17] = var8 * var15 >> 16;
                        int var18 = var15 - var13[class173.field2411 & var17 - this.field2033];
                        ++var17;
                        var15 = var13[var17 - -this.field2033 & class173.field2411] + var18;
                    }
                    var6[this.field2036 + var9 + -arg0] = var14;
                }
                for (int var10 = 0; class89.field1248 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var6[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class146() {
        super(1, false);
    }
}
