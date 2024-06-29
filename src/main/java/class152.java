import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class152 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2614 = 0;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2612 = -1;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lmh;")
    public static class128 field2624 = class22.method156(124, "<col=ffff00>");

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lmh;")
    public static class128 field2622 = class22.method156(124, "Cabbage");

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lmh;")
    private static class128 field2618 = class22.method156(123, "Walk here");

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lmh;")
    public static class128 field2616 = field2618;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Ldj;")
    public static class314 field2617;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[Lfb;")
    public static class55[] field2621;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Le;Z)V", line = 4)
    public static final void method1011(class150 arg0, boolean arg1) {
        class15.field405.method2029((byte) -34, arg0);
        while (true) {
            class150 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class150[][] var7;
            class150 var78;
            do {
                class150 var77;
                do {
                    class150 var76;
                    do {
                        class150 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class150) class15.field405.method2020((byte) -88);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2583);
                                            var3 = var2.field2568;
                                            var4 = var2.field2582;
                                            var5 = var2.field2590;
                                            var6 = var2.field2585;
                                            var7 = class182.field3184[var5];
                                            float var8 = 0.0F;
                                            if (class247.field4247) {
                                                if (class308.field5227 == class250.field4334) {
                                                    int var9 = class91.field1557[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class166.field2855 != var10) {
                                                        class166.field2855 = var10;
                                                        class301.method2049(2, var10);
                                                        class119.method722(class70.method468((byte) 84));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class211.field3738 != var11) {
                                                        class211.field3738 = var11;
                                                        class17.method131((byte) -60, var11);
                                                    }
                                                    int var12 = class267.field4626[0][var3 + 1][var4] + class267.field4626[0][var3][var4] + class267.field4626[0][var3][var4 + 1] + class267.field4626[0][var3 + 1][var4 + 1] >> 2;
                                                    class217.method1498((byte) -29, -var12, 3);
                                                    var8 = 201.5F;
                                                    class247.method1718(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class247.method1718(var8);
                                                }
                                            }
                                            if (!var2.field2574) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class150 var13 = class182.field3184[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field2583) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class145.field2488 && var3 > class170.field2972) {
                                                    class150 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field2583 && (var14.field2574 || (var2.field2580 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class145.field2488 && var3 < class181.field3172 - 1) {
                                                    class150 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field2583 && (var15.field2574 || (var2.field2580 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class217.field3813 && var4 > class96.field1631) {
                                                    class150 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field2583 && (var16.field2574 || (var2.field2580 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class217.field3813 && var4 < class115.field1939 - 1) {
                                                    class150 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field2583 && (var17.field2574 || (var2.field2580 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2574 = false;
                                            if (var2.field2589 != null) {
                                                class150 var18 = var2.field2589;
                                                if (class247.field4247) {
                                                    class247.method1718(201.5F - (float) (var18.field2585 + 1) * 50.0F);
                                                }
                                                if (var18.field2581 == null) {
                                                    if (var18.field2587 != null) {
                                                        if (class74.method488(0, var3, var4)) {
                                                            class241.method1635(var18.field2587, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, true);
                                                        } else {
                                                            class241.method1635(var18.field2587, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class74.method488(0, var3, var4)) {
                                                    class9.method71(var18.field2581, 0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, true);
                                                } else {
                                                    class9.method71(var18.field2581, 0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, false);
                                                }
                                                class65 var19 = var18.field2571;
                                                if (var19 != null) {
                                                    if (class247.field4247) {
                                                        if ((var19.field1254 & var2.field2572) == 0) {
                                                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                        } else {
                                                            class46.method320(var19.field1254, class260.field4501, class166.field2847, class156.field2682, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field1252.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var19.field1249 - class260.field4501, var19.field1258 - class166.field2847, var19.field1261 - class156.field2682, var19.field1264);
                                                }
                                                for (int var20 = 0; var20 < var18.field2576; var20++) {
                                                    class5 var21 = var18.field2575[var20];
                                                    if (var21 != null) {
                                                        if (class247.field4247) {
                                                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                        }
                                                        var21.field105.method201(var21.field103, class266.field4613, class50.field990, class306.field5210, class291.field4974, var21.field107 - class260.field4501, var21.field97 - class166.field2847, var21.field108 - class156.field2682, var21.field89);
                                                    }
                                                }
                                                if (class247.field4247) {
                                                    class247.method1718(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2581 == null) {
                                                if (var2.field2587 != null) {
                                                    if (class74.method488(var6, var3, var4)) {
                                                        class241.method1635(var2.field2587, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class241.method1635(var2.field2587, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, false);
                                                    }
                                                }
                                            } else if (class74.method488(var6, var3, var4)) {
                                                class9.method71(var2.field2581, var6, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2581.field1068 != 12345678 || class173.field3065 && var5 <= class148.field2552) {
                                                    class9.method71(var2.field2581, var6, class266.field4613, class50.field990, class306.field5210, class291.field4974, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class92 var23 = var2.field2586;
                                                if (var23 != null && (var23.field1568 & 0x80000000L) != 0L) {
                                                    if (class247.field4247 && var23.field1569) {
                                                        class247.method1718(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class247.field4247) {
                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                    }
                                                    var23.field1572.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var23.field1563 - class260.field4501, var23.field1562 - class166.field2847, var23.field1567 - class156.field2682, var23.field1568);
                                                    if (class247.field4247 && var23.field1569) {
                                                        class247.method1718(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class65 var26 = var2.field2571;
                                            class161 var27 = var2.field2565;
                                            if (var26 != null || var27 != null) {
                                                if (class145.field2488 == var3) {
                                                    var24++;
                                                } else if (class145.field2488 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class217.field3813 == var4) {
                                                    var24 += 3;
                                                } else if (class217.field3813 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class43.field879[var24];
                                                var2.field2572 = class311.field5270[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field1254 & class288.field4929[var24]) == 0) {
                                                    var2.field2588 = 0;
                                                } else if (var26.field1254 == 16) {
                                                    var2.field2588 = 3;
                                                    var2.field2567 = class220.field3874[var24];
                                                    var2.field2577 = 3 - var2.field2567;
                                                } else if (var26.field1254 == 32) {
                                                    var2.field2588 = 6;
                                                    var2.field2567 = class241.field4125[var24];
                                                    var2.field2577 = 6 - var2.field2567;
                                                } else if (var26.field1254 == 64) {
                                                    var2.field2588 = 12;
                                                    var2.field2567 = class108.field1839[var24];
                                                    var2.field2577 = 12 - var2.field2567;
                                                } else {
                                                    var2.field2588 = 9;
                                                    var2.field2567 = class188.field3253[var24];
                                                    var2.field2577 = 9 - var2.field2567;
                                                }
                                                if ((var26.field1254 & var25) != 0 && !method1013(var6, var3, var4, var26.field1254)) {
                                                    if (class247.field4247) {
                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                    }
                                                    var26.field1252.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var26.field1249 - class260.field4501, var26.field1258 - class166.field2847, var26.field1261 - class156.field2682, var26.field1264);
                                                }
                                                if ((var26.field1262 & var25) != 0 && !method1013(var6, var3, var4, var26.field1262)) {
                                                    if (class247.field4247) {
                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                    }
                                                    var26.field1251.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var26.field1249 - class260.field4501, var26.field1258 - class166.field2847, var26.field1261 - class156.field2682, var26.field1264);
                                                }
                                            }
                                            if (var27 != null && !class297.method2034(var6, var3, var4, var27.field2761.method204())) {
                                                if (class247.field4247) {
                                                    class247.method1718(var8 - 0.5F);
                                                }
                                                if ((var27.field2755 & var25) != 0) {
                                                    if (class247.field4247) {
                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                    }
                                                    var27.field2761.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var27.field2749 + var27.field2746 - class260.field4501, var27.field2763 - class166.field2847, var27.field2741 + var27.field2758 - class156.field2682, var27.field2762);
                                                } else if (var27.field2755 == 256) {
                                                    int var28 = var27.field2749 - class260.field4501;
                                                    int var29 = var27.field2763 - class166.field2847;
                                                    int var30 = var27.field2741 - class156.field2682;
                                                    int var31 = var27.field2744;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class247.field4247) {
                                                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                        }
                                                        var27.field2761.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var27.field2746 + var28, var29, var27.field2758 + var30, var27.field2762);
                                                    } else if (var27.field2764 != null) {
                                                        if (class247.field4247) {
                                                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                        }
                                                        var27.field2764.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var28, var29, var30, var27.field2762);
                                                    }
                                                }
                                                if (class247.field4247) {
                                                    class247.method1718(var8);
                                                }
                                            }
                                            if (var22) {
                                                class92 var34 = var2.field2586;
                                                if (var34 != null && (var34.field1568 & 0x80000000L) == 0L) {
                                                    if (class247.field4247 && var34.field1569) {
                                                        class247.method1718(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class247.field4247) {
                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                    }
                                                    var34.field1572.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var34.field1563 - class260.field4501, var34.field1562 - class166.field2847, var34.field1567 - class156.field2682, var34.field1568);
                                                    if (class247.field4247 && var34.field1569) {
                                                        class247.method1718(var8);
                                                    }
                                                }
                                                class289 var35 = var2.field2569;
                                                if (var35 != null && var35.field4941 == 0) {
                                                    if (class247.field4247) {
                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                    }
                                                    if (var35.field4950 != null) {
                                                        var35.field4950.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var35.field4951 - class260.field4501, var35.field4948 - class166.field2847, var35.field4944 - class156.field2682, var35.field4939);
                                                    }
                                                    if (var35.field4935 != null) {
                                                        var35.field4935.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var35.field4951 - class260.field4501, var35.field4948 - class166.field2847, var35.field4944 - class156.field2682, var35.field4939);
                                                    }
                                                    if (var35.field4931 != null) {
                                                        var35.field4931.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var35.field4951 - class260.field4501, var35.field4948 - class166.field2847, var35.field4944 - class156.field2682, var35.field4939);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2580;
                                            if (var36 != 0) {
                                                if (var3 < class145.field2488 && (var36 & 0x4) != 0) {
                                                    class150 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field2583) {
                                                        class15.field405.method2029((byte) -34, var37);
                                                    }
                                                }
                                                if (var4 < class217.field3813 && (var36 & 0x2) != 0) {
                                                    class150 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field2583) {
                                                        class15.field405.method2029((byte) -34, var38);
                                                    }
                                                }
                                                if (var3 > class145.field2488 && (var36 & 0x1) != 0) {
                                                    class150 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field2583) {
                                                        class15.field405.method2029((byte) -34, var39);
                                                    }
                                                }
                                                if (var4 > class217.field3813 && (var36 & 0x8) != 0) {
                                                    class150 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field2583) {
                                                        class15.field405.method2029((byte) -34, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2588 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2576; var42++) {
                                                if (class99.field1712 != var2.field2575[var42].field93 && (var2.field2566[var42] & var2.field2588) == var2.field2567) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class65 var43 = var2.field2571;
                                                if (!method1013(var6, var3, var4, var43.field1254)) {
                                                    if (class247.field4247) {
                                                        label882: {
                                                            if ((var43.field1264 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field1249 - class260.field4501;
                                                                int var45 = var43.field1261 - class156.field2682;
                                                                int var46 = (int) (var43.field1264 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class155.field2670 - 1) {
                                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class297.field5067 - 1 && var4 < class155.field2670 - 1) {
                                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class297.field5067 - 1 && var4 > 0) {
                                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field1252.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var43.field1249 - class260.field4501, var43.field1258 - class166.field2847, var43.field1261 - class156.field2682, var43.field1264);
                                                }
                                                var2.field2588 = 0;
                                            }
                                        }
                                        if (!var2.field2573) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2576;
                                            var2.field2573 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class5 var50 = var2.field2575[var49];
                                                if (class99.field1712 != var50.field93) {
                                                    for (int var51 = var50.field92; var51 <= var50.field96; var51++) {
                                                        for (int var52 = var50.field88; var52 <= var50.field86; var52++) {
                                                            class150 var53 = var7[var51][var52];
                                                            if (var53.field2574) {
                                                                var2.field2573 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field2588 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field92) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field96) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field88) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field86) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field2588) == var2.field2577) {
                                                                    var2.field2573 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class30.field677[var48++] = var50;
                                                    int var55 = class145.field2488 - var50.field92;
                                                    int var56 = var50.field96 - class145.field2488;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class217.field3813 - var50.field88;
                                                    int var58 = var50.field86 - class217.field3813;
                                                    if (var58 > var57) {
                                                        var50.field106 = var55 + var58;
                                                    } else {
                                                        var50.field106 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class5 var62 = class30.field677[var61];
                                                    if (class99.field1712 != var62.field93) {
                                                        if (var62.field106 > var59) {
                                                            var59 = var62.field106;
                                                            var60 = var61;
                                                        } else if (var62.field106 == var59) {
                                                            int var63 = var62.field107 - class260.field4501;
                                                            int var64 = var62.field108 - class156.field2682;
                                                            int var65 = class30.field677[var60].field107 - class260.field4501;
                                                            int var66 = class30.field677[var60].field108 - class156.field2682;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class5 var67 = class30.field677[var60];
                                                var67.field93 = class99.field1712;
                                                if (!class93.method586(var6, var67.field92, var67.field96, var67.field88, var67.field86, var67.field105.method204())) {
                                                    if (class247.field4247) {
                                                        if ((var67.field89 & 0xFC000L) == 147456L) {
                                                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                                                            int var68 = var67.field107 - class260.field4501;
                                                            int var69 = var67.field108 - class156.field2682;
                                                            int var70 = (int) (var67.field89 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class46.method313(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class46.method313(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class46.method313(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class46.method313(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class46.method315(class260.field4501, class166.field2847, class156.field2682, var5, var67.field92, var67.field88, var67.field96, var67.field86);
                                                        }
                                                    }
                                                    var67.field105.method201(var67.field103, class266.field4613, class50.field990, class306.field5210, class291.field4974, var67.field107 - class260.field4501, var67.field97 - class166.field2847, var67.field108 - class156.field2682, var67.field89);
                                                }
                                                for (int var71 = var67.field92; var71 <= var67.field96; var71++) {
                                                    for (int var72 = var67.field88; var72 <= var67.field86; var72++) {
                                                        class150 var73 = var7[var71][var72];
                                                        if (var73.field2588 != 0) {
                                                            class15.field405.method2029((byte) -34, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field2583) {
                                                            class15.field405.method2029((byte) -34, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2573) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field2573 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2583);
                            } while (var2.field2588 != 0);
                            if (var3 > class145.field2488 || var3 <= class170.field2972) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field2583);
                        if (var3 < class145.field2488 || var3 >= class181.field3172 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field2583);
                    if (var4 > class217.field3813 || var4 <= class96.field1631) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field2583);
                if (var4 < class217.field3813 || var4 >= class115.field1939 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field2583);
            var2.field2583 = false;
            class3.field56--;
            class289 var79 = var2.field2569;
            if (var79 != null && var79.field4941 != 0) {
                if (class247.field4247) {
                    class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                }
                if (var79.field4950 != null) {
                    var79.field4950.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var79.field4951 - class260.field4501, var79.field4948 - class166.field2847 - var79.field4941, var79.field4944 - class156.field2682, var79.field4939);
                }
                if (var79.field4935 != null) {
                    var79.field4935.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var79.field4951 - class260.field4501, var79.field4948 - class166.field2847 - var79.field4941, var79.field4944 - class156.field2682, var79.field4939);
                }
                if (var79.field4931 != null) {
                    var79.field4931.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var79.field4951 - class260.field4501, var79.field4948 - class166.field2847 - var79.field4941, var79.field4944 - class156.field2682, var79.field4939);
                }
            }
            if (var2.field2572 != 0) {
                class161 var80 = var2.field2565;
                if (var80 != null && !class297.method2034(var6, var3, var4, var80.field2761.method204())) {
                    if ((var80.field2755 & var2.field2572) != 0) {
                        if (class247.field4247) {
                            class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                        }
                        var80.field2761.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var80.field2749 + var80.field2746 - class260.field4501, var80.field2763 - class166.field2847, var80.field2741 + var80.field2758 - class156.field2682, var80.field2762);
                    } else if (var80.field2755 == 256) {
                        int var81 = var80.field2749 - class260.field4501;
                        int var82 = var80.field2763 - class166.field2847;
                        int var83 = var80.field2741 - class156.field2682;
                        int var84 = var80.field2744;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class247.field4247) {
                                class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                            }
                            var80.field2761.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var80.field2746 + var81, var82, var80.field2758 + var83, var80.field2762);
                        } else if (var80.field2764 != null) {
                            if (class247.field4247) {
                                class46.method310(class260.field4501, class166.field2847, class156.field2682, var5, var3, var4);
                            }
                            var80.field2764.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var81, var82, var83, var80.field2762);
                        }
                    }
                }
                class65 var87 = var2.field2571;
                if (var87 != null) {
                    if ((var87.field1262 & var2.field2572) != 0 && !method1013(var6, var3, var4, var87.field1262)) {
                        if (class247.field4247) {
                            class46.method320(var87.field1262, class260.field4501, class166.field2847, class156.field2682, var6, var3, var4);
                        }
                        var87.field1251.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var87.field1249 - class260.field4501, var87.field1258 - class166.field2847, var87.field1261 - class156.field2682, var87.field1264);
                    }
                    if ((var87.field1254 & var2.field2572) != 0 && !method1013(var6, var3, var4, var87.field1254)) {
                        if (class247.field4247) {
                            class46.method320(var87.field1254, class260.field4501, class166.field2847, class156.field2682, var6, var3, var4);
                        }
                        var87.field1252.method201(0, class266.field4613, class50.field990, class306.field5210, class291.field4974, var87.field1249 - class260.field4501, var87.field1258 - class166.field2847, var87.field1261 - class156.field2682, var87.field1264);
                    }
                }
            }
            if (var5 < class130.field2271 - 1) {
                class150 var88 = class182.field3184[var5 + 1][var3][var4];
                if (var88 != null && var88.field2583) {
                    class15.field405.method2029((byte) -34, var88);
                }
            }
            if (var3 < class145.field2488) {
                class150 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field2583) {
                    class15.field405.method2029((byte) -34, var89);
                }
            }
            if (var4 < class217.field3813) {
                class150 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field2583) {
                    class15.field405.method2029((byte) -34, var90);
                }
            }
            if (var3 > class145.field2488) {
                class150 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field2583) {
                    class15.field405.method2029((byte) -34, var91);
                }
            }
            if (var4 > class217.field3813) {
                class150 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field2583) {
                    class15.field405.method2029((byte) -34, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 1004)
    public static final void method1012(byte arg0) {
        field2609++;
        int var1 = -9 / ((-arg0 - 13) / 56);
        class169.field2936.method1832((byte) 39);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Z", line = 1016)
    private static final boolean method1013(int arg0, int arg1, int arg2, int arg3) {
        if (!class74.method488(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class250.field4334[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class260.field4501) {
                    if (!class62.method409(var4, var6, var5)) {
                        return false;
                    }
                    if (!class62.method409(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class62.method409(var4, var7, var5)) {
                        return false;
                    }
                    if (!class62.method409(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class62.method409(var4, var8, var5)) {
                    return false;
                }
                if (!class62.method409(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class156.field2682) {
                    if (!class62.method409(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class62.method409(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class62.method409(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class62.method409(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class62.method409(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class62.method409(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class260.field4501) {
                    if (!class62.method409(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class62.method409(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class62.method409(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class62.method409(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class62.method409(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class62.method409(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class156.field2682) {
                    if (!class62.method409(var4, var6, var5)) {
                        return false;
                    }
                    if (!class62.method409(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class62.method409(var4, var7, var5)) {
                        return false;
                    }
                    if (!class62.method409(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class62.method409(var4, var8, var5)) {
                    return false;
                }
                if (!class62.method409(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class62.method409(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class62.method409(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class62.method409(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class62.method409(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class62.method409(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 1225)
    public static final void method1014(int arg0) {
        field2623++;
        int var1 = class290.method1997(16745);
        if (var1 == 0) {
            class31.field684 = (byte[][][]) null;
            class266.method1863(arg0 - 110, 0);
        } else if (var1 == 1) {
            class64.method426((byte) 0, arg0 ^ 0x6E);
            class266.method1863(-108, 512);
            class72.method474(0);
        } else {
            class64.method426((byte) (class167.field2873 - 4 & 0xFF), -87);
            class266.method1863(arg0 - 110, 2);
        }
        if (arg0 != 0) {
            method1013(25, -121, -16, -127);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 1261)
    public static void method1015(byte arg0) {
        field2622 = null;
        field2624 = null;
        field2616 = null;
        field2621 = null;
        field2618 = null;
        field2617 = null;
        int var1 = -41 % ((-arg0 - 59) / 47);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public abstract void method448(int arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public abstract void method450(int arg0, int arg1, int arg2);
}
