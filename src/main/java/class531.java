import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class531 extends class646 {

    @OriginalMember(owner = "client!pca", name = "K", descriptor = "I")
    private int field7824 = 1024;

    @OriginalMember(owner = "client!pca", name = "O", descriptor = "I")
    private int field7828 = 0;

    @OriginalMember(owner = "client!pca", name = "P", descriptor = "I")
    private int field7829 = 819;

    @OriginalMember(owner = "client!pca", name = "T", descriptor = "I")
    private int field7833 = 0;

    @OriginalMember(owner = "client!pca", name = "Q", descriptor = "I")
    private int field7830 = 2048;

    @OriginalMember(owner = "client!pca", name = "U", descriptor = "I")
    private int field7834 = 1024;

    @OriginalMember(owner = "client!pca", name = "V", descriptor = "I")
    private int field7835 = 409;

    @OriginalMember(owner = "client!pca", name = "Y", descriptor = "I")
    private int field7838 = 1024;

    @OriginalMember(owner = "client!pca", name = "X", descriptor = "I")
    private int field7837 = 1024;

    @OriginalMember(owner = "client!pca", name = "R", descriptor = "Z")
    public static boolean field7831 = false;

    @OriginalMember(owner = "client!pca", name = "I", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!pca", name = "L", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!pca", name = "M", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!pca", name = "N", descriptor = "I")
    private int field7827;

    @OriginalMember(owner = "client!pca", name = "S", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!pca", name = "W", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!pca", name = "Z", descriptor = "[I")
    public static int[] field7839;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field7822;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[][] var4 = super.field9156.method2192(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class89.field1330 * this.field7834 >> 12;
            int var15 = class89.field1330 * this.field7830 >> 12;
            int var16 = class236.field3492 * this.field7835 >> 12;
            int var17 = class236.field3492 * this.field7829 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field7827 = class89.field1330 / 8 * this.field7837 >> 12;
            int var18 = 1 - -(class89.field1330 / var14);
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field7828);
            label129: while (true) {
                while (true) {
                    int var22 = var14 + class357.method2154(var21, var15 - var14, Integer.MIN_VALUE);
                    int var23 = class357.method2154(var21, var17 - var16, Integer.MIN_VALUE) + var16;
                    int var24 = var8 - -var22;
                    if (var24 > class89.field1330) {
                        var24 = class89.field1330;
                        var22 = -var8 + class89.field1330;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var24 - -var5;
                        if (var29 < 0) {
                            var29 += class89.field1330;
                        }
                        if (class89.field1330 < var29) {
                            var29 -= class89.field1330;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && var30[1] >= var29) {
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class89.field1330;
                                    }
                                    if (~var31 < ~class89.field1330) {
                                        var31 -= class89.field1330;
                                    }
                                    for (int var32 = 1; var28 >= var32; ++var32) {
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
                                            if (var29 <= var31) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class89.field1330;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method3126((byte) -97, var21, -var38 + var39, var4, var7 + var38, var25 - var35, var35);
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
                    if (var23 + var25 > class236.field3492) {
                        var23 = -var25 + class236.field3492;
                    } else {
                        var10 = false;
                    }
                    if (class89.field1330 == var24) {
                        this.method3126((byte) -96, var21, var22, var4, var6 + var8, var23, var25);
                        if (var10) {
                            break label129;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var23 + var25;
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var20 = var19;
                        var19 = var42;
                        var12 = var13;
                        var7 = var6;
                        var13 = 0;
                        var6 = class357.method2154(var21, class89.field1330, Integer.MIN_VALUE);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class89.field1330 + var5;
                        }
                        var9 = 0;
                        if (class89.field1330 < var43) {
                            var43 -= class89.field1330;
                        }
                        var11 = false;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var44[0] <= var43 && ~var43 >= ~var44[1]) {
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var23 + var25;
                        var45[0] = var8;
                        this.method3126((byte) -84, var21, var22, var4, var6 + var8, var23, var25);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 != -120) {
            this.method3126((byte) -21, (Random) null, 64, (int[][]) null, -5, -34, -67);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
    public static void method3124(byte arg0) {
        field7839 = null;
        if (arg0 != 55) {
            method3127(126, false, -23);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ld;Lhw;IIIIILnf;)V")
    public static final void method3125(class88 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class119 arg7) {
        if (arg3 != 2) {
            method3124((byte) 30);
        }
        ++field7826;
        class693 var8 = new class693();
        var8.field9817 = arg2;
        var8.field9827 = arg4 << 9;
        var8.field9841 = arg5 << 9;
        if (arg7 == null) {
            if (arg0 != null) {
                var8.field9845 = arg0;
                class528 var11 = arg0.field1309;
                if (var11.field7758 != null) {
                    var8.field9828 = true;
                    var11 = var11.method3110(class230.field3404, false);
                }
                if (var11 != null) {
                    var8.field9838 = var11.field7726 + arg4 << 9;
                    var8.field9820 = var11.field7726 + arg5 << 9;
                    var8.field9822 = class177.method1290(arg3 ^ -14713, arg0);
                    var8.field9835 = var11.field7748;
                    var8.field9832 = var11.field7739;
                    var8.field9825 = var11.field7765;
                    var8.field9830 = var11.field7792;
                    var8.field9824 = var11.field7749 << 9;
                }
                class522.field7687.method3904(var8, 0);
            } else if (arg1 != null) {
                var8.field9836 = arg1;
                var8.field9820 = arg5 - -arg1.method1108(127) << 9;
                var8.field9838 = arg4 + arg1.method1108(arg3 + 123) << 9;
                var8.field9822 = class3.method19(true, arg1);
                var8.field9830 = 256;
                var8.field9825 = arg1.field3854;
                var8.field9824 = arg1.field3868 << 9;
                var8.field9832 = arg1.field3858;
                var8.field9835 = 256;
                class260.field3749.method2816(var8, (long) arg1.field2427, false);
            }
        } else {
            var8.field9826 = arg7;
            int var9 = arg7.field1965;
            int var10 = arg7.field1876;
            if (~arg6 == -2 || ~arg6 == -4) {
                var9 = arg7.field1876;
                var10 = arg7.field1965;
            }
            var8.field9832 = arg7.field1916;
            var8.field9820 = arg5 + var9 << 9;
            var8.field9822 = arg7.field1931;
            var8.field9838 = arg4 + var10 << 9;
            var8.field9830 = arg7.field1880;
            var8.field9844 = arg7.field1943;
            var8.field9829 = arg7.field1966;
            var8.field9824 = arg7.field1902 << 9;
            var8.field9847 = arg7.field1970;
            var8.field9825 = arg7.field1935;
            var8.field9821 = arg7.field1945;
            var8.field9835 = arg7.field1929;
            if (arg7.field1924 != null) {
                var8.field9828 = true;
                var8.method3908(86);
            }
            if (var8.field9821 != null) {
                var8.field9837 = (int) ((double) (-var8.field9829 + var8.field9844) * Math.random()) + var8.field9829;
            }
            class33.field477.method3904(var8, 0);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLjava/util/Random;I[[IIII)V")
    private final void method3126(byte arg0, Random arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7825;
        if (arg0 < -49) {
            int var8 = ~this.field7838 < -1 ? -class357.method2154(arg1, this.field7838, Integer.MIN_VALUE) + 4096 : 4096;
            int var9 = this.field7827 * this.field7824 >> 12;
            int var10 = this.field7827 - (~var9 >= -1 ? 0 : class357.method2154(arg1, var9, Integer.MIN_VALUE));
            if (arg4 >= class89.field1330) {
                arg4 -= class89.field1330;
            }
            if (var10 > 0) {
                if (arg5 > 0 && ~arg2 < -1) {
                    int var11 = arg2 / 2;
                    int var12 = arg5 / 2;
                    int var13 = var11 >= var10 ? var10 : var11;
                    int var14 = var10 > var12 ? var12 : var10;
                    int var15 = arg4 + var13;
                    int var16 = -(var13 * 2) + arg2;
                    for (int var17 = 0; var17 < arg5; ++var17) {
                        int[] var18 = arg3[arg6 + var17];
                        if (var17 < var14) {
                            int var19 = var8 * var17 / var14;
                            if (~this.field7833 == -1) {
                                for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class248.method1593(class156.field2572, arg4 + var20)] = var18[class248.method1593(-var20 + arg2 + arg4 - 1, class156.field2572)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; var22 < var13; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class248.method1593(class156.field2572, arg4 + var22)] = var18[class248.method1593(class156.field2572, arg4 + -1 - -arg2 - var22)] = ~var19 >= ~var24 ? var19 : var24;
                                }
                            }
                            if (var15 + var16 > class89.field1330) {
                                int var23 = class89.field1330 - var15;
                                class553.method3238(var18, var15, var23, var19);
                                class553.method3238(var18, 0, -var23 + var16, var19);
                            } else {
                                class553.method3238(var18, var15, var16, var19);
                            }
                        } else {
                            int var25 = arg5 + -1 - var17;
                            if (var25 < var14) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field7833 != -1) {
                                    for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class248.method1593(arg4 + var27, class156.field2572)] = var18[class248.method1593(class156.field2572, -var27 + arg4 + arg2 + -1)] = ~var28 > ~var26 ? var28 : var26;
                                    }
                                } else {
                                    for (int var29 = 0; var29 < var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class248.method1593(arg4 + var29, class156.field2572)] = var18[class248.method1593(class156.field2572, arg2 + arg4 - 1 + -var29)] = var26 * var31 >> 12;
                                    }
                                }
                                if (~class89.field1330 > ~(var15 + var16)) {
                                    int var30 = -var15 + class89.field1330;
                                    class553.method3238(var18, var15, var30, var26);
                                    class553.method3238(var18, 0, -var30 + var16, var26);
                                } else {
                                    class553.method3238(var18, var15, var16, var26);
                                }
                            } else {
                                for (int var32 = 0; var32 < var13; ++var32) {
                                    var18[class248.method1593(arg4 - -var32, class156.field2572)] = var18[class248.method1593(class156.field2572, -var32 + -1 + arg2 + arg4)] = var8 * var32 / var13;
                                }
                                if (~(var15 - -var16) >= ~class89.field1330) {
                                    class553.method3238(var18, var15, var16, var8);
                                } else {
                                    int var33 = class89.field1330 - var15;
                                    class553.method3238(var18, var15, var33, var8);
                                    class553.method3238(var18, 0, -var33 + var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (arg4 - -arg2 <= class89.field1330) {
                for (int var34 = 0; ~var34 > ~arg5; ++var34) {
                    class553.method3238(arg3[arg6 + var34], arg4, arg2, var8);
                }
            } else {
                int var35 = -arg4 + class89.field1330;
                for (int var36 = 0; ~var36 > ~arg5; ++var36) {
                    int[] var37 = arg3[arg6 - -var36];
                    class553.method3238(var37, arg4, var35, var8);
                    class553.method3238(var37, 0, -var35 + arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
    public class531() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3127(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return false;
        } else {
            ++field7836;
            return ~(arg2 & 2048) != -1 | class562.method3288((byte) -88, arg2, arg0) || class229.method1499(arg0, arg2, 24314);
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)V")
    public final void method422(int arg0) {
        ++field7823;
        if (arg0 != -1) {
            method3127(-76, false, 105);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field7832;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field7838 = arg0.method2755((byte) -113);
                                        }
                                    } else {
                                        this.field7824 = arg0.method2755((byte) -60);
                                    }
                                } else {
                                    this.field7833 = arg0.method2705(-52);
                                }
                            } else {
                                this.field7837 = arg0.method2755((byte) -111);
                            }
                        } else {
                            this.field7829 = arg0.method2755((byte) -76);
                        }
                    } else {
                        this.field7835 = arg0.method2755((byte) -76);
                    }
                } else {
                    this.field7830 = arg0.method2755((byte) -70);
                }
            } else {
                this.field7834 = arg0.method2755((byte) -46);
            }
        } else {
            this.field7828 = arg0.method2705(-82);
        }
        if (arg2 <= 7) {
            this.method422(-52);
        }
    }

    static {
        new class77("", 73);
    }
}
