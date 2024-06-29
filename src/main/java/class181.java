import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class181 extends class117 {

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    private int field2959 = 2048;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    private int field2956 = 1024;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    private int field2952 = 1024;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    private int field2961 = 0;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    private int field2948 = 1024;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    private int field2962 = 1024;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    private int field2963 = 409;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    private int field2960 = 0;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    private int field2949 = 819;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "[I")
    public static int[] field2953 = new int[4096];

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "Ldk;")
    public static class251 field2954;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field2951;
        if (arg1 == 255) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (~arg2 != -7) {
                                        if (~arg2 != -8) {
                                            if (arg2 == 8) {
                                                this.field2948 = arg0.method1142(-18970);
                                            }
                                        } else {
                                            this.field2952 = arg0.method1142(arg1 ^ -19175);
                                        }
                                    } else {
                                        this.field2960 = arg0.method1133((byte) 53);
                                    }
                                } else {
                                    this.field2956 = arg0.method1142(-18970);
                                }
                            } else {
                                this.field2949 = arg0.method1142(-18970);
                            }
                        } else {
                            this.field2963 = arg0.method1142(-18970);
                        }
                    } else {
                        this.field2959 = arg0.method1142(-18970);
                    }
                } else {
                    this.field2962 = arg0.method1142(-18970);
                }
            } else {
                this.field2961 = arg0.method1133((byte) 53);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    public static void method1314(byte arg0) {
        field2953 = null;
        if (arg0 != -91) {
            field2953 = null;
        }
        field2954 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([[IIILjava/util/Random;III)V")
    private final void method1315(int[][] arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int arg6) {
        ++field2946;
        int var8 = 58 / ((-60 - arg5) / 57);
        int var9 = this.field2948 <= 0 ? 4096 : -class67.method469(0, this.field2948, arg3) + 4096;
        int var10 = this.field2957 * this.field2952 >> 12;
        int var11 = this.field2957 - (var10 > 0 ? class67.method469(0, var10, arg3) : 0);
        if (class168.field2737 <= arg1) {
            arg1 -= class168.field2737;
        }
        if (var11 <= 0) {
            if (~(arg1 + arg4) < ~class168.field2737) {
                int var12 = -arg1 + class168.field2737;
                for (int var13 = 0; ~var13 > ~arg2; ++var13) {
                    int[] var14 = arg0[arg6 - -var13];
                    class157.method1070(var14, arg1, var12, var9);
                    class157.method1070(var14, 0, -var12 + arg4, var9);
                }
            } else {
                for (int var15 = 0; ~arg2 < ~var15; ++var15) {
                    class157.method1070(arg0[arg6 + var15], arg1, arg4, var9);
                }
            }
        } else if (~arg2 < -1 && arg4 > 0) {
            int var16 = arg2 / 2;
            int var17 = arg4 / 2;
            int var18 = var11 > var17 ? var17 : var11;
            int var19 = var11 > var16 ? var16 : var11;
            int var20 = -(var18 * 2) + arg4;
            int var21 = arg1 + var18;
            for (int var22 = 0; ~var22 > ~arg2; ++var22) {
                int[] var23 = arg0[arg6 + var22];
                if (~var19 < ~var22) {
                    int var24 = var9 * var22 / var19;
                    if (~this.field2960 != -1) {
                        for (int var25 = 0; var18 > var25; ++var25) {
                            int var26 = var9 * var25 / var18;
                            var23[class51.method359(arg1 + var25, class234.field3769)] = var23[class51.method359(arg1 + arg4 - 1 + -var25, class234.field3769)] = var24 > var26 ? var26 : var24;
                        }
                    } else {
                        for (int var27 = 0; var18 > var27; ++var27) {
                            int var29 = var9 * var27 / var18;
                            var23[class51.method359(class234.field3769, arg1 + var27)] = var23[class51.method359(class234.field3769, -var27 + arg1 + arg4 + -1)] = var24 * var29 >> 12;
                        }
                    }
                    if (class168.field2737 < var20 + var21) {
                        int var28 = class168.field2737 - var21;
                        class157.method1070(var23, var21, var28, var24);
                        class157.method1070(var23, 0, -var28 + var20, var24);
                    } else {
                        class157.method1070(var23, var21, var20, var24);
                    }
                } else {
                    int var30 = -var22 + arg2 + -1;
                    if (~var30 > ~var19) {
                        int var31 = var9 * var30 / var19;
                        if (~this.field2960 != -1) {
                            for (int var32 = 0; ~var18 < ~var32; ++var32) {
                                int var33 = var9 * var32 / var18;
                                var23[class51.method359(class234.field3769, arg1 + var32)] = var23[class51.method359(arg4 + -1 + arg1 + -var32, class234.field3769)] = ~var33 <= ~var31 ? var31 : var33;
                            }
                        } else {
                            for (int var34 = 0; var34 < var18; ++var34) {
                                int var36 = var9 * var34 / var18;
                                var23[class51.method359(arg1 - -var34, class234.field3769)] = var23[class51.method359(arg4 + -1 + arg1 - var34, class234.field3769)] = var31 * var36 >> 12;
                            }
                        }
                        if (class168.field2737 >= var20 + var21) {
                            class157.method1070(var23, var21, var20, var31);
                        } else {
                            int var35 = class168.field2737 - var21;
                            class157.method1070(var23, var21, var35, var31);
                            class157.method1070(var23, 0, var20 - var35, var31);
                        }
                    } else {
                        for (int var37 = 0; var18 > var37; ++var37) {
                            var23[class51.method359(class234.field3769, arg1 + var37)] = var23[class51.method359(class234.field3769, arg1 - var37 + arg4 + -1)] = var9 * var37 / var18;
                        }
                        if (class168.field2737 >= var21 - -var20) {
                            class157.method1070(var23, var21, var20, var9);
                        } else {
                            int var38 = class168.field2737 - var21;
                            class157.method1070(var23, var21, var38, var9);
                            class157.method1070(var23, 0, -var38 + var20, var9);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != 1) {
            this.field2960 = 29;
        }
        ++field2947;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field2950;
            int[] var3 = super.field1883.method531(arg1, (byte) 90);
            if (super.field1883.field1313) {
                int var4 = 0;
                int[][] var5 = super.field1883.method532((byte) -10);
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class168.field2737 * this.field2959 >> 12;
                int var15 = class149.field2335 * this.field2963 >> 12;
                int var16 = class168.field2737 * this.field2962 >> 12;
                int var17 = class149.field2335 * this.field2949 >> 12;
                if (~var17 >= -2) {
                    return var5[arg1];
                } else {
                    this.field2957 = class168.field2737 / 8 * this.field2956 >> 12;
                    int var18 = 1 - -(class168.field2737 / var16);
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field2961);
                    while (true) {
                        while (true) {
                            int var22 = var16 + class67.method469(0, -var16 + var14, var21);
                            int var23 = var15 + class67.method469(arg0 + -2, var17 - var15, var21);
                            int var24 = var7 + var22;
                            if (var24 > class168.field2737) {
                                var24 = class168.field2737;
                                var22 = class168.field2737 - var7;
                            }
                            int var26;
                            if (var11) {
                                var26 = 0;
                            } else {
                                int[] var25 = var20[var9];
                                var26 = var25[2];
                                int var27 = var9;
                                int var28 = 0;
                                int var29 = var6 + var24;
                                if (~var29 > -1) {
                                    var29 += class168.field2737;
                                }
                                if (var29 > class168.field2737) {
                                    var29 -= class168.field2737;
                                }
                                while (true) {
                                    int[] var30 = var20[var27];
                                    if (var30[0] <= var29 && ~var30[1] <= ~var29) {
                                        if (~var9 != ~var27) {
                                            int var31 = var7 - -var6;
                                            if (~var31 > -1) {
                                                var31 += class168.field2737;
                                            }
                                            if (var31 > class168.field2737) {
                                                var31 -= class168.field2737;
                                            }
                                            for (int var32 = 1; var28 >= var32; ++var32) {
                                                int[] var40 = var20[(var9 + var32) % var13];
                                                var26 = Math.max(var26, var40[2]);
                                            }
                                            for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var13];
                                                int var35 = var34[2];
                                                if (var26 != var35) {
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
                                                        var39 = class168.field2737;
                                                    }
                                                    this.method1315(var5, var8 + var38, -var35 + var26, var21, -var38 + var39, arg0 ^ -118, var35);
                                                }
                                            }
                                        }
                                        var9 = var27;
                                        break;
                                    }
                                    ++var27;
                                    if (var27 >= var13) {
                                        var27 = 0;
                                    }
                                    ++var28;
                                }
                            }
                            if (~(var23 + var26) < ~class149.field2335) {
                                var23 = -var26 + class149.field2335;
                            } else {
                                var10 = false;
                            }
                            if (class168.field2737 != var24) {
                                int[] var41 = var19[var12++];
                                var41[1] = var24;
                                var41[2] = var23 + var26;
                                var41[0] = var7;
                                this.method1315(var5, var4 + var7, var23, var21, var22, -128, var26);
                                var7 = var24;
                            } else {
                                this.method1315(var5, var4 + var7, var23, var21, var22, arg0 ^ -120, var26);
                                if (var10) {
                                    return var3;
                                }
                                var11 = false;
                                var9 = 0;
                                int[] var42 = var19[var12++];
                                var42[2] = var23 + var26;
                                var42[0] = var7;
                                var7 = 0;
                                var13 = var12;
                                var10 = true;
                                var12 = 0;
                                int[][] var43 = var20;
                                var20 = var19;
                                var19 = var43;
                                var42[1] = var24;
                                var8 = var4;
                                var4 = class67.method469(0, class168.field2737, var21);
                                var6 = -var8 + var4;
                                int var44 = var6;
                                if (var6 < 0) {
                                    var44 = class168.field2737 + var6;
                                }
                                if (~var44 < ~class168.field2737) {
                                    var44 -= class168.field2737;
                                }
                                while (true) {
                                    int[] var45 = var20[var9];
                                    if (~var45[0] >= ~var44 && var44 <= var45[1]) {
                                        break;
                                    }
                                    ++var9;
                                    if (~var9 <= ~var13) {
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

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field2953[var0] = class303.method2012(24943, var0);
        }
    }
}
