import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class131 extends class30 {

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "Z")
    private boolean field2052 = true;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Z")
    private boolean field2055 = true;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field2049;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (arg0 != -93) {
            method964((byte) 119);
        }
        if (super.field360.field6566) {
            int[][] var4 = this.method206(this.field2055 ? -arg1 + class246.field4033 : arg1, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2052) {
                for (int var11 = 0; class369.field5610 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class369.field5610 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class106.field1492];
                    var9[var12] = var6[-var12 + class106.field1492];
                    var10[var12] = var7[-var12 + class106.field1492];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
    public static final void method961(byte arg0) {
        ++field2054;
        class439.method2703();
        if (arg0 >= -30) {
            method963();
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)V")
    public static final void method962(byte arg0) {
        ++field2053;
        class183.method1254(class284.field4547, (long) class183.field2987, true);
        if (~class306.field4847 != 0) {
            class11.method108(class306.field4847, (byte) -87);
        }
        for (int var1 = 0; ~class125.field1929 < ~var1; ++var1) {
            if (class267.field4296[var1]) {
                class239.field3976[var1] = true;
            }
            class27.field310[var1] = class267.field4296[var1];
            class267.field4296[var1] = false;
        }
        class291.field4642 = class183.field2987;
        if (class284.field4547.method711()) {
            class281.field4511 = true;
        }
        class369.field5614 = null;
        if (~class306.field4847 != 0) {
            class125.field1929 = 0;
            class41.method274((byte) 6);
        }
        class284.field4547.method609();
        class67.method425(4, class216.field3506);
        if (arg0 <= 109) {
            method962((byte) -109);
        }
        class62.field807 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
    public static final void method963() {
        for (int var0 = 0; var0 < class422.field6233; ++var0) {
            class57 var1 = class429.field6320[var0];
            class298.method2008(var1);
            class429.field6320[var0] = null;
        }
        class422.field6233 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            this.method116(-67, (byte) 87);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field376 = ~arg0.method1322(false) == -2;
                }
            } else {
                this.field2055 = arg0.method1322(false) == 1;
            }
        } else {
            this.field2052 = arg0.method1322(false) == 1;
        }
        ++field2056;
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(B)V")
    public static final void method964(byte arg0) {
        ++field2050;
        if (~class85.field1050 < -2) {
            --class85.field1050;
            class378.field5705 = class223.field3724;
        }
        if (~class407.field6044 < -1) {
            --class407.field6044;
        }
        if (class19.field242) {
            class19.field242 = false;
            class342.method2248(-1);
        } else {
            if (!class262.field4214) {
                class73.method471((byte) 87);
            }
            for (int var1 = 0; var1 < 100 && class353.method2303(false); ++var1) {
            }
            if (~class262.field4219 == -31) {
                class221.method1581(4, 244, class11.field139);
                Object var2 = class182.field2981.field570;
                synchronized (class182.field2981.field570) {
                    if (!class104.field1467) {
                        class182.field2981.field573 = 0;
                    } else if (~class402.field6005 != -1 || ~class182.field2981.field573 <= -41) {
                        ++class105.field1474;
                        class11.field139.method2224(38, (byte) 0);
                        class11.field139.method1312(0, -47);
                        int var3 = class11.field139.field3044;
                        int var4 = 0;
                        for (int var5 = 0; var5 < class182.field2981.field573 && ~(-var3 + class11.field139.field3044) > -241; ++var5) {
                            ++var4;
                            int var6 = class182.field2981.field574[var5];
                            if (~var6 <= -1) {
                                if (~var6 < -65535) {
                                    var6 = 65534;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class182.field2981.field575[var5];
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (~var7 < -65535) {
                                var7 = 65534;
                            }
                            boolean var8 = false;
                            if (class182.field2981.field574[var5] == -1 && ~class182.field2981.field575[var5] == 0) {
                                var6 = -1;
                                var7 = -1;
                                var8 = true;
                            }
                            if (~class286.field4593 == ~var7 && ~class213.field3416 == ~var6) {
                                if (~class67.field845 > -2048) {
                                    ++class67.field845;
                                }
                            } else {
                                int var9 = var7 - class286.field4593;
                                class286.field4593 = var7;
                                int var10 = -class213.field3416 + var6;
                                class213.field3416 = var6;
                                if (class67.field845 < 8 && ~var9 <= 31 && var9 <= 31 && ~var10 <= 31 && ~var10 >= -32) {
                                    var9 += 32;
                                    var10 += 32;
                                    class11.field139.method1283(8, (class67.field845 << 12) + (var9 << 6) + var10);
                                    class67.field845 = 0;
                                } else if (~class67.field845 > -33 && ~var9 <= 127 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                                    var9 += 128;
                                    var10 += 128;
                                    class11.field139.method1312(class67.field845 + 128, -80);
                                    class11.field139.method1283(8, (var9 << 8) - -var10);
                                    class67.field845 = 0;
                                } else if (class67.field845 < 32) {
                                    class11.field139.method1312(192 - -class67.field845, -59);
                                    if (!var8) {
                                        class11.field139.method1315(var6 << 16 | var7, (byte) 61);
                                    } else {
                                        class11.field139.method1315(Integer.MIN_VALUE, (byte) 73);
                                    }
                                    class67.field845 = 0;
                                } else {
                                    class11.field139.method1283(8, 57344 - -class67.field845);
                                    if (var8) {
                                        class11.field139.method1315(Integer.MIN_VALUE, (byte) 110);
                                    } else {
                                        class11.field139.method1315(var7 | var6 << 16, (byte) 100);
                                    }
                                    class67.field845 = 0;
                                }
                            }
                        }
                        class11.field139.method1297(-var3 + class11.field139.field3044, -1);
                        if (~var4 <= ~class182.field2981.field573) {
                            class182.field2981.field573 = 0;
                        } else {
                            class182.field2981.field573 -= var4;
                            for (int var11 = 0; class182.field2981.field573 > var11; ++var11) {
                                class182.field2981.field575[var11] = class182.field2981.field575[var11 - -var4];
                                class182.field2981.field574[var11] = class182.field2981.field574[var11 - -var4];
                            }
                        }
                    }
                }
                if (~class402.field6005 != -1) {
                    long var12 = (-class132.field2057 + class452.field6586) / 50L;
                    if (~var12 < -32768L) {
                        var12 = 32767L;
                    }
                    class132.field2057 = class452.field6586;
                    int var14 = class214.field3480;
                    if (~var14 <= -1) {
                        if (~var14 < -65536) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = class56.field692;
                    if (~var15 <= -1) {
                        if (~var15 < -65536) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (~class402.field6005 == -3) {
                        var16 = 1;
                    }
                    class11.field139.method2224(210, (byte) 0);
                    int var17 = (int) var12;
                    ++class183.field2990;
                    class11.field139.method1298(var16 << 15 | var17, -107);
                    class11.field139.method1315(var15 | var14 << 16, (byte) 70);
                }
                if (~class203.field3268 < -1) {
                    --class203.field3268;
                }
                if (class324.field5089 && class203.field3268 <= 0) {
                    class324.field5089 = false;
                    ++class257.field4171;
                    class203.field3268 = 20;
                    class11.field139.method2224(177, (byte) 0);
                    class11.field139.method1283(arg0 ^ -104, (int) class316.field4958 >> 3);
                    class11.field139.method1298((int) class329.field5153 >> 3, -69);
                }
                if (class348.field5345 && !class150.field2336) {
                    class150.field2336 = true;
                    ++class336.field5226;
                    class11.field139.method2224(111, (byte) 0);
                    class11.field139.method1312(1, -84);
                }
                if (!class348.field5345 && class150.field2336) {
                    class150.field2336 = false;
                    ++class336.field5226;
                    class11.field139.method2224(111, (byte) 0);
                    class11.field139.method1312(0, -68);
                }
                if (!class444.field6477) {
                    ++class288.field4611;
                    class11.field139.method2224(110, (byte) 0);
                    class11.field139.method1311(arg0 ^ -84, class11.method104((byte) 98));
                    class444.field6477 = true;
                }
                if (class423.field6252 != null) {
                    if (class13.field194 == 2) {
                        class258.method1786((byte) -36);
                    } else if (class13.field194 == 3) {
                        class351.method2294(-1451675060);
                    }
                }
                if (!class138.field2149) {
                    class137.field2144 /= 2.0F;
                } else {
                    class138.field2149 = false;
                }
                if (class189.field3097) {
                    class189.field3097 = false;
                } else {
                    class424.field6260 /= 2.0F;
                }
                class281.method1918(40);
                if (~class262.field4219 == -31) {
                    class235.method1667((byte) 58);
                    class374.method2384(52);
                    class349.method2284(false);
                    ++class140.field2165;
                    if (class140.field2165 > 750) {
                        class342.method2248(-1);
                    } else {
                        class186.method1321(0);
                        class374.method2385(true);
                        class63.method411(75);
                        for (int var18 = class218.method1559((byte) -97, true); var18 != -1; var18 = class218.method1559((byte) -32, false)) {
                            class435.method2680(var18, (byte) -2);
                            class135.field2115[class37.method242(class91.field1128++, 31)] = var18;
                        }
                        for (class211 var19 = class238.method1682((byte) 44); var19 != null; var19 = class238.method1682((byte) 44)) {
                            int var20 = var19.method1484((byte) -7);
                            int var21 = var19.method1488((byte) 126);
                            if (var20 == 1) {
                                class158.field2520[var21] = var19.field3379;
                                class52.field636 |= class338.field5250[var21];
                                class302.field4781[class37.method242(class422.field6241++, 31)] = var21;
                            } else if (var20 != 2) {
                                if (var20 == 3) {
                                    class172 var22 = class196.method1375(var21, (byte) -56);
                                    if (!var19.field3374.equals(var22.field2851)) {
                                        var22.field2851 = var19.field3374;
                                        class336.method2219((byte) 6, var22);
                                    }
                                } else if (var20 == 4) {
                                    class172 var23 = class196.method1375(var21, (byte) -56);
                                    int var24 = var19.field3379;
                                    int var25 = var19.field3383;
                                    int var26 = var19.field3376;
                                    if (var23.field2779 != var24 || var23.field2794 != var25 || ~var23.field2843 != ~var26) {
                                        var23.field2794 = var25;
                                        var23.field2843 = var26;
                                        var23.field2779 = var24;
                                        class336.method2219((byte) 6, var23);
                                    }
                                } else if (var20 != 5) {
                                    if (var20 == 6) {
                                        int var27 = var19.field3379;
                                        int var28 = (32629 & var27) >> 10;
                                        int var29 = (1007 & var27) >> 5;
                                        int var30 = 31 & var27;
                                        int var31 = (var28 << 19) - -(var29 << 11) - -(var30 << 3);
                                        class172 var32 = class196.method1375(var21, (byte) -56);
                                        if (var32.field2772 != var31) {
                                            var32.field2772 = var31;
                                            class336.method2219((byte) 6, var32);
                                        }
                                    } else if (var20 != 7) {
                                        if (var20 != 8) {
                                            if (var20 != 9) {
                                                if (var20 == 10) {
                                                    class172 var33 = class196.method1375(var21, (byte) -56);
                                                    if (~var19.field3379 != ~var33.field2792 || ~var19.field3383 != ~var33.field2790 || ~var19.field3376 != ~var33.field2725) {
                                                        var33.field2725 = var19.field3376;
                                                        var33.field2792 = var19.field3379;
                                                        var33.field2790 = var19.field3383;
                                                        class336.method2219((byte) 6, var33);
                                                    }
                                                } else if (var20 != 11) {
                                                    if (~var20 == -13) {
                                                        class172 var34 = class196.method1375(var21, (byte) -56);
                                                        int var35 = var19.field3379;
                                                        if (var34 != null && ~var34.field2707 == -1) {
                                                            if (var34.field2830 - var34.field2834 < var35) {
                                                                var35 = -var34.field2834 + var34.field2830;
                                                            }
                                                            if (~var35 > -1) {
                                                                var35 = 0;
                                                            }
                                                            if (~var34.field2696 != ~var35) {
                                                                var34.field2696 = var35;
                                                                class336.method2219((byte) 6, var34);
                                                            }
                                                        }
                                                    } else if (~var20 == -14) {
                                                        class172 var36 = class196.method1375(var21, (byte) -56);
                                                        var36.field2730 = var19.field3379;
                                                    } else if (~var20 == -15) {
                                                        class172 var37 = class196.method1375(var21, (byte) -56);
                                                        var37.field2789 = var19.field3379;
                                                    } else if (var20 == 15) {
                                                        class19.field254 = var19.field3379;
                                                        class132.field2062 = var19.field3383;
                                                        class357.field5460 = true;
                                                    }
                                                } else {
                                                    class172 var38 = class196.method1375(var21, (byte) -56);
                                                    var38.field2835 = 0;
                                                    var38.field2766 = var38.field2739 = var19.field3379;
                                                    var38.field2726 = var38.field2828 = var19.field3383;
                                                    var38.field2824 = 0;
                                                    class336.method2219((byte) 6, var38);
                                                }
                                            } else {
                                                class172 var39 = class196.method1375(var21, (byte) -56);
                                                if (var19.field3379 != var39.field2691 || var19.field3383 != var39.field2848) {
                                                    var39.field2848 = var19.field3383;
                                                    var39.field2691 = var19.field3379;
                                                    class336.method2219((byte) 6, var39);
                                                }
                                            }
                                        } else {
                                            class172 var40 = class196.method1375(var21, (byte) -56);
                                            if (~var19.field3379 != ~var40.field2771 || ~var19.field3383 != ~var40.field2818 || var19.field3376 != var40.field2860) {
                                                var40.field2860 = var19.field3376;
                                                var40.field2818 = var19.field3383;
                                                var40.field2771 = var19.field3379;
                                                if (~var40.field2691 != 0) {
                                                    if (~var40.field2785 >= -1) {
                                                        if (~var40.field2692 < -1) {
                                                            var40.field2860 = var40.field2860 * 32 / var40.field2692;
                                                        }
                                                    } else {
                                                        var40.field2860 = var40.field2860 * 32 / var40.field2785;
                                                    }
                                                }
                                                class336.method2219((byte) 6, var40);
                                            }
                                        }
                                    } else {
                                        class172 var41 = class196.method1375(var21, (byte) -56);
                                        boolean var42 = var19.field3379 == 1;
                                        if (!var42 == var41.field2809) {
                                            var41.field2809 = var42;
                                            class336.method2219((byte) 6, var41);
                                        }
                                    }
                                } else {
                                    class172 var43 = class196.method1375(var21, (byte) -56);
                                    if (~var19.field3379 != ~var43.field2840 || ~var19.field3379 == 0) {
                                        var43.field2839 = 0;
                                        var43.field2754 = 0;
                                        var43.field2738 = 1;
                                        var43.field2840 = var19.field3379;
                                        class336.method2219((byte) 6, var43);
                                    }
                                }
                            } else {
                                class186.field3054[var21] = var19.field3374;
                                class163.field2557[class37.method242(class331.field5179++, 31)] = var21;
                            }
                        }
                        ++class62.field807;
                        if (class345.field5328 != 0) {
                            class256.field4142 += 20;
                            if (class256.field4142 >= 400) {
                                class345.field5328 = 0;
                            }
                        }
                        if (class324.field5075 != null) {
                            ++class269.field4323;
                            if (~class269.field4323 <= -16) {
                                class336.method2219((byte) 6, class324.field5075);
                                class324.field5075 = null;
                            }
                        }
                        class172 var44 = class391.field5872;
                        class391.field5872 = null;
                        class172 var45 = class318.field4983;
                        class234.field3911 = null;
                        class29.field342 = false;
                        class318.field4983 = null;
                        class269.field4316 = 0;
                        class301.field4770 = false;
                        while (class426.method2639(20) && ~class269.field4316 > -129) {
                            if (!class211.method1483((byte) -42) || ~class140.field2180 != -97 && ~class140.field2180 != -168) {
                                class271.field4342[class269.field4316] = class444.field6479;
                                class291.field4651[class269.field4316] = class140.field2180;
                                ++class269.field4316;
                            } else if (!class409.method2569(6324)) {
                                class291.method1956((byte) 81);
                            } else {
                                class61.method397(arg0 + -14853);
                            }
                        }
                        if (class409.method2569(6324)) {
                            class375.method2391((byte) -63);
                        }
                        class30.field367 = null;
                        class405.method2540(-1, -1, (class172) null, -1);
                        class421.method2620(-122, (class172) null, -1, -1);
                        class298.method2007(-1265899832);
                        ++class223.field3724;
                        if (class143.field2259) {
                            ++class351.field5422;
                            class11.field139.method2224(230, (byte) 0);
                            class11.field139.method1315(class171.field2685 | class397.field5936 << 28 | class422.field6227 << 14, (byte) 36);
                            class143.field2259 = false;
                        }
                        while (true) {
                            class150 var46;
                            class172 var47;
                            class172 var48;
                            do {
                                var46 = (class150) class151.field2360.method248(-24951);
                                if (var46 == null) {
                                    while (true) {
                                        class150 var49;
                                        class172 var50;
                                        class172 var51;
                                        do {
                                            var49 = (class150) class407.field6041.method248(-24951);
                                            if (var49 == null) {
                                                while (true) {
                                                    class150 var52;
                                                    class172 var53;
                                                    class172 var54;
                                                    do {
                                                        var52 = (class150) class107.field1499.method248(-24951);
                                                        if (var52 == null) {
                                                            if (class30.field367 == null) {
                                                                class391.field5874 = 0;
                                                            }
                                                            if (class329.field5152 != null) {
                                                                class120.method865((byte) 90);
                                                            }
                                                            if (class382.field5772 > 0 && class232.field3856[82] && class232.field3856[81] && ~class248.field4063 != -1) {
                                                                int var55 = -class248.field4063 + class266.field4286;
                                                                if (~var55 <= -1) {
                                                                    if (~var55 < -4) {
                                                                        var55 = 3;
                                                                    }
                                                                } else {
                                                                    var55 = 0;
                                                                }
                                                                class91.method542(var55, class261.field4201.field1906[0] + class409.field6048, 116, class261.field4201.field1916[0] + class444.field6481);
                                                            }
                                                            class43.method286((byte) 101);
                                                            if (class129.field2037 != null) {
                                                                class336.method2219((byte) 6, class129.field2037);
                                                                ++class105.field1476;
                                                                if (~(class262.field4216 - -5) > ~class414.field6125 || class262.field4216 - 5 > class414.field6125 || ~(class300.field4764 + 5) > ~class287.field4604 || class300.field4764 + -5 > class287.field4604) {
                                                                    class39.field496 = true;
                                                                }
                                                                if (~class218.field3567 == -1) {
                                                                    if (class39.field496 && class105.field1476 >= 5) {
                                                                        if (class369.field5614 == class129.field2037 && ~class92.field1132 != ~class128.field2029) {
                                                                            class172 var56 = class129.field2037;
                                                                            byte var57 = 0;
                                                                            if (~class427.field6303 == -2 && ~var56.field2831 == -207) {
                                                                                var57 = 1;
                                                                            }
                                                                            if (~var56.field2858[class128.field2029] >= -1) {
                                                                                var57 = 0;
                                                                            }
                                                                            ++class423.field6249;
                                                                            if (~var57 != -2) {
                                                                                var56.method1196(false, class128.field2029, class92.field1132);
                                                                            } else {
                                                                                int var58 = class92.field1132;
                                                                                int var59 = class128.field2029;
                                                                                while (~var58 != ~var59) {
                                                                                    if (var59 < var58) {
                                                                                        var56.method1196(false, var58 - 1, var58);
                                                                                        --var58;
                                                                                    } else if (~var59 < ~var58) {
                                                                                        var56.method1196(false, var58 - -1, var58);
                                                                                        ++var58;
                                                                                    }
                                                                                }
                                                                            }
                                                                            class11.field139.method2224(77, (byte) 0);
                                                                            class11.field139.method1315(class129.field2037.field2865, (byte) 86);
                                                                            class11.field139.method1298(class128.field2029, arg0 + -12);
                                                                            class11.field139.method1298(class92.field1132, -78);
                                                                            class11.field139.method1317(true, var57);
                                                                        }
                                                                    } else if ((class345.field5327 == 1 || class323.method2140((byte) 51)) && ~class144.field2267 < -3) {
                                                                        class433.method2677(class287.field4604, 0, class414.field6125);
                                                                    } else if (class225.method1612(-1)) {
                                                                        class133.method971((byte) 99);
                                                                    }
                                                                    class402.field6005 = 0;
                                                                    class129.field2037 = null;
                                                                    class269.field4323 = 10;
                                                                }
                                                            }
                                                            if (class391.field5872 != var44) {
                                                                if (var44 != null) {
                                                                    class336.method2219((byte) 6, var44);
                                                                }
                                                                if (class391.field5872 != null) {
                                                                    class336.method2219((byte) 6, class391.field5872);
                                                                }
                                                            }
                                                            if (class318.field4983 != var45 && class311.field4904 == class166.field2612) {
                                                                if (var45 != null) {
                                                                    class336.method2219((byte) 6, var45);
                                                                }
                                                                if (class318.field4983 != null) {
                                                                    class336.method2219((byte) 6, class318.field4983);
                                                                }
                                                            }
                                                            if (class318.field4983 != null) {
                                                                if (~class311.field4904 > ~class166.field2612) {
                                                                    ++class311.field4904;
                                                                    if (~class311.field4904 == ~class166.field2612) {
                                                                        class336.method2219((byte) 6, class318.field4983);
                                                                    }
                                                                }
                                                            } else if (~class311.field4904 < -1) {
                                                                --class311.field4904;
                                                            }
                                                            for (int var60 = 0; ~var60 > -6; ++var60) {
                                                                int var10002 = class403.field6013[var60]++;
                                                            }
                                                            if (arg0 != -112) {
                                                                return;
                                                            }
                                                            int var61 = class193.method1355((byte) 94);
                                                            int var62 = class350.method2289(23313);
                                                            if (~var61 < -15001 && ~var62 < -15001) {
                                                                class407.field6044 = 250;
                                                                class140.method1021(14500, true);
                                                                ++class338.field5246;
                                                                class11.field139.method2224(46, (byte) 0);
                                                            }
                                                            if (class52.field636 && class59.field762 < class46.method297(27104) + -60000L) {
                                                                class8.method94(true);
                                                            }
                                                            ++class198.field3188;
                                                            if (class198.field3188 > 500) {
                                                                class198.field3188 = 0;
                                                                int var63 = (int) (8.0D * Math.random());
                                                                if ((var63 & 1) == 1) {
                                                                    class221.field3674 += class130.field2047;
                                                                }
                                                                if ((2 & var63) == 2) {
                                                                    class119.field1636 += class277.field4412;
                                                                }
                                                                if ((4 & var63) == 4) {
                                                                    class201.field3227 += class412.field6101;
                                                                }
                                                            }
                                                            if (~class221.field3674 > 49) {
                                                                class130.field2047 = 2;
                                                            }
                                                            if (class119.field1636 < -55) {
                                                                class277.field4412 = 2;
                                                            }
                                                            if (class221.field3674 > 50) {
                                                                class130.field2047 = -2;
                                                            }
                                                            if (~class201.field3227 > 39) {
                                                                class412.field6101 = 1;
                                                            }
                                                            if (~class119.field1636 < -56) {
                                                                class277.field4412 = -2;
                                                            }
                                                            ++class77.field967;
                                                            if (class201.field3227 > 40) {
                                                                class412.field6101 = -1;
                                                            }
                                                            if (~class77.field967 < -501) {
                                                                class77.field967 = 0;
                                                                int var64 = (int) (Math.random() * 8.0D);
                                                                if ((2 & var64) == 2) {
                                                                    class367.field5561 += class243.field4016;
                                                                }
                                                                if ((1 & var64) == 1) {
                                                                    class52.field650 += class203.field3262;
                                                                }
                                                            }
                                                            if (class52.field650 < -60) {
                                                                class203.field3262 = 2;
                                                            }
                                                            if (~class52.field650 < -61) {
                                                                class203.field3262 = -2;
                                                            }
                                                            if (~class367.field5561 > 19) {
                                                                class243.field4016 = 1;
                                                            }
                                                            if (class367.field5561 > 10) {
                                                                class243.field4016 = -1;
                                                            }
                                                            ++class403.field6012;
                                                            if (class403.field6012 > 50) {
                                                                ++class298.field4738;
                                                                class11.field139.method2224(248, (byte) 0);
                                                            }
                                                            if (class82.field1021) {
                                                                class142.method1039(155);
                                                                class82.field1021 = false;
                                                            }
                                                            try {
                                                                if (class421.field6216 != null && ~class11.field139.field3044 < -1) {
                                                                    class421.field6216.method1101(class11.field139.field3066, 0, class11.field139.field3044, 3);
                                                                    class11.field139.field3044 = 0;
                                                                    class403.field6012 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var65) {
                                                                class342.method2248(-1);
                                                                return;
                                                            }
                                                        }
                                                        var53 = var52.field2348;
                                                        if (var53.field2693 < 0) {
                                                            break;
                                                        }
                                                        var54 = class196.method1375(var53.field2735, (byte) -56);
                                                    } while (var54 == null || var54.field2866 == null || var54.field2866.length <= var53.field2693 || var54.field2866[var53.field2693] != var53);
                                                    class17.method135(var52);
                                                }
                                            }
                                            var50 = var49.field2348;
                                            if (var50.field2693 < 0) {
                                                break;
                                            }
                                            var51 = class196.method1375(var50.field2735, (byte) -56);
                                        } while (var51 == null || var51.field2866 == null || var51.field2866.length <= var50.field2693 || var51.field2866[var50.field2693] != var50);
                                        class17.method135(var49);
                                    }
                                }
                                var47 = var46.field2348;
                                if (~var47.field2693 > -1) {
                                    break;
                                }
                                var48 = class196.method1375(var47.field2735, (byte) -56);
                            } while (var48 == null || var48.field2866 == null || var47.field2693 >= var48.field2866.length || var48.field2866[var47.field2693] != var47);
                            class17.method135(var46);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field2051;
        if (arg1 < 49) {
            return null;
        } else {
            int[] var3 = super.field371.method2367((byte) 127, arg0);
            if (super.field371.field5586) {
                int[] var4 = this.method210((byte) 79, 0, !this.field2055 ? arg0 : -arg0 + class246.field4033);
                if (this.field2052) {
                    for (int var5 = 0; var5 < class369.field5610; ++var5) {
                        var3[var5] = var4[-var5 + class106.field1492];
                    }
                } else {
                    class408.method2553(var4, 0, var3, 0, class369.field5610);
                }
            }
            return var3;
        }
    }
}
