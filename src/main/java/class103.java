import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class28 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!of", name = "M", descriptor = "Lqf;")
    public static class117 field2489 = class72.method514(112, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!of", name = "D", descriptor = "Lqf;")
    public static class117 field2480 = class72.method514(111, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Leb;")
    public static class31 field2473 = new class31(64);

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Lqf;")
    private static class117 field2494 = class72.method514(104, "Unable to connect)3");

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Z")
    public static boolean field2498 = false;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "Lqf;")
    public static class117 field2500 = class72.method514(117, " )2>");

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lqf;")
    public static class117 field2497 = field2494;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "Lqf;")
    public static class117 field2495 = field2494;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "Lqf;")
    private static class117 field2504 = class72.method514(100, "wishes to duel with you)3");

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "Lqf;")
    public static class117 field2493 = field2504;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "[I")
    public static int[] field2502 = new int[32];

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "Lr;")
    public static class118 field2503;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "Ldd;")
    public static class26 field2496;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Ldf;")
    public static class28 field2499;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "Ljb;")
    public static class64 field2491;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "Lmf;")
    public static class89 field2492;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2490;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2474;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "[I")
    public static int[] field2501;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZII[Lmf;IIII)Z")
    public static final boolean method791(int arg0, int arg1, boolean arg2, int arg3, int arg4, class89[] arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2484;
        class49.method358(arg9, arg4, arg0, arg1);
        boolean var10 = arg2;
        for (int var11 = 0; ~arg5.length < ~var11; ++var11) {
            class89 var12 = arg5[var11];
            if (var12 != null && (~var12.field2154 == ~arg3 || ~arg3 == 1412584498 && class120.field2876 == var12.field2125 && ~class29.field589 == ~var12.field2122)) {
                if (~var12.field2136 < -1) {
                    class100.method786(var12, 1);
                }
                int var13 = arg4 - arg6 + var12.field2046;
                int var14 = var12.field2129;
                int var15 = var12.field2133 + arg9 + -arg7;
                if (class120.field2876 == var12.field2125 && class29.field589 == var12.field2122) {
                    if (~arg3 != 1412584498 && !var12.field2034) {
                        class56.field1157 = -arg4 + arg6;
                        class104.field2518 = -arg9 + arg7;
                        class40.field801 = arg5;
                        continue;
                    }
                    class89 var16 = class104.method799(var12, 108);
                    if (var16 != null) {
                        int var17 = class143.field3504;
                        int var18 = class18.field274;
                        if (class35.field740 == 0) {
                            var18 -= 4;
                            var17 -= 4;
                        }
                        if (~class35.field740 == -2) {
                            var17 -= 553;
                            var18 -= 205;
                        }
                        if (~class35.field740 == -3) {
                            var17 -= 17;
                            var18 -= 357;
                        }
                        int var19 = var18 - class66.field1385;
                        int var20 = var17 - class67.field1400;
                        int[] var21 = class80.method629(arg2, var16);
                        if (var20 < var21[0]) {
                            var20 = var21[0];
                        }
                        if (var19 < var21[1]) {
                            var19 = var21[1];
                        }
                        if (var21[1] - -var16.field2095 < var12.field2095 + var19) {
                            var19 = -var12.field2095 + var16.field2095 + var21[1];
                        }
                        if (var12.field2152 + var20 > var21[0] + var16.field2152) {
                            var20 = var21[0] - var12.field2152 + var16.field2152;
                        }
                        class89 var22 = class141.field3426[var12.field2125 >> 16][var12.field2154 & 65535];
                        int[] var23 = class80.method629(true, var22);
                        if (!var12.field2034) {
                            var14 = 128;
                        }
                        int var24 = -var23[1] + var22.field2043 + var19;
                        int var25 = -var23[0] + var20 + var22.field2103;
                        int var26 = var25 - var12.field2133;
                        int var27 = var24 - var12.field2046;
                        if (var12.field2081 >= var26 && -var12.field2081 <= var26 && ~var27 >= ~var12.field2081 && ~var27 <= ~(-var12.field2081) && !class27.field540) {
                            var26 = 0;
                            var27 = 0;
                        } else if (class101.field2447 <= var12.field2137 && !class27.field540) {
                            var26 = 0;
                            var27 = 0;
                        }
                        var13 += var27;
                        var15 += var26;
                    } else {
                        class29.field589 = -1;
                        class120.field2876 = -1;
                    }
                }
                if ((!var12.field2102 || class49.field1035 >= var15 && var13 <= class49.field1029 && class49.field1034 <= var12.field2152 + var15 && ~class49.field1030 >= ~(var12.field2095 + var13)) && (!var12.field2102 || !class136.method1063((byte) 107, var12))) {
                    if (var12.field2142 == 0) {
                        if (!var12.field2102 && class136.method1063((byte) 68, var12) && !class82.method646(87, var11, arg8)) {
                            continue;
                        }
                        if (!var12.field2102) {
                            if (var12.field2043 > -var12.field2095 + var12.field2123) {
                                var12.field2043 = -var12.field2095 + var12.field2123;
                            }
                            if (var12.field2043 < 0) {
                                var12.field2043 = 0;
                            }
                        }
                        var10 &= method791(var12.field2152 + var15, var12.field2095 + var13, true, var12.field2125, var13, arg5, var12.field2043, var12.field2103, arg8, var15);
                        if (var12.field2084 != null) {
                            var10 &= method791(var12.field2152 + var15, var12.field2095 + var13, true, var12.field2125, var13, var12.field2084, var12.field2043, var12.field2103, arg8, var15);
                        }
                        class49.method358(arg9, arg4, arg0, arg1);
                        if (~var12.field2095 > ~var12.field2123 && !var12.field2102) {
                            class91.method726(var12.field2095, var15 - -var12.field2152, var12.field2043, (byte) 75, var13, var12.field2123);
                        }
                    }
                    if (~var12.field2142 != -2) {
                        if (var12.field2142 == 2) {
                            int var28 = 0;
                            for (int var29 = 0; var12.field2095 > var29; ++var29) {
                                for (int var30 = 0; var12.field2152 > var30; ++var30) {
                                    int var31 = var15 - -((var12.field2080 + 32) * var30);
                                    int var32 = (var12.field2089 + 32) * var29 + var13;
                                    if (~var28 > -21) {
                                        var32 += var12.field2104[var28];
                                        var31 += var12.field2041[var28];
                                    }
                                    if (~var12.field2161[var28] >= -1) {
                                        if (var12.field2098 != null && var28 < 20) {
                                            class84 var42 = var12.method699(var28, (byte) -112);
                                            if (var42 != null) {
                                                var42.method660(var31, var32);
                                            } else if (class60.field1227) {
                                                var10 = false;
                                            }
                                        }
                                    } else {
                                        boolean var33 = false;
                                        boolean var34 = false;
                                        int var35 = var12.field2161[var28] + -1;
                                        if (var31 > class49.field1034 + -32 && class49.field1035 > var31 && class49.field1030 + -32 < var32 && var32 < class49.field1029 || class121.field2891 != 0 && class83.field1906 == var28) {
                                            class84 var36;
                                            if (~class90.field2179 == -2 && ~class66.field1389 == ~var28 && class100.field2432 == var12.field2125) {
                                                var36 = class48.method348(var35, 0, false, 2, 97, var12.field2088[var28]);
                                            } else {
                                                var36 = class48.method348(var35, 3153952, false, 1, 125, var12.field2088[var28]);
                                            }
                                            if (var36 == null) {
                                                var10 = false;
                                            } else if (class121.field2891 != 0 && class83.field1906 == var28 && class83.field1900 == var12.field2125) {
                                                int var37 = -class16.field252 + class18.field274;
                                                int var38 = -class107.field2553 + class143.field3504;
                                                if (var37 < 5 && var37 > -5) {
                                                    var37 = 0;
                                                }
                                                if (var38 < 5 && var38 > -5) {
                                                    var38 = 0;
                                                }
                                                if (class65.field1343 < 5) {
                                                    var37 = 0;
                                                    var38 = 0;
                                                }
                                                var36.method679(var31 + var38, var32 - -var37, 128);
                                                if (arg3 != -1) {
                                                    class89 var39 = arg5[65535 & arg3];
                                                    if (var32 + var37 < class49.field1030 && var39.field2043 > 0) {
                                                        int var40 = (class49.field1030 - (var32 + var37)) * class83.field1911 / 3;
                                                        if (~(class83.field1911 * 10) > ~var40) {
                                                            var40 = class83.field1911 * 10;
                                                        }
                                                        if (var40 > var39.field2043) {
                                                            var40 = var39.field2043;
                                                        }
                                                        var39.field2043 -= var40;
                                                        class16.field252 += var40;
                                                    }
                                                    if (~(var32 + var37 + 32) < ~class49.field1029 && var39.field2043 < -var39.field2095 + var39.field2123) {
                                                        int var41 = (-class49.field1029 + var32 + var37 + 32) * class83.field1911 / 3;
                                                        if (~var41 < ~(class83.field1911 * 10)) {
                                                            var41 = class83.field1911 * 10;
                                                        }
                                                        if (-var39.field2095 + var39.field2123 - var39.field2043 < var41) {
                                                            var41 = -var39.field2095 + var39.field2123 + -var39.field2043;
                                                        }
                                                        var39.field2043 += var41;
                                                        class16.field252 -= var41;
                                                    }
                                                }
                                            } else if (~class34.field713 != -1 && class129.field3062 == var28 && class41.field816 == var12.field2125) {
                                                var36.method679(var31, var32, 128);
                                            } else {
                                                var36.method660(var31, var32);
                                            }
                                        }
                                    }
                                    ++var28;
                                }
                            }
                        } else if (var12.field2142 == 3) {
                            int var43;
                            if (!class31.method256(var12, 0)) {
                                var43 = var12.field2100;
                                if (class82.method646(40, var11, arg8) && ~var12.field2153 != -1) {
                                    var43 = var12.field2153;
                                }
                            } else {
                                var43 = var12.field2087;
                                if (class82.method646(91, var11, arg8) && var12.field2038 != 0) {
                                    var43 = var12.field2038;
                                }
                            }
                            if (var14 != 0) {
                                if (!var12.field2028) {
                                    class49.method356(var15, var13, var12.field2152, var12.field2095, var43, -(var14 & 255) + 256);
                                } else {
                                    class49.method361(var15, var13, var12.field2152, var12.field2095, var43, 256 - (255 & var14));
                                }
                            } else if (var12.field2028) {
                                class49.method360(var15, var13, var12.field2152, var12.field2095, var43);
                            } else {
                                class49.method351(var15, var13, var12.field2152, var12.field2095, var43);
                            }
                        } else if (~var12.field2142 == -5) {
                            class46 var44 = var12.method700(0);
                            if (var44 == null) {
                                if (class60.field1227) {
                                    var10 = false;
                                }
                            } else {
                                class117 var45 = var12.field2118;
                                int var46;
                                if (!class31.method256(var12, 0)) {
                                    var46 = var12.field2100;
                                    if (class82.method646(74, var11, arg8) && ~var12.field2153 != -1) {
                                        var46 = var12.field2153;
                                    }
                                } else {
                                    var46 = var12.field2087;
                                    if (class82.method646(127, var11, arg8) && ~var12.field2038 != -1) {
                                        var46 = var12.field2038;
                                    }
                                    if (~var12.field2066.method915(27) < -1) {
                                        var45 = var12.field2066;
                                    }
                                }
                                if (var12.field2102 && ~var12.field2070 != 0) {
                                    class72 var47 = class27.method206(var12.field2070, (byte) 90);
                                    var45 = var47.field1544;
                                    if (var45 == null) {
                                        var45 = class114.field2708;
                                    }
                                    if ((~var47.field1590 == -2 || var12.field2069 != 1) && var12.field2069 != -1) {
                                        var45 = class73.method530((byte) -83, new class117[] { class56.field1148, var45, class152.field3762, class48.method342(var12.field2069, (byte) -125) });
                                    }
                                }
                                if (~class115.field2719 == ~var12.field2125 && class153.field3786 == var12.field2122) {
                                    var46 = var12.field2100;
                                    var45 = class3.field62;
                                }
                                if (class49.field1033 == 479) {
                                    if (~var46 == -16776961) {
                                        var46 = 255;
                                    }
                                    if (var46 == 49152) {
                                        var46 = 16777215;
                                    }
                                }
                                class117 var48 = class23.method182(12074, var45, var12);
                                var44.method319(var48, var15, var13, var12.field2152, var12.field2095, var46, !var12.field2109 ? -1 : 0, var12.field2049, var12.field2061, var12.field2033);
                            }
                        } else if (var12.field2142 == 5) {
                            if (!var12.field2102) {
                                class84 var62 = var12.method706(class31.method256(var12, 0), -6524);
                                if (var62 != null) {
                                    var62.method660(var15, var13);
                                } else if (class60.field1227) {
                                    var10 = false;
                                }
                            } else {
                                class84 var49;
                                if (~var12.field2070 != 0) {
                                    var49 = class48.method348(var12.field2070, var12.field2131, false, var12.field2115, 92, var12.field2069);
                                } else {
                                    var49 = var12.method706(false, -6524);
                                }
                                if (var49 == null) {
                                    if (class60.field1227) {
                                        var10 = false;
                                    }
                                } else {
                                    int var50 = var49.field1921;
                                    int var51 = var49.field1919;
                                    if (!var12.field2114) {
                                        int var52 = var12.field2152 * 4096 / var50;
                                        if (~var12.field2044 != -1) {
                                            var49.method670(var15 - -(var12.field2152 / 2), var13 - -(var12.field2095 / 2), var12.field2044, var52);
                                        } else if (~var14 == -1) {
                                            if (~var12.field2152 == ~var50 && ~var12.field2095 == ~var51) {
                                                var49.method660(var15, var13);
                                            } else {
                                                var49.method678(var15, var13, var12.field2152, var12.field2095);
                                            }
                                        } else {
                                            var49.method661(var15, var13, var12.field2152, var12.field2095, -(var14 & 255) + 256);
                                        }
                                    } else {
                                        int var53 = var13;
                                        int[] var54 = new int[4];
                                        int var55 = var15;
                                        class49.method349(var54);
                                        int var56 = var12.field2095 + var13;
                                        if (var56 > var54[3]) {
                                            var56 = var54[3];
                                        }
                                        if (~var15 > ~var54[0]) {
                                            var55 = var54[0];
                                        }
                                        if (var13 < var54[1]) {
                                            var53 = var54[1];
                                        }
                                        int var57 = var15 - -var12.field2152;
                                        if (var54[2] < var57) {
                                            var57 = var54[2];
                                        }
                                        class49.method358(var55, var53, var57, var56);
                                        int var58 = (-1 - (-var50 - var12.field2152)) / var50;
                                        int var59 = (var12.field2095 - (-var51 + 1)) / var51;
                                        for (int var60 = 0; var58 > var60; ++var60) {
                                            for (int var61 = 0; ~var61 > ~var59; ++var61) {
                                                if (~var12.field2044 == -1) {
                                                    if (var14 != 0) {
                                                        var49.method679(var15 - -(var50 * var60), var51 * var61 + var13, 256 - (255 & var14));
                                                    } else {
                                                        var49.method660(var15 - -(var50 * var60), var51 * var61 + var13);
                                                    }
                                                } else {
                                                    var49.method670(var50 / 2 + var50 * var60 + var15, var51 / 2 + (var13 - -(var51 * var61)), var12.field2044, 4096);
                                                }
                                            }
                                        }
                                        class49.method355(var54);
                                    }
                                }
                            }
                        } else if (~var12.field2142 == -7) {
                            boolean var63 = class31.method256(var12, 0);
                            class30 var64 = null;
                            int var65 = 0;
                            int var66;
                            if (var63) {
                                var66 = var12.field2057;
                            } else {
                                var66 = var12.field2064;
                            }
                            if (~var12.field2070 != 0) {
                                class72 var67 = class27.method206(var12.field2070, (byte) 90);
                                if (var67 != null) {
                                    class72 var68 = var67.method512(var12.field2069, -1);
                                    var64 = var68.method510(-9570, 1);
                                    if (var64 != null) {
                                        var64.method232();
                                        var65 = var64.field708 / 2;
                                    } else {
                                        var10 = false;
                                    }
                                }
                            } else if (var12.field2091 == 5) {
                                if (~var12.field2113 == -1) {
                                    var64 = class79.field1788.method777(-1, (class96) null, -1, (class96) null, (byte) 1);
                                } else {
                                    var64 = class141.field3395.method7(-6941);
                                }
                            } else if (var66 != -1) {
                                class96 var69 = class130.method1013(var66, -114);
                                var64 = var12.method705(var63, var69, var12.field2111, 120, class141.field3395.field355);
                                if (var64 == null && class60.field1227) {
                                    var10 = false;
                                }
                            } else {
                                var64 = var12.method705(var63, (class96) null, -1, 115, class141.field3395.field355);
                                if (var64 == null && class60.field1227) {
                                    var10 = false;
                                }
                            }
                            class12.method97(var12.field2152 / 2 + var15, var12.field2095 / 2 + var13);
                            int var70 = class12.field180[var12.field2078] * var12.field2147 >> 16;
                            int var71 = class12.field177[var12.field2078] * var12.field2147 >> 16;
                            if (var64 != null) {
                                if (var12.field2102) {
                                    var64.method232();
                                    if (var12.field2042) {
                                        var64.method223(0, var12.field2150, var12.field2138, var12.field2078, var12.field2071, var65 + var70 - -var12.field2149, var12.field2149 + var71, var12.field2147);
                                    } else {
                                        var64.method243(0, var12.field2150, var12.field2138, var12.field2078, var12.field2071, var12.field2149 + var65 + var70, var12.field2149 + var71);
                                    }
                                } else {
                                    var64.method243(0, var12.field2150, 0, var12.field2078, 0, var70, var71);
                                }
                            }
                            class12.method92();
                        } else {
                            if (~var12.field2142 == -8) {
                                class46 var72 = var12.method700(0);
                                if (var72 == null) {
                                    if (class60.field1227) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var73 = 0;
                                for (int var74 = 0; var74 < var12.field2095; ++var74) {
                                    for (int var75 = 0; ~var12.field2152 < ~var75; ++var75) {
                                        if (~var12.field2161[var73] < -1) {
                                            class72 var76 = class27.method206(var12.field2161[var73] + -1, (byte) 90);
                                            class117 var77 = var76.field1544;
                                            if (var77 == null) {
                                                var77 = class114.field2708;
                                            }
                                            if (~var76.field1590 == -2 || var12.field2088[var73] != 1) {
                                                var77 = class73.method530((byte) -83, new class117[] { class56.field1148, var77, class152.field3762, class48.method342(var12.field2088[var73], (byte) -119) });
                                            }
                                            int var78 = (var12.field2080 + 115) * var75 + var15;
                                            int var79 = (var12.field2089 + 12) * var74 + var13;
                                            if (var12.field2049 != 0) {
                                                if (~var12.field2049 == -2) {
                                                    var72.method325(var77, var12.field2152 / 2 + var78, var79, var12.field2100, var12.field2109 ? 0 : -1);
                                                } else {
                                                    var72.method315(var77, var12.field2152 + -1 + var78, var79, var12.field2100, var12.field2109 ? 0 : -1);
                                                }
                                            } else {
                                                var72.method330(var77, var78, var79, var12.field2100, var12.field2109 ? 0 : -1);
                                            }
                                        }
                                        ++var73;
                                    }
                                }
                            }
                            if (~var12.field2142 == -9 && class116.method904(arg8, var11, arg2) && class5.field87 == class107.field2548) {
                                class117 var80 = var12.field2118;
                                int var81 = 0;
                                int var82 = 0;
                                class46 var83 = class25.field501;
                                class117 var84 = class23.method182(12074, var80, var12);
                                while (~var84.method915(27) < -1) {
                                    int var92 = var84.method926((byte) -112, class36.field773);
                                    class117 var93;
                                    if (var92 != -1) {
                                        var93 = var84.method943(0, (byte) 127, var92);
                                        var84 = var84.method908(var92 - -4, (byte) 120);
                                    } else {
                                        var93 = var84;
                                        var84 = class141.field3351;
                                    }
                                    int var94 = var83.method331(var93);
                                    var81 += var83.field938 + 1;
                                    if (var82 < var94) {
                                        var82 = var94;
                                    }
                                }
                                var82 += 6;
                                var81 += 7;
                                int var85 = -var82 + var12.field2152 + var15 + -5;
                                if (var85 < var15 + 5) {
                                    var85 = var15 + 5;
                                }
                                if (var85 - -var82 > arg0) {
                                    var85 = arg0 - var82;
                                }
                                int var86 = var12.field2095 + 5 + var13;
                                if (arg1 < var81 + var86) {
                                    var86 = -var81 + arg1;
                                }
                                class49.method360(var85, var86, var82, var81, 16777120);
                                class49.method351(var85, var86, var82, var81, 0);
                                int var87 = var86 - -var83.field938 + 2;
                                class117 var88 = var12.field2118;
                                class117 var89 = class23.method182(12074, var88, var12);
                                while (var89.method915(27) > 0) {
                                    int var90 = var89.method926((byte) -74, class36.field773);
                                    class117 var91;
                                    if (~var90 != 0) {
                                        var91 = var89.method943(0, (byte) 121, var90);
                                        var89 = var89.method908(var90 + 4, (byte) 120);
                                    } else {
                                        var91 = var89;
                                        var89 = class141.field3351;
                                    }
                                    var83.method330(var91, var85 + 3, var87, 0, -1);
                                    var87 += var83.field938 + 1;
                                }
                            }
                            if (~var12.field2142 == -10) {
                                if (var12.field2085 != 1) {
                                    int var95 = ~var12.field2095 > -1 ? -var12.field2095 : var12.field2095;
                                    int var96 = var12.field2152 >= 0 ? var12.field2152 : -var12.field2152;
                                    int var97 = var96;
                                    if (~var96 > ~var95) {
                                        var97 = var95;
                                    }
                                    if (~var97 != -1) {
                                        int var98 = (var12.field2152 << 16) / var97;
                                        int var99 = (var12.field2095 << 16) / var97;
                                        if (~var98 > ~var99) {
                                            var99 = -var99;
                                        } else {
                                            var98 = -var98;
                                        }
                                        int var100 = var12.field2085 * var99 - -1 >> 17;
                                        int var101 = var12.field2085 * var99 >> 17;
                                        int var102 = var12.field2085 * var98 >> 17;
                                        int var103 = var12.field2085 * var98 - -1 >> 17;
                                        int var104 = -var100 + var15;
                                        int var105 = var15 + var101;
                                        int var106 = -var100 + var12.field2152 + var15;
                                        int var107 = var15 - -var12.field2152 + var101;
                                        int var108 = var13 - -var102;
                                        int var109 = var12.field2095 + var13 - var103;
                                        int var110 = var13 - var103;
                                        int var111 = var12.field2095 + var13 + var102;
                                        class12.method103(var105, var104, var106);
                                        class12.method98(var108, var110, var109, var105, var104, var106, var12.field2100);
                                        class12.method103(var105, var106, var107);
                                        class12.method98(var108, var109, var111, var105, var106, var107, var12.field2100);
                                    }
                                } else {
                                    class49.method354(var15, var13, var15 - -var12.field2152, var12.field2095 + var13, var12.field2100);
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!of", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2485;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!of", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2487;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILjava/awt/Component;Lu;I)Lw;")
    public static final class149 method792(int arg0, int arg1, Component arg2, class137 arg3, int arg4) {
        ++field2483;
        if (class82.field1879 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && ~arg0 > -3) {
            if (~arg1 > -257) {
                arg1 = 256;
            }
            try {
                class149 var5 = (class149) Class.forName("ja").newInstance();
                var5.field3681 = new int[256 * (class82.field1873 ? 2 : 1)];
                var5.field3715 = arg1;
                var5.method431(arg2);
                var5.field3717 = (arg1 & -1024) + 1024;
                if (var5.field3717 > 16384) {
                    var5.field3717 = 16384;
                }
                var5.method435(var5.field3717);
                if (~class64.field1315 < -1 && class19.field306 == null) {
                    class19.field306 = new class73();
                    class19.field306.field1603 = arg3;
                    arg3.method1066(class19.field306, -23553, class64.field1315);
                }
                if (class19.field306 != null) {
                    if (class19.field306.field1599[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class19.field306.field1599[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg4 <= 66) {
                        method796(-1);
                    }
                    class111 var6 = new class111(arg3, arg0);
                    var6.field3715 = arg1;
                    var6.field3681 = new int[(class82.field1873 ? 2 : 1) * 256];
                    var6.method431(arg2);
                    var6.field3717 = 16384;
                    var6.method435(var6.field3717);
                    if (~class64.field1315 < -1 && class19.field306 == null) {
                        class19.field306 = new class73();
                        class19.field306.field1603 = arg3;
                        arg3.method1066(class19.field306, -23553, class64.field1315);
                    }
                    if (class19.field306 != null) {
                        if (class19.field306.field1599[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class19.field306.field1599[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class149();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method793(boolean arg0) {
        field2495 = null;
        field2497 = null;
        field2504 = null;
        field2489 = null;
        field2501 = null;
        field2502 = null;
        field2493 = null;
        field2499 = null;
        field2500 = null;
        field2473 = null;
        field2492 = null;
        field2494 = null;
        field2496 = null;
        field2480 = null;
        if (!arg0) {
            method796(111);
        }
        field2503 = null;
        field2491 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
    public static final boolean method794(int arg0, int arg1) {
        ++field2479;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg0 != -16687) {
            return false;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && ~arg1 >= -58;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BIII)V")
    public static final void method795(byte arg0, int arg1, int arg2, int arg3) {
        ++field2476;
        if (class71.field1526 != 0 && arg2 != 0 && ~class71.field1515 > -51) {
            class41.field814[class71.field1515] = arg1;
            class150.field3719[class71.field1515] = arg2;
            class95.field2289[class71.field1515] = arg3;
            class115.field2720[class71.field1515] = null;
            class124.field2923[class71.field1515] = 0;
            ++class71.field1515;
        }
        if (arg0 > -48) {
            field2494 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method210(int arg0, int arg1, byte arg2, Graphics arg3) {
        ++field2477;
        this.method797(116);
        arg3.drawImage(super.field560, arg0, arg1, this);
        if (arg2 != 78) {
            method796(33);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public static final void method796(int arg0) {
        ++field2486;
        if (class104.field2514 == 104) {
            int var1;
            if (~class8.field137 == 0) {
                var1 = class146.field3568;
            } else {
                var1 = class8.field137;
            }
            if (class8.field137 != class146.field3568) {
                --var1;
                if (~var1 > -1) {
                    var1 = 19;
                }
                if (class94.field2285[var1] != null) {
                    class141.field3406 = class94.field2285[var1];
                    class87.field1993 = true;
                    class8.field137 = var1;
                }
            }
        }
        if (~class104.field2514 == -106 && ~class8.field137 != 0) {
            ++class8.field137;
            if (class8.field137 >= 20) {
                class8.field137 = 0;
            }
            if (class8.field137 == class146.field3568) {
                class141.field3406 = class141.field3351;
                class87.field1993 = true;
                class8.field137 = -1;
            } else if (class94.field2285[class8.field137] != null) {
                class141.field3406 = class94.field2285[class8.field137];
                class87.field1993 = true;
            }
        }
        if (arg0 != 19) {
            method796(44);
        }
    }

    @OriginalMember(owner = "client!of", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2474 = arg0;
        ++field2475;
        arg0.setDimensions(super.field550, super.field556);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2490);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    private final synchronized void method797(int arg0) {
        ++field2471;
        if (this.field2474 != null) {
            if (arg0 < 8) {
                this.isConsumer((ImageConsumer) null);
            }
            this.field2474.setPixels(0, 0, super.field550, super.field556, this.field2490, super.field544, 0, super.field550);
            this.field2474.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!of", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2472;
        return true;
    }

    @OriginalMember(owner = "client!of", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2482;
        return this.field2474 == arg0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method215(int arg0, Component arg1, int arg2, int arg3) {
        super.field544 = new int[arg2 * arg3 + 1];
        super.field556 = arg3;
        super.field550 = arg2;
        this.field2490 = new DirectColorModel(32, 16711680, 65280, 255);
        int var5 = -11 / ((-13 - arg0) / 35);
        super.field560 = arg1.createImage(this);
        this.method797(56);
        arg1.prepareImage(super.field560, this);
        this.method797(82);
        arg1.prepareImage(super.field560, this);
        ++field2478;
        this.method797(32);
        arg1.prepareImage(super.field560, this);
        this.method214(8);
    }

    @OriginalMember(owner = "client!of", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2474 == arg0) {
            this.field2474 = null;
        }
        ++field2488;
    }
}
