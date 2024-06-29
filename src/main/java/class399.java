import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class399 {

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    public static int[] field5583 = new int[3];

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field5582 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[F")
    public static float[] field5587 = new float[2];

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Z")
    public static boolean field5585 = false;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "F")
    public static float field5580;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Los;")
    public static class440 field5581;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method2471(byte arg0) {
        if (arg0 != -26) {
            method2474((byte) -58);
        }
        if (class564.field7978 == 1 || class564.field7978 == 3 || class564.field7978 != class4.field62 && (class564.field7978 == 0 || class4.field62 == 0)) {
            class152.field2290 = 0;
            class130.field1948 = 0;
            class758.field10539.method4204((byte) -89);
        }
        field5578++;
        class4.field62 = class564.field7978;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII[I)V")
    public static final void method2472(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg1--;
        field5579++;
        if (arg0 != 27113) {
            field5587 = null;
        }
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg4[var6] = arg3;
            int var7 = var6 + 1;
            arg4[var7] = arg3;
            int var9 = var7 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg1 = var13 + 1;
            arg4[arg1] = arg3;
        }
        while (arg1 < var8) {
            arg1++;
            arg4[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5577++;
        if (arg5 > 2000 || arg4 > 2000 || arg2 > 2000 || arg8 > 2000 || arg3 > 2000 || arg7 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg4 >= -2000 && arg2 >= -2000 && arg8 >= -2000 && arg3 >= -2000 && arg7 >= -2000) {
            if (class78.field1461 == 2) {
                int var10 = arg8 + (class136.field2124 * arg5);
                if (var10 >= 0 && class458.field6612.length > var10 && ((arg6 << 8) - 38400) < class458.field6612[var10]) {
                    return false;
                }
                int var11 = arg3 + (class136.field2124 * arg4);
                if (var11 >= 0 && var11 < class458.field6612.length && ((arg0 << 8) - 38400) < class458.field6612[var11]) {
                    return false;
                }
                int var12 = class136.field2124 * arg2 + arg7;
                if (var12 >= 0 && var12 < class458.field6612.length && ((arg9 << 8) - 38400) < class458.field6612[var12]) {
                    return false;
                }
            }
            int var13 = arg3 - arg8;
            int var14 = arg4 - arg5;
            int var15 = arg7 - arg8;
            int var16 = 101 % ((arg1 - 65) / 42);
            int var17 = arg2 - arg5;
            int var18 = arg0 - arg6;
            int var19 = arg9 - arg6;
            if (arg4 > arg5 && arg2 > arg2) {
                arg5--;
                if (arg2 < arg4) {
                    arg4++;
                } else {
                    arg2++;
                }
            } else if (arg4 >= arg2) {
                arg2--;
                if (arg4 >= arg5) {
                    arg4++;
                } else {
                    arg5++;
                }
            } else {
                arg4--;
                if (arg5 <= arg2) {
                    arg2++;
                } else {
                    arg5++;
                }
            }
            int var20 = 0;
            if (arg4 != arg5) {
                var20 = (arg3 - arg8 << 12) / (arg4 - arg5);
            }
            int var21 = 0;
            if (arg2 != arg4) {
                var21 = (arg7 - arg3 << 12) / (arg2 - arg4);
            }
            int var22 = 0;
            if (arg2 != arg5) {
                var22 = (arg8 - arg7 << 12) / (arg5 - arg2);
            }
            int var23 = var13 * var17 - (var14 * var15);
            if (var23 == 0) {
                return false;
            }
            int var24 = (var17 * var18 - (var14 * var19) << 8) / var23;
            int var25 = (var13 * var19 - (var15 * var18) << 8) / var23;
            if (arg4 >= arg5 && arg5 <= arg2) {
                if (arg5 >= class312.field4397) {
                    return true;
                }
                if (arg4 > class312.field4397) {
                    arg4 = class312.field4397;
                }
                if (arg2 > class312.field4397) {
                    arg2 = class312.field4397;
                }
                int var26 = (arg6 << 8) - (arg8 * var24 - var24);
                if (arg2 > arg4) {
                    int var27;
                    int var28 = var27 = arg8 << 12;
                    int var29 = arg3 << 12;
                    if (arg5 < 0) {
                        var26 -= arg5 * var25;
                        var27 -= arg5 * var20;
                        var28 -= arg5 * var22;
                        arg5 = 0;
                    }
                    if (arg4 < 0) {
                        var29 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (arg4 != arg5 && var20 > var22 || arg4 == arg5 && var22 > var21) {
                        int var30 = arg2 - arg4;
                        int var31 = arg4 - arg5;
                        int var32 = class136.field2124 * arg5;
                        while (true) {
                            var31--;
                            if (var31 < 0) {
                                while (true) {
                                    var30--;
                                    if (var30 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var28 >> 12) - 1, (var29 >> 12) + 1, 0, class458.field6612, var32, var26, 0)) {
                                        return false;
                                    }
                                    var26 += var25;
                                    var32 += class136.field2124;
                                    var28 += var22;
                                    var29 += var21;
                                }
                            }
                            if (!class335.method2142(var24, (var28 >> 12) - 1, (var27 >> 12) + 1, 0, class458.field6612, var32, var26, 0)) {
                                return false;
                            }
                            var26 += var25;
                            var28 += var22;
                            var32 += class136.field2124;
                            var27 += var20;
                        }
                    } else {
                        int var33 = arg2 - arg4;
                        int var34 = arg4 - arg5;
                        int var35 = class136.field2124 * arg5;
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var29 >> 12) - 1, (var28 >> 12) - -1, 0, class458.field6612, var35, var26, 0)) {
                                        return false;
                                    }
                                    var35 += class136.field2124;
                                    var29 += var21;
                                    var26 += var25;
                                    var28 += var22;
                                }
                            }
                            if (!class335.method2142(var24, (var27 >> 12) - 1, (var28 >> 12) - -1, 0, class458.field6612, var35, var26, 0)) {
                                return false;
                            }
                            var35 += class136.field2124;
                            var27 += var20;
                            var28 += var22;
                            var26 += var25;
                        }
                    }
                } else {
                    int var36;
                    int var37 = var36 = arg8 << 12;
                    if (arg5 < 0) {
                        var26 -= arg5 * var25;
                        var37 -= arg5 * var22;
                        var36 -= arg5 * var20;
                        arg5 = 0;
                    }
                    int var38 = arg7 << 12;
                    if (arg2 < 0) {
                        var38 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if (arg2 != arg5 && var22 < var20 || arg2 == arg5 && var21 > var20) {
                        int var39 = arg4 - arg2;
                        int var40 = arg2 - arg5;
                        int var41 = class136.field2124 * arg5;
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var38 >> 12) - 1, (var36 >> 12) - -1, 0, class458.field6612, var41, var26, 0)) {
                                        return false;
                                    }
                                    var38 += var21;
                                    var41 += class136.field2124;
                                    var26 += var25;
                                    var36 += var20;
                                }
                            }
                            if (!class335.method2142(var24, (var37 >> 12) - 1, (var36 >> 12) + 1, 0, class458.field6612, var41, var26, 0)) {
                                return false;
                            }
                            var37 += var22;
                            var36 += var20;
                            var41 += class136.field2124;
                            var26 += var25;
                        }
                    } else {
                        int var42 = arg4 - arg2;
                        int var43 = arg2 - arg5;
                        int var44 = class136.field2124 * arg5;
                        while (true) {
                            var43--;
                            if (var43 < 0) {
                                while (true) {
                                    var42--;
                                    if (var42 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var36 >> 12) - 1, (var38 >> 12) + 1, 0, class458.field6612, var44, var26, 0)) {
                                        return false;
                                    }
                                    var26 += var25;
                                    var36 += var20;
                                    var44 += class136.field2124;
                                    var38 += var21;
                                }
                            }
                            if (!class335.method2142(var24, (var36 >> 12) - 1, (var37 >> 12) + 1, 0, class458.field6612, var44, var26, 0)) {
                                return false;
                            }
                            var36 += var20;
                            var37 += var22;
                            var44 += class136.field2124;
                            var26 += var25;
                        }
                    }
                }
            } else if (arg2 >= arg4) {
                if (arg4 >= class312.field4397) {
                    return true;
                }
                int var45 = (arg0 << 8) + var24 - arg3 * var24;
                if (arg2 > class312.field4397) {
                    arg2 = class312.field4397;
                }
                if (arg5 > class312.field4397) {
                    arg5 = class312.field4397;
                }
                if (arg2 >= arg5) {
                    int var46;
                    int var47 = var46 = arg3 << 12;
                    int var48 = arg8 << 12;
                    if (arg4 < 0) {
                        var46 -= arg4 * var21;
                        var47 -= arg4 * var20;
                        var45 -= arg4 * var25;
                        arg4 = 0;
                    }
                    if (arg5 < 0) {
                        var48 -= arg5 * var22;
                        arg5 = 0;
                    }
                    if (var20 < var21) {
                        int var49 = arg2 - arg5;
                        int var50 = arg5 - arg4;
                        int var51 = class136.field2124 * arg4;
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                while (true) {
                                    var49--;
                                    if (var49 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var48 >> 12) - 1, (var46 >> 12) + 1, 0, class458.field6612, var51, var45, 0)) {
                                        return false;
                                    }
                                    var48 += var22;
                                    var46 += var21;
                                    var45 += var25;
                                    var51 += class136.field2124;
                                }
                            }
                            if (!class335.method2142(var24, (var47 >> 12) - 1, (var46 >> 12) + 1, 0, class458.field6612, var51, var45, 0)) {
                                return false;
                            }
                            var45 += var25;
                            var46 += var21;
                            var51 += class136.field2124;
                            var47 += var20;
                        }
                    } else {
                        int var52 = arg2 - arg5;
                        int var53 = arg5 - arg4;
                        int var54 = class136.field2124 * arg4;
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                while (true) {
                                    var52--;
                                    if (var52 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var46 >> 12) - 1, (var48 >> 12) - -1, 0, class458.field6612, var54, var45, 0)) {
                                        return false;
                                    }
                                    var46 += var21;
                                    var54 += class136.field2124;
                                    var48 += var22;
                                    var45 += var25;
                                }
                            }
                            if (!class335.method2142(var24, (var46 >> 12) - 1, (var47 >> 12) + 1, 0, class458.field6612, var54, var45, 0)) {
                                return false;
                            }
                            var47 += var20;
                            var46 += var21;
                            var54 += class136.field2124;
                            var45 += var25;
                        }
                    }
                } else {
                    int var55;
                    int var56 = var55 = arg3 << 12;
                    if (arg4 < 0) {
                        var56 -= arg4 * var20;
                        var45 -= arg4 * var25;
                        var55 -= arg4 * var21;
                        arg4 = 0;
                    }
                    int var57 = arg7 << 12;
                    if (arg2 < 0) {
                        var57 -= arg2 * var22;
                        arg2 = 0;
                    }
                    if ((arg2 == arg4 || var20 >= var21) && (arg2 != arg4 || var22 >= var20)) {
                        int var61 = arg5 - arg2;
                        int var62 = arg2 - arg4;
                        int var63 = class136.field2124 * arg4;
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                while (true) {
                                    var61--;
                                    if (var61 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var57 >> 12) - 1, (var56 >> 12) + 1, 0, class458.field6612, var63, var45, 0)) {
                                        return false;
                                    }
                                    var63 += class136.field2124;
                                    var56 += var20;
                                    var57 += var22;
                                    var45 += var25;
                                }
                            }
                            if (!class335.method2142(var24, (var55 >> 12) - 1, (var56 >> 12) + 1, 0, class458.field6612, var63, var45, 0)) {
                                return false;
                            }
                            var45 += var25;
                            var55 += var21;
                            var56 += var20;
                            var63 += class136.field2124;
                        }
                    } else {
                        int var58 = arg5 - arg2;
                        int var59 = arg2 - arg4;
                        int var60 = class136.field2124 * arg4;
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                while (true) {
                                    var58--;
                                    if (var58 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var56 >> 12) - 1, (var57 >> 12) - -1, 0, class458.field6612, var60, var45, 0)) {
                                        return false;
                                    }
                                    var56 += var20;
                                    var57 += var22;
                                    var45 += var25;
                                    var60 += class136.field2124;
                                }
                            }
                            if (!class335.method2142(var24, (var56 >> 12) - 1, (var55 >> 12) + 1, 0, class458.field6612, var60, var45, 0)) {
                                return false;
                            }
                            var55 += var21;
                            var60 += class136.field2124;
                            var56 += var20;
                            var45 += var25;
                        }
                    }
                }
            } else if (arg2 >= class312.field4397) {
                return true;
            } else {
                int var64 = (arg9 << 8) + var24 - arg7 * var24;
                if (class312.field4397 < arg4) {
                    arg4 = class312.field4397;
                }
                if (class312.field4397 < arg5) {
                    arg5 = class312.field4397;
                }
                if (arg4 > arg5) {
                    int var65;
                    int var66 = var65 = arg7 << 12;
                    if (arg2 < 0) {
                        var65 -= arg2 * var22;
                        var64 -= arg2 * var25;
                        var66 -= arg2 * var21;
                        arg2 = 0;
                    }
                    int var67 = arg8 << 12;
                    if (arg5 < 0) {
                        var67 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (var21 < var22) {
                        int var68 = arg4 - arg5;
                        int var69 = arg5 - arg2;
                        int var70 = class136.field2124 * arg2;
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var66 >> 12) - 1, (var67 >> 12) + 1, 0, class458.field6612, var70, var64, 0)) {
                                        return false;
                                    }
                                    var70 += class136.field2124;
                                    var67 += var20;
                                    var64 += var25;
                                    var66 += var21;
                                }
                            }
                            if (!class335.method2142(var24, (var66 >> 12) - 1, (var65 >> 12) + 1, 0, class458.field6612, var70, var64, 0)) {
                                return false;
                            }
                            var66 += var21;
                            var64 += var25;
                            var65 += var22;
                            var70 += class136.field2124;
                        }
                    } else {
                        int var71 = arg4 - arg5;
                        int var72 = arg5 - arg2;
                        int var73 = class136.field2124 * arg2;
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var67 >> 12) - 1, (var66 >> 12) - -1, 0, class458.field6612, var73, var64, 0)) {
                                        return false;
                                    }
                                    var67 += var20;
                                    var73 += class136.field2124;
                                    var66 += var21;
                                    var64 += var25;
                                }
                            }
                            if (!class335.method2142(var24, (var65 >> 12) - 1, (var66 >> 12) + 1, 0, class458.field6612, var73, var64, 0)) {
                                return false;
                            }
                            var66 += var21;
                            var73 += class136.field2124;
                            var65 += var22;
                            var64 += var25;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg7 << 12;
                    if (arg2 < 0) {
                        var74 -= arg2 * var22;
                        var75 -= arg2 * var21;
                        var64 -= arg2 * var25;
                        arg2 = 0;
                    }
                    int var76 = arg3 << 12;
                    if (arg4 < 0) {
                        var76 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (var21 >= var22) {
                        int var77 = arg5 - arg4;
                        int var78 = arg4 - arg2;
                        int var79 = class136.field2124 * arg2;
                        while (true) {
                            var78--;
                            if (var78 < 0) {
                                while (true) {
                                    var77--;
                                    if (var77 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var74 >> 12) - 1, (var76 >> 12) + 1, 0, class458.field6612, var79, var64, 0)) {
                                        return false;
                                    }
                                    var74 += var22;
                                    var76 += var20;
                                    var64 += var25;
                                    var79 += class136.field2124;
                                }
                            }
                            if (!class335.method2142(var24, (var74 >> 12) - 1, (var75 >> 12) + 1, 0, class458.field6612, var79, var64, 0)) {
                                return false;
                            }
                            var74 += var22;
                            var75 += var21;
                            var79 += class136.field2124;
                            var64 += var25;
                        }
                    } else {
                        int var80 = arg5 - arg4;
                        int var81 = arg4 - arg2;
                        int var82 = class136.field2124 * arg2;
                        while (true) {
                            var81--;
                            if (var81 < 0) {
                                while (true) {
                                    var80--;
                                    if (var80 < 0) {
                                        return true;
                                    }
                                    if (!class335.method2142(var24, (var76 >> 12) - 1, (var74 >> 12) - -1, 0, class458.field6612, var82, var64, 0)) {
                                        return false;
                                    }
                                    var74 += var22;
                                    var76 += var20;
                                    var82 += class136.field2124;
                                    var64 += var25;
                                }
                            }
                            if (!class335.method2142(var24, (var75 >> 12) - 1, (var74 >> 12) + 1, 0, class458.field6612, var82, var64, 0)) {
                                return false;
                            }
                            var74 += var22;
                            var82 += class136.field2124;
                            var75 += var21;
                            var64 += var25;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method2474(byte arg0) {
        field5587 = null;
        field5583 = null;
        field5581 = null;
        if (arg0 < 122) {
            method2472(-95, 61, 3, 35, null);
        }
    }
}
