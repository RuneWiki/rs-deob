import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Loa;")
    public static class99 field627 = class221.method1463(2844, "Fertigkeit: ");

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field628 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Loa;")
    public static class99 field629 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ltg;")
    public static class182 field630;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BB)Lge;")
    public static final class70 method284(byte[] arg0, byte arg1) {
        field631++;
        if (arg0 == null) {
            return null;
        }
        class26 var2 = new class26(arg0, class290.field5082, class11.field94, class223.field3885, class193.field3395, class181.field3151);
        if (arg1 < 24) {
            return null;
        } else {
            class24.method181(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
    public static final boolean method285(int arg0) throws IOException {
        field632++;
        if (class133.field2322 == null) {
            return false;
        }
        int var1 = class133.field2322.method62(arg0);
        if (var1 == 0) {
            return false;
        }
        if (class212.field3669 == -1) {
            var1--;
            class133.field2322.method61(-69, class129.field2252.field4619, 0, 1);
            class129.field2252.field4587 = 0;
            class212.field3669 = class129.field2252.method977(arg0 ^ 0xFFFFFF00);
            class180.field3146 = class211.field3661[class212.field3669];
        }
        if (class180.field3146 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class133.field2322.method61(-83, class129.field2252.field4619, 0, 1);
            class180.field3146 = class129.field2252.field4619[0] & 0xFF;
        }
        if (class180.field3146 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class133.field2322.method61(-89, class129.field2252.field4619, 0, 2);
            class129.field2252.field4587 = 0;
            class180.field3146 = class129.field2252.method1740((byte) 124);
        }
        if (class180.field3146 > var1) {
            return false;
        }
        class129.field2252.field4587 = 0;
        class133.field2322.method61(-75, class129.field2252.field4619, 0, class180.field3146);
        class238.field4112 = class107.field1823;
        class240.field4133 = 0;
        class107.field1823 = class128.field2230;
        class128.field2230 = class212.field3669;
        if (class212.field3669 == 93) {
            class75.method524((byte) -127, class129.field2252.method1705(121));
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 215) {
            int var2 = class129.field2252.method1694(0);
            int var3 = class129.field2252.method1748(arg0 + 16711681);
            int var4 = class129.field2252.method1714(-1640531527);
            class255.field4407 = var3 >> 1;
            class168.field3006.method1258(var2, (var3 & 0x1) == 1, var4, (byte) -68);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 83) {
            int var5 = class129.field2252.method1729((byte) 118);
            int var6 = class129.field2252.method1727(arg0 ^ 0xFFFFFFFB);
            class99 var7 = class129.field2252.method1705(-127);
            if (class251.method1625(0, var5)) {
                class208.method1392(arg0 + 126, var7, var6);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 10) {
            class77.field1364 = class129.field2252.method1740((byte) 80) * 30;
            class21.field244 = class28.field514;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 38) {
            int var8 = class129.field2252.method1748(arg0 ^ 0xFF00FFFF);
            int var9 = class129.field2252.method1727(arg0 + 5);
            int var10 = class129.field2252.method1740((byte) 110);
            if (class251.method1625(0, var10)) {
                class214.method1434(var9, -105, var8);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 169) {
            int var11 = class129.field2252.method1729((byte) 127);
            int var12 = class129.field2252.method1740((byte) 59);
            class160.field2843 = var12;
            class239.field4129 = var11;
            class278.method1833(arg0 ^ 0x61);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 135) {
            long var13 = class129.field2252.method1695((byte) 54);
            class129.field2252.method1706(10819);
            long var15 = class129.field2252.method1695((byte) 100);
            long var17 = (long) class129.field2252.method1740((byte) 75);
            long var19 = (long) class129.field2252.method1747(false);
            long var21 = (var17 << 32) + var19;
            int var23 = class129.field2252.method1693((byte) 36);
            int var24 = class129.field2252.method1740((byte) 127);
            boolean var25 = false;
            int var26 = 0;
            label1059: while (true) {
                if (var26 >= 100) {
                    if (var23 <= 1) {
                        for (int var27 = 0; var27 < class122.field2138; var27++) {
                            if (class160.field2846[var27] == var13) {
                                var25 = true;
                                break label1059;
                            }
                        }
                    }
                    break;
                }
                if (class199.field3468[var26] == var21) {
                    var25 = true;
                    break;
                }
                var26++;
            }
            if (!var25 && class174.field3074 == 0) {
                class199.field3468[class74.field1246] = var21;
                class74.field1246 = (class74.field1246 + 1) % 100;
                class99 var28 = class108.method745(var24, true).method419(60, class129.field2252);
                if (var23 == 2 || var23 == 3) {
                    class271.method1795(var24, -84, class156.method1069(arg0 ^ 0x6A, var15).method690(127), var28, 20, class198.method1332(64, new class99[] { class46.field778, class156.method1069(-81, var13).method690(77) }));
                } else if (var23 == 1) {
                    class271.method1795(var24, 63, class156.method1069(-116, var15).method690(124), var28, 20, class198.method1332(76, new class99[] { class57.field964, class156.method1069(-80, var13).method690(77) }));
                } else {
                    class271.method1795(var24, arg0 ^ 0xFFFFFFBE, class156.method1069(-97, var15).method690(88), var28, 20, class156.method1069(-119, var13).method690(arg0 + 103));
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 179) {
            int var29 = class129.field2252.method1740((byte) 59);
            class99 var30 = class129.field2252.method1705(arg0 + 125);
            Object[] var31 = new Object[var30.method659(79) + 1];
            for (int var32 = var30.method659(arg0 - 49) - 1; var32 >= 0; var32--) {
                if (var30.method655(var32, (byte) -94) == 115) {
                    var31[var32 + 1] = class129.field2252.method1705(-59);
                } else {
                    var31[var32 + 1] = Integer.valueOf(class129.field2252.method1712(-4));
                }
            }
            var31[0] = Integer.valueOf(class129.field2252.method1712(arg0 - 3));
            if (class251.method1625(0, var29)) {
                class260 var33 = new class260();
                var33.field4543 = var31;
                class56.method385(200000, var33);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 207) {
            class199.method1336(false);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 42) {
            int var34 = class129.field2252.method1727(4);
            int var35 = class129.field2252.method1713((byte) 28);
            if (class251.method1625(0, var35)) {
                int var36 = 0;
                if (class168.field3006.field3250 != null) {
                    var36 = class168.field3006.field3250.method240((byte) -76);
                }
                class11.method73(-7, 3, var34, var36);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 63) {
            int var37 = class129.field2252.method1693((byte) -118);
            if (class129.field2252.method1693((byte) 103) == 0) {
                class52.field852[var37] = new class224();
            } else {
                class129.field2252.field4587--;
                class52.field852[var37] = new class224(class129.field2252);
            }
            class88.field1519 = class28.field514;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 37) {
            int var38 = class129.field2252.method1730((byte) -77);
            int var39 = class129.field2252.method1740((byte) 112);
            int var40 = class129.field2252.method1740((byte) 57);
            if (class251.method1625(0, var40)) {
                class144.method981(var39, var38, -128);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 47) {
            int var41 = class129.field2252.method1693((byte) -127);
            int var42 = class129.field2252.method1693((byte) 59);
            int var43 = class129.field2252.method1693((byte) -83);
            int var44 = class129.field2252.method1693((byte) -124);
            int var45 = class129.field2252.method1740((byte) 123);
            class197.field3426[var41] = true;
            class130.field2269[var41] = var42;
            class22.field262[var41] = var43;
            class237.field4107[var41] = var44;
            class197.field3430[var41] = var45;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 45) {
            int var46 = class129.field2252.method1740((byte) 107);
            int var47 = class129.field2252.method1730((byte) -128);
            int var48 = class129.field2252.method1740((byte) 122);
            if (class251.method1625(0, var46)) {
                class172.method1160(var48, -88, var47);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 104) {
            int var49 = class129.field2252.method1740((byte) 89);
            int var50 = class129.field2252.method1693((byte) -87);
            if (var49 == 65535) {
                var49 = -1;
            }
            int var51 = class129.field2252.method1740((byte) 84);
            class169.method1145(var51, 25112, var50, var49);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 137) {
            int var52 = class129.field2252.method1730((byte) -96);
            int var53 = class129.field2252.method1740((byte) 114);
            int var54 = class129.field2252.method1740((byte) 57);
            if (class251.method1625(0, var54)) {
                class249.method1611(var53, var52, -89);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 34) {
            int var55 = class129.field2252.method1712(-4);
            int var56 = class129.field2252.method1740((byte) 79);
            class107 var57;
            if (var55 < 0) {
                var57 = null;
            } else {
                var57 = class22.method131(var55, arg0 ^ 0xA446AD0F);
            }
            if (var55 < -70000) {
                var56 += 32768;
            }
            if (var57 != null) {
                for (int var58 = 0; var58 < var57.field1805.length; var58++) {
                    var57.field1805[var58] = 0;
                    var57.field1923[var58] = 0;
                }
            }
            class181.method1211(-1, var56);
            int var59 = class129.field2252.method1740((byte) 103);
            for (int var60 = 0; var60 < var59; var60++) {
                int var61 = class129.field2252.method1694(0);
                if (var61 == 255) {
                    var61 = class129.field2252.method1739(-5865);
                }
                int var62 = class129.field2252.method1729((byte) 10);
                if (var57 != null && var60 < var57.field1805.length) {
                    var57.field1805[var60] = var62;
                    var57.field1923[var60] = var61;
                }
                class60.method405(var61, var60, var56, var62 - 1, -7757);
            }
            if (var57 != null) {
                class238.method1555(var57, 10555);
            }
            class153.method1018((byte) 42);
            class137.field2423[class71.method502(class191.field3367++, 31)] = class71.method502(var56, 32767);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 220) {
            field625 = class129.field2252.method1693((byte) -117);
            class254.field4391 = class129.field2252.method1693((byte) 119);
            class112.field2023 = class129.field2252.method1693((byte) 113);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 206) {
            long var63 = class129.field2252.method1695((byte) 51);
            long var65 = (long) class129.field2252.method1740((byte) 62);
            long var67 = (long) class129.field2252.method1747(false);
            int var69 = class129.field2252.method1693((byte) 103);
            long var70 = (var65 << 32) + var67;
            boolean var72 = false;
            int var73 = 0;
            label1097: while (true) {
                if (var73 >= 100) {
                    if (var69 <= 1) {
                        if ((!class74.field1258 || class105.field1763) && !class138.field2425) {
                            for (int var74 = 0; var74 < class122.field2138; var74++) {
                                if (class160.field2846[var74] == var63) {
                                    var72 = true;
                                    break label1097;
                                }
                            }
                        } else {
                            var72 = true;
                        }
                    }
                    break;
                }
                if (class199.field3468[var73] == var70) {
                    var72 = true;
                    break;
                }
                var73++;
            }
            if (!var72 && class174.field3074 == 0) {
                class199.field3468[class74.field1246] = var70;
                class74.field1246 = (class74.field1246 + 1) % 100;
                class99 var75 = class70.method472(class180.method1205(class129.field2252, 32767).method700(false));
                if (var69 == 2 || var69 == 3) {
                    class259.method1678(class198.method1332(arg0 ^ 0xFFFFFF9B, new class99[] { class46.field778, class156.method1069(arg0 - 112, var63).method690(97) }), var75, (byte) -126, 7);
                } else if (var69 == 1) {
                    class259.method1678(class198.method1332(arg0 ^ 0xFFFFFFB9, new class99[] { class57.field964, class156.method1069(-118, var63).method690(113) }), var75, (byte) -126, 7);
                } else {
                    class259.method1678(class156.method1069(-104, var63).method690(arg0 ^ 0xFFFFFFAF), var75, (byte) -126, 3);
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 21) {
            int var76 = class129.field2252.method1740((byte) 52);
            int var77 = class129.field2252.method1693((byte) -118);
            int var78 = class129.field2252.method1713((byte) 28);
            class156 var79 = class248.field4287[var78];
            if (var79 != null) {
                class25.method194(var79, 122, var77, var76);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 7) {
            int var80 = class129.field2252.method1740((byte) 125);
            int var81 = class129.field2252.method1740((byte) 108);
            int var82 = class129.field2252.method1694(0);
            if (class251.method1625(0, var80)) {
                class172.method1160(var81, arg0 + 78, var82);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 156) {
            int var83 = class129.field2252.method1730((byte) 77);
            int var84 = class129.field2252.method1714(-1640531527);
            int var85 = class129.field2252.method1740((byte) 86);
            int var86 = class129.field2252.method1740((byte) 58);
            if (class251.method1625(arg0 + 1, var86)) {
                class2 var87 = (class2) class57.field959.method1550(true, (long) var83);
                if (var87 != null) {
                    class210.method1410(var87.field12 != var85, (byte) 59, var87);
                }
                class277.method1831(arg0 ^ 0x52C5, var84, var85, var83);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 31) {
            long var88 = class129.field2252.method1695((byte) 90);
            int var90 = class129.field2252.method1740((byte) 65);
            class99 var91 = class108.method745(var90, true).method419(arg0 ^ 0xFFFFFFC3, class129.field2252);
            class271.method1795(var90, -69, (class99) null, var91, 19, class156.method1069(-124, var88).method690(64));
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 106) {
            class194.method1311(-10338);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 197) {
            int var92 = class129.field2252.method1748(16711680);
            class99 var93 = class129.field2252.method1705(120);
            int var94 = class129.field2252.method1748(16711680);
            if (var94 >= 1 && var94 <= 8) {
                if (var93.method706(field629, 115)) {
                    var93 = null;
                }
                class183.field3227[var94 - 1] = var93;
                class54.field897[var94 - 1] = var92 == 0;
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 155) {
            class216.method1443(true, class129.field2252);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 122) {
            class122.field2138 = class180.field3146 / 8;
            for (int var95 = 0; var95 < class122.field2138; var95++) {
                class160.field2846[var95] = class129.field2252.method1695((byte) 113);
                class218.field3795[var95] = class156.method1069(class28.method249(arg0, 108), class160.field2846[var95]);
            }
            class290.field5084 = class28.field514;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 236) {
            class153.method1018((byte) 32);
            class65.field1087 = class129.field2252.method1751(128);
            class21.field244 = class28.field514;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 103) {
            int var96 = class129.field2252.method1712(-4);
            class101.field1725 = class24.field368.method599(var96, true);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 87) {
            int var97 = class129.field2252.method1693((byte) -106);
            int var98 = class129.field2252.method1693((byte) -85);
            int var99 = class129.field2252.method1740((byte) 75);
            int var100 = class129.field2252.method1693((byte) -92);
            int var101 = class129.field2252.method1693((byte) 51);
            class13.method90(var100, var98, var99, true, var101, false, var97);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 27) {
            class99 var102 = class129.field2252.method1705(122);
            int var103 = class129.field2252.method1692(91);
            int var104 = class129.field2252.method1692(-87);
            if (class251.method1625(0, var103)) {
                class30.method254(var104, var102, false);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 95) {
            class99 var105 = class129.field2252.method1705(arg0 + 4);
            if (var105.method676((byte) -68, class259.field4512)) {
                boolean var141 = false;
                class99 var142 = var105.method693(var105.method702(arg0 + 9597, class90.field1541), arg0 ^ 0xFFFFFF00, 0);
                long var143 = var142.method697(-23666);
                for (int var145 = 0; var145 < class122.field2138; var145++) {
                    if (class160.field2846[var145] == var143) {
                        var141 = true;
                        break;
                    }
                }
                if (!var141 && class174.field3074 == 0) {
                    class259.method1678(var142, class110.field1967, (byte) -126, 4);
                }
            } else if (var105.method676((byte) -76, class177.field3094)) {
                class99 var106 = var105.method693(var105.method702(9596, class90.field1541), 255, 0);
                long var107 = var106.method697(-23666);
                boolean var109 = false;
                for (int var110 = 0; var110 < class122.field2138; var110++) {
                    if (class160.field2846[var110] == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (!var109 && class174.field3074 == 0) {
                    class99 var111 = var105.method693(var105.method659(arg0 - 40) - 9, 255, var105.method702(9596, class90.field1541) + 1);
                    class259.method1678(var106, var111, (byte) -126, 8);
                }
            } else if (var105.method676((byte) -100, class170.field3028)) {
                class99 var112 = var105.method693(var105.method702(9596, class90.field1541), arg0 + 256, 0);
                boolean var113 = false;
                long var114 = var112.method697(arg0 - 23665);
                for (int var116 = 0; var116 < class122.field2138; var116++) {
                    if (class160.field2846[var116] == var114) {
                        var113 = true;
                        break;
                    }
                }
                if (!var113 && class174.field3074 == 0) {
                    class259.method1678(var112, class20.field234, (byte) -126, 10);
                }
            } else if (var105.method676((byte) -74, class62.field1042)) {
                class99 var140 = var105.method693(var105.method702(9596, class62.field1042), arg0 + 256, 0);
                class259.method1678(class20.field234, var140, (byte) -126, 11);
            } else if (var105.method676((byte) -85, class132.field2313)) {
                class99 var139 = var105.method693(var105.method702(9596, class132.field2313), arg0 + 256, 0);
                if (class174.field3074 == 0) {
                    class259.method1678(class20.field234, var139, (byte) -126, 12);
                }
            } else if (var105.method676((byte) -54, class245.field4227)) {
                class99 var117 = var105.method693(var105.method702(9596, class245.field4227), 255, 0);
                if (class174.field3074 == 0) {
                    class259.method1678(class20.field234, var117, (byte) -126, 13);
                }
            } else if (var105.method676((byte) -126, class185.field3279)) {
                class99 var118 = var105.method693(var105.method702(arg0 ^ 0xFFFFDA83, class90.field1541), 255, 0);
                long var119 = var118.method697(-23666);
                boolean var121 = false;
                for (int var122 = 0; var122 < class122.field2138; var122++) {
                    if (class160.field2846[var122] == var119) {
                        var121 = true;
                        break;
                    }
                }
                if (!var121 && class174.field3074 == 0) {
                    class259.method1678(var118, class20.field234, (byte) -126, 14);
                }
            } else if (var105.method676((byte) -124, class278.field4880)) {
                class99 var123 = var105.method693(var105.method702(9596, class90.field1541), arg0 ^ 0xFFFFFF00, 0);
                long var124 = var123.method697(-23666);
                boolean var126 = false;
                for (int var127 = 0; var127 < class122.field2138; var127++) {
                    if (class160.field2846[var127] == var124) {
                        var126 = true;
                        break;
                    }
                }
                if (!var126 && class174.field3074 == 0) {
                    class259.method1678(var123, class20.field234, (byte) -126, 15);
                }
            } else if (var105.method676((byte) -113, class247.field4247)) {
                class99 var134 = var105.method693(var105.method702(9596, class90.field1541), 255, 0);
                long var135 = var134.method697(arg0 - 23665);
                boolean var137 = false;
                for (int var138 = 0; var138 < class122.field2138; var138++) {
                    if (class160.field2846[var138] == var135) {
                        var137 = true;
                        break;
                    }
                }
                if (!var137 && class174.field3074 == 0) {
                    class259.method1678(var134, class20.field234, (byte) -126, 16);
                }
            } else if (var105.method676((byte) -123, class214.field3724)) {
                boolean var128 = false;
                class99 var129 = var105.method693(var105.method702(9596, class90.field1541), 255, 0);
                long var130 = var129.method697(-23666);
                for (int var132 = 0; var132 < class122.field2138; var132++) {
                    if (class160.field2846[var132] == var130) {
                        var128 = true;
                        break;
                    }
                }
                if (!var128 && class174.field3074 == 0) {
                    class99 var133 = var105.method693(var105.method659(125) - 9, arg0 + 256, var105.method702(9596, class90.field1541) + 1);
                    class259.method1678(var129, var133, (byte) -126, 21);
                }
            } else {
                class259.method1678(class20.field234, var105, (byte) -126, 0);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 187) {
            int var146 = class129.field2252.method1713((byte) 28);
            int var147 = class129.field2252.method1727(4);
            int var148 = class129.field2252.method1692(92);
            int var149 = class129.field2252.method1740((byte) 102);
            if (class251.method1625(0, var146)) {
                class259.method1687(var147, (var149 << 16) + var148, (byte) 73);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 105) {
            int var150 = class129.field2252.method1693((byte) 29);
            int var151 = class129.field2252.method1713((byte) 28);
            class32.method264(var151, 0, var150);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 22) {
            int var152 = class129.field2252.method1729((byte) 123);
            if (var152 == 65535) {
                var152 = -1;
            }
            int var153 = class129.field2252.method1712(-4);
            int var154 = class129.field2252.method1739(-5865);
            int var155 = class129.field2252.method1713((byte) 28);
            if (var155 == 65535) {
                var155 = -1;
            }
            int var156 = class129.field2252.method1729((byte) 31);
            if (class251.method1625(0, var156)) {
                for (int var157 = var152; var157 <= var155; var157++) {
                    long var158 = ((long) var153 << 32) + (long) var157;
                    class125 var160 = class139.field2454.method1550(true, var158);
                    if (var160 != null) {
                        var160.method828((byte) 124);
                    }
                    class139.field2454.method1544((byte) 118, var158, new class208(var154));
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 189 || class212.field3669 == 18 || class212.field3669 == 61 || class212.field3669 == 43 || class212.field3669 == 114 || class212.field3669 == 67 || class212.field3669 == 230 || class212.field3669 == 68 || class212.field3669 == 102 || class212.field3669 == 124 || class212.field3669 == 233 || class212.field3669 == 209) {
            class255.method1649((byte) 43);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 101) {
            class131.method863(class24.field368, -101, class180.field3146, class129.field2252);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 194) {
            int var161 = class129.field2252.method1713((byte) 28);
            class99 var162 = class129.field2252.method1705(arg0 ^ 0xFFFFFF87);
            int var163 = class129.field2252.method1740((byte) 122);
            if (class251.method1625(0, var163)) {
                class30.method254(var161, var162, false);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 183) {
            class96.field1624 = class28.field514;
            long var164 = class129.field2252.method1695((byte) 98);
            if (var164 == 0L) {
                class263.field4661 = null;
                class142.field2503 = 0;
                class212.field3669 = -1;
                class146.field2586 = null;
                class56.field917 = null;
                return true;
            }
            long var166 = class129.field2252.method1695((byte) 67);
            class263.field4661 = class156.method1069(-115, var166);
            class146.field2586 = class156.method1069(-101, var164);
            class220.field3822 = class129.field2252.method1706(10819);
            int var168 = class129.field2252.method1693((byte) 105);
            if (var168 == 255) {
                class212.field3669 = -1;
                return true;
            }
            class142.field2503 = var168;
            class86[] var169 = new class86[100];
            for (int var170 = 0; var170 < class142.field2503; var170++) {
                var169[var170] = new class86();
                var169[var170].field2187 = class129.field2252.method1695((byte) 42);
                var169[var170].field1480 = class156.method1069(-120, var169[var170].field2187);
                var169[var170].field1491 = class129.field2252.method1740((byte) 79);
                var169[var170].field1485 = class129.field2252.method1706(10819);
                var169[var170].field1479 = class129.field2252.method1705(117);
                if (class86.field1486 == var169[var170].field2187) {
                    class58.field979 = var169[var170].field1485;
                }
            }
            boolean var171 = false;
            int var172 = class142.field2503;
            while (var172 > 0) {
                boolean var173 = true;
                var172--;
                for (int var174 = 0; var174 < var172; var174++) {
                    if (var169[var174].field1480.method673((byte) -104, var169[var174 + 1].field1480) > 0) {
                        var173 = false;
                        class86 var175 = var169[var174];
                        var169[var174] = var169[var174 + 1];
                        var169[var174 + 1] = var175;
                    }
                }
                if (var173) {
                    break;
                }
            }
            class212.field3669 = -1;
            class56.field917 = var169;
            return true;
        } else if (class212.field3669 == 13) {
            int var176 = class129.field2252.method1693((byte) -122);
            int var177 = var176 >> 6;
            class284 var178 = new class284();
            var178.field4944 = var176 & 0x3F;
            var178.field4947 = class129.field2252.method1693((byte) -95);
            if (var178.field4947 >= 0 && var178.field4947 < class53.field872.length) {
                if (var178.field4944 == 1 || var178.field4944 == 10) {
                    var178.field4949 = class129.field2252.method1740((byte) 88);
                    class129.field2252.field4587 += 3;
                } else if (var178.field4944 >= 2 && var178.field4944 <= 6) {
                    if (var178.field4944 == 2) {
                        var178.field4932 = 64;
                        var178.field4939 = 64;
                    }
                    if (var178.field4944 == 3) {
                        var178.field4932 = 0;
                        var178.field4939 = 64;
                    }
                    if (var178.field4944 == 4) {
                        var178.field4932 = 128;
                        var178.field4939 = 64;
                    }
                    if (var178.field4944 == 5) {
                        var178.field4939 = 0;
                        var178.field4932 = 64;
                    }
                    if (var178.field4944 == 6) {
                        var178.field4939 = 128;
                        var178.field4932 = 64;
                    }
                    var178.field4944 = 2;
                    var178.field4936 = class129.field2252.method1740((byte) 97);
                    var178.field4948 = class129.field2252.method1740((byte) 119);
                    var178.field4946 = class129.field2252.method1693((byte) -93);
                }
                var178.field4941 = class129.field2252.method1740((byte) 73);
                if (var178.field4941 == 65535) {
                    var178.field4941 = -1;
                }
                class284.field4935[var177] = var178;
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 253) {
            int var179 = class129.field2252.method1729((byte) 116);
            class22.method129(var179, -6);
            class137.field2423[class71.method502(31, class191.field3367++)] = class71.method502(32767, var179);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 143) {
            if (class180.field3146 == 0) {
                class44.field776 = class168.field2999;
            } else {
                class44.field776 = class129.field2252.method1705(arg0 + 23);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 142) {
            int var180 = class129.field2252.method1692(-118);
            int var181 = class129.field2252.method1694(0);
            int var182 = class129.field2252.method1713((byte) 28);
            if (class251.method1625(arg0 + 1, var182)) {
                if (var181 == 2) {
                    class163.method1104(-12101);
                }
                class9.field75 = var180;
                class102.method717(13654, var180);
                class43.method326(-32039, false);
                class123.method814(class9.field75, 0);
                for (int var183 = 0; var183 < 100; var183++) {
                    class173.field3057[var183] = true;
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 229) {
            class198.method1331((byte) 13);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 213) {
            int var184 = class129.field2252.method1740((byte) 79);
            byte var185 = class129.field2252.method1722(0);
            class130.method858(var184, var185, arg0 + 97);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 242) {
            long var186 = class129.field2252.method1695((byte) 60);
            long var188 = (long) class129.field2252.method1740((byte) 102);
            long var190 = (long) class129.field2252.method1747(false);
            int var192 = class129.field2252.method1693((byte) 116);
            int var193 = class129.field2252.method1740((byte) 102);
            boolean var194 = false;
            long var195 = (var188 << 32) + var190;
            int var197 = 0;
            label1242: while (true) {
                if (var197 >= 100) {
                    if (var192 <= 1) {
                        for (int var198 = 0; var198 < class122.field2138; var198++) {
                            if (class160.field2846[var198] == var186) {
                                var194 = true;
                                break label1242;
                            }
                        }
                    }
                    break;
                }
                if (class199.field3468[var197] == var195) {
                    var194 = true;
                    break;
                }
                var197++;
            }
            if (!var194 && class174.field3074 == 0) {
                class199.field3468[class74.field1246] = var195;
                class74.field1246 = (class74.field1246 + 1) % 100;
                class99 var199 = class108.method745(var193, true).method419(60, class129.field2252);
                if (var192 == 2) {
                    class271.method1795(var193, -101, (class99) null, var199, 18, class198.method1332(51, new class99[] { class46.field778, class156.method1069(arg0 - 127, var186).method690(62) }));
                } else if (var192 == 1) {
                    class271.method1795(var193, 118, (class99) null, var199, 18, class198.method1332(arg0 + 72, new class99[] { class57.field964, class156.method1069(arg0 ^ 0x57, var186).method690(arg0 + 54) }));
                } else {
                    class271.method1795(var193, arg0 ^ 0x5E, (class99) null, var199, 18, class156.method1069(-91, var186).method690(82));
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 205) {
            class218.method1455(119, false);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 56) {
            int var200 = class129.field2252.method1740((byte) 81);
            int var201 = class129.field2252.method1713((byte) 28);
            int var202 = class129.field2252.method1727(4);
            int var203 = class129.field2252.method1729((byte) 118);
            if (var202 >> 30 != 0) {
                int var212 = var202 >> 28 & 0x3;
                int var213 = (var202 & 0x3FFF) - class215.field3731;
                int var214 = (var202 >> 14 & 0x3FFF) - class280.field4910;
                if (var214 >= 0 && var213 >= 0 && var214 < 104 && var213 < 104) {
                    int var215 = var214 * 128 + 64;
                    int var216 = var213 * 128 + 64;
                    class263 var217 = new class263(var203, var212, var215, var216, class115.method777(arg0, var216, var212, var215) - var201, var200, class56.field926);
                    class168.field2998.method536(new class215(var217), (byte) -72);
                }
            } else if (var202 >> 29 != 0) {
                int var208 = var202 & 0xFFFF;
                class156 var209 = class248.field4287[var208];
                if (var209 != null) {
                    var209.field1312 = 0;
                    var209.field1277 = var201;
                    var209.field1262 = class56.field926 + var200;
                    var209.field1295 = 0;
                    var209.field1313 = var203;
                    if (var209.field1313 == 65535) {
                        var209.field1313 = -1;
                    }
                    if (var209.field1262 > class56.field926) {
                        var209.field1295 = -1;
                    }
                    if (var209.field1313 != -1 && class56.field926 == var209.field1262) {
                        int var210 = class90.method610(var209.field1313, true).field3137;
                        if (var210 != -1) {
                            class270 var211 = class38.method297(132, var210);
                            if (var211 != null && var211.field4740 != null) {
                                class250.method1621(var209.field1325, 0, var209.field1301, 65, false, var211);
                            }
                        }
                    }
                }
            } else if (var202 >> 28 != 0) {
                int var204 = var202 & 0xFFFF;
                class183 var205;
                if (class167.field2980 == var204) {
                    var205 = class168.field3006;
                } else {
                    var205 = class259.field4515[var204];
                }
                if (var205 != null) {
                    var205.field1295 = 0;
                    var205.field1277 = var201;
                    var205.field1262 = class56.field926 + var200;
                    var205.field1313 = var203;
                    var205.field1312 = 0;
                    if (var205.field1262 > class56.field926) {
                        var205.field1295 = -1;
                    }
                    if (var205.field1313 == 65535) {
                        var205.field1313 = -1;
                    }
                    if (var205.field1313 != -1 && class56.field926 == var205.field1262) {
                        int var206 = class90.method610(var205.field1313, true).field3137;
                        if (var206 != -1) {
                            class270 var207 = class38.method297(132, var206);
                            if (var207 != null && var207.field4740 != null) {
                                class250.method1621(var205.field1325, 0, var205.field1301, 44, class168.field3006 == var205, var207);
                            }
                        }
                    }
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 74) {
            int var218 = class129.field2252.method1730((byte) 76);
            int var219 = class129.field2252.method1740((byte) 93);
            int var220 = class129.field2252.method1740((byte) 76);
            if (var220 == 65535) {
                var220 = -1;
            }
            if (class251.method1625(0, var219)) {
                class11.method73(-7, 2, var218, var220);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 217) {
            class242.field4189 = class129.field2252.method1694(0);
            class58.field978 = class129.field2252.method1694(0);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 192) {
            int var221 = class129.field2252.method1727(arg0 ^ 0xFFFFFFFB);
            int var222 = class129.field2252.method1729((byte) -91);
            int var223 = class129.field2252.method1713((byte) 28);
            if (var222 == 65535) {
                var222 = -1;
            }
            if (class251.method1625(0, var223)) {
                class11.method73(arg0 ^ 0x6, 1, var221, var222);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 145) {
            class153.method1018((byte) -102);
            class34.field619 = class129.field2252.method1693((byte) 102);
            class21.field244 = class28.field514;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 24) {
            class218.method1455(116, true);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 16) {
            int var224 = class129.field2252.method1740((byte) 125);
            int var225 = class129.field2252.method1727(4);
            class32.method264(var224, arg0 + 1, var225);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 76) {
            int var226 = class129.field2252.method1740((byte) 104);
            int var227 = class129.field2252.method1712(-4);
            if (class251.method1625(0, var226)) {
                class2 var228 = (class2) class57.field959.method1550(true, (long) var227);
                if (var228 != null) {
                    class210.method1410(true, (byte) 76, var228);
                }
                if (class137.field2411 != null) {
                    class238.method1555(class137.field2411, arg0 ^ 0xFFFFD6C4);
                    class137.field2411 = null;
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 149) {
            int var229 = class129.field2252.method1730((byte) 88);
            int var230 = class129.field2252.method1692(-70);
            int var231 = class129.field2252.method1692(arg0 + 126);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var232 = class129.field2252.method1730((byte) -87);
            if (class251.method1625(0, var230)) {
                class107 var233 = class22.method131(var229, 1538872048);
                if (var233.field1915) {
                    class98.method654(116, var231, var232, var229);
                    class166 var235 = class222.method1468(1, var231);
                    class156.method1067((byte) -31, var229, var235.field2941, var235.field2945, var235.field2959);
                    class224.method1483(arg0 ^ 0xFFFFFF87, var229, var235.field2948, var235.field2956, var235.field2942);
                } else if (var231 == -1) {
                    var233.field1851 = 0;
                    class212.field3669 = -1;
                    return true;
                } else {
                    class166 var234 = class222.method1468(1, var231);
                    var233.field1867 = var234.field2945 * 100 / var232;
                    var233.field1781 = var234.field2941;
                    var233.field1939 = var231;
                    var233.field1788 = var234.field2959;
                    var233.field1851 = 4;
                    class238.method1555(var233, 10555);
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 175) {
            boolean var236 = false;
            long var237 = class129.field2252.method1695((byte) 106);
            if ((Long.MIN_VALUE & var237) != 0L) {
                var236 = true;
            }
            int var239 = class129.field2252.method1740((byte) 125);
            byte var240 = class129.field2252.method1706(10819);
            if (var236) {
                if (class142.field2503 == 0) {
                    class212.field3669 = -1;
                    return true;
                }
                long var241 = var237 & Long.MAX_VALUE;
                boolean var243 = false;
                int var244;
                for (var244 = 0; class142.field2503 > var244 && (class56.field917[var244].field2187 != var241 || class56.field917[var244].field1491 != var239); var244++) {
                }
                if (class142.field2503 > var244) {
                    while (class142.field2503 - 1 > var244) {
                        class56.field917[var244] = class56.field917[var244 + 1];
                        var244++;
                    }
                    class142.field2503--;
                    class56.field917[class142.field2503] = null;
                }
            } else {
                class99 var245 = class129.field2252.method1705(-108);
                class86 var246 = new class86();
                var246.field2187 = var237;
                var246.field1480 = class156.method1069(arg0 - 106, var246.field2187);
                var246.field1479 = var245;
                var246.field1485 = var240;
                var246.field1491 = var239;
                int var247;
                for (var247 = class142.field2503 - 1; var247 >= 0; var247--) {
                    int var248 = class56.field917[var247].field1480.method673((byte) -107, var246.field1480);
                    if (var248 == 0) {
                        class56.field917[var247].field1491 = var239;
                        class56.field917[var247].field1485 = var240;
                        class56.field917[var247].field1479 = var245;
                        class212.field3669 = -1;
                        class96.field1624 = class28.field514;
                        if (class86.field1486 == var237) {
                            class58.field979 = var240;
                        }
                        return true;
                    }
                    if (var248 < 0) {
                        break;
                    }
                }
                if (class142.field2503 >= class56.field917.length) {
                    class212.field3669 = -1;
                    return true;
                }
                for (int var249 = class142.field2503 - 1; var249 > var247; var249--) {
                    class56.field917[var249 + 1] = class56.field917[var249];
                }
                if (class142.field2503 == 0) {
                    class56.field917 = new class86[100];
                }
                class56.field917[var247 + 1] = var246;
                if (class86.field1486 == var237) {
                    class58.field979 = var240;
                }
                class142.field2503++;
            }
            class96.field1624 = class28.field514;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 228) {
            int var250 = class129.field2252.method1740((byte) 89);
            int var251 = class129.field2252.method1712(-4);
            int var252 = class129.field2252.method1746(-116);
            if (class251.method1625(0, var250)) {
                class33.method272((byte) 24, var252, var251);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 238) {
            class57.field943 = class129.field2252.method1693((byte) -125);
            class212.field3669 = -1;
            class290.field5084 = class28.field514;
            return true;
        } else if (class212.field3669 == 99) {
            int var253 = class129.field2252.method1694(0);
            int var254 = var253 >> 2;
            int var255 = var253 & 0x3;
            int var256 = class237.field4105[var254];
            int var257 = class129.field2252.method1739(-5865);
            int var258 = var257 >> 14 & 0x3FFF;
            int var259 = var257 >> 28 & 0x3;
            int var260 = var257 & 0x3FFF;
            int var261 = class129.field2252.method1740((byte) 91);
            if (var261 == 65535) {
                var261 = -1;
            }
            int var262 = var260 - class215.field3731;
            int var263 = var258 - class280.field4910;
            class105.method724(var254, arg0 ^ 0x50, var255, var262, var259, var263, var261, var256);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 186) {
            class116.method784((byte) 12);
            class212.field3669 = -1;
            return false;
        } else if (class212.field3669 == 89) {
            int var264 = class129.field2252.method1692(-29);
            if (var264 == 65535) {
                var264 = -1;
            }
            class207.method1386(var264, 114);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 49) {
            int var265 = class129.field2252.method1715(23943);
            int var266 = class129.field2252.method1740((byte) 68);
            if (var266 == 65535) {
                var266 = -1;
            }
            class181.method1210((byte) -3, var265, var266);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 65) {
            long var267 = class129.field2252.method1695((byte) 101);
            class129.field2252.method1706(arg0 ^ 0xFFFFD5BC);
            long var269 = class129.field2252.method1695((byte) 77);
            long var271 = (long) class129.field2252.method1740((byte) 52);
            long var273 = (long) class129.field2252.method1747(false);
            int var275 = class129.field2252.method1693((byte) -97);
            boolean var276 = false;
            long var277 = (var271 << 32) + var273;
            int var279 = 0;
            label1311: while (true) {
                if (var279 >= 100) {
                    if (var275 <= 1) {
                        if ((!class74.field1258 || class105.field1763) && !class138.field2425) {
                            for (int var280 = 0; var280 < class122.field2138; var280++) {
                                if (class160.field2846[var280] == var267) {
                                    var276 = true;
                                    break label1311;
                                }
                            }
                        } else {
                            var276 = true;
                        }
                    }
                    break;
                }
                if (class199.field3468[var279] == var277) {
                    var276 = true;
                    break;
                }
                var279++;
            }
            if (!var276 && class174.field3074 == 0) {
                class199.field3468[class74.field1246] = var277;
                class74.field1246 = (class74.field1246 + 1) % 100;
                class99 var281 = class70.method472(class180.method1205(class129.field2252, 32767).method700(false));
                if (var275 == 2 || var275 == 3) {
                    class145.method991(9, arg0 ^ 0x404A, class198.method1332(54, new class99[] { class46.field778, class156.method1069(-82, var267).method690(arg0 ^ 0xFFFFFF82) }), class156.method1069(arg0 - 109, var269).method690(57), var281);
                } else if (var275 == 1) {
                    class145.method991(9, arg0 ^ 0x404A, class198.method1332(103, new class99[] { class57.field964, class156.method1069(-106, var267).method690(62) }), class156.method1069(-81, var269).method690(88), var281);
                } else {
                    class145.method991(9, -16459, class156.method1069(-88, var267).method690(arg0 ^ -67), class156.method1069(-84, var269).method690(67), var281);
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 41) {
            int var282 = class129.field2252.method1727(4);
            class107 var283 = class22.method131(var282, arg0 ^ 0xA446AD0F);
            for (int var284 = 0; var284 < var283.field1805.length; var284++) {
                var283.field1805[var284] = -1;
                var283.field1805[var284] = 0;
            }
            class238.method1555(var283, 10555);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 151) {
            class18.field195 = 0;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 239) {
            int var285 = class129.field2252.method1693((byte) 79);
            int var286 = class129.field2252.method1693((byte) -116);
            int var287 = class129.field2252.method1740((byte) 108);
            int var288 = class129.field2252.method1693((byte) -96);
            int var289 = class129.field2252.method1693((byte) 68);
            class18.method108(var287, true, var286, var289, var288, var285);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 54) {
            class153.method1018((byte) 116);
            int var290 = class129.field2252.method1693((byte) -86);
            int var291 = class129.field2252.method1730((byte) -127);
            int var292 = class129.field2252.method1714(arg0 - 1640531526);
            class277.field4875[var290] = var291;
            class149.field2625[var290] = var292;
            class290.field5093[var290] = 1;
            for (int var293 = 0; var293 < 98; var293++) {
                if (var291 >= class288.field5053[var293]) {
                    class290.field5093[var290] = var293 + 2;
                }
            }
            class86.field1483[class71.method502(31, class234.field4028++)] = var290;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 251) {
            for (int var294 = 0; var294 < class259.field4515.length; var294++) {
                if (class259.field4515[var294] != null) {
                    class259.field4515[var294].field1284 = -1;
                }
            }
            for (int var295 = 0; var295 < class248.field4287.length; var295++) {
                if (class248.field4287[var295] != null) {
                    class248.field4287[var295].field1284 = -1;
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 115) {
            int var296 = class129.field2252.method1692(-107);
            int var297 = class129.field2252.method1692(110);
            int var298 = class129.field2252.method1727(arg0 + 5);
            int var299 = class129.field2252.method1692(105);
            int var300 = class129.field2252.method1729((byte) 126);
            if (class251.method1625(arg0 + 1, var296)) {
                class156.method1067((byte) -31, var298, var299, var297, var300);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 139) {
            int var301 = class129.field2252.method1729((byte) 110);
            int var302 = class129.field2252.method1729((byte) 116);
            int var303 = class129.field2252.method1739(-5865);
            int var304 = class129.field2252.method1729((byte) 127);
            if (class251.method1625(0, var302)) {
                class11.method73(-7, 7, var303, var301 | var304 << 16);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 235) {
            byte[] var305 = new byte[class180.field3146];
            class129.field2252.method967(class180.field3146, (byte) -79, 0, var305);
            class99 var306 = class205.method1379(0, class180.field3146, var305, (byte) 103);
            if (class75.field1281 == null && class87.field1494 == 3 || !class87.field1510.startsWith("win") || class63.field1073) {
                class177.method1185(true, var306, (byte) 125);
            } else {
                class261.field4585 = true;
                class193.field3401 = var306;
                class11.field96 = class24.field368.method587(new String(var306.method703((byte) 120), "ISO-8859-1"), arg0 ^ 0xFFFF85B1);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 100) {
            int var307 = class129.field2252.method1730((byte) 100);
            int var308 = class129.field2252.method1729((byte) 118);
            class130.method858(var308, var307, arg0 - 32);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 172) {
            if (class9.field75 != -1) {
                class220.method1460(0, (byte) 124, class9.field75);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 211) {
            long var309 = class129.field2252.method1695((byte) 79);
            class99 var311 = class70.method472(class180.method1205(class129.field2252, 32767).method700(false));
            class259.method1678(class156.method1069(-118, var309).method690(arg0 + 125), var311, (byte) -126, 6);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 64) {
            class218.method1452(-7434);
            class153.method1018((byte) -97);
            class211.field3663 += 32;
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 78) {
            int var312 = class129.field2252.method1712(-4);
            int var313 = class129.field2252.method1740((byte) 100);
            class107 var314;
            if (var312 >= 0) {
                var314 = class22.method131(var312, 1538872048);
            } else {
                var314 = null;
            }
            if (var312 < -70000) {
                var313 += 32768;
            }
            while (class180.field3146 > class129.field2252.field4587) {
                int var315 = class129.field2252.method1742(arg0 - 957401311);
                int var316 = class129.field2252.method1740((byte) 109);
                int var317 = 0;
                if (var316 != 0) {
                    var317 = class129.field2252.method1693((byte) 126);
                    if (var317 == 255) {
                        var317 = class129.field2252.method1712(-4);
                    }
                }
                if (var314 != null && var315 >= 0 && var314.field1805.length > var315) {
                    var314.field1805[var315] = var316;
                    var314.field1923[var315] = var317;
                }
                class60.method405(var317, var315, var313, var316 - 1, -7757);
            }
            if (var314 != null) {
                class238.method1555(var314, 10555);
            }
            class153.method1018((byte) -98);
            class137.field2423[class71.method502(31, class191.field3367++)] = class71.method502(32767, var313);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 28) {
            int var318 = class129.field2252.method1712(-4);
            int var319 = class129.field2252.method1729((byte) -73);
            int var320 = class129.field2252.method1727(4);
            if (class251.method1625(~arg0, var319)) {
                class2 var321 = (class2) class57.field959.method1550(true, (long) var318);
                class2 var322 = (class2) class57.field959.method1550(true, (long) var320);
                if (var322 != null) {
                    class210.method1410(var321 == null || var321.field12 != var322.field12, (byte) -81, var322);
                }
                if (var321 != null) {
                    var321.method828((byte) 121);
                    class57.field959.method1544((byte) 105, (long) var320, var321);
                }
                class107 var323 = class22.method131(var318, arg0 ^ 0xA446AD0F);
                if (var323 != null) {
                    class238.method1555(var323, 10555);
                }
                class107 var324 = class22.method131(var320, 1538872048);
                if (var324 != null) {
                    class238.method1555(var324, 10555);
                    class216.method1446(true, (byte) 84, var324);
                }
                if (class9.field75 != -1) {
                    class220.method1460(1, (byte) 118, class9.field75);
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 136) {
            class242.field4189 = class129.field2252.method1693((byte) -93);
            class58.field978 = class129.field2252.method1714(-1640531527);
            while (class129.field2252.field4587 < class180.field3146) {
                class212.field3669 = class129.field2252.method1693((byte) -118);
                class255.method1649((byte) 43);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 85) {
            for (int var325 = 0; var325 < class43.field733.length; var325++) {
                if (class43.field733[var325] != class209.field3613[var325]) {
                    class43.field733[var325] = class209.field3613[var325];
                    class127.method838(var325, -118);
                    class21.field239[class71.method502(31, class211.field3663++)] = var325;
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 44) {
            class105.field1761 = class129.field2252.method1693((byte) -108);
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 9) {
            int var326 = class129.field2252.method1711(-78);
            int var327 = class129.field2252.method1713((byte) 28);
            int var328 = class129.field2252.method1739(-5865);
            int var329 = class129.field2252.method1746(-120);
            if (class251.method1625(0, var327)) {
                class212.method1417((byte) -124, var329, var328, var326);
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 202) {
            long var330 = class129.field2252.method1695((byte) 30);
            int var332 = class129.field2252.method1740((byte) 123);
            int var333 = class129.field2252.method1693((byte) -120);
            boolean var334 = true;
            if (var330 < 0L) {
                var330 &= Long.MAX_VALUE;
                var334 = false;
            }
            class99 var335 = class20.field234;
            if (var332 > 0) {
                var335 = class129.field2252.method1705(arg0 + 124);
            }
            class99 var336 = class156.method1069(-116, var330).method690(arg0 + 93);
            for (int var337 = 0; var337 < class82.field1450; var337++) {
                if (class71.field1203[var337] == var330) {
                    if (class54.field891[var337] != var332) {
                        class54.field891[var337] = var332;
                        if (var332 > 0) {
                            class259.method1678(class20.field234, class198.method1332(67, new class99[] { var336, class65.field1105 }), (byte) -126, 5);
                        }
                        if (var332 == 0) {
                            class259.method1678(class20.field234, class198.method1332(60, new class99[] { var336, class221.field3848 }), (byte) -126, 5);
                        }
                    }
                    var336 = null;
                    class64.field1082[var337] = var335;
                    class269.field4735[var337] = var333;
                    class89.field1533[var337] = var334;
                    break;
                }
            }
            if (var336 != null && class82.field1450 < 200) {
                class71.field1203[class82.field1450] = var330;
                class57.field955[class82.field1450] = var336;
                class54.field891[class82.field1450] = var332;
                class64.field1082[class82.field1450] = var335;
                class269.field4735[class82.field1450] = var333;
                class89.field1533[class82.field1450] = var334;
                class82.field1450++;
            }
            class290.field5084 = class28.field514;
            boolean var338 = false;
            int var339 = class82.field1450;
            while (var339 > 0) {
                boolean var340 = true;
                var339--;
                for (int var341 = 0; var341 < var339; var341++) {
                    if (class54.field891[var341] != class33.field585 && class54.field891[var341 + 1] == class33.field585 || class54.field891[var341] == 0 && class54.field891[var341 + 1] != 0) {
                        var340 = false;
                        int var342 = class54.field891[var341];
                        class54.field891[var341] = class54.field891[var341 + 1];
                        class54.field891[var341 + 1] = var342;
                        class99 var343 = class64.field1082[var341];
                        class64.field1082[var341] = class64.field1082[var341 + 1];
                        class64.field1082[var341 + 1] = var343;
                        class99 var344 = class57.field955[var341];
                        class57.field955[var341] = class57.field955[var341 + 1];
                        class57.field955[var341 + 1] = var344;
                        long var345 = class71.field1203[var341];
                        class71.field1203[var341] = class71.field1203[var341 + 1];
                        class71.field1203[var341 + 1] = var345;
                        int var347 = class269.field4735[var341];
                        class269.field4735[var341] = class269.field4735[var341 + 1];
                        class269.field4735[var341 + 1] = var347;
                        boolean var348 = class89.field1533[var341];
                        class89.field1533[var341] = class89.field1533[var341 + 1];
                        class89.field1533[var341 + 1] = var348;
                    }
                }
                if (var340) {
                    break;
                }
            }
            class212.field3669 = -1;
            return true;
        } else if (class212.field3669 == 232) {
            class58.field978 = class129.field2252.method1694(0);
            class242.field4189 = class129.field2252.method1748(arg0 ^ 0xFF00FFFF);
            for (int var349 = class58.field978; var349 < class58.field978 + 8; var349++) {
                for (int var351 = class242.field4189; var351 < (class242.field4189 + 8); var351++) {
                    if (class32.field579[class255.field4407][var349][var351] != null) {
                        class32.field579[class255.field4407][var349][var351] = null;
                        class77.method542(var351, var349, (byte) -82);
                    }
                }
            }
            for (class288 var350 = (class288) class254.field4397.method529(arg0 ^ 0xFFFFFFF5); var350 != null; var350 = (class288) class254.field4397.method533(arg0 ^ 0x4A)) {
                if (class58.field978 <= var350.field5030 && var350.field5030 < (class58.field978 + 8) && var350.field5040 >= class242.field4189 && (class242.field4189 + 8) > var350.field5040 && class255.field4407 == var350.field5043) {
                    var350.field5049 = 0;
                }
            }
            class212.field3669 = -1;
            return true;
        } else {
            class196.method1315(false, (Throwable) null, "T1 - " + class212.field3669 + "," + class107.field1823 + "," + class238.field4112 + " - " + class180.field3146);
            class116.method784((byte) 12);
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method286(byte arg0) {
        field627 = null;
        field630 = null;
        if (arg0 != 79) {
            field625 = -60;
        }
        field629 = null;
    }
}
