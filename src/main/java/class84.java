import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
    public boolean field1938 = true;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Loa;")
    public static class98 field1947 = class38.method349(255, "Art");

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Loa;")
    public static class98 field1941 = class38.method349(255, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Loa;")
    private static class98 field1951 = class38.method349(255, "Login server offline)3");

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Loa;")
    public static class98 field1944 = field1951;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lja;")
    public static class63 field1943 = new class63();

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Z")
    public static boolean field1955 = false;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Loa;")
    public static class98 field1958 = class38.method349(255, "@gr2@");

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Loa;")
    public static class98 field1959 = class38.method349(255, "headicons_hint");

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Loa;")
    private static class98 field1961 = class38.method349(255, "Loading config )2 ");

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Loa;")
    public static class98 field1964 = class38.method349(255, "(U5");

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Loa;")
    private static class98 field1962 = class38.method349(255, "M");

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Loa;")
    public static class98 field1966 = class38.method349(255, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Loa;")
    public static class98 field1957 = field1962;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Loa;")
    public static class98 field1960 = class38.method349(255, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Loa;")
    public static class98 field1963 = field1961;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Lle;")
    public static class81 field1965;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "[Lid;")
    public static class60[] field1956;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method699(Component arg0, boolean arg1) {
        arg0.addMouseListener(class53.field1166);
        arg0.addMouseMotionListener(class53.field1166);
        arg0.addFocusListener(class53.field1166);
        field1946++;
        if (arg1) {
            field1959 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method700(int arg0) {
        field1950++;
        if (arg0 != -1) {
            field1955 = true;
        }
        if (class42.field976 != 1) {
            return;
        }
        if (class150.field3717 >= 539 && class150.field3717 <= 573 && class86.field1980 >= 169 && class86.field1980 < 205 && class52.field1163[0] != -1) {
            class31.field709 = 0;
            class137.field3332 = true;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 569 && class150.field3717 <= 599 && class86.field1980 >= 168 && class86.field1980 < 205 && class52.field1163[1] != -1) {
            class137.field3332 = true;
            class31.field709 = 1;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 597 && class150.field3717 <= 627 && class86.field1980 >= 168 && class86.field1980 < 205 && class52.field1163[2] != -1) {
            class137.field3332 = true;
            class31.field709 = 2;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 625 && class150.field3717 <= 669 && class86.field1980 >= 168 && class86.field1980 < 203 && class52.field1163[3] != -1) {
            class137.field3332 = true;
            class147.field3584 = true;
            class31.field709 = 3;
        }
        if (class150.field3717 >= 666 && class150.field3717 <= 696 && class86.field1980 >= 168 && class86.field1980 < 205 && class52.field1163[4] != -1) {
            class137.field3332 = true;
            class31.field709 = 4;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 694 && class150.field3717 <= 724 && class86.field1980 >= 168 && class86.field1980 < 205 && class52.field1163[5] != -1) {
            class31.field709 = 5;
            class137.field3332 = true;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 722 && class150.field3717 <= 756 && class86.field1980 >= 169 && class86.field1980 < 205 && class52.field1163[6] != -1) {
            class31.field709 = 6;
            class137.field3332 = true;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 540 && class150.field3717 <= 574 && class86.field1980 >= 466 && class86.field1980 < 502 && class52.field1163[7] != -1) {
            class31.field709 = 7;
            class147.field3584 = true;
            class137.field3332 = true;
        }
        if (class150.field3717 >= 572 && class150.field3717 <= 602 && class86.field1980 >= 466 && class86.field1980 < 503 && class52.field1163[8] != -1) {
            class137.field3332 = true;
            class31.field709 = 8;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 599 && class150.field3717 <= 629 && class86.field1980 >= 466 && class86.field1980 < 503 && class52.field1163[9] != -1) {
            class147.field3584 = true;
            class31.field709 = 9;
            class137.field3332 = true;
        }
        if (class150.field3717 >= 627 && class150.field3717 <= 671 && class86.field1980 >= 467 && class86.field1980 < 502 && class52.field1163[10] != -1) {
            class137.field3332 = true;
            class147.field3584 = true;
            class31.field709 = 10;
        }
        if (class150.field3717 >= 669 && class150.field3717 <= 699 && class86.field1980 >= 466 && class86.field1980 < 503 && class52.field1163[11] != -1) {
            class147.field3584 = true;
            class31.field709 = 11;
            class137.field3332 = true;
        }
        if (class150.field3717 >= 696 && class150.field3717 <= 726 && class86.field1980 >= 466 && class86.field1980 < 503 && class52.field1163[12] != -1) {
            class31.field709 = 12;
            class137.field3332 = true;
            class147.field3584 = true;
        }
        if (class150.field3717 >= 724 && class150.field3717 <= 758 && class86.field1980 >= 466 && class86.field1980 < 502 && class52.field1163[13] != -1) {
            class147.field3584 = true;
            class31.field709 = 13;
            class137.field3332 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method701(byte arg0) {
        field1944 = null;
        field1941 = null;
        field1951 = null;
        field1957 = null;
        field1963 = null;
        field1959 = null;
        field1958 = null;
        field1965 = null;
        field1960 = null;
        field1964 = null;
        field1962 = null;
        field1961 = null;
        field1956 = null;
        field1966 = null;
        if (arg0 <= 5) {
            field1959 = null;
        }
        field1947 = null;
        field1943 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static final void method702(byte arg0) {
        if (class51.field1120 == 170) {
            byte var1 = class36.field890.method55((byte) -63);
            int var2 = class36.field890.method62((byte) 80);
            int var3 = var2 & 0x3;
            int var4 = var2 >> 2;
            int var5 = class83.field1930[var4];
            int var6 = class36.field890.method76(arg0 ^ 0xFFFFEA2F);
            int var7 = class36.field890.method91(arg0 ^ 0xF9);
            int var8 = class36.field890.method98(107);
            int var9 = (var8 & 0x7) + class64.field1361;
            int var10 = (var8 >> 4 & 0x7) + class44.field1013;
            byte var11 = class36.field890.method78((byte) -68);
            int var12 = class36.field890.method104(-1);
            byte var13 = class36.field890.method60((byte) -86);
            byte var14 = class36.field890.method78((byte) -68);
            int var15 = class36.field890.method68(-2);
            class55 var16;
            if (class8.field191 == var12) {
                var16 = class73.field1536;
            } else {
                var16 = class33.field832[var12];
            }
            if (var16 != null) {
                class129 var17 = class145.method1167(var7, 65280);
                int var18 = class25.field616[class114.field2572][var10][var9];
                int var19 = class25.field616[class114.field2572][var10 + 1][var9];
                int var20 = class25.field616[class114.field2572][var10 + 1][var9 + 1];
                int var21 = class25.field616[class114.field2572][var10][var9 + 1];
                class128 var22 = var17.method1028(var3, var4, var18, var21, var20, (byte) -121, var19);
                if (var22 != null) {
                    class126.method995(var10, var15 + 1, var9, -1, var5, 0, var6 + 1, 46, class114.field2572, 0);
                    var16.field1216 = var22;
                    var16.field1232 = class119.field2680 + var15;
                    var16.field1221 = class119.field2680 + var6;
                    int var23 = var17.field2991;
                    int var24 = var17.field2993;
                    if (var11 < var13) {
                        byte var25 = var13;
                        var13 = var11;
                        var11 = var25;
                    }
                    if (var3 == 1 || var3 == 3) {
                        var23 = var17.field2993;
                        var24 = var17.field2991;
                    }
                    var16.field1210 = var9 * 128 + var23 * 64;
                    if (var1 < var14) {
                        byte var26 = var14;
                        var14 = var1;
                        var1 = var26;
                    }
                    var16.field1228 = var10 * 128 + var24 * 64;
                    var16.field1233 = class31.method305(-107, var16.field1210, class114.field2572, var16.field1228);
                    var16.field1206 = var9 + var14;
                    var16.field1224 = var1 + var9;
                    var16.field1225 = var10 + var13;
                    var16.field1237 = var10 + var11;
                }
            }
        }
        field1939++;
        if (class51.field1120 == 87) {
            int var27 = class36.field890.method62((byte) 109);
            int var28 = (var27 >> 4 & 0x7) + class44.field1013;
            int var29 = class64.field1361 + (var27 & 0x7);
            int var30 = class36.field890.method91(128);
            int var31 = class36.field890.method104(-1);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class25 var32 = new class25();
                var32.field618 = var31;
                var32.field600 = var30;
                if (class10.field207[class114.field2572][var28][var29] == null) {
                    class10.field207[class114.field2572][var28][var29] = new class63();
                }
                class10.field207[class114.field2572][var28][var29].method508(arg0 ^ 0x5B, var32);
                class6.method27(arg0 - 39, var28, var29);
            }
            return;
        }
        if (class51.field1120 == 137) {
            int var33 = class36.field890.method62((byte) 89);
            int var34 = (var33 >> 4 & 0x7) + class44.field1013;
            int var35 = class64.field1361 + (var33 & 0x7);
            int var36 = class36.field890.method68(arg0 ^ 0xFFFFFF87);
            int var37 = class36.field890.method62((byte) 92);
            int var38 = var37 & 0x7;
            int var39 = var37 >> 4 & 0xF;
            int var40 = class36.field890.method62((byte) 97);
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                int var41 = var39 + 1;
                if (var34 - var41 <= class73.field1536.field3603[0] && class73.field1536.field3603[0] <= var34 + var41 && class73.field1536.field3648[0] >= var35 - var41 && var35 + var41 >= class73.field1536.field3648[0] && class149.field3671 != 0 && var38 > 0 && class127.field2830 < 50) {
                    class64.field1370[class127.field2830] = var36;
                    class46.field1046[class127.field2830] = var38;
                    class15.field318[class127.field2830] = var40;
                    class26.field634[class127.field2830] = null;
                    class134.field3267[class127.field2830] = (var34 << 16) + (var35 << 8) + var39;
                    class127.field2830++;
                }
            }
        }
        if (arg0 != 121) {
            field1964 = null;
        }
        if (class51.field1120 == 138) {
            int var42 = class36.field890.method86(-78);
            int var43 = class44.field1013 + (var42 >> 4 & 0x7);
            int var44 = (var42 & 0x7) + class64.field1361;
            int var45 = class36.field890.method91(128);
            int var46 = class36.field890.method104(-1);
            int var47 = class36.field890.method104(-1);
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && class8.field191 != var45) {
                class25 var48 = new class25();
                var48.field600 = var46;
                var48.field618 = var47;
                if (class10.field207[class114.field2572][var43][var44] == null) {
                    class10.field207[class114.field2572][var43][var44] = new class63();
                }
                class10.field207[class114.field2572][var43][var44].method508(124, var48);
                class6.method27(-96, var43, var44);
            }
        } else if (class51.field1120 == 31) {
            int var49 = class36.field890.method62((byte) 105);
            int var50 = class44.field1013 + (var49 >> 4 & 0x7);
            int var51 = (var49 & 0x7) + class64.field1361;
            int var52 = class36.field890.method68(-2);
            int var53 = class36.field890.method68(-2);
            int var54 = class36.field890.method68(-2);
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class63 var55 = class10.field207[class114.field2572][var50][var51];
                if (var55 != null) {
                    for (class25 var56 = (class25) var55.method512(-87); var56 != null; var56 = (class25) var55.method513(-74)) {
                        if ((var52 & 0x7FFF) == var56.field600 && var56.field618 == var53) {
                            var56.field618 = var54;
                            break;
                        }
                    }
                    class6.method27(-1, var50, var51);
                }
            }
        } else if (class51.field1120 == 167) {
            int var57 = class36.field890.method62((byte) 114);
            int var58 = (var57 >> 4 & 0x7) + class44.field1013;
            int var59 = class64.field1361 + (var57 & 0x7);
            int var60 = class36.field890.method68(-2);
            int var61 = class36.field890.method62((byte) 113);
            int var62 = class36.field890.method68(arg0 - 123);
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                int var63 = var58 * 128 + 64;
                int var64 = var59 * 128 + 64;
                class147 var65 = new class147(var60, class114.field2572, var63, var64, class31.method305(-113, var64, class114.field2572, var63) - var61, var62, class119.field2680);
                class99.field2312.method508(arg0 - 26, var65);
            }
        } else if (class51.field1120 == 115) {
            int var66 = class36.field890.method86(-115);
            int var67 = (var66 >> 4 & 0x7) + class44.field1013;
            int var68 = (var66 & 0x7) + class64.field1361;
            int var69 = class36.field890.method91(128);
            int var70 = class36.field890.method62((byte) 114);
            int var71 = var70 >> 2;
            int var72 = var70 & 0x3;
            int var73 = class83.field1930[var71];
            if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                class126.method995(var67, 0, var68, var69, var73, var71, -1, arg0 ^ 0x54, class114.field2572, var72);
            }
        } else if (class51.field1120 == 175) {
            int var74 = class36.field890.method62((byte) 124);
            int var75 = (var74 >> 4 & 0x7) + class44.field1013;
            int var76 = (var74 & 0x7) + class64.field1361;
            int var77 = class36.field890.method57(94) + var75;
            int var78 = class36.field890.method57(100) + var76;
            int var79 = class36.field890.method107(true);
            int var80 = class36.field890.method68(arg0 - 123);
            int var81 = class36.field890.method62((byte) 90) * 4;
            int var82 = class36.field890.method62((byte) 117) * 4;
            int var83 = class36.field890.method68(arg0 - 123);
            int var84 = class36.field890.method68(-2);
            int var85 = class36.field890.method62((byte) 117);
            int var86 = class36.field890.method62((byte) 111);
            if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var80 != 65535) {
                int var87 = var75 * 128 + 64;
                int var88 = var77 * 128 + 64;
                int var89 = var78 * 128 + 64;
                int var90 = var76 * 128 + 64;
                class31 var91 = new class31(var80, class114.field2572, var87, var90, class31.method305(-82, var90, class114.field2572, var87) - var81, var83 - -class119.field2680, class119.field2680 + var84, var85, var86, var79, var82);
                var91.method301(var88, var89, class119.field2680 + var83, -var82 + class31.method305(-123, var89, class114.field2572, var88), arg0 - 120);
                class24.field583.method508(35, var91);
            }
        } else if (class51.field1120 == 83) {
            int var92 = class36.field890.method62((byte) 121);
            int var93 = (var92 >> 4 & 0x7) + class44.field1013;
            int var94 = (var92 & 0x7) + class64.field1361;
            int var95 = class36.field890.method76(-5546);
            int var96 = class36.field890.method86(-94);
            int var97 = var96 >> 2;
            int var98 = var96 & 0x3;
            int var99 = class83.field1930[var97];
            if (var93 >= 0 && var94 >= 0 && var93 < 103 && var94 < 103) {
                int var100 = class25.field616[class114.field2572][var93 + 1][var94 + 1];
                int var101 = class25.field616[class114.field2572][var93][var94];
                int var102 = class25.field616[class114.field2572][var93][var94 + 1];
                int var103 = class25.field616[class114.field2572][var93 + 1][var94];
                if (var99 == 0) {
                    class127 var104 = class138.field3373.method223(class114.field2572, var93, var94);
                    if (var104 != null) {
                        int var105 = var104.field2863 >> 14 & 0x7FFF;
                        if (var97 == 2) {
                            var104.field2859 = new class88(var105, 2, var98 + 4, var101, var103, var100, var102, var95, false, var104.field2859);
                            var104.field2832 = new class88(var105, 2, var98 + 1 & 0x3, var101, var103, var100, var102, var95, false, var104.field2832);
                        } else {
                            var104.field2859 = new class88(var105, var97, var98, var101, var103, var100, var102, var95, false, var104.field2859);
                        }
                    }
                }
                if (var99 == 1) {
                    class20 var106 = class138.field3373.method263(class114.field2572, var93, var94);
                    if (var106 != null) {
                        var106.field429 = new class88(var106.field436 >> 14 & 0x7FFF, 4, 0, var101, var103, var100, var102, var95, false, var106.field429);
                    }
                }
                if (var99 == 2) {
                    if (var97 == 11) {
                        var97 = 10;
                    }
                    class46 var107 = class138.field3373.method216(class114.field2572, var93, var94);
                    if (var107 != null) {
                        var107.field1074 = new class88(var107.field1067 >> 14 & 0x7FFF, var97, var98, var101, var103, var100, var102, var95, false, var107.field1074);
                    }
                }
                if (var99 == 3) {
                    class105 var108 = class138.field3373.method257(class114.field2572, var93, var94);
                    if (var108 != null) {
                        var108.field2397 = new class88(var108.field2391 >> 14 & 0x7FFF, 22, var98, var101, var103, var100, var102, var95, false, var108.field2397);
                    }
                }
            }
        } else if (class51.field1120 == 178) {
            int var109 = class36.field890.method75(true);
            int var110 = (var109 >> 4 & 0x7) + class44.field1013;
            int var111 = (var109 & 0x7) + class64.field1361;
            int var112 = class36.field890.method62((byte) 76);
            int var113 = var112 >> 2;
            int var114 = class83.field1930[var113];
            int var115 = var112 & 0x3;
            if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                class126.method995(var110, 0, var111, -1, var114, var113, -1, 113, class114.field2572, var115);
            }
        } else if (class51.field1120 == 13) {
            int var116 = class36.field890.method104(-1);
            int var117 = class36.field890.method75(true);
            int var118 = (var117 & 0x7) + class64.field1361;
            int var119 = (var117 >> 4 & 0x7) + class44.field1013;
            if (var119 >= 0 && var118 >= 0 && var119 < 104 && var118 < 104) {
                class63 var120 = class10.field207[class114.field2572][var119][var118];
                if (var120 != null) {
                    for (class25 var121 = (class25) var120.method512(arg0 - 5); var121 != null; var121 = (class25) var120.method513(-69)) {
                        if ((var116 & 0x7FFF) == var121.field600) {
                            var121.method975(-37);
                            break;
                        }
                    }
                    if (var120.method512(arg0 ^ 0xFFFFFFD7) == null) {
                        class10.field207[class114.field2572][var119][var118] = null;
                    }
                    class6.method27(arg0 - 98, var119, var118);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method703(int arg0, int arg1) {
        class139 var2 = (class139) class67.field1422.method17(-16, (long) arg0);
        field1945++;
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field3389.length; var3++) {
                var2.field3389[var3] = -1;
                var2.field3395[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        if (arg0 < 61) {
            field1958 = null;
        }
        class4.field55.method734(-224779128);
        field1948++;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1940 = arg2;
        this.field1938 = arg6;
        this.field1953 = arg4;
        this.field1949 = arg1;
        this.field1954 = arg5;
        this.field1942 = arg3;
        this.field1937 = arg0;
    }
}
