import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class361 extends class16 {

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Lbc;")
    public class246 field5034;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    private static int field5010 = 0;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field5015 = 0;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field5029 = 0;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field5021 = 0;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field5031 = 0;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field5025 = 0;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    private static int field5030 = 0;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field5022 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    private static int field5003;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field5011;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    private static int field5012;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field5020;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public int field5026;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    private static int field5027;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    private static int field5035;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "[I")
    private int[] field5024;

    @OriginalMember(owner = "client!sf", name = "ma", descriptor = "()I")
    public final int method126() {
        return this.field5007;
    }

    @OriginalMember(owner = "client!sf", name = "la", descriptor = "()I")
    public final int method110() {
        return this.field5032;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method116(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        if (this.field5034.method1617()) {
            throw new IllegalStateException();
        }
        this.method2163(arg0, arg1, arg2, arg3, arg4, arg5);
        class394 var10 = (class394) arg6;
        this.method491(var10.field5792, var10.field5791, field5035 - arg7, -arg8 - (field5004 - field5012));
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFF)V")
    private final void method2163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5032 + this.field5020 + this.field5018;
        int var8 = this.field5011 + this.field5007 + this.field5026;
        if (this.field5032 != var7 || this.field5007 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5011 * var11;
            float var14 = (float) this.field5011 * var12;
            float var15 = (float) this.field5020 * var9;
            float var16 = (float) this.field5020 * var10;
            float var17 = (float) this.field5018 * -var9;
            float var18 = (float) this.field5018 * -var10;
            float var19 = (float) this.field5026 * -var11;
            float var20 = (float) this.field5026 * -var12;
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
        if (var23 < (float) this.field5034.field3658) {
            var23 = this.field5034.field3658;
        }
        if (var24 > (float) this.field5034.field3620) {
            var24 = this.field5034.field3620;
        }
        if (var25 < (float) this.field5034.field3651) {
            var25 = this.field5034.field3651;
        }
        if (var26 > (float) this.field5034.field3644) {
            var26 = this.field5034.field3644;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field5017 = this.field5034.field3660;
        field5019 = (int) ((float) ((int) var25 * field5017) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5016 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5032 / var29);
        field5028 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5007 / var30);
        field5033 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5032 / var30);
        field5013 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5007 / var29);
        field5003 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5027 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5008 = (this.field5032 >> 1 << 12) + (field5033 * field5027 >> 4);
        field5009 = (this.field5007 >> 1 << 12) + (field5027 * field5013 >> 4);
        field5006 = field5016 * field5003 >> 4;
        field5005 = field5028 * field5003 >> 4;
        field5035 = (int) var23;
        field5014 = (int) var27;
        field5012 = (int) var25;
        field5004 = (int) var28;
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "()I")
    public final int method125() {
        return this.field5032 + this.field5020 + this.field5018;
    }

    @OriginalMember(owner = "client!sf", name = "MA", descriptor = "(IIII)V")
    public final void method113(int arg0, int arg1, int arg2, int arg3) {
        this.field5020 = arg0;
        this.field5011 = arg1;
        this.field5018 = arg2;
        this.field5026 = arg3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
    public abstract void method492(int arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "(IIIII)V")
    public abstract void method114(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILma;II)V")
    public abstract void method128(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "()I")
    public final int method117() {
        return this.field5011 + this.field5007 + this.field5026;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method115(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5034.method1617()) {
            throw new IllegalStateException();
        }
        this.method2163(arg0, arg1, arg2, arg3, arg4, arg5);
        field5023 = arg7;
        if (arg6 != 1) {
            field5025 = arg7 >>> 24;
            field5022 = 256 - field5025;
            if (arg6 == 0) {
                field5029 = (arg7 & 0xFF0000) >> 16;
                field5031 = (arg7 & 0xFF00) >> 8;
                field5021 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field5010 = arg7 >>> 24;
                field5030 = 256 - field5010;
                int var10 = (arg7 & 0xFF00FF) * field5030 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field5030 & 0xFF0000;
                field5015 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method492(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method492(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method492(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method492(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method492(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method492(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method492(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method492(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method492(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method492(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method492(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method492(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "JA", descriptor = "(IIIIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5034.method1617()) {
            throw new IllegalStateException();
        }
        if (this.field5024 == null) {
            this.field5024 = new int[4];
        }
        this.field5034.method332(this.field5024);
        this.field5034.method306(this.field5034.field3658, this.field5034.field3651, arg0 + arg2, arg1 + arg3);
        int var8 = this.method125();
        int var9 = this.method117();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method114(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5034.method380(this.field5024[0], this.field5024[1], this.field5024[2], this.field5024[3]);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbc;II)V")
    public class361(class246 arg0, int arg1, int arg2) {
        this.field5034 = arg0;
        this.field5032 = arg1;
        this.field5007 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([I[III)V")
    public abstract void method491(int[] arg0, int[] arg1, int arg2, int arg3);
}
