import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class236 extends class89 {

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    private int field4111 = 1;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    private int field4112 = 1;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Lda;")
    public static class275 field4107 = class255.method1672(99, "huffman");

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lda;")
    public static class275 field4106 = class255.method1672(117, "www");

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "Lda;")
    private static class275 field4113 = class255.method1672(98, "Ok");

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "Lda;")
    public static class275 field4114 = field4113;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1534(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            int var8 = arg0 + arg7;
            ++field4108;
            int var9 = arg5 - arg0;
            for (int var10 = arg7; ~var8 < ~var10; ++var10) {
                class36.method216(class19.field280[var10], arg2, arg4, -125, arg1);
            }
            for (int var11 = arg5; var11 > var9; --var11) {
                class36.method216(class19.field280[var11], arg2, arg4, -121, arg1);
            }
            int var12 = arg2 - -arg0;
            int var13 = -arg0 + arg1;
            for (int var14 = var8; ~var14 >= ~var9; ++var14) {
                int[] var15 = class19.field280[var14];
                class36.method216(var15, arg2, arg4, -126, var12);
                class36.method216(var15, var12, arg6, -122, var13);
                class36.method216(var15, var13, arg4, -118, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)V")
    public static final void method1535(int arg0) {
        if (class270.field4697 > 1) {
            --class270.field4697;
            class152.field2661 = class209.field3533;
        }
        ++field4109;
        if (class67.field1102 > 0) {
            --class67.field1102;
        }
        if (class189.field3264) {
            class189.field3264 = false;
            class135.method981((byte) 29);
        } else {
            for (int var1 = 0; var1 < 100 && class108.method800((byte) -72); ++var1) {
            }
            if (class200.field3427 == 30) {
                class233.method1515(74, arg0 + -1910, class149.field2597);
                Object var2 = class123.field2201.field2839;
                synchronized (class123.field2201.field2839) {
                    if (!class26.field426) {
                        class123.field2201.field2849 = 0;
                    } else if (~class87.field1475 != -1 || ~class123.field2201.field2849 <= -41) {
                        class149.field2597.method526((byte) -102, 145);
                        ++class49.field826;
                        class149.field2597.method575((byte) 125, 0);
                        int var3 = class149.field2597.field1392;
                        int var4 = 0;
                        for (int var5 = 0; class123.field2201.field2849 > var5 && -var3 + class149.field2597.field1392 < 240; ++var5) {
                            ++var4;
                            boolean var6 = false;
                            int var7 = class123.field2201.field2851[var5];
                            int var8 = class123.field2201.field2850[var5];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 65534) {
                                var8 = 65534;
                            }
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (var7 > 65534) {
                                var7 = 65534;
                            }
                            if (class123.field2201.field2851[var5] == -1 && class123.field2201.field2850[var5] == -1) {
                                var8 = -1;
                                var6 = true;
                                var7 = -1;
                            }
                            if (class81.field1330 == var8 && class48.field805 == var7) {
                                if (~class214.field3651 > -2048) {
                                    ++class214.field3651;
                                }
                            } else {
                                int var9 = var8 - class81.field1330;
                                class81.field1330 = var8;
                                int var10 = var7 - class48.field805;
                                class48.field805 = var7;
                                if (class214.field3651 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && ~var10 >= -32) {
                                    var10 += 32;
                                    var9 += 32;
                                    class149.field2597.method600((class214.field3651 << 12) + (var9 << 6) - -var10, (byte) 53);
                                    class214.field3651 = 0;
                                } else if (~class214.field3651 > -33 && ~var9 <= 127 && var9 <= 127 && ~var10 <= 127 && var10 <= 127) {
                                    var10 += 128;
                                    class149.field2597.method575((byte) 124, 128 - -class214.field3651);
                                    var9 += 128;
                                    class149.field2597.method600((var9 << 8) - -var10, (byte) 97);
                                    class214.field3651 = 0;
                                } else if (~class214.field3651 > -33) {
                                    class149.field2597.method575((byte) 125, class214.field3651 + 192);
                                    if (!var6) {
                                        class149.field2597.method586(-118, var7 << 16 | var8);
                                    } else {
                                        class149.field2597.method586(-99, Integer.MIN_VALUE);
                                    }
                                    class214.field3651 = 0;
                                } else {
                                    class149.field2597.method600(class214.field3651 + 57344, (byte) 32);
                                    if (!var6) {
                                        class149.field2597.method586(-81, var7 << 16 | var8);
                                    } else {
                                        class149.field2597.method586(arg0 + -7186, Integer.MIN_VALUE);
                                    }
                                    class214.field3651 = 0;
                                }
                            }
                        }
                        class149.field2597.method594(false, -var3 + class149.field2597.field1392);
                        if (~var4 <= ~class123.field2201.field2849) {
                            class123.field2201.field2849 = 0;
                        } else {
                            class123.field2201.field2849 -= var4;
                            for (int var11 = 0; class123.field2201.field2849 > var11; ++var11) {
                                class123.field2201.field2850[var11] = class123.field2201.field2850[var4 + var11];
                                class123.field2201.field2851[var11] = class123.field2201.field2851[var4 + var11];
                            }
                        }
                    }
                }
                if (~class87.field1475 != -1) {
                    ++class57.field956;
                    long var12 = (-class14.field214 + class216.field3691) / 50L;
                    class14.field214 = class216.field3691;
                    int var14 = class162.field2834;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    if (var12 > 32767L) {
                        var12 = 32767L;
                    }
                    int var15 = class185.field3174;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (~var15 < -65536) {
                        var15 = 65535;
                    }
                    int var16 = (int) var12;
                    byte var17 = 0;
                    if (~class87.field1475 == -3) {
                        var17 = 1;
                    }
                    class149.field2597.method526((byte) -48, 252);
                    class149.field2597.method586(-100, var15 << 16 | var14);
                    class149.field2597.method600(var16 | var17 << 15, (byte) 55);
                }
                if (~class156.field2747 < -1) {
                    --class156.field2747;
                }
                if (class149.field2605[96] || class149.field2605[97] || class149.field2605[98] || class149.field2605[99]) {
                    class213.field3595 = true;
                }
                if (class213.field3595 && ~class156.field2747 >= -1) {
                    ++class95.field1622;
                    class156.field2747 = 20;
                    class213.field3595 = false;
                    class149.field2597.method526((byte) -106, 118);
                    class149.field2597.method602(class275.field4794, false);
                    class149.field2597.method582(class169.field2938, true);
                }
                if (class36.field600 && !class122.field2194) {
                    ++class221.field3750;
                    class122.field2194 = true;
                    class149.field2597.method526((byte) -104, 221);
                    class149.field2597.method575((byte) 125, 1);
                }
                if (!class36.field600 && class122.field2194) {
                    ++class221.field3750;
                    class122.field2194 = false;
                    class149.field2597.method526((byte) -47, 221);
                    class149.field2597.method575((byte) 125, 0);
                }
                if (!class45.field760) {
                    ++class212.field3592;
                    class149.field2597.method526((byte) -127, 161);
                    class149.field2597.method588(class70.method461((byte) 112), -48);
                    class45.field760 = true;
                }
                class83.method538(-118);
                if (~class200.field3427 == -31) {
                    class215.method1387(arg0 ^ 7098);
                    class113.method831(-91);
                    ++class210.field3558;
                    if (class210.field3558 > 750) {
                        class135.method981((byte) 29);
                    } else {
                        class118.method855(false);
                        class84.method554(0);
                        class52.method329(2047);
                        if (class191.field3279 != null) {
                            class41.method235(27525);
                        }
                        for (int var18 = class156.method1104(true, true); var18 != -1; var18 = class156.method1104(true, false)) {
                            class219.method1409(var18, -20144);
                            class14.field222[class19.method98(31, class190.field3276++)] = var18;
                        }
                        for (class184 var19 = class197.method1284((byte) 69); var19 != null; var19 = class197.method1284((byte) 69)) {
                            int var20 = var19.method1231((byte) 114);
                            int var21 = var19.method1228((byte) 98);
                            if (var20 == 1) {
                                class65.field1067[var21] = var19.field3145;
                                class231.field4038[class19.method98(31, class11.field168++)] = var21;
                            } else if (~var20 == -3) {
                                class115.field2049[var21] = var19.field3146;
                                class89.field1513[class19.method98(class156.field2755++, 31)] = var21;
                            } else if (var20 != 3) {
                                if (~var20 != -5) {
                                    if (var20 == 5) {
                                        class229 var22 = class261.method1709(var21, -120);
                                        if (~var19.field3145 != ~var22.field3867 || ~var19.field3145 == 0) {
                                            var22.field3867 = var19.field3145;
                                            var22.field3863 = 0;
                                            var22.field3912 = 0;
                                            class40.method231(var22, arg0 ^ 7088);
                                        }
                                    } else if (var20 != 6) {
                                        if (~var20 == -8) {
                                            class229 var23 = class261.method1709(var21, arg0 + -7198);
                                            boolean var24 = ~var19.field3145 == -2;
                                            if (var24 == !var23.field3872) {
                                                var23.field3872 = var24;
                                                class40.method231(var23, 0);
                                            }
                                        } else if (var20 != 8) {
                                            if (var20 == 9) {
                                                class229 var25 = class261.method1709(var21, -108);
                                                if (~var19.field3145 != ~var25.field4006 || ~var19.field3151 != ~var25.field3882) {
                                                    var25.field3882 = var19.field3151;
                                                    var25.field4006 = var19.field3145;
                                                    class40.method231(var25, 0);
                                                }
                                            } else if (var20 == 10) {
                                                class229 var26 = class261.method1709(var21, -96);
                                                if (~var19.field3145 != ~var26.field3929 || ~var19.field3151 != ~var26.field3900 || ~var19.field3148 != ~var26.field3960) {
                                                    var26.field3929 = var19.field3145;
                                                    var26.field3960 = var19.field3148;
                                                    var26.field3900 = var19.field3151;
                                                    class40.method231(var26, 0);
                                                }
                                            } else if (var20 == 11) {
                                                class229 var27 = class261.method1709(var21, arg0 ^ -7124);
                                                var27.field3898 = 0;
                                                var27.field3889 = var27.field3939 = var19.field3145;
                                                var27.field4011 = 0;
                                                var27.field4012 = var27.field3875 = var19.field3151;
                                                class40.method231(var27, arg0 + -7088);
                                            } else if (~var20 != -13) {
                                                if (~var20 == -14) {
                                                    class229 var28 = class261.method1709(var21, arg0 ^ -7129);
                                                    var28.field3927 = var19.field3145;
                                                }
                                            } else {
                                                class229 var29 = class261.method1709(var21, -119);
                                                int var30 = var19.field3145;
                                                if (var29 != null && var29.field3858 == 0) {
                                                    if (-var29.field3980 + var29.field4019 < var30) {
                                                        var30 = -var29.field3980 + var29.field4019;
                                                    }
                                                    if (var30 < 0) {
                                                        var30 = 0;
                                                    }
                                                    if (var29.field4016 != var30) {
                                                        var29.field4016 = var30;
                                                        class40.method231(var29, 0);
                                                    }
                                                }
                                            }
                                        } else {
                                            class229 var31 = class261.method1709(var21, -123);
                                            if (~var19.field3145 != ~var31.field3940 || var19.field3151 != var31.field3932 || ~var19.field3148 != ~var31.field3985) {
                                                var31.field3932 = var19.field3151;
                                                var31.field3985 = var19.field3148;
                                                var31.field3940 = var19.field3145;
                                                if (~var31.field4006 != 0) {
                                                    if (var31.field3976 > 0) {
                                                        var31.field3985 = var31.field3985 * 32 / var31.field3976;
                                                    } else if (var31.field3986 > 0) {
                                                        var31.field3985 = var31.field3985 * 32 / var31.field3986;
                                                    }
                                                }
                                                class40.method231(var31, 0);
                                            }
                                        }
                                    } else {
                                        int var32 = var19.field3145;
                                        int var33 = (1021 & var32) >> 5;
                                        int var34 = 31 & var32 >> 10;
                                        int var35 = 31 & var32;
                                        int var36 = (var35 << 3) + (var33 << 11) + (var34 << 19);
                                        class229 var37 = class261.method1709(var21, -98);
                                        if (var37.field3862 != var36) {
                                            var37.field3862 = var36;
                                            class40.method231(var37, 0);
                                        }
                                    }
                                } else {
                                    class229 var38 = class261.method1709(var21, -95);
                                    int var39 = var19.field3145;
                                    int var40 = var19.field3151;
                                    if (~var38.field3902 != ~var39 || ~var38.field4023 != ~var40) {
                                        var38.field4023 = var40;
                                        var38.field3902 = var39;
                                        class40.method231(var38, arg0 ^ 7088);
                                    }
                                }
                            } else {
                                class229 var41 = class261.method1709(var21, arg0 ^ -7131);
                                if (!var19.field3146.method1828(true, var41.field3947)) {
                                    var41.field3947 = var19.field3146;
                                    class40.method231(var41, 0);
                                }
                            }
                        }
                        ++class105.field1829;
                        if (~class125.field2235 != -1) {
                            class94.field1611 += 20;
                            if (~class94.field1611 <= -401) {
                                class125.field2235 = 0;
                            }
                        }
                        if (class229.field3904 != null) {
                            ++client.field1485;
                            if (client.field1485 >= 15) {
                                class40.method231(class229.field3904, arg0 + -7088);
                                class229.field3904 = null;
                            }
                        }
                        if (class204.field3468 != null) {
                            class40.method231(class204.field3468, arg0 ^ 7088);
                            if (class44.field746 > class156.field2712 + 5 || class156.field2712 - 5 > class44.field746 || ~class213.field3617 < ~(class170.field2951 + 5) || ~(class170.field2951 + -5) < ~class213.field3617) {
                                class161.field2822 = true;
                            }
                            ++class116.field2069;
                            if (class65.field1074 == 0) {
                                if (class161.field2822 && class116.field2069 >= 5) {
                                    if (class255.field4501 == class204.field3468 && class94.field1608 != class123.field2200) {
                                        ++class226.field3830;
                                        class229 var42 = class204.field3468;
                                        byte var43 = 0;
                                        if (class29.field444 == 1 && var42.field3886 == 206) {
                                            var43 = 1;
                                        }
                                        if (var42.field4007[class123.field2200] <= 0) {
                                            var43 = 0;
                                        }
                                        if (class240.method1579((byte) 68, client.method635(var42))) {
                                            int var44 = class94.field1608;
                                            int var45 = class123.field2200;
                                            var42.field4007[var45] = var42.field4007[var44];
                                            var42.field4020[var45] = var42.field4020[var44];
                                            var42.field4007[var44] = -1;
                                            var42.field4020[var44] = 0;
                                        } else if (var43 == 1) {
                                            int var46 = class94.field1608;
                                            int var47 = class123.field2200;
                                            while (var46 != var47) {
                                                if (var47 < var46) {
                                                    var42.method1486(var46, var46 + -1, false);
                                                    --var46;
                                                } else if (var46 < var47) {
                                                    var42.method1486(var46, var46 + 1, false);
                                                    ++var46;
                                                }
                                            }
                                        } else {
                                            var42.method1486(class94.field1608, class123.field2200, false);
                                        }
                                        class149.field2597.method526((byte) -76, 202);
                                        class149.field2597.method586(-115, class204.field3468.field3879);
                                        class149.field2597.method596(var43, false);
                                        class149.field2597.method582(class94.field1608, true);
                                        class149.field2597.method600(class123.field2200, (byte) 19);
                                    }
                                } else if ((class3.field31 == 1 || class80.method520(class52.field863 + -1, false)) && ~class52.field863 < -3) {
                                    class113.method830((byte) 125);
                                } else if (~class52.field863 < -1) {
                                    class63.method434(arg0 + -7088);
                                }
                                class87.field1475 = 0;
                                client.field1485 = 10;
                                class204.field3468 = null;
                            }
                        }
                        class36.field594 = false;
                        class129.field2264 = 0;
                        class229 var48 = class184.field3159;
                        class229 var49 = class6.field88;
                        class184.field3159 = null;
                        class169.field2936 = false;
                        class6.field88 = null;
                        class250.field4427 = null;
                        while (class94.method674(arg0 + -1135) && class129.field2264 < 128) {
                            class38.field636[class129.field2264] = class139.field2430;
                            class269.field4667[class129.field2264] = class192.field3315;
                            ++class129.field2264;
                        }
                        class191.field3279 = null;
                        class41.field700 = null;
                        if (~class166.field2881 != 0) {
                            class14.method69(class249.field4391, 0, class212.field3587, class166.field2881, 0, 0, (byte) 106, 0);
                        }
                        ++class209.field3533;
                        if (class41.field700 != null) {
                            class55.method352(57, class41.field700, class219.field3705, class269.field4660);
                            class41.field700 = null;
                        }
                        while (true) {
                            class99 var50;
                            class229 var51;
                            class229 var52;
                            do {
                                var50 = (class99) class251.field4431.method548(16);
                                if (var50 == null) {
                                    while (true) {
                                        class99 var53;
                                        class229 var54;
                                        class229 var55;
                                        do {
                                            var53 = (class99) class71.field1155.method548(arg0 ^ 7116);
                                            if (var53 == null) {
                                                while (true) {
                                                    class99 var56;
                                                    class229 var57;
                                                    class229 var58;
                                                    do {
                                                        var56 = (class99) class275.field4775.method548(124);
                                                        if (var56 == null) {
                                                            if (class225.field3806 && class191.field3279 == null) {
                                                                class225.field3806 = false;
                                                            }
                                                            if (class262.field4558 != null) {
                                                                class120.method885((byte) -121);
                                                            }
                                                            if (~class277.field4838 < -1 && class149.field2605[82] && class149.field2605[81] && ~class83.field1343 != -1) {
                                                                int var59 = -class83.field1343 + class159.field2790;
                                                                if (~var59 > -1) {
                                                                    var59 = 0;
                                                                } else if (~var59 < -4) {
                                                                    var59 = 3;
                                                                }
                                                                class46.method279(class16.field237 - -class66.field1094.field1752[0], 1519635526, var59, class66.field1094.field1722[0] + class234.field4083);
                                                            }
                                                            if (class30.field464 != -1) {
                                                                int var60 = class193.field3321;
                                                                int var61 = class30.field464;
                                                                if (class277.field4838 > 0 && class149.field2605[82] && class149.field2605[81]) {
                                                                    class46.method279(class16.field237 - -var61, 1519635526, class159.field2790, class234.field4083 + var60);
                                                                } else if (!class248.field4367) {
                                                                    boolean var62 = class67.method453(0, 0, 0, class66.field1094.field1752[0], var60, 0, -12782, 0, 0, class66.field1094.field1722[0], true, var61);
                                                                    if (var62) {
                                                                        class96.field1640 = class162.field2834;
                                                                        class125.field2235 = 1;
                                                                        class141.field2491 = class185.field3174;
                                                                        class94.field1611 = 0;
                                                                    }
                                                                } else {
                                                                    ++class262.field4551;
                                                                    class149.field2597.method526((byte) -101, 235);
                                                                    class149.field2597.method588(class156.field2748, arg0 ^ -7165);
                                                                    class149.field2597.method600(class16.field237 + var61, (byte) 36);
                                                                    class149.field2597.method600(class234.field4083 + var60, (byte) 127);
                                                                    class149.field2597.method602(class97.field1646, false);
                                                                    class141.field2491 = class185.field3174;
                                                                    class125.field2235 = 1;
                                                                    class94.field1611 = 0;
                                                                    class96.field1640 = class162.field2834;
                                                                }
                                                                class30.field464 = -1;
                                                                class248.field4367 = false;
                                                            }
                                                            class170.method1162(arg0 + -34123);
                                                            if (arg0 != 7088) {
                                                                method1536((byte) 11);
                                                            }
                                                            if (class184.field3159 != var48) {
                                                                if (var48 != null) {
                                                                    class40.method231(var48, 0);
                                                                }
                                                                if (class184.field3159 != null) {
                                                                    class40.method231(class184.field3159, 0);
                                                                }
                                                            }
                                                            if (class6.field88 != var49 && class255.field4503 == class237.field4125) {
                                                                if (var49 != null) {
                                                                    class40.method231(var49, 0);
                                                                }
                                                                if (class6.field88 != null) {
                                                                    class40.method231(class6.field88, arg0 + -7088);
                                                                }
                                                            }
                                                            if (class6.field88 == null) {
                                                                if (~class237.field4125 < -1) {
                                                                    --class237.field4125;
                                                                }
                                                            } else if (~class237.field4125 > ~class255.field4503) {
                                                                ++class237.field4125;
                                                                if (~class255.field4503 == ~class237.field4125) {
                                                                    class40.method231(class6.field88, 0);
                                                                }
                                                            }
                                                            if (~class159.field2789 == -2) {
                                                                class250.method1637((byte) -81);
                                                            } else if (class159.field2789 == 2) {
                                                                class93.method667(50);
                                                            } else {
                                                                class3.method11(-1243);
                                                            }
                                                            for (int var63 = 0; ~var63 > -6; ++var63) {
                                                                int var10002 = class185.field3171[var63]++;
                                                            }
                                                            int var64 = class237.method1539((byte) -106);
                                                            int var65 = class148.method1049(254);
                                                            if (~var64 < -4501 && ~var65 < -4501) {
                                                                ++class113.field1997;
                                                                class67.field1102 = 250;
                                                                class191.method1257((byte) 72, 4000);
                                                                class149.field2597.method526((byte) -43, 72);
                                                            }
                                                            if (class255.field4492 != null && ~class255.field4492.field4623 == -2) {
                                                                if (class255.field4492.field4625 != null) {
                                                                    class200.method1307(class93.field1595, 50, class230.field4033);
                                                                }
                                                                class255.field4492 = null;
                                                                class230.field4033 = false;
                                                                class93.field1595 = null;
                                                            }
                                                            ++class152.field2659;
                                                            ++class197.field3360;
                                                            ++class166.field2889;
                                                            if (~class166.field2889 < -501) {
                                                                int var66 = (int) (Math.random() * 8.0D);
                                                                class166.field2889 = 0;
                                                                if (~(2 & var66) == -3) {
                                                                    class42.field724 += class119.field2138;
                                                                }
                                                                if (~(1 & var66) == -2) {
                                                                    class193.field3319 += class48.field799;
                                                                }
                                                                if ((var66 & 4) == 4) {
                                                                    class66.field1093 += class25.field418;
                                                                }
                                                            }
                                                            if (~class193.field3319 > 49) {
                                                                class48.field799 = 2;
                                                            }
                                                            if (~class197.field3360 < -501) {
                                                                class197.field3360 = 0;
                                                                int var67 = (int) (8.0D * Math.random());
                                                                if (~(1 & var67) == -2) {
                                                                    class218.field3699 += class103.field1721;
                                                                }
                                                                if (~(2 & var67) == -3) {
                                                                    class188.field3254 += class108.field1888;
                                                                }
                                                            }
                                                            if (~class66.field1093 > 39) {
                                                                class25.field418 = 1;
                                                            }
                                                            if (class218.field3699 < -60) {
                                                                class103.field1721 = 2;
                                                            }
                                                            if (class66.field1093 > 40) {
                                                                class25.field418 = -1;
                                                            }
                                                            if (class188.field3254 < -20) {
                                                                class108.field1888 = 1;
                                                            }
                                                            if (class193.field3319 > 50) {
                                                                class48.field799 = -2;
                                                            }
                                                            if (~class42.field724 > 54) {
                                                                class119.field2138 = 2;
                                                            }
                                                            if (~class42.field724 < -56) {
                                                                class119.field2138 = -2;
                                                            }
                                                            if (~class218.field3699 < -61) {
                                                                class103.field1721 = -2;
                                                            }
                                                            if (~class188.field3254 < -11) {
                                                                class108.field1888 = -1;
                                                            }
                                                            if (class152.field2659 > 50) {
                                                                ++class210.field3565;
                                                                class149.field2597.method526((byte) -76, 173);
                                                            }
                                                            if (class59.field993) {
                                                                class224.method1449(28);
                                                                class59.field993 = false;
                                                            }
                                                            try {
                                                                if (class52.field866 != null && ~class149.field2597.field1392 < -1) {
                                                                    class52.field866.method1400(class149.field2597.field1381, 0, 5000, class149.field2597.field1392);
                                                                    class149.field2597.field1392 = 0;
                                                                    class152.field2659 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var68) {
                                                                class135.method981((byte) 29);
                                                                return;
                                                            }
                                                        }
                                                        var57 = var56.field1677;
                                                        if (var57.field3943 < 0) {
                                                            break;
                                                        }
                                                        var58 = class261.method1709(var57.field3992, arg0 ^ -7136);
                                                    } while (var58 == null || var58.field3942 == null || var57.field3943 >= var58.field3942.length || var58.field3942[var57.field3943] != var57);
                                                    class177.method1192(var56, 200000);
                                                }
                                            }
                                            var54 = var53.field1677;
                                            if (var54.field3943 < 0) {
                                                break;
                                            }
                                            var55 = class261.method1709(var54.field3992, -100);
                                        } while (var55 == null || var55.field3942 == null || var54.field3943 >= var55.field3942.length || var55.field3942[var54.field3943] != var54);
                                        class177.method1192(var53, 200000);
                                    }
                                }
                                var51 = var50.field1677;
                                if (~var51.field3943 > -1) {
                                    break;
                                }
                                var52 = class261.method1709(var51.field3992, -96);
                            } while (var52 == null || var52.field3942 == null || ~var51.field3943 <= ~var52.field3942.length || var52.field3942[var51.field3943] != var51);
                            class177.method1192(var50, 200000);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        field4107 = null;
        if (arg0 <= 12) {
            field4114 = null;
        }
        field4106 = null;
        field4114 = null;
        field4113 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1508 = arg1.method564((byte) 74) == 1;
                }
            } else {
                this.field4111 = arg1.method564((byte) 56);
            }
        } else {
            this.field4112 = arg1.method564((byte) 119);
        }
        if (arg0 != -20503) {
            this.method21(true, 82);
        }
        ++field4116;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field4110;
            int[][] var3 = super.field1512.method824(arg1, (byte) -33);
            if (super.field1512.field2007) {
                int var4 = this.field4111 - -this.field4111 - -1;
                int[][][] var5 = new int[var4][][];
                int var6 = this.field4112 + this.field4112 + 1;
                int var7 = 65536 / var4;
                int var8 = 65536 / var6;
                for (int var9 = arg1 - this.field4111; var9 <= this.field4111 + arg1; ++var9) {
                    int[][] var19 = this.method648(true, 0, var9 & class277.field4837);
                    int[][] var20 = new int[3][class65.field1070];
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = var19[0];
                    int[] var24 = var19[1];
                    int var25 = 0;
                    int[] var26 = var19[2];
                    for (int var27 = -this.field4112; this.field4112 >= var27; ++var27) {
                        int var37 = var27 & class1.field11;
                        var21 += var23[var37];
                        var22 += var24[var37];
                        var25 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~class65.field1070 < ~var31) {
                        var28[var31] = var8 * var21 >> 16;
                        var29[var31] = var8 * var22 >> 16;
                        var30[var31] = var8 * var25 >> 16;
                        int var32 = class1.field11 & -this.field4112 + var31;
                        ++var31;
                        int var33 = var22 - var24[var32];
                        int var34 = var25 - var26[var32];
                        int var35 = var21 - var23[var32];
                        int var36 = class1.field11 & this.field4112 + var31;
                        var25 = var26[var36] + var34;
                        var21 = var23[var36] + var35;
                        var22 = var24[var36] + var33;
                    }
                    var5[var9 - -this.field4111 + -arg1] = var20;
                }
                int[] var10 = var3[1];
                int[] var11 = var3[2];
                int[] var12 = var3[0];
                for (int var13 = 0; ~var13 > ~class65.field1070; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var17 > ~var4; ++var17) {
                        int[][] var18 = var5[var17];
                        var15 += var18[0][var13];
                        var14 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var12[var13] = var7 * var15 >> 16;
                    var10[var13] = var7 * var14 >> 16;
                    var11[var13] = var7 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field4115;
        if (arg1) {
            this.method239(79, false);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -51);
        if (super.field1503.field664) {
            int var4 = this.field4111 + this.field4111 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field4112 - (-this.field4112 - 1);
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg0 - this.field4111; this.field4111 + arg0 >= var9; ++var9) {
                int var13 = 0;
                int[] var14 = this.method645(116, 0, class277.field4837 & var9);
                for (int var15 = -this.field4112; ~var15 >= ~this.field4112; ++var15) {
                    var13 += var14[class1.field11 & var15];
                }
                int[] var16 = new int[class65.field1070];
                int var17 = 0;
                while (var17 < class65.field1070) {
                    var16[var17] = var8 * var13 >> 16;
                    int var18 = var13 - var14[var17 - this.field4112 & class1.field11];
                    ++var17;
                    var13 = var14[var17 - -this.field4112 & class1.field11] + var18;
                }
                var7[var9 - arg0 + this.field4111] = var16;
            }
            for (int var10 = 0; var10 < class65.field1070; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }
}
