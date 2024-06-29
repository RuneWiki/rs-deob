import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
    public boolean field326 = true;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lwf;")
    public static class159 field329 = null;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field331 = 1;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lic;")
    public static class59 field337 = class59.method433(0, "ams");

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lic;")
    public static class59 field338 = class59.method433(0, "logo");

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Llf;")
    public static class82 field335 = new class82(64);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lwf;")
    public static class159 field343;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method89(int arg0, int arg1) {
        class86.method709(-119);
        field336++;
        class75.method626(arg1 ^ 0x1343);
        int var2 = class63.method524(arg0, -31647).field2226;
        if (arg1 == var2) {
            return;
        }
        int var3 = class85.field2124[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class11.method67(0.9D);
                ((class43) class11.field235).method329(0, 0.9D);
            }
            if (var3 == 2) {
                class11.method67(0.8D);
                ((class43) class11.field235).method329(0, 0.8D);
            }
            if (var3 == 3) {
                class11.method67(0.7D);
                ((class43) class11.field235).method329(0, 0.7D);
            }
            if (var3 == 4) {
                class11.method67(0.6D);
                ((class43) class11.field235).method329(0, 0.6D);
            }
            class25.method176(false);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class49.field1242 != var4) {
                if (class49.field1242 == 0 && class81.field2004 != -1) {
                    class94.method781(0, var4, false, -66, class73.field1832, class81.field2004);
                    class63.field1625 = false;
                } else if (var4 == 0) {
                    class100.method808(arg1 + 1);
                    class63.field1625 = false;
                } else {
                    class158.method1218(var4, 114);
                }
                class49.field1242 = var4;
            }
        }
        if (var2 == 5) {
            class134.field2977 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class56.field1373 = 127;
            }
            if (var3 == 1) {
                class56.field1373 = 96;
            }
            if (var3 == 2) {
                class56.field1373 = 64;
            }
            if (var3 == 3) {
                class56.field1373 = 32;
            }
            if (var3 == 4) {
                class56.field1373 = 0;
            }
        }
        if (var2 == 6) {
            class57.field1385 = var3;
        }
        if (var2 == 9) {
            class32.field865 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            class73.field1804 = 127;
        }
        if (var3 == 1) {
            class73.field1804 = 96;
        }
        if (var3 == 2) {
            class73.field1804 = 64;
        }
        if (var3 == 3) {
            class73.field1804 = 32;
        }
        if (var3 == 4) {
            class73.field1804 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method90(int arg0) {
        field337 = null;
        field343 = null;
        field329 = null;
        field338 = null;
        if (arg0 == 0) {
            field335 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method91(int arg0) {
        class31.field837 = class57.field1390;
        class31.field811 = class57.field1390;
        class31.field826 = class57.field1390;
        class33.field880 = class40.field1039;
        class100.field2472 = class137.field3044;
        class59.field1450 = class3.field61;
        class80.field1985 = class85.field2142;
        class26.field650 = class23.field562;
        class34.field910 = class155.field3368;
        class153.field3318 = class42.field1070;
        class18.field348 = class84.field2107;
        class100.field2467 = class80.field1999;
        class136.field3018 = class63.field1618;
        class106.field2530 = class51.field1259;
        class35.field929 = class82.field2030;
        class30.field784 = class134.field2983;
        class114.field2703 = class158.field3521;
        class65.field1639 = class43.field1100;
        class76.field1874 = class5.field119;
        class31.field819 = class80.field2002;
        class38.field995 = class56.field1371;
        class108.field2601 = class86.field2161;
        class31.field849 = class57.field1390;
        class88.field2211 = class75.field1860;
        class55.field1348 = client.field490;
        class65.field1644 = class86.field2160;
        client.field500 = class159.field3653;
        class51.field1274 = class3.field57;
        class31.field822 = client.field486;
        class155.field3373 = class53.field1314;
        class27.field707 = class85.field2141;
        class63.field1616 = class76.field1862;
        class31.field795 = class57.field1390;
        class120.field2767 = class114.field2706;
        class120.field2773 = class147.field3192;
        class31.field818 = class57.field1390;
        class2.field47 = class63.field1620;
        class90.field2292 = class137.field3054;
        class22.field530 = class21.field472;
        class19.field374 = class80.field1988;
        class107.field2554 = class32.field852;
        class126.field2863 = class143.field3150;
        class68.field1692 = class8.field162;
        class31.field800 = class57.field1390;
        class47.field1207 = class57.field1391;
        class31.field820 = class15.field300;
        class31.field833 = class60.field1492;
        class18.field370 = class134.field2968;
        class99.field2462 = class33.field890;
        class80.field1981 = class15.field296;
        class84.field2115 = class51.field1278;
        class157.field3468 = class29.field765;
        class31.field836 = class108.field2611;
        class68.field1752 = class56.field1376;
        class7.field144 = class116.field2720;
        class148.field3244 = class88.field2217;
        class30.field778 = class88.field2225;
        class108.field2617 = class43.field1111;
        class90.field2298 = class137.field3054;
        class31.field798 = class60.field1525;
        class24.field589 = class18.field372;
        class157.field3453 = class145.field3168;
        class29.field758 = class130.field2917;
        class31.field792 = class57.field1390;
        class31.field794 = class134.field2990;
        class134.field2982 = class131.field2947;
        class62.field1589 = class148.field3236;
        class136.field3016 = class118.field2737;
        class43.field1094 = class70.field1780;
        class126.field2855 = class147.field3205;
        class87.field2205 = class57.field1394;
        class64.field1633 = client.field485;
        class149.field3271 = class145.field3163;
        class31.field810 = class57.field1390;
        class38.field997 = class134.field2984;
        class53.field1311 = class147.field3204;
        class80.field2001 = class96.field2429;
        class139.field3107 = class90.field2271;
        class7.field135 = class149.field3257;
        client.field491 = class73.field1834;
        class51.field1282 = class56.field1378;
        class26.field660 = class99.field2450;
        class46.field1187 = class139.field3097;
        class31.field825 = class55.field1350;
        class90.field2293 = class84.field2112;
        class1.field21 = class52.field1302;
        class153.field3307 = class147.field3208;
        class125.field2846 = class2.field35;
        class10.field224 = class10.field228;
        class127.field2878 = class36.field938;
        class4.field83 = class77.field1880;
        class31.field803 = class60.field1483;
        class31.field802 = class16.field323;
        class31.field796 = class57.field1390;
        class112.field2686 = class79.field1978;
        class106.field2532 = class27.field705;
        class153.field3319 = class63.field1607;
        class31.field814 = class57.field1390;
        class80.field1987 = class142.field3118;
        class31.field832 = class57.field1390;
        class90.field2273 = class53.field1318;
        if (arg0 != 32) {
            return;
        }
        class31.field793 = class57.field1390;
        class31.field805 = class57.field1390;
        class88.field2216 = class51.field1262;
        class106.field2521 = class149.field3269;
        class98.field2443 = class103.field2498;
        class36.field956 = class49.field1227;
        class31.field828 = class94.field2399;
        class115.field2712 = class9.field183;
        class31.field835 = class57.field1390;
        class90.field2300 = class84.field2112;
        class31.field843 = class137.field3054;
        class31.field787 = class55.field1350;
        class79.field1979 = class44.field1132;
        class9.field178 = class80.field1996;
        class86.field2179 = class52.field1296;
        class62.field1572 = class143.field3157;
        class21.field476 = class114.field2707;
        class137.field3052 = class127.field2875;
        class158.field3483 = class103.field2513;
        class59.field1449 = class15.field293;
        class7.field147 = class138.field3076;
        class96.field2430 = class25.field621;
        class21.field450 = class34.field911;
        class5.field116 = class98.field2441;
        class22.field531 = class151.field3286;
        class148.field3242 = class88.field2217;
        class2.field51 = class57.field1395;
        class131.field2949 = class32.field858;
        class94.field2398 = class10.field230;
        class158.field3506 = class34.field904;
        class49.field1234 = class94.field2403;
        class38.field976 = class85.field2138;
        class90.field2299 = class102.field2487;
        class33.field882 = class57.field1390;
        class31.field850 = class94.field2399;
        class143.field3140 = class48.field1213;
        class60.field1462 = class30.field775;
        class62.field1570 = class49.field1217;
        class89.field2260 = class131.field2936;
        class158.field3514 = class65.field1642;
        class27.field703 = class116.field2721;
        class95.field2417 = class70.field1783;
        class81.field2014 = class106.field2533;
        class149.field3264 = class125.field2844;
        class87.field2209 = class64.field1637;
        class107.field2588 = class103.field2505;
        class3.field55 = class9.field177;
        class100.field2465 = class137.field3044;
        class53.field1313 = class96.field2427;
        class31.field845 = class57.field1390;
        class130.field2922 = class106.field2542;
        class90.field2301 = class137.field3054;
        class56.field1372 = class4.field90;
        class22.field510 = class70.field1772;
        class23.field533 = class51.field1270;
        class89.field2249 = class77.field1882;
        class54.field1332 = class100.field2466;
        class8.field171 = class153.field3325;
        class73.field1801 = class80.field1992;
        class52.field1301 = client.field478;
        field327++;
        class31.field824 = class57.field1390;
        class103.field2501 = class46.field1184;
        class128.field2904 = class54.field1341;
        class31.field809 = class57.field1390;
        class31.field807 = class57.field1390;
        class43.field1118 = class103.field2503;
        class81.field2021 = class106.field2533;
        class47.field1206 = class6.field121;
        class31.field790 = client.field481;
        class31.field839 = class57.field1390;
        class34.field906 = class41.field1053;
        class77.field1893 = class22.field516;
        class159.field3647 = class115.field2715;
        class35.field933 = class154.field3337;
        class130.field2919 = class70.field1777;
        class31.field830 = class57.field1390;
        class155.field3371 = client.field479;
        class76.field1871 = class40.field1017;
        class59.field1457 = class62.field1592;
        class22.field528 = class152.field3304;
        class35.field935 = class43.field1109;
        class153.field3326 = class27.field699;
        class136.field3024 = class81.field2016;
        class94.field2410 = class84.field2123;
        class68.field1716 = class155.field3361;
        class130.field2915 = class121.field2784;
        class130.field2929 = class106.field2542;
        class151.field3293 = class55.field1343;
        class134.field2976 = class151.field3288;
        class89.field2268 = class77.field1882;
        class41.field1062 = class87.field2203;
        class90.field2285 = class41.field1060;
        class96.field2433 = class25.field621;
        class5.field114 = class7.field139;
        class36.field958 = class63.field1619;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field326 = arg6;
        this.field341 = arg2;
        this.field330 = arg4;
        this.field333 = arg0;
        this.field328 = arg1;
        this.field339 = arg5;
        this.field332 = arg3;
    }
}
