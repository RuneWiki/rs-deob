import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 extends class30 {

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    private int field237 = 0;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    private int field240 = 4096;

    @OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
    private int field249 = 2000;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    private int field238 = 0;

    @OriginalMember(owner = "client!ir", name = "Q", descriptor = "I")
    private int field243 = 16;

    @OriginalMember(owner = "client!ir", name = "P", descriptor = "Z")
    public static boolean field242 = false;

    @OriginalMember(owner = "client!ir", name = "T", descriptor = "Ljava/lang/String;")
    public static String field246 = "Loaded fonts";

    @OriginalMember(owner = "client!ir", name = "R", descriptor = "Ljava/lang/String;")
    public static String field244 = "Loaded interfaces";

    @OriginalMember(owner = "client!ir", name = "Z", descriptor = "[J")
    public static long[] field252 = new long[32];

    @OriginalMember(owner = "client!ir", name = "bb", descriptor = "I")
    public static int field254 = -1;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ir", name = "S", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ir", name = "X", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ir", name = "Y", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ir", name = "ab", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ir", name = "V", descriptor = "Lgl;")
    public static class356 field248;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method116(int arg0, byte arg1) {
        ++field253;
        int[] var3 = super.field371.method2367((byte) 90, arg0);
        if (super.field371.field5586) {
            int var4 = this.field240 >> 1;
            int[][] var5 = super.field371.method2364(19215);
            Random var6 = new Random((long) this.field237);
            for (int var7 = 0; var7 < this.field249; ++var7) {
                int var8 = ~this.field240 < -1 ? this.field238 - (-class105.method797(var6, -95, this.field240) - -var4) : this.field238;
                int var9 = (var8 & 4082) >> 4;
                int var10 = class105.method797(var6, -111, class369.field5610);
                int var11 = class105.method797(var6, -19, class312.field4921);
                int var12 = (class183.field2986[var9] * this.field243 >> 12) + var10;
                int var13 = (class232.field3877[var9] * this.field243 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class105.method797(var6, -63, 4096) >> 2) + 1024;
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class106.field1492 & var28;
                        int var31 = class246.field4033 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return arg1 < 49 ? null : var3;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Le;Lah;I)V", line = 141)
    public static final void method143(class312 arg0, class215 arg1, int arg2) {
        ++field247;
        if (class400.field5950 != null) {
            if (~class397.field5935 > -11) {
                if (!class400.field5949.method2780(class400.field5950.field273, (byte) -16)) {
                    class397.field5935 = class311.field4900.method2757(class400.field5950.field273, -110) / 10;
                    return;
                }
                class450.method2802(-5);
                class397.field5935 = 10;
            }
            if (class397.field5935 == 10) {
                class400.field5973 = class400.field5950.field264 >> 6 << 6;
                class400.field5974 = class400.field5950.field259 >> 6 << 6;
                class400.field5967 = (class400.field5950.field280 >> 6 << 6) - (class400.field5974 + -64);
                class400.field5981 = (class400.field5950.field284 >> 6 << 6) + 64 + -class400.field5973;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class400.field5950.method152(class266.field4286, (class261.field4201.field724 >> 7) + class409.field6048, (class261.field4201.field722 >> 7) + class444.field6481, (byte) -31, var3)) {
                    var5 = var3[2] + -class400.field5974;
                    var4 = var3[1] + -class400.field5973;
                }
                if (!class270.field4340 && ~var4 <= -1 && ~class400.field5981 < ~var4 && ~var5 <= -1 && ~var5 > ~class400.field5967) {
                    int var6 = var4 + (int) (Math.random() * 10.0D) + -5;
                    int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                    class375.field5656 = var6;
                    class144.field2270 = var7;
                } else if (class72.field886 != -1 && class415.field6144 != -1) {
                    class400.field5950.method156(class72.field886, var3, class415.field6144, 100);
                    class270.field4340 = false;
                    if (var3 != null) {
                        class375.field5656 = var3[1] + -class400.field5973;
                        class144.field2270 = var3[2] - class400.field5974;
                    }
                    class415.field6144 = -1;
                    class72.field886 = -1;
                } else {
                    class400.field5950.method156((268423442 & class400.field5950.field269) >> 14, var3, class400.field5950.field269 & 16383, 100);
                    class375.field5656 = var3[1] + -class400.field5973;
                    class144.field2270 = var3[2] + -class400.field5974;
                }
                if (~class400.field5950.field261 != -38) {
                    if (class400.field5950.field261 != 50) {
                        if (~class400.field5950.field261 != -76) {
                            if (~class400.field5950.field261 != -101) {
                                if (class400.field5950.field261 == 200) {
                                    class400.field5957 = 16.0F;
                                    class400.field5953 = 16.0F;
                                } else {
                                    class400.field5957 = 8.0F;
                                    class400.field5953 = 8.0F;
                                }
                            } else {
                                class400.field5957 = 8.0F;
                                class400.field5953 = 8.0F;
                            }
                        } else {
                            class400.field5957 = 6.0F;
                            class400.field5953 = 6.0F;
                        }
                    } else {
                        class400.field5957 = 4.0F;
                        class400.field5953 = 4.0F;
                    }
                } else {
                    class400.field5957 = 3.0F;
                    class400.field5953 = 3.0F;
                }
                class400.field5961 = (int) class400.field5957 >> 1;
                class400.field5956 = class374.method2388(class400.field5961, -1);
                class270.method1829(arg2 ^ 1376367846);
                class400.method2503();
                class315.field4952 = new class37();
                class400.field5960 += -2 + (int) (Math.random() * 5.0D);
                if (class400.field5960 < -8) {
                    class400.field5960 = -8;
                }
                if (~class400.field5960 < -9) {
                    class400.field5960 = 8;
                }
                class400.field5959 += -2 + (int) (5.0D * Math.random());
                if (~class400.field5959 > 15) {
                    class400.field5959 = -16;
                }
                if (class400.field5959 > 16) {
                    class400.field5959 = 16;
                }
                class400.method2505(arg1, class400.field5960 >> 2 << 10, class400.field5959 >> 1);
                class186.method1323(256, true, 1024);
                class312.method2093(-2, 256, 256);
                class212.method1495(4096, (byte) -100);
                class196.method1376((byte) 124, 256);
                class397.field5935 = 20;
            } else if (class397.field5935 == 20) {
                class427.method2646(true, (byte) -121);
                class400.method2519(arg0, class400.field5960, class400.field5959);
                class397.field5935 = 60;
                class427.method2646(true, (byte) -86);
                class448.method2793(-128);
            } else if (class397.field5935 == 60) {
                if (!class400.field5949.method2769(class400.field5950.field273 + "_staticelements", 5)) {
                    class400.field5954 = new class362(0);
                } else {
                    if (!class400.field5949.method2780(class400.field5950.field273 + "_staticelements", (byte) -78)) {
                        return;
                    }
                    class400.field5954 = class54.method359(-62, class400.field5949, class400.field5950.field273 + "_staticelements", class84.field1040);
                }
                class400.method2508();
                class397.field5935 = 70;
                class427.method2646(true, (byte) -118);
                class448.method2793(-107);
            } else if (class397.field5935 == 70) {
                class31.field385 = new class148(arg0, 11, true, class86.field1073);
                class397.field5935 = 73;
                class427.method2646(true, (byte) -105);
                class448.method2793(arg2 + -1376367960);
            } else if (class397.field5935 == 73) {
                class257.field4167 = new class148(arg0, 12, true, class86.field1073);
                class397.field5935 = 76;
                class427.method2646(true, (byte) -107);
                class448.method2793(-111);
            } else if (class397.field5935 == 76) {
                class53.field668 = new class148(arg0, 14, true, class86.field1073);
                class397.field5935 = 79;
                class427.method2646(true, (byte) -70);
                class448.method2793(-107);
            } else if (~class397.field5935 == -80) {
                class91.field1131 = new class148(arg0, 17, true, class86.field1073);
                class397.field5935 = 82;
                class427.method2646(true, (byte) -101);
                class448.method2793(-96);
            } else if (~class397.field5935 == -83) {
                class21.field260 = new class148(arg0, 19, true, class86.field1073);
                class397.field5935 = 85;
                class427.method2646(true, (byte) -94);
                class448.method2793(arg2 ^ -1376367752);
            } else if (class397.field5935 == 85) {
                class302.field4783 = new class148(arg0, 22, true, class86.field1073);
                class397.field5935 = 88;
                class427.method2646(true, (byte) -89);
                class448.method2793(-125);
            } else if (class397.field5935 == 88) {
                class57.field725 = new class148(arg0, 26, true, class86.field1073);
                class397.field5935 = 91;
                class427.method2646(true, (byte) -87);
                class448.method2793(-110);
            } else {
                class107.field1496 = new class148(arg0, 30, true, class86.field1073);
                class397.field5935 = 100;
                if (arg2 == 1376367846) {
                    class427.method2646(true, (byte) -121);
                    class448.method2793(arg2 ^ -1376367803);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V", line = 369)
    public static void method144(int arg0) {
        field252 = null;
        int var1 = 96 / ((-3 - arg0) / 56);
        field246 = null;
        field244 = null;
        field248 = null;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V", line = 391)
    public class19() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljg;II)V", line = 400)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field236;
        if (arg1 != 6456) {
            this.method115((class186) null, -70, 114);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field240 = arg0.method1272((byte) -101);
                        }
                    } else {
                        this.field238 = arg0.method1272((byte) -55);
                    }
                } else {
                    this.field243 = arg0.method1322(false);
                }
            } else {
                this.field249 = arg0.method1272((byte) -125);
            }
        } else {
            this.field237 = arg0.method1322(false);
        }
    }

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)V", line = 467)
    public static final void method145(int arg0) {
        ++field241;
        class196.field3181.method336(91);
        if (arg0 != 1024) {
            method145(99);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lel;Lbr;IBILe;)Z", line = 483)
    public static final boolean method146(class324 arg0, class222 arg1, int arg2, byte arg3, int arg4, class312 arg5) {
        ++field250;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field5088 != null) {
            var8 = -((arg0.field5093 - class400.field5962 + arg1.field3691) * (-class400.field5964 + class400.field5975) / (-class400.field5962 + class400.field5969)) + class400.field5975;
            var9 = class400.field5975 - (class400.field5975 - class400.field5964) * (arg0.field5062 + arg1.field3691 + -class400.field5962) / (-class400.field5962 + class400.field5969);
            var7 = (-class400.field5963 + arg1.field3699 + arg0.field5059) * (-class400.field5965 + class400.field5970) / (-class400.field5963 + class400.field5980) + class400.field5965;
            var6 = class400.field5965 - -((-class400.field5963 + arg1.field3699 + arg0.field5081) * (-class400.field5965 + class400.field5970) / (-class400.field5963 + class400.field5980));
        }
        class356 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field5071 != -1) {
            if (arg1.field3697 && arg0.field5065 != -1) {
                var10 = arg0.method2149((byte) 107, arg5, true);
            } else {
                var10 = arg0.method2149((byte) 107, arg5, false);
            }
            if (var10 != null) {
                var11 = arg1.field3693 - (1 + var10.method2318() >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field3693 + (var10.method2318() + 1 >> 1);
                if (~var7 > ~var12) {
                    var7 = var12;
                }
                var13 = arg1.field3685 - (1 + var10.method2315() >> 1);
                var14 = arg1.field3685 + (1 + var10.method2315() >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (~var14 < ~var9) {
                    var9 = var14;
                }
            }
        }
        if (arg3 >= -62) {
            field248 = null;
        }
        class148 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field5070 != null) {
            var15 = class373.method2383(true, arg0.field5083);
            if (var15 != null) {
                var16 = class13.field185.method2160((int[]) null, class9.field111, arg0.field5070, (byte) -18, (class356[]) null);
                int var23 = arg1.field3685;
                if (var10 == null) {
                    var17 = var23 - var15.method1054() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method2315() >> 1) + var16 * var15.method1060());
                }
                for (int var24 = 0; var16 > var24; ++var24) {
                    String var25 = class9.field111[var24];
                    if (~var24 > ~(var16 + -1)) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method1056(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = -(var18 / 2) + arg1.field3693 + arg4;
                var20 = arg1.field3693 - (-(var18 / 2) + -arg4);
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                var21 = arg2 + var17;
                if (~var7 > ~var20) {
                    var7 = var20;
                }
                var22 = var16 * var15.method1060() + var17 - -arg2;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (~var9 > ~var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 >= class400.field5965 && ~var6 >= ~class400.field5970 && ~var9 <= ~class400.field5964 && var8 <= class400.field5975) {
            if (arg0.field5088 != null) {
                int[] var27 = new int[arg0.field5088.length];
                for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                    int var30 = arg0.field5088[var28 * 2] + arg1.field3699;
                    int var31 = arg0.field5088[var28 * 2 + 1] + arg1.field3691;
                    var27[var28 * 2] = (-class400.field5965 + class400.field5970) * (-class400.field5963 + var30) / (-class400.field5963 + class400.field5980) + class400.field5965;
                    var27[var28 * 2 - -1] = -((class400.field5975 - class400.field5964) * (-class400.field5962 + var31) / (class400.field5969 - class400.field5962)) + class400.field5975;
                }
                class251.method1738(arg5, var27, arg0.field5087);
                for (int var29 = 0; ~var29 > ~(var27.length / 2 + -1); ++var29) {
                    arg5.method2090(0, var27[(var29 + 1) * 2], var27[var29 * 2 + 1], var27[var29 * 2], var27[(var29 + 1) * 2 + 1], arg0.field5064);
                }
                arg5.method2090(0, var27[0], var27[var27.length - 1], var27[var27.length + -2], var27[1], arg0.field5064);
            }
            if (var10 != null) {
                if (class433.field6401 > 0 && (~class411.field6088 != 0 && ~class411.field6088 == ~arg1.field3684 || ~class217.field3552 != 0 && ~class217.field3552 == ~arg0.field5091)) {
                    int var32;
                    if (~class291.field4646 >= -51) {
                        var32 = class291.field4646 * 2;
                    } else {
                        var32 = (100 - class291.field4646) * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg5.method2094(arg1.field3685, true, 7 + var10.method2324() / 2, var33, arg1.field3693);
                    arg5.method2094(arg1.field3685, true, var10.method2324() / 2 - -5, var33, arg1.field3693);
                    arg5.method2094(arg1.field3685, true, var10.method2324() / 2 - -3, var33, arg1.field3693);
                    arg5.method2094(arg1.field3685, true, 1 + var10.method2324() / 2, var33, arg1.field3693);
                    arg5.method2094(arg1.field3685, true, var10.method2324() / 2, var33, arg1.field3693);
                }
                var10.method2327(arg1.field3693 + -(var10.method2318() >> 1), arg1.field3685 - (var10.method2315() >> 1));
            }
            if (arg0.field5070 != null && var15 != null) {
                class108.method813(arg0, var15, true, arg5, var18, var17, arg1, var16);
            }
            if (~arg0.field5071 != 0 || arg0.field5070 != null) {
                class106 var34 = new class106(arg1);
                var34.field1491 = var22;
                var34.field1482 = var13;
                var34.field1490 = var19;
                var34.field1487 = var21;
                var34.field1480 = var12;
                var34.field1485 = var14;
                var34.field1493 = var20;
                var34.field1478 = var11;
                class315.field4952.method245(500, var34);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(III)V", line = 701)
    public static final void method147(int arg0, int arg1, int arg2) {
        ++field245;
        class42 var3 = class395.method2490(arg2, (byte) 122);
        int var4 = var3.field524;
        int var5 = var3.field526;
        int var6 = var3.field530;
        int var7 = class348.field5350[-var5 + var6];
        if (arg1 < ~arg0 || ~arg0 < ~var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class141.method1026(arg0 << var5 & var8 | ~var8 & class403.field6014[var4], var4, 3666);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V", line = 737)
    public final void method111(byte arg0) {
        if (arg0 <= 90) {
            field252 = null;
        }
        class173.method1208(4096);
        ++field251;
    }
}
