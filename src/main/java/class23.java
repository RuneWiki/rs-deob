import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class23 extends class315 {

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "Llh;")
    public class59 field423;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    private static int field404 = 0;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    private static int field408 = 0;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    private static int field405;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    private static int field414;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    private static int field415;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    private static int field420;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "[I")
    private int[] field426;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFFFFFLsf;II)V")
    public final void method198(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class421 arg6, int arg7, int arg8) {
        if (this.field423.method425()) {
            throw new IllegalStateException();
        }
        this.method201(arg0, arg1, arg2, arg3, arg4, arg5);
        class158 var10 = (class158) arg6;
        this.method203(var10.field1988, var10.field1987, field405 - arg7, -arg8 - (field417 - field414));
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()I")
    public final int method199() {
        return this.field425 + this.field419 + this.field407;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFFFFF)V")
    private final void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field425 + this.field419 + this.field407;
        int var8 = this.field412 + this.field400 + this.field396;
        if (this.field419 != var7 || this.field412 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field400 * var11;
            float var14 = (float) this.field400 * var12;
            float var15 = (float) this.field425 * var9;
            float var16 = (float) this.field425 * var10;
            float var17 = (float) this.field407 * -var9;
            float var18 = (float) this.field407 * -var10;
            float var19 = (float) this.field396 * -var11;
            float var20 = (float) this.field396 * -var12;
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
        if (var23 < (float) this.field423.field881) {
            var23 = (float) this.field423.field881;
        }
        if (var24 > (float) this.field423.field911) {
            var24 = (float) this.field423.field911;
        }
        if (var25 < (float) this.field423.field884) {
            var25 = (float) this.field423.field884;
        }
        if (var26 > (float) this.field423.field883) {
            var26 = (float) this.field423.field883;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field409 = this.field423.field889;
        field398 = (int) ((float) ((int) var25 * field409) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field413 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field419 / var29);
        field397 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field412 / var30);
        field401 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field419 / var30);
        field410 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field412 / var29);
        field415 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field420 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field421 = (this.field419 >> 1 << 12) + (field420 * field401 >> 4);
        field399 = (this.field412 >> 1 << 12) + (field420 * field410 >> 4);
        field406 = field415 * field413 >> 4;
        field424 = field415 * field397 >> 4;
        field405 = (int) var23;
        field428 = (int) var27;
        field414 = (int) var25;
        field417 = (int) var28;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "()I")
    public final int method202() {
        return this.field412;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([I[III)V")
    public abstract void method203(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)V")
    public abstract void method204(int arg0, int arg1);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIII)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3) {
        this.field425 = arg0;
        this.field400 = arg1;
        this.field407 = arg2;
        this.field396 = arg3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method206(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field423.method425()) {
            throw new IllegalStateException();
        }
        this.method201(arg0, arg1, arg2, arg3, arg4, arg5);
        field411 = arg7;
        if (arg6 != 0) {
            field427 = arg7 >>> 24;
            field418 = 256 - field427;
            if (arg6 == 1) {
                field403 = (arg7 & 0xFF0000) >> 16;
                field402 = (arg7 & 0xFF00) >> 8;
                field416 = arg7 & 0xFF;
            } else {
                field408 = arg7 >>> 24;
                field404 = 256 - field408;
                int var10 = (arg7 & 0xFF00FF) * field404 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field404 & 0xFF0000;
                field422 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method204(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method204(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method204(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method204(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method204(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method204(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method204(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method204(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method204(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "()I")
    public final int method207() {
        return this.field412 + this.field400 + this.field396;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
    public final int method208() {
        return this.field419;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILsf;II)V")
    public abstract void method209(int arg0, int arg1, class421 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Llh;II)V")
    public class23(class59 arg0, int arg1, int arg2) {
        this.field423 = arg0;
        this.field419 = arg1;
        this.field412 = arg2;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
    public final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field423.method425()) {
            throw new IllegalStateException();
        }
        if (this.field426 == null) {
            this.field426 = new int[4];
        }
        this.field423.method474(this.field426);
        this.field423.method460(this.field423.field881, this.field423.field884, arg0 + arg2, arg1 + arg3);
        int var8 = this.method199();
        int var9 = this.method207();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method211(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field423.method462(this.field426[0], this.field426[1], this.field426[2], this.field426[3]);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
    public abstract void method211(int arg0, int arg1, int arg2, int arg3, int arg4);
}
