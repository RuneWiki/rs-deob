import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class322 extends class180 {

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "Lrc;")
    private class488 field4422;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "Lch;")
    private class223 field4424;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "Lqi;")
    private class458 field4418;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    private int field4427;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    private int field4415;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    private int field4417;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    private int field4420;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "[[F")
    private float[][] field4425;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "[[F")
    private float[][] field4426;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "[[F")
    private float[][] field4416;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Lla;")
    private class220 field4413;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "Luk;")
    private class143 field4421;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Luk;")
    private class143 field4410;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "Lhm;")
    private class28 field4419;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Llk;")
    private class425 field4411;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "Lfi;")
    private class402 field4414;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Lsq;")
    private class454 field4409;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    private int field4412;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    private int field4423;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BS)V", line = 13)
    private final void method1941(byte arg0, short arg1) {
        if (arg0 <= 68) {
            this.field4423 = 33;
        }
        if (this.field4418.field6400) {
            this.field4411.method2462(arg1, (byte) -123);
        } else {
            this.field4411.method2506(arg1, (byte) 63);
        }
        this.field4423++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[[ZIB)V", line = 33)
    public final void method1942(int arg0, int arg1, boolean[][] arg2, int arg3, byte arg4) {
        if (this.field4419 == null || arg3 + arg1 < this.field4427 || this.field4415 < (arg3 - arg1) || this.field4417 > (arg0 + arg1) || arg0 - arg1 > this.field4420) {
            return;
        }
        if (arg4 >= -50) {
            this.method1942(-85, -58, (boolean[][]) ((boolean[][]) null), 60, (byte) -42);
        }
        for (int var6 = this.field4417; var6 <= this.field4420; var6++) {
            for (int var7 = this.field4427; var7 <= this.field4415; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg0;
                if (var8 > (-arg1) && var8 < arg1 && var9 > -arg1 && arg1 > var9 && arg2[arg1 + var8][var9 + arg1]) {
                    this.field4418.method2649((int) (this.field4422.field6880 * 255.0F) << 24);
                    this.field4418.method2658(this.field4421, (class143) null, this.field4410, (class143) null);
                    this.field4418.method2673(this.field4419, 4, 0, this.field4423);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIBII)V", line = 93)
    private final void method1943(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg0 << this.field4424.field3142) + arg5;
        int var11 = (arg6 << this.field4424.field3142) + arg2;
        int var12 = this.field4424.method701(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class180 var13 = this.field4409.method2614(var8, 112);
            if (var13 != null) {
                this.method1941((byte) 113, ((class476) var13).field6734);
                return;
            }
        }
        short var14 = (short) (this.field4412++);
        if (var8 != -1L) {
            this.field4409.method2620(var8, new class476(var14), false);
        }
        if (arg4 > -55) {
            this.method1943(-105, -2, 14, -38, (byte) -76, -10, 37);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg2 == 0) {
            var15 = this.field4425[arg1][arg3];
            var16 = this.field4426[arg1][arg3];
            var17 = this.field4416[arg1][arg3];
        } else if (this.field4424.field3149 == arg5 && arg2 == 0) {
            var15 = this.field4425[arg1 + 1][arg3];
            var17 = this.field4416[arg1 + 1][arg3];
            var16 = this.field4426[arg1 + 1][arg3];
        } else if (this.field4424.field3149 == arg5 && this.field4424.field3149 == arg2) {
            var16 = this.field4426[arg1 + 1][arg3 + 1];
            var15 = this.field4425[arg1 + 1][arg3 + 1];
            var17 = this.field4416[arg1 + 1][arg3 + 1];
        } else if (arg5 == 0 && this.field4424.field3149 == arg2) {
            var17 = this.field4416[arg1][arg3 + 1];
            var16 = this.field4426[arg1][arg3 + 1];
            var15 = this.field4425[arg1][arg3 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field4424.field3149;
            float var19 = (float) arg2 / (float) this.field4424.field3149;
            float var20 = this.field4425[arg1][arg3];
            float var21 = this.field4426[arg1][arg3];
            float var22 = this.field4416[arg1][arg3];
            float var23 = this.field4425[arg1 + 1][arg3];
            float var24 = this.field4426[arg1 + 1][arg3];
            float var25 = (this.field4425[arg1 + 1][arg3 + 1] - var23) * var18 + var23;
            float var26 = (this.field4416[arg1][arg3 + 1] - var22) * var18 + var22;
            float var27 = (this.field4426[arg1][arg3 + 1] - var21) * var18 + var21;
            float var28 = (this.field4425[arg1][arg3 + 1] - var20) * var18 + var20;
            float var29 = (this.field4426[arg1 + 1][arg3 + 1] - var24) * var18 + var24;
            float var30 = this.field4416[arg1 + 1][arg3];
            var15 = (var25 - var28) * var19 + var28;
            var16 = (var29 - var27) * var19 + var27;
            float var31 = (this.field4416[arg1 + 1][arg3 + 1] - var30) * var18 + var30;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field4422.field6883 - var10);
        float var33 = (float) (this.field4422.field6877 - var12);
        float var34 = (float) (this.field4422.field6879 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field4422.field6878;
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4422.field6886;
        int var45 = (int) ((float) ((var44 & 0xFF626A) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field4418.field6400) {
            this.field4414.method2377((float) var10, (byte) 70);
            this.field4414.method2377((float) var12, (byte) 70);
            this.field4414.method2377((float) var11, (byte) 70);
        } else {
            this.field4414.method2376((float) var10, -126);
            this.field4414.method2376((float) var12, -125);
            this.field4414.method2376((float) var11, -126);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field4414.method2470((byte) -74, var45);
        this.field4414.method2470((byte) -74, var46);
        this.field4414.method2470((byte) -74, var47);
        this.field4414.method2470((byte) -74, 255);
        this.method1941((byte) 86, var14);
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lqi;Lch;Lrc;[I)V", line = 260)
    public class322(class458 arg0, class223 arg1, class488 arg2, int[] arg3) {
        this.field4422 = arg2;
        this.field4424 = arg1;
        this.field4418 = arg0;
        int var5 = this.field4422.field6878 - (arg1.field3149 >> 1);
        this.field4427 = this.field4422.field6883 - var5 >> arg1.field3142;
        this.field4415 = this.field4422.field6883 + var5 >> arg1.field3142;
        this.field4417 = this.field4422.field6879 - var5 >> arg1.field3142;
        this.field4420 = this.field4422.field6879 + var5 >> arg1.field3142;
        int var6 = this.field4415 + 1 - this.field4427;
        int var7 = this.field4420 + 1 - this.field4417;
        this.field4425 = new float[var6 + 1][var7 + 1];
        this.field4426 = new float[var6 + 1][var7 + 1];
        this.field4416 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field4417;
            if (var9 > 0 && var9 < this.field4424.field3728 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field4427 + var10;
                    if (var11 > 0 && var11 < this.field4424.field3729 - 1) {
                        int var12 = arg1.method710(var11 + 1, var9) - arg1.method710(var11 - 1, var9);
                        int var13 = arg1.method710(var11, var9 + 1) - arg1.method710(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var13 * var13) + 65536)));
                        this.field4425[var10][var8] = (float) var12 * var14;
                        this.field4426[var10][var8] = var14 * -256.0F;
                        this.field4416[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field4417; var17 <= this.field4420; var17++) {
            if (var17 >= 0 && arg1.field3728 > var17) {
                for (int var18 = this.field4427; var18 <= this.field4415; var18++) {
                    if (var18 >= 0 && var18 < arg1.field3729) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field3148[var18][var17];
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
                var16 += this.field4415 - this.field4427;
            }
        }
        if (var15 <= 0) {
            this.field4413 = null;
            this.field4421 = null;
            this.field4410 = null;
            this.field4419 = null;
        } else {
            this.field4411 = new class425(var15 * 2);
            this.field4414 = new class402(var15 * 16);
            this.field4409 = new class454(class406.method2388(var15, -105));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field4417; var23 <= this.field4420; var23++) {
                if (var23 >= 0 && var23 < arg1.field3728) {
                    int var24 = 0;
                    for (int var25 = this.field4427; var25 <= this.field4415; var25++) {
                        if (var25 >= 0 && var25 < arg1.field3729) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field3148[var25][var23];
                            int[] var28 = arg1.field3159[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1943(var25, var24, var28[var29], var22, (byte) -114, var27[var29], var23);
                                    }
                                } else if (var26 == 3) {
                                    this.method1943(var25, var24, 0, var22, (byte) -78, 0, var23);
                                    this.method1943(var25, var24, 0, var22, (byte) -96, arg1.field3149, var23);
                                    this.method1943(var25, var24, arg1.field3149, var22, (byte) -62, 0, var23);
                                } else if (var26 == 2) {
                                    this.method1943(var25, var24, 0, var22, (byte) -75, arg1.field3149, var23);
                                    this.method1943(var25, var24, arg1.field3149, var22, (byte) -121, arg1.field3149, var23);
                                    this.method1943(var25, var24, 0, var22, (byte) -86, 0, var23);
                                } else if (var26 == 5) {
                                    this.method1943(var25, var24, arg1.field3149, var22, (byte) -65, arg1.field3149, var23);
                                    this.method1943(var25, var24, arg1.field3149, var22, (byte) -120, 0, var23);
                                    this.method1943(var25, var24, 0, var22, (byte) -83, arg1.field3149, var23);
                                } else if (var26 == 4) {
                                    this.method1943(var25, var24, arg1.field3149, var22, (byte) -112, 0, var23);
                                    this.method1943(var25, var24, 0, var22, (byte) -104, 0, var23);
                                    this.method1943(var25, var24, arg1.field3149, var22, (byte) -59, arg1.field3149, var23);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field4415 - this.field4427;
                }
                var22++;
            }
            this.field4419 = this.field4418.method2645(5123, this.field4411.field5886, this.field4411.field5830, false);
            this.field4413 = this.field4418.method2688(16, this.field4414.field5886, this.field4414.field5830, false);
            this.field4421 = new class143(this.field4418, this.field4413, 5126, 3, 0);
            this.field4410 = new class143(this.field4418, this.field4413, 5121, 4, 12);
        }
        this.field4425 = this.field4426 = this.field4416 = (float[][]) null;
        this.field4414 = null;
        this.field4409 = null;
        this.field4411 = null;
    }
}
