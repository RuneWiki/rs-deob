import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 extends class194 {

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public int field1437 = 0;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Lqk;")
    public static class207 field1441 = class24.method212(255, "::gc");

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lqk;")
    public static class207 field1433 = class24.method212(255, "<col=ffffff>");

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "[Lka;")
    public static class256[] field1449 = new class256[32768];

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "Lqk;")
    private static class207 field1444 = class24.method212(255, "Continue");

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "Lqk;")
    public static class207 field1453 = field1444;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "Lfk;")
    public class14 field1448;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "Lwd;")
    public class22 field1457;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lka;")
    public class256 field1432;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Lph;")
    public class77 field1434;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Lph;")
    public class77 field1438;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Z")
    public boolean field1452;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
    public int[] field1439;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "[Lm;")
    public static class115[] field1442;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public static void method597(boolean arg0) {
        field1441 = null;
        field1449 = null;
        if (arg0) {
            method600(-62, -58, 67, 93, 65, (byte) 38, -81, 17, 48, 90);
        }
        field1433 = null;
        field1453 = null;
        field1442 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([Lmd;IIIIIBIII)V")
    public static final void method598(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        class23.method164(arg7, arg5, arg2, arg4);
        class257.method1794();
        int var10 = 63 / ((8 - arg6) / 43);
        field1447++;
        for (int var11 = 0; var11 < arg0.length; var11++) {
            class220 var12 = arg0[var11];
            if (var12 != null && (var12.field4045 == arg3 || arg3 == -1412584499 && class33.field659 == var12)) {
                int var13;
                if (arg9 == -1) {
                    class43.field852[class110.field1930] = var12.field3909 + arg8;
                    class111.field1941[class110.field1930] = var12.field3912 + arg1;
                    class68.field1209[class110.field1930] = var12.field4037;
                    class128.field2229[class110.field1930] = var12.field3948;
                    var13 = class110.field1930++;
                } else {
                    var13 = arg9;
                }
                var12.field4042 = var13;
                var12.field3897 = class160.field2844;
                if (!var12.field4010 || !client.method1116(var12)) {
                    if (var12.field3960 > 0) {
                        class260.method1810(-69, var12);
                    }
                    int var14 = var12.field3912 + arg1;
                    int var15 = var12.field3894;
                    int var16 = var12.field3909 + arg8;
                    if (class138.field2385 && (client.method1112(var12).field2021 != 0 || var12.field3988 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class33.field659 == var12) {
                        if (arg3 != -1412584499 && !var12.field3885) {
                            class68.field1206 = arg8;
                            class269.field4762 = arg1;
                            class159.field2809 = arg0;
                            continue;
                        }
                        if (!var12.field3885) {
                            var15 = 128;
                        }
                        if (class255.field4567 && class270.field4783) {
                            int var17 = class20.field322;
                            int var18 = class268.field4747;
                            int var19 = var18 - class254.field4543;
                            if (class282.field4959 > var19) {
                                var19 = class282.field4959;
                            }
                            if (var19 + var12.field3948 > class282.field4959 + class154.field2673.field3948) {
                                var19 = class282.field4959 - (var12.field3948 - class154.field2673.field3948);
                            }
                            int var20 = var17 - class60.field1112;
                            if (client.field2691 > var20) {
                                var20 = client.field2691;
                            }
                            var14 = var19;
                            if (var12.field4037 + var20 > client.field2691 + class154.field2673.field4037) {
                                var20 = client.field2691 + class154.field2673.field4037 - var12.field4037;
                            }
                            var16 = var20;
                        }
                    }
                    int var22;
                    int var23;
                    int var25;
                    int var26;
                    if (var12.field3988 == 2) {
                        var26 = arg4;
                        var23 = arg7;
                        var25 = arg2;
                        var22 = arg5;
                    } else {
                        int var21 = var16 + var12.field4037;
                        var22 = arg5 < var14 ? var14 : arg5;
                        var23 = var16 <= arg7 ? arg7 : var16;
                        int var24 = var14 + var12.field3948;
                        if (var12.field3988 == 9) {
                            var24++;
                            var21++;
                        }
                        var25 = var21 < arg2 ? var21 : arg2;
                        var26 = var24 >= arg4 ? arg4 : var24;
                    }
                    if (!var12.field4010 || var25 > var23 && var26 > var22) {
                        if (var12.field3960 != 0) {
                            if (var12.field3960 == 1337) {
                                class206.field3613 = var16;
                                class127.field2196 = var14;
                                class262.field4670 = var12;
                                class74.method533(var16, var12.field3960 == 1403, var12.field4037, var12.field3948, var14, 1);
                                class23.method164(arg7, arg5, arg2, arg4);
                                continue;
                            }
                            if (var12.field3960 == 1338) {
                                if (!var12.method1561((byte) -32)) {
                                    continue;
                                }
                                class155.method1127(var16, var12, var14, var13, -127);
                                class23.method164(arg7, arg5, arg2, arg4);
                                if (class185.field3283 != 0 && class185.field3283 != 3 || class256.field4588 || var23 > class16.field261 || var22 > class21.field346 || class16.field261 >= var25 || class21.field346 >= var26) {
                                    continue;
                                }
                                int var27 = class21.field346 - var14;
                                int var28 = class16.field261 - var16;
                                int var29 = var12.field4026[var27];
                                if (var29 > var28 || var28 > (var12.field3907[var27] + var29)) {
                                    continue;
                                }
                                int var30 = var27 - var12.field3948 / 2;
                                int var31 = var28 - var12.field4037 / 2;
                                int var32 = class70.field1254 + class266.field4711 & 0x7FF;
                                int var33 = class257.field4597[var32];
                                int var34 = (class225.field4098 + 256) * var33 >> 8;
                                int var35 = class257.field4598[var32];
                                int var36 = (class225.field4098 + 256) * var35 >> 8;
                                int var37 = var30 * var36 + var31 * var34 >> 11;
                                int var38 = var30 * var34 - var31 * var36 >> 11;
                                int var39 = class202.field3565.field5104 + var37 >> 7;
                                int var40 = class202.field3565.field5072 - var38 >> 7;
                                if (class4.field71 && (class60.field1096 & 0x40) != 0) {
                                    class220 var41 = class108.method782((byte) -60, class231.field4236, class13.field176);
                                    if (var41 == null) {
                                        class219.method1553(-115);
                                    } else {
                                        class156.method1143((short) 23, var40, 1L, class127.field2218, var39, -28775, class49.field969, class185.field3280);
                                    }
                                    continue;
                                }
                                if (class171.field3035 == 1) {
                                    class156.method1143((short) 22, var40, 1L, -1, var39, -28775, class68.field1213, class100.field1800);
                                }
                                class156.method1143((short) 29, var40, 1L, -1, var39, -28775, class273.field4806, class100.field1800);
                                continue;
                            }
                            if (var12.field3960 == 1339) {
                                if (var12.method1561((byte) -76)) {
                                    class31.method241(4703, var16, var13, var14, var12);
                                    class23.method164(arg7, arg5, arg2, arg4);
                                }
                                continue;
                            }
                            if (var12.field3960 == 1400) {
                                class165.method1193(var16, var12.field3948, var14, (byte) -125, var12.field4037);
                                class140.field2431[var13] = true;
                                class212.field3766[var13] = true;
                                class23.method164(arg7, arg5, arg2, arg4);
                                continue;
                            }
                            if (var12.field3960 == 1401) {
                                class59.method432(var12.field3948, 10987, var12.field4037, var14, var16);
                                class140.field2431[var13] = true;
                                class212.field3766[var13] = true;
                                class23.method164(arg7, arg5, arg2, arg4);
                                continue;
                            }
                            if (var12.field3960 == 1402) {
                                class51.method390(var16, true, var14);
                                class140.field2431[var13] = true;
                                class212.field3766[var13] = true;
                                continue;
                            }
                            if (var12.field3960 == 1405) {
                                if (!class31.field633) {
                                    continue;
                                }
                                int var42 = var16 + var12.field4037;
                                int var43 = var14 + 15;
                                class176.field3183.method1594(class105.method757(false, new class207[] { class131.field2269, class262.method1815(class8.field110, (byte) -124) }), var42, var43, 16776960, -1);
                                int var44 = 16776960;
                                int var45 = 0;
                                int var131 = var43 + 15;
                                Runtime var46 = Runtime.getRuntime();
                                int var47 = 0;
                                int var48 = 0;
                                int var49 = (int) ((var46.totalMemory() - var46.freeMemory()) / 1024L);
                                if (var49 > 65536) {
                                    var44 = 16711680;
                                }
                                class176.field3183.method1594(class105.method757(false, new class207[] { class25.field519, class262.method1815(var49, (byte) 119), class14.field198 }), var42, var131, var44, -1);
                                int var50 = 16776960;
                                for (int var51 = 0; var51 < 28; var51++) {
                                    var45 += class247.field4478[var51].method1216(23125);
                                    var47 += class247.field4478[var51].method1218((byte) 70);
                                    var48 += class247.field4478[var51].method1219(-53);
                                }
                                var43 = var131 + 15;
                                int var52 = var48 * 100 / var45;
                                int var53 = var47 * 10000 / var45;
                                class207 var54 = class105.method757(false, new class207[] { class279.field4896, class36.method259(true, (long) var53, (byte) -85, 2, 0), class2.field39, class262.method1815(var52, (byte) 100), class159.field2808 });
                                class167.field2940.method1594(var54, var42, var43, var50, -1);
                                var43 += 12;
                                class140.field2431[var13] = true;
                                class212.field3766[var13] = true;
                                continue;
                            }
                            if (var12.field3960 == 1406) {
                                class188.field3315 = var12;
                                class230.field4226 = var14;
                                class106.field1883 = var16;
                                continue;
                            }
                        }
                        if (!class256.field4588) {
                            if (var12.field3988 == 0 && var12.field3874 && class16.field261 >= var23 && var22 <= class21.field346 && class16.field261 < var25 && var26 > class21.field346 && !class138.field2385) {
                                class110.field1926[0] = class99.field1781;
                                class82.field1494[0] = 1003;
                                class12.field167[0] = class100.field1800;
                                class268.field4751 = 1;
                                class131.field2273[0] = class175.field3166;
                            }
                            if (class16.field261 >= var23 && var22 <= class21.field346 && class16.field261 < var25 && var26 > class21.field346) {
                                class46.method353(var12, class16.field261 - var16, -var14 + class21.field346, -110);
                            }
                        }
                        if (var12.field3988 == 0) {
                            if (!var12.field4010 && client.method1116(var12) && class204.field3597 != var12) {
                                continue;
                            }
                            if (!var12.field4010) {
                                if (var12.field4059 > (var12.field3991 - var12.field3948)) {
                                    var12.field4059 = var12.field3991 - var12.field3948;
                                }
                                if (var12.field4059 < 0) {
                                    var12.field4059 = 0;
                                }
                            }
                            method598(arg0, var14 - var12.field4059, var25, var12.field3933, var26, var22, (byte) -119, var23, var16 - var12.field3891, var13);
                            if (var12.field3959 != null) {
                                method598(var12.field3959, var14 - var12.field4059, var25, var12.field3933, var26, var22, (byte) -86, var23, var16 - var12.field3891, var13);
                            }
                            class47 var55 = (class47) class171.field3028.method1867((long) var12.field3933, true);
                            if (var55 != null) {
                                if (var55.field926 == 0 && !class256.field4588 && var23 <= class16.field261 && var22 <= class21.field346 && var25 > class16.field261 && class21.field346 < var26 && !class138.field2385) {
                                    class131.field2273[0] = class175.field3166;
                                    class82.field1494[0] = 1003;
                                    class268.field4751 = 1;
                                    class110.field1926[0] = class99.field1781;
                                    class12.field167[0] = class100.field1800;
                                }
                                class73.method531(var16, var13, var25, var14, var23, var55.field934, var22, 30442, var26);
                            }
                            class23.method164(arg7, arg5, arg2, arg4);
                            class257.method1794();
                        }
                        if (class9.field137[var13] || class199.field3484 > 1) {
                            if (var12.field3988 == 0 && !var12.field4010 && var12.field3948 < var12.field3991) {
                                class255.method1774(var12.field4037 + var16, var12.field3948, var12.field4059, (byte) -40, var14, var12.field3991);
                            }
                            if (var12.field3988 != 1) {
                                if (var12.field3988 == 2) {
                                    int var56 = 0;
                                    for (int var57 = 0; var57 < var12.field4009; var57++) {
                                        for (int var58 = 0; var58 < var12.field3995; var58++) {
                                            int var59 = var14 + ((var12.field3905 + 32) * var57);
                                            int var60 = (var12.field3886 + 32) * var58 + var16;
                                            if (var56 < 20) {
                                                var60 += var12.field3913[var56];
                                                var59 += var12.field4038[var56];
                                            }
                                            if (var12.field3963[var56] > 0) {
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                int var64 = var12.field3963[var56] - 1;
                                                if (arg7 < (var60 + 32) && arg2 > var60 && var59 + 32 > arg5 && var59 < arg4 || class70.field1245 == var12 && class283.field4978 == var56) {
                                                    class100 var65;
                                                    if (class34.field680 == 1 && class147.field2538 == var56 && class70.field1243 == var12.field3933) {
                                                        var65 = class216.method1549(var12.field4054, 0, var64, 2, var12.field3939[var56], (byte) -59);
                                                    } else {
                                                        var65 = class216.method1549(var12.field4054, 3153952, var64, 1, var12.field3939[var56], (byte) -59);
                                                    }
                                                    if (class257.field4594) {
                                                        class140.field2431[var13] = true;
                                                    }
                                                    if (var65 == null) {
                                                        class82.method614((byte) 44, var12);
                                                    } else if (class70.field1245 == var12 && class283.field4978 == var56) {
                                                        int var66 = class268.field4747 - class267.field4721;
                                                        int var67 = class20.field322 - class287.field5123;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class279.field4905 < 5) {
                                                            var67 = 0;
                                                            var66 = 0;
                                                        }
                                                        var65.method384(var60 + var67, var59 - -var66, 128);
                                                        if (arg3 != -1) {
                                                            class220 var68 = arg0[arg3 & 0xFFFF];
                                                            int var69 = class23.field441;
                                                            int var70 = class23.field437;
                                                            if (var70 > (var59 + var66) && var68.field4059 > 0) {
                                                                int var71 = (var70 - var66 - var59) * class20.field325 / 3;
                                                                if (class20.field325 * 10 < var71) {
                                                                    var71 = class20.field325 * 10;
                                                                }
                                                                if (var68.field4059 < var71) {
                                                                    var71 = var68.field4059;
                                                                }
                                                                var68.field4059 -= var71;
                                                                class267.field4721 += var71;
                                                                class82.method614((byte) 74, var68);
                                                            }
                                                            if (var69 < var59 + var66 + 32 && (var68.field3991 - var68.field3948) > var68.field4059) {
                                                                int var72 = (var59 + var66 + 32 - var69) * class20.field325 / 3;
                                                                if (var72 > (class20.field325 * 10)) {
                                                                    var72 = class20.field325 * 10;
                                                                }
                                                                if (var72 > (var68.field3991 - var68.field3948 - var68.field4059)) {
                                                                    var72 = var68.field3991 - var68.field4059 - var68.field3948;
                                                                }
                                                                class267.field4721 -= var72;
                                                                var68.field4059 += var72;
                                                                class82.method614((byte) 113, var68);
                                                            }
                                                        }
                                                    } else if (class41.field816 == var12 && class190.field3358 == var56) {
                                                        var65.method384(var60, var59, 128);
                                                    } else {
                                                        var65.method381(var60, var59);
                                                    }
                                                }
                                            } else if (var12.field3984 != null && var56 < 20) {
                                                class100 var61 = var12.method1562(-128, var56);
                                                if (var61 != null) {
                                                    var61.method381(var60, var59);
                                                } else if (class22.field427) {
                                                    class82.method614((byte) 100, var12);
                                                }
                                            }
                                            var56++;
                                        }
                                    }
                                } else if (var12.field3988 == 3) {
                                    int var73;
                                    if (class107.method780(19684, var12)) {
                                        var73 = var12.field3934;
                                        if (class204.field3597 == var12 && var12.field3949 != 0) {
                                            var73 = var12.field3949;
                                        }
                                    } else {
                                        var73 = var12.field3993;
                                        if (class204.field3597 == var12 && var12.field3972 != 0) {
                                            var73 = var12.field3972;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var12.field4032) {
                                            class23.method167(var16, var14, var12.field4037, var12.field3948, var73);
                                        } else {
                                            class23.method166(var16, var14, var12.field4037, var12.field3948, var73);
                                        }
                                    } else if (var12.field4032) {
                                        class23.method159(var16, var14, var12.field4037, var12.field3948, var73, 256 - (var15 & 0xFF));
                                    } else {
                                        class23.method156(var16, var14, var12.field4037, var12.field3948, var73, 256 - (var15 & 0xFF));
                                    }
                                } else if (var12.field3988 == 4) {
                                    class226 var74 = var12.method1565(class249.field4512, -21419);
                                    if (var74 != null) {
                                        class207 var75 = var12.field3998;
                                        int var76;
                                        if (class107.method780(19684, var12)) {
                                            var76 = var12.field3934;
                                            if (class204.field3597 == var12 && var12.field3949 != 0) {
                                                var76 = var12.field3949;
                                            }
                                            if (var12.field3946.method1450((byte) -121) > 0) {
                                                var75 = var12.field3946;
                                            }
                                        } else {
                                            var76 = var12.field3993;
                                            if (class204.field3597 == var12 && var12.field3972 != 0) {
                                                var76 = var12.field3972;
                                            }
                                        }
                                        if (var12.field4010 && var12.field3884 != -1) {
                                            class173 var77 = class117.method829(var12.field3884, (byte) 89);
                                            var75 = var77.field3057;
                                            if (var75 == null) {
                                                var75 = class150.field2628;
                                            }
                                            if ((var77.field3067 == 1 || var12.field3911 != 1) && var12.field3911 != -1) {
                                                var75 = class105.method757(false, new class207[] { class190.field3351, var75, class151.field2650, class65.method474(var12.field3911, -125) });
                                            }
                                        }
                                        if (class89.field1605 == var12) {
                                            var75 = class133.field2302;
                                            var76 = var12.field3993;
                                        }
                                        if (!var12.field4010) {
                                            var75 = class83.method624(var12, var75, 0);
                                        }
                                        var74.method1609(var75, var16, var14, var12.field4037, var12.field3948, var76, var12.field4001 ? 0 : -1, var12.field3965, var12.field3989, var12.field4003);
                                    } else if (class22.field427) {
                                        class82.method614((byte) 95, var12);
                                    }
                                } else if (var12.field3988 == 5) {
                                    if (var12.field4010) {
                                        class100 var78;
                                        if (var12.field3884 == -1) {
                                            var78 = var12.method1568((byte) 48, false);
                                        } else {
                                            var78 = class216.method1549(var12.field4054, var12.field4050, var12.field3884, var12.field3958, var12.field3911, (byte) -59);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field1806;
                                            int var80 = var78.field1810;
                                            if (var12.field4046) {
                                                int var81 = (var79 + var12.field4037 - 1) / var79;
                                                int var82 = (var80 - (1 - var12.field3948)) / var80;
                                                class23.method157(var16, var14, var12.field4037 + var16, var12.field3948 + var14);
                                                for (int var83 = 0; var83 < var81; var83++) {
                                                    for (int var84 = 0; var84 < var82; var84++) {
                                                        if (var12.field3951 != 0) {
                                                            var78.method734(var80 / 2 + var80 * var84 + var14, var12.field3951, var79 * var83 + var79 / 2 + var16, 4096, (byte) 73);
                                                        } else if (var15 == 0) {
                                                            var78.method381(var79 * var83 + var16, var80 * var84 + var14);
                                                        } else {
                                                            var78.method384(var79 * var83 + var16, var14 - -(var80 * var84), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class23.method164(arg7, arg5, arg2, arg4);
                                            } else {
                                                int var85 = var12.field4037 * 4096 / var79;
                                                if (var12.field3951 != 0) {
                                                    var78.method734(var12.field3948 / 2 + var14, var12.field3951, var12.field4037 / 2 + var16, var85, (byte) 73);
                                                } else if (var15 != 0) {
                                                    var78.method388(var16, var14, var12.field4037, var12.field3948, 256 - (var15 & 0xFF));
                                                } else if (var12.field4037 == var79 && var12.field3948 == var80) {
                                                    var78.method381(var16, var14);
                                                } else {
                                                    var78.method374(var16, var14, var12.field4037, var12.field3948);
                                                }
                                            }
                                        } else if (class22.field427) {
                                            class82.method614((byte) 64, var12);
                                        }
                                    } else {
                                        class100 var86 = var12.method1568((byte) -82, class107.method780(19684, var12));
                                        if (var86 != null) {
                                            var86.method381(var16, var14);
                                        } else if (class22.field427) {
                                            class82.method614((byte) 99, var12);
                                        }
                                    }
                                } else if (var12.field3988 == 6) {
                                    class166 var87 = null;
                                    int var88 = 0;
                                    boolean var89 = class107.method780(19684, var12);
                                    int var90;
                                    if (var89) {
                                        var90 = var12.field3924;
                                    } else {
                                        var90 = var12.field3882;
                                    }
                                    if (var12.field3884 != -1) {
                                        class173 var95 = class117.method829(var12.field3884, (byte) 127);
                                        if (var95 != null) {
                                            class173 var96 = var95.method1241(var12.field3911, 5994);
                                            class65 var97 = var90 == -1 ? null : class16.method101((byte) -94, var90);
                                            var87 = var96.method1238(var12.field4033, var12.field4012, var97, 14444, var12.field4017, 1);
                                            if (var87 == null) {
                                                class82.method614((byte) 57, var12);
                                            } else {
                                                var88 = -var87.method80() / 2;
                                            }
                                        }
                                    } else if (var12.field3944 == 5) {
                                        if (var12.field4047 == -1) {
                                            var87 = class126.field2192.method366(0, -1, true, (class65) null, -1, (class195[]) null, 0, -1, -1, 202667960, (class65) null);
                                        } else {
                                            int var92 = var12.field4047 & 0x7FF;
                                            if (class19.field313 == var92) {
                                                var92 = 2047;
                                            }
                                            class14 var93 = class169.field2953[var92];
                                            class65 var94 = var90 == -1 ? null : class16.method101((byte) -105, var90);
                                            if (var93 != null && ((int) var93.field209.method1428(0) << 11) == (var12.field4047 & 0xFFFFF800)) {
                                                var87 = var93.field229.method366(0, -1, true, (class65) null, 0, (class195[]) null, 0, var12.field4017, -1, 202667960, var94);
                                            }
                                        }
                                    } else if (var90 == -1) {
                                        var87 = var12.method1570(0, class202.field3565.field229, (class65) null, -1, var89, -1, false);
                                        if (var87 == null && class22.field427) {
                                            class82.method614((byte) 80, var12);
                                        }
                                    } else {
                                        class65 var91 = class16.method101((byte) 121, var90);
                                        var87 = var12.method1570(var12.field4033, class202.field3565.field229, var91, var12.field4017, var89, var12.field4012, false);
                                        if (var87 == null && class22.field427) {
                                            class82.method614((byte) 77, var12);
                                        }
                                    }
                                    if (var87 != null) {
                                        int var98;
                                        if (var12.field3915 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var12.field3948 << 8) / var12.field3915;
                                        }
                                        int var99;
                                        if (var12.field4063 <= 0) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var12.field4037 << 8) / var12.field4063;
                                        }
                                        int var100 = (var12.field3957 * var99 >> 8) + var16 + (var12.field4037 / 2);
                                        int var101 = (var12.field4024 * var98 >> 8) + var12.field3948 / 2 + var14;
                                        class257.method1787(var100, var101);
                                        int var102 = class257.field4598[var12.field3987] * var12.field3881 >> 16;
                                        int var103 = class257.field4597[var12.field3987] * var12.field3881 >> 16;
                                        if (!var12.field4010) {
                                            var87.method271(0, var12.field3875, 0, var12.field3987, 0, var102, var103, -1L);
                                        } else if (var12.field3928) {
                                            ((class37) var87).method293(0, var12.field3875, var12.field3920, var12.field3987, var12.field3877, var12.field3977 + var88 + var102, var103 - -var12.field3977, var12.field3881);
                                        } else {
                                            var87.method271(0, var12.field3875, var12.field3920, var12.field3987, var12.field3877, var88 + var12.field3977 + var102, var12.field3977 + var103, -1L);
                                        }
                                        class257.method1783();
                                    }
                                } else {
                                    if (var12.field3988 == 7) {
                                        class226 var104 = var12.method1565(class249.field4512, -21419);
                                        if (var104 == null) {
                                            if (class22.field427) {
                                                class82.method614((byte) 41, var12);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var12.field4009; var106++) {
                                            for (int var107 = 0; var107 < var12.field3995; var107++) {
                                                if (var12.field3963[var105] > 0) {
                                                    class173 var108 = class117.method829(var12.field3963[var105] - 1, (byte) 97);
                                                    class207 var109;
                                                    if (var108.field3067 != 1 && var12.field3939[var105] == 1) {
                                                        var109 = class105.method757(false, new class207[] { class190.field3351, var108.field3057, class5.field75 });
                                                    } else {
                                                        var109 = class105.method757(false, new class207[] { class190.field3351, var108.field3057, class151.field2650, class65.method474(var12.field3939[var105], -78) });
                                                    }
                                                    int var110 = (var12.field3886 + 115) * var107 + var16;
                                                    int var111 = var14 + ((var12.field3905 + 12) * var106);
                                                    if (var12.field3965 == 0) {
                                                        var104.method1613(var109, var110, var111, var12.field3993, var12.field4001 ? 0 : -1);
                                                    } else if (var12.field3965 == 1) {
                                                        var104.method1600(var109, var110 + 57, var111, var12.field3993, var12.field4001 ? 0 : -1);
                                                    } else {
                                                        var104.method1594(var109, var110 + 114, var111, var12.field3993, var12.field4001 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var12.field3988 == 8 && class115.field1991 == var12 && class31.field622 == class153.field2660) {
                                        int var112 = 0;
                                        class226 var113 = class176.field3183;
                                        class207 var114 = var12.field3998;
                                        int var115 = 0;
                                        class207 var116 = class83.method624(var12, var114, 0);
                                        while (var116.method1450((byte) 13) > 0) {
                                            int var124 = var116.method1467(-1, class17.field264);
                                            class207 var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = class100.field1800;
                                            } else {
                                                var125 = var116.method1427(-17195, 0, var124);
                                                var116 = var116.method1464(-23886, var124 + 4);
                                            }
                                            int var126 = var113.method1608(var125);
                                            var112 += var113.field4124 + 1;
                                            if (var115 < var126) {
                                                var115 = var126;
                                            }
                                        }
                                        var115 += 6;
                                        var112 += 7;
                                        int var117 = var16 + var12.field4037 - (5 - -var115);
                                        int var118 = var12.field3948 + var14 + 5;
                                        if ((var118 + var112) > arg4) {
                                            var118 = arg4 - var112;
                                        }
                                        if (var16 + 5 > var117) {
                                            var117 = var16 + 5;
                                        }
                                        if (arg2 < var117 + var115) {
                                            var117 = arg2 - var115;
                                        }
                                        class23.method167(var117, var118, var115, var112, 16777120);
                                        class23.method166(var117, var118, var115, var112, 0);
                                        int var119 = var113.field4124 + var118 + 2;
                                        class207 var120 = var12.field3998;
                                        class207 var121 = class83.method624(var12, var120, 0);
                                        while (var121.method1450((byte) -127) > 0) {
                                            int var122 = var121.method1467(-1, class17.field264);
                                            class207 var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = class100.field1800;
                                            } else {
                                                var123 = var121.method1427(-17195, 0, var122);
                                                var121 = var121.method1464(-23886, var122 + 4);
                                            }
                                            var113.method1613(var123, var117 + 3, var119, 0, -1);
                                            var119 += var113.field4124 + 1;
                                        }
                                    }
                                    if (var12.field3988 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var12.field4062) {
                                            var130 = var16;
                                            var129 = var14;
                                            var128 = var12.field4037 + var16;
                                            var127 = var14 + var12.field3948;
                                        } else {
                                            var127 = var14;
                                            var128 = var16 + var12.field4037;
                                            var129 = var12.field3948 + var14;
                                            var130 = var16;
                                        }
                                        if (var12.field3940 == 1) {
                                            class23.method152(var130, var127, var128, var129, var12.field3993);
                                        } else {
                                            class23.method162(var130, var127, var128, var129, var12.field3993, var12.field3940);
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

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public final void method599(int arg0) {
        field1446++;
        int var2 = this.field1451;
        if (arg0 <= 45) {
            return;
        }
        if (this.field1457 != null) {
            class22 var3 = this.field1457.method141(false);
            if (var3 == null) {
                this.field1454 = 0;
                this.field1455 = 0;
                this.field1451 = -1;
                this.field1439 = null;
                this.field1436 = 0;
            } else {
                this.field1454 = var3.field378 * 128;
                this.field1455 = var3.field399;
                this.field1439 = var3.field430;
                this.field1436 = var3.field396;
                this.field1451 = var3.field369;
            }
        } else if (this.field1432 != null) {
            int var4 = class279.method1896((byte) -6, this.field1432);
            if (var2 != var4) {
                this.field1451 = var4;
                class72 var5 = this.field1432.field4581;
                if (var5.field1293 != null) {
                    var5 = var5.method517(-82);
                }
                if (var5 == null) {
                    this.field1454 = 0;
                } else {
                    this.field1454 = var5.field1304 * 128;
                }
            }
        } else if (this.field1448 != null) {
            this.field1451 = class275.method1871(-1, this.field1448);
            this.field1454 = this.field1448.field219 * 128;
        }
        if (this.field1451 != var2 && this.field1438 != null) {
            class65.field1177.method661(this.field1438);
            this.field1438 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field1443++;
        if (arg5 != -99) {
            field1453 = null;
        }
        class196 var10 = (class196) class250.field4527.method922((byte) 47);
        class196 var11 = null;
        while (var10 != null) {
            if (var10.field3447 == arg0 && var10.field3448 == arg4 && var10.field3451 == arg9 && var10.field3445 == arg2) {
                var11 = var10;
                break;
            }
            var10 = (class196) class250.field4527.method928(-98);
        }
        if (var11 == null) {
            var11 = new class196();
            var11.field3445 = arg2;
            var11.field3448 = arg4;
            var11.field3451 = arg9;
            var11.field3447 = arg0;
            class286.method1952(-24999, var11);
            class250.field4527.method931(var11, 115);
        }
        var11.field3439 = arg1;
        var11.field3438 = arg3;
        var11.field3450 = arg8;
        var11.field3456 = arg7;
        var11.field3442 = arg6;
    }
}
