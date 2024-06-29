import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class313 extends class363 {

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "Lfd;")
    public class493 field3924;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "Lcb;")
    public class486 field3923;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    private static int field3928 = 2;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field3931 = 1;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 6)
    public static final void method1835(int arg0) {
        field3927++;
        if (class675.field9221 > 1) {
            class278.field3536 = class696.field9643;
            class675.field9221--;
        }
        if (class384.field4931) {
            class384.field4931 = false;
            class675.method3744((byte) 74);
            return;
        }
        if (!class367.field4752) {
            class29.method183(arg0 ^ 0xFFFFA1D5);
        }
        for (int var1 = 0; var1 < 100 && class510.method2778((byte) -42); var1++) {
        }
        if (class470.field5804 != 10) {
            return;
        }
        while (class29.method181(true)) {
            class124 var2 = class336.method1924(class60.field755, class636.field8620, (byte) -6);
            var2.field1516.method3090(0, 3);
            int var3 = var2.field1516.field7313;
            class322.method1859(0, var2.field1516);
            var2.field1516.method3036((byte) -118, var2.field1516.field7313 - var3);
            class197.method1156((byte) 98, var2);
        }
        if (class689.field9550 == null) {
            if (class321.method1854(-74) >= class345.field4414) {
                class689.field9550 = class124.field1518.method738(class360.field4628.field3035, (byte) 96);
            }
        } else if (class689.field9550.field7829 != -1) {
            class124 var4 = class336.method1924(class391.field5002, class636.field8620, (byte) 108);
            var4.field1516.method3080((byte) -108, class689.field9550.field7829);
            class197.method1156((byte) 123, var4);
            class689.field9550 = null;
            class345.field4414 = class321.method1854(arg0 ^ 0x5E4A) + 30000L;
        }
        class132 var5 = (class132) class500.field6235.method1909(true);
        if (var5 != null || (class321.method1854(arg0 + 24054) - 2000L) > class589.field7919) {
            class124 var6 = null;
            int var7 = 0;
            for (class132 var8 = (class132) class445.field5595.method1909(true); var8 != null && (var6 == null || var6.field1516.field7313 - var7 < 240); var8 = (class132) class445.field5595.method1916((byte) 84)) {
                var8.method1566(-102);
                int var9 = var8.method851(arg0 - 1160804779);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method860(true);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class621.field8436 != var10 || class24.field277 != var9) {
                    if (var6 == null) {
                        var6 = class336.method1924(class294.field3736, class636.field8620, (byte) 108);
                        class631.field8557++;
                        var6.field1516.method3090(0, 3);
                        var7 = var6.field1516.field7313;
                    }
                    int var11 = var10 - class621.field8436;
                    class621.field8436 = var10;
                    int var12 = var9 - class24.field277;
                    class24.field277 = var9;
                    int var13 = (int) ((var8.method854(arg0 ^ 0xFFFFDCA3) - class589.field7919) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field1516.method3080((byte) -124, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var6.field1516.method3090(var13 + 128, 3);
                        var11 += 128;
                        var6.field1516.method3080((byte) -65, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field1516.method3090(var13 + 192, 3);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1516.method3061(Integer.MIN_VALUE, (byte) 115);
                        } else {
                            var6.field1516.method3061(var10 | var9 << 16, (byte) 115);
                        }
                    } else {
                        var6.field1516.method3080((byte) -122, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1516.method3061(Integer.MIN_VALUE, (byte) 115);
                        } else {
                            var6.field1516.method3061(var10 | var9 << 16, (byte) 115);
                        }
                    }
                    class589.field7919 = var8.method854(32055);
                }
            }
            if (var6 != null) {
                var6.field1516.method3036((byte) -118, var6.field1516.field7313 - var7);
                class197.method1156((byte) 84, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method854(32055) - class321.field3996) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class321.field3996 = var5.method854(arg0 + 56227);
            int var16 = var5.method851(-1160828951);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method860(true);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method855((byte) -83) == 2) {
                var18 = 1;
            }
            class697.field9652++;
            int var19 = (int) var14;
            class124 var20 = class336.method1924(class487.field6086, class636.field8620, (byte) 101);
            var20.field1516.method3061(var16 << 16 | var17, (byte) 115);
            var20.field1516.method3051(true, var18 << 15 | var19);
            class197.method1156((byte) 95, var20);
        }
        if (class372.field4803 > 0) {
            class615.field8347++;
            class124 var21 = class336.method1924(class314.field3935, class636.field8620, (byte) 95);
            var21.field1516.method3090(class372.field4803 * 3, 3);
            for (int var22 = 0; var22 < class372.field4803; var22++) {
                class521 var23 = class389.field4991[var22];
                long var24 = (var23.method732((byte) 57) - class594.field7965) / 50L;
                class594.field7965 = var23.method732((byte) 57);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field1516.method3090(var23.method731((byte) -76), 3);
                var21.field1516.method3080((byte) -93, (int) var24);
            }
            class197.method1156((byte) 100, var21);
        }
        if (class594.field7961 > 0) {
            class594.field7961--;
        }
        if (class531.field6707 && class594.field7961 <= 0) {
            class691.field9579++;
            class531.field6707 = false;
            class594.field7961 = 20;
            class124 var26 = class336.method1924(class570.field7212, class636.field8620, (byte) -106);
            var26.field1516.method3067(1370571624, (int) class23.field266 >> 3);
            var26.field1516.method3051(true, (int) class689.field9561 >> 3);
            class197.method1156((byte) 120, var26);
        }
        if (class205.field2372 != class6.field61) {
            class165.field1937++;
            class6.field61 = class205.field2372;
            class124 var27 = class336.method1924(class379.field4870, class636.field8620, (byte) -23);
            var27.field1516.method3090(class205.field2372 ? 1 : 0, 3);
            class197.method1156((byte) 108, var27);
        }
        if (!class528.field6662) {
            class79.field1024++;
            class124 var28 = class336.method1924(class29.field345, class636.field8620, (byte) -44);
            var28.field1516.method3090(0, 3);
            int var29 = var28.field1516.field7313;
            class572 var30 = new class572(class510.method2781(true));
            class611.field8310.method3596(var30, (byte) 105);
            var28.field1516.method3091(var30.field7318, (byte) -71, 0, var30.field7313);
            var28.field1516.method3036((byte) -118, var28.field1516.field7313 - var29);
            class197.method1156((byte) 113, var28);
            class528.field6662 = true;
        }
        if (class407.field5237 != null) {
            if (class385.field4946 == 2) {
                class561.method2984(23);
            } else if (class385.field4946 == 3) {
                class257.method1535(arg0 ^ 0xFFFFA1DC);
            }
        }
        if (class72.field940) {
            class72.field940 = false;
        } else {
            class350.field4524 /= 2.0F;
        }
        if (class135.field1639) {
            class135.field1639 = false;
        } else {
            class441.field5547 /= 2.0F;
        }
        class293.method1772((byte) 126);
        if (class470.field5804 != 10) {
            return;
        }
        class82.method627(62);
        class545.method2920((byte) 65);
        class287.method1727(2);
        class334.method1918(-126);
        class295.field3741++;
        if (class295.field3741 > 750) {
            class675.method3744((byte) 74);
            return;
        }
        if (arg0 != -24172) {
            method1835(33);
        }
        class1.method2(arg0 ^ 0xFFFFA1EB);
        class351.method2022(-7403);
        class483.method2630((byte) -109);
        for (int var31 = class327.field4084.method307((byte) 43, true); var31 != -1; var31 = class327.field4084.method307((byte) 43, false)) {
            class315.method1841(var31, true);
            class33.field517[class109.method762(class175.field2050++, 31)] = var31;
        }
        for (class243 var32 = class608.method3379(arg0 + 24174); var32 != null; var32 = class608.method3379(2)) {
            int var33 = var32.method1463((byte) 124);
            int var34 = var32.method1461((byte) 114);
            if (var33 == 1) {
                class500.field6238[var34] = var32.field3132;
                class290.field3668 |= class656.field8925[var34];
                class301.field3834[class109.method762(class51.field651++, 31)] = var34;
            } else if (var33 == 2) {
                class523.field6615[var34] = var32.field3139;
                class161.field1892[class109.method762(class183.field2155++, 31)] = var34;
            } else if (var33 == 3) {
                class337 var35 = class442.method2421(var34, 76);
                if (!var32.field3139.equals(var35.field4200)) {
                    var35.field4200 = var32.field3139;
                    class99.method721((byte) 116, var35);
                }
            } else if (var33 == 4) {
                class337 var36 = class442.method2421(var34, 54);
                int var37 = var32.field3132;
                int var38 = var32.field3135;
                int var39 = var32.field3130;
                if (var36.field4158 != var37 || var36.field4266 != var38 || var36.field4313 != var39) {
                    var36.field4313 = var39;
                    var36.field4158 = var37;
                    var36.field4266 = var38;
                    class99.method721((byte) -32, var36);
                }
            } else if (var33 == 5) {
                class337 var40 = class442.method2421(var34, 62);
                if (var32.field3132 != var40.field4256 || var32.field3132 == -1) {
                    var40.field4264 = 0;
                    var40.field4256 = var32.field3132;
                    var40.field4159 = 1;
                    var40.field4315 = 0;
                    class207 var41 = var40.field4256 == -1 ? null : class11.field110.method1141(var40.field4256, (byte) 112);
                    if (var41 != null) {
                        class309.method1829(true, var40.field4315, var41);
                    }
                    class99.method721((byte) -66, var40);
                }
            } else if (var33 == 6) {
                int var42 = var32.field3132;
                int var43 = var42 >> 10 & 0x1F;
                int var44 = (var42 & 0x3F7) >> 5;
                int var45 = var42 & 0x1F;
                int var46 = (var45 << 3) + (var43 << 19) + (var44 << 11);
                class337 var47 = class442.method2421(var34, 100);
                if (var47.field4184 != var46) {
                    var47.field4184 = var46;
                    class99.method721((byte) 119, var47);
                }
            } else if (var33 == 7) {
                class337 var48 = class442.method2421(var34, 82);
                boolean var49 = var32.field3132 == 1;
                if (var48.field4185 != var49) {
                    var48.field4185 = var49;
                    class99.method721((byte) 118, var48);
                }
            } else if (var33 == 8) {
                class337 var50 = class442.method2421(var34, arg0 ^ 0xFFFFA1C6);
                if (var32.field3132 != var50.field4284 || var32.field3135 != var50.field4182 || var32.field3130 != var50.field4194) {
                    var50.field4194 = var32.field3130;
                    var50.field4182 = var32.field3135;
                    var50.field4284 = var32.field3132;
                    if (var50.field4252 != -1) {
                        if (var50.field4214 > 0) {
                            var50.field4194 = var50.field4194 * 32 / var50.field4214;
                        } else if (var50.field4306 > 0) {
                            var50.field4194 = var50.field4194 * 32 / var50.field4306;
                        }
                    }
                    class99.method721((byte) -11, var50);
                }
            } else if (var33 == 9) {
                class337 var57 = class442.method2421(var34, arg0 ^ 0xFFFFA1ED);
                if (var32.field3132 != var57.field4252 || var32.field3135 != var57.field4229) {
                    var57.field4252 = var32.field3132;
                    var57.field4229 = var32.field3135;
                    class99.method721((byte) 114, var57);
                }
            } else if (var33 == 10) {
                class337 var56 = class442.method2421(var34, 101);
                if (var32.field3132 != var56.field4262 || var32.field3135 != var56.field4175 || var32.field3130 != var56.field4238) {
                    var56.field4175 = var32.field3135;
                    var56.field4262 = var32.field3132;
                    var56.field4238 = var32.field3130;
                    class99.method721((byte) 119, var56);
                }
            } else if (var33 == 11) {
                class337 var51 = class442.method2421(var34, 110);
                var51.field4153 = var51.field4222 = var32.field3132;
                var51.field4281 = 0;
                var51.field4227 = var51.field4303 = var32.field3135;
                var51.field4273 = 0;
                class99.method721((byte) -44, var51);
            } else if (var33 == 12) {
                class337 var52 = class442.method2421(var34, 112);
                int var53 = var32.field3132;
                if (var52 != null && var52.field4212 == 0) {
                    if (var53 > var52.field4280 - var52.field4211) {
                        var53 = var52.field4280 - var52.field4211;
                    }
                    if (var53 < 0) {
                        var53 = 0;
                    }
                    if (var52.field4208 != var53) {
                        var52.field4208 = var53;
                        class99.method721((byte) -13, var52);
                    }
                }
            } else if (var33 == 14) {
                class337 var55 = class442.method2421(var34, arg0 + 24240);
                var55.field4275 = var32.field3132;
            } else if (var33 == 15) {
                class435.field5478 = true;
                class295.field3763 = var32.field3132;
                class536.field6752 = var32.field3135;
            } else if (var33 == 16) {
                class337 var54 = class442.method2421(var34, 85);
                var54.field4294 = var32.field3132;
            }
        }
        class231.field3008++;
        if (class315.field3949 != 0) {
            class406.field5235 += 20;
            if (class406.field5235 >= 400) {
                class315.field3949 = 0;
            }
        }
        if (class71.field922 != null) {
            class51.field656++;
            if (class51.field656 >= 15) {
                class99.method721((byte) 116, class71.field922);
                class71.field922 = null;
            }
        }
        class300.field3811 = false;
        class528.field6660 = null;
        class46.field621 = false;
        class578.field7767 = null;
        class628.method3508(null, -1, -1354365800, -1);
        class221.method1267((byte) -112, null, -1, -1);
        if (!class37.field542) {
            class530.field6684 = -1;
        }
        class97.method717(-108);
        class696.field9643++;
        if (class500.field6239) {
            class21.field227++;
            class124 var58 = class336.method1924(class477.field5945, class636.field8620, (byte) -83);
            var58.field1516.method3089((byte) -94, class466.field5776 << 14 | class387.field4958 << 28 | class243.field3148);
            class197.method1156((byte) 85, var58);
            class500.field6239 = false;
        }
        while (true) {
            class402 var59;
            class337 var60;
            class337 var61;
            do {
                var59 = (class402) class315.field3946.method1906(98);
                if (var59 == null) {
                    while (true) {
                        class402 var62;
                        class337 var63;
                        class337 var64;
                        do {
                            var62 = (class402) class692.field9589.method1906(124);
                            if (var62 == null) {
                                while (true) {
                                    class402 var65;
                                    class337 var66;
                                    class337 var67;
                                    do {
                                        var65 = (class402) class144.field1743.method1906(88);
                                        if (var65 == null) {
                                            if (class578.field7767 == null) {
                                                class336.field4145 = 0;
                                            }
                                            if (class338.field4324 != null) {
                                                class66.method523(false);
                                            }
                                            if (class146.field1745 > 0 && class307.field3884.method1592((byte) -120, 82) && class307.field3884.method1592((byte) -120, 81) && class278.field3538 != 0) {
                                                int var68 = class67.field815.field8010 - class278.field3538;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class667.method3709(63, var68, class67.field815.field511[0] + class522.field6612, class67.field815.field508[0] + class227.field2938);
                                            }
                                            class560.method2977(-25195);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class47.field633[var69]++;
                                            }
                                            if (class290.field3668 && (class321.method1854(-111) - 60000L) > class141.field1689) {
                                                class81.method616(10522);
                                            }
                                            for (class500 var70 = (class500) class207.field2432.method1715((byte) 122); var70 != null; var70 = (class500) class207.field2432.method1712((byte) 2)) {
                                                if ((long) var70.field6237 < class321.method1854(-52) / 1000L - 5L) {
                                                    if (var70.field6233 > 0) {
                                                        class417.method2324("", "", "", var70.field6236 + class671.field9133.method3726((byte) 48, class71.field912), 0, (byte) -95, 5);
                                                    }
                                                    if (var70.field6233 == 0) {
                                                        class417.method2324("", "", "", var70.field6236 + class671.field9134.method3726((byte) 100, class71.field912), 0, (byte) -95, 5);
                                                    }
                                                    var70.method1619((byte) -75);
                                                }
                                            }
                                            class252.field3255++;
                                            if (class252.field3255 > 500) {
                                                class252.field3255 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x2) == 2) {
                                                    class3.field27 += field3928;
                                                }
                                                if ((var71 & 0x1) == 1) {
                                                    class339.field4335 += class702.field9816;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class491.field6125 += class81.field1055;
                                                }
                                            }
                                            if (class339.field4335 < -50) {
                                                class702.field9816 = 2;
                                            }
                                            if (class3.field27 < -55) {
                                                field3928 = 2;
                                            }
                                            if (class339.field4335 > 50) {
                                                class702.field9816 = -2;
                                            }
                                            if (class491.field6125 < -40) {
                                                class81.field1055 = 1;
                                            }
                                            if (class3.field27 > 55) {
                                                field3928 = -2;
                                            }
                                            class207.field2428++;
                                            if (class491.field6125 > 40) {
                                                class81.field1055 = -1;
                                            }
                                            if (class207.field2428 > 500) {
                                                class207.field2428 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class352.field4559 += class564.field7066;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class290.field3661 += class343.field4374;
                                                }
                                            }
                                            if (class290.field3661 < -60) {
                                                class343.field4374 = 2;
                                            }
                                            if (class290.field3661 > 60) {
                                                class343.field4374 = -2;
                                            }
                                            if (class352.field4559 < -20) {
                                                class564.field7066 = 1;
                                            }
                                            if (class352.field4559 > 10) {
                                                class564.field7066 = -1;
                                            }
                                            class299.field3800++;
                                            if (class299.field3800 > 50) {
                                                class491.field6131++;
                                                class124 var73 = class336.method1924(class289.field3653, class636.field8620, (byte) 102);
                                                class197.method1156((byte) 87, var73);
                                            }
                                            if (class256.field3280) {
                                                class577.method3197(117);
                                                class256.field3280 = false;
                                            }
                                            try {
                                                class605.method3355(arg0 + 24261);
                                                return;
                                            } catch (IOException var74) {
                                                class675.method3744((byte) 74);
                                                return;
                                            }
                                        }
                                        var66 = var65.field5154;
                                        if (var66.field4310 < 0) {
                                            break;
                                        }
                                        var67 = class442.method2421(var66.field4190, arg0 ^ 0xFFFFA1E7);
                                    } while (var67 == null || var67.field4179 == null || var67.field4179.length <= var66.field4310 || var67.field4179[var66.field4310] != var66);
                                    class620.method3450(var65);
                                }
                            }
                            var63 = var62.field5154;
                            if (var63.field4310 < 0) {
                                break;
                            }
                            var64 = class442.method2421(var63.field4190, arg0 + 24246);
                        } while (var64 == null || var64.field4179 == null || var63.field4310 >= var64.field4179.length || var64.field4179[var63.field4310] != var63);
                        class620.method3450(var62);
                    }
                }
                var60 = var59.field5154;
                if (var60.field4310 < 0) {
                    break;
                }
                var61 = class442.method2421(var60.field4190, 93);
            } while (var61 == null || var61.field4179 == null || var60.field4310 >= var61.field4179.length || var61.field4179[var60.field4310] != var60);
            class620.method3450(var59);
        }
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V", line = 868)
    public final void method1836(int arg0) {
        this.field3926 = this.field3924.field6141;
        field3929++;
        this.field3933 = this.field3924.field6147;
        if (arg0 != 750) {
            return;
        }
        this.field3932 = this.field3924.field6151;
        if (this.field3924.field6142 != null) {
            this.field3924.field6142.method574(this.field3923.field6037, this.field3923.field6048, this.field3923.field6051, class391.field5004);
        }
        this.field3925 = class391.field5004[2];
        this.field3930 = class391.field5004[0];
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lfd;Ll;)V", line = 908)
    public class313(class493 arg0, class18 arg1) {
        this.field3924 = arg0;
        this.field3923 = this.field3924.method2673(2);
        this.method1836(750);
    }
}
