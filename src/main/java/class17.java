import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field313 = 0;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field323 = 0;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field317 = -1;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lje;")
    private static class67 field309 = class85.method592(255, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lkc;")
    public static class72 field320 = null;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lje;")
    public static class67 field321 = class85.method592(255, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lje;")
    public static class67 field308 = field309;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lpa;")
    public class105 field304;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lpa;")
    public class105 field311;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[Lqb;")
    public static class113[] field302;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static final void method117(boolean arg0) {
        field303++;
        if (class42.field797 == 24) {
            int var1 = class9.field196.method649(false);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class77.field1681[var2];
            int var5 = class9.field196.method621(6538);
            int var6 = (var5 & 0x7) + class132.field2901;
            int var7 = (var5 >> 4 & 0x7) + class69.field1420;
            int var8 = class9.field196.method641(255);
            if (var7 >= 0 && var6 >= 0 && var7 < 104 && var6 < 104) {
                method123(var7, var6, var2, var3, -78, var8, class128.field2817, var4, 0, -1);
            }
        } else if (class42.field797 == 22) {
            int var9 = class9.field196.method630((byte) -49);
            int var10 = class9.field196.method630((byte) -49);
            int var11 = class9.field196.method649(false);
            int var12 = (var11 >> 4 & 0x7) + class69.field1420;
            int var13 = class132.field2901 + (var11 & 0x7);
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class39 var14 = new class39();
                var14.field698 = var9;
                var14.field694 = var10;
                if (class99.field2200[class128.field2817][var12][var13] == null) {
                    class99.field2200[class128.field2817][var12][var13] = new class4();
                }
                class99.field2200[class128.field2817][var12][var13].method19((byte) -85, var14);
                class101.method806(var12, var13, true);
            }
        } else if (class42.field797 == 129) {
            int var15 = class9.field196.method649(false);
            int var16 = (var15 >> 4 & 0x7) + class69.field1420;
            int var17 = (var15 & 0x7) + class132.field2901;
            int var18 = class9.field196.method641(255);
            int var19 = class9.field196.method641(255);
            int var20 = class9.field196.method641(255);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class4 var21 = class99.field2200[class128.field2817][var16][var17];
                if (var21 != null) {
                    for (class39 var22 = (class39) var21.method26((byte) 15); var22 != null; var22 = (class39) var21.method18((byte) -128)) {
                        if ((var18 & 0x7FFF) == var22.field698 && var22.field694 == var19) {
                            var22.field694 = var20;
                            break;
                        }
                    }
                    class101.method806(var16, var17, true);
                }
            }
        } else if (class42.field797 == 67) {
            int var23 = class9.field196.method659(false);
            int var24 = class9.field196.method649(false);
            int var25 = var24 >> 2;
            int var26 = var24 & 0x3;
            int var27 = class77.field1681[var25];
            int var28 = class9.field196.method649(false);
            int var29 = (var28 >> 4 & 0x7) + class69.field1420;
            int var30 = (var28 & 0x7) + class132.field2901;
            if (var29 >= 0 && var30 >= 0 && var29 < 103 && var30 < 103) {
                if (var27 == 0) {
                    class17 var31 = class134.field3044.method339(class128.field2817, var29, var30);
                    if (var31 != null) {
                        int var32 = var31.field313 >> 14 & 0x7FFF;
                        if (var25 == 2) {
                            var31.field304 = new class3(var32, 2, var26 + 4, class128.field2817, var29, var30, var23, false, var31.field304);
                            var31.field311 = new class3(var32, 2, var26 + 1 & 0x3, class128.field2817, var29, var30, var23, false, var31.field311);
                        } else {
                            var31.field304 = new class3(var32, var25, var26, class128.field2817, var29, var30, var23, false, var31.field304);
                        }
                    }
                }
                if (var27 == 1) {
                    class41 var33 = class134.field3044.method342(class128.field2817, var29, var30);
                    if (var33 != null) {
                        int var34 = var33.field782 >> 14 & 0x7FFF;
                        if (var25 == 4 || var25 == 5) {
                            var33.field767 = new class3(var34, 4, var26, class128.field2817, var29, var30, var23, false, var33.field767);
                        } else if (var25 == 6) {
                            var33.field767 = new class3(var34, 4, var26 + 4, class128.field2817, var29, var30, var23, false, var33.field767);
                        } else if (var25 == 7) {
                            var33.field767 = new class3(var34, 4, (var26 + 2 & 0x3) + 4, class128.field2817, var29, var30, var23, false, var33.field767);
                        } else if (var25 == 8) {
                            var33.field767 = new class3(var34, 4, var26 + 4, class128.field2817, var29, var30, var23, false, var33.field767);
                            var33.field774 = new class3(var34, 4, (var26 + 2 & 0x3) + 4, class128.field2817, var29, var30, var23, false, var33.field774);
                        }
                    }
                }
                if (var27 == 2) {
                    if (var25 == 11) {
                        var25 = 10;
                    }
                    class89 var35 = class134.field3044.method337(class128.field2817, var29, var30);
                    if (var35 != null) {
                        var35.field1958 = new class3(var35.field1966 >> 14 & 0x7FFF, var25, var26, class128.field2817, var29, var30, var23, false, var35.field1958);
                    }
                }
                if (var27 == 3) {
                    class12 var36 = class134.field3044.method346(class128.field2817, var29, var30);
                    if (var36 != null) {
                        var36.field223 = new class3(var36.field226 >> 14 & 0x7FFF, 22, var26, class128.field2817, var29, var30, var23, false, var36.field223);
                    }
                }
            }
        } else if (class42.field797 == 66) {
            int var37 = class9.field196.method649(false);
            int var38 = (var37 >> 4 & 0x7) + class69.field1420;
            int var39 = (var37 & 0x7) + class132.field2901;
            int var40 = var38 + class9.field196.method667((byte) -37);
            int var41 = var39 + class9.field196.method667((byte) -37);
            int var42 = class9.field196.method675((byte) 96);
            int var43 = class9.field196.method641(255);
            int var44 = class9.field196.method649(false) * 4;
            int var45 = class9.field196.method649(false) * 4;
            int var46 = class9.field196.method641(255);
            int var47 = class9.field196.method641(255);
            int var48 = class9.field196.method649(false);
            int var49 = class9.field196.method649(!arg0);
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var43 != 65535) {
                int var50 = var38 * 128 + 64;
                int var51 = var41 * 128 + 64;
                int var52 = var40 * 128 + 64;
                int var53 = var39 * 128 + 64;
                class55 var54 = new class55(var43, class128.field2817, var50, var53, class114.method924(var50, class128.field2817, var53, -104) - var44, var46 - -class34.field627, class34.field627 + var47, var48, var49, var42, var45);
                var54.method384(class114.method924(var52, class128.field2817, var51, -103) - var45, var51, var52, class34.field627 + var46, true);
                class144.field3299.method19((byte) 111, var54);
            }
        } else {
            if (class42.field797 == 68) {
                byte var55 = class9.field196.method627((byte) 123);
                int var56 = class9.field196.method659(false);
                byte var57 = class9.field196.method667((byte) -37);
                int var58 = class9.field196.method659(false);
                int var59 = class9.field196.method641(255);
                int var60 = class9.field196.method630((byte) -49);
                byte var61 = class9.field196.method627((byte) 127);
                byte var62 = class9.field196.method667((byte) -37);
                int var63 = class9.field196.method622((byte) 102);
                int var64 = var63 & 0x3;
                int var65 = var63 >> 2;
                int var66 = class77.field1681[var65];
                int var67 = class9.field196.method649(!arg0);
                class83 var68;
                if (class68.field1362 == var59) {
                    var68 = class37.field667;
                } else {
                    var68 = class85.field1885[var59];
                }
                int var69 = (var67 & 0x7) + class132.field2901;
                int var70 = (var67 >> 4 & 0x7) + class69.field1420;
                if (var68 != null) {
                    class47 var71 = class130.method993(var60, (byte) 112);
                    int var72;
                    int var73;
                    if (var64 == 1 || var64 == 3) {
                        var73 = var71.field931;
                        var72 = var71.field875;
                    } else {
                        var72 = var71.field931;
                        var73 = var71.field875;
                    }
                    int var74 = (var72 + 1 >> 1) + var69;
                    int var75 = (var72 >> 1) + var69;
                    int[][] var76 = class142.field3253[class128.field2817];
                    int var77 = (var70 << 7) + (var73 << 6);
                    int var78 = (var73 >> 1) + var70;
                    int var79 = (var69 << 7) + (var72 << 6);
                    int var80 = (var73 + 1 >> 1) + var70;
                    int var81 = var76[var78][var75] + var76[var80][var75] + var76[var80][var74] + var76[var78][var74] >> 2;
                    class5 var82 = var71.method302(var81, var79, var77, var65, var76, var64, -1);
                    if (var82 != null) {
                        method123(var70, var69, 0, 0, -101, -1, class128.field2817, var66, var58 + 1, var56 + 1);
                        var68.field1837 = class34.field627 + var56;
                        var68.field1844 = var81;
                        var68.field1825 = class34.field627 + var58;
                        if (var62 < var57) {
                            byte var83 = var57;
                            var57 = var62;
                            var62 = var83;
                        }
                        var68.field1846 = var70 * 128 + var73 * 64;
                        var68.field1847 = var57 + var70;
                        if (var55 > var61) {
                            byte var84 = var55;
                            var55 = var61;
                            var61 = var84;
                        }
                        var68.field1829 = var55 + var69;
                        var68.field1832 = var69 * 128 + var72 * 64;
                        var68.field1848 = var61 + var69;
                        var68.field1850 = var62 + var70;
                        var68.field1826 = var82;
                    }
                }
            }
            if (class42.field797 == 149) {
                int var85 = class9.field196.method649(false);
                int var86 = (var85 & 0x7) + class132.field2901;
                int var87 = (var85 >> 4 & 0x7) + class69.field1420;
                int var88 = class9.field196.method641(255);
                int var89 = class9.field196.method649(false);
                int var90 = var89 >> 4 & 0xF;
                int var91 = var89 & 0x7;
                int var92 = class9.field196.method649(false);
                if (var87 >= 0 && var86 >= 0 && var87 < 104 && var86 < 104) {
                    int var93 = var90 + 1;
                    if (class37.field667.field2942[0] >= var87 - var93 && class37.field667.field2942[0] <= var87 + var93 && var86 - var93 <= class37.field667.field2993[0] && var86 + var93 >= class37.field667.field2993[0] && class129.field2842 != 0 && var91 > 0 && class86.field1903 < 50) {
                        class59.field1174[class86.field1903] = var88;
                        class127.field2783[class86.field1903] = var91;
                        class129.field2845[class86.field1903] = var92;
                        class80.field1767[class86.field1903] = null;
                        class145.field3352[class86.field1903] = (var86 << 8) + (var87 << 16) + var90;
                        class86.field1903++;
                    }
                }
            }
            if (!arg0) {
                field309 = null;
            }
            if (class42.field797 == 75) {
                int var94 = class9.field196.method623(-125);
                int var95 = class132.field2901 + (var94 & 0x7);
                int var96 = (var94 >> 4 & 0x7) + class69.field1420;
                int var97 = class9.field196.method648(22591);
                if (var96 >= 0 && var95 >= 0 && var96 < 104 && var95 < 104) {
                    class4 var98 = class99.field2200[class128.field2817][var96][var95];
                    if (var98 != null) {
                        for (class39 var99 = (class39) var98.method26((byte) 99); var99 != null; var99 = (class39) var98.method18((byte) -128)) {
                            if ((var97 & 0x7FFF) == var99.field698) {
                                var99.method115(26851);
                                break;
                            }
                        }
                        if (var98.method26((byte) 109) == null) {
                            class99.field2200[class128.field2817][var96][var95] = null;
                        }
                        class101.method806(var96, var95, arg0);
                    }
                }
            } else if (class42.field797 == 10) {
                int var100 = class9.field196.method659(false);
                int var101 = class9.field196.method621(6538);
                int var102 = (var101 >> 4 & 0x7) + class69.field1420;
                int var103 = (var101 & 0x7) + class132.field2901;
                int var104 = class9.field196.method659(false);
                int var105 = class9.field196.method641(255);
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104 && class68.field1362 != var100) {
                    class39 var106 = new class39();
                    var106.field698 = var104;
                    var106.field694 = var105;
                    if (class99.field2200[class128.field2817][var102][var103] == null) {
                        class99.field2200[class128.field2817][var102][var103] = new class4();
                    }
                    class99.field2200[class128.field2817][var102][var103].method19((byte) -108, var106);
                    class101.method806(var102, var103, true);
                }
            } else if (class42.field797 == 107) {
                int var107 = class9.field196.method649(false);
                int var108 = (var107 >> 4 & 0x7) + class69.field1420;
                int var109 = (var107 & 0x7) + class132.field2901;
                int var110 = class9.field196.method641(255);
                int var111 = class9.field196.method649(!arg0);
                int var112 = class9.field196.method641(255);
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    int var113 = var109 * 128 + 64;
                    int var114 = var108 * 128 + 64;
                    class63 var115 = new class63(var110, class128.field2817, var114, var113, class114.method924(var114, class128.field2817, var113, -108) - var111, var112, class34.field627);
                    class97.field2167.method19((byte) -98, var115);
                }
            } else if (class42.field797 == 140) {
                int var116 = class9.field196.method649(false);
                int var117 = (var116 >> 4 & 0x7) + class69.field1420;
                int var118 = (var116 & 0x7) + class132.field2901;
                int var119 = class9.field196.method622((byte) 102);
                int var120 = var119 & 0x3;
                int var121 = var119 >> 2;
                int var122 = class77.field1681[var121];
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                    method123(var117, var118, var121, var120, -104, -1, class128.field2817, var122, 0, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method118(byte arg0) {
        field310++;
        for (class75 var1 = (class75) class60.field1209.method26((byte) 92); var1 != null; var1 = (class75) class60.field1209.method18((byte) -128)) {
            if (var1.field1619 != null) {
                class95.field2132.method553(var1.field1619);
                var1.field1619 = null;
            }
            if (var1.field1603 != null) {
                class95.field2132.method553(var1.field1603);
                var1.field1603 = null;
            }
        }
        class60.field1209.method25(arg0 ^ 0xFFFFFFC6);
        if (arg0 != -126) {
            method123(33, 122, -61, -69, 118, 30, 112, 70, -123, -63);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
    public static final void method119(byte arg0, int arg1) {
        field319++;
        if (arg0 < 20) {
            method121(-117);
        }
        class6.field139 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method120(int arg0) {
        field316++;
        try {
            if (class32.field574 == 0) {
                if (class104.field2367 != null) {
                    class104.field2367.method847(-112);
                    class104.field2367 = null;
                }
                class143.field3289 = false;
                class32.field574 = 1;
                class50.field957 = 0;
                class77.field1651 = null;
            }
            if (class32.field574 == 1) {
                if (class77.field1651 == null) {
                    class77.field1651 = class154.field3519.method873((byte) -63, class55.field1091, class58.field1146);
                }
                if (class77.field1651.field806 == 2) {
                    throw new IOException();
                }
                if (class77.field1651.field806 == 1) {
                    class104.field2367 = new class107((Socket) class77.field1651.field808, class154.field3519);
                    class77.field1651 = null;
                    class32.field574 = 2;
                }
            }
            if (arg0 > -15) {
                method117(false);
            }
            if (class32.field574 == 2) {
                long var1 = class40.field738 = class106.field2413.method476((byte) 77);
                class69.field1399.field2043 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class69.field1399.method653(14, 57);
                class69.field1399.method653(var3, 88);
                class104.field2367.method842(class69.field1399.field1991, 2, -115, 0);
                class32.field574 = 3;
                class9.field196.field2043 = 0;
            }
            if (class32.field574 == 3) {
                if (class39.field701 != null) {
                    class39.field701.method1000(-94);
                }
                if (class35.field638 != null) {
                    class35.field638.method1000(-128);
                }
                int var4 = class104.field2367.method845((byte) 121);
                if (class39.field701 != null) {
                    class39.field701.method1000(-122);
                }
                if (class35.field638 != null) {
                    class35.field638.method1000(-53);
                }
                if (var4 != 0) {
                    class39.method242(4689, var4);
                    return;
                }
                class32.field574 = 4;
                class9.field196.field2043 = 0;
            }
            if (class32.field574 == 4) {
                if (class9.field196.field2043 < 8) {
                    int var5 = class104.field2367.method848((byte) -125);
                    if (var5 > 8 - class9.field196.field2043) {
                        var5 = 8 - class9.field196.field2043;
                    }
                    if (var5 > 0) {
                        class104.field2367.method843(class9.field196.field1991, var5, class9.field196.field2043, false);
                        class9.field196.field2043 += var5;
                    }
                }
                if (class9.field196.field2043 == 8) {
                    class9.field196.field2043 = 0;
                    class123.field2747 = class9.field196.method635((byte) 115);
                    class32.field574 = 5;
                }
            }
            if (class32.field574 == 5) {
                class69.field1399.field2043 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class123.field2747 >> 32), (int) class123.field2747 };
                class69.field1399.method653(10, 122);
                class69.field1399.method629((byte) -60, var6[0]);
                class69.field1399.method629((byte) 125, var6[1]);
                class69.field1399.method629((byte) -68, var6[2]);
                class69.field1399.method629((byte) 81, var6[3]);
                class69.field1399.method656(-2, class106.field2413.method476((byte) 77));
                class69.field1399.method673(class106.field2416, -1393);
                class69.field1399.method661(class129.field2834, 122, class18.field339);
                class93.field2104.field2043 = 0;
                if (class128.field2823 == 40) {
                    class93.field2104.method653(18, 121);
                } else {
                    class93.field2104.method653(16, 60);
                }
                class93.field2104.method653(class69.field1399.field2043 + 93, 110);
                class93.field2104.method629((byte) -121, 467);
                class93.field2104.method653(class41.field773 ? 1 : 0, 72);
                class104.method828(class93.field2104, -25);
                class93.field2104.method629((byte) -41, class132.field2903.field744);
                class93.field2104.method629((byte) 84, class158.field3621.field744);
                class93.field2104.method629((byte) 69, class47.field896.field744);
                class93.field2104.method629((byte) -73, class147.field3364.field744);
                class93.field2104.method629((byte) -52, class39.field709.field744);
                class93.field2104.method629((byte) 57, class98.field2183.field744);
                class93.field2104.method629((byte) 54, class76.field1640.field744);
                class93.field2104.method629((byte) -33, class93.field2107.field744);
                class93.field2104.method629((byte) 108, class14.field255.field744);
                class93.field2104.method629((byte) 121, class83.field1842.field744);
                class93.field2104.method629((byte) -40, class112.field2531.field744);
                class93.field2104.method629((byte) 75, class128.field2818.field744);
                class93.field2104.method629((byte) 94, class81.field1795.field744);
                class93.field2104.method629((byte) -63, class82.field1798.field744);
                class93.field2104.method629((byte) 67, class154.field3504.field744);
                class93.field2104.method629((byte) -74, class75.field1615.field744);
                class93.field2104.method628(class69.field1399.field2043, 22286, 0, class69.field1399.field1991);
                class104.field2367.method842(class93.field2104.field1991, class93.field2104.field2043, -85, 0);
                class69.field1399.method288(var6, (byte) -107);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class9.field196.method288(var6, (byte) -71);
                class32.field574 = 6;
            }
            if (class32.field574 == 6 && class104.field2367.method848((byte) -125) > 0) {
                int var8 = class104.field2367.method845((byte) 121);
                if (var8 == 21 && class128.field2823 == 20) {
                    class32.field574 = 7;
                } else if (var8 == 2) {
                    class32.field574 = 9;
                } else if (var8 == 15 && class128.field2823 == 40) {
                    class103.method811(-125);
                    return;
                } else if (var8 == 23 && class45.field841 < 1) {
                    class32.field574 = 0;
                    class45.field841++;
                } else {
                    class39.method242(4689, var8);
                    return;
                }
            }
            if (class32.field574 == 7 && class104.field2367.method848((byte) -125) > 0) {
                class143.field3288 = class104.field2367.method845((byte) 121) * 60 + 180;
                class32.field574 = 8;
            }
            if (class32.field574 == 8) {
                class50.field957 = 0;
                class68.method501(class77.field1677, class49.method314(new class67[] { class60.method420(class143.field3288 / 60, 28498), class140.field3151 }, 0), class16.field295, (byte) -66);
                if (--class143.field3288 <= 0) {
                    class32.field574 = 0;
                }
            } else {
                if (class32.field574 == 9 && class104.field2367.method848((byte) -125) >= 8) {
                    class135.field3049 = class104.field2367.method845((byte) 121);
                    class128.field2801 = class104.field2367.method845((byte) 121) == 1;
                    class68.field1362 = class104.field2367.method845((byte) 121);
                    class68.field1362 <<= 0x8;
                    class68.field1362 += class104.field2367.method845((byte) 121);
                    class99.field2204 = class104.field2367.method845((byte) 121);
                    class104.field2367.method843(class9.field196.field1991, 1, 0, false);
                    class9.field196.field2043 = 0;
                    class42.field797 = class9.field196.method282(127);
                    class104.field2367.method843(class9.field196.field1991, 2, 0, false);
                    class9.field196.field2043 = 0;
                    class155.field3544 = class9.field196.method641(255);
                    class32.field574 = 10;
                }
                if (class32.field574 != 10) {
                    class50.field957++;
                    if (class50.field957 > 2000) {
                        if (class45.field841 < 1) {
                            if (class9.field205 == class58.field1146) {
                                class58.field1146 = class105.field2400;
                            } else {
                                class58.field1146 = class9.field205;
                            }
                            class32.field574 = 0;
                            class45.field841++;
                        } else {
                            class39.method242(4689, -3);
                        }
                    }
                } else if (class104.field2367.method848((byte) -125) >= class155.field3544) {
                    class9.field196.field2043 = 0;
                    class104.field2367.method843(class9.field196.field1991, class155.field3544, 0, false);
                    class40.method266(0);
                    class159.field3654 = -1;
                    class106.method837(false, (byte) 89);
                    class42.field797 = -1;
                }
            }
        } catch (IOException var9) {
            if (class45.field841 < 1) {
                if (class9.field205 == class58.field1146) {
                    class58.field1146 = class105.field2400;
                } else {
                    class58.field1146 = class9.field205;
                }
                class45.field841++;
                class32.field574 = 0;
            } else {
                class39.method242(4689, -2);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method121(int arg0) {
        if (arg0 != 8) {
            method117(false);
        }
        class15.field261.method767(1);
        field314++;
        class41.field771.method767(1);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method122(byte arg0) {
        field309 = null;
        field302 = null;
        field320 = null;
        field321 = null;
        field308 = null;
        if (arg0 != -50) {
            method119((byte) 115, -18);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V")
    private static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class138 var10 = null;
        for (class138 var11 = (class138) class25.field447.method26((byte) -90); var11 != null; var11 = (class138) class25.field447.method18((byte) -128)) {
            if (var11.field3119 == arg6 && var11.field3111 == arg0 && var11.field3126 == arg1 && var11.field3127 == arg7) {
                var10 = var11;
                break;
            }
        }
        field322++;
        if (var10 == null) {
            var10 = new class138();
            var10.field3111 = arg0;
            var10.field3126 = arg1;
            var10.field3127 = arg7;
            var10.field3119 = arg6;
            class85.method597(var10, (byte) 19);
            class25.field447.method19((byte) 112, var10);
        }
        var10.field3106 = arg8;
        var10.field3118 = arg5;
        var10.field3125 = arg9;
        var10.field3120 = arg3;
        if (arg4 > -15) {
            method123(41, 74, 90, 61, -20, -17, 87, 13, -38, 78);
        }
        var10.field3107 = arg2;
    }
}
