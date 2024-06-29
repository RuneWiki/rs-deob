import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class192 extends class440 {

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    private int field2764 = 819;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    private int field2766 = 1024;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    private int field2768 = 409;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    private int field2772 = 1024;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    private int field2774 = 1024;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
    private int field2778 = 0;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    private int field2765 = 2048;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    private int field2775 = 1024;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
    private int field2776 = 0;

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "Lme;")
    public static class177 field2780 = new class177();

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILmo;I)V", line = 4)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field2766 = arg1.method3847((byte) 118);
                                        }
                                    } else {
                                        this.field2774 = arg1.method3847((byte) 118);
                                    }
                                } else {
                                    this.field2778 = arg1.method3826(false);
                                }
                            } else {
                                this.field2772 = arg1.method3847((byte) 118);
                            }
                        } else {
                            this.field2764 = arg1.method3847((byte) 118);
                        }
                    } else {
                        this.field2768 = arg1.method3847((byte) 118);
                    }
                } else {
                    this.field2765 = arg1.method3847((byte) 118);
                }
            } else {
                this.field2775 = arg1.method3847((byte) 118);
            }
        } else {
            this.field2776 = arg1.method3826(false);
        }
        if (arg0 != 5) {
            field2780 = null;
        }
        ++field2770;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIII)V", line = 102)
    public static final void method1291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2767;
        class697 var10 = null;
        for (class697 var11 = (class697) class302.field4494.method472((byte) -123); var11 != null; var11 = (class697) class302.field4494.method482(122)) {
            if (var11.field9859 == arg4 && ~var11.field9870 == ~arg1 && var11.field9874 == arg7 && ~var11.field9872 == ~arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class697();
            var10.field9859 = arg4;
            var10.field9874 = arg7;
            var10.field9872 = arg0;
            var10.field9870 = arg1;
            if (arg1 >= 0 && ~arg7 <= -1 && ~arg1 > ~class199.field2812 && class232.field3611 > arg7) {
                class188.method1268(var10, (byte) 27);
            }
            class302.field4494.method474(var10, 6);
        }
        var10.field9873 = arg5;
        var10.field9869 = arg3;
        if (arg2 >= 25) {
            var10.field9863 = arg8;
            var10.field9861 = arg9;
            var10.field9862 = arg6;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 668)
    public class192() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)[I", line = 155)
    public final int[] method229(byte arg0, int arg1) {
        ++field2779;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 65 / ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            int[][] var5 = super.field6412.method3249(-29306);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = 0;
            int var14 = 0;
            int var15 = class549.field7715 * this.field2775 >> 12;
            int var16 = class549.field7715 * this.field2765 >> 12;
            int var17 = class221.field3098 * this.field2768 >> 12;
            int var18 = class221.field3098 * this.field2764 >> 12;
            if (~var18 >= -2) {
                return var5[arg1];
            } else {
                this.field2771 = class549.field7715 / 8 * this.field2772 >> 12;
                int var19 = class549.field7715 / var15 + 1;
                int[][] var20 = new int[var19][3];
                int[][] var21 = new int[var19][3];
                Random var22 = new Random((long) this.field2776);
                while (true) {
                    while (true) {
                        int var23 = var15 + class311.method1976(-1, var16 - var15, var22);
                        int var24 = class311.method1976(-1, var18 - var17, var22) + var17;
                        int var25 = var9 + var23;
                        if (class549.field7715 < var25) {
                            var23 = -var9 + class549.field7715;
                            var25 = class549.field7715;
                        }
                        int var26;
                        if (var12) {
                            var26 = 0;
                        } else {
                            int var27 = var10;
                            int[] var28 = var21[var10];
                            int var29 = 0;
                            int var30 = var6 + var25;
                            if (var30 < 0) {
                                var30 += class549.field7715;
                            }
                            if (class549.field7715 < var30) {
                                var30 -= class549.field7715;
                            }
                            var26 = var28[2];
                            while (true) {
                                int[] var31 = var21[var27];
                                if (var31[0] <= var30 && var30 <= var31[1]) {
                                    if (var10 != var27) {
                                        int var32 = var6 + var9;
                                        if (~var32 > -1) {
                                            var32 += class549.field7715;
                                        }
                                        if (class549.field7715 < var32) {
                                            var32 -= class549.field7715;
                                        }
                                        for (int var33 = 1; ~var33 >= ~var29; ++var33) {
                                            int[] var41 = var21[(var10 + var33) % var13];
                                            var26 = Math.max(var26, var41[2]);
                                        }
                                        for (int var34 = 0; var34 <= var29; ++var34) {
                                            int[] var35 = var21[(var10 + var34) % var13];
                                            int var36 = var35[2];
                                            if (var26 != var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (var32 < var30) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var30, var38);
                                                } else if (var37 == 0) {
                                                    var40 = Math.min(var30, var38);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class549.field7715;
                                                }
                                                this.method1292(var36, var5, (byte) 120, var22, -var36 + var26, var8 + var39, var40 - var39);
                                            }
                                        }
                                    }
                                    var10 = var27;
                                    break;
                                }
                                ++var27;
                                if (~var27 <= ~var13) {
                                    var27 = 0;
                                }
                                ++var29;
                            }
                        }
                        if (~class221.field3098 > ~(var24 + var26)) {
                            var24 = -var26 + class221.field3098;
                        } else {
                            var11 = false;
                        }
                        if (~class549.field7715 == ~var25) {
                            this.method1292(var26, var5, (byte) 113, var22, var24, var9 - -var7, var23);
                            if (var11) {
                                return var3;
                            }
                            var11 = true;
                            int[] var42 = var20[var14++];
                            var42[0] = var9;
                            var42[2] = var24 + var26;
                            var42[1] = var25;
                            int[][] var43 = var21;
                            var21 = var20;
                            var13 = var14;
                            var20 = var43;
                            var14 = 0;
                            var8 = var7;
                            var7 = class311.method1976(-1, class549.field7715, var22);
                            var9 = 0;
                            var6 = -var8 + var7;
                            int var44 = var6;
                            if (var6 < 0) {
                                var44 = class549.field7715 + var6;
                            }
                            if (~var44 < ~class549.field7715) {
                                var44 -= class549.field7715;
                            }
                            var10 = 0;
                            var12 = false;
                            while (true) {
                                int[] var45 = var21[var10];
                                if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
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
                            var46[2] = var24 + var26;
                            var46[1] = var25;
                            var46[0] = var9;
                            this.method1292(var26, var5, (byte) 119, var22, var24, var7 + var9, var23);
                            var9 = var25;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[[IBLjava/util/Random;III)V", line = 428)
    private final void method1292(int arg0, int[][] arg1, byte arg2, Random arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= 110) {
            this.field2768 = 127;
        }
        ++field2777;
        int var8 = this.field2766 <= 0 ? 4096 : -class311.method1976(-1, this.field2766, arg3) + 4096;
        int var9 = this.field2774 * this.field2771 >> 12;
        int var10 = this.field2771 - (var9 > 0 ? class311.method1976(-1, var9, arg3) : 0);
        if (~class549.field7715 >= ~arg5) {
            arg5 -= class549.field7715;
        }
        if (var10 <= 0) {
            if (arg5 + arg6 > class549.field7715) {
                int var11 = -arg5 + class549.field7715;
                for (int var12 = 0; var12 < arg4; ++var12) {
                    int[] var13 = arg1[arg0 + var12];
                    class476.method2790(var13, arg5, var11, var8);
                    class476.method2790(var13, 0, -var11 + arg6, var8);
                }
            } else {
                for (int var14 = 0; ~arg4 < ~var14; ++var14) {
                    class476.method2790(arg1[arg0 + var14], arg5, arg6, var8);
                }
            }
        } else if (arg4 > 0 && arg6 > 0) {
            int var15 = arg6 / 2;
            int var16 = arg4 / 2;
            int var17 = ~var10 < ~var15 ? var15 : var10;
            int var18 = ~var16 > ~var10 ? var16 : var10;
            int var19 = arg5 + var17;
            int var20 = -(var17 * 2) + arg6;
            for (int var21 = 0; var21 < arg4; ++var21) {
                int[] var22 = arg1[var21 - -arg0];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field2778 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class689.method3797(class420.field6112, arg5 + var24)] = var22[class689.method3797(arg5 - var24 + arg6 + -1, class420.field6112)] = ~var23 >= ~var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class689.method3797(arg5 + var26, class420.field6112)] = var22[class689.method3797(class420.field6112, arg5 - 1 + -var26 + arg6)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) >= ~class549.field7715) {
                        class476.method2790(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class549.field7715;
                        class476.method2790(var22, var19, var27, var23);
                        class476.method2790(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg4;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field2778 == -1) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class689.method3797(class420.field6112, arg5 + var31)] = var22[class689.method3797(class420.field6112, arg6 - 1 + -var31 + arg5)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class689.method3797(class420.field6112, arg5 + var33)] = var22[class689.method3797(arg5 - -arg6 - var33 + -1, class420.field6112)] = ~var35 <= ~var30 ? var30 : var35;
                            }
                        }
                        if (~(var19 + var20) < ~class549.field7715) {
                            int var34 = -var19 + class549.field7715;
                            class476.method2790(var22, var19, var34, var30);
                            class476.method2790(var22, 0, -var34 + var20, var30);
                        } else {
                            class476.method2790(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class689.method3797(class420.field6112, arg5 - -var36)] = var22[class689.method3797(class420.field6112, -var36 + arg6 + arg5 + -1)] = var8 * var36 / var17;
                        }
                        if (var19 + var20 > class549.field7715) {
                            int var37 = class549.field7715 - var19;
                            class476.method2790(var22, var19, var37, var8);
                            class476.method2790(var22, 0, -var37 + var20, var8);
                        } else {
                            class476.method2790(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 632)
    public final void method230(int arg0) {
        if (arg0 != -9) {
            field2780 = null;
        }
        ++field2773;
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)V", line = 643)
    public static void method1293(int arg0) {
        if (arg0 == 0) {
            field2780 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)[Lut;", line = 657)
    public static final class109[] method1294(int arg0) {
        if (arg0 != -11879) {
            field2780 = null;
        }
        ++field2769;
        return new class109[] { class657.field9221, class413.field6007, class495.field7028 };
    }
}
