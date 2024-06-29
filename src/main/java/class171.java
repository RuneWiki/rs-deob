import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class171 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2394 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lfi;")
    public static class331 field2392 = new class331(30);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2399 = "Members object";

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2395++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg4 * arg4;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = -34 / ((arg5 + 69) / 50);
        class105.method564(arg1, arg2 - arg4, 0, class318.field4522[arg3], arg2 + arg4);
        int var21 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var21;
            var21 -= var15;
            var7--;
            var18 -= var15;
            int var22 = arg3 - var7;
            int var23 = arg3 + var7;
            int var24 = arg2 + var6;
            int var25 = arg2 - var6;
            class105.method564(arg1, var25, 0, class318.field4522[var22], var24);
            class105.method564(arg1, var25, 0, class318.field4522[var23], var24);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Ljf;I)V")
    public static final void method1133(int arg0, class119[] arg1, int arg2) {
        field2396++;
        if (arg0 != 100) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class119 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1535 == 0) {
                    if (var4.field1460 != null) {
                        method1133(100, var4.field1460, arg2);
                    }
                    class201 var5 = (class201) class396.field5783.method1204((byte) -125, (long) var4.field1424);
                    if (var5 != null) {
                        class237.method1513(arg2, var5.field2776, 65079);
                    }
                }
                if (arg2 == 0 && var4.field1438 != null) {
                    class191 var6 = new class191();
                    var6.field2605 = var4;
                    var6.field2602 = var4.field1438;
                    class387.method2471(var6);
                }
                if (arg2 == 1 && var4.field1422 != null) {
                    if (var4.field1495 >= 0) {
                        class119 var7 = class179.method1170(var4.field1424, 818041328);
                        if (var7 == null || var7.field1460 == null || var7.field1460.length <= var4.field1495 || var7.field1460[var4.field1495] != var4) {
                            continue;
                        }
                    }
                    class191 var8 = new class191();
                    var8.field2605 = var4;
                    var8.field2602 = var4.field1422;
                    class387.method2471(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        class51.method307(5, (byte) 106);
        field2393++;
        int var1 = 78 % ((-arg0 - 47) / 58);
        class423.method2622(5, -123);
        class113.method625(5, 32542);
        class216.method1413(5, (byte) 72);
        class116.method654(65535, 5);
        class436.method2708(-11042, 5);
        class170.method1128(5, (byte) -92);
        class235.method1496(115, 5);
        class159.method1045(5, 3);
        class393.method2510(5, 3);
        class238.method1524((byte) 127, 5);
        class419.method2602(5, 3);
        class377.method2374((byte) -52, 5);
        class42.method261(5, (byte) -99);
        class339.method2180(false, 5);
        class237.method1515(128, 5);
        class73.method428(5, (byte) -13);
        class339.method2179(false, 5);
        class311.method1954((byte) -65, 5);
        class379.method2409(1, 5);
        class424.method2631(50, (byte) 61);
        class404.method2561(5, (byte) 63);
        class337.method2172(5, true);
        class24.field241.method2054(-110, 5);
        class297.field4240.method2054(89, 5);
        class330.field4714.method2054(-46, 5);
        class410.field5935.method2054(93, 5);
        class387.field5680.method2054(97, 5);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method1135(byte arg0) {
        field2399 = null;
        if (arg0 != -68) {
            field2399 = null;
        }
        field2392 = null;
        field2394 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static final void method1136(byte arg0) {
        field2398++;
        class383.field5621.method2043(-66);
        if (arg0 >= -18) {
            method1137(63, 11, -67, 109, -19, -3, (class119[]) null, -85, 113, -127);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII[Ljf;III)V")
    public static final void method1137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class119[] arg6, int arg7, int arg8, int arg9) {
        field2391++;
        class218.field2991.method968(arg4, arg3, arg0, arg8);
        for (int var10 = arg5; var10 < arg6.length; var10++) {
            class119 var11 = arg6[var10];
            if (var11 != null && (var11.field1529 == arg7 || arg7 == -1412584499 && class193.field2632 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class281.field3941[class262.field3646].setBounds(var11.field1448 + arg9, var11.field1562 + arg2, var11.field1552, var11.field1498);
                    var12 = class262.field3646++;
                } else {
                    var12 = arg1;
                }
                var11.field1431 = class221.field3033;
                var11.field1590 = var12;
                if (!var11.field1475 || !client.method1074(var11)) {
                    if (var11.field1538 > 0) {
                        class135.method807((byte) 75, var11);
                    }
                    int var13 = var11.field1448 + arg9;
                    int var14 = var11.field1562 + arg2;
                    int var15 = var11.field1564;
                    if (class267.field3764 && (client.method1076(var11).field39 != 0 || var11.field1535 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class193.field2632 == var11) {
                        if (arg7 != -1412584499 && !var11.field1563) {
                            class434.field6362 = arg2;
                            class376.field5517 = arg6;
                            class27.field261 = arg9;
                            continue;
                        }
                        if (class173.field2409 && class170.field2378) {
                            int var16 = class57.field654;
                            int var17 = var16 - class388.field5682;
                            int var18 = class48.field562;
                            int var19 = var18 - class383.field5619;
                            if (class314.field4476 > var17) {
                                var17 = class314.field4476;
                            }
                            if ((class314.field4476 + class382.field5600.field1552) < (var11.field1552 + var17)) {
                                var17 = class314.field4476 + class382.field5600.field1552 - var11.field1552;
                            }
                            if (var19 < class98.field1110) {
                                var19 = class98.field1110;
                            }
                            var13 = var17;
                            if ((class98.field1110 + class382.field5600.field1498) < (var11.field1498 + var19)) {
                                var19 = class382.field5600.field1498 + class98.field1110 - var11.field1498;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1563) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field1535 == 2) {
                        var25 = arg8;
                        var24 = arg0;
                        var23 = arg3;
                        var22 = arg4;
                    } else {
                        int var20 = var11.field1552 + var13;
                        int var21 = var11.field1498 + var14;
                        var22 = var13 > arg4 ? var13 : arg4;
                        var23 = var14 > arg3 ? var14 : arg3;
                        if (var11.field1535 == 9) {
                            var21++;
                            var20++;
                        }
                        var24 = arg0 <= var20 ? arg0 : var20;
                        var25 = var21 < arg8 ? var21 : arg8;
                    }
                    if (!var11.field1475 || var22 < var24 && var23 < var25) {
                        if (var11.field1538 != 0) {
                            if (var11.field1538 == 1337 || var11.field1538 == 1403) {
                                class116.method653(var14, 2, var11.field1498, var11.field1552, var13, var11.field1538 == 1403);
                                class266.field3723[var12] = true;
                                class218.field2991.method968(arg4, arg3, arg0, arg8);
                                continue;
                            }
                            if (var11.field1538 == 1338) {
                                if (var11.method678((byte) 106, class218.field2991) != null) {
                                    class58.method365(-26586);
                                    class182.method1184(var11, class218.field2991, var13, arg5 - 1637, var14);
                                    class270.field3817[var12] = true;
                                    class218.field2991.method968(arg4, arg3, arg0, arg8);
                                }
                                continue;
                            }
                            if (var11.field1538 == 1339) {
                                if (var11.method678((byte) 15, class218.field2991) != null) {
                                    class315.method1970(var13, var14, 127, var11);
                                    class270.field3817[var12] = true;
                                    class218.field2991.method968(arg4, arg3, arg0, arg8);
                                }
                                continue;
                            }
                            if (var11.field1538 == 1400) {
                                class232.method1477(class218.field2991, var11.field1498, var14, class225.field3070, var13, var11.field1552, 17722);
                                class266.field3723[var12] = true;
                                class218.field2991.method968(arg4, arg3, arg0, arg8);
                                continue;
                            }
                            if (var11.field1538 == 1401) {
                                class228.method1468(var11.field1498, var14, class218.field2991, var11.field1552, -32073, var13);
                                class266.field3723[var12] = true;
                                class218.field2991.method968(arg4, arg3, arg0, arg8);
                                continue;
                            }
                            if (var11.field1538 == 1405) {
                                if (!class101.field1139 && !class159.field2265) {
                                    continue;
                                }
                                int var26 = var11.field1552 + var13;
                                int var27 = var14 + 15;
                                if (class101.field1139) {
                                    class2.field20.method1251(-1, (byte) -101, var26, -256, var27, "Fps:" + class400.field5805);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class2.field20.method1251(-1, (byte) -106, var26, var30, var27, "Mem:" + var29 + "k");
                                    var27 += 15;
                                    int var31 = class218.field2991.method989() / 1024;
                                    class2.field20.method1251(-1, (byte) 36, var26, var31 > 65536 ? -65536 : -256, var27, "Offheap:" + var31 + "k");
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class59.field713[var35].method1843(arg5);
                                        var33 += class59.field713[var35].method1848(true);
                                        var34 += class59.field713[var35].method1845(-125);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class105.method562(true, (long) var37, 2, 0, 45) + "% (" + var36 + "%)";
                                    class105.field1192.method1251(-1, (byte) -111, var26, -256, var27, var38);
                                    var27 += 12;
                                }
                                if (class101.field1143 > 0) {
                                    class105.field1192.method1251(-1, (byte) 66, var26, -256, var27, "Particles: " + class102.field1161 + " / " + class101.field1143);
                                }
                                var27 += 12;
                                if (class159.field2265) {
                                    class105.field1192.method1251(-1, (byte) 36, var26, -256, var27, "Polys: " + class218.field2991.method954() + " Models: " + class218.field2991.method1021());
                                    var27 += 12;
                                    class105.field1192.method1251(-1, (byte) -127, var26, -256, var27, "Ls: " + class109.field1272 + " La: " + class199.field2717 + " NPC: " + class88.field982 + " Pl: " + class105.field1190);
                                    class331.method2045((byte) 125);
                                    var27 += 12;
                                }
                                class266.field3723[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field1535 == 0) {
                            if (!var11.field1475 && client.method1074(var11) && class193.field2639 != var11) {
                                continue;
                            }
                            if (!var11.field1475) {
                                if (var11.field1467 > var11.field1593 - var11.field1498) {
                                    var11.field1467 = var11.field1593 - var11.field1498;
                                }
                                if (var11.field1467 < 0) {
                                    var11.field1467 = 0;
                                }
                            }
                            if (var11.field1538 == 1407 && class218.field2991.method925()) {
                                class218.field2991.method948(var13, var14, var11.field1552, var11.field1498);
                            }
                            method1137(var24, var12, var14 - var11.field1467, var23, var22, 0, arg6, var11.field1424, var25, var13 - var11.field1501);
                            if (var11.field1460 != null) {
                                method1137(var24, var12, var14 - var11.field1467, var23, var22, arg5, var11.field1460, var11.field1424, var25, var13 - var11.field1501);
                            }
                            class201 var39 = (class201) class396.field5783.method1204((byte) -100, (long) var11.field1424);
                            if (var39 != null) {
                                class233.method1485(var22, -3141, var23, var39.field2776, var12, var13, var25, var14, var24);
                            }
                            if (var11.field1538 == 1407 && class218.field2991.method925()) {
                                class218.field2991.method930();
                                class269.field3789 = true;
                            }
                            class218.field2991.method968(arg4, arg3, arg0, arg8);
                        }
                        if (class350.field5115[var12] || class19.field195 > 1) {
                            if (var11.field1535 == 0 && !var11.field1475 && var11.field1498 < var11.field1593) {
                                class236.method1504(var11.field1467, var14, (byte) 116, var11.field1593, var11.field1498, var11.field1552 + var13);
                            }
                            if (var11.field1535 != 1) {
                                if (var11.field1535 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field1458; var41++) {
                                        for (int var42 = 0; var42 < var11.field1461; var42++) {
                                            int var43 = (var11.field1445 + 32) * var42 + var13;
                                            int var44 = (var11.field1421 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var44 += var11.field1573[var40];
                                                var43 += var11.field1479[var40];
                                            }
                                            if (var11.field1580[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field1580[var40] - 1;
                                                if (arg4 < var43 + 32 && arg0 > var43 && var44 + 32 > arg3 && var44 < arg8 || class189.field2571 == var11 && class217.field2977 == var40) {
                                                    class11 var49;
                                                    if (class423.field6070 == 1 && class373.field5443 == var40 && class3.field49 == var11.field1424) {
                                                        var49 = class219.method1435(2, 0, class218.field2991, (byte) 102, var11.field1452, var48, (class116) null, var11.field1592[var40]);
                                                    } else {
                                                        var49 = class219.method1435(1, -13623264, class218.field2991, (byte) -123, var11.field1452, var48, (class116) null, var11.field1592[var40]);
                                                    }
                                                    if (var49 == null) {
                                                        class101.method543((byte) -101, var11);
                                                    } else if (class189.field2571 == var11 && class217.field2977 == var40) {
                                                        int var50 = class48.field562 - class222.field3037;
                                                        int var51 = class57.field654 - class98.field1098;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class444.field6482 < 5) {
                                                            var51 = 0;
                                                            var50 = 0;
                                                        }
                                                        var49.method40(var43 + var51, var44 + var50, 0, -2013265920, 1);
                                                        if (arg7 != -1) {
                                                            class119 var52 = arg6[arg7 & 0xFFFF];
                                                            int[] var53 = new int[4];
                                                            class218.field2991.method1004(var53);
                                                            int var54 = var53[1];
                                                            int var55 = var53[3];
                                                            if (var54 > (var44 + var50) && var52.field1467 > 0) {
                                                                int var56 = (var54 - (var44 + var50)) * class245.field3329 / 3;
                                                                if ((class245.field3329 * 10) < var56) {
                                                                    var56 = class245.field3329 * 10;
                                                                }
                                                                if (var52.field1467 < var56) {
                                                                    var56 = var52.field1467;
                                                                }
                                                                class222.field3037 += var56;
                                                                var52.field1467 -= var56;
                                                                class101.method543((byte) -58, var52);
                                                            }
                                                            if (var55 < (var50 + var44 + 32) && var52.field1593 - var52.field1498 > var52.field1467) {
                                                                int var57 = (var44 + var50 + 32 - var55) * class245.field3329 / 3;
                                                                if (class245.field3329 * 10 < var57) {
                                                                    var57 = class245.field3329 * 10;
                                                                }
                                                                if ((var52.field1593 - var52.field1498 - var52.field1467) < var57) {
                                                                    var57 = var52.field1593 - var52.field1498 - var52.field1467;
                                                                }
                                                                class222.field3037 -= var57;
                                                                var52.field1467 += var57;
                                                                class101.method543((byte) -97, var52);
                                                            }
                                                        }
                                                    } else if (class96.field1071 == var11 && class2.field29 == var40) {
                                                        var49.method40(var43, var44, 0, -2013265920, 1);
                                                    } else {
                                                        var49.method90(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field1480 != null && var40 < 20) {
                                                class11 var45 = var11.method676(arg5 ^ 0x7D, class218.field2991, var40);
                                                if (var45 != null) {
                                                    var45.method90(var43, var44);
                                                } else if (class421.field6049) {
                                                    class101.method543((byte) 100, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field1535 == 3) {
                                    int var58;
                                    if (class366.method2317(2, var11)) {
                                        var58 = var11.field1432;
                                        if (class193.field2639 == var11 && var11.field1425 != 0) {
                                            var58 = var11.field1425;
                                        }
                                    } else {
                                        var58 = var11.field1489;
                                        if (class193.field2639 == var11 && var11.field1444 != 0) {
                                            var58 = var11.field1444;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1454) {
                                            class218.field2991.method995(var13, var14, var11.field1552, var11.field1498, var58, 0);
                                        } else {
                                            class218.field2991.method958(var13, var14, var11.field1552, var11.field1498, var58, 0);
                                        }
                                    } else if (var11.field1454) {
                                        class218.field2991.method995(var13, var14, var11.field1552, var11.field1498, 255 - (var15 & 0xFF) << 24 | var58 & 0xFFFFFF, 1);
                                    } else {
                                        class218.field2991.method958(var13, var14, var11.field1552, var11.field1498, 255 - (var15 & 0xFF) << 24 | var58 & 0xFFFFFF, 1);
                                    }
                                } else if (var11.field1535 == 4) {
                                    class196 var59 = var11.method670((byte) -89, class218.field2991);
                                    if (var59 != null) {
                                        String var60 = var11.field1536;
                                        int var61;
                                        if (class366.method2317(arg5 + 2, var11)) {
                                            var61 = var11.field1432;
                                            if (class193.field2639 == var11 && var11.field1425 != 0) {
                                                var61 = var11.field1425;
                                            }
                                            if (var11.field1584.length() > 0) {
                                                var60 = var11.field1584;
                                            }
                                        } else {
                                            var61 = var11.field1489;
                                            if (class193.field2639 == var11 && var11.field1444 != 0) {
                                                var61 = var11.field1444;
                                            }
                                        }
                                        if (var11.field1475 && var11.field1597 != -1) {
                                            class260 var62 = class392.method2498(var11.field1597, -119);
                                            var60 = var62.field3527;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field3581 == 1 || var11.field1429 != 1) && var11.field1429 != -1) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class159.method1042(var11.field1429, 2);
                                            }
                                        }
                                        if (class344.field5061 == var11) {
                                            var60 = class35.field340;
                                            var61 = var11.field1489;
                                        }
                                        if (!var11.field1475) {
                                            var60 = class403.method2553(-111, var11, var60);
                                        }
                                        if (class308.field4408) {
                                            class218.field2991.method1010(var13, var14, var11.field1552 + var13, var14 - -var11.field1498);
                                        }
                                        var59.method1241(0, var11.field1498, var14, var11.field1516, (class121) null, var60, 127, var61 | 0xFF000000, var11.field1565, (int[]) null, var13, var11.field1486, var11.field1552, 0, class159.field2247, var11.field1472 ? -16777216 : -1);
                                        if (class308.field4408) {
                                            class218.field2991.method968(arg4, arg3, arg0, arg8);
                                        }
                                    } else if (class421.field6049) {
                                        class101.method543((byte) 54, var11);
                                    }
                                } else if (var11.field1535 == 5) {
                                    if (!var11.field1475) {
                                        class11 var72 = var11.method669(class218.field2991, (byte) -27, class366.method2317(2, var11));
                                        if (var72 != null) {
                                            var72.method90(var13, var14);
                                        } else if (class421.field6049) {
                                            class101.method543((byte) 98, var11);
                                        }
                                    } else if (var11.field1437 < 0) {
                                        class11 var64;
                                        if (var11.field1597 == -1) {
                                            var64 = var11.method669(class218.field2991, (byte) -31, false);
                                        } else {
                                            class116 var63 = var11.field1581 ? class390.field5715.field1843 : null;
                                            var64 = class219.method1435(var11.field1542, var11.field1557 | 0xFF000000, class218.field2991, (byte) 122, var11.field1452, var11.field1597, var63, var11.field1429);
                                        }
                                        if (var64 != null) {
                                            int var65 = var64.method52();
                                            int var66 = var64.method47();
                                            if (var11.field1512) {
                                                class218.field2991.method1010(var13, var14, var11.field1552 + var13, var14 - -var11.field1498);
                                                if (var11.field1435 != 0) {
                                                    int var68 = (var65 + var11.field1552 - 1) / var65;
                                                    int var69 = (var66 + var11.field1498 - 1) / var66;
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        for (int var71 = 0; var71 < var69; var71++) {
                                                            var64.method94((float) var65 / 2.0F + (float) (var13 + (var65 * var70)), (float) var66 / 2.0F + (float) (var66 * var71 + var14), 4096, var11.field1435);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var64.method42(var13, var14, var11.field1552, var11.field1498, 0, 0, 1);
                                                } else {
                                                    var64.method42(var13, var14, var11.field1552, var11.field1498, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class218.field2991.method968(arg4, arg3, arg0, arg8);
                                            } else if (var15 != 0) {
                                                int var67 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var11.field1435 != 0) {
                                                    var64.method92((float) var11.field1552 / 2.0F + (float) var13, (float) var11.field1498 / 2.0F + (float) var14, var11.field1552 * 4096 / var65, var11.field1435, 1, var67, 1);
                                                } else if (var11.field1552 == var65 && var11.field1498 == var66) {
                                                    var64.method40(var13, var14, 1, var67, 1);
                                                } else {
                                                    var64.method46(var13, var14, var11.field1552, var11.field1498, 1, var67, 1);
                                                }
                                            } else if (var11.field1435 != 0) {
                                                var64.method94((float) var11.field1552 / 2.0F + (float) var13, (float) var11.field1498 / 2.0F + (float) var14, var11.field1552 * 4096 / var65, var11.field1435);
                                            } else if (var11.field1552 == var65 && var11.field1498 == var66) {
                                                var64.method90(var13, var14);
                                            } else {
                                                var64.method93(var13, var14, var11.field1552, var11.field1498);
                                            }
                                        } else if (class421.field6049) {
                                            class101.method543((byte) 60, var11);
                                        }
                                    } else {
                                        var11.method683(-4968).method197(arg5, class218.field2991, var11.field1552, var11.field1498, var11.field1544 << 3, var13, 0, 0, var14, var11.field1506 << 3);
                                    }
                                } else if (var11.field1535 == 6) {
                                    boolean var73 = class366.method2317(arg5 + 2, var11);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field1539;
                                    } else {
                                        var74 = var11.field1441;
                                    }
                                    class236.method1501(arg5 - 123);
                                    class393 var75 = null;
                                    int var76 = 0;
                                    if (var11.field1597 != -1) {
                                        class260 var84 = class392.method2498(var11.field1597, -102);
                                        if (var84 != null) {
                                            class260 var85 = var84.method1628((byte) 122, var11.field1429);
                                            class182 var86 = var74 == -1 ? null : class437.method2717(var74, (byte) -103);
                                            class116 var87 = var11.field1581 ? class390.field5715.field1843 : null;
                                            var75 = var85.method1635(1024, 1, var11.field1447, var11.field1470, var87, class218.field2991, var11.field1561, var86, 16);
                                            if (var75 == null) {
                                                class101.method543((byte) -126, var11);
                                            } else {
                                                var76 = -var75.method731() / 2;
                                            }
                                        }
                                    } else if (var11.field1571 == 5) {
                                        if (var11.field1520 == -1) {
                                            var75 = class239.field3245.method648((class182) null, -1, 0, (class138[]) null, -1, 1024, -1, -1, (class182) null, 0, true, (byte) -126, class218.field2991);
                                        } else {
                                            int var77 = var11.field1520;
                                            class133 var78;
                                            if (class188.field2547 == var77) {
                                                var78 = class390.field5715;
                                            } else {
                                                var78 = class375.field5473[var77];
                                            }
                                            class182 var79 = var74 == -1 ? null : class437.method2717(var74, (byte) -103);
                                            if (var78 != null && (var77 == 2047 || class97.method522(var78.field1847, (byte) -81) == var11.field1569)) {
                                                var75 = var78.field1843.method648(var79, var11.field1470, var11.field1447, (class138[]) null, -1, 1024, 0, var11.field1561, (class182) null, 0, true, (byte) -116, class218.field2991);
                                            }
                                        }
                                    } else if (var11.field1571 == 8 || var11.field1571 == 9) {
                                        class417 var81 = class450.method2793(var11.field1520, 8);
                                        class182 var82 = var74 == -1 ? null : class437.method2717(var74, (byte) -103);
                                        if (var81 != null) {
                                            class116 var83 = var11.field1581 ? class390.field5715.field1843 : null;
                                            var75 = var81.method2596(var11.field1569, var11.field1561, var11.field1571 == 9, class218.field2991, var82, var83, 1024, var11.field1470, (byte) -127, var11.field1447);
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var11.method667(class218.field2991, 1024, (byte) 126, (class182) null, 0, class390.field5715.field1843, -1, -1, var73);
                                        if (var75 == null && class421.field6049) {
                                            class101.method543((byte) 26, var11);
                                        }
                                    } else {
                                        class182 var80 = class437.method2717(var74, (byte) -103);
                                        var75 = var11.method667(class218.field2991, 1024, (byte) 75, var80, var11.field1447, class390.field5715.field1843, var11.field1470, var11.field1561, var73);
                                        if (var75 == null && class421.field6049) {
                                            class101.method543((byte) -114, var11);
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (var11.field1532 <= 0) {
                                            var88 = 512;
                                        } else {
                                            var88 = (var11.field1552 << 9) / var11.field1532;
                                        }
                                        int var89;
                                        if (var11.field1456 > 0) {
                                            var89 = (var11.field1498 << 9) / var11.field1456;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90 = (var11.field1462 * var88 >> 9) + var13 + (var11.field1552 / 2);
                                        int var91 = var14 - (-(var11.field1498 / 2) - (var11.field1553 * var89 >> 9));
                                        class397.field5789.method116();
                                        class218.field2991.method949(class397.field5789);
                                        int var92 = class286.field4025[var11.field1439 << 3] * var11.field1510 >> 15;
                                        int var93 = class286.field4035[var11.field1439 << 3] * var11.field1510 >> 15;
                                        class218.field2991.method971(var90, var91, var88, var89);
                                        class218.field2991.method1017((float) var11.field1471, var11.field1483 ? (float) var11.field1417 : (float) var11.field1417 * 1.5F);
                                        if (class269.field3789) {
                                            class218.field2991.method957();
                                            class218.field2991.method934();
                                            class218.field2991.method968(arg4, arg3, arg0, arg8);
                                            class269.field3789 = false;
                                        }
                                        if (var11.field1478) {
                                            class218.field2991.method956(false);
                                        }
                                        if (var11.field1475) {
                                            class98.field1102.method118(-var11.field1446 << 3);
                                            class98.field1102.method125(var11.field1522 << 3);
                                            class98.field1102.method124(var11.field1481, var92 + var11.field1534 + var76, var11.field1534 + var93);
                                        } else {
                                            class98.field1102.method117(var11.field1522 << 3);
                                            class98.field1102.method124(0, var92, var93);
                                        }
                                        class98.field1102.method131(var11.field1439 << 3);
                                        if (class308.field4408) {
                                            class218.field2991.method1010(var13, var14, var13 + var11.field1552, var14 - -var11.field1498);
                                        }
                                        if (var11.field1483) {
                                            var75.method718(class98.field1102, (class127) null, var11.field1510, 1);
                                        } else {
                                            var75.method775(class98.field1102, (class127) null, 1);
                                        }
                                        if (class308.field4408) {
                                            class218.field2991.method968(arg4, arg3, arg0, arg8);
                                        }
                                        if (var11.field1478) {
                                            class218.field2991.method956(true);
                                        }
                                    }
                                } else {
                                    if (var11.field1535 == 7) {
                                        class196 var94 = var11.method670((byte) -89, class218.field2991);
                                        if (var94 == null) {
                                            if (class421.field6049) {
                                                class101.method543((byte) -103, var11);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field1458; var96++) {
                                            for (int var97 = 0; var97 < var11.field1461; var97++) {
                                                if (var11.field1580[var95] > 0) {
                                                    class260 var98 = class392.method2498(var11.field1580[var95] - 1, -122);
                                                    String var99;
                                                    if (var98.field3581 != 1 && var11.field1592[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field3527 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field3527 + "</col> x" + class159.method1042(var11.field1592[var95], arg5 + 2);
                                                    }
                                                    int var100 = var13 + ((var11.field1445 + 115) * var97);
                                                    int var101 = (var11.field1421 + 12) * var96 + var14;
                                                    if (var11.field1486 == 0) {
                                                        var94.method1248(var99, var11.field1472 ? -16777216 : -1, var11.field1489 | 0xFF000000, (int[]) null, 99, var101, var100, class159.field2247);
                                                    } else if (var11.field1486 == 1) {
                                                        var94.method1255((int[]) null, var11.field1472 ? -16777216 : -1, var99, class159.field2247, var11.field1489 | 0xFF000000, var101, 117, var100 + 57);
                                                    } else {
                                                        var94.method1258(class159.field2247, var11.field1489 | 0xFF000000, var99, var101, 4, var11.field1472 ? -16777216 : -1, var100 + 114, (int[]) null);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field1535 == 8 && class272.field3849 == var11 && class143.field2027 == class100.field1119) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class196 var104 = class2.field20;
                                        String var105 = var11.field1536;
                                        String var106 = class403.method2553(arg5 ^ 0xFFFFFF9E, var11, var105);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (var114 == -1) {
                                                var115 = var106;
                                                var106 = "";
                                            } else {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            }
                                            int var116 = class1.field1.method1748(var115, -128);
                                            if (var102 < var116) {
                                                var102 = var116;
                                            }
                                            var103 += class1.field1.field3903 + 1;
                                        }
                                        var102 += 6;
                                        var103 += 7;
                                        int var107 = var13 + var11.field1552 - var102 - 5;
                                        int var108 = var11.field1498 + var14 + 5;
                                        if (var13 + 5 > var107) {
                                            var107 = var13 + 5;
                                        }
                                        if (arg0 < (var102 + var107)) {
                                            var107 = arg0 - var102;
                                        }
                                        if (arg8 < (var103 + var108)) {
                                            var108 = arg8 - var103;
                                        }
                                        class218.field2991.method995(var107, var108, var102, var103, -96, 0);
                                        class218.field2991.method958(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field1536;
                                        int var110 = var108 + class1.field1.field3903 + 2;
                                        String var111 = class403.method2553(arg5 ^ 0xFFFFFFAA, var11, var109);
                                        while (var111.length() > 0) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (var112 == -1) {
                                                var113 = var111;
                                                var111 = "";
                                            } else {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 + 4);
                                            }
                                            var104.method1245(-1, var110, var113, true, -16777216, var107 + 3);
                                            var110 += class1.field1.field3903 + 1;
                                        }
                                    }
                                    if (var11.field1535 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field1524) {
                                            var118 = var13;
                                            var117 = var13 + var11.field1552;
                                            var119 = var14;
                                            var120 = var14 + var11.field1498;
                                        } else {
                                            var117 = var11.field1552 + var13;
                                            var118 = var13;
                                            var119 = var11.field1498 + var14;
                                            var120 = var14;
                                        }
                                        if (var11.field1440 == 1) {
                                            class218.field2991.method973(var118, var120, var117, var119, var11.field1489, 0);
                                        } else {
                                            class218.field2991.method953(var118, var120, var117, var119, var11.field1489, var11.field1440, 0);
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
}
