import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class467 extends class443 {

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ld;")
    private class411 field6557;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    private int field6565;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[[I")
    public int[][] field6555;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field6553;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    private int field6564;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[[B")
    private byte[][] field6556;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "[[B")
    private byte[][] field6570;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    private int field6554;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    private int field6559;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    private int field6560;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    private int field6561;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    private int field6563;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    private int field6567;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field6569;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    private int field6571;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    private int field6572;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    private int field6573;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    private int field6574;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[[Llg;")
    private class23[][] field6558;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[[Lkj;")
    private class254[][] field6562;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "[[Lmh;")
    private class264[][] field6568;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[[Lip;")
    private class54[][] field6566;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lhq;[I)V")
    public final void method1866(class190 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lph;IIIIZ)Z")
    public final boolean method1871(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
    public final void method1868() {
        this.field6556 = null;
        this.field6570 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZLit;[I[I[I)V")
    private final void method2735(int arg0, int arg1, boolean arg2, class383 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class23 var8 = this.field6558[arg0][arg1];
        if (var8 != null) {
            if ((var8.field316 & 2) == 0) {
                int var9 = this.field6553 * arg0;
                int var10 = this.field6553 + var9;
                int var11 = this.field6553 * arg1;
                int var12 = this.field6553 + var11;
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
                if ((var8.field316 & 1) != 0 && !arg2) {
                    int var17 = this.field6555[arg0][arg1];
                    int var18 = this.field6561 * var17;
                    var19 = (this.field6560 * var11 + this.field6571 * var9 + var18 >> 15) + this.field6563;
                    if (var19 <= this.field6557.field5853) {
                        return;
                    }
                    var20 = (this.field6560 * var11 + this.field6571 * var10 + var18 >> 15) + this.field6563;
                    if (var20 <= this.field6557.field5853) {
                        return;
                    }
                    var21 = (this.field6560 * var12 + this.field6571 * var10 + var18 >> 15) + this.field6563;
                    if (var21 <= this.field6557.field5853) {
                        return;
                    }
                    var22 = (this.field6560 * var12 + this.field6571 * var9 + var18 >> 15) + this.field6563;
                    if (var22 <= this.field6557.field5853) {
                        return;
                    }
                    if (this.field6557.field5851) {
                        int var23 = var19 - this.field6557.field5844;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field6557.field5844;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field6557.field5844;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field6557.field5844;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field6569 * var17;
                    int var28 = this.field6559 * var17;
                    var29 = (this.field6552 * var11 + this.field6574 * var9 + var27 >> 15) + this.field6572;
                    var30 = this.field6557.field5828 * var29 / var19 + arg3.field5452;
                    var31 = (this.field6554 * var11 + this.field6567 * var9 + var28 >> 15) + this.field6573;
                    var32 = this.field6557.field5854 * var31 / var19 + arg3.field5449;
                    var33 = (this.field6552 * var11 + this.field6574 * var10 + var27 >> 15) + this.field6572;
                    var34 = this.field6557.field5828 * var33 / var20 + arg3.field5452;
                    var35 = (this.field6554 * var11 + this.field6567 * var10 + var28 >> 15) + this.field6573;
                    var36 = this.field6557.field5854 * var35 / var20 + arg3.field5449;
                    var37 = (this.field6552 * var12 + this.field6574 * var10 + var27 >> 15) + this.field6572;
                    var38 = this.field6557.field5828 * var37 / var21 + arg3.field5452;
                    var39 = (this.field6554 * var12 + this.field6567 * var10 + var28 >> 15) + this.field6573;
                    var40 = this.field6557.field5854 * var39 / var21 + arg3.field5449;
                    var41 = (this.field6552 * var12 + this.field6574 * var9 + var27 >> 15) + this.field6572;
                    var42 = this.field6557.field5828 * var41 / var22 + arg3.field5452;
                    var43 = (this.field6554 * var12 + this.field6567 * var9 + var28 >> 15) + this.field6573;
                    var44 = this.field6557.field5854 * var43 / var22 + arg3.field5449;
                } else {
                    int var45 = this.field6555[arg0][arg1];
                    int var46 = this.field6555[arg0 + 1][arg1];
                    int var47 = this.field6555[arg0 + 1][arg1 + 1];
                    int var48 = this.field6555[arg0][arg1 + 1];
                    var19 = (this.field6560 * var11 + this.field6571 * var9 + this.field6561 * var45 >> 15) + this.field6563;
                    if (var19 <= this.field6557.field5853) {
                        return;
                    }
                    var20 = (this.field6560 * var11 + this.field6571 * var10 + this.field6561 * var46 >> 15) + this.field6563;
                    if (var20 <= this.field6557.field5853) {
                        return;
                    }
                    var21 = (this.field6560 * var12 + this.field6571 * var10 + this.field6561 * var47 >> 15) + this.field6563;
                    if (var21 <= this.field6557.field5853) {
                        return;
                    }
                    var22 = (this.field6560 * var12 + this.field6571 * var9 + this.field6561 * var48 >> 15) + this.field6563;
                    if (var22 <= this.field6557.field5853) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field6557.field5844;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field310 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field6557.field5844;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field308 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field6557.field5844;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field311 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field6557.field5844;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field307 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field6557.field5851) {
                        int var57 = var19 - this.field6557.field5844;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field6557.field5844;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field6557.field5844;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field6557.field5844;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field6552 * var11 + this.field6574 * var9 + this.field6569 * var45 >> 15) + this.field6572;
                    var30 = this.field6557.field5828 * var29 / var19 + arg3.field5452;
                    var31 = (this.field6554 * var11 + this.field6567 * var9 + this.field6559 * var45 >> 15) + this.field6573;
                    var32 = this.field6557.field5854 * var31 / var19 + arg3.field5449;
                    var33 = (this.field6552 * var11 + this.field6574 * var10 + this.field6569 * var46 >> 15) + this.field6572;
                    var34 = this.field6557.field5828 * var33 / var20 + arg3.field5452;
                    var35 = (this.field6554 * var11 + this.field6567 * var10 + this.field6559 * var46 >> 15) + this.field6573;
                    var36 = this.field6557.field5854 * var35 / var20 + arg3.field5449;
                    var37 = (this.field6552 * var12 + this.field6574 * var10 + this.field6569 * var47 >> 15) + this.field6572;
                    var38 = this.field6557.field5828 * var37 / var21 + arg3.field5452;
                    var39 = (this.field6554 * var12 + this.field6567 * var10 + this.field6559 * var47 >> 15) + this.field6573;
                    var40 = this.field6557.field5854 * var39 / var21 + arg3.field5449;
                    var41 = (this.field6552 * var12 + this.field6574 * var9 + this.field6569 * var48 >> 15) + this.field6572;
                    var42 = this.field6557.field5828 * var41 / var22 + arg3.field5452;
                    var43 = (this.field6554 * var12 + this.field6567 * var9 + this.field6559 * var48 >> 15) + this.field6573;
                    var44 = this.field6557.field5854 * var43 / var22 + arg3.field5449;
                }
                boolean var61 = var8.field314 != -1 && this.method2739(this.field6557.field4073.method577(var8.field314, -119).field2576);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field5441 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field5451 || var42 > arg3.field5451 || var34 > arg3.field5451;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field5443 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field314 >= 0) {
                                arg3.method2300(var40, var44, var36, var38, var42, var34, this.field6557.field5845, var15, var16, var14, var8.field317, var8.field313, var8.field309, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field314);
                            } else {
                                arg3.method2313(var40, var44, var36, var38, var42, var34, class259.method1587((byte) -57, var8.field317, var15 << 24 | this.field6557.field5845), class259.method1587((byte) -54, var8.field313, var16 << 24 | this.field6557.field5845), class259.method1587((byte) -113, var8.field309, var14 << 24 | this.field6557.field5845));
                            }
                        } else if (var8.field314 >= 0) {
                            arg3.method2299(var40, var44, var36, var38, var42, var34, var8.field317, var8.field313, var8.field309, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field314);
                        } else {
                            arg3.method2313(var40, var44, var36, var38, var42, var34, var8.field317, var8.field313, var8.field309);
                        }
                        arg3.field5443 = 0;
                    } else {
                        arg3.method2301(var40, var44, var36, var38, var42, var34, this.field6557.field5845);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field5441 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field5451 || var34 > arg3.field5451 || var42 > arg3.field5451;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field5443 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field314 >= 0) {
                                arg3.method2300(var32, var36, var44, var30, var34, var42, this.field6557.field5845, var13, var14, var16, var8.field315, var8.field309, var8.field313, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field314);
                            } else {
                                arg3.method2313(var32, var36, var44, var30, var34, var42, class259.method1587((byte) -54, var8.field315, var13 << 24 | this.field6557.field5845), class259.method1587((byte) -126, var8.field309, var14 << 24 | this.field6557.field5845), class259.method1587((byte) -63, var8.field313, var16 << 24 | this.field6557.field5845));
                            }
                        } else if (var8.field314 >= 0) {
                            arg3.method2299(var32, var36, var44, var30, var34, var42, var8.field315, var8.field309, var8.field313, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field314);
                        } else {
                            arg3.method2313(var32, var36, var44, var30, var34, var42, var8.field315, var8.field309, var8.field313);
                        }
                        arg3.field5443 = 0;
                        return;
                    }
                    arg3.method2301(var32, var36, var44, var30, var34, var42, this.field6557.field5845);
                }
            }
        } else {
            class264 var64 = this.field6568[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field3815; ++var65) {
                    short var105 = var64.field3812[var65];
                    int var106 = var64.field3808[var65];
                    short var107 = var64.field3807[var65];
                    int var108 = (this.field6560 * var107 + this.field6571 * var105 + this.field6561 * var106 >> 15) + this.field6563;
                    if (var108 <= this.field6557.field5853) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field6557.field5844;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field3810[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field6557.field5851) {
                        int var111 = var108 - this.field6557.field5844;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field6552 * var107 + this.field6574 * var105 + this.field6569 * var106 >> 15) + this.field6572;
                    int var113 = (this.field6554 * var107 + this.field6567 * var105 + this.field6559 * var106 >> 15) + this.field6573;
                    arg4[var65] = this.field6557.field5828 * var112 / var108 + arg3.field5452;
                    arg5[var65] = this.field6557.field5854 * var113 / var108 + arg3.field5449;
                }
                if (var64.field3809 != null) {
                    int var66 = this.field6555[arg0][arg1];
                    int var67 = this.field6555[arg0 + 1][arg1];
                    int var68 = this.field6555[arg0][arg1 + 1];
                    int var69 = this.field6553 * arg0;
                    int var70 = this.field6553 + var69;
                    int var71 = this.field6553 * arg1;
                    int var72 = this.field6553 + var71;
                    int var73 = (this.field6552 * var71 + this.field6574 * var69 + this.field6569 * var66 >> 15) + this.field6572;
                    int var74 = (this.field6554 * var71 + this.field6567 * var69 + this.field6559 * var66 >> 15) + this.field6573;
                    int var75 = (this.field6560 * var71 + this.field6571 * var69 + this.field6561 * var66 >> 15) + this.field6563;
                    int var76 = (this.field6552 * var71 + this.field6574 * var70 + this.field6569 * var67 >> 15) + this.field6572;
                    int var77 = (this.field6554 * var71 + this.field6567 * var70 + this.field6559 * var67 >> 15) + this.field6573;
                    int var78 = (this.field6560 * var71 + this.field6571 * var70 + this.field6561 * var67 >> 15) + this.field6563;
                    int var79 = (this.field6552 * var72 + this.field6574 * var69 + this.field6569 * var68 >> 15) + this.field6572;
                    int var80 = (this.field6554 * var72 + this.field6567 * var69 + this.field6559 * var68 >> 15) + this.field6573;
                    int var81 = (this.field6560 * var72 + this.field6571 * var69 + this.field6561 * var68 >> 15) + this.field6563;
                    for (int var82 = 0; var82 < var64.field3806; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field5441 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field5451 || var87 > arg3.field5451 || var88 > arg3.field5451;
                            short var93 = var64.field3809[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method2739(this.field6557.field4073.method577(var93, -128).field2576)) {
                                    arg3.field5443 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2300(var89, var90, var91, var86, var87, var88, this.field6557.field5845, arg6[var83], arg6[var84], arg6[var85], var64.field3814[var83], var64.field3814[var84], var64.field3814[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field3814[var83] & 16777215) != 0) {
                                        arg3.method2313(var89, var90, var91, var86, var87, var88, class259.method1587((byte) -101, var64.field3814[var83], arg6[var83] << 24 | this.field6557.field5845), class259.method1587((byte) -21, var64.field3814[var84], arg6[var84] << 24 | this.field6557.field5845), class259.method1587((byte) -23, var64.field3814[var85], arg6[var85] << 24 | this.field6557.field5845));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2299(var89, var90, var91, var86, var87, var88, var64.field3814[var83], var64.field3814[var84], var64.field3814[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field3814[var83] & 16777215) != 0) {
                                    arg3.method2313(var89, var90, var91, var86, var87, var88, var64.field3814[var83], var64.field3814[var84], var64.field3814[var85]);
                                }
                                arg3.field5443 = 0;
                            } else {
                                arg3.method2301(var89, var90, var91, var86, var87, var88, this.field6557.field5845);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field3806; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field5441 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field5451 || var99 > arg3.field5451 || var100 > arg3.field5451;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field3814[var95] & 16777215) != 0) {
                                    arg3.method2313(var101, var102, var103, var98, var99, var100, class94.method465(11887, var64.field3814[var95], arg6[var95], this.field6557.field5845), class94.method465(11887, var64.field3814[var96], arg6[var96], this.field6557.field5845), class94.method465(11887, var64.field3814[var97], arg6[var97], this.field6557.field5845));
                                }
                            } else if ((var64.field3814[var95] & 16777215) != 0) {
                                arg3.method2313(var101, var102, var103, var98, var99, var100, var64.field3814[var95], var64.field3814[var96], var64.field3814[var97]);
                            }
                        } else {
                            arg3.method2301(var101, var102, var103, var98, var99, var100, this.field6557.field5845);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILph;)Lph;")
    public final class125 method1869(int arg0, int arg1, class125 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lph;IIIIZ)V")
    public final void method1864(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class284 var9 = this.field6557.method2434(Thread.currentThread());
        class383 var10 = var9.field4133;
        var10.field5443 = 0;
        var10.field5441 = false;
        if (this.field6558 != null) {
            this.method2737(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4140, var9.field4143);
        } else {
            if (this.field6566 != null) {
                this.method2736(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4140, var9.field4143);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I")
    public final int method1861(int arg0, int arg1) {
        return this.field6555[arg0][arg1];
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ld;IIII[[I[[II)V")
    public class467(class411 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field6557 = arg0;
        this.field6565 = arg2;
        this.field6555 = arg5;
        this.field6553 = arg7;
        this.field6564 = 0;
        while (arg7 > 1) {
            ++this.field6564;
            arg7 >>= 1;
        }
        this.field6556 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6557.field5835 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6557.field5855 * var18 + this.field6557.field5846 * var16 + this.field6557.field5837 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6556[var11][var10] = (byte) var20;
            }
        }
        this.field6570 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)I")
    public final int method1857(int arg0, int arg1) {
        int var3 = arg0 >> this.field6564;
        int var4 = arg1 >> this.field6564;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field6326 - 1 && var4 <= super.field6324 - 1) {
            int var5 = arg0 & this.field6553 - 1;
            int var6 = arg1 & this.field6553 - 1;
            int var7 = (this.field6553 - var5) * this.field6555[var3][var4] + this.field6555[var3 + 1][var4] * var5 >> this.field6564;
            int var8 = (this.field6553 - var5) * this.field6555[var3][var4 + 1] + this.field6555[var3 + 1][var4 + 1] * var5 >> this.field6564;
            return (this.field6553 - var6) * var7 + var6 * var8 >> this.field6564;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[[ZLit;[I[I)V")
    private final void method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class383 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5446 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6566[var16][var17] != null) {
                        class54 var18 = this.field6566[var16][var17];
                        if (var18.field698 != -1 && (var18.field697 & 2) == 0 && var18.field702 == -1) {
                            int var19 = this.field6557.method2435(var18.field698);
                            arg8.method2311(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class28.method149(var18.field699 & 65535, (byte) 71, var19), class28.method149(var18.field700 & 65535, (byte) 71, var19), class28.method149(var18.field703 & 65535, (byte) 71, var19));
                            arg8.method2311(var15, var15, var15 - var13, var14, var13 + var14, var14, class28.method149(var18.field701 & 65535, (byte) 71, var19), class28.method149(var18.field703 & 65535, (byte) 71, var19), class28.method149(var18.field700 & 65535, (byte) 71, var19));
                        } else if (var18.field702 == -1) {
                            arg8.method2311(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field699 & 65535, var18.field700 & 65535, var18.field703 & 65535);
                            arg8.method2311(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field701 & 65535, var18.field703 & 65535, var18.field700 & 65535);
                        } else {
                            int var20 = var18.field702;
                            arg8.method2311(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2311(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field6562[var16][var17] != null) {
                        class254 var21 = this.field6562[var16][var17];
                        for (int var22 = 0; var22 < var21.field3545; ++var22) {
                            arg9[var22] = (var21.field3542[var22] - this.field6553 * var16) * var13 / this.field6553 + var14;
                            arg10[var22] = var15 - (var21.field3543[var22] - this.field6553 * var17) * var13 / this.field6553;
                        }
                        for (int var23 = 0; var23 < var21.field3541; ++var23) {
                            short var24 = var21.field3547[var23];
                            short var25 = var21.field3544[var23];
                            short var26 = var21.field3550[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3546 != null && var21.field3546[var23] != -1) {
                                int var33 = var21.field3546[var23];
                                arg8.method2311(var30, var31, var32, var27, var28, var29, class28.method149(var21.field3539[var24], (byte) 71, var33), class28.method149(var21.field3539[var25], (byte) 71, var33), class28.method149(var21.field3539[var26], (byte) 71, var33));
                            } else if (var21.field3548 != null && var21.field3548[var23] != -1) {
                                int var34 = this.field6557.method2435(var21.field3548[var23]);
                                arg8.method2311(var30, var31, var32, var27, var28, var29, class28.method149(var21.field3539[var24], (byte) 71, var34), class28.method149(var21.field3539[var25], (byte) 71, var34), class28.method149(var21.field3539[var26], (byte) 71, var34));
                            } else {
                                int var35 = var21.field3540[var23];
                                arg8.method2311(var30, var31, var32, var27, var28, var29, class28.method149(var21.field3539[var24], (byte) 71, var35), class28.method149(var21.field3539[var25], (byte) 71, var35), class28.method149(var21.field3539[var26], (byte) 71, var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5446 = true;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIIIII[[ZLit;[I[I)V")
    private final void method2737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class383 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5446 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6558[var16][var17] != null) {
                        class23 var18 = this.field6558[var16][var17];
                        if (var18.field314 != -1 && (var18.field316 & 2) == 0 && var18.field312 == 0) {
                            int var19 = this.field6557.method2435(var18.field314);
                            arg8.method2311(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class28.method149(var18.field317, (byte) 71, var19), class28.method149(var18.field313, (byte) 71, var19), class28.method149(var18.field309, (byte) 71, var19));
                            arg8.method2311(var15, var15, var15 - var13, var14, var13 + var14, var14, class28.method149(var18.field315, (byte) 71, var19), class28.method149(var18.field309, (byte) 71, var19), class28.method149(var18.field313, (byte) 71, var19));
                        } else if (var18.field312 == 0) {
                            arg8.method2313(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field317, var18.field313, var18.field309);
                            arg8.method2313(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field315, var18.field309, var18.field313);
                        } else {
                            int var20 = var18.field312;
                            arg8.method2313(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class259.method1587((byte) -77, var20, var18.field317 & -16777216), class259.method1587((byte) -127, var20, var18.field313 & -16777216), class259.method1587((byte) -28, var20, var18.field309 & -16777216));
                            arg8.method2313(var15, var15, var15 - var13, var14, var13 + var14, var14, class259.method1587((byte) -67, var20, var18.field315 & -16777216), class259.method1587((byte) -102, var20, var18.field309 & -16777216), class259.method1587((byte) -86, var20, var18.field313 & -16777216));
                        }
                    } else if (this.field6568[var16][var17] != null) {
                        class264 var21 = this.field6568[var16][var17];
                        for (int var22 = 0; var22 < var21.field3815; ++var22) {
                            arg9[var22] = (var21.field3812[var22] - this.field6553 * var16) * var13 / this.field6553 + var14;
                            arg10[var22] = var15 - (var21.field3807[var22] - this.field6553 * var17) * var13 / this.field6553;
                        }
                        for (int var23 = 0; var23 < var21.field3806; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3813 == null || var21.field3813[var23] == 0 || var21.field3809 != null && (var21.field3809 == null || var21.field3809[var23] != -1)) {
                                if (var21.field3809 != null && var21.field3809[var23] != -1) {
                                    int var34 = this.field6557.method2435(var21.field3809[var23]);
                                    arg8.method2311(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2313(var30, var31, var32, var27, var28, var29, var21.field3814[var24], var21.field3814[var25], var21.field3814[var26]);
                                }
                            } else {
                                int var33 = var21.field3813[var23];
                                arg8.method2313(var30, var31, var32, var27, var28, var29, class259.method1587((byte) -71, var33, -16777216 - (var21.field3814[var24] & -16777216)), class259.method1587((byte) -89, var33, -16777216 - (var21.field3814[var25] & -16777216)), class259.method1587((byte) -99, var33, -16777216 - (var21.field3814[var26] & -16777216)));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5446 = true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1867(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class114 var6 = this.field6557.field5850;
        this.field6574 = var6.field1402;
        this.field6569 = var6.field1405;
        this.field6552 = var6.field1407;
        this.field6572 = var6.field1398;
        this.field6567 = var6.field1408;
        this.field6559 = var6.field1403;
        this.field6554 = var6.field1401;
        this.field6573 = var6.field1399;
        this.field6571 = var6.field1404;
        this.field6561 = var6.field1409;
        this.field6560 = var6.field1406;
        this.field6563 = var6.field1400;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(II)I")
    private static final int method2738(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1865(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6558 == null) {
            this.field6558 = new class23[super.field6326][super.field6324];
            this.field6568 = new class264[super.field6326][super.field6324];
        } else if (this.field6566 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class89.field1121[class52.method283(arg6[var15], 4) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class89.field1121[class52.method283(arg7[var16], 4) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == this.field6553 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == this.field6553 && arg4[var22] == this.field6553) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == this.field6553) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + this.field6553 != arg2[var24] && arg2[0] - this.field6553 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + this.field6553 != arg4[var24] && arg4[0] - this.field6553 != arg4[var24]) {
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
                class23 var25 = new class23();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field312 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field316 = (byte) (var25.field316 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field6555[arg0 + 1][arg1] == this.field6555[arg0][arg1] && this.field6555[arg0 + 1][arg1 + 1] == this.field6555[arg0][arg1] && this.field6555[arg0][arg1 + 1] == this.field6555[arg0][arg1]) {
                    var25.field316 = (byte) (var25.field316 | 1);
                }
                if (var27 != -1 && (var25.field316 & 2) == 0 && !this.field6557.field4073.method577(var27, -122).field2573) {
                    var25.field315 = this.field6556[arg0][arg1] - this.field6570[arg0][arg1];
                    var25.field309 = this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1];
                    var25.field317 = this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1];
                    var25.field313 = this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1];
                    var25.field314 = (short) var27;
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
                    var25.field315 = class94.method465(11887, method2738(arg6[var18] >> 8, this.field6556[arg0][arg1] - this.field6570[arg0][arg1]), var28, arg10);
                    if (var25.field312 != 0) {
                        var25.field315 |= 255 - (this.field6556[arg0][arg1] - this.field6570[arg0][arg1]) << 25;
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
                    var25.field309 = class94.method465(11887, method2738(arg6[var19] >> 8, this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1]), var29, arg10);
                    if (var25.field312 != 0) {
                        var25.field309 |= 255 - (this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1]) << 25;
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
                    var25.field317 = class94.method465(11887, method2738(arg6[var20] >> 8, this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1]), var30, arg10);
                    if (var25.field312 != 0) {
                        var25.field317 |= 255 - (this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field313 = class94.method465(11887, method2738(arg6[var21] >> 8, this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1]), var31, arg10);
                    if (var25.field312 != 0) {
                        var25.field313 |= 255 - (this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1]) << 25;
                    }
                    var25.field314 = -1;
                }
                if (arg5 != null) {
                    var25.field311 = (short) arg5[var20];
                    var25.field307 = (short) arg5[var21];
                    var25.field308 = (short) arg5[var19];
                    var25.field310 = (short) arg5[var18];
                }
                this.field6558[arg0][arg1] = var25;
            } else {
                class264 var32 = new class264();
                var32.field3815 = (short) arg2.length;
                var32.field3806 = (short) (arg2.length / 3);
                var32.field3812 = new short[var32.field3815];
                var32.field3808 = new short[var32.field3815];
                var32.field3807 = new short[var32.field3815];
                var32.field3814 = new int[var32.field3815];
                if (arg5 != null) {
                    var32.field3810 = new short[var32.field3815];
                }
                for (int var33 = 0; var33 < var32.field3815; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6556[arg0][arg1] - this.field6570[arg0][arg1];
                    } else if (var48 == 0 && this.field6553 == var49) {
                        var51 = this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1];
                    } else if (this.field6553 == var48 && this.field6553 == var49) {
                        var51 = this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1];
                    } else if (this.field6553 == var48 && var49 == 0) {
                        var51 = this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1]) * var48 + (this.field6556[arg0][arg1] - this.field6570[arg0][arg1]) * (this.field6553 - var48);
                        int var53 = (this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1]) * var48 + (this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1]) * (this.field6553 - var48);
                        var51 = (this.field6553 - var49) * var52 + var49 * var53 >> this.field6564 * 2;
                    }
                    short var54 = (short) ((arg0 << this.field6564) + var48);
                    short var55 = (short) ((arg1 << this.field6564) + var49);
                    var32.field3812[var33] = var54;
                    var32.field3807[var33] = var55;
                    var32.field3808[var33] = (short) (this.method1857(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6557.field4073.method577(arg8[var33], -126).field2573) {
                        var32.field3814[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3814[var33] = var51 << 25;
                        } else {
                            var32.field3814[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3810[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3814[var33] = class94.method465(11887, method2738(arg6[var33] >> 8, var51), var56, arg10);
                        if (arg7 != null) {
                            var32.field3814[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3806; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6557.field4073.method577(arg8[var35 * 3], -124).field2573) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3813 = new int[var32.field3806];
                }
                if (var34) {
                    var32.field3809 = new short[var32.field3806];
                    var32.field3811 = new short[var32.field3806];
                }
                for (int var36 = 0; var36 < var32.field3806; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3813[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6557.field4073.method577(var42, -121).field2573) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6557.field4073.method577(var43, -118).field2573) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6557.field4073.method577(var44, -123).field2573) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3809[var36] = (short) var44;
                            var32.field3811[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6557.field4073.method577(var45, -125).field2573) {
                                    var32.field3814[var37] = class89.field1121[class52.method283(this.field6557.field4073.method577(var45, -127).field2587 & 65535, 4) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6557.field4073.method577(var46, -117).field2573) {
                                    var32.field3814[var38] = class89.field1121[class52.method283(this.field6557.field4073.method577(var46, -118).field2587 & 65535, 4) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6557.field4073.method577(var47, -122).field2573) {
                                    var32.field3814[var39] = class89.field1121[class52.method283(this.field6557.field4073.method577(var47, -119).field2587 & 65535, 4) & 65535];
                                }
                            }
                            var32.field3809[var36] = -1;
                        }
                    }
                }
                this.field6568[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
    public final void method1859(int arg0, int arg1) {
        class284 var3 = this.field6557.method2434(Thread.currentThread());
        var3.field4133.field5443 = 0;
        if (this.field6558 != null) {
            this.method2735(arg0, arg1, this.field6557.field5861, var3.field4133, var3.field4140, var3.field4143, var3.field4172);
        } else {
            if (this.field6566 != null) {
                this.method2740(arg0, arg1, var3.field4133, var3.field4140, var3.field4143, var3.field4172);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public final void method1863(int arg0, int arg1, int arg2) {
        if (this.field6570[arg0][arg1] < arg2) {
            this.field6570[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1870(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6566 == null) {
            this.field6566 = new class54[super.field6326][super.field6324];
            this.field6562 = new class254[super.field6326][super.field6324];
        } else if (this.field6558 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && this.field6553 != var20 || var21 != 0 && this.field6553 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class254 var22 = new class254();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3545 = var23;
            var22.field3539 = new short[var23];
            var22.field3542 = new int[var23];
            var22.field3549 = new int[var23];
            var22.field3543 = new int[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3539[var25] = (short) (this.field6556[arg0][arg1] - this.field6570[arg0][arg1]);
                } else if (var30 == 0 && this.field6553 == var31) {
                    var22.field3539[var25] = (short) (this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1]);
                } else if (this.field6553 == var30 && this.field6553 == var31) {
                    var22.field3539[var25] = (short) (this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1]);
                } else if (this.field6553 == var30 && var31 == 0) {
                    var22.field3539[var25] = (short) (this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1]) * var30 + (this.field6556[arg0][arg1] - this.field6570[arg0][arg1]) * (this.field6553 - var30);
                    int var33 = (this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1]) * var30 + (this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1]) * (this.field6553 - var30);
                    var22.field3539[var25] = (short) ((this.field6553 - var31) * var32 + var31 * var33 >> this.field6564 * 2);
                }
                int var34 = (arg0 << this.field6564) + var30;
                int var35 = (arg1 << this.field6564) + var31;
                var22.field3542[var25] = var34;
                var22.field3543[var25] = var35;
                var22.field3549[var25] = this.method1857(var34, var35) + (arg3 != null ? arg3[var25] : 0);
                if (var22.field3539[var25] < 2) {
                    var22.field3539[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6557.field4073.method577(arg11[var28], -117).field2573) {
                    var26 = true;
                }
            }
            var22.field3540 = new int[var27];
            if (arg10 != null) {
                var22.field3546 = new int[var27];
            }
            var22.field3547 = new short[var27];
            var22.field3544 = new short[var27];
            var22.field3550 = new short[var27];
            if (var26) {
                var22.field3548 = new short[var27];
                var22.field3538 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3540[var22.field3541] = class52.method283(arg9[var29], 4);
                    } else {
                        var22.field3540[var22.field3541] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3546[var22.field3541] = class52.method283(arg10[var29], 4);
                        } else {
                            var22.field3546[var22.field3541] = -1;
                        }
                    }
                    var22.field3547[var22.field3541] = (short) arg6[var29];
                    var22.field3544[var22.field3541] = (short) arg7[var29];
                    var22.field3550[var22.field3541] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6557.field4073.method577(arg11[var29], -127).field2573) {
                            var22.field3548[var22.field3541] = (short) arg11[var29];
                            var22.field3538[var22.field3541] = (short) arg12[var29];
                        } else {
                            var22.field3548[var22.field3541] = -1;
                        }
                    }
                    ++var22.field3541;
                }
            }
            this.field6562[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class54 var36 = new class54();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field702 = class28.method149(this.field6556[arg0][arg1] - this.field6570[arg0][arg1], (byte) 71, class52.method283(arg10[0], 4));
                    if (var37 == -1) {
                        var36.field697 = (byte) (var36.field697 | 2);
                    }
                }
                if (this.field6555[arg0 + 1][arg1] == this.field6555[arg0][arg1] && this.field6555[arg0 + 1][arg1 + 1] == this.field6555[arg0][arg1] && this.field6555[arg0][arg1 + 1] == this.field6555[arg0][arg1]) {
                    var36.field697 = (byte) (var36.field697 | 1);
                }
                if (var38 != -1 && (var36.field697 & 2) == 0 && !this.field6557.field4073.method577(var38, -123).field2573) {
                    var36.field701 = (short) (this.field6556[arg0][arg1] - this.field6570[arg0][arg1]);
                    var36.field703 = (short) (this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1]);
                    var36.field699 = (short) (this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1]);
                    var36.field700 = (short) (this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1]);
                    var36.field698 = (short) var38;
                } else {
                    short var39 = class52.method283(var37, 4);
                    var36.field701 = (short) class28.method149(this.field6556[arg0][arg1] - this.field6570[arg0][arg1], (byte) 71, var39);
                    var36.field703 = (short) class28.method149(this.field6556[arg0 + 1][arg1] - this.field6570[arg0 + 1][arg1], (byte) 71, var39);
                    var36.field699 = (short) class28.method149(this.field6556[arg0 + 1][arg1 + 1] - this.field6570[arg0 + 1][arg1 + 1], (byte) 71, var39);
                    var36.field700 = (short) class28.method149(this.field6556[arg0][arg1 + 1] - this.field6570[arg0][arg1 + 1], (byte) 71, var39);
                    var36.field698 = -1;
                }
                this.field6566[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
    private final boolean method2739(int arg0) {
        if ((this.field6565 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lph;IIIIZ)V")
    public final void method1858(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILit;[I[I[I)V")
    private final void method2740(int arg0, int arg1, class383 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class54 var7 = this.field6566[arg0][arg1];
        if (var7 != null) {
            if ((var7.field697 & 2) == 0) {
                int var8 = this.field6553 * arg0;
                int var9 = this.field6553 + var8;
                int var10 = this.field6553 * arg1;
                int var11 = this.field6553 + var10;
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
                if ((var7.field697 & 1) != 0) {
                    int var12 = this.field6555[arg0][arg1];
                    int var13 = this.field6561 * var12;
                    var14 = (this.field6560 * var10 + this.field6571 * var8 + var13 >> 15) + this.field6563;
                    if (var14 <= this.field6557.field5853) {
                        return;
                    }
                    var15 = (this.field6560 * var10 + this.field6571 * var9 + var13 >> 15) + this.field6563;
                    if (var15 <= this.field6557.field5853) {
                        return;
                    }
                    int var16 = (this.field6560 * var11 + this.field6571 * var9 + var13 >> 15) + this.field6563;
                    if (var16 <= this.field6557.field5853) {
                        return;
                    }
                    var17 = (this.field6560 * var11 + this.field6571 * var8 + var13 >> 15) + this.field6563;
                    if (var17 <= this.field6557.field5853) {
                        return;
                    }
                    int var18 = this.field6569 * var12;
                    int var19 = this.field6559 * var12;
                    var20 = (this.field6552 * var10 + this.field6574 * var8 + var18 >> 15) + this.field6572;
                    var21 = this.field6557.field5828 * var20 / var14 + arg2.field5452;
                    var22 = (this.field6554 * var10 + this.field6567 * var8 + var19 >> 15) + this.field6573;
                    var23 = this.field6557.field5854 * var22 / var14 + arg2.field5449;
                    var24 = (this.field6552 * var10 + this.field6574 * var9 + var18 >> 15) + this.field6572;
                    var25 = this.field6557.field5828 * var24 / var15 + arg2.field5452;
                    var26 = (this.field6554 * var10 + this.field6567 * var9 + var19 >> 15) + this.field6573;
                    var27 = this.field6557.field5854 * var26 / var15 + arg2.field5449;
                    int var28 = (this.field6552 * var11 + this.field6574 * var9 + var18 >> 15) + this.field6572;
                    var29 = this.field6557.field5828 * var28 / var16 + arg2.field5452;
                    int var30 = (this.field6554 * var11 + this.field6567 * var9 + var19 >> 15) + this.field6573;
                    var31 = this.field6557.field5854 * var30 / var16 + arg2.field5449;
                    var32 = (this.field6552 * var11 + this.field6574 * var8 + var18 >> 15) + this.field6572;
                    var33 = this.field6557.field5828 * var32 / var17 + arg2.field5452;
                    var34 = (this.field6554 * var11 + this.field6567 * var8 + var19 >> 15) + this.field6573;
                    var35 = this.field6557.field5854 * var34 / var17 + arg2.field5449;
                } else {
                    int var36 = this.field6555[arg0][arg1];
                    int var37 = this.field6555[arg0 + 1][arg1];
                    int var38 = this.field6555[arg0 + 1][arg1 + 1];
                    int var39 = this.field6555[arg0][arg1 + 1];
                    var14 = (this.field6560 * var10 + this.field6571 * var8 + this.field6561 * var36 >> 15) + this.field6563;
                    if (var14 <= this.field6557.field5853) {
                        return;
                    }
                    var15 = (this.field6560 * var10 + this.field6571 * var9 + this.field6561 * var37 >> 15) + this.field6563;
                    if (var15 <= this.field6557.field5853) {
                        return;
                    }
                    int var40 = (this.field6560 * var11 + this.field6571 * var9 + this.field6561 * var38 >> 15) + this.field6563;
                    if (var40 <= this.field6557.field5853) {
                        return;
                    }
                    var17 = (this.field6560 * var11 + this.field6571 * var8 + this.field6561 * var39 >> 15) + this.field6563;
                    if (var17 <= this.field6557.field5853) {
                        return;
                    }
                    var20 = (this.field6552 * var10 + this.field6574 * var8 + this.field6569 * var36 >> 15) + this.field6572;
                    var21 = this.field6557.field5828 * var20 / var14 + arg2.field5452;
                    var22 = (this.field6554 * var10 + this.field6567 * var8 + this.field6559 * var36 >> 15) + this.field6573;
                    var23 = this.field6557.field5854 * var22 / var14 + arg2.field5449;
                    var24 = (this.field6552 * var10 + this.field6574 * var9 + this.field6569 * var37 >> 15) + this.field6572;
                    var25 = this.field6557.field5828 * var24 / var15 + arg2.field5452;
                    var26 = (this.field6554 * var10 + this.field6567 * var9 + this.field6559 * var37 >> 15) + this.field6573;
                    var27 = this.field6557.field5854 * var26 / var15 + arg2.field5449;
                    int var41 = (this.field6552 * var11 + this.field6574 * var9 + this.field6569 * var38 >> 15) + this.field6572;
                    var29 = this.field6557.field5828 * var41 / var40 + arg2.field5452;
                    int var42 = (this.field6554 * var11 + this.field6567 * var9 + this.field6559 * var38 >> 15) + this.field6573;
                    var31 = this.field6557.field5854 * var42 / var40 + arg2.field5449;
                    var32 = (this.field6552 * var11 + this.field6574 * var8 + this.field6569 * var39 >> 15) + this.field6572;
                    var33 = this.field6557.field5828 * var32 / var17 + arg2.field5452;
                    var34 = (this.field6554 * var11 + this.field6567 * var8 + this.field6559 * var39 >> 15) + this.field6573;
                    var35 = this.field6557.field5854 * var34 / var17 + arg2.field5449;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field5441 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field5451 || var33 > arg2.field5451 || var25 > arg2.field5451;
                    if (var7.field698 >= 0) {
                        if (this.method2739(this.field6557.field4073.method577(var7.field698, -124).field2576)) {
                            arg2.field5443 = 100;
                        }
                        arg2.method2299(var31, var35, var27, var29, var33, var25, var7.field699 & 65535, var7.field700 & 65535, var7.field703 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field698);
                        arg2.field5443 = 0;
                    } else {
                        arg2.method2311(var31, var35, var27, var29, var33, var25, var7.field699 & 65535, var7.field700 & 65535, var7.field703 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field5441 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field5451 || var25 > arg2.field5451 || var33 > arg2.field5451;
                    if (var7.field698 >= 0) {
                        if (this.method2739(this.field6557.field4073.method577(var7.field698, -120).field2576)) {
                            arg2.field5443 = 100;
                        }
                        arg2.method2299(var23, var27, var35, var21, var25, var33, var7.field701 & 65535, var7.field703 & 65535, var7.field700 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field698);
                        arg2.field5443 = 0;
                        return;
                    }
                    arg2.method2311(var23, var27, var35, var21, var25, var33, var7.field701 & 65535, var7.field703 & 65535, var7.field700 & 65535);
                }
            }
        } else {
            class254 var43 = this.field6562[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field3545; ++var44) {
                    int var84 = var43.field3542[var44];
                    int var85 = var43.field3549[var44];
                    int var86 = var43.field3543[var44];
                    int var87 = (this.field6560 * var86 + this.field6571 * var84 + this.field6561 * var85 >> 15) + this.field6563;
                    if (var87 <= this.field6557.field5853) {
                        return;
                    }
                    int var88 = (this.field6552 * var86 + this.field6574 * var84 + this.field6569 * var85 >> 15) + this.field6572;
                    int var89 = (this.field6554 * var86 + this.field6567 * var84 + this.field6559 * var85 >> 15) + this.field6573;
                    arg3[var44] = this.field6557.field5828 * var88 / var87 + arg2.field5452;
                    arg4[var44] = this.field6557.field5854 * var89 / var87 + arg2.field5449;
                }
                if (var43.field3548 != null) {
                    int var45 = this.field6555[arg0][arg1];
                    int var46 = this.field6555[arg0 + 1][arg1];
                    int var47 = this.field6555[arg0][arg1 + 1];
                    int var48 = this.field6553 * arg0;
                    int var49 = this.field6553 + var48;
                    int var50 = this.field6553 * arg1;
                    int var51 = this.field6553 + var50;
                    int var52 = (this.field6552 * var50 + this.field6574 * var48 + this.field6569 * var45 >> 15) + this.field6572;
                    int var53 = (this.field6554 * var50 + this.field6567 * var48 + this.field6559 * var45 >> 15) + this.field6573;
                    int var54 = (this.field6560 * var50 + this.field6571 * var48 + this.field6561 * var45 >> 15) + this.field6563;
                    int var55 = (this.field6552 * var50 + this.field6574 * var49 + this.field6569 * var46 >> 15) + this.field6572;
                    int var56 = (this.field6554 * var50 + this.field6567 * var49 + this.field6559 * var46 >> 15) + this.field6573;
                    int var57 = (this.field6560 * var50 + this.field6571 * var49 + this.field6561 * var46 >> 15) + this.field6563;
                    int var58 = (this.field6552 * var51 + this.field6574 * var48 + this.field6569 * var47 >> 15) + this.field6572;
                    int var59 = (this.field6554 * var51 + this.field6567 * var48 + this.field6559 * var47 >> 15) + this.field6573;
                    int var60 = (this.field6560 * var51 + this.field6571 * var48 + this.field6561 * var47 >> 15) + this.field6563;
                    for (int var61 = 0; var61 < var43.field3541; ++var61) {
                        short var62 = var43.field3547[var61];
                        short var63 = var43.field3544[var61];
                        short var64 = var43.field3550[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field5441 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field5451 || var66 > arg2.field5451 || var67 > arg2.field5451;
                            short var71 = var43.field3548[var61];
                            if (var71 != -1) {
                                if (this.method2739(this.field6557.field4073.method577(var71, -127).field2576)) {
                                    arg2.field5443 = 100;
                                }
                                arg2.method2299(var68, var69, var70, var65, var66, var67, var43.field3539[var62], var43.field3539[var63], var43.field3539[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field5443 = 0;
                            } else {
                                int var72 = var43.field3540[var61];
                                if (var72 != -1) {
                                    arg2.method2311(var68, var69, var70, var65, var66, var67, class28.method149(var43.field3539[var62], (byte) 71, var72), class28.method149(var43.field3539[var63], (byte) 71, var72), class28.method149(var43.field3539[var64], (byte) 71, var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field3541; ++var73) {
                    short var74 = var43.field3547[var73];
                    short var75 = var43.field3544[var73];
                    short var76 = var43.field3550[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field3540[var73];
                        if (var83 != -1) {
                            arg2.field5441 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field5451 || var78 > arg2.field5451 || var79 > arg2.field5451;
                            arg2.method2311(var80, var81, var82, var77, var78, var79, class28.method149(var43.field3539[var74], (byte) 71, var83), class28.method149(var43.field3539[var75], (byte) 71, var83), class28.method149(var43.field3539[var76], (byte) 71, var83));
                        }
                    }
                }
            }
        }
    }
}
