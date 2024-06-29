import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class class292 extends class130 {

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Lkp;")
    public class283 field4034;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field4032 = 0;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    private static int field4025 = 0;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field4026 = 0;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    private static int field4043 = 0;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    private static int field4024;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    private static int field4030;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    private static int field4035;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    private static int field4039;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "[I")
    private int[] field4042;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()I")
    public final int method877() {
        return this.field4033 + this.field4018 + this.field4021;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFF)V")
    private final void method1877(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4045 + this.field4041 + this.field4015;
        int var8 = this.field4033 + this.field4018 + this.field4021;
        if (this.field4041 != var7 || this.field4033 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4018 * var11;
            float var14 = (float) this.field4018 * var12;
            float var15 = (float) this.field4045 * var9;
            float var16 = (float) this.field4045 * var10;
            float var17 = (float) this.field4015 * -var9;
            float var18 = (float) this.field4015 * -var10;
            float var19 = (float) this.field4021 * -var11;
            float var20 = (float) this.field4021 * -var12;
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
        if (var23 < (float) this.field4034.field3877) {
            var23 = (float) this.field4034.field3877;
        }
        if (var24 > (float) this.field4034.field3896) {
            var24 = (float) this.field4034.field3896;
        }
        if (var25 < (float) this.field4034.field3885) {
            var25 = (float) this.field4034.field3885;
        }
        if (var26 > (float) this.field4034.field3873) {
            var26 = (float) this.field4034.field3873;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4016 = this.field4034.field3893;
        field4047 = (int) ((float) ((int) var25 * field4016) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4040 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4041 / var29);
        field4036 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4033 / var30);
        field4028 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4041 / var30);
        field4019 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4033 / var29);
        field4039 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4030 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4046 = (this.field4041 >> 1 << 12) + (field4030 * field4028 >> 4);
        field4038 = (this.field4033 >> 1 << 12) + (field4030 * field4019 >> 4);
        field4031 = field4040 * field4039 >> 4;
        field4017 = field4039 * field4036 >> 4;
        field4035 = (int) var23;
        field4027 = (int) var27;
        field4024 = (int) var25;
        field4029 = (int) var28;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
    public abstract void method804(int arg0, int arg1);

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()I")
    public final int method876() {
        return this.field4033;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
    public final int method874() {
        return this.field4045 + this.field4041 + this.field4015;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIIIII)V")
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4034.method1834()) {
            throw new IllegalStateException();
        }
        if (this.field4042 == null) {
            this.field4042 = new int[4];
        }
        this.field4034.method1796(this.field4042);
        this.field4034.method1776(this.field4034.field3877, this.field4034.field3885, arg0 + arg2, arg1 + arg3);
        int var8 = this.method874();
        int var9 = this.method877();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method809(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4034.method1735(this.field4042[0], this.field4042[1], this.field4042[2], this.field4042[3]);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method873(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4034.method1834()) {
            throw new IllegalStateException();
        }
        this.method1877(arg0, arg1, arg2, arg3, arg4, arg5);
        field4020 = arg7;
        if (arg6 != 0) {
            field4026 = arg7 >>> 24;
            field4023 = 256 - field4026;
            if (arg6 == 1) {
                field4032 = (arg7 & 0xFF0000) >> 16;
                field4044 = (arg7 & 0xFF00) >> 8;
                field4037 = arg7 & 0xFF;
            } else {
                field4043 = arg7 >>> 24;
                field4025 = 256 - field4043;
                int var10 = (arg7 & 0xFF00FF) * field4025 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4025 & 0xFF0000;
                field4022 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method804(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method804(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method804(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method804(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method804(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method804(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method804(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method804(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method804(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
    public abstract void method809(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "()I")
    public final int method880() {
        return this.field4041;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFLtm;II)V")
    public final void method870(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class220 arg6, int arg7, int arg8) {
        if (this.field4034.method1834()) {
            throw new IllegalStateException();
        }
        this.method1877(arg0, arg1, arg2, arg3, arg4, arg5);
        class105 var10 = (class105) arg6;
        this.method803(var10.field1570, var10.field1568, field4035 - arg7, -arg8 - (field4029 - field4024));
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILtm;II)V")
    public abstract void method805(int arg0, int arg1, class220 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V")
    public final void method868(int arg0, int arg1, int arg2, int arg3) {
        this.field4045 = arg0;
        this.field4018 = arg1;
        this.field4015 = arg2;
        this.field4021 = arg3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([I[III)V")
    public abstract void method803(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lkp;II)V")
    public class292(class283 arg0, int arg1, int arg2) {
        this.field4034 = arg0;
        this.field4041 = arg1;
        this.field4033 = arg2;
    }
}
