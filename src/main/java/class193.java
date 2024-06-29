import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class193 extends class371 {

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    private int field2906 = 409;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    private int field2904 = 0;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    private int field2909 = 0;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    private int field2907 = 1024;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    private int field2914 = 1024;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    private int field2908 = 1024;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    private int field2916 = 2048;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    private int field2911 = 1024;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    private int field2917 = 819;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public final void method212(int arg0) {
        if (arg0 == -19103) {
            ++field2915;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field2913;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field2907 = arg2.method2620(122);
                                        }
                                    } else {
                                        this.field2911 = arg2.method2620(60);
                                    }
                                } else {
                                    this.field2904 = arg2.method2561((byte) 116);
                                }
                            } else {
                                this.field2908 = arg2.method2620(74);
                            }
                        } else {
                            this.field2917 = arg2.method2620(86);
                        }
                    } else {
                        this.field2906 = arg2.method2620(97);
                    }
                } else {
                    this.field2916 = arg2.method2620(39);
                }
            } else {
                this.field2914 = arg2.method2620(26);
            }
        } else {
            this.field2909 = arg2.method2561((byte) -79);
        }
        int var5 = -113 % ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field2910;
        int[] var3 = super.field5378.method1451(4, arg1);
        if (super.field5378.field3254) {
            int[][] var4 = super.field5378.method1448(42);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class41.field455 * this.field2914 >> 12;
            int var15 = class41.field455 * this.field2916 >> 12;
            int var16 = class23.field201 * this.field2906 >> 12;
            int var17 = class23.field201 * this.field2917 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field2912 = class41.field455 / 8 * this.field2908 >> 12;
                int var18 = class41.field455 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2909);
                while (true) {
                    while (true) {
                        int var22 = var14 + class296.method1832(false, -var14 + var15, var21);
                        int var23 = class296.method1832(false, -var16 + var17, var21) + var16;
                        int var24 = var8 + var22;
                        if (class41.field455 < var24) {
                            var22 = -var8 + class41.field455;
                            var24 = class41.field455;
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
                                var29 += class41.field455;
                            }
                            if (class41.field455 < var29) {
                                var29 -= class41.field455;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && ~var30[1] <= ~var29) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class41.field455;
                                        }
                                        if (class41.field455 < var31) {
                                            var31 -= class41.field455;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var29 > var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class41.field455;
                                                }
                                                this.method1249(var7 + var38, -var35 + var25, 0, var4, var35, var21, -var38 + var39);
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
                        if (var23 + var25 <= class23.field201) {
                            var10 = false;
                        } else {
                            var23 = class23.field201 - var25;
                        }
                        if (class41.field455 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method1249(var6 + var8, var23, 0, var4, var25, var21, var22);
                            var8 = var24;
                        } else {
                            this.method1249(var6 + var8, var23, 0, var4, var25, var21, var22);
                            if (var10) {
                                return arg0 > -80 ? null : var3;
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
                            var7 = var6;
                            var13 = 0;
                            var6 = class296.method1832(false, class41.field455, var21);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class41.field455 + var5;
                            }
                            var9 = 0;
                            if (class41.field455 < var44) {
                                var44 -= class41.field455;
                            }
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && ~var44 >= ~var45[1]) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg0 > -80 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
    private final void method1249(int arg0, int arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        ++field2905;
        int var8 = this.field2907 > 0 ? -class296.method1832(false, this.field2907, arg5) + 4096 : 4096;
        int var9 = this.field2912 * this.field2911 >> 12;
        int var10 = this.field2912 - (arg2 < var9 ? class296.method1832(false, var9, arg5) : 0);
        if (class41.field455 <= arg0) {
            arg0 -= class41.field455;
        }
        if (~var10 >= -1) {
            if (class41.field455 < arg0 + arg6) {
                int var11 = class41.field455 - arg0;
                for (int var12 = 0; arg1 > var12; ++var12) {
                    int[] var13 = arg3[arg4 + var12];
                    class473.method2881(var13, arg0, var11, var8);
                    class473.method2881(var13, 0, -var11 + arg6, var8);
                }
            } else {
                for (int var14 = 0; ~arg1 < ~var14; ++var14) {
                    class473.method2881(arg3[arg4 + var14], arg0, arg6, var8);
                }
            }
        } else if (arg1 > 0 && ~arg6 < -1) {
            int var15 = arg6 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = -(var17 * 2) + arg6;
            for (int var21 = 0; var21 < arg1; ++var21) {
                int[] var22 = arg3[arg4 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field2904 != -1) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class637.method3693(class343.field5013, arg0 + var24)] = var22[class637.method3693(arg0 + arg6 - (var24 + 1), class343.field5013)] = var23 > var25 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class637.method3693(class343.field5013, arg0 + var26)] = var22[class637.method3693(arg0 - var26 + arg6 + -1, class343.field5013)] = var23 * var28 >> 12;
                        }
                    }
                    if (class41.field455 < var19 + var20) {
                        int var27 = -var19 + class41.field455;
                        class473.method2881(var22, var19, var27, var23);
                        class473.method2881(var22, 0, -var27 + var20, var23);
                    } else {
                        class473.method2881(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 - 1 + arg1;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field2904 == -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class637.method3693(arg0 - -var31, class343.field5013)] = var22[class637.method3693(class343.field5013, -var31 + arg6 + arg0 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class637.method3693(class343.field5013, arg0 + var33)] = var22[class637.method3693(arg0 + arg6 + -var33 + -1, class343.field5013)] = var30 <= var35 ? var30 : var35;
                            }
                        }
                        if (~class41.field455 <= ~(var19 - -var20)) {
                            class473.method2881(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class41.field455;
                            class473.method2881(var22, var19, var34, var30);
                            class473.method2881(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class637.method3693(class343.field5013, arg0 + var36)] = var22[class637.method3693(arg0 - -arg6 - var36 + -1, class343.field5013)] = var8 * var36 / var17;
                        }
                        if (~class41.field455 <= ~(var19 + var20)) {
                            class473.method2881(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class41.field455;
                            class473.method2881(var22, var19, var37, var8);
                            class473.method2881(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }
}
