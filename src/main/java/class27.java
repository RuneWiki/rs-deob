import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class27 extends class138 {

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "Lhj;")
    public class113 field427;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    private static int field431 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    private static int field421 = 0;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    private static int field417;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    private static int field433;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    private static int field437;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    private static int field442;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "()I")
    public final int method198() {
        return this.field425 + this.field416 + this.field445;
    }

    @OriginalMember(owner = "client!ts", name = "W", descriptor = "(IIIII)V")
    public abstract void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ts", name = "RA", descriptor = "()I")
    public final int method200() {
        return this.field436 + this.field434 + this.field441;
    }

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field427.method821()) {
            throw new IllegalStateException();
        }
        this.method208(arg0, arg1, arg2, arg3, arg4, arg5);
        field443 = arg7;
        if (arg6 != 1) {
            field444 = arg7 >>> 24;
            field438 = 256 - field444;
            if (arg6 == 0) {
                field435 = (arg7 & 0xFF0000) >> 16;
                field447 = (arg7 & 0xFF00) >> 8;
                field426 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field421 = arg7 >>> 24;
                field431 = 256 - field421;
                int var10 = (arg7 & 0xFF00FF) * field431 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field431 & 0xFF0000;
                field415 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method203(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method203(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method203(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method203(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method203(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method203(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method203(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method203(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method203(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method203(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method203(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method203(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)V")
    public abstract void method203(int arg0, int arg1);

    @OriginalMember(owner = "client!ts", name = "YA", descriptor = "()I")
    public final int method204() {
        return this.field434;
    }

    @OriginalMember(owner = "client!ts", name = "la", descriptor = "(IIIIIII)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field427.method821()) {
            throw new IllegalStateException();
        }
        if (this.field424 == null) {
            this.field424 = new int[4];
        }
        this.field427.method908(this.field424);
        this.field427.method868(this.field427.field1997, this.field427.field2009, arg0 + arg2, arg1 + arg3);
        int var8 = this.method200();
        int var9 = this.method198();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method199(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field427.method829(this.field424[0], this.field424[1], this.field424[2], this.field424[3]);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILta;II)V")
    public abstract void method206(int arg0, int arg1, class448 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([I[III)V")
    public abstract void method207(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFF)V")
    private final void method208(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field436 + this.field434 + this.field441;
        int var8 = this.field425 + this.field416 + this.field445;
        if (this.field434 != var7 || this.field425 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field416 * var11;
            float var14 = (float) this.field416 * var12;
            float var15 = (float) this.field436 * var9;
            float var16 = (float) this.field436 * var10;
            float var17 = (float) this.field441 * -var9;
            float var18 = (float) this.field441 * -var10;
            float var19 = (float) this.field445 * -var11;
            float var20 = (float) this.field445 * -var12;
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
        if (var23 < (float) this.field427.field1997) {
            var23 = this.field427.field1997;
        }
        if (var24 > (float) this.field427.field1988) {
            var24 = this.field427.field1988;
        }
        if (var25 < (float) this.field427.field2009) {
            var25 = this.field427.field2009;
        }
        if (var26 > (float) this.field427.field2026) {
            var26 = this.field427.field2026;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field439 = this.field427.field2008;
        field446 = (int) ((float) ((int) var25 * field439) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field419 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field434 / var29);
        field440 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field425 / var30);
        field423 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field434 / var30);
        field422 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field425 / var29);
        field437 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field442 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field428 = (this.field434 >> 1 << 12) + (field442 * field423 >> 4);
        field432 = (this.field425 >> 1 << 12) + (field442 * field422 >> 4);
        field418 = field437 * field419 >> 4;
        field430 = field440 * field437 >> 4;
        field433 = (int) var23;
        field429 = (int) var27;
        field417 = (int) var25;
        field420 = (int) var28;
    }

    @OriginalMember(owner = "client!ts", name = "ha", descriptor = "(IIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
        this.field436 = arg0;
        this.field416 = arg1;
        this.field441 = arg2;
        this.field445 = arg3;
    }

    @OriginalMember(owner = "client!ts", name = "ZA", descriptor = "()I")
    public final int method210() {
        return this.field425;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8) {
        if (this.field427.method821()) {
            throw new IllegalStateException();
        }
        this.method208(arg0, arg1, arg2, arg3, arg4, arg5);
        class137 var10 = (class137) arg6;
        this.method207(var10.field2308, var10.field2316, field433 - arg7, -arg8 - (field420 - field417));
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lhj;II)V")
    public class27(class113 arg0, int arg1, int arg2) {
        this.field427 = arg0;
        this.field434 = arg1;
        this.field425 = arg2;
    }
}
