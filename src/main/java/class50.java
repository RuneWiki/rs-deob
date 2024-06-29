import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field1196 = 0;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public int field1212 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[Lm;")
    public static class83[] field1199 = new class83[2048];

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
    public static int[] field1211 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lhe;")
    private static class54 field1202 = class6.method58(" is already on your friend list", false);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lhe;")
    private static class54 field1214 = class6.method58("Select", false);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lhe;")
    public static class54 field1205 = field1202;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lhe;")
    public static class54 field1210 = field1214;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Lsf;")
    public static class131 field1216 = new class131(50);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lhe;")
    public static class54 field1218 = class6.method58("Bitte versuchen Sie)1", false);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "[I")
    public static int[] field1217 = new int[50];

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lhe;")
    public static class54 field1219 = class6.method58("Angreifen", false);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "Lhe;")
    public static class54 field1220 = class6.method58("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", false);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "J")
    public static long field1208;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lhd;")
    public class53 field1194;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method357(byte arg0) {
        if (arg0 != 103) {
            method358(-35);
        }
        field1203++;
        for (class44 var1 = (class44) class95.field2393.method979(-126); var1 != null; var1 = (class44) class95.field2393.method983(arg0 ^ 0x4852)) {
            if (class157.field3573 != var1.field1128 || var1.field1121) {
                var1.method48(-315);
            } else if (var1.field1124 <= class4.field138) {
                var1.method331((byte) 125, class52.field1247);
                if (var1.field1121) {
                    var1.method48(-315);
                } else {
                    class74.field1831.method1049(var1.field1128, var1.field1127, var1.field1131, var1.field1132, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method358(int arg0) {
        field1216 = null;
        if (arg0 != -30004) {
            return;
        }
        field1217 = null;
        field1205 = null;
        field1210 = null;
        field1219 = null;
        field1214 = null;
        field1218 = null;
        field1220 = null;
        field1199 = null;
        field1202 = null;
        field1211 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Z")
    public static final boolean method359(int arg0, int arg1, int arg2, int arg3) {
        field1213++;
        int var4 = class74.field1831.method1063(class157.field3573, arg2, arg1, arg0);
        int var5 = arg0 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        int var6 = var4 & 0x1F;
        int var7 = var4 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class3 var8 = class4.method34(true, var5);
            int var9 = var8.field100;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var8.field67;
                var10 = var8.field86;
            } else {
                var10 = var8.field67;
                var11 = var8.field86;
            }
            if (var7 != 0) {
                var9 = (var9 << var7 & 0xF) + (var9 >> 4 - var7);
            }
            class121.method935(var10, class108.field2639.field951[0], arg1, arg2, var11, 0, true, 2, 0, arg3, var9, class108.field2639.field952[0]);
        } else {
            class121.method935(0, class108.field2639.field951[0], arg1, arg2, 0, var6 + 1, true, 2, var7, 0, 0, class108.field2639.field952[0]);
        }
        class59.field1489 = 2;
        class18.field533 = arg3;
        class2.field37 = class21.field582;
        class111.field2683 = class71.field1763;
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V")
    public static final void method360(long arg0, int arg1) {
        field1198++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % (long) arg1 == 0L) {
            class39.method299(arg0 - 1L, arg1 + 125);
            class39.method299(1L, arg1 ^ 0x8D);
        } else {
            class39.method299(arg0, arg1 ^ 0x8D);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method361(int arg0) {
        class63.field1543.field2583 = 0;
        class4.field130 = true;
        class84.field2094 = 0L;
        field1209++;
        class83.field2024 = 0;
        class158.field3602 = 0;
        class14.field407 = 0;
        class103.field2566 = 0;
        class56.field1395 = 0;
        class124.field2855 = 0;
        class14.field421 = 0;
        class32.field834 = 0;
        class83.field2054 = 0;
        class128.field2887 = 0;
        class95.field2410 = 0;
        class128.field2892 = 0;
        class88.field2178 = 0;
        class17.field488 = 0;
        class123.field2826 = 0;
        class4.field122 = 0;
        class35.field900 = 0;
        class131.field2968 = 0;
        class118.field2769 = 0;
        class88.field2185 = 0;
        class143.field3270 = 0;
        class132.field2980 = 0;
        class38.field995 = 0;
        class3.field90 = 0;
        class89.field2192 = 0;
        class87.field2149 = 0;
        class155.field3511 = 0;
        class99.field2510 = 0;
        class26.field703 = 0;
        class80.field1961 = 0;
        class17.field498 = 0;
        class1.field18 = 0;
        class66.field1577 = 0;
        class57.field1423 = 0;
        class6.field188 = 0;
        class142.field3251 = 0;
        class83.field2029 = 0;
        class129.field2919 = 0;
        class11.field310 = 0;
        class31.field798 = 0;
        class158.field3621 = 0;
        class130.field2939 = 0;
        class44.field1129 = 0;
        class149.field3375 = 0;
        class2.field32 = 0;
        class95.field2400 = 0;
        class144.field3295 = 0;
        class52.field1265 = 0;
        class54.field1330 = 0;
        class3.field93 = 0;
        class157.field3578 = 0;
        class158.field3617 = 0;
        class93.field2258 = 0;
        class5.field145 = 0;
        class53.field1290 = 0;
        class67.field1677 = 0;
        class5.field149 = 0;
        class17.field494 = 0;
        class68.field1705 = 0;
        class14.field402 = 0;
        class144.field3281 = 0;
        class22.field646 = 0;
        class66.field1576 = 0;
        class65.field1573 = 0;
        client.field593 = 0;
        class38.field956 = 0;
        class32.field818 = 0;
        class67.field1617 = 0;
        class28.field749 = 0;
        class58.field1466 = 0;
        class22.field632 = 0;
        class56.field1386 = 0;
        class83.field2057 = 0;
        class16.field481 = 0;
        class134.field3031 = 0;
        class142.field3256 = 0;
        class28.field739 = 0;
        class83.field2026 = 0;
        class48.field1153 = 0;
        class72.field1796 = 0;
        class35.field865 = 0;
        class131.field2958 = 0;
        class83.field2050 = 0;
        class91.field2213 = 0;
        class14.field390 = 0;
        class75.field1850 = 0;
        class35.field879 = 0;
        class141.field3208 = 0;
        class56.field1397 = 0;
        class99.field2512 = 0;
        class54.field1298 = 0;
        client.field601 = 0;
        class31.field797 = 0;
        class79.field1938 = 0;
        class91.field2218 = 0;
        class73.field1813 = 0;
        field1198 = 0;
        class54.field1339 = 0;
        class54.field1324 = 0;
        class56.field1388 = 0;
        class99.field2508 = 0;
        class35.field885 = 0;
        class100.field2538 = 0;
        class128.field2891 = 0;
        class67.field1653 = 0;
        class68.field1712 = 0;
        class48.field1150 = 0;
        class144.field3286 = 0;
        class59.field1485 = 0;
        class21.field588 = 0;
        class34.field847 = 0;
        class83.field2030 = 0;
        class5.field147 = 0;
        class75.field1848 = 0;
        class4.field111 = 0;
        class93.field2232 = 0;
        class83.field2053 = 0;
        class67.field1639 = 0;
        class111.field2674 = 0;
        class53.field1286 = 0;
        class114.field2718 = 0;
        class8.field234 = 0;
        class107.field2609 = 0;
        class4.field101 = 0;
        class93.field2312 = 0;
        class99.field2511 = 0;
        class3.field57 = 0;
        client.field589 = 0;
        class56.field1392 = 0;
        class14.field435 = 0;
        class54.field1336 = 0;
        class83.field2077 = 0;
        class57.field1446 = 0;
        class12.field326 = 0;
        class54.field1304 = 0;
        class58.field1453 = 0;
        class112.field2684 = 0;
        class52.field1268 = 0;
        class108.field2640 = 0;
        class2.field30 = 0;
        class67.field1665 = 0;
        class70.field1736 = 0;
        class83.field2046 = 0;
        class146.field3313 = 0;
        class66.field1596 = 0;
        class91.field2219 = 0;
        class102.field2558 = 0;
        class124.field2851 = 0;
        class32.field826 = 0;
        class144.field3296 = 0;
        class158.field3624 = 0;
        class6.field197 = 0;
        class57.field1444 = 0;
        class62.field1508 = 0;
        class129.field2908 = 0;
        class138.field3158 = 0;
        class53.field1285 = 0;
        class9.field279 = 0;
        class73.field1810 = 0;
        class80.field1994 = 0;
        class53.field1278 = 0;
        class77.field1876 = 0;
        class14.field377 = 0;
        class158.field3589 = 0;
        class58.field1459 = 0;
        class14.field371 = 0;
        class18.field527 = 0;
        class4.field137 = 0;
        class34.field859 = 0;
        class11.field322 = 0;
        class27.field717 = 0;
        class79.field1942 = 0;
        class156.field3535 = 0;
        class4.field102 = 0;
        class67.field1679 = 0;
        class102.field2550 = 0;
        class5.field159 = 0;
        class14.field434 = 0;
        class57.field1418 = 0;
        class83.field2042 = 0;
        class83.field2019 = 0;
        class35.field899 = 0;
        class4.field112 = 0;
        class12.field339 = 0;
        class129.field2912 = 0;
        class137.field3142 = 0;
        class16.field470 = 0;
        class130.field2944 = 0;
        class83.field2049 = 0;
        class157.field3582 = 0;
        class83.field2070 = 0;
        class62.field1510 = 0;
        class144.field3290 = 0;
        class129.field2895 = 0;
        class13.field354 = 0;
        class73.field1816 = 0;
        class54.field1349 = 0;
        class63.field1519 = 0;
        class65.field1557 = 0;
        class26.field709 = 0;
        class6.field176 = 0;
        class134.field3047 = 0;
        class66.field1582 = 0;
        class31.field788 = 0;
        class78.field1894 = 0;
        class129.field2904 = 0;
        class147.field3327 = 0;
        class88.field2183 = 0;
        class4.field120 = 0;
        class130.field2940 = 0;
        class56.field1393 = 0;
        class140.field3194 = 0;
        class4.field110 = 0;
        class14.field380 = 0;
        class83.field2034 = 0;
        class129.field2896 = 0;
        class80.field1954 = 0;
        class4.field104 = 0;
        class151.field3406 = 0;
        class68.field1698 = 0;
        class4.field103 = 0;
        class83.field2072 = 0;
        class93.field2310 = 0;
        class35.field889 = 0;
        class74.field1836 = 0;
        class99.field2514 = 0;
        class107.field2619 = 0;
        class144.field3284 = 0;
        class130.field2951 = 0;
        class15.field448 = 0;
        class65.field1565 = 0;
        class52.field1269 = 0;
        class13.field345 = 0;
        class57.field1432 = 0;
        class80.field1949 = 0;
        class35.field902 = 0;
        class68.field1706 = 0;
        class83.field2065 = 0;
        class49.field1176 = 0;
        class142.field3259 = 0;
        class144.field3288 = 0;
        class54.field1337 = 0;
        class80.field1974 = 0;
        class103.field2581 = 0;
        class105.field2603 = 0;
        class121.field2808 = 0;
        class149.field3350 = 0;
        class150.field3399 = 0;
        class7.field216 = 0;
        class123.field2842 = 0;
        class67.field1613 = 0;
        class14.field382 = 0;
        class93.field2320 = 0;
        class151.field3407 = 0;
        class128.field2888 = 0;
        class53.field1274 = 0;
        class35.field893 = 0;
        class139.field3177 = 0;
        class158.field3626 = 0;
        field1209 = 0;
        class77.field1877 = 0;
        class56.field1391 = 0;
        class130.field2936 = 0;
        class112.field2693 = 0;
        class13.field352 = 0;
        class14.field374 = 0;
        class56.field1404 = 0;
        class149.field3379 = 0;
        class48.field1154 = 0;
        class31.field790 = 0;
        class54.field1296 = 0;
        class34.field846 = 0;
        class62.field1516 = 0;
        class75.field1849 = 0;
        class54.field1328 = 0;
        class133.field2998 = 0;
        class107.field2618 = 0;
        class66.field1589 = 0;
        class6.field196 = 0;
        class32.field810 = 0;
        class107.field2616 = 0;
        class120.field2787 = 0;
        class158.field3594 = 0;
        class158.field3600 = 0;
        class111.field2681 = 0;
        class58.field1475 = 0;
        class158.field3593 = 0;
        class43.field1094 = 0;
        class130.field2943 = 0;
        class54.field1345 = 0;
        class149.field3364 = 0;
        field1203 = 0;
        class142.field3250 = 0;
        class40.field1028 = 0;
        client.field590 = 0;
        class54.field1343 = 0;
        class86.field2132 = 0;
        class4.field109 = 0;
        class114.field2713 = 0;
        client.field597 = 0;
        class135.field3059 = 0;
        class95.field2406 = 0;
        class87.field2143 = 0;
        class52.field1248 = 0;
        class67.field1620 = 0;
        class56.field1398 = 0;
        client.field600 = 0;
        class44.field1122 = 0;
        class32.field821 = 0;
        class146.field3301 = 0;
        class21.field580 = 0;
        class147.field3320 = 0;
        class32.field811 = 0;
        class83.field2020 = 0;
        class14.field370 = 0;
        class27.field714 = 0;
        class66.field1581 = 0;
        class54.field1307 = 0;
        class35.field895 = 0;
        class95.field2397 = 0;
        class85.field2108 = 0;
        class129.field2913 = 0;
        class134.field3027 = 0;
        class12.field330 = 0;
        class53.field1284 = 0;
        class83.field2043 = 0;
        class4.field128 = 0;
        class1.field17 = 0;
        class34.field861 = 0;
        class39.field1007 = 0;
        class26.field708 = 0;
        class158.field3596 = 0;
        class84.field2099 = 0;
        class94.field2383 = 0;
        class34.field845 = 0;
        class63.field1521 = 0;
        class49.field1179 = 0;
        class105.field2586 = 0;
        class73.field1815 = 0;
        class133.field2999 = 0;
        class17.field495 = 0;
        class68.field1683 = 0;
        class83.field2041 = 0;
        class128.field2886 = 0;
        class34.field860 = 0;
        class35.field891 = 0;
        class130.field2952 = 0;
        class83.field2063 = 0;
        class158.field3623 = 0;
        class83.field2035 = 0;
        class22.field613 = 0;
        class95.field2416 = 0;
        class139.field3191 = 0;
        class146.field3310 = 0;
        class89.field2197 = 0;
        class158.field3627 = 0;
        class72.field1783 = 0;
        class89.field2201 = 0;
        class87.field2141 = 0;
        client.field595 = 0;
        class4.field123 = 0;
        class32.field827 = 0;
        class26.field690 = 0;
        class49.field1172 = 0;
        class17.field493 = 0;
        class83.field2079 = 0;
        class6.field190 = 0;
        class14.field369 = 0;
        class35.field878 = 0;
        class142.field3262 = 0;
        class158.field3613 = 0;
        client.field598 = 0;
        class35.field866 = 0;
        class93.field2318 = 0;
        class1.field9 = 0;
        class149.field3360 = 0;
        class149.field3361 = 0;
        class114.field2717 = 0;
        class103.field2576 = 0;
        class121.field2816 = 0;
        class14.field400 = 0;
        class58.field1455 = 0;
        class135.field3065 = 0;
        class58.field1469 = 0;
        class149.field3374 = 0;
        class63.field1517 = 0;
        class43.field1112 = 0;
        class75.field1852 = 0;
        class14.field384 = 0;
        class54.field1303 = 0;
        class52.field1258 = 0;
        class19.field540 = 0;
        class158.field3615 = 0;
        class67.field1623 = 0;
        class125.field2875 = 0;
        class87.field2145 = 0;
        class131.field2964 = 0;
        class54.field1322 = 0;
        class150.field3389 = 0;
        class38.field958 = 0;
        class14.field425 = 0;
        class51.field1233 = 0;
        class21.field584 = 0;
        class14.field378 = 0;
        class83.field2075 = 0;
        class7.field207 = 0;
        class4.field108 = 0;
        class94.field2371 = 0;
        class35.field874 = 0;
        class132.field2997 = 0;
        class83.field2033 = 0;
        class67.field1662 = 0;
        class14.field379 = 0;
        class143.field3268 = 0;
        class3.field84 = 0;
        class140.field3202 = 0;
        class100.field2532 = 0;
        class85.field2110 = 0;
        class34.field848 = 0;
        class38.field987 = 0;
        class157.field3585 = 0;
        class121.field2804 = 0;
        class83.field2048 = 0;
        class44.field1123 = 0;
        class83.field2056 = 0;
        class4.field121 = 0;
        class58.field1465 = 0;
        class129.field2897 = 0;
        class14.field389 = 0;
        class139.field3183 = 0;
        class66.field1586 = 0;
        class133.field3013 = 0;
        class158.field3604 = 0;
        class70.field1729 = 0;
        class68.field1694 = 0;
        class80.field1982 = 0;
        class93.field2361 = 0;
        class156.field3555 = 0;
        class137.field3133 = 0;
        class137.field3137 = 0;
        class88.field2173 = 0;
        class66.field1595 = 0;
        class24.field652 = 0;
        class137.field3135 = 0;
        class125.field2871 = 0;
        class111.field2661 = 0;
        class140.field3196 = 0;
        class130.field2928 = 0;
        class71.field1768 = 0;
        class1.field12 = 0;
        class67.field1616 = 0;
        class54.field1302 = 0;
        class141.field3220 = 0;
        class108.field2633 = 0;
        class27.field711 = 0;
        class14.field416 = 0;
        class86.field2129 = 0;
        class83.field2074 = 0;
        class156.field3540 = 0;
        class48.field1170 = 0;
        class139.field3178 = 0;
        class83.field2037 = 0;
        class5.field161 = 0;
        class68.field1714 = 0;
        class130.field2941 = 0;
        class67.field1621 = 0;
        class158.field3622 = 0;
        class158.field3619 = 0;
        class72.field1781 = 0;
        client.field599 = 0;
        class22.field615 = 0;
        class14.field395 = 0;
        class18.field516 = 0;
        class133.field3005 = 0;
        class49.field1183 = 0;
        class138.field3172 = 0;
        class57.field1449 = 0;
        class83.field2061 = 0;
        class88.field2172 = 0;
        class54.field1305 = 0;
        class59.field1486 = 0;
        class123.field2834 = 0;
        class31.field778 = 0;
        class70.field1730 = 0;
        class158.field3587 = 0;
        class28.field740 = 0;
        class72.field1778 = 0;
        class158.field3590 = 0;
        class95.field2394 = 0;
        class156.field3527 = 0;
        class80.field1953 = 0;
        class14.field385 = 0;
        class80.field1981 = 0;
        class157.field3580 = 0;
        class142.field3260 = 0;
        class18.field529 = 0;
        class31.field787 = 0;
        class131.field2970 = 0;
        class9.field271 = 0;
        class63.field1526 = 0;
        class54.field1326 = 0;
        class35.field881 = 0;
        class14.field397 = 0;
        class31.field792 = 0;
        class57.field1424 = 0;
        class56.field1396 = 0;
        class44.field1139 = 0;
        class103.field2561 = 0;
        class66.field1585 = 0;
        class120.field2790 = 0;
        class15.field453 = 0;
        class75.field1847 = 0;
        class146.field3305 = 0;
        class3.field95 = 0;
        class54.field1299 = 0;
        class35.field896 = 0;
        class35.field870 = 0;
        class58.field1451 = 0;
        class70.field1738 = 0;
        class65.field1560 = 0;
        class26.field695 = 0;
        class146.field3311 = 0;
        class144.field3291 = 0;
        class80.field1977 = 0;
        class35.field880 = 0;
        class149.field3354 = 0;
        class139.field3179 = 0;
        class120.field2785 = 0;
        class22.field640 = 0;
        class149.field3356 = 0;
        class128.field2885 = 0;
        class70.field1744 = 0;
        class83.field2080 = 0;
        class108.field2634 = 0;
        class4.field115 = 0;
        class133.field3014 = 0;
        class134.field3022 = 0;
        class75.field1845 = 0;
        class73.field1817 = 0;
        class2.field35 = 0;
        class156.field3523 = 0;
        class74.field1834 = 0;
        class75.field1837 = 0;
        class31.field796 = 0;
        class135.field3061 = 0;
        class75.field1841 = 0;
        class88.field2167 = 0;
        class80.field1967 = 0;
        class155.field3505 = 0;
        class93.field2344 = 0;
        class9.field276 = 0;
        class35.field869 = 0;
        class63.field1523 = 0;
        class99.field2513 = 0;
        class14.field376 = 0;
        class5.field160 = 0;
        class91.field2214 = 0;
        class39.field1008 = 0;
        class95.field2408 = 0;
        class80.field1966 = 0;
        class80.field1956 = 0;
        class4.field106 = 0;
        class12.field342 = 0;
        class49.field1180 = 0;
        class123.field2836 = 0;
        class131.field2956 = 0;
        class93.field2340 = 0;
        class85.field2115 = 0;
        class137.field3136 = 0;
        class19.field560 = 0;
        class58.field1472 = 0;
        class9.field303 = 0;
        class142.field3240 = 0;
        class80.field1983 = 0;
        class137.field3139 = 0;
        class93.field2308 = 0;
        class3.field77 = 0;
        class54.field1297 = 0;
        class150.field3401 = 0;
        class7.field219 = 0;
        class57.field1438 = 0;
        class95.field2402 = 0;
        class14.field429 = 0;
        class111.field2662 = 0;
        class11.field314 = 0;
        class54.field1293 = 0;
        class31.field773 = 0;
        class65.field1558 = 0;
        class56.field1403 = 0;
        class54.field1338 = 0;
        class150.field3398 = 0;
        class93.field2285 = 0;
        class54.field1313 = 0;
        class54.field1340 = 0;
        class14.field383 = 0;
        class70.field1735 = 0;
        if (arg0 > -45) {
            return;
        }
        class107.field2624 = 0;
        class52.field1259 = 0;
        class14.field398 = 0;
        class67.field1629 = 0;
        client.field603 = 0;
        class19.field546 = 0;
        class54.field1301 = 0;
        class137.field3138 = 0;
        class39.field1020 = 0;
        class83.field2058 = 0;
        class14.field422 = 0;
        class49.field1171 = 0;
        class158.field3595 = 0;
        class72.field1790 = 0;
        class83.field2052 = 0;
        class115.field2724 = 0;
        class111.field2673 = 0;
        class139.field3188 = 0;
        class83.field2078 = 0;
        class124.field2864 = 0;
        class83.field2036 = 0;
        class56.field1394 = 0;
        class131.field2955 = 0;
        class107.field2625 = 0;
        class14.field412 = 0;
        class105.field2594 = 0;
        class51.field1222 = 0;
        class35.field887 = 0;
        class14.field411 = 0;
        class83.field2044 = 0;
        class26.field700 = 0;
        class144.field3285 = 0;
        class57.field1416 = 0;
        class85.field2104 = 0;
        class103.field2564 = 0;
        class77.field1873 = 0;
        class137.field3149 = 0;
        class158.field3610 = 0;
        class105.field2593 = 0;
        class70.field1731 = 0;
        class130.field2937 = 0;
        class15.field456 = 0;
        class68.field1697 = 0;
        class32.field820 = 0;
        class54.field1311 = 0;
        class115.field2722 = 0;
        class54.field1314 = 0;
        class35.field883 = 0;
        class158.field3603 = 0;
        class35.field871 = 0;
        class89.field2196 = 0;
        class83.field2023 = 0;
        class121.field2814 = 0;
        class121.field2805 = 0;
        class54.field1346 = 0;
        class157.field3584 = 0;
        class125.field2874 = 0;
        class140.field3198 = 0;
        class143.field3269 = 0;
        class83.field2066 = 0;
        class158.field3628 = 0;
        class57.field1439 = 0;
        class80.field1969 = 0;
        class125.field2876 = 0;
        class158.field3608 = 0;
        class118.field2757 = 0;
        class121.field2815 = 0;
        class93.field2355 = 0;
        class15.field450 = 0;
        class65.field1559 = 0;
        class142.field3234 = 0;
        class54.field1327 = 0;
        class49.field1177 = 0;
        class6.field204 = 0;
        class48.field1155 = 0;
        class58.field1471 = 0;
        class38.field984 = 0;
        class19.field558 = 0;
        class8.field243 = 0;
        class83.field2073 = 0;
        class78.field1908 = 0;
        class83.field2027 = 0;
        class134.field3029 = 0;
        class57.field1435 = 0;
        class48.field1162 = 0;
        class54.field1292 = 0;
        class38.field990 = 0;
        class142.field3239 = 0;
        class32.field822 = 0;
        class80.field1964 = 0;
        class31.field789 = 0;
        class14.field417 = 0;
        class95.field2415 = 0;
        class103.field2579 = 0;
        class144.field3294 = 0;
        class83.field2059 = 0;
        class108.field2630 = 0;
        class1.field16 = 0;
        class102.field2544 = 0;
        class24.field656 = 0;
        class58.field1452 = 0;
        class13.field347 = 0;
        class137.field3134 = 0;
        class77.field1875 = 0;
        class74.field1827 = 0;
        client.field592 = 0;
        class87.field2147 = 0;
        class54.field1317 = 0;
        class19.field547 = 0;
        class31.field803 = 0;
        class66.field1579 = 0;
        class102.field2556 = 0;
        class158.field3599 = 0;
        class28.field736 = 0;
        class39.field1003 = 0;
        class68.field1689 = 0;
        class26.field698 = 0;
        class149.field3382 = 0;
        class68.field1702 = 0;
        class44.field1116 = 0;
        class54.field1333 = 0;
        class66.field1597 = 0;
        class14.field375 = 0;
        class56.field1389 = 0;
        class138.field3173 = 0;
        class158.field3616 = 0;
        class158.field3591 = 0;
        class3.field91 = 0;
        class32.field813 = 0;
        class141.field3209 = 0;
        class83.field2025 = 0;
        class134.field3032 = 0;
        class4.field119 = 0;
        class129.field2906 = 0;
        class121.field2803 = 0;
        class14.field404 = 0;
        class54.field1341 = 0;
        class91.field2221 = 0;
        class125.field2878 = 0;
        class9.field266 = 0;
        class80.field1971 = 0;
        class94.field2385 = 0;
        class9.field263 = 0;
        class67.field1614 = 0;
        class137.field3145 = 0;
        class78.field1899 = 0;
        class6.field177 = 0;
        class91.field2217 = 0;
        class16.field467 = 0;
        class143.field3274 = 0;
        class58.field1474 = 0;
        class111.field2650 = 0;
        class142.field3254 = 0;
        class8.field238 = 0;
        class14.field392 = 0;
        class56.field1387 = 0;
        class68.field1696 = 0;
        class57.field1427 = 0;
        class64.field1547 = 0;
        class149.field3377 = 0;
        class138.field3152 = 0;
        class58.field1457 = 0;
        class137.field3143 = 0;
        class128.field2889 = 0;
        class86.field2137 = 0;
        class83.field2045 = 0;
        class68.field1707 = 0;
        class15.field463 = 0;
        class11.field318 = 0;
        class4.field116 = 0;
        class32.field815 = 0;
        class8.field223 = 0;
        class6.field189 = 0;
        class141.field3213 = 0;
        class141.field3217 = 0;
        class22.field621 = 0;
        class158.field3625 = 0;
        class52.field1256 = 0;
        class135.field3062 = 0;
        class93.field2292 = 0;
        class62.field1509 = 0;
        class14.field426 = 0;
        class144.field3282 = 0;
        class70.field1719 = 0;
        class124.field2861 = 0;
        class49.field1185 = 0;
        class107.field2617 = 0;
        class120.field2786 = 0;
        class54.field1315 = 0;
        class123.field2840 = 0;
        class89.field2189 = 0;
        class14.field418 = 0;
        class32.field824 = 0;
        class62.field1511 = 0;
        class6.field205 = 0;
        class121.field2802 = 0;
        class56.field1399 = 0;
        class151.field3405 = 0;
        class83.field2068 = 0;
        class1.field4 = 0;
        class67.field1630 = 0;
        class68.field1691 = 0;
        class9.field280 = 0;
        class111.field2678 = 0;
        class87.field2146 = 0;
        class94.field2372 = 0;
        class80.field1950 = 0;
        class70.field1749 = 0;
        class70.field1758 = 0;
        class77.field1881 = 0;
        class103.field2567 = 0;
        class53.field1280 = 0;
        class35.field877 = 0;
        class94.field2388 = 0;
        class83.field2028 = 0;
        class132.field2996 = 0;
        class130.field2942 = 0;
        class54.field1329 = 0;
        class137.field3140 = 0;
        class56.field1390 = 0;
        class137.field3132 = 0;
        class88.field2169 = 0;
        class11.field324 = 0;
        class54.field1300 = 0;
        class142.field3245 = 0;
        class18.field532 = 0;
        class39.field1019 = 0;
        class67.field1655 = 0;
        class31.field800 = 0;
        client.field594 = 0;
        class31.field772 = 0;
        class108.field2637 = 0;
        class6.field199 = 0;
        class54.field1310 = 0;
        class65.field1563 = 0;
        class13.field355 = 0;
        class27.field710 = 0;
        class9.field272 = 0;
        class131.field2959 = 0;
        class54.field1312 = 0;
        class100.field2534 = 0;
        class83.field2064 = 0;
        class78.field1919 = 0;
        class86.field2130 = 0;
        class115.field2735 = 0;
        class3.field97 = 0;
        class1.field14 = 0;
        class115.field2736 = 0;
        class14.field388 = 0;
        class27.field712 = 0;
        class135.field3068 = 0;
        class38.field965 = 0;
        class3.field94 = 0;
        class54.field1348 = 0;
        class156.field3550 = 0;
        class124.field2862 = 0;
        class83.field2069 = 0;
        class7.field209 = 0;
        class4.field127 = 0;
        class3.field43 = 0;
        class49.field1178 = 0;
        class31.field782 = 0;
        class158.field3618 = 0;
        class79.field1936 = 0;
        field1204 = 0;
        class83.field2047 = 0;
        class35.field886 = 0;
        class144.field3297 = 0;
        field1213 = 0;
        class2.field28 = 0;
        class140.field3192 = 0;
        class28.field746 = 0;
        class138.field3165 = 0;
        class83.field2060 = 0;
        class158.field3620 = 0;
        class24.field651 = 0;
        class24.field676 = 0;
        class111.field2664 = 0;
        class112.field2688 = 0;
        class83.field2071 = 0;
        class129.field2905 = 0;
        class131.field2957 = 0;
        class88.field2165 = 0;
        class138.field3159 = 0;
        class68.field1703 = 0;
        class17.field500 = 0;
        class80.field1970 = 0;
        class35.field888 = 0;
        class149.field3351 = 0;
        class14.field432 = 0;
        class79.field1939 = 0;
        class130.field2929 = 0;
        class91.field2223 = 0;
        class150.field3400 = 0;
        class4.field114 = 0;
        class54.field1319 = 0;
        class132.field2984 = 0;
        class3.field81 = 0;
        class2.field27 = 0;
        class26.field693 = 0;
        class138.field3169 = 0;
        class53.field1283 = 0;
        class31.field776 = 0;
        class53.field1281 = 0;
        class32.field807 = 0;
        class9.field269 = 0;
        class16.field469 = 0;
        class28.field734 = 0;
        class15.field446 = 0;
        class94.field2370 = 0;
        class52.field1249 = 0;
        class9.field284 = 0;
        class3.field56 = 0;
        class83.field2022 = 0;
        class11.field319 = 0;
        class131.field2963 = 0;
        class39.field1015 = 0;
        class27.field723 = 0;
        class40.field1030 = 0;
        class66.field1580 = 0;
        class140.field3193 = 0;
        class83.field2038 = 0;
        class58.field1460 = 0;
        class95.field2405 = 0;
        class83.field2021 = 0;
        class156.field3533 = 0;
        class63.field1525 = 0;
        class54.field1331 = 0;
        class11.field306 = 0;
        class83.field2040 = 0;
        class8.field241 = 0;
        class133.field3008 = 0;
        class54.field1316 = 0;
        class83.field2031 = 0;
        class71.field1764 = 0;
        class68.field1687 = 0;
        class143.field3266 = 0;
        class14.field386 = 0;
        class6.field191 = 0;
        class67.field1680 = 0;
        class54.field1309 = 0;
        class26.field701 = 0;
        class16.field486 = 0;
        class83.field2018 = 0;
        class142.field3232 = 0;
        class118.field2767 = true;
        class118.field2763 = 0;
        class157.method1205((byte) -117);
        class131.field2969.field2076 = 0;
        class111.field2658 = 0;
        class67.field1641 = 0;
        class40.field1044.field2076 = 0;
        class99.field2518 = -1;
        class111.field2669 = 0;
        class80.field1965 = -1;
        class78.field1913 = -1;
        class137.field3131 = 0;
        class133.field3007 = false;
        class151.field3404 = 0;
        class85.field2123 = -1;
        class56.method435(0, (byte) 96);
        for (int var1 = 0; var1 < 100; var1++) {
            class14.field394[var1] = null;
        }
        class40.field1050 = (int) (Math.random() * 30.0D) - 20;
        class8.field227 = 0;
        class155.field3508 = 0;
        class91.field2220 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class141.field3216 = false;
        class63.field1533 = (int) (Math.random() * 120.0D) - 60;
        class141.field3207 = (int) (Math.random() * 100.0D) - 50;
        class44.field1137 = (int) (Math.random() * 110.0D) - 55;
        class34.field857 = -1;
        class3.field76 = 0;
        class112.field2698 = (int) (Math.random() * 80.0D) - 40;
        class75.field1866 = 0;
        class74.field1823 = 0;
        class158.field3598 = 0;
        class134.field3035 = 0;
        class1.field15 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class48.field1148[var2] = null;
            field1199[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class111.field2679[var3] = null;
        }
        class108.field2639 = class48.field1148[2047] = new class22();
        class85.field2106.method978((byte) 112);
        class95.field2393.method978((byte) -19);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class77.field1878[var4][var11][var12] = null;
                }
            }
        }
        class120.field2789 = new class130();
        class158.field3609 = 0;
        class18.field528 = 0;
        for (int var5 = 0; var5 < class157.field3577; var5++) {
            class128 var10 = class72.method563(98, var5);
            if (var10 != null && var10.field2884 == 0) {
                class35.field894[var5] = 0;
                class63.field1540[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class5.field164.length; var6++) {
            class5.field164[var6] = -1;
        }
        if (class39.field1016 != -1) {
            class102.method802(-119, class39.field1016);
        }
        for (class112 var7 = (class112) class63.field1530.method245((byte) 118); var7 != null; var7 = (class112) class63.field1530.method244((byte) -25)) {
            class44.method330(-80, true, var7);
        }
        class39.field1016 = -1;
        class63.field1530 = new class32(8);
        class133.field3007 = false;
        class93.field2242 = null;
        class67.field1641 = 0;
        class143.field3267.method536(new int[5], null, -1, (byte) -79, false);
        for (int var8 = 0; var8 < 8; var8++) {
            class138.field3154[var8] = null;
            class53.field1287[var8] = false;
        }
        class56.method438((byte) -85);
        class66.field1610 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class85.field2114[var9] = true;
        }
        class94.field2382 = null;
        class72.field1779 = 0;
        class56.field1414 = null;
    }
}
