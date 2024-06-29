import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class305 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
    public static int[] field4955 = new int[2048];

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    public static int[] field4956 = new int[65536];

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4958 = 0;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    public static int[] field4957 = new int[2048];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
    public static int[] field4959 = new int[2048];

    @OriginalMember(owner = "client!a", name = "g", descriptor = "F")
    public static float field4961 = 1.0F;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Z")
    public static boolean field4967 = false;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
    private static boolean field4960 = false;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "[I")
    private static int[] field4965 = new int[512];

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
    private static int[] field4970 = new int[1024];

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
    private static boolean field4971 = false;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
    public static boolean field4966 = false;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
    public static boolean field4972 = true;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    private static int field4969;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Ltm;")
    public static class80 field4968;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method2210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
            if (arg0 < field4969) {
                if (arg1 > field4969) {
                    arg1 = field4969;
                }
                if (arg2 > field4969) {
                    arg2 = field4969;
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
                        int var15 = field4970[arg0];
                        while (true) {
                            var14--;
                            if (var14 < 0) {
                                while (true) {
                                    var13--;
                                    if (var13 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var15, arg6, 0, var11 >> 16, var12 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var15 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var15, arg6, 0, var11 >> 16, var10 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var15 += class270.field4406;
                        }
                    } else {
                        int var16 = arg2 - arg1;
                        int var17 = arg1 - arg0;
                        int var18 = field4970[arg0];
                        while (true) {
                            var17--;
                            if (var17 < 0) {
                                while (true) {
                                    var16--;
                                    if (var16 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var18, arg6, 0, var12 >> 16, var11 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var18 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var18, arg6, 0, var10 >> 16, var11 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var18 += class270.field4406;
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
                        int var24 = field4970[arg0];
                        while (true) {
                            var23--;
                            if (var23 < 0) {
                                while (true) {
                                    var22--;
                                    if (var22 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var24, arg6, 0, var21 >> 16, var19 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var24 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var24, arg6, 0, var20 >> 16, var19 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var24 += class270.field4406;
                        }
                    } else {
                        int var25 = arg1 - arg2;
                        int var26 = arg2 - arg0;
                        int var27 = field4970[arg0];
                        while (true) {
                            var26--;
                            if (var26 < 0) {
                                while (true) {
                                    var25--;
                                    if (var25 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var27, arg6, 0, var19 >> 16, var21 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var27 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var27, arg6, 0, var19 >> 16, var20 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var27 += class270.field4406;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field4969) {
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                if (arg0 > field4969) {
                    arg0 = field4969;
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
                        int var33 = field4970[arg1];
                        while (true) {
                            var32--;
                            if (var32 < 0) {
                                while (true) {
                                    var31--;
                                    if (var31 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var33, arg6, 0, var29 >> 16, var30 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var33 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var33, arg6, 0, var29 >> 16, var28 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var33 += class270.field4406;
                        }
                    } else {
                        int var34 = arg0 - arg2;
                        int var35 = arg2 - arg1;
                        int var36 = field4970[arg1];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var36, arg6, 0, var30 >> 16, var29 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var36 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var36, arg6, 0, var28 >> 16, var29 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var36 += class270.field4406;
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
                        int var42 = field4970[arg1];
                        while (true) {
                            var41--;
                            if (var41 < 0) {
                                while (true) {
                                    var40--;
                                    if (var40 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var42, arg6, 0, var39 >> 16, var37 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var42 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var42, arg6, 0, var38 >> 16, var37 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var42 += class270.field4406;
                        }
                    } else {
                        int var43 = arg2 - arg0;
                        int var44 = arg0 - arg1;
                        int var45 = field4970[arg1];
                        while (true) {
                            var44--;
                            if (var44 < 0) {
                                while (true) {
                                    var43--;
                                    if (var43 < 0) {
                                        return;
                                    }
                                    method2220(class270.field4403, var45, arg6, 0, var37 >> 16, var39 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var45 += class270.field4406;
                                }
                            }
                            method2220(class270.field4403, var45, arg6, 0, var37 >> 16, var38 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var45 += class270.field4406;
                        }
                    }
                }
            }
        } else if (arg2 < field4969) {
            if (arg0 > field4969) {
                arg0 = field4969;
            }
            if (arg1 > field4969) {
                arg1 = field4969;
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
                    int var51 = field4970[arg2];
                    while (true) {
                        var50--;
                        if (var50 < 0) {
                            while (true) {
                                var49--;
                                if (var49 < 0) {
                                    return;
                                }
                                method2220(class270.field4403, var51, arg6, 0, var47 >> 16, var48 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var51 += class270.field4406;
                            }
                        }
                        method2220(class270.field4403, var51, arg6, 0, var47 >> 16, var46 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var51 += class270.field4406;
                    }
                } else {
                    int var52 = arg1 - arg0;
                    int var53 = arg0 - arg2;
                    int var54 = field4970[arg2];
                    while (true) {
                        var53--;
                        if (var53 < 0) {
                            while (true) {
                                var52--;
                                if (var52 < 0) {
                                    return;
                                }
                                method2220(class270.field4403, var54, arg6, 0, var48 >> 16, var47 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var54 += class270.field4406;
                            }
                        }
                        method2220(class270.field4403, var54, arg6, 0, var46 >> 16, var47 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var54 += class270.field4406;
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
                    int var60 = field4970[arg2];
                    while (true) {
                        var59--;
                        if (var59 < 0) {
                            while (true) {
                                var58--;
                                if (var58 < 0) {
                                    return;
                                }
                                method2220(class270.field4403, var60, arg6, 0, var57 >> 16, var55 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var60 += class270.field4406;
                            }
                        }
                        method2220(class270.field4403, var60, arg6, 0, var56 >> 16, var55 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var60 += class270.field4406;
                    }
                } else {
                    int var61 = arg0 - arg1;
                    int var62 = arg1 - arg2;
                    int var63 = field4970[arg2];
                    while (true) {
                        var62--;
                        if (var62 < 0) {
                            while (true) {
                                var61--;
                                if (var61 < 0) {
                                    return;
                                }
                                method2220(class270.field4403, var63, arg6, 0, var55 >> 16, var57 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var63 += class270.field4406;
                            }
                        }
                        method2220(class270.field4403, var63, arg6, 0, var55 >> 16, var56 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var63 += class270.field4406;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 454)
    public static final void method2211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var19 = field4968.method66(arg18, field4961, (byte) 88);
        if (var19 == null || field4958 > 10) {
            int var128 = field4968.method85(arg18, (byte) -82);
            field4966 = true;
            method2224(arg0, arg1, arg2, arg3, arg4, arg5, method2215(var128, arg6), method2215(var128, arg7), method2215(var128, arg8));
            return;
        }
        field4960 = field4968.method84((byte) -119, arg18);
        field4971 = field4968.method82(arg18, -5001);
        int var20 = arg4 - arg3;
        int var21 = arg1 - arg0;
        int var22 = arg5 - arg3;
        int var23 = arg2 - arg0;
        int var24 = arg7 - arg6;
        int var25 = arg8 - arg6;
        int var26 = 0;
        if (arg0 != arg1) {
            var26 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var27 = 0;
        if (arg1 != arg2) {
            var27 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var28 = 0;
        if (arg0 != arg2) {
            var28 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var29 = var20 * var23 - var21 * var22;
        if (var29 == 0) {
            return;
        }
        int var30 = (var23 * var24 - var21 * var25 << 9) / var29;
        int var31 = (var20 * var25 - var22 * var24 << 9) / var29;
        int var32 = arg9 - arg10;
        int var33 = arg12 - arg13;
        int var34 = arg15 - arg16;
        int var35 = arg11 - arg9;
        int var36 = arg14 - arg12;
        int var37 = arg17 - arg15;
        int var38 = arg12 * var35 - arg9 * var36 << 14;
        int var39 = arg15 * var36 - arg12 * var37 << 8;
        int var40 = arg9 * var37 - arg15 * var35 << 5;
        int var41 = arg12 * var32 - arg9 * var33 << 14;
        int var42 = arg15 * var33 - arg12 * var34 << 8;
        int var43 = arg9 * var34 - arg15 * var32 << 5;
        int var44 = var33 * var35 - var32 * var36 << 14;
        int var45 = var34 * var36 - var33 * var37 << 8;
        int var46 = var32 * var37 - var34 * var35 << 5;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < field4969) {
                if (arg1 > field4969) {
                    arg1 = field4969;
                }
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                int var47 = (arg6 << 9) + var30 - arg3 * var30;
                if (arg1 < arg2) {
                    int var48;
                    int var49 = var48 = arg3 << 16;
                    if (arg0 < 0) {
                        var49 -= arg0 * var28;
                        var48 -= arg0 * var26;
                        var47 -= arg0 * var31;
                        arg0 = 0;
                    }
                    int var50 = arg4 << 16;
                    if (arg1 < 0) {
                        var50 -= arg1 * var27;
                        arg1 = 0;
                    }
                    int var51 = arg0 - field4963;
                    int var52 = var40 * var51 + var38;
                    int var53 = var43 * var51 + var41;
                    int var54 = var46 * var51 + var44;
                    if (arg0 != arg1 && var28 < var26 || arg0 == arg1 && var28 > var27) {
                        int var55 = arg2 - arg1;
                        int var56 = arg1 - arg0;
                        int var57 = field4970[arg0];
                        while (true) {
                            var56--;
                            if (var56 < 0) {
                                while (true) {
                                    var55--;
                                    if (var55 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var57, var49 >> 16, var50 >> 16, var47, var30, var52, var53, var54, var39, var42, var45);
                                    var49 += var28;
                                    var50 += var27;
                                    var47 += var31;
                                    var57 += class270.field4406;
                                    var52 += var40;
                                    var53 += var43;
                                    var54 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var57, var49 >> 16, var48 >> 16, var47, var30, var52, var53, var54, var39, var42, var45);
                            var49 += var28;
                            var48 += var26;
                            var47 += var31;
                            var57 += class270.field4406;
                            var52 += var40;
                            var53 += var43;
                            var54 += var46;
                        }
                    } else {
                        int var58 = arg2 - arg1;
                        int var59 = arg1 - arg0;
                        int var60 = field4970[arg0];
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                while (true) {
                                    var58--;
                                    if (var58 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var60, var50 >> 16, var49 >> 16, var47, var30, var52, var53, var54, var39, var42, var45);
                                    var49 += var28;
                                    var50 += var27;
                                    var47 += var31;
                                    var60 += class270.field4406;
                                    var52 += var40;
                                    var53 += var43;
                                    var54 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var60, var48 >> 16, var49 >> 16, var47, var30, var52, var53, var54, var39, var42, var45);
                            var49 += var28;
                            var48 += var26;
                            var47 += var31;
                            var60 += class270.field4406;
                            var52 += var40;
                            var53 += var43;
                            var54 += var46;
                        }
                    }
                } else {
                    int var61;
                    int var62 = var61 = arg3 << 16;
                    if (arg0 < 0) {
                        var62 -= arg0 * var28;
                        var61 -= arg0 * var26;
                        var47 -= arg0 * var31;
                        arg0 = 0;
                    }
                    int var63 = arg5 << 16;
                    if (arg2 < 0) {
                        var63 -= arg2 * var27;
                        arg2 = 0;
                    }
                    int var64 = arg0 - field4963;
                    int var65 = var40 * var64 + var38;
                    int var66 = var43 * var64 + var41;
                    int var67 = var46 * var64 + var44;
                    if (arg0 != arg2 && var28 < var26 || arg0 == arg2 && var27 > var26) {
                        int var68 = arg1 - arg2;
                        int var69 = arg2 - arg0;
                        int var70 = field4970[arg0];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var70, var63 >> 16, var61 >> 16, var47, var30, var65, var66, var67, var39, var42, var45);
                                    var63 += var27;
                                    var61 += var26;
                                    var47 += var31;
                                    var70 += class270.field4406;
                                    var65 += var40;
                                    var66 += var43;
                                    var67 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var70, var62 >> 16, var61 >> 16, var47, var30, var65, var66, var67, var39, var42, var45);
                            var62 += var28;
                            var61 += var26;
                            var47 += var31;
                            var70 += class270.field4406;
                            var65 += var40;
                            var66 += var43;
                            var67 += var46;
                        }
                    } else {
                        int var71 = arg1 - arg2;
                        int var72 = arg2 - arg0;
                        int var73 = field4970[arg0];
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var73, var61 >> 16, var63 >> 16, var47, var30, var65, var66, var67, var39, var42, var45);
                                    var63 += var27;
                                    var61 += var26;
                                    var47 += var31;
                                    var73 += class270.field4406;
                                    var65 += var40;
                                    var66 += var43;
                                    var67 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var73, var61 >> 16, var62 >> 16, var47, var30, var65, var66, var67, var39, var42, var45);
                            var62 += var28;
                            var61 += var26;
                            var47 += var31;
                            var73 += class270.field4406;
                            var65 += var40;
                            var66 += var43;
                            var67 += var46;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field4969) {
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                if (arg0 > field4969) {
                    arg0 = field4969;
                }
                int var74 = (arg7 << 9) + var30 - arg4 * var30;
                if (arg2 < arg0) {
                    int var75;
                    int var76 = var75 = arg4 << 16;
                    if (arg1 < 0) {
                        var76 -= arg1 * var26;
                        var75 -= arg1 * var27;
                        var74 -= arg1 * var31;
                        arg1 = 0;
                    }
                    int var77 = arg5 << 16;
                    if (arg2 < 0) {
                        var77 -= arg2 * var28;
                        arg2 = 0;
                    }
                    int var78 = arg1 - field4963;
                    int var79 = var40 * var78 + var38;
                    int var80 = var43 * var78 + var41;
                    int var81 = var46 * var78 + var44;
                    if ((arg1 == arg2 || var26 >= var27) && (arg1 != arg2 || var26 <= var28)) {
                        int var85 = arg0 - arg2;
                        int var86 = arg2 - arg1;
                        int var87 = field4970[arg1];
                        while (true) {
                            var86--;
                            if (var86 < 0) {
                                while (true) {
                                    var85--;
                                    if (var85 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var87, var77 >> 16, var76 >> 16, var74, var30, var79, var80, var81, var39, var42, var45);
                                    var76 += var26;
                                    var77 += var28;
                                    var74 += var31;
                                    var87 += class270.field4406;
                                    var79 += var40;
                                    var80 += var43;
                                    var81 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var87, var75 >> 16, var76 >> 16, var74, var30, var79, var80, var81, var39, var42, var45);
                            var76 += var26;
                            var75 += var27;
                            var74 += var31;
                            var87 += class270.field4406;
                            var79 += var40;
                            var80 += var43;
                            var81 += var46;
                        }
                    } else {
                        int var82 = arg0 - arg2;
                        int var83 = arg2 - arg1;
                        int var84 = field4970[arg1];
                        while (true) {
                            var83--;
                            if (var83 < 0) {
                                while (true) {
                                    var82--;
                                    if (var82 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var84, var76 >> 16, var77 >> 16, var74, var30, var79, var80, var81, var39, var42, var45);
                                    var76 += var26;
                                    var77 += var28;
                                    var74 += var31;
                                    var84 += class270.field4406;
                                    var79 += var40;
                                    var80 += var43;
                                    var81 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var84, var76 >> 16, var75 >> 16, var74, var30, var79, var80, var81, var39, var42, var45);
                            var76 += var26;
                            var75 += var27;
                            var74 += var31;
                            var84 += class270.field4406;
                            var79 += var40;
                            var80 += var43;
                            var81 += var46;
                        }
                    }
                } else {
                    int var88;
                    int var89 = var88 = arg4 << 16;
                    if (arg1 < 0) {
                        var89 -= arg1 * var26;
                        var88 -= arg1 * var27;
                        var74 -= arg1 * var31;
                        arg1 = 0;
                    }
                    int var90 = arg3 << 16;
                    if (arg0 < 0) {
                        var90 -= arg0 * var28;
                        arg0 = 0;
                    }
                    int var91 = arg1 - field4963;
                    int var92 = var40 * var91 + var38;
                    int var93 = var43 * var91 + var41;
                    int var94 = var46 * var91 + var44;
                    if (var26 < var27) {
                        int var95 = arg2 - arg0;
                        int var96 = arg0 - arg1;
                        int var97 = field4970[arg1];
                        while (true) {
                            var96--;
                            if (var96 < 0) {
                                while (true) {
                                    var95--;
                                    if (var95 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var97, var90 >> 16, var88 >> 16, var74, var30, var92, var93, var94, var39, var42, var45);
                                    var90 += var28;
                                    var88 += var27;
                                    var74 += var31;
                                    var97 += class270.field4406;
                                    var92 += var40;
                                    var93 += var43;
                                    var94 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var97, var89 >> 16, var88 >> 16, var74, var30, var92, var93, var94, var39, var42, var45);
                            var89 += var26;
                            var88 += var27;
                            var74 += var31;
                            var97 += class270.field4406;
                            var92 += var40;
                            var93 += var43;
                            var94 += var46;
                        }
                    } else {
                        int var98 = arg2 - arg0;
                        int var99 = arg0 - arg1;
                        int var100 = field4970[arg1];
                        while (true) {
                            var99--;
                            if (var99 < 0) {
                                while (true) {
                                    var98--;
                                    if (var98 < 0) {
                                        return;
                                    }
                                    method2225(class270.field4403, var19, 0, 0, var100, var88 >> 16, var90 >> 16, var74, var30, var92, var93, var94, var39, var42, var45);
                                    var90 += var28;
                                    var88 += var27;
                                    var74 += var31;
                                    var100 += class270.field4406;
                                    var92 += var40;
                                    var93 += var43;
                                    var94 += var46;
                                }
                            }
                            method2225(class270.field4403, var19, 0, 0, var100, var88 >> 16, var89 >> 16, var74, var30, var92, var93, var94, var39, var42, var45);
                            var89 += var26;
                            var88 += var27;
                            var74 += var31;
                            var100 += class270.field4406;
                            var92 += var40;
                            var93 += var43;
                            var94 += var46;
                        }
                    }
                }
            }
        } else if (arg2 < field4969) {
            if (arg0 > field4969) {
                arg0 = field4969;
            }
            if (arg1 > field4969) {
                arg1 = field4969;
            }
            int var101 = (arg8 << 9) + var30 - arg5 * var30;
            if (arg0 < arg1) {
                int var102;
                int var103 = var102 = arg5 << 16;
                if (arg2 < 0) {
                    var103 -= arg2 * var27;
                    var102 -= arg2 * var28;
                    var101 -= arg2 * var31;
                    arg2 = 0;
                }
                int var104 = arg3 << 16;
                if (arg0 < 0) {
                    var104 -= arg0 * var26;
                    arg0 = 0;
                }
                int var105 = arg2 - field4963;
                int var106 = var40 * var105 + var38;
                int var107 = var43 * var105 + var41;
                int var108 = var46 * var105 + var44;
                if (var27 < var28) {
                    int var109 = arg1 - arg0;
                    int var110 = arg0 - arg2;
                    int var111 = field4970[arg2];
                    while (true) {
                        var110--;
                        if (var110 < 0) {
                            while (true) {
                                var109--;
                                if (var109 < 0) {
                                    return;
                                }
                                method2225(class270.field4403, var19, 0, 0, var111, var103 >> 16, var104 >> 16, var101, var30, var106, var107, var108, var39, var42, var45);
                                var103 += var27;
                                var104 += var26;
                                var101 += var31;
                                var111 += class270.field4406;
                                var106 += var40;
                                var107 += var43;
                                var108 += var46;
                            }
                        }
                        method2225(class270.field4403, var19, 0, 0, var111, var103 >> 16, var102 >> 16, var101, var30, var106, var107, var108, var39, var42, var45);
                        var103 += var27;
                        var102 += var28;
                        var101 += var31;
                        var111 += class270.field4406;
                        var106 += var40;
                        var107 += var43;
                        var108 += var46;
                    }
                } else {
                    int var112 = arg1 - arg0;
                    int var113 = arg0 - arg2;
                    int var114 = field4970[arg2];
                    while (true) {
                        var113--;
                        if (var113 < 0) {
                            while (true) {
                                var112--;
                                if (var112 < 0) {
                                    return;
                                }
                                method2225(class270.field4403, var19, 0, 0, var114, var104 >> 16, var103 >> 16, var101, var30, var106, var107, var108, var39, var42, var45);
                                var103 += var27;
                                var104 += var26;
                                var101 += var31;
                                var114 += class270.field4406;
                                var106 += var40;
                                var107 += var43;
                                var108 += var46;
                            }
                        }
                        method2225(class270.field4403, var19, 0, 0, var114, var102 >> 16, var103 >> 16, var101, var30, var106, var107, var108, var39, var42, var45);
                        var103 += var27;
                        var102 += var28;
                        var101 += var31;
                        var114 += class270.field4406;
                        var106 += var40;
                        var107 += var43;
                        var108 += var46;
                    }
                }
            } else {
                int var115;
                int var116 = var115 = arg5 << 16;
                if (arg2 < 0) {
                    var116 -= arg2 * var27;
                    var115 -= arg2 * var28;
                    var101 -= arg2 * var31;
                    arg2 = 0;
                }
                int var117 = arg4 << 16;
                if (arg1 < 0) {
                    var117 -= arg1 * var26;
                    arg1 = 0;
                }
                int var118 = arg2 - field4963;
                int var119 = var40 * var118 + var38;
                int var120 = var43 * var118 + var41;
                int var121 = var46 * var118 + var44;
                if (var27 < var28) {
                    int var122 = arg0 - arg1;
                    int var123 = arg1 - arg2;
                    int var124 = field4970[arg2];
                    while (true) {
                        var123--;
                        if (var123 < 0) {
                            while (true) {
                                var122--;
                                if (var122 < 0) {
                                    return;
                                }
                                method2225(class270.field4403, var19, 0, 0, var124, var117 >> 16, var115 >> 16, var101, var30, var119, var120, var121, var39, var42, var45);
                                var117 += var26;
                                var115 += var28;
                                var101 += var31;
                                var124 += class270.field4406;
                                var119 += var40;
                                var120 += var43;
                                var121 += var46;
                            }
                        }
                        method2225(class270.field4403, var19, 0, 0, var124, var116 >> 16, var115 >> 16, var101, var30, var119, var120, var121, var39, var42, var45);
                        var116 += var27;
                        var115 += var28;
                        var101 += var31;
                        var124 += class270.field4406;
                        var119 += var40;
                        var120 += var43;
                        var121 += var46;
                    }
                } else {
                    int var125 = arg0 - arg1;
                    int var126 = arg1 - arg2;
                    int var127 = field4970[arg2];
                    while (true) {
                        var126--;
                        if (var126 < 0) {
                            while (true) {
                                var125--;
                                if (var125 < 0) {
                                    return;
                                }
                                method2225(class270.field4403, var19, 0, 0, var127, var115 >> 16, var117 >> 16, var101, var30, var119, var120, var121, var39, var42, var45);
                                var117 += var26;
                                var115 += var28;
                                var101 += var31;
                                var127 += class270.field4406;
                                var119 += var40;
                                var120 += var43;
                                var121 += var46;
                            }
                        }
                        method2225(class270.field4403, var19, 0, 0, var127, var115 >> 16, var116 >> 16, var101, var30, var119, var120, var121, var39, var42, var45);
                        var116 += var27;
                        var115 += var28;
                        var101 += var31;
                        var127 += class270.field4406;
                        var119 += var40;
                        var120 += var43;
                        var121 += var46;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 1096)
    public static void method2212() {
        field4970 = null;
        field4956 = null;
        field4968 = null;
        field4965 = null;
        field4955 = null;
        field4959 = null;
        field4957 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BIIII)V", line = 1105)
    private static final void method2213(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= arg4) {
            return;
        }
        int var5 = arg1 + arg3;
        int var6 = arg4 - arg3 >> 2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var7 = arg4 - arg3 & 0x3;
                while (true) {
                    var7--;
                    if (var7 < 0) {
                        return;
                    }
                    arg0[var5++] = 1;
                }
            }
            arg0[var5++] = 1;
            arg0[var5++] = 1;
            arg0[var5++] = 1;
            arg0[var5++] = 1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(F)V", line = 1126)
    private static final void method2214(float arg0) {
        field4961 = arg0;
        field4961 = (float) ((double) field4961 + (Math.random() * 0.03D - 0.015D));
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 1130)
    private static final int method2215(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(F)V", line = 1141)
    public static final void method2216(float arg0) {
        method2214(arg0);
        method2232(0, 512);
    }

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field4965[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field4955[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field4959[var2] = (int) (Math.sin((double) var2 * 0.0030679615D) * 65536.0D);
            field4957[var2] = (int) (Math.cos((double) var2 * 0.0030679615D) * 65536.0D);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V", line = 1149)
    public static final void method2217(int arg0, int arg1) {
        int var2 = field4970[0];
        int var3 = var2 / class270.field4406;
        int var4 = var2 - class270.field4406 * var3;
        field4964 = arg0 - var4;
        field4963 = arg1 - var3;
        class22.field559 = -field4964;
        class349.field5581 = field4962 - field4964;
        class349.field5587 = -field4963;
        class7.field264 = field4969 - field4963;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 1162)
    private static final void method2218(int arg0, int arg1, int arg2, int arg3) {
        field4962 = arg2 - arg0;
        field4969 = arg3 - arg1;
        method2228();
        if (field4970.length < field4969) {
            field4970 = new int[class311.method2264(field4969, (byte) -108)];
        }
        int var4 = class270.field4406 * arg1 + arg0;
        for (int var5 = 0; var5 < field4969; var5++) {
            field4970[var5] = var4;
            var4 += class270.field4406;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V", line = 1182)
    public static final void method2219(int arg0, int arg1, int arg2) {
        field4967 = arg0 < 0 || arg0 > field4962 || arg1 < 0 || arg1 > field4962 || arg2 < 0 || arg2 > field4962;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIIII)V", line = 1185)
    private static final void method2220(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field4967) {
            if (arg5 > field4962) {
                arg5 = field4962;
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
        if (field4958 == 0) {
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
        } else if (field4958 == 254) {
            while (true) {
                var7--;
                if (var7 < 0) {
                    int var9 = arg5 - arg4 & 0x3;
                    while (true) {
                        var9--;
                        if (var9 < 0) {
                            return;
                        }
                        arg0[var6++] = arg0[var6];
                    }
                }
                arg0[var6++] = arg0[var6];
                arg0[var6++] = arg0[var6];
                arg0[var6++] = arg0[var6];
                arg0[var6++] = arg0[var6];
            }
        } else {
            int var10 = field4958;
            int var11 = 256 - field4958;
            int var12 = ((arg2 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var11 >> 8 & 0xFF00);
            while (true) {
                var7--;
                if (var7 < 0) {
                    int var17 = arg5 - arg4 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return;
                        }
                        int var18 = arg0[var6];
                        arg0[var6++] = ((var18 & 0xFF00) * var10 >> 8 & 0xFF00) + ((var18 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + var12;
                    }
                }
                int var13 = arg0[var6];
                arg0[var6++] = ((var13 & 0xFF00) * var10 >> 8 & 0xFF00) + ((var13 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + var12;
                int var14 = arg0[var6];
                arg0[var6++] = ((var14 & 0xFF00) * var10 >> 8 & 0xFF00) + ((var14 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + var12;
                int var15 = arg0[var6];
                arg0[var6++] = ((var15 & 0xFF00) * var10 >> 8 & 0xFF00) + ((var15 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + var12;
                int var16 = arg0[var6];
                arg0[var6++] = ((var16 & 0xFF00) * var10 >> 8 & 0xFF00) + ((var16 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIIIIII)V", line = 1273)
    private static final void method2221(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (field4967) {
            if (arg5 > field4962) {
                arg5 = field4962;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var8 = arg1 + arg4;
        int var9 = arg4 * arg7 + arg6;
        if (!field4972) {
            int var27 = arg5 - arg4;
            if (field4958 == 0) {
                do {
                    arg0[var8++] = field4956[var9 >> 8];
                    var9 += arg7;
                    var27--;
                } while (var27 > 0);
            } else {
                int var28 = field4958;
                int var29 = 256 - field4958;
                do {
                    int var30 = field4956[var9 >> 8];
                    var9 += arg7;
                    int var31 = ((var30 & 0xFF00FF) * var29 >> 8 & 0xFF00FF) + ((var30 & 0xFF00) * var29 >> 8 & 0xFF00);
                    int var32 = arg0[var8];
                    arg0[var8++] = ((var32 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
                    var27--;
                } while (var27 > 0);
            }
            return;
        }
        int var10 = arg5 - arg4 >> 2;
        int var11 = arg7 << 2;
        if (field4958 == 0) {
            if (var10 > 0) {
                do {
                    int var12 = field4956[var9 >> 8];
                    var9 += var11;
                    arg0[var8++] = var12;
                    arg0[var8++] = var12;
                    arg0[var8++] = var12;
                    arg0[var8++] = var12;
                    var10--;
                } while (var10 > 0);
            }
            int var13 = arg5 - arg4 & 0x3;
            if (var13 > 0) {
                int var14 = field4956[var9 >> 8];
                do {
                    arg0[var8++] = var14;
                    var13--;
                } while (var13 > 0);
            }
            return;
        }
        int var15 = field4958;
        int var16 = 256 - field4958;
        if (var10 > 0) {
            do {
                int var17 = field4956[var9 >> 8];
                var9 += var11;
                int var18 = ((var17 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var16 >> 8 & 0xFF00);
                int var19 = arg0[var8];
                arg0[var8++] = ((var19 & 0xFF00) * var15 >> 8 & 0xFF00) + ((var19 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var18;
                int var20 = arg0[var8];
                arg0[var8++] = ((var20 & 0xFF00) * var15 >> 8 & 0xFF00) + ((var20 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var18;
                int var21 = arg0[var8];
                arg0[var8++] = ((var21 & 0xFF00) * var15 >> 8 & 0xFF00) + ((var21 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var18;
                int var22 = arg0[var8];
                arg0[var8++] = ((var22 & 0xFF00) * var15 >> 8 & 0xFF00) + ((var22 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var18;
                var10--;
            } while (var10 > 0);
        }
        int var23 = arg5 - arg4 & 0x3;
        if (var23 <= 0) {
            return;
        }
        int var24 = field4956[var9 >> 8];
        int var25 = ((var24 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var24 & 0xFF00) * var16 >> 8 & 0xFF00);
        do {
            int var26 = arg0[var8];
            arg0[var8++] = ((var26 & 0xFF00) * var15 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var25;
            var23--;
        } while (var23 > 0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()I", line = 1399)
    public static final int method2222() {
        return field4970[0] / class270.field4406;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V", line = 1405)
    private static final void method2223(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (field4967) {
            if (arg6 > field4962) {
                arg6 = field4962;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var15 = arg4 + arg5;
        int var16 = arg5 * arg8 + arg7;
        int var17 = arg6 - arg5;
        if (!field4960) {
            int var70 = arg5 - field4964;
            int var71 = arg12 * var70 + arg9;
            int var72 = arg13 * var70 + arg10;
            int var73 = arg14 * var70 + arg11;
            int var74 = var73 >> 14;
            int var75;
            int var76;
            if (var74 == 0) {
                var75 = 0;
                var76 = 0;
            } else {
                var75 = var71 / var74;
                var76 = var72 / var74;
            }
            int var77 = arg12 * var17 + var71;
            int var78 = arg13 * var17 + var72;
            int var79 = arg14 * var17 + var73;
            int var80 = var79 >> 14;
            int var81;
            int var82;
            if (var80 == 0) {
                var81 = 0;
                var82 = 0;
            } else {
                var81 = var77 / var80;
                var82 = var78 / var80;
            }
            int var83 = (var75 << 18) + var76;
            int var84 = ((var81 - var75) / var17 << 18) + (var82 - var76) / var17;
            int var85 = var17 >> 3;
            int var86 = arg8 << 3;
            int var87 = var16 >> 8;
            if (field4971) {
                if (var85 > 0) {
                    do {
                        int var88 = arg1[(var83 >>> 25) + (var83 & 0x3F80)];
                        arg0[var15++] = ((var88 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var88 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var89 = var83 + var84;
                        int var90 = arg1[(var89 >>> 25) + (var89 & 0x3F80)];
                        arg0[var15++] = ((var90 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var90 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var91 = var84 + var89;
                        int var92 = arg1[(var91 >>> 25) + (var91 & 0x3F80)];
                        arg0[var15++] = ((var92 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var92 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var93 = var84 + var91;
                        int var94 = arg1[(var93 >>> 25) + (var93 & 0x3F80)];
                        arg0[var15++] = ((var94 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var94 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var95 = var84 + var93;
                        int var96 = arg1[(var95 >>> 25) + (var95 & 0x3F80)];
                        arg0[var15++] = ((var96 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var96 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var97 = var84 + var95;
                        int var98 = arg1[(var97 >>> 25) + (var97 & 0x3F80)];
                        arg0[var15++] = ((var98 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var98 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var99 = var84 + var97;
                        int var100 = arg1[(var99 >>> 25) + (var99 & 0x3F80)];
                        arg0[var15++] = ((var100 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var100 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        int var101 = var84 + var99;
                        int var102 = arg1[(var101 >>> 25) + (var101 & 0x3F80)];
                        arg0[var15++] = ((var102 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var102 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        var83 = var84 + var101;
                        var16 += var86;
                        var87 = var16 >> 8;
                        var85--;
                    } while (var85 > 0);
                }
                int var103 = arg6 - arg5 & 0x7;
                if (var103 > 0) {
                    do {
                        int var104 = arg1[(var83 >>> 25) + (var83 & 0x3F80)];
                        arg0[var15++] = ((var104 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var104 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        var83 += var84;
                        var103--;
                    } while (var103 > 0);
                }
            } else {
                if (var85 > 0) {
                    do {
                        int var105;
                        if ((var105 = arg1[(var83 >>> 25) + (var83 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var105 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var105 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var106 = var83 + var84;
                        int var107;
                        if ((var107 = arg1[(var106 >>> 25) + (var106 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var107 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var107 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var108 = var84 + var106;
                        int var109;
                        if ((var109 = arg1[(var108 >>> 25) + (var108 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var109 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var109 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var110 = var84 + var108;
                        int var111;
                        if ((var111 = arg1[(var110 >>> 25) + (var110 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var111 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var111 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var112 = var84 + var110;
                        int var113;
                        if ((var113 = arg1[(var112 >>> 25) + (var112 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var113 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var113 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var114 = var84 + var112;
                        int var115;
                        if ((var115 = arg1[(var114 >>> 25) + (var114 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var115 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var115 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var116 = var84 + var114;
                        int var117;
                        if ((var117 = arg1[(var116 >>> 25) + (var116 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var117 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var117 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var118 = var84 + var116;
                        int var119;
                        if ((var119 = arg1[(var118 >>> 25) + (var118 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var119 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var119 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        var83 = var84 + var118;
                        var16 += var86;
                        var87 = var16 >> 8;
                        var85--;
                    } while (var85 > 0);
                }
                int var120 = arg6 - arg5 & 0x7;
                if (var120 > 0) {
                    do {
                        int var121;
                        if ((var121 = arg1[(var83 >>> 25) + (var83 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var121 & 0xFF00FF) * var87 & 0xFF00FF00) + ((var121 & 0xFF00) * var87 & 0xFF0000) >> 8;
                        }
                        var15++;
                        var83 += var84;
                        var120--;
                    } while (var120 > 0);
                }
            }
            return;
        }
        int var18 = arg5 - field4964;
        int var19 = arg12 * var18 + arg9;
        int var20 = arg13 * var18 + arg10;
        int var21 = arg14 * var18 + arg11;
        int var22 = var21 >> 12;
        int var23;
        int var24;
        if (var22 == 0) {
            var23 = 0;
            var24 = 0;
        } else {
            var23 = var19 / var22;
            var24 = var20 / var22;
        }
        int var25 = arg12 * var17 + var19;
        int var26 = arg13 * var17 + var20;
        int var27 = arg14 * var17 + var21;
        int var28 = var27 >> 12;
        int var29;
        int var30;
        if (var28 == 0) {
            var29 = 0;
            var30 = 0;
        } else {
            var29 = var25 / var28;
            var30 = var26 / var28;
        }
        int var31 = (var23 << 20) + var24;
        int var32 = ((var29 - var23) / var17 << 20) + (var30 - var24) / var17;
        int var33 = var17 >> 3;
        int var34 = arg8 << 3;
        int var35 = var16 >> 8;
        if (field4971) {
            if (var33 > 0) {
                do {
                    int var36 = arg1[(var31 >>> 26) + (var31 & 0xFC0)];
                    arg0[var15++] = ((var36 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var36 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var37 = var31 + var32;
                    int var38 = arg1[(var37 >>> 26) + (var37 & 0xFC0)];
                    arg0[var15++] = ((var38 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var38 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var39 = var32 + var37;
                    int var40 = arg1[(var39 >>> 26) + (var39 & 0xFC0)];
                    arg0[var15++] = ((var40 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var40 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var41 = var32 + var39;
                    int var42 = arg1[(var41 >>> 26) + (var41 & 0xFC0)];
                    arg0[var15++] = ((var42 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var42 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var43 = var32 + var41;
                    int var44 = arg1[(var43 >>> 26) + (var43 & 0xFC0)];
                    arg0[var15++] = ((var44 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var44 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var45 = var32 + var43;
                    int var46 = arg1[(var45 >>> 26) + (var45 & 0xFC0)];
                    arg0[var15++] = ((var46 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var46 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var47 = var32 + var45;
                    int var48 = arg1[(var47 >>> 26) + (var47 & 0xFC0)];
                    arg0[var15++] = ((var48 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var48 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var49 = var32 + var47;
                    int var50 = arg1[(var49 >>> 26) + (var49 & 0xFC0)];
                    arg0[var15++] = ((var50 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var50 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    var31 = var32 + var49;
                    var16 += var34;
                    var35 = var16 >> 8;
                    var33--;
                } while (var33 > 0);
            }
            int var51 = arg6 - arg5 & 0x7;
            if (var51 > 0) {
                do {
                    int var52 = arg1[(var31 >>> 26) + (var31 & 0xFC0)];
                    arg0[var15++] = ((var52 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var52 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    var31 += var32;
                    var51--;
                } while (var51 > 0);
            }
            return;
        }
        if (var33 > 0) {
            do {
                int var53;
                if ((var53 = arg1[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var53 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var53 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var54 = var31 + var32;
                int var55;
                if ((var55 = arg1[(var54 >>> 26) + (var54 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var55 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var55 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var56 = var32 + var54;
                int var57;
                if ((var57 = arg1[(var56 >>> 26) + (var56 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var57 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var57 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var58 = var32 + var56;
                int var59;
                if ((var59 = arg1[(var58 >>> 26) + (var58 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var59 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var59 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var60 = var32 + var58;
                int var61;
                if ((var61 = arg1[(var60 >>> 26) + (var60 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var61 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var61 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var62 = var32 + var60;
                int var63;
                if ((var63 = arg1[(var62 >>> 26) + (var62 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var63 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var63 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var64 = var32 + var62;
                int var65;
                if ((var65 = arg1[(var64 >>> 26) + (var64 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var65 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var65 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var66 = var32 + var64;
                int var67;
                if ((var67 = arg1[(var66 >>> 26) + (var66 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var67 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var67 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                var31 = var32 + var66;
                var16 += var34;
                var35 = var16 >> 8;
                var33--;
            } while (var33 > 0);
        }
        int var68 = arg6 - arg5 & 0x7;
        if (var68 <= 0) {
            return;
        }
        do {
            int var69;
            if ((var69 = arg1[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                arg0[var15] = ((var69 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var69 & 0xFF00) * var35 & 0xFF0000) >> 8;
            }
            var15++;
            var31 += var32;
            var68--;
        } while (var68 > 0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIII)V", line = 1790)
    public static final void method2224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg4 - arg3;
        int var10 = arg1 - arg0;
        int var11 = arg5 - arg3;
        int var12 = arg2 - arg0;
        int var13 = arg7 - arg6;
        int var14 = arg8 - arg6;
        int var15;
        if (arg1 == arg2) {
            var15 = 0;
        } else {
            var15 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var16;
        if (arg0 == arg1) {
            var16 = 0;
        } else {
            var16 = (var9 << 16) / var10;
        }
        int var17;
        if (arg0 == arg2) {
            var17 = 0;
        } else {
            var17 = (var11 << 16) / var12;
        }
        int var18 = var9 * var12 - var10 * var11;
        if (var18 == 0) {
            return;
        }
        int var19 = (var12 * var13 - var10 * var14 << 8) / var18;
        int var20 = (var9 * var14 - var11 * var13 << 8) / var18;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < field4969) {
                if (arg1 > field4969) {
                    arg1 = field4969;
                }
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                int var21 = (arg6 << 8) + var19 - arg3 * var19;
                if (arg1 < arg2) {
                    int var22;
                    int var23 = var22 = arg3 << 16;
                    if (arg0 < 0) {
                        var23 -= arg0 * var17;
                        var22 -= arg0 * var16;
                        var21 -= arg0 * var20;
                        arg0 = 0;
                    }
                    int var24 = arg4 << 16;
                    if (arg1 < 0) {
                        var24 -= arg1 * var15;
                        arg1 = 0;
                    }
                    if ((arg0 == arg1 || var17 >= var16) && (arg0 != arg1 || var17 <= var15)) {
                        int var28 = arg2 - arg1;
                        int var29 = arg1 - arg0;
                        int var30 = field4970[arg0];
                        while (true) {
                            var29--;
                            if (var29 < 0) {
                                while (true) {
                                    var28--;
                                    if (var28 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var30, 0, 0, var24 >> 16, var23 >> 16, var21, var19);
                                    var23 += var17;
                                    var24 += var15;
                                    var21 += var20;
                                    var30 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var30, 0, 0, var22 >> 16, var23 >> 16, var21, var19);
                            var23 += var17;
                            var22 += var16;
                            var21 += var20;
                            var30 += class270.field4406;
                        }
                    } else {
                        int var25 = arg2 - arg1;
                        int var26 = arg1 - arg0;
                        int var27 = field4970[arg0];
                        while (true) {
                            var26--;
                            if (var26 < 0) {
                                while (true) {
                                    var25--;
                                    if (var25 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var27, 0, 0, var23 >> 16, var24 >> 16, var21, var19);
                                    var23 += var17;
                                    var24 += var15;
                                    var21 += var20;
                                    var27 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var27, 0, 0, var23 >> 16, var22 >> 16, var21, var19);
                            var23 += var17;
                            var22 += var16;
                            var21 += var20;
                            var27 += class270.field4406;
                        }
                    }
                } else {
                    int var31;
                    int var32 = var31 = arg3 << 16;
                    if (arg0 < 0) {
                        var32 -= arg0 * var17;
                        var31 -= arg0 * var16;
                        var21 -= arg0 * var20;
                        arg0 = 0;
                    }
                    int var33 = arg5 << 16;
                    if (arg2 < 0) {
                        var33 -= arg2 * var15;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var17 < var16 || arg0 == arg2 && var15 > var16) {
                        int var34 = arg1 - arg2;
                        int var35 = arg2 - arg0;
                        int var36 = field4970[arg0];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var36, 0, 0, var33 >> 16, var31 >> 16, var21, var19);
                                    var33 += var15;
                                    var31 += var16;
                                    var21 += var20;
                                    var36 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var36, 0, 0, var32 >> 16, var31 >> 16, var21, var19);
                            var32 += var17;
                            var31 += var16;
                            var21 += var20;
                            var36 += class270.field4406;
                        }
                    } else {
                        int var37 = arg1 - arg2;
                        int var38 = arg2 - arg0;
                        int var39 = field4970[arg0];
                        while (true) {
                            var38--;
                            if (var38 < 0) {
                                while (true) {
                                    var37--;
                                    if (var37 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var39, 0, 0, var31 >> 16, var33 >> 16, var21, var19);
                                    var33 += var15;
                                    var31 += var16;
                                    var21 += var20;
                                    var39 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var39, 0, 0, var31 >> 16, var32 >> 16, var21, var19);
                            var32 += var17;
                            var31 += var16;
                            var21 += var20;
                            var39 += class270.field4406;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field4969) {
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                if (arg0 > field4969) {
                    arg0 = field4969;
                }
                int var40 = (arg7 << 8) + var19 - arg4 * var19;
                if (arg2 < arg0) {
                    int var41;
                    int var42 = var41 = arg4 << 16;
                    if (arg1 < 0) {
                        var42 -= arg1 * var16;
                        var41 -= arg1 * var15;
                        var40 -= arg1 * var20;
                        arg1 = 0;
                    }
                    int var43 = arg5 << 16;
                    if (arg2 < 0) {
                        var43 -= arg2 * var17;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var16 >= var15) && (arg1 != arg2 || var16 <= var17)) {
                        int var47 = arg0 - arg2;
                        int var48 = arg2 - arg1;
                        int var49 = field4970[arg1];
                        while (true) {
                            var48--;
                            if (var48 < 0) {
                                while (true) {
                                    var47--;
                                    if (var47 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var49, 0, 0, var43 >> 16, var42 >> 16, var40, var19);
                                    var42 += var16;
                                    var43 += var17;
                                    var40 += var20;
                                    var49 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var49, 0, 0, var41 >> 16, var42 >> 16, var40, var19);
                            var42 += var16;
                            var41 += var15;
                            var40 += var20;
                            var49 += class270.field4406;
                        }
                    } else {
                        int var44 = arg0 - arg2;
                        int var45 = arg2 - arg1;
                        int var46 = field4970[arg1];
                        while (true) {
                            var45--;
                            if (var45 < 0) {
                                while (true) {
                                    var44--;
                                    if (var44 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var46, 0, 0, var42 >> 16, var43 >> 16, var40, var19);
                                    var42 += var16;
                                    var43 += var17;
                                    var40 += var20;
                                    var46 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var46, 0, 0, var42 >> 16, var41 >> 16, var40, var19);
                            var42 += var16;
                            var41 += var15;
                            var40 += var20;
                            var46 += class270.field4406;
                        }
                    }
                } else {
                    int var50;
                    int var51 = var50 = arg4 << 16;
                    if (arg1 < 0) {
                        var51 -= arg1 * var16;
                        var50 -= arg1 * var15;
                        var40 -= arg1 * var20;
                        arg1 = 0;
                    }
                    int var52 = arg3 << 16;
                    if (arg0 < 0) {
                        var52 -= arg0 * var17;
                        arg0 = 0;
                    }
                    if (var16 < var15) {
                        int var53 = arg2 - arg0;
                        int var54 = arg0 - arg1;
                        int var55 = field4970[arg1];
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                while (true) {
                                    var53--;
                                    if (var53 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var55, 0, 0, var52 >> 16, var50 >> 16, var40, var19);
                                    var52 += var17;
                                    var50 += var15;
                                    var40 += var20;
                                    var55 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var55, 0, 0, var51 >> 16, var50 >> 16, var40, var19);
                            var51 += var16;
                            var50 += var15;
                            var40 += var20;
                            var55 += class270.field4406;
                        }
                    } else {
                        int var56 = arg2 - arg0;
                        int var57 = arg0 - arg1;
                        int var58 = field4970[arg1];
                        while (true) {
                            var57--;
                            if (var57 < 0) {
                                while (true) {
                                    var56--;
                                    if (var56 < 0) {
                                        return;
                                    }
                                    method2221(class270.field4403, var58, 0, 0, var50 >> 16, var52 >> 16, var40, var19);
                                    var52 += var17;
                                    var50 += var15;
                                    var40 += var20;
                                    var58 += class270.field4406;
                                }
                            }
                            method2221(class270.field4403, var58, 0, 0, var50 >> 16, var51 >> 16, var40, var19);
                            var51 += var16;
                            var50 += var15;
                            var40 += var20;
                            var58 += class270.field4406;
                        }
                    }
                }
            }
        } else if (arg2 < field4969) {
            if (arg0 > field4969) {
                arg0 = field4969;
            }
            if (arg1 > field4969) {
                arg1 = field4969;
            }
            int var59 = (arg8 << 8) + var19 - arg5 * var19;
            if (arg0 < arg1) {
                int var60;
                int var61 = var60 = arg5 << 16;
                if (arg2 < 0) {
                    var61 -= arg2 * var15;
                    var60 -= arg2 * var17;
                    var59 -= arg2 * var20;
                    arg2 = 0;
                }
                int var62 = arg3 << 16;
                if (arg0 < 0) {
                    var62 -= arg0 * var16;
                    arg0 = 0;
                }
                if (var15 < var17) {
                    int var63 = arg1 - arg0;
                    int var64 = arg0 - arg2;
                    int var65 = field4970[arg2];
                    while (true) {
                        var64--;
                        if (var64 < 0) {
                            while (true) {
                                var63--;
                                if (var63 < 0) {
                                    return;
                                }
                                method2221(class270.field4403, var65, 0, 0, var61 >> 16, var62 >> 16, var59, var19);
                                var61 += var15;
                                var62 += var16;
                                var59 += var20;
                                var65 += class270.field4406;
                            }
                        }
                        method2221(class270.field4403, var65, 0, 0, var61 >> 16, var60 >> 16, var59, var19);
                        var61 += var15;
                        var60 += var17;
                        var59 += var20;
                        var65 += class270.field4406;
                    }
                } else {
                    int var66 = arg1 - arg0;
                    int var67 = arg0 - arg2;
                    int var68 = field4970[arg2];
                    while (true) {
                        var67--;
                        if (var67 < 0) {
                            while (true) {
                                var66--;
                                if (var66 < 0) {
                                    return;
                                }
                                method2221(class270.field4403, var68, 0, 0, var62 >> 16, var61 >> 16, var59, var19);
                                var61 += var15;
                                var62 += var16;
                                var59 += var20;
                                var68 += class270.field4406;
                            }
                        }
                        method2221(class270.field4403, var68, 0, 0, var60 >> 16, var61 >> 16, var59, var19);
                        var61 += var15;
                        var60 += var17;
                        var59 += var20;
                        var68 += class270.field4406;
                    }
                }
            } else {
                int var69;
                int var70 = var69 = arg5 << 16;
                if (arg2 < 0) {
                    var70 -= arg2 * var15;
                    var69 -= arg2 * var17;
                    var59 -= arg2 * var20;
                    arg2 = 0;
                }
                int var71 = arg4 << 16;
                if (arg1 < 0) {
                    var71 -= arg1 * var16;
                    arg1 = 0;
                }
                if (var15 < var17) {
                    int var72 = arg0 - arg1;
                    int var73 = arg1 - arg2;
                    int var74 = field4970[arg2];
                    while (true) {
                        var73--;
                        if (var73 < 0) {
                            while (true) {
                                var72--;
                                if (var72 < 0) {
                                    return;
                                }
                                method2221(class270.field4403, var74, 0, 0, var71 >> 16, var69 >> 16, var59, var19);
                                var71 += var16;
                                var69 += var17;
                                var59 += var20;
                                var74 += class270.field4406;
                            }
                        }
                        method2221(class270.field4403, var74, 0, 0, var70 >> 16, var69 >> 16, var59, var19);
                        var70 += var15;
                        var69 += var17;
                        var59 += var20;
                        var74 += class270.field4406;
                    }
                } else {
                    int var75 = arg0 - arg1;
                    int var76 = arg1 - arg2;
                    int var77 = field4970[arg2];
                    while (true) {
                        var76--;
                        if (var76 < 0) {
                            while (true) {
                                var75--;
                                if (var75 < 0) {
                                    return;
                                }
                                method2221(class270.field4403, var77, 0, 0, var69 >> 16, var71 >> 16, var59, var19);
                                var71 += var16;
                                var69 += var17;
                                var59 += var20;
                                var77 += class270.field4406;
                            }
                        }
                        method2221(class270.field4403, var77, 0, 0, var69 >> 16, var70 >> 16, var59, var19);
                        var70 += var15;
                        var69 += var17;
                        var59 += var20;
                        var77 += class270.field4406;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "([I[IIIIIIIIIIIIII)V", line = 2298)
    private static final void method2225(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (field4967) {
            if (arg6 > field4962) {
                arg6 = field4962;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var15 = arg4 + arg5;
        int var16 = arg5 * arg8 + arg7;
        int var17 = arg6 - arg5;
        int var10000;
        if (!field4960) {
            int var78 = arg5 - field4964;
            int var79 = (arg12 >> 3) * var78 + arg9;
            int var80 = (arg13 >> 3) * var78 + arg10;
            int var81 = (arg14 >> 3) * var78 + arg11;
            int var82 = var81 >> 14;
            int var83;
            int var84;
            if (var82 == 0) {
                var83 = 0;
                var84 = 0;
            } else {
                var83 = var79 / var82;
                var84 = var80 / var82;
            }
            int var85 = arg12 + var79;
            int var86 = arg13 + var80;
            int var87 = arg14 + var81;
            int var88 = var87 >> 14;
            int var89;
            int var90;
            if (var88 == 0) {
                var89 = 0;
                var90 = 0;
            } else {
                var89 = var85 / var88;
                var90 = var86 / var88;
            }
            int var91 = (var83 << 18) + var84;
            int var92 = (var89 - var83 >> 3 << 18) + (var90 - var84 >> 3);
            int var93 = var17 >> 3;
            int var94 = arg8 << 3;
            int var95 = var16 >> 8;
            if (field4971) {
                if (var93 > 0) {
                    do {
                        int var96 = arg1[(var91 >>> 25) + (var91 & 0x3F80)];
                        arg0[var15++] = ((var96 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var96 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var97 = var91 + var92;
                        int var98 = arg1[(var97 >>> 25) + (var97 & 0x3F80)];
                        arg0[var15++] = ((var98 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var98 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var99 = var92 + var97;
                        int var100 = arg1[(var99 >>> 25) + (var99 & 0x3F80)];
                        arg0[var15++] = ((var100 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var100 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var101 = var92 + var99;
                        int var102 = arg1[(var101 >>> 25) + (var101 & 0x3F80)];
                        arg0[var15++] = ((var102 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var102 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var103 = var92 + var101;
                        int var104 = arg1[(var103 >>> 25) + (var103 & 0x3F80)];
                        arg0[var15++] = ((var104 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var104 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var105 = var92 + var103;
                        int var106 = arg1[(var105 >>> 25) + (var105 & 0x3F80)];
                        arg0[var15++] = ((var106 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var106 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var107 = var92 + var105;
                        int var108 = arg1[(var107 >>> 25) + (var107 & 0x3F80)];
                        arg0[var15++] = ((var108 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var108 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        int var109 = var92 + var107;
                        int var110 = arg1[(var109 >>> 25) + (var109 & 0x3F80)];
                        arg0[var15++] = ((var110 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var110 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        var10000 = var92 + var109;
                        int var112 = var89;
                        int var113 = var90;
                        var85 += arg12;
                        var86 += arg13;
                        var87 += arg14;
                        int var114 = var87 >> 14;
                        if (var114 == 0) {
                            var89 = 0;
                            var90 = 0;
                        } else {
                            var89 = var85 / var114;
                            var90 = var86 / var114;
                        }
                        var91 = (var112 << 18) + var113;
                        var92 = (var89 - var112 >> 3 << 18) + (var90 - var113 >> 3);
                        var16 += var94;
                        var95 = var16 >> 8;
                        var93--;
                    } while (var93 > 0);
                }
                int var115 = arg6 - arg5 & 0x7;
                if (var115 > 0) {
                    do {
                        int var116 = arg1[(var91 >>> 25) + (var91 & 0x3F80)];
                        arg0[var15++] = ((var116 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var116 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        var91 += var92;
                        var115--;
                    } while (var115 > 0);
                }
            } else {
                if (var93 > 0) {
                    do {
                        int var117;
                        if ((var117 = arg1[(var91 >>> 25) + (var91 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var117 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var117 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var118 = var91 + var92;
                        int var119;
                        if ((var119 = arg1[(var118 >>> 25) + (var118 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var119 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var119 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var120 = var92 + var118;
                        int var121;
                        if ((var121 = arg1[(var120 >>> 25) + (var120 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var121 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var121 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var122 = var92 + var120;
                        int var123;
                        if ((var123 = arg1[(var122 >>> 25) + (var122 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var123 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var123 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var124 = var92 + var122;
                        int var125;
                        if ((var125 = arg1[(var124 >>> 25) + (var124 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var125 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var125 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var126 = var92 + var124;
                        int var127;
                        if ((var127 = arg1[(var126 >>> 25) + (var126 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var127 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var127 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var128 = var92 + var126;
                        int var129;
                        if ((var129 = arg1[(var128 >>> 25) + (var128 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var129 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var129 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        int var130 = var92 + var128;
                        int var131;
                        if ((var131 = arg1[(var130 >>> 25) + (var130 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var131 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var131 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        var10000 = var92 + var130;
                        int var133 = var89;
                        int var134 = var90;
                        var85 += arg12;
                        var86 += arg13;
                        var87 += arg14;
                        int var135 = var87 >> 14;
                        if (var135 == 0) {
                            var89 = 0;
                            var90 = 0;
                        } else {
                            var89 = var85 / var135;
                            var90 = var86 / var135;
                        }
                        var91 = (var133 << 18) + var134;
                        var92 = (var89 - var133 >> 3 << 18) + (var90 - var134 >> 3);
                        var16 += var94;
                        var95 = var16 >> 8;
                        var93--;
                    } while (var93 > 0);
                }
                int var136 = arg6 - arg5 & 0x7;
                if (var136 > 0) {
                    do {
                        int var137;
                        if ((var137 = arg1[(var91 >>> 25) + (var91 & 0x3F80)]) != 0) {
                            arg0[var15] = ((var137 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var137 & 0xFF00) * var95 & 0xFF0000) >> 8;
                        }
                        var15++;
                        var91 += var92;
                        var136--;
                    } while (var136 > 0);
                }
            }
            return;
        }
        int var18 = arg5 - field4964;
        int var19 = (arg12 >> 3) * var18 + arg9;
        int var20 = (arg13 >> 3) * var18 + arg10;
        int var21 = (arg14 >> 3) * var18 + arg11;
        int var22 = var21 >> 12;
        int var23;
        int var24;
        if (var22 == 0) {
            var23 = 0;
            var24 = 0;
        } else {
            var23 = var19 / var22;
            var24 = var20 / var22;
        }
        int var25 = arg12 + var19;
        int var26 = arg13 + var20;
        int var27 = arg14 + var21;
        int var28 = var27 >> 12;
        int var29;
        int var30;
        if (var28 == 0) {
            var29 = 0;
            var30 = 0;
        } else {
            var29 = var25 / var28;
            var30 = var26 / var28;
        }
        int var31 = (var23 << 20) + var24;
        int var32 = (var29 - var23 >> 3 << 20) + (var30 - var24 >> 3);
        int var33 = var17 >> 3;
        int var34 = arg8 << 3;
        int var35 = var16 >> 8;
        if (field4971) {
            if (var33 > 0) {
                do {
                    int var36 = arg1[(var31 >>> 26) + (var31 & 0xFC0)];
                    arg0[var15++] = ((var36 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var36 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var37 = var31 + var32;
                    int var38 = arg1[(var37 >>> 26) + (var37 & 0xFC0)];
                    arg0[var15++] = ((var38 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var38 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var39 = var32 + var37;
                    int var40 = arg1[(var39 >>> 26) + (var39 & 0xFC0)];
                    arg0[var15++] = ((var40 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var40 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var41 = var32 + var39;
                    int var42 = arg1[(var41 >>> 26) + (var41 & 0xFC0)];
                    arg0[var15++] = ((var42 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var42 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var43 = var32 + var41;
                    int var44 = arg1[(var43 >>> 26) + (var43 & 0xFC0)];
                    arg0[var15++] = ((var44 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var44 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var45 = var32 + var43;
                    int var46 = arg1[(var45 >>> 26) + (var45 & 0xFC0)];
                    arg0[var15++] = ((var46 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var46 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var47 = var32 + var45;
                    int var48 = arg1[(var47 >>> 26) + (var47 & 0xFC0)];
                    arg0[var15++] = ((var48 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var48 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    int var49 = var32 + var47;
                    int var50 = arg1[(var49 >>> 26) + (var49 & 0xFC0)];
                    arg0[var15++] = ((var50 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var50 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    var10000 = var32 + var49;
                    int var52 = var29;
                    int var53 = var30;
                    var25 += arg12;
                    var26 += arg13;
                    var27 += arg14;
                    int var54 = var27 >> 12;
                    if (var54 == 0) {
                        var29 = 0;
                        var30 = 0;
                    } else {
                        var29 = var25 / var54;
                        var30 = var26 / var54;
                    }
                    var31 = (var52 << 20) + var53;
                    var32 = (var29 - var52 >> 3 << 20) + (var30 - var53 >> 3);
                    var16 += var34;
                    var35 = var16 >> 8;
                    var33--;
                } while (var33 > 0);
            }
            int var55 = arg6 - arg5 & 0x7;
            if (var55 > 0) {
                do {
                    int var56 = arg1[(var31 >>> 26) + (var31 & 0xFC0)];
                    arg0[var15++] = ((var56 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var56 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    var31 += var32;
                    var55--;
                } while (var55 > 0);
            }
            return;
        }
        if (var33 > 0) {
            do {
                int var57;
                if ((var57 = arg1[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var57 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var57 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var58 = var31 + var32;
                int var59;
                if ((var59 = arg1[(var58 >>> 26) + (var58 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var59 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var59 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var60 = var32 + var58;
                int var61;
                if ((var61 = arg1[(var60 >>> 26) + (var60 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var61 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var61 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var62 = var32 + var60;
                int var63;
                if ((var63 = arg1[(var62 >>> 26) + (var62 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var63 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var63 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var64 = var32 + var62;
                int var65;
                if ((var65 = arg1[(var64 >>> 26) + (var64 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var65 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var65 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var66 = var32 + var64;
                int var67;
                if ((var67 = arg1[(var66 >>> 26) + (var66 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var67 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var67 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var68 = var32 + var66;
                int var69;
                if ((var69 = arg1[(var68 >>> 26) + (var68 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var69 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var69 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                int var70 = var32 + var68;
                int var71;
                if ((var71 = arg1[(var70 >>> 26) + (var70 & 0xFC0)]) != 0) {
                    arg0[var15] = ((var71 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var71 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                var15++;
                var10000 = var32 + var70;
                int var73 = var29;
                int var74 = var30;
                var25 += arg12;
                var26 += arg13;
                var27 += arg14;
                int var75 = var27 >> 12;
                if (var75 == 0) {
                    var29 = 0;
                    var30 = 0;
                } else {
                    var29 = var25 / var75;
                    var30 = var26 / var75;
                }
                var31 = (var73 << 20) + var74;
                var32 = (var29 - var73 >> 3 << 20) + (var30 - var74 >> 3);
                var16 += var34;
                var35 = var16 >> 8;
                var33--;
            } while (var33 > 0);
        }
        int var76 = arg6 - arg5 & 0x7;
        if (var76 <= 0) {
            return;
        }
        do {
            int var77;
            if ((var77 = arg1[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                arg0[var15] = ((var77 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var77 & 0xFF00) * var35 & 0xFF0000) >> 8;
            }
            var15++;
            var31 += var32;
            var76--;
        } while (var76 > 0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 2764)
    public static final void method2226() {
        method2218(class270.field4400, class270.field4407, class270.field4405, class270.field4399);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BIIIIIII)V", line = 2776)
    public static final void method2227(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        if (arg1 != arg2) {
            var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var9 = 0;
        if (arg2 != arg3) {
            var9 = (arg6 - arg5 << 16) / (arg3 - arg2);
        }
        int var10 = 0;
        if (arg1 != arg3) {
            var10 = (arg4 - arg6 << 16) / (arg1 - arg3);
        }
        if (arg1 <= arg2 && arg1 <= arg3) {
            if (arg2 < arg3) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                int var13 = arg5 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg1 == arg2 || var10 >= var8) && (arg1 != arg2 || var10 <= var9)) {
                    int var17 = arg3 - arg2;
                    int var18 = arg2 - arg1;
                    int var19 = arg1 * arg7;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method2213(arg0, var19, 0, var13 >> 16, var12 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var19 += arg7;
                            }
                        }
                        method2213(arg0, var19, 0, var11 >> 16, var12 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var19 += arg7;
                    }
                } else {
                    int var14 = arg3 - arg2;
                    int var15 = arg2 - arg1;
                    int var16 = arg1 * arg7;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method2213(arg0, var16, 0, var12 >> 16, var13 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var16 += arg7;
                            }
                        }
                        method2213(arg0, var16, 0, var12 >> 16, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += arg7;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg6 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg1 == arg3 || var10 >= var8) && (arg1 != arg3 || var9 <= var8)) {
                    int var26 = arg2 - arg3;
                    int var27 = arg3 - arg1;
                    int var28 = arg1 * arg7;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method2213(arg0, var28, 0, var20 >> 16, var22 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var28 += arg7;
                            }
                        }
                        method2213(arg0, var28, 0, var20 >> 16, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += arg7;
                    }
                } else {
                    int var23 = arg2 - arg3;
                    int var24 = arg3 - arg1;
                    int var25 = arg1 * arg7;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method2213(arg0, var25, 0, var22 >> 16, var20 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var25 += arg7;
                            }
                        }
                        method2213(arg0, var25, 0, var21 >> 16, var20 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var25 += arg7;
                    }
                }
            }
        } else if (arg2 <= arg3) {
            if (arg3 < arg1) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var8;
                    var29 -= arg2 * var9;
                    arg2 = 0;
                }
                int var31 = arg6 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg2 != arg3 && var8 < var9 || arg2 == arg3 && var8 > var10) {
                    int var32 = arg1 - arg3;
                    int var33 = arg3 - arg2;
                    int var34 = arg2 * arg7;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method2213(arg0, var34, 0, var30 >> 16, var31 >> 16);
                                var30 += var8;
                                var31 += var10;
                                var34 += arg7;
                            }
                        }
                        method2213(arg0, var34, 0, var30 >> 16, var29 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var34 += arg7;
                    }
                } else {
                    int var35 = arg1 - arg3;
                    int var36 = arg3 - arg2;
                    int var37 = arg2 * arg7;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method2213(arg0, var37, 0, var31 >> 16, var30 >> 16);
                                var30 += var8;
                                var31 += var10;
                                var37 += arg7;
                            }
                        }
                        method2213(arg0, var37, 0, var29 >> 16, var30 >> 16);
                        var30 += var8;
                        var29 += var9;
                        var37 += arg7;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg4 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var8 < var9) {
                    int var41 = arg3 - arg1;
                    int var42 = arg1 - arg2;
                    int var43 = arg2 * arg7;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method2213(arg0, var43, 0, var40 >> 16, var38 >> 16);
                                var40 += var10;
                                var38 += var9;
                                var43 += arg7;
                            }
                        }
                        method2213(arg0, var43, 0, var39 >> 16, var38 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var43 += arg7;
                    }
                } else {
                    int var44 = arg3 - arg1;
                    int var45 = arg1 - arg2;
                    int var46 = arg2 * arg7;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method2213(arg0, var46, 0, var38 >> 16, var40 >> 16);
                                var40 += var10;
                                var38 += var9;
                                var46 += arg7;
                            }
                        }
                        method2213(arg0, var46, 0, var38 >> 16, var39 >> 16);
                        var39 += var8;
                        var38 += var9;
                        var46 += arg7;
                    }
                }
            }
        } else if (arg1 < arg2) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var9;
                var47 -= arg3 * var10;
                arg3 = 0;
            }
            int var49 = arg4 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 < var10) {
                int var50 = arg2 - arg1;
                int var51 = arg1 - arg3;
                int var52 = arg3 * arg7;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method2213(arg0, var52, 0, var48 >> 16, var49 >> 16);
                            var48 += var9;
                            var49 += var8;
                            var52 += arg7;
                        }
                    }
                    method2213(arg0, var52, 0, var48 >> 16, var47 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var52 += arg7;
                }
            } else {
                int var53 = arg2 - arg1;
                int var54 = arg1 - arg3;
                int var55 = arg3 * arg7;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method2213(arg0, var55, 0, var49 >> 16, var48 >> 16);
                            var48 += var9;
                            var49 += var8;
                            var55 += arg7;
                        }
                    }
                    method2213(arg0, var55, 0, var47 >> 16, var48 >> 16);
                    var48 += var9;
                    var47 += var10;
                    var55 += arg7;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var9;
                var56 -= arg3 * var10;
                arg3 = 0;
            }
            int var58 = arg5 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var8;
                arg2 = 0;
            }
            if (var9 < var10) {
                int var59 = arg1 - arg2;
                int var60 = arg2 - arg3;
                int var61 = arg3 * arg7;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method2213(arg0, var61, 0, var58 >> 16, var56 >> 16);
                            var58 += var8;
                            var56 += var10;
                            var61 += arg7;
                        }
                    }
                    method2213(arg0, var61, 0, var57 >> 16, var56 >> 16);
                    var57 += var9;
                    var56 += var10;
                    var61 += arg7;
                }
            } else {
                int var62 = arg1 - arg2;
                int var63 = arg2 - arg3;
                int var64 = arg3 * arg7;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method2213(arg0, var64, 0, var56 >> 16, var58 >> 16);
                            var58 += var8;
                            var56 += var10;
                            var64 += arg7;
                        }
                    }
                    method2213(arg0, var64, 0, var56 >> 16, var57 >> 16);
                    var57 += var9;
                    var56 += var10;
                    var64 += arg7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 3199)
    public static final void method2228() {
        field4964 = field4962 / 2;
        field4963 = field4969 / 2;
        class22.field559 = -field4964;
        class349.field5581 = field4962 - field4964;
        class349.field5587 = -field4963;
        class7.field264 = field4969 - field4963;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()I", line = 3217)
    public static final int method2229() {
        return field4970[0] % class270.field4406;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ltm;)V", line = 3220)
    public static final void method2230(class80 arg0) {
        field4968 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 3228)
    public static final void method2231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var19 = field4968.method66(arg18, field4961, (byte) 88);
        if (var19 == null) {
            int var20 = field4968.method85(arg18, (byte) -82);
            method2224(arg0, arg1, arg2, arg3, arg4, arg5, method2215(var20, arg6), method2215(var20, arg7), method2215(var20, arg8));
            return;
        }
        field4960 = field4968.method84((byte) -128, arg18);
        field4971 = field4968.method82(arg18, -5001);
        int var21 = arg4 - arg3;
        int var22 = arg1 - arg0;
        int var23 = arg5 - arg3;
        int var24 = arg2 - arg0;
        int var25 = arg7 - arg6;
        int var26 = arg8 - arg6;
        int var27 = 0;
        if (arg0 != arg1) {
            var27 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var28 = 0;
        if (arg1 != arg2) {
            var28 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var29 = 0;
        if (arg0 != arg2) {
            var29 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var30 = var21 * var24 - var22 * var23;
        if (var30 == 0) {
            return;
        }
        int var31 = (var24 * var25 - var22 * var26 << 9) / var30;
        int var32 = (var21 * var26 - var23 * var25 << 9) / var30;
        int var33 = arg9 - arg10;
        int var34 = arg12 - arg13;
        int var35 = arg15 - arg16;
        int var36 = arg11 - arg9;
        int var37 = arg14 - arg12;
        int var38 = arg17 - arg15;
        int var39 = arg12 * var36 - arg9 * var37 << 14;
        int var40 = arg15 * var37 - arg12 * var38 << 5;
        int var41 = arg9 * var38 - arg15 * var36 << 5;
        int var42 = arg12 * var33 - arg9 * var34 << 14;
        int var43 = arg15 * var34 - arg12 * var35 << 5;
        int var44 = arg9 * var35 - arg15 * var33 << 5;
        int var45 = var34 * var36 - var33 * var37 << 14;
        int var46 = var35 * var37 - var34 * var38 << 5;
        int var47 = var33 * var38 - var35 * var36 << 5;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < field4969) {
                if (arg1 > field4969) {
                    arg1 = field4969;
                }
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                int var48 = (arg6 << 9) + var31 - arg3 * var31;
                if (arg1 < arg2) {
                    int var49;
                    int var50 = var49 = arg3 << 16;
                    if (arg0 < 0) {
                        var50 -= arg0 * var29;
                        var49 -= arg0 * var27;
                        var48 -= arg0 * var32;
                        arg0 = 0;
                    }
                    int var51 = arg4 << 16;
                    if (arg1 < 0) {
                        var51 -= arg1 * var28;
                        arg1 = 0;
                    }
                    int var52 = arg0 - field4963;
                    int var53 = var41 * var52 + var39;
                    int var54 = var44 * var52 + var42;
                    int var55 = var47 * var52 + var45;
                    if (arg0 != arg1 && var29 < var27 || arg0 == arg1 && var29 > var28) {
                        int var56 = arg2 - arg1;
                        int var57 = arg1 - arg0;
                        int var58 = field4970[arg0];
                        while (true) {
                            var57--;
                            if (var57 < 0) {
                                while (true) {
                                    var56--;
                                    if (var56 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var58, var50 >> 16, var51 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
                                    var50 += var29;
                                    var51 += var28;
                                    var48 += var32;
                                    var58 += class270.field4406;
                                    var53 += var41;
                                    var54 += var44;
                                    var55 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var58, var50 >> 16, var49 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
                            var50 += var29;
                            var49 += var27;
                            var48 += var32;
                            var58 += class270.field4406;
                            var53 += var41;
                            var54 += var44;
                            var55 += var47;
                        }
                    } else {
                        int var59 = arg2 - arg1;
                        int var60 = arg1 - arg0;
                        int var61 = field4970[arg0];
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                while (true) {
                                    var59--;
                                    if (var59 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var61, var51 >> 16, var50 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
                                    var50 += var29;
                                    var51 += var28;
                                    var48 += var32;
                                    var61 += class270.field4406;
                                    var53 += var41;
                                    var54 += var44;
                                    var55 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var61, var49 >> 16, var50 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
                            var50 += var29;
                            var49 += var27;
                            var48 += var32;
                            var61 += class270.field4406;
                            var53 += var41;
                            var54 += var44;
                            var55 += var47;
                        }
                    }
                } else {
                    int var62;
                    int var63 = var62 = arg3 << 16;
                    if (arg0 < 0) {
                        var63 -= arg0 * var29;
                        var62 -= arg0 * var27;
                        var48 -= arg0 * var32;
                        arg0 = 0;
                    }
                    int var64 = arg5 << 16;
                    if (arg2 < 0) {
                        var64 -= arg2 * var28;
                        arg2 = 0;
                    }
                    int var65 = arg0 - field4963;
                    int var66 = var41 * var65 + var39;
                    int var67 = var44 * var65 + var42;
                    int var68 = var47 * var65 + var45;
                    if ((arg0 == arg2 || var29 >= var27) && (arg0 != arg2 || var28 <= var27)) {
                        int var72 = arg1 - arg2;
                        int var73 = arg2 - arg0;
                        int var74 = field4970[arg0];
                        while (true) {
                            var73--;
                            if (var73 < 0) {
                                while (true) {
                                    var72--;
                                    if (var72 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var74, var62 >> 16, var64 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
                                    var64 += var28;
                                    var62 += var27;
                                    var48 += var32;
                                    var74 += class270.field4406;
                                    var66 += var41;
                                    var67 += var44;
                                    var68 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var74, var62 >> 16, var63 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
                            var63 += var29;
                            var62 += var27;
                            var48 += var32;
                            var74 += class270.field4406;
                            var66 += var41;
                            var67 += var44;
                            var68 += var47;
                        }
                    } else {
                        int var69 = arg1 - arg2;
                        int var70 = arg2 - arg0;
                        int var71 = field4970[arg0];
                        while (true) {
                            var70--;
                            if (var70 < 0) {
                                while (true) {
                                    var69--;
                                    if (var69 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var71, var64 >> 16, var62 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
                                    var64 += var28;
                                    var62 += var27;
                                    var48 += var32;
                                    var71 += class270.field4406;
                                    var66 += var41;
                                    var67 += var44;
                                    var68 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var71, var63 >> 16, var62 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
                            var63 += var29;
                            var62 += var27;
                            var48 += var32;
                            var71 += class270.field4406;
                            var66 += var41;
                            var67 += var44;
                            var68 += var47;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < field4969) {
                if (arg2 > field4969) {
                    arg2 = field4969;
                }
                if (arg0 > field4969) {
                    arg0 = field4969;
                }
                int var75 = (arg7 << 9) + var31 - arg4 * var31;
                if (arg2 < arg0) {
                    int var76;
                    int var77 = var76 = arg4 << 16;
                    if (arg1 < 0) {
                        var77 -= arg1 * var27;
                        var76 -= arg1 * var28;
                        var75 -= arg1 * var32;
                        arg1 = 0;
                    }
                    int var78 = arg5 << 16;
                    if (arg2 < 0) {
                        var78 -= arg2 * var29;
                        arg2 = 0;
                    }
                    int var79 = arg1 - field4963;
                    int var80 = var41 * var79 + var39;
                    int var81 = var44 * var79 + var42;
                    int var82 = var47 * var79 + var45;
                    if (arg1 != arg2 && var27 < var28 || arg1 == arg2 && var27 > var29) {
                        int var83 = arg0 - arg2;
                        int var84 = arg2 - arg1;
                        int var85 = field4970[arg1];
                        while (true) {
                            var84--;
                            if (var84 < 0) {
                                while (true) {
                                    var83--;
                                    if (var83 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var85, var77 >> 16, var78 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
                                    var77 += var27;
                                    var78 += var29;
                                    var75 += var32;
                                    var85 += class270.field4406;
                                    var80 += var41;
                                    var81 += var44;
                                    var82 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var85, var77 >> 16, var76 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
                            var77 += var27;
                            var76 += var28;
                            var75 += var32;
                            var85 += class270.field4406;
                            var80 += var41;
                            var81 += var44;
                            var82 += var47;
                        }
                    } else {
                        int var86 = arg0 - arg2;
                        int var87 = arg2 - arg1;
                        int var88 = field4970[arg1];
                        while (true) {
                            var87--;
                            if (var87 < 0) {
                                while (true) {
                                    var86--;
                                    if (var86 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var88, var78 >> 16, var77 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
                                    var77 += var27;
                                    var78 += var29;
                                    var75 += var32;
                                    var88 += class270.field4406;
                                    var80 += var41;
                                    var81 += var44;
                                    var82 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var88, var76 >> 16, var77 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
                            var77 += var27;
                            var76 += var28;
                            var75 += var32;
                            var88 += class270.field4406;
                            var80 += var41;
                            var81 += var44;
                            var82 += var47;
                        }
                    }
                } else {
                    int var89;
                    int var90 = var89 = arg4 << 16;
                    if (arg1 < 0) {
                        var90 -= arg1 * var27;
                        var89 -= arg1 * var28;
                        var75 -= arg1 * var32;
                        arg1 = 0;
                    }
                    int var91 = arg3 << 16;
                    if (arg0 < 0) {
                        var91 -= arg0 * var29;
                        arg0 = 0;
                    }
                    int var92 = arg1 - field4963;
                    int var93 = var41 * var92 + var39;
                    int var94 = var44 * var92 + var42;
                    int var95 = var47 * var92 + var45;
                    if (var27 < var28) {
                        int var96 = arg2 - arg0;
                        int var97 = arg0 - arg1;
                        int var98 = field4970[arg1];
                        while (true) {
                            var97--;
                            if (var97 < 0) {
                                while (true) {
                                    var96--;
                                    if (var96 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var98, var91 >> 16, var89 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
                                    var91 += var29;
                                    var89 += var28;
                                    var75 += var32;
                                    var98 += class270.field4406;
                                    var93 += var41;
                                    var94 += var44;
                                    var95 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var98, var90 >> 16, var89 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
                            var90 += var27;
                            var89 += var28;
                            var75 += var32;
                            var98 += class270.field4406;
                            var93 += var41;
                            var94 += var44;
                            var95 += var47;
                        }
                    } else {
                        int var99 = arg2 - arg0;
                        int var100 = arg0 - arg1;
                        int var101 = field4970[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    method2223(class270.field4403, var19, 0, 0, var101, var89 >> 16, var91 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
                                    var91 += var29;
                                    var89 += var28;
                                    var75 += var32;
                                    var101 += class270.field4406;
                                    var93 += var41;
                                    var94 += var44;
                                    var95 += var47;
                                }
                            }
                            method2223(class270.field4403, var19, 0, 0, var101, var89 >> 16, var90 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
                            var90 += var27;
                            var89 += var28;
                            var75 += var32;
                            var101 += class270.field4406;
                            var93 += var41;
                            var94 += var44;
                            var95 += var47;
                        }
                    }
                }
            }
        } else if (arg2 < field4969) {
            if (arg0 > field4969) {
                arg0 = field4969;
            }
            if (arg1 > field4969) {
                arg1 = field4969;
            }
            int var102 = (arg8 << 9) + var31 - arg5 * var31;
            if (arg0 < arg1) {
                int var103;
                int var104 = var103 = arg5 << 16;
                if (arg2 < 0) {
                    var104 -= arg2 * var28;
                    var103 -= arg2 * var29;
                    var102 -= arg2 * var32;
                    arg2 = 0;
                }
                int var105 = arg3 << 16;
                if (arg0 < 0) {
                    var105 -= arg0 * var27;
                    arg0 = 0;
                }
                int var106 = arg2 - field4963;
                int var107 = var41 * var106 + var39;
                int var108 = var44 * var106 + var42;
                int var109 = var47 * var106 + var45;
                if (var28 < var29) {
                    int var110 = arg1 - arg0;
                    int var111 = arg0 - arg2;
                    int var112 = field4970[arg2];
                    while (true) {
                        var111--;
                        if (var111 < 0) {
                            while (true) {
                                var110--;
                                if (var110 < 0) {
                                    return;
                                }
                                method2223(class270.field4403, var19, 0, 0, var112, var104 >> 16, var105 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
                                var104 += var28;
                                var105 += var27;
                                var102 += var32;
                                var112 += class270.field4406;
                                var107 += var41;
                                var108 += var44;
                                var109 += var47;
                            }
                        }
                        method2223(class270.field4403, var19, 0, 0, var112, var104 >> 16, var103 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
                        var104 += var28;
                        var103 += var29;
                        var102 += var32;
                        var112 += class270.field4406;
                        var107 += var41;
                        var108 += var44;
                        var109 += var47;
                    }
                } else {
                    int var113 = arg1 - arg0;
                    int var114 = arg0 - arg2;
                    int var115 = field4970[arg2];
                    while (true) {
                        var114--;
                        if (var114 < 0) {
                            while (true) {
                                var113--;
                                if (var113 < 0) {
                                    return;
                                }
                                method2223(class270.field4403, var19, 0, 0, var115, var105 >> 16, var104 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
                                var104 += var28;
                                var105 += var27;
                                var102 += var32;
                                var115 += class270.field4406;
                                var107 += var41;
                                var108 += var44;
                                var109 += var47;
                            }
                        }
                        method2223(class270.field4403, var19, 0, 0, var115, var103 >> 16, var104 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
                        var104 += var28;
                        var103 += var29;
                        var102 += var32;
                        var115 += class270.field4406;
                        var107 += var41;
                        var108 += var44;
                        var109 += var47;
                    }
                }
            } else {
                int var116;
                int var117 = var116 = arg5 << 16;
                if (arg2 < 0) {
                    var117 -= arg2 * var28;
                    var116 -= arg2 * var29;
                    var102 -= arg2 * var32;
                    arg2 = 0;
                }
                int var118 = arg4 << 16;
                if (arg1 < 0) {
                    var118 -= arg1 * var27;
                    arg1 = 0;
                }
                int var119 = arg2 - field4963;
                int var120 = var41 * var119 + var39;
                int var121 = var44 * var119 + var42;
                int var122 = var47 * var119 + var45;
                if (var28 < var29) {
                    int var123 = arg0 - arg1;
                    int var124 = arg1 - arg2;
                    int var125 = field4970[arg2];
                    while (true) {
                        var124--;
                        if (var124 < 0) {
                            while (true) {
                                var123--;
                                if (var123 < 0) {
                                    return;
                                }
                                method2223(class270.field4403, var19, 0, 0, var125, var118 >> 16, var116 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
                                var118 += var27;
                                var116 += var29;
                                var102 += var32;
                                var125 += class270.field4406;
                                var120 += var41;
                                var121 += var44;
                                var122 += var47;
                            }
                        }
                        method2223(class270.field4403, var19, 0, 0, var125, var117 >> 16, var116 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
                        var117 += var28;
                        var116 += var29;
                        var102 += var32;
                        var125 += class270.field4406;
                        var120 += var41;
                        var121 += var44;
                        var122 += var47;
                    }
                } else {
                    int var126 = arg0 - arg1;
                    int var127 = arg1 - arg2;
                    int var128 = field4970[arg2];
                    while (true) {
                        var127--;
                        if (var127 < 0) {
                            while (true) {
                                var126--;
                                if (var126 < 0) {
                                    return;
                                }
                                method2223(class270.field4403, var19, 0, 0, var128, var116 >> 16, var118 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
                                var118 += var27;
                                var116 += var29;
                                var102 += var32;
                                var128 += class270.field4406;
                                var120 += var41;
                                var121 += var44;
                                var122 += var47;
                            }
                        }
                        method2223(class270.field4403, var19, 0, 0, var128, var116 >> 16, var117 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
                        var117 += var28;
                        var116 += var29;
                        var102 += var32;
                        var128 += class270.field4406;
                        var120 += var41;
                        var121 += var44;
                        var122 += var47;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)V", line = 3869)
    private static final void method2232(int arg0, int arg1) {
        int var2 = arg0 * 128;
        for (int var3 = arg0; var3 < arg1; var3++) {
            double var4 = (double) (var3 >> 3) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 & 0x7) / 8.0D + 0.0625D;
            for (int var8 = 0; var8 < 128; var8++) {
                double var9 = (double) var8 / 128.0D;
                double var11 = var9;
                double var13 = var9;
                double var15 = var9;
                if (var6 != 0.0D) {
                    double var17;
                    if (var9 < 0.5D) {
                        var17 = (var6 + 1.0D) * var9;
                    } else {
                        var17 = var6 + var9 - var6 * var9;
                    }
                    double var19 = var9 * 2.0D - var17;
                    double var21 = var4 + 0.3333333333333333D;
                    if (var21 > 1.0D) {
                        var21--;
                    }
                    double var25 = var4 - 0.3333333333333333D;
                    if (var25 < 0.0D) {
                        var25++;
                    }
                    if (var21 * 6.0D < 1.0D) {
                        var11 = (var17 - var19) * 6.0D * var21 + var19;
                    } else if (var21 * 2.0D < 1.0D) {
                        var11 = var17;
                    } else if (var21 * 3.0D < 2.0D) {
                        var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                    } else {
                        var11 = var19;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var13 = (var17 - var19) * 6.0D * var4 + var19;
                    } else if (var4 * 2.0D < 1.0D) {
                        var13 = var17;
                    } else if (var4 * 3.0D < 2.0D) {
                        var13 = (var17 - var19) * (0.6666666666666666D - var4) * 6.0D + var19;
                    } else {
                        var13 = var19;
                    }
                    if (var25 * 6.0D < 1.0D) {
                        var15 = (var17 - var19) * 6.0D * var25 + var19;
                    } else if (var25 * 2.0D < 1.0D) {
                        var15 = var17;
                    } else if (var25 * 3.0D < 2.0D) {
                        var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                    } else {
                        var15 = var19;
                    }
                }
                double var27 = Math.pow(var11, (double) field4961);
                double var29 = Math.pow(var13, (double) field4961);
                double var31 = Math.pow(var15, (double) field4961);
                int var33 = (int) (var27 * 256.0D);
                int var34 = (int) (var29 * 256.0D);
                int var35 = (int) (var31 * 256.0D);
                int var36 = (var33 << 16) + (var34 << 8) + var35;
                if (var36 == 0) {
                    var36 = 1;
                }
                field4956[var2++] = var36;
            }
        }
    }
}
