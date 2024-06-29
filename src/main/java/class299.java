import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class299 extends class417 {

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Let;")
    public class460 field4230;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field4212 = 0;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field4217 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    private static int field4214 = 0;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    private static int field4229 = 0;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field4228 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field4237 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    private static int field4218;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    private static int field4221;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    private static int field4232;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    private static int field4234;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
    private int[] field4224;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method1293() {
        return this.field4235;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)V")
    public final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4230.method2756()) {
            throw new IllegalStateException();
        }
        if (this.field4224 == null) {
            this.field4224 = new int[4];
        }
        this.field4230.method409(this.field4224);
        this.field4230.method443(this.field4230.field6484, this.field4230.field6499, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1294();
        int var9 = this.method1295();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method722(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4230.method453(this.field4224[0], this.field4224[1], this.field4224[2], this.field4224[3]);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method1288(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4230.method2756()) {
            throw new IllegalStateException();
        }
        this.method1929(arg0, arg1, arg2, arg3, arg4, arg5);
        field4226 = arg7;
        if (arg6 != 0) {
            field4213 = arg7 >>> 24;
            field4217 = 256 - field4213;
            if (arg6 == 1) {
                field4212 = (arg7 & 0xFF0000) >> 16;
                field4220 = (arg7 & 0xFF00) >> 8;
                field4237 = arg7 & 0xFF;
            } else {
                field4229 = arg7 >>> 24;
                field4214 = 256 - field4229;
                int var10 = (arg7 & 0xFF00FF) * field4214 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4214 & 0xFF0000;
                field4228 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method727(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method727(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method727(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method727(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method727(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method727(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method727(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method727(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method727(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(FFFFFFLoj;II)V")
    public final void method1286(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class405 arg6, int arg7, int arg8) {
        if (this.field4230.method2756()) {
            throw new IllegalStateException();
        }
        this.method1929(arg0, arg1, arg2, arg3, arg4, arg5);
        class187 var10 = (class187) arg6;
        this.method724(var10.field2803, var10.field2805, field4234 - arg7, -arg8 - (field4239 - field4232));
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
    public abstract void method727(int arg0, int arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
    public abstract void method722(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([I[III)V")
    public abstract void method724(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILoj;II)V")
    public abstract void method728(int arg0, int arg1, class405 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
    public final void method1291(int arg0, int arg1, int arg2, int arg3) {
        this.field4233 = arg0;
        this.field4225 = arg1;
        this.field4236 = arg2;
        this.field4227 = arg3;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
    public final int method1294() {
        return this.field4235 + this.field4233 + this.field4236;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()I")
    public final int method1287() {
        return this.field4240;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Let;II)V")
    public class299(class460 arg0, int arg1, int arg2) {
        this.field4230 = arg0;
        this.field4235 = arg1;
        this.field4240 = arg2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(FFFFFF)V")
    private final void method1929(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4235 + this.field4233 + this.field4236;
        int var8 = this.field4240 + this.field4225 + this.field4227;
        if (this.field4235 != var7 || this.field4240 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4225 * var11;
            float var14 = (float) this.field4225 * var12;
            float var15 = (float) this.field4233 * var9;
            float var16 = (float) this.field4233 * var10;
            float var17 = (float) this.field4236 * -var9;
            float var18 = (float) this.field4236 * -var10;
            float var19 = (float) this.field4227 * -var11;
            float var20 = (float) this.field4227 * -var12;
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
        if (var23 < (float) this.field4230.field6484) {
            var23 = (float) this.field4230.field6484;
        }
        if (var24 > (float) this.field4230.field6516) {
            var24 = (float) this.field4230.field6516;
        }
        if (var25 < (float) this.field4230.field6499) {
            var25 = (float) this.field4230.field6499;
        }
        if (var26 > (float) this.field4230.field6513) {
            var26 = (float) this.field4230.field6513;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4242 = this.field4230.field6521;
        field4223 = (int) ((float) ((int) var25 * field4242) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4222 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4235 / var29);
        field4216 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4240 / var30);
        field4219 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4235 / var30);
        field4241 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4240 / var29);
        field4218 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4221 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4231 = (this.field4235 >> 1 << 12) + (field4221 * field4219 >> 4);
        field4238 = (this.field4240 >> 1 << 12) + (field4241 * field4221 >> 4);
        field4215 = field4222 * field4218 >> 4;
        field4210 = field4218 * field4216 >> 4;
        field4234 = (int) var23;
        field4211 = (int) var27;
        field4232 = (int) var25;
        field4239 = (int) var28;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()I")
    public final int method1295() {
        return this.field4240 + this.field4225 + this.field4227;
    }
}
