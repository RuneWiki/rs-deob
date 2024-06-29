import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class43 extends class395 {

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "Ld;")
    public class411 field526;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    private static int field529 = 0;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    private static int field534 = 0;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    private static int field530;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
    private static int field533;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    private static int field536;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    private static int field545;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "[I")
    private int[] field547;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field526.method2432()) {
            throw new IllegalStateException();
        }
        if (this.field547 == null) {
            this.field547 = new int[4];
        }
        this.field526.method1500(this.field547);
        this.field526.method1340(this.field526.field5857, this.field526.field5847, arg0 + arg2, arg1 + arg3);
        int var8 = this.method216();
        int var9 = this.method222();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method214(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field526.method1351(this.field547[0], this.field547[1], this.field547[2], this.field547[3]);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()I", line = 43)
    public final int method216() {
        return this.field540 + this.field519 + this.field515;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIII)V", line = 55)
    public final void method219(int arg0, int arg1, int arg2, int arg3) {
        this.field540 = arg0;
        this.field537 = arg1;
        this.field515 = arg2;
        this.field538 = arg3;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "()I", line = 68)
    public final int method220() {
        return this.field519;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(FFFFFFLhg;II)V", line = 72)
    public final void method221(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class313 arg6, int arg7, int arg8) {
        if (this.field526.method2432()) {
            throw new IllegalStateException();
        }
        this.method227(arg0, arg1, arg2, arg3, arg4, arg5);
        class471 var10 = (class471) arg6;
        this.method224(var10.field6637, var10.field6639, field533 - arg7, -arg8 - (field535 - field536));
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "()I", line = 83)
    public final int method222() {
        return this.field537 + this.field527 + this.field538;
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "()I", line = 87)
    public final int method223() {
        return this.field527;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(FFFFFFIII)V", line = 112)
    public final void method226(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field526.method2432()) {
            throw new IllegalStateException();
        }
        this.method227(arg0, arg1, arg2, arg3, arg4, arg5);
        field543 = arg7;
        if (arg6 != 0) {
            field516 = arg7 >>> 24;
            field532 = 256 - field516;
            if (arg6 == 1) {
                field520 = (arg7 & 0xFF0000) >> 16;
                field523 = (arg7 & 0xFF00) >> 8;
                field518 = arg7 & 0xFF;
            } else {
                field534 = arg7 >>> 24;
                field529 = 256 - field534;
                int var10 = (arg7 & 0xFF00FF) * field529 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field529 & 0xFF0000;
                field524 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method218(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method218(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method218(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method218(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method218(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method218(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method218(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method218(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method218(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(FFFFFF)V", line = 205)
    private final void method227(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field540 + this.field519 + this.field515;
        int var8 = this.field537 + this.field527 + this.field538;
        if (this.field519 != var7 || this.field527 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field537 * var11;
            float var14 = (float) this.field537 * var12;
            float var15 = (float) this.field540 * var9;
            float var16 = (float) this.field540 * var10;
            float var17 = (float) this.field515 * -var9;
            float var18 = (float) this.field515 * -var10;
            float var19 = (float) this.field538 * -var11;
            float var20 = (float) this.field538 * -var12;
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
        if (var23 < (float) this.field526.field5857) {
            var23 = (float) this.field526.field5857;
        }
        if (var24 > (float) this.field526.field5839) {
            var24 = (float) this.field526.field5839;
        }
        if (var25 < (float) this.field526.field5847) {
            var25 = (float) this.field526.field5847;
        }
        if (var26 > (float) this.field526.field5838) {
            var26 = (float) this.field526.field5838;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field546 = this.field526.field5860;
        field531 = (int) ((float) ((int) var25 * field546) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field542 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field519 / var29);
        field541 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field527 / var30);
        field539 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field519 / var30);
        field517 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field527 / var29);
        field530 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field545 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field528 = (this.field519 >> 1 << 12) + (field545 * field539 >> 4);
        field525 = (this.field527 >> 1 << 12) + (field545 * field517 >> 4);
        field544 = field542 * field530 >> 4;
        field521 = field541 * field530 >> 4;
        field533 = (int) var23;
        field522 = (int) var27;
        field536 = (int) var25;
        field535 = (int) var28;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ld;II)V", line = 346)
    public class43(class411 arg0, int arg1, int arg2) {
        this.field526 = arg0;
        this.field519 = arg1;
        this.field527 = arg2;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIII)V")
    public abstract void method214(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILhg;II)V")
    public abstract void method217(int arg0, int arg1, class313 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
    public abstract void method218(int arg0, int arg1);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([I[III)V")
    public abstract void method224(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
