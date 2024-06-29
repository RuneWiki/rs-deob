import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class357 {

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ljb;")
    public static class519 field5203 = new class519(119, -1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5202++;
        if (arg3 > 2000 || arg4 > 2000 || arg5 > 2000 || arg6 > 2000 || arg0 > 2000 || arg1 > 2000) {
            return false;
        } else if (arg3 >= -2000 && arg4 >= -2000 && arg5 >= -2000 && arg6 >= -2000 && arg0 >= -2000 && arg1 >= -2000) {
            if (class682.field9115 == 2) {
                int var10 = class151.field2054 * arg3 + arg6;
                if (var10 >= 0 && var10 < class99.field1448.length && (arg9 << 8) - 38400 < class99.field1448[var10]) {
                    return false;
                }
                int var11 = class151.field2054 * arg4 + arg0;
                if (var11 >= 0 && var11 < class99.field1448.length && (arg2 << 8) - 38400 < class99.field1448[var11]) {
                    return false;
                }
                int var12 = class151.field2054 * arg5 + arg1;
                if (var12 >= 0 && class99.field1448.length > var12 && ((arg8 << 8) - 38400) < class99.field1448[var12]) {
                    return false;
                }
            }
            int var13 = arg0 - arg6;
            int var14 = arg4 - arg3;
            int var15 = arg1 - arg6;
            int var16 = arg5 - arg3;
            int var17 = arg2 - arg9;
            int var18 = arg8 - arg9;
            if (arg3 < arg4 && arg5 < arg5) {
                if (arg4 <= arg5) {
                    arg5++;
                } else {
                    arg4++;
                }
                arg3--;
            } else if (arg5 <= arg4) {
                if (arg4 >= arg3) {
                    arg4++;
                } else {
                    arg3++;
                }
                arg5--;
            } else {
                arg4--;
                if (arg3 > arg5) {
                    arg3++;
                } else {
                    arg5++;
                }
            }
            int var19 = 0;
            if (arg3 != arg4) {
                var19 = (arg0 - arg6 << 12) / (arg4 - arg3);
            }
            int var20 = 0;
            if (arg7 != -5630) {
                method2264(-53, null);
            }
            if (arg4 != arg5) {
                var20 = (arg1 - arg0 << 12) / (arg5 - arg4);
            }
            int var21 = 0;
            if (arg3 != arg5) {
                var21 = (arg6 - arg1 << 12) / (arg3 - arg5);
            }
            int var22 = var13 * var16 - var14 * var15;
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg4 >= arg3 && arg5 >= arg3) {
                if (arg3 >= class493.field6934) {
                    return true;
                }
                if (class493.field6934 < arg4) {
                    arg4 = class493.field6934;
                }
                if (class493.field6934 < arg5) {
                    arg5 = class493.field6934;
                }
                int var25 = (arg9 << 8) + var23 - (arg6 * var23);
                if (arg5 > arg4) {
                    int var26;
                    int var27 = var26 = arg6 << 12;
                    if (arg3 < 0) {
                        var26 -= arg3 * var19;
                        var27 -= arg3 * var21;
                        var25 -= arg3 * var24;
                        arg3 = 0;
                    }
                    int var28 = arg0 << 12;
                    if (arg4 < 0) {
                        var28 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg3 != arg4 && var21 < var19 || arg3 == arg4 && var21 > var20) {
                        int var29 = arg5 - arg4;
                        int var30 = arg4 - arg3;
                        int var31 = class151.field2054 * arg3;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var28 >> 12) + 1, var25, class99.field1448, var31, (byte) 100, (var27 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var31 += class151.field2054;
                                    var28 += var20;
                                    var25 += var24;
                                    var27 += var21;
                                }
                            }
                            if (!class448.method2668(0, (var26 >> 12) + 1, var25, class99.field1448, var31, (byte) 100, (var27 >> 12) - 1, var23)) {
                                return false;
                            }
                            var26 += var19;
                            var31 += class151.field2054;
                            var25 += var24;
                            var27 += var21;
                        }
                    } else {
                        int var32 = arg5 - arg4;
                        int var33 = arg4 - arg3;
                        int var34 = class151.field2054 * arg3;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var27 >> 12) + 1, var25, class99.field1448, var34, (byte) 100, (var28 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var27 += var21;
                                    var34 += class151.field2054;
                                    var25 += var24;
                                    var28 += var20;
                                }
                            }
                            if (!class448.method2668(0, (var27 >> 12) + 1, var25, class99.field1448, var34, (byte) 100, (var26 >> 12) - 1, var23)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var34 += class151.field2054;
                            var27 += var21;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg6 << 12;
                    if (arg3 < 0) {
                        var36 -= arg3 * var21;
                        var25 -= arg3 * var24;
                        var35 -= arg3 * var19;
                        arg3 = 0;
                    }
                    int var37 = arg1 << 12;
                    if (arg5 < 0) {
                        var37 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if ((arg3 == arg5 || var21 >= var19) && (arg3 != arg5 || var19 >= var20)) {
                        int var41 = arg4 - arg5;
                        int var42 = arg5 - arg3;
                        int var43 = class151.field2054 * arg3;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var37 >> 12) + 1, var25, class99.field1448, var43, (byte) 100, (var35 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var25 += var24;
                                    var43 += class151.field2054;
                                    var35 += var19;
                                }
                            }
                            if (!class448.method2668(0, (var36 >> 12) + 1, var25, class99.field1448, var43, (byte) 100, (var35 >> 12) - 1, var23)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var43 += class151.field2054;
                        }
                    } else {
                        int var38 = arg4 - arg5;
                        int var39 = arg5 - arg3;
                        int var40 = class151.field2054 * arg3;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var35 >> 12) + 1, var25, class99.field1448, var40, (byte) 100, (var37 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var37 += var20;
                                    var40 += class151.field2054;
                                    var35 += var19;
                                }
                            }
                            if (!class448.method2668(0, (var35 >> 12) + 1, var25, class99.field1448, var40, (byte) 100, (var36 >> 12) - 1, var23)) {
                                return false;
                            }
                            var36 += var21;
                            var35 += var19;
                            var25 += var24;
                            var40 += class151.field2054;
                        }
                    }
                }
            } else if (arg4 <= arg5) {
                if (class493.field6934 <= arg4) {
                    return true;
                }
                if (arg5 > class493.field6934) {
                    arg5 = class493.field6934;
                }
                if (arg3 > class493.field6934) {
                    arg3 = class493.field6934;
                }
                int var44 = (arg2 << 8) + var23 - (arg0 * var23);
                if (arg3 <= arg5) {
                    int var45;
                    int var46 = var45 = arg0 << 12;
                    if (arg4 < 0) {
                        var45 -= arg4 * var20;
                        var46 -= arg4 * var19;
                        var44 -= arg4 * var24;
                        arg4 = 0;
                    }
                    int var47 = arg6 << 12;
                    if (arg3 < 0) {
                        var47 -= arg3 * var21;
                        arg3 = 0;
                    }
                    if (var19 < var20) {
                        int var48 = arg5 - arg3;
                        int var49 = arg3 - arg4;
                        int var50 = class151.field2054 * arg4;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var45 >> 12) + 1, var44, class99.field1448, var50, (byte) 100, (var47 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var45 += var20;
                                    var47 += var21;
                                    var50 += class151.field2054;
                                }
                            }
                            if (!class448.method2668(0, (var45 >> 12) + 1, var44, class99.field1448, var50, (byte) 100, (var46 >> 12) - 1, var23)) {
                                return false;
                            }
                            var45 += var20;
                            var50 += class151.field2054;
                            var44 += var24;
                            var46 += var19;
                        }
                    } else {
                        int var51 = arg5 - arg3;
                        int var52 = arg3 - arg4;
                        int var53 = class151.field2054 * arg4;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var47 >> 12) + 1, var44, class99.field1448, var53, (byte) 100, (var45 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var47 += var21;
                                    var53 += class151.field2054;
                                    var45 += var20;
                                }
                            }
                            if (!class448.method2668(0, (var46 >> 12) + 1, var44, class99.field1448, var53, (byte) 100, (var45 >> 12) - 1, var23)) {
                                return false;
                            }
                            var44 += var24;
                            var53 += class151.field2054;
                            var45 += var20;
                            var46 += var19;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg0 << 12;
                    int var56 = arg1 << 12;
                    if (arg4 < 0) {
                        var44 -= arg4 * var24;
                        var55 -= arg4 * var19;
                        var54 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg5 < 0) {
                        var56 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg4 != arg5 && var19 < var20 || arg4 == arg5 && var21 < var19) {
                        int var57 = arg3 - arg5;
                        int var58 = arg5 - arg4;
                        int var59 = class151.field2054 * arg4;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var56 >> 12) + 1, var44, class99.field1448, var59, (byte) 100, (var55 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var56 += var21;
                                    var55 += var19;
                                    var59 += class151.field2054;
                                    var44 += var24;
                                }
                            }
                            if (!class448.method2668(0, (var54 >> 12) + 1, var44, class99.field1448, var59, (byte) 100, (var55 >> 12) - 1, var23)) {
                                return false;
                            }
                            var44 += var24;
                            var59 += class151.field2054;
                            var55 += var19;
                            var54 += var20;
                        }
                    } else {
                        int var60 = arg3 - arg5;
                        int var61 = arg5 - arg4;
                        int var62 = class151.field2054 * arg4;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var55 >> 12) + 1, var44, class99.field1448, var62, (byte) 100, (var56 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var62 += class151.field2054;
                                    var55 += var19;
                                    var56 += var21;
                                }
                            }
                            if (!class448.method2668(0, (var55 >> 12) + 1, var44, class99.field1448, var62, (byte) 100, (var54 >> 12) - 1, var23)) {
                                return false;
                            }
                            var44 += var24;
                            var55 += var19;
                            var62 += class151.field2054;
                            var54 += var20;
                        }
                    }
                }
            } else if (class493.field6934 <= arg5) {
                return true;
            } else {
                if (class493.field6934 < arg4) {
                    arg4 = class493.field6934;
                }
                if (class493.field6934 < arg3) {
                    arg3 = class493.field6934;
                }
                int var63 = (arg8 << 8) + var23 - (arg1 * var23);
                if (arg3 >= arg4) {
                    int var64;
                    int var65 = var64 = arg1 << 12;
                    if (arg5 < 0) {
                        var64 -= arg5 * var21;
                        var63 -= arg5 * var24;
                        var65 -= arg5 * var20;
                        arg5 = 0;
                    }
                    int var66 = arg0 << 12;
                    if (arg4 < 0) {
                        var66 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (var21 <= var20) {
                        int var67 = arg3 - arg4;
                        int var68 = arg4 - arg5;
                        int var69 = class151.field2054 * arg5;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var66 >> 12) + 1, var63, class99.field1448, var69, (byte) 100, (var64 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var64 += var21;
                                    var63 += var24;
                                    var69 += class151.field2054;
                                    var66 += var19;
                                }
                            }
                            if (!class448.method2668(0, (var65 >> 12) + 1, var63, class99.field1448, var69, (byte) 100, (var64 >> 12) - 1, var23)) {
                                return false;
                            }
                            var63 += var24;
                            var69 += class151.field2054;
                            var65 += var20;
                            var64 += var21;
                        }
                    } else {
                        int var70 = arg3 - arg4;
                        int var71 = arg4 - arg5;
                        int var72 = class151.field2054 * arg5;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var64 >> 12) + 1, var63, class99.field1448, var72, (byte) 100, (var66 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var66 += var19;
                                    var63 += var24;
                                    var72 += class151.field2054;
                                    var64 += var21;
                                }
                            }
                            if (!class448.method2668(0, (var64 >> 12) + 1, var63, class99.field1448, var72, (byte) 100, (var65 >> 12) - 1, var23)) {
                                return false;
                            }
                            var72 += class151.field2054;
                            var64 += var21;
                            var63 += var24;
                            var65 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg1 << 12;
                    int var75 = arg6 << 12;
                    if (arg5 < 0) {
                        var63 -= arg5 * var24;
                        var74 -= arg5 * var20;
                        var73 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg3 < 0) {
                        var75 -= arg3 * var19;
                        arg3 = 0;
                    }
                    if (var20 >= var21) {
                        int var76 = arg4 - arg3;
                        int var77 = arg3 - arg5;
                        int var78 = class151.field2054 * arg5;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var74 >> 12) + 1, var63, class99.field1448, var78, (byte) 100, (var75 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var74 += var20;
                                    var78 += class151.field2054;
                                    var63 += var24;
                                    var75 += var19;
                                }
                            }
                            if (!class448.method2668(0, (var74 >> 12) + 1, var63, class99.field1448, var78, (byte) 100, (var73 >> 12) - 1, var23)) {
                                return false;
                            }
                            var78 += class151.field2054;
                            var74 += var20;
                            var73 += var21;
                            var63 += var24;
                        }
                    } else {
                        int var79 = arg4 - arg3;
                        int var80 = arg3 - arg5;
                        int var81 = class151.field2054 * arg5;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class448.method2668(0, (var75 >> 12) + 1, var63, class99.field1448, var81, (byte) 100, (var74 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var74 += var20;
                                    var81 += class151.field2054;
                                    var75 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class448.method2668(0, (var73 >> 12) + 1, var63, class99.field1448, var81, (byte) 100, (var74 >> 12) - 1, var23)) {
                                return false;
                            }
                            var73 += var21;
                            var74 += var20;
                            var81 += class151.field2054;
                            var63 += var24;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILdt;)Lrp;")
    public static final class460 method2264(int arg0, class254 arg1) {
        field5205++;
        if (arg0 == 14442) {
            class460 var2 = new class460();
            var2.field6559 = arg1.method1728((byte) 72);
            var2.field6562 = class749.field10088.method3391(var2.field6559, -108);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBII)I")
    public static final int method2265(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5206++;
        int var5 = arg0 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg1;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg4) : arg1;
        return arg2 == 112 ? ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6) : -44;
    }

    @OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5204++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
    public static final int method2266(int arg0) {
        if (arg0 < 61) {
            method2267(61, true, -26);
        }
        field5200++;
        return class732.method4038(0, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2267(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field5209 = -128;
        }
        field5207++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
    public class357(int arg0, int arg1) {
        this.field5208 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method2268(int arg0) {
        if (arg0 == -1) {
            field5203 = null;
        }
    }
}
