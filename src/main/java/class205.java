import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class205 extends class157 {

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    private int field3654 = 1024;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    private int field3659 = 1024;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    private int field3663 = 0;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    private int field3658 = 0;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    private int field3665 = 1024;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "I")
    private int field3669 = 1024;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "I")
    private int field3672 = 819;

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "I")
    private int field3670 = 2048;

    @OriginalMember(owner = "client!ll", name = "gb", descriptor = "I")
    private int field3673 = 409;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field3655 = 0;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "[I")
    public static int[] field3661 = new int[256];

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "[I")
    public static int[] field3671 = new int[5];

    @OriginalMember(owner = "client!ll", name = "hb", descriptor = "Z")
    public static boolean field3674 = false;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field3668;
        int var2 = -11 % ((-51 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "(I)V")
    public static final void method1400(int arg0) {
        ++field3657;
        if (arg0 != 0) {
            field3655 = 100;
        }
        class238.field4308.method665(1);
    }

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "(I)V")
    public static void method1401(int arg0) {
        field3661 = null;
        if (arg0 != 442439660) {
            field3674 = true;
        }
        field3671 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field3667;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            int[][] var4 = super.field2879.method1268((byte) 102);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = class226.field4124 * this.field3665 >> 12;
            int var13 = 0;
            int var14 = 0;
            int var15 = class226.field4124 * this.field3670 >> 12;
            int var16 = class79.field1469 * this.field3672 >> 12;
            int var17 = class79.field1469 * this.field3673 >> 12;
            if (var16 <= 1) {
                return var4[arg1];
            } else {
                this.field3664 = class226.field4124 / 8 * this.field3669 >> 12;
                int var18 = class226.field4124 / var12 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field3658);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var12 + class39.method295(-61, var20, -var12 + var15);
                        int var23 = var17 - -class39.method295(-61, var20, var16 - var17);
                        int var24 = var11 + var22;
                        if (class226.field4124 < var24) {
                            var24 = class226.field4124;
                            var22 = class226.field4124 - var11;
                        }
                        int var26;
                        if (var9) {
                            var26 = 0;
                        } else {
                            int[] var25 = var19[var8];
                            var26 = var25[2];
                            int var27 = 0;
                            int var28 = var8;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class226.field4124;
                            }
                            if (~var29 < ~class226.field4124) {
                                var29 -= class226.field4124;
                            }
                            while (true) {
                                int[] var30 = var19[var28];
                                if (~var30[0] >= ~var29 && var29 <= var30[1]) {
                                    if (~var8 != ~var28) {
                                        int var31 = var5 + var11;
                                        if (var31 < 0) {
                                            var31 += class226.field4124;
                                        }
                                        if (var31 > class226.field4124) {
                                            var31 -= class226.field4124;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var19[(var8 + var32) % var14];
                                            var26 = Math.max(var26, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var19[(var8 + var33) % var14];
                                            int var35 = var34[2];
                                            if (var26 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (var36 == 0) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class226.field4124;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1402(var7 + var38, -var35 + var26, (byte) -109, var35, -var38 + var39, var20, var4);
                                            }
                                        }
                                    }
                                    var8 = var28;
                                    break;
                                }
                                ++var27;
                                int var10000 = ~var14;
                                ++var28;
                                if (var10000 >= ~var28) {
                                    var28 = 0;
                                }
                            }
                        }
                        if (~(var26 - -var23) < ~class79.field1469) {
                            var23 = -var26 + class79.field1469;
                        } else {
                            var10 = false;
                        }
                        if (~class226.field4124 != ~var24) {
                            int[] var41 = var21[var13++];
                            var41[2] = var23 + var26;
                            var41[0] = var11;
                            var41[1] = var24;
                            this.method1402(var11 - -var6, var23, (byte) 118, var26, var22, var20, var4);
                            var11 = var24;
                        } else {
                            this.method1402(var6 + var11, var23, (byte) 46, var26, var22, var20, var4);
                            if (var10) {
                                return arg0 != -98 ? null : var3;
                            }
                            var9 = false;
                            var8 = 0;
                            var7 = var6;
                            var10 = true;
                            int[] var42 = var21[var13++];
                            var42[2] = var23 + var26;
                            var14 = var13;
                            var42[1] = var24;
                            var13 = 0;
                            var42[0] = var11;
                            var6 = class39.method295(-61, var20, class226.field4124);
                            var5 = -var7 + var6;
                            int[][] var43 = var19;
                            var11 = 0;
                            int var44 = var5;
                            var19 = var21;
                            var21 = var43;
                            if (~var5 > -1) {
                                var44 = class226.field4124 + var5;
                            }
                            if (~var44 < ~class226.field4124) {
                                var44 -= class226.field4124;
                            }
                            while (true) {
                                int[] var45 = var19[var8];
                                if (~var44 <= ~var45[0] && var44 <= var45[1]) {
                                    break;
                                }
                                ++var8;
                                if (var8 >= var14) {
                                    var8 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg0 != -98 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field3662;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field3659 = arg2.method736(122);
                                        }
                                    } else {
                                        this.field3654 = arg2.method736(124);
                                    }
                                } else {
                                    this.field3663 = arg2.method774((byte) 102);
                                }
                            } else {
                                this.field3669 = arg2.method736(127);
                            }
                        } else {
                            this.field3672 = arg2.method736(124);
                        }
                    } else {
                        this.field3673 = arg2.method736(126);
                    }
                } else {
                    this.field3670 = arg2.method736(125);
                }
            } else {
                this.field3665 = arg2.method736(124);
            }
        } else {
            this.field3658 = arg2.method774((byte) 86);
        }
        if (arg1 >= -29) {
            this.field3673 = 117;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBIILjava/util/Random;[[I)V")
    private final void method1402(int arg0, int arg1, byte arg2, int arg3, int arg4, Random arg5, int[][] arg6) {
        int var8 = this.field3659 <= 0 ? 4096 : 4096 - class39.method295(-61, arg5, this.field3659);
        ++field3666;
        int var9 = -80 % ((arg2 - -19) / 53);
        int var10 = this.field3664 * this.field3654 >> 12;
        int var11 = this.field3664 + -(~var10 < -1 ? class39.method295(-61, arg5, var10) : 0);
        if (class226.field4124 <= arg0) {
            arg0 -= class226.field4124;
        }
        if (var11 > 0) {
            if (~arg1 < -1 && arg4 > 0) {
                int var12 = arg4 / 2;
                int var13 = arg1 / 2;
                int var14 = var12 < var11 ? var12 : var11;
                int var15 = ~var13 > ~var11 ? var13 : var11;
                int var16 = arg0 + var14;
                int var17 = -(var14 * 2) + arg4;
                for (int var18 = 0; ~var18 > ~arg1; ++var18) {
                    int[] var19 = arg6[arg3 + var18];
                    if (var18 < var15) {
                        int var20 = var8 * var18 / var15;
                        if (~this.field3663 == -1) {
                            for (int var21 = 0; var21 < var14; ++var21) {
                                int var22 = var8 * var21 / var14;
                                var19[class27.method220(class249.field4490, arg0 + var21)] = var19[class27.method220(class249.field4490, -var21 + -1 + arg0 + arg4)] = var20 * var22 >> 12;
                            }
                        } else {
                            for (int var23 = 0; ~var23 > ~var14; ++var23) {
                                int var25 = var8 * var23 / var14;
                                var19[class27.method220(arg0 + var23, class249.field4490)] = var19[class27.method220(arg4 - var23 + arg0 + -1, class249.field4490)] = ~var20 < ~var25 ? var25 : var20;
                            }
                        }
                        if (~(var16 + var17) >= ~class226.field4124) {
                            class270.method1844(var19, var16, var17, var20);
                        } else {
                            int var24 = class226.field4124 - var16;
                            class270.method1844(var19, var16, var24, var20);
                            class270.method1844(var19, 0, -var24 + var17, var20);
                        }
                    } else {
                        int var26 = -var18 + arg1 - 1;
                        if (var26 < var15) {
                            int var27 = var8 * var26 / var15;
                            if (this.field3663 == 0) {
                                for (int var28 = 0; var28 < var14; ++var28) {
                                    int var29 = var8 * var28 / var14;
                                    var19[class27.method220(arg0 + var28, class249.field4490)] = var19[class27.method220(-var28 + arg0 + -1 + arg4, class249.field4490)] = var27 * var29 >> 12;
                                }
                            } else {
                                for (int var30 = 0; var30 < var14; ++var30) {
                                    int var32 = var8 * var30 / var14;
                                    var19[class27.method220(class249.field4490, arg0 + var30)] = var19[class27.method220(class249.field4490, -var30 + arg0 + -1 + arg4)] = var27 <= var32 ? var27 : var32;
                                }
                            }
                            if (~(var16 + var17) >= ~class226.field4124) {
                                class270.method1844(var19, var16, var17, var27);
                            } else {
                                int var31 = -var16 + class226.field4124;
                                class270.method1844(var19, var16, var31, var27);
                                class270.method1844(var19, 0, -var31 + var17, var27);
                            }
                        } else {
                            for (int var33 = 0; var14 > var33; ++var33) {
                                var19[class27.method220(arg0 - -var33, class249.field4490)] = var19[class27.method220(class249.field4490, arg0 + arg4 - var33 + -1)] = var8 * var33 / var14;
                            }
                            if (~class226.field4124 <= ~(var16 + var17)) {
                                class270.method1844(var19, var16, var17, var8);
                            } else {
                                int var34 = class226.field4124 - var16;
                                class270.method1844(var19, var16, var34, var8);
                                class270.method1844(var19, 0, -var34 + var17, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class226.field4124 > ~(arg0 + arg4)) {
            int var35 = -arg0 + class226.field4124;
            for (int var36 = 0; ~arg1 < ~var36; ++var36) {
                int[] var37 = arg6[arg3 + var36];
                class270.method1844(var37, arg0, var35, var8);
                class270.method1844(var37, 0, -var35 + arg4, var8);
            }
        } else {
            for (int var38 = 0; arg1 > var38; ++var38) {
                class270.method1844(arg6[arg3 + var38], arg0, arg4, var8);
            }
        }
    }
}
