import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class684 {

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[Z")
    public static boolean[] field9516 = new boolean[100];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public int field9514;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public int field9518;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public int field9520;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public int field9521;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public int field9522;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public int field9524;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public int field9528;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field9517;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "[B")
    public byte[] field9525;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[B")
    public byte[] field9526;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[Lcn;")
    public static class543[] field9523;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 8)
    public static void method3853(byte arg0) {
        int var1 = -81 % ((arg0 - 57) / 36);
        field9523 = null;
        field9517 = null;
        field9516 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIZIII)Z", line = 21)
    public static final boolean method3854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field9527++;
        if (arg5 > 2000 || arg0 > 2000 || arg9 > 2000 || arg3 > 2000 || arg4 > 2000 || arg1 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg0 >= -2000 && arg9 >= -2000 && arg3 >= -2000 && arg4 >= -2000 && arg1 >= -2000) {
            if (class190.field2930 == 2) {
                int var10 = class679.field9453 * arg5 + arg3;
                if (var10 >= 0 && class336.field4533.length > var10 && (arg8 << 8) - 38400 < class336.field4533[var10]) {
                    return false;
                }
                int var11 = arg4 + (class679.field9453 * arg0);
                if (var11 >= 0 && var11 < class336.field4533.length && (arg2 << 8) - 38400 < class336.field4533[var11]) {
                    return false;
                }
                int var12 = class679.field9453 * arg9 + arg1;
                if (var12 >= 0 && class336.field4533.length > var12 && ((arg7 << 8) - 38400) < class336.field4533[var12]) {
                    return false;
                }
            }
            int var13 = arg4 - arg3;
            int var14 = arg0 - arg5;
            int var15 = arg1 - arg3;
            if (!arg6) {
                return false;
            }
            int var16 = arg9 - arg5;
            int var17 = arg2 - arg8;
            if (arg5 < arg0 && arg9 > arg9) {
                arg5--;
                if (arg0 > arg9) {
                    arg0++;
                } else {
                    arg9++;
                }
            } else if (arg9 > arg0) {
                arg0--;
                if (arg9 >= arg5) {
                    arg9++;
                } else {
                    arg5++;
                }
            } else {
                arg9--;
                if (arg0 >= arg5) {
                    arg0++;
                } else {
                    arg5++;
                }
            }
            int var18 = arg7 - arg8;
            int var19 = 0;
            if (arg0 != arg5) {
                var19 = (arg4 - arg3 << 12) / (arg0 - arg5);
            }
            int var20 = 0;
            if (arg0 != arg9) {
                var20 = (arg1 - arg4 << 12) / (arg9 - arg0);
            }
            int var21 = 0;
            if (arg5 != arg9) {
                var21 = (arg3 - arg1 << 12) / (arg5 - arg9);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg0 >= arg5 && arg5 <= arg9) {
                if (arg5 >= class322.field4421) {
                    return true;
                }
                if (arg0 > class322.field4421) {
                    arg0 = class322.field4421;
                }
                if (arg9 > class322.field4421) {
                    arg9 = class322.field4421;
                }
                int var25 = (arg8 << 8) + var23 - (arg3 * var23);
                if (arg0 >= arg9) {
                    int var26;
                    int var27 = var26 = arg3 << 12;
                    int var28 = arg1 << 12;
                    if (arg5 < 0) {
                        var27 -= arg5 * var21;
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        arg5 = 0;
                    }
                    if (arg9 < 0) {
                        var28 -= arg9 * var20;
                        arg9 = 0;
                    }
                    if (arg5 != arg9 && var19 > var21 || arg5 == arg9 && var19 < var20) {
                        int var29 = arg0 - arg9;
                        int var30 = arg9 - arg5;
                        int var31 = class679.field9453 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var25, class336.field4533, var31, (var28 >> 12) - 1, var23, (var26 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var31 += class679.field9453;
                                    var26 += var19;
                                }
                            }
                            if (!class374.method2268(0, var25, class336.field4533, var31, (var27 >> 12) - 1, var23, (var26 >> 12) + 1, 0)) {
                                return false;
                            }
                            var26 += var19;
                            var25 += var24;
                            var27 += var21;
                            var31 += class679.field9453;
                        }
                    } else {
                        int var32 = arg0 - arg9;
                        int var33 = arg9 - arg5;
                        int var34 = class679.field9453 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var25, class336.field4533, var34, (var26 >> 12) - 1, var23, (var28 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var34 += class679.field9453;
                                    var26 += var19;
                                    var25 += var24;
                                }
                            }
                            if (!class374.method2268(0, var25, class336.field4533, var34, (var26 >> 12) - 1, var23, (var27 >> 12) + 1, 0)) {
                                return false;
                            }
                            var25 += var24;
                            var27 += var21;
                            var34 += class679.field9453;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg3 << 12;
                    int var37 = arg4 << 12;
                    if (arg5 < 0) {
                        var25 -= arg5 * var24;
                        var35 -= arg5 * var19;
                        var36 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg0 < 0) {
                        var37 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if ((arg0 == arg5 || var19 <= var21) && (arg0 != arg5 || var20 >= var21)) {
                        int var41 = arg9 - arg0;
                        int var42 = arg0 - arg5;
                        int var43 = class679.field9453 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var25, class336.field4533, var43, (var37 >> 12) - 1, var23, (var36 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var36 += var21;
                                    var37 += var20;
                                    var43 += class679.field9453;
                                }
                            }
                            if (!class374.method2268(0, var25, class336.field4533, var43, (var35 >> 12) - 1, var23, (var36 >> 12) + 1, 0)) {
                                return false;
                            }
                            var36 += var21;
                            var43 += class679.field9453;
                            var35 += var19;
                            var25 += var24;
                        }
                    } else {
                        int var38 = arg9 - arg0;
                        int var39 = arg0 - arg5;
                        int var40 = class679.field9453 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var25, class336.field4533, var40, (var36 >> 12) - 1, var23, (var37 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var36 += var21;
                                    var37 += var20;
                                    var40 += class679.field9453;
                                }
                            }
                            if (!class374.method2268(0, var25, class336.field4533, var40, (var36 >> 12) - 1, var23, (var35 >> 12) + 1, 0)) {
                                return false;
                            }
                            var40 += class679.field9453;
                            var25 += var24;
                            var35 += var19;
                            var36 += var21;
                        }
                    }
                }
            } else if (arg9 >= arg0) {
                if (arg0 >= class322.field4421) {
                    return true;
                }
                if (arg5 > class322.field4421) {
                    arg5 = class322.field4421;
                }
                int var44 = (arg2 << 8) + var23 - (arg4 * var23);
                if (class322.field4421 < arg9) {
                    arg9 = class322.field4421;
                }
                if (arg9 < arg5) {
                    int var45;
                    int var46 = var45 = arg4 << 12;
                    if (arg0 < 0) {
                        var46 -= arg0 * var19;
                        var44 -= arg0 * var24;
                        var45 -= arg0 * var20;
                        arg0 = 0;
                    }
                    int var47 = arg1 << 12;
                    if (arg9 < 0) {
                        var47 -= arg9 * var21;
                        arg9 = 0;
                    }
                    if (arg0 != arg9 && var20 > var19 || arg0 == arg9 && var21 < var19) {
                        int var48 = arg5 - arg9;
                        int var49 = arg9 - arg0;
                        int var50 = class679.field9453 * arg0;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var44, class336.field4533, var50, (var46 >> 12) - 1, var23, (var47 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var50 += class679.field9453;
                                    var47 += var21;
                                    var46 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class374.method2268(0, var44, class336.field4533, var50, (var46 >> 12) - 1, var23, (var45 >> 12) + 1, 0)) {
                                return false;
                            }
                            var44 += var24;
                            var45 += var20;
                            var50 += class679.field9453;
                            var46 += var19;
                        }
                    } else {
                        int var51 = arg5 - arg9;
                        int var52 = arg9 - arg0;
                        int var53 = class679.field9453 * arg0;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var44, class336.field4533, var53, (var47 >> 12) - 1, var23, (var46 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var46 += var19;
                                    var53 += class679.field9453;
                                    var47 += var21;
                                }
                            }
                            if (!class374.method2268(0, var44, class336.field4533, var53, (var45 >> 12) - 1, var23, (var46 >> 12) + 1, 0)) {
                                return false;
                            }
                            var46 += var19;
                            var53 += class679.field9453;
                            var45 += var20;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg4 << 12;
                    if (arg0 < 0) {
                        var44 -= arg0 * var24;
                        var55 -= arg0 * var19;
                        var54 -= arg0 * var20;
                        arg0 = 0;
                    }
                    int var56 = arg3 << 12;
                    if (arg5 < 0) {
                        var56 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var19 >= var20) {
                        int var57 = arg9 - arg5;
                        int var58 = arg5 - arg0;
                        int var59 = class679.field9453 * arg0;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var44, class336.field4533, var59, (var54 >> 12) - 1, var23, (var56 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var54 += var20;
                                    var44 += var24;
                                    var56 += var21;
                                    var59 += class679.field9453;
                                }
                            }
                            if (!class374.method2268(0, var44, class336.field4533, var59, (var54 >> 12) - 1, var23, (var55 >> 12) + 1, 0)) {
                                return false;
                            }
                            var55 += var19;
                            var54 += var20;
                            var44 += var24;
                            var59 += class679.field9453;
                        }
                    } else {
                        int var60 = arg9 - arg5;
                        int var61 = arg5 - arg0;
                        int var62 = class679.field9453 * arg0;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var44, class336.field4533, var62, (var56 >> 12) - 1, var23, (var54 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var21;
                                    var54 += var20;
                                    var62 += class679.field9453;
                                }
                            }
                            if (!class374.method2268(0, var44, class336.field4533, var62, (var55 >> 12) - 1, var23, (var54 >> 12) + 1, 0)) {
                                return false;
                            }
                            var62 += class679.field9453;
                            var44 += var24;
                            var54 += var20;
                            var55 += var19;
                        }
                    }
                }
            } else if (class322.field4421 <= arg9) {
                return true;
            } else {
                if (arg0 > class322.field4421) {
                    arg0 = class322.field4421;
                }
                if (arg5 > class322.field4421) {
                    arg5 = class322.field4421;
                }
                int var63 = (arg7 << 8) + var23 - (arg1 * var23);
                if (arg0 <= arg5) {
                    int var64;
                    int var65 = var64 = arg1 << 12;
                    int var66 = arg4 << 12;
                    if (arg9 < 0) {
                        var64 -= arg9 * var21;
                        var65 -= arg9 * var20;
                        var63 -= arg9 * var24;
                        arg9 = 0;
                    }
                    if (arg0 < 0) {
                        var66 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var21 <= var20) {
                        int var67 = arg5 - arg0;
                        int var68 = arg0 - arg9;
                        int var69 = class679.field9453 * arg9;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var63, class336.field4533, var69, (var64 >> 12) - 1, var23, (var66 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var69 += class679.field9453;
                                    var63 += var24;
                                    var66 += var19;
                                    var64 += var21;
                                }
                            }
                            if (!class374.method2268(0, var63, class336.field4533, var69, (var64 >> 12) - 1, var23, (var65 >> 12) + 1, 0)) {
                                return false;
                            }
                            var63 += var24;
                            var65 += var20;
                            var69 += class679.field9453;
                            var64 += var21;
                        }
                    } else {
                        int var70 = arg5 - arg0;
                        int var71 = arg0 - arg9;
                        int var72 = class679.field9453 * arg9;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var63, class336.field4533, var72, (var66 >> 12) - 1, var23, (var64 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var64 += var21;
                                    var72 += class679.field9453;
                                    var66 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class374.method2268(0, var63, class336.field4533, var72, (var65 >> 12) - 1, var23, (var64 >> 12) + 1, 0)) {
                                return false;
                            }
                            var64 += var21;
                            var63 += var24;
                            var65 += var20;
                            var72 += class679.field9453;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg1 << 12;
                    int var75 = arg3 << 12;
                    if (arg9 < 0) {
                        var63 -= arg9 * var24;
                        var74 -= arg9 * var20;
                        var73 -= arg9 * var21;
                        arg9 = 0;
                    }
                    if (arg5 < 0) {
                        var75 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var20 >= var21) {
                        int var76 = arg0 - arg5;
                        int var77 = arg5 - arg9;
                        int var78 = class679.field9453 * arg9;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var63, class336.field4533, var78, (var75 >> 12) - 1, var23, (var74 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var74 += var20;
                                    var78 += class679.field9453;
                                    var75 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class374.method2268(0, var63, class336.field4533, var78, (var73 >> 12) - 1, var23, (var74 >> 12) + 1, 0)) {
                                return false;
                            }
                            var73 += var21;
                            var74 += var20;
                            var63 += var24;
                            var78 += class679.field9453;
                        }
                    } else {
                        int var79 = arg0 - arg5;
                        int var80 = arg5 - arg9;
                        int var81 = class679.field9453 * arg9;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class374.method2268(0, var63, class336.field4533, var81, (var74 >> 12) - 1, var23, (var75 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var74 += var20;
                                    var81 += class679.field9453;
                                    var75 += var19;
                                }
                            }
                            if (!class374.method2268(0, var63, class336.field4533, var81, (var74 >> 12) - 1, var23, (var73 >> 12) + 1, 0)) {
                                return false;
                            }
                            var81 += class679.field9453;
                            var74 += var20;
                            var63 += var24;
                            var73 += var21;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IC)Z", line = 665)
    public static final boolean method3855(int arg0, char arg1) {
        if (arg0 >= -54) {
            return true;
        } else {
            field9519++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }
}
