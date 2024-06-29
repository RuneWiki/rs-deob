import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class190 extends class192 {

    @OriginalMember(owner = "client!mfa", name = "O", descriptor = "I")
    private int field2428 = 819;

    @OriginalMember(owner = "client!mfa", name = "P", descriptor = "I")
    private int field2429 = 0;

    @OriginalMember(owner = "client!mfa", name = "K", descriptor = "I")
    private int field2424 = 1024;

    @OriginalMember(owner = "client!mfa", name = "R", descriptor = "I")
    private int field2431 = 1024;

    @OriginalMember(owner = "client!mfa", name = "S", descriptor = "I")
    private int field2432 = 1024;

    @OriginalMember(owner = "client!mfa", name = "X", descriptor = "I")
    private int field2437 = 0;

    @OriginalMember(owner = "client!mfa", name = "N", descriptor = "I")
    private int field2427 = 1024;

    @OriginalMember(owner = "client!mfa", name = "J", descriptor = "I")
    private int field2423 = 409;

    @OriginalMember(owner = "client!mfa", name = "Z", descriptor = "I")
    private int field2439 = 2048;

    @OriginalMember(owner = "client!mfa", name = "L", descriptor = "Lra;")
    public static class361 field2425 = new class361(78, 11);

    @OriginalMember(owner = "client!mfa", name = "Y", descriptor = "Lra;")
    public static class361 field2438 = new class361(40, 2);

    @OriginalMember(owner = "client!mfa", name = "U", descriptor = "F")
    public static float field2434;

    @OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!mfa", name = "M", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!mfa", name = "Q", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!mfa", name = "T", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!mfa", name = "V", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!mfa", name = "W", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field2436;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 > -123) {
            this.method118(-37, (byte) -105);
        }
        if (super.field2448.field7266) {
            int[][] var4 = super.field2448.method2974(30455);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class561.field7319 * this.field2431 >> 12;
            int var15 = class561.field7319 * this.field2439 >> 12;
            int var16 = class505.field6643 * this.field2423 >> 12;
            int var17 = class505.field6643 * this.field2428 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field2422 = class561.field7319 / 8 * this.field2424 >> 12;
                int var18 = class561.field7319 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2437);
                while (true) {
                    while (true) {
                        int var22 = class562.method3002((byte) -14, var21, var15 - var14) + var14;
                        int var23 = class562.method3002((byte) -14, var21, -var16 + var17) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class561.field7319) {
                            var22 = -var8 + class561.field7319;
                            var24 = class561.field7319;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class561.field7319;
                            }
                            if (class561.field7319 < var28) {
                                var28 -= class561.field7319;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (~var29[0] >= ~var28 && var28 <= var29[1]) {
                                    var30 = var26[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class561.field7319;
                                        }
                                        if (~class561.field7319 > ~var31) {
                                            var31 -= class561.field7319;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var28 <= var31) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class561.field7319;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1245(-var38 + var39, var35, var7 + var38, -var35 + var30, -123, var21, var4);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (~class505.field6643 > ~(var23 + var30)) {
                            var23 = -var30 + class505.field6643;
                        } else {
                            var10 = false;
                        }
                        if (class561.field7319 != var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[2] = var23 + var30;
                            var41[0] = var8;
                            this.method1245(var22, var30, var6 + var8, var23, -49, var21, var4);
                            var8 = var24;
                        } else {
                            this.method1245(var22, var30, var6 + var8, var23, -123, var21, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[0] = var8;
                            var42[1] = var24;
                            var42[2] = var23 + var30;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var7 = var6;
                            var13 = 0;
                            var6 = class562.method3002((byte) -14, var21, class561.field7319);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class561.field7319 + var5;
                            }
                            if (~var44 < ~class561.field7319) {
                                var44 -= class561.field7319;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var44 <= ~var45[0] && ~var44 >= ~var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
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

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        ++field2430;
        if (arg0 != 63) {
            this.field2437 = -61;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIIILjava/util/Random;[[I)V")
    private final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int[][] arg6) {
        ++field2435;
        int var8 = ~this.field2432 >= -1 ? 4096 : -class562.method3002((byte) -14, arg5, this.field2432) + 4096;
        int var9 = this.field2427 * this.field2422 >> 12;
        int var10 = -96 % ((arg4 - -85) / 36);
        int var11 = this.field2422 + -(~var9 >= -1 ? 0 : class562.method3002((byte) -14, arg5, var9));
        if (arg2 >= class561.field7319) {
            arg2 -= class561.field7319;
        }
        if (~var11 < -1) {
            if (arg3 > 0 && arg0 > 0) {
                int var12 = arg0 / 2;
                int var13 = arg3 / 2;
                int var14 = ~var12 <= ~var11 ? var11 : var12;
                int var15 = ~var11 < ~var13 ? var13 : var11;
                int var16 = arg2 + var14;
                int var17 = -(var14 * 2) + arg0;
                for (int var18 = 0; arg3 > var18; ++var18) {
                    int[] var19 = arg6[arg1 + var18];
                    if (~var15 < ~var18) {
                        int var20 = var8 * var18 / var15;
                        if (this.field2429 == 0) {
                            for (int var21 = 0; var21 < var14; ++var21) {
                                int var22 = var8 * var21 / var14;
                                var19[class597.method3238(arg2 - -var21, class337.field4356)] = var19[class597.method3238(class337.field4356, -var21 + arg0 + -1 + arg2)] = var20 * var22 >> 12;
                            }
                        } else {
                            for (int var23 = 0; var23 < var14; ++var23) {
                                int var25 = var8 * var23 / var14;
                                var19[class597.method3238(arg2 - -var23, class337.field4356)] = var19[class597.method3238(-var23 + -1 + arg0 + arg2, class337.field4356)] = var25 < var20 ? var25 : var20;
                            }
                        }
                        if (~(var16 - -var17) < ~class561.field7319) {
                            int var24 = -var16 + class561.field7319;
                            class443.method2511(var19, var16, var24, var20);
                            class443.method2511(var19, 0, var17 - var24, var20);
                        } else {
                            class443.method2511(var19, var16, var17, var20);
                        }
                    } else {
                        int var26 = arg3 - var18 + -1;
                        if (var26 < var15) {
                            int var27 = var8 * var26 / var15;
                            if (this.field2429 != 0) {
                                for (int var28 = 0; ~var28 > ~var14; ++var28) {
                                    int var29 = var8 * var28 / var14;
                                    var19[class597.method3238(class337.field4356, arg2 - -var28)] = var19[class597.method3238(arg0 + arg2 - var28 + -1, class337.field4356)] = var27 <= var29 ? var27 : var29;
                                }
                            } else {
                                for (int var30 = 0; var30 < var14; ++var30) {
                                    int var32 = var8 * var30 / var14;
                                    var19[class597.method3238(class337.field4356, arg2 + var30)] = var19[class597.method3238(class337.field4356, arg2 - -arg0 + -var30 + -1)] = var27 * var32 >> 12;
                                }
                            }
                            if (~(var16 + var17) >= ~class561.field7319) {
                                class443.method2511(var19, var16, var17, var27);
                            } else {
                                int var31 = -var16 + class561.field7319;
                                class443.method2511(var19, var16, var31, var27);
                                class443.method2511(var19, 0, -var31 + var17, var27);
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var14; ++var33) {
                                var19[class597.method3238(arg2 - -var33, class337.field4356)] = var19[class597.method3238(-var33 + arg2 + arg0 + -1, class337.field4356)] = var8 * var33 / var14;
                            }
                            if (class561.field7319 >= var16 - -var17) {
                                class443.method2511(var19, var16, var17, var8);
                            } else {
                                int var34 = -var16 + class561.field7319;
                                class443.method2511(var19, var16, var34, var8);
                                class443.method2511(var19, 0, -var34 + var17, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class561.field7319 <= ~(arg2 - -arg0)) {
            for (int var35 = 0; ~arg3 < ~var35; ++var35) {
                class443.method2511(arg6[arg1 - -var35], arg2, arg0, var8);
            }
        } else {
            int var36 = -arg2 + class561.field7319;
            for (int var37 = 0; arg3 > var37; ++var37) {
                int[] var38 = arg6[arg1 + var37];
                class443.method2511(var38, arg2, var36, var8);
                class443.method2511(var38, 0, arg0 - var36, var8);
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(I)V")
    public static void method1246(int arg0) {
        field2438 = null;
        field2425 = null;
        if (arg0 != 0) {
            field2438 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIILtc;ILoa;IILfa;)V")
    public static final void method1247(int arg0, int arg1, int arg2, class477 arg3, int arg4, class43 arg5, int arg6, int arg7, class619 arg8) {
        ++field2433;
        class576 var9 = class650.field9060.method2291((byte) 113, arg6);
        if (arg2 != 1) {
            field2438 = null;
        }
        if (var9 != null && var9.field7842 && var9.method3147(class397.field5054, (byte) 69)) {
            if (var9.field7805 != null) {
                int[] var10 = new int[var9.field7805.length];
                for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                    int var13;
                    if (~class704.field9810 == -5) {
                        var13 = 16383 & (int) class141.field1859;
                    } else {
                        var13 = (int) class141.field1859 + class7.field56 & 16383;
                    }
                    int var14 = class237.field3193[var13];
                    int var15 = class237.field3196[var13];
                    if (class704.field9810 != 4) {
                        var15 = var15 * 256 / (class279.field3653 + 256);
                        var14 = var14 * 256 / (class279.field3653 + 256);
                    }
                    var10[var11 * 2] = ((arg4 - -(var9.field7805[var11 * 2 - -1] * 4)) * var14 + (var9.field7805[var11 * 2] * 4 + arg0) * var15 >> 14) + arg3.field6372 / 2 + arg7;
                    var10[var11 * 2 + 1] = arg3.field6224 / 2 + (arg1 - ((var9.field7805[var11 * 2 + 1] * 4 + arg4) * var15 - (var9.field7805[var11 * 2] * 4 + arg0) * var14 >> 14));
                }
                class551.method2920(arg5, var10, var9.field7826, arg3.field6300, arg3.field6344);
                for (int var12 = 0; ~var12 > ~(var10.length / 2 + -1); ++var12) {
                    arg5.method409(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 1 - -2], var9.field7836, 1, arg8, arg7, arg1);
                }
                arg5.method409(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field7836, 1, arg8, arg7, arg1);
            }
            class511 var16 = null;
            if (var9.field7816 != -1) {
                var16 = var9.method3155(arg2 + -46, arg5, false);
                if (var16 != null) {
                    class60.method508(var16, arg1, arg8, arg4, arg3, arg0, arg7, arg2 + -3469);
                }
            }
            if (var9.field7841 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method607();
                }
                class597 var18 = class305.field4015;
                class547 var19 = class47.field665;
                if (~var9.field7821 == -2) {
                    var18 = class562.field7337;
                    var19 = class401.field5111;
                }
                if (~var9.field7821 == -3) {
                    var19 = class411.field5305;
                    var18 = class456.field5983;
                }
                class63.method534(arg4, var18, arg8, arg1, var9.field7838, arg0, var19, 69, arg7, var17, arg3, var9.field7841);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 == -12160) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (~arg0 != -8) {
                                            if (~arg0 == -9) {
                                                this.field2432 = arg1.method2393(-30727);
                                            }
                                        } else {
                                            this.field2427 = arg1.method2393(arg2 + -18567);
                                        }
                                    } else {
                                        this.field2429 = arg1.method2396(69);
                                    }
                                } else {
                                    this.field2424 = arg1.method2393(arg2 + -18567);
                                }
                            } else {
                                this.field2428 = arg1.method2393(-30727);
                            }
                        } else {
                            this.field2423 = arg1.method2393(-30727);
                        }
                    } else {
                        this.field2439 = arg1.method2393(-30727);
                    }
                } else {
                    this.field2431 = arg1.method2393(-30727);
                }
            } else {
                this.field2437 = arg1.method2396(64);
            }
            ++field2426;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, true);
    }
}
