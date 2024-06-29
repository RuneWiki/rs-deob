import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class595 extends class739 {

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    private int field8461 = 1024;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    private int field8462 = 409;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    private int field8458 = 2048;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    private int field8467 = 1024;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    private int field8463 = 0;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    private int field8453 = 0;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    private int field8460 = 1024;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    private int field8468 = 819;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    private int field8469 = 1024;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
    public static int[] field8452 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    private int field8456;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lla;")
    public static class423 field8457;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (~arg1 == -9) {
                                            this.field8467 = arg0.method2882(-1);
                                        }
                                    } else {
                                        this.field8460 = arg0.method2882(arg2 + -2);
                                    }
                                } else {
                                    this.field8453 = arg0.method2886(true);
                                }
                            } else {
                                this.field8461 = arg0.method2882(-1);
                            }
                        } else {
                            this.field8468 = arg0.method2882(-1);
                        }
                    } else {
                        this.field8462 = arg0.method2882(-1);
                    }
                } else {
                    this.field8458 = arg0.method2882(-1);
                }
            } else {
                this.field8469 = arg0.method2882(arg2 ^ -2);
            }
        } else {
            this.field8463 = arg0.method2886(true);
        }
        ++field8466;
        if (arg2 != 1) {
            method3487(-46, 1, 14, 67, -74, (byte) -85, 23);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        ++field8459;
        if (arg0 <= 53) {
            field8451 = -102;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static void method3486(int arg0) {
        if (arg0 != 6888) {
            field8455 = -114;
        }
        field8457 = null;
        field8452 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field8454;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            field8451 = -50;
        }
        if (super.field10317.field2170) {
            int[][] var4 = super.field10317.method1041((byte) 85);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class399.field5703 * this.field8469 >> 12;
            int var15 = class399.field5703 * this.field8458 >> 12;
            int var16 = class505.field7350 * this.field8462 >> 12;
            int var17 = class505.field7350 * this.field8468 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field8456 = class399.field5703 / 8 * this.field8461 >> 12;
                int var18 = 1 - -(class399.field5703 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field8463);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class151.method1094(var21, 4, -var14 + var15);
                        int var23 = class151.method1094(var21, 4, -var16 + var17) + var16;
                        int var24 = var8 - -var22;
                        if (~var24 < ~class399.field5703) {
                            var22 = -var8 + class399.field5703;
                            var24 = class399.field5703;
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
                                var29 += class399.field5703;
                            }
                            if (~class399.field5703 > ~var29) {
                                var29 -= class399.field5703;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && ~var29 >= ~var30[1]) {
                                    var25 = var27[2];
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class399.field5703;
                                        }
                                        if (class399.field5703 < var31) {
                                            var31 -= class399.field5703;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
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
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class399.field5703;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method3488(var7 + var38, var25 - var35, -var38 + var39, var4, (byte) 40, var35, var21);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (class505.field7350 >= var25 - -var23) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class505.field7350;
                        }
                        if (class399.field5703 != var24) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            this.method3488(var6 + var8, var23, var22, var4, (byte) 70, var25, var21);
                            var8 = var24;
                        } else {
                            this.method3488(var6 + var8, var23, var22, var4, (byte) 127, var25, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class151.method1094(var21, 4, class399.field5703);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class399.field5703 + var5;
                            }
                            var9 = 0;
                            if (~class399.field5703 > ~var44) {
                                var44 -= class399.field5703;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var44 <= ~var45[0] && ~var45[1] <= ~var44) {
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

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method3487(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class625.method3608(arg1, (byte) 114);
        ++field8465;
        int var7 = 0;
        int var8 = -arg3 + arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg5 == -7) {
            int var9 = arg1;
            int var10 = -arg1;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            int[] var15 = class193.field2839[arg4];
            int var16 = -var8 + arg6;
            int var17 = arg6 + var8;
            class518.method3153(var16, -arg1 + arg6, var15, -7, arg2);
            class518.method3153(var17, var16, var15, arg5, arg0);
            class518.method3153(arg1 + arg6, var17, var15, -7, arg2);
            while (~var9 < ~var7) {
                var13 += 2;
                var14 += 2;
                var12 += var14;
                var10 += var13;
                if (var12 >= 0 && ~var11 <= -2) {
                    class464.field6623[var11] = var7;
                    --var11;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    var10 -= var9 << 1;
                    if (~var8 < ~var9) {
                        int[] var18 = class193.field2839[arg4 + var9];
                        int[] var19 = class193.field2839[-var9 + arg4];
                        int var20 = class464.field6623[var9];
                        int var21 = arg6 + var7;
                        int var22 = -var7 + arg6;
                        int var23 = arg6 + var20;
                        int var24 = -var20 + arg6;
                        class518.method3153(var24, var22, var18, -7, arg2);
                        class518.method3153(var23, var24, var18, -7, arg0);
                        class518.method3153(var21, var23, var18, -7, arg2);
                        class518.method3153(var24, var22, var19, -7, arg2);
                        class518.method3153(var23, var24, var19, -7, arg0);
                        class518.method3153(var21, var23, var19, arg5, arg2);
                    } else {
                        int[] var25 = class193.field2839[arg4 + var9];
                        int[] var26 = class193.field2839[arg4 - var9];
                        int var27 = arg6 + var7;
                        int var28 = -var7 + arg6;
                        class518.method3153(var27, var28, var25, arg5, arg2);
                        class518.method3153(var27, var28, var26, -7, arg2);
                    }
                }
                int[] var29 = class193.field2839[arg4 - -var7];
                int[] var30 = class193.field2839[-var7 + arg4];
                int var31 = arg6 + var9;
                int var32 = -var9 + arg6;
                if (~var7 <= ~var8) {
                    class518.method3153(var31, var32, var29, -7, arg2);
                    class518.method3153(var31, var32, var30, -7, arg2);
                } else {
                    int var33 = ~var11 <= ~var7 ? var11 : class464.field6623[var7];
                    int var34 = arg6 + var33;
                    int var35 = -var33 + arg6;
                    class518.method3153(var35, var32, var29, arg5, arg2);
                    class518.method3153(var34, var35, var29, -7, arg0);
                    class518.method3153(var31, var34, var29, -7, arg2);
                    class518.method3153(var35, var32, var30, -7, arg2);
                    class518.method3153(var34, var35, var30, -7, arg0);
                    class518.method3153(var31, var34, var30, -7, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[[IBILjava/util/Random;)V")
    private final void method3488(int arg0, int arg1, int arg2, int[][] arg3, byte arg4, int arg5, Random arg6) {
        ++field8464;
        int var8 = ~this.field8467 < -1 ? 4096 - class151.method1094(arg6, 4, this.field8467) : 4096;
        int var9 = this.field8460 * this.field8456 >> 12;
        int var10 = this.field8456 - (var9 <= 0 ? 0 : class151.method1094(arg6, 4, var9));
        if (~arg0 <= ~class399.field5703) {
            arg0 -= class399.field5703;
        }
        if (var10 > 0) {
            if (~arg1 >= -1 || arg2 <= 0) {
                return;
            }
            int var11 = arg2 / 2;
            int var12 = arg1 / 2;
            int var13 = var10 <= var11 ? var10 : var11;
            int var14 = var12 >= var10 ? var10 : var12;
            int var15 = arg0 + var13;
            int var16 = -(var13 * 2) + arg2;
            for (int var17 = 0; arg1 > var17; ++var17) {
                int[] var18 = arg3[var17 - -arg5];
                if (~var17 > ~var14) {
                    int var19 = var8 * var17 / var14;
                    if (~this.field8453 != -1) {
                        for (int var20 = 0; var20 < var13; ++var20) {
                            int var21 = var8 * var20 / var13;
                            var18[class368.method2314(class423.field6029, arg0 + var20)] = var18[class368.method2314(arg0 - (-arg2 - -1) + -var20, class423.field6029)] = var19 <= var21 ? var19 : var21;
                        }
                    } else {
                        for (int var22 = 0; var13 > var22; ++var22) {
                            int var24 = var8 * var22 / var13;
                            var18[class368.method2314(arg0 + var22, class423.field6029)] = var18[class368.method2314(arg0 - -arg2 + -1 - var22, class423.field6029)] = var19 * var24 >> 12;
                        }
                    }
                    if (var15 + var16 <= class399.field5703) {
                        class85.method685(var18, var15, var16, var19);
                    } else {
                        int var23 = -var15 + class399.field5703;
                        class85.method685(var18, var15, var23, var19);
                        class85.method685(var18, 0, -var23 + var16, var19);
                    }
                } else {
                    int var25 = -var17 + arg1 - 1;
                    if (~var14 < ~var25) {
                        int var26 = var8 * var25 / var14;
                        if (~this.field8453 == -1) {
                            for (int var27 = 0; var27 < var13; ++var27) {
                                int var28 = var8 * var27 / var13;
                                var18[class368.method2314(arg0 + var27, class423.field6029)] = var18[class368.method2314(arg0 + -1 - -arg2 - var27, class423.field6029)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                int var31 = var8 * var29 / var13;
                                var18[class368.method2314(arg0 + var29, class423.field6029)] = var18[class368.method2314(class423.field6029, -var29 + arg0 + arg2 + -1)] = var31 >= var26 ? var26 : var31;
                            }
                        }
                        if (class399.field5703 >= var15 + var16) {
                            class85.method685(var18, var15, var16, var26);
                        } else {
                            int var30 = -var15 + class399.field5703;
                            class85.method685(var18, var15, var30, var26);
                            class85.method685(var18, 0, var16 - var30, var26);
                        }
                    } else {
                        for (int var32 = 0; ~var32 > ~var13; ++var32) {
                            var18[class368.method2314(arg0 + var32, class423.field6029)] = var18[class368.method2314(-var32 + arg2 + arg0 + -1, class423.field6029)] = var8 * var32 / var13;
                        }
                        if (class399.field5703 < var15 + var16) {
                            int var33 = -var15 + class399.field5703;
                            class85.method685(var18, var15, var33, var8);
                            class85.method685(var18, 0, -var33 + var16, var8);
                        } else {
                            class85.method685(var18, var15, var16, var8);
                        }
                    }
                }
            }
        } else if (~class399.field5703 <= ~(arg0 - -arg2)) {
            for (int var34 = 0; arg1 > var34; ++var34) {
                class85.method685(arg3[arg5 + var34], arg0, arg2, var8);
            }
        } else {
            int var35 = -arg0 + class399.field5703;
            for (int var36 = 0; arg1 > var36; ++var36) {
                int[] var37 = arg3[arg5 - -var36];
                class85.method685(var37, arg0, var35, var8);
                class85.method685(var37, 0, -var35 + arg2, var8);
            }
        }
        if (arg4 <= 33) {
            this.method3488(-57, 35, -99, (int[][]) null, (byte) 123, -20, (Random) null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class595() {
        super(0, true);
    }
}
