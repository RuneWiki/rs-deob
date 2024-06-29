import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class301 extends class67 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lpq;")
    public class342 field4417;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    private static int field4413 = 0;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field4418 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    private static int field4424 = 0;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field4434 = 0;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4416 = 0;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field4440 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    private static int field4431;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    private static int field4435;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    private static int field4437;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    private static int field4438;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
    private int[] field4427;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIIIII)V", line = 19)
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4417.method2237()) {
            throw new IllegalStateException();
        }
        if (this.field4427 == null) {
            this.field4427 = new int[4];
        }
        this.field4417.method1676(this.field4427);
        this.field4417.method1665(this.field4417.field4926, this.field4417.field4951, arg0 + arg2, arg1 + arg3);
        int var8 = this.method411();
        int var9 = this.method409();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method407(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4417.method1767(this.field4427[0], this.field4427[1], this.field4427[2], this.field4427[3]);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()I", line = 62)
    public final int method411() {
        return this.field4442 + this.field4436 + this.field4415;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFFFF)V", line = 66)
    private final void method2061(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4442 + this.field4436 + this.field4415;
        int var8 = this.field4428 + this.field4419 + this.field4423;
        if (this.field4436 != var7 || this.field4419 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4428 * var11;
            float var14 = (float) this.field4428 * var12;
            float var15 = (float) this.field4442 * var9;
            float var16 = (float) this.field4442 * var10;
            float var17 = (float) this.field4415 * -var9;
            float var18 = (float) this.field4415 * -var10;
            float var19 = (float) this.field4423 * -var11;
            float var20 = (float) this.field4423 * -var12;
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
        if (var23 < (float) this.field4417.field4926) {
            var23 = (float) this.field4417.field4926;
        }
        if (var24 > (float) this.field4417.field4946) {
            var24 = (float) this.field4417.field4946;
        }
        if (var25 < (float) this.field4417.field4951) {
            var25 = (float) this.field4417.field4951;
        }
        if (var26 > (float) this.field4417.field4939) {
            var26 = (float) this.field4417.field4939;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4425 = this.field4417.field4922;
        field4430 = (int) ((float) ((int) var25 * field4425) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4443 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4436 / var29);
        field4412 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4419 / var30);
        field4414 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4436 / var30);
        field4420 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4419 / var29);
        field4435 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4437 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4429 = (this.field4436 >> 1 << 12) + (field4437 * field4414 >> 4);
        field4421 = (this.field4419 >> 1 << 12) + (field4437 * field4420 >> 4);
        field4426 = field4443 * field4435 >> 4;
        field4439 = field4435 * field4412 >> 4;
        field4431 = (int) var23;
        field4432 = (int) var27;
        field4438 = (int) var25;
        field4433 = (int) var28;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFFFFIII)V", line = 203)
    public final void method406(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4417.method2237()) {
            throw new IllegalStateException();
        }
        this.method2061(arg0, arg1, arg2, arg3, arg4, arg5);
        field4441 = arg7;
        if (arg6 != 0) {
            field4440 = arg7 >>> 24;
            field4418 = 256 - field4440;
            if (arg6 == 1) {
                field4422 = (arg7 & 0xFF0000) >> 16;
                field4416 = (arg7 & 0xFF00) >> 8;
                field4434 = arg7 & 0xFF;
            } else {
                field4413 = arg7 >>> 24;
                field4424 = 256 - field4413;
                int var10 = (arg7 & 0xFF00FF) * field4424 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4424 & 0xFF0000;
                field4411 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method656(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method656(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method656(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method656(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method656(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method656(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method656(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method656(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method656(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()I", line = 306)
    public final int method398() {
        return this.field4419;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()I", line = 318)
    public final int method409() {
        return this.field4428 + this.field4419 + this.field4423;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()I", line = 321)
    public final int method408() {
        return this.field4436;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lpq;II)V", line = 324)
    public class301(class342 arg0, int arg1, int arg2) {
        this.field4417 = arg0;
        this.field4436 = arg1;
        this.field4419 = arg2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V", line = 331)
    public final void method410(int arg0, int arg1, int arg2, int arg3) {
        this.field4442 = arg0;
        this.field4428 = arg1;
        this.field4415 = arg2;
        this.field4423 = arg3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFFFFLud;II)V", line = 337)
    public final void method404(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class2 arg6, int arg7, int arg8) {
        if (this.field4417.method2237()) {
            throw new IllegalStateException();
        }
        this.method2061(arg0, arg1, arg2, arg3, arg4, arg5);
        class188 var10 = (class188) arg6;
        this.method657(var10.field2523, var10.field2529, field4431 - arg7, -arg8 - (field4433 - field4438));
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([I[III)V")
    public abstract void method657(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
    public abstract void method656(int arg0, int arg1);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public abstract void method407(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILud;II)V")
    public abstract void method403(int arg0, int arg1, class2 arg2, int arg3, int arg4);
}
