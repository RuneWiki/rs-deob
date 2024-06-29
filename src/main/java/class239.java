import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class239 extends class205 {

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lgi;")
    public static class164 field3746;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V")
    public static void method1629(int arg0) {
        field3746 = null;
        if (arg0 != 20) {
            method1629(-69);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)Z")
    public static final boolean method1630(byte arg0) throws IOException {
        field3744++;
        if (class18.field322 == null) {
            return false;
        }
        int var1 = class18.field322.method419((byte) -90);
        if (var1 == 0) {
            return false;
        }
        if (class88.field1369 == -1) {
            class18.field322.method413(1, class229.field3584.field4441, -124, 0);
            class229.field3584.field4458 = 0;
            var1--;
            class88.field1369 = class229.field3584.method2084(-19884);
            class271.field4366 = class34.field554[class88.field1369];
        }
        if (class271.field4366 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class18.field322.method413(1, class229.field3584.field4441, -88, 0);
            class271.field4366 = class229.field3584.field4441[0] & 0xFF;
            var1--;
        }
        if (class271.field4366 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class18.field322.method413(2, class229.field3584.field4441, -101, 0);
            class229.field3584.field4458 = 0;
            class271.field4366 = class229.field3584.method1837(252);
            var1 -= 2;
        }
        if (class271.field4366 > var1) {
            return false;
        }
        class229.field3584.field4458 = 0;
        class18.field322.method413(class271.field4366, class229.field3584.field4441, -61, 0);
        class119.field1892 = class251.field4126;
        class192.field3139 = 0;
        class251.field4126 = class272.field4371;
        class272.field4371 = class88.field1369;
        if (class88.field1369 == 96) {
            int var2 = class229.field3584.method1833((byte) -104);
            int var3 = class229.field3584.method1867((byte) -69);
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = class229.field3584.method1815(-108);
            int var5 = class229.field3584.method1864(79);
            if (class166.method1187(var4, 65535)) {
                class248 var6 = class281.method1913(var2, (byte) 48);
                if (var6.field3952) {
                    class261.method1751(var2, 9, var3, var5);
                    class158 var7 = class107.method754(-20563, var3);
                    class180.method1267(var7.field2545, var2, var7.field2585, var7.field2591, (byte) 48);
                    class218.method1490(var7.field2553, var7.field2520, var2, 10, var7.field2566);
                } else if (var3 == -1) {
                    class88.field1369 = -1;
                    var6.field4042 = 0;
                    return true;
                } else {
                    class158 var8 = class107.method754(-20563, var3);
                    var6.field4062 = var8.field2585;
                    var6.field4022 = var8.field2591 * 100 / var5;
                    var6.field4035 = var8.field2545;
                    var6.field4042 = 4;
                    var6.field4055 = var3;
                    class111.method776(var6, (byte) 25);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 40) {
            int var9 = class229.field3584.method1848((byte) -96);
            int var10 = class229.field3584.method1829(-115);
            int var11 = class229.field3584.method1837(252);
            if (class166.method1187(var11, 65535)) {
                class133.method903(-11072, var10, var9);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 198) {
            byte var12 = class229.field3584.method1870(true);
            int var13 = class229.field3584.method1815(-105);
            class249.method1697(var12, var13, -116);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 159) {
            int var14 = class229.field3584.method1867((byte) -119);
            int var15 = class229.field3584.method1826(30334);
            class302.method2067(var14, var15, -30420);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 213) {
            class241.field3763 = class229.field3584.method1871((byte) -33);
            class113.field1727 = class229.field3584.method1849(255);
            while (class229.field3584.field4458 < class271.field4366) {
                class88.field1369 = class229.field3584.method1849(255);
                class189.method1331(1111852240);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 107) {
            int var16 = class229.field3584.method1837(252);
            int var17 = class229.field3584.method1871((byte) -33);
            if (var16 == 65535) {
                var16 = -1;
            }
            class144.method989(var17, false, var16);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 61) {
            int var18 = class229.field3584.method1812(true);
            int var19 = class229.field3584.method1815(-109);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class229.field3584.method1826(30334);
            class124.method849(var18, var20, (byte) 125, var19);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 13) {
            long var21 = class229.field3584.method1834(3);
            int var23 = class229.field3584.method1837(252);
            String var24 = class297.method2037(var23, -15736).method1745(class229.field3584, 0);
            class35.method258(var24, (String) null, var23, class125.method857(var21, (byte) -96), 19, -1);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 144) {
            long var25 = class229.field3584.method1834(3);
            long var27 = (long) class229.field3584.method1837(252);
            long var29 = (long) class229.field3584.method1812(true);
            long var31 = (var27 << 32) + var29;
            int var33 = class229.field3584.method1849(255);
            boolean var34 = false;
            int var35 = 0;
            label1223: while (true) {
                if (var35 >= 100) {
                    if (var33 <= 1) {
                        if ((!class86.field1357 || class91.field1450) && !class25.field457) {
                            for (int var36 = 0; var36 < class34.field562; var36++) {
                                if (class161.field2634[var36] == var25) {
                                    var34 = true;
                                    break label1223;
                                }
                            }
                        } else {
                            var34 = true;
                        }
                    }
                    break;
                }
                if (class58.field836[var35] == var31) {
                    var34 = true;
                    break;
                }
                var35++;
            }
            if (!var34 && class306.field4983 == 0) {
                class58.field836[class28.field515] = var31;
                class28.field515 = (class28.field515 + 1) % 100;
                String var37 = class73.method529(class5.method64(false, class124.method856(0, class229.field3584)));
                if (var33 == 2 || var33 == 3) {
                    class74.method536(var37, "<img=1>" + class125.method857(var25, (byte) -88), (byte) -110, 7);
                } else if (var33 == 1) {
                    class74.method536(var37, "<img=0>" + class125.method857(var25, (byte) -73), (byte) -80, 7);
                } else {
                    class74.method536(var37, class125.method857(var25, (byte) -107), (byte) -95, 3);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 185) {
            int var38 = class229.field3584.method1867((byte) -96);
            int var39 = class229.field3584.method1833((byte) -104);
            int var40 = class229.field3584.method1866((byte) 12);
            int var41 = class229.field3584.method1822(-32768);
            if (class166.method1187(var38, 65535)) {
                class18.method136(var39, (byte) 4, var41, var40);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 250) {
            int var42 = class229.field3584.method1820((byte) -120);
            int var43 = class229.field3584.method1815(-120);
            int var44 = class229.field3584.method1829(-125);
            if (var44 == 65535) {
                var44 = -1;
            }
            if (class166.method1187(var43, 65535)) {
                class304.method2068(2, -1, var42, true, var44);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 220) {
            int var45 = class229.field3584.method1864(93);
            int var46 = class229.field3584.method1815(-101);
            int var47 = class229.field3584.method1837(252);
            int var48 = class229.field3584.method1848((byte) -113);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var49 = class229.field3584.method1837(252);
            if (var49 == 65535) {
                var49 = -1;
            }
            if (class166.method1187(var46, 65535)) {
                for (int var50 = var49; var50 <= var47; var50++) {
                    long var51 = ((long) var45 << 32) + (long) var50;
                    class22 var53 = (class22) class233.field3638.method371(-115, var51);
                    class22 var54;
                    if (var53 != null) {
                        var54 = new class22(var48, var53.field411);
                        var53.method952((byte) 84);
                    } else if (var50 == -1) {
                        var54 = new class22(var48, class281.method1913(var45, (byte) -115).field3965.field411);
                    } else {
                        var54 = new class22(var48, -1);
                    }
                    class233.field3638.method368(var51, var54, -115);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 19) {
            int var55 = class229.field3584.method1837(252);
            int var56 = class229.field3584.method1829(83);
            int var57 = class229.field3584.method1833((byte) -104);
            if (var55 == 65535) {
                var55 = -1;
            }
            if (class166.method1187(var56, 65535)) {
                class304.method2068(1, -1, var57, true, var55);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 125) {
            int var58 = class229.field3584.method1867((byte) -71);
            int var59 = class229.field3584.method1815(-96);
            int var60 = class229.field3584.method1815(-100);
            int var61 = class229.field3584.method1864(110);
            int var62 = class229.field3584.method1837(252);
            if (class166.method1187(var59, 65535)) {
                class304.method2068(7, var60, var61, true, var62 | var58 << 16);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 182 || class88.field1369 == 205 || class88.field1369 == 3 || class88.field1369 == 188 || class88.field1369 == 149 || class88.field1369 == 101 || class88.field1369 == 36 || class88.field1369 == 73 || class88.field1369 == 127 || class88.field1369 == 54 || class88.field1369 == 121 || class88.field1369 == 164 || class88.field1369 == 153 || class88.field1369 == 135) {
            class189.method1331(1111852240);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 168) {
            class229.field3584.field4458 += 28;
            if (class229.field3584.method1839(-2)) {
                class197.method1366(class229.field3584, -114, class229.field3584.field4458 - 28);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 102) {
            int var63 = class229.field3584.method1833((byte) -104);
            int var64 = class229.field3584.method1837(252);
            if (var63 < -70000) {
                var64 += 32768;
            }
            class248 var65;
            if (var63 >= 0) {
                var65 = class281.method1913(var63, (byte) 127);
            } else {
                var65 = null;
            }
            if (var65 != null) {
                for (int var66 = 0; var66 < var65.field4041.length; var66++) {
                    var65.field4041[var66] = 0;
                    var65.field4054[var66] = 0;
                }
            }
            class130.method887((byte) -116, var64);
            int var67 = class229.field3584.method1837(252);
            for (int var68 = 0; var68 < var67; var68++) {
                int var69 = class229.field3584.method1829(70);
                int var70 = class229.field3584.method1826(30334);
                if (var70 == 255) {
                    var70 = class229.field3584.method1848((byte) -101);
                }
                if (var65 != null && var68 < var65.field4041.length) {
                    var65.field4041[var68] = var69;
                    var65.field4054[var68] = var70;
                }
                class173.method1232(var69 - 1, var70, 1, var64, var68);
            }
            if (var65 != null) {
                class111.method776(var65, (byte) 25);
            }
            class244.method1659(120);
            class64.field1037[class233.method1609(class195.field3155++, 31)] = class233.method1609(var64, 32767);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 171) {
            for (int var71 = 0; var71 < class28.field494.length; var71++) {
                if (class28.field494[var71] != null) {
                    class28.field494[var71].field900 = -1;
                }
            }
            for (int var72 = 0; var72 < class131.field2113.length; var72++) {
                if (class131.field2113[var72] != null) {
                    class131.field2113[var72].field900 = -1;
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 57) {
            class244.method1659(120);
            int var73 = class229.field3584.method1826(30334);
            int var74 = class229.field3584.method1864(93);
            int var75 = class229.field3584.method1854(false);
            class139.field2243[var75] = var74;
            class72.field1147[var75] = var73;
            class89.field1382[var75] = 1;
            for (int var76 = 0; var76 < 98; var76++) {
                if (class117.field1799[var76] <= var74) {
                    class89.field1382[var75] = var76 + 2;
                }
            }
            class192.field3141[class233.method1609(class211.field3370++, 31)] = var75;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 93) {
            int var77 = class229.field3584.method1837(252);
            int var78 = class229.field3584.method1849(255);
            int var79 = class229.field3584.method1837(252);
            if (var77 == 65535) {
                var77 = -1;
            }
            int var80 = class229.field3584.method1849(255);
            class60.method385(var78, (byte) 90, var79, var77, var80);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 244) {
            class249.field4099 = class229.field3584.method1849(255);
            class24.field439 = class68.field1083;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 243) {
            class244.method1659(120);
            class64.field1039 = class229.field3584.method1847(-404);
            class109.field1686 = class68.field1083;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 214) {
            int var81 = class229.field3584.method1854(false);
            int var82 = class229.field3584.method1815(-90);
            if (class166.method1187(var82, 65535)) {
                class156.field2504 = var81;
            }
            class88.field1369 = -1;
            return true;
        } else if (arg0 < 112) {
            return true;
        } else if (class88.field1369 == 82) {
            int var83 = class229.field3584.method1848((byte) -108);
            int var84 = class229.field3584.method1867((byte) -111);
            int var85 = class229.field3584.method1815(-116);
            int var86 = class229.field3584.method1815(-113);
            if (class166.method1187(var84, 65535)) {
                class26.method204(false, var83, (var85 << 16) + var86);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 98) {
            class31.field531 = class229.field3584.method1849(255);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 235) {
            int var87 = class229.field3584.method1829(21);
            int var88 = class229.field3584.method1820((byte) -96);
            int var89 = class229.field3584.method1854(false);
            if (class166.method1187(var87, 65535)) {
                class287.method1952(7, var88, var89);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 50) {
            int var90 = class229.field3584.method1849(255);
            int var91 = var90 >> 5;
            int var92 = var90 & 0x1F;
            if (var92 == 0) {
                class168.field2768[var91] = null;
                class88.field1369 = -1;
                return true;
            }
            class43 var93 = new class43();
            var93.field638 = var92;
            var93.field646 = class229.field3584.method1849(255);
            if (var93.field646 >= 0 && var93.field646 < class273.field4401.length) {
                if (var93.field638 == 1 || var93.field638 == 10) {
                    var93.field642 = class229.field3584.method1837(252);
                    class229.field3584.field4458 += 5;
                } else if (var93.field638 >= 2 && var93.field638 <= 6) {
                    if (var93.field638 == 2) {
                        var93.field635 = 64;
                        var93.field639 = 64;
                    }
                    if (var93.field638 == 3) {
                        var93.field635 = 64;
                        var93.field639 = 0;
                    }
                    if (var93.field638 == 4) {
                        var93.field635 = 64;
                        var93.field639 = 128;
                    }
                    if (var93.field638 == 5) {
                        var93.field635 = 0;
                        var93.field639 = 64;
                    }
                    if (var93.field638 == 6) {
                        var93.field635 = 128;
                        var93.field639 = 64;
                    }
                    var93.field638 = 2;
                    var93.field641 = class229.field3584.method1837(252);
                    var93.field644 = class229.field3584.method1837(252);
                    var93.field648 = class229.field3584.method1849(255);
                    var93.field636 = class229.field3584.method1837(252);
                }
                var93.field637 = class229.field3584.method1837(252);
                if (var93.field637 == 65535) {
                    var93.field637 = -1;
                }
                class168.field2768[var91] = var93;
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 33) {
            class84.field1342 = class229.field3584.method1837(252) * 30;
            class109.field1686 = class68.field1083;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 247) {
            int var94 = class229.field3584.method1849(255);
            int var95 = class229.field3584.method1849(255);
            byte var96 = class229.field3584.method1830((byte) -58);
            if (class130.field2071 != var96) {
                class88.field1369 = -1;
                return true;
            }
            if (var94 == 255) {
                class164.field2690 = 0;
                class46.field691 = false;
                class35.field569 = 0;
            } else {
                class46.field691 = true;
                class35.field569 = var94;
                class164.field2690 = var95;
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 178) {
            class244.method1659(120);
            class217.field3410 = class229.field3584.method1849(255);
            class109.field1686 = class68.field1083;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 31) {
            String var97 = class229.field3584.method1855(113);
            int var98 = class229.field3584.method1867((byte) -74);
            int var99 = class229.field3584.method1815(-112);
            if (class166.method1187(var98, 65535)) {
                class161.method1105((byte) -33, var99, var97);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 0) {
            int var100 = class229.field3584.method1837(252);
            int var101 = class229.field3584.method1864(105);
            int var102 = class229.field3584.method1848((byte) -119);
            if (class166.method1187(var100, 65535)) {
                class109 var103 = (class109) class74.field1192.method371(-103, (long) var102);
                class109 var104 = (class109) class74.field1192.method371(69, (long) var101);
                if (var104 != null) {
                    class8.method78(-9, var103 == null || var103.field1689 != var104.field1689, var104);
                }
                if (var103 != null) {
                    var103.method952((byte) 105);
                    class74.field1192.method368((long) var101, var103, -98);
                }
                class248 var105 = class281.method1913(var102, (byte) -117);
                if (var105 != null) {
                    class111.method776(var105, (byte) 25);
                }
                class248 var106 = class281.method1913(var101, (byte) 56);
                if (var106 != null) {
                    class111.method776(var106, (byte) 25);
                    class255.method1725((byte) -10, var106, true);
                }
                if (class68.field1089 != -1) {
                    class297.method2035((byte) 35, class68.field1089, 1);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 157) {
            long var107 = class229.field3584.method1834(3);
            class229.field3584.method1830((byte) 83);
            long var109 = class229.field3584.method1834(3);
            long var111 = (long) class229.field3584.method1837(252);
            long var113 = (long) class229.field3584.method1812(true);
            boolean var115 = false;
            int var116 = class229.field3584.method1849(255);
            int var117 = class229.field3584.method1837(252);
            long var118 = (var111 << 32) + var113;
            int var120 = 0;
            label1296: while (true) {
                if (var120 >= 100) {
                    if (var116 <= 1) {
                        for (int var121 = 0; var121 < class34.field562; var121++) {
                            if (class161.field2634[var121] == var107) {
                                var115 = true;
                                break label1296;
                            }
                        }
                    }
                    break;
                }
                if (class58.field836[var120] == var118) {
                    var115 = true;
                    break;
                }
                var120++;
            }
            if (!var115 && class306.field4983 == 0) {
                class58.field836[class28.field515] = var118;
                class28.field515 = (class28.field515 + 1) % 100;
                String var122 = class297.method2037(var117, -15736).method1745(class229.field3584, 0);
                if (var116 == 2 || var116 == 3) {
                    class35.method258(var122, class125.method857(var109, (byte) -110), var117, "<img=1>" + class125.method857(var107, (byte) -111), 20, -1);
                } else if (var116 == 1) {
                    class35.method258(var122, class125.method857(var109, (byte) -105), var117, "<img=0>" + class125.method857(var107, (byte) -96), 20, -1);
                } else {
                    class35.method258(var122, class125.method857(var109, (byte) -121), var117, class125.method857(var107, (byte) -108), 20, -1);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 246) {
            int var123 = class229.field3584.method1829(125);
            int var124 = class229.field3584.method1837(252);
            int var125 = class229.field3584.method1826(30334);
            if (class166.method1187(var124, 65535)) {
                if (var125 == 2) {
                    class268.method1788(false);
                }
                class68.field1089 = var123;
                class152.method1035(false, var123);
                class291.method2011(false, -30310);
                class273.method1807(class68.field1089, -1754690448);
                for (int var126 = 0; var126 < 100; var126++) {
                    class259.field4249[var126] = true;
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 9) {
            int var127 = class229.field3584.method1829(-120);
            int var128 = class229.field3584.method1837(252);
            int var129 = class229.field3584.method1829(88);
            int var130 = class229.field3584.method1833((byte) -104);
            int var131 = class229.field3584.method1837(252);
            if (class166.method1187(var127, 65535)) {
                class180.method1267(var128, var130, var131, var129, (byte) 48);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 60) {
            int var132 = class229.field3584.method1837(252);
            if (class166.method1187(var132, 65535)) {
                class294.method2019(-25488);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 138) {
            int var133 = class229.field3584.method1815(-121);
            int var134 = class229.field3584.method1864(87);
            class302.method2067(var133, var134, -30420);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 27) {
            for (int var135 = 0; var135 < class68.field1090.length; var135++) {
                if (class68.field1090[var135] != class310.field5022[var135]) {
                    class68.field1090[var135] = class310.field5022[var135];
                    class43.method291(var135, 124);
                    class58.field855[class233.method1609(31, class234.field3680++)] = var135;
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 18) {
            int var136 = class229.field3584.method1837(252);
            if (class166.method1187(var136, 65535)) {
                class290.method2002(2048);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 42) {
            String var137 = class229.field3584.method1855(-92);
            int var138 = class229.field3584.method1815(-94);
            int var139 = class229.field3584.method1815(-95);
            if (class166.method1187(var138, 65535)) {
                class161.method1105((byte) -33, var139, var137);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 122) {
            int var140 = class229.field3584.method1837(252);
            int var141 = class229.field3584.method1867((byte) -101);
            int var142 = class229.field3584.method1829(-110);
            if (class166.method1187(var140, 65535)) {
                class82.method585(var141, (byte) -37, var142);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 51) {
            int var143 = class229.field3584.method1826(30334);
            int var144 = class229.field3584.method1871((byte) -33);
            int var145 = class229.field3584.method1826(30334);
            class214.field3389 = var145 >> 1;
            class217.field3408.method97((var145 & 0x1) == 1, 512, var144, var143);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 130) {
            class272.method1803(2048, true);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 106) {
            class272.method1803(2048, false);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 227) {
            int var146 = class229.field3584.method1837(252);
            int var147 = class229.field3584.method1849(255);
            int var148 = class229.field3584.method1849(255);
            int var149 = class229.field3584.method1849(255);
            int var150 = class229.field3584.method1849(255);
            int var151 = class229.field3584.method1837(252);
            if (class166.method1187(var146, 65535)) {
                class12.field217[var147] = true;
                class90.field1415[var147] = var148;
                class74.field1186[var147] = var149;
                class220.field3473[var147] = var150;
                class139.field2232[var147] = var151;
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 21) {
            int var152 = class229.field3584.method1820((byte) 95);
            int var153 = class229.field3584.method1829(79);
            int var154 = class229.field3584.method1837(252);
            if (class166.method1187(var154, 65535)) {
                class186.method1310(var153, (byte) 37, var152);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 126) {
            String var155 = class229.field3584.method1855(-51);
            if (var155.endsWith(":tradereq:")) {
                String var192 = var155.substring(0, var155.indexOf(":"));
                long var193 = class162.method1114((byte) -127, var192);
                boolean var195 = false;
                for (int var196 = 0; var196 < class34.field562; var196++) {
                    if (class161.field2634[var196] == var193) {
                        var195 = true;
                        break;
                    }
                }
                if (!var195 && class306.field4983 == 0) {
                    class74.method536(class26.field470, var192, (byte) -128, 4);
                }
            } else if (var155.endsWith(":chalreq:")) {
                String var156 = var155.substring(0, var155.indexOf(":"));
                long var157 = class162.method1114((byte) -123, var156);
                boolean var159 = false;
                for (int var160 = 0; var160 < class34.field562; var160++) {
                    if (class161.field2634[var160] == var157) {
                        var159 = true;
                        break;
                    }
                }
                if (!var159 && class306.field4983 == 0) {
                    String var161 = var155.substring(var155.indexOf(":") + 1, var155.length() + -9);
                    class74.method536(var161, var156, (byte) -105, 8);
                }
            } else if (var155.endsWith(":assistreq:")) {
                String var187 = var155.substring(0, var155.indexOf(":"));
                long var188 = class162.method1114((byte) -123, var187);
                boolean var190 = false;
                for (int var191 = 0; var191 < class34.field562; var191++) {
                    if (class161.field2634[var191] == var188) {
                        var190 = true;
                        break;
                    }
                }
                if (!var190 && class306.field4983 == 0) {
                    class74.method536("", var187, (byte) -110, 10);
                }
            } else if (var155.endsWith(":clan:")) {
                String var186 = var155.substring(0, var155.indexOf(":clan:"));
                class74.method536(var186, "", (byte) -108, 11);
            } else if (var155.endsWith(":trade:")) {
                String var185 = var155.substring(0, var155.indexOf(":trade:"));
                if (class306.field4983 == 0) {
                    class74.method536(var185, "", (byte) -53, 12);
                }
            } else if (var155.endsWith(":assist:")) {
                String var184 = var155.substring(0, var155.indexOf(":assist:"));
                if (class306.field4983 == 0) {
                    class74.method536(var184, "", (byte) -105, 13);
                }
            } else if (var155.endsWith(":duelstake:")) {
                String var179 = var155.substring(0, var155.indexOf(":"));
                long var180 = class162.method1114((byte) -121, var179);
                boolean var182 = false;
                for (int var183 = 0; var183 < class34.field562; var183++) {
                    if (class161.field2634[var183] == var180) {
                        var182 = true;
                        break;
                    }
                }
                if (!var182 && class306.field4983 == 0) {
                    class74.method536("", var179, (byte) -113, 14);
                }
            } else if (var155.endsWith(":duelfriend:")) {
                boolean var174 = false;
                String var175 = var155.substring(0, var155.indexOf(":"));
                long var176 = class162.method1114((byte) -118, var175);
                for (int var178 = 0; var178 < class34.field562; var178++) {
                    if (class161.field2634[var178] == var176) {
                        var174 = true;
                        break;
                    }
                }
                if (!var174 && class306.field4983 == 0) {
                    class74.method536("", var175, (byte) -56, 15);
                }
            } else if (var155.endsWith(":clanreq:")) {
                String var162 = var155.substring(0, var155.indexOf(":"));
                long var163 = class162.method1114((byte) -119, var162);
                boolean var165 = false;
                for (int var166 = 0; var166 < class34.field562; var166++) {
                    if (class161.field2634[var166] == var163) {
                        var165 = true;
                        break;
                    }
                }
                if (!var165 && class306.field4983 == 0) {
                    class74.method536("", var162, (byte) -75, 16);
                }
            } else if (var155.endsWith(":allyreq:")) {
                String var167 = var155.substring(0, var155.indexOf(":"));
                boolean var168 = false;
                long var169 = class162.method1114((byte) -117, var167);
                for (int var171 = 0; var171 < class34.field562; var171++) {
                    if (class161.field2634[var171] == var169) {
                        var168 = true;
                        break;
                    }
                }
                if (!var168 && class306.field4983 == 0) {
                    String var172 = var155.substring(var155.indexOf(":") + 1, var155.length() + -9);
                    class74.method536(var172, var167, (byte) -69, 21);
                }
            } else if (var155.endsWith(":spam:")) {
                String var173 = var155.substring(0, var155.length() - 6);
                if (class306.field4983 == 0) {
                    class74.method536(var173, "", (byte) -126, 22);
                }
            } else {
                class74.method536(var155, "", (byte) -68, 0);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 80) {
            int var197 = class229.field3584.method1847(-404);
            int var198 = class229.field3584.method1848((byte) -121);
            int var199 = class229.field3584.method1867((byte) -94);
            if (class166.method1187(var199, 65535)) {
                class157.method1062(var198, false, var197);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 72) {
            long var200 = class229.field3584.method1834(3);
            boolean var202 = false;
            if ((Long.MIN_VALUE & var200) != 0L) {
                var202 = true;
            }
            int var203 = class229.field3584.method1837(252);
            byte var204 = class229.field3584.method1830((byte) 89);
            if (var202) {
                if (class191.field3106 == 0) {
                    class88.field1369 = -1;
                    return true;
                }
                boolean var210 = false;
                long var211 = var200 & Long.MAX_VALUE;
                int var213;
                for (var213 = 0; class191.field3106 > var213 && (class7.field167[var213].field2209 != var211 || class7.field167[var213].field724 != var203); var213++) {
                }
                if (var213 < class191.field3106) {
                    while (var213 < class191.field3106 - 1) {
                        class7.field167[var213] = class7.field167[var213 + 1];
                        var213++;
                    }
                    class191.field3106--;
                    class7.field167[class191.field3106] = null;
                }
            } else {
                String var205 = class229.field3584.method1855(89);
                class50 var206 = new class50();
                var206.field2209 = var200;
                var206.field728 = class177.method1247(-16702, var206.field2209);
                var206.field724 = var203;
                var206.field733 = var205;
                var206.field722 = var204;
                int var207;
                for (var207 = class191.field3106 - 1; var207 >= 0; var207--) {
                    int var208 = class7.field167[var207].field728.compareTo(var206.field728);
                    if (var208 == 0) {
                        class7.field167[var207].field724 = var203;
                        class7.field167[var207].field722 = var204;
                        class7.field167[var207].field733 = var205;
                        if (class48.field712 == var200) {
                            class311.field5029 = var204;
                        }
                        class88.field1369 = -1;
                        class188.field3095 = class68.field1083;
                        return true;
                    }
                    if (var208 < 0) {
                        break;
                    }
                }
                if (class7.field167.length <= class191.field3106) {
                    class88.field1369 = -1;
                    return true;
                }
                for (int var209 = class191.field3106 - 1; var209 > var207; var209--) {
                    class7.field167[var209 + 1] = class7.field167[var209];
                }
                if (class191.field3106 == 0) {
                    class7.field167 = new class50[100];
                }
                class7.field167[var207 + 1] = var206;
                if (class48.field712 == var200) {
                    class311.field5029 = var204;
                }
                class191.field3106++;
            }
            class188.field3095 = class68.field1083;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 169) {
            class50.method321(false);
            class244.method1659(120);
            class88.field1369 = -1;
            class234.field3680 += 32;
            return true;
        } else if (class88.field1369 == 88) {
            class203.field3287 = class229.field3584.method1849(255);
            class153.field2458 = class229.field3584.method1849(255);
            class280.field4560 = class229.field3584.method1849(255);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 193) {
            int var214 = class229.field3584.method1829(90);
            int var215 = class229.field3584.method1837(252);
            int var216 = class229.field3584.method1833((byte) -104);
            if (class166.method1187(var214, 65535)) {
                class134.method915(var216, var215, (byte) 112);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 87) {
            int var217 = class229.field3584.method1833((byte) -104);
            int var218 = class229.field3584.method1837(252);
            if (var217 < -70000) {
                var218 += 32768;
            }
            class248 var219;
            if (var217 < 0) {
                var219 = null;
            } else {
                var219 = class281.method1913(var217, (byte) 87);
            }
            while (class229.field3584.field4458 < class271.field4366) {
                int var220 = class229.field3584.method1863((byte) -118);
                int var221 = class229.field3584.method1837(252);
                int var222 = 0;
                if (var221 != 0) {
                    var222 = class229.field3584.method1849(255);
                    if (var222 == 255) {
                        var222 = class229.field3584.method1833((byte) -104);
                    }
                }
                if (var219 != null && var220 >= 0 && var219.field4041.length > var220) {
                    var219.field4041[var220] = var221;
                    var219.field4054[var220] = var222;
                }
                class173.method1232(var221 - 1, var222, 1, var218, var220);
            }
            if (var219 != null) {
                class111.method776(var219, (byte) 25);
            }
            class244.method1659(120);
            class64.field1037[class233.method1609(class195.field3155++, 31)] = class233.method1609(32767, var218);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 32) {
            int var223 = class229.field3584.method1867((byte) -95);
            int var224 = class229.field3584.method1837(252);
            if (var223 == 65535) {
                var223 = -1;
            }
            int var225 = class229.field3584.method1864(101);
            int var226 = class229.field3584.method1815(-109);
            int var227 = class229.field3584.method1867((byte) -120);
            if (var227 == 65535) {
                var227 = -1;
            }
            if (class166.method1187(var226, 65535)) {
                for (int var228 = var223; var228 <= var227; var228++) {
                    long var229 = ((long) var225 << 32) + ((long) var228);
                    class22 var231 = (class22) class233.field3638.method371(-127, var229);
                    class22 var232;
                    if (var231 != null) {
                        var232 = new class22(var231.field427, var224);
                        var231.method952((byte) 80);
                    } else if (var228 == -1) {
                        var232 = new class22(class281.method1913(var225, (byte) 123).field3965.field427, var224);
                    } else {
                        var232 = new class22(0, var224);
                    }
                    class233.field3638.method368(var229, var232, -104);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 91) {
            int var233 = class229.field3584.method1864(91);
            class35.field564 = class44.field659.method474(var233, 89);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 211) {
            class34.field562 = class271.field4366 / 8;
            for (int var234 = 0; var234 < class34.field562; var234++) {
                class161.field2634[var234] = class229.field3584.method1834(3);
                class121.field1912[var234] = class263.method1773(-5, class161.field2634[var234]);
                class29.field526[var234] = false;
            }
            class88.field1369 = -1;
            class24.field439 = class68.field1083;
            return true;
        } else if (class88.field1369 == 222) {
            int var235 = class229.field3584.method1867((byte) -122);
            class162.method1112((byte) 109, var235);
            class64.field1037[class233.method1609(class195.field3155++, 31)] = class233.method1609(var235, 32767);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 152) {
            long var236 = class229.field3584.method1834(3);
            class229.field3584.method1830((byte) 61);
            long var238 = class229.field3584.method1834(3);
            long var240 = (long) class229.field3584.method1837(252);
            long var242 = (long) class229.field3584.method1812(true);
            long var244 = (var240 << 32) + var242;
            int var246 = class229.field3584.method1849(255);
            boolean var247 = false;
            int var248 = 0;
            label1457: while (true) {
                if (var248 >= 100) {
                    if (var246 <= 1) {
                        if ((!class86.field1357 || class91.field1450) && !class25.field457) {
                            for (int var249 = 0; var249 < class34.field562; var249++) {
                                if (class161.field2634[var249] == var236) {
                                    var247 = true;
                                    break label1457;
                                }
                            }
                        } else {
                            var247 = true;
                        }
                    }
                    break;
                }
                if (class58.field836[var248] == var244) {
                    var247 = true;
                    break;
                }
                var248++;
            }
            if (!var247 && class306.field4983 == 0) {
                class58.field836[class28.field515] = var244;
                class28.field515 = (class28.field515 + 1) % 100;
                String var250 = class73.method529(class5.method64(false, class124.method856(0, class229.field3584)));
                if (var246 == 2 || var246 == 3) {
                    class121.method832("<img=1>" + class125.method857(var236, (byte) -98), class125.method857(var238, (byte) -88), var250, 9, 2883983);
                } else if (var246 == 1) {
                    class121.method832("<img=0>" + class125.method857(var236, (byte) -93), class125.method857(var238, (byte) -101), var250, 9, 2883983);
                } else {
                    class121.method832(class125.method857(var236, (byte) -71), class125.method857(var238, (byte) -112), var250, 9, 2883983);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 154) {
            class116.method801(104);
            class88.field1369 = -1;
            return false;
        } else if (class88.field1369 == 184) {
            class97.method695(107);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 44) {
            int var251 = class229.field3584.method1867((byte) -93);
            int var252 = class229.field3584.method1820((byte) 17);
            String var253 = class229.field3584.method1855(-71);
            if (class166.method1187(var251, 65535)) {
                class205.method1419(var252, (byte) 55, var253);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 12) {
            int var254 = class229.field3584.method1837(252);
            int var255 = class229.field3584.method1849(255);
            int var256 = class229.field3584.method1849(255);
            int var257 = class229.field3584.method1837(252);
            int var258 = class229.field3584.method1849(255);
            int var259 = class229.field3584.method1849(255);
            if (class166.method1187(var254, 65535)) {
                class297.method2036(var256, var258, var257, var259, true, var255, 18120);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 183) {
            long var260 = class229.field3584.method1834(3);
            long var262 = (long) class229.field3584.method1837(252);
            long var264 = (long) class229.field3584.method1812(true);
            int var266 = class229.field3584.method1849(255);
            int var267 = class229.field3584.method1837(252);
            long var268 = (var262 << 32) + var264;
            boolean var270 = false;
            int var271 = 0;
            label1475: while (true) {
                if (var271 >= 100) {
                    if (var266 <= 1) {
                        for (int var272 = 0; var272 < class34.field562; var272++) {
                            if (class161.field2634[var272] == var260) {
                                var270 = true;
                                break label1475;
                            }
                        }
                    }
                    break;
                }
                if (class58.field836[var271] == var268) {
                    var270 = true;
                    break;
                }
                var271++;
            }
            if (!var270 && class306.field4983 == 0) {
                class58.field836[class28.field515] = var268;
                class28.field515 = (class28.field515 + 1) % 100;
                String var273 = class297.method2037(var267, -15736).method1745(class229.field3584, 0);
                if (var266 == 2) {
                    class35.method258(var273, (String) null, var267, "<img=1>" + class125.method857(var260, (byte) -122), 18, -1);
                } else if (var266 == 1) {
                    class35.method258(var273, (String) null, var267, "<img=0>" + class125.method857(var260, (byte) -99), 18, -1);
                } else {
                    class35.method258(var273, (String) null, var267, class125.method857(var260, (byte) -99), 18, -1);
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 203) {
            int var274 = class229.field3584.method1829(-121);
            int var275 = class229.field3584.method1820((byte) -101);
            int var276 = class229.field3584.method1815(-115);
            int var277 = class229.field3584.method1854(false);
            if (class166.method1187(var276, 65535)) {
                class109 var278 = (class109) class74.field1192.method371(104, (long) var275);
                if (var278 != null) {
                    class8.method78(-9, var278.field1689 != var274, var278);
                }
                class269.method1792(var277, 26, var274, var275);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 63) {
            int var279 = class229.field3584.method1815(-95);
            if (var279 == 65535) {
                var279 = -1;
            }
            int var280 = class229.field3584.method1833((byte) -104);
            int var281 = var280 >> 28 & 0x3;
            int var282 = (var280 & 0xFFFDE05) >> 14;
            int var283 = var280 & 0x3FFF;
            int var284 = class229.field3584.method1871((byte) -33);
            int var285 = var284 >> 2;
            int var286 = var283 - class145.field2327;
            int var287 = var284 & 0x3;
            int var288 = var282 - class75.field1211;
            int var289 = class75.field1207[var285];
            class110.method768(var279, var281, var289, var288, var285, var286, -947781874, var287);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 146) {
            int var290 = class229.field3584.method1829(57);
            int var291 = class229.field3584.method1848((byte) -127);
            if (class166.method1187(var290, 65535)) {
                int var292 = 0;
                if (class217.field3408.field232 != null) {
                    var292 = class217.field3408.field232.method1907((byte) -123);
                }
                class304.method2068(3, -1, var291, true, var292);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 16) {
            int var293 = class229.field3584.method1837(252);
            String var294 = class229.field3584.method1855(87);
            Object[] var295 = new Object[var294.length() + 1];
            for (int var296 = var294.length() - 1; var296 >= 0; var296--) {
                if (var294.charAt(var296) == 's') {
                    var295[var296 + 1] = class229.field3584.method1855(-124);
                } else {
                    var295[var296 + 1] = Integer.valueOf(class229.field3584.method1833((byte) -104));
                }
            }
            var295[0] = Integer.valueOf(class229.field3584.method1833((byte) -104));
            if (class166.method1187(var293, 65535)) {
                class78 var297 = new class78();
                var297.field1265 = var295;
                class139.method959((byte) 119, var297);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 10) {
            int var298 = class229.field3584.method1837(252);
            int var299 = class229.field3584.method1867((byte) -102);
            int var300 = class229.field3584.method1854(false);
            class104 var301 = class131.field2113[var298];
            if (var301 != null) {
                class52.method329(var301, var299, 4, var300);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 24) {
            class159.method1091(-84, class229.field3584.method1855(-79));
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 223) {
            int var302 = class229.field3584.method1848((byte) -99);
            class248 var303 = class281.method1913(var302, (byte) 64);
            for (int var304 = 0; var304 < var303.field4041.length; var304++) {
                var303.field4041[var304] = -1;
                var303.field4041[var304] = 0;
            }
            class111.method776(var303, (byte) 25);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 166) {
            int var305 = class229.field3584.method1837(252);
            int var306 = class229.field3584.method1849(255);
            int var307 = class229.field3584.method1849(255);
            int var308 = class229.field3584.method1837(252);
            int var309 = class229.field3584.method1849(255);
            int var310 = class229.field3584.method1849(255);
            if (class166.method1187(var305, 65535)) {
                class109.method767(true, var306, var309, var308, var307, var310);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 219) {
            byte[] var311 = new byte[class271.field4366];
            class229.field3584.method2083(0, (byte) 31, class271.field4366, var311);
            String var312 = class88.method616(var311, 0, class271.field4366, -161);
            if (class53.field776 == null && class69.field1112 == 3 || !class69.field1109.startsWith("win") || class5.field109) {
                class168.method1196(var312, true, 78);
            } else {
                class169.field2774 = true;
                class21.field405 = var312;
                class87.field1368 = class44.field659.method470(var312, true);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 120) {
            int var313 = class229.field3584.method1837(252);
            int var314 = class229.field3584.method1833((byte) -104);
            if (class166.method1187(var313, 65535)) {
                class109 var315 = (class109) class74.field1192.method371(-111, (long) var314);
                if (var315 != null) {
                    class8.method78(-9, true, var315);
                }
                if (class221.field3485 != null) {
                    class111.method776(class221.field3485, (byte) 25);
                    class221.field3485 = null;
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 69) {
            class44.method294(12794);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 52) {
            if (class68.field1089 != -1) {
                class297.method2035((byte) 36, class68.field1089, 0);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 110) {
            int var316 = class229.field3584.method1833((byte) -104);
            int var317 = class229.field3584.method1815(-113);
            int var318 = class229.field3584.method1829(79);
            int var319 = class229.field3584.method1829(-111);
            if (var316 >> 30 != 0) {
                int var320 = (var316 & 0x3D67E7DD) >> 28;
                int var321 = (var316 & 0x3FFF) - class145.field2327;
                int var322 = (var316 >> 14 & 0x3FFF) - class75.field1211;
                if (var322 >= 0 && var321 >= 0 && var322 < 104 && var321 < 104) {
                    int var323 = var321 * 128 + 64;
                    int var324 = var322 * 128 + 64;
                    class98 var325 = new class98(var317, var320, var324, var323, class60.method387(-18796, var323, var324, var320) - var319, var318, class274.field4472);
                    class127.field2023.method1554(5257, new class27(var325));
                }
            } else if (var316 >> 29 != 0) {
                int var338 = var316 & 0xFFFF;
                class104 var339 = class131.field2113[var338];
                if (var339 != null) {
                    if (var317 == 65535) {
                        var317 = -1;
                    }
                    boolean var340 = true;
                    if (var317 != -1 && var339.field995 != -1) {
                        if (var339.field995 == var317) {
                            class156 var341 = class166.method1182(1, var317);
                            if (var341.field2479 && var341.field2486 != -1) {
                                class91 var342 = class159.method1085((byte) -63, var341.field2486);
                                int var343 = var342.field1453;
                                if (var343 == 1) {
                                    var339.field979 = 0;
                                    var339.field911 = 0;
                                    var340 = false;
                                    var339.field896 = class274.field4472 + var318;
                                    var339.field972 = 0;
                                    var339.field919 = 1;
                                    class252.method1710(var339.field911, var339.field929, var342, var339.field994, false, 51);
                                } else if (var343 == 2) {
                                    var339.field955 = 0;
                                    var340 = false;
                                }
                            }
                        } else {
                            class156 var344 = class166.method1182(1, var317);
                            class156 var345 = class166.method1182(1, var339.field995);
                            if (var344.field2486 != -1 && var345.field2486 != -1) {
                                class91 var346 = class159.method1085((byte) -63, var344.field2486);
                                class91 var347 = class159.method1085((byte) -63, var345.field2486);
                                if (var346.field1447 < var347.field1447) {
                                    var340 = false;
                                }
                            }
                        }
                    }
                    if (var340) {
                        var339.field979 = 0;
                        var339.field911 = 0;
                        var339.field896 = class274.field4472 + var318;
                        if (var339.field896 > class274.field4472) {
                            var339.field911 = -1;
                        }
                        var339.field919 = 1;
                        var339.field901 = var319;
                        var339.field995 = var317;
                        if (var339.field995 != -1 && class274.field4472 == var339.field896) {
                            int var348 = class166.method1182(1, var339.field995).field2486;
                            if (var348 != -1) {
                                class91 var349 = class159.method1085((byte) -63, var348);
                                if (var349 != null && var349.field1434 != null) {
                                    class252.method1710(0, var339.field929, var349, var339.field994, false, 103);
                                }
                            }
                        }
                    }
                }
            } else if ((var316 >> 28) != 0) {
                int var326 = var316 & 0xFFFF;
                class12 var327;
                if (class41.field632 == var326) {
                    var327 = class217.field3408;
                } else {
                    var327 = class28.field494[var326];
                }
                if (var327 != null) {
                    if (var317 == 65535) {
                        var317 = -1;
                    }
                    boolean var328 = true;
                    if (var317 != -1 && var327.field995 != -1) {
                        if (var327.field995 == var317) {
                            class156 var329 = class166.method1182(1, var317);
                            if (var329.field2479 && var329.field2486 != -1) {
                                class91 var330 = class159.method1085((byte) -63, var329.field2486);
                                int var331 = var330.field1453;
                                if (var331 == 1) {
                                    var328 = false;
                                    var327.field911 = 0;
                                    var327.field919 = 1;
                                    var327.field896 = class274.field4472 + var318;
                                    var327.field979 = 0;
                                    var327.field972 = 0;
                                    class252.method1710(var327.field911, var327.field929, var330, var327.field994, false, 125);
                                } else if (var331 == 2) {
                                    var328 = false;
                                    var327.field955 = 0;
                                }
                            }
                        } else {
                            class156 var332 = class166.method1182(1, var317);
                            class156 var333 = class166.method1182(1, var327.field995);
                            if (var332.field2486 != -1 && var333.field2486 != -1) {
                                class91 var334 = class159.method1085((byte) -63, var332.field2486);
                                class91 var335 = class159.method1085((byte) -63, var333.field2486);
                                if (var334.field1447 < var335.field1447) {
                                    var328 = false;
                                }
                            }
                        }
                    }
                    if (var328) {
                        var327.field911 = 0;
                        var327.field901 = var319;
                        var327.field979 = 0;
                        var327.field995 = var317;
                        var327.field896 = class274.field4472 + var318;
                        if (class274.field4472 < var327.field896) {
                            var327.field911 = -1;
                        }
                        var327.field919 = 1;
                        if (var327.field995 == 65535) {
                            var327.field995 = -1;
                        }
                        if (var327.field995 != -1 && class274.field4472 == var327.field896) {
                            int var336 = class166.method1182(1, var327.field995).field2486;
                            if (var336 != -1) {
                                class91 var337 = class159.method1085((byte) -63, var336);
                                if (var337 != null && var337.field1434 != null) {
                                    class252.method1710(0, var327.field929, var337, var327.field994, class217.field3408 == var327, 80);
                                }
                            }
                        }
                    }
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 176) {
            class188.field3095 = class68.field1083;
            long var350 = class229.field3584.method1834(3);
            if (var350 == 0L) {
                class172.field2834 = null;
                class191.field3106 = 0;
                class88.field1369 = -1;
                class7.field167 = null;
                class220.field3472 = null;
                return true;
            }
            long var352 = class229.field3584.method1834(3);
            class220.field3472 = class177.method1247(-16702, var352);
            class172.field2834 = class177.method1247(-16702, var350);
            class150.field2399 = class229.field3584.method1830((byte) -65);
            int var354 = class229.field3584.method1849(255);
            if (var354 == 255) {
                class88.field1369 = -1;
                return true;
            }
            class191.field3106 = var354;
            class50[] var355 = new class50[100];
            for (int var356 = 0; var356 < class191.field3106; var356++) {
                var355[var356] = new class50();
                var355[var356].field2209 = class229.field3584.method1834(3);
                var355[var356].field728 = class177.method1247(-16702, var355[var356].field2209);
                var355[var356].field724 = class229.field3584.method1837(252);
                var355[var356].field722 = class229.field3584.method1830((byte) -80);
                var355[var356].field733 = class229.field3584.method1855(117);
                if (class48.field712 == var355[var356].field2209) {
                    class311.field5029 = var355[var356].field722;
                }
            }
            boolean var357 = false;
            int var358 = class191.field3106;
            while (var358 > 0) {
                boolean var359 = true;
                var358--;
                for (int var360 = 0; var360 < var358; var360++) {
                    if (var355[var360].field728.compareTo(var355[var360 + 1].field728) > 0) {
                        var359 = false;
                        class50 var361 = var355[var360];
                        var355[var360] = var355[var360 + 1];
                        var355[var360 + 1] = var361;
                    }
                }
                if (var359) {
                    break;
                }
            }
            class7.field167 = var355;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 189) {
            int var362 = class229.field3584.method1849(255);
            if (class229.field3584.method1849(255) == 0) {
                class307.field4992[var362] = new class8();
            } else {
                class229.field3584.field4458--;
                class307.field4992[var362] = new class8(class229.field3584);
            }
            class291.field4765 = class68.field1083;
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 245) {
            int var363 = class229.field3584.method1826(30334);
            int var364 = class229.field3584.method1826(30334);
            int var365 = class229.field3584.method1829(-120);
            String var366 = class229.field3584.method1855(111);
            if (var365 == 65535) {
                var365 = -1;
            }
            if (var363 >= 1 && var363 <= 8) {
                if (var366.equalsIgnoreCase("null")) {
                    var366 = null;
                }
                class90.field1408[var363 - 1] = var366;
                class205.field3296[var363 - 1] = var365;
                class238.field3736[var363 - 1] = var364 == 0;
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 124) {
            class113.field1727 = class229.field3584.method1854(false);
            class241.field3763 = class229.field3584.method1854(false);
            for (int var367 = class113.field1727; var367 < (class113.field1727 + 8); var367++) {
                for (int var369 = class241.field3763; var369 < class241.field3763 + 8; var369++) {
                    if (class296.field4827[class214.field3389][var367][var369] != null) {
                        class296.field4827[class214.field3389][var367][var369] = null;
                        class63.method409(var369, (byte) -81, var367);
                    }
                }
            }
            for (class127 var368 = (class127) class148.field2366.method1553(true); var368 != null; var368 = (class127) class148.field2366.method1551(0)) {
                if (class113.field1727 <= var368.field2035 && var368.field2035 < class113.field1727 + 8 && class241.field3763 <= var368.field2024 && (class241.field3763 + 8) > var368.field2024 && class214.field3389 == var368.field2028) {
                    var368.field2029 = 0;
                }
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 133) {
            long var370 = class229.field3584.method1834(3);
            String var372 = class73.method529(class5.method64(false, class124.method856(0, class229.field3584)));
            class74.method536(var372, class125.method857(var370, (byte) -95), (byte) -106, 6);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 170) {
            int var373 = class229.field3584.method1820((byte) 57);
            int var374 = class229.field3584.method1815(-97);
            class249.method1697(var373, var374, -72);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 28) {
            if (class271.field4366 == 0) {
                class78.field1254 = class33.field540;
            } else {
                class78.field1254 = class229.field3584.method1855(-108);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 162) {
            class74.method535(class44.field659, class229.field3584, class271.field4366, false);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 119) {
            class241.field3763 = class229.field3584.method1849(255);
            class113.field1727 = class229.field3584.method1854(false);
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 117) {
            int var375 = class229.field3584.method1867((byte) -66);
            byte var376 = class229.field3584.method1870(true);
            int var377 = class229.field3584.method1815(-128);
            if (class166.method1187(var375, 65535)) {
                class133.method903(-11072, var377, var376);
            }
            class88.field1369 = -1;
            return true;
        } else if (class88.field1369 == 208) {
            long var378 = class229.field3584.method1834(3);
            int var380 = class229.field3584.method1837(252);
            String var381 = "";
            int var382 = class229.field3584.method1849(255);
            if (var380 > 0) {
                var381 = class229.field3584.method1855(-55);
            }
            boolean var383 = true;
            if (var378 < 0L) {
                var378 &= Long.MAX_VALUE;
                var383 = false;
            }
            String var384 = class125.method857(var378, (byte) -105);
            for (int var385 = 0; var385 < class146.field2345; var385++) {
                if (class44.field651[var385] == var378) {
                    if (class135.field2186[var385] != var380) {
                        class135.field2186[var385] = var380;
                        if (var380 > 0) {
                            class74.method536(var384 + class263.field4305, "", (byte) -110, 5);
                        }
                        if (var380 == 0) {
                            class74.method536(var384 + class165.field2733, "", (byte) -119, 5);
                        }
                    }
                    class6.field128[var385] = var381;
                    var384 = null;
                    class210.field3359[var385] = var382;
                    class112.field1721[var385] = var383;
                    break;
                }
            }
            if (var384 != null && class146.field2345 < 200) {
                class44.field651[class146.field2345] = var378;
                class240.field3748[class146.field2345] = var384;
                class135.field2186[class146.field2345] = var380;
                class6.field128[class146.field2345] = var381;
                class210.field3359[class146.field2345] = var382;
                class112.field1721[class146.field2345] = var383;
                class146.field2345++;
            }
            class24.field439 = class68.field1083;
            boolean var386 = false;
            int var387 = class146.field2345;
            while (var387 > 0) {
                boolean var388 = true;
                var387--;
                for (int var389 = 0; var389 < var387; var389++) {
                    if (class135.field2186[var389] != class62.field916 && class135.field2186[var389 + 1] == class62.field916 || class135.field2186[var389] == 0 && class135.field2186[var389 + 1] != 0) {
                        int var390 = class135.field2186[var389];
                        var388 = false;
                        class135.field2186[var389] = class135.field2186[var389 + 1];
                        class135.field2186[var389 + 1] = var390;
                        String var391 = class6.field128[var389];
                        class6.field128[var389] = class6.field128[var389 + 1];
                        class6.field128[var389 + 1] = var391;
                        String var392 = class240.field3748[var389];
                        class240.field3748[var389] = class240.field3748[var389 + 1];
                        class240.field3748[var389 + 1] = var392;
                        long var393 = class44.field651[var389];
                        class44.field651[var389] = class44.field651[var389 + 1];
                        class44.field651[var389 + 1] = var393;
                        int var395 = class210.field3359[var389];
                        class210.field3359[var389] = class210.field3359[var389 + 1];
                        class210.field3359[var389 + 1] = var395;
                        boolean var396 = class112.field1721[var389];
                        class112.field1721[var389] = class112.field1721[var389 + 1];
                        class112.field1721[var389 + 1] = var396;
                    }
                }
                if (var388) {
                    break;
                }
            }
            class88.field1369 = -1;
            return true;
        } else {
            class284.method1930(-111, "T1 - " + class88.field1369 + "," + class251.field4126 + "," + class119.field1892 + " - " + class271.field4366, (Throwable) null);
            class116.method801(104);
            return true;
        }
    }
}
