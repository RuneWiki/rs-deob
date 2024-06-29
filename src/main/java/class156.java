import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class156 extends class212 {

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    private int field2606 = -1;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "Lbj;")
    public static class16 field2608;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "[I")
    public int[] field2612;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "[Lpg;")
    public static class69[] field2610;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2610 = null;
        field2608 = null;
        if (arg0 != -2) {
            method1039(-12);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
    public final int method1040(byte arg0) {
        ++field2607;
        return arg0 != -92 ? -121 : this.field2606;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)Lqc;")
    public static final class75 method1041(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class75 var4 = var3.field3801;
            var3.field3801 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class156() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
    public int[][] method260(int arg0, int arg1) {
        ++field2614;
        if (arg1 != 16383) {
            method1041(60, -75, -123);
        }
        int[][] var3 = super.field3645.method1352(arg0, -115);
        if (super.field3645.field3477 && this.method1044(-113)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2604 * (class97.field1577 == this.field2611 ? arg0 : this.field2611 * arg0 / class97.field1577);
            if (class26.field452 == this.field2604) {
                for (int var8 = 0; var8 < class26.field452; ++var8) {
                    int var9 = this.field2612[var7++];
                    var6[var8] = class5.method43(255, var9) << 4;
                    var5[var8] = class5.method43(var9 >> 4, 4080);
                    var4[var8] = class5.method43(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class26.field452; ++var10) {
                    int var11 = this.field2604 * var10 / class26.field452;
                    int var12 = this.field2612[var7 + var11];
                    var6[var10] = class5.method43(4080, var12 << 4);
                    var5[var10] = class5.method43(65280, var12) >> 4;
                    var4[var10] = class5.method43(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    public final void method1042(int arg0) {
        if (arg0 != 7889) {
            field2610 = null;
        }
        ++field2609;
        super.method1042(arg0);
        this.field2612 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIBII[Lo;)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, class175[] arg9) {
        class17.method157(arg1, arg7, arg3, arg5);
        if (arg6 != 35) {
            method1043(-17, -80, -66, -9, -113, -45, (byte) -48, -53, -26, (class175[]) null);
        }
        class72.method504();
        for (int var10 = 0; var10 < arg9.length; ++var10) {
            class175 var11 = arg9[var10];
            if (var11 != null && (~var11.field2958 == ~arg2 || ~arg2 == 1412584498 && class244.field4229 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class25.field434[class207.field3551] = var11.field2929 + arg4;
                    class137.field2252[class207.field3551] = var11.field3036 + arg8;
                    class62.field957[class207.field3551] = var11.field3057;
                    class258.field4508[class207.field3551] = var11.field3041;
                    var12 = class207.field3551++;
                } else {
                    var12 = arg0;
                }
                var11.field3010 = class237.field4125;
                var11.field2979 = var12;
                if (!var11.field2972 || !client.method1059(var11)) {
                    if (var11.field3067 > 0) {
                        class132.method853(true, var11);
                    }
                    int var13 = var11.field3051;
                    int var14 = var11.field2929 + arg4;
                    int var15 = var11.field3036 - -arg8;
                    if (class166.field2826 && (client.method1058(var11) != 0 || ~var11.field3069 == -1) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class244.field4229 == var11) {
                        if (~arg2 != 1412584498 && !var11.field2925) {
                            class256.field4482 = arg9;
                            class42.field643 = arg4;
                            class52.field818 = arg8;
                            continue;
                        }
                        if (class94.field1499 && class170.field2863) {
                            int var16 = class79.field1279;
                            int var17 = var16 - class98.field1587;
                            if (var17 < class110.field1803) {
                                var17 = class110.field1803;
                            }
                            int var18 = class183.field3215;
                            if (class110.field1803 + class242.field4213.field3057 < var17 - -var11.field3057) {
                                var17 = class110.field1803 + class242.field4213.field3057 + -var11.field3057;
                            }
                            var14 = var17;
                            int var19 = var18 - class239.field4150;
                            if (class258.field4505 > var19) {
                                var19 = class258.field4505;
                            }
                            if (class258.field4505 + class242.field4213.field3041 < var19 - -var11.field3041) {
                                var19 = class258.field4505 + class242.field4213.field3041 + -var11.field3041;
                            }
                            var15 = var19;
                        }
                        if (!var11.field2925) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (~var11.field3069 == -3) {
                        var20 = arg5;
                        var21 = arg7;
                        var22 = arg1;
                        var23 = arg3;
                    } else {
                        var21 = var15 > arg7 ? var15 : arg7;
                        var22 = arg1 < var14 ? var14 : arg1;
                        int var24 = var11.field3057 + var14;
                        int var25 = var11.field3041 + var15;
                        if (~var11.field3069 == -10) {
                            ++var25;
                            ++var24;
                        }
                        var20 = ~var25 > ~arg5 ? var25 : arg5;
                        var23 = var24 < arg3 ? var24 : arg3;
                    }
                    if (!var11.field2972 || var23 > var22 && ~var21 > ~var20) {
                        if (~var11.field3067 != -1) {
                            if (~var11.field3067 == -1338) {
                                class47.field740 = var15;
                                class63.field979 = var14;
                                class143.field2323 = var11;
                                class217.method1437(0, var14, var11.field3041, ~var11.field3067 == -1404, var15, var11.field3057);
                                class17.method157(arg1, arg7, arg3, arg5);
                                continue;
                            }
                            if (~var11.field3067 == -1339) {
                                if (var11.method1160(19)) {
                                    class174.method1157(var12, var15, var14, false, var11);
                                    class17.method157(arg1, arg7, arg3, arg5);
                                }
                                continue;
                            }
                            if (~var11.field3067 == -1340) {
                                if (var11.method1160(53)) {
                                    class171.method1134(32, var14, var11, var15, var12);
                                    class17.method157(arg1, arg7, arg3, arg5);
                                }
                                continue;
                            }
                            if (var11.field3067 == 1400) {
                                class74.method519(var11.field3057, var14, arg6 ^ 79, var11.field3041, var15);
                                class61.field943[var12] = true;
                                class114.field1849[var12] = true;
                                class17.method157(arg1, arg7, arg3, arg5);
                                continue;
                            }
                            if (var11.field3067 == 1401) {
                                class125.method811(var14, var11.field3041, var15, var11.field3057, false);
                                class61.field943[var12] = true;
                                class114.field1849[var12] = true;
                                class17.method157(arg1, arg7, arg3, arg5);
                                continue;
                            }
                            if (var11.field3067 == 1402) {
                                class172.method1136(var14, var15, arg6 + 54);
                                class61.field943[var12] = true;
                                class114.field1849[var12] = true;
                                continue;
                            }
                            if (var11.field3067 == 1404) {
                                class217.method1439(class114.field1853, var11, var15, var11.field3057, var14, true, var11.field3041, class164.field2797);
                                class61.field943[var12] = true;
                                class114.field1849[var12] = true;
                                continue;
                            }
                            if (var11.field3067 == 1405) {
                                if (class25.field436) {
                                    int var26 = var11.field3057 + var14;
                                    int var27 = var15 - -15;
                                    class18.field316.method1658(class175.method1164(new class181[] { class114.field1851, class169.method1119((byte) -127, class195.field3408) }, (byte) 125), var26, var27, 16776960, -1);
                                    Runtime var28 = Runtime.getRuntime();
                                    int var109 = var27 + 15;
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = 16776960;
                                    if (~var29 < -65537) {
                                        var30 = 16711680;
                                    }
                                    class18.field316.method1658(class175.method1164(new class181[] { class23.field402, class169.method1119((byte) -119, var29), class21.field378 }, (byte) 127), var26, var109, var30, -1);
                                    class61.field943[var12] = true;
                                    class114.field1849[var12] = true;
                                    var27 = var109 + 15;
                                }
                                continue;
                            }
                        }
                        int var31 = class58.field878;
                        int var32 = class26.field458;
                        if (~var11.field3069 == -1 && var11.field3079 && ~var22 >= ~var31 && var21 <= var32 && ~var31 > ~var23 && var20 > var32 && !class33.field534 && !class166.field2826) {
                            class161.field2749[0] = class227.field3901;
                            class131.field2177 = 1;
                            class63.field970[0] = class241.field4187;
                            class172.field2873[0] = 1003;
                        }
                        if (!class33.field534 && ~var22 >= ~var31 && var32 >= var21 && ~var31 > ~var23 && var20 > var32) {
                            class152.method981(var11, -var15 + var32, -var14 + var31, (byte) -34);
                        }
                        if (var11.field3069 == 0) {
                            if (!var11.field2972 && client.method1059(var11) && class151.field2517 != var11) {
                                continue;
                            }
                            if (!var11.field2972) {
                                if (var11.field2946 > -var11.field3041 + var11.field3033) {
                                    var11.field2946 = -var11.field3041 + var11.field3033;
                                }
                                if (~var11.field2946 > -1) {
                                    var11.field2946 = 0;
                                }
                            }
                            method1043(var12, var22, var11.field2987, var23, -var11.field3014 + var14, var20, (byte) 35, var21, -var11.field2946 + var15, arg9);
                            if (var11.field3066 != null) {
                                method1043(var12, var22, var11.field2987, var23, -var11.field3014 + var14, var20, (byte) 35, var21, -var11.field2946 + var15, var11.field3066);
                            }
                            class228 var33 = (class228) class165.field2807.method1424(true, (long) var11.field2987);
                            if (var33 != null) {
                                if (var33.field3914 == 0 && ~var31 <= ~var22 && var21 <= var32 && var23 > var31 && var20 > var32 && !class33.field534 && !class166.field2826) {
                                    class161.field2749[0] = class227.field3901;
                                    class63.field970[0] = class241.field4187;
                                    class131.field2177 = 1;
                                    class172.field2873[0] = 1003;
                                }
                                class240.method1638(var12, -21307, var22, var21, var14, var33.field3913, var20, var15, var23);
                            }
                            class17.method157(arg1, arg7, arg3, arg5);
                            class72.method504();
                        }
                        if (class235.field4092[var12] || class239.field4161 > 1) {
                            if (var11.field3069 == 0 && !var11.field2972 && ~var11.field3041 > ~var11.field3033) {
                                class3.method29((byte) -51, var11.field3033, var11.field3041, var11.field3057 + var14, var15, var11.field2946);
                            }
                            if (var11.field3069 != 1) {
                                if (var11.field3069 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; ~var11.field2996 < ~var35; ++var35) {
                                        for (int var36 = 0; ~var11.field3072 < ~var36; ++var36) {
                                            int var37 = var14 - -((var11.field2999 + 32) * var36);
                                            int var38 = var15 - -((32 - -var11.field2985) * var35);
                                            if (~var34 > -21) {
                                                var37 += var11.field3058[var34];
                                                var38 += var11.field2960[var34];
                                            }
                                            if (~var11.field3065[var34] >= -1) {
                                                if (var11.field3071 != null && var34 < 20) {
                                                    class107 var50 = var11.method1175(var34, false);
                                                    if (var50 != null) {
                                                        var50.method322(var37, var38);
                                                    } else if (class241.field4177) {
                                                        class218.method1453((byte) -94, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var39 = false;
                                                boolean var40 = false;
                                                int var41 = var11.field3065[var34] + -1;
                                                if (var37 + 32 > arg1 && var37 < arg3 && arg7 < var38 - -32 && ~var38 > ~arg5 || class88.field1402 == var11 && class45.field694 == var34) {
                                                    class107 var42;
                                                    if (~class216.field3710 == -2 && class116.field1902 == var34 && ~class247.field4314 == ~var11.field2987) {
                                                        var42 = class94.method620(var11.field3035, 2, (byte) -118, var11.field2935[var34], 0, var41);
                                                    } else {
                                                        var42 = class94.method620(var11.field3035, 1, (byte) -118, var11.field2935[var34], 3153952, var41);
                                                    }
                                                    if (class72.field1149) {
                                                        class61.field943[var12] = true;
                                                    }
                                                    if (var42 != null) {
                                                        if (class88.field1402 == var11 && ~class45.field694 == ~var34) {
                                                            int var43 = -class220.field3795 + class183.field3215;
                                                            if (var43 < 5 && var43 > -5) {
                                                                var43 = 0;
                                                            }
                                                            int var44 = -class88.field1406 + class79.field1279;
                                                            if (~var44 > -6 && var44 > -5) {
                                                                var44 = 0;
                                                            }
                                                            if (class232.field4055 < 5) {
                                                                var43 = 0;
                                                                var44 = 0;
                                                            }
                                                            var42.method332(var37 - -var44, var38 + var43, 128);
                                                            if (arg2 != -1) {
                                                                class175 var45 = arg9[65535 & arg2];
                                                                int var46 = class17.field311;
                                                                int var47 = class17.field314;
                                                                if (~(var38 + var43) > ~var47 && ~var45.field2946 < -1) {
                                                                    int var48 = (var47 - var38 + -var43) * class258.field4504 / 3;
                                                                    if (~var48 < ~(class258.field4504 * 10)) {
                                                                        var48 = class258.field4504 * 10;
                                                                    }
                                                                    if (~var45.field2946 > ~var48) {
                                                                        var48 = var45.field2946;
                                                                    }
                                                                    class220.field3795 += var48;
                                                                    var45.field2946 -= var48;
                                                                    class218.method1453((byte) -100, var45);
                                                                }
                                                                if (~var46 > ~(var38 - -var43 + 32) && ~var45.field2946 > ~(-var45.field3041 + var45.field3033)) {
                                                                    int var49 = (var38 - var46 + var43 + 32) * class258.field4504 / 3;
                                                                    if (~(class258.field4504 * 10) > ~var49) {
                                                                        var49 = class258.field4504 * 10;
                                                                    }
                                                                    if (var49 > -var45.field3041 + var45.field3033 + -var45.field2946) {
                                                                        var49 = -var45.field3041 + -var45.field2946 + var45.field3033;
                                                                    }
                                                                    var45.field2946 += var49;
                                                                    class220.field3795 -= var49;
                                                                    class218.method1453((byte) -70, var45);
                                                                }
                                                            }
                                                        } else if (class2.field51 == var11 && ~class91.field1448 == ~var34) {
                                                            var42.method332(var37, var38, 128);
                                                        } else {
                                                            var42.method322(var37, var38);
                                                        }
                                                    } else {
                                                        class218.method1453((byte) -75, var11);
                                                    }
                                                }
                                            }
                                            ++var34;
                                        }
                                    }
                                } else if (~var11.field3069 == -4) {
                                    int var51;
                                    if (class237.method1621((byte) -111, var11)) {
                                        var51 = var11.field3046;
                                        if (class151.field2517 == var11 && var11.field2981 != 0) {
                                            var51 = var11.field2981;
                                        }
                                    } else {
                                        var51 = var11.field2969;
                                        if (class151.field2517 == var11 && var11.field3042 != 0) {
                                            var51 = var11.field3042;
                                        }
                                    }
                                    if (~var13 == -1) {
                                        if (!var11.field3052) {
                                            class17.method155(var14, var15, var11.field3057, var11.field3041, var51);
                                        } else {
                                            class17.method156(var14, var15, var11.field3057, var11.field3041, var51);
                                        }
                                    } else if (var11.field3052) {
                                        class17.method164(var14, var15, var11.field3057, var11.field3041, var51, -(255 & var13) + 256);
                                    } else {
                                        class17.method150(var14, var15, var11.field3057, var11.field3041, var51, -(255 & var13) + 256);
                                    }
                                } else if (var11.field3069 == 4) {
                                    class245 var52 = var11.method1170(field2610, (byte) -109);
                                    if (var52 == null) {
                                        if (class241.field4177) {
                                            class218.method1453((byte) -114, var11);
                                        }
                                    } else {
                                        class181 var53 = var11.field3053;
                                        int var54;
                                        if (class237.method1621((byte) -84, var11)) {
                                            var54 = var11.field3046;
                                            if (class151.field2517 == var11 && ~var11.field2981 != -1) {
                                                var54 = var11.field2981;
                                            }
                                            if (var11.field3039.method1226(arg6 ^ -458531519) > 0) {
                                                var53 = var11.field3039;
                                            }
                                        } else {
                                            var54 = var11.field2969;
                                            if (class151.field2517 == var11 && var11.field3042 != 0) {
                                                var54 = var11.field3042;
                                            }
                                        }
                                        if (var11.field2972 && ~var11.field2975 != 0) {
                                            class99 var55 = class237.method1620(-29539, var11.field2975);
                                            var53 = var55.field1652;
                                            if (var53 == null) {
                                                var53 = class120.field1952;
                                            }
                                            if ((~var55.field1639 == -2 || var11.field3075 != 1) && var11.field3075 != -1) {
                                                var53 = class175.method1164(new class181[] { class68.field1091, var53, class191.field3363, class172.method1139(var11.field3075, arg6 + -142) }, (byte) 123);
                                            }
                                        }
                                        if (class210.field3608 == var11) {
                                            var54 = var11.field2969;
                                            var53 = class232.field4057;
                                        }
                                        if (!var11.field2972) {
                                            var53 = class193.method1323(var11, -110, var53);
                                        }
                                        var52.method1662(var53, var14, var15, var11.field3057, var11.field3041, var54, !var11.field2940 ? -1 : 0, var11.field3034, var11.field3022, var11.field3054);
                                    }
                                } else if (var11.field3069 == 5) {
                                    if (!var11.field2972) {
                                        class107 var64 = var11.method1173(class237.method1621((byte) -123, var11), 11197);
                                        if (var64 != null) {
                                            var64.method322(var14, var15);
                                        } else if (class241.field4177) {
                                            class218.method1453((byte) -99, var11);
                                        }
                                    } else {
                                        class107 var56;
                                        if (var11.field2975 == -1) {
                                            var56 = var11.method1173(false, 11197);
                                        } else {
                                            var56 = class94.method620(var11.field3035, var11.field3018, (byte) -118, var11.field3075, var11.field3056, var11.field2975);
                                        }
                                        if (var56 == null) {
                                            if (class241.field4177) {
                                                class218.method1453((byte) -100, var11);
                                            }
                                        } else {
                                            int var57 = var56.field1750;
                                            int var58 = var56.field1758;
                                            if (!var11.field2990) {
                                                int var59 = var11.field3057 * 4096 / var57;
                                                if (~var11.field2924 != -1) {
                                                    var56.method716(var59, true, var11.field3057 / 2 + var14, var11.field2924, var11.field3041 / 2 + var15);
                                                } else if (~var13 == -1) {
                                                    if (var11.field3057 == var57 && ~var11.field3041 == ~var58) {
                                                        var56.method322(var14, var15);
                                                    } else {
                                                        var56.method335(var14, var15, var11.field3057, var11.field3041);
                                                    }
                                                } else {
                                                    var56.method337(var14, var15, var11.field3057, var11.field3041, 256 - (255 & var13));
                                                }
                                            } else {
                                                int var60 = (var11.field3041 - -var58 - 1) / var58;
                                                int var61 = (-1 - (-var57 - var11.field3057)) / var57;
                                                class17.method161(var14, var15, var11.field3057 + var14, var11.field3041 + var15);
                                                for (int var62 = 0; var61 > var62; ++var62) {
                                                    for (int var63 = 0; ~var60 < ~var63; ++var63) {
                                                        if (var11.field2924 != 0) {
                                                            var56.method716(4096, true, var57 / 2 + var57 * var62 + var14, var11.field2924, var58 / 2 + var58 * var63 + var15);
                                                        } else if (var13 == 0) {
                                                            var56.method322(var57 * var62 + var14, var15 - -(var58 * var63));
                                                        } else {
                                                            var56.method332(var57 * var62 + var14, var15 - -(var58 * var63), -(var13 & 255) + 256);
                                                        }
                                                    }
                                                }
                                                class17.method157(arg1, arg7, arg3, arg5);
                                            }
                                        }
                                    }
                                } else if (var11.field3069 == 6) {
                                    boolean var65 = class237.method1621((byte) -97, var11);
                                    int var66;
                                    if (var65) {
                                        var66 = var11.field3049;
                                    } else {
                                        var66 = var11.field3063;
                                    }
                                    class249 var67 = null;
                                    int var68 = 0;
                                    if (var11.field2975 != -1) {
                                        class99 var69 = class237.method1620(arg6 + -29574, var11.field2975);
                                        if (var69 != null) {
                                            class99 var70 = var69.method654(var11.field3075, arg6 ^ -93);
                                            class254 var71 = ~var66 != 0 ? class128.method827(var66, arg6 ^ 95) : null;
                                            var67 = var70.method655(1, var11.field3038, var71, (byte) -117);
                                            if (var67 != null) {
                                                var68 = -var67.method190() / 2;
                                            } else {
                                                class218.method1453((byte) -77, var11);
                                            }
                                        }
                                    } else if (var11.field3017 != 5) {
                                        if (var66 == -1) {
                                            var67 = var11.method1167(class258.field4507.field1905, -1, var65, -117, (class254) null);
                                            if (var67 == null && class241.field4177) {
                                                class218.method1453((byte) -72, var11);
                                            }
                                        } else {
                                            class254 var72 = class128.method827(var66, 107);
                                            var67 = var11.method1167(class258.field4507.field1905, var11.field3038, var65, -84, var72);
                                            if (var67 == null && class241.field4177) {
                                                class218.method1453((byte) -121, var11);
                                            }
                                        }
                                    } else if (~var11.field2966 != 0) {
                                        int var73 = var11.field2966 & 2047;
                                        if (~class199.field3452 == ~var73) {
                                            var73 = 2047;
                                        }
                                        class116 var74 = class39.field602[var73];
                                        class254 var75 = ~var66 == 0 ? null : class128.method827(var66, 125);
                                        if (var74 != null && (int) var74.field1883.method1197(arg6 + -140) << 11 == (-2048 & var11.field2966)) {
                                            var67 = var74.field1905.method1154(var11.field3038, true, var75, (class254) null, 0);
                                        }
                                    } else {
                                        var67 = class170.field2859.method1154(-1, true, (class254) null, (class254) null, -1);
                                    }
                                    if (var67 != null) {
                                        int var76;
                                        if (var11.field3031 <= 0) {
                                            var76 = 256;
                                        } else {
                                            var76 = (var11.field3057 << 8) / var11.field3031;
                                        }
                                        int var77 = (var11.field3081 * var76 >> 8) + var14 - -(var11.field3057 / 2);
                                        int var78;
                                        if (var11.field3077 > 0) {
                                            var78 = (var11.field3041 << 8) / var11.field3077;
                                        } else {
                                            var78 = 256;
                                        }
                                        int var79 = (var11.field3008 * var78 >> 8) + var11.field3041 / 2 + var15;
                                        class72.method509(var77, var79);
                                        int var80 = class72.field1150[var11.field2967] * var11.field2927 >> 16;
                                        int var81 = class72.field1145[var11.field2967] * var11.field2927 >> 16;
                                        if (var11.field2972) {
                                            if (var11.field2950) {
                                                ((class231) var67).method1590(0, var11.field3048, var11.field2931, var11.field2967, var11.field3004, var68 + var80 + var11.field2963, var11.field2963 + var81, var11.field2927);
                                            } else {
                                                var67.method1571(0, var11.field3048, var11.field2931, var11.field2967, var11.field3004, var80 - -var68 + var11.field2963, var11.field2963 + var81);
                                            }
                                        } else {
                                            var67.method1571(0, var11.field3048, 0, var11.field2967, 0, var80, var81);
                                        }
                                        class72.method505();
                                    }
                                } else {
                                    if (var11.field3069 == 7) {
                                        class245 var82 = var11.method1170(field2610, (byte) 87);
                                        if (var82 == null) {
                                            if (class241.field4177) {
                                                class218.method1453((byte) -126, var11);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; ~var84 > ~var11.field2996; ++var84) {
                                            for (int var85 = 0; ~var11.field3072 < ~var85; ++var85) {
                                                if (var11.field3065[var83] > 0) {
                                                    class99 var86 = class237.method1620(-29539, var11.field3065[var83] + -1);
                                                    class181 var87;
                                                    if (var86.field1639 != 1 && var11.field2935[var83] == 1) {
                                                        var87 = class175.method1164(new class181[] { class68.field1091, var86.field1652, class250.field4364 }, (byte) 125);
                                                    } else {
                                                        var87 = class175.method1164(new class181[] { class68.field1091, var86.field1652, class191.field3363, class172.method1139(var11.field2935[var83], -107) }, (byte) 126);
                                                    }
                                                    int var88 = (115 - -var11.field2999) * var85 + var14;
                                                    int var89 = var15 - -((12 - -var11.field2985) * var84);
                                                    if (var11.field3034 == 0) {
                                                        var82.method1659(var87, var88, var89, var11.field2969, var11.field2940 ? 0 : -1);
                                                    } else if (~var11.field3034 != -2) {
                                                        var82.method1658(var87, var88 + 114, var89, var11.field2969, !var11.field2940 ? -1 : 0);
                                                    } else {
                                                        var82.method1655(var87, var88 + 57, var89, var11.field2969, !var11.field2940 ? -1 : 0);
                                                    }
                                                }
                                                ++var83;
                                            }
                                        }
                                    }
                                    if (var11.field3069 == 8 && class46.field731 == var11 && class80.field1298 == class125.field2063) {
                                        int var90 = 0;
                                        int var91 = 0;
                                        class245 var92 = class18.field316;
                                        class181 var93 = var11.field3053;
                                        class181 var94 = class193.method1323(var11, -127, var93);
                                        while (var94.method1226(arg6 + -458531521) > 0) {
                                            int var102 = var94.method1220((byte) -119, class220.field3792);
                                            class181 var103;
                                            if (var102 == -1) {
                                                var103 = var94;
                                                var94 = class241.field4187;
                                            } else {
                                                var103 = var94.method1235(0, 125, var102);
                                                var94 = var94.method1215(123, var102 + 4);
                                            }
                                            int var104 = var92.method1677(var103);
                                            var91 += var92.field4255 + 1;
                                            if (var90 < var104) {
                                                var90 = var104;
                                            }
                                        }
                                        var91 += 7;
                                        var90 += 6;
                                        int var95 = var11.field3041 + 5 + var15;
                                        int var96 = var14 - (var90 + 5) + var11.field3057;
                                        if (~var96 > ~(var14 + 5)) {
                                            var96 = var14 + 5;
                                        }
                                        if (var96 - -var90 > arg3) {
                                            var96 = -var90 + arg3;
                                        }
                                        if (var91 + var95 > arg5) {
                                            var95 = arg5 - var91;
                                        }
                                        class17.method156(var96, var95, var90, var91, 16777120);
                                        class17.method155(var96, var95, var90, var91, 0);
                                        class181 var97 = var11.field3053;
                                        int var98 = var92.field4255 + 2 + var95;
                                        class181 var99 = class193.method1323(var11, -114, var97);
                                        while (var99.method1226(-458531486) > 0) {
                                            int var100 = var99.method1220((byte) -127, class220.field3792);
                                            class181 var101;
                                            if (~var100 != 0) {
                                                var101 = var99.method1235(0, arg6 ^ 110, var100);
                                                var99 = var99.method1215(102, var100 + 4);
                                            } else {
                                                var101 = var99;
                                                var99 = class241.field4187;
                                            }
                                            var92.method1659(var101, var96 - -3, var98, 0, -1);
                                            var98 += var92.field4255 + 1;
                                        }
                                    }
                                    if (~var11.field3069 == -10) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (!var11.field2922) {
                                            var105 = var14;
                                            var106 = var11.field3041 + var15;
                                            var107 = var15;
                                            var108 = var11.field3057 + var14;
                                        } else {
                                            var107 = var11.field3041 + var15;
                                            var106 = var15;
                                            var108 = var14 - -var11.field3057;
                                            var105 = var14;
                                        }
                                        if (~var11.field3001 != -2) {
                                            class17.method158(var105, var107, var108, var106, var11.field2969, var11.field3001);
                                        } else {
                                            class17.method144(var105, var107, var108, var106, var11.field2969);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field2605;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field2606 = arg0.method1535(2);
        }
        ++field2613;
        if (arg2 != -3) {
            this.method1040((byte) 63);
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Z")
    public final boolean method1044(int arg0) {
        ++field2603;
        if (this.field2612 != null) {
            return true;
        } else {
            int var2 = -34 / ((-37 - arg0) / 60);
            if (~this.field2606 <= -1) {
                class48 var3 = class9.method78(class137.field2239, this.field2606, true);
                var3.method323();
                this.field2611 = var3.field1756;
                this.field2604 = var3.field1757;
                this.field2612 = var3.field747;
                return true;
            } else {
                return false;
            }
        }
    }
}
