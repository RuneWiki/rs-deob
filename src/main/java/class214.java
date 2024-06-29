import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class214 {

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[I")
    public static int[] field3291 = new int[14];

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lgh;")
    public static class248 field3283 = null;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3286 = "flash3:";

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3294 = null;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3295 = 0;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3296 = "skill: ";

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lfc;")
    public class110 field3287;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lhk;")
    public class42 field3289;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Ljd;")
    public static class95 field3297;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1529(int arg0) {
        class141.field2172++;
        field3285++;
        class85.field1236.method1141((byte) 42, arg0);
        for (class242 var1 = (class242) class222.field3383.method1706(0); var1 != null; var1 = (class242) class222.field3383.method1705((byte) 16)) {
            if (var1.field3683 == 0) {
                class147.method1109(var1, true, (byte) 73);
            }
        }
        if (class29.field352 != null) {
            class254.method1776(arg0 - 186, class29.field352);
            class29.field352 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 45)
    public static void method1530(int arg0) {
        field3296 = null;
        field3291 = null;
        if (arg0 == 0) {
            field3286 = null;
            field3297 = null;
            field3294 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 62)
    public static final void method1531(String arg0, int arg1, byte arg2) {
        field3290++;
        class188 var3 = class147.method1111(-19, arg1, 3);
        if (arg2 > 32) {
            var3.method1392((byte) -48);
            var3.field2950 = arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lwm;I)V", line = 77)
    public static final void method1532(class254 arg0, int arg1) {
        field3292++;
        byte[] var2 = new byte[24];
        if (class27.field301 != null) {
            try {
                class27.field301.method1921((byte) -102, 0L);
                int var3 = 0;
                class27.field301.method1922(var2, -35);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1759(-91, var2, 0, 24);
        int var6 = 116 / ((-arg1 - 76) / 35);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIILmn;I)V", line = 121)
    public static final void method1533(int arg0, int arg1, int arg2, class161 arg3, int arg4) {
        field3288++;
        class293.method2025((byte) 100);
        if (class73.field1058) {
            class175.method1316(arg0, arg4, arg3.field2619 + arg0, arg3.field2490 + arg4);
        } else {
            class287.method1980(arg0, arg4, arg3.field2619 + arg0, arg3.field2490 + arg4);
        }
        if (class260.field4003 != 2 && class260.field4003 != 5 && class161.field2525 != null) {
            int var5 = (int) class243.field3695 + class63.field846 & 0x7FF;
            int var6 = 48 - (-(class39.field575.field4713 / 32));
            int var7 = 464 - (class39.field575.field4731 / 32);
            if (class73.field1058) {
                ((class44) class161.field2525).method345(arg0, arg4, arg3.field2619, arg3.field2490, var6, var7, var5, class94.field1332 + 256, (class44) arg3.method1202(-91, false));
            } else {
                ((class195) class161.field2525).method127(arg0, arg4, arg3.field2619, arg3.field2490, var6, var7, var5, class94.field1332 + 256, arg3.field2478, arg3.field2556);
            }
            if (class2.field23 != null) {
                for (int var8 = 0; var8 < class2.field23.field291; var8++) {
                    if (class2.field23.method198(false, var8)) {
                        int var9 = ((class2.field23.field289[var8] & 0x3FFF) - class293.field4522) * 4 + 2 - (class39.field575.field4731 / 32);
                        int var10 = class164.field2650[var5];
                        int var11 = var10 * 256 / (class94.field1332 + 256);
                        class326 var12 = class300.field4623;
                        int var13 = class164.field2664[var5];
                        int var14 = (((class2.field23.field289[var8] & 0xFFFC02F) >> 14) - class327.field5054) * 4 + 2 - (class39.field575.field4713 / 32);
                        int var15 = var13 * 256 / (class94.field1332 + 256);
                        int var16 = var9 * var15 - (var11 * var14) >> 16;
                        int var17 = var9 * var11 + var14 * var15 >> 16;
                        if (class2.field23.method202(3, var8) == 1) {
                            var12 = class265.field4128;
                        }
                        if (class2.field23.method202(3, var8) == 2) {
                            var12 = class167.field2703;
                        }
                        int var18 = var12.method2273(class2.field23.field283[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg3.field2619 && arg3.field2619 >= var19 && (-arg3.field2490) <= var16 && arg3.field2490 >= var16) {
                            int var20 = 16777215;
                            if (class2.field23.field281[var8] != -1) {
                                var20 = class2.field23.field281[var8];
                            }
                            if (class73.field1058) {
                                class175.method1323((class44) arg3.method1202(-97, false));
                            } else {
                                class287.method1973(arg3.field2478, arg3.field2556);
                            }
                            var12.method2270(class2.field23.field283[var8], arg3.field2619 / 2 + arg0 + var19, arg4 - (-(arg3.field2490 / 2) + var16), var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class73.field1058) {
                                class175.method1317();
                            } else {
                                class287.method1983();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class207.field3173; var21++) {
                int var22 = class188.field2962[var21] * 4 + 2 - (class39.field575.field4731 / 32);
                int var23 = class272.field4254[var21] * 4 + (-(class39.field575.field4713 / 32)) + 2;
                class32 var24 = class226.method1607(-119, class248.field3739[var21]);
                if (var24.field450 != null) {
                    var24 = var24.method247(-1);
                    if (var24 == null || var24.field400 == -1) {
                        continue;
                    }
                }
                class264.method1851(arg3, arg0, var22, arg4, class98.field1405[var24.field400], -29787, var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class281 var27 = class265.field4136[class265.field4112][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class39.field575.field4713 / 32);
                        int var29 = var26 * 4 + 2 - class39.field575.field4731 / 32;
                        class264.method1851(arg3, arg0, var29, arg4, class345.field5347[0], -29787, var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class52.field702; var30++) {
                class76 var31 = class264.field4064[class272.field4252[var30]];
                if (var31 != null && var31.method598(-113)) {
                    class332 var32 = var31.field1104;
                    if (var32 != null && var32.field5162 != null) {
                        var32 = var32.method2324((byte) -126);
                    }
                    if (var32 != null && var32.field5177 && var32.field5139) {
                        int var33 = var31.field4713 / 32 - (class39.field575.field4713 / 32);
                        int var34 = var31.field4731 / 32 - (class39.field575.field4731 / 32);
                        if (var32.field5180 == -1) {
                            class264.method1851(arg3, arg0, var34, arg4, class345.field5347[1], -29787, var33);
                        } else {
                            class264.method1851(arg3, arg0, var34, arg4, class98.field1405[var32.field5180], arg2 - 44027, var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class234.field3563; var35++) {
                class270 var36 = class201.field3096[class291.field4475[var35]];
                if (var36 != null && var36.method598(-121)) {
                    int var37 = var36.field4713 / 32 - (class39.field575.field4713 / 32);
                    int var38 = var36.field4731 / 32 - (class39.field575.field4731 / 32);
                    boolean var39 = false;
                    long var40 = class49.method374(var36.field4218, -1);
                    for (int var42 = 0; var42 < class159.field2416; var42++) {
                        if (class110.field1659[var42] == var40 && class238.field3626[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class333.field5190; var44++) {
                        if (class36.field524[var44].field69 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class39.field575.field4193 != 0 && var36.field4193 != 0 && class39.field575.field4193 == var36.field4193) {
                        var45 = true;
                    }
                    if (var39) {
                        class264.method1851(arg3, arg0, var38, arg4, class345.field5347[3], -29787, var37);
                    } else if (var43) {
                        class264.method1851(arg3, arg0, var38, arg4, class345.field5347[5], arg2 ^ 0xFFFFBC05, var37);
                    } else if (var45) {
                        class264.method1851(arg3, arg0, var38, arg4, class345.field5347[4], -29787, var37);
                    } else {
                        class264.method1851(arg3, arg0, var38, arg4, class345.field5347[2], -29787, var37);
                    }
                }
            }
            class279[] var46 = class118.field1837;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class279 var48 = var46[var47];
                if (var48 != null && var48.field4338 != 0 && class233.field3542 % 20 < 10) {
                    if (var48.field4338 == 1 && var48.field4328 >= 0 && class264.field4064.length > var48.field4328) {
                        class76 var49 = class264.field4064[var48.field4328];
                        if (var49 != null) {
                            int var50 = var49.field4713 / 32 - (class39.field575.field4713 / 32);
                            int var51 = var49.field4731 / 32 - class39.field575.field4731 / 32;
                            class172.method1296(360000, var48.field4337, arg0, var51, arg4, arg3, var50, 240);
                        }
                    }
                    if (var48.field4338 == 2) {
                        int var52 = (var48.field4331 - class327.field5054) * 4 + 2 - (class39.field575.field4713 / 32);
                        int var53 = (var48.field4334 - class293.field4522) * 4 + 2 - (class39.field575.field4731 / 32);
                        int var54 = var48.field4336 * 4;
                        int var55 = var54 * var54;
                        class172.method1296(var55, var48.field4337, arg0, var53, arg4, arg3, var52, 240);
                    }
                    if (var48.field4338 == 10 && var48.field4328 >= 0 && var48.field4328 < class201.field3096.length) {
                        class270 var56 = class201.field3096[var48.field4328];
                        if (var56 != null) {
                            int var57 = var56.field4713 / 32 - class39.field575.field4713 / 32;
                            int var58 = var56.field4731 / 32 - (class39.field575.field4731 / 32);
                            class172.method1296(360000, var48.field4337, arg0, var58, arg4, arg3, var57, arg2 - 14000);
                        }
                    }
                }
            }
            if (class163.field2641 != 0) {
                int var59 = class163.field2641 * 4 + (class39.field575.method1897(8) - 1) * 2 + 2 - (class39.field575.field4713 / 32);
                int var60 = class260.field3999 * 4 + (class39.field575.method1897(8) * 2) + 2 - class39.field575.field4731 / 32 - 2;
                class264.method1851(arg3, arg0, var60, arg4, class102.field1470, -29787, var59);
            }
            if (class73.field1058) {
                class175.method1322(arg3.field2619 / 2 + arg0 - 1, arg3.field2490 / 2 + -1 + arg4, 3, 3, 16777215);
            } else {
                class287.method1987(arg3.field2619 / 2 + arg0 - 1, arg3.field2490 / 2 + arg4 + -1, 3, 3, 16777215);
            }
        } else if (class73.field1058) {
            class269 var61 = arg3.method1202(arg2 ^ 0xFFFFC804, false);
            if (var61 != null) {
                var61.method124(arg0, arg4);
            }
        } else {
            class287.method1975(arg0, arg4, 0, arg3.field2478, arg3.field2556);
        }
        class331.field5117[arg1] = true;
        if (arg2 != 14240) {
            method1532((class254) null, -102);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIZBIII)V", line = 472)
    public static final void method1534(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3293++;
        if (!arg3 && class305.field4773 == arg6 && class234.field3559 == arg2 && class170.field2749 == arg1 || class110.method841((byte) 88)) {
            return;
        }
        class170.field2749 = arg1;
        class305.field4773 = arg6;
        class234.field3559 = arg2;
        if (class110.method841((byte) 88)) {
            class170.field2749 = 0;
        }
        if (arg0) {
            class101.method758(124, 28);
        } else {
            class101.method758(125, 25);
        }
        class97.method729(29912, true, class286.field4447);
        int var8 = class293.field4522;
        class293.field4522 = (arg2 - 6) * 8;
        int var9 = class327.field5054;
        class327.field5054 = arg6 * 8 - 48;
        class309.field4820 = class63.method434(class305.field4773 * 8, class234.field3559 * 8, (byte) 120);
        int var10 = class327.field5054 - var9;
        if (arg4 >= -58) {
            method1530(-85);
        }
        class2.field23 = null;
        int var11 = class293.field4522 - var8;
        int var12 = class293.field4522;
        int var13 = class327.field5054;
        if (arg0) {
            class52.field702 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class76 var18 = class264.field4064[var17];
                if (var18 != null) {
                    var18.field4731 -= var11 * 128;
                    var18.field4713 -= var10 * 128;
                    if (var18.field4713 >= 0 && var18.field4713 <= 13184 && var18.field4731 >= 0 && var18.field4731 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field4676[var19] -= var10;
                            var18.field4744[var19] -= var11;
                        }
                        class272.field4252[class52.field702++] = var17;
                    } else {
                        class264.field4064[var17].method597((byte) -118, (class332) null);
                        class264.field4064[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class76 var15 = class264.field4064[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4676[var16] -= var10;
                        var15.field4744[var16] -= var11;
                    }
                    var15.field4713 -= var10 * 128;
                    var15.field4731 -= var11 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class270 var21 = class201.field3096[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4676[var22] -= var10;
                    var21.field4744[var22] -= var11;
                }
                var21.field4713 -= var10 * 128;
                var21.field4731 -= var11 * 128;
            }
        }
        class265.field4112 = arg1;
        class39.field575.method1893(false, arg5, (byte) -46, arg7);
        byte var23 = 104;
        byte var24 = 0;
        byte var25 = 1;
        if (var10 < 0) {
            var24 = 103;
            var25 = -1;
            var23 = -1;
        }
        byte var26 = 0;
        byte var27 = 104;
        byte var28 = 1;
        if (var11 < 0) {
            var28 = -1;
            var27 = -1;
            var26 = 103;
        }
        for (int var29 = var24; var29 != var23; var29 += var25) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var11 + var30;
                int var32 = var10 + var29;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class265.field4136[var33][var29][var30] = class265.field4136[var33][var32][var31];
                    } else {
                        class265.field4136[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class160 var34 = (class160) class2.field28.method1954(-66); var34 != null; var34 = (class160) class2.field28.method1950((byte) 100)) {
            var34.field2418 -= var11;
            var34.field2437 -= var10;
            if (var34.field2437 < 0 || var34.field2418 < 0 || var34.field2437 >= 104 || var34.field2418 >= 104) {
                var34.method39(10717);
            }
        }
        if (class163.field2641 != 0) {
            class163.field2641 -= var10;
            class260.field3999 -= var11;
        }
        if (arg0) {
            class151.field2296 -= var11;
            class32.field396 -= var10;
            class167.field2704 -= var10;
            class197.field3028 -= var11 * 128;
            class190.field2976 -= var10 * 128;
            class106.field1538 -= var11;
        } else {
            class268.field4168 = 1;
        }
        class159.field2414 = 0;
        if (class73.field1058 && arg0 && (Math.abs(var10) > 104 || Math.abs(var11) > 104)) {
            class222.method1578(-13559);
        }
        class277.field4307 = -1;
        class163.field2636.method1951(29532);
        class240.field3671.method1951(29532);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 723)
    public static final void method1535(byte arg0) {
        class305.field4723.method752(false);
        if (arg0 == 113) {
            field3284++;
        }
    }
}
