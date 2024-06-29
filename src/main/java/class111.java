import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class111 {

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lpd;")
    private class153 field2063 = null;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int field2059 = 65000;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lpd;")
    private class153 field2069 = null;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lrd;")
    public static class173 field2057 = class133.method843(":duelfriend:", -110);

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lrd;")
    public static class173 field2065 = class133.method843("Begeben Sie sich in ein freies Gebiet)1 um", -125);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Laf;")
    public static class7 field2055 = new class7(20);

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
    public static boolean field2070 = false;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[Lrd;")
    public static class173[] field2071 = new class173[100];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "La;")
    public static class1 field2054;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[B")
    public final byte[] method669(int arg0, int arg1) {
        field2062++;
        class153 var3 = this.field2063;
        synchronized (this.field2063) {
            try {
                if (this.field2069.method1005((byte) -67) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2069.method1002((long) (arg0 * 6), -1837);
                this.field2069.method1010(6, class119.field2194, -1, 0);
                int var5 = ((arg1 & class119.field2194[3]) << 16) + ((class119.field2194[4] & 0xFF) << 8) + (class119.field2194[5] & 0xFF);
                int var6 = ((class119.field2194[1] & 0xFF) << 8) + (((class119.field2194[0] & 0xFF) << 16) + (class119.field2194[2] & 0xFF));
                if (var6 < 0 || var6 > this.field2059) {
                    return null;
                } else if (var5 > 0 && this.field2063.method1005((byte) -71) / 520L >= (long) var5) {
                    int var9 = 0;
                    int var10 = 0;
                    byte[] var11 = new byte[var6];
                    while (var6 > var9) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2063.method1002((long) (var5 * 520), -1837);
                        int var13 = var6 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2063.method1010(var13 + 8, class119.field2194, -1, 0);
                        int var14 = ((class119.field2194[0] & 0xFF) << 8) + (class119.field2194[1] & 0xFF);
                        int var15 = ((class119.field2194[2] & 0xFF) << 8) + (class119.field2194[3] & 0xFF);
                        int var16 = ((class119.field2194[4] & 0xFF) << 16) + (class119.field2194[6] & 0xFF) + ((class119.field2194[5] & 0xFF) << 8);
                        int var17 = class119.field2194[7] & 0xFF;
                        if (arg0 == var14 && var10 == var15 && this.field2058 == var17) {
                            if (var16 >= 0 && this.field2063.method1005((byte) 92) / 520L >= (long) var16) {
                                var5 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var11[var9++] = class119.field2194[var20 + 8];
                                }
                                var10++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static final void method670(boolean arg0) {
        class135.field2556 = true;
        class160.field2986.field34 = 0;
        field2051++;
        class150.field2854 = 0;
        class159.field2967 = 0;
        class197.field3837 = 0;
        class179.field3528 = 0;
        class155.field2932 = 0;
        class166.field3199 = 0;
        class182.field3577 = 0;
        class114.field2102 = 0;
        class57.field1124 = 0;
        class48.field1014 = 0;
        class13.field214 = 0;
        class114.field2127 = 0;
        class182.field3567 = 0;
        class172.field3349 = 0;
        class197.field3840 = 0;
        class129.field2436 = 0;
        class82.field1599 = 0;
        class181.field3556 = 0;
        class121.field2255 = 0;
        class14.field326 = 0;
        class79.field1548 = 0;
        class151.field2874 = 0;
        class99.field1822 = 0;
        class13.field269 = 0;
        class40.field838 = 0;
        class187.field3641 = 0;
        class172.field3320 = 0;
        class9.field160 = 0;
        class173.field3408 = 0;
        class195.field3796 = 0;
        class79.field1569 = 0;
        class223.field4267 = 0;
        class13.field278 = 0;
        class182.field3576 = 0;
        class64.field1269 = 0;
        class173.field3366 = 0;
        class212.field4118 = 0;
        class106.field1977 = 0;
        class68.field1317 = 0;
        class148.field2834 = 0;
        class81.field1589 = 0;
        class1.field7 = 0;
        class215.field4170 = 0;
        class89.field1721 = 0;
        class4.field92 = 0;
        class153.field2900 = 0;
        class190.field3713 = 0;
        class13.field241 = 0;
        class120.field2216 = 0;
        class33.field735 = 0;
        client.field633 = 0;
        class99.field1805 = 0;
        class208.field4048 = 0;
        class216.field4175 = 0;
        class78.field1514 = 0;
        class131.field2473 = 0;
        class152.field2877 = 0;
        class97.field1779 = 0;
        class173.field3397 = 0;
        class9.field158 = 0;
        class145.field2702 = 0;
        class172.field3319 = 0;
        class133.field2515 = 0;
        class28.field583 = 0;
        class56.field1115 = 0;
        class71.field1381 = 0;
        class13.field211 = 0;
        class205.field4015 = 0;
        class117.field2162 = 0;
        class79.field1545 = 0;
        class31.field663 = 0;
        class91.field1731 = 0;
        class26.field559 = 0;
        class139.field2593 = 0;
        class177.field3481 = 0;
        class173.field3378 = 0;
        class30.field604 = 0;
        class47.field997 = 0;
        class148.field2825 = 0;
        class119.field2203 = 0;
        class145.field2714 = 0;
        class123.field2326 = 0;
        class193.field3754 = 0;
        class145.field2709 = 0;
        class30.field617 = 0;
        class64.field1258 = 0;
        class163.field3018 = 0;
        class79.field1558 = 0;
        class87.field1682 = 0;
        class112.field2077 = 0;
        class7.field135 = 0;
        class121.field2276 = 0;
        class163.field3022 = 0;
        class23.field503 = 0;
        class179.field3529 = 0;
        class163.field3017 = 0;
        class4.field103 = 0;
        class188.field3665 = 0;
        class80.field1574 = 0;
        class158.field2964 = 0;
        class172.field3354 = 0;
        class202.field3906 = 0;
        class140.field2610 = 0;
        class47.field1005 = 0;
        class203.field3968 = 0;
        class170.field3290 = 0;
        class173.field3394 = 0;
        class172.field3339 = 0;
        class14.field291 = 0;
        class149.field2841 = 0;
        class183.field3594 = 0;
        class67.field1308 = 0;
        class93.field1751 = 0;
        class20.field451 = 0;
        class223.field4273 = 0;
        class168.field3237 = 0;
        class114.field2122 = 0;
        class121.field2219 = 0;
        class173.field3416 = 0;
        class13.field243 = 0;
        class127.field2396 = 0;
        class190.field3724 = 0;
        class144.field2690 = 0;
        class116.field2149 = 0;
        class114.field2120 = 0;
        class35.field754 = 0;
        class15.field350 = 0;
        class33.field737 = 0;
        class99.field1813 = 0;
        class173.field3404 = 0;
        class153.field2908 = 0;
        class158.field2958 = 0;
        class215.field4169 = 0;
        class223.field4275 = 0;
        class145.field2733 = 0;
        class140.field2611 = 0;
        class164.field3038 = 0;
        class170.field3284 = 0;
        class69.field1323 = 0;
        class19.field438 = 0;
        class121.field2239 = 0;
        class42.field857 = 0;
        class5.field118 = 0;
        class47.field1000 = 0;
        class19.field422 = 0;
        class101.field1853 = 0;
        class3.field24 = 0;
        class143.field2676 = 0;
        class223.field4260 = 0;
        class56.field1117 = 0;
        class173.field3375 = 0;
        class123.field2301 = 0;
        class186.field3631 = 0;
        class158.field2957 = 0;
        class119.field2195 = 0;
        class71.field1377 = 0;
        class190.field3714 = 0;
        class45.field947 = 0;
        class66.field1283 = 0;
        class121.field2226 = 0;
        class40.field836 = 0;
        class164.field3040 = 0;
        class51.field1052 = 0;
        field2051 = 0;
        class56.field1111 = 0;
        class173.field3419 = 0;
        class163.field3008 = 0;
        class155.field2928 = 0;
        class76.field1491 = 0;
        class13.field202 = 0;
        class143.field2681 = 0;
        class147.field2806 = 0;
        class62.field1216 = 0;
        class13.field257 = 0;
        class212.field4094 = 0;
        class173.field3383 = 0;
        class176.field3458 = 0;
        class33.field721 = 0;
        class215.field4171 = 0;
        class123.field2311 = 0;
        class118.field2182 = 0;
        class38.field807 = 0;
        class74.field1453 = 0;
        class207.field4027 = 0;
        class112.field2087 = 0;
        class173.field3387 = 0;
        class155.field2931 = 0;
        class13.field265 = 0;
        class153.field2896 = 0;
        class56.field1114 = 0;
        class133.field2526 = 0;
        class78.field1528 = 0;
        class147.field2792 = 0;
        class40.field839 = 0;
        class173.field3371 = 0;
        class8.field148 = 0;
        class177.field3486 = 0;
        class15.field344 = 0;
        class14.field297 = 0;
        class55.field1095 = 0;
        class177.field3469 = 0;
        class106.field1980 = 0;
        class172.field3333 = 0;
        class13.field261 = 0;
        class121.field2254 = 0;
        class172.field3329 = 0;
        class121.field2227 = 0;
        class145.field2727 = 0;
        class98.field1784 = 0;
        class121.field2257 = 0;
        class202.field3913 = 0;
        class29.field592 = 0;
        class74.field1437 = 0;
        class189.field3682 = 0;
        class78.field1527 = 0;
        class59.field1161 = 0;
        class121.field2250 = 0;
        class56.field1110 = 0;
        class203.field3935 = 0;
        class69.field1330 = 0;
        class62.field1214 = 0;
        class173.field3384 = 0;
        class211.field4077 = 0;
        class209.field4067 = 0;
        class79.field1538 = 0;
        class172.field3317 = 0;
        class189.field3680 = 0;
        class54.field1089 = 0;
        class151.field2868 = 0;
        class23.field495 = 0;
        class133.field2524 = 0;
        class121.field2235 = 0;
        class170.field3298 = 0;
        class133.field2516 = 0;
        class186.field3622 = 0;
        class203.field3955 = 0;
        class82.field1614 = 0;
        class112.field2082 = 0;
        class13.field258 = 0;
        class159.field2978 = 0;
        class196.field3826 = 0;
        class74.field1456 = 0;
        class108.field2010 = 0;
        class40.field827 = 0;
        class79.field1541 = 0;
        class18.field377 = 0;
        class4.field74 = 0;
        client.field641 = 0;
        class165.field3114 = 0;
        class70.field1344 = 0;
        class29.field601 = 0;
        class165.field3100 = 0;
        class48.field1031 = 0;
        class121.field2233 = 0;
        class78.field1521 = 0;
        class98.field1785 = 0;
        class145.field2724 = 0;
        client.field639 = 0;
        class186.field3623 = 0;
        class123.field2316 = 0;
        class177.field3475 = 0;
        class13.field237 = 0;
        class174.field3424 = 0;
        field2066 = 0;
        class188.field3670 = 0;
        class82.field1606 = 0;
        class196.field3825 = 0;
        class170.field3294 = 0;
        class121.field2260 = 0;
        class73.field1419 = 0;
        class92.field1738 = 0;
        class121.field2228 = 0;
        class30.field621 = 0;
        class133.field2518 = 0;
        class145.field2703 = 0;
        class80.field1585 = 0;
        class22.field474 = 0;
        class166.field3194 = 0;
        class198.field3857 = 0;
        class135.field2555 = 0;
        class38.field797 = 0;
        class35.field755 = 0;
        class34.field744 = 0;
        class151.field2860 = 0;
        class121.field2249 = 0;
        class19.field381 = 0;
        class94.field1759 = 0;
        class1.field5 = 0;
        class75.field1458 = 0;
        class167.field3235 = 0;
        class151.field2855 = 0;
        class4.field59 = 0;
        class121.field2220 = 0;
        class117.field2166 = 0;
        class41.field841 = 0;
        class12.field194 = 0;
        class194.field3782 = 0;
        class5.field116 = 0;
        class191.field3731 = 0;
        class167.field3229 = 0;
        class214.field4163 = 0;
        class169.field3249 = 0;
        class153.field2886 = 0;
        class8.field152 = 0;
        class13.field259 = 0;
        class34.field747 = 0;
        class150.field2848 = 0;
        class57.field1123 = 0;
        class80.field1572 = 0;
        class19.field425 = 0;
        class187.field3643 = 0;
        class56.field1113 = 0;
        class79.field1552 = 0;
        class188.field3667 = 0;
        class14.field333 = 0;
        class184.field3607 = 0;
        class14.field292 = 0;
        class64.field1260 = 0;
        class215.field4165 = 0;
        class45.field936 = 0;
        class168.field3242 = 0;
        class114.field2118 = 0;
        class143.field2679 = 0;
        class4.field54 = 0;
        client.field628 = 0;
        class169.field3258 = 0;
        class33.field719 = 0;
        class191.field3735 = 0;
        class109.field2035 = 0;
        class99.field1811 = 0;
        class168.field3248 = 0;
        class179.field3517 = 0;
        class60.field1177 = 0;
        class118.field2180 = 0;
        class64.field1266 = 0;
        class14.field334 = 0;
        class48.field1026 = 0;
        class172.field3341 = 0;
        class173.field3400 = 0;
        class177.field3485 = 0;
        class99.field1800 = 0;
        class173.field3399 = 0;
        class48.field1021 = 0;
        class121.field2273 = 0;
        class33.field736 = 0;
        class13.field220 = 0;
        class195.field3791 = 0;
        class186.field3630 = 0;
        class14.field341 = 0;
        class212.field4121 = 0;
        class172.field3363 = 0;
        class165.field3107 = 0;
        class174.field3422 = 0;
        class26.field556 = 0;
        field2064 = 0;
        class46.field990 = 0;
        class214.field4164 = 0;
        class31.field656 = 0;
        class140.field2619 = 0;
        class164.field3033 = 0;
        class112.field2092 = 0;
        class12.field197 = 0;
        class37.field789 = 0;
        class151.field2867 = 0;
        class57.field1122 = 0;
        client.field625 = 0;
        class193.field3748 = 0;
        class112.field2090 = 0;
        class190.field3716 = 0;
        class114.field2105 = 0;
        class121.field2244 = 0;
        class76.field1490 = 0;
        class159.field2973 = 0;
        class19.field413 = 0;
        class4.field94 = 0;
        class42.field862 = 0;
        class172.field3332 = 0;
        class203.field3926 = 0;
        class13.field240 = 0;
        class172.field3327 = 0;
        class178.field3505 = 0;
        class103.field1920 = 0;
        class209.field4064 = 0;
        class103.field1902 = 0;
        class208.field4046 = 0;
        class179.field3538 = 0;
        class59.field1165 = 0;
        class152.field2883 = 0;
        class108.field2019 = 0;
        class121.field2240 = 0;
        class191.field3728 = 0;
        class40.field824 = 0;
        class174.field3434 = 0;
        class112.field2083 = 0;
        class172.field3325 = 0;
        class121.field2238 = 0;
        class172.field3360 = 0;
        class135.field2552 = 0;
        class175.field3438 = 0;
        class4.field44 = 0;
        class172.field3337 = 0;
        class131.field2474 = 0;
        class133.field2531 = 0;
        class125.field2353 = 0;
        class173.field3403 = 0;
        class173.field3393 = 0;
        class103.field1914 = 0;
        class3.field29 = 0;
        class204.field3999 = 0;
        class71.field1374 = 0;
        class214.field4161 = 0;
        class221.field4247 = 0;
        class110.field2039 = 0;
        class45.field910 = 0;
        class14.field307 = 0;
        class78.field1515 = 0;
        class191.field3734 = 0;
        class197.field3853 = 0;
        class14.field305 = 0;
        class114.field2107 = 0;
        class165.field3130 = 0;
        class123.field2317 = 0;
        class30.field611 = 0;
        class153.field2913 = 0;
        class117.field2175 = 0;
        class204.field3997 = 0;
        class98.field1786 = 0;
        class219.field4221 = 0;
        class26.field552 = 0;
        class153.field2890 = 0;
        class149.field2843 = 0;
        class124.field2327 = 0;
        class173.field3382 = 0;
        class1.field20 = 0;
        class31.field671 = 0;
        class99.field1818 = 0;
        class99.field1819 = 0;
        class214.field4152 = 0;
        class121.field2231 = 0;
        class4.field63 = 0;
        class155.field2920 = 0;
        class79.field1543 = 0;
        class164.field3031 = 0;
        class179.field3541 = 0;
        class84.field1668 = 0;
        class1.field17 = 0;
        class173.field3413 = 0;
        class36.field775 = 0;
        class3.field32 = 0;
        class121.field2243 = 0;
        class174.field3428 = 0;
        class173.field3395 = 0;
        class199.field3868 = 0;
        class147.field2765 = 0;
        class165.field3136 = 0;
        class14.field335 = 0;
        class208.field4043 = 0;
        class57.field1135 = 0;
        class33.field724 = 0;
        class134.field2533 = 0;
        class220.field4240 = 0;
        class28.field576 = 0;
        class51.field1050 = 0;
        class135.field2561 = 0;
        class147.field2749 = 0;
        class48.field1027 = 0;
        class19.field419 = 0;
        class195.field3797 = 0;
        class91.field1729 = 0;
        class196.field3807 = 0;
        class58.field1146 = 0;
        class4.field41 = 0;
        class145.field2705 = 0;
        class220.field4231 = 0;
        class179.field3537 = 0;
        class99.field1807 = 0;
        class195.field3795 = 0;
        class186.field3619 = 0;
        class110.field2048 = 0;
        class99.field1812 = 0;
        class173.field3369 = 0;
        class157.field2950 = 0;
        class193.field3755 = 0;
        class7.field129 = 0;
        class121.field2237 = 0;
        class29.field598 = 0;
        class173.field3414 = 0;
        class204.field3995 = 0;
        class203.field3960 = 0;
        class148.field2828 = 0;
        class108.field2014 = 0;
        class188.field3663 = 0;
        class183.field3593 = 0;
        class92.field1733 = 0;
        class13.field222 = 0;
        class104.field1926 = 0;
        class173.field3396 = 0;
        class46.field957 = 0;
        class123.field2308 = 0;
        class52.field1068 = 0;
        class119.field2197 = 0;
        class189.field3696 = 0;
        class140.field2616 = 0;
        class165.field3093 = 0;
        class62.field1220 = 0;
        class153.field2914 = 0;
        class121.field2225 = 0;
        class197.field3843 = 0;
        class48.field1011 = 0;
        class173.field3401 = 0;
        class178.field3491 = 0;
        class14.field324 = 0;
        class181.field3551 = 0;
        class19.field400 = 0;
        class212.field4108 = 0;
        class199.field3869 = 0;
        class19.field412 = 0;
        class105.field1958 = 0;
        class165.field3135 = 0;
        class212.field4100 = 0;
        class78.field1529 = 0;
        class172.field3330 = 0;
        class151.field2858 = 0;
        class78.field1506 = 0;
        class155.field2924 = 0;
        class131.field2467 = 0;
        class157.field2945 = 0;
        class4.field62 = 0;
        client.field635 = 0;
        class172.field3351 = 0;
        class5.field121 = 0;
        class205.field4007 = 0;
        class17.field366 = 0;
        class174.field3421 = 0;
        class89.field1723 = 0;
        class121.field2264 = 0;
        class99.field1803 = 0;
        class196.field3810 = 0;
        class134.field2538 = 0;
        class31.field657 = 0;
        class195.field3799 = 0;
        class166.field3196 = 0;
        class13.field231 = 0;
        class3.field27 = 0;
        class204.field3989 = 0;
        class125.field2358 = 0;
        class182.field3568 = 0;
        class223.field4271 = 0;
        class147.field2798 = 0;
        class173.field3386 = 0;
        class172.field3340 = 0;
        class19.field383 = 0;
        class157.field2938 = 0;
        class7.field136 = 0;
        class14.field299 = 0;
        class14.field300 = 0;
        class121.field2221 = 0;
        class173.field3377 = 0;
        class98.field1787 = 0;
        class123.field2305 = 0;
        class173.field3406 = 0;
        class94.field1757 = 0;
        class96.field1765 = 0;
        class140.field2603 = 0;
        client.field638 = 0;
        class165.field3058 = 0;
        class101.field1850 = 0;
        class194.field3765 = 0;
        class168.field3244 = 0;
        class60.field1179 = 0;
        class139.field2594 = 0;
        class173.field3381 = 0;
        class203.field3945 = 0;
        class121.field2278 = 0;
        class158.field2956 = 0;
        class173.field3410 = 0;
        class170.field3283 = 0;
        class14.field311 = 0;
        class181.field3552 = 0;
        class57.field1140 = 0;
        class14.field321 = 0;
        class135.field2562 = 0;
        class79.field1540 = 0;
        class178.field3501 = 0;
        class159.field2980 = 0;
        class105.field1956 = 0;
        class13.field256 = 0;
        class119.field2199 = 0;
        class211.field4071 = 0;
        class121.field2236 = 0;
        class223.field4266 = 0;
        class96.field1767 = 0;
        class63.field1249 = 0;
        class120.field2204 = 0;
        class151.field2865 = 0;
        class114.field2119 = 0;
        field2062 = 0;
        class54.field1077 = 0;
        class203.field3948 = 0;
        class147.field2758 = 0;
        class31.field648 = 0;
        class13.field263 = 0;
        class172.field3357 = 0;
        class13.field227 = 0;
        class51.field1051 = 0;
        class184.field3606 = 0;
        class58.field1157 = 0;
        class9.field161 = 0;
        class179.field3527 = 0;
        class166.field3197 = 0;
        class13.field254 = 0;
        class41.field843 = 0;
        class64.field1251 = 0;
        class74.field1448 = 0;
        class67.field1301 = 0;
        class159.field2969 = 0;
        class203.field3982 = 0;
        class13.field276 = 0;
        class216.field4177 = 0;
        class127.field2394 = 0;
        class193.field3750 = 0;
        class121.field2277 = 0;
        class100.field1832 = 0;
        class99.field1820 = 0;
        class47.field1001 = 0;
        class205.field4013 = 0;
        client.field624 = 0;
        class209.field4063 = 0;
        class64.field1257 = 0;
        class186.field3615 = 0;
        class15.field349 = 0;
        class131.field2470 = 0;
        class92.field1736 = 0;
        class7.field141 = 0;
        class209.field4058 = 0;
        class114.field2103 = 0;
        class73.field1424 = 0;
        class121.field2242 = 0;
        class14.field309 = 0;
        class1.field19 = 0;
        class173.field3389 = 0;
        class153.field2894 = 0;
        class151.field2856 = 0;
        class216.field4173 = 0;
        class80.field1578 = 0;
        class169.field3277 = 0;
        class4.field78 = 0;
        class31.field662 = 0;
        class84.field1676 = 0;
        class25.field537 = 0;
        class26.field560 = 0;
        class169.field3274 = 0;
        class219.field4213 = 0;
        class114.field2126 = 0;
        class212.field4104 = 0;
        class66.field1274 = 0;
        class19.field416 = 0;
        client.field640 = 0;
        class172.field3353 = 0;
        class199.field3874 = 0;
        class5.field117 = 0;
        class29.field599 = 0;
        class110.field2044 = 0;
        class87.field1684 = 0;
        class29.field600 = 0;
        class187.field3640 = 0;
        class173.field3372 = 0;
        class214.field4150 = 0;
        class151.field2870 = 0;
        class18.field375 = 0;
        class177.field3480 = 0;
        class18.field372 = 0;
        class196.field3821 = 0;
        class14.field293 = 0;
        class169.field3268 = 0;
        class122.field2289 = 0;
        class172.field3359 = 0;
        class30.field607 = 0;
        class184.field3604 = 0;
        class80.field1576 = 0;
        class164.field3035 = 0;
        class121.field2266 = 0;
        class187.field3636 = 0;
        class92.field1735 = 0;
        class173.field3392 = 0;
        class208.field4040 = 0;
        class57.field1139 = 0;
        class168.field3239 = 0;
        class155.field2933 = 0;
        class19.field396 = 0;
        class223.field4263 = 0;
        class7.field142 = 0;
        class1.field6 = 0;
        class103.field1912 = 0;
        class81.field1588 = 0;
        class178.field3494 = 0;
        class145.field2696 = 0;
        class69.field1327 = 0;
        class99.field1808 = 0;
        class133.field2520 = 0;
        class124.field2337 = 0;
        class217.field4201 = 0;
        class63.field1247 = 0;
        class76.field1496 = 0;
        class164.field3039 = 0;
        class202.field3919 = 0;
        class70.field1366 = 0;
        class186.field3629 = 0;
        class71.field1382 = 0;
        class108.field2011 = 0;
        class165.field3176 = 0;
        class114.field2116 = 0;
        class157.field2943 = 0;
        class114.field2125 = 0;
        class63.field1231 = 0;
        class155.field2927 = 0;
        class47.field998 = 0;
        class133.field2525 = 0;
        class145.field2716 = 0;
        class47.field995 = 0;
        class172.field3321 = 0;
        class82.field1605 = 0;
        class160.field2983 = 0;
        class58.field1153 = 0;
        class143.field2680 = 0;
        class196.field3814 = 0;
        class152.field2878 = 0;
        client.field627 = 0;
        class152.field2881 = 0;
        class119.field2196 = 0;
        class149.field2842 = 0;
        class47.field1009 = 0;
        class219.field4226 = 0;
        class160.field2988 = 0;
        class195.field3798 = 0;
        class112.field2078 = 0;
        class172.field3336 = 0;
        class202.field3908 = 0;
        class178.field3488 = 0;
        class191.field3727 = 0;
        class51.field1053 = 0;
        class125.field2360 = 0;
        class163.field3016 = 0;
        class98.field1788 = 0;
        class41.field840 = 0;
        class13.field236 = 0;
        class35.field753 = 0;
        class105.field1936 = 0;
        class97.field1777 = 0;
        class120.field2211 = 0;
        class73.field1414 = 0;
        class118.field2179 = 0;
        class46.field976 = 0;
        class4.field51 = 0;
        class203.field3927 = 0;
        class173.field3388 = 0;
        class205.field4006 = 0;
        class153.field2901 = 0;
        class80.field1580 = 0;
        class207.field4039 = 0;
        class173.field3374 = 0;
        class147.field2788 = 0;
        class14.field308 = 0;
        class22.field480 = 0;
        class112.field2086 = 0;
        class103.field1907 = 0;
        class187.field3638 = 0;
        class121.field2265 = 0;
        class25.field542 = 0;
        class63.field1242 = 0;
        class170.field3289 = 0;
        class119.field2193 = 0;
        class163.field3020 = 0;
        class121.field2281 = 0;
        class171.field3307 = 0;
        class121.field2223 = 0;
        class158.field2959 = 0;
        class129.field2443 = 0;
        class196.field3815 = 0;
        class14.field306 = 0;
        class80.field1581 = 0;
        class75.field1475 = 0;
        class153.field2911 = 0;
        class139.field2596 = 0;
        class127.field2392 = 0;
        class168.field3245 = 0;
        class104.field1935 = 0;
        class29.field596 = 0;
        class149.field2838 = 0;
        class63.field1229 = 0;
        class112.field2073 = 0;
        class182.field3570 = 0;
        class79.field1536 = 0;
        class62.field1226 = 0;
        class188.field3668 = 0;
        class20.field446 = 0;
        class151.field2871 = 0;
        class211.field4085 = 0;
        class191.field3729 = 0;
        class5.field114 = 0;
        class45.field951 = 0;
        class36.field778 = 0;
        class190.field3712 = 0;
        class18.field374 = 0;
        client.field643 = 0;
        class199.field3871 = 0;
        class202.field3904 = 0;
        class81.field1590 = 0;
        class99.field1799 = 0;
        class197.field3838 = 0;
        class152.field2880 = 0;
        class121.field2270 = 0;
        class211.field4086 = 0;
        class179.field3533 = 0;
        class173.field3409 = 0;
        class97.field1776 = 0;
        class82.field1595 = 0;
        class51.field1056 = 0;
        class13.field244 = 0;
        field2050 = 0;
        class79.field1551 = 0;
        class203.field3933 = 0;
        class42.field859 = 0;
        class172.field3350 = 0;
        class20.field453 = 0;
        class10.field172 = 0;
        class48.field1025 = 0;
        class99.field1810 = 0;
        class173.field3402 = 0;
        class121.field2267 = 0;
        class31.field649 = 0;
        class62.field1211 = 0;
        class121.field2224 = 0;
        class110.field2040 = 0;
        class30.field616 = 0;
        class167.field3219 = 0;
        class214.field4157 = 0;
        class14.field303 = 0;
        class187.field3660 = 0;
        class191.field3733 = 0;
        class177.field3467 = 0;
        class173.field3390 = 0;
        class219.field4223 = 0;
        class193.field3747 = 0;
        class219.field4215 = 0;
        class13.field247 = 0;
        class42.field860 = 0;
        class99.field1797 = 0;
        class157.field2949 = 0;
        class172.field3355 = 0;
        class107.field1989 = 0;
        class160.field2984 = 0;
        class123.field2309 = 0;
        class87.field1695 = 0;
        class57.field1127 = 0;
        class121.field2252 = 0;
        class117.field2160 = 0;
        class29.field593 = 0;
        class84.field1662 = 0;
        class121.field2246 = 0;
        class155.field2923 = 0;
        field2067 = 0;
        class172.field3334 = 0;
        class82.field1607 = 0;
        class145.field2720 = 0;
        class217.field4202 = 0;
        class169.field3278 = 0;
        class66.field1282 = 0;
        class186.field3616 = 0;
        class74.field1442 = 0;
        class178.field3489 = 0;
        class208.field4042 = 0;
        class14.field320 = 0;
        class93.field1752 = 0;
        class99.field1821 = 0;
        class182.field3572 = 0;
        class106.field1975 = 0;
        class147.field2772 = 0;
        class174.field3423 = 0;
        class57.field1129 = 0;
        class13.field207 = 0;
        class1.field13 = 0;
        class11.field179 = 0;
        class13.field234 = 0;
        class194.field3773 = 0;
        class13.field235 = 0;
        class211.field4075 = 0;
        class121.field2269 = 0;
        class207.field4035 = 0;
        class13.field268 = 0;
        class163.field3007 = 0;
        class209.field4066 = 0;
        class177.field3465 = 0;
        class46.field988 = 0;
        class74.field1451 = 0;
        class121.field2280 = 0;
        class13.field270 = 0;
        class74.field1457 = 0;
        class13.field250 = 0;
        class133.field2509 = 0;
        class41.field848 = 0;
        class67.field1303 = 0;
        class79.field1555 = 0;
        class178.field3504 = 0;
        class195.field3802 = 0;
        class4.field53 = 0;
        class172.field3358 = 0;
        class33.field730 = 0;
        class23.field500 = 0;
        class196.field3813 = 0;
        class147.field2807 = 0;
        class14.field339 = 0;
        class220.field4235 = 0;
        class204.field3998 = 0;
        class20.field460 = 0;
        class48.field1012 = 0;
        class176.field3454 = 0;
        class25.field528 = 0;
        class114.field2121 = 0;
        class202.field3899 = 0;
        class40.field820 = 0;
        class4.field47 = 0;
        class11.field180 = 0;
        class75.field1461 = 0;
        class205.field4010 = 0;
        class64.field1261 = 0;
        class195.field3793 = 0;
        class101.field1851 = 0;
        class17.field363 = 0;
        class74.field1438 = 0;
        class159.field2968 = 0;
        class57.field1120 = 0;
        class196.field3809 = 0;
        class82.field1611 = 0;
        class145.field2701 = 0;
        class19.field440 = 0;
        class103.field1905 = 0;
        class45.field942 = 0;
        class22.field489 = 0;
        class37.field788 = 0;
        class121.field2234 = 0;
        class33.field723 = 0;
        class178.field3512 = 0;
        class33.field732 = 0;
        class66.field1281 = 0;
        class69.field1325 = 0;
        class13.field262 = 0;
        class178.field3507 = 0;
        class121.field2272 = 0;
        class74.field1449 = 0;
        class9.field157 = 0;
        class62.field1227 = 0;
        class188.field3664 = 0;
        class19.field411 = 0;
        class145.field2698 = 0;
        class121.field2262 = 0;
        class202.field3910 = 0;
        class175.field3439 = 0;
        class172.field3348 = 0;
        class211.field4073 = 0;
        class198.field3860 = 0;
        class24.field515 = 0;
        class20.field457 = 0;
        class13.field221 = 0;
        class145.field2708 = 0;
        class193.field3746 = 0;
        class108.field2021 = 0;
        class121.field2268 = 0;
        class8.field151 = 0;
        class108.field2015 = 0;
        class140.field2606 = 0;
        class170.field3286 = 0;
        class64.field1255 = 0;
        class33.field720 = 0;
        class13.field205 = 0;
        class183.field3591 = 0;
        class121.field2229 = 0;
        class177.field3468 = 0;
        class7.field139 = 0;
        class14.field322 = 0;
        class14.field313 = 0;
        class186.field3628 = 0;
        class121.field2253 = 0;
        class17.field370 = 0;
        class124.field2336 = 0;
        class13.field238 = 0;
        class173.field3411 = 0;
        class219.field4218 = 0;
        class13.field218 = 0;
        class73.field1415 = 0;
        class126.field2375 = 0;
        class173.field3367 = 0;
        class145.field2715 = 0;
        class81.field1591 = 0;
        class178.field3499 = 0;
        class163.field3025 = 0;
        class79.field1535 = 0;
        class126.field2365 = 0;
        class11.field187 = 0;
        class19.field388 = 0;
        class172.field3335 = 0;
        class172.field3323 = 0;
        class177.field3482 = 0;
        class194.field3772 = 0;
        class68.field1318 = 0;
        class69.field1322 = 0;
        class199.field3875 = 0;
        class186.field3621 = 0;
        class197.field3852 = 0;
        class138.field2590 = 0;
        class216.field4189 = 0;
        class10.field176 = 0;
        class1.field15 = 0;
        class133.field2532 = 0;
        class140.field2613 = 0;
        class164.field3036 = 0;
        class19.field382 = 0;
        class204.field4000 = 0;
        class121.field2279 = 0;
        class178.field3516 = 0;
        class14.field310 = 0;
        class143.field2677 = 0;
        class14.field314 = 0;
        class114.field2110 = 0;
        field2053 = 0;
        class187.field3656 = 0;
        class99.field1814 = 0;
        class79.field1534 = 0;
        class103.field1916 = 0;
        class31.field669 = 0;
        class87.field1692 = 0;
        class19.field392 = 0;
        class219.field4209 = 0;
        class5.field105 = 0;
        class152.field2879 = 0;
        class71.field1380 = 0;
        class100.field1845 = 0;
        class14.field336 = 0;
        class177.field3476 = 0;
        class10.field177 = 0;
        class175.field3437 = 0;
        class207.field4037 = 0;
        class205.field4014 = 0;
        class145.field2717 = 0;
        class100.field1844 = 0;
        class69.field1328 = 0;
        class173.field3391 = 0;
        class158.field2963 = 0;
        class48.field1024 = 0;
        class13.field206 = 0;
        class4.field82 = 0;
        class40.field821 = 0;
        class22.field477 = 0;
        client.field631 = 0;
        class182.field3569 = 0;
        class125.field2346 = 0;
        class207.field4034 = 0;
        class195.field3803 = 0;
        class62.field1222 = 0;
        field2061 = 0;
        class197.field3846 = 0;
        class79.field1549 = 0;
        class117.field2164 = 0;
        class11.field186 = 0;
        class36.field774 = 0;
        class207.field4032 = 0;
        class31.field651 = 0;
        class94.field1754 = 0;
        class184.field3608 = 0;
        class186.field3618 = 0;
        class99.field1801 = 0;
        class109.field2026 = 0;
        class13.field217 = 0;
        field2068 = 0;
        class77.field1499 = 0;
        class121.field2241 = 0;
        class13.field260 = 0;
        class178.field3502 = 0;
        class155.field2930 = 0;
        class208.field4047 = 0;
        class24.field514 = 0;
        class138.field2586 = 0;
        class121.field2284 = 0;
        class26.field544 = 0;
        class121.field2245 = 0;
        class219.field4225 = 0;
        class114.field2114 = 0;
        class126.field2370 = 0;
        class172.field3331 = 0;
        class120.field2209 = 0;
        class174.field3431 = 0;
        class76.field1488 = 0;
        class165.field3079 = 0;
        class13.field283 = 0;
        class84.field1667 = 0;
        class4.field37 = 0;
        class82.field1602 = 0;
        class100.field1829 = 0;
        class129.field2439 = 0;
        class120.field2205 = 0;
        class87.field1690 = 0;
        class75.field1472 = 0;
        class153.field2904 = 0;
        class173.field3405 = 0;
        class217.field4195 = 0;
        class196.field3820 = 0;
        class76.field1494 = 0;
        class121.field2230 = 0;
        class121.field2282 = 0;
        class74.field1435 = 0;
        class13.field203 = 0;
        class54.field1076 = 0;
        class186.field3624 = 0;
        class1.field14 = 0;
        class37.field793 = 0;
        class12.field195 = 0;
        class73.field1428 = 0;
        class186.field3620 = 0;
        class56.field1116 = 0;
        class125.field2355 = 0;
        class169.field3254 = 0;
        class118.field2181 = 0;
        class75.field1462 = 0;
        class196.field3804 = 0;
        class1.field9 = 0;
        class34.field740 = 0;
        class182.field3565 = 0;
        class168.field3241 = 0;
        class13.field273 = 0;
        class121.field2247 = 0;
        class172.field3342 = 0;
        class145.field2728 = 0;
        class57.field1138 = 0;
        class45.field949 = 0;
        class9.field165 = 0;
        class171.field3314 = 0;
        class9.field162 = 0;
        class25.field538 = 0;
        class176.field3457 = 0;
        class165.field3073 = 0;
        class170.field3292 = 0;
        class22.field491 = 0;
        class45.field928 = 0;
        class173.field3385 = 0;
        class14.field318 = 0;
        class129.field2431 = 0;
        field2060 = 0;
        class14.field317 = 0;
        class79.field1553 = 0;
        class214.field4153 = 0;
        class179.field3532 = 0;
        class45.field911 = 0;
        class7.field131 = 0;
        class140.field2609 = 0;
        class177.field3478 = 0;
        class177.field3462 = 0;
        class108.field2012 = 0;
        class112.field2088 = 0;
        class177.field3466 = 0;
        class179.field3525 = 0;
        class23.field494 = 0;
        class173.field3376 = 0;
        class33.field726 = 0;
        class78.field1507 = 0;
        class165.field3150 = 0;
        class164.field3028 = 0;
        class173.field3407 = 0;
        class219.field4219 = 0;
        class173.field3412 = 0;
        class145.field2730 = 0;
        class195.field3794 = 0;
        class144.field2688 = 0;
        class69.field1326 = 0;
        class79.field1546 = 0;
        class80.field1573 = 0;
        class121.field2248 = 0;
        class153.field2902 = 0;
        class205.field4019 = 0;
        class166.field3198 = 0;
        class144.field2694 = 0;
        class105.field1961 = 0;
        class7.field137 = 0;
        class108.field2006 = 0;
        class172.field3338 = 0;
        class7.field128 = 0;
        class169.field3270 = 0;
        class62.field1218 = 0;
        class103.field1904 = 0;
        class173.field3418 = 0;
        class116.field2144 = 0;
        class14.field337 = 0;
        class179.field3534 = 0;
        class223.field4262 = 0;
        class153.field2898 = 0;
        class75.field1487 = 0;
        class10.field173 = 0;
        class189.field3693 = 0;
        class60.field1178 = 0;
        class68.field1315 = 0;
        class165.field3134 = 0;
        class163.field3012 = 0;
        class133.field2522 = 0;
        class119.field2186 = 0;
        class177.field3484 = 0;
        class33.field728 = 0;
        class203.field3949 = 0;
        class100.field1828 = 0;
        class172.field3324 = 0L;
        class18.field376 = true;
        class209.method1382((byte) 98);
        class165.field3175.field2222 = 0;
        class176.field3451 = -1;
        class70.field1358.field2222 = 0;
        class12.field199 = 0;
        class63.field1243 = 0;
        class138.field2587 = 0;
        class84.field1663 = -1;
        class96.field1764 = -1;
        class66.field1278 = -1;
        for (int var1 = 0; var1 < class105.field1971.length; var1++) {
            class105.field1971[var1] = null;
        }
        class195.field3792 = 0;
        class167.field3223 = false;
        class167.method1079(0, (byte) 74);
        for (int var2 = 0; var2 < 100; var2++) {
            field2071[var2] = null;
        }
        class193.field3759 = 0;
        class140.field2614 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class9.field166 = 0;
        class167.field3225 = (int) (Math.random() * 30.0D) - 20;
        class21.field463 = (int) (Math.random() * 110.0D) - 55;
        class66.field1291 = 0;
        class34.field746 = -1;
        class92.field1740 = (int) (Math.random() * 100.0D) - 50;
        class64.field1256 = 0;
        class140.field2620 = (int) (Math.random() * 120.0D) - 60;
        class73.field1421 = 0;
        class18.field378 = 0;
        class96.field1769 = 0;
        class55.field1094 = 0;
        class182.field3582 = false;
        class31.field661 = (int) (Math.random() * 80.0D) - 40;
        for (int var3 = 0; var3 < 2048; var3++) {
            class183.field3600[var3] = null;
            class76.field1489[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            client.field632[var4] = null;
        }
        class175.field3447 = class183.field3600[2047] = new class212();
        class184.field3609.method916((byte) 110);
        class170.field3281.method916((byte) 110);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var15 = 0; var15 < 104; var15++) {
                    class160.field2985[var5][var14][var15] = null;
                }
            }
        }
        class108.field2017 = new class145();
        class22.field476 = 0;
        class129.field2442 = 0;
        for (int var6 = 0; var6 < class98.field1794; var6++) {
            class207 var13 = class48.method334((byte) -6, var6);
            if (var13 != null && var13.field4038 == 0) {
                class93.field1746[var6] = 0;
                class45.field913[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class172.field3344.length; var7++) {
            class172.field3344[var7] = -1;
        }
        if (class134.field2539 != -1) {
            class48.method337(class134.field2539, (byte) 80);
        }
        for (class157 var8 = (class157) client.field637.method684((byte) -76); var8 != null; var8 = (class157) client.field637.method678(false)) {
            class176.method1170(true, var8, 1540);
        }
        class134.field2539 = -1;
        client.field637 = new class112(8);
        class167.field3223 = false;
        class93.field1749 = null;
        class195.field3792 = 0;
        class193.field3760.method703(-983186360, -1, false, new int[5], null);
        for (int var9 = 0; var9 < 8; var9++) {
            class135.field2557[var9] = null;
            class157.field2944[var9] = false;
        }
        class215.method1411((byte) -31);
        class119.field2198 = arg0;
        for (int var10 = 0; var10 < 100; var10++) {
            class70.field1373[var10] = true;
        }
        class172.field3352 = null;
        class70.field1352 = 0;
        class131.field2469 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            class176.field3459[var11] = new class135();
        }
        for (int var12 = 0; var12 < 25; var12++) {
            class198.field3863[var12] = 0;
            client.field630[var12] = 0;
            class18.field380[var12] = 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2068++;
        return "Cache:" + this.field2058;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method671(int arg0) {
        if (arg0 != -26956) {
            return;
        }
        field2055 = null;
        field2054 = null;
        field2071 = null;
        field2065 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static final void method672(byte arg0) {
        int var1 = 79 % ((arg0 - 10) / 56);
        field2066++;
        class193.field3757.method53(-51);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)Z")
    public final boolean method673(byte[] arg0, int arg1, int arg2, int arg3) {
        field2067++;
        if (arg2 != 0) {
            return false;
        }
        class153 var5 = this.field2063;
        synchronized (this.field2063) {
            if (arg3 < 0 || this.field2059 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method674(true, -98, arg1, arg3, arg0);
            if (!var6) {
                var6 = this.method674(false, -120, arg1, arg3, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII[B)Z")
    private final boolean method674(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field2053++;
        class153 var6 = this.field2063;
        synchronized (this.field2063) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg2 * 6 + 6) > this.field2069.method1005((byte) -94)) {
                        return false;
                    }
                    this.field2069.method1002((long) (arg2 * 6), -1837);
                    this.field2069.method1010(6, class119.field2194, -1, 0);
                    var7 = (class119.field2194[5] & 0xFF) + ((class119.field2194[3] & 0xFF) << 16) + ((class119.field2194[4] & 0xFF) << 8);
                    if (var7 <= 0 || this.field2063.method1005((byte) -87) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2063.method1005((byte) 98) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class119.field2194[5] = (byte) var7;
                class119.field2194[2] = (byte) arg3;
                class119.field2194[0] = (byte) (arg3 >> 16);
                int var10 = -47 / ((arg1 + 29) / 56);
                class119.field2194[3] = (byte) (var7 >> 16);
                class119.field2194[4] = (byte) (var7 >> 8);
                class119.field2194[1] = (byte) (arg3 >> 8);
                int var11 = 0;
                this.field2069.method1002((long) (arg2 * 6), -1837);
                this.field2069.method1001(class119.field2194, 0, (byte) 111, 6);
                int var12 = 0;
                while (var11 < arg3) {
                    int var13 = 0;
                    if (arg0) {
                        label105: {
                            this.field2063.method1002((long) (var7 * 520), -1837);
                            try {
                                this.field2063.method1010(8, class119.field2194, -1, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class119.field2194[5] & 0xFF) << 8) + ((class119.field2194[4] & 0xFF) << 16) + (class119.field2194[6] & 0xFF);
                            int var14 = ((class119.field2194[2] & 0xFF) << 8) + (class119.field2194[3] & 0xFF);
                            int var15 = class119.field2194[7] & 0xFF;
                            int var16 = ((class119.field2194[0] & 0xFF) << 8) + (class119.field2194[1] & 0xFF);
                            if (arg2 == var16 && var12 == var14 && this.field2058 == var15) {
                                if (var13 >= 0 && (long) var13 <= this.field2063.method1005((byte) -77) / 520L) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field2063.method1005((byte) 68) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class119.field2194[1] = (byte) arg2;
                    class119.field2194[2] = (byte) (var12 >> 8);
                    class119.field2194[3] = (byte) var12;
                    var12++;
                    class119.field2194[7] = (byte) this.field2058;
                    if (arg3 - var11 <= 512) {
                        var13 = 0;
                    }
                    class119.field2194[0] = (byte) (arg2 >> 8);
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class119.field2194[5] = (byte) (var13 >> 8);
                    class119.field2194[4] = (byte) (var13 >> 16);
                    class119.field2194[6] = (byte) var13;
                    this.field2063.method1002((long) (var7 * 520), -1837);
                    var7 = var13;
                    this.field2063.method1001(class119.field2194, 0, (byte) 119, 8);
                    this.field2063.method1001(arg4, var11, (byte) 118, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILpd;Lpd;I)V")
    public class111(int arg0, class153 arg1, class153 arg2, int arg3) {
        this.field2058 = arg0;
        this.field2063 = arg1;
        this.field2069 = arg2;
        this.field2059 = arg3;
    }
}
