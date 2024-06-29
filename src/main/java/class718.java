import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class718 extends class337 {

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "Lrd;")
    private class574 field9440;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Lgu;")
    private class757 field9427;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "Lgd;")
    private class696 field9442;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    private int field9423;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    private int field9437;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    private int field9428;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    private int field9430;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "[[F")
    private float[][] field9419;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "[[F")
    private float[][] field9441;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[[F")
    private float[][] field9421;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    private int field9438;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Ljj;")
    private class688 field9434;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lcq;")
    private class233 field9424;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lrda;")
    private class467 field9417;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9433;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9420;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    private int field9431;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field9432 = 0;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "[Lui;")
    public static class327[] field9426 = new class327[50];

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Z")
    public static boolean field9436 = false;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lne;")
    public static class166 field9422;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
    public static final int method3849(int arg0, int arg1) {
        field9429++;
        return arg1 >= -65 ? 7 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLmc;)Lms;")
    public static final class422 method3850(boolean arg0, class234 arg1) {
        if (arg0) {
            method3850(false, null);
        }
        field9425++;
        return new class422(arg1.method1542(27067), arg1.method1542(27067), arg1.method1542(27067), arg1.method1542(27067), arg1.method1542(27067), arg1.method1542(27067), arg1.method1542(27067), arg1.method1542(27067), arg1.method1500((byte) -90), arg1.method1509(true));
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[[ZBI)V")
    public final void method3851(int arg0, int arg1, boolean[][] arg2, byte arg3, int arg4) {
        field9418++;
        if (this.field9434 == null || this.field9423 > (arg1 + arg4) || this.field9437 < arg4 - arg1 || this.field9428 > arg0 + arg1) {
            return;
        }
        if (arg3 > -60) {
            method3849(-60, -9);
        }
        if (this.field9430 < arg0 - arg1) {
            return;
        }
        for (int var6 = this.field9428; var6 <= this.field9430; var6++) {
            for (int var7 = this.field9423; var7 <= this.field9437; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg0;
                if (var8 > -arg1 && var8 < arg1 && -arg1 < var9 && var9 < arg1 && arg2[arg1 + var8][arg1 + var9]) {
                    this.field9442.method3769(-194934736, (byte) ((int) (this.field9427.method4120(48) * 255.0F)));
                    this.field9442.method1200((byte) -115, 0, this.field9424);
                    this.field9442.method1150(this.field9442.field9235, 0);
                    this.field9442.method1151(0, this.field9431, 0, class279.field3624, false, this.field9434, this.field9438 / 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(SI)V")
    private final void method3852(short arg0, int arg1) {
        field9439++;
        if (Stream.method2528()) {
            this.field9420.method2525(arg0);
        } else {
            this.field9420.method2516(arg0);
        }
        if (arg1 != 1) {
            this.field9434 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIZ)V")
    private final void method3853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9435++;
        long var8 = -1L;
        int var10 = arg1 + (arg0 << this.field9440.field4372);
        int var11 = (arg3 << this.field9440.field4372) + arg4;
        int var12 = this.field9440.method2072((byte) -36, var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class337 var13 = this.field9417.method2616(var8, (byte) 68);
            if (var13 != null) {
                this.method3852(((class97) var13).field1310, 1);
                return;
            }
        }
        short var14 = (short) (this.field9431++);
        if (var8 != -1L) {
            this.field9417.method2619(new class97(var14), var8, -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg4 == 0) {
            var15 = this.field9419[arg5][arg2];
            var16 = this.field9441[arg5][arg2];
            var17 = this.field9421[arg5][arg2];
        } else if (this.field9440.field4369 == arg1 && arg4 == 0) {
            var16 = this.field9441[arg5 + 1][arg2];
            var15 = this.field9419[arg5 + 1][arg2];
            var17 = this.field9421[arg5 + 1][arg2];
        } else if (this.field9440.field4369 == arg1 && this.field9440.field4369 == arg4) {
            var17 = this.field9421[arg5 + 1][arg2 + 1];
            var15 = this.field9419[arg5 + 1][arg2 + 1];
            var16 = this.field9441[arg5 + 1][arg2 + 1];
        } else if (arg1 == 0 && this.field9440.field4369 == arg4) {
            var16 = this.field9441[arg5][arg2 + 1];
            var17 = this.field9421[arg5][arg2 + 1];
            var15 = this.field9419[arg5][arg2 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field9440.field4369;
            float var19 = (float) arg4 / (float) this.field9440.field4369;
            float var20 = this.field9419[arg5][arg2];
            float var21 = this.field9441[arg5][arg2];
            float var22 = this.field9421[arg5][arg2];
            float var23 = this.field9419[arg5 + 1][arg2];
            float var24 = this.field9441[arg5 + 1][arg2];
            float var25 = (this.field9441[arg5 + 1][arg2 + 1] - var24) * var18 + var24;
            float var26 = this.field9421[arg5 + 1][arg2];
            float var27 = (this.field9419[arg5][arg2 + 1] - var20) * var18 + var20;
            float var28 = (this.field9419[arg5 + 1][arg2 + 1] - var23) * var18 + var23;
            float var29 = (this.field9421[arg5][arg2 + 1] - var22) * var18 + var22;
            float var30 = (this.field9441[arg5][arg2 + 1] - var21) * var18 + var21;
            float var31 = (this.field9421[arg5 + 1][arg2 + 1] - var26) * var18 + var26;
            var15 = (var28 - var27) * var19 + var27;
            var16 = (var25 - var30) * var19 + var30;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field9427.method4121((byte) -124) - var10);
        float var33 = (float) (this.field9427.method4117(true) - var12);
        float var34 = (float) (this.field9427.method4123(22290) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field9427.method4122(-128);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9427.method4124(arg6);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF73) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method2528()) {
            this.field9433.method2518((float) var10);
            this.field9433.method2518((float) var12);
            this.field9433.method2518((float) var11);
        } else {
            this.field9433.method2524((float) var10);
            this.field9433.method2524((float) var12);
            this.field9433.method2524((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field9442.field9155 == 0) {
            this.field9433.method2527(var47);
            this.field9433.method2527(var46);
            this.field9433.method2527(var45);
        } else {
            this.field9433.method2527(var45);
            this.field9433.method2527(var46);
            this.field9433.method2527(var47);
        }
        this.field9433.method2527(255);
        this.method3852(var14, 1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method3854(byte arg0) {
        field9426 = null;
        if (arg0 > 34) {
            field9422 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lgd;Lrd;Lgu;[I)V")
    public class718(class696 arg0, class574 arg1, class757 arg2, int[] arg3) {
        this.field9440 = arg1;
        this.field9427 = arg2;
        this.field9442 = arg0;
        int var5 = this.field9427.method4122(-123) - (arg1.field4369 >> 1);
        this.field9423 = this.field9427.method4121((byte) -124) - var5 >> arg1.field4372;
        this.field9437 = this.field9427.method4121((byte) -124) + var5 >> arg1.field4372;
        this.field9428 = this.field9427.method4123(22290) - var5 >> arg1.field4372;
        this.field9430 = var5 + this.field9427.method4123(22290) >> arg1.field4372;
        int var6 = this.field9437 + 1 - this.field9423;
        int var7 = this.field9430 + 1 - this.field9428;
        this.field9419 = new float[var6 + 1][var7 + 1];
        this.field9441 = new float[var6 + 1][var7 + 1];
        this.field9421 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field9428 + var8;
            if (var27 > 0 && this.field9440.field4371 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field9423 + var28;
                    if (var29 > 0 && this.field9440.field4366 - 1 > var29) {
                        int var30 = arg1.method2060(var27, -96, var29 + 1) - arg1.method2060(var27, -94, var29 - 1);
                        int var31 = arg1.method2060(var27 + 1, -124, var29) - arg1.method2060(var27 - 1, -94, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + ((var31 * var31) + 65536))));
                        this.field9419[var28][var8] = (float) var30 * var32;
                        this.field9441[var28][var8] = var32 * -256.0F;
                        this.field9421[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9428; var10 <= this.field9430; var10++) {
            if (var10 >= 0 && arg1.field4371 > var10) {
                for (int var23 = this.field9423; var23 <= this.field9437; var23++) {
                    if (var23 >= 0 && arg1.field4366 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7279[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9438 += 3;
                                    }
                                }
                            } else {
                                this.field9438 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9437 - this.field9423;
            }
        }
        if (this.field9438 <= 0) {
            this.field9434 = null;
            this.field9424 = null;
        } else {
            this.field9417 = new class467(class483.method2714(this.field9438, (byte) -121));
            this.field9434 = this.field9442.method1179(false, 102);
            this.field9434.method2016(this.field9438, 85);
            NativeHeapBuffer var11 = this.field9442.method3790(false, (byte) 20, this.field9438 * 16);
            this.field9433 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9434.method2014(true, true);
                } while (var12 == null);
                this.field9420 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9428; var15 <= this.field9430; var15++) {
                    if (var15 >= 0 && arg1.field4371 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field9423; var17 <= this.field9437; var17++) {
                            if (var17 >= 0 && var17 < arg1.field4366) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field7279[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7270[var17][var15];
                                        int[] var21 = arg1.field7284[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3853(var17, var20[var22], var14, var15, var21[var22], var16, false);
                                                    var22++;
                                                    this.method3853(var17, var20[var22], var14, var15, var21[var22], var16, false);
                                                    var22++;
                                                    this.method3853(var17, var20[var22], var14, var15, var21[var22], var16, false);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3853(var17, 0, var14, var15, 0, var16, false);
                                        this.method3853(var17, arg1.field4369, var14, var15, 0, var16, false);
                                        this.method3853(var17, 0, var14, var15, arg1.field4369, var16, false);
                                    } else if (var18 == 2) {
                                        this.method3853(var17, arg1.field4369, var14, var15, 0, var16, false);
                                        this.method3853(var17, arg1.field4369, var14, var15, arg1.field4369, var16, false);
                                        this.method3853(var17, 0, var14, var15, 0, var16, false);
                                    } else if (var18 == 5) {
                                        this.method3853(var17, arg1.field4369, var14, var15, arg1.field4369, var16, false);
                                        this.method3853(var17, 0, var14, var15, arg1.field4369, var16, false);
                                        this.method3853(var17, arg1.field4369, var14, var15, 0, var16, false);
                                    } else if (var18 == 4) {
                                        this.method3853(var17, 0, var14, var15, arg1.field4369, var16, false);
                                        this.method3853(var17, 0, var14, var15, 0, var16, false);
                                        this.method3853(var17, arg1.field4369, var14, var15, arg1.field4369, var16, false);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field9437 - this.field9423;
                    }
                    var14++;
                }
                this.field9420.method2519();
                if (this.field9434.method2017(28359)) {
                    this.field9433.method2519();
                    this.field9424 = this.field9442.method1162((byte) 31, false);
                    this.field9424.method285(this.field9431 * 16, (byte) 105, 16, var11);
                    break;
                }
                this.field9433.method2523(0);
                this.field9417.method2617(28812);
            }
        }
        this.field9417 = null;
        this.field9420 = null;
        this.field9433 = null;
        this.field9419 = this.field9441 = this.field9421 = null;
    }
}
