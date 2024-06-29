import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class51 extends class134 {

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[I")
    public int[] field686;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "[I")
    public int[] field691;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "[[I")
    public int[][] field695;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "[Z")
    public boolean[] field696;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Z")
    public static boolean field687 = true;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field689 = 0;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Lfa;")
    public static class273 field694;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Lfa;")
    public static class273 field698;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "[Lti;")
    public static class5[] field688;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)Z")
    public static final boolean method308(int arg0) throws IOException {
        field692++;
        if (class103.field1551 == null) {
            return false;
        }
        int var1 = class103.field1551.method1283((byte) -79);
        if (var1 == 0) {
            return false;
        }
        if (class223.field3548 == -1) {
            class103.field1551.method1280(true, 1, 0, class192.field3042.field3234);
            var1--;
            class192.field3042.field3272 = 0;
            class223.field3548 = class192.field3042.method1392((byte) -119);
            class20.field272 = class86.field1352[class223.field3548];
        }
        if (class20.field272 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class103.field1551.method1280(true, 1, 0, class192.field3042.field3234);
            class20.field272 = class192.field3042.field3234[0] & 0xFF;
            var1--;
        }
        if (class20.field272 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class103.field1551.method1280(true, 2, 0, class192.field3042.field3234);
            class192.field3042.field3272 = 0;
            class20.field272 = class192.field3042.method1419(100);
        }
        if (class20.field272 > var1) {
            return false;
        }
        class192.field3042.field3272 = 0;
        class103.field1551.method1280(true, class20.field272, 0, class192.field3042.field3234);
        class310.field5016 = 0;
        class313.field5040 = class50.field680;
        class50.field680 = class263.field4337;
        class263.field4337 = class223.field3548;
        if (class223.field3548 == 125) {
            int var2 = class192.field3042.method1410(true);
            int var3 = class192.field3042.method1405(-125);
            class22.method128(var3, var2, 29127);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 6) {
            int var4 = class192.field3042.method1454(true);
            byte var5 = class192.field3042.method1457((byte) -82);
            class285.method2010(2, var4, var5);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 74) {
            int var6 = class192.field3042.method1419(83);
            if (class126.method843((byte) 29, var6)) {
                class301.method2079((byte) -64);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 25) {
            class75.method493(true);
            class137.method914(0);
            class223.field3548 = -1;
            class84.field1333 += 32;
            return true;
        } else if (class223.field3548 == 198) {
            int var7 = class192.field3042.method1455((byte) -99);
            int var8 = class192.field3042.method1454(true);
            int var9 = class192.field3042.method1440(20404);
            if (class126.method843((byte) -126, var8)) {
                class124.method819(var9, 30, var7);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 42) {
            class76.field1196 = class192.field3042.method1420((byte) 0);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 255) {
            class219.method1531(-21836);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 110) {
            int var10 = class192.field3042.method1424(31523);
            class235.field3725 = class259.field4254.method1773(var10, 0);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 83) {
            class227.method1578(0);
            class223.field3548 = -1;
            return false;
        } else if (class223.field3548 == 69) {
            int var11 = class192.field3042.method1419(113);
            int var12 = class192.field3042.method1420((byte) 0);
            int var13 = class192.field3042.method1420((byte) 0);
            int var14 = class192.field3042.method1419(105);
            int var15 = class192.field3042.method1420((byte) 0);
            int var16 = class192.field3042.method1420((byte) 0);
            if (class126.method843((byte) -120, var11)) {
                class12.method65(var12, var16, true, var14, (byte) 75, var15, var13);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 142) {
            class20.field270 = class192.field3042.method1420((byte) 0);
            for (int var17 = 0; var17 < class20.field270; var17++) {
                class143.field2257[var17] = class192.field3042.method1403(-128);
                class174.field2714[var17] = class192.field3042.method1403(-125);
                if (class174.field2714[var17].equals("")) {
                    class174.field2714[var17] = class143.field2257[var17];
                }
                class296.field4876[var17] = class192.field3042.method1403(-123);
                class300.field4933[var17] = class192.field3042.method1403(-128);
                if (class300.field4933[var17].equals("")) {
                    class300.field4933[var17] = class296.field4876[var17];
                }
                class6.field53[var17] = false;
            }
            class287.field4783 = class40.field502;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 66) {
            int var18 = class192.field3042.method1440(20404);
            int var19 = class192.field3042.method1419(105);
            if (var18 < -70000) {
                var19 += 32768;
            }
            class254 var20;
            if (var18 < 0) {
                var20 = null;
            } else {
                var20 = class80.method534(127, var18);
            }
            if (var20 != null) {
                for (int var21 = 0; var21 < var20.field4068.length; var21++) {
                    var20.field4068[var21] = 0;
                    var20.field4021[var21] = 0;
                }
            }
            class127.method846((byte) 125, var19);
            int var22 = class192.field3042.method1419(94);
            for (int var23 = 0; var23 < var22; var23++) {
                int var24 = class192.field3042.method1405(-126);
                if (var24 == 255) {
                    var24 = class192.field3042.method1439(false);
                }
                int var25 = class192.field3042.method1410(true);
                if (var20 != null && var20.field4068.length > var23) {
                    var20.field4068[var23] = var25;
                    var20.field4021[var23] = var24;
                }
                class126.method840(-105, var19, var24, var25 - 1, var23);
            }
            if (var20 != null) {
                class58.method354(true, var20);
            }
            class137.method914(0);
            class312.field5034[class10.method53(31, class226.field3591++)] = class10.method53(var19, 32767);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 106) {
            boolean var26 = class192.field3042.method1420((byte) 0) == 1;
            String var27 = class192.field3042.method1403(-125);
            String var28 = var27;
            if (var26) {
                var28 = class192.field3042.method1403(-128);
            }
            long var29 = (long) class192.field3042.method1419(113);
            boolean var31 = false;
            long var32 = (long) class192.field3042.method1401((byte) -95);
            int var34 = class192.field3042.method1420((byte) 0);
            long var35 = (var29 << 32) + var32;
            int var37 = class192.field3042.method1419(68);
            int var38 = 0;
            while (true) {
                if (var38 >= 100) {
                    if (var34 <= 1 && class304.method2086(var28, 1)) {
                        var31 = true;
                    }
                    break;
                }
                if (class70.field1015[var38] == var35) {
                    var31 = true;
                    break;
                }
                var38++;
            }
            if (!var31 && class278.field4602 == 0) {
                class70.field1015[class174.field2723] = var35;
                class174.field2723 = (class174.field2723 + 1) % 100;
                String var39 = class79.method532(-32769, var37).method1170(class192.field3042, (byte) 124);
                if (var34 == 2) {
                    class74.method481("<img=1>" + var28, 99, "<img=1>" + var27, 0, var39, var37, (String) null, 18);
                } else if (var34 == 1) {
                    class74.method481("<img=0>" + var28, 99, "<img=0>" + var27, 0, var39, var37, (String) null, 18);
                } else {
                    class74.method481(var28, 99, var27, 0, var39, var37, (String) null, 18);
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 144) {
            String var40 = class192.field3042.method1403(-126);
            int var41 = class192.field3042.method1455((byte) -99);
            int var42 = class192.field3042.method1424(31523);
            if (class126.method843((byte) 98, var41)) {
                class10.method54(var40, var42, -31105);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 251) {
            class137.method914(0);
            int var43 = class192.field3042.method1420((byte) 0);
            int var44 = class192.field3042.method1404(252);
            int var45 = class192.field3042.method1420((byte) 0);
            class113.field1710[var43] = var44;
            class189.field2911[var43] = var45;
            class177.field2757[var43] = 1;
            for (int var46 = 0; var46 < 98; var46++) {
                if (var44 >= class118.field1808[var46]) {
                    class177.field2757[var43] = var46 + 2;
                }
            }
            class313.field5050[class10.method53(class159.field2511++, 31)] = var43;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 34) {
            int var47 = class192.field3042.method1404(252);
            int var48 = class192.field3042.method1410(true);
            int var49 = class192.field3042.method1454(true);
            int var50 = class192.field3042.method1410(true);
            int var51 = class192.field3042.method1454(true);
            if (class126.method843((byte) 120, var51)) {
                class111.method712(var49 << 16 | var50, var48, var47, (byte) 27, 7);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 167) {
            int var52 = class192.field3042.method1410(true);
            int var53 = class192.field3042.method1410(true);
            int var54 = class192.field3042.method1440(20404);
            int var55 = class192.field3042.method1424(31523);
            if (class126.method843((byte) 31, var53)) {
                class111.method712(var52, var54, var55, (byte) 27, 5);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 9) {
            class128.method850(class192.field3042.method1403(-123), 125);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 29) {
            int var56 = class192.field3042.method1410(true);
            int var57 = class192.field3042.method1419(64);
            int var58 = class192.field3042.method1424(31523);
            int var59 = class192.field3042.method1455((byte) -99);
            int var60 = class192.field3042.method1410(true);
            if (class126.method843((byte) 86, var56)) {
                class181.method1206(var59, var57, var60, (byte) -83, var58);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 72) {
            int var61 = class192.field3042.method1455((byte) -99);
            byte var62 = class192.field3042.method1431(-19768);
            int var63 = class192.field3042.method1455((byte) -99);
            if (class126.method843((byte) 64, var61)) {
                class124.method819(var62, 30, var63);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 190) {
            if (class160.field2523 != -1) {
                class117.method756(false, class160.field2523, 0);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 73) {
            if (class20.field272 == 0) {
                class276.field4578 = class221.field3543;
            } else {
                class276.field4578 = class192.field3042.method1403(-125);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 33) {
            int var64 = class192.field3042.method1419(119);
            int var65 = class192.field3042.method1419(117);
            int var66 = class192.field3042.method1454(true);
            if (class126.method843((byte) -96, var65)) {
                class223.method1560(var64, -126, var66);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 131) {
            int var67 = class192.field3042.method1455((byte) -99);
            int var68 = class192.field3042.method1454(true);
            int var69 = class192.field3042.method1420((byte) 0);
            if (class126.method843((byte) 119, var68)) {
                if (var69 == 2) {
                    class143.method965(25);
                }
                class160.field2523 = var67;
                class135.method905(var67, (byte) 117);
                class219.method1533(false, 90);
                class125.method836(-4, class160.field2523);
                for (int var70 = 0; var70 < 100; var70++) {
                    class283.field4731[var70] = true;
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 126) {
            int var71 = class192.field3042.method1455((byte) -99);
            int var72 = class192.field3042.method1410(true);
            int var73 = class192.field3042.method1424(31523);
            if (var72 == 65535) {
                var72 = -1;
            }
            if (class126.method843((byte) -99, var71)) {
                class111.method712(var72, -1, var73, (byte) 27, 2);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 206) {
            int var74 = class192.field3042.method1420((byte) 0);
            if (class192.field3042.method1420((byte) 0) == 0) {
                class160.field2529[var74] = new class295();
            } else {
                class192.field3042.field3272--;
                class160.field2529[var74] = new class295(class192.field3042);
            }
            class229.field3655 = class40.field502;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 199) {
            class137.method914(0);
            class212.field3388 = class192.field3042.method1420((byte) 0);
            class96.field1419 = class40.field502;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 15) {
            class186.field2887 = class40.field502;
            if (class20.field272 == 0) {
                class59.field904 = null;
                class7.field68 = null;
                class276.field4567 = null;
                class223.field3548 = -1;
                class297.field4885 = 0;
                return true;
            }
            class59.field904 = class192.field3042.method1403(-127);
            boolean var75 = class192.field3042.method1420((byte) 0) == 1;
            if (var75) {
                class192.field3042.method1403(-125);
            }
            long var76 = class192.field3042.method1430(false);
            class7.field68 = class2.method6(var76, (byte) 125);
            class236.field3747 = class192.field3042.method1457((byte) -126);
            int var78 = class192.field3042.method1420((byte) 0);
            if (var78 == 255) {
                class223.field3548 = -1;
                return true;
            }
            class138[] var79 = new class138[100];
            class297.field4885 = var78;
            for (int var80 = 0; var80 < class297.field4885; var80++) {
                var79[var80] = new class138();
                var79[var80].field2138 = class192.field3042.method1403(-123);
                boolean var86 = class192.field3042.method1420((byte) 0) == 1;
                if (var86) {
                    var79[var80].field2132 = class192.field3042.method1403(-125);
                } else {
                    var79[var80].field2132 = var79[var80].field2138;
                }
                var79[var80].field2144 = class192.field3042.method1419(116);
                var79[var80].field2140 = class192.field3042.method1457((byte) -85);
                var79[var80].field2137 = class192.field3042.method1403(-123);
                if (var79[var80].field2132.equals(class309.field5006.field3329)) {
                    class252.field3991 = var79[var80].field2140;
                }
            }
            boolean var81 = false;
            int var82 = class297.field4885;
            while (var82 > 0) {
                boolean var83 = true;
                var82--;
                for (int var84 = 0; var84 < var82; var84++) {
                    if (var79[var84].field2138.compareTo(var79[var84 + 1].field2138) > 0) {
                        class138 var85 = var79[var84];
                        var83 = false;
                        var79[var84] = var79[var84 + 1];
                        var79[var84 + 1] = var85;
                    }
                }
                if (var83) {
                    break;
                }
            }
            class223.field3548 = -1;
            class276.field4567 = var79;
            return true;
        } else if (class223.field3548 == 119) {
            class192.field3042.field3272 += 28;
            if (class192.field3042.method1406(4)) {
                class165.method1107(class192.field3042, 3940, class192.field3042.field3272 - 28);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 4) {
            int var87 = class192.field3042.method1419(95);
            class175.method1177(0, var87);
            class312.field5034[class10.method53(31, class226.field3591++)] = class10.method53(32767, var87);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 129) {
            byte[] var88 = new byte[class20.field272];
            class192.field3042.method1395(65, class20.field272, 0, var88);
            String var89 = class223.method1558(class20.field272, 0, var88, false);
            if (class224.field3565 == null && class255.field4217 == 3 || !class255.field4203.startsWith("win") || class34.field420) {
                class182.method1210(var89, true, true);
            } else {
                class212.field3387 = true;
                class300.field4929 = var89;
                class104.field1569 = class259.field4254.method1786(119, var89);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 75) {
            class117.field1784 = class192.field3042.method1420((byte) 0);
            class287.field4783 = class40.field502;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 41) {
            int var90 = class192.field3042.method1419(80);
            int var91 = class192.field3042.method1454(true);
            int var92 = class192.field3042.method1439(false);
            int var93 = class192.field3042.method1455((byte) -99);
            if (var92 >> 30 != 0) {
                int var94 = (var92 & 0x3FFF) - class254.field4063;
                int var95 = (var92 & 0x35E03CE7) >> 28;
                int var96 = (var92 >> 14 & 0x3FFF) - class101.field1517;
                if (var96 >= 0 && var94 >= 0 && var96 < 104 && var94 < 104) {
                    int var97 = var96 * 128 + 64;
                    int var98 = var94 * 128 + 64;
                    class73 var99 = new class73(var90, var95, var97, var98, class12.method66(var97, var95, var98, 0) - var93, var91, class4.field32);
                    class258.field4233.method1952(new class309(var99), 76);
                }
            } else if ((var92 >> 29) != 0) {
                int var100 = var92 & 0xFFFF;
                class35 var101 = class76.field1188[var100];
                if (var101 != null) {
                    if (var90 == 65535) {
                        var90 = -1;
                    }
                    boolean var102 = true;
                    if (var90 != -1 && var101.field870 != -1) {
                        if (var101.field870 == var90) {
                            class119 var107 = class278.method1939(var90, (byte) -116);
                            if (var107.field1833 && var107.field1810 != -1) {
                                class200 var108 = class196.method1359(var107.field1810, (byte) 21);
                                int var109 = var108.field3171;
                                if (var109 == 1) {
                                    var101.field830 = 0;
                                    var102 = false;
                                    var101.field827 = class4.field32 + var91;
                                    var101.field829 = 0;
                                    var101.field826 = 0;
                                    var101.field799 = 1;
                                    class49.method303(false, false, var101.field836, var101.field829, var108, var101.field850);
                                } else if (var109 == 2) {
                                    var102 = false;
                                    var101.field889 = 0;
                                }
                            }
                        } else {
                            class119 var103 = class278.method1939(var90, (byte) -106);
                            class119 var104 = class278.method1939(var101.field870, (byte) -96);
                            if (var103.field1810 != -1 && var104.field1810 != -1) {
                                class200 var105 = class196.method1359(var103.field1810, (byte) 21);
                                class200 var106 = class196.method1359(var104.field1810, (byte) 21);
                                if (var106.field3173 > var105.field3173) {
                                    var102 = false;
                                }
                            }
                        }
                    }
                    if (var102) {
                        var101.field829 = 0;
                        var101.field870 = var90;
                        var101.field887 = var93;
                        var101.field799 = 1;
                        var101.field827 = class4.field32 + var91;
                        if (class4.field32 < var101.field827) {
                            var101.field829 = -1;
                        }
                        var101.field830 = 0;
                        if (var101.field870 != -1 && class4.field32 == var101.field827) {
                            int var110 = class278.method1939(var101.field870, (byte) -101).field1810;
                            if (var110 != -1) {
                                class200 var111 = class196.method1359(var110, (byte) 21);
                                if (var111 != null && var111.field3167 != null) {
                                    class49.method303(false, false, var101.field836, 0, var111, var101.field850);
                                }
                            }
                        }
                    }
                }
            } else if ((var92 >> 28) != 0) {
                int var112 = var92 & 0xFFFF;
                class208 var113;
                if (class31.field396 == var112) {
                    var113 = class309.field5006;
                } else {
                    var113 = class300.field4925[var112];
                }
                if (var113 != null) {
                    if (var90 == 65535) {
                        var90 = -1;
                    }
                    boolean var114 = true;
                    if (var90 != -1 && var113.field870 != -1) {
                        if (var113.field870 == var90) {
                            class119 var115 = class278.method1939(var90, (byte) -92);
                            if (var115.field1833 && var115.field1810 != -1) {
                                class200 var116 = class196.method1359(var115.field1810, (byte) 21);
                                int var117 = var116.field3171;
                                if (var117 == 1) {
                                    var113.field826 = 0;
                                    var113.field827 = class4.field32 + var91;
                                    var113.field829 = 0;
                                    var114 = false;
                                    var113.field830 = 0;
                                    var113.field799 = 1;
                                    class49.method303(false, false, var113.field836, var113.field829, var116, var113.field850);
                                } else if (var117 == 2) {
                                    var113.field889 = 0;
                                    var114 = false;
                                }
                            }
                        } else {
                            class119 var118 = class278.method1939(var90, (byte) -127);
                            class119 var119 = class278.method1939(var113.field870, (byte) -99);
                            if (var118.field1810 != -1 && var119.field1810 != -1) {
                                class200 var120 = class196.method1359(var118.field1810, (byte) 21);
                                class200 var121 = class196.method1359(var119.field1810, (byte) 21);
                                if (var121.field3173 > var120.field3173) {
                                    var114 = false;
                                }
                            }
                        }
                    }
                    if (var114) {
                        var113.field829 = 0;
                        var113.field799 = 1;
                        var113.field827 = class4.field32 + var91;
                        var113.field870 = var90;
                        var113.field887 = var93;
                        var113.field830 = 0;
                        if (var113.field870 == 65535) {
                            var113.field870 = -1;
                        }
                        if (class4.field32 < var113.field827) {
                            var113.field829 = -1;
                        }
                        if (var113.field870 != -1 && class4.field32 == var113.field827) {
                            int var122 = class278.method1939(var113.field870, (byte) -90).field1810;
                            if (var122 != -1) {
                                class200 var123 = class196.method1359(var122, (byte) 21);
                                if (var123 != null && var123.field3167 != null) {
                                    class49.method303(false, class309.field5006 == var113, var113.field836, 0, var123, var113.field850);
                                }
                            }
                        }
                    }
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 149) {
            int var124 = class192.field3042.method1419(120);
            int var125 = class192.field3042.method1420((byte) 0);
            int var126 = class192.field3042.method1419(85);
            int var127 = class192.field3042.method1420((byte) 0);
            if (var124 == 65535) {
                var124 = -1;
            }
            class78.method520(-1, var125, var124, var126, var127);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 226) {
            boolean var128 = class192.field3042.method1420((byte) 0) == 1;
            String var129 = class192.field3042.method1403(-125);
            String var130 = var129;
            if (var128) {
                var130 = class192.field3042.method1403(-126);
            }
            long var131 = class192.field3042.method1430(false);
            boolean var133 = false;
            long var134 = (long) class192.field3042.method1419(107);
            long var136 = (long) class192.field3042.method1401((byte) -120);
            long var138 = (var134 << 32) + var136;
            int var140 = class192.field3042.method1420((byte) 0);
            int var141 = 0;
            while (true) {
                if (var141 >= 100) {
                    if (var140 <= 1) {
                        if (!(!class45.field625 || class302.field4951) || class124.field1894) {
                            var133 = true;
                        } else if (class304.method2086(var130, 1)) {
                            var133 = true;
                        }
                    }
                    break;
                }
                if (class70.field1015[var141] == var138) {
                    var133 = true;
                    break;
                }
                var141++;
            }
            if (!var133 && class278.field4602 == 0) {
                class70.field1015[class174.field2723] = var138;
                class174.field2723 = (class174.field2723 + 1) % 100;
                String var142 = class116.method755(class14.method91((byte) 122, class52.method312(class192.field3042, 1)));
                if (var140 == 2 || var140 == 3) {
                    class74.method481("<img=1>" + var130, 99, "<img=1>" + var129, 0, var142, -1, class137.method919(var131, 0), 9);
                } else if (var140 == 1) {
                    class74.method481("<img=0>" + var130, 99, "<img=0>" + var129, 0, var142, -1, class137.method919(var131, 0), 9);
                } else {
                    class74.method481(var130, 99, var129, 0, var142, -1, class137.method919(var131, 0), 9);
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 105) {
            class104.method675((byte) 122, true);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 61) {
            int var143 = class192.field3042.method1419(116);
            if (class126.method843((byte) -123, var143)) {
                class288.method2023(789221);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 20) {
            class187.field2899 = class192.field3042.method1420((byte) 0);
            class113.field1705 = class192.field3042.method1420((byte) 0);
            class162.field2558 = class192.field3042.method1420((byte) 0);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 127) {
            String var144 = class192.field3042.method1403(-124);
            boolean var145 = false;
            boolean var146 = class192.field3042.method1420((byte) 0) == 1;
            String var147;
            if (var146) {
                var147 = class192.field3042.method1403(-124);
            } else {
                var147 = var144;
            }
            int var148 = class192.field3042.method1419(92);
            byte var149 = class192.field3042.method1457((byte) -113);
            if (var149 == -128) {
                var145 = true;
            }
            if (var145) {
                if (class297.field4885 == 0) {
                    class223.field3548 = -1;
                    return true;
                }
                boolean var155 = false;
                int var156;
                for (var156 = 0; class297.field4885 > var156 && (!class276.field4567[var156].field2132.equals(var147) || class276.field4567[var156].field2144 != var148); var156++) {
                }
                if (class297.field4885 > var156) {
                    while (var156 < class297.field4885 - 1) {
                        class276.field4567[var156] = class276.field4567[var156 + 1];
                        var156++;
                    }
                    class297.field4885--;
                    class276.field4567[class297.field4885] = null;
                }
            } else {
                String var150 = class192.field3042.method1403(-127);
                class138 var151 = new class138();
                var151.field2138 = var144;
                var151.field2137 = var150;
                var151.field2132 = var147;
                var151.field2144 = var148;
                var151.field2140 = var149;
                int var152;
                for (var152 = class297.field4885 - 1; var152 >= 0; var152--) {
                    int var153 = class276.field4567[var152].field2132.compareTo(var151.field2132);
                    if (var153 == 0) {
                        class276.field4567[var152].field2144 = var148;
                        class276.field4567[var152].field2140 = var149;
                        class276.field4567[var152].field2137 = var150;
                        if (var147.equals(class309.field5006.field3329)) {
                            class252.field3991 = var149;
                        }
                        class186.field2887 = class40.field502;
                        class223.field3548 = -1;
                        return true;
                    }
                    if (var153 < 0) {
                        break;
                    }
                }
                if (class276.field4567.length <= class297.field4885) {
                    class223.field3548 = -1;
                    return true;
                }
                for (int var154 = class297.field4885 - 1; var154 > var152; var154--) {
                    class276.field4567[var154 + 1] = class276.field4567[var154];
                }
                if (class297.field4885 == 0) {
                    class276.field4567 = new class138[100];
                }
                class276.field4567[var152 + 1] = var151;
                class297.field4885++;
                if (var147.equals(class309.field5006.field3329)) {
                    class252.field3991 = var149;
                }
            }
            class186.field2887 = class40.field502;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 230) {
            class104.method675((byte) 125, false);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 133) {
            class137.method914(0);
            class187.field2895 = class192.field3042.method1442(-1970239824);
            class223.field3548 = -1;
            class96.field1419 = class40.field502;
            return true;
        } else if (class223.field3548 == 11) {
            int var157 = class192.field3042.method1439(false);
            int var158 = class192.field3042.method1440(20404);
            int var159 = class192.field3042.method1455((byte) -99);
            if (class126.method843((byte) -128, var159)) {
                class229 var160 = (class229) class258.field4241.method872((byte) -90, (long) var158);
                class229 var161 = (class229) class258.field4241.method872((byte) -91, (long) var157);
                if (var161 != null) {
                    class72.method461(48, var161, var160 == null || var160.field3658 != var161.field3658);
                }
                if (var160 != null) {
                    var160.method900(66);
                    class258.field4241.method857(false, var160, (long) var157);
                }
                class254 var162 = class80.method534(-59, var158);
                if (var162 != null) {
                    class58.method354(true, var162);
                }
                class254 var163 = class80.method534(-124, var157);
                if (var163 != null) {
                    class58.method354(true, var163);
                    class58.method358(true, var163, (byte) -16);
                }
                if (class160.field2523 != -1) {
                    class117.method756(false, class160.field2523, 1);
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 150) {
            boolean var164 = class192.field3042.method1420((byte) 0) == 1;
            String var165 = class192.field3042.method1403(-123);
            String var166 = class192.field3042.method1403(-125);
            int var167 = class192.field3042.method1419(108);
            String var168 = "";
            int var169 = class192.field3042.method1420((byte) 0);
            boolean var170 = false;
            if (var167 > 0) {
                var168 = class192.field3042.method1403(-123);
                var170 = class192.field3042.method1420((byte) 0) == 1;
            }
            for (int var171 = 0; var171 < class140.field2164; var171++) {
                if (var164) {
                    if (var166.equals(class120.field1848[var171])) {
                        class120.field1848[var171] = var165;
                        class241.field3808[var171] = var166;
                        var165 = null;
                        break;
                    }
                } else if (var165.equals(class120.field1848[var171])) {
                    if (class69.field1013[var171] != var167) {
                        class69.field1013[var171] = var167;
                        if (var167 > 0) {
                            class246.method1721(var165 + class45.field614, 0, "", (byte) -110, "", 5);
                        }
                        if (var167 == 0) {
                            class246.method1721(var165 + class294.field4836, 0, "", (byte) -119, "", 5);
                        }
                    }
                    class241.field3808[var171] = var166;
                    class277.field4593[var171] = var168;
                    class53.field719[var171] = var169;
                    class175.field2738[var171] = var170;
                    var165 = null;
                    break;
                }
            }
            if (var165 != null && class140.field2164 < 200) {
                class120.field1848[class140.field2164] = var165;
                class241.field3808[class140.field2164] = var166;
                class69.field1013[class140.field2164] = var167;
                class277.field4593[class140.field2164] = var168;
                class53.field719[class140.field2164] = var169;
                class175.field2738[class140.field2164] = var170;
                class140.field2164++;
            }
            class287.field4783 = class40.field502;
            int var172 = class140.field2164;
            boolean var173 = false;
            while (var172 > 0) {
                boolean var174 = true;
                var172--;
                for (int var175 = 0; var175 < var172; var175++) {
                    if (class69.field1013[var175] != class285.field4763 && class69.field1013[var175 + 1] == class285.field4763 || class69.field1013[var175] == 0 && class69.field1013[var175 + 1] != 0) {
                        var174 = false;
                        int var176 = class69.field1013[var175];
                        class69.field1013[var175] = class69.field1013[var175 + 1];
                        class69.field1013[var175 + 1] = var176;
                        String var177 = class277.field4593[var175];
                        class277.field4593[var175] = class277.field4593[var175 + 1];
                        class277.field4593[var175 + 1] = var177;
                        String var178 = class120.field1848[var175];
                        class120.field1848[var175] = class120.field1848[var175 + 1];
                        class120.field1848[var175 + 1] = var178;
                        String var179 = class241.field3808[var175];
                        class241.field3808[var175] = class241.field3808[var175 + 1];
                        class241.field3808[var175 + 1] = var179;
                        int var180 = class53.field719[var175];
                        class53.field719[var175] = class53.field719[var175 + 1];
                        class53.field719[var175 + 1] = var180;
                        boolean var181 = class175.field2738[var175];
                        class175.field2738[var175] = class175.field2738[var175 + 1];
                        class175.field2738[var175 + 1] = var181;
                    }
                }
                if (var174) {
                    break;
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 182) {
            int var182 = class192.field3042.method1420((byte) 0);
            int var183 = class192.field3042.method1420((byte) 0);
            byte var184 = class192.field3042.method1457((byte) -91);
            if (class143.field2237 != var184) {
                class223.field3548 = -1;
                return true;
            }
            if (var182 == 255) {
                client.field2582 = false;
                class271.field4443 = 0;
                class281.field4649 = 0;
            } else {
                class271.field4443 = var183;
                class281.field4649 = var182;
                client.field2582 = true;
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 219) {
            int var185 = class192.field3042.method1419(109);
            int var186 = class192.field3042.method1410(true);
            String var187 = class192.field3042.method1403(-125);
            if (class126.method843((byte) -109, var185)) {
                class76.method502(var187, -1, var186);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 118) {
            int var188 = class192.field3042.method1410(true);
            int var189 = class192.field3042.method1454(true);
            if (var189 == 65535) {
                var189 = -1;
            }
            int var190 = class192.field3042.method1439(false);
            int var191 = class192.field3042.method1410(true);
            int var192 = class192.field3042.method1454(true);
            if (var192 == 65535) {
                var192 = -1;
            }
            if (class126.method843((byte) -110, var191)) {
                for (int var193 = var189; var193 <= var192; var193++) {
                    long var194 = ((long) var190 << 32) + ((long) var193);
                    class237 var196 = (class237) class250.field3985.method872((byte) -95, var194);
                    class237 var197;
                    if (var196 != null) {
                        var197 = new class237(var196.field3765, var188);
                        var196.method900(110);
                    } else if (var193 == -1) {
                        var197 = new class237(class80.method534(-91, var190).field4151.field3765, var188);
                    } else {
                        var197 = new class237(0, var188);
                    }
                    class250.field3985.method857(false, var197, var194);
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 209) {
            class296.field4871 = class192.field3042.method1419(79) * 30;
            class96.field1419 = class40.field502;
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 47) {
            String var198 = class192.field3042.method1403(-127);
            String var199 = class116.method755(class14.method91((byte) 124, class52.method312(class192.field3042, 1)));
            class246.method1721(var199, 0, var198, (byte) -65, var198, 6);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 177) {
            int var200 = class192.field3042.method1410(true);
            int var201 = class192.field3042.method1442(-1970239824);
            int var202 = class192.field3042.method1442(-1970239824);
            int var203 = class192.field3042.method1440(20404);
            if (class126.method843((byte) 120, var200)) {
                class262.method1817(var202, var201, 11, var203);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 253) {
            int var204 = class192.field3042.method1439(false);
            int var205 = class192.field3042.method1410(true);
            class285.method2010(2, var205, var204);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 146) {
            int var206 = class192.field3042.method1440(20404);
            int var207 = class192.field3042.method1419(68);
            int var208 = class192.field3042.method1421(-2090211480);
            if (class126.method843((byte) 62, var207)) {
                class58.method356(var206, 5, var208);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 31) {
            String var209 = class192.field3042.method1403(-123);
            int var210 = class192.field3042.method1419(83);
            String var211 = class79.method532(-32769, var210).method1170(class192.field3042, (byte) 124);
            class74.method481(var209, 99, var209, 0, var211, var210, (String) null, 19);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 82) {
            int var212 = class192.field3042.method1410(true);
            int var213 = class192.field3042.method1404(252);
            if (class126.method843((byte) -126, var212)) {
                int var214 = 0;
                if (class309.field5006.field3319 != null) {
                    var214 = class309.field5006.field3319.method1032(-16406);
                }
                class111.method712(var214, -1, var213, (byte) 27, 3);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 103) {
            int var215 = class192.field3042.method1404(252);
            int var216 = class192.field3042.method1410(true);
            if (class126.method843((byte) 97, var216)) {
                class111.method712(2047, 0, var215, (byte) 27, 5);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 140) {
            int var217 = class192.field3042.method1419(107);
            int var218 = class192.field3042.method1410(true);
            int var219 = class192.field3042.method1440(20404);
            if (class126.method843((byte) -94, var218)) {
                class231.method1623(var217, var219, -7229);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 80) {
            int var220 = class192.field3042.method1419(102);
            int var221 = class192.field3042.method1440(20404);
            if (class126.method843((byte) -128, var220)) {
                class229 var222 = (class229) class258.field4241.method872((byte) -101, (long) var221);
                if (var222 != null) {
                    class72.method461(101, var222, true);
                }
                if (class296.field4862 != null) {
                    class58.method354(true, class296.field4862);
                    class296.field4862 = null;
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 77 || class223.field3548 == 109 || class223.field3548 == 32 || class223.field3548 == 124 || class223.field3548 == 145 || class223.field3548 == 171 || class223.field3548 == 107 || class223.field3548 == 59 || class223.field3548 == 228 || class223.field3548 == 12 || class223.field3548 == 19 || class223.field3548 == 22 || class223.field3548 == 115 || class223.field3548 == 179) {
            class43.method273(79);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 214) {
            int var223 = class192.field3042.method1455((byte) -99);
            int var224 = class192.field3042.method1419(110);
            int var225 = class192.field3042.method1419(93);
            int var226 = class192.field3042.method1439(false);
            if (class126.method843((byte) 122, var223)) {
                class60.method374(13, (var224 << 16) + var225, var226);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 76) {
            int var227 = class192.field3042.method1455((byte) -99);
            int var228 = class192.field3042.method1424(31523);
            int var229 = class192.field3042.method1432(122);
            int var230 = class192.field3042.method1455((byte) -99);
            if (class126.method843((byte) 61, var230)) {
                class229 var231 = (class229) class258.field4241.method872((byte) -81, (long) var228);
                if (var231 != null) {
                    class72.method461(81, var231, var231.field3658 != var227);
                }
                class309.method2107(-99, var229, var227, var228);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 158) {
            int var232 = class192.field3042.method1419(87);
            int var233 = class192.field3042.method1420((byte) 0);
            int var234 = class192.field3042.method1420((byte) 0);
            int var235 = class192.field3042.method1420((byte) 0);
            int var236 = class192.field3042.method1420((byte) 0);
            int var237 = class192.field3042.method1419(114);
            if (class126.method843((byte) -114, var232)) {
                class99.field1483[var233] = true;
                class204.field3287[var233] = var234;
                class225.field3580[var233] = var235;
                class208.field3347[var233] = var236;
                class314.field5064[var233] = var237;
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 231) {
            int var238 = class192.field3042.method1455((byte) -99);
            int var239 = class192.field3042.method1419(82);
            String var240 = class192.field3042.method1403(-124);
            if (class126.method843((byte) 100, var238)) {
                class76.method502(var240, -1, var239);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 163) {
            int var241 = class192.field3042.method1440(20404);
            int var242 = class192.field3042.method1419(100);
            if (var241 < -70000) {
                var242 += 32768;
            }
            class254 var243;
            if (var241 < 0) {
                var243 = null;
            } else {
                var243 = class80.method534(-107, var241);
            }
            while (class20.field272 > class192.field3042.field3272) {
                int var244 = class192.field3042.method1450(-122);
                int var245 = class192.field3042.method1419(118);
                int var246 = 0;
                if (var245 != 0) {
                    var246 = class192.field3042.method1420((byte) 0);
                    if (var246 == 255) {
                        var246 = class192.field3042.method1440(20404);
                    }
                }
                if (var243 != null && var244 >= 0 && var243.field4068.length > var244) {
                    var243.field4068[var244] = var245;
                    var243.field4021[var244] = var246;
                }
                class126.method840(-95, var242, var246, var245 - 1, var244);
            }
            if (var243 != null) {
                class58.method354(true, var243);
            }
            class137.method914(0);
            class312.field5034[class10.method53(31, class226.field3591++)] = class10.method53(var242, 32767);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 137) {
            int var247 = class192.field3042.method1420((byte) 0);
            int var248 = class192.field3042.method1398((byte) 110);
            int var249 = class192.field3042.method1420((byte) 0);
            class165.field2600 = var247 >> 1;
            class309.field5006.method1480(var248, (var247 & 0x1) == 1, false, var249);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 39) {
            int var250 = class192.field3042.method1410(true);
            int var251 = class192.field3042.method1405(-124);
            int var252 = class192.field3042.method1440(20404);
            if (class126.method843((byte) 50, var250)) {
                class154.method1010(var251, -81, var252);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 161) {
            class24.field304 = class192.field3042.method1420((byte) 0);
            class109.field1666 = class192.field3042.method1405(-121);
            while (class20.field272 > class192.field3042.field3272) {
                class223.field3548 = class192.field3042.method1420((byte) 0);
                class43.method273(-78);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 166) {
            int var253 = class192.field3042.method1404(252);
            class254 var254 = class80.method534(101, var253);
            for (int var255 = 0; var255 < var254.field4068.length; var255++) {
                var254.field4068[var255] = -1;
                var254.field4068[var255] = 0;
            }
            class58.method354(true, var254);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 170) {
            int var256 = class192.field3042.method1419(96);
            String var257 = class192.field3042.method1403(-124);
            Object[] var258 = new Object[var257.length() + 1];
            for (int var259 = var257.length() - 1; var259 >= 0; var259--) {
                if (var257.charAt(var259) == 's') {
                    var258[var259 + 1] = class192.field3042.method1403(-127);
                } else {
                    var258[var259 + 1] = Integer.valueOf(class192.field3042.method1440(20404));
                }
            }
            var258[0] = Integer.valueOf(class192.field3042.method1440(20404));
            if (class126.method843((byte) 52, var256)) {
                class298 var260 = new class298();
                var260.field4905 = var258;
                class126.method844(200000, var260);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 252) {
            int var261 = class192.field3042.method1455((byte) -99);
            if (var261 == 65535) {
                var261 = -1;
            }
            int var262 = class192.field3042.method1455((byte) -99);
            if (var262 == 65535) {
                var262 = -1;
            }
            int var263 = class192.field3042.method1455((byte) -99);
            int var264 = class192.field3042.method1424(31523);
            int var265 = class192.field3042.method1439(false);
            if (class126.method843((byte) -102, var263)) {
                for (int var266 = var262; var266 <= var261; var266++) {
                    long var267 = ((long) var265 << 32) + (long) var266;
                    class237 var269 = (class237) class250.field3985.method872((byte) -92, var267);
                    class237 var270;
                    if (var269 != null) {
                        var270 = new class237(var264, var269.field3758);
                        var269.method900(118);
                    } else if (var266 == -1) {
                        var270 = new class237(var264, class80.method534(112, var265).field4151.field3758);
                    } else {
                        var270 = new class237(var264, -1);
                    }
                    class250.field3985.method857(false, var270, var267);
                }
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 38) {
            int var271 = class192.field3042.method1419(68);
            if (var271 == 65535) {
                var271 = -1;
            }
            int var272 = class192.field3042.method1405(-124);
            class176.method1183(var271, 0, var272);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 241) {
            int var273 = class192.field3042.method1432(72);
            int var274 = class192.field3042.method1444(true);
            int var275 = class192.field3042.method1454(true);
            if (var275 == 65535) {
                var275 = -1;
            }
            class69.method435(var274, var273, var275, 13583);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 216) {
            int var276 = class192.field3042.method1439(false);
            int var277 = class192.field3042.method1419(107);
            int var278 = class192.field3042.method1410(true);
            if (var278 == 65535) {
                var278 = -1;
            }
            if (class126.method843((byte) -106, var277)) {
                class111.method712(var278, -1, var276, (byte) 27, 1);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 104) {
            int var279 = class192.field3042.method1455((byte) -99);
            if (var279 == 65535) {
                var279 = -1;
            }
            int var280 = class192.field3042.method1432(-79);
            int var281 = class192.field3042.method1420((byte) 0);
            String var282 = class192.field3042.method1403(-123);
            if (var281 >= 1 && var281 <= 8) {
                if (var282.equalsIgnoreCase("null")) {
                    var282 = null;
                }
                class119.field1837[var281 - 1] = var282;
                class145.field2276[var281 - 1] = var279;
                class200.field3194[var281 - 1] = var280 == 0;
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 245) {
            int var283 = class192.field3042.method1410(true);
            int var284 = class192.field3042.method1455((byte) -99);
            int var285 = class192.field3042.method1424(31523);
            if (class126.method843((byte) 125, var283)) {
                class82.method556(var284, var285, 19879);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 78) {
            String var286 = "";
            String var287 = var286;
            int var288 = class192.field3042.method1450(-64);
            int var289 = class192.field3042.method1440(20404);
            int var290 = class192.field3042.method1420((byte) 0);
            if ((var290 & 0x1) != 0) {
                var286 = class192.field3042.method1403(-127);
                if ((var290 & 0x2) == 0) {
                    var287 = var286;
                } else {
                    var287 = class192.field3042.method1403(-126);
                }
            }
            String var291 = class192.field3042.method1403(-126);
            if (!var287.equals("") && class304.method2086(var287, 1)) {
                class223.field3548 = -1;
                return true;
            } else {
                class246.method1721(var291, var289, var287, (byte) -75, var286, var288);
                class223.field3548 = -1;
                return true;
            }
        } else if (class223.field3548 == 202) {
            int var292 = class192.field3042.method1404(252);
            int var293 = class192.field3042.method1410(true);
            class22.method128(var292, var293, 29127);
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 148) {
            int var294 = class192.field3042.method1410(true);
            int var295 = class192.field3042.method1439(false);
            int var296 = class192.field3042.method1455((byte) -99);
            if (class126.method843((byte) 102, var294)) {
                class140.method933(var296, var295, 6);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 58) {
            int var297 = class192.field3042.method1455((byte) -99);
            int var298 = class192.field3042.method1419(69);
            int var299 = class192.field3042.method1405(-127);
            class35 var300 = class76.field1188[var297];
            if (var300 != null) {
                class278.method1938(0, var299, var298, var300);
            }
            class223.field3548 = -1;
            return true;
        } else if (class223.field3548 == 63) {
            int var301 = class192.field3042.method1420((byte) 0);
            boolean var302 = (var301 & 0x1) == 1;
            String var303 = class192.field3042.method1403(-124);
            String var304 = class192.field3042.method1403(-124);
            String var305 = class192.field3042.method1403(-123);
            String var306 = class192.field3042.method1403(-126);
            if (var302) {
                for (int var307 = 0; var307 < class20.field270; var307++) {
                    if (class174.field2714[var307].equals(var306)) {
                        class143.field2257[var307] = var303;
                        if (var304.equals("")) {
                            class174.field2714[var307] = var303;
                        } else {
                            class174.field2714[var307] = var304;
                        }
                        class296.field4876[var307] = var305;
                        if (var306.equals("")) {
                            class300.field4933[var307] = var305;
                        } else {
                            class300.field4933[var307] = var306;
                        }
                        break;
                    }
                }
            } else {
                class143.field2257[class20.field270] = var303;
                if (var304.equals("")) {
                    class174.field2714[class20.field270] = var303;
                } else {
                    class174.field2714[class20.field270] = var304;
                }
                class296.field4876[class20.field270] = var305;
                if (var306.equals("")) {
                    class300.field4933[class20.field270] = var305;
                } else {
                    class300.field4933[class20.field270] = var306;
                }
                class6.field53[class20.field270] = class10.method53(var301, 2) == 2;
                class20.field270++;
            }
            class223.field3548 = -1;
            class287.field4783 = class40.field502;
            return true;
        } else if (class223.field3548 == 193) {
            class109.field1666 = class192.field3042.method1405(-123);
            class24.field304 = class192.field3042.method1420((byte) 0);
            for (int var308 = class109.field1666; var308 < (class109.field1666 + 8); var308++) {
                for (int var310 = class24.field304; var310 < class24.field304 + 8; var310++) {
                    if (class239.field3780[class165.field2600][var308][var310] != null) {
                        class239.field3780[class165.field2600][var308][var310] = null;
                        class135.method906(var308, var310, -17521);
                    }
                }
            }
            for (class210 var309 = (class210) class147.field2309.method1959(205); var309 != null; var309 = (class210) class147.field2309.method1956(84)) {
                if (class109.field1666 <= var309.field3378 && var309.field3378 < class109.field1666 + 8 && class24.field304 <= var309.field3368 && var309.field3368 < (class24.field304 + 8) && class165.field2600 == var309.field3374) {
                    var309.field3365 = 0;
                }
            }
            class223.field3548 = -1;
            return true;
        } else {
            if (arg0 < 43) {
                method310((byte) 43);
            }
            if (class223.field3548 == 244) {
                int var311 = class192.field3042.method1455((byte) -99);
                int var312 = class192.field3042.method1432(-102);
                if (class126.method843((byte) -126, var311)) {
                    class85.field1335 = var312;
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 93) {
                int var313 = class192.field3042.method1420((byte) 0);
                int var314 = var313 & 0x1F;
                int var315 = var313 >> 5;
                if (var314 == 0) {
                    class263.field4340[var315] = null;
                    class223.field3548 = -1;
                    return true;
                }
                class3 var316 = new class3();
                var316.field16 = var314;
                var316.field14 = class192.field3042.method1420((byte) 0);
                if (var316.field14 >= 0 && class127.field1961.length > var316.field14) {
                    if (var316.field16 == 1 || var316.field16 == 10) {
                        var316.field17 = class192.field3042.method1419(92);
                        class192.field3042.field3272 += 5;
                    } else if (var316.field16 >= 2 && var316.field16 <= 6) {
                        if (var316.field16 == 2) {
                            var316.field28 = 64;
                            var316.field19 = 64;
                        }
                        if (var316.field16 == 3) {
                            var316.field19 = 64;
                            var316.field28 = 0;
                        }
                        if (var316.field16 == 4) {
                            var316.field28 = 128;
                            var316.field19 = 64;
                        }
                        if (var316.field16 == 5) {
                            var316.field19 = 0;
                            var316.field28 = 64;
                        }
                        if (var316.field16 == 6) {
                            var316.field28 = 64;
                            var316.field19 = 128;
                        }
                        var316.field16 = 2;
                        var316.field25 = class192.field3042.method1419(111);
                        var316.field20 = class192.field3042.method1419(77);
                        var316.field27 = class192.field3042.method1420((byte) 0);
                        var316.field21 = class192.field3042.method1419(82);
                    }
                    var316.field18 = class192.field3042.method1419(106);
                    if (var316.field18 == 65535) {
                        var316.field18 = -1;
                    }
                    class263.field4340[var315] = var316;
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 100) {
                class254.method1765((byte) -75, class192.field3042, class259.field4254, class20.field272);
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 229) {
                int var317 = class192.field3042.method1419(85);
                int var318 = class192.field3042.method1420((byte) 0);
                int var319 = class192.field3042.method1420((byte) 0);
                int var320 = class192.field3042.method1419(85);
                int var321 = class192.field3042.method1420((byte) 0);
                int var322 = class192.field3042.method1420((byte) 0);
                if (class126.method843((byte) 79, var317)) {
                    class150.method991(var321, -8599, var322, var320, var318, var319);
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 218) {
                class109.field1666 = class192.field3042.method1405(-123);
                class24.field304 = class192.field3042.method1432(98);
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 243) {
                boolean var323 = class192.field3042.method1420((byte) 0) == 1;
                String var324 = class192.field3042.method1403(-123);
                String var325 = var324;
                if (var323) {
                    var325 = class192.field3042.method1403(-123);
                }
                long var326 = (long) class192.field3042.method1419(126);
                long var328 = (long) class192.field3042.method1401((byte) -92);
                boolean var330 = false;
                int var331 = class192.field3042.method1420((byte) 0);
                long var332 = (var326 << 32) + var328;
                int var334 = 0;
                while (true) {
                    if (var334 >= 100) {
                        if (var331 <= 1) {
                            if (!(!class45.field625 || class302.field4951) || class124.field1894) {
                                var330 = true;
                            } else if (class304.method2086(var325, 1)) {
                                var330 = true;
                            }
                        }
                        break;
                    }
                    if (class70.field1015[var334] == var332) {
                        var330 = true;
                        break;
                    }
                    var334++;
                }
                if (!var330 && class278.field4602 == 0) {
                    class70.field1015[class174.field2723] = var332;
                    class174.field2723 = (class174.field2723 + 1) % 100;
                    String var335 = class116.method755(class14.method91((byte) 62, class52.method312(class192.field3042, 1)));
                    if (var331 == 2) {
                        class74.method481("<img=1>" + var325, 99, "<img=1>" + var324, 0, var335, -1, (String) null, 7);
                    } else if (var331 == 1) {
                        class74.method481("<img=0>" + var325, 99, "<img=0>" + var324, 0, var335, -1, (String) null, 7);
                    } else {
                        class74.method481(var325, 99, var324, 0, var335, -1, (String) null, 3);
                    }
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 172) {
                class202.method1417(-125);
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 194) {
                int var336 = class192.field3042.method1440(20404);
                int var337 = class192.field3042.method1454(true);
                int var338 = class192.field3042.method1410(true);
                if (var338 == 65535) {
                    var338 = -1;
                }
                int var339 = class192.field3042.method1440(20404);
                if (class126.method843((byte) -88, var337)) {
                    class254 var340 = class80.method534(95, var339);
                    if (var340.field4181) {
                        client.method1083(var336, var338, var339, 76);
                        class132 var342 = class14.method92(var338, false);
                        class181.method1206(var342.field2049, var342.field2091, var342.field2038, (byte) -83, var339);
                        class310.method2111(var342.field2061, var342.field2046, var339, var342.field2076, -11774);
                    } else if (var338 == -1) {
                        var340.field4054 = 0;
                        class223.field3548 = -1;
                        return true;
                    } else {
                        class132 var341 = class14.method92(var338, false);
                        var340.field4139 = var341.field2049;
                        var340.field4054 = 4;
                        var340.field4073 = var338;
                        var340.field4093 = var341.field2091 * 100 / var336;
                        var340.field4154 = var341.field2038;
                        class58.method354(true, var340);
                    }
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 147) {
                for (int var343 = 0; var343 < class209.field3356.length; var343++) {
                    if (class209.field3356[var343] != class178.field2775[var343]) {
                        class209.field3356[var343] = class178.field2775[var343];
                        class265.method1828(var343, true);
                        class204.field3285[class10.method53(31, class84.field1333++)] = var343;
                    }
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 8) {
                boolean var344 = class192.field3042.method1420((byte) 0) == 1;
                String var345 = class192.field3042.method1403(-123);
                String var346 = var345;
                if (var344) {
                    var346 = class192.field3042.method1403(-128);
                }
                boolean var347 = false;
                long var348 = class192.field3042.method1430(false);
                long var350 = (long) class192.field3042.method1419(109);
                long var352 = (long) class192.field3042.method1401((byte) -108);
                int var354 = class192.field3042.method1420((byte) 0);
                int var355 = class192.field3042.method1419(97);
                long var356 = (var350 << 32) + var352;
                int var358 = 0;
                while (true) {
                    if (var358 >= 100) {
                        if (var354 <= 1 && class304.method2086(var346, 1)) {
                            var347 = true;
                        }
                        break;
                    }
                    if (class70.field1015[var358] == var356) {
                        var347 = true;
                        break;
                    }
                    var358++;
                }
                if (!var347 && class278.field4602 == 0) {
                    class70.field1015[class174.field2723] = var356;
                    class174.field2723 = (class174.field2723 + 1) % 100;
                    String var359 = class79.method532(-32769, var355).method1170(class192.field3042, (byte) 124);
                    if (var354 == 2) {
                        class74.method481("<img=1>" + var346, 99, "<img=1>" + var345, 0, var359, var355, class137.method919(var348, 0), 20);
                    } else if (var354 == 1) {
                        class74.method481("<img=0>" + var346, 99, "<img=0>" + var345, 0, var359, var355, class137.method919(var348, 0), 20);
                    } else {
                        class74.method481(var346, 99, var345, 0, var359, var355, class137.method919(var348, 0), 20);
                    }
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 141) {
                for (int var360 = 0; var360 < class300.field4925.length; var360++) {
                    if (class300.field4925[var360] != null) {
                        class300.field4925[var360].field853 = -1;
                    }
                }
                for (int var361 = 0; var361 < class76.field1188.length; var361++) {
                    if (class76.field1188[var361] != null) {
                        class76.field1188[var361].field853 = -1;
                    }
                }
                class223.field3548 = -1;
                return true;
            } else if (class223.field3548 == 136) {
                int var362 = class192.field3042.method1455((byte) -99);
                if (var362 == 65535) {
                    var362 = -1;
                }
                int var363 = class192.field3042.method1398((byte) 110);
                int var364 = var363 & 0x3;
                int var365 = var363 >> 2;
                int var366 = class131.field2016[var365];
                int var367 = class192.field3042.method1440(20404);
                int var368 = (var367 & 0x3AA5E19B) >> 28;
                int var369 = var367 & 0x3FFF;
                int var370 = var367 >> 14 & 0x3FFF;
                int var371 = var370 - class101.field1517;
                int var372 = var369 - class254.field4063;
                class100.method650(var371, var362, var366, var368, var364, 126, var365, var372);
                class223.field3548 = -1;
                return true;
            } else {
                class159.method1055("T1 - " + class223.field3548 + "," + class50.field680 + "," + class313.field5040 + " - " + class20.field272, -17731, (Throwable) null);
                class227.method1578(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILwi;IIIIIIZZI)V")
    public static final void method309(int arg0, class142 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9, int arg10) {
        field697++;
        if (arg9 && !class165.method1108(0) && (class128.field1972[0][arg4][arg2] & 0x2) == 0) {
            if ((class128.field1972[arg7][arg4][arg2] & 0x10) != 0) {
                return;
            }
            if (class236.method1637(arg4, arg2, arg7, false) != class102.field1537) {
                return;
            }
        }
        if (arg7 < class161.field2538) {
            class161.field2538 = arg7;
        }
        class74 var11 = class216.method1510(0, arg0);
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var13 = var11.field1151;
            var12 = var11.field1169;
        } else {
            var12 = var11.field1151;
            var13 = var11.field1169;
        }
        int var14;
        int var15;
        if ((arg2 + var12) > 104) {
            var14 = arg2;
            var15 = arg2 + 1;
        } else {
            var14 = (var12 >> 1) + arg2;
            var15 = (var12 + 1 >> 1) + arg2;
        }
        int[][] var16 = class242.field3842[arg10];
        int var17;
        int var18;
        if (arg4 + var13 <= 104) {
            var17 = (var13 >> 1) + arg4;
            var18 = (var13 + 1 >> 1) + arg4;
        } else {
            var17 = arg4;
            var18 = arg4 + 1;
        }
        int var19 = var16[var17][var14] + var16[var18][var15] + var16[var18][var14] + var16[var17][var15] >> 2;
        int var20 = (arg4 << 7) + (var13 << 6);
        int var21 = (arg2 << 7) + (var12 << 6);
        int[][] var22 = null;
        long var23 = (long) (arg5 << 20 | arg4 | arg2 << 7 | arg6 << 14 | 0x40000000);
        if (var11.field1117 == 0 || arg8) {
            var23 |= Long.MIN_VALUE;
        }
        if (arg3 != 27371) {
            return;
        }
        if (var11.field1154 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field1167) {
            var23 |= 0x80000000L;
        }
        if (arg8) {
            var22 = class277.field4583[0];
        } else if (arg10 < 3) {
            var22 = class242.field3842[arg10 + 1];
        }
        if (var11.method475(0)) {
            class16.method103(arg5, (class208) null, arg4, arg7, arg2, 0, var11, 128, (class35) null);
        }
        boolean var25 = var11.field1174 & !arg8;
        long var26 = var23 | (long) arg0 << 32;
        if (arg6 == 22) {
            if (class123.field1878 || var11.field1117 != 0 || var11.field1125 == 1 || var11.field1156) {
                class276 var29;
                if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                    class2 var28 = var11.method485(var25, arg9, 22, var20, 3, var16, var22, arg5, var19, var21, (class5) null);
                    var29 = var28.field7;
                } else {
                    var29 = new class125(arg0, 22, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
                }
                class98.method633(arg7, arg4, arg2, var19, var29, var26, var11.field1130);
                if (var11.field1125 == 1 && arg1 != null) {
                    arg1.method942((byte) -25, arg4, arg2);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class276 var69;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var68 = var11.method485(var25, arg9, 10, var20, 3, var16, var22, arg6 == 11 ? arg5 + 4 : arg5, var19, var21, (class5) null);
                var69 = var68.field7;
            } else {
                var69 = new class125(arg0, 10, arg6 == 11 ? arg5 + 4 : arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            if (var69 != null) {
                boolean var70 = class52.method316(arg7, arg4, arg2, var19, var13, var12, var69, 0, var26);
                if (var11.field1176 && var70 && arg9) {
                    int var71 = 15;
                    if (var69 instanceof class293) {
                        var71 = ((class293) var69).method1326() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class92.field1406[arg7][arg4 + var72][arg2 + var73]) {
                                class92.field1406[arg7][arg4 + var72][arg2 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method953(!var11.field1097, var11.field1092, arg4, arg3 - 27115, var13, arg2, var12);
            }
        } else if (arg6 >= 12) {
            class276 var31;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var30 = var11.method485(var25, arg9, arg6, var20, 3, var16, var22, arg5, var19, var21, (class5) null);
                var31 = var30.field7;
            } else {
                var31 = new class125(arg0, arg6, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class52.method316(arg7, arg4, arg2, var19, 1, 1, var31, 0, var26);
            if (arg9 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0 && var11.field1162 != 0) {
                class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 4);
            }
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method953(!var11.field1097, var11.field1092, arg4, 256, var13, arg2, var12);
            }
        } else if (arg6 == 0) {
            class276 var33;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var32 = var11.method485(var25, arg9, 0, var20, 3, var16, var22, arg5, var19, var21, (class5) null);
                var33 = var32.field7;
            } else {
                var33 = new class125(arg0, 0, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class11.method58(arg7, arg4, arg2, var19, var33, (class276) null, class186.field2884[arg5], 0, var26);
            if (arg9) {
                if (arg5 == 0) {
                    if (var11.field1176) {
                        class92.field1406[arg7][arg4][arg2] = 50;
                        class92.field1406[arg7][arg4][arg2 + 1] = 50;
                    }
                    if (var11.field1162 == 1) {
                        class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 1);
                    }
                } else if (arg5 == 1) {
                    if (var11.field1176) {
                        class92.field1406[arg7][arg4][arg2 + 1] = 50;
                        class92.field1406[arg7][arg4 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field1162 == 1) {
                        class202.field3233[arg7][arg4][arg2 + 1] = class82.method554(class202.field3233[arg7][arg4][arg2 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var11.field1176) {
                        class92.field1406[arg7][arg4 + 1][arg2] = 50;
                        class92.field1406[arg7][arg4 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field1162 == 1) {
                        class202.field3233[arg7][arg4 + 1][arg2] = class82.method554(class202.field3233[arg7][arg4 + 1][arg2], 1);
                    }
                } else if (arg5 == 3) {
                    if (var11.field1176) {
                        class92.field1406[arg7][arg4][arg2] = 50;
                        class92.field1406[arg7][arg4 + 1][arg2] = 50;
                    }
                    if (var11.field1162 == 1) {
                        class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 2);
                    }
                }
            }
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method951(arg6, arg5, arg2, arg4, !var11.field1097, var11.field1092, (byte) 29);
            }
            if (var11.field1141 != 16) {
                class236.method1636(arg7, arg4, arg2, var11.field1141);
            }
        } else if (arg6 == 1) {
            class276 var35;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var34 = var11.method485(var25, arg9, 1, var20, arg3 ^ 0x6AE8, var16, var22, arg5, var19, var21, (class5) null);
                var35 = var34.field7;
            } else {
                var35 = new class125(arg0, 1, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class11.method58(arg7, arg4, arg2, var19, var35, (class276) null, class103.field1556[arg5], 0, var26);
            if (var11.field1176 && arg9) {
                if (arg5 == 0) {
                    class92.field1406[arg7][arg4][arg2 + 1] = 50;
                } else if (arg5 == 1) {
                    class92.field1406[arg7][arg4 + 1][arg2 + 1] = 50;
                } else if (arg5 == 2) {
                    class92.field1406[arg7][arg4 + 1][arg2] = 50;
                } else if (arg5 == 3) {
                    class92.field1406[arg7][arg4][arg2] = 50;
                }
            }
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method951(arg6, arg5, arg2, arg4, !var11.field1097, var11.field1092, (byte) 29);
            }
        } else if (arg6 == 2) {
            int var36 = arg5 + 1 & 0x3;
            class276 var38;
            class276 var40;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var37 = var11.method485(var25, arg9, 2, var20, 3, var16, var22, arg5 + 4, var19, var21, (class5) null);
                var38 = var37.field7;
                class2 var39 = var11.method485(var25, arg9, 2, var20, 3, var16, var22, var36, var19, var21, (class5) null);
                var40 = var39.field7;
            } else {
                var38 = new class125(arg0, 2, arg5 + 4, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
                var40 = new class125(arg0, 2, var36, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class11.method58(arg7, arg4, arg2, var19, var38, var40, class186.field2884[arg5], class186.field2884[var36], var26);
            if (var11.field1162 == 1 && arg9) {
                if (arg5 == 0) {
                    class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 1);
                    class202.field3233[arg7][arg4][arg2 + 1] = class82.method554(class202.field3233[arg7][arg4][arg2 + 1], 2);
                } else if (arg5 == 1) {
                    class202.field3233[arg7][arg4][arg2 + 1] = class82.method554(class202.field3233[arg7][arg4][arg2 + 1], 2);
                    class202.field3233[arg7][arg4 + 1][arg2] = class82.method554(class202.field3233[arg7][arg4 + 1][arg2], 1);
                } else if (arg5 == 2) {
                    class202.field3233[arg7][arg4 + 1][arg2] = class82.method554(class202.field3233[arg7][arg4 + 1][arg2], 1);
                    class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 2);
                } else if (arg5 == 3) {
                    class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 2);
                    class202.field3233[arg7][arg4][arg2] = class82.method554(class202.field3233[arg7][arg4][arg2], 1);
                }
            }
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method951(arg6, arg5, arg2, arg4, !var11.field1097, var11.field1092, (byte) 29);
            }
            if (var11.field1141 != 16) {
                class236.method1636(arg7, arg4, arg2, var11.field1141);
            }
        } else if (arg6 == 3) {
            class276 var42;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var41 = var11.method485(var25, arg9, 3, var20, 3, var16, var22, arg5, var19, var21, (class5) null);
                var42 = var41.field7;
            } else {
                var42 = new class125(arg0, 3, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class11.method58(arg7, arg4, arg2, var19, var42, (class276) null, class103.field1556[arg5], 0, var26);
            if (var11.field1176 && arg9) {
                if (arg5 == 0) {
                    class92.field1406[arg7][arg4][arg2 + 1] = 50;
                } else if (arg5 == 1) {
                    class92.field1406[arg7][arg4 + 1][arg2 + 1] = 50;
                } else if (arg5 == 2) {
                    class92.field1406[arg7][arg4 + 1][arg2] = 50;
                } else if (arg5 == 3) {
                    class92.field1406[arg7][arg4][arg2] = 50;
                }
            }
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method951(arg6, arg5, arg2, arg4, !var11.field1097, var11.field1092, (byte) 29);
            }
        } else if (arg6 == 9) {
            class276 var44;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var43 = var11.method485(var25, arg9, arg6, var20, arg3 ^ 0x6AE8, var16, var22, arg5, var19, var21, (class5) null);
                var44 = var43.field7;
            } else {
                var44 = new class125(arg0, arg6, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class52.method316(arg7, arg4, arg2, var19, 1, 1, var44, 0, var26);
            if (var11.field1125 != 0 && arg1 != null) {
                arg1.method953(!var11.field1097, var11.field1092, arg4, 256, var13, arg2, var12);
            }
            if (var11.field1141 != 16) {
                class236.method1636(arg7, arg4, arg2, var11.field1141);
            }
        } else if (arg6 == 4) {
            class276 var46;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var45 = var11.method485(var25, arg9, 4, var20, 3, var16, var22, arg5, var19, var21, (class5) null);
                var46 = var45.field7;
            } else {
                var46 = new class125(arg0, 4, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class82.method552(arg7, arg4, arg2, var19, var46, (class276) null, class186.field2884[arg5], 0, 0, 0, var26);
        } else if (arg6 == 5) {
            int var47 = 16;
            long var48 = class194.method1344(arg7, arg4, arg2);
            if (var48 != 0L) {
                var47 = class216.method1510(0, Integer.MAX_VALUE & (int) (var48 >>> 32)).field1141;
            }
            class276 var51;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var50 = var11.method485(var25, arg9, 4, var20, arg3 - 27368, var16, var22, arg5, var19, var21, (class5) null);
                var51 = var50.field7;
            } else {
                var51 = new class125(arg0, 4, arg5, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class82.method552(arg7, arg4, arg2, var19, var51, (class276) null, class186.field2884[arg5], 0, class10.field128[arg5] * var47, class34.field423[arg5] * var47, var26);
        } else if (arg6 == 6) {
            int var52 = 8;
            long var53 = class194.method1344(arg7, arg4, arg2);
            if (var53 != 0L) {
                var52 = class216.method1510(0, (int) (var53 >>> 32) & Integer.MAX_VALUE).field1141 / 2;
            }
            class276 var56;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var55 = var11.method485(var25, arg9, 4, var20, arg3 - 27368, var16, var22, arg5 + 4, var19, var21, (class5) null);
                var56 = var55.field7;
            } else {
                var56 = new class125(arg0, 4, arg5 + 4, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class82.method552(arg7, arg4, arg2, var19, var56, (class276) null, 256, arg5, class12.field162[arg5] * var52, class105.field1578[arg5] * var52, var26);
        } else if (arg6 == 7) {
            int var57 = arg5 + 2 & 0x3;
            class276 var59;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var58 = var11.method485(var25, arg9, 4, var20, 3, var16, var22, var57 + 4, var19, var21, (class5) null);
                var59 = var58.field7;
            } else {
                var59 = new class125(arg0, 4, var57 + 4, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class82.method552(arg7, arg4, arg2, var19, var59, (class276) null, 256, var57, 0, 0, var26);
        } else if (arg6 == 8) {
            int var60 = 8;
            long var61 = class194.method1344(arg7, arg4, arg2);
            if (var61 != 0L) {
                var60 = class216.method1510(0, Integer.MAX_VALUE & (int) (var61 >>> 32)).field1141 / 2;
            }
            int var63 = arg5 + 2 & 0x3;
            class276 var65;
            class276 var67;
            if (var11.field1095 == -1 && var11.field1111 == null && var11.field1149 == null && !var11.field1090) {
                class2 var64 = var11.method485(var25, arg9, 4, var20, 3, var16, var22, arg5 + 4, var19, var21, (class5) null);
                var65 = var64.field7;
                class2 var66 = var11.method485(var25, arg9, 4, var20, 3, var16, var22, var63 + 4, var19, var21, (class5) null);
                var67 = var66.field7;
            } else {
                var65 = new class125(arg0, 4, arg5 + 4, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
                var67 = new class125(arg0, 4, var63 + 4, arg10, arg4, arg2, -1, var11.field1106, (class276) null);
            }
            class82.method552(arg7, arg4, arg2, var19, var65, var67, 256, arg5, class12.field162[arg5] * var60, class105.field1578[arg5] * var60, var26);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field698 = null;
        field688 = null;
        if (arg0 != 45) {
            method310((byte) 97);
        }
        field694 = null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I[B)V")
    public class51(int arg0, byte[] arg1) {
        this.field693 = arg0;
        class202 var3 = new class202(arg1);
        this.field690 = var3.method1420((byte) 0);
        this.field686 = new int[this.field690];
        this.field691 = new int[this.field690];
        this.field695 = new int[this.field690][];
        this.field696 = new boolean[this.field690];
        for (int var4 = 0; var4 < this.field690; var4++) {
            this.field686[var4] = var3.method1420((byte) 0);
        }
        for (int var5 = 0; var5 < this.field690; var5++) {
            this.field696[var5] = var3.method1420((byte) 0) == 1;
        }
        for (int var6 = 0; var6 < this.field690; var6++) {
            this.field691[var6] = var3.method1419(77);
        }
        for (int var7 = 0; var7 < this.field690; var7++) {
            this.field695[var7] = new int[var3.method1420((byte) 0)];
        }
        for (int var8 = 0; var8 < this.field690; var8++) {
            for (int var9 = 0; var9 < this.field695[var8].length; var9++) {
                this.field695[var8][var9] = var3.method1420((byte) 0);
            }
        }
    }
}
