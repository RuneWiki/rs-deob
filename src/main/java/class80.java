import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class80 {

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lld;")
    public class70 field1810 = new class70();

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lfe;")
    public static class36 field1822 = new class36(64);

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Llc;")
    public static class69 field1825 = class69.method470((byte) -127, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field1828 = 0;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Llc;")
    public static class69 field1827 = class69.method470((byte) -128, "mod_icons");

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lld;")
    private class70 field1815;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Loa;")
    public static class85 field1824;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "[I")
    public static int[] field1829;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
    public static final boolean method569(byte arg0) {
        field1808++;
        if (class106.field2298 == null) {
            return false;
        }
        try {
            int var1 = class106.field2298.method565(false);
            if (var1 == 0) {
                return false;
            }
            if (class90.field1960 == -1) {
                var1--;
                class106.field2298.method567(1, 0, (byte) -108, class3.field22.field2077);
                class3.field22.field2061 = 0;
                class90.field1960 = class3.field22.method180((byte) -103);
                class103.field2224 = class17.field322[class90.field1960];
            }
            if (class103.field2224 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class106.field2298.method567(1, 0, (byte) -108, class3.field22.field2077);
                class103.field2224 = class3.field22.field2077[0] & 0xFF;
            }
            if (class103.field2224 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class106.field2298.method567(2, 0, (byte) -108, class3.field22.field2077);
                class3.field22.field2061 = 0;
                var1 -= 2;
                class103.field2224 = class3.field22.method665(8666);
            }
            if (class103.field2224 > var1) {
                return false;
            }
            class3.field22.field2061 = 0;
            class106.field2298.method567(class103.field2224, 0, (byte) -108, class3.field22.field2077);
            class2.field19 = class119.field2547;
            class119.field2547 = class82.field1853;
            class82.field1853 = class90.field1960;
            class18.field376 = 0;
            if (class90.field1960 == 216) {
                class40.field792 = class3.field22.method709(-40);
                class90.field1960 = -1;
                class71.field1596 = true;
                class110.field2418 = true;
                return true;
            }
            if (class90.field1960 == 71) {
                long var2 = class3.field22.method712(1092193376);
                class69 var4 = class33.method210(125, class3.field22).method485((byte) -127);
                class87.method619(var4, true, 6, class49.method322(arg0 + 96, var2).method460(false));
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 116) {
                class110.field2418 = true;
                int var5 = class3.field22.method709(-30);
                int var6 = class3.field22.method679(-167);
                int var7 = class3.field22.method694(arg0 ^ 0xFFFFFF8D);
                class108.field2396[var7] = var6;
                class101.field2190[var7] = var5;
                class61.field1255[var7] = 1;
                for (int var8 = 0; var8 < 98; var8++) {
                    if (var6 >= class51.field1102[var8]) {
                        class61.field1255[var7] = var8 + 2;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 239) {
                int var9 = class3.field22.method688(26442);
                if (var9 >= 0) {
                    class73.method516((byte) 110, var9);
                }
                if (class56.field1183 != var9) {
                    class49.method323((byte) 6, class56.field1183);
                    class56.field1183 = var9;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 181) {
                class35.field708 = class3.field22.method703((byte) 103);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 197) {
                class82.method592(true);
                class90.field1960 = -1;
                return false;
            }
            if (class90.field1960 == 170) {
                class108.method807((byte) -99);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 108) {
                for (int var10 = 0; var10 < class123.field2682.length; var10++) {
                    if (class123.field2682[var10] != null) {
                        class123.field2682[var10].field1070 = -1;
                    }
                }
                for (int var11 = 0; var11 < class112.field2434.length; var11++) {
                    if (class112.field2434[var11] != null) {
                        class112.field2434[var11].field1070 = -1;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 144) {
                class56.field1188 = class3.field22.method694(-49);
                class6.field103 = class3.field22.method709(-32);
                for (int var12 = class6.field103; var12 < class6.field103 + 8; var12++) {
                    for (int var13 = class56.field1188; var13 < class56.field1188 + 8; var13++) {
                        if (class92.field2014[class71.field1588][var12][var13] != null) {
                            class92.field2014[class71.field1588][var12][var13] = null;
                            method570(var13, 16537, var12);
                        }
                    }
                }
                for (class13 var14 = (class13) class75.field1689.method580((byte) -55); var14 != null; var14 = (class13) class75.field1689.method576((byte) 73)) {
                    if (var14.field242 >= class6.field103 && class6.field103 + 8 > var14.field242 && class56.field1188 <= var14.field250 && class56.field1188 + 8 > var14.field250 && class71.field1588 == var14.field243) {
                        var14.field247 = 0;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 25) {
                if (class67.field1396 != -1) {
                    class49.method323((byte) 6, class67.field1396);
                    class110.field2418 = true;
                    class67.field1396 = -1;
                    class71.field1596 = true;
                }
                if (class60.field1244 != -1) {
                    class49.method323((byte) 6, class60.field1244);
                    class60.field1244 = -1;
                    class35.field709 = true;
                }
                if (class22.field469 != -1) {
                    class49.method323((byte) 6, class22.field469);
                    class22.field469 = -1;
                    class89.method626(30, (byte) 112);
                }
                if (class51.field1124 != -1) {
                    class49.method323((byte) 6, class51.field1124);
                    class51.field1124 = -1;
                }
                if (class53.field1144 != -1) {
                    class49.method323((byte) 6, class53.field1144);
                    class53.field1144 = -1;
                }
                if (class62.field1277 != 0) {
                    class35.field709 = true;
                    class62.field1277 = 0;
                }
                class90.field1960 = -1;
                class73.field1639 = false;
                return true;
            }
            if (class90.field1960 == 94) {
                int var15 = class3.field22.method685((byte) 106);
                if (class46.field968 != var15) {
                    class49.method323((byte) 6, class46.field968);
                    class46.field968 = var15;
                }
                class90.field1960 = -1;
                class35.field709 = true;
                return true;
            }
            if (class90.field1960 == 15) {
                int var16 = class3.field22.method679(-167);
                int var17 = class3.field22.method685((byte) 54);
                int var18 = class3.field22.method691(arg0 + 74);
                class9 var19 = class9.method56(true, var16);
                class90.field1960 = -1;
                var19.field161 = var19.field131 + var17;
                var19.field166 = var19.field157 + var18;
                return true;
            }
            if (class90.field1960 == 11) {
                int var20 = class3.field22.method665(arg0 + 8644);
                int var21 = class3.field22.method703((byte) 99);
                int var22 = class3.field22.method665(8666);
                if (class102.field2204 != 0 && var21 != 0 && class121.field2594 < 50) {
                    class49.field1020[class121.field2594] = var20;
                    class72.field1617[class121.field2594] = var21;
                    class92.field2010[class121.field2594] = var22;
                    class43.field851[class121.field2594] = null;
                    class121.field2594++;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 120) {
                if (class40.field792 == 12) {
                    class110.field2418 = true;
                }
                class89.field1941 = class3.field22.method695(27);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 224) {
                int var23 = class3.field22.method705(arg0 ^ 0xFFFFFFBE);
                class73.method516((byte) 107, var23);
                if (class67.field1396 != -1) {
                    class49.method323((byte) 6, class67.field1396);
                    class71.field1596 = true;
                    class110.field2418 = true;
                    class67.field1396 = -1;
                }
                if (class22.field469 != -1) {
                    class49.method323((byte) 6, class22.field469);
                    class22.field469 = -1;
                    class89.method626(30, (byte) 112);
                }
                if (class51.field1124 != -1) {
                    class49.method323((byte) 6, class51.field1124);
                    class51.field1124 = -1;
                }
                if (class53.field1144 != -1) {
                    class49.method323((byte) 6, class53.field1144);
                    class53.field1144 = -1;
                }
                if (class60.field1244 != var23) {
                    class49.method323((byte) 6, class60.field1244);
                    class60.field1244 = var23;
                }
                class73.field1639 = false;
                class35.field709 = true;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 195) {
                int var24 = class3.field22.method705(-81);
                class73.method516((byte) 120, var24);
                if (class67.field1396 != -1) {
                    class49.method323((byte) 6, class67.field1396);
                    class110.field2418 = true;
                    class67.field1396 = -1;
                    class71.field1596 = true;
                }
                if (class60.field1244 != -1) {
                    class49.method323((byte) 6, class60.field1244);
                    class60.field1244 = -1;
                    class35.field709 = true;
                }
                if (class22.field469 != -1) {
                    class49.method323((byte) 6, class22.field469);
                    class22.field469 = -1;
                    class89.method626(30, (byte) 112);
                }
                if (class51.field1124 != -1) {
                    class49.method323((byte) 6, class51.field1124);
                    class51.field1124 = -1;
                }
                if (class53.field1144 != var24) {
                    class49.method323((byte) 6, class53.field1144);
                    class53.field1144 = var24;
                }
                class90.field1960 = -1;
                class73.field1639 = false;
                if (class62.field1277 != 0) {
                    class62.field1277 = 0;
                    class35.field709 = true;
                }
                return true;
            }
            if (class90.field1960 == 84) {
                int var25 = class3.field22.method679(-167);
                class9 var26 = class9.method56(true, var25);
                var26.field146 = 3;
                var26.field172 = class46.field974.field1224.method16(-7123);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 153) {
                class121.field2615 = class3.field22.method671(-93);
                class3.field22.method665(arg0 ^ 0x21CC);
                class39.field771 = class3.field22.method670(-122);
                class115.field2500 = class3.field22.method670(-119);
                class63.field1293 = class3.field22.method705(-125);
                class29.field608 = class3.field22.method671(-102);
                class122.field2653 = class3.field22.method703((byte) 84);
                class10.field218 = class3.field22.method705(-81);
                class3.field22.method671(arg0 ^ 0xFFFFFFA0);
                class50.field1084 = class3.field22.method670(-119);
                class24.field507 = class3.field22.method701(3);
                class90.field1949 = class64.field1358.method754((byte) -17, class24.field507);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 85) {
                int var27 = class3.field22.method666(3053);
                class69 var28 = class3.field22.method708(arg0 - 23544);
                int var29 = class3.field22.method694(123);
                if (var29 >= 1 && var29 <= 5) {
                    if (var28.method474(false, class128.field2747)) {
                        var28 = null;
                    }
                    class112.field2435[var29 - 1] = var28;
                    class42.field839[var29 - 1] = var27 == 0;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 202) {
                int var30 = class3.field22.method698(-1986049440);
                int var31 = class3.field22.method671(-124);
                int var32 = var31 >> 10 & 0x1F;
                class9 var33 = class9.method56(true, var30);
                int var34 = var31 & 0x1F;
                int var35 = var31 >> 5 & 0x1F;
                var33.field181 = (var32 << 19) + (var34 << 3) + (var35 << 11);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 38) {
                class25.field539 = class3.field22.method671(-97) * 30;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 28) {
                class73.field1627 = class3.field22.method666(arg0 ^ 0xBFB);
                if (class73.field1627 == class40.field792) {
                    class110.field2418 = true;
                    if (class73.field1627 == 3) {
                        class40.field792 = 1;
                    } else {
                        class40.field792 = 3;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 243) {
                for (int var36 = 0; var36 < class50.field1081; var36++) {
                    class71 var37 = class49.method318((byte) 20, var36);
                    if (var37 != null && var37.field1586 == 0) {
                        class128.field2759[var36] = 0;
                        class10.field204[var36] = 0;
                    }
                }
                class90.field1960 = -1;
                class110.field2418 = true;
                if (class46.field968 != -1) {
                    class35.field709 = true;
                }
                return true;
            }
            if (class90.field1960 == 36) {
                int var38 = class3.field22.method670(-118);
                int var39 = class3.field22.method701(3);
                class9 var40 = class9.method56(true, var39);
                if (var40 != null && var40.field171 == 0) {
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var40.field178 - var40.field140 < var38) {
                        var38 = var40.field178 - var40.field140;
                    }
                    var40.field153 = var38;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 128) {
                class110.field2418 = true;
                int var41 = class3.field22.method667(5811);
                class9 var42 = class9.method56(true, var41);
                int var43 = class3.field22.method665(8666);
                for (int var44 = 0; var44 < var43; var44++) {
                    int var45 = class3.field22.method666(3053);
                    if (var45 == 255) {
                        var45 = class3.field22.method667(5811);
                    }
                    var42.field129[var44] = class3.field22.method671(-98);
                    var42.field165[var44] = var45;
                }
                for (int var46 = var43; var46 < var42.field129.length; var46++) {
                    var42.field129[var46] = 0;
                    var42.field165[var46] = 0;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 24) {
                int var47 = class3.field22.method671(-103);
                int var48 = class3.field22.method670(-126);
                int var49 = class3.field22.method701(3);
                class9 var50 = class9.method56(true, var49);
                class90.field1960 = -1;
                var50.field121 = (var47 << 16) + var48;
                return true;
            }
            if (class90.field1960 == 74) {
                if (class40.field792 == 12) {
                    class110.field2418 = true;
                }
                class125.field2696 = class3.field22.method703((byte) 103);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 121) {
                class90.field1960 = -1;
                class101.field2196 = 0;
                return true;
            }
            if (class90.field1960 == 122) {
                class69.method471(false, (byte) 113);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 45) {
                class110.field2418 = true;
                int var51 = class3.field22.method667(arg0 ^ 0x16A5);
                class9 var52 = class9.method56(true, var51);
                while (class3.field22.field2061 < class103.field2224) {
                    int var53 = class3.field22.method684(false);
                    int var54 = class3.field22.method665(arg0 ^ 0x21CC);
                    int var55 = class3.field22.method703((byte) 80);
                    if (var55 == 255) {
                        var55 = class3.field22.method667(arg0 + 5789);
                    }
                    if (var53 >= 0 && var53 < var52.field129.length) {
                        var52.field129[var53] = var54;
                        var52.field165[var53] = var55;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 162) {
                class114.field2475 = true;
                class127.field2732 = class3.field22.method703((byte) -56);
                class107.field2319 = class3.field22.method703((byte) 108);
                class66.field1383 = class3.field22.method665(8666);
                class82.field1863 = class3.field22.method703((byte) -60);
                class3.field55 = class3.field22.method703((byte) -128);
                if (class3.field55 >= 100) {
                    class108.field2395 = class107.field2319 * 128 + 64;
                    class55.field1164 = class127.field2732 * 128 + 64;
                    class70.field1561 = class53.method341(0, class55.field1164, class108.field2395, class71.field1588) - class66.field1383;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 155) {
                long var56 = class3.field22.method712(1092193376);
                int var58 = class3.field22.method665(8666);
                class69 var59 = class49.method322(94, var56).method460(false);
                for (int var60 = 0; var60 < class43.field852; var60++) {
                    if (class56.field1186[var60] == var56) {
                        if (class51.field1122[var60] != var58) {
                            class51.field1122[var60] = var58;
                            class110.field2418 = true;
                            if (var58 > 0) {
                                class87.method619(class46.method305(20025, new class69[] { var59, class49.field1005 }), true, 5, class49.field992);
                            }
                            if (var58 == 0) {
                                class87.method619(class46.method305(20025, new class69[] { var59, class108.field2382 }), true, 5, class49.field992);
                            }
                        }
                        var59 = null;
                        break;
                    }
                }
                if (var59 != null && class43.field852 < 200) {
                    class56.field1186[class43.field852] = var56;
                    class64.field1356[class43.field852] = var59;
                    class51.field1122[class43.field852] = var58;
                    class43.field852++;
                    class110.field2418 = true;
                }
                boolean var61 = false;
                while (!var61) {
                    var61 = true;
                    for (int var62 = 0; var62 < class43.field852 - 1; var62++) {
                        if (class51.field1122[var62] != class2.field12 && class51.field1122[var62 + 1] == class2.field12 || class51.field1122[var62] == 0 && class51.field1122[var62 + 1] != 0) {
                            var61 = false;
                            int var63 = class51.field1122[var62];
                            class51.field1122[var62] = class51.field1122[var62 + 1];
                            class51.field1122[var62 + 1] = var63;
                            class69 var64 = class64.field1356[var62];
                            class64.field1356[var62] = class64.field1356[var62 + 1];
                            class64.field1356[var62 + 1] = var64;
                            long var65 = class56.field1186[var62];
                            class56.field1186[var62] = class56.field1186[var62 + 1];
                            class56.field1186[var62 + 1] = var65;
                            class110.field2418 = true;
                        }
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 157) {
                class72.method509(class3.field22, true, class64.field1358, class103.field2224);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 142) {
                class6.field103 = class3.field22.method703((byte) -112);
                class56.field1188 = class3.field22.method666(arg0 ^ 0xBFB);
                while (class103.field2224 > class3.field22.field2061) {
                    class90.field1960 = class3.field22.method703((byte) 95);
                    class120.method881(arg0 - 106);
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 110) {
                class16.method87(1);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 133) {
                int var67 = class3.field22.method679(arg0 - 189);
                int var68 = class3.field22.method671(-119);
                class9 var69 = class9.method56(true, var67);
                var69.field172 = var68;
                var69.field146 = 1;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 32) {
                class35.field709 = true;
                class2.field9 = false;
                class90.field1960 = -1;
                class62.field1277 = 1;
                class49.field1009 = class49.field992;
                return true;
            }
            if (class90.field1960 == 58) {
                int var70 = class3.field22.method705(-105);
                int var71 = class3.field22.method670(-116);
                int var72 = class3.field22.method679(-167);
                int var73 = class3.field22.method670(-122);
                class9 var74 = class9.method56(true, var72);
                var74.field175 = var73;
                var74.field122 = var70;
                var74.field141 = var71;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 249) {
                class71.field1578 = class3.field22.method705(-60);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 66) {
                class10.field194 = class3.field22.method703((byte) -74);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 103) {
                long var75 = class3.field22.method712(arg0 + 1092193354);
                long var77 = (long) class3.field22.method665(8666);
                long var79 = (long) class3.field22.method677(-126);
                int var81 = class3.field22.method703((byte) -60);
                long var82 = (var77 << 32) + var79;
                boolean var84 = false;
                for (int var85 = 0; var85 < 100; var85++) {
                    if (class106.field2306[var85] == var82) {
                        var84 = true;
                        break;
                    }
                }
                if (var81 <= 1) {
                    for (int var86 = 0; var86 < class104.field2271; var86++) {
                        if (class22.field470[var86] == var75) {
                            var84 = true;
                            break;
                        }
                    }
                }
                if (!var84 && class81.field1836 == 0) {
                    class106.field2306[class120.field2570] = var82;
                    class120.field2570 = (class120.field2570 + 1) % 100;
                    class69 var87 = class33.method210(arg0 + 105, class3.field22).method485((byte) -82);
                    if (var81 == 2 || var81 == 3) {
                        class87.method619(var87, true, 7, class46.method305(20025, new class69[] { class9.field191, class49.method322(115, var75).method460(false) }));
                    } else if (var81 == 1) {
                        class87.method619(var87, true, 7, class46.method305(20025, new class69[] { class47.field989, class49.method322(109, var75).method460(false) }));
                    } else {
                        class87.method619(var87, true, 3, class49.method322(99, var75).method460(false));
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 241) {
                int var88 = class3.field22.method701(arg0 ^ 0x15);
                int var89 = class3.field22.method671(-120);
                class9 var90 = class9.method56(true, var88);
                var90.field172 = var89;
                var90.field146 = 2;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 54) {
                class104.field2271 = class103.field2224 / 8;
                for (int var91 = 0; var91 < class104.field2271; var91++) {
                    class22.field470[var91] = class3.field22.method712(class81.method590(arg0, 1092193398));
                }
                class90.field1960 = -1;
                return true;
            }
            if (arg0 != 22) {
                return false;
            }
            if (class90.field1960 == 102) {
                int var92 = class3.field22.method705(arg0 ^ 0xFFFFFFBE);
                class73.method516((byte) 108, var92);
                if (class60.field1244 != -1) {
                    class49.method323((byte) 6, class60.field1244);
                    class60.field1244 = -1;
                    class35.field709 = true;
                }
                if (class22.field469 != -1) {
                    class49.method323((byte) 6, class22.field469);
                    class22.field469 = -1;
                    class89.method626(30, (byte) 112);
                }
                if (class51.field1124 != -1) {
                    class49.method323((byte) 6, class51.field1124);
                    class51.field1124 = -1;
                }
                if (class53.field1144 != -1) {
                    class49.method323((byte) 6, class53.field1144);
                    class53.field1144 = -1;
                }
                if (class67.field1396 != var92) {
                    class49.method323((byte) 6, class67.field1396);
                    class67.field1396 = var92;
                }
                if (class62.field1277 != 0) {
                    class35.field709 = true;
                    class62.field1277 = 0;
                }
                class73.field1639 = false;
                class110.field2418 = true;
                class71.field1596 = true;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 255) {
                int var93 = class3.field22.method703((byte) 81);
                int var94 = class3.field22.method703((byte) 111);
                int var95 = class3.field22.method703((byte) 78);
                int var96 = class3.field22.method703((byte) 99);
                class55.field1169[var93] = true;
                class30.field619[var93] = var94;
                class91.field1993[var93] = var95;
                class85.field1894[var93] = var96;
                class101.field2188[var93] = 0;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 223) {
                class56.field1188 = class3.field22.method709(-59);
                class6.field103 = class3.field22.method703((byte) -66);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 250) {
                boolean var97 = class3.field22.method703((byte) -93) == 1;
                int var98 = class3.field22.method667(5811);
                class9 var99 = class9.method56(true, var98);
                class90.field1960 = -1;
                var99.field135 = var97;
                return true;
            }
            if (class90.field1960 == 136) {
                int var100 = class3.field22.method667(5811);
                class9 var101 = class9.method56(true, var100);
                for (int var102 = 0; var102 < var101.field129.length; var102++) {
                    var101.field129[var102] = -1;
                    var101.field129[var102] = 0;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 194) {
                int var103 = class3.field22.method705(-39);
                byte var104 = class3.field22.method700((byte) -115);
                class128.field2759[var103] = var104;
                if (class10.field204[var103] != var104) {
                    class10.field204[var103] = var104;
                    class11.method66(var103, (byte) -124);
                    class110.field2418 = true;
                    if (class46.field968 != -1) {
                        class35.field709 = true;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 26) {
                class35.field709 = true;
                class2.field9 = false;
                class49.field1009 = class49.field992;
                class62.field1277 = 2;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 97) {
                int var105 = class3.field22.method665(8666);
                int var106 = class3.field22.method670(-115);
                if (class60.field1244 != -1) {
                    class49.method323((byte) 6, class60.field1244);
                    class35.field709 = true;
                    class60.field1244 = -1;
                }
                if (class22.field469 != -1) {
                    class49.method323((byte) 6, class22.field469);
                    class22.field469 = -1;
                    class89.method626(30, (byte) 112);
                }
                if (class51.field1124 != -1) {
                    class49.method323((byte) 6, class51.field1124);
                    class51.field1124 = -1;
                }
                if (class53.field1144 != var106) {
                    class49.method323((byte) 6, class53.field1144);
                    class53.field1144 = var106;
                }
                if (class67.field1396 != var105) {
                    class49.method323((byte) 6, class67.field1396);
                    class67.field1396 = var105;
                }
                class73.field1639 = false;
                class71.field1596 = true;
                class110.field2418 = true;
                if (class62.field1277 != 0) {
                    class35.field709 = true;
                    class62.field1277 = 0;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 126) {
                class69.method471(true, (byte) 121);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 70) {
                int var107 = class3.field22.method670(-115);
                if (var107 == 65535) {
                    var107 = -1;
                }
                if (var107 == -1 && class26.field565 == 0) {
                    class93.method652(-113);
                } else if (var107 != -1 && class87.field1910 != var107 && class104.field2279 != 0 && class26.field565 == 0) {
                    class93.method651(0, 0, false, var107, class104.field2279, class27.field570, 10, 104);
                }
                class87.field1910 = var107;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 62) {
                int var108 = class3.field22.method677(-116);
                int var109 = class3.field22.method670(-122);
                if (var109 == 65535) {
                    var109 = -1;
                }
                if (class104.field2279 != 0 && var109 != -1) {
                    class93.method656(0, 1, var109, false, class35.field693, class104.field2279, -108);
                    class26.field565 = var108;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 163) {
                int var110 = class3.field22.method705(-65);
                int var111 = class3.field22.method671(-85);
                class73.method516((byte) 113, var111);
                if (var110 != -1) {
                    class73.method516((byte) 112, var110);
                }
                if (class53.field1144 != -1) {
                    class49.method323((byte) 6, class53.field1144);
                    class53.field1144 = -1;
                }
                if (class67.field1396 != -1) {
                    class49.method323((byte) 6, class67.field1396);
                    class67.field1396 = -1;
                }
                if (class60.field1244 != -1) {
                    class49.method323((byte) 6, class60.field1244);
                    class60.field1244 = -1;
                }
                if (class22.field469 != var111) {
                    class49.method323((byte) 6, class22.field469);
                    class22.field469 = var111;
                    class89.method626(35, (byte) 112);
                }
                if (class51.field1124 != var111) {
                    class49.method323((byte) 6, class51.field1124);
                    class51.field1124 = var110;
                }
                class62.field1277 = 0;
                class90.field1960 = -1;
                class73.field1639 = false;
                return true;
            }
            if (class90.field1960 == 118 || class90.field1960 == 63 || class90.field1960 == 21 || class90.field1960 == 46 || class90.field1960 == 135 || class90.field1960 == 69 || class90.field1960 == 221 || class90.field1960 == 56 || class90.field1960 == 129 || class90.field1960 == 35 || class90.field1960 == 244) {
                class120.method881(arg0 - 141);
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 213) {
                int var112 = class3.field22.method679(-167);
                int var113 = class3.field22.method691(28);
                class9 var114 = class9.method56(true, var112);
                if (var114.field130 != var113 || var113 == -1) {
                    var114.field130 = var113;
                    var114.field147 = 0;
                    var114.field162 = 0;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 17) {
                class114.field2475 = false;
                for (int var115 = 0; var115 < 5; var115++) {
                    class55.field1169[var115] = false;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 90) {
                class75.field1694 = class3.field22.method703((byte) 122);
                if (class75.field1694 == 1) {
                    class74.field1663 = class3.field22.method665(8666);
                }
                if (class75.field1694 >= 2 && class75.field1694 <= 6) {
                    if (class75.field1694 == 2) {
                        class26.field566 = 64;
                        class125.field2684 = 64;
                    }
                    if (class75.field1694 == 3) {
                        class26.field566 = 0;
                        class125.field2684 = 64;
                    }
                    if (class75.field1694 == 4) {
                        class26.field566 = 128;
                        class125.field2684 = 64;
                    }
                    if (class75.field1694 == 5) {
                        class125.field2684 = 0;
                        class26.field566 = 64;
                    }
                    if (class75.field1694 == 6) {
                        class26.field566 = 64;
                        class125.field2684 = 128;
                    }
                    class75.field1694 = 2;
                    class78.field1771 = class3.field22.method665(arg0 ^ 0x21CC);
                    class54.field1153 = class3.field22.method665(arg0 ^ 0x21CC);
                    class40.field780 = class3.field22.method703((byte) 99);
                }
                if (class75.field1694 == 10) {
                    class64.field1351 = class3.field22.method665(8666);
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 3) {
                class69 var116 = class3.field22.method708(-23522);
                if (var116.method461(class75.field1679, 32654)) {
                    class69 var117 = var116.method477(63, var116.method473(class9.field145, 0), 0);
                    long var118 = var117.method465(1);
                    boolean var120 = false;
                    for (int var121 = 0; var121 < class104.field2271; var121++) {
                        if (class22.field470[var121] == var118) {
                            var120 = true;
                            break;
                        }
                    }
                    if (!var120 && class81.field1836 == 0) {
                        class87.method619(class57.field1191, true, 4, var117);
                    }
                } else if (var116.method461(class72.field1608, 32654)) {
                    class69 var128 = var116.method477(arg0 ^ 0x29, var116.method473(class9.field145, arg0 - 22), 0);
                    boolean var129 = false;
                    long var130 = var128.method465(1);
                    for (int var132 = 0; var132 < class104.field2271; var132++) {
                        if (class22.field470[var132] == var130) {
                            var129 = true;
                            break;
                        }
                    }
                    if (!var129 && class81.field1836 == 0) {
                        class87.method619(class64.field1352, true, 8, var128);
                    }
                } else if (var116.method461(class3.field68, arg0 + 32632)) {
                    class69 var122 = var116.method477(63, var116.method473(class9.field145, 0), 0);
                    long var123 = var122.method465(arg0 - 21);
                    boolean var125 = false;
                    for (int var126 = 0; var126 < class104.field2271; var126++) {
                        if (class22.field470[var126] == var123) {
                            var125 = true;
                            break;
                        }
                    }
                    if (!var125 && class81.field1836 == 0) {
                        class69 var127 = var116.method477(63, var116.method487((byte) -86) - 9, var116.method473(class9.field145, arg0 + -22) + 1);
                        class87.method619(var127, true, 8, var122);
                    }
                } else {
                    class87.method619(var116, true, 0, class49.field992);
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 232) {
                for (int var133 = 0; var133 < class10.field204.length; var133++) {
                    if (class128.field2759[var133] != class10.field204[var133]) {
                        class10.field204[var133] = class128.field2759[var133];
                        class11.method66(var133, (byte) -98);
                        class110.field2418 = true;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 252) {
                int var134 = class3.field22.method666(3053);
                int var135 = class3.field22.method671(arg0 ^ 0xFFFFFFBA);
                if (var135 == 65535) {
                    var135 = -1;
                }
                if (class51.field1110[var134] != var135) {
                    class49.method323((byte) 6, class51.field1110[var134]);
                    class51.field1110[var134] = var135;
                }
                class90.field1960 = -1;
                class71.field1596 = true;
                class110.field2418 = true;
                return true;
            }
            if (class90.field1960 == 80) {
                int var136 = class3.field22.method667(arg0 ^ 0x16A5);
                int var137 = class3.field22.method665(8666);
                class128.field2759[var137] = var136;
                if (class10.field204[var137] != var136) {
                    class10.field204[var137] = var136;
                    class11.method66(var137, (byte) -109);
                    if (class46.field968 != -1) {
                        class35.field709 = true;
                    }
                    class110.field2418 = true;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 203) {
                class22.field459 = class3.field22.method703((byte) -94);
                class110.field2418 = true;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 53) {
                class69 var138 = class3.field22.method708(-23522);
                int var139 = class3.field22.method698(-1986049440);
                class9 var140 = class9.method56(true, var139);
                var140.field137 = var138;
                if (var139 >> 16 == class51.field1110[class40.field792]) {
                    class110.field2418 = true;
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 180) {
                class92.field2005 = class3.field22.method703((byte) 83);
                class17.field323 = class3.field22.method703((byte) 110);
                class110.field2421 = class3.field22.method703((byte) -103);
                class35.field709 = true;
                class87.field1914 = true;
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 215) {
                class114.field2475 = true;
                class33.field642 = class3.field22.method703((byte) 98);
                class71.field1581 = class3.field22.method703((byte) -88);
                class61.field1262 = class3.field22.method665(8666);
                class39.field773 = class3.field22.method703((byte) -64);
                class10.field209 = class3.field22.method703((byte) -97);
                if (class10.field209 >= 100) {
                    int var141 = class33.field642 * 128 + 64;
                    int var142 = class71.field1581 * 128 + 64;
                    int var143 = class53.method341(0, var141, var142, class71.field1588) - class61.field1262;
                    int var144 = var141 - class55.field1164;
                    int var145 = var142 - class108.field2395;
                    int var146 = var143 - class70.field1561;
                    int var147 = (int) Math.sqrt((double) (var144 * var144 + var145 * var145));
                    class85.field1900 = (int) (Math.atan2((double) var146, (double) var147) * 325.949D) & 0x7FF;
                    class24.field510 = (int) (-325.949D * Math.atan2((double) var144, (double) var145)) & 0x7FF;
                    if (class85.field1900 < 128) {
                        class85.field1900 = 128;
                    }
                    if (class85.field1900 > 383) {
                        class85.field1900 = 383;
                    }
                }
                class90.field1960 = -1;
                return true;
            }
            if (class90.field1960 == 7) {
                int var148 = class3.field22.method698(-1986049440);
                int var149 = class3.field22.method670(-117);
                int var150 = class3.field22.method670(-116);
                class9 var151 = class9.method56(true, var148);
                if (var150 == 65535) {
                    var151.field146 = 0;
                    class90.field1960 = -1;
                    return true;
                }
                class108 var152 = class9.method47(64, var150);
                var151.field141 = var152.field2391 * 100 / var149;
                var151.field122 = var152.field2385;
                class90.field1960 = -1;
                var151.field146 = 4;
                var151.field175 = var152.field2408;
                var151.field172 = var150;
                return true;
            }
            class16.method90(35, "T1 - " + class90.field1960 + "," + class119.field2547 + "," + class2.field19 + " - " + class103.field2224);
            class82.method592(true);
        } catch (IOException var156) {
            class122.method911(797);
        } catch (Exception var157) {
            String var154 = "T2 - " + class90.field1960 + "," + class119.field2547 + "," + class2.field19 + " - " + class103.field2224 + "," + (class46.field974.field1041[0] + class33.field648) + "," + (class46.field974.field1097[0] + class60.field1234) + " - ";
            for (int var155 = 0; class103.field2224 > var155 && var155 < 50; var155++) {
                var154 = var154 + class3.field22.field2077[var155] + ",";
            }
            class70.method499(var154, var157, 40);
            class82.method592(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method570(int arg0, int arg1, int arg2) {
        field1807++;
        class80 var3 = class92.field2014[class71.field1588][arg2][arg0];
        if (var3 == null) {
            class120.field2562.method992(class71.field1588, arg2, arg0);
            return;
        }
        class35 var4 = (class35) var3.method580((byte) -53);
        int var5 = -99999999;
        class35 var6 = null;
        while (var4 != null) {
            class108 var11 = class9.method47(64, var4.field687);
            int var12 = var11.field2362;
            if (var11.field2363) {
                var12 = (var4.field694 + 1) * var12;
            }
            if (var12 > var5) {
                var6 = var4;
                var5 = var12;
            }
            var4 = (class35) var3.method576((byte) 20);
        }
        if (arg1 != 16537) {
            return;
        }
        class35 var7 = null;
        class35 var8 = null;
        int var9 = (arg0 << 7) + arg2 + 1610612736;
        var3.method578(0, var6);
        for (class35 var10 = (class35) var3.method580((byte) 90); var10 != null; var10 = (class35) var3.method576((byte) 106)) {
            if (var6.field687 != var10.field687 && var7 == null) {
                var7 = var10;
            }
            if (var6.field687 != var10.field687 && var7.field687 != var10.field687 && var8 == null) {
                var8 = var10;
            }
        }
        class120.field2562.method957(class71.field1588, arg2, arg0, class53.method341(0, arg2 * 128 + 64, arg0 * 128 - -64, class71.field1588), var6, var9, var7, var8);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public final void method571(byte arg0) {
        if (arg0 != -62) {
            field1824 = null;
        }
        field1813++;
        while (true) {
            class70 var2 = this.field1810.field1550;
            if (this.field1810 == var2) {
                return;
            }
            var2.method502(arg0 + 62);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lld;ILld;)V")
    public final void method572(class70 arg0, int arg1, class70 arg2) {
        if (arg0.field1556 != null) {
            arg0.method502(0);
        }
        arg0.field1556 = arg2.field1556;
        if (arg1 >= -6) {
            field1823 = -3;
        }
        arg0.field1550 = arg2;
        field1802++;
        arg0.field1556.field1550 = arg0;
        arg0.field1550.field1556 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lld;")
    public final class70 method573(boolean arg0) {
        field1811++;
        class70 var2 = this.field1810.field1550;
        if (!arg0) {
            field1822 = null;
        }
        if (this.field1810 == var2) {
            return null;
        } else {
            var2.method502(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method574(int arg0) {
        if (arg0 >= -63) {
            return;
        }
        field1822 = null;
        field1829 = null;
        field1827 = null;
        field1824 = null;
        field1825 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z")
    public static final boolean method575(int arg0) {
        field1809++;
        class17 var1 = class18.field348;
        synchronized (class18.field348) {
            if (class79.field1782 == class47.field991) {
                return false;
            }
            class71.field1573 = class22.field456[class47.field991];
            if (arg0 < 60) {
                method570(79, 10, -50);
            }
            class10.field197 = class93.field2032[class47.field991];
            class47.field991 = class47.field991 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lld;")
    public final class70 method576(byte arg0) {
        field1805++;
        if (arg0 < 7) {
            this.method571((byte) 52);
        }
        class70 var2 = this.field1815;
        if (this.field1810 == var2) {
            this.field1815 = null;
            return null;
        } else {
            this.field1815 = var2.field1550;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lld;I)V")
    public final void method577(class70 arg0, int arg1) {
        field1806++;
        if (arg0.field1556 != null) {
            arg0.method502(0);
        }
        arg0.field1556 = this.field1810.field1556;
        arg0.field1550 = this.field1810;
        if (arg1 > -2) {
            this.method585(10);
        }
        arg0.field1556.field1550 = arg0;
        arg0.field1550.field1556 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILld;)V")
    public final void method578(int arg0, class70 arg1) {
        if (arg0 != 0) {
            return;
        }
        if (arg1.field1556 != null) {
            arg1.method502(0);
        }
        field1812++;
        arg1.field1556 = this.field1810;
        arg1.field1550 = this.field1810.field1550;
        arg1.field1556.field1550 = arg1;
        arg1.field1550.field1556 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
    public static final void method579(int arg0, byte arg1) {
        field1820++;
        class51.field1129 += arg0;
        if (arg1 <= 95) {
            method583(114);
        }
        while (class51.field1129 >= class35.field710) {
            class51.field1129 -= class35.field710;
            class27.field569 -= class27.field569 >> 2;
        }
        class27.field569 -= arg0 * 1000;
        if (class27.field569 < 0) {
            class27.field569 = 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Lld;")
    public final class70 method580(byte arg0) {
        field1803++;
        int var2 = 36 % ((-arg0 - 9) / 43);
        class70 var3 = this.field1810.field1550;
        if (this.field1810 == var3) {
            this.field1815 = null;
            return null;
        } else {
            this.field1815 = var3.field1550;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)Lld;")
    public final class70 method581(byte arg0) {
        if (arg0 > -23) {
            return null;
        }
        class70 var2 = this.field1810.field1556;
        field1814++;
        if (this.field1810 == var2) {
            return null;
        } else {
            var2.method502(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)Lld;")
    public final class70 method582(boolean arg0) {
        class70 var2 = this.field1810.field1556;
        if (arg0) {
            field1828 = -36;
        }
        field1821++;
        if (this.field1810 == var2) {
            this.field1815 = null;
            return null;
        } else {
            this.field1815 = var2.field1556;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static final void method583(int arg0) {
        field1818++;
        class24.method159(arg0 ^ 0x6789, class22.field469);
        if (class51.field1124 != -1) {
            class24.method159(14762, class51.field1124);
        }
        class69.field1534 = 0;
        class16.field318.method606(arg0 ^ 0xFFFFA1DD);
        class125.field2709 = class117.method848(class125.field2709);
        class95.method729();
        class4.method17(0, 0, -1, 765, false, 0, class22.field469, 503, 0);
        if (class51.field1124 != -1) {
            class4.method17(0, 0, -1, 765, false, 0, class51.field1124, 503, 0);
        }
        if (arg0 != 24099) {
            field1828 = -26;
        }
        if (class127.field2738) {
            class23.method156(-13309);
        } else {
            class61.method369(-20836);
            class114.method833((byte) 104);
        }
        class16.field318.method69(class24.field509, 0, true, 0);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class80() {
        this.field1810.field1556 = this.field1810;
        this.field1810.field1550 = this.field1810;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILbb;)Z")
    public static final boolean method584(int arg0, class9 arg1) {
        field1804++;
        int var2 = arg1.field186;
        if (arg0 != -1) {
            field1823 = -116;
        }
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 >= 101) {
                var2 -= 101;
            } else {
                var2--;
            }
            class23.method149(-19, 0, class46.method305(20025, new class69[] { class29.field606, class64.field1356[var2] }), 6, 0, 0);
            class23.method149(arg0 - 34, 0, class46.method305(20025, new class69[] { class25.field545, class64.field1356[var2] }), 54, 0, 0);
            class92.field2015++;
            class9.field167++;
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class3.field50++;
            class23.method149(arg0 ^ 0xFFFFFF8A, 0, class46.method305(20025, new class69[] { class29.field606, arg1.field137 }), 4, 0, 0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Lld;")
    public final class70 method585(int arg0) {
        class70 var2 = this.field1815;
        field1816++;
        if (this.field1810 == var2) {
            this.field1815 = null;
            return null;
        } else {
            this.field1815 = var2.field1556;
            int var3 = -3 % ((84 - arg0) / 39);
            return var2;
        }
    }
}
