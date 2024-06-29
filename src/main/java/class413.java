import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class413 extends class341 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Lvq;")
    public class326 field6289;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field6296;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public int field6290;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field6280 = 0;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    private static int field6281 = 0;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    private static int field6285 = 0;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field6275 = 0;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field6293 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field6276 = 0;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field6292 = 0;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field6299 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    private static int field6269;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public int field6286;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    private static int field6287;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public int field6288;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    private static int field6295;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    private static int field6297;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "[I")
    private int[] field6284;

    @OriginalMember(owner = "client!nf", name = "ta", descriptor = "(FFFFFFIII)V", line = 12)
    public final void method292(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6289.method2108()) {
            throw new IllegalStateException();
        } else if (this.method2542(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field6273 = arg7;
            if (arg6 != 1) {
                field6293 = arg7 >>> 24;
                field6276 = 256 - field6293;
                if (arg6 == 0) {
                    field6292 = (arg7 & 0xFF0000) >> 16;
                    field6280 = (arg7 & 0xFF00) >> 8;
                    field6275 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field6285 = arg7 >>> 24;
                    field6281 = 256 - field6285;
                    int var10 = (arg7 & 0xFF00FF) * field6281 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field6281 & 0xFF0000;
                    field6299 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1447(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1447(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1447(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1447(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1447(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1447(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1447(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1447(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1447(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1447(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1447(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1447(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "TA", descriptor = "()I", line = 112)
    public final int method296() {
        return this.field6296;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFLi;II)V", line = 116)
    public final void method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8) {
        if (this.field6289.method2108()) {
            throw new IllegalStateException();
        } else if (this.method2542(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class270 var10 = (class270) arg6;
            this.method1448(var10.field3760, var10.field3757, field6269 - arg7, -arg8 - (field6270 - field6287));
        }
    }

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "(IIII)V", line = 133)
    public final void method294(int arg0, int arg1, int arg2, int arg3) {
        this.field6272 = arg0;
        this.field6288 = arg1;
        this.field6298 = arg2;
        this.field6286 = arg3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFF)Z", line = 146)
    private final boolean method2542(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6296 + this.field6272 + this.field6298;
        int var8 = this.field6290 + this.field6288 + this.field6286;
        if (this.field6296 != var7 || this.field6290 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6288 * var11;
            float var14 = (float) this.field6288 * var12;
            float var15 = (float) this.field6272 * var9;
            float var16 = (float) this.field6272 * var10;
            float var17 = (float) this.field6298 * -var9;
            float var18 = (float) this.field6298 * -var10;
            float var19 = (float) this.field6286 * -var11;
            float var20 = (float) this.field6286 * -var12;
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
        if (var23 < (float) this.field6289.field5073) {
            var23 = this.field6289.field5073;
        }
        if (var24 > (float) this.field6289.field5088) {
            var24 = this.field6289.field5088;
        }
        if (var25 < (float) this.field6289.field5048) {
            var25 = this.field6289.field5048;
        }
        if (var26 > (float) this.field6289.field5060) {
            var26 = this.field6289.field5060;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field6274 = this.field6289.field5053;
        field6279 = (int) ((float) ((int) var25 * field6274) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6277 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6296 / var29);
        field6300 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6290 / var30);
        field6282 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6296 / var30);
        field6291 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6290 / var29);
        field6297 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6295 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6294 = (this.field6296 >> 1 << 12) + (field6295 * field6282 >> 4);
        field6278 = (this.field6290 >> 1 << 12) + (field6295 * field6291 >> 4);
        field6283 = field6297 * field6277 >> 4;
        field6271 = field6300 * field6297 >> 4;
        field6269 = (int) var23;
        field6268 = (int) var27;
        field6287 = (int) var25;
        field6270 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "()I", line = 295)
    public final int method305() {
        return this.field6290;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()I", line = 300)
    public final int method302() {
        return this.field6296 + this.field6272 + this.field6298;
    }

    @OriginalMember(owner = "client!nf", name = "PA", descriptor = "(IIIIIII)V", line = 311)
    public final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6289.method2108()) {
            throw new IllegalStateException();
        }
        if (this.field6284 == null) {
            this.field6284 = new int[4];
        }
        this.field6289.method850(this.field6284);
        this.field6289.method828(this.field6289.field5073, this.field6289.field5048, arg0 + arg2, arg1 + arg3);
        int var8 = this.method302();
        int var9 = this.method306();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method297(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6289.method739(this.field6284[0], this.field6284[1], this.field6284[2], this.field6284[3]);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lvq;II)V", line = 359)
    public class413(class326 arg0, int arg1, int arg2) {
        this.field6289 = arg0;
        this.field6296 = arg1;
        this.field6290 = arg2;
    }

    @OriginalMember(owner = "client!nf", name = "ga", descriptor = "()I", line = 365)
    public final int method306() {
        return this.field6290 + this.field6288 + this.field6286;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)V")
    public abstract void method1447(int arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILi;II)V")
    public abstract void method303(int arg0, int arg1, class30 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([I[III)V")
    public abstract void method1448(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "XA", descriptor = "(IIIIIII)V")
    public abstract void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "(IIIII)V")
    public abstract void method297(int arg0, int arg1, int arg2, int arg3, int arg4);
}
