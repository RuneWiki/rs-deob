import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class788 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field10814;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Ljava/lang/String;")
    public String field10820;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Z")
    public static boolean field10817 = false;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lqk;")
    public static class1 field10816 = new class1(5, 2);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field10813;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field10815;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field10819;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIBIIIIII)Z")
    public static final boolean method4323(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field10815++;
        if (arg5 > 2000 || arg7 > 2000 || arg9 > 2000 || arg1 > 2000 || arg4 > 2000 || arg8 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg7 >= -2000 && arg9 >= -2000 && arg1 >= -2000 && arg4 >= -2000 && arg8 >= -2000) {
            if (class635.field8859 == 2) {
                int var10 = class516.field7079 * arg5 + arg1;
                if (var10 >= 0 && var10 < class130.field1683.length && (arg6 << 8) - 38400 < class130.field1683[var10]) {
                    return false;
                }
                int var11 = class516.field7079 * arg7 + arg4;
                if (var11 >= 0 && class130.field1683.length > var11 && class130.field1683[var11] > (arg0 << 8) - 38400) {
                    return false;
                }
                int var12 = class516.field7079 * arg9 + arg8;
                if (var12 >= 0 && class130.field1683.length > var12 && ((arg2 << 8) - 38400) < class130.field1683[var12]) {
                    return false;
                }
            }
            int var13 = arg4 - arg1;
            int var14 = arg7 - arg5;
            int var15 = arg8 - arg1;
            if (arg3 != 84) {
                field10817 = true;
            }
            int var16 = arg9 - arg5;
            int var17 = arg0 - arg6;
            if (arg5 < arg7 && arg9 > arg9) {
                arg5--;
                if (arg9 >= arg7) {
                    arg9++;
                } else {
                    arg7++;
                }
            } else if (arg9 > arg7) {
                arg7--;
                if (arg9 < arg5) {
                    arg5++;
                } else {
                    arg9++;
                }
            } else {
                arg9--;
                if (arg7 < arg5) {
                    arg5++;
                } else {
                    arg7++;
                }
            }
            int var18 = arg2 - arg6;
            int var19 = 0;
            if (arg5 != arg7) {
                var19 = (arg4 - arg1 << 12) / (arg7 - arg5);
            }
            int var20 = 0;
            if (arg7 != arg9) {
                var20 = (arg8 - arg4 << 12) / (arg9 - arg7);
            }
            int var21 = 0;
            if (arg5 != arg9) {
                var21 = (arg1 - arg8 << 12) / (arg5 - arg9);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg5 <= arg7 && arg5 <= arg9) {
                if (arg5 >= class258.field3793) {
                    return true;
                }
                int var25 = (arg6 << 8) + var23 - (arg1 * var23);
                if (class258.field3793 < arg7) {
                    arg7 = class258.field3793;
                }
                if (class258.field3793 < arg9) {
                    arg9 = class258.field3793;
                }
                if (arg9 > arg7) {
                    int var26;
                    int var27 = var26 = arg1 << 12;
                    if (arg5 < 0) {
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        var27 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var28 = arg4 << 12;
                    if (arg7 < 0) {
                        var28 -= arg7 * var20;
                        arg7 = 0;
                    }
                    if (arg5 != arg7 && var19 > var21 || arg5 == arg7 && var20 < var21) {
                        int var29 = arg9 - arg7;
                        int var30 = arg7 - arg5;
                        int var31 = class516.field7079 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var28 >> 12) + 1, var31, (var27 >> 12) - 1, var25)) {
                                        return false;
                                    }
                                    var31 += class516.field7079;
                                    var28 += var20;
                                    var27 += var21;
                                    var25 += var24;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var26 >> 12) + 1, var31, (var27 >> 12) - 1, var25)) {
                                return false;
                            }
                            var27 += var21;
                            var25 += var24;
                            var26 += var19;
                            var31 += class516.field7079;
                        }
                    } else {
                        int var32 = arg9 - arg7;
                        int var33 = arg7 - arg5;
                        int var34 = class516.field7079 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, arg3 ^ 0x56, var23, class130.field1683, (var27 >> 12) + 1, var34, (var28 >> 12) - 1, var25)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var28 += var20;
                                    var27 += var21;
                                    var34 += class516.field7079;
                                }
                            }
                            if (!class653.method3734(0, arg3 ^ 0x56, var23, class130.field1683, (var27 >> 12) + 1, var34, (var26 >> 12) - 1, var25)) {
                                return false;
                            }
                            var34 += class516.field7079;
                            var25 += var24;
                            var27 += var21;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg1 << 12;
                    int var37 = arg8 << 12;
                    if (arg5 < 0) {
                        var25 -= arg5 * var24;
                        var35 -= arg5 * var19;
                        var36 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg9 < 0) {
                        var37 -= arg9 * var20;
                        arg9 = 0;
                    }
                    if (arg5 != arg9 && var21 < var19 || arg5 == arg9 && var20 > var19) {
                        int var38 = arg7 - arg9;
                        int var39 = arg9 - arg5;
                        int var40 = class516.field7079 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var35 >> 12) + 1, var40, (var37 >> 12) - 1, var25)) {
                                        return false;
                                    }
                                    var35 += var19;
                                    var37 += var20;
                                    var25 += var24;
                                    var40 += class516.field7079;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var35 >> 12) + 1, var40, (var36 >> 12) - 1, var25)) {
                                return false;
                            }
                            var25 += var24;
                            var35 += var19;
                            var36 += var21;
                            var40 += class516.field7079;
                        }
                    } else {
                        int var41 = arg7 - arg9;
                        int var42 = arg9 - arg5;
                        int var43 = class516.field7079 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var37 >> 12) + 1, var43, (var35 >> 12) - 1, var25)) {
                                        return false;
                                    }
                                    var43 += class516.field7079;
                                    var35 += var19;
                                    var25 += var24;
                                    var37 += var20;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var36 >> 12) + 1, var43, (var35 >> 12) - 1, var25)) {
                                return false;
                            }
                            var43 += class516.field7079;
                            var36 += var21;
                            var35 += var19;
                            var25 += var24;
                        }
                    }
                }
            } else if (arg9 < arg7) {
                if (arg9 >= class258.field3793) {
                    return true;
                }
                if (arg5 > class258.field3793) {
                    arg5 = class258.field3793;
                }
                if (class258.field3793 < arg7) {
                    arg7 = class258.field3793;
                }
                int var44 = (arg2 << 8) + var23 - (arg8 * var23);
                if (arg5 < arg7) {
                    int var45;
                    int var46 = var45 = arg8 << 12;
                    int var47 = arg1 << 12;
                    if (arg9 < 0) {
                        var45 -= arg9 * var21;
                        var44 -= arg9 * var24;
                        var46 -= arg9 * var20;
                        arg9 = 0;
                    }
                    if (arg5 < 0) {
                        var47 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var20 >= var21) {
                        int var48 = arg7 - arg5;
                        int var49 = arg5 - arg9;
                        int var50 = class516.field7079 * arg9;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var46 >> 12) + 1, var50, (var47 >> 12) - 1, var44)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var50 += class516.field7079;
                                    var47 += var19;
                                    var46 += var20;
                                }
                            }
                            if (!class653.method3734(0, arg3 ^ 0x56, var23, class130.field1683, (var46 >> 12) + 1, var50, (var45 >> 12) - 1, var44)) {
                                return false;
                            }
                            var45 += var21;
                            var46 += var20;
                            var50 += class516.field7079;
                            var44 += var24;
                        }
                    } else {
                        int var51 = arg7 - arg5;
                        int var52 = arg5 - arg9;
                        int var53 = class516.field7079 * arg9;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, arg3 ^ 0x56, var23, class130.field1683, (var47 >> 12) + 1, var53, (var46 >> 12) - 1, var44)) {
                                        return false;
                                    }
                                    var46 += var20;
                                    var53 += class516.field7079;
                                    var47 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var45 >> 12) + 1, var53, (var46 >> 12) - 1, var44)) {
                                return false;
                            }
                            var45 += var21;
                            var44 += var24;
                            var53 += class516.field7079;
                            var46 += var20;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg8 << 12;
                    if (arg9 < 0) {
                        var55 -= arg9 * var20;
                        var44 -= arg9 * var24;
                        var54 -= arg9 * var21;
                        arg9 = 0;
                    }
                    int var56 = arg4 << 12;
                    if (arg7 < 0) {
                        var56 -= arg7 * var19;
                        arg7 = 0;
                    }
                    if (var20 < var21) {
                        int var57 = arg5 - arg7;
                        int var58 = arg7 - arg9;
                        int var59 = class516.field7079 * arg9;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var54 >> 12) + 1, var59, (var56 >> 12) - 1, var44)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var59 += class516.field7079;
                                    var44 += var24;
                                    var54 += var21;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var54 >> 12) + 1, var59, (var55 >> 12) - 1, var44)) {
                                return false;
                            }
                            var55 += var20;
                            var59 += class516.field7079;
                            var54 += var21;
                            var44 += var24;
                        }
                    } else {
                        int var60 = arg5 - arg7;
                        int var61 = arg7 - arg9;
                        int var62 = class516.field7079 * arg9;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var56 >> 12) + 1, var62, (var54 >> 12) - 1, var44)) {
                                        return false;
                                    }
                                    var54 += var21;
                                    var44 += var24;
                                    var56 += var19;
                                    var62 += class516.field7079;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var55 >> 12) + 1, var62, (var54 >> 12) - 1, var44)) {
                                return false;
                            }
                            var55 += var20;
                            var54 += var21;
                            var44 += var24;
                            var62 += class516.field7079;
                        }
                    }
                }
            } else if (arg7 >= class258.field3793) {
                return true;
            } else {
                if (class258.field3793 < arg9) {
                    arg9 = class258.field3793;
                }
                int var63 = (arg0 << 8) + var23 - (arg4 * var23);
                if (class258.field3793 < arg5) {
                    arg5 = class258.field3793;
                }
                if (arg9 < arg5) {
                    int var64;
                    int var65 = var64 = arg4 << 12;
                    int var66 = arg8 << 12;
                    if (arg7 < 0) {
                        var64 -= arg7 * var20;
                        var63 -= arg7 * var24;
                        var65 -= arg7 * var19;
                        arg7 = 0;
                    }
                    if (arg9 < 0) {
                        var66 -= arg9 * var21;
                        arg9 = 0;
                    }
                    if ((arg7 == arg9 || var19 >= var20) && (arg7 != arg9 || var19 <= var21)) {
                        int var70 = arg5 - arg9;
                        int var71 = arg9 - arg7;
                        int var72 = class516.field7079 * arg7;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var65 >> 12) + 1, var72, (var66 >> 12) - 1, var63)) {
                                        return false;
                                    }
                                    var72 += class516.field7079;
                                    var65 += var19;
                                    var66 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class653.method3734(0, arg3 - 82, var23, class130.field1683, (var65 >> 12) + 1, var72, (var64 >> 12) - 1, var63)) {
                                return false;
                            }
                            var72 += class516.field7079;
                            var64 += var20;
                            var65 += var19;
                            var63 += var24;
                        }
                    } else {
                        int var67 = arg5 - arg9;
                        int var68 = arg9 - arg7;
                        int var69 = class516.field7079 * arg7;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var66 >> 12) + 1, var69, (var65 >> 12) - 1, var63)) {
                                        return false;
                                    }
                                    var65 += var19;
                                    var69 += class516.field7079;
                                    var66 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var64 >> 12) + 1, var69, (var65 >> 12) - 1, var63)) {
                                return false;
                            }
                            var65 += var19;
                            var69 += class516.field7079;
                            var63 += var24;
                            var64 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg4 << 12;
                    int var75 = arg1 << 12;
                    if (arg7 < 0) {
                        var74 -= arg7 * var19;
                        var73 -= arg7 * var20;
                        var63 -= arg7 * var24;
                        arg7 = 0;
                    }
                    if (arg5 < 0) {
                        var75 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var20 <= var19) {
                        int var76 = arg9 - arg5;
                        int var77 = arg5 - arg7;
                        int var78 = class516.field7079 * arg7;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, arg3 - 82, var23, class130.field1683, (var75 >> 12) + 1, var78, (var73 >> 12) - 1, var63)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var73 += var20;
                                    var78 += class516.field7079;
                                    var63 += var24;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var74 >> 12) + 1, var78, (var73 >> 12) - 1, var63)) {
                                return false;
                            }
                            var74 += var19;
                            var73 += var20;
                            var63 += var24;
                            var78 += class516.field7079;
                        }
                    } else {
                        int var79 = arg9 - arg5;
                        int var80 = arg5 - arg7;
                        int var81 = class516.field7079 * arg7;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class653.method3734(0, 2, var23, class130.field1683, (var73 >> 12) + 1, var81, (var75 >> 12) - 1, var63)) {
                                        return false;
                                    }
                                    var81 += class516.field7079;
                                    var75 += var21;
                                    var73 += var20;
                                    var63 += var24;
                                }
                            }
                            if (!class653.method3734(0, 2, var23, class130.field1683, (var73 >> 12) + 1, var81, (var74 >> 12) - 1, var63)) {
                                return false;
                            }
                            var63 += var24;
                            var73 += var20;
                            var81 += class516.field7079;
                            var74 += var19;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method4324(byte arg0) {
        field10816 = null;
        int var1 = 116 / ((-arg0 - 19) / 61);
    }

    @OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10813++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method4325(int arg0, int arg1) {
        field10818++;
        if (arg0 != 27586) {
            method4325(-29, -82);
        }
        class469 var2 = (class469) class297.field4327.method3669(false, (long) arg1);
        if (var2 != null) {
            class254 var3 = var2.field6502.method2973(-1123);
            if (var3 != null) {
                double var4 = var2.field6502.method2959(58);
                if (var4 >= (double) var3.method1701(false) && var4 <= (double) var3.method1697(false)) {
                    return var3.method1698(true);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class788(String arg0, int arg1) {
        this.field10814 = arg1;
        this.field10820 = arg0;
    }
}
