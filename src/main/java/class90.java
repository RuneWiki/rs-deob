import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class90 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "J")
    public static long field1646 = 0L;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
    public static int[] field1644 = new int[2];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public static int[] field1649 = new int[1000];

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[Z")
    public static boolean[] field1647 = new boolean[8];

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[I")
    public static int[] field1652 = new int[2048];

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Ljf;")
    public static class229 field1650 = class212.method1457((byte) 68, "Continuer");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static volatile int field1654 = 0;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static volatile int field1655 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Ljf;")
    public static class229 field1656 = class212.method1457((byte) 104, "T");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lek;")
    public static class185 field1648;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 6)
    public static void method637(byte arg0) {
        field1648 = null;
        field1656 = null;
        field1649 = null;
        field1647 = null;
        if (arg0 <= -19) {
            field1652 = null;
            field1650 = null;
            field1644 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)Z", line = 37)
    public static final boolean method638(boolean arg0) throws IOException {
        field1651++;
        if (class160.field2720 == null) {
            return false;
        }
        int var1 = class160.field2720.method1436(-3616);
        if (var1 == 0) {
            return false;
        }
        if (class107.field1879 == -1) {
            var1--;
            class160.field2720.method1431(1, class171.field2972.field174, 0, (byte) -92);
            class171.field2972.field195 = 0;
            class107.field1879 = class171.field2972.method1394(255);
            class51.field902 = class152.field2629[class107.field1879];
        }
        if (class51.field902 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class160.field2720.method1431(1, class171.field2972.field174, 0, (byte) -92);
            var1--;
            class51.field902 = class171.field2972.field174[0] & 0xFF;
        }
        if (class51.field902 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class160.field2720.method1431(2, class171.field2972.field174, 0, (byte) -92);
            class171.field2972.field195 = 0;
            class51.field902 = class171.field2972.method116(-1);
        }
        if (var1 < class51.field902) {
            return false;
        }
        class171.field2972.field195 = 0;
        class160.field2720.method1431(class51.field902, class171.field2972.field174, 0, (byte) -92);
        class283.field4850 = class4.field35;
        class15.field221 = 0;
        class4.field35 = class187.field3280;
        class187.field3280 = class107.field1879;
        if (class107.field1879 == 41) {
            class274.method1923((byte) -79);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 2) {
            class21.method203((byte) 7);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 145) {
            class229 var2 = class171.field2972.method105((byte) 121);
            if (var2.method1628((byte) 15, class52.field909)) {
                class229 var3 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -90), 0);
                long var4 = var3.method1617(82);
                boolean var6 = false;
                for (int var7 = 0; var7 < class162.field2753; var7++) {
                    if (class212.field3643[var7] == var4) {
                        var6 = true;
                        break;
                    }
                }
                if (!var6 && class59.field1029 == 0) {
                    class28.method245((byte) -75, 4, var3, class267.field4578);
                }
            } else if (var2.method1628((byte) 15, class222.field3796)) {
                boolean var8 = false;
                class229 var9 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -122), 0);
                long var10 = var9.method1617(120);
                for (int var12 = 0; var12 < class162.field2753; var12++) {
                    if (class212.field3643[var12] == var10) {
                        var8 = true;
                        break;
                    }
                }
                if (!var8 && class59.field1029 == 0) {
                    class229 var13 = var2.method1639((byte) -20, var2.method1626(37) - 9, var2.method1649(class33.field626, (byte) -107) + 1);
                    class28.method245((byte) -75, 8, var9, var13);
                }
            } else if (var2.method1628((byte) 15, class69.field1319)) {
                class229 var38 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -100), 0);
                boolean var39 = false;
                long var40 = var38.method1617(92);
                for (int var42 = 0; var42 < class162.field2753; var42++) {
                    if (class212.field3643[var42] == var40) {
                        var39 = true;
                        break;
                    }
                }
                if (!var39 && class59.field1029 == 0) {
                    class28.method245((byte) -75, 10, var38, class331.field5638);
                }
            } else if (var2.method1628((byte) 15, class26.field473)) {
                class229 var37 = var2.method1639((byte) -20, var2.method1649(class26.field473, (byte) -105), 0);
                class28.method245((byte) -75, 11, class331.field5638, var37);
            } else if (var2.method1628((byte) 15, class48.field874)) {
                class229 var14 = var2.method1639((byte) -20, var2.method1649(class48.field874, (byte) -93), 0);
                if (class59.field1029 == 0) {
                    class28.method245((byte) -75, 12, class331.field5638, var14);
                }
            } else if (var2.method1628((byte) 15, class214.field3685)) {
                class229 var15 = var2.method1639((byte) -20, var2.method1649(class214.field3685, (byte) -103), 0);
                if (class59.field1029 == 0) {
                    class28.method245((byte) -75, 13, class331.field5638, var15);
                }
            } else if (var2.method1628((byte) 15, class41.field742)) {
                class229 var32 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -102), 0);
                long var33 = var32.method1617(117);
                boolean var35 = false;
                for (int var36 = 0; var36 < class162.field2753; var36++) {
                    if (class212.field3643[var36] == var33) {
                        var35 = true;
                        break;
                    }
                }
                if (!var35 && class59.field1029 == 0) {
                    class28.method245((byte) -75, 14, var32, class331.field5638);
                }
            } else if (var2.method1628((byte) 15, class170.field2966)) {
                class229 var16 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -95), 0);
                long var17 = var16.method1617(99);
                boolean var19 = false;
                for (int var20 = 0; var20 < class162.field2753; var20++) {
                    if (class212.field3643[var20] == var17) {
                        var19 = true;
                        break;
                    }
                }
                if (!var19 && class59.field1029 == 0) {
                    class28.method245((byte) -75, 15, var16, class331.field5638);
                }
            } else if (var2.method1628((byte) 15, class237.field4093)) {
                class229 var27 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -126), 0);
                boolean var28 = false;
                long var29 = var27.method1617(89);
                for (int var31 = 0; var31 < class162.field2753; var31++) {
                    if (class212.field3643[var31] == var29) {
                        var28 = true;
                        break;
                    }
                }
                if (!var28 && class59.field1029 == 0) {
                    class28.method245((byte) -75, 16, var27, class331.field5638);
                }
            } else if (var2.method1628((byte) 15, class16.field261)) {
                class229 var21 = var2.method1639((byte) -20, var2.method1649(class33.field626, (byte) -118), 0);
                long var22 = var21.method1617(103);
                boolean var24 = false;
                for (int var25 = 0; var25 < class162.field2753; var25++) {
                    if (class212.field3643[var25] == var22) {
                        var24 = true;
                        break;
                    }
                }
                if (!var24 && class59.field1029 == 0) {
                    class229 var26 = var2.method1639((byte) -20, var2.method1626(63) - 9, var2.method1649(class33.field626, (byte) -104) + 1);
                    class28.method245((byte) -75, 21, var21, var26);
                }
            } else {
                class28.method245((byte) -75, 0, class331.field5638, var2);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 172) {
            class167.method1140(98);
            class160.field2713 = class171.field2972.method113((byte) 106);
            class238.field4156 = class6.field70;
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 214) {
            int var349 = class171.field2972.method145(36);
            int var350 = class171.field2972.method128((byte) 4);
            int var351 = class171.field2972.method145(28);
            if (var351 == 65535) {
                var351 = -1;
            }
            if (class324.method2184(var349, (byte) -35)) {
                class229.method1610(var351, var350, 1, 2);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 5) {
            long var335 = class171.field2972.method132(-1);
            long var337 = (long) class171.field2972.method116(-1);
            long var339 = (long) class171.field2972.method114(0);
            int var341 = class171.field2972.method93(false);
            int var342 = class171.field2972.method116(-1);
            long var343 = (var337 << 32) + var339;
            boolean var345 = false;
            int var346 = 0;
            label1666: while (true) {
                if (var346 >= 100) {
                    if (var341 <= 1) {
                        for (int var347 = 0; var347 < class162.field2753; var347++) {
                            if (class212.field3643[var347] == var335) {
                                var345 = true;
                                break label1666;
                            }
                        }
                    }
                    break;
                }
                if (class162.field2745[var346] == var343) {
                    var345 = true;
                    break;
                }
                var346++;
            }
            if (!var345 && class59.field1029 == 0) {
                class162.field2745[class14.field217] = var343;
                class14.field217 = (class14.field217 + 1) % 100;
                class229 var348 = class27.method242(var342, -30280).method361(false, class171.field2972);
                if (var341 == 2) {
                    class274.method1917((class229) null, var342, class142.method989(new class229[] { class242.field4268, class252.method1800(!arg0, var335).method1606((byte) 126) }, -21), var348, 18, -108);
                } else if (var341 == 1) {
                    class274.method1917((class229) null, var342, class142.method989(new class229[] { class325.field5480, class252.method1800(!arg0, var335).method1606((byte) 104) }, -72), var348, 18, -127);
                } else {
                    class274.method1917((class229) null, var342, class252.method1800(false, var335).method1606((byte) 113), var348, 18, -114);
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 8) {
            int var43 = class171.field2972.method116(-1);
            int var44 = class171.field2972.method128((byte) 4);
            if (class324.method2184(var43, (byte) -35)) {
                class321 var45 = (class321) class151.field2618.method1890((long) var44, -116);
                if (var45 != null) {
                    class282.method1978(-99, true, var45);
                }
                if (class208.field3613 != null) {
                    class194.method1328((byte) -99, class208.field3613);
                    class208.field3613 = null;
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 252) {
            class169.method1147(true, 69);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 231) {
            int var46 = class171.field2972.method145(75);
            if (var46 == 65535) {
                var46 = -1;
            }
            int var47 = class171.field2972.method145(17);
            int var48 = class171.field2972.method116(-1);
            if (var48 == 65535) {
                var48 = -1;
            }
            int var49 = class171.field2972.method136(!arg0);
            int var50 = class171.field2972.method135(4);
            if (class324.method2184(var47, (byte) -35)) {
                for (int var51 = var46; var51 <= var48; var51++) {
                    long var52 = ((long) var50 << 32) + (long) var51;
                    class242 var54 = class224.field3834.method1890(var52, -98);
                    if (var54 != null) {
                        var54.method1747((byte) -91);
                    }
                    class224.field3834.method1885(var52, new class93(var49), (byte) -118);
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 120) {
            int var55 = class171.field2972.method143(0);
            int var56 = class171.field2972.method142((byte) 35);
            int var57 = class171.field2972.method142((byte) 35);
            if (class324.method2184(var57, (byte) -35)) {
                if (var55 == 2) {
                    class6.method40((byte) 34);
                }
                class16.field263 = var56;
                class274.method1921(17208, var56);
                class287.method2005(false, 120);
                class327.method2197(class16.field263, (byte) -114);
                for (int var58 = 0; var58 < 100; var58++) {
                    class244.field4341[var58] = true;
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 216) {
            int var59 = class171.field2972.method142((byte) 35);
            int var60 = class171.field2972.method102(1192240584);
            int var61 = class171.field2972.method116(-1);
            int var62 = class171.field2972.method136(!arg0);
            if ((var62 >> 30) != 0) {
                int var63 = var62 >> 28 & 0x3;
                int var64 = (var62 >> 14 & 0x3FFF) - class258.field4503;
                int var65 = (var62 & 0x3FFF) - class213.field3649;
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    int var66 = var64 * 128 + 64;
                    int var67 = var65 * 128 + 64;
                    class69 var68 = new class69(var61, var63, var66, var67, class282.method1984((byte) -125, var67, var66, var63) - var59, var60, class199.field3475);
                    class282.field4844.method2079(new class27(var68), 92);
                }
            } else if (var62 >> 29 != 0) {
                int var69 = var62 & 0xFFFF;
                class331 var70 = class331.field5637[var69];
                if (var70 != null) {
                    var70.field1999 = var61;
                    var70.field1991 = var59;
                    var70.field1968 = 0;
                    if (var70.field1999 == 65535) {
                        var70.field1999 = -1;
                    }
                    var70.field2012 = class199.field3475 + var60;
                    if (var70.field2012 > class199.field3475) {
                        var70.field1968 = -1;
                    }
                    var70.field2014 = 0;
                    if (var70.field1999 != -1 && class199.field3475 == var70.field2012) {
                        int var71 = class66.method492(8, var70.field1999).field3829;
                        if (var71 != -1) {
                            class194 var72 = class280.method1965(var71, -84);
                            if (var72 != null && var72.field3366 != null) {
                                class305.method2083(var72, var70.field2028, false, var70.field1983, 0, -64);
                            }
                        }
                    }
                }
            } else if ((var62 >> 28) != 0) {
                int var73 = var62 & 0xFFFF;
                class33 var74;
                if (class112.field1963 == var73) {
                    var74 = class301.field5124;
                } else {
                    var74 = class192.field3334[var73];
                }
                if (var74 != null) {
                    var74.field2014 = 0;
                    var74.field2012 = class199.field3475 + var60;
                    var74.field1991 = var59;
                    var74.field1968 = 0;
                    if (class199.field3475 < var74.field2012) {
                        var74.field1968 = -1;
                    }
                    var74.field1999 = var61;
                    if (var74.field1999 == 65535) {
                        var74.field1999 = -1;
                    }
                    if (var74.field1999 != -1 && class199.field3475 == var74.field2012) {
                        int var75 = class66.method492(8, var74.field1999).field3829;
                        if (var75 != -1) {
                            class194 var76 = class280.method1965(var75, -92);
                            if (var76 != null && var76.field3366 != null) {
                                class305.method2083(var76, var74.field2028, class301.field5124 == var74, var74.field1983, 0, -64);
                            }
                        }
                    }
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 20) {
            int var333 = class171.field2972.method145(116);
            byte var334 = class171.field2972.method127((byte) -29);
            class16.method160(var334, (byte) -20, var333);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 23 || class107.field1879 == 10 || class107.field1879 == 134 || class107.field1879 == 126 || class107.field1879 == 36 || class107.field1879 == 94 || class107.field1879 == 109 || class107.field1879 == 147 || class107.field1879 == 176 || class107.field1879 == 68 || class107.field1879 == 212 || class107.field1879 == 125) {
            class78.method558(120);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 143) {
            class167.method1140(69);
            int var77 = class171.field2972.method135(4);
            int var78 = class171.field2972.method93(false);
            int var79 = class171.field2972.method131(-128);
            class193.field3347[var79] = var77;
            class236.field4081[var79] = var78;
            class297.field5081[var79] = 1;
            for (int var80 = 0; var80 < 98; var80++) {
                if (class257.field4481[var80] <= var77) {
                    class297.field5081[var79] = var80 + 2;
                }
            }
            class230.field3996[class305.method2086(31, class112.field2011++)] = var79;
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 178) {
            int var81 = class171.field2972.method136(false);
            class67 var82 = class96.method662(var81, true);
            for (int var83 = 0; var83 < var82.field1227.length; var83++) {
                var82.field1227[var83] = -1;
                var82.field1227[var83] = 0;
            }
            class194.method1328((byte) -124, var82);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 58) {
            int var84 = class171.field2972.method102(1192240584);
            int var85 = class171.field2972.method88((byte) -108);
            int var86 = class171.field2972.method103(-30563);
            if (class324.method2184(var84, (byte) -35)) {
                class41.method354(5, var86, var85);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 179) {
            class259.method1841((byte) 113);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 115) {
            class146.field2530 = class171.field2972.method139((byte) -124);
            class203.field3544 = class171.field2972.method93(false);
            for (int var330 = class146.field2530; var330 < (class146.field2530 + 8); var330++) {
                for (int var331 = class203.field3544; var331 < class203.field3544 + 8; var331++) {
                    if (class105.field1822[class16.field254][var330][var331] != null) {
                        class105.field1822[class16.field254][var330][var331] = null;
                        class234.method1672((byte) 104, var330, var331);
                    }
                }
            }
            for (class89 var332 = (class89) class83.field1532.method2078(-97); var332 != null; var332 = (class89) class83.field1532.method2080(5)) {
                if (var332.field1641 >= class146.field2530 && var332.field1641 < (class146.field2530 + 8) && class203.field3544 <= var332.field1633 && var332.field1633 < (class203.field3544 + 8) && class16.field254 == var332.field1635) {
                    var332.field1626 = 0;
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 194) {
            class171.field2974 = class171.field2972.method93(!arg0);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 30) {
            int var87 = class171.field2972.method116(-1);
            class229 var88 = class171.field2972.method105((byte) 110);
            Object[] var89 = new Object[var88.method1626(83) + 1];
            for (int var90 = var88.method1626(-102) - 1; var90 >= 0; var90--) {
                if (var88.method1642(92, var90) == 115) {
                    var89[var90 + 1] = class171.field2972.method105((byte) 115);
                } else {
                    var89[var90 + 1] = Integer.valueOf(class171.field2972.method128((byte) 4));
                }
            }
            var89[0] = Integer.valueOf(class171.field2972.method128((byte) 4));
            if (class324.method2184(var87, (byte) -35)) {
                class192 var91 = new class192();
                var91.field3324 = var89;
                class215.method1477(-19319, var91);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 250) {
            class146.field2530 = class171.field2972.method139((byte) -106);
            class203.field3544 = class171.field2972.method93(!arg0);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 92) {
            int var92 = class171.field2972.method145(61);
            int var93 = class171.field2972.method145(30);
            if (var93 == 65535) {
                var93 = -1;
            }
            int var94 = class171.field2972.method103(-30563);
            int var95 = class171.field2972.method136(false);
            if (class324.method2184(var92, (byte) -35)) {
                class67 var96 = class96.method662(var94, true);
                if (var96.field1249) {
                    class243.method1756(var94, 9, var93, var95);
                    class313 var98 = class113.method799(var93, (byte) 50);
                    class249.method1795(var98.field5326, var98.field5330, var98.field5317, var94, 8);
                    class306.method2088(var98.field5331, var98.field5279, -32417, var98.field5308, var94);
                } else if (var93 == -1) {
                    var96.field1134 = 0;
                    class107.field1879 = -1;
                    return true;
                } else {
                    class313 var97 = class113.method799(var93, (byte) 50);
                    var96.field1171 = var97.field5326 * 100 / var95;
                    var96.field1134 = 4;
                    var96.field1288 = var93;
                    var96.field1231 = var97.field5330;
                    var96.field1209 = var97.field5317;
                    class194.method1328((byte) -61, var96);
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 19) {
            class208.field3612 = class171.field2972.method145(71) * 30;
            class238.field4156 = class6.field70;
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 193) {
            int var99 = class171.field2972.method102(1192240584);
            int var100 = class171.field2972.method102(1192240584);
            int var101 = class171.field2972.method93(false);
            if (class324.method2184(var100, (byte) -35)) {
                class252.method1799((byte) 127, var99, var101);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 136) {
            class200.method1395(-125, class171.field2972.method105((byte) -84));
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 139) {
            int var327 = class171.field2972.method116(-1);
            int var328 = class171.field2972.method93(false);
            if (var327 == 65535) {
                var327 = -1;
            }
            int var329 = class171.field2972.method116(-1);
            class193.method1321(var329, var328, -120, var327);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 150) {
            int var102 = class171.field2972.method142((byte) 35);
            int var103 = class171.field2972.method142((byte) 35);
            int var104 = class171.field2972.method139((byte) -107);
            class331 var105 = class331.field5637[var102];
            if (var105 != null) {
                class127.method900(var103, (byte) -123, var104, var105);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 153) {
            int var324 = class171.field2972.method135(4);
            int var325 = class171.field2972.method142((byte) 35);
            int var326 = class171.field2972.method145(78);
            if (class324.method2184(var326, (byte) -35)) {
                class158.method1060(var324, var325, (byte) -109);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 113) {
            int var106 = class171.field2972.method143(0);
            int var107 = var106 & 0x3;
            int var108 = var106 >> 2;
            int var109 = class240.field4239[var108];
            int var110 = class171.field2972.method102(1192240584);
            int var111 = class171.field2972.method135(4);
            if (var110 == 65535) {
                var110 = -1;
            }
            int var112 = var111 >> 14 & 0x3FFF;
            int var113 = (var111 & 0x3038F1E8) >> 28;
            int var114 = var112 - class258.field4503;
            int var115 = var111 & 0x3FFF;
            int var116 = var115 - class213.field3649;
            class312.method2115(var107, var108, var114, var116, var109, var110, Integer.MAX_VALUE, var113);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 104) {
            long var311 = class171.field2972.method132(-1);
            long var313 = (long) class171.field2972.method116(-1);
            boolean var315 = false;
            long var316 = (long) class171.field2972.method114(0);
            long var318 = (var313 << 32) + var316;
            int var320 = class171.field2972.method93(false);
            int var321 = 0;
            label1600: while (true) {
                if (var321 < 100) {
                    if (class162.field2745[var321] != var318) {
                        var321++;
                        continue;
                    }
                    var315 = true;
                    break;
                }
                if (var320 <= 1) {
                    if ((!class283.field4852 || class281.field4808) && !class252.field4402) {
                        for (int var322 = 0; var322 < class162.field2753; var322++) {
                            if (class212.field3643[var322] == var311) {
                                var315 = true;
                                break label1600;
                            }
                        }
                    } else {
                        var315 = true;
                    }
                }
                break;
            }
            if (!var315 && class59.field1029 == 0) {
                class162.field2745[class14.field217] = var318;
                class14.field217 = (class14.field217 + 1) % 100;
                class229 var323 = class138.method946(class278.method1956((byte) -100, class171.field2972).method1615(24818));
                if (var320 == 2 || var320 == 3) {
                    class28.method245((byte) -75, 7, class142.method989(new class229[] { class242.field4268, class252.method1800(false, var311).method1606((byte) 99) }, -36), var323);
                } else if (var320 == 1) {
                    class28.method245((byte) -75, 7, class142.method989(new class229[] { class325.field5480, class252.method1800(false, var311).method1606((byte) 103) }, -60), var323);
                } else {
                    class28.method245((byte) -75, 3, class252.method1800(false, var311).method1606((byte) 120), var323);
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 110) {
            long var296 = class171.field2972.method132(-1);
            class171.field2972.method98(true);
            long var298 = class171.field2972.method132(-1);
            long var300 = (long) class171.field2972.method116(-1);
            long var302 = (long) class171.field2972.method114(0);
            boolean var304 = false;
            int var305 = class171.field2972.method93(false);
            long var306 = (var300 << 32) + var302;
            int var308 = 0;
            label1552: while (true) {
                if (var308 >= 100) {
                    if (var305 <= 1) {
                        if ((!class283.field4852 || class281.field4808) && !class252.field4402) {
                            for (int var309 = 0; var309 < class162.field2753; var309++) {
                                if (class212.field3643[var309] == var296) {
                                    var304 = true;
                                    break label1552;
                                }
                            }
                        } else {
                            var304 = true;
                        }
                    }
                    break;
                }
                if (class162.field2745[var308] == var306) {
                    var304 = true;
                    break;
                }
                var308++;
            }
            if (!var304 && class59.field1029 == 0) {
                class162.field2745[class14.field217] = var306;
                class14.field217 = (class14.field217 + 1) % 100;
                class229 var310 = class138.method946(class278.method1956((byte) 100, class171.field2972).method1615(24818));
                if (var305 == 2 || var305 == 3) {
                    class151.method1026(false, 9, class252.method1800(false, var298).method1606((byte) 114), var310, class142.method989(new class229[] { class242.field4268, class252.method1800(!arg0, var296).method1606((byte) 98) }, -114));
                } else if (var305 == 1) {
                    class151.method1026(false, 9, class252.method1800(false, var298).method1606((byte) 112), var310, class142.method989(new class229[] { class325.field5480, class252.method1800(false, var296).method1606((byte) 92) }, -117));
                } else {
                    class151.method1026(false, 9, class252.method1800(false, var298).method1606((byte) 123), var310, class252.method1800(false, var296).method1606((byte) 101));
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 140) {
            int var117 = class171.field2972.method135(4);
            int var118 = class171.field2972.method116(-1);
            int var119 = class171.field2972.method142((byte) 35);
            if (class324.method2184(var119, (byte) -35)) {
                class96.method660(-30588, var117, var118);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 111) {
            class229 var293 = class171.field2972.method105((byte) -107);
            int var294 = class171.field2972.method142((byte) 35);
            int var295 = class171.field2972.method116(-1);
            if (class324.method2184(var294, (byte) -35)) {
                class143.method996(var293, var295, (byte) -17);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 191) {
            class229 var120 = class171.field2972.method105((byte) 85);
            int var121 = class171.field2972.method139((byte) -103);
            int var122 = class171.field2972.method143(0);
            if (var121 >= 1 && var121 <= 8) {
                if (var120.method1653(class258.field4490, false)) {
                    var120 = null;
                }
                class41.field733[var121 - 1] = var120;
                field1647[var121 - 1] = var122 == 0;
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 59) {
            long var274 = class171.field2972.method132(-1);
            int var276 = class171.field2972.method116(-1);
            boolean var277 = true;
            int var278 = class171.field2972.method93(false);
            if (var274 < 0L) {
                var277 = false;
                var274 &= Long.MAX_VALUE;
            }
            class229 var279 = class331.field5638;
            if (var276 > 0) {
                var279 = class171.field2972.method105((byte) 110);
            }
            class229 var280 = class252.method1800(false, var274).method1606((byte) 108);
            for (int var281 = 0; var281 < class113.field2044; var281++) {
                if (class31.field536[var281] == var274) {
                    if (class12.field145[var281] != var276) {
                        class12.field145[var281] = var276;
                        if (var276 > 0) {
                            class28.method245((byte) -75, 5, class331.field5638, class142.method989(new class229[] { var280, class319.field5393 }, -127));
                        }
                        if (var276 == 0) {
                            class28.method245((byte) -75, 5, class331.field5638, class142.method989(new class229[] { var280, class134.field2332 }, -30));
                        }
                    }
                    var280 = null;
                    class321.field5426[var281] = var279;
                    class240.field4231[var281] = var278;
                    class48.field873[var281] = var277;
                    break;
                }
            }
            if (var280 != null && class113.field2044 < 200) {
                class31.field536[class113.field2044] = var274;
                class74.field1403[class113.field2044] = var280;
                class12.field145[class113.field2044] = var276;
                class321.field5426[class113.field2044] = var279;
                class240.field4231[class113.field2044] = var278;
                class48.field873[class113.field2044] = var277;
                class113.field2044++;
            }
            class258.field4491 = class6.field70;
            boolean var282 = false;
            int var283 = class113.field2044;
            while (var283 > 0) {
                boolean var284 = true;
                var283--;
                for (int var285 = 0; var285 < var283; var285++) {
                    if (class12.field145[var285] != class3.field14 && class12.field145[var285 + 1] == class3.field14 || class12.field145[var285] == 0 && class12.field145[var285 + 1] != 0) {
                        var284 = false;
                        int var286 = class12.field145[var285];
                        class12.field145[var285] = class12.field145[var285 + 1];
                        class12.field145[var285 + 1] = var286;
                        class229 var287 = class321.field5426[var285];
                        class321.field5426[var285] = class321.field5426[var285 + 1];
                        class321.field5426[var285 + 1] = var287;
                        class229 var288 = class74.field1403[var285];
                        class74.field1403[var285] = class74.field1403[var285 + 1];
                        class74.field1403[var285 + 1] = var288;
                        long var289 = class31.field536[var285];
                        class31.field536[var285] = class31.field536[var285 + 1];
                        class31.field536[var285 + 1] = var289;
                        int var291 = class240.field4231[var285];
                        class240.field4231[var285] = class240.field4231[var285 + 1];
                        class240.field4231[var285 + 1] = var291;
                        boolean var292 = class48.field873[var285];
                        class48.field873[var285] = class48.field873[var285 + 1];
                        class48.field873[var285 + 1] = var292;
                    }
                }
                if (var284) {
                    break;
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 241) {
            int var123 = class171.field2972.method116(-1);
            int var124 = class171.field2972.method116(-1);
            int var125 = class171.field2972.method116(-1);
            int var126 = class171.field2972.method102(1192240584);
            int var127 = class171.field2972.method103(-30563);
            if (class324.method2184(var124, (byte) -35)) {
                class249.method1795(var125, var126, var123, var127, 8);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 181) {
            int var128 = class171.field2972.method142((byte) 35);
            class229 var129 = class171.field2972.method105((byte) -10);
            int var130 = class171.field2972.method135(4);
            if (class324.method2184(var128, (byte) -35)) {
                class297.method2053(var130, var129, 3);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 131) {
            int var131 = class171.field2972.method142((byte) 35);
            int var132 = class171.field2972.method145(93);
            int var133 = class171.field2972.method93(!arg0);
            int var134 = class171.field2972.method103(-30563);
            if (class324.method2184(var131, (byte) -35)) {
                class321 var135 = (class321) class151.field2618.method1890((long) var134, -100);
                if (var135 != null) {
                    class282.method1978(-114, var135.field5432 != var132, var135);
                }
                class71.method524(var132, var133, var134, -128);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 228) {
            long var136 = class171.field2972.method132(-1);
            class171.field2972.method98(true);
            long var138 = class171.field2972.method132(-1);
            long var140 = (long) class171.field2972.method116(-1);
            long var142 = (long) class171.field2972.method114(0);
            boolean var144 = false;
            int var145 = class171.field2972.method93(false);
            long var146 = (var140 << 32) + var142;
            int var148 = class171.field2972.method116(-1);
            int var149 = 0;
            label1304: while (true) {
                if (var149 < 100) {
                    if (class162.field2745[var149] != var146) {
                        var149++;
                        continue;
                    }
                    var144 = true;
                    break;
                }
                if (var145 <= 1) {
                    for (int var150 = 0; var150 < class162.field2753; var150++) {
                        if (class212.field3643[var150] == var136) {
                            var144 = true;
                            break label1304;
                        }
                    }
                }
                break;
            }
            if (!var144 && class59.field1029 == 0) {
                class162.field2745[class14.field217] = var146;
                class14.field217 = (class14.field217 + 1) % 100;
                class229 var151 = class27.method242(var148, -30280).method361(false, class171.field2972);
                if (var145 == 2 || var145 == 3) {
                    class274.method1917(class252.method1800(false, var138).method1606((byte) 114), var148, class142.method989(new class229[] { class242.field4268, class252.method1800(false, var136).method1606((byte) 95) }, -118), var151, 20, -119);
                } else if (var145 == 1) {
                    class274.method1917(class252.method1800(false, var138).method1606((byte) 101), var148, class142.method989(new class229[] { class325.field5480, class252.method1800(!arg0, var136).method1606((byte) 112) }, -35), var151, 20, -123);
                } else {
                    class274.method1917(class252.method1800(!arg0, var138).method1606((byte) 106), var148, class252.method1800(false, var136).method1606((byte) 123), var151, 20, -122);
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 49) {
            int var152 = class171.field2972.method139((byte) -120);
            int var153 = class171.field2972.method93(false);
            int var154 = class171.field2972.method143(0);
            class16.field254 = var153 >> 1;
            class301.field5124.method301((var153 & 0x1) == 1, var154, false, var152);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 251) {
            int var155 = class171.field2972.method116(-1);
            int var156 = class171.field2972.method116(-1);
            class229.field3939 = var156;
            class293.field5021 = var155;
            class42.method366(false);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 66) {
            class185.field3243 = class171.field2972.method93(false);
            class107.field1879 = -1;
            class258.field4491 = class6.field70;
            return true;
        } else if (class107.field1879 == 192) {
            int var157 = class171.field2972.method93(false);
            if (class171.field2972.method93(false) == 0) {
                class70.field1338[var157] = new class56();
            } else {
                class171.field2972.field195--;
                class70.field1338[var157] = new class56(class171.field2972);
            }
            class107.field1879 = -1;
            class41.field738 = class6.field70;
            return true;
        } else if (class107.field1879 == 166) {
            int var158 = class171.field2972.method145(52);
            int var159 = class171.field2972.method135(4);
            if (class324.method2184(var158, (byte) -35)) {
                int var160 = 0;
                if (class301.field5124.field613 != null) {
                    var160 = class301.field5124.field613.method1466(true);
                }
                class229.method1610(var160, var159, 3, 2);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 122) {
            int var161 = class171.field2972.method136(false);
            int var162 = class171.field2972.method145(82);
            class16.method160(var161, (byte) -20, var162);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 56) {
            class169.method1156(class171.field2972, 0);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 157) {
            int var270 = class171.field2972.method142((byte) 35);
            int var271 = class171.field2972.method88((byte) -108);
            int var272 = class171.field2972.method99(124);
            int var273 = class171.field2972.method136(!arg0);
            if (class324.method2184(var270, (byte) -35)) {
                class173.method1178(11, var272, var271, var273);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 137) {
            int var269 = class171.field2972.method102(1192240584);
            class117.method831(false, var269);
            class84.field1606[class305.method2086(31, class104.field1792++)] = class305.method2086(32767, var269);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 18) {
            int var163 = class171.field2972.method128((byte) 4);
            int var164 = class171.field2972.method116(-1);
            class67 var165;
            if (var163 >= 0) {
                var165 = class96.method662(var163, true);
            } else {
                var165 = null;
            }
            if (var163 < -70000) {
                var164 += 32768;
            }
            while (class51.field902 > class171.field2972.field195) {
                int var166 = class171.field2972.method104(-97);
                int var167 = class171.field2972.method116(-1);
                int var168 = 0;
                if (var167 != 0) {
                    var168 = class171.field2972.method93(false);
                    if (var168 == 255) {
                        var168 = class171.field2972.method128((byte) 4);
                    }
                }
                if (var165 != null && var166 >= 0 && var166 < var165.field1227.length) {
                    var165.field1227[var166] = var167;
                    var165.field1153[var166] = var168;
                }
                class67.method497(var164, var166, var167 - 1, var168, 0);
            }
            if (var165 != null) {
                class194.method1328((byte) -108, var165);
            }
            class167.method1140(97);
            class84.field1606[class305.method2086(class104.field1792++, 31)] = class305.method2086(var164, 32767);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 165) {
            class162.field2753 = class51.field902 / 8;
            for (int var268 = 0; var268 < class162.field2753; var268++) {
                class212.field3643[var268] = class171.field2972.method132(-1);
                class52.field906[var268] = class252.method1800(false, class212.field3643[var268]);
            }
            class107.field1879 = -1;
            class258.field4491 = class6.field70;
            return true;
        } else if (class107.field1879 == 29) {
            int var169 = class171.field2972.method93(false);
            int var170 = class171.field2972.method93(false);
            int var171 = class171.field2972.method93(false);
            int var172 = class171.field2972.method93(false);
            int var173 = class171.field2972.method116(-1);
            class302.field5142[var169] = true;
            class39.field723[var169] = var170;
            class275.field4706[var169] = var171;
            class229.field3960[var169] = var172;
            class7.field74[var169] = var173;
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 62) {
            class64.method480(57);
            class167.method1140(-86);
            class107.field1879 = -1;
            class279.field4780 += 32;
            return true;
        } else if (class107.field1879 == 0) {
            for (int var267 = 0; var267 < class286.field4908.length; var267++) {
                if (class286.field4908[var267] != class28.field497[var267]) {
                    class286.field4908[var267] = class28.field497[var267];
                    class329.method2241((byte) -37, var267);
                    class234.field4050[class305.method2086(31, class279.field4780++)] = var267;
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 227) {
            int var264 = class171.field2972.method93(false);
            class191 var265 = new class191();
            var265.field3314 = var264 & 0x3F;
            int var266 = var264 >> 6;
            var265.field3319 = class171.field2972.method93(false);
            if (var265.field3319 >= 0 && var265.field3319 < class84.field1612.length) {
                if (var265.field3314 == 1 || var265.field3314 == 10) {
                    var265.field3311 = class171.field2972.method116(-1);
                    class171.field2972.field195 += 3;
                } else if (var265.field3314 >= 2 && var265.field3314 <= 6) {
                    if (var265.field3314 == 2) {
                        var265.field3307 = 64;
                        var265.field3312 = 64;
                    }
                    if (var265.field3314 == 3) {
                        var265.field3307 = 0;
                        var265.field3312 = 64;
                    }
                    if (var265.field3314 == 4) {
                        var265.field3312 = 64;
                        var265.field3307 = 128;
                    }
                    if (var265.field3314 == 5) {
                        var265.field3312 = 0;
                        var265.field3307 = 64;
                    }
                    if (var265.field3314 == 6) {
                        var265.field3307 = 64;
                        var265.field3312 = 128;
                    }
                    var265.field3314 = 2;
                    var265.field3306 = class171.field2972.method116(-1);
                    var265.field3320 = class171.field2972.method116(-1);
                    var265.field3321 = class171.field2972.method93(false);
                }
                var265.field3309 = class171.field2972.method116(-1);
                if (var265.field3309 == 65535) {
                    var265.field3309 = -1;
                }
                class279.field4777[var266] = var265;
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 198) {
            class228.method1601(class215.field3689, class51.field902, -66, class171.field2972);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 213) {
            class21.field351 = class6.field70;
            long var174 = class171.field2972.method132(-1);
            if (var174 == 0L) {
                class280.field4793 = null;
                class52.field923 = 0;
                class137.field2376 = null;
                class107.field1879 = -1;
                class46.field854 = null;
                return true;
            }
            long var176 = class171.field2972.method132(-1);
            class46.field854 = class252.method1800(false, var176);
            class280.field4793 = class252.method1800(false, var174);
            class68.field1299 = class171.field2972.method98(true);
            int var178 = class171.field2972.method93(!arg0);
            if (var178 == 255) {
                class107.field1879 = -1;
                return true;
            }
            class52.field923 = var178;
            class136[] var179 = new class136[100];
            for (int var180 = 0; var180 < class52.field923; var180++) {
                var179[var180] = new class136();
                var179[var180].field4265 = class171.field2972.method132(-1);
                var179[var180].field2366 = class252.method1800(false, var179[var180].field4265);
                var179[var180].field2369 = class171.field2972.method116(-1);
                var179[var180].field2375 = class171.field2972.method98(true);
                var179[var180].field2370 = class171.field2972.method105((byte) -49);
                if (class328.field5556 == var179[var180].field4265) {
                    class183.field3183 = var179[var180].field2375;
                }
            }
            int var181 = class52.field923;
            boolean var182 = false;
            while (var181 > 0) {
                boolean var183 = true;
                var181--;
                for (int var184 = 0; var184 < var181; var184++) {
                    if (var179[var184].field2366.method1624(var179[var184 + 1].field2366, (byte) -115) > 0) {
                        var183 = false;
                        class136 var185 = var179[var184];
                        var179[var184] = var179[var184 + 1];
                        var179[var184 + 1] = var185;
                    }
                }
                if (var183) {
                    break;
                }
            }
            class107.field1879 = -1;
            class137.field2376 = var179;
            return true;
        } else if (class107.field1879 == 121) {
            long var186 = class171.field2972.method132(-1);
            class229 var188 = class138.method946(class278.method1956((byte) 114, class171.field2972).method1615(24818));
            class28.method245((byte) -75, 6, class252.method1800(false, var186).method1606((byte) 126), var188);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 55) {
            int var262 = class171.field2972.method102(1192240584);
            int var263 = class171.field2972.method143(0);
            class45.method390(var263, (byte) 86, var262);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 1) {
            class23.field418 = 0;
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 34) {
            long var189 = class171.field2972.method132(-1);
            int var191 = class171.field2972.method116(-1);
            class229 var192 = class27.method242(var191, -30280).method361(!arg0, class171.field2972);
            class274.method1917((class229) null, var191, class252.method1800(false, var189).method1606((byte) 104), var192, 19, -110);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 196) {
            int var193 = class171.field2972.method93(false);
            int var194 = class171.field2972.method93(false);
            int var195 = class171.field2972.method116(-1);
            int var196 = class171.field2972.method93(!arg0);
            int var197 = class171.field2972.method93(false);
            class193.method1319(var194, var195, (byte) -95, var196, var197, var193);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 200) {
            int var198 = class171.field2972.method128((byte) 4);
            int var199 = class171.field2972.method102(1192240584);
            int var200 = class171.field2972.method131(-128);
            if (class324.method2184(var199, (byte) -35)) {
                class331.method2255((byte) 125, var198, var200);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 64) {
            int var201 = class171.field2972.method93(false);
            int var202 = class171.field2972.method93(!arg0);
            int var203 = class171.field2972.method116(-1);
            int var204 = class171.field2972.method93(false);
            int var205 = class171.field2972.method93(!arg0);
            class292.method2026(var202, true, var201, var205, var204, 487899496, var203);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 232) {
            if (class16.field263 != -1) {
                class22.method206(28699, class16.field263, 0);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 9) {
            int var206 = class171.field2972.method102(1192240584);
            if (var206 == 65535) {
                var206 = -1;
            }
            class180.method1241(var206, (byte) -98);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 69) {
            int var260 = class171.field2972.method142((byte) 35);
            if (var260 == 65535) {
                var260 = -1;
            }
            int var261 = class171.field2972.method114(0);
            class161.method1084(var260, var261, -1);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 21) {
            class146.field2530 = class171.field2972.method139((byte) -115);
            class203.field3544 = class171.field2972.method131(-128);
            while (class51.field902 > class171.field2972.field195) {
                class107.field1879 = class171.field2972.method93(false);
                class78.method558(113);
            }
            class107.field1879 = -1;
            return true;
        } else if (!arg0) {
            return false;
        } else if (class107.field1879 == 93) {
            if (class155.field2641 != null) {
                class156.method1044(class186.field3269, -1, false, (byte) 118, -1);
            }
            byte[] var207 = new byte[class51.field902];
            class171.field2972.method1402(0, (byte) -114, var207, class51.field902);
            class229 var208 = class102.method686(class51.field902, 0, true, var207);
            if (class112.field2031 == null && class198.field3455 == 3 || !class198.field3453.startsWith("win") || class312.field5250) {
                class98.method673(1, var208, true);
            } else {
                class173.field3009 = var208;
                class168.field2880 = true;
                class57.field1014 = class215.field3689.method1371(68, new String(var208.method1614((byte) 44), "ISO-8859-1"));
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 171) {
            class229 var257 = class171.field2972.method105((byte) -123);
            int var258 = class171.field2972.method102(1192240584);
            int var259 = class171.field2972.method116(-1);
            if (class324.method2184(var259, (byte) -35)) {
                class143.method996(var257, var258, (byte) -17);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 229) {
            class169.method1147(false, 53);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 168) {
            int var254 = class171.field2972.method116(-1);
            if (var254 == 65535) {
                var254 = -1;
            }
            int var255 = class171.field2972.method116(-1);
            int var256 = class171.field2972.method103(-30563);
            if (class324.method2184(var255, (byte) -35)) {
                class229.method1610(var254, var256, 2, 2);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 106) {
            boolean var240 = false;
            long var241 = class171.field2972.method132(-1);
            int var243 = class171.field2972.method116(-1);
            byte var244 = class171.field2972.method98(arg0);
            if ((var241 & Long.MIN_VALUE) != 0L) {
                var240 = true;
            }
            if (var240) {
                if (class52.field923 == 0) {
                    class107.field1879 = -1;
                    return true;
                }
                long var245 = var241 & Long.MAX_VALUE;
                boolean var247 = false;
                int var248;
                for (var248 = 0; class52.field923 > var248 && (class137.field2376[var248].field4265 != var245 || class137.field2376[var248].field2369 != var243); var248++) {
                }
                if (var248 < class52.field923) {
                    while (var248 < class52.field923 - 1) {
                        class137.field2376[var248] = class137.field2376[var248 + 1];
                        var248++;
                    }
                    class52.field923--;
                    class137.field2376[class52.field923] = null;
                }
            } else {
                class229 var249 = class171.field2972.method105((byte) 127);
                class136 var250 = new class136();
                var250.field4265 = var241;
                var250.field2366 = class252.method1800(false, var250.field4265);
                var250.field2375 = var244;
                var250.field2370 = var249;
                var250.field2369 = var243;
                int var251;
                for (var251 = class52.field923 - 1; var251 >= 0; var251--) {
                    int var252 = class137.field2376[var251].field2366.method1624(var250.field2366, (byte) -119);
                    if (var252 == 0) {
                        class137.field2376[var251].field2369 = var243;
                        class137.field2376[var251].field2375 = var244;
                        class137.field2376[var251].field2370 = var249;
                        if (class328.field5556 == var241) {
                            class183.field3183 = var244;
                        }
                        class21.field351 = class6.field70;
                        class107.field1879 = -1;
                        return true;
                    }
                    if (var252 < 0) {
                        break;
                    }
                }
                if (class137.field2376.length <= class52.field923) {
                    class107.field1879 = -1;
                    return true;
                }
                for (int var253 = class52.field923 - 1; var253 > var251; var253--) {
                    class137.field2376[var253 + 1] = class137.field2376[var253];
                }
                if (class52.field923 == 0) {
                    class137.field2376 = new class136[100];
                }
                class137.field2376[var251 + 1] = var250;
                if (class328.field5556 == var241) {
                    class183.field3183 = var244;
                }
                class52.field923++;
            }
            class107.field1879 = -1;
            class21.field351 = class6.field70;
            return true;
        } else if (class107.field1879 == 161) {
            if (class51.field902 == 0) {
                class144.field2516 = class324.field5469;
            } else {
                class144.field2516 = class171.field2972.method105((byte) -75);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 239) {
            int var232 = class171.field2972.method128((byte) 4);
            int var233 = class171.field2972.method116(-1);
            class67 var234;
            if (var232 >= 0) {
                var234 = class96.method662(var232, true);
            } else {
                var234 = null;
            }
            if (var234 != null) {
                for (int var235 = 0; var235 < var234.field1227.length; var235++) {
                    var234.field1227[var235] = 0;
                    var234.field1153[var235] = 0;
                }
            }
            if (var232 < -70000) {
                var233 += 32768;
            }
            class301.method2065((byte) 38, var233);
            int var236 = class171.field2972.method116(-1);
            for (int var237 = 0; var237 < var236; var237++) {
                int var238 = class171.field2972.method145(94);
                int var239 = class171.field2972.method131(-128);
                if (var239 == 255) {
                    var239 = class171.field2972.method136(!arg0);
                }
                if (var234 != null && var234.field1227.length > var237) {
                    var234.field1227[var237] = var238;
                    var234.field1153[var237] = var239;
                }
                class67.method497(var233, var237, var238 - 1, var239, 0);
            }
            if (var234 != null) {
                class194.method1328((byte) -110, var234);
            }
            class167.method1140(-90);
            class84.field1606[class305.method2086(class104.field1792++, 31)] = class305.method2086(var233, 32767);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 177) {
            for (int var209 = 0; var209 < class192.field3334.length; var209++) {
                if (class192.field3334[var209] != null) {
                    class192.field3334[var209].field2000 = -1;
                }
            }
            for (int var210 = 0; var210 < class331.field5637.length; var210++) {
                if (class331.field5637[var210] != null) {
                    class331.field5637[var210].field2000 = -1;
                }
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 3) {
            class185.field3231 = class171.field2972.method93(false);
            class124.field2181 = class171.field2972.method93(false);
            class314.field5334 = class171.field2972.method93(false);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 180) {
            int var211 = class171.field2972.method142((byte) 35);
            int var212 = class171.field2972.method128((byte) 4);
            int var213 = class171.field2972.method142((byte) 35);
            if (class324.method2184(var213, (byte) -35)) {
                class252.method1799((byte) -114, var211, var212);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 169) {
            int var214 = class171.field2972.method102(1192240584);
            int var215 = class171.field2972.method145(78);
            int var216 = class171.field2972.method135(4);
            int var217 = class171.field2972.method142((byte) 35);
            if (class324.method2184(var217, (byte) -35)) {
                class213.method1463(var216, (var215 << 16) + var214, 13);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 95) {
            int var218 = class171.field2972.method128((byte) 4);
            class169.field2903 = class215.field3689.method1372(var218, (byte) 114);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 244) {
            int var219 = class171.field2972.method102(1192240584);
            int var220 = class171.field2972.method103(-30563);
            class45.method390(var220, (byte) 86, var219);
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 243) {
            class226.method1560((byte) -39);
            class107.field1879 = -1;
            return false;
        } else if (class107.field1879 == 105) {
            int var228 = class171.field2972.method136(false);
            int var229 = class171.field2972.method142((byte) 35);
            int var230 = class171.field2972.method142((byte) 35);
            int var231 = class171.field2972.method102(1192240584);
            if (class324.method2184(var229, (byte) -35)) {
                class229.method1610(var231 | var230 << 16, var228, 7, 2);
            }
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 152) {
            class167.method1140(-117);
            class200.field3496 = class171.field2972.method93(false);
            class238.field4156 = class6.field70;
            class107.field1879 = -1;
            return true;
        } else if (class107.field1879 == 35) {
            int var221 = class171.field2972.method136(false);
            int var222 = class171.field2972.method128((byte) 4);
            int var223 = class171.field2972.method116(-1);
            if (class324.method2184(var223, (byte) -35)) {
                class321 var224 = (class321) class151.field2618.method1890((long) var221, -104);
                class321 var225 = (class321) class151.field2618.method1890((long) var222, -119);
                if (var225 != null) {
                    class282.method1978(-101, var224 == null || var224.field5432 != var225.field5432, var225);
                }
                if (var224 != null) {
                    var224.method1747((byte) -53);
                    class151.field2618.method1885((long) var222, var224, (byte) -81);
                }
                class67 var226 = class96.method662(var221, true);
                if (var226 != null) {
                    class194.method1328((byte) -111, var226);
                }
                class67 var227 = class96.method662(var222, true);
                if (var227 != null) {
                    class194.method1328((byte) -80, var227);
                    class243.method1755(var227, true, -1);
                }
                if (class16.field263 != -1) {
                    class22.method206(28699, class16.field263, 1);
                }
            }
            class107.field1879 = -1;
            return true;
        } else {
            class201.method1407(1, "T1 - " + class107.field1879 + "," + class4.field35 + "," + class283.field4850 + " - " + class51.field902, (Throwable) null);
            class226.method1560((byte) -39);
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 2640)
    public static final void method639(byte arg0) {
        int var1 = -6 % ((arg0 - 63) / 50);
        field1645++;
        class57.field1009.method230(true);
    }
}
