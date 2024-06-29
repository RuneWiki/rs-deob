import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class75 {

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lmb;")
    private static class96 field1300 = class243.method1708("wishes to trade with you)3", (byte) 115);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lmb;")
    public static class96 field1296 = field1300;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lmb;")
    public static class96 field1302 = null;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[[[B")
    public static byte[][][] field1298;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILrg;)Lpa;")
    public static final class135 method544(int arg0, class239 arg1) {
        if (arg0 != -1) {
            field1300 = null;
        }
        field1299++;
        return new class135(arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1660(arg0 - 335289647), arg1.method1651(4139));
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method545(int arg0) {
        field1298 = null;
        if (arg0 >= -66) {
            field1298 = null;
        }
        field1296 = null;
        field1302 = null;
        field1300 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
    public static final boolean method546(int arg0) throws IOException {
        field1297++;
        if (class211.field3638 == null) {
            return false;
        }
        int var1 = class211.field3638.method1598(0);
        if (var1 == 0) {
            return false;
        }
        if (class6.field126 == -1) {
            class211.field3638.method1603(2000, class1.field4.field4144, 0, 1);
            class1.field4.field4124 = 0;
            class6.field126 = class1.field4.method1019((byte) 81);
            var1--;
            class47.field820 = class181.field3157[class6.field126];
        }
        if (class47.field820 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class211.field3638.method1603(arg0 ^ 0xFFFFF8FF, class1.field4.field4144, 0, 1);
            class47.field820 = class1.field4.field4144[0] & 0xFF;
        }
        if (class47.field820 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class211.field3638.method1603(arg0 + 2209, class1.field4.field4144, 0, 2);
            class1.field4.field4124 = 0;
            class47.field820 = class1.field4.method1663((byte) -90);
        }
        if (class47.field820 > var1) {
            return false;
        }
        class1.field4.field4124 = 0;
        class211.field3638.method1603(2000, class1.field4.field4144, 0, class47.field820);
        class252.field4365 = class46.field794;
        class87.field1463 = 0;
        class46.field794 = class24.field415;
        class24.field415 = class6.field126;
        if (class6.field126 == 164) {
            int var2 = class1.field4.method1617((byte) -43);
            int var3 = class1.field4.method1663((byte) 108);
            if (var2 < -70000) {
                var3 += 32768;
            }
            class107 var4;
            if (var2 < 0) {
                var4 = null;
            } else {
                var4 = class55.method408(var2, arg0 + 251235073);
            }
            while (class47.field820 > class1.field4.field4124) {
                int var5 = class1.field4.method1666(24348);
                int var6 = 0;
                int var7 = class1.field4.method1663((byte) -115);
                if (var7 != 0) {
                    var6 = class1.field4.method1651(4139);
                    if (var6 == 255) {
                        var6 = class1.field4.method1617((byte) -43);
                    }
                }
                if (var4 != null && var5 >= 0 && var5 < var4.field1873.length) {
                    var4.field1873[var5] = var7;
                    var4.field1949[var5] = var6;
                }
                class186.method1318(true, var6, var3, var7 - 1, var5);
            }
            if (var4 != null) {
                class53.method403(-128, var4);
            }
            class154.method1125(26);
            class130.field2344[class130.method985(31, class213.field3672++)] = class130.method985(var3, 32767);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 61) {
            class33.method258((byte) 125);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 12) {
            int var8 = class1.field4.method1617((byte) -43);
            class92.field1519 = class234.field4017.method951(var8, arg0 - 19855);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 195) {
            int var9 = class1.field4.method1617((byte) -43);
            int var10 = class1.field4.method1663((byte) 105);
            if (var9 < -70000) {
                var10 += 32768;
            }
            class107 var11;
            if (var9 >= 0) {
                var11 = class55.method408(var9, arg0 ^ 0xF106751F);
            } else {
                var11 = null;
            }
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1873.length; var12++) {
                    var11.field1873[var12] = 0;
                    var11.field1949[var12] = 0;
                }
            }
            class230.method1571((byte) 123, var10);
            int var13 = class1.field4.method1663((byte) -77);
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class1.field4.method1645(-27);
                if (var15 == 255) {
                    var15 = class1.field4.method1624((byte) -99);
                }
                int var16 = class1.field4.method1623(true);
                if (var11 != null && var14 < var11.field1873.length) {
                    var11.field1873[var14] = var16;
                    var11.field1949[var14] = var15;
                }
                class186.method1318(true, var15, var10, var16 - 1, var14);
            }
            if (var11 != null) {
                class53.method403(-83, var11);
            }
            class154.method1125(97);
            class130.field2344[class130.method985(class213.field3672++, 31)] = class130.method985(32767, var10);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 126) {
            class147.field2609 = class1.field4.method1651(4139);
            class211.field3641 = class1.field4.method1635(2);
            for (int var17 = class147.field2609; var17 < (class147.field2609 + 8); var17++) {
                for (int var19 = class211.field3641; var19 < class211.field3641 + 8; var19++) {
                    if (class220.field3764[class216.field3712][var17][var19] != null) {
                        class220.field3764[class216.field3712][var17][var19] = null;
                        class247.method1729(var19, -105, var17);
                    }
                }
            }
            for (class251 var18 = (class251) class175.field3048.method1811(2); var18 != null; var18 = (class251) class175.field3048.method1810(false)) {
                if (class147.field2609 <= var18.field4338 && class147.field2609 + 8 > var18.field4338 && class211.field3641 <= var18.field4341 && var18.field4341 < (class211.field3641 + 8) && class216.field3712 == var18.field4345) {
                    var18.field4353 = 0;
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 29) {
            int var20 = class1.field4.method1651(arg0 ^ 0xFFFFEF04);
            int var21 = class1.field4.method1651(arg0 + 4348);
            int var22 = class1.field4.method1663((byte) -115);
            int var23 = class1.field4.method1651(4139);
            int var24 = class1.field4.method1651(arg0 ^ 0xFFFFEF04);
            class85.method618(var21, true, var22, var20, var23, var24, (byte) 109);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 100) {
            long var25 = class1.field4.method1658(-1243377376);
            class96 var27 = class18.method139(class127.method973(class1.field4, (byte) 78).method682((byte) -123));
            class226.method1540(class57.method421((byte) -114, var25).method706((byte) 75), 6, (byte) 93, var27);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 0) {
            int var28 = class1.field4.method1663((byte) -104);
            class96 var29 = class1.field4.method1634(-97);
            int var30 = class1.field4.method1672((byte) 108);
            if (class45.method350((byte) 1, var30)) {
                class141.method1046(var29, 8392, var28);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 157) {
            class105.method782((byte) -81, class1.field4);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 109) {
            int var31 = class1.field4.method1672((byte) 80);
            int var32 = class1.field4.method1637((byte) -99);
            int var33 = class1.field4.method1623(true);
            int var34 = class1.field4.method1663((byte) 114);
            if (class45.method350((byte) 1, var33)) {
                class61.method439(var32, 4, var34 << 16 | var31, 7);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 212) {
            int var35 = class1.field4.method1645(-49);
            int var36 = class1.field4.method1672((byte) -116);
            class138.method1026(var36, -24288, var35);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 205) {
            long var37 = class1.field4.method1658(-1243377376);
            long var39 = (long) class1.field4.method1663((byte) -84);
            long var41 = (long) class1.field4.method1660(arg0 ^ 0x13FC1DFF);
            int var43 = class1.field4.method1651(4139);
            int var44 = class1.field4.method1663((byte) -121);
            long var45 = (var39 << 32) + var41;
            boolean var47 = false;
            int var48 = 0;
            label1091: while (true) {
                if (var48 >= 100) {
                    if (var43 <= 1) {
                        for (int var49 = 0; var49 < class231.field3974; var49++) {
                            if (class7.field132[var49] == var37) {
                                var47 = true;
                                break label1091;
                            }
                        }
                    }
                    break;
                }
                if (class5.field96[var48] == var45) {
                    var47 = true;
                    break;
                }
                var48++;
            }
            if (!var47 && class71.field1226 == 0) {
                class5.field96[class153.field2684] = var45;
                class153.field2684 = (class153.field2684 + 1) % 100;
                class96 var50 = class11.method89(var44, false).method1447(class1.field4, (byte) 116);
                if (var43 == 2) {
                    class29.method193(-1, (class96) null, var50, var44, 18, class36.method289(arg0 - 5406, new class96[] { class3.field71, class57.method421((byte) -114, var37).method706((byte) 46) }));
                } else if (var43 == 1) {
                    class29.method193(arg0 ^ 0xD0, (class96) null, var50, var44, 18, class36.method289(-5615, new class96[] { class29.field479, class57.method421((byte) -114, var37).method706((byte) 80) }));
                } else {
                    class29.method193(-1, (class96) null, var50, var44, 18, class57.method421((byte) -114, var37).method706((byte) -104));
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 66) {
            int var51 = class1.field4.method1637((byte) 79);
            int var52 = (var51 & 0x3B98BE48) >> 28;
            int var53 = (var51 & 0xFFFF1FB) >> 14;
            int var54 = var51 & 0x3FFF;
            int var55 = class1.field4.method1618(-112);
            int var56 = class1.field4.method1645(arg0 ^ 0x8A);
            int var57 = var54 - class225.field3832;
            int var58 = var56 >> 2;
            int var59 = var56 & 0x3;
            if (var55 == 65535) {
                var55 = -1;
            }
            int var60 = var53 - class196.field3383;
            int var61 = class156.field2729[var58];
            class10.method76(var59, var61, var57, var60, var55, var52, var58, -29607);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 224) {
            int var62 = class1.field4.method1651(arg0 + 4348);
            class64 var63 = new class64();
            var63.field1101 = var62 & 0x3F;
            var63.field1091 = class1.field4.method1651(4139);
            int var64 = var62 >> 6;
            if (var63.field1091 >= 0 && class181.field3140.length > var63.field1091) {
                if (var63.field1101 == 1 || var63.field1101 == 10) {
                    var63.field1098 = class1.field4.method1663((byte) 79);
                    class1.field4.field4124 += 3;
                } else if (var63.field1101 >= 2 && var63.field1101 <= 6) {
                    if (var63.field1101 == 2) {
                        var63.field1104 = 64;
                        var63.field1103 = 64;
                    }
                    if (var63.field1101 == 3) {
                        var63.field1103 = 64;
                        var63.field1104 = 0;
                    }
                    if (var63.field1101 == 4) {
                        var63.field1103 = 64;
                        var63.field1104 = 128;
                    }
                    if (var63.field1101 == 5) {
                        var63.field1103 = 0;
                        var63.field1104 = 64;
                    }
                    if (var63.field1101 == 6) {
                        var63.field1103 = 128;
                        var63.field1104 = 64;
                    }
                    var63.field1101 = 2;
                    var63.field1102 = class1.field4.method1663((byte) 105);
                    var63.field1094 = class1.field4.method1663((byte) 68);
                    var63.field1096 = class1.field4.method1651(arg0 + 4348);
                }
                var63.field1097 = class1.field4.method1663((byte) -54);
                if (var63.field1097 == 65535) {
                    var63.field1097 = -1;
                }
                class46.field790[var64] = var63;
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 133) {
            class95.method664(arg0 + 209);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 166) {
            int var65 = class1.field4.method1624((byte) -43);
            int var66 = class1.field4.method1623(true);
            if (class45.method350((byte) 1, var66)) {
                int var67 = 0;
                if (class236.field4047.field812 != null) {
                    var67 = class236.field4047.field812.method1307(60);
                }
                class61.method439(var65, 4, var67, 3);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 228) {
            int var68 = class1.field4.method1645(-86);
            int var69 = class1.field4.method1651(4139);
            int var70 = class1.field4.method1645(-66);
            class216.field3712 = var69 >> 1;
            class236.field4047.method360(var70, var68, arg0 ^ 0xFFFFED8D, (var69 & 0x1) == 1);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 85) {
            class96 var71 = class1.field4.method1634(-85);
            if (var71.method719(class157.field2734, false)) {
                class96 var107 = var71.method716(var71.method720(class229.field3887, arg0 + 20538), (byte) -13, 0);
                long var108 = var107.method685((byte) 123);
                boolean var110 = false;
                for (int var111 = 0; var111 < class231.field3974; var111++) {
                    if (class7.field132[var111] == var108) {
                        var110 = true;
                        break;
                    }
                }
                if (!var110 && class71.field1226 == 0) {
                    class226.method1540(var107, 4, (byte) -62, field1296);
                }
            } else if (var71.method719(class31.field494, false)) {
                class96 var101 = var71.method716(var71.method720(class229.field3887, 20329), (byte) -13, 0);
                long var102 = var101.method685((byte) -41);
                boolean var104 = false;
                for (int var105 = 0; var105 < class231.field3974; var105++) {
                    if (class7.field132[var105] == var102) {
                        var104 = true;
                        break;
                    }
                }
                if (!var104 && class71.field1226 == 0) {
                    class96 var106 = var71.method716(var71.method707(arg0 + 184) - 9, (byte) -13, var71.method720(class229.field3887, arg0 + 20538) + 1);
                    class226.method1540(var101, 8, (byte) -90, var106);
                }
            } else if (var71.method719(class149.field2630, false)) {
                class96 var72 = var71.method716(var71.method720(class229.field3887, 20329), (byte) -13, 0);
                boolean var73 = false;
                long var74 = var72.method685((byte) -123);
                for (int var76 = 0; var76 < class231.field3974; var76++) {
                    if (class7.field132[var76] == var74) {
                        var73 = true;
                        break;
                    }
                }
                if (!var73 && class71.field1226 == 0) {
                    class226.method1540(var72, 10, (byte) -60, class120.field2227);
                }
            } else if (var71.method719(class33.field558, false)) {
                class96 var100 = var71.method716(var71.method720(class33.field558, 20329), (byte) -13, 0);
                class226.method1540(class120.field2227, 11, (byte) 116, var100);
            } else if (var71.method719(class150.field2646, false)) {
                class96 var99 = var71.method716(var71.method720(class150.field2646, 20329), (byte) -13, 0);
                if (class71.field1226 == 0) {
                    class226.method1540(class120.field2227, 12, (byte) 90, var99);
                }
            } else if (var71.method719(class208.field3591, false)) {
                class96 var77 = var71.method716(var71.method720(class208.field3591, 20329), (byte) -13, 0);
                if (class71.field1226 == 0) {
                    class226.method1540(class120.field2227, 13, (byte) 118, var77);
                }
            } else if (var71.method719(class48.field850, false)) {
                class96 var78 = var71.method716(var71.method720(class229.field3887, arg0 ^ 0xFFFFB046), (byte) -13, 0);
                long var79 = var78.method685((byte) 125);
                boolean var81 = false;
                for (int var82 = 0; var82 < class231.field3974; var82++) {
                    if (class7.field132[var82] == var79) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class71.field1226 == 0) {
                    class226.method1540(var78, 14, (byte) 123, class120.field2227);
                }
            } else if (var71.method719(class31.field492, false)) {
                class96 var94 = var71.method716(var71.method720(class229.field3887, arg0 + 20538), (byte) -13, 0);
                long var95 = var94.method685((byte) 122);
                boolean var97 = false;
                for (int var98 = 0; var98 < class231.field3974; var98++) {
                    if (class7.field132[var98] == var95) {
                        var97 = true;
                        break;
                    }
                }
                if (!var97 && class71.field1226 == 0) {
                    class226.method1540(var94, 15, (byte) -17, class120.field2227);
                }
            } else if (var71.method719(class159.field2826, false)) {
                class96 var89 = var71.method716(var71.method720(class229.field3887, arg0 ^ 0xFFFFB046), (byte) -13, 0);
                long var90 = var89.method685((byte) 127);
                boolean var92 = false;
                for (int var93 = 0; var93 < class231.field3974; var93++) {
                    if (class7.field132[var93] == var90) {
                        var92 = true;
                        break;
                    }
                }
                if (!var92 && class71.field1226 == 0) {
                    class226.method1540(var89, 16, (byte) 103, class120.field2227);
                }
            } else if (var71.method719(class185.field3218, false)) {
                boolean var83 = false;
                class96 var84 = var71.method716(var71.method720(class229.field3887, 20329), (byte) -13, 0);
                long var85 = var84.method685((byte) 6);
                for (int var87 = 0; var87 < class231.field3974; var87++) {
                    if (class7.field132[var87] == var85) {
                        var83 = true;
                        break;
                    }
                }
                if (!var83 && class71.field1226 == 0) {
                    class96 var88 = var71.method716(var71.method707(-33) - 9, (byte) -13, var71.method720(class229.field3887, 20329) + 1);
                    class226.method1540(var84, 21, (byte) 126, var88);
                }
            } else {
                class226.method1540(class120.field2227, 0, (byte) -124, var71);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 207) {
            int var112 = class1.field4.method1624((byte) -80);
            int var113 = class1.field4.method1651(4139);
            int var114 = class1.field4.method1618(arg0 + 88);
            if (class45.method350((byte) 1, var114)) {
                class44.method345(var113, var112, -51);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 213) {
            int var115 = class1.field4.method1637((byte) 116);
            int var116 = class1.field4.method1672((byte) -114);
            int var117 = class1.field4.method1618(-122);
            if (class45.method350((byte) 1, var116)) {
                class202.method1413(var115, var117, 1);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 9) {
            byte[] var118 = new byte[class47.field820];
            class1.field4.method1013(var118, class47.field820, 0, 125);
            class96 var119 = class154.method1131(-91, var118, 0, class47.field820);
            if (class103.field1743 == null && class123.field2288 == 3 || !class123.field2273.startsWith("win") || class207.field3576) {
                class76.method552(true, (byte) -98, var119);
            } else {
                class122.field2247 = var119;
                class22.field385 = true;
                class236.field4038 = class234.field4017.method940(new String(var119.method709(-61), "ISO-8859-1"), 0);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 179) {
            int var120 = class1.field4.method1618(-114);
            if (var120 == 65535) {
                var120 = -1;
            }
            class38.method298(0, var120);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 69) {
            int var121 = class1.field4.method1674(-109);
            int var122 = class1.field4.method1618(-118);
            if (var122 == 65535) {
                var122 = -1;
            }
            class201.method1404(var121, true, var122);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 96) {
            class6.field126 = -1;
            class217.field3727 = 0;
            return true;
        } else if (class6.field126 == 163) {
            for (int var123 = 0; var123 < class22.field371.length; var123++) {
                if (class22.field371[var123] != null) {
                    class22.field371[var123].field4526 = -1;
                }
            }
            for (int var124 = 0; var124 < class86.field1450.length; var124++) {
                if (class86.field1450[var124] != null) {
                    class86.field1450[var124].field4526 = -1;
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 111) {
            int var125 = class1.field4.method1651(arg0 + 4348);
            int var126 = class1.field4.method1651(arg0 ^ 0xFFFFEF04);
            int var127 = class1.field4.method1663((byte) -112);
            int var128 = class1.field4.method1651(4139);
            int var129 = class1.field4.method1651(arg0 + 4348);
            class143.method1062(var126, var125, var128, 1557, var129, var127);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 214) {
            int var130 = class1.field4.method1618(-122);
            int var131 = class1.field4.method1618(-128);
            int var132 = class1.field4.method1624((byte) -58);
            if (var130 == 65535) {
                var130 = -1;
            }
            if (class45.method350((byte) 1, var131)) {
                class61.method439(var132, 4, var130, 2);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 98) {
            long var133 = class1.field4.method1658(arg0 ^ 0x4A1C6E0F);
            int var135 = class1.field4.method1663((byte) -45);
            class96 var136 = class11.method89(var135, false).method1447(class1.field4, (byte) 86);
            class29.method193(arg0 ^ 0xD0, (class96) null, var136, var135, 19, class57.method421((byte) -114, var133).method706((byte) 95));
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 232) {
            int var137 = class1.field4.method1669(255);
            int var138 = class1.field4.method1672((byte) 72);
            int var139 = class1.field4.method1623(true);
            if (class45.method350((byte) 1, var139)) {
                if (var137 == 2) {
                    class219.method1505(true);
                }
                class107.field1825 = var138;
                class244.method1714(var138, true);
                class94.method659(false, (byte) 123);
                class137.method1023(class107.field1825, (byte) 37);
                for (int var140 = 0; var140 < 100; var140++) {
                    class176.field3059[var140] = true;
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 128) {
            int var141 = class1.field4.method1618(-127);
            int var142 = class1.field4.method1623(true);
            int var143 = class1.field4.method1619((byte) 109);
            if (class45.method350((byte) 1, var142)) {
                class242.method1705(var143, (byte) 83, var141);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 46) {
            class96 var144 = class1.field4.method1634(-108);
            int var145 = class1.field4.method1663((byte) 81);
            int var146 = class1.field4.method1618(arg0 ^ 0xA5);
            if (class45.method350((byte) 1, var146)) {
                class141.method1046(var144, 8392, var145);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 47) {
            long var147 = class1.field4.method1658(-1243377376);
            class1.field4.method1656(arg0 + 126);
            long var149 = class1.field4.method1658(-1243377376);
            long var151 = (long) class1.field4.method1663((byte) 97);
            long var153 = (long) class1.field4.method1660(-335289648);
            long var155 = (var151 << 32) + var153;
            int var157 = class1.field4.method1651(4139);
            boolean var158 = false;
            int var159 = class1.field4.method1663((byte) 99);
            int var160 = 0;
            label1211: while (true) {
                if (var160 >= 100) {
                    if (var157 <= 1) {
                        for (int var161 = 0; var161 < class231.field3974; var161++) {
                            if (class7.field132[var161] == var147) {
                                var158 = true;
                                break label1211;
                            }
                        }
                    }
                    break;
                }
                if (class5.field96[var160] == var155) {
                    var158 = true;
                    break;
                }
                var160++;
            }
            if (!var158 && class71.field1226 == 0) {
                class5.field96[class153.field2684] = var155;
                class153.field2684 = (class153.field2684 + 1) % 100;
                class96 var162 = class11.method89(var159, false).method1447(class1.field4, (byte) 123);
                if (var157 == 2 || var157 == 3) {
                    class29.method193(-1, class57.method421((byte) -114, var149).method706((byte) 78), var162, var159, 20, class36.method289(-5615, new class96[] { class3.field71, class57.method421((byte) -114, var147).method706((byte) -125) }));
                } else if (var157 == 1) {
                    class29.method193(arg0 ^ 0xD0, class57.method421((byte) -114, var149).method706((byte) 47), var162, var159, 20, class36.method289(-5615, new class96[] { class29.field479, class57.method421((byte) -114, var147).method706((byte) -95) }));
                } else {
                    class29.method193(-1, class57.method421((byte) -114, var149).method706((byte) -103), var162, var159, 20, class57.method421((byte) -114, var147).method706((byte) 86));
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 1) {
            int var163 = class1.field4.method1626((byte) 115);
            int var164 = class1.field4.method1619((byte) 109);
            int var165 = class1.field4.method1663((byte) 105);
            int var166 = class1.field4.method1620(-14272);
            if (class45.method350((byte) 1, var165)) {
                class217.method1500(var166, var164, var163, 11);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 113) {
            class211.field3641 = class1.field4.method1645(arg0 ^ 0xA2);
            class147.field2609 = class1.field4.method1651(4139);
            while (class1.field4.field4124 < class47.field820) {
                class6.field126 = class1.field4.method1651(4139);
                class31.method206((byte) 55);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 171) {
            class266.method1830(class1.field4, class234.field4017, class47.field820, 127);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 78) {
            class43.method337(true, (byte) 95);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 155) {
            int var167 = class1.field4.method1672((byte) -86);
            class96 var168 = class1.field4.method1634(-123);
            int var169 = class1.field4.method1637((byte) 83);
            if (class45.method350((byte) 1, var167)) {
                class210.method1463(var168, (byte) 50, var169);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 104) {
            int var170 = class1.field4.method1663((byte) -101);
            if (var170 == 65535) {
                var170 = -1;
            }
            int var171 = class1.field4.method1651(4139);
            int var172 = class1.field4.method1663((byte) -109);
            class17.method113(var172, var170, 25373, var171);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 240) {
            class259.field4493 = class67.field1137;
            long var173 = class1.field4.method1658(-1243377376);
            if (var173 == 0L) {
                class6.field126 = -1;
                class147.field2606 = null;
                class237.field4071 = null;
                class244.field4237 = null;
                class118.field2190 = 0;
                return true;
            }
            long var175 = class1.field4.method1658(-1243377376);
            class147.field2606 = class57.method421((byte) -114, var175);
            class237.field4071 = class57.method421((byte) -114, var173);
            class169.field2964 = class1.field4.method1656(arg0 + 252);
            int var177 = class1.field4.method1651(4139);
            if (var177 == 255) {
                class6.field126 = -1;
                return true;
            }
            class120[] var178 = new class120[100];
            class118.field2190 = var177;
            for (int var179 = 0; var179 < class118.field2190; var179++) {
                var178[var179] = new class120();
                var178[var179].field4304 = class1.field4.method1658(arg0 - 1243377167);
                var178[var179].field2219 = class57.method421((byte) -114, var178[var179].field4304);
                var178[var179].field2217 = class1.field4.method1663((byte) -127);
                var178[var179].field2218 = class1.field4.method1656(102);
                var178[var179].field2224 = class1.field4.method1634(-107);
                if (class51.field881 == var178[var179].field4304) {
                    class143.field2540 = var178[var179].field2218;
                }
            }
            boolean var180 = false;
            int var181 = class118.field2190;
            while (var181 > 0) {
                var181--;
                boolean var182 = true;
                for (int var183 = 0; var183 < var181; var183++) {
                    if (var178[var183].field2219.method689(var178[var183 + 1].field2219, 113) > 0) {
                        var182 = false;
                        class120 var184 = var178[var183];
                        var178[var183] = var178[var183 + 1];
                        var178[var183 + 1] = var184;
                    }
                }
                if (var182) {
                    break;
                }
            }
            class6.field126 = -1;
            class244.field4237 = var178;
            return true;
        } else if (class6.field126 == 99) {
            if (class47.field820 == 0) {
                class250.field4321 = class97.field1650;
            } else {
                class250.field4321 = class1.field4.method1634(-104);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 246) {
            int var185 = class1.field4.method1617((byte) -43);
            class107 var186 = class55.method408(var185, 251234864);
            for (int var187 = 0; var187 < var186.field1873.length; var187++) {
                var186.field1873[var187] = -1;
                var186.field1873[var187] = 0;
            }
            class53.method403(-119, var186);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 139) {
            class74.method533((byte) 62);
            class6.field126 = -1;
            return false;
        } else if (class6.field126 == 73) {
            int var188 = class1.field4.method1637((byte) 95);
            int var189 = class1.field4.method1663((byte) 113);
            int var190 = class1.field4.method1663((byte) -50);
            if (var190 == 65535) {
                var190 = -1;
            }
            if (class45.method350((byte) 1, var189)) {
                class61.method439(var188, 4, var190, 1);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 121) {
            class9.method75(16);
            class154.method1125(79);
            class6.field126 = -1;
            class210.field3617 += 32;
            return true;
        } else if (class6.field126 == 227) {
            class154.method1125(28);
            class270.field4706 = class1.field4.method1651(arg0 + 4348);
            class6.field126 = -1;
            class181.field3131 = class67.field1137;
            return true;
        } else if (class6.field126 == 37) {
            long var191 = class1.field4.method1658(-1243377376);
            class1.field4.method1656(39);
            long var193 = class1.field4.method1658(-1243377376);
            long var195 = (long) class1.field4.method1663((byte) 101);
            long var197 = (long) class1.field4.method1660(-335289648);
            boolean var199 = false;
            int var200 = class1.field4.method1651(4139);
            long var201 = (var195 << 32) + var197;
            int var203 = 0;
            label1276: while (true) {
                if (var203 >= 100) {
                    if (var200 <= 1) {
                        if ((!class31.field487 || class265.field4625) && !class74.field1277) {
                            for (int var204 = 0; var204 < class231.field3974; var204++) {
                                if (class7.field132[var204] == var191) {
                                    var199 = true;
                                    break label1276;
                                }
                            }
                        } else {
                            var199 = true;
                        }
                    }
                    break;
                }
                if (class5.field96[var203] == var201) {
                    var199 = true;
                    break;
                }
                var203++;
            }
            if (!var199 && class71.field1226 == 0) {
                class5.field96[class153.field2684] = var201;
                class153.field2684 = (class153.field2684 + 1) % 100;
                class96 var205 = class18.method139(class127.method973(class1.field4, (byte) 115).method682((byte) -84));
                if (var200 == 2 || var200 == 3) {
                    class39.method308(class57.method421((byte) -114, var193).method706((byte) 105), 49, 9, var205, class36.method289(-5615, new class96[] { class3.field71, class57.method421((byte) -114, var191).method706((byte) 89) }));
                } else if (var200 == 1) {
                    class39.method308(class57.method421((byte) -114, var193).method706((byte) -92), -124, 9, var205, class36.method289(arg0 - 5406, new class96[] { class29.field479, class57.method421((byte) -114, var191).method706((byte) -101) }));
                } else {
                    class39.method308(class57.method421((byte) -114, var193).method706((byte) -91), -127, 9, var205, class57.method421((byte) -114, var191).method706((byte) 40));
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 106) {
            class154.method1125(66);
            class186.field3252 = class1.field4.method1627(true);
            class6.field126 = -1;
            class181.field3131 = class67.field1137;
            return true;
        } else if (class6.field126 == 210) {
            int var206 = class1.field4.method1623(true);
            class32.method213(var206, 0);
            class130.field2344[class130.method985(class213.field3672++, 31)] = class130.method985(32767, var206);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 59) {
            int var207 = class1.field4.method1618(-112);
            int var208 = class1.field4.method1663((byte) 64);
            class235.field4033 = var207;
            class117.field2170 = var208;
            class54.method407(113);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 18) {
            int var209 = class1.field4.method1645(-18);
            int var210 = class1.field4.method1663((byte) -124);
            int var211 = class1.field4.method1623(true);
            class197 var212 = class86.field1450[var210];
            if (var212 != null) {
                class108.method828(var212, var211, var209, false);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 145) {
            int var213 = class1.field4.method1617((byte) -43);
            int var214 = class1.field4.method1619((byte) 126);
            int var215 = class1.field4.method1672((byte) 69);
            int var216 = class1.field4.method1672((byte) 77);
            if (var216 == 65535) {
                var216 = -1;
            }
            if (class45.method350((byte) 1, var215)) {
                class107 var217 = class55.method408(var214, arg0 + 251235073);
                if (var217.field1867) {
                    class20.method143(var214, var216, var213, (byte) -95);
                    class159 var218 = class269.method1845(var216, (byte) 61);
                    class229.method1568(var218.field2820, false, var218.field2757, var214, var218.field2829);
                    class161.method1165(var218.field2783, var214, 0, var218.field2827, var218.field2805);
                } else if (var216 == -1) {
                    var217.field1947 = 0;
                    class6.field126 = -1;
                    return true;
                } else {
                    class159 var219 = class269.method1845(var216, (byte) 61);
                    var217.field1847 = var216;
                    var217.field1840 = var219.field2757;
                    var217.field1969 = var219.field2829;
                    var217.field1904 = var219.field2820 * 100 / var213;
                    var217.field1947 = 4;
                    class53.method403(-77, var217);
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 115) {
            for (int var220 = 0; var220 < class54.field937.length; var220++) {
                if (class54.field937[var220] != class44.field758[var220]) {
                    class54.field937[var220] = class44.field758[var220];
                    class235.method1593((byte) -3, var220);
                    class243.field4212[class130.method985(class210.field3617++, 31)] = var220;
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 45) {
            int var221 = class1.field4.method1617((byte) -43);
            int var222 = class1.field4.method1672((byte) 99);
            class201.method1408(var221, var222, 59);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 136) {
            class253.field4380 = class1.field4.method1651(4139);
            class208.field3588 = class67.field1137;
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 64) {
            int var223 = class1.field4.method1651(arg0 + 4348);
            if (class1.field4.method1651(4139) == 0) {
                class127.field2313[var223] = new class157();
            } else {
                class1.field4.field4124--;
                class127.field2313[var223] = new class157(class1.field4);
            }
            class93.field1540 = class67.field1137;
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 204) {
            long var224 = class1.field4.method1658(arg0 - 1243377167);
            boolean var226 = true;
            int var227 = class1.field4.method1663((byte) -53);
            int var228 = class1.field4.method1651(4139);
            if (var224 < 0L) {
                var224 &= Long.MAX_VALUE;
                var226 = false;
            }
            class96 var229 = class120.field2227;
            if (var227 > 0) {
                var229 = class1.field4.method1634(-123);
            }
            class96 var230 = class57.method421((byte) -114, var224).method706((byte) -95);
            for (int var231 = 0; var231 < class76.field1306; var231++) {
                if (class250.field4317[var231] == var224) {
                    if (class251.field4337[var231] != var227) {
                        class251.field4337[var231] = var227;
                        if (var227 > 0) {
                            class226.method1540(class120.field2227, 5, (byte) 111, class36.method289(-5615, new class96[] { var230, class56.field976 }));
                        }
                        if (var227 == 0) {
                            class226.method1540(class120.field2227, 5, (byte) -88, class36.method289(-5615, new class96[] { var230, class219.field3746 }));
                        }
                    }
                    var230 = null;
                    class251.field4336[var231] = var229;
                    class124.field2298[var231] = var228;
                    class86.field1454[var231] = var226;
                    break;
                }
            }
            boolean var232 = false;
            if (var230 != null && class76.field1306 < 200) {
                class250.field4317[class76.field1306] = var224;
                class185.field3224[class76.field1306] = var230;
                class251.field4337[class76.field1306] = var227;
                class251.field4336[class76.field1306] = var229;
                class124.field2298[class76.field1306] = var228;
                class86.field1454[class76.field1306] = var226;
                class76.field1306++;
            }
            class208.field3588 = class67.field1137;
            int var233 = class76.field1306;
            while (var233 > 0) {
                boolean var234 = true;
                var233--;
                for (int var235 = 0; var235 < var233; var235++) {
                    if (class251.field4337[var235] != class235.field4032 && class251.field4337[var235 + 1] == class235.field4032 || class251.field4337[var235] == 0 && class251.field4337[var235 + 1] != 0) {
                        var234 = false;
                        int var236 = class251.field4337[var235];
                        class251.field4337[var235] = class251.field4337[var235 + 1];
                        class251.field4337[var235 + 1] = var236;
                        class96 var237 = class251.field4336[var235];
                        class251.field4336[var235] = class251.field4336[var235 + 1];
                        class251.field4336[var235 + 1] = var237;
                        class96 var238 = class185.field3224[var235];
                        class185.field3224[var235] = class185.field3224[var235 + 1];
                        class185.field3224[var235 + 1] = var238;
                        long var239 = class250.field4317[var235];
                        class250.field4317[var235] = class250.field4317[var235 + 1];
                        class250.field4317[var235 + 1] = var239;
                        int var241 = class124.field2298[var235];
                        class124.field2298[var235] = class124.field2298[var235 + 1];
                        class124.field2298[var235 + 1] = var241;
                        boolean var242 = class86.field1454[var235];
                        class86.field1454[var235] = class86.field1454[var235 + 1];
                        class86.field1454[var235 + 1] = var242;
                    }
                }
                if (var234) {
                    break;
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 203) {
            class15.method110(103);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 209) {
            int var243 = class1.field4.method1663((byte) -92);
            int var244 = class1.field4.method1672((byte) -109);
            int var245 = class1.field4.method1623(true);
            int var246 = class1.field4.method1637((byte) -125);
            if ((var246 >> 30) != 0) {
                int var247 = (var246 & 0x3F5F0BD2) >> 28;
                int var248 = (var246 & 0x3FFF) - class225.field3832;
                int var249 = (var246 >> 14 & 0x3FFF) - class196.field3383;
                if (var249 >= 0 && var248 >= 0 && var249 < 104 && var248 < 104) {
                    int var250 = var248 * 128 + 64;
                    int var251 = var249 * 128 + 64;
                    class4 var252 = new class4(var245, var247, var251, var250, class137.method1025(var247, var250, var251, (byte) -94) - var244, var243, class236.field4053);
                    class262.field4592.method1814(arg0 + 210, new class92(var252));
                }
            } else if (var246 >> 29 != 0) {
                int var253 = var246 & 0xFFFF;
                class197 var254 = class86.field1450[var253];
                if (var254 != null) {
                    var254.field4543 = var245;
                    var254.field4579 = var244;
                    if (var254.field4543 == 65535) {
                        var254.field4543 = -1;
                    }
                    var254.field4553 = 0;
                    var254.field4518 = class236.field4053 + var243;
                    var254.field4548 = 0;
                    if (class236.field4053 < var254.field4518) {
                        var254.field4548 = -1;
                    }
                    if (var254.field4543 != -1 && class236.field4053 == var254.field4518) {
                        int var255 = class146.method1082(var254.field4543, (byte) -86).field3175;
                        if (var255 != -1) {
                            class67 var256 = class189.method1332(var255, 2);
                            if (var256 != null && var256.field1140 != null) {
                                class71.method481(var254.field4533, true, var256, var254.field4511, 0, false);
                            }
                        }
                    }
                }
            } else if ((var246 >> 28) != 0) {
                int var257 = var246 & 0xFFFF;
                class47 var258;
                if (class229.field3934 == var257) {
                    var258 = class236.field4047;
                } else {
                    var258 = class22.field371[var257];
                }
                if (var258 != null) {
                    var258.field4579 = var244;
                    var258.field4518 = class236.field4053 + var243;
                    var258.field4543 = var245;
                    var258.field4553 = 0;
                    if (var258.field4543 == 65535) {
                        var258.field4543 = -1;
                    }
                    var258.field4548 = 0;
                    if (class236.field4053 < var258.field4518) {
                        var258.field4548 = -1;
                    }
                    if (var258.field4543 != -1 && class236.field4053 == var258.field4518) {
                        int var259 = class146.method1082(var258.field4543, (byte) 21).field3175;
                        if (var259 != -1) {
                            class67 var260 = class189.method1332(var259, arg0 + 211);
                            if (var260 != null && var260.field1140 != null) {
                                class71.method481(var258.field4533, true, var260, var258.field4511, 0, class236.field4047 == var258);
                            }
                        }
                    }
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 41) {
            int var261 = class1.field4.method1617((byte) -43);
            int var262 = class1.field4.method1618(-111);
            class138.method1026(var262, -24288, var261);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 123) {
            int var263 = class1.field4.method1624((byte) -90);
            int var264 = class1.field4.method1618(-124);
            int var265 = class1.field4.method1624((byte) -115);
            if (class45.method350((byte) 1, var264)) {
                class168 var266 = (class168) class34.field606.method1081(0, (long) var263);
                class168 var267 = (class168) class34.field606.method1081(0, (long) var265);
                if (var267 != null) {
                    class65.method458(var267, -22, var266 == null || var266.field2961 != var267.field2961);
                }
                if (var266 != null) {
                    var266.method1743((byte) 91);
                    class34.field606.method1085(-1, var266, (long) var265);
                }
                class107 var268 = class55.method408(var263, 251234864);
                if (var268 != null) {
                    class53.method403(-109, var268);
                }
                class107 var269 = class55.method408(var265, 251234864);
                if (var269 != null) {
                    class53.method403(arg0 + 121, var269);
                    class148.method1092(var269, true, false);
                }
                if (class107.field1825 != -1) {
                    class221.method1517(1, class107.field1825, arg0 ^ 0xFFFFFF2E);
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 94) {
            int var270 = class1.field4.method1663((byte) -98);
            int var271 = class1.field4.method1617((byte) -43);
            if (class45.method350((byte) 1, var270)) {
                class168 var272 = (class168) class34.field606.method1081(0, (long) var271);
                if (var272 != null) {
                    class65.method458(var272, arg0 + 187, true);
                }
                if (class27.field459 != null) {
                    class53.method403(arg0 + 116, class27.field459);
                    class27.field459 = null;
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 184) {
            int var273 = class1.field4.method1663((byte) -94);
            class96 var274 = class1.field4.method1634(-120);
            Object[] var275 = new Object[var274.method707(-12) + 1];
            for (int var276 = var274.method707(arg0 ^ 0xFF) - 1; var276 >= 0; var276--) {
                if (var274.method687(var276, arg0 + 209) == 115) {
                    var275[var276 + 1] = class1.field4.method1634(-53);
                } else {
                    var275[var276 + 1] = Integer.valueOf(class1.field4.method1617((byte) -43));
                }
            }
            var275[0] = Integer.valueOf(class1.field4.method1617((byte) -43));
            if (class45.method350((byte) 1, var273)) {
                class116 var277 = new class116();
                var277.field2155 = var275;
                class141.method1044(var277, (byte) 76);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 192) {
            class217.field3728 = class1.field4.method1623(true) * 30;
            class181.field3131 = class67.field1137;
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 80) {
            class159.field2803 = class1.field4.method1651(4139);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 201) {
            class211.field3641 = class1.field4.method1635(2);
            class147.field2609 = class1.field4.method1651(4139);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 20) {
            byte var278 = class1.field4.method1656(-58);
            int var279 = class1.field4.method1672((byte) 80);
            class201.method1408(var278, var279, 59);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 208) {
            int var280 = class1.field4.method1672((byte) 57);
            int var281 = class1.field4.method1637((byte) -81);
            int var282 = class1.field4.method1635(2);
            int var283 = class1.field4.method1623(true);
            if (class45.method350((byte) 1, var283)) {
                class168 var284 = (class168) class34.field606.method1081(arg0 ^ 0xFFFFFF2F, (long) var281);
                if (var284 != null) {
                    class65.method458(var284, -22, var284.field2961 != var280);
                }
                class156.method1135(var280, (byte) 60, var281, var282);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 49) {
            long var285 = class1.field4.method1658(-1243377376);
            int var287 = class1.field4.method1663((byte) 86);
            byte var288 = class1.field4.method1656(arg0 + 254);
            boolean var289 = false;
            if ((var285 & Long.MIN_VALUE) != 0L) {
                var289 = true;
            }
            if (var289) {
                if (class118.field2190 == 0) {
                    class6.field126 = -1;
                    return true;
                }
                long var290 = var285 & Long.MAX_VALUE;
                boolean var292 = false;
                int var293;
                for (var293 = 0; class118.field2190 > var293 && (class244.field4237[var293].field4304 != var290 || class244.field4237[var293].field2217 != var287); var293++) {
                }
                if (var293 < class118.field2190) {
                    while (var293 < (class118.field2190 - 1)) {
                        class244.field4237[var293] = class244.field4237[var293 + 1];
                        var293++;
                    }
                    class118.field2190--;
                    class244.field4237[class118.field2190] = null;
                }
            } else {
                class96 var294 = class1.field4.method1634(arg0 + 128);
                class120 var295 = new class120();
                var295.field4304 = var285;
                var295.field2219 = class57.method421((byte) -114, var295.field4304);
                var295.field2218 = var288;
                var295.field2217 = var287;
                var295.field2224 = var294;
                int var296;
                for (var296 = class118.field2190 - 1; var296 >= 0; var296--) {
                    int var297 = class244.field4237[var296].field2219.method689(var295.field2219, arg0 + 301);
                    if (var297 == 0) {
                        class244.field4237[var296].field2217 = var287;
                        class244.field4237[var296].field2218 = var288;
                        class244.field4237[var296].field2224 = var294;
                        class6.field126 = -1;
                        if (class51.field881 == var285) {
                            class143.field2540 = var288;
                        }
                        class259.field4493 = class67.field1137;
                        return true;
                    }
                    if (var297 < 0) {
                        break;
                    }
                }
                if (class244.field4237.length <= class118.field2190) {
                    class6.field126 = -1;
                    return true;
                }
                for (int var298 = class118.field2190 - 1; var298 > var296; var298--) {
                    class244.field4237[var298 + 1] = class244.field4237[var298];
                }
                if (class118.field2190 == 0) {
                    class244.field4237 = new class120[100];
                }
                class244.field4237[var296 + 1] = var295;
                if (class51.field881 == var285) {
                    class143.field2540 = var288;
                }
                class118.field2190++;
            }
            class6.field126 = -1;
            class259.field4493 = class67.field1137;
            return true;
        } else if (class6.field126 == 55) {
            long var299 = class1.field4.method1658(-1243377376);
            long var301 = (long) class1.field4.method1663((byte) -75);
            long var303 = (long) class1.field4.method1660(-335289648);
            boolean var305 = false;
            int var306 = class1.field4.method1651(4139);
            long var307 = (var301 << 32) + var303;
            int var309 = 0;
            label1383: while (true) {
                if (var309 >= 100) {
                    if (var306 <= 1) {
                        if ((!class31.field487 || class265.field4625) && !class74.field1277) {
                            for (int var310 = 0; var310 < class231.field3974; var310++) {
                                if (class7.field132[var310] == var299) {
                                    var305 = true;
                                    break label1383;
                                }
                            }
                        } else {
                            var305 = true;
                        }
                    }
                    break;
                }
                if (class5.field96[var309] == var307) {
                    var305 = true;
                    break;
                }
                var309++;
            }
            if (!var305 && class71.field1226 == 0) {
                class5.field96[class153.field2684] = var307;
                class153.field2684 = (class153.field2684 + 1) % 100;
                class96 var311 = class18.method139(class127.method973(class1.field4, (byte) 70).method682((byte) -66));
                if (var306 == 2 || var306 == 3) {
                    class226.method1540(class36.method289(-5615, new class96[] { class3.field71, class57.method421((byte) -114, var299).method706((byte) -128) }), 7, (byte) 127, var311);
                } else if (var306 == 1) {
                    class226.method1540(class36.method289(-5615, new class96[] { class29.field479, class57.method421((byte) -114, var299).method706((byte) 57) }), 7, (byte) -7, var311);
                } else {
                    class226.method1540(class57.method421((byte) -114, var299).method706((byte) 53), 3, (byte) -8, var311);
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 161) {
            int var312 = class1.field4.method1651(arg0 ^ 0xFFFFEF04);
            int var313 = class1.field4.method1651(4139);
            int var314 = class1.field4.method1651(arg0 ^ 0xFFFFEF04);
            int var315 = class1.field4.method1651(arg0 ^ 0xFFFFEF04);
            int var316 = class1.field4.method1663((byte) -126);
            class208.field3583[var312] = true;
            class80.field1371[var312] = var313;
            class171.field3005[var312] = var314;
            class93.field1542[var312] = var315;
            class25.field426[var312] = var316;
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 148) {
            int var317 = class1.field4.method1672((byte) 85);
            int var318 = class1.field4.method1617((byte) -43);
            int var319 = class1.field4.method1663((byte) 64);
            if (class45.method350((byte) 1, var319)) {
                class92.method652(var317, false, var318);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 156) {
            class43.method337(false, (byte) 70);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 153) {
            int var320 = class1.field4.method1672((byte) -88);
            int var321 = class1.field4.method1623(true);
            int var322 = class1.field4.method1637((byte) 125);
            int var323 = class1.field4.method1663((byte) -60);
            int var324 = class1.field4.method1618(-121);
            if (class45.method350((byte) 1, var320)) {
                class229.method1568(var324, false, var321, var322, var323);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 134 || class6.field126 == 248 || class6.field126 == 68 || class6.field126 == 233 || class6.field126 == 253 || class6.field126 == 135 || class6.field126 == 38 || class6.field126 == 187 || class6.field126 == 127 || class6.field126 == 196 || class6.field126 == 10 || class6.field126 == 43) {
            class31.method206((byte) 55);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 39) {
            int var325 = class1.field4.method1618(-113);
            if (var325 == 65535) {
                var325 = -1;
            }
            int var326 = class1.field4.method1624((byte) -79);
            int var327 = class1.field4.method1637((byte) -122);
            int var328 = class1.field4.method1618(-126);
            int var329 = class1.field4.method1672((byte) -78);
            if (var329 == 65535) {
                var329 = -1;
            }
            if (class45.method350((byte) 1, var328)) {
                for (int var330 = var325; var330 <= var329; var330++) {
                    long var331 = ((long) var326 << 32) + (long) var330;
                    class249 var333 = class26.field441.method1081(0, var331);
                    if (var333 != null) {
                        var333.method1743((byte) 33);
                    }
                    class26.field441.method1085(-1, new class46(var327), var331);
                }
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 34) {
            class106.field1774 = class1.field4.method1651(4139);
            class90.field1499 = class1.field4.method1651(4139);
            class276.field4796 = class1.field4.method1651(4139);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 130) {
            if (class107.field1825 != -1) {
                class221.method1517(0, class107.field1825, arg0 ^ 0xFFFFFF2E);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 217) {
            int var334 = class1.field4.method1623(true);
            int var335 = class1.field4.method1617((byte) -43);
            int var336 = class1.field4.method1672((byte) -88);
            int var337 = class1.field4.method1663((byte) -106);
            if (class45.method350((byte) 1, var334)) {
                class73.method532(var335, 13, (var336 << 16) + var337);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 57) {
            class180.method1278(class1.field4.method1634(-61), -1);
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 255) {
            int var338 = class1.field4.method1645(-94);
            int var339 = class1.field4.method1672((byte) 112);
            int var340 = class1.field4.method1618(-124);
            if (class45.method350((byte) 1, var339)) {
                class202.method1413(var338, var340, 1);
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 225) {
            class154.method1125(25);
            int var341 = class1.field4.method1624((byte) -46);
            int var342 = class1.field4.method1635(2);
            int var343 = class1.field4.method1645(arg0 ^ 0xFB);
            class95.field1565[var343] = var341;
            class168.field2958[var343] = var342;
            class230.field3958[var343] = 1;
            for (int var344 = 0; var344 < 98; var344++) {
                if (var341 >= class253.field4373[var344]) {
                    class230.field3958[var343] = var344 + 2;
                }
            }
            class243.field4214[class130.method985(31, class276.field4799++)] = var343;
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 137) {
            class231.field3974 = class47.field820 / 8;
            for (int var345 = 0; var345 < class231.field3974; var345++) {
                class7.field132[var345] = class1.field4.method1658(class94.method657(arg0, 1243377167));
                class106.field1804[var345] = class57.method421((byte) -114, class7.field132[var345]);
            }
            class208.field3588 = class67.field1137;
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 86) {
            int var346 = class1.field4.method1635(arg0 + 211);
            class96 var347 = class1.field4.method1634(arg0 + 141);
            int var348 = class1.field4.method1651(arg0 + 4348);
            if (var346 >= 1 && var346 <= 8) {
                if (var347.method679(class156.field2723, 18452)) {
                    var347 = null;
                }
                class107.field1912[var346 - 1] = var347;
                class122.field2264[var346 - 1] = var348 == 0;
            }
            class6.field126 = -1;
            return true;
        } else if (class6.field126 == 82) {
            int var349 = class1.field4.method1624((byte) -41);
            int var350 = class1.field4.method1618(-116);
            int var351 = class1.field4.method1636(65536);
            if (class45.method350((byte) 1, var350)) {
                class93.method655(var349, (byte) 52, var351);
            }
            class6.field126 = -1;
            return true;
        } else {
            client.method815("T1 - " + class6.field126 + "," + class46.field794 + "," + class252.field4365 + " - " + class47.field820, (byte) -81, (Throwable) null);
            if (arg0 != -209) {
                method548(true, (class251) null);
            }
            class74.method533((byte) 62);
            return true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lmb;B)Ldd;")
    public static final class265 method547(class96 arg0, byte arg1) {
        field1301++;
        for (class265 var2 = (class265) class239.field4116.method1811(2); var2 != null; var2 = (class265) class239.field4116.method1810(false)) {
            if (var2.field4623.method705(0, arg0)) {
                return var2;
            }
        }
        int var3 = 16 / ((23 - arg1) / 51);
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLt;)V")
    public static final void method548(boolean arg0, class251 arg1) {
        field1303++;
        int var2 = -1;
        long var3 = 0L;
        if (arg0) {
            field1296 = null;
        }
        if (arg1.field4352 == 0) {
            var3 = class41.method317(arg1.field4345, arg1.field4338, arg1.field4341);
        }
        int var5 = 0;
        if (arg1.field4352 == 1) {
            var3 = class162.method1177(arg1.field4345, arg1.field4338, arg1.field4341);
        }
        if (arg1.field4352 == 2) {
            var3 = class101.method767(arg1.field4345, arg1.field4338, arg1.field4341);
        }
        int var6 = 0;
        if (arg1.field4352 == 3) {
            var3 = class169.method1213(arg1.field4345, arg1.field4338, arg1.field4341);
        }
        if (var3 != 0L) {
            var5 = ((int) var3 & 0x7C432) >> 14;
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var3 >> 20 & 0x3;
        }
        arg1.field4358 = var2;
        arg1.field4340 = var5;
        arg1.field4346 = var6;
    }
}
