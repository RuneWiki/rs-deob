import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class126 extends class36 {

    @OriginalMember(owner = "client!td", name = "Xc", descriptor = "I")
    public int field2983 = 0;

    @OriginalMember(owner = "client!td", name = "ed", descriptor = "Z")
    public boolean field2990 = false;

    @OriginalMember(owner = "client!td", name = "fd", descriptor = "I")
    public int field2991 = -1;

    @OriginalMember(owner = "client!td", name = "xd", descriptor = "I")
    public int field3009 = -1;

    @OriginalMember(owner = "client!td", name = "Cd", descriptor = "I")
    public int field3014 = 0;

    @OriginalMember(owner = "client!td", name = "gd", descriptor = "I")
    public int field2992 = 0;

    @OriginalMember(owner = "client!td", name = "sd", descriptor = "I")
    public int field3004 = 0;

    @OriginalMember(owner = "client!td", name = "zd", descriptor = "I")
    public int field3011 = 0;

    @OriginalMember(owner = "client!td", name = "cd", descriptor = "Lrd;")
    public static class114 field2988 = class84.method656("backtop1", (byte) 125);

    @OriginalMember(owner = "client!td", name = "kd", descriptor = "Lrd;")
    private static class114 field2996 = class84.method656("Enter name of player to delete from list", (byte) 123);

    @OriginalMember(owner = "client!td", name = "pd", descriptor = "Lrd;")
    public static class114 field3001 = class84.method656("(U1", (byte) 116);

    @OriginalMember(owner = "client!td", name = "td", descriptor = "Lrd;")
    public static class114 field3005 = field2996;

    @OriginalMember(owner = "client!td", name = "wd", descriptor = "I")
    public static volatile int field3008 = 0;

    @OriginalMember(owner = "client!td", name = "Dd", descriptor = "Lrd;")
    public static class114 field3015 = class84.method656("Lade Ignorieren)2Liste)3)3)3", (byte) 115);

    @OriginalMember(owner = "client!td", name = "yd", descriptor = "I")
    public static volatile int field3010 = 0;

    @OriginalMember(owner = "client!td", name = "ud", descriptor = "Lrd;")
    public static class114 field3006 = class84.method656("Ung-Ultiger Benutzername", (byte) 115);

    @OriginalMember(owner = "client!td", name = "qd", descriptor = "Ldd;")
    public static class26 field3002 = new class26(30);

    @OriginalMember(owner = "client!td", name = "Id", descriptor = "[Lke;")
    public static class73[] field3020 = new class73[256];

    @OriginalMember(owner = "client!td", name = "Yc", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!td", name = "Zc", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!td", name = "ad", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!td", name = "bd", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!td", name = "dd", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!td", name = "hd", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!td", name = "id", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!td", name = "ld", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!td", name = "md", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!td", name = "nd", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!td", name = "od", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!td", name = "rd", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!td", name = "vd", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!td", name = "Ad", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!td", name = "Bd", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!td", name = "Ed", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!td", name = "Fd", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!td", name = "Gd", descriptor = "Lrd;")
    public class114 field3018;

    @OriginalMember(owner = "client!td", name = "Hd", descriptor = "Lue;")
    public class133 field3019;

    @OriginalMember(owner = "client!td", name = "jd", descriptor = "Lo;")
    public class92 field2995;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method973(int arg0, int arg1) {
        if (arg1 == -1 && ~class82.field1828 == -1) {
            class78.method621(-116);
        } else if (~arg1 != 0 && ~class8.field112 != ~arg1 && class39.field825 != 0 && class82.field1828 == 0) {
            class78.method620(class39.field825, false, 0, -5, 10, 0, class137.field3318, arg1);
        }
        ++field2986;
        class8.field112 = arg1;
        if (arg0 != 0) {
            method974((class100) null, (class100) null, 29);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lpb;Lpb;I)V")
    public static final void method974(class100 arg0, class100 arg1, int arg2) {
        ++field2993;
        class124.field2962 = arg1;
        class140.field3345 = arg0;
        if (arg2 < 9) {
            method973(94, 52);
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Z")
    public final boolean method66(byte arg0) {
        ++field2997;
        if (this.field2995 == null) {
            return false;
        } else {
            return arg0 <= -121;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(B)V")
    public static final void method975(byte arg0) {
        class7.field90 = new int[4][105][105];
        class123.field2904 = new byte[4][104][104];
        class128.field3064 = new byte[4][104][104];
        class132.field3194 = new byte[4][105][105];
        class118.field2769 = new int[104];
        client.field409 = 99;
        class92.field2144 = new byte[4][104][104];
        class98.field2227 = new int[104];
        if (arg0 != 64) {
            field3015 = null;
        }
        class47.field984 = new int[105][105];
        class60.field1289 = new int[104];
        class116.field2717 = new int[104];
        class1.field8 = new byte[4][104][104];
        ++field3000;
        class36.field773 = new int[104];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lid;I)V")
    public final void method976(class60 arg0, int arg1) {
        ++field3016;
        arg0.field1227 = 0;
        int var3 = arg0.method462((byte) 116);
        this.field2991 = arg0.method449(true);
        int var4 = arg1;
        this.field3009 = arg0.method449(true);
        int[] var5 = new int[12];
        this.field2983 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg0.method462((byte) 116);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method462((byte) 116);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && ~var5[0] == -65536) {
                    var4 = arg0.method467(arg1 ^ -256);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class128.method988(var5[var6] - 512, false).field1107;
                    if (var12 != 0) {
                        this.field2983 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg0.method462((byte) 116);
            if (var11 < 0 || var11 >= class102.field2372[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field697 = arg0.method467(255);
        if (~super.field697 == -65536) {
            super.field697 = -1;
        }
        super.field757 = arg0.method467(255);
        if (super.field757 == 65535) {
            super.field757 = -1;
        }
        super.field743 = super.field757;
        super.field696 = arg0.method467(255);
        if (super.field696 == 65535) {
            super.field696 = -1;
        }
        super.field739 = arg0.method467(255);
        if (~super.field739 == -65536) {
            super.field739 = -1;
        }
        super.field730 = arg0.method467(255);
        if (super.field730 == 65535) {
            super.field730 = -1;
        }
        super.field716 = arg0.method467(255);
        if (~super.field716 == -65536) {
            super.field716 = -1;
        }
        super.field753 = arg0.method467(255);
        if (super.field753 == 65535) {
            super.field753 = -1;
        }
        this.field3018 = class42.method295(-26567, arg0.method490(false)).method863(-85);
        this.field3004 = arg0.method462((byte) 116);
        this.field2992 = arg0.method467(255);
        if (this.field2995 == null) {
            this.field2995 = new class92();
        }
        this.field2995.method710(~var3 == -2, var4, (byte) -34, var9, var5);
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public static void method977(int arg0) {
        int var1 = 84 / ((arg0 - -55) / 33);
        field3020 = null;
        field2988 = null;
        field3005 = null;
        field3002 = null;
        field3015 = null;
        field3001 = null;
        field2996 = null;
        field3006 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[Lnd;IIIIIIIIII)V")
    public static final void method978(int arg0, class90[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3017;
        if (arg9 <= arg11 && arg5 <= arg7 && arg11 < arg4 && arg7 < arg3) {
            for (int var12 = 0; arg1.length > var12; ++var12) {
                class90 var13 = arg1[var12];
                if (var13 != null && ~var13.field2103 == ~arg10 && (!var13.field2011 || !class121.method947(var13, true))) {
                    int var14 = var13.field2015 + arg9 + -arg8;
                    int var15 = var13.field2038 + arg5 - arg2;
                    if ((var13.field2072 >= 0 || ~var13.field2052 != -1) && ~arg11 <= ~var14 && ~var15 >= ~arg7 && ~arg11 > ~(var13.field2032 + var14) && ~(var13.field2044 + var15) < ~arg7) {
                        if (~var13.field2072 <= -1) {
                            class48.field993 = var13.field2072;
                        } else {
                            class48.field993 = var12;
                        }
                    }
                    if (~var13.field2024 == -9 && var14 <= arg11 && ~var15 >= ~arg7 && var14 - -var13.field2032 > arg11 && var13.field2044 + var15 > arg7) {
                        class145.field3466 = var12;
                    }
                    if (var13.field2024 == 0) {
                        if (!var13.field2011 && class121.method947(var13, true) && !class121.method942(arg6, var12, -4)) {
                            continue;
                        }
                        method978(43, arg1, var13.field2013, var13.field2044 + var15, var14 - -var13.field2032, var15, arg6, arg7, var13.field2043, var14, var13.field2060, arg11);
                        if (var13.field2031 != null) {
                            method978(93, var13.field2031, var13.field2013, var15 - -var13.field2044, var13.field2032 + var14, var15, arg6, arg7, var13.field2043, var14, var13.field2060, arg11);
                        }
                        if (~var13.field2017 < ~var13.field2044 && !var13.field2011) {
                            class88.method668(var13.field2017, var13.field2044, var15, arg7, arg6, -105, arg11, var13, var13.field2032 + var14);
                        }
                        if (!var13.field2011) {
                            continue;
                        }
                    }
                    if (~var13.field2066 == -2 && var14 <= arg11 && ~arg7 <= ~var15 && ~(var13.field2032 + var14) < ~arg11 && arg7 < var13.field2044 + var15) {
                        boolean var16 = false;
                        if (~var13.field2049 != -1) {
                            var16 = class116.method901(var13, (byte) 118);
                        }
                        if (!var16) {
                            ++class28.field559;
                            class3.method10(0, class72.field1610, var13.field2060, (byte) 120, 42, var13.field2122, 0);
                        }
                    }
                    if (var13.field2066 == 2 && !class125.field2975 && ~var14 >= ~arg11 && ~var15 >= ~arg7 && ~(var14 - -var13.field2032) < ~arg11 && ~arg7 > ~(var13.field2044 + var15)) {
                        class114 var17 = class21.method140(var13, true);
                        if (var17 != null) {
                            class3.method10(-1, class101.method786((byte) 125, new class114[] { class85.field1885, var13.field2037 }), var13.field2060, (byte) 126, 4, var17, 0);
                            ++class29.field612;
                        }
                    }
                    if (~var13.field2066 == -4 && var14 <= arg11 && arg7 >= var15 && ~(var13.field2032 + var14) < ~arg11 && arg7 < var13.field2044 + var15) {
                        ++class120.field2817;
                        byte var18;
                        if (arg6 != 3) {
                            var18 = 39;
                        } else {
                            var18 = 55;
                        }
                        class3.method10(0, class72.field1610, var13.field2060, (byte) 124, var18, class25.field500, 0);
                    }
                    if (~var13.field2066 == -5 && arg11 >= var14 && arg7 >= var15 && ~arg11 > ~(var13.field2032 + var14) && arg7 < var15 - -var13.field2044) {
                        ++class61.field1296;
                        class3.method10(0, class72.field1610, var13.field2060, (byte) 122, 25, var13.field2122, 0);
                    }
                    if (var13.field2066 == 5 && ~var14 >= ~arg11 && var15 <= arg7 && var13.field2032 + var14 > arg11 && ~arg7 > ~(var13.field2044 + var15)) {
                        class3.method10(0, class72.field1610, var13.field2060, (byte) 123, 53, var13.field2122, 0);
                        ++class47.field967;
                    }
                    if (~var13.field2066 == -7 && class20.field357 == -1 && var14 <= arg11 && var15 <= arg7 && ~(var13.field2032 + var14) < ~arg11 && arg7 < var13.field2044 + var15) {
                        class3.method10(-1, class72.field1610, var13.field2060, (byte) 127, 45, var13.field2122, 0);
                        ++class144.field3421;
                    }
                    if (var13.field2024 == 2) {
                        int var19 = 0;
                        for (int var20 = 0; ~var13.field2044 < ~var20; ++var20) {
                            for (int var21 = 0; ~var21 > ~var13.field2032; ++var21) {
                                int var22 = (var13.field2012 + 32) * var21 + var14;
                                int var23 = var15 - -((32 - -var13.field2104) * var20);
                                if (var19 < 20) {
                                    var22 += var13.field2028[var19];
                                    var23 += var13.field2090[var19];
                                }
                                if (~arg11 <= ~var22 && var23 <= arg7 && ~arg11 > ~(var22 + 32) && ~(var23 + 32) < ~arg7) {
                                    class20.field356 = var19;
                                    class137.field3302 = var13.field2060;
                                    if (~var13.field2019[var19] < -1) {
                                        class52 var24 = class128.method988(var13.field2019[var19] - 1, false);
                                        if (class145.field3452 == 1 && class8.method69(0, class39.method278(var13, 1572721824))) {
                                            if (~class80.field1818 != ~var13.field2060 || class52.field1087 != var19) {
                                                ++class47.field972;
                                                class3.method10(var19, class101.method786((byte) 125, new class114[] { class16.field319, class25.field504, var24.field1111 }), var13.field2060, (byte) 126, 29, class117.field2724, var24.field1077);
                                            }
                                        } else if (class125.field2975 && class8.method69(0, class39.method278(var13, 1572721824))) {
                                            if ((16 & class22.field427) == 16) {
                                                class3.method10(var19, class101.method786((byte) 125, new class114[] { class34.field683, class25.field504, var24.field1111 }), var13.field2060, (byte) 123, 41, class120.field2803, var24.field1077);
                                                ++class102.field2386;
                                            }
                                        } else {
                                            class114[] var25 = var24.field1100;
                                            ++class101.field2337;
                                            if (class106.field2445) {
                                                var25 = class29.method220(120, var25);
                                            }
                                            if (class8.method69(0, class39.method278(var13, 1572721824))) {
                                                for (int var26 = 4; var26 >= 3; --var26) {
                                                    if (var25 != null && var25[var26] != null) {
                                                        byte var27;
                                                        if (var26 != 3) {
                                                            var27 = 57;
                                                        } else {
                                                            var27 = 31;
                                                        }
                                                        class3.method10(var19, class101.method786((byte) 125, new class114[] { class24.field454, var24.field1111 }), var13.field2060, (byte) 120, var27, var25[var26], var24.field1077);
                                                        ++class49.field1011;
                                                    } else if (var26 == 4) {
                                                        class3.method10(var19, class101.method786((byte) 127, new class114[] { class24.field454, var24.field1111 }), var13.field2060, (byte) 125, 57, class84.field1882, var24.field1077);
                                                        ++class11.field186;
                                                    }
                                                }
                                            }
                                            if (class70.method554((byte) -66, class39.method278(var13, 1572721824))) {
                                                ++class124.field2950;
                                                class3.method10(var19, class101.method786((byte) 127, new class114[] { class24.field454, var24.field1111 }), var13.field2060, (byte) 123, 23, class117.field2724, var24.field1077);
                                            }
                                            if (class8.method69(0, class39.method278(var13, 1572721824)) && var25 != null) {
                                                for (int var28 = 2; var28 >= 0; --var28) {
                                                    if (var25[var28] != null) {
                                                        ++class16.field323;
                                                        byte var29 = 0;
                                                        if (~var28 == -1) {
                                                            var29 = 28;
                                                        }
                                                        if (var28 == 1) {
                                                            var29 = 50;
                                                        }
                                                        if (var28 == 2) {
                                                            var29 = 6;
                                                        }
                                                        class3.method10(var19, class101.method786((byte) 126, new class114[] { class24.field454, var24.field1111 }), var13.field2060, (byte) 126, var29, var25[var28], var24.field1077);
                                                    }
                                                }
                                            }
                                            class114[] var30 = var13.field2083;
                                            if (class106.field2445) {
                                                var30 = class29.method220(109, var30);
                                            }
                                            if (var30 != null) {
                                                for (int var31 = 4; ~var31 <= -1; --var31) {
                                                    if (var30[var31] != null) {
                                                        ++class66.field1419;
                                                        byte var32 = 0;
                                                        if (var31 == 0) {
                                                            var32 = 37;
                                                        }
                                                        if (var31 == 1) {
                                                            var32 = 10;
                                                        }
                                                        if (var31 == 2) {
                                                            var32 = 1;
                                                        }
                                                        if (~var31 == -4) {
                                                            var32 = 48;
                                                        }
                                                        if (var31 == 4) {
                                                            var32 = 36;
                                                        }
                                                        class3.method10(var19, class101.method786((byte) 126, new class114[] { class24.field454, var24.field1111 }), var13.field2060, (byte) 122, var32, var30[var31], var24.field1077);
                                                    }
                                                }
                                            }
                                            class3.method10(var19, class101.method786((byte) 125, new class114[] { class24.field454, var24.field1111 }), var13.field2060, (byte) 124, 1006, class124.field2937, var24.field1077);
                                        }
                                    }
                                }
                                ++var19;
                            }
                        }
                    }
                    if (var13.field2011) {
                        if (class125.field2975) {
                            if (class90.method688(class39.method278(var13, 1572721824), true) && ~(class22.field427 & 32) == -33 && var14 <= arg11 && var15 <= arg7 && var13.field2032 + var14 > arg11 && var13.field2044 + var15 > arg7) {
                                ++class12.field211;
                                class3.method10(var13.field2107, class101.method786((byte) 127, new class114[] { class34.field683, class122.field2851, var13.field2106 }), var13.field2060, (byte) 127, 15, class120.field2803, 0);
                            }
                        } else if (arg11 >= var14 && var15 <= arg7 && ~(var14 - -var13.field2032) < ~arg11 && ~arg7 > ~(var13.field2044 + var15)) {
                            for (int var33 = 9; ~var33 <= -6; --var33) {
                                class114 var37 = class140.method1120(var13, var33, (byte) 115);
                                if (var37 != null) {
                                    class3.method10(var13.field2107, var13.field2106, var13.field2060, (byte) 126, 24, var37, var33 + 1);
                                    ++class85.field1896;
                                }
                            }
                            class114 var34 = class21.method140(var13, true);
                            if (var34 != null) {
                                class3.method10(var13.field2107, var13.field2106, var13.field2060, (byte) 126, 4, var34, 0);
                                ++class29.field612;
                            }
                            for (int var35 = 4; var35 >= 0; --var35) {
                                class114 var36 = class140.method1120(var13, var35, (byte) 75);
                                if (var36 != null) {
                                    ++class85.field1896;
                                    class3.method10(var13.field2107, var13.field2106, var13.field2060, (byte) 125, 24, var36, var35 + 1);
                                }
                            }
                            if (class116.method902((byte) 116, class39.method278(var13, 1572721824))) {
                                class3.method10(-1, class72.field1610, var13.field2060, (byte) 122, 45, var13.field2122, 0);
                                ++class144.field3421;
                            }
                        }
                    }
                }
            }
            if (arg0 <= 5) {
                field3008 = -32;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILid;IIII)V")
    public static final void method979(int arg0, int arg1, int arg2, class60 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 == 49) {
            if (~arg1 <= -1 && ~arg1 > -105 && arg6 >= 0 && arg6 < 104) {
                class22.field430[arg7][arg1][arg6] = 0;
                while (true) {
                    int var8 = arg3.method462((byte) 116);
                    if (~var8 == -1) {
                        if (~arg7 != -1) {
                            class124.field2958[arg7][arg1][arg6] = class124.field2958[arg7 + -1][arg1][arg6] + -240;
                        } else {
                            class124.field2958[0][arg1][arg6] = -class109.method827(arg5 + 4188, arg1 + arg2 + 932731, arg6 + 556238 + arg4) * 8;
                        }
                        break;
                    }
                    if (var8 == 1) {
                        int var9 = arg3.method462((byte) 116);
                        if (~var9 == -2) {
                            var9 = 0;
                        }
                        if (arg7 == 0) {
                            class124.field2958[0][arg1][arg6] = -var9 * 8;
                        } else {
                            class124.field2958[arg7][arg1][arg6] = class124.field2958[arg7 + -1][arg1][arg6] - var9 * 8;
                        }
                        break;
                    }
                    if (var8 <= 49) {
                        class128.field3064[arg7][arg1][arg6] = arg3.method449(true);
                        class123.field2904[arg7][arg1][arg6] = (byte) ((var8 + -2) / 4);
                        class1.field8[arg7][arg1][arg6] = (byte) class96.method737(3, var8 + -2 + arg0);
                    } else if (var8 <= 81) {
                        class22.field430[arg7][arg1][arg6] = (byte) (var8 + -49);
                    } else {
                        class92.field2144[arg7][arg1][arg6] = (byte) (var8 + -81);
                    }
                }
            } else {
                while (true) {
                    int var10 = arg3.method462((byte) 116);
                    if (var10 == 0) {
                        break;
                    }
                    if (var10 == 1) {
                        arg3.method462((byte) 116);
                        break;
                    }
                    if (var10 <= 49) {
                        arg3.method462((byte) 116);
                    }
                }
            }
            ++field3007;
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public static final void method980(int arg0) {
        class39 var1 = class63.field1340;
        synchronized (class63.field1340) {
            class116.field2719 = class8.field117;
            class100.field2289 = class28.field573;
            class75.field1741 = class107.field2452;
            client.field417 = class73.field1634;
            class142.field3392 = field3008;
            class118.field2758 = class28.field562;
            class116.field2710 = class90.field2061;
            int var2 = 119 % ((-51 - arg0) / 43);
            class73.field1634 = 0;
        }
        ++field3012;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Lue;")
    public final class133 method67(byte arg0) {
        ++field2994;
        if (this.field2995 == null) {
            return null;
        } else {
            if (arg0 >= -9) {
                method977(-54);
            }
            class29 var2 = super.field750 != -1 && super.field705 == 0 ? class12.method97(super.field750, false) : null;
            class29 var3 = super.field736 == -1 || this.field2990 || super.field736 == super.field697 && var2 != null ? null : class12.method97(super.field736, false);
            class133 var4 = this.field2995.method717(super.field704, var2, 0, super.field692, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method1071();
                super.field746 = var4.field1052;
                if (!this.field2990 && ~super.field721 != 0 && super.field744 != -1) {
                    class133 var5 = class74.method606(true, super.field721).method511(-1565796086, super.field744);
                    if (var5 != null) {
                        var5.method1086(0, -super.field731, 0);
                        class133[] var6 = new class133[] { var4, var5 };
                        var4 = new class133(var6, 2);
                    }
                }
                if (!this.field2990 && this.field3019 != null) {
                    if (class20.field370 >= this.field3014) {
                        this.field3019 = null;
                    }
                    if (class20.field370 >= this.field3011 && ~this.field3014 < ~class20.field370) {
                        class133 var7 = this.field3019;
                        var7.method1086(-super.field712 + this.field3003, -this.field2999 + this.field3013, this.field2987 - super.field756);
                        if (super.field725 == 512) {
                            var7.method1067();
                            var7.method1067();
                            var7.method1067();
                        } else if (super.field725 != 1024) {
                            if (~super.field725 == -1537) {
                                var7.method1067();
                            }
                        } else {
                            var7.method1067();
                            var7.method1067();
                        }
                        class133[] var8 = new class133[] { var4, var7 };
                        var4 = new class133(var8, 2);
                        if (~super.field725 == -513) {
                            var7.method1067();
                        } else if (~super.field725 != -1025) {
                            if (~super.field725 == -1537) {
                                var7.method1067();
                                var7.method1067();
                                var7.method1067();
                            }
                        } else {
                            var7.method1067();
                            var7.method1067();
                        }
                        var7.method1086(-this.field3003 + super.field712, -this.field3013 + this.field2999, super.field756 - this.field2987);
                    }
                }
                var4.field3213 = true;
                return var4;
            }
        }
    }
}
