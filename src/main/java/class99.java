import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class99 extends class29 {

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "Lwb;")
    public static class130 field2392 = class26.method212("p12_full", -32376);

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "[I")
    public static int[] field2390 = new int[500];

    @OriginalMember(owner = "client!qc", name = "ob", descriptor = "Lwb;")
    public static class130 field2396 = class26.method212("Versteckt", -32376);

    @OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
    public static int field2401 = -1;

    @OriginalMember(owner = "client!qc", name = "sb", descriptor = "Lwb;")
    public static class130 field2400 = class26.method212("backbase2", -32376);

    @OriginalMember(owner = "client!qc", name = "qb", descriptor = "Lwb;")
    private static class130 field2398 = class26.method212("Login attempts exceeded)3", -32376);

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Lwb;")
    public static class130 field2387 = field2398;

    @OriginalMember(owner = "client!qc", name = "wb", descriptor = "[Luc;")
    public static class121[] field2404 = new class121[4];

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "B")
    public byte field2386;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!qc", name = "nb", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!qc", name = "rb", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!qc", name = "ub", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "Lk;")
    public static class60 field2384;

    @OriginalMember(owner = "client!qc", name = "pb", descriptor = "Lk;")
    public static class60 field2397;

    @OriginalMember(owner = "client!qc", name = "vb", descriptor = "Lk;")
    public static class60 field2403;

    @OriginalMember(owner = "client!qc", name = "lb", descriptor = "Lmc;")
    public class75 field2393;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILfe;Lwb;)I", line = 5)
    public static final int method735(int arg0, class36 arg1, class130 arg2) {
        if (arg0 < 13) {
            method735(-93, null, null);
        }
        int var3 = arg1.field1057;
        field2381++;
        arg1.method332(arg2.field3079, -50);
        arg1.field1057 += class88.field2103.method1(-107, arg1.field1057, 0, arg1.field1067, arg2.field3079, arg2.field3081);
        return arg1.field1057 - var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V", line = 28)
    public static final void method736(int arg0, boolean arg1) {
        field2395++;
        if (class45.field1207 == null) {
            return;
        }
        try {
            class36 var2 = new class36(4);
            var2.method330(-1, arg1 ? 2 : 3);
            var2.method339(0, -176481232);
            class45.field1207.method145(0, 4, 0, var2.field1067);
        } catch (IOException var5) {
            try {
                class45.field1207.method148(18);
            } catch (Exception var4) {
            }
            class45.field1207 = null;
            class29.field817++;
        }
        int var3 = -128 % ((arg0 + 42) / 63);
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V", line = 57)
    public static final void method737(int arg0) {
        field2389++;
        class2.method8(-94);
        class33.method261(-3);
        class115.method881(192);
        class22.method196((byte) -72);
        class116.method900(-117);
        class37.method378(0);
        class9.method71(-13871);
        class90.method665(10052);
        class95.method710((byte) 83);
        class10.method81(-121);
        if (arg0 != -28464) {
            method741(null, false);
        }
        client.method169((byte) -127);
        class72.method569(arg0 + 28466);
        ((class6) class12.field362).method47(0);
        class123.field2996.method495(-110);
        class83.field1952.method495(-122);
        class24.field734.method495(arg0 + 28351);
        class27.field775.method495(-110);
        class64.field1634.method495(-123);
        class29.field802.method495(-111);
        class79.field1909.method495(-118);
        class31.field864.method495(-118);
        class130.field3151.method495(-116);
        class20.field587.method495(-128);
        class116.field2856.method495(-120);
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V", line = 91)
    public static final void method738(int arg0) {
        field2394++;
        class120.field2944 = true;
        class109.field2653 = 0;
        class92.field2209 = 0;
        class36.field1054 = 0;
        class120.field2923 = 0;
        class27.field779 = 0;
        class88.field2081 = 0;
        class33.field918 = 0;
        class7.field245 = 0;
        class101.field2425 = 0;
        class116.field2871 = 0;
        class36.field1028 = 0;
        class65.field1650 = 0;
        class101.field2439 = 0;
        class58.field1456 = 0;
        class54.field1410 = 0;
        class23.field648 = 0;
        class109.field2655 = 0;
        class109.field2685 = 0;
        class124.field3006 = 0;
        class20.field583 = 0;
        class129.field3042 = 0;
        class93.field2248 = 0;
        class60.field1545 = 0;
        class117.field2883 = 0;
        class130.field3067 = 0;
        class93.field2252 = 0;
        class54.field1406 = 0;
        class89.field2157 = 0;
        class40.field1136 = 0;
        class8.field275 = 0;
        class75.field1889 = 0;
        class10.field319 = 0;
        class93.field2235 = 0;
        class117.field2891 = 0;
        class129.field3049 = 0;
        class4.field176 = 0;
        class93.field2239 = 0;
        class112.field2775 = 0;
        class115.field2821 = 0;
        class45.field1225 = 0;
        class21.field618 = 0;
        class3.field120 = 0;
        class14.field407 = 0;
        class96.field2321 = 0;
        class40.field1118 = 0;
        class7.field234 = 0;
        class8.field284 = 0;
        class115.field2835 = 0;
        class36.field1038 = 0;
        class67.field1701 = 0;
        class128.field3038 = 0;
        class61.field1567 = 0;
        class88.field2113 = 0;
        class96.field2330 = 0;
        class116.field2853 = 0;
        class132.field3183 = 0;
        class84.field2006 = 0;
        class15.field426 = 0;
        class72.field1821 = 0;
        class72.field1826 = 0;
        class130.field3072 = 0;
        class98.field2367 = 0;
        class40.field1115 = 0;
        class61.field1580 = 0;
        class51.field1338 = 0;
        class45.field1214 = 0;
        class115.field2847 = 0;
        class60.field1559 = 0;
        class48.field1277 = 0;
        class121.field2969 = 0;
        class45.field1218 = 0;
        class60.field1520 = 0;
        class119.field2910 = 0;
        class8.field269 = 0;
        class129.field3048 = 0;
        class51.field1335 = 0;
        class130.field3058 = 0;
        class4.field159 = 0;
        class72.field1837 = 0;
        class41.field1163 = 0;
        class35.field986 = 0;
        class21.field611 = 0;
        class123.field2986 = 0;
        class72.field1836 = 0;
        class61.field1586 = 0;
        class97.field2339 = 0;
        class59.field1498 = 0;
        class130.field3077 = 0;
        class89.field2173 = 0;
        class68.field1753 = 0;
        class98.field2370 = 0;
        class130.field3074 = 0;
        class130.field3088 = 0;
        class116.field2854 = 0;
        class130.field3098 = 0;
        class130.field3090 = 0;
        class79.field1906 = 0;
        class22.field633 = 0;
        class130.field3060 = 0;
        class47.field1266 = 0;
        class83.field1964 = 0;
        class35.field994 = 0;
        class4.field157 = 0;
        class108.field2617 = 0;
        class36.field1024 = 0;
        class36.field1077 = 0;
        class29.field810 = 0;
        class129.field3041 = 0;
        client.field535 = 0;
        class53.field1375 = 0;
        class22.field626 = 0;
        class115.field2842 = 0;
        class84.field1995 = 0;
        class115.field2818 = 0;
        class60.field1546 = 0;
        class93.field2220 = 0;
        class36.field1068 = 0;
        class109.field2678 = 0;
        class60.field1547 = 0;
        class10.field328 = 0;
        class93.field2241 = 0;
        class40.field1117 = 0;
        class84.field1972 = 0;
        class65.field1658 = 0;
        class19.field555 = 0;
        class108.field2620 = 0;
        class94.field2274 = 0;
        class95.field2298 = 0;
        class36.field1047 = 0;
        class53.field1392 = 0;
        class35.field995 = 0;
        class18.field511 = 0;
        class75.field1869 = 0;
        class85.field2018 = 0;
        class72.field1841 = 0;
        class67.field1681 = 0;
        class81.field1944 = 0;
        class4.field177 = 0;
        class108.field2605 = 0;
        class37.field1083 = 0;
        class54.field1408 = 0;
        class35.field999 = 0;
        class8.field261 = 0;
        class3.field146 = 0;
        class36.field1042 = 0;
        class97.field2349 = 0;
        class96.field2313 = 0;
        class51.field1336 = 0;
        class109.field2667 = 0;
        class93.field2238 = 0;
        class21.field607 = 0;
        class45.field1229 = 0;
        class35.field1005 = 0;
        class36.field1058 = 0;
        class79.field1908 = 0;
        class17.field454 = 0;
        class120.field2924 = 0;
        class33.field904 = 0;
        class36.field1064 = 0;
        class130.field3063 = 0;
        class97.field2351 = 0;
        class93.field2227 = 0;
        class23.field660 = 0;
        class21.field601 = 0;
        class121.field2955 = 0;
        class53.field1383 = 0;
        class75.field1875 = 0;
        class45.field1201 = 0;
        class40.field1120 = 0;
        class35.field1004 = 0;
        class2.field36 = 0;
        class36.field1075 = 0;
        class17.field472 = 0;
        class115.field2831 = 0;
        class93.field2233 = 0;
        class15.field435 = 0;
        class18.field508 = 0;
        class65.field1666 = 0;
        class2.field39 = 0;
        class96.field2331 = 0;
        class106.field2572 = 0;
        class90.field2178 = 0;
        class17.field457 = 0;
        class132.field3185 = 0;
        class36.field1023 = 0;
        class35.field1008 = 0;
        class10.field333 = 0;
        class79.field1904 = 0;
        class105.field2541 = 0;
        class130.field3066 = 0;
        class93.field2240 = 0;
        class90.field2176 = 0;
        class37.field1082 = 0;
        class79.field1907 = 0;
        class97.field2359 = 0;
        class43.field1197 = 0;
        class60.field1525 = 0;
        class48.field1278 = 0;
        class112.field2773 = 0;
        class64.field1613 = 0;
        class130.field3115 = 0;
        class40.field1126 = 0;
        class60.field1528 = 0;
        class29.field811 = 0;
        class21.field598 = 0;
        class36.field1063 = 0;
        class93.field2228 = 0;
        class132.field3193 = 0;
        class3.field96 = 0;
        class35.field989 = 0;
        class41.field1150 = 0;
        class67.field1724 = 0;
        class130.field3069 = 0;
        class26.field764 = 0;
        class40.field1116 = 0;
        class113.field2808 = 0;
        class58.field1457 = 0;
        class93.field2251 = 0;
        class24.field689 = 0;
        class36.field1031 = 0;
        class65.field1648 = 0;
        class64.field1624 = 0;
        class84.field1973 = 0;
        class36.field1045 = 0;
        class113.field2783 = 0;
        class109.field2665 = 0;
        class56.field1440 = 0;
        class24.field727 = 0;
        class72.field1829 = 0;
        class93.field2217 = 0;
        class46.field1243 = 0;
        class106.field2571 = 0;
        class48.field1300 = 0;
        class15.field424 = 0;
        class94.field2277 = 0;
        class10.field324 = 0;
        class130.field3093 = 0;
        class67.field1739 = 0;
        class72.field1827 = 0;
        class60.field1524 = 0;
        class120.field2928 = 0;
        class4.field190 = 0;
        class121.field2975 = 0;
        class31.field862 = 0;
        class88.field2100 = 0;
        class97.field2342 = 0;
        class6.field227 = 0;
        client.field524 = 0;
        class33.field907 = 0;
        class75.field1866 = 0;
        class10.field326 = 0;
        class75.field1887 = 0;
        class9.field304 = 0;
        class36.field1049 = 0;
        class103.field2523 = 0;
        class26.field773 = 0;
        class60.field1548 = 0;
        class48.field1299 = 0;
        class41.field1156 = 0;
        class3.field118 = 0;
        class59.field1492 = 0;
        class90.field2175 = 0;
        class92.field2211 = 0;
        class93.field2237 = 0;
        class29.field814 = 0;
        class89.field2165 = 0;
        field2395 = 0;
        class83.field1950 = 0;
        class42.field1178 = 0;
        class40.field1110 = 0;
        class117.field2903 = 0;
        class123.field2989 = 0;
        class36.field1014 = 0;
        class109.field2686 = 0;
        class21.field595 = 0;
        class53.field1380 = 0;
        class14.field395 = 0;
        class36.field1059 = 0;
        class121.field2963 = 0;
        class59.field1491 = 0;
        class48.field1282 = 0;
        class35.field1001 = 0;
        class116.field2852 = 0;
        class4.field161 = 0;
        class8.field282 = 0;
        class65.field1665 = 0;
        class93.field2224 = 0;
        class36.field1073 = 0;
        class93.field2226 = 0;
        client.field546 = 0;
        class8.field274 = 0;
        class89.field2161 = 0;
        class9.field301 = 0;
        class46.field1250 = 0;
        class68.field1758 = 0;
        class92.field2210 = 0;
        class75.field1870 = 0;
        class75.field1883 = 0;
        class97.field2356 = 0;
        class60.field1517 = 0;
        class84.field1991 = 0;
        class36.field1037 = 0;
        class36.field1055 = 0;
        class18.field504 = 0;
        class97.field2347 = 0;
        class37.field1084 = 0;
        class33.field914 = 0;
        class8.field281 = 0;
        class3.field141 = 0;
        class116.field2875 = 0;
        class117.field2898 = 0;
        class106.field2576 = 0;
        class121.field2970 = 0;
        class95.field2296 = 0;
        class53.field1374 = 0;
        class26.field772 = 0;
        class22.field628 = 0;
        class60.field1536 = 0;
        class128.field3035 = 0;
        class65.field1654 = 0;
        class88.field2108 = 0;
        class30.field855 = 0;
        class6.field226 = 0;
        class113.field2800 = 0;
        class4.field187 = 0;
        class96.field2328 = 0;
        class64.field1633 = 0;
        class97.field2358 = 0;
        class88.field2075 = 0;
        class37.field1094 = 0;
        class90.field2190 = 0;
        class15.field423 = 0;
        class41.field1157 = 0;
        class36.field1039 = 0;
        class130.field3053 = 0;
        class37.field1095 = 0;
        class124.field3014 = 0;
        class21.field620 = 0;
        class89.field2148 = 0;
        class83.field1958 = 0;
        class32.field886 = 0;
        class115.field2830 = 0;
        class14.field401 = 0;
        class33.field908 = 0;
        class130.field3056 = 0;
        class36.field1015 = 0;
        class89.field2169 = 0;
        class121.field2961 = 0;
        field2388 = 0;
        class123.field2981 = 0;
        class36.field1065 = 0;
        class83.field1965 = 0;
        class40.field1111 = 0;
        class7.field243 = 0;
        class53.field1391 = 0;
        class36.field1040 = 0;
        class48.field1288 = 0;
        class67.field1725 = 0;
        class84.field1976 = 0;
        class128.field3033 = 0;
        class24.field698 = 0;
        class132.field3195 = 0;
        class3.field82 = 0;
        class108.field2604 = 0;
        class33.field920 = 0;
        class69.field1778 = 0;
        class130.field3054 = 0;
        class101.field2432 = 0;
        class112.field2752 = 0;
        class53.field1394 = 0;
        class26.field747 = 0;
        class31.field874 = 0;
        class93.field2230 = 0;
        class119.field2912 = 0;
        class128.field3030 = 0;
        class92.field2203 = 0;
        class69.field1784 = 0;
        class36.field1050 = 0;
        class63.field1607 = 0;
        class51.field1333 = 0;
        class26.field754 = 0;
        class6.field219 = 0;
        class17.field473 = 0;
        class40.field1125 = 0;
        class101.field2427 = 0;
        class108.field2613 = 0;
        class54.field1416 = 0;
        class90.field2179 = 0;
        class115.field2834 = 0;
        class3.field77 = 0;
        class32.field884 = 0;
        class22.field641 = 0;
        client.field530 = 0;
        class41.field1154 = 0;
        class88.field2082 = 0;
        class1.field10 = 0;
        class32.field885 = 0;
        class36.field1020 = 0;
        class14.field398 = 0;
        class54.field1405 = 0;
        class109.field2688 = 0;
        class8.field287 = 0;
        class36.field1048 = 0;
        class59.field1501 = 0;
        class7.field237 = 0;
        class93.field2249 = 0;
        class31.field868 = 0;
        class106.field2568 = 0;
        class130.field3086 = 0;
        class106.field2582 = 0;
        field2381 = 0;
        class58.field1459 = 0;
        class15.field436 = 0;
        class93.field2232 = 0;
        class30.field854 = 0;
        class4.field171 = 0;
        class63.field1594 = 0;
        class18.field505 = 0;
        class40.field1113 = 0;
        class89.field2156 = 0;
        class108.field2612 = 0;
        class53.field1389 = 0;
        class84.field2012 = 0;
        class121.field2956 = 0;
        class61.field1573 = 0;
        class51.field1334 = 0;
        class111.field2728 = 0;
        class75.field1860 = 0;
        class36.field1072 = 0;
        class116.field2870 = 0;
        class68.field1765 = 0;
        class8.field267 = 0;
        class106.field2577 = 0;
        class33.field911 = 0;
        client.field526 = 0;
        class60.field1558 = 0;
        class36.field1018 = 0;
        class130.field3122 = 0;
        class93.field2221 = 0;
        class112.field2753 = 0;
        class84.field2002 = 0;
        class58.field1454 = 0;
        class17.field468 = 0;
        class24.field730 = 0;
        class85.field2029 = 0;
        class63.field1595 = 0;
        class96.field2320 = 0;
        class19.field552 = 0;
        class2.field23 = 0;
        class105.field2556 = 0;
        class10.field321 = 0;
        class112.field2774 = 0;
        class108.field2600 = 0;
        class36.field1060 = 0;
        class4.field156 = 0;
        class45.field1210 = 0;
        class130.field3085 = 0;
        class130.field3082 = 0;
        class36.field1035 = 0;
        client.field518 = 0;
        class60.field1529 = 0;
        class32.field887 = 0;
        class21.field597 = 0;
        class60.field1530 = 0;
        class92.field2207 = 0;
        class130.field3095 = 0;
        class20.field592 = 0;
        class4.field184 = 0;
        class101.field2436 = 0;
        class45.field1227 = 0;
        class96.field2326 = 0;
        class116.field2876 = 0;
        class15.field437 = 0;
        class65.field1651 = 0;
        class94.field2276 = 0;
        class36.field1034 = 0;
        class123.field2987 = 0;
        class85.field2024 = 0;
        class89.field2155 = 0;
        class71.field1794 = 0;
        class27.field782 = 0;
        class130.field3099 = 0;
        class60.field1532 = 0;
        class35.field1012 = 0;
        class113.field2793 = 0;
        class3.field143 = 0;
        class10.field332 = 0;
        class132.field3184 = 0;
        class19.field554 = 0;
        class108.field2606 = 0;
        class36.field1051 = 0;
        class111.field2731 = 0;
        class36.field1016 = 0;
        class128.field3020 = 0;
        class130.field3055 = 0;
        class18.field499 = 0;
        field2391 = 0;
        class29.field800 = 0;
        class29.field809 = 0;
        class108.field2615 = 0;
        client.field529 = 0;
        class23.field661 = 0;
        class115.field2823 = 0;
        class119.field2907 = 0;
        class79.field1922 = 0;
        class112.field2746 = 0;
        class36.field1056 = 0;
        class46.field1253 = 0;
        class67.field1692 = 0;
        class93.field2229 = 0;
        class58.field1453 = 0;
        class93.field2260 = 0;
        class4.field169 = 0;
        class95.field2299 = 0;
        client.field528 = 0;
        class24.field717 = 0;
        class93.field2231 = 0;
        class111.field2732 = 0;
        class98.field2377 = 0;
        class130.field3096 = 0;
        class7.field244 = 0;
        class75.field1865 = 0;
        class93.field2256 = 0;
        class7.field240 = 0;
        class97.field2338 = 0;
        class85.field2039 = 0;
        class109.field2654 = 0;
        class72.field1823 = 0;
        class54.field1400 = 0;
        class93.field2223 = 0;
        class98.field2369 = 0;
        class88.field2126 = 0;
        class18.field490 = 0;
        class95.field2301 = 0;
        class130.field3089 = 0;
        class109.field2687 = 0;
        class60.field1551 = 0;
        class67.field1689 = 0;
        class36.field1076 = 0;
        class105.field2561 = 0;
        class36.field1025 = 0;
        class36.field1074 = 0;
        class30.field826 = 0;
        class115.field2837 = 0;
        class81.field1938 = 0;
        class60.field1556 = 0;
        class32.field881 = 0;
        class94.field2267 = 0;
        class33.field903 = 0;
        class109.field2641 = 0;
        class130.field3073 = 0;
        class106.field2565 = 0;
        class84.field1974 = 0;
        class1.field14 = 0;
        class17.field461 = 0;
        class48.field1301 = 0;
        class18.field493 = 0;
        class10.field340 = 0;
        class130.field3102 = 0;
        class75.field1888 = 0;
        class36.field1044 = 0;
        class6.field214 = 0;
        class60.field1550 = 0;
        class20.field591 = 0;
        class6.field205 = 0;
        class97.field2357 = 0;
        class60.field1542 = 0;
        class116.field2858 = 0;
        class111.field2719 = 0;
        class84.field2004 = 0;
        class36.field1043 = 0;
        class8.field266 = 0;
        class97.field2344 = 0;
        class93.field2255 = 0;
        class29.field808 = 0;
        class2.field25 = 0;
        class72.field1819 = 0;
        class67.field1735 = 0;
        class95.field2300 = 0;
        class123.field2982 = 0;
        class121.field2972 = 0;
        class69.field1771 = 0;
        class17.field464 = 0;
        class3.field131 = 0;
        class4.field175 = 0;
        field2382 = 0;
        class8.field272 = 0;
        class130.field3062 = 0;
        class18.field488 = 0;
        class29.field806 = 0;
        class72.field1828 = 0;
        class130.field3059 = 0;
        class20.field582 = 0;
        class2.field47 = 0;
        client.field533 = 0;
        class20.field589 = 0;
        class36.field1021 = 0;
        class130.field3092 = 0;
        class36.field1070 = 0;
        class35.field991 = 0;
        client.field519 = 0;
        class54.field1415 = 0;
        class65.field1662 = 0;
        class112.field2761 = 0;
        class67.field1727 = 0;
        class94.field2294 = 0;
        class108.field2610 = 0;
        class8.field285 = 0;
        class43.field1192 = 0;
        client.field534 = 0;
        class60.field1519 = 0;
        class36.field1019 = 0;
        class93.field2259 = 0;
        class93.field2253 = 0;
        class18.field500 = 0;
        class75.field1879 = 0;
        class130.field3071 = 0;
        class68.field1752 = 0;
        class20.field581 = 0;
        class130.field3078 = 0;
        class85.field2031 = 0;
        class111.field2720 = 0;
        class109.field2652 = 0;
        class83.field1956 = 0;
        class94.field2279 = 0;
        class3.field109 = 0;
        class2.field63 = 0;
        class60.field1537 = 0;
        class35.field1002 = 0;
        class60.field1531 = 0;
        class130.field3075 = 0;
        class60.field1560 = 0;
        class101.field2430 = 0;
        class95.field2297 = 0;
        class61.field1587 = 0;
        class46.field1239 = 0;
        class41.field1161 = 0;
        class72.field1843 = 0;
        class132.field3192 = 0;
        class65.field1659 = 0;
        class18.field510 = 0;
        class19.field550 = 0;
        class6.field204 = 0;
        class21.field615 = 0;
        class20.field576 = 0;
        class45.field1222 = 0;
        class3.field76 = 0;
        class8.field265 = 0;
        class132.field3203 = 0;
        class130.field3103 = 0;
        class83.field1963 = 0;
        class124.field3008 = 0;
        class113.field2776 = 0;
        class130.field3100 = 0;
        class7.field239 = 0;
        class45.field1230 = 0;
        class115.field2828 = 0;
        class128.field3037 = 0;
        class6.field224 = 0;
        class120.field2925 = 0;
        class98.field2364 = 0;
        class53.field1398 = 0;
        class40.field1131 = 0;
        class116.field2857 = 0;
        field2399 = 0;
        class36.field1027 = 0;
        class69.field1774 = 0;
        class69.field1776 = 0;
        class75.field1863 = 0;
        class18.field486 = 0;
        class106.field2574 = 0;
        class4.field180 = 0;
        class63.field1597 = 0;
        class40.field1143 = 0;
        class65.field1649 = 0;
        class61.field1575 = 0;
        class93.field2242 = 0;
        class130.field3094 = 0;
        class101.field2438 = 0;
        client.field520 = 0;
        class40.field1135 = 0;
        class65.field1667 = 0;
        class94.field2269 = 0;
        class47.field1264 = 0;
        class14.field408 = 0;
        class93.field2234 = 0;
        class36.field1030 = 0;
        class64.field1637 = 0;
        class111.field2721 = 0;
        class101.field2413 = 0;
        class19.field551 = 0;
        class45.field1219 = 0;
        class20.field584 = 0;
        class109.field2669 = 0;
        class130.field3097 = 0;
        class45.field1208 = 0;
        class93.field2219 = 0;
        class130.field3080 = 0;
        class84.field1979 = 0;
        class40.field1123 = 0;
        class121.field2958 = 0;
        class93.field2244 = 0;
        class72.field1834 = 0;
        class54.field1407 = 0;
        class119.field2911 = 0;
        class53.field1378 = 0;
        class130.field3087 = 0;
        int var1 = 37 / ((arg0 - 94) / 32);
        class17.field482 = 0;
        class3.field99 = 0;
        class17.field467 = 0;
        class31.field870 = 0;
        class106.field2583 = 0;
        class3.field142 = 0;
        class69.field1785 = 0;
        class112.field2763 = 0;
        class15.field417 = 0;
        class30.field847 = 0;
        class31.field863 = 0;
        class59.field1499 = 0;
        class51.field1342 = 0;
        class48.field1275 = 0;
        class23.field664 = 0;
        class41.field1147 = 0;
        class85.field2037 = 0;
        class24.field718 = 0;
        class32.field882 = 0;
        class121.field2971 = 0;
        class94.field2281 = 0;
        field2385 = 0;
        class109.field2627 = 0;
        class84.field2010 = 0;
        class75.field1880 = 0;
        class96.field2323 = 0;
        class15.field420 = 0;
        class132.field3196 = 0;
        class84.field2000 = 0;
        class101.field2422 = 0;
        class98.field2363 = 0;
        class18.field489 = 0;
        class130.field3057 = 0;
        class26.field744 = 0;
        class2.field67 = 0;
        field2389 = 0;
        class29.field812 = 0;
        class109.field2628 = 0;
        class130.field3070 = 0;
        class59.field1493 = 0;
        class18.field485 = 0;
        class112.field2766 = 0;
        class1.field19 = 0;
        class46.field1236 = 0;
        class36.field1032 = 0;
        class47.field1268 = 0;
        class121.field2968 = 0;
        class23.field655 = 0;
        class27.field776 = 0;
        class53.field1381 = 0;
        class121.field2974 = 0;
        class117.field2901 = 0;
        class6.field202 = 0;
        class40.field1137 = 0;
        class37.field1080 = 0;
        class7.field233 = 0;
        class120.field2929 = 0;
        class53.field1377 = 0;
        class36.field1046 = 0;
        field2394 = 0;
        class103.field2532 = 0;
        class15.field428 = 0;
        class90.field2186 = 0;
        class6.field212 = 0;
        class130.field3084 = 0;
        class30.field833 = 0;
        class124.field3007 = 0;
        class36.field1041 = 0;
        class72.field1832 = 0;
        class67.field1729 = 0;
        class89.field2159 = 0;
        class4.field173 = 0;
        class17.field469 = 0;
        client.field538 = 0;
        class111.field2722 = 0;
        class4.field185 = 0;
        class84.field1975 = 0;
        class101.field2437 = 0;
        class6.field231 = 0;
        class111.field2717 = 0;
        class23.field662 = 0;
        class88.field2120 = 0;
        class115.field2816 = 0;
        class60.field1522 = 0;
        class52.field1355 = 0;
        class2.field66 = 0;
        class33.field900 = 0;
        class36.field1066 = 0;
        class36.field1062 = 0;
        client.field531 = 0;
        class67.field1745 = 0;
        class21.field610 = 0;
        class130.field3064 = 0;
        client.field525 = 0;
        class93.field2245 = 0;
        class2.field40 = 0;
        class21.field608 = 0;
        class108.field2614 = 0;
        class60.field1552 = 0;
        class96.field2318 = 0;
        class75.field1873 = 0;
        class97.field2355 = 0;
        class59.field1482 = 0;
        class56.field1432 = 0;
        class27.field786 = 0;
        class51.field1340 = 0;
        class117.field2892.field318 = 0;
        class17.field480 = 0L;
        class9.field294 = true;
        class115.method877(8243);
        class14.field406.field1057 = 0;
        class67.field1682.field1057 = 0;
        class130.field3065 = 0;
        class26.field757 = 0;
        class47.field1265 = -1;
        class58.field1462 = false;
        class130.field3101 = 0;
        class36.field1078 = 0;
        class63.field1605 = 0;
        class64.field1619 = -1;
        class65.field1652 = -1;
        class9.field314 = -1;
        class2.method9(0, (byte) -25);
        for (int var2 = 0; var2 < 100; var2++) {
            class37.field1089[var2] = null;
        }
        client.field547 = (int) (Math.random() * 110.0D) - 55;
        class123.field2984 = (int) (Math.random() * 100.0D) - 50;
        class61.field1583 = 0;
        class95.field2305 = (int) (Math.random() * 80.0D) - 40;
        class58.field1466 = 0;
        class26.field749 = 0;
        class115.field2833 = 0;
        class61.field1582 = 0;
        class115.field2845 = -1;
        class3.field80 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class95.field2306 = 0;
        class115.field2825 = (int) (Math.random() * 30.0D) - 20;
        class42.field1182 = 0;
        class85.field2041 = (int) (Math.random() * 120.0D) - 60;
        class116.field2850 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class105.field2550[var3] = null;
            class103.field2527[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class26.field766[var4] = null;
        }
        class42.field1179 = class105.field2550[2047] = new class59();
        class51.field1343.method816((byte) 124);
        class41.field1155.method816((byte) 123);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class23.field674[var5][var7][var8] = null;
                }
            }
        }
        class15.field419 = new class108();
        class42.field1183 = 0;
        class35.field993 = 0;
        class115.method882(class6.field200, 3);
        class6.field200 = -1;
        class115.method882(class22.field632, 3);
        class22.field632 = -1;
        class115.method882(class115.field2843, 3);
        class115.field2843 = -1;
        class115.method882(class112.field2768, 3);
        class112.field2768 = -1;
        class115.method882(class52.field1367, 3);
        class52.field1367 = -1;
        class115.method882(class105.field2538, 3);
        class105.field2538 = -1;
        class115.method882(class3.field139, 3);
        class42.field1181 = 3;
        class111.field2741 = -1;
        class3.field139 = -1;
        class63.field1598 = 0;
        class1.field9 = 0;
        class109.field2676 = null;
        class58.field1462 = false;
        class101.field2435 = false;
        class101.field2414 = -1;
        class79.field1905.method758(false, new int[5], (byte) -9, -1, null);
        for (int var6 = 0; var6 < 5; var6++) {
            class1.field1[var6] = null;
            class22.field629[var6] = false;
        }
        class33.field916 = true;
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)I", line = 1037)
    public static final int method739(int arg0) {
        field2399++;
        if (arg0 > -47) {
            field2398 = null;
        }
        int var1 = class27.method219(336137319, class71.field1818, class58.field1465, class103.field2528);
        return var1 - class29.field815 >= 800 || (class56.field1435[class71.field1818][class103.field2528 >> 7][class58.field1465 >> 7] & 0x4) == 0 ? 3 : class71.field1818;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lk;IZI)Lwc;", line = 1056)
    public static final class131 method740(class60 arg0, int arg1, boolean arg2, int arg3) {
        field2388++;
        if (class24.method210(arg0, (byte) 126, arg3, arg1)) {
            return arg2 ? null : class124.method938(73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lk;Z)V", line = 1075)
    public static final void method741(class60 arg0, boolean arg1) {
        if (!arg1) {
            field2385++;
            class23.field677 = arg0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V", line = 1103)
    public static void method742(byte arg0) {
        field2396 = null;
        if (arg0 != 98) {
            field2398 = null;
        }
        field2390 = null;
        field2398 = null;
        field2392 = null;
        field2404 = null;
        field2403 = null;
        field2384 = null;
        field2400 = null;
        field2397 = null;
        field2387 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lk;Lwb;Lwb;B)[Lec;", line = 1143)
    public static final class28[] method743(class60 arg0, class130 arg1, class130 arg2, byte arg3) {
        int var4 = arg0.method507(arg1, -1);
        field2382++;
        if (arg3 != -56) {
            method737(103);
        }
        int var5 = arg0.method502(arg2, false, var4);
        return class58.method477(arg3 ^ 0x4B, var5, arg0, var4);
    }
}
