import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class367 extends class140 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Ljr;")
    public class121 field5303;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field5292 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field5280 = 0;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    private static int field5298 = 0;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field5306 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field5307 = 0;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field5308 = 0;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    private static int field5309 = 0;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field5302 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    private static int field5279;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    private static int field5282;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    private static int field5283;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    private static int field5286;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "[I")
    private int[] field5297;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIIII)V", line = 4)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5303.method862()) {
            throw new IllegalStateException();
        }
        if (this.field5297 == null) {
            this.field5297 = new int[4];
        }
        this.field5303.method467(this.field5297);
        this.field5303.method525(this.field5303.field1645, this.field5303.field1643, arg0 + arg2, arg1 + arg3);
        int var8 = this.method343();
        int var9 = this.method340();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method358(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5303.method453(this.field5297[0], this.field5297[1], this.field5297[2], this.field5297[3]);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(FFFFFF)Z", line = 48)
    private final boolean method2305(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5296 + this.field5289 + this.field5290;
        int var8 = this.field5305 + this.field5300 + this.field5288;
        if (this.field5296 != var7 || this.field5300 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5305 * var11;
            float var14 = (float) this.field5305 * var12;
            float var15 = (float) this.field5289 * var9;
            float var16 = (float) this.field5289 * var10;
            float var17 = (float) this.field5290 * -var9;
            float var18 = (float) this.field5290 * -var10;
            float var19 = (float) this.field5288 * -var11;
            float var20 = (float) this.field5288 * -var12;
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
        if (var23 < (float) this.field5303.field1645) {
            var23 = this.field5303.field1645;
        }
        if (var24 > (float) this.field5303.field1642) {
            var24 = this.field5303.field1642;
        }
        if (var25 < (float) this.field5303.field1643) {
            var25 = this.field5303.field1643;
        }
        if (var26 > (float) this.field5303.field1655) {
            var26 = this.field5303.field1655;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field5294 = this.field5303.field1650;
        field5295 = (int) ((float) ((int) var25 * field5294) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5310 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5296 / var29);
        field5304 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5300 / var30);
        field5293 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5296 / var30);
        field5291 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5300 / var29);
        field5283 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5282 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5281 = (this.field5296 >> 1 << 12) + (field5293 * field5282 >> 4);
        field5299 = (this.field5300 >> 1 << 12) + (field5291 * field5282 >> 4);
        field5278 = field5310 * field5283 >> 4;
        field5301 = field5304 * field5283 >> 4;
        field5286 = (int) var23;
        field5287 = (int) var27;
        field5279 = (int) var25;
        field5285 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I", line = 190)
    public final int method350() {
        return this.field5296;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()I", line = 199)
    public final int method343() {
        return this.field5296 + this.field5289 + this.field5290;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()I", line = 208)
    public final int method351() {
        return this.field5300;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()I", line = 211)
    public final int method340() {
        return this.field5305 + this.field5300 + this.field5288;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 217)
    public final void method356(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
        if (this.field5303.method862()) {
            throw new IllegalStateException();
        } else if (this.method2305(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class55 var11 = (class55) arg7;
            this.method1398(var11.field650, var11.field652, field5286 - arg8, -arg9 - (field5285 - field5279));
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(FFFFFFIIII)V", line = 237)
    public final void method353(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field5303.method862()) {
            throw new IllegalStateException();
        } else if (this.method2305(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field5284 = arg7;
            if (arg6 != 1) {
                field5292 = arg7 >>> 24;
                field5307 = 256 - field5292;
                if (arg6 == 0) {
                    field5280 = (arg7 & 0xFF0000) >> 16;
                    field5306 = (arg7 & 0xFF00) >> 8;
                    field5308 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field5298 = arg7 >>> 24;
                    field5309 = 256 - field5298;
                    int var11 = (arg7 & 0xFF00FF) * field5309 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field5309 & 0xFF0000;
                    field5302 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1399(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1399(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1399(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1399(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1399(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1399(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1399(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1399(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1399(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1399(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1399(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1399(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V", line = 350)
    public final void method347(int arg0, int arg1, int arg2, int arg3) {
        this.field5289 = arg0;
        this.field5305 = arg1;
        this.field5290 = arg2;
        this.field5288 = arg3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljr;II)V", line = 356)
    public class367(class121 arg0, int arg1, int arg2) {
        this.field5303 = arg0;
        this.field5296 = arg1;
        this.field5300 = arg2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)V", line = 376)
    public final void method346(int[] arg0) {
        arg0[0] = this.field5289;
        arg0[1] = this.field5305;
        arg0[2] = this.field5290;
        arg0[3] = this.field5288;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    public abstract void method1399(int arg0, int arg1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method352(int arg0, int arg1, class512 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I[III)V")
    public abstract void method1398(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public abstract void method358(int arg0, int arg1, int arg2, int arg3, int arg4);
}
