import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class499 extends class38 {

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    private int field7085 = 1024;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    private int field7089 = 0;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    private int field7090 = 2048;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    private int field7091 = 1024;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    private int field7081 = 1024;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    private int field7088 = 819;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    private int field7084 = 409;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    private int field7082 = 0;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    private int field7094 = 1024;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "Lbh;")
    public static class37 field7095 = new class37("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Lpha;")
    public static class165 field7099 = new class165();

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    private int field7097;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "Lrk;")
    public static class33 field7100;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field7085 = arg2.method3712((byte) -113);
                                        }
                                    } else {
                                        this.field7091 = arg2.method3712((byte) -128);
                                    }
                                } else {
                                    this.field7089 = arg2.method3745(-6314);
                                }
                            } else {
                                this.field7094 = arg2.method3712((byte) -108);
                            }
                        } else {
                            this.field7088 = arg2.method3712((byte) -124);
                        }
                    } else {
                        this.field7084 = arg2.method3712((byte) -107);
                    }
                } else {
                    this.field7090 = arg2.method3712((byte) -123);
                }
            } else {
                this.field7081 = arg2.method3712((byte) 121);
            }
        } else {
            this.field7082 = arg2.method3745(-6314);
        }
        ++field7092;
        if (arg0 < 34) {
            field7099 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field7096;
        if (arg0 > -43) {
            this.field7082 = 75;
        }
        int[] var3 = super.field397.method1376(arg1, (byte) 112);
        if (super.field397.field3005) {
            int[][] var4 = super.field397.method1375((byte) 67);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class729.field10216 * this.field7081 >> 12;
            int var15 = class729.field10216 * this.field7090 >> 12;
            int var16 = class632.field8852 * this.field7084 >> 12;
            int var17 = class632.field8852 * this.field7088 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field7097 = class729.field10216 / 8 * this.field7094 >> 12;
                int var18 = class729.field10216 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field7082);
                while (true) {
                    while (true) {
                        int var22 = class162.method1180(var21, -var14 + var15, -95) + var14;
                        int var23 = var16 + class162.method1180(var21, -var16 + var17, -101);
                        int var24 = var8 + var22;
                        if (class729.field10216 < var24) {
                            var24 = class729.field10216;
                            var22 = -var8 + class729.field10216;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class729.field10216;
                            }
                            if (var28 > class729.field10216) {
                                var28 -= class729.field10216;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (~var29[0] >= ~var28 && ~var28 >= ~var29[1]) {
                                    var30 = var26[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class729.field10216;
                                        }
                                        if (class729.field10216 < var31) {
                                            var31 -= class729.field10216;
                                        }
                                        for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var28) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class729.field10216;
                                                }
                                                this.method2968(-var38 + var39, var7 + var38, var21, var35, -var35 + var30, 0, var4);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var12 <= var25) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (class632.field8852 >= var30 - -var23) {
                            var10 = false;
                        } else {
                            var23 = class632.field8852 - var30;
                        }
                        if (~class729.field10216 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var30;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method2968(var22, var6 + var8, var21, var30, var23, 0, var4);
                            var8 = var24;
                        } else {
                            this.method2968(var22, var6 + var8, var21, var30, var23, 0, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var30;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var7 = var6;
                            var13 = 0;
                            var6 = class162.method1180(var21, class729.field10216, -99);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class729.field10216 + var5;
                            }
                            var9 = 0;
                            if (~var44 < ~class729.field10216) {
                                var44 -= class729.field10216;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && ~var44 >= ~var45[1]) {
                                    var11 = false;
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

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        if (arg0 < 120) {
            method2967((class645) null, -107);
        }
        ++field7098;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lrg;I)Lmca;")
    public static final class31 method2967(class645 arg0, int arg1) {
        if (arg1 != 32294) {
            return null;
        } else {
            ++field7087;
            return new class31(arg0.method3756(65536), arg0.method3756(arg1 ^ 97830), arg0.method3756(arg1 ^ 97830), arg0.method3756(65536), arg0.method3756(65536), arg0.method3756(65536), arg0.method3756(65536), arg0.method3756(65536), arg0.method3747((byte) -74), arg0.method3745(-6314));
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
    private final void method2968(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        ++field7086;
        int var8 = ~this.field7085 < -1 ? 4096 - class162.method1180(arg2, this.field7085, -127) : 4096;
        int var9 = this.field7097 * this.field7091 >> 12;
        int var10 = this.field7097 + -(var9 > 0 ? class162.method1180(arg2, var9, -116) : 0);
        if (class729.field10216 <= arg1) {
            arg1 -= class729.field10216;
        }
        if (var10 > arg5) {
            if (arg4 > 0 && arg0 > 0) {
                int var11 = arg0 / 2;
                int var12 = arg4 / 2;
                int var13 = var10 <= var11 ? var10 : var11;
                int var14 = var10 > var12 ? var12 : var10;
                int var15 = arg1 + var13;
                int var16 = -(var13 * 2) + arg0;
                for (int var17 = 0; var17 < arg4; ++var17) {
                    int[] var18 = arg6[arg3 + var17];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field7089 == 0) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class493.method2943(arg1 + var20, class554.field7909)] = var18[class493.method2943(class554.field7909, arg0 - var20 + arg1 + -1)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class493.method2943(arg1 + var22, class554.field7909)] = var18[class493.method2943(arg1 - -arg0 + (-var22 - 1), class554.field7909)] = var19 > var24 ? var24 : var19;
                            }
                        }
                        if (~class729.field10216 <= ~(var15 - -var16)) {
                            class319.method2021(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class729.field10216;
                            class319.method2021(var18, var15, var23, var19);
                            class319.method2021(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg4 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field7089 != -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class493.method2943(class554.field7909, arg1 + var27)] = var18[class493.method2943(arg1 - (-arg0 - -var27 + 1), class554.field7909)] = ~var28 > ~var26 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; var13 > var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class493.method2943(class554.field7909, arg1 + var29)] = var18[class493.method2943(arg0 + arg1 + -var29 - 1, class554.field7909)] = var26 * var31 >> 12;
                                }
                            }
                            if (var15 + var16 > class729.field10216) {
                                int var30 = -var15 + class729.field10216;
                                class319.method2021(var18, var15, var30, var26);
                                class319.method2021(var18, 0, -var30 + var16, var26);
                            } else {
                                class319.method2021(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class493.method2943(class554.field7909, arg1 + var32)] = var18[class493.method2943(class554.field7909, -var32 + arg0 + arg1 + -1)] = var8 * var32 / var13;
                            }
                            if (~class729.field10216 <= ~(var15 + var16)) {
                                class319.method2021(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class729.field10216;
                                class319.method2021(var18, var15, var33, var8);
                                class319.method2021(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (class729.field10216 < arg0 + arg1) {
            int var34 = -arg1 + class729.field10216;
            for (int var35 = 0; ~var35 > ~arg4; ++var35) {
                int[] var36 = arg6[arg3 + var35];
                class319.method2021(var36, arg1, var34, var8);
                class319.method2021(var36, 0, -var34 + arg0, var8);
            }
        } else {
            for (int var37 = 0; arg4 > var37; ++var37) {
                class319.method2021(arg6[arg3 + var37], arg1, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class499() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)I")
    public static final int method2969(boolean arg0, int arg1) {
        ++field7083;
        if (!arg0) {
            method2970(109);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static void method2970(int arg0) {
        field7100 = null;
        if (arg0 == 8) {
            field7099 = null;
            field7095 = null;
        }
    }
}
