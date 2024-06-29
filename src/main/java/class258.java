import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class258 extends class386 {

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    private int field3532 = 2048;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    private int field3543 = 1024;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    private int field3540 = 409;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    private int field3546 = 0;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    private int field3538 = 1024;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    private int field3542 = 1024;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    private int field3537 = 819;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    private int field3545 = 0;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    private int field3536 = 1024;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "[I")
    public static int[] field3533 = new int[4096];

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "[I")
    public static int[] field3541;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II[[IILjava/util/Random;II)V")
    private final void method1570(int arg0, int arg1, int[][] arg2, int arg3, Random arg4, int arg5, int arg6) {
        ++field3539;
        int var8 = this.field3542 > 0 ? 4096 - class517.method3062(arg4, arg3 ^ -26101, this.field3542) : 4096;
        int var9 = this.field3543 * this.field3534 >> 12;
        int var10 = this.field3534 - (~var9 < arg3 ? class517.method3062(arg4, 26100, var9) : 0);
        if (class599.field8643 <= arg0) {
            arg0 -= class599.field8643;
        }
        if (~var10 >= -1) {
            if (arg0 + arg1 > class599.field8643) {
                int var11 = -arg0 + class599.field8643;
                for (int var12 = 0; ~var12 > ~arg6; ++var12) {
                    int[] var13 = arg2[arg5 + var12];
                    class252.method1539(var13, arg0, var11, var8);
                    class252.method1539(var13, 0, -var11 + arg1, var8);
                }
            } else {
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    class252.method1539(arg2[arg5 + var14], arg0, arg1, var8);
                }
            }
        } else if (arg6 > 0 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg6 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg0 - -var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; ~arg6 < ~var21; ++var21) {
                int[] var22 = arg2[arg5 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field3545 == 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class435.method2605(arg0 + var24, class276.field3782)] = var22[class435.method2605(class276.field3782, arg0 + arg1 + -var24 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class435.method2605(class276.field3782, arg0 + var26)] = var22[class435.method2605(arg0 - (-arg1 + 1) + -var26, class276.field3782)] = ~var28 > ~var23 ? var28 : var23;
                        }
                    }
                    if (~class599.field8643 <= ~(var19 + var20)) {
                        class252.method1539(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class599.field8643;
                        class252.method1539(var22, var19, var27, var23);
                        class252.method1539(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg6 + -1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field3545 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class435.method2605(arg0 - -var31, class276.field3782)] = var22[class435.method2605(arg0 - (-arg1 + var31 + 1), class276.field3782)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class435.method2605(arg0 + var33, class276.field3782)] = var22[class435.method2605(arg0 - -arg1 + -var33 + -1, class276.field3782)] = ~var30 < ~var35 ? var35 : var30;
                            }
                        }
                        if (~class599.field8643 <= ~(var19 + var20)) {
                            class252.method1539(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class599.field8643;
                            class252.method1539(var22, var19, var34, var30);
                            class252.method1539(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class435.method2605(class276.field3782, arg0 + var36)] = var22[class435.method2605(class276.field3782, arg1 - 1 + -var36 + arg0)] = var8 * var36 / var17;
                        }
                        if (~class599.field8643 <= ~(var19 + var20)) {
                            class252.method1539(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class599.field8643;
                            class252.method1539(var22, var19, var37, var8);
                            class252.method1539(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field3535;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = 44 % ((13 - arg1) / 40);
        if (super.field5140.field3482) {
            int[][] var5 = super.field5140.method1563(-2);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = 0;
            int var14 = 0;
            int var15 = class599.field8643 * this.field3536 >> 12;
            int var16 = class599.field8643 * this.field3532 >> 12;
            int var17 = class365.field4914 * this.field3540 >> 12;
            int var18 = class365.field4914 * this.field3537 >> 12;
            if (var18 <= 1) {
                return var5[arg0];
            } else {
                this.field3534 = class599.field8643 / 8 * this.field3538 >> 12;
                int var19 = class599.field8643 / var15 + 1;
                int[][] var20 = new int[var19][3];
                int[][] var21 = new int[var19][3];
                Random var22 = new Random((long) this.field3546);
                while (true) {
                    while (true) {
                        int var23 = var15 - -class517.method3062(var22, 26100, var16 - var15);
                        int var24 = class517.method3062(var22, 26100, -var17 + var18) + var17;
                        int var25 = var9 - -var23;
                        if (var25 > class599.field8643) {
                            var25 = class599.field8643;
                            var23 = class599.field8643 - var9;
                        }
                        int var31;
                        if (var12) {
                            var31 = 0;
                        } else {
                            int var26 = var10;
                            int[] var27 = var21[var10];
                            int var28 = 0;
                            int var29 = var6 + var25;
                            if (~var29 > -1) {
                                var29 += class599.field8643;
                            }
                            if (~class599.field8643 > ~var29) {
                                var29 -= class599.field8643;
                            }
                            while (true) {
                                int[] var30 = var21[var26];
                                if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                    var31 = var27[2];
                                    if (var10 != var26) {
                                        int var32 = var6 + var9;
                                        if (~var32 > -1) {
                                            var32 += class599.field8643;
                                        }
                                        if (class599.field8643 < var32) {
                                            var32 -= class599.field8643;
                                        }
                                        for (int var33 = 1; var28 >= var33; ++var33) {
                                            int[] var41 = var21[(var10 + var33) % var13];
                                            var31 = Math.max(var31, var41[2]);
                                        }
                                        for (int var34 = 0; ~var28 <= ~var34; ++var34) {
                                            int[] var35 = var21[(var10 + var34) % var13];
                                            int var36 = var35[2];
                                            if (var31 != var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (var29 <= var32) {
                                                    if (var37 != 0) {
                                                        var39 = Math.max(var32, var37);
                                                        var40 = class599.field8643;
                                                    } else {
                                                        var39 = 0;
                                                        var40 = Math.min(var29, var38);
                                                    }
                                                } else {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var29, var38);
                                                }
                                                this.method1570(var8 + var39, var40 - var39, var5, -1, var22, var36, -var36 + var31);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                ++var26;
                                if (var13 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var31 - -var24) < ~class365.field4914) {
                            var24 = -var31 + class365.field4914;
                        } else {
                            var11 = false;
                        }
                        if (class599.field8643 == var25) {
                            this.method1570(var7 + var9, var23, var5, -1, var22, var31, var24);
                            if (var11) {
                                return var3;
                            }
                            var11 = true;
                            int[] var42 = var20[var14++];
                            var42[1] = var25;
                            var42[2] = var31 - -var24;
                            var42[0] = var9;
                            int[][] var43 = var21;
                            var21 = var20;
                            var20 = var43;
                            var13 = var14;
                            var8 = var7;
                            var14 = 0;
                            var7 = class517.method3062(var22, 26100, class599.field8643);
                            var9 = 0;
                            var6 = var7 - var8;
                            int var44 = var6;
                            if (var6 < 0) {
                                var44 = class599.field8643 + var6;
                            }
                            if (var44 > class599.field8643) {
                                var44 -= class599.field8643;
                            }
                            var10 = 0;
                            var12 = false;
                            while (true) {
                                int[] var45 = var21[var10];
                                if (var45[0] <= var44 && ~var45[1] <= ~var44) {
                                    break;
                                }
                                int var10000 = ~var13;
                                ++var10;
                                if (var10000 >= ~var10) {
                                    var10 = 0;
                                }
                            }
                        } else {
                            int[] var46 = var20[var14++];
                            var46[2] = var24 + var31;
                            var46[1] = var25;
                            var46[0] = var9;
                            this.method1570(var7 + var9, var23, var5, -1, var22, var31, var24);
                            var9 = var25;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class258() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field3533 = null;
        int var1 = -123 % ((46 - arg0) / 49);
        field3541 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        ++field3544;
        if (arg0 < 0) {
            this.method359(29, 29);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field3542 = arg2.method2260(-62);
                                        }
                                    } else {
                                        this.field3543 = arg2.method2260(-69);
                                    }
                                } else {
                                    this.field3545 = arg2.method2229(255);
                                }
                            } else {
                                this.field3538 = arg2.method2260(-31);
                            }
                        } else {
                            this.field3537 = arg2.method2260(-85);
                        }
                    } else {
                        this.field3540 = arg2.method2260(-99);
                    }
                } else {
                    this.field3532 = arg2.method2260(-104);
                }
            } else {
                this.field3536 = arg2.method2260(-91);
            }
        } else {
            this.field3546 = arg2.method2229(255);
        }
        if (arg1 < 111) {
            this.field3540 = 74;
        }
        ++field3548;
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field3533[var0] = class488.method2846(-121, var0);
        }
    }
}
