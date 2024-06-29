import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class118 extends class545 {

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    public static int field1613 = -1;

    @OriginalMember(owner = "client!qda", name = "y", descriptor = "Lgr;")
    public static class530 field1621 = new class530(70, 3);

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!qda", name = "B", descriptor = "Lcga;")
    public static class141 field1624 = new class141();

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILec;)V", line = 4)
    public final void method455(int arg0, int arg1, class101 arg2) {
        super.field7920.method264(arg2, -2);
        ++field1619;
        if (arg0 == 2) {
            super.field7920.method411(arg0 + 17022, arg1);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BZ)V", line = 17)
    public final void method457(byte arg0, boolean arg1) {
        ++field1616;
        super.field7920.method200((byte) 110, true);
        if (arg0 < 101) {
            method832((byte) 84);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V", line = 29)
    public static final void method831(int arg0, byte arg1) {
        ++field1622;
        class503 var2 = class512.method3112(12, arg0, arg1 ^ -110);
        var2.method3074(-90);
        if (arg1 != -110) {
            field1621 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lch;)V", line = 45)
    public class118(class38 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 48)
    public static void method832(byte arg0) {
        field1621 = null;
        field1624 = null;
        int var1 = 77 % ((25 - arg0) / 46);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V", line = 59)
    public final void method451(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field1613 = 28;
        }
        ++field1620;
    }

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "(I)V", line = 70)
    public static final void method833(int arg0) {
        ++field1615;
        class254.method1701((byte) -127, false);
        class11.field108 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class429.field6176.length; ++var2) {
            if (~class269.field3822[var2] != 0 && class429.field6176[var2] == null) {
                class429.field6176[var2] = class275.field3876.method2600(arg0 + -10, class269.field3822[var2], 0);
                if (class429.field6176[var2] == null) {
                    ++class11.field108;
                    var1 = false;
                }
            }
            if (~class629.field8917[var2] != 0 && class667.field9528[var2] == null) {
                class667.field9528[var2] = class275.field3876.method2618(0, true, class629.field8917[var2], class491.field7065[var2]);
                if (class667.field9528[var2] == null) {
                    ++class11.field108;
                    var1 = false;
                }
            }
            if (~class236.field3543[var2] != 0 && class397.field5685[var2] == null) {
                class397.field5685[var2] = class275.field3876.method2600(0, class236.field3543[var2], 0);
                if (class397.field5685[var2] == null) {
                    ++class11.field108;
                    var1 = false;
                }
            }
            if (class672.field9577[var2] != -1 && class645.field9289[var2] == null) {
                class645.field9289[var2] = class275.field3876.method2600(class639.method3689(arg0, 10), class672.field9577[var2], 0);
                if (class645.field9289[var2] == null) {
                    ++class11.field108;
                    var1 = false;
                }
            }
            if (class132.field1823 != null && class658.field9419[var2] == null && class132.field1823[var2] != -1) {
                class658.field9419[var2] = class275.field3876.method2618(0, true, class132.field1823[var2], class491.field7065[var2]);
                if (class658.field9419[var2] == null) {
                    ++class11.field108;
                    var1 = false;
                }
            }
        }
        if (class506.field7353 == null) {
            if (client.field6413 != null && class585.field8351.method2605(-2, client.field6413.field9740 + "_staticelements")) {
                if (!class585.field8351.method2604(client.field6413.field9740 + "_staticelements", -41)) {
                    var1 = false;
                    ++class11.field108;
                } else {
                    class506.field7353 = class108.method797(-79, class502.field7304, class585.field8351, client.field6413.field9740 + "_staticelements");
                }
            } else {
                class506.field7353 = new class494(0);
            }
        }
        if (!var1) {
            class127.field1757 = 1;
        } else {
            class488.field7033 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~var4 > ~class429.field6176.length; ++var4) {
                byte[] var21 = class667.field9528[var4];
                if (var21 != null) {
                    int var22 = (class284.field3961[var4] >> 8) * 64 + -class41.field693;
                    int var23 = (255 & class284.field3961[var4]) * 64 + -class71.field1085;
                    if (~class445.field6361 != -1) {
                        var23 = 10;
                        var22 = 10;
                    }
                    var3 &= class424.method2631(var23, class240.field3555, class184.field2546, 36, var21, var22);
                }
                byte[] var24 = class645.field9289[var4];
                if (var24 != null) {
                    int var25 = (class284.field3961[var4] >> 8) * 64 + -class41.field693;
                    int var26 = (class284.field3961[var4] & 255) * 64 + -class71.field1085;
                    if (class445.field6361 != 0) {
                        var25 = 10;
                        var26 = 10;
                    }
                    var3 &= class424.method2631(var26, class240.field3555, class184.field2546, arg0 ^ 46, var24, var25);
                }
            }
            if (!var3) {
                class127.field1757 = 2;
            } else {
                if (~class127.field1757 != -1) {
                    class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, true, class608.field8632.method3543(arg0 ^ -24344, class45.field748) + "<br>(100%)");
                }
                class569.method3387(0);
                class648.method3743(12245);
                class76.method637(68);
                boolean var5 = false;
                if (class211.field3164.method296() && class243.field3580.field8001.method3761(false) == 2) {
                    for (int var6 = 0; var6 < class429.field6176.length; ++var6) {
                        if (class645.field9289[var6] != null || class397.field5685[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (~class243.field3580.field8005.method4058(false) != -2) {
                    var7 = class561.field8137[class132.field1827];
                } else {
                    var7 = class293.field4027[class132.field1827];
                }
                if (class211.field3164.method412()) {
                    ++var7;
                }
                class338.method2081(class211.field3164, class598.field8503, 9, 4, class184.field2546, class240.field3555, var7, var5, ~class211.field3164.method270() < -1);
                class577.method3421(class612.field8753);
                if (~class612.field8753 != -1) {
                    class554.method3325(class564.field8163);
                } else {
                    class554.method3325((class400) null);
                }
                for (int var8 = 0; var8 < 4; ++var8) {
                    class6.field57[var8].method3650((byte) -39);
                }
                class13.method68(0);
                class53.method480((byte) 89, false);
                class388.method2380(true);
                class728.field10226 = null;
                class315.field4262 = false;
                class569.method3387(0);
                System.gc();
                class254.method1701((byte) -127, true);
                class152.method1104((byte) 118);
                class80.field1150 = class243.field3580.field8007.method435(false);
                class487.field7024 = ~class597.field8492 <= -97;
                class584.field8329 = ~class243.field3580.field8001.method3761(false) == -3;
                class609.field8694 = class243.field3580.field7991.method3589(false) == 1;
                class721.field10154 = ~class243.field3580.field8002.method2026(false) == -2 ? -1 : class717.field10118;
                class48.field798 = ~class243.field3580.field7972.method1587(false) == -2;
                class718.field10124 = ~class243.field3580.field8008.method4186(false) == -2;
                class631.field8928 = new class418(4, class184.field2546, class240.field3555, false);
                if (~class445.field6361 != -1) {
                    class418.method2543(class429.field6176, 0, class631.field8928);
                } else {
                    class491.method2989(class631.field8928, (byte) 117, class429.field6176);
                }
                class582.method3427(arg0 + 64, class240.field3555 >> 4, class184.field2546 >> 4);
                class32.method168(-4897);
                if (var5) {
                    class496.method3016(true);
                    class357.field5269 = new class418(1, class184.field2546, class240.field3555, true);
                    if (~class445.field6361 == -1) {
                        class491.method2989(class357.field5269, (byte) 117, class397.field5685);
                        class254.method1701((byte) -127, true);
                    } else {
                        class418.method2543(class397.field5685, 0, class357.field5269);
                        class254.method1701((byte) -128, true);
                    }
                    class357.field5269.method3045(class631.field8928.field7265[0], 1532, 0);
                    class357.field5269.method3053(arg0 ^ 10, class211.field3164, (class635[]) null, (int[][][]) null);
                    class496.method3016(false);
                }
                class631.field8928.method3053(arg0 ^ arg0, class211.field3164, class6.field57, !var5 ? null : class357.field5269.field7265);
                if (~class445.field6361 == -1) {
                    class254.method1701((byte) -128, true);
                    class360.method2273(class631.field8928, class667.field9528, 255);
                    if (class658.field9419 != null) {
                        class748.method4173(45134022);
                    }
                } else {
                    class254.method1701((byte) -127, true);
                    class31.method152(class667.field9528, class631.field8928, (byte) 85);
                }
                class648.method3743(12245);
                if (class597.field8492 < 96) {
                    class378.method2347(true);
                }
                class254.method1701((byte) -128, true);
                class631.field8928.method3042(var5 ? class25.field221[0] : null, class211.field3164, -1, (class339) null);
                class631.field8928.method2542(class211.field3164, (byte) 114, false);
                class254.method1701((byte) -127, true);
                if (var5) {
                    class496.method3016(true);
                    class254.method1701((byte) -127, true);
                    if (class445.field6361 != 0) {
                        class31.method152(class645.field9289, class357.field5269, (byte) 115);
                    } else {
                        class360.method2273(class357.field5269, class645.field9289, 255);
                    }
                    class648.method3743(arg0 ^ 12255);
                    class254.method1701((byte) -127, true);
                    class357.field5269.method3042((class339) null, class211.field3164, arg0 ^ -11, class491.field7079[0]);
                    class357.field5269.method2542(class211.field3164, (byte) 90, true);
                    class254.method1701((byte) -128, true);
                    class496.method3016(false);
                }
                class555.method3334(100);
                int var9 = class631.field8928.field5981;
                if (var9 > class687.field9758) {
                    var9 = class687.field9758;
                }
                if (~var9 > ~(class687.field9758 - 1)) {
                    var9 = class687.field9758 - 1;
                }
                if (~class243.field3580.field8002.method2026(false) != -1) {
                    class709.method3966(0);
                } else {
                    class709.method3966(var9);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var19 = 0; ~class184.field2546 < ~var19; ++var19) {
                        for (int var20 = 0; var20 < class240.field3555; ++var20) {
                            class623.method3600((byte) -113, var20, var10, var19);
                        }
                    }
                }
                class726.method4054(1);
                class569.method3387(0);
                class301.method1888(4096);
                class648.method3743(12245);
                class67.method592(0);
                if (class696.field9834 != null && class325.field4415 != null && class369.field5392 == 11) {
                    ++class575.field8271;
                    class88 var11 = class448.method2741((byte) 37, class629.field8909, class583.field8319);
                    var11.field1260.method2926((byte) -122, 1057001181);
                    class523.method3183(var11, (byte) 31);
                }
                if (~class445.field6361 == -1) {
                    int var12 = (-(class184.field2546 >> 4) + class401.field5750) / 8;
                    int var13 = (class401.field5750 - -(class184.field2546 >> 4)) / 8;
                    int var14 = (-(class240.field3555 >> 4) + class109.field1560) / 8;
                    int var15 = ((class240.field3555 >> 4) + class109.field1560) / 8;
                    for (int var16 = var12 - 1; ~var16 >= ~(var13 + 1); ++var16) {
                        for (int var17 = var14 + -1; var17 <= var15 - -1; ++var17) {
                            if (var16 < var12 || var16 > var13 || var17 < var14 || ~var15 > ~var17) {
                                class275.field3876.method2607((byte) 127, "m" + var16 + "_" + var17);
                                class275.field3876.method2607((byte) 77, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (class369.field5392 != 4) {
                    if (~class369.field5392 == -9) {
                        class79.method649(-19704, 7);
                    } else {
                        class79.method649(arg0 ^ -19710, 10);
                        if (class325.field4415 != null) {
                            class88 var18 = class448.method2741((byte) 79, class176.field2463, class583.field8319);
                            class523.method3183(var18, (byte) 31);
                        }
                    }
                } else {
                    class79.method649(arg0 + -19714, 3);
                }
                class387.method2379(-128);
                class569.method3387(0);
                class486.method2966((byte) 75);
                class235.field3518 = true;
                if (class42.field709) {
                    class646.method3726("Took: " + (class465.method2818(255) - class314.field4254) + "ms", -96);
                    class42.field709 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)Z", line = 550)
    public final boolean method459(int arg0) {
        if (arg0 < 63) {
            method832((byte) 75);
        }
        ++field1614;
        return true;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 562)
    public final void method452(int arg0) {
        ++field1618;
        super.field7920.method200((byte) 125, false);
        if (arg0 != 2) {
            field1624 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZZ)V", line = 574)
    public final void method454(boolean arg0, boolean arg1) {
        ++field1617;
        if (arg1) {
            this.method451(-46, 99, 101);
        }
    }
}
