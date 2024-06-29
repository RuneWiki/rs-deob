import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class140 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method968(int arg0, byte arg1) {
        if (arg1 > -38) {
            return;
        }
        field1861++;
        if (class520.field7691 == 0) {
            class117.field1641.method2230(arg0, 109);
        } else {
            class411.field5487 = arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[Leo;IIIII)V", line = 28)
    public static final void method969(int arg0, int arg1, int arg2, int arg3, class423[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1859++;
        class512.field7538.method925(arg8, arg2, arg3, arg9);
        int var10 = 0;
        if (arg6 != -10) {
            return;
        }
        while (var10 < arg4.length) {
            class423 var11 = arg4[var10];
            if (var11 != null && (var11.field5823 == arg7 || arg7 == -1412584499 && class465.field6838 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class486.field7058[class5.field43].setBounds(var11.field5808 + arg0, var11.field5802 + arg5, var11.field5735, var11.field5726);
                    var12 = class5.field43++;
                } else {
                    var12 = arg1;
                }
                var11.field5805 = class264.field3353;
                var11.field5811 = var12;
                if (!client.method3033(var11)) {
                    label581: {
                        if (var11.field5800 != 0) {
                            class243.method1527((byte) 125, var11);
                        }
                        int var13 = var11.field5808 + arg0;
                        int var14 = var11.field5802 + arg5;
                        int var15 = var11.field5814;
                        if (class285.field3633 && (client.method3037(var11).field3305 != 0 || var11.field5741 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class465.field6838 == var11) {
                            if (arg7 != -1412584499 && (class51.field692 == var11.field5730 || class333.field4259 == var11.field5730)) {
                                class34.field540 = arg4;
                                class358.field4613 = arg5;
                                class509.field7473 = arg0;
                                break label581;
                            }
                            if (class188.field2470 && class141.field1871) {
                                int var16 = class268.field3397.method717((byte) 82);
                                int var17 = class268.field3397.method721((byte) 74);
                                int var18 = var17 - class227.field2929;
                                int var19 = var16 - class108.field1479;
                                if (class108.field1480 > var19) {
                                    var19 = class108.field1480;
                                }
                                if (var18 < class219.field2814) {
                                    var18 = class219.field2814;
                                }
                                if ((class108.field1480 + class12.field198.field5735) < (var19 + var11.field5735)) {
                                    var19 = class12.field198.field5735 + class108.field1480 - var11.field5735;
                                }
                                if ((var18 + var11.field5726) > (class219.field2814 + class12.field198.field5726)) {
                                    var18 = class219.field2814 + class12.field198.field5726 - var11.field5726;
                                }
                                var13 = var19;
                                var14 = var18;
                            }
                            if (class333.field4259 == var11.field5730) {
                                var15 = 128;
                            }
                        }
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (var11.field5741 == 2) {
                            var25 = arg3;
                            var24 = arg9;
                            var23 = arg8;
                            var22 = arg2;
                        } else {
                            int var20 = var11.field5735 + var13;
                            int var21 = var11.field5726 + var14;
                            var22 = var14 > arg2 ? var14 : arg2;
                            if (var11.field5741 == 9) {
                                var20++;
                                var21++;
                            }
                            var23 = var13 > arg8 ? var13 : arg8;
                            var24 = arg9 > var21 ? var21 : arg9;
                            var25 = var20 < arg3 ? var20 : arg3;
                        }
                        if (var23 < var25 && var22 < var24) {
                            if (var11.field5800 != 0) {
                                if (class181.field2364 == var11.field5800 || class518.field7672 == var11.field5800) {
                                    class363.method2132(var11.field5726, var11.field5735, class518.field7672 == var11.field5800, var13, 119, var14);
                                    class76.field967[var12] = true;
                                    class512.field7538.method925(arg8, arg2, arg3, arg9);
                                    break label581;
                                }
                                if (class22.field415 == var11.field5800) {
                                    if (var11.method2498(25733, class512.field7538) != null) {
                                        class100.method679(16384);
                                        class301.method1807(var14, 32, var11, class512.field7538, var13);
                                        class264.field3343[var12] = true;
                                        class512.field7538.method925(arg8, arg2, arg3, arg9);
                                    }
                                    break label581;
                                }
                                if (class402.field5339 == var11.field5800) {
                                    if (var11.method2498(25733, class512.field7538) != null) {
                                        class61.method348(var13, var14, var11, (byte) 105);
                                        class264.field3343[var12] = true;
                                        class512.field7538.method925(arg8, arg2, arg3, arg9);
                                    }
                                    break label581;
                                }
                                if (class93.field1306 == var11.field5800) {
                                    class296.method1782(class202.field2653, (byte) -82, var14, var11.field5726, var11.field5735, var13, class512.field7538);
                                    class76.field967[var12] = true;
                                    class512.field7538.method925(arg8, arg2, arg3, arg9);
                                    break label581;
                                }
                                if (class51.field702 == var11.field5800) {
                                    class331.method1976(var14, var11.field5735, class512.field7538, var11.field5726, var13, 0);
                                    class76.field967[var12] = true;
                                    class512.field7538.method925(arg8, arg2, arg3, arg9);
                                    break label581;
                                }
                                if (class19.field331 == var11.field5800) {
                                    if (!class232.field2998 && !class517.field7623) {
                                        break label581;
                                    }
                                    int var26 = var11.field5735 + var13;
                                    int var27 = var14 + 15;
                                    if (class232.field2998) {
                                        class43.field635.method1113(-83, var26, var27, "Fps:" + class130.field1775, -256, -1);
                                        var27 += 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        int var30 = -256;
                                        if (var29 > 65536) {
                                            var30 = -65536;
                                        }
                                        class43.field635.method1113(arg6 ^ 0xFFFFFFB8, var26, var27, "Mem:" + var29 + "k", var30, -1);
                                        var27 += 15;
                                        class43.field635.method1113(-109, var26, var27, "In:" + class396.field5268 + "B/s Out:" + class508.field7465 + "B/s", -256, -1);
                                        var27 += 15;
                                        int var31 = class512.field7538.method917() / 1024;
                                        class43.field635.method1113(73, var26, var27, "Offheap:" + var31 + "k", var31 <= 65536 ? -256 : -65536, -1);
                                        var27 += 15;
                                        int var32 = 0;
                                        int var33 = 0;
                                        int var34 = 0;
                                        for (int var35 = 0; var35 < 30; var35++) {
                                            var32 += class212.field2718[var35].method2364((byte) 73);
                                            var33 += class212.field2718[var35].method2359(19);
                                            var34 += class212.field2718[var35].method2362(54);
                                        }
                                        int var36 = var34 * 100 / var32;
                                        int var37 = var33 * 10000 / var32;
                                        String var38 = "Cache:" + class275.method1691((long) var37, 2, -108, true, 0) + "% (" + var36 + "%)";
                                        class254.field3211.method1113(arg6 - 78, var26, var27, var38, -256, -1);
                                        var27 += 12;
                                    }
                                    if (class77.field983 > 0) {
                                        class254.field3211.method1113(arg6 + 129, var26, var27, "Particles: " + class189.field2483 + " / " + class77.field983, -256, -1);
                                    }
                                    var27 += 12;
                                    if (class517.field7623) {
                                        class254.field3211.method1113(28, var26, var27, "Polys: " + class512.field7538.method889() + " Models: " + class512.field7538.method872(), -256, -1);
                                        var27 += 12;
                                        class254.field3211.method1113(112, var26, var27, "Ls: " + class199.field2561 + " La: " + class156.field2062 + " NPC: " + class214.field2736 + " Pl: " + class419.field5574, -256, -1);
                                        var27 += 12;
                                        class36.method232(arg6 ^ 0xFFFFFFF5);
                                    }
                                    class76.field967[var12] = true;
                                    break label581;
                                }
                            }
                            if (var11.field5741 == 0) {
                                if (class458.field6402 == var11.field5800 && class512.field7538.method879()) {
                                    class512.field7538.method833(var13, var14, var11.field5735, var11.field5726);
                                }
                                method969(var13 - var11.field5678, var12, var22, var25, arg4, var14 - var11.field5686, -10, var11.field5734, var23, var24);
                                if (var11.field5679 != null) {
                                    method969(var13 - var11.field5678, var12, var22, var25, var11.field5679, var14 - var11.field5686, arg6, var11.field5734, var23, var24);
                                }
                                class367 var39 = (class367) class381.field4963.method2085((long) var11.field5734, arg6 ^ 0x1527);
                                if (var39 != null) {
                                    class141.method971(var25, var13, var24, var23, arg6 ^ 0x9, var22, var14, var39.field4719, var12);
                                }
                                if (class458.field6402 == var11.field5800 && class512.field7538.method879()) {
                                    class512.field7538.method911();
                                    class417.field5549 = true;
                                }
                                class512.field7538.method925(arg8, arg2, arg3, arg9);
                            }
                            if (class316.field4074[var12] || class13.field231 > 1) {
                                if (var11.field5741 == 3) {
                                    if (var15 == 0) {
                                        if (var11.field5739) {
                                            class512.field7538.method861(var13, var14, var11.field5735, var11.field5726, var11.field5728, 0);
                                        } else {
                                            class512.field7538.method918(var13, var14, var11.field5735, var11.field5726, var11.field5728, 0);
                                        }
                                    } else if (var11.field5739) {
                                        class512.field7538.method861(var13, var14, var11.field5735, var11.field5726, 255 - (var15 & 0xFF) << 24 | var11.field5728 & 0xFFFFFF, 1);
                                    } else {
                                        class512.field7538.method918(var13, var14, var11.field5735, var11.field5726, var11.field5728 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    }
                                } else if (var11.field5741 == 4) {
                                    class167 var40 = var11.method2502(arg6 ^ 0x9, class512.field7538);
                                    if (var40 != null) {
                                        int var41 = var11.field5728;
                                        String var42 = var11.field5758;
                                        if (var11.field5763 != -1) {
                                            class497 var43 = class89.field1238.method111(var11.field5763, -116);
                                            var42 = var43.field7262;
                                            if (var42 == null) {
                                                var42 = "null";
                                            }
                                            if ((var43.field7298 == 1 || var11.field5753 != 1) && var11.field5753 != -1) {
                                                var42 = "<col=ff9040>" + var42 + "</col> x" + class486.method2906(var11.field5753, true);
                                            }
                                        }
                                        if (class310.field4000 == var11) {
                                            var42 = class348.field4448.method1127(class379.field4920, false);
                                            var41 = var11.field5728;
                                        }
                                        if (class126.field1730) {
                                            class512.field7538.method899(var13, var14, var11.field5735 + var13, var11.field5726 + var14);
                                        }
                                        var40.method1116(var11.field5705 ? 255 - (var15 & 0xFF) << 24 : -1, null, null, var11.field5663, class334.field4280, var11.field5735, var11.field5759, var11.field5726, var13, var11.field5671, var42, var14, 0, var41 | 255 - (var15 & 0xFF) << 24, 0, 0, var11.field5715);
                                        if (class126.field1730) {
                                            class512.field7538.method925(arg8, arg2, arg3, arg9);
                                        }
                                    } else if (class7.field60) {
                                        class415.method2440(arg6 ^ 0xFFFFFFFC, var11);
                                    }
                                } else if (var11.field5741 == 5) {
                                    if (var11.field5694 >= 0) {
                                        var11.method2506(class264.field3355, 0, class261.field3316).method2817(var14, var13, var11.field5735, var11.field5726, var11.field5787 << 3, var11.field5782 << 3, 0, 0, class512.field7538, true);
                                    } else {
                                        class404 var45;
                                        if (var11.field5763 == -1) {
                                            var45 = var11.method2503(arg6 + 16777225, class512.field7538);
                                        } else {
                                            class345 var44 = var11.field5690 ? class37.field573.field7655 : null;
                                            var45 = class89.field1238.method113(false, var44, var11.field5673, var11.field5683, var11.field5753, var11.field5736 | 0xFF000000, var11.field5763, class512.field7538);
                                        }
                                        if (var45 != null) {
                                            int var46 = var45.method370();
                                            int var47 = var45.method369();
                                            int var48 = (var11.field5728 == 0 ? 16777215 : var11.field5728 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                            if (var11.field5713) {
                                                class512.field7538.method899(var13, var14, var11.field5735 + var13, var14 - -var11.field5726);
                                                if (var11.field5793 != 0) {
                                                    int var49 = (var46 + var11.field5735 - 1) / var46;
                                                    int var50 = (var11.field5726 + var47 - 1) / var47;
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        for (int var52 = 0; var52 < var50; var52++) {
                                                            if (var11.field5728 == 0) {
                                                                var45.method2403((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field5793);
                                                            } else {
                                                                var45.method2402((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field5793, 0, var48, 1);
                                                            }
                                                        }
                                                    }
                                                } else if (var11.field5728 == 0 && var15 == 0) {
                                                    var45.method2405(var13, var14, var11.field5735, var11.field5726);
                                                } else {
                                                    var45.method377(var13, var14, var11.field5735, var11.field5726, 0, var48, 1);
                                                }
                                                class512.field7538.method925(arg8, arg2, arg3, arg9);
                                            } else if (var11.field5728 == 0 && var15 == 0) {
                                                if (var11.field5793 != 0) {
                                                    var45.method2403((float) var11.field5735 / 2.0F + (float) var13, (float) var11.field5726 / 2.0F + (float) var14, var11.field5735 * 4096 / var46, var11.field5793);
                                                } else if (var11.field5735 == var46 && var11.field5726 == var47) {
                                                    var45.method2406(var13, var14);
                                                } else {
                                                    var45.method2407(var13, var14, var11.field5735, var11.field5726);
                                                }
                                            } else if (var11.field5793 != 0) {
                                                var45.method2402((float) var11.field5735 / 2.0F + (float) var13, (float) var11.field5726 / 2.0F + (float) var14, var11.field5735 * 4096 / var46, var11.field5793, 0, var48, 1);
                                            } else if (var11.field5735 == var46 && var11.field5726 == var47) {
                                                var45.method353(var13, var14, 0, var48, 1);
                                            } else {
                                                var45.method356(var13, var14, var11.field5735, var11.field5726, 0, var48, 1);
                                            }
                                        } else if (class7.field60) {
                                            class415.method2440(10, var11);
                                        }
                                    }
                                } else if (var11.field5741 == 6) {
                                    class345.method2027((byte) -102);
                                    class507 var53 = null;
                                    int var54 = 0;
                                    if (var11.field5763 != -1) {
                                        class497 var62 = class89.field1238.method111(var11.field5763, -96);
                                        if (var62 != null) {
                                            class497 var63 = var62.method2978(var11.field5753, (byte) 61);
                                            class44 var64 = var11.field5792 == -1 ? null : class403.field5429.method1962(var11.field5792, false);
                                            class345 var65 = var11.field5690 ? class37.field573.field7655 : null;
                                            var53 = var63.method2974(2048, var11.field5667, 10, class512.field7538, 1, var11.field5691, var11.field5807, var64, var65);
                                            if (var53 == null) {
                                                class415.method2440(arg6 ^ 0xFFFFFFFC, var11);
                                            } else {
                                                var54 = -var53.method507() >> 1;
                                            }
                                        }
                                    } else if (var11.field5727 == 5) {
                                        int var59 = var11.field5677;
                                        if (var59 >= 0 && var59 < 2048) {
                                            class518 var60 = class76.field952[var59];
                                            class44 var61 = var11.field5792 == -1 ? null : class403.field5429.method1962(var11.field5792, false);
                                            if (var60 != null && (class166.field2149 == var59 || class278.method1702(var60.field7630, 0) == var11.field5760)) {
                                                var53 = var60.field7655.method2022(2048, var61, class192.field2495, class331.field4255, var11.field5691, class403.field5429, true, -1, var11.field5667, true, null, var11.field5807, class198.field2555, class512.field7538, 0, null, 0, class167.field2161, class89.field1238);
                                            }
                                        }
                                    } else if (var11.field5727 == 8 || var11.field5727 == 9) {
                                        class378 var56 = class188.method1235(false, (byte) -122, var11.field5677);
                                        class44 var57 = var11.field5792 == -1 ? null : class403.field5429.method1962(var11.field5792, false);
                                        if (var56 != null) {
                                            class345 var58 = var11.field5690 ? class37.field573.field7655 : null;
                                            var53 = var56.method2204(var11.field5727 == 9, var11.field5691, var11.field5807, var58, 65535, var11.field5667, class512.field7538, var57, 2048, var11.field5760);
                                        }
                                    } else if (var11.field5792 == -1) {
                                        var53 = var11.method2492(class331.field4255, class512.field7538, class403.field5429, -1, 0, class198.field2555, null, class37.field573.field7655, -1, 24562, class167.field2161, class192.field2495, 2048, class89.field1238);
                                        if (var53 == null && class7.field60) {
                                            class415.method2440(arg6 + 20, var11);
                                        }
                                    } else {
                                        class44 var55 = class403.field5429.method1962(var11.field5792, false);
                                        var53 = var11.method2492(class331.field4255, class512.field7538, class403.field5429, var11.field5667, var11.field5691, class198.field2555, var55, class37.field573.field7655, var11.field5807, 24562, class167.field2161, class192.field2495, 2048, class89.field1238);
                                        if (var53 == null && class7.field60) {
                                            class415.method2440(10, var11);
                                        }
                                    }
                                    if (var53 != null) {
                                        int var66;
                                        if (var11.field5796 <= 0) {
                                            var66 = 512;
                                        } else {
                                            var66 = (var11.field5735 << 9) / var11.field5796;
                                        }
                                        int var67;
                                        if (var11.field5742 > 0) {
                                            var67 = (var11.field5726 << 9) / var11.field5742;
                                        } else {
                                            var67 = 512;
                                        }
                                        int var68 = var11.field5735 / 2 + (var13 + (var11.field5825 * var66 >> 9));
                                        int var69 = (var11.field5794 * var67 >> 9) + var11.field5726 / 2 + var14;
                                        class168.field2199.method979();
                                        class512.field7538.method829(class168.field2199);
                                        class512.field7538.method821(var68, var69, var66, var67);
                                        class512.field7538.method913((float) (var11.field5731 << 0), var11.field5675 ? (float) (var11.field5777 << 0) : (float) (var11.field5777 << 0) * 1.5F);
                                        if (arg7 == -1412584499 || class417.field5549) {
                                            class512.field7538.method865();
                                            class512.field7538.method822();
                                            class512.field7538.method925(arg8, arg2, arg3, arg9);
                                            class417.field5549 = false;
                                        }
                                        if (var11.field5749) {
                                            class512.field7538.method825(false);
                                        }
                                        int var70 = (var11.field5762 << 0) * class21.field385[var11.field5669 << 3] >> 15;
                                        int var71 = (var11.field5762 << 0) * class21.field397[var11.field5669 << 3] >> 15;
                                        class340.field4340.method985(-var11.field5773 << 3);
                                        class340.field4340.method990(var11.field5766 << 3);
                                        class340.field4340.method993(var11.field5795 << 0, (var11.field5670 << 0) + (var70 + var54), (var11.field5670 << 0) + var71);
                                        class340.field4340.method981(var11.field5669 << 3);
                                        if (class126.field1730) {
                                            class512.field7538.method899(var13, var14, var13 + var11.field5735, var11.field5726 + var14);
                                        }
                                        if (var11.field5675) {
                                            var53.method512(class340.field4340, null, var11.field5762 << 0, 1);
                                        } else {
                                            var53.method520(class340.field4340, null, 1);
                                        }
                                        if (class126.field1730) {
                                            class512.field7538.method925(arg8, arg2, arg3, arg9);
                                        }
                                        if (var11.field5749) {
                                            class512.field7538.method825(true);
                                        }
                                        class512.field7538.method913(0.0F, 0.0F);
                                    }
                                } else if (var11.field5741 == 9) {
                                    int var72;
                                    int var73;
                                    int var74;
                                    int var75;
                                    if (var11.field5729) {
                                        var74 = var14;
                                        var72 = var11.field5726 + var14;
                                        var73 = var11.field5735 + var13;
                                        var75 = var13;
                                    } else {
                                        var72 = var14;
                                        var73 = var13 + var11.field5735;
                                        var74 = var11.field5726 + var14;
                                        var75 = var13;
                                    }
                                    if (var11.field5674 == 1) {
                                        class512.field7538.method891(var75, var72, var73, var74, var11.field5728, 0);
                                    } else {
                                        class512.field7538.method830(var75, var72, var73, var74, var11.field5728, var11.field5674, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }
}
