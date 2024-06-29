import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 extends class155 {

    @OriginalMember(owner = "client!je", name = "Qc", descriptor = "Ltd;")
    public static class136 field1430 = class145.method1172("Benutzen", 45);

    @OriginalMember(owner = "client!je", name = "Rc", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!je", name = "Jc", descriptor = "I")
    public static int field1423 = 1;

    @OriginalMember(owner = "client!je", name = "Tc", descriptor = "Ltd;")
    private static class136 field1433 = class145.method1172("Please wait 5 minutes before trying again)3", 45);

    @OriginalMember(owner = "client!je", name = "Pc", descriptor = "Ltd;")
    public static class136 field1429 = field1433;

    @OriginalMember(owner = "client!je", name = "Yc", descriptor = "Ltd;")
    private static class136 field1438 = class145.method1172("Loaded sprites", 45);

    @OriginalMember(owner = "client!je", name = "Kc", descriptor = "Ltd;")
    public static class136 field1424 = field1438;

    @OriginalMember(owner = "client!je", name = "Hc", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!je", name = "Ic", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!je", name = "Lc", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!je", name = "Sc", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!je", name = "Uc", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!je", name = "Vc", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!je", name = "Wc", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!je", name = "Xc", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!je", name = "Mc", descriptor = "Lw;")
    public static class150 field1426;

    @OriginalMember(owner = "client!je", name = "Oc", descriptor = "Lnf;")
    public class96 field1428;

    @OriginalMember(owner = "client!je", name = "Nc", descriptor = "[Z")
    public static boolean[] field1427;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V")
    public static final void method492(byte arg0) {
        class145.method1173(class38.field894, -4008);
        ++class49.field1115;
        ++field1437;
        if (class47.field1063 && class11.field188) {
            int var1 = class142.field3292;
            int var2 = var1 - class37.field865;
            if (var2 < class128.field3084) {
                var2 = class128.field3084;
            }
            int var3 = class18.field360;
            if (arg0 != -70) {
                method496(85, (byte) -1);
            }
            if (class38.field894.field1686 + var2 > class128.field3084 + class39.field903.field1686) {
                var2 = -class38.field894.field1686 + class39.field903.field1686 + class128.field3084;
            }
            int var4 = var3 - class8.field134;
            if (~class122.field2839 < ~var4) {
                var4 = class122.field2839;
            }
            if (var4 - -class38.field894.field1545 > class122.field2839 - -class39.field903.field1545) {
                var4 = -class38.field894.field1545 + class122.field2839 + class39.field903.field1545;
            }
            int var5 = -class99.field2372 + var2;
            int var6 = class38.field894.field1581;
            int var7 = var4 - class38.field880;
            if (class49.field1115 > class38.field894.field1607 && (var6 < var7 || var7 < -var6 || var6 < var5 || ~(-var6) < ~var5)) {
                class151.field3459 = true;
            }
            int var8 = -class122.field2839 + var4 + class39.field903.field1677;
            int var9 = class39.field903.field1646 + var2 + -class128.field3084;
            if (class38.field894.field1556 != null && class151.field3459) {
                class139 var10 = new class139();
                var10.field3223 = var9;
                var10.field3240 = var8;
                var10.field3244 = class38.field894.field1556;
                var10.field3222 = class38.field894;
                class96.method734(-9063, var10);
            }
            if (class133.field3139 == 0) {
                if (!class151.field3459) {
                    if ((class109.field2574 == 1 || class141.method1150(class14.field274 + -1, arg0 ^ 21154)) && class14.field274 > 2) {
                        class13.method94((byte) -82);
                    } else if (class14.field274 > 0) {
                        method496(class14.field274 + -1, (byte) -48);
                    }
                } else {
                    if (class38.field894.field1657 != null) {
                        class139 var11 = new class139();
                        var11.field3240 = var8;
                        var11.field3223 = var9;
                        var11.field3222 = class38.field894;
                        var11.field3233 = class13.field261;
                        var11.field3244 = class38.field894.field1657;
                        class96.method734(-9063, var11);
                    }
                    if (class13.field261 != null && class99.method806(class38.field894, 0) != null) {
                        class15.field304.method867(118, true);
                        class15.field304.method989(class38.field894.field1663, (byte) 45);
                        class15.field304.method1005(class13.field261.field1635, (byte) 40);
                        ++class78.field1794;
                        class15.field304.method1005(class38.field894.field1635, (byte) 40);
                        class15.field304.method1015(class13.field261.field1663, (byte) -79);
                    }
                }
                class38.field894 = null;
            }
        } else {
            if (class49.field1115 > 1) {
                class38.field894 = null;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Lda;")
    public final class23 method93(int arg0) {
        ++field1421;
        if (this.field1428 == null) {
            return null;
        } else {
            class116 var2 = super.field3585 != -1 && super.field3598 == 0 ? class29.method252(true, super.field3585) : null;
            class116 var3 = ~super.field3594 == 0 || ~super.field3594 == ~super.field3556 && var2 != null ? null : class29.method252(true, super.field3594);
            class23 var4 = this.field1428.method727(125, super.field3543, super.field3546, var3, var2);
            int var5 = 111 / ((arg0 - 18) / 63);
            if (var4 == null) {
                return null;
            } else {
                var4.method195();
                super.field3605 = var4.field2607;
                if (super.field3579 != -1 && super.field3551 != -1) {
                    class23 var6 = class151.method1191(super.field3579, 13).method246(-129, super.field3551);
                    if (var6 != null) {
                        class23[] var7 = new class23[] { var4, var6 };
                        var6.method191(0, -super.field3567, 0);
                        var4 = new class23(var7, 2);
                    }
                }
                if (this.field1428.field2307 == 1) {
                    var4.field486 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
    public static final void method493(byte arg0) {
        class18.field367.method599((byte) -68);
        ++field1432;
        class155.field3604 = 1;
        class49.field1128 = null;
        if (arg0 != -8) {
            field1429 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "j", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1438 = null;
        field1424 = null;
        field1429 = null;
        field1427 = null;
        field1426 = null;
        if (arg0 != -31666) {
            method496(20, (byte) 58);
        }
        field1430 = null;
        field1433 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLnb;)V")
    public static final void method495(byte arg0, class92 arg1) {
        ++field1422;
        if (arg0 <= 117) {
            method492((byte) -9);
        }
        short var2 = 256;
        for (int var3 = 0; class105.field2489.length > var3; ++var3) {
            class105.field2489[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; ++var4) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class105.field2489[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; ~var5 > -21; ++var5) {
            for (int var12 = 1; var2 - 1 > var12; ++var12) {
                for (int var14 = 1; var14 < 127; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class74.field1687[var15] = (class105.field2489[var15 - -1] - -class105.field2489[var15 + -128] + class105.field2489[var15 - -128] + class105.field2489[var15 - 1]) / 4;
                }
            }
            int[] var13 = class105.field2489;
            class105.field2489 = class74.field1687;
            class74.field1687 = var13;
        }
        if (arg1 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field2163; ++var7) {
                for (int var8 = 0; var8 < arg1.field2170; ++var8) {
                    if (arg1.field2169[var6++] != 0) {
                        int var9 = var8 - -16 + arg1.field2165;
                        int var10 = var7 - -arg1.field2166 + 16;
                        int var11 = (var10 << 7) + var9;
                        class105.field2489[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IB)V")
    public static final void method496(int arg0, byte arg1) {
        ++field1434;
        if (~arg0 <= -1) {
            int var2 = class61.field1301[arg0];
            int var3 = class132.field3122[arg0];
            int var4 = class27.field600[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            int var5 = class28.field618[arg0];
            if (var4 == 40) {
                class67 var6 = class122.field2846[var5];
                if (var6 != null) {
                    ++class152.field3474;
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var6.field3581[0], false, 0, var6.field3560[0], false);
                    class145.field3339 = 2;
                    class18.field368 = class8.field142;
                    class139.field3254 = class146.field3379;
                    class4.field85 = 0;
                    class15.field304.method867(170, true);
                    class15.field304.method1005(var5, (byte) 40);
                }
            }
            if (~var4 == -50) {
                ++class74.field1604;
                boolean var7 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                if (!var7) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class145.field3339 = 2;
                class4.field85 = 0;
                class18.field368 = class8.field142;
                class139.field3254 = class146.field3379;
                class15.field304.method867(133, true);
                class15.field304.method991(class91.field2145 + var2, false);
                class15.field304.method1042(219, var5);
                class15.field304.method1005(var3 - -class52.field1176, (byte) 40);
            }
            if (~var4 == -58) {
                ++class43.field976;
                class15.field304.method867(167, true);
                class15.field304.method1017(14697, var3);
                class15.field304.method1005(var5, (byte) 40);
                class15.field304.method997(var2, true);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (var4 == 4) {
                ++class83.field1974;
                class52.method424(var2, -117, var3, var5);
                class15.field304.method867(51, true);
                class15.field304.method991(var5 >> 14 & 32767, false);
                class15.field304.method997(var3 - -class52.field1176, true);
                class15.field304.method997(class91.field2145 + var2, true);
            }
            if (var4 == 47) {
                ++class40.field937;
                boolean var9 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                if (!var9) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class139.field3254 = class146.field3379;
                class18.field368 = class8.field142;
                class4.field85 = 0;
                class145.field3339 = 2;
                class15.field304.method867(196, true);
                class15.field304.method1042(219, var5);
                class15.field304.method991(class94.field2202, false);
                class15.field304.method989(class69.field1457, (byte) 112);
                class15.field304.method997(class52.field1176 + var3, true);
                class15.field304.method991(var2 - -class91.field2145, false);
            }
            if (~var4 == -32) {
                ++field1425;
                class15.field304.method867(217, true);
                class15.field304.method1013(var3, 5);
                class15.field304.method997(var2, true);
                class15.field304.method991(var5, false);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (var4 == 15) {
                class67 var11 = class122.field2846[var5];
                if (var11 != null) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var11.field3581[0], false, 0, var11.field3560[0], false);
                    class139.field3254 = class146.field3379;
                    class145.field3339 = 2;
                    class18.field368 = class8.field142;
                    class4.field85 = 0;
                    ++class70.field1478;
                    class15.field304.method867(197, true);
                    class15.field304.method1005(class121.field2751, (byte) 40);
                    class15.field304.method1005(var5, (byte) 40);
                    class15.field304.method1015(class139.field3250, (byte) -121);
                    class15.field304.method997(class128.field3081, true);
                }
            }
            if (~var4 == -31) {
                class67 var12 = class122.field2846[var5];
                if (var12 != null) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var12.field3581[0], false, 0, var12.field3560[0], false);
                    ++class39.field915;
                    class139.field3254 = class146.field3379;
                    class145.field3339 = 2;
                    class18.field368 = class8.field142;
                    class4.field85 = 0;
                    class15.field304.method867(181, true);
                    class15.field304.method1042(219, var5);
                }
            }
            if (~var4 == -45) {
                class13 var13 = class154.field3518[var5];
                if (var13 != null) {
                    ++class106.field2501;
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var13.field3581[0], false, 0, var13.field3560[0], false);
                    class4.field85 = 0;
                    class139.field3254 = class146.field3379;
                    class18.field368 = class8.field142;
                    class145.field3339 = 2;
                    class15.field304.method867(81, true);
                    class15.field304.method1005(var5, (byte) 40);
                }
            }
            if (var4 == 38) {
                class15.field304.method867(215, true);
                ++class77.field1766;
                class15.field304.method1042(219, var5);
                class15.field304.method991(var2, false);
                class15.field304.method1015(var3, (byte) 117);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (~var4 == -42) {
                class15.field304.method867(44, true);
                ++class89.field2101;
                class15.field304.method1015(var3, (byte) 99);
                class15.field304.method1042(219, var5);
                class15.field304.method1005(var2, (byte) 40);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (~var4 == -47) {
                class74 var14 = class12.method82(var3, (byte) 108);
                boolean var15 = true;
                if (var14.field1630 > 0) {
                    var15 = class5.method33(89, var14);
                }
                if (var15) {
                    class15.field304.method867(80, true);
                    ++class51.field1156;
                    class15.field304.method989(var3, (byte) 57);
                }
            }
            if (~var4 == -10 && class107.field2523 == null) {
                class91.method684(var2, var3, 9292);
                class107.field2523 = class125.method965(var3, (byte) 80, var2);
                class145.method1173(class107.field2523, -4008);
            }
            if (var4 == 24) {
                class67 var16 = class122.field2846[var5];
                if (var16 != null) {
                    ++class4.field73;
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var16.field3581[0], false, 0, var16.field3560[0], false);
                    class145.field3339 = 2;
                    class18.field368 = class8.field142;
                    class139.field3254 = class146.field3379;
                    class4.field85 = 0;
                    class15.field304.method867(155, true);
                    class15.field304.method1042(219, var5);
                }
            }
            if (var4 == 20) {
                class13 var17 = class154.field3518[var5];
                if (var17 != null) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var17.field3581[0], false, 0, var17.field3560[0], false);
                    class139.field3254 = class146.field3379;
                    class18.field368 = class8.field142;
                    class4.field85 = 0;
                    ++class8.field140;
                    class145.field3339 = 2;
                    class15.field304.method867(139, true);
                    class15.field304.method1017(14697, class69.field1457);
                    class15.field304.method1005(class94.field2202, (byte) 40);
                    class15.field304.method1005(var5, (byte) 40);
                }
            }
            if (var4 == 25) {
                class15.field304.method867(21, true);
                class15.field304.method1005(class94.field2202, (byte) 40);
                ++class62.field1320;
                class15.field304.method989(class69.field1457, (byte) 124);
                class15.field304.method1005(var2, (byte) 40);
                class15.field304.method1015(var3, (byte) 107);
            }
            if (~var4 == -4) {
                ++class61.field1307;
                boolean var18 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                if (!var18) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class139.field3254 = class146.field3379;
                class4.field85 = 0;
                class145.field3339 = 2;
                class18.field368 = class8.field142;
                class15.field304.method867(209, true);
                class15.field304.method991(class121.field2751, false);
                class15.field304.method997(var5, true);
                class15.field304.method1013(class139.field3250, 5);
                class15.field304.method997(class91.field2145 + var2, true);
                class15.field304.method991(class52.field1176 + var3, false);
                class15.field304.method1042(219, class128.field3081);
            }
            if (~var4 == -18) {
                ++class132.field3115;
                class15.field304.method867(220, true);
                class15.field304.method1015(var3, (byte) 91);
                class15.field304.method1042(219, var5);
                class15.field304.method1005(var2, (byte) 40);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (var4 == 34) {
                ++class149.field3422;
                boolean var20 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                if (!var20) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class139.field3254 = class146.field3379;
                class18.field368 = class8.field142;
                class145.field3339 = 2;
                class4.field85 = 0;
                class15.field304.method867(38, true);
                class15.field304.method997(var5, true);
                class15.field304.method997(var3 - -class52.field1176, true);
                class15.field304.method997(class91.field2145 + var2, true);
            }
            if (~var4 == -8) {
                ++class120.field2730;
                boolean var22 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                if (!var22) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class4.field85 = 0;
                class139.field3254 = class146.field3379;
                class145.field3339 = 2;
                class18.field368 = class8.field142;
                class15.field304.method867(169, true);
                class15.field304.method997(class91.field2145 + var2, true);
                class15.field304.method1042(219, var5);
                class15.field304.method1042(219, class52.field1176 + var3);
            }
            if (~var4 == -1008) {
                class145.field3339 = 2;
                class4.field85 = 0;
                class18.field368 = class8.field142;
                class139.field3254 = class146.field3379;
                class67 var24 = class122.field2846[var5];
                if (var24 != null) {
                    class96 var25 = var24.field1428;
                    if (var25.field2258 != null) {
                        var25 = var25.method732((byte) -114);
                    }
                    if (var25 != null) {
                        class15.field304.method867(88, true);
                        class15.field304.method1005(var25.field2264, (byte) 40);
                        ++class146.field3363;
                    }
                }
            }
            if (~var4 == -30 && class52.method424(var2, -104, var3, var5)) {
                class15.field304.method867(211, true);
                class15.field304.method997((var5 & 536861929) >> 14, true);
                class15.field304.method997(class128.field3081, true);
                class15.field304.method991(class52.field1176 + var3, false);
                ++class93.field2190;
                class15.field304.method997(class91.field2145 + var2, true);
                class15.field304.method989(class139.field3250, (byte) 58);
                class15.field304.method1042(219, class121.field2751);
            }
            if (var4 == 5) {
                ++class86.field2009;
                class52.method424(var2, arg1 + -28, var3, var5);
                class15.field304.method867(135, true);
                class15.field304.method1005(class91.field2145 + var2, (byte) 40);
                class15.field304.method1005((536867023 & var5) >> 14, (byte) 40);
                class15.field304.method991(class52.field1176 + var3, false);
            }
            if (~var4 == -24 && class52.method424(var2, -83, var3, var5)) {
                class15.field304.method867(101, true);
                ++class63.field1347;
                class15.field304.method1005(class94.field2202, (byte) 40);
                class15.field304.method1013(class69.field1457, 5);
                class15.field304.method1042(219, (var5 & 536865024) >> 14);
                class15.field304.method1005(class91.field2145 + var2, (byte) 40);
                class15.field304.method991(class52.field1176 + var3, false);
            }
            if (~var4 == -34) {
                ++class89.field2109;
                class15.field304.method867(207, true);
                class15.field304.method1042(219, var2);
                class15.field304.method997(var5, true);
                class15.field304.method1013(var3, 5);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (~var4 == -13) {
                class146.field3366.method762(class62.field1331, var2, var3);
            }
            if (~var4 == -59) {
                class15.field304.method867(231, true);
                ++class146.field3359;
                class15.field304.method1013(var3, 5);
                class15.field304.method1042(arg1 + 267, var5);
                class15.field304.method1005(var2, (byte) 40);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (var4 == 6) {
                ++class152.field3479;
                class15.field304.method867(114, true);
                class15.field304.method1042(arg1 + 267, var2);
                class15.field304.method1017(arg1 + 14745, var3);
                class15.field304.method997(var5, true);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (~var4 == -9) {
                ++class63.field1337;
                class15.field304.method867(164, true);
                class15.field304.method1013(class139.field3250, 5);
                class15.field304.method1042(219, class128.field3081);
                class15.field304.method1015(var3, (byte) -80);
                class15.field304.method991(var5, false);
                class15.field304.method997(class121.field2751, true);
                class15.field304.method1042(219, var2);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (var4 == 13) {
                class39.method331(-17515);
            }
            if (var4 == 1006) {
                ++class146.field3367;
                class52.method424(var2, arg1 + -18, var3, var5);
                class15.field304.method867(32, true);
                class15.field304.method1005(class52.field1176 + var3, (byte) 40);
                class15.field304.method991((536869846 & var5) >> 14, false);
                class15.field304.method991(class91.field2145 + var2, false);
            }
            if (var4 == 36) {
                class13 var26 = class154.field3518[var5];
                if (var26 != null) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var26.field3581[0], false, 0, var26.field3560[0], false);
                    ++class105.field2481;
                    class139.field3254 = class146.field3379;
                    class4.field85 = 0;
                    class18.field368 = class8.field142;
                    class145.field3339 = 2;
                    class15.field304.method867(97, true);
                    class15.field304.method997(var5, true);
                }
            }
            if (var4 == 18) {
                ++class127.field2986;
                boolean var27 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                if (!var27) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class145.field3339 = 2;
                class18.field368 = class8.field142;
                class139.field3254 = class146.field3379;
                class4.field85 = 0;
                class15.field304.method867(242, true);
                class15.field304.method1005(class91.field2145 + var2, (byte) 40);
                class15.field304.method1005(var3 - -class52.field1176, (byte) 40);
                class15.field304.method1042(219, var5);
            }
            if (~var4 == -20) {
                class67 var29 = class122.field2846[var5];
                if (var29 != null) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var29.field3581[0], false, 0, var29.field3560[0], false);
                    class139.field3254 = class146.field3379;
                    class18.field368 = class8.field142;
                    class145.field3339 = 2;
                    class4.field85 = 0;
                    ++class52.field1174;
                    class15.field304.method867(106, true);
                    class15.field304.method1042(219, var5);
                }
            }
            if (var4 == 37) {
                class15.field304.method867(29, true);
                class15.field304.method997(var2, true);
                class15.field304.method1015(class69.field1457, (byte) -44);
                ++class69.field1454;
                class15.field304.method991(var5, false);
                class15.field304.method1015(var3, (byte) 111);
                class15.field304.method997(class94.field2202, true);
                class69.field1459 = 0;
                class44.field1015 = class12.method82(var3, (byte) 108);
                class132.field3118 = var2;
            }
            if (var4 == 45) {
                ++class52.field1166;
                class52.method424(var2, -58, var3, var5);
                class15.field304.method867(42, true);
                class15.field304.method997(class52.field1176 + var3, true);
                class15.field304.method1042(arg1 + 267, var5 >> 14 & 32767);
                class15.field304.method1042(arg1 ^ -245, var2 - -class91.field2145);
            }
            if (~var4 == -12) {
                boolean var30 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                ++class127.field2965;
                if (!var30) {
                    class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var3, false, 0, var2, false);
                }
                class4.field85 = 0;
                class18.field368 = class8.field142;
                class145.field3339 = 2;
                class139.field3254 = class146.field3379;
                class15.field304.method867(173, true);
                class15.field304.method997(class52.field1176 + var3, true);
                class15.field304.method991(var2 - -class91.field2145, false);
                class15.field304.method1042(219, var5);
            }
            if (var4 == 1001) {
                class139.field3254 = class146.field3379;
                class4.field85 = 0;
                ++class124.field2883;
                class145.field3339 = 2;
                class18.field368 = class8.field142;
                class15.field304.method867(226, true);
                class15.field304.method997(32767 & var5 >> 14, true);
            }
            if (~var4 == -43) {
                class15.field304.method867(80, true);
                class15.field304.method989(var3, (byte) 81);
                ++class51.field1156;
                class74 var32 = class12.method82(var3, (byte) 108);
                if (var32.field1547 != null && var32.field1547[0][0] == 5) {
                    int var33 = var32.field1547[0][1];
                    if (~class18.field371[var33] != ~var32.field1596[0]) {
                        class18.field371[var33] = var32.field1596[0];
                        class77.method560(var33, (byte) -52);
                    }
                }
            }
            if (var4 == 22) {
                class108.method851(arg1 + 303);
                class74 var34 = class12.method82(var3, (byte) 108);
                class147.field3410 = 1;
                class139.field3250 = var3;
                class121.field2751 = var5;
                class128.field3081 = var2;
                class145.method1173(var34, -4008);
                class49.field1126 = class79.method570(0, new class136[] { class41.field961, class63.method472(var5, (byte) -98).field2789, class16.field330 });
                if (class49.field1126 == null) {
                    class49.field1126 = class104.field2475;
                }
            } else {
                if (var4 == 21) {
                    class13 var35 = class154.field3518[var5];
                    if (var35 != null) {
                        class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var35.field3581[0], false, 0, var35.field3560[0], false);
                        class4.field85 = 0;
                        class145.field3339 = 2;
                        class139.field3254 = class146.field3379;
                        ++class55.field1213;
                        class18.field368 = class8.field142;
                        class15.field304.method867(60, true);
                        class15.field304.method1042(219, var5);
                    }
                }
                if (var4 == 14) {
                    class13 var36 = class154.field3518[var5];
                    if (var36 != null) {
                        class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var36.field3581[0], false, 0, var36.field3560[0], false);
                        class139.field3254 = class146.field3379;
                        ++class129.field3099;
                        class4.field85 = 0;
                        class145.field3339 = 2;
                        class18.field368 = class8.field142;
                        class15.field304.method867(166, true);
                        class15.field304.method997(var5, true);
                        class15.field304.method991(class128.field3081, false);
                        class15.field304.method1017(14697, class139.field3250);
                        class15.field304.method1005(class121.field2751, (byte) 40);
                    }
                }
                if (~var4 == -1003) {
                    class74 var37 = class12.method82(var3, (byte) 108);
                    if (var37 != null && var37.field1595[var2] >= 100000) {
                        class27.method236((byte) -38, class79.method570(0, new class136[] { class19.method140(var37.field1595[var2], -122), class136.field3185, class63.method472(var5, (byte) 117).field2789 }), 0, class37.field871);
                    } else {
                        ++class12.field212;
                        class15.field304.method867(176, true);
                        class15.field304.method991(var5, false);
                    }
                    class69.field1459 = 0;
                    class44.field1015 = class12.method82(var3, (byte) 108);
                    class132.field3118 = var2;
                }
                if (~var4 == -49) {
                    class74 var38 = class125.method965(var3, (byte) 80, var2);
                    if (var38 != null) {
                        class108.method851(arg1 + 303);
                        class35.method305(class122.method955(129516, class56.method444(var38, 0)), var2, 0, var3);
                        class147.field3410 = 0;
                        class27.field602 = class86.method641(var38, true);
                        if (class27.field602 == null) {
                            class27.field602 = class86.field2023;
                        }
                        if (!var38.field1616) {
                            class28.field620 = class79.method570(0, new class136[] { class64.field1364, var38.field1558, class16.field330 });
                            return;
                        }
                        class28.field620 = class79.method570(arg1 + 48, new class136[] { var38.field1614, class16.field330 });
                    }
                } else {
                    if (var4 == 2) {
                        class52.method424(var2, arg1 + -50, var3, var5);
                        ++class14.field272;
                        class15.field304.method867(192, true);
                        class15.field304.method1005((536868528 & var5) >> 14, (byte) 40);
                        class15.field304.method997(class91.field2145 + var2, true);
                        class15.field304.method1042(219, class52.field1176 + var3);
                    }
                    if (var4 == 35) {
                        class67 var39 = class122.field2846[var5];
                        if (var39 != null) {
                            ++class143.field3319;
                            class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var39.field3581[0], false, 0, var39.field3560[0], false);
                            class4.field85 = 0;
                            class145.field3339 = 2;
                            class18.field368 = class8.field142;
                            class139.field3254 = class146.field3379;
                            class15.field304.method867(41, true);
                            class15.field304.method1005(var5, (byte) 40);
                        }
                    }
                    if (var4 == 28) {
                        ++class151.field3457;
                        class15.field304.method867(105, true);
                        class15.field304.method1005(var2, (byte) 40);
                        class15.field304.method1042(219, var5);
                        class15.field304.method989(var3, (byte) 68);
                        class69.field1459 = 0;
                        class44.field1015 = class12.method82(var3, (byte) 108);
                        class132.field3118 = var2;
                    }
                    if (~var4 == -44 || var4 == 1003) {
                        class141.method1143(var5, var3, class65.field1407[arg0], true, var2);
                    }
                    if (arg1 != -48) {
                        method492((byte) -40);
                    }
                    if (var4 == 39) {
                        ++class91.field2143;
                        class15.field304.method867(23, true);
                        class15.field304.method1042(219, var5);
                        class15.field304.method991(var2, false);
                        class15.field304.method989(var3, (byte) 122);
                        class69.field1459 = 0;
                        class44.field1015 = class12.method82(var3, (byte) 108);
                        class132.field3118 = var2;
                    }
                    if (var4 == 26) {
                        ++class51.field1156;
                        class15.field304.method867(80, true);
                        class15.field304.method989(var3, (byte) 88);
                        class74 var40 = class12.method82(var3, (byte) 108);
                        if (var40.field1547 != null && var40.field1547[0][0] == 5) {
                            int var41 = var40.field1547[0][1];
                            class18.field371[var41] = 1 - class18.field371[var41];
                            class77.method560(var41, (byte) -52);
                        }
                    }
                    if (~var4 == -2) {
                        class13 var42 = class154.field3518[var5];
                        if (var42 != null) {
                            ++class62.field1324;
                            class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var42.field3581[0], false, 0, var42.field3560[0], false);
                            class18.field368 = class8.field142;
                            class145.field3339 = 2;
                            class139.field3254 = class146.field3379;
                            class4.field85 = 0;
                            class15.field304.method867(35, true);
                            class15.field304.method997(var5, true);
                        }
                    }
                    if (var4 == 16) {
                        class67 var43 = class122.field2846[var5];
                        if (var43 != null) {
                            ++class142.field3295;
                            class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var43.field3581[0], false, 0, var43.field3560[0], false);
                            class139.field3254 = class146.field3379;
                            class145.field3339 = 2;
                            class18.field368 = class8.field142;
                            class4.field85 = 0;
                            class15.field304.method867(109, true);
                            class15.field304.method997(var5, true);
                            class15.field304.method1017(arg1 + 14745, class69.field1457);
                            class15.field304.method997(class94.field2202, true);
                        }
                    }
                    if (var4 == 32) {
                        class13 var44 = class154.field3518[var5];
                        if (var44 != null) {
                            class41.method345(1, 1, 0, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], var44.field3581[0], false, 0, var44.field3560[0], false);
                            class145.field3339 = 2;
                            class4.field85 = 0;
                            ++class55.field1215;
                            class18.field368 = class8.field142;
                            class139.field3254 = class146.field3379;
                            class15.field304.method867(188, true);
                            class15.field304.method1042(219, var5);
                        }
                    }
                    if (~var4 == -1005) {
                        ++class12.field212;
                        class139.field3254 = class146.field3379;
                        class18.field368 = class8.field142;
                        class4.field85 = 0;
                        class145.field3339 = 2;
                        class15.field304.method867(176, true);
                        class15.field304.method991(var5, false);
                    }
                    if (class147.field3410 != 0) {
                        class147.field3410 = 0;
                        class145.method1173(class12.method82(class139.field3250, (byte) 108), -4008);
                    }
                    if (class40.field933) {
                        class108.method851(255);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(I)Z")
    public final boolean method91(int arg0) {
        ++field1436;
        if (arg0 <= 41) {
            return true;
        } else {
            return this.field1428 != null;
        }
    }
}
