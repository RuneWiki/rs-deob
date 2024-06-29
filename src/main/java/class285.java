import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class285 extends class11 {

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Ls;")
    public class154 field4010;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    private static int field4009 = 0;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field4007 = 0;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    private static int field4000 = 0;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field4016 = 0;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    public static int field4013 = 0;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    private static int field3994;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    private static int field3995;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    private static int field3997;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    private static int field4014;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "[I")
    private int[] field3991;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "()I")
    public final int method52() {
        return this.field4002 + this.field3999 + this.field4008;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([I[III)V")
    public abstract void method82(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)V")
    public abstract void method81(int arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method43(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4010.method923()) {
            throw new IllegalStateException();
        }
        this.method1815(arg0, arg1, arg2, arg3, arg4, arg5);
        field4004 = arg7;
        if (arg6 != 0) {
            field4016 = arg7 >>> 24;
            field4003 = 256 - field4016;
            if (arg6 == 1) {
                field4007 = (arg7 & 0xFF0000) >> 16;
                field4013 = (arg7 & 0xFF00) >> 8;
                field4017 = arg7 & 0xFF;
            } else {
                field4000 = arg7 >>> 24;
                field4009 = 256 - field4000;
                int var10 = (arg7 & 0xFF00FF) * field4009 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4009 & 0xFF0000;
                field4005 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method81(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method81(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method81(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method81(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method81(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method81(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method81(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method81(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method81(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "()I")
    public final int method47() {
        return this.field3996 + this.field3987 + this.field4012;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
    public abstract void method40(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFFLhm;II)V")
    public final void method53(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class121 arg6, int arg7, int arg8) {
        if (this.field4010.method923()) {
            throw new IllegalStateException();
        }
        this.method1815(arg0, arg1, arg2, arg3, arg4, arg5);
        class295 var10 = (class295) arg6;
        this.method82(var10.field4221, var10.field4222, field4014 - arg7, -arg8 - (field3993 - field3994));
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "()I")
    public final int method51() {
        return this.field3999;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII)V")
    public final void method44(int arg0, int arg1, int arg2, int arg3) {
        this.field4002 = arg0;
        this.field3987 = arg1;
        this.field4008 = arg2;
        this.field4012 = arg3;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ls;II)V")
    public class285(class154 arg0, int arg1, int arg2) {
        this.field4010 = arg0;
        this.field3999 = arg1;
        this.field3996 = arg2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIII)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4010.method923()) {
            throw new IllegalStateException();
        }
        if (this.field3991 == null) {
            this.field3991 = new int[4];
        }
        this.field4010.method1004(this.field3991);
        this.field4010.method1010(this.field4010.field2191, this.field4010.field2179, arg0 + arg2, arg1 + arg3);
        int var8 = this.method52();
        int var9 = this.method47();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method40(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4010.method968(this.field3991[0], this.field3991[1], this.field3991[2], this.field3991[3]);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "()I")
    public final int method49() {
        return this.field3996;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IILhm;II)V")
    public abstract void method45(int arg0, int arg1, class121 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(FFFFFF)V")
    private final void method1815(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4002 + this.field3999 + this.field4008;
        int var8 = this.field3996 + this.field3987 + this.field4012;
        if (this.field3999 != var7 || this.field3996 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3987 * var11;
            float var14 = (float) this.field3987 * var12;
            float var15 = (float) this.field4002 * var9;
            float var16 = (float) this.field4002 * var10;
            float var17 = (float) this.field4008 * -var9;
            float var18 = (float) this.field4008 * -var10;
            float var19 = (float) this.field4012 * -var11;
            float var20 = (float) this.field4012 * -var12;
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
        if (var23 < (float) this.field4010.field2191) {
            var23 = (float) this.field4010.field2191;
        }
        if (var24 > (float) this.field4010.field2165) {
            var24 = (float) this.field4010.field2165;
        }
        if (var25 < (float) this.field4010.field2179) {
            var25 = (float) this.field4010.field2179;
        }
        if (var26 > (float) this.field4010.field2182) {
            var26 = (float) this.field4010.field2182;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4011 = this.field4010.field2163;
        field4018 = (int) ((float) ((int) var25 * field4011) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4019 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3999 / var29);
        field3990 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3996 / var30);
        field4015 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3999 / var30);
        field4001 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3996 / var29);
        field3995 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3997 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3988 = (this.field3999 >> 1 << 12) + (field4015 * field3997 >> 4);
        field3989 = (this.field3996 >> 1 << 12) + (field4001 * field3997 >> 4);
        field3998 = field4019 * field3995 >> 4;
        field4006 = field3995 * field3990 >> 4;
        field4014 = (int) var23;
        field3992 = (int) var27;
        field3994 = (int) var25;
        field3993 = (int) var28;
    }
}
