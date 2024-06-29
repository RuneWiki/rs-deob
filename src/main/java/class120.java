import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lqf;")
    public static class117 field2863 = class72.method514(119, " <col=00ff80>");

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lqf;")
    public static class117 field2860 = class72.method514(101, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2864 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lqf;")
    public static class117 field2859 = class72.method514(107, "null");

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lqf;")
    public static class117 field2867 = class72.method514(113, "huffman");

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lqf;")
    public static class117 field2870 = class72.method514(115, "Script error in: ");

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lqf;")
    private static class117 field2858 = class72.method514(124, "Add friend");

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lqf;")
    public static class117 field2874 = field2858;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2876 = -1;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lqf;")
    private static class117 field2862 = class72.method514(118, "Loaded textures");

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lqf;")
    public static class117 field2865 = field2862;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lr;")
    public static class118 field2872;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lha;")
    public static class50 field2866;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lha;")
    public static class50 field2871;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
    public static int[] field2869;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method964(int arg0) {
        if (arg0 != 1) {
            method965(29);
        }
        if (class90.field2170 != null) {
            class90.field2170.method1203(false);
        }
        if (class119.field2853 != null) {
            class119.field2853.method1203(false);
        }
        field2868++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method965(int arg0) {
        field2871 = null;
        field2874 = null;
        field2863 = null;
        field2870 = null;
        field2872 = null;
        field2862 = null;
        field2865 = null;
        field2866 = null;
        field2867 = null;
        field2858 = null;
        field2860 = null;
        field2869 = null;
        if (arg0 != 3) {
            method965(-107);
        }
        field2859 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static final void method966(boolean arg0) {
        if (class16.field245 > 1) {
            class16.field245--;
        }
        field2861++;
        if (class41.field817 > 0) {
            class41.field817--;
        }
        if (class76.field1682) {
            class76.field1682 = false;
            class64.method448(109);
            return;
        }
        for (int var1 = 0; var1 < 100 && class42.method294(83); var1++) {
        }
        if (class48.field1022 != 30 && class48.field1022 != 35) {
            return;
        }
        if (class115.field2713 && class48.field1022 == 30) {
            class152.field3752 = 0;
            class133.field3142 = 0;
            while (class82.method641((byte) 114)) {
            }
            for (int var2 = 0; var2 < class130.field3095.length; var2++) {
                class130.field3095[var2] = false;
            }
        }
        class21.method161(67, class99.field2373, !arg0);
        Object var3 = class26.field525.field3588;
        synchronized (class26.field525.field3588) {
            if (!class75.field1623) {
                class26.field525.field3603 = 0;
            } else if (class133.field3142 != 0 || class26.field525.field3603 >= 40) {
                class99.field2373.method961(203, -1198);
                int var4 = 0;
                class99.field2373.method571(0, -11124);
                int var5 = class99.field2373.field1691;
                for (int var6 = 0; var6 < class26.field525.field3603 && class99.field2373.field1691 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class26.field525.field3601[var6];
                    int var8 = class26.field525.field3602[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class26.field525.field3601[var6] == -1 && class26.field525.field3602[var6] == -1) {
                        var9 = 524287;
                        var8 = -1;
                        var7 = -1;
                    }
                    if (class31.field664 != var8 || class65.field1351 != var7) {
                        int var10 = var7 - class65.field1351;
                        int var11 = var8 - class31.field664;
                        class65.field1351 = var7;
                        class31.field664 = var8;
                        if (class35.field724 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class99.field2373.method556((class35.field724 << 12) + (var11 << 6) + var10, true);
                            class35.field724 = 0;
                        } else if (class35.field724 < 8) {
                            class99.field2373.method568((class35.field724 << 19) + var9 + 8388608, 990);
                            class35.field724 = 0;
                        } else {
                            class99.field2373.method600((class35.field724 << 19) + var9 - 1073741824, -30515);
                            class35.field724 = 0;
                        }
                    } else if (class35.field724 < 2047) {
                        class35.field724++;
                    }
                }
                class99.field2373.method569(-1, class99.field2373.field1691 - var5);
                class81.field1850++;
                if (var4 < class26.field525.field3603) {
                    class26.field525.field3603 -= var4;
                    for (int var12 = 0; var12 < class26.field525.field3603; var12++) {
                        class26.field525.field3602[var12] = class26.field525.field3602[var12 + var4];
                        class26.field525.field3601[var12] = class26.field525.field3601[var4 + var12];
                    }
                } else {
                    class26.field525.field3603 = 0;
                }
            }
        }
        if (class133.field3142 != 0) {
            class138.field3279++;
            long var13 = (class34.field705 - class152.field3763) / 50L;
            class152.field3763 = class34.field705;
            int var15 = class102.field2462;
            byte var16 = 0;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            if (class133.field3142 == 2) {
                var16 = 1;
            }
            int var17 = class153.field3788;
            int var18 = (int) var13;
            class99.field2373.method961(127, -1198);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 764) {
                var17 = 764;
            }
            int var19 = var15 * 765 + var17;
            class99.field2373.method585(29037224, (var18 << 20) + var19 + (var16 << 19));
        }
        if (class130.field3095[96] || class130.field3095[97] || class130.field3095[98] || class130.field3095[99]) {
            class116.field2759 = true;
        }
        if (class153.field3778 > 0) {
            class153.field3778--;
        }
        if (class116.field2759 && class153.field3778 <= 0) {
            class153.field3778 = 20;
            class116.field2759 = false;
            class128.field3024++;
            class99.field2373.method961(162, -1198);
            class99.field2373.method558(4773, class128.field3035);
            class99.field2373.method558(4773, class65.field1354);
        }
        if (class18.field291 && !class133.field3158) {
            class133.field3158 = true;
            class104.field2509++;
            class99.field2373.method961(101, -1198);
            class99.field2373.method571(1, -11124);
        }
        if (arg0 == class18.field291 && class133.field3158) {
            class133.field3158 = false;
            class104.field2509++;
            class99.field2373.method961(101, -1198);
            class99.field2373.method571(0, -11124);
        }
        class52.method385((byte) 108);
        if (class48.field1022 != 30 && class48.field1022 != 35) {
            return;
        }
        class35.method271(-2);
        class96.method759(-116);
        class40.field793++;
        if (class40.field793 > 750) {
            class64.method448(62);
            return;
        }
        class146.method1172(2047);
        class132.method1024((byte) -88);
        class130.method1015(-105);
        if (class34.field713 != 0) {
            class112.field2625++;
            if (class112.field2625 >= 15) {
                if (class34.field713 == 2) {
                    class139.field3310 = true;
                }
                if (class34.field713 == 3) {
                    class87.field1993 = true;
                }
                class34.field713 = 0;
            }
        }
        class83.field1911++;
        if (class60.field1228 != 0) {
            class16.field261 += 20;
            if (class16.field261 >= 400) {
                class60.field1228 = 0;
            }
        }
        if (class121.field2891 != 0) {
            if (class107.field2553 + 5 < class143.field3504 || class143.field3504 < class107.field2553 - 5 || class16.field252 + 5 < class18.field274 || class16.field252 - 5 > class18.field274) {
                class110.field2600 = true;
            }
            class65.field1343++;
            if (class152.field3752 == 0) {
                if (class121.field2891 == 3) {
                    class87.field1993 = true;
                }
                if (class121.field2891 == 2) {
                    class139.field3310 = true;
                }
                class121.field2891 = 0;
                if (class110.field2600 && class65.field1343 >= 5) {
                    class85.field1939 = -1;
                    class135.method1056((byte) 18);
                    if (class85.field1939 == class83.field1900 && class83.field1906 != class44.field879) {
                        class80.field1821++;
                        byte var20 = 0;
                        class89 var21 = class104.method801(class83.field1900, -87);
                        if (class130.field3080 == 1 && var21.field2136 == 206) {
                            var20 = 1;
                        }
                        if (var21.field2161[class44.field879] <= 0) {
                            var20 = 0;
                        }
                        if (class136.method1062(class42.method292(var21, -5447), 19138)) {
                            int var22 = class83.field1906;
                            int var23 = class44.field879;
                            var21.field2161[var23] = var21.field2161[var22];
                            var21.field2088[var23] = var21.field2088[var22];
                            var21.field2161[var22] = -1;
                            var21.field2088[var22] = 0;
                        } else if (var20 == 1) {
                            int var24 = class83.field1906;
                            int var25 = class44.field879;
                            while (var24 != var25) {
                                if (var25 < var24) {
                                    var21.method702(0, var24 - 1, var24);
                                    var24--;
                                } else if (var25 > var24) {
                                    var21.method702(0, var24 + 1, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var21.method702(0, class44.field879, class83.field1906);
                        }
                        class99.field2373.method961(55, -1198);
                        class99.field2373.method601(class44.field879, -128);
                        class99.field2373.method595(!arg0, class83.field1900);
                        class99.field2373.method583(var20, -4);
                        class99.field2373.method556(class83.field1906, true);
                    }
                } else if ((class45.field889 == 1 || class107.method810(class27.field531 - 1, 94)) && class27.field531 > 2) {
                    class90.method716(2);
                } else if (class27.field531 > 0) {
                    class90.method717((byte) -102, class27.field531 - 1);
                }
                class112.field2625 = 10;
                class133.field3142 = 0;
            }
        }
        byte var26 = 34;
        if (class135.field3227 == -1) {
            if (class96.field2316 != -1) {
                class44.method307(0, 4, 338, 4, class96.field2316, 516, var26, 0);
            } else if (class56.field1155 != -1) {
                class44.method307(0, 4, 338, 4, class56.field1155, 516, var26, 0);
            }
            if (class140.field3343 != -1) {
                class44.method307(1, 205, 466, 553, class140.field3343, 743, var26, 0);
            } else if (class27.field529[class64.field1281] != -1) {
                class44.method307(1, 205, 466, 553, class27.field529[class64.field1281], 743, var26, 0);
            }
            if (class95.field2288 != -1) {
                class44.method307(2, 357, 453, 17, class95.field2288, 496, var26, 0);
            } else if (class152.field3738 != -1) {
                class44.method307(2, 357, 453, 17, class152.field3738, 496, var26, 0);
            }
        } else {
            class44.method307(3, 0, 503, 0, class135.field3227, 765, var26, 0);
            if (class70.field1482 != -1) {
                class44.method307(3, 0, 503, 0, class70.field1482, 765, var26, 0);
            }
        }
        if (class135.field3227 == -1) {
            if (class96.field2316 != -1) {
                class44.method307(0, 4, 338, 4, class96.field2316, 516, ~var26, 0);
            } else if (class56.field1155 != -1) {
                class44.method307(0, 4, 338, 4, class56.field1155, 516, ~var26, 0);
            }
            if (class140.field3343 != -1) {
                class44.method307(1, 205, 466, 553, class140.field3343, 743, ~var26, 0);
            } else if (class27.field529[class64.field1281] != -1) {
                class44.method307(1, 205, 466, 553, class27.field529[class64.field1281], 743, ~var26, 0);
            }
            if (class95.field2288 != -1) {
                class44.method307(2, 357, 453, 17, class95.field2288, 496, ~var26, 0);
            } else if (class152.field3738 != -1) {
                class44.method307(2, 357, 453, 17, class152.field3738, 496, ~var26, 0);
            }
        } else {
            class44.method307(3, 0, 503, 0, class135.field3227, 765, ~var26, 0);
            if (class70.field1482 != -1) {
                class44.method307(3, 0, 503, 0, class70.field1482, 765, ~var26, 0);
            }
        }
        class15.method130(29247);
        if (class113.field2661 != -1) {
            int var27 = class113.field2661;
            int var28 = class113.field2668;
            boolean var29 = class81.method631(var27, true, 0, (byte) -102, 0, 0, 0, 0, 0, var28, class141.field3395.field2004[0], class141.field3395.field1970[0]);
            class113.field2661 = -1;
            if (var29) {
                class4.field69 = class102.field2462;
                class124.field2922 = class153.field3788;
                class16.field261 = 0;
                class60.field1228 = 1;
            }
        }
        if (class133.field3142 == 1 && class149.field3694 != null) {
            class133.field3142 = 0;
            class149.field3694 = null;
            class87.field1993 = true;
        }
        class122.method975(-86);
        if (class135.field3227 == -1) {
            class97.method766((byte) 23);
            class68.method479(123);
            class55.method406((byte) 115);
        }
        if (class107.field2544 == -1 && class90.field2215 == -1 && class116.field2757 == -1) {
            if (class107.field2548 > 0) {
                class107.field2548--;
            }
        } else if (class5.field87 > class107.field2548) {
            class107.field2548++;
            if (class5.field87 == class107.field2548) {
                if (class107.field2544 != -1) {
                    class87.field1993 = true;
                }
                if (class90.field2215 != -1) {
                    class139.field3310 = true;
                }
            }
        }
        if (class152.field3752 == 1 || class133.field3142 == 1) {
            class122.field2894++;
        }
        class20.method157((byte) -83);
        if (class76.field1676) {
            class70.method494(true);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class68.field1424[var30]++;
        }
        class64.method453((byte) 119);
        int var31 = class85.method682(20131);
        int var32 = class143.method1162(-27);
        if (var31 > 4500 && var32 > 4500) {
            class28.field555++;
            class41.field817 = 250;
            class21.method160(23672, 4000);
            class99.field2373.method961(68, -1198);
        }
        class22.field407++;
        class43.field854++;
        class115.field2721++;
        if (class115.field2721 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x4) == 4) {
                class24.field475 += class139.field3306;
            }
            if ((var33 & 0x1) == 1) {
                class150.field3730 += class140.field3342;
            }
            if ((var33 & 0x2) == 2) {
                class147.field3581 += class68.field1414;
            }
            class115.field2721 = 0;
        }
        if (class43.field854 > 500) {
            int var34 = (int) (Math.random() * 8.0D);
            class43.field854 = 0;
            if ((var34 & 0x2) == 2) {
                class53.field1096 += class104.field2519;
            }
            if ((var34 & 0x1) == 1) {
                class48.field967 += class116.field2760;
            }
        }
        if (class48.field967 < -60) {
            class116.field2760 = 2;
        }
        if (class24.field475 < -40) {
            class139.field3306 = 1;
        }
        if (class150.field3730 < -50) {
            class140.field3342 = 2;
        }
        if (class48.field967 > 60) {
            class116.field2760 = -2;
        }
        if (class24.field475 > 40) {
            class139.field3306 = -1;
        }
        if (class53.field1096 < -20) {
            class104.field2519 = 1;
        }
        if (class147.field3581 < -55) {
            class68.field1414 = 2;
        }
        if (class147.field3581 > 55) {
            class68.field1414 = -2;
        }
        if (class53.field1096 > 10) {
            class104.field2519 = -1;
        }
        if (class150.field3730 > 50) {
            class140.field3342 = -2;
        }
        if (class22.field407 > 50) {
            class148.field3637++;
            class99.field2373.method961(183, -1198);
        }
        try {
            if (class125.field2957 != null && class99.field2373.field1691 > 0) {
                class125.field2957.method736((byte) 42, class99.field2373.field1748, class99.field2373.field1691, 0);
                class99.field2373.field1691 = 0;
                class22.field407 = 0;
            }
        } catch (IOException var35) {
            class64.method448(98);
        }
    }
}
