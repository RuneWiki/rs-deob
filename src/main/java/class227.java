import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class227 extends class82 {

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "[I")
    private int[] field4260 = new int[257];

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Ls;")
    public static class190 field4266 = new class190();

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "[I")
    public static int[] field4269 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4270 = new CRC32();

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Z")
    public static boolean field4271 = false;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    public static int field4274 = 2;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "[I")
    public static int[] field4273 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "Lnf;")
    public static class147 field4272;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "[[I")
    private int[][] field4264;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
    private final void method1488(byte arg0) {
        if (arg0 != -109) {
            this.field4264 = null;
        }
        ++field4261;
        int var2 = this.field4264.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field4264[var6][0] >= ~var4; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (var5 < var2) {
                    int[] var7 = this.field4264[var5];
                    if (var5 <= 0) {
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field4264[var5 + -1];
                        int var12 = (-var11[0] + var4 << 12) / (var7[0] + -var11[0]);
                        int var13 = 4096 - var12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                    }
                } else {
                    int[] var14 = this.field4264[var2 - 1];
                    var10 = var14[3];
                    var8 = var14[1];
                    var9 = var14[2];
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                int var17 = var8 >> 4;
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4260[var3] = class238.method1545(class238.method1545(var16 << 8, var17 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field4266 = null;
        field4270 = null;
        field4272 = null;
        if (arg0 != 0) {
            field4266 = null;
        }
        field4273 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(II)V")
    private final void method1490(int arg0, int arg1) {
        ++field4258;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4264 = new int[4][4];
                                this.field4264[0][3] = 0;
                                this.field4264[0][0] = 2048;
                                this.field4264[0][1] = 0;
                                this.field4264[1][3] = 0;
                                this.field4264[1][0] = 2867;
                                this.field4264[2][0] = 3276;
                                this.field4264[0][2] = 4096;
                                this.field4264[2][3] = 0;
                                this.field4264[1][1] = 4096;
                                this.field4264[1][2] = 4096;
                                this.field4264[2][2] = 4096;
                                this.field4264[3][2] = 0;
                                this.field4264[3][3] = 0;
                                this.field4264[3][0] = 4096;
                                this.field4264[2][1] = 4096;
                                this.field4264[3][1] = 4096;
                            } else {
                                this.field4264 = new int[16][4];
                                this.field4264[0][0] = 0;
                                this.field4264[0][2] = 192;
                                this.field4264[1][2] = 449;
                                this.field4264[0][1] = 80;
                                this.field4264[1][0] = 155;
                                this.field4264[1][1] = 321;
                                this.field4264[2][1] = 578;
                                this.field4264[2][2] = 690;
                                this.field4264[3][2] = 995;
                                this.field4264[3][1] = 947;
                                this.field4264[4][2] = 1397;
                                this.field4264[4][1] = 1285;
                                this.field4264[5][2] = 1429;
                                this.field4264[0][3] = 321;
                                this.field4264[5][1] = 1525;
                                this.field4264[2][0] = 389;
                                this.field4264[6][1] = 1734;
                                this.field4264[3][0] = 671;
                                this.field4264[4][0] = 897;
                                this.field4264[7][1] = 1413;
                                this.field4264[8][1] = 1108;
                                this.field4264[6][2] = 1461;
                                this.field4264[7][2] = 1525;
                                this.field4264[5][0] = 1175;
                                this.field4264[8][2] = 1590;
                                this.field4264[6][0] = 1368;
                                this.field4264[9][2] = 2056;
                                this.field4264[7][0] = 1507;
                                this.field4264[10][2] = 2586;
                                this.field4264[1][3] = 562;
                                this.field4264[2][3] = 803;
                                this.field4264[3][3] = 1140;
                                this.field4264[11][2] = 3148;
                                this.field4264[9][1] = 1766;
                                this.field4264[10][1] = 2409;
                                this.field4264[8][0] = 1736;
                                this.field4264[4][3] = 1509;
                                this.field4264[9][0] = 2088;
                                this.field4264[11][1] = 3116;
                                this.field4264[10][0] = 2355;
                                this.field4264[12][1] = 3806;
                                this.field4264[11][0] = 2691;
                                this.field4264[13][1] = 3437;
                                this.field4264[14][1] = 3116;
                                this.field4264[15][1] = 2377;
                                this.field4264[12][2] = 3710;
                                this.field4264[12][0] = 3031;
                                this.field4264[13][2] = 3421;
                                this.field4264[13][0] = 3522;
                                this.field4264[14][2] = 3148;
                                this.field4264[15][2] = 2505;
                                this.field4264[14][0] = 3727;
                                this.field4264[5][3] = 1413;
                                this.field4264[15][0] = 4096;
                                this.field4264[6][3] = 1333;
                                this.field4264[7][3] = 1702;
                                this.field4264[8][3] = 2056;
                                this.field4264[9][3] = 2666;
                                this.field4264[10][3] = 3276;
                                this.field4264[11][3] = 3228;
                                this.field4264[12][3] = 3196;
                                this.field4264[13][3] = 3019;
                                this.field4264[14][3] = 3228;
                                this.field4264[15][3] = 2746;
                            }
                        } else {
                            this.field4264 = new int[6][4];
                            this.field4264[0][3] = 0;
                            this.field4264[0][2] = 0;
                            this.field4264[1][3] = 1493;
                            this.field4264[2][3] = 2939;
                            this.field4264[0][0] = 0;
                            this.field4264[1][0] = 1843;
                            this.field4264[0][1] = 0;
                            this.field4264[1][2] = 0;
                            this.field4264[3][3] = 3565;
                            this.field4264[2][0] = 2457;
                            this.field4264[3][0] = 2781;
                            this.field4264[2][2] = 0;
                            this.field4264[1][1] = 0;
                            this.field4264[3][2] = 1124;
                            this.field4264[4][3] = 4031;
                            this.field4264[4][0] = 3481;
                            this.field4264[5][3] = 4096;
                            this.field4264[2][1] = 0;
                            this.field4264[4][2] = 3084;
                            this.field4264[3][1] = 0;
                            this.field4264[5][2] = 4096;
                            this.field4264[5][0] = 4096;
                            this.field4264[4][1] = 546;
                            this.field4264[5][1] = 4096;
                        }
                    } else {
                        this.field4264 = new int[7][4];
                        this.field4264[0][1] = 0;
                        this.field4264[0][3] = 4096;
                        this.field4264[0][2] = 0;
                        this.field4264[1][2] = 4096;
                        this.field4264[0][0] = 0;
                        this.field4264[1][1] = 0;
                        this.field4264[1][3] = 4096;
                        this.field4264[2][1] = 0;
                        this.field4264[1][0] = 663;
                        this.field4264[2][3] = 0;
                        this.field4264[3][3] = 0;
                        this.field4264[2][0] = 1363;
                        this.field4264[3][0] = 2048;
                        this.field4264[4][3] = 0;
                        this.field4264[5][3] = 4096;
                        this.field4264[4][0] = 2727;
                        this.field4264[5][0] = 3411;
                        this.field4264[2][2] = 4096;
                        this.field4264[6][3] = 4096;
                        this.field4264[3][2] = 4096;
                        this.field4264[4][2] = 0;
                        this.field4264[3][1] = 4096;
                        this.field4264[4][1] = 4096;
                        this.field4264[5][2] = 0;
                        this.field4264[6][2] = 0;
                        this.field4264[5][1] = 4096;
                        this.field4264[6][1] = 0;
                        this.field4264[6][0] = 4096;
                    }
                } else {
                    this.field4264 = new int[8][4];
                    this.field4264[0][1] = 2650;
                    this.field4264[0][3] = 2361;
                    this.field4264[1][1] = 2313;
                    this.field4264[0][0] = 0;
                    this.field4264[1][0] = 2867;
                    this.field4264[2][0] = 3072;
                    this.field4264[0][2] = 2602;
                    this.field4264[3][0] = 3276;
                    this.field4264[1][2] = 1799;
                    this.field4264[4][0] = 3481;
                    this.field4264[2][2] = 1734;
                    this.field4264[2][1] = 2618;
                    this.field4264[5][0] = 3686;
                    this.field4264[6][0] = 3891;
                    this.field4264[7][0] = 4096;
                    this.field4264[1][3] = 1558;
                    this.field4264[2][3] = 1413;
                    this.field4264[3][2] = 1220;
                    this.field4264[3][1] = 2296;
                    this.field4264[4][2] = 963;
                    this.field4264[4][1] = 2072;
                    this.field4264[3][3] = 947;
                    this.field4264[5][1] = 2730;
                    this.field4264[4][3] = 722;
                    this.field4264[5][2] = 2152;
                    this.field4264[5][3] = 1766;
                    this.field4264[6][3] = 915;
                    this.field4264[6][1] = 2232;
                    this.field4264[7][3] = 1140;
                    this.field4264[7][1] = 1686;
                    this.field4264[6][2] = 1060;
                    this.field4264[7][2] = 1413;
                }
            } else {
                this.field4264 = new int[2][4];
                this.field4264[0][3] = 0;
                this.field4264[0][0] = 0;
                this.field4264[0][1] = 0;
                this.field4264[1][3] = 4096;
                this.field4264[1][1] = 4096;
                this.field4264[1][0] = 4096;
                this.field4264[0][2] = 0;
                this.field4264[1][2] = 4096;
            }
        }
        if (arg1 < 40) {
            field4257 = -50;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V")
    public static final void method1491(byte arg0) {
        class19.field329 = class27.field481;
        class151.field2637 = class123.field2187;
        class72.field1368 = class134.field2400;
        class169.field2920 = class203.field3637;
        class76.field1479 = class102.field1865;
        class48.field882 = class168.field2884;
        class172.field2997 = class67.field1273;
        class183.field3182 = class218.field3958;
        class133.field2381 = class80.field1541;
        class215.field3923 = class228.field4284;
        class129.field2306 = class131.field2340;
        class1.field13 = class200.field3543;
        class63.field1175 = class128.field2275;
        class79.field1533 = class1.field14;
        class71.field1362 = class64.field1184;
        class9.field199 = class19.field312;
        class21.field363 = class94.field1736;
        class76.field1472 = class102.field1865;
        class47.field876 = class105.field1930;
        class106.field1951 = class44.field799;
        class108.field1970 = class215.field3918;
        class203.field3639 = class235.field4365;
        class219.field3966 = class166.field2850;
        class73.field1392 = class207.field3718;
        class112.field2019 = class93.field1732;
        class122.field2164 = class7.field144;
        class71.field1353 = class208.field3735;
        class19.field332 = class54.field992;
        class146.field2572 = class41.field774;
        class201.field3557 = class5.field72;
        class112.field2017 = class204.field3664;
        class90.field1707 = class96.field1778;
        class191.field3296 = class147.field2601;
        class105.field1929 = class181.field3143;
        class19.field331 = class226.field4249;
        class76.field1444 = class180.field3122;
        class76.field1471 = class201.field3561;
        class21.field361 = class102.field1865;
        class211.field3760 = class174.field3013;
        class219.field3962 = class19.field334;
        class194.field3389 = class197.field3497;
        class187.field3231 = class86.field1654;
        class235.field4370 = class133.field2384;
        class156.field2708 = class156.field2697;
        class30.field537 = class145.field2565;
        class10.field206 = class68.field1291;
        class212.field3807 = class52.field935;
        class179.field3102 = class145.field2564;
        class76.field1459 = class153.field2672;
        class135.field2426 = class136.field2436;
        class76.field1448 = class59.field1103;
        class143.field2548 = class213.field3827;
        class199.field3526 = class104.field1900;
        class218.field3950 = class9.field190;
        class49.field915 = class74.field1407;
        class210.field3750 = class214.field3839;
        class191.field3299 = class150.field2613;
        class76.field1456 = class102.field1865;
        class76.field1480 = class102.field1865;
        class76.field1447 = class102.field1865;
        class150.field2614 = class230.field4323;
        class112.field2022 = class93.field1732;
        class117.field2089 = class88.field1682;
        class53.field951 = class139.field2481;
        class7.field138 = class228.field4282;
        class48.field896 = class73.field1399;
        class157.field2739 = class59.field1099;
        class89.field1691 = class119.field2123;
        class178.field3065 = class1.field4;
        class118.field2105 = class238.field4411;
        class76.field1451 = class102.field1865;
        class44.field844 = class103.field1883;
        class41.field776 = class190.field3285;
        class115.field2040 = class122.field2173;
        class46.field865 = class168.field2881;
        class201.field3548 = class5.field72;
        class139.field2478 = class2.field34;
        class205.field3679 = class54.field996;
        class76.field1443 = class234.field4358;
        class15.field270 = class44.field815;
        class168.field2893 = class39.field747;
        class77.field1491 = class202.field3612;
        class201.field3569 = class213.field3820;
        class5.field69 = class205.field3682;
        class76.field1461 = class102.field1865;
        class76.field1477 = class14.field266;
        class145.field2561 = class81.field1569;
        class76.field1465 = class128.field2278;
        class194.field3405 = class202.field3628;
        class165.field2827 = class214.field3838;
        class201.field3556 = class2.field19;
        class181.field3151 = class57.field1073;
        class92.field1726 = class35.field624;
        class79.field1519 = class37.field661;
        class186.field3214 = class166.field2861;
        class76.field1482 = class109.field2003;
        class201.field3563 = class2.field19;
        class76.field1454 = class194.field3406;
        class239.field4416 = class180.field3131;
        class73.field1395 = class111.field2011;
        class108.field1982 = class230.field4315;
        class39.field750 = class40.field758;
        class76.field1473 = class102.field1865;
        class76.field1457 = class102.field1865;
        class201.field3553 = class219.field3963;
        class114.field2033 = class22.field374;
        class181.field3134 = class158.field2753;
        class33.field587 = class193.field3378;
        class137.field2449 = class171.field2981;
        class81.field1583 = class1.field11;
        class76.field1449 = class102.field1865;
        class199.field3516 = class130.field2326;
        class134.field2392 = class36.field639;
        class21.field362 = class222.field4012;
        class157.field2738 = class4.field54;
        class199.field3521 = class200.field3528;
        class115.field2066 = class121.field2152;
        class207.field3716 = class105.field1920;
        class96.field1775 = class74.field1432;
        class81.field1581 = class71.field1358;
        class76.field1450 = class102.field1865;
        class186.field3213 = class52.field942;
        class19.field319 = class226.field4252;
        class202.field3603 = class151.field2631;
        class76.field1467 = class102.field1865;
        class10.field211 = class237.field4404;
        ++field4262;
        class135.field2420 = class54.field997;
        class103.field1881 = class226.field4248;
        class13.field256 = class165.field2840;
        class76.field1453 = class102.field1865;
        class160.field2768 = class61.field1142;
        class53.field945 = class171.field2975;
        class218.field3947 = class237.field4393;
        class196.field3476 = class28.field494;
        class20.field352 = class194.field3395;
        class76.field1475 = class2.field19;
        class76.field1463 = class102.field1865;
        class76.field1476 = class73.field1400;
        class66.field1243 = class28.field501;
        class188.field3243 = class41.field775;
        class193.field3387 = class44.field848;
        class124.field2234 = class20.field344;
        class72.field1370 = class95.field1763;
        int var1 = 101 / ((-42 - arg0) / 57);
        class94.field1742 = class53.field947;
        class81.field1565 = class71.field1358;
        class95.field1769 = class73.field1402;
        class166.field2869 = class81.field1584;
        class115.field2049 = class122.field2172;
        class212.field3812 = class52.field935;
        class197.field3493 = class201.field3566;
        class115.field2051 = class37.field659;
        class88.field1679 = class70.field1344;
        class219.field3974 = class183.field3180;
        class139.field2499 = class136.field2438;
        class221.field4007 = class139.field2487;
        class213.field3829 = class150.field2610;
        class201.field3551 = class2.field19;
        class152.field2651 = class79.field1536;
        class210.field3755 = class214.field3839;
        class58.field1088 = class24.field409;
        class150.field2611 = class223.field4055;
        class76.field1446 = class14.field266;
        class165.field2830 = class182.field3178;
        class192.field3358 = class96.field1779;
        class45.field852 = class224.field4175;
        class143.field2549 = class73.field1397;
        class32.field559 = class222.field4015;
        class194.field3391 = class197.field3498;
        class72.field1376 = class95.field1763;
        class187.field3232 = class67.field1276;
        class76.field1445 = class102.field1865;
        class2.field36 = class103.field1885;
        class46.field867 = class58.field1090;
        class198.field3508 = class224.field4184;
        class4.field49 = class178.field3063;
        class123.field2192 = class62.field1155;
        class171.field2987 = class214.field3857;
        class106.field1932 = class92.field1715;
        class178.field3060 = class139.field2474;
        class76.field1466 = class102.field1865;
        class197.field3500 = class201.field3566;
        class3.field48 = class72.field1364;
        class48.field898 = class19.field324;
        class76.field1452 = class135.field2417;
        class120.field2131 = class136.field2433;
        class76.field1468 = class102.field1865;
        class76.field1481 = class98.field1802;
        class153.field2670 = class147.field2603;
        class119.field2115 = class218.field3949;
        class76.field1488 = class102.field1865;
        class15.field276 = class166.field2864;
        class76.field1464 = class180.field3122;
        class76.field1478 = class102.field1865;
        class76.field1484 = class102.field1865;
        class108.field1988 = class59.field1101;
        class76.field1455 = class102.field1865;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            method1491((byte) 71);
        }
        ++field4268;
        if (~arg1 == -1) {
            int var4 = arg0.method506(arg2 ^ 187);
            if (~var4 != -1) {
                this.method1490(var4, arg2 ^ 63);
            } else {
                this.field4264 = new int[arg0.method506(255)][4];
                for (int var5 = 0; this.field4264.length > var5; ++var5) {
                    this.field4264[var5][0] = arg0.method500(106);
                    this.field4264[var5][1] = arg0.method506(255) << 4;
                    this.field4264[var5][2] = arg0.method506(255) << 4;
                    this.field4264[var5][3] = arg0.method506(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field4265;
        if (this.field4264 == null) {
            this.method1490(1, 65);
        }
        if (arg0 > 95) {
            this.method1488((byte) -109);
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        if (arg0 > -59) {
            this.method6(4, 40);
        }
        ++field4267;
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[] var4 = this.method620(2652, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class129.field2287; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4260[var9];
                var5[var8] = class29.method202(16711680, var10) >> 12;
                var7[var8] = class29.method202(var10, 65280) >> 4;
                var6[var8] = class29.method202(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIIII)V")
    public static final void method1492(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50.field925[0].method863(arg5, arg4);
        ++field4259;
        int var6 = (arg3 + -32) * arg3 / arg1;
        if (arg0 > 81) {
            if (var6 < 8) {
                var6 = 8;
            }
            class50.field925[1].method863(arg5, arg4 + -16 - -arg3);
            int var7 = (arg3 + -32 + -var6) * arg2 / (-arg3 + arg1);
            class99.method688(arg5, arg4 + 16, 16, arg3 + -32, class40.field756);
            class99.method688(arg5, arg4 + 16 - -var7, 16, var6, class150.field2619);
            class99.method695(arg5, arg4 + var7 - -16, var6, class188.field3249);
            class99.method695(arg5 + 1, arg4 + var7 + 16, var6, class188.field3249);
            class99.method704(arg5, arg4 - -16 - -var7, 16, class188.field3249);
            class99.method704(arg5, arg4 + 17 - -var7, 16, class188.field3249);
            class99.method695(arg5 - -15, arg4 + 16 - -var7, var6, class78.field1505);
            class99.method695(arg5 + 14, arg4 + var7 - -17, var6 + -1, class78.field1505);
            class99.method704(arg5, 15 - (-var6 + -var7) + arg4, 16, class78.field1505);
            class99.method704(arg5 + 1, arg4 - (-14 - (var7 - -var6)), 15, class78.field1505);
        }
    }
}
