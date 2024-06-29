import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class197 extends class270 {

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "Z")
    public boolean field3378 = false;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "Z")
    public boolean field3375 = true;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    private int field3379 = 0;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Lgo;")
    public class85 field3363;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "Lil;")
    public class65 field3381;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Lh;")
    public class240 field3373;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Lig;")
    public class195 field3353;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "J")
    private long field3369;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Z")
    public static boolean field3370 = false;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    private int field3354;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    private int field3356;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    private int field3357;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    private int field3358;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    private int field3359;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    private int field3364;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    private int field3372;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(JBZIII)V", line = 10)
    public final void method1489(long arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3362++;
        if (this.field3378) {
            arg2 = false;
        } else if (this.field3353.field3282 > class65.field1055) {
            arg2 = false;
        } else if (class65.field1021 > class287.field4582[class65.field1055]) {
            arg2 = false;
        } else if (this.field3385 == this.field3374 && this.field3385 == this.field3376 && this.field3372 == this.field3366 && this.field3366 == this.field3351 && this.field3377 == this.field3358 && this.field3358 == this.field3354) {
            arg2 = false;
        } else if (this.field3353.field3299 != -1) {
            int var8 = (int) (arg0 - this.field3369);
            if (this.field3353.field3281 || this.field3353.field3299 >= var8) {
                var8 %= this.field3353.field3299;
            } else {
                arg2 = false;
            }
            if (!this.field3353.field3293 && var8 < this.field3353.field3309) {
                arg2 = false;
            }
            if (this.field3353.field3293 && var8 >= this.field3353.field3309) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field3379 += (int) (((double) this.field3353.field3291 + (double) (this.field3353.field3275 - this.field3353.field3291) * Math.random()) * (double) arg5);
            if (this.field3379 > 63) {
                int var9 = this.field3379 >> 6;
                this.field3379 &= 0x3F;
                if (this.field3375) {
                    int var10 = this.field3358 - this.field3377;
                    int var11 = this.field3385 - this.field3374;
                    int var12 = this.field3366 - this.field3372;
                    int var13 = this.field3376 - this.field3374;
                    int var14 = this.field3351 - this.field3372;
                    this.field3359 = var11 * var14 - (var12 * var13);
                    int var15 = this.field3354 - this.field3377;
                    this.field3367 = var10 * var13 - (var11 * var15);
                    this.field3356 = var12 * var15 - var10 * var14;
                    while (true) {
                        if (this.field3356 <= 32767 && this.field3367 <= 32767 && this.field3359 <= 32767 && this.field3356 >= -32767 && this.field3367 >= -32767 && this.field3359 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field3359 * this.field3359 + this.field3367 * this.field3367 + this.field3356 * this.field3356));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field3356 = this.field3356 * 32767 / var16;
                            this.field3359 = this.field3359 * 32767 / var16;
                            this.field3367 = this.field3367 * 32767 / var16;
                            if (this.field3353.field3277 > 0 || this.field3353.field3310 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field3359, (double) this.field3356) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field3367, Math.sqrt((double) (this.field3359 * this.field3359 + this.field3356 * this.field3356))) * 2047.0D / 6.283185307179586D);
                                this.field3364 = this.field3353.field3277 - this.field3353.field3300;
                                int var20 = var18 - this.field3381.field1038;
                                this.field3357 = var20 + this.field3353.field3300 - (this.field3364 / 2);
                                this.field3365 = this.field3353.field3310 - this.field3353.field3283;
                                this.field3352 = this.field3353.field3283 + var19 - this.field3365 / 2;
                            } else if (this.field3381.field1038 != 0) {
                                int var17 = this.field3359 * arg4 + this.field3356 * arg3 >> 16;
                                this.field3359 = this.field3359 * arg3 - this.field3356 * arg4 >> 16;
                                this.field3356 = var17;
                            }
                            this.field3375 = false;
                            break;
                        }
                        this.field3356 >>= 0x1;
                        this.field3359 >>= 0x1;
                        this.field3367 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3353.field3277 <= 0 && this.field3353.field3310 <= 0) {
                        var22 = this.field3359;
                        var23 = this.field3356;
                        var24 = this.field3367;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field3364) + this.field3357;
                        int var26 = var25 & 0x7FF;
                        int var27 = this.field3352 + ((int) ((double) this.field3365 * Math.random()));
                        int var28 = class62.field962[var26] >> 1;
                        int var29 = class62.field961[var26] >> 1;
                        int var30 = var27 & 0x3FF;
                        int var31 = class62.field962[var30] >> 1;
                        var22 = var28 * var31 >> 15;
                        var23 = var29 * var31 >> 15;
                        int var32 = class62.field961[var30] >> 1;
                        var24 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field3376 * var36 + this.field3374 * var33 + (this.field3385 * var35) >> 8;
                    int var38 = this.field3366 * var35 + this.field3372 * var33 + this.field3351 * var36 >> 8;
                    int var39 = this.field3358 * var35 + (this.field3377 * var33 + (this.field3354 * var36)) >> 8;
                    if (this.field3381.field1038 != 0) {
                        int var40 = arg4 * var39 + (arg3 * var37) >> 16;
                        var39 = arg3 * var39 - (arg4 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = this.field3353.field3303 + ((int) (Math.random() * (double) (this.field3353.field3259 - this.field3353.field3303)));
                    int var42 = this.field3353.field3263 + ((int) ((double) (this.field3353.field3311 - this.field3353.field3263) * Math.random()));
                    int var43;
                    if (this.field3353.field3322) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field3353.field3319 * var44 + (double) this.field3353.field3304) << 16 | (int) ((double) this.field3353.field3279 * var44 + (double) this.field3353.field3325) << 8 | (int) ((double) this.field3353.field3261 * var44 + (double) this.field3353.field3292) | (int) ((double) this.field3353.field3294 * var44 + (double) this.field3353.field3307) << 24;
                    } else {
                        var43 = (int) ((double) this.field3353.field3279 * Math.random() + (double) this.field3353.field3325) << 8 | (int) ((double) this.field3353.field3319 * Math.random() + (double) this.field3353.field3304) << 16 | (int) (Math.random() * (double) this.field3353.field3261 + (double) this.field3353.field3292) | (int) (Math.random() * (double) this.field3353.field3294 + (double) this.field3353.field3307) << 24;
                    }
                    if (class65.field1016 == class65.field1013) {
                        new class315(this, this.field3381.field1057 + var37, this.field3381.field1040 + var38, this.field3381.field1053 + var39, var23, var24, var22, var41, var42, var43);
                    } else {
                        class315 var47 = class65.field1031[class65.field1016];
                        class65.field1016 = class65.field1016 + 1 & 0x3FF;
                        var47.method2167(this, this.field3381.field1057 + var37, this.field3381.field1040 - -var38, this.field3381.field1053 + var39, var23, var24, var22, var41, var42, var43);
                    }
                }
            }
        }
        this.field3382 = 0;
        for (class315 var48 = (class315) this.field3373.method1685((byte) 120); var48 != null; var48 = (class315) this.field3373.method1688(0)) {
            var48.method2170(arg0, arg5);
            this.field3382++;
        }
        class65.field1023 += this.field3382;
        if (arg1 != -114) {
            this.method1491(1, false, 118, -7, -39, 57, 50, 116, 113, 73);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V", line = 248)
    public static final void method1490(int arg0, long[] arg1, Object[] arg2) {
        if (arg0 < 11) {
            field3370 = true;
        }
        class188.method1434(arg1, arg1.length - 1, 31385, 0, arg2);
        field3384++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIIIIIII)V", line = 266)
    public final void method1491(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3355++;
        this.field3351 = arg6;
        this.field3354 = arg0;
        this.field3385 = arg3;
        this.field3376 = arg9;
        this.field3377 = arg5;
        this.field3372 = arg4;
        this.field3366 = arg8;
        this.field3374 = arg7;
        if (arg1) {
            this.field3352 = -126;
        }
        int var11 = (this.field3374 + this.field3385 + this.field3376) / 3 + this.field3381.field1057;
        int var12 = (this.field3372 + this.field3351 + this.field3366) / 3 + this.field3381.field1040;
        this.field3358 = arg2;
        int var13 = (this.field3377 + this.field3354 + this.field3358) / 3 + this.field3381.field1053;
        if (this.field3360 != var11 || this.field3380 != var12 || this.field3383 != var13) {
            this.field3383 = var13;
            this.field3360 = var11;
            this.field3375 = true;
            this.field3380 = var12;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lgo;Lil;J)V", line = 325)
    public class197(class85 arg0, class65 arg1, long arg2) {
        this.field3363 = arg0;
        this.field3381 = arg1;
        this.field3373 = new class240();
        this.field3379 = (int) ((double) this.field3379 + Math.random() * 64.0D);
        this.field3353 = this.field3363.field1360;
        this.field3369 = arg2;
    }
}
