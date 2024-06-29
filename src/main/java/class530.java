import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class530 extends class478 {

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
    private int field7452 = 819;

    @OriginalMember(owner = "client!iw", name = "I", descriptor = "I")
    private int field7458 = 409;

    @OriginalMember(owner = "client!iw", name = "D", descriptor = "I")
    private int field7453 = 1024;

    @OriginalMember(owner = "client!iw", name = "K", descriptor = "I")
    private int field7460 = 2048;

    @OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
    private int field7459 = 1024;

    @OriginalMember(owner = "client!iw", name = "O", descriptor = "I")
    private int field7464 = 1024;

    @OriginalMember(owner = "client!iw", name = "H", descriptor = "I")
    private int field7457 = 1024;

    @OriginalMember(owner = "client!iw", name = "S", descriptor = "I")
    private int field7468 = 0;

    @OriginalMember(owner = "client!iw", name = "Q", descriptor = "I")
    private int field7466 = 0;

    @OriginalMember(owner = "client!iw", name = "U", descriptor = "I")
    public static int field7470 = 0;

    @OriginalMember(owner = "client!iw", name = "G", descriptor = "Lcq;")
    public static class110 field7456 = new class110(47, 3);

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!iw", name = "L", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!iw", name = "M", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!iw", name = "N", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!iw", name = "P", descriptor = "I")
    private int field7465;

    @OriginalMember(owner = "client!iw", name = "R", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!iw", name = "T", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!iw", name = "F", descriptor = "J")
    public static long field7455;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field7454;
        if (arg1 != -11323) {
            return null;
        } else {
            int[] var3 = super.field6886.method789(arg0, (byte) -41);
            if (super.field6886.field1592) {
                int[][] var4 = super.field6886.method791(1);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class436.field6154 * this.field7464 >> 12;
                int var15 = class436.field6154 * this.field7460 >> 12;
                int var16 = class407.field5435 * this.field7458 >> 12;
                int var17 = class407.field5435 * this.field7452 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field7465 = class436.field6154 / 8 * this.field7453 >> 12;
                    int var18 = 1 - -(class436.field6154 / var14);
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field7466);
                    while (true) {
                        while (true) {
                            int var22 = var14 - -class304.method1756(var21, -var14 + var15, -1304107232);
                            int var23 = class304.method1756(var21, var17 - var16, -1304107232) + var16;
                            int var24 = var8 + var22;
                            if (~class436.field6154 > ~var24) {
                                var24 = class436.field6154;
                                var22 = -var8 + class436.field6154;
                            }
                            int var29;
                            if (var11) {
                                var29 = 0;
                            } else {
                                int var25 = var9;
                                int[] var26 = var20[var9];
                                int var27 = 0;
                                int var28 = var5 + var24;
                                if (~var28 > -1) {
                                    var28 += class436.field6154;
                                }
                                if (var28 > class436.field6154) {
                                    var28 -= class436.field6154;
                                }
                                var29 = var26[2];
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (~var28 <= ~var30[0] && var30[1] >= var28) {
                                        if (~var9 != ~var25) {
                                            int var31 = var5 + var8;
                                            if (~var31 > -1) {
                                                var31 += class436.field6154;
                                            }
                                            if (~class436.field6154 > ~var31) {
                                                var31 -= class436.field6154;
                                            }
                                            for (int var32 = 1; var32 <= var27; ++var32) {
                                                int[] var40 = var20[(var9 + var32) % var12];
                                                var29 = Math.max(var29, var40[2]);
                                            }
                                            for (int var33 = 0; var27 >= var33; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var12];
                                                int var35 = var34[2];
                                                if (~var29 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var28 > var31) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var28, var37);
                                                    } else if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class436.field6154;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    }
                                                    this.method2977(arg1 + 31869, var35, var38 - -var7, var21, -var35 + var29, -var38 + var39, var4);
                                                }
                                            }
                                        }
                                        var9 = var25;
                                        break;
                                    }
                                    ++var27;
                                    int var10000 = ~var12;
                                    ++var25;
                                    if (var10000 >= ~var25) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (~class407.field5435 <= ~(var29 - -var23)) {
                                var10 = false;
                            } else {
                                var23 = class407.field5435 - var29;
                            }
                            if (~class436.field6154 == ~var24) {
                                this.method2977(20546, var29, var6 + var8, var21, var23, var22, var4);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var41 = var19[var13++];
                                var41[0] = var8;
                                var41[2] = var23 + var29;
                                var41[1] = var24;
                                int[][] var42 = var20;
                                var20 = var19;
                                var19 = var42;
                                var12 = var13;
                                var7 = var6;
                                var13 = 0;
                                var6 = class304.method1756(var21, class436.field6154, -1304107232);
                                var8 = 0;
                                var5 = -var7 + var6;
                                int var43 = var5;
                                if (~var5 > -1) {
                                    var43 = class436.field6154 + var5;
                                }
                                var9 = 0;
                                if (~var43 < ~class436.field6154) {
                                    var43 -= class436.field6154;
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
                                var45[2] = var23 + var29;
                                var45[0] = var8;
                                var45[1] = var24;
                                this.method2977(20546, var29, var8 - -var6, var21, var23, var22, var4);
                                var8 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
    public static final void method2975(byte arg0) {
        ++field7467;
        if (class39.field394 != null) {
            class39.field394.method3553((byte) -29);
        }
        if (class637.field8964 != null) {
            class637.field8964.method3553((byte) -29);
        }
        if (arg0 <= 65) {
            field7470 = 23;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IILvj;Z[IZ)Lbr;")
    public static final class196 method2976(int arg0, int arg1, class422 arg2, boolean arg3, int[] arg4, boolean arg5) {
        if (!arg3) {
            method2976(-47, 88, (class422) null, false, (int[]) null, true);
        }
        ++field7461;
        if (!arg2.field5966 && (!class483.method2792(arg1, -3) || !class483.method2792(arg0, -3))) {
            return !arg2.field5919 ? new class196(arg2, arg1, arg0, class553.method3138(1781323777, arg1), class553.method3138(1781323777, arg0), arg4) : new class196(arg2, 34037, arg1, arg0, arg5, arg4);
        } else {
            return new class196(arg2, 3553, arg1, arg0, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
    public class530() {
        super(0, true);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        ++field7469;
        if (arg0 != 23) {
            method2976(-126, 58, (class422) null, true, (int[]) null, false);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            method2975((byte) -107);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field7459 = arg1.method643((byte) -77);
                                        }
                                    } else {
                                        this.field7457 = arg1.method643((byte) -77);
                                    }
                                } else {
                                    this.field7468 = arg1.method620((byte) 1);
                                }
                            } else {
                                this.field7453 = arg1.method643((byte) -77);
                            }
                        } else {
                            this.field7452 = arg1.method643((byte) -77);
                        }
                    } else {
                        this.field7458 = arg1.method643((byte) -77);
                    }
                } else {
                    this.field7460 = arg1.method643((byte) -77);
                }
            } else {
                this.field7464 = arg1.method643((byte) -77);
            }
        } else {
            this.field7466 = arg1.method620((byte) -126);
        }
        ++field7451;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V")
    private final void method2977(int arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int[][] arg6) {
        ++field7463;
        if (arg0 != 20546) {
            this.method35(74, 111);
        }
        int var8 = this.field7459 <= 0 ? 4096 : -class304.method1756(arg3, this.field7459, arg0 + -1304127778) + 4096;
        int var9 = this.field7465 * this.field7457 >> 12;
        int var10 = this.field7465 - (var9 <= 0 ? 0 : class304.method1756(arg3, var9, arg0 + -1304127778));
        if (~arg2 <= ~class436.field6154) {
            arg2 -= class436.field6154;
        }
        if (var10 <= 0) {
            if (~(arg2 - -arg5) >= ~class436.field6154) {
                for (int var11 = 0; var11 < arg4; ++var11) {
                    class567.method3217(arg6[arg1 + var11], arg2, arg5, var8);
                }
            } else {
                int var12 = -arg2 + class436.field6154;
                for (int var13 = 0; arg4 > var13; ++var13) {
                    int[] var14 = arg6[arg1 - -var13];
                    class567.method3217(var14, arg2, var12, var8);
                    class567.method3217(var14, 0, arg5 - var12, var8);
                }
            }
        } else if (arg4 > 0 && arg5 > 0) {
            int var15 = arg5 / 2;
            int var16 = arg4 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg2 - -var17;
            int var20 = -(var17 * 2) + arg5;
            for (int var21 = 0; ~arg4 < ~var21; ++var21) {
                int[] var22 = arg6[var21 - -arg1];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field7468 == 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class105.method572(class204.field2414, arg2 + var24)] = var22[class105.method572(arg2 + arg5 + -1 + -var24, class204.field2414)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class105.method572(class204.field2414, arg2 + var26)] = var22[class105.method572(class204.field2414, -var26 - 1 + arg2 + arg5)] = var23 > var28 ? var28 : var23;
                        }
                    }
                    if (var19 + var20 > class436.field6154) {
                        int var27 = -var19 + class436.field6154;
                        class567.method3217(var22, var19, var27, var23);
                        class567.method3217(var22, 0, -var27 + var20, var23);
                    } else {
                        class567.method3217(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg4 + -1 + -var21;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field7468 != -1) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class105.method572(class204.field2414, arg2 - -var31)] = var22[class105.method572(class204.field2414, -var31 + -1 + arg5 + arg2)] = ~var32 > ~var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class105.method572(arg2 + var33, class204.field2414)] = var22[class105.method572(class204.field2414, arg2 + -1 + arg5 + -var33)] = var30 * var35 >> 12;
                            }
                        }
                        if (~(var19 + var20) < ~class436.field6154) {
                            int var34 = -var19 + class436.field6154;
                            class567.method3217(var22, var19, var34, var30);
                            class567.method3217(var22, 0, var20 - var34, var30);
                        } else {
                            class567.method3217(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class105.method572(class204.field2414, arg2 + var36)] = var22[class105.method572(arg2 + arg5 - (var36 + 1), class204.field2414)] = var8 * var36 / var17;
                        }
                        if (class436.field6154 < var19 - -var20) {
                            int var37 = class436.field6154 - var19;
                            class567.method3217(var22, var19, var37, var8);
                            class567.method3217(var22, 0, -var37 + var20, var8);
                        } else {
                            class567.method3217(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
    public static void method2978(int arg0) {
        field7456 = null;
        if (arg0 != 34037) {
            method2976(125, -99, (class422) null, true, (int[]) null, false);
        }
    }
}
