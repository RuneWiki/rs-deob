import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class186 extends class529 {

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "I")
    private int field2442 = 1024;

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "I")
    private int field2439 = 0;

    @OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
    private int field2445 = 409;

    @OriginalMember(owner = "client!pha", name = "N", descriptor = "I")
    private int field2448 = 0;

    @OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
    private int field2441 = 1024;

    @OriginalMember(owner = "client!pha", name = "L", descriptor = "I")
    private int field2446 = 1024;

    @OriginalMember(owner = "client!pha", name = "Q", descriptor = "I")
    private int field2451 = 819;

    @OriginalMember(owner = "client!pha", name = "M", descriptor = "I")
    private int field2447 = 1024;

    @OriginalMember(owner = "client!pha", name = "R", descriptor = "I")
    private int field2452 = 2048;

    @OriginalMember(owner = "client!pha", name = "F", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!pha", name = "I", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!pha", name = "J", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!pha", name = "O", descriptor = "I")
    private int field2449;

    @OriginalMember(owner = "client!pha", name = "P", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!pha", name = "S", descriptor = "Lsm;")
    public static class106 field2453;

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        if (arg0 <= -92) {
            ++field2450;
        }
    }

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "(I)V")
    public static void method1189(int arg0) {
        if (arg0 != 16702) {
            field2453 = null;
        }
        field2453 = null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field2444;
        int[] var3 = super.field7456.method1635(arg0, -124);
        if (super.field7456.field3449) {
            int[][] var4 = super.field7456.method1634((byte) -39);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class304.field3909 * this.field2442 >> 12;
            int var15 = class304.field3909 * this.field2452 >> 12;
            int var16 = class424.field6042 * this.field2445 >> 12;
            int var17 = class424.field6042 * this.field2451 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field2449 = class304.field3909 / 8 * this.field2446 >> 12;
            int var18 = class304.field3909 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2439);
            label126: while (true) {
                while (true) {
                    int var22 = var14 + class408.method2420((byte) 95, var21, -var14 + var15);
                    int var23 = var16 - -class408.method2420((byte) -127, var21, -var16 + var17);
                    int var24 = var8 + var22;
                    if (~class304.field3909 > ~var24) {
                        var24 = class304.field3909;
                        var22 = class304.field3909 - var8;
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
                            var28 += class304.field3909;
                        }
                        if (~var28 < ~class304.field3909) {
                            var28 -= class304.field3909;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && var30[1] >= var28) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class304.field3909;
                                    }
                                    if (~var31 < ~class304.field3909) {
                                        var31 -= class304.field3909;
                                    }
                                    for (int var32 = 1; var32 <= var27; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var27 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var29 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var28) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class304.field3909;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method1190(-var35 + var29, var4, -var38 + var39, var38 - -var7, -127, var21, var35);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var25;
                            if (var12 <= var25) {
                                var25 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (~class424.field6042 > ~(var23 + var29)) {
                        var23 = class424.field6042 - var29;
                    } else {
                        var10 = false;
                    }
                    if (class304.field3909 != var24) {
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var23 + var29;
                        var41[1] = var24;
                        this.method1190(var23, var4, var22, var6 + var8, -73, var21, var29);
                        var8 = var24;
                    } else {
                        this.method1190(var23, var4, var22, var8 - -var6, -56, var21, var29);
                        if (var10) {
                            break label126;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[1] = var24;
                        var42[2] = var23 + var29;
                        var42[0] = var8;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var7 = var6;
                        var13 = 0;
                        var6 = class408.method2420((byte) 79, var21, class304.field3909);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class304.field3909 + var5;
                        }
                        if (var44 > class304.field3909) {
                            var44 -= class304.field3909;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var45[0] >= ~var44 && ~var44 >= ~var45[1]) {
                                var11 = false;
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
        int var46 = 38 / ((arg1 - 27) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V")
    private final void method1190(int arg0, int[][] arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field2443;
        int var8 = this.field2441 <= 0 ? 4096 : 4096 - class408.method2420((byte) -120, arg5, this.field2441);
        int var9 = this.field2449 * this.field2447 >> 12;
        int var10 = this.field2449 + -(~var9 < -1 ? class408.method2420((byte) 40, arg5, var9) : 0);
        if (class304.field3909 <= arg3) {
            arg3 -= class304.field3909;
        }
        if (arg4 >= -55) {
            this.method190(-91, (byte) -74, (class179) null);
        }
        if (~var10 < -1) {
            if (~arg0 < -1 && ~arg2 < -1) {
                int var11 = arg2 / 2;
                int var12 = arg0 / 2;
                int var13 = ~var11 <= ~var10 ? var10 : var11;
                int var14 = ~var12 <= ~var10 ? var10 : var12;
                int var15 = arg3 + var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; ~arg0 < ~var17; ++var17) {
                    int[] var18 = arg1[var17 - -arg6];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field2448 != -1) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class272.method1629(class404.field5700, arg3 + var20)] = var18[class272.method1629(arg2 + arg3 + -var20 + -1, class404.field5700)] = var19 <= var21 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class272.method1629(arg3 + var22, class404.field5700)] = var18[class272.method1629(arg2 + arg3 - var22 + -1, class404.field5700)] = var19 * var24 >> 12;
                            }
                        }
                        if (~(var15 + var16) < ~class304.field3909) {
                            int var23 = -var15 + class304.field3909;
                            class617.method3388(var18, var15, var23, var19);
                            class617.method3388(var18, 0, -var23 + var16, var19);
                        } else {
                            class617.method3388(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg0 - var17 - 1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field2448 != 0) {
                                for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class272.method1629(arg3 - -var27, class404.field5700)] = var18[class272.method1629(-var27 - 1 + arg2 + arg3, class404.field5700)] = ~var28 > ~var26 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; var13 > var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class272.method1629(arg3 + var29, class404.field5700)] = var18[class272.method1629(class404.field5700, -var29 + arg3 + -1 + arg2)] = var26 * var31 >> 12;
                                }
                            }
                            if (~(var15 - -var16) < ~class304.field3909) {
                                int var30 = -var15 + class304.field3909;
                                class617.method3388(var18, var15, var30, var26);
                                class617.method3388(var18, 0, -var30 + var16, var26);
                            } else {
                                class617.method3388(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class272.method1629(class404.field5700, arg3 + var32)] = var18[class272.method1629(class404.field5700, arg3 - var32 + arg2 + -1)] = var8 * var32 / var13;
                            }
                            if (~(var15 + var16) < ~class304.field3909) {
                                int var33 = -var15 + class304.field3909;
                                class617.method3388(var18, var15, var33, var8);
                                class617.method3388(var18, 0, var16 - var33, var8);
                            } else {
                                class617.method3388(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class304.field3909 <= ~(arg2 + arg3)) {
            for (int var34 = 0; var34 < arg0; ++var34) {
                class617.method3388(arg1[arg6 + var34], arg3, arg2, var8);
            }
        } else {
            int var35 = -arg3 + class304.field3909;
            for (int var36 = 0; arg0 > var36; ++var36) {
                int[] var37 = arg1[arg6 + var36];
                class617.method3388(var37, arg3, var35, var8);
                class617.method3388(var37, 0, arg2 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field2440;
        if (arg1 < 45) {
            this.field2449 = -91;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field2441 = arg2.method1107(false);
                                        }
                                    } else {
                                        this.field2447 = arg2.method1107(false);
                                    }
                                } else {
                                    this.field2448 = arg2.method1094(255);
                                }
                            } else {
                                this.field2446 = arg2.method1107(false);
                            }
                        } else {
                            this.field2451 = arg2.method1107(false);
                        }
                    } else {
                        this.field2445 = arg2.method1107(false);
                    }
                } else {
                    this.field2452 = arg2.method1107(false);
                }
            } else {
                this.field2442 = arg2.method1107(false);
            }
        } else {
            this.field2439 = arg2.method1094(255);
        }
    }
}
