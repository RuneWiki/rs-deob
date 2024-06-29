import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class139 extends class27 {

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    private int field2682 = 204;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    private int field2704 = 4;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    private int field2708 = 409;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    private int field2700 = 81;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    private int field2705 = 8;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    private int field2691 = 1024;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    private int field2690 = 1024;

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
    private int field2713 = 0;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field2693 = 0;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "Lkb;")
    private static class93 field2692 = class76.method390("slide:", 0);

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field2694 = 0;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field2695 = -1;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lkb;")
    public static class93 field2702 = field2692;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "Lkb;")
    public static class93 field2699 = field2692;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lkb;")
    public static class93 field2711 = class76.method390("", 0);

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Lkb;")
    public static class93 field2689 = class76.method390("Unerwartete Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "Lkb;")
    public static class93 field2703 = class76.method390("Lade Wordpack )2 ", 0);

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    private int field2687;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "[I")
    private int[] field2688;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "[Lna;")
    public static class119[] field2707;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "[[I")
    private int[][] field2696;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "[[I")
    private int[][] field2712;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lh;I)Lh;")
    public static final class65 method867(class65 arg0, int arg1) {
        ++field2714;
        int var2 = class37.method204((byte) -122, class178.method1173(arg0, arg1 ^ 126));
        if (arg1 == var2) {
            return null;
        } else {
            for (int var3 = 0; var2 > var3; ++var3) {
                arg0 = class204.method1325(65535, arg0.field1143);
                if (arg0 == null) {
                    return null;
                }
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    private final void method868(int arg0) {
        ++field2710;
        Random var2 = new Random((long) this.field2705);
        this.field2687 = 4096 / this.field2704;
        this.field2712 = new int[this.field2705][this.field2704 + 1];
        this.field2688 = new int[this.field2705 + 1];
        int var3 = this.field2687 / 2;
        this.field2685 = this.field2700 / 2;
        this.field2688[0] = 0;
        this.field2715 = 4096 / this.field2705;
        if (arg0 <= 72) {
            this.field2715 = -18;
        }
        this.field2696 = new int[this.field2705][this.field2704];
        int var4 = this.field2715 / 2;
        for (int var5 = 0; var5 < this.field2705; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2715;
                int var7 = (-2048 + class64.method327(4096, var2, 10093)) * this.field2682 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2688[var5] = this.field2688[var5 + -1] + var8;
            }
            this.field2712[var5][0] = 0;
            for (int var9 = 0; this.field2704 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2687;
                    int var11 = (class64.method327(4096, var2, 10093) - 2048) * this.field2708 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2712[var5][var9] = this.field2712[var5][var9 - 1] + var12;
                }
                this.field2696[var5][var9] = ~this.field2691 >= -1 ? 4096 : -class64.method327(this.field2691, var2, 10093) + 4096;
            }
            this.field2712[var5][this.field2704] = 4096;
        }
        this.field2688[this.field2705] = 4096;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public static final void method869(int arg0) {
        while (true) {
            if (~class59.field942.method46((byte) -60, class157.field3109) <= -12) {
                int var1 = class59.field942.method42(11, arg0 + -2138);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class206.field4035[var1] == null) {
                        var2 = true;
                        class206.field4035[var1] = new class34();
                        if (class131.field2485[var1] != null) {
                            class206.field4035[var1].method189((byte) -123, class131.field2485[var1]);
                        }
                    }
                    class144.field2818[class205.field3966++] = var1;
                    class34 var3 = class206.field4035[var1];
                    var3.field2073 = class21.field338;
                    int var4 = class59.field942.method42(5, -49);
                    if (~var4 < -16) {
                        var4 -= 32;
                    }
                    int var5 = class23.field353[class59.field942.method42(3, -82)];
                    if (var2) {
                        var3.field2071 = var3.field2075 = var5;
                    }
                    int var6 = class59.field942.method42(1, -101);
                    if (var6 == 1) {
                        class14.field243[class124.field2313++] = var1;
                    }
                    int var7 = class59.field942.method42(1, -44);
                    int var8 = class59.field942.method42(5, arg0 + -2174);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method609(~var7 == -2, (byte) 122, class106.field1940.field2064[0] + var8, class106.field1940.field2038[0] + var4);
                    continue;
                }
            }
            if (arg0 != 2047) {
                method870(60);
            }
            ++field2706;
            class59.field942.method45((byte) 113);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field2701;
        this.method868(106);
        if (arg0 <= 77) {
            method869(73);
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static void method870(int arg0) {
        field2692 = null;
        field2699 = null;
        field2711 = null;
        if (arg0 != 0) {
            method870(-50);
        }
        field2689 = null;
        field2707 = null;
        field2703 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIII)I")
    public static final int method871(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & arg0;
        ++field2698;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else {
            return ~var4 == -3 ? -arg1 + 7 : 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)V")
    public static final void method872(boolean arg0) {
        class49.field782 = 0;
        class102.field1885.field3760 = 0;
        ++field2697;
        class158.field3152 = 0;
        class13.field234 = 0;
        class122.field2255 = 0;
        class106.field1929 = 0;
        class171.field3388 = 0;
        class55.field911 = 0;
        class195.field3791 = 0;
        class88.field1604 = 0;
        class133.field2553 = 0;
        class85.field1551 = 0;
        class63.field1008 = 0;
        class122.field2253 = 0;
        class44.field727 = 0;
        class113.field2098 = 0;
        class120.field2221 = 0;
        class64.field1013 = 0;
        class193.field3746 = 0;
        class122.field2258 = 0;
        class175.field3456 = 0;
        class81.field1479 = 0;
        class153.field2987 = 0;
        class43.field705 = 0;
        class192.field3739 = 0;
        class203.field3922 = 0;
        class15.field270 = 0;
        class47.field767 = 0;
        class186.field3670 = 0;
        class93.field1731 = 0;
        class161.field3219 = 0;
        class157.field3117 = 0;
        class122.field2257 = 0;
        class115.field2157 = 0;
        class158.field3175 = 0;
        class173.field3436 = 0;
        class47.field742 = 0;
        class100.field1847 = 0;
        class97.field1804 = 0;
        class37.field620 = 0;
        class184.field3625 = 0;
        class93.field1705 = 0;
        class101.field1860 = 0;
        class89.field1645 = 0;
        class93.field1739 = 0;
        class89.field1639 = 0;
        class158.field3167 = 0;
        class184.field3632 = 0;
        class200.field3890 = 0;
        class44.field720 = 0;
        class29.field466 = 0;
        class82.field1516 = 0;
        class158.field3197 = 0;
        class103.field1892 = 0;
        class140.field2718 = 0;
        class97.field1802 = 0;
        class24.field359 = 0;
        class46.field732 = 0;
        class19.field326 = 0;
        class73.field1337 = 0;
        class110.field1989 = 0;
        class95.field1766 = 0;
        class166.field3269 = 0;
        class81.field1473 = 0;
        class70.field1304 = 0;
        class108.field1968 = 0;
        class153.field2960 = 0;
        class178.field3534 = 0;
        class137.field2658 = 0;
        class65.field1039 = 0;
        class140.field2723 = 0;
        class81.field1483 = 0;
        class13.field229 = 0;
        class130.field2459 = 0;
        class53.field875 = 0;
        class190.field3706 = 0;
        class8.field126 = 0;
        class112.field2067 = 0;
        class195.field3785 = 0;
        class68.field1267 = 0;
        class169.field3375 = 0;
        class190.field3707 = 0;
        class114.field2142 = 0;
        class200.field3891 = 0;
        class153.field2998 = 0;
        class64.field1011 = 0;
        class151.field2921 = 0;
        class93.field1702 = 0;
        class21.field339 = 0;
        class40.field667 = 0;
        class158.field3195 = 0;
        class85.field1557 = 0;
        class29.field479 = 0;
        class65.field1116 = 0;
        class113.field2101 = 0;
        class141.field2756 = 0;
        class195.field3797 = 0;
        class130.field2453 = 0;
        class32.field522 = 0;
        class59.field941 = 0;
        class9.field141 = 0;
        class65.field1129 = 0;
        class166.field3303 = 0;
        class64.field1025 = 0;
        class36.field587 = 0;
        class35.field573 = 0;
        class177.field3511 = 0;
        class142.field2772 = 0;
        class167.field3346 = 0;
        class122.field2267 = 0;
        client.field497 = 0;
        class182.field3595 = 0;
        class135.field2623 = 0;
        class64.field1022 = 0;
        class153.field3006 = 0;
        class159.field3207 = 0;
        class197.field3843 = 0;
        class21.field337 = 0;
        class154.field3026 = 0;
        class81.field1455 = 0;
        class19.field320 = 0;
        class8.field124 = 0;
        class158.field3135 = 0;
        class108.field1959 = 0;
        class15.field258 = 0;
        class130.field2457 = 0;
        class32.field529 = 0;
        class67.field1221 = 0;
        class133.field2551 = 0;
        class190.field3710 = 0;
        class25.field384 = 0;
        class204.field3942 = 0;
        class8.field122 = 0;
        class147.field2833 = 0;
        class107.field1954 = 0;
        class127.field2393 = 0;
        class30.field501 = 0;
        class205.field3960 = 0;
        class158.field3173 = 0;
        class151.field2925 = 0;
        class37.field608 = 0;
        class88.field1597 = 0;
        class97.field1825 = 0;
        class32.field516 = 0;
        class67.field1217 = 0;
        class100.field1845 = 0;
        class176.field3482 = 0;
        class19.field313 = 0;
        class100.field1842 = 0;
        class153.field2980 = 0;
        class158.field3178 = 0;
        class158.field3160 = 0;
        class46.field728 = 0;
        class72.field1324 = 0;
        class43.field697 = 0;
        class148.field2865 = 0;
        class14.field247 = 0;
        class3.field52 = 0;
        class85.field1554 = 0;
        class124.field2309 = 0;
        class91.field1661 = 0;
        class47.field750 = 0;
        class154.field3025 = 0;
        class36.field591 = 0;
        class167.field3338 = 0;
        class46.field734 = 0;
        field2698 = 0;
        class138.field2666 = 0;
        class29.field475 = 0;
        class158.field3186 = 0;
        class111.field2005 = 0;
        class131.field2479 = 0;
        class158.field3169 = 0;
        class194.field3765 = 0;
        class93.field1734 = 0;
        class189.field3705 = 0;
        class27.field446 = 0;
        class115.field2164 = 0;
        class51.field814 = 0;
        class193.field3753 = 0;
        class171.field3389 = 0;
        class128.field2435 = 0;
        class81.field1481 = 0;
        class159.field3198 = 0;
        class27.field433 = 0;
        class166.field3282 = 0;
        class159.field3202 = 0;
        class205.field3955 = 0;
        class152.field2946 = 0;
        class97.field1790 = 0;
        class9.field153 = 0;
        class151.field2911 = 0;
        class81.field1493 = 0;
        class206.field4024 = 0;
        class81.field1475 = 0;
        class97.field1796 = 0;
        class204.field3948 = 0;
        class8.field128 = 0;
        class60.field963 = 0;
        class190.field3711 = 0;
        class93.field1736 = 0;
        class207.field4041 = 0;
        class16.field290 = 0;
        class30.field503 = 0;
        class131.field2468 = 0;
        class82.field1501 = 0;
        class124.field2305 = 0;
        class13.field239 = 0;
        class135.field2631 = 0;
        class127.field2385 = 0;
        class97.field1801 = 0;
        class40.field666 = 0;
        class55.field920 = 0;
        class201.field3894 = 0;
        class85.field1556 = 0;
        class50.field806 = 0;
        class13.field238 = 0;
        class191.field3723 = 0;
        class82.field1512 = 0;
        class143.field2789 = 0;
        class158.field3140 = 0;
        class85.field1545 = 0;
        class97.field1805 = 0;
        class153.field2986 = 0;
        class24.field358 = 0;
        class66.field1190 = 0;
        class207.field4048 = 0;
        class55.field909 = 0;
        class8.field139 = 0;
        class183.field3610 = 0;
        class133.field2555 = 0;
        class53.field881 = 0;
        class1.field8 = 0;
        class79.field1413 = 0;
        class69.field1271 = 0;
        class93.field1740 = 0;
        class26.field418 = 0;
        class16.field282 = 0;
        class97.field1810 = 0;
        class141.field2764 = 0;
        class201.field3893 = 0;
        class70.field1296 = 0;
        class53.field876 = 0;
        class10.field160 = 0;
        class19.field324 = 0;
        class148.field2858 = 0;
        class114.field2125 = 0;
        class153.field2953 = 0;
        class13.field208 = 0;
        class141.field2738 = 0;
        class186.field3648 = 0;
        class53.field879 = 0;
        class110.field1983 = 0;
        class93.field1721 = 0;
        class159.field3203 = 0;
        class135.field2619 = 0;
        class153.field2967 = 0;
        class193.field3758 = 0;
        class111.field1998 = 0;
        class50.field799 = 0;
        class102.field1874 = 0;
        field2683 = 0;
        class189.field3698 = 0;
        class188.field3685 = 0;
        class104.field1922 = 0;
        class39.field650 = 0;
        class148.field2859 = 0;
        class8.field135 = 0;
        class107.field1953 = 0;
        class182.field3596 = 0;
        class14.field249 = 0;
        class93.field1710 = 0;
        class157.field3123 = 0;
        class89.field1621 = 0;
        class122.field2259 = 0;
        class189.field3701 = 0;
        class120.field2223 = 0;
        class203.field3913 = 0;
        class61.field965 = 0;
        class131.field2484 = 0;
        class158.field3176 = 0;
        class19.field318 = 0;
        class47.field754 = 0;
        class158.field3196 = 0;
        class153.field2982 = 0;
        class67.field1218 = 0;
        class93.field1704 = 0;
        class158.field3182 = 0;
        class27.field443 = 0;
        class67.field1227 = 0;
        class75.field1354 = 0;
        class127.field2381 = 0;
        class49.field785 = 0;
        class204.field3944 = 0;
        class114.field2133 = 0;
        class82.field1510 = 0;
        class35.field570 = 0;
        class133.field2550 = 0;
        class89.field1637 = 0;
        class137.field2651 = 0;
        class181.field3583 = 0;
        class7.field119 = 0;
        class89.field1610 = 0;
        class112.field2021 = 0;
        class98.field1830 = 0;
        class121.field2240 = 0;
        class27.field442 = 0;
        class47.field756 = 0;
        class3.field58 = 0;
        class197.field3844 = 0;
        class195.field3810 = 0;
        field2684 = 0;
        class188.field3676 = 0;
        field2710 = 0;
        class69.field1276 = 0;
        class27.field428 = 0;
        class98.field1836 = 0;
        class97.field1799 = 0;
        class113.field2088 = 0;
        class88.field1603 = 0;
        class124.field2310 = 0;
        class182.field3588 = 0;
        class183.field3614 = 0;
        class166.field3268 = 0;
        class172.field3412 = 0;
        class112.field2074 = 0;
        class89.field1629 = 0;
        class191.field3728 = 0;
        class29.field467 = 0;
        class200.field3884 = 0;
        class16.field277 = 0;
        class9.field154 = 0;
        class151.field2926 = 0;
        class60.field958 = 0;
        class15.field257 = 0;
        class153.field2979 = 0;
        class153.field3007 = 0;
        class158.field3138 = 0;
        class71.field1311 = 0;
        class122.field2266 = 0;
        class67.field1223 = 0;
        class176.field3472 = 0;
        class65.field1083 = 0;
        class93.field1727 = 0;
        class115.field2150 = 0;
        class158.field3184 = 0;
        class207.field4052 = 0;
        class128.field2403 = 0;
        class128.field2418 = 0;
        class117.field2193 = 0;
        class120.field2216 = 0;
        class157.field3115 = 0;
        class85.field1544 = 0;
        class67.field1236 = 0;
        class161.field3224 = 0;
        class151.field2915 = 0;
        class93.field1689 = 0;
        class113.field2103 = 0;
        class206.field4025 = 0;
        class186.field3662 = 0;
        class93.field1738 = 0;
        class76.field1365 = 0;
        class37.field613 = 0;
        class113.field2089 = 0;
        class102.field1870 = 0;
        class95.field1756 = 0;
        class97.field1791 = 0;
        class203.field3919 = 0;
        class81.field1445 = 0;
        class68.field1255 = 0;
        class157.field3104 = 0;
        class4.field62 = 0;
        class103.field1903 = 0;
        class141.field2762 = 0;
        class34.field557 = 0;
        class53.field887 = 0;
        class89.field1652 = 0;
        class82.field1502 = 0;
        class111.field2006 = 0;
        class106.field1932 = 0;
        class98.field1831 = 0;
        class39.field651 = 0;
        class166.field3313 = 0;
        class67.field1215 = 0;
        client.field492 = 0;
        class43.field702 = 0;
        class188.field3688 = 0;
        class166.field3279 = 0;
        class81.field1472 = 0;
        class89.field1624 = 0;
        class65.field1133 = 0;
        class13.field215 = 0;
        class121.field2249 = 0;
        class67.field1213 = 0;
        class154.field3034 = 0;
        class26.field417 = 0;
        class170.field3383 = 0;
        class112.field2022 = 0;
        class13.field230 = 0;
        class97.field1807 = 0;
        class59.field940 = 0;
        class117.field2183 = 0;
        class34.field539 = 0;
        class176.field3468 = 0;
        class92.field1679 = 0;
        class128.field2415 = 0;
        class53.field884 = 0;
        class66.field1208 = 0;
        class114.field2143 = 0;
        class89.field1622 = 0;
        class108.field1960 = 0;
        class93.field1693 = 0;
        class122.field2256 = 0;
        class104.field1923 = 0;
        class88.field1605 = 0;
        class204.field3943 = 0;
        class135.field2624 = 0;
        class133.field2554 = 0;
        class77.field1389 = 0;
        class81.field1440 = 0;
        class65.field1055 = 0;
        class123.field2278 = 0;
        class141.field2748 = 0;
        class39.field644 = 0;
        class1.field20 = 0;
        class93.field1732 = 0;
        class120.field2225 = 0;
        class152.field2937 = 0;
        class158.field3179 = 0;
        class107.field1949 = 0;
        class120.field2224 = 0;
        class84.field1542 = 0;
        class191.field3719 = 0;
        class93.field1723 = 0;
        class184.field3631 = 0;
        class115.field2153 = 0;
        class70.field1301 = 0;
        class138.field2671 = 0;
        class181.field3580 = 0;
        class89.field1654 = 0;
        class103.field1889 = 0;
        class144.field2816 = 0;
        class191.field3732 = 0;
        class159.field3199 = 0;
        class200.field3874 = 0;
        class195.field3782 = 0;
        class97.field1798 = 0;
        class89.field1606 = 0;
        class186.field3669 = 0;
        class108.field1964 = 0;
        class158.field3143 = 0;
        class194.field3763 = 0;
        class186.field3651 = 0;
        class96.field1789 = 0;
        class158.field3193 = 0;
        class114.field2135 = 0;
        class158.field3131 = 0;
        class89.field1614 = 0;
        class111.field2008 = 0;
        class186.field3654 = 0;
        class103.field1904 = 0;
        class186.field3657 = 0;
        class101.field1865 = 0;
        class203.field3920 = 0;
        client.field485 = 0;
        class169.field3373 = 0;
        class166.field3330 = 0;
        class1.field6 = 0;
        class127.field2389 = 0;
        class85.field1555 = 0;
        class179.field3563 = 0;
        class177.field3514 = 0;
        class195.field3817 = 0;
        class15.field269 = 0;
        class114.field2120 = 0;
        class12.field199 = 0;
        class102.field1869 = 0;
        class103.field1891 = 0;
        class141.field2743 = 0;
        class1.field9 = 0;
        class15.field259 = 0;
        class57.field926 = 0;
        class13.field231 = 0;
        class153.field2978 = 0;
        class169.field3369 = 0;
        class23.field349 = 0;
        class158.field3177 = 0;
        class81.field1476 = 0;
        class114.field2146 = 0;
        class157.field3122 = 0;
        class193.field3757 = 0;
        class148.field2853 = 0;
        class184.field3638 = 0;
        class65.field1042 = 0;
        class158.field3190 = 0;
        class117.field2191 = 0;
        class153.field2972 = 0;
        class19.field314 = 0;
        class70.field1305 = 0;
        class131.field2486 = 0;
        class166.field3324 = 0;
        class27.field430 = 0;
        class36.field589 = 0;
        class194.field3767 = 0;
        class47.field749 = 0;
        class27.field439 = 0;
        class93.field1696 = 0;
        class115.field2162 = 0;
        class93.field1698 = 0;
        class64.field1031 = 0;
        class153.field3002 = 0;
        class182.field3592 = 0;
        class177.field3516 = 0;
        class167.field3342 = 0;
        class151.field2922 = 0;
        class93.field1684 = 0;
        class151.field2923 = 0;
        class97.field1811 = 0;
        class69.field1274 = 0;
        class97.field1795 = 0;
        class153.field2977 = 0;
        class61.field964 = 0;
        class89.field1623 = 0;
        class34.field565 = 0;
        class157.field3102 = 0;
        class76.field1371 = 0;
        client.field489 = 0;
        class138.field2677 = 0;
        class140.field2728 = 0;
        class36.field580 = 0;
        client.field493 = 0;
        class61.field966 = 0;
        class27.field425 = 0;
        class128.field2422 = 0;
        class117.field2189 = 0;
        class204.field3937 = 0;
        class47.field763 = 0;
        class97.field1817 = 0;
        class158.field3168 = 0;
        class176.field3462 = 0;
        class93.field1716 = 0;
        class12.field200 = 0;
        class1.field24 = 0;
        class205.field3958 = 0;
        class141.field2744 = 0;
        class186.field3658 = 0;
        class44.field723 = 0;
        class117.field2197 = 0;
        class176.field3493 = 0;
        class200.field3878 = 0;
        class15.field268 = 0;
        class104.field1913 = 0;
        class39.field657 = 0;
        class107.field1944 = 0;
        class3.field56 = 0;
        class15.field267 = 0;
        class195.field3783 = 0;
        class95.field1767 = 0;
        class120.field2226 = 0;
        class178.field3541 = 0;
        class92.field1683 = 0;
        class181.field3581 = 0;
        class97.field1806 = 0;
        class16.field283 = 0;
        class141.field2754 = 0;
        class73.field1339 = 0;
        class151.field2924 = 0;
        class151.field2909 = 0;
        class19.field321 = 0;
        class46.field737 = 0;
        class8.field136 = 0;
        class124.field2307 = 0;
        class143.field2788 = 0;
        class89.field1607 = 0;
        class158.field3154 = 0;
        class68.field1260 = 0;
        class32.field519 = 0;
        class145.field2819 = 0;
        class177.field3521 = 0;
        class89.field1613 = 0;
        class7.field120 = 0;
        class97.field1800 = 0;
        class73.field1331 = 0;
        class34.field541 = 0;
        class200.field3886 = 0;
        class193.field3756 = 0;
        class153.field2959 = 0;
        class127.field2383 = 0;
        class61.field979 = 0;
        class158.field3191 = 0;
        class1.field28 = 0;
        class151.field2929 = 0;
        class89.field1630 = 0;
        class160.field3211 = 0;
        class154.field3044 = 0;
        class153.field3014 = 0;
        class19.field315 = 0;
        class158.field3133 = 0;
        class60.field961 = 0;
        class117.field2186 = 0;
        class197.field3838 = 0;
        class174.field3444 = 0;
        class131.field2470 = 0;
        client.field486 = 0;
        class190.field3716 = 0;
        class81.field1450 = 0;
        class83.field1525 = 0;
        class93.field1688 = 0;
        class128.field2439 = 0;
        class15.field264 = 0;
        class153.field3017 = 0;
        class8.field134 = 0;
        class147.field2839 = 0;
        class93.field1730 = 0;
        class133.field2556 = 0;
        class16.field285 = 0;
        class184.field3636 = 0;
        class9.field143 = 0;
        class158.field3155 = 0;
        class27.field449 = 0;
        class100.field1849 = 0;
        class50.field798 = 0;
        class120.field2227 = 0;
        class203.field3918 = 0;
        class141.field2751 = 0;
        class9.field152 = 0;
        class89.field1636 = 0;
        class136.field2636 = 0;
        class65.field1060 = 0;
        class14.field252 = 0;
        class97.field1822 = 0;
        class158.field3149 = 0;
        class7.field118 = 0;
        class179.field3565 = 0;
        class27.field448 = 0;
        class93.field1713 = 0;
        class47.field765 = 0;
        class64.field1027 = 0;
        class108.field1967 = 0;
        class180.field3569 = 0;
        class103.field1901 = 0;
        class43.field706 = 0;
        class68.field1261 = 0;
        client.field488 = 0;
        class93.field1729 = 0;
        class153.field2955 = 0;
        class51.field842 = 0;
        class40.field659 = 0;
        class97.field1815 = 0;
        class158.field3139 = 0;
        class203.field3924 = 0;
        class183.field3607 = 0;
        class186.field3656 = 0;
        class76.field1373 = 0;
        class151.field2907 = 0;
        class102.field1873 = 0;
        class93.field1685 = 0;
        class65.field1106 = 0;
        class115.field2148 = 0;
        class89.field1651 = 0;
        class15.field262 = 0;
        class153.field2991 = 0;
        class158.field3180 = 0;
        class63.field1007 = 0;
        class117.field2195 = 0;
        class142.field2776 = 0;
        class3.field57 = 0;
        class133.field2539 = 0;
        class107.field1945 = 0;
        class123.field2300 = 0;
        class19.field323 = 0;
        class181.field3579 = 0;
        class169.field3364 = 0;
        class66.field1194 = 0;
        class195.field3793 = 0;
        class158.field3148 = 0;
        class122.field2260 = 0;
        class116.field2176 = 0;
        class9.field151 = 0;
        class153.field3000 = 0;
        class113.field2111 = 0;
        class98.field1835 = 0;
        class207.field4050 = 0;
        class70.field1289 = 0;
        class153.field2990 = 0;
        class76.field1368 = 0;
        class61.field971 = 0;
        class43.field698 = 0;
        class141.field2741 = 0;
        class174.field3443 = 0;
        class158.field3183 = 0;
        class47.field745 = 0;
        class153.field2963 = 0;
        class76.field1369 = 0;
        class166.field3304 = 0;
        class34.field553 = 0;
        class200.field3892 = 0;
        class40.field674 = 0;
        class10.field162 = 0;
        class37.field603 = 0;
        class53.field873 = 0;
        class200.field3883 = 0;
        class15.field260 = 0;
        class6.field109 = 0;
        class93.field1687 = 0;
        class65.field1057 = 0;
        class95.field1770 = 0;
        class194.field3773 = 0;
        class67.field1216 = 0;
        class112.field2024 = 0;
        class93.field1694 = 0;
        class36.field584 = 0;
        class104.field1907 = 0;
        class113.field2100 = 0;
        class85.field1559 = 0;
        class158.field3141 = 0;
        class154.field3035 = 0;
        class153.field2956 = 0;
        class158.field3181 = 0;
        class121.field2239 = 0;
        class186.field3672 = 0;
        class154.field3030 = 0;
        class28.field450 = 0;
        class47.field762 = 0;
        class66.field1193 = 0;
        class93.field1722 = 0;
        class113.field2096 = 0;
        client.field491 = 0;
        class173.field3434 = 0;
        class47.field760 = 0;
        class81.field1465 = 0;
        class106.field1938 = 0;
        field2714 = 0;
        class97.field1809 = 0;
        class65.field1078 = 0;
        class93.field1720 = 0;
        class101.field1856 = 0;
        class18.field303 = 0;
        class127.field2390 = 0;
        class19.field327 = 0;
        class13.field220 = 0;
        client.field494 = 0;
        class154.field3038 = 0;
        class151.field2928 = 0;
        class75.field1355 = 0;
        class158.field3151 = 0;
        class158.field3163 = 0;
        class50.field797 = 0;
        class78.field1403 = 0;
        class113.field2097 = 0;
        class50.field801 = 0;
        class97.field1819 = 0;
        class13.field210 = 0;
        class171.field3390 = 0;
        class16.field292 = 0;
        class46.field731 = 0;
        class153.field2957 = 0;
        class3.field53 = 0;
        class153.field2996 = 0;
        class15.field263 = 0;
        client.field487 = 0;
        class158.field3159 = 0;
        class204.field3939 = 0;
        class153.field3016 = 0;
        class151.field2931 = 0;
        class117.field2181 = 0;
        class10.field165 = 0;
        class102.field1876 = 0;
        class40.field658 = 0;
        class176.field3467 = 0;
        class66.field1206 = 0;
        class55.field906 = 0;
        class183.field3616 = 0;
        class27.field429 = 0;
        class207.field4060 = 0;
        class203.field3925 = 0;
        class93.field1728 = 0;
        class154.field3028 = 0;
        client.field484 = 0;
        class122.field2262 = 0;
        class153.field2988 = 0;
        class183.field3609 = 0;
        class177.field3524 = 0;
        class204.field3945 = 0;
        class69.field1269 = 0;
        class37.field617 = 0;
        class93.field1692 = 0;
        class141.field2769 = 0;
        class3.field47 = 0;
        class1.field25 = 0;
        class39.field647 = 0;
        class29.field470 = 0;
        class114.field2136 = 0;
        class133.field2552 = 0;
        class155.field3049 = 0;
        class122.field2264 = 0;
        class40.field663 = 0;
        class166.field3321 = 0;
        class106.field1931 = 0;
        class122.field2263 = 0;
        class1.field7 = 0;
        class122.field2254 = 0;
        class166.field3272 = 0;
        class207.field4043 = 0;
        class24.field362 = 0;
        class97.field1813 = 0;
        class69.field1273 = 0;
        class70.field1300 = 0;
        class14.field241 = 0;
        class113.field2112 = 0;
        field2706 = 0;
        class44.field726 = 0;
        class70.field1295 = 0;
        class205.field3959 = 0;
        class61.field975 = 0;
        class57.field937 = 0;
        class65.field1119 = 0;
        class204.field3940 = 0;
        class172.field3425 = 0;
        class70.field1302 = 0;
        class158.field3134 = 0;
        class116.field2174 = 0;
        class84.field1536 = 0;
        class88.field1595 = 0;
        class101.field1850 = 0;
        class207.field4064 = 0;
        class82.field1518 = 0;
        class49.field786 = 0;
        class70.field1306 = 0;
        class204.field3941 = 0;
        class142.field2774 = 0;
        class158.field3142 = 0;
        class111.field1999 = 0;
        class204.field3934 = 0;
        class1.field11 = 0;
        class73.field1340 = 0;
        class184.field3637 = 0;
        class97.field1792 = 0;
        class158.field3172 = 0;
        class178.field3538 = 0;
        class93.field1717 = 0;
        class181.field3587 = 0;
        class142.field2785 = 0;
        class13.field225 = 0;
        class97.field1820 = 0;
        class117.field2184 = 0;
        class110.field1993 = 0;
        class77.field1398 = 0;
        class153.field2983 = 0;
        class201.field3896 = 0;
        class28.field459 = 0;
        class158.field3144 = 0;
        class89.field1646 = 0;
        class166.field3283 = 0;
        class83.field1530 = 0;
        class154.field3036 = 0;
        class124.field2306 = 0;
        class89.field1655 = 0;
        class82.field1503 = 0;
        class12.field194 = 0;
        class41.field682 = 0;
        class114.field2139 = 0;
        class71.field1315 = 0;
        class93.field1708 = 0;
        class81.field1436 = 0;
        class158.field3187 = 0;
        class158.field3166 = 0;
        class37.field619 = 0;
        class188.field3677 = 0;
        class205.field3961 = 0;
        class103.field1894 = 0;
        class159.field3210 = 0;
        class151.field2919 = 0;
        class93.field1695 = 0;
        class27.field427 = 0;
        class192.field3744 = 0;
        class100.field1846 = 0;
        class189.field3704 = 0;
        class190.field3709 = 0;
        class158.field3174 = 0;
        class93.field1737 = 0;
        class122.field2251 = 0;
        class113.field2102 = 0;
        class93.field1699 = 0;
        class89.field1650 = 0;
        class148.field2864 = 0;
        class173.field3432 = 0;
        class138.field2674 = 0;
        class71.field1307 = 0;
        class1.field2 = 0;
        class158.field3132 = 0;
        class155.field3052 = 0;
        class59.field945 = 0;
        class39.field655 = 0;
        class144.field2812 = 0;
        class21.field334 = 0;
        class89.field1628 = 0;
        class97.field1793 = 0;
        class71.field1313 = 0;
        class57.field927 = 0;
        class131.field2473 = 0;
        class79.field1409 = 0;
        class67.field1231 = 0;
        class157.field3121 = 0;
        class30.field502 = 0;
        class67.field1233 = 0;
        class153.field2999 = 0;
        class88.field1602 = 0;
        class100.field1843 = 0;
        class191.field3729 = 0;
        class158.field3165 = 0;
        class165.field3254 = 0;
        class153.field2974 = 0;
        class204.field3936 = 0;
        class137.field2647 = 0;
        class93.field1718 = 0;
        class89.field1643 = 0;
        class47.field739 = 0;
        field2697 = 0;
        class154.field3040 = 0;
        class191.field3722 = 0;
        class158.field3146 = 0;
        class141.field2750 = 0;
        class157.field3103 = 0;
        class154.field3033 = 0;
        class157.field3128 = 0;
        class122.field2265 = 0;
        class16.field280 = 0;
        class13.field235 = 0;
        class141.field2757 = 0;
        class14.field240 = 0;
        class186.field3660 = 0;
        class112.field2030 = 0;
        class200.field3882 = 0;
        class138.field2661 = 0;
        class151.field2930 = 0;
        class111.field2010 = 0;
        class37.field606 = 0;
        class69.field1272 = 0;
        class98.field1829 = 0;
        class207.field4047 = 0;
        class13.field222 = 0;
        class112.field2016 = 0;
        class55.field914 = 0;
        class127.field2398 = 0;
        class27.field441 = 0;
        class93.field1724 = 0;
        class50.field805 = 0;
        class91.field1657 = 0;
        class97.field1823 = 0;
        class36.field578 = 0;
        class158.field3194 = 0;
        class114.field2123 = 0;
        class91.field1676 = 0;
        class81.field1485 = 0;
        class174.field3441 = 0;
        class68.field1247 = 0;
        class14.field246 = 0;
        class182.field3591 = 0;
        class82.field1505 = 0;
        class16.field278 = 0;
        class171.field3386 = 0;
        class140.field2724 = 0;
        class30.field504 = 0;
        class40.field661 = 0;
        class27.field445 = 0;
        class200.field3888 = 0;
        class65.field1091 = 0;
        class55.field919 = 0;
        class23.field348 = 0;
        class153.field2995 = 0;
        class191.field3738 = 0;
        class131.field2472 = 0;
        class18.field304 = 0;
        class136.field2635 = 0;
        class193.field3754 = 0;
        class142.field2779 = 0;
        class89.field1647 = 0;
        class141.field2740 = 0;
        class26.field416 = 0;
        class93.field1735 = 0;
        class158.field3192 = 0;
        class200.field3880 = 0;
        class138.field2663 = 0;
        class137.field2649 = 0;
        class57.field925 = 0;
        class140.field2735 = 0;
        class93.field1712 = 0;
        class172.field3413 = 0;
        class68.field1249 = 0;
        class121.field2243 = 0;
        class71.field1314 = 0;
        class195.field3779 = 0;
        class93.field1686 = 0;
        class15.field261 = 0;
        class97.field1814 = 0;
        class153.field2964 = 0;
        class6.field110 = 0;
        class13.field206 = 0;
        class80.field1415 = 0;
        class89.field1633 = 0;
        class1.field13 = 0;
        class158.field3185 = 0;
        field2709 = 0;
        class12.field195 = 0;
        class72.field1325 = 0;
        class23.field354 = 0;
        class177.field3520 = 0;
        class114.field2144 = 0;
        class61.field973 = 0;
        class93.field1715 = 0;
        class113.field2090 = 0;
        class182.field3589 = 0;
        class158.field3147 = 0;
        class158.field3188 = 0;
        class66.field1201 = 0;
        class158.field3161 = 0;
        class183.field3621 = 0;
        class194.field3771 = 0;
        class40.field676 = 0;
        class57.field931 = 0;
        class97.field1821 = 0;
        class186.field3659 = 0;
        class153.field2975 = 0;
        class165.field3258 = 0;
        class158.field3170 = 0;
        class153.field3005 = 0;
        class93.field1690 = 0;
        class89.field1648 = 0;
        class203.field3916 = 0;
        class112.field2072 = 0;
        class47.field738 = 0;
        class93.field1703 = 0;
        class112.field2025 = 0;
        class106.field1935 = 0;
        class120.field2230 = 0;
        class142.field2773 = 0;
        class111.field2009 = 0;
        client.field495 = 0;
        class153.field2985 = 0;
        class77.field1396 = 0;
        class97.field1816 = 0;
        class93.field1700 = 0;
        class173.field3430 = 0;
        class111.field2002 = 0;
        class133.field2540 = 0;
        class2.field36 = 0;
        field2701 = 0;
        class1.field18 = 0;
        class155.field3055 = 0;
        class166.field3331 = 0;
        class59.field946 = 0;
        class151.field2912 = 0;
        class50.field800 = 0;
        class106.field1936 = 0;
        class136.field2638 = 0;
        class37.field601 = 0;
        class160.field3216 = 0;
        class47.field740 = 0;
        class51.field828 = 0;
        class158.field3189 = 0;
        class130.field2458 = 0;
        class113.field2091 = 0;
        class21.field336 = 0;
        class80.field1426 = 0;
        class65.field1124 = 0;
        class114.field2130 = 0;
        class85.field1553 = 0;
        class47.field761 = 0;
        class50.field796 = 0;
        class112.field2065 = 0;
        class43.field699 = 0;
        class15.field273 = 0;
        class153.field3004 = 0;
        class37.field602 = 0;
        class122.field2271 = 0;
        class77.field1397 = 0;
        class166.field3300 = 0;
        class153.field2969 = 0;
        class169.field3367 = 0;
        class128.field2411 = 0;
        class142.field2771 = 0;
        class32.field525 = 0;
        class201.field3895 = 0;
        class14.field248 = 0;
        class165.field3263 = 0;
        class120.field2228 = 0;
        class153.field2950 = 0;
        class172.field3423 = 0;
        class84.field1540 = 0;
        class200.field3889 = 0;
        class40.field678 = 0;
        class133.field2542 = 0;
        class4.field68 = 0;
        class53.field874 = 0;
        class28.field458 = 0;
        class207.field4036 = 0;
        class4.field63 = 0;
        class67.field1230 = 0;
        class68.field1259 = 0;
        class27.field434 = 0;
        class47.field747 = 0;
        class200.field3871 = 0;
        class108.field1966 = 0;
        class65.field1061 = 0;
        class157.field3126 = 0;
        class34.field559 = 0;
        client.field490 = 0;
        class182.field3593 = 0;
        class191.field3724 = 0;
        class141.field2761 = 0;
        class102.field1888 = true;
        class68.field1246 = true;
        class35.field566 = 0L;
        class14.method79(10);
        class67.field1240 = -1;
        class100.field1841 = 0;
        class153.field2971 = 0;
        class83.field1535 = -1;
        class141.field2760 = -1;
        class151.field2908.field3153 = 0;
        class59.field942.field3153 = 0;
        class37.field629 = 0;
        class177.field3518 = -1;
        class121.field2241 = arg0;
        class49.field790 = 0;
        class184.field3627 = 0;
        class81.method409(0, 0);
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class161.field3223[var1] = null;
        }
        class160.field3217 = -40 + (int) (80.0D * Math.random());
        class144.field2800 = 0;
        class18.field297 = 0;
        class80.field1421 = 0;
        class195.field3788 = 0;
        class93.field1707 = -60 + (int) (Math.random() * 120.0D);
        class166.field3328 = -50 + (int) (Math.random() * 100.0D);
        class112.field2085 = 0;
        class25.field374 = -1;
        class103.field1905 = false;
        class205.field3966 = 0;
        class21.field341 = -55 + (int) (110.0D * Math.random());
        class30.field510 = -10 + (int) (20.0D * Math.random()) & 2047;
        class193.field3749 = (int) (Math.random() * 30.0D) - 20;
        class101.field1863 = 0;
        class35.field574 = 0;
        for (int var2 = 0; ~var2 > -2049; ++var2) {
            class206.field4035[var2] = null;
            class131.field2485[var2] = null;
        }
        for (int var3 = 0; ~var3 > -32769; ++var3) {
            class143.field2791[var3] = null;
        }
        class106.field1940 = class206.field4035[2047] = new class34();
        class28.field453.method702((byte) 37);
        class206.field4027.method702((byte) 48);
        for (int var4 = 0; ~var4 > -5; ++var4) {
            for (int var12 = 0; ~var12 > -105; ++var12) {
                for (int var13 = 0; ~var13 > -105; ++var13) {
                    class169.field3358[var4][var12][var13] = null;
                }
            }
        }
        class1.field3 = new class122();
        class62.field991 = 0;
        class37.field624 = 0;
        for (int var5 = 0; var5 < class153.field2994; ++var5) {
            class204 var11 = class131.method767(var5, (byte) 84);
            if (var11 != null && var11.field3949 == 0) {
                class194.field3768[var5] = 0;
                class47.field758[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class103.field1900.length; ++var6) {
            class103.field1900[var6] = -1;
        }
        if (~class97.field1824 != 0) {
            class177.method1167(class97.field1824, 98);
        }
        for (class78 var7 = (class78) class147.field2834.method612(12981); var7 != null; var7 = (class78) class147.field2834.method623((byte) -77)) {
            class18.method108(0, true, var7);
        }
        class97.field1824 = -1;
        class147.field2834 = new class113(8);
        class82.field1511 = null;
        class100.field1841 = 0;
        class121.field2241 = false;
        class81.field1471.method886(new int[5], -1, true, (int[]) null, false);
        for (int var8 = 0; ~var8 > -9; ++var8) {
            class148.field2846[var8] = null;
            class204.field3938[var8] = false;
        }
        class9.method51(6);
        class69.field1270 = true;
        for (int var9 = 0; var9 < 100; ++var9) {
            class203.field3927[var9] = true;
        }
        class194.field3762 = null;
        class103.field1896 = 0;
        class98.field1838 = null;
        for (int var10 = 0; ~var10 > -7; ++var10) {
            class63.field999[var10] = new class60();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjg;BI)Z")
    public static final boolean method873(int arg0, class89 arg1, byte arg2, int arg3) {
        ++field2684;
        int var4 = -38 % ((10 - arg2) / 42);
        byte[] var5 = arg1.method461(arg3, (byte) 97, arg0);
        if (var5 == null) {
            return false;
        } else {
            class203.method1319(-26749, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            this.method154((byte) -104);
        }
        ++field2683;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field2691 = arg2.method1071(28101);
                                    }
                                } else {
                                    this.field2700 = arg2.method1071(28101);
                                }
                            } else {
                                this.field2713 = arg2.method1071(28101);
                            }
                        } else {
                            this.field2690 = arg2.method1071(28101);
                        }
                    } else {
                        this.field2682 = arg2.method1071(28101);
                    }
                } else {
                    this.field2708 = arg2.method1071(28101);
                }
            } else {
                this.field2705 = arg2.method1054(128);
            }
        } else {
            this.field2704 = arg2.method1054(128);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        int[] var3 = super.field447.method1238(arg1, arg0);
        ++field2709;
        if (super.field447.field3737) {
            int var4 = 0;
            int var5;
            for (var5 = class142.field2781[arg0] - -this.field2713; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field2705 && ~var5 <= ~this.field2688[var4]) {
                ++var4;
            }
            float var6 = (float) this.field2688[var4 + -1];
            float var7 = (float) this.field2688[var4];
            if ((float) this.field2685 + var6 < (float) var5 && (float) var5 < (float) (-this.field2685) + var7) {
                for (int var8 = 0; ~var8 > ~class159.field3209; ++var8) {
                    int var9 = 0;
                    int var10 = var4 % 2 != 0 ? -this.field2690 : this.field2690;
                    int var11;
                    for (var11 = (this.field2687 * var10 >> 12) + class97.field1808[var8]; ~var11 > -1; var11 += 4096) {
                    }
                    while (~var11 < -4097) {
                        var11 -= 4096;
                    }
                    while (~this.field2704 < ~var9 && this.field2712[var4 + -1][var9] <= var11) {
                        ++var9;
                    }
                    float var12 = (float) this.field2712[var4 + -1][var9 + -1];
                    float var13 = (float) this.field2712[var4 + -1][var9];
                    if ((float) this.field2685 + var12 < (float) var11 && (float) (-this.field2685) + var13 > (float) var11) {
                        var3[var8] = this.field2696[var4 + -1][var9 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class90.method474(var3, 0, class159.field3209, 0);
            }
        }
        return var3;
    }
}
