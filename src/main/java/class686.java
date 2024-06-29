import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class686 extends class71 {

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "Lrq;")
    private class485 field9531;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "Ldw;")
    private class664 field9525;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "Ltj;")
    private class687 field9537;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    private int field9536;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    private int field9535;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    private int field9544;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    private int field9545;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "[[F")
    private float[][] field9528;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "[[F")
    private float[][] field9543;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "[[F")
    private float[][] field9546;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    private int field9540;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "Lss;")
    private class509 field9542;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "Lpa;")
    private class399 field9548;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "Lbia;")
    private class411 field9539;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lss;")
    private class509 field9526;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "Ldc;")
    private class63 field9529;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "Lbga;")
    private class172 field9530;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lbaa;")
    private class130 field9534;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
    private int field9541;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "Luu;")
    public static class237 field9533;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZIIII)V")
    private final void method3861(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field9527++;
        long var8 = -1L;
        if (arg2) {
            method3863(null, null, (byte) -109);
        }
        int var10 = (arg0 << this.field9531.field4822) + arg1;
        int var11 = (arg5 << this.field9531.field4822) + arg4;
        int var12 = this.field9531.method2172(var10, -1, var11);
        if ((arg1 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class71 var13 = this.field9534.method812(118, var8);
            if (var13 != null) {
                this.method3864((byte) 108, ((class248) var13).field3646);
                return;
            }
        }
        short var14 = (short) (this.field9541++);
        if (var8 != -1L) {
            this.field9534.method820(var8, (byte) -42, new class248(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg4 == 0) {
            var15 = this.field9543[arg6][arg3];
            var16 = this.field9546[arg6][arg3];
            var17 = this.field9528[arg6][arg3];
        } else if (this.field9531.field4818 == arg1 && arg4 == 0) {
            var17 = this.field9528[arg6 + 1][arg3];
            var15 = this.field9543[arg6 + 1][arg3];
            var16 = this.field9546[arg6 + 1][arg3];
        } else if (this.field9531.field4818 == arg1 && this.field9531.field4818 == arg4) {
            var17 = this.field9528[arg6 + 1][arg3 + 1];
            var16 = this.field9546[arg6 + 1][arg3 + 1];
            var15 = this.field9543[arg6 + 1][arg3 + 1];
        } else if (arg1 == 0 && this.field9531.field4818 == arg4) {
            var16 = this.field9546[arg6][arg3 + 1];
            var17 = this.field9528[arg6][arg3 + 1];
            var15 = this.field9543[arg6][arg3 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field9531.field4818;
            float var19 = (float) arg4 / (float) this.field9531.field4818;
            float var20 = this.field9546[arg6][arg3];
            float var21 = this.field9528[arg6][arg3];
            float var22 = this.field9543[arg6][arg3];
            float var23 = this.field9546[arg6 + 1][arg3];
            float var24 = this.field9528[arg6 + 1][arg3];
            float var25 = (this.field9528[arg6 + 1][arg3 + 1] - var24) * var18 + var24;
            float var26 = (this.field9546[arg6 + 1][arg3 + 1] - var23) * var18 + var23;
            float var27 = (this.field9528[arg6][arg3 + 1] - var21) * var18 + var21;
            float var28 = (this.field9543[arg6][arg3 + 1] - var22) * var18 + var22;
            float var29 = (this.field9546[arg6][arg3 + 1] - var20) * var18 + var20;
            float var30 = this.field9543[arg6 + 1][arg3];
            var16 = (var26 - var29) * var19 + var29;
            float var31 = (this.field9543[arg6 + 1][arg3 + 1] - var30) * var18 + var30;
            var17 = (var25 - var27) * var19 + var27;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field9537.method3873((byte) -7) - var10);
        float var33 = (float) (this.field9537.method3867(arg2) - var12);
        float var34 = (float) (this.field9537.method3870(112) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field9537.method3866((byte) -96);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9537.method3868(6);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field9525.field9051) {
            this.field9530.method1102(-732814632, (float) var10);
            this.field9530.method1102(-732814632, (float) var12);
            this.field9530.method1102(-732814632, (float) var11);
        } else {
            this.field9530.method1100((float) var10, -120);
            this.field9530.method1100((float) var12, 85);
            this.field9530.method1100((float) var11, -109);
        }
        this.field9530.method444(var45, 128);
        this.field9530.method444(var46, 128);
        this.field9530.method444(var47, 128);
        this.field9530.method444(255, 128);
        this.method3864((byte) 125, var14);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI[[ZII)V")
    public final void method3862(byte arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field9532++;
        if (this.field9548 == null || this.field9536 > arg3 + arg4 || arg3 - arg4 > this.field9535 || (arg1 + arg4) < this.field9544 || arg0 != 10 || arg1 - arg4 > this.field9545) {
            return;
        }
        for (int var6 = this.field9544; var6 <= this.field9545; var6++) {
            for (int var7 = this.field9536; var7 <= this.field9535; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if ((-arg4) < var8 && var8 < arg4 && var9 > (-arg4) && arg4 > var9 && arg2[arg4 + var8][var9 + arg4]) {
                    this.field9525.method3752((int) (this.field9537.method3871(arg0 ^ 0x3EA1) * 255.0F) << 24, (byte) 86);
                    this.field9525.method3725(this.field9542, (byte) 76, null, null, this.field9526);
                    this.field9525.method3688(0, this.field9540, 4, this.field9548, arg0 - 10);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Luu;Lha;B)V")
    public static final void method3863(class237 arg0, class548 arg1, byte arg2) {
        field9538++;
        class52[] var3 = class52.method381(arg0, class95.field1310, 0);
        class345.field4907 = new class298[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class345.field4907[var4] = arg1.method1496(var3[var4], true);
        }
        class52[] var5 = class52.method381(arg0, class479.field6663, 0);
        class232.field3147 = new class298[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class232.field3147[var6] = arg1.method1496(var5[var6], true);
        }
        class52[] var7 = class52.method381(arg0, class717.field9984, 0);
        class381.field5467 = new class298[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class381.field5467[var8] = arg1.method1496(var7[var8], true);
        }
        class52[] var9 = class52.method381(arg0, class612.field8232, 0);
        class129.field1804 = new class298[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class129.field1804[var10] = arg1.method1496(var9[var10], true);
        }
        class52[] var11 = class52.method381(arg0, class483.field6738, 0);
        class339.field4775 = new class298[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class339.field4775[var12] = arg1.method1496(var11[var12], true);
        }
        class52[] var13 = class52.method381(arg0, class577.field7931, 0);
        class577.field7930 = new class298[var13.length];
        if (arg2 != 80) {
            field9524 = -94;
        }
        for (int var14 = 0; var14 < var13.length; var14++) {
            class577.field7930[var14] = arg1.method1496(var13[var14], true);
        }
        class52[] var15 = class52.method381(arg0, class43.field527, 0);
        class55.field785 = new class298[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class55.field785[var16] = arg1.method1496(var15[var16], true);
        }
        class52[] var17 = class52.method381(arg0, class323.field4477, 0);
        class289.field4129 = new class298[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class289.field4129[var18] = arg1.method1496(var17[var18], true);
        }
        class52[] var19 = class52.method381(arg0, class251.field3672, 0);
        class266.field3897 = new class298[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class266.field3897[var20] = arg1.method1496(var19[var20], true);
        }
        class52[] var21 = class52.method381(arg0, class23.field285, 0);
        class349.field4955 = new class298[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class349.field4955[var22] = arg1.method1496(var21[var22], true);
        }
        class52[] var23 = class52.method381(arg0, class140.field1994, 0);
        class299.field4242 = new class298[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class299.field4242[var24] = arg1.method1496(var23[var24], true);
        }
        class52[] var25 = class52.method381(arg0, class279.field4066, 0);
        class113.field1513 = new class298[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class113.field1513[var26] = arg1.method1496(var25[var26], true);
        }
        class178.field2446 = arg1.method1496(class52.method374(arg0, class15.field141, 0), true);
        class694.field9641 = arg1.method1496(class52.method374(arg0, class85.field1217, 0), true);
        class52[] var27 = class52.method381(arg0, class340.field4812, 0);
        class456.field6317 = new class298[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class456.field6317[var28] = arg1.method1496(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BS)V")
    private final void method3864(byte arg0, short arg1) {
        if (this.field9525.field9051) {
            this.field9529.method492(-2, arg1);
        } else {
            this.field9529.method499(-25094, arg1);
        }
        if (arg0 <= 99) {
            this.method3861(-94, -46, true, 111, 125, -2, -15);
        }
        field9547++;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public static void method3865(boolean arg0) {
        if (arg0) {
            field9533 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ldw;Lrq;Ltj;[I)V")
    public class686(class664 arg0, class485 arg1, class687 arg2, int[] arg3) {
        this.field9531 = arg1;
        this.field9525 = arg0;
        this.field9537 = arg2;
        int var5 = this.field9537.method3866((byte) -68) - (arg1.field4818 >> 1);
        this.field9536 = this.field9537.method3873((byte) -7) - var5 >> arg1.field4822;
        this.field9535 = this.field9537.method3873((byte) -7) + var5 >> arg1.field4822;
        this.field9544 = this.field9537.method3870(113) - var5 >> arg1.field4822;
        this.field9545 = this.field9537.method3870(110) + var5 >> arg1.field4822;
        int var6 = this.field9535 + 1 - this.field9536;
        int var7 = this.field9545 + 1 - this.field9544;
        this.field9528 = new float[var6 + 1][var7 + 1];
        this.field9543 = new float[var6 + 1][var7 + 1];
        this.field9546 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field9544 + var8;
            if (var25 > 0 && var25 < this.field9531.field4817 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field9536 + var26;
                    if (var27 > 0 && var27 < this.field9531.field4814 - 1) {
                        int var28 = arg1.method2171(var25, var27 + 1, 31) - arg1.method2171(var25, var27 - 1, 31);
                        int var29 = arg1.method2171(var25 + 1, var27, 31) - arg1.method2171(var25 - 1, var27, 31);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field9546[var26][var8] = (float) var28 * var30;
                        this.field9528[var26][var8] = var30 * -256.0F;
                        this.field9543[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9544; var10 <= this.field9545; var10++) {
            if (var10 >= 0 && var10 < arg1.field4817) {
                for (int var21 = this.field9536; var21 <= this.field9535; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4814) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field6763[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field9540 += 3;
                                    }
                                }
                            } else {
                                this.field9540 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9535 - this.field9536;
            }
        }
        if (this.field9540 <= 0) {
            this.field9542 = null;
            this.field9548 = null;
            this.field9539 = null;
            this.field9526 = null;
        } else {
            this.field9529 = new class63(this.field9540 * 2);
            this.field9530 = new class172(this.field9540 * 16);
            this.field9534 = new class130(class606.method3450(this.field9540, (byte) -25));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field9544; var13 <= this.field9545; var13++) {
                if (var13 >= 0 && arg1.field4817 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field9536; var15 <= this.field9535; var15++) {
                        if (var15 >= 0 && arg1.field4814 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field6763[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field6749[var15][var13];
                                    int[] var19 = arg1.field6776[var15][var13];
                                    int var20 = 0;
                                    label109: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label109;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method3861(var15, var18[var20], false, var12, var19[var20], var13, var14);
                                                var20++;
                                                this.method3861(var15, var18[var20], false, var12, var19[var20], var13, var14);
                                                var20++;
                                                this.method3861(var15, var18[var20], false, var12, var19[var20], var13, var14);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method3861(var15, 0, false, var12, 0, var13, var14);
                                    this.method3861(var15, arg1.field4818, false, var12, 0, var13, var14);
                                    this.method3861(var15, 0, false, var12, arg1.field4818, var13, var14);
                                } else if (var16 == 2) {
                                    this.method3861(var15, arg1.field4818, false, var12, 0, var13, var14);
                                    this.method3861(var15, arg1.field4818, false, var12, arg1.field4818, var13, var14);
                                    this.method3861(var15, 0, false, var12, 0, var13, var14);
                                } else if (var16 == 5) {
                                    this.method3861(var15, arg1.field4818, false, var12, arg1.field4818, var13, var14);
                                    this.method3861(var15, 0, false, var12, arg1.field4818, var13, var14);
                                    this.method3861(var15, arg1.field4818, false, var12, 0, var13, var14);
                                } else if (var16 == 4) {
                                    this.method3861(var15, 0, false, var12, arg1.field4818, var13, var14);
                                    this.method3861(var15, 0, false, var12, 0, var13, var14);
                                    this.method3861(var15, arg1.field4818, false, var12, arg1.field4818, var13, var14);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field9535 - this.field9536;
                }
                var12++;
            }
            this.field9548 = this.field9525.method3696(0, this.field9529.field954, this.field9529.field956, false, 5123);
            this.field9539 = this.field9525.method3687(false, 16, this.field9530.field954, this.field9530.field956, 22);
            this.field9526 = new class509(this.field9539, 5126, 3, 0);
            this.field9542 = new class509(this.field9539, 5121, 4, 12);
        }
        this.field9534 = null;
        this.field9530 = null;
        this.field9529 = null;
        this.field9546 = this.field9528 = this.field9543 = null;
    }
}
