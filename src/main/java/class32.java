import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public abstract class class32 extends class16 {

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "Lcv;")
    public class399 field426;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field405 = 0;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    private static int field425 = 0;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    private static int field431 = 0;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field411 = 0;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    private static int field410;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    private static int field414;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    private static int field430;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    private static int field433;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "[I")
    private int[] field418;

    @OriginalMember(owner = "client!vo", name = "ma", descriptor = "()I", line = 6)
    public final int method98() {
        return this.field420;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(FFFFFFLma;II)V", line = 23)
    public final void method86(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        if (this.field426.method2413()) {
            throw new IllegalStateException();
        }
        this.method195(arg0, arg1, arg2, arg3, arg4, arg5);
        class487 var10 = (class487) arg6;
        this.method194(var10.field7123, var10.field7124, field433 - arg7, -arg8 - (field404 - field430));
    }

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "()I", line = 33)
    public final int method84() {
        return this.field436 + this.field406 + this.field419;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(FFFFFF)V", line = 40)
    private final void method195(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field436 + this.field406 + this.field419;
        int var8 = this.field424 + this.field420 + this.field434;
        if (this.field436 != var7 || this.field420 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field424 * var11;
            float var14 = (float) this.field424 * var12;
            float var15 = (float) this.field406 * var9;
            float var16 = (float) this.field406 * var10;
            float var17 = (float) this.field419 * -var9;
            float var18 = (float) this.field419 * -var10;
            float var19 = (float) this.field434 * -var11;
            float var20 = (float) this.field434 * -var12;
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
        if (var23 < (float) this.field426.field5842) {
            var23 = this.field426.field5842;
        }
        if (var24 > (float) this.field426.field5869) {
            var24 = this.field426.field5869;
        }
        if (var25 < (float) this.field426.field5861) {
            var25 = this.field426.field5861;
        }
        if (var26 > (float) this.field426.field5859) {
            var26 = this.field426.field5859;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field412 = this.field426.field5839;
        field413 = (int) ((float) ((int) var25 * field412) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field415 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field436 / var29);
        field407 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field420 / var30);
        field429 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field436 / var30);
        field432 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field420 / var29);
        field414 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field410 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field417 = (this.field436 >> 1 << 12) + (field429 * field410 >> 4);
        field428 = (this.field420 >> 1 << 12) + (field432 * field410 >> 4);
        field421 = field415 * field414 >> 4;
        field416 = field414 * field407 >> 4;
        field433 = (int) var23;
        field422 = (int) var27;
        field430 = (int) var25;
        field404 = (int) var28;
    }

    @OriginalMember(owner = "client!vo", name = "MA", descriptor = "(IIII)V", line = 173)
    public final void method97(int arg0, int arg1, int arg2, int arg3) {
        this.field406 = arg0;
        this.field424 = arg1;
        this.field419 = arg2;
        this.field434 = arg3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(FFFFFFIII)V", line = 179)
    public final void method101(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field426.method2413()) {
            throw new IllegalStateException();
        }
        this.method195(arg0, arg1, arg2, arg3, arg4, arg5);
        field409 = arg7;
        if (arg6 != 1) {
            field435 = arg7 >>> 24;
            field423 = 256 - field435;
            if (arg6 == 0) {
                field408 = (arg7 & 0xFF0000) >> 16;
                field411 = (arg7 & 0xFF00) >> 8;
                field405 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field425 = arg7 >>> 24;
                field431 = 256 - field425;
                int var10 = (arg7 & 0xFF00FF) * field431 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field431 & 0xFF0000;
                field427 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method196(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method196(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method196(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method196(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method196(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method196(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method196(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method196(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method196(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method196(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method196(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method196(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "()I", line = 277)
    public final int method93() {
        return this.field424 + this.field420 + this.field434;
    }

    @OriginalMember(owner = "client!vo", name = "JA", descriptor = "(IIIIIII)V", line = 285)
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field426.method2413()) {
            throw new IllegalStateException();
        }
        if (this.field418 == null) {
            this.field418 = new int[4];
        }
        this.field426.method234(this.field418);
        this.field426.method250(this.field426.field5842, this.field426.field5861, arg0 + arg2, arg1 + arg3);
        int var8 = this.method84();
        int var9 = this.method93();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method100(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field426.method279(this.field418[0], this.field418[1], this.field418[2], this.field418[3]);
    }

    @OriginalMember(owner = "client!vo", name = "la", descriptor = "()I", line = 352)
    public final int method102() {
        return this.field436;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lcv;II)V", line = 364)
    public class32(class399 arg0, int arg1, int arg2) {
        this.field426 = arg0;
        this.field436 = arg1;
        this.field420 = arg2;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([I[III)V")
    public abstract void method194(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "(IIIII)V")
    public abstract void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILma;II)V")
    public abstract void method95(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)V")
    public abstract void method196(int arg0, int arg1);
}
