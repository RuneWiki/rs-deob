import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class761 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
    private int[] field10533 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
    private int[] field10549 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lui;")
    private class556 field10545;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public int field10554;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field10536;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Z")
    public boolean field10544;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field10531;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Loo;")
    private class12 field10552;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[[[B")
    public byte[][][] field10542;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[[[B")
    private byte[][][] field10528;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[[[B")
    private byte[][][] field10548;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[[[I")
    public int[][][] field10529;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[[[B")
    private byte[][][] field10550;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[[[B")
    private byte[][][] field10537;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "J")
    public static long field10538 = -1L;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field10532;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field10556;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "[[[B")
    public byte[][][] field10555;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIILol;ZII)V", line = 3)
    private final void method4199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class431 arg7, boolean arg8, int arg9, int arg10) {
        field10534++;
        if (arg2 == 1) {
            arg6 = 1;
        } else if (arg2 == 2) {
            arg9 = 1;
            arg6 = 1;
        } else if (arg2 == 3) {
            arg9 = 1;
        }
        if (arg0 != -32454) {
            return;
        }
        if (arg4 < 0 || arg4 >= this.field10536 || arg1 < 0 || this.field10554 <= arg1) {
            while (true) {
                int var14 = arg7.method2557(arg0 ^ 0xFFFFBB6B);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method2557(14929);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method2557(14929);
                }
            }
        }
        if (!this.field10544 && !arg8) {
            class336.field4782[arg3][arg4][arg1] = 0;
        }
        while (true) {
            int var12 = arg7.method2557(14929);
            if (var12 == 0) {
                if (this.field10544) {
                    this.field10529[0][arg4 + arg9][arg1 + arg6] = 0;
                    return;
                } else if (arg3 == 0) {
                    this.field10529[0][arg4 + arg9][arg1 + arg6] = -class77.method698((byte) 97, arg5 + 556238, arg10 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field10529[arg3][arg4 + arg9][arg1 + arg6] = this.field10529[arg3 - 1][arg4 + arg9][arg1 + arg6] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method2557(14929);
                if (!this.field10544) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 == 0) {
                        this.field10529[0][arg4 + arg9][arg1 + arg6] = -var13 * 8 << 2;
                        return;
                    }
                    this.field10529[arg3][arg4 + arg9][arg1 + arg6] = this.field10529[arg3 - 1][arg4 + arg9][arg1 + arg6] - (var13 * 8 << 2);
                    return;
                }
                this.field10529[0][arg4 + arg9][arg1 + arg6] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg8) {
                    arg7.method2557(14929);
                } else {
                    this.field10550[arg3][arg4][arg1] = arg7.method2529(117);
                    this.field10548[arg3][arg4][arg1] = (byte) ((var12 - 2) / 4);
                    this.field10537[arg3][arg4][arg1] = (byte) class194.method1380(arg2 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field10544 && !arg8) {
                    class336.field4782[arg3][arg4][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg8) {
                this.field10528[arg3][arg4][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V", line = 132)
    public final void method4200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10543++;
        for (int var7 = arg1; var7 < (arg0 + arg1); var7++) {
            for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
                if (var10 >= 0 && var10 < this.field10536 && var7 >= 0 && var7 < this.field10554) {
                    this.field10529[arg2][var10][var7] = arg2 <= 0 ? 0 : this.field10529[arg2 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg5 > 0 && this.field10536 > arg5) {
            for (int var8 = arg1 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && var8 < this.field10554) {
                    this.field10529[arg2][arg5][var8] = this.field10529[arg2][arg5 - 1][var8];
                }
            }
        }
        if (arg3 < arg1 && arg1 < this.field10554) {
            for (int var9 = arg5 + 1; var9 < arg4 + arg5; var9++) {
                if (var9 >= 0 && var9 < this.field10536) {
                    this.field10529[arg2][var9][arg1] = this.field10529[arg2][var9][arg1 - 1];
                }
            }
        }
        if (arg5 < 0 || arg1 < 0 || arg5 >= this.field10536 || this.field10554 <= arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 > 0 && this.field10529[arg2][arg5 - 1][arg1] != 0) {
                this.field10529[arg2][arg5][arg1] = this.field10529[arg2][arg5 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field10529[arg2][arg5][arg1 - 1] != 0) {
                this.field10529[arg2][arg5][arg1] = this.field10529[arg2][arg5][arg1 - 1];
                return;
            }
            if (arg5 > 0 && arg1 > 0 && this.field10529[arg2][arg5 - 1][arg1 - 1] != 0) {
                this.field10529[arg2][arg5][arg1] = this.field10529[arg2][arg5 - 1][arg1 - 1];
                return;
            }
        } else if (arg5 <= 0 || this.field10529[arg2][arg5 - 1][arg1] == this.field10529[arg2 - 1][arg5 - 1][arg1]) {
            if (arg1 <= 0 || this.field10529[arg2 - 1][arg5][arg1 - 1] == this.field10529[arg2][arg5][arg1 - 1]) {
                if (arg5 > 0 && arg1 > 0 && this.field10529[arg2 - 1][arg5 - 1][arg1 - 1] != this.field10529[arg2][arg5 - 1][arg1 - 1]) {
                    this.field10529[arg2][arg5][arg1] = this.field10529[arg2][arg5 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field10529[arg2][arg5][arg1] = this.field10529[arg2][arg5][arg1 - 1];
        } else {
            this.field10529[arg2][arg5][arg1] = this.field10529[arg2][arg5 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ls;I[[ILha;Ls;BLs;)V", line = 226)
    private final void method4201(class419 arg0, int arg1, int[][] arg2, class475 arg3, class419 arg4, byte arg5, class419 arg6) {
        for (int var8 = 0; var8 < this.field10536; var8++) {
            for (int var9 = 0; var9 < this.field10554; var9++) {
                if (class374.field5255 == -1 || class530.method3091(var8, class374.field5255, -73, var9, arg1)) {
                    byte var10 = this.field10548[arg1][var8][var9];
                    byte var11 = this.field10537[arg1][var8][var9];
                    int var12 = this.field10550[arg1][var8][var9] & 0xFF;
                    int var13 = this.field10528[arg1][var8][var9] & 0xFF;
                    class405 var14 = var12 == 0 ? null : this.field10552.method159(var12 - 1, 0);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class100 var15 = var13 == 0 ? null : this.field10545.method3210(1, var13 - 1);
                    class405 var16 = var14;
                    if (var14 != null && var14.field5567 == -1 && var14.field5566 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class739.field10241[var10];
                        int var18 = class4.field59[var10];
                        int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field5564;
                        int var23 = var15 == null ? -1 : var15.field1487;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field5566 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class713.field9956[var10][var21];
                                var25[var20] = class771.field10641[var10][var21];
                                var26[var20] = class490.field6714[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field5570;
                                var27[var20] = var14.field5567;
                                if (var30 != null) {
                                    var30[var20] = var14.field5566;
                                }
                                var20++;
                                var21++;
                            }
                            if (!this.field10544 && arg1 == 0) {
                                class404.method2396(var8, var9, var14.field5582, var14.field5579 * 8, var14.field5577);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class713.field9956[var10][var21];
                                var25[var20] = class771.field10641[var10][var21];
                                var26[var20] = class490.field6714[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field1488;
                                var27[var20] = arg2[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field10549.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg0 == null ? null : new int[var33];
                        int[] var37 = arg0 == null && arg4 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field10549[var38];
                            int var49 = this.field10533[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class623.field8829[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg0.method2478(true, var53, var52) - arg6.method2478(true, var53, var52);
                            }
                            if (var37 != null) {
                                if (arg0 != null && !class623.field8829[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg6.method2478(true, var55, var54) - arg0.method2478(true, var55, var54);
                                } else if (arg4 != null && !class311.field4414[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg4.method2478(true, var57, var56) - arg6.method2478(true, var57, var56);
                                }
                            }
                        }
                        int var39 = arg6.method2476(var9, var8, arg5 ^ 0x2D);
                        int var40 = arg6.method2476(var9, var8 + 1, -1);
                        int var41 = arg6.method2476(var9 + 1, var8 + 1, -1);
                        int var42 = arg6.method2476(var9 + 1, var8, arg5 ^ 0x2D);
                        boolean var43 = class717.method3994(arg5 + 32327, var8, var9);
                        if (var43 && arg1 > 1 || !var43 && arg1 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field1482) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field5574) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field10542[arg1][var8][var9] = (byte) class694.method3895(this.field10542[arg1][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field10544) {
                            var45 = class661.method3703(var8, var9);
                            var46 = class143.method1148(var8, var9);
                            var47 = class203.method1426(var8, var9);
                        }
                        arg6.method826(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class307.method1891(arg1, var8, var9);
                    }
                }
            }
        }
        field10532++;
        if (arg5 != -46) {
            this.field10552 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([[BLnaa;Lha;Lhca;II[[BI[[B[ZIIIZ)V", line = 511)
    private final void method4202(byte[][] arg0, class100 arg1, class475 arg2, class405 arg3, int arg4, int arg5, byte[][] arg6, int arg7, byte[][] arg8, boolean[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg13) {
            this.field10552 = null;
        }
        field10556++;
        boolean[] var15 = arg3 != null && arg3.field5581 ? class673.field9418[arg11] : class578.field8332[arg11];
        if (arg7 > 0) {
            if (arg10 > 0) {
                int var16 = arg8[arg10 - 1][arg7 - 1] & 0xFF;
                if (var16 > 0) {
                    class405 var17 = this.field10552.method159(var16 - 1, 0);
                    if (var17.field5567 != -1 && var17.field5581) {
                        byte var18 = arg0[arg10 - 1][arg7 - 1];
                        int var19 = arg6[arg10 - 1][arg7 - 1] * 2 + 4 & 0x7;
                        int var20 = class315.method1916(1695945640, arg2, var17);
                        if (class623.field8829[var18][var19]) {
                            class278.field4012[0] = var17.field5567;
                            class661.field9310[0] = var20;
                            class548.field7628[0] = var17.field5564;
                            class351.field4974[0] = var17.field5570;
                            class613.field8703[0] = var17.field5569;
                            class459.field6268[0] = 256;
                        }
                    }
                }
            }
            if (arg10 < arg5 - 1) {
                int var21 = arg8[arg10 + 1][arg7 - 1] & 0xFF;
                if (var21 > 0) {
                    class405 var22 = this.field10552.method159(var21 - 1, 0);
                    if (var22.field5567 != -1 && var22.field5581) {
                        byte var23 = arg0[arg10 + 1][arg7 - 1];
                        int var24 = (arg6[arg10 + 1][arg7 - 1] * 2) + 6 & 0x7;
                        int var25 = class315.method1916(1695945640, arg2, var22);
                        if (class623.field8829[var23][var24]) {
                            class278.field4012[2] = var22.field5567;
                            class661.field9310[2] = var25;
                            class548.field7628[2] = var22.field5564;
                            class351.field4974[2] = var22.field5570;
                            class613.field8703[2] = var22.field5569;
                            class459.field6268[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg12 - 1 > arg7) {
            if (arg10 > 0) {
                int var26 = arg8[arg10 - 1][arg7 + 1] & 0xFF;
                if (var26 > 0) {
                    class405 var27 = this.field10552.method159(var26 - 1, 0);
                    if (var27.field5567 != -1 && var27.field5581) {
                        byte var28 = arg0[arg10 - 1][arg7 + 1];
                        int var29 = arg6[arg10 - 1][arg7 + 1] * 2 + 2 & 0x7;
                        int var30 = class315.method1916(1695945640, arg2, var27);
                        if (class623.field8829[var28][var29]) {
                            class278.field4012[6] = var27.field5567;
                            class661.field9310[6] = var30;
                            class548.field7628[6] = var27.field5564;
                            class351.field4974[6] = var27.field5570;
                            class613.field8703[6] = var27.field5569;
                            class459.field6268[6] = 64;
                        }
                    }
                }
            }
            if (arg10 < (arg5 - 1)) {
                int var31 = arg8[arg10 + 1][arg7 + 1] & 0xFF;
                if (var31 > 0) {
                    class405 var32 = this.field10552.method159(var31 - 1, 0);
                    if (var32.field5567 != -1 && var32.field5581) {
                        byte var33 = arg0[arg10 + 1][arg7 + 1];
                        int var34 = arg6[arg10 + 1][arg7 + 1] * 2 & 0x7;
                        int var35 = class315.method1916(1695945640, arg2, var32);
                        if (class623.field8829[var33][var34]) {
                            class278.field4012[4] = var32.field5567;
                            class661.field9310[4] = var35;
                            class548.field7628[4] = var32.field5564;
                            class351.field4974[4] = var32.field5570;
                            class613.field8703[4] = var32.field5569;
                            class459.field6268[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg7 > 0) {
            int var36 = arg8[arg10][arg7 - 1] & 0xFF;
            if (var36 > 0) {
                class405 var37 = this.field10552.method159(var36 - 1, 0);
                if (var37.field5567 != -1) {
                    byte var38 = arg0[arg10][arg7 - 1];
                    byte var39 = arg6[arg10][arg7 - 1];
                    if (var37.field5581) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class315.method1916(1695945640, arg2, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class623.field8829[var38][var41] && var37.field5569 >= class613.field8703[var40]) {
                                class278.field4012[var40] = var37.field5567;
                                class661.field9310[var40] = var42;
                                class548.field7628[var40] = var37.field5564;
                                class351.field4974[var40] = var37.field5570;
                                if (class613.field8703[var40] == var37.field5569) {
                                    class459.field6268[var40] = class694.method3895(class459.field6268[var40], 32);
                                } else {
                                    class459.field6268[var40] = 32;
                                }
                                class613.field8703[var40] = var37.field5569;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg9[0] = class673.field9418[var38][class194.method1380(3, var39 + 2)];
                        }
                    } else if (!var15[arg4 & 0x3]) {
                        arg9[0] = class578.field8332[var38][class194.method1380(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg7 < arg12 - 1) {
            int var44 = arg8[arg10][arg7 + 1] & 0xFF;
            if (var44 > 0) {
                class405 var45 = this.field10552.method159(var44 - 1, 0);
                if (var45.field5567 != -1) {
                    byte var46 = arg0[arg10][arg7 + 1];
                    byte var47 = arg6[arg10][arg7 + 1];
                    if (var45.field5581) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class315.method1916(1695945640, arg2, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class623.field8829[var46][var49] && var45.field5569 >= class613.field8703[var48]) {
                                class278.field4012[var48] = var45.field5567;
                                class661.field9310[var48] = var50;
                                class548.field7628[var48] = var45.field5564;
                                class351.field4974[var48] = var45.field5570;
                                if (class613.field8703[var48] == var45.field5569) {
                                    class459.field6268[var48] = class694.method3895(class459.field6268[var48], 16);
                                } else {
                                    class459.field6268[var48] = 16;
                                }
                                class613.field8703[var48] = var45.field5569;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg9[2] = class673.field9418[var46][class194.method1380(var47, 3)];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg9[2] = class578.field8332[var46][class194.method1380(var47, 3)];
                    }
                }
            }
        }
        if (arg10 > 0) {
            int var52 = arg8[arg10 - 1][arg7] & 0xFF;
            if (var52 > 0) {
                class405 var53 = this.field10552.method159(var52 - 1, 0);
                if (var53.field5567 != -1) {
                    byte var54 = arg0[arg10 - 1][arg7];
                    byte var55 = arg6[arg10 - 1][arg7];
                    if (var53.field5581) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class315.method1916(1695945640, arg2, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class623.field8829[var54][var57] && var53.field5569 >= class613.field8703[var56]) {
                                class278.field4012[var56] = var53.field5567;
                                class661.field9310[var56] = var58;
                                class548.field7628[var56] = var53.field5564;
                                class351.field4974[var56] = var53.field5570;
                                if (class613.field8703[var56] == var53.field5569) {
                                    class459.field6268[var56] = class694.method3895(class459.field6268[var56], 8);
                                } else {
                                    class459.field6268[var56] = 8;
                                }
                                class613.field8703[var56] = var53.field5569;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg9[3] = class673.field9418[var54][class194.method1380(3, var55 + 1)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg9[3] = class578.field8332[var54][class194.method1380(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg5 - 1 > arg10) {
            int var60 = arg8[arg10 + 1][arg7] & 0xFF;
            if (var60 > 0) {
                class405 var61 = this.field10552.method159(var60 - 1, 0);
                if (var61.field5567 != -1) {
                    byte var62 = arg0[arg10 + 1][arg7];
                    byte var63 = arg6[arg10 + 1][arg7];
                    if (var61.field5581) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class315.method1916(1695945640, arg2, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class623.field8829[var62][var65] && var61.field5569 >= class613.field8703[var64]) {
                                class278.field4012[var64] = var61.field5567;
                                class661.field9310[var64] = var66;
                                class548.field7628[var64] = var61.field5564;
                                class351.field4974[var64] = var61.field5570;
                                if (class613.field8703[var64] == var61.field5569) {
                                    class459.field6268[var64] = class694.method3895(class459.field6268[var64], 4);
                                } else {
                                    class459.field6268[var64] = 4;
                                }
                                class613.field8703[var64] = var61.field5569;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg9[1] = class673.field9418[var62][class194.method1380(var63 + 3, 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg9[1] = class578.field8332[var62][class194.method1380(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg3 == null) {
            return;
        }
        int var68 = class315.method1916(1695945640, arg2, arg3);
        if (!arg3.field5581) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg4 * 2) & 0x7;
            if (class623.field8829[arg11][var69] && arg3.field5569 >= class613.field8703[var70]) {
                class278.field4012[var70] = arg3.field5567;
                class661.field9310[var70] = var68;
                class548.field7628[var70] = arg3.field5564;
                class351.field4974[var70] = arg3.field5570;
                if (class613.field8703[var70] == arg3.field5569) {
                    class459.field6268[var70] = class694.method3895(class459.field6268[var70], 2);
                } else {
                    class459.field6268[var70] = 2;
                }
                class613.field8703[var70] = arg3.field5569;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ls;ILha;Ls;)V", line = 979)
    public final void method4203(class419 arg0, int arg1, class475 arg2, class419 arg3) {
        field10535++;
        int[][] var5 = new int[this.field10536][this.field10554];
        if (class163.field2509 == null || class163.field2509.length != this.field10554) {
            class667.field9379 = new int[this.field10554];
            class163.field2509 = new int[this.field10554];
            class370.field5223 = new int[this.field10554];
            class349.field4954 = new int[this.field10554];
            class393.field5461 = new int[this.field10554];
        }
        for (int var6 = 0; var6 < this.field10531; var6++) {
            for (int var8 = 0; var8 < this.field10554; var8++) {
                class163.field2509[var8] = 0;
                class667.field9379[var8] = 0;
                class393.field5461[var8] = 0;
                class370.field5223[var8] = 0;
                class349.field4954[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field10536; var9++) {
                for (int var10 = 0; var10 < this.field10554; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field10536) {
                        int var20 = this.field10528[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class100 var21 = this.field10545.method3210(1, var20 - 1);
                            class163.field2509[var10] += var21.field1489;
                            class667.field9379[var10] += var21.field1476;
                            class393.field5461[var10] += var21.field1479;
                            class370.field5223[var10] += var21.field1477;
                            var10002 = class349.field4954[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field10528[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class100 var24 = this.field10545.method3210(1, var23 - 1);
                            class163.field2509[var10] -= var24.field1489;
                            class667.field9379[var10] -= var24.field1476;
                            class393.field5461[var10] -= var24.field1479;
                            class370.field5223[var10] -= var24.field1477;
                            var10002 = class349.field4954[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field10554; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field10554) {
                            var14 += class370.field5223[var17];
                            var12 += class667.field9379[var17];
                            var13 += class393.field5461[var17];
                            var11 += class163.field2509[var17];
                            var15 += class349.field4954[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class163.field2509[var18];
                            var13 -= class393.field5461[var18];
                            var15 -= class349.field4954[var18];
                            var12 -= class667.field9379[var18];
                            var14 -= class370.field5223[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class237.method1605(var12 / var15, var13 / var15, var11 * 256 / var14, (byte) -69);
                        }
                    }
                }
            }
            if (class145.field2345) {
                this.method4209(class678.field9594[var6], var6 == 0 ? arg3 : null, var5, true, var6, arg2, var6 == 0 ? arg0 : null);
            } else {
                this.method4201(var6 == 0 ? arg0 : null, var6, var5, arg2, var6 == 0 ? arg3 : null, (byte) -46, class678.field9594[var6]);
            }
            this.field10528[var6] = null;
            this.field10550[var6] = null;
            this.field10548[var6] = null;
            this.field10537[var6] = null;
        }
        if (!this.field10544) {
            if (class665.field9362 != 0) {
                class201.method1413();
            }
            if (class693.field9764) {
                class400.method2373();
            }
        }
        for (int var7 = arg1; var7 < this.field10531; var7++) {
            class678.field9594[var7].method818();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 1154)
    public final void method4204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10530++;
        int var6 = 13 % ((arg0 - 24) / 49);
        for (int var7 = 0; var7 < this.field10531; var7++) {
            this.method4200(arg4, arg1, var7, 0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIILol;I[Lkn;)V", line = 1173)
    public final void method4205(byte arg0, int arg1, int arg2, int arg3, class431 arg4, int arg5, class340[] arg6) {
        if (!this.field10544) {
            for (int var8 = 0; var8 < 4; var8++) {
                class340 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && this.field10536 > var12 && var13 >= 0 && this.field10554 > var13) {
                            var9.method2080(2726, var12, var13);
                        }
                    }
                }
            }
        }
        field10540++;
        int var14 = arg2 + arg5;
        int var15 = arg1 + arg3;
        for (int var16 = 0; var16 < this.field10531; var16++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method4199(-32454, arg3 + var19, 0, var16, arg5 + var18, var15 + var19, 0, arg4, false, 0, var14 + var18);
                }
            }
        }
        int var17 = 10 % ((-arg0 - 48) / 42);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILol;IIII[Lkn;II)V", line = 1250)
    public final void method4206(int arg0, int arg1, class431 arg2, int arg3, int arg4, int arg5, int arg6, class340[] arg7, int arg8, int arg9) {
        field10546++;
        int var11 = (arg3 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field10544) {
            class340 var13 = arg7[arg0];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class23.method216(true, var15 & 0x7, arg8, var14 & 0x7) + arg6;
                    int var17 = class605.method3513(arg8, -2, var14 & 0x7, var15 & 0x7) + arg1;
                    if (var16 > 0 && this.field10536 - 1 > var16 && var17 > 0 && (this.field10554 - 1) > var17) {
                        var13.method2080(2726, var16, var17);
                    }
                }
            }
        }
        int var18 = (arg3 & 0xFFFFFFF8) << 3;
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field10531; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg9 == var22 && var23 >= var11 && var23 <= (var11 + 8) && var24 >= var12 && (var12 + 8) >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || var12 + 8 == var24) {
                            if (arg8 == 0) {
                                var26 = arg1 + var24 - var12;
                                var25 = arg6 - (var11 - var23);
                            } else if (arg8 == 1) {
                                var26 = arg1 + var11 + 8 - var23;
                                var25 = arg6 - (var12 - var24);
                            } else if (arg8 == 2) {
                                var25 = arg6 + 8 - (var23 - var11);
                                var26 = var12 + arg1 + 8 - var24;
                            } else {
                                var25 = var12 + arg6 + 8 - var24;
                                var26 = var23 + arg1 - var11;
                            }
                            this.method4199(-32454, var26, 0, arg0, var25, var19 + var24, 0, arg2, true, 0, var18 + var23);
                        } else {
                            var25 = arg6 + class23.method216(true, var24 & 0x7, arg8, var23 & 0x7);
                            var26 = class605.method3513(arg8, -2, var23 & 0x7, var24 & 0x7) + arg1;
                            this.method4199(-32454, var26, arg8, arg0, var25, var19 + var24, var21, arg2, false, var20, var18 + var23);
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
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg8 == 0) {
                                    var31 = -var11 - (-var29 - arg6);
                                    var32 = arg1 - (var12 - var30);
                                } else if (arg8 == 1) {
                                    var31 = var30 + arg6 - var12;
                                    var32 = var11 + arg1 + 8 - var29;
                                } else if (arg8 == 2) {
                                    var32 = var12 + arg1 + 8 - var30;
                                    var31 = arg6 + var11 + 8 - var29;
                                } else {
                                    var32 = arg1 + var29 - var11;
                                    var31 = arg6 + var12 + 8 - var30;
                                }
                                if (var31 >= 0 && var31 < this.field10536 && var32 >= 0 && this.field10554 > var32) {
                                    this.field10529[arg0][var31][var32] = this.field10529[arg0][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method4199(-32454, -1, 0, 0, -1, 0, 0, arg2, false, 0, 0);
                    }
                }
            }
        }
        if (arg4 != -17173) {
            this.method4203(null, -51, null, null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z", line = 1454)
    public static final boolean method4207(byte arg0, int arg1) {
        if (arg0 != 99) {
            field10539 = -45;
        }
        field10547++;
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([[[IBLha;[Lkn;)V", line = 1468)
    public final void method4208(int[][][] arg0, byte arg1, class475 arg2, class340[] arg3) {
        field10541++;
        if (!this.field10544) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field10536; var6++) {
                    for (int var7 = 0; var7 < this.field10554; var7++) {
                        if ((class336.field4782[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class336.field4782[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method2081(var7, (byte) 56, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field10531; var9++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field10544) {
                if (class693.field9764) {
                    var11 |= 0x2;
                }
                if (class413.field5675) {
                    var12 |= 0x8;
                }
                if (class665.field9362 != 0) {
                    var11 |= 0x1;
                    if (class477.field6551 | var9 == 0) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class693.field9764) {
                var12 |= 0x7;
            }
            if (!class503.field6899) {
                var12 |= 0x20;
            }
            int[][] var13 = arg0 == null || arg0.length <= var9 ? this.field10529[var9] : arg0[var9];
            class400.method2374(var9, arg2.method508(this.field10536, this.field10554, this.field10529[var9], var13, 512, var11, var12));
        }
        int var10 = -53 / ((43 - arg1) / 52);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ls;Ls;[[IZILha;Ls;)V", line = 1568)
    private final void method4209(class419 arg0, class419 arg1, int[][] arg2, boolean arg3, int arg4, class475 arg5, class419 arg6) {
        field10551++;
        byte[][] var8 = this.field10548[arg4];
        byte[][] var9 = this.field10537[arg4];
        byte[][] var10 = this.field10528[arg4];
        byte[][] var11 = this.field10550[arg4];
        int var12 = 0;
        if (!arg3) {
            return;
        }
        while (var12 < this.field10536) {
            int var13 = var12 >= this.field10536 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field10554; var14++) {
                int var15 = (this.field10554 - 1) <= var14 ? var14 : var14 + 1;
                if (class374.field5255 == -1 || class530.method3091(var12, class374.field5255, -79, var14, arg4)) {
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
                        class405 var26 = var21 == 0 ? null : this.field10552.method159(var21 - 1, 0);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class100 var27 = var22 == 0 ? null : this.field10545.method3210(1, var22 - 1);
                        class405 var28 = var26;
                        if (var26 != null) {
                            if (var26.field5567 == -1 && var26.field5566 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field5581;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field10536 > var12 && var14 < this.field10554) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method2476(var14, var12, -1) - arg0.method2476(var15, var13, -1);
                                var38 = arg0.method2476(var14, var13, -1) - arg0.method2476(var15, var12, -1);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class613.field8703[var39] = -1;
                            class459.field6268[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field5581 ? class673.field9418[var19] : class578.field8332[var19];
                        this.method4202(var8, var27, arg5, var26, var20, this.field10536, var9, var14, var11, var18, var12, var19, this.field10554, false);
                        boolean var41 = var26 != null && var26.field5567 != var26.field5566;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class613.field8703[var42] >= 0 && class661.field9310[var42] != class278.field4012[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class212.method1466(var18[1], class194.method1380(class459.field6268[2], class459.field6268[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class212.method1466(var18[3], class194.method1380(class459.field6268[6], class459.field6268[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class212.method1466(var18[0], class194.method1380(class459.field6268[0], class459.field6268[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class212.method1466(var18[2], class194.method1380(class459.field6268[6], class459.field6268[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class4.field59[var19];
                            var49 = class713.field9956[var19];
                            var46 = class771.field10641[var19];
                            var48 = class490.field6714[var19];
                            var47 = var27 == null ? 0 : class739.field10241[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class639.field9009[var19];
                            var44 = class686.field9707[var19];
                            var46 = class472.field6423[var19];
                            var47 = var27 == null ? 0 : class626.field8905[var19];
                            var48 = class548.field7604[var19];
                            var49 = class700.field9814[var19];
                        } else {
                            var44 = class368.field5194[var19];
                            var49 = class44.field586[var19];
                            var47 = var27 == null ? 0 : class235.field3402[var19];
                            var48 = class288.field4216[var19];
                            var45 = var26 == null ? 0 : class675.field9475[var19];
                            var46 = class41.field475[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class307.method1891(arg4, var12, var14);
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
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field5567;
                                var64 = var26.field5570;
                                var63 = var26.field5564;
                                int var65 = class315.method1916(1695945640, arg5, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 1;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 1;
                                        class661.field9320[4] = var46[var51];
                                        var99 = 6;
                                        class661.field9320[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 5;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 5;
                                        class661.field9320[4] = var46[var51];
                                        var99 = 6;
                                        class661.field9320[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 3;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 3;
                                        class661.field9320[4] = var46[var51];
                                        var99 = 6;
                                        class661.field9320[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 7;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 7;
                                        class661.field9320[4] = var46[var51];
                                        var99 = 6;
                                        class661.field9320[5] = var48[var51];
                                    } else {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = var46[var51];
                                        class661.field9320[2] = var48[var51];
                                        var99 = 3;
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class661.field9320[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field10549[var101];
                                        int var104 = this.field10533[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var105 = var104;
                                            var106 = 512 - var103;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var103;
                                            var106 = 512 - var104;
                                        } else if (var20 == 3) {
                                            var105 = 512 - var104;
                                            var106 = var103;
                                        } else {
                                            var106 = var104;
                                            var105 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var106;
                                        if (var60 != null && class623.field8829[var19][var101]) {
                                            int var107 = (var12 << 9) + var105;
                                            int var108 = (var14 << 9) + var106;
                                            var60[var52] = arg6.method2478(true, var108, var107) - arg0.method2478(arg3, var108, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class623.field8829[var19][var101]) {
                                                int var109 = (var12 << 9) + var105;
                                                int var110 = (var14 << 9) + var106;
                                                var61[var52] = arg0.method2478(true, var110, var109) - arg6.method2478(arg3, var110, var109);
                                            } else if (arg1 != null && !class311.field4414[var19][var101]) {
                                                int var111 = (var12 << 9) + var105;
                                                int var112 = (var14 << 9) + var106;
                                                var61[var52] = arg1.method2478(true, var112, var111) - arg0.method2478(true, var112, var111);
                                            }
                                        }
                                        if (var101 < 8 && var26.field5569 < class613.field8703[var102]) {
                                            if (var54 != null) {
                                                var54[var52] = class661.field9310[var102];
                                            }
                                            var59[var52] = class351.field4974[var102];
                                            var58[var52] = class548.field7628[var102];
                                            var57[var52] = class278.field4012[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field5564;
                                            var59[var52] = var26.field5570;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field10544 && arg4 == 0) {
                                    class404.method2396(var12, var14, var26.field5582, var26.field5579 * 8, var26.field5577);
                                }
                                if (var19 != 12 && var26.field5567 != -1 && var26.field5573) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class4.field59[var19];
                            } else if (var17) {
                                var51 += class639.field9009[var19];
                            } else {
                                var51 += class675.field9475[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class100 var67 = this.field10545.method3210(1, var22 - 1);
                                class100 var68 = this.field10545.method3210(1, var23 - 1);
                                class100 var69 = this.field10545.method3210(1, var24 - 1);
                                class100 var70 = this.field10545.method3210(1, var25 - 1);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 1;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 1;
                                        class661.field9320[4] = var46[var51];
                                        class661.field9320[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 5;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 5;
                                        class661.field9320[4] = var46[var51];
                                        class661.field9320[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 3;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 3;
                                        class661.field9320[4] = var46[var51];
                                        var73 = 6;
                                        class661.field9320[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = 7;
                                        class661.field9320[2] = var48[var51];
                                        class661.field9320[3] = 7;
                                        class661.field9320[4] = var46[var51];
                                        class661.field9320[5] = var48[var51];
                                        var73 = 6;
                                    } else {
                                        class661.field9320[0] = var49[var51];
                                        class661.field9320[1] = var46[var51];
                                        class661.field9320[2] = var48[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class661.field9320[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field10549[var75];
                                        int var78 = this.field10533[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 512 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 512 - var78;
                                            var79 = 512 - var77;
                                        } else if (var20 == 3) {
                                            var79 = 512 - var78;
                                            var80 = var77;
                                        } else {
                                            var80 = var78;
                                            var79 = var77;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class623.field8829[var19][var75]) {
                                            int var81 = (var12 << 9) + var79;
                                            int var82 = (var14 << 9) + var80;
                                            var60[var52] = arg6.method2478(true, var82, var81) - arg0.method2478(true, var82, var81);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class623.field8829[var19][var75]) {
                                                int var83 = (var12 << 9) + var79;
                                                int var84 = (var14 << 9) + var80;
                                                var61[var52] = arg0.method2478(true, var84, var83) - arg6.method2478(true, var84, var83);
                                            } else if (arg1 != null && !class311.field4414[var19][var75]) {
                                                int var85 = (var12 << 9) + var79;
                                                int var86 = (var14 << 9) + var80;
                                                var61[var52] = arg1.method2478(arg3, var86, var85) - arg0.method2478(arg3, var86, var85);
                                            }
                                        }
                                        if (var75 < 8 && class613.field8703[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class661.field9310[var76];
                                            }
                                            var59[var52] = class351.field4974[var76];
                                            var58[var52] = class548.field7628[var76];
                                            var57[var52] = class278.field4012[var76];
                                        } else {
                                            if (var17 && class623.field8829[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var67.field1487;
                                                var59[var52] = var67.field1488;
                                            } else if (var79 == 0 && var80 == 512) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var68.field1487;
                                                var59[var52] = var68.field1488;
                                            } else if (var79 == 512 && var80 == 512) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var69.field1487;
                                                var59[var52] = var69.field1488;
                                            } else if (var79 == 512 && var80 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var70.field1487;
                                                var59[var52] = var70.field1488;
                                            } else {
                                                if (var79 >= 256) {
                                                    if (var80 >= 256) {
                                                        var58[var52] = var69.field1487;
                                                        var59[var52] = var69.field1488;
                                                    } else {
                                                        var58[var52] = var70.field1487;
                                                        var59[var52] = var70.field1488;
                                                    }
                                                } else if (var80 >= 256) {
                                                    var58[var52] = var68.field1487;
                                                    var59[var52] = var68.field1488;
                                                } else {
                                                    var58[var52] = var67.field1487;
                                                    var59[var52] = var67.field1488;
                                                }
                                                int var87 = class297.method1870(true, arg2[var12][var14], arg2[var13][var14], var79 << 7 >> 9);
                                                int var88 = class297.method1870(true, arg2[var12][var15], arg2[var13][var15], var79 << 7 >> 9);
                                                var57[var52] = class297.method1870(true, var87, var88, var80 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field1483) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg0.method2476(var14, var12, -1);
                            int var90 = arg0.method2476(var14, var13, -1);
                            int var91 = arg0.method2476(var15, var13, -1);
                            int var92 = arg0.method2476(var15, var12, -1);
                            boolean var93 = class717.method3994(32281, var12, var14);
                            if (var93 && arg4 > 1 || !var93 && arg4 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field1482) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field5574) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field10542[arg4][var12][var14] = (byte) class694.method3895(this.field10542[arg4][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field10544) {
                                var95 = class661.method3703(var12, var14);
                                var96 = class143.method1148(var12, var14);
                                var97 = class203.method1426(var12, var14);
                            }
                            arg0.method828(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class307.method1891(arg4, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILuf;)V", line = 2440)
    public static final void method4210(int arg0, class519 arg1) {
        if (arg1.field7190 == 5 && arg1.field7129 != -1) {
            class731.method4055(arg1, class686.field9702, (byte) 113);
        }
        if (arg0 != -1) {
            field10538 = -2L;
        }
        field10558++;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIZLoo;Lui;)V", line = 2501)
    public class761(int arg0, int arg1, int arg2, boolean arg3, class12 arg4, class556 arg5) {
        this.field10545 = arg5;
        this.field10554 = arg2;
        this.field10536 = arg1;
        this.field10544 = arg3;
        this.field10531 = arg0;
        this.field10552 = arg4;
        this.field10542 = new byte[this.field10531][this.field10536 + 1][this.field10554 + 1];
        this.field10528 = new byte[this.field10531][this.field10536][this.field10554];
        this.field10548 = new byte[this.field10531][this.field10536][this.field10554];
        this.field10529 = new int[this.field10531][this.field10536 + 1][this.field10554 + 1];
        this.field10550 = new byte[this.field10531][this.field10536][this.field10554];
        this.field10537 = new byte[this.field10531][this.field10536][this.field10554];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[I)V", line = 2462)
    public final void method4211(int arg0, int arg1, int[][] arg2) {
        field10557++;
        int[][] var4 = this.field10529[arg1];
        if (arg0 >= -63) {
            field10539 = 66;
        }
        for (int var5 = 0; var5 < this.field10536 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field10554 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }
}
