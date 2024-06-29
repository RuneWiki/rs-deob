import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class179 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lh;")
    public static class69 field3414 = new class69();

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lbi;")
    public static class19 field3415 = new class19();

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lah;")
    public static class9 field3417 = new class9(32);

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Z")
    public static volatile boolean field3420 = false;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[Leh;")
    public static class48[] field3421 = new class48[50];

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[[[I")
    public static int[][][] field3418 = new int[4][105][105];

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1093(int arg0) {
        field3417 = null;
        if (arg0 == 0) {
            field3421 = null;
            field3415 = null;
            field3414 = null;
            field3418 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llh;IIIIIII)V")
    public static final void method1094(class113 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class138.field2506;
        int var10;
        int var11 = var10 = (arg7 << 7) - class209.field4011;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class131.field2380[arg1][arg6][arg7] - class101.field1864;
        int var17 = class131.field2380[arg1][arg6 + 1][arg7] - class101.field1864;
        int var18 = class131.field2380[arg1][arg6 + 1][arg7 + 1] - class101.field1864;
        int var19 = class131.field2380[arg1][arg6][arg7 + 1] - class101.field1864;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class23.field418;
        int var45 = (var23 << 9) / var24 + class23.field432;
        int var46 = (var26 << 9) / var30 + class23.field418;
        int var47 = (var29 << 9) / var30 + class23.field432;
        int var48 = (var32 << 9) / var36 + class23.field418;
        int var49 = (var35 << 9) / var36 + class23.field432;
        int var50 = (var38 << 9) / var42 + class23.field418;
        int var51 = (var41 << 9) / var42 + class23.field432;
        class23.field428 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class169.field3193 && class159.method964(class89.field1663, class105.field1914, var49, var51, var47, var48, var50, var46)) {
                class208.field3996 = arg6;
                class173.field3272 = arg7;
            }
            class23.field431 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class23.field417 || var50 > class23.field417 || var46 > class23.field417) {
                class23.field431 = true;
            }
            if (arg0.field2035 == -1) {
                if (arg0.field2034 != 12345678) {
                    class23.method156(var49, var51, var47, var48, var50, var46, arg0.field2034, arg0.field2028, arg0.field2042);
                }
            } else if (class36.field679) {
                int var52 = class23.field427.method366(arg0.field2035, 118);
                class23.method156(var49, var51, var47, var48, var50, var46, class206.method1302(var52, arg0.field2034), class206.method1302(var52, arg0.field2028), class206.method1302(var52, arg0.field2042));
            } else if (arg0.field2044) {
                class23.method160(var49, var51, var47, var48, var50, var46, arg0.field2034, arg0.field2028, arg0.field2042, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field2035);
            } else {
                class23.method160(var49, var51, var47, var48, var50, var46, arg0.field2034, arg0.field2028, arg0.field2042, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field2035);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class169.field3193 && class159.method964(class89.field1663, class105.field1914, var45, var47, var51, var44, var46, var50)) {
            class208.field3996 = arg6;
            class173.field3272 = arg7;
        }
        class23.field431 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class23.field417 || var46 > class23.field417 || var50 > class23.field417) {
            class23.field431 = true;
        }
        if (arg0.field2035 != -1) {
            if (!class36.field679) {
                class23.method160(var45, var47, var51, var44, var46, var50, arg0.field2039, arg0.field2042, arg0.field2028, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field2035);
                return;
            }
            int var53 = class23.field427.method366(arg0.field2035, 92);
            class23.method156(var45, var47, var51, var44, var46, var50, class206.method1302(var53, arg0.field2039), class206.method1302(var53, arg0.field2042), class206.method1302(var53, arg0.field2028));
        } else if (arg0.field2039 != 12345678) {
            class23.method156(var45, var47, var51, var44, var46, var50, arg0.field2039, arg0.field2042, arg0.field2028);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method1095(int arg0) {
        class158.field2828 = 0L;
        class90.field1665 = true;
        class43.field825.field1930 = 0;
        class125.field2255 = true;
        field3406++;
        class164.field2952 = 0;
        class159.field2876 = 0;
        class50.field917 = 0;
        class177.field3380 = 0;
        class62.field1169 = 0;
        class122.field2184 = 0;
        class17.field319 = 0;
        class184.field3564 = 0;
        class122.field2173 = 0;
        class197.field3815 = 0;
        class97.field1779 = 0;
        class59.field1097 = 0;
        class97.field1831 = 0;
        class155.field2777 = 0;
        class136.field2473 = 0;
        class5.field83 = 0;
        class97.field1780 = 0;
        class187.field3611 = 0;
        class41.field766 = 0;
        class2.field50 = 0;
        class191.field3717 = 0;
        class11.field208 = 0;
        class64.field1208 = 0;
        class12.field235 = 0;
        class184.field3537 = 0;
        class14.field273 = 0;
        class180.field3432 = 0;
        class197.field3850 = 0;
        class110.field1988 = 0;
        class9.field155 = 0;
        class74.field1389 = 0;
        class144.field2601 = 0;
        class91.field1703 = 0;
        class197.field3816 = 0;
        class52.field952 = 0;
        class197.field3843 = 0;
        class169.field3203 = 0;
        class144.field2591 = 0;
        class157.field2808 = 0;
        class146.field2644 = 0;
        class184.field3569 = 0;
        class84.field1548 = 0;
        class84.field1496 = 0;
        class10.field181 = 0;
        class41.field796 = 0;
        class126.field2268 = 0;
        class207.field3992 = 0;
        class144.field2610 = 0;
        class110.field1987 = 0;
        class65.field1227 = 0;
        class184.field3540 = 0;
        class178.field3398 = 0;
        class189.field3659 = 0;
        class97.field1774 = 0;
        class184.field3558 = 0;
        class60.field1128 = 0;
        class173.field3273 = 0;
        class190.field3681 = 0;
        class72.field1350 = 0;
        class135.field2449 = 0;
        class87.field1584 = 0;
        class188.field3617 = 0;
        class97.field1792 = 0;
        class208.field3993 = 0;
        class150.field2700 = 0;
        class128.field2320 = 0;
        class111.field1994 = 0;
        class64.field1201 = 0;
        class9.field157 = 0;
        class120.field2160 = 0;
        class111.field2001 = 0;
        class108.field1947 = 0;
        class207.field3980 = 0;
        class17.field311 = 0;
        class127.field2287 = 0;
        class65.field1236 = 0;
        class197.field3817 = 0;
        class64.field1216 = 0;
        class120.field2162 = 0;
        class78.field1412 = 0;
        class144.field2611 = 0;
        class97.field1795 = 0;
        class170.field3223 = 0;
        class13.field249 = 0;
        class109.field1966 = 0;
        class34.field583 = 0;
        class17.field315 = 0;
        class14.field267 = 0;
        class15.field293 = 0;
        class212.field4114 = 0;
        class65.field1249 = 0;
        class17.field313 = 0;
        class117.field2109 = 0;
        class128.field2309 = 0;
        class127.field2282 = 0;
        class66.field1252 = 0;
        class189.field3657 = 0;
        class10.field186 = 0;
        class196.field3800 = 0;
        class84.field1554 = 0;
        class175.field3319 = 0;
        class197.field3836 = 0;
        class84.field1535 = 0;
        class19.field366 = 0;
        class127.field2295 = 0;
        class84.field1527 = 0;
        class105.field1910 = 0;
        class151.field2722 = 0;
        class94.field1716 = 0;
        class134.field2428 = 0;
        class78.field1414 = 0;
        class119.field2140 = 0;
        class210.field4023 = 0;
        class97.field1817 = 0;
        class16.field309 = 0;
        class170.field3220 = 0;
        class159.field2879 = 0;
        class178.field3394 = 0;
        class37.field690 = 0;
        class84.field1540 = 0;
        class144.field2609 = 0;
        class135.field2447 = 0;
        class63.field1193 = 0;
        class97.field1828 = 0;
        class159.field2882 = 0;
        class97.field1776 = 0;
        class167.field3058 = 0;
        class49.field912 = 0;
        class55.field980 = 0;
        class105.field1912 = 0;
        class153.field2742 = 0;
        class21.field400 = 0;
        class159.field2858 = 0;
        class41.field775 = 0;
        class122.field2176 = 0;
        class58.field1064 = 0;
        class35.field624 = 0;
        class51.field935 = 0;
        class21.field393 = 0;
        class149.field2669 = 0;
        class84.field1523 = 0;
        class123.field2238 = 0;
        class45.field853 = 0;
        class129.field2329 = 0;
        class167.field3120 = 0;
        class94.field1719 = 0;
        class12.field218 = 0;
        class19.field367 = 0;
        class210.field4040 = 0;
        class184.field3523 = 0;
        class168.field3156 = 0;
        class128.field2314 = 0;
        class8.field140 = 0;
        class136.field2485 = 0;
        class184.field3538 = 0;
        class65.field1235 = 0;
        client.field502 = 0;
        class207.field3990 = 0;
        class117.field2112 = 0;
        class206.field3958 = 0;
        class125.field2258 = 0;
        class202.field3913 = 0;
        class83.field1478 = 0;
        class62.field1166 = 0;
        class64.field1218 = 0;
        class182.field3515 = 0;
        class135.field2463 = 0;
        class111.field2006 = 0;
        class97.field1808 = 0;
        class6.field111 = 0;
        class161.field2900 = 0;
        class150.field2684 = 0;
        class184.field3549 = 0;
        class65.field1242 = 0;
        class62.field1167 = 0;
        class118.field2130 = 0;
        class12.field223 = 0;
        class175.field3323 = 0;
        class195.field3781 = 0;
        class182.field3490 = 0;
        class115.field2089 = 0;
        class85.field1566 = 0;
        class111.field1998 = 0;
        class188.field3636 = 0;
        class89.field1664 = 0;
        class200.field3879 = 0;
        class35.field606 = 0;
        class67.field1287 = 0;
        class127.field2289 = 0;
        class101.field1874 = 0;
        class174.field3303 = 0;
        class184.field3566 = 0;
        class84.field1491 = 0;
        class34.field584 = 0;
        class177.field3374 = 0;
        class59.field1109 = 0;
        class159.field2857 = 0;
        class182.field3489 = 0;
        class60.field1121 = 0;
        class8.field147 = 0;
        class143.field2582 = 0;
        class107.field1933 = 0;
        class144.field2592 = 0;
        class207.field3975 = 0;
        class150.field2702 = 0;
        class207.field3985 = 0;
        class62.field1173 = 0;
        class35.field633 = 0;
        class58.field1038 = 0;
        class76.field1398 = 0;
        class127.field2284 = 0;
        class167.field3116 = 0;
        class135.field2461 = 0;
        class132.field2400 = 0;
        class118.field2127 = 0;
        class159.field2874 = 0;
        class113.field2030 = 0;
        class159.field2837 = 0;
        class150.field2695 = 0;
        class87.field1595 = 0;
        class58.field1042 = 0;
        class36.field675 = 0;
        class105.field1918 = 0;
        class25.field451 = 0;
        class32.field543 = 0;
        class101.field1868 = 0;
        class38.field726 = 0;
        class191.field3729 = 0;
        class122.field2188 = 0;
        class109.field1969 = 0;
        class197.field3855 = 0;
        class59.field1099 = 0;
        class194.field3754 = 0;
        class58.field1028 = 0;
        class145.field2623 = 0;
        class9.field171 = 0;
        class83.field1476 = 0;
        class97.field1820 = 0;
        class127.field2302 = 0;
        class54.field967 = 0;
        class85.field1575 = 0;
        class16.field300 = 0;
        class10.field184 = 0;
        class133.field2416 = 0;
        client.field505 = 0;
        class97.field1772 = 0;
        class119.field2136 = 0;
        class184.field3544 = 0;
        class67.field1288 = 0;
        class119.field2141 = 0;
        class133.field2423 = 0;
        class84.field1542 = 0;
        class131.field2376 = 0;
        class136.field2484 = 0;
        class17.field322 = 0;
        class197.field3830 = 0;
        class185.field3575 = 0;
        class127.field2294 = 0;
        class81.field1448 = 0;
        class66.field1259 = 0;
        class111.field1997 = 0;
        class145.field2626 = 0;
        class189.field3672 = 0;
        class65.field1241 = 0;
        class172.field3258 = 0;
        class74.field1388 = 0;
        class212.field4102 = 0;
        class207.field3988 = 0;
        class159.field2875 = 0;
        class118.field2128 = 0;
        class19.field365 = 0;
        class154.field2757 = 0;
        class154.field2761 = 0;
        class47.field897 = 0;
        class174.field3299 = 0;
        class190.field3683 = 0;
        class150.field2682 = 0;
        class97.field1789 = 0;
        class97.field1788 = 0;
        class123.field2243 = 0;
        class158.field2835 = 0;
        class188.field3621 = 0;
        class97.field1798 = 0;
        class111.field2012 = 0;
        class207.field3970 = 0;
        class202.field3898 = 0;
        class59.field1105 = 0;
        class32.field559 = 0;
        class84.field1547 = 0;
        class114.field2051 = 0;
        class97.field1777 = 0;
        class159.field2884 = 0;
        client.field494 = 0;
        class2.field43 = 0;
        class116.field2095 = 0;
        class54.field961 = 0;
        class197.field3823 = 0;
        client.field508 = 0;
        class38.field717 = 0;
        class210.field4021 = 0;
        class36.field670 = 0;
        class120.field2155 = 0;
        class84.field1545 = 0;
        class210.field4036 = 0;
        class45.field855 = 0;
        class146.field2641 = 0;
        class29.field491 = 0;
        class88.field1653 = 0;
        class52.field958 = 0;
        class193.field3742 = 0;
        class119.field2139 = 0;
        class162.field2923 = 0;
        class159.field2872 = 0;
        class130.field2374 = 0;
        class43.field817 = 0;
        class184.field3565 = 0;
        class151.field2718 = 0;
        class150.field2701 = 0;
        class38.field730 = 0;
        class78.field1413 = 0;
        class157.field2810 = 0;
        class65.field1231 = 0;
        class84.field1536 = 0;
        class202.field3892 = 0;
        client.field503 = 0;
        class184.field3552 = 0;
        class185.field3573 = 0;
        class60.field1115 = 0;
        class17.field327 = 0;
        class43.field814 = 0;
        class189.field3656 = 0;
        class112.field2024 = 0;
        class21.field401 = 0;
        class190.field3701 = 0;
        if (arg0 <= 23) {
            method1097(-125, 60);
        }
        class64.field1202 = 0;
        class130.field2364 = 0;
        class112.field2025 = 0;
        class87.field1586 = 0;
        class190.field3694 = 0;
        class161.field2909 = 0;
        class84.field1551 = 0;
        class114.field2055 = 0;
        class2.field48 = 0;
        class197.field3844 = 0;
        class84.field1515 = 0;
        class206.field3967 = 0;
        class84.field1498 = 0;
        class190.field3699 = 0;
        class133.field2412 = 0;
        class150.field2691 = 0;
        class120.field2154 = 0;
        class94.field1718 = 0;
        class123.field2236 = 0;
        class10.field188 = 0;
        class167.field3076 = 0;
        class41.field788 = 0;
        class109.field1965 = 0;
        class188.field3633 = 0;
        class2.field52 = 0;
        class99.field1857 = 0;
        class208.field4001 = 0;
        class9.field161 = 0;
        class184.field3525 = 0;
        class158.field2826 = 0;
        class206.field3956 = 0;
        class159.field2864 = 0;
        class149.field2666 = 0;
        class201.field3885 = 0;
        class11.field202 = 0;
        class16.field308 = 0;
        class97.field1781 = 0;
        class210.field4030 = 0;
        class58.field1082 = 0;
        class178.field3391 = 0;
        class208.field4003 = 0;
        class119.field2138 = 0;
        class186.field3599 = 0;
        class55.field983 = 0;
        class64.field1220 = 0;
        class31.field536 = 0;
        class189.field3664 = 0;
        class113.field2036 = 0;
        class62.field1177 = 0;
        class97.field1811 = 0;
        class156.field2799 = 0;
        class26.field462 = 0;
        class191.field3713 = 0;
        class32.field550 = 0;
        class197.field3814 = 0;
        class119.field2142 = 0;
        class186.field3591 = 0;
        class83.field1483 = 0;
        class44.field840 = 0;
        class143.field2573 = 0;
        class37.field685 = 0;
        class177.field3378 = 0;
        class17.field320 = 0;
        class190.field3690 = 0;
        class159.field2854 = 0;
        class55.field972 = 0;
        class16.field302 = 0;
        class161.field2908 = 0;
        class129.field2338 = 0;
        class41.field756 = 0;
        class109.field1963 = 0;
        class119.field2145 = 0;
        class186.field3589 = 0;
        class194.field3774 = 0;
        class155.field2778 = 0;
        class154.field2771 = 0;
        client.field497 = 0;
        class21.field396 = 0;
        class132.field2395 = 0;
        class112.field2027 = 0;
        class122.field2210 = 0;
        class190.field3702 = 0;
        class84.field1506 = 0;
        class122.field2220 = 0;
        class64.field1204 = 0;
        class144.field2597 = 0;
        class111.field2004 = 0;
        class40.field752 = 0;
        class35.field650 = 0;
        class97.field1787 = 0;
        class12.field214 = 0;
        class60.field1120 = 0;
        client.field499 = 0;
        class159.field2845 = 0;
        class29.field493 = 0;
        class101.field1866 = 0;
        class64.field1205 = 0;
        class97.field1815 = 0;
        class74.field1390 = 0;
        class14.field258 = 0;
        class103.field1889 = 0;
        class130.field2370 = 0;
        class209.field4015 = 0;
        class97.field1807 = 0;
        class169.field3204 = 0;
        class197.field3808 = 0;
        class169.field3209 = 0;
        class12.field236 = 0;
        class84.field1517 = 0;
        class58.field1033 = 0;
        class21.field402 = 0;
        class159.field2855 = 0;
        class79.field1423 = 0;
        class146.field2637 = 0;
        class15.field290 = 0;
        class59.field1107 = 0;
        class69.field1331 = 0;
        class65.field1239 = 0;
        client.field506 = 0;
        class130.field2371 = 0;
        class97.field1818 = 0;
        class153.field2747 = 0;
        class149.field2674 = 0;
        class82.field1464 = 0;
        class11.field201 = 0;
        class206.field3957 = 0;
        class156.field2800 = 0;
        class194.field3776 = 0;
        class207.field3976 = 0;
        class159.field2861 = 0;
        class128.field2308 = 0;
        class202.field3903 = 0;
        class190.field3692 = 0;
        class207.field3981 = 0;
        class12.field229 = 0;
        class119.field2144 = 0;
        class45.field861 = 0;
        class68.field1314 = 0;
        class41.field780 = 0;
        class122.field2206 = 0;
        class195.field3786 = 0;
        class178.field3388 = 0;
        class113.field2029 = 0;
        class32.field546 = 0;
        class55.field982 = 0;
        class68.field1309 = 0;
        class204.field3927 = 0;
        class188.field3641 = 0;
        class62.field1168 = 0;
        class55.field969 = 0;
        class114.field2060 = 0;
        class193.field3736 = 0;
        class83.field1487 = 0;
        class184.field3532 = 0;
        class210.field4029 = 0;
        class69.field1320 = 0;
        class151.field2720 = 0;
        class41.field768 = 0;
        class168.field3166 = 0;
        class190.field3698 = 0;
        class32.field540 = 0;
        class175.field3321 = 0;
        class84.field1532 = 0;
        class116.field2103 = 0;
        class187.field3614 = 0;
        class37.field689 = 0;
        class63.field1185 = 0;
        class97.field1802 = 0;
        class115.field2091 = 0;
        class87.field1604 = 0;
        class65.field1237 = 0;
        class210.field4024 = 0;
        class97.field1773 = 0;
        class3.field64 = 0;
        class1.field34 = 0;
        class24.field440 = 0;
        class39.field739 = 0;
        class87.field1594 = 0;
        class138.field2498 = 0;
        class55.field977 = 0;
        client.field501 = 0;
        class50.field920 = 0;
        class25.field446 = 0;
        class64.field1221 = 0;
        client.field507 = 0;
        class194.field3770 = 0;
        class84.field1499 = 0;
        class127.field2290 = 0;
        class58.field1062 = 0;
        class58.field1067 = 0;
        class68.field1307 = 0;
        class85.field1571 = 0;
        class69.field1319 = 0;
        class57.field1015 = 0;
        class49.field907 = 0;
        class202.field3893 = 0;
        class110.field1985 = 0;
        class31.field539 = 0;
        class97.field1800 = 0;
        client.field504 = 0;
        class5.field107 = 0;
        class202.field3907 = 0;
        class63.field1195 = 0;
        class69.field1322 = 0;
        class154.field2769 = 0;
        class44.field850 = 0;
        class43.field815 = 0;
        class97.field1799 = 0;
        class126.field2267 = 0;
        class184.field3557 = 0;
        class146.field2633 = 0;
        class97.field1823 = 0;
        class197.field3829 = 0;
        class185.field3572 = 0;
        class37.field686 = 0;
        class60.field1114 = 0;
        class17.field321 = 0;
        class120.field2153 = 0;
        class116.field2104 = 0;
        class128.field2318 = 0;
        class189.field3668 = 0;
        class37.field696 = 0;
        class167.field3059 = 0;
        class38.field729 = 0;
        class151.field2705 = 0;
        class123.field2242 = 0;
        class184.field3561 = 0;
        class84.field1507 = 0;
        class188.field3644 = 0;
        class210.field4020 = 0;
        class66.field1254 = 0;
        class1.field11 = 0;
        class12.field234 = 0;
        class1.field4 = 0;
        class191.field3718 = 0;
        class161.field2894 = 0;
        class202.field3912 = 0;
        class84.field1550 = 0;
        class150.field2698 = 0;
        class59.field1093 = 0;
        class161.field2905 = 0;
        class44.field831 = 0;
        class169.field3183 = 0;
        class12.field230 = 0;
        class63.field1189 = 0;
        class51.field934 = 0;
        class125.field2246 = 0;
        class200.field3874 = 0;
        class169.field3211 = 0;
        class83.field1484 = 0;
        class197.field3818 = 0;
        class182.field3487 = 0;
        class108.field1954 = 0;
        class206.field3954 = 0;
        class65.field1245 = 0;
        class97.field1784 = 0;
        class83.field1473 = 0;
        class182.field3499 = 0;
        class156.field2796 = 0;
        class206.field3960 = 0;
        class25.field449 = 0;
        class138.field2497 = 0;
        class15.field282 = 0;
        class169.field3202 = 0;
        class131.field2389 = 0;
        class47.field898 = 0;
        class87.field1601 = 0;
        class97.field1824 = 0;
        class18.field343 = 0;
        class154.field2772 = 0;
        class19.field357 = 0;
        class12.field217 = 0;
        class17.field323 = 0;
        class170.field3226 = 0;
        class85.field1567 = 0;
        class155.field2776 = 0;
        class84.field1541 = 0;
        class135.field2466 = 0;
        class26.field464 = 0;
        class107.field1935 = 0;
        class146.field2632 = 0;
        class162.field2916 = 0;
        class97.field1832 = 0;
        class97.field1771 = 0;
        class196.field3796 = 0;
        class167.field3112 = 0;
        class201.field3888 = 0;
        class76.field1395 = 0;
        class185.field3581 = 0;
        class159.field2852 = 0;
        class41.field773 = 0;
        class154.field2763 = 0;
        class73.field1362 = 0;
        class17.field317 = 0;
        class184.field3547 = 0;
        class188.field3623 = 0;
        class74.field1379 = 0;
        class57.field1011 = 0;
        class66.field1264 = 0;
        class111.field2008 = 0;
        class141.field2570 = 0;
        class16.field306 = 0;
        class164.field2950 = 0;
        class114.field2057 = 0;
        class197.field3833 = 0;
        class9.field162 = 0;
        class115.field2085 = 0;
        class76.field1394 = 0;
        class92.field1707 = 0;
        class153.field2738 = 0;
        class188.field3642 = 0;
        class177.field3377 = 0;
        class101.field1872 = 0;
        class187.field3613 = 0;
        class97.field1785 = 0;
        class106.field1923 = 0;
        class101.field1862 = 0;
        class188.field3646 = 0;
        class144.field2602 = 0;
        class65.field1226 = 0;
        class69.field1328 = 0;
        class138.field2507 = 0;
        class46.field875 = 0;
        class46.field874 = 0;
        class79.field1425 = 0;
        class97.field1833 = 0;
        class32.field545 = 0;
        class115.field2087 = 0;
        class184.field3531 = 0;
        class144.field2590 = 0;
        class108.field1955 = 0;
        class35.field613 = 0;
        class97.field1827 = 0;
        class97.field1812 = 0;
        class84.field1525 = 0;
        class146.field2640 = 0;
        class87.field1585 = 0;
        class52.field950 = 0;
        class65.field1225 = 0;
        class182.field3518 = 0;
        class84.field1544 = 0;
        class84.field1494 = 0;
        class17.field312 = 0;
        class161.field2896 = 0;
        class76.field1404 = 0;
        class97.field1821 = 0;
        class159.field2847 = 0;
        class155.field2784 = 0;
        class74.field1385 = 0;
        class2.field38 = 0;
        class119.field2137 = 0;
        class7.field125 = 0;
        class133.field2421 = 0;
        class122.field2198 = 0;
        class188.field3637 = 0;
        class190.field3695 = 0;
        class111.field1992 = 0;
        class59.field1094 = 0;
        class210.field4027 = 0;
        class136.field2487 = 0;
        class184.field3559 = 0;
        class90.field1669 = 0;
        class106.field1924 = 0;
        class51.field939 = 0;
        class131.field2379 = 0;
        class97.field1806 = 0;
        class44.field843 = 0;
        class66.field1260 = 0;
        class134.field2431 = 0;
        class78.field1410 = 0;
        class157.field2811 = 0;
        class197.field3809 = 0;
        class91.field1699 = 0;
        class69.field1325 = 0;
        class88.field1656 = 0;
        class73.field1366 = 0;
        class32.field553 = 0;
        class184.field3560 = 0;
        class135.field2456 = 0;
        class167.field2997 = 0;
        class62.field1171 = 0;
        class159.field2838 = 0;
        class69.field1316 = 0;
        class159.field2869 = 0;
        class158.field2830 = 0;
        class111.field2007 = 0;
        class184.field3551 = 0;
        field3404 = 0;
        class207.field3971 = 0;
        class9.field168 = 0;
        class169.field3199 = 0;
        class122.field2196 = 0;
        class83.field1482 = 0;
        class16.field301 = 0;
        class145.field2622 = 0;
        class105.field1913 = 0;
        class37.field701 = 0;
        class97.field1805 = 0;
        class185.field3574 = 0;
        class84.field1510 = 0;
        class154.field2754 = 0;
        class14.field263 = 0;
        class67.field1276 = 0;
        class19.field360 = 0;
        class174.field3296 = 0;
        class212.field4112 = 0;
        class97.field1786 = 0;
        class182.field3492 = 0;
        class170.field3225 = 0;
        class135.field2452 = 0;
        class173.field3276 = 0;
        class178.field3395 = 0;
        class106.field1928 = 0;
        class210.field4016 = 0;
        class57.field1013 = 0;
        class136.field2489 = 0;
        class159.field2843 = 0;
        class35.field622 = 0;
        class97.field1816 = 0;
        class198.field3860 = 0;
        class3.field61 = 0;
        class92.field1704 = 0;
        class113.field2037 = 0;
        class128.field2313 = 0;
        class114.field2072 = 0;
        class97.field1793 = 0;
        class49.field908 = 0;
        class18.field348 = 0;
        class60.field1123 = 0;
        class109.field1964 = 0;
        class74.field1376 = 0;
        class125.field2245 = 0;
        class159.field2846 = 0;
        class14.field253 = 0;
        class195.field3782 = 0;
        class97.field1829 = 0;
        class184.field3543 = 0;
        class44.field838 = 0;
        class128.field2321 = 0;
        class156.field2794 = 0;
        class57.field1007 = 0;
        class184.field3568 = 0;
        class58.field1057 = 0;
        class190.field3700 = 0;
        class99.field1843 = 0;
        class184.field3519 = 0;
        class150.field2681 = 0;
        class25.field456 = 0;
        class169.field3185 = 0;
        class154.field2758 = 0;
        class170.field3216 = 0;
        class151.field2721 = 0;
        class72.field1356 = 0;
        class206.field3950 = 0;
        class162.field2919 = 0;
        class190.field3708 = 0;
        class66.field1267 = 0;
        class141.field2567 = 0;
        class135.field2454 = 0;
        class9.field167 = 0;
        class58.field1073 = 0;
        class132.field2402 = 0;
        class111.field1993 = 0;
        class63.field1180 = 0;
        class116.field2107 = 0;
        class35.field661 = 0;
        class87.field1603 = 0;
        class161.field2906 = 0;
        class111.field2003 = 0;
        class184.field3562 = 0;
        class184.field3546 = 0;
        class97.field1810 = 0;
        class208.field4002 = 0;
        class71.field1338 = 0;
        class19.field362 = 0;
        class136.field2477 = 0;
        class127.field2293 = 0;
        class65.field1233 = 0;
        class188.field3630 = 0;
        class10.field177 = 0;
        class136.field2486 = 0;
        class186.field3607 = 0;
        class110.field1979 = 0;
        class167.field3072 = 0;
        class184.field3567 = 0;
        class55.field971 = 0;
        class153.field2743 = 0;
        class159.field2850 = 0;
        class44.field833 = 0;
        class200.field3876 = 0;
        class59.field1103 = 0;
        class173.field3275 = 0;
        class1.field22 = 0;
        class172.field3257 = 0;
        class173.field3285 = 0;
        class18.field349 = 0;
        class19.field373 = 0;
        class39.field733 = 0;
        class184.field3521 = 0;
        class69.field1326 = 0;
        class58.field1051 = 0;
        class19.field375 = 0;
        class120.field2161 = 0;
        class197.field3845 = 0;
        class122.field2186 = 0;
        class197.field3813 = 0;
        class55.field973 = 0;
        class122.field2221 = 0;
        class195.field3780 = 0;
        class125.field2249 = 0;
        class69.field1315 = 0;
        class143.field2571 = 0;
        class64.field1214 = 0;
        class210.field4017 = 0;
        class69.field1324 = 0;
        class114.field2047 = 0;
        class17.field318 = 0;
        class190.field3689 = 0;
        class64.field1215 = 0;
        class164.field2936 = 0;
        class14.field251 = 0;
        class81.field1447 = 0;
        class19.field370 = 0;
        class13.field240 = 0;
        class174.field3294 = 0;
        class184.field3541 = 0;
        class201.field3887 = 0;
        class8.field138 = 0;
        class111.field2010 = 0;
        class64.field1213 = 0;
        class159.field2867 = 0;
        class63.field1192 = 0;
        class162.field2928 = 0;
        class168.field3145 = 0;
        class57.field1010 = 0;
        class153.field2750 = 0;
        class130.field2359 = 0;
        class2.field44 = 0;
        class84.field1519 = 0;
        class10.field185 = 0;
        class197.field3839 = 0;
        class66.field1256 = 0;
        class151.field2716 = 0;
        class46.field865 = 0;
        class9.field163 = 0;
        class84.field1520 = 0;
        class5.field85 = 0;
        class144.field2614 = 0;
        class159.field2848 = 0;
        class52.field947 = 0;
        class8.field148 = 0;
        class1.field6 = 0;
        class167.field3086 = 0;
        class57.field1002 = 0;
        class43.field813 = 0;
        class197.field3846 = 0;
        class35.field658 = 0;
        class155.field2779 = 0;
        class122.field2187 = 0;
        class195.field3777 = 0;
        class99.field1854 = 0;
        class184.field3539 = 0;
        class128.field2311 = 0;
        class57.field1014 = 0;
        class167.field3004 = 0;
        class68.field1311 = 0;
        class94.field1712 = 0;
        class184.field3520 = 0;
        class73.field1363 = 0;
        class99.field1856 = 0;
        class67.field1300 = 0;
        class206.field3968 = 0;
        client.field495 = 0;
        class178.field3396 = 0;
        class84.field1500 = 0;
        class177.field3381 = 0;
        class108.field1957 = 0;
        class73.field1375 = 0;
        class66.field1258 = 0;
        class143.field2583 = 0;
        class159.field2863 = 0;
        class82.field1467 = 0;
        class175.field3320 = 0;
        class184.field3556 = 0;
        class184.field3529 = 0;
        class187.field3612 = 0;
        class82.field1472 = 0;
        class149.field2665 = 0;
        class175.field3327 = 0;
        class46.field864 = 0;
        class90.field1666 = 0;
        class108.field1956 = 0;
        class210.field4038 = 0;
        class32.field541 = 0;
        class74.field1381 = 0;
        field3406 = 0;
        class196.field3805 = 0;
        class197.field3835 = 0;
        class97.field1813 = 0;
        class54.field962 = 0;
        class58.field1034 = 0;
        class176.field3331 = 0;
        class84.field1557 = 0;
        class45.field862 = 0;
        class210.field4034 = 0;
        class26.field465 = 0;
        class84.field1516 = 0;
        class184.field3554 = 0;
        class210.field4019 = 0;
        class60.field1129 = 0;
        class136.field2469 = 0;
        class167.field3063 = 0;
        class132.field2399 = 0;
        class170.field3222 = 0;
        class197.field3828 = 0;
        class197.field3834 = 0;
        class12.field212 = 0;
        class190.field3680 = 0;
        class43.field826 = 0;
        class184.field3534 = 0;
        class58.field1043 = 0;
        class81.field1450 = 0;
        class184.field3522 = 0;
        class197.field3849 = 0;
        class186.field3583 = 0;
        class212.field4110 = 0;
        class200.field3873 = 0;
        class162.field2921 = 0;
        class49.field905 = 0;
        class210.field4039 = 0;
        class198.field3865 = 0;
        class97.field1796 = 0;
        class83.field1480 = 0;
        class159.field2862 = 0;
        class62.field1170 = 0;
        class114.field2052 = 0;
        class18.field330 = 0;
        class207.field3974 = 0;
        class127.field2286 = 0;
        class29.field485 = 0;
        class94.field1715 = 0;
        class172.field3264 = 0;
        class83.field1488 = 0;
        class32.field544 = 0;
        class66.field1268 = 0;
        class69.field1329 = 0;
        class84.field1518 = 0;
        class34.field578 = 0;
        class111.field2005 = 0;
        class161.field2899 = 0;
        class182.field3513 = 0;
        class197.field3847 = 0;
        class84.field1501 = 0;
        class197.field3842 = 0;
        class84.field1495 = 0;
        class108.field1946 = 0;
        class155.field2783 = 0;
        class88.field1659 = 0;
        class143.field2576 = 0;
        class98.field1839 = 0;
        class3.field63 = 0;
        class41.field799 = 0;
        class197.field3858 = 0;
        class135.field2457 = 0;
        class159.field2877 = 0;
        class36.field677 = 0;
        class100.field1859 = 0;
        class170.field3214 = 0;
        class85.field1569 = 0;
        class58.field1055 = 0;
        class173.field3287 = 0;
        class155.field2780 = 0;
        class118.field2133 = 0;
        class195.field3784 = 0;
        class159.field2880 = 0;
        class159.field2881 = 0;
        class187.field3609 = 0;
        class105.field1908 = 0;
        class82.field1463 = 0;
        class196.field3795 = 0;
        class122.field2214 = 0;
        class135.field2465 = 0;
        class115.field2081 = 0;
        class207.field3986 = 0;
        class177.field3375 = 0;
        field3403 = 0;
        class164.field2939 = 0;
        class146.field2639 = 0;
        class209.field4004 = 0;
        class136.field2475 = 0;
        client.field496 = 0;
        class184.field3536 = 0;
        class189.field3660 = 0;
        class18.field352 = 0;
        class21.field392 = 0;
        class12.field210 = 0;
        class127.field2298 = 0;
        class57.field1016 = 0;
        class34.field579 = 0;
        class207.field3984 = 0;
        class111.field1991 = 0;
        class67.field1281 = 0;
        class157.field2816 = 0;
        class58.field1054 = 0;
        class49.field909 = 0;
        class37.field703 = 0;
        class189.field3658 = 0;
        class9.field153 = 0;
        class97.field1814 = 0;
        class26.field461 = 0;
        class97.field1830 = 0;
        class111.field1996 = 0;
        class24.field441 = 0;
        class84.field1552 = 0;
        class97.field1797 = 0;
        class173.field3283 = 0;
        class67.field1284 = 0;
        class11.field205 = 0;
        class189.field3655 = 0;
        class44.field829 = 0;
        class168.field3135 = 0;
        class84.field1533 = 0;
        class127.field2279 = 0;
        class38.field721 = 0;
        class16.field307 = 0;
        class97.field1790 = 0;
        class16.field297 = 0;
        class24.field435 = 0;
        class97.field1794 = 0;
        class130.field2355 = 0;
        class195.field3787 = 0;
        class97.field1778 = 0;
        class180.field3437 = 0;
        class172.field3269 = 0;
        class97.field1825 = 0;
        class184.field3550 = 0;
        class19.field369 = 0;
        class144.field2603 = 0;
        class174.field3293 = 0;
        class97.field1775 = 0;
        class138.field2509 = 0;
        class120.field2165 = 0;
        class159.field2859 = 0;
        class134.field2437 = 0;
        class8.field150 = 0;
        class156.field2804 = 0;
        class144.field2595 = 0;
        class180.field3425 = 0;
        class34.field585 = 0;
        class20.field385 = 0;
        class122.field2178 = 0;
        class154.field2766 = 0;
        class44.field836 = 0;
        class69.field1317 = 0;
        class38.field720 = 0;
        class59.field1108 = 0;
        class198.field3866 = 0;
        class101.field1869 = 0;
        class184.field3563 = 0;
        class99.field1847 = 0;
        class26.field460 = 0;
        class212.field4115 = 0;
        class131.field2390 = 0;
        class52.field953 = 0;
        class115.field2090 = 0;
        class92.field1706 = 0;
        class84.field1492 = 0;
        class190.field3693 = 0;
        class97.field1826 = 0;
        class44.field844 = 0;
        class159.field2860 = 0;
        class19.field356 = 0;
        class170.field3215 = 0;
        class144.field2605 = 0;
        class197.field3848 = 0;
        class97.field1819 = 0;
        class87.field1589 = 0;
        class8.field139 = 0;
        class78.field1411 = 0;
        class66.field1251 = 0;
        class69.field1332 = 0;
        class167.field3108 = 0;
        class145.field2619 = 0;
        class182.field3497 = 0;
        class40.field754 = 0;
        class159.field2878 = 0;
        class207.field3983 = 0;
        class37.field687 = 0;
        class12.field209 = 0;
        class138.field2508 = 0;
        class25.field448 = 0;
        class188.field3631 = 0;
        class21.method133((byte) -105);
        class117.field2122.field1834 = 0;
        class98.field1838 = -1;
        class175.field3324 = 0;
        class79.field1436 = 0;
        class195.field3779 = -1;
        class105.field1909 = -1;
        class21.field394.field1834 = 0;
        class46.field881 = -1;
        class119.field2146 = 0;
        for (int var1 = 0; var1 < class2.field57.length; var1++) {
            class2.field57[var1] = null;
        }
        class170.field3244 = false;
        class133.field2404 = 0;
        class195.method1237(0, -1075125499);
        for (int var2 = 0; var2 < 100; var2++) {
            class76.field1397[var2] = null;
        }
        class40.field751 = 0;
        class2.field39 = (int) (Math.random() * 120.0D) - 60;
        class50.field929 = (int) (Math.random() * 100.0D) - 50;
        class55.field976 = 0;
        class26.field466 = 0;
        class153.field2741 = 0;
        class101.field1870 = 0;
        class191.field3712 = -1;
        class1.field5 = (int) (Math.random() * 80.0D) - 40;
        class187.field3610 = 0;
        class209.field4013 = false;
        class97.field1804 = (int) (Math.random() * 110.0D) - 55;
        class182.field3491 = (int) (Math.random() * 30.0D) - 20;
        class38.field716 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class38.field711 = 0;
        class91.field1700 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class57.field1024[var3] = null;
            class21.field390[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class52.field948[var4] = null;
        }
        class46.field872 = class57.field1024[2047] = new class67();
        class6.field110.method407(2);
        class51.field936.method407(2);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var15 = 0; var15 < 104; var15++) {
                    class157.field2813[var5][var14][var15] = null;
                }
            }
        }
        class79.field1429 = new class69();
        class64.field1212 = 0;
        class172.field3266 = 0;
        for (int var6 = 0; var6 < class150.field2687; var6++) {
            class110 var13 = class58.method313(var6, 85);
            if (var13 != null && var13.field1984 == 0) {
                class36.field671[var6] = 0;
                class94.field1710[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class64.field1209.length; var7++) {
            class64.field1209[var7] = -1;
        }
        if (class110.field1986 != -1) {
            class135.method817(-61440, class110.field1986);
        }
        for (class7 var8 = (class7) class134.field2436.method57(-19654); var8 != null; var8 = (class7) class134.field2436.method49(1)) {
            class157.method950(true, var8, false);
        }
        class110.field1986 = -1;
        class134.field2436 = new class9(8);
        class133.field2404 = 0;
        class50.field925 = null;
        class170.field3244 = false;
        class36.field674.method1312(-1, new int[5], false, 123, null);
        for (int var9 = 0; var9 < 8; var9++) {
            class193.field3737[var9] = null;
            class91.field1702[var9] = false;
        }
        class19.method123((byte) 127);
        class206.field3951 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            class99.field1849[var10] = true;
        }
        class12.field231 = null;
        class107.field1937 = 0;
        class186.field3606 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            class60.field1117[var11] = new class133();
        }
        for (int var12 = 0; var12 < 25; var12++) {
            class79.field1437[var12] = 0;
            class16.field304[var12] = 0;
            class128.field2312[var12] = 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ld;IIIIII)V")
    public static final void method1096(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field528.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field528[var8] - class138.field2506;
            int var22 = arg0.field516[var8] - class101.field1864;
            int var23 = arg0.field519[var8] - class209.field4011;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field522 != null) {
                class30.field521[var8] = var24;
                class30.field510[var8] = var27;
                class30.field531[var8] = var28;
            }
            class30.field529[var8] = (var24 << 9) / var28 + class23.field418;
            class30.field525[var8] = (var27 << 9) / var28 + class23.field432;
        }
        class23.field428 = 0;
        int var9 = arg0.field512.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field512[var10];
            int var12 = arg0.field513[var10];
            int var13 = arg0.field514[var10];
            int var14 = class30.field529[var11];
            int var15 = class30.field529[var12];
            int var16 = class30.field529[var13];
            int var17 = class30.field525[var11];
            int var18 = class30.field525[var12];
            int var19 = class30.field525[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class169.field3193 && class159.method964(class89.field1663, class105.field1914, var17, var18, var19, var14, var15, var16)) {
                    class208.field3996 = arg5;
                    class173.field3272 = arg6;
                }
                class23.field431 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class23.field417 || var15 > class23.field417 || var16 > class23.field417) {
                    class23.field431 = true;
                }
                if (arg0.field522 == null || arg0.field522[var10] == -1) {
                    if (arg0.field517[var10] != 12345678) {
                        class23.method156(var17, var18, var19, var14, var15, var16, arg0.field517[var10], arg0.field518[var10], arg0.field515[var10]);
                    }
                } else if (class36.field679) {
                    int var20 = class23.field427.method366(arg0.field522[var10], 111);
                    class23.method156(var17, var18, var19, var14, var15, var16, class206.method1302(var20, arg0.field517[var10]), class206.method1302(var20, arg0.field518[var10]), class206.method1302(var20, arg0.field515[var10]));
                } else if (arg0.field511) {
                    class23.method160(var17, var18, var19, var14, var15, var16, arg0.field517[var10], arg0.field518[var10], arg0.field515[var10], class30.field521[0], class30.field521[1], class30.field521[3], class30.field510[0], class30.field510[1], class30.field510[3], class30.field531[0], class30.field531[1], class30.field531[3], arg0.field522[var10]);
                } else {
                    class23.method160(var17, var18, var19, var14, var15, var16, arg0.field517[var10], arg0.field518[var10], arg0.field515[var10], class30.field521[var11], class30.field521[var12], class30.field521[var13], class30.field510[var11], class30.field510[var12], class30.field510[var13], class30.field531[var11], class30.field531[var12], class30.field531[var13], arg0.field522[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Z")
    public static final boolean method1097(int arg0, int arg1) {
        if (arg0 > -86) {
            field3416 = 37;
        }
        field3403++;
        return (arg1 >> 29 & 0x1) != 0;
    }
}
