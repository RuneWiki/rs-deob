import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class82 extends class107 {

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "[I")
    public int[] field1847 = new int[1];

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "[I")
    public int[] field1849 = new int[] { -1 };

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lvc;")
    public static class137 field1835 = class45.method325("und Ihr Passwort ein)3", -46);

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field1843 = -1;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Z")
    public static boolean field1850 = false;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Lvc;")
    public static class137 field1846 = class45.method325("@gr1@", -46);

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lvc;")
    public static class137 field1838 = class45.method325("Update)2Liste geladen)3", -46);

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "Lvc;")
    private static class137 field1851 = class45.method325(" more options", -46);

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1854 = 50;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field1853 = 1;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lvc;")
    public static class137 field1845 = field1851;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
    public static int[] field1841;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
    public static int[] field1844;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILnb;Lnb;)V")
    public static final void method600(int arg0, class88 arg1, class88 arg2) {
        class34.field734 = arg1;
        class34.field738 = arg2;
        if (arg0 != 1) {
            field1837 = 101;
        }
        field1836++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public static final int method601(int arg0, int arg1) {
        field1842++;
        return arg1 < 15 ? 118 : arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method602(int arg0) {
        field1845 = null;
        field1846 = null;
        if (arg0 != -30093) {
            field1837 = -35;
        }
        field1841 = null;
        field1851 = null;
        field1838 = null;
        field1844 = null;
        field1835 = null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method603(int arg0) {
        field1848++;
        if (class11.field241 == 132) {
            int var1 = class103.field2391.method831((byte) 105);
            int var2 = class103.field2391.method831((byte) 105);
            int var3 = class103.field2391.method794((byte) -106);
            int var4 = (var3 >> 4 & 0x7) + class119.field2775;
            int var5 = class110.field2610 + (var3 & 0x7);
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                class92 var6 = new class92();
                var6.field2174 = var2;
                var6.field2187 = var1;
                if (class40.field914[class28.field627][var4][var5] == null) {
                    class40.field914[class28.field627][var4][var5] = new class100();
                }
                class40.field914[class28.field627][var4][var5].method730(arg0 - 425143677, var6);
                class132.method967((byte) -15, var5, var4);
            }
        } else if (arg0 == 425144144) {
            if (class11.field241 == 124) {
                int var7 = class103.field2391.method838(255);
                int var8 = (var7 >> 4 & 0x7) + class119.field2775;
                int var9 = class110.field2610 + (var7 & 0x7);
                int var10 = class103.field2391.method821(-1);
                int var11 = class103.field2391.method794((byte) -106);
                int var12 = var11 >> 2;
                int var13 = var11 & 0x3;
                int var14 = class105.field2426[var12];
                if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                    class99.method715(var12, var8, var13, var14, var9, 101, -1, var10, class28.field627, 0);
                }
            } else {
                if (class11.field241 == 98) {
                    int var15 = class103.field2391.method841(arg0 ^ 0xE6A89A40);
                    int var16 = class103.field2391.method821(-1);
                    byte var17 = class103.field2391.method804(-68);
                    int var18 = class103.field2391.method841(-19184);
                    int var19 = class103.field2391.method831((byte) 105);
                    int var20 = class103.field2391.method825(21934);
                    int var21 = (var20 >> 4 & 0x7) + class119.field2775;
                    int var22 = (var20 & 0x7) + class110.field2610;
                    byte var23 = class103.field2391.method812((byte) 109);
                    int var24 = class103.field2391.method808(-99);
                    int var25 = var24 >> 2;
                    int var26 = class105.field2426[var25];
                    byte var27 = class103.field2391.method816(116);
                    int var28 = var24 & 0x3;
                    byte var29 = class103.field2391.method813(-22165);
                    class125 var30;
                    if (class8.field181 == var16) {
                        var30 = class104.field2412;
                    } else {
                        var30 = class102.field2358[var16];
                    }
                    if (var30 != null) {
                        class126 var31 = class114.method886(6, var15);
                        int var32 = class61.field1329[class28.field627][var21 + 1][var22 + 1];
                        int var33 = class61.field1329[class28.field627][var21][var22];
                        int var34 = class61.field1329[class28.field627][var21 + 1][var22];
                        int var35 = class61.field1329[class28.field627][var21][var22 + 1];
                        class14 var36 = var31.method945(var25, var33, var35, var34, var28, (byte) 23, var32);
                        if (var36 != null) {
                            class99.method715(0, var21, 0, var26, var22, 76, var18 + 1, -1, class28.field627, var19 + 1);
                            var30.field2878 = class112.field2667 + var19;
                            int var37 = var31.field2952;
                            if (var29 > var17) {
                                byte var38 = var29;
                                var29 = var17;
                                var17 = var38;
                            }
                            int var39 = var31.field2971;
                            var30.field2881 = var36;
                            if (var23 > var27) {
                                byte var40 = var23;
                                var23 = var27;
                                var27 = var40;
                            }
                            if (var28 == 1 || var28 == 3) {
                                var37 = var31.field2971;
                                var39 = var31.field2952;
                            }
                            var30.field2885 = var22 * 128 + var39 * 64;
                            var30.field2906 = class112.field2667 + var18;
                            var30.field2905 = var21 * 128 + var37 * 64;
                            var30.field2901 = class32.method241(var30.field2905, (byte) -117, class28.field627, var30.field2885);
                            var30.field2882 = var22 + var27;
                            var30.field2884 = var21 + var29;
                            var30.field2911 = var22 + var23;
                            var30.field2902 = var17 + var21;
                        }
                    }
                }
                if (class11.field241 == 196) {
                    int var41 = class103.field2391.method838(arg0 - 425143889);
                    int var42 = (var41 >> 4 & 0x7) + class119.field2775;
                    int var43 = (var41 & 0x7) + class110.field2610;
                    int var44 = class103.field2391.method821(-1);
                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                        class100 var45 = class40.field914[class28.field627][var42][var43];
                        if (var45 != null) {
                            for (class92 var46 = (class92) var45.method726(0); var46 != null; var46 = (class92) var45.method731((byte) -117)) {
                                if ((var44 & 0x7FFF) == var46.field2187) {
                                    var46.method776(0);
                                    break;
                                }
                            }
                            if (var45.method726(0) == null) {
                                class40.field914[class28.field627][var42][var43] = null;
                            }
                            class132.method967((byte) -15, var43, var42);
                        }
                    }
                } else if (class11.field241 == 55) {
                    int var47 = class103.field2391.method825(21934);
                    int var48 = var47 & 0x3;
                    int var49 = var47 >> 2;
                    int var50 = class105.field2426[var49];
                    int var51 = class103.field2391.method841(-19184);
                    int var52 = class103.field2391.method794((byte) -106);
                    int var53 = class119.field2775 + (var52 >> 4 & 0x7);
                    int var54 = class110.field2610 + (var52 & 0x7);
                    if (var53 >= 0 && var54 >= 0 && var53 < 103 && var54 < 103) {
                        int var55 = class61.field1329[class28.field627][var53][var54];
                        int var56 = class61.field1329[class28.field627][var53 + 1][var54];
                        int var57 = class61.field1329[class28.field627][var53 + 1][var54 + 1];
                        int var58 = class61.field1329[class28.field627][var53][var54 + 1];
                        if (var50 == 0) {
                            class35 var59 = class10.field220.method543(class28.field627, var53, var54);
                            if (var59 != null) {
                                int var60 = var59.field759 >> 14 & 0x7FFF;
                                if (var49 == 2) {
                                    var59.field762 = new class6(var60, 2, var48 + 4, var55, var56, var57, var58, var51, false, var59.field762);
                                    var59.field750 = new class6(var60, 2, var48 + 1 & 0x3, var55, var56, var57, var58, var51, false, var59.field750);
                                } else {
                                    var59.field762 = new class6(var60, var49, var48, var55, var56, var57, var58, var51, false, var59.field762);
                                }
                            }
                        }
                        if (var50 == 1) {
                            class49 var61 = class10.field220.method541(class28.field627, var53, var54);
                            if (var61 != null) {
                                var61.field1109 = new class6(var61.field1098 >> 14 & 0x7FFF, 4, 0, var55, var56, var57, var58, var51, false, var61.field1109);
                            }
                        }
                        if (var50 == 2) {
                            if (var49 == 11) {
                                var49 = 10;
                            }
                            class134 var62 = class10.field220.method517(class28.field627, var53, var54);
                            if (var62 != null) {
                                var62.field3121 = new class6(var62.field3100 >> 14 & 0x7FFF, var49, var48, var55, var56, var57, var58, var51, false, var62.field3121);
                            }
                        }
                        if (var50 == 3) {
                            class71 var63 = class10.field220.method555(class28.field627, var53, var54);
                            if (var63 != null) {
                                var63.field1505 = new class6(var63.field1495 >> 14 & 0x7FFF, 22, var48, var55, var56, var57, var58, var51, false, var63.field1505);
                            }
                        }
                    }
                } else {
                    if (class11.field241 == 69) {
                        int var64 = class103.field2391.method838(255);
                        int var65 = (var64 >> 4 & 0x7) + class119.field2775;
                        int var66 = (var64 & 0x7) + class110.field2610;
                        int var67 = class103.field2391.method835(arg0 ^ 0x19572F52);
                        int var68 = class103.field2391.method838(255);
                        int var69 = var68 & 0x7;
                        int var70 = class103.field2391.method838(255);
                        int var71 = var68 >> 4 & 0xF;
                        if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                            int var72 = var71 + 1;
                            if (var65 - var72 <= class104.field2412.field1647[0] && class104.field2412.field1647[0] <= var65 + var72 && class104.field2412.field1624[0] >= var66 - var72 && var66 + var72 >= class104.field2412.field1624[0] && class43.field939 != 0 && var69 > 0 && class68.field1394 < 50) {
                                class36.field798[class68.field1394] = var67;
                                class126.field2960[class68.field1394] = var69;
                                class38.field831[class68.field1394] = var70;
                                class103.field2396[class68.field1394] = null;
                                class83.field1871[class68.field1394] = (var65 << 16) - (-(var66 << 8) - var71);
                                class68.field1394++;
                            }
                        }
                    }
                    if (class11.field241 == 225) {
                        int var73 = class103.field2391.method838(255);
                        int var74 = (var73 >> 4 & 0x7) + class119.field2775;
                        int var75 = (var73 & 0x7) + class110.field2610;
                        int var76 = class103.field2391.method835(arg0 ^ 0x19572F52);
                        int var77 = class103.field2391.method835(2);
                        int var78 = class103.field2391.method835(arg0 - 425144142);
                        if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                            class100 var79 = class40.field914[class28.field627][var74][var75];
                            if (var79 != null) {
                                for (class92 var80 = (class92) var79.method726(0); var80 != null; var80 = (class92) var79.method731((byte) -117)) {
                                    if ((var76 & 0x7FFF) == var80.field2187 && var80.field2174 == var77) {
                                        var80.field2174 = var78;
                                        break;
                                    }
                                }
                                class132.method967((byte) -15, var75, var74);
                            }
                        }
                    } else if (class11.field241 == 227) {
                        int var81 = class103.field2391.method838(255);
                        int var82 = (var81 >> 4 & 0x7) + class119.field2775;
                        int var83 = (var81 & 0x7) + class110.field2610;
                        int var84 = class103.field2391.method835(2);
                        int var85 = class103.field2391.method838(255);
                        int var86 = class103.field2391.method835(2);
                        if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                            int var87 = var83 * 128 + 64;
                            int var88 = var82 * 128 + 64;
                            class127 var89 = new class127(var84, class28.field627, var88, var87, class32.method241(var88, (byte) -121, class28.field627, var87) - var85, var86, class112.field2667);
                            class128.field3008.method730(467, var89);
                        }
                    } else if (class11.field241 == 12) {
                        int var90 = class103.field2391.method838(255);
                        int var91 = class110.field2610 + (var90 & 0x7);
                        int var92 = (var90 >> 4 & 0x7) + class119.field2775;
                        int var93 = class103.field2391.method816(111) + var92;
                        int var94 = class103.field2391.method816(arg0 - 425144030) + var91;
                        int var95 = class103.field2391.method836(-126);
                        int var96 = class103.field2391.method835(2);
                        int var97 = class103.field2391.method838(arg0 - 425143889) * 4;
                        int var98 = class103.field2391.method838(arg0 ^ 0x19572FAF) * 4;
                        int var99 = class103.field2391.method835(2);
                        int var100 = class103.field2391.method835(arg0 ^ 0x19572F52);
                        int var101 = class103.field2391.method838(arg0 - 425143889);
                        int var102 = class103.field2391.method838(255);
                        if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104 && var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var96 != 65535) {
                            int var103 = var94 * 128 + 64;
                            int var104 = var91 * 128 + 64;
                            int var105 = var93 * 128 + 64;
                            int var106 = var92 * 128 + 64;
                            class68 var107 = new class68(var96, class28.field627, var106, var104, class32.method241(var106, (byte) 90, class28.field627, var104) - var97, class112.field2667 + var99, class112.field2667 + var100, var101, var102, var95, var98);
                            var107.method483(class112.field2667 + var99, var105, true, var103, class32.method241(var105, (byte) -123, class28.field627, var103) - var98);
                            class73.field1540.method730(467, var107);
                        }
                    } else if (class11.field241 == 160) {
                        int var108 = class103.field2391.method821(arg0 ^ 0xE6A8D0AF);
                        int var109 = class103.field2391.method831((byte) 105);
                        int var110 = class103.field2391.method808(-57);
                        int var111 = class119.field2775 + (var110 >> 4 & 0x7);
                        int var112 = (var110 & 0x7) + class110.field2610;
                        int var113 = class103.field2391.method841(-19184);
                        if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104 && class8.field181 != var113) {
                            class92 var114 = new class92();
                            var114.field2187 = var109;
                            var114.field2174 = var108;
                            if (class40.field914[class28.field627][var111][var112] == null) {
                                class40.field914[class28.field627][var111][var112] = new class100();
                            }
                            class40.field914[class28.field627][var111][var112].method730(467, var114);
                            class132.method967((byte) -15, var112, var111);
                        }
                    } else if (class11.field241 == 241) {
                        int var115 = class103.field2391.method838(arg0 ^ 0x19572FAF);
                        int var116 = (var115 >> 4 & 0x7) + class119.field2775;
                        int var117 = (var115 & 0x7) + class110.field2610;
                        int var118 = class103.field2391.method838(arg0 ^ 0x19572FAF);
                        int var119 = var118 & 0x3;
                        int var120 = var118 >> 2;
                        int var121 = class105.field2426[var120];
                        if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                            class99.method715(var120, var116, var119, var121, var117, arg0 - 425144042, -1, -1, class28.field627, 0);
                        }
                    }
                }
            }
        }
    }
}
