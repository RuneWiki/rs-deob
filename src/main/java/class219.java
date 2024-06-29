import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class219 extends class107 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lfba;")
    public class24 field3424;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field3412 = 0;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field3408 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private static int field3438 = 0;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    private static int field3436 = 0;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private static int field3418;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private static int field3427;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    private static int field3432;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    private static int field3433;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
    private int[] field3426;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V", line = 7)
    public final void method24(int arg0, int arg1, int arg2, int arg3) {
        this.field3437 = arg0;
        this.field3431 = arg1;
        this.field3421 = arg2;
        this.field3440 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 15)
    public final int method7() {
        return this.field3410;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()I", line = 18)
    public final int method26() {
        return this.field3437 + this.field3410 + this.field3421;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([I)V", line = 21)
    public final void method20(int[] arg0) {
        arg0[0] = this.field3437;
        arg0[1] = this.field3431;
        arg0[2] = this.field3421;
        arg0[3] = this.field3440;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIIII)V", line = 31)
    public final void method17(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3424.method173()) {
            throw new IllegalStateException();
        } else if (this.method1942(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field3434 = arg7;
            if (arg6 != 1) {
                field3422 = arg7 >>> 24;
                field3417 = 256 - field3422;
                if (arg6 == 0) {
                    field3408 = (arg7 & 0xFF0000) >> 16;
                    field3439 = (arg7 & 0xFF00) >> 8;
                    field3412 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field3436 = arg7 >>> 24;
                    field3438 = 256 - field3436;
                    int var11 = (arg7 & 0xFF00FF) * field3438 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field3438 & 0xFF0000;
                    field3413 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method910(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method910(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method910(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method910(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method910(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method910(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method910(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method910(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method910(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method910(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method910(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method910(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFF)Z", line = 152)
    private final boolean method1942(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3437 + this.field3410 + this.field3421;
        int var8 = this.field3431 + this.field3429 + this.field3440;
        if (this.field3410 != var7 || this.field3429 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3431 * var11;
            float var14 = (float) this.field3431 * var12;
            float var15 = (float) this.field3437 * var9;
            float var16 = (float) this.field3437 * var10;
            float var17 = (float) this.field3421 * -var9;
            float var18 = (float) this.field3421 * -var10;
            float var19 = (float) this.field3440 * -var11;
            float var20 = (float) this.field3440 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field3424.field234) {
            var23 = this.field3424.field234;
        }
        if (var24 > (float) this.field3424.field263) {
            var24 = this.field3424.field263;
        }
        if (var25 < (float) this.field3424.field257) {
            var25 = this.field3424.field257;
        }
        if (var26 > (float) this.field3424.field230) {
            var26 = this.field3424.field230;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field3414 = this.field3424.field267;
        field3409 = (int) ((float) ((int) var25 * field3414) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3419 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3410 / var29);
        field3415 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3429 / var30);
        field3428 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3410 / var30);
        field3435 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3429 / var29);
        field3427 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3418 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3416 = (this.field3410 >> 1 << 12) + (field3428 * field3418 >> 4);
        field3420 = (this.field3429 >> 1 << 12) + (field3435 * field3418 >> 4);
        field3425 = field3427 * field3419 >> 4;
        field3430 = field3427 * field3415 >> 4;
        field3433 = (int) var23;
        field3423 = (int) var27;
        field3432 = (int) var25;
        field3411 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()I", line = 286)
    public final int method12() {
        return this.field3431 + this.field3429 + this.field3440;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 293)
    public final void method25(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        if (this.field3424.method173()) {
            throw new IllegalStateException();
        } else if (this.method1942(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class566 var11 = (class566) arg7;
            this.method908(var11.field8234, var11.field8231, field3433 - arg8, -arg9 - (field3411 - field3432));
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()I", line = 314)
    public final int method13() {
        return this.field3429;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V", line = 327)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3424.method173()) {
            throw new IllegalStateException();
        }
        if (this.field3426 == null) {
            this.field3426 = new int[4];
        }
        this.field3424.method201(this.field3426);
        this.field3424.method162(this.field3424.field234, this.field3424.field257, arg0 + arg2, arg1 + arg3);
        int var8 = this.method26();
        int var9 = this.method12();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method19(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3424.method221(this.field3426[0], this.field3426[1], this.field3426[2], this.field3426[3]);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lfba;II)V", line = 378)
    public class219(class24 arg0, int arg1, int arg2) {
        this.field3424 = arg0;
        this.field3410 = arg1;
        this.field3429 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
    public abstract void method910(int arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIIIII)V")
    public abstract void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public abstract void method19(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method9(int arg0, int arg1, class514 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([I[III)V")
    public abstract void method908(int[] arg0, int[] arg1, int arg2, int arg3);
}
