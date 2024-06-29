import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class402 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Laj;")
    public static class71 field5609 = new class71(8);

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field5612 = 1;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lpr;")
    public static class301 field5613 = class446.method2758((byte) -9);

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "J")
    public static long field5614 = -1L;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Lrk;")
    public static class427 field5608;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
    public static final boolean method2459(byte arg0) throws IOException {
        field5607++;
        if (class105.field1540 == null) {
            return false;
        }
        int var1 = class105.field1540.method2732(0);
        if (var1 == 0) {
            return false;
        }
        if (class363.field5019 == -1) {
            class105.field1540.method2733(0, class417.field5851.field3882, 91, 1);
            class417.field5851.field3938 = 0;
            class363.field5019 = class417.field5851.method1800(true);
            var1--;
            class213.field2961 = class153.field2329[class363.field5019];
        }
        if (class213.field2961 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class105.field1540.method2733(0, class417.field5851.field3882, 71, 1);
            var1--;
            class213.field2961 = class417.field5851.field3882[0] & 0xFF;
        }
        if (class213.field2961 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class105.field1540.method2733(0, class417.field5851.field3882, 29, 2);
            class417.field5851.field3938 = 0;
            class213.field2961 = class417.field5851.method1853(-61);
            var1 -= 2;
        }
        if (var1 < class213.field2961) {
            return false;
        }
        class417.field5851.field3938 = 0;
        class105.field1540.method2733(0, class417.field5851.field3882, 40, class213.field2961);
        class118.field1648 = 0;
        class260.field3510 = class213.field2965;
        class213.field2965 = class35.field533;
        class35.field533 = class363.field5019;
        if (class363.field5019 == 179) {
            class348.method2202(0);
            int var2 = class417.field5851.method1832(68);
            int var3 = class417.field5851.method1852((byte) -21);
            int var4 = class417.field5851.method1861((byte) -72);
            class414.field5786[var3] = var2;
            class78.field1163[var3] = var4;
            class426.field6030[var3] = 1;
            int var5 = class200.field2849[var3] - 1;
            for (int var6 = 0; var6 < var5; var6++) {
                if (class212.field2939[var6] <= var2) {
                    class426.field6030[var3] = var6 + 2;
                }
            }
            class295.field3978[class323.method2059(class115.field1616++, 31)] = var3;
            class363.field5019 = -1;
            return true;
        } else if (class363.field5019 == 204) {
            int var7 = class417.field5851.method1861((byte) -72);
            boolean var8 = (var7 & 0x1) == 1;
            String var9 = class417.field5851.method1871(-1);
            String var10 = class417.field5851.method1871(-1);
            String var11 = class417.field5851.method1871(-1);
            String var12 = class417.field5851.method1871(-1);
            if (var8) {
                for (int var13 = 0; var13 < class275.field3702; var13++) {
                    if (class101.field1494[var13].equals(var12)) {
                        class268.field3607[var13] = var9;
                        if (var10.equals("")) {
                            class101.field1494[var13] = var9;
                        } else {
                            class101.field1494[var13] = var10;
                        }
                        class147.field2259[var13] = var11;
                        if (var12.equals("")) {
                            class192.field2772[var13] = var11;
                        } else {
                            class192.field2772[var13] = var12;
                        }
                        break;
                    }
                }
            } else {
                class268.field3607[class275.field3702] = var9;
                if (var10.equals("")) {
                    class101.field1494[class275.field3702] = var9;
                } else {
                    class101.field1494[class275.field3702] = var10;
                }
                class147.field2259[class275.field3702] = var11;
                if (var12.equals("")) {
                    class192.field2772[class275.field3702] = var11;
                } else {
                    class192.field2772[class275.field3702] = var12;
                }
                class305.field4131[class275.field3702] = class323.method2059(2, var7) == 2;
                class275.field3702++;
            }
            class165.field2431 = class387.field5445;
            class363.field5019 = -1;
            return true;
        } else {
            if (arg0 >= -90) {
                method2460(76);
            }
            if (class363.field5019 == 129) {
                int var14 = class417.field5851.method1883(0);
                int var15 = class417.field5851.method1873(-8409);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = class417.field5851.method1828((byte) -56);
                if (class328.method2079(var16, false)) {
                    class329.method2094(var14, 27621, 2, var15, -1);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 224) {
                class417.field5851.field3938 += 28;
                if (class417.field5851.method1831(-101)) {
                    class57.method533(true, class417.field5851.field3938 - 28, class417.field5851);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 181) {
                int var17 = class417.field5851.method1828((byte) -119);
                int var18 = class417.field5851.method1883(0);
                int var19 = class417.field5851.method1853(-50);
                int var20 = class417.field5851.method1856((byte) 58);
                if (class328.method2079(var17, false)) {
                    class329.method2094(var20, 27621, 5, var19, var18);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 109) {
                int var21 = class417.field5851.method1832(38);
                int var22 = class417.field5851.method1828((byte) -99);
                if (class328.method2079(var22, false)) {
                    class329.method2094(var21, 27621, 3, -1, -1);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 22) {
                int var23 = class417.field5851.method1825(-91);
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = class417.field5851.method1883(0);
                int var25 = (var24 & 0x3A884483) >> 28;
                int var26 = (var24 & 0xFFFD5C5) >> 14;
                int var27 = var24 & 0x3FFF;
                int var28 = class417.field5851.method1829(24185);
                int var29 = var28 >> 2;
                int var30 = var28 & 0x3;
                int var31 = class420.field5884[var29];
                int var32 = var27 - class296.field3988;
                int var33 = var26 - class283.field3794;
                class372.method2326(var31, var29, var32, var23, var30, var33, 4, var25);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 189) {
                int var34 = class417.field5851.method1873(-8409);
                int var35 = class417.field5851.method1825(-61);
                String var36 = class417.field5851.method1871(-1);
                if (class328.method2079(var34, false)) {
                    class264.method1702((byte) 124, var36, var35);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 123) {
                class388.method2400(false, -28390);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 0) {
                class442.field6357 = class417.field5851.method1861((byte) -72);
                class381.field5343 = class417.field5851.method1861((byte) -72);
                class446.field6416 = class417.field5851.method1861((byte) -72);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 214) {
                int var37 = class417.field5851.method1853(88);
                int var38 = class417.field5851.method1832(81);
                int var39 = class417.field5851.method1829(24185);
                if (class328.method2079(var37, false)) {
                    class186.method1352(var38, var39, (byte) -78);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 199) {
                int var40 = class417.field5851.method1852((byte) -21);
                int var41 = class417.field5851.method1828((byte) -126);
                int var42 = class417.field5851.method1873(-8409);
                if (class328.method2079(var42, false)) {
                    if (var40 == 2) {
                        class441.method2740(false);
                    }
                    class149.field2288 = var41;
                    class437.method2715(82, var41);
                    class22.method282(false, -113);
                    class18.method263(class149.field2288);
                    for (int var43 = 0; var43 < 100; var43++) {
                        class135.field1930[var43] = true;
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 183) {
                class275.field3702 = class417.field5851.method1861((byte) -72);
                for (int var44 = 0; var44 < class275.field3702; var44++) {
                    class268.field3607[var44] = class417.field5851.method1871(-1);
                    class101.field1494[var44] = class417.field5851.method1871(-1);
                    if (class101.field1494[var44].equals("")) {
                        class101.field1494[var44] = class268.field3607[var44];
                    }
                    class147.field2259[var44] = class417.field5851.method1871(-1);
                    class192.field2772[var44] = class417.field5851.method1871(-1);
                    if (class192.field2772[var44].equals("")) {
                        class192.field2772[var44] = class147.field2259[var44];
                    }
                    class305.field4131[var44] = false;
                }
                class363.field5019 = -1;
                class165.field2431 = class387.field5445;
                return true;
            } else if (class363.field5019 == 107) {
                int var45 = class417.field5851.method1853(92);
                int var46 = class417.field5851.method1861((byte) -72);
                int var47 = class417.field5851.method1861((byte) -72);
                int var48 = class417.field5851.method1853(-26);
                int var49 = class417.field5851.method1861((byte) -72);
                int var50 = class417.field5851.method1861((byte) -72);
                if (class328.method2079(var45, false)) {
                    class265.method1707(var50, var47, var46, (byte) 121, var48, var49, true);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 191) {
                class348.method2202(0);
                class210.field2928 = class417.field5851.method1833(33);
                class363.field5019 = -1;
                class440.field6327 = class387.field5445;
                return true;
            } else if (class363.field5019 == 223) {
                class239.method1589(-101);
                class363.field5019 = -1;
                return false;
            } else if (class363.field5019 == 156) {
                int var51 = class417.field5851.method1856((byte) 31);
                int var52 = class417.field5851.method1853(-48);
                if (var51 < -70000) {
                    var52 += 32768;
                }
                class139 var53;
                if (var51 < 0) {
                    var53 = null;
                } else {
                    var53 = class10.method57(65535, var51);
                }
                if (var53 != null) {
                    for (int var54 = 0; var54 < var53.field2101.length; var54++) {
                        var53.field2101[var54] = 0;
                        var53.field2071[var54] = 0;
                    }
                }
                class392.method2415(var52, -123);
                int var55 = class417.field5851.method1853(-91);
                for (int var56 = 0; var56 < var55; var56++) {
                    int var57 = class417.field5851.method1853(124);
                    int var58 = class417.field5851.method1861((byte) -72);
                    if (var58 == 255) {
                        var58 = class417.field5851.method1883(0);
                    }
                    if (var53 != null && var56 < var53.field2101.length) {
                        var53.field2101[var56] = var57;
                        var53.field2071[var56] = var58;
                    }
                    class66.method571(var52, 1, var56, var57 - 1, var58);
                }
                if (var53 != null) {
                    class10.method52(var53, (byte) -89);
                }
                class348.method2202(0);
                class445.field6401[class323.method2059(class443.field6387++, 31)] = class323.method2059(var52, 32767);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 132) {
                int var59 = class417.field5851.method1832(-98);
                int var60 = class417.field5851.method1853(-108);
                class192.method1381(var60, var59, -120);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 219) {
                boolean var61 = class417.field5851.method1861((byte) -72) == 1;
                String var62 = class417.field5851.method1871(-1);
                String var63 = var62;
                if (var61) {
                    var63 = class417.field5851.method1871(-1);
                }
                long var64 = class417.field5851.method1879((byte) 122);
                long var66 = (long) class417.field5851.method1853(-57);
                long var68 = (long) class417.field5851.method1880((byte) -108);
                int var70 = class417.field5851.method1861((byte) -72);
                long var71 = (var66 << 32) + var68;
                boolean var73 = false;
                int var74 = 0;
                while (true) {
                    if (var74 >= 100) {
                        if (var70 <= 1) {
                            if (!(!class288.field3859 || class128.field1807) || class236.field3282) {
                                var73 = true;
                            } else if (class443.method2750(var63, (byte) 50)) {
                                var73 = true;
                            }
                        }
                        break;
                    }
                    if (class303.field4101[var74] == var71) {
                        var73 = true;
                        break;
                    }
                    var74++;
                }
                if (!var73 && class440.field6320 == 0) {
                    class303.field4101[class160.field2386] = var71;
                    class160.field2386 = (class160.field2386 + 1) % 100;
                    String var75 = class289.method1860(class316.method2014(126, class384.method2383(class417.field5851, -12061)), -4107);
                    if (var70 == 2 || var70 == 3) {
                        class323.method2056(31437, "<img=1>" + var62, var75, 0, "<img=1>" + var63, 9, class40.method392(var64, (byte) 118), -1);
                    } else if (var70 == 1) {
                        class323.method2056(31437, "<img=0>" + var62, var75, 0, "<img=0>" + var63, 9, class40.method392(var64, (byte) 111), -1);
                    } else {
                        class323.method2056(31437, var62, var75, 0, var63, 9, class40.method392(var64, (byte) 119), -1);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 187) {
                class287.field3843 = class417.field5851.method1829(24185);
                class430.field6118 = class417.field5851.method1840((byte) -42);
                for (class396 var76 = (class396) class451.field6514.method608(-31); var76 != null; var76 = (class396) class451.field6514.method606((byte) 75)) {
                    int var78 = (int) (var76.field5349 & 0x3FFFL);
                    int var79 = (int) (var76.field5349 >> 14 & 0x3FFFL);
                    int var80 = (int) (var76.field5349 >> 28 & 0x3L);
                    if (class69.field1046 == var80 && class287.field3843 <= var78 && var78 < (class287.field3843 + 8) && var79 >= class430.field6118 && var79 < (class430.field6118 + 8)) {
                        var76.method2367(5);
                        class392.method2419(var79, class69.field1046, var78, -64);
                    }
                }
                for (class128 var77 = (class128) class399.field5584.method1240((byte) -96); var77 != null; var77 = (class128) class399.field5584.method1245(1)) {
                    if (class287.field3843 <= var77.field1827 && var77.field1827 < class287.field3843 + 8 && var77.field1816 >= class430.field6118 && var77.field1816 < class430.field6118 + 8 && class69.field1046 == var77.field1808) {
                        var77.field1812 = 0;
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 244) {
                int var81 = class417.field5851.method1853(123);
                if (var81 == 65535) {
                    var81 = -1;
                }
                int var82 = class417.field5851.method1883(0);
                int var83 = class417.field5851.method1853(-59);
                if (class328.method2079(var83, false)) {
                    class329.method2094(var82, 27621, 1, var81, -1);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 148) {
                int var84 = class417.field5851.method1825(-74);
                int var85 = class417.field5851.method1883(0);
                int var86 = class417.field5851.method1825(-103);
                int var87 = class417.field5851.method1828((byte) -123);
                int var88 = class417.field5851.method1825(-128);
                if (class328.method2079(var84, false)) {
                    class227.method1531(2190, var87, var86, var85, var88);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 50) {
                int var89 = class417.field5851.method1853(-121);
                int var90 = class417.field5851.method1832(-88);
                int var91 = class417.field5851.method1825(-124);
                if (class328.method2079(var89, false)) {
                    class276.method1767(var91, var90, (byte) 69);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 206) {
                boolean var92 = class417.field5851.method1861((byte) -72) == 1;
                String var93 = class417.field5851.method1871(-1);
                String var94 = var93;
                if (var92) {
                    var94 = class417.field5851.method1871(-1);
                }
                long var95 = class417.field5851.method1879((byte) 122);
                long var97 = (long) class417.field5851.method1853(93);
                long var99 = (long) class417.field5851.method1880((byte) 123);
                int var101 = class417.field5851.method1861((byte) -72);
                int var102 = class417.field5851.method1853(-45);
                long var103 = (var97 << 32) + var99;
                boolean var105 = false;
                int var106 = 0;
                while (true) {
                    if (var106 >= 100) {
                        if (var101 <= 1 && class443.method2750(var94, (byte) 50)) {
                            var105 = true;
                        }
                        break;
                    }
                    if (class303.field4101[var106] == var103) {
                        var105 = true;
                        break;
                    }
                    var106++;
                }
                if (!var105 && class440.field6320 == 0) {
                    class303.field4101[class160.field2386] = var103;
                    class160.field2386 = (class160.field2386 + 1) % 100;
                    String var107 = class335.method2122(var102, 84).method873(81, class417.field5851);
                    if (var101 == 2) {
                        class323.method2056(31437, "<img=1>" + var93, var107, 0, "<img=1>" + var94, 20, class40.method392(var95, (byte) 114), var102);
                    } else if (var101 == 1) {
                        class323.method2056(31437, "<img=0>" + var93, var107, 0, "<img=0>" + var94, 20, class40.method392(var95, (byte) 124), var102);
                    } else {
                        class323.method2056(31437, var93, var107, 0, var94, 20, class40.method392(var95, (byte) 125), var102);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 177) {
                int var108 = class417.field5851.method1829(24185);
                int var109 = class417.field5851.method1873(-8409);
                class192.method1381(var109, var108, 49);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 90) {
                class287.field3843 = class417.field5851.method1829(24185);
                class430.field6118 = class417.field5851.method1840((byte) -116);
                while (class213.field2961 > class417.field5851.field3938) {
                    class363.field5019 = class417.field5851.method1861((byte) -72);
                    class416.method2576(-1);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 247) {
                int var110 = class417.field5851.method1828((byte) -95);
                int var111 = class417.field5851.method1861((byte) -72);
                if (class328.method2079(var110, false)) {
                    class38.field584 = var111;
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 201) {
                for (int var112 = 0; var112 < class414.field5782.length; var112++) {
                    if (class414.field5782[var112] != class125.field1744[var112]) {
                        class414.field5782[var112] = class125.field1744[var112];
                        class329.method2091(-29713, var112);
                        class384.field5389[class323.method2059(31, class386.field5438++)] = var112;
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 225) {
                int var113 = class417.field5851.method1829(24185);
                int var114 = class417.field5851.method1829(24185);
                int var115 = class417.field5851.method1861((byte) -72);
                class69.field1046 = var115 >> 1;
                class95.field1379.method2149(var114, (var115 & 0x1) == 1, class69.field1046, 79, var113);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 102) {
                String var116 = class417.field5851.method1871(-1);
                boolean var117 = class417.field5851.method1861((byte) -72) == 1;
                String var118;
                if (var117) {
                    var118 = class417.field5851.method1871(-1);
                } else {
                    var118 = var116;
                }
                int var119 = class417.field5851.method1853(91);
                byte var120 = class417.field5851.method1868((byte) -119);
                boolean var121 = false;
                if (var120 == -128) {
                    var121 = true;
                }
                if (var121) {
                    if (class229.field3190 == 0) {
                        class363.field5019 = -1;
                        return true;
                    }
                    boolean var127 = false;
                    int var128;
                    for (var128 = 0; var128 < class229.field3190 && (!class264.field3555[var128].field3037.equals(var118) || class264.field3555[var128].field3036 != var119); var128++) {
                    }
                    if (var128 < class229.field3190) {
                        while (class229.field3190 - 1 > var128) {
                            class264.field3555[var128] = class264.field3555[var128 + 1];
                            var128++;
                        }
                        class229.field3190--;
                        class264.field3555[class229.field3190] = null;
                    }
                } else {
                    String var122 = class417.field5851.method1871(-1);
                    class220 var123 = new class220();
                    var123.field3039 = var116;
                    var123.field3040 = var122;
                    var123.field3037 = var118;
                    var123.field3045 = var120;
                    var123.field3036 = var119;
                    int var124;
                    for (var124 = class229.field3190 - 1; var124 >= 0; var124--) {
                        int var125 = class264.field3555[var124].field3037.compareTo(var123.field3037);
                        if (var125 == 0) {
                            class264.field3555[var124].field3036 = var119;
                            class264.field3555[var124].field3045 = var120;
                            class264.field3555[var124].field3040 = var122;
                            if (var118.equals(class95.field1379.field4577)) {
                                class284.field3800 = var120;
                            }
                            class375.field5277 = class387.field5445;
                            class363.field5019 = -1;
                            return true;
                        }
                        if (var125 < 0) {
                            break;
                        }
                    }
                    if (class264.field3555.length <= class229.field3190) {
                        class363.field5019 = -1;
                        return true;
                    }
                    for (int var126 = class229.field3190 - 1; var126 > var124; var126--) {
                        class264.field3555[var126 + 1] = class264.field3555[var126];
                    }
                    if (class229.field3190 == 0) {
                        class264.field3555 = new class220[100];
                    }
                    class264.field3555[var124 + 1] = var123;
                    class229.field3190++;
                    if (var118.equals(class95.field1379.field4577)) {
                        class284.field3800 = var120;
                    }
                }
                class363.field5019 = -1;
                class375.field5277 = class387.field5445;
                return true;
            } else if (class363.field5019 == 248) {
                int var129 = class417.field5851.method1853(-98);
                int var130 = class417.field5851.method1853(88);
                int var131 = class417.field5851.method1853(85);
                int var132 = class417.field5851.method1853(-92);
                if (class328.method2079(var129, false) && class291.field3949[var130] != null) {
                    for (int var133 = var131; var133 < var132; var133++) {
                        int var134 = class417.field5851.method1880((byte) -73);
                        if (class291.field3949[var130].length > var133 && class291.field3949[var130][var133] != null) {
                            class291.field3949[var130][var133].field1993 = var134;
                        }
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 235) {
                class322.field4364 = class417.field5851.method1825(-93) * 30;
                class440.field6327 = class387.field5445;
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 164) {
                int var135 = class417.field5851.method1856((byte) 123);
                int var136 = class417.field5851.method1853(-91);
                if (var135 < -70000) {
                    var136 += 32768;
                }
                class139 var137;
                if (var135 >= 0) {
                    var137 = class10.method57(65535, var135);
                } else {
                    var137 = null;
                }
                while (class213.field2961 > class417.field5851.field3938) {
                    int var138 = class417.field5851.method1821(-79);
                    int var139 = class417.field5851.method1853(-118);
                    int var140 = 0;
                    if (var139 != 0) {
                        var140 = class417.field5851.method1861((byte) -72);
                        if (var140 == 255) {
                            var140 = class417.field5851.method1856((byte) 26);
                        }
                    }
                    if (var137 != null && var138 >= 0 && var137.field2101.length > var138) {
                        var137.field2101[var138] = var139;
                        var137.field2071[var138] = var140;
                    }
                    class66.method571(var136, 1, var138, var139 - 1, var140);
                }
                if (var137 != null) {
                    class10.method52(var137, (byte) -89);
                }
                class348.method2202(0);
                class445.field6401[class323.method2059(class443.field6387++, 31)] = class323.method2059(var136, 32767);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 115) {
                int var141 = class417.field5851.method1856((byte) 89);
                class139 var142 = class10.method57(65535, var141);
                for (int var143 = 0; var143 < var142.field2101.length; var143++) {
                    var142.field2101[var143] = -1;
                    var142.field2101[var143] = 0;
                }
                class10.method52(var142, (byte) -89);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 119) {
                int var144 = class417.field5851.method1825(-92);
                class312.method1994(var144, 12);
                class445.field6401[class323.method2059(class443.field6387++, 31)] = class323.method2059(32767, var144);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 78) {
                int var145 = class417.field5851.method1853(114);
                String var146 = class417.field5851.method1871(-1);
                int var147 = class417.field5851.method1873(-8409);
                if (class328.method2079(var147, false)) {
                    class264.method1702((byte) 124, var146, var145);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 74) {
                int var148 = class417.field5851.method1873(-8409);
                if (var148 == 65535) {
                    var148 = -1;
                }
                String var149 = class417.field5851.method1871(-1);
                int var150 = class417.field5851.method1840((byte) -104);
                int var151 = class417.field5851.method1829(24185);
                if (var151 >= 1 && var151 <= 8) {
                    if (var149.equalsIgnoreCase("null")) {
                        var149 = null;
                    }
                    class410.field5742[var151 - 1] = var149;
                    class398.field5571[var151 - 1] = var148;
                    class107.field1568[var151 - 1] = var150 == 0;
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 131) {
                int var152 = class417.field5851.method1832(-104);
                String var153 = class417.field5851.method1871(-1);
                int var154 = class417.field5851.method1825(-64);
                if (class328.method2079(var154, false)) {
                    class323.method2049(var152, var153, 44);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 73) {
                int var155 = class417.field5851.method1853(103);
                int var156 = class417.field5851.method1828((byte) -57);
                int var157 = class417.field5851.method1820(-110);
                if (class328.method2079(var155, false)) {
                    class39.method387((byte) 115, var157, var156);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 140 || class363.field5019 == 68 || class363.field5019 == 142 || class363.field5019 == 120 || class363.field5019 == 145 || class363.field5019 == 139 || class363.field5019 == 121 || class363.field5019 == 212 || class363.field5019 == 135 || class363.field5019 == 8 || class363.field5019 == 190 || class363.field5019 == 134 || class363.field5019 == 98 || class363.field5019 == 239 || class363.field5019 == 84) {
                class416.method2576(-1);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 168) {
                class57.method539((byte) 72);
                class348.method2202(0);
                class386.field5438 += 32;
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 25) {
                int var158 = class417.field5851.method1853(88);
                String var159 = class417.field5851.method1871(-1);
                Object[] var160 = new Object[var159.length() + 1];
                for (int var161 = var159.length() - 1; var161 >= 0; var161--) {
                    if (var159.charAt(var161) == 's') {
                        var160[var161 + 1] = class417.field5851.method1871(-1);
                    } else {
                        var160[var161 + 1] = Integer.valueOf(class417.field5851.method1856((byte) 97));
                    }
                }
                var160[0] = Integer.valueOf(class417.field5851.method1856((byte) 81));
                if (class328.method2079(var158, false)) {
                    class361 var162 = new class361();
                    var162.field4905 = var160;
                    class18.method267(var162);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 51) {
                int var163 = class417.field5851.method1856((byte) 96);
                int var164 = class417.field5851.method1825(-97);
                int var165 = class417.field5851.method1825(-78);
                if (class328.method2079(var165, false)) {
                    class445.method2752(true, var163, var164);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 69) {
                int var166 = class417.field5851.method1853(-82);
                if (class328.method2079(var166, false)) {
                    class355.method2240((byte) 53);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 124) {
                int var167 = class417.field5851.method1873(-8409);
                byte var168 = class417.field5851.method1868((byte) -125);
                class163.method1217(var168, 0, var167);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 215) {
                int var169 = class417.field5851.method1853(103);
                if (class328.method2079(var169, false)) {
                    class29.method335(10195);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 158) {
                boolean var170 = class417.field5851.method1861((byte) -72) == 1;
                String var171 = class417.field5851.method1871(-1);
                String var172 = class417.field5851.method1871(-1);
                int var173 = class417.field5851.method1853(87);
                int var174 = class417.field5851.method1861((byte) -72);
                String var175 = "";
                boolean var176 = false;
                if (var173 > 0) {
                    var175 = class417.field5851.method1871(-1);
                    var176 = class417.field5851.method1861((byte) -72) == 1;
                }
                for (int var177 = 0; var177 < class123.field1724; var177++) {
                    if (var170) {
                        if (var172.equals(class87.field1294[var177])) {
                            class87.field1294[var177] = var171;
                            var171 = null;
                            class186.field2695[var177] = var172;
                            break;
                        }
                    } else if (var171.equals(class87.field1294[var177])) {
                        if (class127.field1795[var177] != var173) {
                            class127.field1795[var177] = var173;
                            if (var173 > 0) {
                                class67.method588("", 5, 0, "", true, var171 + class423.field5919);
                            }
                            if (var173 == 0) {
                                class67.method588("", 5, 0, "", true, var171 + class443.field6392);
                            }
                        }
                        class186.field2695[var177] = var172;
                        class172.field2523[var177] = var175;
                        class107.field1574[var177] = var174;
                        class314.field4246[var177] = var176;
                        var171 = null;
                        break;
                    }
                }
                if (var171 != null && class123.field1724 < 200) {
                    class87.field1294[class123.field1724] = var171;
                    class186.field2695[class123.field1724] = var172;
                    class127.field1795[class123.field1724] = var173;
                    class172.field2523[class123.field1724] = var175;
                    class107.field1574[class123.field1724] = var174;
                    class314.field4246[class123.field1724] = var176;
                    class123.field1724++;
                }
                class165.field2431 = class387.field5445;
                boolean var178 = false;
                int var179 = class123.field1724;
                while (var179 > 0) {
                    var179--;
                    boolean var180 = true;
                    for (int var181 = 0; var181 < var179; var181++) {
                        if (class127.field1795[var181] != class227.field3144 && class127.field1795[var181 + 1] == class227.field3144 || class127.field1795[var181] == 0 && class127.field1795[var181 + 1] != 0) {
                            int var182 = class127.field1795[var181];
                            class127.field1795[var181] = class127.field1795[var181 + 1];
                            class127.field1795[var181 + 1] = var182;
                            String var183 = class172.field2523[var181];
                            class172.field2523[var181] = class172.field2523[var181 + 1];
                            class172.field2523[var181 + 1] = var183;
                            String var184 = class87.field1294[var181];
                            class87.field1294[var181] = class87.field1294[var181 + 1];
                            class87.field1294[var181 + 1] = var184;
                            String var185 = class186.field2695[var181];
                            class186.field2695[var181] = class186.field2695[var181 + 1];
                            class186.field2695[var181 + 1] = var185;
                            int var186 = class107.field1574[var181];
                            class107.field1574[var181] = class107.field1574[var181 + 1];
                            class107.field1574[var181 + 1] = var186;
                            boolean var187 = class314.field4246[var181];
                            class314.field4246[var181] = class314.field4246[var181 + 1];
                            var180 = false;
                            class314.field4246[var181 + 1] = var187;
                        }
                    }
                    if (var180) {
                        break;
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 153) {
                int var188 = class417.field5851.method1828((byte) -117);
                int var189 = class417.field5851.method1873(-8409);
                int var190 = class417.field5851.method1825(-76);
                if (class328.method2079(var189, false)) {
                    class118.method945(var190, var188, 113, 0);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 202) {
                int var191 = class417.field5851.method1883(0);
                int var192 = class417.field5851.method1856((byte) 96);
                int var193 = class417.field5851.method1873(-8409);
                if (class328.method2079(var193, false)) {
                    class64 var194 = (class64) class204.field2865.method614(-100, (long) var191);
                    class64 var195 = (class64) class204.field2865.method614(-125, (long) var192);
                    if (var195 != null) {
                        class316.method2013(true, var194 == null || var194.field976 != var195.field976, false, var195);
                    }
                    if (var194 != null) {
                        var194.method2367(5);
                        class204.field2865.method612((long) var192, -1, var194);
                    }
                    class139 var196 = class10.method57(65535, var191);
                    if (var196 != null) {
                        class10.method52(var196, (byte) -89);
                    }
                    class139 var197 = class10.method57(65535, var192);
                    if (var197 != null) {
                        class10.method52(var197, (byte) -89);
                        class441.method2738((byte) 78, var197, true);
                    }
                    if (class149.field2288 != -1) {
                        class385.method2389(1, -22715, class149.field2288);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 6) {
                int var198 = class417.field5851.method1861((byte) -72);
                int var199 = class417.field5851.method1861((byte) -72);
                if (var198 == 255) {
                    var198 = -1;
                    var199 = -1;
                }
                class428.method2665(var199, var198, false);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 175) {
                class355.method2242(class417.field5851.method1871(-1), true);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 128) {
                class49.field830 = class417.field5851.method1861((byte) -72);
                class363.field5019 = -1;
                class165.field2431 = class387.field5445;
                return true;
            } else if (class363.field5019 == 62) {
                int var200 = class417.field5851.method1828((byte) -58);
                if (var200 == 65535) {
                    var200 = -1;
                }
                int var201 = class417.field5851.method1852((byte) -21);
                class328.method2082(var200, -11028, var201);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 230) {
                int var202 = class417.field5851.method1853(126);
                if (var202 == 65535) {
                    var202 = -1;
                }
                int var203 = class417.field5851.method1829(24185);
                int var204 = class417.field5851.method1880((byte) -100);
                class295.method1899(var204, -9, var203, var202);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 10) {
                int var205 = class417.field5851.method1883(0);
                int var206 = class417.field5851.method1873(-8409);
                int var207 = class417.field5851.method1829(24185);
                int var208 = class417.field5851.method1853(-104);
                if (class328.method2079(var208, false)) {
                    class64 var209 = (class64) class204.field2865.method614(-113, (long) var205);
                    if (var209 != null) {
                        class316.method2013(true, var209.field976 != var206, false, var209);
                    }
                    class129.method1004(false, var207, var205, 51, var206);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 24) {
                int var210 = class417.field5851.method1873(-8409);
                if (var210 == 65535) {
                    var210 = -1;
                }
                int var211 = class417.field5851.method1832(-98);
                int var212 = class417.field5851.method1853(-54);
                int var213 = class417.field5851.method1873(-8409);
                if (var213 == 65535) {
                    var213 = -1;
                }
                int var214 = class417.field5851.method1853(104);
                if (class328.method2079(var214, false)) {
                    for (int var215 = var213; var215 <= var210; var215++) {
                        long var216 = ((long) var211 << 32) + ((long) var215);
                        class126 var218 = (class126) class204.field2874.method614(-127, var216);
                        class126 var219;
                        if (var218 != null) {
                            var219 = new class126(var218.field1767, var212);
                            var218.method2367(5);
                        } else if (var215 == -1) {
                            var219 = new class126(class10.method57(65535, var211).field2119.field1767, var212);
                        } else {
                            var219 = new class126(0, var212);
                        }
                        class204.field2874.method612(var216, -1, var219);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 196) {
                int var220 = class417.field5851.method1856((byte) 68);
                int var221 = class417.field5851.method1825(-112);
                int var222 = class417.field5851.method1853(121);
                int var223 = class417.field5851.method1825(-84);
                int var224 = class417.field5851.method1828((byte) -46);
                if (class328.method2079(var221, false)) {
                    class329.method2094(var220, 27621, 7, var224 << 16 | var223, var222);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 165) {
                if (class213.field2961 == 0) {
                    class365.field5031 = class365.field5035;
                } else {
                    class365.field5031 = class417.field5851.method1871(-1);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 227) {
                boolean var225 = class417.field5851.method1861((byte) -72) == 1;
                String var226 = class417.field5851.method1871(-1);
                String var227 = var226;
                if (var225) {
                    var227 = class417.field5851.method1871(-1);
                }
                long var228 = (long) class417.field5851.method1853(89);
                long var230 = (long) class417.field5851.method1880((byte) -61);
                int var232 = class417.field5851.method1861((byte) -72);
                long var233 = (var228 << 32) + var230;
                boolean var235 = false;
                int var236 = 0;
                while (true) {
                    if (var236 >= 100) {
                        if (var232 <= 1) {
                            if (!(!class288.field3859 || class128.field1807) || class236.field3282) {
                                var235 = true;
                            } else if (class443.method2750(var227, (byte) 50)) {
                                var235 = true;
                            }
                        }
                        break;
                    }
                    if (class303.field4101[var236] == var233) {
                        var235 = true;
                        break;
                    }
                    var236++;
                }
                if (!var235 && class440.field6320 == 0) {
                    class303.field4101[class160.field2386] = var233;
                    class160.field2386 = (class160.field2386 + 1) % 100;
                    String var237 = class289.method1860(class316.method2014(126, class384.method2383(class417.field5851, -12061)), -4107);
                    if (var232 == 2) {
                        class323.method2056(31437, "<img=1>" + var226, var237, 0, "<img=1>" + var227, 7, (String) null, -1);
                    } else if (var232 == 1) {
                        class323.method2056(31437, "<img=0>" + var226, var237, 0, "<img=0>" + var227, 7, (String) null, -1);
                    } else {
                        class323.method2056(31437, var226, var237, 0, var227, 3, (String) null, -1);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 111) {
                int var238 = class417.field5851.method1820(-111);
                class164.field2419 = class30.field502.method1953(28006, var238);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 193) {
                int var239 = class417.field5851.method1873(-8409);
                int var240 = class417.field5851.method1820(-121);
                if (class328.method2079(var239, false)) {
                    class329.method2094(var240, 27621, 5, 2047, 0);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 125) {
                class348.method2202(0);
                class64.field978 = class417.field5851.method1861((byte) -72);
                class440.field6327 = class387.field5445;
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 188) {
                int var241 = class417.field5851.method1825(-123);
                int var242 = class417.field5851.method1883(0);
                int var243 = class417.field5851.method1825(-62);
                int var244 = class417.field5851.method1828((byte) -40);
                if ((var242 >> 30) != 0) {
                    int var245 = var242 >> 28 & 0x3;
                    int var246 = (var242 >> 14 & 0x3FFF) - class283.field3794;
                    int var247 = (var242 & 0x3FFF) - class296.field3988;
                    if (var246 >= 0 && var247 >= 0 && class116.field1621 > var246 && class385.field5425 > var247) {
                        int var248 = var246 * 128 + 64;
                        int var249 = var247 * 128 + 64;
                        class438 var250 = new class438(var241, 0, class414.field5793, var245, var248, class22.method281(1, var245, var249, var248) - var244, var249, var246, var246, var247, var247);
                        class323.field4395.method1249(new class5(var250), (byte) -128);
                    }
                } else if ((var242 >> 29) != 0) {
                    int var251 = var242 & 0xFFFF;
                    class127 var252 = class298.field4012[var251];
                    if (var252 != null) {
                        if (var241 == 65535) {
                            var241 = -1;
                        }
                        boolean var253 = true;
                        if (var241 != -1 && var252.field4974 != -1) {
                            if (var252.field4974 == var241) {
                                class282 var258 = class71.method613(var241, (byte) -102);
                                if (var258.field3768 && var258.field3765 != -1) {
                                    class209 var259 = class288.method1819(var258.field3765, (byte) 105);
                                    int var260 = var259.field2917;
                                    if (var260 == 0 || var260 == 2) {
                                        var253 = false;
                                    } else if (var260 == 1) {
                                        var253 = true;
                                    }
                                }
                            } else {
                                class282 var254 = class71.method613(var241, (byte) -96);
                                class282 var255 = class71.method613(var252.field4974, (byte) -78);
                                if (var254.field3765 != -1 && var255.field3765 != -1) {
                                    class209 var256 = class288.method1819(var254.field3765, (byte) 105);
                                    class209 var257 = class288.method1819(var255.field3765, (byte) 105);
                                    if (var257.field2906 > var256.field2906) {
                                        var253 = false;
                                    }
                                }
                            }
                        }
                        if (var253) {
                            var252.field4933 = class414.field5793 + var243;
                            var252.field4931 = var244;
                            var252.field4965 = 0;
                            var252.field4974 = var241;
                            var252.field4978 = 1;
                            var252.field4971 = 0;
                            if (var252.field4933 > class414.field5793) {
                                var252.field4965 = -1;
                            }
                            if (var252.field4974 != -1 && class414.field5793 == var252.field4933) {
                                int var261 = class71.method613(var252.field4974, (byte) -84).field3765;
                                if (var261 != -1) {
                                    class209 var262 = class288.method1819(var261, (byte) 105);
                                    if (var262 != null && var262.field2915 != null) {
                                        class232.method1547(13238, var262, var252.field3167, false, 0, var252.field3176);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var242 >> 28) != 0) {
                    int var263 = var242 & 0xFFFF;
                    class338 var264;
                    if (class401.field5606 == var263) {
                        var264 = class95.field1379;
                    } else {
                        var264 = class220.field3044[var263];
                    }
                    if (var264 != null) {
                        if (var241 == 65535) {
                            var241 = -1;
                        }
                        boolean var265 = true;
                        if (var241 != -1 && var264.field4974 != -1) {
                            if (var264.field4974 == var241) {
                                class282 var270 = class71.method613(var241, (byte) -83);
                                if (var270.field3768 && var270.field3765 != -1) {
                                    class209 var271 = class288.method1819(var270.field3765, (byte) 105);
                                    int var272 = var271.field2917;
                                    if (var272 == 0 || var272 == 2) {
                                        var265 = false;
                                    } else if (var272 == 1) {
                                        var265 = true;
                                    }
                                }
                            } else {
                                class282 var266 = class71.method613(var241, (byte) -89);
                                class282 var267 = class71.method613(var264.field4974, (byte) -104);
                                if (var266.field3765 != -1 && var267.field3765 != -1) {
                                    class209 var268 = class288.method1819(var266.field3765, (byte) 105);
                                    class209 var269 = class288.method1819(var267.field3765, (byte) 105);
                                    if (var268.field2906 < var269.field2906) {
                                        var265 = false;
                                    }
                                }
                            }
                        }
                        if (var265) {
                            var264.field4931 = var244;
                            var264.field4974 = var241;
                            var264.field4971 = 0;
                            var264.field4933 = class414.field5793 + var243;
                            var264.field4978 = 1;
                            var264.field4965 = 0;
                            if (var264.field4974 == 65535) {
                                var264.field4974 = -1;
                            }
                            if (class414.field5793 < var264.field4933) {
                                var264.field4965 = -1;
                            }
                            if (var264.field4974 != -1 && class414.field5793 == var264.field4933) {
                                int var273 = class71.method613(var264.field4974, (byte) -126).field3765;
                                if (var273 != -1) {
                                    class209 var274 = class288.method1819(var273, (byte) 105);
                                    if (var274 != null && var274.field2915 != null) {
                                        class232.method1547(13238, var274, var264.field3167, class95.field1379 == var264, 0, var264.field3176);
                                    }
                                }
                            }
                        }
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 171) {
                class398.method2447((byte) -124);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 95) {
                int var275 = class417.field5851.method1825(-113);
                if (var275 == 65535) {
                    var275 = -1;
                }
                int var276 = class417.field5851.method1832(-115);
                int var277 = class417.field5851.method1883(0);
                int var278 = class417.field5851.method1873(-8409);
                if (class328.method2079(var278, false)) {
                    class139 var279 = class10.method57(65535, var276);
                    if (var279.field2048) {
                        class27.method327(var276, 84, var275, var277);
                        class452 var281 = class234.method1569(2142, var275);
                        class227.method1531(2190, var281.field6566, var281.field6548, var276, var281.field6554);
                        class105.method888(var281.field6584, 10, var281.field6594, var281.field6587, var276);
                    } else if (var275 == -1) {
                        class363.field5019 = -1;
                        var279.field2116 = 0;
                        return true;
                    } else {
                        class452 var280 = class234.method1569(2142, var275);
                        var279.field2116 = 4;
                        var279.field2030 = var280.field6566;
                        var279.field2117 = var280.field6548;
                        var279.field2015 = var275;
                        var279.field2044 = var280.field6554 * 100 / var277;
                        class10.method52(var279, (byte) -89);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 232) {
                int var282 = class417.field5851.method1865(12814);
                int var283 = class417.field5851.method1851((byte) 102);
                int var284 = class417.field5851.method1825(-68);
                int var285 = class417.field5851.method1820(-117);
                if (class328.method2079(var284, false)) {
                    class284.method1791((byte) -125, var282, var285, var283);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 254) {
                int var286 = class417.field5851.method1861((byte) -72);
                int var287 = var286 >> 5;
                int var288 = var286 & 0x1F;
                if (var288 == 0) {
                    class16.field186[var287] = null;
                    class363.field5019 = -1;
                    return true;
                }
                class192 var289 = new class192();
                var289.field2763 = var288;
                var289.field2769 = class417.field5851.method1861((byte) -72);
                if (var289.field2769 >= 0 && class377.field5308.length > var289.field2769) {
                    if (var289.field2763 == 1 || var289.field2763 == 10) {
                        var289.field2755 = class417.field5851.method1853(-68);
                        class417.field5851.field3938 += 5;
                    } else if (var289.field2763 >= 2 && var289.field2763 <= 6) {
                        if (var289.field2763 == 2) {
                            var289.field2756 = 64;
                            var289.field2757 = 64;
                        }
                        if (var289.field2763 == 3) {
                            var289.field2757 = 0;
                            var289.field2756 = 64;
                        }
                        if (var289.field2763 == 4) {
                            var289.field2757 = 128;
                            var289.field2756 = 64;
                        }
                        if (var289.field2763 == 5) {
                            var289.field2757 = 64;
                            var289.field2756 = 0;
                        }
                        if (var289.field2763 == 6) {
                            var289.field2756 = 128;
                            var289.field2757 = 64;
                        }
                        var289.field2763 = 2;
                        var289.field2765 = class417.field5851.method1853(-69);
                        var289.field2758 = class417.field5851.method1853(-98);
                        var289.field2759 = class417.field5851.method1861((byte) -72);
                        var289.field2768 = class417.field5851.method1853(-87);
                    }
                    var289.field2761 = class417.field5851.method1853(-27);
                    if (var289.field2761 == 65535) {
                        var289.field2761 = -1;
                    }
                    class16.field186[var287] = var289;
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 216) {
                int var290 = class417.field5851.method1861((byte) -72);
                if (class417.field5851.method1861((byte) -72) == 0) {
                    class393.field5507[var290] = new class89();
                } else {
                    class417.field5851.field3938--;
                    class393.field5507[var290] = new class89(class417.field5851);
                }
                class298.field4016 = class387.field5445;
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 93) {
                int var291 = class417.field5851.method1853(-32);
                int var292 = class417.field5851.method1861((byte) -72);
                int var293 = class417.field5851.method1861((byte) -72);
                int var294 = class417.field5851.method1861((byte) -72);
                int var295 = class417.field5851.method1861((byte) -72);
                int var296 = class417.field5851.method1853(103);
                if (class328.method2079(var291, false)) {
                    class22.field408[var292] = true;
                    class13.field101[var292] = var293;
                    class367.field5044[var292] = var294;
                    class427.field6057[var292] = var295;
                    class377.field5306[var292] = var296;
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 53) {
                int var297 = class417.field5851.method1820(-123);
                int var298 = class417.field5851.method1853(114);
                int var299 = class417.field5851.method1853(122);
                int var300 = class417.field5851.method1873(-8409);
                if (class328.method2079(var300, false)) {
                    class325.method2066(var297, (var299 << 16) + var298, -118);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 97) {
                int var301 = class417.field5851.method1856((byte) 34);
                int var302 = class417.field5851.method1853(106);
                if (var302 == 65535) {
                    var302 = -1;
                }
                int var303 = class417.field5851.method1873(-8409);
                int var304 = class417.field5851.method1828((byte) -38);
                if (var304 == 65535) {
                    var304 = -1;
                }
                int var305 = class417.field5851.method1820(-110);
                if (class328.method2079(var303, false)) {
                    for (int var306 = var302; var306 <= var304; var306++) {
                        long var307 = ((long) var305 << 32) + (long) var306;
                        class126 var309 = (class126) class204.field2874.method614(-94, var307);
                        class126 var310;
                        if (var309 != null) {
                            var310 = new class126(var301, var309.field1766);
                            var309.method2367(5);
                        } else if (var306 == -1) {
                            var310 = new class126(var301, class10.method57(65535, var305).field2119.field1766);
                        } else {
                            var310 = new class126(var301, -1);
                        }
                        class204.field2874.method612(var307, -1, var310);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 152) {
                String var311 = class417.field5851.method1871(-1);
                String var312 = class289.method1860(class316.method2014(-84, class384.method2383(class417.field5851, -12061)), -4107);
                class67.method588(var311, 6, 0, var311, true, var312);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 113) {
                int var313 = class417.field5851.method1873(-8409);
                int var314 = class417.field5851.method1873(-8409);
                int var315 = class417.field5851.method1852((byte) -21);
                class127 var316 = class298.field4012[var313];
                if (var316 != null) {
                    class373.method2332(-74, var316, var315, var314);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 238) {
                class430.field6118 = class417.field5851.method1861((byte) -72);
                class287.field3843 = class417.field5851.method1852((byte) -21);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 3) {
                for (int var317 = 0; var317 < class220.field3044.length; var317++) {
                    if (class220.field3044[var317] != null) {
                        class220.field3044[var317].field4980 = -1;
                    }
                }
                for (int var318 = 0; var318 < class298.field4012.length; var318++) {
                    if (class298.field4012[var318] != null) {
                        class298.field4012[var318].field4980 = -1;
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 39) {
                class75.method649(0);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 180) {
                int var319 = class417.field5851.method1828((byte) -83);
                int var320 = class417.field5851.method1856((byte) 88);
                int var321 = class417.field5851.method1825(-101);
                if (class328.method2079(var319, false)) {
                    class132.method1035(var320, 5203, var321);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 163) {
                class388.method2400(true, -28390);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 60) {
                int var322 = class417.field5851.method1828((byte) -106);
                int var323 = class417.field5851.method1853(99);
                byte var324 = class417.field5851.method1846(false);
                if (class328.method2079(var322, false)) {
                    class445.method2752(true, var324, var323);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 197) {
                int var325 = class417.field5851.method1853(-69);
                int var326 = class417.field5851.method1856((byte) 78);
                if (class328.method2079(var325, false)) {
                    class64 var327 = (class64) class204.field2865.method614(-117, (long) var326);
                    if (var327 != null) {
                        class316.method2013(true, true, false, var327);
                    }
                    if (class331.field4502 != null) {
                        class10.method52(class331.field4502, (byte) -89);
                        class331.field4502 = null;
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 19) {
                class24.field433 = class417.field5851.method1861((byte) -72);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 94) {
                int var328 = class417.field5851.method1853(-40);
                int var329 = class417.field5851.method1861((byte) -72);
                int var330 = class417.field5851.method1861((byte) -72);
                int var331 = class417.field5851.method1853(85);
                int var332 = class417.field5851.method1861((byte) -72);
                int var333 = class417.field5851.method1861((byte) -72);
                if (class328.method2079(var328, false)) {
                    class276.method1771(var332, var330, 3072, var331, var329, var333);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 198) {
                class428.method2660(class417.field5851, class213.field2961, 15, class30.field502);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 112) {
                int var334 = class417.field5851.method1821(-60);
                int var335 = class417.field5851.method1856((byte) 76);
                int var336 = class417.field5851.method1861((byte) -72);
                String var337 = "";
                String var338 = var337;
                if ((var336 & 0x1) != 0) {
                    var337 = class417.field5851.method1871(-1);
                    if ((var336 & 0x2) == 0) {
                        var338 = var337;
                    } else {
                        var338 = class417.field5851.method1871(-1);
                    }
                }
                String var339 = class417.field5851.method1871(-1);
                if (var334 == 99) {
                    class285.method1796(-11011, var339);
                } else if (var338.equals("") || !class443.method2750(var338, (byte) 50)) {
                    class67.method588(var338, var334, var335, var337, true, var339);
                } else {
                    class363.field5019 = -1;
                    return true;
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 89) {
                int var340 = class417.field5851.method1865(12814);
                int var341 = class417.field5851.method1825(-68);
                int var342 = class417.field5851.method1883(0);
                if (class328.method2079(var341, false)) {
                    class57.method528((byte) 117, var340, var342);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 46) {
                int var343 = class417.field5851.method1873(-8409);
                int var344 = class417.field5851.method1856((byte) 96);
                class163.method1217(var344, 0, var343);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 133) {
                if (class149.field2288 != -1) {
                    class385.method2389(0, -22715, class149.field2288);
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 200) {
                boolean var345 = class417.field5851.method1861((byte) -72) == 1;
                String var346 = class417.field5851.method1871(-1);
                String var347 = var346;
                if (var345) {
                    var347 = class417.field5851.method1871(-1);
                }
                long var348 = (long) class417.field5851.method1853(-118);
                long var350 = (long) class417.field5851.method1880((byte) 104);
                int var352 = class417.field5851.method1861((byte) -72);
                int var353 = class417.field5851.method1853(-74);
                long var354 = (var348 << 32) + var350;
                boolean var356 = false;
                int var357 = 0;
                while (true) {
                    if (var357 >= 100) {
                        if (var352 <= 1 && class443.method2750(var347, (byte) 50)) {
                            var356 = true;
                        }
                        break;
                    }
                    if (class303.field4101[var357] == var354) {
                        var356 = true;
                        break;
                    }
                    var357++;
                }
                if (!var356 && class440.field6320 == 0) {
                    class303.field4101[class160.field2386] = var354;
                    class160.field2386 = (class160.field2386 + 1) % 100;
                    String var358 = class335.method2122(var353, 85).method873(113, class417.field5851);
                    if (var352 == 2) {
                        class323.method2056(31437, "<img=1>" + var346, var358, 0, "<img=1>" + var347, 18, (String) null, var353);
                    } else if (var352 == 1) {
                        class323.method2056(31437, "<img=0>" + var346, var358, 0, "<img=0>" + var347, 18, (String) null, var353);
                    } else {
                        class323.method2056(31437, var346, var358, 0, var347, 18, (String) null, var353);
                    }
                }
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 48) {
                if (class416.field5820 != null) {
                    class81.method743((byte) -118, false, -1, class102.field1513, -1);
                }
                byte[] var359 = new byte[class213.field2961];
                class417.field5851.method1805(class213.field2961, 0, var359, 8);
                String var360 = class267.method1715(var359, class213.field2961, 0, 97);
                class285.method1794(var360, true, class243.field3355 == 1, class30.field502, 3);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 249) {
                int var361 = class417.field5851.method1853(-45);
                if (var361 == 65535) {
                    var361 = -1;
                }
                int var362 = class417.field5851.method1861((byte) -72);
                int var363 = class417.field5851.method1853(96);
                int var364 = class417.field5851.method1861((byte) -72);
                class280.method1778(var362, var364, var363, true, var361);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 170) {
                String var365 = class417.field5851.method1871(-1);
                int var366 = class417.field5851.method1853(121);
                String var367 = class335.method2122(var366, 88).method873(48, class417.field5851);
                class323.method2056(31437, var365, var367, 0, var365, 19, (String) null, var366);
                class363.field5019 = -1;
                return true;
            } else if (class363.field5019 == 217) {
                class375.field5277 = class387.field5445;
                if (class213.field2961 == 0) {
                    class363.field5019 = -1;
                    class264.field3555 = null;
                    class132.field1876 = null;
                    class431.field6129 = null;
                    class229.field3190 = 0;
                    return true;
                }
                class431.field6129 = class417.field5851.method1871(-1);
                boolean var368 = class417.field5851.method1861((byte) -72) == 1;
                if (var368) {
                    class417.field5851.method1871(-1);
                }
                long var369 = class417.field5851.method1879((byte) 122);
                class132.field1876 = class262.method1685(true, var369);
                class326.field4436 = class417.field5851.method1868((byte) -128);
                int var371 = class417.field5851.method1861((byte) -72);
                if (var371 == 255) {
                    class363.field5019 = -1;
                    return true;
                }
                class229.field3190 = var371;
                class220[] var372 = new class220[100];
                for (int var373 = 0; var373 < class229.field3190; var373++) {
                    var372[var373] = new class220();
                    var372[var373].field3039 = class417.field5851.method1871(-1);
                    boolean var379 = class417.field5851.method1861((byte) -72) == 1;
                    if (var379) {
                        var372[var373].field3037 = class417.field5851.method1871(-1);
                    } else {
                        var372[var373].field3037 = var372[var373].field3039;
                    }
                    var372[var373].field3036 = class417.field5851.method1853(-62);
                    var372[var373].field3045 = class417.field5851.method1868((byte) -122);
                    var372[var373].field3040 = class417.field5851.method1871(-1);
                    if (var372[var373].field3037.equals(class95.field1379.field4577)) {
                        class284.field3800 = var372[var373].field3045;
                    }
                }
                boolean var374 = false;
                int var375 = class229.field3190;
                while (var375 > 0) {
                    boolean var376 = true;
                    var375--;
                    for (int var377 = 0; var377 < var375; var377++) {
                        if (var372[var377].field3039.compareTo(var372[var377 + 1].field3039) > 0) {
                            class220 var378 = var372[var377];
                            var372[var377] = var372[var377 + 1];
                            var376 = false;
                            var372[var377 + 1] = var378;
                        }
                    }
                    if (var376) {
                        break;
                    }
                }
                class363.field5019 = -1;
                class264.field3555 = var372;
                return true;
            } else {
                class380.method2365(-2, "T1 - " + class363.field5019 + "," + class213.field2965 + "," + class260.field3510 + " - " + class213.field2961, (Throwable) null);
                class239.method1589(107);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method2460(int arg0) {
        field5608 = null;
        if (arg0 >= -121) {
            method2460(-6);
        }
        field5609 = null;
        field5613 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILbi;)V")
    public static final void method2461(int arg0, int arg1, int arg2, class139 arg3) {
        field5611++;
        class101.field1490 = arg0;
        if (arg2 >= 37) {
            class172.field2517 = arg3;
            class378.field5332 = arg1;
        }
    }
}
