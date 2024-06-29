import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class640 extends class536 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lnga;")
    public class578 field8996;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public int field9005;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public int field9009;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field9001 = 0;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field9004 = 0;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field9006 = 0;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    private static int field9018 = 0;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    private static int field9003 = 0;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field9021 = 0;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
    public static int field9024 = 0;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field9013 = 0;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    private static int field8998;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    private static int field8999;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public int field9000;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public int field9011;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    private static int field9012;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    private static int field9014;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public int field9023;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public int field9025;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "[I")
    private int[] field9010;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "()I", line = 10)
    public final int method160() {
        return this.field9025 + this.field9005 + this.field9011;
    }

    @OriginalMember(owner = "client!qp", name = "ca", descriptor = "()I", line = 16)
    public final int method166() {
        return this.field9009 + this.field9000 + this.field9023;
    }

    @OriginalMember(owner = "client!qp", name = "DA", descriptor = "(IIIIIII)V", line = 20)
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8996.method3185()) {
            throw new IllegalStateException();
        }
        if (this.field9010 == null) {
            this.field9010 = new int[4];
        }
        this.field8996.method1060(this.field9010);
        this.field8996.method1070(this.field8996.field8103, this.field8996.field8073, arg0 + arg2, arg1 + arg3);
        int var8 = this.method160();
        int var9 = this.method166();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method155(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field8996.method1083(this.field9010[0], this.field9010[1], this.field9010[2], this.field9010[3]);
    }

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "(IIII)V", line = 62)
    public final void method161(int arg0, int arg1, int arg2, int arg3) {
        this.field9025 = arg0;
        this.field9000 = arg1;
        this.field9011 = arg2;
        this.field9023 = arg3;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(FFFFFFILua;II)V", line = 74)
    public final void method163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class600 arg7, int arg8, int arg9) {
        if (this.field8996.method3185()) {
            throw new IllegalStateException();
        } else if (this.method3581(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class355 var11 = (class355) arg7;
            this.method498(var11.field4526, var11.field4530, field8998 - arg8, -arg9 - (field9026 - field8999));
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(FFFFFF)Z", line = 88)
    private final boolean method3581(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field9025 + this.field9005 + this.field9011;
        int var8 = this.field9009 + this.field9000 + this.field9023;
        if (this.field9005 != var7 || this.field9009 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field9000 * var11;
            float var14 = (float) this.field9000 * var12;
            float var15 = (float) this.field9025 * var9;
            float var16 = (float) this.field9025 * var10;
            float var17 = (float) this.field9011 * -var9;
            float var18 = (float) this.field9011 * -var10;
            float var19 = (float) this.field9023 * -var11;
            float var20 = (float) this.field9023 * -var12;
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
        if (var23 < (float) this.field8996.field8103) {
            var23 = this.field8996.field8103;
        }
        if (var24 > (float) this.field8996.field8080) {
            var24 = this.field8996.field8080;
        }
        if (var25 < (float) this.field8996.field8073) {
            var25 = this.field8996.field8073;
        }
        if (var26 > (float) this.field8996.field8107) {
            var26 = this.field8996.field8107;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field9015 = this.field8996.field8081;
        field9016 = (int) ((float) ((int) var25 * field9015) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field9002 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field9005 / var29);
        field9008 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field9009 / var30);
        field9007 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field9005 / var30);
        field9027 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field9009 / var29);
        field9012 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field9014 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field9022 = (this.field9005 >> 1 << 12) + (field9014 * field9007 >> 4);
        field9020 = (this.field9009 >> 1 << 12) + (field9027 * field9014 >> 4);
        field8995 = field9012 * field9002 >> 4;
        field8997 = field9012 * field9008 >> 4;
        field8998 = (int) var23;
        field9019 = (int) var27;
        field8999 = (int) var25;
        field9026 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "qa", descriptor = "(FFFFFFIIII)V", line = 228)
    public final void method159(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8996.method3185()) {
            throw new IllegalStateException();
        } else if (this.method3581(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field9017 = arg7;
            if (arg6 != 1) {
                field9024 = arg7 >>> 24;
                field9013 = 256 - field9024;
                if (arg6 == 0) {
                    field9006 = (arg7 & 0xFF0000) >> 16;
                    field9001 = (arg7 & 0xFF00) >> 8;
                    field9021 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field9003 = arg7 >>> 24;
                    field9018 = 256 - field9003;
                    int var11 = (arg7 & 0xFF00FF) * field9018 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field9018 & 0xFF0000;
                    field9004 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method499(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method499(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method499(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method499(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "()I", line = 327)
    public final int method167() {
        return this.field9005;
    }

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "()I", line = 331)
    public final int method162() {
        return this.field9009;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lnga;II)V", line = 361)
    public class640(class578 arg0, int arg1, int arg2) {
        this.field8996 = arg0;
        this.field9005 = arg1;
        this.field9009 = arg2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILua;II)V")
    public abstract void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qp", name = "V", descriptor = "(IIIII)V")
    public abstract void method155(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([I[III)V")
    public abstract void method498(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qp", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)V")
    public abstract void method499(int arg0, int arg1);
}
