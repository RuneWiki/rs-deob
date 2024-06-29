import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lod;")
    public static class101 field68 = class46.method335(-101, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lod;")
    public static class101 field71 = class46.method335(-119, "Ausw-=hlen");

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lod;")
    public static class101 field63 = class46.method335(74, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lod;")
    private static class101 field67 = class46.method335(98, "Take");

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lod;")
    public static class101 field65 = field67;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lod;")
    public static class101 field73 = class46.method335(77, "Neuer Benutzer");

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lqe;")
    public static class116 field64;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljb;")
    public static class64 field77;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method22(byte arg0) {
        field72++;
        int var1 = class25.field655;
        int var2 = class75.field1612;
        int var3 = class28.field751;
        int var4 = class54.field1241;
        int var5 = -33 / ((-arg0 - 73) / 35);
        int var6 = 6116423;
        class38.method275(var2, var4, var1, var3, var6);
        class38.method275(var2 + 1, var4 + 1, var1 - 2, 16, 0);
        class38.method276(var2 + 1, var4 - -18, var1 - 2, var3 + -19, 0);
        class34.field867.method852(class36.field905, var2 + 3, var4 - -14, var6, -1);
        int var7 = class105.field2264;
        int var8 = class40.field947;
        for (int var9 = 0; var9 < class54.field1244; var9++) {
            int var10 = var4 + (class54.field1244 - 1 + -var9) * 15 + 31;
            int var11 = 16777215;
            if (var8 > var2 && var1 + var2 > var8 && var10 - 13 < var7 && var7 < var10 + 3) {
                var11 = 16776960;
            }
            class34.field867.method852(class54.method394(false, var9), var2 + 3, var10, var11, 0);
        }
        class111.method819(class28.field751, class54.field1241, (byte) 106, class25.field655, class75.field1612);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method23(boolean arg0) {
        field63 = null;
        field64 = null;
        field71 = null;
        field67 = null;
        field77 = null;
        if (arg0) {
            field65 = null;
            field73 = null;
            field68 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lia;B)V")
    public static final void method24(class57 arg0, byte arg1) {
        field69++;
        arg0.field1309 = false;
        if (arg0.field1278 != -1) {
            class95 var2 = class8.method39(arg0.field1278, (byte) -127);
            if (var2 == null || var2.field2055 == null) {
                arg0.field1278 = -1;
            } else {
                arg0.field1280++;
                if (var2.field2055.length > arg0.field1318 && arg0.field1280 > var2.field2066[arg0.field1318]) {
                    arg0.field1318++;
                    arg0.field1280 = 1;
                    class52.method377(arg0.field1298, arg0.field1318, (byte) 113, arg0.field1341, var2);
                }
                if (var2.field2055.length <= arg0.field1318) {
                    arg0.field1318 = 0;
                    arg0.field1280 = 0;
                    class52.method377(arg0.field1298, arg0.field1318, (byte) 113, arg0.field1341, var2);
                }
            }
        }
        if (arg1 >= -12) {
            method25(-74);
        }
        if (arg0.field1311 != -1 && arg0.field1337 <= class143.field3305) {
            if (arg0.field1329 < 0) {
                arg0.field1329 = 0;
            }
            int var3 = class52.method376(false, arg0.field1311).field643;
            if (var3 == -1) {
                arg0.field1311 = -1;
            } else {
                class95 var4 = class8.method39(var3, (byte) -128);
                if (var4 == null || var4.field2055 == null) {
                    arg0.field1311 = -1;
                } else {
                    arg0.field1317++;
                    if (var4.field2055.length > arg0.field1329 && var4.field2066[arg0.field1329] < arg0.field1317) {
                        arg0.field1329++;
                        arg0.field1317 = 1;
                        class52.method377(arg0.field1298, arg0.field1329, (byte) 113, arg0.field1341, var4);
                    }
                    if (var4.field2055.length <= arg0.field1329 && (arg0.field1329 < 0 || var4.field2055.length <= arg0.field1329)) {
                        arg0.field1311 = -1;
                    }
                }
            }
        }
        if (arg0.field1300 != -1 && arg0.field1303 <= 1) {
            class95 var5 = class8.method39(arg0.field1300, (byte) -43);
            if (var5.field2044 == 1 && arg0.field1286 > 0 && arg0.field1322 <= class143.field3305 && class143.field3305 > arg0.field1349) {
                arg0.field1303 = 1;
                return;
            }
        }
        if (arg0.field1300 != -1 && arg0.field1303 == 0) {
            class95 var6 = class8.method39(arg0.field1300, (byte) -71);
            if (var6 == null || var6.field2055 == null) {
                arg0.field1300 = -1;
            } else {
                arg0.field1321++;
                if (arg0.field1301 < var6.field2055.length && var6.field2066[arg0.field1301] < arg0.field1321) {
                    arg0.field1321 = 1;
                    arg0.field1301++;
                    class52.method377(arg0.field1298, arg0.field1301, (byte) 113, arg0.field1341, var6);
                }
                if (arg0.field1301 >= var6.field2055.length) {
                    arg0.field1272++;
                    arg0.field1301 -= var6.field2057;
                    if (var6.field2067 <= arg0.field1272) {
                        arg0.field1300 = -1;
                    } else if (arg0.field1301 >= 0 && var6.field2055.length > arg0.field1301) {
                        class52.method377(arg0.field1298, arg0.field1301, (byte) 113, arg0.field1341, var6);
                    } else {
                        arg0.field1300 = -1;
                    }
                }
                arg0.field1309 = var6.field2058;
            }
        }
        if (arg0.field1303 > 0) {
            arg0.field1303--;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method25(int arg0) {
        class39.field941.field1056 = 0;
        class43.field1025 = 0;
        field66++;
        class119.field2624 = true;
        class133.field3043 = 0L;
        class101.field2206 = 0;
        class26.field693 = 0;
        class47.field1109 = 0;
        class50.field1173 = 0;
        class138.field3208 = 0;
        class54.field1232 = 0;
        class95.field2046 = 0;
        class29.field763 = 0;
        class138.field3164 = 0;
        class138.field3157 = 0;
        class31.field796 = 0;
        class130.field2964 = 0;
        class121.field2667 = 0;
        class44.field1061 = 0;
        class78.field1645 = 0;
        class63.field1424 = 0;
        class3.field49 = 0;
        class84.field1825 = 0;
        class101.field2192 = 0;
        class80.field1668 = 0;
        class89.field1933 = 0;
        class26.field660 = 0;
        class108.field2305 = 0;
        class121.field2652 = 0;
        class106.field2276 = 0;
        class23.field557 = 0;
        class40.field960 = 0;
        class93.field1994 = 0;
        class2.field21 = 0;
        class101.field2179 = 0;
        class62.field1381 = 0;
        class87.field1923 = 0;
        class126.field2746 = 0;
        class61.field1354 = 0;
        class11.field178 = 0;
        class155.field3541 = 0;
        class134.field3080 = 0;
        class157.field3616 = 0;
        class158.field3643 = 0;
        class47.field1106 = 0;
        class138.field3174 = 0;
        class132.field3011 = 0;
        class138.field3145 = 0;
        class138.field3194 = 0;
        class153.field3483 = 0;
        class135.field3101 = 0;
        class64.field1439 = 0;
        class106.field2290 = 0;
        class15.field296 = 0;
        class96.field2094 = 0;
        class78.field1635 = 0;
        class48.field1148 = 0;
        class22.field507 = 0;
        class155.field3551 = 0;
        class142.field3263 = 0;
        class48.field1150 = 0;
        class121.field2668 = 0;
        class143.field3300 = 0;
        class15.field307 = 0;
        class29.field767 = 0;
        class152.field3472 = 0;
        class62.field1375 = 0;
        class82.field1793 = 0;
        class101.field2193 = 0;
        class85.field1871 = 0;
        class121.field2672 = 0;
        class13.field273 = 0;
        class140.field3233 = 0;
        class105.field2261 = 0;
        class130.field2969 = 0;
        field76 = 0;
        class24.field586 = 0;
        class121.field2670 = 0;
        class84.field1824 = 0;
        class48.field1145 = 0;
        class143.field3297 = 0;
        class118.field2593 = 0;
        class17.field346 = 0;
        class118.field2591 = 0;
        class94.field2010 = 0;
        class138.field3178 = 0;
        class61.field1363 = 0;
        class11.field224 = 0;
        class94.field2025 = 0;
        class10.field138 = 0;
        class32.field813 = 0;
        class131.field3002 = 0;
        class1.field8 = 0;
        class52.field1188 = 0;
        class121.field2665 = 0;
        class15.field321 = 0;
        class8.field120 = 0;
        class11.field170 = 0;
        class155.field3575 = 0;
        class47.field1124 = 0;
        class15.field333 = 0;
        class121.field2664 = 0;
        class138.field3151 = 0;
        class15.field305 = 0;
        class49.field1160 = 0;
        class99.field2135 = 0;
        class44.field1055 = 0;
        class57.field1319 = 0;
        class98.field2113 = 0;
        class141.field3254 = 0;
        class101.field2184 = 0;
        class11.field166 = 0;
        class92.field1981 = 0;
        client.field473 = 0;
        class106.field2279 = 0;
        class57.field1287 = 0;
        class138.field3192 = 0;
        class152.field3465 = 0;
        class135.field3084 = 0;
        class132.field3013 = 0;
        class54.field1251 = 0;
        class101.field2220 = 0;
        class155.field3519 = 0;
        class101.field2178 = 0;
        class29.field765 = 0;
        class40.field963 = 0;
        client.field489 = 0;
        class98.field2115 = 0;
        class75.field1607 = 0;
        class102.field2248 = 0;
        class101.field2191 = 0;
        class143.field3302 = 0;
        class61.field1365 = 0;
        class28.field737 = 0;
        class25.field631 = 0;
        class80.field1717 = 0;
        class11.field156 = 0;
        class22.field528 = 0;
        class11.field189 = 0;
        class57.field1288 = 0;
        class44.field1042 = 0;
        class11.field180 = 0;
        class15.field324 = 0;
        class92.field1980 = 0;
        class34.field869 = 0;
        class138.field3205 = 0;
        class101.field2234 = 0;
        class105.field2260 = 0;
        class13.field270 = 0;
        class157.field3613 = 0;
        class42.field1008 = 0;
        class43.field1039 = 0;
        class95.field2045 = 0;
        class155.field3547 = 0;
        class134.field3064 = 0;
        class93.field2001 = 0;
        class96.field2089 = 0;
        class138.field3144 = 0;
        class154.field3506 = 0;
        class138.field3172 = 0;
        class86.field1898 = 0;
        class26.field691 = 0;
        class57.field1294 = 0;
        class18.field374 = 0;
        class20.field423 = 0;
        class121.field2676 = 0;
        class43.field1038 = 0;
        class13.field256 = 0;
        class138.field3177 = 0;
        class64.field1449 = 0;
        class17.field353 = 0;
        class158.field3631 = 0;
        class138.field3215 = 0;
        class102.field2244 = 0;
        class131.field2987 = 0;
        class135.field3116 = 0;
        class95.field2060 = 0;
        class121.field2679 = 0;
        class1.field12 = 0;
        class105.field2255 = 0;
        class132.field3027 = 0;
        class131.field2995 = 0;
        class127.field2896 = 0;
        class25.field649 = 0;
        class27.field709 = 0;
        class138.field3162 = 0;
        class11.field188 = 0;
        class145.field3334 = 0;
        class138.field3176 = 0;
        class133.field3045 = 0;
        class22.field516 = 0;
        class48.field1141 = 0;
        class138.field3181 = 0;
        class133.field3042 = 0;
        class101.field2174 = 0;
        class118.field2597 = 0;
        class143.field3296 = 0;
        class17.field352 = 0;
        class142.field3262 = 0;
        class153.field3484 = 0;
        class15.field301 = 0;
        class138.field3154 = 0;
        class156.field3599 = 0;
        class33.field848 = 0;
        class106.field2282 = 0;
        class94.field2022 = 0;
        class95.field2070 = 0;
        class155.field3557 = 0;
        class15.field315 = 0;
        class15.field297 = 0;
        class82.field1794 = 0;
        class135.field3114 = 0;
        class24.field608 = 0;
        class11.field179 = 0;
        class7.field104 = 0;
        class82.field1776 = 0;
        class62.field1376 = 0;
        class127.field2898 = 0;
        class24.field594 = 0;
        class141.field3241 = 0;
        class146.field3349 = 0;
        class40.field977 = 0;
        class108.field2303 = 0;
        class36.field906 = 0;
        class27.field701 = 0;
        class101.field2228 = 0;
        class142.field3274 = 0;
        class120.field2646 = 0;
        class15.field335 = 0;
        class134.field3054 = 0;
        class125.field2728 = 0;
        class32.field818 = 0;
        class17.field349 = 0;
        class96.field2077 = 0;
        class67.field1508 = 0;
        class67.field1513 = 0;
        class34.field882 = 0;
        class28.field739 = 0;
        class94.field2018 = 0;
        class32.field824 = 0;
        class15.field331 = 0;
        class79.field1661 = 0;
        class101.field2197 = 0;
        class106.field2285 = 0;
        class32.field847 = 0;
        class142.field3261 = 0;
        client.field481 = 0;
        class1.field17 = 0;
        class126.field2854 = 0;
        class101.field2199 = 0;
        class140.field3222 = 0;
        class30.field775 = 0;
        class89.field1927 = 0;
        class144.field3312 = 0;
        class126.field2829 = 0;
        class118.field2596 = 0;
        class47.field1131 = 0;
        class89.field1938 = 0;
        class43.field1033 = 0;
        class138.field3153 = 0;
        class147.field3366 = 0;
        class121.field2653 = 0;
        class115.field2558 = 0;
        class2.field24 = 0;
        class101.field2221 = 0;
        class101.field2207 = 0;
        class82.field1796 = 0;
        class121.field2654 = 0;
        class153.field3479 = 0;
        class46.field1074 = 0;
        class144.field3317 = 0;
        class8.field128 = 0;
        class64.field1454 = 0;
        class35.field891 = 0;
        client.field487 = 0;
        class143.field3289 = 0;
        class11.field218 = 0;
        class118.field2592 = 0;
        class11.field154 = 0;
        class129.field2944 = 0;
        class125.field2729 = 0;
        class35.field887 = 0;
        class127.field2888 = 0;
        class47.field1134 = 0;
        class24.field561 = 0;
        class13.field257 = 0;
        class27.field710 = 0;
        class65.field1477 = 0;
        class6.field93 = 0;
        class63.field1423 = 0;
        class49.field1162 = 0;
        class96.field2087 = 0;
        class75.field1609 = 0;
        class46.field1100 = 0;
        class42.field1017 = 0;
        class152.field3474 = 0;
        class156.field3596 = 0;
        class65.field1488 = 0;
        class10.field145 = 0;
        class95.field2036 = 0;
        class126.field2798 = 0;
        class138.field3155 = 0;
        class56.field1258 = 0;
        class97.field2102 = 0;
        class130.field2970 = 0;
        client.field486 = 0;
        class138.field3190 = 0;
        class97.field2104 = 0;
        class121.field2681 = 0;
        class141.field3249 = 0;
        class3.field38 = 0;
        class11.field214 = 0;
        class15.field303 = 0;
        class152.field3464 = 0;
        class127.field2877 = 0;
        class86.field1904 = 0;
        class138.field3189 = 0;
        class140.field3227 = 0;
        class155.field3576 = 0;
        class100.field2158 = 0;
        class20.field427 = 0;
        client.field480 = 0;
        class78.field1646 = 0;
        class15.field337 = 0;
        class94.field2023 = 0;
        class12.field248 = 0;
        class86.field1901 = 0;
        class100.field2155 = 0;
        class10.field150 = 0;
        class11.field213 = 0;
        class15.field336 = 0;
        class11.field197 = 0;
        class93.field1993 = 0;
        class43.field1024 = 0;
        class17.field354 = 0;
        class118.field2589 = 0;
        class36.field909 = 0;
        class89.field1936 = 0;
        class148.field3372 = 0;
        class118.field2590 = 0;
        class132.field3009 = 0;
        class11.field186 = 0;
        class138.field3148 = 0;
        class78.field1627 = 0;
        class11.field165 = 0;
        class40.field975 = 0;
        class15.field318 = 0;
        class61.field1371 = 0;
        class85.field1867 = 0;
        class101.field2202 = 0;
        class7.field114 = 0;
        class106.field2281 = 0;
        class48.field1151 = 0;
        class118.field2601 = 0;
        class129.field2935 = 0;
        class27.field700 = 0;
        class131.field2984 = 0;
        class118.field2594 = 0;
        class118.field2595 = 0;
        class78.field1628 = 0;
        class138.field3193 = 0;
        class73.field1585 = 0;
        class48.field1147 = 0;
        class47.field1123 = 0;
        class82.field1779 = 0;
        class97.field2107 = 0;
        class20.field421 = 0;
        class20.field416 = 0;
        class101.field2226 = 0;
        class26.field685 = 0;
        class137.field3134 = 0;
        class141.field3257 = 0;
        class32.field843 = 0;
        class140.field3230 = 0;
        class98.field2126 = 0;
        class138.field3214 = 0;
        class115.field2517 = 0;
        class36.field920 = 0;
        class101.field2219 = 0;
        class101.field2198 = 0;
        class42.field1023 = 0;
        class41.field989 = 0;
        class23.field534 = 0;
        class132.field3024 = 0;
        class52.field1185 = 0;
        class8.field124 = 0;
        class132.field3026 = 0;
        class82.field1782 = 0;
        class146.field3343 = 0;
        class138.field3161 = 0;
        class134.field3072 = 0;
        class100.field2153 = 0;
        class101.field2183 = 0;
        class8.field129 = 0;
        class82.field1789 = 0;
        class62.field1385 = 0;
        class30.field778 = 0;
        class138.field3180 = 0;
        class101.field2214 = 0;
        class11.field164 = 0;
        class57.field1324 = 0;
        class57.field1275 = 0;
        class31.field802 = 0;
        class42.field1009 = 0;
        class64.field1446 = 0;
        class24.field576 = 0;
        class121.field2659 = 0;
        class46.field1085 = 0;
        class15.field311 = 0;
        class64.field1431 = 0;
        class36.field910 = 0;
        class134.field3066 = 0;
        class25.field637 = 0;
        class1.field11 = 0;
        class40.field964 = 0;
        class3.field39 = 0;
        class154.field3508 = 0;
        class97.field2105 = 0;
        class12.field237 = 0;
        class86.field1903 = 0;
        class138.field3185 = 0;
        class147.field3364 = 0;
        class115.field2541 = 0;
        class86.field1897 = 0;
        class17.field347 = 0;
        class138.field3201 = 0;
        class18.field375 = 0;
        class57.field1320 = 0;
        class101.field2233 = 0;
        class93.field1987 = 0;
        class33.field856 = 0;
        class75.field1598 = 0;
        class47.field1104 = 0;
        class18.field371 = 0;
        class135.field3100 = 0;
        class101.field2190 = 0;
        class63.field1406 = 0;
        class78.field1642 = 0;
        class137.field3127 = 0;
        class120.field2636 = 0;
        class82.field1786 = 0;
        class73.field1582 = 0;
        class18.field378 = 0;
        class119.field2622 = 0;
        class138.field3187 = 0;
        class31.field795 = 0;
        class126.field2839 = 0;
        class127.field2874 = 0;
        class105.field2267 = 0;
        class99.field2140 = 0;
        class30.field790 = 0;
        class97.field2098 = 0;
        class118.field2598 = 0;
        class111.field2377 = 0;
        class101.field2211 = 0;
        class53.field1204 = 0;
        class153.field3490 = 0;
        class111.field2380 = 0;
        class11.field203 = 0;
        class134.field3068 = 0;
        class8.field123 = 0;
        class15.field304 = 0;
        class47.field1112 = 0;
        class101.field2201 = 0;
        class61.field1368 = 0;
        class138.field3186 = 0;
        class39.field936 = 0;
        class18.field387 = 0;
        class140.field3221 = 0;
        class146.field3341 = 0;
        class101.field2222 = 0;
        class65.field1485 = 0;
        class64.field1432 = 0;
        class100.field2164 = 0;
        class153.field3491 = 0;
        class146.field3346 = 0;
        class13.field268 = 0;
        class26.field697 = 0;
        class143.field3281 = 0;
        class131.field2985 = 0;
        class47.field1133 = 0;
        class67.field1498 = 0;
        class112.field2412 = 0;
        class18.field372 = 0;
        class140.field3225 = 0;
        class101.field2232 = 0;
        class67.field1497 = 0;
        class138.field3179 = 0;
        class20.field428 = 0;
        class17.field355 = 0;
        class132.field3008 = 0;
        class64.field1438 = 0;
        class36.field912 = 0;
        class118.field2609 = 0;
        class83.field1811 = 0;
        class53.field1203 = 0;
        class126.field2753 = 0;
        class138.field3169 = 0;
        class50.field1174 = 0;
        class40.field971 = 0;
        class80.field1714 = 0;
        class115.field2538 = 0;
        class41.field982 = 0;
        class33.field851 = 0;
        class115.field2520 = 0;
        class13.field263 = 0;
        class84.field1822 = 0;
        class12.field247 = 0;
        class102.field2239 = arg0;
        class53.field1200 = 0;
        class18.field386 = 0;
        class67.field1500 = 0;
        class42.field1022 = 0;
        class48.field1137 = 0;
        class41.field987 = 0;
        class156.field3598 = 0;
        class39.field931 = 0;
        class49.field1155 = 0;
        class118.field2600 = 0;
        class47.field1136 = 0;
        class15.field312 = 0;
        class53.field1199 = 0;
        class132.field3004 = 0;
        class15.field295 = 0;
        class62.field1383 = 0;
        class132.field3020 = 0;
        class84.field1835 = 0;
        class134.field3065 = 0;
        class105.field2271 = 0;
        class138.field3160 = 0;
        class154.field3512 = 0;
        class40.field972 = 0;
        class134.field3077 = 0;
        class24.field611 = 0;
        class101.field2175 = 0;
        class138.field3217 = 0;
        class142.field3266 = 0;
        class121.field2661 = 0;
        client.field483 = 0;
        class100.field2170 = 0;
        class118.field2587 = 0;
        class121.field2677 = 0;
        class35.field890 = 0;
        class24.field606 = 0;
        class100.field2167 = 0;
        class101.field2187 = 0;
        class138.field3166 = 0;
        class57.field1348 = 0;
        class49.field1153 = 0;
        class96.field2080 = 0;
        class31.field804 = 0;
        class64.field1462 = 0;
        class57.field1274 = 0;
        class20.field424 = 0;
        class82.field1785 = 0;
        class61.field1366 = 0;
        class26.field671 = 0;
        class20.field422 = 0;
        class138.field3211 = 0;
        class29.field761 = 0;
        class15.field322 = 0;
        class121.field2687 = 0;
        class121.field2683 = 0;
        class101.field2180 = 0;
        class126.field2755 = 0;
        class95.field2059 = 0;
        class108.field2307 = 0;
        class46.field1080 = 0;
        class93.field1996 = 0;
        class153.field3480 = 0;
        class138.field3170 = 0;
        class138.field3188 = 0;
        class129.field2942 = 0;
        class102.field2252 = 0;
        class7.field96 = 0;
        class20.field420 = 0;
        class26.field696 = 0;
        class41.field984 = 0;
        class22.field494 = 0;
        class33.field855 = 0;
        class67.field1499 = 0;
        class118.field2586 = 0;
        class54.field1223 = 0;
        class138.field3152 = 0;
        class11.field223 = 0;
        class121.field2671 = 0;
        class137.field3138 = 0;
        class121.field2669 = 0;
        class153.field3486 = 0;
        class125.field2722 = 0;
        class11.field216 = 0;
        class101.field2200 = 0;
        class46.field1078 = 0;
        class134.field3057 = 0;
        class52.field1181 = 0;
        class22.field495 = 0;
        class95.field2069 = 0;
        class15.field300 = 0;
        class121.field2682 = 0;
        class12.field239 = 0;
        class54.field1231 = 0;
        class15.field299 = 0;
        class27.field703 = 0;
        class121.field2675 = 0;
        class138.field3167 = 0;
        class78.field1649 = 0;
        class121.field2657 = 0;
        class57.field1293 = 0;
        class119.field2621 = 0;
        class8.field119 = 0;
        class11.field174 = 0;
        class126.field2783 = 0;
        class153.field3487 = 0;
        class6.field80 = 0;
        class26.field689 = 0;
        client.field479 = 0;
        class8.field116 = 0;
        class101.field2196 = 0;
        class138.field3202 = 0;
        class24.field591 = 0;
        class133.field3053 = 0;
        class18.field395 = 0;
        class138.field3147 = 0;
        class131.field3001 = 0;
        client.field484 = 0;
        class75.field1603 = 0;
        class127.field2879 = 0;
        class39.field937 = 0;
        class121.field2685 = 0;
        class47.field1122 = 0;
        class141.field3259 = 0;
        class101.field2229 = 0;
        class22.field506 = 0;
        class78.field1636 = 0;
        class146.field3351 = 0;
        class132.field3016 = 0;
        class47.field1114 = 0;
        class121.field2662 = 0;
        class42.field1015 = 0;
        class132.field3007 = 0;
        class111.field2385 = 0;
        class11.field162 = 0;
        class62.field1379 = 0;
        class96.field2085 = 0;
        class36.field914 = 0;
        class15.field326 = 0;
        class62.field1373 = 0;
        class155.field3573 = 0;
        class25.field647 = 0;
        class101.field2216 = 0;
        class11.field206 = 0;
        class20.field417 = 0;
        class36.field918 = 0;
        class155.field3522 = 0;
        class141.field3237 = 0;
        class27.field713 = 0;
        class34.field874 = 0;
        class134.field3069 = 0;
        class132.field3014 = 0;
        class6.field84 = 0;
        class11.field169 = 0;
        class87.field1917 = 0;
        class89.field1941 = 0;
        class11.field211 = 0;
        class82.field1795 = 0;
        class158.field3629 = 0;
        class126.field2768 = 0;
        class48.field1146 = 0;
        class52.field1191 = 0;
        class157.field3622 = 0;
        class127.field2876 = 0;
        class18.field394 = 0;
        class11.field217 = 0;
        class26.field662 = 0;
        class155.field3561 = 0;
        class127.field2889 = 0;
        class101.field2230 = 0;
        class115.field2525 = 0;
        class47.field1132 = 0;
        class158.field3638 = 0;
        class108.field2304 = 0;
        class11.field230 = 0;
        class11.field210 = 0;
        class41.field980 = 0;
        class57.field1340 = 0;
        class138.field3158 = 0;
        class67.field1507 = 0;
        class134.field3079 = 0;
        class20.field429 = 0;
        class78.field1638 = 0;
        class100.field2160 = 0;
        class17.field361 = 0;
        class125.field2733 = 0;
        class90.field1949 = 0;
        class155.field3571 = 0;
        class13.field279 = 0;
        class11.field220 = 0;
        class145.field3333 = 0;
        class121.field2660 = 0;
        class25.field632 = 0;
        class138.field3206 = 0;
        class101.field2203 = 0;
        class24.field575 = 0;
        class67.field1505 = 0;
        class146.field3342 = 0;
        class95.field2065 = 0;
        class149.field3401 = 0;
        class94.field2019 = 0;
        class146.field3344 = 0;
        class134.field3075 = 0;
        class32.field838 = 0;
        class65.field1472 = 0;
        class20.field419 = 0;
        class25.field636 = 0;
        class82.field1788 = 0;
        class134.field3055 = 0;
        class54.field1248 = 0;
        class126.field2836 = 0;
        class47.field1103 = 0;
        class67.field1510 = 0;
        class105.field2263 = 0;
        class75.field1602 = 0;
        class57.field1277 = 0;
        class121.field2658 = 0;
        class132.field3017 = 0;
        class65.field1478 = 0;
        class11.field183 = 0;
        class78.field1637 = 0;
        class138.field3210 = 0;
        class73.field1589 = 0;
        class126.field2842 = 0;
        class102.field2249 = 0;
        class27.field702 = 0;
        class141.field3253 = 0;
        class54.field1243 = 0;
        class99.field2141 = 0;
        class12.field244 = 0;
        class40.field978 = 0;
        client.field476 = 0;
        class1.field14 = 0;
        class149.field3390 = 0;
        class83.field1806 = 0;
        class31.field799 = 0;
        class94.field2026 = 0;
        class106.field2284 = 0;
        class61.field1353 = 0;
        field70 = 0;
        class155.field3559 = 0;
        field66 = 0;
        class41.field986 = 0;
        class32.field814 = 0;
        class54.field1218 = 0;
        client.field477 = 0;
        class140.field3223 = 0;
        class82.field1791 = 0;
        class155.field3544 = 0;
        class95.field2039 = 0;
        class95.field2062 = 0;
        class108.field2308 = 0;
        class149.field3393 = 0;
        class11.field157 = 0;
        class62.field1387 = 0;
        class24.field604 = 0;
        class26.field682 = 0;
        class131.field2997 = 0;
        class121.field2686 = 0;
        class146.field3340 = 0;
        class153.field3482 = 0;
        class121.field2680 = 0;
        class153.field3493 = 0;
        class29.field772 = 0;
        class20.field430 = 0;
        class138.field3196 = 0;
        class126.field2743 = 0;
        class41.field985 = 0;
        class33.field854 = 0;
        class62.field1386 = 0;
        class135.field3087 = 0;
        class135.field3110 = 0;
        class78.field1632 = 0;
        class52.field1190 = 0;
        client.field478 = 0;
        class17.field344 = 0;
        class47.field1117 = 0;
        class144.field3309 = 0;
        class15.field291 = 0;
        class54.field1237 = 0;
        class111.field2368 = 0;
        class143.field3303 = 0;
        class99.field2134 = 0;
        class146.field3350 = 0;
        class150.field3425 = 0;
        field72 = 0;
        class99.field2133 = 0;
        class11.field207 = 0;
        class24.field560 = 0;
        class85.field1855 = 0;
        class11.field192 = 0;
        class143.field3288 = 0;
        class2.field25 = 0;
        class18.field377 = 0;
        class115.field2535 = 0;
        class18.field396 = 0;
        class82.field1784 = 0;
        class125.field2727 = 0;
        class30.field788 = 0;
        client.field488 = 0;
        class101.field2194 = 0;
        class115.field2557 = 0;
        class115.field2549 = 0;
        class152.field3471 = 0;
        class85.field1851 = 0;
        class129.field2940 = 0;
        class64.field1445 = 0;
        class148.field3376 = 0;
        class99.field2138 = 0;
        class101.field2212 = 0;
        class40.field962 = 0;
        class48.field1140 = 0;
        class101.field2177 = 0;
        class146.field3345 = 0;
        class105.field2269 = 0;
        class67.field1514 = 0;
        class18.field385 = 0;
        class138.field3191 = 0;
        class11.field221 = 0;
        class11.field225 = 0;
        class18.field379 = 0;
        class134.field3061 = 0;
        class49.field1163 = 0;
        class61.field1360 = 0;
        class138.field3171 = 0;
        class131.field2989 = 0;
        class138.field3165 = 0;
        class138.field3163 = 0;
        class138.field3204 = 0;
        class6.field90 = 0;
        class44.field1058 = 0;
        class64.field1450 = 0;
        class57.field1344 = 0;
        class26.field688 = 0;
        class78.field1621 = 0;
        class48.field1149 = 0;
        class96.field2079 = 0;
        class11.field184 = 0;
        class65.field1490 = 0;
        class11.field155 = 0;
        class101.field2182 = 0;
        class126.field2840 = 0;
        class155.field3530 = 0;
        class90.field1945 = 0;
        class15.field319 = 0;
        class40.field946 = 0;
        class89.field1935 = 0;
        class154.field3510 = 0;
        class82.field1797 = 0;
        class134.field3067 = 0;
        class138.field3143 = 0;
        class11.field195 = 0;
        class95.field2038 = 0;
        class61.field1364 = 0;
        class64.field1434 = 0;
        class126.field2863 = 0;
        class82.field1801 = 0;
        class152.field3475 = 0;
        class127.field2893 = 0;
        class12.field252 = 0;
        class40.field955 = 0;
        class78.field1634 = 0;
        class84.field1834 = 0;
        class24.field563 = 0;
        class149.field3382 = 0;
        class11.field182 = 0;
        client.field474 = 0;
        class52.field1193 = 0;
        class11.field209 = 0;
        class85.field1892 = 0;
        class106.field2278 = 0;
        class23.field540 = 0;
        class145.field3337 = 0;
        class105.field2270 = 0;
        class138.field3184 = 0;
        class11.field177 = 0;
        class138.field3207 = 0;
        class11.field181 = 0;
        class101.field2209 = 0;
        class143.field3294 = 0;
        class42.field1021 = 0;
        class44.field1046 = 0;
        class50.field1175 = 0;
        class85.field1880 = 0;
        class24.field562 = 0;
        class98.field2121 = 0;
        class54.field1233 = 0;
        class138.field3212 = 0;
        class138.field3200 = 0;
        class28.field733 = 0;
        class120.field2641 = 0;
        class101.field2218 = 0;
        class48.field1143 = 0;
        class42.field1007 = 0;
        class121.field2663 = 0;
        class95.field2071 = 0;
        class78.field1639 = 0;
        class67.field1496 = 0;
        class97.field2109 = 0;
        class47.field1116 = 0;
        class35.field886 = 0;
        class26.field690 = 0;
        class20.field433 = 0;
        class119.field2620 = 0;
        class153.field3492 = 0;
        class47.field1115 = 0;
        class153.field3489 = 0;
        class78.field1633 = 0;
        class152.field3477 = 0;
        class156.field3600 = 0;
        class52.field1184 = 0;
        class138.field3159 = 0;
        class11.field196 = 0;
        class96.field2074 = 0;
        class120.field2649 = 0;
        class137.field3129 = 0;
        class63.field1398 = 0;
        class86.field1900 = 0;
        class155.field3526 = 0;
        field75 = 0;
        class119.field2623 = 0;
        class85.field1859 = 0;
        class64.field1447 = 0;
        class11.field193 = 0;
        class29.field762 = 0;
        class54.field1230 = 0;
        class15.field292 = 0;
        class101.field2186 = 0;
        class25.field629 = 0;
        class48.field1152 = 0;
        class131.field2992 = 0;
        class130.field2968 = 0;
        class25.field640 = 0;
        class101.field2215 = 0;
        class101.field2225 = 0;
        class155.field3565 = 0;
        class133.field3041 = 0;
        class36.field907 = 0;
        class152.field3468 = 0;
        class36.field908 = 0;
        field69 = 0;
        class102.field2246 = 0;
        class36.field915 = true;
        class105.method757(arg0 ^ 0xFFFF92AE);
        class20.field435 = 0;
        class54.field1244 = 0;
        class31.field801 = 0;
        class15.field330 = false;
        class120.field2638 = 0;
        class31.field797 = -1;
        class97.field2110 = -1;
        class44.field1048 = -1;
        class17.field364.field3175 = 0;
        class54.field1228 = 0;
        class118.field2611.field3175 = 0;
        class29.field774 = -1;
        class25.method201(arg0 ^ 0x1741, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class79.field1653[var1] = null;
        }
        class141.field3242 = 0;
        class150.field3442 = 0;
        class97.field2100 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class57.field1314 = (int) (Math.random() * 110.0D) - 55;
        class130.field2973 = 0;
        class40.field959 = 0;
        class106.field2292 = false;
        class49.field1158 = 0;
        class15.field317 = (int) (Math.random() * 100.0D) - 50;
        class32.field842 = 0;
        class152.field3470 = 0;
        class155.field3563 = (int) (Math.random() * 80.0D) - 40;
        class79.field1652 = (int) (Math.random() * 120.0D) - 60;
        class143.field3290 = 0;
        class142.field3275 = -1;
        class141.field3260 = (int) (Math.random() * 30.0D) - 20;
        for (int var2 = 0; var2 < 2048; var2++) {
            class94.field2032[var2] = null;
            class82.field1774[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class18.field376[var3] = null;
        }
        class82.field1778 = class94.field2032[2047] = new class13();
        class86.field1902.method525(true);
        class83.field1804.method525(true);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class54.field1219[var4][var11][var12] = null;
                }
            }
        }
        class17.field345 = new class78();
        class101.field2205 = 0;
        class67.field1502 = 0;
        for (int var5 = 0; var5 < class154.field3509; var5++) {
            class35 var10 = class129.method999(arg0 ^ 0xFFFFFFFA, var5);
            if (var10 != null && var10.field888 == 0) {
                class102.field2243[var5] = 0;
                class63.field1388[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class87.field1916.length; var6++) {
            class87.field1916[var6] = -1;
        }
        if (class62.field1382 != -1) {
            class26.method208((byte) 91, class62.field1382);
        }
        for (class133 var7 = (class133) class96.field2092.method1142((byte) -96); var7 != null; var7 = (class133) class96.field2092.method1136(arg0 ^ 0xFFFFDAF3)) {
            class54.method387(true, var7, (byte) -117);
        }
        class62.field1382 = -1;
        class96.field2092 = new class143(8);
        class30.field776 = null;
        class15.field330 = false;
        class54.field1244 = 0;
        class89.field1942.method598(null, new int[5], -1, -30739, false);
        for (int var8 = 0; var8 < 8; var8++) {
            class97.field2106[var8] = null;
            class26.field659[var8] = false;
        }
        class29.method231((byte) 16);
        class27.field729 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class129.field2938[var9] = true;
        }
        class119.field2631 = null;
        class156.field3587 = null;
        class142.field3279 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method26(int arg0) {
        field76++;
        for (int var1 = -1; var1 < class150.field3442; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class143.field3285[var1];
            }
            class13 var6 = class94.field2032[var5];
            if (var6 != null && var6.field1282 > 0) {
                var6.field1282--;
                if (var6.field1282 == 0) {
                    var6.field1305 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class40.field959; var2++) {
            int var3 = class73.field1586[var2];
            class62 var4 = class18.field376[var3];
            if (var4 != null && var4.field1282 > 0) {
                var4.field1282--;
                if (var4.field1282 == 0) {
                    var4.field1305 = null;
                }
            }
        }
        if (arg0 != -25561) {
            method28((byte) -1, -109);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public static final void method27(int arg0, int arg1, int arg2) {
        field70++;
        if (arg2 == 0 && class31.field801 == 2) {
            class82.method597(class130.field2965 * 2, (class97.field2101 - class75.field1597 << 7) + class126.field2870, (byte) -118, (class40.field961 - class56.field1260 << 7) + class54.field1245);
            if (class121.field2678 > -1 && class143.field3305 % 20 < 10) {
                class154.field3507[0].method937(class121.field2678 + arg0 - 12, class150.field3437 + arg1 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Z")
    public static final boolean method28(byte arg0, int arg1) {
        field75++;
        if (arg0 != 111) {
            method27(46, 81, -47);
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
