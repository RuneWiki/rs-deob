import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class559 extends class243 {

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    private int field7860 = 1024;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    private int field7863 = 1024;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    private int field7862 = 819;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    private int field7867 = 0;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    private int field7865 = 1024;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
    private int field7869 = 409;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    private int field7866 = 1024;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    private int field7870 = 0;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    private int field7868 = 2048;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "Lea;")
    public static class547 field7864 = new class547(97, 2);

    @OriginalMember(owner = "client!po", name = "D", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!po", name = "V", descriptor = "I")
    private int field7874;

    @OriginalMember(owner = "client!po", name = "U", descriptor = "Lji;")
    public static class611 field7873;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "Lufa;")
    public static class680 field7871;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 3)
    public static void method3159(int arg0) {
        field7871 = null;
        field7873 = null;
        int var1 = -20 / ((45 - arg0) / 42);
        field7864 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILji;B)V", line = 14)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field7866 = arg1.method3402((byte) 127);
                                        }
                                    } else {
                                        this.field7860 = arg1.method3402((byte) 127);
                                    }
                                } else {
                                    this.field7870 = arg1.method3428((byte) -113);
                                }
                            } else {
                                this.field7863 = arg1.method3402((byte) 127);
                            }
                        } else {
                            this.field7862 = arg1.method3402((byte) 127);
                        }
                    } else {
                        this.field7869 = arg1.method3402((byte) 127);
                    }
                } else {
                    this.field7868 = arg1.method3402((byte) 127);
                }
            } else {
                this.field7865 = arg1.method3402((byte) 127);
            }
        } else {
            this.field7867 = arg1.method3428((byte) -122);
        }
        if (arg2 <= -92) {
            ++field7858;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 123)
    public class559() {
        super(0, true);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BIILjava/util/Random;[[III)V", line = 130)
    private final void method3160(byte arg0, int arg1, int arg2, Random arg3, int[][] arg4, int arg5, int arg6) {
        ++field7872;
        int var8 = this.field7866 <= 0 ? 4096 : 4096 - class676.method3842(-28737, this.field7866, arg3);
        int var9 = this.field7874 * this.field7860 >> 12;
        int var10 = this.field7874 + -(~var9 >= -1 ? 0 : class676.method3842(-28737, var9, arg3));
        if (class687.field9628 <= arg2) {
            arg2 -= class687.field9628;
        }
        if (arg0 >= 39) {
            if (var10 > 0) {
                if (~arg6 < -1 && arg1 > 0) {
                    int var11 = arg1 / 2;
                    int var12 = arg6 / 2;
                    int var13 = ~var10 < ~var11 ? var11 : var10;
                    int var14 = ~var12 > ~var10 ? var12 : var10;
                    int var15 = arg2 - -var13;
                    int var16 = -(var13 * 2) + arg1;
                    for (int var17 = 0; ~var17 > ~arg6; ++var17) {
                        int[] var18 = arg4[var17 - -arg5];
                        if (~var17 > ~var14) {
                            int var19 = var8 * var17 / var14;
                            if (this.field7870 == 0) {
                                for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class321.method1919(arg2 + var20, class28.field206)] = var18[class321.method1919(-var20 + -1 + arg1 + arg2, class28.field206)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class321.method1919(class28.field206, arg2 + var22)] = var18[class321.method1919(class28.field206, -var22 + arg2 - (-arg1 + 1))] = var24 < var19 ? var24 : var19;
                                }
                            }
                            if (~class687.field9628 <= ~(var15 - -var16)) {
                                class373.method2196(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class687.field9628;
                                class373.method2196(var18, var15, var23, var19);
                                class373.method2196(var18, 0, -var23 + var16, var19);
                            }
                        } else {
                            int var25 = arg6 + -1 + -var17;
                            if (~var14 < ~var25) {
                                int var26 = var8 * var25 / var14;
                                if (this.field7870 == 0) {
                                    for (int var27 = 0; var13 > var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class321.method1919(class28.field206, arg2 + var27)] = var18[class321.method1919(arg1 + arg2 - var27 + -1, class28.field206)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; var29 < var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class321.method1919(class28.field206, arg2 + var29)] = var18[class321.method1919(class28.field206, -var29 + arg2 + arg1 + -1)] = var31 >= var26 ? var26 : var31;
                                    }
                                }
                                if (~class687.field9628 > ~(var15 + var16)) {
                                    int var30 = -var15 + class687.field9628;
                                    class373.method2196(var18, var15, var30, var26);
                                    class373.method2196(var18, 0, -var30 + var16, var26);
                                } else {
                                    class373.method2196(var18, var15, var16, var26);
                                }
                            } else {
                                for (int var32 = 0; var13 > var32; ++var32) {
                                    var18[class321.method1919(arg2 + var32, class28.field206)] = var18[class321.method1919(class28.field206, arg1 + arg2 + -var32 - 1)] = var8 * var32 / var13;
                                }
                                if (class687.field9628 >= var15 + var16) {
                                    class373.method2196(var18, var15, var16, var8);
                                } else {
                                    int var33 = -var15 + class687.field9628;
                                    class373.method2196(var18, var15, var33, var8);
                                    class373.method2196(var18, 0, -var33 + var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (arg1 + arg2 <= class687.field9628) {
                for (int var34 = 0; arg6 > var34; ++var34) {
                    class373.method2196(arg4[arg5 + var34], arg2, arg1, var8);
                }
            } else {
                int var35 = -arg2 + class687.field9628;
                for (int var36 = 0; ~arg6 < ~var36; ++var36) {
                    int[] var37 = arg4[arg5 + var36];
                    class373.method2196(var37, arg2, var35, var8);
                    class373.method2196(var37, 0, -var35 + arg1, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[I", line = 328)
    public final int[] method5(int arg0, int arg1) {
        ++field7859;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[][] var4 = super.field3164.method3743(98);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class687.field9628 * this.field7865 >> 12;
            int var15 = class687.field9628 * this.field7868 >> 12;
            int var16 = class676.field9444 * this.field7869 >> 12;
            int var17 = class676.field9444 * this.field7862 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field7874 = class687.field9628 / 8 * this.field7863 >> 12;
            int var18 = class687.field9628 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field7867);
            label128: while (true) {
                while (true) {
                    int var22 = class676.method3842(arg0 ^ -28864, var15 - var14, var21) + var14;
                    int var23 = class676.method3842(-28737, var17 - var16, var21) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class687.field9628) {
                        var24 = class687.field9628;
                        var22 = -var8 + class687.field9628;
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
                            var29 += class687.field9628;
                        }
                        if (var29 > class687.field9628) {
                            var29 -= class687.field9628;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var29 <= ~var30[0] && var30[1] >= var29) {
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class687.field9628;
                                    }
                                    if (var31 > class687.field9628) {
                                        var31 -= class687.field9628;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var25 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var29) {
                                                if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class687.field9628;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method3160((byte) 101, var39 - var38, var7 + var38, var21, var4, var35, -var35 + var25);
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
                    if (~class676.field9444 > ~(var25 - -var23)) {
                        var23 = -var25 + class676.field9444;
                    } else {
                        var10 = false;
                    }
                    if (class687.field9628 != var24) {
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var8;
                        var41[2] = var25 - -var23;
                        this.method3160((byte) 96, var22, var6 + var8, var21, var4, var25, var23);
                        var8 = var24;
                    } else {
                        this.method3160((byte) 126, var22, var8 - -var6, var21, var4, var25, var23);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[1] = var24;
                        var42[0] = var8;
                        var42[2] = var25 - -var23;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var7 = var6;
                        var13 = 0;
                        var6 = class676.method3842(-28737, class687.field9628, var21);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class687.field9628 + var5;
                        }
                        var9 = 0;
                        if (var44 > class687.field9628) {
                            var44 -= class687.field9628;
                        }
                        var11 = false;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var45[0] >= ~var44 && var44 <= var45[1]) {
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
        if (arg0 != 255) {
            this.field7863 = -8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(B)V", line = 591)
    public final void method85(byte arg0) {
        ++field7861;
        if (arg0 != 66) {
            this.field7860 = 64;
        }
    }
}
