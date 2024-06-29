import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class277 extends class439 {

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    private int field3649;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field3648;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lcea;")
    public static class180 field3644 = new class180("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3654 = new Rectangle[100];

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[[[I")
    public static int[][][] field3652 = new int[2][][];

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "F")
    public static float field3655;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        ++field3650;
        int var4 = -66 % ((-75 - arg0) / 49);
        int var5 = this.field3643 * arg2 >> 12;
        int var6 = this.field3646 * arg2 >> 12;
        int var7 = this.field3648 * arg1 >> 12;
        int var8 = this.field3649 * arg1 >> 12;
        class442.method2592(101, var6, super.field6077, super.field6076, super.field6079, var5, var7, var8);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method1571(int arg0) {
        if (class59.field577 > 1) {
            class388.field5128 = class519.field7305;
            --class59.field577;
        }
        ++field3651;
        if (class103.field1264) {
            class103.field1264 = false;
            class276.method1567((byte) -29);
        } else {
            if (!class473.field6634) {
                class9.method46(127);
            }
            for (int var1 = 0; var1 < 100 && class195.method1062((byte) 111); ++var1) {
            }
            if (~class137.field1671 == -10) {
                class645.method3724(20471, class491.field6860.method3213(4), class136.field1663);
                if (class216.field2639 == null) {
                    if (class91.field1127 <= class190.method1030(false)) {
                        class216.field2639 = class399.field5251.method2358(class237.field2960.field2713, arg0 + 551697685);
                    }
                } else if (~class216.field2639.field3720 != 0) {
                    class418.method2378(17984, class343.field4410);
                    class136.field1663.method2115(class216.field2639.field3720, 3324);
                    class216.field2639 = null;
                    class91.field1127 = class190.method1030(false) + 30000L;
                }
                class379 var2 = (class379) class5.field43.method1050((byte) 73);
                if (var2 != null || ~class310.field3949 > ~(-2000L + class190.method1030(false))) {
                    boolean var3 = false;
                    int var4 = class136.field1663.field4966;
                    for (class379 var5 = (class379) class479.field6733.method1050((byte) 73); var5 != null && -var4 + class136.field1663.field4966 < 240; var5 = (class379) class479.field6733.method1047(-7962)) {
                        var5.method3187(true);
                        int var6 = var5.method705(arg0 ^ -551697687);
                        if (var6 < -1) {
                            var6 = -1;
                        } else if (~var6 < -65535) {
                            var6 = 65534;
                        }
                        int var7 = var5.method701(arg0 ^ -551697687);
                        if (var7 < -1) {
                            var7 = -1;
                        } else if (~var7 < -65535) {
                            var7 = 65534;
                        }
                        if (~class641.field9247 != ~var7 || ~class15.field113 != ~var6) {
                            if (!var3) {
                                class418.method2378(17984, class618.field8941);
                                ++class50.field425;
                                class136.field1663.method2093(0, -111);
                                var4 = class136.field1663.field4966;
                                var3 = true;
                            }
                            int var8 = -class641.field9247 + var7;
                            class641.field9247 = var7;
                            int var9 = -class15.field113 + var6;
                            class15.field113 = var6;
                            int var10 = (int) ((var5.method704((byte) -87) + -class310.field3949) / 20L);
                            if (~var10 > -9 && ~var8 <= 31 && ~var8 >= -32 && var9 >= -32 && ~var9 >= -32) {
                                var9 += 32;
                                var8 += 32;
                                class136.field1663.method2115((var10 << 12) + var9 - -(var8 << 6), 3324);
                            } else if (var10 < 32 && ~var8 <= 127 && ~var8 >= -128 && var9 >= -128 && var9 <= 127) {
                                var8 += 128;
                                var9 += 128;
                                class136.field1663.method2093(128 - -var10, -113);
                                class136.field1663.method2115((var8 << 8) + var9, 3324);
                            } else if (~var10 <= -33) {
                                class136.field1663.method2115(var10 + 57344, 3324);
                                if (~var7 != -2 && var6 != -1) {
                                    class136.field1663.method2131(var7 | var6 << 16, -1495157560);
                                } else {
                                    class136.field1663.method2131(Integer.MIN_VALUE, -1495157560);
                                }
                            } else {
                                class136.field1663.method2093(192 - -var10, -122);
                                if (~var7 != -2 && var6 != -1) {
                                    class136.field1663.method2131(var6 << 16 | var7, -1495157560);
                                } else {
                                    class136.field1663.method2131(Integer.MIN_VALUE, -1495157560);
                                }
                            }
                            class310.field3949 = var5.method704((byte) -87);
                        }
                    }
                    if (var3) {
                        class136.field1663.method2083((byte) -116, -var4 + class136.field1663.field4966);
                    }
                }
                if (var2 != null) {
                    long var11 = (var2.method704((byte) -87) + -class116.field1460) / 50L;
                    if (var11 > 32767L) {
                        var11 = 32767L;
                    }
                    class116.field1460 = var2.method704((byte) -87);
                    int var13 = var2.method705(arg0 + 551697689);
                    if (var13 >= 0) {
                        if (var13 > 65535) {
                            var13 = 65535;
                        }
                    } else {
                        var13 = 0;
                    }
                    int var14 = var2.method701(arg0 ^ -551697687);
                    if (~var14 <= -1) {
                        if (~var14 < -65536) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    byte var15 = 0;
                    if (var2.method700((byte) -124) == 2) {
                        var15 = 1;
                    }
                    ++class444.field6130;
                    int var16 = (int) var11;
                    class418.method2378(17984, class297.field3823);
                    class136.field1663.method2148(var15 << 15 | var16, 29780);
                    class136.field1663.method2130(arg0 ^ -551697684, var14 | var13 << 16);
                }
                if (class311.field3978 > 0) {
                    ++class22.field148;
                    class418.method2378(arg0 ^ -551713620, class395.field5222);
                    class136.field1663.method2093(class311.field3978 * 3, -127);
                    for (int var17 = 0; ~var17 > ~class311.field3978; ++var17) {
                        class397 var18 = class265.field3448[var17];
                        long var19 = (var18.method1517(82) - class36.field285) / 50L;
                        if (~var19 < -65536L) {
                            var19 = 65535L;
                        }
                        class36.field285 = var18.method1517(81);
                        class136.field1663.method2093(var18.method1516(-119), -123);
                        class136.field1663.method2115((int) var19, arg0 + 551701008);
                    }
                }
                if (~class611.field8865 < -1) {
                    --class611.field8865;
                }
                if (class35.field278 && ~class611.field8865 >= -1) {
                    class611.field8865 = 20;
                    ++class561.field8253;
                    class35.field278 = false;
                    class418.method2378(17984, class383.field5068);
                    class136.field1663.method2101(false, (int) class588.field8527 >> 3);
                    class136.field1663.method2115((int) class558.field8223 >> 3, 3324);
                }
                if (class55.field481 && !class246.field3160) {
                    ++class556.field8197;
                    class246.field3160 = true;
                    class418.method2378(17984, class413.field5365);
                    class136.field1663.method2093(1, -101);
                }
                if (!class55.field481 && class246.field3160) {
                    ++class556.field8197;
                    class246.field3160 = false;
                    class418.method2378(arg0 + 551715668, class413.field5365);
                    class136.field1663.method2093(0, -114);
                }
                if (!class74.field865) {
                    ++class520.field7308;
                    class418.method2378(17984, class255.field3280);
                    class136.field1663.method2093(0, -122);
                    int var21 = class136.field1663.field4966;
                    class374 var22 = new class374(class593.method3442(false));
                    class565.field8299.method991(var22, true);
                    class136.field1663.method2096(-66, 0, var22.field4966, var22.field4929);
                    class136.field1663.method2083((byte) 76, class136.field1663.field4966 - var21);
                    class74.field865 = true;
                }
                if (class383.field5070 != null) {
                    if (~class617.field8931 == -3) {
                        class204.method1095((byte) 126);
                    } else if (class617.field8931 == 3) {
                        class84.method497((byte) -118);
                    }
                }
                if (class177.field2149) {
                    class177.field2149 = false;
                } else {
                    class237.field2969 /= 2.0F;
                }
                if (!class55.field482) {
                    class289.field3759 /= 2.0F;
                } else {
                    class55.field482 = false;
                }
                class514.method2950((byte) 61);
                if (~class137.field1671 == -10) {
                    class643.method3717((byte) -25);
                    class113.method674(false);
                    class614.method3528((byte) -110);
                    class415.method2367(-1);
                    ++class426.field5483;
                    if (class426.field5483 > 750) {
                        class276.method1567((byte) -29);
                    } else {
                        class343.method1913((byte) -123);
                        class42.method222(-14077);
                        class310.method1721(0);
                        for (int var23 = class281.field3700.method1636(true, 11032); ~var23 != 0; var23 = class281.field3700.method1636(false, 11032)) {
                            class217.method1247(var23, 1);
                            class286.field3730[class288.method1624(class641.field9243++, 31)] = var23;
                        }
                        for (class557 var24 = class349.method1948((byte) 67); var24 != null; var24 = class349.method1948((byte) 63)) {
                            int var25 = var24.method3263(65535);
                            int var26 = var24.method3262(11);
                            if (~var25 == -2) {
                                class386.field5085[var26] = var24.field8207;
                                class352.field4542 |= class118.field1486[var26];
                                class631.field9096[class288.method1624(31, class222.field2732++)] = var26;
                            } else if (~var25 != -3) {
                                if (var25 == 3) {
                                    class509 var27 = class61.method348(var26, true);
                                    if (!var24.field8216.equals(var27.field7078)) {
                                        var27.field7078 = var24.field8216;
                                        class87.method508(arg0 + 551697808, var27);
                                    }
                                } else if (~var25 == -5) {
                                    class509 var28 = class61.method348(var26, true);
                                    int var29 = var24.field8207;
                                    int var30 = var24.field8201;
                                    int var31 = var24.field8211;
                                    if (var28.field7102 != var29 || var28.field7097 != var30 || var28.field7202 != var31) {
                                        var28.field7102 = var29;
                                        var28.field7202 = var31;
                                        var28.field7097 = var30;
                                        class87.method508(arg0 ^ -551697776, var28);
                                    }
                                } else if (~var25 == -6) {
                                    class509 var32 = class61.method348(var26, true);
                                    if (var24.field8207 != var32.field7141 || var24.field8207 == -1) {
                                        var32.field7047 = 0;
                                        var32.field7084 = 0;
                                        var32.field7141 = var24.field8207;
                                        var32.field7063 = 1;
                                        class87.method508(127, var32);
                                    }
                                } else if (var25 != 6) {
                                    if (~var25 == -8) {
                                        class509 var33 = class61.method348(var26, true);
                                        boolean var34 = var24.field8207 == 1;
                                        if (!var34 == var33.field7125) {
                                            var33.field7125 = var34;
                                            class87.method508(124, var33);
                                        }
                                    } else if (~var25 == -9) {
                                        class509 var35 = class61.method348(var26, true);
                                        if (~var24.field8207 != ~var35.field7189 || var24.field8201 != var35.field7042 || var24.field8211 != var35.field7144) {
                                            var35.field7144 = var24.field8211;
                                            var35.field7042 = var24.field8201;
                                            var35.field7189 = var24.field8207;
                                            if (~var35.field7082 != 0) {
                                                if (var35.field7123 > 0) {
                                                    var35.field7144 = var35.field7144 * 32 / var35.field7123;
                                                } else if (~var35.field7095 < -1) {
                                                    var35.field7144 = var35.field7144 * 32 / var35.field7095;
                                                }
                                            }
                                            class87.method508(126, var35);
                                        }
                                    } else if (~var25 == -10) {
                                        class509 var36 = class61.method348(var26, true);
                                        if (~var24.field8207 != ~var36.field7082 || var24.field8201 != var36.field7163) {
                                            var36.field7163 = var24.field8201;
                                            var36.field7082 = var24.field8207;
                                            class87.method508(126, var36);
                                        }
                                    } else if (var25 != 10) {
                                        if (~var25 != -12) {
                                            if (~var25 != -13) {
                                                if (~var25 != -15) {
                                                    if (var25 != 15) {
                                                        if (var25 == 16) {
                                                            class509 var37 = class61.method348(var26, true);
                                                            var37.field7179 = var24.field8207;
                                                        }
                                                    } else {
                                                        class136.field1666 = var24.field8201;
                                                        class469.field6549 = var24.field8207;
                                                        class251.field3235 = true;
                                                    }
                                                } else {
                                                    class509 var38 = class61.method348(var26, true);
                                                    var38.field7065 = var24.field8207;
                                                }
                                            } else {
                                                class509 var39 = class61.method348(var26, true);
                                                int var40 = var24.field8207;
                                                if (var39 != null && var39.field7197 == 0) {
                                                    if (var40 > -var39.field7059 + var39.field7180) {
                                                        var40 = -var39.field7059 + var39.field7180;
                                                    }
                                                    if (var40 < 0) {
                                                        var40 = 0;
                                                    }
                                                    if (var39.field7104 != var40) {
                                                        var39.field7104 = var40;
                                                        class87.method508(arg0 + 551697808, var39);
                                                    }
                                                }
                                            }
                                        } else {
                                            class509 var41 = class61.method348(var26, true);
                                            var41.field7200 = 0;
                                            var41.field7139 = var41.field7071 = var24.field8207;
                                            var41.field7077 = 0;
                                            var41.field7110 = var41.field7051 = var24.field8201;
                                            class87.method508(126, var41);
                                        }
                                    } else {
                                        class509 var42 = class61.method348(var26, true);
                                        if (~var24.field8207 != ~var42.field7117 || var24.field8201 != var42.field7062 || var24.field8211 != var42.field7156) {
                                            var42.field7117 = var24.field8207;
                                            var42.field7156 = var24.field8211;
                                            var42.field7062 = var24.field8201;
                                            class87.method508(124, var42);
                                        }
                                    }
                                } else {
                                    int var43 = var24.field8207;
                                    int var44 = var43 >> 10 & 31;
                                    int var45 = (1022 & var43) >> 5;
                                    int var46 = var43 & 31;
                                    int var47 = (var44 << 19) + (var45 << 11) + (var46 << 3);
                                    class509 var48 = class61.method348(var26, true);
                                    if (~var48.field7085 != ~var47) {
                                        var48.field7085 = var47;
                                        class87.method508(127, var48);
                                    }
                                }
                            } else {
                                class267.field3471[var26] = var24.field8216;
                                class509.field7064[class288.method1624(31, class297.field3825++)] = var26;
                            }
                        }
                        if (class128.field1583 != 0) {
                            class281.field3689 += 20;
                            if (class281.field3689 >= 400) {
                                class128.field1583 = 0;
                            }
                        }
                        ++class590.field8557;
                        if (arg0 != -551697684) {
                            method1571(-55);
                        }
                        if (class106.field1292 != null) {
                            ++class33.field258;
                            if (~class33.field258 <= -16) {
                                class87.method508(125, class106.field1292);
                                class106.field1292 = null;
                            }
                        }
                        class390.field5151 = false;
                        class521.field7315 = false;
                        class195.field2369 = null;
                        class552.field8122 = null;
                        class355.method1996(-1, false, -1, (class509) null);
                        class415.method2371((class509) null, -1, 255, -1);
                        if (!class449.field6225) {
                            class71.field684 = -1;
                        }
                        class376.method2191((byte) 74);
                        ++class519.field7305;
                        if (class567.field8325) {
                            class418.method2378(17984, class210.field2561);
                            ++class237.field2968;
                            class136.field1663.method2131(class169.field2062 << 28 | class218.field2671 << 14 | class268.field3502, -1495157560);
                            class567.field8325 = false;
                        }
                        while (true) {
                            class503 var49;
                            class509 var50;
                            class509 var51;
                            do {
                                var49 = (class503) class91.field1122.method1054((byte) -105);
                                if (var49 == null) {
                                    while (true) {
                                        class503 var52;
                                        class509 var53;
                                        class509 var54;
                                        do {
                                            var52 = (class503) class105.field1273.method1054((byte) -105);
                                            if (var52 == null) {
                                                while (true) {
                                                    class503 var55;
                                                    class509 var56;
                                                    class509 var57;
                                                    do {
                                                        var55 = (class503) class119.field1503.method1054((byte) -105);
                                                        if (var55 == null) {
                                                            if (class552.field8122 == null) {
                                                                class141.field1705 = 0;
                                                            }
                                                            if (class289.field3757 != null) {
                                                                class118.method697((byte) -96);
                                                            }
                                                            if (~class633.field9120 < -1 && class443.field6109.method185(arg0 + 551697737, 82) && class443.field6109.method185(53, 81) && class549.field8067 != 0) {
                                                                int var58 = class103.field1265.field8660 - class549.field8067;
                                                                if (var58 >= 0) {
                                                                    if (var58 > 3) {
                                                                        var58 = 3;
                                                                    }
                                                                } else {
                                                                    var58 = 0;
                                                                }
                                                                class438.method2569(class103.field1265.field6483[0] + class632.field9113, true, var58, class103.field1265.field6491[0] + class119.field1504);
                                                            }
                                                            class175.method973((byte) -126);
                                                            for (int var59 = 0; ~var59 > -6; ++var59) {
                                                                int var10002 = class547.field8052[var59]++;
                                                            }
                                                            if (class352.field4542 && ~(-60000L + class190.method1030(false)) < ~class634.field9125) {
                                                                class474.method2759((byte) -120);
                                                            }
                                                            for (class299 var60 = (class299) class43.field347.method1987(true); var60 != null; var60 = (class299) class43.field347.method1994(6408)) {
                                                                if (-5L + class190.method1030(false) / 1000L > (long) var60.field3840) {
                                                                    if (~var60.field3837 < -1) {
                                                                        class589.method3415(var60.field3839 + class62.field620.method987(class31.field247, arg0 + 551697706), 5, "", 0, false, "");
                                                                    }
                                                                    if (var60.field3837 == 0) {
                                                                        class589.method3415(var60.field3839 + class570.field8371.method987(class31.field247, arg0 ^ -551697670), 5, "", 0, false, "");
                                                                    }
                                                                    var60.method610((byte) -89);
                                                                }
                                                            }
                                                            ++class318.field4055;
                                                            if (~class318.field4055 < -501) {
                                                                class318.field4055 = 0;
                                                                int var61 = (int) (8.0D * Math.random());
                                                                if (~(var61 & 2) == -3) {
                                                                    class466.field6524 += class255.field3275;
                                                                }
                                                                if ((var61 & 1) == 1) {
                                                                    class308.field3926 += class565.field8295;
                                                                }
                                                                if ((4 & var61) == 4) {
                                                                    class330.field4305 += class463.field6402;
                                                                }
                                                            }
                                                            if (~class308.field3926 > 49) {
                                                                class565.field8295 = 2;
                                                            }
                                                            if (~class308.field3926 < -51) {
                                                                class565.field8295 = -2;
                                                            }
                                                            if (class466.field6524 < -55) {
                                                                class255.field3275 = 2;
                                                            }
                                                            if (class330.field4305 < -40) {
                                                                class463.field6402 = 1;
                                                            }
                                                            if (class466.field6524 > 55) {
                                                                class255.field3275 = -2;
                                                            }
                                                            ++class364.field4779;
                                                            if (class330.field4305 > 40) {
                                                                class463.field6402 = -1;
                                                            }
                                                            if (~class364.field4779 < -501) {
                                                                class364.field4779 = 0;
                                                                int var62 = (int) (8.0D * Math.random());
                                                                if (~(var62 & 2) == -3) {
                                                                    class194.field2354 += class525.field7357;
                                                                }
                                                                if (~(var62 & 1) == -2) {
                                                                    class335.field4369 += class143.field1730;
                                                                }
                                                            }
                                                            if (~class335.field4369 > 59) {
                                                                class143.field1730 = 2;
                                                            }
                                                            if (~class335.field4369 < -61) {
                                                                class143.field1730 = -2;
                                                            }
                                                            if (class194.field2354 < -20) {
                                                                class525.field7357 = 1;
                                                            }
                                                            if (~class194.field2354 < -11) {
                                                                class525.field7357 = -1;
                                                            }
                                                            ++class472.field6609;
                                                            if (class472.field6609 > 50) {
                                                                ++class578.field8434;
                                                                class418.method2378(17984, class61.field594);
                                                            }
                                                            if (class523.field7334) {
                                                                class460.method2683(32);
                                                                class523.field7334 = false;
                                                            }
                                                            try {
                                                                if (class597.field8642 != null && class136.field1663.field4966 > 0) {
                                                                    class224.field2753 += class136.field1663.field4966;
                                                                    class597.field8642.method2264(0, 0, class136.field1663.field4929, class136.field1663.field4966);
                                                                    class472.field6609 = 0;
                                                                    class136.field1663.field4966 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var63) {
                                                                class276.method1567((byte) -29);
                                                                return;
                                                            }
                                                        }
                                                        var56 = var55.field6973;
                                                        if (~var56.field7086 > -1) {
                                                            break;
                                                        }
                                                        var57 = class61.method348(var56.field7054, true);
                                                    } while (var57 == null || var57.field7101 == null || ~var57.field7101.length >= ~var56.field7086 || var57.field7101[var56.field7086] != var56);
                                                    class630.method3608(var55);
                                                }
                                            }
                                            var53 = var52.field6973;
                                            if (var53.field7086 < 0) {
                                                break;
                                            }
                                            var54 = class61.method348(var53.field7054, true);
                                        } while (var54 == null || var54.field7101 == null || var53.field7086 >= var54.field7101.length || var54.field7101[var53.field7086] != var53);
                                        class630.method3608(var52);
                                    }
                                }
                                var50 = var49.field6973;
                                if (var50.field7086 < 0) {
                                    break;
                                }
                                var51 = class61.method348(var50.field7054, true);
                            } while (var51 == null || var51.field7101 == null || ~var51.field7101.length >= ~var50.field7086 || var51.field7101[var50.field7086] != var50);
                            class630.method3608(var49);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)V")
    public final void method501(int arg0, byte arg1, int arg2) {
        ++field3647;
        int var4 = this.field3643 * arg2 >> 12;
        int var5 = this.field3646 * arg2 >> 12;
        int var6 = this.field3648 * arg0 >> 12;
        int var7 = this.field3649 * arg0 >> 12;
        if (arg1 < -78) {
            class638.method3660(var5, var7, var4, (byte) 45, var6, super.field6077);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        ++field3645;
        int var4 = this.field3643 * arg1 >> 12;
        int var5 = this.field3646 * arg1 >> 12;
        int var6 = this.field3648 * arg0 >> 12;
        if (arg2 == 46) {
            int var7 = this.field3649 * arg0 >> 12;
            class80.method468(super.field6076, var7, var5, var4, arg2 ^ 12632, var6, super.field6079);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3649 = arg3;
        this.field3648 = arg1;
        this.field3646 = arg2;
        this.field3643 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1572(byte arg0) {
        if (arg0 < 102) {
            field3655 = -0.122440144F;
        }
        field3652 = null;
        field3644 = null;
        field3654 = null;
    }
}
