import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class609 extends class747 {

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    private int field8199 = 0;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field8195 = 1024;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    private int field8201 = 1024;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    private int field8196 = 0;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    private int field8200 = 819;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    private int field8203 = 2048;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    private int field8206 = 1024;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    private int field8208 = 1024;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    private int field8205 = 409;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field8207 = -1;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    private int field8209;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([[IIIIIILjava/util/Random;)V")
    private final void method3459(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field8197;
        int var8 = this.field8201 <= 0 ? 4096 : -class434.method2677(this.field8201, arg6, (byte) -118) + 4096;
        int var9 = this.field8209 * this.field8206 >> 12;
        int var10 = this.field8209 + -(~var9 >= -1 ? 0 : class434.method2677(var9, arg6, (byte) -116));
        if (class73.field1095 <= arg2) {
            arg2 -= class73.field1095;
        }
        if (arg4 != -31424) {
            this.field8200 = -43;
        }
        if (~var10 < -1) {
            if (~arg1 < -1 && ~arg5 < -1) {
                int var11 = arg5 / 2;
                int var12 = arg1 / 2;
                int var13 = ~var11 <= ~var10 ? var10 : var11;
                int var14 = var12 >= var10 ? var10 : var12;
                int var15 = arg2 + var13;
                int var16 = -(var13 * 2) + arg5;
                for (int var17 = 0; ~arg1 < ~var17; ++var17) {
                    int[] var18 = arg0[arg3 + var17];
                    if (var14 > var17) {
                        int var19 = var8 * var17 / var14;
                        if (this.field8196 == 0) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class665.method3759(arg2 + var20, class73.field1097)] = var18[class665.method3759(class73.field1097, -var20 + -1 + arg2 - -arg5)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class665.method3759(arg2 + var22, class73.field1097)] = var18[class665.method3759(class73.field1097, arg2 + arg5 + -1 - var22)] = var24 >= var19 ? var19 : var24;
                            }
                        }
                        if (class73.field1095 >= var15 + var16) {
                            class245.method1648(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class73.field1095;
                            class245.method1648(var18, var15, var23, var19);
                            class245.method1648(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg1 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field8196 == -1) {
                                for (int var27 = 0; var27 < var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class665.method3759(arg2 - -var27, class73.field1097)] = var18[class665.method3759(class73.field1097, arg5 - var27 + arg2 + -1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class665.method3759(class73.field1097, arg2 + var29)] = var18[class665.method3759(arg2 - 1 + arg5 + -var29, class73.field1097)] = var31 >= var26 ? var26 : var31;
                                }
                            }
                            if (~class73.field1095 <= ~(var15 + var16)) {
                                class245.method1648(var18, var15, var16, var26);
                            } else {
                                int var30 = class73.field1095 - var15;
                                class245.method1648(var18, var15, var30, var26);
                                class245.method1648(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class665.method3759(class73.field1097, arg2 - -var32)] = var18[class665.method3759(arg5 - var32 + arg2 + -1, class73.field1097)] = var8 * var32 / var13;
                            }
                            if (class73.field1095 < var15 + var16) {
                                int var33 = -var15 + class73.field1095;
                                class245.method1648(var18, var15, var33, var8);
                                class245.method1648(var18, 0, -var33 + var16, var8);
                            } else {
                                class245.method1648(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg2 - -arg5) < ~class73.field1095) {
            int var34 = class73.field1095 - arg2;
            for (int var35 = 0; arg1 > var35; ++var35) {
                int[] var36 = arg0[arg3 + var35];
                class245.method1648(var36, arg2, var34, var8);
                class245.method1648(var36, 0, arg5 - var34, var8);
            }
        } else {
            for (int var37 = 0; ~arg1 < ~var37; ++var37) {
                class245.method1648(arg0[arg3 + var37], arg2, arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lob;Lob;Z)V")
    public static final void method3460(class4 arg0, class4 arg1, boolean arg2) {
        ++field8194;
        if (arg0.field35 != null) {
            arg0.method21(117);
        }
        arg0.field35 = arg1.field35;
        arg0.field33 = arg1;
        arg0.field35.field33 = arg0;
        arg0.field33.field35 = arg0;
        if (arg2) {
            field8207 = -58;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        if (arg1 >= -89) {
            this.method3459((int[][]) null, 125, -103, -18, 102, 35, (Random) null);
        }
        ++field8204;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[][] var4 = super.field10279.method3480(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class73.field1095 * this.field8195 >> 12;
            int var15 = class73.field1095 * this.field8203 >> 12;
            int var16 = class414.field5865 * this.field8205 >> 12;
            int var17 = class414.field5865 * this.field8200 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field8209 = class73.field1095 / 8 * this.field8208 >> 12;
                int var18 = class73.field1095 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field8199);
                while (true) {
                    while (true) {
                        int var22 = var14 + class434.method2677(-var14 + var15, var21, (byte) -119);
                        int var23 = class434.method2677(-var16 + var17, var21, (byte) -120) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class73.field1095) {
                            var22 = -var8 + class73.field1095;
                            var24 = class73.field1095;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class73.field1095;
                            }
                            if (~class73.field1095 > ~var28) {
                                var28 -= class73.field1095;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && ~var28 >= ~var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class73.field1095;
                                        }
                                        if (class73.field1095 < var31) {
                                            var31 -= class73.field1095;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var29 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var28 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class73.field1095;
                                                }
                                                this.method3459(var4, -var35 + var29, var7 + var38, var35, -31424, var39 - var38, var21);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var23 + var29 <= class414.field5865) {
                            var10 = false;
                        } else {
                            var23 = -var29 + class414.field5865;
                        }
                        if (class73.field1095 != var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[2] = var29 - -var23;
                            var41[0] = var8;
                            this.method3459(var4, var23, var8 - -var6, var29, -31424, var22, var21);
                            var8 = var24;
                        } else {
                            this.method3459(var4, var23, var6 + var8, var29, -31424, var22, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[0] = var8;
                            var42[2] = var29 - -var23;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var7 = var6;
                            var13 = 0;
                            var6 = class434.method2677(class73.field1095, var21, (byte) -116);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class73.field1095 + var5;
                            }
                            if (class73.field1095 < var44) {
                                var44 -= class73.field1095;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
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

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        ++field8202;
        if (arg0 != -2) {
            this.method183((class63) null, 13, 107);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            this.field8200 = 58;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field8201 = arg0.method482(-772591672);
                                        }
                                    } else {
                                        this.field8206 = arg0.method482(-772591672);
                                    }
                                } else {
                                    this.field8196 = arg0.method505((byte) -119);
                                }
                            } else {
                                this.field8208 = arg0.method482(-772591672);
                            }
                        } else {
                            this.field8200 = arg0.method482(-772591672);
                        }
                    } else {
                        this.field8205 = arg0.method482(arg1 ^ -772603248);
                    }
                } else {
                    this.field8203 = arg0.method482(-772591672);
                }
            } else {
                this.field8195 = arg0.method482(-772591672);
            }
        } else {
            this.field8199 = arg0.method505((byte) -119);
        }
        ++field8198;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class609() {
        super(0, true);
    }
}
