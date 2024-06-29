import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class222 extends class411 {

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Lvn;")
    private class425 field3073;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "[[I")
    public int[][] field3076;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[[I")
    private int[][] field3065;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    private int field3070;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[[B")
    private byte[][] field3058;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[[B")
    private byte[][] field3068;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private int field3061;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    private int field3066;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    private int field3067;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    private int field3069;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    private int field3074;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    private int field3075;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    private int field3078;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    private int field3079;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[[Lem;")
    private class143[][] field3062;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[[Lbl;")
    private class54[][] field3063;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[[Lea;")
    private class58[][] field3064;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[[Lrh;")
    private class70[][] field3072;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZLwl;[I[I[I)V", line = 4)
    private final void method1501(int arg0, int arg1, boolean arg2, class274 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class58 var8 = this.field3064[arg0][arg1];
        if (var8 != null) {
            if ((var8.field923 & 2) == 0) {
                int var9 = this.field3059 * arg0;
                int var10 = this.field3059 + var9;
                int var11 = this.field3059 * arg1;
                int var12 = this.field3059 + var11;
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
                if ((var8.field923 & 1) != 0 && !arg2) {
                    int var17 = this.field3076[arg0][arg1];
                    int var18 = this.field3080 * var17;
                    var19 = (this.field3066 * var11 + this.field3075 * var9 + var18 >> 15) + this.field3067;
                    if (var19 <= this.field3073.field5979) {
                        return;
                    }
                    var20 = (this.field3066 * var11 + this.field3075 * var10 + var18 >> 15) + this.field3067;
                    if (var20 <= this.field3073.field5979) {
                        return;
                    }
                    var21 = (this.field3066 * var12 + this.field3075 * var10 + var18 >> 15) + this.field3067;
                    if (var21 <= this.field3073.field5979) {
                        return;
                    }
                    var22 = (this.field3066 * var12 + this.field3075 * var9 + var18 >> 15) + this.field3067;
                    if (var22 <= this.field3073.field5979) {
                        return;
                    }
                    if (this.field3073.field5976) {
                        int var23 = var19 - this.field3073.field5980;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field3073.field5980;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field3073.field5980;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field3073.field5980;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field3071 * var17;
                    int var28 = this.field3061 * var17;
                    var29 = (this.field3069 * var11 + this.field3074 * var9 + var27 >> 15) + this.field3081;
                    var30 = this.field3073.field5990 * var29 / var19 + arg3.field3674;
                    var31 = (this.field3077 * var11 + this.field3078 * var9 + var28 >> 15) + this.field3079;
                    var32 = this.field3073.field6006 * var31 / var19 + arg3.field3675;
                    var33 = (this.field3069 * var11 + this.field3074 * var10 + var27 >> 15) + this.field3081;
                    var34 = this.field3073.field5990 * var33 / var20 + arg3.field3674;
                    var35 = (this.field3077 * var11 + this.field3078 * var10 + var28 >> 15) + this.field3079;
                    var36 = this.field3073.field6006 * var35 / var20 + arg3.field3675;
                    var37 = (this.field3069 * var12 + this.field3074 * var10 + var27 >> 15) + this.field3081;
                    var38 = this.field3073.field5990 * var37 / var21 + arg3.field3674;
                    var39 = (this.field3077 * var12 + this.field3078 * var10 + var28 >> 15) + this.field3079;
                    var40 = this.field3073.field6006 * var39 / var21 + arg3.field3675;
                    var41 = (this.field3069 * var12 + this.field3074 * var9 + var27 >> 15) + this.field3081;
                    var42 = this.field3073.field5990 * var41 / var22 + arg3.field3674;
                    var43 = (this.field3077 * var12 + this.field3078 * var9 + var28 >> 15) + this.field3079;
                    var44 = this.field3073.field6006 * var43 / var22 + arg3.field3675;
                } else {
                    int var45 = this.field3076[arg0][arg1];
                    int var46 = this.field3076[arg0 + 1][arg1];
                    int var47 = this.field3076[arg0 + 1][arg1 + 1];
                    int var48 = this.field3076[arg0][arg1 + 1];
                    var19 = (this.field3066 * var11 + this.field3080 * var45 + this.field3075 * var9 >> 15) + this.field3067;
                    if (var19 <= this.field3073.field5979) {
                        return;
                    }
                    var20 = (this.field3066 * var11 + this.field3080 * var46 + this.field3075 * var10 >> 15) + this.field3067;
                    if (var20 <= this.field3073.field5979) {
                        return;
                    }
                    var21 = (this.field3066 * var12 + this.field3080 * var47 + this.field3075 * var10 >> 15) + this.field3067;
                    if (var21 <= this.field3073.field5979) {
                        return;
                    }
                    var22 = (this.field3066 * var12 + this.field3080 * var48 + this.field3075 * var9 >> 15) + this.field3067;
                    if (var22 <= this.field3073.field5979) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field3073.field5980;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field3065[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field3073.field5980;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field3065[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field3073.field5980;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field3065[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field3073.field5980;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field3065[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field3073.field5976) {
                        int var57 = var19 - this.field3073.field5980;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field3073.field5980;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field3073.field5980;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field3073.field5980;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field3069 * var11 + this.field3074 * var9 + this.field3071 * var45 >> 15) + this.field3081;
                    var30 = this.field3073.field5990 * var29 / var19 + arg3.field3674;
                    var31 = (this.field3077 * var11 + this.field3078 * var9 + this.field3061 * var45 >> 15) + this.field3079;
                    var32 = this.field3073.field6006 * var31 / var19 + arg3.field3675;
                    var33 = (this.field3069 * var11 + this.field3074 * var10 + this.field3071 * var46 >> 15) + this.field3081;
                    var34 = this.field3073.field5990 * var33 / var20 + arg3.field3674;
                    var35 = (this.field3077 * var11 + this.field3078 * var10 + this.field3061 * var46 >> 15) + this.field3079;
                    var36 = this.field3073.field6006 * var35 / var20 + arg3.field3675;
                    var37 = (this.field3069 * var12 + this.field3074 * var10 + this.field3071 * var47 >> 15) + this.field3081;
                    var38 = this.field3073.field5990 * var37 / var21 + arg3.field3674;
                    var39 = (this.field3077 * var12 + this.field3078 * var10 + this.field3061 * var47 >> 15) + this.field3079;
                    var40 = this.field3073.field6006 * var39 / var21 + arg3.field3675;
                    var41 = (this.field3069 * var12 + this.field3074 * var9 + this.field3071 * var48 >> 15) + this.field3081;
                    var42 = this.field3073.field5990 * var41 / var22 + arg3.field3674;
                    var43 = (this.field3077 * var12 + this.field3078 * var9 + this.field3061 * var48 >> 15) + this.field3079;
                    var44 = this.field3073.field6006 * var43 / var22 + arg3.field3675;
                }
                boolean var61 = var8.field924 != -1 && this.method1506(this.field3073.field6005.method917((byte) 116, var8.field924).field1714);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3676 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3681 || var42 > arg3.field3681 || var34 > arg3.field3681;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3673 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field924 >= 0) {
                                arg3.method1747(var40, var44, var36, var38, var42, var34, this.field3073.field5986, var15, var16, var14, var8.field927, var8.field928, var8.field925, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field924);
                            } else {
                                arg3.method1759(var40, var44, var36, var38, var42, var34, class147.method1137(var8.field927, false, var15 << 24 | this.field3073.field5986), class147.method1137(var8.field928, false, var16 << 24 | this.field3073.field5986), class147.method1137(var8.field925, false, var14 << 24 | this.field3073.field5986));
                            }
                        } else if (var8.field924 >= 0) {
                            arg3.method1745(var40, var44, var36, var38, var42, var34, var8.field927, var8.field928, var8.field925, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field924);
                        } else {
                            arg3.method1759(var40, var44, var36, var38, var42, var34, var8.field927, var8.field928, var8.field925);
                        }
                        arg3.field3673 = 0;
                    } else {
                        arg3.method1746(var40, var44, var36, var38, var42, var34, this.field3073.field5986);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3676 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3681 || var34 > arg3.field3681 || var42 > arg3.field3681;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3673 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field924 >= 0) {
                                arg3.method1747(var32, var36, var44, var30, var34, var42, this.field3073.field5986, var13, var14, var16, var8.field926, var8.field925, var8.field928, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field924);
                            } else {
                                arg3.method1759(var32, var36, var44, var30, var34, var42, class147.method1137(var8.field926, false, var13 << 24 | this.field3073.field5986), class147.method1137(var8.field925, false, var14 << 24 | this.field3073.field5986), class147.method1137(var8.field928, false, var16 << 24 | this.field3073.field5986));
                            }
                        } else if (var8.field924 >= 0) {
                            arg3.method1745(var32, var36, var44, var30, var34, var42, var8.field926, var8.field925, var8.field928, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field924);
                        } else {
                            arg3.method1759(var32, var36, var44, var30, var34, var42, var8.field926, var8.field925, var8.field928);
                        }
                        arg3.field3673 = 0;
                        return;
                    }
                    arg3.method1746(var32, var36, var44, var30, var34, var42, this.field3073.field5986);
                }
            }
        } else {
            class54 var64 = this.field3063[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field883; ++var65) {
                    short var105 = var64.field876[var65];
                    int var106 = var64.field880[var65];
                    short var107 = var64.field882[var65];
                    int var108 = (this.field3066 * var107 + this.field3080 * var106 + this.field3075 * var105 >> 15) + this.field3067;
                    if (var108 <= this.field3073.field5979) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field3073.field5980;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field877[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field3073.field5976) {
                        int var111 = var108 - this.field3073.field5980;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field3069 * var107 + this.field3074 * var105 + this.field3071 * var106 >> 15) + this.field3081;
                    int var113 = (this.field3077 * var107 + this.field3078 * var105 + this.field3061 * var106 >> 15) + this.field3079;
                    arg4[var65] = this.field3073.field5990 * var112 / var108 + arg3.field3674;
                    arg5[var65] = this.field3073.field6006 * var113 / var108 + arg3.field3675;
                }
                if (var64.field875 != null) {
                    int var66 = this.field3076[arg0][arg1];
                    int var67 = this.field3076[arg0 + 1][arg1];
                    int var68 = this.field3076[arg0][arg1 + 1];
                    int var69 = this.field3059 * arg0;
                    int var70 = this.field3059 + var69;
                    int var71 = this.field3059 * arg1;
                    int var72 = this.field3059 + var71;
                    int var73 = (this.field3069 * var71 + this.field3074 * var69 + this.field3071 * var66 >> 15) + this.field3081;
                    int var74 = (this.field3077 * var71 + this.field3078 * var69 + this.field3061 * var66 >> 15) + this.field3079;
                    int var75 = (this.field3066 * var71 + this.field3080 * var66 + this.field3075 * var69 >> 15) + this.field3067;
                    int var76 = (this.field3069 * var71 + this.field3074 * var70 + this.field3071 * var67 >> 15) + this.field3081;
                    int var77 = (this.field3077 * var71 + this.field3078 * var70 + this.field3061 * var67 >> 15) + this.field3079;
                    int var78 = (this.field3066 * var71 + this.field3080 * var67 + this.field3075 * var70 >> 15) + this.field3067;
                    int var79 = (this.field3069 * var72 + this.field3074 * var69 + this.field3071 * var68 >> 15) + this.field3081;
                    int var80 = (this.field3077 * var72 + this.field3078 * var69 + this.field3061 * var68 >> 15) + this.field3079;
                    int var81 = (this.field3066 * var72 + this.field3080 * var68 + this.field3075 * var69 >> 15) + this.field3067;
                    for (int var82 = 0; var82 < var64.field881; ++var82) {
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
                            arg3.field3676 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field3681 || var87 > arg3.field3681 || var88 > arg3.field3681;
                            short var93 = var64.field875[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method1506(this.field3073.field6005.method917((byte) 115, var93).field1714)) {
                                    arg3.field3673 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1747(var89, var90, var91, var86, var87, var88, this.field3073.field5986, arg6[var83], arg6[var84], arg6[var85], var64.field879[var83], var64.field879[var84], var64.field879[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field879[var83] & 16777215) != 0) {
                                        arg3.method1759(var89, var90, var91, var86, var87, var88, class147.method1137(var64.field879[var83], false, arg6[var83] << 24 | this.field3073.field5986), class147.method1137(var64.field879[var84], false, arg6[var84] << 24 | this.field3073.field5986), class147.method1137(var64.field879[var85], false, arg6[var85] << 24 | this.field3073.field5986));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1745(var89, var90, var91, var86, var87, var88, var64.field879[var83], var64.field879[var84], var64.field879[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field879[var83] & 16777215) != 0) {
                                    arg3.method1759(var89, var90, var91, var86, var87, var88, var64.field879[var83], var64.field879[var84], var64.field879[var85]);
                                }
                                arg3.field3673 = 0;
                            } else {
                                arg3.method1746(var89, var90, var91, var86, var87, var88, this.field3073.field5986);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field881; ++var94) {
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
                        arg3.field3676 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field3681 || var99 > arg3.field3681 || var100 > arg3.field3681;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field879[var95] & 16777215) != 0) {
                                    arg3.method1759(var101, var102, var103, var98, var99, var100, class406.method2486(arg6[var95], this.field3073.field5986, var64.field879[var95], -440486200), class406.method2486(arg6[var96], this.field3073.field5986, var64.field879[var96], -440486200), class406.method2486(arg6[var97], this.field3073.field5986, var64.field879[var97], -440486200));
                                }
                            } else if ((var64.field879[var95] & 16777215) != 0) {
                                arg3.method1759(var101, var102, var103, var98, var99, var100, var64.field879[var95], var64.field879[var96], var64.field879[var97]);
                            }
                        } else {
                            arg3.method1746(var101, var102, var103, var98, var99, var100, this.field3073.field5986);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lug;IIIIZ)Z", line = 570)
    public final boolean method1502(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V", line = 574)
    public final void method1503(int arg0, int arg1) {
        class43 var3 = this.field3073.method2618(Thread.currentThread());
        var3.field647.field3673 = 0;
        if (this.field3064 != null) {
            this.method1501(arg0, arg1, this.field3073.field5983, var3.field647, var3.field691, var3.field677, var3.field656);
        } else {
            if (this.field3072 != null) {
                this.method1508(arg0, arg1, var3.field647, var3.field691, var3.field677, var3.field656);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILug;)Lug;", line = 585)
    public final class325 method1504(int arg0, int arg1, class325 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 588)
    public final void method1505(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field3064 == null) {
            this.field3064 = new class58[super.field5745][super.field5751];
            this.field3063 = new class54[super.field5745][super.field5751];
        } else if (this.field3072 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class417.field5848[class40.method394((byte) 113, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class417.field5848[class40.method394((byte) 99, arg6[var14]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field3059 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field3059 && arg4[var20] == this.field3059) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field3059) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field3059 != arg2[var22] && arg2[0] - this.field3059 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field3059 != arg4[var22] && arg4[0] - this.field3059 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class58 var23 = new class58();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field929 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field923 = (byte) (var23.field923 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field3076[arg0 + 1][arg1] == this.field3076[arg0][arg1] && this.field3076[arg0 + 1][arg1 + 1] == this.field3076[arg0][arg1] && this.field3076[arg0][arg1 + 1] == this.field3076[arg0][arg1]) {
                    var23.field923 = (byte) (var23.field923 | 1);
                }
                if (var25 != -1 && (var23.field923 & 2) == 0 && !this.field3073.field6005.method917((byte) 116, var25).field1708) {
                    var23.field926 = this.field3058[arg0][arg1] - this.field3068[arg0][arg1];
                    var23.field925 = this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1];
                    var23.field927 = this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1];
                    var23.field928 = this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1];
                    var23.field924 = (short) var25;
                } else {
                    int var26;
                    if (this.field3065 != null && arg10 != 0) {
                        var26 = this.field3065[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field926 = class406.method2486(var26, arg9, method1518(arg5[var16] >> 8, this.field3058[arg0][arg1] - this.field3068[arg0][arg1]), -440486200);
                    if (var23.field929 != 0) {
                        var23.field926 |= 255 - (this.field3058[arg0][arg1] - this.field3068[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field3065 != null && arg10 != 0) {
                        var27 = this.field3065[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field925 = class406.method2486(var27, arg9, method1518(arg5[var17] >> 8, this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]), -440486200);
                    if (var23.field929 != 0) {
                        var23.field925 |= 255 - (this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field3065 != null && arg10 != 0) {
                        var28 = this.field3065[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field927 = class406.method2486(var28, arg9, method1518(arg5[var18] >> 8, this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]), -440486200);
                    if (var23.field929 != 0) {
                        var23.field927 |= 255 - (this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field3065 != null && arg10 != 0) {
                        var29 = this.field3065[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field928 = class406.method2486(var29, arg9, method1518(arg5[var19] >> 8, this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]), -440486200);
                    if (var23.field929 != 0) {
                        var23.field928 |= 255 - (this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]) << 25;
                    }
                    var23.field924 = -1;
                }
                this.field3064[arg0][arg1] = var23;
            } else {
                class54 var30 = new class54();
                var30.field883 = (short) arg2.length;
                var30.field881 = (short) (arg2.length / 3);
                var30.field876 = new short[var30.field883];
                var30.field880 = new short[var30.field883];
                var30.field882 = new short[var30.field883];
                var30.field879 = new int[var30.field883];
                if (this.field3065 != null) {
                    var30.field877 = new short[var30.field883];
                }
                for (int var31 = 0; var31 < var30.field883; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field3058[arg0][arg1] - this.field3068[arg0][arg1];
                    } else if (var46 == 0 && this.field3059 == var47) {
                        var49 = this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1];
                    } else if (this.field3059 == var46 && this.field3059 == var47) {
                        var49 = this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1];
                    } else if (this.field3059 == var46 && var47 == 0) {
                        var49 = this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]) * var46 + (this.field3058[arg0][arg1] - this.field3068[arg0][arg1]) * (this.field3059 - var46);
                        int var51 = (this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]) * var46 + (this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]) * (this.field3059 - var46);
                        var49 = (this.field3059 - var47) * var50 + var47 * var51 >> this.field3070 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field3070) + var46);
                    short var53 = (short) ((arg1 << this.field3070) + var47);
                    var30.field876[var31] = var52;
                    var30.field882[var31] = var53;
                    var30.field880[var31] = (short) (this.method1515(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field3073.field6005.method917((byte) 104, arg7[var31]).field1708) {
                        var30.field879[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field879[var31] = var49 << 25;
                        } else {
                            var30.field879[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field3065 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field3065[arg0][arg1];
                            } else if (var46 == 0 && this.field3059 == var47) {
                                var56 = this.field3065[arg0][arg1 + 1];
                            } else if (this.field3059 == var46 && this.field3059 == var47) {
                                var56 = this.field3065[arg0 + 1][arg1 + 1];
                            } else if (this.field3059 == var46 && var47 == 0) {
                                var56 = this.field3065[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field3059 - var46) * this.field3065[arg0][arg1] + this.field3065[arg0 + 1][arg1] * var46;
                                int var58 = (this.field3059 - var46) * this.field3065[arg0][arg1 + 1] + this.field3065[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field3059 - var47) * var57 + var47 * var58 >> this.field3070 * 2;
                            }
                            var30.field877[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field879[var31] = class406.method2486(var54, arg9, method1518(arg5[var31] >> 8, var49), -440486200);
                        if (arg6 != null) {
                            var30.field879[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field881; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field3073.field6005.method917((byte) 85, arg7[var33 * 3]).field1708) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field884 = new int[var30.field881];
                }
                if (var32) {
                    var30.field875 = new short[var30.field881];
                    var30.field878 = new short[var30.field881];
                }
                for (int var34 = 0; var34 < var30.field881; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field884[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field3073.field6005.method917((byte) 112, var40).field1708) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field3073.field6005.method917((byte) 123, var41).field1708) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field3073.field6005.method917((byte) 113, var42).field1708) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field875[var34] = (short) var42;
                            var30.field878[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field3073.field6005.method917((byte) 104, var43).field1708) {
                                    var30.field879[var35] = class417.field5848[class40.method394((byte) 88, this.field3073.field6005.method917((byte) 87, var43).field1707 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field3073.field6005.method917((byte) 93, var44).field1708) {
                                    var30.field879[var36] = class417.field5848[class40.method394((byte) 118, this.field3073.field6005.method917((byte) 101, var44).field1707 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field3073.field6005.method917((byte) 93, var45).field1708) {
                                    var30.field879[var37] = class417.field5848[class40.method394((byte) 107, this.field3073.field6005.method917((byte) 120, var45).field1707 & 65535) & 65535];
                                }
                            }
                            var30.field875[var34] = -1;
                        }
                    }
                }
                this.field3063[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Z", line = 1098)
    private final boolean method1506(int arg0) {
        if ((this.field3060 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[ZLwl;[I[I)V", line = 1111)
    private final void method1507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class274 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3671 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3072[var16][var17] != null) {
                        class70 var18 = this.field3072[var16][var17];
                        if (var18.field1062 != -1 && (var18.field1057 & 2) == 0 && var18.field1058 == -1) {
                            int var19 = this.field3073.method2615(var18.field1062);
                            arg8.method1754(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class313.method1996(var19, 1313487783, var18.field1060 & 65535), class313.method1996(var19, 1313487783, var18.field1061 & 65535), class313.method1996(var19, 1313487783, var18.field1059 & 65535));
                            arg8.method1754(var15, var15, var15 - var13, var14, var13 + var14, var14, class313.method1996(var19, 1313487783, var18.field1056 & 65535), class313.method1996(var19, 1313487783, var18.field1059 & 65535), class313.method1996(var19, 1313487783, var18.field1061 & 65535));
                        } else if (var18.field1058 == -1) {
                            arg8.method1754(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1060 & 65535, var18.field1061 & 65535, var18.field1059 & 65535);
                            arg8.method1754(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1056 & 65535, var18.field1059 & 65535, var18.field1061 & 65535);
                        } else {
                            int var20 = var18.field1058;
                            arg8.method1754(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1754(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field3062[var16][var17] != null) {
                        class143 var21 = this.field3062[var16][var17];
                        for (int var22 = 0; var22 < var21.field2159; ++var22) {
                            arg9[var22] = (var21.field2154[var22] - this.field3059 * var16) * var13 / this.field3059 + var14;
                            arg10[var22] = var15 - (var21.field2155[var22] - this.field3059 * var17) * var13 / this.field3059;
                        }
                        for (int var23 = 0; var23 < var21.field2161; ++var23) {
                            short var24 = var21.field2153[var23];
                            short var25 = var21.field2158[var23];
                            short var26 = var21.field2157[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2151 != null && var21.field2151[var23] != -1) {
                                int var33 = var21.field2151[var23];
                                arg8.method1754(var30, var31, var32, var27, var28, var29, class313.method1996(var33, 1313487783, var21.field2156[var24]), class313.method1996(var33, 1313487783, var21.field2156[var25]), class313.method1996(var33, 1313487783, var21.field2156[var26]));
                            } else if (var21.field2152 != null && var21.field2152[var23] != -1) {
                                int var34 = this.field3073.method2615(var21.field2152[var23]);
                                arg8.method1754(var30, var31, var32, var27, var28, var29, class313.method1996(var34, 1313487783, var21.field2156[var24]), class313.method1996(var34, 1313487783, var21.field2156[var25]), class313.method1996(var34, 1313487783, var21.field2156[var26]));
                            } else {
                                int var35 = var21.field2160[var23];
                                arg8.method1754(var30, var31, var32, var27, var28, var29, class313.method1996(var35, 1313487783, var21.field2156[var24]), class313.method1996(var35, 1313487783, var21.field2156[var25]), class313.method1996(var35, 1313487783, var21.field2156[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3671 = true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILwl;[I[I[I)V", line = 1247)
    private final void method1508(int arg0, int arg1, class274 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class70 var7 = this.field3072[arg0][arg1];
        if (var7 != null) {
            if ((var7.field1057 & 2) == 0) {
                int var8 = this.field3059 * arg0;
                int var9 = this.field3059 + var8;
                int var10 = this.field3059 * arg1;
                int var11 = this.field3059 + var10;
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
                if ((var7.field1057 & 1) != 0) {
                    int var12 = this.field3076[arg0][arg1];
                    int var13 = this.field3080 * var12;
                    var14 = (this.field3066 * var10 + this.field3075 * var8 + var13 >> 15) + this.field3067;
                    if (var14 <= this.field3073.field5979) {
                        return;
                    }
                    var15 = (this.field3066 * var10 + this.field3075 * var9 + var13 >> 15) + this.field3067;
                    if (var15 <= this.field3073.field5979) {
                        return;
                    }
                    int var16 = (this.field3066 * var11 + this.field3075 * var9 + var13 >> 15) + this.field3067;
                    if (var16 <= this.field3073.field5979) {
                        return;
                    }
                    var17 = (this.field3066 * var11 + this.field3075 * var8 + var13 >> 15) + this.field3067;
                    if (var17 <= this.field3073.field5979) {
                        return;
                    }
                    int var18 = this.field3071 * var12;
                    int var19 = this.field3061 * var12;
                    var20 = (this.field3069 * var10 + this.field3074 * var8 + var18 >> 15) + this.field3081;
                    var21 = this.field3073.field5990 * var20 / var14 + arg2.field3674;
                    var22 = (this.field3077 * var10 + this.field3078 * var8 + var19 >> 15) + this.field3079;
                    var23 = this.field3073.field6006 * var22 / var14 + arg2.field3675;
                    var24 = (this.field3069 * var10 + this.field3074 * var9 + var18 >> 15) + this.field3081;
                    var25 = this.field3073.field5990 * var24 / var15 + arg2.field3674;
                    var26 = (this.field3077 * var10 + this.field3078 * var9 + var19 >> 15) + this.field3079;
                    var27 = this.field3073.field6006 * var26 / var15 + arg2.field3675;
                    int var28 = (this.field3069 * var11 + this.field3074 * var9 + var18 >> 15) + this.field3081;
                    var29 = this.field3073.field5990 * var28 / var16 + arg2.field3674;
                    int var30 = (this.field3077 * var11 + this.field3078 * var9 + var19 >> 15) + this.field3079;
                    var31 = this.field3073.field6006 * var30 / var16 + arg2.field3675;
                    var32 = (this.field3069 * var11 + this.field3074 * var8 + var18 >> 15) + this.field3081;
                    var33 = this.field3073.field5990 * var32 / var17 + arg2.field3674;
                    var34 = (this.field3077 * var11 + this.field3078 * var8 + var19 >> 15) + this.field3079;
                    var35 = this.field3073.field6006 * var34 / var17 + arg2.field3675;
                } else {
                    int var36 = this.field3076[arg0][arg1];
                    int var37 = this.field3076[arg0 + 1][arg1];
                    int var38 = this.field3076[arg0 + 1][arg1 + 1];
                    int var39 = this.field3076[arg0][arg1 + 1];
                    var14 = (this.field3066 * var10 + this.field3080 * var36 + this.field3075 * var8 >> 15) + this.field3067;
                    if (var14 <= this.field3073.field5979) {
                        return;
                    }
                    var15 = (this.field3066 * var10 + this.field3080 * var37 + this.field3075 * var9 >> 15) + this.field3067;
                    if (var15 <= this.field3073.field5979) {
                        return;
                    }
                    int var40 = (this.field3066 * var11 + this.field3080 * var38 + this.field3075 * var9 >> 15) + this.field3067;
                    if (var40 <= this.field3073.field5979) {
                        return;
                    }
                    var17 = (this.field3066 * var11 + this.field3080 * var39 + this.field3075 * var8 >> 15) + this.field3067;
                    if (var17 <= this.field3073.field5979) {
                        return;
                    }
                    var20 = (this.field3069 * var10 + this.field3074 * var8 + this.field3071 * var36 >> 15) + this.field3081;
                    var21 = this.field3073.field5990 * var20 / var14 + arg2.field3674;
                    var22 = (this.field3077 * var10 + this.field3078 * var8 + this.field3061 * var36 >> 15) + this.field3079;
                    var23 = this.field3073.field6006 * var22 / var14 + arg2.field3675;
                    var24 = (this.field3069 * var10 + this.field3074 * var9 + this.field3071 * var37 >> 15) + this.field3081;
                    var25 = this.field3073.field5990 * var24 / var15 + arg2.field3674;
                    var26 = (this.field3077 * var10 + this.field3078 * var9 + this.field3061 * var37 >> 15) + this.field3079;
                    var27 = this.field3073.field6006 * var26 / var15 + arg2.field3675;
                    int var41 = (this.field3069 * var11 + this.field3074 * var9 + this.field3071 * var38 >> 15) + this.field3081;
                    var29 = this.field3073.field5990 * var41 / var40 + arg2.field3674;
                    int var42 = (this.field3077 * var11 + this.field3078 * var9 + this.field3061 * var38 >> 15) + this.field3079;
                    var31 = this.field3073.field6006 * var42 / var40 + arg2.field3675;
                    var32 = (this.field3069 * var11 + this.field3074 * var8 + this.field3071 * var39 >> 15) + this.field3081;
                    var33 = this.field3073.field5990 * var32 / var17 + arg2.field3674;
                    var34 = (this.field3077 * var11 + this.field3078 * var8 + this.field3061 * var39 >> 15) + this.field3079;
                    var35 = this.field3073.field6006 * var34 / var17 + arg2.field3675;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3676 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3681 || var33 > arg2.field3681 || var25 > arg2.field3681;
                    if (var7.field1062 >= 0) {
                        if (this.method1506(this.field3073.field6005.method917((byte) 120, var7.field1062).field1714)) {
                            arg2.field3673 = 100;
                        }
                        arg2.method1745(var31, var35, var27, var29, var33, var25, var7.field1060 & 65535, var7.field1061 & 65535, var7.field1059 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field1062);
                        arg2.field3673 = 0;
                    } else {
                        arg2.method1754(var31, var35, var27, var29, var33, var25, var7.field1060 & 65535, var7.field1061 & 65535, var7.field1059 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3676 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3681 || var25 > arg2.field3681 || var33 > arg2.field3681;
                    if (var7.field1062 >= 0) {
                        if (this.method1506(this.field3073.field6005.method917((byte) 81, var7.field1062).field1714)) {
                            arg2.field3673 = 100;
                        }
                        arg2.method1745(var23, var27, var35, var21, var25, var33, var7.field1056 & 65535, var7.field1059 & 65535, var7.field1061 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field1062);
                        arg2.field3673 = 0;
                        return;
                    }
                    arg2.method1754(var23, var27, var35, var21, var25, var33, var7.field1056 & 65535, var7.field1059 & 65535, var7.field1061 & 65535);
                }
            }
        } else {
            class143 var43 = this.field3062[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field2159; ++var44) {
                    int var84 = var43.field2154[var44];
                    int var85 = var43.field2163[var44];
                    int var86 = var43.field2155[var44];
                    int var87 = (this.field3066 * var86 + this.field3080 * var85 + this.field3075 * var84 >> 15) + this.field3067;
                    if (var87 <= this.field3073.field5979) {
                        return;
                    }
                    int var88 = (this.field3069 * var86 + this.field3074 * var84 + this.field3071 * var85 >> 15) + this.field3081;
                    int var89 = (this.field3077 * var86 + this.field3078 * var84 + this.field3061 * var85 >> 15) + this.field3079;
                    arg3[var44] = this.field3073.field5990 * var88 / var87 + arg2.field3674;
                    arg4[var44] = this.field3073.field6006 * var89 / var87 + arg2.field3675;
                }
                if (var43.field2152 != null) {
                    int var45 = this.field3076[arg0][arg1];
                    int var46 = this.field3076[arg0 + 1][arg1];
                    int var47 = this.field3076[arg0][arg1 + 1];
                    int var48 = this.field3059 * arg0;
                    int var49 = this.field3059 + var48;
                    int var50 = this.field3059 * arg1;
                    int var51 = this.field3059 + var50;
                    int var52 = (this.field3069 * var50 + this.field3074 * var48 + this.field3071 * var45 >> 15) + this.field3081;
                    int var53 = (this.field3077 * var50 + this.field3078 * var48 + this.field3061 * var45 >> 15) + this.field3079;
                    int var54 = (this.field3066 * var50 + this.field3080 * var45 + this.field3075 * var48 >> 15) + this.field3067;
                    int var55 = (this.field3069 * var50 + this.field3074 * var49 + this.field3071 * var46 >> 15) + this.field3081;
                    int var56 = (this.field3077 * var50 + this.field3078 * var49 + this.field3061 * var46 >> 15) + this.field3079;
                    int var57 = (this.field3066 * var50 + this.field3080 * var46 + this.field3075 * var49 >> 15) + this.field3067;
                    int var58 = (this.field3069 * var51 + this.field3074 * var48 + this.field3071 * var47 >> 15) + this.field3081;
                    int var59 = (this.field3077 * var51 + this.field3078 * var48 + this.field3061 * var47 >> 15) + this.field3079;
                    int var60 = (this.field3066 * var51 + this.field3080 * var47 + this.field3075 * var48 >> 15) + this.field3067;
                    for (int var61 = 0; var61 < var43.field2161; ++var61) {
                        short var62 = var43.field2153[var61];
                        short var63 = var43.field2158[var61];
                        short var64 = var43.field2157[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field3676 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field3681 || var66 > arg2.field3681 || var67 > arg2.field3681;
                            short var71 = var43.field2152[var61];
                            if (var71 != -1) {
                                if (this.method1506(this.field3073.field6005.method917((byte) 112, var71).field1714)) {
                                    arg2.field3673 = 100;
                                }
                                arg2.method1745(var68, var69, var70, var65, var66, var67, var43.field2156[var62], var43.field2156[var63], var43.field2156[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field3673 = 0;
                            } else {
                                int var72 = var43.field2160[var61];
                                if (var72 != -1) {
                                    arg2.method1754(var68, var69, var70, var65, var66, var67, class313.method1996(var72, 1313487783, var43.field2156[var62]), class313.method1996(var72, 1313487783, var43.field2156[var63]), class313.method1996(var72, 1313487783, var43.field2156[var64]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field2161; ++var73) {
                    short var74 = var43.field2153[var73];
                    short var75 = var43.field2158[var73];
                    short var76 = var43.field2157[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field2160[var73];
                        if (var83 != -1) {
                            arg2.field3676 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field3681 || var78 > arg2.field3681 || var79 > arg2.field3681;
                            arg2.method1754(var80, var81, var82, var77, var78, var79, class313.method1996(var83, 1313487783, var43.field2156[var74]), class313.method1996(var83, 1313487783, var43.field2156[var75]), class313.method1996(var83, 1313487783, var43.field2156[var76]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)I", line = 1563)
    public final int method1509(int arg0, int arg1) {
        return this.field3076[arg0][arg1];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[[ZZ)V", line = 1569)
    public final void method1510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class196 var6 = this.field3073.field6001;
        this.field3074 = var6.field2806;
        this.field3071 = var6.field2802;
        this.field3069 = var6.field2800;
        this.field3081 = var6.field2804;
        this.field3078 = var6.field2801;
        this.field3061 = var6.field2799;
        this.field3077 = var6.field2807;
        this.field3079 = var6.field2798;
        this.field3075 = var6.field2796;
        this.field3080 = var6.field2803;
        this.field3066 = var6.field2805;
        this.field3067 = var6.field2797;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Lug;IIIIZ)V", line = 1589)
    public final void method1511(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1593)
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class43 var9 = this.field3073.method2618(Thread.currentThread());
        class274 var10 = var9.field647;
        var10.field3673 = 0;
        var10.field3676 = false;
        if (this.field3064 != null) {
            this.method1517(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field691, var9.field677);
        } else {
            if (this.field3072 != null) {
                this.method1507(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field691, var9.field677);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 1608)
    public final void method1513() {
        this.field3058 = null;
        this.field3068 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 1614)
    public final void method1514(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field3072 == null) {
            this.field3072 = new class70[super.field5745][super.field5751];
            this.field3062 = new class143[super.field5745][super.field5751];
        } else if (this.field3064 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field3059 != var18 || var19 != 0 && this.field3059 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class143 var20 = new class143();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field2159 = var21;
            var20.field2156 = new short[var21];
            var20.field2154 = new int[var21];
            var20.field2163 = new int[var21];
            var20.field2155 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field2156[var23] = (short) (this.field3058[arg0][arg1] - this.field3068[arg0][arg1]);
                } else if (var28 == 0 && this.field3059 == var29) {
                    var20.field2156[var23] = (short) (this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]);
                } else if (this.field3059 == var28 && this.field3059 == var29) {
                    var20.field2156[var23] = (short) (this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]);
                } else if (this.field3059 == var28 && var29 == 0) {
                    var20.field2156[var23] = (short) (this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]) * var28 + (this.field3058[arg0][arg1] - this.field3068[arg0][arg1]) * (this.field3059 - var28);
                    int var31 = (this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]) * var28 + (this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]) * (this.field3059 - var28);
                    var20.field2156[var23] = (short) ((this.field3059 - var29) * var30 + var29 * var31 >> this.field3070 * 2);
                }
                int var32 = (arg0 << this.field3070) + var28;
                int var33 = (arg1 << this.field3070) + var29;
                var20.field2154[var23] = var32;
                var20.field2155[var23] = var33;
                var20.field2163[var23] = this.method1515(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field2156[var23] < 2) {
                    var20.field2156[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field3073.field6005.method917((byte) 92, arg10[var26]).field1708) {
                    var24 = true;
                }
            }
            var20.field2160 = new int[var25];
            if (arg9 != null) {
                var20.field2151 = new int[var25];
            }
            var20.field2153 = new short[var25];
            var20.field2158 = new short[var25];
            var20.field2157 = new short[var25];
            if (var24) {
                var20.field2152 = new short[var25];
                var20.field2162 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field2160[var20.field2161] = class40.method394((byte) 66, arg8[var27]);
                    } else {
                        var20.field2160[var20.field2161] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field2151[var20.field2161] = class40.method394((byte) 76, arg9[var27]);
                        } else {
                            var20.field2151[var20.field2161] = -1;
                        }
                    }
                    var20.field2153[var20.field2161] = (short) arg5[var27];
                    var20.field2158[var20.field2161] = (short) arg6[var27];
                    var20.field2157[var20.field2161] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field3073.field6005.method917((byte) 95, arg10[var27]).field1708) {
                            var20.field2152[var20.field2161] = (short) arg10[var27];
                            var20.field2162[var20.field2161] = (short) arg11[var27];
                        } else {
                            var20.field2152[var20.field2161] = -1;
                        }
                    }
                    ++var20.field2161;
                }
            }
            this.field3062[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class70 var34 = new class70();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field1058 = class313.method1996(class40.method394((byte) 115, arg9[0]), 1313487783, this.field3058[arg0][arg1] - this.field3068[arg0][arg1]);
                    if (var35 == -1) {
                        var34.field1057 = (byte) (var34.field1057 | 2);
                    }
                }
                if (this.field3076[arg0 + 1][arg1] == this.field3076[arg0][arg1] && this.field3076[arg0 + 1][arg1 + 1] == this.field3076[arg0][arg1] && this.field3076[arg0][arg1 + 1] == this.field3076[arg0][arg1]) {
                    var34.field1057 = (byte) (var34.field1057 | 1);
                }
                if (var36 != -1 && (var34.field1057 & 2) == 0 && !this.field3073.field6005.method917((byte) 84, var36).field1708) {
                    var34.field1056 = (short) (this.field3058[arg0][arg1] - this.field3068[arg0][arg1]);
                    var34.field1059 = (short) (this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]);
                    var34.field1060 = (short) (this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]);
                    var34.field1061 = (short) (this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]);
                    var34.field1062 = (short) var36;
                } else {
                    short var37 = class40.method394((byte) 66, var35);
                    var34.field1056 = (short) class313.method1996(var37, 1313487783, this.field3058[arg0][arg1] - this.field3068[arg0][arg1]);
                    var34.field1059 = (short) class313.method1996(var37, 1313487783, this.field3058[arg0 + 1][arg1] - this.field3068[arg0 + 1][arg1]);
                    var34.field1060 = (short) class313.method1996(var37, 1313487783, this.field3058[arg0 + 1][arg1 + 1] - this.field3068[arg0 + 1][arg1 + 1]);
                    var34.field1061 = (short) class313.method1996(var37, 1313487783, this.field3058[arg0][arg1 + 1] - this.field3068[arg0][arg1 + 1]);
                    var34.field1062 = -1;
                }
                this.field3072[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lvn;IIII[[I[[II)V", line = 1846)
    public class222(class425 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field3073 = arg0;
        this.field3060 = arg2;
        this.field3076 = arg5;
        this.field3065 = arg6;
        this.field3059 = arg7;
        this.field3070 = 0;
        while (arg7 > 1) {
            ++this.field3070;
            arg7 >>= 1;
        }
        this.field3058 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field3073.field5995 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field3076[var11 + 1][var10] - this.field3076[var11 - 1][var10];
                int var14 = this.field3076[var11][var10 + 1] - this.field3076[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field3073.field6007 * var18 + this.field3073.field5993 * var16 + this.field3073.field5972 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field3058[var11][var10] = (byte) var20;
            }
        }
        this.field3068 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I", line = 1909)
    public final int method1515(int arg0, int arg1) {
        int var3 = arg0 >> this.field3070;
        int var4 = arg1 >> this.field3070;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field5745 - 1 && var4 <= super.field5751 - 1) {
            int var5 = arg0 & this.field3059 - 1;
            int var6 = arg1 & this.field3059 - 1;
            int var7 = (this.field3059 - var5) * this.field3076[var3][var4] + this.field3076[var3 + 1][var4] * var5 >> this.field3070;
            int var8 = (this.field3059 - var5) * this.field3076[var3][var4 + 1] + this.field3076[var3 + 1][var4 + 1] * var5 >> this.field3070;
            return (this.field3059 - var6) * var7 + var6 * var8 >> this.field3070;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lug;IIIIZ)V", line = 1926)
    public final void method1516(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIIII[[ZLwl;[I[I)V", line = 1930)
    private final void method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class274 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3671 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3064[var16][var17] != null) {
                        class58 var18 = this.field3064[var16][var17];
                        if (var18.field924 != -1 && (var18.field923 & 2) == 0 && var18.field929 == 0) {
                            int var19 = this.field3073.method2615(var18.field924);
                            arg8.method1754(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class313.method1996(var19, 1313487783, var18.field927), class313.method1996(var19, 1313487783, var18.field928), class313.method1996(var19, 1313487783, var18.field925));
                            arg8.method1754(var15, var15, var15 - var13, var14, var13 + var14, var14, class313.method1996(var19, 1313487783, var18.field926), class313.method1996(var19, 1313487783, var18.field925), class313.method1996(var19, 1313487783, var18.field928));
                        } else if (var18.field929 == 0) {
                            arg8.method1759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field927, var18.field928, var18.field925);
                            arg8.method1759(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field926, var18.field925, var18.field928);
                        } else {
                            int var20 = var18.field929;
                            arg8.method1759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class147.method1137(var20, false, var18.field927 & -16777216), class147.method1137(var20, false, var18.field928 & -16777216), class147.method1137(var20, false, var18.field925 & -16777216));
                            arg8.method1759(var15, var15, var15 - var13, var14, var13 + var14, var14, class147.method1137(var20, false, var18.field926 & -16777216), class147.method1137(var20, false, var18.field925 & -16777216), class147.method1137(var20, false, var18.field928 & -16777216));
                        }
                    } else if (this.field3063[var16][var17] != null) {
                        class54 var21 = this.field3063[var16][var17];
                        for (int var22 = 0; var22 < var21.field883; ++var22) {
                            arg9[var22] = (var21.field876[var22] - this.field3059 * var16) * var13 / this.field3059 + var14;
                            arg10[var22] = var15 - (var21.field882[var22] - this.field3059 * var17) * var13 / this.field3059;
                        }
                        for (int var23 = 0; var23 < var21.field881; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field884 == null || var21.field884[var23] == 0 || var21.field875 != null && (var21.field875 == null || var21.field875[var23] != -1)) {
                                if (var21.field875 != null && var21.field875[var23] != -1) {
                                    int var34 = this.field3073.method2615(var21.field875[var23]);
                                    arg8.method1754(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method1759(var30, var31, var32, var27, var28, var29, var21.field879[var24], var21.field879[var25], var21.field879[var26]);
                                }
                            } else {
                                int var33 = var21.field884[var23];
                                arg8.method1759(var30, var31, var32, var27, var28, var29, class147.method1137(var33, false, -16777216 - (var21.field879[var24] & -16777216)), class147.method1137(var33, false, -16777216 - (var21.field879[var25] & -16777216)), class147.method1137(var33, false, -16777216 - (var21.field879[var26] & -16777216)));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3671 = true;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(II)I", line = 2059)
    private static final int method1518(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V", line = 2091)
    public final void method1519(int arg0, int arg1, int arg2) {
        if (this.field3068[arg0][arg1] < arg2) {
            this.field3068[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lj;[I)V", line = 2095)
    public final void method1520(class269 arg0, int[] arg1) {
    }
}
