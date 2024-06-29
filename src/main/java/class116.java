import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class116 extends class103 {

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
    public static int[] field2065 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lda;")
    public static class275 field2058 = class255.method1672(111, "::fps ");

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Loa;")
    public static class276 field2055 = new class276(512);

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "[I")
    public static int[] field2072 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Lda;")
    private static class275 field2071 = class255.method1672(94, " ");

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Lda;")
    public static class275 field2073 = field2071;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "J")
    public long field2057;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lbe;")
    public class116 field2060;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Lbe;")
    public class116 field2062;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lod;")
    public static class15 field2068;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public final void method843(int arg0) {
        field2056++;
        if (arg0 == 22610 && this.field2060 != null) {
            this.field2060.field2062 = this.field2062;
            this.field2062.field2060 = this.field2060;
            this.field2062 = null;
            this.field2060 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2066++;
        class8 var10 = null;
        for (class8 var11 = (class8) class22.field336.method550(-69); var11 != null; var11 = (class8) class22.field336.method545(104)) {
            if (var11.field127 == arg7 && var11.field122 == arg1 && var11.field126 == arg3 && var11.field118 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class8();
            var10.field122 = arg1;
            var10.field126 = arg3;
            var10.field118 = arg4;
            var10.field127 = arg7;
            class125.method908(var10, (byte) -128);
            class22.field336.method547(104, var10);
        }
        int var12 = 29 / ((arg0 + 49) / 63);
        var10.field131 = arg9;
        var10.field125 = arg2;
        var10.field130 = arg5;
        var10.field124 = arg6;
        var10.field132 = arg8;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method845(byte arg0, Random arg1, int arg2) {
        field2063++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class92.method661(arg2, (byte) -115)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            int var5 = -11 % ((arg0 - 20) / 55);
            return class248.method1628((byte) 123, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method846(byte arg0) {
        class84.field1371 = class76.field1247;
        class141.field2483 = class66.field1090;
        class146.field2556 = class208.field3516;
        class66.field1092 = class55.field939;
        class147.field2575 = class127.field2250;
        field2061++;
        class207.field3493 = class197.field3375;
        class137.field2409 = class276.field4813;
        class168.field2934 = class38.field634;
        class172.field2995 = class55.field936;
        class124.field2211 = class65.field1077;
        class139.field2435 = class161.field2824;
        class89.field1520 = class267.field4647;
        class195.field3338 = class82.field1332;
        class73.field1187 = class59.field991;
        class36.field596 = class133.field2372;
        class45.field753 = class99.field1679;
        class30.field451 = class90.field1529;
        class14.field224 = class203.field3451;
        class57.field952 = class76.field1256;
        class42.field705 = class35.field582;
        class38.field629 = class246.field4353;
        class224.field3781 = class175.field3027;
        class157.field2757 = class51.field852;
        class52.field878 = class89.field1524;
        class181.field3109 = class57.field959;
        class174.field3008 = class143.field2516;
        class124.field2215 = class102.field1700;
        class82.field1340 = class211.field3573;
        class117.field2085 = class9.field139;
        class255.field4496 = class196.field3355;
        class159.field2785 = class14.field225;
        class82.field1339 = class211.field3573;
        field2073 = class93.field1594;
        class118.field2104 = class113.field2000;
        class171.field2977 = class190.field3275;
        class112.field1981 = class251.field4453;
        class141.field2498 = class241.field4228;
        class109.field1926 = class144.field2528;
        class122.field2197 = class240.field4213;
        class207.field3502 = class52.field860;
        class6.field80 = class145.field2539;
        class226.field3831 = class169.field2945;
        class76.field1242 = class244.field4256;
        class151.field2640 = class38.field635;
        class77.field1282 = class152.field2653;
        class127.field2252 = class216.field3694;
        class97.field1649 = class129.field2279;
        class207.field3508 = class197.field3375;
        class117.field2091 = class214.field3650;
        class69.field1116 = class256.field4509;
        class170.field2974 = class143.field2515;
        class25.field419 = class90.field1532;
        class85.field1406 = class244.field4263;
        class270.field4699 = class94.field1615;
        class42.field714 = class35.field582;
        class179.field3086 = class175.field3039;
        class92.field1568 = class212.field3584;
        class234.field4088 = class67.field1098;
        class174.field3022 = class189.field3257;
        if (arg0 != 86) {
            method848(-45, -10, (byte) -90, -121, 14, -65, -46);
        }
        class236.field4114 = class73.field1191;
        class114.field2026 = class251.field4455;
        class106.field1843 = class5.field72;
        class123.field2198 = class237.field4117;
        class39.field658 = class252.field4476;
        class248.field4368 = class203.field3459;
        class12.field179 = class8.field120;
        class109.field1892 = class113.field2003;
        class165.field2869 = class110.field1947;
        class269.field4674 = class46.field763;
        class237.field4123 = class38.field626;
        class57.field957 = class138.field2423;
        class197.field3368 = class174.field3014;
        class211.field3582 = class124.field2220;
        class189.field3268 = class258.field4518;
        class18.field259 = class40.field674;
        class219.field3723 = class255.field4494;
        class51.field844 = class95.field1620;
        class92.field1572 = class207.field3495;
        class187.field3208 = class103.field1709;
        class129.field2275 = class180.field3092;
        class182.field3128 = class100.field1686;
        class267.field4635 = class97.field1645;
        class33.field488 = class196.field3359;
        class41.field677 = class78.field1291;
        class14.field221 = class139.field2429;
        class39.field652 = class91.field1551;
        class4.field63 = class172.field2992;
        class122.field2186 = class173.field3007;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public static void method847(int arg0) {
        if (arg0 != -4931) {
            return;
        }
        field2068 = null;
        field2055 = null;
        field2071 = null;
        field2073 = null;
        field2065 = null;
        field2072 = null;
        field2058 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIBIIII)V")
    public static final void method848(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2064++;
        if (class190.field3272 == 0) {
            class163.field2841++;
            int var7 = class34.field540;
            int var8 = class226.field3833;
            int var9 = class153.field2686;
            int var10 = (arg5 - arg6) * (var8 - var7) / arg3 + var7;
            int var11 = class207.field3501;
            int var12 = (arg4 - arg1) * (var11 - var9) / arg0 + var9;
            if (class144.field2523 && (class150.field2619 & 0x40) == 64) {
                class229 var13 = class182.method1219((byte) 114, class156.field2748, class97.field1646);
                if (var13 == null) {
                    class29.method172(-115);
                } else {
                    class246.method1619(0L, var10, class67.field1096, class103.field1715, var12, (byte) -70, (short) 13);
                }
            } else {
                class246.method1619(0L, var10, class79.field1301, class3.field19, var12, (byte) -70, (short) 29);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg2 <= 0) {
            field2071 = null;
        }
        while (class152.field2654 > var16) {
            long var17 = class184.field3156[var16];
            int var19 = ((int) var17 & 0x3FA0) >> 7;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 & 0x7F;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                label281: {
                    var14 = var17;
                    if (var20 == 2 && class81.method530(class159.field2790, var21, var19, var17)) {
                        class34 var23 = class146.method1040(-79, var22);
                        if (var23.field528 != null) {
                            var23 = var23.method203(-113);
                        }
                        if (var23 == null) {
                            break label281;
                        }
                        if (class190.field3272 == 1) {
                            class246.method1619(var17, var21, class197.method1291(new class275[] { class210.field3550, class55.field927, var23.field501 }, -30025), class165.field2869, var19, (byte) -70, (short) 30);
                            class240.field4221++;
                        } else if (!class144.field2523) {
                            class57.field958++;
                            class275[] var24 = var23.field557;
                            if (class181.field3099) {
                                var24 = class271.method1785(var24, (byte) 110);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class158.field2773++;
                                        short var26 = 0;
                                        if (var25 == 0) {
                                            var26 = 35;
                                        }
                                        if (var25 == 1) {
                                            var26 = 46;
                                        }
                                        if (var25 == 2) {
                                            var26 = 2;
                                        }
                                        if (var25 == 3) {
                                            var26 = 15;
                                        }
                                        if (var25 == 4) {
                                            var26 = 1005;
                                        }
                                        class246.method1619(var17, var21, class197.method1291(new class275[] { class31.field477, var23.field501 }, -30025), var24[var25], var19, (byte) -70, var26);
                                    }
                                }
                            }
                            class246.method1619((long) var23.field508, var21, class197.method1291(new class275[] { class31.field477, var23.field501 }, -30025), class248.field4368, var19, (byte) -70, (short) 1007);
                        } else if ((class150.field2619 & 0x4) == 4) {
                            class55.field928++;
                            class246.method1619(var17, var21, class197.method1291(new class275[] { class19.field266, class55.field927, var23.field501 }, -30025), class103.field1715, var19, (byte) -70, (short) 12);
                        }
                    }
                    if (var20 == 1) {
                        class165 var27 = class31.field478[var22];
                        if (var27.field2873.field399 == 1 && (var27.field1770 & 0x7F) == 64 && (var27.field1758 & 0x7F) == 64) {
                            for (int var28 = 0; var28 < class181.field3118; var28++) {
                                class165 var31 = class31.field478[class228.field3851[var28]];
                                if (var31 != null && var27 != var31 && var31.field2873.field399 == 1 && var27.field1770 == var31.field1770 && var27.field1758 == var31.field1758) {
                                    class99.method706(var21, var31.field2873, var19, class228.field3851[var28], (byte) -92);
                                }
                            }
                            for (int var29 = 0; var29 < class32.field486; var29++) {
                                class109 var30 = class16.field238[class149.field2595[var29]];
                                if (var30 != null && var27.field1770 == var30.field1770 && var27.field1758 == var30.field1758) {
                                    class150.method1061(-52, var30, class149.field2595[var29], var21, var19);
                                }
                            }
                        }
                        class99.method706(var21, var27.field2873, var19, var22, (byte) -92);
                    }
                    if (var20 == 0) {
                        class109 var32 = class16.field238[var22];
                        if ((var32.field1770 & 0x7F) == 64 && (var32.field1758 & 0x7F) == 64) {
                            for (int var33 = 0; var33 < class181.field3118; var33++) {
                                class165 var36 = class31.field478[class228.field3851[var33]];
                                if (var36 != null && var36.field2873.field399 == 1 && var32.field1770 == var36.field1770 && var32.field1758 == var36.field1758) {
                                    class99.method706(var21, var36.field2873, var19, class228.field3851[var33], (byte) -92);
                                }
                            }
                            for (int var34 = 0; var34 < class32.field486; var34++) {
                                class109 var35 = class16.field238[class149.field2595[var34]];
                                if (var35 != null && var32 != var35 && var32.field1770 == var35.field1770 && var32.field1758 == var35.field1758) {
                                    class150.method1061(-92, var35, class149.field2595[var34], var21, var19);
                                }
                            }
                        }
                        class150.method1061(-86, var32, var22, var21, var19);
                    }
                    if (var20 == 3) {
                        class84 var37 = class118.field2122[class159.field2790][var21][var19];
                        if (var37 != null) {
                            for (class256 var38 = (class256) var37.method546(21708); var38 != null; var38 = (class256) var37.method551(23993)) {
                                int var39 = var38.field4507.field1567;
                                class245 var40 = class210.method1352(45, var39);
                                if (class190.field3272 == 1) {
                                    class246.method1619((long) var39, var21, class197.method1291(new class275[] { class210.field3550, class77.field1268, var40.field4322 }, -30025), class165.field2869, var19, (byte) -70, (short) 31);
                                    class118.field2123++;
                                } else if (!class144.field2523) {
                                    class56.field943++;
                                    class275[] var41 = var40.field4287;
                                    if (class181.field3099) {
                                        var41 = class271.method1785(var41, (byte) 110);
                                    }
                                    for (int var42 = 4; var42 >= 0; var42--) {
                                        if (var41 != null && var41[var42] != null) {
                                            class100.field1683++;
                                            byte var43 = 0;
                                            if (var42 == 0) {
                                                var43 = 59;
                                            }
                                            if (var42 == 1) {
                                                var43 = 50;
                                            }
                                            if (var42 == 2) {
                                                var43 = 49;
                                            }
                                            if (var42 == 3) {
                                                var43 = 4;
                                            }
                                            if (var42 == 4) {
                                                var43 = 20;
                                            }
                                            class246.method1619((long) var39, var21, class197.method1291(new class275[] { class215.field3668, var40.field4322 }, -30025), var41[var42], var19, (byte) -70, var43);
                                        } else if (var42 == 2) {
                                            class273.field4714++;
                                            class246.method1619((long) var39, var21, class197.method1291(new class275[] { class215.field3668, var40.field4322 }, -30025), class234.field4088, var19, (byte) -70, (short) 49);
                                        }
                                    }
                                    class246.method1619((long) var39, var21, class197.method1291(new class275[] { class215.field3668, var40.field4322 }, -30025), class248.field4368, var19, (byte) -70, (short) 1004);
                                } else if ((class150.field2619 & 0x1) == 1) {
                                    class170.field2955++;
                                    class246.method1619((long) var39, var21, class197.method1291(new class275[] { class19.field266, class77.field1268, var40.field4322 }, -30025), class103.field1715, var19, (byte) -70, (short) 6);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }
}
