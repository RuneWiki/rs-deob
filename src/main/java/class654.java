import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class654 extends class30 {

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
    private int field9097 = 1024;

    @OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
    private int field9102 = 0;

    @OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
    private int field9100 = 409;

    @OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
    private int field9098 = 0;

    @OriginalMember(owner = "client!waa", name = "M", descriptor = "I")
    private int field9105 = 1024;

    @OriginalMember(owner = "client!waa", name = "I", descriptor = "I")
    private int field9101 = 819;

    @OriginalMember(owner = "client!waa", name = "R", descriptor = "I")
    private int field9108 = 1024;

    @OriginalMember(owner = "client!waa", name = "L", descriptor = "I")
    private int field9104 = 2048;

    @OriginalMember(owner = "client!waa", name = "Q", descriptor = "I")
    private int field9107 = 1024;

    @OriginalMember(owner = "client!waa", name = "O", descriptor = "Lgk;")
    public static class439 field9106 = new class439(0, 0);

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!waa", name = "D", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!waa", name = "K", descriptor = "I")
    private int field9103;

    @OriginalMember(owner = "client!waa", name = "G", descriptor = "Llfa;")
    public static class100 field9099;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field9095;
        if (arg0 != 1) {
            this.field9097 = -15;
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[][] var4 = super.field374.method3663(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class31.field399 * this.field9107 >> 12;
            int var15 = class31.field399 * this.field9104 >> 12;
            int var16 = class148.field2197 * this.field9100 >> 12;
            int var17 = class148.field2197 * this.field9101 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field9103 = class31.field399 / 8 * this.field9097 >> 12;
                int var18 = class31.field399 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field9102);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class351.method2023(-var14 + var15, -114, var21);
                        int var23 = var16 - -class351.method2023(-var16 + var17, -112, var21);
                        int var24 = var8 + var22;
                        if (var24 > class31.field399) {
                            var22 = -var8 + class31.field399;
                            var24 = class31.field399;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class31.field399;
                            }
                            if (~class31.field399 > ~var29) {
                                var29 -= class31.field399;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && ~var30[1] <= ~var29) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class31.field399;
                                        }
                                        if (class31.field399 < var31) {
                                            var31 -= class31.field399;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class31.field399;
                                                }
                                                this.method3688(var4, var21, -var35 + var25, -var38 + var39, var35, (byte) -117, var7 + var38);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var26 >= var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class148.field2197 <= ~(var25 - -var23)) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class148.field2197;
                        }
                        if (class31.field399 != var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            this.method3688(var4, var21, var23, var22, var25, (byte) -113, var6 + var8);
                            var8 = var24;
                        } else {
                            this.method3688(var4, var21, var23, var22, var25, (byte) -119, var6 + var8);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[0] = var8;
                            var42[2] = var25 - -var23;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class351.method2023(class31.field399, -123, var21);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class31.field399 + var5;
                            }
                            var9 = 0;
                            if (~class31.field399 > ~var44) {
                                var44 -= class31.field399;
                            }
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var44 <= ~var45[0] && var45[1] >= var44) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 >= 100) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 != -7) {
                                        if (~arg1 != -8) {
                                            if (~arg1 == -9) {
                                                this.field9105 = arg2.method2845(-1);
                                            }
                                        } else {
                                            this.field9108 = arg2.method2845(-1);
                                        }
                                    } else {
                                        this.field9098 = arg2.method2874((byte) -75);
                                    }
                                } else {
                                    this.field9097 = arg2.method2845(-1);
                                }
                            } else {
                                this.field9101 = arg2.method2845(-1);
                            }
                        } else {
                            this.field9100 = arg2.method2845(-1);
                        }
                    } else {
                        this.field9104 = arg2.method2845(-1);
                    }
                } else {
                    this.field9107 = arg2.method2845(-1);
                }
            } else {
                this.field9102 = arg2.method2874((byte) -75);
            }
            ++field9094;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        if (arg0 <= -10) {
            ++field9092;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
    public class654() {
        super(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([[ILjava/util/Random;IIIBI)V")
    private final void method3688(int[][] arg0, Random arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 > -88) {
            this.method29((byte) -68);
        }
        ++field9093;
        int var8 = ~this.field9105 >= -1 ? 4096 : 4096 - class351.method2023(this.field9105, -127, arg1);
        int var9 = this.field9108 * this.field9103 >> 12;
        int var10 = this.field9103 + -(~var9 >= -1 ? 0 : class351.method2023(var9, -99, arg1));
        if (~arg6 <= ~class31.field399) {
            arg6 -= class31.field399;
        }
        if (~var10 < -1) {
            if (~arg2 < -1 && ~arg3 < -1) {
                int var11 = arg3 / 2;
                int var12 = arg2 / 2;
                int var13 = ~var10 >= ~var11 ? var10 : var11;
                int var14 = ~var10 < ~var12 ? var12 : var10;
                int var15 = arg6 + var13;
                int var16 = -(var13 * 2) + arg3;
                for (int var17 = 0; ~arg2 < ~var17; ++var17) {
                    int[] var18 = arg0[arg4 + var17];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field9098 == 0) {
                            for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class136.method950(arg6 + var20, class353.field4694)] = var18[class136.method950(arg3 + arg6 + -var20 + -1, class353.field4694)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class136.method950(class353.field4694, arg6 - -var22)] = var18[class136.method950(-var22 - 1 + arg3 + arg6, class353.field4694)] = ~var19 < ~var24 ? var24 : var19;
                            }
                        }
                        if (~class31.field399 <= ~(var15 - -var16)) {
                            class359.method2051(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class31.field399;
                            class359.method2051(var18, var15, var23, var19);
                            class359.method2051(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg2 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field9098 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class136.method950(class353.field4694, arg6 + var27)] = var18[class136.method950(class353.field4694, arg6 - (-arg3 - -var27 - -1))] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var13 > var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class136.method950(arg6 + var29, class353.field4694)] = var18[class136.method950(-var29 + arg6 + -1 + arg3, class353.field4694)] = var26 > var31 ? var31 : var26;
                                }
                            }
                            if (~(var15 + var16) >= ~class31.field399) {
                                class359.method2051(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class31.field399;
                                class359.method2051(var18, var15, var30, var26);
                                class359.method2051(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class136.method950(arg6 + var32, class353.field4694)] = var18[class136.method950(arg3 + arg6 + -var32 - 1, class353.field4694)] = var8 * var32 / var13;
                            }
                            if (class31.field399 >= var15 + var16) {
                                class359.method2051(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class31.field399;
                                class359.method2051(var18, var15, var33, var8);
                                class359.method2051(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg3 + arg6 <= class31.field399) {
            for (int var34 = 0; var34 < arg2; ++var34) {
                class359.method2051(arg0[arg4 + var34], arg6, arg3, var8);
            }
        } else {
            int var35 = -arg6 + class31.field399;
            for (int var36 = 0; arg2 > var36; ++var36) {
                int[] var37 = arg0[arg4 + var36];
                class359.method2051(var37, arg6, var35, var8);
                class359.method2051(var37, 0, -var35 + arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V")
    public static final void method3689(int arg0) {
        class361.field4765 = false;
        class550.field7436 = null;
        class51.field602 = null;
        class660.field9176 = null;
        class184.field2667 = null;
        class285.field3925 = null;
        ++field9096;
        if (arg0 != 23017) {
            field9106 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "(I)V")
    public static void method3690(int arg0) {
        if (arg0 != -16254) {
            method3690(-1);
        }
        field9099 = null;
        field9106 = null;
    }
}
