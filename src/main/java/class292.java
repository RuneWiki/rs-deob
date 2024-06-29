import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class292 extends class154 {

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field5027 = 0;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Loh;")
    public static class258 field5025 = class153.method1046(" GMT", 90);

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field5028 = 0;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "B")
    public byte field5026;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Loh;")
    public class258 field5023;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Loh;")
    public class258 field5029;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 32)
    public static final void method2052(int arg0) {
        if (class249.field4303 > 1) {
            class249.field4303--;
            class65.field1140 = class182.field3259;
        }
        field5024++;
        if (class75.field1309 > 0) {
            class75.field1309--;
        }
        if (class36.field475) {
            class36.field475 = false;
            class190.method1285(arg0 - 21951);
            return;
        }
        for (int var1 = 0; var1 < 100 && class280.method1970((byte) -126); var1++) {
        }
        if (class280.field4818 != 30) {
            return;
        }
        class146.method1012(false, class159.field2710, 203);
        Object var2 = class155.field2661.field4841;
        synchronized (class155.field2661.field4841) {
            if (!class201.field3481) {
                class155.field2661.field4854 = 0;
            } else if (class123.field2184 != 0 || class155.field2661.field4854 >= 40) {
                class159.field2710.method885(45, -74);
                class130.field2289++;
                class159.field2710.method1598(0, 27052);
                int var3 = 0;
                int var4 = class159.field2710.field4051;
                for (int var5 = 0; class155.field2661.field4854 > var5 && (class159.field2710.field4051 - var4) < 240; var5++) {
                    int var6 = class155.field2661.field4856[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    var3++;
                    boolean var7 = false;
                    int var8 = class155.field2661.field4855[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class155.field2661.field4856[var5] == -1 && class155.field2661.field4855[var5] == -1) {
                        var8 = -1;
                        var6 = -1;
                        var7 = true;
                    }
                    if (class8.field108 != var8 || class310.field5252 != var6) {
                        int var9 = var8 - class8.field108;
                        int var10 = var6 - class310.field5252;
                        class8.field108 = var8;
                        class310.field5252 = var6;
                        if (class62.field1094 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class159.field2710.method1605((class62.field1094 << 12) + var10 + (var9 << 6), (byte) 74);
                            class62.field1094 = 0;
                        } else if (class62.field1094 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class159.field2710.method1598(class62.field1094 + 128, 27052);
                            var9 += 128;
                            class159.field2710.method1605((var9 << 8) + var10, (byte) 58);
                            class62.field1094 = 0;
                        } else if (class62.field1094 >= 32) {
                            class159.field2710.method1605(class62.field1094 + 57344, (byte) 88);
                            if (var7) {
                                class159.field2710.method1577(true, Integer.MIN_VALUE);
                            } else {
                                class159.field2710.method1577(true, var6 << 16 | var8);
                            }
                            class62.field1094 = 0;
                        } else {
                            class159.field2710.method1598(class62.field1094 + 192, 27052);
                            if (var7) {
                                class159.field2710.method1577(true, Integer.MIN_VALUE);
                            } else {
                                class159.field2710.method1577(true, var6 << 16 | var8);
                            }
                            class62.field1094 = 0;
                        }
                    } else if (class62.field1094 < 2047) {
                        class62.field1094++;
                    }
                }
                class159.field2710.method1618(14691, class159.field2710.field4051 - var4);
                if (var3 >= class155.field2661.field4854) {
                    class155.field2661.field4854 = 0;
                } else {
                    class155.field2661.field4854 -= var3;
                    for (int var11 = 0; var11 < class155.field2661.field4854; var11++) {
                        class155.field2661.field4855[var11] = class155.field2661.field4855[var11 + var3];
                        class155.field2661.field4856[var11] = class155.field2661.field4856[var3 + var11];
                    }
                }
            }
        }
        if (class123.field2184 != 0) {
            class240.field4180++;
            long var13 = (class8.field106 - class164.field2776) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class219.field3791;
            int var16 = class173.field3103;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class164.field2776 = class8.field106;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var17 = 0;
            if (class123.field2184 == 2) {
                var17 = 1;
            }
            int var18 = (int) var13;
            class159.field2710.method885(208, arg0 ^ 0x54);
            class159.field2710.method1580((byte) -84, var16 << 16 | var15);
            class159.field2710.method1612(var18 | var17 << 15, (byte) -127);
        }
        if (client.field610[96] || client.field610[97] || client.field610[98] || client.field610[99]) {
            class39.field551 = true;
        }
        if (class117.field2075 > 0) {
            class117.field2075--;
        }
        if (class39.field551 && class117.field2075 <= 0) {
            class16.field205++;
            class39.field551 = false;
            class117.field2075 = 20;
            class159.field2710.method885(235, -65);
            class159.field2710.method1619(8316, class68.field1177);
            class159.field2710.method1612(class101.field1815, (byte) -128);
        }
        if (class124.field2200 && !class314.field5330) {
            class314.field5330 = true;
            class159.field2710.method885(76, -106);
            class159.field2710.method1598(1, 27052);
            class259.field4497++;
        }
        if (!class124.field2200 && class314.field5330) {
            class259.field4497++;
            class314.field5330 = false;
            class159.field2710.method885(76, -117);
            class159.field2710.method1598(0, 27052);
        }
        if (!class210.field3625) {
            class159.field2710.method885(87, -71);
            class159.field2710.method1577(true, class86.method618((byte) 71));
            class121.field2151++;
            class210.field3625 = true;
        }
        class178.method1220(108);
        if (class280.field4818 != 30) {
            return;
        }
        class86.method619(-29436);
        class179.method1229((byte) -72);
        class36.field468++;
        if (class36.field468 > 750) {
            class190.method1285(-21956);
            return;
        }
        class31.method228((byte) 45);
        class80.method571((byte) 101);
        class78.method563(true);
        if (class280.field4814 != null) {
            class38.method282(15277);
        }
        for (int var19 = class124.method906(true, 0); var19 != -1; var19 = class124.method906(false, 0)) {
            class263.method1846(5, var19);
            class85.field1449[class2.method15(class134.field2319++, 31)] = var19;
        }
        for (class286 var20 = class241.method1646((byte) 14); var20 != null; var20 = class241.method1646((byte) 14)) {
            int var21 = var20.method2011(-571826873);
            int var22 = var20.method2015(false);
            if (var21 == 1) {
                class153.field2630[var22] = var20.field4932;
                class114.field2036[class2.method15(31, class91.field1611++)] = var22;
            } else if (var21 == 2) {
                class101.field1812[var22] = var20.field4928;
                class311.field5276[class2.method15(class115.field2054++, 31)] = var22;
            } else if (var21 == 3) {
                class171 var23 = class263.method1844(var22, (byte) -70);
                if (!var20.field4928.method1821(-1, var23.field2946)) {
                    var23.field2946 = var20.field4928;
                    class165.method1099((byte) 127, var23);
                }
            } else if (var21 == 4) {
                class171 var40 = class263.method1844(var22, (byte) -70);
                int var41 = var20.field4932;
                int var42 = var20.field4926;
                if (var40.field2940 != var41 || var40.field3059 != var42) {
                    var40.field2940 = var41;
                    var40.field3059 = var42;
                    class165.method1099((byte) 127, var40);
                }
            } else if (var21 == 5) {
                class171 var39 = class263.method1844(var22, (byte) -70);
                if (var20.field4932 != var39.field3077 || var20.field4932 == -1) {
                    var39.field2965 = 0;
                    var39.field2950 = 0;
                    var39.field3077 = var20.field4932;
                    class165.method1099((byte) 127, var39);
                }
            } else if (var21 == 6) {
                int var33 = var20.field4932;
                int var34 = var33 >> 5 & 0x1F;
                int var35 = (var33 & 0x7CCE) >> 10;
                int var36 = var33 & 0x1F;
                int var37 = (var35 << 19) + (var34 << 11) + (var36 << 3);
                class171 var38 = class263.method1844(var22, (byte) -70);
                if (var38.field3037 != var37) {
                    var38.field3037 = var37;
                    class165.method1099((byte) 125, var38);
                }
            } else if (var21 == 7) {
                class171 var24 = class263.method1844(var22, (byte) -70);
                boolean var25 = var20.field4932 == 1;
                if (var24.field3043 != var25) {
                    var24.field3043 = var25;
                    class165.method1099((byte) 127, var24);
                }
            } else if (var21 == 8) {
                class171 var26 = class263.method1844(var22, (byte) -70);
                if (var20.field4932 != var26.field2954 || var20.field4926 != var26.field2944 || var20.field4936 != var26.field2974) {
                    var26.field2974 = var20.field4936;
                    var26.field2944 = var20.field4926;
                    if (var26.field3014 != -1) {
                        if (var26.field3033 > 0) {
                            var26.field2974 = var26.field2974 * 32 / var26.field3033;
                        } else if (var26.field3067 > 0) {
                            var26.field2974 = var26.field2974 * 32 / var26.field3067;
                        }
                    }
                    var26.field2954 = var20.field4932;
                    class165.method1099((byte) 127, var26);
                }
            } else if (var21 == 9) {
                class171 var27 = class263.method1844(var22, (byte) -70);
                if (var20.field4932 != var27.field3014 || var20.field4926 != var27.field2933) {
                    var27.field3014 = var20.field4932;
                    var27.field2933 = var20.field4926;
                    class165.method1099((byte) 126, var27);
                }
            } else if (var21 == 10) {
                class171 var32 = class263.method1844(var22, (byte) -70);
                if (var20.field4932 != var32.field3011 || var20.field4926 != var32.field2993 || var20.field4936 != var32.field2931) {
                    var32.field2993 = var20.field4926;
                    var32.field2931 = var20.field4936;
                    var32.field3011 = var20.field4932;
                    class165.method1099((byte) 127, var32);
                }
            } else if (var21 == 11) {
                class171 var28 = class263.method1844(var22, (byte) -70);
                var28.field2912 = var28.field3007 = var20.field4926;
                var28.field3013 = 0;
                var28.field3020 = var28.field2938 = var20.field4932;
                var28.field3069 = 0;
                class165.method1099((byte) 126, var28);
            } else if (var21 == 12) {
                class171 var29 = class263.method1844(var22, (byte) -70);
                int var30 = var20.field4932;
                if (var29 != null && var29.field2936 == 0) {
                    if (var29.field3036 - var29.field3054 < var30) {
                        var30 = var29.field3036 - var29.field3054;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field2966 != var30) {
                        var29.field2966 = var30;
                        class165.method1099((byte) 125, var29);
                    }
                }
            } else if (var21 == 13) {
                class171 var31 = class263.method1844(var22, (byte) -70);
                var31.field2926 = var20.field4932;
            }
        }
        class251.field4329++;
        if (class169.field2883 != 0) {
            class180.field3219 += 20;
            if (class180.field3219 >= 400) {
                class169.field2883 = 0;
            }
        }
        if (class303.field5173 != null) {
            class201.field3483++;
            if (class201.field3483 >= 15) {
                class165.method1099((byte) 125, class303.field5173);
                class303.field5173 = null;
            }
        }
        if (class123.field2183 != null) {
            class165.method1099((byte) 125, class123.field2183);
            class215.field3736++;
            if (class194.field3423 > (class197.field3451 + 5) || class194.field3423 < class197.field3451 - 5 || class206.field3560 + 5 < class226.field3882 || (class206.field3560 - 5) > class226.field3882) {
                class272.field4737 = true;
            }
            if (class64.field1119 == 0) {
                if (class272.field4737 && class215.field3736 >= 5) {
                    if (class224.field3843 == class123.field2183 && class144.field2407 != class14.field184) {
                        class165.field2789++;
                        byte var43 = 0;
                        class171 var44 = class123.field2183;
                        if (class258.field4453 == 1 && var44.field2924 == 206) {
                            var43 = 1;
                        }
                        if (var44.field3042[class144.field2407] <= 0) {
                            var43 = 0;
                        }
                        if (class146.method1011(115, client.method354(var44))) {
                            int var47 = class14.field184;
                            int var48 = class144.field2407;
                            var44.field3042[var48] = var44.field3042[var47];
                            var44.field2977[var48] = var44.field2977[var47];
                            var44.field3042[var47] = -1;
                            var44.field2977[var47] = 0;
                        } else if (var43 == 1) {
                            int var45 = class144.field2407;
                            int var46 = class14.field184;
                            while (var45 != var46) {
                                if (var45 < var46) {
                                    var44.method1149(var46, var46 - 1, arg0 + 133);
                                    var46--;
                                } else if (var46 < var45) {
                                    var44.method1149(var46, var46 + 1, 128);
                                    var46++;
                                }
                            }
                        } else {
                            var44.method1149(class14.field184, class144.field2407, arg0 + 133);
                        }
                        class159.field2710.method885(211, -101);
                        class159.field2710.method1592(false, class144.field2407);
                        class159.field2710.method1580((byte) -76, class123.field2183.field3061);
                        class159.field2710.method1605(class14.field184, (byte) 125);
                        class159.field2710.method1598(var43, 27052);
                    }
                } else if ((class122.field2159 == 1 || class164.method1097(class69.field1195 - 1, -100)) && class69.field1195 > 2) {
                    class11.method74(0);
                } else if (class69.field1195 > 0) {
                    class251.method1699(9361);
                }
                class123.field2184 = 0;
                class123.field2183 = null;
                class201.field3483 = 10;
            }
        }
        class103.field1881 = false;
        class154.field2647 = null;
        class171 var49 = class49.field737;
        class49.field737 = null;
        class233.field4037 = 0;
        class168.field2854 = false;
        class171 var50 = class268.field4671;
        class268.field4671 = null;
        while (class201.method1332(22315) && class233.field4037 < 128) {
            class127.field2258[class233.field4037] = class88.field1506;
            class50.field774[class233.field4037] = class231.field3989;
            class233.field4037++;
        }
        class280.field4814 = null;
        class48.field726 = null;
        if (class170.field2901 != -1) {
            class224.method1510(class170.field2901, 0, arg0 + 77, 0, class218.field3773, 0, 0, class42.field577);
        }
        class182.field3259++;
        if (class48.field726 != null) {
            class265.method1857(class48.field726, class302.field5164, class50.field752, (byte) -43);
            class48.field726 = null;
        }
        while (true) {
            class42 var51;
            class171 var52;
            class171 var53;
            do {
                var51 = (class42) class238.field4157.method88(true);
                if (var51 == null) {
                    while (true) {
                        class42 var54;
                        class171 var55;
                        class171 var56;
                        do {
                            var54 = (class42) class217.field3744.method88(true);
                            if (var54 == null) {
                                while (true) {
                                    class42 var57;
                                    class171 var58;
                                    class171 var59;
                                    do {
                                        var57 = (class42) class87.field1484.method88(true);
                                        if (var57 == null) {
                                            if (class224.field3836 && class280.field4814 == null) {
                                                class224.field3836 = false;
                                            }
                                            if (class206.field3558 != null) {
                                                class284.method1994((byte) -105);
                                            }
                                            if (class70.field1212 > 0 && client.field610[82] && client.field610[81] && client.field606 != 0) {
                                                int var60 = class272.field4704 - client.field606;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class291.method2047(var60, class152.field2606.field975[0] + class229.field3955, -652159092, class152.field2606.field959[0] + class311.field5271);
                                            }
                                            if (class188.field3326 != -1) {
                                                int var61 = class20.field237;
                                                int var62 = class188.field3326;
                                                if (class70.field1212 > 0 && client.field610[82] && client.field610[81]) {
                                                    class291.method2047(class272.field4704, class229.field3955 + var62, arg0 + -652159087, class311.field5271 + var61);
                                                } else if (class286.field4927) {
                                                    class159.field2710.method885(95, -82);
                                                    class55.field869++;
                                                    class159.field2710.method1587(1396520520, class23.field286);
                                                    class159.field2710.method1612(class311.field5271 + var61, (byte) -127);
                                                    class159.field2710.method1592(false, class247.field4280);
                                                    class159.field2710.method1605(class229.field3955 + var62, (byte) 124);
                                                    class169.field2883 = 1;
                                                    class260.field4524 = class219.field3791;
                                                    class180.field3219 = 0;
                                                    class52.field837 = class173.field3103;
                                                } else {
                                                    boolean var63 = class208.method1373(0, class152.field2606.field959[0], true, 0, 0, 0, var62, (byte) -80, var61, 0, 0, class152.field2606.field975[0]);
                                                    if (var63) {
                                                        class169.field2883 = 1;
                                                        class180.field3219 = 0;
                                                        class260.field4524 = class219.field3791;
                                                        class52.field837 = class173.field3103;
                                                    }
                                                }
                                                class188.field3326 = -1;
                                                class286.field4927 = false;
                                            }
                                            class138.method957(arg0 ^ 0xFFFFCB3E);
                                            if (class49.field737 != var49) {
                                                if (var49 != null) {
                                                    class165.method1099((byte) 127, var49);
                                                }
                                                if (class49.field737 != null) {
                                                    class165.method1099((byte) 126, class49.field737);
                                                }
                                            }
                                            if (class268.field4671 != var50 && class58.field953 == class233.field4040) {
                                                if (var50 != null) {
                                                    class165.method1099((byte) 127, var50);
                                                }
                                                if (class268.field4671 != null) {
                                                    class165.method1099((byte) 127, class268.field4671);
                                                }
                                            }
                                            if (class268.field4671 == null) {
                                                if (class233.field4040 > 0) {
                                                    class233.field4040--;
                                                }
                                            } else if (class233.field4040 < class58.field953) {
                                                class233.field4040++;
                                                if (class58.field953 == class233.field4040) {
                                                    class165.method1099((byte) 126, class268.field4671);
                                                }
                                            }
                                            if (class109.field1926 == 1) {
                                                class68.method513((byte) -95);
                                            } else if (class109.field1926 == 2) {
                                                class123.method901(true);
                                            } else {
                                                class285.method1997(true);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class280.field4813[var64]++;
                                            }
                                            int var65 = class265.method1854((byte) -102);
                                            int var66 = class311.method2160((byte) 117);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class314.field5332++;
                                                class75.field1309 = 250;
                                                class283.method1983((byte) 113, 4000);
                                                class159.field2710.method885(84, arg0 - 68);
                                            }
                                            if (class229.field3953 != null && class229.field3953.field2067 == 1) {
                                                if (class229.field3953.field2063 != null) {
                                                    class252.method1705(false, class85.field1432, class99.field1757);
                                                }
                                                class229.field3953 = null;
                                                class85.field1432 = null;
                                                class99.field1757 = false;
                                            }
                                            class3.field44++;
                                            class148.field2509++;
                                            if (arg0 != -5) {
                                                field5025 = (class258) null;
                                            }
                                            class74.field1291++;
                                            if (class74.field1291 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class74.field1291 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class119.field2101 += class14.field176;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class115.field2051 += class140.field2383;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class122.field2154 += class73.field1286;
                                                }
                                            }
                                            if (class122.field2154 < -40) {
                                                class73.field1286 = 1;
                                            }
                                            if (class3.field44 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class271.field4702 += class120.field2120;
                                                }
                                                class3.field44 = 0;
                                                if ((var68 & 0x2) == 2) {
                                                    class239.field4169 += class218.field3759;
                                                }
                                            }
                                            if (class122.field2154 > 40) {
                                                class73.field1286 = -1;
                                            }
                                            if (class115.field2051 < -55) {
                                                class140.field2383 = 2;
                                            }
                                            if (class239.field4169 < -20) {
                                                class218.field3759 = 1;
                                            }
                                            if (class119.field2101 < -50) {
                                                class14.field176 = 2;
                                            }
                                            if (class119.field2101 > 50) {
                                                class14.field176 = -2;
                                            }
                                            if (class239.field4169 > 10) {
                                                class218.field3759 = -1;
                                            }
                                            if (class271.field4702 < -60) {
                                                class120.field2120 = 2;
                                            }
                                            if (class271.field4702 > 60) {
                                                class120.field2120 = -2;
                                            }
                                            if (class115.field2051 > 55) {
                                                class140.field2383 = -2;
                                            }
                                            if (class148.field2509 > 50) {
                                                class159.field2710.method885(115, -67);
                                                class138.field2356++;
                                            }
                                            if (class121.field2125) {
                                                class114.method828(192);
                                                class121.field2125 = false;
                                            }
                                            try {
                                                if (class73.field1289 != null && class159.field2710.field4051 > 0) {
                                                    class73.field1289.method1123(4900, 0, class159.field2710.field4051, class159.field2710.field4066);
                                                    class148.field2509 = 0;
                                                    class159.field2710.field4051 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class190.method1285(-21956);
                                            }
                                            return;
                                        }
                                        var58 = var57.field598;
                                        if (var58.field2930 < 0) {
                                            break;
                                        }
                                        var59 = class263.method1844(var58.field2923, (byte) -70);
                                    } while (var59 == null || var59.field2982 == null || var58.field2930 >= var59.field2982.length || var59.field2982[var58.field2930] != var58);
                                    class193.method1303(200000, var57);
                                }
                            }
                            var55 = var54.field598;
                            if (var55.field2930 < 0) {
                                break;
                            }
                            var56 = class263.method1844(var55.field2923, (byte) -70);
                        } while (var56 == null || var56.field2982 == null || var56.field2982.length <= var55.field2930 || var56.field2982[var55.field2930] != var55);
                        class193.method1303(200000, var54);
                    }
                }
                var52 = var51.field598;
                if (var52.field2930 < 0) {
                    break;
                }
                var53 = class263.method1844(var52.field2923, (byte) -70);
            } while (var53 == null || var53.field2982 == null || var53.field2982.length <= var52.field2930 || var53.field2982[var52.field2930] != var52);
            class193.method1303(200000, var51);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 1023)
    public static void method2053(int arg0) {
        int var1 = 105 / ((-arg0 - 4) / 60);
        field5025 = null;
    }
}
