import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class337 extends class214 {

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field4626 = -1;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field4618 = 0;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "J")
    public static long field4624 = 0L;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    private int field4622;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    private int field4630;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "[I")
    private int[] field4619;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        if (arg1 != 92) {
            return null;
        } else {
            ++field4628;
            int[][] var3 = super.field3030.method2780(false, arg0);
            if (super.field3030.field6644) {
                int var4 = this.field4630 * (~class490.field6924 != ~this.field4622 ? this.field4622 * arg0 / class490.field6924 : arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class399.field5585 != this.field4630) {
                    for (int var8 = 0; ~class399.field5585 < ~var8; ++var8) {
                        int var9 = this.field4630 * var8 / class399.field5585;
                        int var10 = this.field4619[var4 + var9];
                        var7[var8] = class347.method2074(255, var10) << 4;
                        var6[var8] = class347.method2074(var10, 65280) >> 4;
                        var5[var8] = class347.method2074(4080, var10 >> 12);
                    }
                } else {
                    for (int var11 = 0; var11 < class399.field5585; ++var11) {
                        int var12 = this.field4619[var4++];
                        var7[var11] = class347.method2074(var12 << 4, 4080);
                        var6[var11] = class347.method2074(var12 >> 4, 4080);
                        var5[var11] = class347.method2074(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class337() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static final void method2007(byte arg0) {
        if (~class60.field933 < -1) {
            --class60.field933;
        }
        ++field4623;
        if (~class310.field4245 < -2) {
            class103.field1464 = class122.field1700;
            --class310.field4245;
        }
        if (class182.field2650) {
            class182.field2650 = false;
            class282.method1754((byte) -59);
        } else {
            if (!class351.field4800) {
                class394.method2355(127);
            }
            for (int var1 = 0; var1 < 100 && class446.method2594(100); ++var1) {
            }
            if (~class478.field6764 == -31) {
                class233.method1464(class366.field5214, 94, class377.field5330.method2099(-96));
                if (class473.field6627 == null) {
                    if (~class193.method1237(-9581) <= ~class343.field4705) {
                        class473.field6627 = class346.field4731.method1224(class267.field3718, 3);
                    }
                } else if (class473.field6627.field5590 != -1) {
                    class131.method793(class197.field2834, -81);
                    class366.field5214.method2462(class473.field6627.field5590, (byte) -123);
                    class473.field6627 = null;
                    class343.field4705 = class193.method1237(-9581) - -30000L;
                }
                if (arg0 <= 35) {
                    method2007((byte) 78);
                }
                if (class8.field169 != null || -2000L + class193.method1237(-9581) > class378.field5343) {
                    boolean var2 = false;
                    int var3 = class366.field5214.field5830;
                    for (class161 var4 = (class161) class314.field4256.method1544(-127); var4 != null && -var3 + class366.field5214.field5830 < 240; var4 = (class161) class314.field4256.method1546((byte) -42)) {
                        var4.method1182(28818);
                        int var5 = var4.method972(false);
                        if (var5 < 0) {
                            var5 = 0;
                        } else if (var5 > 65534) {
                            var5 = 65534;
                        }
                        int var6 = var4.method980(10);
                        if (var6 < 0) {
                            var6 = 0;
                        } else if (~var6 < -65535) {
                            var6 = 65534;
                        }
                        boolean var7 = false;
                        if (var4.method972(false) == -1 && var4.method980(14) == -1) {
                            var6 = -1;
                            var5 = -1;
                            var7 = true;
                        }
                        if (class47.field765 != var6 || ~class312.field4252 != ~var5) {
                            if (!var2) {
                                ++class211.field2978;
                                class131.method793(class283.field3886, 82);
                                class366.field5214.method2470((byte) -74, 0);
                                var3 = class366.field5214.field5830;
                                var2 = true;
                            }
                            int var8 = var6 - class47.field765;
                            class47.field765 = var6;
                            int var9 = -class312.field4252 + var5;
                            class312.field4252 = var5;
                            int var10 = (int) ((var4.method978(false) - class378.field5343) / 20L);
                            if (var10 < 8 && ~var8 <= 31 && var8 <= 31 && ~var9 <= 31 && ~var9 >= -32) {
                                var8 += 32;
                                var9 += 32;
                                class366.field5214.method2462((var10 << 12) + (var8 << 6) + var9, (byte) -123);
                            } else if (var10 < 32 && ~var8 <= 127 && var8 <= 127 && ~var9 <= 127 && ~var9 >= -128) {
                                var9 += 128;
                                class366.field5214.method2470((byte) -74, var10 + 128);
                                var8 += 128;
                                class366.field5214.method2462((var8 << 8) + var9, (byte) -123);
                            } else if (~var10 <= -33) {
                                class366.field5214.method2462(57344 - -var10, (byte) -123);
                                if (!var7) {
                                    class366.field5214.method2481(var6 | var5 << 16, true);
                                } else {
                                    class366.field5214.method2481(Integer.MIN_VALUE, true);
                                }
                            } else {
                                class366.field5214.method2470((byte) -74, 192 - -var10);
                                if (var7) {
                                    class366.field5214.method2481(Integer.MIN_VALUE, true);
                                } else {
                                    class366.field5214.method2481(var5 << 16 | var6, true);
                                }
                            }
                            class378.field5343 = var4.method978(false);
                        }
                    }
                    if (var2) {
                        class366.field5214.method2504(-var3 + class366.field5214.field5830, 1);
                    }
                }
                if (class8.field169 != null) {
                    long var11 = (class8.field169.method978(false) + -class2.field7) / 50L;
                    if (var11 > 32767L) {
                        var11 = 32767L;
                    }
                    class2.field7 = class8.field169.method978(false);
                    int var13 = class8.field169.method972(false);
                    if (var13 < 0) {
                        var13 = 0;
                    } else if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = class8.field169.method980(50);
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    byte var15 = 0;
                    if (class8.field169.method976(-122) == 2) {
                        var15 = 1;
                    }
                    class131.method793(class163.field2347, 105);
                    int var16 = (int) var11;
                    ++class389.field5476;
                    class366.field5214.method2487(0, var13 << 16 | var14);
                    class366.field5214.method2462(var15 << 15 | var16, (byte) -123);
                }
                if (class2.field17 > 0) {
                    int var17 = 0;
                    for (int var18 = 0; ~class2.field17 < ~var18; ++var18) {
                        if (class374.field5291[var18].method986((byte) 98)) {
                            ++var17;
                        }
                    }
                    if (var17 > 0) {
                        ++class105.field1503;
                        class131.method793(class237.field3338, -103);
                        if (var17 > 75) {
                            var17 = 75;
                        }
                        class366.field5214.method2470((byte) -74, var17 * 3);
                        for (int var19 = 0; class2.field17 > var19; ++var19) {
                            class304 var20 = class374.field5291[var19];
                            if (var20.method986((byte) 49)) {
                                long var21 = (var20.method991(104) + -class221.field3113) / 50L;
                                class221.field3113 = var20.method991(117);
                                if (~var21 < -65536L) {
                                    var21 = 65535L;
                                }
                                class366.field5214.method2470((byte) -74, var20.method990(0));
                                class366.field5214.method2462((int) var21, (byte) -123);
                            }
                        }
                    }
                }
                if (~class55.field895 < -1) {
                    --class55.field895;
                }
                if (class343.field4704 && class55.field895 <= 0) {
                    ++class243.field3442;
                    class55.field895 = 20;
                    class343.field4704 = false;
                    class131.method793(class196.field2798, 93);
                    class366.field5214.method2501((int) class356.field4959 >> 3, -128);
                    class366.field5214.method2453((int) class418.field5750 >> 3, true);
                }
                if (class332.field4550 && !class2.field23) {
                    ++class464.field6526;
                    class2.field23 = true;
                    class131.method793(class407.field5645, 95);
                    class366.field5214.method2470((byte) -74, 1);
                }
                if (!class332.field4550 && class2.field23) {
                    class2.field23 = false;
                    ++class464.field6526;
                    class131.method793(class407.field5645, -120);
                    class366.field5214.method2470((byte) -74, 0);
                }
                if (!class443.field6118) {
                    ++class63.field967;
                    class131.method793(class138.field1962, -57);
                    class366.field5214.method2481(class464.method2738(-85), true);
                    class443.field6118 = true;
                }
                if (class455.field6293 != null) {
                    if (~class375.field5312 != -3) {
                        if (~class375.field5312 == -4) {
                            class332.method1974(31699);
                        }
                    } else {
                        class138.method845(126);
                    }
                }
                if (class449.field6189) {
                    class449.field6189 = false;
                } else {
                    class244.field3452 /= 2.0F;
                }
                if (!class250.field3508) {
                    class388.field5465 /= 2.0F;
                } else {
                    class250.field3508 = false;
                }
                class222.method1405(-110);
                if (class478.field6764 == 30) {
                    class373.method2235(10);
                    class344.method2057(42);
                    class417.method2436(true);
                    class288.method1772(false);
                    ++class147.field2083;
                    if (class147.field2083 > 750) {
                        class282.method1754((byte) -108);
                    } else {
                        class121.method755(0);
                        class107.method674((byte) 6);
                        class347.method2083((byte) -2);
                        for (int var23 = class320.field4376.method1491(true, -17115); var23 != -1; var23 = class320.field4376.method1491(false, -17115)) {
                            class210.method1319(3, var23);
                            class199.field2855[class347.method2074(31, class343.field4690++)] = var23;
                        }
                        for (class265 var24 = class2.method13(871605004); var24 != null; var24 = class2.method13(871605004)) {
                            int var25 = var24.method1672(false);
                            int var26 = var24.method1676(-19941);
                            if (var25 != 1) {
                                if (~var25 != -3) {
                                    if (~var25 == -4) {
                                        class363 var27 = class292.method1804((byte) -64, var26);
                                        if (!var24.field3688.equals(var27.field5123)) {
                                            var27.field5123 = var24.field3688;
                                            class356.method2141(-89, var27);
                                        }
                                    } else if (var25 == 4) {
                                        class363 var28 = class292.method1804((byte) -73, var26);
                                        int var29 = var24.field3698;
                                        int var30 = var24.field3689;
                                        int var31 = var24.field3692;
                                        if (var28.field5143 != var29 || var28.field5154 != var30 || ~var28.field5055 != ~var31) {
                                            var28.field5154 = var30;
                                            var28.field5055 = var31;
                                            var28.field5143 = var29;
                                            class356.method2141(-123, var28);
                                        }
                                    } else if (var25 != 5) {
                                        if (~var25 != -7) {
                                            if (var25 == 7) {
                                                class363 var32 = class292.method1804((byte) -87, var26);
                                                boolean var33 = var24.field3698 == 1;
                                                if (!var33 != !var32.field5179) {
                                                    var32.field5179 = var33;
                                                    class356.method2141(-114, var32);
                                                }
                                            } else if (~var25 != -9) {
                                                if (var25 != 9) {
                                                    if (~var25 != -11) {
                                                        if (var25 != 11) {
                                                            if (var25 == 12) {
                                                                class363 var34 = class292.method1804((byte) -80, var26);
                                                                int var35 = var24.field3698;
                                                                if (var34 != null && ~var34.field5093 == -1) {
                                                                    if (var35 > var34.field5114 - var34.field5200) {
                                                                        var35 = -var34.field5200 + var34.field5114;
                                                                    }
                                                                    if (var35 < 0) {
                                                                        var35 = 0;
                                                                    }
                                                                    if (var34.field5186 != var35) {
                                                                        var34.field5186 = var35;
                                                                        class356.method2141(-122, var34);
                                                                    }
                                                                }
                                                            } else if (~var25 != -15) {
                                                                if (~var25 != -16) {
                                                                    if (var25 == 16) {
                                                                        class363 var36 = class292.method1804((byte) -108, var26);
                                                                        var36.field5155 = var24.field3698;
                                                                    }
                                                                } else {
                                                                    class131.field1836 = true;
                                                                    class35.field588 = var24.field3689;
                                                                    class372.field5266 = var24.field3698;
                                                                }
                                                            } else {
                                                                class363 var37 = class292.method1804((byte) -65, var26);
                                                                var37.field5098 = var24.field3698;
                                                            }
                                                        } else {
                                                            class363 var38 = class292.method1804((byte) -48, var26);
                                                            var38.field5132 = 0;
                                                            var38.field5181 = 0;
                                                            var38.field5183 = var38.field5166 = var24.field3689;
                                                            var38.field5145 = var38.field5100 = var24.field3698;
                                                            class356.method2141(-62, var38);
                                                        }
                                                    } else {
                                                        class363 var39 = class292.method1804((byte) -97, var26);
                                                        if (~var24.field3698 != ~var39.field5097 || var24.field3689 != var39.field5046 || ~var24.field3692 != ~var39.field5164) {
                                                            var39.field5097 = var24.field3698;
                                                            var39.field5046 = var24.field3689;
                                                            var39.field5164 = var24.field3692;
                                                            class356.method2141(-100, var39);
                                                        }
                                                    }
                                                } else {
                                                    class363 var40 = class292.method1804((byte) -99, var26);
                                                    if (~var24.field3698 != ~var40.field5195 || ~var24.field3689 != ~var40.field5175) {
                                                        var40.field5175 = var24.field3689;
                                                        var40.field5195 = var24.field3698;
                                                        class356.method2141(-119, var40);
                                                    }
                                                }
                                            } else {
                                                class363 var41 = class292.method1804((byte) -59, var26);
                                                if (var24.field3698 != var41.field5075 || var24.field3689 != var41.field5108 || ~var24.field3692 != ~var41.field5126) {
                                                    var41.field5126 = var24.field3692;
                                                    var41.field5108 = var24.field3689;
                                                    var41.field5075 = var24.field3698;
                                                    if (var41.field5195 != -1) {
                                                        if (var41.field5060 <= 0) {
                                                            if (var41.field5127 > 0) {
                                                                var41.field5126 = var41.field5126 * 32 / var41.field5127;
                                                            }
                                                        } else {
                                                            var41.field5126 = var41.field5126 * 32 / var41.field5060;
                                                        }
                                                    }
                                                    class356.method2141(-96, var41);
                                                }
                                            }
                                        } else {
                                            int var42 = var24.field3698;
                                            int var43 = (var42 & 31812) >> 10;
                                            int var44 = var42 >> 5 & 31;
                                            int var45 = var42 & 31;
                                            int var46 = (var44 << 11) + (var43 << 19) + (var45 << 3);
                                            class363 var47 = class292.method1804((byte) -49, var26);
                                            if (~var47.field5095 != ~var46) {
                                                var47.field5095 = var46;
                                                class356.method2141(-67, var47);
                                            }
                                        }
                                    } else {
                                        class363 var48 = class292.method1804((byte) -74, var26);
                                        if (var24.field3698 != var48.field5121 || ~var24.field3698 == 0) {
                                            var48.field5172 = 0;
                                            var48.field5121 = var24.field3698;
                                            var48.field5152 = 1;
                                            var48.field5045 = 0;
                                            class356.method2141(-95, var48);
                                        }
                                    }
                                } else {
                                    class438.field6012[var26] = var24.field3688;
                                    class419.field5785[class347.method2074(class455.field6294++, 31)] = var26;
                                }
                            } else {
                                class64.field975[var26] = var24.field3698;
                                class146.field2067 |= class2.field19[var26];
                                class5.field111[class347.method2074(class487.field6870++, 31)] = var26;
                            }
                        }
                        ++class42.field717;
                        if (class258.field3605 != 0) {
                            class238.field3358 += 20;
                            if (~class238.field3358 <= -401) {
                                class258.field3605 = 0;
                            }
                        }
                        if (class67.field998 != null) {
                            ++class197.field2836;
                            if (~class197.field2836 <= -16) {
                                class356.method2141(-128, class67.field998);
                                class67.field998 = null;
                            }
                        }
                        class233.field3307 = null;
                        class411.field5699 = null;
                        class235.field3328 = false;
                        class454.field6273 = false;
                        class99.method628((class363) null, -66, -1, -1);
                        class61.method446(-1, -1, (byte) 93, (class363) null);
                        class464.method2736(false);
                        ++class122.field1700;
                        if (class216.field3070) {
                            ++class472.field6616;
                            class131.method793(class133.field1873, -53);
                            class366.field5214.method2473(class293.field4023 << 28 | class275.field3804 << 14 | class233.field3308, (byte) 115);
                            class216.field3070 = false;
                        }
                        while (true) {
                            class32 var49;
                            class363 var50;
                            class363 var51;
                            do {
                                var49 = (class32) class327.field4504.method1548(8779);
                                if (var49 == null) {
                                    while (true) {
                                        class32 var52;
                                        class363 var53;
                                        class363 var54;
                                        do {
                                            var52 = (class32) class375.field5310.method1548(8779);
                                            if (var52 == null) {
                                                while (true) {
                                                    class32 var55;
                                                    class363 var56;
                                                    class363 var57;
                                                    do {
                                                        var55 = (class32) class31.field503.method1548(8779);
                                                        if (var55 == null) {
                                                            if (class233.field3307 == null) {
                                                                class77.field1169 = 0;
                                                            }
                                                            if (class146.field2070 != null) {
                                                                class334.method1985(-80);
                                                            }
                                                            if (class159.field2292 > 0 && class194.field2757.method531(82, 125) && class194.field2757.method531(81, 88) && class109.field1545 != 0) {
                                                                int var58 = -class109.field1545 + class2.field21.field6766;
                                                                if (var58 < 0) {
                                                                    var58 = 0;
                                                                } else if (var58 > 3) {
                                                                    var58 = 3;
                                                                }
                                                                class160.method971(class2.field21.field1144[0] + class153.field2204, class2.field21.field1140[0] + class325.field4472, 63, var58);
                                                            }
                                                            class66.method468(119);
                                                            for (int var59 = 0; ~var59 > -6; ++var59) {
                                                                int var10002 = class274.field3800[var59]++;
                                                            }
                                                            if (class146.field2067 && -60000L + class193.method1237(-9581) > class30.field493) {
                                                                class10.method99(104);
                                                            }
                                                            ++class145.field2051;
                                                            if (class145.field2051 > 500) {
                                                                class145.field2051 = 0;
                                                                int var60 = (int) (Math.random() * 8.0D);
                                                                if ((var60 & 4) == 4) {
                                                                    class480.field6795 += class430.field5925;
                                                                }
                                                                if (~(var60 & 1) == -2) {
                                                                    class73.field1055 += class192.field2754;
                                                                }
                                                                if ((2 & var60) == 2) {
                                                                    class307.field4205 += class302.field4143;
                                                                }
                                                            }
                                                            if (~class73.field1055 > 49) {
                                                                class192.field2754 = 2;
                                                            }
                                                            if (class73.field1055 > 50) {
                                                                class192.field2754 = -2;
                                                            }
                                                            if (~class307.field4205 > 54) {
                                                                class302.field4143 = 2;
                                                            }
                                                            if (~class480.field6795 > 39) {
                                                                class430.field5925 = 1;
                                                            }
                                                            if (class307.field4205 > 55) {
                                                                class302.field4143 = -2;
                                                            }
                                                            ++class200.field2874;
                                                            if (~class480.field6795 < -41) {
                                                                class430.field5925 = -1;
                                                            }
                                                            if (~class200.field2874 < -501) {
                                                                class200.field2874 = 0;
                                                                int var61 = (int) (Math.random() * 8.0D);
                                                                if ((var61 & 1) == 1) {
                                                                    class361.field5042 += class231.field3263;
                                                                }
                                                                if (~(var61 & 2) == -3) {
                                                                    class351.field4804 += class328.field4533;
                                                                }
                                                            }
                                                            if (~class361.field5042 > 59) {
                                                                class231.field3263 = 2;
                                                            }
                                                            if (~class351.field4804 > 19) {
                                                                class328.field4533 = 1;
                                                            }
                                                            if (~class361.field5042 < -61) {
                                                                class231.field3263 = -2;
                                                            }
                                                            if (class351.field4804 > 10) {
                                                                class328.field4533 = -1;
                                                            }
                                                            ++class479.field6777;
                                                            if (~class479.field6777 < -51) {
                                                                class131.method793(class266.field3709, -66);
                                                                ++class148.field2089;
                                                            }
                                                            if (class297.field4096) {
                                                                class46.method363(6);
                                                                class297.field4096 = false;
                                                            }
                                                            try {
                                                                if (class237.field3339 != null && class366.field5214.field5830 > 0) {
                                                                    class309.field4223 += class366.field5214.field5830;
                                                                    class237.field3339.method2635(0, class366.field5214.field5830, class366.field5214.field5886, -15109);
                                                                    class479.field6777 = 0;
                                                                    class366.field5214.field5830 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var62) {
                                                                class282.method1754((byte) -10);
                                                                return;
                                                            }
                                                        }
                                                        var56 = var55.field517;
                                                        if (~var56.field5047 > -1) {
                                                            break;
                                                        }
                                                        var57 = class292.method1804((byte) -52, var56.field5062);
                                                    } while (var57 == null || var57.field5113 == null || var56.field5047 >= var57.field5113.length || var57.field5113[var56.field5047] != var56);
                                                    class212.method1331(var55);
                                                }
                                            }
                                            var53 = var52.field517;
                                            if (var53.field5047 < 0) {
                                                break;
                                            }
                                            var54 = class292.method1804((byte) -77, var53.field5062);
                                        } while (var54 == null || var54.field5113 == null || ~var54.field5113.length >= ~var53.field5047 || var54.field5113[var53.field5047] != var53);
                                        class212.method1331(var52);
                                    }
                                }
                                var50 = var49.field517;
                                if (~var50.field5047 > -1) {
                                    break;
                                }
                                var51 = class292.method1804((byte) -67, var50.field5062);
                            } while (var51 == null || var51.field5113 == null || ~var50.field5047 <= ~var51.field5113.length || var51.field5113[var50.field5047] != var50);
                            class212.method1331(var49);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field4625;
        if (arg1 <= -114) {
            if (arg2 == 0) {
                this.field4626 = arg0.method2508(true);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)I")
    public final int method1351(int arg0) {
        ++field4621;
        if (arg0 != -5070) {
            this.method1295(true);
        }
        return this.field4626;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public final void method1295(boolean arg0) {
        super.method1295(arg0);
        ++field4620;
        this.field4619 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
    public final void method1353(int arg0, int arg1, int arg2) {
        ++field4627;
        super.method1353(arg0, arg1, arg2);
        if (this.field4626 >= 0 && class422.field5813 != null) {
            int var4 = !class422.field5813.method1218(this.field4626, false).field2730 ? 128 : 64;
            this.field4619 = class422.field5813.method1219(false, var4, 1.0F, this.field4626, var4, 53);
            this.field4630 = var4;
            this.field4622 = var4;
        }
    }
}
