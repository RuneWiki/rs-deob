import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class71 extends class106 {

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private int field1489 = -1;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    private int field1496 = 0;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Lfc;")
    public static class54 field1493 = new class54(64);

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Lrf;")
    public static class163 field1495 = class53.method392(-128, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[Lfi;")
    public static class60[] field1499 = new class60[6];

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lrf;")
    public static class163 field1498 = class53.method392(62, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lpf;")
    public static class145 field1500;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Lgg;")
    public static class67 field1497;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[Lig;IIIIII)V")
    public static final void method505(int arg0, int arg1, int arg2, class84[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1491++;
        class173.method1159(arg2, arg8, arg0, arg1);
        class1.method4();
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class84 var12 = arg3[var10];
            if (var12 != null && (var12.field1724 == arg9 || arg9 == -1412584499 && class118.field2492 == var12)) {
                int var13;
                if (arg7 == -1) {
                    class106.field2207[class48.field944] = var12.field1725 + arg4;
                    class99.field2092[class48.field944] = var12.field1744 + arg5;
                    class20.field351[class48.field944] = var12.field1746;
                    class161.field3258[class48.field944] = var12.field1815;
                    var13 = class48.field944++;
                } else {
                    var13 = arg7;
                }
                var12.field1720 = class51.field1023;
                var12.field1774 = var13;
                if (!var12.field1853 || !class191.method1288(var12, (byte) -97)) {
                    if (var12.field1830 > 0) {
                        class77.method534(var12, -78);
                    }
                    int var14 = var12.field1725 + arg4;
                    int var15 = var12.field1744 + arg5;
                    int var16 = var12.field1814;
                    if (class118.field2492 == var12) {
                        if (arg9 != -1412584499 && !var12.field1771) {
                            class92.field2005 = arg4;
                            class134.field2775 = arg3;
                            class102.field2129 = arg5;
                            continue;
                        }
                        if (!var12.field1771) {
                            var16 = 128;
                        }
                        if (class27.field490 && class52.field1087) {
                            int var17 = class22.field394;
                            int var18 = var17 - class162.field3291;
                            int var19 = class75.field1555;
                            int var20 = var19 - class133.field2769;
                            if (var18 < class142.field2918) {
                                var18 = class142.field2918;
                            }
                            if (var12.field1746 + var18 > class142.field2918 + class129.field2692.field1746) {
                                var18 = class142.field2918 + class129.field2692.field1746 - var12.field1746;
                            }
                            if (class88.field1908 > var20) {
                                var20 = class88.field1908;
                            }
                            var14 = var18;
                            if (var12.field1815 + var20 > class88.field1908 + class129.field2692.field1815) {
                                var20 = class88.field1908 + class129.field2692.field1815 - var12.field1815;
                            }
                            var15 = var20;
                        }
                    }
                    int var26;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field1755 == 2) {
                        var28 = arg8;
                        var30 = arg1;
                        var26 = arg2;
                        var29 = arg0;
                    } else if (var12.field1755 == 9) {
                        int var21 = var14;
                        int var22 = var12.field1746 + var14;
                        int var23 = var12.field1815 + var15;
                        if (var14 > var22) {
                            var21 = var22;
                            var22 = var14;
                        }
                        int var25 = var15;
                        var26 = arg2 >= var21 ? arg2 : var21;
                        if (var23 < var15) {
                            var25 = var23;
                            var23 = var15;
                        }
                        var22++;
                        var28 = var25 > arg8 ? var25 : arg8;
                        var23++;
                        var29 = var22 >= arg0 ? arg0 : var22;
                        var30 = var23 < arg1 ? var23 : arg1;
                    } else {
                        var26 = var14 > arg2 ? var14 : arg2;
                        var28 = arg8 >= var15 ? arg8 : var15;
                        int var31 = var12.field1746 + var14;
                        var29 = var31 < arg0 ? var31 : arg0;
                        int var32 = var12.field1815 + var15;
                        var30 = arg1 > var32 ? var32 : arg1;
                    }
                    if (!var12.field1853 || var29 > var26 && var28 < var30) {
                        if (var12.field1830 != 0) {
                            if (var12.field1830 == 1337) {
                                class166.field3383 = var15;
                                class189.field3752 = var14;
                                class195.method1298(var14, var12.field1815, var15, (byte) -123, var12.field1746);
                                class173.method1159(arg2, arg8, arg0, arg1);
                                continue;
                            }
                            if (var12.field1830 == 1338) {
                                if (var12.method594((byte) -122)) {
                                    class86.method606(var13, var15, var12, var14, 1);
                                    class173.method1159(arg2, arg8, arg0, arg1);
                                }
                                continue;
                            }
                            if (var12.field1830 == 1339) {
                                if (var12.method594((byte) -116)) {
                                    class143.method933(var15, 256, var13, var12, var14);
                                    class173.method1159(arg2, arg8, arg0, arg1);
                                }
                                continue;
                            }
                        }
                        int var33 = class22.field394;
                        int var34 = class75.field1555;
                        if (!class32.field638 && var33 >= var26 && var28 <= var34 && var29 > var33 && var30 > var34) {
                            class15.method99(var12, (byte) 117, var33 - var14, -var15 + var34);
                        }
                        if (var12.field1755 == 0) {
                            if (!var12.field1853 && class191.method1288(var12, (byte) -109) && class158.field3225 != var12) {
                                continue;
                            }
                            if (!var12.field1853) {
                                if (var12.field1747 > var12.field1777 - var12.field1815) {
                                    var12.field1747 = var12.field1777 - var12.field1815;
                                }
                                if (var12.field1747 < 0) {
                                    var12.field1747 = 0;
                                }
                            }
                            method505(var29, var30, var26, arg3, var14 - var12.field1781, -var12.field1747 + var15, -83, var13, var28, var12.field1782);
                            if (var12.field1804 != null) {
                                method505(var29, var30, var26, var12.field1804, var14 - var12.field1781, -var12.field1747 + var15, 67, var13, var28, var12.field1782);
                            }
                            class87 var35 = (class87) class138.field2847.method465((long) var12.field1782, (byte) 80);
                            if (var35 != null) {
                                if (var35.field1890 == 0 && class22.field394 >= var26 && var28 <= class75.field1555 && class22.field394 < var29 && class75.field1555 < var30 && !class32.field638 && !class135.field2791) {
                                    class21.field373[0] = 1004;
                                    class184.field3678 = 1;
                                    client.field610[0] = class75.field1559;
                                    class197.field3918[0] = class36.field728;
                                }
                                class150.method970((byte) 75, var30, var29, var15, var26, var28, var14, var13, var35.field1903);
                            }
                            class173.method1159(arg2, arg8, arg0, arg1);
                            class1.method4();
                        }
                        if (class186.field3712[var13] || class49.field953 > 1) {
                            if (var12.field1755 == 0 && !var12.field1853 && var12.field1777 > var12.field1815) {
                                class130.method862(var12.field1747, -4923, var12.field1815, var12.field1746 + var14, var12.field1777, var15);
                            }
                            if (var12.field1755 != 1) {
                                if (var12.field1755 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var12.field1815; var37++) {
                                        for (int var38 = 0; var38 < var12.field1746; var38++) {
                                            int var39 = var14 + (var12.field1793 + 32) * var38;
                                            int var40 = (var12.field1812 + 32) * var37 + var15;
                                            if (var36 < 20) {
                                                var40 += var12.field1752[var36];
                                                var39 += var12.field1791[var36];
                                            }
                                            if (var12.field1750[var36] > 0) {
                                                boolean var42 = false;
                                                boolean var43 = false;
                                                int var44 = var12.field1750[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg0 && arg8 < var40 + 32 && arg1 > var40 || class21.field378 == var12 && class161.field3259 == var36) {
                                                    class165 var45;
                                                    if (class62.field1326 == 1 && class9.field183 == var36 && class190.field3777 == var12.field1782) {
                                                        var45 = class209.method1364(var44, false, var12.field1766[var36], 111, 2, 0);
                                                    } else {
                                                        var45 = class209.method1364(var44, false, var12.field1766[var36], 110, 1, 3153952);
                                                    }
                                                    if (var45 == null) {
                                                        class194.method1295((byte) -118, var12);
                                                    } else if (class21.field378 == var12 && class161.field3259 == var36) {
                                                        int var46 = class75.field1555 - class84.field1847;
                                                        int var47 = class22.field394 - class151.field3112;
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class74.field1548 < 5) {
                                                            var47 = 0;
                                                            var46 = 0;
                                                        }
                                                        var45.method1124(var39 + var47, var40 + var46, 128);
                                                        if (arg9 != -1) {
                                                            class84 var48 = arg3[arg9 & 0xFFFF];
                                                            int var49 = class173.field3506;
                                                            int var50 = class173.field3501;
                                                            if (var49 > var40 + var46 && var48.field1747 > 0) {
                                                                int var51 = (var49 - var40 - var46) * class79.field1607 / 3;
                                                                if (class79.field1607 * 10 < var51) {
                                                                    var51 = class79.field1607 * 10;
                                                                }
                                                                if (var48.field1747 < var51) {
                                                                    var51 = var48.field1747;
                                                                }
                                                                class84.field1847 += var51;
                                                                var48.field1747 -= var51;
                                                                class194.method1295((byte) 76, var48);
                                                            }
                                                            if (var50 < var40 + var46 + 32 && var48.field1747 < var48.field1777 - var48.field1815) {
                                                                int var52 = (var40 + var46 + 32 - var50) * class79.field1607 / 3;
                                                                if (var52 > class79.field1607 * 10) {
                                                                    var52 = class79.field1607 * 10;
                                                                }
                                                                if (var52 > var48.field1777 - var48.field1815 - var48.field1747) {
                                                                    var52 = var48.field1777 - var48.field1815 - var48.field1747;
                                                                }
                                                                class84.field1847 -= var52;
                                                                var48.field1747 += var52;
                                                                class194.method1295((byte) -24, var48);
                                                            }
                                                        }
                                                    } else if (class128.field2631 == var12 && class75.field1573 == var36) {
                                                        var45.method1124(var39, var40, 128);
                                                    } else {
                                                        var45.method1106(var39, var40);
                                                    }
                                                }
                                            } else if (var12.field1842 != null && var36 < 20) {
                                                class165 var41 = var12.method596(var36, -87);
                                                if (var41 != null) {
                                                    var41.method1106(var39, var40);
                                                } else if (class97.field2073) {
                                                    class194.method1295((byte) 44, var12);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var12.field1755 == 3) {
                                    int var53;
                                    if (class97.method667(var12, (byte) 127)) {
                                        var53 = var12.field1818;
                                        if (class158.field3225 == var12 && var12.field1828 != 0) {
                                            var53 = var12.field1828;
                                        }
                                    } else {
                                        var53 = var12.field1829;
                                        if (class158.field3225 == var12 && var12.field1806 != 0) {
                                            var53 = var12.field1806;
                                        }
                                    }
                                    if (var16 == 0) {
                                        if (var12.field1783) {
                                            class173.method1173(var14, var15, var12.field1746, var12.field1815, var53);
                                        } else {
                                            class173.method1177(var14, var15, var12.field1746, var12.field1815, var53);
                                        }
                                    } else if (var12.field1783) {
                                        class173.method1171(var14, var15, var12.field1746, var12.field1815, var53, 256 - (var16 & 0xFF));
                                    } else {
                                        class173.method1168(var14, var15, var12.field1746, var12.field1815, var53, 256 - (var16 & 0xFF));
                                    }
                                } else if (var12.field1755 == 4) {
                                    class126 var54 = var12.method587((byte) -44, class133.field2771);
                                    if (var54 != null) {
                                        class163 var55 = var12.field1753;
                                        int var56;
                                        if (class97.method667(var12, (byte) 126)) {
                                            var56 = var12.field1818;
                                            if (class158.field3225 == var12 && var12.field1828 != 0) {
                                                var56 = var12.field1828;
                                            }
                                            if (var12.field1751.method1029(120) > 0) {
                                                var55 = var12.field1751;
                                            }
                                        } else {
                                            var56 = var12.field1829;
                                            if (class158.field3225 == var12 && var12.field1806 != 0) {
                                                var56 = var12.field1806;
                                            }
                                        }
                                        if (var12.field1853 && var12.field1821 != -1) {
                                            class4 var57 = class97.method669(-93, var12.field1821);
                                            var55 = var57.field62;
                                            if (var55 == null) {
                                                var55 = class87.field1902;
                                            }
                                            if ((var57.field87 == 1 || var12.field1790 != 1) && var12.field1790 != -1) {
                                                var55 = class180.method1216(new class163[] { class191.field3787, var55, class36.field671, class79.method541(13082, var12.field1790) }, false);
                                            }
                                        }
                                        if (class88.field1924 == var12) {
                                            var55 = class130.field2702;
                                            var56 = var12.field1829;
                                        }
                                        if (!var12.field1853) {
                                            var55 = class88.method615(var55, -9254, var12);
                                        }
                                        var54.method568(var55, var14, var15, var12.field1746, var12.field1815, var56, var12.field1809 ? 0 : -1, var12.field1860, var12.field1728, var12.field1836);
                                    } else if (class97.field2073) {
                                        class194.method1295((byte) -122, var12);
                                    }
                                } else if (var12.field1755 == 5) {
                                    if (var12.field1853) {
                                        class165 var58;
                                        if (var12.field1821 == -1) {
                                            var58 = var12.method591(false, -1);
                                        } else {
                                            var58 = class209.method1364(var12.field1821, false, var12.field1790, 100, var12.field1850, var12.field1796);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field3369;
                                            int var60 = var58.field3367;
                                            if (var12.field1713) {
                                                class173.method1172(var14, var15, var12.field1746 + var14, var12.field1815 + var15);
                                                int var62 = (var59 + var12.field1746 - 1) / var59;
                                                int var63 = (var60 + var12.field1815 - 1) / var60;
                                                for (int var64 = 0; var64 < var62; var64++) {
                                                    for (int var65 = 0; var65 < var63; var65++) {
                                                        if (var12.field1831 != 0) {
                                                            var58.method1103(var59 * var64 + var14 + var59 / 2, var60 * var65 + (var15 - -(var60 / 2)), var12.field1831, 4096);
                                                        } else if (var16 == 0) {
                                                            var58.method1106(var14 + var59 * var64, var60 * var65 + var15);
                                                        } else {
                                                            var58.method1124(var59 * var64 + var14, var60 * var65 + var15, 256 - (var16 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class173.method1159(arg2, arg8, arg0, arg1);
                                            } else {
                                                int var61 = var12.field1746 * 4096 / var59;
                                                if (var12.field1831 != 0) {
                                                    var58.method1103(var12.field1746 / 2 + var14, var12.field1815 / 2 + var15, var12.field1831, var61);
                                                } else if (var16 != 0) {
                                                    var58.method1121(var14, var15, var12.field1746, var12.field1815, 256 - (var16 & 0xFF));
                                                } else if (var12.field1746 == var59 && var12.field1815 == var60) {
                                                    var58.method1106(var14, var15);
                                                } else {
                                                    var58.method1105(var14, var15, var12.field1746, var12.field1815);
                                                }
                                            }
                                        } else if (class97.field2073) {
                                            class194.method1295((byte) -122, var12);
                                        }
                                    } else {
                                        class165 var66 = var12.method591(class97.method667(var12, (byte) 126), -1);
                                        if (var66 != null) {
                                            var66.method1106(var14, var15);
                                        } else if (class97.field2073) {
                                            class194.method1295((byte) 26, var12);
                                        }
                                    }
                                } else if (var12.field1755 == 6) {
                                    boolean var67 = class97.method667(var12, (byte) 127);
                                    int var68;
                                    if (var67) {
                                        var68 = var12.field1733;
                                    } else {
                                        var68 = var12.field1827;
                                    }
                                    class91 var69 = null;
                                    int var70 = 0;
                                    if (var12.field1821 != -1) {
                                        class4 var75 = class97.method669(-101, var12.field1821);
                                        if (var75 != null) {
                                            class4 var76 = var75.method41(var12.field1790, (byte) -114);
                                            var69 = var76.method34(null, 1, 0, (byte) -56);
                                            if (var69 == null) {
                                                class194.method1295((byte) -119, var12);
                                            } else {
                                                var69.method635();
                                                var70 = -var69.field3376 / 2;
                                            }
                                        }
                                    } else if (var12.field1816 == 5) {
                                        if (var12.field1787 == -1) {
                                            var69 = class108.field2241.method786(null, null, true, -1, -1);
                                        } else {
                                            int var72 = var12.field1787 & 0x7FF;
                                            if (class200.field3962 == var72) {
                                                var72 = 2047;
                                            }
                                            class38 var73 = class121.field2553[var72];
                                            class162 var74 = var68 == -1 ? null : class97.method668(var68, (byte) 44);
                                            if (var73 != null && (int) var73.field758.method1058(-114) << 11 == (var12.field1787 & 0xFFFFF800)) {
                                                var69 = var73.field795.method786(var74, null, true, var12.field1785, 0);
                                            }
                                        }
                                    } else if (var68 == -1) {
                                        var69 = var12.method595(75, -1, var67, null, class56.field1136.field795);
                                        if (var69 == null && class97.field2073) {
                                            class194.method1295((byte) 17, var12);
                                        }
                                    } else {
                                        class162 var71 = class97.method668(var68, (byte) 44);
                                        var69 = var12.method595(-113, var12.field1785, var67, var71, class56.field1136.field795);
                                        if (var69 == null && class97.field2073) {
                                            class194.method1295((byte) -126, var12);
                                        }
                                    }
                                    if (var69 != null) {
                                        class1.method16(var14 + var12.field1746 / 2 + var12.field1723, var12.field1815 / 2 + var12.field1763 + var15);
                                        int var77 = class1.field8[var12.field1742] * var12.field1802 >> 16;
                                        int var78 = class1.field21[var12.field1742] * var12.field1802 >> 16;
                                        if (!var12.field1853) {
                                            var69.method174(0, var12.field1739, 0, var12.field1742, 0, var78, var77);
                                        } else if (var12.field1772) {
                                            var69.method190(0, var12.field1739, var12.field1740, var12.field1742, var12.field1759, var78 + var12.field1788 + var70, var12.field1788 + var77, var12.field1802);
                                        } else {
                                            var69.method174(0, var12.field1739, var12.field1740, var12.field1742, var12.field1759, var70 + var78 + var12.field1788, var12.field1788 + var77);
                                        }
                                        class1.method8();
                                    }
                                } else {
                                    if (var12.field1755 == 7) {
                                        class126 var79 = var12.method587((byte) -67, class133.field2771);
                                        if (var79 == null) {
                                            if (class97.field2073) {
                                                class194.method1295((byte) 76, var12);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var12.field1815; var81++) {
                                            for (int var82 = 0; var82 < var12.field1746; var82++) {
                                                if (var12.field1750[var80] > 0) {
                                                    class4 var83 = class97.method669(-90, var12.field1750[var80] - 1);
                                                    class163 var84;
                                                    if (var83.field87 != 1 && var12.field1766[var80] == 1) {
                                                        var84 = class180.method1216(new class163[] { class191.field3787, var83.field62, class34.field667 }, false);
                                                    } else {
                                                        var84 = class180.method1216(new class163[] { class191.field3787, var83.field62, class36.field671, class79.method541(13082, var12.field1766[var80]) }, false);
                                                    }
                                                    int var85 = (var12.field1793 + 115) * var82 + var14;
                                                    int var86 = var15 + (var12.field1812 + 12) * var81;
                                                    if (var12.field1860 == 0) {
                                                        var79.method577(var84, var85, var86, var12.field1829, var12.field1809 ? 0 : -1);
                                                    } else if (var12.field1860 == 1) {
                                                        var79.method583(var84, var12.field1746 / 2 + var85, var86, var12.field1829, var12.field1809 ? 0 : -1);
                                                    } else {
                                                        var79.method573(var84, var85 + var12.field1746 - 1, var86, var12.field1829, var12.field1809 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var12.field1755 == 8 && class115.field2433 == var12 && class143.field2953 == class136.field2806) {
                                        int var87 = 0;
                                        class126 var88 = class121.field2556;
                                        int var89 = 0;
                                        class163 var90 = var12.field1753;
                                        class163 var91 = class88.method615(var90, -9254, var12);
                                        while (var91.method1029(123) > 0) {
                                            int var99 = var91.method1035(true, class109.field2274);
                                            class163 var100;
                                            if (var99 == -1) {
                                                var100 = var91;
                                                var91 = class36.field728;
                                            } else {
                                                var100 = var91.method1036(var99, (byte) 101, 0);
                                                var91 = var91.method1039(var99 + 4, 65);
                                            }
                                            int var101 = var88.method560(var100);
                                            if (var89 < var101) {
                                                var89 = var101;
                                            }
                                            var87 += var88.field1688 + 1;
                                        }
                                        var87 += 7;
                                        int var92 = var15 + var12.field1815 + 5;
                                        if (var87 + var92 > arg1) {
                                            var92 = arg1 - var87;
                                        }
                                        var89 += 6;
                                        int var93 = var12.field1746 + var14 - var89 - 5;
                                        if (var14 + 5 > var93) {
                                            var93 = var14 + 5;
                                        }
                                        if (var89 + var93 > arg0) {
                                            var93 = arg0 - var89;
                                        }
                                        class173.method1173(var93, var92, var89, var87, 16777120);
                                        class173.method1177(var93, var92, var89, var87, 0);
                                        class163 var94 = var12.field1753;
                                        int var95 = var88.field1688 + var92 + 2;
                                        class163 var96 = class88.method615(var94, -9254, var12);
                                        while (var96.method1029(123) > 0) {
                                            int var97 = var96.method1035(true, class109.field2274);
                                            class163 var98;
                                            if (var97 == -1) {
                                                var98 = var96;
                                                var96 = class36.field728;
                                            } else {
                                                var98 = var96.method1036(var97, (byte) 119, 0);
                                                var96 = var96.method1039(var97 + 4, -88);
                                            }
                                            var88.method577(var98, var93 + 3, var95, 0, -1);
                                            var95 += var88.field1688 + 1;
                                        }
                                    }
                                    if (var12.field1755 == 9) {
                                        if (var12.field1841 == 1) {
                                            class173.method1174(var14, var15, var12.field1746 + var14, var12.field1815 + var15, var12.field1829);
                                        } else {
                                            int var102 = var12.field1746 < 0 ? -var12.field1746 : var12.field1746;
                                            int var103 = var12.field1815 >= 0 ? var12.field1815 : -var12.field1815;
                                            int var104 = var102;
                                            if (var103 > var102) {
                                                var104 = var103;
                                            }
                                            if (var104 != 0) {
                                                int var105 = (var12.field1746 << 16) / var104;
                                                int var106 = (var12.field1815 << 16) / var104;
                                                if (var105 < var106) {
                                                    var106 = -var106;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var107 = var12.field1841 * var106 + 1 >> 17;
                                                int var108 = var12.field1841 * var106 >> 17;
                                                int var109 = var12.field1841 * var105 >> 17;
                                                int var110 = var12.field1841 * var105 + 1 >> 17;
                                                int var111 = var14 - arg2;
                                                int var112 = var15 - arg8;
                                                int var113 = var108 + var111;
                                                int var114 = var111 - var107;
                                                int var115 = var12.field1746 + var111 - var107;
                                                int var116 = var109 + var112;
                                                int var117 = var112 - var110;
                                                int var118 = var111 + var12.field1746 + var108;
                                                int var119 = var12.field1815 + var112 - var110;
                                                int var120 = var12.field1815 + var112 + var109;
                                                class1.method3(var113, var114, var115);
                                                class1.method10(var116, var117, var119, var113, var114, var115, var12.field1829);
                                                class1.method3(var113, var115, var118);
                                                class1.method10(var116, var119, var120, var113, var115, var118, var12.field1829);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = -63 / ((-arg6 - 15) / 53);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lfa;II)V")
    public final void method506(class52 arg0, int arg1, int arg2) {
        if (arg2 < 28) {
            field1501 = 17;
        }
        field1484++;
        while (true) {
            int var4 = arg0.method344(255);
            if (var4 == 0) {
                return;
            }
            this.method508(var4, -1, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static final void method507(int arg0) {
        class65.field1373 = new class65(arg0);
        field1494++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILfa;)V")
    private final void method508(int arg0, int arg1, int arg2, class52 arg3) {
        if (arg0 == 1) {
            this.field1496 = arg3.method340(false);
            this.method510(this.field1496, arg1 ^ 0xFFFFFFFE);
        } else if (arg0 == 2) {
            this.field1489 = arg3.method390((byte) 114);
            if (this.field1489 == 65535) {
                this.field1489 = -1;
            }
        } else if (arg0 == 3) {
            arg3.method390((byte) 119);
        }
        field1487++;
        if (arg1 != -1) {
            method505(-23, -54, -45, null, 80, -94, 12, -123, -27, 84);
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
    public static void method509(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1495 = null;
        field1497 = null;
        field1493 = null;
        field1500 = null;
        field1499 = null;
        field1498 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    private final void method510(int arg0, int arg1) {
        field1492++;
        if (arg1 != 1) {
            field1497 = null;
        }
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var3 < var5) {
            var7 = var3;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        double var11 = 0.0D;
        double var13 = var5;
        if (var5 < var3) {
            var13 = var3;
        }
        if (var9 > var13) {
            var13 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var13) / 2.0D;
        if (var7 != var13) {
            if (var5 == var13) {
                var11 = (var3 - var9) / (-var7 + var13);
            } else if (var3 == var13) {
                var11 = (var9 - var5) / (-var7 + var13) + 2.0D;
            } else if (var9 == var13) {
                var11 = (var5 - var3) / (var13 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var7) / (var7 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var7) / (2.0D - var13 - var7);
            }
        }
        double var19 = var11 / 6.0D;
        this.field1486 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field1490 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1490 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1486 < 0) {
            this.field1486 = 0;
        } else if (this.field1486 > 255) {
            this.field1486 = 255;
        }
        if (this.field1490 < 1) {
            this.field1490 = 1;
        }
        this.field1488 = (int) (var15 * 256.0D);
        if (this.field1488 < 0) {
            this.field1488 = 0;
        } else if (this.field1488 > 255) {
            this.field1488 = 255;
        }
        this.field1485 = (int) ((double) this.field1490 * var19);
    }
}
