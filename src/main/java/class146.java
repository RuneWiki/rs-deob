import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class146 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
    public static int[] field2532 = new int[6];

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "Laq;")
    public class146 field2536;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Lq;")
    public class396 field2537;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "Z")
    public static boolean field2534;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        field2531++;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg5;
        } else {
            if (arg6 != 2) {
                field2532 = null;
            }
            return 7 - (arg4 - 1) - arg0;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method1164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2530++;
        if (arg8 > 2000 || arg5 > 2000 || arg2 > 2000 || arg7 > 2000 || arg6 > 2000 || arg0 > 2000) {
            return false;
        } else if (arg8 >= -2000 && arg5 >= -2000 && arg2 >= -2000 && arg7 >= -2000 && arg6 >= -2000 && arg0 >= -2000) {
            if (class444.field6397 == 2) {
                int var10 = class356.field5332 * arg8 + arg7;
                if (var10 >= 0 && class122.field2228.length > var10 && (arg3 << 8) - 15360 < class122.field2228[var10]) {
                    return false;
                }
                int var11 = class356.field5332 * arg5 + arg6;
                if (var11 >= 0 && class122.field2228.length > var11 && class122.field2228[var11] > ((arg4 << 8) - 15360)) {
                    return false;
                }
                int var12 = arg0 + (class356.field5332 * arg2);
                if (var12 >= 0 && class122.field2228.length > var12 && (arg1 << 8) - 15360 < class122.field2228[var12]) {
                    return false;
                }
            }
            if (arg9 != -22806) {
                field2541 = -108;
            }
            int var13 = arg6 - arg7;
            int var14 = arg5 - arg8;
            int var15 = arg0 - arg7;
            int var16 = arg2 - arg8;
            int var17 = arg4 - arg3;
            if (arg5 > arg8 && arg2 < arg2) {
                arg8--;
                if (arg2 >= arg5) {
                    arg2++;
                } else {
                    arg5++;
                }
            } else if (arg5 < arg2) {
                arg5--;
                if (arg2 >= arg8) {
                    arg2++;
                } else {
                    arg8++;
                }
            } else {
                if (arg5 >= arg8) {
                    arg5++;
                } else {
                    arg8++;
                }
                arg2--;
            }
            int var18 = arg1 - arg3;
            int var19 = 0;
            if (arg5 != arg8) {
                var19 = (arg6 - arg7 << 12) / (arg5 - arg8);
            }
            int var20 = 0;
            if (arg2 != arg5) {
                var20 = (arg0 - arg6 << 12) / (arg2 - arg5);
            }
            int var21 = 0;
            if (arg2 != arg8) {
                var21 = (arg7 - arg0 << 12) / (arg8 - arg2);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg5 >= arg8 && arg8 <= arg2) {
                if (arg8 >= class295.field4420) {
                    return true;
                }
                int var25 = (arg3 << 8) + var23 - (arg7 * var23);
                if (class295.field4420 < arg5) {
                    arg5 = class295.field4420;
                }
                if (class295.field4420 < arg2) {
                    arg2 = class295.field4420;
                }
                if (arg5 >= arg2) {
                    int var26;
                    int var27 = var26 = arg7 << 12;
                    if (arg8 < 0) {
                        var27 -= arg8 * var21;
                        var25 -= arg8 * var24;
                        var26 -= arg8 * var19;
                        arg8 = 0;
                    }
                    int var28 = arg0 << 12;
                    if (arg2 < 0) {
                        var28 -= arg2 * var20;
                        arg2 = 0;
                    }
                    if (arg2 != arg8 && var21 < var19 || arg2 == arg8 && var20 > var19) {
                        int var29 = arg5 - arg2;
                        int var30 = arg2 - arg8;
                        int var31 = class356.field5332 * arg8;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var31, (var28 >> 12) - 1, class122.field2228, (var26 >> 12) + 1, var23, var25, (byte) 86, 0)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var26 += var19;
                                    var28 += var20;
                                    var31 += class356.field5332;
                                }
                            }
                            if (!class424.method2582(var31, (var27 >> 12) - 1, class122.field2228, (var26 >> 12) + 1, var23, var25, (byte) 80, 0)) {
                                return false;
                            }
                            var31 += class356.field5332;
                            var27 += var21;
                            var25 += var24;
                            var26 += var19;
                        }
                    } else {
                        int var32 = arg5 - arg2;
                        int var33 = arg2 - arg8;
                        int var34 = class356.field5332 * arg8;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var34, (var26 >> 12) - 1, class122.field2228, (var28 >> 12) + 1, var23, var25, (byte) 68, 0)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var26 += var19;
                                    var25 += var24;
                                    var34 += class356.field5332;
                                }
                            }
                            if (!class424.method2582(var34, (var26 >> 12) - 1, class122.field2228, (var27 >> 12) + 1, var23, var25, (byte) 65, 0)) {
                                return false;
                            }
                            var27 += var21;
                            var34 += class356.field5332;
                            var25 += var24;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg7 << 12;
                    if (arg8 < 0) {
                        var25 -= arg8 * var24;
                        var35 -= arg8 * var19;
                        var36 -= arg8 * var21;
                        arg8 = 0;
                    }
                    int var37 = arg6 << 12;
                    if (arg5 < 0) {
                        var37 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (arg5 != arg8 && var21 < var19 || arg5 == arg8 && var21 > var20) {
                        int var38 = arg2 - arg5;
                        int var39 = arg5 - arg8;
                        int var40 = class356.field5332 * arg8;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var40, (var36 >> 12) - 1, class122.field2228, (var37 >> 12) + 1, var23, var25, (byte) 105, 0)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var36 += var21;
                                    var40 += class356.field5332;
                                    var37 += var20;
                                }
                            }
                            if (!class424.method2582(var40, (var36 >> 12) - 1, class122.field2228, (var35 >> 12) + 1, var23, var25, (byte) 98, 0)) {
                                return false;
                            }
                            var25 += var24;
                            var35 += var19;
                            var40 += class356.field5332;
                            var36 += var21;
                        }
                    } else {
                        int var41 = arg2 - arg5;
                        int var42 = arg5 - arg8;
                        int var43 = class356.field5332 * arg8;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var43, (var37 >> 12) - 1, class122.field2228, (var36 >> 12) + 1, var23, var25, (byte) 99, 0)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var37 += var20;
                                    var25 += var24;
                                    var43 += class356.field5332;
                                }
                            }
                            if (!class424.method2582(var43, (var35 >> 12) - 1, class122.field2228, (var36 >> 12) + 1, var23, var25, (byte) 125, 0)) {
                                return false;
                            }
                            var25 += var24;
                            var35 += var19;
                            var43 += class356.field5332;
                            var36 += var21;
                        }
                    }
                }
            } else if (arg5 <= arg2) {
                if (class295.field4420 <= arg5) {
                    return true;
                }
                int var44 = (arg4 << 8) + var23 - (arg6 * var23);
                if (arg8 > class295.field4420) {
                    arg8 = class295.field4420;
                }
                if (arg2 > class295.field4420) {
                    arg2 = class295.field4420;
                }
                if (arg8 > arg2) {
                    int var45;
                    int var46 = var45 = arg6 << 12;
                    int var47 = arg0 << 12;
                    if (arg5 < 0) {
                        var46 -= arg5 * var19;
                        var45 -= arg5 * var20;
                        var44 -= arg5 * var24;
                        arg5 = 0;
                    }
                    if (arg2 < 0) {
                        var47 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if (arg2 != arg5 && var19 < var20 || arg2 == arg5 && var19 > var21) {
                        int var48 = arg8 - arg2;
                        int var49 = arg2 - arg5;
                        int var50 = class356.field5332 * arg5;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var50, (var46 >> 12) - 1, class122.field2228, (var47 >> 12) + 1, var23, var44, (byte) 95, 0)) {
                                        return false;
                                    }
                                    var50 += class356.field5332;
                                    var47 += var21;
                                    var46 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class424.method2582(var50, (var46 >> 12) - 1, class122.field2228, (var45 >> 12) + 1, var23, var44, (byte) 77, 0)) {
                                return false;
                            }
                            var45 += var20;
                            var44 += var24;
                            var50 += class356.field5332;
                            var46 += var19;
                        }
                    } else {
                        int var51 = arg8 - arg2;
                        int var52 = arg2 - arg5;
                        int var53 = class356.field5332 * arg5;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var53, (var47 >> 12) - 1, class122.field2228, (var46 >> 12) + 1, var23, var44, (byte) 107, 0)) {
                                        return false;
                                    }
                                    var53 += class356.field5332;
                                    var44 += var24;
                                    var47 += var21;
                                    var46 += var19;
                                }
                            }
                            if (!class424.method2582(var53, (var45 >> 12) - 1, class122.field2228, (var46 >> 12) + 1, var23, var44, (byte) 100, 0)) {
                                return false;
                            }
                            var46 += var19;
                            var45 += var20;
                            var53 += class356.field5332;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg6 << 12;
                    int var56 = arg7 << 12;
                    if (arg5 < 0) {
                        var44 -= arg5 * var24;
                        var55 -= arg5 * var19;
                        var54 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (arg8 < 0) {
                        var56 -= arg8 * var21;
                        arg8 = 0;
                    }
                    if (var20 <= var19) {
                        int var57 = arg2 - arg8;
                        int var58 = arg8 - arg5;
                        int var59 = class356.field5332 * arg5;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var59, (var54 >> 12) - 1, class122.field2228, (var56 >> 12) + 1, var23, var44, (byte) 76, 0)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var21;
                                    var59 += class356.field5332;
                                    var54 += var20;
                                }
                            }
                            if (!class424.method2582(var59, (var54 >> 12) - 1, class122.field2228, (var55 >> 12) + 1, var23, var44, (byte) 114, 0)) {
                                return false;
                            }
                            var59 += class356.field5332;
                            var55 += var19;
                            var54 += var20;
                            var44 += var24;
                        }
                    } else {
                        int var60 = arg2 - arg8;
                        int var61 = arg8 - arg5;
                        int var62 = class356.field5332 * arg5;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var62, (var56 >> 12) - 1, class122.field2228, (var54 >> 12) + 1, var23, var44, (byte) 80, 0)) {
                                        return false;
                                    }
                                    var56 += var21;
                                    var62 += class356.field5332;
                                    var44 += var24;
                                    var54 += var20;
                                }
                            }
                            if (!class424.method2582(var62, (var55 >> 12) - 1, class122.field2228, (var54 >> 12) + 1, var23, var44, (byte) 104, 0)) {
                                return false;
                            }
                            var44 += var24;
                            var54 += var20;
                            var62 += class356.field5332;
                            var55 += var19;
                        }
                    }
                }
            } else if (class295.field4420 <= arg2) {
                return true;
            } else {
                if (arg8 > class295.field4420) {
                    arg8 = class295.field4420;
                }
                if (class295.field4420 < arg5) {
                    arg5 = class295.field4420;
                }
                int var63 = (arg1 << 8) + var23 - (arg0 * var23);
                if (arg8 >= arg5) {
                    int var64;
                    int var65 = var64 = arg0 << 12;
                    if (arg2 < 0) {
                        var63 -= arg2 * var24;
                        var64 -= arg2 * var21;
                        var65 -= arg2 * var20;
                        arg2 = 0;
                    }
                    int var66 = arg6 << 12;
                    if (arg5 < 0) {
                        var66 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var21 <= var20) {
                        int var67 = arg8 - arg5;
                        int var68 = arg5 - arg2;
                        int var69 = class356.field5332 * arg2;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var69, (var64 >> 12) - 1, class122.field2228, (var66 >> 12) + 1, var23, var63, (byte) 107, 0)) {
                                        return false;
                                    }
                                    var69 += class356.field5332;
                                    var63 += var24;
                                    var66 += var19;
                                    var64 += var21;
                                }
                            }
                            if (!class424.method2582(var69, (var64 >> 12) - 1, class122.field2228, (var65 >> 12) + 1, var23, var63, (byte) 60, 0)) {
                                return false;
                            }
                            var65 += var20;
                            var64 += var21;
                            var69 += class356.field5332;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg8 - arg5;
                        int var71 = arg5 - arg2;
                        int var72 = class356.field5332 * arg2;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var72, (var66 >> 12) - 1, class122.field2228, (var64 >> 12) + 1, var23, var63, (byte) 58, 0)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var72 += class356.field5332;
                                    var66 += var19;
                                    var64 += var21;
                                }
                            }
                            if (!class424.method2582(var72, (var65 >> 12) - 1, class122.field2228, (var64 >> 12) + 1, var23, var63, (byte) 103, 0)) {
                                return false;
                            }
                            var64 += var21;
                            var72 += class356.field5332;
                            var65 += var20;
                            var63 += var24;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg0 << 12;
                    int var75 = arg7 << 12;
                    if (arg2 < 0) {
                        var73 -= arg2 * var21;
                        var74 -= arg2 * var20;
                        var63 -= arg2 * var24;
                        arg2 = 0;
                    }
                    if (arg8 < 0) {
                        var75 -= arg8 * var19;
                        arg8 = 0;
                    }
                    if (var20 < var21) {
                        int var76 = arg5 - arg8;
                        int var77 = arg8 - arg2;
                        int var78 = class356.field5332 * arg2;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var78, (var74 >> 12) - 1, class122.field2228, (var75 >> 12) + 1, var23, var63, (byte) 54, 0)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var75 += var19;
                                    var78 += class356.field5332;
                                    var74 += var20;
                                }
                            }
                            if (!class424.method2582(var78, (var74 >> 12) - 1, class122.field2228, (var73 >> 12) + 1, var23, var63, (byte) 105, 0)) {
                                return false;
                            }
                            var63 += var24;
                            var74 += var20;
                            var73 += var21;
                            var78 += class356.field5332;
                        }
                    } else {
                        int var79 = arg5 - arg8;
                        int var80 = arg8 - arg2;
                        int var81 = class356.field5332 * arg2;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class424.method2582(var81, (var75 >> 12) - 1, class122.field2228, (var74 >> 12) + 1, var23, var63, (byte) 104, 0)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var81 += class356.field5332;
                                    var75 += var19;
                                    var74 += var20;
                                }
                            }
                            if (!class424.method2582(var81, (var73 >> 12) - 1, class122.field2228, (var74 >> 12) + 1, var23, var63, (byte) 99, 0)) {
                                return false;
                            }
                            var81 += class356.field5332;
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

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Laq;")
    public final class146 method1165(int arg0, int arg1) {
        if (arg0 != 0) {
            method1164(26, 69, -17, -25, -35, -95, -48, -14, -17, -19);
        }
        field2542++;
        return new class146(this.field2528, arg1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBIIIZI)V")
    public static final void method1166(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2535++;
        class324.field4755 = arg0;
        class586.field8452 = arg3;
        class7.field515 = arg2;
        class318.field4686 = arg4;
        class448.field6449 = arg6;
        if (arg5 && class586.field8452 >= 100) {
            class537.field7518 = class448.field6449 * 512 + 256;
            class206.field3158 = class318.field4686 * 512 + 256;
            class1.field97 = class460.method2757(0, class537.field7518, class37.field1046, class206.field3158) - class324.field4755;
        }
        class488.field6995 = -1;
        class266.field3950 = -1;
        if (arg1 >= -77) {
            method1163(-61, -100, 62, -127, 75, -125, 114);
        }
        class423.field6123 = 2;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)Lgaa;")
    public final class272 method1167(boolean arg0) {
        if (arg0) {
            field2540++;
            return client.method1802(103, this.field2528);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
    public static final void method1168(byte arg0, int arg1) {
        field2539++;
        class19 var2 = class373.method2355(124, arg1, 16);
        var2.method438(806);
        if (arg0 != -94) {
            field2532 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)V")
    public static final void method1169(int arg0, boolean arg1, int arg2) {
        if (arg2 >= -119) {
            method1169(-49, false, 47);
        }
        field2538++;
        class430 var3 = class605.method3470((byte) -119, arg1, arg0);
        if (var3 != null) {
            var3.method2588(300);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        field2532 = null;
        if (arg0 != 124) {
            method1168((byte) -12, 118);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(II)V")
    public class146(int arg0, int arg1) {
        this.field2528 = arg0;
        this.field2543 = arg1;
    }
}
