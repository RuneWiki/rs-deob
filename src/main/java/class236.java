import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class236 extends class511 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lql;")
    public class173 field3156;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    private static int field3179 = 0;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field3183 = 0;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    private static int field3184 = 0;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field3178 = 0;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private static int field3157;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    private static int field3162;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    private static int field3164;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    private static int field3177;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[I")
    private int[] field3172;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([I[III)V")
    public abstract void method1493(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jj", name = "EA", descriptor = "(IIII)V")
    public final void method610(int arg0, int arg1, int arg2, int arg3) {
        this.field3171 = arg0;
        this.field3180 = arg1;
        this.field3167 = arg2;
        this.field3153 = arg3;
    }

    @OriginalMember(owner = "client!jj", name = "ba", descriptor = "(IIIIIII)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3156.method1174()) {
            throw new IllegalStateException();
        }
        if (this.field3172 == null) {
            this.field3172 = new int[4];
        }
        this.field3156.method356(this.field3172);
        this.field3156.method339(this.field3156.field2144, this.field3156.field2136, arg0 + arg2, arg1 + arg3);
        int var8 = this.method602();
        int var9 = this.method595();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method606(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3156.method376(this.field3172[0], this.field3172[1], this.field3172[2], this.field3172[3]);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method609(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8) {
        if (this.field3156.method1174()) {
            throw new IllegalStateException();
        } else if (this.method1494(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class60 var10 = (class60) arg6;
            this.method1493(var10.field815, var10.field817, field3157 - arg7, -arg8 - (field3158 - field3164));
        }
    }

    @OriginalMember(owner = "client!jj", name = "QA", descriptor = "()I")
    public final int method608() {
        return this.field3165;
    }

    @OriginalMember(owner = "client!jj", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3156.method1174()) {
            throw new IllegalStateException();
        } else if (this.method1494(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field3181 = arg7;
            if (arg6 != 1) {
                field3176 = arg7 >>> 24;
                field3178 = 256 - field3176;
                if (arg6 == 0) {
                    field3175 = (arg7 & 0xFF0000) >> 16;
                    field3168 = (arg7 & 0xFF00) >> 8;
                    field3182 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field3184 = arg7 >>> 24;
                    field3179 = 256 - field3184;
                    int var10 = (arg7 & 0xFF00FF) * field3179 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field3179 & 0xFF0000;
                    field3183 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1495(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1495(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1495(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1495(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1495(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1495(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1495(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1495(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1495(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1495(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1495(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1495(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method1494(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3171 + this.field3165 + this.field3167;
        int var8 = this.field3180 + this.field3154 + this.field3153;
        if (this.field3165 != var7 || this.field3154 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3180 * var11;
            float var14 = (float) this.field3180 * var12;
            float var15 = (float) this.field3171 * var9;
            float var16 = (float) this.field3171 * var10;
            float var17 = (float) this.field3167 * -var9;
            float var18 = (float) this.field3167 * -var10;
            float var19 = (float) this.field3153 * -var11;
            float var20 = (float) this.field3153 * -var12;
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
        if (var23 < (float) this.field3156.field2144) {
            var23 = this.field3156.field2144;
        }
        if (var24 > (float) this.field3156.field2157) {
            var24 = this.field3156.field2157;
        }
        if (var25 < (float) this.field3156.field2136) {
            var25 = this.field3156.field2136;
        }
        if (var26 > (float) this.field3156.field2140) {
            var26 = this.field3156.field2140;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field3173 = this.field3156.field2167;
        field3155 = (int) ((float) ((int) var25 * field3173) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3185 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3165 / var29);
        field3169 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3154 / var30);
        field3166 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3165 / var30);
        field3160 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3154 / var29);
        field3177 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3162 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3174 = (this.field3165 >> 1 << 12) + (field3166 * field3162 >> 4);
        field3163 = (this.field3154 >> 1 << 12) + (field3162 * field3160 >> 4);
        field3170 = field3185 * field3177 >> 4;
        field3161 = field3177 * field3169 >> 4;
        field3157 = (int) var23;
        field3159 = (int) var27;
        field3164 = (int) var25;
        field3158 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "(IIIII)V")
    public abstract void method606(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method594(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jj", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
    public final int method595() {
        return this.field3180 + this.field3154 + this.field3153;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()I")
    public final int method607() {
        return this.field3154;
    }

    @OriginalMember(owner = "client!jj", name = "AA", descriptor = "()I")
    public final int method602() {
        return this.field3171 + this.field3165 + this.field3167;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lql;II)V")
    public class236(class173 arg0, int arg1, int arg2) {
        this.field3156 = arg0;
        this.field3165 = arg1;
        this.field3154 = arg2;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
    public abstract void method1495(int arg0, int arg1);
}
