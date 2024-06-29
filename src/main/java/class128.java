import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class128 {

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[[I")
    private int[][] field3099;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    private int field3084;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lmb;")
    private static class84 field3082 = class79.method672(true, "Entfernen");

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lmb;")
    private static class84 field3076 = class79.method672(true, " from your ignore list first");

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3085 = -1;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lmb;")
    public static class84 field3081 = field3076;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lmb;")
    private static class84 field3079 = class79.method672(true, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lmb;")
    public static class84 field3091 = field3079;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lmb;")
    private static class84 field3095 = class79.method672(true, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3075 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lmb;")
    public static class84 field3089 = field3095;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3096 = 255;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Lmb;")
    private static class84 field3098 = class79.method672(true, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lr;")
    public static class112 field3078;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lsc;")
    public static class121 field3083;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Ljd;")
    public static class66 field3097;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lob;")
    public static class96 field3093;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[Lr;")
    public static class112[] field3088;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    public static final void method1041(byte arg0, int arg1) {
        field3077++;
        class37 var2 = (class37) class105.field2552.method959(true, (long) arg1);
        if (arg0 == 73 && var2 != null) {
            for (int var3 = 0; var3 < var2.field826.length; var3++) {
                var2.field826[var3] = -1;
                var2.field822[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ldf;Ldf;B)V")
    public static final void method1042(class28 arg0, class28 arg1, byte arg2) {
        if (arg2 != -13) {
            return;
        }
        field3092++;
        class80.field1983.method599(arg2 ^ 0x69);
        if (class145.field3495 == 0 || class145.field3495 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg1.method213(class118.field2828, 180, 74 - var3, 16777215);
            class142.method1160(28, var4, 304, 34, 9179409);
            class142.method1160(29, var4 + 1, 302, 32, 0);
            class142.method1151(30, var4 + 2, class40.field926 * 3, 30, 9179409);
            class142.method1151(class40.field926 * 3 + 30, var4 - -2, 300 - class40.field926 * 3, 30, 0);
            arg1.method213(class52.field1162, 180, 105 - var3, 16777215);
        }
        if (class145.field3495 == 20) {
            class57.field1426.method979(0, 0);
            byte var5 = 40;
            arg1.method202(class52.field1186, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg1.method202(class52.field1159, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg1.method202(class52.field1179, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg1.method223(class51.method408(new class84[] { class66.field1631, class52.field1166 }, arg2 ^ 0x1B), 90, var22, 16777215, true);
            int var23 = var22 + 15;
            arg1.method223(class51.method408(new class84[] { class96.field2390, class52.field1180.method710(-28899) }, 122), 92, var23, 16777215, true);
            int var24 = var23 + 15;
        }
        if (class145.field3495 == 10) {
            class57.field1426.method979(0, 0);
            if (class110.field2666 == 0) {
                byte var6 = 100;
                byte var7 = 120;
                byte var8 = 80;
                arg1.method202(class11.field194, 180, var8, 16776960, true);
                class24.field581.method979(var6 - 73, var7 - 20);
                arg1.method220(class72.field1762, var6 - 73, var7 + -20, 144, 40, 16777215, true, 1, 1, 0);
                int var25 = var8 + 30;
                short var9 = 260;
                class24.field581.method979(var9 - 73, var7 + -20);
                arg1.method220(class109.field2640, var9 - 73, var7 - 20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class110.field2666 == 2) {
                byte var10 = 100;
                byte var11 = 40;
                arg1.method202(class52.field1186, 180, var11, 16776960, true);
                short var12 = 150;
                int var26 = var11 + 15;
                arg1.method202(class52.field1159, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                arg1.method202(class52.field1179, 180, var27, 16776960, true);
                int var28 = var27 + 15;
                int var29 = var28 + 10;
                arg1.method223(class51.method408(new class84[] { class66.field1631, class52.field1166, class5.field100 % 40 < 20 & class92.field2305 == 0 ? class54.field1248 : class52.field1171 }, 1), 90, var29, 16777215, true);
                int var30 = var29 + 15;
                arg1.method223(class51.method408(new class84[] { class96.field2390, class52.field1180.method710(-28899), class92.field2305 == 1 & class5.field100 % 40 < 20 ? class54.field1248 : class52.field1171 }, -81), 92, var30, 16777215, true);
                int var31 = var30 + 15;
                class24.field581.method979(var10 - 73, var12 + -20);
                arg1.method202(class89.field2222, var10, var12 + 5, 16777215, true);
                short var13 = 260;
                class24.field581.method979(var13 - 73, var12 + -20);
                arg1.method202(client.field470, var13, var12 + 5, 16777215, true);
            } else if (class110.field2666 == 3) {
                short var14 = 180;
                arg1.method202(class138.field3328, 180, 40, 16776960, true);
                short var15 = 150;
                byte var16 = 65;
                arg1.method202(class136.field3254, 180, var16, 16777215, true);
                int var32 = var16 + 15;
                arg1.method202(class62.field1548, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg1.method202(class52.field1181, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                arg1.method202(class146.field3578, 180, var34, 16777215, true);
                int var35 = var34 + 15;
                class24.field581.method979(var14 - 73, var15 + -20);
                arg1.method202(client.field470, var14, var15 + 5, 16777215, true);
            }
        }
        class17.method115(-257);
        try {
            Graphics var17 = class92.field2296.getGraphics();
            class80.field1983.method122(var17, 202, 171, 0);
            class144.field3459.method122(var17, 0, 0, 0);
            field3097.method122(var17, 637, 0, 0);
            if (class24.field572) {
                class24.field572 = false;
                class90.field2263.method122(var17, 128, 0, arg2 ^ 0xFFFFFFF3);
                class16.field363.method122(var17, 202, 371, 0);
                class105.field2551.method122(var17, 0, 265, 0);
                class92.field2297.method122(var17, 562, 265, 0);
                class71.field1742.method122(var17, 128, 171, 0);
                class47.field1025.method122(var17, 562, 171, arg2 + 13);
            }
        } catch (Exception var18) {
            class92.field2296.repaint();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1043(int arg0) {
        field3097 = null;
        field3076 = null;
        field3083 = null;
        field3089 = null;
        field3081 = null;
        field3079 = null;
        field3091 = null;
        field3078 = null;
        field3098 = null;
        field3082 = null;
        field3095 = null;
        if (arg0 == -1) {
            field3088 = null;
            field3093 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1044(byte arg0, byte[] arg1) {
        field3100++;
        if (arg0 != 4) {
            return null;
        }
        if (this.field3099 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3087 / (long) this.field3084) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field3099[var6];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field3087 + var6;
                int var14 = var13 / this.field3084;
                var5 += var14;
                var6 = var13 - this.field3084 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method1045(byte arg0) {
        class124.field2997 = new class16();
        if (arg0 <= -25) {
            field3086++;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)I")
    public final int method1046(byte arg0, int arg1) {
        if (arg0 != 21) {
            this.method1044((byte) 87, null);
        }
        field3090++;
        if (this.field3099 != null) {
            arg1 = (int) ((long) this.field3087 * (long) arg1 / (long) this.field3084);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
    public final int method1047(int arg0, boolean arg1) {
        field3080++;
        if (this.field3099 != null) {
            arg0 = (int) ((long) this.field3087 * (long) arg0 / (long) this.field3084) + 6;
        }
        return arg1 ? 6 : arg0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1048(int arg0) {
        class143.field3447 = class136.field3227;
        class76.field1891 = class88.field2205;
        class88.field2216 = class16.field354;
        class10.field175 = class22.field510;
        class76.field1897 = class140.field3365;
        class76.field1901 = class88.field2205;
        class62.field1548 = class111.field2680;
        class118.field2828 = class71.field1740;
        class89.field2228 = class68.field1669;
        class144.field3483 = class24.field577;
        class76.field1872 = class88.field2205;
        class129.field3118 = class92.field2295;
        class146.field3573 = class8.field121;
        class19.field400 = class86.field2134;
        class22.field516 = class50.field1067;
        class16.field365 = class49.field1050;
        class1.field8 = class33.field739;
        class59.field1470 = class64.field1579;
        class65.field1600 = class90.field2243;
        class14.field281 = class97.field2399;
        class91.field2280 = class63.field1571;
        class10.field158 = class27.field654;
        class76.field1885 = class88.field2205;
        class125.field3023 = class146.field3601;
        class37.field828 = class93.field2320;
        class30.field714 = class70.field1704;
        class123.field2984 = class69.field1681;
        class24.field554 = class15.field322;
        class141.field3398 = class119.field2852;
        class123.field2971 = class146.field3590;
        client.field491 = class143.field3434;
        field3094++;
        class16.field331 = class47.field1022;
        class36.field797 = class131.field3144;
        class76.field1912 = class88.field2205;
        class83.field2049 = class109.field2642;
        class124.field3013 = class92.field2292;
        class1.field9 = class76.field1914;
        client.field470 = class80.field1984;
        class33.field737 = class97.field2397;
        class53.field1222 = class38.field843;
        class43.field954 = class14.field278;
        class22.field527 = class131.field3143;
        class15.field328 = class110.field2649;
        class96.field2390 = class131.field3153;
        class43.field951 = class36.field804;
        class143.field3435 = class136.field3227;
        class64.field1584 = class88.field2207;
        class50.field1061 = client.field473;
        class22.field532 = class47.field1034;
        class76.field1881 = class140.field3365;
        class146.field3589 = class115.field2748;
        class75.field1843 = class52.field1189;
        class119.field2843 = class108.field2605;
        class6.field102 = class110.field2663;
        class76.field1923 = class145.field3501;
        class36.field795 = class139.field3342;
        class146.field3578 = class1.field21;
        class90.field2260 = class62.field1545;
        class144.field3460 = class102.field2483;
        class6.field108 = class84.field2102;
        class76.field1867 = class88.field2205;
        class70.field1717 = class124.field3014;
        class76.field1894 = class88.field2205;
        class15.field317 = class17.field373;
        class76.field1902 = class88.field2205;
        class124.field3002 = class58.field1449;
        class77.field1942 = class82.field2016;
        client.field466 = class92.field2302;
        client.field464 = client.field472;
        class136.field3238 = class41.field943;
        class139.field3353 = class134.field3215;
        class43.field957 = class57.field1414;
        class36.field817 = class139.field3342;
        class122.field2933 = class20.field424;
        class19.field406 = class146.field3585;
        class5.field77 = class20.field421;
        class44.field979 = class41.field935;
        class118.field2810 = class52.field1178;
        class90.field2246 = class141.field3393;
        class11.field197 = class92.field2308;
        class82.field2014 = class94.field2332;
        class90.field2245 = class43.field956;
        class118.field2834 = class144.field3481;
        class118.field2813 = class126.field3044;
        class115.field2776 = class89.field2219;
        class134.field3214 = class127.field3064;
        class76.field1905 = class47.field1026;
        class146.field3596 = class49.field1042;
        class118.field2837 = class11.field208;
        class92.field2307 = class82.field2009;
        class52.field1183 = class143.field3449;
        class117.field2796 = class22.field502;
        class118.field2806 = class52.field1178;
        class2.field60 = class33.field729;
        class76.field1886 = class126.field3044;
        class125.field3027 = class117.field2797;
        field3089 = class20.field426;
        class131.field3151 = class108.field2616;
        class22.field528 = class38.field841;
        class138.field3333 = class107.field2597;
        class66.field1631 = class94.field2329;
        class76.field1900 = field3098;
        class76.field1893 = class88.field2205;
        class106.field2564 = class70.field1728;
        class76.field1913 = class38.field834;
        class118.field2831 = class126.field3044;
        class126.field3054 = class103.field2515;
        class115.field2763 = class127.field3072;
        class118.field2836 = class44.field975;
        class91.field2272 = class5.field73;
        class80.field1985 = class8.field154;
        class76.field1888 = class96.field2380;
        class68.field1647 = class138.field3334;
        class22.field543 = class47.field1034;
        class77.field1924 = class88.field2205;
        class77.field1938 = class134.field3209;
        field3081 = class144.field3465;
        class97.field2406 = class43.field948;
        class92.field2294 = class129.field3114;
        class145.field3486 = class143.field3428;
        class83.field2023 = class125.field3018;
        class109.field2640 = class54.field1251;
        class136.field3254 = class129.field3103;
        class105.field2543 = class111.field2670;
        class102.field2477 = class38.field842;
        class115.field2774 = class47.field1026;
        class15.field330 = client.field488;
        class43.field952 = client.field496;
        class33.field741 = class96.field2389;
        class76.field1876 = class70.field1708;
        class76.field1899 = class87.field2165;
        class69.field1690 = field3082;
        class119.field2850 = class141.field3396;
        class66.field1639 = client.field471;
        class146.field3599 = class140.field3362;
        class76.field1907 = class8.field143;
        class54.field1247 = class41.field942;
        class134.field3205 = class49.field1044;
        class146.field3569 = class64.field1583;
        class124.field3004 = class33.field734;
        class76.field1908 = class118.field2815;
        class118.field2830 = class126.field3044;
        class52.field1181 = class91.field2267;
        class94.field2326 = class98.field2414;
        class124.field3008 = class84.field2103;
        class68.field1667 = class27.field645;
        class76.field1884 = class38.field834;
        class76.field1903 = class88.field2205;
        class68.field1645 = class8.field153;
        class143.field3443 = class109.field2641;
        class64.field1578 = class143.field3434;
        class109.field2639 = class10.field174;
        class76.field1877 = class88.field2205;
        class54.field1239 = class19.field394;
        class72.field1762 = class134.field3216;
        class77.field1948 = class145.field3527;
        class118.field2817 = class140.field3363;
        class76.field1889 = class88.field2205;
        class76.field1880 = class88.field2205;
        class40.field916 = class8.field142;
        class63.field1561 = class108.field2608;
        class117.field2793 = class51.field1083;
        class120.field2884 = class59.field1472;
        class86.field2142 = class141.field3406;
        class84.field2072 = class76.field1909;
        class76.field1878 = class88.field2205;
        class136.field3242 = class75.field1861;
        class86.field2144 = class117.field2795;
        class76.field1883 = class14.field269;
        class103.field2514 = client.field467;
        class110.field2657 = class19.field403;
        class20.field414 = class110.field2660;
        class110.field2668 = class19.field403;
        class63.field1566 = class90.field2243;
        class79.field1968 = class2.field54;
        class107.field2593 = class38.field848;
        class49.field1053 = class105.field2547;
        class77.field1928 = class126.field3052;
        class27.field648 = class41.field927;
        client.field498 = class60.field1499;
        class115.field2749 = class15.field327;
        field3091 = class49.field1059;
        class39.field862 = class138.field3327;
        class83.field2039 = class76.field1921;
        class76.field1873 = class88.field2205;
        class47.field1033 = class111.field2675;
        class76.field1887 = class74.field1816;
        class11.field194 = class27.field663;
        class64.field1582 = class15.field321;
        class89.field2222 = class117.field2794;
        class133.field3192 = class115.field2753;
        class125.field3020 = class138.field3326;
        class71.field1735 = class138.field3338;
        class41.field938 = class94.field2328;
        class57.field1400 = class89.field2217;
        class2.field41 = class24.field578;
        class138.field3328 = class93.field2313;
        class76.field1911 = class39.field871;
        class141.field3368 = class59.field1466;
        class76.field1896 = class88.field2205;
        if (arg0 != 127) {
            field3083 = null;
        }
        class126.field3050 = class66.field1624;
        class75.field1839 = class126.field3036;
        class84.field2104 = class79.field1960;
        class39.field872 = class108.field2617;
        class70.field1712 = class126.field3045;
        class103.field2507 = class33.field732;
        class37.field824 = class127.field3059;
        class87.field2168 = class126.field3041;
        class76.field1871 = class88.field2205;
        class52.field1187 = class127.field3065;
        class96.field2376 = class40.field910;
        class76.field1882 = class95.field2356;
        class126.field3039 = class14.field276;
        class40.field921 = class16.field336;
        class83.field2032 = class62.field1547;
        class22.field540 = class60.field1482;
        class24.field562 = class134.field3203;
        if (class39.field901) {
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
    public class128(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class79.method674(24599, arg1, arg0);
            int var4 = arg1 / var3;
            this.field3087 = var4;
            int var5 = arg0 / var3;
            this.field3099 = new int[var5][14];
            this.field3084 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field3099[var6];
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var7) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
