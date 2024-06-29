import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class218 extends class65 {

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3185;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lh;")
    public static class572 field3183 = new class572("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3186 = 0;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lvp;IIIIIIII)V")
    public static final void method1416(int arg0, class162[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class99.field1445.method510(arg4, arg2, arg6, arg5);
        field3187++;
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class162 var11 = arg1[var10];
            if (var11 != null && (var11.field2483 == arg7 || arg7 == -1412584499 && class307.field4210 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class621.field9154[class533.field7942].setBounds(var11.field2449 + arg0, var11.field2507 - -arg8, var11.field2527, var11.field2459);
                    var12 = class533.field7942++;
                } else {
                    var12 = arg9;
                }
                var11.field2446 = var12;
                var11.field2526 = class617.field9123;
                if (!client.method1615(var11)) {
                    if (var11.field2476 != 0) {
                        class44.method278(var11, (byte) 125);
                    }
                    int var13 = var11.field2449 + arg0;
                    int var14 = var11.field2507 + arg8;
                    int var15 = var11.field2422;
                    if (class112.field1592 && (client.method1599(var11).field9207 != 0 || var11.field2552 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class307.field4210 == var11) {
                        if (arg7 != -1412584499 && (class188.field2799 == var11.field2519 || field3186 == var11.field2519)) {
                            class76.field1020 = arg1;
                            class499.field7072 = arg0;
                            class11.field109 = arg8;
                            continue;
                        }
                        if (class199.field2932 && class394.field5425) {
                            int var16 = class623.field9182.method1587((byte) -125);
                            int var17 = class623.field9182.method1594(2028208128);
                            int var18 = var17 - class595.field8796;
                            int var19 = var16 - class114.field1610;
                            if (class180.field2735 > var19) {
                                var19 = class180.field2735;
                            }
                            if (var11.field2527 + var19 > class180.field2735 + class57.field716.field2527) {
                                var19 = class57.field716.field2527 + class180.field2735 - var11.field2527;
                            }
                            if (class383.field5267 > var18) {
                                var18 = class383.field5267;
                            }
                            if (var11.field2459 + var18 > class383.field5267 - -class57.field716.field2459) {
                                var18 = class383.field5267 + class57.field716.field2459 - var11.field2459;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (field3186 == var11.field2519) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2552 == 2) {
                        var20 = arg6;
                        var21 = arg2;
                        var22 = arg5;
                        var23 = arg4;
                    } else {
                        int var24 = var11.field2527 + var13;
                        int var25 = var11.field2459 + var14;
                        if (var11.field2552 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = var14 > arg2 ? var14 : arg2;
                        var23 = arg4 < var13 ? var13 : arg4;
                        var20 = var24 < arg6 ? var24 : arg6;
                        var22 = arg5 <= var25 ? arg5 : var25;
                    }
                    if (var20 > var23 && var21 < var22) {
                        if (var11.field2476 != 0) {
                            if (class610.field9049 == var11.field2476 || class596.field8823 == var11.field2476) {
                                class82.method615(var14, var11.field2527, class596.field8823 == var11.field2476, var13, var11.field2459, false);
                                class104.field1511[var12] = true;
                                class99.field1445.method510(arg4, arg2, arg6, arg5);
                                continue;
                            }
                            if (class207.field3075 == var11.field2476) {
                                if (var11.method1170(class99.field1445, (byte) -55) != null) {
                                    class539.method3268(5);
                                    class615.method3609(class99.field1445, var11, arg3 ^ 0x55F2E325, var13, var14);
                                    class243.field3474[var12] = true;
                                    class99.field1445.method510(arg4, arg2, arg6, arg5);
                                }
                                continue;
                            }
                            if (class321.field4432 == var11.field2476) {
                                if (var11.method1170(class99.field1445, (byte) -83) != null) {
                                    class306.method1871(var14, var11, var13, -4);
                                    class243.field3474[var12] = true;
                                    class99.field1445.method510(arg4, arg2, arg6, arg5);
                                }
                                continue;
                            }
                            if (class196.field2892 == var11.field2476) {
                                class128.method902(var11.field2527, var14, 100, var13, class87.field1282, var11.field2459, class99.field1445);
                                class104.field1511[var12] = true;
                                class99.field1445.method510(arg4, arg2, arg6, arg5);
                                continue;
                            }
                            if (class367.field5075 == var11.field2476) {
                                class487.method2921(var11.field2459, var14, 126, var11.field2527, class99.field1445, var13);
                                class104.field1511[var12] = true;
                                class99.field1445.method510(arg4, arg2, arg6, arg5);
                                continue;
                            }
                            if (class63.field793 == var11.field2476) {
                                if (!class188.field2800 && !class310.field4281) {
                                    continue;
                                }
                                int var26 = var11.field2527 + var13;
                                int var27 = var14 + 15;
                                if (class188.field2800) {
                                    int var28 = -256;
                                    if (class36.field422 < 20) {
                                        var28 = -65536;
                                    }
                                    class465.field6539.method728("Fps:" + class36.field422, var27, false, -1, var28, var26);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class595.field8787) {
                                            class487.method2918((byte) -80);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class568.method3389(-104, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class465.field6539.method728("Mem:" + var30 + "k", var27, false, -1, var31, var26);
                                    var27 += 15;
                                    class465.field6539.method728("In:" + class627.field9227 + "B/s Out:" + class114.field1607 + "B/s", var27, false, -1, -256, var26);
                                    var27 += 15;
                                    int var33 = class99.field1445.method454() / 1024;
                                    class465.field6539.method728("Offheap:" + var33 + "k", var27, false, -1, var33 > 65536 ? -65536 : -256, var26);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 32; var37++) {
                                        var34 += class341.field4709[var37].method2940(-8719);
                                        var35 += class341.field4709[var37].method2942(arg3 + 1441990478);
                                        var36 += class341.field4709[var37].method2931((byte) -14);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class373.method2225((long) var39, 1616439168, 2, true, 0) + "% (" + var38 + "%)";
                                    class519.field7407.method728(var40, var27, false, -1, -256, var26);
                                    var27 += 12;
                                }
                                if (class297.field4079 > 0) {
                                    class519.field7407.method728("Particles: " + class1.field4 + " / " + class297.field4079, var27, false, -1, -256, var26);
                                }
                                var27 += 12;
                                if (class310.field4281) {
                                    class519.field7407.method728("Polys: " + class99.field1445.method420() + " Models: " + class99.field1445.method525(), var27, false, -1, -256, var26);
                                    var27 += 12;
                                    class519.field7407.method728("Ls: " + class5.field47 + " La: " + class568.field8374 + " NPC: " + class57.field715 + " Pl: " + class60.field756, var27, false, -1, -256, var26);
                                    class285.method1773((byte) 76);
                                    var27 += 12;
                                }
                                class104.field1511[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2552 == 0) {
                            if (class188.field2798 == var11.field2476 && class99.field1445.method423()) {
                                class99.field1445.method506(var13, var14, var11.field2527, var11.field2459);
                            }
                            method1416(var13 - var11.field2521, arg1, var21, -1441981280, var23, var22, var20, var11.field2456, var14 - var11.field2404, var12);
                            if (var11.field2462 != null) {
                                method1416(var13 - var11.field2521, var11.field2462, var21, arg3, var23, var22, var20, var11.field2456, var14 - var11.field2404, var12);
                            }
                            class243 var41 = (class243) class385.field5297.method2799((long) var11.field2456, true);
                            if (var41 != null) {
                                class335.method2047(var21, var20, var41.field3471, var14, var22, -1, var23, var12, var13);
                            }
                            if (class188.field2798 == var11.field2476 && class99.field1445.method423()) {
                                class99.field1445.method501();
                                class431.field5778 = true;
                            }
                            class99.field1445.method510(arg4, arg2, arg6, arg5);
                        }
                        if (class625.field9204[var12] || class527.field7535 > 1) {
                            if (var11.field2552 == 3) {
                                if (var15 == 0) {
                                    if (var11.field2553) {
                                        class99.field1445.method498(var13, var14, var11.field2527, var11.field2459, var11.field2421, 0);
                                    } else {
                                        class99.field1445.method445(var13, var14, var11.field2527, var11.field2459, var11.field2421, 0);
                                    }
                                } else if (var11.field2553) {
                                    class99.field1445.method498(var13, var14, var11.field2527, var11.field2459, var11.field2421 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class99.field1445.method445(var13, var14, var11.field2527, var11.field2459, var11.field2421 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field2552 == 4) {
                                class92 var42 = var11.method1164(-65, class99.field1445);
                                if (var42 != null) {
                                    int var43 = var11.field2421;
                                    String var44 = var11.field2470;
                                    if (var11.field2434 != -1) {
                                        class540 var45 = class150.field2242.method3606((byte) -107, var11.field2434);
                                        var44 = var45.field8105;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field8055 == 1 || var11.field2444 != 1) && var11.field2444 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class580.method3467(var11.field2444, 57);
                                        }
                                    }
                                    if (class230.field3374 == var11) {
                                        var44 = class93.field1395.method3408(95, class63.field795);
                                        var43 = var11.field2421;
                                    }
                                    if (class22.field222) {
                                        class99.field1445.method512(var13, var14, var11.field2527 + var13, var11.field2459 + var14);
                                    }
                                    var42.method730(var44, var11.field2542, null, var11.field2530, var11.field2459, var43 | 255 - (var15 & 0xFF) << 24, var11.field2502 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field2511, null, var11.field2527, var11.field2549, 0, var14, var13, 0, class416.field5639, 124);
                                    if (class22.field222) {
                                        class99.field1445.method510(arg4, arg2, arg6, arg5);
                                    }
                                } else if (class600.field8882) {
                                    class403.method2371(var11, (byte) -62);
                                }
                            } else if (var11.field2552 == 5) {
                                if (var11.field2427 >= 0) {
                                    var11.method1163(class351.field4786, 105, class97.field1414).method3381(var13, var14, class99.field1445, 0, var11.field2527, true, 0, var11.field2445 << 3, var11.field2459, var11.field2480 << 3);
                                } else {
                                    class53 var47;
                                    if (var11.field2434 == -1) {
                                        var47 = var11.method1161(-125, class99.field1445);
                                    } else {
                                        class560 var46 = var11.field2488 ? class541.field8119.field5127 : null;
                                        var47 = class150.field2242.method3597(var11.field2444, var46, class99.field1445, var11.field2495 | 0xFF000000, var11.field2432, var11.field2434, true, var11.field2402);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method326();
                                        int var49 = var47.method322();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field2421 == 0 ? 16777215 : var11.field2421 & 0xFFFFFF);
                                        if (var11.field2451) {
                                            class99.field1445.method512(var13, var14, var13 + var11.field2527, var14 - -var11.field2459);
                                            if (var11.field2417 != 0) {
                                                int var51 = (var11.field2527 + var48 - 1) / var48;
                                                int var52 = (var11.field2459 + var49 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field2421 == 0) {
                                                            var47.method328((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field2417);
                                                        } else {
                                                            var47.method327((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field2417, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field2421 == 0 && var15 == 0) {
                                                var47.method319(var13, var14, var11.field2527, var11.field2459);
                                            } else {
                                                var47.method329(var13, var14, var11.field2527, var11.field2459, 0, var50, 1);
                                            }
                                            class99.field1445.method510(arg4, arg2, arg6, arg5);
                                        } else if (var11.field2421 == 0 && var15 == 0) {
                                            if (var11.field2417 != 0) {
                                                var47.method328((float) var11.field2527 / 2.0F + (float) var13, (float) var11.field2459 / 2.0F + (float) var14, var11.field2527 * 4096 / var48, var11.field2417);
                                            } else if (var11.field2527 == var48 && var11.field2459 == var49) {
                                                var47.method316(var13, var14);
                                            } else {
                                                var47.method317(var13, var14, var11.field2527, var11.field2459);
                                            }
                                        } else if (var11.field2417 != 0) {
                                            var47.method327((float) var11.field2527 / 2.0F + (float) var13, (float) var11.field2459 / 2.0F + (float) var14, var11.field2527 * 4096 / var48, var11.field2417, 0, var50, 1);
                                        } else if (var11.field2527 == var48 && var11.field2459 == var49) {
                                            var47.method333(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method314(var13, var14, var11.field2527, var11.field2459, 0, var50, 1);
                                        }
                                    } else if (class600.field8882) {
                                        class403.method2371(var11, (byte) -62);
                                    }
                                }
                            } else if (var11.field2552 == 6) {
                                class261.method1658(-4654);
                                class159 var55 = null;
                                int var56 = 0;
                                if (var11.field2434 != -1) {
                                    class540 var64 = class150.field2242.method3606((byte) 48, var11.field2434);
                                    if (var64 != null) {
                                        class540 var65 = var64.method3279((byte) -94, var11.field2444);
                                        class78 var66 = var11.field2489 == -1 ? null : class463.field6521.method2983(var11.field2489, -123);
                                        class560 var67 = var11.field2488 ? class541.field8119.field5127 : null;
                                        var55 = var65.method3283(class99.field1445, 1, var67, var11.field2438, arg3 ^ 0xAA0D1CA0, var11.field2528, var11.field2506, var66, 2048);
                                        if (var55 == null) {
                                            class403.method2371(var11, (byte) -62);
                                        } else {
                                            var56 = -var55.method86() >> 1;
                                        }
                                    }
                                } else if (var11.field2529 == 5) {
                                    int var57 = var11.field2532;
                                    if (var57 >= 0 && var57 < 2048) {
                                        class373 var58 = class293.field4036[var57];
                                        class78 var59 = var11.field2489 == -1 ? null : class463.field6521.method2983(var11.field2489, -104);
                                        if (var58 != null && (class183.field2758 == var57 || class65.method414(arg3 ^ 0x55F2E326, var58.field5138) == var11.field2509)) {
                                            var55 = var58.field5127.method3369(class64.field797, class556.field8280, var59, var11.field2438, null, 0, -1, 0, true, 2048, var11.field2528, class99.field1445, null, class105.field1514, class150.field2242, class194.field2879, class463.field6521, (byte) 107, var11.field2506);
                                        }
                                    }
                                } else if (var11.field2529 == 8 || var11.field2529 == 9) {
                                    class38 var61 = class487.method2920(false, 13993, var11.field2532);
                                    class78 var62 = var11.field2489 == -1 ? null : class463.field6521.method2983(var11.field2489, arg3 ^ 0x55F2E32D);
                                    if (var61 != null) {
                                        class560 var63 = var11.field2488 ? class541.field8119.field5127 : null;
                                        var55 = var61.method249(var11.field2438, var63, var11.field2509, var11.field2529 == 9, class99.field1445, var11.field2506, 2048, -6, var62, var11.field2528);
                                    }
                                } else if (var11.field2489 == -1) {
                                    var55 = var11.method1169(class541.field8119.field5127, -1, class64.field797, class99.field1445, 2048, class463.field6521, -1, class194.field2879, class105.field1514, 0, 6435, class556.field8280, null, class150.field2242);
                                    if (var55 == null && class600.field8882) {
                                        class403.method2371(var11, (byte) -62);
                                    }
                                } else {
                                    class78 var60 = class463.field6521.method2983(var11.field2489, -123);
                                    var55 = var11.method1169(class541.field8119.field5127, var11.field2438, class64.field797, class99.field1445, 2048, class463.field6521, var11.field2506, class194.field2879, class105.field1514, var11.field2528, 6435, class556.field8280, var60, class150.field2242);
                                    if (var55 == null && class600.field8882) {
                                        class403.method2371(var11, (byte) -62);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field2512 > 0) {
                                        var68 = (var11.field2527 << 9) / var11.field2512;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field2515 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field2459 << 9) / var11.field2515;
                                    }
                                    int var70 = (var11.field2430 * var68 >> 9) + var11.field2527 / 2 + var13;
                                    int var71 = (var11.field2469 * var69 >> 9) + var11.field2459 / 2 + var14;
                                    class259.field3707.method336();
                                    class99.field1445.method483(class259.field3707);
                                    class99.field1445.method516(var70, var71, var68, var69);
                                    class99.field1445.method422((float) (var11.field2496 << 0), var11.field2439 ? (float) (var11.field2454 << 0) : (float) (var11.field2454 << 0) * 1.5F);
                                    if (arg7 == -1412584499 || class431.field5778) {
                                        class99.field1445.method479();
                                        class99.field1445.method465();
                                        class99.field1445.method510(arg4, arg2, arg6, arg5);
                                        class431.field5778 = false;
                                    }
                                    if (var11.field2400) {
                                        class99.field1445.method460(false);
                                    }
                                    int var72 = (var11.field2558 << 0) * class589.field8742[var11.field2409 << 3] >> 15;
                                    int var73 = (var11.field2558 << 0) * class589.field8735[var11.field2409 << 3] >> 15;
                                    class106.field1520.method345(-var11.field2482 << 3);
                                    class106.field1520.method352(var11.field2468 << 3);
                                    class106.field1520.method338(var11.field2408 << 0, var72 - (-(var11.field2410 << 0) - var56), (var11.field2410 << 0) + var73);
                                    class106.field1520.method342(var11.field2409 << 3);
                                    if (class22.field222) {
                                        class99.field1445.method512(var13, var14, var11.field2527 + var13, var11.field2459 + var14);
                                    }
                                    if (var11.field2439) {
                                        var55.method74(class106.field1520, null, var11.field2558 << 0, 1);
                                    } else {
                                        var55.method93(class106.field1520, null, 1);
                                    }
                                    if (class22.field222) {
                                        class99.field1445.method510(arg4, arg2, arg6, arg5);
                                    }
                                    if (var11.field2400) {
                                        class99.field1445.method460(true);
                                    }
                                    class99.field1445.method422(0.0F, 0.0F);
                                }
                            } else if (var11.field2552 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field2517) {
                                    var74 = var14 + var11.field2459;
                                    var75 = var11.field2527 + var13;
                                    var76 = var14;
                                    var77 = var13;
                                } else {
                                    var77 = var13;
                                    var74 = var14;
                                    var75 = var11.field2527 + var13;
                                    var76 = var11.field2459 + var14;
                                }
                                if (var11.field2522 == 1) {
                                    class99.field1445.method481(var77, var74, var75, var76, var11.field2421, 0);
                                } else {
                                    class99.field1445.method467(var77, var74, var75, var76, var11.field2421, var11.field2522, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -1441981280) {
            method1418(-117, 74, 92);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method1417(byte arg0) {
        field3183 = null;
        if (arg0 >= -84) {
            field3186 = 116;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Z")
    public static final boolean method1418(int arg0, int arg1, int arg2) {
        if (arg0 != 1408) {
            field3186 = -8;
        }
        field3188++;
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method1419(int arg0) {
        this.field3185.method3441();
        if (arg0 != 0) {
            field3183 = null;
        }
        field3184++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    public class218(int arg0) {
        this.field3185 = new NativeHeap(arg0);
    }
}
