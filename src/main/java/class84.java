import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class84 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lkd;")
    public static class700 field1270 = new class700(1);

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1271 = -1;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method637(int arg0, String arg1) {
        field1272++;
        class251.field3625 = arg1;
        if (class492.field7063 == null) {
            return;
        }
        if (arg0 != -1) {
            method638(-111, -40, 69, 54, 114, 15, -42, -20, -98, 105);
        }
        try {
            String var2 = class492.field7063.getParameter("cookieprefix");
            String var3 = class492.field7063.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class450.method2623(class254.method1619(true) + 94608000000L, 1) + "; Max-Age=" + 94608000L;
            }
            class157.method1179("document.cookie=\"" + var5 + "\"", 14818, class492.field7063);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIII)Z", line = 39)
    public static final boolean method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1269++;
        if (arg4 > 2000 || arg1 > 2000 || arg2 > 2000 || arg6 > 2000 || arg5 > 2000 || arg0 > 2000) {
            return false;
        } else if (arg4 >= -2000 && arg1 >= -2000 && arg2 >= -2000 && arg6 >= -2000 && arg5 >= -2000 && arg0 >= -2000) {
            if (class540.field7931 == 2) {
                int var10 = class346.field4893 * arg4 + arg6;
                if (var10 >= 0 && var10 < class213.field3236.length && (arg3 << 8) - 38400 < class213.field3236[var10]) {
                    return false;
                }
                int var11 = class346.field4893 * arg1 + arg5;
                if (var11 >= 0 && var11 < class213.field3236.length && class213.field3236[var11] > (arg7 << 8) - 38400) {
                    return false;
                }
                int var12 = arg0 + (class346.field4893 * arg2);
                if (var12 >= 0 && class213.field3236.length > var12 && ((arg9 << 8) - 38400) < class213.field3236[var12]) {
                    return false;
                }
            }
            int var13 = arg5 - arg6;
            int var14 = arg1 - arg4;
            int var15 = arg0 - arg6;
            int var16 = arg2 - arg4;
            int var17 = arg7 - arg3;
            int var18 = arg9 - arg3;
            if (arg1 > arg4 && arg2 > arg2) {
                if (arg1 <= arg2) {
                    arg2++;
                } else {
                    arg1++;
                }
                arg4--;
            } else if (arg2 > arg1) {
                arg1--;
                if (arg4 > arg2) {
                    arg4++;
                } else {
                    arg2++;
                }
            } else {
                arg2--;
                if (arg4 <= arg1) {
                    arg1++;
                } else {
                    arg4++;
                }
            }
            int var19 = 0;
            if (arg1 != arg4) {
                var19 = (arg5 - arg6 << 12) / (arg1 - arg4);
            }
            if (arg8 <= 7) {
                field1270 = null;
            }
            int var20 = 0;
            if (arg1 != arg2) {
                var20 = (arg0 - arg5 << 12) / (arg2 - arg1);
            }
            int var21 = 0;
            if (arg2 != arg4) {
                var21 = (arg6 - arg0 << 12) / (arg4 - arg2);
            }
            int var22 = var13 * var16 - var14 * var15;
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg4 <= arg1 && arg4 <= arg2) {
                if (arg4 >= class348.field4915) {
                    return true;
                }
                if (arg2 > class348.field4915) {
                    arg2 = class348.field4915;
                }
                if (class348.field4915 < arg1) {
                    arg1 = class348.field4915;
                }
                int var25 = (arg3 << 8) + (var23 - (arg6 * var23));
                if (arg2 > arg1) {
                    int var26;
                    int var27 = var26 = arg6 << 12;
                    int var28 = arg5 << 12;
                    if (arg4 < 0) {
                        var26 -= arg4 * var19;
                        var25 -= arg4 * var24;
                        var27 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (arg1 < 0) {
                        var28 -= arg1 * var20;
                        arg1 = 0;
                    }
                    if (arg1 != arg4 && var21 < var19 || arg1 == arg4 && var21 > var20) {
                        int var29 = arg2 - arg1;
                        int var30 = arg1 - arg4;
                        int var31 = class346.field4893 * arg4;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var27 >> 12) - 1, var25, class213.field3236, var23, var31, (byte) -65, (var28 >> 12) + 1)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var27 += var21;
                                    var31 += class346.field4893;
                                }
                            }
                            if (!class1.method2(0, (var27 >> 12) - 1, var25, class213.field3236, var23, var31, (byte) -26, (var26 >> 12) + 1)) {
                                return false;
                            }
                            var26 += var19;
                            var27 += var21;
                            var25 += var24;
                            var31 += class346.field4893;
                        }
                    } else {
                        int var32 = arg2 - arg1;
                        int var33 = arg1 - arg4;
                        int var34 = class346.field4893 * arg4;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var28 >> 12) - 1, var25, class213.field3236, var23, var34, (byte) -80, (var27 >> 12) + 1)) {
                                        return false;
                                    }
                                    var27 += var21;
                                    var25 += var24;
                                    var28 += var20;
                                    var34 += class346.field4893;
                                }
                            }
                            if (!class1.method2(0, (var26 >> 12) - 1, var25, class213.field3236, var23, var34, (byte) -42, (var27 >> 12) + 1)) {
                                return false;
                            }
                            var25 += var24;
                            var34 += class346.field4893;
                            var26 += var19;
                            var27 += var21;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg6 << 12;
                    int var37 = arg0 << 12;
                    if (arg4 < 0) {
                        var35 -= arg4 * var19;
                        var36 -= arg4 * var21;
                        var25 -= arg4 * var24;
                        arg4 = 0;
                    }
                    if (arg2 < 0) {
                        var37 -= arg2 * var20;
                        arg2 = 0;
                    }
                    if (arg2 != arg4 && var19 > var21 || arg2 == arg4 && var19 < var20) {
                        int var38 = arg1 - arg2;
                        int var39 = arg2 - arg4;
                        int var40 = class346.field4893 * arg4;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var37 >> 12) - 1, var25, class213.field3236, var23, var40, (byte) 107, (var35 >> 12) + 1)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var37 += var20;
                                    var35 += var19;
                                    var40 += class346.field4893;
                                }
                            }
                            if (!class1.method2(0, (var36 >> 12) - 1, var25, class213.field3236, var23, var40, (byte) 123, (var35 >> 12) + 1)) {
                                return false;
                            }
                            var40 += class346.field4893;
                            var25 += var24;
                            var35 += var19;
                            var36 += var21;
                        }
                    } else {
                        int var41 = arg1 - arg2;
                        int var42 = arg2 - arg4;
                        int var43 = class346.field4893 * arg4;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var35 >> 12) - 1, var25, class213.field3236, var23, var43, (byte) 110, (var37 >> 12) + 1)) {
                                        return false;
                                    }
                                    var43 += class346.field4893;
                                    var25 += var24;
                                    var35 += var19;
                                    var37 += var20;
                                }
                            }
                            if (!class1.method2(0, (var35 >> 12) - 1, var25, class213.field3236, var23, var43, (byte) 123, (var36 >> 12) + 1)) {
                                return false;
                            }
                            var25 += var24;
                            var43 += class346.field4893;
                            var36 += var21;
                            var35 += var19;
                        }
                    }
                }
            } else if (arg1 > arg2) {
                if (arg2 >= class348.field4915) {
                    return true;
                }
                if (class348.field4915 < arg1) {
                    arg1 = class348.field4915;
                }
                if (class348.field4915 < arg4) {
                    arg4 = class348.field4915;
                }
                int var44 = (arg9 << 8) + var23 - (arg0 * var23);
                if (arg1 > arg4) {
                    int var45;
                    int var46 = var45 = arg0 << 12;
                    if (arg2 < 0) {
                        var44 -= arg2 * var24;
                        var45 -= arg2 * var21;
                        var46 -= arg2 * var20;
                        arg2 = 0;
                    }
                    int var47 = arg6 << 12;
                    if (arg4 < 0) {
                        var47 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (var21 <= var20) {
                        int var48 = arg1 - arg4;
                        int var49 = arg4 - arg2;
                        int var50 = class346.field4893 * arg2;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var47 >> 12) - 1, var44, class213.field3236, var23, var50, (byte) -94, (var46 >> 12) + 1)) {
                                        return false;
                                    }
                                    var47 += var19;
                                    var44 += var24;
                                    var50 += class346.field4893;
                                    var46 += var20;
                                }
                            }
                            if (!class1.method2(0, (var45 >> 12) - 1, var44, class213.field3236, var23, var50, (byte) 107, (var46 >> 12) + 1)) {
                                return false;
                            }
                            var46 += var20;
                            var50 += class346.field4893;
                            var45 += var21;
                            var44 += var24;
                        }
                    } else {
                        int var51 = arg1 - arg4;
                        int var52 = arg4 - arg2;
                        int var53 = class346.field4893 * arg2;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var46 >> 12) - 1, var44, class213.field3236, var23, var53, (byte) -89, (var47 >> 12) + 1)) {
                                        return false;
                                    }
                                    var47 += var19;
                                    var53 += class346.field4893;
                                    var46 += var20;
                                    var44 += var24;
                                }
                            }
                            if (!class1.method2(0, (var46 >> 12) - 1, var44, class213.field3236, var23, var53, (byte) 5, (var45 >> 12) + 1)) {
                                return false;
                            }
                            var53 += class346.field4893;
                            var45 += var21;
                            var46 += var20;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg0 << 12;
                    if (arg2 < 0) {
                        var44 -= arg2 * var24;
                        var54 -= arg2 * var21;
                        var55 -= arg2 * var20;
                        arg2 = 0;
                    }
                    int var56 = arg5 << 12;
                    if (arg1 < 0) {
                        var56 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (var21 <= var20) {
                        int var57 = arg4 - arg1;
                        int var58 = arg1 - arg2;
                        int var59 = class346.field4893 * arg2;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var54 >> 12) - 1, var44, class213.field3236, var23, var59, (byte) 118, (var56 >> 12) + 1)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var54 += var21;
                                    var59 += class346.field4893;
                                    var44 += var24;
                                }
                            }
                            if (!class1.method2(0, (var54 >> 12) - 1, var44, class213.field3236, var23, var59, (byte) 99, (var55 >> 12) + 1)) {
                                return false;
                            }
                            var59 += class346.field4893;
                            var54 += var21;
                            var55 += var20;
                            var44 += var24;
                        }
                    } else {
                        int var60 = arg4 - arg1;
                        int var61 = arg1 - arg2;
                        int var62 = class346.field4893 * arg2;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var56 >> 12) - 1, var44, class213.field3236, var23, var62, (byte) -26, (var54 >> 12) + 1)) {
                                        return false;
                                    }
                                    var62 += class346.field4893;
                                    var44 += var24;
                                    var56 += var19;
                                    var54 += var21;
                                }
                            }
                            if (!class1.method2(0, (var55 >> 12) - 1, var44, class213.field3236, var23, var62, (byte) -63, (var54 >> 12) + 1)) {
                                return false;
                            }
                            var54 += var21;
                            var44 += var24;
                            var55 += var20;
                            var62 += class346.field4893;
                        }
                    }
                }
            } else if (arg1 >= class348.field4915) {
                return true;
            } else {
                if (class348.field4915 < arg2) {
                    arg2 = class348.field4915;
                }
                if (arg4 > class348.field4915) {
                    arg4 = class348.field4915;
                }
                int var63 = (arg7 << 8) + var23 - (arg5 * var23);
                if (arg2 >= arg4) {
                    int var64;
                    int var65 = var64 = arg5 << 12;
                    int var66 = arg6 << 12;
                    if (arg1 < 0) {
                        var64 -= arg1 * var20;
                        var63 -= arg1 * var24;
                        var65 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (arg4 < 0) {
                        var66 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (var19 >= var20) {
                        int var67 = arg2 - arg4;
                        int var68 = arg4 - arg1;
                        int var69 = class346.field4893 * arg1;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var64 >> 12) - 1, var63, class213.field3236, var23, var69, (byte) 109, (var66 >> 12) + 1)) {
                                        return false;
                                    }
                                    var69 += class346.field4893;
                                    var64 += var20;
                                    var63 += var24;
                                    var66 += var21;
                                }
                            }
                            if (!class1.method2(0, (var64 >> 12) - 1, var63, class213.field3236, var23, var69, (byte) -81, (var65 >> 12) + 1)) {
                                return false;
                            }
                            var69 += class346.field4893;
                            var65 += var19;
                            var64 += var20;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg2 - arg4;
                        int var71 = arg4 - arg1;
                        int var72 = class346.field4893 * arg1;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var66 >> 12) - 1, var63, class213.field3236, var23, var72, (byte) 118, (var64 >> 12) + 1)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var72 += class346.field4893;
                                    var64 += var20;
                                    var66 += var21;
                                }
                            }
                            if (!class1.method2(0, (var65 >> 12) - 1, var63, class213.field3236, var23, var72, (byte) 116, (var64 >> 12) + 1)) {
                                return false;
                            }
                            var64 += var20;
                            var72 += class346.field4893;
                            var63 += var24;
                            var65 += var19;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg5 << 12;
                    if (arg1 < 0) {
                        var73 -= arg1 * var20;
                        var63 -= arg1 * var24;
                        var74 -= arg1 * var19;
                        arg1 = 0;
                    }
                    int var75 = arg0 << 12;
                    if (arg2 < 0) {
                        var75 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var19 >= var20) && (arg1 != arg2 || var21 >= var19)) {
                        int var79 = arg4 - arg2;
                        int var80 = arg2 - arg1;
                        int var81 = class346.field4893 * arg1;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var75 >> 12) - 1, var63, class213.field3236, var23, var81, (byte) 124, (var74 >> 12) + 1)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var81 += class346.field4893;
                                    var74 += var19;
                                    var75 += var21;
                                }
                            }
                            if (!class1.method2(0, (var73 >> 12) - 1, var63, class213.field3236, var23, var81, (byte) -40, (var74 >> 12) + 1)) {
                                return false;
                            }
                            var73 += var20;
                            var81 += class346.field4893;
                            var63 += var24;
                            var74 += var19;
                        }
                    } else {
                        int var76 = arg4 - arg2;
                        int var77 = arg2 - arg1;
                        int var78 = class346.field4893 * arg1;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class1.method2(0, (var74 >> 12) - 1, var63, class213.field3236, var23, var78, (byte) 114, (var75 >> 12) + 1)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var78 += class346.field4893;
                                    var63 += var24;
                                    var74 += var19;
                                }
                            }
                            if (!class1.method2(0, (var74 >> 12) - 1, var63, class213.field3236, var23, var78, (byte) 115, (var73 >> 12) + 1)) {
                                return false;
                            }
                            var78 += class346.field4893;
                            var74 += var19;
                            var73 += var20;
                            var63 += var24;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lvo;III)Lcr;", line = 677)
    public static final class163 method639(class345 arg0, int arg1, int arg2, int arg3) {
        field1268++;
        byte[] var4 = arg0.method2081(arg1 ^ 0x1089, arg3, arg2);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 != -4341) {
                method637(-102, null);
            }
            return new class163(var4);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 695)
    public static void method640(int arg0) {
        if (arg0 != 0) {
            method639(null, -88, -93, 28);
        }
        field1270 = null;
    }
}
