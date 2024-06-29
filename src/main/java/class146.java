import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class146 extends class110 {

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2854 = 128;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field2855 = 255;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "[I")
    public static int[] field2853 = new int[2048];

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "J")
    public static volatile long field2864 = 0L;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "Leh;")
    private static class47 field2867 = class195.method1282((byte) -4, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field2869 = 50;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "[I")
    public static int[] field2871 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "[I")
    public static int[] field2859 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
    public static int[] field2847 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "[I")
    public static int[] field2841 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "[I")
    public static int[] field2862 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "[I")
    public static int[] field2877 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "[Leh;")
    public static class47[] field2876 = new class47[field2869];

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "[I")
    public static int[] field2863 = new int[field2869];

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lbd;")
    public class15 field2845;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lbd;")
    public class15 field2874;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lwd;")
    public class202 field2849;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "[I")
    public int[] field2875;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method1030(int arg0) {
        field2844++;
        int var2 = this.field2861;
        class202 var3 = this.field2849.method1326(-83);
        if (var3 == null) {
            this.field2861 = -1;
            this.field2872 = 0;
            this.field2858 = 0;
            this.field2875 = null;
            this.field2842 = 0;
        } else {
            this.field2858 = var3.field3947 * 128;
            this.field2842 = var3.field3958;
            this.field2872 = var3.field3936;
            this.field2861 = var3.field3984;
            this.field2875 = var3.field3977;
        }
        if (arg0 <= 34) {
            method1033(41, -19);
        }
        if (this.field2861 != var2 && this.field2874 != null) {
            class182.field3491.method1175(this.field2874);
            this.field2874 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static final void method1031(int arg0) {
        class160.field3114 = class73.field1609;
        class165.field3196 = class108.field2251;
        class60.field1166 = class98.field2087;
        class186.field3595 = class12.field245;
        class186.field3548 = class148.field2900;
        class165.field3210 = class105.field2183;
        class186.field3586 = class148.field2900;
        class106.field2223 = class119.field2409;
        class186.field3584 = class148.field2900;
        class186.field3581 = class161.field3133;
        class186.field3571 = class148.field2900;
        class119.field2415 = class81.field1735;
        class105.field2198 = class33.field634;
        class140.field2742 = class32.field616;
        class85.field1799 = class158.field3064;
        class186.field3580 = class148.field2900;
        class152.field2964 = class33.field632;
        class6.field103 = class185.field3542;
        class69.field1530 = class110.field2275;
        class189.field3663 = class163.field3180;
        class186.field3594 = class148.field2900;
        class186.field3575 = class148.field2900;
        class162.field3158 = class60.field1171;
        class23.field446 = class52.field1011;
        class196.field3812 = class179.field3422;
        class109.field2265 = class192.field3715;
        class186.field3592 = class53.field1037;
        class16.field329 = class90.field1893;
        class195.field3802 = class181.field3471;
        class126.field2533 = class79.field1702;
        class136.field2660 = class120.field2435;
        class94.field1936 = class183.field3512;
        class120.field2432 = class182.field3480;
        class201.field3911 = class117.field2388;
        class126.field2530 = class43.field860;
        class166.field3225 = class73.field1557;
        class119.field2411 = class59.field1142;
        class67.field1443 = class51.field992;
        class167.field3262 = class202.field3950;
        class26.field492 = class163.field3171;
        class177.field3395 = class9.field196;
        class165.field3195 = class105.field2205;
        class143.field2817 = class19.field381;
        class131.field2585 = class64.field1408;
        class186.field3587 = class148.field2900;
        class37.field719 = class23.field462;
        class186.field3550 = class142.field2800;
        class186.field3589 = class166.field3229;
        class186.field3557 = class148.field2900;
        class193.field3736 = class195.field3795;
        class114.field2328 = class119.field2417;
        class130.field2579 = class107.field2229;
        class140.field2744 = class37.field742;
        class138.field2717 = class189.field3656;
        class160.field3119 = class167.field3260;
        class43.field858 = class60.field1178;
        class189.field3675 = class179.field3430;
        class186.field3588 = class148.field2900;
        class94.field1952 = class25.field482;
        class95.field1955 = class147.field2884;
        class44.field879 = class161.field3135;
        class140.field2747 = class32.field616;
        class186.field3565 = class148.field2900;
        class6.field107 = class86.field1824;
        class196.field3808 = class21.field406;
        class79.field1708 = class63.field1342;
        class88.field1881 = class53.field1038;
        class153.field3010 = class142.field2781;
        class178.field3410 = class78.field1685;
        class40.field786 = class156.field3052;
        class186.field3564 = class148.field2900;
        class198.field3849 = class70.field1534;
        class135.field2650 = class163.field3173;
        class31.field584 = class188.field3615;
        class25.field477 = class185.field3539;
        class201.field3910 = class61.field1213;
        class196.field3813 = class141.field2773;
        class97.field2064 = class39.field776;
        class123.field2480 = class201.field3914;
        class116.field2361 = class116.field2358;
        class186.field3569 = class97.field2067;
        class5.field87 = class196.field3824;
        class186.field3561 = class78.field1691;
        class76.field1642 = class193.field3734;
        class148.field2888 = class9.field171;
        class36.field699 = class133.field2615;
        class118.field2398 = class19.field379;
        class36.field703 = class109.field2267;
        class194.field3782 = class204.field4011;
        class196.field3817 = class177.field3380;
        class193.field3743 = class36.field693;
        class199.field3890 = class200.field3906;
        class186.field3573 = class148.field2900;
        class189.field3658 = class177.field3386;
        field2873++;
        class81.field1733 = class125.field2509;
        class78.field1684 = class189.field3674;
        class70.field1539 = class88.field1875;
        class203.field3995 = class200.field3903;
        class173.field3353 = class12.field249;
        class186.field3583 = class148.field2900;
        class86.field1817 = class56.field1113;
        class135.field2649 = class163.field3173;
        class8.field164 = class81.field1741;
        class206.field4062 = class155.field3031;
        class152.field2984 = class176.field3371;
        class179.field3431 = class163.field3172;
        class73.field1564 = class78.field1687;
        class108.field2245 = class90.field1890;
        class163.field3178 = class82.field1767;
        class166.field3226 = class147.field2886;
        class140.field2736 = class127.field2537;
        client.field556 = class148.field2900;
        class23.field455 = class166.field3223;
        class161.field3123 = class178.field3419;
        class158.field3067 = class176.field3378;
        class122.field2475 = class84.field1782;
        class82.field1763 = class9.field188;
        class98.field2082 = class137.field2678;
        class36.field698 = class120.field2428;
        class37.field725 = class23.field462;
        class67.field1439 = class158.field3066;
        class79.field1713 = class77.field1680;
        class186.field3559 = class148.field2900;
        class140.field2735 = class127.field2537;
        class167.field3255 = class202.field3955;
        class124.field2506 = class205.field4042;
        class69.field1525 = class37.field734;
        class186.field3590 = class79.field1716;
        class19.field369 = class203.field3993;
        class118.field2390 = field2867;
        class55.field1051 = class86.field1820;
        class186.field3574 = class161.field3133;
        class68.field1478 = class191.field3694;
        class85.field1798 = class83.field1772;
        class108.field2249 = class90.field1890;
        class24.field473 = class197.field3843;
        class88.field1883 = class87.field1857;
        class186.field3562 = class179.field3438;
        class198.field3872 = class5.field89;
        class186.field3558 = class73.field1572;
        class95.field1965 = class154.field3025;
        class40.field806 = class205.field4031;
        class61.field1234 = class205.field4041;
        class202.field3963 = class182.field3503;
        class143.field2810 = class64.field1405;
        class116.field2367 = class125.field2513;
        class159.field3096 = class18.field366;
        class86.field1836 = class56.field1113;
        class24.field468 = class86.field1845;
        class73.field1577 = class74.field1623;
        class139.field2728 = class130.field2554;
        class186.field3582 = class148.field2900;
        class183.field3511 = class31.field586;
        class186.field3572 = class53.field1037;
        client.field557 = class43.field869;
        class152.field2970 = class36.field700;
        class202.field3919 = class187.field3599;
        class85.field1811 = class21.field411;
        class81.field1745 = class198.field3871;
        class60.field1163 = class76.field1656;
        class123.field2487 = class74.field1628;
        class160.field3113 = class98.field2073;
        class110.field2272 = class61.field1251;
        if (arg0 != 39) {
            method1032(-101);
        }
        class184.field3527 = class151.field2963;
        class158.field3071 = class63.field1348;
        class2.field26 = client.field552;
        class184.field3526 = class12.field241;
        class3.field41 = class16.field332;
        class185.field3547 = class205.field4040;
        class39.field758 = class135.field2655;
        class206.field4060 = class105.field2184;
        class186.field3560 = class148.field2900;
        class56.field1114 = class152.field2971;
        class186.field3570 = class148.field2900;
        class193.field3741 = class59.field1138;
        class20.field384 = class144.field2824;
        class31.field583 = class188.field3615;
        class3.field31 = class108.field2250;
        class158.field3072 = class59.field1137;
        class36.field711 = class95.field1968;
        class186.field3563 = class148.field2900;
        class96.field2049 = class143.field2818;
        class186.field3555 = class148.field2900;
        class186.field3593 = class32.field616;
        class106.field2211 = class63.field1347;
        class140.field2738 = class62.field1331;
        class87.field1868 = class192.field3726;
        class56.field1110 = class204.field4016;
        class140.field2746 = class32.field616;
        class188.field3623 = class170.field3285;
        class177.field3388 = class9.field196;
        class186.field3597 = class5.field86;
        class186.field3551 = class148.field2900;
        class141.field2776 = class18.field358;
        class202.field3954 = class163.field3175;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        field2850++;
        if (class184.field3529 == 141) {
            int var1 = class22.field418.method608(arg0 - 2147483577);
            int var2 = class22.field418.method594(arg0 - 2147455851);
            int var3 = (var2 >> 4 & 0x7) + class67.field1449;
            int var4 = (var2 & 0x7) + class21.field403;
            int var5 = class22.field418.method584((byte) 94);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class61.field1212[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                if (var8 == 0) {
                    class44 var9 = class52.method466(class196.field3827, var3, var4);
                    if (var9 != null) {
                        int var10 = (int) (var9.field874 >>> 32) & Integer.MAX_VALUE;
                        if (var6 == 2) {
                            var9.field876 = new class141(var10, 2, var7 + 4, class196.field3827, var3, var4, var1, false, var9.field876);
                            var9.field878 = new class141(var10, 2, var7 + 1 & 0x3, class196.field3827, var3, var4, var1, false, var9.field878);
                        } else {
                            var9.field876 = new class141(var10, var6, var7, class196.field3827, var3, var4, var1, false, var9.field876);
                        }
                    }
                }
                if (var8 == 1) {
                    class117 var11 = class137.method999(class196.field3827, var3, var4);
                    if (var11 != null) {
                        int var12 = (int) (var11.field2370 >>> 32) & Integer.MAX_VALUE;
                        if (var6 == 4 || var6 == 5) {
                            var11.field2374 = new class141(var12, 4, var7, class196.field3827, var3, var4, var1, false, var11.field2374);
                        } else if (var6 == 6) {
                            var11.field2374 = new class141(var12, 4, var7 + 4, class196.field3827, var3, var4, var1, false, var11.field2374);
                        } else if (var6 == 7) {
                            var11.field2374 = new class141(var12, 4, (var7 + 2 & 0x3) + 4, class196.field3827, var3, var4, var1, false, var11.field2374);
                        } else if (var6 == 8) {
                            var11.field2374 = new class141(var12, 4, var7 + 4, class196.field3827, var3, var4, var1, false, var11.field2374);
                            var11.field2380 = new class141(var12, 4, (var7 + 2 & 0x3) + 4, class196.field3827, var3, var4, var1, false, var11.field2380);
                        }
                    }
                }
                if (var8 == 2) {
                    if (var6 == 11) {
                        var6 = 10;
                    }
                    class60 var13 = class201.method1314(class196.field3827, var3, var4);
                    if (var13 != null) {
                        var13.field1150 = new class141(Integer.MAX_VALUE & (int) (var13.field1157 >>> 32), var6, var7, class196.field3827, var3, var4, var1, false, var13.field1150);
                    }
                }
                if (var8 == 3) {
                    class200 var14 = class69.method624(class196.field3827, var3, var4);
                    if (var14 != null) {
                        var14.field3894 = new class141(Integer.MAX_VALUE & (int) (var14.field3895 >>> 32), 22, var7, class196.field3827, var3, var4, var1, false, var14.field3894);
                    }
                }
            }
        } else if (class184.field3529 == 65) {
            int var15 = class22.field418.method604((byte) -38);
            int var16 = (var15 >> 4 & 0x7) + class67.field1449;
            int var17 = class21.field403 + (var15 & 0x7);
            int var18 = var16 + class22.field418.method567(-1);
            int var19 = var17 + class22.field418.method567(arg0 + Integer.MIN_VALUE);
            int var20 = class22.field418.method601(25640);
            int var21 = class22.field418.method569(26496);
            int var22 = class22.field418.method604((byte) 21) * 4;
            int var23 = class22.field418.method604((byte) 28) * 4;
            int var24 = class22.field418.method569(arg0 - 2147457151);
            int var25 = class22.field418.method569(arg0 ^ 0x7FFF987F);
            int var26 = class22.field418.method604((byte) -11);
            int var27 = class22.field418.method604((byte) -123);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var21 != 65535) {
                int var28 = var19 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                int var31 = var16 * 128 + 64;
                class86 var32 = new class86(var21, class196.field3827, var31, var29, class39.method335(var31, class196.field3827, var29, 20896) - var22, class18.field362 + var24, var25 + class18.field362, var26, var27, var20, var23);
                var32.method707(class39.method335(var30, class196.field3827, var28, 20896) - var23, (byte) -77, var28, class18.field362 + var24, var30);
                class191.field3692.method337(var32, (byte) -22);
            }
        } else if (class184.field3529 == 63) {
            int var33 = class22.field418.method604((byte) 113);
            int var34 = class21.field403 + (var33 & 0x7);
            int var35 = (var33 >> 4 & 0x7) + class67.field1449;
            int var36 = class22.field418.method569(arg0 ^ 0x7FFF987F);
            int var37 = class22.field418.method569(arg0 ^ 0x7FFF987F);
            int var38 = class22.field418.method569(26496);
            if (var35 >= 0 && var34 >= 0 && var35 < 104 && var34 < 104) {
                class40 var39 = class31.field597[class196.field3827][var35][var34];
                if (var39 != null) {
                    for (class156 var40 = (class156) var39.method345(-124); var40 != null; var40 = (class156) var39.method348(13949)) {
                        if ((var36 & 0x7FFF) == var40.field3057 && var40.field3051 == var37) {
                            var40.field3051 = var38;
                            break;
                        }
                    }
                    class159.method1094(var34, var35, (byte) -73);
                }
            }
        } else {
            if (class184.field3529 == 174) {
                int var41 = class22.field418.method608(-101);
                byte var42 = class22.field418.method567(-1);
                int var43 = class22.field418.method576(28836);
                byte var44 = class22.field418.method589(6646);
                int var45 = class22.field418.method569(26496);
                byte var46 = class22.field418.method566(128);
                int var47 = class22.field418.method586((byte) 114);
                int var48 = class22.field418.method564((byte) 25);
                int var49 = var48 >> 2;
                int var50 = class61.field1212[var49];
                int var51 = var48 & 0x3;
                int var52 = class22.field418.method584((byte) -85);
                int var53 = (var52 >> 4 & 0x7) + class67.field1449;
                int var54 = (var52 & 0x7) + class21.field403;
                byte var55 = class22.field418.method567(arg0 ^ Integer.MIN_VALUE);
                class32 var56;
                if (class180.field3443 == var47) {
                    var56 = class123.field2489;
                } else {
                    var56 = class40.field795[var47];
                }
                if (var56 != null) {
                    class202 var57 = class99.method806(0, var43);
                    int var58;
                    int var59;
                    if (var51 == 1 || var51 == 3) {
                        var58 = var57.field3980;
                        var59 = var57.field3949;
                    } else {
                        var58 = var57.field3949;
                        var59 = var57.field3980;
                    }
                    int var60 = (var59 + 1 >> 1) + var53;
                    int var61 = (var59 >> 1) + var53;
                    int var62 = (var58 + 1 >> 1) + var54;
                    int[][] var63 = class103.field2171[class196.field3827];
                    int var64 = var54 + (var58 >> 1);
                    int var65 = var63[var60][var64] + var63[var61][var64] + var63[var61][var62] + var63[var60][var62] >> 2;
                    int var66 = (var54 << 7) + (var58 << 6);
                    int var67 = (var53 << 7) + (var59 << 6);
                    class30 var68 = var57.method1317(var67, -3, var65, var51, var49, var66, var63);
                    if (var68 != null) {
                        class119.method925(var45 + 1, 0, var53, var50, var54, var41 + 1, class196.field3827, -1, 0, (byte) -121);
                        var56.field628 = var65;
                        var56.field601 = var68;
                        var56.field614 = var53 * 128 + var59 * 64;
                        var56.field627 = var54 * 128 + var58 * 64;
                        if (var44 > var46) {
                            byte var69 = var44;
                            var44 = var46;
                            var46 = var69;
                        }
                        var56.field610 = class18.field362 + var41;
                        if (var42 < var55) {
                            byte var70 = var55;
                            var55 = var42;
                            var42 = var70;
                        }
                        var56.field618 = var46 + var53;
                        var56.field600 = var42 + var54;
                        var56.field624 = class18.field362 + var45;
                        var56.field602 = var53 + var44;
                        var56.field625 = var54 + var55;
                    }
                }
            }
            if (class184.field3529 == 29) {
                int var71 = class22.field418.method594(arg0 ^ 0x7FFF936B);
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = class61.field1212[var72];
                int var75 = class22.field418.method584((byte) 116);
                int var76 = (var75 >> 4 & 0x7) + class67.field1449;
                int var77 = (var75 & 0x7) + class21.field403;
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class119.method925(-1, var73, var76, var74, var77, 0, class196.field3827, -1, var72, (byte) -114);
                }
            } else {
                if (class184.field3529 == 159) {
                    int var78 = class22.field418.method604((byte) -17);
                    int var79 = (var78 >> 4 & 0x7) + class67.field1449;
                    int var80 = (var78 & 0x7) + class21.field403;
                    int var81 = class22.field418.method569(26496);
                    int var82 = class22.field418.method604((byte) -128);
                    int var83 = var82 & 0x7;
                    int var84 = class22.field418.method604((byte) 112);
                    int var85 = var82 >> 4 & 0xF;
                    if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                        int var86 = var85 + 1;
                        if (class123.field2489.field3310[0] >= var79 - var86 && class123.field2489.field3310[0] <= var79 + var86 && var80 - var86 <= class123.field2489.field3317[0] && class123.field2489.field3317[0] <= var80 + var86 && class159.field3099 != 0 && var83 > 0 && class35.field688 < 50) {
                            class21.field398[class35.field688] = var81;
                            client.field553[class35.field688] = var83;
                            class100.field2106[class35.field688] = var84;
                            class52.field997[class35.field688] = null;
                            class110.field2273[class35.field688] = (var79 << 16) + (var80 << 8) + var85;
                            class35.field688++;
                        }
                    }
                }
                if (class184.field3529 == 127) {
                    int var87 = class22.field418.method584((byte) -42);
                    int var88 = (var87 >> 4 & 0x7) + class67.field1449;
                    int var89 = (var87 & 0x7) + class21.field403;
                    int var90 = class22.field418.method569(26496);
                    if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                        class40 var91 = class31.field597[class196.field3827][var88][var89];
                        if (var91 != null) {
                            for (class156 var92 = (class156) var91.method345(arg0 + 2147483528); var92 != null; var92 = (class156) var91.method348(13949)) {
                                if ((var90 & 0x7FFF) == var92.field3057) {
                                    var92.method885(arg0 ^ 0x7FFFFFFC);
                                    break;
                                }
                            }
                            if (var91.method345(-122) == null) {
                                class31.field597[class196.field3827][var88][var89] = null;
                            }
                            class159.method1094(var89, var88, (byte) -107);
                        }
                    }
                } else if (class184.field3529 == 88) {
                    int var93 = class22.field418.method604((byte) 70);
                    int var94 = (var93 >> 4 & 0x7) + class67.field1449;
                    int var95 = class21.field403 + (var93 & 0x7);
                    int var96 = class22.field418.method569(26496);
                    int var97 = class22.field418.method604((byte) 93);
                    int var98 = class22.field418.method569(arg0 ^ 0x7FFF987F);
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        int var99 = var94 * 128 + 64;
                        int var100 = var95 * 128 + 64;
                        class162 var101 = new class162(var96, class196.field3827, var99, var100, class39.method335(var99, class196.field3827, var100, 20896) - var97, var98, class18.field362);
                        class39.field773.method337(var101, (byte) -22);
                    }
                } else {
                    if (arg0 != Integer.MAX_VALUE) {
                        field2865 = -66;
                    }
                    if (class184.field3529 == 39) {
                        int var102 = class22.field418.method576(28836);
                        int var103 = class22.field418.method604((byte) 67);
                        int var104 = var103 >> 2;
                        int var105 = class61.field1212[var104];
                        int var106 = var103 & 0x3;
                        int var107 = class22.field418.method584((byte) 60);
                        int var108 = (var107 >> 4 & 0x7) + class67.field1449;
                        int var109 = (var107 & 0x7) + class21.field403;
                        if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                            class119.method925(-1, var106, var108, var105, var109, 0, class196.field3827, var102, var104, (byte) -121);
                        }
                    } else if (class184.field3529 == 198) {
                        int var110 = class22.field418.method586((byte) 121);
                        int var111 = class22.field418.method604((byte) -123);
                        int var112 = class67.field1449 + (var111 >> 4 & 0x7);
                        int var113 = class21.field403 + (var111 & 0x7);
                        int var114 = class22.field418.method576(arg0 - 2147454811);
                        if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                            class156 var115 = new class156();
                            var115.field3051 = var110;
                            var115.field3057 = var114;
                            if (class31.field597[class196.field3827][var112][var113] == null) {
                                class31.field597[class196.field3827][var112][var113] = new class40();
                            }
                            class31.field597[class196.field3827][var112][var113].method337(var115, (byte) -22);
                            class159.method1094(var113, var112, (byte) -108);
                        }
                    } else if (class184.field3529 == 61) {
                        int var116 = class22.field418.method569(arg0 - 2147457151);
                        int var117 = class22.field418.method594(27796);
                        int var118 = class21.field403 + (var117 & 0x7);
                        int var119 = (var117 >> 4 & 0x7) + class67.field1449;
                        int var120 = class22.field418.method586((byte) 81);
                        int var121 = class22.field418.method576(arg0 ^ 0x7FFF8F5B);
                        if (var119 >= 0 && var118 >= 0 && var119 < 104 && var118 < 104 && class180.field3443 != var120) {
                            class156 var122 = new class156();
                            var122.field3057 = var121;
                            var122.field3051 = var116;
                            if (class31.field597[class196.field3827][var119][var118] == null) {
                                class31.field597[class196.field3827][var119][var118] = new class40();
                            }
                            class31.field597[class196.field3827][var119][var118].method337(var122, (byte) -22);
                            class159.method1094(var118, var119, (byte) -115);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public static final void method1033(int arg0, int arg1) {
        field2843++;
        if (!class57.method493(arg1, 2093369712)) {
            return;
        }
        class61[] var2 = class51.field986[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class61 var4 = var2[var3];
            if (var4 != null) {
                var4.field1201 = 0;
                var4.field1238 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
    public static final void method1034(int arg0, int arg1) {
        field2857++;
        int[] var2 = class5.field84.field978;
        int var3 = var2.length;
        for (int var4 = arg1; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class182.field3490[arg0][var21][var5] & 0x18) == 0) {
                    class162.method1109(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class182.field3490[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class162.method1109(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class5.field84.method424();
        int var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 228;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class182.field3490[arg0][var19][var8] & 0x18) == 0) {
                    class47.method394(var8, var19, var6, var7, (byte) 50, arg0);
                }
                if (arg0 < 3 && (class182.field3490[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class47.method394(var8, var19, var6, var7, (byte) 50, arg0 + 1);
                }
            }
        }
        class92.field1930 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                long var11 = class85.method703(class196.field3827, var9, var10);
                if (var11 != 0L) {
                    int var13 = class99.method806(0, Integer.MAX_VALUE & (int) (var11 >>> 32)).field3931;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class54.field1043[class196.field3827].field741;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var9 + 3 > var15 && (var16[var15 + 1][var14] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var10 - 3 < var14 && (var16[var15][var14 - 1] & 0x12C0102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (var16[var15][var14 + 1] & 0x12C0120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class187.field3598[class92.field1930] = class137.field2682[var13];
                        class153.field3007[class92.field1930] = var15;
                        class52.field1002[class92.field1930] = var14;
                        class92.field1930++;
                    }
                }
            }
        }
        class79.field1714.method1096(false);
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field2867 = null;
        field2853 = null;
        field2871 = null;
        field2862 = null;
        field2841 = null;
        field2859 = null;
        field2876 = null;
        field2847 = null;
        field2877 = null;
        if (arg0 != 64) {
            field2853 = null;
        }
        field2863 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    public static final void method1036(boolean arg0) {
        if (class140.field2743 != null) {
            class140.field2743.method678((byte) -121);
        }
        field2852++;
        if (!arg0) {
            method1033(-108, 98);
        }
    }
}
