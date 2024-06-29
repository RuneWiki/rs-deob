import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public abstract class class658 extends class743 {

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "Luj;")
    public class381 field9280;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public int field9265;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
    public int field9275;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    private static int field9256 = 0;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field9255 = 0;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field9270 = 0;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field9260 = 0;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field9276 = 0;

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "I")
    public static int field9277 = 0;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    public static int field9269 = 0;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "I")
    private static int field9274 = 0;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public int field9254;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    private static int field9257;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public int field9259;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    private static int field9261;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    private static int field9263;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    private static int field9267;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
    public int field9272;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    public int field9273;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "[I")
    private int[] field9250;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFFIIII)V", line = 4)
    public final void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field9280.method2382()) {
            throw new IllegalStateException();
        } else if (this.method3706(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field9266 = arg7;
            if (arg6 != 1) {
                field9276 = arg7 >>> 24;
                field9269 = 256 - field9276;
                if (arg6 == 0) {
                    field9260 = (arg7 & 0xFF0000) >> 16;
                    field9270 = (arg7 & 0xFF00) >> 8;
                    field9255 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field9256 = arg7 >>> 24;
                    field9274 = 256 - field9256;
                    int var11 = (arg7 & 0xFF00FF) * field9274 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field9274 & 0xFF0000;
                    field9277 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method874(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method874(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method874(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method874(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method874(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method874(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method874(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method874(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method874(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method874(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method874(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method874(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 101)
    public final void method92(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class484 arg7, int arg8, int arg9) {
        if (this.field9280.method2382()) {
            throw new IllegalStateException();
        } else if (this.method3706(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class737 var11 = (class737) arg7;
            this.method876(var11.field10372, var11.field10374, field9257 - arg8, -arg9 - (field9262 - field9261));
        }
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "()I", line = 116)
    public final int method82() {
        return this.field9265 + this.field9259 + this.field9272;
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "()I", line = 132)
    public final int method95() {
        return this.field9275;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "()I", line = 141)
    public final int method93() {
        return this.field9265;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIII)V", line = 151)
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9280.method2382()) {
            throw new IllegalStateException();
        }
        if (this.field9250 == null) {
            this.field9250 = new int[4];
        }
        this.field9280.method624(this.field9250);
        this.field9280.method583(this.field9280.field5317, this.field9280.field5340, arg0 + arg2, arg1 + arg3);
        int var8 = this.method82();
        int var9 = this.method83();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method86(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field9280.method584(this.field9250[0], this.field9250[1], this.field9250[2], this.field9250[3]);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFF)Z", line = 192)
    private final boolean method3706(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field9265 + this.field9259 + this.field9272;
        int var8 = this.field9275 + this.field9254 + this.field9273;
        if (this.field9265 != var7 || this.field9275 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field9254 * var11;
            float var14 = (float) this.field9254 * var12;
            float var15 = (float) this.field9259 * var9;
            float var16 = (float) this.field9259 * var10;
            float var17 = (float) this.field9272 * -var9;
            float var18 = (float) this.field9272 * -var10;
            float var19 = (float) this.field9273 * -var11;
            float var20 = (float) this.field9273 * -var12;
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
        if (var23 < (float) this.field9280.field5317) {
            var23 = this.field9280.field5317;
        }
        if (var24 > (float) this.field9280.field5328) {
            var24 = this.field9280.field5328;
        }
        if (var25 < (float) this.field9280.field5340) {
            var25 = this.field9280.field5340;
        }
        if (var26 > (float) this.field9280.field5350) {
            var26 = this.field9280.field5350;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field9252 = this.field9280.field5347;
        field9271 = (int) ((float) ((int) var25 * field9252) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field9268 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field9265 / var29);
        field9278 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field9275 / var30);
        field9258 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field9265 / var30);
        field9251 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field9275 / var29);
        field9267 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field9263 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field9253 = (this.field9265 >> 1 << 12) + (field9263 * field9258 >> 4);
        field9281 = (this.field9275 >> 1 << 12) + (field9263 * field9251 >> 4);
        field9282 = field9268 * field9267 >> 4;
        field9264 = field9278 * field9267 >> 4;
        field9257 = (int) var23;
        field9279 = (int) var27;
        field9261 = (int) var25;
        field9262 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "()I", line = 342)
    public final int method83() {
        return this.field9275 + this.field9254 + this.field9273;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(IIII)V", line = 358)
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        this.field9259 = arg0;
        this.field9254 = arg1;
        this.field9272 = arg2;
        this.field9273 = arg3;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Luj;II)V", line = 367)
    public class658(class381 arg0, int arg1, int arg2) {
        this.field9280 = arg0;
        this.field9265 = arg1;
        this.field9275 = arg2;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method90(int arg0, int arg1, class484 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
    public abstract void method874(int arg0, int arg1);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([I[III)V")
    public abstract void method876(int[] arg0, int[] arg1, int arg2, int arg3);
}
