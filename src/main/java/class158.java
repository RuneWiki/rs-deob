import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class158 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
    public static int[] field2550 = new int[100];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2549 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljb;")
    public static class269 field2555;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBIII)V")
    public static final void method1102(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class255.field4055 <= arg4 && class9.field128 >= arg4) {
            int var5 = class51.method393(arg3, 0, class161.field2561, class51.field896);
            int var6 = class51.method393(arg2, 0, class161.field2561, class51.field896);
            class227.method1597(arg0, true, var5, arg4, var6);
        }
        if (arg1 >= -125) {
            field2549 = null;
        }
        field2552++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public static final void method1103(int arg0, int arg1, int arg2) {
        class5.field57 = true;
        class122.field1987 = arg0;
        class111.field1840 = arg1;
        class189.field3067 = arg2;
        class32.field498 = -1;
        class40.field746 = -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII[Lf;III)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class36[] arg6, int arg7, int arg8, int arg9) {
        field2553++;
        class2.method28(arg0, arg7, arg4, arg1);
        class69.method485();
        for (int var10 = arg5; var10 < arg6.length; var10++) {
            class36 var11 = arg6[var10];
            if (var11 != null && (var11.field632 == arg8 || arg8 == -1412584499 && client.field2517 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class142.field2295[class98.field1615] = var11.field606 + arg9;
                    class98.field1616[class98.field1615] = var11.field607 + arg2;
                    class124.field2006[class98.field1615] = var11.field642;
                    field2550[class98.field1615] = var11.field676;
                    var12 = class98.field1615++;
                } else {
                    var12 = arg3;
                }
                var11.field705 = var12;
                var11.field569 = class222.field3682;
                if (!var11.field597 || !client.method1089(var11)) {
                    if (var11.field570 > 0) {
                        class124.method894(var11, true);
                    }
                    int var13 = var11.field606 + arg9;
                    int var14 = var11.field607 + arg2;
                    int var15 = var11.field640;
                    if (class103.field1675 && (client.method1093(var11).field1313 != 0 || var11.field709 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (client.field2517 == var11) {
                        if (arg8 != -1412584499 && !var11.field644) {
                            class238.field3872 = arg9;
                            class16.field274 = arg2;
                            class198.field3164 = arg6;
                            continue;
                        }
                        if (class67.field1108 && client.field2523) {
                            int var16 = class241.field3898;
                            int var17 = var16 - class241.field3900;
                            if (class110.field1815 > var17) {
                                var17 = class110.field1815;
                            }
                            int var18 = class109.field1801;
                            if (class110.field1815 + class173.field2725.field642 < var11.field642 + var17) {
                                var17 = class110.field1815 + class173.field2725.field642 - var11.field642;
                            }
                            var13 = var17;
                            int var19 = var18 - class107.field1711;
                            if (class78.field1258 > var19) {
                                var19 = class78.field1258;
                            }
                            if ((var11.field676 + var19) > (class78.field1258 + class173.field2725.field676)) {
                                var19 = class173.field2725.field676 + class78.field1258 - var11.field676;
                            }
                            var14 = var19;
                        }
                        if (!var11.field644) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field709 == 2) {
                        var20 = arg4;
                        var21 = arg1;
                        var22 = arg0;
                        var23 = arg7;
                    } else {
                        var22 = var13 <= arg0 ? arg0 : var13;
                        int var24 = var11.field642 + var13;
                        int var25 = var11.field676 + var14;
                        if (var11.field709 == 9) {
                            var25++;
                            var24++;
                        }
                        var21 = arg1 <= var25 ? arg1 : var25;
                        var20 = var24 < arg4 ? var24 : arg4;
                        var23 = var14 > arg7 ? var14 : arg7;
                    }
                    if (!var11.field597 || var22 < var20 && var23 < var21) {
                        if (var11.field570 != 0) {
                            if (var11.field570 == 1337) {
                                class277.field4360 = var11;
                                class10.field142 = var13;
                                class250.field3983 = var14;
                                class139.method967(var14, var11.field570 == 1403, var11.field676, var13, var11.field642, (byte) -128);
                                class2.method28(arg0, arg7, arg4, arg1);
                                continue;
                            }
                            if (var11.field570 == 1338) {
                                if (!var11.method308(arg5)) {
                                    continue;
                                }
                                class11.method83(var13, var14, var12, var11, false);
                                class2.method28(arg0, arg7, arg4, arg1);
                                if (class260.field4133 != 0 && class260.field4133 != 3 || class199.field3181 || var22 > class90.field1487 || var23 > class146.field2339 || class90.field1487 >= var20 || var21 <= class146.field2339) {
                                    continue;
                                }
                                int var26 = class90.field1487 - var13;
                                int var27 = class146.field2339 - var14;
                                int var28 = var11.field681[var27];
                                if (var26 < var28 || (var28 + var11.field553[var27]) < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field642 / 2;
                                int var30 = class122.field1985 + class120.field1956 & 0x7FF;
                                int var31 = class69.field1147[var30];
                                int var32 = (class87.field1385 + 256) * var31 >> 8;
                                int var33 = var27 - var11.field676 / 2;
                                int var34 = class69.field1137[var30];
                                int var35 = (class87.field1385 + 256) * var34 >> 8;
                                int var36 = var29 * var35 + var32 * var33 >> 11;
                                int var37 = var33 * var35 - (var29 * var32) >> 11;
                                int var38 = class167.field2655.field3389 + var36 >> 7;
                                int var39 = class167.field2655.field3341 - var37 >> 7;
                                if (class288.field4560 && (class212.field3473 & 0x40) != 0) {
                                    class36 var40 = class230.method1612(1, class281.field4452, class253.field4032);
                                    if (var40 == null) {
                                        class86.method627((byte) -118);
                                    } else {
                                        class40.method348(var39, 1L, (short) 26, class154.field2496, var38, class138.field2268, " ->", true);
                                    }
                                    continue;
                                }
                                if (class111.field1837 == 1) {
                                    class40.method348(var39, 1L, (short) 20, class285.field4508, var38, -1, "", true);
                                }
                                class40.method348(var39, 1L, (short) 50, class1.field28, var38, -1, "", true);
                                continue;
                            }
                            if (var11.field570 == 1339) {
                                if (var11.method308(arg5)) {
                                    class141.method977(var14, arg5 ^ 0xFFFFFFF0, var11, var13, var12);
                                    class2.method28(arg0, arg7, arg4, arg1);
                                }
                                continue;
                            }
                            if (var11.field570 == 1400) {
                                class248.method1700(var11.field642, var13, (byte) -113, var14, var11.field676);
                                class275.field4352[var12] = true;
                                class223.field3698[var12] = true;
                                class2.method28(arg0, arg7, arg4, arg1);
                                continue;
                            }
                            if (var11.field570 == 1401) {
                                class30.method258(var11.field676, var14, var11.field642, var13, (byte) 121);
                                class275.field4352[var12] = true;
                                class223.field3698[var12] = true;
                                class2.method28(arg0, arg7, arg4, arg1);
                                continue;
                            }
                            if (var11.field570 == 1402) {
                                class228.method1604(var13, 1, var14);
                                class275.field4352[var12] = true;
                                class223.field3698[var12] = true;
                                continue;
                            }
                            if (var11.field570 == 1405) {
                                if (!class282.field4473) {
                                    continue;
                                }
                                int var41 = var11.field642 + var13;
                                int var42 = var14 + 15;
                                class184.field2892.method1799("Fps:" + class287.field4538, var41, var42, 16776960, -1);
                                int var130 = var42 + 15;
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var45 = 0;
                                int var46 = 0;
                                int var47 = 16776960;
                                int var48 = 0;
                                if (var44 > 65536) {
                                    var47 = 16711680;
                                }
                                class184.field2892.method1799("Mem:" + var44 + "k", var41, var130, var47, -1);
                                var42 = var130 + 15;
                                int var49 = 16776960;
                                for (int var50 = 0; var50 < 28; var50++) {
                                    var45 += class247.field3931[var50].method1876(27);
                                    var46 += class247.field3931[var50].method1873(23122);
                                    var48 += class247.field3931[var50].method1880(arg5 ^ 0xFFFFF541);
                                }
                                int var51 = var46 * 10000 / var45;
                                int var52 = var48 * 100 / var45;
                                String var53 = "Cache:" + class236.method1642(true, 10, (long) var51, 0, 2) + "% (" + var52 + "%)";
                                field2555.method1799(var53, var41, var42, var49, -1);
                                var42 += 12;
                                class275.field4352[var12] = true;
                                class223.field3698[var12] = true;
                                continue;
                            }
                            if (var11.field570 == 1406) {
                                class284.field4490 = var11;
                                class98.field1613 = var14;
                                class155.field2502 = var13;
                                continue;
                            }
                        }
                        if (!class199.field3181) {
                            if (var11.field709 == 0 && var11.field717 && class90.field1487 >= var22 && class146.field2339 >= var23 && var20 > class90.field1487 && var21 > class146.field2339 && !class103.field1675) {
                                class279.field4427[0] = 1002;
                                class7.field88[0] = class219.field3580;
                                class113.field1893[0] = "";
                                class205.field3291 = 1;
                                class6.field75[0] = class67.field1111;
                            }
                            if (var22 <= class90.field1487 && var23 <= class146.field2339 && class90.field1487 < var20 && var21 > class146.field2339) {
                                class244.method1676(var11, class90.field1487 - var13, -var14 + class146.field2339, (byte) 114);
                            }
                        }
                        if (var11.field709 == 0) {
                            if (!var11.field597 && client.method1089(var11) && class135.field2168 != var11) {
                                continue;
                            }
                            if (!var11.field597) {
                                if (var11.field571 > var11.field602 - var11.field676) {
                                    var11.field571 = var11.field602 - var11.field676;
                                }
                                if (var11.field571 < 0) {
                                    var11.field571 = 0;
                                }
                            }
                            method1104(var22, var21, var14 - var11.field571, var12, var20, 0, arg6, var23, var11.field648, var13 - var11.field630);
                            if (var11.field658 != null) {
                                method1104(var22, var21, var14 - var11.field571, var12, var20, 0, var11.field658, var23, var11.field648, var13 - var11.field630);
                            }
                            class258 var54 = (class258) class128.field2062.method1400((long) var11.field648, true);
                            if (var54 != null) {
                                if (var54.field4109 == 0 && !class199.field3181 && var22 <= class90.field1487 && class146.field2339 >= var23 && var20 > class90.field1487 && var21 > class146.field2339 && !class103.field1675) {
                                    class6.field75[0] = class67.field1111;
                                    class279.field4427[0] = 1002;
                                    class205.field3291 = 1;
                                    class7.field88[0] = class219.field3580;
                                    class113.field1893[0] = "";
                                }
                                class129.method916(var21, var20, var14, var22, 0, var23, var54.field4100, var12, var13);
                            }
                            class2.method28(arg0, arg7, arg4, arg1);
                            class69.method485();
                        }
                        if (class82.field1286[var12] || class173.field2727 > 1) {
                            if (var11.field709 == 0 && !var11.field597 && var11.field676 < var11.field602) {
                                class215.method1472(16, var11.field642 + var13, var14, var11.field571, var11.field602, var11.field676);
                            }
                            if (var11.field709 != 1) {
                                if (var11.field709 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field556; var56++) {
                                        for (int var57 = 0; var57 < var11.field711; var57++) {
                                            int var58 = var13 + ((var11.field653 + 32) * var57);
                                            int var59 = var14 + ((var11.field641 + 32) * var56);
                                            if (var55 < 20) {
                                                var58 += var11.field690[var55];
                                                var59 += var11.field594[var55];
                                            }
                                            if (var11.field638[var55] > 0) {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field638[var55] - 1;
                                                if (arg0 < var58 + 32 && arg4 > var58 && arg7 < var59 + 32 && arg1 > var59 || class274.field4345 == var11 && class229.field3789 == var55) {
                                                    class238 var63;
                                                    if (class51.field894 == 1 && class45.field823 == var55 && class86.field1375 == var11.field648) {
                                                        var63 = class178.method1214(var11.field714[var55], 0, 2, var11.field636, var62, (byte) -126);
                                                    } else {
                                                        var63 = class178.method1214(var11.field714[var55], 3153952, 1, var11.field636, var62, (byte) -125);
                                                    }
                                                    if (class69.field1142) {
                                                        class275.field4352[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class280.method1886(var11, 32);
                                                    } else if (class274.field4345 == var11 && class229.field3789 == var55) {
                                                        int var64 = class241.field3898 - class48.field859;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        int var65 = class109.field1801 - class284.field4491;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class78.field1246 < 5) {
                                                            var65 = 0;
                                                            var64 = 0;
                                                        }
                                                        var63.method310(var58 + var64, var59 + var65, 128);
                                                        if (arg8 != -1) {
                                                            class36 var66 = arg6[arg8 & 0xFFFF];
                                                            int var67 = class2.field39;
                                                            int var68 = class2.field37;
                                                            if (var59 + var65 < var67 && var66.field571 > 0) {
                                                                int var69 = (var67 - var59 - var65) * class287.field4533 / 3;
                                                                if (var69 > (class287.field4533 * 10)) {
                                                                    var69 = class287.field4533 * 10;
                                                                }
                                                                if (var66.field571 < var69) {
                                                                    var69 = var66.field571;
                                                                }
                                                                class284.field4491 += var69;
                                                                var66.field571 -= var69;
                                                                class280.method1886(var66, 32);
                                                            }
                                                            if (var68 < (var59 - (-var65 - 32)) && var66.field571 < (var66.field602 - var66.field676)) {
                                                                int var70 = (var59 + var65 + 32 - var68) * class287.field4533 / 3;
                                                                if ((class287.field4533 * 10) < var70) {
                                                                    var70 = class287.field4533 * 10;
                                                                }
                                                                if (var70 > var66.field602 - var66.field676 - var66.field571) {
                                                                    var70 = var66.field602 - var66.field571 - var66.field676;
                                                                }
                                                                class284.field4491 -= var70;
                                                                var66.field571 += var70;
                                                                class280.method1886(var66, 32);
                                                            }
                                                        }
                                                    } else if (class201.field3231 == var11 && class188.field3048 == var55) {
                                                        var63.method310(var58, var59, 128);
                                                    } else {
                                                        var63.method332(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field587 != null && var55 < 20) {
                                                class238 var71 = var11.method304(var55, (byte) -81);
                                                if (var71 != null) {
                                                    var71.method332(var58, var59);
                                                } else if (class277.field4368) {
                                                    class280.method1886(var11, arg5 + 32);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field709 == 3) {
                                    int var72;
                                    if (class154.method1074(var11, 124)) {
                                        var72 = var11.field651;
                                        if (class135.field2168 == var11 && var11.field573 != 0) {
                                            var72 = var11.field573;
                                        }
                                    } else {
                                        var72 = var11.field710;
                                        if (class135.field2168 == var11 && var11.field700 != 0) {
                                            var72 = var11.field700;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field605) {
                                            class2.method25(var13, var14, var11.field642, var11.field676, var72);
                                        } else {
                                            class2.method24(var13, var14, var11.field642, var11.field676, var72);
                                        }
                                    } else if (var11.field605) {
                                        class2.method23(var13, var14, var11.field642, var11.field676, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class2.method32(var13, var14, var11.field642, var11.field676, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field709 == 4) {
                                    class269 var73 = var11.method297(class247.field3947, true);
                                    if (var73 != null) {
                                        String var74 = var11.field595;
                                        int var75;
                                        if (class154.method1074(var11, 127)) {
                                            var75 = var11.field651;
                                            if (class135.field2168 == var11 && var11.field573 != 0) {
                                                var75 = var11.field573;
                                            }
                                            if (var11.field706.length() > 0) {
                                                var74 = var11.field706;
                                            }
                                        } else {
                                            var75 = var11.field710;
                                            if (class135.field2168 == var11 && var11.field700 != 0) {
                                                var75 = var11.field700;
                                            }
                                        }
                                        if (var11.field597 && var11.field583 != -1) {
                                            class12 var76 = class83.method595(var11.field583, -112);
                                            var74 = var76.field174;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field223 == 1 || var11.field655 != 1) && var11.field655 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class223.method1571(105, var11.field655);
                                            }
                                        }
                                        if (class207.field3333 == var11) {
                                            var74 = class141.field2284;
                                            var75 = var11.field710;
                                        }
                                        if (!var11.field597) {
                                            var74 = class182.method1234(var74, -127, var11);
                                        }
                                        var73.method1813(var74, var13, var14, var11.field642, var11.field676, var75, var11.field596 ? 0 : -1, var11.field603, var11.field625, var11.field613);
                                    } else if (class277.field4368) {
                                        class280.method1886(var11, arg5 ^ 0x20);
                                    }
                                } else if (var11.field709 == 5) {
                                    if (var11.field597) {
                                        class238 var77;
                                        if (var11.field583 == -1) {
                                            var77 = var11.method294(8, false);
                                        } else {
                                            var77 = class178.method1214(var11.field655, var11.field666, var11.field564, var11.field636, var11.field583, (byte) -126);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field3867;
                                            int var79 = var77.field3871;
                                            if (var11.field686) {
                                                int var80 = (var78 + var11.field642 - 1) / var78;
                                                int var81 = (var11.field676 + var79 - 1) / var79;
                                                class2.method30(var13, var14, var13 + var11.field642, var11.field676 + var14);
                                                for (int var82 = 0; var82 < var80; var82++) {
                                                    for (int var83 = 0; var83 < var81; var83++) {
                                                        if (var11.field704 != 0) {
                                                            var77.method1652(-109, var11.field704, var78 / 2 + var13 + (var78 * var82), 4096, var79 / 2 + (var14 + (var79 * var83)));
                                                        } else if (var15 == 0) {
                                                            var77.method332(var13 + (var78 * var82), var79 * var83 + var14);
                                                        } else {
                                                            var77.method310(var78 * var82 + var13, var79 * var83 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class2.method28(arg0, arg7, arg4, arg1);
                                            } else {
                                                int var84 = var11.field642 * 4096 / var78;
                                                if (var11.field704 != 0) {
                                                    var77.method1652(-122, var11.field704, var11.field642 / 2 + var13, var84, var11.field676 / 2 + var14);
                                                } else if (var15 != 0) {
                                                    var77.method320(var13, var14, var11.field642, var11.field676, 256 - (var15 & 0xFF));
                                                } else if (var11.field642 == var78 && var11.field676 == var79) {
                                                    var77.method332(var13, var14);
                                                } else {
                                                    var77.method327(var13, var14, var11.field642, var11.field676);
                                                }
                                            }
                                        } else if (class277.field4368) {
                                            class280.method1886(var11, 32);
                                        }
                                    } else {
                                        class238 var85 = var11.method294(8, class154.method1074(var11, arg5 ^ 0x7B));
                                        if (var85 != null) {
                                            var85.method332(var13, var14);
                                        } else if (class277.field4368) {
                                            class280.method1886(var11, 32);
                                        }
                                    }
                                } else if (var11.field709 == 6) {
                                    boolean var86 = class154.method1074(var11, 123);
                                    int var87;
                                    if (var86) {
                                        var87 = var11.field585;
                                    } else {
                                        var87 = var11.field664;
                                    }
                                    int var88 = 0;
                                    class80 var89 = null;
                                    if (var11.field583 != -1) {
                                        class12 var94 = class83.method595(var11.field583, -76);
                                        if (var94 != null) {
                                            class12 var95 = var94.method100(1, var11.field655);
                                            class181 var96 = var87 == -1 ? null : class49.method384(var87, arg5 + 108);
                                            var89 = var95.method88((byte) 73, var96, var11.field683, var11.field635, 1, var11.field689);
                                            if (var89 == null) {
                                                class280.method1886(var11, 32);
                                            } else {
                                                var88 = -var89.method119() / 2;
                                            }
                                        }
                                    } else if (var11.field565 == 5) {
                                        if (var11.field598 == -1) {
                                            var89 = class197.field3149.method801(0, (class181) null, true, -21172, (class47[]) null, -1, -1, -1, -1, 0, (class181) null);
                                        } else {
                                            int var90 = var11.field598 & 0x7FF;
                                            if (class233.field3811 == var90) {
                                                var90 = 2047;
                                            }
                                            class33 var91 = class35.field548[var90];
                                            class181 var92 = var87 == -1 ? null : class49.method384(var87, arg5 + 97);
                                            if (var91 != null && (int) class74.method522((byte) -96, var91.field525) << 11 == (var11.field598 & 0xFFFFF800)) {
                                                var89 = var91.field528.method801(0, var92, true, -21172, (class47[]) null, -1, var11.field683, 0, -1, 0, (class181) null);
                                            }
                                        }
                                    } else if (var87 == -1) {
                                        var89 = var11.method306(-2, (class181) null, -1, var86, 0, -1, class167.field2655.field528);
                                        if (var89 == null && class277.field4368) {
                                            class280.method1886(var11, 32);
                                        }
                                    } else {
                                        class181 var93 = class49.method384(var87, -103);
                                        var89 = var11.method306(-2, var93, var11.field683, var86, var11.field635, var11.field689, class167.field2655.field528);
                                        if (var89 == null && class277.field4368) {
                                            class280.method1886(var11, arg5 + 32);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var97;
                                        if (var11.field610 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field642 << 8) / var11.field610;
                                        }
                                        int var98 = var11.field642 / 2 + (var13 + (var11.field673 * var97 >> 8));
                                        int var99;
                                        if (var11.field593 <= 0) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var11.field676 << 8) / var11.field593;
                                        }
                                        int var100 = var11.field676 / 2 + (var14 + (var11.field617 * var99 >> 8));
                                        class69.method502(var98, var100);
                                        int var101 = class69.field1147[var11.field647] * var11.field702 >> 16;
                                        int var102 = class69.field1137[var11.field647] * var11.field702 >> 16;
                                        if (!var11.field597) {
                                            var89.method569(0, var11.field567, 0, var11.field647, 0, var101, var102, -1L);
                                        } else if (var11.field685) {
                                            ((class187) var89).method1271(0, var11.field567, var11.field668, var11.field647, var11.field619, var88 + var101 + var11.field652, var102 - -var11.field652, var11.field702);
                                        } else {
                                            var89.method569(0, var11.field567, var11.field668, var11.field647, var11.field619, var88 + var101 + var11.field652, var11.field652 + var102, -1L);
                                        }
                                        class69.method490();
                                    }
                                } else {
                                    if (var11.field709 == 7) {
                                        class269 var103 = var11.method297(class247.field3947, true);
                                        if (var103 == null) {
                                            if (class277.field4368) {
                                                class280.method1886(var11, 32);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field556; var105++) {
                                            for (int var106 = 0; var106 < var11.field711; var106++) {
                                                if (var11.field638[var104] > 0) {
                                                    class12 var107 = class83.method595(var11.field638[var104] - 1, -64);
                                                    String var108;
                                                    if (var107.field223 != 1 && var11.field714[var104] == 1) {
                                                        var108 = "<col=ff9040>" + var107.field174 + "</col>";
                                                    } else {
                                                        var108 = "<col=ff9040>" + var107.field174 + "</col> x" + class223.method1571(arg5 + 105, var11.field714[var104]);
                                                    }
                                                    int var109 = (var11.field641 + 12) * var105 + var14;
                                                    int var110 = (var11.field653 + 115) * var106 + var13;
                                                    if (var11.field603 == 0) {
                                                        var103.method1811(var108, var110, var109, var11.field710, var11.field596 ? 0 : -1);
                                                    } else if (var11.field603 == 1) {
                                                        var103.method1797(var108, var110 + 57, var109, var11.field710, var11.field596 ? 0 : -1);
                                                    } else {
                                                        var103.method1799(var108, var110 + 115 - 1, var109, var11.field710, var11.field596 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var11.field709 == 8 && class285.field4503 == var11 && class133.field2129 == class124.field2007) {
                                        int var111 = 0;
                                        class269 var112 = class184.field2892;
                                        int var113 = 0;
                                        String var114 = var11.field595;
                                        String var115 = class182.method1234(var114, 118, var11);
                                        while (var115.length() > 0) {
                                            int var123 = var115.indexOf("<br>");
                                            String var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = "";
                                            } else {
                                                var124 = var115.substring(0, var123);
                                                var115 = var115.substring(var123 + 4);
                                            }
                                            int var125 = var112.method1822(var124);
                                            if (var113 < var125) {
                                                var113 = var125;
                                            }
                                            var111 += var112.field4233 + 1;
                                        }
                                        int var116 = var14 + var11.field676 + 5;
                                        var113 += 6;
                                        int var117 = var11.field642 + var13 - var113 - 5;
                                        if (var117 < var13 + 5) {
                                            var117 = var13 + 5;
                                        }
                                        var111 += 7;
                                        if ((var113 + var117) > arg4) {
                                            var117 = arg4 - var113;
                                        }
                                        if (arg1 < (var116 + var111)) {
                                            var116 = arg1 - var111;
                                        }
                                        class2.method25(var117, var116, var113, var111, 16777120);
                                        class2.method24(var117, var116, var113, var111, 0);
                                        int var118 = var116 + var112.field4233 + 2;
                                        String var119 = var11.field595;
                                        String var120 = class182.method1234(var119, arg5 - 99, var11);
                                        while (var120.length() > 0) {
                                            int var121 = var120.indexOf("<br>");
                                            String var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = "";
                                            } else {
                                                var122 = var120.substring(0, var121);
                                                var120 = var120.substring(var121 + 4);
                                            }
                                            var112.method1811(var122, var117 + 3, var118, 0, -1);
                                            var118 += var112.field4233 + 1;
                                        }
                                    }
                                    if (var11.field709 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field639) {
                                            var126 = var13;
                                            var127 = var11.field676 + var14;
                                            var128 = var11.field642 + var13;
                                            var129 = var14;
                                        } else {
                                            var129 = var11.field676 + var14;
                                            var127 = var14;
                                            var126 = var13;
                                            var128 = var11.field642 + var13;
                                        }
                                        if (var11.field691 == 1) {
                                            class2.method14(var126, var127, var128, var129, var11.field710);
                                        } else {
                                            class2.method36(var126, var127, var128, var129, var11.field710, var11.field691);
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

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method1105(byte arg0) {
        if (arg0 <= 9) {
            method1107(101);
        }
        class66.field1086.method472((byte) -63);
        field2554++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLqh;)V")
    public static final void method1106(boolean arg0, class201 arg1) {
        field2551++;
        if (!arg0) {
            method1107(-65);
        }
        class193.field3088 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method1107(int arg0) {
        field2556++;
        if (arg0 != -32677) {
            method1107(-70);
        }
        class222.field3685.method481(false);
        class229.field3773.method481(false);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static void method1108(byte arg0) {
        if (arg0 != 91) {
            method1107(-88);
        }
        field2549 = null;
        field2550 = null;
        field2555 = null;
    }
}
