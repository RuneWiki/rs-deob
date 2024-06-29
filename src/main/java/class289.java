import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class289 extends class468 {

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "Lqe;")
    public class437 field4105;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4085 = 0;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field4089 = 0;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    private static int field4100 = 0;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field4086 = 0;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field4097 = 0;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4079 = 0;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    private static int field4108 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    private static int field4094;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    private static int field4098;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    private static int field4103;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    private static int field4109;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
    private int[] field4093;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()I")
    public final int method1028() {
        return this.field4083;
    }

    @OriginalMember(owner = "client!aj", name = "AA", descriptor = "()I")
    public final int method1025() {
        return this.field4099 + this.field4090 + this.field4091;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public abstract void method275(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class217 arg6, int arg7, int arg8) {
        if (this.field4105.method2482()) {
            throw new IllegalStateException();
        } else if (this.method1785(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class106 var10 = (class106) arg6;
            this.method270(var10.field1575, var10.field1574, field4094 - arg7, -arg8 - (field4082 - field4109));
        }
    }

    @OriginalMember(owner = "client!aj", name = "ba", descriptor = "(IIIIIII)V")
    public final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4105.method2482()) {
            throw new IllegalStateException();
        }
        if (this.field4093 == null) {
            this.field4093 = new int[4];
        }
        this.field4105.method433(this.field4093);
        this.field4105.method459(this.field4105.field5999, this.field4105.field5985, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1025();
        int var9 = this.method1030();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method271(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4105.method421(this.field4093[0], this.field4093[1], this.field4093[2], this.field4093[3]);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
    public final int method1030() {
        return this.field4087 + this.field4083 + this.field4102;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method1785(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4099 + this.field4090 + this.field4091;
        int var8 = this.field4087 + this.field4083 + this.field4102;
        if (this.field4090 != var7 || this.field4083 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4087 * var11;
            float var14 = (float) this.field4087 * var12;
            float var15 = (float) this.field4099 * var9;
            float var16 = (float) this.field4099 * var10;
            float var17 = (float) this.field4091 * -var9;
            float var18 = (float) this.field4091 * -var10;
            float var19 = (float) this.field4102 * -var11;
            float var20 = (float) this.field4102 * -var12;
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
        if (var23 < (float) this.field4105.field5999) {
            var23 = this.field4105.field5999;
        }
        if (var24 > (float) this.field4105.field6014) {
            var24 = this.field4105.field6014;
        }
        if (var25 < (float) this.field4105.field5985) {
            var25 = this.field4105.field5985;
        }
        if (var26 > (float) this.field4105.field6001) {
            var26 = this.field4105.field6001;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field4101 = this.field4105.field5995;
        field4077 = (int) ((float) ((int) var25 * field4101) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4084 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4090 / var29);
        field4095 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4083 / var30);
        field4106 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4090 / var30);
        field4096 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4083 / var29);
        field4103 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4098 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4088 = (this.field4090 >> 1 << 12) + (field4106 * field4098 >> 4);
        field4104 = (this.field4083 >> 1 << 12) + (field4098 * field4096 >> 4);
        field4081 = field4103 * field4084 >> 4;
        field4078 = field4103 * field4095 >> 4;
        field4094 = (int) var23;
        field4080 = (int) var27;
        field4109 = (int) var25;
        field4082 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "EA", descriptor = "(IIII)V")
    public final void method1029(int arg0, int arg1, int arg2, int arg3) {
        this.field4099 = arg0;
        this.field4087 = arg1;
        this.field4091 = arg2;
        this.field4102 = arg3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method276(int arg0, int arg1, class217 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([I[III)V")
    public abstract void method270(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aj", name = "QA", descriptor = "()I")
    public final int method1035() {
        return this.field4090;
    }

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "(IIIII)V")
    public abstract void method271(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aj", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method1036(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4105.method2482()) {
            throw new IllegalStateException();
        } else if (this.method1785(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field4107 = arg7;
            if (arg6 != 1) {
                field4097 = arg7 >>> 24;
                field4092 = 256 - field4097;
                if (arg6 == 0) {
                    field4085 = (arg7 & 0xFF0000) >> 16;
                    field4079 = (arg7 & 0xFF00) >> 8;
                    field4086 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field4108 = arg7 >>> 24;
                    field4100 = 256 - field4108;
                    int var10 = (arg7 & 0xFF00FF) * field4100 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field4100 & 0xFF0000;
                    field4089 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method275(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method275(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method275(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method275(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method275(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method275(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method275(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method275(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method275(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method275(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method275(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method275(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lqe;II)V")
    public class289(class437 arg0, int arg1, int arg2) {
        this.field4105 = arg0;
        this.field4090 = arg1;
        this.field4083 = arg2;
    }
}
