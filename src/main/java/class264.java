import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class264 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4184 = null;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
    public static int[] field4182 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "[I")
    public static int[] field4186 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lgn;")
    public static class6 field4183;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Lrj;", line = 7)
    public static final class20 method1881(byte arg0, int arg1) {
        field4179++;
        class20 var2 = (class20) class202.field3301.method1619((long) arg1, 67);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 103) {
            return (class20) null;
        } else {
            byte[] var3 = class219.field3511.method250(true, class309.method2163(arg1, -13013), class240.method1699(arg1, 104));
            class20 var4 = new class20();
            var4.field286 = arg1;
            if (var3 != null) {
                var4.method134(new class192(var3), true);
            }
            class202.field3301.method1621((long) arg1, 103, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIZII)V", line = 31)
    public static final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4177++;
        if (arg6 < 128 || arg4 < 128 || arg6 > 13056 || arg4 > 13056) {
            class329.field5122 = -1;
            class69.field900 = -1;
            return;
        }
        int var8 = class227.method1653(arg6, arg4, -12282, class148.field2209) - arg0;
        int var9 = arg6 - class74.field983;
        int var10 = arg4 - class27.field388;
        int var11 = class25.field355[class281.field4425];
        int var12 = class25.field355[class185.field2971];
        int var13 = class25.field359[class281.field4425];
        int var14 = var8 - class161.field2644;
        int var15 = class25.field359[class185.field2971];
        if (arg5) {
            field4186 = (int[]) null;
        }
        int var16 = var9 * var15 + var10 * var12 >> 16;
        int var17 = var10 * var15 - var9 * var12 >> 16;
        int var19 = var13 * var14 - (var11 * var17) >> 16;
        int var20 = var11 * var14 + var13 * var17 >> 16;
        if (var20 < 50) {
            class69.field900 = -1;
            class329.field5122 = -1;
        } else if (class186.field2991) {
            int var22 = arg1 * 512 >> 8;
            class69.field900 = arg7 + (var16 * var22 / var20);
            int var23 = arg3 * 512 >> 8;
            class329.field5122 = var19 * var23 / var20 + arg2;
        } else {
            class329.field5122 = (var19 << 9) / var20 + arg2;
            class69.field900 = (var16 << 9) / var20 + arg7;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 93)
    public static void method1883(int arg0) {
        field4182 = null;
        field4184 = null;
        field4186 = null;
        field4183 = null;
        if (arg0 != 10) {
            field4185 = 88;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 122)
    public static final void method1884(int arg0) {
        if (class34.field448 > 0) {
            class34.field448--;
        }
        if (class339.field5257 > 1) {
            class35.field471 = class297.field4655;
            class339.field5257--;
        }
        field4178++;
        if (class208.field3403) {
            class208.field3403 = false;
            class319.method2222((byte) 5);
            return;
        }
        for (int var1 = 0; var1 < 100 && class296.method2067(0); var1++) {
        }
        if (class144.field2159 != 30) {
            return;
        }
        class318.method2216(class21.field313, 146, true);
        Object var2 = class331.field5160.field5190;
        synchronized (class331.field5160.field5190) {
            if (!class105.field1586) {
                class331.field5160.field5199 = 0;
            } else if (class303.field4727 != 0 || class331.field5160.field5199 >= 40) {
                class58.field765++;
                class21.field313.method1541(-62, 95);
                int var3 = 0;
                class21.field313.method1365(-32769, 0);
                int var4 = class21.field313.field3129;
                for (int var5 = 0; class331.field5160.field5199 > var5 && class21.field313.field3129 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class331.field5160.field5197[var5];
                    int var7 = class331.field5160.field5198[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (class331.field5160.field5197[var5] == -1 && class331.field5160.field5198[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class284.field4477 != var7 || class34.field451 != var6) {
                        int var9 = var7 - class284.field4477;
                        class284.field4477 = var7;
                        int var10 = var6 - class34.field451;
                        class34.field451 = var6;
                        if (class209.field3420 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class21.field313.method1368((class209.field3420 << 12) + (var9 << 6) + var10, 4796);
                            class209.field3420 = 0;
                        } else if (class209.field3420 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class21.field313.method1365(-32769, class209.field3420 + 128);
                            var10 += 128;
                            var9 += 128;
                            class21.field313.method1368((var9 << 8) + var10, 4796);
                            class209.field3420 = 0;
                        } else if (class209.field3420 >= 32) {
                            class21.field313.method1368(class209.field3420 + 57344, 4796);
                            if (var8) {
                                class21.field313.method1350(Integer.MIN_VALUE, -114);
                            } else {
                                class21.field313.method1350(var7 | var6 << 16, -117);
                            }
                            class209.field3420 = 0;
                        } else {
                            class21.field313.method1365(-32769, class209.field3420 + 192);
                            if (var8) {
                                class21.field313.method1350(Integer.MIN_VALUE, -52);
                            } else {
                                class21.field313.method1350(var6 << 16 | var7, -122);
                            }
                            class209.field3420 = 0;
                        }
                    } else if (class209.field3420 < 2047) {
                        class209.field3420++;
                    }
                }
                class21.field313.method1371(class21.field313.field3129 - var4, -63);
                if (var3 >= class331.field5160.field5199) {
                    class331.field5160.field5199 = 0;
                } else {
                    class331.field5160.field5199 -= var3;
                    for (int var11 = 0; var11 < class331.field5160.field5199; var11++) {
                        class331.field5160.field5198[var11] = class331.field5160.field5198[var3 + var11];
                        class331.field5160.field5197[var11] = class331.field5160.field5197[var3 + var11];
                    }
                }
            }
        }
        if (class303.field4727 != 0) {
            class66.field864++;
            long var13 = (class44.field602 - class284.field4484) / 50L;
            int var15 = class144.field2158;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class284.field4484 = class44.field602;
            int var16 = class221.field3521;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            byte var18 = 0;
            if (class303.field4727 == 2) {
                var18 = 1;
            }
            class21.field313.method1541(75, 81);
            class21.field313.method1395((byte) 0, var15 << 16 | var16);
            class21.field313.method1401(var17 | var18 << 15, -16384);
        }
        if (class22.field330 > 0) {
            class22.field330--;
        }
        if (client.field4231 && class22.field330 <= 0) {
            client.field4231 = false;
            class22.field330 = 20;
            class21.field313.method1541(68, 61);
            class21.field313.method1361((int) class329.field5112, -488903776);
            class292.field4599++;
            class21.field313.method1401((int) class312.field4862, -16384);
        }
        if (class254.field4029 && !class58.field763) {
            class58.field763 = true;
            class21.field313.method1541(84, 122);
            class21.field313.method1365(-32769, 1);
            class36.field486++;
        }
        if (!class254.field4029 && class58.field763) {
            class36.field486++;
            class58.field763 = false;
            class21.field313.method1541(-108, 122);
            class21.field313.method1365(-32769, 0);
        }
        if (!class201.field3294) {
            class21.field313.method1541(59, 77);
            class308.field4815++;
            class21.field313.method1395((byte) 0, class38.method239((byte) -125));
            class201.field3294 = true;
        }
        if (class224.field3569) {
            class224.field3569 = false;
        } else {
            class218.field3504 /= 2.0F;
        }
        if (class7.field85) {
            class7.field85 = false;
        } else {
            class144.field2156 /= 2.0F;
        }
        class333.method2296(0);
        if (class144.field2159 != 30) {
            return;
        }
        class18.method118(0);
        class219.method1604((byte) 19);
        class51.method352(3989);
        class151.field2320++;
        if (class151.field2320 > 750) {
            class319.method2222((byte) 5);
            return;
        }
        class121.method844(43);
        class232.method1672((byte) -89);
        class226.method1648(0);
        if (class119.field1829 != null) {
            class209.method1526(31338);
        }
        for (int var19 = class253.method1788(true, -64); var19 != -1; var19 = class253.method1788(false, -64)) {
            class276.method1966(var19, (byte) 82);
            class309.field4837[class200.method1465(class188.field3053++, 31)] = var19;
        }
        class179 var20 = class239.method1694(0);
        int var21 = 24 % ((arg0 + 58) / 44);
        while (var20 != null) {
            int var22 = var20.method1246(true);
            int var23 = var20.method1245(0);
            if (var22 == 1) {
                class233.field3724[var23] = var20.field2897;
                class55.field728[class200.method1465(31, class77.field1172++)] = var23;
            } else if (var22 == 2) {
                class174.field2785[var23] = var20.field2898;
                class31.field436[class200.method1465(31, class286.field4521++)] = var23;
            } else if (var22 == 3) {
                class160 var24 = class37.method238((byte) 76, var23);
                if (!var20.field2898.equals(var24.field2468)) {
                    var24.field2468 = var20.field2898;
                    class219.method1600(var24, 115);
                }
            } else if (var22 == 4) {
                class160 var41 = class37.method238((byte) 30, var23);
                int var42 = var20.field2897;
                int var43 = var20.field2889;
                int var44 = var20.field2888;
                if (var41.field2621 != var42 || var41.field2624 != var43 || var41.field2543 != var44) {
                    var41.field2543 = var44;
                    var41.field2621 = var42;
                    var41.field2624 = var43;
                    class219.method1600(var41, 100);
                }
            } else if (var22 == 5) {
                class160 var40 = class37.method238((byte) -93, var23);
                if (var20.field2897 != var40.field2596 || var20.field2897 == -1) {
                    var40.field2600 = 0;
                    var40.field2596 = var20.field2897;
                    var40.field2605 = 0;
                    var40.field2618 = 1;
                    class219.method1600(var40, 118);
                }
            } else if (var22 == 6) {
                int var34 = var20.field2897;
                int var35 = var34 >> 10 & 0x1F;
                int var36 = var34 >> 5 & 0x1F;
                int var37 = var34 & 0x1F;
                class160 var38 = class37.method238((byte) -101, var23);
                int var39 = (var37 << 3) + (var35 << 19) + (var36 << 11);
                if (var38.field2452 != var39) {
                    var38.field2452 = var39;
                    class219.method1600(var38, 123);
                }
            } else if (var22 == 7) {
                class160 var32 = class37.method238((byte) -121, var23);
                boolean var33 = var20.field2897 == 1;
                if (var33 != var32.field2581) {
                    var32.field2581 = var33;
                    class219.method1600(var32, 118);
                }
            } else if (var22 == 8) {
                class160 var31 = class37.method238((byte) -83, var23);
                if (var20.field2897 != var31.field2586 || var20.field2889 != var31.field2582 || var20.field2888 != var31.field2447) {
                    var31.field2582 = var20.field2889;
                    var31.field2447 = var20.field2888;
                    if (var31.field2572 != -1) {
                        if (var31.field2563 > 0) {
                            var31.field2447 = var31.field2447 * 32 / var31.field2563;
                        } else if (var31.field2448 > 0) {
                            var31.field2447 = var31.field2447 * 32 / var31.field2448;
                        }
                    }
                    var31.field2586 = var20.field2897;
                    class219.method1600(var31, 120);
                }
            } else if (var22 == 9) {
                class160 var25 = class37.method238((byte) -80, var23);
                if (var20.field2897 != var25.field2572 || var20.field2889 != var25.field2537) {
                    var25.field2572 = var20.field2897;
                    var25.field2537 = var20.field2889;
                    class219.method1600(var25, 115);
                }
            } else if (var22 == 10) {
                class160 var30 = class37.method238((byte) -103, var23);
                if (var20.field2897 != var30.field2555 || var20.field2889 != var30.field2521 || var20.field2888 != var30.field2520) {
                    var30.field2555 = var20.field2897;
                    var30.field2521 = var20.field2889;
                    var30.field2520 = var20.field2888;
                    class219.method1600(var30, 125);
                }
            } else if (var22 == 11) {
                class160 var26 = class37.method238((byte) -86, var23);
                var26.field2602 = var26.field2509 = var20.field2889;
                var26.field2497 = 0;
                var26.field2597 = 0;
                var26.field2595 = var26.field2518 = var20.field2897;
                class219.method1600(var26, 108);
            } else if (var22 == 12) {
                class160 var27 = class37.method238((byte) 45, var23);
                int var28 = var20.field2897;
                if (var27 != null && var27.field2608 == 0) {
                    if (var28 > var27.field2495 - var27.field2590) {
                        var28 = var27.field2495 - var27.field2590;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field2472 != var28) {
                        var27.field2472 = var28;
                        class219.method1600(var27, 97);
                    }
                }
            } else if (var22 == 13) {
                class160 var29 = class37.method238((byte) 63, var23);
                var29.field2566 = var20.field2897;
            }
            var20 = class239.method1694(0);
        }
        if (class258.field4081 != 0) {
            class233.field3728 += 20;
            if (class233.field3728 >= 400) {
                class258.field4081 = 0;
            }
        }
        class274.field4353++;
        if (class169.field2710 != null) {
            client.field4230++;
            if (client.field4230 >= 15) {
                class219.method1600(class169.field2710, 121);
                class169.field2710 = null;
            }
        }
        if (class90.field1374 != null) {
            class219.method1600(class90.field1374, 110);
            class272.field4318++;
            if (class50.field692 + 5 < class164.field2672 || (class50.field692 - 5) > class164.field2672 || class4.field35 > (class289.field4557 + 5) || (class289.field4557 - 5) > class4.field35) {
                class315.field4907 = true;
            }
            if (class342.field5335 == 0) {
                if (class315.field4907 && class272.field4318 >= 5) {
                    if (class90.field1374 == class290.field4576 && class286.field4523 != class247.field3922) {
                        class114.field1703++;
                        class160 var45 = class90.field1374;
                        byte var46 = 0;
                        if (class131.field1932 == 1 && var45.field2461 == 206) {
                            var46 = 1;
                        }
                        if (var45.field2615[class286.field4523] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1913(var45).method1166(0)) {
                            int var47 = class286.field4523;
                            int var48 = class247.field3922;
                            var45.field2615[var47] = var45.field2615[var48];
                            var45.field2559[var47] = var45.field2559[var48];
                            var45.field2615[var48] = -1;
                            var45.field2559[var48] = 0;
                        } else if (var46 == 1) {
                            int var49 = class247.field3922;
                            int var50 = class286.field4523;
                            while (var49 != var50) {
                                if (var50 < var49) {
                                    var45.method1101(var49, (byte) -27, var49 - 1);
                                    var49--;
                                } else if (var49 < var50) {
                                    var45.method1101(var49, (byte) -70, var49 + 1);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method1101(class247.field3922, (byte) -99, class286.field4523);
                        }
                        class21.field313.method1541(-80, 11);
                        class21.field313.method1368(class247.field3922, 4796);
                        class21.field313.method1370(-78, var46);
                        class21.field313.method1382(true, class90.field1374.field2446);
                        class21.field313.method1368(class286.field4523, 4796);
                    }
                } else if ((class181.field2915 == 1 || class200.method1464(126, class126.field1887 - 1)) && class126.field1887 > 2) {
                    class333.method2297(124);
                } else if (class126.field1887 > 0) {
                    class121.method841((byte) 122);
                }
                class303.field4727 = 0;
                class90.field1374 = null;
                client.field4230 = 10;
            }
        }
        class99.field1503 = 0;
        class160 var51 = class102.field1564;
        class102.field1564 = null;
        class27.field397 = null;
        class160 var52 = class242.field3840;
        class242.field3840 = null;
        class146.field2186 = false;
        class151.field2316 = false;
        while (class235.method1681((byte) 120) && class99.field1503 < 128) {
            class88.field1334[class99.field1503] = class289.field4561;
            class184.field2966[class99.field1503] = class21.field323;
            class99.field1503++;
        }
        class119.field1829 = null;
        if (class246.field3904 != -1) {
            class44.method298(0, 0, class210.field3432, (byte) -46, class246.field3904, 0, class160.field2601, 0);
        }
        class297.field4655++;
        while (true) {
            class247 var53;
            class160 var54;
            class160 var55;
            do {
                var53 = (class247) class323.field5048.method1814(-30321);
                if (var53 == null) {
                    while (true) {
                        class247 var56;
                        class160 var57;
                        class160 var58;
                        do {
                            var56 = (class247) class290.field4574.method1814(-30321);
                            if (var56 == null) {
                                while (true) {
                                    class247 var59;
                                    class160 var60;
                                    class160 var61;
                                    do {
                                        var59 = (class247) class95.field1459.method1814(-30321);
                                        if (var59 == null) {
                                            if (class119.field1829 == null) {
                                                class124.field1856 = 0;
                                            }
                                            if (class86.field1296 != null) {
                                                class128.method875(1);
                                            }
                                            if (class254.field4033 > 0 && class333.field5177[82] && class333.field5177[81] && class200.field3279 != 0) {
                                                int var62 = class148.field2209 - class200.field3279;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class3.method12((byte) 100, var62, class13.field159.field1969[0] + class181.field2925, class13.field159.field2006[0] + class24.field351);
                                            }
                                            if (class254.field4033 > 0 && class333.field5177[82] && class333.field5177[81]) {
                                                if (class209.field3412 != -1) {
                                                    class3.method12((byte) 100, class148.field2209, class181.field2925 + class209.field3412, class48.field664 + class24.field351);
                                                }
                                                class26.field375 = 0;
                                                class274.field4351 = 0;
                                            } else if (class274.field4351 == 2) {
                                                if (class209.field3412 != -1) {
                                                    class98.field1492++;
                                                    class21.field313.method1541(-96, 147);
                                                    class21.field313.method1368(class209.field3412 + class181.field2925, 4796);
                                                    class21.field313.method1395((byte) 0, class131.field1933);
                                                    class21.field313.method1401(class288.field4531, -16384);
                                                    class21.field313.method1401(class48.field664 + class24.field351, -16384);
                                                    class8.field91 = class144.field2158;
                                                    class231.field3699 = class221.field3521;
                                                    class258.field4081 = 1;
                                                    class233.field3728 = 0;
                                                }
                                                class274.field4351 = 0;
                                            } else if (class26.field375 == 2) {
                                                if (class209.field3412 != -1) {
                                                    class21.field313.method1541(61, 161);
                                                    class21.field313.method1359(-112, class181.field2925 + class209.field3412);
                                                    class189.field3068++;
                                                    class21.field313.method1359(-123, class48.field664 + class24.field351);
                                                    class8.field91 = class144.field2158;
                                                    class233.field3728 = 0;
                                                    class231.field3699 = class221.field3521;
                                                    class258.field4081 = 1;
                                                }
                                                class26.field375 = 0;
                                            } else if (class209.field3412 != -1 && class274.field4351 == 0 && class26.field375 == 0) {
                                                class184.method1264(0, (class48.field664 << 1) + 1 - class13.field159.method910(-1) >> 1, (class209.field3412 << 1) + 1 - class13.field159.method910(-1) >> 1, (byte) 127);
                                                class8.field91 = class144.field2158;
                                                class231.field3699 = class221.field3521;
                                                class233.field3728 = 0;
                                                class258.field4081 = 1;
                                            }
                                            class209.field3412 = -1;
                                            class89.method646((byte) 107);
                                            if (class102.field1564 != var51) {
                                                if (var51 != null) {
                                                    class219.method1600(var51, 108);
                                                }
                                                if (class102.field1564 != null) {
                                                    class219.method1600(class102.field1564, 116);
                                                }
                                            }
                                            if (class242.field3840 != var52 && class130.field1923 == class127.field1902) {
                                                if (var52 != null) {
                                                    class219.method1600(var52, 108);
                                                }
                                                if (class242.field3840 != null) {
                                                    class219.method1600(class242.field3840, 113);
                                                }
                                            }
                                            if (class242.field3840 == null) {
                                                if (class127.field1902 > 0) {
                                                    class127.field1902--;
                                                }
                                            } else if (class130.field1923 > class127.field1902) {
                                                class127.field1902++;
                                                if (class130.field1923 == class127.field1902) {
                                                    class219.method1600(class242.field3840, 100);
                                                }
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class97.field1487[var63]++;
                                            }
                                            int var64 = class132.method897((byte) 30);
                                            int var65 = class51.method350(64);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class233.field3726++;
                                                class34.field448 = 250;
                                                class52.method353(14500, (byte) -86);
                                                class21.field313.method1541(42, 106);
                                            }
                                            if (class240.field3791 != null && class240.field3791.field3488 == 1) {
                                                if (class240.field3791.field3490 != null) {
                                                    class60.method415(class42.field582, class38.field504, (byte) 126);
                                                }
                                                class42.field582 = null;
                                                class38.field504 = false;
                                                class240.field3791 = null;
                                            }
                                            class247.field3935++;
                                            class59.field782++;
                                            if (class59.field782 > 500) {
                                                class59.field782 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class326.field5084 += class86.field1289;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class41.field564 += class260.field4149;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class300.field4676 += class248.field3945;
                                                }
                                            }
                                            if (class41.field564 < -40) {
                                                class260.field4149 = 1;
                                            }
                                            if (class41.field564 > 40) {
                                                class260.field4149 = -1;
                                            }
                                            class41.field576++;
                                            if (class326.field5084 < -55) {
                                                class86.field1289 = 2;
                                            }
                                            if (class326.field5084 > 55) {
                                                class86.field1289 = -2;
                                            }
                                            if (class300.field4676 < -50) {
                                                class248.field3945 = 2;
                                            }
                                            if (class300.field4676 > 50) {
                                                class248.field3945 = -2;
                                            }
                                            if (class247.field3935 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class247.field3935 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class339.field5253 += class225.field3577;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class313.field4882 += class128.field1907;
                                                }
                                            }
                                            if (class313.field4882 < -20) {
                                                class128.field1907 = 1;
                                            }
                                            if (class313.field4882 > 10) {
                                                class128.field1907 = -1;
                                            }
                                            if (class339.field5253 < -60) {
                                                class225.field3577 = 2;
                                            }
                                            if (class339.field5253 > 60) {
                                                class225.field3577 = -2;
                                            }
                                            if (class41.field576 > 50) {
                                                class97.field1486++;
                                                class21.field313.method1541(-85, 251);
                                            }
                                            if (class166.field2686) {
                                                class185.method1271(6);
                                                class166.field2686 = false;
                                            }
                                            try {
                                                if (class69.field901 != null && class21.field313.field3129 > 0) {
                                                    class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, class21.field313.field3129);
                                                    class21.field313.field3129 = 0;
                                                    class41.field576 = 0;
                                                }
                                            } catch (IOException var69) {
                                                class319.method2222((byte) 5);
                                            }
                                            return;
                                        }
                                        var60 = var59.field3931;
                                        if (var60.field2456 < 0) {
                                            break;
                                        }
                                        var61 = class37.method238((byte) 78, var60.field2544);
                                    } while (var61 == null || var61.field2459 == null || var61.field2459.length <= var60.field2456 || var61.field2459[var60.field2456] != var60);
                                    class69.method455(var59, (byte) -64);
                                }
                            }
                            var57 = var56.field3931;
                            if (var57.field2456 < 0) {
                                break;
                            }
                            var58 = class37.method238((byte) -122, var57.field2544);
                        } while (var58 == null || var58.field2459 == null || var58.field2459.length <= var57.field2456 || var58.field2459[var57.field2456] != var57);
                        class69.method455(var56, (byte) -64);
                    }
                }
                var54 = var53.field3931;
                if (var54.field2456 < 0) {
                    break;
                }
                var55 = class37.method238((byte) 70, var54.field2544);
            } while (var55 == null || var55.field2459 == null || var54.field2456 >= var55.field2459.length || var55.field2459[var54.field2456] != var54);
            class69.method455(var53, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 1124)
    public static final void method1885(int arg0, int arg1) {
        int var2 = class74.field983;
        int var3 = class161.field2644;
        field4181++;
        int var4 = class27.field388;
        int var5 = class185.field2971;
        int var6 = class281.field4425;
        int var7 = (int) class312.field4862 + class41.field564 & 0x7FF;
        int var8 = (int) class329.field5112;
        if (var8 < (class114.field1717 / 256)) {
            var8 = class114.field1717 / 256;
        }
        if (arg1 != -93) {
            return;
        }
        if (class36.field483[4] && var8 < (class236.field3740[4] + 128)) {
            var8 = class236.field3740[4] + 128;
        }
        class48.method330(var7, class131.field1935, class227.method1653(class13.field159.field1980, class13.field159.field1944, arg1 - 12189, class148.field2209) - 50, var8 * 3 + 600, var8, (byte) -96, arg0, class255.field4045);
        if (class74.field983 == var2 && class161.field2644 == var3 && class27.field388 == var4 && class281.field4425 == var6 && class185.field2971 == var5) {
            class282.field4461 = 1;
            return;
        }
        class93.field1442 = 10;
        class62.field815 = 10;
        class286.field4522 = 10;
        if (var6 < class281.field4425) {
            var6 += (class281.field4425 - var6) * class93.field1442 / 1000 + class286.field4522;
            if (var6 < class281.field4425) {
                class281.field4425 = var6;
            }
        }
        class240.field3800 = 10;
        if (var6 > class281.field4425) {
            int var9 = var6 - ((var6 - class281.field4425) * class93.field1442 / 1000 + class286.field4522);
            if (class281.field4425 < var9) {
                class281.field4425 = var9;
            }
        }
        if (var3 < class161.field2644) {
            var3 += (class161.field2644 - var3) * class62.field815 / 1000 + class240.field3800;
            if (class161.field2644 > var3) {
                class161.field2644 = var3;
            }
        }
        if (var3 > class161.field2644) {
            int var10 = var3 - ((var3 - class161.field2644) * class62.field815 / 1000 + class240.field3800);
            if (var10 > class161.field2644) {
                class161.field2644 = var10;
            }
        }
        if (class27.field388 > var4) {
            var4 += (class27.field388 - var4) * class62.field815 / 1000 + class240.field3800;
            if (var4 < class27.field388) {
                class27.field388 = var4;
            }
        }
        int var11 = class185.field2971 - var5;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var4 > class27.field388) {
            int var12 = var4 - ((var4 - class27.field388) * class62.field815 / 1000 + class240.field3800);
            if (class27.field388 < var12) {
                class27.field388 = var12;
            }
        }
        if (var11 < -1024) {
            var11 += 2048;
        }
        if (var11 > 0) {
            int var13 = class286.field4522 + (class93.field1442 * var11 / 1000) + var5;
            var5 = var13 & 0x7FF;
        }
        if (var11 < 0) {
            int var14 = var5 - (-var11 * class93.field1442 / 1000 + class286.field4522);
            var5 = var14 & 0x7FF;
        }
        int var15 = class185.field2971 - var5;
        if (class74.field983 > var2) {
            var2 += (class74.field983 - var2) * class62.field815 / 1000 + class240.field3800;
            if (var2 < class74.field983) {
                class74.field983 = var2;
            }
        }
        if (var2 > class74.field983) {
            int var16 = var2 - (class240.field3800 + ((var2 - class74.field983) * class62.field815 / 1000));
            if (class74.field983 < var16) {
                class74.field983 = var16;
            }
        }
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 >= 0 || var11 <= 0 || var15 > 0 && var11 < 0) {
            class185.field2971 = var5;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 1275)
    public static final void method1886(byte arg0) {
        class282.field4449 = null;
        field4180++;
        int var1 = 76 / ((-arg0 - 28) / 55);
        class222.method1616((byte) 89, 0, 0, class160.field2601, -1, class210.field3432, 0, class246.field3904, 0);
        if (class282.field4449 != null) {
            class219.method1606(class169.field2708, (byte) 127, class282.field4449, class160.field2601, class341.field5315.field2574, class19.field276, 0, -1412584499, class210.field3432, 0);
            class282.field4449 = null;
        }
    }
}
