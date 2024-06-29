import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public abstract class class737 extends class536 {

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "Liw;")
    public class316 field10340;

    @OriginalMember(owner = "client!sia", name = "B", descriptor = "I")
    public int field10346;

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
    public int field10337;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "I")
    public static int field10336 = 0;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "I")
    public static int field10328 = 0;

    @OriginalMember(owner = "client!sia", name = "A", descriptor = "I")
    private static int field10345 = 0;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    public static int field10344 = 0;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "I")
    private static int field10334 = 0;

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "I")
    public static int field10329 = 0;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public static int field10333 = 0;

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "I")
    public static int field10327 = 0;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    private static int field10320;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
    public int field10321;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public int field10324;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "I")
    private static int field10325;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "I")
    private static int field10326;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public static int field10332;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
    public int field10341;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
    public int field10343;

    @OriginalMember(owner = "client!sia", name = "C", descriptor = "I")
    private static int field10347;

    @OriginalMember(owner = "client!sia", name = "D", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!sia", name = "E", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!sia", name = "F", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!sia", name = "G", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "[I")
    private int[] field10339;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "()I", line = 3)
    public final int method1510() {
        return this.field10337;
    }

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "()I", line = 10)
    public final int method1514() {
        return this.field10343 + this.field10337 + this.field10324;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFF)Z", line = 20)
    private final boolean method4136(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field10346 + this.field10341 + this.field10321;
        int var8 = this.field10343 + this.field10337 + this.field10324;
        if (this.field10346 != var7 || this.field10337 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field10343 * var11;
            float var14 = (float) this.field10343 * var12;
            float var15 = (float) this.field10341 * var9;
            float var16 = (float) this.field10341 * var10;
            float var17 = (float) this.field10321 * -var9;
            float var18 = (float) this.field10321 * -var10;
            float var19 = (float) this.field10324 * -var11;
            float var20 = (float) this.field10324 * -var12;
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
        if (var23 < (float) this.field10340.field4478) {
            var23 = this.field10340.field4478;
        }
        if (var24 > (float) this.field10340.field4490) {
            var24 = this.field10340.field4490;
        }
        if (var25 < (float) this.field10340.field4492) {
            var25 = this.field10340.field4492;
        }
        if (var26 > (float) this.field10340.field4493) {
            var26 = this.field10340.field4493;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field10348 = this.field10340.field4479;
        field10335 = (int) ((float) ((int) var25 * field10348) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field10332 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field10346 / var29);
        field10322 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field10337 / var30);
        field10319 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field10346 / var30);
        field10342 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field10337 / var29);
        field10326 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field10320 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field10350 = (this.field10346 >> 1 << 12) + (field10320 * field10319 >> 4);
        field10331 = (this.field10337 >> 1 << 12) + (field10342 * field10320 >> 4);
        field10330 = field10332 * field10326 >> 4;
        field10349 = field10326 * field10322 >> 4;
        field10347 = (int) var23;
        field10338 = (int) var27;
        field10325 = (int) var25;
        field10323 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 156)
    public final void method1518(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class488 arg7, int arg8, int arg9) {
        if (this.field10340.method2000()) {
            throw new IllegalStateException();
        } else if (this.method4136(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class341 var11 = (class341) arg7;
            this.method129(var11.field4951, var11.field4955, field10347 - arg8, -arg9 - (field10323 - field10325));
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(IIIIIII)V", line = 168)
    public final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field10340.method2000()) {
            throw new IllegalStateException();
        }
        if (this.field10339 == null) {
            this.field10339 = new int[4];
        }
        this.field10340.method530(this.field10339);
        this.field10340.method509(this.field10340.field4478, this.field10340.field4492, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1504();
        int var9 = this.method1514();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method133(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field10340.method476(this.field10339[0], this.field10339[1], this.field10339[2], this.field10339[3]);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIII)V", line = 207)
    public final void method1505(int arg0, int arg1, int arg2, int arg3) {
        this.field10341 = arg0;
        this.field10343 = arg1;
        this.field10321 = arg2;
        this.field10324 = arg3;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I)V", line = 215)
    public final void method1507(int[] arg0) {
        arg0[0] = this.field10341;
        arg0[1] = this.field10343;
        arg0[2] = this.field10321;
        arg0[3] = this.field10324;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FFFFFFIIII)V", line = 226)
    public final void method1508(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field10340.method2000()) {
            throw new IllegalStateException();
        } else if (this.method4136(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field10351 = arg7;
            if (arg6 != 1) {
                field10328 = arg7 >>> 24;
                field10336 = 256 - field10328;
                if (arg6 == 0) {
                    field10333 = (arg7 & 0xFF0000) >> 16;
                    field10344 = (arg7 & 0xFF00) >> 8;
                    field10329 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field10345 = arg7 >>> 24;
                    field10334 = 256 - field10345;
                    int var11 = (arg7 & 0xFF00FF) * field10334 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field10334 & 0xFF0000;
                    field10327 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method134(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method134(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method134(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method134(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method134(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method134(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method134(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method134(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method134(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method134(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method134(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method134(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "()I", line = 340)
    public final int method1517() {
        return this.field10346;
    }

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "()I", line = 365)
    public final int method1504() {
        return this.field10346 + this.field10341 + this.field10321;
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Liw;II)V", line = 374)
    public class737(class316 arg0, int arg1, int arg2) {
        this.field10340 = arg0;
        this.field10346 = arg1;
        this.field10337 = arg2;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method131(int arg0, int arg1, class488 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)V")
    public abstract void method134(int arg0, int arg1);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([I[III)V")
    public abstract void method129(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3, int arg4);
}
