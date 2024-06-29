import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class114 extends class55 {

    @OriginalMember(owner = "client!t", name = "ob", descriptor = "Z")
    public static boolean field2826 = true;

    @OriginalMember(owner = "client!t", name = "tb", descriptor = "[I")
    public static int[] field2831 = new int[2048];

    @OriginalMember(owner = "client!t", name = "pb", descriptor = "[I")
    public static int[] field2827 = new int[65536];

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "Z")
    private static boolean field2823 = false;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "[I")
    public static int[] field2821 = new int[2048];

    @OriginalMember(owner = "client!t", name = "yb", descriptor = "Z")
    private static boolean field2836 = false;

    @OriginalMember(owner = "client!t", name = "xb", descriptor = "[I")
    public static int[] field2835 = new int[2048];

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "client!t", name = "rb", descriptor = "Z")
    public static boolean field2829 = false;

    @OriginalMember(owner = "client!t", name = "ub", descriptor = "[I")
    private static int[] field2832 = new int[512];

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!t", name = "qb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!t", name = "sb", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!t", name = "vb", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!t", name = "zb", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!t", name = "Bb", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!t", name = "Cb", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!t", name = "Ab", descriptor = "Lmd;")
    public static class76 field2838;

    @OriginalMember(owner = "client!t", name = "wb", descriptor = "[I")
    private static int[] field2834;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2832[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2821[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2831[var2] = (int) (Math.sin((double) var2 * 0.0030679615D) * 65536.0D);
            field2835[var2] = (int) (Math.cos((double) var2 * 0.0030679615D) * 65536.0D);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V", line = 4)
    private static final void method902(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (arg5 >= arg6) {
            return;
        }
        int var16;
        int var17;
        int var18;
        if (field2829) {
            int var15 = (arg8 - arg7) / (arg6 - arg5);
            if (arg6 > field2830) {
                arg6 = field2830;
            }
            if (arg5 < 0) {
                arg7 -= arg5 * var15;
                arg5 = 0;
            }
            if (arg5 >= arg6) {
                return;
            }
            var16 = arg6 - arg5 >> 3;
            var17 = var15 << 12;
            var18 = arg7 << 9;
        } else {
            if (arg6 - arg5 > 7) {
                var16 = arg6 - arg5 >> 3;
                var17 = (arg8 - arg7) * field2832[var16] >> 6;
            } else {
                var16 = 0;
                var17 = 0;
            }
            var18 = arg7 << 9;
        }
        int var19 = arg4 + arg5;
        if (!field2823) {
            int var78 = 0;
            int var79 = 0;
            int var80 = arg5 - field2839;
            int var81 = (arg12 >> 3) * var80 + arg9;
            int var82 = (arg13 >> 3) * var80 + arg10;
            int var83 = (arg14 >> 3) * var80 + arg11;
            int var84 = var83 >> 14;
            if (var84 != 0) {
                arg2 = var81 / var84;
                arg3 = var82 / var84;
                if (arg2 < 0) {
                    arg2 = 0;
                } else if (arg2 > 16256) {
                    arg2 = 16256;
                }
            }
            int var85 = arg12 + var81;
            int var86 = arg13 + var82;
            int var87 = arg14 + var83;
            int var88 = var87 >> 14;
            if (var88 != 0) {
                var78 = var85 / var88;
                var79 = var86 / var88;
                if (var78 < 7) {
                    var78 = 7;
                } else if (var78 > 16256) {
                    var78 = 16256;
                }
            }
            int var89 = var78 - arg2 >> 3;
            int var90 = var79 - arg3 >> 3;
            int var91 = (var18 & 0x600000) + arg2;
            int var92 = var18 >> 23;
            if (field2836) {
                while (var16-- > 0) {
                    arg0[var19++] = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92;
                    int var94 = var89 + var91;
                    int var95 = arg3 + var90;
                    arg0[var19++] = arg1[(var94 >> 7) + (var95 & 0x3F80)] >>> var92;
                    int var96 = var89 + var94;
                    int var97 = var90 + var95;
                    arg0[var19++] = arg1[(var96 >> 7) + (var97 & 0x3F80)] >>> var92;
                    int var98 = var89 + var96;
                    int var99 = var90 + var97;
                    arg0[var19++] = arg1[(var98 >> 7) + (var99 & 0x3F80)] >>> var92;
                    int var100 = var89 + var98;
                    int var101 = var90 + var99;
                    arg0[var19++] = arg1[(var100 >> 7) + (var101 & 0x3F80)] >>> var92;
                    int var102 = var89 + var100;
                    int var103 = var90 + var101;
                    arg0[var19++] = arg1[(var102 >> 7) + (var103 & 0x3F80)] >>> var92;
                    int var104 = var89 + var102;
                    int var105 = var90 + var103;
                    arg0[var19++] = arg1[(var104 >> 7) + (var105 & 0x3F80)] >>> var92;
                    int var106 = var89 + var104;
                    int var107 = var90 + var105;
                    arg0[var19++] = arg1[(var106 >> 7) + (var107 & 0x3F80)] >>> var92;
                    int var108 = var78;
                    arg3 = var79;
                    var85 += arg12;
                    var86 += arg13;
                    var87 += arg14;
                    int var109 = var87 >> 14;
                    if (var109 != 0) {
                        var78 = var85 / var109;
                        var79 = var86 / var109;
                        if (var78 < 7) {
                            var78 = 7;
                        } else if (var78 > 16256) {
                            var78 = 16256;
                        }
                    }
                    var89 = var78 - var108 >> 3;
                    var90 = var79 - arg3 >> 3;
                    var18 += var17;
                    var91 = (var18 & 0x600000) + var108;
                    var92 = var18 >> 23;
                }
                int var93 = arg6 - arg5 & 0x7;
                while (var93-- > 0) {
                    arg0[var19++] = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92;
                    var91 += var89;
                    arg3 += var90;
                }
            } else {
                while (var16-- > 0) {
                    int var112;
                    if ((var112 = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var112;
                    }
                    var19++;
                    int var113 = var89 + var91;
                    int var114 = arg3 + var90;
                    int var115;
                    if ((var115 = arg1[(var113 >> 7) + (var114 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var115;
                    }
                    var19++;
                    int var116 = var89 + var113;
                    int var117 = var90 + var114;
                    int var118;
                    if ((var118 = arg1[(var116 >> 7) + (var117 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var118;
                    }
                    var19++;
                    int var119 = var89 + var116;
                    int var120 = var90 + var117;
                    int var121;
                    if ((var121 = arg1[(var119 >> 7) + (var120 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var121;
                    }
                    var19++;
                    int var122 = var89 + var119;
                    int var123 = var90 + var120;
                    int var124;
                    if ((var124 = arg1[(var122 >> 7) + (var123 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var124;
                    }
                    var19++;
                    int var125 = var89 + var122;
                    int var126 = var90 + var123;
                    int var127;
                    if ((var127 = arg1[(var125 >> 7) + (var126 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var127;
                    }
                    var19++;
                    int var128 = var89 + var125;
                    int var129 = var90 + var126;
                    int var130;
                    if ((var130 = arg1[(var128 >> 7) + (var129 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var130;
                    }
                    var19++;
                    int var131 = var89 + var128;
                    int var132 = var90 + var129;
                    int var133;
                    if ((var133 = arg1[(var131 >> 7) + (var132 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var133;
                    }
                    var19++;
                    int var134 = var78;
                    arg3 = var79;
                    var85 += arg12;
                    var86 += arg13;
                    var87 += arg14;
                    int var135 = var87 >> 14;
                    if (var135 != 0) {
                        var78 = var85 / var135;
                        var79 = var86 / var135;
                        if (var78 < 7) {
                            var78 = 7;
                        } else if (var78 > 16256) {
                            var78 = 16256;
                        }
                    }
                    var89 = var78 - var134 >> 3;
                    var90 = var79 - arg3 >> 3;
                    var18 += var17;
                    var91 = (var18 & 0x600000) + var134;
                    var92 = var18 >> 23;
                }
                int var110 = arg6 - arg5 & 0x7;
                while (var110-- > 0) {
                    int var111;
                    if ((var111 = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var111;
                    }
                    var19++;
                    var91 += var89;
                    arg3 += var90;
                }
            }
            return;
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = arg5 - field2839;
        int var23 = (arg12 >> 3) * var22 + arg9;
        int var24 = (arg13 >> 3) * var22 + arg10;
        int var25 = (arg14 >> 3) * var22 + arg11;
        int var26 = var25 >> 12;
        if (var26 != 0) {
            arg2 = var23 / var26;
            arg3 = var24 / var26;
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 4032) {
                arg2 = 4032;
            }
        }
        int var27 = arg12 + var23;
        int var28 = arg13 + var24;
        int var29 = arg14 + var25;
        int var30 = var29 >> 12;
        if (var30 != 0) {
            var20 = var27 / var30;
            var21 = var28 / var30;
            if (var20 < 7) {
                var20 = 7;
            } else if (var20 > 4032) {
                var20 = 4032;
            }
        }
        int var31 = var20 - arg2 >> 3;
        int var32 = var21 - arg3 >> 3;
        int var33 = (var18 >> 3 & 0xC0000) + arg2;
        int var34 = var18 >> 23;
        if (field2836) {
            while (var16-- > 0) {
                arg0[var19++] = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34;
                int var36 = var31 + var33;
                int var37 = arg3 + var32;
                arg0[var19++] = arg1[(var36 >> 6) + (var37 & 0xFC0)] >>> var34;
                int var38 = var31 + var36;
                int var39 = var32 + var37;
                arg0[var19++] = arg1[(var38 >> 6) + (var39 & 0xFC0)] >>> var34;
                int var40 = var31 + var38;
                int var41 = var32 + var39;
                arg0[var19++] = arg1[(var40 >> 6) + (var41 & 0xFC0)] >>> var34;
                int var42 = var31 + var40;
                int var43 = var32 + var41;
                arg0[var19++] = arg1[(var42 >> 6) + (var43 & 0xFC0)] >>> var34;
                int var44 = var31 + var42;
                int var45 = var32 + var43;
                arg0[var19++] = arg1[(var44 >> 6) + (var45 & 0xFC0)] >>> var34;
                int var46 = var31 + var44;
                int var47 = var32 + var45;
                arg0[var19++] = arg1[(var46 >> 6) + (var47 & 0xFC0)] >>> var34;
                int var48 = var31 + var46;
                int var49 = var32 + var47;
                arg0[var19++] = arg1[(var48 >> 6) + (var49 & 0xFC0)] >>> var34;
                int var50 = var20;
                arg3 = var21;
                var27 += arg12;
                var28 += arg13;
                var29 += arg14;
                int var51 = var29 >> 12;
                if (var51 != 0) {
                    var20 = var27 / var51;
                    var21 = var28 / var51;
                    if (var20 < 7) {
                        var20 = 7;
                    } else if (var20 > 4032) {
                        var20 = 4032;
                    }
                }
                var31 = var20 - var50 >> 3;
                var32 = var21 - arg3 >> 3;
                var18 += var17;
                var33 = (var18 >> 3 & 0xC0000) + var50;
                var34 = var18 >> 23;
            }
            int var35 = arg6 - arg5 & 0x7;
            while (var35-- > 0) {
                arg0[var19++] = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34;
                var33 += var31;
                arg3 += var32;
            }
            return;
        }
        while (var16-- > 0) {
            int var54;
            if ((var54 = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var54;
            }
            var19++;
            int var55 = var31 + var33;
            int var56 = arg3 + var32;
            int var57;
            if ((var57 = arg1[(var55 >> 6) + (var56 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var57;
            }
            var19++;
            int var58 = var31 + var55;
            int var59 = var32 + var56;
            int var60;
            if ((var60 = arg1[(var58 >> 6) + (var59 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var60;
            }
            var19++;
            int var61 = var31 + var58;
            int var62 = var32 + var59;
            int var63;
            if ((var63 = arg1[(var61 >> 6) + (var62 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var63;
            }
            var19++;
            int var64 = var31 + var61;
            int var65 = var32 + var62;
            int var66;
            if ((var66 = arg1[(var64 >> 6) + (var65 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var66;
            }
            var19++;
            int var67 = var31 + var64;
            int var68 = var32 + var65;
            int var69;
            if ((var69 = arg1[(var67 >> 6) + (var68 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var69;
            }
            var19++;
            int var70 = var31 + var67;
            int var71 = var32 + var68;
            int var72;
            if ((var72 = arg1[(var70 >> 6) + (var71 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var72;
            }
            var19++;
            int var73 = var31 + var70;
            int var74 = var32 + var71;
            int var75;
            if ((var75 = arg1[(var73 >> 6) + (var74 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var75;
            }
            var19++;
            int var76 = var20;
            arg3 = var21;
            var27 += arg12;
            var28 += arg13;
            var29 += arg14;
            int var77 = var29 >> 12;
            if (var77 != 0) {
                var20 = var27 / var77;
                var21 = var28 / var77;
                if (var20 < 7) {
                    var20 = 7;
                } else if (var20 > 4032) {
                    var20 = 4032;
                }
            }
            var31 = var20 - var76 >> 3;
            var32 = var21 - arg3 >> 3;
            var18 += var17;
            var33 = (var18 >> 3 & 0xC0000) + var76;
            var34 = var18 >> 23;
        }
        int var52 = arg6 - arg5 & 0x7;
        while (var52-- > 0) {
            int var53;
            if ((var53 = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var53;
            }
            var19++;
            var33 += var31;
            arg3 += var32;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()[I", line = 488)
    public static final int[] method903() {
        return field2834;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIIIIII)V", line = 496)
    private static final void method904(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (field2826) {
            int var9;
            int var10;
            int var11;
            if (field2829) {
                int var8;
                if (arg5 - arg4 > 3) {
                    var8 = (arg7 - arg6) / (arg5 - arg4);
                } else {
                    var8 = 0;
                }
                if (arg5 > field2830) {
                    arg5 = field2830;
                }
                if (arg4 < 0) {
                    arg6 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg4 >= arg5) {
                    return;
                }
                var9 = arg1 + arg4;
                var10 = arg5 - arg4 >> 2;
                var11 = var8 << 2;
            } else if (arg4 < arg5) {
                var9 = arg1 + arg4;
                var10 = arg5 - arg4 >> 2;
                if (var10 > 0) {
                    var11 = (arg7 - arg6) * field2832[var10] >> 15;
                } else {
                    var11 = 0;
                }
            } else {
                return;
            }
            if (field2822 == 0) {
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var12 = arg5 - arg4 & 0x3;
                        if (var12 > 0) {
                            int var13 = field2827[arg6 >> 8];
                            do {
                                arg0[var9++] = var13;
                                var12--;
                            } while (var12 > 0);
                            return;
                        }
                        break;
                    }
                    int var14 = field2827[arg6 >> 8];
                    arg6 += var11;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                }
            } else {
                int var15 = field2822;
                int var16 = 256 - field2822;
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var17 = arg5 - arg4 & 0x3;
                        if (var17 > 0) {
                            int var18 = field2827[arg6 >> 8];
                            int var19 = ((var18 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var18 & 0xFF00) * var16 >> 8 & 0xFF00);
                            do {
                                arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var19;
                                var17--;
                            } while (var17 > 0);
                        }
                        break;
                    }
                    int var20 = field2827[arg6 >> 8];
                    arg6 += var11;
                    int var21 = ((var20 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var16 >> 8 & 0xFF00);
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                }
            }
        } else if (arg4 < arg5) {
            int var22 = (arg7 - arg6) / (arg5 - arg4);
            if (field2829) {
                if (arg5 > field2830) {
                    arg5 = field2830;
                }
                if (arg4 < 0) {
                    arg6 -= arg4 * var22;
                    arg4 = 0;
                }
                if (arg4 >= arg5) {
                    return;
                }
            }
            int var23 = arg1 + arg4;
            int var24 = arg5 - arg4;
            if (field2822 == 0) {
                do {
                    arg0[var23++] = field2827[arg6 >> 8];
                    arg6 += var22;
                    var24--;
                } while (var24 > 0);
            } else {
                int var25 = field2822;
                int var26 = 256 - field2822;
                do {
                    int var27 = field2827[arg6 >> 8];
                    arg6 += var22;
                    int var28 = ((var27 & 0xFF00FF) * var26 >> 8 & 0xFF00FF) + ((var27 & 0xFF00) * var26 >> 8 & 0xFF00);
                    arg0[var23++] = ((arg0[var23] & 0xFF00) * var25 >> 8 & 0xFF00) + ((arg0[var23] & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + var28;
                    var24--;
                } while (var24 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(D)V", line = 647)
    public static final void method905(double arg0) {
        method914(arg0, 0, 512);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I)[I", line = 652)
    public static final int[] method906(int[] arg0) {
        return method917(class55.field1377, class55.field1375, class55.field1379, class55.field1378, arg0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I", line = 657)
    private static final int method907(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * (127 - arg1) >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V", line = 676)
    public static final void method908(int arg0, int arg1) {
        int var2 = field2834[0];
        int var3 = var2 / class55.field1381;
        int var4 = var2 - class55.field1381 * var3;
        field2839 = arg0 - var4;
        field2840 = arg1 - var3;
        field2828 = -field2839;
        field2837 = field2830 - field2839;
        field2824 = -field2840;
        field2833 = field2825 - field2840;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()V", line = 689)
    public static final void method909() {
        field2839 = field2830 / 2;
        field2840 = field2825 / 2;
        field2828 = -field2839;
        field2837 = field2830 - field2839;
        field2824 = -field2840;
        field2833 = field2825 - field2840;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIIII)V", line = 701)
    private static final void method910(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field2829) {
            if (arg5 > field2830) {
                arg5 = field2830;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var6 = arg1 + arg4;
        int var7 = arg5 - arg4 >> 2;
        if (field2822 == 0) {
            while (true) {
                var7--;
                if (var7 < 0) {
                    int var8 = arg5 - arg4 & 0x3;
                    while (true) {
                        var8--;
                        if (var8 < 0) {
                            return;
                        }
                        arg0[var6++] = arg2;
                    }
                }
                arg0[var6++] = arg2;
                arg0[var6++] = arg2;
                arg0[var6++] = arg2;
                arg0[var6++] = arg2;
            }
        }
        int var9 = field2822;
        int var10 = 256 - field2822;
        int var11 = ((arg2 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var10 >> 8 & 0xFF00);
        while (true) {
            var7--;
            if (var7 < 0) {
                int var12 = arg5 - arg4 & 0x3;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        return;
                    }
                    arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
                }
            }
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "()V", line = 759)
    public static void method911() {
        field2834 = null;
        field2827 = null;
        field2838 = null;
        field2832 = null;
        field2821 = null;
        field2831 = null;
        field2835 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)V", line = 770)
    public static final void method912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        if (arg0 != arg1) {
            var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var8 = 0;
        if (arg1 != arg2) {
            var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var9 = 0;
        if (arg0 != arg2) {
            var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < field2825) {
                if (arg1 > field2825) {
                    arg1 = field2825;
                }
                if (arg2 > field2825) {
                    arg2 = field2825;
                }
                if (arg1 < arg2) {
                    int var10;
                    int var11 = var10 = arg3 << 16;
                    if (arg0 < 0) {
                        var11 -= arg0 * var9;
                        var10 -= arg0 * var7;
                        arg0 = 0;
                    }
                    int var12 = arg4 << 16;
                    if (arg1 < 0) {
                        var12 -= arg1 * var8;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
                        int var13 = arg2 - arg1;
                        int var14 = arg1 - arg0;
                        int var15 = field2834[arg0];
                        while (true) {
                            var14--;
                            if (var14 < 0) {
                                while (true) {
                                    var13--;
                                    if (var13 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var15, arg6, 0, var11 >> 16, var12 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var15 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var15, arg6, 0, var11 >> 16, var10 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var15 += class55.field1381;
                        }
                    } else {
                        int var16 = arg2 - arg1;
                        int var17 = arg1 - arg0;
                        int var18 = field2834[arg0];
                        while (true) {
                            var17--;
                            if (var17 < 0) {
                                while (true) {
                                    var16--;
                                    if (var16 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var18, arg6, 0, var12 >> 16, var11 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var18 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var18, arg6, 0, var10 >> 16, var11 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var18 += class55.field1381;
                        }
                    }
                } else {
                    int var19;
                    int var20 = var19 = arg3 << 16;
                    if (arg0 < 0) {
                        var20 -= arg0 * var9;
                        var19 -= arg0 * var7;
                        arg0 = 0;
                    }
                    int var21 = arg5 << 16;
                    if (arg2 < 0) {
                        var21 -= arg2 * var8;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var9 < var7 || arg0 == arg2 && var8 > var7) {
                        int var22 = arg1 - arg2;
                        int var23 = arg2 - arg0;
                        int var24 = field2834[arg0];
                        while (true) {
                            var23--;
                            if (var23 < 0) {
                                while (true) {
                                    var22--;
                                    if (var22 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var24, arg6, 0, var21 >> 16, var19 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var24 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var24, arg6, 0, var20 >> 16, var19 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var24 += class55.field1381;
                        }
                    } else {
                        int var25 = arg1 - arg2;
                        int var26 = arg2 - arg0;
                        int var27 = field2834[arg0];
                        while (true) {
                            var26--;
                            if (var26 < 0) {
                                while (true) {
                                    var25--;
                                    if (var25 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var27, arg6, 0, var19 >> 16, var21 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var27 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var27, arg6, 0, var19 >> 16, var20 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var27 += class55.field1381;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field2825) {
                if (arg2 > field2825) {
                    arg2 = field2825;
                }
                if (arg0 > field2825) {
                    arg0 = field2825;
                }
                if (arg2 < arg0) {
                    int var28;
                    int var29 = var28 = arg4 << 16;
                    if (arg1 < 0) {
                        var29 -= arg1 * var7;
                        var28 -= arg1 * var8;
                        arg1 = 0;
                    }
                    int var30 = arg5 << 16;
                    if (arg2 < 0) {
                        var30 -= arg2 * var9;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
                        int var31 = arg0 - arg2;
                        int var32 = arg2 - arg1;
                        int var33 = field2834[arg1];
                        while (true) {
                            var32--;
                            if (var32 < 0) {
                                while (true) {
                                    var31--;
                                    if (var31 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var33, arg6, 0, var29 >> 16, var30 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var33 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var33, arg6, 0, var29 >> 16, var28 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var33 += class55.field1381;
                        }
                    } else {
                        int var34 = arg0 - arg2;
                        int var35 = arg2 - arg1;
                        int var36 = field2834[arg1];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var36, arg6, 0, var30 >> 16, var29 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var36 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var36, arg6, 0, var28 >> 16, var29 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var36 += class55.field1381;
                        }
                    }
                } else {
                    int var37;
                    int var38 = var37 = arg4 << 16;
                    if (arg1 < 0) {
                        var38 -= arg1 * var7;
                        var37 -= arg1 * var8;
                        arg1 = 0;
                    }
                    int var39 = arg3 << 16;
                    if (arg0 < 0) {
                        var39 -= arg0 * var9;
                        arg0 = 0;
                    }
                    if (var7 < var8) {
                        int var40 = arg2 - arg0;
                        int var41 = arg0 - arg1;
                        int var42 = field2834[arg1];
                        while (true) {
                            var41--;
                            if (var41 < 0) {
                                while (true) {
                                    var40--;
                                    if (var40 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var42, arg6, 0, var39 >> 16, var37 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var42 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var42, arg6, 0, var38 >> 16, var37 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var42 += class55.field1381;
                        }
                    } else {
                        int var43 = arg2 - arg0;
                        int var44 = arg0 - arg1;
                        int var45 = field2834[arg1];
                        while (true) {
                            var44--;
                            if (var44 < 0) {
                                while (true) {
                                    var43--;
                                    if (var43 < 0) {
                                        return;
                                    }
                                    method910(class55.field1380, var45, arg6, 0, var37 >> 16, var39 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var45 += class55.field1381;
                                }
                            }
                            method910(class55.field1380, var45, arg6, 0, var37 >> 16, var38 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var45 += class55.field1381;
                        }
                    }
                }
            }
        } else if (arg2 < field2825) {
            if (arg0 > field2825) {
                arg0 = field2825;
            }
            if (arg1 > field2825) {
                arg1 = field2825;
            }
            if (arg0 < arg1) {
                int var46;
                int var47 = var46 = arg5 << 16;
                if (arg2 < 0) {
                    var47 -= arg2 * var8;
                    var46 -= arg2 * var9;
                    arg2 = 0;
                }
                int var48 = arg3 << 16;
                if (arg0 < 0) {
                    var48 -= arg0 * var7;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var49 = arg1 - arg0;
                    int var50 = arg0 - arg2;
                    int var51 = field2834[arg2];
                    while (true) {
                        var50--;
                        if (var50 < 0) {
                            while (true) {
                                var49--;
                                if (var49 < 0) {
                                    return;
                                }
                                method910(class55.field1380, var51, arg6, 0, var47 >> 16, var48 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var51 += class55.field1381;
                            }
                        }
                        method910(class55.field1380, var51, arg6, 0, var47 >> 16, var46 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var51 += class55.field1381;
                    }
                } else {
                    int var52 = arg1 - arg0;
                    int var53 = arg0 - arg2;
                    int var54 = field2834[arg2];
                    while (true) {
                        var53--;
                        if (var53 < 0) {
                            while (true) {
                                var52--;
                                if (var52 < 0) {
                                    return;
                                }
                                method910(class55.field1380, var54, arg6, 0, var48 >> 16, var47 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var54 += class55.field1381;
                            }
                        }
                        method910(class55.field1380, var54, arg6, 0, var46 >> 16, var47 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var54 += class55.field1381;
                    }
                }
            } else {
                int var55;
                int var56 = var55 = arg5 << 16;
                if (arg2 < 0) {
                    var56 -= arg2 * var8;
                    var55 -= arg2 * var9;
                    arg2 = 0;
                }
                int var57 = arg4 << 16;
                if (arg1 < 0) {
                    var57 -= arg1 * var7;
                    arg1 = 0;
                }
                if (var8 < var9) {
                    int var58 = arg0 - arg1;
                    int var59 = arg1 - arg2;
                    int var60 = field2834[arg2];
                    while (true) {
                        var59--;
                        if (var59 < 0) {
                            while (true) {
                                var58--;
                                if (var58 < 0) {
                                    return;
                                }
                                method910(class55.field1380, var60, arg6, 0, var57 >> 16, var55 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var60 += class55.field1381;
                            }
                        }
                        method910(class55.field1380, var60, arg6, 0, var56 >> 16, var55 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var60 += class55.field1381;
                    }
                } else {
                    int var61 = arg0 - arg1;
                    int var62 = arg1 - arg2;
                    int var63 = field2834[arg2];
                    while (true) {
                        var62--;
                        if (var62 < 0) {
                            while (true) {
                                var61--;
                                if (var61 < 0) {
                                    return;
                                }
                                method910(class55.field1380, var63, arg6, 0, var55 >> 16, var57 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var63 += class55.field1381;
                            }
                        }
                        method910(class55.field1380, var63, arg6, 0, var55 >> 16, var56 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var63 += class55.field1381;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lmd;)V", line = 1219)
    public static final void method913(class76 arg0) {
        field2838 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(DII)V", line = 1227)
    private static final void method914(double arg0, int arg1, int arg2) {
        double var4 = arg0 + Math.random() * 0.03D - 0.015D;
        int var6 = arg1 * 128;
        for (int var7 = arg1; var7 < arg2; var7++) {
            double var8 = (double) (var7 >> 3) / 64.0D + 0.0078125D;
            double var10 = (double) (var7 & 0x7) / 8.0D + 0.0625D;
            for (int var12 = 0; var12 < 128; var12++) {
                double var13 = (double) var12 / 128.0D;
                double var15 = var13;
                double var17 = var13;
                double var19 = var13;
                if (var10 != 0.0D) {
                    double var21;
                    if (var13 < 0.5D) {
                        var21 = (var10 + 1.0D) * var13;
                    } else {
                        var21 = var10 + var13 - var10 * var13;
                    }
                    double var23 = var13 * 2.0D - var21;
                    double var25 = var8 + 0.3333333333333333D;
                    if (var25 > 1.0D) {
                        var25--;
                    }
                    double var29 = var8 - 0.3333333333333333D;
                    if (var29 < 0.0D) {
                        var29++;
                    }
                    if (var25 * 6.0D < 1.0D) {
                        var15 = (var21 - var23) * 6.0D * var25 + var23;
                    } else if (var25 * 2.0D < 1.0D) {
                        var15 = var21;
                    } else if (var25 * 3.0D < 2.0D) {
                        var15 = (var21 - var23) * (0.6666666666666666D - var25) * 6.0D + var23;
                    } else {
                        var15 = var23;
                    }
                    if (var8 * 6.0D < 1.0D) {
                        var17 = (var21 - var23) * 6.0D * var8 + var23;
                    } else if (var8 * 2.0D < 1.0D) {
                        var17 = var21;
                    } else if (var8 * 3.0D < 2.0D) {
                        var17 = (var21 - var23) * (0.6666666666666666D - var8) * 6.0D + var23;
                    } else {
                        var17 = var23;
                    }
                    if (var29 * 6.0D < 1.0D) {
                        var19 = (var21 - var23) * 6.0D * var29 + var23;
                    } else if (var29 * 2.0D < 1.0D) {
                        var19 = var21;
                    } else if (var29 * 3.0D < 2.0D) {
                        var19 = (var21 - var23) * (0.6666666666666666D - var29) * 6.0D + var23;
                    } else {
                        var19 = var23;
                    }
                }
                int var31 = (int) (var15 * 256.0D);
                int var32 = (int) (var17 * 256.0D);
                int var33 = (int) (var19 * 256.0D);
                int var34 = (var31 << 16) + (var32 << 8) + var33;
                int var35 = method915(var34, var4);
                if (var35 == 0) {
                    var35 = 1;
                }
                field2827[var6++] = var35;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ID)I", line = 1338)
    public static final int method915(int arg0, double arg1) {
        double var3 = (double) (arg0 >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = Math.pow(var3, arg1);
        double var11 = Math.pow(var5, arg1);
        double var13 = Math.pow(var7, arg1);
        int var15 = (int) (var9 * 256.0D);
        int var16 = (int) (var11 * 256.0D);
        int var17 = (int) (var13 * 256.0D);
        return (var15 << 16) + (var16 << 8) + var17;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIII)V", line = 1356)
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        int var10 = 0;
        if (arg0 != arg1) {
            var9 = (arg4 - arg3 << 16) / (arg1 - arg0);
            var10 = (arg7 - arg6 << 15) / (arg1 - arg0);
        }
        int var11 = 0;
        int var12 = 0;
        if (arg1 != arg2) {
            var11 = (arg5 - arg4 << 16) / (arg2 - arg1);
            var12 = (arg8 - arg7 << 15) / (arg2 - arg1);
        }
        int var13 = 0;
        int var14 = 0;
        if (arg0 != arg2) {
            var13 = (arg3 - arg5 << 16) / (arg0 - arg2);
            var14 = (arg6 - arg8 << 15) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < field2825) {
                if (arg1 > field2825) {
                    arg1 = field2825;
                }
                if (arg2 > field2825) {
                    arg2 = field2825;
                }
                if (arg1 < arg2) {
                    int var15;
                    int var16 = var15 = arg3 << 16;
                    int var17;
                    int var18 = var17 = arg6 << 15;
                    if (arg0 < 0) {
                        var16 -= arg0 * var13;
                        var15 -= arg0 * var9;
                        var18 -= arg0 * var14;
                        var17 -= arg0 * var10;
                        arg0 = 0;
                    }
                    int var19 = arg4 << 16;
                    int var20 = arg7 << 15;
                    if (arg1 < 0) {
                        var19 -= arg1 * var11;
                        var20 -= arg1 * var12;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var13 < var9 || arg0 == arg1 && var13 > var11) {
                        int var21 = arg2 - arg1;
                        int var22 = arg1 - arg0;
                        int var23 = field2834[arg0];
                        while (true) {
                            var22--;
                            if (var22 < 0) {
                                while (true) {
                                    var21--;
                                    if (var21 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var23, 0, 0, var16 >> 16, var19 >> 16, var18 >> 7, var20 >> 7);
                                    var16 += var13;
                                    var19 += var11;
                                    var18 += var14;
                                    var20 += var12;
                                    var23 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var23, 0, 0, var16 >> 16, var15 >> 16, var18 >> 7, var17 >> 7);
                            var16 += var13;
                            var15 += var9;
                            var18 += var14;
                            var17 += var10;
                            var23 += class55.field1381;
                        }
                    } else {
                        int var24 = arg2 - arg1;
                        int var25 = arg1 - arg0;
                        int var26 = field2834[arg0];
                        while (true) {
                            var25--;
                            if (var25 < 0) {
                                while (true) {
                                    var24--;
                                    if (var24 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var26, 0, 0, var19 >> 16, var16 >> 16, var20 >> 7, var18 >> 7);
                                    var16 += var13;
                                    var19 += var11;
                                    var18 += var14;
                                    var20 += var12;
                                    var26 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var26, 0, 0, var15 >> 16, var16 >> 16, var17 >> 7, var18 >> 7);
                            var16 += var13;
                            var15 += var9;
                            var18 += var14;
                            var17 += var10;
                            var26 += class55.field1381;
                        }
                    }
                } else {
                    int var27;
                    int var28 = var27 = arg3 << 16;
                    int var29;
                    int var30 = var29 = arg6 << 15;
                    if (arg0 < 0) {
                        var28 -= arg0 * var13;
                        var27 -= arg0 * var9;
                        var30 -= arg0 * var14;
                        var29 -= arg0 * var10;
                        arg0 = 0;
                    }
                    int var31 = arg5 << 16;
                    int var32 = arg8 << 15;
                    if (arg2 < 0) {
                        var31 -= arg2 * var11;
                        var32 -= arg2 * var12;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var13 < var9 || arg0 == arg2 && var11 > var9) {
                        int var33 = arg1 - arg2;
                        int var34 = arg2 - arg0;
                        int var35 = field2834[arg0];
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var35, 0, 0, var31 >> 16, var27 >> 16, var32 >> 7, var29 >> 7);
                                    var31 += var11;
                                    var27 += var9;
                                    var32 += var12;
                                    var29 += var10;
                                    var35 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var35, 0, 0, var28 >> 16, var27 >> 16, var30 >> 7, var29 >> 7);
                            var28 += var13;
                            var27 += var9;
                            var30 += var14;
                            var29 += var10;
                            var35 += class55.field1381;
                        }
                    } else {
                        int var36 = arg1 - arg2;
                        int var37 = arg2 - arg0;
                        int var38 = field2834[arg0];
                        while (true) {
                            var37--;
                            if (var37 < 0) {
                                while (true) {
                                    var36--;
                                    if (var36 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var38, 0, 0, var27 >> 16, var31 >> 16, var29 >> 7, var32 >> 7);
                                    var31 += var11;
                                    var27 += var9;
                                    var32 += var12;
                                    var29 += var10;
                                    var38 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var38, 0, 0, var27 >> 16, var28 >> 16, var29 >> 7, var30 >> 7);
                            var28 += var13;
                            var27 += var9;
                            var30 += var14;
                            var29 += var10;
                            var38 += class55.field1381;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field2825) {
                if (arg2 > field2825) {
                    arg2 = field2825;
                }
                if (arg0 > field2825) {
                    arg0 = field2825;
                }
                if (arg2 < arg0) {
                    int var39;
                    int var40 = var39 = arg4 << 16;
                    int var41;
                    int var42 = var41 = arg7 << 15;
                    if (arg1 < 0) {
                        var40 -= arg1 * var9;
                        var39 -= arg1 * var11;
                        var42 -= arg1 * var10;
                        var41 -= arg1 * var12;
                        arg1 = 0;
                    }
                    int var43 = arg5 << 16;
                    int var44 = arg8 << 15;
                    if (arg2 < 0) {
                        var43 -= arg2 * var13;
                        var44 -= arg2 * var14;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var9 < var11 || arg1 == arg2 && var9 > var13) {
                        int var45 = arg0 - arg2;
                        int var46 = arg2 - arg1;
                        int var47 = field2834[arg1];
                        while (true) {
                            var46--;
                            if (var46 < 0) {
                                while (true) {
                                    var45--;
                                    if (var45 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var47, 0, 0, var40 >> 16, var43 >> 16, var42 >> 7, var44 >> 7);
                                    var40 += var9;
                                    var43 += var13;
                                    var42 += var10;
                                    var44 += var14;
                                    var47 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var47, 0, 0, var40 >> 16, var39 >> 16, var42 >> 7, var41 >> 7);
                            var40 += var9;
                            var39 += var11;
                            var42 += var10;
                            var41 += var12;
                            var47 += class55.field1381;
                        }
                    } else {
                        int var48 = arg0 - arg2;
                        int var49 = arg2 - arg1;
                        int var50 = field2834[arg1];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var50, 0, 0, var43 >> 16, var40 >> 16, var44 >> 7, var42 >> 7);
                                    var40 += var9;
                                    var43 += var13;
                                    var42 += var10;
                                    var44 += var14;
                                    var50 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var50, 0, 0, var39 >> 16, var40 >> 16, var41 >> 7, var42 >> 7);
                            var40 += var9;
                            var39 += var11;
                            var42 += var10;
                            var41 += var12;
                            var50 += class55.field1381;
                        }
                    }
                } else {
                    int var51;
                    int var52 = var51 = arg4 << 16;
                    int var53;
                    int var54 = var53 = arg7 << 15;
                    if (arg1 < 0) {
                        var52 -= arg1 * var9;
                        var51 -= arg1 * var11;
                        var54 -= arg1 * var10;
                        var53 -= arg1 * var12;
                        arg1 = 0;
                    }
                    int var55 = arg3 << 16;
                    int var56 = arg6 << 15;
                    if (arg0 < 0) {
                        var55 -= arg0 * var13;
                        var56 -= arg0 * var14;
                        arg0 = 0;
                    }
                    if (var9 < var11) {
                        int var57 = arg2 - arg0;
                        int var58 = arg0 - arg1;
                        int var59 = field2834[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var59, 0, 0, var55 >> 16, var51 >> 16, var56 >> 7, var53 >> 7);
                                    var55 += var13;
                                    var51 += var11;
                                    var56 += var14;
                                    var53 += var12;
                                    var59 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var59, 0, 0, var52 >> 16, var51 >> 16, var54 >> 7, var53 >> 7);
                            var52 += var9;
                            var51 += var11;
                            var54 += var10;
                            var53 += var12;
                            var59 += class55.field1381;
                        }
                    } else {
                        int var60 = arg2 - arg0;
                        int var61 = arg0 - arg1;
                        int var62 = field2834[arg1];
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return;
                                    }
                                    method904(class55.field1380, var62, 0, 0, var51 >> 16, var55 >> 16, var53 >> 7, var56 >> 7);
                                    var55 += var13;
                                    var51 += var11;
                                    var56 += var14;
                                    var53 += var12;
                                    var62 += class55.field1381;
                                }
                            }
                            method904(class55.field1380, var62, 0, 0, var51 >> 16, var52 >> 16, var53 >> 7, var54 >> 7);
                            var52 += var9;
                            var51 += var11;
                            var54 += var10;
                            var53 += var12;
                            var62 += class55.field1381;
                        }
                    }
                }
            }
        } else if (arg2 < field2825) {
            if (arg0 > field2825) {
                arg0 = field2825;
            }
            if (arg1 > field2825) {
                arg1 = field2825;
            }
            if (arg0 < arg1) {
                int var63;
                int var64 = var63 = arg5 << 16;
                int var65;
                int var66 = var65 = arg8 << 15;
                if (arg2 < 0) {
                    var64 -= arg2 * var11;
                    var63 -= arg2 * var13;
                    var66 -= arg2 * var12;
                    var65 -= arg2 * var14;
                    arg2 = 0;
                }
                int var67 = arg3 << 16;
                int var68 = arg6 << 15;
                if (arg0 < 0) {
                    var67 -= arg0 * var9;
                    var68 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var11 < var13) {
                    int var69 = arg1 - arg0;
                    int var70 = arg0 - arg2;
                    int var71 = field2834[arg2];
                    while (true) {
                        var70--;
                        if (var70 < 0) {
                            while (true) {
                                var69--;
                                if (var69 < 0) {
                                    return;
                                }
                                method904(class55.field1380, var71, 0, 0, var64 >> 16, var67 >> 16, var66 >> 7, var68 >> 7);
                                var64 += var11;
                                var67 += var9;
                                var66 += var12;
                                var68 += var10;
                                var71 += class55.field1381;
                            }
                        }
                        method904(class55.field1380, var71, 0, 0, var64 >> 16, var63 >> 16, var66 >> 7, var65 >> 7);
                        var64 += var11;
                        var63 += var13;
                        var66 += var12;
                        var65 += var14;
                        var71 += class55.field1381;
                    }
                } else {
                    int var72 = arg1 - arg0;
                    int var73 = arg0 - arg2;
                    int var74 = field2834[arg2];
                    while (true) {
                        var73--;
                        if (var73 < 0) {
                            while (true) {
                                var72--;
                                if (var72 < 0) {
                                    return;
                                }
                                method904(class55.field1380, var74, 0, 0, var67 >> 16, var64 >> 16, var68 >> 7, var66 >> 7);
                                var64 += var11;
                                var67 += var9;
                                var66 += var12;
                                var68 += var10;
                                var74 += class55.field1381;
                            }
                        }
                        method904(class55.field1380, var74, 0, 0, var63 >> 16, var64 >> 16, var65 >> 7, var66 >> 7);
                        var64 += var11;
                        var63 += var13;
                        var66 += var12;
                        var65 += var14;
                        var74 += class55.field1381;
                    }
                }
            } else {
                int var75;
                int var76 = var75 = arg5 << 16;
                int var77;
                int var78 = var77 = arg8 << 15;
                if (arg2 < 0) {
                    var76 -= arg2 * var11;
                    var75 -= arg2 * var13;
                    var78 -= arg2 * var12;
                    var77 -= arg2 * var14;
                    arg2 = 0;
                }
                int var79 = arg4 << 16;
                int var80 = arg7 << 15;
                if (arg1 < 0) {
                    var79 -= arg1 * var9;
                    var80 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var11 < var13) {
                    int var81 = arg0 - arg1;
                    int var82 = arg1 - arg2;
                    int var83 = field2834[arg2];
                    while (true) {
                        var82--;
                        if (var82 < 0) {
                            while (true) {
                                var81--;
                                if (var81 < 0) {
                                    return;
                                }
                                method904(class55.field1380, var83, 0, 0, var79 >> 16, var75 >> 16, var80 >> 7, var77 >> 7);
                                var79 += var9;
                                var75 += var13;
                                var80 += var10;
                                var77 += var14;
                                var83 += class55.field1381;
                            }
                        }
                        method904(class55.field1380, var83, 0, 0, var76 >> 16, var75 >> 16, var78 >> 7, var77 >> 7);
                        var76 += var11;
                        var75 += var13;
                        var78 += var12;
                        var77 += var14;
                        var83 += class55.field1381;
                    }
                } else {
                    int var84 = arg0 - arg1;
                    int var85 = arg1 - arg2;
                    int var86 = field2834[arg2];
                    while (true) {
                        var85--;
                        if (var85 < 0) {
                            while (true) {
                                var84--;
                                if (var84 < 0) {
                                    return;
                                }
                                method904(class55.field1380, var86, 0, 0, var75 >> 16, var79 >> 16, var77 >> 7, var80 >> 7);
                                var79 += var9;
                                var75 += var13;
                                var80 += var10;
                                var77 += var14;
                                var86 += class55.field1381;
                            }
                        }
                        method904(class55.field1380, var86, 0, 0, var75 >> 16, var76 >> 16, var77 >> 7, var78 >> 7);
                        var76 += var11;
                        var75 += var13;
                        var78 += var12;
                        var77 += var14;
                        var86 += class55.field1381;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII[I)[I", line = 1917)
    private static final int[] method917(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2830 = arg2 - arg0;
        field2825 = arg3 - arg1;
        if (arg4 == null) {
            int var5 = field2825;
            if (var5 == 0) {
                var5++;
            }
            field2834 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                field2834[var6] = (arg1 + var6) * class55.field1381 + arg0;
            }
        } else {
            field2834 = arg4;
        }
        method909();
        return field2834;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 1944)
    public static final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var19 = field2838.method515(arg18, (byte) 126);
        if (var19 == null) {
            int var20 = field2838.method512(arg18, true);
            method916(arg0, arg1, arg2, arg3, arg4, arg5, method907(var20, arg6), method907(var20, arg7), method907(var20, arg8));
            return;
        }
        field2823 = field2838.method516(arg18, 119);
        field2836 = field2838.method517(arg18, 26685);
        int var21 = arg9 - arg10;
        int var22 = arg12 - arg13;
        int var23 = arg15 - arg16;
        int var24 = arg11 - arg9;
        int var25 = arg14 - arg12;
        int var26 = arg17 - arg15;
        int var27 = arg12 * var24 - arg9 * var25 << 14;
        int var28 = arg15 * var25 - arg12 * var26 << 8;
        int var29 = arg9 * var26 - arg15 * var24 << 5;
        int var30 = arg12 * var21 - arg9 * var22 << 14;
        int var31 = arg15 * var22 - arg12 * var23 << 8;
        int var32 = arg9 * var23 - arg15 * var21 << 5;
        int var33 = var22 * var24 - var21 * var25 << 14;
        int var34 = var23 * var25 - var22 * var26 << 8;
        int var35 = var21 * var26 - var23 * var24 << 5;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != arg1) {
            var36 = (arg4 - arg3 << 16) / (arg1 - arg0);
            var37 = (arg7 - arg6 << 16) / (arg1 - arg0);
        }
        int var38 = 0;
        int var39 = 0;
        if (arg1 != arg2) {
            var38 = (arg5 - arg4 << 16) / (arg2 - arg1);
            var39 = (arg8 - arg7 << 16) / (arg2 - arg1);
        }
        int var40 = 0;
        int var41 = 0;
        if (arg0 != arg2) {
            var40 = (arg3 - arg5 << 16) / (arg0 - arg2);
            var41 = (arg6 - arg8 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < field2825) {
                if (arg1 > field2825) {
                    arg1 = field2825;
                }
                if (arg2 > field2825) {
                    arg2 = field2825;
                }
                if (arg1 < arg2) {
                    int var42;
                    int var43 = var42 = arg3 << 16;
                    int var44;
                    int var45 = var44 = arg6 << 16;
                    if (arg0 < 0) {
                        var43 -= arg0 * var40;
                        var42 -= arg0 * var36;
                        var45 -= arg0 * var41;
                        var44 -= arg0 * var37;
                        arg0 = 0;
                    }
                    int var46 = arg4 << 16;
                    int var47 = arg7 << 16;
                    if (arg1 < 0) {
                        var46 -= arg1 * var38;
                        var47 -= arg1 * var39;
                        arg1 = 0;
                    }
                    int var48 = arg0 - field2840;
                    int var49 = var29 * var48 + var27;
                    int var50 = var32 * var48 + var30;
                    int var51 = var35 * var48 + var33;
                    if (arg0 != arg1 && var40 < var36 || arg0 == arg1 && var40 > var38) {
                        int var52 = arg2 - arg1;
                        int var53 = arg1 - arg0;
                        int var54 = field2834[arg0];
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                while (true) {
                                    var52--;
                                    if (var52 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var54, var43 >> 16, var46 >> 16, var45 >> 8, var47 >> 8, var49, var50, var51, var28, var31, var34);
                                    var43 += var40;
                                    var46 += var38;
                                    var45 += var41;
                                    var47 += var39;
                                    var54 += class55.field1381;
                                    var49 += var29;
                                    var50 += var32;
                                    var51 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var54, var43 >> 16, var42 >> 16, var45 >> 8, var44 >> 8, var49, var50, var51, var28, var31, var34);
                            var43 += var40;
                            var42 += var36;
                            var45 += var41;
                            var44 += var37;
                            var54 += class55.field1381;
                            var49 += var29;
                            var50 += var32;
                            var51 += var35;
                        }
                    } else {
                        int var55 = arg2 - arg1;
                        int var56 = arg1 - arg0;
                        int var57 = field2834[arg0];
                        while (true) {
                            var56--;
                            if (var56 < 0) {
                                while (true) {
                                    var55--;
                                    if (var55 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var57, var46 >> 16, var43 >> 16, var47 >> 8, var45 >> 8, var49, var50, var51, var28, var31, var34);
                                    var43 += var40;
                                    var46 += var38;
                                    var45 += var41;
                                    var47 += var39;
                                    var57 += class55.field1381;
                                    var49 += var29;
                                    var50 += var32;
                                    var51 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var57, var42 >> 16, var43 >> 16, var44 >> 8, var45 >> 8, var49, var50, var51, var28, var31, var34);
                            var43 += var40;
                            var42 += var36;
                            var45 += var41;
                            var44 += var37;
                            var57 += class55.field1381;
                            var49 += var29;
                            var50 += var32;
                            var51 += var35;
                        }
                    }
                } else {
                    int var58;
                    int var59 = var58 = arg3 << 16;
                    int var60;
                    int var61 = var60 = arg6 << 16;
                    if (arg0 < 0) {
                        var59 -= arg0 * var40;
                        var58 -= arg0 * var36;
                        var61 -= arg0 * var41;
                        var60 -= arg0 * var37;
                        arg0 = 0;
                    }
                    int var62 = arg5 << 16;
                    int var63 = arg8 << 16;
                    if (arg2 < 0) {
                        var62 -= arg2 * var38;
                        var63 -= arg2 * var39;
                        arg2 = 0;
                    }
                    int var64 = arg0 - field2840;
                    int var65 = var29 * var64 + var27;
                    int var66 = var32 * var64 + var30;
                    int var67 = var35 * var64 + var33;
                    if ((arg0 == arg2 || var40 >= var36) && (arg0 != arg2 || var38 <= var36)) {
                        int var71 = arg1 - arg2;
                        int var72 = arg2 - arg0;
                        int var73 = field2834[arg0];
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var73, var58 >> 16, var62 >> 16, var60 >> 8, var63 >> 8, var65, var66, var67, var28, var31, var34);
                                    var62 += var38;
                                    var58 += var36;
                                    var63 += var39;
                                    var60 += var37;
                                    var73 += class55.field1381;
                                    var65 += var29;
                                    var66 += var32;
                                    var67 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var73, var58 >> 16, var59 >> 16, var60 >> 8, var61 >> 8, var65, var66, var67, var28, var31, var34);
                            var59 += var40;
                            var58 += var36;
                            var61 += var41;
                            var60 += var37;
                            var73 += class55.field1381;
                            var65 += var29;
                            var66 += var32;
                            var67 += var35;
                        }
                    } else {
                        int var68 = arg1 - arg2;
                        int var69 = arg2 - arg0;
                        int var70 = field2834[arg0];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var70, var62 >> 16, var58 >> 16, var63 >> 8, var60 >> 8, var65, var66, var67, var28, var31, var34);
                                    var62 += var38;
                                    var58 += var36;
                                    var63 += var39;
                                    var60 += var37;
                                    var70 += class55.field1381;
                                    var65 += var29;
                                    var66 += var32;
                                    var67 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var70, var59 >> 16, var58 >> 16, var61 >> 8, var60 >> 8, var65, var66, var67, var28, var31, var34);
                            var59 += var40;
                            var58 += var36;
                            var61 += var41;
                            var60 += var37;
                            var70 += class55.field1381;
                            var65 += var29;
                            var66 += var32;
                            var67 += var35;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field2825) {
                if (arg2 > field2825) {
                    arg2 = field2825;
                }
                if (arg0 > field2825) {
                    arg0 = field2825;
                }
                if (arg2 < arg0) {
                    int var74;
                    int var75 = var74 = arg4 << 16;
                    int var76;
                    int var77 = var76 = arg7 << 16;
                    if (arg1 < 0) {
                        var75 -= arg1 * var36;
                        var74 -= arg1 * var38;
                        var77 -= arg1 * var37;
                        var76 -= arg1 * var39;
                        arg1 = 0;
                    }
                    int var78 = arg5 << 16;
                    int var79 = arg8 << 16;
                    if (arg2 < 0) {
                        var78 -= arg2 * var40;
                        var79 -= arg2 * var41;
                        arg2 = 0;
                    }
                    int var80 = arg1 - field2840;
                    int var81 = var29 * var80 + var27;
                    int var82 = var32 * var80 + var30;
                    int var83 = var35 * var80 + var33;
                    if (arg1 != arg2 && var36 < var38 || arg1 == arg2 && var36 > var40) {
                        int var84 = arg0 - arg2;
                        int var85 = arg2 - arg1;
                        int var86 = field2834[arg1];
                        while (true) {
                            var85--;
                            if (var85 < 0) {
                                while (true) {
                                    var84--;
                                    if (var84 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var86, var75 >> 16, var78 >> 16, var77 >> 8, var79 >> 8, var81, var82, var83, var28, var31, var34);
                                    var75 += var36;
                                    var78 += var40;
                                    var77 += var37;
                                    var79 += var41;
                                    var86 += class55.field1381;
                                    var81 += var29;
                                    var82 += var32;
                                    var83 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var86, var75 >> 16, var74 >> 16, var77 >> 8, var76 >> 8, var81, var82, var83, var28, var31, var34);
                            var75 += var36;
                            var74 += var38;
                            var77 += var37;
                            var76 += var39;
                            var86 += class55.field1381;
                            var81 += var29;
                            var82 += var32;
                            var83 += var35;
                        }
                    } else {
                        int var87 = arg0 - arg2;
                        int var88 = arg2 - arg1;
                        int var89 = field2834[arg1];
                        while (true) {
                            var88--;
                            if (var88 < 0) {
                                while (true) {
                                    var87--;
                                    if (var87 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var89, var78 >> 16, var75 >> 16, var79 >> 8, var77 >> 8, var81, var82, var83, var28, var31, var34);
                                    var75 += var36;
                                    var78 += var40;
                                    var77 += var37;
                                    var79 += var41;
                                    var89 += class55.field1381;
                                    var81 += var29;
                                    var82 += var32;
                                    var83 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var89, var74 >> 16, var75 >> 16, var76 >> 8, var77 >> 8, var81, var82, var83, var28, var31, var34);
                            var75 += var36;
                            var74 += var38;
                            var77 += var37;
                            var76 += var39;
                            var89 += class55.field1381;
                            var81 += var29;
                            var82 += var32;
                            var83 += var35;
                        }
                    }
                } else {
                    int var90;
                    int var91 = var90 = arg4 << 16;
                    int var92;
                    int var93 = var92 = arg7 << 16;
                    if (arg1 < 0) {
                        var91 -= arg1 * var36;
                        var90 -= arg1 * var38;
                        var93 -= arg1 * var37;
                        var92 -= arg1 * var39;
                        arg1 = 0;
                    }
                    int var94 = arg3 << 16;
                    int var95 = arg6 << 16;
                    if (arg0 < 0) {
                        var94 -= arg0 * var40;
                        var95 -= arg0 * var41;
                        arg0 = 0;
                    }
                    int var96 = arg1 - field2840;
                    int var97 = var29 * var96 + var27;
                    int var98 = var32 * var96 + var30;
                    int var99 = var35 * var96 + var33;
                    if (var36 < var38) {
                        int var100 = arg2 - arg0;
                        int var101 = arg0 - arg1;
                        int var102 = field2834[arg1];
                        while (true) {
                            var101--;
                            if (var101 < 0) {
                                while (true) {
                                    var100--;
                                    if (var100 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var102, var94 >> 16, var90 >> 16, var95 >> 8, var92 >> 8, var97, var98, var99, var28, var31, var34);
                                    var94 += var40;
                                    var90 += var38;
                                    var95 += var41;
                                    var92 += var39;
                                    var102 += class55.field1381;
                                    var97 += var29;
                                    var98 += var32;
                                    var99 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var102, var91 >> 16, var90 >> 16, var93 >> 8, var92 >> 8, var97, var98, var99, var28, var31, var34);
                            var91 += var36;
                            var90 += var38;
                            var93 += var37;
                            var92 += var39;
                            var102 += class55.field1381;
                            var97 += var29;
                            var98 += var32;
                            var99 += var35;
                        }
                    } else {
                        int var103 = arg2 - arg0;
                        int var104 = arg0 - arg1;
                        int var105 = field2834[arg1];
                        while (true) {
                            var104--;
                            if (var104 < 0) {
                                while (true) {
                                    var103--;
                                    if (var103 < 0) {
                                        return;
                                    }
                                    method902(class55.field1380, var19, 0, 0, var105, var90 >> 16, var94 >> 16, var92 >> 8, var95 >> 8, var97, var98, var99, var28, var31, var34);
                                    var94 += var40;
                                    var90 += var38;
                                    var95 += var41;
                                    var92 += var39;
                                    var105 += class55.field1381;
                                    var97 += var29;
                                    var98 += var32;
                                    var99 += var35;
                                }
                            }
                            method902(class55.field1380, var19, 0, 0, var105, var90 >> 16, var91 >> 16, var92 >> 8, var93 >> 8, var97, var98, var99, var28, var31, var34);
                            var91 += var36;
                            var90 += var38;
                            var93 += var37;
                            var92 += var39;
                            var105 += class55.field1381;
                            var97 += var29;
                            var98 += var32;
                            var99 += var35;
                        }
                    }
                }
            }
        } else if (arg2 < field2825) {
            if (arg0 > field2825) {
                arg0 = field2825;
            }
            if (arg1 > field2825) {
                arg1 = field2825;
            }
            if (arg0 < arg1) {
                int var106;
                int var107 = var106 = arg5 << 16;
                int var108;
                int var109 = var108 = arg8 << 16;
                if (arg2 < 0) {
                    var107 -= arg2 * var38;
                    var106 -= arg2 * var40;
                    var109 -= arg2 * var39;
                    var108 -= arg2 * var41;
                    arg2 = 0;
                }
                int var110 = arg3 << 16;
                int var111 = arg6 << 16;
                if (arg0 < 0) {
                    var110 -= arg0 * var36;
                    var111 -= arg0 * var37;
                    arg0 = 0;
                }
                int var112 = arg2 - field2840;
                int var113 = var29 * var112 + var27;
                int var114 = var32 * var112 + var30;
                int var115 = var35 * var112 + var33;
                if (var38 < var40) {
                    int var116 = arg1 - arg0;
                    int var117 = arg0 - arg2;
                    int var118 = field2834[arg2];
                    while (true) {
                        var117--;
                        if (var117 < 0) {
                            while (true) {
                                var116--;
                                if (var116 < 0) {
                                    return;
                                }
                                method902(class55.field1380, var19, 0, 0, var118, var107 >> 16, var110 >> 16, var109 >> 8, var111 >> 8, var113, var114, var115, var28, var31, var34);
                                var107 += var38;
                                var110 += var36;
                                var109 += var39;
                                var111 += var37;
                                var118 += class55.field1381;
                                var113 += var29;
                                var114 += var32;
                                var115 += var35;
                            }
                        }
                        method902(class55.field1380, var19, 0, 0, var118, var107 >> 16, var106 >> 16, var109 >> 8, var108 >> 8, var113, var114, var115, var28, var31, var34);
                        var107 += var38;
                        var106 += var40;
                        var109 += var39;
                        var108 += var41;
                        var118 += class55.field1381;
                        var113 += var29;
                        var114 += var32;
                        var115 += var35;
                    }
                } else {
                    int var119 = arg1 - arg0;
                    int var120 = arg0 - arg2;
                    int var121 = field2834[arg2];
                    while (true) {
                        var120--;
                        if (var120 < 0) {
                            while (true) {
                                var119--;
                                if (var119 < 0) {
                                    return;
                                }
                                method902(class55.field1380, var19, 0, 0, var121, var110 >> 16, var107 >> 16, var111 >> 8, var109 >> 8, var113, var114, var115, var28, var31, var34);
                                var107 += var38;
                                var110 += var36;
                                var109 += var39;
                                var111 += var37;
                                var121 += class55.field1381;
                                var113 += var29;
                                var114 += var32;
                                var115 += var35;
                            }
                        }
                        method902(class55.field1380, var19, 0, 0, var121, var106 >> 16, var107 >> 16, var108 >> 8, var109 >> 8, var113, var114, var115, var28, var31, var34);
                        var107 += var38;
                        var106 += var40;
                        var109 += var39;
                        var108 += var41;
                        var121 += class55.field1381;
                        var113 += var29;
                        var114 += var32;
                        var115 += var35;
                    }
                }
            } else {
                int var122;
                int var123 = var122 = arg5 << 16;
                int var124;
                int var125 = var124 = arg8 << 16;
                if (arg2 < 0) {
                    var123 -= arg2 * var38;
                    var122 -= arg2 * var40;
                    var125 -= arg2 * var39;
                    var124 -= arg2 * var41;
                    arg2 = 0;
                }
                int var126 = arg4 << 16;
                int var127 = arg7 << 16;
                if (arg1 < 0) {
                    var126 -= arg1 * var36;
                    var127 -= arg1 * var37;
                    arg1 = 0;
                }
                int var128 = arg2 - field2840;
                int var129 = var29 * var128 + var27;
                int var130 = var32 * var128 + var30;
                int var131 = var35 * var128 + var33;
                if (var38 < var40) {
                    int var132 = arg0 - arg1;
                    int var133 = arg1 - arg2;
                    int var134 = field2834[arg2];
                    while (true) {
                        var133--;
                        if (var133 < 0) {
                            while (true) {
                                var132--;
                                if (var132 < 0) {
                                    return;
                                }
                                method902(class55.field1380, var19, 0, 0, var134, var126 >> 16, var122 >> 16, var127 >> 8, var124 >> 8, var129, var130, var131, var28, var31, var34);
                                var126 += var36;
                                var122 += var40;
                                var127 += var37;
                                var124 += var41;
                                var134 += class55.field1381;
                                var129 += var29;
                                var130 += var32;
                                var131 += var35;
                            }
                        }
                        method902(class55.field1380, var19, 0, 0, var134, var123 >> 16, var122 >> 16, var125 >> 8, var124 >> 8, var129, var130, var131, var28, var31, var34);
                        var123 += var38;
                        var122 += var40;
                        var125 += var39;
                        var124 += var41;
                        var134 += class55.field1381;
                        var129 += var29;
                        var130 += var32;
                        var131 += var35;
                    }
                } else {
                    int var135 = arg0 - arg1;
                    int var136 = arg1 - arg2;
                    int var137 = field2834[arg2];
                    while (true) {
                        var136--;
                        if (var136 < 0) {
                            while (true) {
                                var135--;
                                if (var135 < 0) {
                                    return;
                                }
                                method902(class55.field1380, var19, 0, 0, var137, var122 >> 16, var126 >> 16, var124 >> 8, var127 >> 8, var129, var130, var131, var28, var31, var34);
                                var126 += var36;
                                var122 += var40;
                                var127 += var37;
                                var124 += var41;
                                var137 += class55.field1381;
                                var129 += var29;
                                var130 += var32;
                                var131 += var35;
                            }
                        }
                        method902(class55.field1380, var19, 0, 0, var137, var122 >> 16, var123 >> 16, var124 >> 8, var125 >> 8, var129, var130, var131, var28, var31, var34);
                        var123 += var38;
                        var122 += var40;
                        var125 += var39;
                        var124 += var41;
                        var137 += class55.field1381;
                        var129 += var29;
                        var130 += var32;
                        var131 += var35;
                    }
                }
            }
        }
    }
}
