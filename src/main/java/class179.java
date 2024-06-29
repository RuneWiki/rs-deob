import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class179 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    private int field2500 = 0;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    private int field2502 = 0;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    private int field2514 = 0;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "Lbi;")
    private class483 field2508;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "Llha;")
    private class626 field2513;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "[Lng;")
    private class345[] field2505;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "Luh;")
    public class169 field2511;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "([JB[Ljava/lang/Object;)V", line = 3)
    public static final void method1222(long[] arg0, byte arg1, Object[] arg2) {
        if (arg1 == -15) {
            field2506++;
            class717.method4009(arg2, arg0.length - 1, 0, (byte) -97, arg0);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIIIIIIII)Z", line = 16)
    public static final boolean method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2510++;
        if (arg0 > 2000 || arg3 > 2000 || arg5 > 2000 || arg9 > 2000 || arg2 > 2000 || arg7 > 2000) {
            return false;
        } else if (arg0 >= -2000 && arg3 >= -2000 && arg5 >= -2000 && arg9 >= -2000 && arg2 >= -2000 && arg7 >= -2000) {
            if (class423.field5382 == 2) {
                int var10 = arg9 + (class646.field8938 * arg0);
                if (var10 >= 0 && class416.field5306.length > var10 && class416.field5306[var10] > ((arg6 << 8) - 38400)) {
                    return false;
                }
                int var11 = class646.field8938 * arg3 + arg2;
                if (var11 >= 0 && class416.field5306.length > var11 && ((arg4 << 8) - 38400) < class416.field5306[var11]) {
                    return false;
                }
                int var12 = arg7 + (class646.field8938 * arg5);
                if (var12 >= 0 && var12 < class416.field5306.length && class416.field5306[var12] > (arg1 << 8) - 38400) {
                    return false;
                }
            }
            int var13 = arg2 - arg9;
            int var14 = arg3 - arg0;
            int var15 = arg7 - arg9;
            int var16 = arg5 - arg0;
            int var17 = arg4 - arg6;
            if (arg3 > arg0 && arg5 > arg5) {
                arg0--;
                if (arg5 >= arg3) {
                    arg5++;
                } else {
                    arg3++;
                }
            } else if (arg5 > arg3) {
                if (arg5 < arg0) {
                    arg0++;
                } else {
                    arg5++;
                }
                arg3--;
            } else {
                arg5--;
                if (arg3 >= arg0) {
                    arg3++;
                } else {
                    arg0++;
                }
            }
            int var18 = arg1 - arg6;
            int var19 = 0;
            if (arg0 != arg3) {
                var19 = (arg2 - arg9 << 12) / (arg3 - arg0);
            }
            int var20 = 0;
            if (arg3 != arg5) {
                var20 = (arg7 - arg2 << 12) / (arg5 - arg3);
            }
            if (arg8 > -37) {
                return false;
            }
            int var21 = 0;
            if (arg0 != arg5) {
                var21 = (arg9 - arg7 << 12) / (arg0 - arg5);
            }
            int var22 = var13 * var16 - var14 * var15;
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg3 >= arg0 && arg0 <= arg5) {
                if (arg0 >= class711.field9865) {
                    return true;
                }
                if (arg3 > class711.field9865) {
                    arg3 = class711.field9865;
                }
                int var25 = (arg6 << 8) + var23 - (arg9 * var23);
                if (arg5 > class711.field9865) {
                    arg5 = class711.field9865;
                }
                if (arg3 >= arg5) {
                    int var26;
                    int var27 = var26 = arg9 << 12;
                    if (arg0 < 0) {
                        var27 -= arg0 * var21;
                        var25 -= arg0 * var24;
                        var26 -= arg0 * var19;
                        arg0 = 0;
                    }
                    int var28 = arg7 << 12;
                    if (arg5 < 0) {
                        var28 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (arg0 != arg5 && var19 > var21 || arg0 == arg5 && var20 > var19) {
                        int var29 = arg3 - arg5;
                        int var30 = arg5 - arg0;
                        int var31 = class646.field8938 * arg0;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var31, var25, 0, var23, (var26 >> 12) + 1, (var28 >> 12) - 1)) {
                                        return false;
                                    }
                                    var31 += class646.field8938;
                                    var26 += var19;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var31, var25, 0, var23, (var26 >> 12) + 1, (var27 >> 12) + -1)) {
                                return false;
                            }
                            var27 += var21;
                            var31 += class646.field8938;
                            var25 += var24;
                            var26 += var19;
                        }
                    } else {
                        int var32 = arg3 - arg5;
                        int var33 = arg5 - arg0;
                        int var34 = class646.field8938 * arg0;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var34, var25, 0, var23, (var28 >> 12) + 1, (var26 >> 12) - 1)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var34 += class646.field8938;
                                    var28 += var20;
                                    var26 += var19;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var34, var25, 0, var23, (var27 >> 12) + 1, (var26 >> 12) + -1)) {
                                return false;
                            }
                            var27 += var21;
                            var25 += var24;
                            var26 += var19;
                            var34 += class646.field8938;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg9 << 12;
                    if (arg0 < 0) {
                        var25 -= arg0 * var24;
                        var35 -= arg0 * var19;
                        var36 -= arg0 * var21;
                        arg0 = 0;
                    }
                    int var37 = arg2 << 12;
                    if (arg3 < 0) {
                        var37 -= arg3 * var20;
                        arg3 = 0;
                    }
                    if ((arg0 == arg3 || var21 >= var19) && (arg0 != arg3 || var21 <= var20)) {
                        int var41 = arg5 - arg3;
                        int var42 = arg3 - arg0;
                        int var43 = class646.field8938 * arg0;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var43, var25, 0, var23, (var36 >> 12) + 1, (var37 >> 12) + -1)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var37 += var20;
                                    var43 += class646.field8938;
                                    var36 += var21;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var43, var25, 0, var23, (var36 >> 12) + 1, (var35 >> 12) - 1)) {
                                return false;
                            }
                            var36 += var21;
                            var43 += class646.field8938;
                            var25 += var24;
                            var35 += var19;
                        }
                    } else {
                        int var38 = arg5 - arg3;
                        int var39 = arg3 - arg0;
                        int var40 = class646.field8938 * arg0;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var40, var25, 0, var23, (var37 >> 12) + 1, (var36 >> 12) + -1)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var40 += class646.field8938;
                                    var25 += var24;
                                    var36 += var21;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var40, var25, 0, var23, (var35 >> 12) + 1, (var36 >> 12) + -1)) {
                                return false;
                            }
                            var36 += var21;
                            var40 += class646.field8938;
                            var35 += var19;
                            var25 += var24;
                        }
                    }
                }
            } else if (arg3 <= arg5) {
                if (arg3 >= class711.field9865) {
                    return true;
                }
                if (class711.field9865 < arg5) {
                    arg5 = class711.field9865;
                }
                if (arg0 > class711.field9865) {
                    arg0 = class711.field9865;
                }
                int var44 = (arg4 << 8) + var23 - arg2 * var23;
                if (arg0 <= arg5) {
                    int var45;
                    int var46 = var45 = arg2 << 12;
                    if (arg3 < 0) {
                        var46 -= arg3 * var19;
                        var44 -= arg3 * var24;
                        var45 -= arg3 * var20;
                        arg3 = 0;
                    }
                    int var47 = arg9 << 12;
                    if (arg0 < 0) {
                        var47 -= arg0 * var21;
                        arg0 = 0;
                    }
                    if (var19 < var20) {
                        int var48 = arg5 - arg0;
                        int var49 = arg0 - arg3;
                        int var50 = class646.field8938 * arg3;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var50, var44, 0, var23, (var45 >> 12) + 1, (var47 >> 12) - 1)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var47 += var21;
                                    var45 += var20;
                                    var50 += class646.field8938;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var50, var44, 0, var23, (var45 >> 12) + 1, (var46 >> 12) + -1)) {
                                return false;
                            }
                            var45 += var20;
                            var44 += var24;
                            var46 += var19;
                            var50 += class646.field8938;
                        }
                    } else {
                        int var51 = arg5 - arg0;
                        int var52 = arg0 - arg3;
                        int var53 = class646.field8938 * arg3;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var53, var44, 0, var23, (var47 >> 12) + 1, (var45 >> 12) + -1)) {
                                        return false;
                                    }
                                    var45 += var20;
                                    var53 += class646.field8938;
                                    var44 += var24;
                                    var47 += var21;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var53, var44, 0, var23, (var46 >> 12) + 1, (var45 >> 12) - 1)) {
                                return false;
                            }
                            var44 += var24;
                            var45 += var20;
                            var53 += class646.field8938;
                            var46 += var19;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg2 << 12;
                    int var56 = arg7 << 12;
                    if (arg3 < 0) {
                        var55 -= arg3 * var19;
                        var44 -= arg3 * var24;
                        var54 -= arg3 * var20;
                        arg3 = 0;
                    }
                    if (arg5 < 0) {
                        var56 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg3 != arg5 && var19 < var20 || arg3 == arg5 && var19 > var21) {
                        int var57 = arg0 - arg5;
                        int var58 = arg5 - arg3;
                        int var59 = class646.field8938 * arg3;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var59, var44, 0, var23, (var56 >> 12) + 1, (var55 >> 12) + -1)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var21;
                                    var55 += var19;
                                    var59 += class646.field8938;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var59, var44, 0, var23, (var54 >> 12) + 1, (var55 >> 12) + -1)) {
                                return false;
                            }
                            var44 += var24;
                            var59 += class646.field8938;
                            var55 += var19;
                            var54 += var20;
                        }
                    } else {
                        int var60 = arg0 - arg5;
                        int var61 = arg5 - arg3;
                        int var62 = class646.field8938 * arg3;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var62, var44, 0, var23, (var55 >> 12) + 1, (var56 >> 12) + -1)) {
                                        return false;
                                    }
                                    var62 += class646.field8938;
                                    var55 += var19;
                                    var56 += var21;
                                    var44 += var24;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var62, var44, 0, var23, (var55 >> 12) + 1, (var54 >> 12) + -1)) {
                                return false;
                            }
                            var62 += class646.field8938;
                            var44 += var24;
                            var55 += var19;
                            var54 += var20;
                        }
                    }
                }
            } else if (arg5 >= class711.field9865) {
                return true;
            } else {
                if (arg0 > class711.field9865) {
                    arg0 = class711.field9865;
                }
                int var63 = (arg1 << 8) + var23 - arg7 * var23;
                if (arg3 > class711.field9865) {
                    arg3 = class711.field9865;
                }
                if (arg0 >= arg3) {
                    int var64;
                    int var65 = var64 = arg7 << 12;
                    if (arg5 < 0) {
                        var63 -= arg5 * var24;
                        var64 -= arg5 * var21;
                        var65 -= arg5 * var20;
                        arg5 = 0;
                    }
                    int var66 = arg2 << 12;
                    if (arg3 < 0) {
                        var66 -= arg3 * var19;
                        arg3 = 0;
                    }
                    if (var20 >= var21) {
                        int var67 = arg0 - arg3;
                        int var68 = arg3 - arg5;
                        int var69 = class646.field8938 * arg5;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var69, var63, 0, var23, (var66 >> 12) + 1, (var64 >> 12) - 1)) {
                                        return false;
                                    }
                                    var66 += var19;
                                    var69 += class646.field8938;
                                    var64 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var69, var63, 0, var23, (var65 >> 12) + 1, (var64 >> 12) + -1)) {
                                return false;
                            }
                            var69 += class646.field8938;
                            var63 += var24;
                            var65 += var20;
                            var64 += var21;
                        }
                    } else {
                        int var70 = arg0 - arg3;
                        int var71 = arg3 - arg5;
                        int var72 = class646.field8938 * arg5;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var72, var63, 0, var23, (var64 >> 12) + 1, (var66 >> 12) - 1)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var72 += class646.field8938;
                                    var64 += var21;
                                    var66 += var19;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var72, var63, 0, var23, (var64 >> 12) + 1, (var65 >> 12) - 1)) {
                                return false;
                            }
                            var64 += var21;
                            var72 += class646.field8938;
                            var65 += var20;
                            var63 += var24;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg7 << 12;
                    int var75 = arg9 << 12;
                    if (arg5 < 0) {
                        var73 -= arg5 * var21;
                        var63 -= arg5 * var24;
                        var74 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (arg0 < 0) {
                        var75 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var21 <= var20) {
                        int var76 = arg3 - arg0;
                        int var77 = arg0 - arg5;
                        int var78 = class646.field8938 * arg5;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var78, var63, 0, var23, (var74 >> 12) + 1, (var75 >> 12) - 1)) {
                                        return false;
                                    }
                                    var78 += class646.field8938;
                                    var74 += var20;
                                    var75 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var78, var63, 0, var23, (var74 >> 12) + 1, (var73 >> 12) + -1)) {
                                return false;
                            }
                            var63 += var24;
                            var78 += class646.field8938;
                            var74 += var20;
                            var73 += var21;
                        }
                    } else {
                        int var79 = arg3 - arg0;
                        int var80 = arg0 - arg5;
                        int var81 = class646.field8938 * arg5;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class756.method4201(class416.field5306, false, var81, var63, 0, var23, (var75 >> 12) + 1, (var74 >> 12) + -1)) {
                                        return false;
                                    }
                                    var74 += var20;
                                    var81 += class646.field8938;
                                    var63 += var24;
                                    var75 += var19;
                                }
                            }
                            if (!class756.method4201(class416.field5306, false, var81, var63, 0, var23, (var73 >> 12) + 1, (var74 >> 12) + -1)) {
                                return false;
                            }
                            var74 += var20;
                            var73 += var21;
                            var81 += class646.field8938;
                            var63 += var24;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lbi;)V", line = 804)
    public class179(class483 arg0) {
        this.field2508 = arg0;
        this.field2513 = new class626(arg0);
        this.field2505 = new class345[10];
        this.field2505[1] = new class582(arg0);
        this.field2505[2] = new class423(arg0, this.field2513);
        this.field2505[4] = new class43(arg0, this.field2513);
        this.field2505[5] = new class659(arg0, this.field2513);
        this.field2505[6] = new class478(arg0);
        this.field2505[7] = new class726(arg0);
        this.field2505[3] = this.field2511 = new class169(arg0);
        this.field2505[8] = new class758(arg0, this.field2513);
        this.field2505[9] = new class7(arg0, this.field2513);
        if (!this.field2505[8].method38(50560)) {
            this.field2505[8] = this.field2505[4];
        }
        if (!this.field2505[9].method38(50560)) {
            this.field2505[9] = this.field2505[8];
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZIBZI)V", line = 663)
    public final void method1224(int arg0, boolean arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        boolean var7 = arg1 & this.field2508.method482();
        field2504++;
        if (arg3 != 41) {
            this.field2511 = null;
        }
        if (!var7 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
            if (arg0 == 4) {
                arg5 = arg2;
            }
            arg0 = 2;
        }
        if (arg0 != 0 && arg4) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field2500 != arg0) {
            if (this.field2500 != 0) {
                this.field2505[Integer.MAX_VALUE & this.field2500].method41((byte) -3);
            }
            if (arg0 != 0) {
                this.field2505[arg0 & Integer.MAX_VALUE].method34(arg4, (byte) -82);
                this.field2505[arg0 & Integer.MAX_VALUE].method40(arg4, 50560);
                this.field2505[arg0 & Integer.MAX_VALUE].method37(true, arg5, arg2);
            }
            this.field2500 = arg0;
            this.field2514 = arg5;
            this.field2502 = arg2;
        } else if (this.field2500 != 0) {
            this.field2505[this.field2500 & Integer.MAX_VALUE].method40(arg4, arg3 + 50519);
            if (this.field2502 != arg2 || this.field2514 != arg5) {
                this.field2505[Integer.MAX_VALUE & this.field2500].method37(true, arg5, arg2);
                this.field2514 = arg5;
                this.field2502 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLcj;I)Z", line = 718)
    public final boolean method1225(byte arg0, class695 arg1, int arg2) {
        field2509++;
        if (arg0 < 23) {
            this.field2514 = -88;
        }
        if (this.field2500 == 0) {
            return false;
        } else {
            this.field2505[this.field2500 & Integer.MAX_VALUE].method36(50560, arg2, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)Z", line = 734)
    public final boolean method1226(int arg0, int arg1) {
        field2507++;
        return arg1 == 0 ? this.field2505[arg0].method38(50560) : false;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 747)
    public static final void method1227(int arg0) {
        field2512++;
        int var1 = 0;
        if (arg0 != -1) {
            method1222(null, (byte) -32, null);
        }
        if (class748.field10451 != null) {
            var1 = class748.field10451.field10425.method4035((byte) 53);
        }
        if (var1 == 2) {
            int var4 = class754.field10526 > 800 ? 800 : class754.field10526;
            class489.field6951 = (class754.field10526 - var4) / 2;
            int var5 = class317.field4108 <= 600 ? class317.field4108 : 600;
            class356.field4586 = var4;
            class466.field6263 = var5;
            class288.field3772 = 0;
        } else if (var1 == 1) {
            int var2 = class754.field10526 > 1024 ? 1024 : class754.field10526;
            class356.field4586 = var2;
            int var3 = class317.field4108 <= 768 ? class317.field4108 : 768;
            class489.field6951 = (class754.field10526 - var2) / 2;
            class466.field6263 = var3;
            class288.field3772 = 0;
        } else {
            class489.field6951 = 0;
            class356.field4586 = class754.field10526;
            class466.field6263 = class317.field4108;
            class288.field3772 = 0;
        }
    }
}
