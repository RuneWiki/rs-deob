import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class125 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[S")
    public static short[] field2766 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field2769 = 5063219;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lgg;")
    private static class63 field2767 = class116.method911(43, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Z")
    public static boolean field2774;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2767 = null;
        field2766 = null;
        if (arg0 != 31173) {
            field2766 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2773++;
        class178.method1187(arg4, arg0, arg2 + arg4, arg0 - -arg1);
        class25.method243();
        class93.field2187++;
        class140.method1009((byte) -29, true);
        class151.method1057(true, (byte) 93);
        class140.method1009((byte) -29, false);
        class151.method1057(false, (byte) 102);
        class77.method692((byte) -83);
        class1.method2((byte) 125);
        if (!class83.field1968) {
            int var5 = class89.field2088;
            if (class195.field3919 / 256 > var5) {
                var5 = class195.field3919 / 256;
            }
            if (class110.field2488[4] && var5 < class143.field3061[4] + 128) {
                var5 = class143.field3061[4] + 128;
            }
            int var6 = class91.field2128 + class68.field1710 & 0x7FF;
            class175.method1168(class150.field3160, class202.field4002, var6, var5, 29878, class112.method894(-95, class112.field2528, class3.field72.field1141, class3.field72.field1144) - 50, 600 - -(var5 * 3));
        }
        int var7;
        if (class83.field1968) {
            var7 = class134.method980((byte) -52);
        } else {
            var7 = class55.method543(arg3 ^ 0x258);
        }
        int var8 = class39.field924;
        int var9 = class35.field828;
        if (arg3 != 600) {
            method948(91);
        }
        int var10 = class21.field491;
        int var11 = class123.field2719;
        int var12 = class32.field778;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class110.field2488[var13]) {
                int var16 = (int) ((double) -class14.field352[var13] + Math.random() * (double) (class14.field352[var13] * 2 + 1) + Math.sin((double) class39.field928[var13] / 100.0D * (double) class28.field657[var13]) * (double) class143.field3061[var13]);
                if (var13 == 3) {
                    class32.field778 = class32.field778 + var16 & 0x7FF;
                }
                if (var13 == 2) {
                    class21.field491 += var16;
                }
                if (var13 == 4) {
                    class123.field2719 += var16;
                    if (class123.field2719 < 128) {
                        class123.field2719 = 128;
                    }
                    if (class123.field2719 > 383) {
                        class123.field2719 = 383;
                    }
                }
                if (var13 == 1) {
                    class39.field924 += var16;
                }
                if (var13 == 0) {
                    class35.field828 += var16;
                }
            }
        }
        int var14 = class100.field2365;
        int var15 = class188.field3794;
        if (arg4 <= var14 && arg2 + arg4 > var14 && arg0 <= var15 && var15 < arg0 + arg1) {
            class36.field847 = 0;
            class36.field852 = class100.field2365 - arg4;
            class36.field840 = true;
            class36.field851 = class188.field3794 - arg0;
        } else {
            class36.field840 = false;
            class36.field847 = 0;
        }
        class198.method1294((byte) -30);
        class178.method1191(arg4, arg0, arg2, arg1, 0);
        class198.method1294((byte) -30);
        class132.method970(class35.field828, class39.field924, class21.field491, class123.field2719, class32.field778, var7);
        class198.method1294((byte) -30);
        class118.method919();
        class28.method274(arg0, arg2, arg4, 12733, arg1);
        class100.method839(arg0, arg4, true);
        ((class190) class25.field569).method1247(class131.field2852, false);
        class202.method1336(arg4, arg1, 0, arg0, arg2);
        class39.field924 = var8;
        class32.field778 = var12;
        class123.field2719 = var11;
        class21.field491 = var10;
        class35.field828 = var9;
        if (class163.field3361 && class41.method368(false, arg3 ^ 0x258, true) == 0) {
            class163.field3361 = false;
        }
        if (class163.field3361) {
            class178.method1191(arg4, arg0, arg2, arg1, 0);
            class60.method561(false, 104, class11.field267);
        }
        if (!class163.field3361 && !class188.field3796 && var14 >= arg4 && arg2 + arg4 > var14 && arg0 <= var15 && var15 < arg0 + arg1) {
            class192.method1266(arg4, var14, 104, var15, arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method948(int arg0) {
        class42.field982 = class152.field3187;
        class30.field761 = class169.field3489;
        class155.field3240 = class169.field3489;
        class170.field3502 = field2767;
        class19.field447 = class29.field696;
        class43.field1039 = class73.field1818;
        class54.field1424 = class45.field1075;
        class71.field1784 = class175.field3594;
        class164.field3376 = class129.field2817;
        class193.field3909 = class75.field1845;
        class55.field1457 = class124.field2739;
        class30.field725 = class75.field1859;
        class180.field3658 = class110.field2485;
        class196.field3927 = class11.field249;
        class30.field743 = class169.field3489;
        class30.field751 = class169.field3489;
        class74.field1820 = class135.field2917;
        class175.field3607 = class196.field3945;
        class37.field866 = class98.field2327;
        class124.field2748 = class48.field1185;
        class30.field734 = class169.field3489;
        class71.field1783 = class175.field3588;
        class147.field3109 = class57.field1494;
        class4.field124 = class196.field3933;
        class69.field1731 = class68.field1703;
        class30.field736 = class169.field3489;
        class12.field292 = class51.field1246;
        class1.field1 = class118.field2635;
        class9.field218 = class40.field941;
        class187.field3783 = class111.field2505;
        class49.field1196 = class124.field2759;
        class49.field1199 = class142.field3046;
        class33.field799 = class113.field2540;
        class30.field722 = class169.field3489;
        class30.field732 = class88.field2079;
        class21.field506 = class13.field306;
        class30.field769 = class169.field3489;
        class126.field2780 = class202.field3997;
        class17.field412 = class122.field2701;
        class104.field2402 = class122.field2699;
        class121.field2667 = class171.field3542;
        class68.field1711 = class162.field3342;
        class167.field3454 = class158.field3269;
        class30.field740 = class42.field1017;
        class30.field741 = class169.field3489;
        class27.field614 = class116.field2597;
        class30.field756 = class184.field3724;
        class141.field3032 = class94.field2263;
        class116.field2604 = class68.field1699;
        class171.field3548 = class191.field3880;
        class132.field2874 = class84.field1995;
        class129.field2819 = class81.field1950;
        class14.field339 = class173.field3567;
        class23.field540 = class118.field2644;
        if (arg0 != -384) {
            method949(false);
        }
        class30.field753 = class169.field3489;
        class155.field3242 = class51.field1233;
        class171.field3552 = class187.field3782;
        class11.field267 = class122.field2705;
        class130.field2845 = class112.field2526;
        class30.field762 = class177.field3626;
        class42.field1009 = class85.field2035;
        class65.field1652 = class12.field295;
        class134.field2912 = class127.field2798;
        class142.field3042 = class176.field3617;
        class143.field3060 = class108.field2442;
        class30.field765 = class169.field3489;
        class30.field739 = class169.field3489;
        class30.field764 = class169.field3489;
        class10.field232 = class42.field1017;
        class79.field1932 = class117.field2628;
        class154.field3229 = class99.field2335;
        class94.field2264 = class117.field2627;
        class132.field2870 = class84.field1995;
        class114.field2558 = class12.field290;
        class136.field2949 = class190.field3855;
        class127.field2809 = class129.field2818;
        class30.field766 = class68.field1701;
        class84.field1994 = class184.field3739;
        class93.field2229 = class141.field3035;
        class10.field246 = class164.field3380;
        class89.field2096 = class9.field198;
        class142.field3050 = class176.field3617;
        class32.field780 = class6.field161;
        class28.field669 = class28.field644;
        class118.field2633 = class138.field2975;
        class71.field1795 = class181.field3678;
        class33.field804 = class88.field2068;
        class138.field2963 = class170.field3496;
        class118.field2634 = class192.field3898;
        class84.field2001 = class75.field1848;
        class104.field2403 = class140.field3021;
        class88.field2065 = class88.field2082;
        class73.field1817 = class206.field4061;
        class30.field750 = class169.field3489;
        class85.field2042 = class123.field2717;
        class143.field3071 = class193.field3903;
        client.field712 = class14.field322;
        class22.field518 = class32.field787;
        class126.field2788 = class202.field3997;
        class148.field3124 = class47.field1096;
        class30.field752 = class169.field3489;
        class106.field2413 = class132.field2877;
        class62.field1566 = class155.field3239;
        class174.field3582 = class113.field2546;
        class134.field2911 = class41.field950;
        class73.field1815 = class206.field4061;
        class191.field3887 = class15.field372;
        class80.field1942 = class52.field1266;
        class60.field1527 = class182.field3683;
        class22.field527 = class198.field3958;
        class30.field730 = class49.field1201;
        class30.field733 = class104.field2386;
        class39.field932 = class51.field1260;
        class30.field731 = class60.field1542;
        class78.field1908 = class180.field3662;
        class103.field2374 = class117.field2607;
        class30.field757 = class35.field824;
        class134.field2892 = class134.field2909;
        class30.field754 = class183.field3704;
        class83.field1975 = class74.field1837;
        class10.field245 = class42.field1017;
        class30.field729 = class29.field684;
        class64.field1641 = class90.field2109;
        class166.field3413 = class28.field635;
        class30.field748 = class169.field3489;
        class176.field3623 = class14.field341;
        class60.field1539 = class64.field1644;
        class85.field2009 = class167.field3458;
        class189.field3834 = class37.field905;
        class30.field723 = class169.field3489;
        class55.field1455 = class124.field2734;
        class203.field4018 = class133.field2887;
        class124.field2755 = class47.field1118;
        class5.field148 = class166.field3408;
        class10.field223 = class127.field2805;
        class47.field1125 = class150.field3158;
        class189.field3817 = class141.field3034;
        class75.field1862 = class127.field2801;
        class3.field100 = class191.field3892;
        class30.field726 = class169.field3489;
        class57.field1499 = class118.field2642;
        class97.field2313 = class199.field3982;
        class155.field3237 = class3.field78;
        class78.field1901 = class166.field3407;
        class191.field3886 = class147.field3100;
        class116.field2591 = class68.field1699;
        class155.field3233 = class43.field1046;
        class30.field749 = class60.field1542;
        class13.field303 = class35.field821;
        class138.field2960 = class9.field210;
        class203.field4029 = class168.field3477;
        class22.field520 = class59.field1516;
        class143.field3069 = class43.field1036;
        class78.field1900 = class123.field2708;
        class139.field2978 = class164.field3374;
        class130.field2835 = class196.field3931;
        class161.field3325 = class43.field1038;
        class30.field767 = class169.field3489;
        class30.field746 = class169.field3489;
        class68.field1714 = class5.field147;
        class35.field817 = class19.field458;
        class202.field4001 = client.field713;
        class135.field2925 = class99.field2340;
        class166.field3409 = class5.field145;
        class131.field2851 = class9.field212;
        class10.field236 = class127.field2805;
        class182.field3692 = class29.field698;
        class10.field229 = class42.field1017;
        class150.field3165 = class1.field6;
        class90.field2113 = class83.field1974;
        class182.field3687 = class143.field3065;
        class23.field534 = class37.field919;
        class96.field2273 = class22.field528;
        class198.field3956 = class139.field2987;
        field2770++;
        class190.field3867 = class90.field2111;
        class51.field1261 = class192.field3901;
        class90.field2107 = class127.field2790;
        class106.field2422 = class30.field738;
        class91.field2126 = class89.field2090;
        class10.field237 = class166.field3397;
        class30.field770 = class54.field1417;
        class30.field747 = class29.field684;
        class28.field619 = class113.field2541;
        class83.field1970 = class190.field3870;
        class96.field2296 = class9.field207;
        class12.field282 = class190.field3873;
        class14.field329 = class23.field529;
        class180.field3665 = class153.field3194;
        class30.field755 = class169.field3489;
        class129.field2825 = class81.field1950;
        class190.field3864 = class98.field2317;
        class177.field3629 = class75.field1855;
        class103.field2372 = class9.field187;
        class30.field727 = class169.field3489;
        class12.field284 = class32.field786;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method949(boolean arg0) {
        field2771++;
        if (arg0) {
            method946(-70);
        }
        for (class15 var1 = (class15) class84.field1993.method1033(0); var1 != null; var1 = (class15) class84.field1993.method1035(0)) {
            if (var1.field367 != null) {
                class124.field2737.method869(var1.field367);
                var1.field367 = null;
            }
            if (var1.field356 != null) {
                class124.field2737.method869(var1.field356);
                var1.field356 = null;
            }
        }
        class84.field1993.method1031(0);
    }
}
