import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 extends class26 {

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "Z")
    private boolean field2946 = false;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    private int field2944 = 0;

    @OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
    private int field2957 = 0;

    @OriginalMember(owner = "client!sc", name = "Cb", descriptor = "I")
    private int field2968;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!sc", name = "wb", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!sc", name = "pb", descriptor = "I")
    private int field2955;

    @OriginalMember(owner = "client!sc", name = "zb", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!sc", name = "kb", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!sc", name = "Db", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!sc", name = "ub", descriptor = "Lvc;")
    private class149 field2960;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lec;")
    public static class32 field2938 = class73.method594("(U", true);

    @OriginalMember(owner = "client!sc", name = "mb", descriptor = "Lec;")
    private static class32 field2952 = class73.method594("yellow:", true);

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "Lec;")
    public static class32 field2949 = field2952;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "Lec;")
    public static class32 field2942 = class73.method594("jolt", true);

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "Lec;")
    public static class32 field2941 = class73.method594("", true);

    @OriginalMember(owner = "client!sc", name = "yb", descriptor = "Lec;")
    public static class32 field2964 = field2952;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "D")
    private double field2935;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "D")
    private double field2936;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "D")
    private double field2948;

    @OriginalMember(owner = "client!sc", name = "lb", descriptor = "D")
    public double field2951;

    @OriginalMember(owner = "client!sc", name = "nb", descriptor = "D")
    public double field2953;

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "D")
    public double field2954;

    @OriginalMember(owner = "client!sc", name = "sb", descriptor = "D")
    private double field2958;

    @OriginalMember(owner = "client!sc", name = "vb", descriptor = "D")
    private double field2961;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!sc", name = "xb", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sc", name = "Ab", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!sc", name = "Bb", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!sc", name = "Eb", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!sc", name = "Fb", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    public final void method990(int arg0, int arg1) {
        this.field2951 += (double) arg0 * this.field2958;
        if (arg1 != -1) {
            this.field2944 = -48;
        }
        this.field2946 = true;
        this.field2954 += this.field2936 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2948;
        this.field2948 += (double) arg0 * this.field2936;
        field2940++;
        this.field2953 += (double) arg0 * this.field2935;
        this.field2970 = (int) (Math.atan2(this.field2958, this.field2935) * 325.949D) + 1024 & 0x7FF;
        this.field2959 = (int) (Math.atan2(this.field2948, this.field2961) * 325.949D) & 0x7FF;
        if (this.field2960 == null) {
            return;
        }
        this.field2944 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2944 <= this.field2960.field3378[this.field2957]) {
                        return;
                    }
                    this.field2944 -= this.field2960.field3378[this.field2957];
                    this.field2957++;
                } while (this.field2957 < this.field2960.field3395.length);
                this.field2957 -= this.field2960.field3388;
            } while (this.field2957 >= 0 && this.field2960.field3395.length > this.field2957);
            this.field2957 = 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lod;")
    public final class101 method132(byte arg0) {
        field2971++;
        if (arg0 != 109) {
            method995(-56);
        }
        class133 var2 = class38.method317(this.field2955, -22);
        class101 var3 = var2.method1019(121, this.field2957);
        if (var3 == null) {
            return null;
        } else {
            var3.method804(this.field2959);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method991(int arg0, Component arg1) {
        field2943++;
        if (arg0 == 0) {
            arg1.addMouseListener(class38.field910);
            arg1.addMouseMotionListener(class38.field910);
            arg1.addFocusListener(class38.field910);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field2964 = null;
        field2949 = null;
        field2952 = null;
        if (arg0 != -11) {
            method991(-54, null);
        }
        field2938 = null;
        field2941 = null;
        field2942 = null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(II)Lf;")
    public static final class36 method993(int arg0, int arg1) {
        field2956++;
        int var2 = -16 / ((arg1 + 32) / 63);
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class79.field1826[var3] == null || class79.field1826[var3][var4] == null) {
            boolean var5 = class28.method192(var3, -18020);
            if (!var5) {
                return null;
            }
        }
        return class79.field1826[var3][var4];
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2945++;
        if (class28.method192(arg0, -18020)) {
            class85.method661(class79.field1826[arg0], arg6, arg1, arg2, arg5, arg4, arg3, arg7, -1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static final void method995(int arg0) {
        class11.field182 = 0L;
        field2966++;
        class126.field2928 = true;
        class66.field1561 = 0;
        class53.field1264 = 0;
        class63.field1451 = 0;
        class65.field1503 = 0;
        class139.field3208 = 0;
        class152.field3509 = 0;
        class57.field1325 = 0;
        class66.field1564 = 0;
        class140.field3221 = 0;
        class86.field2024 = 0;
        class57.field1338 = 0;
        class146.field3316 = 0;
        class11.field179 = 0;
        class41.field960 = 0;
        class157.field3581 = 0;
        class85.field1984 = 0;
        class4.field76 = 0;
        class66.field1525 = 0;
        class152.field3492 = 0;
        class82.field1911 = 0;
        class73.field1724 = 0;
        class50.field1155 = 0;
        class66.field1576 = 0;
        class50.field1154 = 0;
        class157.field3600 = 0;
        class15.field304 = 0;
        class33.field685 = 0;
        class79.field1836 = 0;
        class62.field1424 = 0;
        class44.field1013 = 0;
        class73.field1726 = 0;
        class81.field1872 = 0;
        class105.field2492 = 0;
        class115.field2752 = 0;
        class82.field1893 = 0;
        class66.field1560 = 0;
        class135.field3134 = 0;
        class23.field400 = 0;
        class91.field2102 = 0;
        class75.field1761 = 0;
        class98.field2263 = 0;
        class17.field345 = 0;
        class39.field942 = 0;
        class126.field2931 = 0;
        class30.field583 = 0;
        class117.field2785 = 0;
        class109.field2559 = 0;
        class50.field1148 = 0;
        class43.field989 = 0;
        class134.field3126 = 0;
        class136.field3157 = 0;
        class82.field1897 = 0;
        class26.field480 = 0;
        class32.field649 = 0;
        class137.field3185 = 0;
        class82.field1889 = 0;
        class151.field3461 = 0;
        class66.field1526 = 0;
        class80.field1846 = 0;
        class57.field1329 = 0;
        class66.field1546 = 0;
        class149.field3382 = 0;
        class4.field61 = 0;
        class62.field1374 = 0;
        class115.field2709 = 0;
        class130.field2995 = 0;
        class137.field3183 = 0;
        class142.field3257 = 0;
        class144.field3283 = 0;
        class105.field2497 = 0;
        class17.field334 = 0;
        class112.field2616 = 0;
        class52.field1191 = 0;
        class149.field3376 = 0;
        class125.field2906 = 0;
        class133.field3062 = 0;
        class47.field1110 = 0;
        class37.field891 = 0;
        class15.field291 = 0;
        class113.field2644 = 0;
        class30.field556 = 0;
        class66.field1531 = 0;
        class106.field2522 = 0;
        class41.field952 = 0;
        class30.field554 = 0;
        class117.field2790 = 0;
        class83.field1955 = 0;
        class30.field541 = 0;
        class98.field2267 = 0;
        class82.field1914 = 0;
        class136.field3152 = 0;
        class70.field1656 = 0;
        class56.field1302 = 0;
        class32.field675 = 0;
        class114.field2650 = 0;
        class73.field1714 = 0;
        class97.field2227 = 0;
        class2.field17 = 0;
        class34.field726 = 0;
        class44.field1040 = 0;
        field2945 = 0;
        class32.field659 = 0;
        class15.field320 = 0;
        class75.field1764 = 0;
        class156.field3571 = 0;
        class119.field2844 = 0;
        class89.field2058 = 0;
        class86.field2006 = 0;
        class54.field1284 = 0;
        class66.field1545 = 0;
        class131.field3019 = 0;
        class85.field1991 = 0;
        field2956 = 0;
        class82.field1882 = 0;
        class91.field2084 = 0;
        class149.field3375 = 0;
        class71.field1663 = 0;
        class88.field2038 = 0;
        class80.field1844 = 0;
        class82.field1900 = 0;
        class68.field1612 = 0;
        class114.field2672 = 0;
        class34.field708 = 0;
        class17.field344 = 0;
        class28.field511 = 0;
        class134.field3113 = 0;
        class152.field3506 = 0;
        class52.field1185 = 0;
        class159.field3650 = 0;
        class103.field2430 = 0;
        class15.field273 = 0;
        class44.field1026 = 0;
        class117.field2805 = 0;
        class91.field2079 = 0;
        class50.field1150 = 0;
        class117.field2780 = 0;
        class34.field727 = 0;
        class125.field2914 = 0;
        class129.field2981 = 0;
        class48.field1131 = 0;
        client.field378 = 0;
        class82.field1904 = 0;
        class57.field1314 = 0;
        class30.field573 = 0;
        client.field391 = 0;
        class142.field3252 = 0;
        class62.field1371 = 0;
        class70.field1658 = 0;
        class130.field2988 = 0;
        class82.field1884 = 0;
        class56.field1293 = 0;
        class62.field1404 = 0;
        class94.field2169 = 0;
        class102.field2390 = 0;
        class68.field1591 = 0;
        class15.field272 = 0;
        class147.field3351 = 0;
        class8.field150 = 0;
        class36.field737 = 0;
        class117.field2784 = 0;
        class117.field2804 = 0;
        class61.field1358 = 0;
        class114.field2664 = 0;
        client.field383 = 0;
        class62.field1394 = 0;
        class15.field252 = 0;
        client.field394 = 0;
        class146.field3314 = 0;
        class73.field1729 = 0;
        class106.field2504 = 0;
        class62.field1383 = 0;
        class14.field242 = 0;
        class151.field3462 = 0;
        class134.field3128 = 0;
        class151.field3459 = 0;
        class94.field2170 = 0;
        class3.field33 = 0;
        class14.field227 = 0;
        class83.field1960 = 0;
        class68.field1608 = 0;
        class139.field3205 = 0;
        class36.field765 = 0;
        class13.field213 = 0;
        class114.field2665 = 0;
        class97.field2218 = 0;
        class109.field2574 = 0;
        class20.field370 = 0;
        class54.field1268 = 0;
        class133.field3063 = 0;
        class52.field1189 = 0;
        class70.field1641 = 0;
        class77.field1807 = 0;
        class30.field555 = 0;
        class36.field802 = 0;
        class66.field1548 = 0;
        class56.field1294 = 0;
        class15.field254 = 0;
        class112.field2621 = 0;
        class3.field41 = 0;
        class94.field2181 = 0;
        class117.field2807 = 0;
        client.field384 = 0;
        class66.field1566 = 0;
        class43.field1008 = 0;
        class80.field1843 = 0;
        class100.field2318 = 0;
        class80.field1848 = 0;
        class63.field1452 = 0;
        class34.field701 = 0;
        class149.field3369 = 0;
        class103.field2411 = 0;
        class111.field2593 = 0;
        class53.field1229 = 0;
        class144.field3284 = 0;
        class131.field3011 = 0;
        class97.field2212 = 0;
        class126.field2921 = 0;
        class15.field303 = 0;
        class44.field1016 = 0;
        class48.field1128 = 0;
        class71.field1680 = 0;
        class157.field3580 = 0;
        class79.field1830 = 0;
        class110.field2592 = 0;
        class30.field543 = 0;
        class82.field1898 = 0;
        class94.field2175 = 0;
        class117.field2791 = 0;
        class32.field631 = 0;
        class98.field2260 = 0;
        class38.field900 = 0;
        class44.field1047 = 0;
        class52.field1173 = 0;
        class112.field2625 = 0;
        class44.field1014 = 0;
        class15.field289 = 0;
        class27.field482 = 0;
        class154.field3513 = 0;
        class125.field2907 = 0;
        class136.field3161 = 0;
        class82.field1895 = 0;
        class145.field3297 = 0;
        class85.field1993 = 0;
        class39.field933 = 0;
        class143.field3268 = 0;
        class157.field3597 = 0;
        class34.field703 = 0;
        class3.field40 = 0;
        class157.field3595 = 0;
        class157.field3585 = 0;
        class23.field407 = 0;
        class149.field3379 = 0;
        class36.field806 = 0;
        class56.field1304 = 0;
        class2.field25 = 0;
        class38.field908 = 0;
        class137.field3181 = 0;
        class89.field2051 = 0;
        class65.field1518 = 0;
        class30.field570 = 0;
        class32.field670 = 0;
        class33.field686 = 0;
        class82.field1906 = 0;
        class140.field3223 = 0;
        class47.field1105 = 0;
        class32.field666 = 0;
        class106.field2512 = 0;
        class107.field2548 = 0;
        class32.field660 = 0;
        class86.field2007 = 0;
        class66.field1550 = 0;
        class117.field2796 = 0;
        class1.field5 = 0;
        class94.field2177 = 0;
        class66.field1558 = 0;
        class15.field268 = 0;
        class154.field3546 = 0;
        class63.field1459 = 0;
        class109.field2556 = 0;
        client.field390 = 0;
        class115.field2705 = 0;
        class82.field1881 = 0;
        class68.field1602 = 0;
        class114.field2669 = 0;
        class133.field3064 = 0;
        class9.field159 = 0;
        class15.field267 = 0;
        class57.field1335 = 0;
        class66.field1541 = 0;
        class56.field1308 = 0;
        class30.field581 = 0;
        class15.field280 = 0;
        class140.field3227 = 0;
        class121.field2867 = 0;
        class29.field520 = 0;
        class43.field984 = 0;
        class15.field265 = 0;
        class111.field2599 = 0;
        class135.field3135 = 0;
        class152.field3497 = 0;
        class57.field1330 = 0;
        class8.field132 = 0;
        class52.field1186 = 0;
        class47.field1109 = 0;
        class118.field2829 = 0;
        class156.field3561 = 0;
        class81.field1875 = 0;
        class41.field953 = 0;
        class147.field3333 = 0;
        class111.field2598 = 0;
        class68.field1610 = 0;
        class83.field1942 = 0;
        class152.field3495 = 0;
        class66.field1581 = 0;
        class33.field692 = 0;
        class119.field2853 = 0;
        class64.field1484 = 0;
        class75.field1763 = 0;
        class34.field713 = 0;
        class8.field135 = 0;
        class26.field478 = 0;
        class63.field1457 = 0;
        class1.field13 = 0;
        class66.field1530 = 0;
        class135.field3145 = 0;
        class121.field2868 = 0;
        class36.field871 = 0;
        class74.field1750 = 0;
        class114.field2660 = 0;
        class145.field3308 = 0;
        class152.field3505 = 0;
        class142.field3248 = 0;
        class48.field1120 = 0;
        class134.field3114 = 0;
        class113.field2641 = 0;
        class130.field2994 = 0;
        class140.field3230 = 0;
        class152.field3493 = 0;
        class146.field3310 = 0;
        class111.field2602 = 0;
        class80.field1853 = 0;
        class145.field3300 = 0;
        class66.field1538 = 0;
        class14.field243 = 0;
        class86.field2020 = 0;
        class15.field286 = 0;
        class157.field3601 = 0;
        class32.field646 = 0;
        class66.field1585 = 0;
        class33.field684 = 0;
        class31.field608 = 0;
        class84.field1972 = 0;
        class98.field2274 = 0;
        class2.field16 = 0;
        class70.field1651 = 0;
        class5.field101 = 0;
        class157.field3584 = 0;
        class158.field3619 = 0;
        class13.field215 = 0;
        class15.field255 = 0;
        class115.field2688 = 0;
        class118.field2821 = 0;
        class15.field324 = 0;
        class43.field1011 = 0;
        class82.field1910 = 0;
        class121.field2877 = 0;
        class47.field1114 = 0;
        class130.field2985 = 0;
        class52.field1184 = 0;
        class66.field1555 = 0;
        class41.field949 = 0;
        class114.field2646 = 0;
        class1.field9 = 0;
        class30.field557 = 0;
        class156.field3559 = 0;
        class50.field1152 = 0;
        class114.field2656 = 0;
        class66.field1549 = 0;
        class15.field274 = 0;
        class124.field2897 = 0;
        class66.field1542 = 0;
        class30.field575 = 0;
        class97.field2225 = 0;
        class88.field2050 = 0;
        class45.field1049 = 0;
        class110.field2584 = 0;
        class97.field2217 = 0;
        class66.field1557 = 0;
        class4.field53 = 0;
        class156.field3557 = 0;
        class73.field1736 = 0;
        class91.field2098 = 0;
        class41.field969 = 0;
        class31.field605 = 0;
        class15.field308 = 0;
        class47.field1112 = 0;
        class57.field1324 = 0;
        class50.field1151 = arg0;
        class125.field2912 = 0;
        client.field380 = 0;
        class15.field249 = 0;
        class15.field258 = 0;
        class32.field665 = 0;
        class15.field325 = 0;
        class102.field2388 = 0;
        class91.field2101 = 0;
        class79.field1828 = 0;
        class125.field2901 = 0;
        class114.field2649 = 0;
        class15.field263 = 0;
        class12.field195 = 0;
        class152.field3487 = 0;
        class71.field1670 = 0;
        class33.field691 = 0;
        class36.field859 = 0;
        class36.field869 = 0;
        class62.field1395 = 0;
        class29.field523 = 0;
        class17.field349 = 0;
        class152.field3494 = 0;
        class156.field3572 = 0;
        class66.field1572 = 0;
        class11.field187 = 0;
        class144.field3291 = 0;
        class156.field3562 = 0;
        class62.field1399 = 0;
        class66.field1544 = 0;
        class65.field1514 = 0;
        class23.field419 = 0;
        class38.field912 = 0;
        class32.field673 = 0;
        class32.field662 = 0;
        class30.field550 = 0;
        class106.field2524 = 0;
        class17.field346 = 0;
        class8.field153 = 0;
        class30.field580 = 0;
        class125.field2910 = 0;
        class43.field993 = 0;
        class140.field3222 = 0;
        class36.field782 = 0;
        class38.field899 = 0;
        class63.field1464 = 0;
        class81.field1868 = 0;
        class80.field1845 = 0;
        class66.field1589 = 0;
        class32.field630 = 0;
        class5.field106 = 0;
        class14.field248 = 0;
        class53.field1261 = 0;
        class64.field1480 = 0;
        class142.field3259 = 0;
        class89.field2059 = 0;
        class121.field2871 = 0;
        class50.field1157 = 0;
        class65.field1520 = 0;
        class56.field1298 = 0;
        class89.field2055 = 0;
        class32.field629 = 0;
        class15.field316 = 0;
        class97.field2196 = 0;
        class117.field2786 = 0;
        class84.field1976 = 0;
        class52.field1181 = 0;
        class68.field1592 = 0;
        class15.field281 = 0;
        class111.field2601 = 0;
        class32.field663 = 0;
        class26.field477 = 0;
        class27.field494 = 0;
        class149.field3380 = 0;
        client.field386 = 0;
        class144.field3288 = 0;
        class97.field2201 = 0;
        class125.field2909 = 0;
        class66.field1575 = 0;
        class65.field1498 = 0;
        class133.field3105 = 0;
        class149.field3393 = 0;
        class30.field584 = 0;
        class66.field1551 = 0;
        class82.field1899 = 0;
        class2.field19 = 0;
        class81.field1863 = 0;
        class66.field1574 = 0;
        class157.field3591 = 0;
        class84.field1977 = 0;
        class82.field1885 = 0;
        class15.field294 = 0;
        class33.field687 = 0;
        class15.field282 = 0;
        class158.field3612 = 0;
        class8.field144 = 0;
        class152.field3481 = 0;
        class31.field592 = 0;
        class132.field3028 = 0;
        class109.field2561 = 0;
        class73.field1718 = 0;
        class64.field1486 = 0;
        class130.field3001 = 0;
        class62.field1420 = 0;
        class121.field2874 = 0;
        class15.field257 = 0;
        class53.field1248 = 0;
        class23.field399 = 0;
        class82.field1902 = 0;
        class82.field1903 = 0;
        class80.field1849 = 0;
        class77.field1798 = 0;
        class134.field3110 = 0;
        class80.field1851 = 0;
        class86.field2018 = 0;
        client.field389 = 0;
        class54.field1271 = 0;
        class34.field717 = 0;
        class82.field1913 = 0;
        class82.field1891 = 0;
        class66.field1534 = 0;
        class32.field637 = 0;
        class134.field3127 = 0;
        class149.field3377 = 0;
        class105.field2493 = 0;
        class23.field409 = 0;
        class53.field1216 = 0;
        class158.field3634 = 0;
        class26.field474 = 0;
        class31.field598 = 0;
        class124.field2890 = 0;
        class115.field2697 = 0;
        class151.field3454 = 0;
        class32.field661 = 0;
        class94.field2167 = 0;
        class44.field1021 = 0;
        class32.field624 = 0;
        class139.field3210 = 0;
        class129.field2978 = 0;
        class97.field2209 = 0;
        class32.field650 = 0;
        class110.field2585 = 0;
        class32.field668 = 0;
        class63.field1463 = 0;
        class36.field860 = 0;
        class36.field828 = 0;
        class28.field510 = 0;
        class117.field2803 = 0;
        class100.field2321 = 0;
        class139.field3206 = 0;
        class157.field3586 = 0;
        class34.field721 = 0;
        class56.field1312 = 0;
        class9.field165 = 0;
        class53.field1207 = 0;
        class73.field1727 = 0;
        class31.field604 = 0;
        class8.field151 = 0;
        class88.field2043 = 0;
        class111.field2596 = 0;
        class36.field760 = 0;
        class32.field621 = 0;
        class159.field3647 = 0;
        class106.field2528 = 0;
        class85.field1983 = 0;
        class32.field627 = 0;
        class53.field1201 = 0;
        class9.field161 = 0;
        class31.field591 = 0;
        class92.field2111 = 0;
        class19.field360 = 0;
        class26.field471 = 0;
        class66.field1537 = 0;
        class129.field2983 = 0;
        class43.field986 = 0;
        class65.field1501 = 0;
        class66.field1579 = 0;
        class15.field262 = 0;
        class33.field682 = 0;
        class66.field1573 = 0;
        class66.field1559 = 0;
        class4.field82 = 0;
        class30.field559 = 0;
        class146.field3312 = 0;
        class154.field3537 = 0;
        class117.field2782 = 0;
        class32.field648 = 0;
        class102.field2387 = 0;
        class68.field1609 = 0;
        class15.field317 = 0;
        class119.field2855 = 0;
        class15.field306 = 0;
        class109.field2557 = 0;
        class154.field3516 = 0;
        class137.field3177 = 0;
        class77.field1816 = 0;
        class66.field1528 = 0;
        class82.field1912 = 0;
        class118.field2818 = 0;
        class47.field1113 = 0;
        class8.field133 = 0;
        class84.field1974 = 0;
        class8.field156 = 0;
        class30.field576 = 0;
        class31.field599 = 0;
        class82.field1887 = 0;
        class62.field1402 = 0;
        class4.field80 = 0;
        class117.field2779 = 0;
        class82.field1894 = 0;
        class14.field232 = 0;
        class45.field1048 = 0;
        class114.field2661 = 0;
        class115.field2691 = 0;
        class32.field679 = 0;
        class30.field566 = 0;
        class115.field2728 = 0;
        class52.field1187 = 0;
        class11.field175 = 0;
        class61.field1346 = 0;
        client.field393 = 0;
        class47.field1106 = 0;
        class32.field678 = 0;
        class32.field664 = 0;
        class27.field492 = 0;
        class27.field486 = 0;
        class53.field1208 = 0;
        class41.field965 = 0;
        class82.field1901 = 0;
        class102.field2394 = 0;
        class102.field2401 = 0;
        class57.field1332 = 0;
        class56.field1299 = 0;
        class114.field2659 = 0;
        class5.field86 = 0;
        class125.field2911 = 0;
        class152.field3478 = 0;
        class4.field60 = 0;
        class48.field1129 = 0;
        class32.field667 = 0;
        class102.field2386 = 0;
        class72.field1695 = 0;
        class17.field341 = 0;
        class159.field3656 = 0;
        class132.field3023 = 0;
        class32.field647 = 0;
        class14.field247 = 0;
        class81.field1876 = 0;
        class152.field3476 = 0;
        class53.field1228 = 0;
        class91.field2097 = 0;
        class37.field885 = 0;
        class115.field2734 = 0;
        class135.field3143 = 0;
        class147.field3337 = 0;
        class66.field1565 = 0;
        class132.field3027 = 0;
        class97.field2210 = 0;
        class147.field3356 = 0;
        class15.field275 = 0;
        class63.field1450 = 0;
        class66.field1567 = 0;
        class82.field1880 = 0;
        field2966 = 0;
        class85.field1998 = 0;
        class66.field1547 = 0;
        class133.field3091 = 0;
        client.field385 = 0;
        class57.field1321 = 0;
        class97.field2189 = 0;
        class15.field271 = 0;
        class66.field1523 = 0;
        class12.field197 = 0;
        class43.field994 = 0;
        class82.field1916 = 0;
        class43.field1012 = 0;
        class117.field2806 = 0;
        class109.field2562 = 0;
        class157.field3589 = 0;
        class30.field560 = 0;
        class66.field1524 = 0;
        class13.field211 = 0;
        class149.field3390 = 0;
        class17.field339 = 0;
        class66.field1527 = 0;
        class97.field2202 = 0;
        class147.field3338 = 0;
        class66.field1578 = 0;
        class149.field3394 = 0;
        class68.field1598 = 0;
        class32.field645 = 0;
        class43.field995 = 0;
        class131.field3015 = 0;
        class154.field3517 = 0;
        class41.field950 = 0;
        class152.field3507 = 0;
        class80.field1840 = 0;
        class65.field1499 = 0;
        class157.field3582 = 0;
        class140.field3215 = 0;
        class54.field1278 = 0;
        class20.field367 = 0;
        class156.field3573 = 0;
        class15.field284 = 0;
        client.field395 = 0;
        class15.field298 = 0;
        class43.field987 = 0;
        class15.field278 = 0;
        class38.field905 = 0;
        class97.field2215 = 0;
        class32.field634 = 0;
        class157.field3587 = 0;
        class12.field196 = 0;
        class91.field2078 = 0;
        class43.field1009 = 0;
        class61.field1347 = 0;
        class115.field2763 = 0;
        class107.field2540 = 0;
        class82.field1890 = 0;
        class62.field1409 = 0;
        class28.field517 = 0;
        class77.field1809 = 0;
        class32.field654 = 0;
        class30.field586 = 0;
        class71.field1684 = 0;
        class121.field2875 = 0;
        class31.field603 = 0;
        class110.field2578 = 0;
        class43.field988 = 0;
        class114.field2673 = 0;
        class91.field2086 = 0;
        class47.field1103 = 0;
        class88.field2046 = 0;
        class136.field3162 = 0;
        class71.field1671 = 0;
        class53.field1230 = 0;
        class32.field653 = 0;
        class94.field2168 = 0;
        class117.field2801 = 0;
        class53.field1231 = 0;
        class66.field1535 = 0;
        class158.field3613 = 0;
        class62.field1378 = 0;
        class151.field3460 = 0;
        class66.field1536 = 0;
        class17.field337 = 0;
        class44.field1044 = 0;
        class84.field1973 = 0;
        class146.field3311 = 0;
        class2.field22 = 0;
        class3.field31 = 0;
        field2971 = 0;
        class109.field2552 = 0;
        class52.field1190 = 0;
        class117.field2788 = 0;
        client.field381 = 0;
        class62.field1388 = 0;
        class32.field643 = 0;
        class121.field2869 = 0;
        class12.field200 = 0;
        class82.field1905 = 0;
        class68.field1597 = 0;
        class132.field3022 = 0;
        class80.field1842 = 0;
        class30.field544 = 0;
        class97.field2207 = 0;
        class39.field934 = 0;
        class109.field2560 = 0;
        class112.field2615 = 0;
        class109.field2551 = 0;
        class66.field1583 = 0;
        class8.field138 = 0;
        class144.field3290 = 0;
        class145.field3305 = 0;
        class74.field1737 = 0;
        class14.field246 = 0;
        class5.field104 = 0;
        class31.field613 = 0;
        class132.field3026 = 0;
        class106.field2509 = 0;
        class32.field623 = 0;
        class111.field2595 = 0;
        class32.field640 = 0;
        class44.field1031 = 0;
        class53.field1225 = 0;
        class112.field2626 = 0;
        class53.field1192 = 0;
        class64.field1479 = 0;
        class80.field1847 = 0;
        class111.field2594 = 0;
        class91.field2099 = 0;
        class30.field577 = 0;
        class43.field996 = 0;
        class14.field229 = 0;
        class44.field1023 = 0;
        class31.field596 = 0;
        class70.field1626 = 0;
        class38.field902 = 0;
        class157.field3590 = 0;
        class11.field185 = 0;
        class129.field2973 = 0;
        class66.field1532 = 0;
        class64.field1482 = 0;
        class83.field1944 = 0;
        field2943 = 0;
        class56.field1297 = 0;
        class72.field1710 = 0;
        class94.field2183 = 0;
        class94.field2178 = 0;
        class61.field1350 = 0;
        class88.field2037 = 0;
        class32.field642 = 0;
        class66.field1568 = 0;
        class70.field1629 = 0;
        class61.field1351 = 0;
        class79.field1833 = 0;
        class14.field236 = 0;
        class15.field321 = 0;
        class27.field503 = 0;
        class112.field2620 = 0;
        class30.field538 = 0;
        class47.field1104 = 0;
        class66.field1577 = 0;
        class62.field1416 = 0;
        class43.field1002 = 0;
        class32.field636 = 0;
        class66.field1582 = 0;
        class54.field1282 = 0;
        class65.field1508 = 0;
        class31.field607 = 0;
        class66.field1540 = 0;
        class52.field1188 = 0;
        class14.field240 = 0;
        class44.field1017 = 0;
        class66.field1539 = 0;
        class143.field3262 = 0;
        class53.field1202 = 0;
        class53.field1197 = 0;
        class3.field35 = 0;
        class47.field1107 = 0;
        class110.field2586 = 0;
        class63.field1469 = 0;
        class115.field2687 = 0;
        class131.field3016 = 0;
        class32.field658 = 0;
        class66.field1563 = 0;
        class66.field1552 = 0;
        class54.field1269 = 0;
        client.field387 = 0;
        class154.field3521 = 0;
        class53.field1245 = 0;
        class47.field1111 = 0;
        class36.field740 = 0;
        class32.field620 = 0;
        class152.field3496 = 0;
        class75.field1772 = 0;
        class31.field609 = 0;
        class109.field2553 = 0;
        class134.field3115 = 0;
        class30.field549 = 0;
        class130.field2989 = 0;
        class32.field669 = 0;
        class31.field602 = 0;
        class91.field2082 = 0;
        class32.field625 = 0;
        class34.field714 = 0;
        class140.field3216 = 0;
        class136.field3167 = 0;
        class144.field3292 = 0;
        class88.field2033 = 0;
        class20.field374 = 0;
        class139.field3207 = 0;
        class41.field957 = 0;
        class82.field1883 = 0;
        class30.field547 = 0;
        class61.field1348 = 0;
        class159.field3648 = 0;
        class66.field1584 = 0;
        class32.field672 = 0;
        class45.field1058 = 0;
        class142.field3244 = 0;
        class71.field1687 = 0;
        class73.field1732 = 0;
        class27.field498 = 0;
        class114.field2647 = 0;
        class28.field514 = 0;
        class15.field323 = 0;
        class92.field2107 = 0;
        class134.field3118 = 0;
        class32.field622 = 0;
        class53.field1242 = 0;
        class32.field638 = 0;
        class71.field1679 = 0;
        class61.field1354 = 0;
        class15.field277 = 0;
        class15.field290 = 0;
        class50.field1162 = 0;
        class114.field2666 = 0;
        field2940 = 0;
        class36.field758 = 0;
        class137.field3191 = 0;
        class63.field1462 = 0;
        class74.field1746 = 0;
        class14.field228 = 0;
        class15.field302 = 0;
        class32.field635 = 0;
        class31.field589 = 0;
        class32.field639 = 0;
        class82.field1908 = 0;
        class77.field1799 = 0;
        class117.field2795 = 0;
        class66.field1588 = 0;
        field2963 = 0;
        class15.field305 = 0;
        class117.field2802 = 0;
        class107.field2536 = 0;
        class103.field2416 = 0;
        class136.field3154 = 0;
        class39.field940 = 0;
        class82.field1896 = 0;
        class17.field338 = 0;
        class66.field1556 = 0;
        class39.field935 = 0;
        class157.field3593 = 0;
        class32.field676 = 0;
        class15.field283 = 0;
        class62.field1398 = 0;
        class156.field3570 = 0;
        class114.field2652 = 0;
        class37.field877 = 0;
        class33.field688 = 0;
        class13.field218 = 0;
        class41.field961 = 0;
        class47.field1102 = 0;
        class33.field681 = 0;
        class109.field2554 = 0;
        class124.field2895 = 0;
        class15.field276 = 0;
        class8.field158 = 0;
        class32.field644 = 0;
        class157.field3592 = 0;
        class146.field3315 = 0;
        class66.field1562 = 0;
        class32.field633 = 0;
        class82.field1886 = 0;
        class32.field671 = 0;
        class134.field3111 = 0;
        class136.field3163 = 0;
        class152.field3499 = 0;
        class77.field1813 = true;
        class137.field3176.field3030 = 0;
        class83.method651(arg0 + 1007765799);
        class158.field3618 = -1;
        class119.field2851 = 0;
        class34.field711 = -1;
        class34.field704 = 0;
        class56.field1295 = 0;
        class125.field2913 = 0;
        class44.field1027.field1569 = 0;
        class26.field476 = false;
        class4.field68 = 0;
        class158.field3614.field1569 = 0;
        class12.field201 = -1;
        class86.field2005 = -1;
        class75.method605(false, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class36.field833[var1] = null;
        }
        class13.field225 = (int) (Math.random() * 110.0D) - 55;
        class102.field2399 = 0;
        class62.field1405 = 0;
        class45.field1067 = 0;
        class27.field493 = (int) (Math.random() * 120.0D) - 60;
        class11.field173 = (int) (Math.random() * 80.0D) - 40;
        class133.field3069 = (int) (Math.random() * 100.0D) - 50;
        class5.field92 = -1;
        class143.field3279 = 0;
        class125.field2915 = 0;
        class133.field3056 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class31.field615 = 0;
        class4.field72 = 0;
        class29.field527 = (int) (Math.random() * 30.0D) - 20;
        class151.field3470 = false;
        class23.field423 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class52.field1176[var2] = null;
            class143.field3264[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class14.field230[var3] = null;
        }
        class20.field373 = class52.field1176[2047] = new class70();
        class88.field2040.method1206((byte) -19);
        class157.field3596.method1206((byte) -19);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class23.field397[var4][var11][var12] = null;
                }
            }
        }
        class45.field1077 = new class157();
        class2.field20 = 0;
        class61.field1357 = 0;
        for (int var5 = 0; var5 < class61.field1362; var5++) {
            class61 var10 = class56.method441(16, var5);
            if (var10 != null && var10.field1352 == 0) {
                class14.field238[var5] = 0;
                class27.field504[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class79.field1832.length; var6++) {
            class79.field1832[var6] = -1;
        }
        if (class13.field220 != -1) {
            class117.method928((byte) 117, class13.field220);
        }
        for (class144 var7 = (class144) class109.field2573.method1205((byte) 88); var7 != null; var7 = (class144) class109.field2573.method1201(125)) {
            class134.method1023(true, (byte) -75, var7);
        }
        class13.field220 = -1;
        class109.field2573 = new class156(8);
        class50.field1159 = null;
        class119.field2851 = 0;
        class26.field476 = false;
        class61.field1361.method232(new int[5], -1, null, false, (byte) -103);
        for (int var8 = 0; var8 < 8; var8++) {
            class38.field915[var8] = null;
            class44.field1043[var8] = false;
        }
        class71.method587(32);
        class88.field2034 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class145.field3299[var9] = true;
        }
        class131.field3012 = null;
        class158.field3638 = 0;
        class111.field2611 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBII)V")
    public final void method996(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2963++;
        if (!this.field2946) {
            double var6 = (double) (arg1 - this.field2969);
            double var8 = (double) (arg0 - this.field2939);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2951 = (double) this.field2968 * var6 / var10 + (double) this.field2969;
            this.field2954 = this.field2933;
            this.field2953 = (double) this.field2968 * var8 / var10 + (double) this.field2939;
        }
        double var12 = (double) (this.field2950 + 1 - arg3);
        this.field2958 = ((double) arg1 - this.field2951) / var12;
        this.field2935 = ((double) arg0 - this.field2953) / var12;
        this.field2961 = Math.sqrt(this.field2958 * this.field2958 + this.field2935 * this.field2935);
        if (!this.field2946) {
            this.field2948 = -this.field2961 * Math.tan((double) this.field2947 * 0.02454369D);
        }
        int var14 = -104 / ((arg2 - 35) / 42);
        this.field2936 = ((double) arg4 - this.field2954 - this.field2948 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2968 = arg8;
        this.field2939 = arg3;
        this.field2937 = arg1;
        this.field2933 = arg4;
        this.field2962 = arg9;
        this.field2947 = arg7;
        this.field2955 = arg0;
        this.field2965 = arg5;
        this.field2950 = arg6;
        this.field2946 = false;
        this.field2969 = arg2;
        this.field2934 = arg10;
        int var12 = class38.method317(this.field2955, 126).field3098;
        if (var12 == -1) {
            this.field2960 = null;
        } else {
            this.field2960 = class97.method762((byte) 97, var12);
        }
    }
}
