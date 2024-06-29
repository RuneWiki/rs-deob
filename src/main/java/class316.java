import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class316 extends class528 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Lin;")
    public class59 field4507;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field4511 = 0;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field4524 = 0;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    private static int field4534 = 0;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    private static int field4525 = 0;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field4535 = 0;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field4532 = 0;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    private static int field4508;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    private static int field4513;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    private static int field4516;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    private static int field4518;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "[I")
    private int[] field4538;

    @OriginalMember(owner = "client!wr", name = "YA", descriptor = "(IIIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILea;II)V")
    public abstract void method138(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([I[III)V")
    public abstract void method1580(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wr", name = "ka", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        this.field4537 = arg0;
        this.field4522 = arg1;
        this.field4529 = arg2;
        this.field4519 = arg3;
    }

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "(IIIIIII)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4507.method490()) {
            throw new IllegalStateException();
        }
        if (this.field4538 == null) {
            this.field4538 = new int[4];
        }
        this.field4507.method505(this.field4538);
        this.field4507.method480(this.field4507.field1032, this.field4507.field1027, arg0 + arg2, arg1 + arg3);
        int var8 = this.method134();
        int var9 = this.method131();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method133(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4507.method509(this.field4538[0], this.field4538[1], this.field4538[2], this.field4538[3]);
    }

    @OriginalMember(owner = "client!wr", name = "JA", descriptor = "()I")
    public final int method131() {
        return this.field4533 + this.field4522 + this.field4519;
    }

    @OriginalMember(owner = "client!wr", name = "qa", descriptor = "()I")
    public final int method139() {
        return this.field4533;
    }

    @OriginalMember(owner = "client!wr", name = "ja", descriptor = "()I")
    public final int method134() {
        return this.field4537 + this.field4512 + this.field4529;
    }

    @OriginalMember(owner = "client!wr", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4507.method490()) {
            throw new IllegalStateException();
        }
        this.method1988(arg0, arg1, arg2, arg3, arg4, arg5);
        field4539 = arg7;
        if (arg6 != 1) {
            field4532 = arg7 >>> 24;
            field4535 = 256 - field4532;
            if (arg6 == 0) {
                field4520 = (arg7 & 0xFF0000) >> 16;
                field4524 = (arg7 & 0xFF00) >> 8;
                field4511 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field4525 = arg7 >>> 24;
                field4534 = 256 - field4525;
                int var10 = (arg7 & 0xFF00FF) * field4534 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4534 & 0xFF0000;
                field4517 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1581(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1581(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1581(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1581(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1581(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1581(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method1581(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1581(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1581(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1581(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1581(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1581(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFFF)V")
    private final void method1988(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4537 + this.field4512 + this.field4529;
        int var8 = this.field4533 + this.field4522 + this.field4519;
        if (this.field4512 != var7 || this.field4533 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4522 * var11;
            float var14 = (float) this.field4522 * var12;
            float var15 = (float) this.field4537 * var9;
            float var16 = (float) this.field4537 * var10;
            float var17 = (float) this.field4529 * -var9;
            float var18 = (float) this.field4529 * -var10;
            float var19 = (float) this.field4519 * -var11;
            float var20 = (float) this.field4519 * -var12;
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
        if (var23 < (float) this.field4507.field1032) {
            var23 = this.field4507.field1032;
        }
        if (var24 > (float) this.field4507.field1041) {
            var24 = this.field4507.field1041;
        }
        if (var25 < (float) this.field4507.field1027) {
            var25 = this.field4507.field1027;
        }
        if (var26 > (float) this.field4507.field1002) {
            var26 = this.field4507.field1002;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4530 = this.field4507.field1029;
        field4536 = (int) ((float) ((int) var25 * field4530) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4523 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4512 / var29);
        field4521 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4533 / var30);
        field4528 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4512 / var30);
        field4509 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4533 / var29);
        field4513 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4508 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4527 = (this.field4512 >> 1 << 12) + (field4528 * field4508 >> 4);
        field4515 = (this.field4533 >> 1 << 12) + (field4509 * field4508 >> 4);
        field4514 = field4523 * field4513 >> 4;
        field4531 = field4521 * field4513 >> 4;
        field4518 = (int) var23;
        field4526 = (int) var27;
        field4516 = (int) var25;
        field4510 = (int) var28;
    }

    @OriginalMember(owner = "client!wr", name = "UA", descriptor = "()I")
    public final int method137() {
        return this.field4512;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method144(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        if (this.field4507.method490()) {
            throw new IllegalStateException();
        }
        this.method1988(arg0, arg1, arg2, arg3, arg4, arg5);
        class33 var10 = (class33) arg6;
        this.method1580(var10.field512, var10.field517, field4518 - arg7, -arg8 - (field4510 - field4516));
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
    public abstract void method1581(int arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lin;II)V")
    public class316(class59 arg0, int arg1, int arg2) {
        this.field4507 = arg0;
        this.field4512 = arg1;
        this.field4533 = arg2;
    }
}
