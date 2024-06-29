import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class176 implements class284 {

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lao;")
    public static class191 field2272 = new class191(48, 2);

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Ljk;")
    public static class450 field2277 = null;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2274 = -1;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Z")
    public boolean field2271;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2278;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII[Ljk;III)V", line = 4)
    public static final void method1027(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class450[] arg6, int arg7, int arg8, int arg9) {
        field2269++;
        class343.field4596.method1182(arg8, arg1, arg2, arg4);
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class450 var11 = arg6[var10];
            if (var11 != null && (var11.field6550 == arg5 || arg5 == -1412584499 && class188.field2436 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class331.field4393[class266.field3569].setBounds(var11.field6601 + arg7, var11.field6682 + arg0, var11.field6612, var11.field6573);
                    var12 = class266.field3569++;
                } else {
                    var12 = arg9;
                }
                var11.field6642 = var12;
                var11.field6627 = class532.field7836;
                if (!client.method1249(var11)) {
                    if (var11.field6679 != 0) {
                        class343.method1995(2, var11);
                    }
                    int var13 = var11.field6601 + arg7;
                    int var14 = var11.field6682 + arg0;
                    int var15 = var11.field6548;
                    if (class94.field1134 && (client.method1253(var11).field2979 != 0 || var11.field6686 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class188.field2436 == var11) {
                        if (arg5 != -1412584499 && (class429.field6240 == var11.field6592 || class342.field4588 == var11.field6592)) {
                            class49.field560 = arg0;
                            class79.field969 = arg7;
                            class393.field5677 = arg6;
                            continue;
                        }
                        if (class392.field5669 && class463.field6905) {
                            int var16 = class148.field1951.method349((byte) -91);
                            int var17 = class148.field1951.method347(-110);
                            int var18 = var17 - class389.field5639;
                            int var19 = var16 - class272.field3624;
                            if (var19 < class13.field142) {
                                var19 = class13.field142;
                            }
                            if (var11.field6612 + var19 > class13.field142 - -class474.field7033.field6612) {
                                var19 = class13.field142 + class474.field7033.field6612 - var11.field6612;
                            }
                            if (class216.field2951 > var18) {
                                var18 = class216.field2951;
                            }
                            if (var11.field6573 + var18 > class216.field2951 - -class474.field7033.field6573) {
                                var18 = class216.field2951 - (var11.field6573 - class474.field7033.field6573);
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (class342.field4588 == var11.field6592) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field6686 == 2) {
                        var20 = arg2;
                        var21 = arg4;
                        var22 = arg1;
                        var23 = arg8;
                    } else {
                        int var24 = var11.field6612 + var13;
                        int var25 = var11.field6573 + var14;
                        if (var11.field6686 == 9) {
                            var24++;
                            var25++;
                        }
                        var22 = var14 > arg1 ? var14 : arg1;
                        var23 = arg8 < var13 ? var13 : arg8;
                        var21 = var25 >= arg4 ? arg4 : var25;
                        var20 = var24 < arg2 ? var24 : arg2;
                    }
                    if (var20 > var23 && var21 > var22) {
                        if (var11.field6679 != 0) {
                            if (class294.field3897 == var11.field6679 || class32.field332 == var11.field6679) {
                                class255.method1577(var14, class32.field332 == var11.field6679, true, var13, var11.field6612, var11.field6573);
                                class442.field6427[var12] = true;
                                class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                continue;
                            }
                            if (class433.field6319 == var11.field6679) {
                                if (var11.method2787(class343.field4596, (byte) 90) != null) {
                                    class466.method2847(false);
                                    class519.method3101(class343.field4596, var11, 5, var13, var14);
                                    class114.field1496[var12] = true;
                                    class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                }
                                continue;
                            }
                            if (class292.field3864 == var11.field6679) {
                                if (var11.method2787(class343.field4596, (byte) 90) != null) {
                                    class509.method3042(true, var11, var13, var14);
                                    class114.field1496[var12] = true;
                                    class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                }
                                continue;
                            }
                            if (class175.field2250 == var11.field6679) {
                                class294.method1768(var13, class463.field6904, (byte) -91, var11.field6612, var11.field6573, var14, class343.field4596);
                                class442.field6427[var12] = true;
                                class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                continue;
                            }
                            if (class163.field2129 == var11.field6679) {
                                class40.method235(var11.field6573, class343.field4596, var13, (byte) 35, var14, var11.field6612);
                                class442.field6427[var12] = true;
                                class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                continue;
                            }
                            if (class340.field4502 == var11.field6679) {
                                if (!class435.field6354 && !class447.field6520) {
                                    continue;
                                }
                                int var26 = var11.field6612 + var13;
                                int var27 = var14 + 15;
                                if (class435.field6354) {
                                    class225.field3028.method1877(-128, var26, -1, "Fps:" + class515.field7495, var27, -256);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class225.field3028.method1877(-128, var26, -1, "Mem:" + var29 + "k", var27, var30);
                                    var27 += 15;
                                    class225.field3028.method1877(-128, var26, -1, "In:" + class375.field5086 + "B/s Out:" + class7.field98 + "B/s", var27, -256);
                                    var27 += 15;
                                    int var31 = class343.field4596.method1165() / 1024;
                                    class225.field3028.method1877(-127, var26, -1, "Offheap:" + var31 + "k", var27, var31 <= 65536 ? -256 : -65536);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class291.field3850[var35].method19((byte) 99);
                                        var33 += class291.field3850[var35].method17((byte) 19);
                                        var34 += class291.field3850[var35].method24(32);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class433.method2665((long) var37, true, 2, 0, 10) + "% (" + var36 + "%)";
                                    class161.field2096.method1877(-128, var26, -1, var38, var27, -256);
                                    var27 += 12;
                                }
                                if (class186.field2423 > 0) {
                                    class161.field2096.method1877(-128, var26, -1, "Particles: " + class423.field6155 + " / " + class186.field2423, var27, -256);
                                }
                                var27 += 12;
                                if (class447.field6520) {
                                    class161.field2096.method1877(-127, var26, -1, "Polys: " + class343.field4596.method1169() + " Models: " + class343.field4596.method1210(), var27, -256);
                                    var27 += 12;
                                    class161.field2096.method1877(-127, var26, -1, "Ls: " + class415.field5972 + " La: " + class336.field4454 + " NPC: " + class53.field614 + " Pl: " + class452.field6760, var27, -256);
                                    var27 += 12;
                                    class388.method2352((byte) -44);
                                }
                                class442.field6427[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field6686 == 0) {
                            if (class357.field4869 == var11.field6679 && class343.field4596.method1142()) {
                                class343.field4596.method1189(var13, var14, var11.field6612, var11.field6573);
                            }
                            method1027(var14 - var11.field6687, var22, var20, (byte) 125, var21, var11.field6558, arg6, var13 - var11.field6634, var23, var12);
                            if (var11.field6643 != null) {
                                method1027(var14 - var11.field6687, var22, var20, (byte) 126, var21, var11.field6558, var11.field6643, var13 - var11.field6634, var23, var12);
                            }
                            class360 var39 = (class360) class152.field1989.method295((long) var11.field6558, -90);
                            if (var39 != null) {
                                class113.method684(var23, var13, var12, var14, var22, (byte) 34, var39.field4886, var21, var20);
                            }
                            if (class357.field4869 == var11.field6679 && class343.field4596.method1142()) {
                                class343.field4596.method1198();
                                class98.field1295 = true;
                            }
                            class343.field4596.method1182(arg8, arg1, arg2, arg4);
                        }
                        if (class207.field2728[var12] || class434.field6328 > 1) {
                            if (var11.field6686 == 3) {
                                if (var15 == 0) {
                                    if (var11.field6662) {
                                        class343.field4596.method1153(var13, var14, var11.field6612, var11.field6573, var11.field6649, 0);
                                    } else {
                                        class343.field4596.method1157(var13, var14, var11.field6612, var11.field6573, var11.field6649, 0);
                                    }
                                } else if (var11.field6662) {
                                    class343.field4596.method1153(var13, var14, var11.field6612, var11.field6573, 255 - (var15 & 0xFF) << 24 | var11.field6649 & 0xFFFFFF, 1);
                                } else {
                                    class343.field4596.method1157(var13, var14, var11.field6612, var11.field6573, var11.field6649 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field6686 == 4) {
                                class316 var40 = var11.method2780(class343.field4596, (byte) -89);
                                if (var40 != null) {
                                    int var41 = var11.field6649;
                                    String var42 = var11.field6594;
                                    if (var11.field6661 != -1) {
                                        class199 var43 = class237.field3158.method236(-18315, var11.field6661);
                                        var42 = var43.field2623;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field2606 == 1 || var11.field6561 != 1) && var11.field6561 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class437.method2685(var11.field6561, (byte) 94);
                                        }
                                    }
                                    if (class446.field6492 == var11) {
                                        var42 = class330.field4383.method1823(class374.field5072, (byte) -88);
                                        var41 = var11.field6649;
                                    }
                                    if (class253.field3370) {
                                        class343.field4596.method1134(var13, var14, var13 + var11.field6612, var11.field6573 + var14);
                                    }
                                    var40.method1881(var11.field6557, var42, (byte) -61, var14, var11.field6612, 0, null, var11.field6688, class302.field3996, 255 - (var15 & 0xFF) << 24 | var41, var11.field6573, 0, var13, null, var11.field6578 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field6691, var11.field6668);
                                    if (class253.field3370) {
                                        class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                    }
                                } else if (class266.field3558) {
                                    class413.method2521(var11, false);
                                }
                            } else if (var11.field6686 == 5) {
                                if (var11.field6584 >= 0) {
                                    var11.method2777(9, client.field2571, class333.field4407).method1767(var14, var11.field6574 << 3, 0, var11.field6554 << 3, class343.field4596, var11.field6612, var11.field6573, (byte) -103, 0, var13);
                                } else {
                                    class24 var44;
                                    if (var11.field6661 == -1) {
                                        var44 = var11.method2788(class343.field4596, 1518573480);
                                    } else {
                                        class136 var45 = var11.field6572 ? class96.field1170.field7833 : null;
                                        var44 = class237.field3158.method238(var45, var11.field6672, 0, var11.field6677 | 0xFF000000, var11.field6661, var11.field6561, class343.field4596, var11.field6689);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method155();
                                        int var47 = var44.method153();
                                        int var48 = 255 - (var15 & 0xFF) << 24 | (var11.field6649 == 0 ? 16777215 : var11.field6649 & 0xFFFFFF);
                                        if (var11.field6576) {
                                            class343.field4596.method1134(var13, var14, var11.field6612 + var13, var11.field6573 + var14);
                                            if (var11.field6579 != 0) {
                                                int var49 = (-(-var46 - var11.field6612) - 1) / var46;
                                                int var50 = (var47 + var11.field6573 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field6649 == 0) {
                                                            var44.method140((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field6579);
                                                        } else {
                                                            var44.method145((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field6579, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field6649 == 0 && var15 == 0) {
                                                var44.method142(var13, var14, var11.field6612, var11.field6573);
                                            } else {
                                                var44.method149(var13, var14, var11.field6612, var11.field6573, 0, var48, 1);
                                            }
                                            class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                        } else if (var11.field6649 == 0 && var15 == 0) {
                                            if (var11.field6579 != 0) {
                                                var44.method140((float) var11.field6612 / 2.0F + (float) var13, (float) var11.field6573 / 2.0F + (float) var14, var11.field6612 * 4096 / var46, var11.field6579);
                                            } else if (var11.field6612 == var46 && var11.field6573 == var47) {
                                                var44.method144(var13, var14);
                                            } else {
                                                var44.method141(var13, var14, var11.field6612, var11.field6573);
                                            }
                                        } else if (var11.field6579 != 0) {
                                            var44.method145((float) var11.field6612 / 2.0F + (float) var13, (float) var11.field6573 / 2.0F + (float) var14, var11.field6612 * 4096 / var46, var11.field6579, 0, var48, 1);
                                        } else if (var11.field6612 == var46 && var11.field6573 == var47) {
                                            var44.method12(var13, var14, 0, var48, 1);
                                        } else {
                                            var44.method6(var13, var14, var11.field6612, var11.field6573, 0, var48, 1);
                                        }
                                    } else if (class266.field3558) {
                                        class413.method2521(var11, false);
                                    }
                                }
                            } else if (var11.field6686 == 6) {
                                class517.method3091(256);
                                class373 var53 = null;
                                int var54 = 0;
                                if (var11.field6661 != -1) {
                                    class199 var55 = class237.field3158.method236(-18315, var11.field6661);
                                    if (var55 != null) {
                                        class199 var56 = var55.method1282(var11.field6561, 109);
                                        class260 var57 = var11.field6702 == -1 ? null : class7.field97.method2951(var11.field6702, -13765);
                                        class136 var58 = var11.field6572 ? class96.field1170.field7833 : null;
                                        var53 = var56.method1277(1, 2048, var11.field6577, -129, var57, var11.field6575, var11.field6590, class343.field4596, var58);
                                        if (var53 == null) {
                                            class413.method2521(var11, false);
                                        } else {
                                            var54 = -var53.method2041() >> 1;
                                        }
                                    }
                                } else if (var11.field6652 == 5) {
                                    int var63 = var11.field6692;
                                    if (var63 >= 0 && var63 < 2048) {
                                        class531 var64 = class29.field272[var63];
                                        class260 var65 = var11.field6702 == -1 ? null : class7.field97.method2951(var11.field6702, -13765);
                                        if (var64 != null && (class308.field4121 == var63 || class263.method1616(0, var64.field7783) == var11.field6587)) {
                                            var53 = var64.field7833.method826(null, class52.field606, var11.field6577, -1, var65, class343.field4596, 0, class7.field97, class237.field3158, var11.field6575, var11.field6590, 0, class254.field3381, 65535, class453.field6782, null, 2048, class87.field1032, true);
                                        }
                                    }
                                } else if (var11.field6652 == 8 || var11.field6652 == 9) {
                                    class327 var60 = class457.method2813(var11.field6692, false, -75);
                                    class260 var61 = var11.field6702 == -1 ? null : class7.field97.method2951(var11.field6702, -13765);
                                    if (var60 != null) {
                                        class136 var62 = var11.field6572 ? class96.field1170.field7833 : null;
                                        var53 = var60.method1925(var61, var11.field6587, var11.field6575, var11.field6577, class343.field4596, var11.field6590, var62, 2048, 128, var11.field6652 == 9);
                                    }
                                } else if (var11.field6702 == -1) {
                                    var53 = var11.method2791(-1, 7, class7.field97, class96.field1170.field7833, 0, class343.field4596, null, class52.field606, class87.field1032, 2048, -1, class254.field3381, class453.field6782, class237.field3158);
                                    if (var53 == null && class266.field3558) {
                                        class413.method2521(var11, false);
                                    }
                                } else {
                                    class260 var59 = class7.field97.method2951(var11.field6702, -13765);
                                    var53 = var11.method2791(var11.field6577, 7, class7.field97, class96.field1170.field7833, var11.field6590, class343.field4596, var59, class52.field606, class87.field1032, 2048, var11.field6575, class254.field3381, class453.field6782, class237.field3158);
                                    if (var53 == null && class266.field3558) {
                                        class413.method2521(var11, false);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field6567 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field6612 << 9) / var11.field6567;
                                    }
                                    int var67;
                                    if (var11.field6618 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field6573 << 9) / var11.field6618;
                                    }
                                    int var68 = (var11.field6699 * var66 >> 9) + (var13 + (var11.field6612 / 2));
                                    int var69 = var11.field6573 / 2 + (var14 + (var11.field6602 * var67 >> 9));
                                    class272.field3633.method741();
                                    class343.field4596.method1227(class272.field3633);
                                    class343.field4596.method1221(var68, var69, var66, var67);
                                    class343.field4596.method1140((float) (var11.field6570 << 0), var11.field6563 ? (float) (var11.field6654 << 0) : (float) (var11.field6654 << 0) * 1.5F);
                                    if (arg5 == -1412584499 || class98.field1295) {
                                        class343.field4596.method1206();
                                        class343.field4596.method1188();
                                        class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                        class98.field1295 = false;
                                    }
                                    if (var11.field6552) {
                                        class343.field4596.method1175(false);
                                    }
                                    int var70 = (var11.field6663 << 0) * class456.field6812[var11.field6615 << 3] >> 15;
                                    int var71 = (var11.field6663 << 0) * class456.field6811[var11.field6615 << 3] >> 15;
                                    class521.field7667.method756(-var11.field6604 << 3);
                                    class521.field7667.method742(var11.field6701 << 3);
                                    class521.field7667.method757(var11.field6571 << 0, (var11.field6597 << 0) + var70 + var54, (var11.field6597 << 0) + var71);
                                    class521.field7667.method751(var11.field6615 << 3);
                                    if (class253.field3370) {
                                        class343.field4596.method1134(var13, var14, var13 + var11.field6612, var11.field6573 + var14);
                                    }
                                    if (var11.field6563) {
                                        var53.method2016(class521.field7667, null, var11.field6663 << 0, 1);
                                    } else {
                                        var53.method2051(class521.field7667, null, 1);
                                    }
                                    if (class253.field3370) {
                                        class343.field4596.method1182(arg8, arg1, arg2, arg4);
                                    }
                                    if (var11.field6552) {
                                        class343.field4596.method1175(true);
                                    }
                                    class343.field4596.method1140(0.0F, 0.0F);
                                }
                            } else if (var11.field6686 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field6629) {
                                    var73 = var11.field6612 + var13;
                                    var75 = var14;
                                    var74 = var14 + var11.field6573;
                                    var72 = var13;
                                } else {
                                    var72 = var13;
                                    var73 = var11.field6612 + var13;
                                    var74 = var14;
                                    var75 = var11.field6573 + var14;
                                }
                                if (var11.field6617 == 1) {
                                    class343.field4596.method1228(var72, var74, var73, var75, var11.field6649, 0);
                                } else {
                                    class343.field4596.method1197(var72, var74, var73, var75, var11.field6649, var11.field6617, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 < 122) {
            field2276 = 81;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V", line = 665)
    public static void method1028(boolean arg0) {
        field2272 = null;
        if (!arg0) {
            field2276 = -67;
        }
        field2278 = null;
        field2277 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lfr;B)Z", line = 678)
    public final boolean method1029(class284 arg0, byte arg1) {
        field2264++;
        if (!(arg0 instanceof class176)) {
            return false;
        }
        if (arg1 != 105) {
            field2274 = -38;
        }
        class176 var3 = (class176) arg0;
        if (this.field2267 != var3.field2267) {
            return false;
        } else if (this.field2265 != var3.field2265) {
            return false;
        } else if (this.field2268 != var3.field2268) {
            return false;
        } else if (this.field2270 != var3.field2270) {
            return false;
        } else if (this.field2266 != var3.field2266) {
            return false;
        } else if (this.field2263 == var3.field2263) {
            return var3.field2271 == this.field2271;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)J", line = 722)
    public final long method1030(boolean arg0) {
        field2273++;
        long[] var2 = class6.field77;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field2267) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field2265 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field2265) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field2268 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field2268 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field2268 >> 8)) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field2268) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field2270) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field2266 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field2266 >> 16)) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field2266 >> 8)) & 0xFFL)];
        if (!arg0) {
            this.method1029(null, (byte) -8);
        }
        long var27 = var2[(int) ((var25 ^ (long) this.field2266) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field2263) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field2271 ? 1 : 0) ^ var29) & 0xFFL)];
    }
}
