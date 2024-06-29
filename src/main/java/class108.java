import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class108 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "La;")
    private static class1 field2711 = class113.method934(-11538, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!s", name = "i", descriptor = "La;")
    private static class1 field2713 = class113.method934(-11538, "slide:");

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2718 = 2301979;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static volatile int field2714 = 0;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "La;")
    public static class1 field2719 = class113.method934(-11538, "(U4");

    @OriginalMember(owner = "client!s", name = "f", descriptor = "La;")
    public static class1 field2710 = field2713;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "La;")
    private static class1 field2720 = class113.method934(-11538, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2715 = -1;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "La;")
    public static class1 field2717 = field2720;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lu;")
    public static class120 field2705;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lqb;")
    public static class98 field2708;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 4)
    public static final void method898(int arg0, int arg1) {
        if (arg1 != -14222) {
            field2705 = null;
        }
        field2727++;
        class121.method988((byte) 85, arg0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 20)
    public static final String method899(int arg0, Throwable arg1) throws IOException {
        field2722++;
        String var3;
        if (arg1 instanceof class43) {
            class43 var2 = (class43) arg1;
            var3 = var2.field1157 + " | ";
            arg1 = var2.field1156;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 != 0) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Lt;", line = 107)
    public static final class114 method900(byte arg0, int arg1) {
        field2724++;
        class114 var2 = (class114) class85.field2139.method264((long) arg1, (byte) 101);
        if (var2 != null) {
            return var2;
        }
        class114 var3 = class75.method693(class35.field940, (byte) 79, arg1, class119.field2969, false);
        if (var3 != null) {
            class85.field2139.method263(arg0 - 7109, (long) arg1, var3);
        }
        if (arg0 != -99) {
            method901(34);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 129)
    public static void method901(int arg0) {
        field2711 = null;
        field2713 = null;
        field2719 = null;
        field2710 = null;
        field2705 = null;
        field2720 = null;
        field2708 = null;
        if (arg0 != 1) {
            method904(120);
        }
        field2717 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 151)
    public static final void method902(int arg0) {
        class81.field2057 = class82.field2073;
        class32.field866 = class128.field3148;
        client.field603 = class78.field1931;
        class1.field63 = class23.field720;
        class74.field1810 = class75.field1873;
        class80.field2036 = class127.field3118;
        class9.field327 = class127.field3116;
        class112.field2760 = class114.field2807;
        class75.field1876 = class78.field1923;
        class103.field2601 = class28.field811;
        class129.field3175 = class93.field2332;
        class82.field2069 = class63.field1584;
        class97.field2396 = class42.field1128;
        class59.field1501 = class116.field2906;
        class117.field2931 = class42.field1128;
        class134.field3305 = class131.field3200;
        class82.field2106 = class133.field3283;
        class37.field1007 = class118.field2936;
        class42.field1107 = class74.field1843;
        class32.field863 = class78.field1911;
        class82.field2098 = class129.field3172;
        class62.field1548 = class47.field1246;
        field2710 = class133.field3279;
        class134.field3308 = class127.field3127;
        class78.field1924 = class72.field1761;
        class82.field2099 = class106.field2684;
        class28.field794 = class133.field3282;
        class93.field2340 = class49.field1345;
        class15.field498 = class34.field903;
        class122.field3048 = class81.field2038;
        class106.field2670 = class48.field1271;
        class82.field2100 = class19.field635;
        class82.field2086 = class129.field3172;
        class105.field2642 = class17.field548;
        class34.field901 = class12.field415;
        class32.field856 = class78.field1911;
        class24.field739 = class95.field2384;
        class17.field540 = class105.field2657;
        class23.field721 = class118.field2944;
        class46.field1217 = class54.field1442;
        class80.field2015 = class64.field1614;
        class112.field2770 = class39.field1078;
        class82.field2093 = class129.field3172;
        class82.field2082 = class129.field3172;
        class123.field3060 = class130.field3194;
        class82.field2092 = class129.field3172;
        class114.field2808 = class53.field1406;
        class82.field2094 = class129.field3172;
        class130.field3196 = class99.field2432;
        class134.field3298 = class46.field1216;
        class24.field727 = class93.field2338;
        class95.field2357 = class38.field1012;
        class97.field2394 = class53.field1407;
        class63.field1596 = class120.field2981;
        class121.field3005 = class107.field2690;
        class102.field2586 = class132.field3219;
        class73.field1785 = class133.field3261;
        class76.field1899 = class98.field2423;
        class128.field3141 = class120.field2998;
        class4.field184 = class1.field48;
        class42.field1095 = class106.field2688;
        class45.field1176 = class112.field2767;
        class133.field3268 = class78.field1918;
        class130.field3190 = class38.field1045;
        class52.field1367 = class50.field1347;
        class82.field2080 = class78.field1930;
        class28.field797 = class59.field1497;
        class60.field1525 = class45.field1182;
        class67.field1679 = class75.field1861;
        class85.field2138 = class28.field792;
        class81.field2044 = class109.field2733;
        class121.field3004 = class39.field1080;
        class15.field488 = class44.field1173;
        class100.field2549 = class59.field1506;
        class85.field2142 = class99.field2441;
        class43.field1153 = class8.field311;
        class103.field2605 = class75.field1856;
        class132.field3242 = class79.field1947;
        class15.field508 = class23.field713;
        class103.field2613 = class129.field3154;
        class82.field2091 = class129.field3172;
        class82.field2071 = class36.field977;
        client.field585 = class123.field3073;
        class8.field304 = class34.field891;
        class102.field2578 = class129.field3151;
        class32.field862 = class128.field3148;
        class28.field786 = class81.field2054;
        class32.field859 = class78.field1911;
        class82.field2109 = class129.field3172;
        class82.field2074 = class129.field3172;
        class46.field1219 = client.field579;
        class93.field2322 = class80.field2031;
        class95.field2363 = class38.field1012;
        class2.field95 = class95.field2381;
        class82.field2113 = class129.field3172;
        class52.field1365 = class52.field1389;
        class2.field65 = class130.field3193;
        class16.field522 = class99.field2435;
        class14.field453 = class24.field733;
        class105.field2637 = class95.field2362;
        class82.field2095 = class129.field3172;
        class117.field2934 = class105.field2647;
        class38.field1025 = class64.field1635;
        class82.field2089 = class63.field1579;
        class46.field1221 = class123.field3067;
        class127.field3130 = class120.field2996;
        class85.field2143 = class28.field792;
        class60.field1513 = class106.field2665;
        class82.field2097 = class63.field1584;
        class79.field1936 = class70.field1748;
        class38.field1031 = class23.field703;
        class62.field1564 = class114.field2827;
        class82.field2112 = class78.field1911;
        class53.field1395 = class73.field1788;
        class63.field1600 = class12.field419;
        class42.field1143 = class35.field930;
        class97.field2403 = class39.field1074;
        class32.field851 = class106.field2682;
        class82.field2114 = class15.field500;
        class123.field3075 = class81.field2039;
        class132.field3222 = class32.field855;
        class82.field2116 = class129.field3172;
        class82.field2083 = class118.field2943;
        class82.field2070 = class129.field3172;
        class46.field1197 = class82.field2105;
        class79.field1933 = class2.field94;
        class73.field1792 = class23.field717;
        class62.field1560 = class130.field3187;
        class112.field2766 = class1.field59;
        class102.field2579 = class129.field3173;
        class79.field1934 = class114.field2815;
        class38.field1038 = class102.field2565;
        class82.field2096 = class63.field1579;
        class100.field2480 = class132.field3228;
        class86.field2160 = class120.field2980;
        class46.field1205 = class4.field173;
        class100.field2493 = class28.field791;
        class63.field1597 = class28.field796;
        class98.field2410 = class122.field3054;
        class9.field316 = class102.field2566;
        class99.field2434 = class16.field527;
        class72.field1781 = class130.field3192;
        class6.field232 = class74.field1797;
        class114.field2820 = class120.field2983;
        class54.field1435 = class14.field468;
        class19.field667 = client.field599;
        class54.field1434 = class81.field2051;
        class31.field834 = class43.field1148;
        class85.field2129 = class127.field3128;
        class113.field2781 = class2.field78;
        class38.field1039 = class43.field1151;
        class121.field3011 = class32.field860;
        class100.field2483 = class72.field1779;
        class67.field1660 = class36.field963;
        class42.field1121 = class64.field1621;
        class76.field1888 = class52.field1385;
        class82.field2084 = class129.field3172;
        class36.field958 = class99.field2439;
        field2721++;
        class93.field2328 = class127.field3123;
        class85.field2152 = class80.field2035;
        class38.field1044 = class99.field2429;
        class122.field3057 = class14.field475;
        if (arg0 != 18782) {
            return;
        }
        class82.field2077 = class129.field3172;
        class93.field2313 = class86.field2167;
        class42.field1112 = class64.field1621;
        class82.field2107 = class17.field539;
        class131.field3208 = class54.field1439;
        class42.field1103 = class32.field853;
        class93.field2320 = class38.field1023;
        class57.field1452 = class47.field1240;
        class133.field3255 = class121.field3009;
        class1.field49 = class23.field707;
        class93.field2311 = class53.field1409;
        class92.field2299 = class49.field1341;
        class74.field1822 = class64.field1625;
        class5.field219 = class53.field1405;
        class102.field2583 = class11.field410;
        class121.field3015 = class89.field2177;
        class82.field2081 = class129.field3172;
        class53.field1410 = class76.field1886;
        class106.field2678 = class23.field718;
        class35.field927 = class6.field233;
        class38.field1032 = class23.field704;
        class11.field409 = class47.field1234;
        class75.field1877 = class92.field2302;
        class72.field1765 = class85.field2144;
        class95.field2385 = class48.field1266;
        client.field583 = class31.field839;
        class60.field1530 = class23.field708;
        class89.field2181 = class92.field2282;
        class59.field1485 = class109.field2735;
        class57.field1466 = class93.field2339;
        class81.field2059 = class54.field1433;
        class23.field719 = class2.field99;
        class102.field2585 = class12.field432;
        class45.field1186 = class98.field2423;
        class31.field837 = class36.field978;
        class82.field2064 = field2711;
        field2717 = class59.field1490;
        class80.field2001 = class92.field2307;
        class118.field2951 = class100.field2525;
        class85.field2141 = class5.field216;
        class39.field1077 = class24.field744;
        class82.field2103 = class92.field2301;
        class59.field1504 = class39.field1068;
        class98.field2408 = class15.field506;
        class19.field672 = class105.field2660;
        class89.field2175 = class92.field2282;
        class35.field933 = class2.field84;
        class14.field469 = class116.field2904;
        class82.field2104 = class129.field3172;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I", line = 419)
    public static final int method903(int arg0, byte arg1, int arg2) {
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != -62) {
            field2708 = null;
        }
        field2712++;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 472)
    public static final void method904(int arg0) {
        try {
            Graphics var1 = class122.field3052.getGraphics();
            class44.field1169.method102(0, 553, var1, 205);
        } catch (Exception var2) {
            class122.field3052.repaint();
        }
        if (arg0 != 40) {
            field2715 = 7;
        }
        field2706++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 497)
    public static final void method905(int arg0, Component arg1) {
        if (arg0 == 32) {
            field2725++;
            arg1.removeMouseListener(class54.field1415);
            arg1.removeMouseMotionListener(class54.field1415);
            arg1.removeFocusListener(class54.field1415);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILbd;Lbd;)V", line = 511)
    public static final void method906(int arg0, class11 arg1, class11 arg2) {
        class76.field1904 = arg1;
        field2726++;
        int var3 = -87 / ((-arg0 - 20) / 56);
        class37.field1000 = arg2;
    }
}
