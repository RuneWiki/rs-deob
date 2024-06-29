import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class255 extends class601 {

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
    private int field3454 = 1024;

    @OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
    private int field3457 = 819;

    @OriginalMember(owner = "client!uea", name = "M", descriptor = "I")
    private int field3459 = 2048;

    @OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
    private int field3456 = 0;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
    private int field3455 = 409;

    @OriginalMember(owner = "client!uea", name = "N", descriptor = "I")
    private int field3460 = 0;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "I")
    private int field3464 = 1024;

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "I")
    private int field3462 = 1024;

    @OriginalMember(owner = "client!uea", name = "T", descriptor = "I")
    private int field3466 = 1024;

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!uea", name = "O", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!uea", name = "S", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/util/Random;I[[IIIII)V", line = 6)
    private final void method1646(Random arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3465;
        int var8 = ~this.field3462 >= -1 ? 4096 : 4096 - class419.method2416(this.field3462, arg0, (byte) 44);
        int var9 = -128 % ((-4 - arg3) / 57);
        int var10 = this.field3466 * this.field3458 >> 12;
        int var11 = this.field3458 + -(~var10 < -1 ? class419.method2416(var10, arg0, (byte) 65) : 0);
        if (arg5 >= class418.field5518) {
            arg5 -= class418.field5518;
        }
        if (var11 <= 0) {
            if (class418.field5518 >= arg5 + arg6) {
                for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                    class642.method3478(arg2[arg1 - -var12], arg5, arg6, var8);
                }
            } else {
                int var13 = -arg5 + class418.field5518;
                for (int var14 = 0; var14 < arg4; ++var14) {
                    int[] var15 = arg2[arg1 + var14];
                    class642.method3478(var15, arg5, var13, var8);
                    class642.method3478(var15, 0, arg6 - var13, var8);
                }
            }
        } else if (arg4 > 0 && ~arg6 < -1) {
            int var16 = arg6 / 2;
            int var17 = arg4 / 2;
            int var18 = ~var11 < ~var16 ? var16 : var11;
            int var19 = ~var17 <= ~var11 ? var11 : var17;
            int var20 = arg5 + var18;
            int var21 = arg6 - var18 * 2;
            for (int var22 = 0; var22 < arg4; ++var22) {
                int[] var23 = arg2[arg1 + var22];
                if (~var19 < ~var22) {
                    int var24 = var8 * var22 / var19;
                    if (this.field3456 == 0) {
                        for (int var25 = 0; ~var18 < ~var25; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class249.method1625(arg5 + var25, class511.field6519)] = var23[class249.method1625(class511.field6519, arg5 - 1 + -var25 + arg6)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var27 < var18; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class249.method1625(class511.field6519, arg5 + var27)] = var23[class249.method1625(arg5 + arg6 - (var27 - -1), class511.field6519)] = ~var24 < ~var29 ? var29 : var24;
                        }
                    }
                    if (~(var20 + var21) < ~class418.field5518) {
                        int var28 = -var20 + class418.field5518;
                        class642.method3478(var23, var20, var28, var24);
                        class642.method3478(var23, 0, -var28 + var21, var24);
                    } else {
                        class642.method3478(var23, var20, var21, var24);
                    }
                } else {
                    int var30 = -var22 + arg4 + -1;
                    if (~var19 < ~var30) {
                        int var31 = var8 * var30 / var19;
                        if (~this.field3456 == -1) {
                            for (int var32 = 0; ~var18 < ~var32; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class249.method1625(class511.field6519, arg5 + var32)] = var23[class249.method1625(class511.field6519, -var32 + arg5 + arg6 + -1)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; ~var18 < ~var34; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class249.method1625(arg5 - -var34, class511.field6519)] = var23[class249.method1625(class511.field6519, arg5 - 1 + -var34 + arg6)] = ~var31 >= ~var36 ? var31 : var36;
                            }
                        }
                        if (var20 + var21 > class418.field5518) {
                            int var35 = -var20 + class418.field5518;
                            class642.method3478(var23, var20, var35, var31);
                            class642.method3478(var23, 0, var21 - var35, var31);
                        } else {
                            class642.method3478(var23, var20, var21, var31);
                        }
                    } else {
                        for (int var37 = 0; ~var18 < ~var37; ++var37) {
                            var23[class249.method1625(class511.field6519, arg5 - -var37)] = var23[class249.method1625(-var37 + arg6 + arg5 + -1, class511.field6519)] = var8 * var37 / var18;
                        }
                        if (~(var20 - -var21) < ~class418.field5518) {
                            int var38 = -var20 + class418.field5518;
                            class642.method3478(var23, var20, var38, var8);
                            class642.method3478(var23, 0, var21 - var38, var8);
                        } else {
                            class642.method3478(var23, var20, var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lmc;II)V", line = 201)
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field3463;
        int var4 = 57 / ((40 - arg2) / 52);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field3462 = arg0.method1553((byte) 122);
                                        }
                                    } else {
                                        this.field3466 = arg0.method1553((byte) 46);
                                    }
                                } else {
                                    this.field3456 = arg0.method1509(true);
                                }
                            } else {
                                this.field3464 = arg0.method1553((byte) -124);
                            }
                        } else {
                            this.field3457 = arg0.method1553((byte) -128);
                        }
                    } else {
                        this.field3455 = arg0.method1553((byte) 32);
                    }
                } else {
                    this.field3459 = arg0.method1553((byte) -121);
                }
            } else {
                this.field3454 = arg0.method1553((byte) 30);
            }
        } else {
            this.field3460 = arg0.method1509(true);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB)[I", line = 295)
    public final int[] method261(int arg0, byte arg1) {
        ++field3461;
        if (arg1 > -76) {
            this.field3459 = -106;
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[][] var4 = super.field7643.method2053((byte) -112);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class418.field5518 * this.field3454 >> 12;
            int var15 = class418.field5518 * this.field3459 >> 12;
            int var16 = class418.field5514 * this.field3455 >> 12;
            int var17 = class418.field5514 * this.field3457 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field3458 = class418.field5518 / 8 * this.field3464 >> 12;
                int var18 = class418.field5518 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3460);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class419.method2416(-var14 + var15, var21, (byte) 61);
                        int var23 = class419.method2416(-var16 + var17, var21, (byte) 117) + var16;
                        int var24 = var8 + var22;
                        if (class418.field5518 < var24) {
                            var22 = -var8 + class418.field5518;
                            var24 = class418.field5518;
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
                                var29 += class418.field5518;
                            }
                            if (var29 > class418.field5518) {
                                var29 -= class418.field5518;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && ~var29 >= ~var30[1]) {
                                    var25 = var27[2];
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class418.field5518;
                                        }
                                        if (class418.field5518 < var31) {
                                            var31 -= class418.field5518;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class418.field5518;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1646(var21, var35, var4, -128, -var35 + var25, var7 + var38, var39 - var38);
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
                        if (~class418.field5514 <= ~(var23 + var25)) {
                            var10 = false;
                        } else {
                            var23 = class418.field5514 - var25;
                        }
                        if (~class418.field5518 == ~var24) {
                            this.method1646(var21, var25, var4, -77, var23, var6 + var8, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class419.method2416(class418.field5518, var21, (byte) 95);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class418.field5518 + var5;
                            }
                            if (~class418.field5518 > ~var43) {
                                var43 -= class418.field5518;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[0] = var8;
                            var45[2] = var25 - -var23;
                            this.method1646(var21, var25, var4, 65, var23, var6 + var8, var22);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V", line = 559)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V", line = 576)
    public final void method292(byte arg0) {
        if (arg0 <= 44) {
            this.field3458 = -2;
        }
        ++field3453;
    }
}
