import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class221 extends class143 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3435 = "Loaded title screen";

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3436 = 0;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3440 = 127;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3441 = 0;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[S")
    public static short[] field3439;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        if (class271.field4318 > 1) {
            class271.field4318--;
            class175.field2468 = class142.field1953;
        }
        if (class157.field2167 > 0) {
            class157.field2167--;
        }
        field3442++;
        if (class191.field2899) {
            class191.field2899 = false;
            class260.method1698(arg0 + 21074);
            return;
        }
        for (int var1 = 0; var1 < 100 && class261.method1700((byte) -64); var1++) {
        }
        if (class142.field1961 != 30) {
            return;
        }
        class47.method292((byte) -76, class231.field3614, 155);
        Object var2 = class82.field1129.field461;
        synchronized (class82.field1129.field461) {
            if (!class103.field1480) {
                class82.field1129.field471 = 0;
            } else if (class2.field15 != 0 || class82.field1129.field471 >= 40) {
                class231.field3614.method809(228, 0);
                int var3 = 0;
                class231.field3614.method1363(0, 103);
                int var4 = class231.field3614.field3280;
                for (int var5 = 0; var5 < class82.field1129.field471 && class231.field3614.field3280 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class82.field1129.field472[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class82.field1129.field473[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class82.field1129.field472[var5] == -1 && class82.field1129.field473[var5] == -1) {
                        var7 = true;
                        var8 = -1;
                        var6 = -1;
                    }
                    if (class294.field4683 != var8 || class39.field592 != var6) {
                        int var9 = var8 - class294.field4683;
                        class294.field4683 = var8;
                        int var10 = var6 - class39.field592;
                        class39.field592 = var6;
                        if (class200.field3038 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class231.field3614.method1385((class200.field3038 << 12) + var10 + (var9 << 6), true);
                            class200.field3038 = 0;
                        } else if (class200.field3038 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class231.field3614.method1363(class200.field3038 + 128, -67);
                            var10 += 128;
                            var9 += 128;
                            class231.field3614.method1385((var9 << 8) + var10, true);
                            class200.field3038 = 0;
                        } else if (class200.field3038 < 32) {
                            class231.field3614.method1363(class200.field3038 + 192, 118);
                            if (var7) {
                                class231.field3614.method1398(true, Integer.MIN_VALUE);
                            } else {
                                class231.field3614.method1398(true, var6 << 16 | var8);
                            }
                            class200.field3038 = 0;
                        } else {
                            class231.field3614.method1385(class200.field3038 + 57344, true);
                            if (var7) {
                                class231.field3614.method1398(true, Integer.MIN_VALUE);
                            } else {
                                class231.field3614.method1398(true, var6 << 16 | var8);
                            }
                            class200.field3038 = 0;
                        }
                    } else if (class200.field3038 < 2047) {
                        class200.field3038++;
                    }
                }
                class280.field4446++;
                class231.field3614.method1404(-1, class231.field3614.field3280 - var4);
                if (class82.field1129.field471 <= var3) {
                    class82.field1129.field471 = 0;
                } else {
                    class82.field1129.field471 -= var3;
                    for (int var11 = 0; var11 < class82.field1129.field471; var11++) {
                        class82.field1129.field473[var11] = class82.field1129.field473[var11 + var3];
                        class82.field1129.field472[var11] = class82.field1129.field472[var11 + var3];
                    }
                }
            }
        }
        if (class2.field15 != 0) {
            class232.field3630++;
            long var12 = (class251.field3922 - class192.field2935) / 50L;
            class192.field2935 = class251.field3922;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class25.field393;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class59.field826;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = (int) var12;
            byte var17 = 0;
            if (class2.field15 == 2) {
                var17 = 1;
            }
            class231.field3614.method809(248, 0);
            class231.field3614.method1385(var17 << 15 | var16, true);
            class231.field3614.method1398(true, var15 | var14 << 16);
        }
        if (class270.field4302 > 0) {
            class270.field4302--;
        }
        if (class115.field1653 && class270.field4302 <= 0) {
            class151.field2096++;
            class115.field1653 = false;
            class270.field4302 = 20;
            class231.field3614.method809(61, arg0 ^ 0xFFFFAE10);
            class231.field3614.method1371((int) class160.field2239, -126);
            class231.field3614.method1385((int) class123.field1743, true);
        }
        if (class75.field1050 && !class192.field2941) {
            class311.field5006++;
            class192.field2941 = true;
            class231.field3614.method809(150, 0);
            class231.field3614.method1363(1, arg0 ^ 0xFFFFAE7B);
        }
        if (!class75.field1050 && class192.field2941) {
            class311.field5006++;
            class192.field2941 = false;
            class231.field3614.method809(150, 0);
            class231.field3614.method1363(0, arg0 ^ 0xFFFFAE65);
        }
        if (!class25.field402) {
            class231.field3614.method809(109, arg0 + 20976);
            class314.field5062++;
            class231.field3614.method1393(arg0 - 2032561248, class81.method514((byte) 88));
            class25.field402 = true;
        }
        if (class183.field2772) {
            class183.field2772 = false;
        } else {
            class228.field3571 /= 2.0F;
        }
        if (class29.field453) {
            class29.field453 = false;
        } else {
            class254.field3960 /= 2.0F;
        }
        class95.method610((byte) 125);
        if (class142.field1961 != 30) {
            return;
        }
        class256.method1676(arg0 ^ 0x5193);
        class114.method726((byte) -5);
        class256.method1678(255);
        class281.field4457++;
        if (class281.field4457 > 750) {
            class260.method1698(arg0 ^ 0xFFFFAE6E);
            return;
        }
        class249.method1623(arg0 + 22193);
        class122.method787(29110);
        class184.method1176((byte) -60);
        for (int var18 = class291.method1951(true, true); var18 != -1; var18 = class291.method1951(false, true)) {
            class78.method502(var18, -114);
            class288.field4608[class32.method199(31, class282.field4480++)] = var18;
        }
        for (class39 var19 = class208.method1296(-127); var19 != null; var19 = class208.method1296(-112)) {
            int var20 = var19.method266((byte) -20);
            int var21 = var19.method264((byte) 95);
            if (var20 == 1) {
                class301.field4791[var21] = var19.field598;
                class303.field4807[class32.method199(31, class26.field417++)] = var21;
            } else if (var20 == 2) {
                class15.field282[var21] = var19.field603;
                class297.field4743[class32.method199(class218.field3359++, 31)] = var21;
            } else if (var20 == 3) {
                class178 var22 = class166.method1057(32, var21);
                if (!var19.field603.equals(var22.field2630)) {
                    var22.field2630 = var19.field603;
                    class312.method2108(false, var22);
                }
            } else if (var20 == 4) {
                class178 var23 = class166.method1057(-100, var21);
                int var24 = var19.field591;
                int var25 = var19.field598;
                int var26 = var19.field593;
                if (var23.field2581 != var25 || var23.field2693 != var26 || var23.field2635 != var24) {
                    var23.field2693 = var26;
                    var23.field2581 = var25;
                    var23.field2635 = var24;
                    class312.method2108(false, var23);
                }
            } else if (var20 == 5) {
                class178 var43 = class166.method1057(-115, var21);
                if (var19.field598 != var43.field2558 || var19.field598 == -1) {
                    var43.field2562 = 0;
                    var43.field2558 = var19.field598;
                    var43.field2566 = 0;
                    var43.field2681 = 1;
                    class312.method2108(false, var43);
                }
            } else if (var20 == 6) {
                int var27 = var19.field598;
                int var28 = var27 >> 10 & 0x1F;
                int var29 = var27 >> 5 & 0x1F;
                int var30 = var27 & 0x1F;
                class178 var31 = class166.method1057(arg0 + 21044, var21);
                int var32 = (var30 << 3) + (var28 << 19) + (var29 << 11);
                if (var31.field2544 != var32) {
                    var31.field2544 = var32;
                    class312.method2108(false, var31);
                }
            } else if (var20 == 7) {
                class178 var33 = class166.method1057(114, var21);
                boolean var34 = var19.field598 == 1;
                if (var33.field2648 != var34) {
                    var33.field2648 = var34;
                    class312.method2108(false, var33);
                }
            } else if (var20 == 8) {
                class178 var42 = class166.method1057(58, var21);
                if (var19.field598 != var42.field2627 || var19.field593 != var42.field2569 || var19.field591 != var42.field2682) {
                    var42.field2627 = var19.field598;
                    var42.field2569 = var19.field593;
                    var42.field2682 = var19.field591;
                    if (var42.field2560 != -1) {
                        if (var42.field2589 > 0) {
                            var42.field2682 = var42.field2682 * 32 / var42.field2589;
                        } else if (var42.field2530 > 0) {
                            var42.field2682 = var42.field2682 * 32 / var42.field2530;
                        }
                    }
                    class312.method2108(false, var42);
                }
            } else if (var20 == 9) {
                class178 var41 = class166.method1057(122, var21);
                if (var19.field598 != var41.field2560 || var19.field593 != var41.field2629) {
                    var41.field2629 = var19.field593;
                    var41.field2560 = var19.field598;
                    class312.method2108(false, var41);
                }
            } else if (var20 == 10) {
                class178 var35 = class166.method1057(45, var21);
                if (var19.field598 != var35.field2577 || var19.field593 != var35.field2613 || var19.field591 != var35.field2625) {
                    var35.field2625 = var19.field591;
                    var35.field2577 = var19.field598;
                    var35.field2613 = var19.field593;
                    class312.method2108(false, var35);
                }
            } else if (var20 == 11) {
                class178 var36 = class166.method1057(arg0 ^ 0xFFFFAE55, var21);
                var36.field2667 = var36.field2677 = var19.field598;
                var36.field2554 = var36.field2598 = var19.field593;
                var36.field2657 = 0;
                var36.field2636 = 0;
                class312.method2108(false, var36);
            } else if (var20 == 12) {
                class178 var37 = class166.method1057(arg0 + 20854, var21);
                int var38 = var19.field598;
                if (var37 != null && var37.field2608 == 0) {
                    if ((var37.field2579 - var37.field2571) < var38) {
                        var38 = var37.field2579 - var37.field2571;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field2701 != var38) {
                        var37.field2701 = var38;
                        class312.method2108(false, var37);
                    }
                }
            } else if (var20 == 13) {
                class178 var39 = class166.method1057(-96, var21);
                var39.field2596 = var19.field598;
            } else if (var20 == 14) {
                class178 var40 = class166.method1057(65, var21);
                var40.field2649 = var19.field598;
            }
        }
        class208.field3094++;
        if (class247.field3873 != 0) {
            class224.field3503 += 20;
            if (class224.field3503 >= 400) {
                class247.field3873 = 0;
            }
        }
        if (class229.field3590 != null) {
            class113.field1625++;
            if (class113.field1625 >= 15) {
                class312.method2108(false, class229.field3590);
                class229.field3590 = null;
            }
        }
        if (class307.field4933 != null) {
            class312.method2108(false, class307.field4933);
            if (class17.field304 > (class151.field2100 + 5) || class151.field2100 - 5 > class17.field304 || class249.field3891 > class310.field4997 + 5 || class310.field4997 - 5 > class249.field3891) {
                class226.field3538 = true;
            }
            class232.field3633++;
            if (class205.field3074 == 0) {
                if (class226.field3538 && class232.field3633 >= 5) {
                    if (class307.field4933 == class10.field106 && client.field4853 != class90.field1315) {
                        byte var44 = 0;
                        class178 var45 = class307.field4933;
                        if (class58.field812 == 1 && var45.field2694 == 206) {
                            var44 = 1;
                        }
                        if (var45.field2618[client.field4853] <= 0) {
                            var44 = 0;
                        }
                        class185.field2813++;
                        if (client.method2028(var45).method1990(arg0 ^ 0xFFFF86C1)) {
                            int var46 = class90.field1315;
                            int var47 = client.field4853;
                            var45.field2618[var47] = var45.field2618[var46];
                            var45.field2691[var47] = var45.field2691[var46];
                            var45.field2618[var46] = -1;
                            var45.field2691[var46] = 0;
                        } else if (var44 == 1) {
                            int var48 = class90.field1315;
                            int var49 = client.field4853;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var45.method1139(18612, var48 - 1, var48);
                                    var48--;
                                } else if (var49 > var48) {
                                    var45.method1139(18612, var48 + 1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var45.method1139(18612, client.field4853, class90.field1315);
                        }
                        class231.field3614.method809(146, arg0 + 20976);
                        class231.field3614.method1375(class307.field4933.field2545, -98);
                        class231.field3614.method1385(class90.field1315, true);
                        class231.field3614.method1392(true, client.field4853);
                        class231.field3614.method1400(49152, var44);
                    }
                } else if ((class60.field835 == 1 || class147.method924(class179.field2721 - 1, true)) && class179.field2721 > 2) {
                    class160.method996((byte) -42);
                } else if (class179.field2721 > 0) {
                    class37.method253((byte) -125);
                }
                class113.field1625 = 10;
                class307.field4933 = null;
                class2.field15 = 0;
            }
        }
        class171.field2442 = false;
        class50.field713 = null;
        class178 var50 = class36.field549;
        class36.field549 = null;
        class178 var51 = class271.field4315;
        class34.field514 = 0;
        class225.field3529 = false;
        class271.field4315 = null;
        while (class19.method130((byte) 120) && class34.field514 < 128) {
            class126.field1777[class34.field514] = class113.field1618;
            class149.field2033[class34.field514] = class27.field432;
            class34.field514++;
        }
        class164.field2335 = null;
        if (class104.field1499 != -1) {
            class240.method1574(class218.field3386, -1, 0, class104.field1499, 0, 0, 0, class174.field2460);
        }
        class142.field1953++;
        if (class164.field2335 != null) {
            class111.method706(false);
        }
        while (true) {
            class272 var52;
            class178 var53;
            class178 var54;
            do {
                var52 = (class272) class231.field3608.method364(arg0 ^ 0xFFFFAE66);
                if (var52 == null) {
                    while (true) {
                        class272 var55;
                        class178 var56;
                        class178 var57;
                        do {
                            var55 = (class272) class12.field199.method364(114);
                            if (var55 == null) {
                                while (true) {
                                    class272 var58;
                                    class178 var59;
                                    class178 var60;
                                    do {
                                        var58 = (class272) class303.field4846.method364(118);
                                        if (var58 == null) {
                                            if (class164.field2335 == null) {
                                                class69.field991 = 0;
                                            }
                                            if (class8.field92 != null) {
                                                class251.method1631((byte) -70);
                                            }
                                            if (class245.field3846 > 0 && class233.field3651[82] && class233.field3651[81] && class157.field2161 != 0) {
                                                int var61 = class166.field2364 - class157.field2161;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class136.method854(class250.field3905.field4143[0] + class228.field3570, var61, class170.field2421 + class250.field3905.field4053[0], (byte) 106);
                                            }
                                            if (class245.field3846 > 0 && class233.field3651[82] && class233.field3651[81]) {
                                                if (class275.field4360 != -1) {
                                                    class136.method854(class275.field4360 + class228.field3570, class166.field2364, class170.field2421 + class249.field3889, (byte) 109);
                                                }
                                                class242.field3808 = 0;
                                                class258.field4178 = 0;
                                            } else if (class258.field4178 == 2) {
                                                if (class275.field4360 != -1) {
                                                    class231.field3614.method809(216, arg0 ^ 0xFFFFAE10);
                                                    class271.field4316++;
                                                    class231.field3614.method1392(true, class195.field2994);
                                                    class231.field3614.method1361(-2021929176, class275.field4360 + class228.field3570);
                                                    class231.field3614.method1398(true, class142.field1952);
                                                    class231.field3614.method1371(class249.field3889 + class170.field2421, arg0 ^ 0x51AD);
                                                    class189.field2873 = class25.field393;
                                                    class247.field3873 = 1;
                                                    class224.field3503 = 0;
                                                    class17.field299 = class59.field826;
                                                }
                                                class258.field4178 = 0;
                                            } else if (class242.field3808 == 2) {
                                                if (class275.field4360 != -1) {
                                                    class231.field3614.method809(125, 0);
                                                    class151.field2098++;
                                                    class231.field3614.method1371(class275.field4360 + class228.field3570, -65);
                                                    class231.field3614.method1385(class249.field3889 + class170.field2421, true);
                                                    class17.field299 = class59.field826;
                                                    class189.field2873 = class25.field393;
                                                    class224.field3503 = 0;
                                                    class247.field3873 = 1;
                                                }
                                                class242.field3808 = 0;
                                            } else if (class275.field4360 != -1 && class258.field4178 == 0 && class242.field3808 == 0) {
                                                int var62 = (class275.field4360 << 1) + 1 - class250.field3905.method1683(-81) >> 1;
                                                int var63 = (class249.field3889 << 1) - (class250.field3905.method1683(-127) - 1) >> 1;
                                                class231.method1517(0, 32148, var63, var62);
                                                class247.field3873 = 1;
                                                class17.field299 = class59.field826;
                                                class224.field3503 = 0;
                                                class189.field2873 = class25.field393;
                                                class143.method898(0, 0, var62, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var63);
                                            }
                                            class275.field4360 = -1;
                                            class265.method1722((byte) -119);
                                            if (class271.field4315 != var51) {
                                                if (var51 != null) {
                                                    class312.method2108(false, var51);
                                                }
                                                if (class271.field4315 != null) {
                                                    class312.method2108(false, class271.field4315);
                                                }
                                            }
                                            if (class36.field549 != var50 && class7.field79 == class272.field4344) {
                                                if (var50 != null) {
                                                    class312.method2108(false, var50);
                                                }
                                                if (class36.field549 != null) {
                                                    class312.method2108(false, class36.field549);
                                                }
                                            }
                                            if (class36.field549 == null) {
                                                if (class7.field79 > 0) {
                                                    class7.field79--;
                                                }
                                            } else if (class7.field79 < class272.field4344) {
                                                class7.field79++;
                                                if (class7.field79 == class272.field4344) {
                                                    class312.method2108(false, class36.field549);
                                                }
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class310.field4994[var64]++;
                                            }
                                            int var65 = class12.method72((byte) 34);
                                            int var66 = class211.method1306((byte) 107);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class157.field2167 = 250;
                                                class233.field3645++;
                                                class63.method389(-38, 14500);
                                                class231.field3614.method809(209, 0);
                                            }
                                            if (class205.field3072 != null && class205.field3072.field4570 == 1) {
                                                if (class205.field3072.field4567 != null) {
                                                    class60.method378(class141.field1942, class298.field4746, (byte) 120);
                                                }
                                                class141.field1942 = false;
                                                class298.field4746 = null;
                                                class205.field3072 = null;
                                            }
                                            class288.field4606++;
                                            class211.field3190++;
                                            class15.field273++;
                                            if (class15.field273 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class15.field273 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class249.field3895 += class101.field1447;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class302.field4805 += class99.field1437;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class281.field4467 += class129.field1801;
                                                }
                                            }
                                            if (class249.field3895 < -50) {
                                                class101.field1447 = 2;
                                            }
                                            if (class302.field4805 < -40) {
                                                class99.field1437 = 1;
                                            }
                                            if (class288.field4606 > 500) {
                                                class288.field4606 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class179.field2712 += class63.field850;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class42.field627 += class278.field4424;
                                                }
                                            }
                                            if (class179.field2712 < -60) {
                                                class63.field850 = 2;
                                            }
                                            if (arg0 != -20976) {
                                                method1447(-57);
                                            }
                                            if (class249.field3895 > 50) {
                                                class101.field1447 = -2;
                                            }
                                            if (class281.field4467 < -55) {
                                                class129.field1801 = 2;
                                            }
                                            if (class281.field4467 > 55) {
                                                class129.field1801 = -2;
                                            }
                                            if (class302.field4805 > 40) {
                                                class99.field1437 = -1;
                                            }
                                            if (class179.field2712 > 60) {
                                                class63.field850 = -2;
                                            }
                                            if (class42.field627 < -20) {
                                                class278.field4424 = 1;
                                            }
                                            if (class42.field627 > 10) {
                                                class278.field4424 = -1;
                                            }
                                            if (class211.field3190 > 50) {
                                                class231.field3614.method809(218, arg0 + 20976);
                                                class268.field4300++;
                                            }
                                            if (class43.field657) {
                                                class181.method1157(true);
                                                class43.field657 = false;
                                            }
                                            try {
                                                if (class272.field4332 != null && class231.field3614.field3280 > 0) {
                                                    class272.field4332.method1202((byte) -90, 0, class231.field3614.field3280, class231.field3614.field3287);
                                                    class211.field3190 = 0;
                                                    class231.field3614.field3280 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class260.method1698(118);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4337;
                                        if (var59.field2576 < 0) {
                                            break;
                                        }
                                        var60 = class166.method1057(81, var59.field2675);
                                    } while (var60 == null || var60.field2642 == null || var60.field2642.length <= var59.field2576 || var60.field2642[var59.field2576] != var59);
                                    class160.method994((byte) -112, var58);
                                }
                            }
                            var56 = var55.field4337;
                            if (var56.field2576 < 0) {
                                break;
                            }
                            var57 = class166.method1057(arg0 + 20879, var56.field2675);
                        } while (var57 == null || var57.field2642 == null || var56.field2576 >= var57.field2642.length || var57.field2642[var56.field2576] != var56);
                        class160.method994((byte) -112, var55);
                    }
                }
                var53 = var52.field4337;
                if (var53.field2576 < 0) {
                    break;
                }
                var54 = class166.method1057(118, var53.field2675);
            } while (var54 == null || var54.field2642 == null || var54.field2642.length <= var53.field2576 || var54.field2642[var53.field2576] != var53);
            class160.method994((byte) -112, var52);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lcm;B)V")
    public static final void method1448(class256 arg0, byte arg1) {
        if (class35.field533 == arg0.field4082 || arg0.field4133 == -1 || arg0.field4107 != 0 || (arg0.field4112 + 1) > class280.method1815(arg0.field4133, -34).field2966[arg0.field4099]) {
            int var2 = arg0.field4082 - arg0.field4037;
            int var3 = class35.field533 - arg0.field4037;
            int var4 = arg0.field4071 * 128 + (arg0.method1683(-87) * 64);
            int var5 = arg0.field4036 * 128 + (arg0.method1683(-111) * 64);
            int var6 = arg0.field4061 * 128 + (arg0.method1683(-115) * 64);
            int var7 = arg0.field4084 * 128 + arg0.method1683(-109) * 64;
            arg0.field4081 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field4140 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        arg0.field4068 = 0;
        if (arg0.field4101 == 0) {
            arg0.field4142 = 1024;
        }
        field3438++;
        if (arg0.field4101 == 1) {
            arg0.field4142 = 1536;
        }
        if (arg1 <= 110) {
            method1448((class256) null, (byte) 3);
        }
        if (arg0.field4101 == 2) {
            arg0.field4142 = 0;
        }
        if (arg0.field4101 == 3) {
            arg0.field4142 = 512;
        }
        arg0.field4093 = arg0.field4142;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public static final boolean method1449(int arg0, int arg1) {
        class248 var2 = class202.method1261(20006, arg1);
        field3437++;
        if (var2 == null) {
            return false;
        } else if (class52.field745 == 1 || class52.field745 == 2 || class241.field3789 == 2) {
            class26.field409 = var2.field3886;
            class211.field3178 = var2.field3878;
            if (class241.field3789 != 0) {
                class240.field3748 = class211.field3178 + 40000;
                class34.field519 = class240.field3748;
                class249.field3888 = class211.field3178 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class241.field3789 != arg0) {
                var3 = ":" + (var2.field3878 + 7000);
            }
            if (class258.field4165 != null) {
                var4 = "/p=" + class258.field4165;
            }
            String var5 = "http://" + var2.field3886 + var3 + "/l=" + class129.field1799 + "/a=" + class148.field2026 + var4 + "/j" + (class48.field695 ? "1" : "0") + ",o" + (class72.field1036 ? "1" : "0") + ",a2,m" + (class200.field3042 ? "1" : "0");
            try {
                class70.field1023.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method1450(int arg0) {
        field3435 = null;
        if (arg0 <= 54) {
            field3439 = null;
        }
        field3439 = null;
    }
}
