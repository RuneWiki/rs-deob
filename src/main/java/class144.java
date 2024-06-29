import java.awt.Component;
import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class144 extends class272 {

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    private int field2733 = 0;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    private int field2736 = 16;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    private int field2734 = 0;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    private int field2738 = 2000;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    private int field2742 = 4096;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static volatile int field2732 = 0;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "Lli;")
    private static class185 field2745 = class245.method1649("Examiner", -121);

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Ljava/awt/Frame;")
    public static Frame field2746;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        class256.method1732((byte) -67);
        if (arg0 != 0) {
            field2750 = 91;
        }
        ++field2748;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static final void method1030(int arg0) {
        ++field2737;
        int var1 = class90.field1755;
        int var2 = class199.field3651;
        int var3 = class110.field1977;
        int var4 = class97.field1815;
        if (class123.field2231 == null || class132.field2372 == null) {
            if (class21.field365.method1701(class19.field311, -2) && class21.field365.method1701(class64.field1108, -2)) {
                class123.field2231 = class165.method1178(102, class21.field365, class19.field311, 0);
                class132.field2372 = class165.method1178(102, class21.field365, class64.field1108, 0);
            } else {
                class159.method1145(var1, var2, var3, 20, class215.field3948, -class130.field2325 + 256);
            }
        }
        if (class123.field2231 != null && class132.field2372 != null) {
            int var5 = var3 / class123.field2231.field3854;
            for (int var6 = 0; var5 > var6; ++var6) {
                class123.field2231.method707(class123.field2231.field3854 * var6 + var1, var2);
            }
            class132.field2372.method707(var1, var2);
            class132.field2372.method718(var1 - -var3 + -class132.field2372.field3854, var2);
        }
        class82.field1608.method1850(class157.field2973, var1 + 3, var2 + 14, class187.field3464, -1);
        class159.method1145(var1, var2 + 20, var3, var4 + -20, class215.field3948, -class130.field2325 + 256);
        int var7 = class18.field288;
        int var8 = class32.field528;
        for (int var9 = 0; var9 < class127.field2283; ++var9) {
            int var17 = (class127.field2283 + -1 + -var9) * 15 + var2 + 35;
            if (var1 < var7 && ~var7 > ~(var1 + var3) && ~var8 < ~(var17 + -13) && var8 < var17 + 3) {
                class159.method1145(var1, var17 + -13, var3, 16, class137.field2567, -class137.field2569 + 256);
            }
        }
        if ((class220.field4015 == null || class123.field2232 == null || class50.field824 == null) && class21.field365.method1701(class94.field1787, arg0 ^ -14208) && class21.field365.method1701(class206.field3777, arg0 + -14208) && class21.field365.method1701(class249.field4412, -2)) {
            class220.field4015 = class165.method1178(102, class21.field365, class94.field1787, 0);
            class123.field2232 = class165.method1178(arg0 + -14104, class21.field365, class206.field3777, 0);
            class50.field824 = class165.method1178(arg0 ^ 14104, class21.field365, class249.field4412, 0);
        }
        if (class220.field4015 != null && class123.field2232 != null && class50.field824 != null) {
            int var10 = var3 / class220.field4015.field3854;
            for (int var11 = 0; ~var10 < ~var11; ++var11) {
                class220.field4015.method707(class220.field4015.field3854 * var11 + var1, var2 - (-var4 + class220.field4015.field3853));
            }
            int var12 = (var4 + -20) / class123.field2232.field3853;
            for (int var13 = 0; var13 < var12; ++var13) {
                class123.field2232.method707(var1, class123.field2232.field3853 * var13 + (var2 - -20));
                class123.field2232.method718(var1 + var3 + -class123.field2232.field3854, class123.field2232.field3853 * var13 + var2 + 20);
            }
            class50.field824.method707(var1, var2 + var4 - class50.field824.field3853);
            class50.field824.method718(var1 + var3 - class50.field824.field3854, var2 + var4 + -class50.field824.field3853);
        }
        for (int var14 = 0; ~class127.field2283 < ~var14; ++var14) {
            int var15 = (-var14 + class127.field2283 + -1) * 15 + var2 + 35;
            int var16 = class187.field3464;
            if (~var7 < ~var1 && ~var7 > ~(var1 - -var3) && var15 + -13 < var8 && ~var8 > ~(var15 + 3)) {
                var16 = class195.field3589;
            }
            class82.field1608.method1850(class269.method1824((byte) 124, var14), var1 + 3, var15, var16, 0);
        }
        if (arg0 != 14206) {
            method1034(-101, -29, 121, 47, (class75) null, -18L, false);
        }
        class274.method1878(class97.field1815, class199.field3651, arg0 + -14206, class90.field1755, class110.field1977);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
        if (super.field4819.field4294) {
            int var4 = this.field2742 >> 1;
            int[][] var5 = super.field4819.method1627(arg1 ^ 32548);
            Random var6 = new Random((long) this.field2734);
            for (int var7 = 0; ~this.field2738 < ~var7; ++var7) {
                int var8 = ~this.field2742 >= -1 ? this.field2733 : this.field2733 - (-class255.method1729(var6, 3, this.field2742) - -var4);
                int var9 = class255.method1729(var6, 3, class246.field4385);
                int var10 = class255.method1729(var6, 3, class13.field235);
                int var11 = 255 & var8 >> 4;
                int var12 = (class13.field234[var11] * this.field2736 >> 12) + var10;
                int var13 = (class96.field1804[var11] * this.field2736 >> 12) + var9;
                int var14 = -var9 + var13;
                int var15 = var12 - var10;
                if (var14 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var13;
                        int var18 = var9;
                        var9 = var10;
                        var13 = var12;
                        var12 = var17;
                        var10 = var18;
                    }
                    if (var13 < var9) {
                        int var19 = var9;
                        var9 = var13;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                        var13 = var19;
                    }
                    int var21 = var13 - var9;
                    int var22 = var10;
                    int var23 = -var21 / 2;
                    int var24 = 2048 / var21;
                    int var25 = 1024 - (class255.method1729(var6, 3, 4096) >> 2);
                    int var26 = ~var12 < ~var10 ? 1 : -1;
                    int var27 = -var10 + var12;
                    if (var27 < 0) {
                        var27 = -var27;
                    }
                    for (int var28 = var9; var28 < var13; ++var28) {
                        var23 += var27;
                        int var29 = class59.field1037 & var28;
                        int var30 = var25 + 1024 - -((-var9 + var28) * var24);
                        int var31 = var22 & class99.field1826;
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                        if (var23 > 0) {
                            var23 += -var21;
                            var22 += var26;
                        }
                    }
                }
            }
        }
        if (arg1 != 4421) {
            method1032(-67, (Component) null);
        }
        ++field2739;
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
    public static void method1031(int arg0) {
        if (arg0 >= 0) {
            method1032(7, (Component) null);
        }
        field2746 = null;
        field2745 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field2742 = arg0.method827(255);
                        }
                    } else {
                        this.field2733 = arg0.method827(255);
                    }
                } else {
                    this.field2736 = arg0.method867(false);
                }
            } else {
                this.field2738 = arg0.method827(255);
            }
        } else {
            this.field2734 = arg0.method867(false);
        }
        ++field2741;
        int var5 = -96 % ((-21 - arg1) / 55);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1032(int arg0, Component arg1) {
        arg1.addMouseListener(class27.field460);
        if (arg0 == 64) {
            arg1.addMouseMotionListener(class27.field460);
            ++field2735;
            arg1.addFocusListener(class27.field460);
        }
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
    public static final void method1033(int arg0) {
        class185.field3408.method80(-14113);
        if (arg0 != 0) {
            field2746 = null;
        }
        ++field2749;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIILbb;JZ)V")
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, class75 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class251 var8 = new class251();
            var8.field4467 = arg4;
            var8.field4474 = arg1 * 128 + 64;
            var8.field4469 = arg2 * 128 + 64;
            var8.field4473 = arg3;
            var8.field4466 = arg5;
            if (class153.field2896[arg0][arg1][arg2] == null) {
                class153.field2896[arg0][arg1][arg2] = new class198(arg0, arg1, arg2);
            }
            class153.field2896[arg0][arg1][arg2].field3631 = var8;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([B[Lwf;ZZII)V")
    public static final void method1035(byte[] arg0, class47[] arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        ++field2743;
        class118 var6 = new class118(arg0);
        int var7 = -1;
        if (arg3) {
            method1034(-121, 87, -12, -16, (class75) null, 81L, false);
        }
        while (true) {
            int var8 = var6.method823((byte) 94);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method836((byte) 117);
                if (~var10 == -1) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = (var9 & 4089) >> 6;
                int var12 = var9 & 63;
                int var13 = var9 >> 12;
                int var14 = var6.method867(arg3);
                int var15 = var14 >> 2;
                int var16 = var14 & 3;
                int var17 = arg4 + var11;
                int var18 = arg5 + var12;
                if (~var17 < -1 && ~var18 < -1 && var17 < 103 && var18 < 103) {
                    class47 var19 = null;
                    if (!arg2) {
                        int var20 = var13;
                        if (~(class239.field4262[1][var17][var18] & 2) == -3) {
                            var20 = var13 - 1;
                        }
                        if (~var20 <= -1) {
                            var19 = arg1[var20];
                        }
                    }
                    class254.method1720(var13, var17, arg2, (byte) 17, var13, var7, !arg2, var16, var15, var19, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static final void method1036(byte arg0) {
        class256.field4535 = class188.field3510;
        class32.field523 = class65.field1137;
        class149.field2827 = class109.field1973;
        class123.field2229 = class94.field1796;
        class267.field4733 = class255.field4513;
        class175.field3208 = class252.field4477;
        class150.field2845 = class15.field250;
        class56.field970 = class184.field3388;
        class106.field1920 = class43.field667;
        class268.field4749 = class271.field4808;
        class69.field1217 = class24.field410;
        class262.field4651 = class176.field3212;
        class6.field141 = class260.field4625;
        class116.field2066 = class107.field1928;
        class20.field326 = class237.field4234;
        class235.field4212 = class129.field2302;
        class33.field546 = class113.field2051;
        class166.field3099 = class233.field4183;
        class103.field1864 = class200.field3664;
        class52.field902 = class18.field297;
        class224.field4105 = class232.field4171;
        class65.field1134 = class204.field3739;
        class242.field4331 = class182.field3351;
        class65.field1125 = class99.field1830;
        class224.field4107 = class274.field4851;
        class37.field585 = class65.field1129;
        class25.field425 = class124.field2236;
        class268.field4746 = class257.field4571;
        class27.field459 = class151.field2857;
        class205.field3764 = class54.field934;
        class118.field2165 = class55.field943;
        class78.field1354 = class207.field3801;
        class211.field3845 = class116.field2074;
        class116.field2063 = class85.field1681;
        class107.field1924 = class263.field4670;
        class145.field2753 = class154.field2929;
        class243.field4341 = class22.field371;
        class22.field369 = class142.field2726;
        class33.field549 = class128.field2299;
        class216.field3965 = class39.field620;
        class205.field3755 = class22.field375;
        class117.field2090 = class156.field2951;
        class128.field2287 = class121.field2212;
        ++field2744;
        class133.field2377 = class200.field3670;
        class135.field2534 = class263.field4667;
        class206.field3779 = field2745;
        class226.field4134 = class147.field2783;
        class228.field4146 = class75.field1296;
        class6.field140 = class260.field4625;
        class262.field4649 = class40.field627;
        class278.field4942 = class250.field4433;
        class179.field3293 = class217.field3974;
        class262.field4658 = class274.field4858;
        class46.field733 = class26.field450;
        class120.field2184 = class166.field3095;
        class3.field63 = class136.field2551;
        class153.field2897 = class280.field4957;
        class142.field2728 = class71.field1245;
        class7.field148 = class255.field4516;
        class3.field61 = class276.field4886;
        class12.field217 = class215.field3950;
        class234.field4205 = class123.field2224;
        class181.field3330 = class280.field4962;
        class77.field1340 = class154.field2922;
        class38.field605 = class138.field2575;
        class59.field1071 = class30.field493;
        class205.field3765 = class54.field934;
        class157.field2973 = class125.field2249;
        class19.field309 = class46.field737;
        class69.field1213 = class70.field1227;
        class210.field3838 = class13.field229;
        class40.field632 = class129.field2304;
        class200.field3667 = class18.field287;
        class119.field2170 = class45.field718;
        class201.field3691 = class178.field3271;
        if (arg0 != -33) {
            field2747 = 24;
        }
        class195.field3583 = class25.field426;
        class243.field4351 = class226.field4132;
        class136.field2558 = class181.field3323;
        class87.field1706 = class199.field3663;
        class30.field492 = class185.field3417;
        class223.field4087 = class236.field4231;
        class14.field239 = class118.field2166;
        class108.field1952 = class118.field2164;
        class113.field2034 = class175.field3207;
        class248.field4401 = class109.field1969;
        class278.field4946 = class250.field4433;
        class145.field2752 = class240.field4288;
        class257.field4583 = class204.field3727;
        class54.field928 = class103.field1862;
        class183.field3368 = class242.field4326;
    }
}
