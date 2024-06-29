import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class144 {

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "B")
    private byte field2966;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field2957 = 0;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lha;")
    public static class66 field2959 = new class66();

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Led;")
    public static class43 field2970 = class191.method1219("(U4", false);

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    public static int[] field2969 = new int[1000];

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lig;")
    public static class80 field2968;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public final int method910(int arg0) {
        field2971++;
        if (arg0 == 0) {
            return (this.field2966 & 0x8) == 8 ? 1 : 0;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
    public final int method911(byte arg0) {
        if (arg0 != 110) {
            this.method910(-44);
        }
        field2963++;
        return this.field2966 & 0x7;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILa;I)V")
    public static final void method912(byte arg0, int arg1, class1 arg2, int arg3) {
        field2961++;
        if ((arg3 & 0x40) != 0) {
            arg2.field2340 = class38.field723.method541(936);
            if (arg2.field2340.method256(true, 0) == 126) {
                arg2.field2340 = arg2.field2340.method238(arg0 + 133, 1);
                class81.method504(arg2.field2340, arg2.field23, 2, (byte) 97);
            } else if (class67.field1348 == arg2) {
                class81.method504(arg2.field2340, arg2.field23, 2, (byte) 117);
            }
            arg2.field2367 = 0;
            arg2.field2353 = 150;
            arg2.field2319 = 0;
        }
        if ((arg3 & 0x1) != 0) {
            int var4 = class38.field723.method543(arg0 ^ 0x48);
            byte[] var5 = new byte[var4];
            class89 var6 = new class89(var5);
            class38.field723.method534(0, var4, arg0 ^ 0xFFFF86EC, var5);
            class39.field744[arg1] = var6;
            arg2.method5(var6, (byte) -41);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field2380 = class38.field723.method579(112);
            if (arg2.field2380 == 65535) {
                arg2.field2380 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            int var7 = class38.field723.method560((byte) -69);
            int var8 = class38.field723.method560((byte) -69);
            arg2.method762(var7, var8, client.field559, -127);
            arg2.field2312 = client.field559 + 300;
            arg2.field2363 = class38.field723.method538((byte) 108);
            arg2.field2337 = class38.field723.method560((byte) -69);
        }
        if ((arg3 & 0x2) != 0) {
            int var9 = class38.field723.method555(-1113627096);
            int var10 = class38.field723.method543(-6);
            int var11 = class38.field723.method543(-6);
            int var12 = class38.field723.field1727;
            if (arg2.field23 != null && arg2.field24 != null) {
                long var13 = arg2.field23.method249(-48);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class73.field1457; var16++) {
                        if (class78.field1546[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && class57.field1122 == 0) {
                    class1.field26.field1727 = 0;
                    class38.field723.method568(var11, 0, class1.field26.field1769, 107);
                    class1.field26.field1727 = 0;
                    class43 var17 = class151.method945(class109.method678((byte) -128, class1.field26).method245(0));
                    arg2.field2340 = var17.method247((byte) -87);
                    arg2.field2367 = var9 >> 8;
                    arg2.field2353 = 150;
                    arg2.field2319 = var9 & 0xFF;
                    if (var10 == 2 || var10 == 3) {
                        class81.method504(var17, class167.method1036(new class43[] { class158.field3199, arg2.field23 }, true), 1, (byte) 113);
                    } else if (var10 == 1) {
                        class81.method504(var17, class167.method1036(new class43[] { class153.field3112, arg2.field23 }, true), 1, (byte) 65);
                    } else {
                        class81.method504(var17, arg2.field23, 2, (byte) 116);
                    }
                }
            }
            class38.field723.field1727 = var11 + var12;
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field2349 = class38.field723.method563(arg0 ^ 0x6413);
            arg2.field2339 = class38.field723.method563(-25695);
        }
        if ((arg3 & 0x80) != 0) {
            int var18 = class38.field723.method578(arg0 + 78);
            int var19 = class38.field723.method578(0);
            arg2.method762(var18, var19, client.field559, -128);
            arg2.field2312 = client.field559 + 300;
            arg2.field2363 = class38.field723.method543(-6);
            arg2.field2337 = class38.field723.method560((byte) -69);
        }
        if ((arg3 & 0x8) != 0) {
            int var20 = class38.field723.method544(true);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class38.field723.method578(0);
            class77.method477((byte) 75, var20, var21, arg2);
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field2370 = class38.field723.method538((byte) -102);
            arg2.field2313 = class38.field723.method578(0);
            arg2.field2358 = class38.field723.method578(0);
            arg2.field2373 = class38.field723.method543(arg0 ^ 0x48);
            arg2.field2365 = class38.field723.method544(true) + client.field559;
            arg2.field2333 = class38.field723.method563(-25695) + client.field559;
            arg2.field2318 = class38.field723.method543(-6);
            arg2.field2348 = 0;
            arg2.field2377 = 1;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field2364 = class38.field723.method563(-25695);
            int var22 = class38.field723.method532((byte) 17);
            arg2.field2345 = (var22 & 0xFFFF) + client.field559;
            arg2.field2325 = 0;
            if (arg2.field2364 == 65535) {
                arg2.field2364 = -1;
            }
            if (client.field559 < arg2.field2345) {
                arg2.field2325 = -1;
            }
            arg2.field2366 = var22 >> 16;
            arg2.field2324 = 0;
        }
        if (arg0 != -78) {
            method914((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class144() {
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public static final void method913(byte arg0) {
        field2965++;
        class81.field1601 = 0;
        class27.field481 = true;
        class189.field3701 = 0L;
        class119.field2376 = true;
        class153.field3086 = 0;
        class116.field2267 = 0;
        class80.field1592 = 0;
        class114.field2183 = 0;
        class204.field3979 = 0;
        class68.field1362 = 0;
        class108.field2082 = 0;
        class114.field2191 = 0;
        class201.field3952 = 0;
        class36.field693 = 0;
        class109.field2101 = 0;
        class102.field1941 = 0;
        class89.field1764 = 0;
        field2965 = 0;
        class87.field1686 = 0;
        class87.field1706 = 0;
        class12.field185 = 0;
        class89.field1763 = 0;
        class40.field760 = 0;
        class89.field1765 = 0;
        class32.field605 = 0;
        class182.field3599 = 0;
        class64.field1311 = 0;
        class176.field3496 = 0;
        class92.field1820 = 0;
        class54.field1075 = 0;
        class89.field1741 = 0;
        class58.field1161 = 0;
        class150.field3033 = 0;
        class184.field3624 = 0;
        class29.field519 = 0;
        client.field548 = 0;
        class23.field399 = 0;
        class184.field3622 = 0;
        class157.field3166 = 0;
        class103.field1953 = 0;
        class64.field1312 = 0;
        class125.field2491 = 0;
        class58.field1138 = 0;
        class43.field839 = 0;
        class28.field510 = 0;
        class153.field3092 = 0;
        class207.field4041 = 0;
        class164.field3283 = 0;
        class187.field3671 = 0;
        class46.field888 = 0;
        class17.field271 = 0;
        class85.field1665 = 0;
        class167.field3300 = 0;
        class40.field758 = 0;
        class142.field2943 = 0;
        class89.field1756 = 0;
        class187.field3681 = 0;
        class125.field2473 = 0;
        class206.field4018 = 0;
        class142.field2936 = 0;
        class33.field619 = 0;
        class43.field849 = 0;
        class41.field805 = 0;
        class15.field228 = 0;
        class43.field837 = 0;
        class43.field857 = 0;
        class136.field2832 = 0;
        class40.field764 = 0;
        class78.field1556 = 0;
        class66.field1332 = 0;
        class153.field3110 = 0;
        class32.field590 = 0;
        class58.field1165 = 0;
        class191.field3718 = 0;
        class2.field62 = 0;
        class67.field1355 = 0;
        class60.field1228 = 0;
        class140.field2914 = 0;
        class33.field618 = 0;
        class206.field4027 = 0;
        class51.field1023 = 0;
        class126.field2507 = 0;
        class184.field3629 = 0;
        class114.field2188 = 0;
        class22.field370 = 0;
        class114.field2176 = 0;
        class91.field1813 = 0;
        class49.field984 = 0;
        class139.field2889 = 0;
        class114.field2187 = 0;
        class15.field218 = 0;
        class107.field2039 = 0;
        class75.field1497 = 0;
        class100.field1920 = 0;
        class79.field1570 = 0;
        class89.field1760 = 0;
        class125.field2479 = 0;
        class71.field1395 = 0;
        class114.field2189 = 0;
        class81.field1606 = 0;
        class50.field1003 = 0;
        class46.field936 = 0;
        class153.field3097 = 0;
        class43.field834 = 0;
        class127.field2526 = 0;
        class128.field2563 = 0;
        class49.field986 = 0;
        class125.field2470 = 0;
        class193.field3773 = 0;
        class107.field2054 = 0;
        class20.field350 = 0;
        class35.field637 = 0;
        class193.field3735 = 0;
        class17.field276 = 0;
        class18.field312 = 0;
        class89.field1753 = 0;
        class109.field2098 = 0;
        class109.field2104 = 0;
        class34.field627 = 0;
        class82.field1618 = 0;
        class205.field3989 = 0;
        class86.field1679 = 0;
        class1.field18 = 0;
        class58.field1151 = 0;
        class2.field58 = 0;
        class73.field1430 = 0;
        class182.field3596 = 0;
        class29.field523 = 0;
        class194.field3780 = 0;
        class52.field1051 = 0;
        class17.field285 = 0;
        class206.field4028 = 0;
        class153.field3100 = 0;
        class79.field1569 = 0;
        class194.field3783 = 0;
        class164.field3277 = 0;
        class104.field1984 = 0;
        class131.field2745 = 0;
        class124.field2454 = 0;
        class43.field843 = 0;
        class142.field2945 = 0;
        class139.field2874 = 0;
        class43.field836 = 0;
        class46.field900 = 0;
        class65.field1326 = 0;
        class47.field958 = 0;
        class43.field815 = 0;
        class176.field3495 = 0;
        class170.field3392 = 0;
        class119.field2316 = 0;
        class59.field1180 = 0;
        class124.field2456 = 0;
        class58.field1171 = 0;
        class150.field3041 = 0;
        class132.field2759 = 0;
        class80.field1588 = 0;
        class171.field3420 = 0;
        class105.field2008 = 0;
        class32.field602 = 0;
        class73.field1426 = 0;
        class186.field3660 = 0;
        class4.field96 = 0;
        class65.field1321 = 0;
        class180.field3579 = 0;
        class167.field3293 = 0;
        class27.field487 = 0;
        class118.field2296 = 0;
        class205.field3992 = 0;
        class21.field360 = 0;
        class22.field376 = 0;
        class75.field1481 = 0;
        class114.field2200 = 0;
        class32.field601 = 0;
        class194.field3792 = 0;
        class80.field1594 = 0;
        class84.field1645 = 0;
        class51.field1028 = 0;
        class170.field3398 = 0;
        class207.field4048 = 0;
        class114.field2216 = 0;
        class98.field1899 = 0;
        class206.field4034 = 0;
        class52.field1053 = 0;
        client.field546 = 0;
        class83.field1627 = 0;
        class117.field2291 = 0;
        class114.field2207 = 0;
        class78.field1551 = 0;
        class132.field2754 = 0;
        class47.field955 = 0;
        class80.field1577 = 0;
        class140.field2898 = 0;
        class127.field2521 = 0;
        class43.field831 = 0;
        class43.field862 = 0;
        class75.field1488 = 0;
        class189.field3697 = 0;
        class66.field1335 = 0;
        class205.field4010 = 0;
        class5.field107 = 0;
        class89.field1736 = 0;
        class182.field3606 = 0;
        class129.field2625 = 0;
        class90.field1794 = 0;
        class80.field1590 = 0;
        class193.field3761 = 0;
        class58.field1141 = 0;
        client.field544 = 0;
        class89.field1776 = 0;
        class81.field1605 = 0;
        class2.field55 = 0;
        class149.field3029 = 0;
        class15.field220 = 0;
        class15.field219 = 0;
        class118.field2301 = 0;
        class41.field787 = 0;
        class166.field3291 = 0;
        class15.field225 = 0;
        class194.field3795 = 0;
        class116.field2275 = 0;
        class59.field1201 = 0;
        class97.field1889 = 0;
        class23.field412 = 0;
        class89.field1751 = 0;
        class95.field1857 = 0;
        class43.field847 = 0;
        class97.field1891 = 0;
        class107.field2045 = 0;
        class193.field3739 = 0;
        class54.field1084 = 0;
        class126.field2500 = 0;
        class7.field139 = 0;
        class139.field2884 = 0;
        class60.field1230 = 0;
        if (arg0 > -112) {
            return;
        }
        class43.field855 = 0;
        class43.field851 = 0;
        class80.field1583 = 0;
        class58.field1139 = 0;
        class107.field2036 = 0;
        class43.field854 = 0;
        class108.field2087 = 0;
        class23.field436 = 0;
        class16.field244 = 0;
        class73.field1440 = 0;
        class106.field2029 = 0;
        class118.field2309 = 0;
        class89.field1772 = 0;
        class20.field340 = 0;
        class194.field3787 = 0;
        class73.field1416 = 0;
        class200.field3936 = 0;
        class67.field1344 = 0;
        class89.field1745 = 0;
        class20.field349 = 0;
        class158.field3192 = 0;
        class87.field1695 = 0;
        class114.field2177 = 0;
        class1.field8 = 0;
        class175.field3479 = 0;
        class44.field874 = 0;
        class129.field2629 = 0;
        class149.field3031 = 0;
        class126.field2508 = 0;
        class84.field1648 = 0;
        class47.field951 = 0;
        class59.field1210 = 0;
        class12.field175 = 0;
        class35.field640 = 0;
        class66.field1331 = 0;
        class43.field832 = 0;
        class19.field320 = 0;
        class176.field3494 = 0;
        class32.field600 = 0;
        class61.field1246 = 0;
        class186.field3664 = 0;
        class41.field813 = 0;
        class52.field1056 = 0;
        class75.field1480 = 0;
        class89.field1767 = 0;
        class58.field1169 = 0;
        class50.field1006 = 0;
        class22.field368 = 0;
        class132.field2752 = 0;
        class59.field1195 = 0;
        class21.field358 = 0;
        class58.field1159 = 0;
        class122.field2444 = 0;
        class118.field2300 = 0;
        class126.field2502 = 0;
        class51.field1030 = 0;
        class114.field2170 = 0;
        class107.field2051 = 0;
        class46.field934 = 0;
        class106.field2031 = 0;
        class109.field2112 = 0;
        class51.field1045 = 0;
        class97.field1878 = 0;
        class88.field1713 = 0;
        class59.field1189 = 0;
        class171.field3408 = 0;
        class200.field3941 = 0;
        class81.field1611 = 0;
        class16.field270 = 0;
        class180.field3581 = 0;
        class54.field1086 = 0;
        class43.field850 = 0;
        class105.field2014 = 0;
        class5.field101 = 0;
        class119.field2368 = 0;
        class161.field3247 = 0;
        class186.field3657 = 0;
        class17.field293 = 0;
        class205.field4004 = 0;
        class107.field2046 = 0;
        class182.field3610 = 0;
        class67.field1352 = 0;
        class43.field828 = 0;
        class122.field2446 = 0;
        class43.field835 = 0;
        class206.field4020 = 0;
        class7.field148 = 0;
        class80.field1597 = 0;
        class66.field1334 = 0;
        class109.field2103 = 0;
        class57.field1115 = 0;
        class119.field2359 = 0;
        class67.field1338 = 0;
        class205.field4007 = 0;
        class89.field1786 = 0;
        class35.field646 = 0;
        class51.field1022 = 0;
        class205.field4008 = 0;
        class107.field2048 = 0;
        class16.field261 = 0;
        class89.field1747 = 0;
        class89.field1731 = 0;
        class106.field2025 = 0;
        class206.field4014 = 0;
        class156.field3159 = 0;
        class129.field2573 = 0;
        field2961 = 0;
        class182.field3607 = 0;
        class52.field1054 = 0;
        class102.field1943 = 0;
        class114.field2213 = 0;
        class126.field2504 = 0;
        class68.field1375 = 0;
        class139.field2890 = 0;
        class117.field2287 = 0;
        class85.field1671 = 0;
        class71.field1394 = 0;
        class34.field622 = 0;
        class153.field3085 = 0;
        class133.field2783 = 0;
        class19.field326 = 0;
        class54.field1082 = 0;
        class109.field2099 = 0;
        class119.field2321 = 0;
        class200.field3937 = 0;
        class116.field2259 = 0;
        class20.field338 = 0;
        class35.field628 = 0;
        class98.field1893 = 0;
        class41.field792 = 0;
        class156.field3161 = 0;
        class12.field174 = 0;
        class136.field2820 = 0;
        class109.field2110 = 0;
        class114.field2162 = 0;
        class53.field1064 = 0;
        class167.field3299 = 0;
        class28.field497 = 0;
        class20.field351 = 0;
        class90.field1788 = 0;
        class86.field1676 = 0;
        class89.field1746 = 0;
        class5.field104 = 0;
        class43.field859 = 0;
        class193.field3759 = 0;
        class43.field860 = 0;
        class193.field3744 = 0;
        class73.field1441 = 0;
        class103.field1960 = 0;
        class193.field3766 = 0;
        class153.field3091 = 0;
        class90.field1806 = 0;
        class138.field2866 = 0;
        class49.field990 = 0;
        class119.field2362 = 0;
        class89.field1770 = 0;
        class43.field833 = 0;
        class193.field3738 = 0;
        class102.field1940 = 0;
        class140.field2921 = 0;
        class136.field2828 = 0;
        class89.field1774 = 0;
        class89.field1750 = 0;
        class105.field2015 = 0;
        class93.field1838 = 0;
        class89.field1740 = 0;
        class40.field777 = 0;
        class44.field878 = 0;
        class132.field2748 = 0;
        class61.field1248 = 0;
        class48.field980 = 0;
        class114.field2212 = 0;
        class180.field3580 = 0;
        class79.field1561 = 0;
        class117.field2280 = 0;
        class153.field3109 = 0;
        class37.field716 = 0;
        class6.field126 = 0;
        class193.field3733 = 0;
        class51.field1040 = 0;
        class193.field3747 = 0;
        class65.field1324 = 0;
        class201.field3950 = 0;
        class33.field608 = 0;
        class89.field1742 = 0;
        class84.field1657 = 0;
        class23.field429 = 0;
        client.field543 = 0;
        class5.field108 = 0;
        class23.field415 = 0;
        class114.field2206 = 0;
        class89.field1762 = 0;
        client.field555 = 0;
        class122.field2443 = 0;
        class13.field189 = 0;
        class187.field3674 = 0;
        class52.field1057 = 0;
        class140.field2901 = 0;
        class108.field2061 = 0;
        class81.field1614 = 0;
        class167.field3329 = 0;
        class105.field2010 = 0;
        class171.field3411 = 0;
        class188.field3684 = 0;
        class77.field1541 = 0;
        class89.field1754 = 0;
        class89.field1749 = 0;
        class108.field2063 = 0;
        class142.field2944 = 0;
        class114.field2168 = 0;
        class110.field2118 = 0;
        class193.field3734 = 0;
        class29.field517 = 0;
        class85.field1659 = 0;
        class66.field1333 = 0;
        class74.field1475 = 0;
        class71.field1401 = 0;
        class89.field1759 = 0;
        class100.field1910 = 0;
        class60.field1227 = 0;
        class36.field669 = 0;
        class23.field425 = 0;
        class40.field759 = 0;
        class75.field1487 = 0;
        class142.field2935 = 0;
        class54.field1080 = 0;
        class205.field3986 = 0;
        class188.field3683 = 0;
        class103.field1962 = 0;
        class184.field3634 = 0;
        class124.field2468 = 0;
        class43.field824 = 0;
        class93.field1831 = 0;
        class110.field2131 = 0;
        class154.field3118 = 0;
        class18.field315 = 0;
        class60.field1242 = 0;
        class105.field1999 = 0;
        class51.field1037 = 0;
        class14.field213 = 0;
        class51.field1047 = 0;
        class17.field287 = 0;
        class73.field1428 = 0;
        class86.field1673 = 0;
        class193.field3737 = 0;
        class46.field939 = 0;
        class176.field3500 = 0;
        class116.field2261 = 0;
        class145.field2984 = 0;
        class193.field3746 = 0;
        class127.field2533 = 0;
        class23.field427 = 0;
        class154.field3130 = 0;
        class19.field332 = 0;
        class74.field1469 = 0;
        class36.field647 = 0;
        class105.field2001 = 0;
        class112.field2146 = 0;
        class187.field3669 = 0;
        class69.field1376 = 0;
        class54.field1087 = 0;
        class153.field3087 = 0;
        class54.field1090 = 0;
        class46.field945 = 0;
        class205.field3990 = 0;
        class79.field1568 = 0;
        class170.field3397 = 0;
        class193.field3770 = 0;
        class136.field2822 = 0;
        class2.field60 = 0;
        class17.field284 = 0;
        class182.field3601 = 0;
        class53.field1069 = 0;
        class99.field1906 = 0;
        class74.field1466 = 0;
        class157.field3164 = 0;
        class87.field1690 = 0;
        class206.field4016 = 0;
        class153.field3098 = 0;
        class29.field521 = 0;
        class207.field4043 = 0;
        class149.field3032 = 0;
        class46.field887 = 0;
        class2.field46 = 0;
        class57.field1110 = 0;
        class115.field2246 = 0;
        class128.field2561 = 0;
        class30.field562 = 0;
        class34.field623 = 0;
        class108.field2090 = 0;
        class108.field2066 = 0;
        class16.field246 = 0;
        class206.field4011 = 0;
        class193.field3751 = 0;
        class90.field1799 = 0;
        class17.field277 = 0;
        class43.field820 = 0;
        class41.field811 = 0;
        class89.field1757 = 0;
        class193.field3765 = 0;
        class157.field3169 = 0;
        class41.field791 = 0;
        class193.field3764 = 0;
        class54.field1093 = 0;
        class2.field56 = 0;
        class37.field709 = 0;
        class188.field3693 = 0;
        class142.field2937 = 0;
        class189.field3705 = 0;
        class58.field1150 = 0;
        class153.field3102 = 0;
        class51.field1026 = 0;
        class2.field40 = 0;
        class127.field2528 = 0;
        class114.field2180 = 0;
        class114.field2192 = 0;
        class48.field965 = 0;
        class69.field1379 = 0;
        class138.field2860 = 0;
        client.field554 = 0;
        class150.field3038 = 0;
        class182.field3608 = 0;
        class58.field1136 = 0;
        class157.field3172 = 0;
        class73.field1424 = 0;
        class153.field3088 = 0;
        class193.field3730 = 0;
        class67.field1341 = 0;
        class46.field902 = 0;
        class101.field1932 = 0;
        class15.field222 = 0;
        class157.field3180 = 0;
        class159.field3216 = 0;
        class159.field3208 = 0;
        class58.field1128 = 0;
        class30.field565 = 0;
        class82.field1624 = 0;
        class27.field485 = 0;
        class58.field1167 = 0;
        class89.field1730 = 0;
        class136.field2821 = 0;
        class60.field1233 = 0;
        class47.field952 = 0;
        class101.field1927 = 0;
        class89.field1726 = 0;
        class121.field2398 = 0;
        class1.field4 = 0;
        class114.field2181 = 0;
        class89.field1768 = 0;
        class73.field1418 = 0;
        class105.field1997 = 0;
        class43.field848 = 0;
        class104.field1970 = 0;
        class35.field633 = 0;
        class43.field829 = 0;
        class80.field1595 = 0;
        class50.field1008 = 0;
        class139.field2880 = 0;
        class73.field1425 = 0;
        class148.field3019 = 0;
        class147.field3006 = 0;
        class164.field3285 = 0;
        class100.field1916 = 0;
        class66.field1337 = 0;
        class182.field3595 = 0;
        class2.field51 = 0;
        class193.field3750 = 0;
        class87.field1707 = 0;
        class127.field2524 = 0;
        class80.field1574 = 0;
        class80.field1573 = 0;
        class114.field2196 = 0;
        class89.field1752 = 0;
        class114.field2175 = 0;
        class73.field1427 = 0;
        class121.field2416 = 0;
        class109.field2096 = 0;
        class193.field3736 = 0;
        class89.field1748 = 0;
        class189.field3704 = 0;
        class58.field1163 = 0;
        class59.field1202 = 0;
        class38.field721 = 0;
        class65.field1317 = 0;
        class29.field526 = 0;
        class116.field2273 = 0;
        class163.field3269 = 0;
        class118.field2308 = 0;
        class22.field380 = 0;
        class85.field1668 = 0;
        class137.field2851 = 0;
        class36.field694 = 0;
        class68.field1364 = 0;
        class89.field1761 = 0;
        class40.field781 = 0;
        class205.field3993 = 0;
        client.field556 = 0;
        class164.field3276 = 0;
        class46.field921 = 0;
        class193.field3768 = 0;
        class114.field2157 = 0;
        class18.field305 = 0;
        class58.field1142 = 0;
        class136.field2833 = 0;
        class193.field3769 = 0;
        class182.field3592 = 0;
        class154.field3138 = 0;
        class172.field3438 = 0;
        class89.field1735 = 0;
        class140.field2923 = 0;
        class58.field1148 = 0;
        class28.field513 = 0;
        class188.field3689 = 0;
        class73.field1432 = 0;
        class54.field1079 = 0;
        class107.field2040 = 0;
        class41.field790 = 0;
        class60.field1240 = 0;
        class60.field1232 = 0;
        class20.field352 = 0;
        class87.field1698 = 0;
        class78.field1550 = 0;
        class80.field1576 = 0;
        class59.field1215 = 0;
        class114.field2154 = 0;
        class180.field3586 = 0;
        class128.field2564 = 0;
        class17.field280 = 0;
        class164.field3281 = 0;
        class139.field2882 = 0;
        class48.field979 = 0;
        class89.field1755 = 0;
        class117.field2285 = 0;
        class30.field563 = 0;
        class39.field732 = 0;
        class118.field2306 = 0;
        class59.field1217 = 0;
        class198.field3899 = 0;
        class71.field1403 = 0;
        class156.field3143 = 0;
        class73.field1431 = 0;
        class23.field419 = 0;
        class51.field1018 = 0;
        class114.field2166 = 0;
        class182.field3602 = 0;
        class75.field1486 = 0;
        class185.field3644 = 0;
        class75.field1494 = 0;
        class167.field3292 = 0;
        class87.field1699 = 0;
        class40.field773 = 0;
        class182.field3609 = 0;
        class101.field1938 = 0;
        class93.field1845 = 0;
        class118.field2303 = 0;
        class43.field819 = 0;
        class28.field492 = 0;
        class173.field3446 = 0;
        class127.field2516 = 0;
        class80.field1589 = 0;
        class157.field3173 = 0;
        class36.field654 = 0;
        class2.field59 = 0;
        class105.field2023 = 0;
        class174.field3467 = 0;
        class194.field3790 = 0;
        class54.field1074 = 0;
        class193.field3774 = 0;
        class48.field963 = 0;
        class118.field2295 = 0;
        class206.field4013 = 0;
        class173.field3451 = 0;
        class14.field212 = 0;
        class153.field3105 = 0;
        field2971 = 0;
        class23.field398 = 0;
        class89.field1787 = 0;
        class107.field2053 = 0;
        class110.field2128 = 0;
        class5.field109 = 0;
        class101.field1936 = 0;
        class2.field61 = 0;
        class156.field3162 = 0;
        class107.field2037 = 0;
        client.field549 = 0;
        class153.field3101 = 0;
        class43.field863 = 0;
        class39.field739 = 0;
        class132.field2751 = 0;
        class54.field1083 = 0;
        class95.field1867 = 0;
        class43.field817 = 0;
        class114.field2159 = 0;
        class71.field1400 = 0;
        class92.field1824 = 0;
        class175.field3482 = 0;
        class139.field2877 = 0;
        class90.field1797 = 0;
        class35.field635 = 0;
        class103.field1969 = 0;
        class93.field1841 = 0;
        client.field545 = 0;
        class52.field1052 = 0;
        class21.field362 = 0;
        class140.field2924 = 0;
        class12.field176 = 0;
        class43.field825 = 0;
        class43.field858 = 0;
        class4.field95 = 0;
        class84.field1647 = 0;
        class32.field597 = 0;
        class81.field1604 = 0;
        class36.field696 = 0;
        class43.field816 = 0;
        class20.field345 = 0;
        class78.field1555 = 0;
        class129.field2650 = 0;
        class119.field2350 = 0;
        class114.field2185 = 0;
        class90.field1796 = 0;
        class203.field3963 = 0;
        class89.field1733 = 0;
        class54.field1076 = 0;
        class22.field375 = 0;
        class207.field4051 = 0;
        class91.field1808 = 0;
        class114.field2172 = 0;
        class47.field957 = 0;
        class17.field273 = 0;
        class201.field3954 = 0;
        class48.field960 = 0;
        class187.field3670 = 0;
        class173.field3449 = 0;
        class114.field2209 = 0;
        class26.field476 = 0;
        class105.field2000 = 0;
        class1.field16 = 0;
        class129.field2647 = 0;
        class81.field1608 = 0;
        class2.field44 = 0;
        class92.field1826 = 0;
        class114.field2158 = 0;
        class98.field1896 = 0;
        class119.field2354 = 0;
        class43.field830 = 0;
        class193.field3762 = 0;
        class89.field1779 = 0;
        class114.field2152 = 0;
        class95.field1862 = 0;
        class101.field1929 = 0;
        class129.field2649 = 0;
        class7.field138 = 0;
        class22.field372 = 0;
        class73.field1435 = 0;
        class43.field861 = 0;
        class128.field2567 = 0;
        class4.field86 = 0;
        class133.field2779 = 0;
        class133.field2781 = 0;
        class39.field751 = 0;
        class53.field1065 = 0;
        class89.field1785 = 0;
        class59.field1185 = 0;
        class139.field2887 = 0;
        class188.field3688 = 0;
        class206.field4031 = 0;
        class37.field713 = 0;
        class176.field3493 = 0;
        class176.field3491 = 0;
        class185.field3636 = 0;
        class201.field3947 = 0;
        class139.field2885 = 0;
        class2.field47 = 0;
        class43.field827 = 0;
        class35.field644 = 0;
        class88.field1709 = 0;
        class154.field3137 = 0;
        class142.field2932 = 0;
        class89.field1783 = 0;
        class43.field821 = 0;
        class100.field1912 = 0;
        class207.field4042 = 0;
        class193.field3767 = 0;
        class114.field2174 = 0;
        class89.field1766 = 0;
        class176.field3498 = 0;
        class32.field588 = 0;
        class164.field3286 = 0;
        class167.field3298 = 0;
        class193.field3742 = 0;
        class206.field4024 = 0;
        class189.field3709 = 0;
        class154.field3119 = 0;
        class53.field1071 = 0;
        class110.field2116 = 0;
        class140.field2920 = 0;
        class142.field2940 = 0;
        class43.field823 = 0;
        class205.field3987 = 0;
        class75.field1479 = 0;
        class17.field291 = 0;
        class14.field209 = 0;
        class191.field3711 = 0;
        class153.field3111 = 0;
        class114.field2201 = 0;
        class58.field1153 = 0;
        class46.field932 = 0;
        class124.field2466 = 0;
        class107.field2043 = 0;
        class67.field1354 = 0;
        class193.field3748 = 0;
        class90.field1789 = 0;
        class81.field1613 = 0;
        class93.field1832 = 0;
        class182.field3605 = 0;
        class124.field2467 = 0;
        class145.field2986 = 0;
        class57.field1118 = 0;
        class54.field1089 = 0;
        class58.field1154 = 0;
        class137.field2845 = 0;
        class50.field1004 = 0;
        class172.field3439 = 0;
        class23.field416 = 0;
        class89.field1778 = 0;
        class89.field1732 = 0;
        class201.field3948 = 0;
        class30.field561 = 0;
        class114.field2186 = 0;
        class182.field3600 = 0;
        class58.field1134 = 0;
        class207.field4050 = 0;
        class89.field1738 = 0;
        class172.field3432 = 0;
        class117.field2289 = 0;
        class154.field3120 = 0;
        class175.field3487 = 0;
        class81.field1603 = 0;
        class87.field1693 = 0;
        class112.field2142 = 0;
        class89.field1743 = 0;
        class108.field2077 = 0;
        class21.field365 = 0;
        class39.field747 = 0;
        client.field541 = 0;
        class189.field3706 = 0;
        class188.field3691 = 0;
        class15.field224 = 0;
        class59.field1213 = 0;
        class110.field2117 = 0;
        class20.field348 = 0;
        class205.field3994 = 0;
        class118.field2293 = 0;
        class18.field302 = 0;
        class40.field765 = 0;
        class58.field1133 = 0;
        class171.field3409 = 0;
        class28.field503 = 0;
        class145.field2979 = 0;
        class66.field1329 = 0;
        class136.field2818 = 0;
        class103.field1956 = 0;
        class119.field2329 = 0;
        class159.field3210 = 0;
        class4.field87 = 0;
        class7.field153 = 0;
        class79.field1572 = 0;
        class89.field1782 = 0;
        class126.field2498 = 0;
        class16.field236 = 0;
        class145.field2988 = 0;
        class114.field2195 = 0;
        class114.field2153 = 0;
        class1.field9 = 0;
        class58.field1140 = 0;
        class49.field985 = 0;
        class89.field1725 = 0;
        class19.field335 = 0;
        class83.field1636 = 0;
        class161.field3251 = 0;
        class46.field893 = 0;
        class12.field179 = 0;
        class118.field2297 = 0;
        class193.field3753 = 0;
        class59.field1194 = 0;
        class23.field449 = 0;
        class79.field1563 = 0;
        class17.field290 = 0;
        class114.field2161 = 0;
        class48.field974 = 0;
        class104.field1978 = 0;
        class99.field1907 = 0;
        class191.field3716 = 0;
        class2.field53 = 0;
        class38.field722 = 0;
        class137.field2846 = 0;
        class54.field1077 = 0;
        class137.field2836 = 0;
        class124.field2464 = 0;
        class127.field2541 = 0;
        class46.field942 = 0;
        class29.field524 = 0;
        class43.field841 = 0;
        class101.field1933 = 0;
        class57.field1119 = 0;
        class92.field1816 = 0;
        class77.field1538 = 0;
        class43.field842 = 0;
        class128.field2562 = 0;
        class171.field3421 = 0;
        class159.field3212 = 0;
        class108.field2071 = 0;
        class118.field2302 = 0;
        class37.field701 = 0;
        class154.field3113 = 0;
        class89.field1734 = 0;
        class15.field223 = 0;
        class101.field1926 = 0;
        class90.field1798 = 0;
        class51.field1032 = 0;
        class126.field2501 = 0;
        class58.field1157 = 0;
        class136.field2829 = 0;
        class108.field2072 = 0;
        class163.field3270 = 0;
        class29.field528 = 0;
        class49.field991 = 0;
        class80.field1578 = 0;
        class122.field2440 = 0;
        class57.field1112 = 0;
        class193.field3745 = 0;
        class203.field3958 = 0;
        class23.field414 = 0;
        class194.field3797 = 0;
        class43.field845 = 0;
        class99.field1902 = 0;
        class107.field2047 = 0;
        class129.field2628 = 0;
        class19.field322 = 0;
        class116.field2266 = 0;
        class114.field2211 = 0;
        class171.field3414 = 0;
        class127.field2547 = 0;
        class66.field1336 = 0;
        class189.field3694 = 0;
        class125.field2471 = 0;
        class174.field3466 = 0;
        class114.field2205 = 0;
        class114.field2178 = 0;
        class106.field2028 = 0;
        class140.field2913 = 0;
        class203.field3960 = 0;
        class1.field29 = 0;
        class147.field3003 = 0;
        class116.field2263 = 0;
        class35.field641 = 0;
        class75.field1491 = 0;
        class2.field52 = 0;
        class93.field1837 = 0;
        class9.field159 = 0;
        class91.field1811 = 0;
        class114.field2208 = 0;
        class65.field1320 = 0;
        class59.field1193 = 0;
        class41.field803 = 0;
        class129.field2670 = 0;
        class16.field237 = 0;
        class89.field1777 = 0;
        class97.field1885 = 0;
        class86.field1685 = 0;
        class129.field2691 = 0;
        class170.field3391 = 0;
        class129.field2627 = 0;
        class204.field3975 = 0;
        class30.field566 = 0;
        class40.field754 = 0;
        class68.field1373 = 0;
        class147.field3001 = 0;
        class159.field3207 = 0;
        class28.field505 = 0;
        class193.field3758 = 0;
        class115.field2258 = 0;
        class73.field1417 = 0;
        class85.field1670 = 0;
        class140.field2917 = 0;
        class40.field779 = 0;
        class187.field3680 = 0;
        class46.field929 = 0;
        class173.field3447 = 0;
        class23.field393 = 0;
        class117.field2292 = 0;
        class6.field115 = 0;
        class101.field1931 = 0;
        class37.field704 = 0;
        class89.field1758 = 0;
        class75.field1496 = 0;
        class128.field2556 = 0;
        class97.field1880 = 0;
        class18.field310 = 0;
        class16.field254 = 0;
        class161.field3263 = 0;
        class191.field3722 = 0;
        class28.field495 = 0;
        client.field550 = 0;
        class167.field3314 = 0;
        class55.field1101 = 0;
        class86.field1682 = 0;
        class103.field1968 = 0;
        class35.field636 = 0;
        class88.field1716 = 0;
        class55.field1103 = 0;
        class74.field1472 = 0;
        class79.field1558 = 0;
        class180.field3588 = 0;
        class77.field1537 = 0;
        class88.field1718 = 0;
        class22.field384 = 0;
        class57.field1111 = 0;
        class138.field2856 = 0;
        class100.field1914 = 0;
        class71.field1396 = 0;
        class153.field3089 = 0;
        class193.field3743 = 0;
        class75.field1489 = 0;
        class75.field1490 = 0;
        class187.field3679 = 0;
        class51.field1041 = 0;
        class193.field3757 = 0;
        class75.field1500 = 0;
        class51.field1046 = 0;
        client.field547 = 0;
        class20.field341 = 0;
        class89.field1773 = 0;
        class187.field3675 = 0;
        class32.field603 = 0;
        class205.field3988 = 0;
        class193.field3731 = 0;
        class74.field1476 = 0;
        class161.field3262 = 0;
        class43.field846 = 0;
        class77.field1543 = 0;
        class114.field2202 = 0;
        class73.field1422 = 0;
        class172.field3443 = 0;
        class105.field2011 = 0;
        class4.field97 = 0;
        class58.field1143 = 0;
        class96.field1870 = 0;
        class108.field2078 = 0;
        class14.field214 = 0;
        class200.field3939 = 0;
        class104.field1983 = 0;
        class119.field2311 = 0;
        class58.field1132 = 0;
        class118.field2305 = 0;
        class97.field1888 = 0;
        class89.field1771 = 0;
        class193.field3771 = 0;
        class30.field567 = 0;
        class98.field1895 = 0;
        field2963 = 0;
        class102.field1944 = 0;
        class55.field1104 = 0;
        class79.field1557 = 0;
        class87.field1688 = 0;
        class81.field1607 = 0;
        class114.field2194 = 0;
        class67.field1339 = 0;
        class137.field2844 = 0;
        class153.field3090 = 0;
        class59.field1211 = 0;
        class49.field997 = 0;
        class140.field2896 = 0;
        class9.field158 = 0;
        class116.field2265 = 0;
        class23.field453.field3220 = 0;
        class32.method178(1024);
        class96.field1871 = -1;
        class7.field147 = 0;
        class157.field3182 = -1;
        class175.field3490 = 0;
        class29.field522.field1727 = 0;
        class18.field298 = -1;
        class38.field723.field1727 = 0;
        class41.field799 = 0;
        class20.field343 = 0;
        class198.field3906 = -1;
        class186.field3665 = false;
        class204.field3970 = 0;
        class39.method213(0, 107);
        for (int var1 = 0; var1 < 100; var1++) {
            class132.field2760[var1] = null;
        }
        class95.field1864 = 0;
        class161.field3259 = 0;
        class118.field2307 = 0;
        class35.field631 = 0;
        class96.field1876 = -1;
        class142.field2933 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class48.field978 = (int) (Math.random() * 110.0D) - 55;
        class170.field3399 = 0;
        class23.field408 = 0;
        class204.field3967 = (int) (Math.random() * 120.0D) - 60;
        class149.field3026 = (int) (Math.random() * 80.0D) - 40;
        class124.field2457 = 0;
        class36.field650 = 0;
        class54.field1091 = (int) (Math.random() * 30.0D) - 20;
        class24.field456 = (int) (Math.random() * 100.0D) - 50;
        class174.field3464 = false;
        for (int var2 = 0; var2 < 2048; var2++) {
            class12.field183[var2] = null;
            class39.field744[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class172.field3433[var3] = null;
        }
        class67.field1348 = class12.field183[2047] = new class1();
        class100.field1915.method751(-15085);
        class54.field1081.method751(-15085);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class46.field922[var4][var12][var13] = null;
                }
            }
        }
        class176.field3499 = new class118();
        class50.field1016 = 0;
        class40.field778 = 0;
        for (int var5 = 0; var5 < class148.field3020; var5++) {
            class53 var11 = class191.method1216(255, var5);
            if (var11 != null && var11.field1073 == 0) {
                class35.field634[var5] = 0;
                class30.field569[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class51.field1033.length; var6++) {
            class51.field1033[var6] = -1;
        }
        if (class187.field3666 != -1) {
            class54.method327(class187.field3666, false);
        }
        for (class137 var7 = (class137) class15.field227.method76(-125); var7 != null; var7 = (class137) class15.field227.method79((byte) 76)) {
            class30.method158((byte) -119, var7, true);
        }
        class187.field3666 = -1;
        class15.field227 = new class17(8);
        class186.field3665 = false;
        class107.field2052 = null;
        class41.field799 = 0;
        class5.field103.method465((byte) 61, new int[5], false, -1, null);
        for (int var8 = 0; var8 < 8; var8++) {
            class157.field3174[var8] = null;
            class122.field2449[var8] = false;
        }
        class105.method648(121);
        class153.field3093 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class107.field2056[var9] = true;
        }
        class121.field2407 = 0;
        class33.field614 = null;
        class174.field3472 = null;
        for (int var10 = 0; var10 < 6; var10++) {
            class145.field2980[var10] = new class144();
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljg;)V")
    public class144(class89 arg0) {
        this.field2966 = arg0.method577((byte) 30);
        this.field2962 = arg0.method555(-1113627096);
        this.field2964 = arg0.method545(-7436);
        this.field2960 = arg0.method545(-7436);
        this.field2967 = arg0.method545(-7436);
        this.field2958 = arg0.method545(-7436);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
    public static void method914(byte arg0) {
        int var1 = 20 / ((55 - arg0) / 47);
        field2968 = null;
        field2959 = null;
        field2970 = null;
        field2969 = null;
    }
}
