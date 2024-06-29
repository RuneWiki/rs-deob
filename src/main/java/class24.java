import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class24 extends class335 {

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    private int field284 = 6;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "Luda;")
    public static class549 field282 = new class549();

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "Luf;")
    public static class380 field286 = new class380(64);

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "Ltt;")
    public static class338 field289 = new class338(43, 3);

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "Lbda;")
    public static class437 field287;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "Lff;")
    public static class519 field291;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lge;BII)J")
    public static final long method139(class599 arg0, byte arg1, int arg2, int arg3) {
        ++field285;
        if (arg1 < 65) {
            return -16L;
        } else {
            long var4 = 4194304L;
            long var6 = Long.MIN_VALUE;
            class600 var8 = class118.field1510.method3921(arg0.method710((byte) 56), -56);
            long var9 = (long) (1073741824 | arg2 | arg3 << 7 | arg0.method699((byte) -50) << 14 | arg0.method706(16259) << 20);
            if (~var8.field8293 == -1) {
                var9 |= var6;
            }
            if (~var8.field8322 == -2) {
                var9 |= var4;
            }
            return var9 | (long) arg0.method710((byte) 72) << 32;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
    public static final void method140(byte arg0) {
        ++field283;
        if (~class422.field5543 < -2) {
            --class422.field5543;
            class99.field1198 = class155.field2183;
        }
        if (class447.field5920) {
            class447.field5920 = false;
            class284.method1685(0);
        } else {
            if (!class674.field9590) {
                class541.method3033((byte) 52);
            }
            for (int var1 = 0; ~var1 > -101 && class204.method1308(true); ++var1) {
            }
            if (class576.field7861 == 10) {
                while (class704.method3953(124)) {
                    class229 var2 = class97.method550(class71.field841, false, class239.field3168);
                    var2.field2971.method915(-31914, 0);
                    int var3 = var2.field2971.field2219;
                    class681.method3876((byte) -56, var2.field2971);
                    var2.field2971.method948(-9911, -var3 + var2.field2971.field2219);
                    class307.method1805(var2, -14704);
                }
                if (class506.field6984 != null) {
                    if (class506.field6984.field3853 != -1) {
                        class229 var4 = class97.method550(class71.field841, false, class431.field5795);
                        var4.field2971.method918(24551, class506.field6984.field3853);
                        class307.method1805(var4, -14704);
                        class506.field6984 = null;
                        class647.field8939 = class529.method2982((byte) -69) - -30000L;
                    }
                } else if (class529.method2982((byte) -69) >= class647.field8939) {
                    class506.field6984 = class371.field4943.method2833(class540.field7409.field3772, (byte) 106);
                }
                class294 var5 = (class294) class58.field743.method2506(68);
                if (var5 != null || ~class79.field934 > ~(class529.method2982((byte) -69) + -2000L)) {
                    class229 var6 = null;
                    int var7 = 0;
                    for (class294 var8 = (class294) class469.field6296.method2506(68); var8 != null && (var6 == null || ~(-var7 + var6.field2971.field2219) > -241); var8 = (class294) class469.field6296.method2505(-125)) {
                        var8.method242(true);
                        int var9 = var8.method451((byte) -97);
                        if (~var9 <= 0) {
                            if (~var9 < -65535) {
                                var9 = 65534;
                            }
                        } else {
                            var9 = -1;
                        }
                        int var10 = var8.method454(-3);
                        if (var10 < -1) {
                            var10 = -1;
                        } else if (var10 > 65534) {
                            var10 = 65534;
                        }
                        if (~class184.field2563 != ~var10 || class49.field577 != var9) {
                            if (var6 == null) {
                                ++class582.field7959;
                                var6 = class97.method550(class71.field841, false, class587.field8105);
                                var6.field2971.method915(-31914, 0);
                                var7 = var6.field2971.field2219;
                            }
                            int var11 = -class184.field2563 + var10;
                            class184.field2563 = var10;
                            int var12 = -class49.field577 + var9;
                            class49.field577 = var9;
                            int var13 = (int) ((var8.method453((byte) -61) - class79.field934) / 20L);
                            if (~var13 > -9 && ~var11 <= 31 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                var6.field2971.method918(24551, (var11 << 6) + (var13 << 12) + var12);
                            } else if (~var13 > -33 && ~var11 <= 127 && ~var11 >= -128 && var12 >= -128 && ~var12 >= -128) {
                                var11 += 128;
                                var6.field2971.method915(-31914, var13 + 128);
                                var12 += 128;
                                var6.field2971.method918(24551, (var11 << 8) + var12);
                            } else if (~var13 > -33) {
                                var6.field2971.method915(-31914, var13 + 192);
                                if (~var10 != -2 && var9 != -1) {
                                    var6.field2971.method958(0, var10 | var9 << 16);
                                } else {
                                    var6.field2971.method958(0, Integer.MIN_VALUE);
                                }
                            } else {
                                var6.field2971.method918(24551, var13 + 57344);
                                if (~var10 != -2 && var9 != -1) {
                                    var6.field2971.method958(0, var9 << 16 | var10);
                                } else {
                                    var6.field2971.method958(0, Integer.MIN_VALUE);
                                }
                            }
                            class79.field934 = var8.method453((byte) -61);
                        }
                    }
                    if (var6 != null) {
                        var6.field2971.method948(-9911, -var7 + var6.field2971.field2219);
                        class307.method1805(var6, -14704);
                    }
                }
                if (var5 != null) {
                    long var14 = (var5.method453((byte) -61) + -class27.field399) / 50L;
                    class27.field399 = var5.method453((byte) -61);
                    if (~var14 < -32768L) {
                        var14 = 32767L;
                    }
                    int var16 = var5.method451((byte) -61);
                    if (~var16 <= -1) {
                        if (~var16 < -65536) {
                            var16 = 65535;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = var5.method454(-3);
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (~var17 < -65536) {
                        var17 = 65535;
                    }
                    byte var18 = 0;
                    if (~var5.method452(false) == -3) {
                        var18 = 1;
                    }
                    int var19 = (int) var14;
                    ++class425.field5742;
                    class229 var20 = class97.method550(class71.field841, false, class631.field8735);
                    var20.field2971.method957(-18807, var17 | var16 << 16);
                    var20.field2971.method939(var18 << 15 | var19, (byte) 58);
                    class307.method1805(var20, -14704);
                }
                if (field290 > 0) {
                    ++class610.field8472;
                    class229 var21 = class97.method550(class71.field841, false, class535.field7349);
                    var21.field2971.method915(-31914, field290 * 3);
                    for (int var22 = 0; var22 < field290; ++var22) {
                        class477 var23 = class266.field3461[var22];
                        long var24 = (var23.method2748(28704) - class118.field1511) / 50L;
                        class118.field1511 = var23.method2748(28704);
                        if (~var24 < -65536L) {
                            var24 = 65535L;
                        }
                        var21.field2971.method915(-31914, var23.method2749(-103));
                        var21.field2971.method918(24551, (int) var24);
                    }
                    class307.method1805(var21, -14704);
                }
                if (class53.field678 > 0) {
                    --class53.field678;
                }
                if (class634.field8770 && class53.field678 <= 0) {
                    class53.field678 = 20;
                    class634.field8770 = false;
                    ++class490.field6785;
                    class229 var26 = class97.method550(class71.field841, false, class110.field1301);
                    var26.field2971.method918(24551, (int) class565.field7707 >> 3);
                    var26.field2971.method946((byte) -77, (int) class475.field6610 >> 3);
                    class307.method1805(var26, -14704);
                }
                if (class327.field4400 != class188.field2616) {
                    class188.field2616 = class327.field4400;
                    ++class333.field4483;
                    class229 var27 = class97.method550(class71.field841, false, class231.field3065);
                    var27.field2971.method915(-31914, !class327.field4400 ? 0 : 1);
                    class307.method1805(var27, -14704);
                }
                if (!class375.field4974) {
                    ++class225.field2927;
                    class229 var28 = class97.method550(class71.field841, false, class122.field1598);
                    var28.field2971.method915(-31914, 0);
                    int var29 = var28.field2971.field2219;
                    class157 var30 = new class157(class188.method1245(-18302));
                    class602.field8408.method1869((byte) 122, var30);
                    var28.field2971.method949(var30.field2199, var30.field2219, 0, (byte) 126);
                    var28.field2971.method948(-9911, -var29 + var28.field2971.field2219);
                    class307.method1805(var28, -14704);
                    class375.field4974 = true;
                }
                if (class153.field2168 != null) {
                    if (~class311.field4200 != -3) {
                        if (class311.field4200 == 3) {
                            class686.method3881(2048);
                        }
                    } else {
                        class270.method1612((byte) 101);
                    }
                }
                if (!class228.field2962) {
                    class635.field8787 /= 2.0F;
                } else {
                    class228.field2962 = false;
                }
                if (!class543.field7438) {
                    class340.field4574 /= 2.0F;
                } else {
                    class543.field7438 = false;
                }
                class595.method3306(11);
                if (~class576.field7861 == -11) {
                    class669.method3800((byte) -82);
                    class293.method1734(7061);
                    class458.method2572(100);
                    ++class220.field2872;
                    if (class220.field2872 > 750) {
                        class284.method1685(0);
                    } else {
                        class109.method591(-256);
                        class609.method3377((byte) 44);
                        class289.method1710(-1);
                        for (int var31 = class564.field7696.method91(true, true); ~var31 != 0; var31 = class564.field7696.method91(false, true)) {
                            class375.method2150(-7, var31);
                            class153.field2166[class15.method97(31, class307.field4113++)] = var31;
                        }
                        for (class256 var32 = class311.method1828(-21472); var32 != null; var32 = class311.method1828(-21472)) {
                            int var33 = var32.method1550(true);
                            int var34 = var32.method1547(14380);
                            if (var33 == 1) {
                                class235.field3125[var34] = var32.field3358;
                                class122.field1599 |= class516.field7179[var34];
                                class95.field1150[class15.method97(31, class579.field7916++)] = var34;
                            } else if (~var33 != -3) {
                                if (~var33 != -4) {
                                    if (var33 == 4) {
                                        class423 var35 = class592.method3271(var34, (byte) -128);
                                        int var36 = var32.field3358;
                                        int var37 = var32.field3354;
                                        int var38 = var32.field3359;
                                        if (~var35.field5558 != ~var36 || ~var35.field5643 != ~var37 || var35.field5551 != var38) {
                                            var35.field5551 = var38;
                                            var35.field5558 = var36;
                                            var35.field5643 = var37;
                                            class552.method3091(var35, 12618);
                                        }
                                    } else if (~var33 == -6) {
                                        class423 var39 = class592.method3271(var34, (byte) -118);
                                        if (~var32.field3358 != ~var39.field5627 || var32.field3358 == -1) {
                                            var39.field5572 = 0;
                                            var39.field5680 = 0;
                                            var39.field5555 = 1;
                                            var39.field5627 = var32.field3358;
                                            class186 var40 = var39.field5627 == -1 ? null : class423.field5620.method1707(var39.field5627, 65);
                                            if (var40 != null) {
                                                class407.method2313(var39.field5572, var40, 255);
                                            }
                                            class552.method3091(var39, 12618);
                                        }
                                    } else if (~var33 == -7) {
                                        int var41 = var32.field3358;
                                        int var42 = (var41 & 31911) >> 10;
                                        int var43 = (1015 & var41) >> 5;
                                        int var44 = 31 & var41;
                                        int var45 = (var44 << 3) + (var42 << 19) + (var43 << 11);
                                        class423 var46 = class592.method3271(var34, (byte) -88);
                                        if (var46.field5664 != var45) {
                                            var46.field5664 = var45;
                                            class552.method3091(var46, 12618);
                                        }
                                    } else if (~var33 != -8) {
                                        if (~var33 == -9) {
                                            class423 var47 = class592.method3271(var34, (byte) -119);
                                            if (~var32.field3358 != ~var47.field5711 || var32.field3354 != var47.field5630 || var32.field3359 != var47.field5623) {
                                                var47.field5711 = var32.field3358;
                                                var47.field5630 = var32.field3354;
                                                var47.field5623 = var32.field3359;
                                                if (~var47.field5552 != 0) {
                                                    if (var47.field5638 > 0) {
                                                        var47.field5623 = var47.field5623 * 32 / var47.field5638;
                                                    } else if (~var47.field5656 < -1) {
                                                        var47.field5623 = var47.field5623 * 32 / var47.field5656;
                                                    }
                                                }
                                                class552.method3091(var47, 12618);
                                            }
                                        } else if (~var33 != -10) {
                                            if (~var33 == -11) {
                                                class423 var48 = class592.method3271(var34, (byte) -89);
                                                if (~var32.field3358 != ~var48.field5649 || var32.field3354 != var48.field5699 || ~var32.field3359 != ~var48.field5648) {
                                                    var48.field5649 = var32.field3358;
                                                    var48.field5699 = var32.field3354;
                                                    var48.field5648 = var32.field3359;
                                                    class552.method3091(var48, 12618);
                                                }
                                            } else if (var33 != 11) {
                                                if (~var33 == -13) {
                                                    class423 var49 = class592.method3271(var34, (byte) -81);
                                                    int var50 = var32.field3358;
                                                    if (var49 != null && ~var49.field5598 == -1) {
                                                        if (~(var49.field5603 - var49.field5672) > ~var50) {
                                                            var50 = -var49.field5672 + var49.field5603;
                                                        }
                                                        if (var50 < 0) {
                                                            var50 = 0;
                                                        }
                                                        if (var49.field5640 != var50) {
                                                            var49.field5640 = var50;
                                                            class552.method3091(var49, 12618);
                                                        }
                                                    }
                                                } else if (var33 == 14) {
                                                    class423 var51 = class592.method3271(var34, (byte) -98);
                                                    var51.field5609 = var32.field3358;
                                                } else if (~var33 != -16) {
                                                    if (~var33 == -17) {
                                                        class423 var52 = class592.method3271(var34, (byte) -87);
                                                        var52.field5545 = var32.field3358;
                                                    }
                                                } else {
                                                    class387.field5165 = var32.field3358;
                                                    class502.field6926 = var32.field3354;
                                                    class508.field7011 = true;
                                                }
                                            } else {
                                                class423 var53 = class592.method3271(var34, (byte) -75);
                                                var53.field5654 = var53.field5614 = var32.field3354;
                                                var53.field5570 = var53.field5682 = var32.field3358;
                                                var53.field5629 = 0;
                                                var53.field5589 = 0;
                                                class552.method3091(var53, 12618);
                                            }
                                        } else {
                                            class423 var54 = class592.method3271(var34, (byte) -87);
                                            if (~var32.field3358 != ~var54.field5552 || ~var32.field3354 != ~var54.field5557) {
                                                var54.field5552 = var32.field3358;
                                                var54.field5557 = var32.field3354;
                                                class552.method3091(var54, 12618);
                                            }
                                        }
                                    } else {
                                        class423 var55 = class592.method3271(var34, (byte) -72);
                                        boolean var56 = ~var32.field3358 == -2;
                                        if (var55.field5681 != var56) {
                                            var55.field5681 = var56;
                                            class552.method3091(var55, 12618);
                                        }
                                    }
                                } else {
                                    class423 var57 = class592.method3271(var34, (byte) -75);
                                    if (!var32.field3352.equals(var57.field5704)) {
                                        var57.field5704 = var32.field3352;
                                        class552.method3091(var57, 12618);
                                    }
                                }
                            } else {
                                class550.field7516[var34] = var32.field3352;
                                class490.field6781[class15.method97(31, class571.field7771++)] = var34;
                            }
                        }
                        if (~class646.field8933 != -1) {
                            class328.field4411 += 20;
                            if (~class328.field4411 <= -401) {
                                class646.field8933 = 0;
                            }
                        }
                        ++class498.field6849;
                        if (class455.field5989 != null) {
                            ++class34.field488;
                            if (class34.field488 >= 15) {
                                class552.method3091(class455.field5989, 12618);
                                class455.field5989 = null;
                            }
                        }
                        class606.field8447 = false;
                        class418.field5502 = null;
                        class452.field5965 = false;
                        class271.field3533 = null;
                        class411.method2336(0, -1, (class423) null, -1);
                        class110.method600((class423) null, 5, -1, -1);
                        if (!class38.field507) {
                            class689.field9739 = -1;
                        }
                        class537.method3010(-1);
                        ++class155.field2183;
                        if (class346.field4621) {
                            ++class290.field3836;
                            class229 var58 = class97.method550(class71.field841, false, class566.field7716);
                            var58.field2971.method916(-63, class125.field1750 << 14 | class169.field2421 << 28 | class208.field2778);
                            class307.method1805(var58, -14704);
                            class346.field4621 = false;
                        }
                        while (true) {
                            class274 var59;
                            class423 var60;
                            class423 var61;
                            do {
                                var59 = (class274) class441.field5855.method2502((byte) -98);
                                if (var59 == null) {
                                    while (true) {
                                        class274 var62;
                                        class423 var63;
                                        class423 var64;
                                        do {
                                            var62 = (class274) class200.field2705.method2502((byte) -92);
                                            if (var62 == null) {
                                                while (true) {
                                                    class274 var65;
                                                    class423 var66;
                                                    class423 var67;
                                                    do {
                                                        var65 = (class274) class114.field1466.method2502((byte) -123);
                                                        if (var65 == null) {
                                                            if (class418.field5502 == null) {
                                                                class182.field2544 = 0;
                                                            }
                                                            if (class85.field1028 != null) {
                                                                class474.method2731(1);
                                                            }
                                                            if (class121.field1585 > 0 && class643.field8914.method2106((byte) -119, 82) && class643.field8914.method2106((byte) -118, 81) && ~class427.field5753 != -1) {
                                                                int var68 = -class427.field5753 + class408.field5369.field385;
                                                                if (var68 < 0) {
                                                                    var68 = 0;
                                                                } else if (var68 > 3) {
                                                                    var68 = 3;
                                                                }
                                                                class242.method1491(var68, class125.field1745 - -class408.field5369.field3088[0], (byte) 16, class408.field5369.field3086[0] + class4.field23);
                                                            }
                                                            class174.method1187(0);
                                                            for (int var69 = 0; var69 < 5; ++var69) {
                                                                int var10002 = class12.field158[var69]++;
                                                            }
                                                            if (class122.field1599 && ~class254.field3331 > ~(-60000L + class529.method2982((byte) -69))) {
                                                                class326.method1900(false);
                                                            }
                                                            for (class43 var70 = (class43) class562.field7686.method1298((byte) 40); var70 != null; var70 = (class43) class562.field7686.method1305((byte) -124)) {
                                                                if ((long) var70.field530 < -5L + class529.method2982((byte) -69) / 1000L) {
                                                                    if (var70.field528 > 0) {
                                                                        class116.method681("", "", "", 63, 0, var70.field527 + class371.field4898.method2141(class422.field5539, true), 5);
                                                                    }
                                                                    if (var70.field528 == 0) {
                                                                        class116.method681("", "", "", 91, 0, var70.field527 + class371.field4899.method2141(class422.field5539, true), 5);
                                                                    }
                                                                    var70.method3499(12151);
                                                                }
                                                            }
                                                            ++class647.field8949;
                                                            if (~class647.field8949 < -501) {
                                                                class647.field8949 = 0;
                                                                int var71 = (int) (8.0D * Math.random());
                                                                if (~(var71 & 2) == -3) {
                                                                    class398.field5280 += class377.field4992;
                                                                }
                                                                if (~(var71 & 4) == -5) {
                                                                    class360.field4780 += class230.field2982;
                                                                }
                                                                if (~(1 & var71) == -2) {
                                                                    class242.field3191 += class470.field6560;
                                                                }
                                                            }
                                                            if (~class242.field3191 > 49) {
                                                                class470.field6560 = 2;
                                                            }
                                                            if (class398.field5280 < -55) {
                                                                class377.field4992 = 2;
                                                            }
                                                            if (class242.field3191 > 50) {
                                                                class470.field6560 = -2;
                                                            }
                                                            if (~class360.field4780 > 39) {
                                                                class230.field2982 = 1;
                                                            }
                                                            if (class398.field5280 > 55) {
                                                                class377.field4992 = -2;
                                                            }
                                                            if (class360.field4780 > 40) {
                                                                class230.field2982 = -1;
                                                            }
                                                            if (arg0 > -80) {
                                                                method141(116);
                                                            }
                                                            ++class276.field3667;
                                                            if (~class276.field3667 < -501) {
                                                                class276.field3667 = 0;
                                                                int var72 = (int) (Math.random() * 8.0D);
                                                                if (~(var72 & 2) == -3) {
                                                                    class424.field5716 += class494.field6809;
                                                                }
                                                                if ((1 & var72) == 1) {
                                                                    class478.field6651 += class224.field2910;
                                                                }
                                                            }
                                                            if (class478.field6651 < -60) {
                                                                class224.field2910 = 2;
                                                            }
                                                            if (class424.field5716 < -20) {
                                                                class494.field6809 = 1;
                                                            }
                                                            if (~class478.field6651 < -61) {
                                                                class224.field2910 = -2;
                                                            }
                                                            if (~class424.field5716 < -11) {
                                                                class494.field6809 = -1;
                                                            }
                                                            ++class309.field4164;
                                                            if (~class309.field4164 < -51) {
                                                                ++class580.field7921;
                                                                class229 var73 = class97.method550(class71.field841, false, class565.field7704);
                                                                class307.method1805(var73, -14704);
                                                            }
                                                            if (class79.field933) {
                                                                class660.method3772(-1);
                                                                class79.field933 = false;
                                                            }
                                                            try {
                                                                class493.method2814(-30301);
                                                                return;
                                                            } catch (IOException var74) {
                                                                class284.method1685(0);
                                                                return;
                                                            }
                                                        }
                                                        var66 = var65.field3644;
                                                        if (~var66.field5610 > -1) {
                                                            break;
                                                        }
                                                        var67 = class592.method3271(var66.field5585, (byte) -92);
                                                    } while (var67 == null || var67.field5647 == null || ~var66.field5610 <= ~var67.field5647.length || var67.field5647[var66.field5610] != var66);
                                                    class656.method3743(var65);
                                                }
                                            }
                                            var63 = var62.field3644;
                                            if (var63.field5610 < 0) {
                                                break;
                                            }
                                            var64 = class592.method3271(var63.field5585, (byte) -106);
                                        } while (var64 == null || var64.field5647 == null || var63.field5610 >= var64.field5647.length || var64.field5647[var63.field5610] != var63);
                                        class656.method3743(var62);
                                    }
                                }
                                var60 = var59.field3644;
                                if (var60.field5610 < 0) {
                                    break;
                                }
                                var61 = class592.method3271(var60.field5585, (byte) -114);
                            } while (var61 == null || var61.field5647 == null || var60.field5610 >= var61.field5647.length || var61.field5647[var60.field5610] != var60);
                            class656.method3743(var59);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
    public class24() {
        super(2, false);
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
    public static void method141(int arg0) {
        if (arg0 != 2) {
            field282 = null;
        }
        field287 = null;
        field289 = null;
        field286 = null;
        field291 = null;
        field282 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            field287 = null;
        }
        ++field288;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int[] var4 = this.method1969(0, arg1, -76);
            int[] var5 = this.method1969(1, arg1, -71);
            int var6 = this.field284;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class649.field8968 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - (-var9 - -(var8 * var9 >> 11));
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class649.field8968; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class649.field8968 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 < ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class649.field8968; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class649.field8968; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class649.field8968; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class649.field8968 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; class649.field8968 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class649.field8968; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class649.field8968; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class649.field8968; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class649.field8968; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        if (arg1) {
            field286 = null;
        }
        ++field281;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[][] var4 = this.method1968(arg0, 3, 0);
            int[][] var5 = this.method1968(arg0, 3, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field284;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class649.field8968 < ~var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var22 - ((var21 * var22 >> 11) + -var21);
                                                                var7[var16] = var17 + var19 + -(var17 * var19 >> 11);
                                                                var8[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class649.field8968; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var26 >= var24 ? var26 - var24 : var24 - var26;
                                                            var7[var23] = var28 >= var27 ? -var27 + var28 : var27 - var28;
                                                            var8[var23] = ~var25 < ~var29 ? -var29 + var25 : var29 - var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class649.field8968 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var33 > var34 ? var33 : var34;
                                                        var7[var30] = var32 >= var36 ? var32 : var36;
                                                        var8[var30] = ~var35 >= ~var31 ? var31 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class649.field8968; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var39 <= ~var38 ? var38 : var39;
                                                    var7[var37] = var41 <= var40 ? var41 : var40;
                                                    var8[var37] = ~var43 > ~var42 ? var43 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class649.field8968 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 != -1 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class649.field8968 < ~var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class649.field8968; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var55 <= -2049 ? 4096 - ((4096 - var10[var52]) * (-var55 + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var54 <= -2049 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class649.field8968 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class649.field8968; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class649.field8968; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class649.field8968; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class649.field8968; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 == -66) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    super.field4537 = ~arg1.method930(255) == -2;
                }
            } else {
                this.field284 = arg1.method930(255);
            }
            ++field280;
        }
    }
}
