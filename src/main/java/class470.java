import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class470 extends class214 {

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    private int field6829 = 1024;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
    private int field6833 = 1024;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    private int field6827 = 0;

    @OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
    private int field6838 = 0;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    private int field6828 = 819;

    @OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
    private int field6837 = 1024;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    private int field6832 = 1024;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    private int field6830 = 2048;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
    private int field6836 = 409;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "J")
    public static long field6825 = -1L;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!sp", name = "T", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
    public class470() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII[[ILjava/util/Random;)V")
    private final void method2870(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
        ++field6834;
        int var8 = this.field6837 <= 0 ? 4096 : 4096 + -class721.method3975(this.field6837, arg6, false);
        int var9 = this.field6832 * this.field6826 >> 12;
        int var10 = this.field6826 - (~var9 >= -1 ? 0 : class721.method3975(var9, arg6, false));
        if (arg0 >= -91) {
            this.method59(-47, (class301) null, 126);
        }
        if (~arg1 <= ~class626.field8787) {
            arg1 -= class626.field8787;
        }
        if (~var10 < -1) {
            if (~arg2 < -1 && ~arg3 < -1) {
                int var11 = arg3 / 2;
                int var12 = arg2 / 2;
                int var13 = var10 > var11 ? var11 : var10;
                int var14 = var12 >= var10 ? var10 : var12;
                int var15 = arg1 + var13;
                int var16 = -(var13 * 2) + arg3;
                for (int var17 = 0; arg2 > var17; ++var17) {
                    int[] var18 = arg5[arg4 + var17];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field6827 != 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class636.method3603(class245.field3948, arg1 - -var20)] = var18[class636.method3603(-var20 + arg1 - (-arg3 + 1), class245.field3948)] = var21 < var19 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class636.method3603(class245.field3948, arg1 + var22)] = var18[class636.method3603(class245.field3948, -var22 + arg3 + arg1 + -1)] = var19 * var24 >> 12;
                            }
                        }
                        if (~(var15 + var16) < ~class626.field8787) {
                            int var23 = -var15 + class626.field8787;
                            class571.method3309(var18, var15, var23, var19);
                            class571.method3309(var18, 0, -var23 + var16, var19);
                        } else {
                            class571.method3309(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg2 - 1 + -var17;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field6827 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class636.method3603(class245.field3948, arg1 + var27)] = var18[class636.method3603(-var27 + -1 + arg1 + arg3, class245.field3948)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class636.method3603(arg1 - -var29, class245.field3948)] = var18[class636.method3603(class245.field3948, arg1 - var29 + arg3 + -1)] = ~var31 > ~var26 ? var31 : var26;
                                }
                            }
                            if (var15 + var16 <= class626.field8787) {
                                class571.method3309(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class626.field8787;
                                class571.method3309(var18, var15, var30, var26);
                                class571.method3309(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class636.method3603(arg1 + var32, class245.field3948)] = var18[class636.method3603(arg1 + arg3 + -var32 + -1, class245.field3948)] = var8 * var32 / var13;
                            }
                            if (~class626.field8787 <= ~(var15 - -var16)) {
                                class571.method3309(var18, var15, var16, var8);
                            } else {
                                int var33 = class626.field8787 - var15;
                                class571.method3309(var18, var15, var33, var8);
                                class571.method3309(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (class626.field8787 >= arg1 + arg3) {
            for (int var34 = 0; arg2 > var34; ++var34) {
                class571.method3309(arg5[arg4 + var34], arg1, arg3, var8);
            }
        } else {
            int var35 = class626.field8787 - arg1;
            for (int var36 = 0; ~arg2 < ~var36; ++var36) {
                int[] var37 = arg5[arg4 + var36];
                class571.method3309(var37, arg1, var35, var8);
                class571.method3309(var37, 0, arg3 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6823;
        if (arg2 != 0) {
            field6825 = 120L;
        }
        if (class184.field3102 <= arg1 && ~arg5 >= ~class657.field9347 && ~class76.field1126 >= ~arg3 && arg4 <= class461.field6699) {
            if (~arg0 == -2) {
                class217.method1557(arg6, arg1, arg3, arg5, 0, arg4);
            } else {
                class581.method3353(arg2 ^ 80, arg4, arg5, arg3, arg6, arg1, arg0);
            }
        } else if (arg0 != 1) {
            class705.method3915(arg0, arg6, true, arg5, arg3, arg1, arg4);
        } else {
            class303.method1994(arg1, arg3, arg5, arg6, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field6839;
        if (arg0 > 92) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (~arg2 != -7) {
                                        if (~arg2 != -8) {
                                            if (arg2 == 8) {
                                                this.field6837 = arg1.method1989((byte) -67);
                                            }
                                        } else {
                                            this.field6832 = arg1.method1989((byte) -75);
                                        }
                                    } else {
                                        this.field6827 = arg1.method1987(-35);
                                    }
                                } else {
                                    this.field6829 = arg1.method1989((byte) -83);
                                }
                            } else {
                                this.field6828 = arg1.method1989((byte) -54);
                            }
                        } else {
                            this.field6836 = arg1.method1989((byte) -78);
                        }
                    } else {
                        this.field6830 = arg1.method1989((byte) -54);
                    }
                } else {
                    this.field6833 = arg1.method1989((byte) -95);
                }
            } else {
                this.field6838 = arg1.method1987(-24);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6831;
        if (arg1 != 5) {
            this.method64(-54, (byte) 84);
        }
        int[] var3 = super.field3544.method3869(arg0, arg1 + -123);
        if (super.field3544.field9836) {
            int[][] var4 = super.field3544.method3866((byte) -121);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class626.field8787 * this.field6833 >> 12;
            int var15 = class626.field8787 * this.field6830 >> 12;
            int var16 = class259.field4054 * this.field6836 >> 12;
            int var17 = class259.field4054 * this.field6828 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field6826 = class626.field8787 / 8 * this.field6829 >> 12;
                int var18 = 1 - -(class626.field8787 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6838);
                while (true) {
                    while (true) {
                        int var22 = var14 + class721.method3975(var15 - var14, var21, false);
                        int var23 = class721.method3975(var17 - var16, var21, false) + var16;
                        int var24 = var8 - -var22;
                        if (var24 > class626.field8787) {
                            var24 = class626.field8787;
                            var22 = class626.field8787 - var8;
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
                                var29 += class626.field8787;
                            }
                            if (~var29 < ~class626.field8787) {
                                var29 -= class626.field8787;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && ~var30[1] <= ~var29) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class626.field8787;
                                        }
                                        if (class626.field8787 < var31) {
                                            var31 -= class626.field8787;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class626.field8787;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method2870(-125, var7 + var38, -var35 + var25, -var38 + var39, var35, var4, var21);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var25 - -var23 > class259.field4054) {
                            var23 = -var25 + class259.field4054;
                        } else {
                            var10 = false;
                        }
                        if (class626.field8787 == var24) {
                            this.method2870(-119, var6 + var8, var23, var22, var25, var4, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            var41[0] = var8;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var13 = 0;
                            var7 = var6;
                            var6 = class721.method3975(class626.field8787, var21, false);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class626.field8787 + var5;
                            }
                            if (var43 > class626.field8787) {
                                var43 -= class626.field8787;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && var44[1] >= var43) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[0] = var8;
                            var45[2] = var23 + var25;
                            var45[1] = var24;
                            this.method2870(-125, var8 - -var6, var23, var22, var25, var4, var21);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 <= 48) {
            this.field6830 = 24;
        }
        ++field6835;
    }
}
