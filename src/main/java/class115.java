import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class115 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "Z")
    public static boolean field1513 = false;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "Lrn;")
    public static class633 field1515 = new class633(89, 2);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "Leba;")
    public static class691 field1518;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        field1515 = null;
        int var1 = -82 / ((arg0 + 23) / 63);
        field1518 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1517++;
        if (arg4 > 2000 || arg0 > 2000 || arg8 > 2000 || arg7 > 2000 || arg2 > 2000 || arg5 > 2000) {
            return false;
        } else if (arg4 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg7 >= -2000 && arg2 >= -2000 && arg5 >= -2000) {
            if (class191.field2669 == 2) {
                int var10 = class566.field7172 * arg4 + arg7;
                if (var10 >= 0 && var10 < class380.field4659.length && class380.field4659[var10] > ((arg9 << 8) - 38400)) {
                    return false;
                }
                int var11 = class566.field7172 * arg0 + arg2;
                if (var11 >= 0 && var11 < class380.field4659.length && class380.field4659[var11] > ((arg1 << 8) - 38400)) {
                    return false;
                }
                int var12 = class566.field7172 * arg8 + arg5;
                if (var12 >= 0 && class380.field4659.length > var12 && ((arg6 << 8) - 38400) < class380.field4659[var12]) {
                    return false;
                }
            }
            int var13 = arg2 - arg7;
            int var14 = arg0 - arg4;
            int var15 = arg5 - arg7;
            int var16 = arg8 - arg4;
            int var17 = arg1 - arg9;
            int var18 = arg6 - arg9;
            if (arg4 < arg0 && arg8 > arg8) {
                arg4--;
                if (arg8 < arg0) {
                    arg0++;
                } else {
                    arg8++;
                }
            } else if (arg0 >= arg8) {
                if (arg0 < arg4) {
                    arg4++;
                } else {
                    arg0++;
                }
                arg8--;
            } else {
                if (arg8 >= arg4) {
                    arg8++;
                } else {
                    arg4++;
                }
                arg0--;
            }
            int var19 = 0;
            int var20 = -46 % ((arg3 + 37) / 56);
            if (arg0 != arg4) {
                var19 = (arg2 - arg7 << 12) / (arg0 - arg4);
            }
            int var21 = 0;
            if (arg0 != arg8) {
                var21 = (arg5 - arg2 << 12) / (arg8 - arg0);
            }
            int var22 = 0;
            if (arg4 != arg8) {
                var22 = (arg7 - arg5 << 12) / (arg4 - arg8);
            }
            int var23 = var13 * var16 - (var14 * var15);
            if (var23 == 0) {
                return false;
            }
            int var24 = (var16 * var17 - (var14 * var18) << 8) / var23;
            int var25 = (var13 * var18 - (var15 * var17) << 8) / var23;
            if (arg4 <= arg0 && arg8 >= arg4) {
                if (arg4 >= class317.field3953) {
                    return true;
                }
                if (arg8 > class317.field3953) {
                    arg8 = class317.field3953;
                }
                int var26 = (arg9 << 8) + var24 - (arg7 * var24);
                if (class317.field3953 < arg0) {
                    arg0 = class317.field3953;
                }
                if (arg8 <= arg0) {
                    int var27;
                    int var28 = var27 = arg7 << 12;
                    int var29 = arg5 << 12;
                    if (arg4 < 0) {
                        var27 -= arg4 * var19;
                        var28 -= arg4 * var22;
                        var26 -= arg4 * var25;
                        arg4 = 0;
                    }
                    if (arg8 < 0) {
                        var29 -= arg8 * var21;
                        arg8 = 0;
                    }
                    if (arg4 != arg8 && var22 < var19 || arg4 == arg8 && var19 < var21) {
                        int var30 = arg0 - arg8;
                        int var31 = arg8 - arg4;
                        int var32 = class566.field7172 * arg4;
                        while (true) {
                            var31--;
                            if (var31 < 0) {
                                while (true) {
                                    var30--;
                                    if (var30 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-110, var32, (var29 >> 12) - 1, (var27 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var32 += class566.field7172;
                                    var29 += var21;
                                    var26 += var25;
                                    var27 += var19;
                                }
                            }
                            if (!class311.method1833(-91, var32, (var28 >> 12) - 1, (var27 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                return false;
                            }
                            var32 += class566.field7172;
                            var27 += var19;
                            var28 += var22;
                            var26 += var25;
                        }
                    } else {
                        int var33 = arg0 - arg8;
                        int var34 = arg8 - arg4;
                        int var35 = class566.field7172 * arg4;
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-96, var35, (var27 >> 12) - 1, (var29 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var27 += var19;
                                    var29 += var21;
                                    var35 += class566.field7172;
                                    var26 += var25;
                                }
                            }
                            if (!class311.method1833(-87, var35, (var27 >> 12) - 1, (var28 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                return false;
                            }
                            var26 += var25;
                            var28 += var22;
                            var27 += var19;
                            var35 += class566.field7172;
                        }
                    }
                } else {
                    int var36;
                    int var37 = var36 = arg7 << 12;
                    if (arg4 < 0) {
                        var26 -= arg4 * var25;
                        var37 -= arg4 * var22;
                        var36 -= arg4 * var19;
                        arg4 = 0;
                    }
                    int var38 = arg2 << 12;
                    if (arg0 < 0) {
                        var38 -= arg0 * var21;
                        arg0 = 0;
                    }
                    if ((arg0 == arg4 || var19 <= var22) && (arg0 != arg4 || var22 <= var21)) {
                        int var42 = arg8 - arg0;
                        int var43 = arg0 - arg4;
                        int var44 = class566.field7172 * arg4;
                        while (true) {
                            var43--;
                            if (var43 < 0) {
                                while (true) {
                                    var42--;
                                    if (var42 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-127, var44, (var38 >> 12) - 1, (var37 >> 12) - -1, var24, var26, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var44 += class566.field7172;
                                    var26 += var25;
                                    var38 += var21;
                                    var37 += var22;
                                }
                            }
                            if (!class311.method1833(-100, var44, (var36 >> 12) - 1, (var37 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                return false;
                            }
                            var36 += var19;
                            var26 += var25;
                            var37 += var22;
                            var44 += class566.field7172;
                        }
                    } else {
                        int var39 = arg8 - arg0;
                        int var40 = arg0 - arg4;
                        int var41 = class566.field7172 * arg4;
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-105, var41, (var37 >> 12) - 1, (var38 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var41 += class566.field7172;
                                    var38 += var21;
                                    var37 += var22;
                                    var26 += var25;
                                }
                            }
                            if (!class311.method1833(-99, var41, (var37 >> 12) - 1, (var36 >> 12) + 1, var24, var26, class380.field4659, 0)) {
                                return false;
                            }
                            var37 += var22;
                            var26 += var25;
                            var36 += var19;
                            var41 += class566.field7172;
                        }
                    }
                }
            } else if (arg0 > arg8) {
                if (arg8 >= class317.field3953) {
                    return true;
                }
                if (class317.field3953 < arg4) {
                    arg4 = class317.field3953;
                }
                int var45 = (arg6 << 8) + var24 - (arg5 * var24);
                if (arg0 > class317.field3953) {
                    arg0 = class317.field3953;
                }
                if (arg4 >= arg0) {
                    int var46;
                    int var47 = var46 = arg5 << 12;
                    if (arg8 < 0) {
                        var45 -= arg8 * var25;
                        var47 -= arg8 * var21;
                        var46 -= arg8 * var22;
                        arg8 = 0;
                    }
                    int var48 = arg2 << 12;
                    if (arg0 < 0) {
                        var48 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var22 > var21) {
                        int var49 = arg4 - arg0;
                        int var50 = arg0 - arg8;
                        int var51 = class566.field7172 * arg8;
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                while (true) {
                                    var49--;
                                    if (var49 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-114, var51, (var48 >> 12) - 1, (var46 >> 12) + 1, var24, var45, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var51 += class566.field7172;
                                    var45 += var25;
                                    var46 += var22;
                                    var48 += var19;
                                }
                            }
                            if (!class311.method1833(-111, var51, (var47 >> 12) - 1, (var46 >> 12) - -1, var24, var45, class380.field4659, 0)) {
                                return false;
                            }
                            var51 += class566.field7172;
                            var47 += var21;
                            var45 += var25;
                            var46 += var22;
                        }
                    } else {
                        int var52 = arg4 - arg0;
                        int var53 = arg0 - arg8;
                        int var54 = class566.field7172 * arg8;
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                while (true) {
                                    var52--;
                                    if (var52 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-92, var54, (var46 >> 12) - 1, (var48 >> 12) + 1, var24, var45, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var54 += class566.field7172;
                                    var45 += var25;
                                    var46 += var22;
                                    var48 += var19;
                                }
                            }
                            if (!class311.method1833(-94, var54, (var46 >> 12) - 1, (var47 >> 12) + 1, var24, var45, class380.field4659, 0)) {
                                return false;
                            }
                            var46 += var22;
                            var54 += class566.field7172;
                            var47 += var21;
                            var45 += var25;
                        }
                    }
                } else {
                    int var55;
                    int var56 = var55 = arg5 << 12;
                    int var57 = arg7 << 12;
                    if (arg8 < 0) {
                        var55 -= arg8 * var22;
                        var56 -= arg8 * var21;
                        var45 -= arg8 * var25;
                        arg8 = 0;
                    }
                    if (arg4 < 0) {
                        var57 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (var22 > var21) {
                        int var58 = arg0 - arg4;
                        int var59 = arg4 - arg8;
                        int var60 = class566.field7172 * arg8;
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                while (true) {
                                    var58--;
                                    if (var58 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-82, var60, (var56 >> 12) - 1, (var57 >> 12) + 1, var24, var45, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var60 += class566.field7172;
                                    var45 += var25;
                                    var57 += var19;
                                    var56 += var21;
                                }
                            }
                            if (!class311.method1833(-108, var60, (var56 >> 12) - 1, (var55 >> 12) - -1, var24, var45, class380.field4659, 0)) {
                                return false;
                            }
                            var56 += var21;
                            var55 += var22;
                            var45 += var25;
                            var60 += class566.field7172;
                        }
                    } else {
                        int var61 = arg0 - arg4;
                        int var62 = arg4 - arg8;
                        int var63 = class566.field7172 * arg8;
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                while (true) {
                                    var61--;
                                    if (var61 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-99, var63, (var57 >> 12) - 1, (var56 >> 12) + 1, var24, var45, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var63 += class566.field7172;
                                    var45 += var25;
                                    var56 += var21;
                                    var57 += var19;
                                }
                            }
                            if (!class311.method1833(-95, var63, (var55 >> 12) - 1, (var56 >> 12) - -1, var24, var45, class380.field4659, 0)) {
                                return false;
                            }
                            var55 += var22;
                            var45 += var25;
                            var63 += class566.field7172;
                            var56 += var21;
                        }
                    }
                }
            } else if (class317.field3953 <= arg0) {
                return true;
            } else {
                if (arg4 > class317.field3953) {
                    arg4 = class317.field3953;
                }
                int var64 = (arg1 << 8) + var24 - arg2 * var24;
                if (arg8 > class317.field3953) {
                    arg8 = class317.field3953;
                }
                if (arg8 >= arg4) {
                    int var65;
                    int var66 = var65 = arg2 << 12;
                    int var67 = arg7 << 12;
                    if (arg0 < 0) {
                        var65 -= arg0 * var21;
                        var66 -= arg0 * var19;
                        var64 -= arg0 * var25;
                        arg0 = 0;
                    }
                    if (arg4 < 0) {
                        var67 -= arg4 * var22;
                        arg4 = 0;
                    }
                    if (var19 >= var21) {
                        int var68 = arg8 - arg4;
                        int var69 = arg4 - arg0;
                        int var70 = class566.field7172 * arg0;
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-124, var70, (var65 >> 12) - 1, (var67 >> 12) - -1, var24, var64, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var64 += var25;
                                    var70 += class566.field7172;
                                    var65 += var21;
                                    var67 += var22;
                                }
                            }
                            if (!class311.method1833(-108, var70, (var65 >> 12) - 1, (var66 >> 12) + 1, var24, var64, class380.field4659, 0)) {
                                return false;
                            }
                            var65 += var21;
                            var70 += class566.field7172;
                            var64 += var25;
                            var66 += var19;
                        }
                    } else {
                        int var71 = arg8 - arg4;
                        int var72 = arg4 - arg0;
                        int var73 = class566.field7172 * arg0;
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-100, var73, (var67 >> 12) - 1, (var65 >> 12) - -1, var24, var64, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var73 += class566.field7172;
                                    var64 += var25;
                                    var67 += var22;
                                    var65 += var21;
                                }
                            }
                            if (!class311.method1833(-79, var73, (var66 >> 12) - 1, (var65 >> 12) + 1, var24, var64, class380.field4659, 0)) {
                                return false;
                            }
                            var73 += class566.field7172;
                            var65 += var21;
                            var64 += var25;
                            var66 += var19;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg2 << 12;
                    if (arg0 < 0) {
                        var64 -= arg0 * var25;
                        var75 -= arg0 * var19;
                        var74 -= arg0 * var21;
                        arg0 = 0;
                    }
                    int var76 = arg5 << 12;
                    if (arg8 < 0) {
                        var76 -= arg8 * var22;
                        arg8 = 0;
                    }
                    if ((arg0 == arg8 || var19 >= var21) && (arg0 != arg8 || var22 >= var19)) {
                        int var80 = arg4 - arg8;
                        int var81 = arg8 - arg0;
                        int var82 = class566.field7172 * arg0;
                        while (true) {
                            var81--;
                            if (var81 < 0) {
                                while (true) {
                                    var80--;
                                    if (var80 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-97, var82, (var76 >> 12) - 1, (var75 >> 12) - -1, var24, var64, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var82 += class566.field7172;
                                    var64 += var25;
                                    var75 += var19;
                                    var76 += var22;
                                }
                            }
                            if (!class311.method1833(-109, var82, (var74 >> 12) - 1, (var75 >> 12) + 1, var24, var64, class380.field4659, 0)) {
                                return false;
                            }
                            var82 += class566.field7172;
                            var75 += var19;
                            var64 += var25;
                            var74 += var21;
                        }
                    } else {
                        int var77 = arg4 - arg8;
                        int var78 = arg8 - arg0;
                        int var79 = class566.field7172 * arg0;
                        while (true) {
                            var78--;
                            if (var78 < 0) {
                                while (true) {
                                    var77--;
                                    if (var77 < 0) {
                                        return true;
                                    }
                                    if (!class311.method1833(-101, var79, (var75 >> 12) - 1, (var76 >> 12) + 1, var24, var64, class380.field4659, 0)) {
                                        return false;
                                    }
                                    var64 += var25;
                                    var79 += class566.field7172;
                                    var76 += var22;
                                    var75 += var19;
                                }
                            }
                            if (!class311.method1833(-107, var79, (var75 >> 12) - 1, (var74 >> 12) + 1, var24, var64, class380.field4659, 0)) {
                                return false;
                            }
                            var75 += var19;
                            var64 += var25;
                            var74 += var21;
                            var79 += class566.field7172;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method669(byte arg0, String arg1) throws ClassNotFoundException {
        field1516++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        }
        if (arg0 >= -76) {
            field1518 = null;
        }
        if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILko;Lko;)V")
    public static final void method670(int arg0, class337 arg1, class337 arg2) {
        field1514++;
        if (arg2.field4103 != null) {
            arg2.method1946(-10364);
        }
        arg2.field4111 = arg1;
        if (arg0 == 1) {
            arg2.field4103 = arg1.field4103;
            arg2.field4103.field4111 = arg2;
            arg2.field4111.field4103 = arg2;
        }
    }
}
