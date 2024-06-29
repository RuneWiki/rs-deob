import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class590 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
    public static volatile boolean field8391 = false;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field8390 = 0;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lqk;", line = 5)
    public static final class146 method3467(int arg0, int arg1, int arg2) {
        field8392++;
        class146 var3 = class250.method1689(arg1, false);
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg0 != 1) {
                field8390 = -41;
            }
            return var3 == null || var3.field2019 == null || arg2 >= var3.field2019.length ? null : var3.field2019[arg2];
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIIZ)Z", line = 26)
    public static final boolean method3468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field8394++;
        if (arg3 > 2000 || arg4 > 2000 || arg0 > 2000 || arg8 > 2000 || arg2 > 2000 || arg1 > 2000) {
            return false;
        } else if (arg3 >= -2000 && arg4 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg2 >= -2000 && arg1 >= -2000) {
            if (class513.field7427 == 2) {
                int var10 = arg8 + (class165.field2353 * arg3);
                if (var10 >= 0 && var10 < class703.field9910.length && class703.field9910[var10] > (arg5 << 8) - 38400) {
                    return false;
                }
                int var11 = class165.field2353 * arg4 + arg2;
                if (var11 >= 0 && var11 < class703.field9910.length && class703.field9910[var11] > (arg6 << 8) - 38400) {
                    return false;
                }
                int var12 = class165.field2353 * arg0 + arg1;
                if (var12 >= 0 && class703.field9910.length > var12 && class703.field9910[var12] > ((arg7 << 8) - 38400)) {
                    return false;
                }
            }
            int var13 = arg2 - arg8;
            int var14 = arg4 - arg3;
            int var15 = arg1 - arg8;
            int var16 = arg0 - arg3;
            int var17 = arg6 - arg5;
            int var18 = arg7 - arg5;
            if (arg4 > arg3 && arg0 > arg0) {
                arg3--;
                if (arg0 < arg4) {
                    arg4++;
                } else {
                    arg0++;
                }
            } else if (arg0 > arg4) {
                if (arg0 < arg3) {
                    arg3++;
                } else {
                    arg0++;
                }
                arg4--;
            } else {
                if (arg4 < arg3) {
                    arg3++;
                } else {
                    arg4++;
                }
                arg0--;
            }
            int var19 = 0;
            if (arg3 != arg4) {
                var19 = (arg2 - arg8 << 12) / (arg4 - arg3);
            }
            int var20 = 0;
            if (arg0 != arg4) {
                var20 = (arg1 - arg2 << 12) / (arg0 - arg4);
            }
            int var21 = 0;
            if (arg0 != arg3) {
                var21 = (arg8 - arg1 << 12) / (arg3 - arg0);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            if (!arg9) {
                method3468(-37, 125, 78, 25, 61, 48, -44, -13, -11, false);
            }
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg3 <= arg4 && arg3 <= arg0) {
                if (class355.field5240 <= arg3) {
                    return true;
                }
                if (class355.field5240 < arg4) {
                    arg4 = class355.field5240;
                }
                int var25 = (arg5 << 8) + var23 - (arg8 * var23);
                if (class355.field5240 < arg0) {
                    arg0 = class355.field5240;
                }
                if (arg0 <= arg4) {
                    int var26;
                    int var27 = var26 = arg8 << 12;
                    int var28 = arg1 << 12;
                    if (arg3 < 0) {
                        var25 -= arg3 * var24;
                        var27 -= arg3 * var21;
                        var26 -= arg3 * var19;
                        arg3 = 0;
                    }
                    if (arg0 < 0) {
                        var28 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg0 != arg3 && var19 > var21 || arg0 == arg3 && var19 < var20) {
                        int var29 = arg4 - arg0;
                        int var30 = arg0 - arg3;
                        int var31 = class165.field2353 * arg3;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var25, var23, class703.field9910, (var28 >> 12) - 1, (var26 >> 12) + 1, 0, var31, (byte) -90)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var26 += var19;
                                    var31 += class165.field2353;
                                    var25 += var24;
                                }
                            }
                            if (!class600.method3503(var25, var23, class703.field9910, (var27 >> 12) - 1, (var26 >> 12) - -1, 0, var31, (byte) -90)) {
                                return false;
                            }
                            var25 += var24;
                            var31 += class165.field2353;
                            var26 += var19;
                            var27 += var21;
                        }
                    } else {
                        int var32 = arg4 - arg0;
                        int var33 = arg0 - arg3;
                        int var34 = class165.field2353 * arg3;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var25, var23, class703.field9910, (var26 >> 12) - 1, (var28 >> 12) + 1, 0, var34, (byte) -90)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var28 += var20;
                                    var26 += var19;
                                    var34 += class165.field2353;
                                }
                            }
                            if (!class600.method3503(var25, var23, class703.field9910, (var26 >> 12) - 1, (var27 >> 12) + 1, 0, var34, (byte) -90)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var27 += var21;
                            var34 += class165.field2353;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg8 << 12;
                    int var37 = arg2 << 12;
                    if (arg3 < 0) {
                        var35 -= arg3 * var19;
                        var36 -= arg3 * var21;
                        var25 -= arg3 * var24;
                        arg3 = 0;
                    }
                    if (arg4 < 0) {
                        var37 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if ((arg3 == arg4 || var21 >= var19) && (arg3 != arg4 || var21 <= var20)) {
                        int var41 = arg0 - arg4;
                        int var42 = arg4 - arg3;
                        int var43 = class165.field2353 * arg3;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var25, var23, class703.field9910, (var37 >> 12) - 1, (var36 >> 12) - -1, 0, var43, (byte) -90)) {
                                        return false;
                                    }
                                    var43 += class165.field2353;
                                    var36 += var21;
                                    var37 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class600.method3503(var25, var23, class703.field9910, (var35 >> 12) - 1, (var36 >> 12) + 1, 0, var43, (byte) -90)) {
                                return false;
                            }
                            var43 += class165.field2353;
                            var36 += var21;
                            var35 += var19;
                            var25 += var24;
                        }
                    } else {
                        int var38 = arg0 - arg4;
                        int var39 = arg4 - arg3;
                        int var40 = class165.field2353 * arg3;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var25, var23, class703.field9910, (var36 >> 12) - 1, (var37 >> 12) + 1, 0, var40, (byte) -90)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var25 += var24;
                                    var40 += class165.field2353;
                                    var36 += var21;
                                }
                            }
                            if (!class600.method3503(var25, var23, class703.field9910, (var36 >> 12) - 1, (var35 >> 12) - -1, 0, var40, (byte) -90)) {
                                return false;
                            }
                            var36 += var21;
                            var40 += class165.field2353;
                            var35 += var19;
                            var25 += var24;
                        }
                    }
                }
            } else if (arg4 <= arg0) {
                if (class355.field5240 <= arg4) {
                    return true;
                }
                if (class355.field5240 < arg0) {
                    arg0 = class355.field5240;
                }
                if (class355.field5240 < arg3) {
                    arg3 = class355.field5240;
                }
                int var44 = (arg6 << 8) + var23 - (arg2 * var23);
                if (arg0 >= arg3) {
                    int var45;
                    int var46 = var45 = arg2 << 12;
                    int var47 = arg8 << 12;
                    if (arg4 < 0) {
                        var44 -= arg4 * var24;
                        var45 -= arg4 * var20;
                        var46 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (arg3 < 0) {
                        var47 -= arg3 * var21;
                        arg3 = 0;
                    }
                    if (var19 < var20) {
                        int var48 = arg0 - arg3;
                        int var49 = arg3 - arg4;
                        int var50 = class165.field2353 * arg4;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var44, var23, class703.field9910, (var47 >> 12) - 1, (var45 >> 12) - -1, 0, var50, (byte) -90)) {
                                        return false;
                                    }
                                    var47 += var21;
                                    var50 += class165.field2353;
                                    var45 += var20;
                                    var44 += var24;
                                }
                            }
                            if (!class600.method3503(var44, var23, class703.field9910, (var46 >> 12) - 1, (var45 >> 12) - -1, 0, var50, (byte) -90)) {
                                return false;
                            }
                            var45 += var20;
                            var46 += var19;
                            var50 += class165.field2353;
                            var44 += var24;
                        }
                    } else {
                        int var51 = arg0 - arg3;
                        int var52 = arg3 - arg4;
                        int var53 = class165.field2353 * arg4;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var44, var23, class703.field9910, (var45 >> 12) - 1, (var47 >> 12) + 1, 0, var53, (byte) -90)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var45 += var20;
                                    var53 += class165.field2353;
                                    var47 += var21;
                                }
                            }
                            if (!class600.method3503(var44, var23, class703.field9910, (var45 >> 12) - 1, (var46 >> 12) - -1, 0, var53, (byte) -90)) {
                                return false;
                            }
                            var46 += var19;
                            var45 += var20;
                            var44 += var24;
                            var53 += class165.field2353;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg2 << 12;
                    if (arg4 < 0) {
                        var54 -= arg4 * var20;
                        var55 -= arg4 * var19;
                        var44 -= arg4 * var24;
                        arg4 = 0;
                    }
                    int var56 = arg1 << 12;
                    if (arg0 < 0) {
                        var56 -= arg0 * var21;
                        arg0 = 0;
                    }
                    if (arg0 != arg4 && var20 > var19 || arg0 == arg4 && var21 < var19) {
                        int var57 = arg3 - arg0;
                        int var58 = arg0 - arg4;
                        int var59 = class165.field2353 * arg4;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var44, var23, class703.field9910, (var55 >> 12) - 1, (var56 >> 12) + 1, 0, var59, (byte) -90)) {
                                        return false;
                                    }
                                    var55 += var19;
                                    var59 += class165.field2353;
                                    var56 += var21;
                                    var44 += var24;
                                }
                            }
                            if (!class600.method3503(var44, var23, class703.field9910, (var55 >> 12) - 1, (var54 >> 12) + 1, 0, var59, (byte) -90)) {
                                return false;
                            }
                            var55 += var19;
                            var54 += var20;
                            var44 += var24;
                            var59 += class165.field2353;
                        }
                    } else {
                        int var60 = arg3 - arg0;
                        int var61 = arg0 - arg4;
                        int var62 = class165.field2353 * arg4;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var44, var23, class703.field9910, (var56 >> 12) - 1, (var55 >> 12) - -1, 0, var62, (byte) -90)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var62 += class165.field2353;
                                    var56 += var21;
                                    var55 += var19;
                                }
                            }
                            if (!class600.method3503(var44, var23, class703.field9910, (var54 >> 12) - 1, (var55 >> 12) + 1, 0, var62, (byte) -90)) {
                                return false;
                            }
                            var55 += var19;
                            var62 += class165.field2353;
                            var54 += var20;
                            var44 += var24;
                        }
                    }
                }
            } else if (arg0 >= class355.field5240) {
                return true;
            } else {
                if (class355.field5240 < arg3) {
                    arg3 = class355.field5240;
                }
                int var63 = (arg7 << 8) + var23 - (arg1 * var23);
                if (arg4 > class355.field5240) {
                    arg4 = class355.field5240;
                }
                if (arg3 < arg4) {
                    int var64;
                    int var65 = var64 = arg1 << 12;
                    if (arg0 < 0) {
                        var65 -= arg0 * var20;
                        var64 -= arg0 * var21;
                        var63 -= arg0 * var24;
                        arg0 = 0;
                    }
                    int var66 = arg8 << 12;
                    if (arg3 < 0) {
                        var66 -= arg3 * var19;
                        arg3 = 0;
                    }
                    if (var20 < var21) {
                        int var67 = arg4 - arg3;
                        int var68 = arg3 - arg0;
                        int var69 = class165.field2353 * arg0;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var63, var23, class703.field9910, (var65 >> 12) - 1, (var66 >> 12) - -1, 0, var69, (byte) -90)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var65 += var20;
                                    var69 += class165.field2353;
                                    var66 += var19;
                                }
                            }
                            if (!class600.method3503(var63, var23, class703.field9910, (var65 >> 12) - 1, (var64 >> 12) + 1, 0, var69, (byte) -90)) {
                                return false;
                            }
                            var63 += var24;
                            var64 += var21;
                            var69 += class165.field2353;
                            var65 += var20;
                        }
                    } else {
                        int var70 = arg4 - arg3;
                        int var71 = arg3 - arg0;
                        int var72 = class165.field2353 * arg0;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var63, var23, class703.field9910, (var66 >> 12) - 1, (var65 >> 12) + 1, 0, var72, (byte) -90)) {
                                        return false;
                                    }
                                    var72 += class165.field2353;
                                    var65 += var20;
                                    var66 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class600.method3503(var63, var23, class703.field9910, (var64 >> 12) - 1, (var65 >> 12) - -1, 0, var72, (byte) -90)) {
                                return false;
                            }
                            var64 += var21;
                            var72 += class165.field2353;
                            var63 += var24;
                            var65 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg1 << 12;
                    if (arg0 < 0) {
                        var73 -= arg0 * var21;
                        var74 -= arg0 * var20;
                        var63 -= arg0 * var24;
                        arg0 = 0;
                    }
                    int var75 = arg2 << 12;
                    if (arg4 < 0) {
                        var75 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (var20 < var21) {
                        int var76 = arg3 - arg4;
                        int var77 = arg4 - arg0;
                        int var78 = class165.field2353 * arg0;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var63, var23, class703.field9910, (var75 >> 12) - 1, (var73 >> 12) + 1, 0, var78, (byte) -90)) {
                                        return false;
                                    }
                                    var75 += var19;
                                    var63 += var24;
                                    var73 += var21;
                                    var78 += class165.field2353;
                                }
                            }
                            if (!class600.method3503(var63, var23, class703.field9910, (var74 >> 12) - 1, (var73 >> 12) + 1, 0, var78, (byte) -90)) {
                                return false;
                            }
                            var78 += class165.field2353;
                            var63 += var24;
                            var74 += var20;
                            var73 += var21;
                        }
                    } else {
                        int var79 = arg3 - arg4;
                        int var80 = arg4 - arg0;
                        int var81 = class165.field2353 * arg0;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class600.method3503(var63, var23, class703.field9910, (var73 >> 12) - 1, (var75 >> 12) + 1, 0, var81, (byte) -90)) {
                                        return false;
                                    }
                                    var81 += class165.field2353;
                                    var75 += var19;
                                    var63 += var24;
                                    var73 += var21;
                                }
                            }
                            if (!class600.method3503(var63, var23, class703.field9910, (var73 >> 12) - 1, (var74 >> 12) + 1, 0, var81, (byte) -90)) {
                                return false;
                            }
                            var63 += var24;
                            var74 += var20;
                            var73 += var21;
                            var81 += class165.field2353;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I", line = 674)
    public static final int method3469(byte arg0) {
        if (arg0 != 123) {
            method3467(-68, -2, -35);
        }
        field8393++;
        return class288.field4001++;
    }
}
