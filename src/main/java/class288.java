import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class288 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[Lae;")
    public static class174[] field4551 = new class174[29];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4553 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method1937(int arg0) {
        if (arg0 != 20459) {
            method1942(89);
        }
        field4555++;
        if (class195.field2698) {
            return;
        }
        if (class297.field4681) {
            class78.field1091 = (float) ((int) class78.field1091 + 47 & 0xFFFFFFF0);
        } else {
            class69.field935 += (12.0F - class69.field935) / 2.0F;
        }
        class20.field291 = true;
        class195.field2698 = true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method1938(byte arg0) {
        if (class261.field3946 > 1) {
            class261.field3946--;
            class7.field57 = class35.field548;
        }
        if (class202.field2795 > 0) {
            class202.field2795--;
        }
        field4557++;
        if (class229.field3477) {
            class229.field3477 = false;
            class282.method1892(-112);
            return;
        }
        for (int var1 = 0; var1 < 100 && class137.method929(-100); var1++) {
        }
        if (class79.field1097 != 30) {
            return;
        }
        class174.method1141(-76, 173, class281.field4359);
        Object var2 = class54.field784.field2787;
        synchronized (class54.field784.field2787) {
            if (!class256.field3922) {
                class54.field784.field2791 = 0;
            } else if (class202.field2798 != 0 || class54.field784.field2791 >= 40) {
                class177.field2486++;
                class281.field4359.method1864(97, (byte) -69);
                class281.field4359.method1447(0, 17363472);
                int var3 = 0;
                int var4 = class281.field4359.field3402;
                for (int var5 = 0; class54.field784.field2791 > var5 && (class281.field4359.field3402 - var4) < 240; var5++) {
                    int var6 = class54.field784.field2792[var5];
                    int var7 = class54.field784.field2790[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    var3++;
                    boolean var8 = false;
                    if (class54.field784.field2792[var5] == -1 && class54.field784.field2790[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class9.field84 != var7 || class10.field100 != var6) {
                        int var9 = var7 - class9.field84;
                        int var10 = var6 - class10.field100;
                        class9.field84 = var7;
                        class10.field100 = var6;
                        if (class36.field553 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class281.field4359.method1470(393660232, (class36.field553 << 12) + (var9 << 6) + var10);
                            class36.field553 = 0;
                        } else if (class36.field553 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class281.field4359.method1447(class36.field553 + 128, 17363472);
                            class281.field4359.method1470(393660232, (var9 << 8) + var10);
                            class36.field553 = 0;
                        } else if (class36.field553 < 32) {
                            class281.field4359.method1447(class36.field553 + 192, 17363472);
                            if (var8) {
                                class281.field4359.method1435(-95, Integer.MIN_VALUE);
                            } else {
                                class281.field4359.method1435(-104, var7 | var6 << 16);
                            }
                            class36.field553 = 0;
                        } else {
                            class281.field4359.method1470(393660232, class36.field553 + 57344);
                            if (var8) {
                                class281.field4359.method1435(-119, Integer.MIN_VALUE);
                            } else {
                                class281.field4359.method1435(-96, var7 | var6 << 16);
                            }
                            class36.field553 = 0;
                        }
                    } else if (class36.field553 < 2047) {
                        class36.field553++;
                    }
                }
                class281.field4359.method1466(class281.field4359.field3402 - var4, (byte) 84);
                if (var3 < class54.field784.field2791) {
                    class54.field784.field2791 -= var3;
                    for (int var11 = 0; var11 < class54.field784.field2791; var11++) {
                        class54.field784.field2790[var11] = class54.field784.field2790[var11 + var3];
                        class54.field784.field2792[var11] = class54.field784.field2792[var3 + var11];
                    }
                } else {
                    class54.field784.field2791 = 0;
                }
            }
        }
        if (class202.field2798 != 0) {
            class155.field2153++;
            long var12 = (class151.field2110 - class160.field2231) / 50L;
            class160.field2231 = class151.field2110;
            int var14 = class81.field1112;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class27.field344;
            byte var16 = 0;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var17 = (int) var12;
            if (class202.field2798 == 2) {
                var16 = 1;
            }
            class281.field4359.method1864(226, (byte) -69);
            class281.field4359.method1489(65280, var14 << 16 | var15);
            class281.field4359.method1440(var16 << 15 | var17, (byte) -111);
        }
        if (class86.field1171 > 0) {
            class86.field1171--;
        }
        if (class20.field291 && class86.field1171 <= 0) {
            class247.field3790++;
            class20.field291 = false;
            class86.field1171 = 20;
            class281.field4359.method1864(197, (byte) -69);
            class281.field4359.method1440((int) class68.field912, (byte) -107);
            class281.field4359.method1488((int) class78.field1091, -57);
        }
        if (class169.field2343 && !class170.field2354) {
            class170.field2354 = true;
            class42.field635++;
            class281.field4359.method1864(158, (byte) -69);
            class281.field4359.method1447(1, 17363472);
        }
        if (!class169.field2343 && class170.field2354) {
            class42.field635++;
            class170.field2354 = false;
            class281.field4359.method1864(158, (byte) -69);
            class281.field4359.method1447(0, 17363472);
        }
        if (!class173.field2418) {
            class281.field4359.method1864(147, (byte) -69);
            class281.field4359.method1463(8, class138.method935(true));
            class240.field3654++;
            class173.field2418 = true;
        }
        if (class36.field556) {
            class36.field556 = false;
        } else {
            class144.field1996 /= 2.0F;
        }
        if (class195.field2698) {
            class195.field2698 = false;
        } else {
            class69.field935 /= 2.0F;
        }
        class48.method314(-1);
        if (class79.field1097 != 30) {
            return;
        }
        class104.method680(0);
        class215.method1399(128);
        class31.method198(118);
        class214.field3226++;
        if (class214.field3226 > 750) {
            class282.method1892(-120);
            return;
        }
        class235.method1563(-28328);
        method1941(46);
        class109.method700(false);
        if (class124.field1748 != null) {
            class216.method1404(false);
        }
        int var18 = class277.method1852(true, (byte) 60);
        if (arg0 > -19) {
            method1938((byte) 64);
        }
        while (var18 != -1) {
            class278.method1858(-8, var18);
            class211.field3072[class235.method1572(class179.field2508++, 31)] = var18;
            var18 = class277.method1852(false, (byte) -73);
        }
        for (class280 var19 = class278.method1857(8); var19 != null; var19 = class278.method1857(8)) {
            int var20 = var19.method1872(-28395);
            int var21 = var19.method1878(88);
            if (var20 == 1) {
                class270.field4146[var21] = var19.field4330;
                class284.field4426[class235.method1572(class247.field3794++, 31)] = var21;
            } else if (var20 == 2) {
                class278.field4308[var21] = var19.field4336;
                class28.field361[class235.method1572(class28.field375++, 31)] = var21;
            } else if (var20 == 3) {
                class211 var42 = class67.method421(var21, 0);
                if (!var19.field4336.equals(var42.field3014)) {
                    var42.field3014 = var19.field4336;
                    class236.method1583(var42, 0);
                }
            } else if (var20 == 4) {
                class211 var22 = class67.method421(var21, 0);
                int var23 = var19.field4330;
                int var24 = var19.field4338;
                int var25 = var19.field4329;
                if (var22.field3027 != var23 || var22.field3075 != var24 || var22.field3177 != var25) {
                    var22.field3027 = var23;
                    var22.field3075 = var24;
                    var22.field3177 = var25;
                    class236.method1583(var22, 0);
                }
            } else if (var20 == 5) {
                class211 var41 = class67.method421(var21, 0);
                if (var19.field4330 != var41.field3083 || var19.field4330 == -1) {
                    var41.field3083 = var19.field4330;
                    var41.field3051 = 0;
                    var41.field3021 = 1;
                    var41.field3074 = 0;
                    class236.method1583(var41, 0);
                }
            } else if (var20 == 6) {
                int var26 = var19.field4330;
                int var27 = (var26 & 0x7EEE) >> 10;
                class211 var28 = class67.method421(var21, 0);
                int var29 = (var26 & 0x3EC) >> 5;
                int var30 = var26 & 0x1F;
                int var31 = (var27 << 19) + (var29 << 11) + (var30 << 3);
                if (var28.field3152 != var31) {
                    var28.field3152 = var31;
                    class236.method1583(var28, 0);
                }
            } else if (var20 == 7) {
                class211 var39 = class67.method421(var21, 0);
                boolean var40 = var19.field4330 == 1;
                if (var39.field3091 != var40) {
                    var39.field3091 = var40;
                    class236.method1583(var39, 0);
                }
            } else if (var20 == 8) {
                class211 var38 = class67.method421(var21, 0);
                if (var19.field4330 != var38.field3040 || var19.field4338 != var38.field3041 || var19.field4329 != var38.field3012) {
                    var38.field3040 = var19.field4330;
                    var38.field3012 = var19.field4329;
                    if (var38.field3086 != -1) {
                        if (var38.field3131 > 0) {
                            var38.field3012 = var38.field3012 * 32 / var38.field3131;
                        } else if (var38.field3026 > 0) {
                            var38.field3012 = var38.field3012 * 32 / var38.field3026;
                        }
                    }
                    var38.field3041 = var19.field4338;
                    class236.method1583(var38, 0);
                }
            } else if (var20 == 9) {
                class211 var37 = class67.method421(var21, 0);
                if (var19.field4330 != var37.field3086 || var19.field4338 != var37.field3132) {
                    var37.field3132 = var19.field4338;
                    var37.field3086 = var19.field4330;
                    class236.method1583(var37, 0);
                }
            } else if (var20 == 10) {
                class211 var36 = class67.method421(var21, 0);
                if (var19.field4330 != var36.field3089 || var19.field4338 != var36.field3036 || var19.field4329 != var36.field3122) {
                    var36.field3089 = var19.field4330;
                    var36.field3036 = var19.field4338;
                    var36.field3122 = var19.field4329;
                    class236.method1583(var36, 0);
                }
            } else if (var20 == 11) {
                class211 var32 = class67.method421(var21, 0);
                var32.field3101 = var32.field3081 = var19.field4338;
                var32.field3150 = 0;
                var32.field3137 = var32.field3025 = var19.field4330;
                var32.field3171 = 0;
                class236.method1583(var32, 0);
            } else if (var20 == 12) {
                class211 var33 = class67.method421(var21, 0);
                int var34 = var19.field4330;
                if (var33 != null && var33.field3035 == 0) {
                    if (var34 > (var33.field3146 - var33.field3166)) {
                        var34 = var33.field3146 - var33.field3166;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field3031 != var34) {
                        var33.field3031 = var34;
                        class236.method1583(var33, 0);
                    }
                }
            } else if (var20 == 13) {
                class211 var35 = class67.method421(var21, 0);
                var35.field3099 = var19.field4330;
            }
        }
        class225.field3409++;
        if (class281.field4347 != 0) {
            class21.field295 += 20;
            if (class21.field295 >= 400) {
                class281.field4347 = 0;
            }
        }
        if (class17.field183 != null) {
            class124.field1743++;
            if (class124.field1743 >= 15) {
                class236.method1583(class17.field183, 0);
                class17.field183 = null;
            }
        }
        if (class52.field758 != null) {
            class236.method1583(class52.field758, 0);
            if (class40.field595 + 5 < class12.field124 || class12.field124 < class40.field595 - 5 || class287.field4543 > (class173.field2410 + 5) || class287.field4543 < class173.field2410 - 5) {
                class103.field1436 = true;
            }
            class57.field826++;
            if (class104.field1455 == 0) {
                if (class103.field1436 && class57.field826 >= 5) {
                    if (class52.field758 == class131.field1843 && class197.field2742 != class100.field1396) {
                        class100.field1398++;
                        class211 var43 = class52.field758;
                        byte var44 = 0;
                        if (class77.field1083 == 1 && var43.field3062 == 206) {
                            var44 = 1;
                        }
                        if (var43.field3015[class197.field2742] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1040(var43).method1287(-14829)) {
                            int var45 = class100.field1396;
                            int var46 = class197.field2742;
                            var43.field3015[var46] = var43.field3015[var45];
                            var43.field3005[var46] = var43.field3005[var45];
                            var43.field3015[var45] = -1;
                            var43.field3005[var45] = 0;
                        } else if (var44 == 1) {
                            int var47 = class100.field1396;
                            int var48 = class197.field2742;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var43.method1378((byte) -5, var47 - 1, var47);
                                    var47--;
                                } else if (var47 < var48) {
                                    var43.method1378((byte) -5, var47 + 1, var47);
                                    var47++;
                                }
                            }
                        } else {
                            var43.method1378((byte) -5, class197.field2742, class100.field1396);
                        }
                        class281.field4359.method1864(106, (byte) -69);
                        class281.field4359.method1440(class197.field2742, (byte) -124);
                        class281.field4359.method1488(class100.field1396, -54);
                        class281.field4359.method1487(false, var44);
                        class281.field4359.method1489(65280, class52.field758.field3093);
                    }
                } else if ((class170.field2352 == 1 || class202.method1277(class68.field925 - 1, (byte) 83)) && class68.field925 > 2) {
                    class75.method483(1);
                } else if (class68.field925 > 0) {
                    class56.method349(-12173);
                }
                class52.field758 = null;
                class124.field1743 = 10;
                class202.field2798 = 0;
            }
        }
        class296.field4658 = null;
        class269.field4126 = 0;
        class30.field409 = false;
        class125.field1756 = false;
        class211 var49 = class270.field4147;
        class270.field4147 = null;
        class211 var50 = class206.field2884;
        class206.field2884 = null;
        while (class13.method79(127) && class269.field4126 < 128) {
            class60.field850[class269.field4126] = class269.field4129;
            class139.field1936[class269.field4126] = class178.field2499;
            class269.field4126++;
        }
        class124.field1748 = null;
        if (class212.field3193 != -1) {
            class198.method1264(0, 0, class275.field4263, 0, class197.field2739, 0, class212.field3193, true);
        }
        class35.field548++;
        while (true) {
            class27 var51;
            class211 var52;
            class211 var53;
            do {
                var51 = (class27) class145.field2020.method997((byte) -101);
                if (var51 == null) {
                    while (true) {
                        class27 var54;
                        class211 var55;
                        class211 var56;
                        do {
                            var54 = (class27) class197.field2736.method997((byte) -113);
                            if (var54 == null) {
                                while (true) {
                                    class27 var57;
                                    class211 var58;
                                    class211 var59;
                                    do {
                                        var57 = (class27) class216.field3257.method997((byte) -110);
                                        if (var57 == null) {
                                            if (class124.field1748 == null) {
                                                class180.field2523 = 0;
                                            }
                                            if (class208.field2967 != null) {
                                                class56.method350((byte) 72);
                                            }
                                            if (class229.field3470 > 0 && class138.field1928[82] && class138.field1928[81] && class215.field3248 != 0) {
                                                int var60 = class295.field4642 - class215.field3248;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class273.method1824(class217.field3280.field4032[0] + class216.field3255, class217.field3280.field4076[0] + class37.field565, -113, var60);
                                            }
                                            if (class229.field3470 > 0 && class138.field1928[82] && class138.field1928[81]) {
                                                if (class233.field3520 != -1) {
                                                    class273.method1824(class216.field3255 + class172.field2400, class37.field565 + class233.field3520, 85, class295.field4642);
                                                }
                                                class96.field1355 = 0;
                                                class54.field781 = 0;
                                            } else if (class54.field781 == 2) {
                                                if (class233.field3520 != -1) {
                                                    class281.field4359.method1864(5, (byte) -69);
                                                    class281.field4359.method1477(class37.field565 + class233.field3520, -61);
                                                    class119.field1680++;
                                                    class281.field4359.method1489(65280, class93.field1306);
                                                    class281.field4359.method1477(class216.field3255 + class172.field2400, -61);
                                                    class281.field4359.method1488(class144.field1998, -59);
                                                    class281.field4347 = 1;
                                                    class74.field1038 = class81.field1112;
                                                    class21.field295 = 0;
                                                    class172.field2384 = class27.field344;
                                                }
                                                class54.field781 = 0;
                                            } else if (class96.field1355 == 2) {
                                                if (class233.field3520 != -1) {
                                                    class281.field4359.method1864(96, (byte) -69);
                                                    class281.field4359.method1470(393660232, class216.field3255 + class172.field2400);
                                                    class281.field4359.method1440(class37.field565 + class233.field3520, (byte) -95);
                                                    class21.field295 = 0;
                                                    class172.field2384 = class27.field344;
                                                    class74.field1038 = class81.field1112;
                                                    class214.field3223++;
                                                    class281.field4347 = 1;
                                                }
                                                class96.field1355 = 0;
                                            } else if (class233.field3520 != -1 && class54.field781 == 0 && class96.field1355 == 0) {
                                                class280.method1870(0, (class233.field3520 << 1) + 1 - class217.field3280.method561(-1) >> 1, (class172.field2400 << 1) + 1 - class217.field3280.method561(-1) >> 1, -122);
                                                class281.field4347 = 1;
                                                class74.field1038 = class81.field1112;
                                                class172.field2384 = class27.field344;
                                                class21.field295 = 0;
                                            }
                                            class233.field3520 = -1;
                                            class197.method1255((byte) -62);
                                            if (class270.field4147 != var49) {
                                                if (var49 != null) {
                                                    class236.method1583(var49, 0);
                                                }
                                                if (class270.field4147 != null) {
                                                    class236.method1583(class270.field4147, 0);
                                                }
                                            }
                                            if (class206.field2884 != var50 && class38.field569 == class22.field319) {
                                                if (var50 != null) {
                                                    class236.method1583(var50, 0);
                                                }
                                                if (class206.field2884 != null) {
                                                    class236.method1583(class206.field2884, 0);
                                                }
                                            }
                                            if (class206.field2884 == null) {
                                                if (class22.field319 > 0) {
                                                    class22.field319--;
                                                }
                                            } else if (class38.field569 > class22.field319) {
                                                class22.field319++;
                                                if (class38.field569 == class22.field319) {
                                                    class236.method1583(class206.field2884, 0);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class114.field1638[var61]++;
                                            }
                                            int var62 = class78.method502(true);
                                            int var63 = class139.method938(0);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class202.field2795 = 250;
                                                class39.field574++;
                                                class173.method1134(14500, (byte) 84);
                                                class281.field4359.method1864(108, (byte) -69);
                                            }
                                            if (class143.field1981 != null && class143.field1981.field1663 == 1) {
                                                if (class143.field1981.field1665 != null) {
                                                    class16.method94(class83.field1130, false, class136.field1903);
                                                }
                                                class136.field1903 = false;
                                                class83.field1130 = null;
                                                class143.field1981 = null;
                                            }
                                            class178.field2488++;
                                            class215.field3251++;
                                            class95.field1349++;
                                            if (class95.field1349 > 500) {
                                                class95.field1349 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class163.field2263 += class188.field2587;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class207.field2887 += class103.field1437;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class42.field636 += class39.field588;
                                                }
                                            }
                                            if (class215.field3251 > 500) {
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class111.field1600 += class179.field2506;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class217.field3266 += class32.field473;
                                                }
                                                class215.field3251 = 0;
                                            }
                                            if (class207.field2887 < -55) {
                                                class103.field1437 = 2;
                                            }
                                            if (class111.field1600 < -20) {
                                                class179.field2506 = 1;
                                            }
                                            if (class42.field636 < -40) {
                                                class39.field588 = 1;
                                            }
                                            if (class111.field1600 > 10) {
                                                class179.field2506 = -1;
                                            }
                                            if (class42.field636 > 40) {
                                                class39.field588 = -1;
                                            }
                                            if (class207.field2887 > 55) {
                                                class103.field1437 = -2;
                                            }
                                            if (class217.field3266 < -60) {
                                                class32.field473 = 2;
                                            }
                                            if (class163.field2263 < -50) {
                                                class188.field2587 = 2;
                                            }
                                            if (class217.field3266 > 60) {
                                                class32.field473 = -2;
                                            }
                                            if (class163.field2263 > 50) {
                                                class188.field2587 = -2;
                                            }
                                            if (class178.field2488 > 50) {
                                                class281.field4359.method1864(116, (byte) -69);
                                                class226.field3434++;
                                            }
                                            if (class94.field1314) {
                                                class286.method1928(-119);
                                                class94.field1314 = false;
                                            }
                                            try {
                                                if (class290.field4567 != null && class281.field4359.field3402 > 0) {
                                                    class290.field4567.method1967(class281.field4359.field3336, 0, class281.field4359.field3402, 0);
                                                    class281.field4359.field3402 = 0;
                                                    class178.field2488 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class282.method1892(-103);
                                                return;
                                            }
                                        }
                                        var58 = var57.field338;
                                        if (var58.field3042 < 0) {
                                            break;
                                        }
                                        var59 = class67.method421(var58.field3127, 0);
                                    } while (var59 == null || var59.field3180 == null || var58.field3042 >= var59.field3180.length || var59.field3180[var58.field3042] != var58);
                                    class213.method1392(var57, 90);
                                }
                            }
                            var55 = var54.field338;
                            if (var55.field3042 < 0) {
                                break;
                            }
                            var56 = class67.method421(var55.field3127, 0);
                        } while (var56 == null || var56.field3180 == null || var55.field3042 >= var56.field3180.length || var56.field3180[var55.field3042] != var55);
                        class213.method1392(var54, 124);
                    }
                }
                var52 = var51.field338;
                if (var52.field3042 < 0) {
                    break;
                }
                var53 = class67.method421(var52.field3127, 0);
            } while (var53 == null || var53.field3180 == null || var53.field3180.length <= var52.field3042 || var53.field3180[var52.field3042] != var52);
            class213.method1392(var51, 96);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static final void method1939(int arg0) {
        field4554++;
        while (class233.field3518.method1863(-7686, class105.field1460) >= 11) {
            int var1 = class233.field3518.method1865(11, 8);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class154.field2133[var1] == null) {
                var2 = true;
                class154.field2133[var1] = new class88();
                if (class248.field3803[var1] != null) {
                    class154.field2133[var1].method563(3, class248.field3803[var1]);
                }
            }
            class205.field2848[class103.field1442++] = var1;
            class88 var3 = class154.field2133[var1];
            var3.field4090 = class52.field740;
            int var4 = class233.field3518.method1865(5, 8);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class233.field3518.method1865(5, 8);
            int var6 = class233.field3518.method1865(1, 8);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class63.field870[class242.field3711++] = var1;
            }
            int var7 = class233.field3518.method1865(1, 8);
            int var8 = class290.field4566[class233.field3518.method1865(3, 8)];
            if (var2) {
                var3.field4009 = var3.field4010 = var8;
            }
            var3.method564(class217.field3280.field4032[0] + var4, class217.field3280.field4076[0] + var5, (byte) 124, var7 == 1);
        }
        if (arg0 != -32637) {
            field4551 = null;
        }
        class233.field3518.method1860(arg0 + 15664);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lse;II)I")
    public static final int method1940(class211 arg0, int arg1, int arg2) {
        field4556++;
        if (!client.method1040(arg0).method1288(arg1, (byte) 115) && arg0.field3169 == null) {
            return -1;
        } else {
            if (arg2 != 935) {
                field4553 = 74;
            }
            return arg0.field3141 == null || arg1 >= arg0.field3141.length ? -1 : arg0.field3141[arg1];
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    private static final void method1941(int arg0) {
        for (int var1 = 0; var1 < class92.field1283; var1++) {
            int var3 = class194.field2688[var1];
            class140 var4 = class119.field1679[var3];
            if (var4 != null) {
                class74.method473(var4.field1946.field4431, true, var4);
            }
        }
        int var2 = 0 % ((arg0 + 76) / 46);
        field4552++;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method1942(int arg0) {
        field4551 = null;
        if (arg0 != 10) {
            field4553 = -3;
        }
    }
}
