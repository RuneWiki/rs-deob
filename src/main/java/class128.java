import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class128 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "B")
    public byte field1904;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lgm;")
    public class102 field1912;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Luo;")
    public class135 field1908;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Llm;")
    public class248 field1909;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lrm;")
    public class79 field1910;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIII[Lfi;)V")
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class38[] arg9) {
        field1911++;
        class376.field5542.method571(arg0, arg3, arg2, arg8);
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class38 var11 = arg9[var10];
            if (var11 != null && (var11.field600 == arg7 || arg7 == -1412584499 && class374.field5527 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class489.field7147[class500.field7273].setBounds(var11.field627 + arg1, var11.field540 + arg4, var11.field629, var11.field591);
                    var12 = class500.field7273++;
                } else {
                    var12 = arg5;
                }
                var11.field620 = var12;
                var11.field598 = class446.field6625;
                if (!client.method3083(var11)) {
                    if (var11.field593 != 0) {
                        class157.method1141((byte) 101, var11);
                    }
                    int var13 = var11.field627 + arg1;
                    int var14 = var11.field540 + arg4;
                    int var15 = var11.field566;
                    if (class267.field4246 && (client.method3078(var11).field1503 != 0 || var11.field503 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class374.field5527 == var11) {
                        if (arg7 != -1412584499 && (class321.field4858 == var11.field547 || class147.field2185 == var11.field547)) {
                            class206.field3162 = arg4;
                            class456.field6778 = arg9;
                            class488.field7134 = arg1;
                            continue;
                        }
                        if (class155.field2384 && class178.field2725) {
                            int var16 = class377.field5570.method1475((byte) 51);
                            int var17 = class377.field5570.method1484(-22647);
                            int var18 = var16 - class299.field4606;
                            int var19 = var17 - class515.field7500;
                            if (var18 < class483.field7078) {
                                var18 = class483.field7078;
                            }
                            if (var19 < class380.field5598) {
                                var19 = class380.field5598;
                            }
                            if (var11.field629 + var18 > class483.field7078 + class530.field7741.field629) {
                                var18 = class483.field7078 + class530.field7741.field629 - var11.field629;
                            }
                            var13 = var18;
                            if (var11.field591 + var19 > class380.field5598 + class530.field7741.field591) {
                                var19 = class530.field7741.field591 + class380.field5598 - var11.field591;
                            }
                            var14 = var19;
                        }
                        if (class147.field2185 == var11.field547) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field503 == 2) {
                        var23 = arg0;
                        var24 = arg2;
                        var25 = arg8;
                        var22 = arg3;
                    } else {
                        int var20 = var11.field629 + var13;
                        int var21 = var11.field591 + var14;
                        var22 = var14 <= arg3 ? arg3 : var14;
                        var23 = var13 <= arg0 ? arg0 : var13;
                        if (var11.field503 == 9) {
                            var21++;
                            var20++;
                        }
                        var24 = arg2 > var20 ? var20 : arg2;
                        var25 = arg8 > var21 ? var21 : arg8;
                    }
                    if (var24 > var23 && var25 > var22) {
                        if (var11.field593 != 0) {
                            if (class456.field6785 == var11.field593 || class19.field214 == var11.field593) {
                                class448.method2756(var11.field591, true, var13, class19.field214 == var11.field593, var14, var11.field629);
                                class434.field6439[var12] = true;
                                class376.field5542.method571(arg0, arg3, arg2, arg8);
                                continue;
                            }
                            if (class98.field1528 == var11.field593) {
                                if (var11.method260(48, class376.field5542) != null) {
                                    class425.method2644(27576);
                                    class286.method1925(class376.field5542, var11, var13, var14, (byte) 123);
                                    class327.field4946[var12] = true;
                                    class376.field5542.method571(arg0, arg3, arg2, arg8);
                                }
                                continue;
                            }
                            if (class311.field4746 == var11.field593) {
                                if (var11.method260(23, class376.field5542) != null) {
                                    class195.method1402(var13, arg6 + 65531, var14, var11);
                                    class327.field4946[var12] = true;
                                    class376.field5542.method571(arg0, arg3, arg2, arg8);
                                }
                                continue;
                            }
                            if (class201.field3109 == var11.field593) {
                                class366.method2331(class130.field1930, var11.field629, var11.field591, var13, var14, arg6 - 4964, class376.field5542);
                                class434.field6439[var12] = true;
                                class376.field5542.method571(arg0, arg3, arg2, arg8);
                                continue;
                            }
                            if (class195.field3044 == var11.field593) {
                                class68.method492((byte) -98, var11.field629, var14, var11.field591, var13, class376.field5542);
                                class434.field6439[var12] = true;
                                class376.field5542.method571(arg0, arg3, arg2, arg8);
                                continue;
                            }
                            if (class420.field6164 == var11.field593) {
                                if (!class191.field2931 && !class118.field1821) {
                                    continue;
                                }
                                int var26 = var13 + var11.field629;
                                int var27 = var14 + 15;
                                if (class191.field2931) {
                                    int var28 = -256;
                                    if (class324.field4916 < 20) {
                                        var28 = -65536;
                                    }
                                    class54.field833.method2050(var26, "Fps:" + class324.field4916, -1, var27, 11308, var28);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class54.field833.method2050(var26, "Mem:" + var30 + "k", -1, var27, 11308, var31);
                                    var27 += 15;
                                    class54.field833.method2050(var26, "In:" + class417.field6132 + "B/s Out:" + class112.field1670 + "B/s", -1, var27, arg6 + 11307, -256);
                                    var27 += 15;
                                    int var32 = class376.field5542.method543() / 1024;
                                    class54.field833.method2050(var26, "Offheap:" + var32 + "k", -1, var27, 11308, var32 <= 65536 ? -256 : -65536);
                                    var27 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 30; var36++) {
                                        var33 += class47.field750[var36].method2232((byte) 33);
                                        var34 += class47.field750[var36].method2238(-108);
                                        var35 += class47.field750[var36].method2227(0);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class190.method1310(2, true, (long) var38, 0, arg6 + 9) + "% (" + var37 + "%)";
                                    class532.field7770.method2050(var26, var39, -1, var27, 11308, -256);
                                    var27 += 12;
                                }
                                if (class285.field4447 > 0) {
                                    class532.field7770.method2050(var26, "Particles: " + class37.field473 + " / " + class285.field4447, -1, var27, arg6 ^ 0x2C2D, -256);
                                }
                                var27 += 12;
                                if (class118.field1821) {
                                    class532.field7770.method2050(var26, "Polys: " + class376.field5542.method590() + " Models: " + class376.field5542.method513(), -1, var27, arg6 + 11307, -256);
                                    var27 += 12;
                                    class532.field7770.method2050(var26, "Ls: " + class34.field410 + " La: " + class31.field378 + " NPC: " + class18.field204 + " Pl: " + class46.field733, -1, var27, 11308, -256);
                                    var27 += 12;
                                    class450.method2762((byte) 55);
                                }
                                class434.field6439[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field503 == 0) {
                            if (class86.field1410 == var11.field593 && class376.field5542.method544()) {
                                class376.field5542.method523(var13, var14, var11.field629, var11.field591);
                            }
                            method941(var23, var13 - var11.field488, var24, var22, var14 - var11.field504, var12, arg6, var11.field580, var25, arg9);
                            if (var11.field610 != null) {
                                method941(var23, var13 - var11.field488, var24, var22, var14 - var11.field504, var12, arg6, var11.field580, var25, var11.field610);
                            }
                            class295 var40 = (class295) class215.field3248.method358((byte) 102, (long) var11.field580);
                            if (var40 != null) {
                                class275.method1878(var22, var25, var40.field4546, var23, var24, var14, (byte) -69, var13, var12);
                            }
                            if (class86.field1410 == var11.field593 && class376.field5542.method544()) {
                                class376.field5542.method499();
                                class336.field5067 = true;
                            }
                            class376.field5542.method571(arg0, arg3, arg2, arg8);
                        }
                        if (class147.field2184[var12] || class490.field7148 > 1) {
                            if (var11.field503 == 3) {
                                if (var15 == 0) {
                                    if (var11.field616) {
                                        class376.field5542.method506(var13, var14, var11.field629, var11.field591, var11.field493, 0);
                                    } else {
                                        class376.field5542.method602(var13, var14, var11.field629, var11.field591, var11.field493, 0);
                                    }
                                } else if (var11.field616) {
                                    class376.field5542.method506(var13, var14, var11.field629, var11.field591, var11.field493 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class376.field5542.method602(var13, var14, var11.field629, var11.field591, var11.field493 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field503 == 4) {
                                class310 var41 = var11.method264(arg6 ^ 0xFFFF9245, class376.field5542);
                                if (var41 != null) {
                                    int var42 = var11.field493;
                                    String var43 = var11.field569;
                                    if (var11.field499 != -1) {
                                        class221 var44 = class300.field4608.method2088(var11.field499, arg6 + 125);
                                        var43 = var44.field3377;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((var44.field3374 == 1 || var11.field626 != 1) && var11.field626 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class13.method79(0, var11.field626);
                                        }
                                    }
                                    if (class416.field6108 == var11) {
                                        var43 = class433.field6434.method1265(class345.field5141, arg6 - 65);
                                        var42 = var11.field493;
                                    }
                                    if (class431.field6386) {
                                        class376.field5542.method599(var13, var14, var11.field629 + var13, var14 - -var11.field591);
                                    }
                                    var41.method2060(var11.field629, var11.field591, var11.field551, var11.field615, var11.field545, null, var43, null, (byte) -117, 0, var11.field565 ? 255 - (var15 & 0xFF) << 24 : -1, var14, 0, var11.field613, class470.field6906, var13, 255 - (var15 & 0xFF) << 24 | var42);
                                    if (class431.field6386) {
                                        class376.field5542.method571(arg0, arg3, arg2, arg8);
                                    }
                                } else if (class304.field4658) {
                                    class5.method27(var11, -208246073);
                                }
                            } else if (var11.field503 == 5) {
                                if (var11.field586 < 0) {
                                    class363 var45;
                                    if (var11.field499 == -1) {
                                        var45 = var11.method252(10896, class376.field5542);
                                    } else {
                                        class286 var46 = var11.field651 ? class116.field1781.field7460 : null;
                                        var45 = class300.field4608.method2082(var11.field499, var11.field496 | 0xFF000000, var11.field626, var46, (byte) -10, class376.field5542, var11.field544, var11.field558);
                                    }
                                    if (var45 != null) {
                                        int var47 = var45.method394();
                                        int var48 = var45.method396();
                                        int var49 = (var11.field493 == 0 ? 16777215 : var11.field493 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field560) {
                                            class376.field5542.method599(var13, var14, var11.field629 + var13, var14 - -var11.field591);
                                            if (var11.field482 != 0) {
                                                int var50 = (var47 + var11.field629 - 1) / var47;
                                                int var51 = (var48 + var11.field591 - 1) / var48;
                                                for (int var52 = 0; var52 < var50; var52++) {
                                                    for (int var53 = 0; var53 < var51; var53++) {
                                                        if (var11.field493 == 0) {
                                                            var45.method2317((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field482);
                                                        } else {
                                                            var45.method2319((float) var47 / 2.0F + (float) (var13 + (var47 * var52)), (float) var48 / 2.0F + (float) (var14 - -(var48 * var53)), 4096, var11.field482, 0, var49, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field493 == 0 && var15 == 0) {
                                                var45.method2321(var13, var14, var11.field629, var11.field591);
                                            } else {
                                                var45.method389(var13, var14, var11.field629, var11.field591, 0, var49, 1);
                                            }
                                            class376.field5542.method571(arg0, arg3, arg2, arg8);
                                        } else if (var11.field493 == 0 && var15 == 0) {
                                            if (var11.field482 != 0) {
                                                var45.method2317((float) var11.field629 / 2.0F + (float) var13, (float) var11.field591 / 2.0F + (float) var14, var11.field629 * 4096 / var47, var11.field482);
                                            } else if (var11.field629 == var47 && var11.field591 == var48) {
                                                var45.method2316(var13, var14);
                                            } else {
                                                var45.method2320(var13, var14, var11.field629, var11.field591);
                                            }
                                        } else if (var11.field482 != 0) {
                                            var45.method2319((float) var11.field629 / 2.0F + (float) var13, (float) var11.field591 / 2.0F + (float) var14, var11.field629 * 4096 / var47, var11.field482, 0, var49, 1);
                                        } else if (var11.field629 == var47 && var11.field591 == var48) {
                                            var45.method392(var13, var14, 0, var49, 1);
                                        } else {
                                            var45.method395(var13, var14, var11.field629, var11.field591, 0, var49, 1);
                                        }
                                    } else if (class304.field4658) {
                                        class5.method27(var11, -208246073);
                                    }
                                } else {
                                    var11.method263(class436.field6496, class335.field5044, 11).method2937(var14, 0, var11.field562 << 3, 0, var11.field583 << 3, class376.field5542, 76, var11.field629, var11.field591, var13);
                                }
                            } else if (var11.field503 == 6) {
                                class321.method2120((byte) -61);
                                class289 var54 = null;
                                int var55 = 0;
                                if (var11.field499 != -1) {
                                    class221 var63 = class300.field4608.method2088(var11.field499, 108);
                                    if (var63 != null) {
                                        class221 var64 = var63.method1521(var11.field626, 2120825824);
                                        class61 var65 = var11.field553 == -1 ? null : class393.field5735.method1538(-4031, var11.field553);
                                        class286 var66 = var11.field651 ? class116.field1781.field7460 : null;
                                        var54 = var64.method1527(var11.field487, class376.field5542, 1, var65, var11.field509, var66, 2048, var11.field486, (byte) -110);
                                        if (var54 == null) {
                                            class5.method27(var11, -208246073);
                                        } else {
                                            var55 = -var54.method654() >> 1;
                                        }
                                    }
                                } else if (var11.field640 == 5) {
                                    int var60 = var11.field491;
                                    if (var60 >= 0 && var60 < 2048) {
                                        class511 var61 = class530.field7747[var60];
                                        class61 var62 = var11.field553 == -1 ? null : class393.field5735.method1538(arg6 - 4032, var11.field553);
                                        if (var61 != null && (class517.field7513 == var60 || class522.method3116(var61.field7437, 6157) == var11.field632)) {
                                            var54 = var61.field7460.method1927(class300.field4608, null, class393.field5735, var11.field509, 96, class315.field4808, var11.field486, class306.field4682, class376.field5542, var11.field487, var62, 2048, null, 0, -1, class462.field6842, 0, true, class288.field4476);
                                        }
                                    }
                                } else if (var11.field640 == 8 || var11.field640 == 9) {
                                    class100 var57 = class48.method323(arg6 ^ 0x80000001, false, var11.field491);
                                    class61 var58 = var11.field553 == -1 ? null : class393.field5735.method1538(-4031, var11.field553);
                                    if (var57 != null) {
                                        class286 var59 = var11.field651 ? class116.field1781.field7460 : null;
                                        var54 = var57.method817(var11.field640 == 9, 2048, var59, var58, class376.field5542, var11.field509, var11.field487, var11.field632, arg6 ^ 0xA07, var11.field486);
                                    }
                                } else if (var11.field553 == -1) {
                                    var54 = var11.method261(0, true, class315.field4808, class393.field5735, 2048, class288.field4476, class300.field4608, -1, class376.field5542, class462.field6842, class116.field1781.field7460, class306.field4682, null, -1);
                                    if (var54 == null && class304.field4658) {
                                        class5.method27(var11, -208246073);
                                    }
                                } else {
                                    class61 var56 = class393.field5735.method1538(-4031, var11.field553);
                                    var54 = var11.method261(var11.field509, true, class315.field4808, class393.field5735, 2048, class288.field4476, class300.field4608, var11.field487, class376.field5542, class462.field6842, class116.field1781.field7460, class306.field4682, var56, var11.field486);
                                    if (var54 == null && class304.field4658) {
                                        class5.method27(var11, -208246073);
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (var11.field575 > 0) {
                                        var67 = (var11.field629 << 9) / var11.field575;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68;
                                    if (var11.field570 > 0) {
                                        var68 = (var11.field591 << 9) / var11.field570;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = var13 + (var11.field629 / 2) + (var11.field573 * var67 >> 9);
                                    int var70 = var11.field591 / 2 + (var11.field631 * var68 >> 9) + var14;
                                    class517.field7515.method964();
                                    class376.field5542.method582(class517.field7515);
                                    class376.field5542.method541(var69, var70, var67, var68);
                                    class376.field5542.method606((float) (var11.field641 << 0), var11.field519 ? (float) (var11.field510 << 0) : (float) (var11.field510 << 0) * 1.5F);
                                    if (arg7 == -1412584499 || class336.field5067) {
                                        class376.field5542.method577();
                                        class376.field5542.method593();
                                        class376.field5542.method571(arg0, arg3, arg2, arg8);
                                        class336.field5067 = false;
                                    }
                                    if (var11.field596) {
                                        class376.field5542.method509(false);
                                    }
                                    int var71 = (var11.field647 << 0) * class58.field891[var11.field572 << 3] >> 15;
                                    int var72 = (var11.field647 << 0) * class58.field889[var11.field572 << 3] >> 15;
                                    class510.field7421.method954(-var11.field517 << 3);
                                    class510.field7421.method952(var11.field611 << 3);
                                    class510.field7421.method957(var11.field571 << 0, (var11.field539 << 0) + var55 + var71, (var11.field539 << 0) + var72);
                                    class510.field7421.method959(var11.field572 << 3);
                                    if (class431.field6386) {
                                        class376.field5542.method599(var13, var14, var11.field629 + var13, var11.field591 + var14);
                                    }
                                    if (var11.field519) {
                                        var54.method656(class510.field7421, null, var11.field647 << 0, 1);
                                    } else {
                                        var54.method673(class510.field7421, null, 1);
                                    }
                                    if (class431.field6386) {
                                        class376.field5542.method571(arg0, arg3, arg2, arg8);
                                    }
                                    if (var11.field596) {
                                        class376.field5542.method509(true);
                                    }
                                    class376.field5542.method606(0.0F, 0.0F);
                                }
                            } else if (var11.field503 == 9) {
                                int var73;
                                int var74;
                                int var75;
                                int var76;
                                if (var11.field637) {
                                    var75 = var11.field629 + var13;
                                    var76 = var14;
                                    var73 = var11.field591 + var14;
                                    var74 = var13;
                                } else {
                                    var73 = var14;
                                    var74 = var13;
                                    var75 = var11.field629 + var13;
                                    var76 = var11.field591 + var14;
                                }
                                if (var11.field564 == 1) {
                                    class376.field5542.method555(var74, var73, var75, var76, var11.field493, 0);
                                } else {
                                    class376.field5542.method494(var74, var73, var75, var76, var11.field493, var11.field564, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != 1) {
            field1916 = -19;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(BIIIII)V")
    public class128(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1906 = arg3;
        this.field1914 = arg4;
        this.field1907 = arg1;
        this.field1904 = arg0;
        this.field1905 = arg5;
        this.field1913 = arg2;
    }

    static {
        new class179(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
