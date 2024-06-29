import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class220 extends class118 {

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    private int field3342 = 1024;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    private int field3346 = 1024;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    private int field3349 = 2048;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    private int field3351 = 409;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    private int field3355 = 0;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    private int field3354 = 1024;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    private int field3356 = 1024;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    private int field3348 = 0;

    @OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
    private int field3361 = 819;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field3341 = -1;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "Lpf;")
    public static class425 field3357 = new class425(33, 11);

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "F")
    public static float field3359;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!lm", name = "Z", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3344;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[][] var4 = super.field1537.method2394(arg0 ^ 1);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class440.field6474 * this.field3342 >> 12;
            int var15 = class440.field6474 * this.field3349 >> 12;
            int var16 = class289.field4403 * this.field3351 >> 12;
            int var17 = class289.field4403 * this.field3361 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field3360 = class440.field6474 / 8 * this.field3346 >> 12;
            int var18 = class440.field6474 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field3355);
            label127: while (true) {
                while (true) {
                    int var22 = class330.method2028(53, -var14 + var15, var21) + var14;
                    int var23 = class330.method2028(-62, -var16 + var17, var21) + var16;
                    int var24 = var8 - -var22;
                    if (var24 > class440.field6474) {
                        var22 = -var8 + class440.field6474;
                        var24 = class440.field6474;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (~var29 > -1) {
                            var29 += class440.field6474;
                        }
                        if (class440.field6474 < var29) {
                            var29 -= class440.field6474;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && ~var30[1] <= ~var29) {
                                var25 = var27[2];
                                if (~var9 != ~var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class440.field6474;
                                    }
                                    if (~var31 < ~class440.field6474) {
                                        var31 -= class440.field6474;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var28 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 - -var33) % var12];
                                        int var35 = var34[2];
                                        if (~var25 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var29 < ~var31) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 == 0) {
                                                var39 = Math.min(var29, var37);
                                                var38 = 0;
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class440.field6474;
                                            }
                                            this.method1341((byte) -124, var4, var35, -var38 + var39, -var35 + var25, var21, var38 - -var7);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            int var10000 = ~var12;
                            ++var26;
                            if (var10000 >= ~var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class289.field4403 < var23 + var25) {
                        var23 = -var25 + class289.field4403;
                    } else {
                        var10 = false;
                    }
                    if (class440.field6474 == var24) {
                        this.method1341((byte) 127, var4, var25, var22, var23, var21, var6 + var8);
                        if (var10) {
                            break label127;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        int[][] var42 = var20;
                        var20 = var19;
                        var19 = var42;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class330.method2028(arg0 + -89, class440.field6474, var21);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class440.field6474 + var5;
                        }
                        var9 = 0;
                        if (~var43 < ~class440.field6474) {
                            var43 -= class440.field6474;
                        }
                        var11 = false;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            ++var9;
                            if (~var9 <= ~var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[2] = var23 + var25;
                        var45[0] = var8;
                        var45[1] = var24;
                        this.method1341((byte) 64, var4, var25, var22, var23, var21, var6 + var8);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 != 1) {
            this.method1341((byte) -53, (int[][]) null, -25, 46, -20, (Random) null, -18);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ldr;Z)V")
    public static final void method1337(class261 arg0, boolean arg1) {
        if (!arg1) {
            field3359 = 0.29407257F;
        }
        ++field3352;
        if ((~class149.field2067 <= -3 || class132.field1692) && class14.field173 == null) {
            String var2;
            if (class132.field1692 && class149.field2067 < 2) {
                var2 = class284.field4319 + class19.field260.method937((byte) -106, class27.field356) + class411.field6116 + " ->";
            } else if (class67.field865 && class185.field2786.method578(false, 81) && ~class149.field2067 < -3) {
                var2 = class324.method1991((class306) class372.field5433.field5946.field1336.field1336, -1);
            } else {
                class306 var3 = (class306) class372.field5433.field5946.field1336;
                var2 = class324.method1991(var3, -1);
                int[] var4 = null;
                if (!class68.method466(23, var3.field4616)) {
                    if (!class55.method316(123, var3.field4616)) {
                        if (class238.method1429(var3.field4616, -89)) {
                            Object var5 = null;
                            class85 var6;
                            if (var3.field4616 == 1002) {
                                var6 = class411.method2575(0, (int) var3.field4626);
                            } else {
                                var6 = class411.method2575(0, (int) (var3.field4626 >>> 32 & 2147483647L));
                            }
                            if (var6.field1133 != null) {
                                var6 = var6.method542(6796);
                            }
                            if (var6 != null) {
                                var4 = var6.field1177;
                            }
                        }
                    } else {
                        class155 var7 = class170.field2626[(int) var3.field4626];
                        if (var7 != null) {
                            class271 var8 = var7.field2137;
                            if (var8.field4100 != null) {
                                var8 = var8.method1684(6);
                            }
                            if (var8 != null) {
                                var4 = var8.field4130;
                            }
                        }
                    }
                } else {
                    var4 = class186.field2796.method1106(50, (int) var3.field4626).field2357;
                }
                if (var4 != null) {
                    var2 = var2 + class106.method661((byte) -82, var4);
                }
            }
            if (class149.field2067 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class149.field2067 - 2) + class219.field3338.method937((byte) 98, class27.field356);
            }
            if (class426.field6264 == null) {
                if (class435.field6402 != null && class88.field1254 == class466.field6855) {
                    int var9 = class161.field2244.method874(var2, class143.field1910 - -4, class407.field6065, class304.field4590, 22501, class164.field2281, 0, class302.field4573 + 16, class44.field552, 16777215);
                    class238.method1436(class143.field1910 + 4, 16, class188.field2828.method1693(-101, var2) + var9, class302.field4573, 116);
                    return;
                }
            } else {
                class137 var10 = class426.field6264.method1046(arg0, 2);
                if (var10 == null) {
                    var10 = class161.field2244;
                }
                var10.method862(class426.field6264.field2589, class99.field1364, class426.field6264.field2501, class426.field6264.field2483, class71.field913, class304.field4590, class44.field552, 0, var2, class426.field6264.field2561, class426.field6264.field2539, class164.field2281, class426.field6264.field2544, class167.field2384, class407.field6065);
                class238.method1436(class71.field913[0], class71.field913[3], class71.field913[2], class71.field913[1], 35);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        ++field3345;
        if (arg0 <= 103) {
            field3358 = 76;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
    public static final void method1338(boolean arg0) {
        if (~class239.field3575.toLowerCase().indexOf("microsoft") != 0) {
            class253.field3866[219] = 42;
            class253.field3866[223] = 28;
            class253.field3866[191] = 73;
            class253.field3866[187] = 27;
            class253.field3866[189] = 26;
            class253.field3866[220] = 74;
            class253.field3866[188] = 71;
            class253.field3866[186] = 57;
            class253.field3866[222] = 59;
            class253.field3866[192] = 58;
            class253.field3866[190] = 72;
            class253.field3866[221] = 43;
        } else {
            class253.field3866[59] = 57;
            class253.field3866[93] = 43;
            if (class239.field3590 != null) {
                class253.field3866[192] = 28;
                class253.field3866[520] = 59;
                class253.field3866[222] = 58;
            } else {
                class253.field3866[222] = 59;
                class253.field3866[192] = 58;
            }
            class253.field3866[44] = 71;
            class253.field3866[46] = 72;
            class253.field3866[45] = 26;
            class253.field3866[61] = 27;
            class253.field3866[91] = 42;
            class253.field3866[92] = 74;
            class253.field3866[47] = 73;
        }
        ++field3347;
        if (!arg0) {
            method1338(false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)Z")
    public static final boolean method1339(int arg0) {
        if (arg0 != -1) {
            method1339(-31);
        }
        ++field3350;
        return ~class454.field6750 != -1 || class143.field1912 >= 2;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        if (arg0 <= 89) {
            field3357 = null;
        }
        field3357 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 != 6) {
                                        if (arg0 != 7) {
                                            if (arg0 == 8) {
                                                this.field3356 = arg2.method2323(-38);
                                            }
                                        } else {
                                            this.field3354 = arg2.method2323(-121);
                                        }
                                    } else {
                                        this.field3348 = arg2.method2343(arg1 + 254);
                                    }
                                } else {
                                    this.field3346 = arg2.method2323(-69);
                                }
                            } else {
                                this.field3361 = arg2.method2323(arg1 ^ -43);
                            }
                        } else {
                            this.field3351 = arg2.method2323(-91);
                        }
                    } else {
                        this.field3349 = arg2.method2323(-1);
                    }
                } else {
                    this.field3342 = arg2.method2323(-13);
                }
            } else {
                this.field3355 = arg2.method2343(arg1 ^ 254);
            }
            ++field3353;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[[IIIILjava/util/Random;I)V")
    private final void method1341(byte arg0, int[][] arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        int var8 = -22 % ((arg0 - -28) / 48);
        ++field3343;
        int var9 = this.field3356 <= 0 ? 4096 : 4096 - class330.method2028(35, this.field3356, arg5);
        int var10 = this.field3360 * this.field3354 >> 12;
        int var11 = this.field3360 + -(~var10 < -1 ? class330.method2028(-114, var10, arg5) : 0);
        if (arg6 >= class440.field6474) {
            arg6 -= class440.field6474;
        }
        if (var11 <= 0) {
            if (arg3 + arg6 <= class440.field6474) {
                for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                    class129.method766(arg1[arg2 + var12], arg6, arg3, var9);
                }
            } else {
                int var13 = -arg6 + class440.field6474;
                for (int var14 = 0; var14 < arg4; ++var14) {
                    int[] var15 = arg1[arg2 + var14];
                    class129.method766(var15, arg6, var13, var9);
                    class129.method766(var15, 0, -var13 + arg3, var9);
                }
            }
        } else if (arg4 > 0 && arg3 > 0) {
            int var16 = arg3 / 2;
            int var17 = arg4 / 2;
            int var18 = var16 >= var11 ? var11 : var16;
            int var19 = ~var11 < ~var17 ? var17 : var11;
            int var20 = arg6 + var18;
            int var21 = -(var18 * 2) + arg3;
            for (int var22 = 0; ~var22 > ~arg4; ++var22) {
                int[] var23 = arg1[arg2 + var22];
                if (var22 < var19) {
                    int var24 = var9 * var22 / var19;
                    if (this.field3348 == 0) {
                        for (int var25 = 0; var25 < var18; ++var25) {
                            int var26 = var9 * var25 / var18;
                            var23[class406.method2552(arg6 + var25, class87.field1230)] = var23[class406.method2552(-var25 + arg3 + arg6 + -1, class87.field1230)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var27 < var18; ++var27) {
                            int var29 = var9 * var27 / var18;
                            var23[class406.method2552(arg6 + var27, class87.field1230)] = var23[class406.method2552(arg3 - var27 + arg6 + -1, class87.field1230)] = var29 >= var24 ? var24 : var29;
                        }
                    }
                    if (class440.field6474 < var20 - -var21) {
                        int var28 = -var20 + class440.field6474;
                        class129.method766(var23, var20, var28, var24);
                        class129.method766(var23, 0, -var28 + var21, var24);
                    } else {
                        class129.method766(var23, var20, var21, var24);
                    }
                } else {
                    int var30 = -var22 + arg4 + -1;
                    if (var19 > var30) {
                        int var31 = var9 * var30 / var19;
                        if (this.field3348 == 0) {
                            for (int var32 = 0; var18 > var32; ++var32) {
                                int var33 = var9 * var32 / var18;
                                var23[class406.method2552(arg6 + var32, class87.field1230)] = var23[class406.method2552(class87.field1230, arg6 - (-arg3 + var32) + -1)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; ~var34 > ~var18; ++var34) {
                                int var36 = var9 * var34 / var18;
                                var23[class406.method2552(class87.field1230, arg6 - -var34)] = var23[class406.method2552(arg6 - var34 + arg3 + -1, class87.field1230)] = var36 >= var31 ? var31 : var36;
                            }
                        }
                        if (~class440.field6474 <= ~(var20 - -var21)) {
                            class129.method766(var23, var20, var21, var31);
                        } else {
                            int var35 = class440.field6474 - var20;
                            class129.method766(var23, var20, var35, var31);
                            class129.method766(var23, 0, -var35 + var21, var31);
                        }
                    } else {
                        for (int var37 = 0; var37 < var18; ++var37) {
                            var23[class406.method2552(class87.field1230, arg6 - -var37)] = var23[class406.method2552(arg3 + arg6 + -1 + -var37, class87.field1230)] = var9 * var37 / var18;
                        }
                        if (~class440.field6474 > ~(var20 + var21)) {
                            int var38 = -var20 + class440.field6474;
                            class129.method766(var23, var20, var38, var9);
                            class129.method766(var23, 0, -var38 + var21, var9);
                        } else {
                            class129.method766(var23, var20, var21, var9);
                        }
                    }
                }
            }
        }
    }
}
