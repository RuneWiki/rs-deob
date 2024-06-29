import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class113 extends class298 {

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    private int field1394 = -1;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "[I")
    public int[] field1385;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[[I", line = 6)
    public int[][] method157(int arg0, int arg1) {
        if (arg0 != -24032) {
            return null;
        } else {
            ++field1384;
            int[][] var3 = super.field4454.method1638((byte) 3, arg1);
            if (super.field4454.field3886 && this.method547(-105)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field1388 * (class388.field5561 != this.field1392 ? this.field1392 * arg1 / class388.field5561 : arg1);
                if (class158.field1877 != this.field1388) {
                    for (int var8 = 0; ~var8 > ~class158.field1877; ++var8) {
                        int var9 = this.field1388 * var8 / class158.field1877;
                        int var10 = this.field1385[var7 + var9];
                        var6[var8] = class444.method2618(var10 << 4, 4080);
                        var5[var8] = class444.method2618(var10 >> 4, 4080);
                        var4[var8] = class444.method2618(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class158.field1877; ++var11) {
                        int var12 = this.field1385[var7++];
                        var6[var11] = class444.method2618(var12, 255) << 4;
                        var5[var11] = class444.method2618(65280, var12) >> 4;
                        var4[var11] = class444.method2618(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 76)
    public static final void method541(int arg0) {
        ++field1391;
        for (class41 var1 = (class41) class56.field712.method802((byte) 121); var1 != null; var1 = (class41) class56.field712.method806((byte) 104)) {
            if (var1.field497 != -1) {
                var1.method702((byte) -114);
            } else {
                var1.field486 = 0;
                class456.method2687(var1, -4);
            }
        }
        if (arg0 != -15523) {
            method546((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V", line = 105)
    public static final void method542(byte arg0) {
        ++field1386;
        if (class28.field366 > 1) {
            --class28.field366;
            class360.field5190 = class129.field1601;
        }
        if (~class432.field6253 < -1) {
            --class432.field6253;
        }
        if (class34.field414) {
            class34.field414 = false;
            class96.method471((byte) -46);
        } else {
            if (!class385.field5517) {
                class364.method2211(arg0 + -92);
            }
            for (int var1 = 0; var1 < 100 && class192.method1045(arg0 ^ -126); ++var1) {
            }
            if (~class453.field6415 == -31) {
                class313.method1938(class230.field3185, arg0 + -6422, class435.field6263.method369((byte) 127));
                if (class418.field6021 == null) {
                    if (class110.field1330 <= class434.method2591(-19310)) {
                        class418.field6021 = class99.field1213.method2070(arg0 + 73, class169.field2007);
                    }
                } else if (class418.field6021.field4324 != -1) {
                    class244.method1332((byte) -8, class12.field171);
                    class230.field3185.method884(class418.field6021.field4324, true);
                    class418.field6021 = null;
                    class110.field1330 = 30000L + class434.method2591(-19310);
                }
                if (class361.field5205 != null || class45.field589 < -2000L + class434.method2591(-19310)) {
                    boolean var2 = false;
                    int var3 = class230.field3185.field2206;
                    for (class100 var4 = (class100) class392.field5583.method802((byte) 108); var4 != null && -var3 + class230.field3185.field2206 < 240; var4 = (class100) class392.field5583.method806((byte) 104)) {
                        var4.method702((byte) -114);
                        int var5 = var4.method487((byte) 96);
                        if (~var5 <= -1) {
                            if (var5 > 65534) {
                                var5 = 65534;
                            }
                        } else {
                            var5 = 0;
                        }
                        int var6 = var4.method490(0);
                        if (var6 < 0) {
                            var6 = 0;
                        } else if (var6 > 65534) {
                            var6 = 65534;
                        }
                        boolean var7 = false;
                        if (var4.method487((byte) 96) == -1 && ~var4.method490(0) == 0) {
                            var5 = -1;
                            var6 = -1;
                            var7 = true;
                        }
                        if (~class442.field6321 != ~var6 || ~class216.field2982 != ~var5) {
                            if (!var2) {
                                ++class368.field5254;
                                class244.method1332((byte) 126, class4.field45);
                                class230.field3185.method909(0, -1);
                                var2 = true;
                                var3 = class230.field3185.field2206;
                            }
                            int var8 = var6 - class442.field6321;
                            class442.field6321 = var6;
                            int var9 = -class216.field2982 + var5;
                            class216.field2982 = var5;
                            int var10 = (int) ((var4.method489(true) + -class45.field589) / 20L);
                            if (~var10 > -9 && var8 >= -32 && var8 <= 31 && ~var9 <= 31 && var9 <= 31) {
                                var9 += 32;
                                var8 += 32;
                                class230.field3185.method884((var8 << 6) + (var10 << 12) + var9, true);
                            } else if (~var10 > -33 && ~var8 <= 127 && ~var8 >= -128 && ~var9 <= 127 && ~var9 >= -128) {
                                var9 += 128;
                                class230.field3185.method909(var10 + 128, arg0 + 9);
                                var8 += 128;
                                class230.field3185.method884((var8 << 8) - -var9, true);
                            } else if (~var10 > -33) {
                                class230.field3185.method909(var10 + 192, -1);
                                if (!var7) {
                                    class230.field3185.method897(var5 << 16 | var6, -106);
                                } else {
                                    class230.field3185.method897(Integer.MIN_VALUE, arg0 + -118);
                                }
                            } else {
                                class230.field3185.method884(57344 - -var10, true);
                                if (var7) {
                                    class230.field3185.method897(Integer.MIN_VALUE, -127);
                                } else {
                                    class230.field3185.method897(var6 | var5 << 16, -108);
                                }
                            }
                            class45.field589 = var4.method489(true);
                        }
                    }
                    if (var2) {
                        class230.field3185.method890(-var3 + class230.field3185.field2206, 98);
                    }
                }
                if (class361.field5205 != null) {
                    long var11 = (class361.field5205.method489(true) + -class35.field436) / 50L;
                    class35.field436 = class361.field5205.method489(true);
                    if (~var11 < -32768L) {
                        var11 = 32767L;
                    }
                    int var13 = class361.field5205.method487((byte) 96);
                    if (~var13 > -1) {
                        var13 = 0;
                    } else if (~var13 < -65536) {
                        var13 = 65535;
                    }
                    int var14 = class361.field5205.method490(0);
                    if (var14 >= 0) {
                        if (var14 > 65535) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    byte var15 = 0;
                    if (class361.field5205.method488((byte) 77) == 2) {
                        var15 = 1;
                    }
                    int var16 = (int) var11;
                    ++class463.field6528;
                    class244.method1332((byte) 124, class307.field4521);
                    class230.field3185.method884(var15 << 15 | var16, true);
                    class230.field3185.method897(var13 << 16 | var14, arg0 ^ 118);
                }
                if (~class42.field506 < -1) {
                    int var17 = 0;
                    for (int var18 = 0; class42.field506 > var18; ++var18) {
                        if (class257.field3719[var18].method1919(arg0 ^ -94)) {
                            ++var17;
                        }
                    }
                    if (var17 > 0) {
                        class244.method1332((byte) 125, class351.field5042);
                        if (var17 > 75) {
                            var17 = 75;
                        }
                        ++class140.field1682;
                        class230.field3185.method909(var17 * 3, -1);
                        for (int var19 = 0; class42.field506 > var19; ++var19) {
                            class348 var20 = class257.field3719[var19];
                            if (var20.method1919(arg0 + 137)) {
                                long var21 = (var20.method1922(8) + -class444.field6331) / 50L;
                                if (var21 > 65535L) {
                                    var21 = 65535L;
                                }
                                class444.field6331 = var20.method1922(8);
                                class230.field3185.method909(var20.method1921((byte) -100), arg0 + 9);
                                class230.field3185.method884((int) var21, true);
                            }
                        }
                    }
                }
                if (class487.field6904 > 0) {
                    --class487.field6904;
                }
                if (class83.field1010 && ~class487.field6904 >= -1) {
                    ++class212.field2930;
                    class487.field6904 = 20;
                    class83.field1010 = false;
                    class244.method1332((byte) 126, class327.field4710);
                    class230.field3185.method878(true, (int) class31.field389 >> 3);
                    class230.field3185.method878(true, (int) class349.field5021 >> 3);
                }
                if (class87.field1087 && !class483.field6816) {
                    ++class187.field2500;
                    class483.field6816 = true;
                    class244.method1332((byte) -99, class443.field6328);
                    class230.field3185.method909(1, -1);
                }
                if (!class87.field1087 && class483.field6816) {
                    ++class187.field2500;
                    class483.field6816 = false;
                    class244.method1332((byte) -76, class443.field6328);
                    class230.field3185.method909(0, -1);
                }
                if (!class231.field3211) {
                    ++class265.field3820;
                    class244.method1332((byte) -41, class342.field4895);
                    class230.field3185.method897(class379.method2269(16853), -122);
                    class231.field3211 = true;
                }
                if (class293.field4356 != null) {
                    if (~class358.field5167 != -3) {
                        if (~class358.field5167 == -4) {
                            class360.method2196((byte) -30);
                        }
                    } else {
                        class82.method418(8654);
                    }
                }
                if (class400.field5697) {
                    class400.field5697 = false;
                } else {
                    class184.field2404 /= 2.0F;
                }
                if (class471.field6644) {
                    class471.field6644 = false;
                } else {
                    class195.field2667 /= 2.0F;
                }
                class129.method613(arg0 ^ -74);
                if (~class453.field6415 == -31) {
                    class354.method2147((byte) 93);
                    class232.method1280((byte) -92);
                    class50.method267(false);
                    class41.method209(-120);
                    ++class159.field1908;
                    if (~class159.field1908 < -751) {
                        class96.method471((byte) -111);
                    } else {
                        class13.method99(16);
                        class307.method1913(false);
                        class71.method364(arg0 ^ -10);
                        for (int var23 = class75.field909.method2711((byte) 57, true); var23 != -1; var23 = class75.field909.method2711((byte) 115, false)) {
                            class225.method1242((byte) 120, var23);
                            class474.field6655[class444.method2618(31, class217.field3011++)] = var23;
                        }
                        for (class89 var24 = class343.method2088(false); var24 != null; var24 = class343.method2088(false)) {
                            int var25 = var24.method451(244325600);
                            int var26 = var24.method445(-21012);
                            if (var25 == 1) {
                                class288.field4312[var26] = var24.field1106;
                                class176.field2130 |= class190.field2599[var26];
                                class153.field1837[class444.method2618(31, class448.field6363++)] = var26;
                            } else if (var25 == 2) {
                                class44.field565[var26] = var24.field1120;
                                class94.field1181[class444.method2618(class329.field4735++, 31)] = var26;
                            } else if (~var25 != -4) {
                                if (var25 == 4) {
                                    class256 var27 = class399.method2387(var26, -1857167024);
                                    int var28 = var24.field1106;
                                    int var29 = var24.field1100;
                                    int var30 = var24.field1111;
                                    if (var27.field3596 != var28 || var27.field3674 != var29 || var27.field3610 != var30) {
                                        var27.field3610 = var30;
                                        var27.field3596 = var28;
                                        var27.field3674 = var29;
                                        class398.method2383(var27, 6);
                                    }
                                } else if (var25 != 5) {
                                    if (var25 != 6) {
                                        if (~var25 != -8) {
                                            if (~var25 != -9) {
                                                if (var25 != 9) {
                                                    if (var25 != 10) {
                                                        if (~var25 == -12) {
                                                            class256 var31 = class399.method2387(var26, -1857167024);
                                                            var31.field3703 = var31.field3562 = var24.field1106;
                                                            var31.field3576 = var31.field3560 = var24.field1100;
                                                            var31.field3671 = 0;
                                                            var31.field3608 = 0;
                                                            class398.method2383(var31, 35);
                                                        } else if (~var25 != -13) {
                                                            if (var25 != 14) {
                                                                if (~var25 == -16) {
                                                                    class158.field1886 = var24.field1106;
                                                                    class4.field52 = var24.field1100;
                                                                    class317.field4623 = true;
                                                                } else if (var25 == 16) {
                                                                    class256 var32 = class399.method2387(var26, -1857167024);
                                                                    var32.field3687 = var24.field1106;
                                                                }
                                                            } else {
                                                                class256 var33 = class399.method2387(var26, -1857167024);
                                                                var33.field3563 = var24.field1106;
                                                            }
                                                        } else {
                                                            class256 var34 = class399.method2387(var26, -1857167024);
                                                            int var35 = var24.field1106;
                                                            if (var34 != null && var34.field3654 == 0) {
                                                                if (-var34.field3707 + var34.field3695 < var35) {
                                                                    var35 = -var34.field3707 + var34.field3695;
                                                                }
                                                                if (~var35 > -1) {
                                                                    var35 = 0;
                                                                }
                                                                if (var34.field3658 != var35) {
                                                                    var34.field3658 = var35;
                                                                    class398.method2383(var34, arg0 + 98);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        class256 var36 = class399.method2387(var26, arg0 + -1857167014);
                                                        if (var24.field1106 != var36.field3587 || var24.field1100 != var36.field3710 || var24.field1111 != var36.field3675) {
                                                            var36.field3675 = var24.field1111;
                                                            var36.field3587 = var24.field1106;
                                                            var36.field3710 = var24.field1100;
                                                            class398.method2383(var36, 126);
                                                        }
                                                    }
                                                } else {
                                                    class256 var37 = class399.method2387(var26, -1857167024);
                                                    if (~var24.field1106 != ~var37.field3585 || var24.field1100 != var37.field3655) {
                                                        var37.field3655 = var24.field1100;
                                                        var37.field3585 = var24.field1106;
                                                        class398.method2383(var37, 24);
                                                    }
                                                }
                                            } else {
                                                class256 var38 = class399.method2387(var26, -1857167024);
                                                if (var24.field1106 != var38.field3567 || var24.field1100 != var38.field3681 || ~var24.field1111 != ~var38.field3607) {
                                                    var38.field3567 = var24.field1106;
                                                    var38.field3681 = var24.field1100;
                                                    var38.field3607 = var24.field1111;
                                                    if (~var38.field3585 != 0) {
                                                        if (~var38.field3614 < -1) {
                                                            var38.field3607 = var38.field3607 * 32 / var38.field3614;
                                                        } else if (~var38.field3580 < -1) {
                                                            var38.field3607 = var38.field3607 * 32 / var38.field3580;
                                                        }
                                                    }
                                                    class398.method2383(var38, arg0 + 79);
                                                }
                                            }
                                        } else {
                                            class256 var39 = class399.method2387(var26, -1857167024);
                                            boolean var40 = var24.field1106 == 1;
                                            if (!var39.field3656 == var40) {
                                                var39.field3656 = var40;
                                                class398.method2383(var39, arg0 ^ -59);
                                            }
                                        }
                                    } else {
                                        int var41 = var24.field1106;
                                        int var42 = (var41 & 32702) >> 10;
                                        int var43 = (1019 & var41) >> 5;
                                        int var44 = 31 & var41;
                                        int var45 = (var42 << 19) + (var43 << 11) + (var44 << 3);
                                        class256 var46 = class399.method2387(var26, -1857167024);
                                        if (var46.field3679 != var45) {
                                            var46.field3679 = var45;
                                            class398.method2383(var46, 51);
                                        }
                                    }
                                } else {
                                    class256 var47 = class399.method2387(var26, -1857167024);
                                    if (~var24.field1106 != ~var47.field3572 || var24.field1106 == -1) {
                                        var47.field3572 = var24.field1106;
                                        var47.field3637 = 1;
                                        var47.field3696 = 0;
                                        var47.field3639 = 0;
                                        class398.method2383(var47, 80);
                                    }
                                }
                            } else {
                                class256 var48 = class399.method2387(var26, -1857167024);
                                if (!var24.field1120.equals(var48.field3663)) {
                                    var48.field3663 = var24.field1120;
                                    class398.method2383(var48, 36);
                                }
                            }
                        }
                        ++class263.field3805;
                        if (class322.field4659 != 0) {
                            class347.field4955 += 20;
                            if (~class347.field4955 <= -401) {
                                class322.field4659 = 0;
                            }
                        }
                        if (class119.field1474 != null) {
                            ++class258.field3725;
                            if (~class258.field3725 <= -16) {
                                class398.method2383(class119.field1474, arg0 ^ -89);
                                class119.field1474 = null;
                            }
                        }
                        class183.field2365 = false;
                        class261.field3763 = null;
                        class105.field1271 = false;
                        class289.field4318 = null;
                        class430.method2577(-1, 122, -1, (class256) null);
                        class237.method1306(-1, (class256) null, (byte) 24, -1);
                        class85.method431(-103);
                        ++class129.field1601;
                        if (class189.field2595) {
                            class244.method1332((byte) 126, class57.field720);
                            ++class288.field4311;
                            class230.field3185.method897(class362.field5220 << 28 | class207.field2849 << 14 | class82.field991, -123);
                            class189.field2595 = false;
                        }
                        while (true) {
                            class35 var49;
                            class256 var50;
                            class256 var51;
                            do {
                                var49 = (class35) class205.field2808.method810(26315);
                                if (var49 == null) {
                                    while (true) {
                                        class35 var52;
                                        class256 var53;
                                        class256 var54;
                                        do {
                                            var52 = (class35) class390.field5574.method810(arg0 ^ -26307);
                                            if (var52 == null) {
                                                while (true) {
                                                    class35 var55;
                                                    class256 var56;
                                                    class256 var57;
                                                    do {
                                                        var55 = (class35) class12.field177.method810(arg0 ^ -26307);
                                                        if (var55 == null) {
                                                            if (class289.field4318 == null) {
                                                                class318.field4628 = 0;
                                                            }
                                                            if (class484.field6868 != null) {
                                                                class204.method1118(false);
                                                            }
                                                            if (class369.field5285 > 0 && class308.field4529.method1689((byte) -118, 82) && class308.field4529.method1689((byte) -118, 81) && class483.field6824 != 0) {
                                                                int var58 = class19.field258.field994 - class483.field6824;
                                                                if (~var58 > -1) {
                                                                    var58 = 0;
                                                                } else if (~var58 < -4) {
                                                                    var58 = 3;
                                                                }
                                                                class340.method2064(class19.field258.field2536[0] + class349.field5023, class19.field258.field2539[0] + class93.field1163, var58, -7207);
                                                            }
                                                            class297.method1875(-114);
                                                            for (int var59 = 0; var59 < 5; ++var59) {
                                                                int var10002 = class293.field4350[var59]++;
                                                            }
                                                            if (class176.field2130 && class128.field1582 < class434.method2591(arg0 + -19300) - 60000L) {
                                                                class451.method2641((byte) 65);
                                                            }
                                                            ++class72.field872;
                                                            if (~class72.field872 < -501) {
                                                                class72.field872 = 0;
                                                                int var60 = (int) (Math.random() * 8.0D);
                                                                if ((1 & var60) == 1) {
                                                                    class442.field6320 += client.field3931;
                                                                }
                                                                if (~(4 & var60) == -5) {
                                                                    class2.field12 += class294.field4365;
                                                                }
                                                                if (~(2 & var60) == -3) {
                                                                    class397.field5648 += class329.field4744;
                                                                }
                                                            }
                                                            if (class442.field6320 < -50) {
                                                                client.field3931 = 2;
                                                            }
                                                            if (~class442.field6320 < -51) {
                                                                client.field3931 = -2;
                                                            }
                                                            if (~class397.field5648 > 54) {
                                                                class329.field4744 = 2;
                                                            }
                                                            if (~class397.field5648 < -56) {
                                                                class329.field4744 = -2;
                                                            }
                                                            if (~class2.field12 > 39) {
                                                                class294.field4365 = 1;
                                                            }
                                                            ++class285.field4206;
                                                            if (class2.field12 > 40) {
                                                                class294.field4365 = -1;
                                                            }
                                                            if (class285.field4206 > 500) {
                                                                class285.field4206 = 0;
                                                                int var61 = (int) (8.0D * Math.random());
                                                                if (~(var61 & 2) == -3) {
                                                                    class415.field6000 += class63.field795;
                                                                }
                                                                if ((var61 & 1) == 1) {
                                                                    class367.field5251 += class413.field5889;
                                                                }
                                                            }
                                                            if (~class367.field5251 > 59) {
                                                                class413.field5889 = 2;
                                                            }
                                                            if (~class415.field6000 > 19) {
                                                                class63.field795 = 1;
                                                            }
                                                            if (class367.field5251 > 60) {
                                                                class413.field5889 = -2;
                                                            }
                                                            if (class415.field6000 > 10) {
                                                                class63.field795 = -1;
                                                            }
                                                            ++class93.field1161;
                                                            if (~class93.field1161 < -51) {
                                                                class244.method1332((byte) -93, class185.field2426);
                                                                ++class304.field4501;
                                                            }
                                                            if (class444.field6332) {
                                                                class229.method1263(1);
                                                                class444.field6332 = false;
                                                            }
                                                            try {
                                                                if (class322.field4655 != null && ~class230.field3185.field2206 < -1) {
                                                                    class424.field6117 += class230.field3185.field2206;
                                                                    class322.field4655.method675(class230.field3185.field2206, 0, (byte) -109, class230.field3185.field2159);
                                                                    class93.field1161 = 0;
                                                                    class230.field3185.field2206 = 0;
                                                                }
                                                            } catch (IOException var62) {
                                                                class96.method471((byte) -87);
                                                            }
                                                            if (arg0 != -10) {
                                                                method546((byte) 70);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        var56 = var55.field429;
                                                        if (var56.field3568 < 0) {
                                                            break;
                                                        }
                                                        var57 = class399.method2387(var56.field3646, -1857167024);
                                                    } while (var57 == null || var57.field3643 == null || ~var57.field3643.length >= ~var56.field3568 || var57.field3643[var56.field3568] != var56);
                                                    class396.method2371(var55);
                                                }
                                            }
                                            var53 = var52.field429;
                                            if (var53.field3568 < 0) {
                                                break;
                                            }
                                            var54 = class399.method2387(var53.field3646, arg0 ^ 1857167014);
                                        } while (var54 == null || var54.field3643 == null || var54.field3643.length <= var53.field3568 || var54.field3643[var53.field3568] != var53);
                                        class396.method2371(var52);
                                    }
                                }
                                var50 = var49.field429;
                                if (var50.field3568 < 0) {
                                    break;
                                }
                                var51 = class399.method2387(var50.field3646, -1857167024);
                            } while (var51 == null || var51.field3643 == null || var51.field3643.length <= var50.field3568 || var51.field3643[var50.field3568] != var50);
                            class396.method2371(var49);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbi;Z)V", line = 956)
    public static final void method543(class150 arg0, boolean arg1) {
        if (arg1) {
            field1389 = -45;
        }
        ++field1395;
        class200.field2774 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 968)
    public static final long method544(String arg0, byte arg1) {
        if (arg1 != -45) {
            method544((String) null, (byte) -15);
        }
        ++field1390;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; ++var5) {
            var3 = (var3 << 5) - (var3 + -((long) arg0.charAt(var5)));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)I", line = 990)
    public final int method545(byte arg0) {
        int var2 = 80 / ((62 - arg0) / 32);
        ++field1387;
        return this.field1394;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)Lob;", line = 1004)
    public static final class227 method546(byte arg0) {
        ++field1396;
        int var1 = -104 % ((85 - arg0) / 36);
        return class429.field6185;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILvt;)V", line = 1014)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 >= -44) {
            this.field1394 = -78;
        }
        ++field1397;
        if (~arg1 == -1) {
            this.field1394 = arg2.method916(21933);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 1027)
    public class113() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z", line = 1030)
    public final boolean method547(int arg0) {
        ++field1383;
        if (arg0 > -101) {
            this.field1388 = 69;
        }
        if (this.field1385 != null) {
            return true;
        } else if (this.field1394 >= 0) {
            class473 var2 = ~class218.field3069 > -1 ? class473.method2797(class323.field4673, this.field1394) : class473.method2795(class323.field4673, class218.field3069, this.field1394);
            var2.method2789();
            this.field1385 = var2.method2801();
            this.field1392 = var2.field6646;
            this.field1388 = var2.field6649;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V", line = 1056)
    public final void method548(boolean arg0) {
        ++field1393;
        super.method548(arg0);
        this.field1385 = null;
    }
}
