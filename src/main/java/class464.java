import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class464 extends class214 {

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public int field6619 = (int) (class109.method731(118) / 1000L);

    @OriginalMember(owner = "client!os", name = "t", descriptor = "S")
    public short field6618;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "Ljava/lang/String;")
    public String field6620;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "[Lva;")
    public static class520[] field6621 = new class520[14];

    @OriginalMember(owner = "client!os", name = "A", descriptor = "[I")
    public static int[] field6625 = new int[500];

    @OriginalMember(owner = "client!os", name = "y", descriptor = "F")
    public static float field6623;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBIIIIIIII)Z")
    public static final boolean method2751(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6622++;
        if (arg2 > 2000 || arg0 > 2000 || arg4 > 2000 || arg6 > 2000 || arg3 > 2000 || arg8 > 2000) {
            return false;
        } else if (arg1 > -93) {
            return false;
        } else if (arg2 >= -2000 && arg0 >= -2000 && arg4 >= -2000 && arg6 >= -2000 && arg3 >= -2000 && arg8 >= -2000) {
            if (class572.field8104 == 2) {
                int var10 = class286.field4384 * arg2 + arg6;
                if (var10 >= 0 && var10 < class12.field248.length && class12.field248[var10] > ((arg7 << 8) - 38400)) {
                    return false;
                }
                int var11 = class286.field4384 * arg0 + arg3;
                if (var11 >= 0 && var11 < class12.field248.length && class12.field248[var11] > ((arg5 << 8) - 38400)) {
                    return false;
                }
                int var12 = class286.field4384 * arg4 + arg8;
                if (var12 >= 0 && var12 < class12.field248.length && class12.field248[var12] > ((arg9 << 8) - 38400)) {
                    return false;
                }
            }
            int var13 = arg3 - arg6;
            int var14 = arg0 - arg2;
            int var15 = arg8 - arg6;
            int var16 = arg4 - arg2;
            int var17 = arg5 - arg7;
            int var18 = arg9 - arg7;
            if (arg0 > arg2 && arg4 > arg4) {
                arg2--;
                if (arg4 < arg0) {
                    arg0++;
                } else {
                    arg4++;
                }
            } else if (arg0 >= arg4) {
                arg4--;
                if (arg2 <= arg0) {
                    arg0++;
                } else {
                    arg2++;
                }
            } else {
                arg0--;
                if (arg2 <= arg4) {
                    arg4++;
                } else {
                    arg2++;
                }
            }
            int var19 = 0;
            if (arg0 != arg2) {
                var19 = (arg3 - arg6 << 12) / (arg0 - arg2);
            }
            int var20 = 0;
            if (arg0 != arg4) {
                var20 = (arg8 - arg3 << 12) / (arg4 - arg0);
            }
            int var21 = 0;
            if (arg2 != arg4) {
                var21 = (arg6 - arg8 << 12) / (arg2 - arg4);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg0 >= arg2 && arg2 <= arg4) {
                if (arg2 >= class718.field10099) {
                    return true;
                }
                if (arg0 > class718.field10099) {
                    arg0 = class718.field10099;
                }
                if (arg4 > class718.field10099) {
                    arg4 = class718.field10099;
                }
                int var25 = (arg7 << 8) + var23 - (arg6 * var23);
                if (arg4 <= arg0) {
                    int var26;
                    int var27 = var26 = arg6 << 12;
                    int var28 = arg8 << 12;
                    if (arg2 < 0) {
                        var27 -= arg2 * var21;
                        var25 -= arg2 * var24;
                        var26 -= arg2 * var19;
                        arg2 = 0;
                    }
                    if (arg4 < 0) {
                        var28 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg2 != arg4 && var19 > var21 || arg2 == arg4 && var19 < var20) {
                        int var29 = arg0 - arg4;
                        int var30 = arg4 - arg2;
                        int var31 = class286.field4384 * arg2;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var31, (var26 >> 12) + 1, var25, class12.field248, var23, 0, (var28 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var31 += class286.field4384;
                                    var26 += var19;
                                }
                            }
                            if (!class367.method2281(var31, (var26 >> 12) + 1, var25, class12.field248, var23, 0, (var27 >> 12) - 1, true)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var27 += var21;
                            var31 += class286.field4384;
                        }
                    } else {
                        int var32 = arg0 - arg4;
                        int var33 = arg4 - arg2;
                        int var34 = class286.field4384 * arg2;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var34, (var28 >> 12) + 1, var25, class12.field248, var23, 0, (var26 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var34 += class286.field4384;
                                    var26 += var19;
                                    var25 += var24;
                                }
                            }
                            if (!class367.method2281(var34, (var27 >> 12) + 1, var25, class12.field248, var23, 0, (var26 >> 12) - 1, true)) {
                                return false;
                            }
                            var27 += var21;
                            var34 += class286.field4384;
                            var25 += var24;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg6 << 12;
                    if (arg2 < 0) {
                        var36 -= arg2 * var21;
                        var35 -= arg2 * var19;
                        var25 -= arg2 * var24;
                        arg2 = 0;
                    }
                    int var37 = arg3 << 12;
                    if (arg0 < 0) {
                        var37 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg0 != arg2 && var19 > var21 || arg0 == arg2 && var20 < var21) {
                        int var38 = arg4 - arg0;
                        int var39 = arg0 - arg2;
                        int var40 = class286.field4384 * arg2;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var40, (var37 >> 12) + 1, var25, class12.field248, var23, 0, (var36 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var40 += class286.field4384;
                                    var25 += var24;
                                    var36 += var21;
                                    var37 += var20;
                                }
                            }
                            if (!class367.method2281(var40, (var35 >> 12) + 1, var25, class12.field248, var23, 0, (var36 >> 12) - 1, true)) {
                                return false;
                            }
                            var35 += var19;
                            var25 += var24;
                            var40 += class286.field4384;
                            var36 += var21;
                        }
                    } else {
                        int var41 = arg4 - arg0;
                        int var42 = arg0 - arg2;
                        int var43 = class286.field4384 * arg2;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var43, (var36 >> 12) + 1, var25, class12.field248, var23, 0, (var37 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var37 += var20;
                                    var43 += class286.field4384;
                                    var36 += var21;
                                }
                            }
                            if (!class367.method2281(var43, (var36 >> 12) + 1, var25, class12.field248, var23, 0, (var35 >> 12) - 1, true)) {
                                return false;
                            }
                            var35 += var19;
                            var36 += var21;
                            var43 += class286.field4384;
                            var25 += var24;
                        }
                    }
                }
            } else if (arg0 <= arg4) {
                if (arg0 >= class718.field10099) {
                    return true;
                }
                int var44 = (arg5 << 8) + var23 - (arg3 * var23);
                if (arg4 > class718.field10099) {
                    arg4 = class718.field10099;
                }
                if (class718.field10099 < arg2) {
                    arg2 = class718.field10099;
                }
                if (arg2 <= arg4) {
                    int var45;
                    int var46 = var45 = arg3 << 12;
                    int var47 = arg6 << 12;
                    if (arg0 < 0) {
                        var44 -= arg0 * var24;
                        var45 -= arg0 * var20;
                        var46 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (arg2 < 0) {
                        var47 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if (var20 <= var19) {
                        int var48 = arg4 - arg2;
                        int var49 = arg2 - arg0;
                        int var50 = class286.field4384 * arg0;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var50, (var47 >> 12) + 1, var44, class12.field248, var23, 0, (var45 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var45 += var20;
                                    var50 += class286.field4384;
                                    var47 += var21;
                                }
                            }
                            if (!class367.method2281(var50, (var46 >> 12) + 1, var44, class12.field248, var23, 0, (var45 >> 12) - 1, true)) {
                                return false;
                            }
                            var44 += var24;
                            var50 += class286.field4384;
                            var46 += var19;
                            var45 += var20;
                        }
                    } else {
                        int var51 = arg4 - arg2;
                        int var52 = arg2 - arg0;
                        int var53 = class286.field4384 * arg0;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var53, (var45 >> 12) + 1, var44, class12.field248, var23, 0, (var47 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var47 += var21;
                                    var45 += var20;
                                    var44 += var24;
                                    var53 += class286.field4384;
                                }
                            }
                            if (!class367.method2281(var53, (var45 >> 12) + 1, var44, class12.field248, var23, 0, (var46 >> 12) - 1, true)) {
                                return false;
                            }
                            var53 += class286.field4384;
                            var44 += var24;
                            var45 += var20;
                            var46 += var19;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg3 << 12;
                    int var56 = arg8 << 12;
                    if (arg0 < 0) {
                        var54 -= arg0 * var20;
                        var55 -= arg0 * var19;
                        var44 -= arg0 * var24;
                        arg0 = 0;
                    }
                    if (arg4 < 0) {
                        var56 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (arg0 != arg4 && var19 < var20 || arg0 == arg4 && var19 > var21) {
                        int var57 = arg2 - arg4;
                        int var58 = arg4 - arg0;
                        int var59 = class286.field4384 * arg0;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var59, (var56 >> 12) + 1, var44, class12.field248, var23, 0, (var55 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var59 += class286.field4384;
                                    var44 += var24;
                                    var56 += var21;
                                    var55 += var19;
                                }
                            }
                            if (!class367.method2281(var59, (var54 >> 12) + 1, var44, class12.field248, var23, 0, (var55 >> 12) - 1, true)) {
                                return false;
                            }
                            var55 += var19;
                            var59 += class286.field4384;
                            var44 += var24;
                            var54 += var20;
                        }
                    } else {
                        int var60 = arg2 - arg4;
                        int var61 = arg4 - arg0;
                        int var62 = class286.field4384 * arg0;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var62, (var55 >> 12) + 1, var44, class12.field248, var23, 0, (var56 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var55 += var19;
                                    var44 += var24;
                                    var62 += class286.field4384;
                                    var56 += var21;
                                }
                            }
                            if (!class367.method2281(var62, (var55 >> 12) + 1, var44, class12.field248, var23, 0, (var54 >> 12) - 1, true)) {
                                return false;
                            }
                            var54 += var20;
                            var55 += var19;
                            var62 += class286.field4384;
                            var44 += var24;
                        }
                    }
                }
            } else if (class718.field10099 <= arg4) {
                return true;
            } else {
                int var63 = (arg9 << 8) + var23 - (arg8 * var23);
                if (class718.field10099 < arg0) {
                    arg0 = class718.field10099;
                }
                if (arg2 > class718.field10099) {
                    arg2 = class718.field10099;
                }
                if (arg2 < arg0) {
                    int var64;
                    int var65 = var64 = arg8 << 12;
                    if (arg4 < 0) {
                        var63 -= arg4 * var24;
                        var65 -= arg4 * var20;
                        var64 -= arg4 * var21;
                        arg4 = 0;
                    }
                    int var66 = arg6 << 12;
                    if (arg2 < 0) {
                        var66 -= arg2 * var19;
                        arg2 = 0;
                    }
                    if (var21 <= var20) {
                        int var67 = arg0 - arg2;
                        int var68 = arg2 - arg4;
                        int var69 = class286.field4384 * arg4;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var69, (var65 >> 12) + 1, var63, class12.field248, var23, 0, (var66 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var65 += var20;
                                    var66 += var19;
                                    var69 += class286.field4384;
                                    var63 += var24;
                                }
                            }
                            if (!class367.method2281(var69, (var65 >> 12) + 1, var63, class12.field248, var23, 0, (var64 >> 12) - 1, true)) {
                                return false;
                            }
                            var69 += class286.field4384;
                            var65 += var20;
                            var64 += var21;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg0 - arg2;
                        int var71 = arg2 - arg4;
                        int var72 = class286.field4384 * arg4;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var72, (var66 >> 12) + 1, var63, class12.field248, var23, 0, (var65 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var66 += var19;
                                    var63 += var24;
                                    var65 += var20;
                                    var72 += class286.field4384;
                                }
                            }
                            if (!class367.method2281(var72, (var64 >> 12) + 1, var63, class12.field248, var23, 0, (var65 >> 12) - 1, true)) {
                                return false;
                            }
                            var65 += var20;
                            var72 += class286.field4384;
                            var63 += var24;
                            var64 += var21;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg8 << 12;
                    if (arg4 < 0) {
                        var73 -= arg4 * var21;
                        var63 -= arg4 * var24;
                        var74 -= arg4 * var20;
                        arg4 = 0;
                    }
                    int var75 = arg3 << 12;
                    if (arg0 < 0) {
                        var75 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var21 <= var20) {
                        int var76 = arg2 - arg0;
                        int var77 = arg0 - arg4;
                        int var78 = class286.field4384 * arg4;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var78, (var75 >> 12) + 1, var63, class12.field248, var23, 0, (var73 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var78 += class286.field4384;
                                    var75 += var19;
                                    var73 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class367.method2281(var78, (var74 >> 12) + 1, var63, class12.field248, var23, 0, (var73 >> 12) - 1, true)) {
                                return false;
                            }
                            var78 += class286.field4384;
                            var74 += var20;
                            var73 += var21;
                            var63 += var24;
                        }
                    } else {
                        int var79 = arg2 - arg0;
                        int var80 = arg0 - arg4;
                        int var81 = class286.field4384 * arg4;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class367.method2281(var81, (var73 >> 12) + 1, var63, class12.field248, var23, 0, (var75 >> 12) - 1, true)) {
                                        return false;
                                    }
                                    var73 += var21;
                                    var81 += class286.field4384;
                                    var63 += var24;
                                    var75 += var19;
                                }
                            }
                            if (!class367.method2281(var81, (var73 >> 12) + 1, var63, class12.field248, var23, 0, (var74 >> 12) - 1, true)) {
                                return false;
                            }
                            var81 += class286.field4384;
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

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class464(String arg0, int arg1) {
        this.field6618 = (short) arg1;
        this.field6620 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
    public static void method2752(byte arg0) {
        field6625 = null;
        field6621 = null;
        if (arg0 != 49) {
            method2752((byte) -37);
        }
    }
}
