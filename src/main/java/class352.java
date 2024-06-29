import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class352 {

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "[Ljl;")
    public static class179[] field5193;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
    public static int[] field5197;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lbj;")
    public static class162 field5196;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "[I")
    public static int[] field5192;

    static {
        new class309("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field5193 = new class179[30];
        field5197 = new int[8];
        field5196 = new class162(11, -1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII[Lgh;IIIII)V", line = 3)
    public static final void method2181(int arg0, int arg1, int arg2, int arg3, class388[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5195++;
        if (arg8 > -29) {
            method2182(null, 37, -70);
        }
        class262.field4006.method371(arg7, arg2, arg9, arg5);
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class388 var11 = arg4[var10];
            if (var11 != null && (var11.field5728 == arg6 || arg6 == -1412584499 && class253.field3885 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class31.field498[class108.field1986].setBounds(var11.field5701 + arg3, var11.field5778 + arg0, var11.field5745, var11.field5712);
                    var12 = class108.field1986++;
                } else {
                    var12 = arg1;
                }
                var11.field5780 = var12;
                var11.field5685 = class62.field1268;
                if (!client.method1365(var11)) {
                    if (var11.field5765 != 0) {
                        class433.method2600(7623, var11);
                    }
                    int var13 = var11.field5701 + arg3;
                    int var14 = var11.field5778 + arg0;
                    int var15 = var11.field5722;
                    if (class321.field4902 && (client.method1371(var11).field1911 != 0 || var11.field5784 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class253.field3885 == var11) {
                        if (arg6 != -1412584499 && (class94.field1858 == var11.field5750 || class479.field7067 == var11.field5750)) {
                            class303.field4544 = arg0;
                            class224.field3510 = arg3;
                            class441.field6558 = arg4;
                            continue;
                        }
                        if (class387.field5659 && class208.field3329) {
                            int var16 = class393.field5991.method132(95);
                            int var17 = class393.field5991.method139(-88);
                            int var18 = var16 - class239.field3704;
                            int var19 = var17 - class460.field6855;
                            if (var18 < class409.field6190) {
                                var18 = class409.field6190;
                            }
                            if (class318.field4841 > var19) {
                                var19 = class318.field4841;
                            }
                            if ((class409.field6190 + class44.field779.field5745) < (var11.field5745 + var18)) {
                                var18 = class409.field6190 + class44.field779.field5745 - var11.field5745;
                            }
                            var13 = var18;
                            if ((class318.field4841 + class44.field779.field5712) < (var19 + var11.field5712)) {
                                var19 = class318.field4841 + class44.field779.field5712 - var11.field5712;
                            }
                            var14 = var19;
                        }
                        if (class479.field7067 == var11.field5750) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field5784 == 2) {
                        var22 = arg2;
                        var23 = arg7;
                        var25 = arg5;
                        var24 = arg9;
                    } else {
                        int var20 = var11.field5745 + var13;
                        int var21 = var11.field5712 + var14;
                        var22 = var14 > arg2 ? var14 : arg2;
                        if (var11.field5784 == 9) {
                            var20++;
                            var21++;
                        }
                        var23 = var13 <= arg7 ? arg7 : var13;
                        var24 = var20 < arg9 ? var20 : arg9;
                        var25 = arg5 <= var21 ? arg5 : var21;
                    }
                    if (var24 > var23 && var25 > var22) {
                        if (var11.field5765 != 0) {
                            if (class154.field2507 == var11.field5765 || class335.field5065 == var11.field5765) {
                                class56.method510(var11.field5745, true, var13, var11.field5712, class335.field5065 == var11.field5765, var14);
                                class486.field7167[var12] = true;
                                class262.field4006.method371(arg7, arg2, arg9, arg5);
                                continue;
                            }
                            if (class235.field3628 == var11.field5765) {
                                if (var11.method2389(class262.field4006, true) != null) {
                                    class42.method255(-114);
                                    class183.method1252(class262.field4006, var14, 32, var11, var13);
                                    class188.field3023[var12] = true;
                                    class262.field4006.method371(arg7, arg2, arg9, arg5);
                                }
                                continue;
                            }
                            if (class405.field6101 == var11.field5765) {
                                if (var11.method2389(class262.field4006, true) != null) {
                                    class510.method3059(var13, 109, var11, var14);
                                    class188.field3023[var12] = true;
                                    class262.field4006.method371(arg7, arg2, arg9, arg5);
                                }
                                continue;
                            }
                            if (class199.field3247 == var11.field5765) {
                                class492.method2968(var11.field5712, var13, class262.field4006, class173.field2792, var14, 80, var11.field5745);
                                class486.field7167[var12] = true;
                                class262.field4006.method371(arg7, arg2, arg9, arg5);
                                continue;
                            }
                            if (class442.field6563 == var11.field5765) {
                                class444.method2657(true, var11.field5745, class262.field4006, var14, var11.field5712, var13);
                                class486.field7167[var12] = true;
                                class262.field4006.method371(arg7, arg2, arg9, arg5);
                                continue;
                            }
                            if (class211.field3373 == var11.field5765) {
                                if (!class1.field32 && !class307.field4661) {
                                    continue;
                                }
                                int var26 = var11.field5745 + var13;
                                int var27 = var14 + 15;
                                if (class1.field32) {
                                    int var28 = -256;
                                    if (class506.field7385 < 20) {
                                        var28 = -65536;
                                    }
                                    class470.field6980.method2015(69, "Fps:" + class506.field7385, -1, var27, var26, var28);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class470.field6980.method2015(93, "Mem:" + var30 + "k", -1, var27, var26, var31);
                                    var27 += 15;
                                    class470.field6980.method2015(119, "In:" + class335.field5066 + "B/s Out:" + class258.field3948 + "B/s", -1, var27, var26, -256);
                                    var27 += 15;
                                    int var32 = class262.field4006.method317() / 1024;
                                    class470.field6980.method2015(104, "Offheap:" + var32 + "k", -1, var27, var26, var32 > 65536 ? -65536 : -256);
                                    var27 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 30; var36++) {
                                        var33 += field5193[var36].method1234(-119);
                                        var34 += field5193[var36].method1232(-111);
                                        var35 += field5193[var36].method1233(-86);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class519.method3080((long) var38, true, 3, 0, 2) + "% (" + var37 + "%)";
                                    class276.field4179.method2015(24, var39, -1, var27, var26, -256);
                                    var27 += 12;
                                }
                                if (class274.field4163 > 0) {
                                    class276.field4179.method2015(49, "Particles: " + class492.field7216 + " / " + class274.field4163, -1, var27, var26, -256);
                                }
                                var27 += 12;
                                if (class307.field4661) {
                                    class276.field4179.method2015(28, "Polys: " + class262.field4006.method427() + " Models: " + class262.field4006.method331(), -1, var27, var26, -256);
                                    var27 += 12;
                                    class276.field4179.method2015(35, "Ls: " + class135.field2275 + " La: " + class70.field1408 + " NPC: " + class250.field3864 + " Pl: " + class454.field6756, -1, var27, var26, -256);
                                    class298.method1922(-21237);
                                    var27 += 12;
                                }
                                class486.field7167[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field5784 == 0) {
                            if (class354.field5222 == var11.field5765 && class262.field4006.method334()) {
                                class262.field4006.method278(var13, var14, var11.field5745, var11.field5712);
                            }
                            method2181(var14 - var11.field5740, var12, var22, var13 - var11.field5782, arg4, var25, var11.field5700, var23, -32, var24);
                            if (var11.field5819 != null) {
                                method2181(var14 - var11.field5740, var12, var22, var13 - var11.field5782, var11.field5819, var25, var11.field5700, var23, -76, var24);
                            }
                            class141 var40 = (class141) class470.field6975.method1622((long) var11.field5700, -118);
                            if (var40 != null) {
                                class106.method909(var14, var12, var22, var23, var24, var13, var40.field2342, var25, true);
                            }
                            if (class354.field5222 == var11.field5765 && class262.field4006.method334()) {
                                class262.field4006.method419();
                                class196.field3151 = true;
                            }
                            class262.field4006.method371(arg7, arg2, arg9, arg5);
                        }
                        if (class420.field6338[var12] || class47.field974 > 1) {
                            if (var11.field5784 == 3) {
                                if (var15 == 0) {
                                    if (var11.field5822) {
                                        class262.field4006.method327(var13, var14, var11.field5745, var11.field5712, var11.field5674, 0);
                                    } else {
                                        class262.field4006.method365(var13, var14, var11.field5745, var11.field5712, var11.field5674, 0);
                                    }
                                } else if (var11.field5822) {
                                    class262.field4006.method327(var13, var14, var11.field5745, var11.field5712, var11.field5674 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class262.field4006.method365(var13, var14, var11.field5745, var11.field5712, 255 - (var15 & 0xFF) << 24 | var11.field5674 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field5784 == 4) {
                                class317 var41 = var11.method2388(class262.field4006, -118);
                                if (var41 != null) {
                                    int var42 = var11.field5674;
                                    String var43 = var11.field5725;
                                    if (var11.field5688 != -1) {
                                        class12 var44 = class135.field2271.method1636(var11.field5688, -124);
                                        var43 = var44.field192;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((var44.field200 == 1 || var11.field5776 != 1) && var11.field5776 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class185.method1264(var11.field5776, 1);
                                        }
                                    }
                                    if (class299.field4518 == var11) {
                                        var43 = class187.field3006.method1977(class146.field2452, -71);
                                        var42 = var11.field5674;
                                    }
                                    if (class46.field967) {
                                        class262.field4006.method344(var13, var14, var11.field5745 + var13, var14 - -var11.field5712);
                                    }
                                    var41.method2003(null, class420.field6340, 255 - (var15 & 0xFF) << 24 | var42, var13, null, var11.field5707 ? 255 - (var15 & 0xFF) << 24 : -1, var14, 0, (byte) 113, var11.field5824, 0, var11.field5801, var43, var11.field5717, var11.field5745, var11.field5712, var11.field5809);
                                    if (class46.field967) {
                                        class262.field4006.method371(arg7, arg2, arg9, arg5);
                                    }
                                } else if (class518.field7507) {
                                    class429.method2587(var11, (byte) -63);
                                }
                            } else if (var11.field5784 == 5) {
                                if (var11.field5813 >= 0) {
                                    var11.method2387((byte) 98, class159.field2574, class464.field6883).method2827(class262.field4006, var13, var11.field5792 << 3, var11.field5712, 0, var11.field5745, var14, -36, var11.field5821 << 3, 0);
                                } else {
                                    class24 var45;
                                    if (var11.field5688 == -1) {
                                        var45 = var11.method2377((byte) -102, class262.field4006);
                                    } else {
                                        class370 var46 = var11.field5739 ? class15.field266.field5343 : null;
                                        var45 = class135.field2271.method1640(var46, var11.field5776, var11.field5764, var11.field5688, class262.field4006, var11.field5811 | 0xFF000000, var11.field5805, 77);
                                    }
                                    if (var45 != null) {
                                        int var47 = var45.method147();
                                        int var48 = var45.method165();
                                        int var49 = (var11.field5674 == 0 ? 16777215 : var11.field5674 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field5804) {
                                            class262.field4006.method344(var13, var14, var11.field5745 + var13, var11.field5712 + var14);
                                            if (var11.field5742 != 0) {
                                                int var50 = (var11.field5745 + var47 - 1) / var47;
                                                int var51 = (var11.field5712 + var48 - 1) / var48;
                                                for (int var52 = 0; var52 < var50; var52++) {
                                                    for (int var53 = 0; var53 < var51; var53++) {
                                                        if (var11.field5674 == 0) {
                                                            var45.method164((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var14 - -(var48 * var53)), 4096, var11.field5742);
                                                        } else {
                                                            var45.method156((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var14 - -(var48 * var53)), 4096, var11.field5742, 0, var49, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field5674 == 0 && var15 == 0) {
                                                var45.method162(var13, var14, var11.field5745, var11.field5712);
                                            } else {
                                                var45.method152(var13, var14, var11.field5745, var11.field5712, 0, var49, 1);
                                            }
                                            class262.field4006.method371(arg7, arg2, arg9, arg5);
                                        } else if (var11.field5674 == 0 && var15 == 0) {
                                            if (var11.field5742 != 0) {
                                                var45.method164((float) var11.field5745 / 2.0F + (float) var13, (float) var11.field5712 / 2.0F + (float) var14, var11.field5745 * 4096 / var47, var11.field5742);
                                            } else if (var11.field5745 == var47 && var11.field5712 == var48) {
                                                var45.method159(var13, var14);
                                            } else {
                                                var45.method151(var13, var14, var11.field5745, var11.field5712);
                                            }
                                        } else if (var11.field5742 != 0) {
                                            var45.method156((float) var11.field5745 / 2.0F + (float) var13, (float) var11.field5712 / 2.0F + (float) var14, var11.field5745 * 4096 / var47, var11.field5742, 0, var49, 1);
                                        } else if (var11.field5745 == var47 && var11.field5712 == var48) {
                                            var45.method167(var13, var14, 0, var49, 1);
                                        } else {
                                            var45.method163(var13, var14, var11.field5745, var11.field5712, 0, var49, 1);
                                        }
                                    } else if (class518.field7507) {
                                        class429.method2587(var11, (byte) -63);
                                    }
                                }
                            } else if (var11.field5784 == 6) {
                                class242.method1579((byte) 112);
                                class374 var54 = null;
                                int var55 = 0;
                                if (var11.field5688 != -1) {
                                    class12 var56 = class135.field2271.method1636(var11.field5688, -103);
                                    if (var56 != null) {
                                        class12 var57 = var56.method75(0, var11.field5776);
                                        class57 var58 = var11.field5737 == -1 ? null : class422.field6355.method236(var11.field5737, (byte) 113);
                                        class370 var59 = var11.field5739 ? class15.field266.field5343 : null;
                                        var54 = var57.method74(2048, var11.field5747, var11.field5678, var59, class262.field4006, var11.field5672, var58, (byte) -90, 1);
                                        if (var54 == null) {
                                            class429.method2587(var11, (byte) -63);
                                        } else {
                                            var55 = -var54.method736() >> 1;
                                        }
                                    }
                                } else if (var11.field5785 == 5) {
                                    int var64 = var11.field5794;
                                    if (var64 >= 0 && var64 < 2048) {
                                        class366 var65 = class73.field1444[var64];
                                        class57 var66 = var11.field5737 == -1 ? null : class422.field6355.method236(var11.field5737, (byte) 107);
                                        if (var65 != null && (class174.field2806 == var64 || class415.method2548((byte) -108, var65.field5381) == var11.field5779)) {
                                            var54 = var65.field5343.method2275(null, var66, class422.field6355, var11.field5672, class135.field2271, (byte) 106, class452.field6708, -1, class428.field6404, var11.field5747, var11.field5678, class262.field4006, 0, class102.field1942, true, class402.field6080, null, 0, 2048);
                                        }
                                    }
                                } else if (var11.field5785 == 8 || var11.field5785 == 9) {
                                    class11 var61 = class271.method1714(var11.field5794, 0, false);
                                    class57 var62 = var11.field5737 == -1 ? null : class422.field6355.method236(var11.field5737, (byte) 43);
                                    if (var61 != null) {
                                        class370 var63 = var11.field5739 ? class15.field266.field5343 : null;
                                        var54 = var61.method61(var11.field5747, var11.field5678, (byte) 89, var62, var11.field5785 == 9, class262.field4006, 2048, var11.field5672, var11.field5779, var63);
                                    }
                                } else if (var11.field5737 == -1) {
                                    var54 = var11.method2376(0, class422.field6355, class452.field6708, 2048, null, class15.field266.field5343, class102.field1942, class135.field2271, class402.field6080, (byte) 75, -1, -1, class428.field6404, class262.field4006);
                                    if (var54 == null && class518.field7507) {
                                        class429.method2587(var11, (byte) -63);
                                    }
                                } else {
                                    class57 var60 = class422.field6355.method236(var11.field5737, (byte) -54);
                                    var54 = var11.method2376(var11.field5672, class422.field6355, class452.field6708, 2048, var60, class15.field266.field5343, class102.field1942, class135.field2271, class402.field6080, (byte) 30, var11.field5678, var11.field5747, class428.field6404, class262.field4006);
                                    if (var54 == null && class518.field7507) {
                                        class429.method2587(var11, (byte) -63);
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (var11.field5751 > 0) {
                                        var67 = (var11.field5745 << 9) / var11.field5751;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68;
                                    if (var11.field5709 > 0) {
                                        var68 = (var11.field5712 << 9) / var11.field5709;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = var13 - (-(var11.field5745 / 2) - (var11.field5698 * var67 >> 9));
                                    int var70 = (var11.field5763 * var68 >> 9) + (var14 + (var11.field5712 / 2));
                                    class123.field2143.method827();
                                    class262.field4006.method326(class123.field2143);
                                    class262.field4006.method324(var69, var70, var67, var68);
                                    class262.field4006.method385((float) (var11.field5727 << 0), var11.field5803 ? (float) (var11.field5781 << 0) : (float) (var11.field5781 << 0) * 1.5F);
                                    if (arg6 == -1412584499 || class196.field3151) {
                                        class262.field4006.method321();
                                        class262.field4006.method388();
                                        class262.field4006.method371(arg7, arg2, arg9, arg5);
                                        class196.field3151 = false;
                                    }
                                    if (var11.field5827) {
                                        class262.field4006.method273(false);
                                    }
                                    int var71 = (var11.field5719 << 0) * class407.field6169[var11.field5675 << 3] >> 15;
                                    int var72 = (var11.field5719 << 0) * class407.field6168[var11.field5675 << 3] >> 15;
                                    class535.field7858.method836(-var11.field5696 << 3);
                                    class535.field7858.method826(var11.field5716 << 3);
                                    class535.field7858.method834(var11.field5684 << 0, (var11.field5708 << 0) + var71 + var55, var72 - -(var11.field5708 << 0));
                                    class535.field7858.method830(var11.field5675 << 3);
                                    if (class46.field967) {
                                        class262.field4006.method344(var13, var14, var11.field5745 + var13, var11.field5712 + var14);
                                    }
                                    if (var11.field5803) {
                                        var54.method721(class535.field7858, null, var11.field5719 << 0, 1);
                                    } else {
                                        var54.method723(class535.field7858, null, 1);
                                    }
                                    if (class46.field967) {
                                        class262.field4006.method371(arg7, arg2, arg9, arg5);
                                    }
                                    if (var11.field5827) {
                                        class262.field4006.method273(true);
                                    }
                                    class262.field4006.method385(0.0F, 0.0F);
                                }
                            } else if (var11.field5784 == 9) {
                                int var73;
                                int var74;
                                int var75;
                                int var76;
                                if (var11.field5767) {
                                    var73 = var11.field5745 + var13;
                                    var74 = var14;
                                    var75 = var13;
                                    var76 = var11.field5712 + var14;
                                } else {
                                    var76 = var14;
                                    var73 = var11.field5745 + var13;
                                    var75 = var13;
                                    var74 = var11.field5712 + var14;
                                }
                                if (var11.field5787 == 1) {
                                    class262.field4006.method398(var75, var76, var73, var74, var11.field5674, 0);
                                } else {
                                    class262.field4006.method353(var75, var76, var73, var74, var11.field5674, var11.field5787, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lha;II)Z", line = 671)
    public static final boolean method2182(class43 arg0, int arg1, int arg2) {
        if (arg2 > -42) {
            return true;
        }
        field5191++;
        int var3 = arg0.method261(2, 0);
        if (var3 == 0) {
            if (arg0.method261(1, 0) != 0) {
                method2182(arg0, arg1, -100);
            }
            int var4 = arg0.method261(6, 0);
            int var5 = arg0.method261(6, 0);
            boolean var6 = arg0.method261(1, 0) == 1;
            if (var6) {
                class522.field7575[class479.field7068++] = arg1;
            }
            if (class73.field1444[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class202 var7 = class253.field3890[arg1];
            class366 var8 = class73.field1444[arg1] = new class366();
            var8.field7789 = arg1;
            if (class334.field5057[arg1] != null) {
                var8.method2243(125, class334.field5057[arg1]);
            }
            var8.method3156(true, 123, var7.field3256);
            var8.field7804 = var7.field3257;
            int var9 = var7.field3258;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FFF62) >> 14;
            int var12 = var9 & 0xFF;
            var8.field5354 = var7.field3260;
            var8.field7864[0] = class267.field4058[arg1];
            var8.field6084 = (byte) var10;
            var8.method2237((byte) 89, (var11 << 6) + var4 - class496.field7292, (var12 << 6) + var5 + -class212.field3378);
            var8.field5353 = false;
            class253.field3890[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method261(2, 0);
            int var14 = class253.field3890[arg1].field3258;
            class253.field3890[arg1].field3258 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method261(5, 0);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class253.field3890[arg1].field3258;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class253.field3890[arg1].field3258 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method261(18, 0);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class253.field3890[arg1].field3258;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class253.field3890[arg1].field3258 = (var27 << 28) - (-(var28 << 14) - var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 844)
    public static void method2183(int arg0) {
        field5196 = null;
        if (arg0 != 14592) {
            field5193 = null;
        }
        field5192 = null;
        field5193 = null;
        field5197 = null;
    }
}
