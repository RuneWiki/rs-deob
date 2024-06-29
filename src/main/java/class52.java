import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1284 = 0;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lhb;")
    private static class44 field1291 = class102.method810("Verbinde mit Server)3)3)3", -28606);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lhb;")
    private static class44 field1292 = class102.method810("Freunde", -28606);

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lhb;")
    private static class44 field1296 = class102.method810("Entfernen", -28606);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lhb;")
    private static class44 field1293 = class102.method810("gelb:", -28606);

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[Lhb;")
    public static class44[] field1300 = new class44[200];

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lhb;")
    private static class44 field1289 = class102.method810("Unable to find ", -28606);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lhb;")
    public static class44 field1295 = field1289;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 4)
    public static final void method492(byte arg0) {
        int var1 = -112 / ((-arg0 - 44) / 51);
        field1297++;
        class105.field2676.method335((byte) 106);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[B", line = 27)
    public static final synchronized byte[] method493(int arg0, int arg1) {
        field1286++;
        if (arg1 == 100 && class40.field904 > 0) {
            byte[] var2 = class88.field2229[--class40.field904];
            class88.field2229[class40.field904] = null;
            return var2;
        } else if (arg1 == 5000 && class100.field2539 > 0) {
            byte[] var3 = class14.field278[--class100.field2539];
            class14.field278[class100.field2539] = null;
            return var3;
        } else if (arg0 != 0) {
            return null;
        } else if (arg1 == 30000 && class101.field2568 > 0) {
            byte[] var4 = class74.field1870[--class101.field2568];
            class74.field1870[class101.field2568] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)I", line = 72)
    public static final int method494(int arg0, int arg1, int arg2, int arg3) {
        field1288++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        if (arg2 != 7) {
            method496((byte) 37);
        }
        if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIILhb;Lhb;)V", line = 114)
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, class44 arg5, class44 arg6) {
        field1299++;
        if (class71.field1744 < 500) {
            if (arg5.method414((byte) 52) <= 0) {
                class64.field1625[class71.field1744] = arg6;
            } else {
                class64.field1625[class71.field1744] = class117.method903(new class44[] { arg6, class16.field318, arg5 }, false);
            }
            class62.field1568[class71.field1744] = arg1;
            class96.field2456[class71.field1744] = arg3;
            class120.field2946[class71.field1744] = arg0;
            class35.field847[class71.field1744] = arg2;
            class71.field1744++;
        }
        if (arg4 != 1000) {
            method493(22, -55);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 142)
    public static final void method496(byte arg0) {
        class9.field193 = class109.field2743;
        class19.field422 = class86.field2191;
        class61.field1541 = class9.field184;
        class88.field2241 = class110.field2748;
        class107.field2700 = class98.field2490;
        class101.field2560 = class80.field2040;
        class15.field297 = class21.field436;
        class33.field785 = class78.field1971;
        class44.field1114 = class113.field2784;
        class2.field49 = class43.field1017;
        class44.field1118 = client.field385;
        class44.field1099 = class104.field2660;
        class75.field1897 = class94.field2377;
        class33.field787 = class120.field2929;
        class48.field1194 = class127.field3062;
        class86.field2187 = class80.field2014;
        class128.field3068 = class82.field2121;
        class64.field1631 = class22.field486;
        class107.field2704 = class46.field1145;
        class53.field1307 = class78.field1979;
        class75.field1895 = class111.field2769;
        class62.field1570 = class121.field2956;
        class94.field2401 = class107.field2709;
        field1285++;
        class100.field2549 = class13.field256;
        class85.field2164 = class102.field2610;
        class44.field1115 = class104.field2667;
        class43.field1003 = class41.field946;
        class77.field1941 = class100.field2517;
        class62.field1583 = class48.field1187;
        class82.field2112 = class27.field653;
        class61.field1559 = class9.field189;
        class42.field957 = class120.field2926;
        class42.field968 = class16.field328;
        class107.field2717 = class97.field2477;
        class69.field1711 = class63.field1600;
        class118.field2909 = class102.field2604;
        class75.field1908 = class94.field2377;
        class105.field2692 = class107.field2716;
        class82.field2107 = class96.field2438;
        class78.field1970 = class95.field2426;
        class44.field1044 = client.field385;
        class44.field1067 = class104.field2667;
        class43.field1029 = class94.field2403;
        class107.field2712 = class85.field2173;
        class15.field302 = class25.field581;
        class42.field960 = class89.field2278;
        class28.field667 = class69.field1721;
        class11.field211 = class18.field363;
        class129.field3088 = class44.field1106;
        class118.field2905 = class131.field3150;
        class98.field2495 = class62.field1581;
        class44.field1094 = client.field385;
        class86.field2194 = class63.field1609;
        class44.field1105 = class15.field280;
        class113.field2782 = class46.field1147;
        class94.field2386 = class2.field55;
        class44.field1081 = class121.field2959;
        class102.field2609 = class125.field3028;
        class102.field2598 = class28.field661;
        class101.field2559 = class11.field218;
        class13.field250 = class122.field2991;
        class94.field2400 = class89.field2293;
        class57.field1483 = class116.field2837;
        class118.field2892 = class96.field2429;
        class95.field2424 = class61.field1564;
        class44.field1084 = class109.field2734;
        class92.field2351 = class118.field2876;
        class72.field1754 = class103.field2624;
        class47.field1168 = class53.field1326;
        class44.field1079 = class61.field1538;
        class16.field318 = class90.field2303;
        class74.field1887 = class5.field131;
        class9.field183 = field1293;
        class44.field1085 = class121.field2959;
        class120.field2937 = class22.field457;
        class111.field2764 = class55.field1395;
        class110.field2754 = class21.field435;
        class82.field2095 = class27.field624;
        class42.field976 = class117.field2866;
        class19.field410 = class51.field1278;
        class121.field2951 = class71.field1746;
        class129.field3089 = class125.field3034;
        class62.field1574 = class4.field101;
        class4.field102 = class129.field3107;
        class13.field231 = class61.field1562;
        class44.field1052 = client.field385;
        class1.field3 = class130.field3117;
        class44.field1109 = client.field385;
        class55.field1403 = class100.field2537;
        class129.field3090 = class113.field2778;
        class11.field209 = field1292;
        class121.field2971 = class19.field415;
        class44.field1048 = client.field385;
        class1.field9 = class95.field2427;
        class90.field2302 = class97.field2478;
        class9.field188 = class53.field1310;
        class98.field2487 = class2.field46;
        class109.field2744 = class5.field123;
        class44.field1057 = client.field385;
        class63.field1612 = class80.field2000;
        class104.field2658 = class103.field2642;
        class11.field208 = class84.field2138;
        if (arg0 <= 73) {
            method497((byte) -113);
        }
        class44.field1068 = client.field385;
        class47.field1174 = class81.field2077;
        class88.field2249 = class92.field2346;
        class21.field433 = class71.field1747;
        class36.field857 = class130.field3115;
        class104.field2659 = class25.field589;
        class66.field1672 = class72.field1782;
        class62.field1585 = class103.field2630;
        class101.field2582 = class118.field2912;
        class89.field2280 = class127.field3056;
        class63.field1590 = class102.field2595;
        class15.field287 = class67.field1692;
        class117.field2853 = class81.field2058;
        class34.field836 = class43.field982;
        class36.field864 = class125.field3021;
        class86.field2195 = field1291;
        class44.field1059 = client.field385;
        class93.field2368 = class121.field2969;
        class85.field2158 = class9.field186;
        class77.field1938 = class110.field2752;
        class27.field651 = class47.field1162;
        class41.field945 = class78.field1963;
        class44.field1049 = class121.field2959;
        class9.field194 = class116.field2846;
        class40.field909 = class31.field767;
        class122.field2979 = class113.field2778;
        class95.field2419 = class13.field253;
        class89.field2262 = class122.field2987;
        class44.field1073 = class66.field1676;
        class51.field1281 = class125.field3031;
        class102.field2607 = class131.field3199;
        class62.field1582 = class103.field2630;
        class25.field592 = class125.field3026;
        class101.field2561 = class118.field2912;
        class130.field3111 = class51.field1277;
        class93.field2364 = client.field365;
        class44.field1111 = client.field385;
        class13.field247 = class79.field1986;
        class44.field1041 = client.field385;
        class4.field106 = class13.field246;
        class64.field1636 = class13.field249;
        class127.field3061 = class55.field1346;
        class2.field77 = class67.field1694;
        class42.field975 = class55.field1406;
        class62.field1573 = class4.field101;
        class44.field1034 = client.field385;
        class5.field126 = class64.field1641;
        class101.field2554 = class118.field2912;
        class81.field2092 = class41.field944;
        class19.field411 = class72.field1765;
        class4.field109 = class49.field1215;
        class44.field1095 = class61.field1552;
        class69.field1714 = class117.field2850;
        client.field371 = class66.field1657;
        class63.field1603 = class128.field3083;
        class98.field2483 = class110.field2757;
        class84.field2145 = class47.field1175;
        class53.field1321 = class89.field2277;
        class125.field3037 = class75.field1904;
        class44.field1054 = class103.field2630;
        class72.field1779 = class53.field1330;
        class82.field2117 = class86.field2201;
        class44.field1116 = client.field385;
        class44.field1036 = client.field385;
        class131.field3192 = class74.field1888;
        class84.field2152 = class100.field2520;
        class41.field921 = class81.field2083;
        class120.field2923 = class92.field2328;
        class55.field1405 = class13.field260;
        class107.field2725 = class93.field2362;
        class75.field1912 = class9.field191;
        class121.field2972 = class53.field1323;
        class41.field926 = class89.field2275;
        class41.field940 = class77.field1929;
        class82.field2114 = class80.field2027;
        class88.field2248 = class15.field279;
        class128.field3072 = class84.field2155;
        class44.field1093 = class34.field822;
        class66.field1668 = class107.field2726;
        class19.field405 = class18.field362;
        class128.field3075 = class46.field1148;
        class79.field1985 = class116.field2848;
        class39.field874 = class111.field2767;
        class66.field1648 = class122.field2982;
        class19.field399 = class55.field1376;
        class44.field1077 = client.field385;
        class9.field182 = class88.field2244;
        class44.field1087 = client.field385;
        class84.field2151 = class39.field880;
        class51.field1253 = class95.field2428;
        class101.field2555 = class72.field1761;
        class15.field291 = class90.field2294;
        class34.field829 = class88.field2234;
        class125.field3023 = class61.field1558;
        field1295 = class96.field2431;
        class1.field25 = class96.field2442;
        class46.field1138 = class96.field2434;
        class94.field2396 = class107.field2709;
        class22.field453 = class48.field1205;
        class4.field104 = class15.field303;
        class93.field2372 = class103.field2629;
        class44.field1033 = client.field385;
        class102.field2613 = class28.field661;
        class35.field846 = class64.field1629;
        class92.field2348 = class33.field806;
        class85.field2184 = class98.field2494;
        class44.field1032 = class78.field1967;
        class62.field1572 = class103.field2630;
        class92.field2336 = field1296;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)Lee;", line = 421)
    public static final class30 method497(byte arg0) {
        field1294++;
        if (arg0 >= -122) {
            return null;
        } else {
            class30 var1 = new class30(class84.field2133, class41.field941, class63.field1607, class117.field2861, class84.field2147);
            class113.method865(false);
            return var1;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 441)
    public static void method498(int arg0) {
        field1289 = null;
        if (arg0 <= 40) {
            field1300 = null;
        }
        field1293 = null;
        field1296 = null;
        field1292 = null;
        field1300 = null;
        field1291 = null;
        field1295 = null;
    }
}
