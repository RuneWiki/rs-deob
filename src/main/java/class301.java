import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class301 extends class24 {

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lcd;")
    public class208 field3962;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    private static int field3960 = 0;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field3956 = 0;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    private static int field3957 = 0;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field3976 = 0;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3966 = 0;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field3972 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private static int field3958;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private static int field3963;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    private static int field3971;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    private static int field3979;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "[I")
    private int[] field3974;

    @OriginalMember(owner = "client!af", name = "la", descriptor = "(IIIIIII)V", line = 8)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3962.method1322()) {
            throw new IllegalStateException();
        }
        if (this.field3974 == null) {
            this.field3974 = new int[4];
        }
        this.field3962.method1163(this.field3974);
        this.field3962.method1134(this.field3962.field2781, this.field3962.field2749, arg0 + arg2, arg1 + arg3);
        int var8 = this.method155();
        int var9 = this.method153();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method12(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3962.method1182(this.field3974[0], this.field3974[1], this.field3974[2], this.field3974[3]);
    }

    @OriginalMember(owner = "client!af", name = "ha", descriptor = "(IIII)V", line = 56)
    public final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.field3952 = arg0;
        this.field3975 = arg1;
        this.field3968 = arg2;
        this.field3973 = arg3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFFLta;II)V", line = 64)
    public final void method151(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        if (this.field3962.method1322()) {
            throw new IllegalStateException();
        }
        this.method1797(arg0, arg1, arg2, arg3, arg4, arg5);
        class217 var10 = (class217) arg6;
        this.method11(var10.field2954, var10.field2953, field3963 - arg7, -arg8 - (field3967 - field3958));
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFF)V", line = 77)
    private final void method1797(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3959 + this.field3952 + this.field3968;
        int var8 = this.field3975 + this.field3961 + this.field3973;
        if (this.field3959 != var7 || this.field3961 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3975 * var11;
            float var14 = (float) this.field3975 * var12;
            float var15 = (float) this.field3952 * var9;
            float var16 = (float) this.field3952 * var10;
            float var17 = (float) this.field3968 * -var9;
            float var18 = (float) this.field3968 * -var10;
            float var19 = (float) this.field3973 * -var11;
            float var20 = (float) this.field3973 * -var12;
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
        if (var23 < (float) this.field3962.field2781) {
            var23 = this.field3962.field2781;
        }
        if (var24 > (float) this.field3962.field2778) {
            var24 = this.field3962.field2778;
        }
        if (var25 < (float) this.field3962.field2749) {
            var25 = this.field3962.field2749;
        }
        if (var26 > (float) this.field3962.field2773) {
            var26 = this.field3962.field2773;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field3949 = this.field3962.field2761;
        field3965 = (int) ((float) ((int) var25 * field3949) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3954 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3959 / var29);
        field3953 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3961 / var30);
        field3950 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3959 / var30);
        field3947 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3961 / var29);
        field3979 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3971 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3955 = (this.field3959 >> 1 << 12) + (field3971 * field3950 >> 4);
        field3977 = (this.field3961 >> 1 << 12) + (field3971 * field3947 >> 4);
        field3970 = field3979 * field3954 >> 4;
        field3969 = field3979 * field3953 >> 4;
        field3963 = (int) var23;
        field3951 = (int) var27;
        field3958 = (int) var25;
        field3967 = (int) var28;
    }

    @OriginalMember(owner = "client!af", name = "H", descriptor = "(FFFFFFIII)V", line = 210)
    public final void method143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3962.method1322()) {
            throw new IllegalStateException();
        }
        this.method1797(arg0, arg1, arg2, arg3, arg4, arg5);
        field3978 = arg7;
        if (arg6 != 1) {
            field3976 = arg7 >>> 24;
            field3972 = 256 - field3976;
            if (arg6 == 0) {
                field3948 = (arg7 & 0xFF0000) >> 16;
                field3966 = (arg7 & 0xFF00) >> 8;
                field3964 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field3960 = arg7 >>> 24;
                field3957 = 256 - field3960;
                int var10 = (arg7 & 0xFF00FF) * field3957 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field3957 & 0xFF0000;
                field3956 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method10(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method10(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method10(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method10(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method10(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method10(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method10(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method10(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method10(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method10(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method10(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method10(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "()I", line = 331)
    public final int method153() {
        return this.field3975 + this.field3961 + this.field3973;
    }

    @OriginalMember(owner = "client!af", name = "YA", descriptor = "()I", line = 334)
    public final int method150() {
        return this.field3959;
    }

    @OriginalMember(owner = "client!af", name = "RA", descriptor = "()I", line = 337)
    public final int method155() {
        return this.field3959 + this.field3952 + this.field3968;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lcd;II)V", line = 355)
    public class301(class208 arg0, int arg1, int arg2) {
        this.field3962 = arg0;
        this.field3959 = arg1;
        this.field3961 = arg2;
    }

    @OriginalMember(owner = "client!af", name = "ZA", descriptor = "()I", line = 364)
    public final int method146() {
        return this.field3961;
    }

    @OriginalMember(owner = "client!af", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([I[III)V")
    public abstract void method11(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!af", name = "W", descriptor = "(IIIII)V")
    public abstract void method12(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public abstract void method10(int arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILta;II)V")
    public abstract void method7(int arg0, int arg1, class144 arg2, int arg3, int arg4);
}
