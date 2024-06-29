import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class234 {

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Luf;")
    private class380 field3109 = new class380(16);

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Lga;")
    private class332 field3115;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Lrb;")
    public static class379 field3113;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 6)
    public static void method1446(byte arg0) {
        if (arg0 == 77) {
            field3113 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIZIIII)Z", line = 16)
    public static final boolean method1447(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field3106++;
        if (arg6 > 2000 || arg1 > 2000 || arg4 > 2000 || arg7 > 2000 || arg0 > 2000 || arg8 > 2000) {
            return false;
        } else if (arg6 >= -2000 && arg1 >= -2000 && arg4 >= -2000 && arg7 >= -2000 && arg0 >= -2000 && arg8 >= -2000) {
            if (class585.field8079 == 2) {
                int var10 = class6.field65 * arg6 + arg7;
                if (var10 >= 0 && class429.field5777.length > var10 && class429.field5777[var10] > (arg9 << 8) - 15360) {
                    return false;
                }
                int var11 = class6.field65 * arg1 + arg0;
                if (var11 >= 0 && var11 < class429.field5777.length && (arg2 << 8) - 15360 < class429.field5777[var11]) {
                    return false;
                }
                int var12 = arg8 + (class6.field65 * arg4);
                if (var12 >= 0 && var12 < class429.field5777.length && class429.field5777[var12] > (arg3 << 8) - 15360) {
                    return false;
                }
            }
            int var13 = arg0 - arg7;
            int var14 = arg1 - arg6;
            int var15 = arg8 - arg7;
            int var16 = arg4 - arg6;
            int var17 = arg2 - arg9;
            int var18 = arg3 - arg9;
            if (arg1 > arg6 && arg4 < arg4) {
                arg6--;
                if (arg1 > arg4) {
                    arg1++;
                } else {
                    arg4++;
                }
            } else if (arg1 >= arg4) {
                arg4--;
                if (arg6 > arg1) {
                    arg6++;
                } else {
                    arg1++;
                }
            } else {
                if (arg6 <= arg4) {
                    arg4++;
                } else {
                    arg6++;
                }
                arg1--;
            }
            int var19 = 0;
            if (arg1 != arg6) {
                var19 = (arg0 - arg7 << 12) / (arg1 - arg6);
            }
            if (!arg5) {
                method1447(52, -55, -87, -103, 63, false, 124, -107, -99, -36);
            }
            int var20 = 0;
            if (arg1 != arg4) {
                var20 = (arg8 - arg0 << 12) / (arg4 - arg1);
            }
            int var21 = 0;
            if (arg4 != arg6) {
                var21 = (arg7 - arg8 << 12) / (arg6 - arg4);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg1 >= arg6 && arg4 >= arg6) {
                if (arg6 >= class442.field5873) {
                    return true;
                }
                if (arg4 > class442.field5873) {
                    arg4 = class442.field5873;
                }
                if (arg1 > class442.field5873) {
                    arg1 = class442.field5873;
                }
                int var25 = (arg9 << 8) + var23 - (arg7 * var23);
                if (arg4 > arg1) {
                    int var26;
                    int var27 = var26 = arg7 << 12;
                    int var28 = arg0 << 12;
                    if (arg6 < 0) {
                        var26 -= arg6 * var19;
                        var27 -= arg6 * var21;
                        var25 -= arg6 * var24;
                        arg6 = 0;
                    }
                    if (arg1 < 0) {
                        var28 -= arg1 * var20;
                        arg1 = 0;
                    }
                    if (arg1 != arg6 && var19 > var21 || arg1 == arg6 && var21 > var20) {
                        int var29 = arg4 - arg1;
                        int var30 = arg1 - arg6;
                        int var31 = class6.field65 * arg6;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var28 >> 12) + 1, var25, -16800, class429.field5777, var31, 0, (var27 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var27 += var21;
                                    var31 += class6.field65;
                                }
                            }
                            if (!class678.method3867((var26 >> 12) + 1, var25, -16800, class429.field5777, var31, 0, (var27 >> 12) - 1, var23)) {
                                return false;
                            }
                            var25 += var24;
                            var27 += var21;
                            var26 += var19;
                            var31 += class6.field65;
                        }
                    } else {
                        int var32 = arg4 - arg1;
                        int var33 = arg1 - arg6;
                        int var34 = class6.field65 * arg6;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var27 >> 12) + 1, var25, -16800, class429.field5777, var34, 0, (var28 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var27 += var21;
                                    var28 += var20;
                                    var34 += class6.field65;
                                }
                            }
                            if (!class678.method3867((var27 >> 12) + 1, var25, -16800, class429.field5777, var34, 0, (var26 >> 12) - 1, var23)) {
                                return false;
                            }
                            var25 += var24;
                            var27 += var21;
                            var34 += class6.field65;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg7 << 12;
                    if (arg6 < 0) {
                        var36 -= arg6 * var21;
                        var25 -= arg6 * var24;
                        var35 -= arg6 * var19;
                        arg6 = 0;
                    }
                    int var37 = arg8 << 12;
                    if (arg4 < 0) {
                        var37 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if ((arg4 == arg6 || var19 <= var21) && (arg4 != arg6 || var20 <= var19)) {
                        int var41 = arg1 - arg4;
                        int var42 = arg4 - arg6;
                        int var43 = class6.field65 * arg6;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var37 >> 12) + 1, var25, -16800, class429.field5777, var43, 0, (var35 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var37 += var20;
                                    var35 += var19;
                                    var43 += class6.field65;
                                }
                            }
                            if (!class678.method3867((var36 >> 12) + 1, var25, -16800, class429.field5777, var43, 0, (var35 >> 12) - 1, var23)) {
                                return false;
                            }
                            var43 += class6.field65;
                            var36 += var21;
                            var25 += var24;
                            var35 += var19;
                        }
                    } else {
                        int var38 = arg1 - arg4;
                        int var39 = arg4 - arg6;
                        int var40 = class6.field65 * arg6;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var35 >> 12) + 1, var25, -16800, class429.field5777, var40, 0, (var37 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var40 += class6.field65;
                                    var37 += var20;
                                    var35 += var19;
                                    var25 += var24;
                                }
                            }
                            if (!class678.method3867((var35 >> 12) + 1, var25, -16800, class429.field5777, var40, 0, (var36 >> 12) - 1, var23)) {
                                return false;
                            }
                            var25 += var24;
                            var35 += var19;
                            var36 += var21;
                            var40 += class6.field65;
                        }
                    }
                }
            } else if (arg4 < arg1) {
                if (arg4 >= class442.field5873) {
                    return true;
                }
                int var44 = (arg3 << 8) + var23 - (arg8 * var23);
                if (class442.field5873 < arg1) {
                    arg1 = class442.field5873;
                }
                if (arg6 > class442.field5873) {
                    arg6 = class442.field5873;
                }
                if (arg6 >= arg1) {
                    int var45;
                    int var46 = var45 = arg8 << 12;
                    if (arg4 < 0) {
                        var44 -= arg4 * var24;
                        var45 -= arg4 * var21;
                        var46 -= arg4 * var20;
                        arg4 = 0;
                    }
                    int var47 = arg0 << 12;
                    if (arg1 < 0) {
                        var47 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (var20 >= var21) {
                        int var48 = arg6 - arg1;
                        int var49 = arg1 - arg4;
                        int var50 = class6.field65 * arg4;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var47 >> 12) + 1, var44, -16800, class429.field5777, var50, 0, (var45 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var44 += var24;
                                    var47 += var19;
                                    var50 += class6.field65;
                                }
                            }
                            if (!class678.method3867((var46 >> 12) + 1, var44, -16800, class429.field5777, var50, 0, (var45 >> 12) - 1, var23)) {
                                return false;
                            }
                            var45 += var21;
                            var44 += var24;
                            var46 += var20;
                            var50 += class6.field65;
                        }
                    } else {
                        int var51 = arg6 - arg1;
                        int var52 = arg1 - arg4;
                        int var53 = class6.field65 * arg4;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var45 >> 12) + 1, var44, -16800, class429.field5777, var53, 0, (var47 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var44 += var24;
                                    var47 += var19;
                                    var53 += class6.field65;
                                }
                            }
                            if (!class678.method3867((var45 >> 12) + 1, var44, -16800, class429.field5777, var53, 0, (var46 >> 12) - 1, var23)) {
                                return false;
                            }
                            var46 += var20;
                            var44 += var24;
                            var53 += class6.field65;
                            var45 += var21;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg8 << 12;
                    int var56 = arg7 << 12;
                    if (arg4 < 0) {
                        var54 -= arg4 * var21;
                        var44 -= arg4 * var24;
                        var55 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg6 < 0) {
                        var56 -= arg6 * var19;
                        arg6 = 0;
                    }
                    if (var20 >= var21) {
                        int var57 = arg1 - arg6;
                        int var58 = arg6 - arg4;
                        int var59 = class6.field65 * arg4;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var55 >> 12) + 1, var44, -16800, class429.field5777, var59, 0, (var56 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var55 += var20;
                                    var56 += var19;
                                    var44 += var24;
                                    var59 += class6.field65;
                                }
                            }
                            if (!class678.method3867((var55 >> 12) + 1, var44, -16800, class429.field5777, var59, 0, (var54 >> 12) - 1, var23)) {
                                return false;
                            }
                            var44 += var24;
                            var55 += var20;
                            var59 += class6.field65;
                            var54 += var21;
                        }
                    } else {
                        int var60 = arg1 - arg6;
                        int var61 = arg6 - arg4;
                        int var62 = class6.field65 * arg4;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var56 >> 12) + 1, var44, -16800, class429.field5777, var62, 0, (var55 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var19;
                                    var62 += class6.field65;
                                    var55 += var20;
                                }
                            }
                            if (!class678.method3867((var54 >> 12) + 1, var44, -16800, class429.field5777, var62, 0, (var55 >> 12) - 1, var23)) {
                                return false;
                            }
                            var44 += var24;
                            var62 += class6.field65;
                            var55 += var20;
                            var54 += var21;
                        }
                    }
                }
            } else if (arg1 >= class442.field5873) {
                return true;
            } else {
                if (arg4 > class442.field5873) {
                    arg4 = class442.field5873;
                }
                if (arg6 > class442.field5873) {
                    arg6 = class442.field5873;
                }
                int var63 = (arg2 << 8) + var23 - (arg0 * var23);
                if (arg4 >= arg6) {
                    int var64;
                    int var65 = var64 = arg0 << 12;
                    int var66 = arg7 << 12;
                    if (arg1 < 0) {
                        var64 -= arg1 * var20;
                        var63 -= arg1 * var24;
                        var65 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (arg6 < 0) {
                        var66 -= arg6 * var21;
                        arg6 = 0;
                    }
                    if (var19 < var20) {
                        int var67 = arg4 - arg6;
                        int var68 = arg6 - arg1;
                        int var69 = class6.field65 * arg1;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var64 >> 12) + 1, var63, -16800, class429.field5777, var69, 0, (var66 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var64 += var20;
                                    var69 += class6.field65;
                                    var63 += var24;
                                    var66 += var21;
                                }
                            }
                            if (!class678.method3867((var64 >> 12) + 1, var63, -16800, class429.field5777, var69, 0, (var65 >> 12) - 1, var23)) {
                                return false;
                            }
                            var63 += var24;
                            var64 += var20;
                            var69 += class6.field65;
                            var65 += var19;
                        }
                    } else {
                        int var70 = arg4 - arg6;
                        int var71 = arg6 - arg1;
                        int var72 = class6.field65 * arg1;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var66 >> 12) + 1, var63, -16800, class429.field5777, var72, 0, (var64 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var72 += class6.field65;
                                    var66 += var21;
                                    var63 += var24;
                                    var64 += var20;
                                }
                            }
                            if (!class678.method3867((var65 >> 12) + 1, var63, -16800, class429.field5777, var72, 0, (var64 >> 12) - 1, var23)) {
                                return false;
                            }
                            var72 += class6.field65;
                            var64 += var20;
                            var65 += var19;
                            var63 += var24;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg0 << 12;
                    if (arg1 < 0) {
                        var73 -= arg1 * var20;
                        var74 -= arg1 * var19;
                        var63 -= arg1 * var24;
                        arg1 = 0;
                    }
                    int var75 = arg8 << 12;
                    if (arg4 < 0) {
                        var75 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if ((arg1 == arg4 || var19 >= var20) && (arg1 != arg4 || var19 <= var21)) {
                        int var79 = arg6 - arg4;
                        int var80 = arg4 - arg1;
                        int var81 = class6.field65 * arg1;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var74 >> 12) + 1, var63, -16800, class429.field5777, var81, 0, (var75 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var81 += class6.field65;
                                    var63 += var24;
                                    var74 += var19;
                                }
                            }
                            if (!class678.method3867((var74 >> 12) + 1, var63, -16800, class429.field5777, var81, 0, (var73 >> 12) - 1, var23)) {
                                return false;
                            }
                            var63 += var24;
                            var81 += class6.field65;
                            var73 += var20;
                            var74 += var19;
                        }
                    } else {
                        int var76 = arg6 - arg4;
                        int var77 = arg4 - arg1;
                        int var78 = class6.field65 * arg1;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class678.method3867((var75 >> 12) + 1, var63, -16800, class429.field5777, var78, 0, (var74 >> 12) - 1, var23)) {
                                        return false;
                                    }
                                    var74 += var19;
                                    var78 += class6.field65;
                                    var75 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class678.method3867((var73 >> 12) + 1, var63, -16800, class429.field5777, var78, 0, (var74 >> 12) - 1, var23)) {
                                return false;
                            }
                            var78 += class6.field65;
                            var63 += var24;
                            var74 += var19;
                            var73 += var20;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([[BILsca;)V", line = 654)
    public static final void method1448(byte[][] arg0, int arg1, class235 arg2) {
        field3114++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field1038; var4++) {
            class276.method1656(-896460184);
            for (int var5 = 0; var5 < (class703.field9886 >> 3); var5++) {
                for (int var6 = 0; var6 < class431.field5789 >> 3; var6++) {
                    int var7 = class328.field4408[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field1035 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class126.field1760.length; var13++) {
                                if (class126.field1760[var13] == var12 && arg0[var13] != null) {
                                    class157 var14 = new class157(arg0[var13]);
                                    arg2.method463(var14, var5 * 8, class322.field4302, var8, var10, var6 * 8, var11, var4, (byte) 113, var9);
                                    arg2.method1456(var4, var3[0] == -1 ? var3 : null, var5 * 8, var8, var14, class146.field1963, var9, var10, var6 * 8, (byte) -73, var11);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class292.field3855 = class579.field7919.method2379(var3[1], class400.field5313, var3[2], var3[0], 0, var3[3]);
            class701.field9871 = var3[4];
        }
        if (arg1 != -538) {
            method1447(54, 22, 75, 73, 25, false, -126, 121, 46, -18);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZILrca;)V", line = 735)
    public static final void method1449(boolean arg0, int arg1, class34 arg2) {
        if (class690.field9747) {
            arg1 = 0;
            class690.field9747 = false;
        }
        field3105++;
        if (class548.field7499 == null || !class548.field7499.method200((byte) 61, arg2)) {
            class548.field7499 = arg2;
            class302.field3998 = class529.method2982((byte) -69);
            class461.field6057 = arg1;
            class601.field8393 = arg1;
            if (class601.field8393 == 0) {
                class276.method1657(1553501896);
            } else {
                class391.field5234 = class115.field1469;
                class54.field704 = class494.field6810;
                class680.field9654 = class216.field2836;
                class1.field6 = class115.field1480;
                class534.field7342 = class668.field9496;
                class363.field4794 = class640.field8827;
                class76.field898 = class428.field5761;
                class665.field9459 = class279.field3681;
                class527.field7300 = class458.field6017;
                class364.field4811 = class287.field3792;
            }
        }
        if (arg0) {
            method1448(null, 77, null);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 776)
    public static final void method1450(int arg0) {
        class420.method2373(96);
        field3111++;
        class97.field1175 = null;
        class289.field3807.field2219 = 0;
        class315.field4223 = null;
        class630.field8724 = null;
        class213.field2817 = null;
        class151.field2070 = 0;
        class220.field2872 = 0;
        class422.field5543 = 0;
        class440.method2485(0);
        class184.method1219((byte) 83);
        for (int var1 = 0; var1 < 2048; var1++) {
            class513.field7145[var1] = null;
        }
        class408.field5369 = null;
        if (arg0 > -98) {
            method1448(null, 32, null);
        }
        for (int var2 = 0; var2 < class468.field6163; var2++) {
            class351 var4 = class591.field8148[var2].field5354;
            if (var4 != null) {
                var4.field3045 = -1;
            }
        }
        class675.method3841(118);
        class311.field4200 = 1;
        class83.field1004 = -1;
        class342.field4585 = -1;
        class28.method182(10, 29697);
        for (int var3 = 0; var3 < 100; var3++) {
            class325.field4383[var3] = true;
        }
        class616.method3406((byte) -126);
        class506.field6984 = null;
        class647.field8939 = 0L;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V", line = 837)
    public final void method1451(int arg0) {
        field3107++;
        class380 var2 = this.field3109;
        synchronized (this.field3109) {
            this.field3109.method2168((byte) -101);
        }
        if (arg0 != 1033704076) {
            this.field3115 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 853)
    public final void method1452(byte arg0) {
        class380 var2 = this.field3109;
        synchronized (this.field3109) {
            this.field3109.method2172(-15112);
            if (arg0 != -2) {
                method1447(54, 120, -121, 40, 54, true, 12, -74, 23, 102);
            }
        }
        field3112++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V", line = 868)
    public final void method1453(int arg0, boolean arg1) {
        class380 var3 = this.field3109;
        synchronized (this.field3109) {
            if (!arg1) {
                method1450(71);
            }
            this.field3109.method2179(false, arg0);
        }
        field3110++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)Ltn;", line = 885)
    public final class568 method1454(int arg0, byte arg1) {
        if (arg1 <= 27) {
            this.method1453(67, true);
        }
        field3116++;
        class380 var3 = this.field3109;
        class568 var4;
        synchronized (this.field3109) {
            var4 = (class568) this.field3109.method2176(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field3115;
        byte[] var6;
        synchronized (this.field3115) {
            var6 = this.field3115.method1938(arg0, 30, -17);
        }
        class568 var7 = new class568();
        if (var6 != null) {
            var7.method3146(new class157(var6), 0);
        }
        class380 var8 = this.field3109;
        synchronized (this.field3109) {
            this.field3109.method2174(var7, (long) arg0, (byte) 123);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 916)
    public class234(class650 arg0, int arg1, class332 arg2) {
        this.field3115 = arg2;
        this.field3115.method1939(0, 30);
    }
}
