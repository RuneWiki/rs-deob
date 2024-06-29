import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class97 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[[I")
    public static int[][] field1426 = new int[104][104];

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lok;")
    public static class41 field1427 = class137.method956(" zuerst von Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "[I")
    public static int[] field1430;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[[[Lnh;")
    public static class308[][][] field1425;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V", line = 8)
    public static final void method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 20861) {
            return;
        }
        field1420++;
        class33.field491 = 0;
        for (int var7 = -1; var7 < field1419 + class85.field1248; var7++) {
            class268 var8;
            if (var7 == -1) {
                var8 = class62.field913;
            } else if (class85.field1248 > var7) {
                var8 = class246.field3955[class118.field1737[var7]];
            } else {
                var8 = class216.field3471[class101.field1441[var7 - class85.field1248]];
            }
            if (var8 != null && var8.method351(true)) {
                if (var8 instanceof class50) {
                    class147 var9 = ((class50) var8).field758;
                    if (var9.field2284 != null) {
                        var9 = var9.method1015(-1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class85.field1248) {
                    class147 var10 = ((class50) var8).field758;
                    if (var10.field2284 != null) {
                        var10 = var10.method1015(-1);
                    }
                    if (var10.field2250 >= 0 && class2.field16.length > var10.field2250) {
                        int var11;
                        if (var10.field2279 == -1) {
                            var11 = var8.method1902(false) + 15;
                        } else {
                            var11 = var10.field2279 + 15;
                        }
                        class299.method2062(var11, (byte) -59, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                        if (class191.field3095 > -1) {
                            class2.field16[var10.field2250].method83(arg4 + class191.field3095 - 12, arg0 - -class123.field1835 - 30);
                        }
                    }
                    class162[] var12 = class35.field529;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class162 var14 = var12[var13];
                        if (var14 != null && var14.field2584 == 1 && class101.field1441[var7 - class85.field1248] == var14.field2571 && (class18.field234 % 20) < 10) {
                            int var15;
                            if (var10.field2279 == -1) {
                                var15 = var8.method1902(false) + 15;
                            } else {
                                var15 = var10.field2279 + 15;
                            }
                            class299.method2062(var15, (byte) 63, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                            if (class191.field3095 > -1) {
                                class277.field4538[var14.field2583].method83(arg4 + class191.field3095 - 12, arg0 - (-class123.field1835 + 28));
                            }
                        }
                    }
                } else {
                    int var16 = 30;
                    class245 var17 = (class245) var8;
                    if (var17.field3917 != -1 || var17.field3928 != -1) {
                        class299.method2062(var8.method1902(false) + 15, (byte) 26, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                        if (class191.field3095 > -1) {
                            if (var17.field3917 != -1) {
                                class23.field364[var17.field3917].method83(arg4 + class191.field3095 - 12, arg0 - var16 + class123.field1835);
                                var16 += 25;
                            }
                            if (var17.field3928 != -1) {
                                class2.field16[var17.field3928].method83(class191.field3095 + arg4 - 12, -var16 + class123.field1835 + arg0);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class162[] var18 = class35.field529;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class162 var20 = var18[var19];
                            if (var20 != null && var20.field2584 == 10 && class118.field1737[var7] == var20.field2571) {
                                class299.method2062(var8.method1902(false) + 15, (byte) -95, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                                if (class191.field3095 > -1) {
                                    class277.field4538[var20.field2583].method83(arg4 - (12 - class191.field3095), class123.field1835 + arg0 - var16);
                                }
                            }
                        }
                    }
                }
                if (var8.field4275 != null && (class85.field1248 <= var7 || class9.field126 == 0 || class9.field126 == 3 || class9.field126 == 1 && class153.method1091(((class245) var8).field3933, 0))) {
                    class299.method2062(var8.method1902(false), (byte) 27, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                    if (class191.field3095 > -1 && class33.field491 < class161.field2562) {
                        class161.field2551[class33.field491] = class140.field2165.method1794(var8.field4275) / 2;
                        class161.field2542[class33.field491] = class140.field2165.field4043;
                        class161.field2561[class33.field491] = class191.field3095;
                        class161.field2540[class33.field491] = class123.field1835;
                        class161.field2547[class33.field491] = var8.field4301;
                        class161.field2553[class33.field491] = var8.field4305;
                        class161.field2570[class33.field491] = var8.field4283;
                        class161.field2569[class33.field491] = var8.field4275;
                        class33.field491++;
                    }
                }
                if (class18.field234 < var8.field4329) {
                    class199 var21 = class110.field1566[1];
                    class199 var22 = class110.field1566[0];
                    int var26;
                    if (var8 instanceof class50) {
                        class50 var23 = (class50) var8;
                        class199[] var24 = (class199[]) ((class199[]) class245.field3914.method136((long) var23.field758.field2265, true));
                        if (var24 == null) {
                            var24 = class79.method566(class212.field3423, false, var23.field758.field2265, 0);
                            if (var24 != null) {
                                class245.field3914.method132((long) var23.field758.field2265, var24, -1);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[0];
                            var21 = var24[1];
                        }
                        class147 var25 = var23.field758;
                        if (var25.field2279 == -1) {
                            var26 = var8.method1902(false);
                        } else {
                            var26 = var25.field2279;
                        }
                    } else {
                        var26 = var8.method1902(false);
                    }
                    class299.method2062(var22.field3189 + var26 + 10, (byte) -112, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                    if (class191.field3095 > -1) {
                        int var27 = class123.field1835 + arg0 - 3;
                        int var28 = arg4 - ((var22.field3200 >> 1) - class191.field3095);
                        var22.method83(var28, var27);
                        int var29 = var22.field3189;
                        int var30 = var8.field4340 * var22.field3200 / 255;
                        if (class166.field2625) {
                            class190.method1357(var28, var27, var28 + var30, var27 + var29);
                        } else {
                            class54.method373(var28, var27, var28 + var30, var27 + var29);
                        }
                        var21.method83(var28, var27);
                        if (class166.field2625) {
                            class190.method1369(arg4, arg0, arg1 + arg4, arg0 + arg6);
                        } else {
                            class54.method375(arg4, arg0, arg1 + arg4, arg0 + arg6);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field4323[var31] > class18.field234) {
                        int var32;
                        if ((var8 instanceof class50)) {
                            class50 var33 = (class50) var8;
                            class147 var34 = var33.field758;
                            if (var34.field2279 == -1) {
                                var32 = var8.method1902(false) / 2;
                            } else {
                                var32 = var34.field2279 / 2;
                            }
                        } else {
                            var32 = var8.method1902(false) / 2;
                        }
                        class299.method2062(var32, (byte) -114, var8, arg3, arg2, arg6 >> 1, arg1 >> 1);
                        if (class191.field3095 > -1) {
                            if (var31 == 1) {
                                class123.field1835 -= 20;
                            }
                            if (var31 == 2) {
                                class191.field3095 -= 15;
                                class123.field1835 -= 10;
                            }
                            if (var31 == 3) {
                                class191.field3095 += 15;
                                class123.field1835 -= 10;
                            }
                            class139.field2132[var8.field4325[var31]].method83(arg4 + class191.field3095 - 12, arg0 - (-class123.field1835 - -12));
                            class48.field749.method1785(class1.method4(var8.field4281[var31], (byte) 51), class191.field3095 + arg4 - 1, class123.field1835 + arg0 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class33.field491; var35++) {
            int var36 = class161.field2561[var35];
            int var37 = class161.field2542[var35];
            boolean var38 = true;
            int var39 = class161.field2551[var35];
            int var40 = class161.field2540[var35];
            while (var38) {
                var38 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var40 + 2) > (class161.field2540[var41] - class161.field2542[var41]) && class161.field2540[var41] + 2 > -var37 + var40 && (class161.field2561[var41] + class161.field2551[var41]) > (var36 - var39) && (var36 + var39) > (class161.field2561[var41] - class161.field2551[var41]) && (class161.field2540[var41] - class161.field2542[var41]) < var40) {
                        var38 = true;
                        var40 = class161.field2540[var41] - class161.field2542[var41];
                    }
                }
            }
            class191.field3095 = class161.field2561[var35];
            class123.field1835 = class161.field2540[var35] = var40;
            class41 var42 = class161.field2569[var35];
            if (class116.field1689 == 0) {
                int var43 = 16776960;
                if (class161.field2547[var35] < 6) {
                    var43 = class118.field1729[class161.field2547[var35]];
                }
                if (class161.field2547[var35] == 6) {
                    var43 = class112.field1646 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class161.field2547[var35] == 7) {
                    var43 = (class112.field1646 % 20) >= 10 ? 65535 : 255;
                }
                if (class161.field2547[var35] == 8) {
                    var43 = (class112.field1646 % 20) < 10 ? 45056 : 8454016;
                }
                if (class161.field2547[var35] == 9) {
                    int var44 = 150 - class161.field2570[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class161.field2547[var35] == 10) {
                    int var45 = 150 - class161.field2570[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 + 16711935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = ((var45 - 100) * 327680) + 255 - ((var45 - 100) * 5);
                    }
                }
                if (class161.field2547[var35] == 11) {
                    int var46 = 150 - class161.field2570[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = -(-(var46 * 327685) - 65280) - 16384250;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class161.field2553[var35] == 0) {
                    class140.field2165.method1785(var42, arg4 + class191.field3095, class123.field1835 + arg0, var43, 0);
                }
                if (class161.field2553[var35] == 1) {
                    class140.field2165.method1801(var42, class191.field3095 + arg4, class123.field1835 + arg0, var43, 0, class112.field1646);
                }
                if (class161.field2553[var35] == 2) {
                    class140.field2165.method1799(var42, class191.field3095 + arg4, arg0 - -class123.field1835, var43, 0, class112.field1646);
                }
                if (class161.field2553[var35] == 3) {
                    class140.field2165.method1787(var42, class191.field3095 + arg4, arg0 - -class123.field1835, var43, 0, class112.field1646, 150 - class161.field2570[var35]);
                }
                if (class161.field2553[var35] == 4) {
                    int var47 = (150 - class161.field2570[var35]) * (class140.field2165.method1794(var42) + 100) / 150;
                    if (class166.field2625) {
                        class190.method1357(class191.field3095 + arg4 - 50, arg0, class191.field3095 + arg4 + 50, arg0 + arg6);
                    } else {
                        class54.method373(arg4 + class191.field3095 - 50, arg0, arg4 + class191.field3095 + 50, arg0 + arg6);
                    }
                    class140.field2165.method1788(var42, arg4 + class191.field3095 + 50 - var47, class123.field1835 + arg0, var43, 0);
                    if (class166.field2625) {
                        class190.method1369(arg4, arg0, arg1 + arg4, arg0 + arg6);
                    } else {
                        class54.method375(arg4, arg0, arg4 + arg1, arg0 + arg6);
                    }
                }
                if (class161.field2553[var35] == 5) {
                    int var48 = 150 - class161.field2570[var35];
                    if (class166.field2625) {
                        class190.method1357(arg4, arg0 - (class140.field2165.field4043 - class123.field1835) - 1, arg1 + arg4, class123.field1835 + arg0 + 5);
                    } else {
                        class54.method373(arg4, class123.field1835 + arg0 - class140.field2165.field4043 - 1, arg1 + arg4, arg0 + class123.field1835 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class140.field2165.method1785(var42, arg4 + class191.field3095, arg0 + var49 + class123.field1835, var43, 0);
                    if (class166.field2625) {
                        class190.method1369(arg4, arg0, arg4 + arg1, arg0 + arg6);
                    } else {
                        class54.method375(arg4, arg0, arg1 + arg4, arg0 + arg6);
                    }
                }
            } else {
                class140.field2165.method1785(var42, class191.field3095 + arg4, class123.field1835 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V", line = 512)
    public static final void method697(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            field1425 = (class308[][][]) ((class308[][][]) null);
        }
        field1428++;
        if ((arg4 - arg3) >= class273.field4449 && (arg4 + arg3) <= class153.field2439 && (arg0 - arg3) >= class15.field192 && class237.field3801 >= arg0 + arg3) {
            class203.method1438(arg0, arg4, arg1, arg2 + 897785857, arg3);
        } else {
            class194.method1395(arg2 + 353679137, arg1, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 529)
    public static void method698(byte arg0) {
        field1425 = (class308[][][]) null;
        field1427 = null;
        field1426 = (int[][]) null;
        field1430 = null;
        if (arg0 < 51) {
            field1426 = (int[][]) ((int[][]) null);
        }
    }
}
