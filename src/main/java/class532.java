import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class532 extends class490 {

    @OriginalMember(owner = "client!de", name = "n", descriptor = "[I")
    public int[] field7032;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
    public int[] field7031;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lvv;")
    public static class329 field7028 = new class329(64);

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Ldia;")
    public static class235 field7033 = new class235("", 17);

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7027++;
        int var8 = arg2 + arg7;
        int var9 = arg3 - arg2;
        if (arg5 > -56) {
            field7034 = -56;
        }
        for (int var10 = arg7; var10 < var8; var10++) {
            class717.method4012(arg6, -81, arg0, class690.field9616[var10], arg4);
        }
        for (int var11 = arg3; var11 > var9; var11--) {
            class717.method4012(arg6, -107, arg0, class690.field9616[var11], arg4);
        }
        int var12 = arg4 - arg2;
        int var13 = arg0 + arg2;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class690.field9616[var14];
            class717.method4012(arg6, -104, arg0, var15, var13);
            class717.method4012(arg1, -126, var13, var15, var12);
            class717.method4012(arg6, -106, var12, var15, arg4);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lla;ZI)V", line = 50)
    public static final void method2965(class456 arg0, boolean arg1, int arg2) {
        field7029++;
        if (class501.field6728 >= 50 || arg0 == null || arg0.field6243 == null || arg2 >= arg0.field6243.length || arg0.field6243[arg2] == null || arg1) {
            return;
        }
        int var3 = arg0.field6243[arg2][0];
        int var4 = var3 >> 8;
        if (arg0.field6243[arg2].length > 1) {
            int var5 = (int) (Math.random() * (double) arg0.field6243[arg2].length);
            if (var5 > 0) {
                var4 = arg0.field6243[arg2][var5];
            }
        }
        int var6 = var3 >> 5 & 0x7;
        int var7 = 256;
        if (arg0.field6221 != null && arg0.field6230 != null) {
            var7 = class502.method2826(arg0.field6230[arg2], arg0.field6221[arg2], true);
        }
        if (arg0.field6247) {
            class291.method1804(arg1, 255, var6, var4, var7, false, 0);
        } else {
            class594.method3228(var7, (byte) 78, var4, 0, 255, var6);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 95)
    public static void method2966(byte arg0) {
        field7033 = null;
        field7028 = null;
        if (arg0 < 61) {
            method2967(-53, -33, -27, -34, -88, 94, 70, -32, -83, -97);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIII)Z", line = 109)
    public static final boolean method2967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7030++;
        if (arg4 > 2000 || arg1 > 2000 || arg5 > 2000 || arg2 > 2000 || arg7 > 2000 || arg6 > 2000) {
            return false;
        } else if (arg4 >= -2000 && arg1 >= -2000 && arg5 >= -2000 && arg2 >= -2000 && arg7 >= -2000 && arg6 >= -2000) {
            if (class159.field2398 == 2) {
                int var10 = class758.field10556 * arg4 + arg2;
                if (var10 >= 0 && var10 < class253.field3481.length && class253.field3481[var10] > (arg8 << 8) - 38400) {
                    return false;
                }
                int var11 = class758.field10556 * arg1 + arg7;
                if (var11 >= 0 && var11 < class253.field3481.length && (arg0 << 8) - 38400 < class253.field3481[var11]) {
                    return false;
                }
                int var12 = class758.field10556 * arg5 + arg6;
                if (var12 >= 0 && var12 < class253.field3481.length && (arg9 << 8) - 38400 < class253.field3481[var12]) {
                    return false;
                }
            }
            int var13 = arg7 - arg2;
            int var14 = arg1 - arg4;
            int var15 = arg6 - arg2;
            int var16 = arg5 - arg4;
            int var17 = arg0 - arg8;
            int var18 = arg9 - arg8;
            if (arg1 > arg4 && arg5 > arg5) {
                if (arg1 <= arg5) {
                    arg5++;
                } else {
                    arg1++;
                }
                arg4--;
            } else if (arg1 >= arg5) {
                if (arg4 > arg1) {
                    arg4++;
                } else {
                    arg1++;
                }
                arg5--;
            } else {
                arg1--;
                if (arg4 <= arg5) {
                    arg5++;
                } else {
                    arg4++;
                }
            }
            int var19 = 0;
            if (arg1 != arg4) {
                var19 = (arg7 - arg2 << 12) / (arg1 - arg4);
            }
            int var20 = 0;
            if (arg1 != arg5) {
                var20 = (arg6 - arg7 << 12) / (arg5 - arg1);
            }
            int var21 = 0;
            if (arg4 != arg5) {
                var21 = (arg2 - arg6 << 12) / (arg4 - arg5);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (arg3 != -13221) {
                field7028 = null;
            }
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg1 >= arg4 && arg5 >= arg4) {
                if (arg4 >= class721.field10044) {
                    return true;
                }
                int var25 = (arg8 << 8) + var23 - (arg2 * var23);
                if (class721.field10044 < arg1) {
                    arg1 = class721.field10044;
                }
                if (arg5 > class721.field10044) {
                    arg5 = class721.field10044;
                }
                if (arg5 <= arg1) {
                    int var26;
                    int var27 = var26 = arg2 << 12;
                    int var28 = arg6 << 12;
                    if (arg4 < 0) {
                        var27 -= arg4 * var21;
                        var25 -= arg4 * var24;
                        var26 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (arg5 < 0) {
                        var28 -= arg5 * var20;
                        arg5 = 0;
                    }
                    if (arg4 != arg5 && var19 > var21 || arg4 == arg5 && var20 > var19) {
                        int var29 = arg1 - arg5;
                        int var30 = arg5 - arg4;
                        int var31 = class758.field10556 * arg4;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -84, (var26 >> 12) + 1, class253.field3481, 0, var25, (var28 >> 12) - 1, var23, var31)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var26 += var19;
                                    var31 += class758.field10556;
                                    var25 += var24;
                                }
                            }
                            if (!class184.method1269((byte) 85, (var26 >> 12) + 1, class253.field3481, 0, var25, (var27 >> 12) - 1, var23, var31)) {
                                return false;
                            }
                            var26 += var19;
                            var25 += var24;
                            var27 += var21;
                            var31 += class758.field10556;
                        }
                    } else {
                        int var32 = arg1 - arg5;
                        int var33 = arg5 - arg4;
                        int var34 = class758.field10556 * arg4;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -118, (var28 >> 12) + 1, class253.field3481, 0, var25, (var26 >> 12) - 1, var23, var34)) {
                                        return false;
                                    }
                                    var26 += var19;
                                    var25 += var24;
                                    var28 += var20;
                                    var34 += class758.field10556;
                                }
                            }
                            if (!class184.method1269((byte) 19, (var27 >> 12) + 1, class253.field3481, 0, var25, (var26 >> 12) - 1, var23, var34)) {
                                return false;
                            }
                            var27 += var21;
                            var34 += class758.field10556;
                            var25 += var24;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg2 << 12;
                    int var37 = arg7 << 12;
                    if (arg4 < 0) {
                        var25 -= arg4 * var24;
                        var36 -= arg4 * var21;
                        var35 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (arg1 < 0) {
                        var37 -= arg1 * var20;
                        arg1 = 0;
                    }
                    if ((arg1 == arg4 || var19 <= var21) && (arg1 != arg4 || var20 >= var21)) {
                        int var41 = arg5 - arg1;
                        int var42 = arg1 - arg4;
                        int var43 = class758.field10556 * arg4;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) 8, (var36 >> 12) + 1, class253.field3481, 0, var25, (var37 >> 12) - 1, var23, var43)) {
                                        return false;
                                    }
                                    var43 += class758.field10556;
                                    var36 += var21;
                                    var25 += var24;
                                    var37 += var20;
                                }
                            }
                            if (!class184.method1269((byte) -108, (var36 >> 12) + 1, class253.field3481, 0, var25, (var35 >> 12) - 1, var23, var43)) {
                                return false;
                            }
                            var43 += class758.field10556;
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                        }
                    } else {
                        int var38 = arg5 - arg1;
                        int var39 = arg1 - arg4;
                        int var40 = class758.field10556 * arg4;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -115, (var37 >> 12) + 1, class253.field3481, 0, var25, (var36 >> 12) - 1, var23, var40)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var37 += var20;
                                    var40 += class758.field10556;
                                    var25 += var24;
                                }
                            }
                            if (!class184.method1269((byte) -121, (var35 >> 12) + 1, class253.field3481, 0, var25, (var36 >> 12) - 1, var23, var40)) {
                                return false;
                            }
                            var35 += var19;
                            var36 += var21;
                            var25 += var24;
                            var40 += class758.field10556;
                        }
                    }
                }
            } else if (arg1 > arg5) {
                if (arg5 >= class721.field10044) {
                    return true;
                }
                if (arg4 > class721.field10044) {
                    arg4 = class721.field10044;
                }
                int var44 = (arg9 << 8) + var23 - (arg6 * var23);
                if (arg1 > class721.field10044) {
                    arg1 = class721.field10044;
                }
                if (arg1 <= arg4) {
                    int var45;
                    int var46 = var45 = arg6 << 12;
                    int var47 = arg7 << 12;
                    if (arg5 < 0) {
                        var44 -= arg5 * var24;
                        var46 -= arg5 * var20;
                        var45 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg1 < 0) {
                        var47 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (var21 > var20) {
                        int var48 = arg4 - arg1;
                        int var49 = arg1 - arg5;
                        int var50 = class758.field10556 * arg5;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -92, (var45 >> 12) + 1, class253.field3481, 0, var44, (var47 >> 12) - 1, var23, var50)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var45 += var21;
                                    var47 += var19;
                                    var50 += class758.field10556;
                                }
                            }
                            if (!class184.method1269((byte) -88, (var45 >> 12) + 1, class253.field3481, 0, var44, (var46 >> 12) - 1, var23, var50)) {
                                return false;
                            }
                            var45 += var21;
                            var50 += class758.field10556;
                            var44 += var24;
                            var46 += var20;
                        }
                    } else {
                        int var51 = arg4 - arg1;
                        int var52 = arg1 - arg5;
                        int var53 = class758.field10556 * arg5;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -93, (var47 >> 12) + 1, class253.field3481, 0, var44, (var45 >> 12) - 1, var23, var53)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var47 += var19;
                                    var44 += var24;
                                    var53 += class758.field10556;
                                }
                            }
                            if (!class184.method1269((byte) 115, (var46 >> 12) + 1, class253.field3481, 0, var44, (var45 >> 12) - 1, var23, var53)) {
                                return false;
                            }
                            var44 += var24;
                            var46 += var20;
                            var53 += class758.field10556;
                            var45 += var21;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg6 << 12;
                    if (arg5 < 0) {
                        var55 -= arg5 * var20;
                        var54 -= arg5 * var21;
                        var44 -= arg5 * var24;
                        arg5 = 0;
                    }
                    int var56 = arg2 << 12;
                    if (arg4 < 0) {
                        var56 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (var20 >= var21) {
                        int var57 = arg1 - arg4;
                        int var58 = arg4 - arg5;
                        int var59 = class758.field10556 * arg5;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) 104, (var55 >> 12) + 1, class253.field3481, 0, var44, (var56 >> 12) - 1, var23, var59)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var44 += var24;
                                    var55 += var20;
                                    var59 += class758.field10556;
                                }
                            }
                            if (!class184.method1269((byte) 90, (var55 >> 12) + 1, class253.field3481, 0, var44, (var54 >> 12) - 1, var23, var59)) {
                                return false;
                            }
                            var44 += var24;
                            var54 += var21;
                            var59 += class758.field10556;
                            var55 += var20;
                        }
                    } else {
                        int var60 = arg1 - arg4;
                        int var61 = arg4 - arg5;
                        int var62 = class758.field10556 * arg5;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -122, (var56 >> 12) + 1, class253.field3481, 0, var44, (var55 >> 12) - 1, var23, var62)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var62 += class758.field10556;
                                    var55 += var20;
                                    var56 += var19;
                                }
                            }
                            if (!class184.method1269((byte) -117, (var54 >> 12) + 1, class253.field3481, 0, var44, (var55 >> 12) - 1, var23, var62)) {
                                return false;
                            }
                            var55 += var20;
                            var62 += class758.field10556;
                            var54 += var21;
                            var44 += var24;
                        }
                    }
                }
            } else if (arg1 >= class721.field10044) {
                return true;
            } else {
                if (class721.field10044 < arg5) {
                    arg5 = class721.field10044;
                }
                int var63 = (arg0 << 8) + var23 - arg7 * var23;
                if (arg4 > class721.field10044) {
                    arg4 = class721.field10044;
                }
                if (arg5 < arg4) {
                    int var64;
                    int var65 = var64 = arg7 << 12;
                    if (arg1 < 0) {
                        var63 -= arg1 * var24;
                        var65 -= arg1 * var19;
                        var64 -= arg1 * var20;
                        arg1 = 0;
                    }
                    int var66 = arg6 << 12;
                    if (arg5 < 0) {
                        var66 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg1 != arg5 && var20 > var19 || arg1 == arg5 && var19 > var21) {
                        int var67 = arg4 - arg5;
                        int var68 = arg5 - arg1;
                        int var69 = class758.field10556 * arg1;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -105, (var66 >> 12) + 1, class253.field3481, 0, var63, (var65 >> 12) - 1, var23, var69)) {
                                        return false;
                                    }
                                    var66 += var21;
                                    var69 += class758.field10556;
                                    var65 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class184.method1269((byte) 59, (var64 >> 12) + 1, class253.field3481, 0, var63, (var65 >> 12) - 1, var23, var69)) {
                                return false;
                            }
                            var63 += var24;
                            var65 += var19;
                            var69 += class758.field10556;
                            var64 += var20;
                        }
                    } else {
                        int var70 = arg4 - arg5;
                        int var71 = arg5 - arg1;
                        int var72 = class758.field10556 * arg1;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) -105, (var65 >> 12) + 1, class253.field3481, 0, var63, (var66 >> 12) - 1, var23, var72)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var65 += var19;
                                    var66 += var21;
                                    var72 += class758.field10556;
                                }
                            }
                            if (!class184.method1269((byte) -128, (var65 >> 12) + 1, class253.field3481, 0, var63, (var64 >> 12) - 1, var23, var72)) {
                                return false;
                            }
                            var72 += class758.field10556;
                            var65 += var19;
                            var64 += var20;
                            var63 += var24;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg7 << 12;
                    int var75 = arg2 << 12;
                    if (arg1 < 0) {
                        var63 -= arg1 * var24;
                        var73 -= arg1 * var20;
                        var74 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (arg4 < 0) {
                        var75 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (var19 >= var20) {
                        int var76 = arg5 - arg4;
                        int var77 = arg4 - arg1;
                        int var78 = class758.field10556 * arg1;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) 36, (var75 >> 12) + 1, class253.field3481, 0, var63, (var73 >> 12) - 1, var23, var78)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var73 += var20;
                                    var78 += class758.field10556;
                                    var75 += var21;
                                }
                            }
                            if (!class184.method1269((byte) -115, (var74 >> 12) + 1, class253.field3481, 0, var63, (var73 >> 12) - 1, var23, var78)) {
                                return false;
                            }
                            var74 += var19;
                            var78 += class758.field10556;
                            var73 += var20;
                            var63 += var24;
                        }
                    } else {
                        int var79 = arg5 - arg4;
                        int var80 = arg4 - arg1;
                        int var81 = class758.field10556 * arg1;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class184.method1269((byte) 13, (var73 >> 12) + 1, class253.field3481, 0, var63, (var75 >> 12) - 1, var23, var81)) {
                                        return false;
                                    }
                                    var73 += var20;
                                    var75 += var21;
                                    var63 += var24;
                                    var81 += class758.field10556;
                                }
                            }
                            if (!class184.method1269((byte) 64, (var73 >> 12) + 1, class253.field3481, 0, var63, (var74 >> 12) - 1, var23, var81)) {
                                return false;
                            }
                            var73 += var20;
                            var81 += class758.field10556;
                            var63 += var24;
                            var74 += var19;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II[I[I)V", line = 754)
    public class532(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field7032 = arg3;
        this.field7031 = arg2;
    }
}
