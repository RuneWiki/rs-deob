import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class131 extends class54 {

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Ldc;")
    private static class37 field2447 = class185.method1233((byte) 86, "level)2");

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Ldc;")
    public static class37 field2455 = class185.method1233((byte) 86, "::noclip");

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Ldc;")
    public static class37 field2459 = null;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Ldc;")
    public static class37 field2444 = field2447;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "B")
    public byte field2457;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lwa;")
    public static class238 field2452;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Ldc;")
    public class37 field2445;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Ldc;")
    public class37 field2448;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field2451;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
    public static final void method915(int arg0, boolean arg1) {
        field2456++;
        if (arg0 <= 95) {
            return;
        }
        byte var2 = 4;
        byte[][] var3 = class118.field2117;
        for (int var4 = 0; var4 < var2; var4++) {
            class108.method707((byte) 104);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class214.field3999[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class142.field2745.length; var14++) {
                                if (class142.field2745[var14] == var13 && var3[var14] != null) {
                                    class84.method573((var11 & 0x7) * 8, arg1, var4, (byte) 11, var10, var3[var14], class11.field143, var5 * 8, var6 * 8, var9, (var12 & 0x7) * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class82.method561(-1, 8, var4, 8, var5 * 8, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static final void method916(int arg0) {
        class245.field4476.field4092 = 0;
        class9.field120 = true;
        class224.field4155 = true;
        class152.field2872 = 0;
        field2443++;
        class145.field2786 = 0;
        class139.field2689 = 0;
        class35.field700 = 0;
        class23.field413 = 0;
        class13.field176 = 0;
        class189.field3456 = 0;
        class197.field3686 = 0;
        class73.field1293 = 0;
        class139.field2691 = 0;
        class136.field2625 = 0;
        class77.field1361 = 0;
        class59.field1101 = 0;
        class174.field3313 = 0;
        class196.field3662 = 0;
        class91.field1562 = 0;
        class28.field487 = 0;
        class14.field198 = 0;
        class37.field756 = 0;
        class231.field4227 = 0;
        class159.field3010 = 0;
        class66.field1187 = 0;
        class73.field1301 = 0;
        class69.field1258 = 0;
        class85.field1497 = 0;
        class195.field3645 = 0;
        class106.field1846 = 0;
        class233.field4247 = 0;
        class15.field229 = 0;
        class74.field1307 = 0;
        class103.field1777 = 0;
        class135.field2498 = 0;
        class28.field475 = 0;
        class153.field2910 = 0;
        class26.field456 = 0;
        class184.field3406 = 0;
        class28.field490 = 0;
        class114.field2037 = 0;
        class2.field8 = 0;
        class230.field4223 = 0;
        class107.field1861 = 0;
        class28.field480 = 0;
        field2443 = 0;
        class49.field963 = 0;
        class25.field427 = 0;
        class41.field828 = 0;
        class162.field3061 = 0;
        class210.field3935 = 0;
        class28.field516 = 0;
        class151.field2870 = 0;
        class238.field4368 = 0;
        class41.field851 = 0;
        class97.field1692 = 0;
        class128.field2390 = 0;
        class232.field4236 = 0;
        class217.field4058 = 0;
        class209.field3912 = 0;
        class19.field318 = 0;
        class14.field209 = 0;
        class37.field765 = 0;
        class106.field1838 = 0;
        class157.field2987 = 0;
        class37.field731 = 0;
        class237.field4305 = 0;
        class15.field226 = 0;
        class128.field2414 = 0;
        class23.field403 = 0;
        class30.field581 = 0;
        field2449 = 0;
        class206.field3853 = 0;
        class196.field3665 = 0;
        class233.field4243 = 0;
        class149.field2817 = 0;
        class23.field394 = 0;
        class241.field4425 = 0;
        class23.field409 = 0;
        class128.field2387 = 0;
        class28.field476 = 0;
        class28.field510 = 0;
        class239.field4394 = 0;
        class212.field3967 = 0;
        class162.field3055 = 0;
        class208.field3880 = 0;
        class113.field2021 = 0;
        class81.field1436 = 0;
        class128.field2419 = 0;
        class128.field2405 = 0;
        class115.field2049 = 0;
        class37.field780 = 0;
        class77.field1358 = 0;
        class185.field3410 = 0;
        class162.field3054 = 0;
        class54.field1067 = 0;
        class241.field4417 = 0;
        class28.field507 = 0;
        class72.field1287 = 0;
        class68.field1215 = 0;
        class193.field3609 = 0;
        class28.field530 = 0;
        class119.field2125 = 0;
        class85.field1495 = 0;
        class207.field3873 = 0;
        class112.field1996 = 0;
        class163.field3095 = 0;
        class112.field1944 = 0;
        class136.field2589 = 0;
        class12.field168 = 0;
        class125.field2257 = 0;
        class112.field2007 = 0;
        class104.field1793 = 0;
        class68.field1240 = 0;
        class32.field659 = 0;
        class75.field1318 = 0;
        class94.field1635 = 0;
        class138.field2682 = 0;
        class12.field164 = 0;
        class10.field140 = 0;
        class195.field3642 = 0;
        class86.field1520 = 0;
        class68.field1237 = 0;
        class135.field2501 = 0;
        class123.field2186 = 0;
        class81.field1439 = 0;
        class236.field4300 = 0;
        class136.field2655 = 0;
        class112.field1959 = 0;
        class128.field2399 = 0;
        class135.field2490 = 0;
        class112.field1945 = 0;
        class91.field1560 = 0;
        class224.field4147 = 0;
        class162.field3065 = 0;
        class136.field2517 = 0;
        class128.field2386 = 0;
        class74.field1309 = 0;
        class97.field1703 = 0;
        class142.field2744 = 0;
        class59.field1104 = 0;
        class78.field1368 = 0;
        class68.field1248 = 0;
        class5.field36 = 0;
        class174.field3310 = 0;
        class37.field758 = 0;
        class191.field3564 = 0;
        class28.field469 = 0;
        class151.field2863 = 0;
        class28.field528 = 0;
        class84.field1483 = 0;
        class129.field2430 = 0;
        class59.field1106 = 0;
        class141.field2722 = 0;
        class137.field2677 = 0;
        class218.field4064 = 0;
        class192.field3588 = 0;
        class205.field3808 = 0;
        class208.field3889 = 0;
        class12.field163 = 0;
        class151.field2867 = 0;
        class243.field4456 = 0;
        class195.field3651 = 0;
        class118.field2116 = 0;
        class25.field426 = 0;
        class79.field1389 = 0;
        class112.field1951 = 0;
        class209.field3929 = 0;
        class155.field2925 = 0;
        class32.field635 = 0;
        class138.field2681 = 0;
        class245.field4486 = 0;
        class170.field3228 = 0;
        class163.field3085 = 0;
        class128.field2384 = 0;
        class18.field280 = 0;
        class204.field3786 = 0;
        class80.field1408 = 0;
        class3.field17 = 0;
        class164.field3107 = 0;
        class82.field1459 = 0;
        class201.field3748 = 0;
        class212.field3966 = 0;
        class112.field1962 = 0;
        class112.field2003 = 0;
        class144.field2759 = 0;
        class83.field1467 = 0;
        class41.field837 = 0;
        class196.field3671 = 0;
        class150.field2849 = 0;
        class246.field4503 = 0;
        class141.field2729 = 0;
        class39.field807 = 0;
        class28.field500 = 0;
        class68.field1217 = 0;
        class75.field1333 = 0;
        class192.field3594 = 0;
        class191.field3565 = 0;
        class128.field2403 = 0;
        class17.field262 = 0;
        class147.field2813 = 0;
        class39.field823 = 0;
        class136.field2585 = 0;
        class15.field235 = 0;
        class238.field4361 = 0;
        class37.field729 = 0;
        class82.field1457 = 0;
        class242.field4432 = 0;
        class195.field3654 = 0;
        class181.field3368 = 0;
        class128.field2392 = 0;
        class112.field1947 = 0;
        class140.field2713 = 0;
        class241.field4418 = 0;
        class165.field3148 = 0;
        class152.field2882 = 0;
        class147.field2800 = 0;
        class156.field2938 = 0;
        class106.field1854 = 0;
        class203.field3755 = 0;
        class244.field4469 = 0;
        class26.field440 = 0;
        client.field670 = 0;
        class11.field155 = 0;
        class68.field1214 = 0;
        class15.field218 = 0;
        class153.field2906 = 0;
        class23.field406 = 0;
        class5.field62 = 0;
        class3.field14 = 0;
        class157.field2988 = 0;
        class69.field1259 = 0;
        class138.field2686 = 0;
        class220.field4093 = 0;
        class28.field512 = 0;
        class31.field620 = 0;
        class28.field513 = 0;
        class156.field2940 = 0;
        class120.field2141 = 0;
        class89.field1547 = 0;
        class9.field114 = 0;
        class84.field1487 = 0;
        class125.field2241 = 0;
        class162.field3059 = 0;
        class137.field2674 = 0;
        class184.field3403 = 0;
        class23.field397 = 0;
        class208.field3903 = 0;
        class128.field2391 = 0;
        class150.field2847 = 0;
        class221.field4103 = 0;
        class80.field1421 = 0;
        class28.field520 = 0;
        class228.field4196 = 0;
        class104.field1807 = 0;
        class215.field4016 = 0;
        class107.field1862 = 0;
        class35.field698 = 0;
        class65.field1174 = 0;
        class155.field2922 = 0;
        class162.field3063 = 0;
        class238.field4339 = 0;
        class238.field4365 = 0;
        class229.field4205 = 0;
        class101.field1750 = 0;
        class215.field4011 = 0;
        class203.field3766 = 0;
        class81.field1441 = 0;
        class241.field4413 = 0;
        class109.field1901 = 0;
        class167.field3184 = 0;
        class103.field1790 = 0;
        class73.field1292 = 0;
        class145.field2781 = 0;
        class80.field1417 = 0;
        class135.field2497 = 0;
        class136.field2570 = 0;
        class28.field468 = 0;
        class82.field1456 = 0;
        class135.field2487 = 0;
        class113.field2027 = 0;
        class135.field2499 = 0;
        class192.field3597 = 0;
        class85.field1498 = 0;
        class166.field3170 = 0;
        class139.field2699 = 0;
        class238.field4343 = 0;
        class80.field1414 = 0;
        class15.field232 = 0;
        client.field665 = 0;
        class128.field2408 = 0;
        class8.field109 = 0;
        class159.field3003 = 0;
        class9.field115 = 0;
        class30.field588 = 0;
        class128.field2398 = 0;
        class37.field751 = 0;
        class96.field1680 = 0;
        class52.field1048 = 0;
        class128.field2404 = 0;
        class208.field3892 = 0;
        class125.field2234 = 0;
        class119.field2129 = 0;
        class28.field481 = 0;
        class37.field761 = 0;
        class106.field1848 = 0;
        class203.field3770 = 0;
        class190.field3545 = 0;
        class16.field256 = 0;
        class192.field3582 = 0;
        class68.field1219 = 0;
        class62.field1142 = 0;
        class236.field4302 = 0;
        class242.field4437 = 0;
        class37.field774 = 0;
        class78.field1374 = 0;
        class56.field1077 = 0;
        class41.field836 = 0;
        class28.field484 = 0;
        class246.field4495 = 0;
        class140.field2711 = 0;
        class208.field3904 = 0;
        class243.field4464 = 0;
        class14.field206 = 0;
        class240.field4410 = 0;
        class152.field2884 = 0;
        class228.field4191 = 0;
        class229.field4201 = 0;
        class237.field4315 = 0;
        class223.field4130 = 0;
        class37.field779 = 0;
        class145.field2782 = 0;
        class28.field488 = 0;
        class5.field56 = 0;
        class86.field1512 = 0;
        class195.field3647 = 0;
        class206.field3815 = 0;
        class171.field3266 = 0;
        class114.field2041 = 0;
        class26.field448 = 0;
        class60.field1117 = 0;
        class28.field478 = 0;
        class89.field1550 = 0;
        class112.field1941 = 0;
        class210.field3939 = 0;
        class112.field2009 = 0;
        class212.field3968 = 0;
        class37.field777 = 0;
        class16.field253 = 0;
        class189.field3448 = 0;
        class79.field1385 = 0;
        class167.field3185 = 0;
        class233.field4249 = 0;
        class37.field762 = 0;
        class145.field2780 = 0;
        class230.field4215 = 0;
        class218.field4062 = 0;
        class230.field4216 = 0;
        class121.field2161 = 0;
        class108.field1885 = 0;
        class157.field2980 = 0;
        class145.field2783 = 0;
        class124.field2218 = 0;
        class69.field1251 = 0;
        class241.field4415 = 0;
        class43.field923 = 0;
        class203.field3763 = 0;
        class76.field1345 = 0;
        class84.field1489 = 0;
        class122.field2176 = 0;
        class180.field3366 = 0;
        class91.field1565 = 0;
        class106.field1853 = 0;
        class37.field769 = 0;
        class158.field2998 = 0;
        class112.field2010 = 0;
        class84.field1490 = 0;
        class238.field4366 = 0;
        class15.field231 = 0;
        class150.field2838 = 0;
        class136.field2618 = 0;
        class68.field1221 = 0;
        class150.field2843 = 0;
        class28.field531 = 0;
        class8.field97 = 0;
        class123.field2198 = 0;
        class189.field3443 = 0;
        class104.field1803 = 0;
        class243.field4457 = 0;
        class205.field3813 = 0;
        class192.field3580 = 0;
        class73.field1300 = 0;
        class16.field251 = 0;
        class161.field3042 = 0;
        class54.field1063 = 0;
        client.field677 = 0;
        class191.field3573 = 0;
        class205.field3797 = 0;
        class5.field35 = 0;
        class81.field1451 = 0;
        class121.field2163 = 0;
        class8.field105 = 0;
        class8.field102 = 0;
        class223.field4127 = 0;
        class180.field3363 = 0;
        class82.field1453 = 0;
        class227.field4179 = 0;
        class138.field2688 = 0;
        class123.field2206 = 0;
        class238.field4345 = 0;
        class168.field3204 = 0;
        class37.field763 = 0;
        class76.field1344 = 0;
        class237.field4306 = 0;
        class238.field4325 = 0;
        class44.field945 = 0;
        class223.field4134 = 0;
        class75.field1329 = 0;
        class28.field522 = 0;
        class176.field3334 = 0;
        class35.field707 = 0;
        class177.field3343 = 0;
        class76.field1339 = 0;
        class12.field172 = 0;
        class50.field999 = 0;
        class11.field152 = 0;
        class193.field3605 = 0;
        class112.field1946 = 0;
        class204.field3777 = 0;
        class28.field486 = 0;
        class190.field3535 = 0;
        class238.field4353 = 0;
        field2454 = 0;
        class161.field3037 = 0;
        class229.field4211 = 0;
        class37.field739 = 0;
        class239.field4391 = 0;
        class106.field1851 = 0;
        class135.field2491 = 0;
        class31.field621 = 0;
        class238.field4384 = 0;
        class97.field1694 = 0;
        class244.field4473 = 0;
        class210.field3943 = 0;
        class95.field1659 = 0;
        class101.field1748 = 0;
        class158.field2991 = 0;
        class50.field1015 = 0;
        class167.field3192 = 0;
        class207.field3876 = 0;
        class194.field3618 = 0;
        class181.field3369 = 0;
        class78.field1366 = 0;
        field2446 = 0;
        class211.field3951 = 0;
        class125.field2265 = 0;
        class125.field2233 = 0;
        class112.field1990 = 0;
        class112.field1971 = 0;
        class88.field1537 = 0;
        class238.field4360 = 0;
        class118.field2109 = 0;
        class103.field1776 = 0;
        class78.field1367 = 0;
        class209.field3909 = 0;
        class207.field3874 = 0;
        class225.field4166 = 0;
        class10.field128 = 0;
        class163.field3086 = 0;
        class236.field4288 = 0;
        class163.field3074 = 0;
        class54.field1064 = 0;
        class238.field4326 = 0;
        class164.field3105 = 0;
        class230.field4219 = 0;
        class137.field2670 = 0;
        class97.field1700 = 0;
        class62.field1133 = 0;
        class125.field2243 = 0;
        class200.field3735 = 0;
        class112.field1940 = 0;
        class66.field1195 = 0;
        class137.field2662 = 0;
        class105.field1829 = 0;
        class7.field80 = 0;
        class34.field689 = 0;
        field2458 = 0;
        class65.field1175 = 0;
        class163.field3072 = 0;
        class30.field578 = 0;
        class113.field2025 = 0;
        class158.field2997 = 0;
        class129.field2431 = 0;
        class113.field2023 = 0;
        class23.field415 = 0;
        class112.field1998 = 0;
        class125.field2237 = 0;
        class139.field2697 = 0;
        class227.field4178 = 0;
        class133.field2474 = 0;
        class125.field2259 = 0;
        class44.field928 = 0;
        class183.field3377 = 0;
        class143.field2751 = 0;
        class206.field3855 = 0;
        class156.field2963 = 0;
        class3.field15 = 0;
        class112.field1960 = 0;
        class142.field2733 = 0;
        class72.field1275 = 0;
        class170.field3227 = 0;
        class170.field3226 = 0;
        class238.field4363 = 0;
        class137.field2673 = 0;
        class194.field3621 = 0;
        class28.field521 = 0;
        class203.field3768 = 0;
        class209.field3911 = 0;
        class200.field3720 = 0;
        class238.field4347 = 0;
        class209.field3926 = 0;
        class9.field111 = 0;
        client.field667 = 0;
        class136.field2609 = 0;
        class123.field2179 = 0;
        class28.field485 = 0;
        class37.field755 = 0;
        class230.field4222 = 0;
        class243.field4458 = 0;
        class18.field272 = 0;
        class170.field3243 = 0;
        class153.field2901 = 0;
        class152.field2878 = 0;
        class236.field4299 = 0;
        class16.field252 = 0;
        class128.field2402 = 0;
        class238.field4340 = 0;
        class160.field3019 = 0;
        class200.field3729 = 0;
        class52.field1047 = 0;
        class37.field742 = 0;
        class238.field4367 = 0;
        class37.field775 = 0;
        class52.field1044 = 0;
        class28.field501 = 0;
        class91.field1569 = 0;
        class28.field505 = 0;
        class68.field1233 = 0;
        class231.field4233 = 0;
        class58.field1090 = 0;
        class229.field4212 = 0;
        class203.field3765 = 0;
        class147.field2805 = 0;
        class59.field1107 = 0;
        class23.field396 = 0;
        class239.field4390 = 0;
        class5.field60 = 0;
        class11.field144 = 0;
        class136.field2558 = 0;
        class160.field3028 = 0;
        class200.field3724 = 0;
        class11.field153 = 0;
        class245.field4480 = 0;
        class225.field4165 = 0;
        class237.field4317 = 0;
        class233.field4252 = 0;
        class103.field1792 = 0;
        class159.field3009 = 0;
        class110.field1914 = 0;
        field2453 = 0;
        class196.field3659 = 0;
        class129.field2435 = 0;
        class37.field768 = 0;
        class97.field1699 = 0;
        class70.field1269 = 0;
        class28.field498 = 0;
        class26.field445 = 0;
        class128.field2397 = 0;
        class240.field4403 = 0;
        class145.field2773 = 0;
        class26.field441 = 0;
        class81.field1428 = 0;
        class72.field1276 = 0;
        class72.field1284 = 0;
        class181.field3372 = 0;
        class163.field3098 = 0;
        class79.field1396 = 0;
        class224.field4148 = 0;
        class195.field3643 = 0;
        class141.field2723 = 0;
        class199.field3709 = 0;
        class170.field3229 = 0;
        class185.field3430 = 0;
        class196.field3660 = 0;
        class69.field1252 = 0;
        class239.field4388 = 0;
        class68.field1238 = 0;
        class44.field941 = 0;
        class220.field4081 = 0;
        class15.field222 = 0;
        class184.field3402 = 0;
        class112.field1987 = 0;
        class15.field215 = 0;
        class112.field1976 = 0;
        class37.field759 = 0;
        class63.field1155 = 0;
        class41.field839 = 0;
        class14.field195 = 0;
        class95.field1671 = 0;
        class15.field220 = 0;
        class161.field3043 = 0;
        class204.field3776 = 0;
        class10.field135 = 0;
        class163.field3103 = 0;
        class115.field2057 = 0;
        class37.field741 = 0;
        class28.field511 = 0;
        class190.field3489 = 0;
        field2450 = 0;
        class83.field1474 = 0;
        class224.field4146 = 0;
        class121.field2165 = 0;
        class189.field3441 = 0;
        class141.field2725 = 0;
        class159.field3007 = 0;
        class139.field2690 = 0;
        class242.field4433 = 0;
        class142.field2746 = 0;
        class238.field4333 = 0;
        class37.field749 = 0;
        class208.field3902 = 0;
        class44.field936 = 0;
        class79.field1395 = 0;
        class224.field4152 = 0;
        class206.field3834 = 0;
        class133.field2473 = 0;
        class20.field330 = 0;
        class151.field2853 = 0;
        class106.field1835 = 0;
        class194.field3616 = 0;
        class88.field1536 = 0;
        class197.field3684 = 0;
        class161.field3041 = 0;
        class68.field1223 = 0;
        class218.field4072 = 0;
        class185.field3414 = 0;
        class28.field493 = 0;
        class245.field4487 = 0;
        class239.field4386 = 0;
        class238.field4327 = 0;
        class242.field4441 = 0;
        class26.field442 = 0;
        class241.field4423 = 0;
        class28.field482 = 0;
        class58.field1078 = 0;
        class151.field2856 = 0;
        class160.field3025 = 0;
        class233.field4245 = 0;
        class86.field1515 = 0;
        class153.field2887 = 0;
        client.field678 = 0;
        class185.field3423 = 0;
        class61.field1126 = 0;
        class150.field2850 = 0;
        class68.field1234 = 0;
        class191.field3555 = 0;
        class238.field4330 = 0;
        class136.field2590 = 0;
        class37.field735 = 0;
        class139.field2703 = 0;
        class37.field752 = 0;
        class190.field3538 = 0;
        class28.field532 = 0;
        class236.field4297 = 0;
        class29.field535 = 0;
        class238.field4374 = 0;
        class28.field495 = 0;
        class206.field3852 = 0;
        class244.field4466 = 0;
        class78.field1378 = 0;
        class49.field974 = 0;
        class223.field4126 = 0;
        class171.field3263 = 0;
        class41.field832 = 0;
        class115.field2067 = 0;
        class160.field3022 = 0;
        class10.field139 = 0;
        class205.field3809 = 0;
        class171.field3269 = 0;
        class215.field4013 = 0;
        class114.field2032 = 0;
        class37.field745 = 0;
        class197.field3680 = 0;
        class174.field3317 = 0;
        class138.field2683 = 0;
        class239.field4395 = 0;
        class73.field1296 = 0;
        client.field668 = 0;
        class245.field4484 = 0;
        class238.field4342 = 0;
        class158.field2995 = 0;
        class112.field1970 = 0;
        class210.field3936 = 0;
        class3.field18 = 0;
        class14.field194 = 0;
        class147.field2802 = 0;
        class159.field3012 = 0;
        class160.field3024 = 0;
        class62.field1145 = 0;
        class41.field829 = 0;
        class233.field4250 = 0;
        class128.field2380 = 0;
        class125.field2223 = 0;
        class128.field2417 = 0;
        class160.field3017 = 0;
        class62.field1148 = 0;
        class211.field3950 = 0;
        class37.field778 = 0;
        class105.field1828 = 0;
        class200.field3739 = 0;
        class200.field3736 = 0;
        class28.field515 = 0;
        class163.field3075 = 0;
        class204.field3787 = 0;
        class221.field4098 = 0;
        class58.field1085 = 0;
        class35.field697 = 0;
        class238.field4377 = 0;
        class180.field3359 = 0;
        class125.field2290 = 0;
        class35.field714 = 0;
        class206.field3845 = 0;
        class112.field2002 = 0;
        class34.field692 = 0;
        class61.field1127 = 0;
        class28.field479 = 0;
        class123.field2205 = 0;
        class155.field2919 = 0;
        class128.field2379 = 0;
        class183.field3380 = 0;
        class133.field2467 = 0;
        class75.field1328 = 0;
        class194.field3631 = 0;
        class180.field3367 = 0;
        class125.field2242 = 0;
        class112.field1985 = 0;
        class125.field2284 = 0;
        class28.field519 = 0;
        class128.field2401 = 0;
        class30.field553 = 0;
        class28.field529 = 0;
        class39.field819 = 0;
        class196.field3658 = 0;
        class119.field2128 = 0;
        class128.field2400 = 0;
        class82.field1462 = 0;
        class206.field3827 = 0;
        class28.field492 = 0;
        class95.field1667 = 0;
        class189.field3458 = 0;
        class199.field3710 = 0;
        class12.field169 = 0;
        class189.field3447 = 0;
        class211.field3949 = 0;
        class37.field730 = 0;
        class208.field3893 = 0;
        class224.field4153 = 0;
        class62.field1132 = 0;
        class28.field497 = 0;
        class30.field573 = 0;
        class233.field4253 = 0;
        class37.field732 = 0;
        class37.field747 = 0;
        class162.field3058 = 0;
        class150.field2840 = 0;
        class32.field653 = 0;
        class29.field540 = 0;
        class113.field2020 = 0;
        class227.field4184 = 0;
        class9.field110 = 0;
        class114.field2045 = 0;
        class80.field1413 = 0;
        class173.field3302 = 0;
        class210.field3941 = 0;
        class62.field1131 = 0;
        class235.field4273 = 0;
        class194.field3615 = 0;
        class88.field1534 = 0;
        class114.field2043 = 0;
        class67.field1200 = 0;
        class109.field1893 = 0;
        class221.field4099 = 0;
        class2.field7 = 0;
        class10.field127 = 0;
        class222.field4116 = 0;
        class232.field4238 = 0;
        class139.field2706 = 0;
        class8.field108 = 0;
        class195.field3640 = 0;
        class163.field3073 = 0;
        class208.field3891 = 0;
        class14.field199 = 0;
        class238.field4352 = 0;
        class160.field3020 = 0;
        class170.field3232 = 0;
        class103.field1768 = 0;
        field2456 = 0;
        class150.field2839 = 0;
        class63.field1150 = 0;
        class44.field951 = 0;
        class196.field3673 = 0;
        class171.field3254 = 0;
        class139.field2692 = 0;
        class237.field4319 = 0;
        class137.field2668 = 0;
        class191.field3575 = 0;
        class229.field4210 = 0;
        class192.field3584 = 0;
        class238.field4364 = 0;
        class233.field4244 = 0;
        class37.field781 = 0;
        class160.field3016 = 0;
        class7.field83 = 0;
        class63.field1151 = 0;
        class110.field1905 = 0;
        class37.field734 = 0;
        class112.field1975 = 0;
        class112.field1994 = 0;
        class203.field3760 = 0;
        class28.field470 = 0;
        class170.field3242 = 0;
        class18.field269 = 0;
        class163.field3092 = 0;
        class19.field329 = 0;
        class142.field2735 = 0;
        class66.field1192 = 0;
        class30.field585 = 0;
        class120.field2147 = 0;
        class26.field451 = 0;
        class227.field4183 = 0;
        class163.field3099 = 0;
        class30.field557 = 0;
        class62.field1134 = 0;
        class121.field2168 = 0;
        class23.field414 = 0;
        class128.field2385 = 0;
        class165.field3118 = 0;
        class133.field2475 = 0;
        class195.field3652 = 0;
        class165.field3121 = 0;
        class37.field744 = 0;
        class35.field710 = 0;
        class37.field770 = 0;
        class50.field1005 = 0;
        class122.field2171 = 0;
        class157.field2982 = 0;
        class135.field2500 = 0;
        class139.field2704 = 0;
        class189.field3452 = 0;
        class147.field2808 = 0;
        class28.field524 = 0;
        class12.field160 = 0;
        class198.field3694 = 0;
        class115.field2056 = 0;
        class37.field737 = 0;
        class35.field711 = 0;
        class112.field1989 = 0;
        class24.field422 = 0;
        class238.field4362 = 0;
        class63.field1152 = 0;
        class49.field987 = 0;
        class112.field1955 = 0;
        class81.field1429 = 0;
        class139.field2705 = 0;
        class112.field1952 = 0;
        class205.field3803 = 0;
        class80.field1424 = 0;
        class37.field750 = 0;
        class110.field1916 = 0;
        class180.field3362 = 0;
        class18.field291 = 0;
        class97.field1690 = 0;
        class28.field466 = 0;
        class30.field561 = 0;
        class83.field1470 = 0;
        class13.field177 = 0;
        class113.field2022 = 0;
        class242.field4430 = 0;
        class127.field2374 = 0;
        class171.field3284 = 0;
        class104.field1802 = 0;
        class142.field2749 = 0;
        class192.field3578 = 0;
        class28.field483 = 0;
        class145.field2778 = 0;
        class200.field3725 = 0;
        class23.field401 = 0;
        class171.field3279 = 0;
        class151.field2866 = 0;
        class142.field2740 = 0;
        class115.field2053 = 0;
        class125.field2282 = 0;
        class170.field3233 = 0;
        class143.field2752 = 0;
        class218.field4063 = 0;
        class9.field112 = 0;
        class136.field2523 = 0;
        class96.field1681 = 0;
        class15.field228 = 0;
        class115.field2051 = 0;
        class209.field3928 = 0;
        class214.field4006 = 0;
        class112.field1979 = 0;
        class38.field797 = 0;
        class66.field1188 = 0;
        class82.field1463 = 0;
        class37.field748 = 0;
        class123.field2203 = 0;
        class74.field1308 = 0;
        class112.field1995 = 0;
        class35.field712 = 0;
        class28.field514 = 0;
        class75.field1327 = 0;
        class129.field2427 = 0;
        class194.field3622 = 0;
        class112.field1949 = 0;
        class15.field237 = 0;
        class82.field1455 = 0;
        class72.field1288 = 0;
        class23.field412 = 0;
        class195.field3644 = 0;
        class78.field1372 = 0;
        class112.field1954 = 0;
        class68.field1227 = 0;
        class28.field471 = 0;
        class229.field4203 = 0;
        class15.field234 = 0;
        class185.field3426 = 0;
        class44.field938 = 0;
        class200.field3733 = 0;
        class28.field523 = 0;
        class37.field754 = 0;
        class14.field201 = 0;
        class32.field647 = 0;
        class237.field4316 = 0;
        class176.field3329 = 0;
        class125.field2251 = 0;
        class5.field51 = 0;
        class192.field3595 = 0;
        class242.field4429 = 0;
        class109.field1892 = 0;
        class41.field834 = 0;
        class68.field1235 = 0;
        class221.field4097 = 0;
        class29.field538 = 0;
        class189.field3440 = 0;
        class65.field1177 = 0;
        class16.field254 = 0;
        class68.field1229 = 0;
        class28.field525 = 0;
        class79.field1404 = 0;
        class62.field1136 = 0;
        class163.field3078 = 0;
        class190.field3527 = 0;
        class30.field602 = 0;
        class232.field4241 = 0;
        class235.field4277 = 0;
        class24.field417 = 0;
        class83.field1466 = 0;
        class128.field2381 = 0;
        class155.field2923 = 0;
        class123.field2197 = 0;
        class151.field2858 = 0;
        class223.field4132 = 0;
        class209.field3920 = 0;
        class204.field3782 = 0;
        class81.field1431 = 0;
        class177.field3348 = 0;
        class37.field772 = 0;
        class173.field3306 = 0;
        class128.field2407 = 0;
        class115.field2064 = 0;
        class209.field3931 = arg0;
        class125.field2280 = 0;
        class63.field1149 = 0;
        class128.field2415 = 0;
        class207.field3870 = 0;
        class85.field1494 = 0;
        class59.field1108 = 0;
        class67.field1204 = 0;
        class14.field213 = 0;
        class206.field3858 = 0;
        class155.field2916 = 0;
        class37.field766 = 0;
        class163.field3088 = 0;
        class163.field3089 = 0;
        class14.field193 = 0;
        class81.field1438 = 0;
        class68.field1213 = 0;
        class193.field3604 = 0;
        class84.field1491 = 0;
        class28.field489 = 0;
        class180.field3365 = 0;
        class238.field4370 = 0;
        class78.field1377 = 0;
        class171.field3257 = 0;
        class28.field477 = 0;
        class103.field1771 = 0;
        class12.field171 = 0;
        class243.field4461 = 0;
        class208.field3898 = 0;
        class115.field2050 = 0;
        class84.field1486 = 0;
        class125.field2267 = 0;
        class112.field1965 = 0;
        class72.field1283 = 0;
        class88.field1531 = 0;
        class238.field4338 = 0;
        class112.field2006 = 0;
        class142.field2741 = 0;
        class23.field402 = 0;
        class44.field926 = 0;
        class66.field1181 = 0;
        class204.field3781 = 0;
        class29.field534 = 0;
        class197.field3679 = 0;
        class156.field2948 = 0;
        class238.field4331 = 0;
        class7.field74 = 0;
        class28.field473 = 0;
        class88.field1532 = 0;
        class128.field2418 = 0;
        client.field672 = 0;
        class135.field2492 = 0;
        class205.field3800 = 0;
        class101.field1753 = 0;
        class38.field800 = 0;
        class104.field1795 = 0;
        class147.field2803 = 0;
        class206.field3824 = 0;
        class140.field2712 = 0;
        class147.field2796 = 0;
        client.field676 = 0;
        class194.field3635 = 0;
        class183.field3382 = 0;
        class190.field3520 = 0;
        class29.field539 = 0;
        class28.field496 = 0;
        class118.field2105 = 0;
        class24.field420 = 0;
        client.field666 = 0;
        class107.field1868 = 0;
        class149.field2818 = 0;
        class174.field3312 = 0;
        class183.field3388 = 0;
        class44.field943 = 0;
        class211.field3946 = 0;
        class92.field1578 = 0;
        class222.field4121 = 0;
        class163.field3094 = 0;
        class15.field223 = 0;
        class229.field4207 = 0;
        client.field674 = 0;
        class112.field1958 = 0;
        class155.field2921 = 0;
        class77.field1362 = 0;
        class135.field2489 = 0;
        class207.field3866 = 0;
        class112.field1968 = 0;
        class208.field3900 = 0;
        class28.field474 = 0;
        class61.field1120 = 0;
        client.field664 = 0;
        class92.field1574 = 0;
        class73.field1291 = 0;
        class15.field236 = 0;
        class144.field2762 = 0;
        class91.field1566 = 0;
        class157.field2978 = 0;
        class83.field1471 = 0;
        class206.field3829 = 0;
        class5.field52 = 0;
        class170.field3240 = 0;
        class96.field1683 = 0;
        class240.field4407 = 0;
        class190.field3507 = 0;
        class28.field518 = 0;
        class91.field1557 = 0;
        class99.field1720 = 0;
        class32.field646 = 0;
        class141.field2730 = 0;
        class166.field3167 = 0;
        class128.field2395 = 0;
        class139.field2700 = 0;
        class32.field661 = 0;
        class245.field4481 = 0;
        class210.field3937 = 0;
        class44.field947 = 0;
        class245.field4489 = 0;
        class201.field3747 = 0;
        class229.field4200 = 0;
        class163.field3096 = 0;
        class62.field1130 = 0;
        class43.field921 = 0;
        class30.field606 = 0;
        class18.field296 = 0;
        class135.field2488 = 0;
        class200.field3737 = 0;
        class176.field3338 = 0;
        class241.field4424 = 0;
        class163.field3090 = 0;
        class233.field4254 = 0;
        class203.field3759 = 0;
        class28.field517 = 0;
        class112.field1981 = 0;
        class163.field3079 = 0;
        class190.field3488 = 0;
        class221.field4113 = 0;
        class121.field2164 = 0;
        class115.field2058 = 0;
        class78.field1376 = 0;
        class15.field224 = 0;
        class173.field3293 = 0;
        class95.field1666 = 0;
        class30.field583 = 0;
        class104.field1809 = 0;
        class8.field99 = 0;
        class194.field3626 = 0;
        class66.field1183 = 0;
        class155.field2917 = 0;
        class112.field1964 = 0;
        class167.field3191 = 0;
        class68.field1220 = 0;
        class203.field3757 = 0;
        class86.field1510 = 0;
        client.field675 = 0;
        class241.field4414 = 0;
        class173.field3303 = 0;
        class153.field2909 = 0;
        class16.field257 = 0;
        class189.field3449 = 0;
        class44.field934 = 0;
        class185.field3412 = 0;
        class170.field3234 = 0;
        class10.field133 = 0;
        class24.field424 = 0;
        class89.field1552 = 0;
        class30.field565 = 0;
        class190.field3467 = 0;
        class128.field2411 = 0;
        class84.field1493 = 0;
        class18.field266 = 0;
        client.field662 = 0;
        class76.field1348 = 0;
        class28.field491 = 0;
        class170.field3245 = 0;
        class238.field4332 = 0;
        class19.field308 = 0;
        class107.field1870 = 0;
        class14.field204 = 0;
        class104.field1797 = 0;
        class72.field1279 = 0;
        class67.field1199 = 0;
        class37.field746 = 0;
        class204.field3778 = 0;
        class144.field2761 = 0;
        class163.field3082 = 0;
        class236.field4292 = 0;
        class32.field645 = 0;
        class176.field3326 = 0;
        class67.field1209 = 0;
        class195.field3641 = 0;
        class23.field411 = 0;
        class68.field1218 = 0;
        class7.field73 = 0;
        class228.field4188 = 0;
        class190.field3460 = 0;
        class28.field504 = 0;
        class95.field1662 = 0;
        class37.field764 = 0;
        class135.field2503 = 0;
        class14.field196 = 0;
        class23.field399 = 0;
        class13.field180 = 0;
        class211.field3955 = 0;
        class81.field1447 = 0;
        class166.field3166 = 0;
        class174.field3315 = 0;
        class75.field1317 = 0;
        class95.field1675 = 0;
        class128.field2383 = 0;
        class8.field103 = 0;
        class37.field782 = 0;
        class208.field3894 = 0;
        class139.field2707 = 0;
        class147.field2801 = 0;
        class20.field332 = 0;
        class123.field2180 = 0;
        class170.field3237 = 0;
        class135.field2485 = 0;
        class28.field527 = 0;
        class200.field3740 = 0;
        class37.field736 = 0;
        class173.field3304 = 0;
        class7.field76 = 0;
        class99.field1717 = 0;
        class109.field1890 = 0;
        class105.field1822 = 0;
        class208.field3886 = 0;
        class199.field3703 = 0;
        class5.field45 = 0;
        class103.field1769 = 0;
        class113.field2017 = 0;
        class120.field2146 = 0;
        class26.field444 = 0;
        class41.field835 = 0;
        class129.field2426 = 0;
        class156.field2933 = 0;
        class84.field1488 = 0;
        class170.field3230 = 0;
        class28.field494 = 0;
        class128.field2389 = 0;
        class194.field3613 = 0;
        class238.field4359 = 0;
        class221.field4104 = 0;
        class206.field3849 = 0;
        class37.field767 = 0;
        class5.field34 = 0;
        class127.field2349 = 0;
        class7.field82 = 0;
        class139.field2709 = 0;
        class200.field3723 = 0;
        class37.field760 = 0;
        class80.field1419 = 0;
        class62.field1144 = 0;
        class162.field3062 = 0;
        class224.field4143 = 0;
        class26.field452 = 0;
        class51.field1039 = 0;
        class192.field3583 = 0;
        class162.field3056 = 0;
        class166.field3171 = 0;
        class72.field1289 = 0;
        class203.field3764 = 0;
        class19.field305 = 0;
        class170.field3235 = 0;
        class37.field773 = 0;
        class103.field1779 = 0;
        class89.field1546 = 0;
        class97.field1705 = 0;
        class203.field3774 = 0;
        class125.field2279 = 0;
        class170.field3231 = 0;
        class79.field1397 = 0;
        client.field671 = 0;
        class37.field771 = 0;
        class176.field3325 = 0;
        class92.field1575 = 0;
        class97.field1693 = 0;
        class38.field791 = 0;
        class112.field1980 = 0;
        class191.field3553 = 0;
        class37.field776 = 0;
        class60.field1113 = 0;
        class189.field3444 = 0;
        class153.field2891 = 0;
        class10.field126 = 0;
        class78.field1380 = 0;
        class35.field708 = 0;
        class125.field2231 = 0;
        class183.field3381 = 0;
        class221.field4108 = 0;
        class56.field1074 = 0;
        class177.field3346 = 0;
        class128.field2393 = 0;
        class161.field3034 = 0;
        class95.field1663 = 0;
        class112.field1938 = 0;
        class37.field757 = 0;
        class173.field3291 = 0;
        class194.field3614 = 0;
        class156.field2961 = 0;
        class49.field989 = 0;
        class110.field1908 = 0;
        class66.field1182 = 0;
        class180.field3361 = 0;
        class17.field265 = 0;
        class41.field840 = 0;
        class128.field2396 = 0;
        class238.field4354 = 0;
        class50.field1020 = 0;
        class176.field3332 = 0;
        class121.field2170 = 0;
        class138.field2678 = 0;
        class58.field1094 = 0;
        class238.field4348 = 0;
        class31.field625 = 0;
        class158.field2994 = 0;
        class79.field1403 = 0;
        class37.field728 = 0;
        class13.field179 = 0;
        class238.field4383 = 0;
        class30.field577 = 0;
        class68.field1225 = 0;
        class170.field3239 = 0;
        class127.field2345 = 0;
        class238.field4334 = 0;
        class153.field2889 = 0;
        class192.field3598 = 0;
        class167.field3187 = 0;
        class185.field3417 = 0;
        class140.field2719 = 0;
        class171.field3282 = 0;
        class209.field3914 = 0;
        class191.field3574 = 0;
        class128.field2416 = 0;
        class121.field2169 = 0;
        class108.field1878 = 0;
        class35.field706 = 0;
        class19.field303 = 0;
        class222.field4117 = 0;
        class142.field2747 = 0;
        class19.field319 = 0L;
        class140.method980((byte) 111);
        class135.field2502 = 0;
        class100.field1739 = -1;
        class223.field4136 = -1;
        class59.field1096 = -1;
        class49.field970.field526 = 0;
        class59.field1105 = -1;
        class195.field3650 = 0;
        class12.field167.field526 = 0;
        class77.field1359 = 0;
        for (int var1 = 0; var1 < class246.field4504.length; var1++) {
            class246.field4504[var1] = null;
        }
        class118.field2114 = false;
        class97.field1701 = 0;
        class17.method119(-1066663896, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class163.field3087[var2] = null;
        }
        class225.field4159 = 0;
        class121.field2162 = 0;
        class91.field1571 = (int) (Math.random() * 120.0D) - 60;
        class239.field4389 = 0;
        class194.field3610 = 0;
        class123.field2208 = (int) (Math.random() * 30.0D) - 20;
        class239.field4385 = (int) (Math.random() * 110.0D) - 55;
        class8.field98 = (int) (Math.random() * 80.0D) - 40;
        class30.field600 = false;
        class209.field3923 = (int) (Math.random() * 100.0D) - 50;
        class76.field1342 = 0;
        class95.field1669 = 0;
        class66.field1191 = 0;
        class191.field3577 = 0;
        class135.field2504 = -1;
        class82.field1454 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        for (int var3 = 0; var3 < 2048; var3++) {
            class8.field107[var3] = null;
            class66.field1194[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class70.field1262[var4] = null;
        }
        class238.field4382 = class8.field107[2047] = new class123();
        class85.field1496.method1336(48);
        class191.field3566.method1336(36);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var15 = 0; var15 < 104; var15++) {
                    class183.field3389[var5][var14][var15] = null;
                }
            }
        }
        class20.field337 = new class203();
        class104.field1808 = 0;
        class79.field1388 = 0;
        for (int var6 = 0; var6 < class112.field1978; var6++) {
            class29 var13 = class82.method559(-57, var6);
            if (var13 != null && var13.field533 == 0) {
                class153.field2907[var6] = 0;
                class159.field3011[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class223.field4139.length; var7++) {
            class223.field4139[var7] = -1;
        }
        if (class149.field2828 != -1) {
            class106.method696((byte) 9, class149.field2828);
        }
        for (class201 var8 = (class201) class85.field1499.method1042((byte) -25); var8 != null; var8 = (class201) class85.field1499.method1041(true)) {
            class128.method902(true, -28361, var8);
        }
        class149.field2828 = -1;
        class85.field1499 = new class153(8);
        class118.field2114 = false;
        class152.field2877 = null;
        class97.field1701 = 0;
        class183.field3376.method806(false, -13, new int[5], -1, null);
        for (int var9 = 0; var9 < 8; var9++) {
            class166.field3177[var9] = null;
            class77.field1360[var9] = false;
        }
        class211.method1405(32);
        class196.field3663 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            class211.field3948[var10] = true;
        }
        class147.field2794 = null;
        class135.field2496 = 0;
        class41.field841 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            class200.field3744[var11] = new class205();
        }
        for (int var12 = 0; var12 < 25; var12++) {
            class44.field944[var12] = 0;
            class246.field4498[var12] = 0;
            class115.field2062[var12] = 0;
        }
        class41.field856 = class214.field3996;
        class165.field3129 = class209.field3933 = class191.field3572 = class39.field822 = new short[256];
        class244.field4474 = true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= 0 && arg3 >= 0 && arg2 < 103 && arg3 < 103) {
            if (arg1 == 0) {
                class184 var8 = class184.method1229(arg6, arg2, arg3);
                if (var8 != null) {
                    int var9 = (int) (var8.field3409 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 2) {
                        var8.field3399 = new class86(var9, 2, arg7 + 4, arg6, arg2, arg3, arg4, false, var8.field3399);
                        var8.field3404 = new class86(var9, 2, arg7 + 1 & 0x3, arg6, arg2, arg3, arg4, false, var8.field3404);
                    } else {
                        var8.field3399 = new class86(var9, arg5, arg7, arg6, arg2, arg3, arg4, false, var8.field3399);
                    }
                }
            }
            if (arg1 == 1) {
                class58 var10 = class204.method1348(arg6, arg2, arg3);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field1081 >>> 32);
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field1084 = new class86(var11, 4, arg7, arg6, arg2, arg3, arg4, false, var10.field1084);
                    } else if (arg5 == 6) {
                        var10.field1084 = new class86(var11, 4, arg7 + 4, arg6, arg2, arg3, arg4, false, var10.field1084);
                    } else if (arg5 == 7) {
                        var10.field1084 = new class86(var11, 4, (arg7 + 2 & 0x3) + 4, arg6, arg2, arg3, arg4, false, var10.field1084);
                    } else if (arg5 == 8) {
                        var10.field1084 = new class86(var11, 4, arg7 + 4, arg6, arg2, arg3, arg4, false, var10.field1084);
                        var10.field1086 = new class86(var11, 4, (arg7 + 2 & 0x3) + 4, arg6, arg2, arg3, arg4, false, var10.field1086);
                    }
                }
            }
            if (arg1 == 2) {
                class94 var12 = class117.method813(arg6, arg2, arg3);
                if (arg5 == 11) {
                    arg5 = 10;
                }
                if (var12 != null) {
                    var12.field1653 = new class86((int) (var12.field1641 >>> 32) & Integer.MAX_VALUE, arg5, arg7, arg6, arg2, arg3, arg4, false, var12.field1653);
                }
            }
            if (arg1 == 3) {
                class149 var13 = class144.method998(arg6, arg2, arg3);
                if (var13 != null) {
                    var13.field2829 = new class86(Integer.MAX_VALUE & (int) (var13.field2819 >>> 32), 22, arg7, arg6, arg2, arg3, arg4, false, var13.field2829);
                }
            }
        }
        if (arg0 <= 79) {
            field2452 = null;
        }
        field2458++;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public static void method918(int arg0) {
        field2447 = null;
        field2459 = null;
        field2451 = null;
        field2455 = null;
        field2452 = null;
        if (arg0 == 0) {
            field2444 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZILcg;II)V")
    public static final void method919(int arg0, boolean arg1, int arg2, class30 arg3, int arg4, int arg5) {
        field2449++;
        if (arg1) {
            method919(-20, false, 125, null, -41, 18);
        }
        class50 var6 = new class50();
        var6.field1001 = arg3.field596 * 128;
        int var7 = arg3.field560;
        var6.field1007 = arg3.field609;
        var6.field1004 = arg3.field563;
        var6.field995 = arg3.field551;
        var6.field1021 = arg4;
        var6.field1008 = arg2 * 128;
        var6.field1009 = arg3.field590;
        int var8 = arg3.field562;
        var6.field1014 = arg0 * 128;
        if (arg5 == 1 || arg5 == 3) {
            var7 = arg3.field562;
            var8 = arg3.field560;
        }
        var6.field1022 = (arg0 + var7) * 128;
        var6.field997 = (arg2 + var8) * 128;
        if (arg3.field554 != null) {
            var6.field1002 = arg3;
            var6.method424((byte) 76);
        }
        class238.field4337.method1340(-96, var6);
        if (var6.field1007 != null) {
            var6.field1010 = (int) (Math.random() * (double) (var6.field1009 - var6.field1004)) + var6.field1004;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIIIIII)V")
    public static final void method920(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2450++;
        class11.method71(arg6, -122);
        int var7 = -18 % ((arg0 - 7) / 37);
        int var8 = 0;
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = -1;
        int var12 = arg6 - arg3;
        int var13 = -1;
        if (var12 < 0) {
            var12 = 0;
        }
        if (class198.field3697 <= arg2 && class199.field3712 >= arg2) {
            int[] var14 = class11.field156[arg2];
            int var15 = class196.method1308(120, class29.field536, arg4 - arg6, class82.field1458);
            int var16 = class196.method1308(124, class29.field536, arg4 + arg6, class82.field1458);
            int var17 = class196.method1308(90, class29.field536, arg4 - var12, class82.field1458);
            int var18 = class196.method1308(48, class29.field536, arg4 + var12, class82.field1458);
            class29.method242(var17, (byte) -30, arg1, var14, var15);
            class29.method242(var18, (byte) -30, arg5, var14, var17);
            class29.method242(var16, (byte) -30, arg1, var14, var18);
        }
        int var19 = -var12;
        int var20 = var12;
        while (var9 > var8) {
            var11 += 2;
            var13 += 2;
            var10 += var11;
            var19 += var13;
            if (var19 >= 0 && var20 >= 1) {
                var20--;
                var19 -= var20 << 1;
                class95.field1661[var20] = var8;
            }
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var21 = arg2 - var9;
                int var22 = arg2 + var9;
                if (class198.field3697 <= var22 && var21 <= class199.field3712) {
                    if (var9 < var12) {
                        int var23 = class95.field1661[var9];
                        int var24 = class196.method1308(84, class29.field536, arg4 + var8, class82.field1458);
                        int var25 = class196.method1308(101, class29.field536, arg4 - var8, class82.field1458);
                        int var26 = class196.method1308(121, class29.field536, arg4 + var23, class82.field1458);
                        int var27 = class196.method1308(76, class29.field536, arg4 - var23, class82.field1458);
                        if (var22 <= class199.field3712) {
                            int[] var28 = class11.field156[var22];
                            class29.method242(var27, (byte) -30, arg1, var28, var25);
                            class29.method242(var26, (byte) -30, arg5, var28, var27);
                            class29.method242(var24, (byte) -30, arg1, var28, var26);
                        }
                        if (var21 >= class198.field3697) {
                            int[] var29 = class11.field156[var21];
                            class29.method242(var27, (byte) -30, arg1, var29, var25);
                            class29.method242(var26, (byte) -30, arg5, var29, var27);
                            class29.method242(var24, (byte) -30, arg1, var29, var26);
                        }
                    } else {
                        int var30 = class196.method1308(63, class29.field536, arg4 + var8, class82.field1458);
                        int var31 = class196.method1308(49, class29.field536, arg4 - var8, class82.field1458);
                        if (class199.field3712 >= var22) {
                            class29.method242(var30, (byte) -30, arg1, class11.field156[var22], var31);
                        }
                        if (class198.field3697 <= var21) {
                            class29.method242(var30, (byte) -30, arg1, class11.field156[var21], var31);
                        }
                    }
                }
            }
            int var32 = arg2 + var8;
            int var33 = arg2 - var8;
            if (var32 >= class198.field3697 && class199.field3712 >= var33) {
                int var34 = arg4 + var9;
                int var35 = arg4 - var9;
                if (var34 >= class29.field536 && var35 <= class82.field1458) {
                    int var36 = class196.method1308(113, class29.field536, var34, class82.field1458);
                    int var37 = class196.method1308(121, class29.field536, var35, class82.field1458);
                    if (var12 <= var8) {
                        if (class199.field3712 >= var32) {
                            class29.method242(var36, (byte) -30, arg1, class11.field156[var32], var37);
                        }
                        if (var33 >= class198.field3697) {
                            class29.method242(var36, (byte) -30, arg1, class11.field156[var33], var37);
                        }
                    } else {
                        int var38 = var20 >= var8 ? var20 : class95.field1661[var8];
                        int var39 = class196.method1308(121, class29.field536, arg4 + var38, class82.field1458);
                        int var40 = class196.method1308(83, class29.field536, arg4 - var38, class82.field1458);
                        if (var32 <= class199.field3712) {
                            int[] var41 = class11.field156[var32];
                            class29.method242(var40, (byte) -30, arg1, var41, var37);
                            class29.method242(var39, (byte) -30, arg5, var41, var40);
                            class29.method242(var36, (byte) -30, arg1, var41, var39);
                        }
                        if (var33 >= class198.field3697) {
                            int[] var42 = class11.field156[var33];
                            class29.method242(var40, (byte) -30, arg1, var42, var37);
                            class29.method242(var39, (byte) -30, arg5, var42, var40);
                            class29.method242(var36, (byte) -30, arg1, var42, var39);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)V")
    public static final void method921(int arg0, long arg1) {
        field2454++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class59.field1100; var3++) {
            if (class193.field3606[var3] == arg1) {
                class73.field1293++;
                class59.field1100--;
                for (int var4 = var3; var4 < class59.field1100; var4++) {
                    class193.field3606[var4] = class193.field3606[var4 + 1];
                    class128.field2388[var4] = class128.field2388[var4 + 1];
                }
                class168.field3197 = class112.field1963;
                class49.field970.method1503(13, 2976);
                class49.field970.method190(arg1, (byte) -110);
                break;
            }
        }
        int var5 = -44 % ((26 - arg0) / 53);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static final void method922(int arg0) {
        if (arg0 != 0) {
            method922(-38);
        }
        class16.field250.method1183((byte) 82);
        field2446++;
    }
}
