import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class273 extends class285 {

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "Lpm;")
    public class12 field4038;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    private static int field4031 = 0;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field4032 = 0;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    private static int field4049 = 0;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field4051 = 0;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field4034 = 0;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    private static int field4037;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    private static int field4044;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    private static int field4047;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    private static int field4055;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "[I")
    private int[] field4045;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()I")
    public final int method1860() {
        return this.field4053 + this.field4030 + this.field4046;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()I")
    public final int method1861() {
        return this.field4043 + this.field4023 + this.field4052;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()I")
    public final int method1862() {
        return this.field4030;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
    public abstract void method927(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFFFLtm;II)V")
    public final void method1863(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class195 arg6, int arg7, int arg8) {
        if (this.field4038.method188()) {
            throw new IllegalStateException();
        }
        this.method1865(arg0, arg1, arg2, arg3, arg4, arg5);
        class164 var10 = (class164) arg6;
        this.method925(var10.field2173, var10.field2164, field4044 - arg7, -arg8 - (field4048 - field4037));
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method1864(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4038.method188()) {
            throw new IllegalStateException();
        }
        this.method1865(arg0, arg1, arg2, arg3, arg4, arg5);
        field4033 = arg7;
        if (arg6 != 0) {
            field4050 = arg7 >>> 24;
            field4051 = 256 - field4050;
            if (arg6 == 1) {
                field4034 = (arg7 & 0xFF0000) >> 16;
                field4040 = (arg7 & 0xFF00) >> 8;
                field4039 = arg7 & 0xFF;
            } else {
                field4031 = arg7 >>> 24;
                field4049 = 256 - field4031;
                int var10 = (arg7 & 0xFF00FF) * field4049 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4049 & 0xFF0000;
                field4032 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method928(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method928(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method928(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method928(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method928(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method928(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method928(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method928(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method928(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFFF)V")
    private final void method1865(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4043 + this.field4023 + this.field4052;
        int var8 = this.field4053 + this.field4030 + this.field4046;
        if (this.field4023 != var7 || this.field4030 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4053 * var11;
            float var14 = (float) this.field4053 * var12;
            float var15 = (float) this.field4043 * var9;
            float var16 = (float) this.field4043 * var10;
            float var17 = (float) this.field4052 * -var9;
            float var18 = (float) this.field4052 * -var10;
            float var19 = (float) this.field4046 * -var11;
            float var20 = (float) this.field4046 * -var12;
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
        if (var23 < (float) this.field4038.field188) {
            var23 = (float) this.field4038.field188;
        }
        if (var24 > (float) this.field4038.field205) {
            var24 = (float) this.field4038.field205;
        }
        if (var25 < (float) this.field4038.field206) {
            var25 = (float) this.field4038.field206;
        }
        if (var26 > (float) this.field4038.field167) {
            var26 = (float) this.field4038.field167;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4028 = this.field4038.field183;
        field4041 = (int) ((float) ((int) var25 * field4028) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4024 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4023 / var29);
        field4036 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4030 / var30);
        field4026 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4023 / var30);
        field4027 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4030 / var29);
        field4047 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4055 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4035 = (this.field4023 >> 1 << 12) + (field4055 * field4026 >> 4);
        field4029 = (this.field4030 >> 1 << 12) + (field4055 * field4027 >> 4);
        field4042 = field4047 * field4024 >> 4;
        field4054 = field4047 * field4036 >> 4;
        field4044 = (int) var23;
        field4025 = (int) var27;
        field4037 = (int) var25;
        field4048 = (int) var28;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
    public final void method1866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4038.method188()) {
            throw new IllegalStateException();
        }
        if (this.field4045 == null) {
            this.field4045 = new int[4];
        }
        this.field4038.method76(this.field4045);
        this.field4038.method170(this.field4038.field188, this.field4038.field206, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1861();
        int var9 = this.method1860();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method927(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4038.method77(this.field4045[0], this.field4045[1], this.field4045[2], this.field4045[3]);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILtm;II)V")
    public abstract void method926(int arg0, int arg1, class195 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)V")
    public final void method1867(int arg0, int arg1, int arg2, int arg3) {
        this.field4043 = arg0;
        this.field4053 = arg1;
        this.field4052 = arg2;
        this.field4046 = arg3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V")
    public abstract void method928(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()I")
    public final int method1868() {
        return this.field4023;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lpm;II)V")
    public class273(class12 arg0, int arg1, int arg2) {
        this.field4038 = arg0;
        this.field4023 = arg1;
        this.field4030 = arg2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([I[III)V")
    public abstract void method925(int[] arg0, int[] arg1, int arg2, int arg3);
}
