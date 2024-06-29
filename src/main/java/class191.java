import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class191 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lve;")
    private static class255 field3053 = class87.method607(81, "Loading config )2 ");

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lve;")
    public static class255 field3056 = class87.method607(81, "<col=ff0000>");

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lve;")
    public static class255 field3050 = field3053;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method1312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class265.field4488 = 0;
        for (int var7 = -1; var7 < class309.field5269 + class282.field4858; var7++) {
            class301 var8;
            if (var7 == -1) {
                var8 = class276.field4742;
            } else if (var7 >= class309.field5269) {
                var8 = class82.field1334[class84.field1356[var7 - class309.field5269]];
            } else {
                var8 = class151.field2555[class259.field4398[var7]];
            }
            if (var8 != null && var8.method1302(1)) {
                if (var8 instanceof class186) {
                    class236 var9 = ((class186) var8).field2996;
                    if (var9.field3893 != null) {
                        var9 = var9.method1628(arg6 - 768665417);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class309.field5269 <= var7) {
                    class236 var10 = ((class186) var8).field2996;
                    if (var10.field3893 != null) {
                        var10 = var10.method1628(79);
                    }
                    if (var10.field3908 >= 0 && class24.field368.length > var10.field3908) {
                        int var11;
                        if (var10.field3896 == -1) {
                            var11 = var8.method2097((byte) 66) + 15;
                        } else {
                            var11 = var10.field3896 + 15;
                        }
                        class280.method1947(var11, arg3, arg6 - 768665601, arg5 >> 1, arg2 >> 1, var8, arg0);
                        if (class236.field3874 > -1) {
                            class24.field368[var10.field3908].method291(arg4 + class236.field3874 - 12, class152.field2573 + arg1 - 30);
                        }
                    }
                    int var12 = 0;
                    class190[] var13 = class108.field1824;
                    while (var13.length > var12) {
                        class190 var14 = var13[var12];
                        if (var14 != null && var14.field3034 == 1 && class84.field1356[var7 - class309.field5269] == var14.field3040 && (class277.field4768 % 20) < 10) {
                            int var15;
                            if (var10.field3896 == -1) {
                                var15 = var8.method2097((byte) 66) + 15;
                            } else {
                                var15 = var10.field3896 + 15;
                            }
                            class280.method1947(var15, arg3, -64, arg5 >> 1, arg2 >> 1, var8, arg0);
                            if (class236.field3874 > -1) {
                                class127.field2095[var14.field3039].method291(arg4 - (12 - class236.field3874), class152.field2573 + arg1 + -28);
                            }
                        }
                        var12++;
                    }
                } else {
                    int var16 = 30;
                    class242 var17 = (class242) var8;
                    if (var17.field4048 != -1 || var17.field4083 != -1) {
                        class280.method1947(var8.method2097((byte) 66) + 15, arg3, -64, arg5 >> 1, arg2 >> 1, var8, arg0);
                        if (class236.field3874 > -1) {
                            if (var17.field4048 != -1) {
                                class81.field1313[var17.field4048].method291(arg4 + class236.field3874 - 12, arg1 - -class152.field2573 + -var16);
                                var16 += 25;
                            }
                            if (var17.field4083 != -1) {
                                class24.field368[var17.field4083].method291(class236.field3874 + arg4 - 12, arg1 - -class152.field2573 + -var16);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class190[] var18 = class108.field1824;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class190 var20 = var18[var19];
                            if (var20 != null && var20.field3034 == 10 && class259.field4398[var7] == var20.field3040) {
                                class280.method1947(var8.method2097((byte) 66) + 15, arg3, -64, arg5 >> 1, arg2 >> 1, var8, arg0);
                                if (class236.field3874 > -1) {
                                    class127.field2095[var20.field3039].method291(class236.field3874 + arg4 - 12, class152.field2573 + arg1 + -var16);
                                }
                            }
                        }
                    }
                }
                if (var8.field5132 != null && (var7 >= class309.field5269 || class111.field1874 == 0 || class111.field1874 == 3 || class111.field1874 == 1 && class247.method1703(((class242) var8).field4068, arg6 - 768650129))) {
                    class280.method1947(var8.method2097((byte) 66), arg3, -64, arg5 >> 1, arg2 >> 1, var8, arg0);
                    if (class236.field3874 > -1 && class265.field4488 < class107.field1804) {
                        class107.field1806[class265.field4488] = class277.field4761.method498(var8.field5132) / 2;
                        class107.field1801[class265.field4488] = class277.field4761.field1122;
                        class107.field1805[class265.field4488] = class236.field3874;
                        class107.field1795[class265.field4488] = class152.field2573;
                        class107.field1788[class265.field4488] = var8.field5115;
                        class107.field1802[class265.field4488] = var8.field5170;
                        class107.field1792[class265.field4488] = var8.field5168;
                        class107.field1808[class265.field4488] = var8.field5132;
                        class265.field4488++;
                    }
                }
                if (class277.field4768 < var8.field5141) {
                    class269 var21 = class59.field894[0];
                    class269 var22 = class59.field894[1];
                    int var23;
                    if ((var8 instanceof class186)) {
                        class186 var24 = (class186) var8;
                        class269[] var25 = (class269[]) ((class269[]) class53.field820.method558((long) var24.field2996.field3892, true));
                        if (var25 == null) {
                            var25 = class274.method1926(-30884, class220.field3707, 0, var24.field2996.field3892);
                            if (var25 != null) {
                                class53.field820.method555(var25, (long) var24.field2996.field3892, 0);
                            }
                        }
                        class236 var26 = var24.field2996;
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        if (var26.field3896 == -1) {
                            var23 = var8.method2097((byte) 66);
                        } else {
                            var23 = var26.field3896;
                        }
                    } else {
                        var23 = var8.method2097((byte) 66);
                    }
                    class280.method1947(var23 + var21.field4628 + 10, arg3, -64, arg5 >> 1, arg2 >> 1, var8, arg0);
                    if (class236.field3874 > -1) {
                        int var27 = arg4 - ((var21.field4619 >> 1) - class236.field3874);
                        int var28 = class152.field2573 + arg1 - 3;
                        var21.method291(var27, var28);
                        int var29 = var8.field5119 * var21.field4619 / 255;
                        int var30 = var21.field4628;
                        if (class281.field4827) {
                            class126.method934(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class175.method1251(var27, var28, var27 + var29, var28 - -var30);
                        }
                        var22.method291(var27, var28);
                        if (class281.field4827) {
                            class126.method938(arg4, arg1, arg2 + arg4, arg1 + arg5);
                        } else {
                            class175.method1258(arg4, arg1, arg2 + arg4, arg1 - -arg5);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field5136[var31] > class277.field4768) {
                        int var34;
                        if (var8 instanceof class186) {
                            class186 var32 = (class186) var8;
                            class236 var33 = var32.field2996;
                            if (var33.field3896 == -1) {
                                var34 = var8.method2097((byte) 66) / 2;
                            } else {
                                var34 = var33.field3896 / 2;
                            }
                        } else {
                            var34 = var8.method2097((byte) 66) / 2;
                        }
                        class280.method1947(var34, arg3, -64, arg5 >> 1, arg2 >> 1, var8, arg0);
                        if (class236.field3874 > -1) {
                            if (var31 == 1) {
                                class152.field2573 -= 20;
                            }
                            if (var31 == 2) {
                                class236.field3874 -= 15;
                                class152.field2573 -= 10;
                            }
                            if (var31 == 3) {
                                class152.field2573 -= 10;
                                class236.field3874 += 15;
                            }
                            class7.field103[var8.field5179[var31]].method291(arg4 + class236.field3874 - 12, arg1 - (-class152.field2573 - -12));
                            class6.field82.method497(class215.method1532(var8.field5150[var31], true), class236.field3874 + arg4 - 1, class152.field2573 + arg1 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field3054++;
        if (arg6 != 768665537) {
            return;
        }
        for (int var35 = 0; var35 < class265.field4488; var35++) {
            int var36 = class107.field1805[var35];
            int var37 = class107.field1795[var35];
            boolean var38 = true;
            int var39 = class107.field1806[var35];
            int var40 = class107.field1801[var35];
            while (var38) {
                var38 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class107.field1795[var41] - class107.field1801[var41] < var37 + 2 && (class107.field1795[var41] + 2) > (var37 - var40) && var36 - var39 < class107.field1805[var41] - -class107.field1806[var41] && (var36 + var39) > (class107.field1805[var41] - class107.field1806[var41]) && var37 > class107.field1795[var41] - class107.field1801[var41]) {
                        var38 = true;
                        var37 = class107.field1795[var41] - class107.field1801[var41];
                    }
                }
            }
            class236.field3874 = class107.field1805[var35];
            class152.field2573 = class107.field1795[var35] = var37;
            class255 var42 = class107.field1808[var35];
            if (class260.field4414 == 0) {
                int var43 = 16776960;
                if (class107.field1788[var35] < 6) {
                    var43 = class9.field134[class107.field1788[var35]];
                }
                if (class107.field1788[var35] == 6) {
                    var43 = (class93.field1600 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class107.field1788[var35] == 7) {
                    var43 = (class93.field1600 % 20) < 10 ? 255 : 65535;
                }
                if (class107.field1788[var35] == 8) {
                    var43 = class93.field1600 % 20 < 10 ? 45056 : 8454016;
                }
                if (class107.field1788[var35] == 9) {
                    int var44 = 150 - class107.field1792[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 + 16384000 - var44 * 327680;
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class107.field1788[var35] == 10) {
                    int var45 = 150 - class107.field1792[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 * 327680 - 16384000);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 500 - (var45 * 5 - 255) - 32768000;
                    }
                }
                if (class107.field1788[var35] == 11) {
                    int var46 = 150 - class107.field1792[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 - 16318970;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class107.field1802[var35] == 0) {
                    class277.field4761.method497(var42, arg4 + class236.field3874, class152.field2573 + arg1, var43, 0);
                }
                if (class107.field1802[var35] == 1) {
                    class277.field4761.method510(var42, class236.field3874 + arg4, arg1 - -class152.field2573, var43, 0, class93.field1600);
                }
                if (class107.field1802[var35] == 2) {
                    class277.field4761.method492(var42, class236.field3874 + arg4, class152.field2573 + arg1, var43, 0, class93.field1600);
                }
                if (class107.field1802[var35] == 3) {
                    class277.field4761.method493(var42, class236.field3874 + arg4, class152.field2573 + arg1, var43, 0, class93.field1600, 150 - class107.field1792[var35]);
                }
                if (class107.field1802[var35] == 4) {
                    int var47 = (150 - class107.field1792[var35]) * (class277.field4761.method498(var42) + 100) / 150;
                    if (class281.field4827) {
                        class126.method934(class236.field3874 + arg4 - 50, arg1, class236.field3874 + arg4 + 50, arg1 + arg5);
                    } else {
                        class175.method1251(arg4 + class236.field3874 - 50, arg1, class236.field3874 + arg4 + 50, arg1 + arg5);
                    }
                    class277.field4761.method494(var42, arg4 + class236.field3874 + 50 - var47, class152.field2573 + arg1, var43, 0);
                    if (class281.field4827) {
                        class126.method938(arg4, arg1, arg2 + arg4, arg1 - -arg5);
                    } else {
                        class175.method1258(arg4, arg1, arg2 + arg4, arg1 + arg5);
                    }
                }
                if (class107.field1802[var35] == 5) {
                    int var48 = 150 - class107.field1792[var35];
                    if (class281.field4827) {
                        class126.method934(arg4, class152.field2573 + arg1 - class277.field4761.field1122 - 1, arg4 - -arg2, arg1 + class152.field2573 + 5);
                    } else {
                        class175.method1251(arg4, class152.field2573 + arg1 - class277.field4761.field1122 - 1, arg4 - -arg2, arg1 + class152.field2573 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class277.field4761.method497(var42, arg4 + class236.field3874, class152.field2573 + arg1 - -var49, var43, 0);
                    if (class281.field4827) {
                        class126.method938(arg4, arg1, arg2 + arg4, arg1 + arg5);
                    } else {
                        class175.method1258(arg4, arg1, arg2 + arg4, arg1 + arg5);
                    }
                }
            } else {
                class277.field4761.method497(var42, arg4 + class236.field3874, class152.field2573 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILpb;)V", line = 528)
    public static final void method1313(int arg0, class70 arg1) {
        field3055++;
        int var2 = 79 / ((arg0 + 39) / 39);
        if (class2.field28 != null) {
            try {
                class2.field28.method2130(0L, true);
                class2.field28.method2129(arg1.field1068, -1, 24, arg1.field1066);
            } catch (Exception var4) {
            }
        }
        arg1.field1068 += 24;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 550)
    public static void method1314(boolean arg0) {
        field3056 = null;
        field3050 = null;
        if (arg0) {
            method1312(1, -52, 127, -108, 34, -100, 106);
        }
        field3053 = null;
    }
}
