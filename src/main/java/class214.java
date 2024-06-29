import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class214 {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lvl;")
    public static class164 field3437 = new class164(16);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lwi;")
    public static class233 field3432;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 12)
    public static void method1615(byte arg0) {
        field3432 = null;
        if (arg0 > -58) {
            method1617(47, -13, 64, 73, -13, -43, false);
        }
        field3437 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 25)
    public static final void method1616(int arg0, int arg1) {
        field3435++;
        class169.field2691.method2334(arg0, arg1);
        class46.field745.method2334(arg0 ^ 0x0, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIZ)V", line = 34)
    public static final void method1617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class16.field186 == 0) {
            int var7 = class338.field5393;
            int var8 = class45.field702;
            int var9 = class338.field5385;
            int var10 = (arg4 - arg1) * (var7 - var8) / arg3 + var8;
            int var11 = class241.field3987;
            int var12 = (arg0 - arg2) * (var9 - var11) / arg5 + var11;
            if (class227.field3789 && (class6.field48 & 0x40) != 0) {
                class250 var13 = class25.method165(class209.field3297, class275.field4549, 24836);
                if (var13 == null) {
                    class57.method473((byte) 112);
                } else {
                    class55.method434(var12, class104.field1690, false, 0L, " ->", var10, class324.field5160, (short) 49);
                }
            } else {
                class285.field4648++;
                if (class131.field2212 == 1) {
                    class55.method434(var12, -1, arg6, 0L, "", var10, class176.field2819, (short) 44);
                }
                class55.method434(var12, -1, false, 0L, "", var10, class51.field800, (short) 48);
            }
        }
        field3434++;
        long var14 = -1L;
        if (arg6) {
            method1615((byte) -117);
        }
        for (int var16 = 0; var16 < class298.field4775; var16++) {
            long var17 = class221.field3606[var16];
            int var19 = ((int) var17 & 0x67D9913A) >> 29;
            int var20 = (int) var17 & 0x7F;
            int var21 = ((int) var17 & 0x3FA9) >> 7;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var19 == 2 && class347.method2434(class186.field2991, var20, var21, var17)) {
                    class29 var23 = class166.method1292(0, var22);
                    if (var23.field418 != null) {
                        var23 = var23.method177(5000);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class16.field186 == 1) {
                        class70.field1232++;
                        class55.method434(var21, class129.field2193, false, var17, class233.field3881 + " -> <col=00ffff>" + var23.field350, var20, class117.field1953, (short) 5);
                    } else if (class227.field3789) {
                        class350 var24 = class245.field4015 == -1 ? null : class113.method861((byte) 115, class245.field4015);
                        if ((class6.field48 & 0x4) != 0 && (var24 == null || var23.method196(class245.field4015, (byte) 91, var24.field5554) != var24.field5554)) {
                            class55.method434(var21, class104.field1690, arg6, var17, class178.field2851 + " -> <col=00ffff>" + var23.field350, var20, class324.field5160, (short) 45);
                            class344.field5472++;
                        }
                    } else {
                        class336.field5315++;
                        String[] var25 = var23.field410;
                        if (class348.field5530) {
                            var25 = class356.method2515(1, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    short var27 = 0;
                                    int var28 = -1;
                                    class46.field737++;
                                    if (var26 == 0) {
                                        var27 = 36;
                                    }
                                    if (var26 == 1) {
                                        var27 = 37;
                                    }
                                    if (var26 == 2) {
                                        var27 = 13;
                                    }
                                    if (var26 == 3) {
                                        var27 = 35;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1005;
                                    }
                                    if (var23.field416 == var26) {
                                        var28 = var23.field373;
                                    }
                                    if (var23.field395 == var26) {
                                        var28 = var23.field415;
                                    }
                                    class55.method434(var21, var28, false, var17, "<col=00ffff>" + var23.field350, var20, var25[var26], var27);
                                }
                            }
                        }
                        class55.method434(var21, class121.field2082, arg6, (long) var23.field417, "<col=00ffff>" + var23.field350, var20, class327.field5198, (short) 1004);
                    }
                }
                if (var19 == 1) {
                    class288 var29 = class165.field2621[var22];
                    if ((var29.field4692.field2025 & 0x1) == 0 && (var29.field3577 & 0x7F) == 0 && (var29.field3511 & 0x7F) == 0 || (var29.field4692.field2025 & 0x1) == 1 && (var29.field3577 & 0x7F) == 64 && (var29.field3511 & 0x7F) == 64) {
                        int var30 = var29.field3577 - (var29.field4692.field2025 << 6);
                        int var31 = var29.field3511 - (var29.field4692.field2025 << 6);
                        int var32 = var29.field4692.field2025 << 7;
                        if (class287.field4674) {
                            for (int var33 = 0; var33 < class35.field508; var33++) {
                                class288 var34 = class165.field2621[class330.field5253[var33]];
                                if (var34 != null && !var34.field3548 && var29 != var34 && var34.field3551) {
                                    int var35 = var34.field4692.field2025 << 7;
                                    int var36 = var34.field3511 - (var34.field4692.field2025 << 6);
                                    int var37 = var34.field3577 - (var34.field4692.field2025 << 6);
                                    if (class304.method2173(var36, var30, var35, var31, var37, var32, var32, var35, -13)) {
                                        class131.method1010(class330.field5253[var33], var34.field4692, 84, var21, var20);
                                        var34.field3548 = true;
                                    }
                                }
                            }
                            for (int var38 = 0; var38 < class345.field5501; var38++) {
                                class258 var39 = class56.field924[class306.field4895[var38]];
                                if (var39 != null && !var39.field3548 && var39.field3551) {
                                    int var40 = var39.field3577 - (var39.method1634(-1) << 6);
                                    int var41 = var39.field3511 - (var39.method1634(-1) << 6);
                                    int var42 = var39.method1634(-1) << 7;
                                    if (class304.method2173(var41, var30, var42, var31, var40, var32, var32, var42, -13)) {
                                        class222.method1684(var21, var39, class306.field4895[var38], var20, (byte) 15);
                                        var39.field3548 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var29.field3548) {
                        continue;
                    }
                    class131.method1010(var22, var29.field4692, 90, var21, var20);
                    var29.field3548 = true;
                }
                if (var19 == 0) {
                    class258 var43 = class56.field924[var22];
                    if ((var43.field3577 & 0x7F) == 64 && (var43.field3511 & 0x7F) == 64) {
                        int var44 = var43.field3577 - (var43.method1634(-1) << 6);
                        int var45 = var43.field3511 - (var43.method1634(-1) << 6);
                        int var46 = var43.method1634(-1) << 7;
                        if (class287.field4674) {
                            for (int var47 = 0; var47 < class35.field508; var47++) {
                                class288 var48 = class165.field2621[class330.field5253[var47]];
                                if (var48 != null && !var48.field3548 && var48.field3551) {
                                    int var49 = var48.field3577 - (var48.field4692.field2025 << 6);
                                    int var50 = var48.field4692.field2025 << 7;
                                    int var51 = var48.field3511 - (var48.field4692.field2025 << 6);
                                    if (class304.method2173(var51, var44, var50, var45, var49, var46, var46, var50, -13)) {
                                        class131.method1010(class330.field5253[var47], var48.field4692, -75, var21, var20);
                                        var48.field3548 = true;
                                    }
                                }
                            }
                            for (int var52 = 0; var52 < class345.field5501; var52++) {
                                class258 var53 = class56.field924[class306.field4895[var52]];
                                if (var53 != null && !var53.field3548 && var43 != var53 && var53.field3551) {
                                    int var54 = var53.field3577 - (var53.method1634(-1) << 6);
                                    int var55 = var53.field3511 - (var53.method1634(-1) << 6);
                                    int var56 = var53.method1634(-1) << 7;
                                    if (class304.method2173(var55, var44, var56, var45, var54, var46, var46, var56, -13)) {
                                        class222.method1684(var21, var53, class306.field4895[var52], var20, (byte) 15);
                                        var53.field3548 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var43.field3548) {
                        continue;
                    }
                    class222.method1684(var21, var43, var22, var20, (byte) 15);
                    var43.field3548 = true;
                }
                if (var19 == 3) {
                    class327 var57 = class211.field3372[class186.field2991][var20][var21];
                    if (var57 != null) {
                        for (class103 var58 = (class103) var57.method2311(true); var58 != null; var58 = (class103) var57.method2304(0)) {
                            int var59 = var58.field1672.field3829;
                            class52 var60 = class6.method22(var59, 16430);
                            if (class16.field186 == 1) {
                                class324.field5157++;
                                class55.method434(var21, class129.field2193, arg6, (long) var59, class233.field3881 + " -> <col=ff9040>" + var60.field871, var20, class117.field1953, (short) 23);
                            } else if (class227.field3789) {
                                class350 var61 = class245.field4015 == -1 ? null : class113.method861((byte) 115, class245.field4015);
                                if ((class6.field48 & 0x1) != 0 && (var61 == null || var60.method402(var61.field5554, class245.field4015, (byte) -2) != var61.field5554)) {
                                    class261.field4389++;
                                    class55.method434(var21, class104.field1690, false, (long) var59, class178.field2851 + " -> <col=ff9040>" + var60.field871, var20, class324.field5160, (short) 30);
                                }
                            } else {
                                String[] var62 = var60.field876;
                                if (class348.field5530) {
                                    var62 = class356.method2515(1, var62);
                                }
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        byte var64 = 0;
                                        class65.field1156++;
                                        int var65 = -1;
                                        if (var63 == 0) {
                                            var64 = 34;
                                        }
                                        if (var60.field877 == var63) {
                                            var65 = var60.field866;
                                        }
                                        if (var60.field854 == var63) {
                                            var65 = var60.field843;
                                        }
                                        if (var63 == 1) {
                                            var64 = 10;
                                        }
                                        if (var63 == 2) {
                                            var64 = 58;
                                        }
                                        if (var63 == 3) {
                                            var64 = 59;
                                        }
                                        if (var63 == 4) {
                                            var64 = 50;
                                        }
                                        class55.method434(var21, var65, false, (long) var59, "<col=ff9040>" + var60.field871, var20, var62[var63], var64);
                                    }
                                }
                                class55.method434(var21, class121.field2082, arg6, (long) var59, "<col=ff9040>" + var60.field871, var20, class327.field5198, (short) 1009);
                                class191.field3052++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 452)
    public static final void method1618(int arg0, int arg1, int arg2) {
        class253.field4274 = true;
        class141.field2309 = arg0;
        class296.field4759 = arg1;
        class235.field3908 = arg2;
        class295.field4754 = -1;
        class74.field1266 = -1;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Z", line = 462)
    public static final boolean method1619(int arg0, int arg1) {
        field3433++;
        if (arg0 == 127) {
            class347.field5520 = true;
            class215.field3442 = arg1 + 1 & 0xFFFF;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZJ)V", line = 477)
    public static final void method1620(boolean arg0, long arg1) {
        field3436++;
        if (!class336.field5314) {
            class84.field1426 += (float) arg1 * class357.field5652 / 40.0F;
            class261.field4396 += (float) arg1 * class259.field4357 / 40.0F;
        }
        int var3 = class240.field3954;
        int var4 = class350.field5565;
        if (class282.field4621 != var4) {
            int var5 = var4 - class282.field4621;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class282.field4621 += var6;
        }
        if (class206.field3259 != var3) {
            int var7 = var3 - class206.field3259;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class206.field3259 += var8;
        }
        class29.method178(256);
        if (!arg0) {
            method1619(29, 35);
        }
    }
}
