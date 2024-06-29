import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class775 extends class330 {

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    private int field10663 = 1024;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
    private int field10661 = 0;

    @OriginalMember(owner = "client!qda", name = "P", descriptor = "I")
    private int field10672 = 1024;

    @OriginalMember(owner = "client!qda", name = "S", descriptor = "I")
    private int field10675 = 1024;

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
    private int field10665 = 0;

    @OriginalMember(owner = "client!qda", name = "N", descriptor = "I")
    private int field10670 = 409;

    @OriginalMember(owner = "client!qda", name = "T", descriptor = "I")
    private int field10676 = 1024;

    @OriginalMember(owner = "client!qda", name = "V", descriptor = "I")
    private int field10678 = 2048;

    @OriginalMember(owner = "client!qda", name = "U", descriptor = "I")
    private int field10677 = 819;

    @OriginalMember(owner = "client!qda", name = "L", descriptor = "[I")
    public static int[] field10668 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qda", name = "M", descriptor = "I")
    public static int field10669 = 7000;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    public static int field10662 = field10669;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "Llk;")
    public static class638 field10667 = new class638(16);

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
    private int field10660;

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    public static int field10664;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field10666;

    @OriginalMember(owner = "client!qda", name = "O", descriptor = "I")
    public static int field10671;

    @OriginalMember(owner = "client!qda", name = "Q", descriptor = "I")
    public static int field10673;

    @OriginalMember(owner = "client!qda", name = "R", descriptor = "I")
    public static int field10674;

    @OriginalMember(owner = "client!qda", name = "W", descriptor = "Lsha;")
    public static class115 field10679;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "(B)V")
    public static final void method4276(byte arg0) {
        ++field10666;
        class523 var1 = null;
        try {
            var1 = class768.method4230(0, "2");
            class511 var2 = new class511(class350.field5086 * 6 + 3);
            var2.method3005(arg0 ^ -236, 1);
            var2.method2986(class350.field5086, 126);
            for (int var3 = 0; ~var3 > ~class170.field2162.length; ++var3) {
                if (class583.field8250[var3]) {
                    var2.method2986(var3, 102);
                    var2.method3003(class170.field2162[var3], arg0 ^ 23040);
                }
            }
            if (arg0 != -21) {
                field10662 = 95;
            }
            var1.method3116(0, 1, var2.field6962, var2.field6979);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3121((byte) 36);
            }
        } catch (Exception var4) {
        }
        class669.field9370 = class683.method3903((byte) 4);
        class489.field6728 = false;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field10673;
        int var4 = -5 / ((arg2 - -41) / 42);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field10675 = arg0.method3002(-1);
                                        }
                                    } else {
                                        this.field10676 = arg0.method3002(-1);
                                    }
                                } else {
                                    this.field10665 = arg0.method3013(-107);
                                }
                            } else {
                                this.field10663 = arg0.method3002(-1);
                            }
                        } else {
                            this.field10677 = arg0.method3002(-1);
                        }
                    } else {
                        this.field10670 = arg0.method3002(-1);
                    }
                } else {
                    this.field10678 = arg0.method3002(-1);
                }
            } else {
                this.field10672 = arg0.method3002(-1);
            }
        } else {
            this.field10661 = arg0.method3013(108);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field10674;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int[][] var4 = super.field4630.method2481(-29);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class80.field901 * this.field10672 >> 12;
            int var15 = class80.field901 * this.field10678 >> 12;
            int var16 = class291.field4285 * this.field10670 >> 12;
            int var17 = class291.field4285 * this.field10677 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field10660 = class80.field901 / 8 * this.field10663 >> 12;
            int var18 = class80.field901 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field10661);
            label124: while (true) {
                while (true) {
                    int var22 = var14 - -class427.method2573(var21, -var14 + var15, -74);
                    int var23 = var16 + class427.method2573(var21, var17 - var16, -85);
                    int var24 = var8 + var22;
                    if (~class80.field901 > ~var24) {
                        var24 = class80.field901;
                        var22 = -var8 + class80.field901;
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
                            var29 += class80.field901;
                        }
                        if (var29 > class80.field901) {
                            var29 -= class80.field901;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var30[0] >= ~var29 && ~var30[1] <= ~var29) {
                                var25 = var27[2];
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class80.field901;
                                    }
                                    if (~class80.field901 > ~var31) {
                                        var31 -= class80.field901;
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
                                            if (var31 < var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 != 0) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class80.field901;
                                            } else {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method4277(var7 + var38, var4, -var35 + var25, -var38 + var39, (byte) 122, var21, var35);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            ++var26;
                            if (~var26 <= ~var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var23 + var25 > class291.field4285) {
                        var23 = -var25 + class291.field4285;
                    } else {
                        var10 = false;
                    }
                    if (class80.field901 != var24) {
                        int[] var41 = var19[var13++];
                        var41[2] = var25 - -var23;
                        var41[1] = var24;
                        var41[0] = var8;
                        this.method4277(var6 + var8, var4, var23, var22, (byte) 92, var21, var25);
                        var8 = var24;
                    } else {
                        this.method4277(var6 + var8, var4, var23, var22, (byte) 116, var21, var25);
                        if (var10) {
                            break label124;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[0] = var8;
                        var42[2] = var23 + var25;
                        var42[1] = var24;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var7 = var6;
                        var13 = 0;
                        var6 = class427.method2573(var21, class80.field901, -91);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class80.field901 + var5;
                        }
                        var9 = 0;
                        if (~class80.field901 > ~var44) {
                            var44 -= class80.field901;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                var11 = false;
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
        if (arg1) {
            field10662 = 5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[[IIIBLjava/util/Random;I)V")
    private final void method4277(int arg0, int[][] arg1, int arg2, int arg3, byte arg4, Random arg5, int arg6) {
        ++field10664;
        if (arg4 <= 78) {
            this.field10672 = 57;
        }
        int var8 = ~this.field10675 >= -1 ? 4096 : -class427.method2573(arg5, this.field10675, -101) + 4096;
        int var9 = this.field10676 * this.field10660 >> 12;
        int var10 = this.field10660 + -(~var9 >= -1 ? 0 : class427.method2573(arg5, var9, -80));
        if (~class80.field901 >= ~arg0) {
            arg0 -= class80.field901;
        }
        if (var10 > 0) {
            if (~arg2 < -1 && ~arg3 < -1) {
                int var11 = arg3 / 2;
                int var12 = arg2 / 2;
                int var13 = ~var10 >= ~var11 ? var10 : var11;
                int var14 = ~var12 <= ~var10 ? var10 : var12;
                int var15 = arg0 + var13;
                int var16 = arg3 - var13 * 2;
                for (int var17 = 0; ~arg2 < ~var17; ++var17) {
                    int[] var18 = arg1[var17 - -arg6];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field10665 != -1) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class407.method2490(arg0 + var20, class639.field8988)] = var18[class407.method2490(arg0 + arg3 + -1 + -var20, class639.field8988)] = ~var19 >= ~var21 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class407.method2490(class639.field8988, arg0 + var22)] = var18[class407.method2490(-var22 + -1 + arg0 + arg3, class639.field8988)] = var19 * var24 >> 12;
                            }
                        }
                        if (~(var15 + var16) >= ~class80.field901) {
                            class335.method2121(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class80.field901;
                            class335.method2121(var18, var15, var23, var19);
                            class335.method2121(var18, 0, var16 - var23, var19);
                        }
                    } else {
                        int var25 = -var17 + -1 + arg2;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field10665 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class407.method2490(class639.field8988, arg0 + var27)] = var18[class407.method2490(arg0 - -arg3 - var27 + -1, class639.field8988)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class407.method2490(class639.field8988, arg0 + var29)] = var18[class407.method2490(class639.field8988, arg0 + -1 - (-arg3 - -var29))] = var31 >= var26 ? var26 : var31;
                                }
                            }
                            if (~(var15 + var16) >= ~class80.field901) {
                                class335.method2121(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class80.field901;
                                class335.method2121(var18, var15, var30, var26);
                                class335.method2121(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class407.method2490(class639.field8988, arg0 - -var32)] = var18[class407.method2490(class639.field8988, arg3 + -1 + arg0 + -var32)] = var8 * var32 / var13;
                            }
                            if (var15 + var16 > class80.field901) {
                                int var33 = -var15 + class80.field901;
                                class335.method2121(var18, var15, var33, var8);
                                class335.method2121(var18, 0, var16 - var33, var8);
                            } else {
                                class335.method2121(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg0 + arg3 > class80.field901) {
            int var34 = class80.field901 - arg0;
            for (int var35 = 0; ~var35 > ~arg2; ++var35) {
                int[] var36 = arg1[arg6 + var35];
                class335.method2121(var36, arg0, var34, var8);
                class335.method2121(var36, 0, -var34 + arg3, var8);
            }
        } else {
            for (int var37 = 0; ~arg2 < ~var37; ++var37) {
                class335.method2121(arg1[arg6 + var37], arg0, arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        ++field10671;
        int var2 = 38 / ((arg0 - 50) / 41);
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class775() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "(B)V")
    public static void method4278(byte arg0) {
        field10668 = null;
        int var1 = -14 / ((arg0 - -16) / 48);
        field10679 = null;
        field10667 = null;
    }
}
