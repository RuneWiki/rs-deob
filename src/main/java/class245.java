import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class245 extends class139 {

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "Lf;")
    public class195 field3982;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field3993 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field3991 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private static int field3995 = 0;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    private static int field3970 = 0;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field3996 = 0;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    private static int field3975;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    private static int field3976;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    private static int field3983;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    private static int field3988;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
    private int[] field3978;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "(IIIII)V")
    public abstract void method620(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFF)V")
    private final void method1704(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3981 + this.field3966 + this.field3977;
        int var8 = this.field3994 + this.field3992 + this.field3973;
        if (this.field3966 != var7 || this.field3992 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3994 * var11;
            float var14 = (float) this.field3994 * var12;
            float var15 = (float) this.field3981 * var9;
            float var16 = (float) this.field3981 * var10;
            float var17 = (float) this.field3977 * -var9;
            float var18 = (float) this.field3977 * -var10;
            float var19 = (float) this.field3973 * -var11;
            float var20 = (float) this.field3973 * -var12;
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
        if (var23 < (float) this.field3982.field2914) {
            var23 = this.field3982.field2914;
        }
        if (var24 > (float) this.field3982.field2942) {
            var24 = this.field3982.field2942;
        }
        if (var25 < (float) this.field3982.field2919) {
            var25 = this.field3982.field2919;
        }
        if (var26 > (float) this.field3982.field2916) {
            var26 = this.field3982.field2916;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field3985 = this.field3982.field2950;
        field3989 = (int) ((float) ((int) var25 * field3985) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3990 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3966 / var29);
        field3965 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3992 / var30);
        field3980 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3966 / var30);
        field3972 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3992 / var29);
        field3983 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3975 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3968 = (this.field3966 >> 1 << 12) + (field3980 * field3975 >> 4);
        field3967 = (this.field3992 >> 1 << 12) + (field3975 * field3972 >> 4);
        field3969 = field3990 * field3983 >> 4;
        field3986 = field3983 * field3965 >> 4;
        field3988 = (int) var23;
        field3971 = (int) var27;
        field3976 = (int) var25;
        field3987 = (int) var28;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([I[III)V")
    public abstract void method966(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cl", name = "la", descriptor = "(IIIIIII)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3982.method1229()) {
            throw new IllegalStateException();
        }
        if (this.field3978 == null) {
            this.field3978 = new int[4];
        }
        this.field3982.method1237(this.field3978);
        this.field3982.method1290(this.field3982.field2914, this.field3982.field2919, arg0 + arg2, arg1 + arg3);
        int var8 = this.method623();
        int var9 = this.method618();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method620(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3982.method1307(this.field3978[0], this.field3978[1], this.field3978[2], this.field3978[3]);
    }

    @OriginalMember(owner = "client!cl", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cl", name = "ha", descriptor = "(IIII)V")
    public final void method627(int arg0, int arg1, int arg2, int arg3) {
        this.field3981 = arg0;
        this.field3994 = arg1;
        this.field3977 = arg2;
        this.field3973 = arg3;
    }

    @OriginalMember(owner = "client!cl", name = "ZA", descriptor = "()I")
    public final int method622() {
        return this.field3992;
    }

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3982.method1229()) {
            throw new IllegalStateException();
        }
        this.method1704(arg0, arg1, arg2, arg3, arg4, arg5);
        field3979 = arg7;
        if (arg6 != 1) {
            field3993 = arg7 >>> 24;
            field3964 = 256 - field3993;
            if (arg6 == 0) {
                field3974 = (arg7 & 0xFF0000) >> 16;
                field3996 = (arg7 & 0xFF00) >> 8;
                field3991 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field3970 = arg7 >>> 24;
                field3995 = 256 - field3970;
                int var10 = (arg7 & 0xFF00FF) * field3995 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field3995 & 0xFF0000;
                field3984 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method967(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method967(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method967(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method967(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method967(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method967(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method967(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method967(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method967(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method967(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method967(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method967(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method629(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8) {
        if (this.field3982.method1229()) {
            throw new IllegalStateException();
        }
        this.method1704(arg0, arg1, arg2, arg3, arg4, arg5);
        class396 var10 = (class396) arg6;
        this.method966(var10.field5990, var10.field5989, field3988 - arg7, -arg8 - (field3987 - field3976));
    }

    @OriginalMember(owner = "client!cl", name = "YA", descriptor = "()I")
    public final int method626() {
        return this.field3966;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILta;II)V")
    public abstract void method632(int arg0, int arg1, class453 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public abstract void method967(int arg0, int arg1);

    @OriginalMember(owner = "client!cl", name = "RA", descriptor = "()I")
    public final int method623() {
        return this.field3981 + this.field3966 + this.field3977;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lf;II)V")
    public class245(class195 arg0, int arg1, int arg2) {
        this.field3982 = arg0;
        this.field3966 = arg1;
        this.field3992 = arg2;
    }

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "()I")
    public final int method618() {
        return this.field3994 + this.field3992 + this.field3973;
    }
}
