import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class602 extends class134 {

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field8567;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field8568;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lso;")
    public static class468 field8569 = new class468(4, 3);

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[[B")
    public static byte[][] field8566;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method3417(int arg0) {
        field8569 = null;
        if (arg0 >= -23) {
            field8566 = null;
        }
        field8566 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
    public class602(int arg0, int arg1) {
        this.field8567 = arg0;
        this.field8568 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method3418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8570++;
        if (arg5 > 2000 || arg7 > 2000 || arg4 > 2000 || arg0 > 2000 || arg1 > 2000 || arg9 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg7 >= -2000 && arg4 >= -2000 && arg0 >= -2000 && arg1 >= -2000 && arg9 >= -2000) {
            if (class319.field4077 == 2) {
                int var10 = class244.field2887 * arg5 + arg0;
                if (var10 >= 0 && var10 < class707.field9970.length && ((arg2 << 8) - 38400) < class707.field9970[var10]) {
                    return false;
                }
                int var11 = class244.field2887 * arg7 + arg1;
                if (var11 >= 0 && var11 < class707.field9970.length && class707.field9970[var11] > ((arg8 << 8) - 38400)) {
                    return false;
                }
                int var12 = class244.field2887 * arg4 + arg9;
                if (var12 >= 0 && var12 < class707.field9970.length && (arg3 << 8) - 38400 < class707.field9970[var12]) {
                    return false;
                }
            }
            int var13 = arg1 - arg0;
            int var14 = arg7 - arg5;
            int var15 = arg9 - arg0;
            int var16 = arg4 - arg5;
            int var17 = arg8 - arg2;
            if (arg5 < arg7 && arg4 > arg4) {
                arg5--;
                if (arg7 <= arg4) {
                    arg4++;
                } else {
                    arg7++;
                }
            } else if (arg4 <= arg7) {
                if (arg5 <= arg7) {
                    arg7++;
                } else {
                    arg5++;
                }
                arg4--;
            } else {
                arg7--;
                if (arg4 >= arg5) {
                    arg4++;
                } else {
                    arg5++;
                }
            }
            int var18 = arg3 - arg2;
            int var19 = arg6;
            if (arg5 != arg7) {
                var19 = (arg1 - arg0 << 12) / (arg7 - arg5);
            }
            int var20 = 0;
            if (arg4 != arg7) {
                var20 = (arg9 - arg1 << 12) / (arg4 - arg7);
            }
            int var21 = 0;
            if (arg4 != arg5) {
                var21 = (arg0 - arg9 << 12) / (arg5 - arg4);
            }
            int var22 = var13 * var16 - var14 * var15;
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg5 <= arg7 && arg5 <= arg4) {
                if (class647.field9249 <= arg5) {
                    return true;
                }
                if (arg7 > class647.field9249) {
                    arg7 = class647.field9249;
                }
                if (arg4 > class647.field9249) {
                    arg4 = class647.field9249;
                }
                int var25 = (arg2 << 8) + (var23 - (arg0 * var23));
                if (arg7 >= arg4) {
                    int var26;
                    int var27 = var26 = arg0 << 12;
                    if (arg5 < 0) {
                        var27 -= arg5 * var21;
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        arg5 = 0;
                    }
                    int var28 = arg9 << 12;
                    if (arg4 < 0) {
                        var28 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg4 != arg5 && var19 > var21 || arg4 == arg5 && var20 > var19) {
                        int var29 = arg7 - arg4;
                        int var30 = arg4 - arg5;
                        int var31 = class244.field2887 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var31, var23, 0, (var28 >> 12) - 1, var25, (var26 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var26 += var19;
                                    var25 += var24;
                                    var31 += class244.field2887;
                                }
                            }
                            if (!class737.method4109(var31, var23, 0, (var27 >> 12) - 1, var25, (var26 >> 12) + 1, class707.field9970, arg6 + 3)) {
                                return false;
                            }
                            var31 += class244.field2887;
                            var26 += var19;
                            var27 += var21;
                            var25 += var24;
                        }
                    } else {
                        int var32 = arg7 - arg4;
                        int var33 = arg4 - arg5;
                        int var34 = class244.field2887 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var34, var23, 0, (var26 >> 12) - 1, var25, (var28 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var26 += var19;
                                    var34 += class244.field2887;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class737.method4109(var34, var23, 0, (var26 >> 12) - 1, var25, (var27 >> 12) + 1, class707.field9970, 3)) {
                                return false;
                            }
                            var26 += var19;
                            var34 += class244.field2887;
                            var27 += var21;
                            var25 += var24;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg0 << 12;
                    int var37 = arg1 << 12;
                    if (arg5 < 0) {
                        var25 -= arg5 * var24;
                        var35 -= arg5 * var19;
                        var36 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg7 < 0) {
                        var37 -= arg7 * var20;
                        arg7 = 0;
                    }
                    if (arg5 != arg7 && var21 < var19 || arg5 == arg7 && var21 > var20) {
                        int var38 = arg4 - arg7;
                        int var39 = arg7 - arg5;
                        int var40 = class244.field2887 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var40, var23, 0, (var36 >> 12) - 1, var25, (var37 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var37 += var20;
                                    var40 += class244.field2887;
                                    var36 += var21;
                                }
                            }
                            if (!class737.method4109(var40, var23, 0, (var36 >> 12) - 1, var25, (var35 >> 12) + 1, class707.field9970, 3)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var40 += class244.field2887;
                        }
                    } else {
                        int var41 = arg4 - arg7;
                        int var42 = arg7 - arg5;
                        int var43 = class244.field2887 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var43, var23, 0, (var37 >> 12) - 1, var25, (var36 >> 12) + 1, class707.field9970, arg6 + 3)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var37 += var20;
                                    var43 += class244.field2887;
                                    var25 += var24;
                                }
                            }
                            if (!class737.method4109(var43, var23, 0, (var35 >> 12) - 1, var25, (var36 >> 12) + 1, class707.field9970, arg6 ^ 0x3)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var43 += class244.field2887;
                        }
                    }
                }
            } else if (arg7 <= arg4) {
                if (arg7 >= class647.field9249) {
                    return true;
                }
                if (class647.field9249 < arg4) {
                    arg4 = class647.field9249;
                }
                if (arg5 > class647.field9249) {
                    arg5 = class647.field9249;
                }
                int var44 = (arg8 << 8) + var23 - (arg1 * var23);
                if (arg5 <= arg4) {
                    int var45;
                    int var46 = var45 = arg1 << 12;
                    if (arg7 < 0) {
                        var44 -= arg7 * var24;
                        var45 -= arg7 * var20;
                        var46 -= arg7 * var19;
                        arg7 = 0;
                    }
                    int var47 = arg0 << 12;
                    if (arg5 < 0) {
                        var47 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var20 <= var19) {
                        int var48 = arg4 - arg5;
                        int var49 = arg5 - arg7;
                        int var50 = class244.field2887 * arg7;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var50, var23, 0, (var45 >> 12) - 1, var44, (var47 >> 12) + 1, class707.field9970, arg6 ^ 0x3)) {
                                        return false;
                                    }
                                    var50 += class244.field2887;
                                    var45 += var20;
                                    var44 += var24;
                                    var47 += var21;
                                }
                            }
                            if (!class737.method4109(var50, var23, 0, (var45 >> 12) - 1, var44, (var46 >> 12) + 1, class707.field9970, 3)) {
                                return false;
                            }
                            var50 += class244.field2887;
                            var45 += var20;
                            var46 += var19;
                            var44 += var24;
                        }
                    } else {
                        int var51 = arg4 - arg5;
                        int var52 = arg5 - arg7;
                        int var53 = class244.field2887 * arg7;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var53, var23, 0, (var47 >> 12) - 1, var44, (var45 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var47 += var21;
                                    var45 += var20;
                                    var44 += var24;
                                    var53 += class244.field2887;
                                }
                            }
                            if (!class737.method4109(var53, var23, 0, (var46 >> 12) - 1, var44, (var45 >> 12) + 1, class707.field9970, 3)) {
                                return false;
                            }
                            var45 += var20;
                            var53 += class244.field2887;
                            var46 += var19;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg1 << 12;
                    if (arg7 < 0) {
                        var55 -= arg7 * var19;
                        var54 -= arg7 * var20;
                        var44 -= arg7 * var24;
                        arg7 = 0;
                    }
                    int var56 = arg9 << 12;
                    if (arg4 < 0) {
                        var56 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (arg4 != arg7 && var19 < var20 || arg4 == arg7 && var19 > var21) {
                        int var57 = arg5 - arg4;
                        int var58 = arg4 - arg7;
                        int var59 = class244.field2887 * arg7;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var59, var23, 0, (var55 >> 12) - 1, var44, (var56 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var59 += class244.field2887;
                                    var56 += var21;
                                    var55 += var19;
                                }
                            }
                            if (!class737.method4109(var59, var23, 0, (var55 >> 12) - 1, var44, (var54 >> 12) + 1, class707.field9970, arg6 + 3)) {
                                return false;
                            }
                            var55 += var19;
                            var44 += var24;
                            var59 += class244.field2887;
                            var54 += var20;
                        }
                    } else {
                        int var60 = arg5 - arg4;
                        int var61 = arg4 - arg7;
                        int var62 = class244.field2887 * arg7;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var62, var23, 0, (var56 >> 12) - 1, var44, (var55 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var21;
                                    var62 += class244.field2887;
                                    var55 += var19;
                                }
                            }
                            if (!class737.method4109(var62, var23, 0, (var54 >> 12) - 1, var44, (var55 >> 12) + 1, class707.field9970, arg6 + 3)) {
                                return false;
                            }
                            var55 += var19;
                            var62 += class244.field2887;
                            var54 += var20;
                            var44 += var24;
                        }
                    }
                }
            } else if (arg4 >= class647.field9249) {
                return true;
            } else {
                int var63 = (arg3 << 8) + var23 - (arg9 * var23);
                if (arg5 > class647.field9249) {
                    arg5 = class647.field9249;
                }
                if (arg7 > class647.field9249) {
                    arg7 = class647.field9249;
                }
                if (arg5 >= arg7) {
                    int var64;
                    int var65 = var64 = arg9 << 12;
                    if (arg4 < 0) {
                        var65 -= arg4 * var20;
                        var64 -= arg4 * var21;
                        var63 -= arg4 * var24;
                        arg4 = 0;
                    }
                    int var66 = arg1 << 12;
                    if (arg7 < 0) {
                        var66 -= arg7 * var19;
                        arg7 = 0;
                    }
                    if (var21 <= var20) {
                        int var67 = arg5 - arg7;
                        int var68 = arg7 - arg4;
                        int var69 = class244.field2887 * arg4;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var69, var23, 0, (var64 >> 12) - 1, var63, (var66 >> 12) + 1, class707.field9970, arg6 ^ 0x3)) {
                                        return false;
                                    }
                                    var69 += class244.field2887;
                                    var66 += var19;
                                    var64 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class737.method4109(var69, var23, 0, (var64 >> 12) - 1, var63, (var65 >> 12) + 1, class707.field9970, 3)) {
                                return false;
                            }
                            var64 += var21;
                            var69 += class244.field2887;
                            var63 += var24;
                            var65 += var20;
                        }
                    } else {
                        int var70 = arg5 - arg7;
                        int var71 = arg7 - arg4;
                        int var72 = class244.field2887 * arg4;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var72, var23, 0, (var66 >> 12) - 1, var63, (var64 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var66 += var19;
                                    var63 += var24;
                                    var72 += class244.field2887;
                                    var64 += var21;
                                }
                            }
                            if (!class737.method4109(var72, var23, 0, (var65 >> 12) - 1, var63, (var64 >> 12) + 1, class707.field9970, 3)) {
                                return false;
                            }
                            var64 += var21;
                            var72 += class244.field2887;
                            var63 += var24;
                            var65 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg9 << 12;
                    if (arg4 < 0) {
                        var73 -= arg4 * var21;
                        var63 -= arg4 * var24;
                        var74 -= arg4 * var20;
                        arg4 = 0;
                    }
                    int var75 = arg0 << 12;
                    if (arg5 < 0) {
                        var75 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var21 > var20) {
                        int var76 = arg7 - arg5;
                        int var77 = arg5 - arg4;
                        int var78 = class244.field2887 * arg4;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var78, var23, 0, (var74 >> 12) - 1, var63, (var75 >> 12) + 1, class707.field9970, 3)) {
                                        return false;
                                    }
                                    var78 += class244.field2887;
                                    var74 += var20;
                                    var63 += var24;
                                    var75 += var19;
                                }
                            }
                            if (!class737.method4109(var78, var23, 0, (var74 >> 12) - 1, var63, (var73 >> 12) + 1, class707.field9970, arg6 ^ 0x3)) {
                                return false;
                            }
                            var78 += class244.field2887;
                            var63 += var24;
                            var73 += var21;
                            var74 += var20;
                        }
                    } else {
                        int var79 = arg7 - arg5;
                        int var80 = arg5 - arg4;
                        int var81 = class244.field2887 * arg4;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class737.method4109(var81, var23, 0, (var75 >> 12) - 1, var63, (var74 >> 12) + 1, class707.field9970, arg6 + 3)) {
                                        return false;
                                    }
                                    var75 += var19;
                                    var81 += class244.field2887;
                                    var63 += var24;
                                    var74 += var20;
                                }
                            }
                            if (!class737.method4109(var81, var23, 0, (var73 >> 12) - 1, var63, (var74 >> 12) + 1, class707.field9970, arg6 + 3)) {
                                return false;
                            }
                            var81 += class244.field2887;
                            var73 += var21;
                            var63 += var24;
                            var74 += var20;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }
}
