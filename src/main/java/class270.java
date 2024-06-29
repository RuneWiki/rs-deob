import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class270 extends class243 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lcs;")
    public class389 field3941;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field3937 = 0;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field3950 = 0;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    private static int field3956 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private static int field3942 = 0;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    private static int field3943;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    private static int field3947;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    private static int field3959;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    private static int field3960;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "[I")
    private int[] field3966;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()I", line = 5)
    public final int method1095() {
        return this.field3955;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIII)V", line = 13)
    public final void method1089(int arg0, int arg1, int arg2, int arg3) {
        this.field3954 = arg0;
        this.field3962 = arg1;
        this.field3936 = arg2;
        this.field3963 = arg3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIII)V", line = 33)
    public final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3941.method2542()) {
            throw new IllegalStateException();
        }
        if (this.field3966 == null) {
            this.field3966 = new int[4];
        }
        this.field3941.method2101(this.field3966);
        this.field3941.method2163(this.field3941.field5838, this.field3941.field5833, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1088();
        int var9 = this.method1091();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method35(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3941.method2155(this.field3966[0], this.field3966[1], this.field3966[2], this.field3966[3]);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFFFF)V", line = 73)
    private final void method1734(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3955 + this.field3954 + this.field3936;
        int var8 = this.field3962 + this.field3961 + this.field3963;
        if (this.field3955 != var7 || this.field3961 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3962 * var11;
            float var14 = (float) this.field3962 * var12;
            float var15 = (float) this.field3954 * var9;
            float var16 = (float) this.field3954 * var10;
            float var17 = (float) this.field3936 * -var9;
            float var18 = (float) this.field3936 * -var10;
            float var19 = (float) this.field3963 * -var11;
            float var20 = (float) this.field3963 * -var12;
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
        if (var23 < (float) this.field3941.field5838) {
            var23 = (float) this.field3941.field5838;
        }
        if (var24 > (float) this.field3941.field5839) {
            var24 = (float) this.field3941.field5839;
        }
        if (var25 < (float) this.field3941.field5833) {
            var25 = (float) this.field3941.field5833;
        }
        if (var26 > (float) this.field3941.field5796) {
            var26 = (float) this.field3941.field5796;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field3964 = this.field3941.field5801;
        field3951 = (int) ((float) ((int) var25 * field3964) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3944 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3955 / var29);
        field3957 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3961 / var30);
        field3938 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3955 / var30);
        field3946 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3961 / var29);
        field3947 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3959 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3949 = (this.field3955 >> 1 << 12) + (field3959 * field3938 >> 4);
        field3967 = (this.field3961 >> 1 << 12) + (field3959 * field3946 >> 4);
        field3958 = field3947 * field3944 >> 4;
        field3939 = field3957 * field3947 >> 4;
        field3943 = (int) var23;
        field3965 = (int) var27;
        field3960 = (int) var25;
        field3945 = (int) var28;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()I", line = 207)
    public final int method1091() {
        return this.field3962 + this.field3961 + this.field3963;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()I", line = 218)
    public final int method1090() {
        return this.field3961;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFFFFIII)V", line = 228)
    public final void method1092(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3941.method2542()) {
            throw new IllegalStateException();
        }
        this.method1734(arg0, arg1, arg2, arg3, arg4, arg5);
        field3952 = arg7;
        if (arg6 != 0) {
            field3937 = arg7 >>> 24;
            field3953 = 256 - field3937;
            if (arg6 == 1) {
                field3940 = (arg7 & 0xFF0000) >> 16;
                field3968 = (arg7 & 0xFF00) >> 8;
                field3950 = arg7 & 0xFF;
            } else {
                field3956 = arg7 >>> 24;
                field3942 = 256 - field3956;
                int var10 = (arg7 & 0xFF00FF) * field3942 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field3942 & 0xFF0000;
                field3948 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method37(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method37(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method37(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method37(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method37(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method37(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method37(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method37(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method37(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()I", line = 326)
    public final int method1088() {
        return this.field3955 + this.field3954 + this.field3936;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lcs;II)V", line = 328)
    public class270(class389 arg0, int arg1, int arg2) {
        this.field3941 = arg0;
        this.field3955 = arg1;
        this.field3961 = arg2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFFFFLsn;II)V", line = 336)
    public final void method1094(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class449 arg6, int arg7, int arg8) {
        if (this.field3941.method2542()) {
            throw new IllegalStateException();
        }
        this.method1734(arg0, arg1, arg2, arg3, arg4, arg5);
        class35 var10 = (class35) arg6;
        this.method38(var10.field568, var10.field577, field3943 - arg7, -arg8 - (field3945 - field3960));
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[III)V")
    public abstract void method38(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILsn;II)V")
    public abstract void method34(int arg0, int arg1, class449 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
    public abstract void method37(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    public abstract void method35(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
