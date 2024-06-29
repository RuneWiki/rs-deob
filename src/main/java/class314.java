import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public abstract class class314 extends class702 {

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "Ltea;")
    public class214 field4653;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    private static int field4636 = 0;

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public static int field4643 = 0;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field4637 = 0;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!ow", name = "A", descriptor = "I")
    public static int field4659 = 0;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    private static int field4640 = 0;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    private static int field4646;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
    private static int field4652;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ow", name = "B", descriptor = "I")
    private static int field4660;

    @OriginalMember(owner = "client!ow", name = "D", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "I")
    private static int field4662;

    @OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
    public int field4663;

    @OriginalMember(owner = "client!ow", name = "G", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ow", name = "I", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "[I")
    private int[] field4654;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "()I", line = 9)
    public final int method939() {
        return this.field4649;
    }

    @OriginalMember(owner = "client!ow", name = "Q", descriptor = "(IIII)V", line = 12)
    public final void method935(int arg0, int arg1, int arg2, int arg3) {
        this.field4645 = arg0;
        this.field4642 = arg1;
        this.field4647 = arg2;
        this.field4663 = arg3;
    }

    @OriginalMember(owner = "client!ow", name = "ca", descriptor = "()I", line = 26)
    public final int method936() {
        return this.field4649 + this.field4642 + this.field4663;
    }

    @OriginalMember(owner = "client!ow", name = "A", descriptor = "()I", line = 35)
    public final int method931() {
        return this.field4645 + this.field4639 + this.field4647;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(FFFFFFILua;II)V", line = 39)
    public final void method930(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        if (this.field4653.method1421()) {
            throw new IllegalStateException();
        } else if (this.method1984(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class699 var11 = (class699) arg7;
            this.method1982(var11.field9887, var11.field9889, field4652 - arg8, -arg9 - (field4633 - field4660));
        }
    }

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "()I", line = 63)
    public final int method927() {
        return this.field4639;
    }

    @OriginalMember(owner = "client!ow", name = "DA", descriptor = "(IIIIIII)V", line = 74)
    public final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4653.method1421()) {
            throw new IllegalStateException();
        }
        if (this.field4654 == null) {
            this.field4654 = new int[4];
        }
        this.field4653.method204(this.field4654);
        this.field4653.method107(this.field4653.field3002, this.field4653.field2982, arg0 + arg2, arg1 + arg3);
        int var8 = this.method931();
        int var9 = this.method936();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method929(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4653.method168(this.field4654[0], this.field4654[1], this.field4654[2], this.field4654[3]);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(FFFFFF)Z", line = 128)
    private final boolean method1984(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4645 + this.field4639 + this.field4647;
        int var8 = this.field4649 + this.field4642 + this.field4663;
        if (this.field4639 != var7 || this.field4649 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4642 * var11;
            float var14 = (float) this.field4642 * var12;
            float var15 = (float) this.field4645 * var9;
            float var16 = (float) this.field4645 * var10;
            float var17 = (float) this.field4647 * -var9;
            float var18 = (float) this.field4647 * -var10;
            float var19 = (float) this.field4663 * -var11;
            float var20 = (float) this.field4663 * -var12;
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
        if (var23 < (float) this.field4653.field3002) {
            var23 = this.field4653.field3002;
        }
        if (var24 > (float) this.field4653.field2983) {
            var24 = this.field4653.field2983;
        }
        if (var25 < (float) this.field4653.field2982) {
            var25 = this.field4653.field2982;
        }
        if (var26 > (float) this.field4653.field2992) {
            var26 = this.field4653.field2992;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field4664 = this.field4653.field3004;
        field4656 = (int) ((float) ((int) var25 * field4664) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4655 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4639 / var29);
        field4657 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4649 / var30);
        field4641 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4639 / var30);
        field4648 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4649 / var29);
        field4662 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4646 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4661 = (this.field4639 >> 1 << 12) + (field4646 * field4641 >> 4);
        field4635 = (this.field4649 >> 1 << 12) + (field4648 * field4646 >> 4);
        field4634 = field4662 * field4655 >> 4;
        field4644 = field4662 * field4657 >> 4;
        field4652 = (int) var23;
        field4638 = (int) var27;
        field4660 = (int) var25;
        field4633 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ow", name = "qa", descriptor = "(FFFFFFIIII)V", line = 275)
    public final void method940(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field4653.method1421()) {
            throw new IllegalStateException();
        } else if (this.method1984(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field4665 = arg7;
            if (arg6 != 1) {
                field4650 = arg7 >>> 24;
                field4658 = 256 - field4650;
                if (arg6 == 0) {
                    field4643 = (arg7 & 0xFF0000) >> 16;
                    field4659 = (arg7 & 0xFF00) >> 8;
                    field4651 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field4640 = arg7 >>> 24;
                    field4636 = 256 - field4640;
                    int var11 = (arg7 & 0xFF00FF) * field4636 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field4636 & 0xFF0000;
                    field4637 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1983(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1983(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1983(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1983(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1983(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1983(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1983(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1983(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1983(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1983(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1983(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1983(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Ltea;II)V", line = 371)
    public class314(class214 arg0, int arg1, int arg2) {
        this.field4653 = arg0;
        this.field4639 = arg1;
        this.field4649 = arg2;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([I[III)V")
    public abstract void method1982(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILua;II)V")
    public abstract void method933(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ow", name = "V", descriptor = "(IIIII)V")
    public abstract void method929(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V")
    public abstract void method1983(int arg0, int arg1);

    @OriginalMember(owner = "client!ow", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
