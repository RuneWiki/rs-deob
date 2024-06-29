import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class512 extends class23 {

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    private int field7521 = -1;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "Lvq;")
    private class326 field7534;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field7515;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "[[I")
    public int[][] field7527;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "[[B")
    private byte[][] field7529;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "[[B")
    private byte[][] field7533;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    private int field7517;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    private int field7518;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    private int field7519;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    private int field7520;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    private int field7523;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    private int field7524;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    private int field7525;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    private int field7526;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    private int field7530;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    private int field7531;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    private int field7532;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "[[Lhs;")
    private class218[][] field7522;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "[[Lrq;")
    private class238[][] field7528;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "[[Lfw;")
    private class39[][] field7516;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[[Lrl;")
    private class517[][] field7514;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILno;[I[I[I)V")
    private final void method3057(int arg0, int arg1, class504 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class218 var7 = this.field7522[arg0][arg1];
        if (var7 != null) {
            if ((var7.field3057 & 2) == 0) {
                int var8 = super.field336 * arg0;
                int var9 = super.field336 + var8;
                int var10 = super.field336 * arg1;
                int var11 = super.field336 + var10;
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
                if ((var7.field3057 & 1) != 0) {
                    int var12 = this.field7527[arg0][arg1];
                    int var16;
                    if (this.field7521 == -1) {
                        int var13 = this.field7535 * var12;
                        var14 = (this.field7526 * var10 + this.field7520 * var8 + var13 >> 15) + this.field7525;
                        if (var14 <= this.field7534.field5074) {
                            return;
                        }
                        var15 = (this.field7526 * var10 + this.field7520 * var9 + var13 >> 15) + this.field7525;
                        if (var15 <= this.field7534.field5074) {
                            return;
                        }
                        var16 = (this.field7526 * var11 + this.field7520 * var9 + var13 >> 15) + this.field7525;
                        if (var16 <= this.field7534.field5074) {
                            return;
                        }
                        var17 = (this.field7526 * var11 + this.field7520 * var8 + var13 >> 15) + this.field7525;
                        if (var17 <= this.field7534.field5074) {
                            return;
                        }
                    } else {
                        var17 = this.field7521;
                        var16 = this.field7521;
                        var15 = this.field7521;
                        var14 = this.field7521;
                    }
                    int var18 = this.field7524 * var12;
                    int var19 = this.field7532 * var12;
                    var20 = (this.field7519 * var10 + this.field7530 * var8 + var18 >> 15) + this.field7518;
                    var21 = this.field7534.field5089 * var20 / var14 + arg2.field7438;
                    var22 = (this.field7531 * var10 + this.field7517 * var8 + var19 >> 15) + this.field7523;
                    var23 = this.field7534.field5067 * var22 / var14 + arg2.field7435;
                    var24 = (this.field7519 * var10 + this.field7530 * var9 + var18 >> 15) + this.field7518;
                    var25 = this.field7534.field5089 * var24 / var15 + arg2.field7438;
                    var26 = (this.field7531 * var10 + this.field7517 * var9 + var19 >> 15) + this.field7523;
                    var27 = this.field7534.field5067 * var26 / var15 + arg2.field7435;
                    int var28 = (this.field7519 * var11 + this.field7530 * var9 + var18 >> 15) + this.field7518;
                    var29 = this.field7534.field5089 * var28 / var16 + arg2.field7438;
                    int var30 = (this.field7531 * var11 + this.field7517 * var9 + var19 >> 15) + this.field7523;
                    var31 = this.field7534.field5067 * var30 / var16 + arg2.field7435;
                    var32 = (this.field7519 * var11 + this.field7530 * var8 + var18 >> 15) + this.field7518;
                    var33 = this.field7534.field5089 * var32 / var17 + arg2.field7438;
                    var34 = (this.field7531 * var11 + this.field7517 * var8 + var19 >> 15) + this.field7523;
                    var35 = this.field7534.field5067 * var34 / var17 + arg2.field7435;
                } else {
                    int var36 = this.field7527[arg0][arg1];
                    int var37 = this.field7527[arg0 + 1][arg1];
                    int var38 = this.field7527[arg0 + 1][arg1 + 1];
                    int var39 = this.field7527[arg0][arg1 + 1];
                    int var40;
                    if (this.field7521 == -1) {
                        var14 = (this.field7526 * var10 + this.field7535 * var36 + this.field7520 * var8 >> 15) + this.field7525;
                        if (var14 <= this.field7534.field5074) {
                            return;
                        }
                        var15 = (this.field7526 * var10 + this.field7535 * var37 + this.field7520 * var9 >> 15) + this.field7525;
                        if (var15 <= this.field7534.field5074) {
                            return;
                        }
                        var40 = (this.field7526 * var11 + this.field7535 * var38 + this.field7520 * var9 >> 15) + this.field7525;
                        if (var40 <= this.field7534.field5074) {
                            return;
                        }
                        var17 = (this.field7526 * var11 + this.field7535 * var39 + this.field7520 * var8 >> 15) + this.field7525;
                        if (var17 <= this.field7534.field5074) {
                            return;
                        }
                    } else {
                        var17 = this.field7521;
                        var40 = this.field7521;
                        var15 = this.field7521;
                        var14 = this.field7521;
                    }
                    var20 = (this.field7519 * var10 + this.field7530 * var8 + this.field7524 * var36 >> 15) + this.field7518;
                    var21 = this.field7534.field5089 * var20 / var14 + arg2.field7438;
                    var22 = (this.field7531 * var10 + this.field7532 * var36 + this.field7517 * var8 >> 15) + this.field7523;
                    var23 = this.field7534.field5067 * var22 / var14 + arg2.field7435;
                    var24 = (this.field7519 * var10 + this.field7530 * var9 + this.field7524 * var37 >> 15) + this.field7518;
                    var25 = this.field7534.field5089 * var24 / var15 + arg2.field7438;
                    var26 = (this.field7531 * var10 + this.field7532 * var37 + this.field7517 * var9 >> 15) + this.field7523;
                    var27 = this.field7534.field5067 * var26 / var15 + arg2.field7435;
                    int var41 = (this.field7519 * var11 + this.field7530 * var9 + this.field7524 * var38 >> 15) + this.field7518;
                    var29 = this.field7534.field5089 * var41 / var40 + arg2.field7438;
                    int var42 = (this.field7531 * var11 + this.field7532 * var38 + this.field7517 * var9 >> 15) + this.field7523;
                    var31 = this.field7534.field5067 * var42 / var40 + arg2.field7435;
                    var32 = (this.field7519 * var11 + this.field7530 * var8 + this.field7524 * var39 >> 15) + this.field7518;
                    var33 = this.field7534.field5089 * var32 / var17 + arg2.field7438;
                    var34 = (this.field7531 * var11 + this.field7532 * var39 + this.field7517 * var8 >> 15) + this.field7523;
                    var35 = this.field7534.field5067 * var34 / var17 + arg2.field7435;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field7429 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field7431 || var33 > arg2.field7431 || var25 > arg2.field7431;
                    if (var7.field3063 >= 0) {
                        if (this.method3062(this.field7534.field2235.method157((byte) 120, var7.field3063).field1506)) {
                            arg2.field7428 = 100;
                        }
                        arg2.method3029(var31, var35, var27, var29, var33, var25, var7.field3059 & 65535, var7.field3061 & 65535, var7.field3060 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3063);
                        arg2.field7428 = 0;
                    } else {
                        arg2.method3022(var31, var35, var27, var29, var33, var25, var7.field3059 & 65535, var7.field3061 & 65535, var7.field3060 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field7429 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field7431 || var25 > arg2.field7431 || var33 > arg2.field7431;
                    if (var7.field3063 >= 0) {
                        if (this.method3062(this.field7534.field2235.method157((byte) 123, var7.field3063).field1506)) {
                            arg2.field7428 = 100;
                        }
                        arg2.method3029(var23, var27, var35, var21, var25, var33, var7.field3058 & 65535, var7.field3060 & 65535, var7.field3061 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3063);
                        arg2.field7428 = 0;
                        return;
                    }
                    arg2.method3022(var23, var27, var35, var21, var25, var33, var7.field3058 & 65535, var7.field3060 & 65535, var7.field3061 & 65535);
                }
            }
        } else {
            class517 var43 = this.field7514[arg0][arg1];
            if (var43 != null) {
                if (this.field7521 == -1) {
                    for (int var44 = 0; var44 < var43.field7609; ++var44) {
                        int var45 = (arg0 << super.field341) + var43.field7612[var44];
                        short var46 = var43.field7606[var44];
                        int var47 = (arg1 << super.field341) + var43.field7615[var44];
                        int var48 = (this.field7526 * var47 + this.field7535 * var46 + this.field7520 * var45 >> 15) + this.field7525;
                        if (var48 <= this.field7534.field5074) {
                            return;
                        }
                        int var49 = (this.field7519 * var47 + this.field7530 * var45 + this.field7524 * var46 >> 15) + this.field7518;
                        int var50 = (this.field7531 * var47 + this.field7532 * var46 + this.field7517 * var45 >> 15) + this.field7523;
                        arg3[var44] = this.field7534.field5089 * var49 / var48 + arg2.field7438;
                        arg4[var44] = this.field7534.field5067 * var50 / var48 + arg2.field7435;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field7609; ++var51) {
                        int var91 = (arg0 << super.field341) + var43.field7612[var51];
                        short var92 = var43.field7606[var51];
                        int var93 = (arg1 << super.field341) + var43.field7615[var51];
                        int var94 = (this.field7519 * var93 + this.field7530 * var91 + this.field7524 * var92 >> 15) + this.field7518;
                        int var95 = (this.field7531 * var93 + this.field7532 * var92 + this.field7517 * var91 >> 15) + this.field7523;
                        arg3[var51] = this.field7534.field5089 * var94 / this.field7521 + arg2.field7438;
                        arg4[var51] = this.field7534.field5067 * var95 / this.field7521 + arg2.field7435;
                    }
                }
                if (var43.field7614 != null) {
                    int var52 = this.field7527[arg0][arg1];
                    int var53 = this.field7527[arg0 + 1][arg1];
                    int var54 = this.field7527[arg0][arg1 + 1];
                    int var55 = super.field336 * arg0;
                    int var56 = super.field336 + var55;
                    int var57 = super.field336 * arg1;
                    int var58 = super.field336 + var57;
                    int var59 = (this.field7519 * var57 + this.field7530 * var55 + this.field7524 * var52 >> 15) + this.field7518;
                    int var60 = (this.field7531 * var57 + this.field7532 * var52 + this.field7517 * var55 >> 15) + this.field7523;
                    int var61 = (this.field7526 * var57 + this.field7535 * var52 + this.field7520 * var55 >> 15) + this.field7525;
                    int var62 = (this.field7519 * var57 + this.field7530 * var56 + this.field7524 * var53 >> 15) + this.field7518;
                    int var63 = (this.field7531 * var57 + this.field7532 * var53 + this.field7517 * var56 >> 15) + this.field7523;
                    int var64 = (this.field7526 * var57 + this.field7535 * var53 + this.field7520 * var56 >> 15) + this.field7525;
                    int var65 = (this.field7519 * var58 + this.field7530 * var55 + this.field7524 * var54 >> 15) + this.field7518;
                    int var66 = (this.field7531 * var58 + this.field7532 * var54 + this.field7517 * var55 >> 15) + this.field7523;
                    int var67 = (this.field7526 * var58 + this.field7535 * var54 + this.field7520 * var55 >> 15) + this.field7525;
                    for (int var68 = 0; var68 < var43.field7604; ++var68) {
                        short var69 = var43.field7610[var68];
                        short var70 = var43.field7611[var68];
                        short var71 = var43.field7607[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field7429 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field7431 || var73 > arg2.field7431 || var74 > arg2.field7431;
                            short var78 = var43.field7614[var68];
                            if (var78 != -1) {
                                if (this.method3062(this.field7534.field2235.method157((byte) 125, var78).field1506)) {
                                    arg2.field7428 = 100;
                                }
                                arg2.method3029(var75, var76, var77, var72, var73, var74, var43.field7613[var69], var43.field7613[var70], var43.field7613[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field7428 = 0;
                            } else {
                                int var79 = var43.field7605[var68];
                                if (var79 != -1) {
                                    arg2.method3022(var75, var76, var77, var72, var73, var74, class168.method1136(var79, 49, var43.field7613[var69]), class168.method1136(var79, 108, var43.field7613[var70]), class168.method1136(var79, 115, var43.field7613[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field7604; ++var80) {
                    short var81 = var43.field7610[var80];
                    short var82 = var43.field7611[var80];
                    short var83 = var43.field7607[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field7605[var80];
                        if (var90 != -1) {
                            arg2.field7429 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field7431 || var85 > arg2.field7431 || var86 > arg2.field7431;
                            arg2.method3022(var87, var88, var89, var84, var85, var86, class168.method1136(var90, 45, var43.field7613[var81]), class168.method1136(var90, 82, var43.field7613[var82]), class168.method1136(var90, 99, var43.field7613[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method216(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field7516 == null) {
            this.field7516 = new class39[super.field340][super.field337];
            this.field7528 = new class238[super.field340][super.field337];
        } else if (this.field7522 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class179.field2408[class151.method987(false, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class179.field2408[class151.method987(false, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field336 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field336 && arg4[var22] == super.field336) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field336) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field336 != arg2[var24] && arg2[0] - super.field336 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field336 != arg4[var24] && arg4[0] - super.field336 != arg4[var24]) {
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
                class39 var25 = new class39();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field579 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field585 = (byte) (var25.field585 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field7527[arg0 + 1][arg1] == this.field7527[arg0][arg1] && this.field7527[arg0 + 1][arg1 + 1] == this.field7527[arg0][arg1] && this.field7527[arg0][arg1 + 1] == this.field7527[arg0][arg1]) {
                    var25.field585 = (byte) (var25.field585 | 1);
                }
                if (var27 != -1 && (var25.field585 & 2) == 0 && !this.field7534.field2235.method157((byte) 120, var27).field1515) {
                    var25.field582 = this.field7529[arg0][arg1] - this.field7533[arg0][arg1];
                    var25.field580 = this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1];
                    var25.field581 = this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1];
                    var25.field583 = this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1];
                    var25.field584 = (short) var27;
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
                    var25.field582 = class71.method491(arg10, var28, method3060(arg6[var18] >> 8, this.field7529[arg0][arg1] - this.field7533[arg0][arg1]), 1);
                    if (var25.field579 != 0) {
                        var25.field582 |= 255 - (this.field7529[arg0][arg1] - this.field7533[arg0][arg1]) << 25;
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
                    var25.field580 = class71.method491(arg10, var29, method3060(arg6[var19] >> 8, this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]), 1);
                    if (var25.field579 != 0) {
                        var25.field580 |= 255 - (this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]) << 25;
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
                    var25.field581 = class71.method491(arg10, var30, method3060(arg6[var20] >> 8, this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]), 1);
                    if (var25.field579 != 0) {
                        var25.field581 |= 255 - (this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field583 = class71.method491(arg10, var31, method3060(arg6[var21] >> 8, this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]), 1);
                    if (var25.field579 != 0) {
                        var25.field583 |= 255 - (this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]) << 25;
                    }
                    var25.field584 = -1;
                }
                if (arg5 != null) {
                    var25.field578 = (short) arg5[var20];
                    var25.field587 = (short) arg5[var21];
                    var25.field586 = (short) arg5[var19];
                    var25.field577 = (short) arg5[var18];
                }
                this.field7516[arg0][arg1] = var25;
            } else {
                class238 var32 = new class238();
                var32.field3357 = (short) arg2.length;
                var32.field3356 = (short) (arg2.length / 3);
                var32.field3351 = new short[var32.field3357];
                var32.field3359 = new short[var32.field3357];
                var32.field3352 = new short[var32.field3357];
                var32.field3354 = new int[var32.field3357];
                if (arg5 != null) {
                    var32.field3358 = new short[var32.field3357];
                }
                for (int var33 = 0; var33 < var32.field3357; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field7529[arg0][arg1] - this.field7533[arg0][arg1];
                    } else if (var48 == 0 && super.field336 == var49) {
                        var51 = this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1];
                    } else if (super.field336 == var48 && super.field336 == var49) {
                        var51 = this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1];
                    } else if (super.field336 == var48 && var49 == 0) {
                        var51 = this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]) * var48 + (this.field7529[arg0][arg1] - this.field7533[arg0][arg1]) * (super.field336 - var48);
                        int var53 = (this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]) * var48 + (this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]) * (super.field336 - var48);
                        var51 = (super.field336 - var49) * var52 + var49 * var53 >> super.field341 * 2;
                    }
                    int var54 = (arg0 << super.field341) + var48;
                    int var55 = (arg1 << super.field341) + var49;
                    var32.field3351[var33] = (short) var48;
                    var32.field3352[var33] = (short) var49;
                    var32.field3359[var33] = (short) (this.method218(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field7534.field2235.method157((byte) 115, arg8[var33]).field1515) {
                        var32.field3354[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3354[var33] = var51 << 25;
                        } else {
                            var32.field3354[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3358[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3354[var33] = class71.method491(arg10, var56, method3060(arg6[var33] >> 8, var51), 1);
                        if (arg7 != null) {
                            var32.field3354[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3356; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field7534.field2235.method157((byte) 122, arg8[var35 * 3]).field1515) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3355 = new int[var32.field3356];
                }
                if (var34) {
                    var32.field3350 = new short[var32.field3356];
                    var32.field3353 = new short[var32.field3356];
                }
                for (int var36 = 0; var36 < var32.field3356; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3355[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field7534.field2235.method157((byte) 105, var42).field1515) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field7534.field2235.method157((byte) 126, var43).field1515) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field7534.field2235.method157((byte) 110, var44).field1515) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3350[var36] = (short) var44;
                            var32.field3353[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field7534.field2235.method157((byte) 126, var45).field1515) {
                                    var32.field3354[var37] = class179.field2408[class151.method987(false, this.field7534.field2235.method157((byte) 101, var45).field1499 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field7534.field2235.method157((byte) 119, var46).field1515) {
                                    var32.field3354[var38] = class179.field2408[class151.method987(false, this.field7534.field2235.method157((byte) 124, var46).field1499 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field7534.field2235.method157((byte) 113, var47).field1515) {
                                    var32.field3354[var39] = class179.field2408[class151.method987(false, this.field7534.field2235.method157((byte) 108, var47).field1499 & 65535) & 65535];
                                }
                            }
                            var32.field3350[var36] = -1;
                        }
                    }
                }
                this.field7528[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII[[ZLno;[I[I)V")
    private final void method3058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class504 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field7439 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field7522[var16][var17] != null) {
                        class218 var18 = this.field7522[var16][var17];
                        if (var18.field3063 != -1 && (var18.field3057 & 2) == 0 && var18.field3062 == -1) {
                            int var19 = this.field7534.method2100(var18.field3063);
                            arg8.method3022(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class168.method1136(var19, 53, var18.field3059 & 65535), class168.method1136(var19, 83, var18.field3061 & 65535), class168.method1136(var19, 52, var18.field3060 & 65535));
                            arg8.method3022(var15, var15, var15 - var13, var14, var13 + var14, var14, class168.method1136(var19, 113, var18.field3058 & 65535), class168.method1136(var19, 47, var18.field3060 & 65535), class168.method1136(var19, 73, var18.field3061 & 65535));
                        } else if (var18.field3062 == -1) {
                            arg8.method3022(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3059 & 65535, var18.field3061 & 65535, var18.field3060 & 65535);
                            arg8.method3022(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3058 & 65535, var18.field3060 & 65535, var18.field3061 & 65535);
                        } else {
                            int var20 = var18.field3062;
                            arg8.method3022(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method3022(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field7514[var16][var17] != null) {
                        class517 var21 = this.field7514[var16][var17];
                        for (int var22 = 0; var22 < var21.field7609; ++var22) {
                            arg9[var22] = var21.field7612[var22] * var13 / super.field336 + var14;
                            arg10[var22] = var15 - var21.field7615[var22] * var13 / super.field336;
                        }
                        for (int var23 = 0; var23 < var21.field7604; ++var23) {
                            short var24 = var21.field7610[var23];
                            short var25 = var21.field7611[var23];
                            short var26 = var21.field7607[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field7616 != null && var21.field7616[var23] != -1) {
                                int var33 = var21.field7616[var23];
                                arg8.method3022(var30, var31, var32, var27, var28, var29, class168.method1136(var33, 117, var21.field7613[var24]), class168.method1136(var33, 50, var21.field7613[var25]), class168.method1136(var33, 94, var21.field7613[var26]));
                            } else if (var21.field7614 != null && var21.field7614[var23] != -1) {
                                int var34 = this.field7534.method2100(var21.field7614[var23]);
                                arg8.method3022(var30, var31, var32, var27, var28, var29, class168.method1136(var34, 127, var21.field7613[var24]), class168.method1136(var34, 74, var21.field7613[var25]), class168.method1136(var34, 95, var21.field7613[var26]));
                            } else {
                                int var35 = var21.field7605[var23];
                                arg8.method3022(var30, var31, var32, var27, var28, var29, class168.method1136(var35, 93, var21.field7613[var24]), class168.method1136(var35, 81, var21.field7613[var25]), class168.method1136(var35, 116, var21.field7613[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field7439 = true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method221(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7522 == null) {
            this.field7522 = new class218[super.field340][super.field337];
            this.field7514 = new class517[super.field340][super.field337];
        } else if (this.field7516 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field336 != var20 || var21 != 0 && super.field336 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class517 var22 = new class517();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field7609 = var23;
            var22.field7613 = new short[var23];
            var22.field7612 = new short[var23];
            var22.field7606 = new short[var23];
            var22.field7615 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field7613[var25] = (short) (this.field7529[arg0][arg1] - this.field7533[arg0][arg1]);
                } else if (var30 == 0 && super.field336 == var31) {
                    var22.field7613[var25] = (short) (this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]);
                } else if (super.field336 == var30 && super.field336 == var31) {
                    var22.field7613[var25] = (short) (this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]);
                } else if (super.field336 == var30 && var31 == 0) {
                    var22.field7613[var25] = (short) (this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]) * var30 + (this.field7529[arg0][arg1] - this.field7533[arg0][arg1]) * (super.field336 - var30);
                    int var33 = (this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]) * var30 + (this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]) * (super.field336 - var30);
                    var22.field7613[var25] = (short) ((super.field336 - var31) * var32 + var31 * var33 >> super.field341 * 2);
                }
                int var34 = (arg0 << super.field341) + var30;
                int var35 = (arg1 << super.field341) + var31;
                var22.field7612[var25] = (short) var30;
                var22.field7615[var25] = (short) var31;
                var22.field7606[var25] = (short) (this.method218(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field7613[var25] < 2) {
                    var22.field7613[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field7534.field2235.method157((byte) 107, arg11[var28]).field1515) {
                    var26 = true;
                }
            }
            var22.field7605 = new int[var27];
            if (arg10 != null) {
                var22.field7616 = new int[var27];
            }
            var22.field7610 = new short[var27];
            var22.field7611 = new short[var27];
            var22.field7607 = new short[var27];
            if (var26) {
                var22.field7614 = new short[var27];
                var22.field7608 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field7605[var22.field7604] = class151.method987(false, arg9[var29]);
                    } else {
                        var22.field7605[var22.field7604] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field7616[var22.field7604] = class151.method987(false, arg10[var29]);
                        } else {
                            var22.field7616[var22.field7604] = -1;
                        }
                    }
                    var22.field7610[var22.field7604] = (short) arg6[var29];
                    var22.field7611[var22.field7604] = (short) arg7[var29];
                    var22.field7607[var22.field7604] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7534.field2235.method157((byte) 120, arg11[var29]).field1515) {
                            var22.field7614[var22.field7604] = (short) arg11[var29];
                            var22.field7608[var22.field7604] = (short) arg12[var29];
                        } else {
                            var22.field7614[var22.field7604] = -1;
                        }
                    }
                    ++var22.field7604;
                }
            }
            this.field7514[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class218 var36 = new class218();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field3062 = class168.method1136(class151.method987(false, arg10[0]), 60, this.field7529[arg0][arg1] - this.field7533[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field3057 = (byte) (var36.field3057 | 2);
                    }
                }
                if (this.field7527[arg0 + 1][arg1] == this.field7527[arg0][arg1] && this.field7527[arg0 + 1][arg1 + 1] == this.field7527[arg0][arg1] && this.field7527[arg0][arg1 + 1] == this.field7527[arg0][arg1]) {
                    var36.field3057 = (byte) (var36.field3057 | 1);
                }
                if (var38 != -1 && (var36.field3057 & 2) == 0 && !this.field7534.field2235.method157((byte) 104, var38).field1515) {
                    var36.field3058 = (short) (this.field7529[arg0][arg1] - this.field7533[arg0][arg1]);
                    var36.field3060 = (short) (this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]);
                    var36.field3059 = (short) (this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]);
                    var36.field3061 = (short) (this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]);
                    var36.field3063 = (short) var38;
                } else {
                    short var39 = class151.method987(false, var37);
                    var36.field3058 = (short) class168.method1136(var39, 127, this.field7529[arg0][arg1] - this.field7533[arg0][arg1]);
                    var36.field3060 = (short) class168.method1136(var39, 60, this.field7529[arg0 + 1][arg1] - this.field7533[arg0 + 1][arg1]);
                    var36.field3059 = (short) class168.method1136(var39, 93, this.field7529[arg0 + 1][arg1 + 1] - this.field7533[arg0 + 1][arg1 + 1]);
                    var36.field3061 = (short) class168.method1136(var39, 104, this.field7529[arg0][arg1 + 1] - this.field7533[arg0][arg1 + 1]);
                    var36.field3063 = -1;
                }
                this.field7522[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "()V")
    public final void method211() {
        this.field7529 = null;
        this.field7533 = null;
    }

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "(IILia;)Lia;")
    public final class423 method215(int arg0, int arg1, class423 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIIIIII[[ZLno;[I[I)V")
    private final void method3059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class504 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field7439 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field7516[var16][var17] != null) {
                        class39 var18 = this.field7516[var16][var17];
                        if (var18.field584 != -1 && (var18.field585 & 2) == 0 && var18.field579 == 0) {
                            int var19 = this.field7534.method2100(var18.field584);
                            arg8.method3022(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class168.method1136(var19, 52, var18.field581), class168.method1136(var19, 46, var18.field583), class168.method1136(var19, 33, var18.field580));
                            arg8.method3022(var15, var15, var15 - var13, var14, var13 + var14, var14, class168.method1136(var19, 121, var18.field582), class168.method1136(var19, 37, var18.field580), class168.method1136(var19, 98, var18.field583));
                        } else if (var18.field579 == 0) {
                            arg8.method3018(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field581, var18.field583, var18.field580);
                            arg8.method3018(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field582, var18.field580, var18.field583);
                        } else {
                            int var20 = var18.field579;
                            arg8.method3018(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class325.method2017(var18.field581 & -16777216, var20, -96), class325.method2017(var18.field583 & -16777216, var20, -128), class325.method2017(var18.field580 & -16777216, var20, -84));
                            arg8.method3018(var15, var15, var15 - var13, var14, var13 + var14, var14, class325.method2017(var18.field582 & -16777216, var20, -85), class325.method2017(var18.field580 & -16777216, var20, -119), class325.method2017(var18.field583 & -16777216, var20, -89));
                        }
                    } else if (this.field7528[var16][var17] != null) {
                        class238 var21 = this.field7528[var16][var17];
                        for (int var22 = 0; var22 < var21.field3357; ++var22) {
                            arg9[var22] = var21.field3351[var22] * var13 / super.field336 + var14;
                            arg10[var22] = var15 - var21.field3352[var22] * var13 / super.field336;
                        }
                        for (int var23 = 0; var23 < var21.field3356; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3355 == null || var21.field3355[var23] == 0 || var21.field3350 != null && (var21.field3350 == null || var21.field3350[var23] != -1)) {
                                if (var21.field3350 != null && var21.field3350[var23] != -1) {
                                    int var34 = this.field7534.method2100(var21.field3350[var23]);
                                    arg8.method3022(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method3018(var30, var31, var32, var27, var28, var29, var21.field3354[var24], var21.field3354[var25], var21.field3354[var26]);
                                }
                            } else {
                                int var33 = var21.field3355[var23];
                                arg8.method3018(var30, var31, var32, var27, var28, var29, class325.method2017(-16777216 - (var21.field3354[var24] & -16777216), var33, -82), class325.method2017(-16777216 - (var21.field3354[var25] & -16777216), var33, -105), class325.method2017(-16777216 - (var21.field3354[var26] & -16777216), var33, -97));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field7439 = true;
    }

    @OriginalMember(owner = "client!nk", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public final void method209(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)I")
    private static final int method3060(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        if (this.field7533[arg0][arg1] < arg2) {
            this.field7533[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "(II)I")
    public final int method218(int arg0, int arg1) {
        int var3 = arg0 >> super.field341;
        int var4 = arg1 >> super.field341;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field340 - 1 && var4 <= super.field337 - 1) {
            int var5 = arg0 & super.field336 - 1;
            int var6 = arg1 & super.field336 - 1;
            int var7 = (super.field336 - var5) * this.field7527[var3][var4] + this.field7527[var3 + 1][var4] * var5 >> super.field341;
            int var8 = (super.field336 - var5) * this.field7527[var3][var4 + 1] + this.field7527[var3 + 1][var4 + 1] * var5 >> super.field341;
            return (super.field336 - var6) * var7 + var6 * var8 >> super.field341;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "(Lia;IIIIZ)V")
    public final void method223(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!nk", name = "oa", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        return this.field7527[arg0][arg1];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZLno;[I[I[I)V")
    private final void method3061(int arg0, int arg1, boolean arg2, class504 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class39 var8 = this.field7516[arg0][arg1];
        if (var8 != null) {
            if ((var8.field585 & 2) == 0) {
                int var9 = super.field336 * arg0;
                int var10 = super.field336 + var9;
                int var11 = super.field336 * arg1;
                int var12 = super.field336 + var11;
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
                if ((var8.field585 & 1) != 0 && !arg2) {
                    int var17 = this.field7527[arg0][arg1];
                    if (this.field7521 == -1) {
                        int var18 = this.field7535 * var17;
                        var19 = (this.field7526 * var11 + this.field7520 * var9 + var18 >> 15) + this.field7525;
                        if (var19 <= this.field7534.field5074) {
                            return;
                        }
                        var20 = (this.field7526 * var11 + this.field7520 * var10 + var18 >> 15) + this.field7525;
                        if (var20 <= this.field7534.field5074) {
                            return;
                        }
                        var21 = (this.field7526 * var12 + this.field7520 * var10 + var18 >> 15) + this.field7525;
                        if (var21 <= this.field7534.field5074) {
                            return;
                        }
                        var22 = (this.field7526 * var12 + this.field7520 * var9 + var18 >> 15) + this.field7525;
                        if (var22 <= this.field7534.field5074) {
                            return;
                        }
                    } else {
                        var22 = this.field7521;
                        var21 = this.field7521;
                        var20 = this.field7521;
                        var19 = this.field7521;
                    }
                    if (this.field7534.field5069) {
                        int var23 = var19 - this.field7534.field5083;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field7534.field5083;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field7534.field5083;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field7534.field5083;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field7524 * var17;
                    int var28 = this.field7532 * var17;
                    var29 = (this.field7519 * var11 + this.field7530 * var9 + var27 >> 15) + this.field7518;
                    var30 = this.field7534.field5089 * var29 / var19 + arg3.field7438;
                    var31 = (this.field7531 * var11 + this.field7517 * var9 + var28 >> 15) + this.field7523;
                    var32 = this.field7534.field5067 * var31 / var19 + arg3.field7435;
                    var33 = (this.field7519 * var11 + this.field7530 * var10 + var27 >> 15) + this.field7518;
                    var34 = this.field7534.field5089 * var33 / var20 + arg3.field7438;
                    var35 = (this.field7531 * var11 + this.field7517 * var10 + var28 >> 15) + this.field7523;
                    var36 = this.field7534.field5067 * var35 / var20 + arg3.field7435;
                    var37 = (this.field7519 * var12 + this.field7530 * var10 + var27 >> 15) + this.field7518;
                    var38 = this.field7534.field5089 * var37 / var21 + arg3.field7438;
                    var39 = (this.field7531 * var12 + this.field7517 * var10 + var28 >> 15) + this.field7523;
                    var40 = this.field7534.field5067 * var39 / var21 + arg3.field7435;
                    var41 = (this.field7519 * var12 + this.field7530 * var9 + var27 >> 15) + this.field7518;
                    var42 = this.field7534.field5089 * var41 / var22 + arg3.field7438;
                    var43 = (this.field7531 * var12 + this.field7517 * var9 + var28 >> 15) + this.field7523;
                    var44 = this.field7534.field5067 * var43 / var22 + arg3.field7435;
                } else {
                    int var45 = this.field7527[arg0][arg1];
                    int var46 = this.field7527[arg0 + 1][arg1];
                    int var47 = this.field7527[arg0 + 1][arg1 + 1];
                    int var48 = this.field7527[arg0][arg1 + 1];
                    if (this.field7521 == -1) {
                        var19 = (this.field7526 * var11 + this.field7535 * var45 + this.field7520 * var9 >> 15) + this.field7525;
                        if (var19 <= this.field7534.field5074) {
                            return;
                        }
                        var20 = (this.field7526 * var11 + this.field7535 * var46 + this.field7520 * var10 >> 15) + this.field7525;
                        if (var20 <= this.field7534.field5074) {
                            return;
                        }
                        var21 = (this.field7526 * var12 + this.field7535 * var47 + this.field7520 * var10 >> 15) + this.field7525;
                        if (var21 <= this.field7534.field5074) {
                            return;
                        }
                        var22 = (this.field7526 * var12 + this.field7535 * var48 + this.field7520 * var9 >> 15) + this.field7525;
                        if (var22 <= this.field7534.field5074) {
                            return;
                        }
                    } else {
                        var22 = this.field7521;
                        var21 = this.field7521;
                        var20 = this.field7521;
                        var19 = this.field7521;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field7534.field5083;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field577 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field7534.field5083;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field586 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field7534.field5083;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field578 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field7534.field5083;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field587 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field7534.field5069) {
                        int var57 = var19 - this.field7534.field5083;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field7534.field5083;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field7534.field5083;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field7534.field5083;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field7519 * var11 + this.field7530 * var9 + this.field7524 * var45 >> 15) + this.field7518;
                    var30 = this.field7534.field5089 * var29 / var19 + arg3.field7438;
                    var31 = (this.field7531 * var11 + this.field7532 * var45 + this.field7517 * var9 >> 15) + this.field7523;
                    var32 = this.field7534.field5067 * var31 / var19 + arg3.field7435;
                    var33 = (this.field7519 * var11 + this.field7530 * var10 + this.field7524 * var46 >> 15) + this.field7518;
                    var34 = this.field7534.field5089 * var33 / var20 + arg3.field7438;
                    var35 = (this.field7531 * var11 + this.field7532 * var46 + this.field7517 * var10 >> 15) + this.field7523;
                    var36 = this.field7534.field5067 * var35 / var20 + arg3.field7435;
                    var37 = (this.field7519 * var12 + this.field7530 * var10 + this.field7524 * var47 >> 15) + this.field7518;
                    var38 = this.field7534.field5089 * var37 / var21 + arg3.field7438;
                    var39 = (this.field7531 * var12 + this.field7532 * var47 + this.field7517 * var10 >> 15) + this.field7523;
                    var40 = this.field7534.field5067 * var39 / var21 + arg3.field7435;
                    var41 = (this.field7519 * var12 + this.field7530 * var9 + this.field7524 * var48 >> 15) + this.field7518;
                    var42 = this.field7534.field5089 * var41 / var22 + arg3.field7438;
                    var43 = (this.field7531 * var12 + this.field7532 * var48 + this.field7517 * var9 >> 15) + this.field7523;
                    var44 = this.field7534.field5067 * var43 / var22 + arg3.field7435;
                }
                boolean var61 = var8.field584 != -1 && this.method3062(this.field7534.field2235.method157((byte) 124, var8.field584).field1506);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field7429 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field7431 || var42 > arg3.field7431 || var34 > arg3.field7431;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field7428 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field584 >= 0) {
                                arg3.method3031(var40, var44, var36, var38, var42, var34, this.field7534.field5075, var15, var16, var14, var8.field581, var8.field583, var8.field580, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field584);
                            } else {
                                arg3.method3018(var40, var44, var36, var38, var42, var34, class325.method2017(var15 << 24 | this.field7534.field5075, var8.field581, -104), class325.method2017(var16 << 24 | this.field7534.field5075, var8.field583, -78), class325.method2017(var14 << 24 | this.field7534.field5075, var8.field580, -85));
                            }
                        } else if (var8.field584 >= 0) {
                            arg3.method3029(var40, var44, var36, var38, var42, var34, var8.field581, var8.field583, var8.field580, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field584);
                        } else {
                            arg3.method3018(var40, var44, var36, var38, var42, var34, var8.field581, var8.field583, var8.field580);
                        }
                        arg3.field7428 = 0;
                    } else {
                        arg3.method3020(var40, var44, var36, var38, var42, var34, this.field7534.field5075);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field7429 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field7431 || var34 > arg3.field7431 || var42 > arg3.field7431;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field7428 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field584 >= 0) {
                                arg3.method3031(var32, var36, var44, var30, var34, var42, this.field7534.field5075, var13, var14, var16, var8.field582, var8.field580, var8.field583, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field584);
                            } else {
                                arg3.method3018(var32, var36, var44, var30, var34, var42, class325.method2017(var13 << 24 | this.field7534.field5075, var8.field582, -86), class325.method2017(var14 << 24 | this.field7534.field5075, var8.field580, -111), class325.method2017(var16 << 24 | this.field7534.field5075, var8.field583, -84));
                            }
                        } else if (var8.field584 >= 0) {
                            arg3.method3029(var32, var36, var44, var30, var34, var42, var8.field582, var8.field580, var8.field583, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field584);
                        } else {
                            arg3.method3018(var32, var36, var44, var30, var34, var42, var8.field582, var8.field580, var8.field583);
                        }
                        arg3.field7428 = 0;
                        return;
                    }
                    arg3.method3020(var32, var36, var44, var30, var34, var42, this.field7534.field5075);
                }
            }
        } else {
            class238 var64 = this.field7528[arg0][arg1];
            if (var64 != null) {
                if (this.field7521 == -1) {
                    for (int var65 = 0; var65 < var64.field3357; ++var65) {
                        int var66 = (arg0 << super.field341) + var64.field3351[var65];
                        int var67 = var64.field3359[var65];
                        int var68 = (arg1 << super.field341) + var64.field3352[var65];
                        int var69 = (this.field7526 * var68 + this.field7535 * var67 + this.field7520 * var66 >> 15) + this.field7525;
                        if (var69 <= this.field7534.field5074) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field7534.field5083;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field3358[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field7534.field5069) {
                            int var72 = var69 - this.field7534.field5083;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field7519 * var68 + this.field7530 * var66 + this.field7524 * var67 >> 15) + this.field7518;
                        int var74 = (this.field7531 * var68 + this.field7532 * var67 + this.field7517 * var66 >> 15) + this.field7523;
                        arg4[var65] = this.field7534.field5089 * var73 / var69 + arg3.field7438;
                        arg5[var65] = this.field7534.field5067 * var74 / var69 + arg3.field7435;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field3357; ++var75) {
                        int var115 = (arg0 << super.field341) + var64.field3351[var75];
                        int var116 = var64.field3359[var75];
                        int var117 = (arg1 << super.field341) + var64.field3352[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field7521 - this.field7534.field5083;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field3358[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field7534.field5069) {
                            int var120 = this.field7521 - this.field7534.field5083;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field7519 * var117 + this.field7530 * var115 + this.field7524 * var116 >> 15) + this.field7518;
                        int var122 = (this.field7531 * var117 + this.field7532 * var116 + this.field7517 * var115 >> 15) + this.field7523;
                        arg4[var75] = this.field7534.field5089 * var121 / this.field7521 + arg3.field7438;
                        arg5[var75] = this.field7534.field5067 * var122 / this.field7521 + arg3.field7435;
                    }
                }
                if (var64.field3350 != null) {
                    int var76 = this.field7527[arg0][arg1];
                    int var77 = this.field7527[arg0 + 1][arg1];
                    int var78 = this.field7527[arg0][arg1 + 1];
                    int var79 = super.field336 * arg0;
                    int var80 = super.field336 + var79;
                    int var81 = super.field336 * arg1;
                    int var82 = super.field336 + var81;
                    int var83 = (this.field7519 * var81 + this.field7530 * var79 + this.field7524 * var76 >> 15) + this.field7518;
                    int var84 = (this.field7531 * var81 + this.field7532 * var76 + this.field7517 * var79 >> 15) + this.field7523;
                    int var85 = (this.field7526 * var81 + this.field7535 * var76 + this.field7520 * var79 >> 15) + this.field7525;
                    int var86 = (this.field7519 * var81 + this.field7530 * var80 + this.field7524 * var77 >> 15) + this.field7518;
                    int var87 = (this.field7531 * var81 + this.field7532 * var77 + this.field7517 * var80 >> 15) + this.field7523;
                    int var88 = (this.field7526 * var81 + this.field7535 * var77 + this.field7520 * var80 >> 15) + this.field7525;
                    int var89 = (this.field7519 * var82 + this.field7530 * var79 + this.field7524 * var78 >> 15) + this.field7518;
                    int var90 = (this.field7531 * var82 + this.field7532 * var78 + this.field7517 * var79 >> 15) + this.field7523;
                    int var91 = (this.field7526 * var82 + this.field7535 * var78 + this.field7520 * var79 >> 15) + this.field7525;
                    for (int var92 = 0; var92 < var64.field3356; ++var92) {
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
                            arg3.field7429 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field7431 || var97 > arg3.field7431 || var98 > arg3.field7431;
                            short var103 = var64.field3350[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method3062(this.field7534.field2235.method157((byte) 102, var103).field1506)) {
                                    arg3.field7428 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method3031(var99, var100, var101, var96, var97, var98, this.field7534.field5075, arg6[var93], arg6[var94], arg6[var95], var64.field3354[var93], var64.field3354[var94], var64.field3354[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field3354[var93] & 16777215) != 0) {
                                        arg3.method3018(var99, var100, var101, var96, var97, var98, class325.method2017(arg6[var93] << 24 | this.field7534.field5075, var64.field3354[var93], -106), class325.method2017(arg6[var94] << 24 | this.field7534.field5075, var64.field3354[var94], -126), class325.method2017(arg6[var95] << 24 | this.field7534.field5075, var64.field3354[var95], -123));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method3029(var99, var100, var101, var96, var97, var98, var64.field3354[var93], var64.field3354[var94], var64.field3354[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field3354[var93] & 16777215) != 0) {
                                    arg3.method3018(var99, var100, var101, var96, var97, var98, var64.field3354[var93], var64.field3354[var94], var64.field3354[var95]);
                                }
                                arg3.field7428 = 0;
                            } else {
                                arg3.method3020(var99, var100, var101, var96, var97, var98, this.field7534.field5075);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field3356; ++var104) {
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
                        arg3.field7429 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field7431 || var109 > arg3.field7431 || var110 > arg3.field7431;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field3354[var105] & 16777215) != 0) {
                                    arg3.method3018(var111, var112, var113, var108, var109, var110, class71.method491(this.field7534.field5075, arg6[var105], var64.field3354[var105], 1), class71.method491(this.field7534.field5075, arg6[var106], var64.field3354[var106], 1), class71.method491(this.field7534.field5075, arg6[var107], var64.field3354[var107], 1));
                                }
                            } else if ((var64.field3354[var105] & 16777215) != 0) {
                                arg3.method3018(var111, var112, var113, var108, var109, var110, var64.field3354[var105], var64.field3354[var106], var64.field3354[var107]);
                            }
                        } else {
                            arg3.method3020(var111, var112, var113, var108, var109, var110, this.field7534.field5075);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method213(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class338 var6 = this.field7534.field5087;
        this.field7521 = -1;
        this.field7530 = var6.field5242;
        this.field7524 = var6.field5245;
        this.field7519 = var6.field5241;
        this.field7518 = var6.field5239;
        this.field7517 = var6.field5238;
        this.field7532 = var6.field5243;
        this.field7531 = var6.field5244;
        this.field7523 = var6.field5235;
        this.field7520 = var6.field5240;
        this.field7535 = var6.field5237;
        this.field7526 = var6.field5246;
        this.field7525 = var6.field5236;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z")
    private final boolean method3062(int arg0) {
        if ((this.field7515 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lbe;[I)V")
    public final void method217(class28 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class207 var9 = this.field7534.method2109(Thread.currentThread());
        class504 var10 = var9.field2816;
        var10.field7428 = 0;
        var10.field7429 = false;
        if (this.field7516 != null) {
            this.method3059(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2829, var9.field2855);
        } else {
            if (this.field7522 != null) {
                this.method3058(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2829, var9.field2855);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public final boolean method212(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lvq;IIII[[I[[II)V")
    public class512(class326 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7534 = arg0;
        this.field7515 = arg2;
        this.field7527 = arg5;
        this.field7529 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7534.field5054 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7534.field5071 * var18 + this.field7534.field5082 * var16 + this.field7534.field5078 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7529[var11][var10] = (byte) var20;
            }
        }
        this.field7533 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
    public final void method210(int arg0, int arg1) {
        class207 var3 = this.field7534.method2109(Thread.currentThread());
        var3.field2816.field7428 = 0;
        if (this.field7516 != null) {
            this.method3061(arg0, arg1, this.field7534.field5062, var3.field2816, var3.field2829, var3.field2855, var3.field2846);
        } else {
            if (this.field7522 != null) {
                this.method3057(arg0, arg1, var3.field2816, var3.field2829, var3.field2855, var3.field2846);
            }
        }
    }
}
