import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public abstract class class78 extends class481 {

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "Laha;")
    public class384 field1103;

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    private static int field1084 = 0;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field1071 = 0;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
    private static int field1094 = 0;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
    public static int field1101 = 0;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field1076 = 0;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    private static int field1072;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    private static int field1077;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    private static int field1098;

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
    private static int field1100;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "[I")
    private int[] field1073;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "()I", line = 5)
    public final int method142() {
        return this.field1099 + this.field1085 + this.field1088;
    }

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "()I", line = 10)
    public final int method149() {
        return this.field1090 + this.field1078 + this.field1082;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFFFFF)Z", line = 16)
    private final boolean method678(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1099 + this.field1085 + this.field1088;
        int var8 = this.field1090 + this.field1078 + this.field1082;
        if (this.field1099 != var7 || this.field1078 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1090 * var11;
            float var14 = (float) this.field1090 * var12;
            float var15 = (float) this.field1085 * var9;
            float var16 = (float) this.field1085 * var10;
            float var17 = (float) this.field1088 * -var9;
            float var18 = (float) this.field1088 * -var10;
            float var19 = (float) this.field1082 * -var11;
            float var20 = (float) this.field1082 * -var12;
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
        if (var23 < (float) this.field1103.field4872) {
            var23 = this.field1103.field4872;
        }
        if (var24 > (float) this.field1103.field4888) {
            var24 = this.field1103.field4888;
        }
        if (var25 < (float) this.field1103.field4875) {
            var25 = this.field1103.field4875;
        }
        if (var26 > (float) this.field1103.field4897) {
            var26 = this.field1103.field4897;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field1083 = this.field1103.field4898;
        field1093 = (int) ((float) ((int) var25 * field1083) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1081 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1099 / var29);
        field1095 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1078 / var30);
        field1075 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1099 / var30);
        field1074 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1078 / var29);
        field1098 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1077 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1097 = (this.field1099 >> 1 << 12) + (field1077 * field1075 >> 4);
        field1079 = (this.field1078 >> 1 << 12) + (field1077 * field1074 >> 4);
        field1086 = field1098 * field1081 >> 4;
        field1096 = field1098 * field1095 >> 4;
        field1072 = (int) var23;
        field1087 = (int) var27;
        field1100 = (int) var25;
        field1092 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([I)V", line = 151)
    public final void method152(int[] arg0) {
        arg0[0] = this.field1085;
        arg0[1] = this.field1090;
        arg0[2] = this.field1088;
        arg0[3] = this.field1082;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "()I", line = 157)
    public final int method144() {
        return this.field1078;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 161)
    public final void method146(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class489 arg7, int arg8, int arg9) {
        if (this.field1103.method2179()) {
            throw new IllegalStateException();
        } else if (this.method678(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class324 var11 = (class324) arg7;
            this.method205(var11.field4168, var11.field4170, field1072 - arg8, -arg9 - (field1092 - field1100));
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(IIIIIII)V", line = 192)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1103.method2179()) {
            throw new IllegalStateException();
        }
        if (this.field1073 == null) {
            this.field1073 = new int[4];
        }
        this.field1103.method483(this.field1073);
        this.field1103.method525(this.field1103.field4872, this.field1103.field4875, arg0 + arg2, arg1 + arg3);
        int var8 = this.method142();
        int var9 = this.method149();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method148(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1103.method534(this.field1073[0], this.field1073[1], this.field1073[2], this.field1073[3]);
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "()I", line = 231)
    public final int method143() {
        return this.field1099;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFFFFFIIII)V", line = 236)
    public final void method150(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field1103.method2179()) {
            throw new IllegalStateException();
        } else if (this.method678(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field1089 = arg7;
            if (arg6 != 1) {
                field1091 = arg7 >>> 24;
                field1076 = 256 - field1091;
                if (arg6 == 0) {
                    field1071 = (arg7 & 0xFF0000) >> 16;
                    field1101 = (arg7 & 0xFF00) >> 8;
                    field1102 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field1094 = arg7 >>> 24;
                    field1084 = 256 - field1094;
                    int var11 = (arg7 & 0xFF00FF) * field1084 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field1084 & 0xFF0000;
                    field1080 = (var11 | var12) >>> 8;
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
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIII)V", line = 361)
    public final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.field1085 = arg0;
        this.field1090 = arg1;
        this.field1088 = arg2;
        this.field1082 = arg3;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Laha;II)V", line = 372)
    public class78(class384 arg0, int arg1, int arg2) {
        this.field1103 = arg0;
        this.field1099 = arg1;
        this.field1078 = arg2;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
    public abstract void method148(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)V")
    public abstract void method203(int arg0, int arg1);

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([I[III)V")
    public abstract void method205(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method140(int arg0, int arg1, class489 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
