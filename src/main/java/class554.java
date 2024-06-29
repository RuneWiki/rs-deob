import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class554 extends class335 {

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    private int field7560 = 819;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    private int field7562 = 0;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    private int field7564 = 1024;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    private int field7561 = 409;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    private int field7563 = 0;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    private int field7569 = 1024;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    private int field7571 = 2048;

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "I")
    private int field7574 = 1024;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    private int field7568 = 1024;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    private int field7575;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "Lkq;")
    public static class104 field7565;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field7570;
        if (arg2 == -66) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (arg0 != 7) {
                                            if (~arg0 == -9) {
                                                this.field7564 = arg1.method963(-119);
                                            }
                                        } else {
                                            this.field7568 = arg1.method963(-123);
                                        }
                                    } else {
                                        this.field7563 = arg1.method930(255);
                                    }
                                } else {
                                    this.field7574 = arg1.method963(-119);
                                }
                            } else {
                                this.field7560 = arg1.method963(-122);
                            }
                        } else {
                            this.field7561 = arg1.method963(arg2 ^ 63);
                        }
                    } else {
                        this.field7571 = arg1.method963(-122);
                    }
                } else {
                    this.field7569 = arg1.method963(arg2 ^ 56);
                }
            } else {
                this.field7562 = arg1.method930(arg2 + 321);
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
    public class554() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILjava/util/Random;I[[IBI)V")
    private final void method3094(int arg0, int arg1, Random arg2, int arg3, int[][] arg4, byte arg5, int arg6) {
        ++field7567;
        int var8 = ~this.field7564 >= -1 ? 4096 : -class584.method3227(false, this.field7564, arg2) + 4096;
        int var9 = this.field7575 * this.field7568 >> 12;
        int var10 = this.field7575 - (var9 <= 0 ? 0 : class584.method3227(false, var9, arg2));
        if (class649.field8968 <= arg6) {
            arg6 -= class649.field8968;
        }
        if (var10 > 0) {
            if (arg0 <= 0 || arg3 <= 0) {
                return;
            }
            int var11 = arg3 / 2;
            int var12 = arg0 / 2;
            int var13 = ~var11 > ~var10 ? var11 : var10;
            int var14 = var10 <= var12 ? var10 : var12;
            int var15 = arg6 + var13;
            int var16 = -(var13 * 2) + arg3;
            for (int var17 = 0; ~arg0 < ~var17; ++var17) {
                int[] var18 = arg4[arg1 + var17];
                if (~var17 > ~var14) {
                    int var19 = var8 * var17 / var14;
                    if (~this.field7563 == -1) {
                        for (int var20 = 0; ~var20 > ~var13; ++var20) {
                            int var21 = var8 * var20 / var13;
                            var18[class15.method97(arg6 + var20, class29.field413)] = var18[class15.method97(class29.field413, -var20 + -1 + arg3 + arg6)] = var19 * var21 >> 12;
                        }
                    } else {
                        for (int var22 = 0; ~var13 < ~var22; ++var22) {
                            int var24 = var8 * var22 / var13;
                            var18[class15.method97(class29.field413, arg6 + var22)] = var18[class15.method97(arg6 - (-arg3 + var22 - -1), class29.field413)] = ~var24 > ~var19 ? var24 : var19;
                        }
                    }
                    if (~(var15 - -var16) < ~class649.field8968) {
                        int var23 = -var15 + class649.field8968;
                        class2.method8(var18, var15, var23, var19);
                        class2.method8(var18, 0, var16 - var23, var19);
                    } else {
                        class2.method8(var18, var15, var16, var19);
                    }
                } else {
                    int var25 = arg0 - var17 + -1;
                    if (~var14 < ~var25) {
                        int var26 = var8 * var25 / var14;
                        if (~this.field7563 != -1) {
                            for (int var27 = 0; var27 < var13; ++var27) {
                                int var28 = var8 * var27 / var13;
                                var18[class15.method97(arg6 + var27, class29.field413)] = var18[class15.method97(class29.field413, -var27 - 1 + arg6 + arg3)] = ~var28 > ~var26 ? var28 : var26;
                            }
                        } else {
                            for (int var29 = 0; var29 < var13; ++var29) {
                                int var31 = var8 * var29 / var13;
                                var18[class15.method97(arg6 + var29, class29.field413)] = var18[class15.method97(class29.field413, arg6 - -arg3 + -var29 + -1)] = var26 * var31 >> 12;
                            }
                        }
                        if (var15 + var16 > class649.field8968) {
                            int var30 = -var15 + class649.field8968;
                            class2.method8(var18, var15, var30, var26);
                            class2.method8(var18, 0, -var30 + var16, var26);
                        } else {
                            class2.method8(var18, var15, var16, var26);
                        }
                    } else {
                        for (int var32 = 0; ~var13 < ~var32; ++var32) {
                            var18[class15.method97(arg6 - -var32, class29.field413)] = var18[class15.method97(-var32 + arg6 - (-arg3 - -1), class29.field413)] = var8 * var32 / var13;
                        }
                        if (~(var15 + var16) < ~class649.field8968) {
                            int var33 = -var15 + class649.field8968;
                            class2.method8(var18, var15, var33, var8);
                            class2.method8(var18, 0, -var33 + var16, var8);
                        } else {
                            class2.method8(var18, var15, var16, var8);
                        }
                    }
                }
            }
        } else if (arg3 + arg6 <= class649.field8968) {
            for (int var34 = 0; ~arg0 < ~var34; ++var34) {
                class2.method8(arg4[arg1 - -var34], arg6, arg3, var8);
            }
        } else {
            int var35 = -arg6 + class649.field8968;
            for (int var36 = 0; ~var36 > ~arg0; ++var36) {
                int[] var38 = arg4[arg1 + var36];
                class2.method8(var38, arg6, var35, var8);
                class2.method8(var38, 0, arg3 - var35, var8);
            }
        }
        int var37 = -98 % ((67 - arg5) / 40);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field7566;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            this.field7569 = 123;
        }
        if (super.field4525.field5435) {
            int[][] var4 = super.field4525.method2345((byte) -126);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class649.field8968 * this.field7569 >> 12;
            int var15 = class649.field8968 * this.field7571 >> 12;
            int var16 = class316.field4237 * this.field7561 >> 12;
            int var17 = class316.field4237 * this.field7560 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field7575 = class649.field8968 / 8 * this.field7574 >> 12;
                int var18 = class649.field8968 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field7562);
                while (true) {
                    while (true) {
                        int var22 = var14 + class584.method3227(!arg0, var15 - var14, var21);
                        int var23 = var16 - -class584.method3227(false, -var16 + var17, var21);
                        int var24 = var8 + var22;
                        if (~class649.field8968 > ~var24) {
                            var24 = class649.field8968;
                            var22 = class649.field8968 - var8;
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
                                var29 += class649.field8968;
                            }
                            if (var29 > class649.field8968) {
                                var29 -= class649.field8968;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && var29 <= var30[1]) {
                                    var25 = var27[2];
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class649.field8968;
                                        }
                                        if (~class649.field8968 > ~var31) {
                                            var31 -= class649.field8968;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
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
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class649.field8968;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method3094(-var35 + var25, var35, var21, var39 - var38, var4, (byte) 111, var7 + var38);
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
                        if (class316.field4237 >= var23 + var25) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class316.field4237;
                        }
                        if (~class649.field8968 == ~var24) {
                            this.method3094(var23, var25, var21, var22, var4, (byte) -43, var8 - -var6);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class584.method3227(false, class649.field8968, var21);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class649.field8968 + var5;
                            }
                            var9 = 0;
                            if (~class649.field8968 > ~var43) {
                                var43 -= class649.field8968;
                            }
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var43 <= var44[1]) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var23 + var25;
                            var45[1] = var24;
                            var45[0] = var8;
                            this.method3094(var23, var25, var21, var22, var4, (byte) 119, var6 + var8);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V")
    public static void method3095(byte arg0) {
        if (arg0 != -79) {
            field7565 = null;
        }
        field7565 = null;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(III)Z")
    public static final boolean method3096(int arg0, int arg1, int arg2) {
        ++field7573;
        if (arg1 != -9381) {
            field7565 = null;
        }
        return (arg0 & 2048) != 0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        ++field7572;
        int var2 = -73 % ((58 - arg0) / 60);
    }
}
