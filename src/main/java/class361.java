import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class361 extends class379 {

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lll;")
    private class385 field4486;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lwg;")
    private class449 field4489;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lkp;")
    private class515 field4481;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    private int field4484;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[[F")
    private float[][] field4479;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[[F")
    private float[][] field4497;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "[[F")
    private float[][] field4492;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    private int field4493;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lje;")
    private class422 field4483;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Loda;")
    private class129 field4494;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Ldj;")
    private class362 field4482;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4485;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4498;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII[[Z)V", line = 6)
    public final void method2107(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        if (arg3 != 0) {
            this.field4491 = -113;
        }
        field4488++;
        if (this.field4483 == null || (arg1 + arg2) < this.field4487 || arg2 - arg1 > this.field4484 || this.field4480 > arg0 + arg1 || (arg0 - arg1) > this.field4478) {
            return;
        }
        for (int var6 = this.field4480; var6 <= this.field4478; var6++) {
            for (int var7 = this.field4487; var7 <= this.field4484; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if (-arg1 < var8 && var8 < arg1 && var9 > (-arg1) && var9 < arg1 && arg4[arg1 + var8][arg1 + var9]) {
                    this.field4489.method2697(false, (byte) ((int) (this.field4481.method3083(118) * 255.0F)));
                    this.field4489.method64(0, this.field4494, 0);
                    this.field4489.method85((byte) 96, this.field4489.field6345);
                    this.field4489.method1(this.field4483, (byte) 10, this.field4491, class67.field920, 0, this.field4493 / 3, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IS)V", line = 74)
    private final void method2108(int arg0, short arg1) {
        if (arg0 < 14) {
            this.field4485 = null;
        }
        if (Stream.method3985()) {
            this.field4498.method3991(arg1);
        } else {
            this.field4498.method3988(arg1);
        }
        field4496++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lbn;II)V", line = 89)
    public static final void method2109(class468 arg0, int arg1, int arg2) {
        if (arg2 >= -25) {
            field4490 = 28;
        }
        field4477++;
        boolean var3 = arg0.method2802(1, -20468) == 1;
        if (var3) {
            class432.field5707[class666.field9157++] = arg1;
        }
        int var4 = arg0.method2802(2, -20468);
        class521 var5 = class61.field825[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field7348 = false;
            } else if (class782.field10790 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class643 var6 = class320.field3971[arg1] = new class643();
                var6.field8769 = (var5.field3455[0] + class620.field8435 >> 6) + (var5.field3453[0] + class632.field8626 >> 6 << 14) + (var5.field808 << 28);
                if (var5.field7392 == -1) {
                    var6.field8770 = var5.field3434.method1100((byte) 25);
                } else {
                    var6.field8770 = var5.field7392;
                }
                var6.field8767 = var5.field7353;
                var6.field8768 = var5.field3377;
                var6.field8771 = var5.field7356;
                if (var5.field7369 > 0) {
                    class210.method1327((byte) -108, var5);
                }
                class61.field825[arg1] = null;
                if (arg0.method2802(1, -20468) != 0) {
                    class779.method4324(arg1, arg0, (byte) -89);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2802(3, -20468);
            int var8 = var5.field3453[0];
            int var9 = var5.field3455[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field7348 = true;
                var5.field7362 = var8;
                var5.field7371 = var9;
            } else {
                var5.method3121(var8, 14, var9, class63.field866[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2802(4, -20468);
            int var11 = var5.field3453[0];
            int var12 = var5.field3455[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field7348 = true;
                var5.field7362 = var11;
                var5.field7371 = var12;
            } else {
                var5.method3121(var11, 66, var12, class63.field866[arg1]);
            }
        } else {
            int var13 = arg0.method2802(1, -20468);
            if (var13 == 0) {
                int var14 = arg0.method2802(12, -20468);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field3453[0] + var16;
                int var19 = var5.field3455[0] + var17;
                if (var3) {
                    var5.field7362 = var18;
                    var5.field7371 = var19;
                    var5.field7348 = true;
                } else {
                    var5.method3121(var18, 108, var19, class63.field866[arg1]);
                }
                var5.field808 = var5.field811 = (byte) (var5.field808 + var15 & 0x3);
                if (class77.method708(var18, -184949524, var19)) {
                    var5.field811++;
                }
                if (class782.field10790 == arg1) {
                    if (class581.field7921 != var5.field808) {
                        class257.field3034 = true;
                    }
                    class581.field7921 = var5.field808;
                }
            } else {
                int var20 = arg0.method2802(30, -20468);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFE031) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field3453[0] + class632.field8626 + var22 & 0x3FFF) - class632.field8626;
                int var25 = (class620.field8435 + var23 + var5.field3455[0] & 0x3FFF) - class620.field8435;
                if (var3) {
                    var5.field7348 = true;
                    var5.field7371 = var25;
                    var5.field7362 = var24;
                } else {
                    var5.method3121(var24, 63, var25, class63.field866[arg1]);
                }
                var5.field808 = var5.field811 = (byte) (var5.field808 + var21 & 0x3);
                if (class77.method708(var24, -184949524, var25)) {
                    var5.field811++;
                }
                if (class782.field10790 == arg1) {
                    class581.field7921 = var5.field808;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)V", line = 418)
    private final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4495++;
        long var8 = -1L;
        int var10 = (arg5 << this.field4486.field3530) + arg4;
        int var11 = (arg0 << this.field4486.field3530) + arg6;
        int var12 = this.field4486.method1730(var10, var11, -1);
        if ((arg4 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class379 var13 = this.field4482.method2121(112, var8);
            if (var13 != null) {
                this.method2108(51, ((class731) var13).field10239);
                return;
            }
        }
        short var14 = (short) (this.field4491++);
        if (var8 != -1L) {
            this.field4482.method2112(new class731(var14), (byte) 6, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg6 == 0) {
            var15 = this.field4497[arg1][arg2];
            var16 = this.field4479[arg1][arg2];
            var17 = this.field4492[arg1][arg2];
        } else if (this.field4486.field3525 == arg4 && arg6 == 0) {
            var15 = this.field4497[arg1 + 1][arg2];
            var17 = this.field4492[arg1 + 1][arg2];
            var16 = this.field4479[arg1 + 1][arg2];
        } else if (this.field4486.field3525 == arg4 && this.field4486.field3525 == arg6) {
            var16 = this.field4479[arg1 + 1][arg2 + 1];
            var17 = this.field4492[arg1 + 1][arg2 + 1];
            var15 = this.field4497[arg1 + 1][arg2 + 1];
        } else if (arg4 == 0 && this.field4486.field3525 == arg6) {
            var15 = this.field4497[arg1][arg2 + 1];
            var16 = this.field4479[arg1][arg2 + 1];
            var17 = this.field4492[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field4486.field3525;
            float var19 = (float) arg6 / (float) this.field4486.field3525;
            float var20 = this.field4479[arg1][arg2];
            float var21 = this.field4497[arg1][arg2];
            float var22 = this.field4492[arg1][arg2];
            float var23 = this.field4479[arg1 + 1][arg2];
            float var24 = this.field4497[arg1 + 1][arg2];
            float var25 = (this.field4497[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var26 = (this.field4497[arg1][arg2 + 1] - var21) * var18 + var21;
            float var27 = (this.field4479[arg1][arg2 + 1] - var20) * var18 + var20;
            float var28 = (this.field4492[arg1][arg2 + 1] - var22) * var18 + var22;
            float var29 = (this.field4479[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var30 = this.field4492[arg1 + 1][arg2];
            var16 = (var29 - var27) * var19 + var27;
            float var31 = (this.field4492[arg1 + 1][arg2 + 1] - var30) * var18 + var30;
            var15 = (var25 - var26) * var19 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field4481.method3084(0) - var10);
        if (arg3 <= 64) {
            return;
        }
        float var33 = (float) (this.field4481.method3086((byte) -90) - var12);
        float var34 = (float) (this.field4481.method3085(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field4481.method3088(21915);
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
        int var44 = this.field4481.method3089(25215);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3985()) {
            this.field4485.method3979((float) var10);
            this.field4485.method3979((float) var12);
            this.field4485.method3979((float) var11);
        } else {
            this.field4485.method3981((float) var10);
            this.field4485.method3981((float) var12);
            this.field4485.method3981((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field4489.field6245 == 0) {
            this.field4485.method3978(var47);
            this.field4485.method3978(var46);
            this.field4485.method3978(var45);
        } else {
            this.field4485.method3978(var45);
            this.field4485.method3978(var46);
            this.field4485.method3978(var47);
        }
        this.field4485.method3978(255);
        this.method2108(16, var14);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lwg;Lll;Lkp;[I)V", line = 604)
    public class361(class449 arg0, class385 arg1, class515 arg2, int[] arg3) {
        this.field4486 = arg1;
        this.field4489 = arg0;
        this.field4481 = arg2;
        int var5 = this.field4481.method3088(21915) - (arg1.field3525 >> 1);
        this.field4487 = this.field4481.method3084(0) - var5 >> arg1.field3530;
        this.field4484 = this.field4481.method3084(0) + var5 >> arg1.field3530;
        this.field4480 = this.field4481.method3085(true) - var5 >> arg1.field3530;
        this.field4478 = var5 + this.field4481.method3085(true) >> arg1.field3530;
        int var6 = this.field4484 + 1 - this.field4487;
        int var7 = this.field4478 + 1 - this.field4480;
        this.field4479 = new float[var6 + 1][var7 + 1];
        this.field4497 = new float[var6 + 1][var7 + 1];
        this.field4492 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field4480 + var8;
            if (var27 > 0 && var27 < this.field4486.field3524 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field4487 + var28;
                    if (var29 > 0 && (this.field4486.field3533 - 1) > var29) {
                        int var30 = arg1.method1728(var27, (byte) -124, var29 + 1) - arg1.method1728(var27, (byte) -64, var29 - 1);
                        int var31 = arg1.method1728(var27 + 1, (byte) -127, var29) - arg1.method1728(var27 - 1, (byte) -127, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field4479[var28][var8] = (float) var30 * var32;
                        this.field4497[var28][var8] = var32 * -256.0F;
                        this.field4492[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field4480; var10 <= this.field4478; var10++) {
            if (var10 >= 0 && var10 < arg1.field3524) {
                for (int var23 = this.field4487; var23 <= this.field4484; var23++) {
                    if (var23 >= 0 && arg1.field3533 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field4915[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field4493 += 3;
                                    }
                                }
                            } else {
                                this.field4493 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field4484 - this.field4487;
            }
        }
        if (this.field4493 <= 0) {
            this.field4483 = null;
            this.field4494 = null;
        } else {
            this.field4482 = new class362(class783.method4337(this.field4493, (byte) 116));
            this.field4483 = this.field4489.method15(false, false);
            this.field4483.method2529(96, this.field4493);
            NativeHeapBuffer var11 = this.field4489.method2665(this.field4493 * 16, false, (byte) -46);
            this.field4485 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field4483.method2527((byte) -70, true);
                } while (var12 == null);
                this.field4498 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field4480; var15 <= this.field4478; var15++) {
                    if (var15 >= 0 && var15 < arg1.field3524) {
                        int var16 = 0;
                        for (int var17 = this.field4487; var17 <= this.field4484; var17++) {
                            if (var17 >= 0 && arg1.field3533 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field4915[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field4921[var17][var15];
                                        int[] var21 = arg1.field4911[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2110(var15, var16, var13, 98, var20[var22], var17, var21[var22]);
                                                    var22++;
                                                    this.method2110(var15, var16, var13, 109, var20[var22], var17, var21[var22]);
                                                    var22++;
                                                    this.method2110(var15, var16, var13, 73, var20[var22], var17, var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2110(var15, var16, var13, 112, 0, var17, 0);
                                        this.method2110(var15, var16, var13, 121, arg1.field3525, var17, 0);
                                        this.method2110(var15, var16, var13, 67, 0, var17, arg1.field3525);
                                    } else if (var18 == 2) {
                                        this.method2110(var15, var16, var13, 69, arg1.field3525, var17, 0);
                                        this.method2110(var15, var16, var13, 74, arg1.field3525, var17, arg1.field3525);
                                        this.method2110(var15, var16, var13, 113, 0, var17, 0);
                                    } else if (var18 == 5) {
                                        this.method2110(var15, var16, var13, 81, arg1.field3525, var17, arg1.field3525);
                                        this.method2110(var15, var16, var13, 94, 0, var17, arg1.field3525);
                                        this.method2110(var15, var16, var13, 124, arg1.field3525, var17, 0);
                                    } else if (var18 == 4) {
                                        this.method2110(var15, var16, var13, 94, 0, var17, arg1.field3525);
                                        this.method2110(var15, var16, var13, 66, 0, var17, 0);
                                        this.method2110(var15, var16, var13, 119, arg1.field3525, var17, arg1.field3525);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field4484 - this.field4487;
                    }
                    var13++;
                }
                this.field4498.method3992();
                if (this.field4483.method2526(1234)) {
                    this.field4485.method3992();
                    this.field4494 = this.field4489.method57(14, false);
                    this.field4494.method272(var11, this.field4491 * 16, (byte) 34, 16);
                    break;
                }
                this.field4485.method3982(0);
                this.field4482.method2115(0);
            }
        }
        this.field4479 = this.field4497 = this.field4492 = null;
        this.field4498 = null;
        this.field4482 = null;
        this.field4485 = null;
    }
}
