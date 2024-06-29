import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lld;")
    private class72 field231 = new class72();

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lrb;")
    private class105 field249 = new class105();

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Le;")
    private class30 field247;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lae;")
    private static class6 field221 = class64.method474(114, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[B")
    public static byte[] field232 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lae;")
    public static class6 field236 = class64.method474(107, "huffman");

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lae;")
    public static class6 field222 = class64.method474(126, " @whi@(X");

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lae;")
    public static class6 field226 = class64.method474(121, "backhmid1");

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lae;")
    private static class6 field241 = class64.method474(109, "This world is full)3");

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lae;")
    public static class6 field238 = class64.method474(103, "headicons_hint");

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lae;")
    private static class6 field239 = class64.method474(114, "Service unavailable)3");

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lae;")
    public static class6 field237 = field239;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lae;")
    public static class6 field224 = field241;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
    public static boolean field248 = false;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Le;")
    public static class30 field225;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Led;")
    public static class31 field227;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lj;")
    public static class59 field250;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lkd;")
    public static class66 field229;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[[B")
    public static byte[][] field223;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 7)
    public static final void method125(byte arg0) {
        field233++;
        if (arg0 != 54) {
            method127(-6);
        }
        if (class5.field67 == 0) {
            return;
        }
        class9 var1 = class102.field2397;
        int var2 = 0;
        if (class78.field1888 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class5.field66[var3] != null) {
                int var4 = client.field464[var3];
                class6 var5 = class103.field2431[var3];
                byte var6 = 0;
                if (var5 != null && var5.method36(class67.field1488, false)) {
                    var5 = var5.method56(-58, 5);
                    var6 = 1;
                }
                if (var5 != null && var5.method36(class104.field2466, false)) {
                    var5 = var5.method56(-58, 5);
                    var6 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class15.field304 == 0 || class15.field304 == 1 && class6.method31(21469, var5))) {
                    int var7 = 329 - var2 * 13;
                    var2++;
                    byte var8 = 4;
                    var1.method106(class118.field2818, var8, var7, 0);
                    var1.method106(class118.field2818, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method96(class118.field2818);
                    int var10 = var9 + var1.method104(32);
                    if (var6 == 1) {
                        class108.field2585[0].method1036(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class108.field2585[1].method1036(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method106(class85.method731(new class6[] { var5, class59.field1286, class5.field66[var3] }, 14569), var10, var7, 0);
                    var1.method106(class85.method731(new class6[] { var5, class59.field1286, class5.field66[var3] }, 14569), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class15.field304 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method106(class5.field66[var3], 4, var11, 0);
                    var1.method106(class5.field66[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class15.field304 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method106(class85.method731(new class6[] { class139.field3371, class75.field1710, var5, class59.field1286, class5.field66[var3] }, 14569), 4, var12, 0);
                    var2++;
                    var1.method106(class85.method731(new class6[] { class139.field3371, class75.field1710, var5, class59.field1286, class5.field66[var3] }, 14569), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(JI)V", line = 157)
    public final void method126(long arg0, int arg1) {
        int var4 = -13 % ((-arg1 - 61) / 32);
        field228++;
        class72 var5 = (class72) this.field247.method276((byte) -19, arg0);
        if (var5 != null) {
            var5.method498(101);
            var5.method572(16777215);
            this.field251++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 182)
    public static final void method127(int arg0) {
        class37.field854 = class60.field1315;
        class4.field52 = class89.field2126;
        class61.field1335 = class93.field2210;
        class103.field2436 = class122.field3016;
        class66.field1468 = class16.field327;
        class122.field3008 = class5.field54;
        class103.field2437 = class32.field779;
        class88.field2113 = class135.field3293;
        class50.field1119 = class126.field3076;
        class54.field1189 = class133.field3240;
        class105.field2490 = class79.field1926;
        class5.field71 = class42.field966;
        class123.field3037 = class129.field3122;
        class37.field838 = class59.field1301;
        class72.field1642 = class102.field2409;
        class105.field2489 = class49.field1091;
        class82.field2014 = class95.field2237;
        client.field457 = class126.field3092;
        class52.field1175 = class90.field2148;
        class20.field429 = class73.field1671;
        class51.field1130 = class51.field1158;
        class20.field418 = class49.field1092;
        class20.field454 = class22.field573;
        class20.field398 = class68.field1503;
        class75.field1704 = class2.field3;
        class20.field402 = class104.field2463;
        class65.field1427 = class6.field130;
        class66.field1465 = class30.field734;
        class122.field3015 = class111.field2671;
        class20.field442 = class22.field573;
        class43.field987 = class7.field143;
        class117.field2763 = class104.field2473;
        class126.field3094 = class40.field901;
        class6.field124 = class79.field1911;
        class80.field1942 = class51.field1157;
        class20.field437 = class22.field573;
        class52.field1182 = class20.field385;
        class20.field452 = class111.field2657;
        class70.field1571 = class59.field1280;
        class103.field2423 = class122.field3016;
        class20.field445 = class22.field573;
        class72.field1647 = class62.field1363;
        int var1 = -122 % ((39 - arg0) / 38);
        class30.field735 = class70.field1549;
        class20.field441 = class139.field3370;
        class118.field2818 = class126.field3083;
        class24.field619 = class38.field859;
        class34.field811 = class108.field2584;
        class67.field1484 = class77.field1865;
        class20.field399 = class69.field1536;
        class19.field378 = class88.field2105;
        class61.field1324 = class49.field1108;
        class138.field3349 = class68.field1509;
        class59.field1279 = class118.field2817;
        class2.field17 = class77.field1823;
        class136.field3310 = class66.field1467;
        class32.field771 = class91.field2173;
        class47.field1072 = class43.field983;
        class76.field1769 = class134.field3280;
        class125.field3043 = class34.field812;
        class60.field1311 = class89.field2120;
        class20.field432 = class73.field1671;
        class40.field887 = class69.field1542;
        class126.field3074 = field221;
        class20.field443 = class22.field573;
        class56.field1234 = class117.field2772;
        class109.field2645 = class49.field1089;
        class61.field1337 = class70.field1554;
        class20.field417 = class88.field2106;
        class20.field425 = class22.field573;
        class35.field830 = class139.field3367;
        class103.field2445 = class70.field1552;
        class102.field2411 = class92.field2202;
        class19.field379 = class88.field2105;
        class20.field430 = class49.field1092;
        class129.field3116 = class129.field3126;
        class20.field420 = class22.field573;
        class122.field3019 = class16.field325;
        class107.field2564 = class58.field1261;
        class50.field1110 = class135.field3307;
        class20.field455 = class22.field573;
        class69.field1531 = class135.field3295;
        class65.field1417 = class116.field2751;
        class116.field2724 = class137.field3334;
        class30.field708 = class62.field1370;
        class54.field1191 = class126.field3089;
        class105.field2499 = class52.field1181;
        class104.field2460 = class40.field898;
        class60.field1323 = class107.field2544;
        class7.field158 = class72.field1648;
        class20.field433 = class22.field573;
        class20.field390 = class69.field1536;
        class50.field1125 = class58.field1275;
        class116.field2723 = class95.field2230;
        class82.field2015 = class104.field2468;
        class89.field2122 = class25.field631;
        class25.field636 = class125.field3041;
        class123.field3021 = class7.field153;
        class51.field1152 = class80.field1951;
        class133.field3263 = class49.field1085;
        client.field479 = class85.field2059;
        class20.field419 = class22.field573;
        class2.field26 = class122.field3006;
        class20.field434 = class22.field573;
        client.field483 = class130.field3147;
        class126.field3091 = class135.field3302;
        class56.field1217 = class92.field2192;
        class126.field3088 = class136.field3316;
        class89.field2124 = class62.field1356;
        class20.field422 = class22.field573;
        class32.field784 = class32.field779;
        class129.field3136 = class50.field1109;
        class40.field902 = class21.field505;
        class52.field1169 = class50.field1109;
        class109.field2648 = class105.field2504;
        class80.field1947 = class61.field1330;
        class30.field746 = class96.field2271;
        class59.field1304 = class18.field354;
        class37.field848 = class64.field1414;
        class37.field844 = class59.field1301;
        class20.field388 = class93.field2222;
        class96.field2303 = class96.field2298;
        class46.field1030 = class79.field1938;
        class95.field2232 = class56.field1218;
        class50.field1123 = class105.field2502;
        class38.field861 = class102.field2408;
        class123.field3030 = class76.field1784;
        class90.field2147 = class68.field1498;
        class20.field435 = class25.field630;
        class20.field416 = class93.field2222;
        class20.field449 = class22.field573;
        class61.field1334 = class64.field1396;
        class76.field1792 = class134.field3284;
        class62.field1365 = class87.field2084;
        class139.field3381 = class43.field970;
        class52.field1167 = class82.field2010;
        class41.field926 = class14.field279;
        class7.field146 = class42.field961;
        class65.field1428 = class69.field1524;
        class20.field397 = class38.field863;
        class20.field440 = class81.field1971;
        class18.field355 = class18.field357;
        class67.field1486 = class77.field1865;
        class40.field881 = class80.field1950;
        field243++;
        class108.field2593 = class105.field2484;
        class21.field510 = class59.field1296;
        class68.field1492 = class139.field3382;
        class20.field439 = class14.field262;
        class81.field1981 = class104.field2470;
        class92.field2183 = class77.field1820;
        class73.field1678 = class96.field2279;
        class46.field1025 = class69.field1519;
        class20.field450 = class22.field573;
        class20.field438 = class105.field2507;
        class82.field2009 = class90.field2151;
        class89.field2121 = class134.field3278;
        class121.field2856 = class135.field3304;
        class15.field319 = class15.field310;
        class88.field2114 = class58.field1260;
        class136.field3318 = class57.field1236;
        class20.field451 = class22.field573;
        class107.field2573 = class90.field2161;
        class89.field2130 = class107.field2536;
        class7.field134 = class91.field2168;
        class25.field625 = class137.field3330;
        class30.field744 = class130.field3158;
        class117.field2760 = class4.field51;
        class20.field423 = class22.field573;
        class117.field2781 = class76.field1757;
        class118.field2805 = class54.field1203;
        class64.field1392 = class105.field2495;
        class69.field1525 = class92.field2191;
        class139.field3371 = class8.field172;
        class137.field3332 = class8.field181;
        class19.field384 = class5.field70;
        class89.field2123 = class76.field1791;
        class20.field431 = class46.field1032;
        class20.field409 = class80.field1949;
        class30.field747 = class123.field3028;
        class46.field1039 = class105.field2507;
        class104.field2465 = class95.field2245;
        class22.field575 = class47.field1060;
        class77.field1852 = class59.field1288;
        class20.field396 = class93.field2222;
        class126.field3101 = class30.field745;
        class19.field367 = class62.field1352;
        class111.field2658 = class22.field579;
        class62.field1351 = class77.field1847;
        class81.field1966 = class75.field1689;
        class20.field453 = class30.field741;
        class20.field426 = class22.field573;
        class95.field2265 = class15.field317;
        class130.field3161 = class38.field864;
        class51.field1156 = class2.field20;
        class14.field299 = class125.field3042;
        class20.field447 = class93.field2222;
        class133.field3259 = class66.field1472;
        class27.field670 = class69.field1517;
        class18.field361 = class19.field373;
        class21.field514 = class118.field2820;
        class85.field2063 = class96.field2289;
        class104.field2474 = class2.field18;
        class20.field448 = class121.field2942;
        class20.field394 = class96.field2302;
        class103.field2434 = class103.field2432;
        class130.field3159 = class22.field573;
        client.field469 = class126.field3096;
        field224 = class49.field1101;
        class32.field788 = class102.field2391;
        class7.field160 = class108.field2587;
        class123.field3022 = class38.field872;
        class21.field504 = class30.field739;
        class41.field918 = class138.field3364;
        class41.field932 = class18.field353;
        class40.field892 = class137.field3328;
        class92.field2204 = class75.field1706;
        class125.field3056 = class108.field2589;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BJ)Lld;", line = 455)
    public final class72 method128(byte arg0, long arg1) {
        int var4 = -35 / ((68 - arg0) / 57);
        field245++;
        class72 var5 = (class72) this.field247.method276((byte) -19, arg1);
        if (var5 != null) {
            this.field249.method892(var5, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 491)
    public final void method129(int arg0) {
        field240++;
        while (true) {
            class72 var2 = this.field249.method893(-127);
            if (var2 == null) {
                if (arg0 != 27392) {
                    method127(16);
                }
                this.field251 = this.field246;
                return;
            }
            var2.method498(125);
            var2.method572(16777215);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lld;JB)V", line = 520)
    public final void method130(class72 arg0, long arg1, byte arg2) {
        if (this.field251 == 0) {
            class72 var5 = this.field249.method893(-127);
            var5.method498(97);
            var5.method572(16777215);
            if (this.field231 == var5) {
                class72 var6 = this.field249.method893(-126);
                var6.method498(108);
                var6.method572(16777215);
            }
        } else {
            this.field251--;
        }
        int var7 = -118 % ((50 - arg2) / 45);
        field242++;
        this.field247.method269(arg1, arg0, (byte) -96);
        this.field249.method892(arg0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V", line = 624)
    public class12(int arg0) {
        this.field246 = arg0;
        int var2 = 1;
        this.field251 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field247 = new class30(var2);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V", line = 583)
    public static void method131(int arg0) {
        field223 = null;
        field237 = null;
        field250 = null;
        field221 = null;
        field229 = null;
        field225 = null;
        field224 = null;
        field226 = null;
        field238 = null;
        field232 = null;
        field239 = null;
        field236 = null;
        field234 = null;
        field227 = null;
        field222 = null;
        if (arg0 < 76) {
            field225 = null;
        }
        field241 = null;
    }
}
