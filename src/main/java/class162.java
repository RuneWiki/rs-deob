import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class162 {

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lmf;")
    private class113 field3252 = new class113();

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lg;")
    private class55 field3258 = new class55();

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Ldh;")
    private class36 field3261;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[[S")
    public static short[][] field3245 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lsa;")
    public static class162 field3248 = new class162(64);

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lcd;")
    private static class23 field3254 = class54.method414("Loading sprites )2 ", -1);

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lcd;")
    public static class23 field3255 = field3254;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ldd;")
    public static class32 field3251;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lmf;JI)V")
    public final void method990(class113 arg0, long arg1, int arg2) {
        int var5 = -88 / ((-arg2 - 78) / 34);
        if (this.field3259 == 0) {
            class113 var6 = this.field3258.method430((byte) -74);
            var6.method1018(15789);
            var6.method724(true);
            if (this.field3252 == var6) {
                class113 var7 = this.field3258.method430((byte) -60);
                var7.method1018(15789);
                var7.method724(true);
            }
        } else {
            this.field3259--;
        }
        field3243++;
        this.field3261.method262(arg1, -128, arg0);
        this.field3258.method433((byte) -108, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
    public static final void method991(int arg0, int arg1, byte arg2) {
        field3241++;
        if (class82.method556(arg0, (byte) -7)) {
            class40.method327(class100.field2114[arg0], arg2 ^ 0xD, arg1);
            if (arg2 != 12) {
                method993(-76, -98, -65, null, -17, null, 12);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)I")
    public static final int method992(byte arg0, int arg1, int arg2) {
        field3257++;
        if (arg0 < 16) {
            field3251 = null;
        }
        long var3 = (long) ((arg2 << 16) + arg1);
        return class157.field3131 != null && class157.field3131.field3317 == var3 ? class10.field202.field3752 * 99 / (class10.field202.field3753.length - class157.field3131.field2349) + 1 : 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILcd;ILcd;I)V")
    public static final void method993(int arg0, int arg1, int arg2, class23 arg3, int arg4, class23 arg5, int arg6) {
        field3247++;
        if (class134.field2786 || (arg4 != 6349 || class49.field1171 >= 500)) {
            return;
        }
        class88.field1876[class49.field1171] = arg3;
        class81.field1771[class49.field1171] = arg5;
        class103.field2201[class49.field1171] = arg2;
        class28.field615[class49.field1171] = arg0;
        class202.field3986[class49.field1171] = arg6;
        class177.field3524[class49.field1171] = arg1;
        class49.field1171++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lse;")
    public final class166 method994(byte arg0) {
        if (arg0 < 82) {
            this.method990(null, -124L, -83);
        }
        field3246++;
        return this.field3261.method264(50);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)Lmf;")
    public final class113 method995(int arg0, long arg1) {
        int var4 = -14 / ((40 - arg0) / 61);
        class113 var5 = (class113) this.field3261.method260(arg1, (byte) 28);
        if (var5 != null) {
            this.field3258.method433((byte) -82, var5);
        }
        field3262++;
        return var5;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IJ)V")
    public final void method996(int arg0, long arg1) {
        field3253++;
        class113 var4 = (class113) this.field3261.method260(arg1, (byte) 28);
        if (var4 != null) {
            var4.method1018(15789);
            var4.method724(true);
            this.field3259++;
        }
        if (arg0 != 0) {
            method1000(-63);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public final void method997(boolean arg0) {
        field3242++;
        while (true) {
            class113 var2 = this.field3258.method430((byte) -48);
            if (var2 == null) {
                this.field3259 = this.field3260;
                if (arg0) {
                    this.field3261 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1018(15789);
            var2.method724(true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lse;")
    public final class166 method998(byte arg0) {
        if (arg0 == -37) {
            field3250++;
            return this.field3261.method259(-87);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public static final int method999(int arg0, int arg1, int arg2) {
        field3249++;
        if (arg0 != -24285) {
            field3255 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method1000(int arg0) {
        field3244++;
        class104.field2219 = true;
        class15.field337.field3982 = 0;
        class39.field795 = 0;
        class65.field1540 = true;
        class48.field1158 = 0;
        class64.field1533 = 0;
        class62.field1432 = 0;
        class189.field3696 = 0;
        class165.field3287 = 0;
        class163.field3269 = 0;
        class86.field1845 = 0;
        class34.field695 = 0;
        class131.field2708 = 0;
        class6.field117 = 0;
        class102.field2169 = 0;
        class72.field1641 = 0;
        class25.field533 = 0;
        class157.field3128 = 0;
        class101.field2160 = 0;
        class54.field1279 = 0;
        class141.field2899 = 0;
        class39.field797 = 0;
        class189.field3729 = 0;
        class73.field1667 = 0;
        class182.field3593 = 0;
        class189.field3710 = 0;
        class85.field1806 = 0;
        class63.field1457 = 0;
        class199.field3932 = 0;
        class85.field1822 = 0;
        class97.field2046 = 0;
        class117.field2438 = 0;
        class1.field2 = 0;
        class153.field3070 = 0;
        class94.field1969 = 0;
        class23.field506 = 0;
        class47.field1023 = 0;
        class17.field369 = 0;
        class101.field2164 = 0;
        class41.field882 = 0;
        class2.field21 = 0;
        class23.field468 = 0;
        class74.field1684 = 0;
        class23.field486 = 0;
        class132.field2729 = 0;
        class168.field3356 = 0;
        class182.field3597 = 0;
        class189.field3706 = 0;
        class13.field294 = 0;
        field3262 = 0;
        class8.field157 = 0;
        class167.field3333 = 0;
        class23.field494 = 0;
        class51.field1209 = 0;
        class55.field1291 = 0;
        class186.field3632 = 0;
        class151.field3011 = 0;
        class25.field553 = 0;
        class73.field1659 = 0;
        class23.field470 = 0;
        class19.field405 = 0;
        class47.field1145 = 0;
        class30.field648 = 0;
        class97.field2044 = 0;
        class57.field1322 = 0;
        class159.field3183 = 0;
        field3257 = 0;
        class85.field1827 = 0;
        class199.field3924 = 0;
        class54.field1276 = 0;
        class194.field3824 = 0;
        class25.field540 = 0;
        class186.field3631 = 0;
        class2.field27 = 0;
        class189.field3722 = 0;
        class172.field3410 = 0;
        class193.field3819 = 0;
        class40.field857 = 0;
        class194.field3845 = 0;
        class189.field3737 = 0;
        class141.field2901 = 0;
        class98.field2096 = 0;
        class180.field3564 = 0;
        class39.field806 = 0;
        class31.field667 = 0;
        class114.field2397 = 0;
        class73.field1669 = 0;
        class168.field3344 = 0;
        class97.field2035 = 0;
        class104.field2226 = 0;
        class82.field1775 = 0;
        class116.field2420 = 0;
        class97.field2078 = 0;
        class120.field2498 = 0;
        class47.field1138 = 0;
        class141.field2902 = 0;
        class152.field3036 = 0;
        class199.field3938 = 0;
        class201.field3979 = 0;
        class17.field380 = 0;
        class29.field623 = 0;
        class189.field3740 = 0;
        class117.field2437 = 0;
        class110.field2334 = 0;
        class199.field3911 = 0;
        class17.field365 = 0;
        class139.field2869 = 0;
        class58.field1352 = 0;
        class12.field275 = 0;
        class165.field3289 = 0;
        class194.field3835 = 0;
        class189.field3759 = 0;
        class58.field1367 = 0;
        class199.field3904 = 0;
        class4.field40 = 0;
        class97.field2060 = 0;
        class63.field1452 = 0;
        class135.field2803 = 0;
        client.field582 = 0;
        class60.field1395 = 0;
        class81.field1765 = 0;
        class143.field2931 = 0;
        class138.field2851 = 0;
        class16.field351 = 0;
        class60.field1394 = 0;
        class68.field1590 = 0;
        class97.field2050 = 0;
        class205.field4035 = 0;
        class193.field3820 = 0;
        class39.field799 = 0;
        class128.field2669 = 0;
        class23.field510 = 0;
        class129.field2682 = 0;
        class55.field1302 = 0;
        class199.field3880 = 0;
        class42.field893 = 0;
        class25.field546 = 0;
        class17.field382 = 0;
        class116.field2417 = 0;
        class189.field3754 = 0;
        class107.field2294 = 0;
        class81.field1752 = 0;
        class85.field1826 = 0;
        class7.field136 = 0;
        class175.field3480 = 0;
        class129.field2689 = 0;
        class17.field352 = 0;
        class63.field1505 = 0;
        class28.field594 = 0;
        class64.field1514 = 0;
        class36.field729 = 0;
        class189.field3731 = 0;
        class179.field3542 = 0;
        class115.field2406 = 0;
        class184.field3614 = 0;
        class47.field1062 = 0;
        class134.field2779 = 0;
        class31.field661 = 0;
        class159.field3182 = 0;
        class189.field3719 = 0;
        class8.field154 = 0;
        class189.field3748 = 0;
        class85.field1818 = 0;
        class81.field1761 = 0;
        class176.field3506 = 0;
        client.field587 = 0;
        class199.field3877 = 0;
        class85.field1817 = 0;
        class66.field1552 = 0;
        class155.field3104 = 0;
        field3253 = 0;
        class104.field2244 = 0;
        class190.field3764 = 0;
        class169.field3380 = 0;
        class168.field3347 = 0;
        class68.field1586 = 0;
        class97.field2040 = 0;
        class95.field2002 = 0;
        class97.field2055 = 0;
        class166.field3314 = 0;
        class133.field2755 = 0;
        class104.field2231 = 0;
        class112.field2359 = 0;
        class139.field2871 = 0;
        class189.field3711 = 0;
        class19.field408 = 0;
        class94.field1981 = 0;
        class180.field3562 = 0;
        class160.field3200 = 0;
        class44.field921 = 0;
        class47.field1089 = 0;
        class54.field1285 = 0;
        class17.field359 = 0;
        class156.field3121 = 0;
        class63.field1480 = 0;
        class145.field2970 = 0;
        class54.field1280 = 0;
        class189.field3701 = 0;
        class88.field1887 = 0;
        class181.field3586 = 0;
        class165.field3284 = 0;
        field3246 = 0;
        client.field588 = 0;
        class86.field1843 = 0;
        class85.field1808 = 0;
        class54.field1286 = 0;
        class108.field2303 = 0;
        class145.field2963 = 0;
        class72.field1639 = 0;
        class189.field3703 = 0;
        class189.field3732 = 0;
        class131.field2707 = 0;
        class103.field2196 = 0;
        class143.field2928 = 0;
        class66.field1559 = 0;
        class68.field1604 = 0;
        class167.field3329 = 0;
        class139.field2858 = 0;
        class74.field1682 = 0;
        class72.field1645 = 0;
        class178.field3532 = 0;
        class36.field733 = 0;
        class139.field2862 = 0;
        class79.field1727 = 0;
        class85.field1799 = 0;
        class3.field34 = 0;
        class199.field3883 = 0;
        class9.field180 = 0;
        class157.field3153 = 0;
        class189.field3695 = 0;
        class48.field1153 = 0;
        class202.field3983 = 0;
        class39.field796 = 0;
        class23.field476 = 0;
        class102.field2173 = 0;
        class97.field2041 = 0;
        class79.field1732 = 0;
        class199.field3931 = 0;
        class85.field1804 = 0;
        class54.field1265 = 0;
        class136.field2817 = 0;
        class75.field1709 = 0;
        class189.field3720 = 0;
        class7.field133 = 0;
        class157.field3133 = 0;
        class58.field1354 = 0;
        class135.field2804 = 0;
        class121.field2519 = 0;
        class58.field1374 = 0;
        class101.field2155 = 0;
        class23.field475 = 0;
        class102.field2183 = 0;
        class189.field3708 = 0;
        class41.field861 = 0;
        class78.field1723 = 0;
        class100.field2106 = 0;
        class100.field2105 = 0;
        class85.field1819 = 0;
        class4.field41 = 0;
        class96.field2024 = 0;
        class189.field3713 = 0;
        class36.field721 = 0;
        class191.field3792 = 0;
        class51.field1218 = 0;
        class199.field3925 = 0;
        class9.field171 = 0;
        class145.field2958 = 0;
        class160.field3197 = 0;
        class74.field1687 = 0;
        class53.field1246 = 0;
        class113.field2384 = 0;
        class47.field1057 = 0;
        class190.field3778 = 0;
        class161.field3224 = 0;
        class96.field2032 = 0;
        class133.field2745 = 0;
        class199.field3939 = 0;
        class117.field2433 = 0;
        class176.field3505 = 0;
        class65.field1543 = 0;
        class85.field1820 = 0;
        class70.field1627 = 0;
        class8.field170 = 0;
        class96.field2029 = 0;
        class68.field1601 = 0;
        class120.field2496 = 0;
        class193.field3813 = 0;
        class199.field3928 = 0;
        class200.field3956 = 0;
        class17.field366 = 0;
        class105.field2273 = 0;
        class94.field1988 = 0;
        class85.field1807 = 0;
        class4.field53 = 0;
        class116.field2415 = 0;
        class48.field1154 = 0;
        class161.field3220 = 0;
        class47.field1005 = 0;
        class63.field1493 = 0;
        class4.field44 = 0;
        class31.field671 = 0;
        class23.field478 = 0;
        class81.field1759 = 0;
        class103.field2189 = 0;
        class34.field696 = 0;
        class179.field3547 = 0;
        class193.field3807 = 0;
        class36.field730 = 0;
        class86.field1846 = 0;
        class47.field1101 = 0;
        field3256 = 0;
        class109.field2309 = 0;
        class96.field2022 = 0;
        class60.field1397 = 0;
        class86.field1848 = 0;
        class112.field2358 = 0;
        class199.field3879 = 0;
        class39.field793 = 0;
        class146.field2980 = 0;
        class67.field1573 = 0;
        class27.field559 = 0;
        class28.field604 = 0;
        class44.field926 = 0;
        class63.field1472 = 0;
        class145.field2959 = 0;
        class81.field1753 = 0;
        class51.field1205 = 0;
        class54.field1282 = 0;
        class66.field1555 = 0;
        class85.field1803 = 0;
        class175.field3488 = 0;
        class160.field3195 = 0;
        class109.field2312 = 0;
        class31.field672 = 0;
        class133.field2741 = 0;
        class100.field2110 = 0;
        class205.field4037 = 0;
        class189.field3707 = 0;
        class104.field2245 = 0;
        class49.field1179 = 0;
        class47.field1079 = 0;
        class152.field3046 = 0;
        class53.field1247 = 0;
        class53.field1255 = 0;
        class30.field654 = 0;
        class73.field1670 = 0;
        class177.field3510 = 0;
        class104.field2216 = 0;
        class57.field1344 = 0;
        class43.field906 = 0;
        class31.field662 = 0;
        class189.field3757 = 0;
        class201.field3969 = 0;
        class181.field3580 = 0;
        class199.field3933 = 0;
        class117.field2440 = 0;
        class199.field3888 = 0;
        class13.field289 = 0;
        class175.field3484 = 0;
        class204.field4019 = 0;
        class23.field495 = 0;
        class15.field331 = 0;
        class89.field1918 = 0;
        class50.field1194 = 0;
        class79.field1726 = 0;
        class189.field3697 = 0;
        class190.field3774 = 0;
        class133.field2743 = 0;
        class199.field3917 = 0;
        class114.field2387 = 0;
        class157.field3126 = 0;
        class186.field3633 = 0;
        class85.field1829 = 0;
        class30.field646 = 0;
        class28.field593 = 0;
        class178.field3529 = 0;
        class191.field3788 = 0;
        class14.field311 = 0;
        class134.field2759 = 0;
        class200.field3959 = 0;
        class175.field3477 = 0;
        class88.field1882 = 0;
        class194.field3827 = 0;
        class68.field1600 = 0;
        class94.field1966 = 0;
        class184.field3621 = 0;
        class53.field1254 = 0;
        class158.field3166 = 0;
        class179.field3541 = 0;
        class152.field3042 = 0;
        class97.field2069 = 0;
        class189.field3736 = 0;
        class189.field3745 = 0;
        class88.field1872 = 0;
        class189.field3741 = 0;
        class25.field548 = 0;
        class105.field2279 = 0;
        class189.field3739 = 0;
        class80.field1747 = 0;
        class199.field3905 = 0;
        class168.field3355 = 0;
        class182.field3602 = 0;
        class101.field2158 = 0;
        client.field580 = 0;
        class151.field3017 = 0;
        class51.field1212 = 0;
        class53.field1256 = 0;
        class104.field2257 = 0;
        class36.field727 = 0;
        class134.field2760 = 0;
        class121.field2506 = 0;
        class156.field3118 = 0;
        class155.field3098 = 0;
        class23.field479 = 0;
        class194.field3840 = 0;
        class4.field68 = 0;
        class15.field332 = 0;
        class54.field1289 = 0;
        class189.field3734 = 0;
        class70.field1631 = 0;
        class85.field1823 = 0;
        class186.field3643 = 0;
        class96.field2027 = 0;
        class40.field860 = 0;
        class55.field1298 = 0;
        class133.field2740 = 0;
        class50.field1196 = 0;
        class167.field3332 = 0;
        class39.field789 = 0;
        class145.field2972 = 0;
        class66.field1562 = 0;
        class12.field234 = 0;
        class80.field1746 = 0;
        class111.field2345 = 0;
        class66.field1558 = 0;
        class6.field109 = 0;
        class51.field1202 = 0;
        class85.field1824 = 0;
        class199.field3906 = 0;
        class133.field2752 = 0;
        class179.field3555 = 0;
        class74.field1706 = 0;
        class199.field3890 = 0;
        class152.field3045 = 0;
        class36.field734 = 0;
        class54.field1287 = 0;
        class122.field2524 = 0;
        class85.field1816 = 0;
        class199.field3929 = 0;
        class28.field599 = 0;
        class104.field2253 = 0;
        class134.field2762 = 0;
        class200.field3950 = 0;
        class6.field110 = 0;
        class97.field2064 = 0;
        class82.field1777 = 0;
        class175.field3482 = 0;
        class104.field2215 = 0;
        class39.field800 = 0;
        class155.field3107 = 0;
        class199.field3941 = 0;
        class181.field3584 = 0;
        class159.field3171 = 0;
        client.field583 = 0;
        class167.field3336 = 0;
        class58.field1364 = 0;
        class64.field1517 = 0;
        class15.field324 = 0;
        class157.field3140 = 0;
        class35.field714 = 0;
        class57.field1327 = 0;
        class36.field738 = 0;
        class23.field477 = 0;
        class165.field3303 = 0;
        class9.field182 = 0;
        class85.field1810 = 0;
        class94.field1961 = 0;
        class64.field1528 = 0;
        class152.field3037 = 0;
        class17.field375 = 0;
        class30.field649 = 0;
        class94.field1987 = 0;
        class27.field563 = 0;
        class202.field3997 = 0;
        class136.field2813 = 0;
        class101.field2161 = 0;
        class41.field886 = 0;
        class63.field1460 = 0;
        class34.field704 = 0;
        class85.field1812 = 0;
        class74.field1692 = 0;
        class74.field1704 = 0;
        class63.field1502 = 0;
        class67.field1571 = 0;
        class159.field3174 = 0;
        class102.field2172 = 0;
        class115.field2401 = 0;
        class39.field804 = 0;
        class194.field3826 = 0;
        class155.field3111 = 0;
        class40.field858 = 0;
        class28.field596 = 0;
        class95.field2001 = 0;
        class50.field1193 = 0;
        class117.field2442 = 0;
        class103.field2191 = 0;
        class121.field2508 = 0;
        class25.field530 = 0;
        class74.field1697 = 0;
        class157.field3132 = 0;
        class169.field3370 = 0;
        class51.field1219 = 0;
        class199.field3923 = 0;
        class193.field3822 = 0;
        class114.field2394 = 0;
        class172.field3424 = 0;
        class193.field3818 = 0;
        class42.field897 = 0;
        class172.field3418 = 0;
        class64.field1523 = 0;
        class199.field3882 = 0;
        class25.field542 = 0;
        class205.field4034 = 0;
        class115.field2399 = 0;
        class156.field3117 = 0;
        class42.field899 = 0;
        class58.field1373 = 0;
        class97.field2074 = 0;
        class112.field2369 = 0;
        class151.field3014 = 0;
        class199.field3893 = 0;
        class109.field2317 = 0;
        class202.field3999 = 0;
        class23.field490 = 0;
        class189.field3709 = 0;
        class114.field2398 = 0;
        class10.field189 = 0;
        class25.field544 = 0;
        class96.field2033 = 0;
        class139.field2865 = 0;
        class20.field417 = 0;
        class97.field2065 = 0;
        class190.field3771 = 0;
        class138.field2846 = 0;
        class72.field1637 = 0;
        class184.field3615 = 0;
        class109.field2321 = 0;
        class4.field74 = 0;
        class35.field719 = 0;
        class189.field3724 = 0;
        class199.field3891 = 0;
        class141.field2904 = 0;
        class36.field732 = 0;
        class23.field465 = 0;
        class25.field536 = 0;
        class23.field466 = 0;
        class177.field3527 = 0;
        class86.field1838 = 0;
        class31.field663 = 0;
        class64.field1521 = 0;
        class75.field1710 = 0;
        class10.field201 = 0;
        class166.field3318 = 0;
        class9.field173 = 0;
        class4.field50 = 0;
        client.field573 = 0;
        class3.field29 = 0;
        class132.field2730 = 0;
        class57.field1325 = 0;
        class14.field307 = 0;
        class110.field2333 = 0;
        class23.field508 = 0;
        class91.field1941 = 0;
        class63.field1456 = 0;
        class168.field3345 = 0;
        class178.field3533 = 0;
        class154.field3079 = 0;
        class205.field4025 = 0;
        class27.field560 = 0;
        class157.field3142 = 0;
        class89.field1923 = 0;
        class49.field1184 = 0;
        class8.field155 = 0;
        class183.field3605 = 0;
        class79.field1731 = 0;
        class141.field2905 = 0;
        class75.field1715 = 0;
        class94.field1980 = 0;
        class168.field3340 = 0;
        class7.field121 = 0;
        class17.field377 = 0;
        class3.field30 = 0;
        class111.field2344 = 0;
        class39.field803 = 0;
        class69.field1624 = 0;
        class172.field3411 = 0;
        class17.field373 = 0;
        class203.field4012 = 0;
        class186.field3637 = 0;
        class2.field16 = 0;
        class180.field3567 = 0;
        class132.field2736 = 0;
        class165.field3301 = 0;
        class55.field1295 = 0;
        field3241 = 0;
        class68.field1596 = 0;
        class97.field2039 = 0;
        class199.field3885 = 0;
        class121.field2520 = 0;
        class189.field3750 = 0;
        class202.field3992 = 0;
        class191.field3793 = 0;
        class8.field160 = 0;
        class82.field1778 = 0;
        class133.field2747 = 0;
        class23.field489 = 0;
        class110.field2326 = 0;
        class203.field4008 = 0;
        class189.field3751 = 0;
        class40.field856 = 0;
        class4.field54 = 0;
        class97.field2042 = 0;
        class119.field2476 = 0;
        class14.field306 = 0;
        class91.field1946 = 0;
        class7.field119 = 0;
        class85.field1800 = 0;
        class189.field3755 = 0;
        class194.field3844 = 0;
        class189.field3718 = 0;
        class51.field1208 = 0;
        class23.field505 = 0;
        class136.field2812 = 0;
        class138.field2855 = 0;
        class74.field1689 = 0;
        class189.field3730 = 0;
        class94.field1965 = 0;
        class186.field3640 = 0;
        class174.field3450 = 0;
        class17.field362 = 0;
        class60.field1390 = 0;
        class175.field3493 = 0;
        class89.field1919 = 0;
        class29.field644 = 0;
        class17.field358 = 0;
        class200.field3961 = 0;
        class152.field3038 = 0;
        class122.field2526 = 0;
        class193.field3816 = 0;
        class7.field120 = 0;
        class199.field3936 = 0;
        class25.field535 = 0;
        class31.field680 = 0;
        class141.field2898 = 0;
        class17.field357 = 0;
        class131.field2722 = 0;
        class39.field792 = 0;
        class19.field410 = 0;
        class170.field3393 = 0;
        class51.field1204 = 0;
        class54.field1271 = 0;
        client.field579 = 0;
        class1.field5 = 0;
        class189.field3699 = 0;
        class64.field1511 = 0;
        class23.field484 = 0;
        class203.field4010 = 0;
        class54.field1268 = 0;
        class10.field187 = 0;
        class57.field1342 = 0;
        class12.field281 = 0;
        class166.field3320 = 0;
        class53.field1249 = 0;
        class15.field335 = 0;
        class48.field1166 = 0;
        class23.field469 = 0;
        class199.field3935 = 0;
        class28.field598 = 0;
        class167.field3338 = 0;
        field3249 = 0;
        class63.field1462 = 0;
        class157.field3130 = 0;
        class9.field179 = 0;
        class52.field1240 = 0;
        class23.field500 = 0;
        class4.field58 = 0;
        class121.field2513 = 0;
        client.field586 = 0;
        class159.field3186 = 0;
        class66.field1551 = 0;
        class60.field1388 = 0;
        class152.field3040 = 0;
        class29.field630 = 0;
        class146.field2986 = 0;
        class49.field1189 = 0;
        class107.field2293 = 0;
        class97.field2076 = 0;
        class202.field3996 = 0;
        class113.field2373 = 0;
        class124.field2543 = 0;
        class82.field1781 = 0;
        class23.field496 = 0;
        class138.field2844 = 0;
        class102.field2178 = 0;
        class97.field2071 = 0;
        class189.field3733 = 0;
        class200.field3960 = 0;
        class22.field457 = 0;
        class133.field2749 = 0;
        class58.field1351 = 0;
        class180.field3560 = 0;
        class6.field115 = 0;
        class23.field482 = 0;
        class191.field3785 = 0;
        class81.field1758 = 0;
        class85.field1809 = 0;
        class112.field2368 = 0;
        class97.field2059 = 0;
        class43.field908 = 0;
        class47.field1059 = 0;
        class85.field1825 = 0;
        class34.field700 = 0;
        field3242 = 0;
        class165.field3296 = 0;
        class132.field2727 = 0;
        class51.field1224 = 0;
        class110.field2331 = 0;
        class29.field635 = 0;
        class175.field3485 = 0;
        class68.field1594 = 0;
        class5.field90 = 0;
        class204.field4016 = 0;
        class200.field3963 = 0;
        class25.field541 = 0;
        class200.field3962 = 0;
        class12.field240 = 0;
        class81.field1767 = 0;
        class109.field2313 = 0;
        class23.field502 = 0;
        class61.field1413 = 0;
        class49.field1178 = 0;
        class85.field1811 = 0;
        class5.field101 = 0;
        class131.field2712 = 0;
        class132.field2728 = 0;
        class172.field3416 = 0;
        class23.field513 = 0;
        class186.field3641 = 0;
        class104.field2230 = 0;
        class134.field2775 = 0;
        class68.field1609 = 0;
        class113.field2379 = 0;
        class161.field3234 = 0;
        class7.field137 = 0;
        class155.field3106 = 0;
        class48.field1167 = 0;
        class96.field2020 = 0;
        class56.field1307 = 0;
        class36.field737 = 0;
        class10.field198 = 0;
        if (arg0 < 121) {
            method1001(79);
        }
        class49.field1185 = 0;
        class112.field2361 = 0;
        class35.field707 = 0;
        class85.field1805 = 0;
        class80.field1744 = 0;
        class189.field3738 = 0;
        class60.field1389 = 0;
        class160.field3201 = 0;
        class165.field3304 = 0;
        class165.field3282 = 0;
        class203.field4007 = 0;
        class17.field355 = 0;
        class146.field2979 = 0;
        class163.field3271 = 0;
        class205.field4030 = 0;
        class172.field3422 = 0;
        class8.field153 = 0;
        class23.field481 = 0;
        class97.field2047 = 0;
        class57.field1343 = 0;
        class115.field2405 = 0;
        class47.field1103 = 0;
        class176.field3507 = 0;
        class158.field3165 = 0;
        class190.field3765 = 0;
        class144.field2937 = 0;
        class2.field17 = 0;
        class194.field3839 = 0;
        class13.field291 = 0;
        class10.field191 = 0;
        class7.field124 = 0;
        class122.field2523 = 0;
        class170.field3382 = 0;
        class14.field316 = 0;
        class81.field1757 = 0;
        class36.field725 = 0;
        class53.field1245 = 0;
        class172.field3413 = 0;
        class58.field1361 = 0;
        class184.field3618 = 0;
        class53.field1260 = 0;
        class54.field1283 = 0;
        field3244 = 0;
        client.field578 = 0;
        class199.field3892 = 0;
        class158.field3163 = 0;
        class36.field735 = 0;
        class96.field2023 = 0;
        class154.field3094 = 0;
        class97.field2066 = 0;
        class177.field3509 = 0;
        class117.field2423 = 0;
        class62.field1429 = 0;
        class16.field349 = 0;
        class103.field2197 = 0;
        class169.field3371 = 0;
        class169.field3374 = 0;
        class25.field543 = 0;
        class136.field2816 = 0;
        class91.field1942 = 0;
        class104.field2203 = 0;
        class190.field3776 = 0;
        class174.field3452 = 0;
        class54.field1270 = 0;
        class55.field1292 = 0;
        class74.field1677 = 0;
        class138.field2853 = 0;
        class1.field9 = 0;
        client.field576 = 0;
        class16.field345 = 0;
        class160.field3199 = 0;
        class29.field637 = 0;
        class174.field3462 = 0;
        class124.field2537 = 0;
        class65.field1534 = 0;
        class51.field1213 = 0;
        class189.field3726 = 0;
        class23.field501 = 0;
        class60.field1392 = 0;
        class85.field1828 = 0;
        class23.field512 = 0;
        class44.field920 = 0;
        class168.field3339 = 0;
        class17.field378 = 0;
        class20.field420 = 0;
        class160.field3204 = 0;
        class135.field2806 = 0;
        class15.field336 = 0;
        class23.field497 = 0;
        class135.field2808 = 0;
        class194.field3846 = 0;
        class57.field1337 = 0;
        class97.field2080 = 0;
        class189.field3705 = 0;
        class189.field3717 = 0;
        class172.field3415 = 0;
        class31.field675 = 0;
        class9.field181 = 0;
        class189.field3735 = 0;
        class100.field2108 = 0;
        class4.field85 = 0;
        field3243 = 0;
        class189.field3727 = 0;
        field3247 = 0;
        class72.field1636 = 0;
        class190.field3763 = 0;
        class189.field3725 = 0;
        class67.field1572 = 0;
        class154.field3078 = 0;
        class165.field3300 = 0;
        class131.field2720 = 0;
        class23.field491 = 0;
        class189.field3700 = 0;
        class204.field4015 = 0;
        class156.field3119 = 0;
        class182.field3598 = 0;
        class144.field2944 = 0;
        class64.field1516 = 0;
        class119.field2463 = 0;
        class85.field1797 = 0;
        class156.field3122 = 0;
        class156.field3123 = 0;
        class158.field3162 = 0;
        class117.field2435 = 0;
        class203.field4003 = 0;
        class23.field503 = 0;
        class152.field3031 = 0;
        class12.field259 = 0;
        class175.field3479 = 0;
        class134.field2761 = 0;
        class145.field2964 = 0;
        class110.field2335 = 0;
        class199.field3918 = 0;
        class189.field3728 = 0;
        class81.field1764 = 0;
        class23.field487 = 0;
        class34.field694 = 0;
        class121.field2507 = 0;
        class167.field3325 = 0;
        class19.field403 = 0;
        class151.field3015 = 0;
        class31.field660 = 0;
        class104.field2218 = 0;
        class64.field1530 = 0;
        class51.field1211 = 0;
        class84.field1795 = 0;
        class30.field656 = 0;
        class23.field472 = 0;
        class155.field3102 = 0;
        class129.field2690 = 0;
        class22.field454 = 0;
        class31.field659 = 0;
        class194.field3833 = 0;
        class97.field2052 = 0;
        class177.field3515 = 0;
        class200.field3951 = 0;
        class13.field290 = 0;
        class43.field914 = 0;
        class41.field869 = 0;
        class8.field144 = 0;
        class5.field86 = 0;
        class135.field2809 = 0;
        class48.field1156 = 0;
        class159.field3175 = 0;
        class25.field538 = 0;
        class153.field3060 = 0;
        class190.field3780 = 0;
        class91.field1940 = 0;
        class85.field1821 = 0;
        class189.field3761 = 0;
        class23.field474 = 0;
        class80.field1742 = 0;
        class23.field493 = 0;
        class200.field3953 = 0;
        class89.field1926 = 0;
        class119.field2494 = 0;
        class63.field1445 = 0;
        class47.field1139 = 0;
        class114.field2386 = 0;
        class5.field103 = 0;
        class23.field471 = 0;
        class104.field2239 = 0;
        class48.field1159 = 0;
        class97.field2057 = 0;
        class8.field164 = 0;
        class189.field3747 = 0;
        class47.field1066 = 0;
        class17.field372 = 0;
        class1.field4 = 0;
        class181.field3590 = 0;
        class70.field1629 = 0;
        class23.field519 = 0;
        class25.field532 = 0;
        class68.field1606 = 0;
        class201.field3968 = 0;
        class97.field2048 = 0;
        class85.field1813 = 0;
        class141.field2900 = 0;
        class200.field3958 = 0;
        class121.field2514 = 0;
        class41.field880 = 0;
        class200.field3952 = 0;
        class189.field3702 = 0;
        class23.field507 = 0;
        class17.field363 = 0;
        class159.field3187 = 0;
        class54.field1273 = 0;
        class205.field4040 = 0;
        class12.field248 = 0;
        class94.field1970 = 0;
        class165.field3295 = 0;
        class51.field1223 = 0;
        class181.field3589 = 0;
        class40.field855 = 0;
        class49.field1182 = 0;
        class58.field1368 = 0;
        class116.field2421 = 0;
        class80.field1745 = 0;
        class66.field1564 = 0;
        class183.field3607 = 0;
        class116.field2414 = 0;
        class16.field342 = 0;
        class1.field6 = 0;
        class43.field905 = 0;
        class78.field1721 = 0;
        class110.field2329 = 0;
        class58.field1366 = 0;
        class189.field3716 = 0;
        class190.field3768 = 0;
        class63.field1501 = 0;
        class27.field565 = 0;
        class66.field1554 = 0;
        class129.field2686 = 0;
        class28.field597 = 0;
        class58.field1355 = 0;
        class136.field2818 = 0;
        class85.field1802 = 0;
        client.field581 = 0;
        class19.field398 = 0;
        class23.field509 = 0;
        class151.field3024 = 0;
        class199.field3884 = 0;
        class121.field2509 = 0;
        class17.field354 = 0;
        class189.field3744 = 0;
        class174.field3440 = 0;
        class54.field1263 = 0;
        class23.field485 = 0;
        class199.field3896 = 0;
        class85.field1814 = 0;
        class108.field2302 = 0;
        class194.field3838 = 0;
        class68.field1611 = 0;
        class170.field3384 = 0;
        class199.field3937 = 0;
        class146.field2976 = 0;
        class12.field280 = 0;
        class8.field150 = 0;
        class73.field1671 = 0;
        class114.field2395 = 0;
        class109.field2315 = 0;
        class194.field3828 = 0;
        class12.field213 = 0;
        class189.field3712 = 0;
        class69.field1618 = 0;
        class190.field3769 = 0;
        class194.field3841 = 0;
        class199.field3940 = 0;
        class146.field2982 = 0;
        class199.field3907 = 0;
        class81.field1756 = 0;
        class110.field2325 = 0;
        class134.field2767 = 0;
        class199.field3910 = 0;
        class91.field1945 = 0;
        class199.field3912 = 0;
        class199.field3934 = 0;
        class52.field1237 = 0;
        class54.field1269 = 0;
        class81.field1763 = 0;
        class160.field3198 = 0;
        class44.field923 = 0;
        class94.field1963 = 0;
        class4.field45 = 0;
        class166.field3309 = 0;
        class200.field3955 = 0;
        class186.field3634 = 0;
        class189.field3704 = 0;
        class96.field2026 = 0;
        class113.field2383 = 0;
        class63.field1485 = 0;
        class54.field1262 = 0;
        class86.field1849 = 0;
        class14.field304 = 0;
        class63.field1506 = 0;
        class31.field658 = 0;
        class63.field1469 = 0;
        class6.field113 = 0;
        class48.field1164 = 0;
        class169.field3369 = 0;
        class67.field1569 = 0;
        class81.field1762 = 0;
        class29.field629 = 0;
        field3250 = 0;
        class51.field1217 = 0;
        class158.field3164 = 0;
        class72.field1654 = 0;
        class104.field2255 = 0;
        client.field570 = 0;
        class189.field3749 = 0;
        class8.field163 = 0;
        class64.field1519 = 0;
        class194.field3832 = 0;
        class153.field3047 = 0;
        class97.field2070 = 0;
        class14.field322 = 0;
        class97.field2073 = 0;
        client.field589 = 0;
        class53.field1244 = 0;
        class17.field368 = 0;
        class85.field1815 = 0;
        class154.field3093 = 0;
        class194.field3829 = 0;
        class189.field3746 = 0;
        class181.field3579 = 0;
        class121.field2512 = 0;
        class23.field492 = 0;
        class167.field3322 = 0;
        class23.field483 = 0;
        class205.field4027 = 0;
        class31.field657 = 0;
        class42.field894 = 0;
        client.field584 = 0;
        class194.field3848 = 0;
        class170.field3387 = 0;
        class151.field3027 = 0;
        class74.field1685 = 0;
        class194.field3834 = 0;
        class81.field1751 = 0;
        class97.field2049 = 0;
        class160.field3196 = 0;
        class199.field3897 = 0;
        class2.field22 = 0;
        class36.field722 = 0;
        class165.field3288 = 0;
        class36.field736 = 0L;
        class163.method1002(false);
        class86.field1844 = 0;
        class49.field1171 = 0;
        class80.field1749 = 0;
        class159.field3190.field3752 = 0;
        class58.field1359 = -1;
        class81.field1773 = -1;
        class113.field2380 = 0;
        class134.field2786 = false;
        class81.field1769.field3752 = 0;
        class200.field3964 = 0;
        class180.field3559 = -1;
        class107.field2286 = -1;
        class35.method251(0, (byte) -45);
        for (int var1 = 0; var1 < 100; var1++) {
            class153.field3049[var1] = null;
        }
        class124.field2547 = 0;
        class57.field1348 = 0;
        class51.field1216 = 0;
        class48.field1155 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class107.field2292 = (int) (Math.random() * 30.0D) - 20;
        class43.field915 = 0;
        class180.field3561 = (int) (Math.random() * 110.0D) - 55;
        class67.field1583 = 0;
        class67.field1580 = (int) (Math.random() * 120.0D) - 60;
        class69.field1619 = (int) (Math.random() * 80.0D) - 40;
        class105.field2283 = 0;
        class47.field1013 = 0;
        class121.field2517 = 0;
        class73.field1660 = false;
        class27.field568 = (int) (Math.random() * 100.0D) - 50;
        class119.field2448 = -1;
        for (int var2 = 0; var2 < 2048; var2++) {
            class95.field2007[var2] = null;
            class151.field3013[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class91.field1944[var3] = null;
        }
        class134.field2790 = class95.field2007[2047] = new class57();
        class89.field1924.method190((byte) 69);
        class202.field3984.method190((byte) 59);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class150.field3006[var4][var12][var13] = null;
                }
            }
        }
        class178.field3534 = new class25();
        class82.field1780 = 0;
        class73.field1666 = 0;
        for (int var5 = 0; var5 < class43.field916; var5++) {
            class160 var11 = class122.method759(-106, var5);
            if (var11 != null && var11.field3203 == 0) {
                class165.field3290[var5] = 0;
                class54.field1288[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class169.field3379.length; var6++) {
            class169.field3379[var6] = -1;
        }
        if (class119.field2450 != -1) {
            class8.method46(2047, class119.field2450);
        }
        for (class115 var7 = (class115) class31.field665.method264(63); var7 != null; var7 = (class115) class31.field665.method259(-104)) {
            class51.method400(var7, 72, true);
        }
        class119.field2450 = -1;
        class31.field665 = new class36(8);
        class49.field1171 = 0;
        class134.field2786 = false;
        class72.field1644 = null;
        class13.field292.method1016(-1, false, null, new int[5], 105);
        for (int var8 = 0; var8 < 8; var8++) {
            class109.field2320[var8] = null;
            class98.field2095[var8] = false;
        }
        class73.method519(false);
        class86.field1852 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class172.field3412[var9] = true;
        }
        class165.field3294 = 0;
        class63.field1447 = null;
        class159.field3189 = null;
        for (int var10 = 0; var10 < 6; var10++) {
            class199.field3909[var10] = new class42();
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method1001(int arg0) {
        if (arg0 != 0) {
            field3248 = null;
        }
        field3248 = null;
        field3245 = null;
        field3255 = null;
        field3251 = null;
        field3254 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V")
    public class162(int arg0) {
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3259 = arg0;
        this.field3260 = arg0;
        this.field3261 = new class36(var2);
    }
}
