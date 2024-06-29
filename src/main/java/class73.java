import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 implements Runnable {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[Lw;")
    public volatile class149[] field1599 = new class149[2];

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
    public volatile boolean field1614 = false;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
    public volatile boolean field1616 = false;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lqf;")
    public static class117 field1597 = class72.method514(111, "Chat panel redrawn");

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "J")
    public static volatile long field1598 = 0L;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lqf;")
    public static class117 field1602 = class72.method514(114, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
    public static int[] field1605 = new int[100];

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[[[B")
    public static byte[][][] field1606 = new byte[4][104][104];

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Lqf;")
    private static class117 field1607 = class72.method514(113, "Members only world");

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lqf;")
    public static class117 field1609 = field1607;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lu;")
    public class137 field1603;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
    public static boolean field1604;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method523(String arg0, byte arg1) throws ClassNotFoundException {
        if (arg1 < 18) {
            method524(56);
        }
        field1612++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method524(int arg0) {
        field1596++;
        while (class96.field2338.method957(8, class71.field1502) >= 27) {
            int var1 = class96.field2338.method963(-102, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class72.field1533[var1] == null) {
                var2 = true;
                class72.field1533[var1] = new class58();
            }
            class58 var3 = class72.field1533[var1];
            class150.field3724[class25.field483++] = var1;
            var3.field2008 = class43.field856;
            int var4 = class96.field2338.method963(-38, 1);
            if (var4 == 1) {
                class56.field1151[class91.field2225++] = var1;
            }
            int var5 = class96.field2338.method963(arg0 - 121, 5);
            int var6 = class96.field2338.method963(-95, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class96.field2338.method963(-108, 5);
            var3.field1172 = class99.method776(9, class96.field2338.method963(-115, 13));
            int var8 = class31.field655[class96.field2338.method963(arg0 ^ 0xFFFFFFA6, 3)];
            var3.field1956 = var3.field1172.field3182;
            var3.field1954 = var3.field1172.field3165;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field1975 = var3.field1172.field3197;
            if (var2) {
                var3.field1999 = var8;
            }
            var3.field1946 = var3.field1172.field3177;
            var3.field2019 = var3.field1172.field3190;
            var3.field1972 = var3.field1172.field3170;
            var3.field2009 = var3.field1172.field3199;
            var3.field1982 = var3.field1172.field3198;
            if (var3.field1972 == 0) {
                var3.field1999 = 0;
            }
            var3.field1991 = var3.field1172.field3203;
            var3.method685((byte) 18, var6 == 1, class141.field3395.field1970[0] + var5, class141.field3395.field2004[0] + var7);
        }
        if (arg0 == 0) {
            class96.field2338.method956(13656);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method525(int arg0) {
        class41.field806 = null;
        class21.field354 = null;
        field1595++;
        class3.field58 = null;
        class116.field2758 = null;
        class144.field3536 = null;
        if (arg0 != -21572) {
            method533(-118);
        }
        class42.field840 = null;
    }

    @OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
    public final void run() {
        this.field1616 = true;
        try {
            while (!this.field1614) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class149 var2 = this.field1599[var1];
                    if (var2 != null) {
                        var2.method1203(false);
                    }
                }
                class148.method1183(0, 10L);
                class18.method147(null, 50, this.field1603);
            }
        } catch (Exception var9) {
            class105.method803((byte) -76, var9, null);
        } finally {
            Object var6 = null;
            this.field1616 = false;
        }
        field1618++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILqf;)V")
    public static final void method526(int arg0, int arg1, class117 arg2) {
        class42.field843++;
        field1600++;
        class99.field2373.method961(3, -1198);
        class99.field2373.method561(101, arg2.method942((byte) 11));
        class99.field2373.method571(arg0, -11124);
        if (arg1 != 23572) {
            method529(-1, -65);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method527(byte arg0) {
        if (arg0 >= -62) {
            field1597 = null;
        }
        field1602 = null;
        field1609 = null;
        field1607 = null;
        field1605 = null;
        field1597 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method528(int arg0) {
        class26.field525.field3603 = 0;
        field1617++;
        class133.field3158 = true;
        class35.field724 = 0;
        class82.field1877 = 0;
        class85.field1934 = 0;
        class128.field3034 = 0;
        class89.field2107 = 0;
        class81.field1871 = 0;
        class89.field2079 = 0;
        class102.field2459 = 0;
        class81.field1845 = 0;
        class21.field340 = 0;
        class126.field2994 = 0;
        class19.field315 = 0;
        class135.field3225 = 0;
        class18.field290 = 0;
        class103.field2487 = 0;
        class141.field3417 = 0;
        class97.field2348 = 0;
        class124.field2919 = 0;
        class18.field273 = 0;
        class138.field3291 = 0;
        class117.field2763 = 0;
        class87.field1944 = 0;
        class5.field103 = 0;
        class26.field516 = 0;
        class141.field3389 = 0;
        class68.field1429 = 0;
        class133.field3151 = 0;
        class58.field1178 = 0;
        class77.field1706 = 0;
        class24.field464 = 0;
        class70.field1494 = 0;
        class36.field760 = 0;
        class141.field3419 = 0;
        class100.field2420 = 0;
        class64.field1327 = 0;
        class149.field3695 = 0;
        class52.field1076 = 0;
        class23.field440 = 0;
        class95.field2293 = 0;
        class15.field211 = 0;
        class136.field3253 = 0;
        class122.field2898 = 0;
        class141.field3398 = 0;
        class21.field353 = 0;
        class53.field1094 = 0;
        class69.field1454 = 0;
        class23.field444 = 0;
        class115.field2722 = 0;
        class135.field3232 = 0;
        class117.field2782 = 0;
        class79.field1806 = 0;
        class99.field2391 = 0;
        class77.field1740 = 0;
        class79.field1789 = 0;
        class20.field322 = 0;
        class87.field1983 = 0;
        class64.field1332 = 0;
        class116.field2746 = 0;
        class40.field804 = 0;
        class77.field1730 = 0;
        class40.field800 = 0;
        class91.field2219 = 0;
        class133.field3143 = 0;
        class64.field1313 = 0;
        class77.field1741 = 0;
        class117.field2801 = 0;
        class135.field3229 = 0;
        class152.field3750 = 0;
        class126.field2981 = 0;
        class62.field1259 = 0;
        class64.field1273 = 0;
        class50.field1051 = 0;
        class41.field813 = 0;
        class140.field3335 = 0;
        class5.field99 = 0;
        class64.field1305 = 0;
        class72.field1584 = 0;
        class43.field853 = 0;
        class23.field435 = 0;
        class148.field3642 = 0;
        class79.field1800 = 0;
        class71.field1509 = 0;
        class53.field1109 = 0;
        class29.field580 = 0;
        class56.field1156 = 0;
        class114.field2709 = 0;
        class119.field2850 = 0;
        class143.field3488 = 0;
        class103.field2484 = 0;
        field1600 = 0;
        class96.field2327 = 0;
        class52.field1073 = 0;
        class93.field2271 = 0;
        class130.field3084 = 0;
        class77.field1719 = 0;
        class149.field3680 = 0;
        class147.field3599 = 0;
        class119.field2848 = 0;
        class93.field2267 = 0;
        class89.field2093 = 0;
        class4.field68 = 0;
        class52.field1082 = 0;
        class77.field1725 = 0;
        class89.field2048 = 0;
        class19.field296 = 0;
        class95.field2307 = 0;
        class110.field2595 = 0;
        class42.field824 = 0;
        class135.field3220 = 0;
        class34.field711 = 0;
        class77.field1701 = 0;
        class119.field2844 = 0;
        class50.field1053 = 0;
        class55.field1140 = 0;
        class55.field1136 = 0;
        class76.field1678 = 0;
        class70.field1474 = 0;
        class93.field2255 = 0;
        class82.field1883 = 0;
        class91.field2229 = 0;
        class93.field2270 = 0;
        class141.field3371 = 0;
        class64.field1293 = 0;
        class72.field1538 = 0;
        class134.field3202 = 0;
        class77.field1717 = 0;
        class71.field1512 = 0;
        field1615 = 0;
        class87.field1951 = 0;
        class96.field2321 = 0;
        class89.field2151 = 0;
        class62.field1257 = 0;
        class77.field1698 = 0;
        class64.field1276 = 0;
        class52.field1071 = 0;
        class42.field835 = 0;
        class128.field3024 = 0;
        class21.field375 = 0;
        class93.field2272 = 0;
        class64.field1294 = 0;
        class56.field1147 = 0;
        class91.field2227 = 0;
        class58.field1181 = 0;
        class153.field3767 = 0;
        class83.field1905 = 0;
        class117.field2788 = 0;
        class119.field2838 = 0;
        class117.field2765 = 0;
        class69.field1437 = 0;
        class25.field487 = 0;
        class26.field510 = 0;
        class77.field1715 = 0;
        class134.field3161 = 0;
        class35.field725 = 0;
        class71.field1506 = 0;
        class104.field2513 = 0;
        class90.field2187 = 0;
        class5.field78 = 0;
        class52.field1070 = 0;
        class96.field2323 = 0;
        class96.field2330 = 0;
        class55.field1123 = 0;
        class117.field2776 = 0;
        class82.field1872 = 0;
        class97.field2349 = 0;
        class124.field2926 = 0;
        class116.field2756 = 0;
        class149.field3692 = 0;
        class100.field2417 = 0;
        class70.field1497 = 0;
        class135.field3235 = 0;
        class87.field1989 = 0;
        class135.field3238 = 0;
        class31.field665 = 0;
        class18.field287 = 0;
        class121.field2878 = 0;
        class126.field2973 = 0;
        class141.field3370 = 0;
        class35.field729 = 0;
        class93.field2266 = 0;
        class149.field3688 = 0;
        class77.field1749 = 0;
        class25.field499 = 0;
        class29.field586 = 0;
        class136.field3246 = 0;
        class77.field1756 = 0;
        class152.field3758 = 0;
        class96.field2335 = 0;
        class87.field1967 = 0;
        class32.field681 = 0;
        class117.field2767 = 0;
        class149.field3678 = 0;
        class141.field3402 = 0;
        class149.field3693 = 0;
        class44.field864 = 0;
        class24.field467 = 0;
        field1595 = 0;
        class72.field1561 = 0;
        field1613 = 0;
        class16.field233 = 0;
        class47.field955 = 0;
        class66.field1383 = 0;
        class64.field1333 = 0;
        class5.field83 = 0;
        field1617 = 0;
        class16.field259 = 0;
        class116.field2749 = 0;
        class143.field3507 = 0;
        class99.field2378 = 0;
        class117.field2805 = 0;
        class78.field1760 = 0;
        class148.field3641 = 0;
        class64.field1318 = 0;
        class143.field3495 = 0;
        class77.field1728 = 0;
        class152.field3735 = 0;
        class129.field3065 = 0;
        class89.field2132 = 0;
        class152.field3764 = 0;
        class95.field2306 = 0;
        class148.field3619 = 0;
        class139.field3305 = 0;
        class27.field534 = 0;
        class93.field2253 = 0;
        class4.field72 = 0;
        class147.field3596 = 0;
        class64.field1310 = 0;
        class117.field2808 = 0;
        class135.field3231 = 0;
        class79.field1783 = 0;
        class77.field1702 = 0;
        class77.field1696 = 0;
        class117.field2784 = 0;
        class72.field1552 = 0;
        class117.field2797 = 0;
        class114.field2698 = 0;
        class95.field2295 = 0;
        client.field380 = 0;
        client.field384 = 0;
        class130.field3073 = 0;
        class97.field2352 = 0;
        class115.field2716 = 0;
        class114.field2703 = 0;
        class117.field2787 = 0;
        class60.field1229 = 0;
        class143.field3484 = 0;
        class91.field2217 = 0;
        class77.field1731 = 0;
        class141.field3360 = 0;
        client.field390 = 0;
        class117.field2794 = 0;
        class148.field3638 = 0;
        class69.field1446 = 0;
        class79.field1799 = 0;
        class117.field2790 = 0;
        class50.field1055 = 0;
        class141.field3359 = 0;
        class144.field3533 = 0;
        class75.field1624 = 0;
        class60.field1221 = 0;
        class143.field3468 = 0;
        class153.field3782 = 0;
        class110.field2607 = 0;
        class5.field97 = 0;
        class53.field1092 = 0;
        class65.field1344 = 0;
        class79.field1802 = 0;
        class140.field3325 = 0;
        class77.field1727 = 0;
        class143.field3476 = 0;
        class19.field310 = 0;
        class81.field1843 = 0;
        class139.field3309 = 0;
        class68.field1425 = 0;
        class114.field2699 = 0;
        class44.field868 = 0;
        class116.field2745 = 0;
        class150.field3725 = 0;
        class140.field3321 = 0;
        class134.field3180 = 0;
        class129.field3050 = 0;
        class69.field1452 = 0;
        class42.field845 = 0;
        class147.field3600 = 0;
        class75.field1641 = 0;
        class3.field49 = 0;
        class120.field2861 = 0;
        class141.field3346 = 0;
        field1610 = 0;
        class97.field2353 = 0;
        class70.field1476 = 0;
        class77.field1726 = 0;
        class96.field2318 = 0;
        class105.field2528 = 0;
        class141.field3363 = 0;
        class48.field991 = 0;
        class93.field2257 = 0;
        class89.field2027 = 0;
        class26.field505 = 0;
        class139.field3299 = 0;
        class25.field488 = 0;
        class95.field2300 = 0;
        if (arg0 <= 85) {
            method525(96);
        }
        class122.field2907 = 0;
        class90.field2176 = 0;
        class90.field2191 = 0;
        class47.field948 = 0;
        class117.field2792 = 0;
        class15.field213 = 0;
        class117.field2771 = 0;
        class103.field2482 = 0;
        class77.field1734 = 0;
        class148.field3631 = 0;
        class117.field2807 = 0;
        class130.field3076 = 0;
        class21.field372 = 0;
        class75.field1649 = 0;
        class25.field504 = 0;
        class79.field1797 = 0;
        client.field388 = 0;
        class15.field207 = 0;
        class19.field313 = 0;
        class117.field2803 = 0;
        class116.field2748 = 0;
        class53.field1103 = 0;
        class29.field566 = 0;
        class152.field3756 = 0;
        class119.field2855 = 0;
        class121.field2877 = 0;
        class117.field2780 = 0;
        class69.field1447 = 0;
        class35.field730 = 0;
        class150.field3728 = 0;
        class72.field1565 = 0;
        class60.field1198 = 0;
        class141.field3358 = 0;
        class90.field2186 = 0;
        class67.field1407 = 0;
        class144.field3552 = 0;
        class141.field3367 = 0;
        class79.field1803 = 0;
        class79.field1798 = 0;
        class44.field878 = 0;
        class87.field1971 = 0;
        field1619 = 0;
        class72.field1564 = 0;
        class24.field462 = 0;
        class45.field897 = 0;
        class149.field3683 = 0;
        class71.field1498 = 0;
        class81.field1837 = 0;
        class75.field1633 = 0;
        class32.field686 = 0;
        class42.field844 = 0;
        class25.field480 = 0;
        class77.field1685 = 0;
        class72.field1586 = 0;
        class96.field2310 = 0;
        class138.field3286 = 0;
        class5.field102 = 0;
        class53.field1090 = 0;
        class136.field3250 = 0;
        class13.field183 = 0;
        class48.field997 = 0;
        class47.field956 = 0;
        class16.field229 = 0;
        field1611 = 0;
        class143.field3470 = 0;
        class140.field3323 = 0;
        class28.field551 = 0;
        class136.field3252 = 0;
        class77.field1688 = 0;
        class90.field2172 = 0;
        class72.field1569 = 0;
        class153.field3773 = 0;
        class135.field3228 = 0;
        class60.field1196 = 0;
        class28.field561 = 0;
        class135.field3221 = 0;
        class64.field1300 = 0;
        class97.field2351 = 0;
        class149.field3685 = 0;
        class143.field3493 = 0;
        class5.field98 = 0;
        class144.field3526 = 0;
        class117.field2770 = 0;
        class143.field3503 = 0;
        class87.field2007 = 0;
        class94.field2275 = 0;
        class47.field947 = 0;
        class79.field1807 = 0;
        class124.field2934 = 0;
        class152.field3747 = 0;
        class122.field2899 = 0;
        class24.field472 = 0;
        class77.field1736 = 0;
        class64.field1291 = 0;
        class77.field1686 = 0;
        class24.field469 = 0;
        class79.field1808 = 0;
        class79.field1804 = 0;
        class115.field2712 = 0;
        class70.field1477 = 0;
        class55.field1132 = 0;
        class143.field3479 = 0;
        class99.field2375 = 0;
        class79.field1785 = 0;
        class75.field1640 = 0;
        class27.field539 = 0;
        class115.field2731 = 0;
        class117.field2798 = 0;
        class72.field1541 = 0;
        class130.field3091 = 0;
        class103.field2485 = 0;
        class42.field834 = 0;
        class87.field2020 = 0;
        class78.field1778 = 0;
        class103.field2476 = 0;
        class132.field3138 = 0;
        class150.field3726 = 0;
        class64.field1289 = 0;
        client.field381 = 0;
        class107.field2555 = 0;
        class133.field3144 = 0;
        class134.field3171 = 0;
        class147.field3590 = 0;
        class53.field1091 = 0;
        class44.field872 = 0;
        class133.field3149 = 0;
        class44.field865 = 0;
        class18.field277 = 0;
        class56.field1149 = 0;
        class72.field1537 = 0;
        class80.field1823 = 0;
        class85.field1923 = 0;
        class85.field1925 = 0;
        class121.field2883 = 0;
        class143.field3492 = 0;
        class148.field3636 = 0;
        class96.field2322 = 0;
        class87.field1979 = 0;
        class138.field3287 = 0;
        class71.field1511 = 0;
        class141.field3369 = 0;
        class65.field1358 = 0;
        class103.field2486 = 0;
        class99.field2408 = 0;
        class45.field888 = 0;
        class117.field2819 = 0;
        class148.field3652 = 0;
        class100.field2415 = 0;
        class147.field3583 = 0;
        class77.field1754 = 0;
        class146.field3572 = 0;
        class148.field3666 = 0;
        class81.field1849 = 0;
        class117.field2783 = 0;
        client.field377 = 0;
        class16.field249 = 0;
        class8.field117 = 0;
        class82.field1893 = 0;
        class77.field1732 = 0;
        class3.field36 = 0;
        class99.field2377 = 0;
        class96.field2311 = 0;
        class126.field2986 = 0;
        class99.field2394 = 0;
        class18.field281 = 0;
        class22.field424 = 0;
        class71.field1508 = 0;
        class153.field3766 = 0;
        class117.field2793 = 0;
        class117.field2779 = 0;
        class5.field96 = 0;
        class96.field2325 = 0;
        class77.field1720 = 0;
        class149.field3699 = 0;
        class34.field712 = 0;
        class117.field2772 = 0;
        class85.field1933 = 0;
        class69.field1441 = 0;
        class141.field3350 = 0;
        class66.field1368 = 0;
        class144.field3512 = 0;
        class28.field555 = 0;
        class141.field3420 = 0;
        class141.field3352 = 0;
        class104.field2522 = 0;
        class72.field1567 = 0;
        class117.field2796 = 0;
        class141.field3368 = 0;
        class122.field2903 = 0;
        class143.field3481 = 0;
        class103.field2471 = 0;
        class135.field3236 = 0;
        class16.field224 = 0;
        class64.field1308 = 0;
        class22.field429 = 0;
        class77.field1707 = 0;
        class8.field118 = 0;
        class83.field1912 = 0;
        class147.field3587 = 0;
        class24.field473 = 0;
        class68.field1415 = 0;
        class124.field2917 = 0;
        class25.field484 = 0;
        class134.field3174 = 0;
        class119.field2846 = 0;
        class117.field2773 = 0;
        class23.field436 = 0;
        class103.field2481 = 0;
        class81.field1846 = 0;
        class85.field1935 = 0;
        class18.field282 = 0;
        class143.field3473 = 0;
        class110.field2592 = 0;
        class66.field1371 = 0;
        class134.field3201 = 0;
        class103.field2475 = 0;
        class81.field1869 = 0;
        class105.field2525 = 0;
        class70.field1469 = 0;
        class143.field3489 = 0;
        class126.field2990 = 0;
        class114.field2711 = 0;
        class100.field2419 = 0;
        class148.field3640 = 0;
        class82.field1885 = 0;
        class94.field2278 = 0;
        class117.field2791 = 0;
        class105.field2526 = 0;
        class72.field1560 = 0;
        class29.field563 = 0;
        class52.field1077 = 0;
        class60.field1233 = 0;
        class107.field2558 = 0;
        class129.field3070 = 0;
        class64.field1298 = 0;
        class112.field2622 = 0;
        class19.field308 = 0;
        class89.field2126 = 0;
        field1608 = 0;
        class71.field1500 = 0;
        class143.field3497 = 0;
        class117.field2766 = 0;
        class64.field1279 = 0;
        class80.field1821 = 0;
        class69.field1444 = 0;
        class141.field3373 = 0;
        class27.field532 = 0;
        class21.field359 = 0;
        class77.field1737 = 0;
        class50.field1042 = 0;
        class110.field2601 = 0;
        class21.field374 = 0;
        class150.field3720 = 0;
        class128.field3032 = 0;
        class152.field3751 = 0;
        class4.field67 = 0;
        class141.field3399 = 0;
        class128.field3026 = 0;
        class85.field1926 = 0;
        class64.field1320 = 0;
        class29.field583 = 0;
        class67.field1408 = 0;
        class100.field2413 = 0;
        class29.field570 = 0;
        class117.field2789 = 0;
        class70.field1472 = 0;
        class75.field1643 = 0;
        class77.field1690 = 0;
        class65.field1357 = 0;
        class66.field1376 = 0;
        class133.field3148 = 0;
        class104.field2507 = 0;
        class90.field2213 = 0;
        class141.field3354 = 0;
        class47.field941 = 0;
        class141.field3347 = 0;
        class45.field885 = 0;
        class93.field2249 = 0;
        class64.field1329 = 0;
        class35.field728 = 0;
        class53.field1087 = 0;
        class119.field2857 = 0;
        class100.field2424 = 0;
        class152.field3741 = 0;
        class135.field3215 = 0;
        class50.field1054 = 0;
        class134.field3191 = 0;
        class152.field3743 = 0;
        class64.field1330 = 0;
        class87.field1978 = 0;
        class19.field301 = 0;
        class149.field3697 = 0;
        class144.field3530 = 0;
        class75.field1639 = 0;
        class77.field1735 = 0;
        class117.field2762 = 0;
        field1596 = 0;
        class138.field3279 = 0;
        class16.field239 = 0;
        class152.field3759 = 0;
        class77.field1750 = 0;
        class31.field661 = 0;
        class77.field1718 = 0;
        class96.field2332 = 0;
        class140.field3326 = 0;
        class143.field3477 = 0;
        class53.field1102 = 0;
        class117.field2795 = 0;
        class80.field1828 = 0;
        class58.field1177 = 0;
        class89.field2097 = 0;
        class77.field1747 = 0;
        class48.field965 = 0;
        field1601 = 0;
        class42.field829 = 0;
        class66.field1370 = 0;
        class93.field2250 = 0;
        class47.field942 = 0;
        class72.field1571 = 0;
        class116.field2753 = 0;
        class103.field2477 = 0;
        field1612 = 0;
        class78.field1769 = 0;
        class114.field2695 = 0;
        class3.field55 = 0;
        class25.field482 = 0;
        class143.field3466 = 0;
        class77.field1705 = 0;
        class138.field3293 = 0;
        class29.field565 = 0;
        class77.field1704 = 0;
        class143.field3491 = 0;
        class83.field1910 = 0;
        class91.field2220 = 0;
        class96.field2326 = 0;
        class132.field3131 = 0;
        class65.field1349 = 0;
        class141.field3401 = 0;
        class42.field847 = 0;
        class15.field212 = 0;
        class141.field3380 = 0;
        class89.field2063 = 0;
        class90.field2198 = 0;
        class103.field2479 = 0;
        class31.field662 = 0;
        class70.field1473 = 0;
        class117.field2768 = 0;
        class125.field2958 = 0;
        class140.field3331 = 0;
        class65.field1339 = 0;
        class125.field2948 = 0;
        class83.field1904 = 0;
        class143.field3482 = 0;
        class119.field2842 = 0;
        class77.field1694 = 0;
        class5.field101 = 0;
        class141.field3378 = 0;
        class70.field1470 = 0;
        class52.field1066 = 0;
        class77.field1683 = 0;
        class67.field1398 = 0;
        class99.field2406 = 0;
        class5.field84 = 0;
        class117.field2785 = 0;
        class99.field2379 = 0;
        class5.field93 = 0;
        class143.field3471 = 0;
        class149.field3687 = 0;
        class91.field2232 = 0;
        class117.field2764 = 0;
        class141.field3390 = 0;
        class82.field1892 = 0;
        class120.field2868 = 0;
        class103.field2472 = 0;
        class34.field706 = 0;
        class129.field3058 = 0;
        class66.field1377 = 0;
        class117.field2774 = 0;
        class143.field3475 = 0;
        class136.field3254 = 0;
        class115.field2726 = 0;
        class100.field2429 = 0;
        class143.field3478 = 0;
        class148.field3645 = 0;
        class103.field2478 = 0;
        class76.field1673 = 0;
        class130.field3074 = 0;
        class77.field1710 = 0;
        class143.field3494 = 0;
        class34.field702 = 0;
        class75.field1648 = 0;
        class93.field2251 = 0;
        class83.field1913 = 0;
        class19.field303 = 0;
        class16.field231 = 0;
        class53.field1099 = 0;
        class53.field1088 = 0;
        class64.field1304 = 0;
        class93.field2269 = 0;
        class141.field3356 = 0;
        class65.field1350 = 0;
        class82.field1882 = 0;
        class50.field1037 = 0;
        class121.field2890 = 0;
        class71.field1513 = 0;
        class47.field953 = 0;
        class121.field2882 = 0;
        class89.field2110 = 0;
        class90.field2203 = 0;
        class114.field2702 = 0;
        class48.field964 = 0;
        client.field386 = 0;
        class143.field3490 = 0;
        class134.field3178 = 0;
        class77.field1733 = 0;
        class107.field2551 = 0;
        class20.field320 = 0;
        class148.field3613 = 0;
        class135.field3217 = 0;
        class55.field1133 = 0;
        class77.field1684 = 0;
        class143.field3501 = 0;
        class91.field2226 = 0;
        class68.field1434 = 0;
        class31.field677 = 0;
        class135.field3224 = 0;
        class77.field1687 = 0;
        class135.field3237 = 0;
        class148.field3630 = 0;
        class50.field1048 = 0;
        class22.field414 = 0;
        class104.field2509 = 0;
        class104.field2523 = 0;
        class82.field1890 = 0;
        class47.field951 = 0;
        class112.field2616 = 0;
        class70.field1479 = 0;
        class64.field1326 = 0;
        class132.field3120 = 0;
        class141.field3413 = 0;
        class29.field582 = 0;
        class117.field2781 = 0;
        class15.field206 = 0;
        class55.field1134 = 0;
        class77.field1708 = 0;
        class77.field1700 = 0;
        class141.field3414 = 0;
        class117.field2804 = 0;
        class8.field114 = 0;
        class80.field1819 = 0;
        class16.field260 = 0;
        class94.field2274 = 0;
        class99.field2389 = 0;
        class72.field1545 = 0;
        class64.field1301 = 0;
        class95.field2303 = 0;
        class48.field963 = 0;
        class143.field3505 = 0;
        class50.field1052 = 0;
        class77.field1697 = 0;
        class50.field1039 = 0;
        class130.field3077 = 0;
        class141.field3382 = 0;
        class35.field723 = 0;
        class50.field1061 = 0;
        class102.field2466 = 0;
        class110.field2602 = 0;
        class124.field2928 = 0;
        class114.field2693 = 0;
        class132.field3127 = 0;
        class34.field703 = 0;
        class129.field3045 = 0;
        class5.field88 = 0;
        class91.field2218 = 0;
        class48.field1014 = 0;
        class53.field1084 = 0;
        class143.field3498 = 0;
        class147.field3579 = 0;
        class141.field3361 = 0;
        class129.field3046 = 0;
        class31.field663 = 0;
        class143.field3499 = 0;
        class96.field2313 = 0;
        field1618 = 0;
        class75.field1628 = 0;
        class90.field2180 = 0;
        class152.field3757 = 0;
        class42.field833 = 0;
        class8.field111 = 0;
        class48.field961 = 0;
        class143.field3496 = 0;
        class89.field2030 = 0;
        class77.field1692 = 0;
        class90.field2211 = 0;
        class100.field2423 = 0;
        class53.field1110 = 0;
        class60.field1207 = 0;
        class90.field2184 = 0;
        class13.field185 = 0;
        class41.field810 = 0;
        class128.field3037 = 0;
        class77.field1743 = 0;
        class148.field3674 = 0;
        class79.field1809 = 0;
        class143.field3483 = 0;
        class141.field3416 = 0;
        class58.field1173 = 0;
        class135.field3223 = 0;
        class143.field3465 = 0;
        class5.field86 = 0;
        class147.field3580 = 0;
        class47.field944 = 0;
        class80.field1817 = 0;
        class5.field95 = 0;
        class141.field3396 = 0;
        class41.field811 = 0;
        class94.field2276 = 0;
        class19.field298 = 0;
        class18.field286 = 0;
        class152.field3754 = 0;
        class53.field1106 = 0;
        class143.field3502 = 0;
        class89.field2074 = 0;
        client.field389 = 0;
        class149.field3696 = 0;
        class32.field689 = 0;
        class36.field782 = 0;
        class75.field1634 = 0;
        class146.field3577 = 0;
        class21.field370 = 0;
        class81.field1839 = 0;
        client.field387 = 0;
        class134.field3172 = 0;
        class99.field2376 = 0;
        class149.field3691 = 0;
        class140.field3337 = 0;
        class117.field2775 = 0;
        class50.field1044 = 0;
        class15.field209 = 0;
        class62.field1236 = 0;
        class77.field1755 = 0;
        class77.field1752 = 0;
        class55.field1137 = 0;
        class143.field3472 = 0;
        class135.field3213 = 0;
        class93.field2258 = 0;
        class148.field3637 = 0;
        client.field382 = 0;
        class153.field3779 = 0;
        class25.field489 = 0;
        class90.field2193 = 0;
        class148.field3647 = 0;
        class114.field2697 = 0;
        class42.field830 = 0;
        client.field378 = 0;
        class76.field1655 = 0;
        class110.field2594 = 0;
        class141.field3388 = 0;
        class5.field82 = 0;
        class42.field836 = 0;
        class65.field1345 = 0;
        class143.field3487 = 0;
        class103.field2488 = 0;
        class52.field1080 = 0;
        class122.field2904 = 0;
        class27.field538 = 0;
        client.field383 = 0;
        class50.field1058 = 0;
        class117.field2777 = 0;
        class119.field2854 = 0;
        class55.field1127 = 0;
        class81.field1838 = 0;
        class78.field1781 = 0;
        class135.field3216 = 0;
        class31.field671 = 0;
        class81.field1850 = 0;
        class34.field707 = 0;
        class25.field485 = 0;
        class124.field2937 = 0;
        class25.field492 = 0;
        class141.field3385 = 0;
        class27.field537 = 0;
        class44.field866 = 0;
        class77.field1745 = 0;
        class28.field552 = 0;
        class153.field3775 = 0;
        class117.field2769 = 0;
        class119.field2843 = 0;
        class148.field3609 = 0;
        class70.field1484 = 0;
        class148.field3622 = 0;
        class99.field2383 = 0;
        class149.field3686 = 0;
        class103.field2483 = 0;
        class69.field1456 = 0;
        class42.field843 = 0;
        class79.field1810 = 0;
        class69.field1461 = 0;
        class91.field2233 = 0;
        class80.field1826 = 0;
        class71.field1507 = 0;
        class143.field3485 = 0;
        class77.field1721 = 0;
        class72.field1580 = 0;
        class83.field1901 = 0;
        class133.field3145 = 0;
        class77.field1746 = 0;
        class82.field1876 = 0;
        class141.field3381 = 0;
        class80.field1818 = 0;
        class77.field1723 = 0;
        class141.field3374 = 0;
        class117.field2786 = 0;
        class16.field243 = 0;
        class19.field314 = 0;
        class140.field3332 = 0;
        client.field376 = 0;
        class125.field2946 = 0;
        class121.field2885 = 0;
        class31.field672 = 0;
        client.field379 = 0;
        class143.field3467 = 0;
        class121.field2893 = 0;
        class135.field3218 = 0;
        class119.field2847 = 0;
        class72.field1539 = 0;
        class143.field3464 = 0;
        class153.field3777 = 0;
        class139.field3304 = 0;
        class150.field3723 = 0;
        class77.field1738 = 0;
        class143.field3509 = 0;
        class16.field222 = 0;
        class77.field1744 = 0;
        class81.field1865 = 0;
        class64.field1278 = 0;
        class5.field85 = 0;
        class70.field1471 = 0;
        class114.field2710 = 0;
        class31.field653 = 0;
        class44.field869 = 0;
        class71.field1520 = 0;
        class139.field3298 = 0;
        class75.field1645 = 0;
        class149.field3679 = 0;
        class64.field1302 = 0;
        class29.field564 = 0;
        class141.field3391 = 0;
        class141.field3387 = 0;
        class77.field1739 = 0;
        class140.field3327 = 0;
        class55.field1143 = 0;
        class31.field654 = 0;
        class116.field2751 = 0;
        class82.field1888 = 0;
        class68.field1435 = 0;
        class62.field1251 = 0;
        class134.field3166 = 0;
        class152.field3763 = 0L;
        class18.field291 = true;
        class19.method155(0);
        class27.field531 = 0;
        class132.field3119 = 0;
        class26.field518 = -1;
        class81.field1864 = false;
        class136.field3256 = -1;
        class40.field793 = 0;
        class99.field2373.field1691 = 0;
        class81.field1851 = -1;
        class16.field245 = 0;
        class96.field2338.field1691 = 0;
        class41.field817 = 0;
        class19.field300 = -1;
        class21.method160(23672, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class148.field3656[var1] = null;
        }
        class78.field1765 = 0;
        class90.field2179 = 0;
        class24.field475 = (int) (Math.random() * 80.0D) - 40;
        class66.field1387 = 0;
        class40.field802 = 0;
        class128.field3035 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class71.field1515 = 0;
        class68.field1427 = -1;
        class53.field1096 = (int) (Math.random() * 30.0D) - 20;
        class147.field3581 = (int) (Math.random() * 110.0D) - 55;
        class25.field483 = 0;
        class48.field967 = (int) (Math.random() * 120.0D) - 60;
        class89.field2160 = false;
        class150.field3730 = (int) (Math.random() * 100.0D) - 50;
        class94.field2287 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class149.field3709[var2] = null;
            class3.field43[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class72.field1533[var3] = null;
        }
        class141.field3395 = class149.field3709[2047] = new class21();
        class133.field3141.method26(126);
        class129.field3056.method26(122);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    class43.field858[var4][var10][var11] = null;
                }
            }
        }
        class97.field2356 = new class5();
        class64.field1334 = 0;
        class75.field1651 = 0;
        for (int var5 = 0; var5 < class58.field1189; var5++) {
            class91 var9 = class116.method903(var5, 1);
            if (var9 != null && var9.field2238 == 0) {
                class85.field1937[var5] = 0;
                class23.field461[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class139.field3300.length; var6++) {
            class139.field3300[var6] = -1;
        }
        for (int var7 = 0; var7 < class27.field529.length; var7++) {
            if (class27.field529[var7] != -1) {
                class140.method1087(-119, class27.field529[var7]);
                class27.field529[var7] = -1;
            }
        }
        class140.method1087(-110, class152.field3738);
        class152.field3738 = -1;
        class140.method1087(-99, class95.field2288);
        class95.field2288 = -1;
        class140.method1087(-108, class96.field2316);
        class96.field2316 = -1;
        class140.method1087(-80, class135.field3227);
        class135.field3227 = -1;
        class140.method1087(-112, class70.field1482);
        class70.field1482 = -1;
        class140.method1087(-82, class140.field3343);
        class140.field3343 = -1;
        class140.method1087(-119, class56.field1155);
        class115.field2719 = -1;
        class4.field65 = 0;
        class41.field821 = -1;
        class149.field3694 = null;
        class64.field1281 = 3;
        class124.field2924 = 0;
        class69.field1445 = false;
        class56.field1155 = -1;
        class81.field1864 = false;
        class79.field1788.method773(false, new int[5], null, -1, (byte) 104);
        for (int var8 = 0; var8 < 5; var8++) {
            class18.field265[var8] = null;
            class153.field3794[var8] = false;
        }
        class95.method748((byte) -115);
        class115.field2713 = true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method529(int arg0, int arg1) {
        field1601++;
        class78 var2 = (class78) client.field395.method1221(121, (long) arg0);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field1762.length; var3++) {
                var2.field1762[var3] = -1;
                var2.field1757[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[Lqf;)Lqf;")
    public static final class117 method530(byte arg0, class117[] arg1) {
        if (arg0 != -83) {
            return null;
        }
        field1619++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class114.method888(arg1, 0, 1, arg1.length);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILmc;)V")
    public static final void method531(int arg0, class86 arg1) {
        arg1.field1940 = false;
        if (arg1.field1943 != null) {
            arg1.field1943.field783 = 0;
        }
        class86 var2 = arg1.method70();
        if (arg0 != 7353) {
            method529(88, -41);
        }
        while (var2 != null) {
            method531(arg0, var2);
            var2 = arg1.method86();
        }
        field1611++;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z")
    public static final boolean method532(int arg0) {
        field1615++;
        try {
            if (arg0 > -103) {
                field1607 = null;
            }
            if (class125.field2953 == 2) {
                if (class75.field1635 == null) {
                    class75.field1635 = class88.method696(class80.field1831, class89.field2047, class112.field2615);
                    if (class75.field1635 == null) {
                        return false;
                    }
                }
                if (class97.field2357 == null) {
                    class97.field2357 = new class55(class139.field3308, class103.field2491);
                }
                if (class36.field771.method1091(22050, class97.field2357, class75.field1635, -109, class121.field2880)) {
                    class36.field771.method1120((byte) -78);
                    class36.field771.method1108(-2, class125.field2952);
                    class36.field771.method1097(class75.field1635, -1, class44.field876);
                    class80.field1831 = null;
                    class97.field2357 = null;
                    class75.field1635 = null;
                    class125.field2953 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class36.field771.method1124(15);
            class80.field1831 = null;
            class75.field1635 = null;
            class97.field2357 = null;
            class125.field2953 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public static final void method533(int arg0) {
        class136.field3256 = -1;
        class27.field531 = 0;
        field1613++;
        class16.field245 = 0;
        class78.field1765 = 0;
        class81.field1851 = -1;
        class99.field2373.field1691 = 0;
        class40.field793 = 0;
        class81.field1864 = false;
        class19.field300 = -1;
        class96.field2338.field1691 = 0;
        class71.field1502 = 0;
        class94.field2287 = 0;
        class26.field518 = -1;
        for (int var1 = 0; var1 < class149.field3709.length; var1++) {
            if (class149.field3709[var1] != null) {
                class149.field3709[var1].field1996 = -1;
            }
        }
        int var2 = 124 % ((-arg0 - 28) / 37);
        for (int var3 = 0; var3 < class72.field1533.length; var3++) {
            if (class72.field1533[var3] != null) {
                class72.field1533[var3].field1996 = -1;
            }
        }
        class95.method748((byte) -99);
        class62.method430(30, (byte) -47);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lla;IZ)Lqf;")
    public static final class117 method534(class77 arg0, int arg1, boolean arg2) {
        field1610++;
        try {
            class117 var3 = new class117();
            var3.field2799 = arg0.method582(90);
            if (var3.field2799 > arg1) {
                var3.field2799 = arg1;
            }
            var3.field2800 = new byte[var3.field2799];
            if (arg2) {
                return null;
            } else {
                arg0.field1691 += class90.field2212.method287(arg0.field1748, arg0.field1691, var3.field2799, 0, 255, var3.field2800);
                return var3;
            }
        } catch (Exception var4) {
            return class31.field670;
        }
    }
}
