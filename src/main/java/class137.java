import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class137 extends class278 {

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    private int field2133 = -1;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Luj;")
    private class381 field2136;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    private int field2126;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "[[B")
    private byte[][] field2139;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "[[B")
    private byte[][] field2142;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "F")
    private float field2127;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "F")
    private float field2128;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "F")
    private float field2134;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "F")
    private float field2135;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "F")
    private float field2137;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "F")
    private float field2138;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "F")
    private float field2140;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "F")
    private float field2141;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "F")
    private float field2143;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "F")
    private float field2144;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "F")
    private float field2145;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "F")
    private float field2147;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "[[Lrga;")
    private class238[][] field2131;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "[[Lvd;")
    private class38[][] field2132;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "[[Lch;")
    private class461[][] field2130;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "[[Lmq;")
    private class506[][] field2146;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "[[Lqj;")
    private class507[][] field2129;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZLw;Lb;[I[I[I[II)V", line = 5)
    private final void method1076(int arg0, int arg1, boolean arg2, class299 arg3, class333 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class38 var11 = this.field2132[arg0][arg1];
        if (var11 != null) {
            if ((var11.field580 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field580 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3920 * arg0;
                int var13 = super.field3920 + var12;
                int var14 = super.field3920 * arg1;
                int var15 = super.field3920 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field580 & 1) != 0 && !arg2) {
                    int var20 = super.field3916[arg0][arg1];
                    float var21 = (float) var20 * this.field2135;
                    if (this.field2133 == -1) {
                        var22 = (float) var14 * this.field2144 + (float) var12 * this.field2141 + var21 + this.field2137;
                        if (var22 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var23 = (float) var14 * this.field2144 + (float) var13 * this.field2141 + var21 + this.field2137;
                        if (var23 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var24 = (float) var15 * this.field2144 + (float) var13 * this.field2141 + var21 + this.field2137;
                        if (var24 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var25 = (float) var15 * this.field2144 + (float) var12 * this.field2141 + var21 + this.field2137;
                        if (var25 <= (float) this.field2136.field5333) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field2144 + (float) var12 * this.field2141 + var21 + this.field2137;
                        var23 = (float) var14 * this.field2144 + (float) var13 * this.field2141 + var21 + this.field2137;
                        var24 = (float) var15 * this.field2144 + (float) var13 * this.field2141 + var21 + this.field2137;
                        var25 = (float) var15 * this.field2144 + (float) var12 * this.field2141 + var21 + this.field2137;
                    }
                    if (arg3.field4143) {
                        int var26 = (int) (var22 - (float) arg3.field4152);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field4152);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field4152);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field4152);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field2134;
                    float var31 = (float) var20 * this.field2140;
                    if (this.field2133 == -1) {
                        float var32 = (float) var14 * this.field2145 + (float) var12 * this.field2143 + var30 + this.field2147;
                        var33 = (int) ((float) this.field2136.field5312 * var32 / var22) + arg4.field4694;
                        float var34 = (float) var14 * this.field2128 + (float) var12 * this.field2127 + var31 + this.field2138;
                        var35 = (int) ((float) this.field2136.field5349 * var34 / var22) + arg4.field4701;
                        float var36 = (float) var14 * this.field2145 + (float) var13 * this.field2143 + var30 + this.field2147;
                        var37 = (int) ((float) this.field2136.field5312 * var36 / var23) + arg4.field4694;
                        float var38 = (float) var14 * this.field2128 + (float) var13 * this.field2127 + var31 + this.field2138;
                        var39 = (int) ((float) this.field2136.field5349 * var38 / var23) + arg4.field4701;
                        float var40 = (float) var15 * this.field2145 + (float) var13 * this.field2143 + var30 + this.field2147;
                        var41 = (int) ((float) this.field2136.field5312 * var40 / var24) + arg4.field4694;
                        float var42 = (float) var15 * this.field2128 + (float) var13 * this.field2127 + var31 + this.field2138;
                        var43 = (int) ((float) this.field2136.field5349 * var42 / var24) + arg4.field4701;
                        float var44 = (float) var15 * this.field2145 + (float) var12 * this.field2143 + var30 + this.field2147;
                        var45 = (int) ((float) this.field2136.field5312 * var44 / var25) + arg4.field4694;
                        float var46 = (float) var15 * this.field2128 + (float) var12 * this.field2127 + var31 + this.field2138;
                        var47 = (int) ((float) this.field2136.field5349 * var46 / var25) + arg4.field4701;
                    } else {
                        float var48 = (float) var14 * this.field2145 + (float) var12 * this.field2143 + var30 + this.field2147;
                        var33 = (int) ((float) this.field2136.field5312 * var48 / (float) this.field2133) + arg4.field4694;
                        float var49 = (float) var14 * this.field2128 + (float) var12 * this.field2127 + var31 + this.field2138;
                        var35 = (int) ((float) this.field2136.field5349 * var49 / (float) this.field2133) + arg4.field4701;
                        float var50 = (float) var14 * this.field2145 + (float) var13 * this.field2143 + var30 + this.field2147;
                        var37 = (int) ((float) this.field2136.field5312 * var50 / (float) this.field2133) + arg4.field4694;
                        float var51 = (float) var14 * this.field2128 + (float) var13 * this.field2127 + var31 + this.field2138;
                        var39 = (int) ((float) this.field2136.field5349 * var51 / (float) this.field2133) + arg4.field4701;
                        float var52 = (float) var15 * this.field2145 + (float) var13 * this.field2143 + var30 + this.field2147;
                        var41 = (int) ((float) this.field2136.field5312 * var52 / (float) this.field2133) + arg4.field4694;
                        float var53 = (float) var15 * this.field2128 + (float) var13 * this.field2127 + var31 + this.field2138;
                        var43 = (int) ((float) this.field2136.field5349 * var53 / (float) this.field2133) + arg4.field4701;
                        float var54 = (float) var15 * this.field2145 + (float) var12 * this.field2143 + var30 + this.field2147;
                        var45 = (int) ((float) this.field2136.field5312 * var54 / (float) this.field2133) + arg4.field4694;
                        float var55 = (float) var15 * this.field2128 + (float) var12 * this.field2127 + var31 + this.field2138;
                        var47 = (int) ((float) this.field2136.field5349 * var55 / (float) this.field2133) + arg4.field4701;
                    }
                } else {
                    int var56 = super.field3916[arg0][arg1];
                    int var57 = super.field3916[arg0 + 1][arg1];
                    int var58 = super.field3916[arg0 + 1][arg1 + 1];
                    int var59 = super.field3916[arg0][arg1 + 1];
                    if (this.field2133 == -1) {
                        var22 = (float) var14 * this.field2144 + (float) var12 * this.field2141 + (float) var56 * this.field2135 + this.field2137;
                        if (var22 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var23 = (float) var14 * this.field2144 + (float) var13 * this.field2141 + (float) var57 * this.field2135 + this.field2137;
                        if (var23 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var24 = (float) var15 * this.field2144 + (float) var13 * this.field2141 + (float) var58 * this.field2135 + this.field2137;
                        if (var24 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var25 = (float) var15 * this.field2144 + (float) var12 * this.field2141 + (float) var59 * this.field2135 + this.field2137;
                        if (var25 <= (float) this.field2136.field5333) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field2144 + (float) var12 * this.field2141 + (float) var56 * this.field2135 + this.field2137;
                        var23 = (float) var14 * this.field2144 + (float) var13 * this.field2141 + (float) var57 * this.field2135 + this.field2137;
                        var24 = (float) var15 * this.field2144 + (float) var13 * this.field2141 + (float) var58 * this.field2135 + this.field2137;
                        var25 = (float) var15 * this.field2144 + (float) var12 * this.field2141 + (float) var59 * this.field2135 + this.field2137;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field4152);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field578 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field4152);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field577 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field4152);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field583 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field4152);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field575 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field4143) {
                        int var68 = (int) (var22 - (float) arg3.field4152);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field4152);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field4152);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field4152);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field2133 == -1) {
                        float var72 = (float) var14 * this.field2145 + (float) var12 * this.field2143 + (float) var56 * this.field2134 + this.field2147;
                        var33 = (int) ((float) this.field2136.field5312 * var72 / var22) + arg4.field4694;
                        float var73 = (float) var14 * this.field2128 + (float) var12 * this.field2127 + (float) var56 * this.field2140 + this.field2138;
                        var35 = (int) ((float) this.field2136.field5349 * var73 / var22) + arg4.field4701;
                        float var74 = (float) var14 * this.field2145 + (float) var13 * this.field2143 + (float) var57 * this.field2134 + this.field2147;
                        var37 = (int) ((float) this.field2136.field5312 * var74 / var23) + arg4.field4694;
                        float var75 = (float) var14 * this.field2128 + (float) var13 * this.field2127 + (float) var57 * this.field2140 + this.field2138;
                        var39 = (int) ((float) this.field2136.field5349 * var75 / var23) + arg4.field4701;
                        float var76 = (float) var15 * this.field2145 + (float) var13 * this.field2143 + (float) var58 * this.field2134 + this.field2147;
                        var41 = (int) ((float) this.field2136.field5312 * var76 / var24) + arg4.field4694;
                        float var77 = (float) var15 * this.field2128 + (float) var13 * this.field2127 + (float) var58 * this.field2140 + this.field2138;
                        var43 = (int) ((float) this.field2136.field5349 * var77 / var24) + arg4.field4701;
                        float var78 = (float) var15 * this.field2145 + (float) var12 * this.field2143 + (float) var59 * this.field2134 + this.field2147;
                        var45 = (int) ((float) this.field2136.field5312 * var78 / var25) + arg4.field4694;
                        float var79 = (float) var15 * this.field2128 + (float) var12 * this.field2127 + (float) var59 * this.field2140 + this.field2138;
                        var47 = (int) ((float) this.field2136.field5349 * var79 / var25) + arg4.field4701;
                    } else {
                        float var80 = (float) var14 * this.field2145 + (float) var12 * this.field2143 + (float) var56 * this.field2134 + this.field2147;
                        var33 = (int) ((float) this.field2136.field5312 * var80 / (float) this.field2133) + arg4.field4694;
                        float var81 = (float) var14 * this.field2128 + (float) var12 * this.field2127 + (float) var56 * this.field2140 + this.field2138;
                        var35 = (int) ((float) this.field2136.field5349 * var81 / (float) this.field2133) + arg4.field4701;
                        float var82 = (float) var14 * this.field2145 + (float) var13 * this.field2143 + (float) var57 * this.field2134 + this.field2147;
                        var37 = (int) ((float) this.field2136.field5312 * var82 / (float) this.field2133) + arg4.field4694;
                        float var83 = (float) var14 * this.field2128 + (float) var13 * this.field2127 + (float) var57 * this.field2140 + this.field2138;
                        var39 = (int) ((float) this.field2136.field5349 * var83 / (float) this.field2133) + arg4.field4701;
                        float var84 = (float) var15 * this.field2145 + (float) var13 * this.field2143 + (float) var58 * this.field2134 + this.field2147;
                        var41 = (int) ((float) this.field2136.field5312 * var84 / (float) this.field2133) + arg4.field4694;
                        float var85 = (float) var15 * this.field2128 + (float) var13 * this.field2127 + (float) var58 * this.field2140 + this.field2138;
                        var43 = (int) ((float) this.field2136.field5349 * var85 / (float) this.field2133) + arg4.field4701;
                        float var86 = (float) var15 * this.field2145 + (float) var12 * this.field2143 + (float) var59 * this.field2134 + this.field2147;
                        var45 = (int) ((float) this.field2136.field5312 * var86 / (float) this.field2133) + arg4.field4694;
                        float var87 = (float) var15 * this.field2128 + (float) var12 * this.field2127 + (float) var59 * this.field2140 + this.field2138;
                        var47 = (int) ((float) this.field2136.field5349 * var87 / (float) this.field2133) + arg4.field4701;
                    }
                }
                boolean var88 = var11.field581 != -1 && this.method1083(this.field2136.field1084.method1154(-107, var11.field581).field7711);
                if (this.field2133 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field4692 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field4693 || var45 > arg4.field4693 || var37 > arg4.field4693;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field581 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method2133((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field574 & 16777215, var90 | var11.field579 & 16777215, var90 | var11.field576 & 16777215, arg3.field4149, var18, var19, var17, var11.field581);
                                } else {
                                    if (var88) {
                                        arg4.field4699 = 100;
                                    }
                                    arg4.method2125((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class397.method2463(var18 << 24 | arg3.field4149, var11.field574, (byte) -10), class397.method2463(var19 << 24 | arg3.field4149, var11.field579, (byte) -10), class397.method2463(var17 << 24 | arg3.field4149, var11.field576, (byte) -10));
                                    arg4.field4699 = 0;
                                }
                            } else if (var11.field581 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method2133((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field574 & 16777215, var91 | var11.field579 & 16777215, var91 | var11.field576 & 16777215, 0, 0, 0, 0, var11.field581);
                            } else {
                                if (var88) {
                                    arg4.field4699 = 100;
                                }
                                arg4.method2125((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field574, var11.field579, var11.field576);
                                arg4.field4699 = 0;
                            }
                        } else {
                            arg4.method2123((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field4149);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field4692 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field4693 || var37 > arg4.field4693 || var45 > arg4.field4693;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field4699 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field581 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method2133((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field582 & 16777215, var93 | var11.field576 & 16777215, var93 | var11.field579 & 16777215, arg3.field4149, var16, var17, var19, var11.field581);
                                    return;
                                }
                                if (var88) {
                                    arg4.field4699 = 100;
                                }
                                arg4.method2125((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class397.method2463(var16 << 24 | arg3.field4149, var11.field582, (byte) -10), class397.method2463(var17 << 24 | arg3.field4149, var11.field576, (byte) -10), class397.method2463(var19 << 24 | arg3.field4149, var11.field579, (byte) -10));
                                arg4.field4699 = 0;
                                return;
                            }
                            if (var11.field581 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method2133((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field582 & 16777215, var94 | var11.field576 & 16777215, var94 | var11.field579 & 16777215, 0, 0, 0, 0, var11.field581);
                                return;
                            }
                            if (var88) {
                                arg4.field4699 = 100;
                            }
                            arg4.method2125((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field582, var11.field576, var11.field579);
                            arg4.field4699 = 0;
                            return;
                        }
                        arg4.method2123((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field4149);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field4692 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field4693 || var45 > arg4.field4693 || var37 > arg4.field4693;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field4699 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field581 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method2133((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field574 & 16777215, var96 | var11.field579 & 16777215, var96 | var11.field576 & 16777215, arg3.field4149, var18, var19, var17, var11.field581);
                                } else {
                                    if (var88) {
                                        arg4.field4699 = 100;
                                    }
                                    arg4.method2125((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class397.method2463(var18 << 24 | arg3.field4149, var11.field574, (byte) -10), class397.method2463(var19 << 24 | arg3.field4149, var11.field579, (byte) -10), class397.method2463(var17 << 24 | arg3.field4149, var11.field576, (byte) -10));
                                    arg4.field4699 = 0;
                                }
                            } else if (var11.field581 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method2133((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field574 & 16777215, var97 | var11.field579 & 16777215, var97 | var11.field576 & 16777215, 0, 0, 0, 0, var11.field581);
                            } else {
                                if (var88) {
                                    arg4.field4699 = 100;
                                }
                                arg4.method2125((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field574, var11.field579, var11.field576);
                                arg4.field4699 = 0;
                            }
                        } else {
                            arg4.method2123((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field4149);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field4692 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field4693 || var37 > arg4.field4693 || var45 > arg4.field4693;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field4699 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field581 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method2133((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field582 & 16777215, var99 | var11.field576 & 16777215, var99 | var11.field579 & 16777215, arg3.field4149, var16, var17, var19, var11.field581);
                                    return;
                                }
                                if (var88) {
                                    arg4.field4699 = 100;
                                }
                                arg4.method2125((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class397.method2463(var16 << 24 | arg3.field4149, var11.field582, (byte) -10), class397.method2463(var17 << 24 | arg3.field4149, var11.field576, (byte) -10), class397.method2463(var19 << 24 | arg3.field4149, var11.field579, (byte) -10));
                                arg4.field4699 = 0;
                                return;
                            }
                            if (var11.field581 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method2133((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field582 & 16777215, var100 | var11.field576 & 16777215, var100 | var11.field579 & 16777215, 0, 0, 0, 0, var11.field581);
                                return;
                            }
                            if (var88) {
                                arg4.field4699 = 100;
                            }
                            arg4.method2125((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field582, var11.field576, var11.field579);
                            arg4.field4699 = 0;
                            return;
                        }
                        arg4.method2123((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field4149);
                    }
                }
            }
        } else {
            class507 var101 = this.field2129[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field7231 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field2133 == -1) {
                    for (int var102 = 0; var102 < var101.field7225; ++var102) {
                        int var103 = (arg0 << super.field3915) + var101.field7226[var102];
                        int var104 = var101.field7232[var102];
                        int var105 = (arg1 << super.field3915) + var101.field7224[var102];
                        float var106 = (float) var105 * this.field2144 + (float) var103 * this.field2141 + (float) var104 * this.field2135 + this.field2137;
                        if (var106 <= (float) this.field2136.field5333) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field4152);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field7227[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field4143) {
                            int var109 = (int) (var106 - (float) arg3.field4152);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field2145 + (float) var103 * this.field2143 + (float) var104 * this.field2134 + this.field2147;
                        float var111 = (float) var105 * this.field2128 + (float) var103 * this.field2127 + (float) var104 * this.field2140 + this.field2138;
                        arg5[var102] = (int) ((float) this.field2136.field5312 * var110 / var106) + arg4.field4694;
                        arg6[var102] = (int) ((float) this.field2136.field5349 * var111 / var106) + arg4.field4701;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field7225; ++var112) {
                        int var152 = (arg0 << super.field3915) + var101.field7226[var112];
                        int var153 = var101.field7232[var112];
                        int var154 = (arg1 << super.field3915) + var101.field7224[var112];
                        float var155 = (float) var154 * this.field2144 + (float) var152 * this.field2141 + (float) var153 * this.field2135 + this.field2137;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field2133 - arg3.field4152;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field7227[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field4143) {
                            int var158 = this.field2133 - arg3.field4152;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field2145 + (float) var152 * this.field2143 + (float) var153 * this.field2134 + this.field2147;
                        float var160 = (float) var154 * this.field2128 + (float) var152 * this.field2127 + (float) var153 * this.field2140 + this.field2138;
                        arg5[var112] = (int) ((float) this.field2136.field5312 * var159 / (float) this.field2133) + arg4.field4694;
                        arg6[var112] = (int) ((float) this.field2136.field5349 * var160 / (float) this.field2133) + arg4.field4701;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field7228 != null) {
                    if (this.field2133 == -1) {
                        for (int var113 = 0; var113 < var101.field7229; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field4692 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field4693 || var118 > arg4.field4693 || var119 > arg4.field4693;
                                short var124 = var101.field7228[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method1083(this.field2136.field1084.method1154(-108, var124).field7711)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method2133((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field7226[var114] / (float) super.field3920, (float) var101.field7226[var115] / (float) super.field3920, (float) var101.field7226[var116] / (float) super.field3920, (float) var101.field7224[var114] / (float) super.field3920, (float) var101.field7224[var115] / (float) super.field3920, (float) var101.field7224[var116] / (float) super.field3920, var125 | var101.field7234[var114] & 16777215, var125 | var101.field7234[var115] & 16777215, var125 | var101.field7234[var116] & 16777215, arg3.field4149, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field7234[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method1083(this.field2136.field1084.method1154(-120, var124).field7711)) {
                                                arg4.field4699 = -1694498816;
                                            }
                                            arg4.method2125((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class397.method2463(arg8[var114] << 24 | arg3.field4149, var101.field7234[var114], (byte) -10), class397.method2463(arg8[var115] << 24 | arg3.field4149, var101.field7234[var115], (byte) -10), class397.method2463(arg8[var116] << 24 | arg3.field4149, var101.field7234[var116], (byte) -10));
                                            arg4.field4699 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method1083(this.field2136.field1084.method1154(-115, var124).field7711)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method2133((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field7226[var114] / (float) super.field3920, (float) var101.field7226[var115] / (float) super.field3920, (float) var101.field7226[var116] / (float) super.field3920, (float) var101.field7224[var114] / (float) super.field3920, (float) var101.field7224[var115] / (float) super.field3920, (float) var101.field7224[var116] / (float) super.field3920, var126 | var101.field7234[var114] & 16777215, var126 | var101.field7234[var115] & 16777215, var126 | var101.field7234[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field7234[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method1083(this.field2136.field1084.method1154(-121, var124).field7711)) {
                                            arg4.field4699 = -1694498816;
                                        }
                                        arg4.method2125((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field7234[var114], var101.field7234[var115], var101.field7234[var116]);
                                        arg4.field4699 = 0;
                                    }
                                } else {
                                    arg4.method2123((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field4149);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field7229; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field4692 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field4693 || var132 > arg4.field4693 || var133 > arg4.field4693;
                            short var138 = var101.field7228[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method1083(this.field2136.field1084.method1154(-118, var138).field7711)) {
                                    arg4.field4699 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method1083(this.field2136.field1084.method1154(-105, var138).field7711)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method2133((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field7226[var128] / (float) super.field3920, (float) var101.field7226[var129] / (float) super.field3920, (float) var101.field7226[var130] / (float) super.field3920, (float) var101.field7224[var128] / (float) super.field3920, (float) var101.field7224[var129] / (float) super.field3920, (float) var101.field7224[var130] / (float) super.field3920, var139 | var101.field7234[var128] & 16777215, var139 | var101.field7234[var129] & 16777215, var139 | var101.field7234[var130] & 16777215, arg3.field4149, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field7234[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method1083(this.field2136.field1084.method1154(-119, var138).field7711)) {
                                            arg4.field4699 = -1694498816;
                                        }
                                        arg4.method2125((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class397.method2463(arg8[var128] << 24 | arg3.field4149, var101.field7234[var128], (byte) -10), class397.method2463(arg8[var129] << 24 | arg3.field4149, var101.field7234[var129], (byte) -10), class397.method2463(arg8[var130] << 24 | arg3.field4149, var101.field7234[var130], (byte) -10));
                                        arg4.field4699 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method1083(this.field2136.field1084.method1154(-127, var138).field7711)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method2133((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field7226[var128] / (float) super.field3920, (float) var101.field7226[var129] / (float) super.field3920, (float) var101.field7226[var130] / (float) super.field3920, (float) var101.field7224[var128] / (float) super.field3920, (float) var101.field7224[var129] / (float) super.field3920, (float) var101.field7224[var130] / (float) super.field3920, var140 | var101.field7234[var128] & 16777215, var140 | var101.field7234[var129] & 16777215, var140 | var101.field7234[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field7234[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method1083(this.field2136.field1084.method1154(-121, var138).field7711)) {
                                        arg4.field4699 = -1694498816;
                                    }
                                    arg4.method2125((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field7234[var128], var101.field7234[var129], var101.field7234[var130]);
                                    arg4.field4699 = 0;
                                }
                                arg4.field4699 = 0;
                            } else {
                                arg4.method2123((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field4149);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field7229; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field4692 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field4693 || var146 > arg4.field4693 || var147 > arg4.field4693;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field7234[var142] & 16777215) != 0) {
                                    arg4.method2125((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class136.method1074(arg3.field4149, var101.field7234[var142], (byte) 125, arg8[var142]), class136.method1074(arg3.field4149, var101.field7234[var143], (byte) 117, arg8[var143]), class136.method1074(arg3.field4149, var101.field7234[var144], (byte) 120, arg8[var144]));
                                }
                            } else if ((var101.field7234[var142] & 16777215) != 0) {
                                arg4.method2125((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field7234[var142], var101.field7234[var143], var101.field7234[var144]);
                            }
                        } else {
                            arg4.method2123((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field4149);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 995)
    public final void method1077(int arg0, int arg1) {
        this.method1087(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[[ZZI)V", line = 999)
    public final void method1078(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class102 var7 = this.field2136.field5323;
        this.field2133 = -1;
        this.field2143 = var7.field1698;
        this.field2134 = var7.field1703;
        this.field2145 = var7.field1691;
        this.field2147 = var7.field1712;
        this.field2127 = var7.field1718;
        this.field2140 = var7.field1695;
        this.field2128 = var7.field1704;
        this.field2138 = var7.field1711;
        this.field2141 = var7.field1705;
        this.field2135 = var7.field1720;
        this.field2144 = var7.field1692;
        this.field2137 = var7.field1708;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3924 && var11 >= 0 && var11 < super.field3914) {
                        this.method1087(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lbh;[I)V", line = 1046)
    public final void method1079(class36 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1049)
    public final void method1080(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field2131 == null) {
            this.field2131 = new class238[super.field3924][super.field3914];
            this.field2130 = new class461[super.field3924][super.field3914];
        } else if (this.field2132 != null || this.field2146 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3920 != var20 || var21 != 0 && super.field3920 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class461 var22 = new class461();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field6638 = var23;
            var22.field6637 = new short[var23];
            var22.field6642 = new short[var23];
            var22.field6643 = new short[var23];
            var22.field6645 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field6637[var25] = (short) (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]);
                } else if (var32 == 0 && super.field3920 == var33) {
                    var22.field6637[var25] = (short) (this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]);
                } else if (super.field3920 == var32 && super.field3920 == var33) {
                    var22.field6637[var25] = (short) (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]);
                } else if (super.field3920 == var32 && var33 == 0) {
                    var22.field6637[var25] = (short) (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]) * var32 + (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]) * (super.field3920 - var32);
                    int var35 = (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]) * var32 + (this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]) * (super.field3920 - var32);
                    var22.field6637[var25] = (short) ((super.field3920 - var33) * var34 + var33 * var35 >> super.field3915 * 2);
                }
                int var36 = (arg0 << super.field3915) + var32;
                int var37 = (arg1 << super.field3915) + var33;
                var22.field6642[var25] = (short) var32;
                var22.field6645[var25] = (short) var33;
                var22.field6643[var25] = (short) (this.method1827(-3458, var36, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field6637[var25] < 2) {
                    var22.field6637[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class546 var31 = this.field2136.field1084.method1154(-118, var30);
                    if (!var31.field7705) {
                        var26 = true;
                        if (this.method1083(var31.field7711) || var31.field7714 != 0 || var31.field7712 != 0) {
                            var22.field6639 = (byte) (var22.field6639 | 4);
                        }
                    }
                }
            }
            var22.field6641 = new int[var27];
            if (arg10 != null) {
                var22.field6648 = new int[var27];
            }
            var22.field6636 = new short[var27];
            var22.field6647 = new short[var27];
            var22.field6640 = new short[var27];
            if (var26) {
                var22.field6649 = new short[var27];
                var22.field6646 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field6641[var22.field6644] = class440.method2643((byte) -101, arg9[var29]);
                    } else {
                        var22.field6641[var22.field6644] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field6648[var22.field6644] = class440.method2643((byte) -101, arg10[var29]);
                        } else {
                            var22.field6648[var22.field6644] = -1;
                        }
                    }
                    var22.field6636[var22.field6644] = (short) arg6[var29];
                    var22.field6647[var22.field6644] = (short) arg7[var29];
                    var22.field6640[var22.field6644] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field2136.field1084.method1154(-121, arg11[var29]).field7705) {
                            var22.field6649[var22.field6644] = (short) arg11[var29];
                            var22.field6646[var22.field6644] = (short) arg12[var29];
                        } else {
                            var22.field6649[var22.field6644] = -1;
                        }
                    }
                    ++var22.field6644;
                }
            }
            this.field2130[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class238 var38 = new class238();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field3362 = class706.method3959((byte) 6, this.field2139[arg0][arg1] - this.field2142[arg0][arg1], class440.method2643((byte) -101, arg10[0]));
                    if (var39 == -1) {
                        var38.field3365 = (byte) (var38.field3365 | 2);
                    }
                }
                if (super.field3916[arg0 + 1][arg1] == super.field3916[arg0][arg1] && super.field3916[arg0 + 1][arg1 + 1] == super.field3916[arg0][arg1] && super.field3916[arg0][arg1 + 1] == super.field3916[arg0][arg1]) {
                    var38.field3365 = (byte) (var38.field3365 | 1);
                }
                class546 var41 = null;
                if (var40 != -1) {
                    var41 = this.field2136.field1084.method1154(-107, var40);
                }
                if (var41 != null && (var38.field3365 & 2) == 0 && !var41.field7705) {
                    var38.field3366 = (short) (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]);
                    var38.field3360 = (short) (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]);
                    var38.field3364 = (short) (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]);
                    var38.field3361 = (short) (this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]);
                    var38.field3363 = (short) var40;
                    if (this.method1083(var41.field7711) || var41.field7714 != 0 || var41.field7712 != 0) {
                        var38.field3365 = (byte) (var38.field3365 | 4);
                    }
                } else {
                    short var42 = class440.method2643((byte) -101, var39);
                    var38.field3366 = (short) class706.method3959((byte) 6, this.field2139[arg0][arg1] - this.field2142[arg0][arg1], var42);
                    var38.field3360 = (short) class706.method3959((byte) 6, this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1], var42);
                    var38.field3364 = (short) class706.method3959((byte) 6, this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1], var42);
                    var38.field3361 = (short) class706.method3959((byte) 6, this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1], var42);
                    var38.field3363 = -1;
                }
                this.field2131[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1297)
    public final void method1081(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIII[[ZLw;Lb;[I[I)V", line = 1302)
    private final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class299 arg8, class333 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field4144;
        this.field2136.method539(false);
        arg9.field4703 = false;
        arg9.field4702 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field2132 != null) {
                        if (this.field2132[var18][var19] != null) {
                            class38 var20 = this.field2132[var18][var19];
                            if (var20.field581 != -1 && (var20.field580 & 2) == 0 && var20.field573 == 0) {
                                int var21 = this.field2136.method2383(var20.field581);
                                arg9.method2124((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var20.field574, var21), (float) class706.method3959((byte) 6, var20.field579, var21), (float) class706.method3959((byte) 6, var20.field576, var21));
                                arg9.method2124((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var20.field582, var21), (float) class706.method3959((byte) 6, var20.field576, var21), (float) class706.method3959((byte) 6, var20.field579, var21));
                            } else if (var20.field573 == 0) {
                                arg9.method2125((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field574, var20.field579, var20.field576);
                                arg9.method2125((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field582, var20.field576, var20.field579);
                            } else {
                                int var22 = var20.field573;
                                arg9.method2125((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class397.method2463(var20.field574 & -16777216, var22, (byte) -10), class397.method2463(var20.field579 & -16777216, var22, (byte) -10), class397.method2463(var20.field576 & -16777216, var22, (byte) -10));
                                arg9.method2125((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class397.method2463(var20.field582 & -16777216, var22, (byte) -10), class397.method2463(var20.field576 & -16777216, var22, (byte) -10), class397.method2463(var20.field579 & -16777216, var22, (byte) -10));
                            }
                        } else if (this.field2129[var18][var19] != null) {
                            class507 var23 = this.field2129[var18][var19];
                            for (int var24 = 0; var24 < var23.field7225; ++var24) {
                                arg10[var24] = var23.field7226[var24] * var14 / super.field3920 + var16;
                                arg11[var24] = var17 - var23.field7224[var24] * var14 / super.field3920;
                            }
                            for (int var25 = 0; var25 < var23.field7229; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field7233 != null && var23.field7233[var25] != 0 && (var23.field7228 == null || var23.field7228 != null && var23.field7228[var25] == -1)) {
                                    int var35 = var23.field7233[var25];
                                    arg9.method2125((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class397.method2463(-16777216 - (var23.field7234[var26] & -16777216), var35, (byte) -10), class397.method2463(-16777216 - (var23.field7234[var27] & -16777216), var35, (byte) -10), class397.method2463(-16777216 - (var23.field7234[var28] & -16777216), var35, (byte) -10));
                                } else if (var23.field7228 != null && var23.field7228[var25] != -1) {
                                    int var36 = this.field2136.method2383(var23.field7228[var25]);
                                    arg9.method2124((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method2125((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field7234[var26], var23.field7234[var27], var23.field7234[var28]);
                                }
                            }
                        }
                    } else if (this.field2146[var18][var19] != null) {
                        class506 var37 = this.field2146[var18][var19];
                        for (int var38 = 0; var38 < var37.field7223; ++var38) {
                            arg10[var38] = var37.field7217[var38] * var14 / super.field3920 + var16;
                            arg11[var38] = var17 - var37.field7220[var38] * var14 / super.field3920;
                        }
                        for (int var39 = 0; var39 < var37.field7213; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field7221 != null && var37.field7221[var39] != 0) {
                                int var49 = var37.field7221[var39];
                                arg9.method2125((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method2125((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field7216[var40], var37.field7216[var41], var37.field7216[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field4703 = true;
        this.field2136.method539(var15);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Luj;IIII[[I[[II)V", line = 1496)
    public class137(class381 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2136 = arg0;
        this.field2126 = arg2;
        this.field2139 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2136.field5330 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2136.field5337 * var18 + this.field2136.field5346 * var16 + this.field2136.field5343 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2139[var11][var10] = (byte) var20;
            }
        }
        this.field2142 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z", line = 1545)
    private final boolean method1083(int arg0) {
        if ((this.field2126 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(IIZLw;Lb;[I[I[I[II)V", line = 1561)
    private final void method1084(int arg0, int arg1, boolean arg2, class299 arg3, class333 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class506 var11 = this.field2146[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field2133 == -1) {
                    for (int var12 = 0; var12 < var11.field7223; ++var12) {
                        int var13 = (arg0 << super.field3915) + var11.field7217[var12];
                        int var14 = var11.field7215[var12];
                        int var15 = (arg1 << super.field3915) + var11.field7220[var12];
                        float var16 = (float) var15 * this.field2144 + (float) var13 * this.field2141 + (float) var14 * this.field2135 + this.field2137;
                        if (var16 <= (float) this.field2136.field5333) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field4152);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field7214[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field4143) {
                            int var19 = (int) (var16 - (float) arg3.field4152);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field2145 + (float) var13 * this.field2143 + (float) var14 * this.field2134 + this.field2147;
                        float var21 = (float) var15 * this.field2128 + (float) var13 * this.field2127 + (float) var14 * this.field2140 + this.field2138;
                        arg5[var12] = (int) ((float) this.field2136.field5312 * var20 / var16) + arg4.field4694;
                        arg6[var12] = (int) ((float) this.field2136.field5349 * var21 / var16) + arg4.field4701;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field7223; ++var22) {
                        int var36 = (arg0 << super.field3915) + var11.field7217[var22];
                        int var37 = var11.field7215[var22];
                        int var38 = (arg1 << super.field3915) + var11.field7220[var22];
                        float var39 = (float) var38 * this.field2144 + (float) var36 * this.field2141 + (float) var37 * this.field2135 + this.field2137;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field2133 - arg3.field4152;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field7214[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field4143) {
                            int var42 = this.field2133 - arg3.field4152;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field2145 + (float) var36 * this.field2143 + (float) var37 * this.field2134 + this.field2147;
                        float var44 = (float) var38 * this.field2128 + (float) var36 * this.field2127 + (float) var37 * this.field2140 + this.field2138;
                        arg5[var22] = (int) ((float) this.field2136.field5312 * var43 / (float) this.field2133) + arg4.field4694;
                        arg6[var22] = (int) ((float) this.field2136.field5349 * var44 / (float) this.field2133) + arg4.field4701;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3920;
                for (int var24 = 0; var24 < var11.field7213; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field4692 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field4693 || var29 > arg4.field4693 || var30 > arg4.field4693;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3915;
                            int var35 = arg1 << super.field3915;
                            if ((var11.field7216[var25] & 16777215) != 0) {
                                if (var11.field7218[var25] == var11.field7218[var26] && var11.field7218[var25] == var11.field7218[var27] && var11.field7219[var25] == var11.field7219[var26] && var11.field7219[var25] == var11.field7219[var27]) {
                                    arg4.method2133((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field7217[var25] + var34) / (float) var11.field7219[var25], (float) (var11.field7217[var26] + var34) / (float) var11.field7219[var26], (float) (var11.field7217[var27] + var34) / (float) var11.field7219[var27], (float) (var11.field7220[var25] + var35) / (float) var11.field7219[var25], (float) (var11.field7220[var26] + var35) / (float) var11.field7219[var26], (float) (var11.field7220[var27] + var35) / (float) var11.field7219[var27], var11.field7216[var25], var11.field7216[var26], var11.field7216[var27], arg3.field4149, arg8[var25], arg8[var26], arg8[var27], var11.field7218[var25]);
                                } else {
                                    arg4.method2131((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field7217[var25] + var34) / var23, (float) (var11.field7217[var26] + var34) / var23, (float) (var11.field7217[var27] + var34) / var23, (float) (var11.field7220[var25] + var35) / var23, (float) (var11.field7220[var26] + var35) / var23, (float) (var11.field7220[var27] + var35) / var23, var11.field7216[var25], var11.field7216[var26], var11.field7216[var27], arg3.field4149, arg8[var25], arg8[var26], arg8[var27], var11.field7218[var25], var23 / (float) var11.field7219[var25], var11.field7218[var26], var23 / (float) var11.field7219[var26], var11.field7218[var27], var23 / (float) var11.field7219[var27]);
                                }
                            }
                        } else {
                            arg4.method2123((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field4149);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "YA", descriptor = "()V", line = 1752)
    public final void method1085() {
        this.field2139 = null;
        this.field2142 = null;
    }

    @OriginalMember(owner = "client!fn", name = "fa", descriptor = "(IILr;)Lr;", line = 1757)
    public final class181 method1086(int arg0, int arg1, class181 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)V", line = 1761)
    private final void method1087(int arg0, int arg1, int arg2) {
        class299 var4 = this.field2136.method2384(Thread.currentThread());
        var4.field4173.field4699 = 0;
        if (this.field2132 != null) {
            this.method1076(arg0, arg1, var4.field4153, var4, var4.field4173, var4.field4167, var4.field4168, var4.field4190, var4.field4179, arg2);
        } else if (this.field2131 != null) {
            this.method1094(arg0, arg1, var4.field4173, var4.field4167, var4.field4168, var4.field4190, var4.field4179, arg2);
        } else {
            if (this.field2146 != null) {
                this.method1084(arg0, arg1, var4.field4153, var4, var4.field4173, var4.field4167, var4.field4168, var4.field4190, var4.field4179, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(IIIIIII[[ZLw;Lb;[I[I)V", line = 1777)
    private final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class299 arg8, class333 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field4144;
        this.field2136.method539(false);
        arg9.field4703 = false;
        arg9.field4702 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field2131[var18][var19] != null) {
                        class238 var20 = this.field2131[var18][var19];
                        if (var20.field3363 != -1 && (var20.field3365 & 2) == 0 && var20.field3362 == -1) {
                            int var21 = this.field2136.method2383(var20.field3363);
                            arg9.method2124((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var20.field3364 & 65535, var21), (float) class706.method3959((byte) 6, var20.field3361 & 65535, var21), (float) class706.method3959((byte) 6, var20.field3360 & 65535, var21));
                            arg9.method2124((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var20.field3366 & 65535, var21), (float) class706.method3959((byte) 6, var20.field3360 & 65535, var21), (float) class706.method3959((byte) 6, var20.field3361 & 65535, var21));
                        } else if (var20.field3362 == -1) {
                            arg9.method2124((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field3364 & 65535), (float) (var20.field3361 & 65535), (float) (var20.field3360 & 65535));
                            arg9.method2124((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field3366 & 65535), (float) (var20.field3360 & 65535), (float) (var20.field3361 & 65535));
                        } else {
                            int var22 = var20.field3362;
                            arg9.method2124((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method2124((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field2130[var18][var19] != null) {
                        class461 var23 = this.field2130[var18][var19];
                        for (int var24 = 0; var24 < var23.field6638; ++var24) {
                            arg10[var24] = var23.field6642[var24] * var14 / super.field3920 + var16;
                            arg11[var24] = var17 - var23.field6645[var24] * var14 / super.field3920;
                        }
                        for (int var25 = 0; var25 < var23.field6644; ++var25) {
                            short var26 = var23.field6636[var25];
                            short var27 = var23.field6647[var25];
                            short var28 = var23.field6640[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field6648 != null && var23.field6648[var25] != -1) {
                                int var35 = var23.field6648[var25];
                                arg9.method2124((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var23.field6637[var26], var35), (float) class706.method3959((byte) 6, var23.field6637[var27], var35), (float) class706.method3959((byte) 6, var23.field6637[var28], var35));
                            } else if (var23.field6649 != null && var23.field6649[var25] != -1) {
                                int var36 = this.field2136.method2383(var23.field6649[var25]);
                                arg9.method2124((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var23.field6637[var26], var36), (float) class706.method3959((byte) 6, var23.field6637[var27], var36), (float) class706.method3959((byte) 6, var23.field6637[var28], var36));
                            } else {
                                int var37 = var23.field6641[var25];
                                arg9.method2124((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class706.method3959((byte) 6, var23.field6637[var26], var37), (float) class706.method3959((byte) 6, var23.field6637[var27], var37), (float) class706.method3959((byte) 6, var23.field6637[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field4703 = true;
        this.field2136.method539(var15);
    }

    @OriginalMember(owner = "client!fn", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1911)
    public final void method1089(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)I", line = 1917)
    private static final int method1090(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1951)
    public final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class299 var9 = this.field2136.method2384(Thread.currentThread());
        class333 var10 = var9.field4173;
        var10.field4699 = 0;
        var10.field4692 = true;
        this.field2136.method619();
        if (this.field2132 == null && this.field2146 == null) {
            if (this.field2131 != null) {
                this.method1088(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field4167, var9.field4168);
            }
        } else {
            this.method1082(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field4167, var9.field4168);
        }
    }

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1967)
    public final void method1092(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field2126 & 32) == 0;
        if (this.field2132 == null && !var15) {
            this.field2132 = new class38[super.field3924][super.field3914];
            this.field2129 = new class507[super.field3924][super.field3914];
        } else if (this.field2146 == null && var15) {
            this.field2146 = new class506[super.field3924][super.field3914];
        } else if (this.field2131 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class428.field5989[class440.method2643((byte) -101, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class428.field5989[class440.method2643((byte) -101, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class506 var18 = new class506();
                var18.field7223 = (short) arg2.length;
                var18.field7213 = (short) (arg2.length / 3);
                var18.field7217 = new short[var18.field7223];
                var18.field7215 = new short[var18.field7223];
                var18.field7220 = new short[var18.field7223];
                var18.field7216 = new int[var18.field7223];
                var18.field7218 = new short[var18.field7223];
                var18.field7219 = new short[var18.field7223];
                var18.field7222 = new byte[var18.field7223];
                if (arg5 != null) {
                    var18.field7214 = new short[var18.field7223];
                }
                for (int var19 = 0; var19 < var18.field7223; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field2139[arg0][arg1] - this.field2142[arg0][arg1];
                    } else if (var22 == 0 && super.field3920 == var23) {
                        var25 = this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1];
                    } else if (super.field3920 == var22 && super.field3920 == var23) {
                        var25 = this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1];
                    } else if (super.field3920 == var22 && var23 == 0) {
                        var25 = this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]) * var22 + (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]) * (super.field3920 - var22);
                        int var27 = (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]) * var22 + (this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]) * (super.field3920 - var22);
                        var25 = (super.field3920 - var23) * var26 + var23 * var27 >> super.field3915 * 2;
                    }
                    int var28 = (arg0 << super.field3915) + var22;
                    int var29 = (arg1 << super.field3915) + var23;
                    var18.field7217[var19] = (short) var22;
                    var18.field7220[var19] = (short) var23;
                    var18.field7215[var19] = (short) (this.method1827(-3458, var28, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field7216[var19] = 0;
                        if (arg7 != null) {
                            var18.field7222[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field7214[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method1083(this.field2136.field1084.method1154(-116, arg8[var19]).field7711)) {
                            var32 = -1694498816;
                        }
                        var18.field7216[var19] = var32 | class136.method1074(arg10, method1090(arg6[var19] >> 8, var25), (byte) 92, var30);
                        if (arg7 != null) {
                            var18.field7222[var19] = (byte) var25;
                        }
                    }
                    var18.field7218[var19] = (short) arg8[var19];
                    var18.field7219[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field7221 = new int[var18.field7213];
                }
                for (int var20 = 0; var20 < var18.field7213; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field7221[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field2146[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field3920 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3920 && arg4[var38] == super.field3920) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3920) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3920 != arg2[var40] && arg2[0] - super.field3920 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3920 != arg4[var40] && arg4[0] - super.field3920 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class38 var41 = new class38();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field573 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field580 = (byte) (var41.field580 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3916[arg0 + 1][arg1] == super.field3916[arg0][arg1] && super.field3916[arg0 + 1][arg1 + 1] == super.field3916[arg0][arg1] && super.field3916[arg0][arg1 + 1] == super.field3916[arg0][arg1]) {
                        var41.field580 = (byte) (var41.field580 | 1);
                    }
                    if (var43 != -1 && (var41.field580 & 2) == 0 && !this.field2136.field1084.method1154(-115, var43).field7705) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field582 = class136.method1074(arg10, method1090(arg6[var34] >> 8, this.field2139[arg0][arg1] - this.field2142[arg0][arg1]), (byte) 119, var44);
                        if (var41.field573 != 0) {
                            var41.field582 |= 255 - (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field576 = class136.method1074(arg10, method1090(arg6[var35] >> 8, this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]), (byte) 127, var45);
                        if (var41.field573 != 0) {
                            var41.field576 |= 255 - (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field574 = class136.method1074(arg10, method1090(arg6[var36] >> 8, this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]), (byte) 117, var46);
                        if (var41.field573 != 0) {
                            var41.field574 |= 255 - (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field579 = class136.method1074(arg10, method1090(arg6[var37] >> 8, this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]), (byte) 98, var47);
                        var41.field581 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field582 = class136.method1074(arg10, method1090(arg6[var34] >> 8, this.field2139[arg0][arg1] - this.field2142[arg0][arg1]), (byte) 83, var48);
                        if (var41.field573 != 0) {
                            var41.field582 |= 255 - (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field576 = class136.method1074(arg10, method1090(arg6[var35] >> 8, this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]), (byte) 122, var49);
                        if (var41.field573 != 0) {
                            var41.field576 |= 255 - (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field574 = class136.method1074(arg10, method1090(arg6[var36] >> 8, this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]), (byte) 121, var50);
                        if (var41.field573 != 0) {
                            var41.field574 |= 255 - (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field579 = class136.method1074(arg10, method1090(arg6[var37] >> 8, this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]), (byte) 112, var51);
                        if (var41.field573 != 0) {
                            var41.field579 |= 255 - (this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]) << 25;
                        }
                        var41.field581 = -1;
                    }
                    if (arg5 != null) {
                        var41.field583 = (short) arg5[var36];
                        var41.field575 = (short) arg5[var37];
                        var41.field577 = (short) arg5[var35];
                        var41.field578 = (short) arg5[var34];
                    }
                    this.field2132[arg0][arg1] = var41;
                } else {
                    class507 var52 = new class507();
                    var52.field7225 = (short) arg2.length;
                    var52.field7229 = (short) (arg2.length / 3);
                    var52.field7226 = new short[var52.field7225];
                    var52.field7232 = new short[var52.field7225];
                    var52.field7224 = new short[var52.field7225];
                    var52.field7234 = new int[var52.field7225];
                    if (arg5 != null) {
                        var52.field7227 = new short[var52.field7225];
                    }
                    for (int var53 = 0; var53 < var52.field7225; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field2139[arg0][arg1] - this.field2142[arg0][arg1];
                        } else if (var68 == 0 && super.field3920 == var69) {
                            var71 = this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1];
                        } else if (super.field3920 == var68 && super.field3920 == var69) {
                            var71 = this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1];
                        } else if (super.field3920 == var68 && var69 == 0) {
                            var71 = this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field2139[arg0 + 1][arg1] - this.field2142[arg0 + 1][arg1]) * var68 + (this.field2139[arg0][arg1] - this.field2142[arg0][arg1]) * (super.field3920 - var68);
                            int var73 = (this.field2139[arg0 + 1][arg1 + 1] - this.field2142[arg0 + 1][arg1 + 1]) * var68 + (this.field2139[arg0][arg1 + 1] - this.field2142[arg0][arg1 + 1]) * (super.field3920 - var68);
                            var71 = (super.field3920 - var69) * var72 + var69 * var73 >> super.field3915 * 2;
                        }
                        int var74 = (arg0 << super.field3915) + var68;
                        int var75 = (arg1 << super.field3915) + var69;
                        var52.field7226[var53] = (short) var68;
                        var52.field7224[var53] = (short) var69;
                        var52.field7232[var53] = (short) (this.method1827(-3458, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field7234[var53] = var71 << 25;
                            } else {
                                var52.field7234[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field7227[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field7234[var53] = class136.method1074(arg10, method1090(arg6[var53] >> 8, var71), (byte) 88, var76);
                            if (arg7 != null) {
                                var52.field7234[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field7229; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field2136.field1084.method1154(-111, arg8[var55 * 3]).field7705) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field7233 = new int[var52.field7229];
                    }
                    if (var54) {
                        var52.field7228 = new short[var52.field7229];
                        var52.field7230 = new short[var52.field7229];
                    }
                    for (int var56 = 0; var56 < var52.field7229; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field7233[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field2136.field1084.method1154(-109, var62).field7705) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field2136.field1084.method1154(-102, var63).field7705) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field2136.field1084.method1154(-128, var64).field7705) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field7228[var56] = (short) var64;
                                var52.field7230[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field2136.field1084.method1154(-107, var65).field7705) {
                                        var52.field7234[var57] = class428.field5989[class440.method2643((byte) -101, this.field2136.field1084.method1154(-125, var65).field7703 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field2136.field1084.method1154(-125, var66).field7705) {
                                        var52.field7234[var58] = class428.field5989[class440.method2643((byte) -101, this.field2136.field1084.method1154(-106, var66).field7703 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field2136.field1084.method1154(-123, var67).field7705) {
                                        var52.field7234[var59] = class428.field5989[class440.method2643((byte) -101, this.field2136.field1084.method1154(-109, var67).field7703 & 65535) & 65535];
                                    }
                                }
                                var52.field7228[var56] = -1;
                            }
                        }
                    }
                    this.field2129[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "ka", descriptor = "(III)V", line = 2671)
    public final void method1093(int arg0, int arg1, int arg2) {
        if (this.field2142[arg0][arg1] < arg2) {
            this.field2142[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILb;[I[I[I[II)V", line = 2677)
    private final void method1094(int arg0, int arg1, class333 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class238 var9 = this.field2131[arg0][arg1];
        if (var9 != null) {
            if ((var9.field3365 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field3365 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3920 * arg0;
                int var11 = super.field3920 + var10;
                int var12 = super.field3920 * arg1;
                int var13 = super.field3920 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field3365 & 1) != 0) {
                    int var14 = super.field3916[arg0][arg1];
                    float var15 = (float) var14 * this.field2135;
                    if (this.field2133 == -1) {
                        var16 = (float) var12 * this.field2144 + (float) var10 * this.field2141 + var15 + this.field2137;
                        if (var16 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var17 = (float) var12 * this.field2144 + (float) var11 * this.field2141 + var15 + this.field2137;
                        if (var17 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var18 = (float) var13 * this.field2144 + (float) var11 * this.field2141 + var15 + this.field2137;
                        if (var18 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var19 = (float) var13 * this.field2144 + (float) var10 * this.field2141 + var15 + this.field2137;
                        if (var19 <= (float) this.field2136.field5333) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field2144 + (float) var10 * this.field2141 + var15 + this.field2137;
                        var17 = (float) var12 * this.field2144 + (float) var11 * this.field2141 + var15 + this.field2137;
                        var18 = (float) var13 * this.field2144 + (float) var11 * this.field2141 + var15 + this.field2137;
                        var19 = (float) var13 * this.field2144 + (float) var10 * this.field2141 + var15 + this.field2137;
                    }
                    float var20 = (float) var14 * this.field2134;
                    float var21 = (float) var14 * this.field2140;
                    if (this.field2133 == -1) {
                        float var22 = (float) var12 * this.field2145 + (float) var10 * this.field2143 + var20 + this.field2147;
                        var23 = (int) ((float) this.field2136.field5312 * var22 / var16) + arg2.field4694;
                        float var24 = (float) var12 * this.field2128 + (float) var10 * this.field2127 + var21 + this.field2138;
                        var25 = (int) ((float) this.field2136.field5349 * var24 / var16) + arg2.field4701;
                        float var26 = (float) var12 * this.field2145 + (float) var11 * this.field2143 + var20 + this.field2147;
                        var27 = (int) ((float) this.field2136.field5312 * var26 / var17) + arg2.field4694;
                        float var28 = (float) var12 * this.field2128 + (float) var11 * this.field2127 + var21 + this.field2138;
                        var29 = (int) ((float) this.field2136.field5349 * var28 / var17) + arg2.field4701;
                        float var30 = (float) var13 * this.field2145 + (float) var11 * this.field2143 + var20 + this.field2147;
                        var31 = (int) ((float) this.field2136.field5312 * var30 / var18) + arg2.field4694;
                        float var32 = (float) var13 * this.field2128 + (float) var11 * this.field2127 + var21 + this.field2138;
                        var33 = (int) ((float) this.field2136.field5349 * var32 / var18) + arg2.field4701;
                        float var34 = (float) var13 * this.field2145 + (float) var10 * this.field2143 + var20 + this.field2147;
                        var35 = (int) ((float) this.field2136.field5312 * var34 / var19) + arg2.field4694;
                        float var36 = (float) var13 * this.field2128 + (float) var10 * this.field2127 + var21 + this.field2138;
                        var37 = (int) ((float) this.field2136.field5349 * var36 / var19) + arg2.field4701;
                    } else {
                        float var38 = (float) var12 * this.field2145 + (float) var10 * this.field2143 + var20 + this.field2147;
                        var23 = (int) ((float) this.field2136.field5312 * var38 / (float) this.field2133) + arg2.field4694;
                        float var39 = (float) var12 * this.field2128 + (float) var10 * this.field2127 + var21 + this.field2138;
                        var25 = (int) ((float) this.field2136.field5349 * var39 / (float) this.field2133) + arg2.field4701;
                        float var40 = (float) var12 * this.field2145 + (float) var11 * this.field2143 + var20 + this.field2147;
                        var27 = (int) ((float) this.field2136.field5312 * var40 / (float) this.field2133) + arg2.field4694;
                        float var41 = (float) var12 * this.field2128 + (float) var11 * this.field2127 + var21 + this.field2138;
                        var29 = (int) ((float) this.field2136.field5349 * var41 / (float) this.field2133) + arg2.field4701;
                        float var42 = (float) var13 * this.field2145 + (float) var11 * this.field2143 + var20 + this.field2147;
                        var31 = (int) ((float) this.field2136.field5312 * var42 / (float) this.field2133) + arg2.field4694;
                        float var43 = (float) var13 * this.field2128 + (float) var11 * this.field2127 + var21 + this.field2138;
                        var33 = (int) ((float) this.field2136.field5349 * var43 / (float) this.field2133) + arg2.field4701;
                        float var44 = (float) var13 * this.field2145 + (float) var10 * this.field2143 + var20 + this.field2147;
                        var35 = (int) ((float) this.field2136.field5312 * var44 / (float) this.field2133) + arg2.field4694;
                        float var45 = (float) var13 * this.field2128 + (float) var10 * this.field2127 + var21 + this.field2138;
                        var37 = (int) ((float) this.field2136.field5349 * var45 / (float) this.field2133) + arg2.field4701;
                    }
                } else {
                    int var46 = super.field3916[arg0][arg1];
                    int var47 = super.field3916[arg0 + 1][arg1];
                    int var48 = super.field3916[arg0 + 1][arg1 + 1];
                    int var49 = super.field3916[arg0][arg1 + 1];
                    if (this.field2133 == -1) {
                        var16 = (float) var12 * this.field2144 + (float) var10 * this.field2141 + (float) var46 * this.field2135 + this.field2137;
                        if (var16 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var17 = (float) var12 * this.field2144 + (float) var11 * this.field2141 + (float) var47 * this.field2135 + this.field2137;
                        if (var17 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var18 = (float) var13 * this.field2144 + (float) var11 * this.field2141 + (float) var48 * this.field2135 + this.field2137;
                        if (var18 <= (float) this.field2136.field5333) {
                            return;
                        }
                        var19 = (float) var13 * this.field2144 + (float) var10 * this.field2141 + (float) var49 * this.field2135 + this.field2137;
                        if (var19 <= (float) this.field2136.field5333) {
                            return;
                        }
                        float var50 = (float) var12 * this.field2145 + (float) var10 * this.field2143 + (float) var46 * this.field2134 + this.field2147;
                        var23 = (int) ((float) this.field2136.field5312 * var50 / var16) + arg2.field4694;
                        float var51 = (float) var12 * this.field2128 + (float) var10 * this.field2127 + (float) var46 * this.field2140 + this.field2138;
                        var25 = (int) ((float) this.field2136.field5349 * var51 / var16) + arg2.field4701;
                        float var52 = (float) var12 * this.field2145 + (float) var11 * this.field2143 + (float) var47 * this.field2134 + this.field2147;
                        var27 = (int) ((float) this.field2136.field5312 * var52 / var17) + arg2.field4694;
                        float var53 = (float) var12 * this.field2128 + (float) var11 * this.field2127 + (float) var47 * this.field2140 + this.field2138;
                        var29 = (int) ((float) this.field2136.field5349 * var53 / var17) + arg2.field4701;
                        float var54 = (float) var13 * this.field2145 + (float) var11 * this.field2143 + (float) var48 * this.field2134 + this.field2147;
                        var31 = (int) ((float) this.field2136.field5312 * var54 / var18) + arg2.field4694;
                        float var55 = (float) var13 * this.field2128 + (float) var11 * this.field2127 + (float) var48 * this.field2140 + this.field2138;
                        var33 = (int) ((float) this.field2136.field5349 * var55 / var18) + arg2.field4701;
                        float var56 = (float) var13 * this.field2145 + (float) var10 * this.field2143 + (float) var49 * this.field2134 + this.field2147;
                        var35 = (int) ((float) this.field2136.field5312 * var56 / var19) + arg2.field4694;
                        float var57 = (float) var13 * this.field2128 + (float) var10 * this.field2127 + (float) var49 * this.field2140 + this.field2138;
                        var37 = (int) ((float) this.field2136.field5349 * var57 / var19) + arg2.field4701;
                    } else {
                        var16 = (float) var12 * this.field2144 + (float) var10 * this.field2141 + (float) var46 * this.field2135 + this.field2137;
                        var17 = (float) var12 * this.field2144 + (float) var11 * this.field2141 + (float) var47 * this.field2135 + this.field2137;
                        var18 = (float) var13 * this.field2144 + (float) var11 * this.field2141 + (float) var48 * this.field2135 + this.field2137;
                        var19 = (float) var13 * this.field2144 + (float) var10 * this.field2141 + (float) var49 * this.field2135 + this.field2137;
                        float var58 = (float) var12 * this.field2145 + (float) var10 * this.field2143 + (float) var46 * this.field2134 + this.field2147;
                        var23 = (int) ((float) this.field2136.field5312 * var58 / (float) this.field2133) + arg2.field4694;
                        float var59 = (float) var12 * this.field2128 + (float) var10 * this.field2127 + (float) var46 * this.field2140 + this.field2138;
                        var25 = (int) ((float) this.field2136.field5349 * var59 / (float) this.field2133) + arg2.field4701;
                        float var60 = (float) var12 * this.field2145 + (float) var11 * this.field2143 + (float) var47 * this.field2134 + this.field2147;
                        var27 = (int) ((float) this.field2136.field5312 * var60 / (float) this.field2133) + arg2.field4694;
                        float var61 = (float) var12 * this.field2128 + (float) var11 * this.field2127 + (float) var47 * this.field2140 + this.field2138;
                        var29 = (int) ((float) this.field2136.field5349 * var61 / (float) this.field2133) + arg2.field4701;
                        float var62 = (float) var13 * this.field2145 + (float) var11 * this.field2143 + (float) var48 * this.field2134 + this.field2147;
                        var31 = (int) ((float) this.field2136.field5312 * var62 / (float) this.field2133) + arg2.field4694;
                        float var63 = (float) var13 * this.field2128 + (float) var11 * this.field2127 + (float) var48 * this.field2140 + this.field2138;
                        var33 = (int) ((float) this.field2136.field5349 * var63 / (float) this.field2133) + arg2.field4701;
                        float var64 = (float) var13 * this.field2145 + (float) var10 * this.field2143 + (float) var49 * this.field2134 + this.field2147;
                        var35 = (int) ((float) this.field2136.field5312 * var64 / (float) this.field2133) + arg2.field4694;
                        float var65 = (float) var13 * this.field2128 + (float) var10 * this.field2127 + (float) var49 * this.field2140 + this.field2138;
                        var37 = (int) ((float) this.field2136.field5349 * var65 / (float) this.field2133) + arg2.field4701;
                    }
                }
                if (this.field2133 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field4692 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field4693 || var35 > arg2.field4693 || var27 > arg2.field4693;
                        if (var9.field3363 >= 0) {
                            arg2.method2133((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class428.field5989[var9.field3364 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3361 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3360 & 65535] & 16777215, 0, 0, 0, 0, var9.field3363);
                        } else {
                            arg2.method2124((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field3364 & 65535), (float) (var9.field3361 & 65535), (float) (var9.field3360 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field4692 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field4693 || var27 > arg2.field4693 || var35 > arg2.field4693;
                        if (var9.field3363 >= 0) {
                            arg2.method2133((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class428.field5989[var9.field3366 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3360 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3361 & 65535] & 16777215, 0, 0, 0, 0, var9.field3363);
                            return;
                        }
                        arg2.method2124((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field3366 & 65535), (float) (var9.field3360 & 65535), (float) (var9.field3361 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field4692 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field4693 || var35 > arg2.field4693 || var27 > arg2.field4693;
                        if (var9.field3363 >= 0) {
                            arg2.method2133((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class428.field5989[var9.field3364 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3361 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3360 & 65535] & 16777215, 0, 0, 0, 0, var9.field3363);
                        } else {
                            arg2.method2124((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field3364 & 65535), (float) (var9.field3361 & 65535), (float) (var9.field3360 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field4692 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field4693 || var27 > arg2.field4693 || var35 > arg2.field4693;
                        if (var9.field3363 >= 0) {
                            arg2.method2133((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class428.field5989[var9.field3366 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3360 & 65535] & 16777215, -16777216 | class428.field5989[var9.field3361 & 65535] & 16777215, 0, 0, 0, 0, var9.field3363);
                            return;
                        }
                        arg2.method2124((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field3366 & 65535), (float) (var9.field3360 & 65535), (float) (var9.field3361 & 65535));
                    }
                }
            }
        } else {
            class461 var66 = this.field2130[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field6639 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field2133 == -1) {
                    for (int var67 = 0; var67 < var66.field6638; ++var67) {
                        int var68 = (arg0 << super.field3915) + var66.field6642[var67];
                        short var69 = var66.field6643[var67];
                        int var70 = (arg1 << super.field3915) + var66.field6645[var67];
                        float var71 = (float) var70 * this.field2144 + (float) var68 * this.field2141 + (float) var69 * this.field2135 + this.field2137;
                        if (var71 <= (float) this.field2136.field5333) {
                            return;
                        }
                        float var72 = (float) var70 * this.field2145 + (float) var68 * this.field2143 + (float) var69 * this.field2134 + this.field2147;
                        float var73 = (float) var70 * this.field2128 + (float) var68 * this.field2127 + (float) var69 * this.field2140 + this.field2138;
                        arg3[var67] = (int) ((float) this.field2136.field5312 * var72 / var71) + arg2.field4694;
                        arg4[var67] = (int) ((float) this.field2136.field5349 * var73 / var71) + arg2.field4701;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field6638; ++var74) {
                        int var110 = (arg0 << super.field3915) + var66.field6642[var74];
                        short var111 = var66.field6643[var74];
                        int var112 = (arg1 << super.field3915) + var66.field6645[var74];
                        float var113 = (float) var112 * this.field2144 + (float) var110 * this.field2141 + (float) var111 * this.field2135 + this.field2137;
                        float var114 = (float) var112 * this.field2145 + (float) var110 * this.field2143 + (float) var111 * this.field2134 + this.field2147;
                        float var115 = (float) var112 * this.field2128 + (float) var110 * this.field2127 + (float) var111 * this.field2140 + this.field2138;
                        arg3[var74] = (int) ((float) this.field2136.field5312 * var114 / (float) this.field2133) + arg2.field4694;
                        arg4[var74] = (int) ((float) this.field2136.field5349 * var115 / (float) this.field2133) + arg2.field4701;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field6649 != null) {
                    if (this.field2133 == -1) {
                        for (int var75 = 0; var75 < var66.field6644; ++var75) {
                            short var76 = var66.field6636[var75];
                            short var77 = var66.field6647[var75];
                            short var78 = var66.field6640[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field4692 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field4693 || var80 > arg2.field4693 || var81 > arg2.field4693;
                                short var85 = var66.field6649[var75];
                                if (var85 != -1) {
                                    arg2.method2133((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field6642[var76] / (float) super.field3920, (float) var66.field6642[var77] / (float) super.field3920, (float) var66.field6642[var78] / (float) super.field3920, (float) var66.field6645[var76] / (float) super.field3920, (float) var66.field6645[var77] / (float) super.field3920, (float) var66.field6645[var78] / (float) super.field3920, -16777216 | class428.field5989[var66.field6637[var76] & 65535] & 16777215, -16777216 | class428.field5989[var66.field6637[var77] & 65535] & 16777215, -16777216 | class428.field5989[var66.field6637[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field6641[var75];
                                    if (var86 != -1) {
                                        arg2.method2124((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class706.method3959((byte) 6, var66.field6637[var76], var86), (float) class706.method3959((byte) 6, var66.field6637[var77], var86), (float) class706.method3959((byte) 6, var66.field6637[var78], var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field6644; ++var87) {
                        short var88 = var66.field6636[var87];
                        short var89 = var66.field6647[var87];
                        short var90 = var66.field6640[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field4692 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field4693 || var92 > arg2.field4693 || var93 > arg2.field4693;
                            short var97 = var66.field6649[var87];
                            if (var97 != -1) {
                                arg2.method2133((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field6642[var88] / (float) super.field3920, (float) var66.field6642[var89] / (float) super.field3920, (float) var66.field6642[var90] / (float) super.field3920, (float) var66.field6645[var88] / (float) super.field3920, (float) var66.field6645[var89] / (float) super.field3920, (float) var66.field6645[var90] / (float) super.field3920, -16777216 | class428.field5989[var66.field6637[var88] & 65535] & 16777215, -16777216 | class428.field5989[var66.field6637[var89] & 65535] & 16777215, -16777216 | class428.field5989[var66.field6637[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field6641[var87];
                                if (var98 != -1) {
                                    arg2.method2124((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class706.method3959((byte) 6, var66.field6637[var88], var98), (float) class706.method3959((byte) 6, var66.field6637[var89], var98), (float) class706.method3959((byte) 6, var66.field6637[var90], var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field6644; ++var99) {
                    short var100 = var66.field6636[var99];
                    short var101 = var66.field6647[var99];
                    short var102 = var66.field6640[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field6641[var99];
                        if (var109 != -1) {
                            arg2.field4692 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field4693 || var104 > arg2.field4693 || var105 > arg2.field4693;
                            arg2.method2124((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class706.method3959((byte) 6, var66.field6637[var100], var109), (float) class706.method3959((byte) 6, var66.field6637[var101], var109), (float) class706.method3959((byte) 6, var66.field6637[var102], var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 3154)
    public final boolean method1095(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[[ZZII)V", line = 3162)
    public final void method1096(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class102 var8 = this.field2136.field5323;
        this.field2133 = arg5;
        this.field2143 = var8.field1698;
        this.field2134 = var8.field1703;
        this.field2145 = var8.field1691;
        this.field2147 = var8.field1712;
        this.field2127 = var8.field1718;
        this.field2140 = var8.field1695;
        this.field2128 = var8.field1704;
        this.field2138 = var8.field1711;
        this.field2141 = var8.field1705;
        this.field2135 = var8.field1720;
        this.field2144 = var8.field1692;
        this.field2137 = var8.field1708;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3924 && var12 >= 0 && var12 < super.field3914) {
                        this.method1087(var11, var12, arg6);
                    }
                }
            }
        }
    }
}
