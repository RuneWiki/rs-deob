import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class265 extends class346 {

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    private int field3922 = 0;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    private int field3921 = 819;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    private int field3925 = 2048;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    private int field3918 = 0;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    private int field3932 = 1024;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    private int field3933 = 409;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    private int field3927 = 1024;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    private int field3935 = 1024;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    private int field3936 = 1024;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field3924 = 0;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "[Lul;")
    public static class255[] field3931 = new class255[14];

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 3)
    public static void method1775(int arg0) {
        field3931 = null;
        if (arg0 != 11552) {
            field3926 = 7;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfb;ZI)V", line = 20)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field3930;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (~arg2 != -7) {
                                        if (~arg2 != -8) {
                                            if (arg2 == 8) {
                                                this.field3927 = arg0.method2239(-1076227960);
                                            }
                                        } else {
                                            this.field3936 = arg0.method2239(-1076227960);
                                        }
                                    } else {
                                        this.field3918 = arg0.method2233((byte) 104);
                                    }
                                } else {
                                    this.field3935 = arg0.method2239(-1076227960);
                                }
                            } else {
                                this.field3921 = arg0.method2239(-1076227960);
                            }
                        } else {
                            this.field3933 = arg0.method2239(-1076227960);
                        }
                    } else {
                        this.field3925 = arg0.method2239(-1076227960);
                    }
                } else {
                    this.field3932 = arg0.method2239(-1076227960);
                }
            } else {
                this.field3922 = arg0.method2233((byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I", line = 114)
    public final int[] method45(int arg0, int arg1) {
        ++field3934;
        if (arg1 != 3) {
            field3931 = null;
        }
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int[][] var4 = super.field5152.method1414((byte) -128);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class134.field1753 * this.field3932 >> 12;
            int var15 = class134.field1753 * this.field3925 >> 12;
            int var16 = class370.field5474 * this.field3933 >> 12;
            int var17 = class370.field5474 * this.field3921 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field3920 = class134.field1753 / 8 * this.field3935 >> 12;
                int var18 = class134.field1753 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3922);
                while (true) {
                    while (true) {
                        int var22 = class9.method67(-var14 + var15, -1, var21) + var14;
                        int var23 = class9.method67(-var16 + var17, arg1 + -4, var21) + var16;
                        int var24 = var8 + var22;
                        if (~var24 < ~class134.field1753) {
                            var22 = -var8 + class134.field1753;
                            var24 = class134.field1753;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (var29 < 0) {
                                var29 += class134.field1753;
                            }
                            if (class134.field1753 < var29) {
                                var29 -= class134.field1753;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && ~var29 >= ~var30[1]) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class134.field1753;
                                        }
                                        if (class134.field1753 < var31) {
                                            var31 -= class134.field1753;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
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
                                                if (var29 <= var31) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class134.field1753;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1777(-var38 + var39, -var35 + var25, var38 - -var7, var4, var21, var35, 2);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var23 + var25 <= class370.field5474) {
                            var10 = false;
                        } else {
                            var23 = class370.field5474 - var25;
                        }
                        if (~class134.field1753 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[2] = var25 - -var23;
                            var41[0] = var8;
                            this.method1777(var22, var23, var6 + var8, var4, var21, var25, 2);
                            var8 = var24;
                        } else {
                            this.method1777(var22, var23, var6 + var8, var4, var21, var25, 2);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var25 - -var23;
                            var42[0] = var8;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class9.method67(class134.field1753, -1, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class134.field1753 + var5;
                            }
                            if (class134.field1753 < var44) {
                                var44 -= class134.field1753;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
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
            return var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 379)
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 369)
    public final void method237(byte arg0) {
        ++field3928;
        if (arg0 >= -95) {
            this.method45(75, 19);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V", line = 382)
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3929;
        class440 var5 = class186.method1241(arg1, arg4, (byte) 56);
        var5.method2756(-1369656528);
        var5.field6374 = arg3;
        var5.field6379 = arg0;
        var5.field6375 = arg2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ILjava/util/Random;II)V", line = 397)
    private final void method1777(int arg0, int arg1, int arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        ++field3919;
        int var8 = this.field3927 > 0 ? -class9.method67(this.field3927, -1, arg4) + 4096 : 4096;
        int var9 = this.field3936 * this.field3920 >> 12;
        int var10 = this.field3920 + -(~var9 < -1 ? class9.method67(var9, -1, arg4) : 0);
        if (arg6 != 2) {
            method1775(119);
        }
        if (arg2 >= class134.field1753) {
            arg2 -= class134.field1753;
        }
        if (~var10 < -1) {
            if (~arg1 < -1 && ~arg0 < -1) {
                int var11 = arg0 / 2;
                int var12 = arg1 / 2;
                int var13 = var10 <= var11 ? var10 : var11;
                int var14 = ~var10 >= ~var12 ? var10 : var12;
                int var15 = arg2 + var13;
                int var16 = -(var13 * 2) + arg0;
                for (int var17 = 0; arg1 > var17; ++var17) {
                    int[] var18 = arg3[arg5 + var17];
                    if (var14 > var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field3918 == -1) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class394.method2529(class188.field2572, arg2 - -var20)] = var18[class394.method2529(class188.field2572, arg0 - var20 + arg2 + -1)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class394.method2529(class188.field2572, arg2 + var22)] = var18[class394.method2529(-var22 + arg2 + arg0 - 1, class188.field2572)] = ~var19 < ~var24 ? var24 : var19;
                            }
                        }
                        if (var15 + var16 > class134.field1753) {
                            int var23 = class134.field1753 - var15;
                            class206.method1356(var18, var15, var23, var19);
                            class206.method1356(var18, 0, -var23 + var16, var19);
                        } else {
                            class206.method1356(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg1 - 1 + -var17;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field3918 != 0) {
                                for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class394.method2529(class188.field2572, arg2 - -var27)] = var18[class394.method2529(arg0 - 1 + -var27 + arg2, class188.field2572)] = var28 >= var26 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class394.method2529(class188.field2572, arg2 + var29)] = var18[class394.method2529(class188.field2572, arg0 + arg2 + -var29 + -1)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class134.field1753 > ~(var15 - -var16)) {
                                int var30 = -var15 + class134.field1753;
                                class206.method1356(var18, var15, var30, var26);
                                class206.method1356(var18, 0, var16 - var30, var26);
                            } else {
                                class206.method1356(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class394.method2529(arg2 + var32, class188.field2572)] = var18[class394.method2529(class188.field2572, -var32 + arg2 - -arg0 - 1)] = var8 * var32 / var13;
                            }
                            if (~(var15 - -var16) < ~class134.field1753) {
                                int var33 = -var15 + class134.field1753;
                                class206.method1356(var18, var15, var33, var8);
                                class206.method1356(var18, 0, -var33 + var16, var8);
                            } else {
                                class206.method1356(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg2 - -arg0) < ~class134.field1753) {
            int var34 = -arg2 + class134.field1753;
            for (int var35 = 0; var35 < arg1; ++var35) {
                int[] var36 = arg3[arg5 + var35];
                class206.method1356(var36, arg2, var34, var8);
                class206.method1356(var36, 0, -var34 + arg0, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg1; ++var37) {
                class206.method1356(arg3[arg5 + var37], arg2, arg0, var8);
            }
        }
    }
}
