import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class344 extends class127 {

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "Ldg;")
    public class13 field5319;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    private static int field5311 = 0;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    public static int field5317 = 0;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field5301 = 0;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    private static int field5313 = 0;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field5318 = 0;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field5321 = 0;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field5305 = 0;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    private static int field5293;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    private static int field5294;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    private static int field5295;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    private static int field5299;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "[I")
    private int[] field5316;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(FFFFFFLma;II)V", line = 7)
    public final void method474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8) {
        if (this.field5319.method170()) {
            throw new IllegalStateException();
        }
        this.method2094(arg0, arg1, arg2, arg3, arg4, arg5);
        class393 var10 = (class393) arg6;
        this.method296(var10.field5900, var10.field5895, field5295 - arg7, -arg8 - (field5303 - field5294));
    }

    @OriginalMember(owner = "client!ho", name = "la", descriptor = "()I", line = 16)
    public final int method470() {
        return this.field5308;
    }

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "()I", line = 20)
    public final int method467() {
        return this.field5302 + this.field5289 + this.field5312;
    }

    @OriginalMember(owner = "client!ho", name = "ma", descriptor = "()I", line = 30)
    public final int method465() {
        return this.field5289;
    }

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "()I", line = 40)
    public final int method468() {
        return this.field5308 + this.field5292 + this.field5307;
    }

    @OriginalMember(owner = "client!ho", name = "JA", descriptor = "(IIIIIII)V", line = 45)
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5319.method170()) {
            throw new IllegalStateException();
        }
        if (this.field5316 == null) {
            this.field5316 = new int[4];
        }
        this.field5319.method109(this.field5316);
        this.field5319.method159(this.field5319.field163, this.field5319.field142, arg0 + arg2, arg1 + arg3);
        int var8 = this.method468();
        int var9 = this.method467();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method299(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5319.method84(this.field5316[0], this.field5316[1], this.field5316[2], this.field5316[3]);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIII)V", line = 95)
    public final void method475(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5319.method170()) {
            throw new IllegalStateException();
        }
        this.method2094(arg0, arg1, arg2, arg3, arg4, arg5);
        field5314 = arg7;
        if (arg6 != 1) {
            field5321 = arg7 >>> 24;
            field5317 = 256 - field5321;
            if (arg6 == 0) {
                field5301 = (arg7 & 0xFF0000) >> 16;
                field5318 = (arg7 & 0xFF00) >> 8;
                field5291 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field5313 = arg7 >>> 24;
                field5311 = 256 - field5313;
                int var10 = (arg7 & 0xFF00FF) * field5311 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field5311 & 0xFF0000;
                field5305 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method297(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method297(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method297(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method297(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method297(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method297(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method297(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method297(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method297(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method297(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method297(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method297(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "MA", descriptor = "(IIII)V", line = 215)
    public final void method464(int arg0, int arg1, int arg2, int arg3) {
        this.field5292 = arg0;
        this.field5302 = arg1;
        this.field5307 = arg2;
        this.field5312 = arg3;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ldg;II)V", line = 224)
    public class344(class13 arg0, int arg1, int arg2) {
        this.field5319 = arg0;
        this.field5308 = arg1;
        this.field5289 = arg2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFF)V", line = 237)
    private final void method2094(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5308 + this.field5292 + this.field5307;
        int var8 = this.field5302 + this.field5289 + this.field5312;
        if (this.field5308 != var7 || this.field5289 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5302 * var11;
            float var14 = (float) this.field5302 * var12;
            float var15 = (float) this.field5292 * var9;
            float var16 = (float) this.field5292 * var10;
            float var17 = (float) this.field5307 * -var9;
            float var18 = (float) this.field5307 * -var10;
            float var19 = (float) this.field5312 * -var11;
            float var20 = (float) this.field5312 * -var12;
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
        if (var23 < (float) this.field5319.field163) {
            var23 = this.field5319.field163;
        }
        if (var24 > (float) this.field5319.field131) {
            var24 = this.field5319.field131;
        }
        if (var25 < (float) this.field5319.field142) {
            var25 = this.field5319.field142;
        }
        if (var26 > (float) this.field5319.field162) {
            var26 = this.field5319.field162;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field5310 = this.field5319.field145;
        field5296 = (int) ((float) ((int) var25 * field5310) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5298 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5308 / var29);
        field5315 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5289 / var30);
        field5309 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5308 / var30);
        field5320 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5289 / var29);
        field5293 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5299 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5306 = (this.field5308 >> 1 << 12) + (field5309 * field5299 >> 4);
        field5297 = (this.field5289 >> 1 << 12) + (field5320 * field5299 >> 4);
        field5290 = field5298 * field5293 >> 4;
        field5304 = field5315 * field5293 >> 4;
        field5295 = (int) var23;
        field5300 = (int) var27;
        field5294 = (int) var25;
        field5303 = (int) var28;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILma;II)V")
    public abstract void method294(int arg0, int arg1, class249 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([I[III)V")
    public abstract void method296(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "(IIIII)V")
    public abstract void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)V")
    public abstract void method297(int arg0, int arg1);
}
