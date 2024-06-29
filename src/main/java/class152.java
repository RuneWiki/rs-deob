import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class152 extends class18 {

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Z")
    public volatile boolean field2377 = true;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2380 = "flash2:";

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field2385 = -1;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "[I")
    public static int[] field2386 = new int[200];

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "[I")
    public static int[] field2382 = new int[100];

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
    public static int[] field2391 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "Z")
    public boolean field2381;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Z")
    public boolean field2387;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "[Z")
    public static boolean[] field2378;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)I")
    public static final int method1019(int arg0) {
        field2388++;
        if (arg0 == 0) {
            return class244.field3975 && class106.field1764[81] && class128.field2018 > 2 ? class268.field4273[class128.field2018 - 2] : class268.field4273[class128.field2018 - 1];
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        field2382 = null;
        field2380 = null;
        field2391 = null;
        field2386 = null;
        if (arg0 >= -50) {
            method1028(-11, false, true, (byte) 19);
        }
        field2378 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILai;)V")
    public static final void method1021(int arg0, class88 arg1) {
        field2390++;
        if (arg1.field1471.length - arg1.field1535 < 1) {
            return;
        }
        int var2 = arg1.method633(80);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field1471.length - arg1.field1535 < var3) {
            return;
        }
        class50.field740 = arg1.method633(72);
        if (class50.field740 < 1) {
            class50.field740 = 1;
        } else if (class50.field740 > 4) {
            class50.field740 = 4;
        }
        class133.method922(arg1.method633(57) == 1, 3);
        class132.field2070 = arg1.method633(58) == 1;
        class132.field2072 = arg1.method633(63) == 1;
        class210.field3264 = arg1.method633(99) == 1;
        class77.field1260 = arg1.method633(51) == 1;
        class147.field2331 = arg1.method633(117) == 1;
        class170.field2648 = arg1.method633(65) == 1;
        class19.field291 = arg1.method633(76) == 1;
        class190.field2948 = arg1.method633(87);
        if (class190.field2948 > 2) {
            class190.field2948 = 2;
        }
        if (var2 >= 2) {
            class197.field3116 = arg1.method633(117) == 1;
        } else {
            class197.field3116 = arg1.method633(74) == 1;
            arg1.method633(99);
        }
        class293.field4622 = arg1.method633(111) == 1;
        class179.field2790 = arg1.method633(127) == 1;
        class158.field2461 = arg1.method633(93);
        if (class158.field2461 > 2) {
            class158.field2461 = 2;
        }
        class180.field2815 = class158.field2461;
        class155.field2407 = arg1.method633(52) == 1;
        class18.field272 = arg1.method633(96);
        if (class18.field272 > 127) {
            class18.field272 = 127;
        }
        int var4 = 115 / ((arg0 - 48) / 42);
        class294.field4633 = arg1.method633(93);
        class86.field1445 = arg1.method633(73);
        if (class86.field1445 > 127) {
            class86.field1445 = 127;
        }
        if (var2 >= 1) {
            class135.field2101 = arg1.method645(11596);
            class86.field1456 = arg1.method645(11596);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method633(120);
        }
        if (var2 >= 4) {
            int var5 = arg1.method633(51);
            if (class50.field741 < 96) {
                var5 = 0;
            }
            class67.method493(var5);
        }
        if (var2 >= 5) {
            class112.field1839 = arg1.method641(-1);
        }
        if (var2 >= 6) {
            class181.field2829 = arg1.method633(113);
        }
        if (var2 >= 7) {
            class82.field1385 = arg1.method633(115) == 1;
        }
        if (var2 >= 8) {
            class109.field1782 = arg1.method633(75) == 1;
        }
        if (var2 >= 9) {
            class106.field1754 = arg1.method633(116);
        }
        if (var2 >= 10) {
            class105.field1751 = arg1.method633(105) != 0;
        }
        if (var2 >= 11) {
            class10.field171 = arg1.method633(69) != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lnj;B)V")
    public static final void method1022(class144 arg0, byte arg1) {
        if (arg1 != 124) {
            method1028(-103, false, false, (byte) -86);
        }
        field2375++;
        class283 var2 = arg0.method972((byte) -71);
        arg0.field2250 = var2.field4496;
        if (arg0.field2263 == 0) {
            arg0.field2267 = 0;
            return;
        }
        if (arg0.field2214 != -1 && arg0.field2239 == 0) {
            class30 var3 = class148.method996(-96, arg0.field2214);
            if (arg0.field2281 > 0 && var3.field448 == 0) {
                arg0.field2267++;
                return;
            }
            if (arg0.field2281 <= 0 && var3.field438 == 0) {
                arg0.field2267++;
                return;
            }
        }
        if (arg0.field2299 != -1 && class192.field2978 >= arg0.field2236) {
            class238 var4 = class16.method158(arg0.field2299, true);
            if (var4.field3866 && var4.field3852 != -1) {
                class30 var5 = class148.method996(-96, var4.field3852);
                if (arg0.field2281 > 0 && var5.field448 == 0) {
                    arg0.field2267++;
                    return;
                }
                if (arg0.field2281 <= 0 && var5.field438 == 0) {
                    arg0.field2267++;
                    return;
                }
            }
        }
        int var6 = arg0.field2278;
        int var7 = arg0.field2240;
        int var8 = arg0.field2268[arg0.field2263 - 1] * 128 + arg0.method971(arg1 ^ 0xFF83) * 64;
        int var9 = arg0.field2271[arg0.field2263 - 1] * 128 + arg0.method971(65535) * 64;
        if (var8 - var7 > 256 || var8 - var7 < -256 || var9 - var6 > 256 || (var9 - var6) < -256) {
            arg0.field2240 = var8;
            arg0.field2278 = var9;
            return;
        }
        if (var8 <= var7) {
            if (var8 < var7) {
                if (var9 > var6) {
                    arg0.field2257 = 768;
                } else if (var6 <= var9) {
                    arg0.field2257 = 512;
                } else {
                    arg0.field2257 = 256;
                }
            } else if (var9 > var6) {
                arg0.field2257 = 1024;
            } else if (var9 < var6) {
                arg0.field2257 = 0;
            }
        } else if (var6 < var9) {
            arg0.field2257 = 1280;
        } else if (var6 <= var9) {
            arg0.field2257 = 1536;
        } else {
            arg0.field2257 = 1792;
        }
        int var10 = arg0.field2257 - arg0.field2275 & 0x7FF;
        int var11 = 4;
        int var12 = var2.field4498;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var12 = var2.field4477;
        } else if (var10 >= 256 && var10 < 768) {
            var12 = var2.field4472;
        } else if (var10 >= -768 && var10 <= -256) {
            var12 = var2.field4484;
        }
        if (var12 == -1) {
            var12 = var2.field4477;
        }
        byte var13 = 1;
        boolean var14 = true;
        arg0.field2250 = var12;
        if (arg0 instanceof class45) {
            var14 = ((class45) arg0).field645.field986;
        }
        if (var14) {
            if (arg0.field2275 != arg0.field2257 && arg0.field2223 == -1 && arg0.field2260 != 0) {
                var11 = 2;
            }
            if (arg0.field2263 > 2) {
                var11 = 6;
            }
            if (arg0.field2263 > 3) {
                var11 = 8;
            }
            if (arg0.field2267 > 0 && arg0.field2263 > 1) {
                var11 = 8;
                arg0.field2267--;
            }
        } else {
            if (arg0.field2263 > 1) {
                var11 = 6;
            }
            if (arg0.field2263 > 2) {
                var11 = 8;
            }
            if (arg0.field2267 > 0 && arg0.field2263 > 1) {
                var11 = 8;
                arg0.field2267--;
            }
        }
        if (arg0.field2256[arg0.field2263 - 1] == 2) {
            var11 <<= 0x1;
            var13 = 2;
        } else if (arg0.field2256[arg0.field2263 - 1] == 0) {
            var13 = 0;
            var11 >>= 0x1;
        }
        if (var11 < 8 || var2.field4468 == -1) {
            if (var2.field4494 != -1 && var13 == 0) {
                if (arg0.field2250 == var2.field4498 && var2.field4454 != -1) {
                    arg0.field2250 = var2.field4454;
                } else if (arg0.field2250 == var2.field4484 && var2.field4483 != -1) {
                    arg0.field2250 = var2.field4483;
                } else if (arg0.field2250 == var2.field4472 && var2.field4466 != -1) {
                    arg0.field2250 = var2.field4466;
                } else {
                    arg0.field2250 = var2.field4494;
                }
            }
        } else if (arg0.field2250 == var2.field4498 && var2.field4497 != -1) {
            arg0.field2250 = var2.field4497;
        } else if (arg0.field2250 == var2.field4484 && var2.field4495 != -1) {
            arg0.field2250 = var2.field4495;
        } else if (arg0.field2250 == var2.field4472 && var2.field4485 != -1) {
            arg0.field2250 = var2.field4485;
        } else {
            arg0.field2250 = var2.field4468;
        }
        if (var2.field4458 != -1) {
            int var15 = var11 << 7;
            if (arg0.field2263 == 1) {
                int var16 = arg0.field2242 * arg0.field2242;
                int var17 = (arg0.field2240 > var8 ? arg0.field2240 - var8 : -arg0.field2240 + var8) << 7;
                int var18 = (var9 >= arg0.field2278 ? var9 - arg0.field2278 : -var9 + arg0.field2278) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var2.field4458 * var19 * 2;
                if (var16 > var20) {
                    arg0.field2242 /= 2;
                } else if (var19 < (var16 / 2)) {
                    arg0.field2242 -= var2.field4458;
                    if (arg0.field2242 < 0) {
                        arg0.field2242 = 0;
                    }
                } else if (arg0.field2242 < var15) {
                    arg0.field2242 += var2.field4458;
                    if (var15 < arg0.field2242) {
                        arg0.field2242 = var15;
                    }
                }
            } else if (var15 > arg0.field2242) {
                arg0.field2242 += var2.field4458;
                if (arg0.field2242 > var15) {
                    arg0.field2242 = var15;
                }
            } else if (arg0.field2242 > 0) {
                arg0.field2242 -= var2.field4458;
                if (arg0.field2242 < 0) {
                    arg0.field2242 = 0;
                }
            }
            var11 = arg0.field2242 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var6 < var9) {
            arg0.field2278 += var11;
            if (arg0.field2278 > var9) {
                arg0.field2278 = var9;
            }
        } else if (var9 < var6) {
            arg0.field2278 -= var11;
            if (arg0.field2278 < var9) {
                arg0.field2278 = var9;
            }
        }
        if (var8 > var7) {
            arg0.field2240 += var11;
            if (var8 < arg0.field2240) {
                arg0.field2240 = var8;
            }
        } else if (var7 > var8) {
            arg0.field2240 -= var11;
            if (arg0.field2240 < var8) {
                arg0.field2240 = var8;
            }
        }
        if (arg0.field2240 != var8 || arg0.field2278 != var9) {
            return;
        }
        if (arg0.field2281 > 0) {
            arg0.field2281--;
        }
        arg0.field2263--;
        return;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    public static final void method1023(int arg0) {
        class20.field299 = 0L;
        class47.field662 = 0;
        class180.field2808.field1592 = 0;
        class84.field1423 = true;
        field2379++;
        class287.field4537 = true;
        class66.method490((byte) -24);
        class28.field383 = 0;
        class66.field1105 = -1;
        client.field2435.field1535 = 0;
        class5.field77 = 0;
        class160.field2490 = 0;
        class130.field2049 = 0;
        class286.field4517 = 0;
        class208.field3234 = 0;
        class296.field4683 = 0;
        class173.field2725 = 0;
        class4.field40 = 0;
        class265.field4220 = 0;
        class244.field3968 = 0;
        class271.field4350 = 0;
        class122.field1955 = 0;
        class196.field3100 = 0;
        class29.field401 = 0;
        class136.field2105 = 0;
        class235.field3778 = 0;
        class102.field1708 = 0;
        class154.field2404 = 0;
        class203.field3171 = 0;
        class45.field638 = 0;
        class49.field703 = 0;
        class240.field3906 = 0;
        class47.field671 = 0;
        class265.field4237 = 0;
        class133.field2084 = 0;
        class244.field3969 = 0;
        class280.field4428 = 0;
        class240.field3902 = 0;
        class31.field467 = 0;
        class55.field899 = 0;
        class75.field1235 = 0;
        class228.field3634 = 0;
        class236.field3823 = 0;
        class97.field1630 = 0;
        class159.field2471 = 0;
        class271.field4351 = 0;
        class148.field2342 = 0;
        class293.field4617 = 0;
        class17.field257 = 0;
        class100.field1674 = 0;
        class275.field4380 = 0;
        class88.field1529 = 0;
        class144.field2249 = 0;
        class231.field3666 = 0;
        class5.field89 = 0;
        class197.field3111 = 0;
        class235.field3781 = 0;
        class253.field4050 = 0;
        class39.field544 = 0;
        class231.field3667 = 0;
        class212.field3284 = 0;
        client.field2434 = 0;
        class126.field1990 = 0;
        class296.field4681 = 0;
        class106.field1762 = 0;
        class19.field283 = 0;
        class280.field4426 = 0;
        class125.field1970 = 0;
        class272.field4365 = 0;
        class238.field3873 = 0;
        class260.field4156 = 0;
        class183.field2841 = 0;
        class240.field3890 = 0;
        class72.field1164 = 0;
        class182.field2834 = 0;
        class151.field2371 = 0;
        class241.field3913 = 0;
        class19.field279 = 0;
        class235.field3759 = 0;
        class79.field1329 = 0;
        class193.field2987 = 0;
        class133.field2090 = 0;
        class219.field3374 = 0;
        class66.field1109 = 0;
        class200.field3143 = 0;
        class28.field388 = 0;
        field2389 = 0;
        class30.field431 = 0;
        class88.field1474 = 0;
        class292.field4599 = 0;
        class217.field3360 = 0;
        class239.field3882 = 0;
        class278.field4407 = 0;
        class187.field2901 = 0;
        class83.field1394 = 0;
        class173.field2730 = 0;
        class31.field458 = 0;
        class266.field4248 = 0;
        class167.field2611 = 0;
        class27.field369 = 0;
        class77.field1270 = 0;
        class228.field3533 = 0;
        class95.field1612 = 0;
        class88.field1493 = 0;
        class57.field938 = 0;
        class93.field1585 = 0;
        class286.field4522 = 0;
        class271.field4343 = 0;
        class229.field3646 = 0;
        class88.field1517 = 0;
        class180.field2799 = 0;
        class269.field4296 = 0;
        class103.field1727 = 0;
        class5.field72 = 0;
        class38.field540 = 0;
        class269.field4310 = 0;
        class237.field3843 = 0;
        class160.field2496 = 0;
        class185.field2855 = 0;
        class206.field3229 = 0;
        class206.field3228 = 0;
        class160.field2479 = 0;
        class214.field3323 = 0;
        class212.field3287 = 0;
        class173.field2720 = 0;
        class109.field1785 = 0;
        if (arg0 != -21988) {
            field2385 = -71;
        }
        class39.field560 = 0;
        class66.field1108 = 0;
        class5.field85 = 0;
        class200.field3142 = 0;
        class248.field4017 = 0;
        class201.field3144 = 0;
        class189.field2931 = 0;
        class187.field2894 = 0;
        class88.field1519 = 0;
        class206.field3225 = 0;
        class258.field4120 = 0;
        class2.field8 = 0;
        class194.field3074 = 0;
        class237.field3837 = 0;
        class280.field4423 = 0;
        class286.field4528 = 0;
        class5.field61 = 0;
        class179.field2793 = 0;
        class5.field93 = 0;
        class187.field2888 = 0;
        class47.field668 = 0;
        class255.field4083 = 0;
        class171.field2672 = 0;
        class235.field3783 = 0;
        class115.field1865 = 0;
        class212.field3302 = 0;
        class277.field4400 = 0;
        class20.field298 = 0;
        class88.field1490 = 0;
        class81.field1347 = 0;
        class88.field1481 = 0;
        class248.field4012 = 0;
        class202.field3157 = 0;
        class265.field4228 = 0;
        class268.field4280 = 0;
        class297.field4699 = 0;
        class292.field4602 = 0;
        class171.field2671 = 0;
        class44.field628 = 0;
        class199.field3130 = 0;
        class265.field4232 = 0;
        class140.field2142 = 0;
        class1.field2 = 0;
        class265.field4243 = 0;
        class191.field2955 = 0;
        class34.field513 = 0;
        class212.field3301 = 0;
        class235.field3760 = 0;
        class72.field1154 = 0;
        class75.field1242 = 0;
        class45.field646 = 0;
        class48.field697 = 0;
        class295.field4667 = 0;
        class30.field447 = 0;
        class71.field1135 = 0;
        class259.field4151 = 0;
        class78.field1294 = 0;
        class164.field2578 = 0;
        class87.field1470 = 0;
        class26.field352 = 0;
        class49.field704 = 0;
        class157.field2451 = 0;
        class139.field2120 = 0;
        class3.field20 = 0;
        class86.field1439 = 0;
        class297.field4691 = 0;
        class93.field1587 = 0;
        class126.field1989 = 0;
        class30.field425 = 0;
        class60.field1037 = 0;
        class84.field1419 = 0;
        class89.field1543 = 0;
        class261.field4168 = 0;
        class160.field2478 = 0;
        class295.field4658 = 0;
        class78.field1288 = 0;
        class180.field2807 = 0;
        class161.field2514 = 0;
        class236.field3807 = 0;
        class265.field4230 = 0;
        class171.field2658 = 0;
        class253.field4051 = 0;
        class90.field1575 = 0;
        class52.field772 = 0;
        class158.field2463 = 0;
        class97.field1631 = 0;
        class128.field2012 = 0;
        class88.field1499 = 0;
        class86.field1450 = 0;
        class174.field2749 = 0;
        class254.field4071 = 0;
        class130.field2044 = 0;
        class49.field717 = 0;
        class86.field1443 = 0;
        class25.field330 = 0;
        class212.field3300 = 0;
        class111.field1812 = 0;
        class48.field691 = 0;
        class133.field2091 = 0;
        class193.field2995 = 0;
        class88.field1522 = 0;
        class61.field1047 = 0;
        class106.field1763 = 0;
        class204.field3184 = 0;
        class88.field1498 = 0;
        class256.field4093 = 0;
        class217.field3354 = 0;
        class144.field2237 = 0;
        class243.field3952 = 0;
        class160.field2487 = 0;
        class28.field380 = 0;
        class16.field243 = 0;
        class47.field663 = 0;
        class27.field366 = 0;
        class181.field2820 = 0;
        class202.field3162 = 0;
        class80.field1341 = 0;
        class231.field3672 = 0;
        class235.field3765 = 0;
        class208.field3238 = 0;
        class103.field1719 = 0;
        class187.field2889 = 0;
        class185.field2851 = 0;
        class269.field4297 = 0;
        class185.field2860 = 0;
        class212.field3303 = 0;
        class5.field65 = 0;
        class167.field2609 = 0;
        class295.field4646 = 0;
        class127.field2001 = 0;
        class241.field3915 = 0;
        class36.field517 = 0;
        class232.field3698 = 0;
        class167.field2614 = 0;
        class164.field2582 = 0;
        class49.field706 = 0;
        class140.field2134 = 0;
        class281.field4439 = 0;
        class228.field3484 = 0;
        class143.field2191 = 0;
        class62.field1058 = 0;
        class88.field1516 = 0;
        class148.field2340 = 0;
        class88.field1523 = 0;
        client.field2433 = 0;
        class128.field2017 = 0;
        class77.field1259 = 0;
        class52.field774 = 0;
        class126.field1987 = 0;
        class146.field2325 = 0;
        class75.field1243 = 0;
        class144.field2215 = 0;
        class180.field2810 = 0;
        class57.field943 = 0;
        class217.field3356 = 0;
        class187.field2884 = 0;
        class271.field4361 = 0;
        class3.field19 = 0;
        class265.field4235 = 0;
        class87.field1459 = 0;
        class88.field1534 = 0;
        class58.field955 = 0;
        class148.field2343 = 0;
        class268.field4277 = 0;
        class88.field1482 = 0;
        class26.field348 = 0;
        class49.field710 = 0;
        class144.field2259 = 0;
        class232.field3703 = 0;
        class160.field2495 = 0;
        class165.field2590 = 0;
        class100.field1676 = 0;
        class160.field2484 = 0;
        class160.field2501 = 0;
        class108.field1777 = 0;
        class48.field695 = 0;
        class291.field4589 = 0;
        class1.field4 = 0;
        class235.field3780 = 0;
        class45.field636 = 0;
        class144.field2297 = 0;
        class57.field941 = 0;
        class24.field325 = 0;
        class80.field1335 = 0;
        class238.field3876 = 0;
        client.field2431 = 0;
        class49.field716 = 0;
        class218.field3373 = 0;
        class275.field4384 = 0;
        class5.field47 = 0;
        class160.field2493 = 0;
        class180.field2813 = 0;
        class85.field1430 = 0;
        class295.field4661 = 0;
        class58.field959 = 0;
        class204.field3189 = 0;
        class88.field1527 = 0;
        class88.field1540 = 0;
        class5.field70 = 0;
        class287.field4550 = 0;
        class257.field4112 = 0;
        class25.field337 = 0;
        class50.field734 = 0;
        class18.field271 = 0;
        class271.field4353 = 0;
        class52.field753 = 0;
        class28.field384 = 0;
        class277.field4403 = 0;
        class33.field490 = 0;
        class160.field2482 = 0;
        class218.field3364 = 0;
        class271.field4359 = 0;
        class103.field1726 = 0;
        class57.field942 = 0;
        class219.field3383 = 0;
        class275.field4381 = 0;
        class5.field75 = 0;
        class222.field3408 = 0;
        class72.field1178 = 0;
        class5.field74 = 0;
        class271.field4352 = 0;
        class238.field3871 = 0;
        class56.field925 = 0;
        class196.field3095 = 0;
        class161.field2503 = 0;
        class235.field3787 = 0;
        class47.field661 = 0;
        class230.field3652 = 0;
        class271.field4345 = 0;
        class150.field2365 = 0;
        class62.field1057 = 0;
        class118.field1919 = 0;
        class98.field1647 = 0;
        class265.field4208 = 0;
        class80.field1337 = 0;
        class261.field4164 = 0;
        class88.field1521 = 0;
        class88.field1537 = 0;
        class44.field630 = 0;
        class275.field4389 = 0;
        class88.field1509 = 0;
        class38.field535 = 0;
        class45.field641 = 0;
        class202.field3160 = 0;
        class257.field4106 = 0;
        class203.field3169 = 0;
        class239.field3880 = 0;
        class141.field2156 = 0;
        class187.field2890 = 0;
        class41.field594 = 0;
        class78.field1273 = 0;
        class145.field2309 = 0;
        class75.field1234 = 0;
        class171.field2656 = 0;
        class190.field2947 = 0;
        class258.field4125 = 0;
        class37.field523 = 0;
        class71.field1134 = 0;
        class122.field1962 = 0;
        class278.field4411 = 0;
        class236.field3808 = 0;
        class5.field86 = 0;
        class77.field1269 = 0;
        class192.field2977 = 0;
        class104.field1740 = 0;
        class139.field2129 = 0;
        class145.field2307 = 0;
        class263.field4179 = 0;
        class2.field13 = 0;
        class1.field5 = 0;
        class61.field1046 = 0;
        class265.field4211 = 0;
        class219.field3380 = 0;
        class186.field2878 = 0;
        class231.field3674 = 0;
        class275.field4383 = 0;
        class284.field4503 = 0;
        class69.field1117 = 0;
        class57.field937 = 0;
        class84.field1412 = 0;
        class288.field4561 = 0;
        class230.field3660 = 0;
        class62.field1059 = 0;
        class158.field2458 = 0;
        class49.field721 = 0;
        class237.field3842 = 0;
        class177.field2774 = 0;
        class88.field1507 = 0;
        class202.field3151 = 0;
        class190.field2952 = 0;
        class259.field4146 = 0;
        class30.field433 = 0;
        class58.field960 = 0;
        class177.field2775 = 0;
        class125.field1978 = 0;
        class58.field951 = 0;
        class100.field1679 = 0;
        class202.field3154 = 0;
        class288.field4564 = 0;
        class179.field2789 = 0;
        class93.field1591 = 0;
        class5.field56 = 0;
        class129.field2027 = 0;
        class268.field4283 = 0;
        class88.field1512 = 0;
        class115.field1863 = 0;
        class180.field2802 = 0;
        class181.field2822 = 0;
        class168.field2624 = 0;
        class283.field4462 = 0;
        class50.field728 = 0;
        class58.field954 = 0;
        class122.field1954 = 0;
        class52.field754 = 0;
        class189.field2933 = 0;
        class130.field2043 = 0;
        class5.field87 = 0;
        class80.field1338 = 0;
        class210.field3271 = 0;
        class235.field3777 = 0;
        class248.field4019 = 0;
        class200.field3141 = 0;
        class213.field3309 = 0;
        class240.field3889 = 0;
        class268.field4285 = 0;
        class281.field4445 = 0;
        class25.field336 = 0;
        class277.field4406 = 0;
        class232.field3701 = 0;
        class10.field179 = 0;
        class60.field1001 = 0;
        class19.field289 = 0;
        class240.field3907 = 0;
        class130.field2036 = 0;
        class128.field2020 = 0;
        class258.field4121 = 0;
        class179.field2795 = 0;
        class88.field1486 = 0;
        class236.field3830 = 0;
        class218.field3367 = 0;
        class227.field3458 = 0;
        class263.field4180 = 0;
        class73.field1231 = 0;
        class186.field2876 = 0;
        class157.field2444 = 0;
        class192.field2984 = 0;
        class131.field2062 = 0;
        class130.field2033 = 0;
        class140.field2133 = 0;
        class232.field3699 = 0;
        class71.field1132 = 0;
        class106.field1770 = 0;
        class203.field3176 = 0;
        class149.field2357 = 0;
        class33.field492 = 0;
        class71.field1144 = 0;
        class53.field812 = 0;
        class45.field639 = 0;
        class39.field555 = 0;
        class236.field3826 = 0;
        class39.field545 = 0;
        class222.field3414 = 0;
        class31.field465 = 0;
        class171.field2665 = 0;
        class139.field2124 = 0;
        class283.field4493 = 0;
        class34.field507 = 0;
        class296.field4686 = 0;
        class147.field2329 = 0;
        class271.field4356 = 0;
        class86.field1433 = 0;
        class52.field792 = 0;
        class295.field4664 = 0;
        class4.field35 = 0;
        class20.field295 = 0;
        class88.field1514 = 0;
        class127.field2006 = 0;
        class75.field1239 = 0;
        class267.field4270 = 0;
        class133.field2085 = 0;
        class5.field101 = 0;
        class49.field705 = 0;
        class198.field3119 = 0;
        class73.field1228 = 0;
        class259.field4135 = 0;
        class75.field1241 = 0;
        class88.field1531 = 0;
        class105.field1753 = 0;
        class37.field526 = 0;
        class33.field498 = 0;
        class176.field2762 = 0;
        class41.field596 = 0;
        class50.field733 = 0;
        class47.field676 = 0;
        class239.field3883 = 0;
        class102.field1707 = 0;
        class78.field1274 = 0;
        class197.field3110 = 0;
        class125.field1971 = 0;
        class296.field4685 = 0;
        class202.field3156 = 0;
        class191.field2964 = 0;
        class240.field3897 = 0;
        class129.field2029 = 0;
        class105.field1744 = 0;
        class3.field17 = 0;
        class263.field4172 = 0;
        class265.field4226 = 0;
        class230.field3655 = 0;
        class53.field809 = 0;
        class137.field2112 = 0;
        class133.field2092 = 0;
        class155.field2408 = 0;
        class240.field3898 = 0;
        class60.field1017 = 0;
        class271.field4360 = 0;
        class214.field3326 = 0;
        class193.field3006 = 0;
        class193.field3067 = 0;
        class99.field1665 = 0;
        class231.field3663 = 0;
        class130.field2047 = 0;
        class176.field2761 = 0;
        class235.field3782 = 0;
        class253.field4055 = 0;
        class264.field4204 = 0;
        class260.field4159 = 0;
        class41.field595 = 0;
        class88.field1477 = 0;
        class43.field614 = 0;
        class58.field958 = 0;
        class115.field1862 = 0;
        class69.field1116 = 0;
        class193.field3033 = 0;
        class17.field263 = 0;
        class122.field1959 = 0;
        class135.field2099 = 0;
        class235.field3758 = 0;
        class258.field4127 = 0;
        class79.field1322 = 0;
        class40.field575 = 0;
        class281.field4433 = 0;
        class179.field2780 = 0;
        class46.field650 = 0;
        class236.field3801 = 0;
        class39.field562 = 0;
        class185.field2852 = 0;
        class10.field177 = 0;
        class238.field3874 = 0;
        class110.field1805 = 0;
        class60.field1043 = 0;
        class129.field2028 = 0;
        class235.field3768 = 0;
        class263.field4171 = 0;
        class144.field2238 = 0;
        class187.field2900 = 0;
        class109.field1796 = 0;
        class72.field1214 = 0;
        class187.field2905 = 0;
        class66.field1106 = 0;
        class260.field4163 = 0;
        class27.field372 = 0;
        class103.field1718 = 0;
        class5.field97 = 0;
        class265.field4217 = 0;
        class271.field4355 = 0;
        class55.field917 = 0;
        class93.field1597 = 0;
        field2384 = 0;
        class213.field3310 = 0;
        class100.field1671 = 0;
        class88.field1505 = 0;
        class283.field4456 = 0;
        class231.field3678 = 0;
        class86.field1440 = 0;
        class88.field1484 = 0;
        class19.field285 = 0;
        class196.field3094 = 0;
        class278.field4412 = 0;
        class269.field4306 = 0;
        class173.field2723 = 0;
        class38.field531 = 0;
        class232.field3695 = 0;
        class265.field4238 = 0;
        class113.field1842 = 0;
        class53.field801 = 0;
        class235.field3772 = 0;
        class210.field3263 = 0;
        class88.field1506 = 0;
        class78.field1285 = 0;
        class259.field4140 = 0;
        class103.field1728 = 0;
        class133.field2087 = 0;
        class114.field1858 = 0;
        class118.field1907 = 0;
        class72.field1224 = 0;
        class213.field3306 = 0;
        class236.field3816 = 0;
        client.field2429 = 0;
        class78.field1283 = 0;
        class50.field743 = 0;
        class243.field3957 = 0;
        class288.field4566 = 0;
        class55.field898 = 0;
        class82.field1387 = 0;
        class118.field1908 = 0;
        class191.field2954 = 0;
        class102.field1698 = 0;
        class88.field1500 = 0;
        class72.field1196 = 0;
        class51.field744 = 0;
        class82.field1391 = 0;
        class167.field2610 = 0;
        class217.field3362 = 0;
        class66.field1101 = 0;
        class133.field2093 = 0;
        class258.field4124 = 0;
        class121.field1939 = 0;
        class274.field4371 = 0;
        class2.field11 = 0;
        class5.field82 = 0;
        class268.field4282 = 0;
        class240.field3900 = 0;
        class56.field921 = 0;
        class213.field3314 = 0;
        class235.field3798 = 0;
        class16.field247 = 0;
        class291.field4583 = 0;
        class150.field2364 = 0;
        class100.field1678 = 0;
        class108.field1780 = 0;
        class176.field2764 = 0;
        class236.field3828 = 0;
        class229.field3650 = 0;
        class75.field1233 = 0;
        class49.field726 = 0;
        class187.field2904 = 0;
        field2376 = 0;
        class296.field4680 = 0;
        class235.field3775 = 0;
        class148.field2347 = 0;
        class29.field404 = 0;
        class256.field4098 = 0;
        class191.field2965 = 0;
        class18.field268 = 0;
        class185.field2863 = 0;
        class286.field4524 = 0;
        class5.field52 = 0;
        class115.field1861 = 0;
        class5.field50 = 0;
        class295.field4643 = 0;
        class171.field2667 = 0;
        class10.field181 = 0;
        class55.field900 = 0;
        class133.field2083 = 0;
        class106.field1760 = 0;
        class251.field4044 = 0;
        class173.field2736 = 0;
        class88.field1472 = 0;
        class81.field1355 = 0;
        class39.field558 = 0;
        class150.field2362 = 0;
        class271.field4357 = 0;
        class26.field340 = 0;
        class235.field3764 = 0;
        class10.field174 = 0;
        class238.field3877 = 0;
        class281.field4442 = 0;
        class288.field4563 = 0;
        class60.field1010 = 0;
        class212.field3299 = 0;
        class140.field2135 = 0;
        class127.field2002 = 0;
        class144.field2266 = 0;
        class287.field4540 = 0;
        class115.field1869 = 0;
        class228.field3553 = 0;
        class250.field4029 = 0;
        class52.field756 = 0;
        class254.field4063 = 0;
        class198.field3117 = 0;
        class171.field2657 = 0;
        class191.field2962 = 0;
        class125.field1972 = 0;
        class45.field640 = 0;
        class277.field4394 = 0;
        class53.field810 = 0;
        class176.field2754 = 0;
        class16.field246 = 0;
        class86.field1446 = 0;
        class190.field2940 = 0;
        class248.field4016 = 0;
        class57.field936 = 0;
        class158.field2459 = 0;
        class78.field1289 = 0;
        class53.field814 = 0;
        field2388 = 0;
        class2.field9 = 0;
        class132.field2076 = 0;
        class209.field3257 = 0;
        class100.field1688 = 0;
        class235.field3788 = 0;
        class193.field3004 = 0;
        class294.field4632 = 0;
        class112.field1832 = 0;
        class164.field2575 = 0;
        class112.field1829 = 0;
        client.field2423 = 0;
        class29.field408 = 0;
        class183.field2839 = 0;
        class90.field1572 = 0;
        class50.field735 = 0;
        class272.field4367 = 0;
        class166.field2597 = 0;
        class122.field1961 = 0;
        class192.field2979 = 0;
        class88.field1524 = 0;
        class265.field4234 = 0;
        class61.field1045 = 0;
        class236.field3804 = 0;
        class72.field1159 = 0;
        class253.field4054 = 0;
        class161.field2508 = 0;
        class219.field3377 = 0;
        class284.field4509 = 0;
        class163.field2558 = 0;
        class88.field1533 = 0;
        class237.field3845 = 0;
        class37.field522 = 0;
        class265.field4240 = 0;
        class281.field4434 = 0;
        class5.field54 = 0;
        class245.field3986 = 0;
        class42.field602 = 0;
        class176.field2760 = 0;
        class40.field570 = 0;
        class269.field4304 = 0;
        class133.field2079 = 0;
        class27.field361 = 0;
        class47.field670 = 0;
        class240.field3905 = 0;
        class295.field4656 = 0;
        class47.field683 = 0;
        class93.field1586 = 0;
        class231.field3673 = 0;
        class283.field4482 = 0;
        class186.field2882 = 0;
        class295.field4648 = 0;
        class193.field3062 = 0;
        class143.field2189 = 0;
        class30.field426 = 0;
        class1.field3 = 0;
        class141.field2153 = 0;
        class86.field1455 = 0;
        class17.field253 = 0;
        class171.field2666 = 0;
        class88.field1487 = 0;
        class5.field71 = 0;
        class108.field1781 = 0;
        class160.field2475 = 0;
        class78.field1286 = 0;
        class141.field2154 = 0;
        class88.field1526 = 0;
        class8.field164 = 0;
        class72.field1202 = 0;
        class81.field1378 = 0;
        class193.field2996 = 0;
        class109.field1794 = 0;
        class161.field2519 = 0;
        class87.field1463 = 0;
        class133.field2081 = 0;
        class112.field1834 = 0;
        class88.field1502 = 0;
        class150.field2363 = 0;
        class154.field2403 = 0;
        class174.field2742 = 0;
        class55.field905 = 0;
        class229.field3648 = 0;
        class75.field1245 = 0;
        class265.field4210 = 0;
        class4.field25 = 0;
        class80.field1339 = 0;
        class235.field3786 = 0;
        class206.field3219 = 0;
        class55.field901 = 0;
        client.field2421 = 0;
        class288.field4560 = 0;
        class180.field2816 = 0;
        class97.field1628 = 0;
        class288.field4571 = 0;
        class84.field1420 = 0;
        class88.field1536 = 0;
        class115.field1875 = 0;
        class150.field2360 = 0;
        class190.field2944 = 0;
        class162.field2544 = 0;
        class201.field3145 = 0;
        class94.field1602 = 0;
        class37.field528 = 0;
        class275.field4390 = 0;
        class53.field803 = 0;
        class84.field1421 = 0;
        class235.field3761 = 0;
        class197.field3115 = 0;
        class177.field2766 = 0;
        class245.field3978 = 0;
        client.field2424 = 0;
        class17.field262 = 0;
        class182.field2836 = 0;
        class28.field386 = 0;
        class55.field903 = 0;
        class128.field2013 = 0;
        class77.field1271 = 0;
        class44.field633 = 0;
        class44.field625 = 0;
        class105.field1749 = 0;
        class189.field2920 = 0;
        class173.field2738 = 0;
        class281.field4448 = 0;
        class98.field1650 = 0;
        class5.field58 = 0;
        class179.field2785 = 0;
        class112.field1828 = 0;
        class201.field3150 = 0;
        class179.field2791 = 0;
        class269.field4288 = 0;
        class275.field4377 = 0;
        class88.field1494 = 0;
        class264.field4189 = 0;
        class228.field3635 = 0;
        class103.field1724 = 0;
        class41.field588 = 0;
        class205.field3200 = 0;
        class206.field3214 = 0;
        class208.field3232 = 0;
        class121.field1945 = 0;
        class26.field343 = 0;
        class235.field3767 = 0;
        class73.field1232 = 0;
        class161.field2517 = 0;
        class5.field53 = 0;
        class228.field3600 = 0;
        class60.field995 = 0;
        class269.field4309 = 0;
        class30.field435 = 0;
        class88.field1489 = 0;
        class31.field466 = 0;
        class187.field2903 = 0;
        class297.field4693 = 0;
        class109.field1791 = 0;
        class168.field2625 = 0;
        class193.field2998 = 0;
        class265.field4221 = 0;
        class129.field2030 = 0;
        class133.field2089 = 0;
        class165.field2588 = 0;
        class212.field3298 = 0;
        class62.field1061 = 0;
        class240.field3895 = 0;
        class287.field4546 = 0;
        class72.field1193 = 0;
        class257.field4117 = 0;
        class180.field2806 = 0;
        class88.field1513 = 0;
        class105.field1743 = 0;
        class117.field1903 = 0;
        class295.field4668 = 0;
        class82.field1384 = 0;
        class269.field4290 = 0;
        class166.field2598 = 0;
        class191.field2958 = 0;
        class127.field1997 = 0;
        class139.field2121 = 0;
        class5.field88 = 0;
        class143.field2187 = 0;
        class179.field2781 = 0;
        class6.field119 = 0;
        class287.field4558 = 0;
        class267.field4251 = 0;
        class231.field3671 = 0;
        client.field2419 = 0;
        class101.field1694 = 0;
        class251.field4042 = 0;
        class47.field681 = 0;
        class193.field3025 = 0;
        class51.field747 = 0;
        class254.field4069 = 0;
        class286.field4527 = 0;
        class118.field1915 = 0;
        class75.field1247 = 0;
        class60.field1027 = 0;
        class62.field1069 = 0;
        class78.field1284 = 0;
        class65.field1089 = 0;
        class116.field1886 = 0;
        class100.field1677 = 0;
        class15.field232 = 0;
        class235.field3792 = 0;
        class39.field553 = 0;
        class186.field2881 = 0;
        class47.field678 = 0;
        class161.field2518 = 0;
        class128.field2011 = 0;
        class53.field805 = 0;
        class2.field12 = 0;
        class27.field373 = 0;
        class16.field251 = 0;
        class88.field1478 = 0;
        class87.field1467 = 0;
        class49.field725 = 0;
        class166.field2607 = 0;
        class116.field1898 = 0;
        class203.field3167 = 0;
        class49.field707 = 0;
        class190.field2938 = 0;
        class28.field385 = 0;
        class47.field679 = 0;
        class71.field1126 = 0;
        class198.field3118 = 0;
        client.field2422 = 0;
        class27.field365 = 0;
        class141.field2147 = 0;
        class88.field1508 = 0;
        class161.field2522 = 0;
        class263.field4178 = 0;
        class155.field2411 = 0;
        class173.field2724 = 0;
        class99.field1663 = 0;
        class191.field2957 = 0;
        class235.field3776 = 0;
        class4.field28 = 0;
        class65.field1092 = 0;
        class125.field1973 = 0;
        class253.field4056 = 0;
        class295.field4644 = 0;
        class56.field932 = 0;
        class205.field3208 = 0;
        class231.field3669 = 0;
        class146.field2322 = 0;
        class82.field1390 = 0;
        class162.field2536 = 0;
        class55.field909 = 0;
        class214.field3328 = 0;
        class113.field1844 = 0;
        class269.field4292 = 0;
        class161.field2516 = 0;
        client.field2428 = 0;
        class72.field1187 = 0;
        class43.field612 = 0;
        class6.field137 = 0;
        class129.field2026 = 0;
        class60.field1011 = 0;
        class149.field2353 = 0;
        class77.field1268 = 0;
        class93.field1588 = 0;
        class125.field1969 = 0;
        class58.field950 = 0;
        class42.field600 = 0;
        class189.field2928 = 0;
        class237.field3838 = 0;
        class37.field529 = 0;
        class150.field2367 = 0;
        class193.field3014 = 0;
        class5.field63 = 0;
        class265.field4224 = 0;
        class61.field1044 = 0;
        class130.field2046 = 0;
        class198.field3121 = 0;
        class271.field4347 = 0;
        class269.field4312 = 0;
        class38.field537 = 0;
        class295.field4650 = 0;
        class39.field548 = 0;
        class27.field362 = 0;
        class78.field1278 = 0;
        class157.field2449 = 0;
        class160.field2486 = 0;
        class3.field16 = 0;
        class144.field2247 = 0;
        class173.field2731 = 0;
        class121.field1943 = 0;
        class192.field2971 = 0;
        class90.field1574 = 0;
        class161.field2509 = 0;
        class254.field4078 = 0;
        class283.field4464 = 0;
        class197.field3107 = 0;
        class130.field2035 = 0;
        class143.field2188 = 0;
        class243.field3960 = 0;
        class88.field1496 = 0;
        class43.field617 = 0;
        class264.field4195 = 0;
        class47.field666 = 0;
        class88.field1480 = 0;
        class41.field593 = 0;
        class237.field3835 = 0;
        class3.field15 = 0;
        class218.field3363 = 0;
        class143.field2181 = 0;
        class164.field2580 = 0;
        class148.field2350 = 0;
        class176.field2756 = 0;
        class293.field4628 = 0;
        class72.field1200 = 0;
        class142.field2169 = 0;
        class193.field3013 = 0;
        class79.field1324 = 0;
        class142.field2162 = 0;
        class88.field1528 = 0;
        class254.field4075 = 0;
        class264.field4199 = 0;
        class66.field1104 = 0;
        class281.field4432 = 0;
        class208.field3241 = 0;
        class5.field45 = 0;
        class49.field714 = 0;
        class33.field499 = 0;
        class283.field4490 = 0;
        class17.field260 = 0;
        class44.field623 = 0;
        class191.field2966 = 0;
        class88.field1479 = 0;
        class235.field3771 = 0;
        class171.field2669 = 0;
        class30.field420 = 0;
        class104.field1737 = 0;
        class77.field1261 = 0;
        class286.field4521 = 0;
        class136.field2107 = 0;
        class78.field1275 = 0;
        class90.field1571 = 0;
        class130.field2051 = 0;
        class174.field2746 = 0;
        class267.field4253 = 0;
        class142.field2163 = 0;
        class8.field167 = 0;
        class236.field3805 = 0;
        class187.field2891 = 0;
        class133.field2088 = 0;
        class228.field3591 = 0;
        class49.field700 = 0;
        class70.field1123 = 0;
        class144.field2244 = 0;
        class245.field3981 = 0;
        class212.field3297 = 0;
        class284.field4502 = 0;
        class16.field238 = 0;
        class176.field2757 = 0;
        class263.field4182 = 0;
        class162.field2540 = 0;
        class265.field4225 = 0;
        class197.field3113 = 0;
        class43.field615 = 0;
        class237.field3848 = 0;
        class1.field1 = 0;
        class86.field1438 = 0;
        class173.field2737 = 0;
        class265.field4236 = 0;
        class7.field151 = 0;
        class239.field3886 = 0;
        class115.field1870 = 0;
        class19.field287 = 0;
        class155.field2413 = 0;
        class26.field342 = 0;
        class259.field4155 = 0;
        class5.field107 = 0;
        class186.field2875 = 0;
        class189.field2935 = 0;
        field2392 = 0;
        class205.field3203 = 0;
        class157.field2450 = 0;
        class145.field2302 = 0;
        class88.field1476 = 0;
        class265.field4213 = 0;
        class218.field3369 = 0;
        class43.field618 = 0;
        class144.field2209 = 0;
        class158.field2454 = 0;
        class192.field2983 = 0;
        class95.field1608 = 0;
        class281.field4449 = 0;
        class193.field3055 = 0;
        class180.field2814 = 0;
        class205.field3202 = 0;
        class139.field2122 = 0;
        class261.field4169 = 0;
        class235.field3762 = 0;
        class180.field2809 = 0;
        class39.field561 = 0;
        class201.field3147 = 0;
        class228.field3466 = 0;
        class115.field1864 = 0;
        class145.field2313 = 0;
        class42.field604 = 0;
        class110.field1800 = 0;
        class88.field1510 = 0;
        class57.field947 = 0;
        class149.field2355 = 0;
        class291.field4588 = 0;
        class159.field2470 = 0;
        class112.field1830 = 0;
        class39.field556 = 0;
        class187.field2885 = 0;
        class50.field732 = 0;
        class237.field3840 = 0;
        class265.field4239 = 0;
        class26.field346 = 0;
        class235.field3763 = 0;
        class72.field1215 = 0;
        class238.field3867 = 0;
        class208.field3239 = 0;
        class89.field1551 = 0;
        class40.field580 = 0;
        class150.field2359 = 0;
        class78.field1290 = 0;
        class98.field1642 = 0;
        class274.field4372 = 0;
        class130.field2039 = 0;
        class88.field1515 = 0;
        class53.field799 = 0;
        class268.field4279 = 0;
        class265.field4222 = 0;
        class5.field108 = 0;
        class71.field1133 = 0;
        class170.field2643 = 0;
        class56.field927 = 0;
        class259.field4134 = 0;
        class209.field3255 = 0;
        class47.field675 = 0;
        class42.field603 = 0;
        class22.field319 = 0;
        class141.field2149 = 0;
        class17.field256 = 0;
        class116.field1889 = 0;
        class189.field2930 = 0;
        class16.field239 = 0;
        class81.field1374 = 0;
        class174.field2739 = 0;
        class281.field4437 = 0;
        class213.field3318 = 0;
        class52.field765 = 0;
        class40.field579 = 0;
        class137.field2108 = 0;
        class98.field1648 = 0;
        class297.field4690 = 0;
        class142.field2158 = 0;
        class264.field4200 = 0;
        class295.field4645 = 0;
        class50.field730 = 0;
        class231.field3665 = 0;
        class235.field3797 = 0;
        class62.field1060 = 0;
        class176.field2755 = 0;
        class105.field1747 = 0;
        class102.field1709 = 0;
        class151.field2374 = 0;
        class202.field3164 = 0;
        class235.field3791 = 0;
        class78.field1296 = 0;
        class163.field2559 = 0;
        class231.field3664 = 0;
        class284.field4505 = 0;
        class133.field2094 = 0;
        class126.field1983 = 0;
        class291.field4581 = 0;
        class30.field452 = 0;
        class28.field378 = 0;
        class208.field3231 = 0;
        class173.field2727 = 0;
        class88.field1532 = 0;
        class239.field3888 = 0;
        class209.field3251 = 0;
        class88.field1504 = 0;
        class162.field2542 = 0;
        class11.field183 = 0;
        class33.field491 = 0;
        class295.field4647 = 0;
        class81.field1364 = 0;
        class202.field3161 = 0;
        class209.field3249 = 0;
        class17.field265 = 0;
        class179.field2787 = 0;
        class194.field3070 = 0;
        class180.field2803 = 0;
        class130.field2053 = 0;
        class250.field4035 = 0;
        class230.field3662 = 0;
        class275.field4388 = 0;
        class163.field2555 = 0;
        class143.field2178 = 0;
        class277.field4399 = 0;
        class99.field1661 = 0;
        class222.field3410 = 0;
        class113.field1848 = 0;
        class4.field37 = 0;
        class131.field2066 = 0;
        class79.field1317 = 0;
        class204.field3178 = 0;
        class166.field2605 = 0;
        class117.field1901 = 0;
        class88.field1525 = 0;
        class145.field2301 = 0;
        class46.field655 = 0;
        class235.field3766 = 0;
        class111.field1811 = 0;
        class295.field4662 = 0;
        class103.field1716 = 0;
        class237.field3849 = 0;
        client.field2420 = 0;
        class79.field1319 = 0;
        class52.field773 = 0;
        class291.field4580 = 0;
        client.field2432 = 0;
        class257.field4115 = 0;
        class139.field2127 = 0;
        class228.field3495 = 0;
        class125.field1980 = 0;
        class5.field48 = 0;
        class139.field2128 = 0;
        class60.field982 = 0;
        class209.field3248 = 0;
        class291.field4586 = 0;
        class228.field3499 = 0;
        class73.field1229 = 0;
        class138.field2115 = 0;
        client.field2427 = 0;
        class72.field1163 = 0;
        class286.field4516 = 0;
        class286.field4525 = 0;
        class203.field3173 = 0;
        class5.field103 = 0;
        class293.field4607 = 0;
        class2.field7 = 0;
        class293.field4608 = 0;
        class72.field1172 = 0;
        class161.field2507 = 0;
        class228.field3595 = 0;
        class253.field4052 = 0;
        class257.field4116 = 0;
        class8.field165 = 0;
        class259.field4132 = 0;
        class82.field1393 = 0;
        class174.field2740 = 0;
        class88.field1538 = 0;
        class223.field3419 = 0;
        class113.field1850 = 0;
        class228.field3471 = 0;
        class34.field512 = 0;
        class42.field606 = 0;
        class219.field3381 = 0;
        class292.field4601 = 0;
        class296.field4677 = 0;
        class142.field2167 = 0;
        class26.field350 = 0;
        class158.field2456 = 0;
        class217.field3358 = 0;
        class231.field3680 = 0;
        class235.field3785 = 0;
        class39.field554 = 0;
        class72.field1220 = 0;
        class265.field4209 = 0;
        class166.field2600 = 0;
        class271.field4342 = 0;
        class132.field2074 = 0;
        class209.field3254 = 0;
        class144.field2283 = 0;
        class114.field1860 = 0;
        class274.field4370 = 0;
        class60.field978 = 0;
        class47.field665 = 0;
        class212.field3296 = 0;
        class287.field4544 = 0;
        class182.field2832 = 0;
        class55.field912 = 0;
        class114.field1855 = 0;
        class103.field1721 = 0;
        class263.field4183 = 0;
        class28.field381 = 0;
        class129.field2023 = 0;
        class274.field4373 = 0;
        class295.field4649 = 0;
        class102.field1700 = 0;
        class176.field2758 = 0;
        class53.field802 = 0;
        class88.field1485 = 0;
        class148.field2348 = 0;
        class204.field3179 = 0;
        class110.field1808 = 0;
        class214.field3336 = 0;
        class204.field3192 = 0;
        class180.field2804 = 0;
        class190.field2939 = 0;
        class45.field644 = 0;
        class5.field95 = 0;
        class265.field4231 = 0;
        class78.field1276 = 0;
        class49.field709 = 0;
        class103.field1714 = 0;
        class60.field1033 = 0;
        class145.field2318 = 0;
        class221.field3396 = 0;
        class69.field1113 = 0;
        class254.field4064 = 0;
        class98.field1657 = 0;
        class286.field4526 = 0;
        class171.field2674 = 0;
        class126.field1994 = 0;
        class13.field212 = 0;
        class157.field2453 = 0;
        class88.field1497 = 0;
        class31.field463 = 0;
        class281.field4444 = 0;
        class257.field4108 = 0;
        class75.field1240 = 0;
        class184.field2850 = 0;
        class5.field78 = 0;
        class88.field1503 = 0;
        class214.field3329 = 0;
        class213.field3307 = 0;
        class204.field3186 = 0;
        class38.field534 = 0;
        class200.field3131 = 0;
        class291.field4587 = 0;
        class264.field4197 = 0;
        class236.field3818 = 0;
        class18.field275 = 0;
        class5.field98 = 0;
        class166.field2593 = 0;
        class144.field2298 = 0;
        class271.field4348 = 0;
        class85.field1429 = 0;
        class131.field2059 = 0;
        class228.field3602 = 0;
        class174.field2748 = 0;
        class292.field4605 = 0;
        class39.field567 = 0;
        class112.field1831 = 0;
        class131.field2064 = 0;
        class249.field4026 = 0;
        class214.field3342 = 0;
        class27.field367 = 0;
        class230.field3657 = 0;
        class250.field4028 = 0;
        class82.field1383 = 0;
        class277.field4404 = 0;
        class193.field2992 = 0;
        class168.field2630 = 0;
        class57.field935 = 0;
        class5.field91 = 0;
        class46.field653 = 0;
        class5.field64 = 0;
        class177.field2769 = 0;
        class258.field4126 = 0;
        class162.field2534 = 0;
        class166.field2606 = 0;
        class265.field4207 = 0;
        class147.field2330 = 0;
        class264.field4205 = 0;
        class112.field1833 = 0;
        class235.field3789 = 0;
        client.field2425 = 0;
        class52.field777 = 0;
        class265.field4219 = 0;
        class161.field2512 = 0;
        class292.field4596 = 0;
        class50.field727 = 0;
        class100.field1684 = 0;
        class171.field2662 = 0;
        class197.field3104 = 0;
        class88.field1488 = 0;
        class237.field3847 = 0;
        class160.field2491 = 0;
        class181.field2831 = 0;
        class72.field1207 = 0;
        class205.field3195 = 0;
        class216.field3347 = 0;
        class200.field3138 = 0;
        class228.field3552 = 0;
        class70.field1124 = 0;
        class47.field667 = 0;
        class131.field2067 = 0;
        class160.field2498 = 0;
        class120.field1935 = 0;
        class77.field1264 = 0;
        class255.field4088 = 0;
        class88.field1530 = 0;
        class89.field1565 = 0;
        class250.field4037 = 0;
        class208.field3245 = 0;
        class133.field2078 = 0;
        class277.field4397 = 0;
        class5.field94 = 0;
        class160.field2500 = 0;
        class49.field718 = 0;
        class85.field1427 = 0;
        class231.field3681 = 0;
        class45.field635 = 0;
        class261.field4167 = 0;
        class257.field4109 = 0;
        class66.field1103 = 0;
        class232.field3702 = 0;
        class184.field2849 = 0;
        class145.field2316 = 0;
        class265.field4233 = 0;
        class44.field632 = 0;
        class45.field634 = 0;
        class100.field1683 = 0;
        field2379 = 0;
        class265.field4218 = 0;
        class204.field3181 = 0;
        class267.field4252 = 0;
        class114.field1856 = 0;
        class160.field2483 = 0;
        class223.field3416 = 0;
        class40.field578 = 0;
        class286.field4519 = 0;
        class41.field585 = 0;
        class52.field755 = 0;
        class121.field1940 = 0;
        class115.field1867 = 0;
        class20.field300 = 0;
        class295.field4637 = 0;
        class186.field2883 = 0;
        class44.field626 = 0;
        class186.field2880 = 0;
        class180.field2817 = 0;
        class127.field1998 = 0;
        class69.field1115 = 0;
        class164.field2583 = 0;
        class191.field2969 = 0;
        class103.field1722 = 0;
        class27.field359 = 0;
        class210.field3265 = 0;
        class88.field1495 = 0;
        class5.field102 = 0;
        class80.field1332 = 0;
        class222.field3413 = 0;
        class221.field3395 = 0;
        class264.field4196 = 0;
        class90.field1570 = 0;
        class65.field1090 = 0;
        class202.field3152 = 0;
        class5.field67 = 0;
        class227.field3463 = 0;
        class236.field3825 = 0;
        class30.field427 = 0;
        class235.field3770 = 0;
        class165.field2592 = 0;
        class185.field2858 = 0;
        class221.field3393 = 0;
        class34.field506 = 0;
        class86.field1449 = 0;
        class103.field1720 = 0;
        class69.field1112 = 0;
        class227.field3459 = 0;
        class101.field1693 = 0;
        class297.field4695 = 0;
        class253.field4053 = 0;
        class286.field4515 = 0;
        class51.field746 = 0;
        class88.field1491 = 0;
        class113.field1845 = 0;
        class161.field2505 = 0;
        class275.field4391 = 0;
        class202.field3158 = 0;
        class84.field1418 = 0;
        class41.field591 = 0;
        class163.field2549 = 0;
        class265.field4216 = 0;
        class126.field1984 = 0;
        class41.field589 = 0;
        class269.field4311 = 0;
        class157.field2442 = 0;
        class132.field2068 = 0;
        class88.field1501 = 0;
        class5.field44 = 0;
        class127.field2008 = 0;
        class115.field1874 = 0;
        class39.field549 = 0;
        class229.field3649 = 0;
        class228.field3624 = 0;
        class80.field1342 = 0;
        class129.field2022 = 0;
        class251.field4043 = 0;
        class275.field4378 = 0;
        class39.field550 = 0;
        class47.field669 = 0;
        class223.field3424 = 0;
        class142.field2161 = 0;
        class82.field1389 = 0;
        field2375 = 0;
        class297.field4692 = 0;
        class208.field3237 = 0;
        class231.field3676 = 0;
        class86.field1444 = 0;
        class95.field1611 = 0;
        class281.field4447 = 0;
        class97.field1624 = 0;
        class200.field3140 = 0;
        class109.field1788 = 0;
        class93.field1584 = 0;
        class109.field1786 = 0;
        class144.field2295 = 0;
        class193.field3011 = 0;
        class263.field4177 = 0;
        class58.field957 = 0;
        class78.field1287 = 0;
        class40.field574 = 0;
        class112.field1836 = 0;
        class105.field1750 = 0;
        class241.field3912 = 0;
        class128.field2015 = 0;
        class191.field2959 = 0;
        class184.field2848 = 0;
        class126.field1985 = 0;
        class66.field1102 = 0;
        class212.field3281 = 0;
        class126.field1993 = 0;
        class5.field51 = 0;
        class114.field1854 = 0;
        class79.field1313 = 0;
        class19.field288 = 0;
        class106.field1757 = 0;
        class11.field199 = 0;
        class43.field608 = 0;
        class125.field1977 = 0;
        class168.field2623 = 0;
        class58.field952 = 0;
        class72.field1167 = 0;
        class171.field2659 = 0;
        class106.field1768 = 0;
        class50.field729 = 0;
        class46.field658 = 0;
        class47.field660 = 0;
        class39.field559 = 0;
        class180.field2797 = 0;
        class168.field2622 = 0;
        class265.field4242 = 0;
        class88.field1520 = 0;
        class263.field4175 = 0;
        class230.field3656 = 0;
        class281.field4435 = 0;
        class4.field38 = 0;
        class71.field1142 = 0;
        class245.field3979 = 0;
        class277.field4402 = 0;
        class78.field1291 = 0;
        class283.field4487 = 0;
        class214.field3341 = 0;
        class86.field1442 = 0;
        class130.field2038 = 0;
        class71.field1139 = 0;
        class218.field3368 = 0;
        class149.field2356 = 0;
        class185.field2856 = 0;
        class18.field270 = 0;
        class131.field2065 = 0;
        client.field2426 = 0;
        class206.field3226 = 0;
        class271.field4346 = 0;
        class7.field152 = 0;
        class100.field1682 = 0;
        class267.field4261 = 0;
        class49.field723 = 0;
        class193.field3002 = 0;
        class17.field259 = 0;
        class93.field1590 = 0;
        class281.field4440 = 0;
        client.field2430 = 0;
        class30.field424 = 0;
        class86.field1436 = 0;
        field2390 = 0;
        class197.field3106 = 0;
        class99.field1667 = 0;
        class256.field4101 = 0;
        class203.field3165 = 0;
        class10.field176 = 0;
        class60.field987 = 0;
        class254.field4076 = 0;
        class236.field3809 = 0;
        class30.field419 = 0;
        class190.field2941 = 0;
        class179.field2786 = 0;
        class31.field464 = 0;
        class100.field1680 = 0;
        class133.field2077 = 0;
        class89.field1548 = 0;
        class183.field2837 = 0;
        class16.field245 = 0;
        class231.field3668 = 0;
        class90.field1576 = 0;
        class52.field759 = 0;
        class75.field1250 = 0;
        class219.field3379 = 0;
        class147.field2327 = 0;
        class284.field4504 = 0;
        class228.field3508 = 0;
        class144.field2232 = 0;
        class191.field2961 = 0;
        class104.field1733 = 0;
        class46.field659 = 0;
        class105.field1742 = 0;
        class34.field505 = 0;
        class294.field4634 = 0;
        class61.field1048 = 0;
        class223.field3418 = 0;
        class84.field1410 = 0;
        class20.field293 = 0;
        class143.field2193 = 0;
        class222.field3409 = 0;
        class283.field4463 = 0;
        class161.field2510 = -1;
        class256.field4091 = -1;
        class133.field2086 = 0;
        class236.field3814.field1535 = 0;
        class52.field761 = -1;
        for (int var1 = 0; var1 < class28.field393.length; var1++) {
            class28.field393[var1] = null;
        }
        class47.field687 = false;
        class128.field2018 = 0;
        class227.method1507(0, 612510212);
        for (int var2 = 0; var2 < 100; var2++) {
            class193.field3060[var2] = null;
        }
        class167.field2620 = 0;
        class103.field1732 = (int) (Math.random() * 120.0D) - 60;
        class77.field1265 = (int) (Math.random() * 30.0D) - 20;
        class16.field244 = (float) ((int) (Math.random() * 20.0D) - 10 & 0x7FF);
        class70.field1119 = 0;
        class137.field2110 = 0;
        class73.field1227 = 0;
        class97.field1626 = 0;
        class122.field1960 = false;
        class112.field1841 = 0;
        class213.field3316 = (int) (Math.random() * 100.0D) - 50;
        class130.field2057 = 0;
        class86.field1448 = (int) (Math.random() * 80.0D) - 40;
        class206.field3220 = -1;
        class176.field2753 = (int) (Math.random() * 110.0D) - 55;
        class53.field806 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class210.field3267[var3] = null;
            class132.field2075[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class255.field4082[var4] = null;
        }
        class283.field4473 = class210.field3267[2047] = new class236();
        class240.field3899.method1226(1);
        class104.field1734.method1226(1);
        if (class222.field3411 != null) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        class222.field3411[var5][var6][var7] = null;
                    }
                }
            }
        }
        class187.field2892 = new class180();
        class166.field2604 = 0;
        class206.field3209 = 0;
        class90.method692(11464);
        class145.method982((byte) 90);
        class53.field808 = 0;
        class293.field4610 = 0;
        class168.field2628 = 0;
        class272.field4366 = 0;
        class86.field1434 = 0;
        class65.field1100 = 0;
        class110.field1804 = 0;
        class277.field4401 = 0;
        class170.field2650 = 0;
        class128.field2019 = 0;
        for (int var8 = 0; var8 < class167.field2621.length; var8++) {
            class167.field2621[var8] = -1;
        }
        if (class75.field1236 != -1) {
            class66.method488(false, class75.field1236);
        }
        for (class251 var9 = (class251) class127.field2007.method287(-126); var9 != null; var9 = (class251) class127.field2007.method291((byte) -41)) {
            class177.method1198(var9, (byte) -117, true);
        }
        class75.field1236 = -1;
        class127.field2007 = new class39(8);
        class29.method226(-756);
        class128.field2018 = 0;
        class47.field687 = false;
        class184.field2847 = null;
        class202.field3159.method360((int[]) null, new int[5], false, -1, (byte) 98, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            class118.field1913[var10] = null;
            class6.field130[var10] = false;
            class251.field4046[var10] = -1;
        }
        class160.method1082((byte) 121);
        class196.field3101 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class25.field335[var11] = true;
        }
        class139.field2119 = 0;
        class83.field1401 = null;
        class139.field2126 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class33.field495[var12] = new class148();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class11.field194[var13] = 0;
            class28.field382[var13] = 0;
            class166.field2595[var13] = 0;
        }
        class287.field4543 = class291.field4585 = class13.field214 = class80.field1333 = new short[256];
        class125.field1975 = false;
        class221.field3401 = 0;
        class115.field1877 = true;
        class186.field2868 = class139.field2131;
        class148.method994(-24);
        class180.field2798 = false;
        class41.method299((byte) -10);
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)[B")
    public abstract byte[] method1024(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1025(class235 arg0, int arg1) {
        class98.field1649 = arg0.method1603(-117, "runes");
        field2392++;
        if (arg1 <= 32) {
            method1027((byte) -77);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)I")
    public abstract int method1026(boolean arg0);

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static final void method1027(byte arg0) {
        class183 var1 = (class183) class104.field1734.method1221(124);
        if (arg0 >= -31) {
            field2385 = -46;
        }
        while (var1 != null) {
            class214 var2 = var1.field2838;
            if (class240.field3892 != var2.field3333 || var2.field3338) {
                var1.method1123(0);
            } else if (var2.field3332 <= class192.field2978) {
                var2.method1450((byte) -118, class84.field1413);
                if (var2.field3338) {
                    var1.method1123(0);
                } else {
                    class70.method506(var2.field3333, var2.field3340, var2.field3343, var2.field3344, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class183) class104.field1734.method1227(-10626);
        }
        field2376++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZZB)V")
    public static final void method1028(int arg0, boolean arg1, boolean arg2, byte arg3) {
        field2389++;
        int var10002;
        for (int var4 = 0; var4 < class70.field1119; var4++) {
            class45 var21 = class255.field4082[class284.field4506[var4]];
            if (var21 != null && var21.method328(0) && var21.field645.method457((byte) 87)) {
                int var22 = var21.method971(65535);
                if (arg2) {
                    if (!var21.field645.field1004) {
                        continue;
                    }
                } else if (arg1 != var21.field645.field1016 || arg0 != 0 && arg0 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field2240 & 0x7F) == 64 && (var21.field2278 & 0x7F) == 64) {
                        int var29 = var21.field2240 >> 7;
                        int var30 = var21.field2278 >> 7;
                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                            var10002 = class245.field3985[var29][var30]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field2240 & 0x7F) == 0 && (var21.field2278 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field2240 & 0x7F) == 64 && (var21.field2278 & 0x7F) == 64)) {
                    int var23 = var21.field2240 - (var22 * 64) >> 7;
                    int var24 = var21.field2278 - (var22 * 64) >> 7;
                    int var25 = var21.method971(65535) + var23;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    int var26 = var21.method971(65535) + var24;
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    for (int var27 = var23; var27 < var25; var27++) {
                        for (int var28 = var24; var28 < var26; var28++) {
                            var10002 = class245.field3985[var27][var28]++;
                        }
                    }
                }
            }
        }
        label210: for (int var5 = 0; var5 < class70.field1119; var5++) {
            long var6 = (long) class284.field4506[var5] << 32 | 0x20000000L;
            class45 var8 = class255.field4082[class284.field4506[var5]];
            if (var8 != null && var8.method328(0) && var8.field645.method457((byte) 100)) {
                int var9 = var8.method971(65535);
                if (arg2) {
                    if (!var8.field645.field1004) {
                        continue;
                    }
                } else if (var8.field645.field1016 != arg1 || arg0 != 0 && arg0 != var9) {
                    continue;
                }
                var8.field2222 = true;
                if (var9 == 1) {
                    if ((var8.field2240 & 0x7F) == 64 && (var8.field2278 & 0x7F) == 64) {
                        int var10 = var8.field2240 >> 7;
                        int var11 = var8.field2278 >> 7;
                        if (var10 < 0 || var10 >= 104 || var11 < 0 || var11 >= 104) {
                            continue;
                        }
                        if (class245.field3985[var10][var11] > 1) {
                            var10002 = class245.field3985[var10][var11]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var8.field2240 & 0x7F) == 0 && (var8.field2278 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var8.field2240 & 0x7F) == 64 && (var8.field2278 & 0x7F) == 64) {
                    int var12 = var8.field2240 - (var9 * 64) >> 7;
                    int var13 = var8.field2278 - (var9 * 64) >> 7;
                    int var14 = var9 + var12;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    boolean var15 = true;
                    int var16 = var9 + var13;
                    if (var16 > 104) {
                        var16 = 104;
                    }
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    for (int var17 = var12; var17 < var14; var17++) {
                        for (int var20 = var13; var20 < var16; var20++) {
                            if (class245.field3985[var17][var20] <= 1) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        int var18 = var12;
                        while (true) {
                            if (var14 <= var18) {
                                continue label210;
                            }
                            for (int var19 = var13; var19 < var16; var19++) {
                                var10002 = class245.field3985[var18][var19]--;
                            }
                            var18++;
                        }
                    }
                }
                var8.field2222 = false;
                if (!var8.field645.field985) {
                    var6 |= Long.MIN_VALUE;
                }
                var8.field2234 = class34.method269(class240.field3892, var8.field2278, var8.field2240, 103);
                class70.method506(class240.field3892, var8.field2240, var8.field2278, var8.field2234, (var9 - 1) * 64 + 60, var8, var8.field2275, var6, var8.field2200);
            }
        }
        if (arg3 >= -7) {
            method1028(52, false, false, (byte) -76);
        }
    }
}
