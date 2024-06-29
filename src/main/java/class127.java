import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class127 extends class108 {

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "Z")
    public static boolean field3067 = false;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "[I")
    public static int[] field3077 = new int[2048];

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "[I")
    public static int[] field3069 = new int[65536];

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "[I")
    public static int[] field3074 = new int[2048];

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "[I")
    public static int[] field3079 = new int[2048];

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "Z")
    public static boolean field3068 = true;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "Z")
    private static boolean field3080 = false;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "[I")
    private static int[] field3082 = new int[512];

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "Z")
    private static boolean field3065 = false;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "Llb;")
    public static class67 field3078;

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "[I")
    private static int[] field3084;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field3082[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field3077[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field3074[var2] = (int) (Math.sin((double) var2 * 0.0030679615D) * 65536.0D);
            field3079[var2] = (int) (Math.cos((double) var2 * 0.0030679615D) * 65536.0D);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(D)V", line = 3)
    public static final void method994(double arg0) {
        double var2 = arg0 + Math.random() * 0.03D - 0.015D;
        int var4 = 0;
        for (int var5 = 0; var5 < 512; var5++) {
            double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
            double var8 = (double) (var5 & 0x7) / 8.0D + 0.0625D;
            for (int var10 = 0; var10 < 128; var10++) {
                double var11 = (double) var10 / 128.0D;
                double var13 = var11;
                double var15 = var11;
                double var17 = var11;
                if (var8 != 0.0D) {
                    double var19;
                    if (var11 < 0.5D) {
                        var19 = (var8 + 1.0D) * var11;
                    } else {
                        var19 = var8 + var11 - var8 * var11;
                    }
                    double var21 = var11 * 2.0D - var19;
                    double var23 = var6 + 0.3333333333333333D;
                    if (var23 > 1.0D) {
                        var23--;
                    }
                    double var27 = var6 - 0.3333333333333333D;
                    if (var27 < 0.0D) {
                        var27++;
                    }
                    if (var23 * 6.0D < 1.0D) {
                        var13 = (var19 - var21) * 6.0D * var23 + var21;
                    } else if (var23 * 2.0D < 1.0D) {
                        var13 = var19;
                    } else if (var23 * 3.0D < 2.0D) {
                        var13 = (var19 - var21) * (0.6666666666666666D - var23) * 6.0D + var21;
                    } else {
                        var13 = var21;
                    }
                    if (var6 * 6.0D < 1.0D) {
                        var15 = (var19 - var21) * 6.0D * var6 + var21;
                    } else if (var6 * 2.0D < 1.0D) {
                        var15 = var19;
                    } else if (var6 * 3.0D < 2.0D) {
                        var15 = (var19 - var21) * (0.6666666666666666D - var6) * 6.0D + var21;
                    } else {
                        var15 = var21;
                    }
                    if (var27 * 6.0D < 1.0D) {
                        var17 = (var19 - var21) * 6.0D * var27 + var21;
                    } else if (var27 * 2.0D < 1.0D) {
                        var17 = var19;
                    } else if (var27 * 3.0D < 2.0D) {
                        var17 = (var19 - var21) * (0.6666666666666666D - var27) * 6.0D + var21;
                    } else {
                        var17 = var21;
                    }
                }
                int var29 = (int) (var13 * 256.0D);
                int var30 = (int) (var15 * 256.0D);
                int var31 = (int) (var17 * 256.0D);
                int var32 = (var29 << 16) + (var30 << 8) + var31;
                int var33 = method1006(var32, var2);
                if (var33 == 0) {
                    var33 = 1;
                }
                field3069[var4++] = var33;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Llb;)V", line = 112)
    public static final void method995(class67 arg0) {
        field3078 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()[I", line = 117)
    public static final int[] method996() {
        return field3084;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)I", line = 122)
    private static final int method997(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * (127 - arg1) >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIIIII)V", line = 135)
    private static final void method998(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (field3068) {
            int var9;
            int var10;
            int var11;
            if (field3067) {
                int var8;
                if (arg5 - arg4 > 3) {
                    var8 = (arg7 - arg6) / (arg5 - arg4);
                } else {
                    var8 = 0;
                }
                if (arg5 > field3070) {
                    arg5 = field3070;
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
                    var11 = (arg7 - arg6) * field3082[var10] >> 15;
                } else {
                    var11 = 0;
                }
            } else {
                return;
            }
            if (field3073 == 0) {
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var12 = arg5 - arg4 & 0x3;
                        if (var12 > 0) {
                            int var13 = field3069[arg6 >> 8];
                            do {
                                arg0[var9++] = var13;
                                var12--;
                            } while (var12 > 0);
                            return;
                        }
                        break;
                    }
                    int var14 = field3069[arg6 >> 8];
                    arg6 += var11;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                }
            } else {
                int var15 = field3073;
                int var16 = 256 - field3073;
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var17 = arg5 - arg4 & 0x3;
                        if (var17 > 0) {
                            int var18 = field3069[arg6 >> 8];
                            int var19 = ((var18 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var18 & 0xFF00) * var16 >> 8 & 0xFF00);
                            do {
                                arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var19;
                                var17--;
                            } while (var17 > 0);
                        }
                        break;
                    }
                    int var20 = field3069[arg6 >> 8];
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
            if (field3067) {
                if (arg5 > field3070) {
                    arg5 = field3070;
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
            if (field3073 == 0) {
                do {
                    arg0[var23++] = field3069[arg6 >> 8];
                    arg6 += var22;
                    var24--;
                } while (var24 > 0);
            } else {
                int var25 = field3073;
                int var26 = 256 - field3073;
                do {
                    int var27 = field3069[arg6 >> 8];
                    arg6 += var22;
                    int var28 = ((var27 & 0xFF00FF) * var26 >> 8 & 0xFF00FF) + ((var27 & 0xFF00) * var26 >> 8 & 0xFF00);
                    arg0[var23++] = ((arg0[var23] & 0xFF00) * var25 >> 8 & 0xFF00) + ((arg0[var23] & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + var28;
                    var24--;
                } while (var24 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIII)V", line = 287)
    private static final void method999(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field3067) {
            if (arg5 > field3070) {
                arg5 = field3070;
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
        if (field3073 == 0) {
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
        int var9 = field3073;
        int var10 = 256 - field3073;
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

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 349)
    public static final void method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var19 = field3078.method568(arg18, (byte) 112);
        if (var19 == null) {
            int var20 = field3078.method571(arg18, (byte) -93);
            method1008(arg0, arg1, arg2, arg3, arg4, arg5, method997(var20, arg6), method997(var20, arg7), method997(var20, arg8));
            return;
        }
        field3080 = field3078.method569(6494, arg18);
        field3065 = field3078.method570((byte) 113, arg18);
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
            if (arg0 < field3081) {
                if (arg1 > field3081) {
                    arg1 = field3081;
                }
                if (arg2 > field3081) {
                    arg2 = field3081;
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
                    int var48 = arg0 - field3083;
                    int var49 = var29 * var48 + var27;
                    int var50 = var32 * var48 + var30;
                    int var51 = var35 * var48 + var33;
                    if (arg0 != arg1 && var40 < var36 || arg0 == arg1 && var40 > var38) {
                        int var52 = arg2 - arg1;
                        int var53 = arg1 - arg0;
                        int var54 = field3084[arg0];
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                while (true) {
                                    var52--;
                                    if (var52 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var54, var43 >> 16, var46 >> 16, var45 >> 8, var47 >> 8, var49, var50, var51, var28, var31, var34);
                                    var43 += var40;
                                    var46 += var38;
                                    var45 += var41;
                                    var47 += var39;
                                    var54 += class108.field2709;
                                    var49 += var29;
                                    var50 += var32;
                                    var51 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var54, var43 >> 16, var42 >> 16, var45 >> 8, var44 >> 8, var49, var50, var51, var28, var31, var34);
                            var43 += var40;
                            var42 += var36;
                            var45 += var41;
                            var44 += var37;
                            var54 += class108.field2709;
                            var49 += var29;
                            var50 += var32;
                            var51 += var35;
                        }
                    } else {
                        int var55 = arg2 - arg1;
                        int var56 = arg1 - arg0;
                        int var57 = field3084[arg0];
                        while (true) {
                            var56--;
                            if (var56 < 0) {
                                while (true) {
                                    var55--;
                                    if (var55 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var57, var46 >> 16, var43 >> 16, var47 >> 8, var45 >> 8, var49, var50, var51, var28, var31, var34);
                                    var43 += var40;
                                    var46 += var38;
                                    var45 += var41;
                                    var47 += var39;
                                    var57 += class108.field2709;
                                    var49 += var29;
                                    var50 += var32;
                                    var51 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var57, var42 >> 16, var43 >> 16, var44 >> 8, var45 >> 8, var49, var50, var51, var28, var31, var34);
                            var43 += var40;
                            var42 += var36;
                            var45 += var41;
                            var44 += var37;
                            var57 += class108.field2709;
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
                    int var64 = arg0 - field3083;
                    int var65 = var29 * var64 + var27;
                    int var66 = var32 * var64 + var30;
                    int var67 = var35 * var64 + var33;
                    if ((arg0 == arg2 || var40 >= var36) && (arg0 != arg2 || var38 <= var36)) {
                        int var71 = arg1 - arg2;
                        int var72 = arg2 - arg0;
                        int var73 = field3084[arg0];
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var73, var58 >> 16, var62 >> 16, var60 >> 8, var63 >> 8, var65, var66, var67, var28, var31, var34);
                                    var62 += var38;
                                    var58 += var36;
                                    var63 += var39;
                                    var60 += var37;
                                    var73 += class108.field2709;
                                    var65 += var29;
                                    var66 += var32;
                                    var67 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var73, var58 >> 16, var59 >> 16, var60 >> 8, var61 >> 8, var65, var66, var67, var28, var31, var34);
                            var59 += var40;
                            var58 += var36;
                            var61 += var41;
                            var60 += var37;
                            var73 += class108.field2709;
                            var65 += var29;
                            var66 += var32;
                            var67 += var35;
                        }
                    } else {
                        int var68 = arg1 - arg2;
                        int var69 = arg2 - arg0;
                        int var70 = field3084[arg0];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var70, var62 >> 16, var58 >> 16, var63 >> 8, var60 >> 8, var65, var66, var67, var28, var31, var34);
                                    var62 += var38;
                                    var58 += var36;
                                    var63 += var39;
                                    var60 += var37;
                                    var70 += class108.field2709;
                                    var65 += var29;
                                    var66 += var32;
                                    var67 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var70, var59 >> 16, var58 >> 16, var61 >> 8, var60 >> 8, var65, var66, var67, var28, var31, var34);
                            var59 += var40;
                            var58 += var36;
                            var61 += var41;
                            var60 += var37;
                            var70 += class108.field2709;
                            var65 += var29;
                            var66 += var32;
                            var67 += var35;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field3081) {
                if (arg2 > field3081) {
                    arg2 = field3081;
                }
                if (arg0 > field3081) {
                    arg0 = field3081;
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
                    int var80 = arg1 - field3083;
                    int var81 = var29 * var80 + var27;
                    int var82 = var32 * var80 + var30;
                    int var83 = var35 * var80 + var33;
                    if (arg1 != arg2 && var36 < var38 || arg1 == arg2 && var36 > var40) {
                        int var84 = arg0 - arg2;
                        int var85 = arg2 - arg1;
                        int var86 = field3084[arg1];
                        while (true) {
                            var85--;
                            if (var85 < 0) {
                                while (true) {
                                    var84--;
                                    if (var84 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var86, var75 >> 16, var78 >> 16, var77 >> 8, var79 >> 8, var81, var82, var83, var28, var31, var34);
                                    var75 += var36;
                                    var78 += var40;
                                    var77 += var37;
                                    var79 += var41;
                                    var86 += class108.field2709;
                                    var81 += var29;
                                    var82 += var32;
                                    var83 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var86, var75 >> 16, var74 >> 16, var77 >> 8, var76 >> 8, var81, var82, var83, var28, var31, var34);
                            var75 += var36;
                            var74 += var38;
                            var77 += var37;
                            var76 += var39;
                            var86 += class108.field2709;
                            var81 += var29;
                            var82 += var32;
                            var83 += var35;
                        }
                    } else {
                        int var87 = arg0 - arg2;
                        int var88 = arg2 - arg1;
                        int var89 = field3084[arg1];
                        while (true) {
                            var88--;
                            if (var88 < 0) {
                                while (true) {
                                    var87--;
                                    if (var87 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var89, var78 >> 16, var75 >> 16, var79 >> 8, var77 >> 8, var81, var82, var83, var28, var31, var34);
                                    var75 += var36;
                                    var78 += var40;
                                    var77 += var37;
                                    var79 += var41;
                                    var89 += class108.field2709;
                                    var81 += var29;
                                    var82 += var32;
                                    var83 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var89, var74 >> 16, var75 >> 16, var76 >> 8, var77 >> 8, var81, var82, var83, var28, var31, var34);
                            var75 += var36;
                            var74 += var38;
                            var77 += var37;
                            var76 += var39;
                            var89 += class108.field2709;
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
                    int var96 = arg1 - field3083;
                    int var97 = var29 * var96 + var27;
                    int var98 = var32 * var96 + var30;
                    int var99 = var35 * var96 + var33;
                    if (var36 < var38) {
                        int var100 = arg2 - arg0;
                        int var101 = arg0 - arg1;
                        int var102 = field3084[arg1];
                        while (true) {
                            var101--;
                            if (var101 < 0) {
                                while (true) {
                                    var100--;
                                    if (var100 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var102, var94 >> 16, var90 >> 16, var95 >> 8, var92 >> 8, var97, var98, var99, var28, var31, var34);
                                    var94 += var40;
                                    var90 += var38;
                                    var95 += var41;
                                    var92 += var39;
                                    var102 += class108.field2709;
                                    var97 += var29;
                                    var98 += var32;
                                    var99 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var102, var91 >> 16, var90 >> 16, var93 >> 8, var92 >> 8, var97, var98, var99, var28, var31, var34);
                            var91 += var36;
                            var90 += var38;
                            var93 += var37;
                            var92 += var39;
                            var102 += class108.field2709;
                            var97 += var29;
                            var98 += var32;
                            var99 += var35;
                        }
                    } else {
                        int var103 = arg2 - arg0;
                        int var104 = arg0 - arg1;
                        int var105 = field3084[arg1];
                        while (true) {
                            var104--;
                            if (var104 < 0) {
                                while (true) {
                                    var103--;
                                    if (var103 < 0) {
                                        return;
                                    }
                                    method1002(class108.field2711, var19, 0, 0, var105, var90 >> 16, var94 >> 16, var92 >> 8, var95 >> 8, var97, var98, var99, var28, var31, var34);
                                    var94 += var40;
                                    var90 += var38;
                                    var95 += var41;
                                    var92 += var39;
                                    var105 += class108.field2709;
                                    var97 += var29;
                                    var98 += var32;
                                    var99 += var35;
                                }
                            }
                            method1002(class108.field2711, var19, 0, 0, var105, var90 >> 16, var91 >> 16, var92 >> 8, var93 >> 8, var97, var98, var99, var28, var31, var34);
                            var91 += var36;
                            var90 += var38;
                            var93 += var37;
                            var92 += var39;
                            var105 += class108.field2709;
                            var97 += var29;
                            var98 += var32;
                            var99 += var35;
                        }
                    }
                }
            }
        } else if (arg2 < field3081) {
            if (arg0 > field3081) {
                arg0 = field3081;
            }
            if (arg1 > field3081) {
                arg1 = field3081;
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
                int var112 = arg2 - field3083;
                int var113 = var29 * var112 + var27;
                int var114 = var32 * var112 + var30;
                int var115 = var35 * var112 + var33;
                if (var38 < var40) {
                    int var116 = arg1 - arg0;
                    int var117 = arg0 - arg2;
                    int var118 = field3084[arg2];
                    while (true) {
                        var117--;
                        if (var117 < 0) {
                            while (true) {
                                var116--;
                                if (var116 < 0) {
                                    return;
                                }
                                method1002(class108.field2711, var19, 0, 0, var118, var107 >> 16, var110 >> 16, var109 >> 8, var111 >> 8, var113, var114, var115, var28, var31, var34);
                                var107 += var38;
                                var110 += var36;
                                var109 += var39;
                                var111 += var37;
                                var118 += class108.field2709;
                                var113 += var29;
                                var114 += var32;
                                var115 += var35;
                            }
                        }
                        method1002(class108.field2711, var19, 0, 0, var118, var107 >> 16, var106 >> 16, var109 >> 8, var108 >> 8, var113, var114, var115, var28, var31, var34);
                        var107 += var38;
                        var106 += var40;
                        var109 += var39;
                        var108 += var41;
                        var118 += class108.field2709;
                        var113 += var29;
                        var114 += var32;
                        var115 += var35;
                    }
                } else {
                    int var119 = arg1 - arg0;
                    int var120 = arg0 - arg2;
                    int var121 = field3084[arg2];
                    while (true) {
                        var120--;
                        if (var120 < 0) {
                            while (true) {
                                var119--;
                                if (var119 < 0) {
                                    return;
                                }
                                method1002(class108.field2711, var19, 0, 0, var121, var110 >> 16, var107 >> 16, var111 >> 8, var109 >> 8, var113, var114, var115, var28, var31, var34);
                                var107 += var38;
                                var110 += var36;
                                var109 += var39;
                                var111 += var37;
                                var121 += class108.field2709;
                                var113 += var29;
                                var114 += var32;
                                var115 += var35;
                            }
                        }
                        method1002(class108.field2711, var19, 0, 0, var121, var106 >> 16, var107 >> 16, var108 >> 8, var109 >> 8, var113, var114, var115, var28, var31, var34);
                        var107 += var38;
                        var106 += var40;
                        var109 += var39;
                        var108 += var41;
                        var121 += class108.field2709;
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
                int var128 = arg2 - field3083;
                int var129 = var29 * var128 + var27;
                int var130 = var32 * var128 + var30;
                int var131 = var35 * var128 + var33;
                if (var38 < var40) {
                    int var132 = arg0 - arg1;
                    int var133 = arg1 - arg2;
                    int var134 = field3084[arg2];
                    while (true) {
                        var133--;
                        if (var133 < 0) {
                            while (true) {
                                var132--;
                                if (var132 < 0) {
                                    return;
                                }
                                method1002(class108.field2711, var19, 0, 0, var134, var126 >> 16, var122 >> 16, var127 >> 8, var124 >> 8, var129, var130, var131, var28, var31, var34);
                                var126 += var36;
                                var122 += var40;
                                var127 += var37;
                                var124 += var41;
                                var134 += class108.field2709;
                                var129 += var29;
                                var130 += var32;
                                var131 += var35;
                            }
                        }
                        method1002(class108.field2711, var19, 0, 0, var134, var123 >> 16, var122 >> 16, var125 >> 8, var124 >> 8, var129, var130, var131, var28, var31, var34);
                        var123 += var38;
                        var122 += var40;
                        var125 += var39;
                        var124 += var41;
                        var134 += class108.field2709;
                        var129 += var29;
                        var130 += var32;
                        var131 += var35;
                    }
                } else {
                    int var135 = arg0 - arg1;
                    int var136 = arg1 - arg2;
                    int var137 = field3084[arg2];
                    while (true) {
                        var136--;
                        if (var136 < 0) {
                            while (true) {
                                var135--;
                                if (var135 < 0) {
                                    return;
                                }
                                method1002(class108.field2711, var19, 0, 0, var137, var122 >> 16, var126 >> 16, var124 >> 8, var127 >> 8, var129, var130, var131, var28, var31, var34);
                                var126 += var36;
                                var122 += var40;
                                var127 += var37;
                                var124 += var41;
                                var137 += class108.field2709;
                                var129 += var29;
                                var130 += var32;
                                var131 += var35;
                            }
                        }
                        method1002(class108.field2711, var19, 0, 0, var137, var122 >> 16, var123 >> 16, var124 >> 8, var125 >> 8, var129, var130, var131, var28, var31, var34);
                        var123 += var38;
                        var122 += var40;
                        var125 += var39;
                        var124 += var41;
                        var137 += class108.field2709;
                        var129 += var29;
                        var130 += var32;
                        var131 += var35;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII[I)[I", line = 1029)
    private static final int[] method1001(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3070 = arg2 - arg0;
        field3081 = arg3 - arg1;
        if (arg4 == null) {
            int var5 = field3081;
            if (var5 == 0) {
                var5++;
            }
            field3084 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                field3084[var6] = (arg1 + var6) * class108.field2709 + arg0;
            }
        } else {
            field3084 = arg4;
        }
        method1004();
        return field3084;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V", line = 1054)
    private static final void method1002(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (arg5 >= arg6) {
            return;
        }
        int var16;
        int var17;
        int var18;
        if (field3067) {
            int var15 = (arg8 - arg7) / (arg6 - arg5);
            if (arg6 > field3070) {
                arg6 = field3070;
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
                var17 = (arg8 - arg7) * field3082[var16] >> 6;
            } else {
                var16 = 0;
                var17 = 0;
            }
            var18 = arg7 << 9;
        }
        int var19 = arg4 + arg5;
        if (!field3080) {
            int var78 = 0;
            int var79 = 0;
            int var80 = arg5 - field3071;
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
            if (field3065) {
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
        int var22 = arg5 - field3071;
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
        if (field3065) {
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

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([I)[I", line = 1544)
    public static final int[] method1003(int[] arg0) {
        return method1001(class108.field2708, class108.field2707, class108.field2710, class108.field2705, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "()V", line = 1548)
    public static final void method1004() {
        field3071 = field3070 / 2;
        field3083 = field3081 / 2;
        field3066 = -field3071;
        field3075 = field3070 - field3071;
        field3072 = -field3083;
        field3076 = field3081 - field3083;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII)V", line = 1563)
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
            if (arg0 < field3081) {
                if (arg1 > field3081) {
                    arg1 = field3081;
                }
                if (arg2 > field3081) {
                    arg2 = field3081;
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
                        int var15 = field3084[arg0];
                        while (true) {
                            var14--;
                            if (var14 < 0) {
                                while (true) {
                                    var13--;
                                    if (var13 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var15, arg6, 0, var11 >> 16, var12 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var15 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var15, arg6, 0, var11 >> 16, var10 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var15 += class108.field2709;
                        }
                    } else {
                        int var16 = arg2 - arg1;
                        int var17 = arg1 - arg0;
                        int var18 = field3084[arg0];
                        while (true) {
                            var17--;
                            if (var17 < 0) {
                                while (true) {
                                    var16--;
                                    if (var16 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var18, arg6, 0, var12 >> 16, var11 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var18 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var18, arg6, 0, var10 >> 16, var11 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var18 += class108.field2709;
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
                        int var24 = field3084[arg0];
                        while (true) {
                            var23--;
                            if (var23 < 0) {
                                while (true) {
                                    var22--;
                                    if (var22 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var24, arg6, 0, var21 >> 16, var19 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var24 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var24, arg6, 0, var20 >> 16, var19 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var24 += class108.field2709;
                        }
                    } else {
                        int var25 = arg1 - arg2;
                        int var26 = arg2 - arg0;
                        int var27 = field3084[arg0];
                        while (true) {
                            var26--;
                            if (var26 < 0) {
                                while (true) {
                                    var25--;
                                    if (var25 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var27, arg6, 0, var19 >> 16, var21 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var27 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var27, arg6, 0, var19 >> 16, var20 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var27 += class108.field2709;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field3081) {
                if (arg2 > field3081) {
                    arg2 = field3081;
                }
                if (arg0 > field3081) {
                    arg0 = field3081;
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
                        int var33 = field3084[arg1];
                        while (true) {
                            var32--;
                            if (var32 < 0) {
                                while (true) {
                                    var31--;
                                    if (var31 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var33, arg6, 0, var29 >> 16, var30 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var33 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var33, arg6, 0, var29 >> 16, var28 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var33 += class108.field2709;
                        }
                    } else {
                        int var34 = arg0 - arg2;
                        int var35 = arg2 - arg1;
                        int var36 = field3084[arg1];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var36, arg6, 0, var30 >> 16, var29 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var36 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var36, arg6, 0, var28 >> 16, var29 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var36 += class108.field2709;
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
                        int var42 = field3084[arg1];
                        while (true) {
                            var41--;
                            if (var41 < 0) {
                                while (true) {
                                    var40--;
                                    if (var40 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var42, arg6, 0, var39 >> 16, var37 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var42 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var42, arg6, 0, var38 >> 16, var37 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var42 += class108.field2709;
                        }
                    } else {
                        int var43 = arg2 - arg0;
                        int var44 = arg0 - arg1;
                        int var45 = field3084[arg1];
                        while (true) {
                            var44--;
                            if (var44 < 0) {
                                while (true) {
                                    var43--;
                                    if (var43 < 0) {
                                        return;
                                    }
                                    method999(class108.field2711, var45, arg6, 0, var37 >> 16, var39 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var45 += class108.field2709;
                                }
                            }
                            method999(class108.field2711, var45, arg6, 0, var37 >> 16, var38 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var45 += class108.field2709;
                        }
                    }
                }
            }
        } else if (arg2 < field3081) {
            if (arg0 > field3081) {
                arg0 = field3081;
            }
            if (arg1 > field3081) {
                arg1 = field3081;
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
                    int var51 = field3084[arg2];
                    while (true) {
                        var50--;
                        if (var50 < 0) {
                            while (true) {
                                var49--;
                                if (var49 < 0) {
                                    return;
                                }
                                method999(class108.field2711, var51, arg6, 0, var47 >> 16, var48 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var51 += class108.field2709;
                            }
                        }
                        method999(class108.field2711, var51, arg6, 0, var47 >> 16, var46 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var51 += class108.field2709;
                    }
                } else {
                    int var52 = arg1 - arg0;
                    int var53 = arg0 - arg2;
                    int var54 = field3084[arg2];
                    while (true) {
                        var53--;
                        if (var53 < 0) {
                            while (true) {
                                var52--;
                                if (var52 < 0) {
                                    return;
                                }
                                method999(class108.field2711, var54, arg6, 0, var48 >> 16, var47 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var54 += class108.field2709;
                            }
                        }
                        method999(class108.field2711, var54, arg6, 0, var46 >> 16, var47 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var54 += class108.field2709;
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
                    int var60 = field3084[arg2];
                    while (true) {
                        var59--;
                        if (var59 < 0) {
                            while (true) {
                                var58--;
                                if (var58 < 0) {
                                    return;
                                }
                                method999(class108.field2711, var60, arg6, 0, var57 >> 16, var55 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var60 += class108.field2709;
                            }
                        }
                        method999(class108.field2711, var60, arg6, 0, var56 >> 16, var55 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var60 += class108.field2709;
                    }
                } else {
                    int var61 = arg0 - arg1;
                    int var62 = arg1 - arg2;
                    int var63 = field3084[arg2];
                    while (true) {
                        var62--;
                        if (var62 < 0) {
                            while (true) {
                                var61--;
                                if (var61 < 0) {
                                    return;
                                }
                                method999(class108.field2711, var63, arg6, 0, var55 >> 16, var57 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var63 += class108.field2709;
                            }
                        }
                        method999(class108.field2711, var63, arg6, 0, var55 >> 16, var56 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var63 += class108.field2709;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ID)I", line = 2012)
    public static final int method1006(int arg0, double arg1) {
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

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "()V", line = 2041)
    public static void method1007() {
        field3084 = null;
        field3069 = null;
        field3078 = null;
        field3082 = null;
        field3077 = null;
        field3074 = null;
        field3079 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIII)V", line = 2055)
    public static final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
            if (arg0 < field3081) {
                if (arg1 > field3081) {
                    arg1 = field3081;
                }
                if (arg2 > field3081) {
                    arg2 = field3081;
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
                        int var23 = field3084[arg0];
                        while (true) {
                            var22--;
                            if (var22 < 0) {
                                while (true) {
                                    var21--;
                                    if (var21 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var23, 0, 0, var16 >> 16, var19 >> 16, var18 >> 7, var20 >> 7);
                                    var16 += var13;
                                    var19 += var11;
                                    var18 += var14;
                                    var20 += var12;
                                    var23 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var23, 0, 0, var16 >> 16, var15 >> 16, var18 >> 7, var17 >> 7);
                            var16 += var13;
                            var15 += var9;
                            var18 += var14;
                            var17 += var10;
                            var23 += class108.field2709;
                        }
                    } else {
                        int var24 = arg2 - arg1;
                        int var25 = arg1 - arg0;
                        int var26 = field3084[arg0];
                        while (true) {
                            var25--;
                            if (var25 < 0) {
                                while (true) {
                                    var24--;
                                    if (var24 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var26, 0, 0, var19 >> 16, var16 >> 16, var20 >> 7, var18 >> 7);
                                    var16 += var13;
                                    var19 += var11;
                                    var18 += var14;
                                    var20 += var12;
                                    var26 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var26, 0, 0, var15 >> 16, var16 >> 16, var17 >> 7, var18 >> 7);
                            var16 += var13;
                            var15 += var9;
                            var18 += var14;
                            var17 += var10;
                            var26 += class108.field2709;
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
                        int var35 = field3084[arg0];
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var35, 0, 0, var31 >> 16, var27 >> 16, var32 >> 7, var29 >> 7);
                                    var31 += var11;
                                    var27 += var9;
                                    var32 += var12;
                                    var29 += var10;
                                    var35 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var35, 0, 0, var28 >> 16, var27 >> 16, var30 >> 7, var29 >> 7);
                            var28 += var13;
                            var27 += var9;
                            var30 += var14;
                            var29 += var10;
                            var35 += class108.field2709;
                        }
                    } else {
                        int var36 = arg1 - arg2;
                        int var37 = arg2 - arg0;
                        int var38 = field3084[arg0];
                        while (true) {
                            var37--;
                            if (var37 < 0) {
                                while (true) {
                                    var36--;
                                    if (var36 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var38, 0, 0, var27 >> 16, var31 >> 16, var29 >> 7, var32 >> 7);
                                    var31 += var11;
                                    var27 += var9;
                                    var32 += var12;
                                    var29 += var10;
                                    var38 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var38, 0, 0, var27 >> 16, var28 >> 16, var29 >> 7, var30 >> 7);
                            var28 += var13;
                            var27 += var9;
                            var30 += var14;
                            var29 += var10;
                            var38 += class108.field2709;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field3081) {
                if (arg2 > field3081) {
                    arg2 = field3081;
                }
                if (arg0 > field3081) {
                    arg0 = field3081;
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
                        int var47 = field3084[arg1];
                        while (true) {
                            var46--;
                            if (var46 < 0) {
                                while (true) {
                                    var45--;
                                    if (var45 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var47, 0, 0, var40 >> 16, var43 >> 16, var42 >> 7, var44 >> 7);
                                    var40 += var9;
                                    var43 += var13;
                                    var42 += var10;
                                    var44 += var14;
                                    var47 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var47, 0, 0, var40 >> 16, var39 >> 16, var42 >> 7, var41 >> 7);
                            var40 += var9;
                            var39 += var11;
                            var42 += var10;
                            var41 += var12;
                            var47 += class108.field2709;
                        }
                    } else {
                        int var48 = arg0 - arg2;
                        int var49 = arg2 - arg1;
                        int var50 = field3084[arg1];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var50, 0, 0, var43 >> 16, var40 >> 16, var44 >> 7, var42 >> 7);
                                    var40 += var9;
                                    var43 += var13;
                                    var42 += var10;
                                    var44 += var14;
                                    var50 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var50, 0, 0, var39 >> 16, var40 >> 16, var41 >> 7, var42 >> 7);
                            var40 += var9;
                            var39 += var11;
                            var42 += var10;
                            var41 += var12;
                            var50 += class108.field2709;
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
                        int var59 = field3084[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var59, 0, 0, var55 >> 16, var51 >> 16, var56 >> 7, var53 >> 7);
                                    var55 += var13;
                                    var51 += var11;
                                    var56 += var14;
                                    var53 += var12;
                                    var59 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var59, 0, 0, var52 >> 16, var51 >> 16, var54 >> 7, var53 >> 7);
                            var52 += var9;
                            var51 += var11;
                            var54 += var10;
                            var53 += var12;
                            var59 += class108.field2709;
                        }
                    } else {
                        int var60 = arg2 - arg0;
                        int var61 = arg0 - arg1;
                        int var62 = field3084[arg1];
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return;
                                    }
                                    method998(class108.field2711, var62, 0, 0, var51 >> 16, var55 >> 16, var53 >> 7, var56 >> 7);
                                    var55 += var13;
                                    var51 += var11;
                                    var56 += var14;
                                    var53 += var12;
                                    var62 += class108.field2709;
                                }
                            }
                            method998(class108.field2711, var62, 0, 0, var51 >> 16, var52 >> 16, var53 >> 7, var54 >> 7);
                            var52 += var9;
                            var51 += var11;
                            var54 += var10;
                            var53 += var12;
                            var62 += class108.field2709;
                        }
                    }
                }
            }
        } else if (arg2 < field3081) {
            if (arg0 > field3081) {
                arg0 = field3081;
            }
            if (arg1 > field3081) {
                arg1 = field3081;
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
                    int var71 = field3084[arg2];
                    while (true) {
                        var70--;
                        if (var70 < 0) {
                            while (true) {
                                var69--;
                                if (var69 < 0) {
                                    return;
                                }
                                method998(class108.field2711, var71, 0, 0, var64 >> 16, var67 >> 16, var66 >> 7, var68 >> 7);
                                var64 += var11;
                                var67 += var9;
                                var66 += var12;
                                var68 += var10;
                                var71 += class108.field2709;
                            }
                        }
                        method998(class108.field2711, var71, 0, 0, var64 >> 16, var63 >> 16, var66 >> 7, var65 >> 7);
                        var64 += var11;
                        var63 += var13;
                        var66 += var12;
                        var65 += var14;
                        var71 += class108.field2709;
                    }
                } else {
                    int var72 = arg1 - arg0;
                    int var73 = arg0 - arg2;
                    int var74 = field3084[arg2];
                    while (true) {
                        var73--;
                        if (var73 < 0) {
                            while (true) {
                                var72--;
                                if (var72 < 0) {
                                    return;
                                }
                                method998(class108.field2711, var74, 0, 0, var67 >> 16, var64 >> 16, var68 >> 7, var66 >> 7);
                                var64 += var11;
                                var67 += var9;
                                var66 += var12;
                                var68 += var10;
                                var74 += class108.field2709;
                            }
                        }
                        method998(class108.field2711, var74, 0, 0, var63 >> 16, var64 >> 16, var65 >> 7, var66 >> 7);
                        var64 += var11;
                        var63 += var13;
                        var66 += var12;
                        var65 += var14;
                        var74 += class108.field2709;
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
                    int var83 = field3084[arg2];
                    while (true) {
                        var82--;
                        if (var82 < 0) {
                            while (true) {
                                var81--;
                                if (var81 < 0) {
                                    return;
                                }
                                method998(class108.field2711, var83, 0, 0, var79 >> 16, var75 >> 16, var80 >> 7, var77 >> 7);
                                var79 += var9;
                                var75 += var13;
                                var80 += var10;
                                var77 += var14;
                                var83 += class108.field2709;
                            }
                        }
                        method998(class108.field2711, var83, 0, 0, var76 >> 16, var75 >> 16, var78 >> 7, var77 >> 7);
                        var76 += var11;
                        var75 += var13;
                        var78 += var12;
                        var77 += var14;
                        var83 += class108.field2709;
                    }
                } else {
                    int var84 = arg0 - arg1;
                    int var85 = arg1 - arg2;
                    int var86 = field3084[arg2];
                    while (true) {
                        var85--;
                        if (var85 < 0) {
                            while (true) {
                                var84--;
                                if (var84 < 0) {
                                    return;
                                }
                                method998(class108.field2711, var86, 0, 0, var75 >> 16, var79 >> 16, var77 >> 7, var80 >> 7);
                                var79 += var9;
                                var75 += var13;
                                var80 += var10;
                                var77 += var14;
                                var86 += class108.field2709;
                            }
                        }
                        method998(class108.field2711, var86, 0, 0, var75 >> 16, var76 >> 16, var77 >> 7, var78 >> 7);
                        var76 += var11;
                        var75 += var13;
                        var78 += var12;
                        var77 += var14;
                        var86 += class108.field2709;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V", line = 2647)
    public static final void method1009(int arg0, int arg1) {
        int var2 = field3084[0];
        int var3 = var2 / class108.field2709;
        int var4 = var2 - class108.field2709 * var3;
        field3071 = arg0 - var4;
        field3083 = arg1 - var3;
        field3066 = -field3071;
        field3075 = field3070 - field3071;
        field3072 = -field3083;
        field3076 = field3081 - field3083;
    }
}
