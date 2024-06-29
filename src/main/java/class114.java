import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class114 extends class302 {

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1751 = "purple:";

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field1754 = 1;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lqg;")
    public static class195 field1750;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z", line = 7)
    public static final boolean method785(int arg0) throws IOException {
        field1757++;
        if (class168.field2517 == null) {
            return false;
        }
        if (arg0 != 8) {
            method786(-35, -101, true);
        }
        int var1 = class168.field2517.method1137(-2266);
        if (var1 == 0) {
            return false;
        }
        if (class217.field3289 == -1) {
            var1--;
            class168.field2517.method1142(1, true, class207.field3137.field3986, 0);
            class207.field3137.field4025 = 0;
            class217.field3289 = class207.field3137.method20((byte) -17);
            class3.field13 = class191.field2856[class217.field3289];
        }
        if (class3.field13 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class168.field2517.method1142(1, true, class207.field3137.field3986, 0);
            var1--;
            class3.field13 = class207.field3137.field3986[0] & 0xFF;
        }
        if (class3.field13 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class168.field2517.method1142(2, true, class207.field3137.field3986, 0);
            class207.field3137.field4025 = 0;
            class3.field13 = class207.field3137.method1830((byte) -77);
        }
        if (var1 < class3.field13) {
            return false;
        }
        class207.field3137.field4025 = 0;
        class168.field2517.method1142(class3.field13, true, class207.field3137.field3986, 0);
        class70.field926 = 0;
        class318.field4790 = class92.field1379;
        class92.field1379 = class259.field3941;
        class259.field3941 = class217.field3289;
        if (class217.field3289 == 3) {
            int var2 = class207.field3137.method1830((byte) -77);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var3 = class207.field3137.method1787(false);
            int var4 = class207.field3137.method1830((byte) -77);
            class154.method1103(var3, var2, -74, var4);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 148) {
            class41.method277((byte) 90);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 209) {
            String var5 = class207.field3137.method1801(-30054);
            if (var5.endsWith(":tradereq:")) {
                String var6 = var5.substring(0, var5.indexOf(":"));
                boolean var7 = false;
                long var8 = class242.method1638(var6, -14393);
                for (int var10 = 0; var10 < class247.field3687; var10++) {
                    if (class212.field3220[var10] == var8) {
                        var7 = true;
                        break;
                    }
                }
                if (!var7 && class121.field1895 == 0) {
                    class92.method656(4, class170.field2563, var6, -1);
                }
            } else if (var5.endsWith(":chalreq:")) {
                boolean var40 = false;
                String var41 = var5.substring(0, var5.indexOf(":"));
                long var42 = class242.method1638(var41, -14393);
                for (int var44 = 0; var44 < class247.field3687; var44++) {
                    if (class212.field3220[var44] == var42) {
                        var40 = true;
                        break;
                    }
                }
                if (!var40 && class121.field1895 == 0) {
                    String var45 = var5.substring(var5.indexOf(":") + 1, var5.length() + -9);
                    class92.method656(8, var45, var41, arg0 ^ 0xFFFFFFF7);
                }
            } else if (var5.endsWith(":assistreq:")) {
                String var35 = var5.substring(0, var5.indexOf(":"));
                boolean var36 = false;
                long var37 = class242.method1638(var35, -14393);
                for (int var39 = 0; var39 < class247.field3687; var39++) {
                    if (class212.field3220[var39] == var37) {
                        var36 = true;
                        break;
                    }
                }
                if (!var36 && class121.field1895 == 0) {
                    class92.method656(10, "", var35, -1);
                }
            } else if (var5.endsWith(":clan:")) {
                String var11 = var5.substring(0, var5.indexOf(":clan:"));
                class92.method656(11, var11, "", -1);
            } else if (var5.endsWith(":trade:")) {
                String var12 = var5.substring(0, var5.indexOf(":trade:"));
                if (class121.field1895 == 0) {
                    class92.method656(12, var12, "", arg0 ^ 0xFFFFFFF7);
                }
            } else if (var5.endsWith(":assist:")) {
                String var13 = var5.substring(0, var5.indexOf(":assist:"));
                if (class121.field1895 == 0) {
                    class92.method656(13, var13, "", -1);
                }
            } else if (var5.endsWith(":duelstake:")) {
                String var30 = var5.substring(0, var5.indexOf(":"));
                boolean var31 = false;
                long var32 = class242.method1638(var30, -14393);
                for (int var34 = 0; var34 < class247.field3687; var34++) {
                    if (class212.field3220[var34] == var32) {
                        var31 = true;
                        break;
                    }
                }
                if (!var31 && class121.field1895 == 0) {
                    class92.method656(14, "", var30, -1);
                }
            } else if (var5.endsWith(":duelfriend:")) {
                String var14 = var5.substring(0, var5.indexOf(":"));
                long var15 = class242.method1638(var14, -14393);
                boolean var17 = false;
                for (int var18 = 0; var18 < class247.field3687; var18++) {
                    if (class212.field3220[var18] == var15) {
                        var17 = true;
                        break;
                    }
                }
                if (!var17 && class121.field1895 == 0) {
                    class92.method656(15, "", var14, -1);
                }
            } else if (var5.endsWith(":clanreq:")) {
                String var25 = var5.substring(0, var5.indexOf(":"));
                long var26 = class242.method1638(var25, -14393);
                boolean var28 = false;
                for (int var29 = 0; var29 < class247.field3687; var29++) {
                    if (class212.field3220[var29] == var26) {
                        var28 = true;
                        break;
                    }
                }
                if (!var28 && class121.field1895 == 0) {
                    class92.method656(16, "", var25, -1);
                }
            } else if (var5.endsWith(":allyreq:")) {
                String var19 = var5.substring(0, var5.indexOf(":"));
                long var20 = class242.method1638(var19, -14393);
                boolean var22 = false;
                for (int var23 = 0; var23 < class247.field3687; var23++) {
                    if (class212.field3220[var23] == var20) {
                        var22 = true;
                        break;
                    }
                }
                if (!var22 && class121.field1895 == 0) {
                    String var24 = var5.substring(var5.indexOf(":") + 1, var5.length() + -9);
                    class92.method656(21, var24, var19, -1);
                }
            } else {
                class92.method656(0, var5, "", arg0 ^ 0xFFFFFFF7);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 136) {
            int var371 = class207.field3137.method1838((byte) -35);
            int var372 = class207.field3137.method1838((byte) -15);
            String var373 = class207.field3137.method1801(-30054);
            if (class268.method1884(arg0 + 107, var372)) {
                class144.method1027(2623, var371, var373);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 154) {
            int var368 = class207.field3137.method1831(arg0 + 73);
            int var369 = class207.field3137.method1826(arg0 - 206227544);
            int var370 = class207.field3137.method1830((byte) -77);
            if (class268.method1884(113, var370)) {
                class207.method1424(5, var368, var369);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 79) {
            int var46 = class207.field3137.method1787(false);
            int var47 = class207.field3137.method1849(74);
            int var48 = class207.field3137.method1849(arg0 ^ 0x61);
            class180.field2697 = var47 >> 1;
            field1750.method1348(var48, var46, (byte) 109, (var47 & 0x1) == 1);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 214) {
            class321.field4856 = class207.field3137.method1838((byte) -89) * 30;
            class56.field712 = class225.field3423;
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 117) {
            class166.field2498 = class207.field3137.method1787(false);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 52) {
            int var49 = class207.field3137.method1830((byte) -77);
            if (class268.method1884(118, var49)) {
                class296.method2068((byte) -61);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 133) {
            class103.field1639 = class207.field3137.method1790(128);
            class26.field368 = class207.field3137.method1787(false);
            for (int var365 = class103.field1639; var365 < (class103.field1639 + 8); var365++) {
                for (int var366 = class26.field368; var366 < (class26.field368 + 8); var366++) {
                    if (class149.field2246[class180.field2697][var365][var366] != null) {
                        class149.field2246[class180.field2697][var365][var366] = null;
                        class245.method1655(var365, var366, (byte) -19);
                    }
                }
            }
            for (class218 var367 = (class218) class164.field2468.method1109(40); var367 != null; var367 = (class218) class164.field2468.method1115((byte) 98)) {
                if (class103.field1639 <= var367.field3331 && var367.field3331 < class103.field1639 + 8 && class26.field368 <= var367.field3330 && class26.field368 + 8 > var367.field3330 && class180.field2697 == var367.field3320) {
                    var367.field3324 = 0;
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 99) {
            int var360 = class207.field3137.method1838((byte) 122);
            int var361 = class207.field3137.method1787(false);
            int var362 = class207.field3137.method1788(18914);
            int var363 = class207.field3137.method1835(false);
            if (class268.method1884(103, var363)) {
                class167 var364 = (class167) class295.field4522.method1320((long) var362, 13002);
                if (var364 != null) {
                    class30.method198(var364, var364.field2505 != var360, (byte) 50);
                }
                class5.method12((byte) -73, var362, var360, var361);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 19) {
            class278.method1942((byte) -87, class207.field3137.method1801(-30054));
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 156) {
            long var50 = class207.field3137.method1797(-1023818720);
            long var52 = (long) class207.field3137.method1830((byte) -77);
            boolean var54 = false;
            long var55 = (long) class207.field3137.method1824(false);
            long var57 = (var52 << 32) + var55;
            int var59 = class207.field3137.method1787(false);
            int var60 = 0;
            label1317: while (true) {
                if (var60 >= 100) {
                    if (var59 <= 1) {
                        if ((!class261.field3955 || class70.field927) && !class154.field2311) {
                            for (int var61 = 0; var61 < class247.field3687; var61++) {
                                if (class212.field3220[var61] == var50) {
                                    var54 = true;
                                    break label1317;
                                }
                            }
                        } else {
                            var54 = true;
                        }
                    }
                    break;
                }
                if (class36.field444[var60] == var57) {
                    var54 = true;
                    break;
                }
                var60++;
            }
            if (!var54 && class121.field1895 == 0) {
                class36.field444[class224.field3407] = var57;
                class224.field3407 = (class224.field3407 + 1) % 100;
                String var62 = class89.method610(class212.method1471(0, class68.method451(class207.field3137, (byte) -125)));
                if (var59 == 2 || var59 == 3) {
                    class92.method656(7, var62, "<img=1>" + class194.method1337(var50, 1), -1);
                } else if (var59 == 1) {
                    class92.method656(7, var62, "<img=0>" + class194.method1337(var50, 1), -1);
                } else {
                    class92.method656(3, var62, class194.method1337(var50, 1), -1);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 236) {
            class207.field3137.field4025 += 28;
            if (class207.field3137.method1834(-93)) {
                class327.method2224(class207.field3137.field4025 - 28, 24, class207.field3137);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 132) {
            int var63 = class207.field3137.method1830((byte) -77);
            if (var63 == 65535) {
                var63 = -1;
            }
            int var64 = class207.field3137.method1826(arg0 ^ 0xF3B537B8);
            int var65 = class207.field3137.method1794(arg0 ^ 0xFFFFFF98);
            if (class268.method1884(111, var65)) {
                class224.method1566(var64, -1, 1, var63, false);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 14) {
            class318.method2184(-20238);
            int var66 = class207.field3137.method1787(false);
            int var67 = class207.field3137.method1819(-1);
            int var68 = class207.field3137.method1807(-64);
            class184.field2748[var68] = var67;
            class167.field2511[var68] = var66;
            class284.field4296[var68] = 1;
            for (int var69 = 0; var69 < 98; var69++) {
                if (class291.field4435[var69] <= var67) {
                    class284.field4296[var68] = var69 + 2;
                }
            }
            class296.field4530[class124.method893(31, class304.field4625++)] = var68;
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 166) {
            int var355 = class207.field3137.method1794(-119);
            int var356 = class207.field3137.method1819(arg0 ^ 0xFFFFFFF7);
            int var357 = class207.field3137.method1794(-125);
            int var358 = class207.field3137.method1794(-115);
            int var359 = class207.field3137.method1835(false);
            if (class268.method1884(126, var357)) {
                class37.method256(var355, var358, var356, -124, var359);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 91) {
            int var70 = class207.field3137.method1826(-206227536);
            int var71 = class207.field3137.method1838((byte) 95);
            int var72 = class207.field3137.method1794(arg0 - 129);
            if (class268.method1884(117, var72)) {
                class237.method1622(var71, arg0 - 76, var70);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 210) {
            long var73 = class207.field3137.method1797(arg0 - 1023818728);
            class207.field3137.method1810((byte) 120);
            long var75 = class207.field3137.method1797(-1023818720);
            long var77 = (long) class207.field3137.method1830((byte) -77);
            long var79 = (long) class207.field3137.method1824(false);
            int var81 = class207.field3137.method1787(false);
            long var82 = (var77 << 32) + var79;
            boolean var84 = false;
            int var85 = 0;
            label1347: while (true) {
                if (var85 >= 100) {
                    if (var81 <= 1) {
                        if ((!class261.field3955 || class70.field927) && !class154.field2311) {
                            for (int var86 = 0; var86 < class247.field3687; var86++) {
                                if (class212.field3220[var86] == var73) {
                                    var84 = true;
                                    break label1347;
                                }
                            }
                        } else {
                            var84 = true;
                        }
                    }
                    break;
                }
                if (class36.field444[var85] == var82) {
                    var84 = true;
                    break;
                }
                var85++;
            }
            if (!var84 && class121.field1895 == 0) {
                class36.field444[class224.field3407] = var82;
                class224.field3407 = (class224.field3407 + 1) % 100;
                String var87 = class89.method610(class212.method1471(0, class68.method451(class207.field3137, (byte) -124)));
                if (var81 == 2 || var81 == 3) {
                    class11.method58(-1, 9, "<img=1>" + class194.method1337(var73, arg0 - 7), var87, class194.method1337(var75, 1));
                } else if (var81 == 1) {
                    class11.method58(arg0 ^ 0xFFFFFFF7, 9, "<img=0>" + class194.method1337(var73, arg0 - 7), var87, class194.method1337(var75, arg0 ^ 0x9));
                } else {
                    class11.method58(-1, 9, class194.method1337(var73, 1), var87, class194.method1337(var75, arg0 ^ 0x9));
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 15) {
            int var352 = class207.field3137.method1826(arg0 ^ 0xF3B537B8);
            class329 var353 = class80.method541((byte) 96, var352);
            for (int var354 = 0; var354 < var353.field4995.length; var354++) {
                var353.field4995[var354] = -1;
                var353.field4995[var354] = 0;
            }
            class247.method1666(var353, arg0 ^ 0xFFFFFF89);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 128) {
            long var88 = class207.field3137.method1797(-1023818720);
            long var90 = (long) class207.field3137.method1830((byte) -77);
            long var92 = (long) class207.field3137.method1824(false);
            int var94 = class207.field3137.method1787(false);
            long var95 = (var90 << 32) + var92;
            int var97 = class207.field3137.method1830((byte) -77);
            boolean var98 = false;
            int var99 = 0;
            label1365: while (true) {
                if (var99 >= 100) {
                    if (var94 <= 1) {
                        for (int var100 = 0; var100 < class247.field3687; var100++) {
                            if (class212.field3220[var100] == var88) {
                                var98 = true;
                                break label1365;
                            }
                        }
                    }
                    break;
                }
                if (class36.field444[var99] == var95) {
                    var98 = true;
                    break;
                }
                var99++;
            }
            if (!var98 && class121.field1895 == 0) {
                class36.field444[class224.field3407] = var95;
                class224.field3407 = (class224.field3407 + 1) % 100;
                String var101 = class202.method1384(var97, (byte) 118).method63(class207.field3137, true);
                if (var94 == 2) {
                    class189.method1289(18, var101, "<img=1>" + class194.method1337(var88, 1), (byte) -95, (String) null, var97);
                } else if (var94 == 1) {
                    class189.method1289(18, var101, "<img=0>" + class194.method1337(var88, arg0 - 7), (byte) -95, (String) null, var97);
                } else {
                    class189.method1289(18, var101, class194.method1337(var88, arg0 ^ 0x9), (byte) -95, (String) null, var97);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 107) {
            int var346 = class207.field3137.method1830((byte) -77);
            int var347 = class207.field3137.method1787(false);
            int var348 = class207.field3137.method1787(false);
            int var349 = class207.field3137.method1830((byte) -77);
            int var350 = class207.field3137.method1787(false);
            int var351 = class207.field3137.method1787(false);
            if (class268.method1884(106, var346)) {
                class306.method2114(var349, var350, var348, var351, -101, true, var347);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 43) {
            int var345 = class207.field3137.method1787(false);
            if (class207.field3137.method1787(false) == 0) {
                class136.field2069[var345] = new class265();
            } else {
                class207.field3137.field4025--;
                class136.field2069[var345] = new class265(class207.field3137);
            }
            class217.field3289 = -1;
            class248.field3700 = class225.field3423;
            return true;
        } else if (class217.field3289 == 35) {
            int var342 = class207.field3137.method1802(-24333);
            int var343 = class207.field3137.method1835(false);
            int var344 = class207.field3137.method1849(81);
            if (class268.method1884(120, var343)) {
                class245.method1654((byte) 99, var342, var344);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 82) {
            int var102 = class207.field3137.method1830((byte) -77);
            int var103 = class207.field3137.method1826(arg0 ^ 0xF3B537B8);
            int var104 = class207.field3137.method1826(-206227536);
            int var105 = class207.field3137.method1838((byte) -56);
            if (var105 == 65535) {
                var105 = -1;
            }
            if (class268.method1884(105, var102)) {
                class329 var106 = class80.method541((byte) 96, var103);
                if (var106.field5022) {
                    class200.method1370(var105, var103, arg0 + 1, var104);
                    class253 var108 = class325.method2219(var105, -9379);
                    class37.method256(var108.field3810, var108.field3809, var103, -123, var108.field3838);
                    class281.method1968(var103, var108.field3827, var108.field3825, 10, var108.field3828);
                } else if (var105 == -1) {
                    class217.field3289 = -1;
                    var106.field4937 = 0;
                    return true;
                } else {
                    class253 var107 = class325.method2219(var105, -9379);
                    var106.field4937 = 4;
                    var106.field5097 = var107.field3809;
                    var106.field4961 = var107.field3838;
                    var106.field5041 = var107.field3810 * 100 / var104;
                    var106.field4939 = var105;
                    class247.method1666(var106, -128);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 158) {
            class56.method368(arg0 - 1900);
            class318.method2184(-20238);
            class217.field3289 = -1;
            class116.field1769 += 32;
            return true;
        } else if (class217.field3289 == 106) {
            for (int var109 = 0; var109 < class185.field2763.length; var109++) {
                if (class265.field4058[var109] != class185.field2763[var109]) {
                    class185.field2763[var109] = class265.field4058[var109];
                    class206.method1420((byte) -70, var109);
                    class240.field3582[class124.method893(class116.field1769++, 31)] = var109;
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 85) {
            int var341 = class207.field3137.method1794(-122);
            if (var341 == 65535) {
                var341 = -1;
            }
            class283.method1976(var341, -441);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 120) {
            int var110 = class207.field3137.method1822((byte) -20);
            int var111 = class207.field3137.method1835(false);
            if (var111 == 65535) {
                var111 = -1;
            }
            class205.method1407(127, var111, var110);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 55 || class217.field3289 == 25 || class217.field3289 == 68 || class217.field3289 == 29 || class217.field3289 == 93 || class217.field3289 == 241 || class217.field3289 == 229 || class217.field3289 == 94 || class217.field3289 == 103 || class217.field3289 == 179 || class217.field3289 == 36 || class217.field3289 == 140 || class217.field3289 == 110) {
            class325.method2218(95);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 44) {
            long var322 = class207.field3137.method1797(-1023818720);
            int var324 = class207.field3137.method1830((byte) -77);
            int var325 = class207.field3137.method1787(false);
            boolean var326 = true;
            if (var322 < 0L) {
                var326 = false;
                var322 &= Long.MAX_VALUE;
            }
            String var327 = "";
            if (var324 > 0) {
                var327 = class207.field3137.method1801(arg0 - 30062);
            }
            String var328 = class194.method1337(var322, 1);
            for (int var329 = 0; var329 < class193.field2892; var329++) {
                if (class7.field50[var329] == var322) {
                    if (class255.field3872[var329] != var324) {
                        class255.field3872[var329] = var324;
                        if (var324 > 0) {
                            class92.method656(5, var328 + class247.field3685, "", arg0 - 9);
                        }
                        if (var324 == 0) {
                            class92.method656(5, var328 + class257.field3892, "", -1);
                        }
                    }
                    class17.field196[var329] = var327;
                    class63.field831[var329] = var325;
                    var328 = null;
                    class120.field1891[var329] = var326;
                    break;
                }
            }
            if (var328 != null && class193.field2892 < 200) {
                class7.field50[class193.field2892] = var322;
                class156.field2347[class193.field2892] = var328;
                class255.field3872[class193.field2892] = var324;
                class17.field196[class193.field2892] = var327;
                class63.field831[class193.field2892] = var325;
                class120.field1891[class193.field2892] = var326;
                class193.field2892++;
            }
            class315.field4761 = class225.field3423;
            boolean var330 = false;
            int var331 = class193.field2892;
            while (var331 > 0) {
                boolean var332 = true;
                var331--;
                for (int var333 = 0; var333 < var331; var333++) {
                    if (class255.field3872[var333] != class258.field3921 && class255.field3872[var333 + 1] == class258.field3921 || class255.field3872[var333] == 0 && class255.field3872[var333 + 1] != 0) {
                        var332 = false;
                        int var334 = class255.field3872[var333];
                        class255.field3872[var333] = class255.field3872[var333 + 1];
                        class255.field3872[var333 + 1] = var334;
                        String var335 = class17.field196[var333];
                        class17.field196[var333] = class17.field196[var333 + 1];
                        class17.field196[var333 + 1] = var335;
                        String var336 = class156.field2347[var333];
                        class156.field2347[var333] = class156.field2347[var333 + 1];
                        class156.field2347[var333 + 1] = var336;
                        long var337 = class7.field50[var333];
                        class7.field50[var333] = class7.field50[var333 + 1];
                        class7.field50[var333 + 1] = var337;
                        int var339 = class63.field831[var333];
                        class63.field831[var333] = class63.field831[var333 + 1];
                        class63.field831[var333 + 1] = var339;
                        boolean var340 = class120.field1891[var333];
                        class120.field1891[var333] = class120.field1891[var333 + 1];
                        class120.field1891[var333 + 1] = var340;
                    }
                }
                if (var332) {
                    break;
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 100) {
            int var319 = class207.field3137.method1794(arg0 ^ 0xFFFFFF8A);
            int var320 = class207.field3137.method1830((byte) -77);
            int var321 = class207.field3137.method1830((byte) -77);
            if (class268.method1884(107, var320)) {
                class284.field4297 = var321;
                class234.field3525 = var319;
                if (class56.field710 == 2) {
                    class84.field1249 = class284.field4297;
                    class160.field2392 = class234.field3525;
                }
                class272.method1924(-4);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 75) {
            int var112 = class207.field3137.method1819(arg0 - 9);
            class135.field2056 = class274.field4200.method1782(arg0 ^ 0xB, var112);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 189) {
            class103.field1639 = class207.field3137.method1787(false);
            class26.field368 = class207.field3137.method1790(arg0 ^ 0x88);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 202) {
            int var317 = class207.field3137.method1794(-120);
            byte var318 = class207.field3137.method1847(-102);
            class203.method1392((byte) -9, var317, var318);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 153) {
            if (class90.field1344 != null) {
                class307.method2119(-1, false, -1, false, class144.field2175);
            }
            byte[] var315 = new byte[class3.field13];
            class207.field3137.method23(0, class3.field13, var315, (byte) -97);
            String var316 = class318.method2173(7816, class3.field13, 0, var315);
            if (class106.field1661 == null && class262.field3960 == 3 || !class262.field3966.startsWith("win") || class11.field128) {
                class97.method687(3, var316, true);
            } else {
                class58.field741 = true;
                class268.field4116 = var316;
                class213.field3229 = class274.field4200.method1767(var316, -6225);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 245) {
            for (int var313 = 0; var313 < class241.field3592.length; var313++) {
                if (class241.field3592[var313] != null) {
                    class241.field3592[var313].field1549 = -1;
                }
            }
            for (int var314 = 0; var314 < class187.field2788.length; var314++) {
                if (class187.field2788[var314] != null) {
                    class187.field2788[var314].field1549 = -1;
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 222) {
            int var309 = class207.field3137.method1835(false);
            int var310 = class207.field3137.method1830((byte) -77);
            int var311 = class207.field3137.method1790(128);
            class69 var312 = class187.field2788[var309];
            if (var312 != null) {
                class159.method1126(var312, var311, 87, var310);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 150) {
            int var306 = class207.field3137.method1838((byte) 109);
            int var307 = class207.field3137.method1819(-1);
            int var308 = class207.field3137.method1794(arg0 ^ 0xFFFFFF8B);
            if (class268.method1884(126, var306)) {
                class38.method266(var308, var307, true);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 37) {
            int var304 = class207.field3137.method1807(105);
            int var305 = class207.field3137.method1830((byte) -77);
            class49.method338(var304, -124, var305);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 129) {
            class67.method448(true, false);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 211) {
            int var113 = class207.field3137.method1790(128);
            int var114 = class207.field3137.method1830((byte) -77);
            int var115 = class207.field3137.method1830((byte) -77);
            if (class268.method1884(111, var115)) {
                if (var113 == 2) {
                    class234.method1610(-123);
                }
                class123.field1926 = var114;
                class251.method1693(var114, arg0 ^ 0x5B98);
                class136.method995(false, arg0 ^ 0x7AE8);
                class64.method428(class123.field1926, (byte) 71);
                for (int var116 = 0; var116 < 100; var116++) {
                    class22.field298[var116] = true;
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 191) {
            int var117 = class207.field3137.method1802(-24333);
            int var118 = class207.field3137.method1830((byte) -77);
            int var119 = class207.field3137.method1788(18914);
            int var120 = class207.field3137.method1838((byte) -63);
            if (var120 == 65535) {
                var120 = -1;
            }
            int var121 = class207.field3137.method1794(-117);
            if (var121 == 65535) {
                var121 = -1;
            }
            if (class268.method1884(114, var118)) {
                for (int var122 = var121; var122 <= var120; var122++) {
                    long var123 = ((long) var117 << 32) + ((long) var122);
                    class21 var125 = (class21) class233.field3497.method1320(var123, 13002);
                    class21 var126;
                    if (var125 != null) {
                        var126 = new class21(var119, var125.field263);
                        var125.method714(arg0 - 128);
                    } else if (var122 == -1) {
                        var126 = new class21(var119, class80.method541((byte) 96, var117).field4957.field263);
                    } else {
                        var126 = new class21(var119, -1);
                    }
                    class233.field3497.method1319(arg0 ^ 0x67, var123, var126);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 24) {
            int var127 = class207.field3137.method1788(18914);
            int var128 = class207.field3137.method1794(-117);
            class203.method1392((byte) -9, var128, var127);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 78) {
            int var129 = class207.field3137.method1830((byte) -77);
            int var130 = class207.field3137.method1788(18914);
            class49.method338(var130, arg0 + 38, var129);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 101) {
            class11.method57(0);
            class217.field3289 = -1;
            return false;
        } else if (class217.field3289 == 172) {
            int var131 = class207.field3137.method1788(arg0 ^ 0x49EA);
            int var132 = class207.field3137.method1830((byte) -77);
            int var133 = class207.field3137.method1830((byte) -77);
            int var134 = class207.field3137.method1835(false);
            if (var131 >> 30 != 0) {
                int var135 = (var131 & 0x3A3B6018) >> 28;
                int var136 = ((var131 & 0xFFFE9EE) >> 14) - class217.field3309;
                int var137 = (var131 & 0x3FFF) - class189.field2807;
                if (var136 >= 0 && var137 >= 0 && var136 < 104 && var137 < 104) {
                    int var138 = var137 * 128 + 64;
                    int var139 = var136 * 128 + 64;
                    class113 var140 = new class113(var133, var135, var139, var138, class74.method473(var138, var139, arg0 + 56, var135) - var132, var134, class304.field4641);
                    class205.field3082.method1108(new class317(var140), 65280);
                }
            } else if ((var131 >> 29) != 0) {
                int var146 = var131 & 0xFFFF;
                class69 var147 = class187.field2788[var146];
                if (var147 != null) {
                    if (var133 == 65535) {
                        var133 = -1;
                    }
                    boolean var148 = true;
                    if (var133 != -1 && var147.field1490 != -1 && class72.method468(class8.method31(var133, (byte) -126).field615, 123).field4158 < class72.method468(class8.method31(var147.field1490, (byte) -126).field615, -119).field4158) {
                        var148 = false;
                    }
                    if (var148) {
                        var147.field1563 = 0;
                        var147.field1529 = 0;
                        var147.field1550 = 1;
                        var147.field1490 = var133;
                        var147.field1561 = var132;
                        var147.field1514 = class304.field4641 + var134;
                        if (class304.field4641 < var147.field1514) {
                            var147.field1563 = -1;
                        }
                        if (var147.field1490 != -1 && class304.field4641 == var147.field1514) {
                            int var149 = class8.method31(var147.field1490, (byte) -126).field615;
                            if (var149 != -1) {
                                class272 var150 = class72.method468(var149, 98);
                                if (var150 != null && var150.field4160 != null) {
                                    class167.method1170(var147.field1505, var150, 0, arg0 - 72, var147.field1566, false);
                                }
                            }
                        }
                    }
                }
            } else if ((var131 >> 28) != 0) {
                int var141 = var131 & 0xFFFF;
                class195 var142;
                if (class234.field3516 == var141) {
                    var142 = field1750;
                } else {
                    var142 = class241.field3592[var141];
                }
                if (var142 != null) {
                    if (var133 == 65535) {
                        var133 = -1;
                    }
                    boolean var143 = true;
                    if (var133 != -1 && var142.field1490 != -1 && class72.method468(class8.method31(var133, (byte) -126).field615, -115).field4158 < class72.method468(class8.method31(var142.field1490, (byte) -126).field615, -119).field4158) {
                        var143 = false;
                    }
                    if (var143) {
                        var142.field1490 = var133;
                        var142.field1561 = var132;
                        var142.field1514 = class304.field4641 + var134;
                        var142.field1550 = 1;
                        if (var142.field1490 == 65535) {
                            var142.field1490 = -1;
                        }
                        var142.field1563 = 0;
                        if (class304.field4641 < var142.field1514) {
                            var142.field1563 = -1;
                        }
                        var142.field1529 = 0;
                        if (var142.field1490 != -1 && class304.field4641 == var142.field1514) {
                            int var144 = class8.method31(var142.field1490, (byte) -126).field615;
                            if (var144 != -1) {
                                class272 var145 = class72.method468(var144, 52);
                                if (var145 != null && var145.field4160 != null) {
                                    class167.method1170(var142.field1505, var145, 0, -64, var142.field1566, field1750 == var142);
                                }
                            }
                        }
                    }
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 5) {
            class247.field3687 = class3.field13 / 8;
            for (int var151 = 0; var151 < class247.field3687; var151++) {
                class212.field3220[var151] = class207.field3137.method1797(-1023818720);
                class205.field3097[var151] = class270.method1905(class212.field3220[var151], -68);
            }
            class315.field4761 = class225.field3423;
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 180) {
            int var294 = class207.field3137.method1830((byte) -77);
            int var295 = class207.field3137.method1794(arg0 ^ 0xFFFFFF87);
            int var296 = class207.field3137.method1826(-206227536);
            if (var295 == 65535) {
                var295 = -1;
            }
            int var297 = class207.field3137.method1835(false);
            int var298 = class207.field3137.method1835(false);
            if (var297 == 65535) {
                var297 = -1;
            }
            if (class268.method1884(arg0 + 102, var298)) {
                for (int var299 = var297; var299 <= var295; var299++) {
                    long var300 = ((long) var296 << 32) + (long) var299;
                    class21 var302 = (class21) class233.field3497.method1320(var300, 13002);
                    class21 var303;
                    if (var302 != null) {
                        var303 = new class21(var302.field242, var294);
                        var302.method714(123);
                    } else if (var299 == -1) {
                        var303 = new class21(class80.method541((byte) 96, var296).field4957.field242, var294);
                    } else {
                        var303 = new class21(0, var294);
                    }
                    class233.field3497.method1319(78, var300, var303);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 159) {
            int var290 = class207.field3137.method1835(false);
            int var291 = class207.field3137.method1835(false);
            int var292 = class207.field3137.method1835(false);
            int var293 = class207.field3137.method1826(-206227536);
            if (class268.method1884(arg0 ^ 0x65, var292)) {
                class144.method1030((var290 << 16) + var291, (byte) -83, var293);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 226) {
            int var152 = class207.field3137.method1830((byte) -77);
            int var153 = class207.field3137.method1787(false);
            int var154 = class207.field3137.method1787(false);
            int var155 = class207.field3137.method1830((byte) -77);
            int var156 = class207.field3137.method1787(false);
            int var157 = class207.field3137.method1787(false);
            if (class268.method1884(112, var152)) {
                class91.method638(var153, var155, var154, var157, false, var156);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 142) {
            int var158 = class207.field3137.method1787(false);
            class323 var159 = new class323();
            var159.field4869 = var158 & 0x3F;
            var159.field4873 = class207.field3137.method1787(false);
            int var160 = var158 >> 6;
            if (var159.field4873 >= 0 && class226.field3433.length > var159.field4873) {
                if (var159.field4869 == 1 || var159.field4869 == 10) {
                    var159.field4871 = class207.field3137.method1830((byte) -77);
                    class207.field3137.field4025 += 3;
                } else if (var159.field4869 >= 2 && var159.field4869 <= 6) {
                    if (var159.field4869 == 2) {
                        var159.field4874 = 64;
                        var159.field4876 = 64;
                    }
                    if (var159.field4869 == 3) {
                        var159.field4874 = 0;
                        var159.field4876 = 64;
                    }
                    if (var159.field4869 == 4) {
                        var159.field4876 = 64;
                        var159.field4874 = 128;
                    }
                    if (var159.field4869 == 5) {
                        var159.field4876 = 0;
                        var159.field4874 = 64;
                    }
                    if (var159.field4869 == 6) {
                        var159.field4874 = 64;
                        var159.field4876 = 128;
                    }
                    var159.field4869 = 2;
                    var159.field4872 = class207.field3137.method1830((byte) -77);
                    var159.field4881 = class207.field3137.method1830((byte) -77);
                    var159.field4878 = class207.field3137.method1787(false);
                }
                var159.field4875 = class207.field3137.method1830((byte) -77);
                if (var159.field4875 == 65535) {
                    var159.field4875 = -1;
                }
                class294.field4497[var160] = var159;
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 233) {
            int var287 = class207.field3137.method1830((byte) -77);
            int var288 = class207.field3137.method1826(-206227536);
            if (class268.method1884(arg0 ^ 0x6D, var287)) {
                class167 var289 = (class167) class295.field4522.method1320((long) var288, arg0 + 12994);
                if (var289 != null) {
                    class30.method198(var289, true, (byte) 48);
                }
                if (class194.field2910 != null) {
                    class247.method1666(class194.field2910, arg0 - 135);
                    class194.field2910 = null;
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 74) {
            class147.method1048(false);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 161) {
            int var161 = class207.field3137.method1794(-122);
            int var162 = class207.field3137.method1788(arg0 + 18906);
            int var163 = class207.field3137.method1830((byte) -77);
            if (class268.method1884(107, var163)) {
                class268.method1887((byte) 98, var162, var161);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 168) {
            class318.method2184(arg0 - 20246);
            class136.field2067 = class207.field3137.method1787(false);
            class217.field3289 = -1;
            class56.field712 = class225.field3423;
            return true;
        } else if (class217.field3289 == 72) {
            int var282 = class207.field3137.method1830((byte) -77);
            String var283 = class207.field3137.method1801(arg0 ^ 0xFFFF8A92);
            Object[] var284 = new Object[var283.length() + 1];
            for (int var285 = var283.length() - 1; var285 >= 0; var285--) {
                if (var283.charAt(var285) == 's') {
                    var284[var285 + 1] = class207.field3137.method1801(-30054);
                } else {
                    var284[var285 + 1] = Integer.valueOf(class207.field3137.method1826(-206227536));
                }
            }
            var284[0] = Integer.valueOf(class207.field3137.method1826(class206.method1421(arg0, -206227528)));
            if (class268.method1884(119, var282)) {
                class286 var286 = new class286();
                var286.field4310 = var284;
                class9.method39(var286, 6514);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 102) {
            if (class3.field13 == 0) {
                class311.field4733 = class326.field4914;
            } else {
                class311.field4733 = class207.field3137.method1801(-30054);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 240) {
            long var268 = class207.field3137.method1797(-1023818720);
            int var270 = class207.field3137.method1830((byte) -77);
            boolean var271 = false;
            if ((var268 & Long.MIN_VALUE) != 0L) {
                var271 = true;
            }
            byte var272 = class207.field3137.method1810((byte) 103);
            if (var271) {
                if (class281.field4264 == 0) {
                    class217.field3289 = -1;
                    return true;
                }
                boolean var278 = false;
                long var279 = var268 & Long.MAX_VALUE;
                int var281;
                for (var281 = 0; class281.field4264 > var281 && (class125.field1964[var281].field1603 != var279 || class125.field1964[var281].field794 != var270); var281++) {
                }
                if (class281.field4264 > var281) {
                    while (var281 < class281.field4264 - 1) {
                        class125.field1964[var281] = class125.field1964[var281 + 1];
                        var281++;
                    }
                    class281.field4264--;
                    class125.field1964[class281.field4264] = null;
                }
            } else {
                String var273 = class207.field3137.method1801(-30054);
                class60 var274 = new class60();
                var274.field1603 = var268;
                var274.field792 = class177.method1224(0, var274.field1603);
                var274.field793 = var273;
                var274.field794 = var270;
                var274.field791 = var272;
                int var275;
                for (var275 = class281.field4264 - 1; var275 >= 0; var275--) {
                    int var276 = class125.field1964[var275].field792.compareTo(var274.field792);
                    if (var276 == 0) {
                        class125.field1964[var275].field794 = var270;
                        class125.field1964[var275].field791 = var272;
                        class125.field1964[var275].field793 = var273;
                        class48.field607 = class225.field3423;
                        class217.field3289 = -1;
                        if (class321.field4850 == var268) {
                            class206.field3118 = var272;
                        }
                        return true;
                    }
                    if (var276 < 0) {
                        break;
                    }
                }
                if (class125.field1964.length <= class281.field4264) {
                    class217.field3289 = -1;
                    return true;
                }
                for (int var277 = class281.field4264 - 1; var277 > var275; var277--) {
                    class125.field1964[var277 + 1] = class125.field1964[var277];
                }
                if (class281.field4264 == 0) {
                    class125.field1964 = new class60[100];
                }
                class125.field1964[var275 + 1] = var274;
                class281.field4264++;
                if (class321.field4850 == var268) {
                    class206.field3118 = var272;
                }
            }
            class48.field607 = class225.field3423;
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 139) {
            class311.field4731 = class207.field3137.method1787(false);
            class315.field4761 = class225.field3423;
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 237) {
            class48.field607 = class225.field3423;
            long var256 = class207.field3137.method1797(arg0 ^ 0xC2F9C428);
            if (var256 == 0L) {
                class125.field1964 = null;
                class286.field4325 = null;
                class217.field3289 = -1;
                class26.field367 = null;
                class281.field4264 = 0;
                return true;
            }
            long var258 = class207.field3137.method1797(-1023818720);
            class286.field4325 = class177.method1224(0, var258);
            class26.field367 = class177.method1224(0, var256);
            class295.field4521 = class207.field3137.method1810((byte) 127);
            int var260 = class207.field3137.method1787(false);
            if (var260 == 255) {
                class217.field3289 = -1;
                return true;
            }
            class281.field4264 = var260;
            class60[] var261 = new class60[100];
            for (int var262 = 0; var262 < class281.field4264; var262++) {
                var261[var262] = new class60();
                var261[var262].field1603 = class207.field3137.method1797(arg0 ^ 0xC2F9C428);
                var261[var262].field792 = class177.method1224(0, var261[var262].field1603);
                var261[var262].field794 = class207.field3137.method1830((byte) -77);
                var261[var262].field791 = class207.field3137.method1810((byte) 122);
                var261[var262].field793 = class207.field3137.method1801(-30054);
                if (class321.field4850 == var261[var262].field1603) {
                    class206.field3118 = var261[var262].field791;
                }
            }
            boolean var263 = false;
            int var264 = class281.field4264;
            while (var264 > 0) {
                var264--;
                boolean var265 = true;
                for (int var266 = 0; var266 < var264; var266++) {
                    if (var261[var266].field792.compareTo(var261[var266 + 1].field792) > 0) {
                        class60 var267 = var261[var266];
                        var265 = false;
                        var261[var266] = var261[var266 + 1];
                        var261[var266 + 1] = var267;
                    }
                }
                if (var265) {
                    break;
                }
            }
            class217.field3289 = -1;
            class125.field1964 = var261;
            return true;
        } else if (class217.field3289 == 27) {
            class318.method2184(-20238);
            class183.field2739 = class207.field3137.method1845((byte) -122);
            class217.field3289 = -1;
            class56.field712 = class225.field3423;
            return true;
        } else if (class217.field3289 == 183) {
            int var249 = class207.field3137.method1794(-122);
            int var250 = class207.field3137.method1802(-24333);
            int var251 = class207.field3137.method1802(-24333);
            if (class268.method1884(arg0 ^ 0x6B, var249)) {
                class167 var252 = (class167) class295.field4522.method1320((long) var251, 13002);
                class167 var253 = (class167) class295.field4522.method1320((long) var250, 13002);
                if (var253 != null) {
                    class30.method198(var253, var252 == null || var252.field2505 != var253.field2505, (byte) 95);
                }
                if (var252 != null) {
                    var252.method714(121);
                    class295.field4522.method1319(118, (long) var250, var252);
                }
                class329 var254 = class80.method541((byte) 96, var251);
                if (var254 != null) {
                    class247.method1666(var254, -128);
                }
                class329 var255 = class80.method541((byte) 96, var250);
                if (var255 != null) {
                    class247.method1666(var255, -127);
                    class67.method444(var255, true, -1245723888);
                }
                if (class123.field1926 != -1) {
                    class136.method991(class123.field1926, 1, 27011);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 203) {
            int var164 = class207.field3137.method1830((byte) -77);
            int var165 = class207.field3137.method1787(false);
            int var166 = class207.field3137.method1787(false);
            int var167 = class207.field3137.method1787(false);
            int var168 = class207.field3137.method1787(false);
            int var169 = class207.field3137.method1830((byte) -77);
            if (class268.method1884(110, var164)) {
                class326.field4913[var165] = true;
                class162.field2433[var165] = var166;
                class107.field1668[var165] = var167;
                class266.field4077[var165] = var168;
                class140.field2120[var165] = var169;
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 97) {
            int var170 = class207.field3137.method1830((byte) -77);
            int var171 = class207.field3137.method1838((byte) 97);
            int var172 = class207.field3137.method1835(false);
            int var173 = class207.field3137.method1835(false);
            int var174 = class207.field3137.method1788(18914);
            if (class268.method1884(123, var171)) {
                class224.method1566(var174, var173, 7, var170 | var172 << 16, false);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 169) {
            class26.field368 = class207.field3137.method1807(58);
            class103.field1639 = class207.field3137.method1790(128);
            while (class207.field3137.field4025 < class3.field13) {
                class217.field3289 = class207.field3137.method1787(false);
                class325.method2218(74);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 50) {
            class67.method448(true, true);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 4) {
            class19.field227 = class207.field3137.method1787(false);
            class116.field1779 = class207.field3137.method1787(false);
            class141.field2126 = class207.field3137.method1787(false);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 216) {
            int var241 = class207.field3137.method1826(-206227536);
            int var242 = class207.field3137.method1830((byte) -77);
            class329 var243;
            if (var241 >= 0) {
                var243 = class80.method541((byte) 96, var241);
            } else {
                var243 = null;
            }
            if (var241 < -70000) {
                var242 += 32768;
            }
            if (var243 != null) {
                for (int var244 = 0; var244 < var243.field4995.length; var244++) {
                    var243.field4995[var244] = 0;
                    var243.field4999[var244] = 0;
                }
            }
            class190.method1299((byte) 123, var242);
            int var245 = class207.field3137.method1830((byte) -77);
            for (int var246 = 0; var246 < var245; var246++) {
                int var247 = class207.field3137.method1787(false);
                if (var247 == 255) {
                    var247 = class207.field3137.method1826(-206227536);
                }
                int var248 = class207.field3137.method1838((byte) 100);
                if (var243 != null && var243.field4995.length > var246) {
                    var243.field4995[var246] = var248;
                    var243.field4999[var246] = var247;
                }
                class274.method1936(var246, var242, -115, var247, var248 - 1);
            }
            if (var243 != null) {
                class247.method1666(var243, arg0 ^ 0xFFFFFF8A);
            }
            class318.method2184(-20238);
            class10.field100[class124.method893(31, class90.field1342++)] = class124.method893(var242, 32767);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 224) {
            long var237 = class207.field3137.method1797(-1023818720);
            int var239 = class207.field3137.method1830((byte) -77);
            String var240 = class202.method1384(var239, (byte) 118).method63(class207.field3137, true);
            class189.method1289(19, var240, class194.method1337(var237, 1), (byte) -95, (String) null, var239);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 96) {
            String var234 = class207.field3137.method1801(-30054);
            int var235 = class207.field3137.method1835(false);
            int var236 = class207.field3137.method1802(-24333);
            if (class268.method1884(113, var235)) {
                class76.method485(var234, var236, 3);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 64) {
            int var228 = class207.field3137.method1826(-206227536);
            int var229 = class207.field3137.method1830((byte) -77);
            class329 var230;
            if (var228 < 0) {
                var230 = null;
            } else {
                var230 = class80.method541((byte) 96, var228);
            }
            if (var228 < -70000) {
                var229 += 32768;
            }
            while (class3.field13 > class207.field3137.field4025) {
                int var231 = class207.field3137.method1832(arg0 - 32776);
                int var232 = class207.field3137.method1830((byte) -77);
                int var233 = 0;
                if (var232 != 0) {
                    var233 = class207.field3137.method1787(false);
                    if (var233 == 255) {
                        var233 = class207.field3137.method1826(-206227536);
                    }
                }
                if (var230 != null && var231 >= 0 && var231 < var230.field4995.length) {
                    var230.field4995[var231] = var232;
                    var230.field4999[var231] = var233;
                }
                class274.method1936(var231, var229, -125, var233, var232 - 1);
            }
            if (var230 != null) {
                class247.method1666(var230, -128);
            }
            class318.method2184(-20238);
            class10.field100[class124.method893(class90.field1342++, 31)] = class124.method893(var229, 32767);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 87) {
            class253.field3844 = 0;
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 60) {
            int var175 = class207.field3137.method1788(arg0 ^ 0x49EA);
            int var176 = class207.field3137.method1794(-124);
            if (class268.method1884(arg0 ^ 0x6F, var176)) {
                int var177 = 0;
                if (field1750.field2912 != null) {
                    var177 = field1750.field2912.method1731((byte) -116);
                }
                class224.method1566(var175, -1, 3, var177, false);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 41) {
            int var178 = class207.field3137.method1819(-1);
            int var179 = class207.field3137.method1794(-128);
            int var180 = class207.field3137.method1831(101);
            int var181 = class207.field3137.method1845((byte) -127);
            if (class268.method1884(arg0 ^ 0x62, var179)) {
                class163.method1154(11, var178, var181, var180);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 57) {
            int var182 = class207.field3137.method1830((byte) -77);
            if (var182 == 65535) {
                var182 = -1;
            }
            int var183 = class207.field3137.method1790(arg0 + 120);
            int var184 = class207.field3137.method1849(-98);
            String var185 = class207.field3137.method1801(-30054);
            if (var184 >= 1 && var184 <= 8) {
                if (var185.equalsIgnoreCase("null")) {
                    var185 = null;
                }
                class292.field4466[var184 - 1] = var185;
                class198.field2969[var184 - 1] = var182;
                class84.field1229[var184 - 1] = var183 == 0;
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 80) {
            int var186 = class207.field3137.method1794(-127);
            if (var186 == 65535) {
                var186 = -1;
            }
            int var187 = class207.field3137.method1802(arg0 - 24341);
            int var188 = (var187 & 0x39C89250) >> 28;
            int var189 = (var187 & 0xFFFFEF5) >> 14;
            int var190 = var187 & 0x3FFF;
            int var191 = class207.field3137.method1790(128);
            int var192 = var189 - class217.field3309;
            int var193 = var190 - class189.field2807;
            int var194 = var191 >> 2;
            int var195 = class44.field561[var194];
            int var196 = var191 & 0x3;
            class116.method799((byte) -127, var193, var195, var186, var196, var194, var188, var192);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 247) {
            long var197 = class207.field3137.method1797(-1023818720);
            String var199 = class89.method610(class212.method1471(0, class68.method451(class207.field3137, (byte) -94)));
            class92.method656(6, var199, class194.method1337(var197, 1), -1);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 73) {
            if (class123.field1926 != -1) {
                class136.method991(class123.field1926, 0, 27011);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 228) {
            int var226 = class207.field3137.method1787(false);
            int var227 = class207.field3137.method1838((byte) 115);
            if (class268.method1884(104, var227)) {
                class206.field3103 = var226;
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 225) {
            byte var200 = class207.field3137.method1848((byte) 26);
            int var201 = class207.field3137.method1835(false);
            int var202 = class207.field3137.method1794(-121);
            if (class268.method1884(arg0 ^ 0x6A, var201)) {
                class268.method1887((byte) 97, var200, var202);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 195) {
            String var203 = class207.field3137.method1801(-30054);
            int var204 = class207.field3137.method1830((byte) -77);
            int var205 = class207.field3137.method1838((byte) -84);
            if (class268.method1884(115, var205)) {
                class144.method1027(2623, var204, var203);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 98) {
            int var225 = class207.field3137.method1830((byte) -77);
            class185.method1276(var225, (byte) -91);
            class10.field100[class124.method893(class90.field1342++, 31)] = class124.method893(var225, 32767);
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 218) {
            int var222 = class207.field3137.method1830((byte) -77);
            int var223 = class207.field3137.method1794(arg0 ^ 0xFFFFFF8F);
            int var224 = class207.field3137.method1802(-24333);
            if (var223 == 65535) {
                var223 = -1;
            }
            if (class268.method1884(127, var222)) {
                class224.method1566(var224, -1, 2, var223, false);
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 147) {
            long var206 = class207.field3137.method1797(arg0 - 1023818728);
            class207.field3137.method1810((byte) 107);
            long var208 = class207.field3137.method1797(-1023818720);
            long var210 = (long) class207.field3137.method1830((byte) -77);
            long var212 = (long) class207.field3137.method1824(false);
            int var214 = class207.field3137.method1787(false);
            int var215 = class207.field3137.method1830((byte) -77);
            boolean var216 = false;
            long var217 = (var210 << 32) + var212;
            int var219 = 0;
            label1436: while (true) {
                if (var219 >= 100) {
                    if (var214 <= 1) {
                        for (int var220 = 0; var220 < class247.field3687; var220++) {
                            if (class212.field3220[var220] == var206) {
                                var216 = true;
                                break label1436;
                            }
                        }
                    }
                    break;
                }
                if (class36.field444[var219] == var217) {
                    var216 = true;
                    break;
                }
                var219++;
            }
            if (!var216 && class121.field1895 == 0) {
                class36.field444[class224.field3407] = var217;
                class224.field3407 = (class224.field3407 + 1) % 100;
                String var221 = class202.method1384(var215, (byte) 118).method63(class207.field3137, true);
                if (var214 == 2 || var214 == 3) {
                    class189.method1289(20, var221, "<img=1>" + class194.method1337(var206, arg0 - 7), (byte) -95, class194.method1337(var208, 1), var215);
                } else if (var214 == 1) {
                    class189.method1289(20, var221, "<img=0>" + class194.method1337(var206, 1), (byte) -95, class194.method1337(var208, arg0 - 7), var215);
                } else {
                    class189.method1289(20, var221, class194.method1337(var206, 1), (byte) -95, class194.method1337(var208, 1), var215);
                }
            }
            class217.field3289 = -1;
            return true;
        } else if (class217.field3289 == 145) {
            class45.method294(class274.field4200, class3.field13, (byte) 113, class207.field3137);
            class217.field3289 = -1;
            return true;
        } else {
            class19.method122((Throwable) null, "T1 - " + class217.field3289 + "," + class92.field1379 + "," + class318.field4790 + " - " + class3.field13, (byte) -101);
            class11.method57(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ)Z", line = 2784)
    public static final boolean method786(int arg0, int arg1, boolean arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        class22 var3 = class284.method1980(arg1, (byte) 94);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field1755++;
        return arg2 ? true : var3.method140(arg0, false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 2809)
    public static void method787(byte arg0) {
        int var1 = -73 % ((arg0 + 77) / 43);
        field1750 = null;
        field1751 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Led;)V", line = 2821)
    public static final void method788(class311 arg0) {
        for (int var1 = arg0.field4724; var1 <= arg0.field4722; var1++) {
            for (int var2 = arg0.field4735; var2 <= arg0.field4726; var2++) {
                class221 var3 = class158.field2367[arg0.field4730][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3374; var4++) {
                        if (var3.field3354[var4] == arg0) {
                            var3.field3374--;
                            for (int var5 = var4; var5 < var3.field3374; var5++) {
                                var3.field3354[var5] = var3.field3354[var5 + 1];
                                var3.field3361[var5] = var3.field3361[var5 + 1];
                            }
                            var3.field3354[var3.field3374] = null;
                            break;
                        }
                    }
                    var3.field3363 = 0;
                    for (int var6 = 0; var6 < var3.field3374; var6++) {
                        var3.field3363 |= var3.field3361[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)I", line = 2888)
    public static final int method789(byte arg0, int arg1) {
        field1752++;
        if (arg1 > 0) {
            return 1;
        } else if (arg0 >= -11) {
            return 85;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
