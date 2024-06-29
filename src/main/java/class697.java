import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class697 extends class362 {

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "Lwga;")
    private class745 field9412;

    @OriginalMember(owner = "client!sea", name = "I", descriptor = "Lqm;")
    private class146 field9424;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "Lab;")
    private class669 field9409;

    @OriginalMember(owner = "client!sea", name = "M", descriptor = "I")
    private int field9428;

    @OriginalMember(owner = "client!sea", name = "F", descriptor = "I")
    private int field9422;

    @OriginalMember(owner = "client!sea", name = "C", descriptor = "I")
    private int field9419;

    @OriginalMember(owner = "client!sea", name = "y", descriptor = "I")
    private int field9415;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "[[F")
    private float[][] field9410;

    @OriginalMember(owner = "client!sea", name = "E", descriptor = "[[F")
    private float[][] field9421;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "[[F")
    private float[][] field9406;

    @OriginalMember(owner = "client!sea", name = "H", descriptor = "I")
    private int field9423;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "Leq;")
    private class213 field9416;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "Luq;")
    private class163 field9407;

    @OriginalMember(owner = "client!sea", name = "L", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9427;

    @OriginalMember(owner = "client!sea", name = "K", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9426;

    @OriginalMember(owner = "client!sea", name = "J", descriptor = "Ltc;")
    private class353 field9425;

    @OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
    private int field9418;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public static int field9411 = 0;

    @OriginalMember(owner = "client!sea", name = "w", descriptor = "I")
    public static int field9413 = 0;

    @OriginalMember(owner = "client!sea", name = "D", descriptor = "Lmu;")
    public static class303 field9420 = new class303(33, 3);

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!sea", name = "x", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!sea", name = "A", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[[ZZI)V", line = 9)
    public final void method3897(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4) {
        field9417++;
        if (this.field9407 == null) {
            return;
        }
        if (arg3) {
            this.method3897(-50, -122, null, true, 25);
        }
        if (this.field9428 > arg1 + arg4 || arg4 - arg1 > this.field9422 || (arg0 + arg1) < this.field9419 || arg0 - arg1 > this.field9415) {
            return;
        }
        for (int var6 = this.field9419; var6 <= this.field9415; var6++) {
            for (int var7 = this.field9428; var7 <= this.field9422; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg0;
                if (var8 > (-arg1) && var8 < arg1 && var9 > -arg1 && arg1 > var9 && arg2[var8 + arg1][arg1 + var9]) {
                    this.field9412.method4134((byte) ((int) (this.field9409.method3756(-37) * 255.0F)), -112);
                    this.field9412.method2263(-123, this.field9425, 0);
                    this.field9412.method2289(0, this.field9412.field10316);
                    this.field9412.method2276(class34.field855, this.field9423 / 3, this.field9407, 0, 0, this.field9418, 116);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIIII)V", line = 75)
    private final void method3898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9408++;
        long var8 = -1L;
        int var10 = (arg1 << this.field9424.field3938) + arg5;
        int var11 = arg3 + (arg4 << this.field9424.field3938);
        int var12 = this.field9424.method1853(var10, var11, (byte) -127);
        if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class362 var13 = this.field9416.method1465(var8, arg2 + 23335);
            if (var13 != null) {
                this.method3899(((class89) var13).field1575, (byte) 49);
                return;
            }
        }
        short var14 = (short) (this.field9418++);
        if (var8 != -1L) {
            this.field9416.method1468((byte) 101, var8, new class89(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg3 == 0) {
            var15 = this.field9421[arg6][arg0];
            var16 = this.field9410[arg6][arg0];
            var17 = this.field9406[arg6][arg0];
        } else if (this.field9424.field3942 == arg5 && arg3 == 0) {
            var15 = this.field9421[arg6 + 1][arg0];
            var17 = this.field9406[arg6 + 1][arg0];
            var16 = this.field9410[arg6 + 1][arg0];
        } else if (this.field9424.field3942 == arg5 && this.field9424.field3942 == arg3) {
            var16 = this.field9410[arg6 + 1][arg0 + 1];
            var17 = this.field9406[arg6 + 1][arg0 + 1];
            var15 = this.field9421[arg6 + 1][arg0 + 1];
        } else if (arg5 == 0 && this.field9424.field3942 == arg3) {
            var17 = this.field9406[arg6][arg0 + 1];
            var15 = this.field9421[arg6][arg0 + 1];
            var16 = this.field9410[arg6][arg0 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field9424.field3942;
            float var19 = (float) arg3 / (float) this.field9424.field3942;
            float var20 = this.field9410[arg6][arg0];
            float var21 = this.field9421[arg6][arg0];
            float var22 = this.field9406[arg6][arg0];
            float var23 = this.field9410[arg6 + 1][arg0];
            float var24 = this.field9421[arg6 + 1][arg0];
            float var25 = (this.field9406[arg6][arg0 + 1] - var22) * var18 + var22;
            float var26 = (this.field9421[arg6][arg0 + 1] - var21) * var18 + var21;
            float var27 = (this.field9421[arg6 + 1][arg0 + 1] - var24) * var18 + var24;
            float var28 = this.field9406[arg6 + 1][arg0];
            float var29 = (this.field9410[arg6][arg0 + 1] - var20) * var18 + var20;
            float var30 = (this.field9410[arg6 + 1][arg0 + 1] - var23) * var18 + var23;
            var16 = (var30 - var29) * var19 + var29;
            var15 = (var27 - var26) * var19 + var26;
            float var31 = (this.field9406[arg6 + 1][arg0 + 1] - var28) * var18 + var28;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field9409.method3759(-1) - var10);
        float var33 = (float) (this.field9409.method3757(126) - var12);
        float var34 = (float) (this.field9409.method3752((byte) 102) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field9409.method3758(-1);
        if (arg2 != -29343) {
            return;
        }
        float var41 = 1.0F - (var40 * var40);
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
        int var44 = this.field9409.method3755(-1);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF76) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3789()) {
            this.field9427.method3780((float) var10);
            this.field9427.method3780((float) var12);
            this.field9427.method3780((float) var11);
        } else {
            this.field9427.method3792((float) var10);
            this.field9427.method3792((float) var12);
            this.field9427.method3792((float) var11);
        }
        if (this.field9412.field10292 == 0) {
            this.field9427.method3793(var47);
            this.field9427.method3793(var46);
            this.field9427.method3793(var45);
        } else {
            this.field9427.method3793(var45);
            this.field9427.method3793(var46);
            this.field9427.method3793(var47);
        }
        this.field9427.method3793(255);
        this.method3899(var14, (byte) 49);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(SB)V", line = 258)
    private final void method3899(short arg0, byte arg1) {
        if (Stream.method3789()) {
            this.field9426.method3790(arg0);
        } else {
            this.field9426.method3779(arg0);
        }
        if (arg1 == 49) {
            field9405++;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V", line = 274)
    public static void method3900(int arg0) {
        field9420 = null;
        if (arg0 != 1) {
            method3900(-34);
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lwga;Lqm;Lab;[I)V", line = 297)
    public class697(class745 arg0, class146 arg1, class669 arg2, int[] arg3) {
        this.field9412 = arg0;
        this.field9424 = arg1;
        this.field9409 = arg2;
        int var5 = this.field9409.method3758(-1) - (arg1.field3942 >> 1);
        this.field9428 = this.field9409.method3759(-1) - var5 >> arg1.field3938;
        this.field9422 = this.field9409.method3759(-1) + var5 >> arg1.field3938;
        this.field9419 = this.field9409.method3752((byte) 124) - var5 >> arg1.field3938;
        this.field9415 = this.field9409.method3752((byte) 72) + var5 >> arg1.field3938;
        int var6 = this.field9422 + 1 - this.field9428;
        int var7 = this.field9415 + 1 - this.field9419;
        this.field9410 = new float[var6 + 1][var7 + 1];
        this.field9421 = new float[var6 + 1][var7 + 1];
        this.field9406 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field9419 + var8;
            if (var27 > 0 && var27 < (this.field9424.field3940 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field9428 + var28;
                    if (var29 > 0 && var29 < this.field9424.field3937 - 1) {
                        int var30 = arg1.method1851((byte) -86, var27, var29 + 1) - arg1.method1851((byte) -86, var27, var29 - 1);
                        int var31 = arg1.method1851((byte) -86, var27 + 1, var29) - arg1.method1851((byte) -86, var27 - 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + (var30 * var30 + 65536))));
                        this.field9410[var28][var8] = (float) var30 * var32;
                        this.field9421[var28][var8] = var32 * -256.0F;
                        this.field9406[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9419; var10 <= this.field9415; var10++) {
            if (var10 >= 0 && arg1.field3940 > var10) {
                for (int var23 = this.field9428; var23 <= this.field9422; var23++) {
                    if (var23 >= 0 && arg1.field3937 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field2419[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9423 += 3;
                                    }
                                }
                            } else {
                                this.field9423 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9422 - this.field9428;
            }
        }
        if (this.field9423 > 0) {
            this.field9416 = new class213(class529.method3059(this.field9423, (byte) 108));
            this.field9407 = this.field9412.method2290(-28633, false);
            this.field9407.method1240(15959, this.field9423);
            NativeHeapBuffer var11 = this.field9412.method4109((byte) 86, false, this.field9423 * 16);
            this.field9427 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9407.method1241(true, false);
                } while (var12 == null);
                this.field9426 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9419; var15 <= this.field9415; var15++) {
                    if (var15 >= 0 && arg1.field3940 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field9428; var17 <= this.field9422; var17++) {
                            if (var17 >= 0 && arg1.field3937 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field2419[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field2444[var17][var15];
                                        int[] var21 = arg1.field2436[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3898(var14, var17, -29343, var21[var22], var15, var20[var22], var16);
                                                    var22++;
                                                    this.method3898(var14, var17, -29343, var21[var22], var15, var20[var22], var16);
                                                    var22++;
                                                    this.method3898(var14, var17, -29343, var21[var22], var15, var20[var22], var16);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3898(var14, var17, -29343, 0, var15, 0, var16);
                                        this.method3898(var14, var17, -29343, 0, var15, arg1.field3942, var16);
                                        this.method3898(var14, var17, -29343, arg1.field3942, var15, 0, var16);
                                    } else if (var18 == 2) {
                                        this.method3898(var14, var17, -29343, 0, var15, arg1.field3942, var16);
                                        this.method3898(var14, var17, -29343, arg1.field3942, var15, arg1.field3942, var16);
                                        this.method3898(var14, var17, -29343, 0, var15, 0, var16);
                                    } else if (var18 == 5) {
                                        this.method3898(var14, var17, -29343, arg1.field3942, var15, arg1.field3942, var16);
                                        this.method3898(var14, var17, -29343, arg1.field3942, var15, 0, var16);
                                        this.method3898(var14, var17, -29343, 0, var15, arg1.field3942, var16);
                                    } else if (var18 == 4) {
                                        this.method3898(var14, var17, -29343, arg1.field3942, var15, 0, var16);
                                        this.method3898(var14, var17, -29343, 0, var15, 0, var16);
                                        this.method3898(var14, var17, -29343, arg1.field3942, var15, arg1.field3942, var16);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field9422 - this.field9428;
                    }
                    var14++;
                }
                this.field9426.method3784();
                if (this.field9407.method1239(-23)) {
                    this.field9427.method3784();
                    this.field9425 = this.field9412.method2300(false, 16711680);
                    this.field9425.method881(var11, 16, this.field9418 * 16, (byte) -108);
                    break;
                }
                this.field9427.method3791(0);
                this.field9416.method1466(0);
            }
        } else {
            this.field9425 = null;
            this.field9407 = null;
        }
        this.field9410 = this.field9421 = this.field9406 = null;
        this.field9427 = null;
        this.field9426 = null;
        this.field9416 = null;
    }
}
