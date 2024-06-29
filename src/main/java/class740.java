import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class740 extends class112 {

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Lni;")
    public class545 field10320;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public int field10343;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public int field10335;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field10313 = 0;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field10321 = 0;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field10337 = 0;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field10323 = 0;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    private static int field10328 = 0;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field10318 = 0;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field10340 = 0;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    private static int field10342 = 0;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public int field10315;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public int field10316;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    private static int field10327;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public int field10329;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public int field10331;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    private static int field10334;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    private static int field10336;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    private static int field10344;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "[I")
    private int[] field10332;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "()I")
    public final int method781() {
        return this.field10343 + this.field10329 + this.field10331;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(IIIIIII)V")
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field10320.method3162()) {
            throw new IllegalStateException();
        }
        if (this.field10332 == null) {
            this.field10332 = new int[4];
        }
        this.field10320.method428(this.field10332);
        this.field10320.method453(this.field10320.field7681, this.field10320.field7678, arg0 + arg2, arg1 + arg3);
        int var8 = this.method781();
        int var9 = this.method792();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method795(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field10320.method455(this.field10332[0], this.field10332[1], this.field10332[2], this.field10332[3]);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method793(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
        if (this.field10320.method3162()) {
            throw new IllegalStateException();
        } else if (this.method4143(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class70 var11 = (class70) arg7;
            this.method3411(var11.field957, var11.field956, field10336 - arg8, -arg9 - (field10317 - field10344));
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([I[III)V")
    public abstract void method3411(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
    public abstract void method795(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "()I")
    public final int method789() {
        return this.field10335;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method3410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method800(int arg0, int arg1, class510 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([I)V")
    public final void method787(int[] arg0) {
        arg0[0] = this.field10329;
        arg0[1] = this.field10315;
        arg0[2] = this.field10331;
        arg0[3] = this.field10316;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()I")
    public final int method777() {
        return this.field10343;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "()I")
    public final int method792() {
        return this.field10335 + this.field10315 + this.field10316;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method4143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field10343 + this.field10329 + this.field10331;
        int var8 = this.field10335 + this.field10315 + this.field10316;
        if (this.field10343 != var7 || this.field10335 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field10315 * var11;
            float var14 = (float) this.field10315 * var12;
            float var15 = (float) this.field10329 * var9;
            float var16 = (float) this.field10329 * var10;
            float var17 = (float) this.field10331 * -var9;
            float var18 = (float) this.field10331 * -var10;
            float var19 = (float) this.field10316 * -var11;
            float var20 = (float) this.field10316 * -var12;
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
        if (var23 < (float) this.field10320.field7681) {
            var23 = this.field10320.field7681;
        }
        if (var24 > (float) this.field10320.field7695) {
            var24 = this.field10320.field7695;
        }
        if (var25 < (float) this.field10320.field7678) {
            var25 = this.field10320.field7678;
        }
        if (var26 > (float) this.field10320.field7673) {
            var26 = this.field10320.field7673;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field10324 = this.field10320.field7686;
        field10333 = (int) ((float) ((int) var25 * field10324) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field10326 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field10343 / var29);
        field10341 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field10335 / var30);
        field10330 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field10343 / var30);
        field10338 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field10335 / var29);
        field10327 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field10334 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field10339 = (this.field10343 >> 1 << 12) + (field10334 * field10330 >> 4);
        field10325 = (this.field10335 >> 1 << 12) + (field10338 * field10334 >> 4);
        field10314 = field10327 * field10326 >> 4;
        field10319 = field10341 * field10327 >> 4;
        field10336 = (int) var23;
        field10312 = (int) var27;
        field10344 = (int) var25;
        field10317 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(IIII)V")
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        this.field10329 = arg0;
        this.field10315 = arg1;
        this.field10331 = arg2;
        this.field10316 = arg3;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
    public abstract void method3409(int arg0, int arg1);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field10320.method3162()) {
            throw new IllegalStateException();
        } else if (this.method4143(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field10322 = arg7;
            if (arg6 != 1) {
                field10337 = arg7 >>> 24;
                field10340 = 256 - field10337;
                if (arg6 == 0) {
                    field10313 = (arg7 & 0xFF0000) >> 16;
                    field10318 = (arg7 & 0xFF00) >> 8;
                    field10323 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field10328 = arg7 >>> 24;
                    field10342 = 256 - field10328;
                    int var11 = (arg7 & 0xFF00FF) * field10342 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field10342 & 0xFF0000;
                    field10321 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method3409(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3409(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3409(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method3409(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3409(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3409(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method3409(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3409(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3409(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method3409(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3409(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3409(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lni;II)V")
    public class740(class545 arg0, int arg1, int arg2) {
        this.field10320 = arg0;
        this.field10343 = arg1;
        this.field10335 = arg2;
    }
}
