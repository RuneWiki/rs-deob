import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class515 extends class45 {

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    private int field7570 = 0;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    private int field7568 = 2048;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    private int field7565 = 409;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    private int field7569 = 1024;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    private int field7567 = 1024;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    private int field7575 = 1024;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    private int field7577 = 1024;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    private int field7580 = 819;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
    private int field7581 = 0;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "[B")
    public static byte[] field7582 = new byte[2048];

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "F")
    public static float field7571;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    private int field7578;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 3)
    public static void method3072(int arg0) {
        if (arg0 != -2043055700) {
            field7582 = null;
        }
        field7582 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIZLob;II)V", line = 17)
    public static final void method3073(int arg0, int arg1, int arg2, boolean arg3, class517 arg4, int arg5, int arg6) {
        class221.method1468(arg0, arg4.field6232, arg5, arg6, arg4.field6233, arg2, arg1, arg4.field6228, 0, 0);
        ++field7566;
        if (arg3) {
            field7582 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 28)
    public class515() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 37)
    public final void method38(int arg0) {
        if (arg0 != 4095) {
            this.field7569 = -84;
        }
        ++field7572;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/util/Random;I[[IZII)V", line = 53)
    private final void method3074(int arg0, Random arg1, int arg2, int[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field7573;
        int var8 = this.field7567 > 0 ? 4096 - class455.method2714(arg1, this.field7567, -13848) : 4096;
        if (!arg4) {
            this.method37((class145) null, -27, 54);
        }
        int var9 = this.field7578 * this.field7575 >> 12;
        int var10 = this.field7578 + -(~var9 >= -1 ? 0 : class455.method2714(arg1, var9, -13848));
        if (class259.field3768 <= arg2) {
            arg2 -= class259.field3768;
        }
        if (var10 > 0) {
            if (~arg0 < -1 && ~arg5 < -1) {
                int var11 = arg5 / 2;
                int var12 = arg0 / 2;
                int var13 = ~var10 < ~var11 ? var11 : var10;
                int var14 = var12 >= var10 ? var10 : var12;
                int var15 = arg2 - -var13;
                int var16 = -(var13 * 2) + arg5;
                for (int var17 = 0; ~arg0 < ~var17; ++var17) {
                    int[] var18 = arg3[var17 - -arg6];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field7581 != -1) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class207.method1405(arg2 + var20, class290.field4128)] = var18[class207.method1405(class290.field4128, -var20 + -1 + arg2 + arg5)] = var19 > var21 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class207.method1405(arg2 + var22, class290.field4128)] = var18[class207.method1405(arg2 + arg5 + -var22 + -1, class290.field4128)] = var19 * var24 >> 12;
                            }
                        }
                        if (class259.field3768 >= var15 + var16) {
                            class73.method595(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class259.field3768;
                            class73.method595(var18, var15, var23, var19);
                            class73.method595(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg0 - 1 + -var17;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field7581 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class207.method1405(class290.field4128, arg2 + var27)] = var18[class207.method1405(-var27 + arg5 + arg2 + -1, class290.field4128)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class207.method1405(arg2 - -var29, class290.field4128)] = var18[class207.method1405(-var29 + arg2 + arg5 + -1, class290.field4128)] = var26 > var31 ? var31 : var26;
                                }
                            }
                            if (var15 - -var16 > class259.field3768) {
                                int var30 = -var15 + class259.field3768;
                                class73.method595(var18, var15, var30, var26);
                                class73.method595(var18, 0, -var30 + var16, var26);
                            } else {
                                class73.method595(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class207.method1405(class290.field4128, arg2 + var32)] = var18[class207.method1405(class290.field4128, arg2 + arg5 - (var32 - -1))] = var8 * var32 / var13;
                            }
                            if (var15 + var16 <= class259.field3768) {
                                class73.method595(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class259.field3768;
                                class73.method595(var18, var15, var33, var8);
                                class73.method595(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class259.field3768 > ~(arg2 + arg5)) {
            int var34 = -arg2 + class259.field3768;
            for (int var35 = 0; ~arg0 < ~var35; ++var35) {
                int[] var36 = arg3[arg6 + var35];
                class73.method595(var36, arg2, var34, var8);
                class73.method595(var36, 0, -var34 + arg5, var8);
            }
        } else {
            for (int var37 = 0; ~var37 > ~arg0; ++var37) {
                class73.method595(arg3[arg6 - -var37], arg2, arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[I", line = 252)
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field7574;
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int[][] var4 = super.field854.method862((byte) 119);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class259.field3768 * this.field7577 >> 12;
                int var15 = class259.field3768 * this.field7568 >> 12;
                int var16 = class457.field6849 * this.field7565 >> 12;
                int var17 = class457.field6849 * this.field7580 >> 12;
                if (~var17 >= -2) {
                    return var4[arg1];
                } else {
                    this.field7578 = class259.field3768 / 8 * this.field7569 >> 12;
                    int var18 = class259.field3768 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field7570);
                    while (true) {
                        while (true) {
                            int var22 = var14 - -class455.method2714(var21, var15 - var14, arg0 ^ -13848);
                            int var23 = var16 - -class455.method2714(var21, -var16 + var17, -13848);
                            int var24 = var8 + var22;
                            if (class259.field3768 < var24) {
                                var22 = -var8 + class259.field3768;
                                var24 = class259.field3768;
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
                                    var29 += class259.field3768;
                                }
                                if (var29 > class259.field3768) {
                                    var29 -= class259.field3768;
                                }
                                while (true) {
                                    int[] var30 = var20[var26];
                                    if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                        var25 = var27[2];
                                        if (~var9 != ~var26) {
                                            int var31 = var8 - -var5;
                                            if (~var31 > -1) {
                                                var31 += class259.field3768;
                                            }
                                            if (~var31 < ~class259.field3768) {
                                                var31 -= class259.field3768;
                                            }
                                            for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                                int[] var40 = var20[(var9 + var32) % var12];
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
                                                    if (var29 > var31) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var29, var37);
                                                    } else if (var36 == 0) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class259.field3768;
                                                    }
                                                    this.method3074(-var35 + var25, var21, var7 + var38, var4, true, -var38 + var39, var35);
                                                }
                                            }
                                        }
                                        var9 = var26;
                                        break;
                                    }
                                    ++var28;
                                    ++var26;
                                    if (var12 <= var26) {
                                        var26 = 0;
                                    }
                                }
                            }
                            if (~class457.field6849 > ~(var23 + var25)) {
                                var23 = -var25 + class457.field6849;
                            } else {
                                var10 = false;
                            }
                            if (~class259.field3768 != ~var24) {
                                int[] var41 = var19[var13++];
                                var41[1] = var24;
                                var41[2] = var23 + var25;
                                var41[0] = var8;
                                this.method3074(var23, var21, var6 + var8, var4, true, var22, var25);
                                var8 = var24;
                            } else {
                                this.method3074(var23, var21, var6 + var8, var4, true, var22, var25);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var42 = var19[var13++];
                                var42[1] = var24;
                                var42[2] = var23 + var25;
                                var42[0] = var8;
                                int[][] var43 = var20;
                                var20 = var19;
                                var12 = var13;
                                var19 = var43;
                                var7 = var6;
                                var13 = 0;
                                var6 = class455.method2714(var21, class259.field3768, -13848);
                                var8 = 0;
                                var5 = -var7 + var6;
                                int var44 = var5;
                                if (var5 < 0) {
                                    var44 = class259.field3768 + var5;
                                }
                                if (class259.field3768 < var44) {
                                    var44 -= class259.field3768;
                                }
                                var9 = 0;
                                var11 = false;
                                while (true) {
                                    int[] var45 = var20[var9];
                                    if (~var44 <= ~var45[0] && ~var45[1] <= ~var44) {
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
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lcu;II)V", line = 516)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field7567 = arg0.method1069((byte) -16);
                                        }
                                    } else {
                                        this.field7575 = arg0.method1069((byte) -112);
                                    }
                                } else {
                                    this.field7581 = arg0.method1063((byte) 115);
                                }
                            } else {
                                this.field7569 = arg0.method1069((byte) -37);
                            }
                        } else {
                            this.field7580 = arg0.method1069((byte) -17);
                        }
                    } else {
                        this.field7565 = arg0.method1069((byte) -107);
                    }
                } else {
                    this.field7568 = arg0.method1069((byte) -112);
                }
            } else {
                this.field7577 = arg0.method1069((byte) -63);
            }
        } else {
            this.field7570 = arg0.method1063((byte) 120);
        }
        ++field7576;
        if (arg1 != -26471) {
            this.field7570 = 93;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 629)
    public static final void method3075(int arg0) {
        ++field7579;
        class272.field3928.method484(arg0 ^ 109);
        class283.field4047.method484(37);
        if (arg0 != -1) {
            method3072(114);
        }
        class132.field2081.method484(50);
        class420.field6276.method484(-101);
        class259.field3762.method484(-98);
    }
}
