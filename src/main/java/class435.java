import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class435 extends class757 {

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Low;")
    public static class747 field5965 = new class747("", 12);

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "Lhh;")
    public static class529 field5966;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lwu;")
    public static class557 field5962;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "[Ls;")
    public static class339[] field5969;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public static void method2613(int arg0) {
        field5966 = null;
        if (arg0 == 19474) {
            field5962 = null;
            field5965 = null;
            field5969 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Lnfa;")
    public static final class228 method2614(boolean arg0, int arg1) {
        ++field5964;
        class228 var2 = (class228) class8.field80.method2761((byte) 96, (long) arg1);
        if (arg0) {
            method2614(true, 1);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class300.field3919.method3322(arg1, 0, (byte) 99);
            if (var3 != null && var3.length > 1) {
                class228 var4;
                try {
                    var4 = class621.method3635(-40, var3);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg1);
                }
                class8.field80.method2764((long) arg1, var4, -4900);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
    public static final byte[] method2615(Object arg0, int arg1, int arg2, int arg3) {
        ++field5960;
        if (arg0 == null) {
            return null;
        } else if (arg2 != 13997) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class187.method1255(arg1, arg3, (byte) -94, var4);
        } else if (arg0 instanceof class667) {
            class667 var5 = (class667) arg0;
            return var5.method3549(arg1, arg3, 113);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIF)V")
    public class435(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IF)V")
    public final void method2616(int arg0, float arg1) {
        ++field5967;
        if (arg0 != 0) {
            field5969 = null;
        }
        super.field10523 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5968;
        if (arg4 <= 2000 && arg1 <= 2000 && arg3 <= 2000 && ~arg9 >= -2001 && arg5 <= 2000 && ~arg8 >= -2001) {
            if (~arg4 <= 1999 && ~arg1 <= 1999 && arg3 >= -2000 && arg9 >= -2000 && ~arg5 <= 1999 && ~arg8 <= 1999) {
                if (~class209.field2969 == -3) {
                    int var10 = arg9 - -(class102.field1460 * arg4);
                    if (~var10 <= -1 && class185.field2719.length > var10 && (arg2 << 8) + -38400 < class185.field2719[var10]) {
                        return false;
                    }
                    int var11 = class102.field1460 * arg1 + arg5;
                    if (var11 >= 0 && ~var11 > ~class185.field2719.length && ~class185.field2719[var11] < ~((arg7 << 8) - 38400)) {
                        return false;
                    }
                    int var12 = class102.field1460 * arg3 + arg8;
                    if (var12 >= 0 && ~class185.field2719.length < ~var12 && (arg0 << 8) + -38400 < class185.field2719[var12]) {
                        return false;
                    }
                }
                int var13 = -arg9 + arg5;
                int var14 = -arg4 + arg1;
                int var15 = -arg9 + arg8;
                int var16 = arg3 - arg4;
                int var17 = -arg2 + arg7;
                int var18 = -arg2 + arg0;
                if (~arg4 > ~arg1 && arg3 > arg3) {
                    --arg4;
                    if (~arg1 >= ~arg3) {
                        ++arg3;
                    } else {
                        ++arg1;
                    }
                } else if (~arg3 < ~arg1) {
                    if (arg4 > arg3) {
                        ++arg4;
                    } else {
                        ++arg3;
                    }
                    --arg1;
                } else {
                    if (~arg1 <= ~arg4) {
                        ++arg1;
                    } else {
                        ++arg4;
                    }
                    --arg3;
                }
                int var19 = 0;
                if (arg1 != arg4) {
                    var19 = (-arg9 + arg5 << 12) / (-arg4 + arg1);
                }
                int var20 = 0;
                if (~arg1 != ~arg3) {
                    var20 = (-arg5 + arg8 << 12) / (-arg1 + arg3);
                }
                if (arg6 != -25506) {
                    return false;
                } else {
                    int var21 = 0;
                    if (~arg3 != ~arg4) {
                        var21 = (arg9 - arg8 << 12) / (-arg3 + arg4);
                    }
                    int var22 = var13 * var16 + -(var14 * var15);
                    if (~var22 == -1) {
                        return false;
                    } else {
                        int var23 = (var16 * var17 + -(var14 * var18) << 8) / var22;
                        int var24 = (var13 * var18 + -(var15 * var17) << 8) / var22;
                        if (~arg1 <= ~arg4 && ~arg3 <= ~arg4) {
                            if (class690.field9668 <= arg4) {
                                return true;
                            } else {
                                int var25 = (arg2 << 8) + var23 + -(arg9 * var23);
                                if (arg1 > class690.field9668) {
                                    arg1 = class690.field9668;
                                }
                                if (~arg3 < ~class690.field9668) {
                                    arg3 = class690.field9668;
                                }
                                if (~arg1 <= ~arg3) {
                                    int var26;
                                    int var27 = var26 = arg9 << 12;
                                    int var28 = arg8 << 12;
                                    if (~arg4 > -1) {
                                        var27 -= arg4 * var21;
                                        var26 -= arg4 * var19;
                                        var25 -= arg4 * var24;
                                        arg4 = 0;
                                    }
                                    if (~arg3 > -1) {
                                        var28 -= arg3 * var20;
                                        arg3 = 0;
                                    }
                                    if (~arg3 != ~arg4 && var21 < var19 || ~arg3 == ~arg4 && var19 < var20) {
                                        int var29 = arg1 - arg3;
                                        int var30 = arg3 - arg4;
                                        int var31 = class102.field1460 * arg4;
                                        while (true) {
                                            --var30;
                                            if (var30 < 0) {
                                                while (true) {
                                                    --var29;
                                                    if (var29 < 0) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) 120, (var26 >> 12) + 1, var31, var25, class185.field2719, 0, (var28 >> 12) - 1)) {
                                                        return false;
                                                    }
                                                    var28 += var20;
                                                    var26 += var19;
                                                    var31 += class102.field1460;
                                                    var25 += var24;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) -122, (var26 >> 12) + 1, var31, var25, class185.field2719, 0, (var27 >> 12) - 1)) {
                                                return false;
                                            }
                                            var26 += var19;
                                            var31 += class102.field1460;
                                            var27 += var21;
                                            var25 += var24;
                                        }
                                    } else {
                                        int var32 = arg1 - arg3;
                                        int var33 = arg3 - arg4;
                                        int var34 = class102.field1460 * arg4;
                                        while (true) {
                                            --var33;
                                            if (var33 < 0) {
                                                while (true) {
                                                    --var32;
                                                    if (~var32 > -1) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) 4, (var28 >> 12) + 1, var34, var25, class185.field2719, 0, (var26 >> 12) - 1)) {
                                                        return false;
                                                    }
                                                    var25 += var24;
                                                    var34 += class102.field1460;
                                                    var28 += var20;
                                                    var26 += var19;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) 121, (var27 >> 12) + 1, var34, var25, class185.field2719, 0, (var26 >> 12) + -1)) {
                                                return false;
                                            }
                                            var25 += var24;
                                            var26 += var19;
                                            var27 += var21;
                                            var34 += class102.field1460;
                                        }
                                    }
                                } else {
                                    int var35;
                                    int var36 = var35 = arg9 << 12;
                                    int var37 = arg5 << 12;
                                    if (arg4 < 0) {
                                        var35 -= arg4 * var19;
                                        var25 -= arg4 * var24;
                                        var36 -= arg4 * var21;
                                        arg4 = 0;
                                    }
                                    if (arg1 < 0) {
                                        var37 -= arg1 * var20;
                                        arg1 = 0;
                                    }
                                    if ((arg1 == arg4 || ~var19 >= ~var21) && (~arg1 != ~arg4 || ~var21 >= ~var20)) {
                                        int var41 = arg3 - arg1;
                                        int var42 = arg1 - arg4;
                                        int var43 = class102.field1460 * arg4;
                                        while (true) {
                                            --var42;
                                            if (~var42 > -1) {
                                                while (true) {
                                                    --var41;
                                                    if (var41 < 0) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) -123, (var36 >> 12) + 1, var43, var25, class185.field2719, 0, (var37 >> 12) + -1)) {
                                                        return false;
                                                    }
                                                    var43 += class102.field1460;
                                                    var37 += var20;
                                                    var36 += var21;
                                                    var25 += var24;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) 52, (var36 >> 12) - -1, var43, var25, class185.field2719, 0, (var35 >> 12) - 1)) {
                                                return false;
                                            }
                                            var43 += class102.field1460;
                                            var36 += var21;
                                            var25 += var24;
                                            var35 += var19;
                                        }
                                    } else {
                                        int var38 = arg3 - arg1;
                                        int var39 = arg1 - arg4;
                                        int var40 = class102.field1460 * arg4;
                                        while (true) {
                                            --var39;
                                            if (var39 < 0) {
                                                while (true) {
                                                    --var38;
                                                    if (var38 < 0) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) -115, (var37 >> 12) + 1, var40, var25, class185.field2719, 0, (var36 >> 12) + -1)) {
                                                        return false;
                                                    }
                                                    var25 += var24;
                                                    var40 += class102.field1460;
                                                    var37 += var20;
                                                    var36 += var21;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) -113, (var35 >> 12) + 1, var40, var25, class185.field2719, 0, (var36 >> 12) - 1)) {
                                                return false;
                                            }
                                            var35 += var19;
                                            var36 += var21;
                                            var40 += class102.field1460;
                                            var25 += var24;
                                        }
                                    }
                                }
                            }
                        } else if (~arg3 <= ~arg1) {
                            if (~arg1 <= ~class690.field9668) {
                                return true;
                            } else {
                                if (class690.field9668 < arg3) {
                                    arg3 = class690.field9668;
                                }
                                if (class690.field9668 < arg4) {
                                    arg4 = class690.field9668;
                                }
                                int var44 = (arg7 << 8) + -(arg5 * var23) + var23;
                                if (~arg4 >= ~arg3) {
                                    int var45;
                                    int var46 = var45 = arg5 << 12;
                                    if (arg1 < 0) {
                                        var45 -= arg1 * var20;
                                        var46 -= arg1 * var19;
                                        var44 -= arg1 * var24;
                                        arg1 = 0;
                                    }
                                    int var47 = arg9 << 12;
                                    if (~arg4 > -1) {
                                        var47 -= arg4 * var21;
                                        arg4 = 0;
                                    }
                                    if (var19 < var20) {
                                        int var48 = arg3 - arg4;
                                        int var49 = arg4 - arg1;
                                        int var50 = class102.field1460 * arg1;
                                        while (true) {
                                            --var49;
                                            if (~var49 > -1) {
                                                while (true) {
                                                    --var48;
                                                    if (var48 < 0) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) -113, (var45 >> 12) + 1, var50, var44, class185.field2719, 0, (var47 >> 12) + -1)) {
                                                        return false;
                                                    }
                                                    var50 += class102.field1460;
                                                    var45 += var20;
                                                    var44 += var24;
                                                    var47 += var21;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) 59, (var45 >> 12) + 1, var50, var44, class185.field2719, 0, (var46 >> 12) + -1)) {
                                                return false;
                                            }
                                            var46 += var19;
                                            var44 += var24;
                                            var45 += var20;
                                            var50 += class102.field1460;
                                        }
                                    } else {
                                        int var51 = arg3 - arg4;
                                        int var52 = arg4 - arg1;
                                        int var53 = class102.field1460 * arg1;
                                        while (true) {
                                            --var52;
                                            if (~var52 > -1) {
                                                while (true) {
                                                    --var51;
                                                    if (var51 < 0) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) 86, (var47 >> 12) - -1, var53, var44, class185.field2719, 0, (var45 >> 12) + -1)) {
                                                        return false;
                                                    }
                                                    var45 += var20;
                                                    var47 += var21;
                                                    var53 += class102.field1460;
                                                    var44 += var24;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) -121, (var46 >> 12) - -1, var53, var44, class185.field2719, 0, (var45 >> 12) + -1)) {
                                                return false;
                                            }
                                            var53 += class102.field1460;
                                            var44 += var24;
                                            var45 += var20;
                                            var46 += var19;
                                        }
                                    }
                                } else {
                                    int var54;
                                    int var55 = var54 = arg5 << 12;
                                    int var56 = arg8 << 12;
                                    if (arg1 < 0) {
                                        var44 -= arg1 * var24;
                                        var54 -= arg1 * var20;
                                        var55 -= arg1 * var19;
                                        arg1 = 0;
                                    }
                                    if (~arg3 > -1) {
                                        var56 -= arg3 * var21;
                                        arg3 = 0;
                                    }
                                    if (~arg1 != ~arg3 && ~var20 < ~var19 || ~arg1 == ~arg3 && var21 < var19) {
                                        int var57 = arg4 - arg3;
                                        int var58 = arg3 - arg1;
                                        int var59 = class102.field1460 * arg1;
                                        while (true) {
                                            --var58;
                                            if (var58 < 0) {
                                                while (true) {
                                                    --var57;
                                                    if (~var57 > -1) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) 58, (var56 >> 12) + 1, var59, var44, class185.field2719, 0, (var55 >> 12) + -1)) {
                                                        return false;
                                                    }
                                                    var55 += var19;
                                                    var44 += var24;
                                                    var56 += var21;
                                                    var59 += class102.field1460;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) 61, (var54 >> 12) + 1, var59, var44, class185.field2719, 0, (var55 >> 12) + -1)) {
                                                return false;
                                            }
                                            var59 += class102.field1460;
                                            var54 += var20;
                                            var44 += var24;
                                            var55 += var19;
                                        }
                                    } else {
                                        int var60 = arg4 - arg3;
                                        int var61 = arg3 - arg1;
                                        int var62 = class102.field1460 * arg1;
                                        while (true) {
                                            --var61;
                                            if (var61 < 0) {
                                                while (true) {
                                                    --var60;
                                                    if (~var60 > -1) {
                                                        return true;
                                                    }
                                                    if (!class190.method1263(var23, (byte) 2, (var55 >> 12) + 1, var62, var44, class185.field2719, 0, (var56 >> 12) + -1)) {
                                                        return false;
                                                    }
                                                    var55 += var19;
                                                    var56 += var21;
                                                    var62 += class102.field1460;
                                                    var44 += var24;
                                                }
                                            }
                                            if (!class190.method1263(var23, (byte) -12, (var55 >> 12) + 1, var62, var44, class185.field2719, 0, (var54 >> 12) + -1)) {
                                                return false;
                                            }
                                            var55 += var19;
                                            var54 += var20;
                                            var44 += var24;
                                            var62 += class102.field1460;
                                        }
                                    }
                                }
                            }
                        } else if (~class690.field9668 >= ~arg3) {
                            return true;
                        } else {
                            if (~arg1 < ~class690.field9668) {
                                arg1 = class690.field9668;
                            }
                            if (~arg4 < ~class690.field9668) {
                                arg4 = class690.field9668;
                            }
                            int var63 = (arg0 << 8) + -(arg8 * var23) + var23;
                            if (arg4 >= arg1) {
                                int var64;
                                int var65 = var64 = arg8 << 12;
                                if (~arg3 > -1) {
                                    var64 -= arg3 * var21;
                                    var63 -= arg3 * var24;
                                    var65 -= arg3 * var20;
                                    arg3 = 0;
                                }
                                int var66 = arg5 << 12;
                                if (~arg1 > -1) {
                                    var66 -= arg1 * var19;
                                    arg1 = 0;
                                }
                                if (~var20 > ~var21) {
                                    int var67 = arg4 - arg1;
                                    int var68 = arg1 - arg3;
                                    int var69 = class102.field1460 * arg3;
                                    while (true) {
                                        --var68;
                                        if (~var68 > -1) {
                                            while (true) {
                                                --var67;
                                                if (~var67 > -1) {
                                                    return true;
                                                }
                                                if (!class190.method1263(var23, (byte) -127, (var64 >> 12) - -1, var69, var63, class185.field2719, 0, (var66 >> 12) + -1)) {
                                                    return false;
                                                }
                                                var69 += class102.field1460;
                                                var64 += var21;
                                                var66 += var19;
                                                var63 += var24;
                                            }
                                        }
                                        if (!class190.method1263(var23, (byte) -115, (var64 >> 12) + 1, var69, var63, class185.field2719, 0, (var65 >> 12) + -1)) {
                                            return false;
                                        }
                                        var64 += var21;
                                        var65 += var20;
                                        var63 += var24;
                                        var69 += class102.field1460;
                                    }
                                } else {
                                    int var70 = arg4 - arg1;
                                    int var71 = arg1 - arg3;
                                    int var72 = class102.field1460 * arg3;
                                    while (true) {
                                        --var71;
                                        if (var71 < 0) {
                                            while (true) {
                                                --var70;
                                                if (~var70 > -1) {
                                                    return true;
                                                }
                                                if (!class190.method1263(var23, (byte) -116, (var66 >> 12) - -1, var72, var63, class185.field2719, 0, (var64 >> 12) + -1)) {
                                                    return false;
                                                }
                                                var64 += var21;
                                                var63 += var24;
                                                var72 += class102.field1460;
                                                var66 += var19;
                                            }
                                        }
                                        if (!class190.method1263(var23, (byte) -114, (var65 >> 12) + 1, var72, var63, class185.field2719, 0, (var64 >> 12) + -1)) {
                                            return false;
                                        }
                                        var65 += var20;
                                        var72 += class102.field1460;
                                        var64 += var21;
                                        var63 += var24;
                                    }
                                }
                            } else {
                                int var73;
                                int var74 = var73 = arg8 << 12;
                                if (arg3 < 0) {
                                    var73 -= arg3 * var21;
                                    var63 -= arg3 * var24;
                                    var74 -= arg3 * var20;
                                    arg3 = 0;
                                }
                                int var75 = arg9 << 12;
                                if (~arg4 > -1) {
                                    var75 -= arg4 * var19;
                                    arg4 = 0;
                                }
                                if (~var20 > ~var21) {
                                    int var76 = arg1 - arg4;
                                    int var77 = arg4 - arg3;
                                    int var78 = class102.field1460 * arg3;
                                    while (true) {
                                        --var77;
                                        if (var77 < 0) {
                                            while (true) {
                                                --var76;
                                                if (~var76 > -1) {
                                                    return true;
                                                }
                                                if (!class190.method1263(var23, (byte) 76, (var75 >> 12) + 1, var78, var63, class185.field2719, 0, (var74 >> 12) + -1)) {
                                                    return false;
                                                }
                                                var78 += class102.field1460;
                                                var63 += var24;
                                                var75 += var19;
                                                var74 += var20;
                                            }
                                        }
                                        if (!class190.method1263(var23, (byte) -115, (var73 >> 12) + 1, var78, var63, class185.field2719, 0, (var74 >> 12) + -1)) {
                                            return false;
                                        }
                                        var73 += var21;
                                        var63 += var24;
                                        var74 += var20;
                                        var78 += class102.field1460;
                                    }
                                } else {
                                    int var79 = arg1 - arg4;
                                    int var80 = arg4 - arg3;
                                    int var81 = class102.field1460 * arg3;
                                    while (true) {
                                        --var80;
                                        if (var80 < 0) {
                                            while (true) {
                                                --var79;
                                                if (~var79 > -1) {
                                                    return true;
                                                }
                                                if (!class190.method1263(var23, (byte) -114, (var74 >> 12) + 1, var81, var63, class185.field2719, 0, (var75 >> 12) + -1)) {
                                                    return false;
                                                }
                                                var74 += var20;
                                                var81 += class102.field1460;
                                                var75 += var19;
                                                var63 += var24;
                                            }
                                        }
                                        if (!class190.method1263(var23, (byte) -111, (var74 >> 12) - -1, var81, var63, class185.field2719, 0, (var73 >> 12) + -1)) {
                                            return false;
                                        }
                                        var81 += class102.field1460;
                                        var73 += var21;
                                        var63 += var24;
                                        var74 += var20;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBII)V")
    public final void method2618(int arg0, byte arg1, int arg2, int arg3) {
        super.field10528 = arg0;
        if (arg1 != -108) {
            field5962 = null;
        }
        ++field5961;
        super.field10513 = arg3;
        super.field10515 = arg2;
    }
}
