import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class240 extends class117 {

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    private int field4276 = 4096;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "[I")
    private int[] field4280 = new int[3];

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    private int field4277 = 4096;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    private int field4278 = 409;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    private int field4286 = 4096;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "Lhh;")
    public static class163 field4285 = class137.method1065("Mem:", 17);

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "Z")
    public static boolean field4291 = true;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "Lhh;")
    public static class163 field4289 = class137.method1065("Eingabeprozedur geladen)3", 17);

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "[I")
    public static int[] field4282;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)Z")
    public static final boolean method1661(int arg0) throws IOException {
        ++field4279;
        if (class188.field3443 == null) {
            return false;
        } else {
            int var1 = class188.field3443.method1725(false);
            if (var1 == 0) {
                return false;
            } else {
                if (class92.field1744 == -1) {
                    class188.field3443.method1727(class33.field502.field1562, (byte) -98, 1, 0);
                    class33.field502.field1541 = 0;
                    --var1;
                    class92.field1744 = class33.field502.method80((byte) 87);
                    class125.field2415 = class215.field3922[class92.field1744];
                }
                if (class125.field2415 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class188.field3443.method1727(class33.field502.field1562, (byte) -88, 1, 0);
                    class125.field2415 = 255 & class33.field502.field1562[0];
                    --var1;
                }
                if (~class125.field2415 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class188.field3443.method1727(class33.field502.field1562, (byte) -104, 2, 0);
                    class33.field502.field1541 = 0;
                    var1 -= 2;
                    class125.field2415 = class33.field502.method658(126);
                }
                if (~var1 > ~class125.field2415) {
                    return false;
                } else {
                    class33.field502.field1541 = 0;
                    class188.field3443.method1727(class33.field502.field1562, (byte) -75, class125.field2415, 0);
                    class203.field3687 = 0;
                    class38.field635 = class113.field2125;
                    class113.field2125 = class182.field3359;
                    class182.field3359 = class92.field1744;
                    if (~class92.field1744 == -89) {
                        class163 var2 = class33.field502.method605(true);
                        int var3 = class33.field502.method608(-111);
                        int var4 = class33.field502.method608(-125);
                        if (~var3 <= -2 && ~var3 >= -9) {
                            if (var2.method1228(class67.field1148, 2)) {
                                var2 = null;
                            }
                            class97.field1825[var3 + -1] = var2;
                            class209.field3788[var3 - 1] = ~var4 == -1;
                        }
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 8) {
                        int var5 = class33.field502.method622(true);
                        int var6 = class33.field502.method622(true);
                        int var7 = class33.field502.method658(108);
                        int var8 = class33.field502.method622(true);
                        int var9 = class33.field502.method622(true);
                        class28.method174(var7, var8, true, var5, var9, 2, var6);
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 210) {
                        int var10 = class33.field502.method611(true);
                        int var11 = class33.field502.method639(2);
                        int var12 = class33.field502.method658(74);
                        class69 var13 = class124.method989((byte) 114, var11);
                        var13.field1322 = (var10 << 16) + var12;
                        class92.field1744 = -1;
                        return true;
                    } else if (~class92.field1744 == -54) {
                        int var14 = class33.field502.method614((byte) -126);
                        if (~var14 == -65536) {
                            var14 = -1;
                        }
                        int var15 = class33.field502.method603(-1);
                        class69 var16 = class124.method989((byte) 115, var15);
                        if (~var16.field1208 != -2 || ~var16.field1245 != ~var14) {
                            var16.field1245 = var14;
                            var16.field1208 = 1;
                            class213.method1517((byte) 11, var16);
                        }
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 203) {
                        int var17 = class33.field502.method611(true);
                        int var18 = class33.field502.method620((byte) -82);
                        if (var17 == 65535) {
                            var17 = -1;
                        }
                        class69 var19 = class124.method989((byte) 114, var18);
                        if (~var19.field1208 != -3 || ~var19.field1245 != ~var17) {
                            var19.field1245 = var17;
                            var19.field1208 = 2;
                            class213.method1517((byte) 11, var19);
                        }
                        class92.field1744 = -1;
                        return true;
                    } else if (~class92.field1744 == -174) {
                        int var20 = class33.field502.method608(-75);
                        int var21 = class33.field502.method614((byte) -125);
                        int var22 = class33.field502.method611(true);
                        class2 var23 = class111.field2098[var22];
                        if (var23 != null) {
                            class94.method746(-127, var23, var21, var20);
                        }
                        class92.field1744 = -1;
                        return true;
                    } else if (~class92.field1744 == -130) {
                        int var24 = class33.field502.method629((byte) -116);
                        int var25 = class33.field502.method658(-61);
                        class93.field1750 = var25;
                        class132.field2560 = var24;
                        class259.method1755((byte) 123);
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 94) {
                        class183.method1356(true);
                        class92.field1744 = -1;
                        return false;
                    } else if (class92.field1744 == 156) {
                        int var26 = class33.field502.method639(2);
                        class69 var27 = class124.method989((byte) 113, var26);
                        var27.field1208 = 3;
                        var27.field1245 = class235.field4203.field2444.method1346(false);
                        class213.method1517((byte) 11, var27);
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 240) {
                        class6.field103 = class33.field502.method619(101);
                        class62.field1045 = class33.field502.method609((byte) 118);
                        while (~class33.field502.field1541 > ~class125.field2415) {
                            class92.field1744 = class33.field502.method622(true);
                            class81.method642(7);
                        }
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 7) {
                        int var28 = class33.field502.method609((byte) 118);
                        int var29 = var28 >> 2;
                        int var30 = class140.field2674[var29];
                        int var31 = 3 & var28;
                        int var32 = class33.field502.method618(false);
                        int var33 = (var32 & 268425682) >> 14;
                        int var34 = (915163143 & var32) >> 28;
                        int var35 = var32 & 16383;
                        int var36 = class33.field502.method611(true);
                        int var37 = var35 - class257.field4500;
                        if (~var36 == -65536) {
                            var36 = -1;
                        }
                        int var38 = var33 - class62.field1035;
                        class94.method745(var29, var38, var30, var36, var34, var37, var31, (byte) -29);
                        class92.field1744 = -1;
                        return true;
                    } else if (~class92.field1744 == -102) {
                        class163 var39 = class33.field502.method605(true);
                        int var40 = class33.field502.method614((byte) -122);
                        int var41 = class33.field502.method611(true);
                        method1663(var41, (byte) -70);
                        class97.method766(var40, true, var39);
                        class92.field1744 = -1;
                        return true;
                    } else if (~class92.field1744 == -11) {
                        class124.method992(0, class169.field3090, class33.field502, class125.field2415);
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 233) {
                        int var42 = class33.field502.method622(true);
                        int var43 = var42 >> 6;
                        class135 var44 = new class135();
                        var44.field2612 = var42 & 63;
                        var44.field2602 = class33.field502.method622(true);
                        if (~var44.field2602 <= -1 && var44.field2602 < class243.field4303.length) {
                            if (~var44.field2612 != -2 && ~var44.field2612 != -11) {
                                if (~var44.field2612 <= -3 && ~var44.field2612 >= -7) {
                                    if (var44.field2612 == 2) {
                                        var44.field2610 = 64;
                                        var44.field2608 = 64;
                                    }
                                    if (~var44.field2612 == -4) {
                                        var44.field2608 = 64;
                                        var44.field2610 = 0;
                                    }
                                    if (~var44.field2612 == -5) {
                                        var44.field2610 = 128;
                                        var44.field2608 = 64;
                                    }
                                    if (~var44.field2612 == -6) {
                                        var44.field2608 = 0;
                                        var44.field2610 = 64;
                                    }
                                    if (~var44.field2612 == -7) {
                                        var44.field2610 = 64;
                                        var44.field2608 = 128;
                                    }
                                    var44.field2612 = 2;
                                    var44.field2616 = class33.field502.method658(-99);
                                    var44.field2603 = class33.field502.method658(-104);
                                    var44.field2609 = class33.field502.method622(true);
                                }
                            } else {
                                var44.field2613 = class33.field502.method658(97);
                                class33.field502.field1541 += 3;
                            }
                            var44.field2605 = class33.field502.method658(-81);
                            if (var44.field2605 == 65535) {
                                var44.field2605 = -1;
                            }
                            class174.field3174[var43] = var44;
                        }
                        class92.field1744 = -1;
                        return true;
                    } else if (class92.field1744 == 17) {
                        class233.field4166 = class24.field384;
                        long var45 = class33.field502.method652(32767);
                        if (var45 == 0L) {
                            class92.field1744 = -1;
                            class16.field235 = 0;
                            class38.field634 = null;
                            class20.field328 = null;
                            class71.field1334 = null;
                            return true;
                        } else {
                            long var47 = class33.field502.method652(32767);
                            class38.field634 = class12.method76(var47, (byte) 61);
                            class71.field1334 = class12.method76(var45, (byte) 71);
                            class196.field3537 = class33.field502.method635(-104);
                            int var49 = class33.field502.method622(true);
                            if (~var49 == -256) {
                                class92.field1744 = -1;
                                return true;
                            } else {
                                class16.field235 = var49;
                                class27[] var50 = new class27[100];
                                for (int var51 = 0; var51 < class16.field235; ++var51) {
                                    var50[var51] = new class27();
                                    var50[var51].field2641 = class33.field502.method652(32767);
                                    var50[var51].field425 = class12.method76(var50[var51].field2641, (byte) 120);
                                    var50[var51].field417 = class33.field502.method658(126);
                                    var50[var51].field416 = class33.field502.method635(-111);
                                    var50[var51].field421 = class33.field502.method605(true);
                                    if (class9.field156 == var50[var51].field2641) {
                                        class2.field35 = var50[var51].field416;
                                    }
                                }
                                boolean var52 = false;
                                int var53 = class16.field235;
                                while (var53 > 0) {
                                    boolean var54 = true;
                                    --var53;
                                    for (int var55 = 0; var55 < var53; ++var55) {
                                        if (var50[var55].field425.method1192(var50[var55 - -1].field425, -77) > 0) {
                                            var54 = false;
                                            class27 var56 = var50[var55];
                                            var50[var55] = var50[var55 + 1];
                                            var50[var55 + 1] = var56;
                                        }
                                    }
                                    if (var54) {
                                        break;
                                    }
                                }
                                class92.field1744 = -1;
                                class20.field328 = var50;
                                return true;
                            }
                        }
                    } else if (class92.field1744 != 96 && class92.field1744 != 22 && class92.field1744 != 139 && ~class92.field1744 != -79 && ~class92.field1744 != -178 && class92.field1744 != 23 && class92.field1744 != 108 && class92.field1744 != 241 && class92.field1744 != 238 && ~class92.field1744 != -19 && ~class92.field1744 != -96 && class92.field1744 != 144) {
                        if (class92.field1744 == 237) {
                            class6.field103 = class33.field502.method609((byte) 118);
                            class62.field1045 = class33.field502.method619(-99);
                            for (int var57 = class62.field1045; var57 < class62.field1045 + 8; ++var57) {
                                for (int var59 = class6.field103; var59 < class6.field103 + 8; ++var59) {
                                    if (class32.field498[class20.field323][var57][var59] != null) {
                                        class32.field498[class20.field323][var57][var59] = null;
                                        class55.method390(var57, 16952, var59);
                                    }
                                }
                            }
                            for (class250 var58 = (class250) class143.field2708.method1017(87); var58 != null; var58 = (class250) class143.field2708.method1016((byte) -31)) {
                                if (~class62.field1045 >= ~var58.field4396 && class62.field1045 - -8 > var58.field4396 && var58.field4397 >= class6.field103 && class6.field103 + 8 > var58.field4397 && class20.field323 == var58.field4391) {
                                    var58.field4401 = 0;
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 254) {
                            class67.method460(256, class33.field502.method605(true));
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -144) {
                            int var60 = class33.field502.method614((byte) -128);
                            int var61 = class33.field502.method639(2);
                            class84.method676((byte) -110, var60, var61);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -159) {
                            class113.method900((byte) -18);
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 12) {
                            class71.field1349 = class33.field502.method611(true) * 30;
                            class204.field3693 = class24.field384;
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 230) {
                            if (~class193.field3521 != 0) {
                                class146.method1102(0, class193.field3521, -1458);
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -249) {
                            int var62 = class33.field502.method639(2);
                            int var63 = class33.field502.method611(true);
                            class69 var64 = class124.method989((byte) 118, var62);
                            if (var64 != null && var64.field1294 == 0) {
                                if (~(-var64.field1220 + var64.field1160) > ~var63) {
                                    var63 = -var64.field1220 + var64.field1160;
                                }
                                if (~var63 > -1) {
                                    var63 = 0;
                                }
                                if (var64.field1196 != var63) {
                                    var64.field1196 = var63;
                                    class213.method1517((byte) 11, var64);
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -146) {
                            long var65 = class33.field502.method652(32767);
                            long var67 = (long) class33.field502.method658(-56);
                            long var69 = (long) class33.field502.method615(-103);
                            long var71 = (var67 << 32) - -var69;
                            boolean var73 = false;
                            int var74 = class33.field502.method622(true);
                            int var75 = 0;
                            label1089: while (true) {
                                if (var75 >= 100) {
                                    if (~var74 >= -2) {
                                        if (class97.field1837 != 1 && ~class209.field3789 != -2) {
                                            for (int var76 = 0; class29.field465 > var76; ++var76) {
                                                if (class116.field2207[var76] == var65) {
                                                    var73 = true;
                                                    break label1089;
                                                }
                                            }
                                        } else {
                                            var73 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class211.field3825[var75] == ~var71) {
                                    var73 = true;
                                    break;
                                }
                                ++var75;
                            }
                            if (!var73 && class45.field760 == 0) {
                                class211.field3825[class183.field3364] = var71;
                                class183.field3364 = (class183.field3364 + 1) % 100;
                                class163 var77 = class79.method582(class2.method23(class33.field502, (byte) 100).method1200((byte) -65));
                                if (var74 != 2 && var74 != 3) {
                                    if (~var74 != -2) {
                                        class56.method396(var77, 125, class12.method76(var65, (byte) 61).method1190((byte) 73), 3);
                                    } else {
                                        class56.method396(var77, 107, class145.method1101(0, new class163[] { class183.field3362, class12.method76(var65, (byte) 62).method1190((byte) 73) }), 7);
                                    }
                                } else {
                                    class56.method396(var77, 114, class145.method1101(0, new class163[] { class152.field2852, class12.method76(var65, (byte) 114).method1190((byte) 73) }), 7);
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 90) {
                            int var78 = class33.field502.method618(false);
                            int var79 = class33.field502.method629((byte) -123);
                            if (~var79 == -65536) {
                                var79 = -1;
                            }
                            int var80 = class33.field502.method603(-1);
                            class69 var81 = class124.method989((byte) 123, var80);
                            if (!var81.field1240) {
                                if (var79 == -1) {
                                    var81.field1208 = 0;
                                    class92.field1744 = -1;
                                    return true;
                                }
                                class99 var82 = class120.method939(22952, var79);
                                var81.field1208 = 4;
                                var81.field1234 = var82.field1925 * 100 / var78;
                                var81.field1245 = var79;
                                var81.field1227 = var82.field1868;
                                var81.field1193 = var82.field1918;
                                class213.method1517((byte) 11, var81);
                            } else {
                                var81.field1177 = var79;
                                var81.field1226 = var78;
                                class99 var83 = class120.method939(22952, var79);
                                var81.field1227 = var83.field1868;
                                var81.field1234 = var83.field1925;
                                var81.field1202 = var83.field1904;
                                if (~var81.field1189 >= -1) {
                                    if (~var81.field1320 < -1) {
                                        var81.field1234 = var81.field1234 * 32 / var81.field1320;
                                    }
                                } else {
                                    var81.field1234 = var81.field1234 * 32 / var81.field1189;
                                }
                                var81.field1327 = var83.field1926;
                                var81.field1310 = var83.field1889;
                                var81.field1193 = var83.field1918;
                                class213.method1517((byte) 11, var81);
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -32) {
                            long var84 = class33.field502.method652(32767);
                            class33.field502.method635(106);
                            long var86 = class33.field502.method652(32767);
                            long var88 = (long) class33.field502.method658(-98);
                            long var90 = (long) class33.field502.method615(-114);
                            int var92 = class33.field502.method622(true);
                            int var93 = class33.field502.method658(-70);
                            long var94 = (var88 << 32) + var90;
                            boolean var96 = false;
                            int var97 = 0;
                            label1112: while (true) {
                                if (var97 >= 100) {
                                    if (~var92 >= -2) {
                                        for (int var98 = 0; class29.field465 > var98; ++var98) {
                                            if (class116.field2207[var98] == var84) {
                                                var96 = true;
                                                break label1112;
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (~class211.field3825[var97] == ~var94) {
                                    var96 = true;
                                    break;
                                }
                                ++var97;
                            }
                            if (!var96 && class45.field760 == 0) {
                                class211.field3825[class183.field3364] = var94;
                                class183.field3364 = (class183.field3364 + 1) % 100;
                                class163 var99 = class71.method517(0, var93).method1632(false, class33.field502);
                                if (var92 != 2 && ~var92 != -4) {
                                    if (~var92 != -2) {
                                        class260.method1758(var99, var93, class12.method76(var84, (byte) 43).method1190((byte) 73), false, 20, class12.method76(var86, (byte) 121).method1190((byte) 73));
                                    } else {
                                        class260.method1758(var99, var93, class145.method1101(0, new class163[] { class183.field3362, class12.method76(var84, (byte) 113).method1190((byte) 73) }), false, 20, class12.method76(var86, (byte) 87).method1190((byte) 73));
                                    }
                                } else {
                                    class260.method1758(var99, var93, class145.method1101(0, new class163[] { class152.field2852, class12.method76(var84, (byte) 58).method1190((byte) 73) }), false, 20, class12.method76(var86, (byte) 126).method1190((byte) 73));
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -194) {
                            for (int var100 = 0; var100 < class119.field2252.length; ++var100) {
                                if (class213.field3881[var100] != class119.field2252[var100]) {
                                    class119.field2252[var100] = class213.field3881[var100];
                                    class115.method920((byte) -111, var100);
                                    class107.field2047[class7.method50(class132.field2547++, 31)] = var100;
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -189) {
                            class49.method351((byte) 1, true);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -121) {
                            int var101 = class33.field502.method618(false);
                            int var102 = class33.field502.method614((byte) -127);
                            int var103 = 31 & var102 >> 5;
                            int var104 = 31 & var102 >> 10;
                            int var105 = 31 & var102;
                            int var106 = (var103 << 11) + (var104 << 19) + (var105 << 3);
                            class69 var107 = class124.method989((byte) 126, var101);
                            if (~var107.field1170 != ~var106) {
                                var107.field1170 = var106;
                                class213.method1517((byte) 11, var107);
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 216) {
                            class52.method360((byte) 37);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -181) {
                            int var108 = class33.field502.method658(-127);
                            if (~var108 == -65536) {
                                var108 = -1;
                            }
                            int var109 = class33.field502.method622(true);
                            int var110 = class33.field502.method658(-115);
                            class199.method1426(var109, var108, 48, var110);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -59) {
                            int var111 = class33.field502.method622(true);
                            if (class33.field502.method622(true) != 0) {
                                --class33.field502.field1541;
                                client.field2004[var111] = new class55(class33.field502);
                            } else {
                                client.field2004[var111] = new class55();
                            }
                            class62.field1041 = class24.field384;
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 226) {
                            class260.method1763(0);
                            class262.field4587 = class33.field502.method647(true);
                            class204.field3693 = class24.field384;
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 118) {
                            int var112 = class33.field502.method620((byte) -82);
                            int var113 = class33.field502.method611(true);
                            class161.method1178(var112, -106, var113);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -124) {
                            int var114 = class33.field502.method620((byte) -82);
                            int var115 = class33.field502.method620((byte) -82);
                            class222 var116 = (class222) class92.field1739.method1743((long) var114, false);
                            class222 var117 = (class222) class92.field1739.method1743((long) var115, false);
                            if (var117 != null) {
                                class115.method913(var116 == null || var116.field4049 != var117.field4049, var117, (byte) 92);
                            }
                            if (var116 != null) {
                                var116.method1063(84);
                                class92.field1739.method1741(var116, false, (long) var115);
                            }
                            class69 var118 = class124.method989((byte) 119, var114);
                            if (var118 != null) {
                                class213.method1517((byte) 11, var118);
                            }
                            class69 var119 = class124.method989((byte) 116, var115);
                            if (var119 != null) {
                                class213.method1517((byte) 11, var119);
                                class171.method1278((byte) 89, var119, true);
                            }
                            if (~class193.field3521 != 0) {
                                class146.method1102(1, class193.field3521, -1458);
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 223) {
                            int var120 = class33.field502.method658(-59);
                            int var121 = class33.field502.method611(true);
                            int var122 = class33.field502.method611(true);
                            int var123 = class33.field502.method639(2);
                            if (~(var123 >> 30) == -1) {
                                if (var123 >> 29 != 0) {
                                    int var124 = var123 & 65535;
                                    class2 var125 = class111.field2098[var124];
                                    if (var125 != null) {
                                        var125.field3636 = 0;
                                        var125.field3671 = var122;
                                        var125.field3657 = class227.field4092 + var120;
                                        if (var125.field3671 == 65535) {
                                            var125.field3671 = -1;
                                        }
                                        var125.field3649 = var121;
                                        var125.field3630 = 0;
                                        if (~class227.field4092 > ~var125.field3657) {
                                            var125.field3630 = -1;
                                        }
                                    }
                                } else if (var123 >> 28 != 0) {
                                    int var126 = var123 & 65535;
                                    class126 var127;
                                    if (class129.field2513 != var126) {
                                        var127 = class106.field2029[var126];
                                    } else {
                                        var127 = class235.field4203;
                                    }
                                    if (var127 != null) {
                                        var127.field3649 = var121;
                                        var127.field3671 = var122;
                                        var127.field3630 = 0;
                                        if (var127.field3671 == 65535) {
                                            var127.field3671 = -1;
                                        }
                                        var127.field3636 = 0;
                                        var127.field3657 = class227.field4092 + var120;
                                        if (class227.field4092 < var127.field3657) {
                                            var127.field3630 = -1;
                                        }
                                    }
                                }
                            } else {
                                int var128 = ((var123 & 268420686) >> 14) + -class62.field1035;
                                int var129 = var123 >> 28 & 3;
                                int var130 = (16383 & var123) - class257.field4500;
                                if (var128 >= 0 && ~var130 <= -1 && var128 < 104 && ~var130 > -105) {
                                    int var131 = var128 * 128 + 64;
                                    int var132 = var130 * 128 + 64;
                                    class106 var133 = new class106(var122, var129, var131, var132, class127.method1011(var132, var131, var129, 29908) - var121, var120, class227.field4092);
                                    class130.field2525.method1018((byte) 68, new class179(var133));
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -5) {
                            int var134 = class33.field502.method629((byte) -128);
                            int var135 = class33.field502.method614((byte) -124);
                            int var136 = class33.field502.method658(-91);
                            int var137 = class33.field502.method639(2);
                            class69 var138 = class124.method989((byte) 117, var137);
                            if (~var138.field1193 != ~var134 || var138.field1227 != var136 || ~var138.field1234 != ~var135) {
                                var138.field1227 = var136;
                                var138.field1193 = var134;
                                var138.field1234 = var135;
                                class213.method1517((byte) 11, var138);
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -244) {
                            boolean var139 = false;
                            long var140 = class33.field502.method652(32767);
                            long var142 = (long) class33.field502.method658(-85);
                            long var144 = (long) class33.field502.method615(-111);
                            int var146 = class33.field502.method622(true);
                            long var147 = (var142 << 32) + var144;
                            int var149 = class33.field502.method658(93);
                            int var150 = 0;
                            label1145: while (true) {
                                if (var150 >= 100) {
                                    if (~var146 >= -2) {
                                        for (int var151 = 0; var151 < class29.field465; ++var151) {
                                            if (class116.field2207[var151] == var140) {
                                                var139 = true;
                                                break label1145;
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (~class211.field3825[var150] == ~var147) {
                                    var139 = true;
                                    break;
                                }
                                ++var150;
                            }
                            if (!var139 && class45.field760 == 0) {
                                class211.field3825[class183.field3364] = var147;
                                class183.field3364 = (class183.field3364 - -1) % 100;
                                class163 var152 = class71.method517(0, var149).method1632(false, class33.field502);
                                if (~var146 != -3) {
                                    if (~var146 == -2) {
                                        class260.method1758(var152, var149, class145.method1101(0, new class163[] { class183.field3362, class12.method76(var140, (byte) 24).method1190((byte) 73) }), false, 18, (class163) null);
                                    } else {
                                        class260.method1758(var152, var149, class12.method76(var140, (byte) 36).method1190((byte) 73), false, 18, (class163) null);
                                    }
                                } else {
                                    class260.method1758(var152, var149, class145.method1101(0, new class163[] { class152.field2852, class12.method76(var140, (byte) 27).method1190((byte) 73) }), false, 18, (class163) null);
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 92) {
                            boolean var153 = ~class33.field502.method609((byte) 118) == -2;
                            int var154 = class33.field502.method618(false);
                            class69 var155 = class124.method989((byte) 121, var154);
                            if (!var155.field1312 == var153) {
                                var155.field1312 = var153;
                                class213.method1517((byte) 11, var155);
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 64) {
                            int var156 = class33.field502.method658(71);
                            int var157 = class33.field502.method609((byte) 118);
                            if (var157 == 2) {
                                class236.method1641(26);
                            }
                            class193.field3521 = var156;
                            class231.method1610(var156, 0);
                            class243.method1677(122, false);
                            class233.method1615(class193.field3521, 91);
                            for (int var158 = 0; ~var158 > -101; ++var158) {
                                class110.field2086[var158] = true;
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 169) {
                            int var159 = class33.field502.method620((byte) -82);
                            class222 var160 = (class222) class92.field1739.method1743((long) var159, false);
                            if (var160 != null) {
                                class115.method913(true, var160, (byte) 108);
                            }
                            if (class18.field283 != null) {
                                class213.method1517((byte) 11, class18.field283);
                                class18.field283 = null;
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 165) {
                            class260.method1763(0);
                            int var161 = class33.field502.method622(true);
                            int var162 = class33.field502.method603(-1);
                            int var163 = class33.field502.method619(-33);
                            class50.field841[var163] = var162;
                            class190.field3480[var163] = var161;
                            class13.field210[var163] = 1;
                            for (int var164 = 0; var164 < 98; ++var164) {
                                if (class264.field4588[var164] <= var162) {
                                    class13.field210[var163] = var164 + 2;
                                }
                            }
                            class37.field621[class7.method50(class75.field1402++, 31)] = var163;
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -104) {
                            long var165 = class33.field502.method652(32767);
                            class163 var167 = class79.method582(class2.method23(class33.field502, (byte) 120).method1200((byte) -65));
                            class56.method396(var167, 122, class12.method76(var165, (byte) 30).method1190((byte) 73), 6);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -139) {
                            class186.field3414 = class33.field502.method622(true);
                            class114.field2146 = class33.field502.method622(true);
                            class50.field854 = class33.field502.method622(true);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -38) {
                            class265.field4605 = 0;
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -199) {
                            class260.method1763(0);
                            class102.field1962 = class33.field502.method622(true);
                            class204.field3693 = class24.field384;
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 40) {
                            int var168 = class33.field502.method622(true);
                            int var169 = class33.field502.method622(true);
                            int var170 = class33.field502.method658(-76);
                            int var171 = class33.field502.method622(true);
                            int var172 = class33.field502.method622(true);
                            class141.method1081(var171, var172, (byte) -112, var169, var170, var168);
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 197) {
                            class62.field1045 = class33.field502.method609((byte) 118);
                            class6.field103 = class33.field502.method608(-79);
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 75) {
                            int var173 = class33.field502.method622(true);
                            int var174 = class33.field502.method614((byte) -126);
                            int var175 = class33.field502.method620((byte) -82);
                            class222 var176 = (class222) class92.field1739.method1743((long) var175, false);
                            if (var176 != null) {
                                class115.method913(~var176.field4049 != ~var174, var176, (byte) 77);
                            }
                            class69.method483(var175, var174, 15058, var173);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -12) {
                            int var177 = class33.field502.method611(true);
                            if (var177 == 65535) {
                                var177 = -1;
                            }
                            class199.method1429(var177, (byte) -127);
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 130) {
                            int var178 = class33.field502.method607(-613727056);
                            int var179 = class33.field502.method614((byte) -123);
                            if (var179 == 65535) {
                                var179 = -1;
                            }
                            class216.method1534(var179, var178, 0);
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 81) {
                            int var180 = class33.field502.method618(false);
                            class69 var181 = class124.method989((byte) 109, var180);
                            for (int var182 = 0; ~var182 > ~var181.field1219.length; ++var182) {
                                var181.field1219[var182] = -1;
                                var181.field1219[var182] = 0;
                            }
                            class213.method1517((byte) 11, var181);
                            class92.field1744 = -1;
                            return true;
                        } else if (~class92.field1744 == -43) {
                            class219.method1551(true);
                            class260.method1763(0);
                            class92.field1744 = -1;
                            class132.field2547 += 32;
                            return true;
                        } else if (class92.field1744 == 87) {
                            for (int var183 = 0; class106.field2029.length > var183; ++var183) {
                                if (class106.field2029[var183] != null) {
                                    class106.field2029[var183].field3673 = -1;
                                }
                            }
                            for (int var184 = 0; ~class111.field2098.length < ~var184; ++var184) {
                                if (class111.field2098[var184] != null) {
                                    class111.field2098[var184].field3673 = -1;
                                }
                            }
                            class92.field1744 = -1;
                            return true;
                        } else if (class92.field1744 == 244) {
                            int var185 = class33.field502.method606(255);
                            int var186 = class33.field502.method647(true);
                            int var187 = class33.field502.method618(false);
                            class69 var188 = class124.method989((byte) 123, var187);
                            var188.field1214 = 0;
                            var188.field1243 = var188.field1298 = var185;
                            var188.field1231 = 0;
                            var188.field1218 = var188.field1167 = var186;
                            class213.method1517((byte) 11, var188);
                            class92.field1744 = -1;
                            return true;
                        } else {
                            if (arg0 < 74) {
                                field4282 = null;
                            }
                            if (~class92.field1744 == -147) {
                                int var189 = class33.field502.method629((byte) -119);
                                class163 var190 = class33.field502.method605(true);
                                int var191 = class33.field502.method629((byte) -119);
                                method1663(var189, (byte) -70);
                                class97.method766(var191, true, var190);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 27) {
                                class163 var192 = class33.field502.method605(true);
                                if (!var192.method1195(65, class14.field215)) {
                                    if (var192.method1195(65, class136.field2636)) {
                                        class163 var193 = var192.method1188(true, var192.method1229((byte) 116, class20.field320), 0);
                                        long var194 = var193.method1193((byte) 60);
                                        boolean var196 = false;
                                        for (int var197 = 0; class29.field465 > var197; ++var197) {
                                            if (~class116.field2207[var197] == ~var194) {
                                                var196 = true;
                                                break;
                                            }
                                        }
                                        if (!var196 && ~class45.field760 == -1) {
                                            class163 var198 = var192.method1188(true, -9 + var192.method1221(-23096), 1 + var192.method1229((byte) 100, class20.field320));
                                            class56.method396(var198, 109, var193, 8);
                                        }
                                    } else if (!var192.method1195(65, class226.field4089)) {
                                        if (var192.method1195(65, class8.field136)) {
                                            class163 var199 = var192.method1188(true, var192.method1229((byte) 114, class8.field136), 0);
                                            class56.method396(var199, 105, class170.field3120, 11);
                                        } else if (!var192.method1195(65, class152.field2851)) {
                                            if (var192.method1195(65, class19.field309)) {
                                                class163 var200 = var192.method1188(true, var192.method1229((byte) 118, class19.field309), 0);
                                                if (class45.field760 == 0) {
                                                    class56.method396(var200, 104, class170.field3120, 13);
                                                }
                                            } else if (var192.method1195(65, class96.field1814)) {
                                                class163 var201 = var192.method1188(true, var192.method1229((byte) 88, class20.field320), 0);
                                                boolean var202 = false;
                                                long var203 = var201.method1193((byte) 46);
                                                for (int var205 = 0; ~var205 > ~class29.field465; ++var205) {
                                                    if (class116.field2207[var205] == var203) {
                                                        var202 = true;
                                                        break;
                                                    }
                                                }
                                                if (!var202 && class45.field760 == 0) {
                                                    class56.method396(class170.field3120, 108, var201, 14);
                                                }
                                            } else if (!var192.method1195(65, class264.field4590)) {
                                                if (!var192.method1195(65, class124.field2400)) {
                                                    class56.method396(var192, 119, class170.field3120, 0);
                                                } else {
                                                    class163 var206 = var192.method1188(true, var192.method1229((byte) 118, class20.field320), 0);
                                                    long var207 = var206.method1193((byte) 79);
                                                    boolean var209 = false;
                                                    for (int var210 = 0; var210 < class29.field465; ++var210) {
                                                        if (class116.field2207[var210] == var207) {
                                                            var209 = true;
                                                            break;
                                                        }
                                                    }
                                                    if (!var209 && class45.field760 == 0) {
                                                        class56.method396(class170.field3120, 91, var206, 16);
                                                    }
                                                }
                                            } else {
                                                class163 var211 = var192.method1188(true, var192.method1229((byte) 110, class20.field320), 0);
                                                long var212 = var211.method1193((byte) 107);
                                                boolean var214 = false;
                                                for (int var215 = 0; class29.field465 > var215; ++var215) {
                                                    if (class116.field2207[var215] == var212) {
                                                        var214 = true;
                                                        break;
                                                    }
                                                }
                                                if (!var214 && ~class45.field760 == -1) {
                                                    class56.method396(class170.field3120, 116, var211, 15);
                                                }
                                            }
                                        } else {
                                            class163 var216 = var192.method1188(true, var192.method1229((byte) 117, class152.field2851), 0);
                                            if (class45.field760 == 0) {
                                                class56.method396(var216, 116, class170.field3120, 12);
                                            }
                                        }
                                    } else {
                                        class163 var217 = var192.method1188(true, var192.method1229((byte) 87, class20.field320), 0);
                                        boolean var218 = false;
                                        long var219 = var217.method1193((byte) 124);
                                        for (int var221 = 0; ~var221 > ~class29.field465; ++var221) {
                                            if (class116.field2207[var221] == var219) {
                                                var218 = true;
                                                break;
                                            }
                                        }
                                        if (!var218 && class45.field760 == 0) {
                                            class56.method396(class170.field3120, 102, var217, 10);
                                        }
                                    }
                                } else {
                                    class163 var222 = var192.method1188(true, var192.method1229((byte) 93, class20.field320), 0);
                                    long var223 = var222.method1193((byte) 95);
                                    boolean var225 = false;
                                    for (int var226 = 0; ~var226 > ~class29.field465; ++var226) {
                                        if (~class116.field2207[var226] == ~var223) {
                                            var225 = true;
                                            break;
                                        }
                                    }
                                    if (!var225 && class45.field760 == 0) {
                                        class56.method396(class164.field3036, 112, var222, 4);
                                    }
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -53) {
                                int var227 = class33.field502.method608(-55);
                                int var228 = class33.field502.method619(-112);
                                int var229 = class33.field502.method609((byte) 118);
                                class20.field323 = var227 >> 1;
                                class235.field4203.method1444(var228, 105, var229, ~(1 & var227) == -2);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -69) {
                                int var230 = class33.field502.method614((byte) -126);
                                int var231 = class33.field502.method658(86);
                                int var232 = class33.field502.method618(false);
                                method1663(var231, (byte) -70);
                                class243.method1678(var232, var230, (byte) -121);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 126) {
                                class163 var233 = class33.field502.method605(true);
                                int var234 = class33.field502.method618(false);
                                class69 var235 = class124.method989((byte) 124, var234);
                                if (!var233.method1208(var235.field1171, (byte) 105)) {
                                    var235.field1171 = var233;
                                    class213.method1517((byte) 11, var235);
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -72) {
                                int var236 = class33.field502.method614((byte) -128);
                                byte var237 = class33.field502.method626(-128);
                                class84.method676((byte) -57, var236, var237);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 35) {
                                int var238 = class33.field502.method620((byte) -82);
                                int var239 = class33.field502.method658(-82);
                                if (var238 < -70000) {
                                    var239 += 32768;
                                }
                                class69 var240;
                                if (~var238 <= -1) {
                                    var240 = class124.method989((byte) 111, var238);
                                } else {
                                    var240 = null;
                                }
                                while (~class33.field502.field1541 > ~class125.field2415) {
                                    int var241 = class33.field502.method636(99);
                                    int var242 = class33.field502.method658(-105);
                                    int var243 = 0;
                                    if (~var242 != -1) {
                                        var243 = class33.field502.method622(true);
                                        if (var243 == 255) {
                                            var243 = class33.field502.method620((byte) -82);
                                        }
                                    }
                                    if (var240 != null && var241 >= 0 && ~var240.field1219.length < ~var241) {
                                        var240.field1219[var241] = var242;
                                        var240.field1332[var241] = var243;
                                    }
                                    class64.method448(var243, (byte) 88, var241, var242 + -1, var239);
                                }
                                if (var240 != null) {
                                    class213.method1517((byte) 11, var240);
                                }
                                class260.method1763(0);
                                class217.field3956[class7.method50(class147.field2787++, 31)] = class7.method50(var239, 32767);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 99) {
                                long var244 = class33.field502.method652(32767);
                                int var246 = class33.field502.method658(-102);
                                int var247 = class33.field502.method622(true);
                                boolean var248 = true;
                                if (~var244 > -1L) {
                                    var248 = false;
                                    var244 &= Long.MAX_VALUE;
                                }
                                class163 var249 = class170.field3120;
                                if (var246 > 0) {
                                    var249 = class33.field502.method605(true);
                                }
                                class163 var250 = class12.method76(var244, (byte) 123).method1190((byte) 73);
                                for (int var251 = 0; ~class155.field2889 < ~var251; ++var251) {
                                    if (~class48.field798[var251] == ~var244) {
                                        if (class196.field3543[var251] != var246) {
                                            class196.field3543[var251] = var246;
                                            if (~var246 < -1) {
                                                class56.method396(class145.method1101(0, new class163[] { var250, class222.field4042 }), 105, class170.field3120, 5);
                                            }
                                            if (~var246 == -1) {
                                                class56.method396(class145.method1101(0, new class163[] { var250, class203.field3689 }), 91, class170.field3120, 5);
                                            }
                                        }
                                        class127.field2479[var251] = var249;
                                        class146.field2780[var251] = var247;
                                        class102.field1964[var251] = var248;
                                        var250 = null;
                                        break;
                                    }
                                }
                                if (var250 != null && class155.field2889 < 200) {
                                    class48.field798[class155.field2889] = var244;
                                    class46.field769[class155.field2889] = var250;
                                    class196.field3543[class155.field2889] = var246;
                                    class127.field2479[class155.field2889] = var249;
                                    class146.field2780[class155.field2889] = var247;
                                    class102.field1964[class155.field2889] = var248;
                                    ++class155.field2889;
                                }
                                int var252 = class155.field2889;
                                boolean var253 = false;
                                class208.field3780 = class24.field384;
                                while (~var252 < -1) {
                                    --var252;
                                    boolean var254 = true;
                                    for (int var255 = 0; ~var252 < ~var255; ++var255) {
                                        if (class196.field3543[var255] != class142.field2696 && ~class196.field3543[var255 + 1] == ~class142.field2696 || ~class196.field3543[var255] == -1 && ~class196.field3543[var255 + 1] != -1) {
                                            int var256 = class196.field3543[var255];
                                            var254 = false;
                                            class196.field3543[var255] = class196.field3543[var255 - -1];
                                            class196.field3543[var255 + 1] = var256;
                                            class163 var257 = class127.field2479[var255];
                                            class127.field2479[var255] = class127.field2479[var255 + 1];
                                            class127.field2479[var255 + 1] = var257;
                                            class163 var258 = class46.field769[var255];
                                            class46.field769[var255] = class46.field769[var255 - -1];
                                            class46.field769[var255 - -1] = var258;
                                            long var259 = class48.field798[var255];
                                            class48.field798[var255] = class48.field798[var255 - -1];
                                            class48.field798[var255 + 1] = var259;
                                            int var261 = class146.field2780[var255];
                                            class146.field2780[var255] = class146.field2780[var255 + 1];
                                            class146.field2780[var255 + 1] = var261;
                                            boolean var262 = class102.field1964[var255];
                                            class102.field1964[var255] = class102.field1964[var255 + 1];
                                            class102.field1964[var255 + 1] = var262;
                                        }
                                    }
                                    if (var254) {
                                        break;
                                    }
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 65) {
                                long var263 = class33.field502.method652(32767);
                                class33.field502.method635(113);
                                long var265 = class33.field502.method652(32767);
                                boolean var267 = false;
                                long var268 = (long) class33.field502.method658(-99);
                                long var270 = (long) class33.field502.method615(-91);
                                int var272 = class33.field502.method622(true);
                                long var273 = (var268 << 32) + var270;
                                int var275 = 0;
                                label1273: while (true) {
                                    if (var275 >= 100) {
                                        if (~var272 >= -2) {
                                            if (~class97.field1837 != -2 && ~class209.field3789 != -2) {
                                                for (int var276 = 0; var276 < class29.field465; ++var276) {
                                                    if (~class116.field2207[var276] == ~var263) {
                                                        var267 = true;
                                                        break label1273;
                                                    }
                                                }
                                            } else {
                                                var267 = true;
                                            }
                                        }
                                        break;
                                    }
                                    if (class211.field3825[var275] == var273) {
                                        var267 = true;
                                        break;
                                    }
                                    ++var275;
                                }
                                if (!var267 && class45.field760 == 0) {
                                    class211.field3825[class183.field3364] = var273;
                                    class183.field3364 = (class183.field3364 - -1) % 100;
                                    class163 var277 = class79.method582(class2.method23(class33.field502, (byte) 95).method1200((byte) -65));
                                    if (~var272 != -3 && ~var272 != -4) {
                                        if (~var272 != -2) {
                                            class264.method1782(var277, class12.method76(var265, (byte) 100).method1190((byte) 73), class12.method76(var263, (byte) 111).method1190((byte) 73), -1, 9);
                                        } else {
                                            class264.method1782(var277, class12.method76(var265, (byte) 100).method1190((byte) 73), class145.method1101(0, new class163[] { class183.field3362, class12.method76(var263, (byte) 75).method1190((byte) 73) }), -1, 9);
                                        }
                                    } else {
                                        class264.method1782(var277, class12.method76(var265, (byte) 61).method1190((byte) 73), class145.method1101(0, new class163[] { class152.field2852, class12.method76(var263, (byte) 92).method1190((byte) 73) }), -1, 9);
                                    }
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -48) {
                                int var278 = class33.field502.field1541 - -class125.field2415;
                                int var279 = class33.field502.method658(-128);
                                int var280 = class33.field502.method658(115);
                                if (~class193.field3521 != ~var279) {
                                    class193.field3521 = var279;
                                    class231.method1610(class193.field3521, 0);
                                    class243.method1677(95, false);
                                    class233.method1615(class193.field3521, 82);
                                    for (int var281 = 0; ~var281 > -101; ++var281) {
                                        class110.field2086[var281] = true;
                                    }
                                }
                                while (var280-- > 0) {
                                    int var290 = class33.field502.method620((byte) -82);
                                    int var291 = class33.field502.method658(-94);
                                    int var292 = class33.field502.method622(true);
                                    class222 var293 = (class222) class92.field1739.method1743((long) var290, false);
                                    if (var293 != null && var293.field4049 != var291) {
                                        class115.method913(true, var293, (byte) 115);
                                        var293 = null;
                                    }
                                    if (var293 == null) {
                                        var293 = class69.method483(var290, var291, 15058, var292);
                                    }
                                    var293.field4050 = true;
                                }
                                for (class222 var282 = (class222) class92.field1739.method1747((byte) 89); var282 != null; var282 = (class222) class92.field1739.method1745(-32496)) {
                                    if (var282.field4050) {
                                        var282.field4050 = false;
                                    } else {
                                        class115.method913(true, var282, (byte) 80);
                                    }
                                }
                                class192.field3514.method1742((byte) 33);
                                while (class33.field502.field1541 < var278) {
                                    int var283 = class33.field502.method620((byte) -82);
                                    int var284 = class33.field502.method658(79);
                                    int var285 = class33.field502.method658(98);
                                    int var286 = class33.field502.method620((byte) -82);
                                    for (int var287 = var284; ~var287 >= ~var285; ++var287) {
                                        long var288 = ((long) var283 << 32) + (long) var287;
                                        class192.field3514.method1741(new class129(var286), false, var288);
                                    }
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -77) {
                                long var294 = class33.field502.method652(32767);
                                boolean var296 = false;
                                int var297 = class33.field502.method658(118);
                                if (~(Long.MIN_VALUE & var294) != -1L) {
                                    var296 = true;
                                }
                                byte var298 = class33.field502.method635(-48);
                                if (!var296) {
                                    class163 var299 = class33.field502.method605(true);
                                    class27 var300 = new class27();
                                    var300.field2641 = var294;
                                    var300.field425 = class12.method76(var300.field2641, (byte) 92);
                                    var300.field421 = var299;
                                    var300.field416 = var298;
                                    var300.field417 = var297;
                                    int var301;
                                    for (var301 = class16.field235 + -1; var301 >= 0; --var301) {
                                        int var302 = class20.field328[var301].field425.method1192(var300.field425, 62);
                                        if (var302 == 0) {
                                            class20.field328[var301].field417 = var297;
                                            class20.field328[var301].field416 = var298;
                                            class20.field328[var301].field421 = var299;
                                            class233.field4166 = class24.field384;
                                            if (~class9.field156 == ~var294) {
                                                class2.field35 = var298;
                                            }
                                            class92.field1744 = -1;
                                            return true;
                                        }
                                        if (var302 < 0) {
                                            break;
                                        }
                                    }
                                    if (class20.field328.length <= class16.field235) {
                                        class92.field1744 = -1;
                                        return true;
                                    }
                                    for (int var303 = class16.field235 - 1; var303 > var301; --var303) {
                                        class20.field328[var303 + 1] = class20.field328[var303];
                                    }
                                    if (~class16.field235 == -1) {
                                        class20.field328 = new class27[100];
                                    }
                                    class20.field328[var301 + 1] = var300;
                                    ++class16.field235;
                                    if (class9.field156 == var294) {
                                        class2.field35 = var298;
                                    }
                                } else {
                                    if (~class16.field235 == -1) {
                                        class92.field1744 = -1;
                                        return true;
                                    }
                                    long var304 = var294 & Long.MAX_VALUE;
                                    boolean var306 = false;
                                    int var307;
                                    for (var307 = 0; ~class16.field235 < ~var307 && (class20.field328[var307].field2641 != var304 || ~class20.field328[var307].field417 != ~var297); ++var307) {
                                    }
                                    if (var307 < class16.field235) {
                                        while (~(class16.field235 - 1) < ~var307) {
                                            class20.field328[var307] = class20.field328[var307 + 1];
                                            ++var307;
                                        }
                                        --class16.field235;
                                        class20.field328[class16.field235] = null;
                                    }
                                }
                                class233.field4166 = class24.field384;
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 213) {
                                int var308 = class33.field502.method658(75);
                                class6.method49(33554431, var308);
                                class217.field3956[class7.method50(class147.field2787++, 31)] = class7.method50(var308, 32767);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 168) {
                                int var309 = class33.field502.method622(true);
                                int var310 = class33.field502.method622(true);
                                int var311 = class33.field502.method622(true);
                                int var312 = class33.field502.method622(true);
                                int var313 = class33.field502.method658(108);
                                class131.field2535[var309] = true;
                                class39.field657[var309] = var310;
                                class233.field4161[var309] = var311;
                                class96.field1811[var309] = var312;
                                class114.field2148[var309] = var313;
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -165) {
                                class49.method351((byte) 1, false);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -126) {
                                int var314 = class33.field502.method629((byte) -118);
                                int var315 = class33.field502.method619(78);
                                class161.method1178(var315, -100, var314);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -196) {
                                class259.field4536 = class33.field502.method622(true);
                                class92.field1744 = -1;
                                class208.field3780 = class24.field384;
                                return true;
                            } else if (class92.field1744 == 232) {
                                long var316 = class33.field502.method652(32767);
                                int var318 = class33.field502.method658(-57);
                                class163 var319 = class71.method517(0, var318).method1632(false, class33.field502);
                                class260.method1758(var319, var318, class12.method76(var316, (byte) 31).method1190((byte) 73), false, 19, (class163) null);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -84) {
                                int var320 = class33.field502.method603(-1);
                                int var321 = class33.field502.method620((byte) -82);
                                int var322 = class33.field502.method611(true);
                                int var323 = class33.field502.method611(true);
                                if (~var322 == -65536) {
                                    var322 = -1;
                                }
                                if (~var323 == -65536) {
                                    var323 = -1;
                                }
                                for (int var324 = var323; var322 >= var324; ++var324) {
                                    long var325 = ((long) var321 << 32) + (long) var324;
                                    class137 var327 = class192.field3514.method1743(var325, false);
                                    if (var327 != null) {
                                        var327.method1063(83);
                                    }
                                    class192.field3514.method1741(new class129(var320), false, var325);
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 242) {
                                class22.field351 = class33.field502.method622(true);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -73) {
                                if (class125.field2415 == 0) {
                                    class144.field2715 = class69.field1282;
                                } else {
                                    class144.field2715 = class33.field502.method605(true);
                                }
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -149) {
                                byte[] var328 = new byte[class125.field2415];
                                class33.field502.method83((byte) -46, 0, var328, class125.field2415);
                                class87.method684(class129.method1025(class125.field2415, 95, 0, var328), true, true);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -193) {
                                int var329 = class33.field502.method639(2);
                                class7.field120 = class169.field3090.method1250(10732, var329);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 227) {
                                class72.method532(-122, class33.field502);
                                class92.field1744 = -1;
                                return true;
                            } else if (class92.field1744 == 204) {
                                class238.method1647(8);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -180) {
                                int var330 = class33.field502.method620((byte) -82);
                                int var331 = class33.field502.method658(-68);
                                class69 var332;
                                if (var330 >= 0) {
                                    var332 = class124.method989((byte) 124, var330);
                                } else {
                                    var332 = null;
                                }
                                if (var332 != null) {
                                    for (int var333 = 0; ~var333 > ~var332.field1219.length; ++var333) {
                                        var332.field1219[var333] = 0;
                                        var332.field1332[var333] = 0;
                                    }
                                }
                                if (~var330 > 69999) {
                                    var331 += 32768;
                                }
                                class77.method566(var331, 57);
                                int var334 = class33.field502.method658(124);
                                for (int var335 = 0; var334 > var335; ++var335) {
                                    int var336 = class33.field502.method629((byte) -121);
                                    int var337 = class33.field502.method608(-29);
                                    if (var337 == 255) {
                                        var337 = class33.field502.method639(2);
                                    }
                                    if (var332 != null && var335 < var332.field1219.length) {
                                        var332.field1219[var335] = var336;
                                        var332.field1332[var335] = var337;
                                    }
                                    class64.method448(var337, (byte) 88, var335, var336 - 1, var331);
                                }
                                if (var332 != null) {
                                    class213.method1517((byte) 11, var332);
                                }
                                class260.method1763(0);
                                class217.field3956[class7.method50(class147.field2787++, 31)] = class7.method50(var331, 32767);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -37) {
                                class29.field465 = class125.field2415 / 8;
                                for (int var338 = 0; var338 < class29.field465; ++var338) {
                                    class116.field2207[var338] = class33.field502.method652(32767);
                                    class11.field171[var338] = class12.method76(class116.field2207[var338], (byte) 83);
                                }
                                class92.field1744 = -1;
                                class208.field3780 = class24.field384;
                                return true;
                            } else if (class92.field1744 == 161) {
                                class163 var339 = class33.field502.method605(true);
                                Object[] var340 = new Object[var339.method1221(-23096) - -1];
                                for (int var341 = var339.method1221(-23096) - 1; ~var341 <= -1; --var341) {
                                    if (~var339.method1213(0, var341) != -116) {
                                        var340[var341 + 1] = new Integer(class33.field502.method620((byte) -82));
                                    } else {
                                        var340[var341 - -1] = class33.field502.method605(true);
                                    }
                                }
                                var340[0] = new Integer(class33.field502.method620((byte) -82));
                                class225 var342 = new class225();
                                var342.field4079 = var340;
                                class192.method1406(var342, (byte) 10);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 == -21) {
                                int var343 = class33.field502.method609((byte) 118);
                                int var344 = class33.field502.method614((byte) -127);
                                int var345 = class33.field502.method611(true);
                                method1663(var344, (byte) -70);
                                class243.method1678(var343, var345, (byte) -123);
                                class92.field1744 = -1;
                                return true;
                            } else if (~class92.field1744 != -232) {
                                class107.method865(-87, (Throwable) null, "T1 - " + class92.field1744 + "," + class113.field2125 + "," + class38.field635 + " - " + class125.field2415);
                                class183.method1356(true);
                                return true;
                            } else {
                                int var346 = class33.field502.method620((byte) -82);
                                int var347 = class33.field502.method647(true);
                                class69 var348 = class124.method989((byte) 108, var346);
                                if (~var348.field1192 != ~var347 || ~var347 == 0) {
                                    var348.field1192 = var347;
                                    var348.field1288 = 0;
                                    var348.field1252 = 0;
                                    class213.method1517((byte) 11, var348);
                                }
                                class92.field1744 = -1;
                                return true;
                            }
                        }
                    } else {
                        class81.method642(7);
                        class92.field1744 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIIII)V")
    public static final void method1662(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4287;
        int var5 = 0;
        int var6 = 95 / ((arg0 - -16) / 35);
        int var7 = arg4;
        class227.method1585(-arg4 + arg1, (byte) -66, arg3, class85.field1605[arg2], arg1 - -arg4);
        int var8 = -1;
        int var9 = -arg4;
        while (~var7 < ~var5) {
            ++var5;
            var8 += 2;
            var9 += var8;
            if (~var9 <= -1) {
                --var7;
                int[] var10 = class85.field1605[arg2 - -var7];
                var9 -= var7 << 1;
                int[] var11 = class85.field1605[-var7 + arg2];
                int var12 = arg1 + var5;
                int var13 = -var5 + arg1;
                class227.method1585(var13, (byte) -66, arg3, var10, var12);
                class227.method1585(var13, (byte) -66, arg3, var11, var12);
            }
            int var14 = arg1 - -var7;
            int var15 = -var7 + arg1;
            int[] var16 = class85.field1605[arg2 - -var5];
            int[] var17 = class85.field1605[-var5 + arg2];
            class227.method1585(var15, (byte) -66, arg3, var16, var14);
            class227.method1585(var15, (byte) -66, arg3, var17, var14);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class240() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            method1662((byte) -48, 61, 61, -4, 91);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method615(-116);
                            this.field4280[0] = class7.method50(267386880, var5 << 4);
                            this.field4280[1] = class7.method50(var5, 65280) >> 4;
                            this.field4280[2] = class7.method50(var5 >> 12, 0);
                        }
                    } else {
                        this.field4286 = arg2.method658(104);
                    }
                } else {
                    this.field4276 = arg2.method658(arg0 ^ 84);
                }
            } else {
                this.field4277 = arg2.method658(-100);
            }
        } else {
            this.field4278 = arg2.method658(arg0 ^ -68);
        }
        ++field4290;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field4288;
        if (!arg1) {
            method1663(-110, (byte) -121);
        }
        int[][] var3 = super.field2228.method1304(arg0, (byte) -68);
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(arg0, 108, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class143.field2702 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field4280[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field4278 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field4280[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field4278 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4280[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4278 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4286 * var12 >> 12;
                            var9[var11] = this.field4276 * var14 >> 12;
                            var10[var11] = this.field4277 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
    private static final void method1663(int arg0, byte arg1) {
        class238.field4237.method1018((byte) 85, new class129(arg0));
        ++field4283;
        if (arg1 != -70) {
            field4285 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)V")
    public static void method1664(int arg0) {
        field4289 = null;
        field4285 = null;
        field4282 = null;
        int var1 = -62 % ((-16 - arg0) / 34);
    }
}
