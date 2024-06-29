import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class185 extends class132 {

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    public static int[] field3571 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field3580 = 0;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "[I")
    public static int[] field3578 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[Lsc;")
    public static class171[] field3576;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method1169(int arg0) {
        field3574++;
        class19 var1 = class179.field3415;
        synchronized (class179.field3415) {
            class1.field12 = class81.field1441;
            class39.field736 = class174.field3290;
            class195.field3793 = class109.field1976;
            class133.field2410 = class169.field3189;
            class158.field2823 = class45.field854;
            class134.field2429 = class176.field3351;
            class158.field2833 = class55.field988;
            class169.field3189 = arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class78.field1406[0].method1062(arg0, arg3);
        field3573++;
        class78.field1406[1].method1062(arg0, arg3 + arg2 - 16);
        int var6 = (arg2 - 32) * arg2 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg1 / (arg5 - arg2);
        class4.method27(arg0, arg3 + 16, 16, arg2 - 32, class74.field1386);
        if (arg4 != 28597) {
            return;
        }
        class4.method27(arg0, arg3 + var7 + 16, 16, var6, class35.field610);
        class4.method23(arg0, arg3 + var7 + 16, var6, class159.field2849);
        class4.method23(arg0 + 1, arg3 + 16 + var7, var6, class159.field2849);
        class4.method26(arg0, arg3 + var7 + 16, 16, class159.field2849);
        class4.method26(arg0, arg3 + var7 + 17, 16, class159.field2849);
        class4.method23(arg0 + 15, var7 + 16 + arg3, var6, class189.field3673);
        class4.method23(arg0 + 14, arg3 + var7 + 17, var6 - 1, class189.field3673);
        class4.method26(arg0, arg3 + var7 + var6 + 15, 16, class189.field3673);
        class4.method26(arg0 + 1, arg3 + var7 + 14 + var6, 15, class189.field3673);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field3576 = null;
        if (arg0 != 24191) {
            method1172(-80);
        }
        field3578 = null;
        field3571 = null;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public static final void method1172(int arg0) {
        class37.field709 = class156.field2798;
        class32.field567 = class8.field143;
        class74.field1387 = class14.field266;
        class146.field2627 = class138.field2504;
        class212.field4113 = class176.field3349;
        class134.field2425 = class172.field3270;
        class35.field659 = class146.field2630;
        class29.field488 = class19.field364;
        class99.field1858 = class38.field718;
        class125.field2248 = class83.field1477;
        class168.field3161 = class143.field2575;
        class10.field176 = class207.field3973;
        class91.field1697 = class54.field965;
        class47.field888 = class38.field725;
        class109.field1977 = class52.field946;
        class116.field2094 = class92.field1709;
        class168.field3149 = class143.field2575;
        class65.field1229 = class132.field2403;
        class127.field2304 = class158.field2831;
        class168.field3178 = class187.field3615;
        class168.field3170 = class143.field2575;
        class29.field484 = class212.field4111;
        class189.field3675 = class13.field237;
        class168.field3167 = class8.field142;
        class168.field3138 = class143.field2575;
        class63.field1179 = class161.field2907;
        class11.field198 = class190.field3705;
        class98.field1840 = class32.field568;
        class180.field3430 = class11.field195;
        class168.field3146 = class143.field2575;
        class6.field116 = class81.field1457;
        class168.field3150 = class132.field2396;
        class168.field3137 = class156.field2798;
        class168.field3158 = class143.field2575;
        class168.field3133 = class143.field2575;
        class168.field3174 = class143.field2575;
        class168.field3153 = class210.field4022;
        class99.field1846 = class182.field3510;
        class94.field1711 = class74.field1377;
        class141.field2568 = class195.field3788;
        class168.field3142 = class128.field2310;
        class208.field4000 = class57.field1012;
        class204.field3919 = class144.field2598;
        class168.field3148 = class143.field2575;
        class204.field3923 = class144.field2598;
        class5.field76 = class66.field1257;
        class133.field2414 = class167.field3029;
        class105.field1906 = class113.field2032;
        class174.field3289 = class41.field763;
        class157.field2812 = class18.field331;
        class66.field1270 = class109.field1978;
        class87.field1600 = class78.field1415;
        class82.field1466 = class205.field3938;
        class168.field3180 = class143.field2575;
        class1.field30 = class71.field1342;
        class168.field3132 = class143.field2575;
        class158.field2836 = class73.field1372;
        class127.field2296 = class52.field951;
        class128.field2323 = class184.field3548;
        class11.field197 = class91.field1701;
        class195.field3790 = class182.field3502;
        class168.field3140 = class143.field2575;
        class135.field2450 = class35.field621;
        class164.field2955 = class105.field1917;
        class191.field3720 = class136.field2470;
        class87.field1607 = class38.field724;
        class37.field708 = class85.field1578;
        class26.field471 = class206.field3964;
        class150.field2699 = class71.field1344;
        class168.field3171 = class210.field4022;
        class193.field3743 = class143.field2586;
        class168.field3164 = class143.field2575;
        class168.field3152 = class143.field2575;
        class43.field821 = class200.field3877;
        class168.field3141 = class143.field2575;
        class113.field2033 = class64.field1203;
        class111.field2021 = class35.field634;
        class168.field3177 = class143.field2575;
        class25.field455 = class112.field2026;
        class127.field2285 = class206.field3966;
        class45.field852 = class212.field4109;
        class35.field617 = class180.field3426;
        class110.field1990 = class62.field1165;
        class16.field305 = class65.field1230;
        class111.field1999 = class103.field1894;
        class15.field295 = class182.field3516;
        class109.field1972 = class20.field377;
        class7.field127 = class127.field2288;
        class60.field1113 = class111.field2015;
        class7.field135 = class115.field2088;
        class184.field3533 = class186.field3602;
        class117.field2115 = class153.field2749;
        class44.field846 = class25.field450;
        class146.field2635 = class68.field1312;
        class117.field2123 = class34.field575;
        class168.field3144 = class5.field75;
        class44.field848 = class194.field3763;
        int var1 = 111 % ((arg0 + 59) / 51);
        class38.field731 = class130.field2356;
        class168.field3157 = class176.field3367;
        class119.field2152 = class5.field87;
        class159.field2868 = class18.field335;
        class169.field3206 = class43.field824;
        class159.field2865 = class106.field1921;
        class84.field1537 = class84.field1538;
        class8.field141 = class126.field2262;
        class25.field452 = class178.field3402;
        class97.field1803 = class29.field490;
        class37.field697 = class156.field2798;
        class103.field1886 = class174.field3305;
        class164.field2956 = class44.field841;
        class127.field2278 = class207.field3977;
        class156.field2805 = class169.field3186;
        class99.field1850 = class197.field3840;
        class146.field2643 = class26.field468;
        class107.field1938 = class31.field533;
        class149.field2679 = class16.field298;
        class210.field4054 = class2.field37;
        class105.field1916 = class11.field206;
        class46.field876 = class37.field707;
        class7.field126 = class68.field1308;
        class202.field3905 = class119.field2149;
        class128.field2315 = class184.field3553;
        class126.field2265 = class73.field1368;
        class135.field2467 = class143.field2575;
        class97.field1822 = class29.field490;
        class20.field388 = class109.field1975;
        class34.field593 = class47.field896;
        class50.field932 = class37.field684;
        class103.field1887 = class101.field1873;
        class60.field1119 = class155.field2787;
        class151.field2713 = class201.field3890;
        class118.field2134 = class38.field732;
        class164.field2940 = class39.field738;
        class168.field3131 = class32.field566;
        class172.field3268 = class129.field2343;
        class168.field3136 = class170.field3243;
        field3572++;
        class81.field1458 = class205.field3940;
        class156.field2788 = class66.field1253;
        class81.field1460 = class67.field1301;
        class131.field2384 = class78.field1409;
        class117.field2114 = class153.field2749;
        class72.field1354 = class73.field1374;
        class168.field3169 = class143.field2575;
        class190.field3687 = class141.field2563;
        class14.field280 = class81.field1445;
        class168.field3151 = class40.field744;
        class168.field3175 = class143.field2575;
        class180.field3429 = class11.field195;
        class168.field3155 = class143.field2575;
        class38.field712 = class130.field2356;
        class168.field3162 = class143.field2575;
        class49.field906 = class143.field2588;
        class51.field943 = class132.field2401;
        class99.field1852 = class66.field1272;
        class76.field1402 = class91.field1696;
        class168.field3172 = class37.field695;
        class134.field2440 = class127.field2283;
        class47.field887 = class21.field404;
        class191.field3730 = class16.field303;
        class145.field2617 = class186.field3597;
        class168.field3173 = class40.field744;
        class37.field699 = class129.field2341;
        class170.field3241 = class157.field2818;
        class85.field1570 = class136.field2483;
        class150.field2683 = class205.field3943;
        class193.field3740 = class54.field964;
        class115.field2093 = class130.field2372;
        class120.field2156 = class12.field225;
        class78.field1408 = class178.field3390;
        class168.field3165 = class143.field2575;
        class38.field713 = class67.field1286;
        class78.field1417 = class103.field1882;
        class64.field1223 = class206.field3955;
        class37.field700 = class156.field2798;
        class167.field3095 = class24.field443;
        class94.field1713 = class74.field1377;
        class196.field3801 = class155.field2785;
        class37.field706 = class129.field2341;
        class72.field1352 = class170.field3245;
        class34.field587 = class85.field1573;
        class210.field4025 = class50.field927;
        class141.field2569 = class122.field2208;
        class169.field3190 = class105.field1915;
        class172.field3263 = class46.field879;
        class150.field2690 = class25.field454;
        class189.field3677 = class164.field2960;
        class159.field2842 = class76.field1392;
        class189.field3670 = class66.field1265;
        class162.field2918 = class155.field2786;
        class49.field911 = class202.field3909;
        class129.field2340 = class197.field3857;
        class131.field2387 = class207.field3991;
        class52.field957 = class32.field555;
        class103.field1892 = class45.field857;
        class164.field2937 = class92.field1708;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public static final void method1173(int arg0, int arg1, int arg2) {
        field3575++;
        if (class164.method982(22401, arg2)) {
            int var3 = 13 % ((arg1 + 61) / 41);
            class164.method984(arg0, -119, class149.field2670[arg2]);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
    public class185(int arg0, int arg1) {
        this.field3579 = arg0;
        this.field3582 = arg1;
    }
}
