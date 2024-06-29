import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class439 extends class80 {

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lvn;")
    public class425 field6288;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public int field6291;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field6292 = 0;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field6284 = 0;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    private static int field6286 = 0;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field6302 = 0;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    private static int field6304 = 0;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field6297 = 0;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
    public static int field6308 = 0;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field6313 = 0;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public int field6282;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private static int field6285;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public int field6293;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public int field6295;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    private static int field6301;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    private static int field6306;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    private static int field6312;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "[I")
    private int[] field6294;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIII)V", line = 5)
    public final void method738(int arg0, int arg1, int arg2, int arg3) {
        this.field6293 = arg0;
        this.field6303 = arg1;
        this.field6295 = arg2;
        this.field6282 = arg3;
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "()I", line = 18)
    public final int method740() {
        return this.field6293 + this.field6291 + this.field6295;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFIII)V", line = 28)
    public final void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6288.method2614()) {
            throw new IllegalStateException();
        }
        this.method2726(arg0, arg1, arg2, arg3, arg4, arg5);
        field6296 = arg7;
        if (arg6 != 0) {
            field6308 = arg7 >>> 24;
            field6292 = 256 - field6308;
            if (arg6 == 1) {
                field6297 = (arg7 & 0xFF0000) >> 16;
                field6313 = (arg7 & 0xFF00) >> 8;
                field6284 = arg7 & 0xFF;
            } else {
                field6286 = arg7 >>> 24;
                field6304 = 256 - field6286;
                int var10 = (arg7 & 0xFF00FF) * field6304 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field6304 & 0xFF0000;
                field6302 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1414(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1414(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1414(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1414(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1414(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1414(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1414(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1414(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1414(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()I", line = 107)
    public final int method723() {
        return this.field6291;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFLvj;II)V", line = 116)
    public final void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class179 arg6, int arg7, int arg8) {
        if (this.field6288.method2614()) {
            throw new IllegalStateException();
        }
        this.method2726(arg0, arg1, arg2, arg3, arg4, arg5);
        class280 var10 = (class280) arg6;
        this.method1415(var10.field3748, var10.field3751, field6312 - arg7, -arg8 - (field6309 - field6306));
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFF)V", line = 130)
    private final void method2726(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6293 + this.field6291 + this.field6295;
        int var8 = this.field6303 + this.field6298 + this.field6282;
        if (this.field6291 != var7 || this.field6298 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6303 * var11;
            float var14 = (float) this.field6303 * var12;
            float var15 = (float) this.field6293 * var9;
            float var16 = (float) this.field6293 * var10;
            float var17 = (float) this.field6295 * -var9;
            float var18 = (float) this.field6295 * -var10;
            float var19 = (float) this.field6282 * -var11;
            float var20 = (float) this.field6282 * -var12;
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
        if (var23 < (float) this.field6288.field5994) {
            var23 = (float) this.field6288.field5994;
        }
        if (var24 > (float) this.field6288.field6012) {
            var24 = (float) this.field6288.field6012;
        }
        if (var25 < (float) this.field6288.field5977) {
            var25 = (float) this.field6288.field5977;
        }
        if (var26 > (float) this.field6288.field5997) {
            var26 = (float) this.field6288.field5997;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field6299 = this.field6288.field5970;
        field6310 = (int) ((float) ((int) var25 * field6299) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6290 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6291 / var29);
        field6311 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6298 / var30);
        field6289 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6291 / var30);
        field6287 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6298 / var29);
        field6285 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6301 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6283 = (this.field6291 >> 1 << 12) + (field6301 * field6289 >> 4);
        field6307 = (this.field6298 >> 1 << 12) + (field6301 * field6287 >> 4);
        field6314 = field6290 * field6285 >> 4;
        field6300 = field6311 * field6285 >> 4;
        field6312 = (int) var23;
        field6305 = (int) var27;
        field6306 = (int) var25;
        field6309 = (int) var28;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lvn;II)V", line = 271)
    public class439(class425 arg0, int arg1, int arg2) {
        this.field6288 = arg0;
        this.field6291 = arg1;
        this.field6298 = arg2;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "()I", line = 277)
    public final int method733() {
        return this.field6298;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIIIIII)V", line = 282)
    public final void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6288.method2614()) {
            throw new IllegalStateException();
        }
        if (this.field6294 == null) {
            this.field6294 = new int[4];
        }
        this.field6288.method90(this.field6294);
        this.field6288.method218(this.field6288.field5994, this.field6288.field5977, arg0 + arg2, arg1 + arg3);
        int var8 = this.method740();
        int var9 = this.method739();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method730(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6288.method111(this.field6294[0], this.field6294[1], this.field6294[2], this.field6294[3]);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "()I", line = 340)
    public final int method739() {
        return this.field6303 + this.field6298 + this.field6282;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
    public abstract void method730(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([I[III)V")
    public abstract void method1415(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILvj;II)V")
    public abstract void method721(int arg0, int arg1, class179 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V")
    public abstract void method1414(int arg0, int arg1);
}
