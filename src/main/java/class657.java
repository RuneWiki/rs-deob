import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class657 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[I")
    public static int[] field9204 = new int[4096];

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lmia;")
    public static class63 field9202 = new class63(68, 3);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIIIIIIII)Z")
    public static final boolean method3795(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9203++;
        if (arg5 > 2000 || arg2 > 2000 || arg7 > 2000 || arg3 > 2000 || arg0 > 2000 || arg6 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg2 >= -2000 && arg7 >= -2000 && arg3 >= -2000 && arg0 >= -2000 && arg6 >= -2000) {
            if (class505.field7182 == 2) {
                int var10 = class270.field3864 * arg5 + arg3;
                if (var10 >= 0 && class255.field3667.length > var10 && class255.field3667[var10] > (arg4 << 8) - 38400) {
                    return false;
                }
                int var11 = class270.field3864 * arg2 + arg0;
                if (var11 >= 0 && var11 < class255.field3667.length && ((arg8 << 8) - 38400) < class255.field3667[var11]) {
                    return false;
                }
                int var12 = class270.field3864 * arg7 + arg6;
                if (var12 >= 0 && var12 < class255.field3667.length && ((arg9 << 8) - 38400) < class255.field3667[var12]) {
                    return false;
                }
            }
            int var13 = -56 % ((-arg1 - 6) / 36);
            int var14 = arg0 - arg3;
            int var15 = arg2 - arg5;
            int var16 = arg6 - arg3;
            int var17 = arg7 - arg5;
            int var18 = arg8 - arg4;
            int var19 = arg9 - arg4;
            if (arg5 < arg2 && arg7 < arg7) {
                arg5--;
                if (arg7 >= arg2) {
                    arg7++;
                } else {
                    arg2++;
                }
            } else if (arg7 > arg2) {
                arg2--;
                if (arg7 >= arg5) {
                    arg7++;
                } else {
                    arg5++;
                }
            } else {
                if (arg5 <= arg2) {
                    arg2++;
                } else {
                    arg5++;
                }
                arg7--;
            }
            int var20 = 0;
            if (arg2 != arg5) {
                var20 = (arg0 - arg3 << 12) / (arg2 - arg5);
            }
            int var21 = 0;
            if (arg2 != arg7) {
                var21 = (arg6 - arg0 << 12) / (arg7 - arg2);
            }
            int var22 = 0;
            if (arg5 != arg7) {
                var22 = (arg3 - arg6 << 12) / (arg5 - arg7);
            }
            int var23 = var14 * var17 - (var15 * var16);
            if (var23 == 0) {
                return false;
            }
            int var24 = (var17 * var18 - (var15 * var19) << 8) / var23;
            int var25 = (var14 * var19 - (var16 * var18) << 8) / var23;
            if (arg2 >= arg5 && arg7 >= arg5) {
                if (class394.field5922 <= arg5) {
                    return true;
                }
                if (class394.field5922 < arg7) {
                    arg7 = class394.field5922;
                }
                int var26 = (arg4 << 8) - (arg3 * var24 - var24);
                if (class394.field5922 < arg2) {
                    arg2 = class394.field5922;
                }
                if (arg7 <= arg2) {
                    int var27;
                    int var28 = var27 = arg3 << 12;
                    int var29 = arg6 << 12;
                    if (arg5 < 0) {
                        var27 -= arg5 * var20;
                        var26 -= arg5 * var25;
                        var28 -= arg5 * var22;
                        arg5 = 0;
                    }
                    if (arg7 < 0) {
                        var29 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg5 != arg7 && var20 > var22 || arg5 == arg7 && var21 > var20) {
                        int var30 = arg2 - arg7;
                        int var31 = arg7 - arg5;
                        int var32 = class270.field3864 * arg5;
                        while (true) {
                            var31--;
                            if (var31 < 0) {
                                while (true) {
                                    var30--;
                                    if (var30 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var29 >> 12) - 1, var32, class255.field3667, var26, var24, (var27 >> 12) + 1, 110)) {
                                        return false;
                                    }
                                    var29 += var21;
                                    var27 += var20;
                                    var26 += var25;
                                    var32 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var28 >> 12) - 1, var32, class255.field3667, var26, var24, (var27 >> 12) + 1, 116)) {
                                return false;
                            }
                            var26 += var25;
                            var28 += var22;
                            var32 += class270.field3864;
                            var27 += var20;
                        }
                    } else {
                        int var33 = arg2 - arg7;
                        int var34 = arg7 - arg5;
                        int var35 = class270.field3864 * arg5;
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var27 >> 12) - 1, var35, class255.field3667, var26, var24, (var29 >> 12) + 1, 61)) {
                                        return false;
                                    }
                                    var29 += var21;
                                    var26 += var25;
                                    var27 += var20;
                                    var35 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var27 >> 12) - 1, var35, class255.field3667, var26, var24, (var28 >> 12) + 1, 108)) {
                                return false;
                            }
                            var35 += class270.field3864;
                            var27 += var20;
                            var26 += var25;
                            var28 += var22;
                        }
                    }
                } else {
                    int var36;
                    int var37 = var36 = arg3 << 12;
                    if (arg5 < 0) {
                        var36 -= arg5 * var20;
                        var26 -= arg5 * var25;
                        var37 -= arg5 * var22;
                        arg5 = 0;
                    }
                    int var38 = arg0 << 12;
                    if (arg2 < 0) {
                        var38 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if ((arg2 == arg5 || var20 <= var22) && (arg2 != arg5 || var21 >= var22)) {
                        int var42 = arg7 - arg2;
                        int var43 = arg2 - arg5;
                        int var44 = class270.field3864 * arg5;
                        while (true) {
                            var43--;
                            if (var43 < 0) {
                                while (true) {
                                    var42--;
                                    if (var42 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var38 >> 12) - 1, var44, class255.field3667, var26, var24, (var37 >> 12) + 1, 122)) {
                                        return false;
                                    }
                                    var38 += var21;
                                    var26 += var25;
                                    var37 += var22;
                                    var44 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var36 >> 12) - 1, var44, class255.field3667, var26, var24, (var37 >> 12) + 1, 49)) {
                                return false;
                            }
                            var44 += class270.field3864;
                            var36 += var20;
                            var37 += var22;
                            var26 += var25;
                        }
                    } else {
                        int var39 = arg7 - arg2;
                        int var40 = arg2 - arg5;
                        int var41 = class270.field3864 * arg5;
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var37 >> 12) - 1, var41, class255.field3667, var26, var24, (var38 >> 12) + 1, 35)) {
                                        return false;
                                    }
                                    var26 += var25;
                                    var41 += class270.field3864;
                                    var38 += var21;
                                    var37 += var22;
                                }
                            }
                            if (!class515.method3041(0, (var37 >> 12) - 1, var41, class255.field3667, var26, var24, (var36 >> 12) + 1, 24)) {
                                return false;
                            }
                            var36 += var20;
                            var26 += var25;
                            var41 += class270.field3864;
                            var37 += var22;
                        }
                    }
                }
            } else if (arg7 < arg2) {
                if (class394.field5922 <= arg7) {
                    return true;
                }
                if (arg5 > class394.field5922) {
                    arg5 = class394.field5922;
                }
                int var45 = (arg9 << 8) - (arg6 * var24 - var24);
                if (class394.field5922 < arg2) {
                    arg2 = class394.field5922;
                }
                if (arg2 <= arg5) {
                    int var46;
                    int var47 = var46 = arg6 << 12;
                    if (arg7 < 0) {
                        var47 -= arg7 * var21;
                        var46 -= arg7 * var22;
                        var45 -= arg7 * var25;
                        arg7 = 0;
                    }
                    int var48 = arg0 << 12;
                    if (arg2 < 0) {
                        var48 -= arg2 * var20;
                        arg2 = 0;
                    }
                    if (var22 <= var21) {
                        int var49 = arg5 - arg2;
                        int var50 = arg2 - arg7;
                        int var51 = class270.field3864 * arg7;
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                while (true) {
                                    var49--;
                                    if (var49 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var46 >> 12) - 1, var51, class255.field3667, var45, var24, (var48 >> 12) + 1, 37)) {
                                        return false;
                                    }
                                    var45 += var25;
                                    var46 += var22;
                                    var48 += var20;
                                    var51 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var46 >> 12) - 1, var51, class255.field3667, var45, var24, (var47 >> 12) + 1, 30)) {
                                return false;
                            }
                            var45 += var25;
                            var51 += class270.field3864;
                            var46 += var22;
                            var47 += var21;
                        }
                    } else {
                        int var52 = arg5 - arg2;
                        int var53 = arg2 - arg7;
                        int var54 = class270.field3864 * arg7;
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                while (true) {
                                    var52--;
                                    if (var52 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var48 >> 12) - 1, var54, class255.field3667, var45, var24, (var46 >> 12) + 1, 94)) {
                                        return false;
                                    }
                                    var45 += var25;
                                    var54 += class270.field3864;
                                    var46 += var22;
                                    var48 += var20;
                                }
                            }
                            if (!class515.method3041(0, (var47 >> 12) - 1, var54, class255.field3667, var45, var24, (var46 >> 12) + 1, 76)) {
                                return false;
                            }
                            var45 += var25;
                            var46 += var22;
                            var47 += var21;
                            var54 += class270.field3864;
                        }
                    }
                } else {
                    int var55;
                    int var56 = var55 = arg6 << 12;
                    if (arg7 < 0) {
                        var45 -= arg7 * var25;
                        var55 -= arg7 * var22;
                        var56 -= arg7 * var21;
                        arg7 = 0;
                    }
                    int var57 = arg3 << 12;
                    if (arg5 < 0) {
                        var57 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (var22 <= var21) {
                        int var58 = arg2 - arg5;
                        int var59 = arg5 - arg7;
                        int var60 = class270.field3864 * arg7;
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                while (true) {
                                    var58--;
                                    if (var58 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var57 >> 12) - 1, var60, class255.field3667, var45, var24, (var56 >> 12) + 1, 123)) {
                                        return false;
                                    }
                                    var60 += class270.field3864;
                                    var56 += var21;
                                    var45 += var25;
                                    var57 += var20;
                                }
                            }
                            if (!class515.method3041(0, (var55 >> 12) - 1, var60, class255.field3667, var45, var24, (var56 >> 12) + 1, 27)) {
                                return false;
                            }
                            var55 += var22;
                            var60 += class270.field3864;
                            var45 += var25;
                            var56 += var21;
                        }
                    } else {
                        int var61 = arg2 - arg5;
                        int var62 = arg5 - arg7;
                        int var63 = class270.field3864 * arg7;
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                while (true) {
                                    var61--;
                                    if (var61 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var56 >> 12) - 1, var63, class255.field3667, var45, var24, (var57 >> 12) + 1, 92)) {
                                        return false;
                                    }
                                    var45 += var25;
                                    var57 += var20;
                                    var63 += class270.field3864;
                                    var56 += var21;
                                }
                            }
                            if (!class515.method3041(0, (var56 >> 12) - 1, var63, class255.field3667, var45, var24, (var55 >> 12) + 1, 26)) {
                                return false;
                            }
                            var56 += var21;
                            var45 += var25;
                            var63 += class270.field3864;
                            var55 += var22;
                        }
                    }
                }
            } else if (class394.field5922 <= arg2) {
                return true;
            } else {
                if (arg5 > class394.field5922) {
                    arg5 = class394.field5922;
                }
                int var64 = (arg8 << 8) + var24 - (arg0 * var24);
                if (class394.field5922 < arg7) {
                    arg7 = class394.field5922;
                }
                if (arg7 >= arg5) {
                    int var65;
                    int var66 = var65 = arg0 << 12;
                    int var67 = arg3 << 12;
                    if (arg2 < 0) {
                        var65 -= arg2 * var21;
                        var66 -= arg2 * var20;
                        var64 -= arg2 * var25;
                        arg2 = 0;
                    }
                    if (arg5 < 0) {
                        var67 -= arg5 * var22;
                        arg5 = 0;
                    }
                    if (var20 < var21) {
                        int var68 = arg7 - arg5;
                        int var69 = arg5 - arg2;
                        int var70 = class270.field3864 * arg2;
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var67 >> 12) - 1, var70, class255.field3667, var64, var24, (var65 >> 12) + 1, 23)) {
                                        return false;
                                    }
                                    var67 += var22;
                                    var64 += var25;
                                    var65 += var21;
                                    var70 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var66 >> 12) - 1, var70, class255.field3667, var64, var24, (var65 >> 12) + 1, 16)) {
                                return false;
                            }
                            var66 += var20;
                            var65 += var21;
                            var70 += class270.field3864;
                            var64 += var25;
                        }
                    } else {
                        int var71 = arg7 - arg5;
                        int var72 = arg5 - arg2;
                        int var73 = class270.field3864 * arg2;
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var65 >> 12) - 1, var73, class255.field3667, var64, var24, (var67 >> 12) + 1, 109)) {
                                        return false;
                                    }
                                    var67 += var22;
                                    var73 += class270.field3864;
                                    var64 += var25;
                                    var65 += var21;
                                }
                            }
                            if (!class515.method3041(0, (var65 >> 12) - 1, var73, class255.field3667, var64, var24, (var66 >> 12) + 1, 10)) {
                                return false;
                            }
                            var65 += var21;
                            var64 += var25;
                            var66 += var20;
                            var73 += class270.field3864;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg0 << 12;
                    if (arg2 < 0) {
                        var75 -= arg2 * var20;
                        var74 -= arg2 * var21;
                        var64 -= arg2 * var25;
                        arg2 = 0;
                    }
                    int var76 = arg6 << 12;
                    if (arg7 < 0) {
                        var76 -= arg7 * var22;
                        arg7 = 0;
                    }
                    if ((arg2 == arg7 || var20 >= var21) && (arg2 != arg7 || var22 >= var20)) {
                        int var80 = arg5 - arg7;
                        int var81 = arg7 - arg2;
                        int var82 = class270.field3864 * arg2;
                        while (true) {
                            var81--;
                            if (var81 < 0) {
                                while (true) {
                                    var80--;
                                    if (var80 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var76 >> 12) - 1, var82, class255.field3667, var64, var24, (var75 >> 12) + 1, 22)) {
                                        return false;
                                    }
                                    var76 += var22;
                                    var64 += var25;
                                    var75 += var20;
                                    var82 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var74 >> 12) - 1, var82, class255.field3667, var64, var24, (var75 >> 12) + 1, 84)) {
                                return false;
                            }
                            var82 += class270.field3864;
                            var74 += var21;
                            var75 += var20;
                            var64 += var25;
                        }
                    } else {
                        int var77 = arg5 - arg7;
                        int var78 = arg7 - arg2;
                        int var79 = class270.field3864 * arg2;
                        while (true) {
                            var78--;
                            if (var78 < 0) {
                                while (true) {
                                    var77--;
                                    if (var77 < 0) {
                                        return true;
                                    }
                                    if (!class515.method3041(0, (var75 >> 12) - 1, var79, class255.field3667, var64, var24, (var76 >> 12) + 1, 89)) {
                                        return false;
                                    }
                                    var75 += var20;
                                    var64 += var25;
                                    var76 += var22;
                                    var79 += class270.field3864;
                                }
                            }
                            if (!class515.method3041(0, (var75 >> 12) - 1, var79, class255.field3667, var64, var24, (var74 >> 12) + 1, 30)) {
                                return false;
                            }
                            var74 += var21;
                            var79 += class270.field3864;
                            var64 += var25;
                            var75 += var20;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method3796(byte arg0) {
        field9202 = null;
        if (arg0 == 2) {
            field9204 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIF[F[FIIIIF)V")
    public static final void method3797(int arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, float[] arg6, int arg7, int arg8, int arg9, int arg10, float arg11) {
        if (arg0 >= -61) {
            method3795(-64, (byte) 87, -98, -27, 63, -87, -46, -72, -15, 111);
        }
        int var12 = arg1 - arg2;
        int var13 = arg8 - arg7;
        int var14 = arg9 - arg10;
        field9200++;
        float var15 = arg5[2] * (float) var13 + arg5[1] * (float) var12 + arg5[0] * (float) var14;
        float var16 = arg5[5] * (float) var13 + arg5[3] * (float) var14 + arg5[4] * (float) var12;
        float var17 = arg5[8] * (float) var13 + arg5[7] * (float) var12 + arg5[6] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var18 = arg4 * var18;
        }
        float var19 = var16 + arg11 + 0.5F;
        if (arg3 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg3 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg3 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg6[1] = var19;
        arg6[0] = var18;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Z")
    public static final boolean method3798(int arg0, byte arg1) {
        field9201++;
        if (arg1 != -72) {
            method3798(21, (byte) 120);
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }
}
