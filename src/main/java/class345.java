import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class345 extends class627 {

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "Lup;")
    private class521 field4460;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "Lbm;")
    private class684 field4461;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "Lpk;")
    private class621 field4465;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    private int field4457;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    private int field4452;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    private int field4472;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "[[F")
    private float[][] field4453;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "[[F")
    private float[][] field4455;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "[[F")
    private float[][] field4459;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "Lu;")
    private class60 field4456;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "Lru;")
    private class246 field4464;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "Lsga;")
    private class583 field4468;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4473;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4471;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "Lmq;")
    public static class78 field4467 = new class78(91, 4);

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "I")
    public static int field4470 = -1;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII[[ZI)V")
    public final void method2023(byte arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        int var6 = -111 % ((arg0 - 77) / 40);
        field4458++;
        if (this.field4464 == null || this.field4457 > (arg2 + arg4) || arg2 - arg4 > this.field4452 || this.field4472 > arg1 + arg4 || arg1 - arg4 > this.field4454) {
            return;
        }
        for (int var7 = this.field4472; var7 <= this.field4454; var7++) {
            for (int var8 = this.field4457; var8 <= this.field4452; var8++) {
                int var9 = var8 - arg2;
                int var10 = var7 - arg1;
                if (var9 > (-arg4) && var9 < arg4 && (-arg4) < var10 && var10 < arg4 && arg3[arg4 + var9][arg4 + var10]) {
                    this.field4461.method3770((byte) ((int) (this.field4465.method3405(false) * 255.0F)), (byte) -120);
                    this.field4461.method1407(this.field4456, (byte) -117, 0);
                    this.field4461.method1436(14522, this.field4461.field9662);
                    this.field4461.method1415(0, class260.field3301, (byte) 106, 0, this.field4462 / 3, this.field4464, this.field4469);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public static void method2024(int arg0) {
        if (arg0 == 1) {
            field4467 = null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIII)V")
    private final void method2025(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4466++;
        long var8 = -1L;
        int var10 = (arg3 << this.field4460.field5570) + arg5;
        int var11 = arg2 + (arg6 << this.field4460.field5570);
        int var12 = this.field4460.method2382((byte) 19, var11, var10);
        if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class627 var13 = this.field4468.method3248(var8, 0);
            if (var13 != null) {
                this.method2026(arg1 + 255, ((class397) var13).field5516);
                return;
            }
        }
        short var14 = (short) (this.field4469++);
        if (var8 != -1L) {
            this.field4468.method3249(var8, new class397(var14), (byte) 40);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg2 == 0) {
            var15 = this.field4459[arg4][arg0];
            var16 = this.field4455[arg4][arg0];
            var17 = this.field4453[arg4][arg0];
        } else if (this.field4460.field5561 == arg5 && arg2 == 0) {
            var16 = this.field4455[arg4 + 1][arg0];
            var17 = this.field4453[arg4 + 1][arg0];
            var15 = this.field4459[arg4 + 1][arg0];
        } else if (this.field4460.field5561 == arg5 && this.field4460.field5561 == arg2) {
            var16 = this.field4455[arg4 + 1][arg0 + 1];
            var15 = this.field4459[arg4 + 1][arg0 + 1];
            var17 = this.field4453[arg4 + 1][arg0 + 1];
        } else if (arg5 == 0 && this.field4460.field5561 == arg2) {
            var16 = this.field4455[arg4][arg0 + 1];
            var17 = this.field4453[arg4][arg0 + 1];
            var15 = this.field4459[arg4][arg0 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field4460.field5561;
            float var19 = (float) arg2 / (float) this.field4460.field5561;
            float var20 = this.field4455[arg4][arg0];
            float var21 = this.field4453[arg4][arg0];
            float var22 = this.field4459[arg4][arg0];
            float var23 = this.field4455[arg4 + 1][arg0];
            float var24 = this.field4453[arg4 + 1][arg0];
            float var25 = (this.field4455[arg4 + 1][arg0 + 1] - var23) * var18 + var23;
            float var26 = (this.field4455[arg4][arg0 + 1] - var20) * var18 + var20;
            float var27 = (this.field4453[arg4][arg0 + 1] - var21) * var18 + var21;
            float var28 = (this.field4459[arg4][arg0 + 1] - var22) * var18 + var22;
            float var29 = this.field4459[arg4 + 1][arg0];
            float var30 = (this.field4453[arg4 + 1][arg0 + 1] - var24) * var18 + var24;
            var16 = (var25 - var26) * var19 + var26;
            var17 = (var30 - var27) * var19 + var27;
            float var31 = (this.field4459[arg4 + 1][arg0 + 1] - var29) * var18 + var29;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field4465.method3402(true) - var10);
        float var33 = (float) (this.field4465.method3403((byte) 6) - var12);
        float var34 = (float) (this.field4465.method3404(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field4465.method3399((byte) -108);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if ((float) arg1 > var42) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4465.method3401(4);
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
        if (Stream.method2226()) {
            this.field4473.method2229((float) var10);
            this.field4473.method2229((float) var12);
            this.field4473.method2229((float) var11);
        } else {
            this.field4473.method2237((float) var10);
            this.field4473.method2237((float) var12);
            this.field4473.method2237((float) var11);
        }
        if (this.field4461.field9608 == 0) {
            this.field4473.method2227(var47);
            this.field4473.method2227(var46);
            this.field4473.method2227(var45);
        } else {
            this.field4473.method2227(var45);
            this.field4473.method2227(var46);
            this.field4473.method2227(var47);
        }
        this.field4473.method2227(255);
        this.method2026(255, var14);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IS)V")
    private final void method2026(int arg0, short arg1) {
        field4463++;
        if (Stream.method2226()) {
            this.field4471.method2233(arg1);
        } else {
            this.field4471.method2224(arg1);
        }
        if (arg0 != 255) {
            this.field4473 = null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lbm;Lup;Lpk;[I)V")
    public class345(class684 arg0, class521 arg1, class621 arg2, int[] arg3) {
        this.field4460 = arg1;
        this.field4461 = arg0;
        this.field4465 = arg2;
        int var5 = this.field4465.method3399((byte) -108) - (arg1.field5561 >> 1);
        this.field4457 = this.field4465.method3402(true) - var5 >> arg1.field5570;
        this.field4452 = var5 + this.field4465.method3402(true) >> arg1.field5570;
        this.field4472 = this.field4465.method3404(-1) - var5 >> arg1.field5570;
        this.field4454 = this.field4465.method3404(-1) + var5 >> arg1.field5570;
        int var6 = this.field4452 + 1 - this.field4457;
        int var7 = this.field4454 + 1 - this.field4472;
        this.field4453 = new float[var6 + 1][var7 + 1];
        this.field4455 = new float[var6 + 1][var7 + 1];
        this.field4459 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field4472 + var8;
            if (var27 > 0 && this.field4460.field5562 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field4457 + var28;
                    if (var29 > 0 && (this.field4460.field5569 - 1) > var29) {
                        int var30 = arg1.method2381(-105, var29 + 1, var27) - arg1.method2381(-99, var29 - 1, var27);
                        int var31 = arg1.method2381(-113, var29, var27 + 1) - arg1.method2381(-102, var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field4455[var28][var8] = (float) var30 * var32;
                        this.field4453[var28][var8] = var32 * -256.0F;
                        this.field4459[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field4472; var10 <= this.field4454; var10++) {
            if (var10 >= 0 && arg1.field5562 > var10) {
                for (int var23 = this.field4457; var23 <= this.field4452; var23++) {
                    if (var23 >= 0 && var23 < arg1.field5569) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7354[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field4462 += 3;
                                    }
                                }
                            } else {
                                this.field4462 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field4452 - this.field4457;
            }
        }
        if (this.field4462 <= 0) {
            this.field4456 = null;
            this.field4464 = null;
        } else {
            this.field4468 = new class583(class353.method2103(109, this.field4462));
            this.field4464 = this.field4461.method1412(false, true);
            this.field4464.method818(this.field4462, (byte) -120);
            NativeHeapBuffer var11 = this.field4461.method3740(-3317, this.field4462 * 16, false);
            this.field4473 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field4464.method1518((byte) 86, true);
                } while (var12 == null);
                this.field4471 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field4472; var15 <= this.field4454; var15++) {
                    if (var15 >= 0 && arg1.field5562 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field4457; var17 <= this.field4452; var17++) {
                            if (var17 >= 0 && arg1.field5569 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7354[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7353[var17][var15];
                                        int[] var21 = arg1.field7334[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2025(var13, 0, var21[var22], var17, var16, var20[var22], var15);
                                                    var22++;
                                                    this.method2025(var13, 0, var21[var22], var17, var16, var20[var22], var15);
                                                    var22++;
                                                    this.method2025(var13, 0, var21[var22], var17, var16, var20[var22], var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2025(var13, 0, 0, var17, var16, 0, var15);
                                        this.method2025(var13, 0, 0, var17, var16, arg1.field5561, var15);
                                        this.method2025(var13, 0, arg1.field5561, var17, var16, 0, var15);
                                    } else if (var18 == 2) {
                                        this.method2025(var13, 0, 0, var17, var16, arg1.field5561, var15);
                                        this.method2025(var13, 0, arg1.field5561, var17, var16, arg1.field5561, var15);
                                        this.method2025(var13, 0, 0, var17, var16, 0, var15);
                                    } else if (var18 == 5) {
                                        this.method2025(var13, 0, arg1.field5561, var17, var16, arg1.field5561, var15);
                                        this.method2025(var13, 0, arg1.field5561, var17, var16, 0, var15);
                                        this.method2025(var13, 0, 0, var17, var16, arg1.field5561, var15);
                                    } else if (var18 == 4) {
                                        this.method2025(var13, 0, arg1.field5561, var17, var16, 0, var15);
                                        this.method2025(var13, 0, 0, var17, var16, 0, var15);
                                        this.method2025(var13, 0, arg1.field5561, var17, var16, arg1.field5561, var15);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field4452 - this.field4457;
                    }
                    var13++;
                }
                this.field4471.method2223();
                if (this.field4464.method1517((byte) 119)) {
                    this.field4473.method2223();
                    this.field4456 = this.field4461.method1423(115, false);
                    this.field4456.method473(8660, this.field4469 * 16, 16, var11);
                    break;
                }
                this.field4473.method2234(0);
                this.field4468.method3251(false);
            }
        }
        this.field4471 = null;
        this.field4473 = null;
        this.field4455 = this.field4453 = this.field4459 = null;
        this.field4468 = null;
    }
}
