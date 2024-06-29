import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lrc;")
    private static class105 field1979 = class43.method374("Your ignore list is full)3 Max of 100 hit", 0);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lrc;")
    public static class105 field1977 = field1979;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lrc;")
    private static class105 field1978 = class43.method374("Lade Texturen )2 ", 0);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lrc;")
    public static class105 field1980 = class43.method374("backbase1", 0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lca;")
    public static class14 field1974 = new class14();

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public static int[] field1983 = new int[128];

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lrc;")
    private static class105 field1985 = class43.method374(" zuerst von Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method716(boolean arg0) {
        field1976++;
        class105.method864(false);
        if (class111.field2585 == 2) {
            int[] var1 = class69.field1548;
            byte[] var2 = class85.field1927.field218;
            int var3 = var2.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var2[var4] == 0) {
                    var1[var4] = 0;
                }
            }
            class34.field800.method247(0, 0, 33, 33, 25, 25, client.field432, 256, class104.field2361, class55.field1102);
            class78.method674(arg0);
            return;
        }
        int var5 = client.field432 + class12.field249 & 0x7FF;
        int var6 = 464 - class119.field2842.field1274 / 32;
        int var7 = class119.field2842.field1229 / 32 + 48;
        class85.field1925.method247(25, 5, 146, 151, var7, var6, var5, class35.field807 + 256, class3.field55, class58.field1302);
        int var8 = 0;
        if (!arg0) {
            method718(-127);
        }
        while (var8 < class9.field176) {
            int var38 = class83.field1872[var8] * 4 + 2 - class119.field2842.field1229 / 32;
            int var39 = class55.field1101[var8] * 4 + 2 - class119.field2842.field1274 / 32;
            class65.method550(118, var39, var38, class85.field1926[var8]);
            var8++;
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class3 var35 = class126.field3060[class73.field1619][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class119.field2842.field1229 / 32;
                    int var37 = var34 * 4 + 2 - class119.field2842.field1274 / 32;
                    class65.method550(121, var37, var36, class17.field355[0]);
                }
            }
        }
        for (int var10 = 0; var10 < class133.field3229; var10++) {
            class115 var30 = class19.field466[class24.field578[var10]];
            if (var30 != null && var30.method164(124)) {
                class19 var31 = var30.field2681;
                if (var31.field462 != null) {
                    var31 = var31.method223(true);
                }
                if (var31 != null && var31.field455 && var31.field495) {
                    int var32 = var30.field1229 / 32 - class119.field2842.field1229 / 32;
                    int var33 = var30.field1274 / 32 - class119.field2842.field1274 / 32;
                    class65.method550(114, var33, var32, class17.field355[1]);
                }
            }
        }
        for (int var11 = 0; var11 < class97.field2250; var11++) {
            class15 var22 = class58.field1303[class121.field2956[var11]];
            if (var22 != null && var22.method164(103)) {
                boolean var23 = false;
                int var24 = var22.field1229 / 32 - class119.field2842.field1229 / 32;
                int var25 = var22.field1274 / 32 - class119.field2842.field1274 / 32;
                long var26 = var22.field300.method828(455);
                for (int var28 = 0; var28 < class81.field1817; var28++) {
                    if (class12.field238[var28] == var26 && class122.field2994[var28] != 0) {
                        var23 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class119.field2842.field303 != 0 && var22.field303 != 0 && class119.field2842.field303 == var22.field303) {
                    var29 = true;
                }
                if (var23) {
                    class65.method550(116, var25, var24, class17.field355[3]);
                } else if (var29) {
                    class65.method550(127, var25, var24, class17.field355[4]);
                } else {
                    class65.method550(126, var25, var24, class17.field355[2]);
                }
            }
        }
        if (class132.field3172 != 0 && class104.field2351 % 20 < 10) {
            if (class132.field3172 == 1 && class83.field1866 >= 0 && class83.field1866 < class19.field466.length) {
                class115 var12 = class19.field466[class83.field1866];
                if (var12 != null) {
                    int var13 = var12.field1274 / 32 - class119.field2842.field1274 / 32;
                    int var14 = var12.field1229 / 32 - class119.field2842.field1229 / 32;
                    class81.method696(true, class51.field1080[1], var13, var14);
                }
            }
            if (class132.field3172 == 2) {
                int var15 = (class66.field1476 - class23.field562) * 4 + 2 - class119.field2842.field1229 / 32;
                int var16 = (class45.field1018 - class107.field2466) * 4 + 2 - class119.field2842.field1274 / 32;
                class81.method696(true, class51.field1080[1], var16, var15);
            }
            if (class132.field3172 == 10 && class132.field3182 >= 0 && class132.field3182 < class58.field1303.length) {
                class15 var17 = class58.field1303[class132.field3182];
                if (var17 != null) {
                    int var18 = var17.field1274 / 32 - class119.field2842.field1274 / 32;
                    int var19 = var17.field1229 / 32 - class119.field2842.field1229 / 32;
                    class81.method696(true, class51.field1080[1], var18, var19);
                }
            }
        }
        if (class12.field243 != 0) {
            int var20 = class55.field1103 * 4 + 2 - class119.field2842.field1274 / 32;
            int var21 = class12.field243 * 4 + 2 - class119.field2842.field1229 / 32;
            class65.method550(124, var20, var21, class51.field1080[0]);
        }
        class69.method580(97, 78, 3, 3, 16777215);
        class34.field800.method247(0, 0, 33, 33, 25, 25, client.field432, 256, class104.field2361, class55.field1102);
        class78.method674(true);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V", line = 216)
    public static final void method717(boolean arg0) {
        class117.field2745 = class106.field2427;
        class111.field2611 = class1.field12;
        class111.field2601 = class71.field1575;
        class88.field2010 = field1985;
        class98.field2253 = class14.field276;
        field1982++;
        class55.field1109 = class133.field3222;
        class72.field1588 = class113.field2659;
        class15.field318 = class65.field1463;
        class67.field1509 = class110.field2555;
        class109.field2492 = class117.field2730;
        class66.field1491 = class92.field2160;
        class104.field2367 = class80.field1800;
        class36.field827 = class55.field1110;
        class51.field1082 = class1.field6;
        class111.field2592 = class12.field231;
        class108.field2468 = class122.field3011;
        class19.field473 = class92.field2117;
        class109.field2491 = class58.field1218;
        class111.field2579 = class57.field1195;
        class85.field1930 = class64.field1440;
        class61.field1358 = class51.field1070;
        class123.field3020 = class134.field3259;
        class23.field566 = class121.field2907;
        class111.field2563 = class75.field1672;
        class120.field2899 = class66.field1496;
        class9.field184 = class3.field53;
        class111.field2570 = class1.field12;
        class58.field1304 = class116.field2685;
        class119.field2821 = class24.field586;
        class109.field2513 = class118.field2749;
        class132.field3210 = class110.field2559;
        class90.field2068 = class116.field2722;
        class121.field2958 = class37.field851;
        class111.field2569 = class42.field957;
        class111.field2582 = class1.field12;
        class85.field1928 = class24.field573;
        class118.field2755 = class113.field2647;
        class111.field2598 = class81.field1819;
        class22.field545 = class67.field1520;
        class111.field2594 = class1.field12;
        class104.field2369 = class107.field2462;
        class16.field336 = class71.field1570;
        class93.field2180 = class16.field333;
        class28.field647 = class102.field2326;
        class102.field2322 = class64.field1444;
        class134.field3277 = class67.field1532;
        class86.field1940 = class65.field1457;
        class51.field1071 = class127.field3088;
        if (!arg0) {
            method717(false);
        }
        class111.field2576 = class64.field1440;
        class120.field2898 = class66.field1496;
        class111.field2597 = class120.field2903;
        class117.field2741 = class129.field3144;
        class15.field301 = class121.field2925;
        class85.field1910 = class24.field573;
        class42.field968 = class66.field1470;
        class111.field2565 = class1.field12;
        class118.field2758 = class41.field937;
        class111.field2609 = class1.field12;
        class42.field972 = class29.field652;
        class92.field2104 = class134.field3290;
        class15.field289 = class78.field1741;
        class67.field1525 = class67.field1507;
        field1977 = class106.field2435;
        class78.field1769 = class66.field1499;
        class22.field531 = class136.field3326;
        class39.field906 = class71.field1565;
        class81.field1807 = class126.field3062;
        class132.field3217 = class1.field8;
        class28.field645 = class42.field974;
        class109.field2521 = class22.field543;
        class19.field469 = class107.field2463;
        class45.field1015 = class88.field2015;
        class57.field1186 = class106.field2438;
        class22.field526 = class65.field1446;
        class97.field2231 = class7.field133;
        class78.field1767 = class92.field2157;
        class111.field2607 = class1.field12;
        class22.field540 = class22.field524;
        class41.field930 = class81.field1833;
        class78.field1749 = class78.field1760;
        class3.field25 = class97.field2240;
        class97.field2233 = class7.field96;
        class66.field1481 = class3.field32;
        class120.field2902 = class134.field3247;
        class51.field1076 = class117.field2732;
        class26.field608 = class3.field51;
        class3.field31 = class83.field1876;
        class128.field3120 = class24.field575;
        class58.field1224 = class93.field2176;
        class102.field2316 = class80.field1789;
        class85.field1898 = class64.field1440;
        class39.field907 = class34.field786;
        class24.field581 = class109.field2515;
        class136.field3328 = class117.field2731;
        class106.field2431 = class102.field2324;
        class67.field1512 = field1978;
        class111.field2574 = class42.field957;
        class74.field1653 = class96.field2226;
        class104.field2366 = class112.field2631;
        class80.field1791 = class105.field2378;
        class43.field1007 = client.field434;
        class134.field3250 = class30.field691;
        class111.field2587 = class1.field12;
        class121.field2937 = class81.field1816;
        class111.field2605 = class1.field12;
        class30.field689 = class3.field46;
        class89.field2054 = class10.field216;
        class85.field1916 = class37.field860;
        class113.field2664 = class81.field1843;
        class55.field1107 = class97.field2235;
        class61.field1343 = class22.field537;
        class88.field1988 = class83.field1869;
        class86.field1958 = class81.field1830;
        class10.field190 = class108.field2485;
        class28.field642 = class42.field974;
        class134.field3243 = class121.field2949;
        class58.field1275 = class93.field2165;
        class58.field1258 = class19.field460;
        class88.field2002 = class16.field324;
        class26.field604 = class88.field1992;
        class111.field2593 = class1.field12;
        class90.field2057 = class41.field936;
        class118.field2767 = class134.field3275;
        class110.field2549 = class136.field3334;
        class134.field3285 = class121.field2949;
        class31.field720 = class51.field1066;
        class121.field2957 = class121.field2947;
        class30.field673 = class41.field940;
        class59.field1324 = class83.field1861;
        class42.field966 = class120.field2897;
        class31.field724 = class95.field2205;
        class88.field2013 = class88.field2004;
        class74.field1637 = class6.field80;
        class23.field567 = class118.field2752;
        class64.field1442 = class67.field1530;
        class58.field1301 = class14.field284;
        class111.field2602 = class1.field12;
        class26.field595 = class39.field895;
        class111.field2588 = class1.field12;
        class111.field2564 = class73.field1616;
        class102.field2325 = class23.field571;
        class76.field1707 = class134.field3246;
        class65.field1466 = class24.field582;
        class122.field2999 = class97.field2251;
        class10.field203 = class17.field358;
        class17.field351 = class58.field1279;
        class111.field2613 = class1.field12;
        class102.field2330 = class1.field7;
        class50.field1059 = class73.field1613;
        class92.field2153 = class136.field3331;
        class134.field3287 = class116.field2718;
        class125.field3041 = class121.field2932;
        class23.field556 = class117.field2737;
        class16.field321 = class71.field1570;
        class67.field1523 = class7.field85;
        class57.field1183 = class122.field2981;
        class97.field2245 = class95.field2185;
        class122.field3017 = class88.field1990;
        class121.field2943 = class104.field2350;
        class84.field1885 = class22.field534;
        class111.field2577 = class59.field1323;
        class37.field852 = class119.field2841;
        class108.field2479 = class64.field1441;
        class45.field1012 = class51.field1072;
        class109.field2511 = class129.field3124;
        class26.field593 = class43.field980;
        class92.field2151 = class58.field1298;
        class29.field666 = class60.field1332;
        class111.field2584 = class1.field12;
        class111.field2603 = class12.field231;
        class100.field2286 = class106.field2434;
        class111.field2590 = class110.field2561;
        class10.field200 = class67.field1530;
        class129.field3122 = class24.field574;
        class111.field2567 = class1.field12;
        class7.field144 = class132.field3191;
        class67.field1505 = class112.field2637;
        class85.field1933 = class64.field1440;
        class39.field894 = class1.field10;
        class108.field2472 = class134.field3269;
        class34.field796 = class136.field3320;
        class126.field3057 = class73.field1618;
        class111.field2573 = class121.field2935;
        class111.field2583 = client.field437;
        class111.field2614 = class59.field1321;
        class72.field1579 = class66.field1497;
        class39.field889 = class117.field2739;
        class97.field2227 = class23.field571;
        class58.field1306 = class43.field1001;
        class64.field1430 = class42.field970;
        class7.field149 = class28.field646;
        class102.field2321 = class113.field2666;
        class100.field2290 = class108.field2484;
        class43.field1006 = class110.field2558;
        class123.field3033 = class134.field3240;
        class127.field3079 = class26.field600;
        class88.field1998 = class117.field2734;
        class35.field819 = class121.field2975;
        class118.field2748 = class61.field1359;
        class110.field2552 = class35.field823;
        class31.field717 = class104.field2360;
        class98.field2259 = class107.field2451;
        class111.field2606 = class1.field12;
        class127.field3090 = class84.field1887;
        class95.field2187 = class19.field484;
        class85.field1921 = class43.field990;
        class39.field909 = class61.field1356;
        class81.field1815 = class19.field474;
        class16.field343 = class29.field669;
        class64.field1435 = class122.field3019;
        class111.field2589 = class1.field12;
        if (class18.field422) {
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 491)
    public static void method718(int arg0) {
        field1985 = null;
        field1977 = null;
        field1983 = null;
        field1980 = null;
        field1978 = null;
        field1974 = null;
        int var1 = 32 % ((-arg0 - 2) / 48);
        field1979 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)Z", line = 555)
    public static final boolean method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == 104) {
            field1981++;
            return class29.method273(arg0, arg4 ^ 0x14) ? class78.method675(arg6, 0, -1, false, arg3, arg1, 0, arg5, class14.field282[arg0], arg2) : false;
        } else {
            return false;
        }
    }
}
