import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class class211 extends class529 {

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lra;")
    public class70 field2989;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field2997 = 0;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    private static int field3006 = 0;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field2999 = 0;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    private static int field2995 = 0;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    private static int field2991;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    private static int field2993;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    private static int field3011;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    private static int field3013;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "[I")
    private int[] field3010;

    @OriginalMember(owner = "client!fp", name = "aa", descriptor = "(FFFFFFIII)V", line = 6)
    public final void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2989.method445()) {
            throw new IllegalStateException();
        }
        this.method1276(arg0, arg1, arg2, arg3, arg4, arg5);
        field3005 = arg7;
        if (arg6 != 1) {
            field3004 = arg7 >>> 24;
            field2999 = 256 - field3004;
            if (arg6 == 0) {
                field2997 = (arg7 & 0xFF0000) >> 16;
                field2994 = (arg7 & 0xFF00) >> 8;
                field3017 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field3006 = arg7 >>> 24;
                field2995 = 256 - field3006;
                int var10 = (arg7 & 0xFF00FF) * field2995 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field2995 & 0xFF0000;
                field3000 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1024(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1024(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1024(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1024(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1024(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1024(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method1024(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1024(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1024(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1024(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1024(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1024(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "JA", descriptor = "()I", line = 109)
    public final int method121() {
        return this.field3001 + this.field2987 + this.field3016;
    }

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "(IIIIIII)V", line = 123)
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2989.method445()) {
            throw new IllegalStateException();
        }
        if (this.field3010 == null) {
            this.field3010 = new int[4];
        }
        this.field2989.method514(this.field3010);
        this.field2989.method516(this.field2989.field1037, this.field2989.field1014, arg0 + arg2, arg1 + arg3);
        int var8 = this.method126();
        int var9 = this.method121();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method130(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2989.method462(this.field3010[0], this.field3010[1], this.field3010[2], this.field3010[3]);
    }

    @OriginalMember(owner = "client!fp", name = "qa", descriptor = "()I", line = 163)
    public final int method129() {
        return this.field2987;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(FFFFFFLea;II)V", line = 176)
    public final void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class382 arg6, int arg7, int arg8) {
        if (this.field2989.method445()) {
            throw new IllegalStateException();
        }
        this.method1276(arg0, arg1, arg2, arg3, arg4, arg5);
        class368 var10 = (class368) arg6;
        this.method1025(var10.field5171, var10.field5170, field3013 - arg7, -arg8 - (field2986 - field3011));
    }

    @OriginalMember(owner = "client!fp", name = "UA", descriptor = "()I", line = 190)
    public final int method125() {
        return this.field3014;
    }

    @OriginalMember(owner = "client!fp", name = "ka", descriptor = "(IIII)V", line = 201)
    public final void method118(int arg0, int arg1, int arg2, int arg3) {
        this.field3007 = arg0;
        this.field3001 = arg1;
        this.field3002 = arg2;
        this.field3016 = arg3;
    }

    @OriginalMember(owner = "client!fp", name = "ja", descriptor = "()I", line = 211)
    public final int method126() {
        return this.field3014 + this.field3007 + this.field3002;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lra;II)V", line = 220)
    public class211(class70 arg0, int arg1, int arg2) {
        this.field2989 = arg0;
        this.field3014 = arg1;
        this.field2987 = arg2;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(FFFFFF)V", line = 237)
    private final void method1276(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3014 + this.field3007 + this.field3002;
        int var8 = this.field3001 + this.field2987 + this.field3016;
        if (this.field3014 != var7 || this.field2987 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3001 * var11;
            float var14 = (float) this.field3001 * var12;
            float var15 = (float) this.field3007 * var9;
            float var16 = (float) this.field3007 * var10;
            float var17 = (float) this.field3002 * -var9;
            float var18 = (float) this.field3002 * -var10;
            float var19 = (float) this.field3016 * -var11;
            float var20 = (float) this.field3016 * -var12;
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
        if (var23 < (float) this.field2989.field1037) {
            var23 = this.field2989.field1037;
        }
        if (var24 > (float) this.field2989.field1013) {
            var24 = this.field2989.field1013;
        }
        if (var25 < (float) this.field2989.field1014) {
            var25 = this.field2989.field1014;
        }
        if (var26 > (float) this.field2989.field1051) {
            var26 = this.field2989.field1051;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field2990 = this.field2989.field1047;
        field2985 = (int) ((float) ((int) var25 * field2990) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3009 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3014 / var29);
        field2996 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2987 / var30);
        field2998 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3014 / var30);
        field3003 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2987 / var29);
        field2993 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2991 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2988 = (this.field3014 >> 1 << 12) + (field2998 * field2991 >> 4);
        field3015 = (this.field2987 >> 1 << 12) + (field3003 * field2991 >> 4);
        field2992 = field3009 * field2993 >> 4;
        field3008 = field2996 * field2993 >> 4;
        field3013 = (int) var23;
        field3012 = (int) var27;
        field3011 = (int) var25;
        field2986 = (int) var28;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V")
    public abstract void method1024(int arg0, int arg1);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([I[III)V")
    public abstract void method1025(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILea;II)V")
    public abstract void method122(int arg0, int arg1, class382 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fp", name = "YA", descriptor = "(IIIII)V")
    public abstract void method130(int arg0, int arg1, int arg2, int arg3, int arg4);
}
