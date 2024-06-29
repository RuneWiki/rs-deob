import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class267 extends class62 {

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    private int field3799 = 0;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    private int field3796 = 819;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    private int field3805 = 2048;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    private int field3794 = 1024;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    private int field3802 = 1024;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    private int field3803 = 0;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    private int field3797 = 1024;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    private int field3800 = 1024;

    @OriginalMember(owner = "client!en", name = "V", descriptor = "I")
    private int field3809 = 409;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    private int field3793;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!en", name = "U", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 3)
    public class267() {
        super(0, true);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lgw;II)V", line = 6)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1693(120, 27, -63, 85, -35);
        }
        ++field3806;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field3802 = arg0.method1045(true);
                                        }
                                    } else {
                                        this.field3800 = arg0.method1045(true);
                                    }
                                } else {
                                    this.field3803 = arg0.method1032((byte) -33);
                                }
                            } else {
                                this.field3797 = arg0.method1045(true);
                            }
                        } else {
                            this.field3796 = arg0.method1045(true);
                        }
                    } else {
                        this.field3809 = arg0.method1045(true);
                    }
                } else {
                    this.field3805 = arg0.method1045(true);
                }
            } else {
                this.field3794 = arg0.method1045(true);
            }
        } else {
            this.field3799 = arg0.method1032((byte) -33);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILjava/util/Random;I[[III)V", line = 101)
    private final void method1692(int arg0, int arg1, Random arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        if (arg1 >= -110) {
            this.field3794 = -7;
        }
        ++field3795;
        int var8 = this.field3802 > 0 ? 4096 - class240.method1534(false, this.field3802, arg2) : 4096;
        int var9 = this.field3800 * this.field3793 >> 12;
        int var10 = this.field3793 - (~var9 >= -1 ? 0 : class240.method1534(false, var9, arg2));
        if (class438.field5847 <= arg3) {
            arg3 -= class438.field5847;
        }
        if (var10 > 0) {
            if (arg5 > 0 && arg0 > 0) {
                int var11 = arg0 / 2;
                int var12 = arg5 / 2;
                int var13 = ~var11 > ~var10 ? var11 : var10;
                int var14 = var10 > var12 ? var12 : var10;
                int var15 = arg3 + var13;
                int var16 = arg0 - var13 * 2;
                for (int var17 = 0; var17 < arg5; ++var17) {
                    int[] var18 = arg4[var17 - -arg6];
                    if (var14 > var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field3803 == -1) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class37.method245(arg3 + var20, class410.field5604)] = var18[class37.method245(class410.field5604, arg0 + arg3 - var20 - 1)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class37.method245(arg3 + var22, class410.field5604)] = var18[class37.method245(arg3 + -1 - (-arg0 - -var22), class410.field5604)] = ~var19 >= ~var24 ? var19 : var24;
                            }
                        }
                        if (~class438.field5847 <= ~(var15 + var16)) {
                            class648.method3739(var18, var15, var16, var19);
                        } else {
                            int var23 = class438.field5847 - var15;
                            class648.method3739(var18, var15, var23, var19);
                            class648.method3739(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg5 + -1 - var17;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field3803 != -1) {
                                for (int var27 = 0; var27 < var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class37.method245(arg3 + var27, class410.field5604)] = var18[class37.method245(class410.field5604, arg3 - 1 + -var27 + arg0)] = var26 > var28 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class37.method245(class410.field5604, arg3 + var29)] = var18[class37.method245(arg3 - (-arg0 + var29) - 1, class410.field5604)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class438.field5847 <= ~(var15 + var16)) {
                                class648.method3739(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class438.field5847;
                                class648.method3739(var18, var15, var30, var26);
                                class648.method3739(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class37.method245(class410.field5604, arg3 + var32)] = var18[class37.method245(arg0 - 1 + -var32 + arg3, class410.field5604)] = var8 * var32 / var13;
                            }
                            if (~(var15 - -var16) >= ~class438.field5847) {
                                class648.method3739(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class438.field5847;
                                class648.method3739(var18, var15, var33, var8);
                                class648.method3739(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class438.field5847 > ~(arg0 + arg3)) {
            int var34 = -arg3 + class438.field5847;
            for (int var35 = 0; var35 < arg5; ++var35) {
                int[] var36 = arg4[arg6 + var35];
                class648.method3739(var36, arg3, var34, var8);
                class648.method3739(var36, 0, -var34 + arg0, var8);
            }
        } else {
            for (int var37 = 0; arg5 > var37; ++var37) {
                class648.method3739(arg4[arg6 - -var37], arg3, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V", line = 299)
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3808;
        class221 var5 = class65.method413(arg4, arg3, (byte) -32);
        var5.method1426((byte) 116);
        var5.field3214 = arg2;
        var5.field3220 = arg1;
        var5.field3208 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBII)I", line = 312)
    public static final int method1694(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = -114 / ((arg1 - 58) / 60);
        ++field3804;
        if ((8 & class146.field2114[arg3][arg2][arg0]) != 0) {
            return 0;
        } else {
            return arg3 > 0 && ~(2 & class146.field2114[1][arg2][arg0]) != -1 ? arg3 + -1 : arg3;
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V", line = 333)
    public final void method395(int arg0) {
        ++field3801;
        if (arg0 > -37) {
            this.method13(-106, 16);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II)[I", line = 345)
    public final int[] method13(int arg0, int arg1) {
        ++field3798;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (arg1 != 656024161) {
            return null;
        } else if (super.field774.field7499) {
            int[][] var4 = super.field774.method3089(false);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class438.field5847 * this.field3794 >> 12;
            int var15 = class438.field5847 * this.field3805 >> 12;
            int var16 = class14.field148 * this.field3809 >> 12;
            int var17 = class14.field148 * this.field3796 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field3793 = class438.field5847 / 8 * this.field3797 >> 12;
                int var18 = class438.field5847 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3799);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class240.method1534(false, -var14 + var15, var21);
                        int var23 = class240.method1534(false, var17 - var16, var21) + var16;
                        int var24 = var8 + var22;
                        if (~class438.field5847 > ~var24) {
                            var24 = class438.field5847;
                            var22 = -var8 + class438.field5847;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class438.field5847;
                            }
                            if (var28 > class438.field5847) {
                                var28 -= class438.field5847;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && ~var30[1] <= ~var28) {
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class438.field5847;
                                        }
                                        if (~class438.field5847 > ~var31) {
                                            var31 -= class438.field5847;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var28) {
                                                    if (~var36 == -1) {
                                                        var38 = Math.min(var28, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class438.field5847;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var28, var37);
                                                }
                                                this.method1692(var38 - var39, -111, var21, var7 + var39, var4, -var35 + var29, var35);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (class14.field148 < var29 - -var23) {
                            var23 = -var29 + class14.field148;
                        } else {
                            var10 = false;
                        }
                        if (class438.field5847 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var29;
                            var41[1] = var24;
                            var41[0] = var8;
                            this.method1692(var22, -123, var21, var8 - -var6, var4, var23, var29);
                            var8 = var24;
                        } else {
                            this.method1692(var22, -122, var21, var6 + var8, var4, var23, var29);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var29 - -var23;
                            var42[0] = var8;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var7 = var6;
                            var13 = 0;
                            var6 = class240.method1534(false, class438.field5847, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class438.field5847 + var5;
                            }
                            if (~class438.field5847 > ~var44) {
                                var44 -= class438.field5847;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
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

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(III)V", line = 607)
    public static final void method1695(int arg0, int arg1, int arg2) {
        ++field3807;
        if (arg1 == 3191) {
            class221 var3 = class65.method413(1, arg0, (byte) -33);
            var3.method1426((byte) -123);
            var3.field3214 = arg2;
        }
    }
}
