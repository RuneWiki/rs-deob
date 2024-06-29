import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class62 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "J")
    public static volatile long field975 = 0L;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lik;")
    public static class267 field980 = new class267(50);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lrf;")
    public static class289 field985;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lmc;")
    public static final class201 method415(byte arg0) {
        field984++;
        if (arg0 != -39) {
            field985 = null;
        }
        int var1 = class82.field1312[0] * class220.field3315[0];
        byte[] var2 = class10.field129[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class183.field2775[class94.method598(255, var2[var4])];
        }
        class201 var5 = new class201(class162.field2494, class256.field3915, class10.field139[0], class273.field4104[0], class220.field3315[0], class82.field1312[0], var3);
        class82.method537(0);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[Lrf;IIIIIIII)V")
    public static final void method416(int arg0, class289[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class111.method716(arg6, arg9, arg2, arg0);
        class249.method1623();
        field978++;
        if (arg3 != -22614) {
            field980 = null;
        }
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class289 var11 = arg1[var10];
            if (var11 != null && (var11.field4451 == arg8 || arg8 == -1412584499 && class276.field4158 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class101.field1593[class256.field3900] = var11.field4468 + arg4;
                    class283.field4236[class256.field3900] = var11.field4525 + arg7;
                    class160.field2460[class256.field3900] = var11.field4478;
                    class32.field471[class256.field3900] = var11.field4444;
                    var12 = class256.field3900++;
                } else {
                    var12 = arg5;
                }
                var11.field4400 = var12;
                var11.field4508 = class270.field4058;
                if (!var11.field4495 || !client.method967(var11)) {
                    if (var11.field4496 > 0) {
                        class27.method170((byte) 93, var11);
                    }
                    int var13 = var11.field4468 + arg4;
                    int var14 = var11.field4525 + arg7;
                    int var15 = var11.field4501;
                    if (class64.field1009 && (client.method972(var11).field4049 != 0 || var11.field4394 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class276.field4158 == var11) {
                        if (arg8 != -1412584499 && !var11.field4535) {
                            class70.field1117 = arg7;
                            class250.field3785 = arg1;
                            class258.field3938 = arg4;
                            continue;
                        }
                        if (class262.field3967 && class30.field428) {
                            int var16 = class91.field1438;
                            int var17 = class203.field3065;
                            int var18 = var17 - class183.field2769;
                            if (var18 < class11.field142) {
                                var18 = class11.field142;
                            }
                            int var19 = var16 - class48.field773;
                            if (class11.field142 + class15.field183.field4444 < var11.field4444 + var18) {
                                var18 = class15.field183.field4444 + class11.field142 - var11.field4444;
                            }
                            if (var19 < class173.field2637) {
                                var19 = class173.field2637;
                            }
                            var14 = var18;
                            if (var11.field4478 + var19 > class173.field2637 + class15.field183.field4478) {
                                var19 = class173.field2637 + class15.field183.field4478 - var11.field4478;
                            }
                            var13 = var19;
                        }
                        if (!var11.field4535) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4394 == 2) {
                        var20 = arg2;
                        var21 = arg0;
                        var22 = arg6;
                        var23 = arg9;
                    } else {
                        int var24 = var14 + var11.field4444;
                        var23 = var14 > arg9 ? var14 : arg9;
                        var22 = arg6 >= var13 ? arg6 : var13;
                        int var25 = var11.field4478 + var13;
                        if (var11.field4394 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = var25 < arg2 ? var25 : arg2;
                        var21 = arg0 > var24 ? var24 : arg0;
                    }
                    if (!var11.field4495 || var22 < var20 && var21 > var23) {
                        if (var11.field4496 != 0) {
                            if (var11.field4496 == 1337 || var11.field4496 == 1403) {
                                class154.field2317 = var14;
                                class56.field899 = var11;
                                class75.field1220 = var13;
                                class102.method654(var11.field4496 == 1403, var14, var11.field4444, var11.field4478, var13, (byte) -41);
                                class7.field105[var12] = true;
                                class111.method716(arg6, arg9, arg2, arg0);
                                continue;
                            }
                            if (var11.field4496 == 1338) {
                                if (!var11.method1915((byte) 2)) {
                                    continue;
                                }
                                class4.method15(var11, arg3 ^ 0x5827, var13, var12, var14);
                                class111.method716(arg6, arg9, arg2, arg0);
                                if (class214.field3211 != 0 && class214.field3211 != 3 || class218.field3275 || class223.field3339 < var22 || var23 > class119.field1792 || class223.field3339 >= var20 || var21 <= class119.field1792) {
                                    continue;
                                }
                                int var26 = class223.field3339 - var13;
                                int var27 = class119.field1792 - var14;
                                int var28 = var11.field4417[var27];
                                if (var26 < var28 || var26 > var11.field4427[var27] + var28) {
                                    continue;
                                }
                                int var29 = var26 - var11.field4478 / 2;
                                int var30 = var27 - var11.field4444 / 2;
                                int var31 = (int) class84.field1336 + class154.field2311 & 0x7FF;
                                int var32 = class249.field3767[var31];
                                int var33 = class249.field3781[var31];
                                int var34 = (class82.field1324 + 256) * var32 >> 8;
                                int var35 = (class82.field1324 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = class165.field2537.field2251 + var36 - (class165.field2537.method676(-30217) * 64 + -64) >> 7;
                                int var39 = class165.field2537.field2234 + 64 - var37 - (class165.field2537.method676(-30217) * 64) >> 7;
                                if (class153.field2305 && (class206.field3092 & 0x40) != 0) {
                                    class289 var40 = class66.method450(class116.field1763, 0, class162.field2482);
                                    if (var40 == null) {
                                        class226.method1444(-128);
                                    } else {
                                        client.method957(class289.field4390, var38, (short) 35, 0, 1L, var39, class48.field770, " ->");
                                    }
                                    continue;
                                }
                                if (class166.field2554 == 1) {
                                    client.method957(-1, var38, (short) 21, 0, 1L, var39, class191.field2938, "");
                                }
                                client.method957(-1, var38, (short) 16, 0, 1L, var39, class213.field3189, "");
                                continue;
                            }
                            if (var11.field4496 == 1339) {
                                if (var11.method1915((byte) 2)) {
                                    class32.method208(var14, var11, var13, -118, var12);
                                    class111.method716(arg6, arg9, arg2, arg0);
                                }
                                continue;
                            }
                            if (var11.field4496 == 1400) {
                                class169.method1054(var13, var11.field4444, var14, (byte) -110, var11.field4478);
                                class7.field105[var12] = true;
                                class1.field16[var12] = true;
                                class111.method716(arg6, arg9, arg2, arg0);
                                continue;
                            }
                            if (var11.field4496 == 1401) {
                                class143.method874(var14, var13, var11.field4444, var11.field4478, arg3 + 22539);
                                class7.field105[var12] = true;
                                class1.field16[var12] = true;
                                class111.method716(arg6, arg9, arg2, arg0);
                                continue;
                            }
                            if (var11.field4496 == 1402) {
                                class162.method1003(arg3 ^ 0xFFFFA7AB, var14, var13);
                                class7.field105[var12] = true;
                                class1.field16[var12] = true;
                                continue;
                            }
                            if (var11.field4496 == 1405) {
                                if (!class177.field2703) {
                                    continue;
                                }
                                int var41 = var11.field4478 + var13;
                                int var42 = var14 + 15;
                                class268.field4036.method1018("Fps:" + class232.field3505, var41, var42, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var131 = var42 + 15;
                                int var45 = 0;
                                int var46 = 0;
                                int var47 = 16776960;
                                int var48 = 0;
                                if (var44 > 65536) {
                                    var47 = 16711680;
                                }
                                class268.field4036.method1018("Mem:" + var44 + "k", var41, var131, var47, -1);
                                for (int var49 = 0; var49 < 29; var49++) {
                                    var48 += class49.field786[var49].method1459((byte) -49);
                                    var46 += class49.field786[var49].method1455(-58);
                                    var45 += class49.field786[var49].method1457(0);
                                }
                                int var50 = 16776960;
                                var42 = var131 + 15;
                                int var51 = var45 * 100 / var48;
                                int var52 = var46 * 10000 / var48;
                                String var53 = "Cache:" + class147.method892((long) var52, 0, 2, true, -24421) + "% (" + var51 + "%)";
                                class91.field1435.method1018(var53, var41, var42, var50, -1);
                                var42 += 12;
                                class7.field105[var12] = true;
                                class1.field16[var12] = true;
                                continue;
                            }
                            if (var11.field4496 == 1406) {
                                class93.field1479 = var14;
                                class195.field2966 = var11;
                                class75.field1219 = var13;
                                continue;
                            }
                        }
                        if (!class218.field3275) {
                            if (var11.field4394 == 0 && var11.field4491 && var22 <= class223.field3339 && var23 <= class119.field1792 && class223.field3339 < var20 && var21 > class119.field1792 && !class64.field1009) {
                                class218.field3278 = 1;
                                class84.field1339[0] = 1007;
                                client.field2371[0] = class225.field3379;
                                class199.field3021[0] = class198.field3007;
                                class46.field754[0] = "";
                            }
                            if (var22 <= class223.field3339 && var23 <= class119.field1792 && class223.field3339 < var20 && var21 > class119.field1792) {
                                class281.method1853(false, class223.field3339 - var13, var11, class119.field1792 - var14);
                            }
                        }
                        if (var11.field4394 == 0) {
                            if (!var11.field4495 && client.method967(var11) && class76.field1233 != var11) {
                                continue;
                            }
                            if (!var11.field4495) {
                                if (var11.field4460 > var11.field4558 - var11.field4444) {
                                    var11.field4460 = var11.field4558 - var11.field4444;
                                }
                                if (var11.field4460 < 0) {
                                    var11.field4460 = 0;
                                }
                            }
                            method416(var21, arg1, var20, -22614, var13 - var11.field4396, var12, var22, var14 - var11.field4460, var11.field4504, var23);
                            if (var11.field4472 != null) {
                                method416(var21, var11.field4472, var20, -22614, var13 - var11.field4396, var12, var22, var14 - var11.field4460, var11.field4504, var23);
                            }
                            class199 var54 = (class199) class229.field3449.method1666((long) var11.field4504, (byte) 54);
                            if (var54 != null) {
                                if (var54.field3024 == 0 && !class218.field3275 && var22 <= class223.field3339 && var23 <= class119.field1792 && class223.field3339 < var20 && var21 > class119.field1792 && !class64.field1009) {
                                    client.field2371[0] = class225.field3379;
                                    class199.field3021[0] = class198.field3007;
                                    class46.field754[0] = "";
                                    class218.field3278 = 1;
                                    class84.field1339[0] = 1007;
                                }
                                class196.method1222(var14, var23, var21, var54.field3026, -84, var13, var12, var20, var22);
                            }
                            class111.method716(arg6, arg9, arg2, arg0);
                            class249.method1623();
                        }
                        if (class126.field1909[var12] || class56.field898 > 1) {
                            if (var11.field4394 == 0 && !var11.field4495 && var11.field4558 > var11.field4444) {
                                class259.method1744(var11.field4460, var14, arg3 ^ 0x582E, var13 + var11.field4478, var11.field4558, var11.field4444);
                            }
                            if (var11.field4394 != 1) {
                                if (var11.field4394 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field4561; var56++) {
                                        for (int var57 = 0; var57 < var11.field4493; var57++) {
                                            int var58 = (var11.field4499 + 32) * var57 + var13;
                                            int var59 = (var11.field4442 + 32) * var56 + var14;
                                            if (var55 < 20) {
                                                var58 += var11.field4533[var55];
                                                var59 += var11.field4455[var55];
                                            }
                                            if (var11.field4513[var55] > 0) {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field4513[var55] - 1;
                                                if (var58 + 32 > arg6 && arg2 > var58 && arg9 < var59 + 32 && var59 < arg0 || class251.field3814 == var11 && class53.field869 == var55) {
                                                    class230 var64;
                                                    if (class114.field1738 == 1 && class53.field868 == var55 && class192.field2940 == var11.field4504) {
                                                        var64 = class100.method644(2, (class79) null, var63, var11.field4448[var55], 0, (byte) 38, var11.field4564);
                                                    } else {
                                                        var64 = class100.method644(1, (class79) null, var63, var11.field4448[var55], 3153952, (byte) 38, var11.field4564);
                                                    }
                                                    if (class249.field3783) {
                                                        class7.field105[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class295.method1980(var11, arg3 + 22614);
                                                    } else if (class251.field3814 == var11 && class53.field869 == var55) {
                                                        int var65 = class203.field3065 - class147.field2140;
                                                        int var66 = class91.field1438 - class133.field1947;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class89.field1400 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method1277(var58 + var66, var59 - -var65, 128);
                                                        if (arg8 != -1) {
                                                            class289 var67 = arg1[arg8 & 0xFFFF];
                                                            int var68 = class111.field1714;
                                                            int var69 = class111.field1715;
                                                            if (var68 > (var59 + var65) && var67.field4460 > 0) {
                                                                int var70 = (var68 - var59 - var65) * class180.field2741 / 3;
                                                                if (var70 > (class180.field2741 * 10)) {
                                                                    var70 = class180.field2741 * 10;
                                                                }
                                                                if (var70 > var67.field4460) {
                                                                    var70 = var67.field4460;
                                                                }
                                                                class147.field2140 += var70;
                                                                var67.field4460 -= var70;
                                                                class295.method1980(var67, arg3 + 22614);
                                                            }
                                                            if ((var65 + var59 + 32) > var69 && var67.field4460 < (var67.field4558 - var67.field4444)) {
                                                                int var71 = (var59 - (var69 - var65 - 32)) * class180.field2741 / 3;
                                                                if (var71 > class180.field2741 * 10) {
                                                                    var71 = class180.field2741 * 10;
                                                                }
                                                                if (var71 > (var67.field4558 - var67.field4444 - var67.field4460)) {
                                                                    var71 = var67.field4558 - var67.field4444 - var67.field4460;
                                                                }
                                                                var67.field4460 += var71;
                                                                class147.field2140 -= var71;
                                                                class295.method1980(var67, 0);
                                                            }
                                                        }
                                                    } else if (class241.field3622 == var11 && class246.field3664 == var55) {
                                                        var64.method1277(var58, var59, 128);
                                                    } else {
                                                        var64.method1274(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field4500 != null && var55 < 20) {
                                                class230 var60 = var11.method1924(var55, (byte) -120);
                                                if (var60 != null) {
                                                    var60.method1274(var58, var59);
                                                } else if (class24.field290) {
                                                    class295.method1980(var11, 0);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field4394 == 3) {
                                    int var72;
                                    if (class177.method1095(var11, (byte) -102)) {
                                        var72 = var11.field4429;
                                        if (class76.field1233 == var11 && var11.field4389 != 0) {
                                            var72 = var11.field4389;
                                        }
                                    } else {
                                        var72 = var11.field4402;
                                        if (class76.field1233 == var11 && var11.field4446 != 0) {
                                            var72 = var11.field4446;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4418) {
                                            class111.method702(var13, var14, var11.field4478, var11.field4444, var72);
                                        } else {
                                            class111.method701(var13, var14, var11.field4478, var11.field4444, var72);
                                        }
                                    } else if (var11.field4418) {
                                        class111.method715(var13, var14, var11.field4478, var11.field4444, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class111.method707(var13, var14, var11.field4478, var11.field4444, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4394 == 4) {
                                    class164 var73 = var11.method1917(class143.field2101, (byte) -113);
                                    if (var73 != null) {
                                        String var74 = var11.field4438;
                                        int var75;
                                        if (class177.method1095(var11, (byte) 99)) {
                                            var75 = var11.field4429;
                                            if (class76.field1233 == var11 && var11.field4389 != 0) {
                                                var75 = var11.field4389;
                                            }
                                            if (var11.field4474.length() > 0) {
                                                var74 = var11.field4474;
                                            }
                                        } else {
                                            var75 = var11.field4402;
                                            if (class76.field1233 == var11 && var11.field4446 != 0) {
                                                var75 = var11.field4446;
                                            }
                                        }
                                        if (var11.field4495 && var11.field4566 != -1) {
                                            class43 var76 = class160.method999(var11.field4566, 0);
                                            var74 = var76.field626;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field648 == 1 || var11.field4557 != 1) && var11.field4557 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class200.method1260(var11.field4557, 0);
                                            }
                                        }
                                        if (class224.field3355 == var11) {
                                            var75 = var11.field4402;
                                            var74 = class225.field3367;
                                        }
                                        if (!var11.field4495) {
                                            var74 = class98.method635((byte) 66, var11, var74);
                                        }
                                        var73.method1023(var74, var13, var14, var11.field4478, var11.field4444, var75, var11.field4466 ? 0 : -1, var11.field4541, var11.field4517, var11.field4422);
                                    } else if (class24.field290) {
                                        class295.method1980(var11, arg3 ^ 0xFFFFA7AA);
                                    }
                                } else if (var11.field4394 == 5) {
                                    if (!var11.field4495) {
                                        class230 var86 = var11.method1921(true, class177.method1095(var11, (byte) 53));
                                        if (var86 != null) {
                                            var86.method1274(var13, var14);
                                        } else if (class24.field290) {
                                            class295.method1980(var11, 0);
                                        }
                                    } else if (var11.field4550 >= 0) {
                                        class38 var85 = var11.method1927(-1);
                                        var85.method229(0, var13, var14, var11.field4478, var11.field4444, var11.field4523, var11.field4464, 0);
                                    } else {
                                        class230 var77;
                                        if (var11.field4566 == -1) {
                                            var77 = var11.method1921(true, false);
                                        } else if (var11.field4465 && class165.field2537.field1670 != null) {
                                            var77 = class100.method644(var11.field4433, class165.field2537.field1670, var11.field4566, var11.field4557, var11.field4570, (byte) 38, var11.field4564);
                                        } else {
                                            var77 = class100.method644(var11.field4433, (class79) null, var11.field4566, var11.field4557, var11.field4570, (byte) 38, var11.field4564);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field3463;
                                            int var79 = var77.field3470;
                                            if (var11.field4544) {
                                                int var80 = (var79 + var11.field4444 - 1) / var79;
                                                int var81 = (var11.field4478 + var78 - 1) / var78;
                                                class111.method722(var13, var14, var13 + var11.field4478, var11.field4444 + var14);
                                                for (int var82 = 0; var82 < var81; var82++) {
                                                    for (int var83 = 0; var83 < var80; var83++) {
                                                        if (var11.field4519 != 0) {
                                                            var77.method1467(var11.field4519, false, var79 * var83 + var79 / 2 + var14, 4096, var78 / 2 + (var13 + (var78 * var82)));
                                                        } else if (var15 == 0) {
                                                            var77.method1274(var78 * var82 + var13, var79 * var83 + var14);
                                                        } else {
                                                            var77.method1277(var78 * var82 + var13, var79 * var83 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class111.method716(arg6, arg9, arg2, arg0);
                                            } else {
                                                int var84 = var11.field4478 * 4096 / var78;
                                                if (var11.field4519 != 0) {
                                                    var77.method1467(var11.field4519, false, var11.field4444 / 2 + var14, var84, var11.field4478 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var77.method1278(var13, var14, var11.field4478, var11.field4444, 256 - (var15 & 0xFF));
                                                } else if (var11.field4478 == var78 && var11.field4444 == var79) {
                                                    var77.method1274(var13, var14);
                                                } else {
                                                    var77.method1283(var13, var14, var11.field4478, var11.field4444);
                                                }
                                            }
                                        } else if (class24.field290) {
                                            class295.method1980(var11, 0);
                                        }
                                    }
                                } else if (var11.field4394 == 6) {
                                    boolean var87 = class177.method1095(var11, (byte) -108);
                                    class14 var88 = null;
                                    int var89;
                                    if (var87) {
                                        var89 = var11.field4476;
                                    } else {
                                        var89 = var11.field4542;
                                    }
                                    int var90 = 0;
                                    if (var11.field4566 != -1) {
                                        class43 var95 = class160.method999(var11.field4566, arg3 ^ 0xFFFFA7AA);
                                        if (var95 != null) {
                                            class43 var96 = var95.method296((byte) 49, var11.field4557);
                                            class215 var97 = var89 == -1 ? null : class276.method1829(var89, 29223);
                                            if (var11.field4465 && class165.field2537.field1670 != null) {
                                                var88 = var96.method299(class165.field2537.field1670, 1, 0, var11.field4521, var11.field4397, var97, var11.field4395);
                                            } else {
                                                var88 = var96.method299((class79) null, 1, 0, var11.field4521, var11.field4397, var97, var11.field4395);
                                            }
                                            if (var88 == null) {
                                                class295.method1980(var11, arg3 + 22614);
                                            } else {
                                                var90 = -var88.method81() / 2;
                                            }
                                        }
                                    } else if (var11.field4453 == 5) {
                                        if (var11.field4459 == -1) {
                                            var88 = class120.field1812.method519(true, -1, 0, (class215) null, -1, 0, -1, (class215) null, (class44[]) null, arg3 + 88149, -1);
                                        } else {
                                            int var91 = var11.field4459 & 0x7FF;
                                            if (class221.field3334 == var91) {
                                                var91 = 2047;
                                            }
                                            class107 var92 = class96.field1521[var91];
                                            class215 var93 = var89 == -1 ? null : class276.method1829(var89, 29223);
                                            if (var92 != null && (int) class94.method604((byte) 84, var92.field1663) << 11 == (var11.field4459 & 0xFFFFF800)) {
                                                var88 = var92.field1670.method519(true, -1, 0, (class215) null, -1, 0, var11.field4395, var93, (class44[]) null, 65535, 0);
                                            }
                                        }
                                    } else if (var89 == -1) {
                                        var88 = var11.method1922(-1, 0, (class215) null, -1, -1, class165.field2537.field1670, var87);
                                        if (var88 == null && class24.field290) {
                                            class295.method1980(var11, arg3 ^ 0xFFFFA7AA);
                                        }
                                    } else {
                                        class215 var94 = class276.method1829(var89, 29223);
                                        var88 = var11.method1922(-1, var11.field4397, var94, var11.field4395, var11.field4521, class165.field2537.field1670, var87);
                                        if (var88 == null && class24.field290) {
                                            class295.method1980(var11, 0);
                                        }
                                    }
                                    if (var88 != null) {
                                        int var98;
                                        if (var11.field4399 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field4478 << 8) / var11.field4399;
                                        }
                                        int var99;
                                        if (var11.field4506 <= 0) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var11.field4444 << 8) / var11.field4506;
                                        }
                                        int var100 = (var11.field4502 * var98 >> 8) + var11.field4478 / 2 + var13;
                                        int var101 = (var11.field4552 * var99 >> 8) + (var14 + (var11.field4444 / 2));
                                        class249.method1622(var100, var101);
                                        int var102 = class249.field3781[var11.field4531] * var11.field4480 >> 16;
                                        int var103 = class249.field3767[var11.field4531] * var11.field4480 >> 16;
                                        if (!var11.field4495) {
                                            var88.method109(0, var11.field4434, 0, var11.field4531, 0, var103, var102, -1L);
                                        } else if (var11.field4467) {
                                            ((class29) var88).method184(0, var11.field4434, var11.field4473, var11.field4531, var11.field4392, var11.field4424 + var90 + var103, var11.field4424 + var102, var11.field4480);
                                        } else {
                                            var88.method109(0, var11.field4434, var11.field4473, var11.field4531, var11.field4392, var90 + var103 + var11.field4424, var11.field4424 + var102, -1L);
                                        }
                                        class249.method1625();
                                    }
                                } else {
                                    if (var11.field4394 == 7) {
                                        class164 var104 = var11.method1917(class143.field2101, (byte) -113);
                                        if (var104 == null) {
                                            if (class24.field290) {
                                                class295.method1980(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field4561; var106++) {
                                            for (int var107 = 0; var107 < var11.field4493; var107++) {
                                                if (var11.field4513[var105] > 0) {
                                                    class43 var108 = class160.method999(var11.field4513[var105] - 1, 0);
                                                    String var109;
                                                    if (var108.field648 != 1 && var11.field4448[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field626 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field626 + "</col> x" + class200.method1260(var11.field4448[var105], 0);
                                                    }
                                                    int var110 = var14 + ((var11.field4442 + 12) * var106);
                                                    int var111 = (var11.field4499 + 115) * var107 + var13;
                                                    if (var11.field4541 == 0) {
                                                        var104.method1024(var109, var111, var110, var11.field4402, var11.field4466 ? 0 : -1);
                                                    } else if (var11.field4541 == 1) {
                                                        var104.method1037(var109, var111 + 57, var110, var11.field4402, var11.field4466 ? 0 : -1);
                                                    } else {
                                                        var104.method1018(var109, var111 + 114, var110, var11.field4402, var11.field4466 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field4394 == 8 && class97.field1529 == var11 && class171.field2595 == class128.field1920) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class164 var114 = class268.field4036;
                                        String var115 = var11.field4438;
                                        String var116 = class98.method635((byte) 66, var11, var115);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var114.method1036(var125);
                                            if (var126 > var112) {
                                                var112 = var126;
                                            }
                                            var113 += var114.field2520 + 1;
                                        }
                                        var113 += 7;
                                        var112 += 6;
                                        int var117 = var11.field4478 + var13 - var112 - 5;
                                        int var118 = var11.field4444 + var14 + 5;
                                        if ((var113 + var118) > arg0) {
                                            var118 = arg0 - var113;
                                        }
                                        if (var13 + 5 > var117) {
                                            var117 = var13 + 5;
                                        }
                                        if (var117 + var112 > arg2) {
                                            var117 = arg2 - var112;
                                        }
                                        class111.method702(var117, var118, var112, var113, 16777120);
                                        class111.method701(var117, var118, var112, var113, 0);
                                        int var119 = var114.field2520 + var118 + 2;
                                        String var120 = var11.field4438;
                                        String var121 = class98.method635((byte) 66, var11, var120);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method1024(var123, var117 + 3, var119, 0, -1);
                                            var119 += var114.field2520 + 1;
                                        }
                                    }
                                    if (var11.field4394 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field4469) {
                                            var128 = var13;
                                            var129 = var11.field4444 + var14;
                                            var130 = var14;
                                            var127 = var13 + var11.field4478;
                                        } else {
                                            var127 = var11.field4478 + var13;
                                            var128 = var13;
                                            var129 = var14;
                                            var130 = var11.field4444 + var14;
                                        }
                                        if (var11.field4507 == 1) {
                                            class111.method714(var128, var129, var127, var130, var11.field4402);
                                        } else {
                                            class111.method721(var128, var129, var127, var130, var11.field4402, var11.field4507);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method417(byte arg0, String arg1) {
        field979++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class154.field2307; var2++) {
            if (arg1.equalsIgnoreCase(class71.field1130[var2])) {
                return true;
            }
        }
        if (arg0 != -40) {
            method415((byte) -82);
        }
        return false;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method418(byte arg0) {
        field983++;
        int var1 = 102 % ((arg0 + 8) / 63);
        class149.field2159.method1775(27147);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method419(String arg0, int arg1) {
        if (arg1 < 45) {
            return 21;
        } else {
            field976++;
            return arg0.length() + 1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method420(int arg0) {
        field980 = null;
        field985 = null;
        int var1 = -76 % ((72 - arg0) / 40);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(JZ)V")
    public static final void method421(long arg0, boolean arg1) {
        if (class253.field3837 == 1 || class253.field3837 == 5) {
            class10.method47(0, arg0);
        } else if (class253.field3837 == 2) {
            class137.method841(-94);
        } else {
            class85.method557((byte) 44);
        }
        if (!class218.field3275) {
            class218.field3278 = 1;
            if (class176.field2691 != 0) {
                class119.field1792 = class295.field4669;
                class223.field3339 = class82.field1320;
            } else if (class246.field3676 == 0) {
                class223.field3339 = class91.field1438;
                class119.field1792 = class203.field3065;
            } else {
                class223.field3339 = class205.field3076;
                class119.field1792 = class188.field2872;
            }
            class84.field1339[0] = 1007;
            class199.field3021[0] = class198.field3007;
            class46.field754[0] = "";
            client.field2371[0] = class225.field3379;
        }
        field982++;
        if (class136.field1987 != -1) {
            class266.method1771(class136.field1987, (byte) 110);
        }
        int var3 = 0;
        if (arg1) {
            field980 = null;
        }
        while (class256.field3900 > var3) {
            if (class7.field105[var3]) {
                class1.field16[var3] = true;
            }
            class126.field1909[var3] = class7.field105[var3];
            class7.field105[var3] = false;
            var3++;
        }
        class154.field2317 = -1;
        class75.field1220 = -1;
        class120.field1814 = null;
        class195.field2966 = null;
        class30.field433 = class270.field4058;
        if (class136.field1987 != -1) {
            class256.field3900 = 0;
            class152.method919((byte) -115);
        }
        class111.method711();
        class200.method1254((byte) 16);
        if (class218.field3275) {
            if (class141.field2060) {
                class89.method576((byte) 81);
            } else {
                class231.method1475((byte) 108);
            }
        } else if (class195.field2966 != null) {
            class259.method1739(class93.field1479, class75.field1219, -77, class195.field2966);
        } else if (class75.field1220 != -1) {
            class259.method1739(class154.field2317, class75.field1220, -67, (class289) null);
        }
        int var4 = class218.field3275 ? -1 : class67.method453(arg1);
        if (var4 == -1) {
            var4 = class283.field4231;
        }
        class206.method1302(var4, (byte) 8);
        if (class275.field4150 == 1) {
            class275.field4150 = 2;
        }
        if (class258.field3940 == 1) {
            class258.field3940 = 2;
        }
        if (class56.field898 == 3) {
            for (int var5 = 0; var5 < class256.field3900; var5++) {
                if (class126.field1909[var5]) {
                    class111.method715(class101.field1593[var5], class283.field4236[var5], class160.field2460[var5], class32.field471[var5], 16711935, 128);
                } else if (class1.field16[var5]) {
                    class111.method715(class101.field1593[var5], class283.field4236[var5], class160.field2460[var5], class32.field471[var5], 16711680, 128);
                }
            }
        }
        class57.method386(class180.field2741, (byte) -98, class99.field1557, class165.field2537.field2251, class165.field2537.field2234);
        class180.field2741 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lfl;")
    public static final class248 method422(int arg0) {
        class248 var1 = new class248(34);
        var1.method1568(arg0, (byte) 49);
        field981++;
        var1.method1568(class7.field107, (byte) 49);
        var1.method1568(class58.field914 ? 1 : 0, (byte) 49);
        var1.method1568(class63.field996 ? 1 : 0, (byte) 49);
        var1.method1568(class213.field3188 ? 1 : 0, (byte) 49);
        var1.method1568(class140.field2047 ? 1 : 0, (byte) 49);
        var1.method1568(class102.field1602 ? 1 : 0, (byte) 49);
        var1.method1568(class32.field464 ? 1 : 0, (byte) 49);
        var1.method1568(class189.field2896 ? 1 : 0, (byte) 49);
        var1.method1568(class84.field1338 ? 1 : 0, (byte) 49);
        var1.method1568(class166.field2550, (byte) 49);
        var1.method1568(class297.field4692 ? 1 : 0, (byte) 49);
        var1.method1568(class145.field2115 ? 1 : 0, (byte) 49);
        var1.method1568(class256.field3906 ? 1 : 0, (byte) 49);
        var1.method1568(class274.field4119, (byte) 49);
        var1.method1568(class107.field1657 ? 1 : 0, (byte) 49);
        var1.method1568(class100.field1574, (byte) 49);
        var1.method1568(class284.field4248, (byte) 49);
        var1.method1568(class196.field2988, (byte) 49);
        var1.method1605(class89.field1405, (byte) 113);
        var1.method1605(class256.field3905, (byte) 50);
        var1.method1568(class245.method1540(), (byte) 49);
        var1.method1577((byte) 103, class145.field2125);
        var1.method1568(class132.field1937, (byte) 49);
        var1.method1568(class215.field3248 ? 1 : 0, (byte) 49);
        var1.method1568(class195.field2970 ? 1 : 0, (byte) 49);
        var1.method1568(class127.field1911, (byte) 49);
        var1.method1568(class142.field2088 ? 1 : 0, (byte) 49);
        var1.method1568(class4.field81 ? 1 : 0, (byte) 49);
        return var1;
    }
}
