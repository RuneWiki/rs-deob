import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class107 extends class634 {

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    private int field1123 = 0;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    private int field1125 = 1024;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    private int field1122 = 409;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    private int field1132 = 1024;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    private int field1133 = 819;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    private int field1121 = 1024;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    private int field1134 = 0;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    private int field1129 = 1024;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    private int field1124 = 2048;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lpia;")
    public static class94 field1137 = new class94(79, 4);

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "Lbq;")
    public static class289 field1138 = new class289();

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "Lrc;")
    public static class536 field1126;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V", line = 6)
    public static void method740(byte arg0) {
        field1126 = null;
        if (arg0 == 30) {
            field1138 = null;
            field1137 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 22)
    public class107() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V", line = 29)
    public final void method87(byte arg0) {
        ++field1135;
        if (arg0 < 65) {
            field1137 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII)I", line = 40)
    public static final int method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 7) {
            field1137 = null;
        }
        ++field1136;
        int var7 = arg1 & 3;
        if (~(arg5 & 1) == -2) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return -arg0 + 7 - (arg2 - 1);
        } else {
            return ~var7 == -3 ? -arg4 + 1 + 7 - arg6 : arg0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILig;Z)V", line = 76)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            this.field1132 = -25;
        }
        ++field1128;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field1132 = arg1.method1476(-99);
                                        }
                                    } else {
                                        this.field1129 = arg1.method1476(-80);
                                    }
                                } else {
                                    this.field1123 = arg1.method1423(-102);
                                }
                            } else {
                                this.field1125 = arg1.method1476(-126);
                            }
                        } else {
                            this.field1133 = arg1.method1476(65);
                        }
                    } else {
                        this.field1122 = arg1.method1476(27);
                    }
                } else {
                    this.field1124 = arg1.method1476(-126);
                }
            } else {
                this.field1121 = arg1.method1476(-68);
            }
        } else {
            this.field1134 = arg1.method1423(-48);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILjava/util/Random;III[[I)V", line = 181)
    private final void method742(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        if (arg1 == 2) {
            ++field1131;
            int var8 = this.field1132 > 0 ? -class661.method3763(this.field1132, 30356, arg2) + 4096 : 4096;
            int var9 = this.field1130 * this.field1129 >> 12;
            int var10 = this.field1130 + -(~var9 < -1 ? class661.method3763(var9, arg1 + 30354, arg2) : 0);
            if (class635.field9139 <= arg4) {
                arg4 -= class635.field9139;
            }
            if (var10 > 0) {
                if (arg3 > 0 && ~arg5 < -1) {
                    int var11 = arg5 / 2;
                    int var12 = arg3 / 2;
                    int var13 = ~var11 <= ~var10 ? var10 : var11;
                    int var14 = var12 < var10 ? var12 : var10;
                    int var15 = arg4 - -var13;
                    int var16 = arg5 - var13 * 2;
                    for (int var17 = 0; var17 < arg3; ++var17) {
                        int[] var18 = arg6[arg0 + var17];
                        if (var14 > var17) {
                            int var19 = var8 * var17 / var14;
                            if (this.field1123 != 0) {
                                for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class327.method1956(class110.field1162, arg4 + var20)] = var18[class327.method1956(class110.field1162, arg4 - (-arg5 + 1) + -var20)] = var21 >= var19 ? var19 : var21;
                                }
                            } else {
                                for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class327.method1956(arg4 + var22, class110.field1162)] = var18[class327.method1956(arg4 - (-arg5 + var22 + 1), class110.field1162)] = var19 * var24 >> 12;
                                }
                            }
                            if (~(var15 + var16) < ~class635.field9139) {
                                int var23 = -var15 + class635.field9139;
                                class143.method896(var18, var15, var23, var19);
                                class143.method896(var18, 0, -var23 + var16, var19);
                            } else {
                                class143.method896(var18, var15, var16, var19);
                            }
                        } else {
                            int var25 = -var17 + arg3 - 1;
                            if (var14 > var25) {
                                int var26 = var8 * var25 / var14;
                                if (this.field1123 == 0) {
                                    for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class327.method1956(class110.field1162, arg4 - -var27)] = var18[class327.method1956(-var27 + arg5 + -1 + arg4, class110.field1162)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; var29 < var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class327.method1956(class110.field1162, arg4 + var29)] = var18[class327.method1956(-var29 + -1 + arg4 + arg5, class110.field1162)] = var26 <= var31 ? var26 : var31;
                                    }
                                }
                                if (class635.field9139 >= var15 + var16) {
                                    class143.method896(var18, var15, var16, var26);
                                } else {
                                    int var30 = class635.field9139 - var15;
                                    class143.method896(var18, var15, var30, var26);
                                    class143.method896(var18, 0, -var30 + var16, var26);
                                }
                            } else {
                                for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                    var18[class327.method1956(class110.field1162, arg4 + var32)] = var18[class327.method1956(arg4 + arg5 + -var32 + -1, class110.field1162)] = var8 * var32 / var13;
                                }
                                if (class635.field9139 < var15 - -var16) {
                                    int var33 = -var15 + class635.field9139;
                                    class143.method896(var18, var15, var33, var8);
                                    class143.method896(var18, 0, var16 - var33, var8);
                                } else {
                                    class143.method896(var18, var15, var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (~(arg4 + arg5) >= ~class635.field9139) {
                for (int var34 = 0; ~arg3 < ~var34; ++var34) {
                    class143.method896(arg6[arg0 + var34], arg4, arg5, var8);
                }
            } else {
                int var35 = -arg4 + class635.field9139;
                for (int var36 = 0; ~arg3 < ~var36; ++var36) {
                    int[] var37 = arg6[arg0 + var36];
                    class143.method896(var37, arg4, var35, var8);
                    class143.method896(var37, 0, -var35 + arg5, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)[I", line = 402)
    public final int[] method13(byte arg0, int arg1) {
        ++field1127;
        if (arg0 > -55) {
            this.method87((byte) -62);
        }
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int[][] var4 = super.field9114.method1866((byte) 121);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class635.field9139 * this.field1121 >> 12;
            int var15 = class635.field9139 * this.field1124 >> 12;
            int var16 = class201.field2372 * this.field1122 >> 12;
            int var17 = class201.field2372 * this.field1133 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field1130 = class635.field9139 / 8 * this.field1125 >> 12;
                int var18 = class635.field9139 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1134);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class661.method3763(-var14 + var15, 30356, var21);
                        int var23 = var16 - -class661.method3763(-var16 + var17, 30356, var21);
                        int var24 = var8 + var22;
                        if (~class635.field9139 > ~var24) {
                            var22 = -var8 + class635.field9139;
                            var24 = class635.field9139;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class635.field9139;
                            }
                            if (~var28 < ~class635.field9139) {
                                var28 -= class635.field9139;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && ~var30[1] <= ~var28) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class635.field9139;
                                        }
                                        if (var31 > class635.field9139) {
                                            var31 -= class635.field9139;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var28) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class635.field9139;
                                                } else {
                                                    var39 = Math.min(var28, var37);
                                                    var38 = 0;
                                                }
                                                this.method742(var35, 2, var21, -var35 + var29, var7 + var38, -var38 + var39, var4);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (class201.field2372 < var23 + var29) {
                            var23 = -var29 + class201.field2372;
                        } else {
                            var10 = false;
                        }
                        if (class635.field9139 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var29;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method742(var29, 2, var21, var23, var6 + var8, var22, var4);
                            var8 = var24;
                        } else {
                            this.method742(var29, 2, var21, var23, var6 + var8, var22, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[0] = var8;
                            var42[1] = var24;
                            var42[2] = var23 + var29;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class661.method3763(class635.field9139, 30356, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class635.field9139 + var5;
                            }
                            if (~var44 < ~class635.field9139) {
                                var44 -= class635.field9139;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var44 <= ~var45[0] && var45[1] >= var44) {
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
}
