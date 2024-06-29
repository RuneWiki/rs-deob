import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class631 extends class298 {

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lfga;")
    public class276 field8492;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public int field8469;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public int field8493;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field8480 = 0;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field8481 = 0;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field8475 = 0;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field8490 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field8470 = 0;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    private static int field8483 = 0;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field8498 = 0;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    private static int field8501 = 0;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private static int field8471;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field8472;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    private static int field8476;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field8479;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field8487;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    private static int field8488;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field8489;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    private static int field8499;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    private int[] field8485;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
    public final int method1952() {
        return this.field8493;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()I")
    public final int method1961() {
        return this.field8493 + this.field8472 + this.field8489;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method3541(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field8487 + this.field8469 + this.field8479;
        int var8 = this.field8493 + this.field8472 + this.field8489;
        if (this.field8469 != var7 || this.field8493 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field8472 * var11;
            float var14 = (float) this.field8472 * var12;
            float var15 = (float) this.field8487 * var9;
            float var16 = (float) this.field8487 * var10;
            float var17 = (float) this.field8479 * -var9;
            float var18 = (float) this.field8479 * -var10;
            float var19 = (float) this.field8489 * -var11;
            float var20 = (float) this.field8489 * -var12;
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
        if (var23 < (float) this.field8492.field4020) {
            var23 = this.field8492.field4020;
        }
        if (var24 > (float) this.field8492.field4012) {
            var24 = this.field8492.field4012;
        }
        if (var25 < (float) this.field8492.field3998) {
            var25 = this.field8492.field3998;
        }
        if (var26 > (float) this.field8492.field4006) {
            var26 = this.field8492.field4006;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field8482 = this.field8492.field4014;
        field8484 = (int) ((float) ((int) var25 * field8482) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field8491 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field8469 / var29);
        field8497 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field8493 / var30);
        field8478 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field8469 / var30);
        field8495 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field8493 / var29);
        field8476 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field8488 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field8486 = (this.field8469 >> 1 << 12) + (field8488 * field8478 >> 4);
        field8494 = (this.field8493 >> 1 << 12) + (field8495 * field8488 >> 4);
        field8477 = field8491 * field8476 >> 4;
        field8500 = field8497 * field8476 >> 4;
        field8471 = (int) var23;
        field8496 = (int) var27;
        field8499 = (int) var25;
        field8474 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "()I")
    public final int method1963() {
        return this.field8487 + this.field8469 + this.field8479;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
    public final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8492.method1860()) {
            throw new IllegalStateException();
        }
        if (this.field8485 == null) {
            this.field8485 = new int[4];
        }
        this.field8492.method1454(this.field8485);
        this.field8492.method1415(this.field8492.field4020, this.field8492.field3998, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1963();
        int var9 = this.method1961();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1013(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field8492.method1544(this.field8485[0], this.field8485[1], this.field8485[2], this.field8485[3]);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
    public final int method1955() {
        return this.field8469;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1962(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class573 arg7, int arg8, int arg9) {
        if (this.field8492.method1860()) {
            throw new IllegalStateException();
        } else if (this.method3541(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class745 var11 = (class745) arg7;
            this.method1012(var11.field10237, var11.field10241, field8471 - arg8, -arg9 - (field8474 - field8499));
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    public final void method1953(int arg0, int arg1, int arg2, int arg3) {
        this.field8487 = arg0;
        this.field8472 = arg1;
        this.field8479 = arg2;
        this.field8489 = arg3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8492.method1860()) {
            throw new IllegalStateException();
        } else if (this.method3541(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field8473 = arg7;
            if (arg6 != 1) {
                field8480 = arg7 >>> 24;
                field8481 = 256 - field8480;
                if (arg6 == 0) {
                    field8470 = (arg7 & 0xFF0000) >> 16;
                    field8475 = (arg7 & 0xFF00) >> 8;
                    field8498 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field8501 = arg7 >>> 24;
                    field8483 = 256 - field8501;
                    int var11 = (arg7 & 0xFF00FF) * field8483 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field8483 & 0xFF0000;
                    field8490 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1009(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1009(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1009(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1009(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1009(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1009(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1009(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1009(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1009(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1009(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1009(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1009(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public abstract void method1013(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[III)V")
    public abstract void method1012(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I)V")
    public final void method1967(int[] arg0) {
        arg0[0] = this.field8487;
        arg0[1] = this.field8472;
        arg0[2] = this.field8479;
        arg0[3] = this.field8489;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
    public abstract void method1009(int arg0, int arg1);

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lfga;II)V")
    public class631(class276 arg0, int arg1, int arg2) {
        this.field8492 = arg0;
        this.field8469 = arg1;
        this.field8493 = arg2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1010(int arg0, int arg1, class573 arg2, int arg3, int arg4);
}
