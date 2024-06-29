import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class11 extends class307 {

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Llg;")
    public class273 field171;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    private static int field168 = 0;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    private static int field163 = 0;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field165 = 0;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    private static int field158;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    private static int field162;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    private static int field169;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    private static int field185;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
    private int[] field166;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILfs;II)V")
    public abstract void method83(int arg0, int arg1, class372 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([I[III)V")
    public abstract void method84(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()I")
    public final int method85() {
        return this.field181;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "()I")
    public final int method87() {
        return this.field167 + this.field156 + this.field159;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method88(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field171.method1672()) {
            throw new IllegalStateException();
        }
        this.method95(arg0, arg1, arg2, arg3, arg4, arg5);
        field180 = arg7;
        if (arg6 != 1) {
            field178 = arg7 >>> 24;
            field177 = 256 - field178;
            if (arg6 == 0) {
                field176 = (arg7 & 0xFF0000) >> 16;
                field157 = (arg7 & 0xFF00) >> 8;
                field165 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field163 = arg7 >>> 24;
                field168 = 256 - field163;
                int var10 = (arg7 & 0xFF00FF) * field168 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field168 & 0xFF0000;
                field173 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method96(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method96(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method96(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method96(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method96(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method96(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method96(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method96(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method96(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method96(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method96(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method96(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(FFFFFFLfs;II)V")
    public final void method89(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class372 arg6, int arg7, int arg8) {
        if (this.field171.method1672()) {
            throw new IllegalStateException();
        }
        this.method95(arg0, arg1, arg2, arg3, arg4, arg5);
        class277 var10 = (class277) arg6;
        this.method84(var10.field3956, var10.field3958, field169 - arg7, -arg8 - (field170 - field158));
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3) {
        this.field156 = arg0;
        this.field161 = arg1;
        this.field159 = arg2;
        this.field164 = arg3;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIIIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field171.method1672()) {
            throw new IllegalStateException();
        }
        if (this.field166 == null) {
            this.field166 = new int[4];
        }
        this.field171.method785(this.field166);
        this.field171.method789(this.field171.field3887, this.field171.field3899, arg0 + arg2, arg1 + arg3);
        int var8 = this.method87();
        int var9 = this.method94();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method90(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field171.method810(this.field166[0], this.field166[1], this.field166[2], this.field166[3]);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()I")
    public final int method93() {
        return this.field167;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Llg;II)V")
    public class11(class273 arg0, int arg1, int arg2) {
        this.field171 = arg0;
        this.field167 = arg1;
        this.field181 = arg2;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()I")
    public final int method94() {
        return this.field181 + this.field161 + this.field164;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(FFFFFF)V")
    private final void method95(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field167 + this.field156 + this.field159;
        int var8 = this.field181 + this.field161 + this.field164;
        if (this.field167 != var7 || this.field181 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field161 * var11;
            float var14 = (float) this.field161 * var12;
            float var15 = (float) this.field156 * var9;
            float var16 = (float) this.field156 * var10;
            float var17 = (float) this.field159 * -var9;
            float var18 = (float) this.field159 * -var10;
            float var19 = (float) this.field164 * -var11;
            float var20 = (float) this.field164 * -var12;
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
        if (var23 < (float) this.field171.field3887) {
            var23 = this.field171.field3887;
        }
        if (var24 > (float) this.field171.field3901) {
            var24 = this.field171.field3901;
        }
        if (var25 < (float) this.field171.field3899) {
            var25 = this.field171.field3899;
        }
        if (var26 > (float) this.field171.field3875) {
            var26 = this.field171.field3875;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field182 = this.field171.field3880;
        field172 = (int) ((float) ((int) var25 * field182) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field186 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field167 / var29);
        field184 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field181 / var30);
        field183 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field167 / var30);
        field175 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field181 / var29);
        field185 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field162 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field174 = (this.field167 >> 1 << 12) + (field183 * field162 >> 4);
        field179 = (this.field181 >> 1 << 12) + (field175 * field162 >> 4);
        field187 = field186 * field185 >> 4;
        field160 = field185 * field184 >> 4;
        field169 = (int) var23;
        field188 = (int) var27;
        field158 = (int) var25;
        field170 = (int) var28;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)V")
    public abstract void method96(int arg0, int arg1);
}
