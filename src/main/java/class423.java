import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class423 extends class118 {

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Lnn;")
    public static class151 field6221 = new class151(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Llq;")
    public static class5 field6225 = new class5();

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Lnn;")
    public static class151 field6226 = new class151("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field6227 = -1;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[I")
    public static int[] field6228 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lpf;")
    public static class425 field6229 = new class425(32, 7);

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[[Z")
    public static boolean[][] field6230;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field6220;
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (super.field1549.field4903) {
            int[] var4 = this.method703(2, arg1, -2);
            int[][] var5 = this.method708(arg1, (byte) -127, 0);
            int[][] var6 = this.method708(arg1, (byte) 86, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class440.field6474; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIII)V")
    public static final void method2609(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field6224;
        if (class345.method2100(-1, arg2)) {
            if (arg3 != 2109192076) {
                field6221 = null;
            }
            class198.method1184(true, arg0, arg4, class130.field1650[arg2], -1, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class423() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public static final void method2610(byte arg0) {
        ++field6218;
        if (~class85.field1127 < -2) {
            --class85.field1127;
            class277.field4212 = class172.field2639;
        }
        if (~class188.field2815 < -1) {
            --class188.field2815;
        }
        if (class351.field5208) {
            class351.field5208 = false;
            class81.method522(20);
        } else {
            if (!class306.field4628) {
                class447.method2758(0);
            }
            for (int var1 = 0; ~var1 > -101 && class390.method2408(arg0 ^ -105); ++var1) {
            }
            if (class19.field263 == 30) {
                class418.method2600(class189.field2840, class333.field4968.method2618((byte) -31), arg0 + 105);
                if (class303.field4580 == null) {
                    if (class445.method2750(-27580) >= class174.field2663) {
                        class303.field4580 = class410.field6112.method1706(arg0 ^ -29023, class228.field3490);
                    }
                } else if (~class303.field4580.field341 != 0) {
                    class177.method1082(class106.field1414, 0);
                    class189.field2840.method2377(class303.field4580.field341, -94);
                    class303.field4580 = null;
                    class174.field2663 = 30000L + class445.method2750(-27580);
                }
                if (class465.field6850 != null || ~(class445.method2750(arg0 ^ 27603) + -2000L) < ~class120.field1582) {
                    boolean var2 = false;
                    int var3 = class189.field2840.field5666;
                    for (class281 var4 = (class281) class195.field2952.method2514((byte) 61); var4 != null && ~(class189.field2840.field5666 - var3) > -241; var4 = (class281) class195.field2952.method2511(-107)) {
                        var4.method625((byte) -50);
                        int var5 = var4.method465((byte) -106);
                        if (~var5 > -1) {
                            var5 = 0;
                        } else if (~var5 < -65535) {
                            var5 = 65534;
                        }
                        int var6 = var4.method467(9);
                        if (~var6 > -1) {
                            var6 = 0;
                        } else if (~var6 < -65535) {
                            var6 = 65534;
                        }
                        boolean var7 = false;
                        if (~var4.method465((byte) -83) == 0 && var4.method467(9) == -1) {
                            var5 = -1;
                            var6 = -1;
                            var7 = true;
                        }
                        if (class136.field1833 != var6 || class427.field6293 != var5) {
                            if (!var2) {
                                class177.method1082(class375.field5473, 0);
                                ++class57.field755;
                                class189.field2840.method2366(0, true);
                                var3 = class189.field2840.field5666;
                                var2 = true;
                            }
                            int var8 = -class136.field1833 + var6;
                            class136.field1833 = var6;
                            int var9 = -class427.field6293 + var5;
                            class427.field6293 = var5;
                            int var10 = (int) ((var4.method460(-7904) - class120.field1582) / 20L);
                            if (var10 < 8 && var8 >= -32 && ~var8 >= -32 && ~var9 <= 31 && ~var9 >= -32) {
                                var9 += 32;
                                var8 += 32;
                                class189.field2840.method2377((var10 << 12) + (var8 << 6) + var9, -26);
                            } else if (~var10 > -33 && ~var8 <= 127 && ~var8 >= -128 && ~var9 <= 127 && var9 <= 127) {
                                class189.field2840.method2366(128 - -var10, true);
                                var9 += 128;
                                var8 += 128;
                                class189.field2840.method2377((var8 << 8) - -var9, -36);
                            } else if (var10 >= 32) {
                                class189.field2840.method2377(57344 - -var10, arg0 ^ 18);
                                if (!var7) {
                                    class189.field2840.method2381(var5 << 16 | var6, arg0 ^ -105);
                                } else {
                                    class189.field2840.method2381(Integer.MIN_VALUE, 0);
                                }
                            } else {
                                class189.field2840.method2366(var10 + 192, true);
                                if (!var7) {
                                    class189.field2840.method2381(var6 | var5 << 16, 0);
                                } else {
                                    class189.field2840.method2381(Integer.MIN_VALUE, 0);
                                }
                            }
                            class120.field1582 = var4.method460(arg0 ^ 7863);
                        }
                    }
                    if (var2) {
                        class189.field2840.method2331(-var3 + class189.field2840.field5666, 65536);
                    }
                }
                if (class465.field6850 != null) {
                    long var11 = (class465.field6850.method460(arg0 ^ 7863) - class458.field6794) / 50L;
                    if (var11 > 32767L) {
                        var11 = 32767L;
                    }
                    class458.field6794 = class465.field6850.method460(-7904);
                    int var13 = class465.field6850.method465((byte) -91);
                    if (~var13 > -1) {
                        var13 = 0;
                    } else if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = class465.field6850.method467(9);
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    byte var15 = 0;
                    if (~class465.field6850.method461(78) == -3) {
                        var15 = 1;
                    }
                    int var16 = (int) var11;
                    ++class173.field2651;
                    class177.method1082(class275.field4204, 0);
                    class189.field2840.method2340((byte) -98, var15 << 15 | var16);
                    class189.field2840.method2357(var14 | var13 << 16, (byte) -125);
                }
                if (~class296.field4495 < -1) {
                    int var17 = 0;
                    for (int var18 = 0; ~var18 > ~class296.field4495; ++var18) {
                        if (class43.field542[var18].method1074(125)) {
                            ++var17;
                        }
                    }
                    if (~var17 < -1) {
                        ++class131.field1668;
                        if (var17 > 75) {
                            var17 = 75;
                        }
                        class177.method1082(class365.field5366, 0);
                        class189.field2840.method2366(var17 * 3, true);
                        for (int var19 = 0; ~class296.field4495 < ~var19; ++var19) {
                            class174 var20 = class43.field542[var19];
                            if (var20.method1074(-105)) {
                                long var21 = (var20.method1066(-72) + -class302.field4568) / 50L;
                                if (var21 > 65535L) {
                                    var21 = 65535L;
                                }
                                class302.field4568 = var20.method1066(arg0 + -2);
                                class189.field2840.method2366(var20.method1067(arg0 + -15), true);
                                class189.field2840.method2377((int) var21, -27);
                            }
                        }
                    }
                }
                if (~class201.field3036 < -1) {
                    --class201.field3036;
                }
                if (class424.field6235 && class201.field3036 <= 0) {
                    class424.field6235 = false;
                    class201.field3036 = 20;
                    ++class49.field620;
                    class177.method1082(class243.field3645, 0);
                    class189.field2840.method2334((int) class462.field6810 >> 3, 1833667168);
                    class189.field2840.method2334((int) class188.field2811 >> 3, arg0 + 1833667273);
                }
                if (class351.field5211 && !class94.field1309) {
                    class94.field1309 = true;
                    ++class241.field3615;
                    class177.method1082(class45.field564, 0);
                    class189.field2840.method2366(1, true);
                }
                if (!class351.field5211 && class94.field1309) {
                    class94.field1309 = false;
                    ++class241.field3615;
                    class177.method1082(class45.field564, arg0 ^ -105);
                    class189.field2840.method2366(0, true);
                }
                if (!class57.field768) {
                    class177.method1082(class251.field3760, 0);
                    ++class313.field4720;
                    class189.field2840.method2381(class334.method2045(arg0 ^ 2073204195), 0);
                    class57.field768 = true;
                }
                if (class277.field4216 != null) {
                    if (~class80.field1054 != -3) {
                        if (class80.field1054 == 3) {
                            class172.method1059(arg0 + 106);
                        }
                    } else {
                        class137.method863(16384);
                    }
                }
                if (!class34.field423) {
                    class228.field3472 /= 2.0F;
                } else {
                    class34.field423 = false;
                }
                if (class351.field5206) {
                    class351.field5206 = false;
                } else {
                    class1.field16 /= 2.0F;
                }
                class310.method1888(1179648);
                if (class19.field263 == 30) {
                    class265.method1643(arg0 + 205316305);
                    class72.method478((byte) 79);
                    class430.method2643(79);
                    ++class138.field1870;
                    if (~class138.field1870 < -751) {
                        class81.method522(arg0 + 191);
                    } else {
                        class390.method2406((byte) -103);
                        class219.method1331(true);
                        class307.method1884(-1);
                        for (int var23 = class3.method19(true, -125); var23 != -1; var23 = class3.method19(false, -120)) {
                            class454.method2823(6, var23);
                            class463.field6824[class406.method2552(class463.field6825++, 31)] = var23;
                        }
                        for (class32 var24 = class196.method1175(0); var24 != null; var24 = class196.method1175(0)) {
                            int var25 = var24.method193(arg0 + 964287689);
                            int var26 = var24.method187((byte) -63);
                            if (var25 != 1) {
                                if (~var25 == -3) {
                                    class403.field6013[var26] = var24.field408;
                                    class315.field4773[class406.method2552(31, class341.field5084++)] = var26;
                                } else if (var25 != 3) {
                                    if (var25 != 4) {
                                        if (~var25 != -6) {
                                            if (var25 != 6) {
                                                if (~var25 != -8) {
                                                    if (var25 != 8) {
                                                        if (~var25 != -10) {
                                                            if (var25 != 10) {
                                                                if (var25 == 11) {
                                                                    class170 var27 = class168.method1020(var26, (byte) 82);
                                                                    var27.field2530 = 0;
                                                                    var27.field2478 = var27.field2615 = var24.field412;
                                                                    var27.field2614 = 0;
                                                                    var27.field2476 = var27.field2523 = var24.field404;
                                                                    class405.method2543(var27, 127);
                                                                } else if (~var25 == -13) {
                                                                    class170 var28 = class168.method1020(var26, (byte) 69);
                                                                    int var29 = var24.field404;
                                                                    if (var28 != null && var28.field2558 == 0) {
                                                                        if (-var28.field2501 + var28.field2598 < var29) {
                                                                            var29 = -var28.field2501 + var28.field2598;
                                                                        }
                                                                        if (var29 < 0) {
                                                                            var29 = 0;
                                                                        }
                                                                        if (~var28.field2559 != ~var29) {
                                                                            var28.field2559 = var29;
                                                                            class405.method2543(var28, 125);
                                                                        }
                                                                    }
                                                                } else if (~var25 != -15) {
                                                                    if (~var25 == -16) {
                                                                        class452.field6685 = var24.field412;
                                                                        class381.field5557 = true;
                                                                        class8.field80 = var24.field404;
                                                                    } else if (~var25 == -17) {
                                                                        class170 var30 = class168.method1020(var26, (byte) 104);
                                                                        var30.field2617 = var24.field404;
                                                                    }
                                                                } else {
                                                                    class170 var31 = class168.method1020(var26, (byte) 109);
                                                                    var31.field2574 = var24.field404;
                                                                }
                                                            } else {
                                                                class170 var32 = class168.method1020(var26, (byte) 94);
                                                                if (~var24.field404 != ~var32.field2510 || var24.field412 != var32.field2623 || var24.field400 != var32.field2484) {
                                                                    var32.field2510 = var24.field404;
                                                                    var32.field2623 = var24.field412;
                                                                    var32.field2484 = var24.field400;
                                                                    class405.method2543(var32, arg0 ^ -24);
                                                                }
                                                            }
                                                        } else {
                                                            class170 var33 = class168.method1020(var26, (byte) 123);
                                                            if (~var24.field404 != ~var33.field2592 || ~var24.field412 != ~var33.field2545) {
                                                                var33.field2592 = var24.field404;
                                                                var33.field2545 = var24.field412;
                                                                class405.method2543(var33, arg0 ^ -23);
                                                            }
                                                        }
                                                    } else {
                                                        class170 var34 = class168.method1020(var26, (byte) 125);
                                                        if (var24.field404 != var34.field2620 || ~var24.field412 != ~var34.field2587 || var24.field400 != var34.field2538) {
                                                            var34.field2587 = var24.field412;
                                                            var34.field2620 = var24.field404;
                                                            var34.field2538 = var24.field400;
                                                            if (var34.field2592 != -1) {
                                                                if (~var34.field2599 >= -1) {
                                                                    if (var34.field2491 > 0) {
                                                                        var34.field2538 = var34.field2538 * 32 / var34.field2491;
                                                                    }
                                                                } else {
                                                                    var34.field2538 = var34.field2538 * 32 / var34.field2599;
                                                                }
                                                            }
                                                            class405.method2543(var34, arg0 ^ -23);
                                                        }
                                                    }
                                                } else {
                                                    class170 var35 = class168.method1020(var26, (byte) 88);
                                                    boolean var36 = var24.field404 == 1;
                                                    if (var35.field2573 != var36) {
                                                        var35.field2573 = var36;
                                                        class405.method2543(var35, 126);
                                                    }
                                                }
                                            } else {
                                                int var37 = var24.field404;
                                                int var38 = (var37 & 32749) >> 10;
                                                int var39 = (var37 & 1007) >> 5;
                                                int var40 = 31 & var37;
                                                int var41 = (var38 << 19) + (var40 << 3) - -(var39 << 11);
                                                class170 var42 = class168.method1020(var26, (byte) 71);
                                                if (var42.field2589 != var41) {
                                                    var42.field2589 = var41;
                                                    class405.method2543(var42, 126);
                                                }
                                            }
                                        } else {
                                            class170 var43 = class168.method1020(var26, (byte) 97);
                                            if (~var24.field404 != ~var43.field2576 || var24.field404 == -1) {
                                                var43.field2489 = 0;
                                                var43.field2619 = 1;
                                                var43.field2576 = var24.field404;
                                                var43.field2609 = 0;
                                                class405.method2543(var43, 124);
                                            }
                                        }
                                    } else {
                                        class170 var44 = class168.method1020(var26, (byte) 71);
                                        int var45 = var24.field404;
                                        int var46 = var24.field412;
                                        int var47 = var24.field400;
                                        if (var44.field2606 != var45 || ~var44.field2616 != ~var46 || var44.field2604 != var47) {
                                            var44.field2606 = var45;
                                            var44.field2604 = var47;
                                            var44.field2616 = var46;
                                            class405.method2543(var44, 124);
                                        }
                                    }
                                } else {
                                    class170 var48 = class168.method1020(var26, (byte) 100);
                                    if (!var24.field408.equals(var48.field2568)) {
                                        var48.field2568 = var24.field408;
                                        class405.method2543(var48, 125);
                                    }
                                }
                            } else {
                                class413.field6135[var26] = var24.field404;
                                class26.field346 |= class14.field174[var26];
                                class438.field6453[class406.method2552(31, class121.field1598++)] = var26;
                            }
                        }
                        if (class268.field4081 != 0) {
                            class330.field4940 += 20;
                            if (~class330.field4940 <= -401) {
                                class268.field4081 = 0;
                            }
                        }
                        ++class342.field5118;
                        if (class81.field1076 != null) {
                            ++class108.field1437;
                            if (~class108.field1437 <= -16) {
                                class405.method2543(class81.field1076, 126);
                                class81.field1076 = null;
                            }
                        }
                        class406.field6040 = false;
                        if (arg0 == -105) {
                            class405.field6031 = null;
                            class72.field956 = false;
                            class288.field4381 = null;
                            class145.method912((class170) null, -1, -1, (byte) -16);
                            class398.method2518(1, -1, (class170) null, -1);
                            class168.method1024(-12);
                            ++class172.field2639;
                            if (class359.field5311) {
                                class177.method1082(class217.field3292, 0);
                                ++class328.field4925;
                                class189.field2840.method2344(arg0 ^ -152, class233.field3522 << 28 | class97.field1343 << 14 | class427.field6295);
                                class359.field5311 = false;
                            }
                            while (true) {
                                class327 var49;
                                class170 var50;
                                class170 var51;
                                do {
                                    var49 = (class327) class212.field3185.method2509(false);
                                    if (var49 == null) {
                                        while (true) {
                                            class327 var52;
                                            class170 var53;
                                            class170 var54;
                                            do {
                                                var52 = (class327) class453.field6703.method2509(false);
                                                if (var52 == null) {
                                                    while (true) {
                                                        class327 var55;
                                                        class170 var56;
                                                        class170 var57;
                                                        do {
                                                            var55 = (class327) class431.field6330.method2509(false);
                                                            if (var55 == null) {
                                                                if (class288.field4381 == null) {
                                                                    class462.field6819 = 0;
                                                                }
                                                                if (class14.field173 != null) {
                                                                    class17.method119(-36);
                                                                }
                                                                if (~class143.field1912 < -1 && class185.field2786.method578(false, 82) && class185.field2786.method578(false, 81) && ~class91.field1286 != -1) {
                                                                    int var58 = class113.field1500.field1902 - class91.field1286;
                                                                    if (~var58 <= -1) {
                                                                        if (var58 > 3) {
                                                                            var58 = 3;
                                                                        }
                                                                    } else {
                                                                        var58 = 0;
                                                                    }
                                                                    class367.method2205(class112.field1487 - -class113.field1500.field2018[0], var58, (byte) -62, class113.field1500.field2019[0] + class17.field250);
                                                                }
                                                                class365.method2193(96);
                                                                for (int var59 = 0; var59 < 5; ++var59) {
                                                                    int var10002 = class427.field6288[var59]++;
                                                                }
                                                                if (class26.field346 && ~class250.field3749 > ~(-60000L + class445.method2750(arg0 ^ 27603))) {
                                                                    class5.method46((byte) -120);
                                                                }
                                                                ++class429.field6313;
                                                                if (class429.field6313 > 500) {
                                                                    class429.field6313 = 0;
                                                                    int var60 = (int) (Math.random() * 8.0D);
                                                                    if ((var60 & 4) == 4) {
                                                                        class240.field3601 += class377.field5497;
                                                                    }
                                                                    if ((var60 & 2) == 2) {
                                                                        class97.field1341 += class213.field3197;
                                                                    }
                                                                    if ((1 & var60) == 1) {
                                                                        class324.field4872 += class429.field6308;
                                                                    }
                                                                }
                                                                if (class324.field4872 < -50) {
                                                                    class429.field6308 = 2;
                                                                }
                                                                if (~class97.field1341 > 54) {
                                                                    class213.field3197 = 2;
                                                                }
                                                                if (class324.field4872 > 50) {
                                                                    class429.field6308 = -2;
                                                                }
                                                                if (~class97.field1341 < -56) {
                                                                    class213.field3197 = -2;
                                                                }
                                                                if (~class240.field3601 > 39) {
                                                                    class377.field5497 = 1;
                                                                }
                                                                ++class441.field6486;
                                                                if (class240.field3601 > 40) {
                                                                    class377.field5497 = -1;
                                                                }
                                                                if (class441.field6486 > 500) {
                                                                    class441.field6486 = 0;
                                                                    int var61 = (int) (8.0D * Math.random());
                                                                    if (~(var61 & 2) == -3) {
                                                                        class343.field5138 += class453.field6725;
                                                                    }
                                                                    if ((var61 & 1) == 1) {
                                                                        class3.field39 += class245.field3666;
                                                                    }
                                                                }
                                                                if (class3.field39 < -60) {
                                                                    class245.field3666 = 2;
                                                                }
                                                                if (~class343.field5138 > 19) {
                                                                    class453.field6725 = 1;
                                                                }
                                                                if (~class3.field39 < -61) {
                                                                    class245.field3666 = -2;
                                                                }
                                                                if (class343.field5138 > 10) {
                                                                    class453.field6725 = -1;
                                                                }
                                                                ++class407.field6066;
                                                                if (~class407.field6066 < -51) {
                                                                    class177.method1082(class402.field5989, arg0 + 105);
                                                                    ++class334.field4978;
                                                                }
                                                                if (class339.field5052) {
                                                                    class20.method128(false);
                                                                    class339.field5052 = false;
                                                                }
                                                                try {
                                                                    if (class301.field4543 != null && class189.field2840.field5666 > 0) {
                                                                        class301.field4543.method2164(0, (byte) -35, class189.field2840.field5666, class189.field2840.field5685);
                                                                        class407.field6066 = 0;
                                                                        class189.field2840.field5666 = 0;
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (IOException var62) {
                                                                    class81.method522(-114);
                                                                    return;
                                                                }
                                                            }
                                                            var56 = var55.field4909;
                                                            if (var56.field2511 < 0) {
                                                                break;
                                                            }
                                                            var57 = class168.method1020(var56.field2474, (byte) 73);
                                                        } while (var57 == null || var57.field2625 == null || ~var57.field2625.length >= ~var56.field2511 || var57.field2625[var56.field2511] != var56);
                                                        class384.method2316(var55);
                                                    }
                                                }
                                                var53 = var52.field4909;
                                                if (~var53.field2511 > -1) {
                                                    break;
                                                }
                                                var54 = class168.method1020(var53.field2474, (byte) 78);
                                            } while (var54 == null || var54.field2625 == null || var53.field2511 >= var54.field2625.length || var54.field2625[var53.field2511] != var53);
                                            class384.method2316(var52);
                                        }
                                    }
                                    var50 = var49.field4909;
                                    if (~var50.field2511 > -1) {
                                        break;
                                    }
                                    var51 = class168.method1020(var50.field2474, (byte) 89);
                                } while (var51 == null || var51.field2625 == null || var51.field2625.length <= var50.field2511 || var51.field2625[var50.field2511] != var50);
                                class384.method2316(var49);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg0 != 1) {
            field6221 = null;
        }
        ++field6223;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, arg1, arg0 + -3);
            int[] var5 = this.method703(1, arg1, -2);
            int[] var6 = this.method703(2, arg1, -2);
            for (int var7 = 0; class440.field6474 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            this.method195(false, -86);
        }
        ++field6219;
        if (~arg0 == -1) {
            super.field1552 = arg2.method2343(255) == 1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method2611(int arg0, int arg1) {
        if (arg0 > 90) {
            ++field6222;
            class32 var2 = class136.method854(14, (byte) 108, arg1);
            var2.method192(-17451);
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method2612(int arg0) {
        field6226 = null;
        field6228 = null;
        field6230 = null;
        if (arg0 != -11317) {
            field6231 = 100;
        }
        field6229 = null;
        field6221 = null;
        field6225 = null;
    }
}
