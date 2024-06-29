import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class257 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "J")
    public static long field4334;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[Lme;")
    public static class502[] field4333;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4332++;
        int var7 = class151.field2425;
        class20.field224 = 0;
        int[] var8 = class45.field734;
        for (int var9 = 0; var9 < (class86.field1471 + var7); var9++) {
            class510 var32 = null;
            class197 var33;
            if (var7 <= var9) {
                var33 = ((class505) class147.field2396.method2516((long) class371.field5734[var9 - var7], -1)).field7355;
                var32 = ((class265) var33).field4430;
                if (var32.field7448 != null) {
                    var32 = var32.method3000(1, class327.field5160);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class435.field6489[var8[var9]];
            }
            if (var33.field3122 >= 0 && (class536.field7878 == var33.field3073 || class302.field4850.field4720 == var33.field4720)) {
                class499.method2955(arg4 >> 1, -10480, var33, var33.method1307(-123), arg0, arg1, arg3 >> 1);
                if (class244.field4188[0] >= 0) {
                    if (var33.field3062 != null && (var9 >= var7 || class470.field6968 == 0 || class470.field6968 == 3 || class470.field6968 == 1 && class241.method1659(((class166) var33).field2652, 0)) && class176.field2784 > class20.field224) {
                        class176.field2800[class20.field224] = class84.field1467.method2085((byte) -115, var33.field3062) / 2;
                        class176.field2799[class20.field224] = class244.field4188[0];
                        class176.field2790[class20.field224] = class244.field4188[1];
                        class176.field2780[class20.field224] = var33.field3117;
                        class176.field2796[class20.field224] = var33.field3146;
                        class176.field2782[class20.field224] = var33.field3057;
                        class176.field2798[class20.field224] = var33.field3062;
                        class20.field224++;
                    }
                    int var34 = class244.field4188[1] + arg5;
                    int var45;
                    if (var33.field3090 || class504.field7348 >= var33.field3056) {
                        var45 = var34 - Math.max(class84.field1467.field5218, class175.field2776[0].method210());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field7422;
                            if (var37 == -1) {
                                var37 = var33.method1308(-13076).field815;
                            }
                        } else {
                            class166 var38 = class435.field6489[var8[var9]];
                            var37 = var33.method1308(-13076).field815;
                            if (var38.field2649) {
                                var36 = 2;
                            }
                        }
                        class138[] var39 = class175.field2776;
                        if (var37 != -1) {
                            class138[] var40 = (class138[]) class462.field6872.method1593((byte) -39, (long) var37);
                            if (var40 == null) {
                                class523[] var41 = class523.method3090(class536.field7881, var37, 0);
                                if (var41 != null) {
                                    var40 = new class138[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class305.field4873.method837(var41[var42], true);
                                    }
                                    class462.field6872.method1595(var40, (long) var37, (byte) -102);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class138 var43 = var39[0];
                        class138 var44 = var39[var36];
                        var45 = var34 - Math.max(class84.field1467.field5218, var43.method210());
                        int var46 = class244.field4188[0] + arg6 - (var43.method204() >> 1);
                        int var47 = var43.method204() * var33.field3119 / 255;
                        if (var33.field3119 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method1039(var46, var45);
                        class305.field4873.method868(var46, var45, var46 + var47, var43.method210() + var45);
                        var44.method1039(var46, var45);
                        class305.field4873.method829(arg6, arg5, arg3 + arg6, arg4 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field3090) {
                        if (var33.field3141 > class504.field7348) {
                            class138 var48 = class510.field7480[var33.field3106 ? 2 : 0];
                            class138 var49 = class510.field7480[var33.field3106 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class265) {
                                var51 = var32.field7406;
                                if (var51 == -1) {
                                    var51 = var33.method1308(-13076).field774;
                                }
                            } else {
                                var51 = var33.method1308(-13076).field774;
                            }
                            if (var51 != -1) {
                                class138[] var52 = (class138[]) class115.field2049.method1593((byte) 121, (long) var51);
                                if (var52 == null) {
                                    class523[] var53 = class523.method3090(class536.field7881, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class138[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class305.field4873.method837(var53[var54], true);
                                        }
                                        class115.field2049.method1595(var52, (long) var51, (byte) -111);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field3106 ? 2 : 0];
                                    var49 = var52[var33.field3106 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field3141 - class504.field7348;
                            int var56;
                            if (var55 <= var33.field3103) {
                                var56 = var48.method204();
                            } else {
                                int var57 = var55 - var33.field3103;
                                int var58 = var33.field3061 == 0 ? 0 : (var33.field3108 - var57) / var33.field3061 * var33.field3061;
                                var56 = var58 * var48.method204() / var33.field3108;
                            }
                            int var59 = var48.method210();
                            var45 -= var59;
                            int var60 = class244.field4188[0] + arg6 - (var48.method204() >> 1);
                            var48.method1039(var60, var45);
                            class305.field4873.method868(var60, var45, var60 + var56, var45 - -var59);
                            var49.method1039(var60, var45);
                            var45 -= 2;
                            class305.field4873.method829(arg6, arg5, arg3 + arg6, arg5 - -arg4);
                        }
                        if (var7 > var9) {
                            class166 var61 = (class166) var33;
                            if (var61.field2626 != -1) {
                                var45 -= 25;
                                class327.field5154[var61.field2626].method1039(arg6 + class244.field4188[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field2639 != -1) {
                                var45 -= 25;
                                class123.field2157[var61.field2639].method1039(class244.field4188[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field7475 >= 0 && class123.field2157.length > var32.field7475) {
                            var45 -= 25;
                            class138 var62 = class123.field2157[var32.field7475];
                            var62.method1039(arg6 - ((var62.method204() >> 1) - class244.field4188[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class166)) {
                        int var63 = 0;
                        class475[] var64 = class413.field6289;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class475 var67 = var64[var65];
                            if (var67 != null && var67.field7032 == 1 && class371.field5734[var9 - var7] == var67.field7037) {
                                class138 var68 = class439.field6564[var67.field7029];
                                if (var63 < var68.method210()) {
                                    var63 = var68.method210();
                                }
                                if ((class504.field7348 % 20) < 10) {
                                    var68.method1039(class244.field4188[0] + arg6 - 12, -var68.method210() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class475[] var70 = class413.field6289;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class475 var73 = var70[var71];
                            if (var73 != null && var73.field7032 == 10 && var8[var9] == var73.field7037) {
                                class138 var74 = class439.field6564[var73.field7029];
                                if (var74.method210() > var69) {
                                    var69 = var74.method210();
                                }
                                var74.method1039(arg6 + class244.field4188[0] - 12, -var74.method210() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (var33.field3074[var75] > class504.field7348) {
                            int var76 = var33.method1307(-123) / 2;
                            class499.method2955(arg4 >> 1, -10480, var33, var76, arg0, arg1, arg3 >> 1);
                            if (class244.field4188[0] > -1) {
                                int var77 = class46.field741[var33.field3134[var75]].method204();
                                if (var75 == 1) {
                                    class244.field4188[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class244.field4188[1] -= 10;
                                    class244.field4188[0] -= var77 - 9;
                                }
                                if (var75 == 3) {
                                    class244.field4188[0] += var77 - 9;
                                    class244.field4188[1] -= 10;
                                }
                                class46.field741[var33.field3134[var75]].method1039(class244.field4188[0] + arg6 - (var77 >> 1), class244.field4188[1] + -12 + arg5);
                                class151.field2423.method1897(class244.field4188[0] + arg6 - 1, arg5 - -class244.field4188[1] + 3, -1, Integer.toString(var33.field3139[var75]), 24244, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class191.field2974; var10++) {
            int var28 = class209.field3312[var10];
            class197 var29;
            if (var28 >= 2048) {
                var29 = ((class505) class147.field2396.method2516((long) (var28 - 2048), -1)).field7355;
            } else {
                var29 = class435.field6489[var28];
            }
            int var30 = class477.field7056[var10];
            class197 var31;
            if (var30 < 2048) {
                var31 = class435.field6489[var30];
            } else {
                var31 = ((class505) class147.field2396.method2516((long) (var30 - 2048), -1)).field7355;
            }
            class167.method1152(arg1, arg3, var31, arg0, arg6, --var29.field3095, -3073, arg4, var29, arg5);
        }
        if (arg2 >= -47) {
            method1732(62, -33, -72, -5, -56, -83, -2);
        }
        int var11 = class84.field1467.field5218 - (-class84.field1467.field5202 - 2);
        for (int var12 = 0; var12 < class20.field224; var12++) {
            int var13 = class176.field2799[var12];
            int var14 = class176.field2790[var12];
            int var15 = class176.field2800[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class176.field2790[var27] - var11) && var14 - var11 < class176.field2790[var27] - -2 && (var13 - var15) < (class176.field2800[var27] + class176.field2799[var27]) && (class176.field2799[var27] - class176.field2800[var27]) < (var13 + var15) && var14 > class176.field2790[var27] - var11) {
                        var16 = true;
                        var14 = class176.field2790[var27] - var11;
                    }
                }
            }
            class176.field2790[var12] = var14;
            String var17 = class176.field2798[var12];
            if (class290.field4729 == 0) {
                int var18 = 16776960;
                if (class176.field2780[var12] < 6) {
                    var18 = class131.field2245[class176.field2780[var12]];
                }
                if (class176.field2780[var12] == 6) {
                    var18 = (class536.field7878 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class176.field2780[var12] == 7) {
                    var18 = class536.field7878 % 20 < 10 ? 255 : 65535;
                }
                if (class176.field2780[var12] == 8) {
                    var18 = class536.field7878 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class176.field2780[var12] == 9) {
                    int var19 = 150 - class176.field2782[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = ((var19 - 100) * 5) + 65280;
                    }
                }
                if (class176.field2780[var12] == 10) {
                    int var20 = 150 - class176.field2782[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16384000 + 16711935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + (255 - (var20 * 5 - 500));
                    }
                }
                if (class176.field2780[var12] == 11) {
                    int var21 = 150 - class176.field2782[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class176.field2796[var12] == 0) {
                    class127.field2188.method1897(arg6 + var13, arg5 - -var14, var22, var17, 24244, -16777216);
                }
                if (class176.field2796[var12] == 1) {
                    class127.field2188.method1905(var22, var17, -28597, class536.field7878, arg5 + var14, -16777216, arg6 + var13);
                }
                if (class176.field2796[var12] == 2) {
                    class127.field2188.method1893(-16777216, class536.field7878, -1, var17, arg6 + var13, arg5 + var14, var22);
                }
                if (class176.field2796[var12] == 3) {
                    class127.field2188.method1908(var17, arg5 + var14, var22, 150 - class176.field2782[var12], class536.field7878, -16777216, -120, arg6 + var13);
                }
                if (class176.field2796[var12] == 4) {
                    int var23 = (150 - class176.field2782[var12]) * (class84.field1467.method2085((byte) -84, var17) + 100) / 150;
                    class305.field4873.method868(arg6 + var13 - 50, arg5, arg6 + var13 + 50, arg4 + arg5);
                    class127.field2188.method1903(-16777216, var13 + arg6 + 50 - var23, arg5 + var14, 0, var22, var17);
                    class305.field4873.method829(arg6, arg5, arg3 + arg6, arg4 + arg5);
                }
                if (class176.field2796[var12] == 5) {
                    int var24 = 150 - class176.field2782[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class84.field1467.field5218 + class84.field1467.field5202;
                    class305.field4873.method868(arg6, arg5 + var14 - var26 - 1, arg3 + arg6, arg5 - (-var14 - 5));
                    class127.field2188.method1897(arg6 + var13, var14 + var25 + arg5, var22, var17, 24244, -16777216);
                    class305.field4873.method829(arg6, arg5, arg6 + arg3, arg4 + arg5);
                }
            } else {
                class127.field2188.method1897(arg6 + var13, arg5 + var14, -256, var17, 24244, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1733(int arg0) {
        field4333 = null;
        if (arg0 <= 5) {
            field4334 = 64L;
        }
    }
}
