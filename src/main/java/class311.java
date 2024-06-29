import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class311 extends class206 {

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    private int field4662 = -1;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Lrh;")
    private class478 field4647;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    private int field4666;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[[I")
    public int[][] field4660;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[[B")
    private byte[][] field4659;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[[B")
    private byte[][] field4652;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    private int field4645;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field4650;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    private int field4651;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private int field4654;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    private int field4655;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    private int field4661;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    private int field4663;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    private int field4664;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    private int field4665;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "[[Lub;")
    private class108[][] field4658;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "[[Lqn;")
    private class358[][] field4656;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[[Lwf;")
    private class364[][] field4649;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "[[Lhb;")
    private class378[][] field4657;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 4)
    public final void method842(int arg0, int arg1) {
        class88 var3 = this.field4647.method2868(Thread.currentThread());
        var3.field1209.field4414 = 0;
        if (this.field4656 != null) {
            this.method2000(arg0, arg1, this.field4647.field6971, var3.field1209, var3.field1260, var3.field1228, var3.field1257);
        } else {
            if (this.field4649 != null) {
                this.method1998(arg0, arg1, var3.field1209, var3.field1260, var3.field1228, var3.field1257);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)I", line = 16)
    private static final int method1997(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "(IILj;)Lj;", line = 50)
    public final class229 method857(int arg0, int arg1, class229 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILor;[I[I[I)V", line = 54)
    private final void method1998(int arg0, int arg1, class298 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class364 var7 = this.field4649[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5633 & 2) == 0) {
                int var8 = super.field2915 * arg0;
                int var9 = super.field2915 + var8;
                int var10 = super.field2915 * arg1;
                int var11 = super.field2915 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field5633 & 1) != 0) {
                    int var12 = this.field4660[arg0][arg1];
                    int var16;
                    if (this.field4662 == -1) {
                        int var13 = this.field4661 * var12;
                        var14 = (this.field4653 * var10 + this.field4664 * var8 + var13 >> 15) + this.field4650;
                        if (var14 <= this.field4647.field6956) {
                            return;
                        }
                        var15 = (this.field4653 * var10 + this.field4664 * var9 + var13 >> 15) + this.field4650;
                        if (var15 <= this.field4647.field6956) {
                            return;
                        }
                        var16 = (this.field4653 * var11 + this.field4664 * var9 + var13 >> 15) + this.field4650;
                        if (var16 <= this.field4647.field6956) {
                            return;
                        }
                        var17 = (this.field4653 * var11 + this.field4664 * var8 + var13 >> 15) + this.field4650;
                        if (var17 <= this.field4647.field6956) {
                            return;
                        }
                    } else {
                        var17 = this.field4662;
                        var16 = this.field4662;
                        var15 = this.field4662;
                        var14 = this.field4662;
                    }
                    int var18 = this.field4655 * var12;
                    int var19 = this.field4654 * var12;
                    var20 = (this.field4646 * var10 + this.field4645 * var8 + var18 >> 15) + this.field4665;
                    var21 = this.field4647.field6966 * var20 / var14 + arg2.field4416;
                    var22 = (this.field4648 * var10 + this.field4663 * var8 + var19 >> 15) + this.field4651;
                    var23 = this.field4647.field6963 * var22 / var14 + arg2.field4411;
                    var24 = (this.field4646 * var10 + this.field4645 * var9 + var18 >> 15) + this.field4665;
                    var25 = this.field4647.field6966 * var24 / var15 + arg2.field4416;
                    var26 = (this.field4648 * var10 + this.field4663 * var9 + var19 >> 15) + this.field4651;
                    var27 = this.field4647.field6963 * var26 / var15 + arg2.field4411;
                    int var28 = (this.field4646 * var11 + this.field4645 * var9 + var18 >> 15) + this.field4665;
                    var29 = this.field4647.field6966 * var28 / var16 + arg2.field4416;
                    int var30 = (this.field4648 * var11 + this.field4663 * var9 + var19 >> 15) + this.field4651;
                    var31 = this.field4647.field6963 * var30 / var16 + arg2.field4411;
                    var32 = (this.field4646 * var11 + this.field4645 * var8 + var18 >> 15) + this.field4665;
                    var33 = this.field4647.field6966 * var32 / var17 + arg2.field4416;
                    var34 = (this.field4648 * var11 + this.field4663 * var8 + var19 >> 15) + this.field4651;
                    var35 = this.field4647.field6963 * var34 / var17 + arg2.field4411;
                } else {
                    int var36 = this.field4660[arg0][arg1];
                    int var37 = this.field4660[arg0 + 1][arg1];
                    int var38 = this.field4660[arg0 + 1][arg1 + 1];
                    int var39 = this.field4660[arg0][arg1 + 1];
                    int var40;
                    if (this.field4662 == -1) {
                        var14 = (this.field4653 * var10 + this.field4664 * var8 + this.field4661 * var36 >> 15) + this.field4650;
                        if (var14 <= this.field4647.field6956) {
                            return;
                        }
                        var15 = (this.field4653 * var10 + this.field4664 * var9 + this.field4661 * var37 >> 15) + this.field4650;
                        if (var15 <= this.field4647.field6956) {
                            return;
                        }
                        var40 = (this.field4653 * var11 + this.field4664 * var9 + this.field4661 * var38 >> 15) + this.field4650;
                        if (var40 <= this.field4647.field6956) {
                            return;
                        }
                        var17 = (this.field4653 * var11 + this.field4664 * var8 + this.field4661 * var39 >> 15) + this.field4650;
                        if (var17 <= this.field4647.field6956) {
                            return;
                        }
                    } else {
                        var17 = this.field4662;
                        var40 = this.field4662;
                        var15 = this.field4662;
                        var14 = this.field4662;
                    }
                    var20 = (this.field4646 * var10 + this.field4655 * var36 + this.field4645 * var8 >> 15) + this.field4665;
                    var21 = this.field4647.field6966 * var20 / var14 + arg2.field4416;
                    var22 = (this.field4648 * var10 + this.field4663 * var8 + this.field4654 * var36 >> 15) + this.field4651;
                    var23 = this.field4647.field6963 * var22 / var14 + arg2.field4411;
                    var24 = (this.field4646 * var10 + this.field4655 * var37 + this.field4645 * var9 >> 15) + this.field4665;
                    var25 = this.field4647.field6966 * var24 / var15 + arg2.field4416;
                    var26 = (this.field4648 * var10 + this.field4663 * var9 + this.field4654 * var37 >> 15) + this.field4651;
                    var27 = this.field4647.field6963 * var26 / var15 + arg2.field4411;
                    int var41 = (this.field4646 * var11 + this.field4655 * var38 + this.field4645 * var9 >> 15) + this.field4665;
                    var29 = this.field4647.field6966 * var41 / var40 + arg2.field4416;
                    int var42 = (this.field4648 * var11 + this.field4663 * var9 + this.field4654 * var38 >> 15) + this.field4651;
                    var31 = this.field4647.field6963 * var42 / var40 + arg2.field4411;
                    var32 = (this.field4646 * var11 + this.field4655 * var39 + this.field4645 * var8 >> 15) + this.field4665;
                    var33 = this.field4647.field6966 * var32 / var17 + arg2.field4416;
                    var34 = (this.field4648 * var11 + this.field4663 * var8 + this.field4654 * var39 >> 15) + this.field4651;
                    var35 = this.field4647.field6963 * var34 / var17 + arg2.field4411;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field4417 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field4415 || var33 > arg2.field4415 || var25 > arg2.field4415;
                    if (var7.field5632 >= 0) {
                        if (this.method1999(this.field4647.field7256.method1558(var7.field5632, (byte) 105).field3671)) {
                            arg2.field4414 = 100;
                        }
                        arg2.method1922(var31, var35, var27, var29, var33, var25, var7.field5627 & 65535, var7.field5630 & 65535, var7.field5629 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5632);
                        arg2.field4414 = 0;
                    } else {
                        arg2.method1918(var31, var35, var27, var29, var33, var25, var7.field5627 & 65535, var7.field5630 & 65535, var7.field5629 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field4417 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field4415 || var25 > arg2.field4415 || var33 > arg2.field4415;
                    if (var7.field5632 >= 0) {
                        if (this.method1999(this.field4647.field7256.method1558(var7.field5632, (byte) 116).field3671)) {
                            arg2.field4414 = 100;
                        }
                        arg2.method1922(var23, var27, var35, var21, var25, var33, var7.field5628 & 65535, var7.field5629 & 65535, var7.field5630 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5632);
                        arg2.field4414 = 0;
                        return;
                    }
                    arg2.method1918(var23, var27, var35, var21, var25, var33, var7.field5628 & 65535, var7.field5629 & 65535, var7.field5630 & 65535);
                }
            }
        } else {
            class378 var43 = this.field4657[arg0][arg1];
            if (var43 != null) {
                if (this.field4662 == -1) {
                    for (int var44 = 0; var44 < var43.field5768; ++var44) {
                        int var45 = (arg0 << super.field2916) + var43.field5775[var44];
                        short var46 = var43.field5766[var44];
                        int var47 = (arg1 << super.field2916) + var43.field5773[var44];
                        int var48 = (this.field4653 * var47 + this.field4664 * var45 + this.field4661 * var46 >> 15) + this.field4650;
                        if (var48 <= this.field4647.field6956) {
                            return;
                        }
                        int var49 = (this.field4646 * var47 + this.field4655 * var46 + this.field4645 * var45 >> 15) + this.field4665;
                        int var50 = (this.field4648 * var47 + this.field4663 * var45 + this.field4654 * var46 >> 15) + this.field4651;
                        arg3[var44] = this.field4647.field6966 * var49 / var48 + arg2.field4416;
                        arg4[var44] = this.field4647.field6963 * var50 / var48 + arg2.field4411;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field5768; ++var51) {
                        int var91 = (arg0 << super.field2916) + var43.field5775[var51];
                        short var92 = var43.field5766[var51];
                        int var93 = (arg1 << super.field2916) + var43.field5773[var51];
                        int var94 = (this.field4646 * var93 + this.field4655 * var92 + this.field4645 * var91 >> 15) + this.field4665;
                        int var95 = (this.field4648 * var93 + this.field4663 * var91 + this.field4654 * var92 >> 15) + this.field4651;
                        arg3[var51] = this.field4647.field6966 * var94 / this.field4662 + arg2.field4416;
                        arg4[var51] = this.field4647.field6963 * var95 / this.field4662 + arg2.field4411;
                    }
                }
                if (var43.field5769 != null) {
                    int var52 = this.field4660[arg0][arg1];
                    int var53 = this.field4660[arg0 + 1][arg1];
                    int var54 = this.field4660[arg0][arg1 + 1];
                    int var55 = super.field2915 * arg0;
                    int var56 = super.field2915 + var55;
                    int var57 = super.field2915 * arg1;
                    int var58 = super.field2915 + var57;
                    int var59 = (this.field4646 * var57 + this.field4655 * var52 + this.field4645 * var55 >> 15) + this.field4665;
                    int var60 = (this.field4648 * var57 + this.field4663 * var55 + this.field4654 * var52 >> 15) + this.field4651;
                    int var61 = (this.field4653 * var57 + this.field4664 * var55 + this.field4661 * var52 >> 15) + this.field4650;
                    int var62 = (this.field4646 * var57 + this.field4655 * var53 + this.field4645 * var56 >> 15) + this.field4665;
                    int var63 = (this.field4648 * var57 + this.field4663 * var56 + this.field4654 * var53 >> 15) + this.field4651;
                    int var64 = (this.field4653 * var57 + this.field4664 * var56 + this.field4661 * var53 >> 15) + this.field4650;
                    int var65 = (this.field4646 * var58 + this.field4655 * var54 + this.field4645 * var55 >> 15) + this.field4665;
                    int var66 = (this.field4648 * var58 + this.field4663 * var55 + this.field4654 * var54 >> 15) + this.field4651;
                    int var67 = (this.field4653 * var58 + this.field4664 * var55 + this.field4661 * var54 >> 15) + this.field4650;
                    for (int var68 = 0; var68 < var43.field5774; ++var68) {
                        short var69 = var43.field5770[var68];
                        short var70 = var43.field5767[var68];
                        short var71 = var43.field5772[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field4417 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field4415 || var73 > arg2.field4415 || var74 > arg2.field4415;
                            short var78 = var43.field5769[var68];
                            if (var78 != -1) {
                                if (this.method1999(this.field4647.field7256.method1558(var78, (byte) 120).field3671)) {
                                    arg2.field4414 = 100;
                                }
                                arg2.method1922(var75, var76, var77, var72, var73, var74, var43.field5765[var69], var43.field5765[var70], var43.field5765[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field4414 = 0;
                            } else {
                                int var79 = var43.field5776[var68];
                                if (var79 != -1) {
                                    arg2.method1918(var75, var76, var77, var72, var73, var74, class514.method3055(var79, -64, var43.field5765[var69]), class514.method3055(var79, -24, var43.field5765[var70]), class514.method3055(var79, -36, var43.field5765[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field5774; ++var80) {
                    short var81 = var43.field5770[var80];
                    short var82 = var43.field5767[var80];
                    short var83 = var43.field5772[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field5776[var80];
                        if (var90 != -1) {
                            arg2.field4417 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field4415 || var85 > arg2.field4415 || var86 > arg2.field4415;
                            arg2.method1918(var87, var88, var89, var84, var85, var86, class514.method3055(var90, -69, var43.field5765[var81]), class514.method3055(var90, -103, var43.field5765[var82]), class514.method3055(var90, -64, var43.field5765[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 408)
    public final boolean method847(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ldd;[I)V", line = 410)
    public final void method854(class471 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!nj", name = "va", descriptor = "(II)I", line = 415)
    public final int method853(int arg0, int arg1) {
        int var3 = arg0 >> super.field2916;
        int var4 = arg1 >> super.field2916;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2912 - 1 && var4 <= super.field2914 - 1) {
            int var5 = arg0 & super.field2915 - 1;
            int var6 = arg1 & super.field2915 - 1;
            int var7 = (super.field2915 - var5) * this.field4660[var3][var4] + this.field4660[var3 + 1][var4] * var5 >> super.field2916;
            int var8 = (super.field2915 - var5) * this.field4660[var3][var4 + 1] + this.field4660[var3 + 1][var4 + 1] * var5 >> super.field2916;
            return (super.field2915 - var6) * var7 + var6 * var8 >> super.field2916;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "()V", line = 434)
    public final void method851() {
        this.field4659 = null;
        this.field4652 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[[ZZ)V", line = 439)
    public final void method858(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class53 var6 = this.field4647.field6958;
        this.field4662 = -1;
        this.field4645 = var6.field708;
        this.field4655 = var6.field712;
        this.field4646 = var6.field715;
        this.field4665 = var6.field714;
        this.field4663 = var6.field710;
        this.field4654 = var6.field709;
        this.field4648 = var6.field717;
        this.field4651 = var6.field716;
        this.field4664 = var6.field711;
        this.field4661 = var6.field707;
        this.field4653 = var6.field713;
        this.field4650 = var6.field718;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 455)
    public final void method845(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4649 == null) {
            this.field4649 = new class364[super.field2912][super.field2914];
            this.field4657 = new class378[super.field2912][super.field2914];
        } else if (this.field4656 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2915 != var20 || var21 != 0 && super.field2915 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class378 var22 = new class378();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5768 = var23;
            var22.field5765 = new short[var23];
            var22.field5775 = new short[var23];
            var22.field5766 = new short[var23];
            var22.field5773 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5765[var25] = (short) (this.field4659[arg0][arg1] - this.field4652[arg0][arg1]);
                } else if (var30 == 0 && super.field2915 == var31) {
                    var22.field5765[var25] = (short) (this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]);
                } else if (super.field2915 == var30 && super.field2915 == var31) {
                    var22.field5765[var25] = (short) (this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]);
                } else if (super.field2915 == var30 && var31 == 0) {
                    var22.field5765[var25] = (short) (this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]) * var30 + (this.field4659[arg0][arg1] - this.field4652[arg0][arg1]) * (super.field2915 - var30);
                    int var33 = (this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]) * var30 + (this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]) * (super.field2915 - var30);
                    var22.field5765[var25] = (short) ((super.field2915 - var31) * var32 + var31 * var33 >> super.field2916 * 2);
                }
                int var34 = (arg0 << super.field2916) + var30;
                int var35 = (arg1 << super.field2916) + var31;
                var22.field5775[var25] = (short) var30;
                var22.field5773[var25] = (short) var31;
                var22.field5766[var25] = (short) (this.method853(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field5765[var25] < 2) {
                    var22.field5765[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field4647.field7256.method1558(arg11[var28], (byte) 103).field3665) {
                    var26 = true;
                }
            }
            var22.field5776 = new int[var27];
            if (arg10 != null) {
                var22.field5771 = new int[var27];
            }
            var22.field5770 = new short[var27];
            var22.field5767 = new short[var27];
            var22.field5772 = new short[var27];
            if (var26) {
                var22.field5769 = new short[var27];
                var22.field5764 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5776[var22.field5774] = class500.method2987(arg9[var29], 6755);
                    } else {
                        var22.field5776[var22.field5774] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5771[var22.field5774] = class500.method2987(arg10[var29], 6755);
                        } else {
                            var22.field5771[var22.field5774] = -1;
                        }
                    }
                    var22.field5770[var22.field5774] = (short) arg6[var29];
                    var22.field5767[var22.field5774] = (short) arg7[var29];
                    var22.field5772[var22.field5774] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4647.field7256.method1558(arg11[var29], (byte) 113).field3665) {
                            var22.field5769[var22.field5774] = (short) arg11[var29];
                            var22.field5764[var22.field5774] = (short) arg12[var29];
                        } else {
                            var22.field5769[var22.field5774] = -1;
                        }
                    }
                    ++var22.field5774;
                }
            }
            this.field4657[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class364 var36 = new class364();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5631 = class514.method3055(class500.method2987(arg10[0], 6755), -50, this.field4659[arg0][arg1] - this.field4652[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field5633 = (byte) (var36.field5633 | 2);
                    }
                }
                if (this.field4660[arg0 + 1][arg1] == this.field4660[arg0][arg1] && this.field4660[arg0 + 1][arg1 + 1] == this.field4660[arg0][arg1] && this.field4660[arg0][arg1 + 1] == this.field4660[arg0][arg1]) {
                    var36.field5633 = (byte) (var36.field5633 | 1);
                }
                if (var38 != -1 && (var36.field5633 & 2) == 0 && !this.field4647.field7256.method1558(var38, (byte) 119).field3665) {
                    var36.field5628 = (short) (this.field4659[arg0][arg1] - this.field4652[arg0][arg1]);
                    var36.field5629 = (short) (this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]);
                    var36.field5627 = (short) (this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]);
                    var36.field5630 = (short) (this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]);
                    var36.field5632 = (short) var38;
                } else {
                    short var39 = class500.method2987(var37, 6755);
                    var36.field5628 = (short) class514.method3055(var39, -63, this.field4659[arg0][arg1] - this.field4652[arg0][arg1]);
                    var36.field5629 = (short) class514.method3055(var39, -98, this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]);
                    var36.field5627 = (short) class514.method3055(var39, -93, this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]);
                    var36.field5630 = (short) class514.method3055(var39, -57, this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]);
                    var36.field5632 = -1;
                }
                this.field4649[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z", line = 684)
    private final boolean method1999(int arg0) {
        if ((this.field4666 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZLor;[I[I[I)V", line = 700)
    private final void method2000(int arg0, int arg1, boolean arg2, class298 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class358 var8 = this.field4656[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5550 & 2) == 0) {
                int var9 = super.field2915 * arg0;
                int var10 = super.field2915 + var9;
                int var11 = super.field2915 * arg1;
                int var12 = super.field2915 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field5550 & 1) != 0 && !arg2) {
                    int var17 = this.field4660[arg0][arg1];
                    if (this.field4662 == -1) {
                        int var18 = this.field4661 * var17;
                        var19 = (this.field4653 * var11 + this.field4664 * var9 + var18 >> 15) + this.field4650;
                        if (var19 <= this.field4647.field6956) {
                            return;
                        }
                        var20 = (this.field4653 * var11 + this.field4664 * var10 + var18 >> 15) + this.field4650;
                        if (var20 <= this.field4647.field6956) {
                            return;
                        }
                        var21 = (this.field4653 * var12 + this.field4664 * var10 + var18 >> 15) + this.field4650;
                        if (var21 <= this.field4647.field6956) {
                            return;
                        }
                        var22 = (this.field4653 * var12 + this.field4664 * var9 + var18 >> 15) + this.field4650;
                        if (var22 <= this.field4647.field6956) {
                            return;
                        }
                    } else {
                        var22 = this.field4662;
                        var21 = this.field4662;
                        var20 = this.field4662;
                        var19 = this.field4662;
                    }
                    if (this.field4647.field6986) {
                        int var23 = var19 - this.field4647.field6955;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field4647.field6955;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field4647.field6955;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field4647.field6955;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field4655 * var17;
                    int var28 = this.field4654 * var17;
                    var29 = (this.field4646 * var11 + this.field4645 * var9 + var27 >> 15) + this.field4665;
                    var30 = this.field4647.field6966 * var29 / var19 + arg3.field4416;
                    var31 = (this.field4648 * var11 + this.field4663 * var9 + var28 >> 15) + this.field4651;
                    var32 = this.field4647.field6963 * var31 / var19 + arg3.field4411;
                    var33 = (this.field4646 * var11 + this.field4645 * var10 + var27 >> 15) + this.field4665;
                    var34 = this.field4647.field6966 * var33 / var20 + arg3.field4416;
                    var35 = (this.field4648 * var11 + this.field4663 * var10 + var28 >> 15) + this.field4651;
                    var36 = this.field4647.field6963 * var35 / var20 + arg3.field4411;
                    var37 = (this.field4646 * var12 + this.field4645 * var10 + var27 >> 15) + this.field4665;
                    var38 = this.field4647.field6966 * var37 / var21 + arg3.field4416;
                    var39 = (this.field4648 * var12 + this.field4663 * var10 + var28 >> 15) + this.field4651;
                    var40 = this.field4647.field6963 * var39 / var21 + arg3.field4411;
                    var41 = (this.field4646 * var12 + this.field4645 * var9 + var27 >> 15) + this.field4665;
                    var42 = this.field4647.field6966 * var41 / var22 + arg3.field4416;
                    var43 = (this.field4648 * var12 + this.field4663 * var9 + var28 >> 15) + this.field4651;
                    var44 = this.field4647.field6963 * var43 / var22 + arg3.field4411;
                } else {
                    int var45 = this.field4660[arg0][arg1];
                    int var46 = this.field4660[arg0 + 1][arg1];
                    int var47 = this.field4660[arg0 + 1][arg1 + 1];
                    int var48 = this.field4660[arg0][arg1 + 1];
                    if (this.field4662 == -1) {
                        var19 = (this.field4653 * var11 + this.field4664 * var9 + this.field4661 * var45 >> 15) + this.field4650;
                        if (var19 <= this.field4647.field6956) {
                            return;
                        }
                        var20 = (this.field4653 * var11 + this.field4664 * var10 + this.field4661 * var46 >> 15) + this.field4650;
                        if (var20 <= this.field4647.field6956) {
                            return;
                        }
                        var21 = (this.field4653 * var12 + this.field4664 * var10 + this.field4661 * var47 >> 15) + this.field4650;
                        if (var21 <= this.field4647.field6956) {
                            return;
                        }
                        var22 = (this.field4653 * var12 + this.field4664 * var9 + this.field4661 * var48 >> 15) + this.field4650;
                        if (var22 <= this.field4647.field6956) {
                            return;
                        }
                    } else {
                        var22 = this.field4662;
                        var21 = this.field4662;
                        var20 = this.field4662;
                        var19 = this.field4662;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field4647.field6955;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field5546 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field4647.field6955;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field5543 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field4647.field6955;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field5548 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field4647.field6955;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field5549 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field4647.field6986) {
                        int var57 = var19 - this.field4647.field6955;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field4647.field6955;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field4647.field6955;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field4647.field6955;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field4646 * var11 + this.field4655 * var45 + this.field4645 * var9 >> 15) + this.field4665;
                    var30 = this.field4647.field6966 * var29 / var19 + arg3.field4416;
                    var31 = (this.field4648 * var11 + this.field4663 * var9 + this.field4654 * var45 >> 15) + this.field4651;
                    var32 = this.field4647.field6963 * var31 / var19 + arg3.field4411;
                    var33 = (this.field4646 * var11 + this.field4655 * var46 + this.field4645 * var10 >> 15) + this.field4665;
                    var34 = this.field4647.field6966 * var33 / var20 + arg3.field4416;
                    var35 = (this.field4648 * var11 + this.field4663 * var10 + this.field4654 * var46 >> 15) + this.field4651;
                    var36 = this.field4647.field6963 * var35 / var20 + arg3.field4411;
                    var37 = (this.field4646 * var12 + this.field4655 * var47 + this.field4645 * var10 >> 15) + this.field4665;
                    var38 = this.field4647.field6966 * var37 / var21 + arg3.field4416;
                    var39 = (this.field4648 * var12 + this.field4663 * var10 + this.field4654 * var47 >> 15) + this.field4651;
                    var40 = this.field4647.field6963 * var39 / var21 + arg3.field4411;
                    var41 = (this.field4646 * var12 + this.field4655 * var48 + this.field4645 * var9 >> 15) + this.field4665;
                    var42 = this.field4647.field6966 * var41 / var22 + arg3.field4416;
                    var43 = (this.field4648 * var12 + this.field4663 * var9 + this.field4654 * var48 >> 15) + this.field4651;
                    var44 = this.field4647.field6963 * var43 / var22 + arg3.field4411;
                }
                boolean var61 = var8.field5545 != -1 && this.method1999(this.field4647.field7256.method1558(var8.field5545, (byte) 126).field3671);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field4417 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field4415 || var42 > arg3.field4415 || var34 > arg3.field4415;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4414 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5545 >= 0) {
                                arg3.method1915(var40, var44, var36, var38, var42, var34, this.field4647.field6982, var15, var16, var14, var8.field5542, var8.field5547, var8.field5551, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5545);
                            } else {
                                arg3.method1914(var40, var44, var36, var38, var42, var34, class374.method2333(var8.field5542, var15 << 24 | this.field4647.field6982, false), class374.method2333(var8.field5547, var16 << 24 | this.field4647.field6982, false), class374.method2333(var8.field5551, var14 << 24 | this.field4647.field6982, false));
                            }
                        } else if (var8.field5545 >= 0) {
                            arg3.method1922(var40, var44, var36, var38, var42, var34, var8.field5542, var8.field5547, var8.field5551, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5545);
                        } else {
                            arg3.method1914(var40, var44, var36, var38, var42, var34, var8.field5542, var8.field5547, var8.field5551);
                        }
                        arg3.field4414 = 0;
                    } else {
                        arg3.method1923(var40, var44, var36, var38, var42, var34, this.field4647.field6982);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field4417 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field4415 || var34 > arg3.field4415 || var42 > arg3.field4415;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4414 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5545 >= 0) {
                                arg3.method1915(var32, var36, var44, var30, var34, var42, this.field4647.field6982, var13, var14, var16, var8.field5544, var8.field5551, var8.field5547, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5545);
                            } else {
                                arg3.method1914(var32, var36, var44, var30, var34, var42, class374.method2333(var8.field5544, var13 << 24 | this.field4647.field6982, false), class374.method2333(var8.field5551, var14 << 24 | this.field4647.field6982, false), class374.method2333(var8.field5547, var16 << 24 | this.field4647.field6982, false));
                            }
                        } else if (var8.field5545 >= 0) {
                            arg3.method1922(var32, var36, var44, var30, var34, var42, var8.field5544, var8.field5551, var8.field5547, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5545);
                        } else {
                            arg3.method1914(var32, var36, var44, var30, var34, var42, var8.field5544, var8.field5551, var8.field5547);
                        }
                        arg3.field4414 = 0;
                        return;
                    }
                    arg3.method1923(var32, var36, var44, var30, var34, var42, this.field4647.field6982);
                }
            }
        } else {
            class108 var64 = this.field4658[arg0][arg1];
            if (var64 != null) {
                if (this.field4662 == -1) {
                    for (int var65 = 0; var65 < var64.field1522; ++var65) {
                        int var66 = (arg0 << super.field2916) + var64.field1523[var65];
                        int var67 = var64.field1530[var65];
                        int var68 = (arg1 << super.field2916) + var64.field1527[var65];
                        int var69 = (this.field4653 * var68 + this.field4664 * var66 + this.field4661 * var67 >> 15) + this.field4650;
                        if (var69 <= this.field4647.field6956) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field4647.field6955;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field1524[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field4647.field6986) {
                            int var72 = var69 - this.field4647.field6955;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field4646 * var68 + this.field4655 * var67 + this.field4645 * var66 >> 15) + this.field4665;
                        int var74 = (this.field4648 * var68 + this.field4663 * var66 + this.field4654 * var67 >> 15) + this.field4651;
                        arg4[var65] = this.field4647.field6966 * var73 / var69 + arg3.field4416;
                        arg5[var65] = this.field4647.field6963 * var74 / var69 + arg3.field4411;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field1522; ++var75) {
                        int var115 = (arg0 << super.field2916) + var64.field1523[var75];
                        int var116 = var64.field1530[var75];
                        int var117 = (arg1 << super.field2916) + var64.field1527[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field4662 - this.field4647.field6955;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field1524[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field4647.field6986) {
                            int var120 = this.field4662 - this.field4647.field6955;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field4646 * var117 + this.field4655 * var116 + this.field4645 * var115 >> 15) + this.field4665;
                        int var122 = (this.field4648 * var117 + this.field4663 * var115 + this.field4654 * var116 >> 15) + this.field4651;
                        arg4[var75] = this.field4647.field6966 * var121 / this.field4662 + arg3.field4416;
                        arg5[var75] = this.field4647.field6963 * var122 / this.field4662 + arg3.field4411;
                    }
                }
                if (var64.field1526 != null) {
                    int var76 = this.field4660[arg0][arg1];
                    int var77 = this.field4660[arg0 + 1][arg1];
                    int var78 = this.field4660[arg0][arg1 + 1];
                    int var79 = super.field2915 * arg0;
                    int var80 = super.field2915 + var79;
                    int var81 = super.field2915 * arg1;
                    int var82 = super.field2915 + var81;
                    int var83 = (this.field4646 * var81 + this.field4655 * var76 + this.field4645 * var79 >> 15) + this.field4665;
                    int var84 = (this.field4648 * var81 + this.field4663 * var79 + this.field4654 * var76 >> 15) + this.field4651;
                    int var85 = (this.field4653 * var81 + this.field4664 * var79 + this.field4661 * var76 >> 15) + this.field4650;
                    int var86 = (this.field4646 * var81 + this.field4655 * var77 + this.field4645 * var80 >> 15) + this.field4665;
                    int var87 = (this.field4648 * var81 + this.field4663 * var80 + this.field4654 * var77 >> 15) + this.field4651;
                    int var88 = (this.field4653 * var81 + this.field4664 * var80 + this.field4661 * var77 >> 15) + this.field4650;
                    int var89 = (this.field4646 * var82 + this.field4655 * var78 + this.field4645 * var79 >> 15) + this.field4665;
                    int var90 = (this.field4648 * var82 + this.field4663 * var79 + this.field4654 * var78 >> 15) + this.field4651;
                    int var91 = (this.field4653 * var82 + this.field4664 * var79 + this.field4661 * var78 >> 15) + this.field4650;
                    for (int var92 = 0; var92 < var64.field1528; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field4417 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field4415 || var97 > arg3.field4415 || var98 > arg3.field4415;
                            short var103 = var64.field1526[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method1999(this.field4647.field7256.method1558(var103, (byte) 106).field3671)) {
                                    arg3.field4414 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1915(var99, var100, var101, var96, var97, var98, this.field4647.field6982, arg6[var93], arg6[var94], arg6[var95], var64.field1529[var93], var64.field1529[var94], var64.field1529[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field1529[var93] & 16777215) != 0) {
                                        arg3.method1914(var99, var100, var101, var96, var97, var98, class374.method2333(var64.field1529[var93], arg6[var93] << 24 | this.field4647.field6982, false), class374.method2333(var64.field1529[var94], arg6[var94] << 24 | this.field4647.field6982, false), class374.method2333(var64.field1529[var95], arg6[var95] << 24 | this.field4647.field6982, false));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1922(var99, var100, var101, var96, var97, var98, var64.field1529[var93], var64.field1529[var94], var64.field1529[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field1529[var93] & 16777215) != 0) {
                                    arg3.method1914(var99, var100, var101, var96, var97, var98, var64.field1529[var93], var64.field1529[var94], var64.field1529[var95]);
                                }
                                arg3.field4414 = 0;
                            } else {
                                arg3.method1923(var99, var100, var101, var96, var97, var98, this.field4647.field6982);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field1528; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field4417 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field4415 || var109 > arg3.field4415 || var110 > arg3.field4415;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field1529[var105] & 16777215) != 0) {
                                    arg3.method1914(var111, var112, var113, var108, var109, var110, class269.method1720((byte) 84, this.field4647.field6982, arg6[var105], var64.field1529[var105]), class269.method1720((byte) 127, this.field4647.field6982, arg6[var106], var64.field1529[var106]), class269.method1720((byte) 91, this.field4647.field6982, arg6[var107], var64.field1529[var107]));
                                }
                            } else if ((var64.field1529[var105] & 16777215) != 0) {
                                arg3.method1914(var111, var112, var113, var108, var109, var110, var64.field1529[var105], var64.field1529[var106], var64.field1529[var107]);
                            }
                        } else {
                            arg3.method1923(var111, var112, var113, var108, var109, var110, this.field4647.field6982);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "QA", descriptor = "(III)V", line = 1340)
    public final void method848(int arg0, int arg1, int arg2) {
        if (this.field4652[arg0][arg1] < arg2) {
            this.field4652[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "(II)I", line = 1347)
    public final int method849(int arg0, int arg1) {
        return this.field4660[arg0][arg1];
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII[[ZLor;[I[I)V", line = 1353)
    private final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class298 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4418 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4649[var16][var17] != null) {
                        class364 var18 = this.field4649[var16][var17];
                        if (var18.field5632 != -1 && (var18.field5633 & 2) == 0 && var18.field5631 == -1) {
                            int var19 = this.field4647.method2871(var18.field5632);
                            arg8.method1918(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class514.method3055(var19, -90, var18.field5627 & 65535), class514.method3055(var19, -114, var18.field5630 & 65535), class514.method3055(var19, -55, var18.field5629 & 65535));
                            arg8.method1918(var15, var15, var15 - var13, var14, var13 + var14, var14, class514.method3055(var19, -40, var18.field5628 & 65535), class514.method3055(var19, -58, var18.field5629 & 65535), class514.method3055(var19, -95, var18.field5630 & 65535));
                        } else if (var18.field5631 == -1) {
                            arg8.method1918(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5627 & 65535, var18.field5630 & 65535, var18.field5629 & 65535);
                            arg8.method1918(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5628 & 65535, var18.field5629 & 65535, var18.field5630 & 65535);
                        } else {
                            int var20 = var18.field5631;
                            arg8.method1918(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1918(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field4657[var16][var17] != null) {
                        class378 var21 = this.field4657[var16][var17];
                        for (int var22 = 0; var22 < var21.field5768; ++var22) {
                            arg9[var22] = var21.field5775[var22] * var13 / super.field2915 + var14;
                            arg10[var22] = var15 - var21.field5773[var22] * var13 / super.field2915;
                        }
                        for (int var23 = 0; var23 < var21.field5774; ++var23) {
                            short var24 = var21.field5770[var23];
                            short var25 = var21.field5767[var23];
                            short var26 = var21.field5772[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5771 != null && var21.field5771[var23] != -1) {
                                int var33 = var21.field5771[var23];
                                arg8.method1918(var30, var31, var32, var27, var28, var29, class514.method3055(var33, -61, var21.field5765[var24]), class514.method3055(var33, -33, var21.field5765[var25]), class514.method3055(var33, -18, var21.field5765[var26]));
                            } else if (var21.field5769 != null && var21.field5769[var23] != -1) {
                                int var34 = this.field4647.method2871(var21.field5769[var23]);
                                arg8.method1918(var30, var31, var32, var27, var28, var29, class514.method3055(var34, -52, var21.field5765[var24]), class514.method3055(var34, -52, var21.field5765[var25]), class514.method3055(var34, -48, var21.field5765[var26]));
                            } else {
                                int var35 = var21.field5776[var23];
                                arg8.method1918(var30, var31, var32, var27, var28, var29, class514.method3055(var35, -52, var21.field5765[var24]), class514.method3055(var35, -41, var21.field5765[var25]), class514.method3055(var35, -53, var21.field5765[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4418 = true;
    }

    @OriginalMember(owner = "client!nj", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 1483)
    public final void method844(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIIIII[[ZLor;[I[I)V", line = 1487)
    private final void method2002(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class298 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4418 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4656[var16][var17] != null) {
                        class358 var18 = this.field4656[var16][var17];
                        if (var18.field5545 != -1 && (var18.field5550 & 2) == 0 && var18.field5541 == 0) {
                            int var19 = this.field4647.method2871(var18.field5545);
                            arg8.method1918(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class514.method3055(var19, -56, var18.field5542), class514.method3055(var19, -98, var18.field5547), class514.method3055(var19, -30, var18.field5551));
                            arg8.method1918(var15, var15, var15 - var13, var14, var13 + var14, var14, class514.method3055(var19, -104, var18.field5544), class514.method3055(var19, -88, var18.field5551), class514.method3055(var19, -103, var18.field5547));
                        } else if (var18.field5541 == 0) {
                            arg8.method1914(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5542, var18.field5547, var18.field5551);
                            arg8.method1914(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5544, var18.field5551, var18.field5547);
                        } else {
                            int var20 = var18.field5541;
                            arg8.method1914(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class374.method2333(var20, var18.field5542 & -16777216, false), class374.method2333(var20, var18.field5547 & -16777216, false), class374.method2333(var20, var18.field5551 & -16777216, false));
                            arg8.method1914(var15, var15, var15 - var13, var14, var13 + var14, var14, class374.method2333(var20, var18.field5544 & -16777216, false), class374.method2333(var20, var18.field5551 & -16777216, false), class374.method2333(var20, var18.field5547 & -16777216, false));
                        }
                    } else if (this.field4658[var16][var17] != null) {
                        class108 var21 = this.field4658[var16][var17];
                        for (int var22 = 0; var22 < var21.field1522; ++var22) {
                            arg9[var22] = var21.field1523[var22] * var13 / super.field2915 + var14;
                            arg10[var22] = var15 - var21.field1527[var22] * var13 / super.field2915;
                        }
                        for (int var23 = 0; var23 < var21.field1528; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1531 != null && var21.field1531[var23] != 0 && (var21.field1526 == null || var21.field1526 != null && var21.field1526[var23] == -1)) {
                                int var33 = var21.field1531[var23];
                                arg8.method1914(var30, var31, var32, var27, var28, var29, class374.method2333(var33, -16777216 - (var21.field1529[var24] & -16777216), false), class374.method2333(var33, -16777216 - (var21.field1529[var25] & -16777216), false), class374.method2333(var33, -16777216 - (var21.field1529[var26] & -16777216), false));
                            } else if (var21.field1526 != null && var21.field1526[var23] != -1) {
                                int var34 = this.field4647.method2871(var21.field1526[var23]);
                                arg8.method1918(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1914(var30, var31, var32, var27, var28, var29, var21.field1529[var24], var21.field1529[var25], var21.field1529[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4418 = true;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lrh;IIII[[I[[II)V", line = 1621)
    public class311(class478 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4647 = arg0;
        this.field4666 = arg2;
        this.field4660 = arg5;
        this.field4659 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4647.field6964 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4647.field6969 * var18 + this.field4647.field6962 * var17 + this.field4647.field6961 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4659[var11][var10] = (byte) var20;
            }
        }
        this.field4652 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!nj", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1679)
    public final void method850(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field4656 == null) {
            this.field4656 = new class358[super.field2912][super.field2914];
            this.field4658 = new class108[super.field2912][super.field2914];
        } else if (this.field4649 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class88.field1208[class500.method2987(arg6[var15], 6755) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class88.field1208[class500.method2987(arg7[var16], 6755) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field2915 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2915 && arg4[var22] == super.field2915) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2915) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2915 != arg2[var24] && arg2[0] - super.field2915 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2915 != arg4[var24] && arg4[0] - super.field2915 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class358 var25 = new class358();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field5541 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field5550 = (byte) (var25.field5550 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field4660[arg0 + 1][arg1] == this.field4660[arg0][arg1] && this.field4660[arg0 + 1][arg1 + 1] == this.field4660[arg0][arg1] && this.field4660[arg0][arg1 + 1] == this.field4660[arg0][arg1]) {
                    var25.field5550 = (byte) (var25.field5550 | 1);
                }
                if (var27 != -1 && (var25.field5550 & 2) == 0 && !this.field4647.field7256.method1558(var27, (byte) 110).field3665) {
                    var25.field5544 = this.field4659[arg0][arg1] - this.field4652[arg0][arg1];
                    var25.field5551 = this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1];
                    var25.field5542 = this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1];
                    var25.field5547 = this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1];
                    var25.field5545 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field5544 = class269.method1720((byte) 83, arg10, var28, method1997(arg6[var18] >> 8, this.field4659[arg0][arg1] - this.field4652[arg0][arg1]));
                    if (var25.field5541 != 0) {
                        var25.field5544 |= 255 - (this.field4659[arg0][arg1] - this.field4652[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field5551 = class269.method1720((byte) 127, arg10, var29, method1997(arg6[var19] >> 8, this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]));
                    if (var25.field5541 != 0) {
                        var25.field5551 |= 255 - (this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field5542 = class269.method1720((byte) 94, arg10, var30, method1997(arg6[var20] >> 8, this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]));
                    if (var25.field5541 != 0) {
                        var25.field5542 |= 255 - (this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field5547 = class269.method1720((byte) 89, arg10, var31, method1997(arg6[var21] >> 8, this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]));
                    if (var25.field5541 != 0) {
                        var25.field5547 |= 255 - (this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]) << 25;
                    }
                    var25.field5545 = -1;
                }
                if (arg5 != null) {
                    var25.field5548 = (short) arg5[var20];
                    var25.field5549 = (short) arg5[var21];
                    var25.field5543 = (short) arg5[var19];
                    var25.field5546 = (short) arg5[var18];
                }
                this.field4656[arg0][arg1] = var25;
            } else {
                class108 var32 = new class108();
                var32.field1522 = (short) arg2.length;
                var32.field1528 = (short) (arg2.length / 3);
                var32.field1523 = new short[var32.field1522];
                var32.field1530 = new short[var32.field1522];
                var32.field1527 = new short[var32.field1522];
                var32.field1529 = new int[var32.field1522];
                if (arg5 != null) {
                    var32.field1524 = new short[var32.field1522];
                }
                for (int var33 = 0; var33 < var32.field1522; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field4659[arg0][arg1] - this.field4652[arg0][arg1];
                    } else if (var48 == 0 && super.field2915 == var49) {
                        var51 = this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1];
                    } else if (super.field2915 == var48 && super.field2915 == var49) {
                        var51 = this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1];
                    } else if (super.field2915 == var48 && var49 == 0) {
                        var51 = this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field4659[arg0 + 1][arg1] - this.field4652[arg0 + 1][arg1]) * var48 + (this.field4659[arg0][arg1] - this.field4652[arg0][arg1]) * (super.field2915 - var48);
                        int var53 = (this.field4659[arg0 + 1][arg1 + 1] - this.field4652[arg0 + 1][arg1 + 1]) * var48 + (this.field4659[arg0][arg1 + 1] - this.field4652[arg0][arg1 + 1]) * (super.field2915 - var48);
                        var51 = (super.field2915 - var49) * var52 + var49 * var53 >> super.field2916 * 2;
                    }
                    int var54 = (arg0 << super.field2916) + var48;
                    int var55 = (arg1 << super.field2916) + var49;
                    var32.field1523[var33] = (short) var48;
                    var32.field1527[var33] = (short) var49;
                    var32.field1530[var33] = (short) (this.method853(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field4647.field7256.method1558(arg8[var33], (byte) 105).field3665) {
                        var32.field1529[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1529[var33] = var51 << 25;
                        } else {
                            var32.field1529[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1524[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1529[var33] = class269.method1720((byte) 86, arg10, var56, method1997(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field1529[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1528; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field4647.field7256.method1558(arg8[var35 * 3], (byte) 114).field3665) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1531 = new int[var32.field1528];
                }
                if (var34) {
                    var32.field1526 = new short[var32.field1528];
                    var32.field1525 = new short[var32.field1528];
                }
                for (int var36 = 0; var36 < var32.field1528; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1531[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field4647.field7256.method1558(var42, (byte) 119).field3665) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field4647.field7256.method1558(var43, (byte) 121).field3665) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field4647.field7256.method1558(var44, (byte) 107).field3665) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1526[var36] = (short) var44;
                            var32.field1525[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field4647.field7256.method1558(var45, (byte) 102).field3665) {
                                    var32.field1529[var37] = class88.field1208[class500.method2987(this.field4647.field7256.method1558(var45, (byte) 107).field3668 & 65535, 6755) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field4647.field7256.method1558(var46, (byte) 125).field3665) {
                                    var32.field1529[var38] = class88.field1208[class500.method2987(this.field4647.field7256.method1558(var46, (byte) 107).field3668 & 65535, 6755) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field4647.field7256.method1558(var47, (byte) 118).field3665) {
                                    var32.field1529[var39] = class88.field1208[class500.method2987(this.field4647.field7256.method1558(var47, (byte) 115).field3668 & 65535, 6755) & 65535];
                                }
                            }
                            var32.field1526[var36] = -1;
                        }
                    }
                }
                this.field4658[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2173)
    public final void method843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class88 var9 = this.field4647.method2868(Thread.currentThread());
        class298 var10 = var9.field1209;
        var10.field4414 = 0;
        var10.field4417 = false;
        if (this.field4656 != null) {
            this.method2002(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1260, var9.field1228);
        } else {
            if (this.field4649 != null) {
                this.method2001(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1260, var9.field1228);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "(Lj;IIIIZ)V", line = 2187)
    public final void method855(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
