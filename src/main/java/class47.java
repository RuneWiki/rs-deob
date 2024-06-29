import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class47 extends class436 {

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "Lco;")
    public class188 field563;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field534 = 0;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    private static int field539 = 0;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    private static int field550 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field557 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    private static int field537;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private static int field544;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    private static int field555;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    private static int field561;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "[I")
    private int[] field535;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I", line = 9)
    public final int method230() {
        return this.field532;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFF)V", line = 15)
    private final void method270(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field542 + this.field532 + this.field536;
        int var8 = this.field556 + this.field538 + this.field545;
        if (this.field532 != var7 || this.field538 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field556 * var11;
            float var14 = (float) this.field556 * var12;
            float var15 = (float) this.field542 * var9;
            float var16 = (float) this.field542 * var10;
            float var17 = (float) this.field536 * -var9;
            float var18 = (float) this.field536 * -var10;
            float var19 = (float) this.field545 * -var11;
            float var20 = (float) this.field545 * -var12;
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
        if (var23 < (float) this.field563.field2183) {
            var23 = (float) this.field563.field2183;
        }
        if (var24 > (float) this.field563.field2186) {
            var24 = (float) this.field563.field2186;
        }
        if (var25 < (float) this.field563.field2187) {
            var25 = (float) this.field563.field2187;
        }
        if (var26 > (float) this.field563.field2207) {
            var26 = (float) this.field563.field2207;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field558 = this.field563.field2194;
        field560 = (int) ((float) ((int) var25 * field558) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field552 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field532 / var29);
        field543 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field538 / var30);
        field533 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field532 / var30);
        field549 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field538 / var29);
        field544 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field537 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field559 = (this.field532 >> 1 << 12) + (field537 * field533 >> 4);
        field554 = (this.field538 >> 1 << 12) + (field549 * field537 >> 4);
        field553 = field552 * field544 >> 4;
        field541 = field544 * field543 >> 4;
        field561 = (int) var23;
        field546 = (int) var27;
        field555 = (int) var25;
        field551 = (int) var28;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)V", line = 150)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field563.method1158()) {
            throw new IllegalStateException();
        }
        if (this.field535 == null) {
            this.field535 = new int[4];
        }
        this.field563.method722(this.field535);
        this.field563.method768(this.field563.field2183, this.field563.field2187, arg0 + arg2, arg1 + arg3);
        int var8 = this.method235();
        int var9 = this.method236();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method167(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field563.method774(this.field535[0], this.field535[1], this.field535[2], this.field535[3]);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()I", line = 196)
    public final int method236() {
        return this.field556 + this.field538 + this.field545;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIII)V", line = 199)
    public final void method232(int arg0, int arg1, int arg2, int arg3) {
        this.field542 = arg0;
        this.field556 = arg1;
        this.field536 = arg2;
        this.field545 = arg3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFFIII)V", line = 208)
    public final void method233(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field563.method1158()) {
            throw new IllegalStateException();
        }
        this.method270(arg0, arg1, arg2, arg3, arg4, arg5);
        field540 = arg7;
        if (arg6 != 0) {
            field557 = arg7 >>> 24;
            field547 = 256 - field557;
            if (arg6 == 1) {
                field548 = (arg7 & 0xFF0000) >> 16;
                field531 = (arg7 & 0xFF00) >> 8;
                field562 = arg7 & 0xFF;
            } else {
                field550 = arg7 >>> 24;
                field539 = 256 - field550;
                int var10 = (arg7 & 0xFF00FF) * field539 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field539 & 0xFF0000;
                field534 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method166(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method166(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method166(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method166(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method166(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method166(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method166(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method166(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method166(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I", line = 326)
    public final int method237() {
        return this.field538;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFFLem;II)V", line = 329)
    public final void method231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class423 arg6, int arg7, int arg8) {
        if (this.field563.method1158()) {
            throw new IllegalStateException();
        }
        this.method270(arg0, arg1, arg2, arg3, arg4, arg5);
        class80 var10 = (class80) arg6;
        this.method169(var10.field978, var10.field971, field561 - arg7, -arg8 - (field551 - field555));
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()I", line = 342)
    public final int method235() {
        return this.field542 + this.field532 + this.field536;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lco;II)V", line = 345)
    public class47(class188 arg0, int arg1, int arg2) {
        this.field563 = arg0;
        this.field532 = arg1;
        this.field538 = arg2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([I[III)V")
    public abstract void method169(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILem;II)V")
    public abstract void method165(int arg0, int arg1, class423 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public abstract void method166(int arg0, int arg1);
}
