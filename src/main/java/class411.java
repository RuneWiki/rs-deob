import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class class411 extends class24 {

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "Lsr;")
    public class167 field6233;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "I")
    public int field6245;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field6223 = 0;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field6230 = 0;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field6225 = 0;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "I")
    public static int field6239 = 0;

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "I")
    private static int field6241 = 0;

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
    private static int field6240 = 0;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field6214 = 0;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    public static int field6246 = 0;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    private static int field6220;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    private static int field6221;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    private static int field6222;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public int field6229;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    private static int field6232;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "I")
    public int field6243;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "[I")
    private int[] field6234;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        if (this.field6233.method1173()) {
            throw new IllegalStateException();
        }
        this.method2540(arg0, arg1, arg2, arg3, arg4, arg5);
        class105 var10 = (class105) arg6;
        this.method991(var10.field1962, var10.field1966, field6222 - arg7, -arg8 - (field6219 - field6220));
    }

    @OriginalMember(owner = "client!iu", name = "W", descriptor = "(IIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!iu", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!iu", name = "ZA", descriptor = "()I")
    public final int method154() {
        return this.field6245;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IILta;II)V")
    public abstract void method166(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!iu", name = "ha", descriptor = "(IIII)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3) {
        this.field6243 = arg0;
        this.field6235 = arg1;
        this.field6217 = arg2;
        this.field6229 = arg3;
    }

    @OriginalMember(owner = "client!iu", name = "Q", descriptor = "()I")
    public final int method165() {
        return this.field6245 + this.field6235 + this.field6229;
    }

    @OriginalMember(owner = "client!iu", name = "YA", descriptor = "()I")
    public final int method157() {
        return this.field6238;
    }

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6233.method1173()) {
            throw new IllegalStateException();
        }
        this.method2540(arg0, arg1, arg2, arg3, arg4, arg5);
        field6216 = arg7;
        if (arg6 != 1) {
            field6225 = arg7 >>> 24;
            field6246 = 256 - field6225;
            if (arg6 == 0) {
                field6230 = (arg7 & 0xFF0000) >> 16;
                field6239 = (arg7 & 0xFF00) >> 8;
                field6223 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field6241 = arg7 >>> 24;
                field6240 = 256 - field6241;
                int var10 = (arg7 & 0xFF00FF) * field6240 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field6240 & 0xFF0000;
                field6214 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method990(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method990(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method990(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method990(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method990(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method990(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method990(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method990(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method990(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method990(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method990(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method990(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "RA", descriptor = "()I")
    public final int method147() {
        return this.field6243 + this.field6238 + this.field6217;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
    public abstract void method990(int arg0, int arg1);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(FFFFFF)V")
    private final void method2540(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6243 + this.field6238 + this.field6217;
        int var8 = this.field6245 + this.field6235 + this.field6229;
        if (this.field6238 != var7 || this.field6245 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6235 * var11;
            float var14 = (float) this.field6235 * var12;
            float var15 = (float) this.field6243 * var9;
            float var16 = (float) this.field6243 * var10;
            float var17 = (float) this.field6217 * -var9;
            float var18 = (float) this.field6217 * -var10;
            float var19 = (float) this.field6229 * -var11;
            float var20 = (float) this.field6229 * -var12;
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
        if (var23 < (float) this.field6233.field2697) {
            var23 = this.field6233.field2697;
        }
        if (var24 > (float) this.field6233.field2707) {
            var24 = this.field6233.field2707;
        }
        if (var25 < (float) this.field6233.field2702) {
            var25 = this.field6233.field2702;
        }
        if (var26 > (float) this.field6233.field2705) {
            var26 = this.field6233.field2705;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field6244 = this.field6233.field2711;
        field6236 = (int) ((float) ((int) var25 * field6244) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6237 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6238 / var29);
        field6218 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6245 / var30);
        field6227 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6238 / var30);
        field6226 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6245 / var29);
        field6232 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6221 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6228 = (this.field6238 >> 1 << 12) + (field6227 * field6221 >> 4);
        field6224 = (this.field6245 >> 1 << 12) + (field6226 * field6221 >> 4);
        field6242 = field6237 * field6232 >> 4;
        field6215 = field6232 * field6218 >> 4;
        field6222 = (int) var23;
        field6231 = (int) var27;
        field6220 = (int) var25;
        field6219 = (int) var28;
    }

    @OriginalMember(owner = "client!iu", name = "la", descriptor = "(IIIIIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6233.method1173()) {
            throw new IllegalStateException();
        }
        if (this.field6234 == null) {
            this.field6234 = new int[4];
        }
        this.field6233.method387(this.field6234);
        this.field6233.method344(this.field6233.field2697, this.field6233.field2702, arg0 + arg2, arg1 + arg3);
        int var8 = this.method147();
        int var9 = this.method165();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method167(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6233.method371(this.field6234[0], this.field6234[1], this.field6234[2], this.field6234[3]);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([I[III)V")
    public abstract void method991(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lsr;II)V")
    public class411(class167 arg0, int arg1, int arg2) {
        this.field6233 = arg0;
        this.field6238 = arg1;
        this.field6245 = arg2;
    }
}
