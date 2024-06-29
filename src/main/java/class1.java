import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "[I")
    private int[] field1 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!is", name = "v", descriptor = "[I")
    private int[] field22 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!is", name = "r", descriptor = "Lrq;")
    private class39 field18;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "Z")
    public boolean field29;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "Lm;")
    private class80 field19;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "[[[I")
    public int[][][] field6;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "[[[B")
    private byte[][][] field14;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "[[[B")
    public byte[][][] field12;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "[[[B")
    private byte[][][] field26;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "[[[B")
    private byte[][][] field27;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "[[[B")
    private byte[][][] field9;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field25;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "[[[B")
    public byte[][][] field10;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([[IBI)V")
    public final void method1(int[][] arg0, byte arg1, int arg2) {
        field7++;
        int[][] var4 = this.field6[arg2];
        for (int var5 = 0; var5 < this.field28 + 1; var5++) {
            for (int var7 = 0; var7 < this.field3 + 1; var7++) {
                var4[var5][var7] += arg0[var5][var7];
            }
        }
        int var6 = -21 / ((-arg1 - 40) / 61);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lza;BLya;[[ILya;ILya;)V")
    private final void method2(class295 arg0, byte arg1, class11 arg2, int[][] arg3, class11 arg4, int arg5, class11 arg6) {
        for (int var8 = 0; var8 < this.field28; var8++) {
            for (int var9 = 0; var9 < this.field3; var9++) {
                if (class332.field4523 == -1 || class104.method811(arg1 ^ 0x5, arg5, class332.field4523, var9, var8)) {
                    byte var10 = this.field26[arg5][var8][var9];
                    byte var11 = this.field9[arg5][var8][var9];
                    int var12 = this.field14[arg5][var8][var9] & 0xFF;
                    int var13 = this.field27[arg5][var8][var9] & 0xFF;
                    class534 var14 = var12 == 0 ? null : this.field18.method272(var12 - 1, (byte) -7);
                    class479 var15 = var13 == 0 ? null : this.field19.method619(var13 - 1, (byte) -60);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class450.field6592[var10];
                        var17 = var14 == null ? 0 : class79.field1121[var10];
                    } else if (var14 != null) {
                        var17 = class79.field1121[var10];
                    } else if (var15 != null) {
                        var16 = class79.field1121[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field7857 == -1 && var14.field7856 == -1 && var14.field7853 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg0.method551() ? var14.field7853 : var14.field7863;
                            if (class236.field3269) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field7870;
                                if (var14.field7857 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field7857;
                                }
                                if (var14.field7856 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field7856;
                                }
                                var19++;
                            }
                            if (!this.field29 && arg5 == 0) {
                                class334.method2045(var8, var9, var14.field7867, var14.field7865 * 8, var14.field7859);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field6928;
                            if (class236.field3269) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field6923;
                                var20[var19] = arg3[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg6 == null ? null : new int[var31];
                        int[] var35 = arg6 == null && arg2 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1[var36];
                            int var46 = this.field22[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class339.field4915[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg6.method79(var49, var50) - arg4.method79(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg6 != null && !class339.field4915[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method79(var51, var52) - arg6.method79(var51, var52);
                                } else if (arg2 != null && !class522.field7649[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method79(var53, var54) - arg4.method79(var53, var54);
                                }
                            }
                        }
                        int var37 = arg4.method85(var8, var9);
                        int var38 = arg4.method85(var8 + 1, var9);
                        int var39 = arg4.method85(var8 + 1, var9 + 1);
                        int var40 = arg4.method85(var8, var9 + 1);
                        if (arg5 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field7864) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field12[arg5][var8][var9] = (byte) class219.method1367(this.field12[arg5][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field29) {
                            var42 = class55.method361(var8, var9);
                            var43 = class76.method595(var8, var9);
                            var44 = class308.method1782(var8, var9);
                        }
                        arg4.method76(var8, var9, var32, var34, var33, var35, class88.field1422[var10], class494.field7144[var10], class18.field283[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class492.method2913(arg5, var8, var9);
                    }
                }
            }
        }
        if (arg1 != 84) {
            this.field27 = null;
        }
        field20++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I[Let;IIIIIBILsv;)V")
    public final void method3(int arg0, class466[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, class319 arg9) {
        field5++;
        if (arg7 > -77) {
            this.field14 = null;
        }
        int var11 = (arg3 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field29) {
            class466 var13 = arg1[arg0];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg6 + class265.method1556(var15 & 0x7, var14 & 0x7, arg4, true);
                    int var17 = class530.method3138((byte) 2, var15 & 0x7, var14 & 0x7, arg4) + arg8;
                    if (var16 > 0 && var16 < (this.field28 - 1) && var17 > 0 && var17 < this.field3 - 1) {
                        var13.method2708(var17, -1, var16);
                    }
                }
            }
        }
        int var18 = (arg3 & 0xFFFFFFF8) << 3;
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg4 == 1) {
            var21 = 1;
        } else if (arg4 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg4 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field17; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg2 == var22 && var23 >= var11 && var11 + 8 >= var23 && var24 >= var12 && var12 + 8 >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg4 == 0) {
                                var25 = var23 + arg6 - var11;
                                var26 = var24 - (var12 - arg8);
                            } else if (arg4 == 1) {
                                var25 = arg6 + var24 - var12;
                                var26 = var11 + arg8 + 8 - var23;
                            } else if (arg4 == 2) {
                                var25 = -var23 - (-var11 - (arg6 + 8));
                                var26 = arg8 + var12 + 8 - var24;
                            } else {
                                var26 = var23 + arg8 - var11;
                                var25 = var12 + arg6 + 8 - var24;
                            }
                            this.method9(-2, 0, arg9, arg0, true, var19 + var24, 0, var25, 0, var18 + var23, var26);
                        } else {
                            var25 = arg6 + class265.method1556(var24 & 0x7, var23 & 0x7, arg4, true);
                            var26 = arg8 + class530.method3138((byte) -116, var24 & 0x7, var23 & 0x7, arg4);
                            this.method9(-2, arg4, arg9, arg0, false, var19 + var24, var21, var25, var20, var18 + var23, var26);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg4 == 0) {
                                    var31 = var30 - (var12 - arg8);
                                    var32 = var29 + arg6 - var11;
                                } else if (arg4 == 1) {
                                    var31 = arg8 - (var29 - var11 - 8);
                                    var32 = arg6 + var30 - var12;
                                } else if (arg4 == 2) {
                                    var31 = var12 + arg8 + 8 - var30;
                                    var32 = var11 + arg6 + 8 - var29;
                                } else {
                                    var31 = var29 + arg8 - var11;
                                    var32 = arg6 + var12 + 8 - var30;
                                }
                                if (var32 >= 0 && var32 < this.field28 && var31 >= 0 && var31 < this.field3) {
                                    this.field6[arg0][var32][var31] = this.field6[arg0][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method9(-2, 0, arg9, 0, false, 0, 0, -1, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([[[II[Let;Lza;)V")
    public final void method4(int[][][] arg0, int arg1, class466[] arg2, class295 arg3) {
        if (!this.field29) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field28; var6++) {
                    for (int var7 = 0; var7 < this.field3; var7++) {
                        if ((class27.field379[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class27.field379[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2709(var6, 29, var7);
                            }
                        }
                    }
                }
            }
        }
        field24++;
        for (int var9 = 0; var9 < this.field17; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field29) {
                if (class284.field3857) {
                    var11 |= 0x8;
                }
                if (class123.field1906) {
                    var10 |= 0x2;
                }
                if (class153.field2361 != 0) {
                    if (var9 == 0 | class3.field40) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class123.field1906) {
                var11 |= 0x7;
            }
            if (!class124.field1919) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field6[var9] : arg0[var9];
            class323.method1913(var9, arg3.method506(this.field28, this.field3, this.field6[var9], var12, 128, var10, var11));
        }
        if (arg1 != -1) {
            this.method9(-67, 21, null, 127, false, 70, -12, 108, -123, -40, -80);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
    public static void method5(boolean arg0) {
        field25 = null;
        if (!arg0) {
            field16 = 38;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZIIII)V")
    public final void method6(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field17; var6++) {
            this.method8(arg4, (byte) -98, arg3, var6, arg1, arg2);
        }
        if (!arg0) {
            this.method6(true, 44, 25, 45, -88);
        }
        field8++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([[ILya;Lza;Lya;Lya;II)V")
    private final void method7(int[][] arg0, class11 arg1, class295 arg2, class11 arg3, class11 arg4, int arg5, int arg6) {
        field21++;
        byte[][] var8 = this.field26[arg6];
        byte[][] var9 = this.field9[arg6];
        byte[][] var10 = this.field27[arg6];
        byte[][] var11 = this.field14[arg6];
        for (int var12 = arg5; var12 < this.field28; var12++) {
            int var13 = this.field28 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field3; var14++) {
                int var15 = var14 < this.field3 - 1 ? var14 + 1 : var14;
                if (class332.field4523 == -1 || class104.method811(58, arg6, class332.field4523, var14, var12)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class534 var26 = var21 == 0 ? null : this.field18.method272(var21 - 1, (byte) -7);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class479 var27 = var22 == 0 ? null : this.field19.method619(var22 - 1, (byte) -60);
                        class534 var28 = var26;
                        if (var26 != null) {
                            if (var26.field7857 == -1 && var26.field7856 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field7855;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field28 > var12 && var14 < this.field3) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var32--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method85(var12, var14) - arg4.method85(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg4.method85(var13, var14) - arg4.method85(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class23.field318[var39] = -1;
                            class160.field2427[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field7855 ? class475.field6876[var19] : class417.field6045[var19];
                        this.method12(var11, var12, var9, var19, var14, var18, arg2, this.field3, -5596, var26, var8, var27, this.field28, var20);
                        boolean var41 = var26 != null && var26.field7857 != var26.field7856;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class23.field318[var42] >= 0 && class503.field7359[var42] != class105.field1723[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class329.method1940(var18[1], class375.method2245(class160.field2427[2], class160.field2427[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class329.method1940(var18[3], class375.method2245(class160.field2427[6], class160.field2427[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class329.method1940(var18[0], class375.method2245(class160.field2427[0], class160.field2427[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class329.method1940(var18[2], class375.method2245(class160.field2427[4], class160.field2427[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var47 = class88.field1422[var19];
                            var48 = var27 == null ? 0 : class450.field6592[var19];
                            var45 = class18.field283[var19];
                            var49 = class494.field7144[var19];
                            var46 = var26 == null ? 0 : class79.field1121[var19];
                        } else if (var17) {
                            var46 = var26 == null ? 0 : class172.field2595[var19];
                            var44 = class288.field3904[var19];
                            var45 = class225.field3181[var19];
                            var49 = class56.field822[var19];
                            var48 = var27 == null ? 0 : class533.field7850[var19];
                            var47 = class410.field5817[var19];
                        } else {
                            var45 = class276.field3740[var19];
                            var44 = class274.field3720[var19];
                            var46 = var26 == null ? 0 : class302.field4116[var19];
                            var47 = class309.field4209[var19];
                            var48 = var27 == null ? 0 : class480.field6948[var19];
                            var49 = class426.field6204[var19];
                        }
                        int var50 = var46 + var48;
                        if (var50 <= 0) {
                            class492.method2913(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field7857;
                                var63 = arg2.method551() ? var26.field7853 : var26.field7863;
                                var64 = var26.field7870;
                                int var65 = class526.method3118((byte) -85, arg2, var26);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 1;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 1;
                                        class139.field2081[4] = var49[var51];
                                        class139.field2081[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 5;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 5;
                                        class139.field2081[4] = var49[var51];
                                        class139.field2081[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 3;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 3;
                                        class139.field2081[4] = var49[var51];
                                        var68 = 6;
                                        class139.field2081[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 7;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 7;
                                        class139.field2081[4] = var49[var51];
                                        var68 = 6;
                                        class139.field2081[5] = var45[var51];
                                    } else {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = var49[var51];
                                        var68 = 3;
                                        class139.field2081[2] = var45[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class139.field2081[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field1[var70];
                                        int var73 = this.field22[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = var73;
                                            var74 = 128 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 128 - var73;
                                            var75 = 128 - var72;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 128 - var73;
                                        } else {
                                            var74 = var73;
                                            var75 = var72;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class339.field4915[var19][var70]) {
                                            int var76 = (var12 << 7) + var75;
                                            int var77 = (var14 << 7) + var74;
                                            var60[var52] = arg1.method79(var76, var77) - arg4.method79(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class339.field4915[var19][var70]) {
                                                int var78 = (var12 << 7) + var75;
                                                int var79 = (var14 << 7) + var74;
                                                var61[var52] = arg4.method79(var78, var79) - arg1.method79(var78, var79);
                                            } else if (arg3 != null && !class522.field7649[var19][var70]) {
                                                int var80 = (var12 << 7) + var75;
                                                int var81 = (var14 << 7) + var74;
                                                var61[var52] = arg3.method79(var80, var81) - arg4.method79(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field7862 < class23.field318[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class503.field7359[var71];
                                            }
                                            var59[var52] = class285.field3866[var71];
                                            var58[var52] = class374.field5383[var71];
                                            var57[var52] = class105.field1723[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method551() ? var26.field7853 : var26.field7863;
                                            var59[var52] = var26.field7870;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field29 && arg6 == 0) {
                                    class334.method2045(var12, var14, var26.field7867, var26.field7865 * 8, var26.field7859);
                                }
                                if (var19 != 12 && var26.field7857 != -1 && var26.field7871) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class79.field1121[var19];
                            } else if (var17) {
                                var51 += class172.field2595[var19];
                            } else {
                                var51 += class302.field4116[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class479 var82 = this.field19.method619(var22 - 1, (byte) -72);
                                class479 var83 = this.field19.method619(var23 - 1, (byte) -128);
                                class479 var84 = this.field19.method619(var24 - 1, (byte) -128);
                                class479 var85 = this.field19.method619(var25 - 1, (byte) -91);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 1;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 1;
                                        class139.field2081[4] = var49[var51];
                                        var88 = 6;
                                        class139.field2081[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 5;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 5;
                                        class139.field2081[4] = var49[var51];
                                        var88 = 6;
                                        class139.field2081[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 3;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 3;
                                        class139.field2081[4] = var49[var51];
                                        var88 = 6;
                                        class139.field2081[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = 7;
                                        class139.field2081[2] = var45[var51];
                                        class139.field2081[3] = 7;
                                        class139.field2081[4] = var49[var51];
                                        class139.field2081[5] = var45[var51];
                                        var88 = 6;
                                    } else {
                                        class139.field2081[0] = var47[var51];
                                        class139.field2081[1] = var49[var51];
                                        var88 = 3;
                                        class139.field2081[2] = var45[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class139.field2081[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field1[var90];
                                        int var93 = this.field22[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 128 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var95 = 128 - var92;
                                            var94 = 128 - var93;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 128 - var93;
                                        } else {
                                            var94 = var93;
                                            var95 = var92;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class339.field4915[var19][var90]) {
                                            int var96 = (var12 << 7) + var95;
                                            int var97 = (var14 << 7) + var94;
                                            var60[var52] = arg1.method79(var96, var97) - arg4.method79(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class339.field4915[var19][var90]) {
                                                int var98 = (var12 << 7) + var95;
                                                int var99 = (var14 << 7) + var94;
                                                var61[var52] = arg4.method79(var98, var99) - arg1.method79(var98, var99);
                                            } else if (arg3 != null && !class522.field7649[var19][var90]) {
                                                int var100 = (var12 << 7) + var95;
                                                int var101 = (var14 << 7) + var94;
                                                var61[var52] = arg3.method79(var100, var101) - arg4.method79(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class23.field318[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class503.field7359[var91];
                                            }
                                            var59[var52] = class285.field3866[var91];
                                            var58[var52] = class374.field5383[var91];
                                            var57[var52] = class105.field1723[var91];
                                        } else {
                                            if (var17 && class339.field4915[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var82.field6928;
                                                var59[var52] = var82.field6923;
                                            } else if (var95 == 0 && var94 == 128) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var83.field6928;
                                                var59[var52] = var83.field6923;
                                            } else if (var95 == 128 && var94 == 128) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var84.field6928;
                                                var59[var52] = var84.field6923;
                                            } else if (var95 == 128 && var94 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var85.field6928;
                                                var59[var52] = var85.field6923;
                                            } else {
                                                if (var95 < 64) {
                                                    if (var94 >= 64) {
                                                        var58[var52] = var83.field6928;
                                                        var59[var52] = var83.field6923;
                                                    } else {
                                                        var58[var52] = var82.field6928;
                                                        var59[var52] = var82.field6923;
                                                    }
                                                } else if (var94 >= 64) {
                                                    var58[var52] = var84.field6928;
                                                    var59[var52] = var84.field6923;
                                                } else {
                                                    var58[var52] = var85.field6928;
                                                    var59[var52] = var85.field6923;
                                                }
                                                int var102 = class409.method2396(true, arg0[var12][var14], var95 << 7 >> 7, arg0[var13][var14]);
                                                int var103 = class409.method2396(true, arg0[var12][var15], var95 << 7 >> 7, arg0[var13][var15]);
                                                var57[var52] = class409.method2396(true, var102, var94 << 7 >> 7, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field6929) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg4.method85(var12, var14);
                            int var105 = arg4.method85(var13, var14);
                            int var106 = arg4.method85(var13, var15);
                            int var107 = arg4.method85(var12, var15);
                            if (arg6 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field7864) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field12[arg6][var12][var14] = (byte) class219.method1367(this.field12[arg6][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field29) {
                                var109 = class55.method361(var12, var14);
                                var110 = class76.method595(var12, var14);
                                var111 = class308.method1782(var12, var14);
                            }
                            arg4.method78(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class492.method2913(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBIIII)V")
    private final void method8(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4;
        if (arg1 > -68) {
            this.field26 = null;
        }
        while (var7 < arg4 + arg5) {
            for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
                if (var10 >= 0 && this.field28 > var10 && var7 >= 0 && var7 < this.field3) {
                    this.field6[arg3][var10][var7] = arg3 > 0 ? this.field6[arg3 - 1][var10][var7] - 240 : 0;
                }
            }
            var7++;
        }
        field11++;
        if (arg2 > 0 && this.field28 > arg2) {
            for (int var8 = arg4 + 1; var8 < arg4 + arg5; var8++) {
                if (var8 >= 0 && var8 < this.field3) {
                    this.field6[arg3][arg2][var8] = this.field6[arg3][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < this.field3) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg0; var9++) {
                if (var9 >= 0 && var9 < this.field28) {
                    this.field6[arg3][var9][arg4] = this.field6[arg3][var9][arg4 - 1];
                }
            }
        }
        if (arg2 < 0 || arg4 < 0 || this.field28 <= arg2 || this.field3 <= arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 > 0 && this.field6[arg3][arg2 - 1][arg4] != 0) {
                this.field6[arg3][arg2][arg4] = this.field6[arg3][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field6[arg3][arg2][arg4 - 1] != 0) {
                this.field6[arg3][arg2][arg4] = this.field6[arg3][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && this.field6[arg3][arg2 - 1][arg4 - 1] != 0) {
                this.field6[arg3][arg2][arg4] = this.field6[arg3][arg2 - 1][arg4 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field6[arg3 - 1][arg2 - 1][arg4] == this.field6[arg3][arg2 - 1][arg4]) {
            if (arg4 > 0 && this.field6[arg3 - 1][arg2][arg4 - 1] != this.field6[arg3][arg2][arg4 - 1]) {
                this.field6[arg3][arg2][arg4] = this.field6[arg3][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && this.field6[arg3 - 1][arg2 - 1][arg4 - 1] != this.field6[arg3][arg2 - 1][arg4 - 1]) {
                this.field6[arg3][arg2][arg4] = this.field6[arg3][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            this.field6[arg3][arg2][arg4] = this.field6[arg3][arg2 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IILsv;IZIIIIII)V")
    private final void method9(int arg0, int arg1, class319 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2++;
        if (arg1 == 1) {
            arg6 = 1;
        } else if (arg1 == 2) {
            arg6 = 1;
            arg8 = 1;
        } else if (arg1 == 3) {
            arg8 = 1;
        }
        if (arg7 >= 0 && arg7 < this.field28 && arg10 >= 0 && this.field3 > arg10) {
            if (!this.field29 && !arg4) {
                class27.field379[arg3][arg7][arg10] = 0;
            }
            while (true) {
                int var12 = arg2.method1869(-127);
                if (var12 == 0) {
                    if (this.field29) {
                        this.field6[0][arg7 + arg8][arg6 + arg10] = 0;
                    } else if (arg3 == 0) {
                        this.field6[0][arg7 + arg8][arg6 + arg10] = -class391.method2322((byte) -101, arg9 + 932731, arg5 + 556238) * 8 << 0;
                    } else {
                        this.field6[arg3][arg7 + arg8][arg6 + arg10] = this.field6[arg3 - 1][arg7 + arg8][arg6 + arg10] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg2.method1869(-96);
                    if (this.field29) {
                        this.field6[0][arg7 + arg8][arg6 + arg10] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg3 == 0) {
                            this.field6[0][arg7 + arg8][arg6 + arg10] = -var13 * 8 << 0;
                        } else {
                            this.field6[arg3][arg7 + arg8][arg10 + arg6] = this.field6[arg3 - 1][arg7 + arg8][arg6 + arg10] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg4) {
                        arg2.method1869(arg0 - 107);
                    } else {
                        this.field14[arg3][arg7][arg10] = arg2.method1894(-2018);
                        this.field26[arg3][arg7][arg10] = (byte) ((var12 - 2) / 4);
                        this.field9[arg3][arg7][arg10] = (byte) class375.method2245(arg1 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!this.field29 && !arg4) {
                        class27.field379[arg3][arg7][arg10] = (byte) (var12 - 49);
                    }
                } else if (!arg4) {
                    this.field27[arg3][arg7][arg10] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg2.method1869(-104);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg2.method1869(arg0 - 64);
                    break;
                }
                if (var14 <= 49) {
                    arg2.method1869(-69);
                }
            }
        }
        if (arg0 != -2) {
            this.method9(-1, 91, null, -81, false, -14, 53, 120, -70, 113, 94);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lya;Lza;ILya;)V")
    public final void method10(class11 arg0, class295 arg1, int arg2, class11 arg3) {
        field4++;
        if (arg2 != -14205) {
            return;
        }
        int[][] var5 = new int[this.field28][this.field3];
        if (class26.field365 == null || class26.field365.length != this.field3) {
            class35.field542 = new int[this.field3];
            class417.field6047 = new int[this.field3];
            class26.field365 = new int[this.field3];
            class527.field7696 = new int[this.field3];
            class161.field2437 = new int[this.field3];
        }
        for (int var6 = 0; var6 < this.field17; var6++) {
            for (int var8 = 0; var8 < this.field3; var8++) {
                class26.field365[var8] = 0;
                class161.field2437[var8] = 0;
                class527.field7696[var8] = 0;
                class417.field6047[var8] = 0;
                class35.field542[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field28; var9++) {
                for (int var10 = 0; var10 < this.field3; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field28 > var19) {
                        int var20 = this.field27[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class479 var21 = this.field19.method619(var20 - 1, (byte) -86);
                            class26.field365[var10] += var21.field6930;
                            class161.field2437[var10] += var21.field6921;
                            class527.field7696[var10] += var21.field6919;
                            class417.field6047[var10] += var21.field6920;
                            var10002 = class35.field542[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field27[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class479 var24 = this.field19.method619(var23 - 1, (byte) -55);
                            class26.field365[var10] -= var24.field6930;
                            class161.field2437[var10] -= var24.field6921;
                            class527.field7696[var10] -= var24.field6919;
                            class417.field6047[var10] -= var24.field6920;
                            var10002 = class35.field542[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3; var16++) {
                        int var17 = var16 + 5;
                        if (this.field3 > var17) {
                            var11 += class26.field365[var17];
                            var12 += class161.field2437[var17];
                            var14 += class417.field6047[var17];
                            var13 += class527.field7696[var17];
                            var15 += class35.field542[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class26.field365[var18];
                            var15 -= class35.field542[var18];
                            var13 -= class527.field7696[var18];
                            var12 -= class161.field2437[var18];
                            var14 -= class417.field6047[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class458.method2673(var13 / var15, false, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class116.field1839) {
                this.method7(var5, var6 == 0 ? arg3 : null, arg1, var6 == 0 ? arg0 : null, class492.field7122[var6], arg2 ^ 0xFFFFC883, var6);
            } else {
                this.method2(arg1, (byte) 84, var6 == 0 ? arg0 : null, var5, class492.field7122[var6], var6, var6 == 0 ? arg3 : null);
            }
            this.field27[var6] = null;
            this.field14[var6] = null;
            this.field26[var6] = null;
            this.field9[var6] = null;
        }
        if (!this.field29) {
            if (class153.field2361 != 0) {
                class385.method2283();
            }
            if (class123.field1906) {
                class75.method587();
            }
        }
        for (int var7 = 0; var7 < this.field17; var7++) {
            class492.field7122[var7].method81();
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIBIILsv;[Let;)V")
    public final void method11(int arg0, int arg1, byte arg2, int arg3, int arg4, class319 arg5, class466[] arg6) {
        if (!this.field29) {
            for (int var8 = 0; var8 < 4; var8++) {
                class466 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field28 && var13 >= 0 && var13 < this.field3) {
                            var9.method2708(var13, arg2 + 68, var12);
                        }
                    }
                }
            }
        }
        field13++;
        int var14 = arg0 + arg4;
        int var15 = arg1 + arg3;
        for (int var16 = 0; var16 < this.field17; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method9(-2, 0, arg5, var16, false, var15 + var18, 0, var17 + arg4, 0, var14 + var17, var18 - -arg3);
                }
            }
        }
        if (arg2 != -69) {
            field25 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([[BI[[BII[ZLza;IILtf;[[BLwm;II)V")
    private final void method12(byte[][] arg0, int arg1, byte[][] arg2, int arg3, int arg4, boolean[] arg5, class295 arg6, int arg7, int arg8, class534 arg9, byte[][] arg10, class479 arg11, int arg12, int arg13) {
        field23++;
        boolean[] var15 = arg9 != null && arg9.field7855 ? class475.field6876[arg3] : class417.field6045[arg3];
        if (arg4 > 0) {
            if (arg1 > 0) {
                int var16 = arg0[arg1 - 1][arg4 - 1] & 0xFF;
                if (var16 > 0) {
                    class534 var17 = this.field18.method272(var16 - 1, (byte) -7);
                    if (var17.field7857 != -1 && var17.field7855) {
                        byte var18 = arg10[arg1 - 1][arg4 - 1];
                        int var19 = arg2[arg1 - 1][arg4 - 1] * 2 + 4 & 0x7;
                        int var20 = class526.method3118((byte) -94, arg6, var17);
                        if (class339.field4915[var18][var19]) {
                            class105.field1723[0] = var17.field7857;
                            class503.field7359[0] = var20;
                            class374.field5383[0] = arg6.method551() ? var17.field7853 : var17.field7863;
                            class285.field3866[0] = var17.field7870;
                            class23.field318[0] = var17.field7862;
                            class160.field2427[0] = 256;
                        }
                    }
                }
            }
            if (arg1 < arg12 - 1) {
                int var21 = arg0[arg1 + 1][arg4 - 1] & 0xFF;
                if (var21 > 0) {
                    class534 var22 = this.field18.method272(var21 - 1, (byte) -7);
                    if (var22.field7857 != -1 && var22.field7855) {
                        byte var23 = arg10[arg1 + 1][arg4 - 1];
                        int var24 = (arg2[arg1 + 1][arg4 - 1] * 2) + 6 & 0x7;
                        int var25 = class526.method3118((byte) 120, arg6, var22);
                        if (class339.field4915[var23][var24]) {
                            class105.field1723[2] = var22.field7857;
                            class503.field7359[2] = var25;
                            class374.field5383[2] = arg6.method551() ? var22.field7853 : var22.field7863;
                            class285.field3866[2] = var22.field7870;
                            class23.field318[2] = var22.field7862;
                            class160.field2427[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg8 != -5596) {
            this.field14 = null;
        }
        if ((arg7 - 1) > arg4) {
            if (arg1 > 0) {
                int var26 = arg0[arg1 - 1][arg4 + 1] & 0xFF;
                if (var26 > 0) {
                    class534 var27 = this.field18.method272(var26 - 1, (byte) -7);
                    if (var27.field7857 != -1 && var27.field7855) {
                        byte var28 = arg10[arg1 - 1][arg4 + 1];
                        int var29 = (arg2[arg1 - 1][arg4 + 1] * 2) + 2 & 0x7;
                        int var30 = class526.method3118((byte) 124, arg6, var27);
                        if (class339.field4915[var28][var29]) {
                            class105.field1723[6] = var27.field7857;
                            class503.field7359[6] = var30;
                            class374.field5383[6] = arg6.method551() ? var27.field7853 : var27.field7863;
                            class285.field3866[6] = var27.field7870;
                            class23.field318[6] = var27.field7862;
                            class160.field2427[6] = 64;
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg1) {
                int var31 = arg0[arg1 + 1][arg4 + 1] & 0xFF;
                if (var31 > 0) {
                    class534 var32 = this.field18.method272(var31 - 1, (byte) -7);
                    if (var32.field7857 != -1 && var32.field7855) {
                        byte var33 = arg10[arg1 + 1][arg4 + 1];
                        int var34 = arg2[arg1 + 1][arg4 + 1] * 2 & 0x7;
                        int var35 = class526.method3118((byte) -90, arg6, var32);
                        if (class339.field4915[var33][var34]) {
                            class105.field1723[4] = var32.field7857;
                            class503.field7359[4] = var35;
                            class374.field5383[4] = arg6.method551() ? var32.field7853 : var32.field7863;
                            class285.field3866[4] = var32.field7870;
                            class23.field318[4] = var32.field7862;
                            class160.field2427[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg4 > 0) {
            int var36 = arg0[arg1][arg4 - 1] & 0xFF;
            if (var36 > 0) {
                class534 var37 = this.field18.method272(var36 - 1, (byte) -7);
                if (var37.field7857 != -1) {
                    byte var38 = arg10[arg1][arg4 - 1];
                    byte var39 = arg2[arg1][arg4 - 1];
                    if (var37.field7855) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class526.method3118((byte) -120, arg6, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class339.field4915[var38][var41] && class23.field318[var40] <= var37.field7862) {
                                class105.field1723[var40] = var37.field7857;
                                class503.field7359[var40] = var42;
                                class374.field5383[var40] = arg6.method551() ? var37.field7853 : var37.field7863;
                                class285.field3866[var40] = var37.field7870;
                                if (class23.field318[var40] == var37.field7862) {
                                    class160.field2427[var40] = class219.method1367(class160.field2427[var40], 32);
                                } else {
                                    class160.field2427[var40] = 32;
                                }
                                class23.field318[var40] = var37.field7862;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg13 & 0x3]) {
                            arg5[0] = class475.field6876[var38][class375.method2245(3, var39 + 2)];
                        }
                    } else if (!var15[-(-arg13) & 0x3]) {
                        arg5[0] = class417.field6045[var38][class375.method2245(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg7 - 1) > arg4) {
            int var44 = arg0[arg1][arg4 + 1] & 0xFF;
            if (var44 > 0) {
                class534 var45 = this.field18.method272(var44 - 1, (byte) -7);
                if (var45.field7857 != -1) {
                    byte var46 = arg10[arg1][arg4 + 1];
                    byte var47 = arg2[arg1][arg4 + 1];
                    if (var45.field7855) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class526.method3118((byte) -71, arg6, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class339.field4915[var46][var49] && class23.field318[var48] <= var45.field7862) {
                                class105.field1723[var48] = var45.field7857;
                                class503.field7359[var48] = var50;
                                class374.field5383[var48] = arg6.method551() ? var45.field7853 : var45.field7863;
                                class285.field3866[var48] = var45.field7870;
                                if (class23.field318[var48] == var45.field7862) {
                                    class160.field2427[var48] = class219.method1367(class160.field2427[var48], 16);
                                } else {
                                    class160.field2427[var48] = 16;
                                }
                                class23.field318[var48] = var45.field7862;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg13 + 2 & 0x3]) {
                            arg5[2] = class475.field6876[var46][class375.method2245(var47, 3)];
                        }
                    } else if (!var15[arg13 + 2 & 0x3]) {
                        arg5[2] = class417.field6045[var46][class375.method2245(3, var47)];
                    }
                }
            }
        }
        if (arg1 > 0) {
            int var52 = arg0[arg1 - 1][arg4] & 0xFF;
            if (var52 > 0) {
                class534 var53 = this.field18.method272(var52 - 1, (byte) -7);
                if (var53.field7857 != -1) {
                    byte var54 = arg10[arg1 - 1][arg4];
                    byte var55 = arg2[arg1 - 1][arg4];
                    if (var53.field7855) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class526.method3118((byte) 44, arg6, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class339.field4915[var54][var57] && var53.field7862 >= class23.field318[var56]) {
                                class105.field1723[var56] = var53.field7857;
                                class503.field7359[var56] = var58;
                                class374.field5383[var56] = arg6.method551() ? var53.field7853 : var53.field7863;
                                class285.field3866[var56] = var53.field7870;
                                if (class23.field318[var56] == var53.field7862) {
                                    class160.field2427[var56] = class219.method1367(class160.field2427[var56], 8);
                                } else {
                                    class160.field2427[var56] = 8;
                                }
                                class23.field318[var56] = var53.field7862;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg13 + 3 & 0x3]) {
                            arg5[3] = class475.field6876[var54][class375.method2245(3, var55 + 1)];
                        }
                    } else if (!var15[arg13 + 3 & 0x3]) {
                        arg5[3] = class417.field6045[var54][class375.method2245(var55 + 1, 3)];
                    }
                }
            }
        }
        if ((arg12 - 1) > arg1) {
            int var60 = arg0[arg1 + 1][arg4] & 0xFF;
            if (var60 > 0) {
                class534 var61 = this.field18.method272(var60 - 1, (byte) -7);
                if (var61.field7857 != -1) {
                    byte var62 = arg10[arg1 + 1][arg4];
                    byte var63 = arg2[arg1 + 1][arg4];
                    if (var61.field7855) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class526.method3118((byte) 125, arg6, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class339.field4915[var62][var65] && var61.field7862 >= class23.field318[var64]) {
                                class105.field1723[var64] = var61.field7857;
                                class503.field7359[var64] = var66;
                                class374.field5383[var64] = arg6.method551() ? var61.field7853 : var61.field7863;
                                class285.field3866[var64] = var61.field7870;
                                if (class23.field318[var64] == var61.field7862) {
                                    class160.field2427[var64] = class219.method1367(class160.field2427[var64], 4);
                                } else {
                                    class160.field2427[var64] = 4;
                                }
                                class23.field318[var64] = var61.field7862;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg13 + 1 & 0x3]) {
                            arg5[1] = class475.field6876[var62][class375.method2245(var63 + 3, 3)];
                        }
                    } else if (!var15[arg13 + 1 & 0x3]) {
                        arg5[1] = class417.field6045[var62][class375.method2245(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var68 = class526.method3118((byte) 35, arg6, arg9);
        if (!arg9.field7855) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg13 * 2) & 0x7;
            if (class339.field4915[arg3][var69] && arg9.field7862 >= class23.field318[var70]) {
                class105.field1723[var70] = arg9.field7857;
                class503.field7359[var70] = var68;
                class374.field5383[var70] = arg6.method551() ? arg9.field7853 : arg9.field7863;
                class285.field3866[var70] = arg9.field7870;
                if (class23.field318[var70] == arg9.field7862) {
                    class160.field2427[var70] = class219.method1367(class160.field2427[var70], 2);
                } else {
                    class160.field2427[var70] = 2;
                }
                class23.field318[var70] = arg9.field7862;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static final void method13(int arg0) {
        field15++;
        for (class221 var1 = (class221) class240.field3321.method2596(true); var1 != null; var1 = (class221) class240.field3321.method2596(true)) {
            class19.method131(arg0 - 4538, var1);
        }
        int var2;
        int var3;
        if (class76.field1075.method1104(class195.field2849, 0)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class315.field4267;
            var2 = class315.field4267;
        }
        client.method3051();
        int var4 = var2;
        if (arg0 != 4545) {
            field25 = null;
        }
        while (var3 >= var4) {
            client.method3052();
            client.method3059(var4);
            client.method3055(var4);
            var4++;
        }
        client.method3050();
        client.method3062();
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(IIIZLrq;Lm;)V")
    public class1(int arg0, int arg1, int arg2, boolean arg3, class39 arg4, class80 arg5) {
        this.field18 = arg4;
        this.field17 = arg0;
        this.field29 = arg3;
        this.field28 = arg1;
        this.field19 = arg5;
        this.field3 = arg2;
        this.field6 = new int[this.field17][this.field28 + 1][this.field3 + 1];
        this.field14 = new byte[this.field17][this.field28][this.field3];
        this.field12 = new byte[this.field17][this.field28 + 1][this.field3 + 1];
        this.field26 = new byte[this.field17][this.field28][this.field3];
        this.field27 = new byte[this.field17][this.field28][this.field3];
        this.field9 = new byte[this.field17][this.field28][this.field3];
    }

    static {
        new class157("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field16 = 0;
    }
}
