import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class449 extends class264 {

    @OriginalMember(owner = "client!km", name = "x", descriptor = "Lap;")
    private class298 field6553;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "Ldl;")
    private class207 field6563;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "Lks;")
    private class173 field6552;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    private int field6551;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    private int field6562;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    private int field6545;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    private int field6556;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "[[F")
    private float[][] field6560;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "[[F")
    private float[][] field6559;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "[[F")
    private float[][] field6554;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "Lpa;")
    private class352 field6557;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Ld;")
    private class391 field6550;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "Lkd;")
    private class340 field6558;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Lpa;")
    private class352 field6549;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "Lat;")
    private class256 field6561;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Lbp;")
    private class49 field6546;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Ldq;")
    private class90 field6548;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    private int field6547;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    private int field6555;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(SI)V")
    private final void method2759(short arg0, int arg1) {
        if (this.field6552.field2296) {
            this.field6561.method1750((byte) 0, arg0);
        } else {
            this.field6561.method1731(-108, arg0);
        }
        if (arg1 != 4) {
            this.method2761(28, 53, 52, (byte) 17, -2, -16, 46);
        }
        this.field6547++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[[ZIII)V")
    public final void method2760(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 125) {
            this.field6563 = (class207) null;
        }
        if (this.field6550 == null || this.field6551 > (arg2 + arg4) || arg2 - arg4 > this.field6562 || (arg3 + arg4) < this.field6545 || arg3 - arg4 > this.field6556) {
            return;
        }
        for (int var6 = this.field6545; var6 <= this.field6556; var6++) {
            for (int var7 = this.field6551; var7 <= this.field6562; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if ((-arg4) < var8 && var8 < arg4 && (-arg4) < var9 && var9 < arg4 && arg1[var8 + arg4][arg4 + var9]) {
                    this.field6552.method1145((int) (this.field6553.field4335 * 255.0F) << 24);
                    this.field6552.method1192(this.field6557, (class352) null, this.field6549, (class352) null);
                    this.field6552.method1136(this.field6550, 4, 0, this.field6547);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIBIII)V")
    private final void method2761(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        if (arg3 != -90) {
            this.method2761(-64, 84, -65, (byte) -51, 13, -106, -36);
        }
        int var10 = arg6 + (arg5 << this.field6563.field2891);
        int var11 = (arg4 << this.field6563.field2891) + arg2;
        int var12 = this.field6563.method1427(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class264 var13 = this.field6548.method609(var8, arg3 ^ 0xFFFFFF9D);
            if (var13 != null) {
                this.method2759(((class191) var13).field2669, 4);
                return;
            }
        }
        short var14 = (short) (this.field6555++);
        if (var8 != -1L) {
            this.field6548.method606(1, new class191(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field6554[arg1][arg0];
            var16 = this.field6560[arg1][arg0];
            var17 = this.field6559[arg1][arg0];
        } else if (this.field6563.field2903 == arg6 && arg2 == 0) {
            var16 = this.field6560[arg1 + 1][arg0];
            var17 = this.field6559[arg1 + 1][arg0];
            var15 = this.field6554[arg1 + 1][arg0];
        } else if (this.field6563.field2903 == arg6 && this.field6563.field2903 == arg2) {
            var16 = this.field6560[arg1 + 1][arg0 + 1];
            var17 = this.field6559[arg1 + 1][arg0 + 1];
            var15 = this.field6554[arg1 + 1][arg0 + 1];
        } else if (arg6 == 0 && this.field6563.field2903 == arg2) {
            var15 = this.field6554[arg1][arg0 + 1];
            var17 = this.field6559[arg1][arg0 + 1];
            var16 = this.field6560[arg1][arg0 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field6563.field2903;
            float var19 = (float) arg2 / (float) this.field6563.field2903;
            float var20 = this.field6554[arg1][arg0];
            float var21 = this.field6559[arg1][arg0];
            float var22 = this.field6560[arg1][arg0];
            float var23 = this.field6554[arg1 + 1][arg0];
            float var24 = this.field6559[arg1 + 1][arg0];
            float var25 = this.field6560[arg1 + 1][arg0];
            float var26 = (this.field6559[arg1][arg0 + 1] - var21) * var18 + var21;
            float var27 = (this.field6554[arg1][arg0 + 1] - var20) * var18 + var20;
            float var28 = (this.field6554[arg1 + 1][arg0 + 1] - var23) * var18 + var23;
            float var29 = (this.field6560[arg1][arg0 + 1] - var22) * var18 + var22;
            float var30 = (this.field6559[arg1 + 1][arg0 + 1] - var24) * var18 + var24;
            var15 = (var28 - var27) * var19 + var27;
            var17 = (var30 - var26) * var19 + var26;
            float var31 = (this.field6560[arg1 + 1][arg0 + 1] - var25) * var18 + var25;
            var16 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field6553.field4337 - var10);
        float var33 = (float) (this.field6553.field4338 - var12);
        float var34 = (float) (this.field6553.field4336 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field6553.field4332;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6553.field4342;
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6552.field2296) {
            this.field6546.method389(arg3 + 163, (float) var10);
            this.field6546.method389(-111, (float) var12);
            this.field6546.method389(21, (float) var11);
        } else {
            this.field6546.method388((byte) 56, (float) var10);
            this.field6546.method388((byte) 56, (float) var12);
            this.field6546.method388((byte) 56, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6546.method1727(arg3 - 38, var45);
        this.field6546.method1727(arg3 - 38, var46);
        this.field6546.method1727(arg3 - 38, var47);
        this.field6546.method1727(-128, 255);
        this.method2759(var14, 4);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lks;Ldl;Lap;[I)V")
    public class449(class173 arg0, class207 arg1, class298 arg2, int[] arg3) {
        this.field6553 = arg2;
        this.field6563 = arg1;
        this.field6552 = arg0;
        int var5 = this.field6553.field4332 - (arg1.field2903 >> 1);
        this.field6551 = this.field6553.field4337 - var5 >> arg1.field2891;
        this.field6562 = this.field6553.field4337 + var5 >> arg1.field2891;
        this.field6545 = this.field6553.field4336 - var5 >> arg1.field2891;
        this.field6556 = this.field6553.field4336 + var5 >> arg1.field2891;
        int var6 = this.field6562 + 1 - this.field6551;
        int var7 = this.field6556 + 1 - this.field6545;
        this.field6560 = new float[var6 + 1][var7 + 1];
        this.field6559 = new float[var6 + 1][var7 + 1];
        this.field6554 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field6545 + var8;
            if (var9 > 0 && var9 < (this.field6563.field5540 - 1)) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field6551 + var10;
                    if (var11 > 0 && var11 < this.field6563.field5538 - 1) {
                        int var12 = arg1.method1429(var11 + 1, var9) - arg1.method1429(var11 - 1, var9);
                        int var13 = arg1.method1429(var11, var9 + 1) - arg1.method1429(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field6554[var10][var8] = (float) var12 * var14;
                        this.field6559[var10][var8] = var14 * -256.0F;
                        this.field6560[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field6545; var17 <= this.field6556; var17++) {
            if (var17 >= 0 && var17 < arg1.field5540) {
                for (int var18 = this.field6551; var18 <= this.field6562; var18++) {
                    if (var18 >= 0 && arg1.field5538 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field2907[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field6562 - this.field6551;
            }
        }
        if (var15 <= 0) {
            this.field6557 = null;
            this.field6550 = null;
            this.field6558 = null;
            this.field6549 = null;
        } else {
            this.field6561 = new class256(var15 * 2);
            this.field6546 = new class49(var15 * 16);
            this.field6548 = new class90(class289.method1938((byte) 66, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field6545; var23 <= this.field6556; var23++) {
                if (var23 >= 0 && var23 < arg1.field5540) {
                    int var24 = 0;
                    for (int var25 = this.field6551; var25 <= this.field6562; var25++) {
                        if (var25 >= 0 && arg1.field5538 > var25) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field2907[var25][var23];
                            int[] var28 = arg1.field2906[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method2761(var21, var24, var28[var29], (byte) -90, var23, var25, var27[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method2761(var21, var24, 0, (byte) -90, var23, var25, 0);
                                    this.method2761(var21, var24, 0, (byte) -90, var23, var25, arg1.field2903);
                                    this.method2761(var21, var24, arg1.field2903, (byte) -90, var23, var25, 0);
                                } else if (var26 == 2) {
                                    this.method2761(var21, var24, 0, (byte) -90, var23, var25, arg1.field2903);
                                    this.method2761(var21, var24, arg1.field2903, (byte) -90, var23, var25, arg1.field2903);
                                    this.method2761(var21, var24, 0, (byte) -90, var23, var25, 0);
                                } else if (var26 == 5) {
                                    this.method2761(var21, var24, arg1.field2903, (byte) -90, var23, var25, arg1.field2903);
                                    this.method2761(var21, var24, arg1.field2903, (byte) -90, var23, var25, 0);
                                    this.method2761(var21, var24, 0, (byte) -90, var23, var25, arg1.field2903);
                                } else if (var26 == 4) {
                                    this.method2761(var21, var24, arg1.field2903, (byte) -90, var23, var25, 0);
                                    this.method2761(var21, var24, 0, (byte) -90, var23, var25, 0);
                                    this.method2761(var21, var24, arg1.field2903, (byte) -90, var23, var25, arg1.field2903);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field6562 - this.field6551;
                }
                var21++;
            }
            this.field6550 = this.field6552.method1181(5123, this.field6561.field3764, this.field6561.field3762, false);
            this.field6558 = this.field6552.method1165(16, this.field6546.field3764, this.field6546.field3762, false);
            this.field6557 = new class352(this.field6552, this.field6558, 5126, 3, 0);
            this.field6549 = new class352(this.field6552, this.field6558, 5121, 4, 12);
        }
        this.field6561 = null;
        this.field6554 = this.field6559 = this.field6560 = (float[][]) null;
        this.field6548 = null;
        this.field6546 = null;
    }
}
