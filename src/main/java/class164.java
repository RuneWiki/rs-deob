import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class164 extends class223 {

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    private int field2478 = 1;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    private int field2474 = 5;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    private int field2482 = 0;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    private int field2473 = 2;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "[S")
    private short[] field2483 = new short[512];

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "[B")
    private byte[] field2481 = new byte[512];

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field2470 = 2048;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    private int field2487 = 5;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2477 = 0;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2480 = "Choose Option";

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field2485 = "Loading textures - ";

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "[Ltb;")
    public static class71[] field2488 = new class71[50];

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field2474 = arg0.method265(-127);
                                }
                            } else {
                                this.field2487 = arg0.method265(-110);
                            }
                        } else {
                            this.field2478 = arg0.method265(arg2 ^ -53);
                        }
                    } else {
                        this.field2473 = arg0.method265(-110);
                    }
                } else {
                    this.field2470 = arg0.method260((byte) -67);
                }
            } else {
                this.field2482 = arg0.method265(-104);
            }
        } else {
            this.field2487 = this.field2474 = arg0.method265(-105);
        }
        if (arg2 != 102) {
            this.field2478 = -113;
        }
        ++field2471;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static final void method1182(int arg0) {
        ++field2486;
        class214.field3283.method1118(0);
        class216.field3308 = true;
        class28.field469 = true;
        class183.field2901 = 0;
        class31.field512 = 0;
        class209.field3239 = 0;
        class149.field2206 = 0;
        class194.field3028 = 0;
        class59.field940 = 0;
        class154.field2303 = 0;
        class304.field4887 = 0;
        class78.field1192 = 0;
        class161.field2413 = 0;
        class15.field187 = 0;
        class226.field3625 = 0;
        class45.field747 = 0;
        class270.field4275 = 0;
        class179.field2798 = 0;
        class236.field3726 = 0;
        class297.field4777 = 0;
        class290.field4507 = 0;
        class273.field4359 = 0;
        class23.field386 = 0;
        class35.field603 = 0;
        class248.field3945 = 0;
        class160.field2409 = 0;
        class131.field1954 = 0;
        class136.field2037 = 0;
        class126.field1892 = 0;
        class2.field35 = 0;
        class214.field3287 = 0;
        class31.field525 = 0;
        class152.field2244 = 0;
        class136.field2050 = 0;
        class156.field2319 = 0;
        class213.field3270 = 0;
        class263.field4175 = 0;
        class277.field4405 = 0;
        class208.field3226 = 0;
        class195.field3051 = 0;
        class192.field3001 = 0;
        class36.field619 = 0;
        class142.field2114 = 0;
        class27.field463 = 0;
        class20.field304 = 0;
        field2471 = 0;
        class35.field610 = 0;
        class295.field4631 = 0;
        class142.field2122 = 0;
        class194.field3035 = 0;
        class147.field2172 = 0;
        class255.field4079 = 0;
        class182.field2852 = 0;
        class53.field844 = 0;
        class270.field4287 = 0;
        class214.field3277 = 0;
        class162.field2424 = 0;
        class159.field2375 = 0;
        class3.field53 = 0;
        class125.field1886 = 0;
        class179.field2792 = 0;
        class60.field953 = 0;
        class253.field4051 = 0;
        class222.field3403 = 0;
        class278.field4412 = 0;
        class148.field2200 = 0;
        class31.field535 = 0;
        class183.field2885 = 0;
        class37.field630 = 0;
        class192.field3000 = 0;
        class157.field2346 = 0;
        class131.field1952 = 0;
        class235.field3713 = 0;
        class234.field3703 = 0;
        class255.field4072 = 0;
        class91.field1426 = 0;
        class193.field3024 = 0;
        class288.field4501 = 0;
        class183.field2883 = 0;
        class215.field3304 = 0;
        class136.field2039 = 0;
        class298.field4801 = 0;
        class123.field1855 = 0;
        class120.field1816 = 0;
        class15.field186 = 0;
        class174.field2683 = 0;
        class79.field1196 = 0;
        class67.field1052 = 0;
        class48.field779 = 0;
        class61.field967 = 0;
        client.field2400 = 0;
        class91.field1420 = 0;
        class67.field1065 = 0;
        class110.field1702 = 0;
        class41.field685 = 0;
        class178.field2728 = 0;
        class234.field3692 = 0;
        class250.field4003 = 0;
        class196.field3070 = 0;
        class161.field2417 = 0;
        class241.field3864 = 0;
        class154.field2301 = 0;
        class74.field1150 = 0;
        class50.field821 = 0;
        class74.field1138 = 0;
        class48.field781 = 0;
        class102.field1588 = 0;
        class20.field271 = 0;
        class31.field558 = 0;
        class31.field574 = 0;
        class211.field3257 = 0;
        class31.field563 = 0;
        class226.field3632 = 0;
        class130.field1943 = 0;
        class54.field858 = 0;
        class203.field3128 = 0;
        class205.field3157 = 0;
        class193.field3018 = 0;
        class31.field527 = 0;
        class304.field4893 = 0;
        class186.field2930 = 0;
        class77.field1183 = 0;
        class91.field1422 = 0;
        class306.field4915 = 0;
        class74.field1137 = 0;
        class62.field976 = 0;
        class82.field1240 = 0;
        class173.field2673 = 0;
        class154.field2279 = 0;
        class161.field2418 = 0;
        class22.field349 = 0;
        class305.field4899 = 0;
        class174.field2681 = 0;
        class121.field1825 = 0;
        class220.field3369 = 0;
        class83.field1254 = 0;
        class59.field942 = 0;
        class64.field1013 = 0;
        class20.field275 = 0;
        class231.field3652 = 0;
        class296.field4753 = 0;
        class151.field2234 = 0;
        class247.field3928 = 0;
        class259.field4105 = 0;
        class48.field789 = 0;
        class191.field2986 = 0;
        class31.field523 = 0;
        class214.field3276 = 0;
        class67.field1051 = 0;
        class254.field4061 = 0;
        class20.field281 = 0;
        class204.field3149 = 0;
        class279.field4420 = 0;
        class208.field3214 = 0;
        class60.field949 = 0;
        class270.field4280 = 0;
        class232.field3673 = 0;
        class149.field2208 = 0;
        class201.field3107 = 0;
        class22.field348 = 0;
        class162.field2435 = 0;
        class15.field192 = 0;
        class208.field3223 = 0;
        class20.field321 = 0;
        class20.field306 = 0;
        class126.field1888 = 0;
        class191.field2994 = 0;
        class20.field337 = 0;
        class292.field4527 = 0;
        class296.field4754 = 0;
        class149.field2205 = 0;
        class142.field2116 = 0;
        class109.field1686 = 0;
        class47.field776 = 0;
        class55.field868 = 0;
        class195.field3049 = 0;
        class305.field4912 = 0;
        class303.field4869 = 0;
        class300.field4832 = 0;
        class28.field470 = 0;
        field2486 = 0;
        class60.field957 = 0;
        class239.field3780 = 0;
        class301.field4853 = 0;
        class194.field3038 = 0;
        class261.field4124 = 0;
        class92.field1451 = 0;
        class39.field669 = 0;
        class294.field4573 = 0;
        class123.field1862 = 0;
        class45.field750 = 0;
        class154.field2291 = 0;
        class112.field1712 = 0;
        class112.field1720 = 0;
        class262.field4143 = 0;
        class60.field948 = 0;
        class296.field4674 = 0;
        class125.field1882 = 0;
        class170.field2570 = 0;
        class41.field681 = 0;
        class195.field3056 = 0;
        class216.field3312 = 0;
        class31.field531 = 0;
        class149.field2216 = 0;
        class74.field1142 = 0;
        class92.field1449 = 0;
        class226.field3620 = 0;
        class72.field1110 = 0;
        class55.field869 = 0;
        class296.field4724 = 0;
        class46.field770 = 0;
        class192.field2999 = 0;
        class194.field3034 = 0;
        class201.field3113 = 0;
        class178.field2731 = 0;
        class191.field2992 = 0;
        class278.field4419 = 0;
        class296.field4698 = 0;
        class196.field3066 = 0;
        class154.field2274 = 0;
        class162.field2429 = 0;
        class48.field782 = 0;
        class154.field2273 = 0;
        class203.field3130 = 0;
        class7.field119 = 0;
        class88.field1387 = 0;
        class2.field37 = 0;
        class15.field189 = 0;
        class194.field3044 = 0;
        class208.field3219 = 0;
        class285.field4480 = 0;
        class95.field1548 = 0;
        class134.field2004 = 0;
        class26.field440 = 0;
        class74.field1131 = 0;
        class31.field548 = 0;
        class301.field4841 = 0;
        class295.field4618 = 0;
        class154.field2295 = 0;
        class125.field1884 = 0;
        class33.field592 = 0;
        class56.field887 = 0;
        class303.field4880 = 0;
        class186.field2925 = 0;
        class262.field4129 = 0;
        class264.field4183 = 0;
        class70.field1101 = 0;
        class92.field1434 = 0;
        class257.field4089 = 0;
        class153.field2261 = 0;
        class296.field4663 = 0;
        class195.field3062 = 0;
        class174.field2686 = 0;
        class220.field3357 = 0;
        class301.field4835 = 0;
        class300.field4819 = 0;
        class104.field1617 = 0;
        class263.field4173 = 0;
        class234.field3697 = 0;
        class204.field3146 = 0;
        class298.field4805 = 0;
        class195.field3052 = 0;
        class308.field4934 = 0;
        class6.field94 = 0;
        class167.field2521 = 0;
        class154.field2277 = 0;
        class116.field1771 = 0;
        class208.field3217 = 0;
        class92.field1466 = 0;
        class89.field1392 = 0;
        class121.field1821 = 0;
        class142.field2124 = 0;
        class207.field3208 = 0;
        class239.field3777 = 0;
        class3.field51 = 0;
        class130.field1932 = 0;
        class52.field829 = 0;
        class179.field2768 = 0;
        class28.field473 = 0;
        class154.field2278 = 0;
        class103.field1609 = 0;
        class143.field2144 = 0;
        class112.field1718 = 0;
        class211.field3261 = 0;
        class88.field1385 = 0;
        class92.field1435 = 0;
        class129.field1924 = 0;
        class143.field2141 = 0;
        class237.field3743 = 0;
        class263.field4170 = 0;
        class60.field952 = 0;
        class147.field2178 = 0;
        class255.field4081 = 0;
        class255.field4068 = 0;
        class237.field3747 = 0;
        class118.field1792 = 0;
        class101.field1579 = 0;
        class147.field2182 = 0;
        class20.field333 = 0;
        class210.field3246 = 0;
        class231.field3659 = 0;
        class290.field4509 = 0;
        class188.field2956 = 0;
        class89.field1406 = 0;
        class305.field4900 = 0;
        class211.field3253 = 0;
        class133.field1992 = 0;
        class107.field1675 = 0;
        class300.field4831 = 0;
        class179.field2767 = 0;
        class298.field4804 = 0;
        class18.field246 = 0;
        class40.field676 = 0;
        class248.field3952 = 0;
        class64.field1011 = 0;
        class286.field4494 = 0;
        class18.field249 = 0;
        class68.field1077 = 0;
        class214.field3280 = 0;
        class222.field3485 = 0;
        class172.field2653 = 0;
        class191.field2987 = 0;
        class296.field4734 = 0;
        class27.field467 = 0;
        class31.field557 = 0;
        class222.field3512 = 0;
        class163.field2452 = 0;
        class266.field4211 = 0;
        class276.field4392 = 0;
        class239.field3773 = 0;
        class157.field2342 = 0;
        class74.field1133 = 0;
        class182.field2857 = 0;
        class281.field4443 = 0;
        class292.field4530 = 0;
        class8.field137 = 0;
        class231.field3664 = 0;
        class235.field3720 = 0;
        client.field2391 = 0;
        class85.field1271 = 0;
        class31.field568 = 0;
        class241.field3848 = 0;
        class148.field2199 = 0;
        class254.field4062 = 0;
        class222.field3511 = 0;
        class8.field134 = 0;
        class46.field768 = 0;
        class154.field2287 = 0;
        class181.field2833 = 0;
        class145.field2151 = 0;
        class198.field3077 = 0;
        class241.field3839 = 0;
        client.field2393 = 0;
        class129.field1923 = 0;
        class2.field24 = 0;
        class22.field365 = 0;
        class248.field3947 = 0;
        class215.field3293 = 0;
        class244.field3903 = 0;
        class24.field416 = 0;
        class105.field1649 = 0;
        class295.field4581 = 0;
        class214.field3285 = 0;
        class186.field2932 = 0;
        class141.field2093 = 0;
        class134.field2012 = 0;
        class197.field3072 = 0;
        class270.field4276 = 0;
        class141.field2105 = 0;
        class222.field3538 = 0;
        class42.field704 = 0;
        class95.field1551 = 0;
        class278.field4409 = 0;
        class106.field1653 = 0;
        class231.field3668 = 0;
        class23.field388 = 0;
        class176.field2720 = 0;
        class226.field3629 = 0;
        class2.field31 = 0;
        class179.field2791 = 0;
        class295.field4609 = 0;
        class220.field3366 = 0;
        class134.field2008 = 0;
        class151.field2236 = 0;
        class297.field4791 = 0;
        class257.field4093 = 0;
        class303.field4879 = 0;
        class300.field4830 = 0;
        class284.field4470 = 0;
        class305.field4908 = 0;
        class208.field3211 = 0;
        class92.field1433 = 0;
        class201.field3106 = 0;
        class207.field3189 = 0;
        class114.field1753 = 0;
        class214.field3274 = 0;
        class143.field2142 = 0;
        class262.field4135 = 0;
        class72.field1112 = 0;
        class150.field2224 = 0;
        class237.field3744 = 0;
        class240.field3817 = 0;
        class45.field761 = 0;
        class80.field1229 = 0;
        class206.field3176 = 0;
        class252.field4029 = 0;
        class268.field4245 = 0;
        class182.field2872 = 0;
        class266.field4202 = 0;
        class295.field4623 = 0;
        class179.field2766 = 0;
        class255.field4066 = 0;
        class63.field992 = 0;
        class194.field3048 = 0;
        class180.field2829 = 0;
        class31.field513 = 0;
        class41.field684 = 0;
        class69.field1098 = 0;
        class270.field4282 = 0;
        class299.field4812 = 0;
        class45.field734 = 0;
        class211.field3260 = 0;
        class80.field1227 = 0;
        class67.field1045 = 0;
        class231.field3655 = 0;
        class176.field2715 = 0;
        class250.field4000 = 0;
        class244.field3893 = 0;
        class174.field2693 = 0;
        class169.field2557 = 0;
        class89.field1409 = 0;
        class186.field2937 = 0;
        class133.field1989 = 0;
        class223.field3575 = 0;
        class153.field2258 = 0;
        class300.field4821 = 0;
        class28.field476 = 0;
        class211.field3254 = 0;
        class122.field1836 = 0;
        class190.field2978 = 0;
        class92.field1443 = 0;
        class37.field641 = 0;
        class159.field2371 = 0;
        class231.field3657 = 0;
        class214.field3279 = 0;
        class30.field495 = 0;
        class31.field510 = 0;
        class84.field1255 = 0;
        class166.field2517 = 0;
        class120.field1810 = 0;
        class297.field4775 = 0;
        class277.field4398 = 0;
        class143.field2136 = 0;
        class215.field3303 = 0;
        class179.field2786 = 0;
        class166.field2498 = 0;
        class92.field1448 = 0;
        class222.field3478 = 0;
        class297.field4782 = 0;
        class30.field505 = 0;
        class148.field2189 = 0;
        class122.field1839 = 0;
        class20.field287 = 0;
        class208.field3212 = 0;
        class20.field291 = 0;
        class253.field4041 = 0;
        class182.field2871 = 0;
        class123.field1851 = 0;
        class236.field3732 = 0;
        class295.field4645 = 0;
        class173.field2663 = 0;
        class92.field1441 = 0;
        class215.field3296 = 0;
        class15.field194 = 0;
        class46.field767 = 0;
        class92.field1473 = 0;
        class58.field934 = 0;
        class296.field4738 = 0;
        class20.field314 = 0;
        class136.field2048 = 0;
        class285.field4491 = 0;
        class67.field1072 = 0;
        class269.field4263 = 0;
        class136.field2040 = 0;
        class6.field100 = 0;
        class206.field3165 = 0;
        class194.field3037 = 0;
        client.field2381 = 0;
        class247.field3930 = 0;
        class92.field1432 = 0;
        class136.field2055 = 0;
        class159.field2372 = 0;
        class28.field474 = 0;
        class133.field1995 = 0;
        class293.field4552 = 0;
        class154.field2284 = 0;
        class53.field839 = 0;
        class147.field2174 = 0;
        class74.field1141 = 0;
        class173.field2666 = 0;
        class20.field297 = 0;
        class200.field3101 = 0;
        class147.field2168 = 0;
        class178.field2732 = 0;
        client.field2383 = 0;
        class28.field483 = 0;
        client.field2398 = 0;
        class31.field565 = 0;
        class31.field543 = 0;
        class79.field1197 = 0;
        class53.field838 = 0;
        class47.field778 = 0;
        class76.field1171 = 0;
        class308.field4945 = 0;
        class110.field1701 = 0;
        class295.field4635 = 0;
        class148.field2201 = 0;
        class131.field1950 = 0;
        class61.field965 = 0;
        class137.field2065 = 0;
        class223.field3591 = 0;
        class75.field1167 = 0;
        class193.field3016 = 0;
        class86.field1286 = 0;
        class306.field4916 = 0;
        class41.field689 = 0;
        class223.field3584 = 0;
        class233.field3683 = 0;
        class94.field1479 = 0;
        class104.field1629 = 0;
        class74.field1149 = 0;
        class136.field2054 = 0;
        class192.field3002 = 0;
        class253.field4048 = 0;
        class265.field4188 = 0;
        class136.field2045 = 0;
        class298.field4799 = 0;
        class305.field4909 = 0;
        class162.field2432 = 0;
        class30.field500 = 0;
        class15.field179 = 0;
        class88.field1384 = 0;
        class33.field586 = 0;
        class244.field3898 = 0;
        class293.field4547 = 0;
        class42.field714 = 0;
        class211.field3255 = 0;
        class263.field4171 = 0;
        class142.field2126 = 0;
        class292.field4525 = 0;
        class179.field2745 = 0;
        class308.field4930 = 0;
        class20.field277 = 0;
        class162.field2444 = 0;
        class292.field4532 = 0;
        class174.field2676 = 0;
        class24.field420 = 0;
        class197.field3074 = 0;
        class112.field1715 = 0;
        class142.field2117 = 0;
        class297.field4786 = 0;
        class95.field1552 = 0;
        class48.field796 = 0;
        class42.field705 = 0;
        class246.field3915 = 0;
        class148.field2203 = 0;
        class28.field478 = 0;
        class183.field2886 = 0;
        class62.field978 = 0;
        class127.field1900 = 0;
        class36.field623 = 0;
        class112.field1723 = 0;
        class148.field2197 = 0;
        class23.field401 = 0;
        class284.field4478 = 0;
        class92.field1436 = 0;
        class269.field4267 = 0;
        class68.field1081 = 0;
        class31.field534 = 0;
        class121.field1820 = 0;
        class92.field1470 = 0;
        class150.field2229 = 0;
        class237.field3741 = 0;
        class37.field627 = 0;
        class193.field3021 = 0;
        class185.field2918 = 0;
        class69.field1095 = 0;
        class55.field873 = 0;
        class91.field1423 = 0;
        class262.field4151 = 0;
        class64.field1005 = 0;
        class189.field2963 = 0;
        class296.field4715 = 0;
        class77.field1181 = 0;
        class20.field323 = 0;
        class31.field547 = 0;
        class14.field177 = 0;
        class232.field3678 = 0;
        class31.field540 = 0;
        class159.field2378 = 0;
        class27.field461 = 0;
        class295.field4647 = 0;
        class261.field4123 = 0;
        class102.field1587 = 0;
        class33.field585 = 0;
        class181.field2844 = 0;
        class48.field780 = 0;
        class30.field496 = 0;
        class295.field4578 = 0;
        class214.field3284 = 0;
        class255.field4067 = 0;
        class194.field3030 = 0;
        class95.field1501 = 0;
        class194.field3045 = 0;
        class92.field1454 = 0;
        class105.field1633 = 0;
        class154.field2275 = 0;
        class73.field1117 = 0;
        class125.field1880 = 0;
        class238.field3750 = 0;
        class6.field104 = 0;
        class98.field1568 = 0;
        class136.field2028 = 0;
        class260.field4117 = 0;
        class174.field2679 = 0;
        class279.field4427 = 0;
        class182.field2865 = 0;
        class30.field497 = 0;
        class195.field3050 = 0;
        class31.field570 = 0;
        class24.field413 = 0;
        class269.field4259 = 0;
        class268.field4240 = 0;
        class157.field2348 = 0;
        class102.field1584 = 0;
        class293.field4548 = 0;
        class297.field4774 = 0;
        class80.field1223 = 0;
        class136.field2047 = 0;
        class58.field926 = 0;
        class79.field1200 = 0;
        class69.field1092 = 0;
        class79.field1202 = 0;
        class261.field4127 = 0;
        class79.field1199 = 0;
        class295.field4616 = 0;
        class67.field1038 = 0;
        class106.field1652 = 0;
        class263.field4166 = 0;
        class280.field4428 = 0;
        class31.field529 = 0;
        class6.field89 = 0;
        class35.field602 = 0;
        class136.field2063 = 0;
        class20.field288 = 0;
        class39.field660 = 0;
        class172.field2593 = 0;
        class181.field2846 = 0;
        class7.field116 = 0;
        class149.field2212 = 0;
        class274.field4372 = 0;
        class232.field3676 = 0;
        field2484 = 0;
        class169.field2531 = 0;
        class15.field207 = 0;
        class166.field2500 = 0;
        class166.field2513 = 0;
        class35.field604 = 0;
        class31.field544 = 0;
        class269.field4260 = 0;
        class126.field1894 = 0;
        client.field2387 = 0;
        class238.field3754 = 0;
        class122.field1838 = 0;
        class88.field1390 = 0;
        class296.field4675 = 0;
        class237.field3740 = 0;
        client.field2397 = 0;
        class295.field4644 = 0;
        class27.field459 = 0;
        class266.field4208 = 0;
        class56.field877 = 0;
        class240.field3788 = 0;
        class252.field4023 = 0;
        class24.field422 = 0;
        class120.field1818 = 0;
        class297.field4788 = 0;
        class141.field2104 = 0;
        class110.field1698 = 0;
        class201.field3118 = 0;
        class293.field4544 = 0;
        class31.field539 = 0;
        class110.field1706 = 0;
        class20.field326 = 0;
        class15.field197 = 0;
        class202.field3121 = 0;
        class30.field504 = 0;
        class297.field4795 = 0;
        class123.field1850 = 0;
        class200.field3103 = 0;
        class162.field2439 = 0;
        class262.field4155 = 0;
        class28.field482 = 0;
        class240.field3810 = 0;
        class273.field4356 = 0;
        class157.field2354 = 0;
        class213.field3269 = 0;
        class166.field2502 = 0;
        class172.field2643 = 0;
        class68.field1079 = 0;
        class254.field4053 = 0;
        class154.field2299 = 0;
        class52.field828 = 0;
        class181.field2834 = 0;
        class31.field564 = 0;
        class15.field190 = 0;
        class179.field2806 = 0;
        class283.field4460 = 0;
        class154.field2288 = 0;
        class290.field4511 = 0;
        class104.field1627 = 0;
        class233.field3681 = 0;
        class193.field3012 = 0;
        class20.field295 = 0;
        class74.field1129 = 0;
        class98.field1564 = 0;
        class192.field3006 = 0;
        class24.field429 = 0;
        class299.field4813 = 0;
        class308.field4932 = 0;
        class222.field3489 = 0;
        class73.field1115 = 0;
        class31.field516 = 0;
        class207.field3205 = 0;
        class268.field4242 = 0;
        class306.field4914 = 0;
        class149.field2209 = 0;
        class277.field4404 = 0;
        class120.field1814 = 0;
        class237.field3736 = 0;
        class115.field1762 = 0;
        class263.field4174 = 0;
        class88.field1382 = 0;
        class206.field3160 = 0;
        class281.field4439 = 0;
        class296.field4729 = 0;
        class257.field4088 = 0;
        field2475 = 0;
        class237.field3739 = 0;
        class189.field2974 = 0;
        class92.field1428 = 0;
        class222.field3503 = 0;
        class130.field1935 = 0;
        class214.field3289 = 0;
        class20.field296 = 0;
        class31.field533 = 0;
        class61.field964 = 0;
        class35.field605 = 0;
        class181.field2840 = 0;
        class73.field1121 = 0;
        class122.field1842 = 0;
        class8.field131 = 0;
        class28.field471 = 0;
        class200.field3099 = 0;
        class179.field2797 = 0;
        class63.field990 = 0;
        field2479 = 0;
        field2476 = 0;
        class183.field2894 = 0;
        class37.field655 = 0;
        class257.field4097 = 0;
        class195.field3059 = 0;
        class79.field1194 = 0;
        class53.field846 = 0;
        class216.field3316 = 0;
        class70.field1105 = 0;
        class28.field488 = 0;
        class61.field963 = 0;
        class182.field2873 = 0;
        class24.field424 = 0;
        class37.field628 = 0;
        class134.field2014 = 0;
        class8.field138 = 0;
        class240.field3800 = 0;
        class282.field4454 = 0;
        class150.field2220 = 0;
        class300.field4817 = 0;
        class203.field3135 = 0;
        class9.field149 = 0;
        class161.field2410 = 0;
        class264.field4181 = 0;
        class282.field4455 = 0;
        class62.field968 = 0;
        class286.field4498 = 0;
        class62.field981 = 0;
        class255.field4078 = 0;
        class254.field4059 = 0;
        class142.field2129 = 0;
        class248.field3959 = 0;
        class179.field2760 = 0;
        class58.field913 = 0;
        class193.field3019 = 0;
        class54.field851 = 0;
        class233.field3688 = 0;
        class18.field240 = 0;
        class138.field2070 = 0;
        class20.field331 = 0;
        class295.field4659 = 0;
        client.field2384 = 0;
        class255.field4070 = 0;
        class92.field1438 = 0;
        class39.field666 = 0;
        class296.field4735 = 0;
        class112.field1731 = 0;
        class188.field2953 = 0;
        class153.field2253 = 0;
        class92.field1447 = 0;
        class262.field4154 = 0;
        class31.field536 = 0;
        class31.field567 = 0;
        class131.field1953 = 0;
        class296.field4752 = 0;
        class133.field1994 = 0;
        class112.field1730 = 0;
        class67.field1040 = 0;
        class301.field4855 = 0;
        class74.field1139 = 0;
        client.field2389 = 0;
        class182.field2850 = 0;
        class254.field4058 = 0;
        class272.field4347 = 0;
        class179.field2772 = 0;
        class35.field608 = 0;
        class89.field1393 = 0;
        class92.field1456 = 0;
        class31.field545 = 0;
        class145.field2146 = 0;
        class69.field1093 = 0;
        class291.field4516 = 0;
        class116.field1770 = 0;
        class69.field1100 = 0;
        class112.field1713 = 0;
        class61.field961 = 0;
        class255.field4083 = 0;
        class6.field85 = 0;
        class48.field783 = 0;
        class179.field2744 = 0;
        class193.field3020 = 0;
        class54.field856 = 0;
        class40.field679 = 0;
        class36.field620 = 0;
        class194.field3036 = 0;
        class285.field4490 = 0;
        class89.field1403 = 0;
        class120.field1815 = 0;
        class262.field4136 = 0;
        class238.field3758 = 0;
        class244.field3904 = 0;
        class20.field313 = 0;
        class74.field1130 = 0;
        class62.field969 = 0;
        class236.field3723 = 0;
        class20.field299 = 0;
        class41.field687 = 0;
        class58.field928 = 0;
        class18.field250 = 0;
        class23.field404 = 0;
        class37.field634 = 0;
        class104.field1626 = 0;
        class107.field1676 = 0;
        class150.field2222 = 0;
        class3.field52 = 0;
        class126.field1890 = 0;
        class303.field4885 = 0;
        class209.field3234 = 0;
        class43.field725 = 0;
        class308.field4944 = 0;
        class255.field4077 = 0;
        class162.field2425 = 0;
        class68.field1074 = 0;
        class253.field4042 = 0;
        class130.field1937 = 0;
        class194.field3040 = 0;
        class182.field2870 = 0;
        class23.field408 = 0;
        class31.field555 = 0;
        class95.field1513 = 0;
        class157.field2343 = 0;
        class78.field1190 = 0;
        class113.field1748 = 0;
        class33.field598 = 0;
        class31.field509 = 0;
        class257.field4091 = 0;
        class20.field303 = 0;
        class257.field4086 = 0;
        class209.field3232 = 0;
        class216.field3311 = 0;
        class31.field520 = 0;
        class89.field1399 = 0;
        class67.field1068 = 0;
        class85.field1272 = 0;
        class110.field1703 = 0;
        class181.field2845 = 0;
        class266.field4207 = 0;
        class130.field1928 = 0;
        class30.field494 = 0;
        class293.field4551 = 0;
        class145.field2148 = 0;
        class161.field2414 = 0;
        class231.field3653 = 0;
        class297.field4773 = 0;
        class147.field2186 = 0;
        class175.field2706 = 0;
        class103.field1607 = 0;
        class20.field272 = 0;
        client.field2399 = 0;
        class186.field2919 = 0;
        class23.field402 = 0;
        class295.field4626 = 0;
        class106.field1667 = 0;
        class136.field2060 = 0;
        class101.field1583 = 0;
        class154.field2283 = 0;
        class239.field3782 = 0;
        class78.field1186 = 0;
        class194.field3041 = 0;
        class193.field3014 = 0;
        class31.field538 = 0;
        class295.field4657 = 0;
        class31.field515 = 0;
        class160.field2407 = 0;
        class120.field1817 = 0;
        class115.field1761 = 0;
        class127.field1903 = 0;
        class208.field3220 = 0;
        class79.field1201 = 0;
        class31.field524 = 0;
        class226.field3631 = 0;
        class130.field1940 = 0;
        class183.field2882 = 0;
        class234.field3690 = 0;
        class230.field3645 = 0;
        class31.field514 = 0;
        class181.field2847 = 0;
        class37.field643 = 0;
        class166.field2511 = 0;
        class188.field2955 = 0;
        class163.field2455 = 0;
        class248.field3958 = 0;
        class208.field3213 = 0;
        class179.field2812 = 0;
        class231.field3656 = 0;
        class163.field2464 = 0;
        class28.field479 = 0;
        class223.field3578 = 0;
        class184.field2905 = 0;
        class103.field1593 = 0;
        class74.field1146 = 0;
        class73.field1123 = 0;
        class235.field3714 = 0;
        class265.field4195 = 0;
        class301.field4857 = 0;
        class160.field2406 = 0;
        class189.field2966 = 0;
        class77.field1184 = 0;
        class105.field1637 = 0;
        class2.field34 = 0;
        class223.field3587 = 0;
        class232.field3670 = 0;
        class208.field3210 = 0;
        class114.field1749 = 0;
        class218.field3330 = 0;
        class39.field661 = 0;
        class254.field4057 = 0;
        class39.field674 = 0;
        class188.field2958 = 0;
        class154.field2293 = 0;
        class89.field1398 = 0;
        class31.field551 = 0;
        class118.field1793 = 0;
        class152.field2240 = 0;
        class154.field2297 = 0;
        class20.field317 = 0;
        class33.field599 = 0;
        class45.field752 = 0;
        class150.field2226 = 0;
        class170.field2579 = 0;
        class264.field4178 = 0;
        class149.field2218 = 0;
        class300.field4827 = 0;
        class296.field4693 = 0;
        class268.field4256 = 0;
        class85.field1269 = 0;
        class216.field3313 = 0;
        class219.field3343 = 0;
        class31.field546 = 0;
        class37.field647 = 0;
        class161.field2419 = 0;
        class31.field553 = 0;
        class28.field480 = 0;
        class108.field1678 = 0;
        class298.field4798 = 0;
        class232.field3675 = 0;
        class201.field3110 = 0;
        class296.field4766 = 0;
        class31.field518 = 0;
        class8.field145 = 0;
        class64.field1014 = 0;
        class303.field4882 = 0;
        class140.field2088 = 0;
        class281.field4450 = 0;
        class18.field248 = 0;
        class176.field2709 = 0;
        class112.field1722 = 0;
        class293.field4553 = 0;
        class138.field2074 = 0;
        class285.field4486 = 0;
        class23.field396 = 0;
        class46.field772 = 0;
        class263.field4177 = 0;
        class307.field4924 = 0;
        class24.field414 = 0;
        class9.field152 = 0;
        class154.field2289 = 0;
        class252.field4033 = 0;
        class239.field3774 = 0;
        class246.field3914 = 0;
        class156.field2330 = 0;
        class136.field2046 = 0;
        class195.field3061 = 0;
        class236.field3727 = 0;
        class20.field318 = 0;
        class199.field3091 = 0;
        class58.field919 = 0;
        class192.field3003 = 0;
        class294.field4563 = 0;
        class133.field1996 = 0;
        class270.field4284 = 0;
        class226.field3617 = 0;
        class31.field556 = 0;
        class154.field2302 = 0;
        class154.field2285 = 0;
        class186.field2920 = 0;
        class56.field876 = 0;
        class154.field2272 = 0;
        class20.field310 = 0;
        class155.field2315 = 0;
        class37.field633 = 0;
        class272.field4351 = 0;
        class75.field1165 = 0;
        class174.field2688 = 0;
        class169.field2543 = 0;
        class92.field1472 = 0;
        class147.field2181 = 0;
        class235.field3715 = 0;
        class95.field1499 = 0;
        class156.field2320 = 0;
        class192.field2996 = 0;
        class85.field1275 = 0;
        class281.field4441 = 0;
        class303.field4883 = 0;
        class167.field2522 = 0;
        class41.field694 = 0;
        class6.field84 = 0;
        class222.field3543 = 0;
        class127.field1906 = 0;
        class301.field4858 = 0;
        class31.field522 = 0;
        class67.field1049 = 0;
        class229.field3641 = 0;
        class39.field663 = 0;
        class142.field2125 = 0;
        class232.field3679 = 0;
        class49.field798 = 0;
        class31.field550 = 0;
        class91.field1418 = 0;
        class166.field2505 = 0;
        class252.field4032 = 0;
        class154.field2271 = 0;
        class303.field4867 = 0;
        class69.field1084 = 0;
        class162.field2434 = 0;
        class92.field1430 = 0;
        class180.field2821 = 0;
        class162.field2441 = 0;
        class152.field2239 = 0;
        class115.field1763 = 0;
        class92.field1445 = 0;
        class86.field1280 = 0;
        class105.field1648 = 0;
        class206.field3182 = 0;
        class223.field3582 = 0;
        class59.field943 = 0;
        class31.field542 = 0;
        class20.field305 = 0;
        class179.field2765 = 0;
        class296.field4717 = 0;
        class112.field1710 = 0;
        class48.field791 = 0;
        class223.field3580 = 0;
        class39.field672 = 0;
        class52.field827 = 0;
        class182.field2851 = 0;
        class163.field2465 = 0;
        class266.field4204 = 0;
        class229.field3642 = 0;
        class257.field4085 = 0;
        class281.field4434 = 0;
        class20.field283 = 0;
        class92.field1460 = 0;
        class20.field293 = 0;
        class31.field554 = 0;
        class88.field1378 = 0;
        class304.field4888 = 0;
        class179.field2773 = 0;
        class303.field4873 = 0;
        class31.field511 = 0;
        class276.field4395 = 0;
        class154.field2292 = 0;
        class222.field3426 = 0;
        class20.field341 = 0;
        class272.field4354 = 0;
        class116.field1778 = 0;
        class140.field2086 = 0;
        class166.field2510 = 0;
        class20.field285 = 0;
        class233.field3685 = 0;
        class28.field472 = 0;
        class184.field2912 = 0;
        class22.field347 = 0;
        class133.field1993 = 0;
        class292.field4534 = 0;
        class94.field1481 = 0;
        class307.field4921 = 0;
        class36.field624 = 0;
        class69.field1089 = 0;
        class68.field1073 = 0;
        class49.field799 = 0;
        class208.field3227 = 0;
        class112.field1732 = 0;
        class216.field3306 = 0;
        class46.field771 = 0;
        class31.field572 = 0;
        class143.field2137 = 0;
        class260.field4116 = 0;
        class195.field3053 = 0;
        class260.field4114 = 0;
        class162.field2431 = 0;
        class268.field4235 = 0;
        class244.field3902 = 0;
        class45.field743 = 0;
        class252.field4030 = 0;
        class131.field1947 = 0;
        class216.field3310 = 0;
        class300.field4825 = 0;
        class142.field2131 = 0;
        class63.field989 = 0;
        class41.field688 = 0;
        class31.field552 = 0;
        class283.field4458 = 0;
        class270.field4278 = 0;
        class176.field2714 = 0;
        class253.field4050 = 0;
        class23.field393 = 0;
        class304.field4890 = 0;
        class208.field3218 = 0;
        class2.field36 = 0;
        class272.field4343 = 0;
        class88.field1388 = 0;
        class223.field3585 = 0;
        class53.field843 = 0;
        class201.field3116 = 0;
        class31.field530 = 0;
        class48.field788 = 0;
        class103.field1595 = 0;
        class240.field3792 = 0;
        class219.field3337 = 0;
        class95.field1519 = 0;
        class2.field38 = 0;
        class134.field2010 = 0;
        class54.field857 = 0;
        class170.field2576 = 0;
        class169.field2545 = 0;
        class105.field1641 = 0;
        class179.field2746 = 0;
        class223.field3590 = 0;
        class188.field2954 = 0;
        class182.field2860 = 0;
        class102.field1586 = 0;
        class37.field654 = 0;
        class135.field2017 = 0;
        class141.field2096 = 0;
        class293.field4558 = 0;
        class186.field2927 = 0;
        class120.field1811 = 0;
        class41.field690 = 0;
        class121.field1822 = 0;
        class138.field2075 = 0;
        class209.field3236 = 0;
        class296.field4723 = 0;
        class116.field1777 = 0;
        class162.field2440 = 0;
        class54.field855 = 0;
        class141.field2098 = 0;
        class91.field1427 = 0;
        class95.field1546 = 0;
        class133.field1991 = 0;
        class260.field4120 = 0;
        class205.field3156 = 0;
        class74.field1136 = 0;
        class142.field2113 = 0;
        class67.field1067 = 0;
        class253.field4047 = 0;
        class53.field836 = 0;
        class303.field4878 = 0;
        class89.field1410 = 0;
        class241.field3857 = 0;
        class14.field176 = 0;
        class92.field1429 = 0;
        class73.field1122 = 0;
        class7.field107 = 0;
        class46.field765 = 0;
        class109.field1690 = 0;
        class68.field1080 = 0;
        class154.field2281 = 0;
        class19.field262 = 0;
        class235.field3708 = 0;
        class82.field1241 = 0;
        class70.field1102 = 0;
        class62.field979 = 0;
        class33.field589 = 0;
        class120.field1813 = 0;
        class186.field2922 = 0;
        class308.field4941 = 0;
        class279.field4422 = 0;
        class133.field2002 = 0;
        class206.field3162 = 0;
        class130.field1934 = 0;
        field2469 = 0;
        class294.field4567 = 0;
        client.field2402 = 0;
        class37.field646 = 0;
        class126.field1891 = 0;
        client.field2396 = 0;
        class203.field3126 = 0;
        class35.field609 = 0;
        class56.field883 = 0;
        class254.field4056 = 0;
        class241.field3833 = 0;
        class105.field1632 = 0;
        class168.field2526 = 0;
        class196.field3071 = 0;
        class31.field508 = 0;
        class180.field2823 = 0;
        class305.field4897 = 0;
        class78.field1188 = 0;
        class209.field3235 = 0;
        class67.field1062 = 0;
        class107.field1674 = 0;
        class143.field2135 = 0;
        class172.field2607 = 0;
        class284.field4475 = 0;
        class262.field4142 = 0;
        class92.field1442 = 0;
        class7.field109 = 0;
        class296.field4679 = 0;
        class155.field2314 = 0;
        class133.field2001 = 0;
        class18.field247 = 0;
        class141.field2101 = 0;
        class209.field3231 = 0;
        class98.field1563 = 0;
        class254.field4054 = 0;
        class179.field2764 = 0;
        class49.field800 = 0;
        class250.field4011 = 0;
        class198.field3080 = 0;
        class181.field2848 = 0;
        class266.field4198 = 0;
        class92.field1457 = 0;
        class151.field2238 = 0;
        class74.field1144 = 0;
        class161.field2411 = 0;
        class204.field3151 = 0;
        class209.field3238 = 0;
        class145.field2149 = 0;
        class79.field1207 = 0;
        class174.field2692 = 0;
        class95.field1542 = 0;
        class189.field2964 = 0;
        class110.field1696 = 0;
        class15.field208 = 0;
        class223.field3577 = 0;
        class141.field2106 = 0;
        class20.field327 = 0;
        class116.field1774 = 0;
        class74.field1134 = 0;
        class42.field700 = 0;
        class250.field4010 = 0;
        class261.field4122 = 0;
        class20.field270 = 0;
        class86.field1285 = 0;
        class72.field1114 = 0;
        class50.field819 = 0;
        class147.field2185 = 0;
        class192.field3004 = 0;
        class195.field3060 = 0;
        class98.field1569 = 0;
        class112.field1714 = 0;
        client.field2382 = 0;
        class268.field4254 = 0;
        client.field2395 = 0;
        class306.field4917 = 0;
        class304.field4891 = 0;
        class199.field3088 = 0;
        class7.field105 = 0;
        class3.field49 = 0;
        class112.field1726 = 0;
        class151.field2237 = 0;
        class2.field26 = 0;
        class114.field1759 = 0;
        class216.field3317 = 0;
        class112.field1711 = 0;
        class150.field2227 = 0;
        class262.field4128 = 0;
        class113.field1746 = 0;
        class178.field2729 = 0;
        class79.field1205 = 0;
        class56.field878 = 0;
        class190.field2977 = 0;
        class162.field2446 = 0;
        class31.field526 = 0;
        class166.field2512 = 0;
        class244.field3901 = 0;
        class170.field2574 = 0;
        class76.field1175 = 0;
        class247.field3925 = 0;
        class22.field352 = 0;
        class283.field4465 = 0;
        class270.field4286 = 0;
        class155.field2313 = 0;
        class223.field3586 = 0;
        class72.field1113 = 0;
        class2.field25 = 0;
        class62.field974 = 0;
        class305.field4901 = 0;
        class30.field501 = 0;
        class30.field498 = 0;
        class257.field4096 = 0;
        class147.field2180 = 0;
        class147.field2164 = 0;
        class48.field784 = 0;
        client.field2403 = 0;
        class281.field4449 = 0;
        class153.field2254 = 0;
        class150.field2221 = 0;
        class31.field517 = 0;
        class84.field1256 = 0;
        class162.field2442 = 0;
        class134.field2013 = 0;
        class170.field2577 = 0;
        client.field2392 = 0;
        class179.field2799 = 0;
        class206.field3178 = 0;
        class273.field4360 = 0;
        class24.field427 = 0;
        class186.field2938 = 0;
        class20.field311 = 0;
        class206.field3163 = 0;
        class92.field1453 = 0;
        class276.field4393 = 0;
        class125.field1883 = 0;
        class265.field4193 = 0;
        class47.field774 = 0;
        class92.field1444 = 0;
        class31.field528 = 0;
        class138.field2071 = 0;
        class95.field1511 = 0;
        class247.field3924 = 0;
        class89.field1395 = 0;
        class222.field3486 = 0;
        class170.field2568 = 0;
        class103.field1596 = 0;
        class295.field4605 = 0;
        class74.field1151 = 0;
        class62.field977 = 0;
        class301.field4849 = 0;
        class175.field2701 = 0;
        class114.field1751 = 0;
        class222.field3420 = 0;
        class255.field4069 = 0;
        class141.field2103 = 0;
        class222.field3453 = 0;
        class234.field3704 = 0;
        class44.field733 = 0;
        class175.field2702 = 0;
        class238.field3761 = 0;
        class154.field2296 = 0;
        class281.field4442 = 0;
        class184.field2904 = 0;
        class179.field2758 = 0;
        class294.field4566 = 0;
        class303.field4872 = 0;
        class150.field2225 = 0;
        class74.field1143 = 0;
        class231.field3651 = 0;
        class85.field1267 = 0;
        class180.field2824 = 0;
        class77.field1182 = 0;
        class20.field298 = 0;
        class211.field3252 = 0;
        class55.field865 = 0;
        class278.field4417 = 0;
        class74.field1148 = 0;
        class283.field4463 = 0;
        class220.field3356 = 0;
        class247.field3922 = 0;
        class157.field2349 = 0;
        class95.field1533 = 0;
        class31.field571 = 0;
        class301.field4844 = 0;
        class95.field1495 = 0;
        class293.field4557 = 0;
        class161.field2416 = 0;
        class151.field2235 = 0;
        class208.field3221 = 0;
        class78.field1187 = 0;
        class67.field1064 = 0;
        class183.field2899 = 0;
        class95.field1534 = 0;
        class296.field4706 = 0;
        class301.field4854 = 0;
        class252.field4027 = 0;
        class127.field1901 = 0;
        class78.field1191 = 0;
        class149.field2211 = 0;
        class92.field1477 = 0;
        class250.field4012 = 0;
        class39.field671 = 0;
        class163.field2461 = 0;
        class109.field1688 = 0;
        class43.field726 = 0;
        class209.field3240 = 0;
        class154.field2298 = 0;
        class112.field1717 = 0;
        class116.field1767 = 0;
        class130.field1930 = 0;
        class89.field1405 = 0;
        class223.field3581 = 0;
        class92.field1455 = 0;
        class222.field3394 = 0;
        class159.field2374 = 0;
        client.field2401 = 0;
        class268.field4255 = 0;
        class194.field3031 = 0;
        class109.field1689 = 0;
        class77.field1185 = 0;
        class299.field4815 = 0;
        class263.field4176 = 0;
        class270.field4272 = 0;
        class147.field2170 = 0;
        class280.field4429 = 0;
        class70.field1103 = 0;
        class281.field4447 = 0;
        class255.field4076 = 0;
        class257.field4100 = 0;
        class295.field4589 = 0;
        class67.field1070 = 0;
        class37.field651 = 0;
        class92.field1463 = 0;
        class206.field3161 = 0;
        class33.field590 = 0;
        class20.field292 = 0;
        class297.field4787 = 0;
        class2.field32 = 0;
        class98.field1566 = 0;
        class43.field716 = 0;
        class229.field3639 = 0;
        class182.field2868 = 0;
        class186.field2931 = 0;
        class240.field3819 = 0;
        class147.field2184 = 0;
        class307.field4926 = 0;
        class152.field2241 = 0;
        class248.field3937 = 0;
        class89.field1407 = 0;
        class172.field2604 = 0;
        class2.field28 = 0;
        class154.field2270 = 0;
        class44.field730 = 0;
        class18.field241 = 0;
        class89.field1400 = 0;
        class189.field2969 = 0;
        class286.field4496 = 0;
        class127.field1911 = 0;
        class31.field562 = 0;
        class180.field2827 = 0;
        class154.field2290 = 0;
        class159.field2380 = 0;
        class43.field728 = 0;
        class23.field400 = 0;
        class154.field2280 = 0;
        class264.field4185 = 0;
        class41.field680 = 0;
        class295.field4576 = 0;
        class250.field4006 = 0;
        class218.field3331 = 0;
        class136.field2030 = 0;
        class277.field4401 = 0;
        class306.field4919 = 0;
        class162.field2428 = 0;
        class105.field1639 = 0;
        class293.field4542 = 0;
        class31.field519 = 0;
        class176.field2719 = 0;
        class110.field1699 = 0;
        class26.field454 = 0;
        class105.field1636 = 0;
        class152.field2246 = 0;
        class176.field2713 = 0;
        class92.field1452 = 0;
        class301.field4834 = 0;
        class175.field2703 = 0;
        class20.field273 = 0;
        class262.field4145 = 0;
        class54.field859 = 0;
        class31.field569 = 0;
        class244.field3897 = 0;
        class31.field559 = 0;
        class117.field1785 = 0;
        class301.field4852 = 0;
        class250.field4002 = 0;
        class240.field3796 = 0;
        class223.field3592 = 0;
        class23.field390 = 0;
        class126.field1896 = 0;
        class20.field301 = 0;
        class121.field1826 = 0;
        class286.field4497 = 0;
        class106.field1658 = 0;
        class7.field118 = 0;
        class152.field2243 = 0;
        class234.field3694 = 0;
        class79.field1195 = 0;
        class28.field485 = 0;
        class136.field2033 = 0;
        class293.field4541 = 0;
        class293.field4545 = 0;
        class182.field2862 = 0;
        class229.field3638 = 0;
        class192.field2997 = 0;
        class103.field1612 = 0;
        class41.field682 = 0;
        class184.field2906 = 0;
        class116.field1772 = 0;
        class20.field329 = 0;
        class222.field3531 = 0;
        class15.field203 = 0;
        class201.field3114 = 0;
        class268.field4244 = 0;
        class60.field959 = 0;
        class173.field2669 = 0;
        class50.field815 = 0;
        class55.field875 = 0;
        class45.field757 = 0;
        class28.field484 = 0;
        class263.field4165 = 0;
        class76.field1172 = 0;
        class82.field1237 = 0;
        class104.field1620 = 0;
        class154.field2276 = 0;
        class135.field2026 = 0;
        class53.field841 = 0;
        class8.field141 = 0;
        class123.field1854 = 0;
        class265.field4186 = 0;
        class174.field2696 = 0;
        class31.field537 = 0;
        class58.field920 = 0;
        class255.field4073 = 0;
        class211.field3264 = 0;
        class128.field1914 = 0;
        class88.field1389 = 0;
        class264.field4180 = 0;
        class238.field3756 = 0;
        class59.field938 = 0;
        class166.field2503 = 0;
        class53.field834 = 0;
        class92.field1474 = 0;
        class33.field597 = 0;
        class112.field1728 = 0;
        class241.field3847 = 0;
        class47.field777 = 0;
        class89.field1402 = 0;
        client.field2394 = 0;
        class60.field950 = 0;
        class285.field4484 = 0;
        class55.field871 = 0;
        class118.field1791 = 0;
        class116.field1776 = 0;
        class57.field896 = 0;
        class262.field4156 = 0;
        class291.field4521 = 0;
        class92.field1461 = 0;
        class293.field4554 = 0;
        class276.field4397 = 0;
        class57.field894 = 0;
        field2468 = 0;
        class285.field4482 = 0;
        class240.field3816 = 0;
        class24.field412 = 0;
        class31.field561 = 0;
        class64.field1001 = 0;
        class203.field3137 = 0;
        class20.field280 = 0;
        class286.field4493 = 0;
        class262.field4130 = 0;
        class255.field4074 = 0;
        class118.field1788 = 0;
        class189.field2960 = 0;
        class147.field2167 = 0;
        class305.field4903 = 0;
        class130.field1936 = 0;
        class246.field3919 = 0;
        class285.field4488 = 0;
        class273.field4361 = 0;
        class161.field2412 = 0;
        class195.field3064 = 0;
        class295.field4653 = 0;
        class166.field2499 = 0;
        class305.field4904 = 0;
        class268.field4239 = 0;
        class222.field3518 = 0;
        class268.field4251 = 0;
        class296.field4665 = 0;
        class262.field4133 = 0;
        class208.field3225 = 0;
        class191.field2990 = 0;
        class215.field3298 = 0;
        class284.field4467 = 0;
        class6.field82 = 0;
        class191.field2985 = 0;
        class147.field2177 = 0;
        class33.field591 = 0;
        class199.field3092 = 0;
        class23.field392 = 0;
        class295.field4627 = 0;
        class88.field1379 = 0;
        class92.field1439 = 0;
        class42.field708 = 0;
        class147.field2173 = 0;
        class20.field324 = 0;
        class105.field1638 = 0;
        class279.field4421 = 0;
        class200.field3098 = 0;
        class259.field4111 = 0;
        class92.field1458 = 0;
        class31.field566 = 0;
        class208.field3215 = 0;
        class110.field1700 = 0;
        class110.field1692 = 0;
        class116.field1780 = 0;
        class28.field481 = 0;
        class270.field4279 = 0;
        class182.field2880 = 0L;
        class182.field2858.field4538 = 0;
        class15.method122(-1191199422);
        class9.field147 = -1;
        class162.field2427 = -1;
        class219.field3340 = 0;
        class215.field3302 = -1;
        class135.field2019 = -1;
        class50.field813 = 0;
        class240.field3826.field541 = 0;
        class183.field2900.field541 = 0;
        class304.field4892 = 0;
        for (int var1 = 0; ~var1 > ~class136.field2053.length; ++var1) {
            class136.field2053[var1] = null;
        }
        class14.field174 = 0;
        class207.field3185 = false;
        class203.method1432(0, -16);
        for (int var2 = 0; ~var2 > -101; ++var2) {
            class278.field4415[var2] = null;
        }
        class274.field4367 = 0;
        class259.field4112 = 0;
        class50.field818 = (float) (2047 & (int) (Math.random() * 20.0D) + -10);
        class67.field1057 = (int) (120.0D * Math.random()) + -60;
        class195.field3057 = -1;
        class285.field4487 = -20 + (int) (30.0D * Math.random());
        class52.field824 = 0;
        class280.field4432 = (int) (Math.random() * 80.0D) - 40;
        class173.field2658 = 0;
        class166.field2519 = 0;
        class305.field4895 = 0;
        class296.field4669 = 0;
        class154.field2305 = (int) (100.0D * Math.random()) - 50;
        class162.field2438 = false;
        class88.field1377 = -55 + (int) (Math.random() * 110.0D);
        class117.field1782 = 0;
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class233.field3682[var3] = null;
            class98.field1575[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class116.field1781[var4] = null;
        }
        class263.field4168 = class233.field3682[2047] = new class136();
        class22.field350.method9(123);
        class241.field3841.method9(120);
        if (class110.field1695 != null) {
            for (int var5 = 0; ~var5 > -5; ++var5) {
                for (int var6 = 0; ~var6 > -105; ++var6) {
                    for (int var7 = 0; var7 < 104; ++var7) {
                        class110.field1695[var5][var6][var7] = null;
                    }
                }
            }
        }
        class262.field4152 = new class2();
        class181.field2843 = 0;
        class194.field3046 = 0;
        class253.method1712((byte) -61);
        class133.method988((byte) -127);
        class15.field181 = 0;
        class269.field4261 = 0;
        class79.field1204 = 0;
        class53.field847 = 0;
        class293.field4550 = 0;
        class218.field3333 = 0;
        class286.field4495 = 0;
        class76.field1173 = 0;
        class237.field3749 = 0;
        class230.field3647 = 0;
        for (int var8 = 0; class205.field3155.length > var8; ++var8) {
            class205.field3155[var8] = -1;
        }
        if (class298.field4803 != -1) {
            class216.method1489(-24005, class298.field4803);
        }
        for (class288 var9 = (class288) class48.field787.method2049(0); var9 != null; var9 = (class288) class48.field787.method2047(-100)) {
            class22.method192(true, var9, (byte) 114);
        }
        if (arg0 < 50) {
            method1187(-77, 5, 100, 109, -10, -116, (byte) 93, -15);
        }
        class298.field4803 = -1;
        class48.field787 = new class305(8);
        class143.method1041(108);
        class14.field174 = 0;
        class207.field3185 = false;
        class260.field4115 = null;
        class176.field2718.method1332((int[]) null, false, (byte) -33, new int[5], -1, -1);
        for (int var10 = 0; ~var10 > -9; ++var10) {
            class84.field1262[var10] = null;
            class282.field4452[var10] = false;
            class189.field2975[var10] = -1;
        }
        class260.method1746(32);
        class182.field2877 = true;
        for (int var11 = 0; var11 < 100; ++var11) {
            class247.field3933[var11] = true;
        }
        class83.field1249 = null;
        class138.field2073 = null;
        class297.field4776 = 0;
        for (int var12 = 0; ~var12 > -7; ++var12) {
            class28.field475[var12] = new class204();
        }
        for (int var13 = 0; ~var13 > -26; ++var13) {
            class9.field160[var13] = 0;
            class56.field885[var13] = 0;
            class207.field3187[var13] = 0;
        }
        class130.field1929 = true;
        class54.field852 = class281.field4438;
        class79.field1210 = 0;
        class183.field2893 = false;
        class197.field3075 = class62.field970 = class307.field4927 = class193.field3025 = new short[256];
        class261.method1750(105);
        class284.field4471 = false;
        class162.method1174(0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    private final void method1183(int arg0) {
        if (arg0 != -10046) {
            this.field2478 = -87;
        }
        Random var2 = new Random((long) this.field2482);
        ++field2468;
        this.field2483 = new short[512];
        if (~this.field2470 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2483[var3] = (short) class216.method1495(-2, var2, this.field2470);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
    public static final void method1184(int arg0) {
        ++field2484;
        if (arg0 != 0) {
            field2472 = -41;
        }
        class281.field4433.method1169(true);
        class41.field683.method1169(true);
        class250.field4009.method1169(true);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field2479;
        if (arg0 == 500) {
            this.field2481 = class307.method2055((byte) -78, this.field2482);
            this.method1183(arg0 + -10546);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            field2485 = null;
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int var4 = class307.field4925[arg1] * this.field2474 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class250.field4008; ++var7) {
                class106.field1655 = Integer.MAX_VALUE;
                class8.field142 = Integer.MAX_VALUE;
                class279.field4426 = Integer.MAX_VALUE;
                class270.field4271 = Integer.MAX_VALUE;
                int var8 = class106.field1662[var7] * this.field2487 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field2481[255 & (var11 < this.field2474 ? var11 : -this.field2474 + var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field2481[255 & (~var14 > ~this.field2487 ? var14 : -this.field2487 + var14) + var13]);
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2483[var15];
                        int var17 = -(var11 << 12) + -this.field2483[var27] + var4;
                        int var18 = this.field2478;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class270.field4271) {
                            class106.field1655 = class8.field142;
                            class8.field142 = class279.field4426;
                            class279.field4426 = class270.field4271;
                            class270.field4271 = var19;
                        } else if (var19 >= class279.field4426) {
                            if (~var19 <= ~class8.field142) {
                                if (~var19 > ~class106.field1655) {
                                    class106.field1655 = var19;
                                }
                            } else {
                                class106.field1655 = class8.field142;
                                class8.field142 = var19;
                            }
                        } else {
                            class106.field1655 = class8.field142;
                            class8.field142 = class279.field4426;
                            class279.field4426 = var19;
                        }
                    }
                }
                int var12 = this.field2473;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class270.field4271 + class279.field4426;
                                }
                            } else {
                                var3[var7] = class106.field1655;
                            }
                        } else {
                            var3[var7] = class8.field142;
                        }
                    } else {
                        var3[var7] = class279.field4426;
                    }
                } else {
                    var3[var7] = class270.field4271;
                }
            }
        }
        ++field2476;
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field2480 = null;
        field2485 = null;
        if (arg0 == 24415) {
            field2488 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
    public static final void method1186(int arg0, int arg1, int arg2, int arg3) {
        class176.method1254((byte) 86, false);
        class215.field3295 = arg3;
        ++field2475;
        if (arg1 == 0) {
            class103.field1611 = arg2;
            class291.method1934(arg0, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field2469;
        if (arg6 == 91) {
            int var8 = class47.method396(class112.field1727, arg1, 90, class278.field4410);
            int var9 = class47.method396(class112.field1727, arg2, 94, class278.field4410);
            int var10 = class47.method396(class184.field2914, arg4, arg6 ^ -36, class2.field42);
            int var11 = class47.method396(class184.field2914, arg0, arg6 + -78, class2.field42);
            int var12 = class47.method396(class112.field1727, arg1 + arg5, arg6 ^ -9, class278.field4410);
            int var13 = class47.method396(class112.field1727, -arg5 + arg2, 118, class278.field4410);
            for (int var14 = var8; var14 < var12; ++var14) {
                class173.method1240((byte) -86, var11, class55.field872[var14], arg3, var10);
            }
            for (int var15 = var9; var13 < var15; --var15) {
                class173.method1240((byte) -85, var11, class55.field872[var15], arg3, var10);
            }
            int var16 = class47.method396(class184.field2914, arg4 + arg5, -87, class2.field42);
            int var17 = class47.method396(class184.field2914, -arg5 + arg0, 114, class2.field42);
            for (int var18 = var12; var13 >= var18; ++var18) {
                int[] var19 = class55.field872[var18];
                class173.method1240((byte) -90, var16, var19, arg3, var10);
                class173.method1240((byte) -78, var17, var19, arg7, var16);
                class173.method1240((byte) -100, var11, var19, arg3, var17);
            }
        }
    }
}
