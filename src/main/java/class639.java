import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class639 extends class772 {

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lqk;")
    public class156 field8146;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public int field8160;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public int field8163;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field8143 = 0;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    private static int field8137 = 0;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field8134 = 0;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field8154 = 0;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field8157 = 0;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field8161 = 0;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private static int field8158 = 0;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field8164 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field8141;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    private static int field8142;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    private static int field8144;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field8149;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    private static int field8150;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public int field8156;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public int field8162;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    private static int field8165;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
    private int[] field8138;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8146.method958()) {
            throw new IllegalStateException();
        }
        if (this.field8138 == null) {
            this.field8138 = new int[4];
        }
        this.field8146.method924(this.field8138);
        this.field8146.method928(this.field8146.field2024, this.field8146.field1997, arg0 + arg2, arg1 + arg3);
        int var8 = this.method623();
        int var9 = this.method628();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method616(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field8146.method915(this.field8138[0], this.field8138[1], this.field8138[2], this.field8138[3]);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
    public final int method628() {
        return this.field8163 + this.field8156 + this.field8141;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()I")
    public final int method620() {
        return this.field8160;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([I[III)V")
    public abstract void method2077(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8146.method958()) {
            throw new IllegalStateException();
        } else if (this.method3450(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field8148 = arg7;
            if (arg6 != 1) {
                field8157 = arg7 >>> 24;
                field8161 = 256 - field8157;
                if (arg6 == 0) {
                    field8143 = (arg7 & 0xFF0000) >> 16;
                    field8154 = (arg7 & 0xFF00) >> 8;
                    field8164 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field8158 = arg7 >>> 24;
                    field8137 = 256 - field8158;
                    int var11 = (arg7 & 0xFF00FF) * field8137 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field8137 & 0xFF0000;
                    field8134 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method2076(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2076(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2076(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method2076(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2076(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2076(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method2076(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2076(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2076(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method2076(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2076(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2076(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([I)V")
    public final void method615(int[] arg0) {
        arg0[0] = this.field8149;
        arg0[1] = this.field8156;
        arg0[2] = this.field8162;
        arg0[3] = this.field8141;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method621(int arg0, int arg1, class596 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
    public abstract void method616(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method617(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        if (this.field8146.method958()) {
            throw new IllegalStateException();
        } else if (this.method3450(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class383 var11 = (class383) arg7;
            this.method2077(var11.field4789, var11.field4786, field8144 - arg8, -arg9 - (field8153 - field8165));
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
    public final int method623() {
        return this.field8160 + this.field8149 + this.field8162;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
    public final void method626(int arg0, int arg1, int arg2, int arg3) {
        this.field8149 = arg0;
        this.field8156 = arg1;
        this.field8162 = arg2;
        this.field8141 = arg3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method3450(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field8160 + this.field8149 + this.field8162;
        int var8 = this.field8163 + this.field8156 + this.field8141;
        if (this.field8160 != var7 || this.field8163 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field8156 * var11;
            float var14 = (float) this.field8156 * var12;
            float var15 = (float) this.field8149 * var9;
            float var16 = (float) this.field8149 * var10;
            float var17 = (float) this.field8162 * -var9;
            float var18 = (float) this.field8162 * -var10;
            float var19 = (float) this.field8141 * -var11;
            float var20 = (float) this.field8141 * -var12;
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
        if (var23 < (float) this.field8146.field2024) {
            var23 = this.field8146.field2024;
        }
        if (var24 > (float) this.field8146.field2026) {
            var24 = this.field8146.field2026;
        }
        if (var25 < (float) this.field8146.field1997) {
            var25 = this.field8146.field1997;
        }
        if (var26 > (float) this.field8146.field2013) {
            var26 = this.field8146.field2013;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field8147 = this.field8146.field1992;
        field8133 = (int) ((float) ((int) var25 * field8147) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field8155 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field8160 / var29);
        field8145 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field8163 / var30);
        field8139 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field8160 / var30);
        field8151 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field8163 / var29);
        field8142 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field8150 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field8152 = (this.field8160 >> 1 << 12) + (field8150 * field8139 >> 4);
        field8159 = (this.field8163 >> 1 << 12) + (field8151 * field8150 >> 4);
        field8136 = field8155 * field8142 >> 4;
        field8140 = field8145 * field8142 >> 4;
        field8144 = (int) var23;
        field8135 = (int) var27;
        field8165 = (int) var25;
        field8153 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public final int method612() {
        return this.field8163;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    public abstract void method2076(int arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lqk;II)V")
    public class639(class156 arg0, int arg1, int arg2) {
        this.field8146 = arg0;
        this.field8160 = arg1;
        this.field8163 = arg2;
    }
}
