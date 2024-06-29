import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class483 {

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field7032 = 0;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    private static int field7029 = 0;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "[[F")
    public static float[][] field7037 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "[Lf;")
    public static class191[] field7036;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "[[[Ldr;")
    public static class420[][][] field7028;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method2881(byte arg0, int arg1) {
        field7030++;
        return arg0 == 81 ? arg1 >>> 8 : -93;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V", line = 16)
    public static final void method2882(boolean arg0, int arg1) {
        class300.method1929((byte) -4);
        field7033++;
        if (class144.field2077 != 30 && class144.field2077 != 25) {
            return;
        }
        class429.field6381++;
        if (class429.field6381 < 50 && !arg0) {
            return;
        }
        if (arg1 != 8141) {
            field7036 = null;
        }
        class429.field6381 = 0;
        if (!class516.field7661 && class81.field1092 != null) {
            class179.method1287(false, class359.field5566);
            class173.field2488++;
            try {
                class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                class75.field1006.field1292 = 0;
            } catch (IOException var2) {
                class516.field7661 = true;
            }
        }
        class300.method1929((byte) -4);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Ljava/lang/String;", line = 54)
    public static final String method2883(int arg0, int arg1, int arg2) {
        field7038++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (arg2 != 29424) {
            return null;
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 95)
    public static final void method2884(int arg0) {
        field7035++;
        if (class375.field5739 > 1) {
            class375.field5739--;
            class111.field1561 = class485.field7086;
        }
        if (class432.field6405 > 0) {
            class432.field6405--;
        }
        if (class516.field7661) {
            class516.field7661 = false;
            class496.method2955(40);
            return;
        }
        if (!class455.field6680) {
            class80.method519(-116);
        }
        for (int var1 = 0; var1 < 100 && class417.method2525((byte) 52); var1++) {
        }
        if (class144.field2077 != 30) {
            return;
        }
        class275.method1747(-18, class193.field2739.method2714(126), class75.field1006);
        if (class295.field4365 == null) {
            if (class264.method1698(true) >= class381.field5814) {
                class295.field4365 = class335.field5162.method932(class244.field3414, 0);
            }
        } else if (class295.field4365.field1648 != -1) {
            class179.method1287(false, class240.field3391);
            class75.field1006.method600(class295.field4365.field1648, arg0 ^ 0xFFFFA1C8);
            class295.field4365 = null;
            class381.field5814 = class264.method1698(true) + 30000L;
        }
        class414 var2 = (class414) class94.field1369.method1970(64);
        if (var2 != null || (class264.method1698(true) - 2000L) > class112.field1572) {
            boolean var3 = false;
            int var4 = class75.field1006.field1292;
            for (class414 var5 = (class414) class217.field3018.method1970(arg0 ^ 0x6C2D); var5 != null && class75.field1006.field1292 - var4 < 240; var5 = (class414) class217.field3018.method1960(24)) {
                var5.method2785((byte) -120);
                int var6 = var5.method712(arg0 - 27710);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method717(18591);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method712(arg0 ^ 0x6C62) == -1 && var5.method717(18591) == -1) {
                    var7 = -1;
                    var8 = true;
                    var6 = -1;
                }
                if (class430.field6402 != var7 || class435.field6469 != var6) {
                    if (!var3) {
                        class179.method1287(false, class85.field1168);
                        class461.field6759++;
                        class75.field1006.method625(0, false);
                        var3 = true;
                        var4 = class75.field1006.field1292;
                    }
                    int var9 = var7 - class430.field6402;
                    class430.field6402 = var7;
                    int var10 = var6 - class435.field6469;
                    class435.field6469 = var6;
                    int var11 = (int) ((var5.method716(-125) - class112.field1572) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class75.field1006.method600((var11 << 12) + (var9 << 6) + var10, -12891);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        class75.field1006.method625(var11 + 128, false);
                        var10 += 128;
                        var9 += 128;
                        class75.field1006.method600((var9 << 8) + var10, -12891);
                    } else if (var11 < 32) {
                        class75.field1006.method625(var11 + 192, false);
                        if (var8) {
                            class75.field1006.method615(28010, Integer.MIN_VALUE);
                        } else {
                            class75.field1006.method615(arg0 + 253, var7 | var6 << 16);
                        }
                    } else {
                        class75.field1006.method600(var11 + 57344, -12891);
                        if (var8) {
                            class75.field1006.method615(28010, Integer.MIN_VALUE);
                        } else {
                            class75.field1006.method615(arg0 + 253, var6 << 16 | var7);
                        }
                    }
                    class112.field1572 = var5.method716(-121);
                }
            }
            if (var3) {
                class75.field1006.method596(class75.field1006.field1292 - var4, false);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method716(73) - class492.field7187) / 50L;
            class492.field7187 = var2.method716(-102);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method712(112);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method717(18591);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method715((byte) -91) == 2) {
                var16 = 1;
            }
            int var17 = (int) var12;
            class179.method1287(false, class197.field2778);
            class379.field5787++;
            class75.field1006.method600(var17 | var16 << 15, arg0 ^ 0xFFFFA1C8);
            class75.field1006.method632(var14 << 16 | var15, 213253176);
        }
        if (class12.field199 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class12.field199; var19++) {
                if (class453.field6651[var19].method1944(4)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class406.field6145++;
                class179.method1287(false, class502.field7493);
                if (var18 > 75) {
                    var18 = 75;
                }
                class75.field1006.method625(var18 * 3, false);
                for (int var20 = 0; var20 < class12.field199; var20++) {
                    class333 var21 = class453.field6651[var20];
                    if (var21.method1944(4)) {
                        long var22 = (var21.method1948(-69) - class427.field6357) / 50L;
                        class427.field6357 = var21.method1948(-110);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class75.field1006.method625(var21.method1946(4), false);
                        class75.field1006.method600((int) var22, arg0 - 40648);
                    }
                }
            }
        }
        if (class227.field3258 > 0) {
            class227.field3258--;
        }
        if (class314.field4804 && class227.field3258 <= 0) {
            class501.field7479++;
            class227.field3258 = 20;
            class314.field4804 = false;
            class179.method1287(false, class384.field5869);
            class75.field1006.method637((byte) 13, (int) class99.field1428 >> 3);
            class75.field1006.method600((int) class482.field7022 >> 3, -12891);
        }
        if (arg0 != 27757) {
            return;
        }
        if (class289.field4300 && !class528.field7808) {
            class442.field6566++;
            class528.field7808 = true;
            class179.method1287(false, class410.field6167);
            class75.field1006.method625(1, false);
        }
        if (!class289.field4300 && class528.field7808) {
            class528.field7808 = false;
            class442.field6566++;
            class179.method1287(false, class410.field6167);
            class75.field1006.method625(0, false);
        }
        if (!class406.field6129) {
            class273.field3783++;
            class179.method1287(false, class495.field7236);
            class75.field1006.method625(0, false);
            int var24 = class75.field1006.field1292;
            class91 var25 = class96.field1399.method1732(true);
            class75.field1006.method597(0, var25.field1277, false, var25.field1292);
            class75.field1006.method596(class75.field1006.field1292 - var24, false);
            class406.field6129 = true;
        }
        if (class380.field5802 != null) {
            if (class432.field6409 == 2) {
                class282.method1774((byte) 98);
            } else if (class432.field6409 == 3) {
                class325.method2106(-51);
            }
        }
        if (class327.field5012) {
            class327.field5012 = false;
        } else {
            class186.field2619 /= 2.0F;
        }
        if (client.field935) {
            client.field935 = false;
        } else {
            class128.field1809 /= 2.0F;
        }
        class331.method2136((byte) -101);
        if (class144.field2077 != 30) {
            return;
        }
        class281.method1761(0);
        class286.method1858(29217);
        class101.method684((byte) 127);
        class64.method432((byte) -57);
        class156.field2261++;
        if (class156.field2261 > 750) {
            class496.method2955(arg0 - 27717);
            return;
        }
        class333.method2144(26901);
        class269.method1719((byte) -116);
        class198.method1385(false);
        for (int var26 = class36.field583.method1194((byte) -123, true); var26 != -1; var26 = class36.field583.method1194((byte) -123, false)) {
            class526.method3116(8843, var26);
            class33.field525[class494.method2942(31, class217.field3012++)] = var26;
        }
        for (class377 var27 = class69.method475(0); var27 != null; var27 = class69.method475(0)) {
            int var28 = var27.method2341((byte) 95);
            int var29 = var27.method2345(255);
            if (var28 == 1) {
                class129.field1815[var29] = var27.field5763;
                class292.field4351 |= class397.field6038[var29];
                class433.field6426[class494.method2942(class456.field6700++, 31)] = var29;
            } else if (var28 == 2) {
                class508.field7561[var29] = var27.field5758;
                class457.field6703[class494.method2942(class189.field2655++, 31)] = var29;
            } else if (var28 == 3) {
                class499 var51 = class211.method1457(var29, 6687);
                if (!var27.field5758.equals(var51.field7437)) {
                    var51.field7437 = var27.field5758;
                    class338.method2189((byte) 116, var51);
                }
            } else if (var28 == 4) {
                class499 var47 = class211.method1457(var29, 6687);
                int var48 = var27.field5763;
                int var49 = var27.field5762;
                int var50 = var27.field5759;
                if (var47.field7380 != var48 || var47.field7358 != var49 || var47.field7317 != var50) {
                    var47.field7380 = var48;
                    var47.field7317 = var50;
                    var47.field7358 = var49;
                    class338.method2189((byte) 121, var47);
                }
            } else if (var28 == 5) {
                class499 var30 = class211.method1457(var29, 6687);
                if (var27.field5763 != var30.field7438 || var27.field5763 == -1) {
                    var30.field7335 = 1;
                    var30.field7287 = 0;
                    var30.field7438 = var27.field5763;
                    var30.field7412 = 0;
                    class338.method2189((byte) 104, var30);
                }
            } else if (var28 == 6) {
                int var41 = var27.field5763;
                int var42 = (var41 & 0x7E73) >> 10;
                int var43 = var41 >> 5 & 0x1F;
                int var44 = var41 & 0x1F;
                int var45 = (var43 << 11) + (var42 << 19) + (var44 << 3);
                class499 var46 = class211.method1457(var29, arg0 - 21070);
                if (var46.field7421 != var45) {
                    var46.field7421 = var45;
                    class338.method2189((byte) 118, var46);
                }
            } else if (var28 == 7) {
                class499 var39 = class211.method1457(var29, arg0 - 21070);
                boolean var40 = var27.field5763 == 1;
                if (var39.field7356 != var40) {
                    var39.field7356 = var40;
                    class338.method2189((byte) 103, var39);
                }
            } else if (var28 == 8) {
                class499 var38 = class211.method1457(var29, arg0 ^ 0x7672);
                if (var27.field5763 != var38.field7306 || var27.field5762 != var38.field7329 || var27.field5759 != var38.field7424) {
                    var38.field7306 = var27.field5763;
                    var38.field7424 = var27.field5759;
                    var38.field7329 = var27.field5762;
                    if (var38.field7310 != -1) {
                        if (var38.field7311 > 0) {
                            var38.field7424 = var38.field7424 * 32 / var38.field7311;
                        } else if (var38.field7319 > 0) {
                            var38.field7424 = var38.field7424 * 32 / var38.field7319;
                        }
                    }
                    class338.method2189((byte) 120, var38);
                }
            } else if (var28 == 9) {
                class499 var37 = class211.method1457(var29, arg0 - 21070);
                if (var27.field5763 != var37.field7310 || var27.field5762 != var37.field7284) {
                    var37.field7310 = var27.field5763;
                    var37.field7284 = var27.field5762;
                    class338.method2189((byte) 113, var37);
                }
            } else if (var28 == 10) {
                class499 var36 = class211.method1457(var29, arg0 ^ 0x7672);
                if (var27.field5763 != var36.field7320 || var27.field5762 != var36.field7339 || var27.field5759 != var36.field7346) {
                    var36.field7346 = var27.field5759;
                    var36.field7339 = var27.field5762;
                    var36.field7320 = var27.field5763;
                    class338.method2189((byte) 92, var36);
                }
            } else if (var28 == 11) {
                class499 var35 = class211.method1457(var29, 6687);
                var35.field7405 = 0;
                var35.field7337 = var35.field7359 = var27.field5762;
                var35.field7436 = 0;
                var35.field7326 = var35.field7333 = var27.field5763;
                class338.method2189((byte) 102, var35);
            } else if (var28 == 12) {
                class499 var33 = class211.method1457(var29, 6687);
                int var34 = var27.field5763;
                if (var33 != null && var33.field7355 == 0) {
                    if ((var33.field7293 - var33.field7386) < var34) {
                        var34 = var33.field7293 - var33.field7386;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field7389 != var34) {
                        var33.field7389 = var34;
                        class338.method2189((byte) 86, var33);
                    }
                }
            } else if (var28 == 14) {
                class499 var31 = class211.method1457(var29, 6687);
                var31.field7308 = var27.field5763;
            } else if (var28 == 15) {
                class479.field7009 = var27.field5762;
                class112.field1573 = var27.field5763;
                class390.field5913 = true;
            } else if (var28 == 16) {
                class499 var32 = class211.method1457(var29, 6687);
                var32.field7334 = var27.field5763;
            }
        }
        class501.field7485++;
        if (class442.field6565 != 0) {
            class528.field7799 += 20;
            if (class528.field7799 >= 400) {
                class442.field6565 = 0;
            }
        }
        if (class285.field4249 != null) {
            class149.field2154++;
            if (class149.field2154 >= 15) {
                class338.method2189((byte) 123, class285.field4249);
                class285.field4249 = null;
            }
        }
        class58.field775 = null;
        class111.field1560 = false;
        class217.field3009 = null;
        class181.field2577 = false;
        class54.method369(-1, -1, null, -10281);
        class517.method3079(-1, (byte) -111, null, -1);
        if (!class500.field7455) {
            class479.field7008 = -1;
        }
        class362.method2288(0);
        class485.field7086++;
        if (class277.field3840) {
            class179.method1287(false, class525.field7772);
            class255.field3528++;
            class75.field1006.method615(28010, class410.field6173 | class320.field4914 << 28 | class142.field2057 << 14);
            class277.field3840 = false;
        }
        while (true) {
            class199 var52;
            class499 var53;
            class499 var54;
            do {
                var52 = (class199) class62.field886.method1962(0);
                if (var52 == null) {
                    while (true) {
                        class199 var55;
                        class499 var56;
                        class499 var57;
                        do {
                            var55 = (class199) class494.field7220.method1962(0);
                            if (var55 == null) {
                                while (true) {
                                    class199 var58;
                                    class499 var59;
                                    class499 var60;
                                    do {
                                        var58 = (class199) class296.field4384.method1962(0);
                                        if (var58 == null) {
                                            if (class217.field3009 == null) {
                                                class515.field7638 = 0;
                                            }
                                            if (class362.field5615 != null) {
                                                class198.method1391(arg0 ^ 0x745DAF2C);
                                            }
                                            if (class528.field7809 > 0 && class382.field5821.method705((byte) 43, 82) && class382.field5821.method705((byte) 43, 81) && class338.field5349 != 0) {
                                                int var61 = class339.field5365.field2210 - class338.field5349;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class523.method3105(var61, class339.field5365.field5344[0] + class437.field6477, class339.field5365.field5339[0] + class82.field1105, (byte) 107);
                                            }
                                            class317.method2059(-25674);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class395.field6004[var62]++;
                                            }
                                            if (class292.field4351 && (class264.method1698(true) - 60000L) > class213.field2980) {
                                                class74.method492(119);
                                            }
                                            class441.field6564++;
                                            if (class441.field6564 > 500) {
                                                class441.field6564 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x4) == 4) {
                                                    class498.field7281 += class116.field1625;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class356.field5521 += class512.field7601;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class63.field894 += class121.field1727;
                                                }
                                            }
                                            if (class356.field5521 < -50) {
                                                class512.field7601 = 2;
                                            }
                                            if (class63.field894 < -55) {
                                                class121.field1727 = 2;
                                            }
                                            if (class356.field5521 > 50) {
                                                class512.field7601 = -2;
                                            }
                                            if (class498.field7281 < -40) {
                                                class116.field1625 = 1;
                                            }
                                            if (class63.field894 > 55) {
                                                class121.field1727 = -2;
                                            }
                                            if (class498.field7281 > 40) {
                                                class116.field1625 = -1;
                                            }
                                            field7029++;
                                            if (field7029 > 500) {
                                                field7029 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class384.field5871 += class123.field1770;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class235.field3345 += class86.field1172;
                                                }
                                            }
                                            if (class384.field5871 < -60) {
                                                class123.field1770 = 2;
                                            }
                                            if (class235.field3345 < -20) {
                                                class86.field1172 = 1;
                                            }
                                            if (class384.field5871 > 60) {
                                                class123.field1770 = -2;
                                            }
                                            class429.field6381++;
                                            if (class235.field3345 > 10) {
                                                class86.field1172 = -1;
                                            }
                                            if (class429.field6381 > 50) {
                                                class179.method1287(false, class359.field5566);
                                                class173.field2488++;
                                            }
                                            if (class340.field5371) {
                                                class515.method3061((byte) 127);
                                                class340.field5371 = false;
                                            }
                                            try {
                                                if (class81.field1092 != null && class75.field1006.field1292 > 0) {
                                                    class372.field5708 += class75.field1006.field1292;
                                                    class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                                                    class429.field6381 = 0;
                                                    class75.field1006.field1292 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class496.method2955(40);
                                                return;
                                            }
                                        }
                                        var59 = var58.field2817;
                                        if (var59.field7304 < 0) {
                                            break;
                                        }
                                        var60 = class211.method1457(var59.field7322, arg0 - 21070);
                                    } while (var60 == null || var60.field7423 == null || var60.field7423.length <= var59.field7304 || var60.field7423[var59.field7304] != var59);
                                    class291.method1886(var58);
                                }
                            }
                            var56 = var55.field2817;
                            if (var56.field7304 < 0) {
                                break;
                            }
                            var57 = class211.method1457(var56.field7322, arg0 - 21070);
                        } while (var57 == null || var57.field7423 == null || var57.field7423.length <= var56.field7304 || var57.field7423[var56.field7304] != var56);
                        class291.method1886(var55);
                    }
                }
                var53 = var52.field2817;
                if (var53.field7304 < 0) {
                    break;
                }
                var54 = class211.method1457(var53.field7322, arg0 - 21070);
            } while (var54 == null || var54.field7423 == null || var54.field7423.length <= var53.field7304 || var54.field7423[var53.field7304] != var53);
            class291.method1886(var52);
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V", line = 950)
    public static void method2885(int arg0) {
        field7028 = null;
        field7037 = null;
        field7036 = null;
        if (arg0 != 13323) {
            field7036 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)Lwk;", line = 962)
    public static final class171 method2886(int arg0, byte arg1) {
        field7034++;
        if (arg1 <= 114) {
            return null;
        }
        if (arg0 == 0) {
            if ((double) class135.field1961 == 3.0D) {
                return class270.field3761;
            }
            if ((double) class135.field1961 == 4.0D) {
                return class219.field3059;
            }
            if ((double) class135.field1961 == 6.0D) {
                return class40.field623;
            }
            if ((double) class135.field1961 >= 8.0D) {
                return class499.field7393;
            }
        } else if (arg0 == 1) {
            if ((double) class135.field1961 == 3.0D) {
                return class40.field623;
            }
            if ((double) class135.field1961 == 4.0D) {
                return class499.field7393;
            }
            if ((double) class135.field1961 == 6.0D) {
                return class180.field2571;
            }
            if ((double) class135.field1961 >= 8.0D) {
                return class149.field2144;
            }
        } else if (arg0 == 2) {
            if ((double) class135.field1961 == 3.0D) {
                return class180.field2571;
            }
            if ((double) class135.field1961 == 4.0D) {
                return class149.field2144;
            }
            if ((double) class135.field1961 == 6.0D) {
                return class162.field2346;
            }
            if ((double) class135.field1961 >= 8.0D) {
                return class413.field6207;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[[B", line = 1031)
    public static final byte[][][] method2887(int arg0, int arg1) {
        field7031++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if ((var22 << 1) <= var127) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if ((var40 << 1) <= var121) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= (var43 >> 1)) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= var46 << 1) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var55 >> 1 <= var116) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= var61 >> 1) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var64 << 1 >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = arg0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var3 / 2 <= var110) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= (var79 - (var4 / 2))) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= (var82 - var4 / 2)) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var85 - var4 / 2)) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= (var88 - (var4 / 2))) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var91 - (var4 / 2)) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - var4 / 2 <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var97 - (var4 / 2)) <= var102) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lav;B)Lav;")
    public abstract class189 method1852(class189 arg0, byte arg1);
}
