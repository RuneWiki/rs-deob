import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Ltd;")
    public static class136 field2904 = class145.method1172("blaugr-Un:", 45);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[[[B")
    public static byte[][][] field2895 = new byte[4][104][104];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "J")
    public static long field2893 = 0L;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Ltd;")
    private static class136 field2903 = class145.method1172("Attack", 45);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
    public static int[] field2907 = new int[100];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ltd;")
    private static class136 field2894 = class145.method1172(" is already on your ignore list", 45);

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Ltd;")
    public static class136 field2909 = field2894;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Ltd;")
    public static class136 field2905 = class145.method1172("Bitte starten Sie eine Mitgliedschaft", 45);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Ltd;")
    public static class136 field2899 = field2903;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lsb;")
    public static class127 field2900;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lcd;")
    public static class19 field2906;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public static final void method958(int arg0, int arg1) {
        class49.field1128 = null;
        class7.field120 = arg0;
        class76.field1716 = -1;
        class44.field1019 = arg1;
        field2901++;
        class59.field1289 = false;
        class12.field227 = -1;
        class155.field3604 = 1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method959(int arg0) {
        field2900 = null;
        field2905 = null;
        field2894 = null;
        field2906 = null;
        field2904 = null;
        field2909 = null;
        field2907 = null;
        field2895 = null;
        if (arg0 != -2177) {
            field2899 = null;
        }
        field2899 = null;
        field2903 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIII)V")
    public static final void method960(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2898++;
        int var7 = 2048 - arg2 & 0x7FF;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0;
        if (var7 != 0) {
            int var12 = class103.field2456[var7];
            int var13 = class103.field2452[var7];
            int var14 = var10 * var13 - arg0 * var12 >> 16;
            var11 = var10 * var12 + arg0 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class103.field2456[var8];
            int var16 = class103.field2452[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class28.field621 = arg5 - var10;
        class12.field228 = arg2;
        class83.field1976 = arg3;
        class100.field2409 = arg6 - var11;
        class9.field168 = arg4 - var9;
        if (arg1 < 125) {
            field2892 = 76;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2910++;
        int var6 = (arg2 - 32) * arg2 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        class40.field934[0].method693(arg5, arg4);
        class40.field934[1].method693(arg5, arg4 + arg2 - 16);
        int var7 = (arg2 - var6 - 32) * arg3 / (arg1 - arg2);
        class114.method891(arg5, arg4 + 16, 16, arg2 - 32, class18.field359);
        class114.method891(arg5, arg4 + var7 + 16, 16, var6, class124.field2880);
        class114.method886(arg5, arg4 + var7 + 16, var6, class51.field1157);
        class114.method886(arg5 + 1, arg4 + 16 + var7, var6, class51.field1157);
        class114.method900(arg5, arg4 + var7 + 16, 16, class51.field1157);
        class114.method900(arg5, arg4 + var7 + 17, arg0, class51.field1157);
        class114.method886(arg5 + 15, arg4 - (-16 - var7), var6, class14.field282);
        class114.method886(arg5 + 14, arg4 + 17 + var7, var6 - 1, class14.field282);
        class114.method900(arg5, arg4 + var6 + var7 + 15, 16, class14.field282);
        class114.method900(arg5 + 1, arg4 - (-var7 + -14 - var6), 15, class14.field282);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public static final int method962(int arg0, int arg1, int arg2) {
        field2891++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 / 128;
        if (arg1 <= 86) {
            field2904 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method963(int arg0) {
        field2908++;
        int var1 = 24 / ((-arg0 - 33) / 61);
        if (class132.field3120 > 0) {
            class142.method1153(true);
        } else {
            class73.method534((byte) 73, 40);
            field2906 = class133.field3140;
            class133.field3140 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static final void method964(byte arg0) {
        class47.field1086 = true;
        class73.field1522.field3283 = 0;
        class38.field878 = true;
        class74.field1629 = 0;
        field2897++;
        class89.field2109 = 0;
        class70.field1478 = 0;
        class127.field2998 = 0;
        class155.field3550 = 0;
        class63.field1335 = 0;
        class61.field1313 = 0;
        class62.field1324 = 0;
        class87.field2036 = 0;
        class80.field1824 = 0;
        class127.field2950 = 0;
        class53.field1185 = 0;
        class19.field380 = 0;
        class88.field2082 = 0;
        class38.field890 = 0;
        class80.field1857 = 0;
        class53.field1186 = 0;
        class31.field702 = 0;
        class80.field1878 = 0;
        class93.field2174 = 0;
        client.field442 = 0;
        class2.field31 = 0;
        class142.field3297 = 0;
        class146.field3363 = 0;
        class149.field3432 = 0;
        class112.field2608 = 0;
        class136.field3198 = 0;
        class136.field3179 = 0;
        class19.field405 = 0;
        class63.field1350 = 0;
        class127.field2989 = 0;
        class85.field1993 = 0;
        class83.field1950 = 0;
        class136.field3202 = 0;
        class27.field597 = 0;
        class5.field106 = 0;
        class136.field3170 = 0;
        class19.field411 = 0;
        class133.field3134 = 0;
        class91.field2155 = 0;
        class155.field3552 = 0;
        class155.field3572 = 0;
        class121.field2769 = 0;
        class13.field251 = 0;
        class4.field75 = 0;
        class132.field3111 = 0;
        class108.field2533 = 0;
        class38.field899 = 0;
        class96.field2294 = 0;
        client.field437 = 0;
        class120.field2730 = 0;
        class87.field2044 = 0;
        class146.field3375 = 0;
        class21.field426 = 0;
        field2898 = 0;
        class12.field212 = 0;
        class11.field183 = 0;
        class14.field275 = 0;
        class11.field192 = 0;
        class49.field1109 = 0;
        class18.field364 = 0;
        class99.field2404 = 0;
        class136.field3173 = 0;
        class62.field1320 = 0;
        class64.field1389 = 0;
        class43.field1007 = 0;
        class127.field2956 = 0;
        class31.field688 = 0;
        class127.field3012 = 0;
        class87.field2063 = 0;
        class136.field3175 = 0;
        class128.field3025 = 0;
        class12.field220 = 0;
        class14.field267 = 0;
        class146.field3367 = 0;
        class33.field744 = 0;
        class4.field78 = 0;
        class69.field1444 = 0;
        class55.field1238 = 0;
        class31.field691 = 0;
        class28.field619 = 0;
        class71.field1487 = 0;
        class127.field2970 = 0;
        class12.field210 = 0;
        class122.field2836 = 0;
        class127.field2966 = 0;
        class101.field2427 = 0;
        class87.field2034 = 0;
        class127.field2996 = 0;
        class131.field3104 = 0;
        class83.field1951 = 0;
        class127.field2987 = 0;
        class128.field3051 = 0;
        class80.field1885 = 0;
        class128.field3056 = 0;
        class67.field1432 = 0;
        class80.field1867 = 0;
        client.field441 = 0;
        class141.field3265 = 0;
        class87.field2033 = 0;
        class87.field2035 = 0;
        class63.field1344 = 0;
        class73.field1533 = 0;
        class152.field3475 = 0;
        class127.field2949 = 0;
        class29.field653 = 0;
        class116.field2652 = 0;
        class127.field2951 = 0;
        class120.field2741 = 0;
        class131.field3108 = 0;
        class76.field1709 = 0;
        class91.field2154 = 0;
        class155.field3606 = 0;
        class139.field3252 = 0;
        class136.field3219 = 0;
        class146.field3373 = 0;
        class71.field1483 = 0;
        class31.field693 = 0;
        class127.field2978 = 0;
        class149.field3423 = 0;
        class73.field1527 = 0;
        class127.field2993 = 0;
        class37.field862 = 0;
        class49.field1099 = 0;
        field2891 = 0;
        class127.field2983 = 0;
        class61.field1303 = 0;
        class74.field1650 = 0;
        class110.field2592 = 0;
        class51.field1156 = 0;
        class80.field1826 = 0;
        class122.field2833 = 0;
        class83.field1960 = 0;
        class143.field3314 = 0;
        class136.field3171 = 0;
        class155.field3557 = 0;
        class119.field2715 = 0;
        class47.field1071 = 0;
        class18.field348 = 0;
        class61.field1309 = 0;
        class104.field2470 = 0;
        class127.field2976 = 0;
        class75.field1703 = 0;
        class67.field1434 = 0;
        class67.field1425 = 0;
        class151.field3462 = 0;
        class65.field1404 = 0;
        class143.field3310 = 0;
        class62.field1317 = 0;
        class47.field1062 = 0;
        class52.field1173 = 0;
        class81.field1916 = 0;
        class55.field1227 = 0;
        class15.field289 = 0;
        class41.field962 = 0;
        class49.field1112 = 0;
        class116.field2657 = 0;
        class19.field396 = 0;
        class127.field2977 = 0;
        class11.field198 = 0;
        class15.field311 = 0;
        class24.field560 = 0;
        class43.field978 = 0;
        class136.field3178 = 0;
        class21.field430 = 0;
        class93.field2171 = 0;
        class122.field2820 = 0;
        class136.field3204 = 0;
        class2.field32 = 0;
        class142.field3302 = 0;
        class39.field916 = 0;
        class87.field2046 = 0;
        class39.field915 = 0;
        class65.field1400 = 0;
        class83.field1971 = 0;
        class108.field2538 = 0;
        class127.field3003 = 0;
        class33.field759 = 0;
        client.field436 = 0;
        class21.field424 = 0;
        class51.field1149 = 0;
        class59.field1286 = 0;
        class3.field53 = 0;
        class107.field2513 = 0;
        class110.field2586 = 0;
        class133.field3127 = 0;
        class108.field2548 = 0;
        class69.field1445 = 0;
        class136.field3197 = 0;
        class1.field17 = 0;
        class87.field2065 = 0;
        class85.field2006 = 0;
        class18.field356 = 0;
        class41.field954 = 0;
        class70.field1482 = 0;
        class136.field3210 = 0;
        class19.field389 = 0;
        class80.field1838 = 0;
        class28.field607 = 0;
        class31.field707 = 0;
        class87.field2030 = 0;
        class69.field1461 = 0;
        class80.field1853 = 0;
        class31.field684 = 0;
        class39.field914 = 0;
        class61.field1293 = 0;
        class24.field561 = 0;
        class19.field391 = 0;
        class9.field164 = 0;
        class2.field25 = 0;
        class49.field1130 = 0;
        class106.field2512 = 0;
        class80.field1829 = 0;
        class99.field2381 = 0;
        class64.field1363 = 0;
        class44.field1016 = 0;
        class124.field2883 = 0;
        class85.field2000 = 0;
        class127.field3008 = 0;
        class149.field3422 = 0;
        class49.field1124 = 0;
        class110.field2598 = 0;
        client.field454 = 0;
        class122.field2822 = 0;
        class142.field3293 = 0;
        class108.field2563 = 0;
        class49.field1101 = 0;
        class99.field2393 = 0;
        class116.field2644 = 0;
        class28.field610 = 0;
        class40.field924 = 0;
        class77.field1726 = 0;
        class118.field2681 = 0;
        class136.field3199 = 0;
        class128.field3029 = 0;
        class153.field3490 = 0;
        class16.field319 = 0;
        class27.field598 = 0;
        class56.field1261 = 0;
        class128.field3039 = 0;
        class87.field2076 = 0;
        class118.field2696 = 0;
        class24.field579 = 0;
        class7.field126 = 0;
        class14.field273 = 0;
        class24.field549 = 0;
        class80.field1888 = 0;
        class100.field2411 = 0;
        class113.field2615 = 0;
        class41.field950 = 0;
        class2.field20 = 0;
        class116.field2659 = 0;
        class74.field1554 = 0;
        class143.field3313 = 0;
        class53.field1191 = 0;
        class12.field211 = 0;
        class105.field2481 = 0;
        class14.field277 = 0;
        class127.field2973 = 0;
        class31.field678 = 0;
        class19.field373 = 0;
        class49.field1111 = 0;
        class151.field3457 = 0;
        class61.field1307 = 0;
        class64.field1382 = 0;
        class127.field2961 = 0;
        class76.field1711 = 0;
        class75.field1691 = 0;
        class136.field3189 = 0;
        class118.field2690 = 0;
        class136.field3218 = 0;
        class31.field679 = 0;
        class142.field3296 = 0;
        class136.field3201 = 0;
        class74.field1685 = 0;
        class2.field23 = 0;
        class29.field634 = 0;
        client.field444 = 0;
        class116.field2664 = 0;
        class2.field28 = 0;
        class18.field346 = 0;
        class140.field3257 = 0;
        class133.field3128 = 0;
        class86.field2028 = 0;
        class44.field1017 = 0;
        class37.field855 = 0;
        class110.field2583 = 0;
        class121.field2778 = 0;
        client.field457 = 0;
        class110.field2587 = 0;
        class136.field3177 = 0;
        class86.field2017 = 0;
        class121.field2799 = 0;
        class1.field8 = 0;
        class110.field2580 = 0;
        class116.field2648 = 0;
        class151.field3454 = 0;
        class136.field3215 = 0;
        class4.field71 = 0;
        client.field452 = 0;
        class127.field3005 = 0;
        class74.field1678 = 0;
        class120.field2737 = 0;
        class80.field1849 = 0;
        class87.field2072 = 0;
        class147.field3380 = 0;
        class80.field1836 = 0;
        class127.field2994 = 0;
        class145.field3345 = 0;
        class31.field697 = 0;
        class155.field3554 = 0;
        class40.field925 = 0;
        class74.field1670 = 0;
        class2.field40 = 0;
        class133.field3124 = 0;
        class37.field850 = 0;
        class59.field1288 = 0;
        class127.field2965 = 0;
        class80.field1851 = 0;
        class44.field1018 = 0;
        class14.field269 = 0;
        class67.field1437 = 0;
        class87.field2061 = 0;
        class59.field1290 = 0;
        class140.field3262 = 0;
        class24.field559 = 0;
        class127.field2954 = 0;
        class47.field1079 = 0;
        class49.field1110 = 0;
        class136.field3188 = 0;
        class55.field1213 = 0;
        class149.field3428 = 0;
        class136.field3206 = 0;
        class116.field2649 = 0;
        class80.field1883 = 0;
        class15.field292 = 0;
        class5.field108 = 0;
        class28.field623 = 0;
        class96.field2261 = 0;
        class108.field2542 = 0;
        class155.field3577 = 0;
        class69.field1448 = 0;
        class132.field3112 = 0;
        class96.field2298 = 0;
        class29.field629 = 0;
        class18.field366 = 0;
        class80.field1880 = 0;
        class71.field1485 = 0;
        class100.field2410 = 0;
        class55.field1247 = 0;
        class136.field3172 = 0;
        client.field447 = 0;
        class12.field213 = 0;
        class39.field919 = 0;
        class2.field33 = 0;
        class119.field2718 = 0;
        class94.field2211 = 0;
        class19.field390 = 0;
        class19.field403 = 0;
        class143.field3317 = 0;
        class128.field3049 = 0;
        class9.field155 = 0;
        class141.field3268 = 0;
        class49.field1119 = 0;
        class96.field2272 = 0;
        class146.field3359 = 0;
        class14.field281 = 0;
        class15.field305 = 0;
        class24.field576 = 0;
        class136.field3212 = 0;
        class142.field3295 = 0;
        class49.field1108 = 0;
        class12.field203 = 0;
        class19.field388 = 0;
        class96.field2287 = 0;
        client.field440 = 0;
        class49.field1123 = 0;
        class143.field3306 = 0;
        class87.field2055 = 0;
        class52.field1161 = 0;
        class15.field299 = 0;
        class89.field2101 = 0;
        class127.field3014 = 0;
        class147.field3381 = 0;
        class41.field945 = 0;
        class89.field2112 = 0;
        class19.field407 = 0;
        class75.field1705 = 0;
        class155.field3601 = 0;
        class116.field2669 = 0;
        class139.field3234 = 0;
        class99.field2395 = 0;
        class56.field1270 = 0;
        class62.field1323 = 0;
        class69.field1460 = 0;
        class105.field2490 = 0;
        class139.field3255 = 0;
        class140.field3261 = 0;
        class21.field428 = 0;
        class153.field3507 = 0;
        class146.field3358 = 0;
        class44.field1014 = 0;
        class80.field1876 = 0;
        class49.field1129 = 0;
        class87.field2066 = 0;
        class67.field1422 = 0;
        class80.field1846 = 0;
        class63.field1338 = 0;
        class83.field1962 = 0;
        class49.field1131 = 0;
        class1.field11 = 0;
        class24.field548 = 0;
        class128.field3078 = 0;
        class127.field2999 = 0;
        class121.field2788 = 0;
        class108.field2552 = 0;
        class127.field3007 = 0;
        class136.field3194 = 0;
        class79.field1807 = 0;
        class136.field3191 = 0;
        class121.field2806 = 0;
        class91.field2143 = 0;
        class145.field3341 = 0;
        class77.field1741 = 0;
        class83.field1961 = 0;
        class110.field2595 = 0;
        class4.field76 = 0;
        class5.field100 = 0;
        class89.field2111 = 0;
        class49.field1103 = 0;
        class1.field12 = 0;
        class87.field2067 = 0;
        class74.field1604 = 0;
        class31.field700 = 0;
        class80.field1882 = 0;
        class80.field1852 = 0;
        class14.field268 = 0;
        class18.field352 = 0;
        class63.field1333 = 0;
        class136.field3211 = 0;
        class96.field2268 = 0;
        class127.field2988 = 0;
        class86.field2019 = 0;
        class93.field2187 = 0;
        class154.field3525 = 0;
        field2910 = 0;
        class24.field563 = 0;
        class80.field1866 = 0;
        class69.field1464 = 0;
        class61.field1305 = 0;
        class145.field3353 = 0;
        class91.field2147 = 0;
        class141.field3274 = 0;
        class35.field795 = 0;
        class112.field2612 = 0;
        class31.field682 = 0;
        class152.field3473 = 0;
        class121.field2754 = 0;
        class129.field3091 = 0;
        class21.field416 = 0;
        class77.field1754 = 0;
        class51.field1152 = 0;
        class108.field2553 = 0;
        class121.field2776 = 0;
        class151.field3451 = 0;
        class99.field2406 = 0;
        class69.field1463 = 0;
        class63.field1342 = 0;
        class41.field959 = 0;
        class122.field2830 = 0;
        class141.field3288 = 0;
        class21.field433 = 0;
        class37.field868 = 0;
        class19.field410 = 0;
        class96.field2285 = 0;
        class127.field2971 = 0;
        class133.field3133 = 0;
        class91.field2153 = 0;
        class7.field130 = 0;
        class99.field2386 = 0;
        class136.field3205 = 0;
        class69.field1443 = 0;
        class81.field1909 = 0;
        class80.field1844 = 0;
        class55.field1239 = 0;
        class87.field2074 = 0;
        class139.field3242 = 0;
        class52.field1163 = 0;
        class152.field3479 = 0;
        class122.field2823 = 0;
        class136.field3192 = 0;
        class79.field1810 = 0;
        class29.field641 = 0;
        class89.field2110 = 0;
        class79.field1811 = 0;
        class127.field3015 = 0;
        field2897 = 0;
        class129.field3099 = 0;
        class41.field952 = 0;
        class96.field2302 = 0;
        class62.field1327 = 0;
        class61.field1291 = 0;
        class53.field1189 = 0;
        class99.field2388 = 0;
        class69.field1454 = 0;
        class7.field128 = 0;
        class87.field2069 = 0;
        class13.field266 = 0;
        class127.field2967 = 0;
        class96.field2255 = 0;
        class54.field1198 = 0;
        class119.field2706 = 0;
        class83.field1958 = 0;
        class110.field2581 = 0;
        class127.field2972 = 0;
        class94.field2209 = 0;
        class49.field1097 = 0;
        class149.field3435 = 0;
        class5.field116 = 0;
        class12.field206 = 0;
        class49.field1100 = 0;
        class109.field2577 = 0;
        class87.field2060 = 0;
        class74.field1618 = 0;
        class116.field2654 = 0;
        class79.field1819 = 0;
        class69.field1455 = 0;
        class122.field2825 = 0;
        class8.field140 = 0;
        class49.field1098 = 0;
        class131.field3103 = 0;
        class136.field3209 = 0;
        class104.field2472 = 0;
        class91.field2141 = 0;
        class49.field1095 = 0;
        class145.field3354 = 0;
        class41.field948 = 0;
        class11.field184 = 0;
        class9.field153 = 0;
        class59.field1284 = 0;
        class52.field1159 = 0;
        class69.field1452 = 0;
        class49.field1120 = 0;
        class53.field1187 = 0;
        class94.field2205 = 0;
        class21.field421 = 0;
        class129.field3098 = 0;
        field2901 = 0;
        class127.field2990 = 0;
        class47.field1070 = 0;
        class61.field1299 = 0;
        class78.field1795 = 0;
        class136.field3169 = 0;
        class96.field2289 = 0;
        class5.field98 = 0;
        class83.field1966 = 0;
        class2.field42 = 0;
        class127.field2959 = 0;
        class21.field434 = 0;
        class87.field2031 = 0;
        class15.field302 = 0;
        class152.field3477 = 0;
        class120.field2743 = 0;
        class39.field910 = 0;
        class128.field3077 = 0;
        class3.field55 = 0;
        class41.field943 = 0;
        class121.field2783 = 0;
        class83.field1969 = 0;
        class47.field1069 = 0;
        class69.field1447 = 0;
        class112.field2610 = 0;
        field2896 = 0;
        class141.field3278 = 0;
        class127.field3000 = 0;
        class127.field3010 = 0;
        class63.field1356 = 0;
        class24.field565 = 0;
        class39.field918 = 0;
        class105.field2486 = 0;
        class133.field3129 = 0;
        class18.field358 = 0;
        class61.field1295 = 0;
        class75.field1698 = 0;
        class80.field1850 = 0;
        class74.field1623 = 0;
        class141.field3282 = 0;
        class37.field866 = 0;
        class31.field701 = 0;
        class55.field1236 = 0;
        class127.field3016 = 0;
        class99.field2398 = 0;
        class133.field3130 = 0;
        class80.field1833 = 0;
        class80.field1823 = 0;
        class4.field73 = 0;
        class135.field3163 = 0;
        class107.field2519 = 0;
        class29.field644 = 0;
        class49.field1096 = 0;
        class37.field869 = 0;
        class38.field893 = 0;
        class13.field239 = 0;
        class105.field2477 = 0;
        class136.field3181 = 0;
        class24.field545 = 0;
        class5.field92 = 0;
        class21.field422 = 0;
        class2.field34 = 0;
        class61.field1306 = 0;
        class122.field2835 = 0;
        class27.field601 = 0;
        class63.field1340 = 0;
        class127.field2985 = 0;
        class77.field1766 = 0;
        class80.field1859 = 0;
        class136.field3180 = 0;
        class49.field1102 = 0;
        class145.field3333 = 0;
        class84.field1992 = 0;
        class86.field2013 = 0;
        if (arg0 < 104) {
            field2902 = -22;
        }
        client.field438 = 0;
        class128.field3053 = 0;
        class61.field1294 = 0;
        class99.field2384 = 0;
        class127.field2981 = 0;
        class15.field296 = 0;
        class80.field1831 = 0;
        class74.field1655 = 0;
        class152.field3471 = 0;
        class28.field624 = 0;
        class140.field3259 = 0;
        class33.field757 = 0;
        client.field460 = 0;
        class133.field3126 = 0;
        class127.field2991 = 0;
        class87.field2058 = 0;
        class38.field898 = 0;
        class83.field1974 = 0;
        class12.field204 = 0;
        class88.field2083 = 0;
        class63.field1349 = 0;
        class55.field1215 = 0;
        class8.field143 = 0;
        class37.field860 = 0;
        class14.field272 = 0;
        class49.field1104 = 0;
        class128.field3074 = 0;
        class143.field3308 = 0;
        class140.field3256 = 0;
        class106.field2506 = 0;
        class89.field2106 = 0;
        class73.field1526 = 0;
        class136.field3214 = 0;
        class122.field2829 = 0;
        class121.field2815 = 0;
        class35.field815 = 0;
        class19.field382 = 0;
        class127.field2955 = 0;
        class116.field2661 = 0;
        class136.field3186 = 0;
        client.field453 = 0;
        class81.field1911 = 0;
        class87.field2053 = 0;
        class64.field1368 = 0;
        class26.field587 = 0;
        class118.field2684 = 0;
        class13.field241 = 0;
        class12.field208 = 0;
        class99.field2394 = 0;
        class71.field1484 = 0;
        class127.field2992 = 0;
        class63.field1347 = 0;
        class77.field1753 = 0;
        class43.field994 = 0;
        class110.field2579 = 0;
        class52.field1166 = 0;
        class116.field2658 = 0;
        class133.field3135 = 0;
        class11.field190 = 0;
        class86.field2009 = 0;
        class127.field2986 = 0;
        class31.field681 = 0;
        class27.field605 = 0;
        class94.field2208 = 0;
        class129.field3094 = 0;
        class110.field2591 = 0;
        class127.field2964 = 0;
        class104.field2474 = 0;
        class87.field2037 = 0;
        client.field445 = 0;
        class12.field207 = 0;
        class74.field1605 = 0;
        class88.field2081 = 0;
        class127.field2997 = 0;
        class43.field1006 = 0;
        class31.field680 = 0;
        class108.field2544 = 0;
        class136.field3187 = 0;
        class99.field2405 = 0;
        class11.field194 = 0;
        class69.field1449 = 0;
        class141.field3289 = 0;
        class53.field1188 = 0;
        class99.field2402 = 0;
        class99.field2375 = 0;
        class35.field827 = 0;
        class59.field1282 = 0;
        class40.field935 = 0;
        class63.field1341 = 0;
        class83.field1952 = 0;
        class146.field3362 = 0;
        class38.field900 = 0;
        class31.field687 = 0;
        class49.field1116 = 0;
        class26.field586 = 0;
        class13.field234 = 0;
        class83.field1967 = 0;
        class127.field3011 = 0;
        class84.field1986 = 0;
        class87.field2047 = 0;
        class139.field3243 = 0;
        class40.field936 = 0;
        class31.field695 = 0;
        class124.field2872 = 0;
        class136.field3213 = 0;
        class133.field3132 = 0;
        class31.field692 = 0;
        class127.field3001 = 0;
        class136.field3196 = 0;
        class154.field3533 = 0;
        class49.field1107 = 0;
        class5.field95 = 0;
        class86.field2020 = 0;
        class110.field2584 = 0;
        class93.field2188 = 0;
        class26.field585 = 0;
        class87.field2051 = 0;
        class146.field3372 = 0;
        class108.field2531 = 0;
        class80.field1834 = 0;
        class136.field3203 = 0;
        class80.field1848 = 0;
        class106.field2498 = 0;
        class7.field119 = 0;
        class112.field2613 = 0;
        class67.field1436 = 0;
        class43.field983 = 0;
        class142.field3294 = 0;
        class99.field2383 = 0;
        class37.field867 = 0;
        class154.field3532 = 0;
        class78.field1781 = 0;
        class147.field3382 = 0;
        class87.field2045 = 0;
        class52.field1174 = 0;
        class24.field558 = 0;
        class2.field30 = 0;
        class127.field2948 = 0;
        class151.field3449 = 0;
        class142.field3300 = 0;
        class110.field2594 = 0;
        class136.field3208 = 0;
        class78.field1788 = 0;
        class127.field2979 = 0;
        class63.field1355 = 0;
        class136.field3216 = 0;
        class38.field889 = 0;
        class77.field1744 = 0;
        class142.field3298 = 0;
        class90.field2129 = 0;
        class3.field49 = 0;
        class13.field242 = 0;
        class29.field646 = 0;
        class127.field2963 = 0;
        class94.field2210 = 0;
        class135.field3160 = 0;
        class40.field930 = 0;
        class64.field1388 = 0;
        class11.field177 = 0;
        class74.field1662 = 0;
        class4.field66 = 0;
        class122.field2821 = 0;
        class38.field897 = 0;
        class21.field431 = 0;
        class63.field1343 = 0;
        class52.field1165 = 0;
        class52.field1169 = 0;
        class87.field2029 = 0;
        class31.field698 = 0;
        class78.field1782 = 0;
        class19.field375 = 0;
        class53.field1193 = 0;
        class7.field125 = 0;
        class79.field1812 = 0;
        class19.field392 = 0;
        class110.field2589 = 0;
        class80.field1875 = 0;
        class35.field836 = 0;
        class133.field3123 = 0;
        class65.field1396 = 0;
        class142.field3303 = 0;
        class127.field2957 = 0;
        class129.field3095 = 0;
        class80.field1827 = 0;
        class2.field39 = 0;
        class127.field2982 = 0;
        class85.field1995 = 0;
        class74.field1572 = 0;
        class116.field2647 = 0;
        class146.field3374 = 0;
        class127.field2980 = 0;
        class132.field3115 = 0;
        class4.field68 = 0;
        class80.field1877 = 0;
        field2908 = 0;
        class61.field1311 = 0;
        class80.field1825 = 0;
        class28.field615 = 0;
        class49.field1105 = 0;
        class84.field1987 = 0;
        class152.field3478 = 0;
        class80.field1839 = 0;
        class31.field694 = 0;
        class3.field63 = 0;
        class85.field2001 = 0;
        class136.field3200 = 0;
        class18.field351 = 0;
        class41.field957 = 0;
        class106.field2501 = 0;
        class15.field307 = 0;
        class54.field1204 = 0;
        class13.field253 = 0;
        class121.field2775 = 0;
        class113.field2616 = 0;
        class73.field1541 = 0;
        class49.field1121 = 0;
        class67.field1435 = 0;
        class122.field2831 = 0;
        class83.field1959 = 0;
        class40.field937 = 0;
        class24.field568 = 0;
        class47.field1072 = 0;
        class128.field3030 = 0;
        class27.field595 = 0;
        class136.field3176 = 0;
        class80.field1862 = 0;
        class127.field3009 = 0;
        class143.field3312 = 0;
        class85.field2005 = 0;
        class55.field1254 = 0;
        class80.field1856 = 0;
        class122.field2826 = 0;
        class49.field1132 = 0;
        class15.field295 = 0;
        class19.field400 = 0;
        class121.field2762 = 0;
        class80.field1843 = 0;
        class101.field2431 = 0;
        class77.field1722 = 0;
        class21.field425 = 0;
        class74.field1608 = 0;
        class33.field739 = 0;
        class12.field216 = 0;
        class14.field276 = 0;
        class99.field2382 = 0;
        class83.field1965 = 0;
        class87.field2052 = 0;
        class55.field1232 = 0;
        class145.field3338 = 0;
        class128.field3035 = 0;
        class104.field2468 = 0;
        class121.field2766 = 0;
        class80.field1860 = 0;
        class73.field1535 = 0;
        class55.field1225 = 0;
        class49.field1127 = 0;
        class73.field1518 = 0;
        class49.field1113 = 0;
        class110.field2596 = 0;
        class151.field3445 = 0;
        class91.field2146 = 0;
        class24.field552 = 0;
        class139.field3246 = 0;
        class43.field976 = 0;
        class56.field1262 = 0;
        class119.field2705 = 0;
        class78.field1794 = 0;
        class108.field2555 = 0;
        class143.field3319 = 0;
        class141.field3286 = 0;
        class121.field2792 = 0;
        class80.field1832 = 0;
        class44.field1020 = 0;
        class2.field21 = 0;
        class63.field1337 = 0;
        class143.field3318 = 0;
        class135.field3158 = 0;
        class70.field1476 = 0;
        class128.field3070 = 0;
        class96.field2291 = 0;
        class155.field3570 = 0;
        class52.field1162 = 0;
        class87.field2048 = 0;
        class93.field2190 = 0;
        class152.field3474 = 0;
        class112.field2614 = 0;
        class49.field1122 = 0;
        class109.field2571 = 0;
        class80.field1858 = 0;
        class104.field2467 = 0;
        class136.field3193 = 0;
        class108.field2557 = 0;
        class62.field1328 = 0;
        class67.field1421 = 0;
        class59.field1285 = 0;
        class108.field2547 = 0;
        class141.field3275 = 0;
        class69.field1441 = 0;
        class129.field3089 = 0;
        class83.field1979 = 0;
        class96.field2301 = 0;
        class49.field1114 = 0;
        class65.field1406 = 0;
        class127.field2969 = 0;
        class28.field613 = 0;
        class13.field247 = 0;
        class127.field2968 = 0;
        class91.field2142 = 0;
        class127.field2962 = 0;
        class69.field1446 = 0;
        class65.field1395 = 0;
        class127.field2952 = 0;
        class131.field3109 = 0;
        class154.field3519 = 0;
        class85.field1994 = 0;
        class49.field1106 = 0;
        class83.field1956 = 0;
        class54.field1195 = 0;
        class38.field887 = 0;
        class147.field3409 = 0L;
        class8.method39(0);
        class3.field48 = 0;
        class132.field3120 = 0;
        class15.field304.field2995 = 0;
        class14.field274 = 0;
        class49.field1094 = -1;
        class101.field2425 = -1;
        class153.field3494 = 0;
        class19.field398 = 0;
        class4.field70.field2995 = 0;
        class96.field2267 = false;
        class9.field163 = -1;
        class127.field2958 = -1;
        class63.method475(0, false);
        for (int var1 = 0; var1 < 100; var1++) {
            class61.field1298[var1] = null;
        }
        class40.field933 = false;
        class147.field3416 = 0;
        class4.field88 = -1;
        class108.field2554 = 0;
        class109.field2572 = (int) (Math.random() * 30.0D) - 20;
        class64.field1360 = (int) (Math.random() * 100.0D) - 50;
        class151.field3467 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class141.field3269 = (int) (Math.random() * 120.0D) - 60;
        class18.field369 = 0;
        class65.field1401 = (int) (Math.random() * 80.0D) - 40;
        class147.field3410 = 0;
        class55.field1255 = 0;
        class51.field1145 = 0;
        class93.field2189 = (int) (Math.random() * 110.0D) - 55;
        class139.field3224 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class154.field3518[var2] = null;
            class1.field15[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class122.field2846[var3] = null;
        }
        class24.field555 = class154.field3518[2047] = new class13();
        class142.field3305.method507(-68);
        class86.field2022.method507(-126);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class93.field2197[var4][var11][var12] = null;
                }
            }
        }
        class41.field958 = new class69();
        class1.field14 = 0;
        class116.field2645 = 0;
        for (int var5 = 0; var5 < class93.field2196; var5++) {
            class65 var10 = class15.method106((byte) -41, var5);
            if (var10 != null && var10.field1403 == 0) {
                class52.field1177[var5] = 0;
                class18.field371[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class83.field1963.length; var6++) {
            class83.field1963[var6] = -1;
        }
        if (class55.field1233 != -1) {
            class116.method918(class55.field1233, (byte) 49);
        }
        for (class118 var7 = (class118) class18.field363.method107((byte) -121); var7 != null; var7 = (class118) class18.field363.method104(71)) {
            class87.method646(var7, true, (byte) 32);
        }
        class55.field1233 = -1;
        class18.field363 = new class15(8);
        class96.field2267 = false;
        class107.field2523 = null;
        class14.field274 = 0;
        class133.field3131.method804(new int[5], null, 0, false, -1);
        for (int var8 = 0; var8 < 5; var8++) {
            class4.field87[var8] = null;
            class19.field386[var8] = false;
        }
        class133.method1072((byte) -88);
        client.field435 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class154.field3511[var9] = true;
        }
        class141.field3279 = null;
        class61.field1314 = null;
        class75.field1694 = 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)Lke;")
    public static final class74 method965(int arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            method965(-98, (byte) 6, -8);
        }
        class74 var3 = class12.method82(arg0, (byte) 108);
        field2896++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field1688 == null || var3.field1688.length <= arg2) {
            return null;
        } else {
            return var3.field1688[arg2];
        }
    }
}
