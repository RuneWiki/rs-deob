import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class602 extends class680 {

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Ljf;")
    public class217 field8385;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field8384;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public int field8405;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    private static int field8381 = 0;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field8393 = 0;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field8391 = 0;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field8400 = 0;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8378 = 0;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    private static int field8403 = 0;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field8386 = 0;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field8408 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    private static int field8377;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    private static int field8380;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field8390;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    private static int field8396;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field8397;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field8398;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    private static int field8404;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public int field8406;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
    private int[] field8388;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()I", line = 25)
    public final int method666() {
        return this.field8397 + this.field8384 + this.field8406;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFF)Z", line = 33)
    private final boolean method3334(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field8397 + this.field8384 + this.field8406;
        int var8 = this.field8405 + this.field8390 + this.field8398;
        if (this.field8384 != var7 || this.field8405 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field8390 * var11;
            float var14 = (float) this.field8390 * var12;
            float var15 = (float) this.field8397 * var9;
            float var16 = (float) this.field8397 * var10;
            float var17 = (float) this.field8406 * -var9;
            float var18 = (float) this.field8406 * -var10;
            float var19 = (float) this.field8398 * -var11;
            float var20 = (float) this.field8398 * -var12;
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
        if (var23 < (float) this.field8385.field2653) {
            var23 = this.field8385.field2653;
        }
        if (var24 > (float) this.field8385.field2651) {
            var24 = this.field8385.field2651;
        }
        if (var25 < (float) this.field8385.field2639) {
            var25 = this.field8385.field2639;
        }
        if (var26 > (float) this.field8385.field2636) {
            var26 = this.field8385.field2636;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field8389 = this.field8385.field2649;
        field8402 = (int) ((float) ((int) var25 * field8389) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field8395 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field8384 / var29);
        field8387 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field8405 / var30);
        field8392 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field8384 / var30);
        field8379 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field8405 / var29);
        field8377 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field8396 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field8401 = (this.field8384 >> 1 << 12) + (field8396 * field8392 >> 4);
        field8394 = (this.field8405 >> 1 << 12) + (field8396 * field8379 >> 4);
        field8376 = field8395 * field8377 >> 4;
        field8407 = field8387 * field8377 >> 4;
        field8404 = (int) var23;
        field8399 = (int) var27;
        field8380 = (int) var25;
        field8382 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I", line = 170)
    public final int method676() {
        return this.field8405;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFIIII)V", line = 175)
    public final void method668(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8385.method1215()) {
            throw new IllegalStateException();
        } else if (this.method3334(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field8383 = arg7;
            if (arg6 != 1) {
                field8400 = arg7 >>> 24;
                field8393 = 256 - field8400;
                if (arg6 == 0) {
                    field8386 = (arg7 & 0xFF0000) >> 16;
                    field8408 = (arg7 & 0xFF00) >> 8;
                    field8378 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field8381 = arg7 >>> 24;
                    field8403 = 256 - field8381;
                    int var11 = (arg7 & 0xFF00FF) * field8403 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field8403 & 0xFF0000;
                    field8391 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1010(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1010(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1010(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1010(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1010(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1010(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1010(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1010(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1010(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1010(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1010(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1010(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()I", line = 277)
    public final int method663() {
        return this.field8405 + this.field8390 + this.field8398;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIIII)V", line = 283)
    public final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8385.method1215()) {
            throw new IllegalStateException();
        }
        if (this.field8388 == null) {
            this.field8388 = new int[4];
        }
        this.field8385.method398(this.field8388);
        this.field8385.method385(this.field8385.field2653, this.field8385.field2639, arg0 + arg2, arg1 + arg3);
        int var8 = this.method666();
        int var9 = this.method663();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method677(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field8385.method426(this.field8388[0], this.field8388[1], this.field8388[2], this.field8388[3]);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 322)
    public final void method673(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        if (this.field8385.method1215()) {
            throw new IllegalStateException();
        } else if (this.method3334(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class582 var11 = (class582) arg7;
            this.method1012(var11.field8154, var11.field8156, field8404 - arg8, -arg9 - (field8382 - field8380));
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(IIII)V", line = 358)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
        this.field8397 = arg0;
        this.field8390 = arg1;
        this.field8406 = arg2;
        this.field8398 = arg3;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljf;II)V", line = 363)
    public class602(class217 arg0, int arg1, int arg2) {
        this.field8385 = arg0;
        this.field8384 = arg1;
        this.field8405 = arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([I)V", line = 370)
    public final void method667(int[] arg0) {
        arg0[0] = this.field8397;
        arg0[1] = this.field8390;
        arg0[2] = this.field8406;
        arg0[3] = this.field8398;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()I", line = 379)
    public final int method674() {
        return this.field8384;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([I[III)V")
    public abstract void method1012(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
    public abstract void method1010(int arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method672(int arg0, int arg1, class487 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public abstract void method677(int arg0, int arg1, int arg2, int arg3, int arg4);
}
